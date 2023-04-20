
#ifdef RCT_NEW_ARCH_ENABLED
#import "RNAndroidVideoPlayerViewSpec.h"

@interface AndroidVideoPlayerView : NSObject <NativeAndroidVideoPlayerViewSpec>
#else
#import <React/RCTBridgeModule.h>

@interface AndroidVideoPlayerView : NSObject <RCTBridgeModule>
#endif

@end
