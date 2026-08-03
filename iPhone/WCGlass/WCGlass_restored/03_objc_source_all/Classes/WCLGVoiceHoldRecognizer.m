#import "WCLGVoiceHoldRecognizer.h"

/*
 * 这是依据 Objective-C runtime 元数据恢复的可读接口骨架。
 * 每个方法均保留原始 IMP 地址；精确指令位于 04_exact_arm64_assembly。
 */

@implementation WCLGVoiceHoldRecognizer

- (void)wclgNoop
{
    // 原始 IMP: 0x8202C; ObjC type encoding: v16@0:8
    // 已去除符号名混淆；完整控制流参见同名类的 .s 文件。
}

- (void)wclgCancelHoldBlock
{
    // 原始 IMP: 0x82030; ObjC type encoding: v16@0:8
    // 已去除符号名混淆；完整控制流参见同名类的 .s 文件。
}

- (id)wclgResolvedToolView
{
    // 原始 IMP: 0x820BC; ObjC type encoding: @16@0:8
    // 已去除符号名混淆；完整控制流参见同名类的 .s 文件。
    return nil;
}

- (void)wclgMountWaveViewOnToolView:(id)arg0
{
    // 原始 IMP: 0x822A8; ObjC type encoding: v24@0:8@16
    // 已去除符号名混淆；完整控制流参见同名类的 .s 文件。
}

- (void)wclgMountHintAboveInputWithAnchor:(id)arg0 toolView:(id)arg1
{
    // 原始 IMP: 0x8309C; ObjC type encoding: v32@0:8@16@24
    // 已去除符号名混淆；完整控制流参见同名类的 .s 文件。
}

- (void)wclgTeardownWaveView
{
    // 原始 IMP: 0x83910; ObjC type encoding: v16@0:8
    // 已去除符号名混淆；完整控制流参见同名类的 .s 文件。
}

- (void)wclgUpdateWaveStatusForTouches:(id)arg0
{
    // 原始 IMP: 0x83C1C; ObjC type encoding: v24@0:8@16
    // 已去除符号名混淆；完整控制流参见同名类的 .s 文件。
}

- (void)wclgBeginRecording
{
    // 原始 IMP: 0x840B4; ObjC type encoding: v16@0:8
    // 已去除符号名混淆；完整控制流参见同名类的 .s 文件。
}

- (void)touchesBegan:(id)arg0 withEvent:(id)arg1
{
    // 原始 IMP: 0x842F0; ObjC type encoding: v32@0:8@16@24
    // 已去除符号名混淆；完整控制流参见同名类的 .s 文件。
}

- (void)touchesMoved:(id)arg0 withEvent:(id)arg1
{
    // 原始 IMP: 0x84734; ObjC type encoding: v32@0:8@16@24
    // 已去除符号名混淆；完整控制流参见同名类的 .s 文件。
}

- (void)touchesEnded:(id)arg0 withEvent:(id)arg1
{
    // 原始 IMP: 0x848B8; ObjC type encoding: v32@0:8@16@24
    // 已去除符号名混淆；完整控制流参见同名类的 .s 文件。
}

- (void)touchesCancelled:(id)arg0 withEvent:(id)arg1
{
    // 原始 IMP: 0x84AB8; ObjC type encoding: v32@0:8@16@24
    // 已去除符号名混淆；完整控制流参见同名类的 .s 文件。
}

- (void)reset
{
    // 原始 IMP: 0x84C7C; ObjC type encoding: v16@0:8
    // 已去除符号名混淆；完整控制流参见同名类的 .s 文件。
}

- (id)toolView
{
    // 原始 IMP: 0x84D58; ObjC type encoding: @16@0:8
    // 已去除符号名混淆；完整控制流参见同名类的 .s 文件。
    return nil;
}

- (void)setToolView:(id)arg0
{
    // 原始 IMP: 0x84D78; ObjC type encoding: v24@0:8@16
    // 已去除符号名混淆；完整控制流参见同名类的 .s 文件。
}

- (BOOL)recording
{
    // 原始 IMP: 0x84D8C; ObjC type encoding: B16@0:8
    // 已去除符号名混淆；完整控制流参见同名类的 .s 文件。
    return 0;
}

- (void)setRecording:(id)arg0
{
    // 原始 IMP: 0x84D9C; ObjC type encoding: v20@0:8B16
    // 已去除符号名混淆；完整控制流参见同名类的 .s 文件。
}

- (id)pendingTouches
{
    // 原始 IMP: 0x84DAC; ObjC type encoding: @16@0:8
    // 已去除符号名混淆；完整控制流参见同名类的 .s 文件。
    return nil;
}

- (void)setPendingTouches:(id)arg0
{
    // 原始 IMP: 0x84DBC; ObjC type encoding: v24@0:8@16
    // 已去除符号名混淆；完整控制流参见同名类的 .s 文件。
}

