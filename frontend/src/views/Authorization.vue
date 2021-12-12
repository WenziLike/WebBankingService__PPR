<template>
  <transition class="slide-fade">
    <section class="login" v-if="show">
      <div class="login__form">
        <form action="#" @submit.prevent="signIn" class="form">
          <h2>Welcome</h2>
          <div v-for="field in fieldsLogin">
            <label>
              <span>{{ field.label }}</span>
              <input
                  type="text"
                  v-model="field.value"
              />
            </label>
            <label>
              <span>Password</span>
              <input :type="passwordFieldType" v-model="password">
              <button type="button" @click="switchVisibility">
                <AppIcon :name="showPassValue"/>
              </button>
            </label>
          </div>
          <div class="block">
            <a href="#" class="forgot-pass">Forgot password?</a>
            <!--=========  REMEMBER ME-->
            <AppCheckbox :check="rememberMe">
              Remember Me
            </AppCheckbox>
          </div>
          <AppButton>
            <template v-slot:title>Sign In</template>
          </AppButton>
        </form>
      </div>
      <div class="login__box">
        <img src="../assets/img/form-signin.jpg" alt="bgr">
        <AppButton @click="show = !show">
          <template v-slot:title>Sign Up</template>
        </AppButton>
      </div>
    </section>
  </transition>

  <transition class="slide-fade">
    <section class="register" v-if="!show">
      <div class="register__box">
        <img src="../assets/img/form_signup.jpg" alt="bgr">
        <AppButton @click="show = !show">
          <template v-slot:title>Sign In</template>
        </AppButton>
      </div>
      <div class="register__form">
        <form @submit.prevent="signUp" class="form">
          <h2>We are glad that you are joining us!!!</h2>
          <div v-for="(fieldKeys, step) in steps">
            <div v-if="currentStep === step">
              <div v-for="field in fieldKeys">
                <label>
                  <span>{{ fieldsRegister[field].label }}</span>
                  <input
                      class=""
                      type="text"
                      v-model="fieldsRegister[field].value"
                  />
                </label>
              </div>
              <AppButton @click.prevent="previousStep" v-if="!isFirstStep">
                <template v-slot:title>Previous Step</template>
              </AppButton>
              <AppButton @click="nextStep" v-if="!isLastStep">
                <template v-slot:title>Next</template>
              </AppButton>
              <AppButton v-if="isLastStep">
                <template v-slot:title>Send</template>
              </AppButton>
            </div>
          </div>
        </form>
      </div>
    </section>
  </transition>
</template>

<script lang="ts">
import {defineComponent} from "vue";
import AppButton from "@/components/AppButton.vue";
import AppIcon from "@/components/svg/AppIcon.vue";
import AppCheckbox from "@/components/AppCheckBox.vue";

interface State {
  rememberMe: Object,
  password: string,
  passwordFieldType: string,
  showPass: boolean,
  show: boolean,
  showPassValue: string,
  submitted: boolean,
  currentStep: number,
  steps: Array<Array<string>>,
  fieldsRegister: Object,
  fieldsLogin: Object


}

export default defineComponent({
  name: "authorization",
  components: {AppButton, AppIcon, AppCheckbox},
  data: (): State => {
    return {
      rememberMe: {
        id: 'remember',
        class: ['remember-me'],
        name: "remember-me"
      },
      password: '',
      passwordFieldType: 'password',
      showPass: false,
      show: true,
      showPassValue: 'icon-show-pass-off',
      submitted: false,
      currentStep: 0,
      steps: [
        ['firstName', 'lastName'],
        ['phoneNumber', 'email'],
        ['idPerson', 'nationality'],
        ['address', 'city'],
        ['password', 'confirmPassword']
      ],
      fieldsRegister: {
        firstName: {
          label: 'First Name',
          value: '',
        },
        lastName: {
          label: 'Last Name',
          value: '',
        },
        phoneNumber: {
          label: 'Phone Number',
          value: '',
        },
        email: {
          label: 'E-mail',
          value: '',
        },
        idPerson: {
          label: 'ID person',
          value: '',
        },
        nationality: {
          label: 'Nationality',
          value: ''
        },
        address: {
          label: 'Address',
          value: '',
        },
        city: {
          label: 'City',
          value: '',
        },
        password: {
          label: 'Password',
          value: '',
        },
        confirmPassword: {
          label: 'Confirm Password',
          value: '',
        }
      },
      fieldsLogin: {
        email: {
          label: 'E-mail',
          value: '',
        }
      }
    }
  },
  methods: {
    switchVisibility() {
      this.showPassValue = this.showPassValue === 'icon-show-pass-on' ? 'icon-show-pass-off' : 'icon-show-pass-on'
      this.passwordFieldType = this.passwordFieldType === 'password' ? 'text' : 'password'
    },
    previousStep() {
      this.currentStep--;
    },
    nextStep() {
      this.currentStep++;
    },
    signIn() {
      console.log("sign in", this.fieldsLogin);
      this.submitted = true;
      this.$emit("sub", this.fieldsLogin)

    },
    signUp() {
      console.log("doing submit", this.fieldsRegister);
      this.submitted = true;
      this.$emit("sub", this.fieldsRegister)
    }
  },
  computed: {
    totalSteps() {
      return this.steps.length;
    },
    isFirstStep() {
      return this.currentStep === 0;
    },
    isLastStep() {
      return this.currentStep === this.totalSteps - 1;
    }
  }
})
</script>

