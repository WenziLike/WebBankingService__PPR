<template>
  <div id="nav">
    <router-link to="/">Home</router-link>
    <router-link to="/about">About</router-link>
  </div>
  <router-view/>
</template>

<style lang="scss">
@import url('https://fonts.googleapis.com/css2?family=Poppins:wght@100;200;300;400;500;600;700;800;900&display=swap');

*, *:before, *:after {
  padding: 0;
  margin: 0;
  box-sizing: border-box;
}

:root {
  --text: #606262;
  --black: #333;
  --black2: #333;
  --white: #fff;
  --white2: #fff;
  --darkBlue: #2c3e50;
  --bgCursor: #028d0b;
  --darkGreen: #028d0b;
  --blueRegular: #0b76ef;
  --colorText: #778899FF;
  --darkRed: #8d0000;
  --colorText2: #495A72;
}

/*============== todo  Input Button*/
input,
button,
fieldset {
  border: none;
  outline: none;
  background: none;
}


.container {
  display: flex;
  justify-content: space-between;
  min-height: 100vh;
}

#app{
  font-family: 'Montserrat', sans-serif;
}
</style>
