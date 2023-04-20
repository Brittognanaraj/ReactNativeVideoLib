import React from 'react';
import {requireNativeComponent, ViewProps} from 'react-native';

interface NativeComponentProps {
    initialNumber:number;
}

export const AndroidVideoView = requireNativeComponent<NativeComponentProps>(
  'VideoView',
);

type CustomWebViewProps = ViewProps & NativeComponentProps;

export const CustomWebView: React.FC<
CustomWebViewProps
> = (props) => {
  return <AndroidVideoView {...props} />;
};
