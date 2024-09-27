import { requireNativeComponent, FlatList, Text } from 'react-native';
import React from 'react';

const SlideAnimationView = requireNativeComponent('SlideAnimation');

const data = ['Item 1', 'Item 2', 'Item 3'];

const SlideInList = () => (
  <FlatList
    data={data}
    renderItem={({ item }) => (
      <SlideAnimationView style={{ padding: 10 }} slideDuration={500}>
        <Text>{item}</Text>
      </SlideAnimationView>
    )}
    keyExtractor={(item) => item}
  />
);

export default SlideInList;
