<template>
  <div class="checkbox">
    <input type="checkbox" class="custom-checkbox" :id="check.id" :class="check.class" :name="check.name">
    <label :for="check.id">
      <slot></slot>
      <a href="#"><span><slot name="mark"></slot></span></a>
    </label>
  </div>
</template>

<script lang="ts">


import {defineComponent} from "vue";

export default defineComponent({
  name: "AppCheckbox",
  props: {
    check: {
      type: Object,
      required: true
    }
  }
})
</script>

<style lang="scss">

.checkbox {
  margin-bottom: 8px;
  /* для элемента input c type="checkbox" */
  .custom-checkbox {
    position: absolute;
    z-index: -1;
    opacity: 0;
  }

  /* для элемента label, связанного с .custom-checkbox */
  .custom-checkbox + label {
    display: inline-flex;
    justify-content: center;
    align-items: center;
    user-select: none;
    cursor: pointer;
  }

  /* создание в label псевдоэлемента before со следующими стилями */
  .custom-checkbox + label::before {
    content: '';
    display: inline-block;
    width: 1em;
    height: 1em;
    flex-shrink: 0;
    flex-grow: 0;
    border: 1px solid #adb5bd;
    border-radius: 0.25em;
    margin-right: 0.5em;
    background-repeat: no-repeat;
    background-position: center center;
    background-size: 50% 50%;
  }

  /* стили при наведении курсора на checkbox */
  .custom-checkbox:not(:disabled):not(:checked) + label:hover::before {
    border-color: #b3d7ff;
  }

  /* стили для активного чекбокса (при нажатии на него) */
  .custom-checkbox:not(:disabled):active + label::before {
    background-color: #b3d7ff;
    border-color: #b3d7ff;
  }

  /* стили для чекбокса, находящегося в фокусе */
  .custom-checkbox:focus + label::before {
    box-shadow: 0 0 0 0.2rem rgba(0, 123, 255, 0.25);
  }

  /* стили для чекбокса, находящегося в фокусе и не находящегося в состоянии checked */
  .custom-checkbox:focus:not(:checked) + label::before {
    border-color: #80bdff;
  }

  /* стили для чекбокса, находящегося в состоянии checked */
  .custom-checkbox:checked + label::before {
    border-color: var(--blueRegular);
    background-color: var(--blueRegular);
    background-image: url("data:image/svg+xml,%3csvg xmlns='http://www.w3.org/2000/svg' viewBox='0 0 8 8'%3e%3cpath fill='%23fff' d='M6.564.75l-3.59 3.612-1.538-1.55L0 4.26 2.974 7.25 8 2.193z'/%3e%3c/svg%3e");
  }

  /* стили для чекбокса, находящегося в состоянии disabled */
  .custom-checkbox:disabled + label::before {
    background-color: #e9ecef;
  }

  label {
    margin-top: 0;

    a {
      text-decoration: none;
      margin-left: 8px;
      color: var(--blueRegular);

      span {
        text-transform: uppercase;
        color: var(--darkGreen);
        font-weight: 900;
        font-size: 14px;
        cursor: pointer;
      }

      &:hover {
        text-decoration: underline;
      }
    }
  }
}
</style>