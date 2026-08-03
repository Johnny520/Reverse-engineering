#import <Foundation/Foundation.h>
#import <UIKit/UIKit.h>

@interface WCLGFriendCapsuleButton : NSObject
+ (id)wclgCapsuleConfiguration;
- (id)initWithFrame:(id)arg0;
- (void)didMoveToWindow;
- (void)configureUsername:(id)arg0 unread:(id)arg1;
- (void)setUnreadCount:(id)arg0;
- (void)layoutSubviews;
- (void)setHighlighted:(id)arg0;
- (void)wclgHandleTap;
- (void)wclgHandleLongPress:(id)arg0;
- (id)username;
- (void)setUsername:(id)arg0;
- (id)avatarView;
- (void)setAvatarView:(id)arg0;
- (id)nameLabel;
- (void)setNameLabel:(id)arg0;
- (id)badgeLabel;
- (void)setBadgeLabel:(id)arg0;
- (id)fallbackGlassView;
- (void)setFallbackGlassView:(id)arg0;
- (id)colorTintView;
- (void)setColorTintView:(id)arg0;
- (id)onTap;
- (void)setOnTap:(id)arg0;
- (id)onLongPress;
- (void)setOnLongPress:(id)arg0;
- (void).cxx_destruct;
@end
