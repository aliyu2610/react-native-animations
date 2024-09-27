import { requireNativeComponent, View, Button } from 'react-native';
import React from 'react';

const FadeAnimationView = requireNativeComponent('FadeAnimation');

const FadeInComponent = () => (
  <FadeAnimationView style={{ width: 200, height: 200, backgroundColor: 'blue' }} fadeDuration={1000}>
    <Button title="Fade Me In" onPress={() => {}} />
  </FadeAnimationView>
);

export default FadeInComponent;
