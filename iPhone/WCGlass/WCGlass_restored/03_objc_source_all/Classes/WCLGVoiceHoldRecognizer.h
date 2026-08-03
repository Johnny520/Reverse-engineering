#import <Foundation/Foundation.h>
#import <UIKit/UIKit.h>

@interface WCLGVoiceHoldRecognizer : NSObject
- (void)wclgNoop;
- (void)wclgCancelHoldBlock;
- (id)wclgResolvedToolView;
- (void)wclgMountWaveViewOnToolView:(id)arg0;
- (void)wclgMountHintAboveInputWithAnchor:(id)arg0 toolView:(id)arg1;
- (void)wclgTeardownWaveView;
- (void)wclgUpdateWaveStatusForTouches:(id)arg0;
- (void)wclgBeginRecording;
- (void)touchesBegan:(id)arg0 withEvent:(id)arg1;
- (void)touchesMoved:(id)arg0 withEvent:(id)arg1;
- (void)touchesEnded:(id)arg0 withEvent:(id)arg1;
- (void)touchesCancelled:(id)arg0 withEvent:(id)arg1;
- (void)reset;
- (id)toolView;
- (void)setToolView:(id)arg0;
- (BOOL)recording;
- (void)setRecording:(id)arg0;
- (id)pendingTouches;
- (void)setPendingTouches:(id)arg0;
- (id)pendingEvent;
- (void)setPendingEvent:(id)arg0;
- (id)holdBlock;
- (void)setHoldBlock:(id)arg0;
- (id)waveView;
- (void)setWaveView:(id)arg0;
- (id)dimmedTextView;
- (void)setDimmedTextView:(id)arg0;
- (id)savedTextColor;
- (void)setSavedTextColor:(id)arg0;
- (id)savedTintColor;
- (void)setSavedTintColor:(id)arg0;
- (id)hintFloatLabel;
- (void)setHintFloatLabel:(id)arg0;
- (id)waveBaseColor;
- (void)setWaveBaseColor:(id)arg0;
- (BOOL)waveLockColor;
- (void)setWaveLockColor:(id)arg0;
- (id)startLocationInWindow;
- (void)setStartLocationInWindow:(id)arg0;
- (void).cxx_destruct;
@end
