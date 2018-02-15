'use strict';

import React from 'react';
import { requireNativeComponent, View, Platform } from 'react-native';

let viewVithoutOverflow;
if (Platform.OS === 'ios') {
    viewVithoutOverflow = (props, children) => {
        return <View {...props}>
            {props.children}
        </View>
    };
} else {
    viewVithoutOverflow = requireNativeComponent('ViewWithoutOverflow', null);
}

module.exports = viewVithoutOverflow;