<style lang="scss">
.slide-fade-enter-active {
  transition: all 0.9s ease-out;
}

.slide-fade-leave-active {
  transition: all .8s cubic-bezier(1.0, 0.5, 0.8, 1.0);
}

.slide-fade-enter-from,
.slide-fade-leave-to {
  transform: translateX(20px);
  opacity: 0;
}

.register {
  min-height: 100vh;
  width: 100%;
  display: flex;
  justify-content: space-between;
  align-items: center;
  text-align: center;
  background: var(--white);

  &__form {
    display: flex;
    justify-content: center;
    align-items: center;
    width: 50%;
    /*============== todo   Forms*/
    .form {
      position: relative;
      max-width: 500px;

      h2 {
        margin: 20px 0;
        color: var(--colorText2);
      }

      label {
        position: relative;
        width: 260px;
        text-align: center;
        margin: 20px auto;

        span {
          font-weight: 300;
          font-size: 18px;
          color: #b9b9b9;
          text-transform: uppercase;
        }

        input {
          display: block;
          width: 300px;
          height: 30px;
          margin: 5px auto 20px;
          padding-bottom: 5px;
          font-size: 16px;
          text-align: center;
          color: var(--colorText2);
          font-weight: 900;
          border-bottom: solid 1px lightslategray;
        }
      }

      .block {
        position: relative;

        .forgot-pass {
          color: #495A72;
        }

        .checkbox {
          label {
            margin-top: 15px;
            color: #495A72;
          }
        }
      }

      .icon-show-pass-off, .icon-show-pass-on {
        position: absolute;
        top: 30px;
        right: -146px;
        cursor: pointer;
        color: var(--text);
      }

      .icon-show-pass-on {
        color: var(--darkBlue);
      }

      .button {
        margin-left: 10px;
      }
    }
  }

  &__box {
    display: flex;
    justify-content: center;
    align-items: center;
    min-height: 100vh;
    width: 50%;
    position: relative;

    &:after {
      content: '';
      position: absolute;
      top: 0;
      left: 0;
      right: 0;
      bottom: 0;
      background: rgba(0, 0, 0, .2);
    }

    img {
      position: absolute;
      top: 0;
      left: 0;
      width: 100%;
      height: 100vh;
    }

    a {
      position: absolute;
      z-index: 6;
    }
  }
}

.login {
  min-height: 100vh;
  width: 100%;
  display: flex;
  justify-content: space-between;
  align-items: center;
  text-align: center;
  background: white;

  &__form {
    display: flex;
    justify-content: center;
    align-items: center;
    width: 50%;
    /*============== todo   Forms*/
    .form {
      position: relative;
      max-width: 500px;

      h2 {
        margin: 20px 0;
        color: var(--colorText2);
      }

      label {
        position: relative;
        width: 260px;
        text-align: center;
        margin: 20px auto;

        span {
          font-weight: 300;
          font-size: 18px;
          color: #b9b9b9;
          text-transform: uppercase;
        }

        input {
          display: block;
          width: 300px;
          height: 30px;
          margin: 5px auto 20px;
          padding-bottom: 5px;
          font-size: 16px;
          text-align: center;
          color: var(--colorText2);
          font-weight: 900;
          border-bottom: solid 1px lightslategray;
        }
      }

      .block {
        position: relative;

        .forgot-pass {
          color: #495A72;
        }

        .checkbox {
          label {
            margin-top: 15px;
            color: #495A72;
          }
        }
      }

      .icon-show-pass-off, .icon-show-pass-on {
        position: absolute;
        top: 30px;
        right: -146px;
        cursor: pointer;
        color: var(--text);
      }

      .icon-show-pass-on {
        color: var(--darkBlue);
      }
    }
  }

  &__box {
    display: flex;
    justify-content: center;
    align-items: center;
    min-height: 100vh;
    width: 50%;
    position: relative;

    &:after {
      content: '';
      position: absolute;
      top: 0;
      left: 0;
      right: 0;
      bottom: 0;
      background: rgba(0, 0, 0, .2);
    }

    img {
      position: absolute;
      top: 0;
      left: 0;
      width: 100%;
      height: 100vh;
    }

    a {
      position: absolute;
      z-index: 6;
    }
  }
}

</style>