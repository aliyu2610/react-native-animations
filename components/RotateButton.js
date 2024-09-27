import { requireNativeComponent, Button } from 'react-native';
import React from 'react';

const RotateAnimationView = requireNativeComponent('RotateAnimation');

const RotateButton = () => (
  <RotateAnimationView style={{ width: 100, height: 100 }} rotationDuration={1000}>
    <Button title="Rotate Me" onPress={() => {}} />
  </RotateAnimationView>
);

export default RotateButton;
