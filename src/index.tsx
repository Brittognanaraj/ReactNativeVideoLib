import {NativeModules} from 'react-native';

export * from './AndroidVideoView';

type AndroidVideoViewType = {
  multiply(a: number, b: number): Promise<number>;
};

const {AndroidVideoViews} = NativeModules;

export default AndroidVideoViews as AndroidVideoViewType;
