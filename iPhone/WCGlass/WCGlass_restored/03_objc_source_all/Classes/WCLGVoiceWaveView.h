#import <Foundation/Foundation.h>
#import <UIKit/UIKit.h>

@interface WCLGVoiceWaveView : NSObject
- (id)initWithFrame:(id)arg0;
- (id)wclgColorForStatus:(id)arg0;
- (void)wclgApplyColors;
- (void)dealloc;
- (id)wclgBarsArea;
- (void)layoutSubviews;
- (void)wclgLayoutBarsWithProvider:(id)arg0;
- (void)setStatus:(id)arg0;
- (void)setBaseColor:(id)arg0;
- (void)setLockColor:(id)arg0;
- (void)startRecording;
- (void)stopRecording;
- (void)wclgTick:(id)arg0;
- (NSInteger)status;
- (id)baseColor;
- (BOOL)lockColor;
- (id)bars;
- (void)setBars:(id)arg0;
- (id)timeLabel;
- (void)setTimeLabel:(id)arg0;
- (id)link;
- (void)setLink:(id)arg0;
- (double)startTime;
- (void)setStartTime:(id)arg0;
- (NSInteger)lastWholeSecond;
- (void)setLastWholeSecond:(id)arg0;
- (void).cxx_destruct;
@end
