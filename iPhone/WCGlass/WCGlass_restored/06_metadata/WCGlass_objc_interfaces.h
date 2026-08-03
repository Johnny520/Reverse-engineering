// Recovered Objective-C interface index from WCGlass.dylib

// ===== arm64 =====
@interface WCLGChatPinnedHitCatcher /* VM 0x4c4fd0 */
- /* @40@0:8{CGPoint=dd}16@32 */ hitTest:withEvent:; // IMP 0x2984c
@end

@interface WCLGSMSBackContentView /* VM 0x4c4ff8 */
- /* @48@0:8{CGRect={CGPoint=dd}{CGSize=dd}}16 */ initWithFrame:; // IMP 0x645e4
- /* v32@0:8@16@24 */ updateChevron:count:; // IMP 0x64b14
- /* v16@0:8 */ layoutSubviews; // IMP 0x64c70
- /* @16@0:8 */ chevronView; // IMP 0x652f0
- /* v24@0:8@16 */ setChevronView:; // IMP 0x65300
- /* @16@0:8 */ badgeView; // IMP 0x65314
- /* v24@0:8@16 */ setBadgeView:; // IMP 0x65324
- /* @16@0:8 */ countLabel; // IMP 0x65338
- /* v24@0:8@16 */ setCountLabel:; // IMP 0x65348
- /* @16@0:8 */ countText; // IMP 0x6535c
- /* v24@0:8@16 */ setCountText:; // IMP 0x6536c
- /* v16@0:8 */ .cxx_destruct; // IMP 0x65378
@end

@interface WCLGVoiceHoldRecognizer /* VM 0x4c5048 */
- /* v16@0:8 */ wclgNoop; // IMP 0x8202c
- /* v16@0:8 */ wclgCancelHoldBlock; // IMP 0x82030
- /* @16@0:8 */ wclgResolvedToolView; // IMP 0x820bc
- /* v24@0:8@16 */ wclgMountWaveViewOnToolView:; // IMP 0x822a8
- /* v32@0:8@16@24 */ wclgMountHintAboveInputWithAnchor:toolView:; // IMP 0x8309c
- /* v16@0:8 */ wclgTeardownWaveView; // IMP 0x83910
- /* v24@0:8@16 */ wclgUpdateWaveStatusForTouches:; // IMP 0x83c1c
- /* v16@0:8 */ wclgBeginRecording; // IMP 0x840b4
- /* v32@0:8@16@24 */ touchesBegan:withEvent:; // IMP 0x842f0
- /* v32@0:8@16@24 */ touchesMoved:withEvent:; // IMP 0x84734
- /* v32@0:8@16@24 */ touchesEnded:withEvent:; // IMP 0x848b8
- /* v32@0:8@16@24 */ touchesCancelled:withEvent:; // IMP 0x84ab8
- /* v16@0:8 */ reset; // IMP 0x84c7c
- /* @16@0:8 */ toolView; // IMP 0x84d58
- /* v24@0:8@16 */ setToolView:; // IMP 0x84d78
- /* B16@0:8 */ recording; // IMP 0x84d8c
- /* v20@0:8B16 */ setRecording:; // IMP 0x84d9c
- /* @16@0:8 */ pendingTouches; // IMP 0x84dac
- /* v24@0:8@16 */ setPendingTouches:; // IMP 0x84dbc
- /* @16@0:8 */ pendingEvent; // IMP 0x84dd0
- /* v24@0:8@16 */ setPendingEvent:; // IMP 0x84de0
- /* @?16@0:8 */ holdBlock; // IMP 0x84df4
- /* v24@0:8@?16 */ setHoldBlock:; // IMP 0x84e04
- /* @16@0:8 */ waveView; // IMP 0x84e10
- /* v24@0:8@16 */ setWaveView:; // IMP 0x84e20
- /* @16@0:8 */ dimmedTextView; // IMP 0x84e34
- /* v24@0:8@16 */ setDimmedTextView:; // IMP 0x84e44
- /* @16@0:8 */ savedTextColor; // IMP 0x84e58
- /* v24@0:8@16 */ setSavedTextColor:; // IMP 0x84e68
- /* @16@0:8 */ savedTintColor; // IMP 0x84e7c
- /* v24@0:8@16 */ setSavedTintColor:; // IMP 0x84e8c
- /* @16@0:8 */ hintFloatLabel; // IMP 0x84ea0
- /* v24@0:8@16 */ setHintFloatLabel:; // IMP 0x84eb0
- /* @16@0:8 */ waveBaseColor; // IMP 0x84ec4
- /* v24@0:8@16 */ setWaveBaseColor:; // IMP 0x84ed4
- /* B16@0:8 */ waveLockColor; // IMP 0x84ee8
- /* v20@0:8B16 */ setWaveLockColor:; // IMP 0x84ef8
- /* {CGPoint=dd}16@0:8 */ startLocationInWindow; // IMP 0x84f08
- /* v32@0:8{CGPoint=dd}16 */ setStartLocationInWindow:; // IMP 0x84f1c
- /* v16@0:8 */ .cxx_destruct; // IMP 0x84f30
@end

@interface WCLGMsgMergeCellHotCache /* VM 0x4c50c0 */
- /* v16@0:8 */ .cxx_destruct; // IMP 0x9d318
@end

@interface WCLGAvatarPickerHandler /* VM 0x4c5110 */
- /* v32@0:8@16@24 */ imagePickerController:didFinishPickingMediaWithInfo:; // IMP 0x11a280
- /* v24@0:8@16 */ imagePickerControllerDidCancel:; // IMP 0x11a50c
- /* @16@0:8 */ wxid; // IMP 0x11a550
- /* v24@0:8@16 */ setWxid:; // IMP 0x11a558
- /* @?16@0:8 */ onDone; // IMP 0x11a560
- /* v24@0:8@?16 */ setOnDone:; // IMP 0x11a568
- /* @16@0:8 */ retainSelf; // IMP 0x11a570
- /* v24@0:8@16 */ setRetainSelf:; // IMP 0x11a578
- /* v16@0:8 */ .cxx_destruct; // IMP 0x11a584
@end

@interface WCLGImageLibraryPickerViewController /* VM 0x4c5138 */
- /* @40@0:8@16@24@?32 */ initWithCategory:title:onPick:; // IMP 0x11b3d0
- /* v16@0:8 */ viewDidLoad; // IMP 0x11b558
- /* v16@0:8 */ closeTapped; // IMP 0x11be80
- /* q32@0:8@16q24 */ collectionView:numberOfItemsInSection:; // IMP 0x11be94
- /* {CGSize=dd}40@0:8@16@24@32 */ collectionView:layout:sizeForItemAtIndexPath:; // IMP 0x11bee0
- /* @32@0:8@16@24 */ collectionView:cellForItemAtIndexPath:; // IMP 0x11bf58
- /* v32@0:8@16@24 */ collectionView:didSelectItemAtIndexPath:; // IMP 0x11c2c8
- /* @16@0:8 */ category; // IMP 0x11c4ac
- /* v24@0:8@16 */ setCategory:; // IMP 0x11c4bc
- /* @?16@0:8 */ onPick; // IMP 0x11c4c8
- /* v24@0:8@?16 */ setOnPick:; // IMP 0x11c4d8
- /* @16@0:8 */ items; // IMP 0x11c4e4
- /* v24@0:8@16 */ setItems:; // IMP 0x11c4f4
- /* @16@0:8 */ collectionView; // IMP 0x11c500
- /* v24@0:8@16 */ setCollectionView:; // IMP 0x11c510
- /* @16@0:8 */ emptyLabel; // IMP 0x11c524
- /* v24@0:8@16 */ setEmptyLabel:; // IMP 0x11c534
- /* v16@0:8 */ .cxx_destruct; // IMP 0x11c548
@end

@interface WCLGChatAvatarMenuDelegate /* VM 0x4c51b0 */
- /* @40@0:8@16{CGPoint=dd}24 */ contextMenuInteraction:configurationForMenuAtLocation:; // IMP 0x1244ec
- /* v40@0:8@16@24@32 */ contextMenuInteraction:willEndForConfiguration:animator:; // IMP 0x125d58
- /* @16@0:8 */ cell; // IMP 0x125fd0
- /* v24@0:8@16 */ setCell:; // IMP 0x125fe8
- /* @16@0:8 */ headView; // IMP 0x125ff4
- /* v24@0:8@16 */ setHeadView:; // IMP 0x12600c
- /* @16@0:8 */ frozenWxid; // IMP 0x126018
- /* v24@0:8@16 */ setFrozenWxid:; // IMP 0x126020
- /* @16@0:8 */ frozenChatRoomId; // IMP 0x126028
- /* v24@0:8@16 */ setFrozenChatRoomId:; // IMP 0x126030
- /* @16@0:8 */ frozenWrap; // IMP 0x126038
- /* v24@0:8@16 */ setFrozenWrap:; // IMP 0x126040
- /* v16@0:8 */ .cxx_destruct; // IMP 0x12604c
@end

@interface WCLGChatBottomSMSProxySendTarget /* VM 0x4c5200 */
- /* v24@0:8@16 */ wclg_smsSendTapped:; // IMP 0x12a9dc
- /* v24@0:8@16 */ wclg_smsMoreTapped:; // IMP 0x12b6a8
- /* v24@0:8@16 */ wclg_smsEmojiTapped:; // IMP 0x12b7b4
- /* v24@0:8@16 */ wclg_smsVoiceTapped:; // IMP 0x12b838
@end

@interface WCLGChatTextTarget /* VM 0x4c5250 */
- /* @16@0:8 */ view; // IMP 0x197518
- /* v24@0:8@16 */ setView:; // IMP 0x197530
- /* B16@0:8 */ richText; // IMP 0x19753c
- /* v20@0:8B16 */ setRichText:; // IMP 0x197544
- /* B16@0:8 */ explicitExternalTarget; // IMP 0x19754c
- /* v20@0:8B16 */ setExplicitExternalTarget:; // IMP 0x197554
- /* @16@0:8 */ lastAppliedColor; // IMP 0x19755c
- /* v24@0:8@16 */ setLastAppliedColor:; // IMP 0x197564
- /* @16@0:8 */ originalTextColor; // IMP 0x197570
- /* v24@0:8@16 */ setOriginalTextColor:; // IMP 0x197578
- /* @16@0:8 */ originalRichTextColor; // IMP 0x197584
- /* v24@0:8@16 */ setOriginalRichTextColor:; // IMP 0x19758c
- /* @16@0:8 */ originalAttributedText; // IMP 0x197598
- /* v24@0:8@16 */ setOriginalAttributedText:; // IMP 0x1975a0
- /* B16@0:8 */ capturedLabelOriginals; // IMP 0x1975ac
- /* v20@0:8B16 */ setCapturedLabelOriginals:; // IMP 0x1975b4
- /* B16@0:8 */ capturedRichTextOriginal; // IMP 0x1975bc
- /* v20@0:8B16 */ setCapturedRichTextOriginal:; // IMP 0x1975c4
- /* Q16@0:8 */ lastTextObject; // IMP 0x1975cc
- /* v24@0:8Q16 */ setLastTextObject:; // IMP 0x1975d4
- /* Q16@0:8 */ lastAttributedObject; // IMP 0x1975dc
- /* v24@0:8Q16 */ setLastAttributedObject:; // IMP 0x1975e4
- /* Q16@0:8 */ lastTextLength; // IMP 0x1975ec
- /* v24@0:8Q16 */ setLastTextLength:; // IMP 0x1975f4
- /* Q16@0:8 */ lastAttributedLength; // IMP 0x1975fc
- /* v24@0:8Q16 */ setLastAttributedLength:; // IMP 0x197604
- /* v16@0:8 */ .cxx_destruct; // IMP 0x19760c
@end

@interface WCLGChatTextApplyState /* VM 0x4c5278 */
- /* @16@0:8 */ init; // IMP 0x19765c
- /* Q16@0:8 */ viewModelToken; // IMP 0x1976c8
- /* v24@0:8Q16 */ setViewModelToken:; // IMP 0x1976d0
- /* Q16@0:8 */ stableIdentityHash; // IMP 0x1976d8
- /* v24@0:8Q16 */ setStableIdentityHash:; // IMP 0x1976e0
- /* Q16@0:8 */ identityGeneration; // IMP 0x1976e8
- /* v24@0:8Q16 */ setIdentityGeneration:; // IMP 0x1976f0
- /* Q16@0:8 */ contentGeneration; // IMP 0x1976f8
- /* v24@0:8Q16 */ setContentGeneration:; // IMP 0x197700
- /* Q16@0:8 */ targetGeneration; // IMP 0x197708
- /* v24@0:8Q16 */ setTargetGeneration:; // IMP 0x197710
- /* Q16@0:8 */ layoutGeneration; // IMP 0x197718
- /* v24@0:8Q16 */ setLayoutGeneration:; // IMP 0x197720
- /* Q16@0:8 */ layoutDepth; // IMP 0x197728
- /* v24@0:8Q16 */ setLayoutDepth:; // IMP 0x197730
- /* Q16@0:8 */ lastAppliedLayoutGeneration; // IMP 0x197738
- /* v24@0:8Q16 */ setLastAppliedLayoutGeneration:; // IMP 0x197740
- /* Q16@0:8 */ lastApplySignature; // IMP 0x197748
- /* v24@0:8Q16 */ setLastApplySignature:; // IMP 0x197750
- /* Q16@0:8 */ targetStructureSignature; // IMP 0x197758
- /* v24@0:8Q16 */ setTargetStructureSignature:; // IMP 0x197760
- /* Q16@0:8 */ contentSignature; // IMP 0x197768
- /* v24@0:8Q16 */ setContentSignature:; // IMP 0x197770
- /* Q16@0:8 */ nextFallbackScanLayoutGeneration; // IMP 0x197778
- /* v24@0:8Q16 */ setNextFallbackScanLayoutGeneration:; // IMP 0x197780
- /* @16@0:8 */ contentView; // IMP 0x197788
- /* v24@0:8@16 */ setContentView:; // IMP 0x1977a0
- /* @16@0:8 */ bodyView; // IMP 0x1977ac
- /* v24@0:8@16 */ setBodyView:; // IMP 0x1977c4
- /* @16@0:8 */ targets; // IMP 0x1977d0
- /* v24@0:8@16 */ setTargets:; // IMP 0x1977d8
- /* Q16@0:8 */ resolvedColorSignature; // IMP 0x1977e0
- /* v24@0:8Q16 */ setResolvedColorSignature:; // IMP 0x1977e8
- /* B16@0:8 */ resolvedDarkMode; // IMP 0x1977f0
- /* v20@0:8B16 */ setResolvedDarkMode:; // IMP 0x1977f8
- /* B16@0:8 */ resolvedOutgoing; // IMP 0x197800
- /* v20@0:8B16 */ setResolvedOutgoing:; // IMP 0x197808
- /* B16@0:8 */ resolvedPayment; // IMP 0x197810
- /* v20@0:8B16 */ setResolvedPayment:; // IMP 0x197818
- /* @16@0:8 */ resolvedColor; // IMP 0x197820
- /* v24@0:8@16 */ setResolvedColor:; // IMP 0x197828
- /* v16@0:8 */ .cxx_destruct; // IMP 0x197834
@end

@interface WCLGBubbleFlushDriver /* VM 0x4c52c8 */
+ /* @16@0:8 */ shared; // IMP 0x1a99b4
- /* v16@0:8 */ kick; // IMP 0x1a9a18
- /* v24@0:8@16 */ tick:; // IMP 0x1a9b3c
- /* @16@0:8 */ link; // IMP 0x1aa19c
- /* v24@0:8@16 */ setLink:; // IMP 0x1aa1a4
- /* v16@0:8 */ .cxx_destruct; // IMP 0x1aa1b0
@end

@interface WCLGNativeProfileTitleHitView /* VM 0x4c5318 */
- /* @48@0:8{CGRect={CGPoint=dd}{CGSize=dd}}16 */ initWithFrame:; // IMP 0x1db6c0
- /* B40@0:8{CGPoint=dd}16@32 */ pointInside:withEvent:; // IMP 0x1db720
- /* {CGRect={CGPoint=dd}{CGSize=dd}}16@0:8 */ wclgHitRect; // IMP 0x1db880
- /* v48@0:8{CGRect={CGPoint=dd}{CGSize=dd}}16 */ setWclgHitRect:; // IMP 0x1db898
- /* B16@0:8 */ wclgCircularHitTest; // IMP 0x1db8b0
- /* v20@0:8B16 */ setWclgCircularHitTest:; // IMP 0x1db8c0
@end

@interface WCLGNativeProfileTitleTapTarget /* VM 0x4c5390 */
- /* v24@0:8@16 */ wclg_nativeProfileTitleTapped:; // IMP 0x1db8d0
- /* @16@0:8 */ controller; // IMP 0x1dcf8c
- /* v24@0:8@16 */ setController:; // IMP 0x1dcf94
@end

@interface WCLGCapsuleSearchGestureTarget /* VM 0x4c53e0 */
+ /* @16@0:8 */ shared; // IMP 0x21651c
- /* v24@0:8@16 */ handleLongPress:; // IMP 0x2165b8
@end

@interface WCLGChatTopCapsuleHostView /* VM 0x4c5408 */
- /* @48@0:8{CGRect={CGPoint=dd}{CGSize=dd}}16 */ initWithFrame:; // IMP 0x225e8c
- /* v24@0:8@16 */ setAvatarView:; // IMP 0x2263e8
- /* v16@0:8 */ layoutSubviews; // IMP 0x226484
- /* v16@0:8 */ wclg_handleTap; // IMP 0x226918
- /* @16@0:8 */ cachedTitle; // IMP 0x226b04
- /* v24@0:8@16 */ setCachedTitle:; // IMP 0x226b14
- /* @16@0:8 */ titleLabel; // IMP 0x226b20
- /* v24@0:8@16 */ setTitleLabel:; // IMP 0x226b30
- /* @16@0:8 */ subtitleLabel; // IMP 0x226b44
- /* v24@0:8@16 */ setSubtitleLabel:; // IMP 0x226b54
- /* @16@0:8 */ subtitleIconView; // IMP 0x226b68
- /* v24@0:8@16 */ setSubtitleIconView:; // IMP 0x226b78
- /* @16@0:8 */ avatarView; // IMP 0x226b8c
- /* @16@0:8 */ controller; // IMP 0x226b9c
- /* v24@0:8@16 */ setController:; // IMP 0x226bbc
- /* B16@0:8 */ avatarOnLeft; // IMP 0x226bd0
- /* v20@0:8B16 */ setAvatarOnLeft:; // IMP 0x226be0
- /* v16@0:8 */ .cxx_destruct; // IMP 0x226bf0
@end

@interface WCLGChatTopFadeOverlayHost /* VM 0x4c5458 */
- /* @48@0:8{CGRect={CGPoint=dd}{CGSize=dd}}16 */ initWithFrame:; // IMP 0x229d60
- /* v16@0:8 */ layoutSubviews; // IMP 0x22a064
- /* @16@0:8 */ scrollView; // IMP 0x22a388
- /* v24@0:8@16 */ setScrollView:; // IMP 0x22a3a8
- /* q16@0:8 */ overlayMode; // IMP 0x22a3bc
- /* v24@0:8q16 */ setOverlayMode:; // IMP 0x22a3cc
- /* @16@0:8 */ edgeView; // IMP 0x22a3dc
- /* v24@0:8@16 */ setEdgeView:; // IMP 0x22a3ec
- /* v16@0:8 */ .cxx_destruct; // IMP 0x22a400
@end

@interface WCLGChatBottomFadeOverlayHost /* VM 0x4c54a8 */
- /* @48@0:8{CGRect={CGPoint=dd}{CGSize=dd}}16 */ initWithFrame:; // IMP 0x22a43c
- /* v16@0:8 */ layoutSubviews; // IMP 0x22a784
- /* @16@0:8 */ scrollView; // IMP 0x22a934
- /* v24@0:8@16 */ setScrollView:; // IMP 0x22a954
- /* @16@0:8 */ edgeView; // IMP 0x22a968
- /* v24@0:8@16 */ setEdgeView:; // IMP 0x22a978
- /* d16@0:8 */ configuredBlurRadius; // IMP 0x22a98c
- /* v24@0:8d16 */ setConfiguredBlurRadius:; // IMP 0x22a99c
- /* v16@0:8 */ .cxx_destruct; // IMP 0x22a9ac
@end

@interface WCLGChatTopMorphMenuView /* VM 0x4c54f8 */
- /* @48@0:8{CGRect={CGPoint=dd}{CGSize=dd}}16 */ initWithFrame:; // IMP 0x231770
- /* v16@0:8 */ layoutSubviews; // IMP 0x231ec0
- /* v16@0:8 */ reloadRows; // IMP 0x231f90
- /* v24@0:8@16 */ handleMenuTap:; // IMP 0x233bf8
- /* v24@0:8q16 */ setHighlightedIndex:; // IMP 0x233cd4
- /* q32@0:8{CGPoint=dd}16 */ indexForPoint:; // IMP 0x233f60
- /* @16@0:8 */ controller; // IMP 0x23408c
- /* v24@0:8@16 */ setController:; // IMP 0x2340ac
- /* B16@0:8 */ isGroup; // IMP 0x2340c0
- /* v20@0:8B16 */ setIsGroup:; // IMP 0x2340d0
- /* q16@0:8 */ highlightedIndex; // IMP 0x2340e0
- /* @?16@0:8 */ selectionHandler; // IMP 0x2340f0
- /* v24@0:8@?16 */ setSelectionHandler:; // IMP 0x234100
- /* @16@0:8 */ effectView; // IMP 0x23410c
- /* v24@0:8@16 */ setEffectView:; // IMP 0x23411c
- /* @16@0:8 */ rowViews; // IMP 0x234130
- /* v24@0:8@16 */ setRowViews:; // IMP 0x234140
- /* v16@0:8 */ .cxx_destruct; // IMP 0x234154
@end

@interface WCLGChatTopAvatarOverlayView /* VM 0x4c5548 */
- /* v16@0:8 */ layoutSubviews; // IMP 0x2343d4
@end

@interface WCLGChatTopMorphHostView /* VM 0x4c5598 */
- /* @48@0:8{CGRect={CGPoint=dd}{CGSize=dd}}16 */ initWithFrame:; // IMP 0x2344cc
- /* v16@0:8 */ updateChrome; // IMP 0x2348a8
- /* v16@0:8 */ layoutSubviews; // IMP 0x235148
- /* v24@0:8@16 */ traitCollectionDidChange:; // IMP 0x23544c
- /* v24@0:8@16 */ handleTap:; // IMP 0x2354fc
- /* @16@0:8 */ menuContainerView; // IMP 0x235ab8
- /* v16@0:8 */ showMenuFromHost; // IMP 0x235b98
- /* v16@0:8 */ hideMenu; // IMP 0x23608c
- /* v24@0:8@16 */ handleLongPress:; // IMP 0x23626c
- /* @16@0:8 */ controller; // IMP 0x2364c4
- /* v24@0:8@16 */ setController:; // IMP 0x2364e4
- /* B16@0:8 */ avatarOnlyMode; // IMP 0x2364f8
- /* v20@0:8B16 */ setAvatarOnlyMode:; // IMP 0x236508
- /* @16@0:8 */ cachedAvatarImage; // IMP 0x236518
- /* v24@0:8@16 */ setCachedAvatarImage:; // IMP 0x236528
- /* q16@0:8 */ cachedAvatarToken; // IMP 0x23653c
- /* v24@0:8q16 */ setCachedAvatarToken:; // IMP 0x23654c
- /* B16@0:8 */ isGroup; // IMP 0x23655c
- /* v20@0:8B16 */ setIsGroup:; // IMP 0x23656c
- /* q16@0:8 */ defaultAction; // IMP 0x23657c
- /* v24@0:8q16 */ setDefaultAction:; // IMP 0x23658c
- /* B16@0:8 */ ready; // IMP 0x23659c
- /* v20@0:8B16 */ setReady:; // IMP 0x2365ac
- /* @16@0:8 */ iconView; // IMP 0x2365bc
- /* v24@0:8@16 */ setIconView:; // IMP 0x2365cc
- /* @16@0:8 */ menuView; // IMP 0x2365e0
- /* v24@0:8@16 */ setMenuView:; // IMP 0x2365f0
- /* B16@0:8 */ menuVisible; // IMP 0x236604
- /* v20@0:8B16 */ setMenuVisible:; // IMP 0x236614
- /* B16@0:8 */ longPressActive; // IMP 0x236624
- /* v20@0:8B16 */ setLongPressActive:; // IMP 0x236634
- /* v16@0:8 */ .cxx_destruct; // IMP 0x236644
@end

@interface WCLGCodeLibraryEntry /* VM 0x4c5610 */
- /* @16@0:8 */ entryId; // IMP 0x23f590
- /* v24@0:8@16 */ setEntryId:; // IMP 0x23f598
- /* @16@0:8 */ name; // IMP 0x23f5a0
- /* v24@0:8@16 */ setName:; // IMP 0x23f5a8
- /* Q16@0:8 */ charCount; // IMP 0x23f5b0
- /* v24@0:8Q16 */ setCharCount:; // IMP 0x23f5b8
- /* @16@0:8 */ createdAt; // IMP 0x23f5c0
- /* v24@0:8@16 */ setCreatedAt:; // IMP 0x23f5c8
- /* v16@0:8 */ .cxx_destruct; // IMP 0x23f5d4
@end

@interface WCLGCodeLibraryViewController /* VM 0x4c5638 */
+ /* @16@0:8 */ dateFormatter; // IMP 0x244e5c
- /* @32@0:8@?16@?24 */ initWithApplyHandler:onChange:; // IMP 0x243770
- /* v16@0:8 */ viewDidLoad; // IMP 0x243874
- /* v20@0:8B16 */ viewWillAppear:; // IMP 0x244308
- /* v20@0:8B16 */ viewWillDisappear:; // IMP 0x2444c8
- /* v16@0:8 */ reloadEntries; // IMP 0x24453c
- /* v16@0:8 */ notifyChange; // IMP 0x244de0
- /* v16@0:8 */ toggleEditingTapped; // IMP 0x2450a8
- /* v24@0:8B16B20 */ setEditing:animated:; // IMP 0x245104
- /* v16@0:8 */ updateToolbarState; // IMP 0x2452fc
- /* v16@0:8 */ selectAllTapped; // IMP 0x245684
- /* v16@0:8 */ deleteSelectedTapped; // IMP 0x24580c
- /* v16@0:8 */ clearAllTapped; // IMP 0x245ed0
- /* v16@0:8 */ closeTapped; // IMP 0x2463b4
- /* v24@0:8q16 */ applyEntryAtRow:; // IMP 0x2463c8
- /* v24@0:8q16 */ presentRenameForRow:; // IMP 0x2466d0
- /* v24@0:8q16 */ deleteEntryAtRow:; // IMP 0x246c70
- /* v16@0:8 */ addTapped; // IMP 0x247184
- /* v16@0:8 */ saveCurrentInUse; // IMP 0x2475f4
- /* v16@0:8 */ importFromFiles; // IMP 0x247bf4
- /* v32@0:8@16@24 */ documentPicker:didPickDocumentsAtURLs:; // IMP 0x247ce8
- /* q32@0:8@16q24 */ tableView:numberOfRowsInSection:; // IMP 0x2482a0
- /* @32@0:8@16@24 */ tableView:cellForRowAtIndexPath:; // IMP 0x2482ec
- /* v32@0:8@16@24 */ tableView:didSelectRowAtIndexPath:; // IMP 0x248abc
- /* v32@0:8@16@24 */ tableView:didDeselectRowAtIndexPath:; // IMP 0x248b68
- /* q32@0:8@16@24 */ tableView:editingStyleForRowAtIndexPath:; // IMP 0x248bb0
- /* B32@0:8@16@24 */ tableView:canEditRowAtIndexPath:; // IMP 0x248bb8
- /* B32@0:8@16@24 */ tableView:canMoveRowAtIndexPath:; // IMP 0x248bc0
- /* v40@0:8@16@24@32 */ tableView:moveRowAtIndexPath:toIndexPath:; // IMP 0x248bc8
- /* @48@0:8@16@24{CGPoint=dd}32 */ tableView:contextMenuConfigurationForRowAtIndexPath:point:; // IMP 0x248edc
- /* @32@0:8@16q24 */ tableView:titleForFooterInSection:; // IMP 0x2495a4
- /* @?16@0:8 */ onApply; // IMP 0x2498ec
- /* v24@0:8@?16 */ setOnApply:; // IMP 0x2498fc
- /* @?16@0:8 */ onChange; // IMP 0x249908
- /* v24@0:8@?16 */ setOnChange:; // IMP 0x249918
- /* @16@0:8 */ entries; // IMP 0x249924
- /* v24@0:8@16 */ setEntries:; // IMP 0x249934
- /* @16@0:8 */ activeEntryId; // IMP 0x249948
- /* v24@0:8@16 */ setActiveEntryId:; // IMP 0x249958
- /* @16@0:8 */ addButton; // IMP 0x249964
- /* v24@0:8@16 */ setAddButton:; // IMP 0x249974
- /* @16@0:8 */ selectButton; // IMP 0x249988
- /* v24@0:8@16 */ setSelectButton:; // IMP 0x249998
- /* @16@0:8 */ selectAllButton; // IMP 0x2499ac
- /* v24@0:8@16 */ setSelectAllButton:; // IMP 0x2499bc
- /* @16@0:8 */ clearAllButton; // IMP 0x2499d0
- /* v24@0:8@16 */ setClearAllButton:; // IMP 0x2499e0
- /* @16@0:8 */ deleteButton; // IMP 0x2499f4
- /* v24@0:8@16 */ setDeleteButton:; // IMP 0x249a04
- /* @16@0:8 */ emptyLabel; // IMP 0x249a18
- /* v24@0:8@16 */ setEmptyLabel:; // IMP 0x249a28
- /* v16@0:8 */ .cxx_destruct; // IMP 0x249a3c
@end

@interface WCLGColorPickerBackgroundView /* VM 0x4c5688 */
+ /* #16@0:8 */ layerClass; // IMP 0x249b1c
- /* v16@0:8 */ layoutSubviews; // IMP 0x249c8c
@end

@interface WCLGColorCanvasView /* VM 0x4c56d8 */
- /* @48@0:8{CGRect={CGPoint=dd}{CGSize=dd}}16 */ initWithFrame:; // IMP 0x24a0d4
- /* v24@0:8d16 */ setHue:; // IMP 0x24a570
- /* v16@0:8 */ layoutSubviews; // IMP 0x24a628
- /* @16@0:8 */ hueLayer; // IMP 0x24a9e8
- /* v24@0:8@16 */ setHueLayer:; // IMP 0x24a9f8
- /* @16@0:8 */ whiteLayer; // IMP 0x24aa0c
- /* v24@0:8@16 */ setWhiteLayer:; // IMP 0x24ab3c
- /* @16@0:8 */ blackLayer; // IMP 0x24ab50
- /* v24@0:8@16 */ setBlackLayer:; // IMP 0x24ab60
- /* d16@0:8 */ hue; // IMP 0x24ab74
- /* v16@0:8 */ .cxx_destruct; // IMP 0x24ab84
@end

@interface WCLGHueBarView /* VM 0x4c5728 */
+ /* #16@0:8 */ layerClass; // IMP 0x24abd8
- /* @48@0:8{CGRect={CGPoint=dd}{CGSize=dd}}16 */ initWithFrame:; // IMP 0x24ad58
- /* v16@0:8 */ layoutSubviews; // IMP 0x24aff0
@end

@interface WCLGColorPickerViewController /* VM 0x4c5778 */
- /* @28@0:8B16@?20 */ initOutgoing:handler:; // IMP 0x24b840
- /* @32@0:8q16@?24 */ initPurpose:handler:; // IMP 0x24b850
- /* @48@0:8q16q24q32@?40 */ initPurpose:lightMode:darkMode:handler:; // IMP 0x24b988
- /* @40@0:8q16q24@?32 */ initSMSBottomBarIconLightMode:darkMode:handler:; // IMP 0x24bbe0
- /* @40@0:8@16q24@?32 */ initTitle:initialMode:handler:; // IMP 0x24bbfc
- /* @48@0:8@16q24q32@?40 */ initTitle:lightMode:darkMode:handler:; // IMP 0x24bd8c
- /* B16@0:8 */ isDarkMode; // IMP 0x24bf38
- /* @16@0:8 */ titleForPurpose; // IMP 0x24bf88
- /* q16@0:8 */ currentMode; // IMP 0x24ceb0
- /* B56@0:8q16^d24^d32^d40^d48 */ componentsForMode:red:green:blue:alpha:; // IMP 0x24db20
- /* v16@0:8 */ loadCurrentColor; // IMP 0x24f324
- /* v20@0:8B16 */ updateHSVFromRGBPreservingHue:; // IMP 0x24f584
- /* v16@0:8 */ updateRGBFromHSV; // IMP 0x24f9a4
- /* v16@0:8 */ markCustomMode; // IMP 0x24fde0
- /* v16@0:8 */ storeCurrentModeForActiveAppearance; // IMP 0x250028
- /* @16@0:8 */ currentHexString; // IMP 0x25026c
- /* @16@0:8 */ primaryTextColor; // IMP 0x2509a8
- /* @16@0:8 */ secondaryTextColor; // IMP 0x250bb4
- /* @16@0:8 */ cardColor; // IMP 0x250ce0
- /* @16@0:8 */ makeCard; // IMP 0x250d38
- /* @24@0:8@16 */ sectionLabelWithText:; // IMP 0x250f64
- /* @24@0:8q16 */ numberFieldWithTag:; // IMP 0x251064
- /* @32@0:8@16d24 */ swatchImageForColor:diameter:; // IMP 0x251280
- /* @16@0:8 */ defaultPaletteModes; // IMP 0x2513b4
- /* @16@0:8 */ commonColorModes; // IMP 0x251b4c
- /* @16@0:8 */ commonColorNames; // IMP 0x251d8c
- /* @24@0:8q16 */ colorForMode:; // IMP 0x2523b8
- /* v16@0:8 */ viewDidLoad; // IMP 0x252424
- /* v20@0:8B16 */ viewDidAppear:; // IMP 0x255de0
- /* v20@0:8B16 */ viewWillDisappear:; // IMP 0x255ea4
- /* v16@0:8 */ viewDidLayoutSubviews; // IMP 0x2560d8
- /* v24@0:8@16 */ traitCollectionDidChange:; // IMP 0x2562a8
- /* v16@0:8 */ refreshThemeColors; // IMP 0x256338
- /* v16@0:8 */ layoutPickerViews; // IMP 0x257d18
- /* v24@0:8d16 */ layoutPaletteButtonsWithWidth:; // IMP 0x258bec
- /* v24@0:8d16 */ layoutCommonRowsWithWidth:; // IMP 0x2590f4
- /* v16@0:8 */ updateUI; // IMP 0x2593b4
- /* v16@0:8 */ updateKnobFrames; // IMP 0x25a334
- /* v16@0:8 */ confirmColor; // IMP 0x25ab88
- /* v24@0:8@16 */ appearanceSegmentChanged:; // IMP 0x25b2dc
- /* v24@0:8q16 */ applyMode:; // IMP 0x25b580
- /* v24@0:8@16 */ channelSliderChanged:; // IMP 0x25b620
- /* v24@0:8@16 */ canvasGestureChanged:; // IMP 0x25b91c
- /* v24@0:8@16 */ hueGestureChanged:; // IMP 0x25ba98
- /* v24@0:8@16 */ paletteButtonTapped:; // IMP 0x25bba4
- /* v24@0:8@16 */ commonButtonTapped:; // IMP 0x25bfd0
- /* B56@0:8@16^d24^d32^d40^d48 */ parseHexString:red:green:blue:alpha:; // IMP 0x25c188
- /* v24@0:8@16 */ hexEditingDidEnd:; // IMP 0x25d2ec
- /* v24@0:8@16 */ numberFieldEditingDidEnd:; // IMP 0x25d474
- /* B24@0:8@16 */ textFieldShouldReturn:; // IMP 0x25d860
- /* B16@0:8 */ outgoing; // IMP 0x25d884
- /* v20@0:8B16 */ setOutgoing:; // IMP 0x25d894
- /* q16@0:8 */ purpose; // IMP 0x25d9b8
- /* v24@0:8q16 */ setPurpose:; // IMP 0x25d9c8
- /* @?16@0:8 */ selectionHandler; // IMP 0x25daec
- /* v24@0:8@?16 */ setSelectionHandler:; // IMP 0x25dbf8
- /* @?16@0:8 */ dualSelectionHandler; // IMP 0x25dc04
- /* v24@0:8@?16 */ setDualSelectionHandler:; // IMP 0x25dc14
- /* @16@0:8 */ backgroundView; // IMP 0x25dc20
- /* v24@0:8@16 */ setBackgroundView:; // IMP 0x25dd54
- /* @16@0:8 */ scrollView; // IMP 0x25dd68
- /* v24@0:8@16 */ setScrollView:; // IMP 0x25dd78
- /* @16@0:8 */ contentView; // IMP 0x25dd8c
- /* v24@0:8@16 */ setContentView:; // IMP 0x25dd9c
- /* @16@0:8 */ pickerHeaderLabel; // IMP 0x25df04
- /* v24@0:8@16 */ setPickerHeaderLabel:; // IMP 0x25df14
- /* @16@0:8 */ paletteHeaderLabel; // IMP 0x25df28
- /* v24@0:8@16 */ setPaletteHeaderLabel:; // IMP 0x25e028
- /* @16@0:8 */ commonHeaderLabel; // IMP 0x25e1a8
- /* v24@0:8@16 */ setCommonHeaderLabel:; // IMP 0x25e2b4
- /* @16@0:8 */ controlCard; // IMP 0x25e2c8
- /* v24@0:8@16 */ setControlCard:; // IMP 0x25e2d8
- /* @16@0:8 */ paletteCard; // IMP 0x25e2ec
- /* v24@0:8@16 */ setPaletteCard:; // IMP 0x25e2fc
- /* @16@0:8 */ commonCard; // IMP 0x25e47c
- /* v24@0:8@16 */ setCommonCard:; // IMP 0x25e48c
- /* @16@0:8 */ hexLabel; // IMP 0x25e5f4
- /* v24@0:8@16 */ setHexLabel:; // IMP 0x25e604
- /* @16@0:8 */ hexHintLabel; // IMP 0x25e77c
- /* v24@0:8@16 */ setHexHintLabel:; // IMP 0x25e78c
- /* @16@0:8 */ hexField; // IMP 0x25e90c
- /* v24@0:8@16 */ setHexField:; // IMP 0x25e91c
- /* @16@0:8 */ previewView; // IMP 0x25e930
- /* v24@0:8@16 */ setPreviewView:; // IMP 0x25ea64
- /* @16@0:8 */ canvasView; // IMP 0x25ea78
- /* v24@0:8@16 */ setCanvasView:; // IMP 0x25ebbc
- /* @16@0:8 */ hueBarView; // IMP 0x25ed3c
- /* v24@0:8@16 */ setHueBarView:; // IMP 0x25ee60
- /* @16@0:8 */ canvasKnob; // IMP 0x25ee74
- /* v24@0:8@16 */ setCanvasKnob:; // IMP 0x25ee84
- /* @16@0:8 */ hueKnob; // IMP 0x25eff4
- /* v24@0:8@16 */ setHueKnob:; // IMP 0x25f004
- /* @16@0:8 */ channelLabels; // IMP 0x25f018
- /* v24@0:8@16 */ setChannelLabels:; // IMP 0x25f028
- /* @16@0:8 */ channelSliders; // IMP 0x25f170
- /* v24@0:8@16 */ setChannelSliders:; // IMP 0x25f180
- /* @16@0:8 */ channelFields; // IMP 0x25f18c
- /* v24@0:8@16 */ setChannelFields:; // IMP 0x25f268
- /* @16@0:8 */ paletteScrollView; // IMP 0x25f274
- /* v24@0:8@16 */ setPaletteScrollView:; // IMP 0x25f284
- /* @16@0:8 */ paletteButtons; // IMP 0x25f3f4
- /* v24@0:8@16 */ setPaletteButtons:; // IMP 0x25f404
- /* @16@0:8 */ paletteModes; // IMP 0x25f410
- /* v24@0:8@16 */ setPaletteModes:; // IMP 0x25f420
- /* @16@0:8 */ commonButtons; // IMP 0x25f42c
- /* v24@0:8@16 */ setCommonButtons:; // IMP 0x25f43c
- /* @16@0:8 */ commonLabels; // IMP 0x25f448
- /* v24@0:8@16 */ setCommonLabels:; // IMP 0x25f458
- /* @16@0:8 */ commonModes; // IMP 0x25f464
- /* v24@0:8@16 */ setCommonModes:; // IMP 0x25f558
- /* @16@0:8 */ appearanceControl; // IMP 0x25f564
- /* v24@0:8@16 */ setAppearanceControl:; // IMP 0x25f574
- /* @16@0:8 */ currentTitleLabel; // IMP 0x25f588
- /* v24@0:8@16 */ setCurrentTitleLabel:; // IMP 0x25f6bc
- /* @16@0:8 */ currentHexLabel; // IMP 0x25f6d0
- /* v24@0:8@16 */ setCurrentHexLabel:; // IMP 0x25f6e0
- /* @16@0:8 */ currentDot; // IMP 0x25f6f4
- /* v24@0:8@16 */ setCurrentDot:; // IMP 0x25f704
- /* d16@0:8 */ red; // IMP 0x25f718
- /* v24@0:8d16 */ setRed:; // IMP 0x25f728
- /* d16@0:8 */ green; // IMP 0x25f738
- /* v24@0:8d16 */ setGreen:; // IMP 0x25f748
- /* d16@0:8 */ blue; // IMP 0x25f87c
- /* v24@0:8d16 */ setBlue:; // IMP 0x25f88c
- /* d16@0:8 */ alpha; // IMP 0x25f89c
- /* v24@0:8d16 */ setAlpha:; // IMP 0x25f8ac
- /* d16@0:8 */ hue; // IMP 0x25f8bc
- /* v24@0:8d16 */ setHue:; // IMP 0x25f8cc
- /* d16@0:8 */ saturation; // IMP 0x25f8dc
- /* v24@0:8d16 */ setSaturation:; // IMP 0x25f8ec
- /* d16@0:8 */ brightness; // IMP 0x25f8fc
- /* v24@0:8d16 */ setBrightness:; // IMP 0x25fa24
- /* q16@0:8 */ pendingMode; // IMP 0x25fb58
- /* v24@0:8q16 */ setPendingMode:; // IMP 0x25fb68
- /* q16@0:8 */ lightMode; // IMP 0x25fb78
- /* v24@0:8q16 */ setLightMode:; // IMP 0x25fb88
- /* q16@0:8 */ darkMode; // IMP 0x25fb98
- /* v24@0:8q16 */ setDarkMode:; // IMP 0x25fba8
- /* B16@0:8 */ dualAppearanceMode; // IMP 0x25fbb8
- /* v20@0:8B16 */ setDualAppearanceMode:; // IMP 0x25fce0
- /* B16@0:8 */ editingDarkAppearance; // IMP 0x25fe0c
- /* v20@0:8B16 */ setEditingDarkAppearance:; // IMP 0x25fe1c
- /* B16@0:8 */ updatingUI; // IMP 0x25fe2c
- /* v20@0:8B16 */ setUpdatingUI:; // IMP 0x25fe3c
- /* B16@0:8 */ savedPopGestureEnabled; // IMP 0x25fe4c
- /* v20@0:8B16 */ setSavedPopGestureEnabled:; // IMP 0x25ff3c
- /* @16@0:8 */ explicitTitle; // IMP 0x260064
- /* v24@0:8@16 */ setExplicitTitle:; // IMP 0x260074
- /* B16@0:8 */ hasExplicitInitialMode; // IMP 0x2601d8
- /* v20@0:8B16 */ setHasExplicitInitialMode:; // IMP 0x2601e8
- /* q16@0:8 */ explicitInitialMode; // IMP 0x2601f8
- /* v24@0:8q16 */ setExplicitInitialMode:; // IMP 0x260208
- /* v16@0:8 */ .cxx_destruct; // IMP 0x26032c
@end

@interface WCLGConfig /* VM 0x4c57c8 */
+ /* @16@0:8 */ sharedConfig; // IMP 0x265c7c
- /* @16@0:8 */ init; // IMP 0x265d18
- /* v16@0:8 */ dealloc; // IMP 0x265e88
- /* v16@0:8 */ primeDefaults; // IMP 0x265f0c
- /* v16@0:8 */ refreshAtomicMirrors; // IMP 0x26ee74
- /* v32@0:8@16@24 */ maybeUpdateMirrorForKey:value:; // IMP 0x27cac0
- /* @24@0:8@16 */ cachedObjectForKey:; // IMP 0x28ba98
- /* v32@0:8@16@24 */ setCachedObject:forKey:; // IMP 0x28bc9c
- /* v16@0:8 */ flushScheduled; // IMP 0x28be5c
- /* B24@0:8@16 */ boolForKey:; // IMP 0x28c060
- /* B28@0:8@16B24 */ boolForKey:defaultValue:; // IMP 0x28c070
- /* q24@0:8@16 */ integerForKey:; // IMP 0x28c124
- /* q32@0:8@16q24 */ integerForKey:defaultValue:; // IMP 0x28c134
- /* d24@0:8@16 */ doubleForKey:; // IMP 0x28c1a8
- /* @24@0:8@16 */ objectForKey:; // IMP 0x28c21c
- /* v28@0:8B16@20 */ setBool:forKey:; // IMP 0x28c228
- /* v20@0:8B16 */ setLiquidGlassPersistedPendingValue:; // IMP 0x28cb04
- /* v32@0:8q16@24 */ setInteger:forKey:; // IMP 0x28cee0
- /* v32@0:8d16@24 */ setDouble:forKey:; // IMP 0x28cf6c
- /* v32@0:8@16@24 */ setObject:forKey:; // IMP 0x28cff8
- /* B24@0:8@16 */ hasValueForKey:; // IMP 0x28d004
- /* d24@0:8q16 */ tabBarIconOffsetXForSizeMode:; // IMP 0x28d040
- /* d24@0:8q16 */ tabBarIconOffsetYForSizeMode:; // IMP 0x28d368
- /* d24@0:8q16 */ tabBarIconSpacingForSizeMode:; // IMP 0x28d68c
- /* v32@0:8d16q24 */ setTabBarIconOffsetX:forSizeMode:; // IMP 0x28d994
- /* v32@0:8d16q24 */ setTabBarIconOffsetY:forSizeMode:; // IMP 0x28dcbc
- /* v32@0:8d16q24 */ setTabBarIconSpacing:forSizeMode:; // IMP 0x28dfd4
- /* d24@0:8q16 */ tabBarIconScaleForSizeMode:; // IMP 0x28e2e8
- /* v32@0:8d16q24 */ setTabBarIconScale:forSizeMode:; // IMP 0x28e5bc
- /* B16@0:8 */ liquidGlassEnabled; // IMP 0x28e88c
- /* B16@0:8 */ compatEnabled; // IMP 0x28e89c
- /* B16@0:8 */ hideTitlesEnabled; // IMP 0x28e8ac
- /* B16@0:8 */ chatBottomGlassEnabled; // IMP 0x28e8bc
- /* B16@0:8 */ chatBottomSMSHideEmojiIconEnabled; // IMP 0x28e8cc
- /* B16@0:8 */ chatBottomHoldKeyToTalkEnabled; // IMP 0x28e8dc
- /* B16@0:8 */ chatBottomVoiceWaveColorLock; // IMP 0x28e8ec
- /* B16@0:8 */ chatAvatarGestureEnabled; // IMP 0x28eb70
- /* q16@0:8 */ chatAvatarGestureTrigger; // IMP 0x28eb80
- /* B16@0:8 */ chatBottomSMSUseMessageIconsEnabled; // IMP 0x28eb8c
- /* q16@0:8 */ chatBottomSMSMessageIconWeightMode; // IMP 0x28eb9c
- /* B16@0:8 */ chatBottomTGUseMessageIconsEnabled; // IMP 0x28eba8
- /* q16@0:8 */ chatBottomTGMessageIconWeightMode; // IMP 0x28ebb8
- /* q16@0:8 */ chatBottomTGAvatarMode; // IMP 0x28ebc4
- /* B16@0:8 */ chatBottomTGAvatarEnabled; // IMP 0x28ebd0
- /* B16@0:8 */ chatBubbleGlassEnabled; // IMP 0x28ebe0
- /* B16@0:8 */ topNavigationAlignmentEnabled; // IMP 0x28ebf0
- /* B16@0:8 */ homeSearchButtonEnabled; // IMP 0x28ec00
- /* B16@0:8 */ chatTitleCapsuleEnabled; // IMP 0x28ed94
- /* B16@0:8 */ chatTitleCapsuleSearchEnabled; // IMP 0x28eda4
- /* B16@0:8 */ chatNativeProfileTitleEnabled; // IMP 0x28edb4
- /* B16@0:8 */ chatTopCapsuleAvatarEnabled; // IMP 0x28edc4
- /* B16@0:8 */ chatTopCapsuleSubtitleEnabled; // IMP 0x28edd4
- /* B16@0:8 */ chatTopCapsuleLeftEnabled; // IMP 0x28ede4
- /* B16@0:8 */ chatTopCapsuleSubtitleIconEnabled; // IMP 0x28edf4
- /* B16@0:8 */ chatNativeProfilePinnedOffsetEnabled; // IMP 0x28ee04
- /* B16@0:8 */ chatTopMorphActionEnabled; // IMP 0x28ee14
- /* q16@0:8 */ privateChatTopMorphDefault; // IMP 0x28ee24
- /* q16@0:8 */ groupChatTopMorphDefault; // IMP 0x28ee30
- /* B16@0:8 */ chatTopMorphSMSIconsEnabled; // IMP 0x28ee3c
- /* q16@0:8 */ chatTopMorphSMSIconWeightMode; // IMP 0x28ee4c
- /* B16@0:8 */ smsBackTextEnabled; // IMP 0x28ee58
- /* q16@0:8 */ smsBackIconWeightMode; // IMP 0x28ee68
- /* B16@0:8 */ smsHomeAddIconEnabled; // IMP 0x28ee74
- /* q16@0:8 */ smsHomeAddIconWeightMode; // IMP 0x28ee84
- /* B16@0:8 */ smsBottomBarIconEnabled; // IMP 0x28ee90
- /* B16@0:8 */ chatPlusSMSMenuEnabled; // IMP 0x28eea0
- /* B16@0:8 */ richCardPaymentBubbleEnabled; // IMP 0x28eeb0
- /* B16@0:8 */ voIPBubbleGlassEnabled; // IMP 0x28eec0
- /* B16@0:8 */ longPressMenuGlassEnabled; // IMP 0x28eed0
- /* B16@0:8 */ chatBubbleFlowGradientEnabled; // IMP 0x28eee0
- /* B16@0:8 */ chatBubbleFlowBorderEnabled; // IMP 0x28eef0
- /* B16@0:8 */ chatBubbleFlowRichMediaEnabled; // IMP 0x28eef8
- /* B16@0:8 */ chatBubbleFlowVoIPEnabled; // IMP 0x28ef08
- /* B16@0:8 */ hideVoiceTranscribeIconEnabled; // IMP 0x28ef18
- /* B16@0:8 */ deleteSessionImmediately; // IMP 0x28ef28
- /* B16@0:8 */ hideHomeWeChatTitleEnabled; // IMP 0x28ef38
- /* B16@0:8 */ chatBottomGradientBackgroundEnabled; // IMP 0x28ef48
- /* B16@0:8 */ homeWallpaperScrimEnabled; // IMP 0x28ef58
- /* B16@0:8 */ homeWallpaperExtraTabsEnabled; // IMP 0x28ef68
- /* B16@0:8 */ chatBottomPlaceholderEnabled; // IMP 0x28ef78
- /* B16@0:8 */ customFadeEnabled; // IMP 0x28ef88
- /* B16@0:8 */ homeTopFadeEnabled; // IMP 0x28ef98
- /* B16@0:8 */ chatTopFadeEnabled; // IMP 0x28efa8
- /* B16@0:8 */ homeBottomFadeEnabled; // IMP 0x28efb8
- /* B16@0:8 */ tabBarExtraClearEnabled; // IMP 0x28efc8
- /* q16@0:8 */ unreadBackCapsuleMode; // IMP 0x28f160
- /* B16@0:8 */ tabBarRightSearchEnabled; // IMP 0x28f16c
- /* B16@0:8 */ searchTabBarEnabled; // IMP 0x28f314
- /* B16@0:8 */ disablePullDownMiniProgramEnabled; // IMP 0x28f324
- /* B16@0:8 */ plusMenuMiniProgramEntryEnabled; // IMP 0x28f334
- /* q16@0:8 */ glassSizeMode; // IMP 0x28f344
- /* q16@0:8 */ tabBarRightSearchSizeMode; // IMP 0x28f534
- /* q16@0:8 */ searchTabBarSizeMode; // IMP 0x28f794
- /* q16@0:8 */ chatBottomGlassMode; // IMP 0x28f7a0
- /* q16@0:8 */ chatBottomSMSSendColorMode; // IMP 0x28f7ac
- /* q16@0:8 */ chatBottomSMSSendDarkColorMode; // IMP 0x28f7b8
- /* q16@0:8 */ smsBottomBarIconLightColorMode; // IMP 0x28f7c4
- /* q16@0:8 */ smsBottomBarIconDarkColorMode; // IMP 0x28f7d0
- /* q16@0:8 */ chatBubbleOutgoingColorMode; // IMP 0x28f7dc
- /* q16@0:8 */ chatBubbleIncomingColorMode; // IMP 0x28f7e8
- /* q16@0:8 */ chatBubbleOutgoingDarkColorMode; // IMP 0x28f7f4
- /* q16@0:8 */ chatBubbleIncomingDarkColorMode; // IMP 0x28f800
- /* q16@0:8 */ chatBubblePaymentTextColorMode; // IMP 0x28f80c
- /* q16@0:8 */ chatBubblePaymentTextDarkColorMode; // IMP 0x28f818
- /* B16@0:8 */ chatBubbleTextColorEnabled; // IMP 0x28f824
- /* q16@0:8 */ chatBubbleTextSendColorMode; // IMP 0x28f834
- /* q16@0:8 */ chatBubbleTextSendDarkColorMode; // IMP 0x28f840
- /* q16@0:8 */ chatBubbleTextRecvColorMode; // IMP 0x28f84c
- /* q16@0:8 */ chatBubbleTextRecvDarkColorMode; // IMP 0x28f858
- /* B16@0:8 */ chatBubbleCompactEnabled; // IMP 0x28f864
- /* q16@0:8 */ chatBubbleCompactAvatarPosition; // IMP 0x28f874
- /* q16@0:8 */ chatBubbleCompactGap; // IMP 0x28f880
- /* q16@0:8 */ chatBubbleCompactGapGroup; // IMP 0x28f88c
- /* q16@0:8 */ chatBubbleCompactGapGroupSend; // IMP 0x28f898
- /* q16@0:8 */ chatBubbleCompactGapPrivate; // IMP 0x28f8a4
- /* B16@0:8 */ avatarScaleEnabled; // IMP 0x28f8b0
- /* q16@0:8 */ avatarScaleChatList; // IMP 0x28f8c0
- /* q16@0:8 */ avatarScaleChat; // IMP 0x28f8cc
- /* q16@0:8 */ avatarScaleContacts; // IMP 0x28f8d8
- /* q16@0:8 */ avatarScaleDiscover; // IMP 0x28f8e4
- /* B16@0:8 */ chatTopButtonAvatarEnabled; // IMP 0x28f8f0
- /* q16@0:8 */ chatTopButtonAvatarSource; // IMP 0x28f900
- /* q16@0:8 */ chatTopButtonAvatarScale; // IMP 0x28f90c
- /* B16@0:8 */ bubbleImageEnabled; // IMP 0x28f918
- /* B16@0:8 */ chatBubbleCompactSkipTime; // IMP 0x28f928
- /* B16@0:8 */ chatBubbleMergeHideTimeBar; // IMP 0x28f938
- /* B16@0:8 */ chatBubbleMergeAvatarBottomAlign; // IMP 0x28f948
- /* B16@0:8 */ chatBubbleMergePrivate; // IMP 0x28f958
- /* B16@0:8 */ chatBubbleMergeGroup; // IMP 0x28f968
- /* q16@0:8 */ chatBubbleMergeBubbleInset; // IMP 0x28f978
- /* q16@0:8 */ chatBubbleMergeAvatarInset; // IMP 0x28f984
- /* q16@0:8 */ chatBubbleMergePageInset; // IMP 0x28f990
- /* B16@0:8 */ chatIndentEnabled; // IMP 0x28f99c
- /* q16@0:8 */ chatIndentGroupRecv; // IMP 0x28f9ac
- /* q16@0:8 */ chatIndentGroupSend; // IMP 0x28f9b8
- /* q16@0:8 */ chatIndentPrivateRecv; // IMP 0x28f9c4
- /* q16@0:8 */ chatIndentPrivateSend; // IMP 0x28f9d0
- /* q16@0:8 */ chatBubbleFlowStartColorMode; // IMP 0x28f9dc
- /* q16@0:8 */ chatBubbleFlowEndColorMode; // IMP 0x28f9e8
- /* q16@0:8 */ chatBubbleFlowDarkStartColorMode; // IMP 0x28f9f4
- /* q16@0:8 */ chatBubbleFlowDarkEndColorMode; // IMP 0x28fa00
- /* q16@0:8 */ groupChatAvatarHideMode; // IMP 0x28fa0c
- /* q16@0:8 */ privateChatAvatarHideMode; // IMP 0x28fa18
- /* B24@0:8@16 */ shouldForceTrueForUserDefaultsKey:; // IMP 0x28fa24
- /* v16@0:8 */ flush; // IMP 0x28feb8
- /* v16@0:8 */ invalidateCache; // IMP 0x28ff0c
- /* v16@0:8 */ .cxx_destruct; // IMP 0x290134
@end

@interface WCLGGlassThemeCell /* VM 0x4c5818 */
- /* @32@0:8q16@24 */ initWithStyle:reuseIdentifier:; // IMP 0x29606c
- /* v24@0:8@16 */ configure:; // IMP 0x297720
- /* @16@0:8 */ thumb; // IMP 0x297fb4
- /* v24@0:8@16 */ setThumb:; // IMP 0x297fc4
- /* @16@0:8 */ nameLabel; // IMP 0x297fd8
- /* v24@0:8@16 */ setNameLabel:; // IMP 0x297fe8
- /* @16@0:8 */ subLabel; // IMP 0x297ffc
- /* v24@0:8@16 */ setSubLabel:; // IMP 0x29800c
- /* @16@0:8 */ verLabel; // IMP 0x298020
- /* v24@0:8@16 */ setVerLabel:; // IMP 0x298030
- /* @16@0:8 */ statusChip; // IMP 0x298044
- /* v24@0:8@16 */ setStatusChip:; // IMP 0x298054
- /* @16@0:8 */ chevron; // IMP 0x298068
- /* v24@0:8@16 */ setChevron:; // IMP 0x298078
- /* @16@0:8 */ theme; // IMP 0x29808c
- /* v24@0:8@16 */ setTheme:; // IMP 0x29809c
- /* v16@0:8 */ .cxx_destruct; // IMP 0x2980b0
@end

@interface WCLGDownloadCenterViewController /* VM 0x4c5868 */
- /* v16@0:8 */ viewDidLoad; // IMP 0x298154
- /* v16@0:8 */ viewDidLayoutSubviews; // IMP 0x298f30
- /* v16@0:8 */ segChanged; // IMP 0x2991b8
- /* v16@0:8 */ openRedeemCenter; // IMP 0x29920c
- /* v16@0:8 */ reload; // IMP 0x29964c
- /* @16@0:8 */ current; // IMP 0x299dd4
- /* v16@0:8 */ updateEmpty; // IMP 0x299e50
- /* q32@0:8@16q24 */ tableView:numberOfRowsInSection:; // IMP 0x299ed8
- /* @32@0:8@16@24 */ tableView:cellForRowAtIndexPath:; // IMP 0x299f24
- /* v32@0:8@16@24 */ tableView:didSelectRowAtIndexPath:; // IMP 0x29a078
- /* v24@0:8@16 */ showDetail:; // IMP 0x29a140
- /* v16@0:8 */ dismissSelf; // IMP 0x29a2ec
- /* v24@0:8@16 */ toast:; // IMP 0x29a300
- /* @16@0:8 */ seg; // IMP 0x29a37c
- /* v24@0:8@16 */ setSeg:; // IMP 0x29a38c
- /* @16@0:8 */ segBar; // IMP 0x29a3a0
- /* v24@0:8@16 */ setSegBar:; // IMP 0x29a3b0
- /* @16@0:8 */ bg; // IMP 0x29a3c4
- /* v24@0:8@16 */ setBg:; // IMP 0x29a3d4
- /* @16@0:8 */ tableView; // IMP 0x29a3e8
- /* v24@0:8@16 */ setTableView:; // IMP 0x29a3f8
- /* @16@0:8 */ spinner; // IMP 0x29a40c
- /* v24@0:8@16 */ setSpinner:; // IMP 0x29a41c
- /* @16@0:8 */ emptyLabel; // IMP 0x29a430
- /* v24@0:8@16 */ setEmptyLabel:; // IMP 0x29a440
- /* @16@0:8 */ bubbles; // IMP 0x29a454
- /* v24@0:8@16 */ setBubbles:; // IMP 0x29a464
- /* @16@0:8 */ cards; // IMP 0x29a478
- /* v24@0:8@16 */ setCards:; // IMP 0x29a488
- /* Q16@0:8 */ reloadGeneration; // IMP 0x29a49c
- /* v24@0:8Q16 */ setReloadGeneration:; // IMP 0x29a4ac
- /* v16@0:8 */ .cxx_destruct; // IMP 0x29a4bc
@end

@interface WCLGVariableBlurHostView /* VM 0x4c58b8 */
- /* @48@0:8{CGRect={CGPoint=dd}{CGSize=dd}}16 */ initWithFrame:; // IMP 0x29a6dc
- /* v16@0:8 */ layoutSubviews; // IMP 0x29a9dc
- /* @16@0:8 */ backdropLayer; // IMP 0x29aa8c
- /* v24@0:8@16 */ setBackdropLayer:; // IMP 0x29aa9c
- /* @16@0:8 */ gradientImage; // IMP 0x29aab0
- /* v24@0:8@16 */ setGradientImage:; // IMP 0x29aac0
- /* {CGSize=dd}16@0:8 */ lastSize; // IMP 0x29aad4
- /* v32@0:8{CGSize=dd}16 */ setLastSize:; // IMP 0x29aae8
- /* d16@0:8 */ lastConstantHeight; // IMP 0x29aafc
- /* v24@0:8d16 */ setLastConstantHeight:; // IMP 0x29ab0c
- /* B16@0:8 */ lastInverted; // IMP 0x29ab1c
- /* v20@0:8B16 */ setLastInverted:; // IMP 0x29ab2c
- /* d16@0:8 */ lastGradientHeight; // IMP 0x29ab3c
- /* v24@0:8d16 */ setLastGradientHeight:; // IMP 0x29ab4c
- /* v16@0:8 */ .cxx_destruct; // IMP 0x29ab5c
@end

@interface WCLGEdgeEffectView /* VM 0x4c5908 */
- /* @48@0:8{CGRect={CGPoint=dd}{CGSize=dd}}16 */ initWithFrame:; // IMP 0x29b1d4
- /* v92@0:8@16B24d28{CGRect={CGPoint=dd}{CGSize=dd}}36q68d76d84 */ updateWithContentColor:blur:alpha:rect:edge:edgeSize:blurRadius:; // IMP 0x29b548
- /* B16@0:8 */ isBlurEnabled; // IMP 0x29c588
- /* v20@0:8B16 */ setBlurEnabled:; // IMP 0x29c598
- /* @16@0:8 */ contentView; // IMP 0x29c5a8
- /* v24@0:8@16 */ setContentView:; // IMP 0x29c5b8
- /* @16@0:8 */ contentMaskView; // IMP 0x29c5cc
- /* v24@0:8@16 */ setContentMaskView:; // IMP 0x29c5dc
- /* @16@0:8 */ blurHostView; // IMP 0x29c5f0
- /* v24@0:8@16 */ setBlurHostView:; // IMP 0x29c600
- /* @16@0:8 */ fallbackBlurView; // IMP 0x29c614
- /* v24@0:8@16 */ setFallbackBlurView:; // IMP 0x29c624
- /* @16@0:8 */ lastContentColor; // IMP 0x29c638
- /* v24@0:8@16 */ setLastContentColor:; // IMP 0x29c648
- /* B16@0:8 */ lastBlur; // IMP 0x29c65c
- /* v20@0:8B16 */ setLastBlur:; // IMP 0x29c66c
- /* d16@0:8 */ lastAlpha; // IMP 0x29c67c
- /* v24@0:8d16 */ setLastAlpha:; // IMP 0x29c68c
- /* {CGRect={CGPoint=dd}{CGSize=dd}}16@0:8 */ lastRect; // IMP 0x29c69c
- /* v48@0:8{CGRect={CGPoint=dd}{CGSize=dd}}16 */ setLastRect:; // IMP 0x29c6b4
- /* q16@0:8 */ lastEdge; // IMP 0x29c6cc
- /* v24@0:8q16 */ setLastEdge:; // IMP 0x29c6dc
- /* d16@0:8 */ lastEdgeSize; // IMP 0x29c6ec
- /* v24@0:8d16 */ setLastEdgeSize:; // IMP 0x29c6fc
- /* d16@0:8 */ lastBlurRadius; // IMP 0x29c70c
- /* v24@0:8d16 */ setLastBlurRadius:; // IMP 0x29c71c
- /* v16@0:8 */ .cxx_destruct; // IMP 0x29c72c
@end

@interface WCLGFuncCardMediaController /* VM 0x4c5958 */
- /* @16@0:8 */ init; // IMP 0x29c7a8
- /* @24@0:8@16 */ keyForSchemeTask:; // IMP 0x29cc28
- /* B24@0:8@16 */ isSchemeTaskCancelled:; // IMP 0x29cc3c
- /* v24@0:8@16 */ finishSchemeTask:; // IMP 0x29cd28
- /* B32@0:8@16@?24 */ performSchemeTaskCallback:block:; // IMP 0x29ce40
- /* v32@0:8@16q24 */ failSchemeTask:code:; // IMP 0x29d074
- /* v32@0:8@16@24 */ userContentController:didReceiveScriptMessage:; // IMP 0x29d300
- /* @24@0:8@16 */ contentTypesForAccept:; // IMP 0x2a03d8
- /* @24@0:8@16 */ presenterForWebView:; // IMP 0x2a090c
- /* v32@0:8@16@24 */ deliver:expectedScope:; // IMP 0x2a0c74
- /* v16@0:8 */ clearPendingPicker; // IMP 0x2a1208
- /* v24@0:8@16 */ updateScope:; // IMP 0x2a1318
- /* v32@0:8@16@24 */ documentPicker:didPickDocumentsAtURLs:; // IMP 0x2a1444
- /* v24@0:8@16 */ documentPickerWasCancelled:; // IMP 0x2a3240
- /* v24@0:8@16 */ presentationControllerDidDismiss:; // IMP 0x2a3714
- /* v32@0:8@16@24 */ webView:startURLSchemeTask:; // IMP 0x2a3c28
- /* v32@0:8@16@24 */ webView:stopURLSchemeTask:; // IMP 0x2a7904
- /* @16@0:8 */ webView; // IMP 0x2a7a38
- /* v24@0:8@16 */ setWebView:; // IMP 0x2a7a50
- /* @16@0:8 */ scope; // IMP 0x2a7a5c
- /* v24@0:8@16 */ setScope:; // IMP 0x2a7a64
- /* @16@0:8 */ ioQueue; // IMP 0x2a7a6c
- /* v24@0:8@16 */ setIoQueue:; // IMP 0x2a7a74
- /* @16@0:8 */ stateQueue; // IMP 0x2a7a80
- /* v24@0:8@16 */ setStateQueue:; // IMP 0x2a7a88
- /* @16@0:8 */ activeTasks; // IMP 0x2a7a94
- /* v24@0:8@16 */ setActiveTasks:; // IMP 0x2a7a9c
- /* @16@0:8 */ cancelledTasks; // IMP 0x2a7aa8
- /* v24@0:8@16 */ setCancelledTasks:; // IMP 0x2a7ab0
- /* @16@0:8 */ pageScopes; // IMP 0x2a7abc
- /* v24@0:8@16 */ setPageScopes:; // IMP 0x2a7ac4
- /* @16@0:8 */ pendingPicker; // IMP 0x2a7ad0
- /* v24@0:8@16 */ setPendingPicker:; // IMP 0x2a7ad8
- /* @16@0:8 */ pendingRequestId; // IMP 0x2a7ae4
- /* v24@0:8@16 */ setPendingRequestId:; // IMP 0x2a7aec
- /* @16@0:8 */ pendingToken; // IMP 0x2a7af4
- /* v24@0:8@16 */ setPendingToken:; // IMP 0x2a7afc
- /* @16@0:8 */ pendingScope; // IMP 0x2a7b04
- /* v24@0:8@16 */ setPendingScope:; // IMP 0x2a7b0c
- /* Q16@0:8 */ pendingStorageGeneration; // IMP 0x2a7b14
- /* v24@0:8Q16 */ setPendingStorageGeneration:; // IMP 0x2a7b1c
- /* v16@0:8 */ .cxx_destruct; // IMP 0x2a7b24
@end

@interface WCLGFuncCardPanelView /* VM 0x4c59a8 */
+ /* @16@0:8 */ metricDefinitions; // IMP 0x2dc240
- /* @24@0:8@16 */ initForWindow:; // IMP 0x2dd6f8
- /* @16@0:8 */ primaryTextColor; // IMP 0x2ddb4c
- /* @16@0:8 */ secondaryTextColor; // IMP 0x2ddba8
- /* @16@0:8 */ separatorColor; // IMP 0x2ddc04
- /* v16@0:8 */ buildBlurBackground; // IMP 0x2ddc60
- /* @16@0:8 */ contentHost; // IMP 0x2ddec8
- /* v16@0:8 */ buildHeader; // IMP 0x2dded4
- /* v24@0:8d16 */ buildScrollContent:; // IMP 0x2de5a4
- /* @36@0:8q16@24B32 */ makeRowAtIndex:title:lastRow:; // IMP 0x2df440
- /* @40@0:8q16@24^@32 */ makeColorRowAtIndex:title:swatchOut:; // IMP 0x2df6f0
- /* @32@0:8q16@24 */ makeDisclosureRowAtIndex:title:; // IMP 0x2dfce0
- /* v32@0:8@16@24 */ placeAccessoryControl:inRow:; // IMP 0x2e016c
- /* v40@0:8@16q24@32 */ addStepperForMetric:index:inRow:; // IMP 0x2e025c
- /* v16@0:8 */ closeTapped; // IMP 0x2e0bdc
- /* v24@0:8@16 */ enableSwitchChanged:; // IMP 0x2e0d0c
- /* v24@0:8@16 */ swipeFollowSwitchChanged:; // IMP 0x2e0da4
- /* v24@0:8@16 */ appearanceControlChanged:; // IMP 0x2e0e38
- /* v24@0:8@16 */ stepperChanged:; // IMP 0x2e0ee4
- /* v16@0:8 */ bgColorTapped; // IMP 0x2e1230
- /* v16@0:8 */ borderColorTapped; // IMP 0x2e12c8
- /* v16@0:8 */ codeLibraryTapped; // IMP 0x2e1360
- /* v32@0:8@16@24 */ presentColorPickerKey:title:; // IMP 0x2e1538
- /* v16@0:8 */ dismissTopModal; // IMP 0x2e18a0
- /* v16@0:8 */ refreshColorSwatches; // IMP 0x2e18e0
- /* v24@0:8@16 */ handlePan:; // IMP 0x2e1ad8
- /* {CGPoint=dd}64@0:8{CGPoint=dd}16{CGRect={CGPoint=dd}{CGSize=dd}}32 */ clampedCenter:inBounds:; // IMP 0x2e1c10
- /* B32@0:8@16@24 */ gestureRecognizer:shouldReceiveTouch:; // IMP 0x2e1cd8
- /* @16@0:8 */ panelBG; // IMP 0x2e1d44
- /* v24@0:8@16 */ setPanelBG:; // IMP 0x2e1d54
- /* @16@0:8 */ scrollView; // IMP 0x2e1d68
- /* v24@0:8@16 */ setScrollView:; // IMP 0x2e1d78
- /* @16@0:8 */ enableSwitch; // IMP 0x2e1d8c
- /* v24@0:8@16 */ setEnableSwitch:; // IMP 0x2e1d9c
- /* @16@0:8 */ swipeFollowSwitch; // IMP 0x2e1db0
- /* v24@0:8@16 */ setSwipeFollowSwitch:; // IMP 0x2e1dc0
- /* @16@0:8 */ appearanceControl; // IMP 0x2e1dd4
- /* v24@0:8@16 */ setAppearanceControl:; // IMP 0x2e1de4
- /* @16@0:8 */ bgSwatch; // IMP 0x2e1df8
- /* v24@0:8@16 */ setBgSwatch:; // IMP 0x2e1e08
- /* @16@0:8 */ borderSwatch; // IMP 0x2e1e1c
- /* v24@0:8@16 */ setBorderSwatch:; // IMP 0x2e1e2c
- /* @16@0:8 */ valueLabels; // IMP 0x2e1e40
- /* v24@0:8@16 */ setValueLabels:; // IMP 0x2e1e50
- /* @16@0:8 */ metrics; // IMP 0x2e1e64
- /* v24@0:8@16 */ setMetrics:; // IMP 0x2e1e74
- /* {CGPoint=dd}16@0:8 */ dragStartCenter; // IMP 0x2e1e88
- /* v32@0:8{CGPoint=dd}16 */ setDragStartCenter:; // IMP 0x2e1e9c
- /* B16@0:8 */ darkMode; // IMP 0x2e1eb0
- /* v20@0:8B16 */ setDarkMode:; // IMP 0x2e1ec0
- /* v16@0:8 */ .cxx_destruct; // IMP 0x2e1ed0
@end

@interface WCLGGlassInstalledItem /* VM 0x4c5a20 */
- /* q16@0:8 */ themeId; // IMP 0x2e2538
- /* v24@0:8q16 */ setThemeId:; // IMP 0x2e2540
- /* @16@0:8 */ type; // IMP 0x2e2548
- /* v24@0:8@16 */ setType:; // IMP 0x2e2550
- /* @16@0:8 */ name; // IMP 0x2e2558
- /* v24@0:8@16 */ setName:; // IMP 0x2e2560
- /* @16@0:8 */ subtitle; // IMP 0x2e2568
- /* v24@0:8@16 */ setSubtitle:; // IMP 0x2e2570
- /* @16@0:8 */ iconURL; // IMP 0x2e2578
- /* v24@0:8@16 */ setIconURL:; // IMP 0x2e2580
- /* @16@0:8 */ version; // IMP 0x2e2588
- /* v24@0:8@16 */ setVersion:; // IMP 0x2e2590
- /* q16@0:8 */ versionCode; // IMP 0x2e2598
- /* v24@0:8q16 */ setVersionCode:; // IMP 0x2e25a0
- /* @16@0:8 */ importPath; // IMP 0x2e25a8
- /* v24@0:8@16 */ setImportPath:; // IMP 0x2e25b0
- /* d16@0:8 */ importedAt; // IMP 0x2e25b8
- /* v24@0:8d16 */ setImportedAt:; // IMP 0x2e25c0
- /* v16@0:8 */ .cxx_destruct; // IMP 0x2e25c8
@end

@interface WCLGGlassPackage /* VM 0x4c5a70 */
+ /* @16@0:8 */ supportDir; // IMP 0x2e2628
+ /* @16@0:8 */ vaultDir; // IMP 0x2e282c
+ /* @24@0:8q16 */ vaultPathForTheme:; // IMP 0x2e2990
+ /* @16@0:8 */ indexPath; // IMP 0x2e2ae4
+ /* v16@0:8 */ performConfidentialityMigrationIfNeeded; // IMP 0x2e2c50
+ /* @16@0:8 */ loadIndex; // IMP 0x2e4c10
+ /* v24@0:8@16 */ saveIndex:; // IMP 0x2e4d54
+ /* @64@0:8@16q24@32^{__SecKey=}40@48^@56 */ decryptContainer:themeId:wxid:signKey:glassMaster:error:; // IMP 0x2e4dd8
+ /* B64@0:8@16@24^{__SecKey=}32@40@48^@56 */ importGlassData:wxid:signKey:glassMaster:iconURL:error:; // IMP 0x2e5ecc
+ /* v24@0:8q16 */ invalidateMemoryCacheForTheme:; // IMP 0x2e7228
+ /* @32@0:8q16^@24 */ decryptedPayloadForTheme:error:; // IMP 0x2e727c
+ /* @24@0:8q16 */ filesForTheme:; // IMP 0x2e75a4
+ /* @24@0:8q16 */ manifestForTheme:; // IMP 0x2e7a30
+ /* @24@0:8q16 */ cardHTMLForTheme:; // IMP 0x2e7aa0
+ /* @16@0:8 */ installedVersionMap; // IMP 0x2e7e40
+ /* @16@0:8 */ installedItems; // IMP 0x2e8160
+ /* @24@0:8q16 */ nameForTheme:; // IMP 0x2e8b9c
+ /* @24@0:8q16 */ typeForTheme:; // IMP 0x2e8db4
+ /* q24@0:8@16 */ activeInstalledThemeIdForType:; // IMP 0x2e8f30
+ /* B24@0:8q16 */ applyInstalled:; // IMP 0x2e9610
+ /* B24@0:8@16 */ deactivateInstalledThemeForType:; // IMP 0x2ea4fc
+ /* B24@0:8q16 */ removeInstalled:; // IMP 0x2ea9f8
@end

@interface WCLGGlassTheme /* VM 0x4c5ac0 */
- /* q16@0:8 */ themeId; // IMP 0x2ed314
- /* v24@0:8q16 */ setThemeId:; // IMP 0x2ed31c
- /* @16@0:8 */ type; // IMP 0x2ed324
- /* v24@0:8@16 */ setType:; // IMP 0x2ed32c
- /* @16@0:8 */ name; // IMP 0x2ed334
- /* v24@0:8@16 */ setName:; // IMP 0x2ed33c
- /* @16@0:8 */ subtitle; // IMP 0x2ed344
- /* v24@0:8@16 */ setSubtitle:; // IMP 0x2ed34c
- /* @16@0:8 */ authorName; // IMP 0x2ed354
- /* v24@0:8@16 */ setAuthorName:; // IMP 0x2ed35c
- /* @16@0:8 */ desc; // IMP 0x2ed364
- /* v24@0:8@16 */ setDesc:; // IMP 0x2ed36c
- /* @16@0:8 */ iconURL; // IMP 0x2ed374
- /* v24@0:8@16 */ setIconURL:; // IMP 0x2ed37c
- /* @16@0:8 */ previewURLs; // IMP 0x2ed384
- /* v24@0:8@16 */ setPreviewURLs:; // IMP 0x2ed38c
- /* @16@0:8 */ version; // IMP 0x2ed394
- /* v24@0:8@16 */ setVersion:; // IMP 0x2ed39c
- /* q16@0:8 */ versionCode; // IMP 0x2ed3a4
- /* v24@0:8q16 */ setVersionCode:; // IMP 0x2ed3ac
- /* q16@0:8 */ versionId; // IMP 0x2ed3b4
- /* v24@0:8q16 */ setVersionId:; // IMP 0x2ed3bc
- /* @16@0:8 */ changelog; // IMP 0x2ed3c4
- /* v24@0:8@16 */ setChangelog:; // IMP 0x2ed3cc
- /* B16@0:8 */ hasUpdate; // IMP 0x2ed3d4
- /* v20@0:8B16 */ setHasUpdate:; // IMP 0x2ed3dc
- /* B16@0:8 */ installed; // IMP 0x2ed3e4
- /* v20@0:8B16 */ setInstalled:; // IMP 0x2ed3ec
- /* q16@0:8 */ parentThemeId; // IMP 0x2ed3f4
- /* v24@0:8q16 */ setParentThemeId:; // IMP 0x2ed3fc
- /* @16@0:8 */ subPackages; // IMP 0x2ed404
- /* v24@0:8@16 */ setSubPackages:; // IMP 0x2ed40c
- /* v16@0:8 */ .cxx_destruct; // IMP 0x2ed414
@end

@interface WCGMultiDownloader /* VM 0x4c5b10 */
- /* v16@0:8 */ start; // IMP 0x2ed4a4
- /* v40@0:8{_NSRange=QQ}16@32 */ fetchRange:session:; // IMP 0x2ed9dc
- /* v16@0:8 */ emit; // IMP 0x2ee110
- /* v24@0:8@16 */ finishOnMain:; // IMP 0x2ee2fc
- /* @16@0:8 */ base; // IMP 0x2ee44c
- /* v24@0:8@16 */ setBase:; // IMP 0x2ee454
- /* @16@0:8 */ token; // IMP 0x2ee45c
- /* v24@0:8@16 */ setToken:; // IMP 0x2ee464
- /* q16@0:8 */ size; // IMP 0x2ee46c
- /* v24@0:8q16 */ setSize:; // IMP 0x2ee474
- /* q16@0:8 */ threads; // IMP 0x2ee47c
- /* v24@0:8q16 */ setThreads:; // IMP 0x2ee484
- /* @16@0:8 */ buffer; // IMP 0x2ee48c
- /* v24@0:8@16 */ setBuffer:; // IMP 0x2ee494
- /* q16@0:8 */ received; // IMP 0x2ee4a0
- /* v24@0:8q16 */ setReceived:; // IMP 0x2ee4a8
- /* q16@0:8 */ pending; // IMP 0x2ee4b0
- /* v24@0:8q16 */ setPending:; // IMP 0x2ee4b8
- /* B16@0:8 */ failed; // IMP 0x2ee4c0
- /* v20@0:8B16 */ setFailed:; // IMP 0x2ee4c8
- /* @16@0:8 */ lock; // IMP 0x2ee4d0
- /* v24@0:8@16 */ setLock:; // IMP 0x2ee4d8
- /* @16@0:8 */ speedTimer; // IMP 0x2ee4e4
- /* v24@0:8@16 */ setSpeedTimer:; // IMP 0x2ee4ec
- /* q16@0:8 */ lastSampleBytes; // IMP 0x2ee4f8
- /* v24@0:8q16 */ setLastSampleBytes:; // IMP 0x2ee500
- /* d16@0:8 */ lastSampleTime; // IMP 0x2ee508
- /* v24@0:8d16 */ setLastSampleTime:; // IMP 0x2ee510
- /* @?16@0:8 */ progress; // IMP 0x2ee518
- /* v24@0:8@?16 */ setProgress:; // IMP 0x2ee520
- /* @?16@0:8 */ done; // IMP 0x2ee528
- /* v24@0:8@?16 */ setDone:; // IMP 0x2ee530
- /* v16@0:8 */ .cxx_destruct; // IMP 0x2ee538
@end

@interface WCLGGlassStore /* VM 0x4c5b38 */
+ /* @16@0:8 */ shared; // IMP 0x2ee5a4
- /* ^{__SecKey=}16@0:8 */ apiPubKey; // IMP 0x2ee608
- /* ^{__SecKey=}16@0:8 */ signPubKey; // IMP 0x2f01a0
- /* @16@0:8 */ currentWXID; // IMP 0x2f1934
- /* @40@0:8@16^@24^@32 */ buildRequest:requestKey:nonce:; // IMP 0x2f198c
- /* @40@0:8@16@24@32 */ decryptResponse:requestKey:nonce:; // IMP 0x2f3140
- /* v40@0:8@16@24@?32 */ postPath:payload:completion:; // IMP 0x2f45b4
- /* @24@0:8@16 */ themeFromDict:; // IMP 0x2f52d8
- /* v24@0:8@?16 */ fetchCatalogWithCompletion:; // IMP 0x2f63fc
- /* v32@0:8@16@?24 */ fetchCardPreviewHTMLForTheme:completion:; // IMP 0x2f706c
- /* v32@0:8@16@?24 */ downloadAndImportTheme:completion:; // IMP 0x2f9210
- /* v40@0:8@16@?24@?32 */ downloadAndImportTheme:progress:completion:; // IMP 0x2f9224
- /* ^{__SecKey=}16@0:8 */ glassSignKey; // IMP 0x2fa730
- /* @16@0:8 */ glassMasterKey; // IMP 0x2fa73c
- /* v32@0:8q16@?24 */ revokeTheme:completion:; // IMP 0x2fa94c
- /* v24@0:8^{__SecKey=}16 */ setApiPubKey:; // IMP 0x2faec0
- /* v24@0:8^{__SecKey=}16 */ setSignPubKey:; // IMP 0x2faec8
@end

@interface WCLGGlassBackgroundView /* VM 0x4c5b88 */
- /* @48@0:8{CGRect={CGPoint=dd}{CGSize=dd}}16 */ initWithFrame:; // IMP 0x2faed0
- /* B16@0:8 */ isDark; // IMP 0x2fb370
- /* @16@0:8 */ colorsA; // IMP 0x2fb3c0
- /* @16@0:8 */ colorsB; // IMP 0x2fb620
- /* v16@0:8 */ updateColors; // IMP 0x2fb884
- /* v16@0:8 */ layoutSubviews; // IMP 0x2fba44
- /* v24@0:8@16 */ traitCollectionDidChange:; // IMP 0x2fbb9c
- /* v16@0:8 */ startAnimations; // IMP 0x2fbc68
- /* @16@0:8 */ gradA; // IMP 0x2fbe94
- /* v24@0:8@16 */ setGradA:; // IMP 0x2fbea4
- /* @16@0:8 */ gradB; // IMP 0x2fbeb8
- /* v24@0:8@16 */ setGradB:; // IMP 0x2fbec8
- /* v16@0:8 */ .cxx_destruct; // IMP 0x2fbedc
@end

@interface WCLGGlassUI /* VM 0x4c5c00 */
+ /* @16@0:8 */ cardColor; // IMP 0x2fbf1c
+ /* @16@0:8 */ cardBorderColor; // IMP 0x2fbf8c
+ /* @16@0:8 */ accentColor; // IMP 0x2fbffc
+ /* @24@0:8@16 */ themePlaceholderImageForType:; // IMP 0x2fc028
+ /* v32@0:8@16@24 */ showToast:inView:; // IMP 0x2fc878
+ /* @16@0:8 */ imageCache; // IMP 0x2fd084
+ /* @16@0:8 */ imageCacheQueue; // IMP 0x2fd118
+ /* @16@0:8 */ imageInflightRequests; // IMP 0x2fd3c4
+ /* @24@0:8@16 */ normalizedImageURLString:; // IMP 0x2fd430
+ /* @16@0:8 */ themeIconCacheDirectory; // IMP 0x2fd6a8
+ /* @24@0:8@16 */ themeIconCachePathForURL:; // IMP 0x2fda7c
+ /* Q32@0:8@16Q24 */ memoryCostForImage:fallback:; // IMP 0x2fdcf8
+ /* @24@0:8@16 */ decodedImageFromData:; // IMP 0x2fdd68
+ /* @24@0:8@16 */ themeIconImageFromDiskForURL:; // IMP 0x2fde6c
+ /* v16@0:8 */ trimThemeIconDiskCacheIfNeeded; // IMP 0x2fe150
+ /* B32@0:8@16@?24 */ registerImageRequestForKey:completion:; // IMP 0x2fe9d0
+ /* v32@0:8@16@24 */ finishImageRequestForKey:image:; // IMP 0x2feb60
+ /* v36@0:8@16B24@?28 */ requestImageAtURLString:persistToDisk:completion:; // IMP 0x2fede8
+ /* v32@0:8@16@?24 */ prewarmThemeIconCacheForURLs:completion:; // IMP 0x2ff77c
+ /* v32@0:8@16@24 */ loadImage:into:; // IMP 0x2ffbcc
+ /* v40@0:8@16@24@32 */ loadImage:themeType:into:; // IMP 0x2ffbe0
@end

@interface WCLGGroupMemberPicker /* VM 0x4c5c28 */
+ /* v64@0:8@16@24@32@40@48@?56 */ presentForGroupID:title:preselectedMembers:sessionUsernames:fromController:onComplete:; // IMP 0x30000c
+ /* v48@0:8@16@24@32@?40 */ presentSingleSelectWithTitle:excludeMembers:fromController:onPick:; // IMP 0x300860
- /* v16@0:8 */ viewDidLoad; // IMP 0x30108c
- /* v16@0:8 */ setupSingleSelect; // IMP 0x301b44
- /* v24@0:8@16 */ onSingleModeChanged:; // IMP 0x302398
- /* v16@0:8 */ buildSessionRows; // IMP 0x302718
- /* v16@0:8 */ ensureContactsLoaded; // IMP 0x3036ac
- /* v16@0:8 */ ensureLabelsLoaded; // IMP 0x303d7c
- /* v16@0:8 */ ensureChatroomsLoaded; // IMP 0x30527c
- /* v16@0:8 */ applyFilter; // IMP 0x306040
- /* v24@0:8@16 */ onModeChanged:; // IMP 0x306ca4
- /* v16@0:8 */ updateDoneTitle; // IMP 0x3073dc
- /* v16@0:8 */ onCancel; // IMP 0x30795c
- /* v16@0:8 */ onDone; // IMP 0x3079e8
- /* v32@0:8@16@24 */ searchBar:textDidChange:; // IMP 0x307c9c
- /* v24@0:8@16 */ searchBarSearchButtonClicked:; // IMP 0x307d30
- /* q32@0:8@16q24 */ tableView:numberOfRowsInSection:; // IMP 0x307db4
- /* @32@0:8@16@24 */ tableView:cellForRowAtIndexPath:; // IMP 0x307e74
- /* @32@0:8@16q24 */ tableView:titleForHeaderInSection:; // IMP 0x309f18
- /* v32@0:8@16@24 */ tableView:didSelectRowAtIndexPath:; // IMP 0x30a970
- /* @16@0:8 */ groupID; // IMP 0x30c58c
- /* v24@0:8@16 */ setGroupID:; // IMP 0x30c5f8
- /* @?16@0:8 */ onComplete; // IMP 0x30c690
- /* v24@0:8@?16 */ setOnComplete:; // IMP 0x30c6fc
- /* @16@0:8 */ selected; // IMP 0x30c798
- /* v24@0:8@16 */ setSelected:; // IMP 0x30c800
- /* @16@0:8 */ sessionUsernames; // IMP 0x30c89c
- /* v24@0:8@16 */ setSessionUsernames:; // IMP 0x30c908
- /* @16@0:8 */ sessionRows; // IMP 0x30c990
- /* v24@0:8@16 */ setSessionRows:; // IMP 0x30c9fc
- /* @16@0:8 */ contactRows; // IMP 0x30ca98
- /* v24@0:8@16 */ setContactRows:; // IMP 0x30cb00
- /* @16@0:8 */ filteredRows; // IMP 0x30cb7c
- /* v24@0:8@16 */ setFilteredRows:; // IMP 0x30cbe4
- /* @16@0:8 */ labels; // IMP 0x30cc80
- /* v24@0:8@16 */ setLabels:; // IMP 0x30cce8
- /* @16@0:8 */ chatroomRows; // IMP 0x30cd7c
- /* v24@0:8@16 */ setChatroomRows:; // IMP 0x30cde4
- /* B16@0:8 */ contactsLoaded; // IMP 0x30ce7c
- /* v20@0:8B16 */ setContactsLoaded:; // IMP 0x30cee8
- /* B16@0:8 */ labelsLoaded; // IMP 0x30cf50
- /* v20@0:8B16 */ setLabelsLoaded:; // IMP 0x30cfbc
- /* B16@0:8 */ chatroomsLoaded; // IMP 0x30d02c
- /* v20@0:8B16 */ setChatroomsLoaded:; // IMP 0x30d09c
- /* B16@0:8 */ singleSelect; // IMP 0x30d0fc
- /* v20@0:8B16 */ setSingleSelect:; // IMP 0x30d164
- /* @?16@0:8 */ onPick; // IMP 0x30d1c8
- /* v24@0:8@?16 */ setOnPick:; // IMP 0x30d230
- /* @16@0:8 */ excluded; // IMP 0x30d2c8
- /* v24@0:8@16 */ setExcluded:; // IMP 0x30d330
- /* q16@0:8 */ mode; // IMP 0x30d3d0
- /* v24@0:8q16 */ setMode:; // IMP 0x30d438
- /* @16@0:8 */ segmented; // IMP 0x30d4a4
- /* v24@0:8@16 */ setSegmented:; // IMP 0x30d50c
- /* @16@0:8 */ tableView; // IMP 0x30d5a0
- /* v24@0:8@16 */ setTableView:; // IMP 0x30d60c
- /* @16@0:8 */ searchBar; // IMP 0x30d6a4
- /* v24@0:8@16 */ setSearchBar:; // IMP 0x30d70c
- /* @16@0:8 */ searchText; // IMP 0x30d7a0
- /* v24@0:8@16 */ setSearchText:; // IMP 0x30d808
- /* v16@0:8 */ .cxx_destruct; // IMP 0x30d86c
@end

@interface WCLGFriendCapsuleButton /* VM 0x4c5c78 */
+ /* @16@0:8 */ wclgCapsuleConfiguration; // IMP 0x3130c0
- /* @48@0:8{CGRect={CGPoint=dd}{CGSize=dd}}16 */ initWithFrame:; // IMP 0x313348
- /* v16@0:8 */ didMoveToWindow; // IMP 0x313b00
- /* v32@0:8@16q24 */ configureUsername:unread:; // IMP 0x313be8
- /* v24@0:8q16 */ setUnreadCount:; // IMP 0x3141c4
- /* v16@0:8 */ layoutSubviews; // IMP 0x314508
- /* v20@0:8B16 */ setHighlighted:; // IMP 0x314ca4
- /* v16@0:8 */ wclgHandleTap; // IMP 0x314f18
- /* v24@0:8@16 */ wclgHandleLongPress:; // IMP 0x315030
- /* @16@0:8 */ username; // IMP 0x315160
- /* v24@0:8@16 */ setUsername:; // IMP 0x315170
- /* @16@0:8 */ avatarView; // IMP 0x31517c
- /* v24@0:8@16 */ setAvatarView:; // IMP 0x31518c
- /* @16@0:8 */ nameLabel; // IMP 0x3151a0
- /* v24@0:8@16 */ setNameLabel:; // IMP 0x3151b0
- /* @16@0:8 */ badgeLabel; // IMP 0x3151c4
- /* v24@0:8@16 */ setBadgeLabel:; // IMP 0x3151d4
- /* @16@0:8 */ fallbackGlassView; // IMP 0x3151e8
- /* v24@0:8@16 */ setFallbackGlassView:; // IMP 0x3151f8
- /* @16@0:8 */ colorTintView; // IMP 0x31520c
- /* v24@0:8@16 */ setColorTintView:; // IMP 0x31521c
- /* @?16@0:8 */ onTap; // IMP 0x315230
- /* v24@0:8@?16 */ setOnTap:; // IMP 0x315240
- /* @?16@0:8 */ onLongPress; // IMP 0x31524c
- /* v24@0:8@?16 */ setOnLongPress:; // IMP 0x31525c
- /* v16@0:8 */ .cxx_destruct; // IMP 0x315268
@end

@interface WCLGHomeCapsulePinnedController /* VM 0x4c5cf0 */
- /* v16@0:8 */ refresh; // IMP 0x315320
- /* v24@0:8@16 */ presentActionsForUser:; // IMP 0x315324
- /* v24@0:8@16 */ presentNicknameEditorForUser:; // IMP 0x316600
- /* v24@0:8@16 */ replaceFriend:; // IMP 0x316ffc
- /* v24@0:8@16 */ replaceAvatar:; // IMP 0x3175bc
- /* v24@0:8@16 */ removeUser:; // IMP 0x3176b8
- /* v32@0:8@16@24 */ imagePickerController:didFinishPickingMediaWithInfo:; // IMP 0x3177b0
- /* v24@0:8@16 */ imagePickerControllerDidCancel:; // IMP 0x3179d0
- /* @16@0:8 */ pendingAvatarUser; // IMP 0x317a34
- /* v24@0:8@16 */ setPendingAvatarUser:; // IMP 0x317a3c
- /* v16@0:8 */ .cxx_destruct; // IMP 0x317a44
@end

@interface WCLGCapsulePinnedContainerView /* VM 0x4c5d18 */
- /* B40@0:8{CGPoint=dd}16@32 */ pointInside:withEvent:; // IMP 0x318464
@end

@interface WCLGFuncCardChromeView /* VM 0x4c5d68 */
- /* v24@0:8@16 */ traitCollectionDidChange:; // IMP 0x31d90c
@end

@interface WCLGFuncCardLongPressTarget /* VM 0x4c5db8 */
+ /* @16@0:8 */ shared; // IMP 0x31f9b0
- /* v24@0:8@16 */ onLongPress:; // IMP 0x31fa0c
- /* B32@0:8@16@24 */ gestureRecognizer:shouldRecognizeSimultaneouslyWithGestureRecognizer:; // IMP 0x31fa3c
@end

@interface WCLGFuncCardDocPickerDelegate /* VM 0x4c5e30 */
- /* v32@0:8@16@24 */ documentPicker:didPickDocumentsAtURLs:; // IMP 0x322208
- /* v24@0:8@16 */ documentPickerWasCancelled:; // IMP 0x322960
- /* @?16@0:8 */ onChange; // IMP 0x322970
- /* v24@0:8@?16 */ setOnChange:; // IMP 0x322978
- /* @16@0:8 */ retainSelf; // IMP 0x322980
- /* v24@0:8@16 */ setRetainSelf:; // IMP 0x322988
- /* v16@0:8 */ .cxx_destruct; // IMP 0x322994
@end

@interface WCLGGroupPill /* VM 0x4c5e58 */
+ /* @20@0:8B16 */ pillConfigurationExpanded:; // IMP 0x324614
- /* @48@0:8{CGRect={CGPoint=dd}{CGSize=dd}}16 */ initWithFrame:; // IMP 0x324b74
- /* v16@0:8 */ applyBadgeText; // IMP 0x325064
- /* v16@0:8 */ applyMemberText; // IMP 0x325654
- /* v32@0:8B16B20@24 */ applyVisualStateExpanded:newButton:title:; // IMP 0x325a78
- /* v20@0:8B16 */ setPillExpanded:; // IMP 0x3277b4
- /* v56@0:8@16q24q32B40B44@48 */ configureWithTitle:memberCount:badgeCount:expanded:newButton:textColor:; // IMP 0x3279f4
- /* v32@0:8q16q24 */ refreshBadgeCount:memberCount:; // IMP 0x327f40
- /* v16@0:8 */ layoutSubviews; // IMP 0x3282e0
- /* v16@0:8 */ handleTap; // IMP 0x328b88
- /* v24@0:8@16 */ handleLongPress:; // IMP 0x328e78
- /* q16@0:8 */ displayIndex; // IMP 0x3290d8
- /* v24@0:8q16 */ setDisplayIndex:; // IMP 0x329144
- /* @?16@0:8 */ onTap; // IMP 0x3291b0
- /* v24@0:8@?16 */ setOnTap:; // IMP 0x32921c
- /* @?16@0:8 */ onLongPress; // IMP 0x3292b4
- /* v24@0:8@?16 */ setOnLongPress:; // IMP 0x329320
- /* @16@0:8 */ badge; // IMP 0x3293b8
- /* v24@0:8@16 */ setBadge:; // IMP 0x329424
- /* q16@0:8 */ badgeCount; // IMP 0x3294b8
- /* v24@0:8q16 */ setBadgeCount:; // IMP 0x329524
- /* @16@0:8 */ countLabel; // IMP 0x329590
- /* v24@0:8@16 */ setCountLabel:; // IMP 0x3295f8
- /* q16@0:8 */ memberCount; // IMP 0x32969c
- /* v24@0:8q16 */ setMemberCount:; // IMP 0x329708
- /* B16@0:8 */ wclgExpanded; // IMP 0x32976c
- /* v20@0:8B16 */ setWclgExpanded:; // IMP 0x3297d8
- /* B16@0:8 */ wclgNewButton; // IMP 0x329840
- /* v20@0:8B16 */ setWclgNewButton:; // IMP 0x3298a8
- /* @16@0:8 */ wclgTitle; // IMP 0x329910
- /* v24@0:8@16 */ setWclgTitle:; // IMP 0x329978
- /* v16@0:8 */ .cxx_destruct; // IMP 0x3299dc
@end

@interface WCLGHomeGroupBar /* VM 0x4c5ea8 */
+ /* d16@0:8 */ preferredHeight; // IMP 0x329aa8
- /* @48@0:8{CGRect={CGPoint=dd}{CGSize=dd}}16 */ initWithFrame:; // IMP 0x329b68
- /* v16@0:8 */ dealloc; // IMP 0x329ed0
- /* v16@0:8 */ handleGroupsChanged; // IMP 0x329f90
- /* v16@0:8 */ reloadGroups; // IMP 0x32a014
- /* v16@0:8 */ reloadGroupsIfNeeded; // IMP 0x32b504
- /* v28@0:8q16B24 */ setSelectedDisplayIndex:animated:; // IMP 0x32b890
- /* v24@0:8@16 */ refreshBadgesWithTable:; // IMP 0x32b914
- /* v16@0:8 */ layoutSubviews; // IMP 0x32c388
- /* v20@0:8B16 */ scrollSelectedPillToVisibleIfNeededAnimated:; // IMP 0x32ce8c
- /* v24@0:8@16 */ traitCollectionDidChange:; // IMP 0x32daa8
- /* @16@0:8 */ delegate; // IMP 0x32dc44
- /* v24@0:8@16 */ setDelegate:; // IMP 0x32dcd8
- /* @16@0:8 */ pills; // IMP 0x32dd44
- /* v24@0:8@16 */ setPills:; // IMP 0x32ddac
- /* @16@0:8 */ scroll; // IMP 0x32de48
- /* v24@0:8@16 */ setScroll:; // IMP 0x32deb4
- /* q16@0:8 */ lastScrolledExpandedIndex; // IMP 0x32df58
- /* v24@0:8q16 */ setLastScrolledExpandedIndex:; // IMP 0x32dfc4
- /* @16@0:8 */ wclgStructureToken; // IMP 0x32e028
- /* v24@0:8@16 */ setWclgStructureToken:; // IMP 0x32e094
- /* v16@0:8 */ .cxx_destruct; // IMP 0x32e0f8
@end

@interface WCLGHGFullscreenDrawer /* VM 0x4c5ef8 */
- /* @36@0:8@16B24d28 */ initWithController:fromLeft:anchorY:; // IMP 0x3339e0
- /* v24@0:8d16 */ buildPillsWithFontSize:; // IMP 0x333df8
- /* v16@0:8 */ handleBackdrop; // IMP 0x3354b0
- /* v24@0:8@16 */ handlePill:; // IMP 0x3354c0
- /* q32@0:8{CGPoint=dd}16 */ pillIndexAtWindowPoint:; // IMP 0x335538
- /* v24@0:8q16 */ setHighlightedIndex:; // IMP 0x3356e8
- /* v24@0:8q16 */ commitSelection:; // IMP 0x33599c
- /* v24@0:8@16 */ presentInWindow:; // IMP 0x335a6c
- /* v20@0:8B16 */ dismissAnimated:; // IMP 0x336180
- /* @16@0:8 */ controller; // IMP 0x336468
- /* v24@0:8@16 */ setController:; // IMP 0x336488
- /* @16@0:8 */ backdrop; // IMP 0x33649c
- /* v24@0:8@16 */ setBackdrop:; // IMP 0x3364ac
- /* @16@0:8 */ column; // IMP 0x3364c0
- /* v24@0:8@16 */ setColumn:; // IMP 0x3364d0
- /* B16@0:8 */ fromLeft; // IMP 0x3364e4
- /* v20@0:8B16 */ setFromLeft:; // IMP 0x3364f4
- /* d16@0:8 */ columnWidth; // IMP 0x336504
- /* v24@0:8d16 */ setColumnWidth:; // IMP 0x336514
- /* d16@0:8 */ anchorY; // IMP 0x336524
- /* v24@0:8d16 */ setAnchorY:; // IMP 0x336534
- /* @16@0:8 */ pills; // IMP 0x336544
- /* v24@0:8@16 */ setPills:; // IMP 0x336554
- /* q16@0:8 */ highlightedIndex; // IMP 0x336568
- /* @16@0:8 */ lockedScroll; // IMP 0x336578
- /* v24@0:8@16 */ setLockedScroll:; // IMP 0x336598
- /* @16@0:8 */ hapticGenerator; // IMP 0x3365ac
- /* v24@0:8@16 */ setHapticGenerator:; // IMP 0x3365bc
- /* v16@0:8 */ .cxx_destruct; // IMP 0x3365d0
@end

@interface WCLGHGFullscreenGestureTarget /* VM 0x4c5f70 */
+ /* @16@0:8 */ shared; // IMP 0x336658
- /* v24@0:8@16 */ handleEdgePan:; // IMP 0x3366f4
- /* B32@0:8@16@24 */ gestureRecognizer:shouldReceiveTouch:; // IMP 0x336a18
- /* B32@0:8@16@24 */ gestureRecognizer:shouldRecognizeSimultaneouslyWithGestureRecognizer:; // IMP 0x336a60
@end

@interface WCLGHGPassthroughView /* VM 0x4c5f98 */
- /* @40@0:8{CGPoint=dd}16@32 */ hitTest:withEvent:; // IMP 0x337404
@end

@interface WCLGSessionGroup /* VM 0x4c6010 */
+ /* @24@0:8@16 */ groupWithDictionary:; // IMP 0x3493a0
- /* @16@0:8 */ init; // IMP 0x346474
- /* B16@0:8 */ isAllGroup; // IMP 0x34663c
- /* B24@0:8@16 */ containsSessionUsername:; // IMP 0x3468f0
- /* B40@0:8@16q24B32B36 */ containsSessionUsername:unreadCount:muted:showMutedUnread:; // IMP 0x348844
- /* @16@0:8 */ dictionaryRepresentation; // IMP 0x348cf8
- /* @16@0:8 */ groupID; // IMP 0x34a3cc
- /* v24@0:8@16 */ setGroupID:; // IMP 0x34a430
- /* @16@0:8 */ title; // IMP 0x34a478
- /* v24@0:8@16 */ setTitle:; // IMP 0x34a4dc
- /* @16@0:8 */ members; // IMP 0x34a524
- /* v24@0:8@16 */ setMembers:; // IMP 0x34a588
- /* q16@0:8 */ rule; // IMP 0x34a5d0
- /* v24@0:8q16 */ setRule:; // IMP 0x34a634
- /* v16@0:8 */ .cxx_destruct; // IMP 0x34a690
@end

@interface WCLGHomeGroups /* VM 0x4c5fe8 */
+ /* @16@0:8 */ sharedManager; // IMP 0x34a724
- /* @16@0:8 */ init; // IMP 0x34a9d0
- /* v16@0:8 */ loadFromDisk; // IMP 0x34ab94
- /* v16@0:8 */ seedDefaultGroupsIfNeeded; // IMP 0x34b920
- /* v16@0:8 */ persistGroupsLocked; // IMP 0x34c254
- /* B16@0:8 */ enabled; // IMP 0x34ca90
- /* v20@0:8B16 */ setEnabled:; // IMP 0x34ce30
- /* B16@0:8 */ tgMode; // IMP 0x34d1c4
- /* v20@0:8B16 */ setTgMode:; // IMP 0x34d55c
- /* B16@0:8 */ hideGroupArrow; // IMP 0x34d8e0
- /* v20@0:8B16 */ setHideGroupArrow:; // IMP 0x34dc4c
- /* d16@0:8 */ stripPillFontSize; // IMP 0x34e014
- /* v24@0:8d16 */ setStripPillFontSize:; // IMP 0x34e464
- /* d16@0:8 */ stripPillWidth; // IMP 0x34e85c
- /* v24@0:8d16 */ setStripPillWidth:; // IMP 0x34ed0c
- /* d16@0:8 */ stripVerticalOffset; // IMP 0x34f100
- /* v24@0:8d16 */ setStripVerticalOffset:; // IMP 0x34f660
- /* @16@0:8 */ defaultExpandedGroupID; // IMP 0x34faf4
- /* v24@0:8@16 */ setDefaultExpandedGroupID:; // IMP 0x34ffdc
- /* B16@0:8 */ unreadGroupShowMuted; // IMP 0x350418
- /* v20@0:8B16 */ setUnreadGroupShowMuted:; // IMP 0x350824
- /* B16@0:8 */ swipeEnabled; // IMP 0x350c40
- /* v20@0:8B16 */ setSwipeEnabled:; // IMP 0x351010
- /* B16@0:8 */ animationEnabled; // IMP 0x351408
- /* v20@0:8B16 */ setAnimationEnabled:; // IMP 0x351800
- /* B16@0:8 */ filterPinned; // IMP 0x351c1c
- /* v20@0:8B16 */ setFilterPinned:; // IMP 0x351fec
- /* B16@0:8 */ showBadge; // IMP 0x3523dc
- /* v20@0:8B16 */ setShowBadge:; // IMP 0x352788
- /* B16@0:8 */ showUnreadBadge; // IMP 0x352b4c
- /* v20@0:8B16 */ setShowUnreadBadge:; // IMP 0x352f34
- /* B16@0:8 */ groupTapHapticEnabled; // IMP 0x353368
- /* v20@0:8B16 */ setGroupTapHapticEnabled:; // IMP 0x3536f4
- /* q16@0:8 */ textColorMode; // IMP 0x353a98
- /* v24@0:8q16 */ setTextColorMode:; // IMP 0x353f3c
- /* q16@0:8 */ pillColorMode; // IMP 0x354340
- /* v24@0:8q16 */ setPillColorMode:; // IMP 0x3547dc
- /* q16@0:8 */ pillSelectedColorMode; // IMP 0x354be4
- /* v24@0:8q16 */ setPillSelectedColorMode:; // IMP 0x355114
- /* q16@0:8 */ badgeColorMode; // IMP 0x3555a4
- /* v24@0:8q16 */ setBadgeColorMode:; // IMP 0x355a70
- /* q16@0:8 */ badgeColorDarkMode; // IMP 0x355eac
- /* v24@0:8q16 */ setBadgeColorDarkMode:; // IMP 0x35637c
- /* q16@0:8 */ stripSelectedColorMode; // IMP 0x3567f0
- /* v24@0:8q16 */ setStripSelectedColorMode:; // IMP 0x356d1c
- /* q16@0:8 */ stripSelectedColorDarkMode; // IMP 0x3571b8
- /* v24@0:8q16 */ setStripSelectedColorDarkMode:; // IMP 0x357708
- /* d16@0:8 */ barVerticalOffset; // IMP 0x357bc0
- /* v24@0:8d16 */ setBarVerticalOffset:; // IMP 0x358108
- /* d16@0:8 */ pillGap; // IMP 0x3585a8
- /* v24@0:8d16 */ setPillGap:; // IMP 0x358a38
- /* d16@0:8 */ pillHorizontalInset; // IMP 0x358df8
- /* v24@0:8d16 */ setPillHorizontalInset:; // IMP 0x35935c
- /* B16@0:8 */ hideAllGroup; // IMP 0x3597e0
- /* v20@0:8B16 */ setHideAllGroup:; // IMP 0x359b54
- /* B16@0:8 */ effectiveEnabled; // IMP 0x35a1c4
- /* @16@0:8 */ allGroupTitle; // IMP 0x35a3f0
- /* B16@0:8 */ isAllGroupTitleCustomized; // IMP 0x35a824
- /* v16@0:8 */ restoreAllGroupTitle; // IMP 0x35ad10
- /* q16@0:8 */ allGroupIndex; // IMP 0x35b0b0
- /* v24@0:8q16 */ setAllGroupIndex:; // IMP 0x35b540
- /* @16@0:8 */ allGroup; // IMP 0x35b954
- /* @16@0:8 */ customGroups; // IMP 0x35bc70
- /* @16@0:8 */ displayGroups; // IMP 0x35bd18
- /* @24@0:8@16 */ groupForID:; // IMP 0x35bf68
- /* @24@0:8q16 */ displayGroupAtIndex:; // IMP 0x35c9fc
- /* @16@0:8 */ currentGroupID; // IMP 0x35cc1c
- /* v24@0:8@16 */ setCurrentGroupID:; // IMP 0x35cf08
- /* q16@0:8 */ currentDisplayIndex; // IMP 0x35d684
- /* @16@0:8 */ currentGroup; // IMP 0x35d97c
- /* v24@0:8q16 */ selectDisplayIndex:; // IMP 0x35da38
- /* B16@0:8 */ collapsed; // IMP 0x35dbe0
- /* q16@0:8 */ expandedDisplayIndex; // IMP 0x35dec0
- /* v24@0:8q16 */ toggleExpandDisplayIndex:; // IMP 0x35e018
- /* v16@0:8 */ normalizeCurrentSelection; // IMP 0x35e7f0
- /* @24@0:8@16 */ addGroupWithTitle:; // IMP 0x35ec9c
- /* v24@0:8@16 */ removeGroupID:; // IMP 0x35ef88
- /* v32@0:8@16@24 */ renameGroupID:toTitle:; // IMP 0x35f804
- /* v32@0:8@16@24 */ setMembers:forGroupID:; // IMP 0x360498
- /* @24@0:8q16 */ customGroupWithRule:; // IMP 0x361628
- /* v24@0:8q16 */ restoreDefaultGroupOfRule:; // IMP 0x361c84
- /* v32@0:8q16q24 */ moveCustomGroupFromIndex:toIndex:; // IMP 0x362324
- /* v32@0:8q16q24 */ moveDisplayGroupFromIndex:toIndex:; // IMP 0x362620
- /* B24@0:8@16 */ currentGroupShouldShowSessionUsername:; // IMP 0x362e9c
- /* B32@0:8q16@24 */ groupAtDisplayIndex:shouldShowSessionUsername:; // IMP 0x362f34
- /* B32@0:8@16@24 */ currentGroupShouldShowSessionUsername:cellData:; // IMP 0x362fdc
- /* B40@0:8q16@24@32 */ groupAtDisplayIndex:shouldShowSessionUsername:cellData:; // IMP 0x3630b4
- /* v20@0:8B16 */ recomputeAtomicMirrorLocked:; // IMP 0x36362c
- /* v16@0:8 */ refresh; // IMP 0x363d8c
- /* v16@0:8 */ beginQuietGroupSwitch; // IMP 0x363e34
- /* v16@0:8 */ endQuietGroupSwitch; // IMP 0x363ea0
- /* v16@0:8 */ notifyChanged; // IMP 0x363fa4
- /* v16@0:8 */ .cxx_destruct; // IMP 0x364784
@end

@interface WCLGHomeGroupsControllerState /* VM 0x4c60b0 */
- /* B16@0:8 */ fullscreenRowsBusy; // IMP 0x365b80
- /* v20@0:8B16 */ setFullscreenRowsBusy:; // IMP 0x365b88
- /* B16@0:8 */ fullscreenCapsulePositionPending; // IMP 0x365b90
- /* v20@0:8B16 */ setFullscreenCapsulePositionPending:; // IMP 0x365b98
- /* B16@0:8 */ fullscreenCapsulePositionScheduled; // IMP 0x365ba0
- /* v20@0:8B16 */ setFullscreenCapsulePositionScheduled:; // IMP 0x365ba8
- /* Q16@0:8 */ fullscreenCapsulePositionScheduledEpoch; // IMP 0x365bb0
- /* v24@0:8Q16 */ setFullscreenCapsulePositionScheduledEpoch:; // IMP 0x365bb8
- /* Q16@0:8 */ fullscreenCapsulePositionAttemptCount; // IMP 0x365bc0
- /* v24@0:8Q16 */ setFullscreenCapsulePositionAttemptCount:; // IMP 0x365bc8
- /* Q16@0:8 */ fullscreenCapsulePositionTargetToken; // IMP 0x365bd0
- /* v24@0:8Q16 */ setFullscreenCapsulePositionTargetToken:; // IMP 0x365bd8
- /* Q16@0:8 */ fullscreenCapsulePositionEpoch; // IMP 0x365be0
- /* v24@0:8Q16 */ setFullscreenCapsulePositionEpoch:; // IMP 0x365be8
@end

@interface WCLGHomeGroupsChrome /* VM 0x4c6100 */
- /* v32@0:8@16q24 */ homeGroupBar:didToggleDisplayIndex:; // IMP 0x3691e8
- /* v40@0:8@16q24@32 */ homeGroupBar:didRequestManageDisplayIndex:sourceView:; // IMP 0x369228
- /* v24@0:8@16 */ homeGroupBarDidRequestCreateGroup:; // IMP 0x369f88
- /* @16@0:8 */ controller; // IMP 0x36a304
- /* v24@0:8@16 */ setController:; // IMP 0x36a31c
- /* v16@0:8 */ .cxx_destruct; // IMP 0x36a328
@end

@interface WCLGHomeGroupsGestureTarget /* VM 0x4c6150 */
- /* B24@0:8@16 */ gestureRecognizerShouldBegin:; // IMP 0x36f244
- /* B32@0:8@16@24 */ gestureRecognizer:shouldRecognizeSimultaneouslyWithGestureRecognizer:; // IMP 0x36f248
- /* v24@0:8@16 */ wclgHandleLongPress:; // IMP 0x36f250
@end

@interface WCLGHomeSwipeBlockerPan /* VM 0x4c61a0 */
- /* B24@0:8@16 */ canPreventGestureRecognizer:; // IMP 0x370a08
- /* B24@0:8@16 */ canBePreventedByGestureRecognizer:; // IMP 0x370a10
@end

@interface WCLGHomeSwipeBlockerDelegate /* VM 0x4c61f0 */
- /* B32@0:8@16@24 */ gestureRecognizer:shouldReceiveTouch:; // IMP 0x370a18
- /* B24@0:8@16 */ gestureRecognizerShouldBegin:; // IMP 0x370b58
- /* B32@0:8@16@24 */ gestureRecognizer:shouldRecognizeSimultaneouslyWithGestureRecognizer:; // IMP 0x37120c
@end

@interface WCLGHomeSwipeBlockerTarget /* VM 0x4c6218 */
+ /* @16@0:8 */ shared; // IMP 0x3713cc
- /* v24@0:8@16 */ handlePan:; // IMP 0x371430
@end

@interface WCLGHomeStripSwipeTarget /* VM 0x4c6268 */
+ /* @16@0:8 */ shared; // IMP 0x3715ec
- /* v24@0:8@16 */ handleSwipe:; // IMP 0x371650
- /* B32@0:8@16@24 */ gestureRecognizer:shouldRecognizeSimultaneouslyWithGestureRecognizer:; // IMP 0x371844
- /* B32@0:8@16@24 */ gestureRecognizer:shouldReceiveTouch:; // IMP 0x37184c
@end

@interface WCLGHomePinnedController /* VM 0x4c62e0 */
- /* v16@0:8 */ refreshUI; // IMP 0x380ca4
- /* v24@0:8@16 */ onSlotTap:; // IMP 0x380ca8
- /* v24@0:8@16 */ onSlotLongPress:; // IMP 0x380d08
- /* v32@0:8@16@24 */ presentActionsForUser:fromController:; // IMP 0x3810e4
- /* v32@0:8@16@24 */ replaceFriend:fromController:; // IMP 0x381c44
- /* v32@0:8@16@24 */ replaceAvatar:fromController:; // IMP 0x382228
- /* v24@0:8@16 */ removeUser:; // IMP 0x38230c
- /* v32@0:8@16@?24 */ addContactFromController:onChange:; // IMP 0x3823fc
- /* v24@0:8@16 */ presentMaskPickerFromController:; // IMP 0x382724
- /* v28@0:8B16@20 */ pickMaskForDark:fromController:; // IMP 0x3831d4
- /* v32@0:8@16@24 */ imagePickerController:didFinishPickingMediaWithInfo:; // IMP 0x3832e8
- /* v24@0:8@16 */ imagePickerControllerDidCancel:; // IMP 0x38357c
- /* @16@0:8 */ pendingAvatarUser; // IMP 0x3835f4
- /* v24@0:8@16 */ setPendingAvatarUser:; // IMP 0x3835fc
- /* @16@0:8 */ pendingMaskDark; // IMP 0x383604
- /* v24@0:8@16 */ setPendingMaskDark:; // IMP 0x38360c
- /* v16@0:8 */ .cxx_destruct; // IMP 0x383618
@end

@interface WCLGHomePinnedPanelView /* VM 0x4c6308 */
+ /* @16@0:8 */ rowDefinitions; // IMP 0x3874dc
- /* @24@0:8@16 */ initForWindow:; // IMP 0x389868
- /* @16@0:8 */ primaryTextColor; // IMP 0x389ca0
- /* @16@0:8 */ secondaryTextColor; // IMP 0x389cfc
- /* @16@0:8 */ separatorColor; // IMP 0x389d58
- /* v16@0:8 */ buildBackground; // IMP 0x389db4
- /* v16@0:8 */ buildHeader; // IMP 0x38a01c
- /* v24@0:8d16 */ buildScrollContent:; // IMP 0x38a704
- /* @36@0:8q16@24B32 */ makePlainRowAtIndex:title:lastRow:; // IMP 0x38abcc
- /* @36@0:8q16@24B32 */ makeTappableRowAtIndex:title:lastRow:; // IMP 0x38acdc
- /* v40@0:8@16B24@28B36 */ addLabel:separator:toRow:interactive:; // IMP 0x38b01c
- /* v32@0:8@16@24 */ placeAccessory:inRow:; // IMP 0x38b240
- /* B24@0:8@16 */ switchOnFor:; // IMP 0x38b330
- /* v40@0:8@16@24q32 */ addSwitchToRow:def:index:; // IMP 0x38b554
- /* v40@0:8@16@24q32 */ addSegmentToRow:def:index:; // IMP 0x38b6b0
- /* v40@0:8@16@24q32 */ addStepperToRow:def:index:; // IMP 0x38b854
- /* v32@0:8@16q24 */ addColorAccessoryToRow:index:; // IMP 0x38c1c8
- /* v24@0:8@16 */ addActionAccessoryToRow:; // IMP 0x38c3a0
- /* v16@0:8 */ refreshBadgeSwatch; // IMP 0x38c3a4
- /* v16@0:8 */ closeTapped; // IMP 0x38c4c4
- /* v24@0:8@16 */ switchChanged:; // IMP 0x38c5f4
- /* v24@0:8@16 */ segmentChanged:; // IMP 0x38cbd0
- /* v24@0:8@16 */ stepperChanged:; // IMP 0x38cc6c
- /* v24@0:8@16 */ rowTapped:; // IMP 0x38d018
- /* v16@0:8 */ badgeColorTapped; // IMP 0x38d340
- /* v16@0:8 */ dismissTopModal; // IMP 0x38d708
- /* v24@0:8@16 */ handlePan:; // IMP 0x38d748
- /* {CGPoint=dd}64@0:8{CGPoint=dd}16{CGRect={CGPoint=dd}{CGSize=dd}}32 */ clampedCenter:inBounds:; // IMP 0x38d880
- /* B32@0:8@16@24 */ gestureRecognizer:shouldReceiveTouch:; // IMP 0x38d948
- /* @16@0:8 */ panelBG; // IMP 0x38d9b4
- /* v24@0:8@16 */ setPanelBG:; // IMP 0x38d9c4
- /* @16@0:8 */ scrollView; // IMP 0x38d9d8
- /* v24@0:8@16 */ setScrollView:; // IMP 0x38d9e8
- /* @16@0:8 */ rows; // IMP 0x38d9fc
- /* v24@0:8@16 */ setRows:; // IMP 0x38da0c
- /* @16@0:8 */ valueLabels; // IMP 0x38da20
- /* v24@0:8@16 */ setValueLabels:; // IMP 0x38da30
- /* @16@0:8 */ badgeSwatch; // IMP 0x38da44
- /* v24@0:8@16 */ setBadgeSwatch:; // IMP 0x38da54
- /* {CGPoint=dd}16@0:8 */ dragStartCenter; // IMP 0x38da68
- /* v32@0:8{CGPoint=dd}16 */ setDragStartCenter:; // IMP 0x38da7c
- /* B16@0:8 */ darkMode; // IMP 0x38da90
- /* v20@0:8B16 */ setDarkMode:; // IMP 0x38daa0
- /* v16@0:8 */ .cxx_destruct; // IMP 0x38dab0
@end

@interface WCLGHomeTextHeaderWrapperView /* VM 0x4c6358 */
- /* v16@0:8 */ layoutSubviews; // IMP 0x38e354
- /* @40@0:8{CGPoint=dd}16@32 */ hitTest:withEvent:; // IMP 0x38e78c
@end

@interface WCLGHomeTextCardLongPressTarget /* VM 0x4c63a8 */
+ /* @16@0:8 */ shared; // IMP 0x39076c
- /* v24@0:8@16 */ onLongPress:; // IMP 0x3907c8
@end

@interface WCLGKeyboardObserver /* VM 0x4c6420 */
+ /* @16@0:8 */ sharedObserver; // IMP 0x3a9c18
- /* v28@0:8@16B24 */ updateFromNote:visibleHint:; // IMP 0x3a9cb4
- /* v24@0:8@16 */ keyboardWillShow:; // IMP 0x3aa13c
- /* v24@0:8@16 */ keyboardWillHide:; // IMP 0x3aa14c
- /* v24@0:8@16 */ keyboardDidShow:; // IMP 0x3aa15c
- /* v24@0:8@16 */ keyboardDidHide:; // IMP 0x3aa16c
- /* v24@0:8@16 */ keyboardWillChangeFrame:; // IMP 0x3aa17c
- /* v24@0:8@16 */ keyboardDidChangeFrame:; // IMP 0x3aa194
@end

@interface WCLGForegroundReaffirm /* VM 0x4c6470 */
+ /* @16@0:8 */ sharedInstance; // IMP 0x3aa548
- /* v24@0:8@16 */ appDidBecomeActive:; // IMP 0x3aa5e4
@end

@interface WCLGSearchActionTarget /* VM 0x4c64c0 */
+ /* @16@0:8 */ sharedTarget; // IMP 0x3b5bcc
- /* v24@0:8@16 */ searchTapped:; // IMP 0x3b5e60
@end

@interface WCLGSearchTabBarOverlay /* VM 0x4c64e8 */
- /* @24@0:8@16 */ initWithTabBar:; // IMP 0x3c30ec
- /* B16@0:8 */ isDarkMode; // IMP 0x3c3284
- /* @16@0:8 */ glassView; // IMP 0x3c32d4
- /* v32@0:8@16@24 */ styleGlassControl:glass:; // IMP 0x3c359c
- /* @16@0:8 */ searchIcon; // IMP 0x3c3944
- /* @16@0:8 */ badgeRedColor; // IMP 0x3c3bb4
- /* v40@0:8@16@24@32 */ applyBadge:dotView:label:; // IMP 0x3c3d8c
- /* v32@0:8@16@24 */ applyModeBadgeFromItem:fallbackBadge:; // IMP 0x3c41a0
- /* d32@0:8@16d24 */ badgeLabelWidthForText:height:; // IMP 0x3c423c
- /* v16@0:8 */ lightFeedback; // IMP 0x3c43d4
- /* v16@0:8 */ selectionFeedback; // IMP 0x3c441c
- /* v16@0:8 */ resetControlInteractionState; // IMP 0x3c4454
- /* B40@0:8q16@24@32 */ applySystemGlassButtonConfigurationsWithSizeMode:primary:secondary:; // IMP 0x3c46b8
- /* v16@0:8 */ buildSubviews; // IMP 0x3c592c
- /* B40@0:8{CGPoint=dd}16@32 */ pointInside:withEvent:; // IMP 0x3c6ef8
- /* @40@0:8{CGPoint=dd}16@32 */ hitTest:withEvent:; // IMP 0x3c7098
- /* Q16@0:8 */ currentIndex; // IMP 0x3c731c
- /* Q32@0:8Q16Q24 */ nativeIndexForMenuRow:count:; // IMP 0x3c7b20
- /* v24@0:8@16 */ refreshWithItems:; // IMP 0x3c7b44
- /* v16@0:8 */ layoutSubviews; // IMP 0x3c9354
- /* v24@0:8@16 */ optionPressBegan:; // IMP 0x3cbd44
- /* v24@0:8@16 */ optionPressEnded:; // IMP 0x3cbd90
- /* v24@0:8B16B20 */ setMenuVisible:animated:; // IMP 0x3cbdc8
- /* v28@0:8B16B20B24 */ setOverlayDisplayed:animated:interactive:; // IMP 0x3cc25c
- /* v24@0:8B16B20 */ setOverlayDisplayed:animated:; // IMP 0x3cc60c
- /* B24@0:8@16 */ gestureRecognizerShouldBegin:; // IMP 0x3cc61c
- /* v24@0:8@16 */ modeTapped:; // IMP 0x3cc6c0
- /* v24@0:8@16 */ modePanned:; // IMP 0x3cc720
- /* v24@0:8@16 */ searchPanned:; // IMP 0x3cc9b8
- /* v24@0:8@16 */ optionTapped:; // IMP 0x3ccc50
- /* v24@0:8@16 */ overlayTapped:; // IMP 0x3cccb4
- /* q32@0:8{CGPoint=dd}16 */ optionIndexAtPointInMenu:; // IMP 0x3ccec8
- /* q24@0:8@16 */ optionIndexAtGesture:; // IMP 0x3cd1d8
- /* q24@0:8@16 */ optionIndexAtTouch:; // IMP 0x3cd270
- /* q32@0:8{CGPoint=dd}16 */ optionIndexAtOverlayPoint:; // IMP 0x3cd33c
- /* v16@0:8 */ updateOptionHighlights; // IMP 0x3cd3bc
- /* v32@0:8@16@24 */ touchesBegan:withEvent:; // IMP 0x3cd788
- /* v32@0:8@16@24 */ touchesMoved:withEvent:; // IMP 0x3cd928
- /* v32@0:8@16@24 */ touchesEnded:withEvent:; // IMP 0x3cda2c
- /* v32@0:8@16@24 */ touchesCancelled:withEvent:; // IMP 0x3cdbb4
- /* v24@0:8@16 */ modeLongPressed:; // IMP 0x3cdc7c
- /* v24@0:8Q16 */ selectIndex:; // IMP 0x3cde20
- /* @16@0:8 */ tabBar; // IMP 0x3cfa1c
- /* v24@0:8@16 */ setTabBar:; // IMP 0x3cfa3c
- /* @16@0:8 */ items; // IMP 0x3cfa50
- /* v24@0:8@16 */ setItems:; // IMP 0x3cfa60
- /* @16@0:8 */ searchControl; // IMP 0x3cfa6c
- /* v24@0:8@16 */ setSearchControl:; // IMP 0x3cfa7c
- /* @16@0:8 */ searchPanGesture; // IMP 0x3cfa90
- /* v24@0:8@16 */ setSearchPanGesture:; // IMP 0x3cfaa0
- /* @16@0:8 */ searchGlass; // IMP 0x3cfab4
- /* v24@0:8@16 */ setSearchGlass:; // IMP 0x3cfac4
- /* @16@0:8 */ searchIconView; // IMP 0x3cfad8
- /* v24@0:8@16 */ setSearchIconView:; // IMP 0x3cfae8
- /* @16@0:8 */ searchLabel; // IMP 0x3cfafc
- /* v24@0:8@16 */ setSearchLabel:; // IMP 0x3cfb0c
- /* @16@0:8 */ modeButton; // IMP 0x3cfb20
- /* v24@0:8@16 */ setModeButton:; // IMP 0x3cfb30
- /* @16@0:8 */ modeGlass; // IMP 0x3cfb44
- /* v24@0:8@16 */ setModeGlass:; // IMP 0x3cfb54
- /* @16@0:8 */ modeIconView; // IMP 0x3cfb68
- /* v24@0:8@16 */ setModeIconView:; // IMP 0x3cfb78
- /* @16@0:8 */ modeBadgeDotView; // IMP 0x3cfb8c
- /* v24@0:8@16 */ setModeBadgeDotView:; // IMP 0x3cfb9c
- /* @16@0:8 */ modeBadgeLabel; // IMP 0x3cfbb0
- /* v24@0:8@16 */ setModeBadgeLabel:; // IMP 0x3cfbc0
- /* @16@0:8 */ menuView; // IMP 0x3cfbd4
- /* v24@0:8@16 */ setMenuView:; // IMP 0x3cfbe4
- /* @16@0:8 */ menuGlass; // IMP 0x3cfbf8
- /* v24@0:8@16 */ setMenuGlass:; // IMP 0x3cfc08
- /* @16@0:8 */ menuMaterialView; // IMP 0x3cfc1c
- /* v24@0:8@16 */ setMenuMaterialView:; // IMP 0x3cfc2c
- /* @16@0:8 */ optionButtons; // IMP 0x3cfc40
- /* v24@0:8@16 */ setOptionButtons:; // IMP 0x3cfc50
- /* q16@0:8 */ highlightedIndex; // IMP 0x3cfc64
- /* v24@0:8q16 */ setHighlightedIndex:; // IMP 0x3cfc74
- /* B16@0:8 */ menuVisible; // IMP 0x3cfc84
- /* v20@0:8B16 */ setMenuVisible:; // IMP 0x3cfc94
- /* B16@0:8 */ selectingIndex; // IMP 0x3cfca4
- /* v20@0:8B16 */ setSelectingIndex:; // IMP 0x3cfcb4
- /* B16@0:8 */ menuTouchActive; // IMP 0x3cfcc4
- /* v20@0:8B16 */ setMenuTouchActive:; // IMP 0x3cfcd4
- /* B16@0:8 */ modePanActive; // IMP 0x3cfce4
- /* v20@0:8B16 */ setModePanActive:; // IMP 0x3cfcf4
- /* B16@0:8 */ searchPanActive; // IMP 0x3cfd04
- /* v20@0:8B16 */ setSearchPanActive:; // IMP 0x3cfd14
- /* B16@0:8 */ menuAnchoredToSearch; // IMP 0x3cfd24
- /* v20@0:8B16 */ setMenuAnchoredToSearch:; // IMP 0x3cfd34
- /* q16@0:8 */ lastFeedbackHighlightedIndex; // IMP 0x3cfd44
- /* v24@0:8q16 */ setLastFeedbackHighlightedIndex:; // IMP 0x3cfd54
- /* B16@0:8 */ overlayDisplayed; // IMP 0x3cfd64
- /* v20@0:8B16 */ setOverlayDisplayed:; // IMP 0x3cfd74
- /* B16@0:8 */ overlayInteractionsEnabled; // IMP 0x3cfd84
- /* v20@0:8B16 */ setOverlayInteractionsEnabled:; // IMP 0x3cfd94
- /* B16@0:8 */ hasStableTabFrame; // IMP 0x3cfda4
- /* v20@0:8B16 */ setHasStableTabFrame:; // IMP 0x3cfdb4
- /* {CGRect={CGPoint=dd}{CGSize=dd}}16@0:8 */ stableTabFrame; // IMP 0x3cfdc4
- /* v48@0:8{CGRect={CGPoint=dd}{CGSize=dd}}16 */ setStableTabFrame:; // IMP 0x3cfddc
- /* v16@0:8 */ .cxx_destruct; // IMP 0x3cfdf4
@end

@interface WCLGTextEditorViewController /* VM 0x4c6538 */
- /* v16@0:8 */ dealloc; // IMP 0x3d5a34
- /* @48@0:8@16@24@32@?40 */ initWithTitle:text:placeholder:handler:; // IMP 0x3d5aac
- /* v16@0:8 */ viewDidLoad; // IMP 0x3d5c08
- /* v16@0:8 */ viewDidLayoutSubviews; // IMP 0x3d629c
- /* v16@0:8 */ layoutTextEditorViews; // IMP 0x3d62ec
- /* v20@0:8B16 */ viewDidAppear:; // IMP 0x3d6548
- /* v24@0:8@16 */ keyboardFrameChanged:; // IMP 0x3d65b8
- /* v16@0:8 */ saveTapped; // IMP 0x3d6870
- /* @16@0:8 */ initialText; // IMP 0x3d6970
- /* v24@0:8@16 */ setInitialText:; // IMP 0x3d6980
- /* @16@0:8 */ placeholderText; // IMP 0x3d698c
- /* v24@0:8@16 */ setPlaceholderText:; // IMP 0x3d699c
- /* @?16@0:8 */ saveHandler; // IMP 0x3d69a8
- /* v24@0:8@?16 */ setSaveHandler:; // IMP 0x3d69b8
- /* @16@0:8 */ textView; // IMP 0x3d69c4
- /* v24@0:8@16 */ setTextView:; // IMP 0x3d69d4
- /* @16@0:8 */ hintLabel; // IMP 0x3d69e8
- /* v24@0:8@16 */ setHintLabel:; // IMP 0x3d69f8
- /* d16@0:8 */ keyboardOverlap; // IMP 0x3d6a0c
- /* v24@0:8d16 */ setKeyboardOverlap:; // IMP 0x3d6a1c
- /* v16@0:8 */ .cxx_destruct; // IMP 0x3d6a2c
@end

@interface WCLGSettingsViewController /* VM 0x4c6588 */
+ /* @16@0:8 */ homeGroupsSettingsController; // IMP 0x3d6b08
- /* @16@0:8 */ init; // IMP 0x3d6aa8
- /* @24@0:8q16 */ initWithPanel:; // IMP 0x3d6ab8
- /* v16@0:8 */ wclgDismissModal; // IMP 0x3d6b2c
- /* B16@0:8 */ isDarkMode; // IMP 0x3d6f44
- /* @16@0:8 */ cellBackgroundColor; // IMP 0x3d6f94
- /* @16@0:8 */ primaryTextColor; // IMP 0x3d6ff4
- /* @16@0:8 */ secondaryTextColor; // IMP 0x3d7058
- /* @20@0:8B16 */ authorizationCellBackgroundColorForAllowed:; // IMP 0x3d70bc
- /* v28@0:8@16B24 */ applyAuthorizationBackgroundToCell:allowed:; // IMP 0x3d7194
- /* @16@0:8 */ gradientColorsA; // IMP 0x3d726c
- /* @16@0:8 */ gradientColorsB; // IMP 0x3d74cc
- /* v16@0:8 */ setupBackground; // IMP 0x3d7730
- /* v16@0:8 */ refreshBackground; // IMP 0x3d7f00
- /* v16@0:8 */ startBackgroundAnimations; // IMP 0x3d81b8
- /* {CGRect={CGPoint=dd}{CGSize=dd}}16@0:8 */ tableFrameForCurrentBounds; // IMP 0x3d872c
- /* v16@0:8 */ layoutSettingsTableForCurrentBounds; // IMP 0x3d8808
- /* v16@0:8 */ viewDidLoad; // IMP 0x3d8ac8
- /* v20@0:8B16 */ viewWillAppear:; // IMP 0x3d9390
- /* v20@0:8B16 */ viewDidAppear:; // IMP 0x3d9620
- /* v16@0:8 */ viewDidLayoutSubviews; // IMP 0x3d97b8
- /* v24@0:8@16 */ traitCollectionDidChange:; // IMP 0x3d9828
- /* v16@0:8 */ refreshRootEdgeFadeMaskFrame; // IMP 0x3d9994
- /* v20@0:8B16 */ suppressRootNativeEdgeEffectsRecursively:; // IMP 0x3d9b58
- /* v16@0:8 */ refreshRootEdgeFades; // IMP 0x3dabac
- /* v24@0:8@16 */ scrollViewDidScroll:; // IMP 0x3dbd1c
- /* v16@0:8 */ dismissSettings; // IMP 0x3dbde8
- /* @24@0:8q16 */ titleForPanel:; // IMP 0x3dbef0
- /* @24@0:8d16 */ headerViewWithWidth:; // IMP 0x3dccf8
- /* q24@0:8@16 */ numberOfSectionsInTableView:; // IMP 0x3dd830
- /* q32@0:8@16q24 */ tableView:numberOfRowsInSection:; // IMP 0x3dd910
- /* B32@0:8@16@24 */ tableView:canEditRowAtIndexPath:; // IMP 0x3ddd04
- /* q32@0:8@16@24 */ tableView:editingStyleForRowAtIndexPath:; // IMP 0x3ddd70
- /* B32@0:8@16@24 */ tableView:shouldIndentWhileEditingRowAtIndexPath:; // IMP 0x3ddd78
- /* B32@0:8@16@24 */ tableView:canMoveRowAtIndexPath:; // IMP 0x3ddd80
- /* @40@0:8@16@24@32 */ tableView:targetIndexPathForMoveFromRowAtIndexPath:toProposedIndexPath:; // IMP 0x3dddec
- /* v40@0:8@16@24@32 */ tableView:moveRowAtIndexPath:toIndexPath:; // IMP 0x3dde90
- /* @32@0:8@16q24 */ tableView:titleForHeaderInSection:; // IMP 0x3ddfe4
- /* d32@0:8@16q24 */ tableView:heightForHeaderInSection:; // IMP 0x3dec80
- /* @32@0:8@16q24 */ tableView:titleForFooterInSection:; // IMP 0x3decd4
- /* d32@0:8@16q24 */ tableView:heightForFooterInSection:; // IMP 0x3e158c
- /* d24@0:8@16 */ rootFooterHeightForTableView:; // IMP 0x3e18e8
- /* @32@0:8@16q24 */ tableView:viewForFooterInSection:; // IMP 0x3e19e4
- /* d32@0:8@16@24 */ tableView:heightForRowAtIndexPath:; // IMP 0x3e20e0
- /* @24@0:8@16 */ preparedSettingsCellForTableView:; // IMP 0x3e22f0
- /* v64@0:8@16@24@32@40q48B56B60 */ configureSwitchCell:switch:title:detail:tag:on:enabled:; // IMP 0x3e2a88
- /* v44@0:8@16@24@32B40 */ configurePickerCell:title:detail:enabled:; // IMP 0x3e2c20
- /* v60@0:8@16@24@32q40q48B56 */ configureSegmentedCell:title:items:selectedIndex:tag:enabled:; // IMP 0x3e2d98
- /* @24@0:8d16 */ tabBarIconOffsetDisplayValue:; // IMP 0x3e3040
- /* @24@0:8q16 */ tabBarAdjustmentModeTitle:; // IMP 0x3e314c
- /* @32@0:8q16@24 */ tabBarIconOffsetDetailForMode:axis:; // IMP 0x3e31ec
- /* @24@0:8q16 */ tabBarIconSpacingDetailForMode:; // IMP 0x3e369c
- /* v44@0:8@16@24d32B40 */ configureTabBarIconOffsetCell:axis:value:enabled:; // IMP 0x3e38f8
- /* @24@0:8d16 */ tabBarIconScaleDisplayValue:; // IMP 0x3e41d4
- /* v36@0:8@16d24B32 */ configureTabBarIconScaleCell:value:enabled:; // IMP 0x3e42a8
- /* @32@0:8d16@24 */ homeTextMetricDisplayValue:suffix:; // IMP 0x3e4b34
- /* v80@0:8@16@24@32d40d48d56d64q72 */ configureHomeTextMetricCell:title:detail:value:minimum:maximum:step:tag:; // IMP 0x3e4cb4
- /* @24@0:8@16 */ displayNameForHomeCardID:; // IMP 0x3e50b0
- /* v88@0:8@16@24@32d40d48d56d64@72q80 */ configureFuncCardStepperCell:title:detail:value:minimum:maximum:step:suffix:tag:; // IMP 0x3e5550
- /* @92@0:8{CGRect={CGPoint=dd}{CGSize=dd}}16@48@56@64q72B80@84 */ rootCardWithFrame:title:detail:symbol:tag:enabled:switchView:; // IMP 0x3e5998
- /* @32@0:8@16@24 */ rootGridCellForTableView:indexPath:; // IMP 0x3e63e8
- /* @32@0:8@16@24 */ tableView:cellForRowAtIndexPath:; // IMP 0x3e9628
- /* v16@0:8 */ showOfficialAccountAlert; // IMP 0x4063c8
- /* B16@0:8 */ officialAccountReadyForAction; // IMP 0x4066a0
- /* v16@0:8 */ reconcileDependentFeatureSwitches; // IMP 0x40670c
- /* v16@0:8 */ promptRestartForLiquidToggle; // IMP 0x4069d4
- /* v52@0:8@16@24@32B40B44B48 */ applySMSIconVariantSegment:enabledKey:weightKey:refreshWindows:refreshTopMorphActions:refreshSMSBackChevron:; // IMP 0x406e08
- /* v24@0:8@16 */ segmentedControlChanged:; // IMP 0x406f4c
- /* v24@0:8@16 */ toggleSwitch:; // IMP 0x407964
- /* v24@0:8@16 */ tabBarIconOffsetStepperChanged:; // IMP 0x40af80
- /* v24@0:8@16 */ tabBarIconScaleStepperChanged:; // IMP 0x40b180
- /* v24@0:8@16 */ homeTextMetricStepperChanged:; // IMP 0x40b2f8
- /* v24@0:8@16 */ funcCardStepperChanged:; // IMP 0x40bf14
- /* v16@0:8 */ openReleasePage; // IMP 0x40c2d8
- /* v16@0:8 */ promptAddHomeGroup; // IMP 0x40c36c
- /* v24@0:8@16 */ promptRenameHomeGroup:; // IMP 0x40c824
- /* v32@0:8@16q24 */ presentHomeGroupActionsForGroup:atDisplayIndex:; // IMP 0x40cd78
- /* v36@0:8@16d24B32 */ configureHomeGroupsOffsetSliderCell:value:enabled:; // IMP 0x40dcd4
- /* v24@0:8@16 */ homeGroupsOffsetSliderChanged:; // IMP 0x40e28c
- /* v24@0:8@16 */ homeGroupsOffsetSliderDone:; // IMP 0x40e650
- /* v52@0:8@16@24@32q40B48 */ configureChatBubbleCompactGapSliderCell:title:key:value:enabled:; // IMP 0x40e6c0
- /* v52@0:8@16@24@32q40B48 */ configureChatIndentSliderCell:title:key:value:enabled:; // IMP 0x40ea68
- /* v68@0:8@16@24@32q40q48q56B64 */ configureAvatarCardSliderCell:title:key:value:minimum:maximum:enabled:; // IMP 0x40ee18
- /* v24@0:8@16 */ chatBubbleCompactGapSliderChanged:; // IMP 0x40f1c4
- /* v24@0:8@16 */ chatBubbleCompactGapSliderDone:; // IMP 0x40f3d0
- /* v52@0:8@16@24@32q40B48 */ configureAvatarScaleSliderCell:title:key:value:enabled:; // IMP 0x40f5e8
- /* v24@0:8@16 */ avatarScaleSliderChanged:; // IMP 0x40f98c
- /* v24@0:8@16 */ avatarScaleSliderDone:; // IMP 0x40fb88
- /* v16@0:8 */ wclgPresentSingleBubblePositionPicker; // IMP 0x40fc60
- /* v16@0:8 */ wclgPresentBubblePackPicker; // IMP 0x410428
- /* @24@0:8@16 */ wclgBubbleActionThumbnailForName:; // IMP 0x411524
- /* v32@0:8@16@24 */ wclgAttachBubbleThumbnailForName:toAction:; // IMP 0x4118e8
- /* v24@0:8B16B20 */ wclgPresentBubbleRolePickerSender:dark:; // IMP 0x411a0c
- /* v60@0:8@16@24@32@40q48B56 */ configureMergeInsetSliderCell:title:detail:key:value:enabled:; // IMP 0x412b3c
- /* v24@0:8@16 */ mergeInsetSliderChanged:; // IMP 0x413088
- /* v24@0:8@16 */ mergeInsetSliderDone:; // IMP 0x413208
- /* v36@0:8@16d24B32 */ configureHomeGroupsGapSliderCell:value:enabled:; // IMP 0x4132e0
- /* v24@0:8@16 */ homeGroupsGapSliderChanged:; // IMP 0x413890
- /* v24@0:8@16 */ homeGroupsGapSliderDone:; // IMP 0x413c78
- /* v36@0:8@16d24B32 */ configureHomeGroupsWidthSliderCell:value:enabled:; // IMP 0x413ce8
- /* v24@0:8@16 */ homeGroupsWidthSliderChanged:; // IMP 0x4142cc
- /* v24@0:8@16 */ homeGroupsWidthSliderDone:; // IMP 0x4146c4
- /* v36@0:8@16d24B32 */ configureHomeGroupsStripFontSliderCell:value:enabled:; // IMP 0x414734
- /* v24@0:8@16 */ homeGroupsStripFontSliderChanged:; // IMP 0x414b18
- /* v24@0:8@16 */ homeGroupsStripFontSliderDone:; // IMP 0x414d34
- /* v36@0:8@16d24B32 */ configureHomeGroupsStripWidthSliderCell:value:enabled:; // IMP 0x414da8
- /* v24@0:8@16 */ homeGroupsStripWidthSliderChanged:; // IMP 0x41519c
- /* v24@0:8@16 */ homeGroupsStripWidthSliderDone:; // IMP 0x4153bc
- /* v36@0:8@16d24B32 */ configureHomeGroupsStripOffsetSliderCell:value:enabled:; // IMP 0x41542c
- /* v24@0:8@16 */ homeGroupsStripOffsetSliderChanged:; // IMP 0x4159c4
- /* v24@0:8@16 */ homeGroupsStripOffsetSliderDone:; // IMP 0x415d88
- /* @16@0:8 */ wclgDefaultExpandedGroupName; // IMP 0x415df8
- /* v16@0:8 */ presentHomeGroupsFullscreenEdgePicker; // IMP 0x4160cc
- /* @16@0:8 */ wclgFullscreenDefaultGroupName; // IMP 0x4169bc
- /* v16@0:8 */ presentHomeGroupsFullscreenDefaultGroupPicker; // IMP 0x416d08
- /* v16@0:8 */ presentHomeGroupsDefaultExpandedPicker; // IMP 0x4178f8
- /* v24@0:8q16 */ presentHomeGroupsDefaultActionsAtIndex:; // IMP 0x418340
- /* v64@0:8@16@24@32@?40d48@?56 */ presentHomeListCardValuePickerWithTitle:message:options:optionTitler:currentValue:onPick:; // IMP 0x418d04
- /* v36@0:8@16d24B32 */ configureHomeListCardInsetSliderCell:value:enabled:; // IMP 0x4192d0
- /* v24@0:8@16 */ homeListCardInsetSliderChanged:; // IMP 0x41970c
- /* v24@0:8@16 */ homeListCardInsetSliderDone:; // IMP 0x4199c8
- /* v52@0:8@16@24d32@40B48 */ configureHomeCardCornerSliderCell:title:value:key:enabled:; // IMP 0x419a70
- /* v24@0:8@16 */ homeCardCornerSliderChanged:; // IMP 0x419e94
- /* v24@0:8@16 */ homeCardCornerSliderDone:; // IMP 0x41a0f4
- /* v16@0:8 */ presentHomeListCardGapPicker; // IMP 0x41a1f4
- /* v16@0:8 */ pushHomeListCardColorPicker; // IMP 0x41a764
- /* v16@0:8 */ presentHomeGroupsTextColorPicker; // IMP 0x41aacc
- /* v20@0:8B16 */ pushHomeGroupsPillColorPickerSelected:; // IMP 0x41bbdc
- /* v16@0:8 */ presentHomeGroupsBadgeColorPicker; // IMP 0x41bf8c
- /* v16@0:8 */ pushHomeGroupsStripSelectedColorPicker; // IMP 0x41c2a8
- /* v16@0:8 */ presentHomePinnedBadgeColorPicker; // IMP 0x41c5bc
- /* v24@0:8@16 */ presentHomeGroupMembersForGroupID:; // IMP 0x41c85c
- /* v24@0:8@16 */ rootCardTapped:; // IMP 0x41d014
- /* v16@0:8 */ pushHomeTextContentEditor; // IMP 0x41d250
- /* v16@0:8 */ pushFunctionCardHTMLEditor; // IMP 0x41d6f4
- /* v16@0:8 */ pushFunctionCardCodeLibrary; // IMP 0x41dc14
- /* v16@0:8 */ pushFunctionCardURLEditor; // IMP 0x41de28
- /* v56@0:8@16@24@32q40q48 */ pushHomeCapsulePinnedColorPickerTitle:lightKey:darkKey:lightMode:darkMode:; // IMP 0x41e3a0
- /* v32@0:8@16@24 */ pushFunctionCardColorPickerKey:title:; // IMP 0x41e608
- /* v16@0:8 */ pushVoiceWaveColorPicker; // IMP 0x41e85c
- /* v16@0:8 */ pushHomeTextFontSizesEditor; // IMP 0x41eb5c
- /* v16@0:8 */ pushHomeTextFontWeightsEditor; // IMP 0x41f54c
- /* v16@0:8 */ pushSearchTabBarPlaceholderEditor; // IMP 0x41ffc8
- /* v16@0:8 */ presentSearchTabBarBadgeColorPicker; // IMP 0x4205e8
- /* v16@0:8 */ pushChatBottomPlaceholderEditor; // IMP 0x420a80
- /* v48@0:8q16@24@32q40 */ pushHomeTextColorPickerWithPurpose:key:darkKey:defaultMode:; // IMP 0x421040
- /* v16@0:8 */ pushPaymentBubbleTextColorPicker; // IMP 0x421300
- /* v40@0:8@16@24@32 */ pushAvatarCardColorPickerTitle:lightKey:darkKey:; // IMP 0x421600
- /* v20@0:8B16 */ promptAvatarCardTimeFormatForSelf:; // IMP 0x4218c8
- /* v20@0:8B16 */ pushChatTextColorPickerForSend:; // IMP 0x4228d4
- /* v16@0:8 */ pushChatBottomSMSSendColorPicker; // IMP 0x422d34
- /* v16@0:8 */ wclgPromptChatTopCapsuleSubtitle; // IMP 0x422f88
- /* v16@0:8 */ pushSMSBottomBarIconColorPicker; // IMP 0x423764
- /* v28@0:8q16B24 */ openImagePickerWithPurpose:allowsEditing:; // IMP 0x4239b4
- /* v16@0:8 */ openChatBottomTGAvatarImagePicker; // IMP 0x423c88
- /* v20@0:8B16 */ openHomePinnedMaskImagePickerForDark:; // IMP 0x423c9c
- /* v20@0:8B16 */ openHomePinnedMaskDocumentPickerForDark:; // IMP 0x423cb8
- /* v32@0:8@16@24 */ documentPicker:didPickDocumentsAtURLs:; // IMP 0x423f20
- /* v16@0:8 */ presentHomePinnedMaskPicker; // IMP 0x424504
- /* v20@0:8B16 */ openChatWallpaperImagePickerForDarkMode:; // IMP 0x4253a4
- /* v20@0:8B16 */ openHomeWallpaperImagePickerForDarkMode:; // IMP 0x4253c0
- /* v16@0:8 */ presentChatBottomTGAvatarPicker; // IMP 0x4253dc
- /* v20@0:8B16 */ presentChatWallpaperPickerForDarkMode:; // IMP 0x425b2c
- /* v20@0:8B16 */ presentHomeWallpaperPickerForDarkMode:; // IMP 0x426318
- /* v16@0:8 */ refreshLibraryFooter; // IMP 0x426b50
- /* @40@0:8d16@24@32 */ buildImageLibraryFooterWithWidth:category:title:; // IMP 0x426eb0
- /* @16@0:8 */ currentLibraryCategory; // IMP 0x4281ac
- /* v24@0:8@16 */ presentMultiPhotoPickerForLibraryCategory:; // IMP 0x428214
- /* v24@0:8@16 */ presentMultiDocumentPickerForLibraryCategory:; // IMP 0x4284f8
- /* v32@0:8q16@24 */ finishLibraryBatchAdd:category:; // IMP 0x428734
- /* v32@0:8@16@24 */ picker:didFinishPicking:; // IMP 0x42879c
- /* v24@0:8@16 */ imageLibraryAddTapped:; // IMP 0x428b4c
- /* v24@0:8@16 */ imageLibraryThumbTapped:; // IMP 0x4291c4
- /* v32@0:8@16@24 */ presentSubtitleIconLibraryActionsForItem:sourceView:; // IMP 0x42935c
- /* v32@0:8@16@24 */ presentWallpaperHistoryActionsForItem:sourceView:; // IMP 0x429a24
- /* v32@0:8@16@24 */ presentAvatarLibraryActionsForItem:sourceView:; // IMP 0x42a4d4
- /* v16@0:8 */ afterImageLibraryChanged; // IMP 0x42a964
- /* @32@0:8@16d24 */ roundedThumbForImage:side:; // IMP 0x42a9b8
- /* @24@0:8@16 */ displayNameForWxid:; // IMP 0x42ab4c
- /* v32@0:8@16@24 */ configureAvatarUserCell:wxid:; // IMP 0x42b464
- /* v32@0:8q16@24 */ handleAvatarReplaceSelectionAtRow:sourceView:; // IMP 0x42b79c
- /* v32@0:8@16@24 */ imagePickerController:didFinishPickingMediaWithInfo:; // IMP 0x42bac4
- /* v24@0:8@16 */ imagePickerControllerDidCancel:; // IMP 0x42c2ac
- /* v32@0:8@16@24 */ tableView:didSelectRowAtIndexPath:; // IMP 0x42c304
- /* v16@0:8 */ pushTabBarRightSearchSizePicker; // IMP 0x42edcc
- /* v16@0:8 */ pushSearchTabBarSizePicker; // IMP 0x42f4bc
- /* v20@0:8B16 */ pushColorPickerOutgoing:; // IMP 0x42fc60
- /* v20@0:8B16 */ pushFlowColorPickerStart:; // IMP 0x42ff04
- /* v20@0:8B16 */ pushChatTopMorphDefaultPickerForGroup:; // IMP 0x4301b8
- /* v16@0:8 */ pushBottomGlassModePicker; // IMP 0x4309cc
- /* v16@0:8 */ pushGlassSizePicker; // IMP 0x430cd0
- /* v16@0:8 */ showAdminContactAlert; // IMP 0x430fd4
- /* @16@0:8 */ tableView; // IMP 0x431270
- /* v24@0:8@16 */ setTableView:; // IMP 0x431280
- /* @16@0:8 */ backgroundContainer; // IMP 0x431294
- /* v24@0:8@16 */ setBackgroundContainer:; // IMP 0x4312a4
- /* @16@0:8 */ backgroundGradientA; // IMP 0x4312b8
- /* v24@0:8@16 */ setBackgroundGradientA:; // IMP 0x4312c8
- /* @16@0:8 */ backgroundGradientB; // IMP 0x4312dc
- /* v24@0:8@16 */ setBackgroundGradientB:; // IMP 0x4312ec
- /* q16@0:8 */ panel; // IMP 0x431300
- /* v24@0:8q16 */ setPanel:; // IMP 0x431310
- /* B16@0:8 */ rootTableRevealed; // IMP 0x431320
- /* v20@0:8B16 */ setRootTableRevealed:; // IMP 0x431330
- /* @16@0:8 */ rootTopFadeView; // IMP 0x431340
- /* v24@0:8@16 */ setRootTopFadeView:; // IMP 0x431350
- /* @16@0:8 */ rootBottomFadeView; // IMP 0x431364
- /* v24@0:8@16 */ setRootBottomFadeView:; // IMP 0x431374
- /* @16@0:8 */ rootEdgeFadeMask; // IMP 0x431388
- /* v24@0:8@16 */ setRootEdgeFadeMask:; // IMP 0x431398
- /* v16@0:8 */ .cxx_destruct; // IMP 0x4313ac
@end

@interface WCLGTabBarVisualHostView /* VM 0x4c6600 */
@end

@interface WCLGGetButton /* VM 0x4c6628 */
- /* @48@0:8{CGRect={CGPoint=dd}{CGSize=dd}}16 */ initWithFrame:; // IMP 0x4454f4
- /* v32@0:8@16@24 */ setIdleTitle:icon:; // IMP 0x445e00
- /* v20@0:8B16 */ setDownloading:; // IMP 0x445f00
- /* v24@0:8d16 */ setProgress:; // IMP 0x446050
- /* v16@0:8 */ layoutSubviews; // IMP 0x4460f8
- /* v16@0:8 */ tapped; // IMP 0x446480
- /* @?16@0:8 */ onTap; // IMP 0x446510
- /* v24@0:8@?16 */ setOnTap:; // IMP 0x446520
- /* @16@0:8 */ pill; // IMP 0x44652c
- /* v24@0:8@16 */ setPill:; // IMP 0x44653c
- /* @16@0:8 */ pillIcon; // IMP 0x446550
- /* v24@0:8@16 */ setPillIcon:; // IMP 0x446560
- /* @16@0:8 */ pillLabel; // IMP 0x446574
- /* v24@0:8@16 */ setPillLabel:; // IMP 0x446584
- /* @16@0:8 */ track; // IMP 0x446598
- /* v24@0:8@16 */ setTrack:; // IMP 0x4465a8
- /* @16@0:8 */ ring; // IMP 0x4465bc
- /* v24@0:8@16 */ setRing:; // IMP 0x4465cc
- /* @16@0:8 */ stopSquare; // IMP 0x4465e0
- /* v24@0:8@16 */ setStopSquare:; // IMP 0x4465f0
- /* B16@0:8 */ downloading; // IMP 0x446604
- /* v16@0:8 */ .cxx_destruct; // IMP 0x446614
@end

@interface WCLGImageZoom /* VM 0x4c6678 */
- /* @24@0:8@16 */ initWithImage:; // IMP 0x4466b8
- /* v16@0:8 */ viewDidLoad; // IMP 0x446740
- /* @24@0:8@16 */ viewForZoomingInScrollView:; // IMP 0x446c50
- /* v24@0:8@16 */ doubleTap:; // IMP 0x446c5c
- /* v16@0:8 */ dismissSelf; // IMP 0x446cf0
- /* @16@0:8 */ image; // IMP 0x446d04
- /* v24@0:8@16 */ setImage:; // IMP 0x446d14
- /* @16@0:8 */ scroll; // IMP 0x446d28
- /* v24@0:8@16 */ setScroll:; // IMP 0x446d38
- /* @16@0:8 */ imageView; // IMP 0x446d4c
- /* v24@0:8@16 */ setImageView:; // IMP 0x446d5c
- /* v16@0:8 */ .cxx_destruct; // IMP 0x446d70
@end

@interface WCLGThemeDetailViewController /* VM 0x4c66c8 */
- /* @32@0:8@16@?24 */ initWithTheme:download:; // IMP 0x446dc4
- /* v16@0:8 */ dealloc; // IMP 0x446e7c
- /* v16@0:8 */ viewDidLoad; // IMP 0x446ee0
- /* @16@0:8 */ stateTitle; // IMP 0x447240
- /* @16@0:8 */ stateIcon; // IMP 0x447504
- /* v16@0:8 */ buildContent; // IMP 0x447c98
- /* d40@0:8d16d24d32 */ addSubPackagesAtY:width:pad:; // IMP 0x449b24
- /* v24@0:8@16 */ subPackageTapped:; // IMP 0x44aa60
- /* v16@0:8 */ wclgDismissModal; // IMP 0x44ac40
- /* d40@0:8d16d24d32 */ addLiveCardPreviewAtY:width:pad:; // IMP 0x44ac54
- /* v24@0:8d16 */ layoutLiveCardPreviewForWidth:; // IMP 0x44b984
- /* v16@0:8 */ viewDidLayoutSubviews; // IMP 0x44bd4c
- /* v16@0:8 */ loadLiveCardPreview; // IMP 0x44be24
- /* v32@0:8@16Q24 */ renderLiveCardPreviewHTML:generation:; // IMP 0x44c610
- /* v40@0:8@16@24@?32 */ webView:decidePolicyForNavigationAction:decisionHandler:; // IMP 0x44c9d8
- /* v32@0:8@16@24 */ webView:didFinishNavigation:; // IMP 0x44cdc8
- /* v40@0:8@16@24@32 */ webView:didFailNavigation:withError:; // IMP 0x44ceb8
- /* v40@0:8@16@24@32 */ webView:didFailProvisionalNavigation:withError:; // IMP 0x44ced0
- /* v40@0:8@16@24@32 */ showCardPreviewNavigationError:navigation:inWebView:; // IMP 0x44cee8
- /* v24@0:8@16 */ traitCollectionDidChange:; // IMP 0x44d394
- /* d40@0:8d16d24d32 */ addSeparatorAtY:width:pad:; // IMP 0x44d45c
- /* v24@0:8@16 */ previewTapped:; // IMP 0x44d55c
- /* v16@0:8 */ startDownload; // IMP 0x44d660
- /* v16@0:8 */ primaryButtonTapped; // IMP 0x44e32c
- /* @24@0:8d16 */ percentText:; // IMP 0x44e9e0
- /* @24@0:8d16 */ speedText:; // IMP 0x44eab0
- /* v24@0:8@16 */ toast:; // IMP 0x44ec98
- /* @16@0:8 */ theme; // IMP 0x44ed14
- /* v24@0:8@16 */ setTheme:; // IMP 0x44ed24
- /* @?16@0:8 */ downloadHandler; // IMP 0x44ed38
- /* v24@0:8@?16 */ setDownloadHandler:; // IMP 0x44ed48
- /* @16@0:8 */ bg; // IMP 0x44ed54
- /* v24@0:8@16 */ setBg:; // IMP 0x44ed64
- /* @16@0:8 */ scroll; // IMP 0x44ed78
- /* v24@0:8@16 */ setScroll:; // IMP 0x44ed88
- /* @16@0:8 */ getButton; // IMP 0x44ed9c
- /* v24@0:8@16 */ setGetButton:; // IMP 0x44edac
- /* @16@0:8 */ speedLabel; // IMP 0x44edc0
- /* v24@0:8@16 */ setSpeedLabel:; // IMP 0x44edd0
- /* B16@0:8 */ downloadedNow; // IMP 0x44ede4
- /* v20@0:8B16 */ setDownloadedNow:; // IMP 0x44edf4
- /* B16@0:8 */ readyToApply; // IMP 0x44ee04
- /* v20@0:8B16 */ setReadyToApply:; // IMP 0x44ee14
- /* B16@0:8 */ appliedNow; // IMP 0x44ee24
- /* v20@0:8B16 */ setAppliedNow:; // IMP 0x44ee34
- /* @16@0:8 */ cardPreviewContainer; // IMP 0x44ee44
- /* v24@0:8@16 */ setCardPreviewContainer:; // IMP 0x44ee54
- /* @16@0:8 */ cardPreviewViewport; // IMP 0x44ee68
- /* v24@0:8@16 */ setCardPreviewViewport:; // IMP 0x44ee78
- /* @16@0:8 */ cardPreviewWebView; // IMP 0x44ee8c
- /* v24@0:8@16 */ setCardPreviewWebView:; // IMP 0x44ee9c
- /* @16@0:8 */ cardPreviewMediaController; // IMP 0x44eeb0
- /* v24@0:8@16 */ setCardPreviewMediaController:; // IMP 0x44eec0
- /* @16@0:8 */ cardPreviewMediaScope; // IMP 0x44eed4
- /* v24@0:8@16 */ setCardPreviewMediaScope:; // IMP 0x44eee4
- /* @16@0:8 */ cardPreviewStatus; // IMP 0x44eef0
- /* v24@0:8@16 */ setCardPreviewStatus:; // IMP 0x44ef00
- /* @16@0:8 */ cardPreviewNavigation; // IMP 0x44ef14
- /* v24@0:8@16 */ setCardPreviewNavigation:; // IMP 0x44ef24
- /* Q16@0:8 */ cardPreviewGeneration; // IMP 0x44ef38
- /* v24@0:8Q16 */ setCardPreviewGeneration:; // IMP 0x44ef48
- /* d16@0:8 */ cardPreviewLayoutWidth; // IMP 0x44ef58
- /* v24@0:8d16 */ setCardPreviewLayoutWidth:; // IMP 0x44ef68
- /* v16@0:8 */ .cxx_destruct; // IMP 0x44ef78
@end

@interface WCLGThemeManageCell /* VM 0x4c6718 */
- /* @32@0:8q16@24 */ initWithStyle:reuseIdentifier:; // IMP 0x44f094
- /* v28@0:8@16B24 */ configureWithItem:active:; // IMP 0x450530
- /* v28@0:8@16B24 */ configureNoneForType:active:; // IMP 0x450a60
- /* @16@0:8 */ themeIconView; // IMP 0x451088
- /* v24@0:8@16 */ setThemeIconView:; // IMP 0x451098
- /* @16@0:8 */ nameLabel; // IMP 0x4510ac
- /* v24@0:8@16 */ setNameLabel:; // IMP 0x4510bc
- /* @16@0:8 */ detailLabel; // IMP 0x4510d0
- /* v24@0:8@16 */ setDetailLabel:; // IMP 0x4510e0
- /* @16@0:8 */ activeLabel; // IMP 0x4510f4
- /* v24@0:8@16 */ setActiveLabel:; // IMP 0x451104
- /* @16@0:8 */ menuIconView; // IMP 0x451118
- /* v24@0:8@16 */ setMenuIconView:; // IMP 0x451128
- /* v16@0:8 */ .cxx_destruct; // IMP 0x45113c
@end

@interface WCLGThemeManageViewController /* VM 0x4c6768 */
- /* v16@0:8 */ viewDidLoad; // IMP 0x4511b8
- /* v20@0:8B16 */ viewWillAppear:; // IMP 0x451e2c
- /* v16@0:8 */ viewDidLayoutSubviews; // IMP 0x451e7c
- /* v16@0:8 */ reload; // IMP 0x452100
- /* v16@0:8 */ loadCatalogIconsIfNeeded; // IMP 0x452580
- /* v16@0:8 */ segChanged; // IMP 0x452a94
- /* @16@0:8 */ current; // IMP 0x452af8
- /* @16@0:8 */ currentType; // IMP 0x452b74
- /* q16@0:8 */ activeThemeId; // IMP 0x452cc4
- /* B24@0:8@16 */ isActiveItem:; // IMP 0x452d20
- /* v16@0:8 */ updateCurrentStatus; // IMP 0x452da8
- /* v16@0:8 */ updateEmpty; // IMP 0x4530b0
- /* q32@0:8@16q24 */ tableView:numberOfRowsInSection:; // IMP 0x453134
- /* @32@0:8@16@24 */ tableView:cellForRowAtIndexPath:; // IMP 0x453180
- /* v32@0:8@16@24 */ tableView:didSelectRowAtIndexPath:; // IMP 0x45334c
- /* v16@0:8 */ deactivateCurrentTheme; // IMP 0x4534a0
- /* v32@0:8@16@24 */ presentActionsForTheme:sourceView:; // IMP 0x453850
- /* v24@0:8@16 */ confirmRevoke:; // IMP 0x453fa0
- /* v24@0:8@16 */ applyTheme:; // IMP 0x4546a8
- /* v24@0:8@16 */ removeLocal:; // IMP 0x4549a0
- /* v24@0:8@16 */ revoke:; // IMP 0x454b04
- /* v24@0:8@16 */ toast:; // IMP 0x454e24
- /* v16@0:8 */ dismissSelf; // IMP 0x454ea0
- /* @16@0:8 */ seg; // IMP 0x454eb4
- /* v24@0:8@16 */ setSeg:; // IMP 0x454ec4
- /* @16@0:8 */ segBar; // IMP 0x454ed8
- /* v24@0:8@16 */ setSegBar:; // IMP 0x454ee8
- /* @16@0:8 */ currentLabel; // IMP 0x454efc
- /* v24@0:8@16 */ setCurrentLabel:; // IMP 0x454f0c
- /* @16@0:8 */ bg; // IMP 0x454f20
- /* v24@0:8@16 */ setBg:; // IMP 0x454f30
- /* @16@0:8 */ tableView; // IMP 0x454f44
- /* v24@0:8@16 */ setTableView:; // IMP 0x454f54
- /* @16@0:8 */ emptyLabel; // IMP 0x454f68
- /* v24@0:8@16 */ setEmptyLabel:; // IMP 0x454f78
- /* @16@0:8 */ bubbles; // IMP 0x454f8c
- /* v24@0:8@16 */ setBubbles:; // IMP 0x454f9c
- /* @16@0:8 */ cards; // IMP 0x454fb0
- /* v24@0:8@16 */ setCards:; // IMP 0x454fc0
- /* @16@0:8 */ catalogIconURLs; // IMP 0x454fd4
- /* v24@0:8@16 */ setCatalogIconURLs:; // IMP 0x454fe4
- /* B16@0:8 */ loadingCatalogIcons; // IMP 0x454ff0
- /* v20@0:8B16 */ setLoadingCatalogIcons:; // IMP 0x455000
- /* B16@0:8 */ catalogIconsLoaded; // IMP 0x455010
- /* v20@0:8B16 */ setCatalogIconsLoaded:; // IMP 0x455020
- /* v16@0:8 */ .cxx_destruct; // IMP 0x455030
@end

@interface WCLGVoiceWaveView /* VM 0x4c67b8 */
- /* @48@0:8{CGRect={CGPoint=dd}{CGSize=dd}}16 */ initWithFrame:; // IMP 0x4596f0
- /* @24@0:8q16 */ wclgColorForStatus:; // IMP 0x459b80
- /* v16@0:8 */ wclgApplyColors; // IMP 0x459c60
- /* v16@0:8 */ dealloc; // IMP 0x459e50
- /* {CGRect={CGPoint=dd}{CGSize=dd}}16@0:8 */ wclgBarsArea; // IMP 0x459eb4
- /* v16@0:8 */ layoutSubviews; // IMP 0x459f20
- /* v24@0:8@?16 */ wclgLayoutBarsWithProvider:; // IMP 0x45a004
- /* v24@0:8q16 */ setStatus:; // IMP 0x45a20c
- /* v24@0:8@16 */ setBaseColor:; // IMP 0x45a234
- /* v20@0:8B16 */ setLockColor:; // IMP 0x45a284
- /* v16@0:8 */ startRecording; // IMP 0x45a29c
- /* v16@0:8 */ stopRecording; // IMP 0x45a4b8
- /* v24@0:8@16 */ wclgTick:; // IMP 0x45a510
- /* q16@0:8 */ status; // IMP 0x45a81c
- /* @16@0:8 */ baseColor; // IMP 0x45a82c
- /* B16@0:8 */ lockColor; // IMP 0x45a83c
- /* @16@0:8 */ bars; // IMP 0x45a84c
- /* v24@0:8@16 */ setBars:; // IMP 0x45a85c
- /* @16@0:8 */ timeLabel; // IMP 0x45a870
- /* v24@0:8@16 */ setTimeLabel:; // IMP 0x45a880
- /* @16@0:8 */ link; // IMP 0x45a894
- /* v24@0:8@16 */ setLink:; // IMP 0x45a8a4
- /* d16@0:8 */ startTime; // IMP 0x45a8b8
- /* v24@0:8d16 */ setStartTime:; // IMP 0x45a8c8
- /* q16@0:8 */ lastWholeSecond; // IMP 0x45a8d8
- /* v24@0:8q16 */ setLastWholeSecond:; // IMP 0x45a8e8
- /* v16@0:8 */ .cxx_destruct; // IMP 0x45a8f8
@end

// ===== arm64e =====
@interface WCLGChatPinnedHitCatcher /* VM 0x4d8fd0 */
- /* @40@0:8{CGPoint=dd}16@32 */ hitTest:withEvent:; // IMP 0x2ac8c
@end

@interface WCLGSMSBackContentView /* VM 0x4d8ff8 */
- /* @48@0:8{CGRect={CGPoint=dd}{CGSize=dd}}16 */ initWithFrame:; // IMP 0x67c98
- /* v32@0:8@16@24 */ updateChevron:count:; // IMP 0x681f4
- /* v16@0:8 */ layoutSubviews; // IMP 0x68364
- /* @16@0:8 */ chevronView; // IMP 0x689ec
- /* v24@0:8@16 */ setChevronView:; // IMP 0x689fc
- /* @16@0:8 */ badgeView; // IMP 0x68a10
- /* v24@0:8@16 */ setBadgeView:; // IMP 0x68a20
- /* @16@0:8 */ countLabel; // IMP 0x68a34
- /* v24@0:8@16 */ setCountLabel:; // IMP 0x68a44
- /* @16@0:8 */ countText; // IMP 0x68a58
- /* v24@0:8@16 */ setCountText:; // IMP 0x68a68
- /* v16@0:8 */ .cxx_destruct; // IMP 0x68a74
@end

@interface WCLGVoiceHoldRecognizer /* VM 0x4d9048 */
- /* v16@0:8 */ wclgNoop; // IMP 0x86658
- /* v16@0:8 */ wclgCancelHoldBlock; // IMP 0x8665c
- /* @16@0:8 */ wclgResolvedToolView; // IMP 0x866fc
- /* v24@0:8@16 */ wclgMountWaveViewOnToolView:; // IMP 0x86904
- /* v32@0:8@16@24 */ wclgMountHintAboveInputWithAnchor:toolView:; // IMP 0x87704
- /* v16@0:8 */ wclgTeardownWaveView; // IMP 0x87fac
- /* v24@0:8@16 */ wclgUpdateWaveStatusForTouches:; // IMP 0x882cc
- /* v16@0:8 */ wclgBeginRecording; // IMP 0x88774
- /* v32@0:8@16@24 */ touchesBegan:withEvent:; // IMP 0x889c4
- /* v32@0:8@16@24 */ touchesMoved:withEvent:; // IMP 0x88e34
- /* v32@0:8@16@24 */ touchesEnded:withEvent:; // IMP 0x88fbc
- /* v32@0:8@16@24 */ touchesCancelled:withEvent:; // IMP 0x891c0
- /* v16@0:8 */ reset; // IMP 0x89388
- /* @16@0:8 */ toolView; // IMP 0x89468
- /* v24@0:8@16 */ setToolView:; // IMP 0x8949c
- /* B16@0:8 */ recording; // IMP 0x894b0
- /* v20@0:8B16 */ setRecording:; // IMP 0x894c0
- /* @16@0:8 */ pendingTouches; // IMP 0x894d0
- /* v24@0:8@16 */ setPendingTouches:; // IMP 0x894e0
- /* @16@0:8 */ pendingEvent; // IMP 0x894f4
- /* v24@0:8@16 */ setPendingEvent:; // IMP 0x89504
- /* @?16@0:8 */ holdBlock; // IMP 0x89518
- /* v24@0:8@?16 */ setHoldBlock:; // IMP 0x89528
- /* @16@0:8 */ waveView; // IMP 0x89534
- /* v24@0:8@16 */ setWaveView:; // IMP 0x89544
- /* @16@0:8 */ dimmedTextView; // IMP 0x89558
- /* v24@0:8@16 */ setDimmedTextView:; // IMP 0x89568
- /* @16@0:8 */ savedTextColor; // IMP 0x8957c
- /* v24@0:8@16 */ setSavedTextColor:; // IMP 0x8958c
- /* @16@0:8 */ savedTintColor; // IMP 0x895a0
- /* v24@0:8@16 */ setSavedTintColor:; // IMP 0x895b0
- /* @16@0:8 */ hintFloatLabel; // IMP 0x895c4
- /* v24@0:8@16 */ setHintFloatLabel:; // IMP 0x895d4
- /* @16@0:8 */ waveBaseColor; // IMP 0x895e8
- /* v24@0:8@16 */ setWaveBaseColor:; // IMP 0x895f8
- /* B16@0:8 */ waveLockColor; // IMP 0x8960c
- /* v20@0:8B16 */ setWaveLockColor:; // IMP 0x8961c
- /* {CGPoint=dd}16@0:8 */ startLocationInWindow; // IMP 0x8962c
- /* v32@0:8{CGPoint=dd}16 */ setStartLocationInWindow:; // IMP 0x89640
- /* v16@0:8 */ .cxx_destruct; // IMP 0x89654
@end

@interface WCLGMsgMergeCellHotCache /* VM 0x4d90c0 */
- /* v16@0:8 */ .cxx_destruct; // IMP 0xa1f04
@end

@interface WCLGAvatarPickerHandler /* VM 0x4d9110 */
- /* v32@0:8@16@24 */ imagePickerController:didFinishPickingMediaWithInfo:; // IMP 0x124b20
- /* v24@0:8@16 */ imagePickerControllerDidCancel:; // IMP 0x124de0
- /* @16@0:8 */ wxid; // IMP 0x124e38
- /* v24@0:8@16 */ setWxid:; // IMP 0x124e40
- /* @?16@0:8 */ onDone; // IMP 0x124e48
- /* v24@0:8@?16 */ setOnDone:; // IMP 0x124e50
- /* @16@0:8 */ retainSelf; // IMP 0x124e58
- /* v24@0:8@16 */ setRetainSelf:; // IMP 0x124e60
- /* v16@0:8 */ .cxx_destruct; // IMP 0x124e6c
@end

@interface WCLGImageLibraryPickerViewController /* VM 0x4d9138 */
- /* @40@0:8@16@24@?32 */ initWithCategory:title:onPick:; // IMP 0x125d90
- /* v16@0:8 */ viewDidLoad; // IMP 0x125f1c
- /* v16@0:8 */ closeTapped; // IMP 0x12684c
- /* q32@0:8@16q24 */ collectionView:numberOfItemsInSection:; // IMP 0x126860
- /* {CGSize=dd}40@0:8@16@24@32 */ collectionView:layout:sizeForItemAtIndexPath:; // IMP 0x1268b0
- /* @32@0:8@16@24 */ collectionView:cellForItemAtIndexPath:; // IMP 0x12692c
- /* v32@0:8@16@24 */ collectionView:didSelectItemAtIndexPath:; // IMP 0x126cb0
- /* @16@0:8 */ category; // IMP 0x126eb4
- /* v24@0:8@16 */ setCategory:; // IMP 0x126ec4
- /* @?16@0:8 */ onPick; // IMP 0x126ed0
- /* v24@0:8@?16 */ setOnPick:; // IMP 0x126ee0
- /* @16@0:8 */ items; // IMP 0x126eec
- /* v24@0:8@16 */ setItems:; // IMP 0x126efc
- /* @16@0:8 */ collectionView; // IMP 0x126f08
- /* v24@0:8@16 */ setCollectionView:; // IMP 0x126f18
- /* @16@0:8 */ emptyLabel; // IMP 0x126f2c
- /* v24@0:8@16 */ setEmptyLabel:; // IMP 0x126f3c
- /* v16@0:8 */ .cxx_destruct; // IMP 0x126f50
@end

@interface WCLGChatAvatarMenuDelegate /* VM 0x4d91b0 */
- /* @40@0:8@16{CGPoint=dd}24 */ contextMenuInteraction:configurationForMenuAtLocation:; // IMP 0x12f1b0
- /* v40@0:8@16@24@32 */ contextMenuInteraction:willEndForConfiguration:animator:; // IMP 0x130ae4
- /* @16@0:8 */ cell; // IMP 0x130d8c
- /* v24@0:8@16 */ setCell:; // IMP 0x130db8
- /* @16@0:8 */ headView; // IMP 0x130dc4
- /* v24@0:8@16 */ setHeadView:; // IMP 0x130df0
- /* @16@0:8 */ frozenWxid; // IMP 0x130dfc
- /* v24@0:8@16 */ setFrozenWxid:; // IMP 0x130e04
- /* @16@0:8 */ frozenChatRoomId; // IMP 0x130e0c
- /* v24@0:8@16 */ setFrozenChatRoomId:; // IMP 0x130e14
- /* @16@0:8 */ frozenWrap; // IMP 0x130e1c
- /* v24@0:8@16 */ setFrozenWrap:; // IMP 0x130e24
- /* v16@0:8 */ .cxx_destruct; // IMP 0x130e30
@end

@interface WCLGChatBottomSMSProxySendTarget /* VM 0x4d9200 */
- /* v24@0:8@16 */ wclg_smsSendTapped:; // IMP 0x135974
- /* v24@0:8@16 */ wclg_smsMoreTapped:; // IMP 0x13663c
- /* v24@0:8@16 */ wclg_smsEmojiTapped:; // IMP 0x13675c
- /* v24@0:8@16 */ wclg_smsVoiceTapped:; // IMP 0x136808
@end

@interface WCLGChatTextTarget /* VM 0x4d9250 */
- /* @16@0:8 */ view; // IMP 0x1a3794
- /* v24@0:8@16 */ setView:; // IMP 0x1a37c0
- /* B16@0:8 */ richText; // IMP 0x1a37cc
- /* v20@0:8B16 */ setRichText:; // IMP 0x1a37d4
- /* B16@0:8 */ explicitExternalTarget; // IMP 0x1a37dc
- /* v20@0:8B16 */ setExplicitExternalTarget:; // IMP 0x1a37e4
- /* @16@0:8 */ lastAppliedColor; // IMP 0x1a37ec
- /* v24@0:8@16 */ setLastAppliedColor:; // IMP 0x1a37f4
- /* @16@0:8 */ originalTextColor; // IMP 0x1a3800
- /* v24@0:8@16 */ setOriginalTextColor:; // IMP 0x1a3808
- /* @16@0:8 */ originalRichTextColor; // IMP 0x1a3814
- /* v24@0:8@16 */ setOriginalRichTextColor:; // IMP 0x1a381c
- /* @16@0:8 */ originalAttributedText; // IMP 0x1a3828
- /* v24@0:8@16 */ setOriginalAttributedText:; // IMP 0x1a3830
- /* B16@0:8 */ capturedLabelOriginals; // IMP 0x1a383c
- /* v20@0:8B16 */ setCapturedLabelOriginals:; // IMP 0x1a3844
- /* B16@0:8 */ capturedRichTextOriginal; // IMP 0x1a384c
- /* v20@0:8B16 */ setCapturedRichTextOriginal:; // IMP 0x1a3854
- /* Q16@0:8 */ lastTextObject; // IMP 0x1a385c
- /* v24@0:8Q16 */ setLastTextObject:; // IMP 0x1a3864
- /* Q16@0:8 */ lastAttributedObject; // IMP 0x1a386c
- /* v24@0:8Q16 */ setLastAttributedObject:; // IMP 0x1a3874
- /* Q16@0:8 */ lastTextLength; // IMP 0x1a387c
- /* v24@0:8Q16 */ setLastTextLength:; // IMP 0x1a3884
- /* Q16@0:8 */ lastAttributedLength; // IMP 0x1a388c
- /* v24@0:8Q16 */ setLastAttributedLength:; // IMP 0x1a3894
- /* v16@0:8 */ .cxx_destruct; // IMP 0x1a389c
@end

@interface WCLGChatTextApplyState /* VM 0x4d9278 */
- /* @16@0:8 */ init; // IMP 0x1a3900
- /* Q16@0:8 */ viewModelToken; // IMP 0x1a3970
- /* v24@0:8Q16 */ setViewModelToken:; // IMP 0x1a3978
- /* Q16@0:8 */ stableIdentityHash; // IMP 0x1a3980
- /* v24@0:8Q16 */ setStableIdentityHash:; // IMP 0x1a3988
- /* Q16@0:8 */ identityGeneration; // IMP 0x1a3990
- /* v24@0:8Q16 */ setIdentityGeneration:; // IMP 0x1a3998
- /* Q16@0:8 */ contentGeneration; // IMP 0x1a39a0
- /* v24@0:8Q16 */ setContentGeneration:; // IMP 0x1a39a8
- /* Q16@0:8 */ targetGeneration; // IMP 0x1a39b0
- /* v24@0:8Q16 */ setTargetGeneration:; // IMP 0x1a39b8
- /* Q16@0:8 */ layoutGeneration; // IMP 0x1a39c0
- /* v24@0:8Q16 */ setLayoutGeneration:; // IMP 0x1a39c8
- /* Q16@0:8 */ layoutDepth; // IMP 0x1a39d0
- /* v24@0:8Q16 */ setLayoutDepth:; // IMP 0x1a39d8
- /* Q16@0:8 */ lastAppliedLayoutGeneration; // IMP 0x1a39e0
- /* v24@0:8Q16 */ setLastAppliedLayoutGeneration:; // IMP 0x1a39e8
- /* Q16@0:8 */ lastApplySignature; // IMP 0x1a39f0
- /* v24@0:8Q16 */ setLastApplySignature:; // IMP 0x1a39f8
- /* Q16@0:8 */ targetStructureSignature; // IMP 0x1a3a00
- /* v24@0:8Q16 */ setTargetStructureSignature:; // IMP 0x1a3a08
- /* Q16@0:8 */ contentSignature; // IMP 0x1a3a10
- /* v24@0:8Q16 */ setContentSignature:; // IMP 0x1a3a18
- /* Q16@0:8 */ nextFallbackScanLayoutGeneration; // IMP 0x1a3a20
- /* v24@0:8Q16 */ setNextFallbackScanLayoutGeneration:; // IMP 0x1a3a28
- /* @16@0:8 */ contentView; // IMP 0x1a3a30
- /* v24@0:8@16 */ setContentView:; // IMP 0x1a3a5c
- /* @16@0:8 */ bodyView; // IMP 0x1a3a68
- /* v24@0:8@16 */ setBodyView:; // IMP 0x1a3a94
- /* @16@0:8 */ targets; // IMP 0x1a3aa0
- /* v24@0:8@16 */ setTargets:; // IMP 0x1a3aa8
- /* Q16@0:8 */ resolvedColorSignature; // IMP 0x1a3ab0
- /* v24@0:8Q16 */ setResolvedColorSignature:; // IMP 0x1a3ab8
- /* B16@0:8 */ resolvedDarkMode; // IMP 0x1a3ac0
- /* v20@0:8B16 */ setResolvedDarkMode:; // IMP 0x1a3ac8
- /* B16@0:8 */ resolvedOutgoing; // IMP 0x1a3ad0
- /* v20@0:8B16 */ setResolvedOutgoing:; // IMP 0x1a3ad8
- /* B16@0:8 */ resolvedPayment; // IMP 0x1a3ae0
- /* v20@0:8B16 */ setResolvedPayment:; // IMP 0x1a3ae8
- /* @16@0:8 */ resolvedColor; // IMP 0x1a3af0
- /* v24@0:8@16 */ setResolvedColor:; // IMP 0x1a3af8
- /* v16@0:8 */ .cxx_destruct; // IMP 0x1a3b04
@end

@interface WCLGBubbleFlushDriver /* VM 0x4d92c8 */
- /* v16@0:8 */ kick; // IMP 0x1b5fd4
- /* v24@0:8@16 */ tick:; // IMP 0x1b610c
- /* @16@0:8 */ link; // IMP 0x1b678c
- /* v24@0:8@16 */ setLink:; // IMP 0x1b6794
- /* v16@0:8 */ .cxx_destruct; // IMP 0x1b67a0
@end

@interface WCLGNativeProfileTitleHitView /* VM 0x4d9318 */
- /* @48@0:8{CGRect={CGPoint=dd}{CGSize=dd}}16 */ initWithFrame:; // IMP 0x1e854c
- /* B40@0:8{CGPoint=dd}16@32 */ pointInside:withEvent:; // IMP 0x1e85b0
- /* {CGRect={CGPoint=dd}{CGSize=dd}}16@0:8 */ wclgHitRect; // IMP 0x1e8714
- /* v48@0:8{CGRect={CGPoint=dd}{CGSize=dd}}16 */ setWclgHitRect:; // IMP 0x1e872c
- /* B16@0:8 */ wclgCircularHitTest; // IMP 0x1e8744
- /* v20@0:8B16 */ setWclgCircularHitTest:; // IMP 0x1e8754
@end

@interface WCLGNativeProfileTitleTapTarget /* VM 0x4d9390 */
- /* v24@0:8@16 */ wclg_nativeProfileTitleTapped:; // IMP 0x1e8764
- /* @16@0:8 */ controller; // IMP 0x1e9e1c
- /* v24@0:8@16 */ setController:; // IMP 0x1e9e24
@end

@interface WCLGCapsuleSearchGestureTarget /* VM 0x4d93e0 */
- /* v24@0:8@16 */ handleLongPress:; // IMP 0x223f88
@end

@interface WCLGChatTopCapsuleHostView /* VM 0x4d9408 */
- /* @48@0:8{CGRect={CGPoint=dd}{CGSize=dd}}16 */ initWithFrame:; // IMP 0x233b2c
- /* v24@0:8@16 */ setAvatarView:; // IMP 0x234094
- /* v16@0:8 */ layoutSubviews; // IMP 0x234144
- /* v16@0:8 */ wclg_handleTap; // IMP 0x2345dc
- /* @16@0:8 */ cachedTitle; // IMP 0x2347dc
- /* v24@0:8@16 */ setCachedTitle:; // IMP 0x2347ec
- /* @16@0:8 */ titleLabel; // IMP 0x2347f8
- /* v24@0:8@16 */ setTitleLabel:; // IMP 0x234808
- /* @16@0:8 */ subtitleLabel; // IMP 0x23481c
- /* v24@0:8@16 */ setSubtitleLabel:; // IMP 0x23482c
- /* @16@0:8 */ subtitleIconView; // IMP 0x234840
- /* v24@0:8@16 */ setSubtitleIconView:; // IMP 0x234850
- /* @16@0:8 */ avatarView; // IMP 0x234864
- /* @16@0:8 */ controller; // IMP 0x234874
- /* v24@0:8@16 */ setController:; // IMP 0x2348a8
- /* B16@0:8 */ avatarOnLeft; // IMP 0x2348bc
- /* v20@0:8B16 */ setAvatarOnLeft:; // IMP 0x2348cc
- /* v16@0:8 */ .cxx_destruct; // IMP 0x2348dc
@end

@interface WCLGChatTopFadeOverlayHost /* VM 0x4d9458 */
- /* @48@0:8{CGRect={CGPoint=dd}{CGSize=dd}}16 */ initWithFrame:; // IMP 0x237af0
- /* v16@0:8 */ layoutSubviews; // IMP 0x237e00
- /* @16@0:8 */ scrollView; // IMP 0x23813c
- /* v24@0:8@16 */ setScrollView:; // IMP 0x238170
- /* q16@0:8 */ overlayMode; // IMP 0x238184
- /* v24@0:8q16 */ setOverlayMode:; // IMP 0x238194
- /* @16@0:8 */ edgeView; // IMP 0x2381a4
- /* v24@0:8@16 */ setEdgeView:; // IMP 0x2381b4
- /* v16@0:8 */ .cxx_destruct; // IMP 0x2381c8
@end

@interface WCLGChatBottomFadeOverlayHost /* VM 0x4d94a8 */
- /* @48@0:8{CGRect={CGPoint=dd}{CGSize=dd}}16 */ initWithFrame:; // IMP 0x238218
- /* v16@0:8 */ layoutSubviews; // IMP 0x238554
- /* @16@0:8 */ scrollView; // IMP 0x238708
- /* v24@0:8@16 */ setScrollView:; // IMP 0x23873c
- /* @16@0:8 */ edgeView; // IMP 0x238750
- /* v24@0:8@16 */ setEdgeView:; // IMP 0x238760
- /* d16@0:8 */ configuredBlurRadius; // IMP 0x238774
- /* v24@0:8d16 */ setConfiguredBlurRadius:; // IMP 0x238784
- /* v16@0:8 */ .cxx_destruct; // IMP 0x238794
@end

@interface WCLGChatTopMorphMenuView /* VM 0x4d94f8 */
- /* @48@0:8{CGRect={CGPoint=dd}{CGSize=dd}}16 */ initWithFrame:; // IMP 0x23f7a8
- /* v16@0:8 */ layoutSubviews; // IMP 0x23ff08
- /* v16@0:8 */ reloadRows; // IMP 0x23ffdc
- /* v24@0:8@16 */ handleMenuTap:; // IMP 0x241c9c
- /* v24@0:8q16 */ setHighlightedIndex:; // IMP 0x241d90
- /* q32@0:8{CGPoint=dd}16 */ indexForPoint:; // IMP 0x242020
- /* @16@0:8 */ controller; // IMP 0x242150
- /* v24@0:8@16 */ setController:; // IMP 0x242184
- /* B16@0:8 */ isGroup; // IMP 0x242198
- /* v20@0:8B16 */ setIsGroup:; // IMP 0x2421a8
- /* q16@0:8 */ highlightedIndex; // IMP 0x2421b8
- /* @?16@0:8 */ selectionHandler; // IMP 0x2421c8
- /* v24@0:8@?16 */ setSelectionHandler:; // IMP 0x2421d8
- /* @16@0:8 */ effectView; // IMP 0x2421e4
- /* v24@0:8@16 */ setEffectView:; // IMP 0x2421f4
- /* @16@0:8 */ rowViews; // IMP 0x242208
- /* v24@0:8@16 */ setRowViews:; // IMP 0x242218
- /* v16@0:8 */ .cxx_destruct; // IMP 0x24222c
@end

@interface WCLGChatTopAvatarOverlayView /* VM 0x4d9548 */
- /* v16@0:8 */ layoutSubviews; // IMP 0x2424c8
@end

@interface WCLGChatTopMorphHostView /* VM 0x4d9598 */
- /* @48@0:8{CGRect={CGPoint=dd}{CGSize=dd}}16 */ initWithFrame:; // IMP 0x2425c4
- /* v16@0:8 */ updateChrome; // IMP 0x2429a8
- /* v16@0:8 */ layoutSubviews; // IMP 0x243284
- /* v24@0:8@16 */ traitCollectionDidChange:; // IMP 0x24358c
- /* v24@0:8@16 */ handleTap:; // IMP 0x243640
- /* @16@0:8 */ menuContainerView; // IMP 0x243c2c
- /* v16@0:8 */ showMenuFromHost; // IMP 0x243d20
- /* v16@0:8 */ hideMenu; // IMP 0x244260
- /* v24@0:8@16 */ handleLongPress:; // IMP 0x24447c
- /* @16@0:8 */ controller; // IMP 0x2446e8
- /* v24@0:8@16 */ setController:; // IMP 0x24471c
- /* B16@0:8 */ avatarOnlyMode; // IMP 0x244730
- /* v20@0:8B16 */ setAvatarOnlyMode:; // IMP 0x244740
- /* @16@0:8 */ cachedAvatarImage; // IMP 0x244750
- /* v24@0:8@16 */ setCachedAvatarImage:; // IMP 0x244760
- /* q16@0:8 */ cachedAvatarToken; // IMP 0x244774
- /* v24@0:8q16 */ setCachedAvatarToken:; // IMP 0x244784
- /* B16@0:8 */ isGroup; // IMP 0x244794
- /* v20@0:8B16 */ setIsGroup:; // IMP 0x2447a4
- /* q16@0:8 */ defaultAction; // IMP 0x2447b4
- /* v24@0:8q16 */ setDefaultAction:; // IMP 0x2447c4
- /* B16@0:8 */ ready; // IMP 0x2447d4
- /* v20@0:8B16 */ setReady:; // IMP 0x2447e4
- /* @16@0:8 */ iconView; // IMP 0x2447f4
- /* v24@0:8@16 */ setIconView:; // IMP 0x244804
- /* @16@0:8 */ menuView; // IMP 0x244818
- /* v24@0:8@16 */ setMenuView:; // IMP 0x244828
- /* B16@0:8 */ menuVisible; // IMP 0x24483c
- /* v20@0:8B16 */ setMenuVisible:; // IMP 0x24484c
- /* B16@0:8 */ longPressActive; // IMP 0x24485c
- /* v20@0:8B16 */ setLongPressActive:; // IMP 0x24486c
- /* v16@0:8 */ .cxx_destruct; // IMP 0x24487c
@end

@interface WCLGCodeLibraryEntry /* VM 0x4d9610 */
- /* @16@0:8 */ entryId; // IMP 0x24da50
- /* v24@0:8@16 */ setEntryId:; // IMP 0x24da58
- /* @16@0:8 */ name; // IMP 0x24da60
- /* v24@0:8@16 */ setName:; // IMP 0x24da68
- /* Q16@0:8 */ charCount; // IMP 0x24da70
- /* v24@0:8Q16 */ setCharCount:; // IMP 0x24da78
- /* @16@0:8 */ createdAt; // IMP 0x24da80
- /* v24@0:8@16 */ setCreatedAt:; // IMP 0x24da88
- /* v16@0:8 */ .cxx_destruct; // IMP 0x24da94
@end

@interface WCLGCodeLibraryViewController /* VM 0x4d9638 */
- /* @32@0:8@?16@?24 */ initWithApplyHandler:onChange:; // IMP 0x251d90
- /* v16@0:8 */ viewDidLoad; // IMP 0x251e98
- /* v20@0:8B16 */ viewWillAppear:; // IMP 0x25292c
- /* v20@0:8B16 */ viewWillDisappear:; // IMP 0x252af0
- /* v16@0:8 */ reloadEntries; // IMP 0x252b68
- /* v16@0:8 */ notifyChange; // IMP 0x253420
- /* v16@0:8 */ toggleEditingTapped; // IMP 0x253730
- /* v24@0:8B16B20 */ setEditing:animated:; // IMP 0x2537a0
- /* v16@0:8 */ updateToolbarState; // IMP 0x25399c
- /* v16@0:8 */ selectAllTapped; // IMP 0x253d3c
- /* v16@0:8 */ deleteSelectedTapped; // IMP 0x253ed8
- /* v16@0:8 */ clearAllTapped; // IMP 0x2545c8
- /* v16@0:8 */ closeTapped; // IMP 0x254adc
- /* v24@0:8q16 */ applyEntryAtRow:; // IMP 0x254af0
- /* v24@0:8q16 */ presentRenameForRow:; // IMP 0x254e10
- /* v24@0:8q16 */ deleteEntryAtRow:; // IMP 0x25542c
- /* v16@0:8 */ addTapped; // IMP 0x25596c
- /* v16@0:8 */ saveCurrentInUse; // IMP 0x255e24
- /* v16@0:8 */ importFromFiles; // IMP 0x256438
- /* v32@0:8@16@24 */ documentPicker:didPickDocumentsAtURLs:; // IMP 0x256540
- /* q32@0:8@16q24 */ tableView:numberOfRowsInSection:; // IMP 0x256b08
- /* @32@0:8@16@24 */ tableView:cellForRowAtIndexPath:; // IMP 0x256b58
- /* v32@0:8@16@24 */ tableView:didSelectRowAtIndexPath:; // IMP 0x257334
- /* v32@0:8@16@24 */ tableView:didDeselectRowAtIndexPath:; // IMP 0x2573f4
- /* q32@0:8@16@24 */ tableView:editingStyleForRowAtIndexPath:; // IMP 0x257450
- /* B32@0:8@16@24 */ tableView:canEditRowAtIndexPath:; // IMP 0x257458
- /* B32@0:8@16@24 */ tableView:canMoveRowAtIndexPath:; // IMP 0x257460
- /* v40@0:8@16@24@32 */ tableView:moveRowAtIndexPath:toIndexPath:; // IMP 0x257468
- /* @48@0:8@16@24{CGPoint=dd}32 */ tableView:contextMenuConfigurationForRowAtIndexPath:point:; // IMP 0x257780
- /* @32@0:8@16q24 */ tableView:titleForFooterInSection:; // IMP 0x257edc
- /* @?16@0:8 */ onApply; // IMP 0x258230
- /* v24@0:8@?16 */ setOnApply:; // IMP 0x258240
- /* @?16@0:8 */ onChange; // IMP 0x25824c
- /* v24@0:8@?16 */ setOnChange:; // IMP 0x25825c
- /* @16@0:8 */ entries; // IMP 0x258268
- /* v24@0:8@16 */ setEntries:; // IMP 0x258278
- /* @16@0:8 */ activeEntryId; // IMP 0x25828c
- /* v24@0:8@16 */ setActiveEntryId:; // IMP 0x25829c
- /* @16@0:8 */ addButton; // IMP 0x2582a8
- /* v24@0:8@16 */ setAddButton:; // IMP 0x2582b8
- /* @16@0:8 */ selectButton; // IMP 0x2582cc
- /* v24@0:8@16 */ setSelectButton:; // IMP 0x2582dc
- /* @16@0:8 */ selectAllButton; // IMP 0x2582f0
- /* v24@0:8@16 */ setSelectAllButton:; // IMP 0x258300
- /* @16@0:8 */ clearAllButton; // IMP 0x258314
- /* v24@0:8@16 */ setClearAllButton:; // IMP 0x258324
- /* @16@0:8 */ deleteButton; // IMP 0x258338
- /* v24@0:8@16 */ setDeleteButton:; // IMP 0x258348
- /* @16@0:8 */ emptyLabel; // IMP 0x25835c
- /* v24@0:8@16 */ setEmptyLabel:; // IMP 0x25836c
- /* v16@0:8 */ .cxx_destruct; // IMP 0x258380
@end

@interface WCLGColorPickerBackgroundView /* VM 0x4d9688 */
- /* v16@0:8 */ layoutSubviews; // IMP 0x258488
@end

@interface WCLGColorCanvasView /* VM 0x4d96d8 */
- /* @48@0:8{CGRect={CGPoint=dd}{CGSize=dd}}16 */ initWithFrame:; // IMP 0x2588d4
- /* v24@0:8d16 */ setHue:; // IMP 0x258ef4
- /* v16@0:8 */ layoutSubviews; // IMP 0x258fc0
- /* @16@0:8 */ hueLayer; // IMP 0x259134
- /* v24@0:8@16 */ setHueLayer:; // IMP 0x259144
- /* @16@0:8 */ whiteLayer; // IMP 0x2592b8
- /* v24@0:8@16 */ setWhiteLayer:; // IMP 0x2593e8
- /* @16@0:8 */ blackLayer; // IMP 0x2593fc
- /* v24@0:8@16 */ setBlackLayer:; // IMP 0x25940c
- /* d16@0:8 */ hue; // IMP 0x259420
- /* v16@0:8 */ .cxx_destruct; // IMP 0x259430
@end

@interface WCLGHueBarView /* VM 0x4d9728 */
- /* @48@0:8{CGRect={CGPoint=dd}{CGSize=dd}}16 */ initWithFrame:; // IMP 0x2594ac
- /* v16@0:8 */ layoutSubviews; // IMP 0x25971c
@end

@interface WCLGColorPickerViewController /* VM 0x4d9778 */
- /* @28@0:8B16@?20 */ initOutgoing:handler:; // IMP 0x259f70
- /* @32@0:8q16@?24 */ initPurpose:handler:; // IMP 0x259f80
- /* @48@0:8q16q24q32@?40 */ initPurpose:lightMode:darkMode:handler:; // IMP 0x25a2c0
- /* @40@0:8q16q24@?32 */ initSMSBottomBarIconLightMode:darkMode:handler:; // IMP 0x25a510
- /* @40@0:8@16q24@?32 */ initTitle:initialMode:handler:; // IMP 0x25a52c
- /* @48@0:8@16q24q32@?40 */ initTitle:lightMode:darkMode:handler:; // IMP 0x25a760
- /* B16@0:8 */ isDarkMode; // IMP 0x25ab80
- /* @16@0:8 */ titleForPurpose; // IMP 0x25abd4
- /* q16@0:8 */ currentMode; // IMP 0x25bda8
- /* B56@0:8q16^d24^d32^d40^d48 */ componentsForMode:red:green:blue:alpha:; // IMP 0x25cc7c
- /* v16@0:8 */ loadCurrentColor; // IMP 0x25e580
- /* v20@0:8B16 */ updateHSVFromRGBPreservingHue:; // IMP 0x25e634
- /* v16@0:8 */ updateRGBFromHSV; // IMP 0x25ea58
- /* v16@0:8 */ markCustomMode; // IMP 0x25eba4
- /* v16@0:8 */ storeCurrentModeForActiveAppearance; // IMP 0x25ec50
- /* @16@0:8 */ currentHexString; // IMP 0x25ed6c
- /* @16@0:8 */ primaryTextColor; // IMP 0x25f4e0
- /* @16@0:8 */ secondaryTextColor; // IMP 0x25f834
- /* @16@0:8 */ cardColor; // IMP 0x25f974
- /* @16@0:8 */ makeCard; // IMP 0x25f9e0
- /* @24@0:8@16 */ sectionLabelWithText:; // IMP 0x25ff10
- /* @24@0:8q16 */ numberFieldWithTag:; // IMP 0x260024
- /* @32@0:8@16d24 */ swatchImageForColor:diameter:; // IMP 0x260254
- /* @16@0:8 */ defaultPaletteModes; // IMP 0x26039c
- /* @16@0:8 */ commonColorModes; // IMP 0x260b48
- /* @16@0:8 */ commonColorNames; // IMP 0x2610ac
- /* @24@0:8q16 */ colorForMode:; // IMP 0x261800
- /* v16@0:8 */ viewDidLoad; // IMP 0x261880
- /* v20@0:8B16 */ viewDidAppear:; // IMP 0x265390
- /* v20@0:8B16 */ viewWillDisappear:; // IMP 0x2655f8
- /* v16@0:8 */ viewDidLayoutSubviews; // IMP 0x2656ac
- /* v24@0:8@16 */ traitCollectionDidChange:; // IMP 0x265710
- /* v16@0:8 */ refreshThemeColors; // IMP 0x265938
- /* v16@0:8 */ layoutPickerViews; // IMP 0x266d1c
- /* v24@0:8d16 */ layoutPaletteButtonsWithWidth:; // IMP 0x267ab4
- /* v24@0:8d16 */ layoutCommonRowsWithWidth:; // IMP 0x268114
- /* v16@0:8 */ updateUI; // IMP 0x2686dc
- /* v16@0:8 */ updateKnobFrames; // IMP 0x2694d4
- /* v16@0:8 */ confirmColor; // IMP 0x269ae4
- /* v24@0:8@16 */ appearanceSegmentChanged:; // IMP 0x26a2ec
- /* v24@0:8q16 */ applyMode:; // IMP 0x26a57c
- /* v24@0:8@16 */ channelSliderChanged:; // IMP 0x26a7bc
- /* v24@0:8@16 */ canvasGestureChanged:; // IMP 0x26aa74
- /* v24@0:8@16 */ hueGestureChanged:; // IMP 0x26ac04
- /* v24@0:8@16 */ paletteButtonTapped:; // IMP 0x26ad24
- /* v24@0:8@16 */ commonButtonTapped:; // IMP 0x26aef0
- /* B56@0:8@16^d24^d32^d40^d48 */ parseHexString:red:green:blue:alpha:; // IMP 0x26b0bc
- /* v24@0:8@16 */ hexEditingDidEnd:; // IMP 0x26bfd0
- /* v24@0:8@16 */ numberFieldEditingDidEnd:; // IMP 0x26c328
- /* B24@0:8@16 */ textFieldShouldReturn:; // IMP 0x26c4b8
- /* B16@0:8 */ outgoing; // IMP 0x26c610
- /* v20@0:8B16 */ setOutgoing:; // IMP 0x26c620
- /* q16@0:8 */ purpose; // IMP 0x26c630
- /* v24@0:8q16 */ setPurpose:; // IMP 0x26c640
- /* @?16@0:8 */ selectionHandler; // IMP 0x26c650
- /* v24@0:8@?16 */ setSelectionHandler:; // IMP 0x26c660
- /* @?16@0:8 */ dualSelectionHandler; // IMP 0x26c66c
- /* v24@0:8@?16 */ setDualSelectionHandler:; // IMP 0x26c67c
- /* @16@0:8 */ backgroundView; // IMP 0x26c688
- /* v24@0:8@16 */ setBackgroundView:; // IMP 0x26c698
- /* @16@0:8 */ scrollView; // IMP 0x26c6ac
- /* v24@0:8@16 */ setScrollView:; // IMP 0x26c6bc
- /* @16@0:8 */ contentView; // IMP 0x26c830
- /* v24@0:8@16 */ setContentView:; // IMP 0x26c840
- /* @16@0:8 */ pickerHeaderLabel; // IMP 0x26c9cc
- /* v24@0:8@16 */ setPickerHeaderLabel:; // IMP 0x26c9dc
- /* @16@0:8 */ paletteHeaderLabel; // IMP 0x26c9f0
- /* v24@0:8@16 */ setPaletteHeaderLabel:; // IMP 0x26ca00
- /* @16@0:8 */ commonHeaderLabel; // IMP 0x26ca14
- /* v24@0:8@16 */ setCommonHeaderLabel:; // IMP 0x26ca24
- /* @16@0:8 */ controlCard; // IMP 0x26ca38
- /* v24@0:8@16 */ setControlCard:; // IMP 0x26cb30
- /* @16@0:8 */ paletteCard; // IMP 0x26cb44
- /* v24@0:8@16 */ setPaletteCard:; // IMP 0x26cb54
- /* @16@0:8 */ commonCard; // IMP 0x26cb68
- /* v24@0:8@16 */ setCommonCard:; // IMP 0x26cb78
- /* @16@0:8 */ hexLabel; // IMP 0x26cb8c
- /* v24@0:8@16 */ setHexLabel:; // IMP 0x26cc8c
- /* @16@0:8 */ hexHintLabel; // IMP 0x26cca0
- /* v24@0:8@16 */ setHexHintLabel:; // IMP 0x26ccb0
- /* @16@0:8 */ hexField; // IMP 0x26ce28
- /* v24@0:8@16 */ setHexField:; // IMP 0x26cf5c
- /* @16@0:8 */ previewView; // IMP 0x26cf70
- /* v24@0:8@16 */ setPreviewView:; // IMP 0x26d054
- /* @16@0:8 */ canvasView; // IMP 0x26d068
- /* v24@0:8@16 */ setCanvasView:; // IMP 0x26d078
- /* @16@0:8 */ hueBarView; // IMP 0x26d08c
- /* v24@0:8@16 */ setHueBarView:; // IMP 0x26d194
- /* @16@0:8 */ canvasKnob; // IMP 0x26d2fc
- /* v24@0:8@16 */ setCanvasKnob:; // IMP 0x26d30c
- /* @16@0:8 */ hueKnob; // IMP 0x26d320
- /* v24@0:8@16 */ setHueKnob:; // IMP 0x26d330
- /* @16@0:8 */ channelLabels; // IMP 0x26d344
- /* v24@0:8@16 */ setChannelLabels:; // IMP 0x26d354
- /* @16@0:8 */ channelSliders; // IMP 0x26d360
- /* v24@0:8@16 */ setChannelSliders:; // IMP 0x26d4a0
- /* @16@0:8 */ channelFields; // IMP 0x26d4ac
- /* v24@0:8@16 */ setChannelFields:; // IMP 0x26d4bc
- /* @16@0:8 */ paletteScrollView; // IMP 0x26d60c
- /* v24@0:8@16 */ setPaletteScrollView:; // IMP 0x26d61c
- /* @16@0:8 */ paletteButtons; // IMP 0x26d630
- /* v24@0:8@16 */ setPaletteButtons:; // IMP 0x26d640
- /* @16@0:8 */ paletteModes; // IMP 0x26d64c
- /* v24@0:8@16 */ setPaletteModes:; // IMP 0x26d744
- /* @16@0:8 */ commonButtons; // IMP 0x26d750
- /* v24@0:8@16 */ setCommonButtons:; // IMP 0x26d760
- /* @16@0:8 */ commonLabels; // IMP 0x26d76c
- /* v24@0:8@16 */ setCommonLabels:; // IMP 0x26d77c
- /* @16@0:8 */ commonModes; // IMP 0x26d788
- /* v24@0:8@16 */ setCommonModes:; // IMP 0x26d798
- /* @16@0:8 */ appearanceControl; // IMP 0x26d7a4
- /* v24@0:8@16 */ setAppearanceControl:; // IMP 0x26d7b4
- /* @16@0:8 */ currentTitleLabel; // IMP 0x26d7c8
- /* v24@0:8@16 */ setCurrentTitleLabel:; // IMP 0x26d7d8
- /* @16@0:8 */ currentHexLabel; // IMP 0x26d7ec
- /* v24@0:8@16 */ setCurrentHexLabel:; // IMP 0x26d918
- /* @16@0:8 */ currentDot; // IMP 0x26d92c
- /* v24@0:8@16 */ setCurrentDot:; // IMP 0x26d93c
- /* d16@0:8 */ red; // IMP 0x26d950
- /* v24@0:8d16 */ setRed:; // IMP 0x26d960
- /* d16@0:8 */ green; // IMP 0x26d970
- /* v24@0:8d16 */ setGreen:; // IMP 0x26da9c
- /* d16@0:8 */ blue; // IMP 0x26db8c
- /* v24@0:8d16 */ setBlue:; // IMP 0x26db9c
- /* d16@0:8 */ alpha; // IMP 0x26dbac
- /* v24@0:8d16 */ setAlpha:; // IMP 0x26dbbc
- /* d16@0:8 */ hue; // IMP 0x26dbcc
- /* v24@0:8d16 */ setHue:; // IMP 0x26dce4
- /* d16@0:8 */ saturation; // IMP 0x26dcf4
- /* v24@0:8d16 */ setSaturation:; // IMP 0x26dd04
- /* d16@0:8 */ brightness; // IMP 0x26dd14
- /* v24@0:8d16 */ setBrightness:; // IMP 0x26de30
- /* q16@0:8 */ pendingMode; // IMP 0x26de40
- /* v24@0:8q16 */ setPendingMode:; // IMP 0x26de50
- /* q16@0:8 */ lightMode; // IMP 0x26de60
- /* v24@0:8q16 */ setLightMode:; // IMP 0x26df88
- /* q16@0:8 */ darkMode; // IMP 0x26e0a8
- /* v24@0:8q16 */ setDarkMode:; // IMP 0x26e0b8
- /* B16@0:8 */ dualAppearanceMode; // IMP 0x26e0c8
- /* v20@0:8B16 */ setDualAppearanceMode:; // IMP 0x26e1fc
- /* B16@0:8 */ editingDarkAppearance; // IMP 0x26e20c
- /* v20@0:8B16 */ setEditingDarkAppearance:; // IMP 0x26e340
- /* B16@0:8 */ updatingUI; // IMP 0x26e474
- /* v20@0:8B16 */ setUpdatingUI:; // IMP 0x26e484
- /* B16@0:8 */ savedPopGestureEnabled; // IMP 0x26e494
- /* v20@0:8B16 */ setSavedPopGestureEnabled:; // IMP 0x26e4a4
- /* @16@0:8 */ explicitTitle; // IMP 0x26e4b4
- /* v24@0:8@16 */ setExplicitTitle:; // IMP 0x26e4c4
- /* B16@0:8 */ hasExplicitInitialMode; // IMP 0x26e4d0
- /* v20@0:8B16 */ setHasExplicitInitialMode:; // IMP 0x26e4e0
- /* q16@0:8 */ explicitInitialMode; // IMP 0x26e4f0
- /* v24@0:8q16 */ setExplicitInitialMode:; // IMP 0x26e500
- /* v16@0:8 */ .cxx_destruct; // IMP 0x26e510
@end

@interface WCLGConfig /* VM 0x4d97c8 */
- /* @16@0:8 */ init; // IMP 0x274218
- /* v16@0:8 */ dealloc; // IMP 0x27438c
- /* v16@0:8 */ primeDefaults; // IMP 0x274414
- /* v16@0:8 */ refreshAtomicMirrors; // IMP 0x27d3fc
- /* v32@0:8@16@24 */ maybeUpdateMirrorForKey:value:; // IMP 0x28b074
- /* @24@0:8@16 */ cachedObjectForKey:; // IMP 0x29a130
- /* v32@0:8@16@24 */ setCachedObject:forKey:; // IMP 0x29a348
- /* v16@0:8 */ flushScheduled; // IMP 0x29a524
- /* B24@0:8@16 */ boolForKey:; // IMP 0x29a75c
- /* B28@0:8@16B24 */ boolForKey:defaultValue:; // IMP 0x29a76c
- /* q24@0:8@16 */ integerForKey:; // IMP 0x29a824
- /* q32@0:8@16q24 */ integerForKey:defaultValue:; // IMP 0x29a834
- /* d24@0:8@16 */ doubleForKey:; // IMP 0x29a8ac
- /* @24@0:8@16 */ objectForKey:; // IMP 0x29a924
- /* v28@0:8B16@20 */ setBool:forKey:; // IMP 0x29a930
- /* v20@0:8B16 */ setLiquidGlassPersistedPendingValue:; // IMP 0x29b22c
- /* v32@0:8q16@24 */ setInteger:forKey:; // IMP 0x29b610
- /* v32@0:8d16@24 */ setDouble:forKey:; // IMP 0x29b6b0
- /* v32@0:8@16@24 */ setObject:forKey:; // IMP 0x29b750
- /* B24@0:8@16 */ hasValueForKey:; // IMP 0x29b75c
- /* d24@0:8q16 */ tabBarIconOffsetXForSizeMode:; // IMP 0x29b79c
- /* d24@0:8q16 */ tabBarIconOffsetYForSizeMode:; // IMP 0x29babc
- /* d24@0:8q16 */ tabBarIconSpacingForSizeMode:; // IMP 0x29bde4
- /* v32@0:8d16q24 */ setTabBarIconOffsetX:forSizeMode:; // IMP 0x29c0f8
- /* v32@0:8d16q24 */ setTabBarIconOffsetY:forSizeMode:; // IMP 0x29c40c
- /* v32@0:8d16q24 */ setTabBarIconSpacing:forSizeMode:; // IMP 0x29c73c
- /* d24@0:8q16 */ tabBarIconScaleForSizeMode:; // IMP 0x29ca50
- /* v32@0:8d16q24 */ setTabBarIconScale:forSizeMode:; // IMP 0x29cd20
- /* B16@0:8 */ liquidGlassEnabled; // IMP 0x29d018
- /* B16@0:8 */ compatEnabled; // IMP 0x29d028
- /* B16@0:8 */ hideTitlesEnabled; // IMP 0x29d038
- /* B16@0:8 */ chatBottomGlassEnabled; // IMP 0x29d048
- /* B16@0:8 */ chatBottomSMSHideEmojiIconEnabled; // IMP 0x29d058
- /* B16@0:8 */ chatBottomHoldKeyToTalkEnabled; // IMP 0x29d068
- /* B16@0:8 */ chatBottomVoiceWaveColorLock; // IMP 0x29d078
- /* B16@0:8 */ chatAvatarGestureEnabled; // IMP 0x29d2f8
- /* q16@0:8 */ chatAvatarGestureTrigger; // IMP 0x29d308
- /* B16@0:8 */ chatBottomSMSUseMessageIconsEnabled; // IMP 0x29d314
- /* q16@0:8 */ chatBottomSMSMessageIconWeightMode; // IMP 0x29d324
- /* B16@0:8 */ chatBottomTGUseMessageIconsEnabled; // IMP 0x29d330
- /* q16@0:8 */ chatBottomTGMessageIconWeightMode; // IMP 0x29d340
- /* q16@0:8 */ chatBottomTGAvatarMode; // IMP 0x29d34c
- /* B16@0:8 */ chatBottomTGAvatarEnabled; // IMP 0x29d358
- /* B16@0:8 */ chatBubbleGlassEnabled; // IMP 0x29d368
- /* B16@0:8 */ topNavigationAlignmentEnabled; // IMP 0x29d378
- /* B16@0:8 */ homeSearchButtonEnabled; // IMP 0x29d388
- /* B16@0:8 */ chatTitleCapsuleEnabled; // IMP 0x29d50c
- /* B16@0:8 */ chatTitleCapsuleSearchEnabled; // IMP 0x29d51c
- /* B16@0:8 */ chatNativeProfileTitleEnabled; // IMP 0x29d52c
- /* B16@0:8 */ chatTopCapsuleAvatarEnabled; // IMP 0x29d53c
- /* B16@0:8 */ chatTopCapsuleSubtitleEnabled; // IMP 0x29d54c
- /* B16@0:8 */ chatTopCapsuleLeftEnabled; // IMP 0x29d55c
- /* B16@0:8 */ chatTopCapsuleSubtitleIconEnabled; // IMP 0x29d56c
- /* B16@0:8 */ chatNativeProfilePinnedOffsetEnabled; // IMP 0x29d57c
- /* B16@0:8 */ chatTopMorphActionEnabled; // IMP 0x29d58c
- /* q16@0:8 */ privateChatTopMorphDefault; // IMP 0x29d59c
- /* q16@0:8 */ groupChatTopMorphDefault; // IMP 0x29d5a8
- /* B16@0:8 */ chatTopMorphSMSIconsEnabled; // IMP 0x29d5b4
- /* q16@0:8 */ chatTopMorphSMSIconWeightMode; // IMP 0x29d5c4
- /* B16@0:8 */ smsBackTextEnabled; // IMP 0x29d5d0
- /* q16@0:8 */ smsBackIconWeightMode; // IMP 0x29d5e0
- /* B16@0:8 */ smsHomeAddIconEnabled; // IMP 0x29d5ec
- /* q16@0:8 */ smsHomeAddIconWeightMode; // IMP 0x29d5fc
- /* B16@0:8 */ smsBottomBarIconEnabled; // IMP 0x29d608
- /* B16@0:8 */ chatPlusSMSMenuEnabled; // IMP 0x29d618
- /* B16@0:8 */ richCardPaymentBubbleEnabled; // IMP 0x29d628
- /* B16@0:8 */ voIPBubbleGlassEnabled; // IMP 0x29d638
- /* B16@0:8 */ longPressMenuGlassEnabled; // IMP 0x29d648
- /* B16@0:8 */ chatBubbleFlowGradientEnabled; // IMP 0x29d658
- /* B16@0:8 */ chatBubbleFlowBorderEnabled; // IMP 0x29d668
- /* B16@0:8 */ chatBubbleFlowRichMediaEnabled; // IMP 0x29d670
- /* B16@0:8 */ chatBubbleFlowVoIPEnabled; // IMP 0x29d680
- /* B16@0:8 */ hideVoiceTranscribeIconEnabled; // IMP 0x29d690
- /* B16@0:8 */ deleteSessionImmediately; // IMP 0x29d6a0
- /* B16@0:8 */ hideHomeWeChatTitleEnabled; // IMP 0x29d6b0
- /* B16@0:8 */ chatBottomGradientBackgroundEnabled; // IMP 0x29d6c0
- /* B16@0:8 */ homeWallpaperScrimEnabled; // IMP 0x29d6d0
- /* B16@0:8 */ homeWallpaperExtraTabsEnabled; // IMP 0x29d6e0
- /* B16@0:8 */ chatBottomPlaceholderEnabled; // IMP 0x29d6f0
- /* B16@0:8 */ customFadeEnabled; // IMP 0x29d700
- /* B16@0:8 */ homeTopFadeEnabled; // IMP 0x29d710
- /* B16@0:8 */ chatTopFadeEnabled; // IMP 0x29d720
- /* B16@0:8 */ homeBottomFadeEnabled; // IMP 0x29d730
- /* B16@0:8 */ tabBarExtraClearEnabled; // IMP 0x29d740
- /* q16@0:8 */ unreadBackCapsuleMode; // IMP 0x29d8cc
- /* B16@0:8 */ tabBarRightSearchEnabled; // IMP 0x29d8d8
- /* B16@0:8 */ searchTabBarEnabled; // IMP 0x29da74
- /* B16@0:8 */ disablePullDownMiniProgramEnabled; // IMP 0x29da84
- /* B16@0:8 */ plusMenuMiniProgramEntryEnabled; // IMP 0x29da94
- /* q16@0:8 */ glassSizeMode; // IMP 0x29daa4
- /* q16@0:8 */ tabBarRightSearchSizeMode; // IMP 0x29dca4
- /* q16@0:8 */ searchTabBarSizeMode; // IMP 0x29df00
- /* q16@0:8 */ chatBottomGlassMode; // IMP 0x29df0c
- /* q16@0:8 */ chatBottomSMSSendColorMode; // IMP 0x29df18
- /* q16@0:8 */ chatBottomSMSSendDarkColorMode; // IMP 0x29df24
- /* q16@0:8 */ smsBottomBarIconLightColorMode; // IMP 0x29df30
- /* q16@0:8 */ smsBottomBarIconDarkColorMode; // IMP 0x29df3c
- /* q16@0:8 */ chatBubbleOutgoingColorMode; // IMP 0x29df48
- /* q16@0:8 */ chatBubbleIncomingColorMode; // IMP 0x29df54
- /* q16@0:8 */ chatBubbleOutgoingDarkColorMode; // IMP 0x29df60
- /* q16@0:8 */ chatBubbleIncomingDarkColorMode; // IMP 0x29df6c
- /* q16@0:8 */ chatBubblePaymentTextColorMode; // IMP 0x29df78
- /* q16@0:8 */ chatBubblePaymentTextDarkColorMode; // IMP 0x29df84
- /* B16@0:8 */ chatBubbleTextColorEnabled; // IMP 0x29df90
- /* q16@0:8 */ chatBubbleTextSendColorMode; // IMP 0x29dfa0
- /* q16@0:8 */ chatBubbleTextSendDarkColorMode; // IMP 0x29dfac
- /* q16@0:8 */ chatBubbleTextRecvColorMode; // IMP 0x29dfb8
- /* q16@0:8 */ chatBubbleTextRecvDarkColorMode; // IMP 0x29dfc4
- /* B16@0:8 */ chatBubbleCompactEnabled; // IMP 0x29dfd0
- /* q16@0:8 */ chatBubbleCompactAvatarPosition; // IMP 0x29dfe0
- /* q16@0:8 */ chatBubbleCompactGap; // IMP 0x29dfec
- /* q16@0:8 */ chatBubbleCompactGapGroup; // IMP 0x29dff8
- /* q16@0:8 */ chatBubbleCompactGapGroupSend; // IMP 0x29e004
- /* q16@0:8 */ chatBubbleCompactGapPrivate; // IMP 0x29e010
- /* B16@0:8 */ avatarScaleEnabled; // IMP 0x29e01c
- /* q16@0:8 */ avatarScaleChatList; // IMP 0x29e02c
- /* q16@0:8 */ avatarScaleChat; // IMP 0x29e038
- /* q16@0:8 */ avatarScaleContacts; // IMP 0x29e044
- /* q16@0:8 */ avatarScaleDiscover; // IMP 0x29e050
- /* B16@0:8 */ chatTopButtonAvatarEnabled; // IMP 0x29e05c
- /* q16@0:8 */ chatTopButtonAvatarSource; // IMP 0x29e06c
- /* q16@0:8 */ chatTopButtonAvatarScale; // IMP 0x29e078
- /* B16@0:8 */ bubbleImageEnabled; // IMP 0x29e084
- /* B16@0:8 */ chatBubbleCompactSkipTime; // IMP 0x29e094
- /* B16@0:8 */ chatBubbleMergeHideTimeBar; // IMP 0x29e0a4
- /* B16@0:8 */ chatBubbleMergeAvatarBottomAlign; // IMP 0x29e0b4
- /* B16@0:8 */ chatBubbleMergePrivate; // IMP 0x29e0c4
- /* B16@0:8 */ chatBubbleMergeGroup; // IMP 0x29e0d4
- /* q16@0:8 */ chatBubbleMergeBubbleInset; // IMP 0x29e0e4
- /* q16@0:8 */ chatBubbleMergeAvatarInset; // IMP 0x29e0f0
- /* q16@0:8 */ chatBubbleMergePageInset; // IMP 0x29e0fc
- /* B16@0:8 */ chatIndentEnabled; // IMP 0x29e108
- /* q16@0:8 */ chatIndentGroupRecv; // IMP 0x29e118
- /* q16@0:8 */ chatIndentGroupSend; // IMP 0x29e124
- /* q16@0:8 */ chatIndentPrivateRecv; // IMP 0x29e130
- /* q16@0:8 */ chatIndentPrivateSend; // IMP 0x29e13c
- /* q16@0:8 */ chatBubbleFlowStartColorMode; // IMP 0x29e148
- /* q16@0:8 */ chatBubbleFlowEndColorMode; // IMP 0x29e154
- /* q16@0:8 */ chatBubbleFlowDarkStartColorMode; // IMP 0x29e160
- /* q16@0:8 */ chatBubbleFlowDarkEndColorMode; // IMP 0x29e16c
- /* q16@0:8 */ groupChatAvatarHideMode; // IMP 0x29e178
- /* q16@0:8 */ privateChatAvatarHideMode; // IMP 0x29e184
- /* B24@0:8@16 */ shouldForceTrueForUserDefaultsKey:; // IMP 0x29e190
- /* v16@0:8 */ flush; // IMP 0x29e604
- /* v16@0:8 */ invalidateCache; // IMP 0x29e66c
- /* v16@0:8 */ .cxx_destruct; // IMP 0x29e8c8
@end

@interface WCLGGlassThemeCell /* VM 0x4d9818 */
- /* @32@0:8q16@24 */ initWithStyle:reuseIdentifier:; // IMP 0x2a481c
- /* v24@0:8@16 */ configure:; // IMP 0x2a5ec8
- /* @16@0:8 */ thumb; // IMP 0x2a677c
- /* v24@0:8@16 */ setThumb:; // IMP 0x2a678c
- /* @16@0:8 */ nameLabel; // IMP 0x2a67a0
- /* v24@0:8@16 */ setNameLabel:; // IMP 0x2a67b0
- /* @16@0:8 */ subLabel; // IMP 0x2a67c4
- /* v24@0:8@16 */ setSubLabel:; // IMP 0x2a67d4
- /* @16@0:8 */ verLabel; // IMP 0x2a67e8
- /* v24@0:8@16 */ setVerLabel:; // IMP 0x2a67f8
- /* @16@0:8 */ statusChip; // IMP 0x2a680c
- /* v24@0:8@16 */ setStatusChip:; // IMP 0x2a681c
- /* @16@0:8 */ chevron; // IMP 0x2a6830
- /* v24@0:8@16 */ setChevron:; // IMP 0x2a6840
- /* @16@0:8 */ theme; // IMP 0x2a6854
- /* v24@0:8@16 */ setTheme:; // IMP 0x2a6864
- /* v16@0:8 */ .cxx_destruct; // IMP 0x2a6878
@end

@interface WCLGDownloadCenterViewController /* VM 0x4d9868 */
- /* v16@0:8 */ viewDidLoad; // IMP 0x2a6930
- /* v16@0:8 */ viewDidLayoutSubviews; // IMP 0x2a7718
- /* v16@0:8 */ segChanged; // IMP 0x2a79a4
- /* v16@0:8 */ openRedeemCenter; // IMP 0x2a7a0c
- /* v16@0:8 */ reload; // IMP 0x2a7e58
- /* @16@0:8 */ current; // IMP 0x2a8624
- /* v16@0:8 */ updateEmpty; // IMP 0x2a86b4
- /* q32@0:8@16q24 */ tableView:numberOfRowsInSection:; // IMP 0x2a8750
- /* @32@0:8@16@24 */ tableView:cellForRowAtIndexPath:; // IMP 0x2a87a0
- /* v32@0:8@16@24 */ tableView:didSelectRowAtIndexPath:; // IMP 0x2a8908
- /* v24@0:8@16 */ showDetail:; // IMP 0x2a89e4
- /* v16@0:8 */ dismissSelf; // IMP 0x2a8bbc
- /* v24@0:8@16 */ toast:; // IMP 0x2a8bd0
- /* @16@0:8 */ seg; // IMP 0x2a8c60
- /* v24@0:8@16 */ setSeg:; // IMP 0x2a8c70
- /* @16@0:8 */ segBar; // IMP 0x2a8c84
- /* v24@0:8@16 */ setSegBar:; // IMP 0x2a8c94
- /* @16@0:8 */ bg; // IMP 0x2a8ca8
- /* v24@0:8@16 */ setBg:; // IMP 0x2a8cb8
- /* @16@0:8 */ tableView; // IMP 0x2a8ccc
- /* v24@0:8@16 */ setTableView:; // IMP 0x2a8cdc
- /* @16@0:8 */ spinner; // IMP 0x2a8cf0
- /* v24@0:8@16 */ setSpinner:; // IMP 0x2a8d00
- /* @16@0:8 */ emptyLabel; // IMP 0x2a8d14
- /* v24@0:8@16 */ setEmptyLabel:; // IMP 0x2a8d24
- /* @16@0:8 */ bubbles; // IMP 0x2a8d38
- /* v24@0:8@16 */ setBubbles:; // IMP 0x2a8d48
- /* @16@0:8 */ cards; // IMP 0x2a8d5c
- /* v24@0:8@16 */ setCards:; // IMP 0x2a8d6c
- /* Q16@0:8 */ reloadGeneration; // IMP 0x2a8d80
- /* v24@0:8Q16 */ setReloadGeneration:; // IMP 0x2a8d90
- /* v16@0:8 */ .cxx_destruct; // IMP 0x2a8da0
@end

@interface WCLGVariableBlurHostView /* VM 0x4d98b8 */
- /* @48@0:8{CGRect={CGPoint=dd}{CGSize=dd}}16 */ initWithFrame:; // IMP 0x2a8fe8
- /* v16@0:8 */ layoutSubviews; // IMP 0x2a9304
- /* @16@0:8 */ backdropLayer; // IMP 0x2a93b8
- /* v24@0:8@16 */ setBackdropLayer:; // IMP 0x2a93c8
- /* @16@0:8 */ gradientImage; // IMP 0x2a93dc
- /* v24@0:8@16 */ setGradientImage:; // IMP 0x2a93ec
- /* {CGSize=dd}16@0:8 */ lastSize; // IMP 0x2a9400
- /* v32@0:8{CGSize=dd}16 */ setLastSize:; // IMP 0x2a9414
- /* d16@0:8 */ lastConstantHeight; // IMP 0x2a9428
- /* v24@0:8d16 */ setLastConstantHeight:; // IMP 0x2a9438
- /* B16@0:8 */ lastInverted; // IMP 0x2a9448
- /* v20@0:8B16 */ setLastInverted:; // IMP 0x2a9458
- /* d16@0:8 */ lastGradientHeight; // IMP 0x2a9468
- /* v24@0:8d16 */ setLastGradientHeight:; // IMP 0x2a9478
- /* v16@0:8 */ .cxx_destruct; // IMP 0x2a9488
@end

@interface WCLGEdgeEffectView /* VM 0x4d9908 */
- /* @48@0:8{CGRect={CGPoint=dd}{CGSize=dd}}16 */ initWithFrame:; // IMP 0x2a9b70
- /* v92@0:8@16B24d28{CGRect={CGPoint=dd}{CGSize=dd}}36q68d76d84 */ updateWithContentColor:blur:alpha:rect:edge:edgeSize:blurRadius:; // IMP 0x2a9ee8
- /* B16@0:8 */ isBlurEnabled; // IMP 0x2aaf30
- /* v20@0:8B16 */ setBlurEnabled:; // IMP 0x2aaf40
- /* @16@0:8 */ contentView; // IMP 0x2aaf50
- /* v24@0:8@16 */ setContentView:; // IMP 0x2aaf60
- /* @16@0:8 */ contentMaskView; // IMP 0x2aaf74
- /* v24@0:8@16 */ setContentMaskView:; // IMP 0x2aaf84
- /* @16@0:8 */ blurHostView; // IMP 0x2aaf98
- /* v24@0:8@16 */ setBlurHostView:; // IMP 0x2aafa8
- /* @16@0:8 */ fallbackBlurView; // IMP 0x2aafbc
- /* v24@0:8@16 */ setFallbackBlurView:; // IMP 0x2aafcc
- /* @16@0:8 */ lastContentColor; // IMP 0x2aafe0
- /* v24@0:8@16 */ setLastContentColor:; // IMP 0x2aaff0
- /* B16@0:8 */ lastBlur; // IMP 0x2ab004
- /* v20@0:8B16 */ setLastBlur:; // IMP 0x2ab014
- /* d16@0:8 */ lastAlpha; // IMP 0x2ab024
- /* v24@0:8d16 */ setLastAlpha:; // IMP 0x2ab034
- /* {CGRect={CGPoint=dd}{CGSize=dd}}16@0:8 */ lastRect; // IMP 0x2ab044
- /* v48@0:8{CGRect={CGPoint=dd}{CGSize=dd}}16 */ setLastRect:; // IMP 0x2ab05c
- /* q16@0:8 */ lastEdge; // IMP 0x2ab074
- /* v24@0:8q16 */ setLastEdge:; // IMP 0x2ab084
- /* d16@0:8 */ lastEdgeSize; // IMP 0x2ab094
- /* v24@0:8d16 */ setLastEdgeSize:; // IMP 0x2ab0a4
- /* d16@0:8 */ lastBlurRadius; // IMP 0x2ab0b4
- /* v24@0:8d16 */ setLastBlurRadius:; // IMP 0x2ab0c4
- /* v16@0:8 */ .cxx_destruct; // IMP 0x2ab0d4
@end

@interface WCLGFuncCardMediaController /* VM 0x4d9958 */
- /* @16@0:8 */ init; // IMP 0x2ab164
- /* @24@0:8@16 */ keyForSchemeTask:; // IMP 0x2ab5ec
- /* B24@0:8@16 */ isSchemeTaskCancelled:; // IMP 0x2ab600
- /* v24@0:8@16 */ finishSchemeTask:; // IMP 0x2ab6f0
- /* B32@0:8@16@?24 */ performSchemeTaskCallback:block:; // IMP 0x2ab81c
- /* v32@0:8@16q24 */ failSchemeTask:code:; // IMP 0x2abab0
- /* v32@0:8@16@24 */ userContentController:didReceiveScriptMessage:; // IMP 0x2abd38
- /* @24@0:8@16 */ contentTypesForAccept:; // IMP 0x2aee9c
- /* @24@0:8@16 */ presenterForWebView:; // IMP 0x2af3d8
- /* v32@0:8@16@24 */ deliver:expectedScope:; // IMP 0x2af754
- /* v16@0:8 */ clearPendingPicker; // IMP 0x2afd04
- /* v24@0:8@16 */ updateScope:; // IMP 0x2afe28
- /* v32@0:8@16@24 */ documentPicker:didPickDocumentsAtURLs:; // IMP 0x2aff68
- /* v24@0:8@16 */ documentPickerWasCancelled:; // IMP 0x2b1d98
- /* v24@0:8@16 */ presentationControllerDidDismiss:; // IMP 0x2b226c
- /* v32@0:8@16@24 */ webView:startURLSchemeTask:; // IMP 0x2b278c
- /* v32@0:8@16@24 */ webView:stopURLSchemeTask:; // IMP 0x2b64dc
- /* @16@0:8 */ webView; // IMP 0x2b6624
- /* v24@0:8@16 */ setWebView:; // IMP 0x2b6650
- /* @16@0:8 */ scope; // IMP 0x2b665c
- /* v24@0:8@16 */ setScope:; // IMP 0x2b6664
- /* @16@0:8 */ ioQueue; // IMP 0x2b666c
- /* v24@0:8@16 */ setIoQueue:; // IMP 0x2b6674
- /* @16@0:8 */ stateQueue; // IMP 0x2b6680
- /* v24@0:8@16 */ setStateQueue:; // IMP 0x2b6688
- /* @16@0:8 */ activeTasks; // IMP 0x2b6694
- /* v24@0:8@16 */ setActiveTasks:; // IMP 0x2b669c
- /* @16@0:8 */ cancelledTasks; // IMP 0x2b66a8
- /* v24@0:8@16 */ setCancelledTasks:; // IMP 0x2b66b0
- /* @16@0:8 */ pageScopes; // IMP 0x2b66bc
- /* v24@0:8@16 */ setPageScopes:; // IMP 0x2b66c4
- /* @16@0:8 */ pendingPicker; // IMP 0x2b66d0
- /* v24@0:8@16 */ setPendingPicker:; // IMP 0x2b66d8
- /* @16@0:8 */ pendingRequestId; // IMP 0x2b66e4
- /* v24@0:8@16 */ setPendingRequestId:; // IMP 0x2b66ec
- /* @16@0:8 */ pendingToken; // IMP 0x2b66f4
- /* v24@0:8@16 */ setPendingToken:; // IMP 0x2b66fc
- /* @16@0:8 */ pendingScope; // IMP 0x2b6704
- /* v24@0:8@16 */ setPendingScope:; // IMP 0x2b670c
- /* Q16@0:8 */ pendingStorageGeneration; // IMP 0x2b6714
- /* v24@0:8Q16 */ setPendingStorageGeneration:; // IMP 0x2b671c
- /* v16@0:8 */ .cxx_destruct; // IMP 0x2b6724
@end

@interface WCLGFuncCardPanelView /* VM 0x4d99a8 */
- /* @24@0:8@16 */ initForWindow:; // IMP 0x2ec45c
- /* @16@0:8 */ primaryTextColor; // IMP 0x2ec8b4
- /* @16@0:8 */ secondaryTextColor; // IMP 0x2ec924
- /* @16@0:8 */ separatorColor; // IMP 0x2ec994
- /* v16@0:8 */ buildBlurBackground; // IMP 0x2eca04
- /* @16@0:8 */ contentHost; // IMP 0x2ecc80
- /* v16@0:8 */ buildHeader; // IMP 0x2ecc8c
- /* v24@0:8d16 */ buildScrollContent:; // IMP 0x2ed368
- /* @36@0:8q16@24B32 */ makeRowAtIndex:title:lastRow:; // IMP 0x2ee20c
- /* @40@0:8q16@24^@32 */ makeColorRowAtIndex:title:swatchOut:; // IMP 0x2ee4d0
- /* @32@0:8q16@24 */ makeDisclosureRowAtIndex:title:; // IMP 0x2eead8
- /* v32@0:8@16@24 */ placeAccessoryControl:inRow:; // IMP 0x2eef68
- /* v40@0:8@16q24@32 */ addStepperForMetric:index:inRow:; // IMP 0x2ef06c
- /* v16@0:8 */ closeTapped; // IMP 0x2efa00
- /* v24@0:8@16 */ enableSwitchChanged:; // IMP 0x2efb78
- /* v24@0:8@16 */ swipeFollowSwitchChanged:; // IMP 0x2efc24
- /* v24@0:8@16 */ appearanceControlChanged:; // IMP 0x2efccc
- /* v24@0:8@16 */ stepperChanged:; // IMP 0x2efd8c
- /* v16@0:8 */ bgColorTapped; // IMP 0x2f00e4
- /* v16@0:8 */ borderColorTapped; // IMP 0x2f017c
- /* v16@0:8 */ codeLibraryTapped; // IMP 0x2f0214
- /* v32@0:8@16@24 */ presentColorPickerKey:title:; // IMP 0x2f0428
- /* v16@0:8 */ dismissTopModal; // IMP 0x2f07f0
- /* v16@0:8 */ refreshColorSwatches; // IMP 0x2f0844
- /* v24@0:8@16 */ handlePan:; // IMP 0x2f0a64
- /* {CGPoint=dd}64@0:8{CGPoint=dd}16{CGRect={CGPoint=dd}{CGSize=dd}}32 */ clampedCenter:inBounds:; // IMP 0x2f0bb0
- /* B32@0:8@16@24 */ gestureRecognizer:shouldReceiveTouch:; // IMP 0x2f0c7c
- /* @16@0:8 */ panelBG; // IMP 0x2f0cec
- /* v24@0:8@16 */ setPanelBG:; // IMP 0x2f0cfc
- /* @16@0:8 */ scrollView; // IMP 0x2f0d10
- /* v24@0:8@16 */ setScrollView:; // IMP 0x2f0d20
- /* @16@0:8 */ enableSwitch; // IMP 0x2f0d34
- /* v24@0:8@16 */ setEnableSwitch:; // IMP 0x2f0d44
- /* @16@0:8 */ swipeFollowSwitch; // IMP 0x2f0d58
- /* v24@0:8@16 */ setSwipeFollowSwitch:; // IMP 0x2f0d68
- /* @16@0:8 */ appearanceControl; // IMP 0x2f0d7c
- /* v24@0:8@16 */ setAppearanceControl:; // IMP 0x2f0d8c
- /* @16@0:8 */ bgSwatch; // IMP 0x2f0da0
- /* v24@0:8@16 */ setBgSwatch:; // IMP 0x2f0db0
- /* @16@0:8 */ borderSwatch; // IMP 0x2f0dc4
- /* v24@0:8@16 */ setBorderSwatch:; // IMP 0x2f0dd4
- /* @16@0:8 */ valueLabels; // IMP 0x2f0de8
- /* v24@0:8@16 */ setValueLabels:; // IMP 0x2f0df8
- /* @16@0:8 */ metrics; // IMP 0x2f0e0c
- /* v24@0:8@16 */ setMetrics:; // IMP 0x2f0e1c
- /* {CGPoint=dd}16@0:8 */ dragStartCenter; // IMP 0x2f0e30
- /* v32@0:8{CGPoint=dd}16 */ setDragStartCenter:; // IMP 0x2f0e44
- /* B16@0:8 */ darkMode; // IMP 0x2f0e58
- /* v20@0:8B16 */ setDarkMode:; // IMP 0x2f0e68
- /* v16@0:8 */ .cxx_destruct; // IMP 0x2f0e78
@end

@interface WCLGGlassInstalledItem /* VM 0x4d9a20 */
- /* q16@0:8 */ themeId; // IMP 0x2f153c
- /* v24@0:8q16 */ setThemeId:; // IMP 0x2f1544
- /* @16@0:8 */ type; // IMP 0x2f154c
- /* v24@0:8@16 */ setType:; // IMP 0x2f1554
- /* @16@0:8 */ name; // IMP 0x2f155c
- /* v24@0:8@16 */ setName:; // IMP 0x2f1564
- /* @16@0:8 */ subtitle; // IMP 0x2f156c
- /* v24@0:8@16 */ setSubtitle:; // IMP 0x2f1574
- /* @16@0:8 */ iconURL; // IMP 0x2f157c
- /* v24@0:8@16 */ setIconURL:; // IMP 0x2f1584
- /* @16@0:8 */ version; // IMP 0x2f158c
- /* v24@0:8@16 */ setVersion:; // IMP 0x2f1594
- /* q16@0:8 */ versionCode; // IMP 0x2f159c
- /* v24@0:8q16 */ setVersionCode:; // IMP 0x2f15a4
- /* @16@0:8 */ importPath; // IMP 0x2f15ac
- /* v24@0:8@16 */ setImportPath:; // IMP 0x2f15b4
- /* d16@0:8 */ importedAt; // IMP 0x2f15bc
- /* v24@0:8d16 */ setImportedAt:; // IMP 0x2f15c4
- /* v16@0:8 */ .cxx_destruct; // IMP 0x2f15cc
@end

@interface WCLGGlassPackage /* VM 0x4d9a70 */
@end

@interface WCLGGlassTheme /* VM 0x4d9ac0 */
- /* q16@0:8 */ themeId; // IMP 0x2fc590
- /* v24@0:8q16 */ setThemeId:; // IMP 0x2fc598
- /* @16@0:8 */ type; // IMP 0x2fc5a0
- /* v24@0:8@16 */ setType:; // IMP 0x2fc5a8
- /* @16@0:8 */ name; // IMP 0x2fc5b0
- /* v24@0:8@16 */ setName:; // IMP 0x2fc5b8
- /* @16@0:8 */ subtitle; // IMP 0x2fc5c0
- /* v24@0:8@16 */ setSubtitle:; // IMP 0x2fc5c8
- /* @16@0:8 */ authorName; // IMP 0x2fc5d0
- /* v24@0:8@16 */ setAuthorName:; // IMP 0x2fc5d8
- /* @16@0:8 */ desc; // IMP 0x2fc5e0
- /* v24@0:8@16 */ setDesc:; // IMP 0x2fc5e8
- /* @16@0:8 */ iconURL; // IMP 0x2fc5f0
- /* v24@0:8@16 */ setIconURL:; // IMP 0x2fc5f8
- /* @16@0:8 */ previewURLs; // IMP 0x2fc600
- /* v24@0:8@16 */ setPreviewURLs:; // IMP 0x2fc608
- /* @16@0:8 */ version; // IMP 0x2fc610
- /* v24@0:8@16 */ setVersion:; // IMP 0x2fc618
- /* q16@0:8 */ versionCode; // IMP 0x2fc620
- /* v24@0:8q16 */ setVersionCode:; // IMP 0x2fc628
- /* q16@0:8 */ versionId; // IMP 0x2fc630
- /* v24@0:8q16 */ setVersionId:; // IMP 0x2fc638
- /* @16@0:8 */ changelog; // IMP 0x2fc640
- /* v24@0:8@16 */ setChangelog:; // IMP 0x2fc648
- /* B16@0:8 */ hasUpdate; // IMP 0x2fc650
- /* v20@0:8B16 */ setHasUpdate:; // IMP 0x2fc658
- /* B16@0:8 */ installed; // IMP 0x2fc660
- /* v20@0:8B16 */ setInstalled:; // IMP 0x2fc668
- /* q16@0:8 */ parentThemeId; // IMP 0x2fc670
- /* v24@0:8q16 */ setParentThemeId:; // IMP 0x2fc678
- /* @16@0:8 */ subPackages; // IMP 0x2fc680
- /* v24@0:8@16 */ setSubPackages:; // IMP 0x2fc688
- /* v16@0:8 */ .cxx_destruct; // IMP 0x2fc690
@end

@interface WCGMultiDownloader /* VM 0x4d9b10 */
- /* v16@0:8 */ start; // IMP 0x2fc734
- /* v40@0:8{_NSRange=QQ}16@32 */ fetchRange:session:; // IMP 0x2fccb0
- /* v16@0:8 */ emit; // IMP 0x2fd44c
- /* v24@0:8@16 */ finishOnMain:; // IMP 0x2fd65c
- /* @16@0:8 */ base; // IMP 0x2fd7e0
- /* v24@0:8@16 */ setBase:; // IMP 0x2fd7e8
- /* @16@0:8 */ token; // IMP 0x2fd7f0
- /* v24@0:8@16 */ setToken:; // IMP 0x2fd7f8
- /* q16@0:8 */ size; // IMP 0x2fd800
- /* v24@0:8q16 */ setSize:; // IMP 0x2fd808
- /* q16@0:8 */ threads; // IMP 0x2fd810
- /* v24@0:8q16 */ setThreads:; // IMP 0x2fd818
- /* @16@0:8 */ buffer; // IMP 0x2fd820
- /* v24@0:8@16 */ setBuffer:; // IMP 0x2fd828
- /* q16@0:8 */ received; // IMP 0x2fd834
- /* v24@0:8q16 */ setReceived:; // IMP 0x2fd83c
- /* q16@0:8 */ pending; // IMP 0x2fd844
- /* v24@0:8q16 */ setPending:; // IMP 0x2fd84c
- /* B16@0:8 */ failed; // IMP 0x2fd854
- /* v20@0:8B16 */ setFailed:; // IMP 0x2fd85c
- /* @16@0:8 */ lock; // IMP 0x2fd864
- /* v24@0:8@16 */ setLock:; // IMP 0x2fd86c
- /* @16@0:8 */ speedTimer; // IMP 0x2fd878
- /* v24@0:8@16 */ setSpeedTimer:; // IMP 0x2fd880
- /* q16@0:8 */ lastSampleBytes; // IMP 0x2fd88c
- /* v24@0:8q16 */ setLastSampleBytes:; // IMP 0x2fd894
- /* d16@0:8 */ lastSampleTime; // IMP 0x2fd89c
- /* v24@0:8d16 */ setLastSampleTime:; // IMP 0x2fd8a4
- /* @?16@0:8 */ progress; // IMP 0x2fd8ac
- /* v24@0:8@?16 */ setProgress:; // IMP 0x2fd8b4
- /* @?16@0:8 */ done; // IMP 0x2fd8bc
- /* v24@0:8@?16 */ setDone:; // IMP 0x2fd8c4
- /* v16@0:8 */ .cxx_destruct; // IMP 0x2fd8cc
@end

@interface WCLGGlassStore /* VM 0x4d9b38 */
- /* ^{__SecKey=}16@0:8 */ apiPubKey; // IMP 0x2fd9d8
- /* ^{__SecKey=}16@0:8 */ signPubKey; // IMP 0x2ff5c0
- /* @16@0:8 */ currentWXID; // IMP 0x300d94
- /* @40@0:8@16^@24^@32 */ buildRequest:requestKey:nonce:; // IMP 0x300df0
- /* @40@0:8@16@24@32 */ decryptResponse:requestKey:nonce:; // IMP 0x302614
- /* v40@0:8@16@24@?32 */ postPath:payload:completion:; // IMP 0x303ad0
- /* @24@0:8@16 */ themeFromDict:; // IMP 0x304884
- /* v24@0:8@?16 */ fetchCatalogWithCompletion:; // IMP 0x3059c4
- /* v32@0:8@16@?24 */ fetchCardPreviewHTMLForTheme:completion:; // IMP 0x306674
- /* v32@0:8@16@?24 */ downloadAndImportTheme:completion:; // IMP 0x308894
- /* v40@0:8@16@?24@?32 */ downloadAndImportTheme:progress:completion:; // IMP 0x3088a8
- /* ^{__SecKey=}16@0:8 */ glassSignKey; // IMP 0x309eec
- /* @16@0:8 */ glassMasterKey; // IMP 0x309ef8
- /* v32@0:8q16@?24 */ revokeTheme:completion:; // IMP 0x30a110
- /* v24@0:8^{__SecKey=}16 */ setApiPubKey:; // IMP 0x30a6ac
- /* v24@0:8^{__SecKey=}16 */ setSignPubKey:; // IMP 0x30a6b4
@end

@interface WCLGGlassBackgroundView /* VM 0x4d9b88 */
- /* @48@0:8{CGRect={CGPoint=dd}{CGSize=dd}}16 */ initWithFrame:; // IMP 0x30a6bc
- /* B16@0:8 */ isDark; // IMP 0x30ab60
- /* @16@0:8 */ colorsA; // IMP 0x30abb4
- /* @16@0:8 */ colorsB; // IMP 0x30ae28
- /* v16@0:8 */ updateColors; // IMP 0x30b0a0
- /* v16@0:8 */ layoutSubviews; // IMP 0x30b274
- /* v24@0:8@16 */ traitCollectionDidChange:; // IMP 0x30b3d0
- /* v16@0:8 */ startAnimations; // IMP 0x30b4a0
- /* @16@0:8 */ gradA; // IMP 0x30b6e0
- /* v24@0:8@16 */ setGradA:; // IMP 0x30b6f0
- /* @16@0:8 */ gradB; // IMP 0x30b704
- /* v24@0:8@16 */ setGradB:; // IMP 0x30b714
- /* v16@0:8 */ .cxx_destruct; // IMP 0x30b728
@end

@interface WCLGGlassUI /* VM 0x4d9c00 */
@end

@interface WCLGGroupMemberPicker /* VM 0x4d9c28 */
- /* v16@0:8 */ viewDidLoad; // IMP 0x310c4c
- /* v16@0:8 */ setupSingleSelect; // IMP 0x311704
- /* v24@0:8@16 */ onSingleModeChanged:; // IMP 0x311f4c
- /* v16@0:8 */ buildSessionRows; // IMP 0x3122c8
- /* v16@0:8 */ ensureContactsLoaded; // IMP 0x31327c
- /* v16@0:8 */ ensureLabelsLoaded; // IMP 0x313950
- /* v16@0:8 */ ensureChatroomsLoaded; // IMP 0x314e58
- /* v16@0:8 */ applyFilter; // IMP 0x315c74
- /* v24@0:8@16 */ onModeChanged:; // IMP 0x3168d0
- /* v16@0:8 */ updateDoneTitle; // IMP 0x31701c
- /* v16@0:8 */ onCancel; // IMP 0x3175a4
- /* v16@0:8 */ onDone; // IMP 0x317634
- /* v32@0:8@16@24 */ searchBar:textDidChange:; // IMP 0x3178d8
- /* v24@0:8@16 */ searchBarSearchButtonClicked:; // IMP 0x317968
- /* q32@0:8@16q24 */ tableView:numberOfRowsInSection:; // IMP 0x3179f0
- /* @32@0:8@16@24 */ tableView:cellForRowAtIndexPath:; // IMP 0x317ae0
- /* @32@0:8@16q24 */ tableView:titleForHeaderInSection:; // IMP 0x319b4c
- /* v32@0:8@16@24 */ tableView:didSelectRowAtIndexPath:; // IMP 0x31a5d4
- /* @16@0:8 */ groupID; // IMP 0x31c24c
- /* v24@0:8@16 */ setGroupID:; // IMP 0x31c2b8
- /* @?16@0:8 */ onComplete; // IMP 0x31c358
- /* v24@0:8@?16 */ setOnComplete:; // IMP 0x31c3c4
- /* @16@0:8 */ selected; // IMP 0x31c460
- /* v24@0:8@16 */ setSelected:; // IMP 0x31c4c8
- /* @16@0:8 */ sessionUsernames; // IMP 0x31c558
- /* v24@0:8@16 */ setSessionUsernames:; // IMP 0x31c5c4
- /* @16@0:8 */ sessionRows; // IMP 0x31c65c
- /* v24@0:8@16 */ setSessionRows:; // IMP 0x31c6c8
- /* @16@0:8 */ contactRows; // IMP 0x31c774
- /* v24@0:8@16 */ setContactRows:; // IMP 0x31c7e0
- /* @16@0:8 */ filteredRows; // IMP 0x31c884
- /* v24@0:8@16 */ setFilteredRows:; // IMP 0x31c8ec
- /* @16@0:8 */ labels; // IMP 0x31c990
- /* v24@0:8@16 */ setLabels:; // IMP 0x31c9fc
- /* @16@0:8 */ chatroomRows; // IMP 0x31caa4
- /* v24@0:8@16 */ setChatroomRows:; // IMP 0x31cb10
- /* B16@0:8 */ contactsLoaded; // IMP 0x31cbc0
- /* v20@0:8B16 */ setContactsLoaded:; // IMP 0x31cc2c
- /* B16@0:8 */ labelsLoaded; // IMP 0x31cc98
- /* v20@0:8B16 */ setLabelsLoaded:; // IMP 0x31cd04
- /* B16@0:8 */ chatroomsLoaded; // IMP 0x31cd64
- /* v20@0:8B16 */ setChatroomsLoaded:; // IMP 0x31cdd4
- /* B16@0:8 */ singleSelect; // IMP 0x31ce48
- /* v20@0:8B16 */ setSingleSelect:; // IMP 0x31ceb4
- /* @?16@0:8 */ onPick; // IMP 0x31cf28
- /* v24@0:8@?16 */ setOnPick:; // IMP 0x31cf94
- /* @16@0:8 */ excluded; // IMP 0x31d030
- /* v24@0:8@16 */ setExcluded:; // IMP 0x31d09c
- /* q16@0:8 */ mode; // IMP 0x31d134
- /* v24@0:8q16 */ setMode:; // IMP 0x31d1a0
- /* @16@0:8 */ segmented; // IMP 0x31d20c
- /* v24@0:8@16 */ setSegmented:; // IMP 0x31d278
- /* @16@0:8 */ tableView; // IMP 0x31d310
- /* v24@0:8@16 */ setTableView:; // IMP 0x31d378
- /* @16@0:8 */ searchBar; // IMP 0x31d3f8
- /* v24@0:8@16 */ setSearchBar:; // IMP 0x31d464
- /* @16@0:8 */ searchText; // IMP 0x31d514
- /* v24@0:8@16 */ setSearchText:; // IMP 0x31d580
- /* v16@0:8 */ .cxx_destruct; // IMP 0x31d5e4
@end

@interface WCLGFriendCapsuleButton /* VM 0x4d9c78 */
- /* @48@0:8{CGRect={CGPoint=dd}{CGSize=dd}}16 */ initWithFrame:; // IMP 0x323168
- /* v16@0:8 */ didMoveToWindow; // IMP 0x323960
- /* v32@0:8@16q24 */ configureUsername:unread:; // IMP 0x323a4c
- /* v24@0:8q16 */ setUnreadCount:; // IMP 0x32405c
- /* v16@0:8 */ layoutSubviews; // IMP 0x3243b0
- /* v20@0:8B16 */ setHighlighted:; // IMP 0x324b50
- /* v16@0:8 */ wclgHandleTap; // IMP 0x324e08
- /* v24@0:8@16 */ wclgHandleLongPress:; // IMP 0x324f38
- /* @16@0:8 */ username; // IMP 0x325080
- /* v24@0:8@16 */ setUsername:; // IMP 0x325090
- /* @16@0:8 */ avatarView; // IMP 0x32509c
- /* v24@0:8@16 */ setAvatarView:; // IMP 0x3250ac
- /* @16@0:8 */ nameLabel; // IMP 0x3250c0
- /* v24@0:8@16 */ setNameLabel:; // IMP 0x3250d0
- /* @16@0:8 */ badgeLabel; // IMP 0x3250e4
- /* v24@0:8@16 */ setBadgeLabel:; // IMP 0x3250f4
- /* @16@0:8 */ fallbackGlassView; // IMP 0x325108
- /* v24@0:8@16 */ setFallbackGlassView:; // IMP 0x325118
- /* @16@0:8 */ colorTintView; // IMP 0x32512c
- /* v24@0:8@16 */ setColorTintView:; // IMP 0x32513c
- /* @?16@0:8 */ onTap; // IMP 0x325150
- /* v24@0:8@?16 */ setOnTap:; // IMP 0x325160
- /* @?16@0:8 */ onLongPress; // IMP 0x32516c
- /* v24@0:8@?16 */ setOnLongPress:; // IMP 0x32517c
- /* v16@0:8 */ .cxx_destruct; // IMP 0x325188
@end

@interface WCLGHomeCapsulePinnedController /* VM 0x4d9cf0 */
- /* v16@0:8 */ refresh; // IMP 0x325254
- /* v24@0:8@16 */ presentActionsForUser:; // IMP 0x325258
- /* v24@0:8@16 */ presentNicknameEditorForUser:; // IMP 0x32669c
- /* v24@0:8@16 */ replaceFriend:; // IMP 0x327124
- /* v24@0:8@16 */ replaceAvatar:; // IMP 0x327714
- /* v24@0:8@16 */ removeUser:; // IMP 0x327824
- /* v32@0:8@16@24 */ imagePickerController:didFinishPickingMediaWithInfo:; // IMP 0x327930
- /* v24@0:8@16 */ imagePickerControllerDidCancel:; // IMP 0x327b7c
- /* @16@0:8 */ pendingAvatarUser; // IMP 0x327bf4
- /* v24@0:8@16 */ setPendingAvatarUser:; // IMP 0x327bfc
- /* v16@0:8 */ .cxx_destruct; // IMP 0x327c04
@end

@interface WCLGCapsulePinnedContainerView /* VM 0x4d9d18 */
- /* B40@0:8{CGPoint=dd}16@32 */ pointInside:withEvent:; // IMP 0x32861c
@end

@interface WCLGFuncCardChromeView /* VM 0x4d9d68 */
- /* v24@0:8@16 */ traitCollectionDidChange:; // IMP 0x32dd2c
@end

@interface WCLGFuncCardLongPressTarget /* VM 0x4d9db8 */
- /* v24@0:8@16 */ onLongPress:; // IMP 0x32fe98
- /* B32@0:8@16@24 */ gestureRecognizer:shouldRecognizeSimultaneouslyWithGestureRecognizer:; // IMP 0x32fedc
@end

@interface WCLGFuncCardDocPickerDelegate /* VM 0x4d9e30 */
- /* v32@0:8@16@24 */ documentPicker:didPickDocumentsAtURLs:; // IMP 0x33270c
- /* v24@0:8@16 */ documentPickerWasCancelled:; // IMP 0x332e6c
- /* @?16@0:8 */ onChange; // IMP 0x332e7c
- /* v24@0:8@?16 */ setOnChange:; // IMP 0x332e84
- /* @16@0:8 */ retainSelf; // IMP 0x332e8c
- /* v24@0:8@16 */ setRetainSelf:; // IMP 0x332e94
- /* v16@0:8 */ .cxx_destruct; // IMP 0x332ea0
@end

@interface WCLGGroupPill /* VM 0x4d9e58 */
- /* @48@0:8{CGRect={CGPoint=dd}{CGSize=dd}}16 */ initWithFrame:; // IMP 0x3351e8
- /* v16@0:8 */ applyBadgeText; // IMP 0x3356cc
- /* v16@0:8 */ applyMemberText; // IMP 0x335cdc
- /* v32@0:8B16B20@24 */ applyVisualStateExpanded:newButton:title:; // IMP 0x33610c
- /* v20@0:8B16 */ setPillExpanded:; // IMP 0x337e6c
- /* v56@0:8@16q24q32B40B44@48 */ configureWithTitle:memberCount:badgeCount:expanded:newButton:textColor:; // IMP 0x338094
- /* v32@0:8q16q24 */ refreshBadgeCount:memberCount:; // IMP 0x3385e0
- /* v16@0:8 */ layoutSubviews; // IMP 0x33897c
- /* v16@0:8 */ handleTap; // IMP 0x33925c
- /* v24@0:8@16 */ handleLongPress:; // IMP 0x339558
- /* q16@0:8 */ displayIndex; // IMP 0x3397c0
- /* v24@0:8q16 */ setDisplayIndex:; // IMP 0x33982c
- /* @?16@0:8 */ onTap; // IMP 0x33988c
- /* v24@0:8@?16 */ setOnTap:; // IMP 0x3398f4
- /* @?16@0:8 */ onLongPress; // IMP 0x339990
- /* v24@0:8@?16 */ setOnLongPress:; // IMP 0x3399f8
- /* @16@0:8 */ badge; // IMP 0x339a5c
- /* v24@0:8@16 */ setBadge:; // IMP 0x339ac4
- /* q16@0:8 */ badgeCount; // IMP 0x339b5c
- /* v24@0:8q16 */ setBadgeCount:; // IMP 0x339bc4
- /* @16@0:8 */ countLabel; // IMP 0x339c28
- /* v24@0:8@16 */ setCountLabel:; // IMP 0x339c94
- /* q16@0:8 */ memberCount; // IMP 0x339d2c
- /* v24@0:8q16 */ setMemberCount:; // IMP 0x339d94
- /* B16@0:8 */ wclgExpanded; // IMP 0x339df0
- /* v20@0:8B16 */ setWclgExpanded:; // IMP 0x339e58
- /* B16@0:8 */ wclgNewButton; // IMP 0x339ec4
- /* v20@0:8B16 */ setWclgNewButton:; // IMP 0x339f2c
- /* @16@0:8 */ wclgTitle; // IMP 0x339f94
- /* v24@0:8@16 */ setWclgTitle:; // IMP 0x339ffc
- /* v16@0:8 */ .cxx_destruct; // IMP 0x33a098
@end

@interface WCLGHomeGroupBar /* VM 0x4d9ea8 */
- /* @48@0:8{CGRect={CGPoint=dd}{CGSize=dd}}16 */ initWithFrame:; // IMP 0x33a268
- /* v16@0:8 */ dealloc; // IMP 0x33a5f8
- /* v16@0:8 */ handleGroupsChanged; // IMP 0x33a6bc
- /* v16@0:8 */ reloadGroups; // IMP 0x33a744
- /* v16@0:8 */ reloadGroupsIfNeeded; // IMP 0x33bc60
- /* v28@0:8q16B24 */ setSelectedDisplayIndex:animated:; // IMP 0x33c000
- /* v24@0:8@16 */ refreshBadgesWithTable:; // IMP 0x33c088
- /* v16@0:8 */ layoutSubviews; // IMP 0x33cae8
- /* v20@0:8B16 */ scrollSelectedPillToVisibleIfNeededAnimated:; // IMP 0x33d638
- /* v24@0:8@16 */ traitCollectionDidChange:; // IMP 0x33e220
- /* @16@0:8 */ delegate; // IMP 0x33e3bc
- /* v24@0:8@16 */ setDelegate:; // IMP 0x33e454
- /* @16@0:8 */ pills; // IMP 0x33e4c0
- /* v24@0:8@16 */ setPills:; // IMP 0x33e52c
- /* @16@0:8 */ scroll; // IMP 0x33e5c4
- /* v24@0:8@16 */ setScroll:; // IMP 0x33e630
- /* q16@0:8 */ lastScrolledExpandedIndex; // IMP 0x33e6c0
- /* v24@0:8q16 */ setLastScrolledExpandedIndex:; // IMP 0x33e728
- /* @16@0:8 */ wclgStructureToken; // IMP 0x33e784
- /* v24@0:8@16 */ setWclgStructureToken:; // IMP 0x33e7f0
- /* v16@0:8 */ .cxx_destruct; // IMP 0x33e890
@end

@interface WCLGHGFullscreenDrawer /* VM 0x4d9ef8 */
- /* @36@0:8@16B24d28 */ initWithController:fromLeft:anchorY:; // IMP 0x3442b4
- /* v24@0:8d16 */ buildPillsWithFontSize:; // IMP 0x3446d0
- /* v16@0:8 */ handleBackdrop; // IMP 0x345d90
- /* v24@0:8@16 */ handlePill:; // IMP 0x345da0
- /* q32@0:8{CGPoint=dd}16 */ pillIndexAtWindowPoint:; // IMP 0x345e2c
- /* v24@0:8q16 */ setHighlightedIndex:; // IMP 0x345fe0
- /* v24@0:8q16 */ commitSelection:; // IMP 0x3462b8
- /* v24@0:8@16 */ presentInWindow:; // IMP 0x3463ac
- /* v20@0:8B16 */ dismissAnimated:; // IMP 0x346b00
- /* @16@0:8 */ controller; // IMP 0x346e28
- /* v24@0:8@16 */ setController:; // IMP 0x346e5c
- /* @16@0:8 */ backdrop; // IMP 0x346e70
- /* v24@0:8@16 */ setBackdrop:; // IMP 0x346e80
- /* @16@0:8 */ column; // IMP 0x346e94
- /* v24@0:8@16 */ setColumn:; // IMP 0x346ea4
- /* B16@0:8 */ fromLeft; // IMP 0x346eb8
- /* v20@0:8B16 */ setFromLeft:; // IMP 0x346ec8
- /* d16@0:8 */ columnWidth; // IMP 0x346ed8
- /* v24@0:8d16 */ setColumnWidth:; // IMP 0x346ee8
- /* d16@0:8 */ anchorY; // IMP 0x346ef8
- /* v24@0:8d16 */ setAnchorY:; // IMP 0x346f08
- /* @16@0:8 */ pills; // IMP 0x346f18
- /* v24@0:8@16 */ setPills:; // IMP 0x346f28
- /* q16@0:8 */ highlightedIndex; // IMP 0x346f3c
- /* @16@0:8 */ lockedScroll; // IMP 0x346f4c
- /* v24@0:8@16 */ setLockedScroll:; // IMP 0x346f80
- /* @16@0:8 */ hapticGenerator; // IMP 0x346f94
- /* v24@0:8@16 */ setHapticGenerator:; // IMP 0x346fa4
- /* v16@0:8 */ .cxx_destruct; // IMP 0x346fb8
@end

@interface WCLGHGFullscreenGestureTarget /* VM 0x4d9f70 */
- /* v24@0:8@16 */ handleEdgePan:; // IMP 0x34712c
- /* B32@0:8@16@24 */ gestureRecognizer:shouldReceiveTouch:; // IMP 0x347478
- /* B32@0:8@16@24 */ gestureRecognizer:shouldRecognizeSimultaneouslyWithGestureRecognizer:; // IMP 0x3474c4
@end

@interface WCLGHGPassthroughView /* VM 0x4d9f98 */
- /* @40@0:8{CGPoint=dd}16@32 */ hitTest:withEvent:; // IMP 0x347ea8
@end

@interface WCLGSessionGroup /* VM 0x4da010 */
- /* @16@0:8 */ init; // IMP 0x3571a8
- /* B16@0:8 */ isAllGroup; // IMP 0x357378
- /* B24@0:8@16 */ containsSessionUsername:; // IMP 0x357658
- /* B40@0:8@16q24B32B36 */ containsSessionUsername:unreadCount:muted:showMutedUnread:; // IMP 0x359600
- /* @16@0:8 */ dictionaryRepresentation; // IMP 0x359ac4
- /* @16@0:8 */ groupID; // IMP 0x35b1b8
- /* v24@0:8@16 */ setGroupID:; // IMP 0x35b21c
- /* @16@0:8 */ title; // IMP 0x35b268
- /* v24@0:8@16 */ setTitle:; // IMP 0x35b2cc
- /* @16@0:8 */ members; // IMP 0x35b318
- /* v24@0:8@16 */ setMembers:; // IMP 0x35b37c
- /* q16@0:8 */ rule; // IMP 0x35b3c8
- /* v24@0:8q16 */ setRule:; // IMP 0x35b42c
- /* v16@0:8 */ .cxx_destruct; // IMP 0x35b488
@end

@interface WCLGHomeGroups /* VM 0x4d9fe8 */
- /* @16@0:8 */ init; // IMP 0x35b7e8
- /* v16@0:8 */ loadFromDisk; // IMP 0x35b9a0
- /* v16@0:8 */ seedDefaultGroupsIfNeeded; // IMP 0x35c704
- /* v16@0:8 */ persistGroupsLocked; // IMP 0x35d030
- /* B16@0:8 */ enabled; // IMP 0x35d8c8
- /* v20@0:8B16 */ setEnabled:; // IMP 0x35dc50
- /* B16@0:8 */ tgMode; // IMP 0x35e024
- /* v20@0:8B16 */ setTgMode:; // IMP 0x35e3bc
- /* B16@0:8 */ hideGroupArrow; // IMP 0x35e748
- /* v20@0:8B16 */ setHideGroupArrow:; // IMP 0x35eafc
- /* d16@0:8 */ stripPillFontSize; // IMP 0x35eec8
- /* v24@0:8d16 */ setStripPillFontSize:; // IMP 0x35f32c
- /* d16@0:8 */ stripPillWidth; // IMP 0x35f750
- /* v24@0:8d16 */ setStripPillWidth:; // IMP 0x35fc0c
- /* d16@0:8 */ stripVerticalOffset; // IMP 0x360048
- /* v24@0:8d16 */ setStripVerticalOffset:; // IMP 0x3605a0
- /* @16@0:8 */ defaultExpandedGroupID; // IMP 0x360a30
- /* v24@0:8@16 */ setDefaultExpandedGroupID:; // IMP 0x360f20
- /* B16@0:8 */ unreadGroupShowMuted; // IMP 0x361354
- /* v20@0:8B16 */ setUnreadGroupShowMuted:; // IMP 0x361764
- /* B16@0:8 */ swipeEnabled; // IMP 0x361b40
- /* v20@0:8B16 */ setSwipeEnabled:; // IMP 0x361f14
- /* B16@0:8 */ animationEnabled; // IMP 0x3622d4
- /* v20@0:8B16 */ setAnimationEnabled:; // IMP 0x3626f4
- /* B16@0:8 */ filterPinned; // IMP 0x362b30
- /* v20@0:8B16 */ setFilterPinned:; // IMP 0x362ed0
- /* B16@0:8 */ showBadge; // IMP 0x3632c8
- /* v20@0:8B16 */ setShowBadge:; // IMP 0x363670
- /* B16@0:8 */ showUnreadBadge; // IMP 0x363a50
- /* v20@0:8B16 */ setShowUnreadBadge:; // IMP 0x363e38
- /* B16@0:8 */ groupTapHapticEnabled; // IMP 0x364260
- /* v20@0:8B16 */ setGroupTapHapticEnabled:; // IMP 0x3645e8
- /* q16@0:8 */ textColorMode; // IMP 0x364988
- /* v24@0:8q16 */ setTextColorMode:; // IMP 0x364e48
- /* q16@0:8 */ pillColorMode; // IMP 0x365274
- /* v24@0:8q16 */ setPillColorMode:; // IMP 0x365708
- /* q16@0:8 */ pillSelectedColorMode; // IMP 0x365b2c
- /* v24@0:8q16 */ setPillSelectedColorMode:; // IMP 0x366054
- /* q16@0:8 */ badgeColorMode; // IMP 0x36650c
- /* v24@0:8q16 */ setBadgeColorMode:; // IMP 0x3669b8
- /* q16@0:8 */ badgeColorDarkMode; // IMP 0x366df8
- /* v24@0:8q16 */ setBadgeColorDarkMode:; // IMP 0x3672dc
- /* q16@0:8 */ stripSelectedColorMode; // IMP 0x36773c
- /* v24@0:8q16 */ setStripSelectedColorMode:; // IMP 0x367c78
- /* q16@0:8 */ stripSelectedColorDarkMode; // IMP 0x368128
- /* v24@0:8q16 */ setStripSelectedColorDarkMode:; // IMP 0x368694
- /* d16@0:8 */ barVerticalOffset; // IMP 0x368b74
- /* v24@0:8d16 */ setBarVerticalOffset:; // IMP 0x3690a4
- /* d16@0:8 */ pillGap; // IMP 0x36953c
- /* v24@0:8d16 */ setPillGap:; // IMP 0x3699dc
- /* d16@0:8 */ pillHorizontalInset; // IMP 0x369dd4
- /* v24@0:8d16 */ setPillHorizontalInset:; // IMP 0x36a328
- /* B16@0:8 */ hideAllGroup; // IMP 0x36a7b0
- /* v20@0:8B16 */ setHideAllGroup:; // IMP 0x36ab28
- /* B16@0:8 */ effectiveEnabled; // IMP 0x36b1a0
- /* @16@0:8 */ allGroupTitle; // IMP 0x36b3c8
- /* B16@0:8 */ isAllGroupTitleCustomized; // IMP 0x36b808
- /* v16@0:8 */ restoreAllGroupTitle; // IMP 0x36bcc4
- /* q16@0:8 */ allGroupIndex; // IMP 0x36c070
- /* v24@0:8q16 */ setAllGroupIndex:; // IMP 0x36c514
- /* @16@0:8 */ allGroup; // IMP 0x36c92c
- /* @16@0:8 */ customGroups; // IMP 0x36cc6c
- /* @16@0:8 */ displayGroups; // IMP 0x36cd1c
- /* @24@0:8@16 */ groupForID:; // IMP 0x36cf84
- /* @24@0:8q16 */ displayGroupAtIndex:; // IMP 0x36da40
- /* @16@0:8 */ currentGroupID; // IMP 0x36dc78
- /* v24@0:8@16 */ setCurrentGroupID:; // IMP 0x36df68
- /* q16@0:8 */ currentDisplayIndex; // IMP 0x36e6e4
- /* @16@0:8 */ currentGroup; // IMP 0x36e9c0
- /* v24@0:8q16 */ selectDisplayIndex:; // IMP 0x36ea74
- /* B16@0:8 */ collapsed; // IMP 0x36ec28
- /* q16@0:8 */ expandedDisplayIndex; // IMP 0x36ef0c
- /* v24@0:8q16 */ toggleExpandDisplayIndex:; // IMP 0x36f068
- /* v16@0:8 */ normalizeCurrentSelection; // IMP 0x36f830
- /* @24@0:8@16 */ addGroupWithTitle:; // IMP 0x36fcfc
- /* v24@0:8@16 */ removeGroupID:; // IMP 0x36ffdc
- /* v32@0:8@16@24 */ renameGroupID:toTitle:; // IMP 0x370874
- /* v32@0:8@16@24 */ setMembers:forGroupID:; // IMP 0x3715d4
- /* @24@0:8q16 */ customGroupWithRule:; // IMP 0x3727a4
- /* v24@0:8q16 */ restoreDefaultGroupOfRule:; // IMP 0x372e18
- /* v32@0:8q16q24 */ moveCustomGroupFromIndex:toIndex:; // IMP 0x37349c
- /* v32@0:8q16q24 */ moveDisplayGroupFromIndex:toIndex:; // IMP 0x3737a8
- /* B24@0:8@16 */ currentGroupShouldShowSessionUsername:; // IMP 0x374050
- /* B32@0:8q16@24 */ groupAtDisplayIndex:shouldShowSessionUsername:; // IMP 0x3740ec
- /* B32@0:8@16@24 */ currentGroupShouldShowSessionUsername:cellData:; // IMP 0x374198
- /* B40@0:8q16@24@32 */ groupAtDisplayIndex:shouldShowSessionUsername:cellData:; // IMP 0x374274
- /* v20@0:8B16 */ recomputeAtomicMirrorLocked:; // IMP 0x374804
- /* v16@0:8 */ refresh; // IMP 0x374f68
- /* v16@0:8 */ beginQuietGroupSwitch; // IMP 0x37501c
- /* v16@0:8 */ endQuietGroupSwitch; // IMP 0x375088
- /* v16@0:8 */ notifyChanged; // IMP 0x37518c
- /* v16@0:8 */ .cxx_destruct; // IMP 0x37597c
@end

@interface WCLGHomeGroupsControllerState /* VM 0x4da0b0 */
- /* B16@0:8 */ fullscreenRowsBusy; // IMP 0x376d94
- /* v20@0:8B16 */ setFullscreenRowsBusy:; // IMP 0x376d9c
- /* B16@0:8 */ fullscreenCapsulePositionPending; // IMP 0x376da4
- /* v20@0:8B16 */ setFullscreenCapsulePositionPending:; // IMP 0x376dac
- /* B16@0:8 */ fullscreenCapsulePositionScheduled; // IMP 0x376db4
- /* v20@0:8B16 */ setFullscreenCapsulePositionScheduled:; // IMP 0x376dbc
- /* Q16@0:8 */ fullscreenCapsulePositionScheduledEpoch; // IMP 0x376dc4
- /* v24@0:8Q16 */ setFullscreenCapsulePositionScheduledEpoch:; // IMP 0x376dcc
- /* Q16@0:8 */ fullscreenCapsulePositionAttemptCount; // IMP 0x376dd4
- /* v24@0:8Q16 */ setFullscreenCapsulePositionAttemptCount:; // IMP 0x376ddc
- /* Q16@0:8 */ fullscreenCapsulePositionTargetToken; // IMP 0x376de4
- /* v24@0:8Q16 */ setFullscreenCapsulePositionTargetToken:; // IMP 0x376dec
- /* Q16@0:8 */ fullscreenCapsulePositionEpoch; // IMP 0x376df4
- /* v24@0:8Q16 */ setFullscreenCapsulePositionEpoch:; // IMP 0x376dfc
@end

@interface WCLGHomeGroupsChrome /* VM 0x4da100 */
- /* v32@0:8@16q24 */ homeGroupBar:didToggleDisplayIndex:; // IMP 0x37a4a8
- /* v40@0:8@16q24@32 */ homeGroupBar:didRequestManageDisplayIndex:sourceView:; // IMP 0x37a4fc
- /* v24@0:8@16 */ homeGroupBarDidRequestCreateGroup:; // IMP 0x37b30c
- /* @16@0:8 */ controller; // IMP 0x37b6b4
- /* v24@0:8@16 */ setController:; // IMP 0x37b6e0
- /* v16@0:8 */ .cxx_destruct; // IMP 0x37b6ec
@end

@interface WCLGHomeGroupsGestureTarget /* VM 0x4da150 */
- /* B24@0:8@16 */ gestureRecognizerShouldBegin:; // IMP 0x380958
- /* B32@0:8@16@24 */ gestureRecognizer:shouldRecognizeSimultaneouslyWithGestureRecognizer:; // IMP 0x38095c
- /* v24@0:8@16 */ wclgHandleLongPress:; // IMP 0x380964
@end

@interface WCLGHomeSwipeBlockerPan /* VM 0x4da1a0 */
- /* B24@0:8@16 */ canPreventGestureRecognizer:; // IMP 0x3821d0
- /* B24@0:8@16 */ canBePreventedByGestureRecognizer:; // IMP 0x3821d8
@end

@interface WCLGHomeSwipeBlockerDelegate /* VM 0x4da1f0 */
- /* B32@0:8@16@24 */ gestureRecognizer:shouldReceiveTouch:; // IMP 0x3821e0
- /* B24@0:8@16 */ gestureRecognizerShouldBegin:; // IMP 0x382324
- /* B32@0:8@16@24 */ gestureRecognizer:shouldRecognizeSimultaneouslyWithGestureRecognizer:; // IMP 0x382a14
@end

@interface WCLGHomeSwipeBlockerTarget /* VM 0x4da218 */
- /* v24@0:8@16 */ handlePan:; // IMP 0x382c68
@end

@interface WCLGHomeStripSwipeTarget /* VM 0x4da268 */
- /* v24@0:8@16 */ handleSwipe:; // IMP 0x382ec4
- /* B32@0:8@16@24 */ gestureRecognizer:shouldRecognizeSimultaneouslyWithGestureRecognizer:; // IMP 0x3830cc
- /* B32@0:8@16@24 */ gestureRecognizer:shouldReceiveTouch:; // IMP 0x3830d4
@end

@interface WCLGHomePinnedController /* VM 0x4da2e0 */
- /* v16@0:8 */ refreshUI; // IMP 0x392c34
- /* v24@0:8@16 */ onSlotTap:; // IMP 0x392c38
- /* v24@0:8@16 */ onSlotLongPress:; // IMP 0x392cac
- /* v32@0:8@16@24 */ presentActionsForUser:fromController:; // IMP 0x3930b0
- /* v32@0:8@16@24 */ replaceFriend:fromController:; // IMP 0x393cc4
- /* v32@0:8@16@24 */ replaceAvatar:fromController:; // IMP 0x3942d8
- /* v24@0:8@16 */ removeUser:; // IMP 0x3943d0
- /* v32@0:8@16@?24 */ addContactFromController:onChange:; // IMP 0x3944d4
- /* v24@0:8@16 */ presentMaskPickerFromController:; // IMP 0x394840
- /* v28@0:8B16@20 */ pickMaskForDark:fromController:; // IMP 0x395370
- /* v32@0:8@16@24 */ imagePickerController:didFinishPickingMediaWithInfo:; // IMP 0x395498
- /* v24@0:8@16 */ imagePickerControllerDidCancel:; // IMP 0x395758
- /* @16@0:8 */ pendingAvatarUser; // IMP 0x3957e4
- /* v24@0:8@16 */ setPendingAvatarUser:; // IMP 0x3957ec
- /* @16@0:8 */ pendingMaskDark; // IMP 0x3957f4
- /* v24@0:8@16 */ setPendingMaskDark:; // IMP 0x3957fc
- /* v16@0:8 */ .cxx_destruct; // IMP 0x395808
@end

@interface WCLGHomePinnedPanelView /* VM 0x4da308 */
- /* @24@0:8@16 */ initForWindow:; // IMP 0x39bbe0
- /* @16@0:8 */ primaryTextColor; // IMP 0x39c01c
- /* @16@0:8 */ secondaryTextColor; // IMP 0x39c08c
- /* @16@0:8 */ separatorColor; // IMP 0x39c0fc
- /* v16@0:8 */ buildBackground; // IMP 0x39c16c
- /* v16@0:8 */ buildHeader; // IMP 0x39c3e8
- /* v24@0:8d16 */ buildScrollContent:; // IMP 0x39cae4
- /* @36@0:8q16@24B32 */ makePlainRowAtIndex:title:lastRow:; // IMP 0x39cfc8
- /* @36@0:8q16@24B32 */ makeTappableRowAtIndex:title:lastRow:; // IMP 0x39d0ec
- /* v40@0:8@16B24@28B36 */ addLabel:separator:toRow:interactive:; // IMP 0x39d44c
- /* v32@0:8@16@24 */ placeAccessory:inRow:; // IMP 0x39d684
- /* B24@0:8@16 */ switchOnFor:; // IMP 0x39d788
- /* v40@0:8@16@24q32 */ addSwitchToRow:def:index:; // IMP 0x39d9b8
- /* v40@0:8@16@24q32 */ addSegmentToRow:def:index:; // IMP 0x39db30
- /* v40@0:8@16@24q32 */ addStepperToRow:def:index:; // IMP 0x39dcec
- /* v32@0:8@16q24 */ addColorAccessoryToRow:index:; // IMP 0x39e690
- /* v24@0:8@16 */ addActionAccessoryToRow:; // IMP 0x39e87c
- /* v16@0:8 */ refreshBadgeSwatch; // IMP 0x39e880
- /* v16@0:8 */ closeTapped; // IMP 0x39e9a4
- /* v24@0:8@16 */ switchChanged:; // IMP 0x39eb1c
- /* v24@0:8@16 */ segmentChanged:; // IMP 0x39f13c
- /* v24@0:8@16 */ stepperChanged:; // IMP 0x39f1ec
- /* v24@0:8@16 */ rowTapped:; // IMP 0x39f5a0
- /* v16@0:8 */ badgeColorTapped; // IMP 0x39f8d8
- /* v16@0:8 */ dismissTopModal; // IMP 0x39fcf8
- /* v24@0:8@16 */ handlePan:; // IMP 0x39fd4c
- /* {CGPoint=dd}64@0:8{CGPoint=dd}16{CGRect={CGPoint=dd}{CGSize=dd}}32 */ clampedCenter:inBounds:; // IMP 0x39fe98
- /* B32@0:8@16@24 */ gestureRecognizer:shouldReceiveTouch:; // IMP 0x39ff64
- /* @16@0:8 */ panelBG; // IMP 0x39ffd4
- /* v24@0:8@16 */ setPanelBG:; // IMP 0x39ffe4
- /* @16@0:8 */ scrollView; // IMP 0x39fff8
- /* v24@0:8@16 */ setScrollView:; // IMP 0x3a0008
- /* @16@0:8 */ rows; // IMP 0x3a001c
- /* v24@0:8@16 */ setRows:; // IMP 0x3a002c
- /* @16@0:8 */ valueLabels; // IMP 0x3a0040
- /* v24@0:8@16 */ setValueLabels:; // IMP 0x3a0050
- /* @16@0:8 */ badgeSwatch; // IMP 0x3a0064
- /* v24@0:8@16 */ setBadgeSwatch:; // IMP 0x3a0074
- /* {CGPoint=dd}16@0:8 */ dragStartCenter; // IMP 0x3a0088
- /* v32@0:8{CGPoint=dd}16 */ setDragStartCenter:; // IMP 0x3a009c
- /* B16@0:8 */ darkMode; // IMP 0x3a00b0
- /* v20@0:8B16 */ setDarkMode:; // IMP 0x3a00c0
- /* v16@0:8 */ .cxx_destruct; // IMP 0x3a00d0
@end

@interface WCLGHomeTextHeaderWrapperView /* VM 0x4da358 */
- /* v16@0:8 */ layoutSubviews; // IMP 0x3a09e4
- /* @40@0:8{CGPoint=dd}16@32 */ hitTest:withEvent:; // IMP 0x3a0e20
@end

@interface WCLGHomeTextCardLongPressTarget /* VM 0x4da3a8 */
- /* v24@0:8@16 */ onLongPress:; // IMP 0x3a2ef0
@end

@interface WCLGKeyboardObserver /* VM 0x4da420 */
- /* v28@0:8@16B24 */ updateFromNote:visibleHint:; // IMP 0x3bca50
- /* v24@0:8@16 */ keyboardWillShow:; // IMP 0x3bceec
- /* v24@0:8@16 */ keyboardWillHide:; // IMP 0x3bcefc
- /* v24@0:8@16 */ keyboardDidShow:; // IMP 0x3bcf0c
- /* v24@0:8@16 */ keyboardDidHide:; // IMP 0x3bcf1c
- /* v24@0:8@16 */ keyboardWillChangeFrame:; // IMP 0x3bcf2c
- /* v24@0:8@16 */ keyboardDidChangeFrame:; // IMP 0x3bcf44
@end

@interface WCLGForegroundReaffirm /* VM 0x4da470 */
- /* v24@0:8@16 */ appDidBecomeActive:; // IMP 0x3bd408
@end

@interface WCLGSearchActionTarget /* VM 0x4da4c0 */
- /* v24@0:8@16 */ searchTapped:; // IMP 0x3c7eb8
@end

@interface WCLGSearchTabBarOverlay /* VM 0x4da4e8 */
- /* @24@0:8@16 */ initWithTabBar:; // IMP 0x3d2a0c
- /* B16@0:8 */ isDarkMode; // IMP 0x3d2ba8
- /* @16@0:8 */ glassView; // IMP 0x3d2bfc
- /* v32@0:8@16@24 */ styleGlassControl:glass:; // IMP 0x3d2ee0
- /* @16@0:8 */ searchIcon; // IMP 0x3d329c
- /* @16@0:8 */ badgeRedColor; // IMP 0x3d3508
- /* v40@0:8@16@24@32 */ applyBadge:dotView:label:; // IMP 0x3d370c
- /* v32@0:8@16@24 */ applyModeBadgeFromItem:fallbackBadge:; // IMP 0x3d3b2c
- /* d32@0:8@16d24 */ badgeLabelWidthForText:height:; // IMP 0x3d3bdc
- /* v16@0:8 */ lightFeedback; // IMP 0x3d3d78
- /* v16@0:8 */ selectionFeedback; // IMP 0x3d3dd4
- /* v16@0:8 */ resetControlInteractionState; // IMP 0x3d3e20
- /* B40@0:8q16@24@32 */ applySystemGlassButtonConfigurationsWithSizeMode:primary:secondary:; // IMP 0x3d4088
- /* v16@0:8 */ buildSubviews; // IMP 0x3d5348
- /* B40@0:8{CGPoint=dd}16@32 */ pointInside:withEvent:; // IMP 0x3d6928
- /* @40@0:8{CGPoint=dd}16@32 */ hitTest:withEvent:; // IMP 0x3d6adc
- /* Q16@0:8 */ currentIndex; // IMP 0x3d6d74
- /* Q32@0:8Q16Q24 */ nativeIndexForMenuRow:count:; // IMP 0x3d75a0
- /* v24@0:8@16 */ refreshWithItems:; // IMP 0x3d75c4
- /* v16@0:8 */ layoutSubviews; // IMP 0x3d8e30
- /* v24@0:8@16 */ optionPressBegan:; // IMP 0x3db840
- /* v24@0:8@16 */ optionPressEnded:; // IMP 0x3db8a0
- /* v24@0:8B16B20 */ setMenuVisible:animated:; // IMP 0x3db8ec
- /* v28@0:8B16B20B24 */ setOverlayDisplayed:animated:interactive:; // IMP 0x3dbdd8
- /* v24@0:8B16B20 */ setOverlayDisplayed:animated:; // IMP 0x3dc1dc
- /* B24@0:8@16 */ gestureRecognizerShouldBegin:; // IMP 0x3dc1ec
- /* v24@0:8@16 */ modeTapped:; // IMP 0x3dc294
- /* v24@0:8@16 */ modePanned:; // IMP 0x3dc308
- /* v24@0:8@16 */ searchPanned:; // IMP 0x3dc5b4
- /* v24@0:8@16 */ optionTapped:; // IMP 0x3dc860
- /* v24@0:8@16 */ overlayTapped:; // IMP 0x3dc8d8
- /* q32@0:8{CGPoint=dd}16 */ optionIndexAtPointInMenu:; // IMP 0x3dcb00
- /* q24@0:8@16 */ optionIndexAtGesture:; // IMP 0x3dce14
- /* q24@0:8@16 */ optionIndexAtTouch:; // IMP 0x3dcec0
- /* q32@0:8{CGPoint=dd}16 */ optionIndexAtOverlayPoint:; // IMP 0x3dcfa0
- /* v16@0:8 */ updateOptionHighlights; // IMP 0x3dd034
- /* v32@0:8@16@24 */ touchesBegan:withEvent:; // IMP 0x3dd404
- /* v32@0:8@16@24 */ touchesMoved:withEvent:; // IMP 0x3dd5a8
- /* v32@0:8@16@24 */ touchesEnded:withEvent:; // IMP 0x3dd6b0
- /* v32@0:8@16@24 */ touchesCancelled:withEvent:; // IMP 0x3dd83c
- /* v24@0:8@16 */ modeLongPressed:; // IMP 0x3dd908
- /* v24@0:8Q16 */ selectIndex:; // IMP 0x3ddac0
- /* @16@0:8 */ tabBar; // IMP 0x3df6e0
- /* v24@0:8@16 */ setTabBar:; // IMP 0x3df714
- /* @16@0:8 */ items; // IMP 0x3df728
- /* v24@0:8@16 */ setItems:; // IMP 0x3df738
- /* @16@0:8 */ searchControl; // IMP 0x3df744
- /* v24@0:8@16 */ setSearchControl:; // IMP 0x3df754
- /* @16@0:8 */ searchPanGesture; // IMP 0x3df768
- /* v24@0:8@16 */ setSearchPanGesture:; // IMP 0x3df778
- /* @16@0:8 */ searchGlass; // IMP 0x3df78c
- /* v24@0:8@16 */ setSearchGlass:; // IMP 0x3df79c
- /* @16@0:8 */ searchIconView; // IMP 0x3df7b0
- /* v24@0:8@16 */ setSearchIconView:; // IMP 0x3df7c0
- /* @16@0:8 */ searchLabel; // IMP 0x3df7d4
- /* v24@0:8@16 */ setSearchLabel:; // IMP 0x3df7e4
- /* @16@0:8 */ modeButton; // IMP 0x3df7f8
- /* v24@0:8@16 */ setModeButton:; // IMP 0x3df808
- /* @16@0:8 */ modeGlass; // IMP 0x3df81c
- /* v24@0:8@16 */ setModeGlass:; // IMP 0x3df82c
- /* @16@0:8 */ modeIconView; // IMP 0x3df840
- /* v24@0:8@16 */ setModeIconView:; // IMP 0x3df850
- /* @16@0:8 */ modeBadgeDotView; // IMP 0x3df864
- /* v24@0:8@16 */ setModeBadgeDotView:; // IMP 0x3df874
- /* @16@0:8 */ modeBadgeLabel; // IMP 0x3df888
- /* v24@0:8@16 */ setModeBadgeLabel:; // IMP 0x3df898
- /* @16@0:8 */ menuView; // IMP 0x3df8ac
- /* v24@0:8@16 */ setMenuView:; // IMP 0x3df8bc
- /* @16@0:8 */ menuGlass; // IMP 0x3df8d0
- /* v24@0:8@16 */ setMenuGlass:; // IMP 0x3df8e0
- /* @16@0:8 */ menuMaterialView; // IMP 0x3df8f4
- /* v24@0:8@16 */ setMenuMaterialView:; // IMP 0x3df904
- /* @16@0:8 */ optionButtons; // IMP 0x3df918
- /* v24@0:8@16 */ setOptionButtons:; // IMP 0x3df928
- /* q16@0:8 */ highlightedIndex; // IMP 0x3df93c
- /* v24@0:8q16 */ setHighlightedIndex:; // IMP 0x3df94c
- /* B16@0:8 */ menuVisible; // IMP 0x3df95c
- /* v20@0:8B16 */ setMenuVisible:; // IMP 0x3df96c
- /* B16@0:8 */ selectingIndex; // IMP 0x3df97c
- /* v20@0:8B16 */ setSelectingIndex:; // IMP 0x3df98c
- /* B16@0:8 */ menuTouchActive; // IMP 0x3df99c
- /* v20@0:8B16 */ setMenuTouchActive:; // IMP 0x3df9ac
- /* B16@0:8 */ modePanActive; // IMP 0x3df9bc
- /* v20@0:8B16 */ setModePanActive:; // IMP 0x3df9cc
- /* B16@0:8 */ searchPanActive; // IMP 0x3df9dc
- /* v20@0:8B16 */ setSearchPanActive:; // IMP 0x3df9ec
- /* B16@0:8 */ menuAnchoredToSearch; // IMP 0x3df9fc
- /* v20@0:8B16 */ setMenuAnchoredToSearch:; // IMP 0x3dfa0c
- /* q16@0:8 */ lastFeedbackHighlightedIndex; // IMP 0x3dfa1c
- /* v24@0:8q16 */ setLastFeedbackHighlightedIndex:; // IMP 0x3dfa2c
- /* B16@0:8 */ overlayDisplayed; // IMP 0x3dfa3c
- /* v20@0:8B16 */ setOverlayDisplayed:; // IMP 0x3dfa4c
- /* B16@0:8 */ overlayInteractionsEnabled; // IMP 0x3dfa5c
- /* v20@0:8B16 */ setOverlayInteractionsEnabled:; // IMP 0x3dfa6c
- /* B16@0:8 */ hasStableTabFrame; // IMP 0x3dfa7c
- /* v20@0:8B16 */ setHasStableTabFrame:; // IMP 0x3dfa8c
- /* {CGRect={CGPoint=dd}{CGSize=dd}}16@0:8 */ stableTabFrame; // IMP 0x3dfa9c
- /* v48@0:8{CGRect={CGPoint=dd}{CGSize=dd}}16 */ setStableTabFrame:; // IMP 0x3dfab4
- /* v16@0:8 */ .cxx_destruct; // IMP 0x3dfacc
@end

@interface WCLGTextEditorViewController /* VM 0x4da538 */
- /* v16@0:8 */ dealloc; // IMP 0x3e5874
- /* @48@0:8@16@24@32@?40 */ initWithTitle:text:placeholder:handler:; // IMP 0x3e58f0
- /* v16@0:8 */ viewDidLoad; // IMP 0x3e5a50
- /* v16@0:8 */ viewDidLayoutSubviews; // IMP 0x3e60e8
- /* v16@0:8 */ layoutTextEditorViews; // IMP 0x3e613c
- /* v20@0:8B16 */ viewDidAppear:; // IMP 0x3e63ac
- /* v24@0:8@16 */ keyboardFrameChanged:; // IMP 0x3e6420
- /* v16@0:8 */ saveTapped; // IMP 0x3e66f4
- /* @16@0:8 */ initialText; // IMP 0x3e680c
- /* v24@0:8@16 */ setInitialText:; // IMP 0x3e681c
- /* @16@0:8 */ placeholderText; // IMP 0x3e6828
- /* v24@0:8@16 */ setPlaceholderText:; // IMP 0x3e6838
- /* @?16@0:8 */ saveHandler; // IMP 0x3e6844
- /* v24@0:8@?16 */ setSaveHandler:; // IMP 0x3e6854
- /* @16@0:8 */ textView; // IMP 0x3e6860
- /* v24@0:8@16 */ setTextView:; // IMP 0x3e6870
- /* @16@0:8 */ hintLabel; // IMP 0x3e6884
- /* v24@0:8@16 */ setHintLabel:; // IMP 0x3e6894
- /* d16@0:8 */ keyboardOverlap; // IMP 0x3e68a8
- /* v24@0:8d16 */ setKeyboardOverlap:; // IMP 0x3e68b8
- /* v16@0:8 */ .cxx_destruct; // IMP 0x3e68c8
@end

@interface WCLGSettingsViewController /* VM 0x4da588 */
- /* @16@0:8 */ init; // IMP 0x3e6958
- /* @24@0:8q16 */ initWithPanel:; // IMP 0x3e6968
- /* v16@0:8 */ wclgDismissModal; // IMP 0x3e69f4
- /* B16@0:8 */ isDarkMode; // IMP 0x3e6e3c
- /* @16@0:8 */ cellBackgroundColor; // IMP 0x3e6e90
- /* @16@0:8 */ primaryTextColor; // IMP 0x3e6f04
- /* @16@0:8 */ secondaryTextColor; // IMP 0x3e6f7c
- /* @20@0:8B16 */ authorizationCellBackgroundColorForAllowed:; // IMP 0x3e6ff4
- /* v28@0:8@16B24 */ applyAuthorizationBackgroundToCell:allowed:; // IMP 0x3e70e0
- /* @16@0:8 */ gradientColorsA; // IMP 0x3e71cc
- /* @16@0:8 */ gradientColorsB; // IMP 0x3e7440
- /* v16@0:8 */ setupBackground; // IMP 0x3e76b8
- /* v16@0:8 */ refreshBackground; // IMP 0x3e7e8c
- /* v16@0:8 */ startBackgroundAnimations; // IMP 0x3e8158
- /* {CGRect={CGPoint=dd}{CGSize=dd}}16@0:8 */ tableFrameForCurrentBounds; // IMP 0x3e86d8
- /* v16@0:8 */ layoutSettingsTableForCurrentBounds; // IMP 0x3e87b8
- /* v16@0:8 */ viewDidLoad; // IMP 0x3e8aa8
- /* v20@0:8B16 */ viewWillAppear:; // IMP 0x3e935c
- /* v20@0:8B16 */ viewDidAppear:; // IMP 0x3e9618
- /* v16@0:8 */ viewDidLayoutSubviews; // IMP 0x3e97dc
- /* v24@0:8@16 */ traitCollectionDidChange:; // IMP 0x3e9850
- /* v16@0:8 */ refreshRootEdgeFadeMaskFrame; // IMP 0x3e99c0
- /* v20@0:8B16 */ suppressRootNativeEdgeEffectsRecursively:; // IMP 0x3e9b98
- /* v16@0:8 */ refreshRootEdgeFades; // IMP 0x3eac34
- /* v24@0:8@16 */ scrollViewDidScroll:; // IMP 0x3ebdc8
- /* v16@0:8 */ dismissSettings; // IMP 0x3ebeb8
- /* @24@0:8q16 */ titleForPanel:; // IMP 0x3ebfd4
- /* @24@0:8d16 */ headerViewWithWidth:; // IMP 0x3ecf5c
- /* q24@0:8@16 */ numberOfSectionsInTableView:; // IMP 0x3edab8
- /* q32@0:8@16q24 */ tableView:numberOfRowsInSection:; // IMP 0x3edb9c
- /* B32@0:8@16@24 */ tableView:canEditRowAtIndexPath:; // IMP 0x3edfa0
- /* q32@0:8@16@24 */ tableView:editingStyleForRowAtIndexPath:; // IMP 0x3ee010
- /* B32@0:8@16@24 */ tableView:shouldIndentWhileEditingRowAtIndexPath:; // IMP 0x3ee018
- /* B32@0:8@16@24 */ tableView:canMoveRowAtIndexPath:; // IMP 0x3ee020
- /* @40@0:8@16@24@32 */ tableView:targetIndexPathForMoveFromRowAtIndexPath:toProposedIndexPath:; // IMP 0x3ee090
- /* v40@0:8@16@24@32 */ tableView:moveRowAtIndexPath:toIndexPath:; // IMP 0x3ee148
- /* @32@0:8@16q24 */ tableView:titleForHeaderInSection:; // IMP 0x3ee2b0
- /* d32@0:8@16q24 */ tableView:heightForHeaderInSection:; // IMP 0x3eef5c
- /* @32@0:8@16q24 */ tableView:titleForFooterInSection:; // IMP 0x3eefb4
- /* d32@0:8@16q24 */ tableView:heightForFooterInSection:; // IMP 0x3f187c
- /* d24@0:8@16 */ rootFooterHeightForTableView:; // IMP 0x3f1bdc
- /* @32@0:8@16q24 */ tableView:viewForFooterInSection:; // IMP 0x3f1cdc
- /* d32@0:8@16@24 */ tableView:heightForRowAtIndexPath:; // IMP 0x3f23e4
- /* @24@0:8@16 */ preparedSettingsCellForTableView:; // IMP 0x3f25f8
- /* v64@0:8@16@24@32@40q48B56B60 */ configureSwitchCell:switch:title:detail:tag:on:enabled:; // IMP 0x3f2d98
- /* v44@0:8@16@24@32B40 */ configurePickerCell:title:detail:enabled:; // IMP 0x3f2f44
- /* v60@0:8@16@24@32q40q48B56 */ configureSegmentedCell:title:items:selectedIndex:tag:enabled:; // IMP 0x3f30d0
- /* @24@0:8d16 */ tabBarIconOffsetDisplayValue:; // IMP 0x3f338c
- /* @24@0:8q16 */ tabBarAdjustmentModeTitle:; // IMP 0x3f34bc
- /* @32@0:8q16@24 */ tabBarIconOffsetDetailForMode:axis:; // IMP 0x3f3570
- /* @24@0:8q16 */ tabBarIconSpacingDetailForMode:; // IMP 0x3f3a34
- /* v44@0:8@16@24d32B40 */ configureTabBarIconOffsetCell:axis:value:enabled:; // IMP 0x3f3ca4
- /* @24@0:8d16 */ tabBarIconScaleDisplayValue:; // IMP 0x3f4594
- /* v36@0:8@16d24B32 */ configureTabBarIconScaleCell:value:enabled:; // IMP 0x3f4660
- /* @32@0:8d16@24 */ homeTextMetricDisplayValue:suffix:; // IMP 0x3f4f00
- /* v80@0:8@16@24@32d40d48d56d64q72 */ configureHomeTextMetricCell:title:detail:value:minimum:maximum:step:tag:; // IMP 0x3f5094
- /* @24@0:8@16 */ displayNameForHomeCardID:; // IMP 0x3f54a4
- /* v88@0:8@16@24@32d40d48d56d64@72q80 */ configureFuncCardStepperCell:title:detail:value:minimum:maximum:step:suffix:tag:; // IMP 0x3f595c
- /* @92@0:8{CGRect={CGPoint=dd}{CGSize=dd}}16@48@56@64q72B80@84 */ rootCardWithFrame:title:detail:symbol:tag:enabled:switchView:; // IMP 0x3f5db8
- /* @32@0:8@16@24 */ rootGridCellForTableView:indexPath:; // IMP 0x3f681c
- /* @32@0:8@16@24 */ tableView:cellForRowAtIndexPath:; // IMP 0x3f9a34
- /* v16@0:8 */ showOfficialAccountAlert; // IMP 0x416a58
- /* B16@0:8 */ officialAccountReadyForAction; // IMP 0x416d44
- /* v16@0:8 */ reconcileDependentFeatureSwitches; // IMP 0x416db4
- /* v16@0:8 */ promptRestartForLiquidToggle; // IMP 0x417090
- /* v52@0:8@16@24@32B40B44B48 */ applySMSIconVariantSegment:enabledKey:weightKey:refreshWindows:refreshTopMorphActions:refreshSMSBackChevron:; // IMP 0x4174f0
- /* v24@0:8@16 */ segmentedControlChanged:; // IMP 0x417648
- /* v24@0:8@16 */ toggleSwitch:; // IMP 0x41805c
- /* v24@0:8@16 */ tabBarIconOffsetStepperChanged:; // IMP 0x41b6f4
- /* v24@0:8@16 */ tabBarIconScaleStepperChanged:; // IMP 0x41b908
- /* v24@0:8@16 */ homeTextMetricStepperChanged:; // IMP 0x41ba94
- /* v24@0:8@16 */ funcCardStepperChanged:; // IMP 0x41c6d4
- /* v16@0:8 */ openReleasePage; // IMP 0x41caa4
- /* v16@0:8 */ promptAddHomeGroup; // IMP 0x41cb4c
- /* v24@0:8@16 */ promptRenameHomeGroup:; // IMP 0x41d044
- /* v32@0:8@16q24 */ presentHomeGroupActionsForGroup:atDisplayIndex:; // IMP 0x41d5e8
- /* v36@0:8@16d24B32 */ configureHomeGroupsOffsetSliderCell:value:enabled:; // IMP 0x41e67c
- /* v24@0:8@16 */ homeGroupsOffsetSliderChanged:; // IMP 0x41ec48
- /* v24@0:8@16 */ homeGroupsOffsetSliderDone:; // IMP 0x41f020
- /* v52@0:8@16@24@32q40B48 */ configureChatBubbleCompactGapSliderCell:title:key:value:enabled:; // IMP 0x41f0a4
- /* v52@0:8@16@24@32q40B48 */ configureChatIndentSliderCell:title:key:value:enabled:; // IMP 0x41f45c
- /* v68@0:8@16@24@32q40q48q56B64 */ configureAvatarCardSliderCell:title:key:value:minimum:maximum:enabled:; // IMP 0x41f81c
- /* v24@0:8@16 */ chatBubbleCompactGapSliderChanged:; // IMP 0x41fbe0
- /* v24@0:8@16 */ chatBubbleCompactGapSliderDone:; // IMP 0x41fe00
- /* v52@0:8@16@24@32q40B48 */ configureAvatarScaleSliderCell:title:key:value:enabled:; // IMP 0x420028
- /* v24@0:8@16 */ avatarScaleSliderChanged:; // IMP 0x4203e4
- /* v24@0:8@16 */ avatarScaleSliderDone:; // IMP 0x4205f8
- /* v16@0:8 */ wclgPresentSingleBubblePositionPicker; // IMP 0x4206e4
- /* v16@0:8 */ wclgPresentBubblePackPicker; // IMP 0x420ef0
- /* @24@0:8@16 */ wclgBubbleActionThumbnailForName:; // IMP 0x422018
- /* v32@0:8@16@24 */ wclgAttachBubbleThumbnailForName:toAction:; // IMP 0x4223f0
- /* v24@0:8B16B20 */ wclgPresentBubbleRolePickerSender:dark:; // IMP 0x422530
- /* v60@0:8@16@24@32@40q48B56 */ configureMergeInsetSliderCell:title:detail:key:value:enabled:; // IMP 0x4236c0
- /* v24@0:8@16 */ mergeInsetSliderChanged:; // IMP 0x423c30
- /* v24@0:8@16 */ mergeInsetSliderDone:; // IMP 0x423dc4
- /* v36@0:8@16d24B32 */ configureHomeGroupsGapSliderCell:value:enabled:; // IMP 0x423eb0
- /* v24@0:8@16 */ homeGroupsGapSliderChanged:; // IMP 0x424478
- /* v24@0:8@16 */ homeGroupsGapSliderDone:; // IMP 0x424874
- /* v36@0:8@16d24B32 */ configureHomeGroupsWidthSliderCell:value:enabled:; // IMP 0x4248f8
- /* v24@0:8@16 */ homeGroupsWidthSliderChanged:; // IMP 0x424ef0
- /* v24@0:8@16 */ homeGroupsWidthSliderDone:; // IMP 0x4252fc
- /* v36@0:8@16d24B32 */ configureHomeGroupsStripFontSliderCell:value:enabled:; // IMP 0x425380
- /* v24@0:8@16 */ homeGroupsStripFontSliderChanged:; // IMP 0x425768
- /* v24@0:8@16 */ homeGroupsStripFontSliderDone:; // IMP 0x42599c
- /* v36@0:8@16d24B32 */ configureHomeGroupsStripWidthSliderCell:value:enabled:; // IMP 0x425a24
- /* v24@0:8@16 */ homeGroupsStripWidthSliderChanged:; // IMP 0x425e1c
- /* v24@0:8@16 */ homeGroupsStripWidthSliderDone:; // IMP 0x426044
- /* v36@0:8@16d24B32 */ configureHomeGroupsStripOffsetSliderCell:value:enabled:; // IMP 0x4260c8
- /* v24@0:8@16 */ homeGroupsStripOffsetSliderChanged:; // IMP 0x426670
- /* v24@0:8@16 */ homeGroupsStripOffsetSliderDone:; // IMP 0x426a48
- /* @16@0:8 */ wclgDefaultExpandedGroupName; // IMP 0x426acc
- /* v16@0:8 */ presentHomeGroupsFullscreenEdgePicker; // IMP 0x426db4
- /* @16@0:8 */ wclgFullscreenDefaultGroupName; // IMP 0x4276cc
- /* v16@0:8 */ presentHomeGroupsFullscreenDefaultGroupPicker; // IMP 0x427a2c
- /* v16@0:8 */ presentHomeGroupsDefaultExpandedPicker; // IMP 0x42868c
- /* v24@0:8q16 */ presentHomeGroupsDefaultActionsAtIndex:; // IMP 0x42912c
- /* v64@0:8@16@24@32@?40d48@?56 */ presentHomeListCardValuePickerWithTitle:message:options:optionTitler:currentValue:onPick:; // IMP 0x429b48
- /* v36@0:8@16d24B32 */ configureHomeListCardInsetSliderCell:value:enabled:; // IMP 0x42a160
- /* v24@0:8@16 */ homeListCardInsetSliderChanged:; // IMP 0x42a5b8
- /* v24@0:8@16 */ homeListCardInsetSliderDone:; // IMP 0x42a884
- /* v52@0:8@16@24d32@40B48 */ configureHomeCardCornerSliderCell:title:value:key:enabled:; // IMP 0x42a940
- /* v24@0:8@16 */ homeCardCornerSliderChanged:; // IMP 0x42ad7c
- /* v24@0:8@16 */ homeCardCornerSliderDone:; // IMP 0x42aff8
- /* v16@0:8 */ presentHomeListCardGapPicker; // IMP 0x42b10c
- /* v16@0:8 */ pushHomeListCardColorPicker; // IMP 0x42b6b4
- /* v16@0:8 */ presentHomeGroupsTextColorPicker; // IMP 0x42ba48
- /* v20@0:8B16 */ pushHomeGroupsPillColorPickerSelected:; // IMP 0x42cbb8
- /* v16@0:8 */ presentHomeGroupsBadgeColorPicker; // IMP 0x42cf94
- /* v16@0:8 */ pushHomeGroupsStripSelectedColorPicker; // IMP 0x42d2dc
- /* v16@0:8 */ presentHomePinnedBadgeColorPicker; // IMP 0x42d61c
- /* v24@0:8@16 */ presentHomeGroupMembersForGroupID:; // IMP 0x42d8e8
- /* v24@0:8@16 */ rootCardTapped:; // IMP 0x42e0dc
- /* v16@0:8 */ pushHomeTextContentEditor; // IMP 0x42e32c
- /* v16@0:8 */ pushFunctionCardHTMLEditor; // IMP 0x42e814
- /* v16@0:8 */ pushFunctionCardCodeLibrary; // IMP 0x42ed6c
- /* v16@0:8 */ pushFunctionCardURLEditor; // IMP 0x42efe0
- /* v56@0:8@16@24@32q40q48 */ pushHomeCapsulePinnedColorPickerTitle:lightKey:darkKey:lightMode:darkMode:; // IMP 0x42f584
- /* v32@0:8@16@24 */ pushFunctionCardColorPickerKey:title:; // IMP 0x42f818
- /* v16@0:8 */ pushVoiceWaveColorPicker; // IMP 0x42fa98
- /* v16@0:8 */ pushHomeTextFontSizesEditor; // IMP 0x42fdc4
- /* v16@0:8 */ pushHomeTextFontWeightsEditor; // IMP 0x430808
- /* v16@0:8 */ pushSearchTabBarPlaceholderEditor; // IMP 0x4312dc
- /* v16@0:8 */ presentSearchTabBarBadgeColorPicker; // IMP 0x43193c
- /* v16@0:8 */ pushChatBottomPlaceholderEditor; // IMP 0x431e04
- /* v48@0:8q16@24@32q40 */ pushHomeTextColorPickerWithPurpose:key:darkKey:defaultMode:; // IMP 0x4323f4
- /* v16@0:8 */ pushPaymentBubbleTextColorPicker; // IMP 0x4326e0
- /* v40@0:8@16@24@32 */ pushAvatarCardColorPickerTitle:lightKey:darkKey:; // IMP 0x432a0c
- /* v20@0:8B16 */ promptAvatarCardTimeFormatForSelf:; // IMP 0x432d00
- /* v20@0:8B16 */ pushChatTextColorPickerForSend:; // IMP 0x433d64
- /* v16@0:8 */ pushChatBottomSMSSendColorPicker; // IMP 0x4341f0
- /* v16@0:8 */ wclgPromptChatTopCapsuleSubtitle; // IMP 0x434470
- /* v16@0:8 */ pushSMSBottomBarIconColorPicker; // IMP 0x434ca4
- /* v28@0:8q16B24 */ openImagePickerWithPurpose:allowsEditing:; // IMP 0x434f20
- /* v16@0:8 */ openChatBottomTGAvatarImagePicker; // IMP 0x435208
- /* v20@0:8B16 */ openHomePinnedMaskImagePickerForDark:; // IMP 0x43521c
- /* v20@0:8B16 */ openHomePinnedMaskDocumentPickerForDark:; // IMP 0x435238
- /* v32@0:8@16@24 */ documentPicker:didPickDocumentsAtURLs:; // IMP 0x4354a0
- /* v16@0:8 */ presentHomePinnedMaskPicker; // IMP 0x435a88
- /* v20@0:8B16 */ openChatWallpaperImagePickerForDarkMode:; // IMP 0x436a18
- /* v20@0:8B16 */ openHomeWallpaperImagePickerForDarkMode:; // IMP 0x436a34
- /* v16@0:8 */ presentChatBottomTGAvatarPicker; // IMP 0x436a50
- /* v20@0:8B16 */ presentChatWallpaperPickerForDarkMode:; // IMP 0x4371f8
- /* v20@0:8B16 */ presentHomeWallpaperPickerForDarkMode:; // IMP 0x437a38
- /* v16@0:8 */ refreshLibraryFooter; // IMP 0x4382cc
- /* @40@0:8d16@24@32 */ buildImageLibraryFooterWithWidth:category:title:; // IMP 0x438640
- /* @16@0:8 */ currentLibraryCategory; // IMP 0x439950
- /* v24@0:8@16 */ presentMultiPhotoPickerForLibraryCategory:; // IMP 0x4399cc
- /* v24@0:8@16 */ presentMultiDocumentPickerForLibraryCategory:; // IMP 0x439cc4
- /* v32@0:8q16@24 */ finishLibraryBatchAdd:category:; // IMP 0x439f00
- /* v32@0:8@16@24 */ picker:didFinishPicking:; // IMP 0x439f84
- /* v24@0:8@16 */ imageLibraryAddTapped:; // IMP 0x43a384
- /* v24@0:8@16 */ imageLibraryThumbTapped:; // IMP 0x43aa54
- /* v32@0:8@16@24 */ presentSubtitleIconLibraryActionsForItem:sourceView:; // IMP 0x43ac00
- /* v32@0:8@16@24 */ presentWallpaperHistoryActionsForItem:sourceView:; // IMP 0x43b320
- /* v32@0:8@16@24 */ presentAvatarLibraryActionsForItem:sourceView:; // IMP 0x43bec4
- /* v16@0:8 */ afterImageLibraryChanged; // IMP 0x43c38c
- /* @32@0:8@16d24 */ roundedThumbForImage:side:; // IMP 0x43c3f4
- /* @24@0:8@16 */ displayNameForWxid:; // IMP 0x43c59c
- /* v32@0:8@16@24 */ configureAvatarUserCell:wxid:; // IMP 0x43ceb0
- /* v32@0:8q16@24 */ handleAvatarReplaceSelectionAtRow:sourceView:; // IMP 0x43d1f8
- /* v32@0:8@16@24 */ imagePickerController:didFinishPickingMediaWithInfo:; // IMP 0x43d578
- /* v24@0:8@16 */ imagePickerControllerDidCancel:; // IMP 0x43dd88
- /* v32@0:8@16@24 */ tableView:didSelectRowAtIndexPath:; // IMP 0x43ddf4
- /* v16@0:8 */ pushTabBarRightSearchSizePicker; // IMP 0x44093c
- /* v16@0:8 */ pushSearchTabBarSizePicker; // IMP 0x441060
- /* v20@0:8B16 */ pushColorPickerOutgoing:; // IMP 0x441854
- /* v20@0:8B16 */ pushFlowColorPickerStart:; // IMP 0x441b24
- /* v20@0:8B16 */ pushChatTopMorphDefaultPickerForGroup:; // IMP 0x441e04
- /* v16@0:8 */ pushBottomGlassModePicker; // IMP 0x442658
- /* v16@0:8 */ pushGlassSizePicker; // IMP 0x44298c
- /* v16@0:8 */ showAdminContactAlert; // IMP 0x442cc0
- /* @16@0:8 */ tableView; // IMP 0x442f70
- /* v24@0:8@16 */ setTableView:; // IMP 0x442f80
- /* @16@0:8 */ backgroundContainer; // IMP 0x442f94
- /* v24@0:8@16 */ setBackgroundContainer:; // IMP 0x442fa4
- /* @16@0:8 */ backgroundGradientA; // IMP 0x442fb8
- /* v24@0:8@16 */ setBackgroundGradientA:; // IMP 0x442fc8
- /* @16@0:8 */ backgroundGradientB; // IMP 0x442fdc
- /* v24@0:8@16 */ setBackgroundGradientB:; // IMP 0x442fec
- /* q16@0:8 */ panel; // IMP 0x443000
- /* v24@0:8q16 */ setPanel:; // IMP 0x443010
- /* B16@0:8 */ rootTableRevealed; // IMP 0x443020
- /* v20@0:8B16 */ setRootTableRevealed:; // IMP 0x443030
- /* @16@0:8 */ rootTopFadeView; // IMP 0x443040
- /* v24@0:8@16 */ setRootTopFadeView:; // IMP 0x443050
- /* @16@0:8 */ rootBottomFadeView; // IMP 0x443064
- /* v24@0:8@16 */ setRootBottomFadeView:; // IMP 0x443074
- /* @16@0:8 */ rootEdgeFadeMask; // IMP 0x443088
- /* v24@0:8@16 */ setRootEdgeFadeMask:; // IMP 0x443098
- /* v16@0:8 */ .cxx_destruct; // IMP 0x4430ac
@end

@interface WCLGTabBarVisualHostView /* VM 0x4da600 */
@end

@interface WCLGGetButton /* VM 0x4da628 */
- /* @48@0:8{CGRect={CGPoint=dd}{CGSize=dd}}16 */ initWithFrame:; // IMP 0x45779c
- /* v32@0:8@16@24 */ setIdleTitle:icon:; // IMP 0x4580ac
- /* v20@0:8B16 */ setDownloading:; // IMP 0x4581c0
- /* v24@0:8d16 */ setProgress:; // IMP 0x458324
- /* v16@0:8 */ layoutSubviews; // IMP 0x4583e0
- /* v16@0:8 */ tapped; // IMP 0x45876c
- /* @?16@0:8 */ onTap; // IMP 0x458814
- /* v24@0:8@?16 */ setOnTap:; // IMP 0x458824
- /* @16@0:8 */ pill; // IMP 0x458830
- /* v24@0:8@16 */ setPill:; // IMP 0x458840
- /* @16@0:8 */ pillIcon; // IMP 0x458854
- /* v24@0:8@16 */ setPillIcon:; // IMP 0x458864
- /* @16@0:8 */ pillLabel; // IMP 0x458878
- /* v24@0:8@16 */ setPillLabel:; // IMP 0x458888
- /* @16@0:8 */ track; // IMP 0x45889c
- /* v24@0:8@16 */ setTrack:; // IMP 0x4588ac
- /* @16@0:8 */ ring; // IMP 0x4588c0
- /* v24@0:8@16 */ setRing:; // IMP 0x4588d0
- /* @16@0:8 */ stopSquare; // IMP 0x4588e4
- /* v24@0:8@16 */ setStopSquare:; // IMP 0x4588f4
- /* B16@0:8 */ downloading; // IMP 0x458908
- /* v16@0:8 */ .cxx_destruct; // IMP 0x458918
@end

@interface WCLGImageZoom /* VM 0x4da678 */
- /* @24@0:8@16 */ initWithImage:; // IMP 0x4589d0
- /* v16@0:8 */ viewDidLoad; // IMP 0x458a5c
- /* @24@0:8@16 */ viewForZoomingInScrollView:; // IMP 0x458f70
- /* v24@0:8@16 */ doubleTap:; // IMP 0x458f7c
- /* v16@0:8 */ dismissSelf; // IMP 0x459024
- /* @16@0:8 */ image; // IMP 0x459038
- /* v24@0:8@16 */ setImage:; // IMP 0x459048
- /* @16@0:8 */ scroll; // IMP 0x45905c
- /* v24@0:8@16 */ setScroll:; // IMP 0x45906c
- /* @16@0:8 */ imageView; // IMP 0x459080
- /* v24@0:8@16 */ setImageView:; // IMP 0x459090
- /* v16@0:8 */ .cxx_destruct; // IMP 0x4590a4
@end

@interface WCLGThemeDetailViewController /* VM 0x4da6c8 */
- /* @32@0:8@16@?24 */ initWithTheme:download:; // IMP 0x45910c
- /* v16@0:8 */ dealloc; // IMP 0x4591c8
- /* v16@0:8 */ viewDidLoad; // IMP 0x459230
- /* @16@0:8 */ stateTitle; // IMP 0x459594
- /* @16@0:8 */ stateIcon; // IMP 0x45985c
- /* v16@0:8 */ buildContent; // IMP 0x459ff8
- /* d40@0:8d16d24d32 */ addSubPackagesAtY:width:pad:; // IMP 0x45be74
- /* v24@0:8@16 */ subPackageTapped:; // IMP 0x45cdc0
- /* v16@0:8 */ wclgDismissModal; // IMP 0x45cfb4
- /* d40@0:8d16d24d32 */ addLiveCardPreviewAtY:width:pad:; // IMP 0x45cfc8
- /* v24@0:8d16 */ layoutLiveCardPreviewForWidth:; // IMP 0x45dd04
- /* v16@0:8 */ viewDidLayoutSubviews; // IMP 0x45e0d0
- /* v16@0:8 */ loadLiveCardPreview; // IMP 0x45e1ac
- /* v32@0:8@16Q24 */ renderLiveCardPreviewHTML:generation:; // IMP 0x45e9cc
- /* v40@0:8@16@24@?32 */ webView:decidePolicyForNavigationAction:decisionHandler:; // IMP 0x45eda8
- /* v32@0:8@16@24 */ webView:didFinishNavigation:; // IMP 0x45f1b4
- /* v40@0:8@16@24@32 */ webView:didFailNavigation:withError:; // IMP 0x45f2b8
- /* v40@0:8@16@24@32 */ webView:didFailProvisionalNavigation:withError:; // IMP 0x45f2d0
- /* v40@0:8@16@24@32 */ showCardPreviewNavigationError:navigation:inWebView:; // IMP 0x45f2e8
- /* v24@0:8@16 */ traitCollectionDidChange:; // IMP 0x45f7a8
- /* d40@0:8d16d24d32 */ addSeparatorAtY:width:pad:; // IMP 0x45f874
- /* v24@0:8@16 */ previewTapped:; // IMP 0x45f978
- /* v16@0:8 */ startDownload; // IMP 0x45fa90
- /* v16@0:8 */ primaryButtonTapped; // IMP 0x4607cc
- /* @24@0:8d16 */ percentText:; // IMP 0x460eb4
- /* @24@0:8d16 */ speedText:; // IMP 0x460f7c
- /* v24@0:8@16 */ toast:; // IMP 0x46117c
- /* @16@0:8 */ theme; // IMP 0x46120c
- /* v24@0:8@16 */ setTheme:; // IMP 0x46121c
- /* @?16@0:8 */ downloadHandler; // IMP 0x461230
- /* v24@0:8@?16 */ setDownloadHandler:; // IMP 0x461240
- /* @16@0:8 */ bg; // IMP 0x46124c
- /* v24@0:8@16 */ setBg:; // IMP 0x46125c
- /* @16@0:8 */ scroll; // IMP 0x461270
- /* v24@0:8@16 */ setScroll:; // IMP 0x461280
- /* @16@0:8 */ getButton; // IMP 0x461294
- /* v24@0:8@16 */ setGetButton:; // IMP 0x4612a4
- /* @16@0:8 */ speedLabel; // IMP 0x4612b8
- /* v24@0:8@16 */ setSpeedLabel:; // IMP 0x4612c8
- /* B16@0:8 */ downloadedNow; // IMP 0x4612dc
- /* v20@0:8B16 */ setDownloadedNow:; // IMP 0x4612ec
- /* B16@0:8 */ readyToApply; // IMP 0x4612fc
- /* v20@0:8B16 */ setReadyToApply:; // IMP 0x46130c
- /* B16@0:8 */ appliedNow; // IMP 0x46131c
- /* v20@0:8B16 */ setAppliedNow:; // IMP 0x46132c
- /* @16@0:8 */ cardPreviewContainer; // IMP 0x46133c
- /* v24@0:8@16 */ setCardPreviewContainer:; // IMP 0x46134c
- /* @16@0:8 */ cardPreviewViewport; // IMP 0x461360
- /* v24@0:8@16 */ setCardPreviewViewport:; // IMP 0x461370
- /* @16@0:8 */ cardPreviewWebView; // IMP 0x461384
- /* v24@0:8@16 */ setCardPreviewWebView:; // IMP 0x461394
- /* @16@0:8 */ cardPreviewMediaController; // IMP 0x4613a8
- /* v24@0:8@16 */ setCardPreviewMediaController:; // IMP 0x4613b8
- /* @16@0:8 */ cardPreviewMediaScope; // IMP 0x4613cc
- /* v24@0:8@16 */ setCardPreviewMediaScope:; // IMP 0x4613dc
- /* @16@0:8 */ cardPreviewStatus; // IMP 0x4613e8
- /* v24@0:8@16 */ setCardPreviewStatus:; // IMP 0x4613f8
- /* @16@0:8 */ cardPreviewNavigation; // IMP 0x46140c
- /* v24@0:8@16 */ setCardPreviewNavigation:; // IMP 0x46141c
- /* Q16@0:8 */ cardPreviewGeneration; // IMP 0x461430
- /* v24@0:8Q16 */ setCardPreviewGeneration:; // IMP 0x461440
- /* d16@0:8 */ cardPreviewLayoutWidth; // IMP 0x461450
- /* v24@0:8d16 */ setCardPreviewLayoutWidth:; // IMP 0x461460
- /* v16@0:8 */ .cxx_destruct; // IMP 0x461470
@end

@interface WCLGThemeManageCell /* VM 0x4da718 */
- /* @32@0:8q16@24 */ initWithStyle:reuseIdentifier:; // IMP 0x4615a0
- /* v28@0:8@16B24 */ configureWithItem:active:; // IMP 0x462a3c
- /* v28@0:8@16B24 */ configureNoneForType:active:; // IMP 0x462f7c
- /* @16@0:8 */ themeIconView; // IMP 0x4635b0
- /* v24@0:8@16 */ setThemeIconView:; // IMP 0x4635c0
- /* @16@0:8 */ nameLabel; // IMP 0x4635d4
- /* v24@0:8@16 */ setNameLabel:; // IMP 0x4635e4
- /* @16@0:8 */ detailLabel; // IMP 0x4635f8
- /* v24@0:8@16 */ setDetailLabel:; // IMP 0x463608
- /* @16@0:8 */ activeLabel; // IMP 0x46361c
- /* v24@0:8@16 */ setActiveLabel:; // IMP 0x46362c
- /* @16@0:8 */ menuIconView; // IMP 0x463640
- /* v24@0:8@16 */ setMenuIconView:; // IMP 0x463650
- /* v16@0:8 */ .cxx_destruct; // IMP 0x463664
@end

@interface WCLGThemeManageViewController /* VM 0x4da768 */
- /* v16@0:8 */ viewDidLoad; // IMP 0x4636f4
- /* v20@0:8B16 */ viewWillAppear:; // IMP 0x464380
- /* v16@0:8 */ viewDidLayoutSubviews; // IMP 0x4643d4
- /* v16@0:8 */ reload; // IMP 0x46465c
- /* v16@0:8 */ loadCatalogIconsIfNeeded; // IMP 0x464adc
- /* v16@0:8 */ segChanged; // IMP 0x465034
- /* @16@0:8 */ current; // IMP 0x4650ac
- /* @16@0:8 */ currentType; // IMP 0x46513c
- /* q16@0:8 */ activeThemeId; // IMP 0x465290
- /* B24@0:8@16 */ isActiveItem:; // IMP 0x4652f0
- /* v16@0:8 */ updateCurrentStatus; // IMP 0x46537c
- /* v16@0:8 */ updateEmpty; // IMP 0x465688
- /* q32@0:8@16q24 */ tableView:numberOfRowsInSection:; // IMP 0x465720
- /* @32@0:8@16@24 */ tableView:cellForRowAtIndexPath:; // IMP 0x465770
- /* v32@0:8@16@24 */ tableView:didSelectRowAtIndexPath:; // IMP 0x465958
- /* v16@0:8 */ deactivateCurrentTheme; // IMP 0x465ac0
- /* v32@0:8@16@24 */ presentActionsForTheme:sourceView:; // IMP 0x465e88
- /* v24@0:8@16 */ confirmRevoke:; // IMP 0x466674
- /* v24@0:8@16 */ applyTheme:; // IMP 0x466da4
- /* v24@0:8@16 */ removeLocal:; // IMP 0x4670bc
- /* v24@0:8@16 */ revoke:; // IMP 0x467234
- /* v24@0:8@16 */ toast:; // IMP 0x467580
- /* v16@0:8 */ dismissSelf; // IMP 0x467610
- /* @16@0:8 */ seg; // IMP 0x467624
- /* v24@0:8@16 */ setSeg:; // IMP 0x467634
- /* @16@0:8 */ segBar; // IMP 0x467648
- /* v24@0:8@16 */ setSegBar:; // IMP 0x467658
- /* @16@0:8 */ currentLabel; // IMP 0x46766c
- /* v24@0:8@16 */ setCurrentLabel:; // IMP 0x46767c
- /* @16@0:8 */ bg; // IMP 0x467690
- /* v24@0:8@16 */ setBg:; // IMP 0x4676a0
- /* @16@0:8 */ tableView; // IMP 0x4676b4
- /* v24@0:8@16 */ setTableView:; // IMP 0x4676c4
- /* @16@0:8 */ emptyLabel; // IMP 0x4676d8
- /* v24@0:8@16 */ setEmptyLabel:; // IMP 0x4676e8
- /* @16@0:8 */ bubbles; // IMP 0x4676fc
- /* v24@0:8@16 */ setBubbles:; // IMP 0x46770c
- /* @16@0:8 */ cards; // IMP 0x467720
- /* v24@0:8@16 */ setCards:; // IMP 0x467730
- /* @16@0:8 */ catalogIconURLs; // IMP 0x467744
- /* v24@0:8@16 */ setCatalogIconURLs:; // IMP 0x467754
- /* B16@0:8 */ loadingCatalogIcons; // IMP 0x467760
- /* v20@0:8B16 */ setLoadingCatalogIcons:; // IMP 0x467770
- /* B16@0:8 */ catalogIconsLoaded; // IMP 0x467780
- /* v20@0:8B16 */ setCatalogIconsLoaded:; // IMP 0x467790
- /* v16@0:8 */ .cxx_destruct; // IMP 0x4677a0
@end

@interface WCLGVoiceWaveView /* VM 0x4da7b8 */
- /* @48@0:8{CGRect={CGPoint=dd}{CGSize=dd}}16 */ initWithFrame:; // IMP 0x46c034
- /* @24@0:8q16 */ wclgColorForStatus:; // IMP 0x46c4d8
- /* v16@0:8 */ wclgApplyColors; // IMP 0x46c5cc
- /* v16@0:8 */ dealloc; // IMP 0x46c7c0
- /* {CGRect={CGPoint=dd}{CGSize=dd}}16@0:8 */ wclgBarsArea; // IMP 0x46c828
- /* v16@0:8 */ layoutSubviews; // IMP 0x46c898
- /* v24@0:8@?16 */ wclgLayoutBarsWithProvider:; // IMP 0x46c980
- /* v24@0:8q16 */ setStatus:; // IMP 0x46cba4
- /* v24@0:8@16 */ setBaseColor:; // IMP 0x46cbcc
- /* v20@0:8B16 */ setLockColor:; // IMP 0x46cc30
- /* v16@0:8 */ startRecording; // IMP 0x46cc48
- /* v16@0:8 */ stopRecording; // IMP 0x46ce70
- /* v24@0:8@16 */ wclgTick:; // IMP 0x46cedc
- /* q16@0:8 */ status; // IMP 0x46d204
- /* @16@0:8 */ baseColor; // IMP 0x46d214
- /* B16@0:8 */ lockColor; // IMP 0x46d224
- /* @16@0:8 */ bars; // IMP 0x46d234
- /* v24@0:8@16 */ setBars:; // IMP 0x46d244
- /* @16@0:8 */ timeLabel; // IMP 0x46d258
- /* v24@0:8@16 */ setTimeLabel:; // IMP 0x46d268
- /* @16@0:8 */ link; // IMP 0x46d27c
- /* v24@0:8@16 */ setLink:; // IMP 0x46d28c
- /* d16@0:8 */ startTime; // IMP 0x46d2a0
- /* v24@0:8d16 */ setStartTime:; // IMP 0x46d2b0
- /* q16@0:8 */ lastWholeSecond; // IMP 0x46d2c0
- /* v24@0:8q16 */ setLastWholeSecond:; // IMP 0x46d2d0
- /* v16@0:8 */ .cxx_destruct; // IMP 0x46d2e0
@end
