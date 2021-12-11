<template>
  <div class="thank__you">
    <h2>Thank You !!!</h2>
    <p>Hey , thanks for registration!</p>
    <hr>
  </div>
  <!--  <div v-if="submitted">-->
  <!--    <h2>nooo</h2>-->
  <!--    &lt;!&ndash;move form steps/fields in here&ndash;&gt;-->
  <!--    &lt;!&ndash;move form buttons in here&ndash;&gt;-->
  <!--  </div>-->
  <!--  &lt;!&ndash;Success Page&ndash;&gt;-->
  <!--  <div v-else>-->
  <!--    <h3>-->
  <!--      Hey {{ fields.name.value }}, thanks for registration!-->
  <!--    </h3>-->
  <!--  </div>-->
</template>

<script lang="ts">
import {defineComponent} from "vue";

export default defineComponent({
  name: "thankYou",
  props: {
    submitted: {
      type: Boolean,
      required: true
    },
    fields: {
      type: Object,
      required: true
    }
  }
})
</script>

<style lang="scss" scoped>
.thank__you {
  display: flex;
  align-items: center;
  justify-content: center;
  min-height: 100vh;
  color: white;
  background-color: #3D4451;

  h2 {
    font-size: 56px;
  }

  p {
    font-size: 18px;
    font-weight: 500;
  }
}
</style>