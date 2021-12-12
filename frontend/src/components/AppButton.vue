<template>
  <button type="submit" class="button">
    <slot name="title"></slot>
  </button>
</template>

<script lang="ts">

import {defineComponent} from "vue"

export default defineComponent({
  name: "appButton",
})
</script>

<style lang="scss">

.button {
  position: relative;
  z-index: 2;
  cursor: pointer;
  min-width: 200px;
  padding: 15px 5px;
  text-transform: uppercase;
  vertical-align: middle;
  background: #000428; /* fallback for old browsers */
  background: -webkit-linear-gradient(to bottom, #004e92, #000428); /* Chrome 10-25, Safari 5.1-6 */
  background: linear-gradient(to bottom, #004e92, #000428); /* W3C, IE 10+/ Edge, Firefox 16+, Chrome 26+, Opera 12+, Safari 7+ */
  border: none;
  color: var(--white);
  font-weight: 600;
  border-radius: 5px;
  box-shadow: 0 0 10px var(--white);
  transition: all 1s;

  letter-spacing: 1.5px;

  &:hover {
    box-shadow: 0 0 25px #009EE3FF;
  }

  &:focus {
    outline: none;
  }
}
</style>