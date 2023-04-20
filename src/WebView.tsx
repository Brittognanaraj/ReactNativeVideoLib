import React from 'react';
import {requireNativeComponent, ViewProps} from 'react-native';

interface NativeComponentProps {
  sourceUrl: String;
}

export const AndroidVideoView =
  requireNativeComponent<NativeComponentProps>('VideoView');

type CustomWebViewProps = ViewProps & NativeComponentProps;

export const CustomWebView: React.FC<CustomWebViewProps> = props => {
  return <AndroidVideoView {...props} />;
};
