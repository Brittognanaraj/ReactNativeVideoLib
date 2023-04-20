import React from 'react';
import {requireNativeComponent, ViewProps} from 'react-native';

interface NativeComponentProps {
  sourceUrl: String;
}

export const CustomAndroidVideoView =
  requireNativeComponent<NativeComponentProps>('VideoCustomView');

type AndroidVideoViewProps = ViewProps & NativeComponentProps;

export const AndroidVideoView: React.FC<AndroidVideoViewProps> = props => {
  return <CustomAndroidVideoView {...props} />;
};
