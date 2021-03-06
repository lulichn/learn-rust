import React from 'react';
import {Button, Text, View} from 'react-native';

export default class BasicScreen extends React.Component {
  render() {
    return (
      <View style={{flex: 1, alignItems: 'center', justifyContent: 'center'}}>
        <Text>Home Screen</Text>
        <Button
          title="Go to Details"
          onPress={() => this.props.navigation.navigate('Home')}
        />

        <Button
          title="Login"
          onPress={() => this.props.navigation.navigate('Login')}
        />

        <Button
          title="Purchase"
          onPress={() => this.props.navigation.navigate('Purchase')}
        />
      </View>
    );
  }
}