- (id)pendingEvent
{
    // 原始 IMP: 0x84DD0; ObjC type encoding: @16@0:8
    // 已去除符号名混淆；完整控制流参见同名类的 .s 文件。
    return nil;
}

- (void)setPendingEvent:(id)arg0
{
    // 原始 IMP: 0x84DE0; ObjC type encoding: v24@0:8@16
    // 已去除符号名混淆；完整控制流参见同名类的 .s 文件。
}

- (id)holdBlock
{
    // 原始 IMP: 0x84DF4; ObjC type encoding: @?16@0:8
    // 已去除符号名混淆；完整控制流参见同名类的 .s 文件。
    return nil;
}

- (void)setHoldBlock:(id)arg0
{
    // 原始 IMP: 0x84E04; ObjC type encoding: v24@0:8@?16
    // 已去除符号名混淆；完整控制流参见同名类的 .s 文件。
}

- (id)waveView
{
    // 原始 IMP: 0x84E10; ObjC type encoding: @16@0:8
    // 已去除符号名混淆；完整控制流参见同名类的 .s 文件。
    return nil;
}

- (void)setWaveView:(id)arg0
{
    // 原始 IMP: 0x84E20; ObjC type encoding: v24@0:8@16
    // 已去除符号名混淆；完整控制流参见同名类的 .s 文件。
}

- (id)dimmedTextView
{
    // 原始 IMP: 0x84E34; ObjC type encoding: @16@0:8
    // 已去除符号名混淆；完整控制流参见同名类的 .s 文件。
    return nil;
}

- (void)setDimmedTextView:(id)arg0
{
    // 原始 IMP: 0x84E44; ObjC type encoding: v24@0:8@16
    // 已去除符号名混淆；完整控制流参见同名类的 .s 文件。
}

- (id)savedTextColor
{
    // 原始 IMP: 0x84E58; ObjC type encoding: @16@0:8
    // 已去除符号名混淆；完整控制流参见同名类的 .s 文件。
    return nil;
}

- (void)setSavedTextColor:(id)arg0
{
    // 原始 IMP: 0x84E68; ObjC type encoding: v24@0:8@16
    // 已去除符号名混淆；完整控制流参见同名类的 .s 文件。
}

- (id)savedTintColor
{
    // 原始 IMP: 0x84E7C; ObjC type encoding: @16@0:8
    // 已去除符号名混淆；完整控制流参见同名类的 .s 文件。
    return nil;
}

- (void)setSavedTintColor:(id)arg0
{
    // 原始 IMP: 0x84E8C; ObjC type encoding: v24@0:8@16
    // 已去除符号名混淆；完整控制流参见同名类的 .s 文件。
}

- (id)hintFloatLabel
{
    // 原始 IMP: 0x84EA0; ObjC type encoding: @16@0:8
    // 已去除符号名混淆；完整控制流参见同名类的 .s 文件。
    return nil;
}

- (void)setHintFloatLabel:(id)arg0
{
    // 原始 IMP: 0x84EB0; ObjC type encoding: v24@0:8@16
    // 已去除符号名混淆；完整控制流参见同名类的 .s 文件。
}

- (id)waveBaseColor
{
    // 原始 IMP: 0x84EC4; ObjC type encoding: @16@0:8
    // 已去除符号名混淆；完整控制流参见同名类的 .s 文件。
    return nil;
}

- (void)setWaveBaseColor:(id)arg0
{
    // 原始 IMP: 0x84ED4; ObjC type encoding: v24@0:8@16
    // 已去除符号名混淆；完整控制流参见同名类的 .s 文件。
}

- (BOOL)waveLockColor
{
    // 原始 IMP: 0x84EE8; ObjC type encoding: B16@0:8
    // 已去除符号名混淆；完整控制流参见同名类的 .s 文件。
    return 0;
}

- (void)setWaveLockColor:(id)arg0
{
    // 原始 IMP: 0x84EF8; ObjC type encoding: v20@0:8B16
    // 已去除符号名混淆；完整控制流参见同名类的 .s 文件。
}

- (id)startLocationInWindow
{
    // 原始 IMP: 0x84F08; ObjC type encoding: {CGPoint=dd}16@0:8
    // 已去除符号名混淆；完整控制流参见同名类的 .s 文件。
    return nil;
}

- (void)setStartLocationInWindow:(id)arg0
{
    // 原始 IMP: 0x84F1C; ObjC type encoding: v32@0:8{CGPoint=dd}16
    // 已去除符号名混淆；完整控制流参见同名类的 .s 文件。
}

- (void).cxx_destruct
{
    // 原始 IMP: 0x84F30; ObjC type encoding: v16@0:8
    // 已去除符号名混淆；完整控制流参见同名类的 .s 文件。
}

@end
