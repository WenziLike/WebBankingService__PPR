<template>

  <!--  ================ TODO: SHOW PASSWORD  OFF -->
  <svg v-if="name==='icon-show-pass-off'" class="icon-show-pass-off" xmlns="http://www.w3.org/2000/svg"
       xmlns:xlink="http://www.w3.org/1999/xlink"
       version="1.1" width="24" height="24"
       viewBox="0 0 24 24">
    <path style="fill: currentcolor;"
          d="M2,5.27L3.28,4L20,20.72L18.73,22L15.65,18.92C14.5,19.3 13.28,19.5 12,19.5C7,19.5 2.73,16.39 1,12C1.69,10.24 2.79,8.69 4.19,7.46L2,5.27M12,9A3,3 0 0,1 15,12C15,12.35 14.94,12.69 14.83,13L11,9.17C11.31,9.06 11.65,9 12,9M12,4.5C17,4.5 21.27,7.61 23,12C22.18,14.08 20.79,15.88 19,17.19L17.58,15.76C18.94,14.82 20.06,13.54 20.82,12C19.17,8.64 15.76,6.5 12,6.5C10.91,6.5 9.84,6.68 8.84,7L7.3,5.47C8.74,4.85 10.33,4.5 12,4.5M3.18,12C4.83,15.36 8.24,17.5 12,17.5C12.69,17.5 13.37,17.43 14,17.29L11.72,15C10.29,14.85 9.15,13.71 9,12.28L5.6,8.87C4.61,9.72 3.78,10.78 3.18,12Z"/>
  </svg>
  <!--  ================ TODO: SHOW PASSWORD  ON -->

  <svg v-if="name==='icon-show-pass-on'" class="icon-show-pass-on" xmlns="http://www.w3.org/2000/svg"
       xmlns:xlink="http://www.w3.org/1999/xlink" version="1.1" width="24" height="24"
       viewBox="0 0 24 24">
    <path style="fill: currentcolor;"
          d="M12,9A3,3 0 0,1 15,12A3,3 0 0,1 12,15A3,3 0 0,1 9,12A3,3 0 0,1 12,9M12,4.5C17,4.5 21.27,7.61 23,12C21.27,16.39 17,19.5 12,19.5C7,19.5 2.73,16.39 1,12C2.73,7.61 7,4.5 12,4.5M3.18,12C4.83,15.36 8.24,17.5 12,17.5C15.76,17.5 19.17,15.36 20.82,12C19.17,8.64 15.76,6.5 12,6.5C8.24,6.5 4.83,8.64 3.18,12Z"/>
  </svg>

  <!--  ================  TODO: ARROW -->
  <svg v-if="name==='icon-arrow-down'" width="54" height="54"  viewBox="0 0 24 24" role="presentation"
       class="home__arrow-down">
    <path d="M7.41,15.41L12,10.83L16.59,15.41L18,14L12,8L6,14L7.41,15.41Z" style="fill: currentcolor;"></path>
  </svg>

  <!--  ================  TODO: CHAT -->
  <svg v-if="name==='chat'" width="54" height="54" class="icon icon_chat" style="fill: currentcolor;" viewBox="0 0 24 24" xmlns="http://www.w3.org/2000/svg">
    <title/>
    <path
        d="M12.5,3A9.51,9.51,0,0,0,3,12.5a9.39,9.39,0,0,0,2.44,6.35l-2.29,2.3a.47.47,0,0,0-.11.54A.5.5,0,0,0,3.5,22h9a9.5,9.5,0,0,0,0-19Zm-4,11.5a1,1,0,1,1,1-1A1,1,0,0,1,8.5,14.5Zm4,0a1,1,0,1,1,1-1A1,1,0,0,1,12.5,14.5Zm4,0a1,1,0,1,1,1-1A1,1,0,0,1,16.5,14.5Z"/>
  </svg>

  <!--  ================  TODO: HELP -->
  <svg v-if="name==='help'" width="54" height="54" class="icon icon_help" style="fill: currentcolor;" id="Layer_1"  version="1.1"
       viewBox="0 0 512 512"
       xml:space="preserve" xmlns="http://www.w3.org/2000/svg" xmlns:xlink="http://www.w3.org/1999/xlink"><g>
    <path
        d="M345.1,77.1C317.6,56.2,286.6,49,247.3,49c-29.8,0-55.3,6.1-75.5,19.7C142,89,128,123.1,128,177h76.8   c0-14.4-1.4-29.9,7-43.2c8.4-13.3,20.1-23.5,40.2-23.5c20.4,0,30.9,5.9,40.8,18.1c8.4,10.4,11.6,22.8,11.6,36   c0,11.4-5.8,21.9-12.7,31.4c-3.8,5.6-8.8,10.6-15.1,15.4c0,0-41.5,24.7-56.1,48.1c-10.9,17.4-14.8,39.2-15.7,65.3   c-0.1,1.9,0.6,5.8,7.2,5.8c6.5,0,56,0,61.8,0c5.8,0,7-4.4,7.1-6.2c0.4-9.5,1.6-24.1,3.3-29.6c3.3-10.4,9.7-19.5,19.7-27.3   l20.7-14.3c18.7-14.6,33.6-26.5,40.2-35.9c11.3-15.4,19.2-34.4,19.2-56.9C384,123.5,370.5,96.4,345.1,77.1z M242,370.2   c-25.9-0.8-47.3,17.2-48.2,45.3c-0.8,28.2,19.5,46.7,45.5,47.5c27,0.8,47.9-16.6,48.7-44.7C288.8,390.2,269,371,242,370.2z"/>
  </g>
  </svg>

  <!--  ================  TODO: HOME -->
  <svg v-if="name==='home'" width="54" height="54" class="icon icon_home"  style="fill: currentcolor;"  viewBox="0 0 1792 1792" xmlns="http://www.w3.org/2000/svg">
    <path
        d="M1472 992v480q0 26-19 45t-45 19h-384v-384h-256v384h-384q-26 0-45-19t-19-45v-480q0-1 .5-3t.5-3l575-474 575 474q1 2 1 6zm223-69l-62 74q-8 9-21 11h-3q-13 0-21-7l-692-577-692 577q-12 8-24 7-13-2-21-11l-62-74q-8-10-7-23.5t11-21.5l719-599q32-26 76-26t76 26l244 204v-195q0-14 9-23t23-9h192q14 0 23 9t9 23v408l219 182q10 8 11 21.5t-7 23.5z"/>
  </svg>

  <!--  ================  TODO: PASSWORD -->
  <svg v-if="name==='password'" width="54" height="54" class="icon icon_password"  style="fill: currentcolor;" id="Layer_1" version="1.1"
       viewBox="0 0 24 24"
       xml:space="preserve" xmlns="http://www.w3.org/2000/svg" xmlns:xlink="http://www.w3.org/1999/xlink"><path clip-rule="evenodd" d="M20.002,24.001H4.014c-1.104,0-1.998-0.896-1.998-2.001V11.994  c0-1.105,0.895-2.002,1.998-2.002h0.999V6.991c0-3.868,3.132-7.004,6.995-7.004s6.995,3.136,6.995,7.004v3.001h0.999  c1.104,0,1.998,0.896,1.998,2.002V22C22,23.104,21.105,24.001,20.002,24.001z M16.005,6.991c0-2.21-1.79-4.002-3.997-4.002  S8.011,4.781,8.011,6.991v3.001h7.994V6.991z" fill-rule="evenodd"/>
  </svg>

  <!--  ================  TODO: SETTING -->
  <svg v-if="name==='setting'" width="54" height="54" class=" icon icon_setting"  style="fill: currentcolor;" version="1.1"
       viewBox="0 0 24 24" xml:space="preserve"
       xmlns="http://www.w3.org/2000/svg" xmlns:xlink="http://www.w3.org/1999/xlink"><g id="info"/>
    <g id="icons"><path d="M22.2,14.4L21,13.7c-1.3-0.8-1.3-2.7,0-3.5l1.2-0.7c1-0.6,1.3-1.8,0.7-2.7l-1-1.7c-0.6-1-1.8-1.3-2.7-0.7   L18,5.1c-1.3,0.8-3-0.2-3-1.7V2c0-1.1-0.9-2-2-2h-2C9.9,0,9,0.9,9,2v1.3c0,1.5-1.7,2.5-3,1.7L4.8,4.4c-1-0.6-2.2-0.2-2.7,0.7   l-1,1.7C0.6,7.8,0.9,9,1.8,9.6L3,10.3C4.3,11,4.3,13,3,13.7l-1.2,0.7c-1,0.6-1.3,1.8-0.7,2.7l1,1.7c0.6,1,1.8,1.3,2.7,0.7L6,18.9   c1.3-0.8,3,0.2,3,1.7V22c0,1.1,0.9,2,2,2h2c1.1,0,2-0.9,2-2v-1.3c0-1.5,1.7-2.5,3-1.7l1.2,0.7c1,0.6,2.2,0.2,2.7-0.7l1-1.7   C23.4,16.2,23.1,15,22.2,14.4z M12,16c-2.2,0-4-1.8-4-4c0-2.2,1.8-4,4-4s4,1.8,4,4C16,14.2,14.2,16,12,16z" id="settings"/></g>
  </svg>

  <!--  ================  TODO: SIGN OUT -->
  <svg v-if="name==='sign_out'" width="54" height="54" class="icon icon_sign_out"  style="fill: currentcolor;" id="Слой_1" version="1.1" viewBox="0 0 32 32"
       xml:space="preserve" xmlns="http://www.w3.org/2000/svg" xmlns:xlink="http://www.w3.org/1999/xlink"><g id="Sign_Out"><path d="M15,30H2V2h13c0.552,0,1-0.448,1-1s-0.448-1-1-1H1C0.448,0,0,0.448,0,1v30c0,0.552,0.448,1,1,1h14   c0.552,0,1-0.448,1-1S15.552,30,15,30z"/><path
      d="M31.71,15.302l-6.9-6.999c-0.391-0.395-1.024-0.394-1.414,0c-0.391,0.394-0.391,1.034,0,1.428l5.2,5.275   H8.003c-0.552,0-1,0.452-1,1.01c0,0.558,0.448,1.01,1,1.01h20.593l-5.2,5.275c-0.391,0.395-0.391,1.034,0,1.428   c0.391,0.395,1.024,0.395,1.414,0l6.899-6.999C32.095,16.341,32.099,15.69,31.71,15.302z"/></g>
    <g/>
    <g/>
    <g/>
    <g/>
    <g/>
    <g/>
  </svg>

  <!--  ================  TODO: USER -->
  <svg v-if="name==='user'" width="54" height="54" class="icon icon_user"  style="fill: currentcolor;" version="1.1"
       viewBox="0 0 24 24" xml:space="preserve"
       xmlns="http://www.w3.org/2000/svg" xmlns:xlink="http://www.w3.org/1999/xlink"><g id="info"/>
    <g id="icons"><g id="user"><ellipse cx="12" cy="8" rx="5" ry="6"/><path
        d="M21.8,19.1c-0.9-1.8-2.6-3.3-4.8-4.2c-0.6-0.2-1.3-0.2-1.8,0.1c-1,0.6-2,0.9-3.2,0.9s-2.2-0.3-3.2-0.9    C8.3,14.8,7.6,14.7,7,15c-2.2,0.9-3.9,2.4-4.8,4.2C1.5,20.5,2.6,22,4.1,22h15.8C21.4,22,22.5,20.5,21.8,19.1z"/></g></g>
</svg>

</template>

<script>

/* ==== Add Todo v-if="name==='user'"  width="54" height="54"  class="icon icon_user"  style="fill: currentcolor;" */
export default {
  name: "icon",
  props: ['name']
}
</script>