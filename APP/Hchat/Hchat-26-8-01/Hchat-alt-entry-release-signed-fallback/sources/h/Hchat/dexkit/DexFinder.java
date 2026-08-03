package h.Hchat.dexkit;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class DexFinder {
    private static final java.lang.String CACHE_COMPLETE = "cache.complete";
    private static final java.lang.String CACHE_KEY = "cache.key";
    private static final java.lang.String CACHE_PREFS = "Hchat_dex_cache";
    private static final java.lang.String TAG = "[Hchat:DexFinder]";
    private static final boolean VERBOSE = false;
    public java.lang.Class<?> addChatroomMemberClass;
    public java.lang.reflect.Constructor<?> addChatroomMemberCtor;
    public java.lang.Class<?> addContactLabelClass;
    public java.lang.reflect.Constructor<?> addContactLabelCtorList;
    public java.lang.reflect.Constructor<?> addContactLabelCtorString;
    public java.util.List<java.lang.Class<?>> addMsgClasses;
    public java.lang.reflect.Method appMsgParseMethod;
    private final android.content.SharedPreferences cachePrefs;
    public java.lang.reflect.Method chatFooterSendClickMethod;
    public java.lang.reflect.Method chatPageFragmentEnterMethod;
    public java.lang.reflect.Method chatPageFragmentExitMethod;
    public java.lang.reflect.Method chatPageStartMethod;
    public java.lang.reflect.Method chatroomMuteBuildMethod;
    public java.lang.reflect.Method chatroomMuteServiceGetterMethod;
    public java.lang.reflect.Method chatroomMuteSubmitMethod;
    private final java.lang.ClassLoader classLoader;
    public java.lang.Class<?> configStorageClass;
    public java.lang.reflect.Method contactCardXmlMethod;
    public java.lang.reflect.Method contactMuteDisableMethod;
    public java.lang.reflect.Method contactMuteEnableMethod;
    public java.lang.reflect.Method contactMuteStateMethod;
    public java.lang.reflect.Method contactStorageGetterMethod;
    public java.lang.reflect.Method contactStorageQueryMethod;
    public java.lang.reflect.Method conversationDeleteMethod;
    public java.lang.Class<?> coreStorageClass;
    public java.lang.reflect.Method coreStorageGetter;
    public java.lang.Class<?> delChatroomMemberClass;
    public java.lang.reflect.Constructor<?> delChatroomMemberCtor;
    private final org.luckypray.dexkit.DexKitBridge dexKit;
    public java.lang.reflect.Method emojiAccPathMethod;
    public java.lang.reflect.Method emojiCheckGifMethod;
    public java.lang.reflect.Method emojiCreateInfoMethod;
    public java.lang.reflect.Method emojiDecodeDataMethod;
    public java.lang.reflect.Method emojiDecodeManagerGetterMethod;
    public java.lang.reflect.Method emojiFilePathMethod;
    public java.lang.reflect.Method emojiGetByMd5Method;
    public java.lang.reflect.Method emojiManagerSendMethod;
    public java.lang.reflect.Method emojiSendMethod;
    public java.lang.reflect.Method emojiUpdateInfoMethod;
    public java.util.List<java.lang.Class<?>> fakePacketClasses;
    public java.lang.reflect.Method favoriteGetMethod;
    public java.lang.Class<?> favoriteItemClass;
    public java.lang.reflect.Method favoriteItemConvertFromCursorMethod;
    public java.lang.reflect.Method favoriteListCursorMethod;
    public java.lang.reflect.Method favoriteListMethod;
    public java.lang.reflect.Method favoriteListNextMethod;
    public java.lang.reflect.Method favoriteSendMethod;
    public java.lang.Class<?> favoriteSendParamClass;
    public java.lang.Class<?> favoriteServiceClass;
    public java.lang.reflect.Method favoriteServiceResolverMethod;
    public java.lang.reflect.Method favoriteStorageGetterMethod;
    public java.util.List<java.lang.reflect.Method> getContactAddMethods;
    public java.util.List<java.lang.reflect.Method> getContactServiceGetters;
    public java.lang.reflect.Method groupMemberDisplayNameMethod;
    public java.lang.Class<?> groupSolitairePluginClass;
    public java.lang.reflect.Method groupSolitaireSendMethod;
    public java.lang.reflect.Method imageBestPathMethod;
    public java.lang.reflect.Method imageCdnServiceGetterMethod;
    public java.lang.reflect.Method imageCdnSubmitMethod;
    public java.lang.Class<?> imageCdnTaskClass;
    public java.lang.reflect.Method imageStorageGetterMethod;
    public java.lang.reflect.Method imageTokenPathMethod;
    public java.lang.Class<?> inviteChatroomMemberClass;
    public java.lang.reflect.Constructor<?> inviteChatroomMemberCtor;
    public java.lang.Class<?> localMessageClass;
    public java.lang.reflect.Method localMessageCreateTimeMethod;
    public java.lang.reflect.Constructor<?> localMessageCtor;
    public java.lang.reflect.Method localMessageInsertMethod;
    public java.lang.reflect.Method localSystemMessageMethod;
    public java.lang.Class<?> marsCdnDownloadCallbackClass;
    public java.lang.Class<?> marsCdnDownloadRequestClass;
    public java.lang.Class<?> marsCdnManagerClass;
    public java.lang.reflect.Method marsCdnStartDownloadMethod;
    public java.lang.reflect.Method messageClearBatchMethod;
    public java.lang.reflect.Method messageClearByTalkerMethod;
    public java.lang.Class<?> mmKernelClass;
    public java.lang.Class<?> modifyContactLabelListClass;
    public java.lang.reflect.Constructor<?> modifyContactLabelListCtor;
    public java.util.List<java.lang.Class<?>> netQueueCandidateClasses;
    public java.lang.Class<?> netQueueClass;
    public java.lang.reflect.Constructor<?> openCtor10;
    public java.lang.reflect.Constructor<?> openCtor8;
    public java.lang.reflect.Constructor<?> openCtor9;
    public java.lang.Class<?> openLuckyMoneyClass;
    public java.lang.Class<?> openLuckyMoneyUnionClass;
    public java.util.List<java.lang.Class<?>> packetBaseClasses;
    public java.util.List<java.lang.Class<?>> packetQueueClasses;
    public java.lang.reflect.Method patCanSendMethod;
    public java.lang.reflect.Method patCreatePairMethod;
    public java.lang.reflect.Method patDisplayTemplateMethod;
    public java.lang.Class<?> patExtensionClass;
    public java.lang.reflect.Method patSuffixMethod;
    public java.lang.Class<?> protobufCallbackClass;
    public java.lang.Class<?> protobufConfigBuilderClass;
    public java.lang.Class<?> protobufGenericRespClass;
    public java.lang.Class<?> protobufNetSceneBaseClass;
    public java.lang.Class<?> protobufNewSendMsgReqClass;
    public java.lang.Class<?> protobufOnGYNetEndClass;
    public java.lang.Class<?> protobufOplogReqClass;
    public java.lang.Class<?> protobufRawReqClass;
    public java.lang.Class<?> protobufReqRespClass;
    public java.util.List<java.lang.reflect.Method> protobufSceneEndMethods;
    public java.lang.reflect.Method protobufStaticDispatchMethod;
    public java.lang.reflect.Constructor<?> receiveCtor;
    public java.lang.Class<?> receiveLuckyMoneyClass;
    public java.lang.Class<?> receiveLuckyMoneyUnionClass;
    private boolean resolvedAll;
    public java.lang.Class<?> revokeMsgClass;
    public java.lang.reflect.Constructor<?> revokeMsgCtor;
    private final java.lang.String runtimeCacheKey;
    public java.lang.reflect.Method sendFileAttachDirMethod;
    public java.lang.reflect.Method sendFileAttachPathMethod;
    public java.lang.reflect.Method sendFileMethod;
    public java.lang.Class<?> sendImageAppInfoClass;
    public java.lang.Class<?> sendImageAsyncParamsClass;
    public java.lang.reflect.Method sendImageAsyncSubmitMethod;
    public java.lang.Class<?> sendImageCrossParamsClass;
    public java.lang.reflect.Method sendImageMethod;
    public java.lang.Class<?> sendPatSceneClass;
    public java.lang.reflect.Constructor<?> sendPatSceneCtor;
    public java.lang.Class<?> sendTextMsgClass;
    public java.lang.reflect.Constructor<?> sendTextMsgCtorLong;
    public java.lang.reflect.Constructor<?> sendTextMsgCtorObject;
    public java.lang.reflect.Method sendVideoMethod;
    public java.lang.Class<?> sendVideoTaskClass;
    public java.lang.reflect.Method sendXmlAppMsgMethod;
    public java.lang.reflect.Method serviceGetterMethod;
    public java.lang.reflect.Method snsAddImageMethod;
    public java.lang.reflect.Method snsAddVideoMethod;
    public java.lang.reflect.Method snsCommitMethod;
    public java.lang.reflect.Method snsSetContentMethod;
    public java.lang.reflect.Method snsSetSdkAppNameMethod;
    public java.lang.reflect.Method snsSetSdkIdMethod;
    public java.lang.reflect.Method snsShareAppMsgMethod;
    public java.lang.reflect.Method snsUploadCheckMethod;
    public java.lang.Class<?> snsUploadManagerClass;
    public java.lang.reflect.Method snsUploadManagerGetterMethod;
    public java.lang.Class<?> snsUploadPackHelperClass;
    public java.lang.Class<?> sqliteDbWrapperClass;
    public java.lang.Class<?> transferOperationClass;
    public java.lang.Class<?> transferQueryClass;
    public java.lang.reflect.Method transferQueryResponseMethod;
    public java.lang.reflect.Constructor<?> unionOpenCtor10;
    public java.lang.reflect.Constructor<?> unionOpenCtor9;
    public java.lang.reflect.Constructor<?> unionReceiveCtor;
    public java.lang.Class<?> uploadDeviceStepClass;
    public java.lang.reflect.Constructor<?> uploadDeviceStepCtor;
    public java.lang.Class<?> verifyUserClass;
    public java.lang.reflect.Method videoInfoByFileNameMethod;
    private java.lang.Class<?> videoInfoClass;
    public java.lang.reflect.Method videoPathMethod;
    public java.lang.reflect.Method videoPathOwnerGetterMethod;
    public java.lang.reflect.Method voiceFinishRecordMethod;
    public java.lang.reflect.Method voiceFullPathMethod;
    public java.lang.reflect.Method voiceInfoQueryMethod;
    public java.lang.reflect.Method voicePlaybackPauseMethod;
    public java.lang.reflect.Method voicePlaybackResumeMethod;
    public java.lang.reflect.Method voicePlaybackStartMethod;
    public java.lang.reflect.Method voicePlaybackStopMethod;
    public java.lang.reflect.Method voiceStartRecordMethod;
    public java.lang.reflect.Constructor<?> voiceUploadCdnCtor;
    public java.lang.Class<?> voiceUploadClass;
    public java.lang.reflect.Constructor<?> voiceUploadCtor;
    public java.lang.Class<?> wishWxHbClass;
    public java.lang.reflect.Constructor<?> wishWxHbCtor;

    public DexFinder(org.luckypray.dexkit.DexKitBridge r2, java.lang.ClassLoader r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r0)
            return
    }

    public DexFinder(org.luckypray.dexkit.DexKitBridge r2, java.lang.ClassLoader r3, android.content.Context r4) {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.addMsgClasses = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.netQueueCandidateClasses = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.packetBaseClasses = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.packetQueueClasses = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.fakePacketClasses = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.protobufSceneEndMethods = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.getContactAddMethods = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.getContactServiceGetters = r0
            r1.dexKit = r2
            r1.classLoader = r3
            if (r4 == 0) goto L48
            java.lang.String r2 = "Hchat_dex_cache"
            android.content.SharedPreferences r2 = ub.b.c(r4, r2)
            goto L49
        L48:
            r2 = 0
        L49:
            r1.cachePrefs = r2
            java.lang.String r2 = r1.buildRuntimeCacheKey(r4, r3)
            r1.runtimeCacheKey = r2
            return
    }

    private void addNetQueueCandidate(java.lang.Class<?> r2) {
            r1 = this;
            if (r2 == 0) goto Lf
            java.util.List<java.lang.Class<?>> r0 = r1.netQueueCandidateClasses
            boolean r0 = r0.contains(r2)
            if (r0 != 0) goto Lf
            java.util.List<java.lang.Class<?>> r0 = r1.netQueueCandidateClasses
            r0.add(r2)
        Lf:
            return
    }

    private java.lang.String buildRuntimeCacheKey(android.content.Context r1, java.lang.ClassLoader r2) {
            r0 = this;
            l8.i r1 = o8.k.a(r1, r2)
            java.lang.String r1 = r1.f7933h
            return r1
    }

    private java.lang.String className(java.lang.Class<?> r1) {
            r0 = this;
            if (r1 == 0) goto L7
            java.lang.String r1 = r1.getName()
            return r1
        L7:
            java.lang.String r1 = "null"
            return r1
    }

    private void collectAppMsgLogicCandidates(java.util.List<java.lang.Class<?>> r9, int r10, java.lang.String[][] r11) {
            r8 = this;
            if (r9 == 0) goto L4f
            if (r11 != 0) goto L5
            goto L4f
        L5:
            int r0 = r11.length
            r1 = 0
            r2 = r1
        L8:
            if (r2 >= r0) goto L4f
            r3 = r11[r2]
            org.luckypray.dexkit.DexKitBridge r4 = r8.dexKit     // Catch: java.lang.Throwable -> L4c
            ch.e r3 = r8.mkMethodUsingStrings(r3)     // Catch: java.lang.Throwable -> L4c
            hh.p r3 = r4.findMethod(r3)     // Catch: java.lang.Throwable -> L4c
            int r4 = r3.size()     // Catch: java.lang.Throwable -> L4c
            int r4 = java.lang.Math.min(r4, r10)     // Catch: java.lang.Throwable -> L4c
            r5 = r1
        L1f:
            if (r5 >= r4) goto L45
            java.lang.Object r6 = r3.get(r5)     // Catch: java.lang.Throwable -> L42
            hh.o r6 = (hh.o) r6     // Catch: java.lang.Throwable -> L42
            lh.d r6 = r6.p()     // Catch: java.lang.Throwable -> L42
            java.lang.String r6 = r6.f8063g     // Catch: java.lang.Throwable -> L42
            java.lang.ClassLoader r7 = r8.classLoader     // Catch: java.lang.Throwable -> L42
            java.lang.Class r6 = h.Hchat.utils.KavaReflector.loadClass(r6, r7)     // Catch: java.lang.Throwable -> L42
            java.lang.reflect.Method r7 = r8.findSendFileAppMsgMethod(r6)     // Catch: java.lang.Throwable -> L42
            if (r7 == 0) goto L42
            boolean r7 = r9.contains(r6)     // Catch: java.lang.Throwable -> L42
            if (r7 != 0) goto L42
            r9.add(r6)     // Catch: java.lang.Throwable -> L42
        L42:
            int r5 = r5 + 1
            goto L1f
        L45:
            boolean r3 = r9.isEmpty()     // Catch: java.lang.Throwable -> L4c
            if (r3 != 0) goto L4c
            goto L4f
        L4c:
            int r2 = r2 + 1
            goto L8
        L4f:
            return
    }

    private void collectClassCandidates(java.util.List<java.lang.Class<?>> r9, int r10, java.lang.String[][] r11) {
            r8 = this;
            if (r9 == 0) goto L49
            if (r11 != 0) goto L5
            goto L49
        L5:
            int r0 = r11.length
            r1 = 0
            r2 = r1
        L8:
            if (r2 >= r0) goto L49
            r3 = r11[r2]
            org.luckypray.dexkit.DexKitBridge r4 = r8.dexKit     // Catch: java.lang.Throwable -> L46
            ch.c r3 = r8.mkClassUsingStrings(r3)     // Catch: java.lang.Throwable -> L46
            hh.j r3 = r4.findClass(r3)     // Catch: java.lang.Throwable -> L46
            int r4 = r3.size()     // Catch: java.lang.Throwable -> L46
            int r4 = java.lang.Math.min(r4, r10)     // Catch: java.lang.Throwable -> L46
            r5 = r1
        L1f:
            if (r5 >= r4) goto L3f
            java.lang.Object r6 = r3.get(r5)     // Catch: java.lang.Throwable -> L3c
            hh.i r6 = (hh.i) r6     // Catch: java.lang.Throwable -> L3c
            lh.a r6 = r6.p()     // Catch: java.lang.Throwable -> L3c
            java.lang.String r6 = r6.f8057g     // Catch: java.lang.Throwable -> L3c
            java.lang.ClassLoader r7 = r8.classLoader     // Catch: java.lang.Throwable -> L3c
            java.lang.Class r6 = h.Hchat.utils.KavaReflector.loadClass(r6, r7)     // Catch: java.lang.Throwable -> L3c
            boolean r7 = r9.contains(r6)     // Catch: java.lang.Throwable -> L3c
            if (r7 != 0) goto L3c
            r9.add(r6)     // Catch: java.lang.Throwable -> L3c
        L3c:
            int r5 = r5 + 1
            goto L1f
        L3f:
            boolean r3 = r9.isEmpty()     // Catch: java.lang.Throwable -> L46
            if (r3 != 0) goto L46
            goto L49
        L46:
            int r2 = r2 + 1
            goto L8
        L49:
            return
    }

    private void collectGetContactAddMethods(java.lang.String r3) {
            r2 = this;
            org.luckypray.dexkit.DexKitBridge r0 = r2.dexKit     // Catch: java.lang.Throwable -> L3c
            java.lang.String[] r3 = new java.lang.String[]{r3}     // Catch: java.lang.Throwable -> L3c
            ch.e r3 = r2.mkMethodUsingStrings(r3)     // Catch: java.lang.Throwable -> L3c
            hh.p r3 = r0.findMethod(r3)     // Catch: java.lang.Throwable -> L3c
            java.util.Iterator r3 = r3.iterator()     // Catch: java.lang.Throwable -> L3c
        L12:
            boolean r0 = r3.hasNext()     // Catch: java.lang.Throwable -> L3c
            if (r0 == 0) goto L3c
            java.lang.Object r0 = r3.next()     // Catch: java.lang.Throwable -> L3c
            hh.o r0 = (hh.o) r0     // Catch: java.lang.Throwable -> L3c
            java.lang.ClassLoader r1 = r2.classLoader     // Catch: java.lang.Throwable -> L12
            java.lang.reflect.Method r0 = r0.r(r1)     // Catch: java.lang.Throwable -> L12
            boolean r1 = r2.isGetContactAddMethod(r0)     // Catch: java.lang.Throwable -> L12
            if (r1 != 0) goto L2b
            goto L12
        L2b:
            h.Hchat.utils.KavaReflector.accessible(r0)     // Catch: java.lang.Throwable -> L12
            java.util.List<java.lang.reflect.Method> r1 = r2.getContactAddMethods     // Catch: java.lang.Throwable -> L12
            boolean r1 = r1.contains(r0)     // Catch: java.lang.Throwable -> L12
            if (r1 != 0) goto L12
            java.util.List<java.lang.reflect.Method> r1 = r2.getContactAddMethods     // Catch: java.lang.Throwable -> L12
            r1.add(r0)     // Catch: java.lang.Throwable -> L12
            goto L12
        L3c:
            return
    }

    private void collectGetContactServiceGetters() {
            r5 = this;
            java.util.List<java.lang.reflect.Method> r0 = r5.getContactAddMethods
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L30
            java.lang.Object r1 = r0.next()
            java.lang.reflect.Method r1 = (java.lang.reflect.Method) r1
            if (r1 != 0) goto L15
            goto L6
        L15:
            java.lang.Class r2 = r1.getDeclaringClass()
            r5.collectServiceGettersForType(r2)
            java.lang.Class r1 = r1.getDeclaringClass()
            java.lang.Class[] r1 = r1.getInterfaces()
            int r2 = r1.length
            r3 = 0
        L26:
            if (r3 >= r2) goto L6
            r4 = r1[r3]
            r5.collectServiceGettersForType(r4)
            int r3 = r3 + 1
            goto L26
        L30:
            return
    }

    private void collectKnownNetworkQueueClasses() {
            r6 = this;
            java.lang.String r4 = "com.tencent.mm.model.ak"
            java.lang.String r5 = "com.tencent.mm.model.az"
            java.lang.String r0 = "tk0.j1"
            java.lang.String r1 = "com.tencent.mm.kernel.h"
            java.lang.String r2 = "com.tencent.mm.kernel.g"
            java.lang.String r3 = "com.tencent.mm.model.bh"
            java.lang.String[] r0 = new java.lang.String[]{r0, r1, r2, r3, r4, r5}
            r1 = 0
        L11:
            r2 = 6
            if (r1 >= r2) goto L22
            r2 = r0[r1]
            java.lang.ClassLoader r3 = r6.classLoader     // Catch: java.lang.Throwable -> L1f
            java.lang.Class r2 = h.Hchat.utils.KavaReflector.loadClass(r2, r3)     // Catch: java.lang.Throwable -> L1f
            r6.addNetQueueCandidate(r2)     // Catch: java.lang.Throwable -> L1f
        L1f:
            int r1 = r1 + 1
            goto L11
        L22:
            return
    }

    private void collectMethodOwnerClass(java.util.List<hh.o> r3, java.util.List<java.lang.Class<?>> r4) {
            r2 = this;
            java.util.Iterator r3 = r3.iterator()
        L4:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L26
            java.lang.Object r0 = r3.next()
            hh.o r0 = (hh.o) r0
            lh.d r0 = r0.p()     // Catch: java.lang.Throwable -> L4
            java.lang.String r0 = r0.f8063g     // Catch: java.lang.Throwable -> L4
            java.lang.ClassLoader r1 = r2.classLoader     // Catch: java.lang.Throwable -> L4
            java.lang.Class r0 = h.Hchat.utils.KavaReflector.loadClass(r0, r1)     // Catch: java.lang.Throwable -> L4
            boolean r1 = r4.contains(r0)     // Catch: java.lang.Throwable -> L4
            if (r1 != 0) goto L4
            r4.add(r0)     // Catch: java.lang.Throwable -> L4
            goto L4
        L26:
            return
    }

    private void collectNetworkQueueClassesByAnchors() {
            r17 = this;
            r0 = r17
            java.lang.String r1 = "MicroMsg.NetSceneQueue"
            java.lang.String[] r2 = new java.lang.String[]{r1}
            java.lang.String r1 = "NetSceneQueue"
            java.lang.String[] r3 = new java.lang.String[]{r1}
            java.lang.String r1 = "doSceneImp start"
            java.lang.String[] r4 = new java.lang.String[]{r1}
            java.lang.String r1 = "doSceneImp mmcgi"
            java.lang.String[] r5 = new java.lang.String[]{r1}
            java.lang.String r1 = "On doscene  mmcgi"
            java.lang.String[] r6 = new java.lang.String[]{r1}
            java.lang.String r1 = "doscene mmcgi Failed"
            java.lang.String[] r7 = new java.lang.String[]{r1}
            java.lang.String r1 = "waitingQueue_size"
            java.lang.String[] r8 = new java.lang.String[]{r1}
            java.lang.String r1 = "MicroMsg.MMKernel"
            java.lang.String[] r9 = new java.lang.String[]{r1}
            java.lang.String r1 = "Kernel not initialized by MMApplication"
            java.lang.String[] r10 = new java.lang.String[]{r1}
            java.lang.String r1 = "Initialize kernel, create whole WeChat world"
            java.lang.String[] r11 = new java.lang.String[]{r1}
            java.lang.String r1 = "mCoreNetwork not initialized"
            java.lang.String[] r12 = new java.lang.String[]{r1}
            java.lang.String r1 = "MMKernel.CoreNetwork"
            java.lang.String[] r13 = new java.lang.String[]{r1}
            java.lang.String r1 = "MicroMsg.CoreNetwork"
            java.lang.String[] r14 = new java.lang.String[]{r1}
            java.lang.String r1 = "doSceneImp err"
            java.lang.String[] r15 = new java.lang.String[]{r1}
            java.lang.String r1 = "dispatcher is null"
            java.lang.String[] r16 = new java.lang.String[]{r1}
            java.lang.String[][] r1 = new java.lang.String[][]{r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16}
            r2 = 0
            r3 = r2
        L62:
            r4 = 15
            if (r3 >= r4) goto L9a
            r4 = r1[r3]
            org.luckypray.dexkit.DexKitBridge r5 = r0.dexKit     // Catch: java.lang.Throwable -> L97
            ch.c r4 = r0.mkClassUsingStrings(r4)     // Catch: java.lang.Throwable -> L97
            hh.j r4 = r5.findClass(r4)     // Catch: java.lang.Throwable -> L97
            int r5 = r4.size()     // Catch: java.lang.Throwable -> L97
            r6 = 30
            int r5 = java.lang.Math.min(r5, r6)     // Catch: java.lang.Throwable -> L97
            r6 = r2
        L7d:
            if (r6 >= r5) goto L97
            java.lang.Object r7 = r4.get(r6)     // Catch: java.lang.Throwable -> L94
            hh.i r7 = (hh.i) r7     // Catch: java.lang.Throwable -> L94
            lh.a r7 = r7.p()     // Catch: java.lang.Throwable -> L94
            java.lang.String r7 = r7.f8057g     // Catch: java.lang.Throwable -> L94
            java.lang.ClassLoader r8 = r0.classLoader     // Catch: java.lang.Throwable -> L94
            java.lang.Class r7 = h.Hchat.utils.KavaReflector.loadClass(r7, r8)     // Catch: java.lang.Throwable -> L94
            r0.addNetQueueCandidate(r7)     // Catch: java.lang.Throwable -> L94
        L94:
            int r6 = r6 + 1
            goto L7d
        L97:
            int r3 = r3 + 1
            goto L62
        L9a:
            return
    }

    private void collectSendTextClassCandidates(java.util.List<java.lang.Class<?>> r9, int r10, java.lang.String[][] r11) {
            r8 = this;
            if (r9 == 0) goto L42
            if (r11 != 0) goto L5
            goto L42
        L5:
            int r0 = r11.length
            r1 = 0
            r2 = r1
        L8:
            if (r2 >= r0) goto L42
            r3 = r11[r2]
            org.luckypray.dexkit.DexKitBridge r4 = r8.dexKit     // Catch: java.lang.Throwable -> L3f
            ch.c r3 = r8.mkClassUsingStrings(r3)     // Catch: java.lang.Throwable -> L3f
            hh.j r3 = r4.findClass(r3)     // Catch: java.lang.Throwable -> L3f
            int r4 = r3.size()     // Catch: java.lang.Throwable -> L3f
            int r4 = java.lang.Math.min(r4, r10)     // Catch: java.lang.Throwable -> L3f
            r5 = r1
        L1f:
            if (r5 >= r4) goto L3f
            java.lang.Object r6 = r3.get(r5)     // Catch: java.lang.Throwable -> L3c
            hh.i r6 = (hh.i) r6     // Catch: java.lang.Throwable -> L3c
            lh.a r6 = r6.p()     // Catch: java.lang.Throwable -> L3c
            java.lang.String r6 = r6.f8057g     // Catch: java.lang.Throwable -> L3c
            java.lang.ClassLoader r7 = r8.classLoader     // Catch: java.lang.Throwable -> L3c
            java.lang.Class r6 = h.Hchat.utils.KavaReflector.loadClass(r6, r7)     // Catch: java.lang.Throwable -> L3c
            boolean r7 = r9.contains(r6)     // Catch: java.lang.Throwable -> L3c
            if (r7 != 0) goto L3c
            r9.add(r6)     // Catch: java.lang.Throwable -> L3c
        L3c:
            int r5 = r5 + 1
            goto L1f
        L3f:
            int r2 = r2 + 1
            goto L8
        L42:
            return
    }

    private void collectSendTextMethodOwnerCandidates(java.util.List<java.lang.Class<?>> r9, int r10, java.lang.String[][] r11) {
            r8 = this;
            if (r9 == 0) goto L42
            if (r11 != 0) goto L5
            goto L42
        L5:
            int r0 = r11.length
            r1 = 0
            r2 = r1
        L8:
            if (r2 >= r0) goto L42
            r3 = r11[r2]
            org.luckypray.dexkit.DexKitBridge r4 = r8.dexKit     // Catch: java.lang.Throwable -> L3f
            ch.e r3 = r8.mkMethodUsingStrings(r3)     // Catch: java.lang.Throwable -> L3f
            hh.p r3 = r4.findMethod(r3)     // Catch: java.lang.Throwable -> L3f
            int r4 = r3.size()     // Catch: java.lang.Throwable -> L3f
            int r4 = java.lang.Math.min(r4, r10)     // Catch: java.lang.Throwable -> L3f
            r5 = r1
        L1f:
            if (r5 >= r4) goto L3f
            java.lang.Object r6 = r3.get(r5)     // Catch: java.lang.Throwable -> L3c
            hh.o r6 = (hh.o) r6     // Catch: java.lang.Throwable -> L3c
            lh.d r6 = r6.p()     // Catch: java.lang.Throwable -> L3c
            java.lang.String r6 = r6.f8063g     // Catch: java.lang.Throwable -> L3c
            java.lang.ClassLoader r7 = r8.classLoader     // Catch: java.lang.Throwable -> L3c
            java.lang.Class r6 = h.Hchat.utils.KavaReflector.loadClass(r6, r7)     // Catch: java.lang.Throwable -> L3c
            boolean r7 = r9.contains(r6)     // Catch: java.lang.Throwable -> L3c
            if (r7 != 0) goto L3c
            r9.add(r6)     // Catch: java.lang.Throwable -> L3c
        L3c:
            int r5 = r5 + 1
            goto L1f
        L3f:
            int r2 = r2 + 1
            goto L8
        L42:
            return
    }

    private void collectServiceGettersForType(java.lang.Class<?> r4) {
            r3 = this;
            if (r4 == 0) goto L4e
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            if (r4 != r0) goto L7
            goto L4e
        L7:
            ch.e r0 = new ch.e     // Catch: java.lang.Throwable -> L4e
            r0.<init>()     // Catch: java.lang.Throwable -> L4e
            fh.k r1 = new fh.k     // Catch: java.lang.Throwable -> L4e
            r1.<init>()     // Catch: java.lang.Throwable -> L4e
            r2 = 0
            r1.m0(r2)     // Catch: java.lang.Throwable -> L4e
            r1.p0(r4)     // Catch: java.lang.Throwable -> L4e
            r0.f1666h = r1     // Catch: java.lang.Throwable -> L4e
            org.luckypray.dexkit.DexKitBridge r1 = r3.dexKit     // Catch: java.lang.Throwable -> L4e
            hh.p r0 = r1.findMethod(r0)     // Catch: java.lang.Throwable -> L4e
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L4e
        L24:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L4e
            if (r1 == 0) goto L4e
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L4e
            hh.o r1 = (hh.o) r1     // Catch: java.lang.Throwable -> L4e
            java.lang.ClassLoader r2 = r3.classLoader     // Catch: java.lang.Throwable -> L24
            java.lang.reflect.Method r1 = r1.r(r2)     // Catch: java.lang.Throwable -> L24
            boolean r2 = r3.isGetContactServiceGetter(r1, r4)     // Catch: java.lang.Throwable -> L24
            if (r2 != 0) goto L3d
            goto L24
        L3d:
            h.Hchat.utils.KavaReflector.accessible(r1)     // Catch: java.lang.Throwable -> L24
            java.util.List<java.lang.reflect.Method> r2 = r3.getContactServiceGetters     // Catch: java.lang.Throwable -> L24
            boolean r2 = r2.contains(r1)     // Catch: java.lang.Throwable -> L24
            if (r2 != 0) goto L24
            java.util.List<java.lang.reflect.Method> r2 = r3.getContactServiceGetters     // Catch: java.lang.Throwable -> L24
            r2.add(r1)     // Catch: java.lang.Throwable -> L24
            goto L24
        L4e:
            return
    }

    private java.lang.Class<?> favoriteItemClassFromUsingFields(hh.o r4) {
            r3 = this;
            if (r4 != 0) goto L3
            goto L3f
        L3:
            sf.i r4 = r4.f5577s     // Catch: java.lang.Throwable -> L3f
            java.lang.Object r4 = r4.getValue()     // Catch: java.lang.Throwable -> L3f
            java.util.List r4 = (java.util.List) r4     // Catch: java.lang.Throwable -> L3f
            java.util.Iterator r4 = r4.iterator()     // Catch: java.lang.Throwable -> L3f
        Lf:
            boolean r0 = r4.hasNext()     // Catch: java.lang.Throwable -> L3f
            if (r0 == 0) goto L3f
            java.lang.Object r0 = r4.next()     // Catch: java.lang.Throwable -> L3f
            hh.q r0 = (hh.q) r0     // Catch: java.lang.Throwable -> L3f
            hh.l r0 = r0.f5578a     // Catch: java.lang.Throwable -> L3f
            java.lang.String r1 = "field_favProto"
            lh.b r2 = r0.p()     // Catch: java.lang.Throwable -> L3f
            java.lang.String r2 = r2.f8059h     // Catch: java.lang.Throwable -> L3f
            boolean r1 = r1.equals(r2)     // Catch: java.lang.Throwable -> L3f
            if (r1 != 0) goto L2c
            goto Lf
        L2c:
            lh.b r0 = r0.p()     // Catch: java.lang.Throwable -> L3f
            java.lang.String r0 = r0.f8058g     // Catch: java.lang.Throwable -> L3f
            java.lang.ClassLoader r1 = r3.classLoader     // Catch: java.lang.Throwable -> L3f
            java.lang.Class r0 = h.Hchat.utils.KavaReflector.loadClass(r0, r1)     // Catch: java.lang.Throwable -> L3f
            boolean r1 = r3.isFavoriteItemClass(r0)     // Catch: java.lang.Throwable -> L3f
            if (r1 == 0) goto Lf
            return r0
        L3f:
            r4 = 0
            return r4
    }

    private java.lang.reflect.Constructor<?> findAddChatroomMemberCtor(java.lang.Class<?> r7) {
            r6 = this;
            r0 = 0
            if (r7 != 0) goto L4
            return r0
        L4:
            java.util.List r7 = h.Hchat.utils.KavaReflector.declaredConstructors(r7)
            java.util.Iterator r7 = r7.iterator()
        Lc:
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto L40
            java.lang.Object r1 = r7.next()
            java.lang.reflect.Constructor r1 = (java.lang.reflect.Constructor) r1
            java.lang.Class[] r2 = r1.getParameterTypes()
            int r3 = r2.length
            r4 = 4
            if (r3 == r4) goto L21
            goto Lc
        L21:
            r3 = 0
            r3 = r2[r3]
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            if (r3 == r4) goto L29
            goto Lc
        L29:
            r3 = 1
            r3 = r2[r3]
            java.lang.Class<java.util.List> r5 = java.util.List.class
            boolean r3 = r5.isAssignableFrom(r3)
            if (r3 != 0) goto L35
            goto Lc
        L35:
            r3 = 2
            r2 = r2[r3]
            if (r2 == r4) goto L3b
            goto Lc
        L3b:
            java.lang.reflect.Constructor r7 = h.Hchat.utils.KavaReflector.accessible(r1)
            return r7
        L40:
            return r0
    }

    private java.lang.Class<?> findConfigBuilderClass(java.lang.Class<?> r6) {
            r5 = this;
            if (r6 != 0) goto L3
            goto L65
        L3:
            ch.c r0 = new ch.c     // Catch: java.lang.Throwable -> L65
            r0.<init>()     // Catch: java.lang.Throwable -> L65
            fh.a r1 = new fh.a     // Catch: java.lang.Throwable -> L65
            r1.<init>()     // Catch: java.lang.Throwable -> L65
            java.lang.String r2 = "java.lang.Object"
            r1.o0(r2)     // Catch: java.lang.Throwable -> L65
            fh.j r2 = r1.f3937i     // Catch: java.lang.Throwable -> L65
            if (r2 != 0) goto L1c
            fh.j r2 = new fh.j     // Catch: java.lang.Throwable -> L65
            r3 = 0
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L65
        L1c:
            r1.f3937i = r2     // Catch: java.lang.Throwable -> L65
            gh.a r3 = new gh.a     // Catch: java.lang.Throwable -> L65
            r3.<init>()     // Catch: java.lang.Throwable -> L65
            r4 = 10
            r3.f4566g = r4     // Catch: java.lang.Throwable -> L65
            r4 = 80
            r3.f4567h = r4     // Catch: java.lang.Throwable -> L65
            r2.f3949i = r3     // Catch: java.lang.Throwable -> L65
            r1.k0(r6)     // Catch: java.lang.Throwable -> L65
            r1.k0(r6)     // Catch: java.lang.Throwable -> L65
            java.lang.Class<java.lang.String> r2 = java.lang.String.class
            r1.k0(r2)     // Catch: java.lang.Throwable -> L65
            r0.f1664h = r1     // Catch: java.lang.Throwable -> L65
            org.luckypray.dexkit.DexKitBridge r1 = r5.dexKit     // Catch: java.lang.Throwable -> L65
            hh.j r0 = r1.findClass(r0)     // Catch: java.lang.Throwable -> L65
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L65
        L44:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L65
            if (r1 == 0) goto L65
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L65
            hh.i r1 = (hh.i) r1     // Catch: java.lang.Throwable -> L65
            lh.a r1 = r1.p()     // Catch: java.lang.Throwable -> L44
            java.lang.String r1 = r1.f8057g     // Catch: java.lang.Throwable -> L44
            java.lang.ClassLoader r2 = r5.classLoader     // Catch: java.lang.Throwable -> L44
            java.lang.Class r1 = h.Hchat.utils.KavaReflector.loadClass(r1, r2)     // Catch: java.lang.Throwable -> L44
            if (r1 == 0) goto L44
            boolean r2 = r5.hasConfigBuilderShape(r1, r6)     // Catch: java.lang.Throwable -> L44
            if (r2 == 0) goto L44
            return r1
        L65:
            r6 = 0
            return r6
    }

    private java.lang.reflect.Method findContactMuteStateMethod() {
            r7 = this;
            java.lang.reflect.Method r0 = r7.contactMuteEnableMethod
            boolean r1 = r7.isContactMuteMethod(r0)
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            org.luckypray.dexkit.DexKitBridge r3 = r7.dexKit
            java.lang.String r4 = "room_notify_new_msg"
            java.lang.String[] r4 = new java.lang.String[]{r4}
            ch.e r4 = r7.mkMethodUsingStrings(r4)
            hh.p r3 = r3.findMethod(r4)
            java.util.Iterator r3 = r3.iterator()
        L23:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L6c
            java.lang.Object r4 = r3.next()
            hh.o r4 = (hh.o) r4
            lh.d r5 = r4.p()
            java.lang.String r5 = r5.f8063g
            java.lang.String r6 = "com.tencent.mm.ui.SingleChatInfoUI"
            boolean r5 = r6.equals(r5)
            if (r5 != 0) goto L3e
            goto L23
        L3e:
            hh.p r4 = r4.q()
            java.util.Iterator r4 = r4.iterator()
        L46:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L23
            java.lang.Object r5 = r4.next()
            hh.o r5 = (hh.o) r5
            java.lang.ClassLoader r6 = r7.classLoader     // Catch: java.lang.Throwable -> L46
            java.lang.reflect.Method r5 = r5.r(r6)     // Catch: java.lang.Throwable -> L46
            boolean r6 = r7.isContactMuteStateMethod(r5, r0)     // Catch: java.lang.Throwable -> L46
            if (r6 == 0) goto L46
            boolean r6 = r1.contains(r5)     // Catch: java.lang.Throwable -> L46
            if (r6 == 0) goto L65
            goto L46
        L65:
            h.Hchat.utils.KavaReflector.accessible(r5)     // Catch: java.lang.Throwable -> L46
            r1.add(r5)     // Catch: java.lang.Throwable -> L46
            goto L46
        L6c:
            int r0 = r1.size()
            r3 = 1
            if (r0 != r3) goto L7b
            r0 = 0
            java.lang.Object r0 = r1.get(r0)
            r2 = r0
            java.lang.reflect.Method r2 = (java.lang.reflect.Method) r2
        L7b:
            return r2
    }

    private java.lang.reflect.Constructor<?> findCtorByArgCount(java.lang.Class<?> r4, int r5) {
            r3 = this;
            r0 = 0
            if (r4 != 0) goto L4
            return r0
        L4:
            java.util.List r4 = h.Hchat.utils.KavaReflector.declaredConstructors(r4)
            java.util.Iterator r4 = r4.iterator()
        Lc:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L20
            java.lang.Object r1 = r4.next()
            java.lang.reflect.Constructor r1 = (java.lang.reflect.Constructor) r1
            java.lang.Class[] r2 = r1.getParameterTypes()
            int r2 = r2.length
            if (r2 != r5) goto Lc
            return r1
        L20:
            return r0
    }

    private java.lang.reflect.Constructor<?> findCtorByExactTypes(java.lang.Class<?> r7, java.lang.Class<?>... r8) {
            r6 = this;
            r0 = 0
            if (r7 == 0) goto L32
            if (r8 != 0) goto L6
            goto L32
        L6:
            java.util.List r7 = h.Hchat.utils.KavaReflector.declaredConstructors(r7)
            java.util.Iterator r7 = r7.iterator()
        Le:
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto L32
            java.lang.Object r1 = r7.next()
            java.lang.reflect.Constructor r1 = (java.lang.reflect.Constructor) r1
            java.lang.Class[] r2 = r1.getParameterTypes()
            int r3 = r2.length
            int r4 = r8.length
            if (r3 == r4) goto L23
            goto Le
        L23:
            r3 = 0
        L24:
            int r4 = r2.length
            if (r3 >= r4) goto L31
            r4 = r2[r3]
            r5 = r8[r3]
            if (r4 == r5) goto L2e
            goto Le
        L2e:
            int r3 = r3 + 1
            goto L24
        L31:
            return r1
        L32:
            return r0
    }

    private java.lang.reflect.Constructor<?> findDelChatroomMemberCtor(java.lang.Class<?> r6) {
            r5 = this;
            r0 = 0
            if (r6 != 0) goto L4
            return r0
        L4:
            java.util.List r6 = h.Hchat.utils.KavaReflector.declaredConstructors(r6)
            java.util.Iterator r6 = r6.iterator()
        Lc:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L46
            java.lang.Object r1 = r6.next()
            java.lang.reflect.Constructor r1 = (java.lang.reflect.Constructor) r1
            java.lang.Class[] r2 = r1.getParameterTypes()
            int r3 = r2.length
            r4 = 3
            if (r3 == r4) goto L21
            goto Lc
        L21:
            r3 = 0
            r3 = r2[r3]
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            if (r3 == r4) goto L29
            goto Lc
        L29:
            r3 = 1
            r3 = r2[r3]
            java.lang.Class<java.util.List> r4 = java.util.List.class
            boolean r3 = r4.isAssignableFrom(r3)
            if (r3 != 0) goto L35
            goto Lc
        L35:
            r3 = 2
            r2 = r2[r3]
            java.lang.Class r3 = java.lang.Integer.TYPE
            if (r2 == r3) goto L41
            java.lang.Class<java.lang.Integer> r3 = java.lang.Integer.class
            if (r2 == r3) goto L41
            goto Lc
        L41:
            java.lang.reflect.Constructor r6 = h.Hchat.utils.KavaReflector.accessible(r1)
            return r6
        L46:
            return r0
    }

    private java.lang.reflect.Method findEmojiDecodeManagerGetter(java.lang.Class<?> r5) {
            r4 = this;
            r0 = 0
            if (r5 != 0) goto L4
            return r0
        L4:
            java.util.List r1 = h.Hchat.utils.KavaReflector.declaredMethods(r5)
            java.util.Iterator r1 = r1.iterator()
        Lc:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L2c
            java.lang.Object r2 = r1.next()
            java.lang.reflect.Method r2 = (java.lang.reflect.Method) r2
            boolean r3 = h.Hchat.utils.KavaReflector.isStatic(r2)
            if (r3 == 0) goto Lc
            java.lang.Class[] r3 = r2.getParameterTypes()
            int r3 = r3.length
            if (r3 != 0) goto Lc
            java.lang.Class r3 = r2.getReturnType()
            if (r3 != r5) goto Lc
            return r2
        L2c:
            return r0
    }

    private java.lang.reflect.Method findFavoriteGetMethod(java.lang.Class<?> r4) {
            r3 = this;
            r0 = 0
            if (r4 == 0) goto L24
            java.lang.Class<?> r1 = r3.favoriteItemClass
            if (r1 != 0) goto L8
            goto L24
        L8:
            java.util.List r4 = h.Hchat.utils.KavaReflector.declaredMethods(r4)
            java.util.Iterator r4 = r4.iterator()
        L10:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L24
            java.lang.Object r1 = r4.next()
            java.lang.reflect.Method r1 = (java.lang.reflect.Method) r1
            boolean r2 = r3.isFavoriteGetMethod(r1)
            if (r2 != 0) goto L23
            goto L10
        L23:
            return r1
        L24:
            return r0
    }

    private java.lang.reflect.Method findFavoriteItemConvertFromCursorMethod(java.lang.Class<?> r5) {
            r4 = this;
            r0 = 0
            if (r5 != 0) goto L4
            return r0
        L4:
            java.lang.Class<android.database.Cursor> r1 = android.database.Cursor.class
            java.lang.Class[] r1 = new java.lang.Class[]{r1}
            java.lang.String r2 = "convertFrom"
            java.lang.reflect.Method r1 = h.Hchat.utils.KavaReflector.findMethodRecursive(r5, r2, r1)
            boolean r2 = r4.isFavoriteItemConvertFromCursorMethod(r1)
            if (r2 == 0) goto L1a
            h.Hchat.utils.KavaReflector.accessible(r1)
            return r1
        L1a:
            if (r5 == 0) goto L44
            java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
            if (r5 == r1) goto L44
            java.util.List r1 = h.Hchat.utils.KavaReflector.declaredMethods(r5)
            java.util.Iterator r1 = r1.iterator()
        L28:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L3f
            java.lang.Object r2 = r1.next()
            java.lang.reflect.Method r2 = (java.lang.reflect.Method) r2
            boolean r3 = r4.isFavoriteItemConvertFromCursorMethod(r2)
            if (r3 != 0) goto L3b
            goto L28
        L3b:
            h.Hchat.utils.KavaReflector.accessible(r2)
            return r2
        L3f:
            java.lang.Class r5 = r5.getSuperclass()
            goto L1a
        L44:
            return r0
    }

    private java.lang.reflect.Method findFavoriteListCursorMethod() {
            r3 = this;
            org.luckypray.dexkit.DexKitBridge r0 = r3.dexKit
            java.lang.String r1 = "tryStartBatchGet..."
            java.lang.String[] r1 = new java.lang.String[]{r1}
            ch.e r1 = r3.mkMethodUsingStrings(r1)
            hh.p r0 = r0.findMethod(r1)
            java.util.Iterator r0 = r0.iterator()
        L14:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L31
            java.lang.Object r1 = r0.next()
            hh.o r1 = (hh.o) r1
            java.lang.ClassLoader r2 = r3.classLoader     // Catch: java.lang.Throwable -> L14
            java.lang.reflect.Method r1 = r1.r(r2)     // Catch: java.lang.Throwable -> L14
            boolean r2 = r3.isFavoriteListCursorMethod(r1)     // Catch: java.lang.Throwable -> L14
            if (r2 != 0) goto L2d
            goto L14
        L2d:
            h.Hchat.utils.KavaReflector.accessible(r1)     // Catch: java.lang.Throwable -> L14
            return r1
        L31:
            r0 = 0
            return r0
    }

    private java.lang.Class<?> findFirstClassByStrings(java.lang.String... r3) {
            r2 = this;
            org.luckypray.dexkit.DexKitBridge r0 = r2.dexKit     // Catch: java.lang.Throwable -> L27
            ch.c r3 = r2.mkClassUsingStrings(r3)     // Catch: java.lang.Throwable -> L27
            hh.j r3 = r0.findClass(r3)     // Catch: java.lang.Throwable -> L27
            java.util.Iterator r3 = r3.iterator()     // Catch: java.lang.Throwable -> L27
        Le:
            boolean r0 = r3.hasNext()     // Catch: java.lang.Throwable -> L27
            if (r0 == 0) goto L27
            java.lang.Object r0 = r3.next()     // Catch: java.lang.Throwable -> L27
            hh.i r0 = (hh.i) r0     // Catch: java.lang.Throwable -> L27
            lh.a r0 = r0.p()     // Catch: java.lang.Throwable -> Le
            java.lang.String r0 = r0.f8057g     // Catch: java.lang.Throwable -> Le
            java.lang.ClassLoader r1 = r2.classLoader     // Catch: java.lang.Throwable -> Le
            java.lang.Class r3 = h.Hchat.utils.KavaReflector.loadClass(r0, r1)     // Catch: java.lang.Throwable -> Le
            return r3
        L27:
            r3 = 0
            return r3
    }

    private java.lang.reflect.Constructor<?> findFirstCtorByArgCounts(java.lang.Class<?> r5, int... r6) {
            r4 = this;
            r0 = 0
            if (r5 == 0) goto L16
            if (r6 != 0) goto L6
            goto L16
        L6:
            int r1 = r6.length
            r2 = 0
        L8:
            if (r2 >= r1) goto L16
            r3 = r6[r2]
            java.lang.reflect.Constructor r3 = r4.findCtorByArgCount(r5, r3)
            if (r3 == 0) goto L13
            return r3
        L13:
            int r2 = r2 + 1
            goto L8
        L16:
            return r0
    }

    private java.lang.Class<?> findFirstLikelyQueueClass() {
            r3 = this;
            java.util.List<java.lang.Class<?>> r0 = r3.netQueueCandidateClasses
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L19
            java.lang.Object r1 = r0.next()
            java.lang.Class r1 = (java.lang.Class) r1
            boolean r2 = r3.hasLikelyQueueSendMethod(r1)
            if (r2 == 0) goto L6
            return r1
        L19:
            r0 = 0
            return r0
    }

    private java.lang.Class<?> findGenericRespClass() {
            r9 = this;
            java.lang.String r0 = "int"
            java.lang.String r1 = "op"
            ch.c r2 = new ch.c     // Catch: java.lang.Throwable -> L8f
            r2.<init>()     // Catch: java.lang.Throwable -> L8f
            fh.a r3 = new fh.a     // Catch: java.lang.Throwable -> L8f
            r3.<init>()     // Catch: java.lang.Throwable -> L8f
            fh.j r4 = r3.f3937i     // Catch: java.lang.Throwable -> L8f
            if (r4 != 0) goto L18
            fh.j r4 = new fh.j     // Catch: java.lang.Throwable -> L8f
            r5 = 0
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L8f
        L18:
            r3.f3937i = r4     // Catch: java.lang.Throwable -> L8f
            gh.a r5 = new gh.a     // Catch: java.lang.Throwable -> L8f
            r5.<init>()     // Catch: java.lang.Throwable -> L8f
            r6 = 0
            r5.f4566g = r6     // Catch: java.lang.Throwable -> L8f
            r7 = 1
            r5.f4567h = r7     // Catch: java.lang.Throwable -> L8f
            r4.f3949i = r5     // Catch: java.lang.Throwable -> L8f
            fh.k r4 = new fh.k     // Catch: java.lang.Throwable -> L8f
            r4.<init>()     // Catch: java.lang.Throwable -> L8f
            java.lang.String r5 = "<init>"
            gh.c r7 = new gh.c     // Catch: java.lang.Throwable -> L8f
            r8 = 5
            r7.<init>(r5, r8)     // Catch: java.lang.Throwable -> L8f
            r4.f3950g = r7     // Catch: java.lang.Throwable -> L8f
            r3.l0(r4)     // Catch: java.lang.Throwable -> L8f
            fh.k r4 = new fh.k     // Catch: java.lang.Throwable -> L8f
            r4.<init>()     // Catch: java.lang.Throwable -> L8f
            gh.c r5 = new gh.c     // Catch: java.lang.Throwable -> L8f
            r5.<init>(r1, r8)     // Catch: java.lang.Throwable -> L8f
            r4.f3950g = r5     // Catch: java.lang.Throwable -> L8f
            java.lang.String r5 = "java.lang.Object[]"
            java.lang.String[] r5 = new java.lang.String[]{r0, r5}     // Catch: java.lang.Throwable -> L8f
            r4.o0(r5)     // Catch: java.lang.Throwable -> L8f
            fh.k.q0(r4, r0)     // Catch: java.lang.Throwable -> L8f
            r3.l0(r4)     // Catch: java.lang.Throwable -> L8f
            r2.f1664h = r3     // Catch: java.lang.Throwable -> L8f
            org.luckypray.dexkit.DexKitBridge r0 = r9.dexKit     // Catch: java.lang.Throwable -> L8f
            hh.j r0 = r0.findClass(r2)     // Catch: java.lang.Throwable -> L8f
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L8f
        L60:
            boolean r2 = r0.hasNext()     // Catch: java.lang.Throwable -> L8f
            if (r2 == 0) goto L8f
            java.lang.Object r2 = r0.next()     // Catch: java.lang.Throwable -> L8f
            hh.i r2 = (hh.i) r2     // Catch: java.lang.Throwable -> L8f
            lh.a r2 = r2.p()     // Catch: java.lang.Throwable -> L60
            java.lang.String r2 = r2.f8057g     // Catch: java.lang.Throwable -> L60
            java.lang.ClassLoader r3 = r9.classLoader     // Catch: java.lang.Throwable -> L60
            java.lang.Class r2 = h.Hchat.utils.KavaReflector.loadClass(r2, r3)     // Catch: java.lang.Throwable -> L60
            java.lang.Class[] r3 = new java.lang.Class[r6]     // Catch: java.lang.Throwable -> L60
            java.lang.reflect.Constructor r3 = h.Hchat.utils.KavaReflector.findConstructor(r2, r3)     // Catch: java.lang.Throwable -> L60
            if (r3 == 0) goto L60
            java.lang.Class r3 = java.lang.Integer.TYPE     // Catch: java.lang.Throwable -> L60
            java.lang.Class<java.lang.Object[]> r4 = java.lang.Object[].class
            java.lang.Class[] r3 = new java.lang.Class[]{r3, r4}     // Catch: java.lang.Throwable -> L60
            java.lang.reflect.Method r3 = h.Hchat.utils.KavaReflector.findMethod(r2, r1, r3)     // Catch: java.lang.Throwable -> L60
            if (r3 == 0) goto L60
            return r2
        L8f:
            r0 = 0
            return r0
    }

    private java.lang.reflect.Method findGroupSolitaireSendMethod(java.lang.Class<?> r6) {
            r5 = this;
            r0 = 0
            if (r6 != 0) goto L4
            return r0
        L4:
            java.util.List r6 = h.Hchat.utils.KavaReflector.declaredMethods(r6)
            java.util.Iterator r6 = r6.iterator()
        Lc:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L69
            java.lang.Object r1 = r6.next()
            java.lang.reflect.Method r1 = (java.lang.reflect.Method) r1
            java.lang.Class[] r2 = r1.getParameterTypes()
            int r3 = r2.length
            r4 = 6
            if (r3 == r4) goto L21
            goto Lc
        L21:
            r3 = 0
            r3 = r2[r3]
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            if (r3 != r4) goto Lc
            r3 = 1
            r3 = r2[r3]
            if (r3 == r4) goto L2e
            goto Lc
        L2e:
            r3 = 2
            r3 = r2[r3]
            java.lang.String r3 = r3.getName()
            java.lang.String r4 = "jh2.a"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto Lc
            r3 = 3
            r3 = r2[r3]
            java.lang.String r3 = r3.getName()
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto Lc
            r3 = 4
            r3 = r2[r3]
            java.lang.String r3 = r3.getName()
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L58
            goto Lc
        L58:
            r3 = 5
            r2 = r2[r3]
            java.lang.Class r3 = java.lang.Boolean.TYPE
            if (r2 == r3) goto L64
            java.lang.Class<java.lang.Boolean> r3 = java.lang.Boolean.class
            if (r2 == r3) goto L64
            goto Lc
        L64:
            java.lang.reflect.Method r6 = h.Hchat.utils.KavaReflector.accessible(r1)
            return r6
        L69:
            return r0
    }

    private java.lang.reflect.Method findImageStorageGetter(java.lang.Class<?> r4) {
            r3 = this;
            if (r4 != 0) goto L3
            goto L42
        L3:
            ch.e r0 = new ch.e     // Catch: java.lang.Throwable -> L42
            r0.<init>()     // Catch: java.lang.Throwable -> L42
            fh.k r1 = new fh.k     // Catch: java.lang.Throwable -> L42
            r1.<init>()     // Catch: java.lang.Throwable -> L42
            r2 = 0
            r1.m0(r2)     // Catch: java.lang.Throwable -> L42
            java.lang.String r2 = r4.getName()     // Catch: java.lang.Throwable -> L42
            fh.k.q0(r1, r2)     // Catch: java.lang.Throwable -> L42
            r0.f1666h = r1     // Catch: java.lang.Throwable -> L42
            org.luckypray.dexkit.DexKitBridge r1 = r3.dexKit     // Catch: java.lang.Throwable -> L42
            hh.p r0 = r1.findMethod(r0)     // Catch: java.lang.Throwable -> L42
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L42
        L24:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L42
            if (r1 == 0) goto L42
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L42
            hh.o r1 = (hh.o) r1     // Catch: java.lang.Throwable -> L42
            java.lang.ClassLoader r2 = r3.classLoader     // Catch: java.lang.Throwable -> L24
            java.lang.reflect.Method r1 = r1.r(r2)     // Catch: java.lang.Throwable -> L24
            boolean r2 = r3.isImageStorageGetter(r1, r4)     // Catch: java.lang.Throwable -> L24
            if (r2 != 0) goto L3d
            goto L24
        L3d:
            java.lang.reflect.Method r4 = h.Hchat.utils.KavaReflector.accessible(r1)     // Catch: java.lang.Throwable -> L24
            return r4
        L42:
            r4 = 0
            return r4
    }

    private java.lang.reflect.Method findIndexedSetter(java.lang.Class<?> r12) {
            r11 = this;
            r0 = r12
        L1:
            r1 = 1
            java.lang.Class<java.lang.Integer> r2 = java.lang.Integer.class
            java.lang.Class r3 = java.lang.Integer.TYPE
            r4 = 0
            r5 = 2
            java.lang.Class<java.lang.Object> r6 = java.lang.Object.class
            if (r0 == 0) goto L49
            if (r0 == r6) goto L49
            java.util.List r7 = h.Hchat.utils.KavaReflector.declaredMethods(r0)
            java.util.Iterator r7 = r7.iterator()
        L16:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L44
            java.lang.Object r8 = r7.next()
            java.lang.reflect.Method r8 = (java.lang.reflect.Method) r8
            java.lang.Class[] r9 = r8.getParameterTypes()
            int r10 = r9.length
            if (r10 != r5) goto L16
            r10 = r9[r4]
            if (r10 == r3) goto L2f
            if (r10 != r2) goto L16
        L2f:
            r9 = r9[r1]
            if (r9 != r6) goto L16
            java.lang.String r9 = "set"
            java.lang.String r10 = r8.getName()
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L16
            java.lang.reflect.Method r12 = h.Hchat.utils.KavaReflector.accessible(r8)
            return r12
        L44:
            java.lang.Class r0 = r0.getSuperclass()
            goto L1
        L49:
            if (r12 == 0) goto L7c
            if (r12 == r6) goto L7c
            java.util.List r0 = h.Hchat.utils.KavaReflector.declaredMethods(r12)
            java.util.Iterator r0 = r0.iterator()
        L55:
            boolean r7 = r0.hasNext()
            if (r7 == 0) goto L77
            java.lang.Object r7 = r0.next()
            java.lang.reflect.Method r7 = (java.lang.reflect.Method) r7
            java.lang.Class[] r8 = r7.getParameterTypes()
            int r9 = r8.length
            if (r9 != r5) goto L55
            r9 = r8[r4]
            if (r9 == r3) goto L6e
            if (r9 != r2) goto L55
        L6e:
            r8 = r8[r1]
            if (r8 != r6) goto L55
            java.lang.reflect.Method r12 = h.Hchat.utils.KavaReflector.accessible(r7)
            return r12
        L77:
            java.lang.Class r12 = r12.getSuperclass()
            goto L49
        L7c:
            r12 = 0
            return r12
    }

    private java.lang.reflect.Constructor<?> findInviteChatroomMemberCtor(java.lang.Class<?> r6) {
            r5 = this;
            r0 = 0
            if (r6 != 0) goto L4
            return r0
        L4:
            java.util.List r6 = h.Hchat.utils.KavaReflector.declaredConstructors(r6)
            java.util.Iterator r6 = r6.iterator()
        Lc:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L46
            java.lang.Object r1 = r6.next()
            java.lang.reflect.Constructor r1 = (java.lang.reflect.Constructor) r1
            java.lang.Class[] r2 = r1.getParameterTypes()
            int r3 = r2.length
            r4 = 4
            if (r3 == r4) goto L21
            goto Lc
        L21:
            r3 = 0
            r3 = r2[r3]
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            if (r3 == r4) goto L29
            goto Lc
        L29:
            r3 = 1
            r3 = r2[r3]
            java.lang.Class<java.util.List> r4 = java.util.List.class
            boolean r3 = r4.isAssignableFrom(r3)
            if (r3 != 0) goto L35
            goto Lc
        L35:
            r3 = 2
            r2 = r2[r3]
            java.lang.Class r3 = java.lang.Integer.TYPE
            if (r2 == r3) goto L41
            java.lang.Class<java.lang.Integer> r3 = java.lang.Integer.class
            if (r2 == r3) goto L41
            goto Lc
        L41:
            java.lang.reflect.Constructor r6 = h.Hchat.utils.KavaReflector.accessible(r1)
            return r6
        L46:
            return r0
    }

    private java.lang.reflect.Constructor<?> findLocalMessageConstructor(java.lang.Class<?> r2) {
            r1 = this;
            r0 = 0
            java.lang.Class[] r0 = new java.lang.Class[r0]
            java.lang.reflect.Constructor r0 = r1.findCtorByExactTypes(r2, r0)
            if (r0 == 0) goto La
            return r0
        La:
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            java.lang.Class[] r0 = new java.lang.Class[]{r0}
            java.lang.reflect.Constructor r2 = r1.findCtorByExactTypes(r2, r0)
            return r2
    }

    private java.lang.reflect.Method findLocalMessageCreateTimeMethod(java.lang.Class<?> r5) {
            r4 = this;
            r0 = 0
            if (r5 != 0) goto L4
            return r0
        L4:
            java.util.List r5 = h.Hchat.utils.KavaReflector.declaredMethods(r5)
            java.util.Iterator r5 = r5.iterator()
        Lc:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L37
            java.lang.Object r1 = r5.next()
            java.lang.reflect.Method r1 = (java.lang.reflect.Method) r1
            boolean r2 = r4.isLocalMessageCreateTimeMethod(r1)
            if (r2 != 0) goto L1f
            goto Lc
        L1f:
            java.lang.String r2 = "m"
            java.lang.String r3 = r1.getName()
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L30
            java.lang.reflect.Method r5 = h.Hchat.utils.KavaReflector.accessible(r1)
            return r5
        L30:
            if (r0 != 0) goto Lc
            java.lang.reflect.Method r0 = h.Hchat.utils.KavaReflector.accessible(r1)
            goto Lc
        L37:
            return r0
    }

    private java.lang.reflect.Method findMarsStartDownloadMethod(java.lang.Class<?> r9, java.lang.Class<?> r10, java.lang.Class<?> r11) {
            r8 = this;
            r0 = 0
            if (r9 == 0) goto L42
            if (r10 == 0) goto L42
            if (r11 != 0) goto L8
            goto L42
        L8:
            java.lang.reflect.Method[] r9 = r9.getDeclaredMethods()
            int r1 = r9.length
            r2 = 0
            r3 = r2
        Lf:
            if (r3 >= r1) goto L42
            r4 = r9[r3]
            java.lang.String r5 = "startC2CDownload"
            java.lang.String r6 = r4.getName()
            boolean r5 = r5.equals(r6)
            if (r5 != 0) goto L20
            goto L3b
        L20:
            java.lang.Class[] r5 = r4.getParameterTypes()
            int r6 = r5.length
            r7 = 2
            if (r6 == r7) goto L29
            goto L3b
        L29:
            r6 = r5[r2]
            boolean r6 = r8.sameOrAssignable(r6, r10)
            if (r6 != 0) goto L32
            goto L3b
        L32:
            r6 = 1
            r5 = r5[r6]
            boolean r5 = r8.sameOrAssignable(r5, r11)
            if (r5 != 0) goto L3e
        L3b:
            int r3 = r3 + 1
            goto Lf
        L3e:
            h.Hchat.utils.KavaReflector.accessible(r4)
            return r4
        L42:
            return r0
    }

    private java.lang.Class<?> findNewSendMsgReqClass(java.lang.Class<?> r5) {
            r4 = this;
            java.lang.Class<?> r0 = r4.protobufRawReqClass
            r1 = 0
            if (r0 == 0) goto La
            java.lang.Class r0 = r0.getSuperclass()
            goto Lb
        La:
            r0 = r1
        Lb:
            if (r0 != 0) goto Lf
            goto L96
        Lf:
            ch.c r2 = new ch.c     // Catch: java.lang.Throwable -> L5b
            r2.<init>()     // Catch: java.lang.Throwable -> L5b
            fh.a r3 = new fh.a     // Catch: java.lang.Throwable -> L5b
            r3.<init>()     // Catch: java.lang.Throwable -> L5b
            java.lang.String r0 = r0.getName()     // Catch: java.lang.Throwable -> L5b
            r3.o0(r0)     // Catch: java.lang.Throwable -> L5b
            r0 = 2
            r3.n0(r0)     // Catch: java.lang.Throwable -> L5b
            java.lang.Class r0 = java.lang.Integer.TYPE     // Catch: java.lang.Throwable -> L5b
            r3.k0(r0)     // Catch: java.lang.Throwable -> L5b
            java.lang.Class<java.util.LinkedList> r0 = java.util.LinkedList.class
            r3.k0(r0)     // Catch: java.lang.Throwable -> L5b
            r2.f1664h = r3     // Catch: java.lang.Throwable -> L5b
            org.luckypray.dexkit.DexKitBridge r0 = r4.dexKit     // Catch: java.lang.Throwable -> L5b
            hh.j r0 = r0.findClass(r2)     // Catch: java.lang.Throwable -> L5b
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L5b
        L3a:
            boolean r2 = r0.hasNext()     // Catch: java.lang.Throwable -> L5b
            if (r2 == 0) goto L5b
            java.lang.Object r2 = r0.next()     // Catch: java.lang.Throwable -> L5b
            hh.i r2 = (hh.i) r2     // Catch: java.lang.Throwable -> L5b
            lh.a r2 = r2.p()     // Catch: java.lang.Throwable -> L3a
            java.lang.String r2 = r2.f8057g     // Catch: java.lang.Throwable -> L3a
            java.lang.ClassLoader r3 = r4.classLoader     // Catch: java.lang.Throwable -> L3a
            java.lang.Class r2 = h.Hchat.utils.KavaReflector.loadClass(r2, r3)     // Catch: java.lang.Throwable -> L3a
            if (r2 == 0) goto L3a
            boolean r3 = r4.hasParseFromMethod(r2)     // Catch: java.lang.Throwable -> L3a
            if (r3 == 0) goto L3a
            return r2
        L5b:
            java.lang.String r0 = "/cgi-bin/micromsg-bin/newsendmsg"
            java.lang.String[] r0 = new java.lang.String[]{r0}     // Catch: java.lang.Throwable -> L96
            ch.c r0 = r4.mkClassUsingStrings(r0)     // Catch: java.lang.Throwable -> L96
            org.luckypray.dexkit.DexKitBridge r2 = r4.dexKit     // Catch: java.lang.Throwable -> L96
            hh.j r0 = r2.findClass(r0)     // Catch: java.lang.Throwable -> L96
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L96
        L6f:
            boolean r2 = r0.hasNext()     // Catch: java.lang.Throwable -> L96
            if (r2 == 0) goto L96
            java.lang.Object r2 = r0.next()     // Catch: java.lang.Throwable -> L96
            hh.i r2 = (hh.i) r2     // Catch: java.lang.Throwable -> L96
            lh.a r2 = r2.p()     // Catch: java.lang.Throwable -> L6f
            java.lang.String r2 = r2.f8057g     // Catch: java.lang.Throwable -> L6f
            java.lang.ClassLoader r3 = r4.classLoader     // Catch: java.lang.Throwable -> L6f
            java.lang.Class r2 = h.Hchat.utils.KavaReflector.loadClass(r2, r3)     // Catch: java.lang.Throwable -> L6f
            if (r2 == 0) goto L6f
            boolean r3 = r5.isAssignableFrom(r2)     // Catch: java.lang.Throwable -> L6f
            if (r3 == 0) goto L6f
            boolean r3 = r4.hasParseFromMethod(r2)     // Catch: java.lang.Throwable -> L6f
            if (r3 == 0) goto L6f
            return r2
        L96:
            return r1
    }

    private java.lang.Class<?> findOnGYNetEndClass() {
            r5 = this;
            ch.e r0 = new ch.e     // Catch: java.lang.Throwable -> L41
            r0.<init>()     // Catch: java.lang.Throwable -> L41
            fh.k r1 = new fh.k     // Catch: java.lang.Throwable -> L41
            r1.<init>()     // Catch: java.lang.Throwable -> L41
            java.lang.String r2 = "onGYNetEnd"
            gh.c r3 = new gh.c     // Catch: java.lang.Throwable -> L41
            r4 = 5
            r3.<init>(r2, r4)     // Catch: java.lang.Throwable -> L41
            r1.f3950g = r3     // Catch: java.lang.Throwable -> L41
            r2 = 6
            r1.m0(r2)     // Catch: java.lang.Throwable -> L41
            r0.f1666h = r1     // Catch: java.lang.Throwable -> L41
            org.luckypray.dexkit.DexKitBridge r1 = r5.dexKit     // Catch: java.lang.Throwable -> L41
            hh.p r0 = r1.findMethod(r0)     // Catch: java.lang.Throwable -> L41
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L41
        L24:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L41
            if (r1 == 0) goto L41
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L41
            hh.o r1 = (hh.o) r1     // Catch: java.lang.Throwable -> L41
            java.lang.ClassLoader r2 = r5.classLoader     // Catch: java.lang.Throwable -> L24
            java.lang.reflect.Method r1 = r1.r(r2)     // Catch: java.lang.Throwable -> L24
            boolean r2 = r5.isOnGYNetEndMethod(r1)     // Catch: java.lang.Throwable -> L24
            if (r2 == 0) goto L24
            java.lang.Class r0 = r1.getDeclaringClass()     // Catch: java.lang.Throwable -> L24
            return r0
        L41:
            r0 = 0
            return r0
    }

    private java.lang.Class<?> findOplogReqClass(java.lang.Class<?> r10) {
            r9 = this;
            java.lang.Class r0 = java.lang.Integer.TYPE
            if (r10 != 0) goto L6
            goto L102
        L6:
            r1 = 1
            r2 = 5
            ch.c r3 = new ch.c     // Catch: java.lang.Throwable -> L6e
            r3.<init>()     // Catch: java.lang.Throwable -> L6e
            fh.a r4 = new fh.a     // Catch: java.lang.Throwable -> L6e
            r4.<init>()     // Catch: java.lang.Throwable -> L6e
            java.lang.String r5 = r10.getName()     // Catch: java.lang.Throwable -> L6e
            r4.o0(r5)     // Catch: java.lang.Throwable -> L6e
            java.lang.String r5 = "/cgi-bin/micromsg-bin/oplog"
            java.lang.String[] r5 = new java.lang.String[]{r5}     // Catch: java.lang.Throwable -> L6e
            r4.q0(r5)     // Catch: java.lang.Throwable -> L6e
            r4.n0(r1)     // Catch: java.lang.Throwable -> L6e
            fh.k r5 = new fh.k     // Catch: java.lang.Throwable -> L6e
            r5.<init>()     // Catch: java.lang.Throwable -> L6e
            java.lang.String r6 = "op"
            gh.c r7 = new gh.c     // Catch: java.lang.Throwable -> L6e
            r7.<init>(r6, r2)     // Catch: java.lang.Throwable -> L6e
            r5.f3950g = r7     // Catch: java.lang.Throwable -> L6e
            java.lang.String r6 = "int"
            java.lang.String r7 = "java.lang.Object[]"
            java.lang.String[] r6 = new java.lang.String[]{r6, r7}     // Catch: java.lang.Throwable -> L6e
            r5.o0(r6)     // Catch: java.lang.Throwable -> L6e
            r4.l0(r5)     // Catch: java.lang.Throwable -> L6e
            r3.f1664h = r4     // Catch: java.lang.Throwable -> L6e
            org.luckypray.dexkit.DexKitBridge r4 = r9.dexKit     // Catch: java.lang.Throwable -> L6e
            hh.j r3 = r4.findClass(r3)     // Catch: java.lang.Throwable -> L6e
            java.util.Iterator r3 = r3.iterator()     // Catch: java.lang.Throwable -> L6e
        L4d:
            boolean r4 = r3.hasNext()     // Catch: java.lang.Throwable -> L6e
            if (r4 == 0) goto L6e
            java.lang.Object r4 = r3.next()     // Catch: java.lang.Throwable -> L6e
            hh.i r4 = (hh.i) r4     // Catch: java.lang.Throwable -> L6e
            lh.a r4 = r4.p()     // Catch: java.lang.Throwable -> L4d
            java.lang.String r4 = r4.f8057g     // Catch: java.lang.Throwable -> L4d
            java.lang.ClassLoader r5 = r9.classLoader     // Catch: java.lang.Throwable -> L4d
            java.lang.Class r4 = h.Hchat.utils.KavaReflector.loadClass(r4, r5)     // Catch: java.lang.Throwable -> L4d
            if (r4 == 0) goto L4d
            boolean r5 = r10.isAssignableFrom(r4)     // Catch: java.lang.Throwable -> L4d
            if (r5 == 0) goto L4d
            return r4
        L6e:
            ch.c r3 = new ch.c     // Catch: java.lang.Throwable -> L102
            r3.<init>()     // Catch: java.lang.Throwable -> L102
            fh.a r4 = new fh.a     // Catch: java.lang.Throwable -> L102
            r4.<init>()     // Catch: java.lang.Throwable -> L102
            fh.l r5 = new fh.l     // Catch: java.lang.Throwable -> L102
            r5.<init>()     // Catch: java.lang.Throwable -> L102
            fh.k r6 = new fh.k     // Catch: java.lang.Throwable -> L102
            r6.<init>()     // Catch: java.lang.Throwable -> L102
            java.lang.String r7 = "getFuncId"
            gh.c r8 = new gh.c     // Catch: java.lang.Throwable -> L102
            r8.<init>(r7, r2)     // Catch: java.lang.Throwable -> L102
            r6.f3950g = r8     // Catch: java.lang.Throwable -> L102
            r6.p0(r0)     // Catch: java.lang.Throwable -> L102
            r7 = 681(0x2a9, float:9.54E-43)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch: java.lang.Throwable -> L102
            java.lang.Number[] r1 = new java.lang.Number[r1]     // Catch: java.lang.Throwable -> L102
            r8 = 0
            r1[r8] = r7     // Catch: java.lang.Throwable -> L102
            r6.s0(r1)     // Catch: java.lang.Throwable -> L102
            r5.k0(r6)     // Catch: java.lang.Throwable -> L102
            fh.k r1 = new fh.k     // Catch: java.lang.Throwable -> L102
            r1.<init>()     // Catch: java.lang.Throwable -> L102
            java.lang.String r6 = "toProtoBuf"
            gh.c r7 = new gh.c     // Catch: java.lang.Throwable -> L102
            r7.<init>(r6, r2)     // Catch: java.lang.Throwable -> L102
            r1.f3950g = r7     // Catch: java.lang.Throwable -> L102
            java.lang.Class<byte[]> r2 = byte[].class
            r1.p0(r2)     // Catch: java.lang.Throwable -> L102
            r5.k0(r1)     // Catch: java.lang.Throwable -> L102
            r4.f3938j = r5     // Catch: java.lang.Throwable -> L102
            r3.f1664h = r4     // Catch: java.lang.Throwable -> L102
            org.luckypray.dexkit.DexKitBridge r1 = r9.dexKit     // Catch: java.lang.Throwable -> L102
            hh.j r1 = r1.findClass(r3)     // Catch: java.lang.Throwable -> L102
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L102
        Lc3:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L102
            if (r2 == 0) goto L102
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L102
            hh.i r2 = (hh.i) r2     // Catch: java.lang.Throwable -> L102
            lh.a r2 = r2.p()     // Catch: java.lang.Throwable -> Lc3
            java.lang.String r2 = r2.f8057g     // Catch: java.lang.Throwable -> Lc3
            java.lang.ClassLoader r3 = r9.classLoader     // Catch: java.lang.Throwable -> Lc3
            java.lang.Class r2 = h.Hchat.utils.KavaReflector.loadClass(r2, r3)     // Catch: java.lang.Throwable -> Lc3
            java.util.List r2 = h.Hchat.utils.KavaReflector.declaredFields(r2)     // Catch: java.lang.Throwable -> Lc3
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> Lc3
        Le3:
            boolean r3 = r2.hasNext()     // Catch: java.lang.Throwable -> Lc3
            if (r3 == 0) goto Lc3
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Throwable -> Lc3
            java.lang.reflect.Field r3 = (java.lang.reflect.Field) r3     // Catch: java.lang.Throwable -> Lc3
            java.lang.Class r3 = r3.getType()     // Catch: java.lang.Throwable -> Lc3
            if (r3 == 0) goto Le3
            if (r3 == r0) goto Le3
            java.lang.Class<java.lang.Integer> r4 = java.lang.Integer.class
            if (r3 == r4) goto Le3
            boolean r4 = r10.isAssignableFrom(r3)     // Catch: java.lang.Throwable -> Lc3
            if (r4 == 0) goto Le3
            return r3
        L102:
            r10 = 0
            return r10
    }

    private java.lang.reflect.Method findPatCanSendMethod(java.lang.Class<?> r4) {
            r3 = this;
            r0 = 0
            if (r4 != 0) goto L4
            return r0
        L4:
            java.util.List r4 = h.Hchat.utils.KavaReflector.declaredMethods(r4)
            java.util.Iterator r4 = r4.iterator()
        Lc:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L23
            java.lang.Object r1 = r4.next()
            java.lang.reflect.Method r1 = (java.lang.reflect.Method) r1
            boolean r2 = r3.isPatCanSendMethod(r1)
            if (r2 == 0) goto Lc
            java.lang.reflect.Method r4 = h.Hchat.utils.KavaReflector.accessible(r1)
            return r4
        L23:
            return r0
    }

    private java.lang.reflect.Method findPatCanSendMethodByStrings(java.lang.String... r3) {
            r2 = this;
            org.luckypray.dexkit.DexKitBridge r0 = r2.dexKit     // Catch: java.lang.Throwable -> L2c
            ch.e r3 = r2.mkMethodUsingStrings(r3)     // Catch: java.lang.Throwable -> L2c
            hh.p r3 = r0.findMethod(r3)     // Catch: java.lang.Throwable -> L2c
            java.util.Iterator r3 = r3.iterator()     // Catch: java.lang.Throwable -> L2c
        Le:
            boolean r0 = r3.hasNext()     // Catch: java.lang.Throwable -> L2c
            if (r0 == 0) goto L2c
            java.lang.Object r0 = r3.next()     // Catch: java.lang.Throwable -> L2c
            hh.o r0 = (hh.o) r0     // Catch: java.lang.Throwable -> L2c
            java.lang.ClassLoader r1 = r2.classLoader     // Catch: java.lang.Throwable -> Le
            java.lang.reflect.Method r0 = r0.r(r1)     // Catch: java.lang.Throwable -> Le
            boolean r1 = r2.isPatCanSendMethod(r0)     // Catch: java.lang.Throwable -> Le
            if (r1 != 0) goto L27
            goto Le
        L27:
            java.lang.reflect.Method r3 = h.Hchat.utils.KavaReflector.accessible(r0)     // Catch: java.lang.Throwable -> Le
            return r3
        L2c:
            r3 = 0
            return r3
    }

    private java.lang.reflect.Method findPatCreatePairMethod(java.lang.Class<?> r4) {
            r3 = this;
            r0 = 0
            if (r4 != 0) goto L4
            return r0
        L4:
            java.util.List r4 = h.Hchat.utils.KavaReflector.declaredMethods(r4)
            java.util.Iterator r4 = r4.iterator()
        Lc:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L23
            java.lang.Object r1 = r4.next()
            java.lang.reflect.Method r1 = (java.lang.reflect.Method) r1
            boolean r2 = r3.isPatCreatePairMethod(r1)
            if (r2 == 0) goto Lc
            java.lang.reflect.Method r4 = h.Hchat.utils.KavaReflector.accessible(r1)
            return r4
        L23:
            return r0
    }

    private java.lang.reflect.Method findPatCreatePairMethodByStrings(java.lang.String... r3) {
            r2 = this;
            org.luckypray.dexkit.DexKitBridge r0 = r2.dexKit     // Catch: java.lang.Throwable -> L2c
            ch.e r3 = r2.mkMethodUsingStrings(r3)     // Catch: java.lang.Throwable -> L2c
            hh.p r3 = r0.findMethod(r3)     // Catch: java.lang.Throwable -> L2c
            java.util.Iterator r3 = r3.iterator()     // Catch: java.lang.Throwable -> L2c
        Le:
            boolean r0 = r3.hasNext()     // Catch: java.lang.Throwable -> L2c
            if (r0 == 0) goto L2c
            java.lang.Object r0 = r3.next()     // Catch: java.lang.Throwable -> L2c
            hh.o r0 = (hh.o) r0     // Catch: java.lang.Throwable -> L2c
            java.lang.ClassLoader r1 = r2.classLoader     // Catch: java.lang.Throwable -> Le
            java.lang.reflect.Method r0 = r0.r(r1)     // Catch: java.lang.Throwable -> Le
            boolean r1 = r2.isPatCreatePairMethod(r0)     // Catch: java.lang.Throwable -> Le
            if (r1 != 0) goto L27
            goto Le
        L27:
            java.lang.reflect.Method r3 = h.Hchat.utils.KavaReflector.accessible(r0)     // Catch: java.lang.Throwable -> Le
            return r3
        L2c:
            r3 = 0
            return r3
    }

    private java.lang.reflect.Method findPatSuffixMethod(java.lang.Class<?> r4) {
            r3 = this;
            r0 = 0
            if (r4 != 0) goto L4
            return r0
        L4:
            java.util.List r4 = h.Hchat.utils.KavaReflector.declaredMethods(r4)
            java.util.Iterator r4 = r4.iterator()
        Lc:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L23
            java.lang.Object r1 = r4.next()
            java.lang.reflect.Method r1 = (java.lang.reflect.Method) r1
            boolean r2 = r3.isPatSuffixMethod(r1)
            if (r2 == 0) goto Lc
            java.lang.reflect.Method r4 = h.Hchat.utils.KavaReflector.accessible(r1)
            return r4
        L23:
            return r0
    }

    private java.lang.reflect.Method findPatSuffixMethodByStrings(java.lang.String... r3) {
            r2 = this;
            org.luckypray.dexkit.DexKitBridge r0 = r2.dexKit     // Catch: java.lang.Throwable -> L2c
            ch.e r3 = r2.mkMethodUsingStrings(r3)     // Catch: java.lang.Throwable -> L2c
            hh.p r3 = r0.findMethod(r3)     // Catch: java.lang.Throwable -> L2c
            java.util.Iterator r3 = r3.iterator()     // Catch: java.lang.Throwable -> L2c
        Le:
            boolean r0 = r3.hasNext()     // Catch: java.lang.Throwable -> L2c
            if (r0 == 0) goto L2c
            java.lang.Object r0 = r3.next()     // Catch: java.lang.Throwable -> L2c
            hh.o r0 = (hh.o) r0     // Catch: java.lang.Throwable -> L2c
            java.lang.ClassLoader r1 = r2.classLoader     // Catch: java.lang.Throwable -> Le
            java.lang.reflect.Method r0 = r0.r(r1)     // Catch: java.lang.Throwable -> Le
            boolean r1 = r2.isPatSuffixMethod(r0)     // Catch: java.lang.Throwable -> Le
            if (r1 != 0) goto L27
            goto Le
        L27:
            java.lang.reflect.Method r3 = h.Hchat.utils.KavaReflector.accessible(r0)     // Catch: java.lang.Throwable -> Le
            return r3
        L2c:
            r3 = 0
            return r3
    }

    private java.lang.Class<?> findProtobufBaseClass() {
            r7 = this;
            ch.c r0 = new ch.c     // Catch: java.lang.Throwable -> L5e
            r0.<init>()     // Catch: java.lang.Throwable -> L5e
            fh.a r1 = new fh.a     // Catch: java.lang.Throwable -> L5e
            r1.<init>()     // Catch: java.lang.Throwable -> L5e
            java.lang.String r2 = "Cannot use this method"
            java.lang.String[] r2 = new java.lang.String[]{r2}     // Catch: java.lang.Throwable -> L5e
            r1.p0(r2)     // Catch: java.lang.Throwable -> L5e
            fh.l r2 = new fh.l     // Catch: java.lang.Throwable -> L5e
            r2.<init>()     // Catch: java.lang.Throwable -> L5e
            fh.k r3 = new fh.k     // Catch: java.lang.Throwable -> L5e
            r3.<init>()     // Catch: java.lang.Throwable -> L5e
            java.lang.String r4 = "op"
            gh.c r5 = new gh.c     // Catch: java.lang.Throwable -> L5e
            r6 = 5
            r5.<init>(r4, r6)     // Catch: java.lang.Throwable -> L5e
            r3.f3950g = r5     // Catch: java.lang.Throwable -> L5e
            java.lang.String r4 = "int"
            java.lang.String r5 = "java.lang.Object[]"
            java.lang.String[] r4 = new java.lang.String[]{r4, r5}     // Catch: java.lang.Throwable -> L5e
            r3.o0(r4)     // Catch: java.lang.Throwable -> L5e
            r2.k0(r3)     // Catch: java.lang.Throwable -> L5e
            r1.f3938j = r2     // Catch: java.lang.Throwable -> L5e
            r0.f1664h = r1     // Catch: java.lang.Throwable -> L5e
            org.luckypray.dexkit.DexKitBridge r1 = r7.dexKit     // Catch: java.lang.Throwable -> L5e
            hh.j r0 = r1.findClass(r0)     // Catch: java.lang.Throwable -> L5e
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L5e
        L43:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L5e
            if (r1 == 0) goto L5e
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L5e
            hh.i r1 = (hh.i) r1     // Catch: java.lang.Throwable -> L5e
            lh.a r1 = r1.p()     // Catch: java.lang.Throwable -> L43
            java.lang.String r1 = r1.f8057g     // Catch: java.lang.Throwable -> L43
            java.lang.ClassLoader r2 = r7.classLoader     // Catch: java.lang.Throwable -> L43
            java.lang.Class r1 = h.Hchat.utils.KavaReflector.loadClass(r1, r2)     // Catch: java.lang.Throwable -> L43
            if (r1 == 0) goto L43
            return r1
        L5e:
            r0 = 0
            return r0
    }

    private java.lang.Class<?> findProtobufNetSceneBaseClass() {
            r3 = this;
            java.lang.String r0 = "MicroMsg.NetSceneBase"
            java.lang.String[] r0 = new java.lang.String[]{r0}     // Catch: java.lang.Throwable -> L33
            ch.c r0 = r3.mkClassUsingStrings(r0)     // Catch: java.lang.Throwable -> L33
            org.luckypray.dexkit.DexKitBridge r1 = r3.dexKit     // Catch: java.lang.Throwable -> L33
            hh.j r0 = r1.findClass(r0)     // Catch: java.lang.Throwable -> L33
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L33
        L14:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L33
            if (r1 == 0) goto L33
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L33
            hh.i r1 = (hh.i) r1     // Catch: java.lang.Throwable -> L33
            lh.a r1 = r1.p()     // Catch: java.lang.Throwable -> L14
            java.lang.String r1 = r1.f8057g     // Catch: java.lang.Throwable -> L14
            java.lang.ClassLoader r2 = r3.classLoader     // Catch: java.lang.Throwable -> L14
            java.lang.Class r1 = h.Hchat.utils.KavaReflector.loadClass(r1, r2)     // Catch: java.lang.Throwable -> L14
            boolean r2 = r3.isProtobufNetSceneBaseClass(r1)     // Catch: java.lang.Throwable -> L14
            if (r2 == 0) goto L14
            return r1
        L33:
            java.util.List<java.lang.Class<?>> r0 = r3.packetBaseClasses
            if (r0 == 0) goto L47
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L47
            java.util.List<java.lang.Class<?>> r0 = r3.packetBaseClasses
            r1 = 0
            java.lang.Object r0 = r0.get(r1)
            java.lang.Class r0 = (java.lang.Class) r0
            return r0
        L47:
            r0 = 0
            return r0
    }

    private java.util.List<java.lang.reflect.Method> findProtobufSceneEndMethods() {
            r6 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.lang.Class<?> r1 = r6.protobufNetSceneBaseClass
            if (r1 != 0) goto La
            goto L54
        La:
            ch.e r1 = new ch.e     // Catch: java.lang.Throwable -> L54
            r1.<init>()     // Catch: java.lang.Throwable -> L54
            fh.k r2 = new fh.k     // Catch: java.lang.Throwable -> L54
            r2.<init>()     // Catch: java.lang.Throwable -> L54
            java.lang.String r3 = "onSceneEnd"
            gh.c r4 = new gh.c     // Catch: java.lang.Throwable -> L54
            r5 = 5
            r4.<init>(r3, r5)     // Catch: java.lang.Throwable -> L54
            r2.f3950g = r4     // Catch: java.lang.Throwable -> L54
            r3 = 4
            r2.m0(r3)     // Catch: java.lang.Throwable -> L54
            r1.f1666h = r2     // Catch: java.lang.Throwable -> L54
            org.luckypray.dexkit.DexKitBridge r2 = r6.dexKit     // Catch: java.lang.Throwable -> L54
            hh.p r1 = r2.findMethod(r1)     // Catch: java.lang.Throwable -> L54
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L54
        L2e:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L54
            if (r2 == 0) goto L54
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L54
            hh.o r2 = (hh.o) r2     // Catch: java.lang.Throwable -> L54
            java.lang.ClassLoader r3 = r6.classLoader     // Catch: java.lang.Throwable -> L2e
            java.lang.reflect.Method r2 = r2.r(r3)     // Catch: java.lang.Throwable -> L2e
            boolean r3 = r6.isProtobufSceneEndMethod(r2)     // Catch: java.lang.Throwable -> L2e
            if (r3 == 0) goto L2e
            boolean r3 = r0.contains(r2)     // Catch: java.lang.Throwable -> L2e
            if (r3 != 0) goto L2e
            java.lang.reflect.Method r2 = h.Hchat.utils.KavaReflector.accessible(r2)     // Catch: java.lang.Throwable -> L2e
            r0.add(r2)     // Catch: java.lang.Throwable -> L2e
            goto L2e
        L54:
            return r0
    }

    private java.lang.Class<?> findRawReqClass() {
            r9 = this;
            java.lang.String r0 = "toByteArray"
            java.lang.String r1 = "byte[]"
            java.lang.Class<byte[]> r2 = byte[].class
            ch.c r3 = new ch.c     // Catch: java.lang.Throwable -> L7a
            r3.<init>()     // Catch: java.lang.Throwable -> L7a
            fh.a r4 = new fh.a     // Catch: java.lang.Throwable -> L7a
            r4.<init>()     // Catch: java.lang.Throwable -> L7a
            r5 = 1
            r4.n0(r5)     // Catch: java.lang.Throwable -> L7a
            r4.k0(r2)     // Catch: java.lang.Throwable -> L7a
            fh.k r5 = new fh.k     // Catch: java.lang.Throwable -> L7a
            r5.<init>()     // Catch: java.lang.Throwable -> L7a
            java.lang.String r6 = "<init>"
            gh.c r7 = new gh.c     // Catch: java.lang.Throwable -> L7a
            r8 = 5
            r7.<init>(r6, r8)     // Catch: java.lang.Throwable -> L7a
            r5.f3950g = r7     // Catch: java.lang.Throwable -> L7a
            java.lang.String[] r6 = new java.lang.String[]{r1}     // Catch: java.lang.Throwable -> L7a
            r5.o0(r6)     // Catch: java.lang.Throwable -> L7a
            r4.l0(r5)     // Catch: java.lang.Throwable -> L7a
            fh.k r5 = new fh.k     // Catch: java.lang.Throwable -> L7a
            r5.<init>()     // Catch: java.lang.Throwable -> L7a
            gh.c r6 = new gh.c     // Catch: java.lang.Throwable -> L7a
            r6.<init>(r0, r8)     // Catch: java.lang.Throwable -> L7a
            r5.f3950g = r6     // Catch: java.lang.Throwable -> L7a
            fh.k.q0(r5, r1)     // Catch: java.lang.Throwable -> L7a
            r4.l0(r5)     // Catch: java.lang.Throwable -> L7a
            r3.f1664h = r4     // Catch: java.lang.Throwable -> L7a
            org.luckypray.dexkit.DexKitBridge r1 = r9.dexKit     // Catch: java.lang.Throwable -> L7a
            hh.j r1 = r1.findClass(r3)     // Catch: java.lang.Throwable -> L7a
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L7a
        L4e:
            boolean r3 = r1.hasNext()     // Catch: java.lang.Throwable -> L7a
            if (r3 == 0) goto L7a
            java.lang.Object r3 = r1.next()     // Catch: java.lang.Throwable -> L7a
            hh.i r3 = (hh.i) r3     // Catch: java.lang.Throwable -> L7a
            lh.a r3 = r3.p()     // Catch: java.lang.Throwable -> L4e
            java.lang.String r3 = r3.f8057g     // Catch: java.lang.Throwable -> L4e
            java.lang.ClassLoader r4 = r9.classLoader     // Catch: java.lang.Throwable -> L4e
            java.lang.Class r3 = h.Hchat.utils.KavaReflector.loadClass(r3, r4)     // Catch: java.lang.Throwable -> L4e
            java.lang.Class[] r4 = new java.lang.Class[]{r2}     // Catch: java.lang.Throwable -> L4e
            java.lang.reflect.Constructor r4 = h.Hchat.utils.KavaReflector.findConstructor(r3, r4)     // Catch: java.lang.Throwable -> L4e
            if (r4 == 0) goto L4e
            r4 = 0
            java.lang.Class[] r4 = new java.lang.Class[r4]     // Catch: java.lang.Throwable -> L4e
            java.lang.reflect.Method r4 = h.Hchat.utils.KavaReflector.findMethod(r3, r0, r4)     // Catch: java.lang.Throwable -> L4e
            if (r4 == 0) goto L4e
            return r3
        L7a:
            r0 = 0
            return r0
    }

    private java.lang.Class<?> findReqRespClassFromConfigBuilder() {
            r4 = this;
            java.lang.Class<?> r0 = r4.protobufConfigBuilderClass
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            java.util.List r0 = h.Hchat.utils.KavaReflector.declaredMethods(r0)
            java.util.Iterator r0 = r0.iterator()
        Le:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L3e
            java.lang.Object r2 = r0.next()
            java.lang.reflect.Method r2 = (java.lang.reflect.Method) r2
            java.lang.Class[] r3 = r2.getParameterTypes()     // Catch: java.lang.Throwable -> Le
            int r3 = r3.length     // Catch: java.lang.Throwable -> Le
            if (r3 == 0) goto L22
            goto Le
        L22:
            java.lang.Class r2 = r2.getReturnType()     // Catch: java.lang.Throwable -> Le
            if (r2 == 0) goto Le
            java.lang.Class r3 = java.lang.Void.TYPE     // Catch: java.lang.Throwable -> Le
            if (r2 == r3) goto Le
            boolean r3 = r2.isPrimitive()     // Catch: java.lang.Throwable -> Le
            if (r3 != 0) goto Le
            java.lang.Class<java.lang.String> r3 = java.lang.String.class
            if (r2 != r3) goto L37
            goto Le
        L37:
            boolean r3 = r4.hasReqRespShape(r2)     // Catch: java.lang.Throwable -> Le
            if (r3 == 0) goto Le
            return r2
        L3e:
            return r1
    }

    private java.lang.reflect.Constructor<?> findRevokeMsgCtor(java.lang.Class<?> r7) {
            r6 = this;
            r0 = 0
            if (r7 == 0) goto L4d
            java.lang.Class<?> r1 = r6.localMessageClass
            if (r1 != 0) goto L8
            goto L4d
        L8:
            java.util.List r7 = h.Hchat.utils.KavaReflector.declaredConstructors(r7)
            java.util.Iterator r7 = r7.iterator()
        L10:
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto L4d
            java.lang.Object r1 = r7.next()
            java.lang.reflect.Constructor r1 = (java.lang.reflect.Constructor) r1
            java.lang.Class[] r2 = r1.getParameterTypes()
            int r3 = r2.length
            r4 = 3
            if (r3 == r4) goto L25
            goto L10
        L25:
            r3 = 0
            r4 = r2[r3]
            java.lang.Class<?> r5 = r6.localMessageClass
            boolean r4 = r4.isAssignableFrom(r5)
            if (r4 != 0) goto L3b
            java.lang.Class<?> r4 = r6.localMessageClass
            r3 = r2[r3]
            boolean r3 = r4.isAssignableFrom(r3)
            if (r3 != 0) goto L3b
            goto L10
        L3b:
            r3 = 1
            r3 = r2[r3]
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            if (r3 != r4) goto L10
            r3 = 2
            r2 = r2[r3]
            if (r2 == r4) goto L48
            goto L10
        L48:
            java.lang.reflect.Constructor r7 = h.Hchat.utils.KavaReflector.accessible(r1)
            return r7
        L4d:
            return r0
    }

    private java.lang.reflect.Method findSendFileAppMsgMethod(java.lang.Class<?> r4) {
            r3 = this;
            r0 = 0
            if (r4 != 0) goto L4
            return r0
        L4:
            java.util.List r4 = h.Hchat.utils.KavaReflector.declaredMethods(r4)     // Catch: java.lang.Throwable -> L1f
            java.util.Iterator r4 = r4.iterator()     // Catch: java.lang.Throwable -> L1f
        Lc:
            boolean r1 = r4.hasNext()     // Catch: java.lang.Throwable -> L1f
            if (r1 == 0) goto L1f
            java.lang.Object r1 = r4.next()     // Catch: java.lang.Throwable -> L1f
            java.lang.reflect.Method r1 = (java.lang.reflect.Method) r1     // Catch: java.lang.Throwable -> L1f
            boolean r2 = r3.isSendFileAppMsgMethod(r1)     // Catch: java.lang.Throwable -> L1f
            if (r2 == 0) goto Lc
            return r1
        L1f:
            return r0
    }

    private java.lang.Class<?> findSendImageAppInfoClass() {
            r6 = this;
            java.lang.Class r0 = r6.findSendImageAppInfoClassFromCrossParams()
            if (r0 == 0) goto L7
            return r0
        L7:
            org.luckypray.dexkit.DexKitBridge r0 = r6.dexKit     // Catch: java.lang.Throwable -> L42
            java.lang.String r1 = "appid"
            java.lang.String r2 = "mediatagname"
            java.lang.String r3 = "messageext"
            java.lang.String r4 = "messageaction"
            java.lang.String r5 = "appinfo"
            java.lang.String[] r1 = new java.lang.String[]{r1, r2, r3, r4, r5}     // Catch: java.lang.Throwable -> L42
            ch.c r1 = r6.mkClassUsingStrings(r1)     // Catch: java.lang.Throwable -> L42
            hh.j r0 = r0.findClass(r1)     // Catch: java.lang.Throwable -> L42
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L42
        L23:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L42
            if (r1 == 0) goto L42
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L42
            hh.i r1 = (hh.i) r1     // Catch: java.lang.Throwable -> L42
            lh.a r1 = r1.p()     // Catch: java.lang.Throwable -> L23
            java.lang.String r1 = r1.f8057g     // Catch: java.lang.Throwable -> L23
            java.lang.ClassLoader r2 = r6.classLoader     // Catch: java.lang.Throwable -> L23
            java.lang.Class r1 = h.Hchat.utils.KavaReflector.loadClass(r1, r2)     // Catch: java.lang.Throwable -> L23
            boolean r2 = r6.isSendImageAppInfoClass(r1)     // Catch: java.lang.Throwable -> L23
            if (r2 == 0) goto L23
            return r1
        L42:
            r0 = 0
            return r0
    }

    private java.lang.Class<?> findSendImageAppInfoClassFromCrossParams() {
            r6 = this;
            java.lang.Class<?> r0 = r6.sendImageCrossParamsClass
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.lang.Class<?> r2 = r6.sendImageCrossParamsClass
            java.util.List r2 = h.Hchat.utils.KavaReflector.declaredFields(r2)
            java.util.Iterator r2 = r2.iterator()
        L15:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L53
            java.lang.Object r3 = r2.next()
            java.lang.reflect.Field r3 = (java.lang.reflect.Field) r3
            java.lang.Class r3 = r3.getType()
            if (r3 == 0) goto L15
            boolean r4 = r3.isPrimitive()
            if (r4 != 0) goto L15
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            if (r3 == r4) goto L15
            java.lang.Class<java.lang.Object> r4 = java.lang.Object.class
            if (r3 == r4) goto L15
            java.lang.String r4 = r3.getName()
            java.lang.String r5 = "java."
            boolean r4 = r4.startsWith(r5)
            if (r4 == 0) goto L42
            goto L15
        L42:
            boolean r4 = r6.hasDirectImageAppInfoFields(r3)
            if (r4 == 0) goto L49
            return r3
        L49:
            boolean r4 = r6.isSendImageAppInfoClass(r3)
            if (r4 == 0) goto L15
            r0.add(r3)
            goto L15
        L53:
            boolean r2 = r0.isEmpty()
            if (r2 == 0) goto L5a
            return r1
        L5a:
            r1 = 0
            java.lang.Object r0 = r0.get(r1)
            java.lang.Class r0 = (java.lang.Class) r0
            return r0
    }

    private java.lang.reflect.Constructor<?> findSendImageAsyncParamsCtor(java.lang.Class<?> r7) {
            r6 = this;
            r0 = 0
            if (r7 != 0) goto L4
            return r0
        L4:
            java.util.List r7 = h.Hchat.utils.KavaReflector.declaredConstructors(r7)
            java.util.Iterator r7 = r7.iterator()
        Lc:
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto L4d
            java.lang.Object r1 = r7.next()
            java.lang.reflect.Constructor r1 = (java.lang.reflect.Constructor) r1
            java.lang.Class[] r2 = r1.getParameterTypes()
            int r3 = r2.length
            r4 = 5
            if (r3 == r4) goto L21
            goto Lc
        L21:
            r3 = 0
            r3 = r2[r3]
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            if (r3 != r4) goto Lc
            r3 = 1
            r3 = r2[r3]
            java.lang.Class r5 = java.lang.Integer.TYPE
            if (r3 == r5) goto L33
            java.lang.Class<java.lang.Integer> r5 = java.lang.Integer.class
            if (r3 != r5) goto Lc
        L33:
            r3 = 2
            r3 = r2[r3]
            if (r3 != r4) goto Lc
            r3 = 3
            r3 = r2[r3]
            if (r3 != r4) goto Lc
            r3 = 4
            r2 = r2[r3]
            if (r2 == 0) goto Lc
            boolean r2 = r2.isPrimitive()
            if (r2 != 0) goto Lc
            java.lang.reflect.Constructor r7 = h.Hchat.utils.KavaReflector.accessible(r1)
            return r7
        L4d:
            return r0
    }

    private java.lang.reflect.Method findSendImageAsyncSubmitMethod() {
            r5 = this;
            java.lang.Class<?> r0 = r5.sendImageAsyncParamsClass
            r1 = 0
            if (r0 != 0) goto L6
            goto L50
        L6:
            ch.e r2 = new ch.e     // Catch: java.lang.Throwable -> L50
            r2.<init>()     // Catch: java.lang.Throwable -> L50
            fh.k r3 = new fh.k     // Catch: java.lang.Throwable -> L50
            r3.<init>()     // Catch: java.lang.Throwable -> L50
            java.lang.String r0 = r0.getName()     // Catch: java.lang.Throwable -> L50
            java.lang.String[] r0 = new java.lang.String[]{r0}     // Catch: java.lang.Throwable -> L50
            r3.o0(r0)     // Catch: java.lang.Throwable -> L50
            r2.f1666h = r3     // Catch: java.lang.Throwable -> L50
            org.luckypray.dexkit.DexKitBridge r0 = r5.dexKit     // Catch: java.lang.Throwable -> L50
            hh.p r0 = r0.findMethod(r2)     // Catch: java.lang.Throwable -> L50
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L50
            r2 = r1
        L28:
            boolean r3 = r0.hasNext()     // Catch: java.lang.Throwable -> L50
            if (r3 == 0) goto L4f
            java.lang.Object r3 = r0.next()     // Catch: java.lang.Throwable -> L50
            hh.o r3 = (hh.o) r3     // Catch: java.lang.Throwable -> L50
            java.lang.ClassLoader r4 = r5.classLoader     // Catch: java.lang.Throwable -> L28
            java.lang.reflect.Method r3 = r3.r(r4)     // Catch: java.lang.Throwable -> L28
            boolean r4 = r5.isSendImageAsyncSubmitMethod(r3)     // Catch: java.lang.Throwable -> L28
            if (r4 != 0) goto L41
            goto L28
        L41:
            h.Hchat.utils.KavaReflector.accessible(r3)     // Catch: java.lang.Throwable -> L28
            boolean r4 = r5.isKotlinFlowReturn(r3)     // Catch: java.lang.Throwable -> L28
            if (r4 == 0) goto L4b
            return r3
        L4b:
            if (r2 != 0) goto L28
            r2 = r3
            goto L28
        L4f:
            return r2
        L50:
            return r1
    }

    private java.lang.reflect.Constructor<?> findSendPatSceneCtor(java.lang.Class<?> r4) {
            r3 = this;
            if (r4 != 0) goto L4
            r4 = 0
            return r4
        L4:
            java.lang.Class r0 = java.lang.Integer.TYPE
            java.lang.Class<android.util.Pair> r1 = android.util.Pair.class
            java.lang.Class<java.lang.String> r2 = java.lang.String.class
            java.lang.Class[] r0 = new java.lang.Class[]{r1, r2, r2, r0}
            java.lang.reflect.Constructor r0 = r3.findCtorByExactTypes(r4, r0)
            if (r0 == 0) goto L15
            return r0
        L15:
            java.lang.Class<java.lang.Integer> r0 = java.lang.Integer.class
            java.lang.Class[] r0 = new java.lang.Class[]{r1, r2, r2, r0}
            java.lang.reflect.Constructor r4 = r3.findCtorByExactTypes(r4, r0)
            return r4
    }

    private java.lang.reflect.Method findSnsAddImageMethod(java.lang.Class<?> r11) {
            r10 = this;
            java.lang.Class r0 = java.lang.Boolean.TYPE
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r2 = 0
            if (r11 != 0) goto L8
            return r2
        L8:
            r3 = 1
            r4 = 0
            r5 = 2
            org.luckypray.dexkit.DexKitBridge r6 = r10.dexKit     // Catch: java.lang.Throwable -> L53
            java.lang.String r7 = "addImageMediaObjByPath"
            java.lang.String[] r7 = new java.lang.String[]{r7}     // Catch: java.lang.Throwable -> L53
            ch.e r7 = r10.mkMethodUsingStrings(r7)     // Catch: java.lang.Throwable -> L53
            hh.p r6 = r6.findMethod(r7)     // Catch: java.lang.Throwable -> L53
            java.util.Iterator r6 = r6.iterator()     // Catch: java.lang.Throwable -> L53
        L1f:
            boolean r7 = r6.hasNext()     // Catch: java.lang.Throwable -> L53
            if (r7 == 0) goto L53
            java.lang.Object r7 = r6.next()     // Catch: java.lang.Throwable -> L53
            hh.o r7 = (hh.o) r7     // Catch: java.lang.Throwable -> L53
            java.lang.ClassLoader r8 = r10.classLoader     // Catch: java.lang.Throwable -> L1f
            java.lang.reflect.Method r7 = r7.r(r8)     // Catch: java.lang.Throwable -> L1f
            java.lang.Class r8 = r7.getDeclaringClass()     // Catch: java.lang.Throwable -> L1f
            if (r8 == r11) goto L38
            goto L1f
        L38:
            java.lang.Class r8 = r7.getReturnType()     // Catch: java.lang.Throwable -> L1f
            if (r8 == r0) goto L3f
            goto L1f
        L3f:
            java.lang.Class[] r8 = r7.getParameterTypes()     // Catch: java.lang.Throwable -> L1f
            int r9 = r8.length     // Catch: java.lang.Throwable -> L1f
            if (r9 != r5) goto L1f
            r9 = r8[r4]     // Catch: java.lang.Throwable -> L1f
            if (r9 != r1) goto L1f
            r8 = r8[r3]     // Catch: java.lang.Throwable -> L1f
            if (r8 != r1) goto L1f
            java.lang.reflect.Method r11 = h.Hchat.utils.KavaReflector.accessible(r7)     // Catch: java.lang.Throwable -> L1f
            return r11
        L53:
            java.util.List r11 = h.Hchat.utils.KavaReflector.declaredMethods(r11)
            java.util.Iterator r11 = r11.iterator()
        L5b:
            boolean r6 = r11.hasNext()
            if (r6 == 0) goto L82
            java.lang.Object r6 = r11.next()
            java.lang.reflect.Method r6 = (java.lang.reflect.Method) r6
            java.lang.Class r7 = r6.getReturnType()
            if (r7 == r0) goto L6e
            goto L5b
        L6e:
            java.lang.Class[] r7 = r6.getParameterTypes()
            int r8 = r7.length
            if (r8 != r5) goto L5b
            r8 = r7[r4]
            if (r8 != r1) goto L5b
            r7 = r7[r3]
            if (r7 != r1) goto L5b
            java.lang.reflect.Method r11 = h.Hchat.utils.KavaReflector.accessible(r6)
            return r11
        L82:
            return r2
    }

    private java.lang.reflect.Method findSnsAddVideoMethod(java.lang.Class<?> r13) {
            r12 = this;
            java.lang.Class r0 = java.lang.Boolean.TYPE
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r2 = 0
            if (r13 != 0) goto L8
            return r2
        L8:
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            r7 = 4
            org.luckypray.dexkit.DexKitBridge r8 = r12.dexKit     // Catch: java.lang.Throwable -> L5d
            java.lang.String r9 = "addSightObjectByPath"
            java.lang.String[] r9 = new java.lang.String[]{r9}     // Catch: java.lang.Throwable -> L5d
            ch.e r9 = r12.mkMethodUsingStrings(r9)     // Catch: java.lang.Throwable -> L5d
            hh.p r8 = r8.findMethod(r9)     // Catch: java.lang.Throwable -> L5d
            java.util.Iterator r8 = r8.iterator()     // Catch: java.lang.Throwable -> L5d
        L21:
            boolean r9 = r8.hasNext()     // Catch: java.lang.Throwable -> L5d
            if (r9 == 0) goto L5d
            java.lang.Object r9 = r8.next()     // Catch: java.lang.Throwable -> L5d
            hh.o r9 = (hh.o) r9     // Catch: java.lang.Throwable -> L5d
            java.lang.ClassLoader r10 = r12.classLoader     // Catch: java.lang.Throwable -> L21
            java.lang.reflect.Method r9 = r9.r(r10)     // Catch: java.lang.Throwable -> L21
            java.lang.Class r10 = r9.getDeclaringClass()     // Catch: java.lang.Throwable -> L21
            if (r10 == r13) goto L3a
            goto L21
        L3a:
            java.lang.Class r10 = r9.getReturnType()     // Catch: java.lang.Throwable -> L21
            if (r10 == r0) goto L41
            goto L21
        L41:
            java.lang.Class[] r10 = r9.getParameterTypes()     // Catch: java.lang.Throwable -> L21
            int r11 = r10.length     // Catch: java.lang.Throwable -> L21
            if (r11 != r7) goto L21
            r11 = r10[r6]     // Catch: java.lang.Throwable -> L21
            if (r11 != r1) goto L21
            r11 = r10[r5]     // Catch: java.lang.Throwable -> L21
            if (r11 != r1) goto L21
            r11 = r10[r4]     // Catch: java.lang.Throwable -> L21
            if (r11 != r1) goto L21
            r10 = r10[r3]     // Catch: java.lang.Throwable -> L21
            if (r10 != r1) goto L21
            java.lang.reflect.Method r13 = h.Hchat.utils.KavaReflector.accessible(r9)     // Catch: java.lang.Throwable -> L21
            return r13
        L5d:
            org.luckypray.dexkit.DexKitBridge r8 = r12.dexKit     // Catch: java.lang.Throwable -> Lad
            java.lang.String r9 = "produceSightByPath"
            java.lang.String[] r9 = new java.lang.String[]{r9}     // Catch: java.lang.Throwable -> Lad
            ch.e r9 = r12.mkMethodUsingStrings(r9)     // Catch: java.lang.Throwable -> Lad
            hh.p r8 = r8.findMethod(r9)     // Catch: java.lang.Throwable -> Lad
            java.util.Iterator r8 = r8.iterator()     // Catch: java.lang.Throwable -> Lad
        L71:
            boolean r9 = r8.hasNext()     // Catch: java.lang.Throwable -> Lad
            if (r9 == 0) goto Lad
            java.lang.Object r9 = r8.next()     // Catch: java.lang.Throwable -> Lad
            hh.o r9 = (hh.o) r9     // Catch: java.lang.Throwable -> Lad
            java.lang.ClassLoader r10 = r12.classLoader     // Catch: java.lang.Throwable -> L71
            java.lang.reflect.Method r9 = r9.r(r10)     // Catch: java.lang.Throwable -> L71
            java.lang.Class r10 = r9.getDeclaringClass()     // Catch: java.lang.Throwable -> L71
            if (r10 == r13) goto L8a
            goto L71
        L8a:
            java.lang.Class r10 = r9.getReturnType()     // Catch: java.lang.Throwable -> L71
            if (r10 == r0) goto L91
            goto L71
        L91:
            java.lang.Class[] r10 = r9.getParameterTypes()     // Catch: java.lang.Throwable -> L71
            int r11 = r10.length     // Catch: java.lang.Throwable -> L71
            if (r11 != r7) goto L71
            r11 = r10[r6]     // Catch: java.lang.Throwable -> L71
            if (r11 != r1) goto L71
            r11 = r10[r5]     // Catch: java.lang.Throwable -> L71
            if (r11 != r1) goto L71
            r11 = r10[r4]     // Catch: java.lang.Throwable -> L71
            if (r11 != r1) goto L71
            r10 = r10[r3]     // Catch: java.lang.Throwable -> L71
            if (r10 != r1) goto L71
            java.lang.reflect.Method r13 = h.Hchat.utils.KavaReflector.accessible(r9)     // Catch: java.lang.Throwable -> L71
            return r13
        Lad:
            return r2
    }

    private java.lang.reflect.Method findSnsCommitMethod(java.lang.Class<?> r5) {
            r4 = this;
            r0 = 0
            if (r5 != 0) goto L4
            return r0
        L4:
            org.luckypray.dexkit.DexKitBridge r1 = r4.dexKit     // Catch: java.lang.Throwable -> L48
            java.lang.String r2 = "commit sns info ret %d"
            java.lang.String[] r2 = new java.lang.String[]{r2}     // Catch: java.lang.Throwable -> L48
            ch.e r2 = r4.mkMethodUsingStrings(r2)     // Catch: java.lang.Throwable -> L48
            hh.p r1 = r1.findMethod(r2)     // Catch: java.lang.Throwable -> L48
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L48
        L18:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L48
            if (r2 == 0) goto L48
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L48
            hh.o r2 = (hh.o) r2     // Catch: java.lang.Throwable -> L48
            java.lang.ClassLoader r3 = r4.classLoader     // Catch: java.lang.Throwable -> L18
            java.lang.reflect.Method r2 = r2.r(r3)     // Catch: java.lang.Throwable -> L18
            java.lang.Class r3 = r2.getDeclaringClass()     // Catch: java.lang.Throwable -> L18
            if (r3 == r5) goto L31
            goto L18
        L31:
            java.lang.Class r3 = r2.getReturnType()     // Catch: java.lang.Throwable -> L18
            boolean r3 = r4.isIntClass(r3)     // Catch: java.lang.Throwable -> L18
            if (r3 != 0) goto L3c
            goto L18
        L3c:
            java.lang.Class[] r3 = r2.getParameterTypes()     // Catch: java.lang.Throwable -> L18
            int r3 = r3.length     // Catch: java.lang.Throwable -> L18
            if (r3 != 0) goto L18
            java.lang.reflect.Method r5 = h.Hchat.utils.KavaReflector.accessible(r2)     // Catch: java.lang.Throwable -> L18
            return r5
        L48:
            java.util.List r5 = h.Hchat.utils.KavaReflector.declaredMethods(r5)
            java.util.Iterator r5 = r5.iterator()
        L50:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L72
            java.lang.Object r1 = r5.next()
            java.lang.reflect.Method r1 = (java.lang.reflect.Method) r1
            java.lang.Class[] r2 = r1.getParameterTypes()
            int r2 = r2.length
            if (r2 != 0) goto L50
            java.lang.Class r2 = r1.getReturnType()
            boolean r2 = r4.isIntClass(r2)
            if (r2 == 0) goto L50
            java.lang.reflect.Method r5 = h.Hchat.utils.KavaReflector.accessible(r1)
            return r5
        L72:
            return r0
    }

    private java.lang.reflect.Method findSnsHelperChainMethod(java.lang.String r6) {
            r5 = this;
            java.lang.Class<?> r0 = r5.snsUploadPackHelperClass
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            org.luckypray.dexkit.DexKitBridge r0 = r5.dexKit     // Catch: java.lang.Throwable -> L51
            java.lang.String[] r6 = new java.lang.String[]{r6}     // Catch: java.lang.Throwable -> L51
            ch.e r6 = r5.mkMethodUsingStrings(r6)     // Catch: java.lang.Throwable -> L51
            hh.p r6 = r0.findMethod(r6)     // Catch: java.lang.Throwable -> L51
            java.util.Iterator r6 = r6.iterator()     // Catch: java.lang.Throwable -> L51
        L18:
            boolean r0 = r6.hasNext()     // Catch: java.lang.Throwable -> L51
            if (r0 == 0) goto L51
            java.lang.Object r0 = r6.next()     // Catch: java.lang.Throwable -> L51
            hh.o r0 = (hh.o) r0     // Catch: java.lang.Throwable -> L51
            java.lang.ClassLoader r2 = r5.classLoader     // Catch: java.lang.Throwable -> L18
            java.lang.reflect.Method r0 = r0.r(r2)     // Catch: java.lang.Throwable -> L18
            java.lang.Class r2 = r0.getDeclaringClass()     // Catch: java.lang.Throwable -> L18
            java.lang.Class<?> r3 = r5.snsUploadPackHelperClass     // Catch: java.lang.Throwable -> L18
            if (r2 == r3) goto L33
            goto L18
        L33:
            java.lang.Class r2 = r0.getReturnType()     // Catch: java.lang.Throwable -> L18
            java.lang.Class<?> r3 = r5.snsUploadPackHelperClass     // Catch: java.lang.Throwable -> L18
            if (r2 == r3) goto L3c
            goto L18
        L3c:
            java.lang.Class[] r2 = r0.getParameterTypes()     // Catch: java.lang.Throwable -> L18
            int r3 = r2.length     // Catch: java.lang.Throwable -> L18
            r4 = 1
            if (r3 != r4) goto L18
            r3 = 0
            r2 = r2[r3]     // Catch: java.lang.Throwable -> L18
            java.lang.Class<java.lang.String> r3 = java.lang.String.class
            if (r2 == r3) goto L4c
            goto L18
        L4c:
            java.lang.reflect.Method r6 = h.Hchat.utils.KavaReflector.accessible(r0)     // Catch: java.lang.Throwable -> L18
            return r6
        L51:
            return r1
    }

    private java.lang.reflect.Method findSnsShareAppMsgMethod(java.lang.Class<?> r4) {
            r3 = this;
            r0 = 0
            if (r4 != 0) goto L4
            return r0
        L4:
            java.util.List r4 = h.Hchat.utils.KavaReflector.declaredMethods(r4)
            java.util.Iterator r4 = r4.iterator()
        Lc:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L23
            java.lang.Object r1 = r4.next()
            java.lang.reflect.Method r1 = (java.lang.reflect.Method) r1
            boolean r2 = r3.isSnsShareAppMsgMethod(r1)
            if (r2 == 0) goto Lc
            java.lang.reflect.Method r4 = h.Hchat.utils.KavaReflector.accessible(r1)
            return r4
        L23:
            return r0
    }

    private java.lang.reflect.Method findSnsUploadCheckMethod(java.lang.Class<?> r6) {
            r5 = this;
            java.lang.Class r0 = java.lang.Void.TYPE
            r1 = 0
            if (r6 != 0) goto L6
            return r1
        L6:
            org.luckypray.dexkit.DexKitBridge r2 = r5.dexKit     // Catch: java.lang.Throwable -> L46
            java.lang.String r3 = "checkPostInUI"
            java.lang.String[] r3 = new java.lang.String[]{r3}     // Catch: java.lang.Throwable -> L46
            ch.e r3 = r5.mkMethodUsingStrings(r3)     // Catch: java.lang.Throwable -> L46
            hh.p r2 = r2.findMethod(r3)     // Catch: java.lang.Throwable -> L46
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> L46
        L1a:
            boolean r3 = r2.hasNext()     // Catch: java.lang.Throwable -> L46
            if (r3 == 0) goto L46
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Throwable -> L46
            hh.o r3 = (hh.o) r3     // Catch: java.lang.Throwable -> L46
            java.lang.ClassLoader r4 = r5.classLoader     // Catch: java.lang.Throwable -> L1a
            java.lang.reflect.Method r3 = r3.r(r4)     // Catch: java.lang.Throwable -> L1a
            java.lang.Class r4 = r3.getDeclaringClass()     // Catch: java.lang.Throwable -> L1a
            if (r4 == r6) goto L33
            goto L1a
        L33:
            java.lang.Class r4 = r3.getReturnType()     // Catch: java.lang.Throwable -> L1a
            if (r4 == r0) goto L3a
            goto L1a
        L3a:
            java.lang.Class[] r4 = r3.getParameterTypes()     // Catch: java.lang.Throwable -> L1a
            int r4 = r4.length     // Catch: java.lang.Throwable -> L1a
            if (r4 != 0) goto L1a
            java.lang.reflect.Method r6 = h.Hchat.utils.KavaReflector.accessible(r3)     // Catch: java.lang.Throwable -> L1a
            return r6
        L46:
            java.util.List r6 = h.Hchat.utils.KavaReflector.declaredMethods(r6)
            java.util.Iterator r6 = r6.iterator()
        L4e:
            boolean r2 = r6.hasNext()
            if (r2 == 0) goto L6c
            java.lang.Object r2 = r6.next()
            java.lang.reflect.Method r2 = (java.lang.reflect.Method) r2
            java.lang.Class r3 = r2.getReturnType()
            if (r3 != r0) goto L4e
            java.lang.Class[] r3 = r2.getParameterTypes()
            int r3 = r3.length
            if (r3 != 0) goto L4e
            java.lang.reflect.Method r6 = h.Hchat.utils.KavaReflector.accessible(r2)
            return r6
        L6c:
            return r1
    }

    private java.lang.reflect.Method findSnsUploadManagerGetter(java.lang.Class<?> r5) {
            r4 = this;
            r0 = 0
            if (r5 != 0) goto L4
            return r0
        L4:
            org.luckypray.dexkit.DexKitBridge r1 = r4.dexKit     // Catch: java.lang.Throwable -> L45
            java.lang.String r2 = "getSnsUploadManager"
            java.lang.String[] r2 = new java.lang.String[]{r2}     // Catch: java.lang.Throwable -> L45
            ch.e r2 = r4.mkMethodUsingStrings(r2)     // Catch: java.lang.Throwable -> L45
            hh.p r1 = r1.findMethod(r2)     // Catch: java.lang.Throwable -> L45
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L45
        L18:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L45
            if (r2 == 0) goto L45
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L45
            hh.o r2 = (hh.o) r2     // Catch: java.lang.Throwable -> L45
            java.lang.ClassLoader r3 = r4.classLoader     // Catch: java.lang.Throwable -> L18
            java.lang.reflect.Method r2 = r2.r(r3)     // Catch: java.lang.Throwable -> L18
            boolean r3 = h.Hchat.utils.KavaReflector.isStatic(r2)     // Catch: java.lang.Throwable -> L18
            if (r3 != 0) goto L31
            goto L18
        L31:
            java.lang.Class[] r3 = r2.getParameterTypes()     // Catch: java.lang.Throwable -> L18
            int r3 = r3.length     // Catch: java.lang.Throwable -> L18
            if (r3 == 0) goto L39
            goto L18
        L39:
            java.lang.Class r3 = r2.getReturnType()     // Catch: java.lang.Throwable -> L18
            if (r3 == r5) goto L40
            goto L18
        L40:
            java.lang.reflect.Method r5 = h.Hchat.utils.KavaReflector.accessible(r2)     // Catch: java.lang.Throwable -> L18
            return r5
        L45:
            return r0
    }

    private java.lang.reflect.Method findStaticDispatch(java.lang.Class<?> r7, java.lang.Class<?> r8) {
            r6 = this;
            java.lang.Class r0 = java.lang.Boolean.TYPE
            if (r7 == 0) goto L66
            if (r8 != 0) goto L7
            goto L66
        L7:
            java.lang.reflect.Method r1 = r6.findStaticDispatchByName(r7, r8)
            if (r1 == 0) goto Le
            return r1
        Le:
            ch.e r1 = new ch.e     // Catch: java.lang.Throwable -> L66
            r1.<init>()     // Catch: java.lang.Throwable -> L66
            fh.k r2 = new fh.k     // Catch: java.lang.Throwable -> L66
            r2.<init>()     // Catch: java.lang.Throwable -> L66
            r3 = 3
            r2.m0(r3)     // Catch: java.lang.Throwable -> L66
            r2.k0(r7)     // Catch: java.lang.Throwable -> L66
            r2.k0(r8)     // Catch: java.lang.Throwable -> L66
            r2.k0(r0)     // Catch: java.lang.Throwable -> L66
            r1.f1666h = r2     // Catch: java.lang.Throwable -> L66
            org.luckypray.dexkit.DexKitBridge r2 = r6.dexKit     // Catch: java.lang.Throwable -> L66
            hh.p r1 = r2.findMethod(r1)     // Catch: java.lang.Throwable -> L66
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L66
        L31:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L66
            if (r2 == 0) goto L66
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L66
            hh.o r2 = (hh.o) r2     // Catch: java.lang.Throwable -> L66
            java.lang.ClassLoader r4 = r6.classLoader     // Catch: java.lang.Throwable -> L31
            java.lang.reflect.Method r2 = r2.r(r4)     // Catch: java.lang.Throwable -> L31
            java.lang.Class[] r4 = r2.getParameterTypes()     // Catch: java.lang.Throwable -> L31
            boolean r5 = h.Hchat.utils.KavaReflector.isStatic(r2)     // Catch: java.lang.Throwable -> L31
            if (r5 == 0) goto L31
            if (r4 == 0) goto L31
            int r5 = r4.length     // Catch: java.lang.Throwable -> L31
            if (r5 != r3) goto L31
            r5 = 0
            r5 = r4[r5]     // Catch: java.lang.Throwable -> L31
            if (r5 != r7) goto L31
            r5 = 1
            r5 = r4[r5]     // Catch: java.lang.Throwable -> L31
            if (r5 != r8) goto L31
            r5 = 2
            r4 = r4[r5]     // Catch: java.lang.Throwable -> L31
            if (r4 != r0) goto L31
            java.lang.reflect.Method r7 = h.Hchat.utils.KavaReflector.accessible(r2)     // Catch: java.lang.Throwable -> L31
            return r7
        L66:
            r7 = 0
            return r7
    }

    private java.lang.reflect.Method findStaticDispatchByName(java.lang.Class<?> r6, java.lang.Class<?> r7) {
            r5 = this;
            ch.e r0 = new ch.e     // Catch: java.lang.Throwable -> L41
            r0.<init>()     // Catch: java.lang.Throwable -> L41
            fh.k r1 = new fh.k     // Catch: java.lang.Throwable -> L41
            r1.<init>()     // Catch: java.lang.Throwable -> L41
            java.lang.String r2 = "d"
            gh.c r3 = new gh.c     // Catch: java.lang.Throwable -> L41
            r4 = 5
            r3.<init>(r2, r4)     // Catch: java.lang.Throwable -> L41
            r1.f3950g = r3     // Catch: java.lang.Throwable -> L41
            r2 = 3
            r1.m0(r2)     // Catch: java.lang.Throwable -> L41
            r0.f1666h = r1     // Catch: java.lang.Throwable -> L41
            org.luckypray.dexkit.DexKitBridge r1 = r5.dexKit     // Catch: java.lang.Throwable -> L41
            hh.p r0 = r1.findMethod(r0)     // Catch: java.lang.Throwable -> L41
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L41
        L24:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L41
            if (r1 == 0) goto L41
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L41
            hh.o r1 = (hh.o) r1     // Catch: java.lang.Throwable -> L41
            java.lang.ClassLoader r2 = r5.classLoader     // Catch: java.lang.Throwable -> L24
            java.lang.reflect.Method r1 = r1.r(r2)     // Catch: java.lang.Throwable -> L24
            boolean r2 = r5.isProtobufStaticDispatch(r1, r6, r7)     // Catch: java.lang.Throwable -> L24
            if (r2 == 0) goto L24
            java.lang.reflect.Method r6 = h.Hchat.utils.KavaReflector.accessible(r1)     // Catch: java.lang.Throwable -> L24
            return r6
        L41:
            r6 = 0
            return r6
    }

    private java.lang.reflect.Method findTransferQueryResponseMethod(java.lang.Class<?> r5) {
            r4 = this;
            r0 = 0
            if (r5 != 0) goto L4
            return r0
        L4:
            java.util.List r1 = h.Hchat.utils.KavaReflector.declaredMethods(r5)
            java.util.Iterator r1 = r1.iterator()
        Lc:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L1f
            java.lang.Object r2 = r1.next()
            java.lang.reflect.Method r2 = (java.lang.reflect.Method) r2
            boolean r3 = r4.isTransferQueryResponseMethod(r2, r5)
            if (r3 == 0) goto Lc
            return r2
        L1f:
            return r0
    }

    private java.lang.reflect.Method findUniqueMethodUsingString(java.lang.String r4) {
            r3 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            org.luckypray.dexkit.DexKitBridge r1 = r3.dexKit
            java.lang.String[] r4 = new java.lang.String[]{r4}
            ch.e r4 = r3.mkMethodUsingStrings(r4)
            hh.p r4 = r1.findMethod(r4)
            java.util.Iterator r4 = r4.iterator()
        L17:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L3e
            java.lang.Object r1 = r4.next()
            hh.o r1 = (hh.o) r1
            java.lang.ClassLoader r2 = r3.classLoader     // Catch: java.lang.Throwable -> L17
            java.lang.reflect.Method r1 = r1.r(r2)     // Catch: java.lang.Throwable -> L17
            boolean r2 = r0.contains(r1)     // Catch: java.lang.Throwable -> L17
            if (r2 == 0) goto L30
            goto L17
        L30:
            boolean r2 = r3.isContactMuteMethod(r1)     // Catch: java.lang.Throwable -> L17
            if (r2 != 0) goto L37
            goto L17
        L37:
            h.Hchat.utils.KavaReflector.accessible(r1)     // Catch: java.lang.Throwable -> L17
            r0.add(r1)     // Catch: java.lang.Throwable -> L17
            goto L17
        L3e:
            int r4 = r0.size()
            r1 = 1
            if (r4 != r1) goto L4d
            r4 = 0
            java.lang.Object r4 = r0.get(r4)
            java.lang.reflect.Method r4 = (java.lang.reflect.Method) r4
            goto L4e
        L4d:
            r4 = 0
        L4e:
            return r4
    }

    private java.lang.reflect.Constructor<?> findUploadDeviceStepCtor(java.lang.Class<?> r7) {
            r6 = this;
            r0 = 0
            if (r7 != 0) goto L4
            return r0
        L4:
            java.util.List r7 = h.Hchat.utils.KavaReflector.declaredConstructors(r7)
            java.util.Iterator r7 = r7.iterator()
        Lc:
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto L50
            java.lang.Object r1 = r7.next()
            java.lang.reflect.Constructor r1 = (java.lang.reflect.Constructor) r1
            java.lang.Class[] r2 = r1.getParameterTypes()
            int r3 = r2.length
            r4 = 7
            if (r3 == r4) goto L21
            goto Lc
        L21:
            r3 = 0
            r3 = r2[r3]
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            if (r3 != r4) goto Lc
            r3 = 1
            r3 = r2[r3]
            if (r3 == r4) goto L2e
            goto Lc
        L2e:
            r3 = 2
            r3 = r2[r3]
            java.lang.Class r5 = java.lang.Integer.TYPE
            if (r3 != r5) goto Lc
            r3 = 3
            r3 = r2[r3]
            if (r3 != r5) goto Lc
            r3 = 4
            r3 = r2[r3]
            if (r3 == r5) goto L40
            goto Lc
        L40:
            r3 = 5
            r3 = r2[r3]
            if (r3 != r4) goto Lc
            r3 = 6
            r2 = r2[r3]
            if (r2 == r5) goto L4b
            goto Lc
        L4b:
            java.lang.reflect.Constructor r7 = h.Hchat.utils.KavaReflector.accessible(r1)
            return r7
        L50:
            return r0
    }

    private java.lang.reflect.Method findVideoPathOwnerGetter(java.lang.Class<?> r4) {
            r3 = this;
            if (r4 != 0) goto L3
            goto L42
        L3:
            ch.e r0 = new ch.e     // Catch: java.lang.Throwable -> L42
            r0.<init>()     // Catch: java.lang.Throwable -> L42
            fh.k r1 = new fh.k     // Catch: java.lang.Throwable -> L42
            r1.<init>()     // Catch: java.lang.Throwable -> L42
            r2 = 0
            r1.m0(r2)     // Catch: java.lang.Throwable -> L42
            java.lang.String r2 = r4.getName()     // Catch: java.lang.Throwable -> L42
            fh.k.q0(r1, r2)     // Catch: java.lang.Throwable -> L42
            r0.f1666h = r1     // Catch: java.lang.Throwable -> L42
            org.luckypray.dexkit.DexKitBridge r1 = r3.dexKit     // Catch: java.lang.Throwable -> L42
            hh.p r0 = r1.findMethod(r0)     // Catch: java.lang.Throwable -> L42
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L42
        L24:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L42
            if (r1 == 0) goto L42
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L42
            hh.o r1 = (hh.o) r1     // Catch: java.lang.Throwable -> L42
            java.lang.ClassLoader r2 = r3.classLoader     // Catch: java.lang.Throwable -> L24
            java.lang.reflect.Method r1 = r1.r(r2)     // Catch: java.lang.Throwable -> L24
            boolean r2 = r3.isVideoPathOwnerGetter(r1, r4)     // Catch: java.lang.Throwable -> L24
            if (r2 != 0) goto L3d
            goto L24
        L3d:
            java.lang.reflect.Method r4 = h.Hchat.utils.KavaReflector.accessible(r1)     // Catch: java.lang.Throwable -> L24
            return r4
        L42:
            r4 = 0
            return r4
    }

    private java.lang.reflect.Method findVoiceInfoQueryMethod() {
            r7 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 1
            ch.e r2 = new ch.e     // Catch: java.lang.Throwable -> L89
            r2.<init>()     // Catch: java.lang.Throwable -> L89
            fh.k r3 = new fh.k     // Catch: java.lang.Throwable -> L89
            r3.<init>()     // Catch: java.lang.Throwable -> L89
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            java.lang.Class[] r4 = new java.lang.Class[]{r4}     // Catch: java.lang.Throwable -> L89
            r3.n0(r4)     // Catch: java.lang.Throwable -> L89
            java.lang.String r4 = "voiceinfo WHERE FileName= ?"
            java.util.List r5 = r3.f3954k     // Catch: java.lang.Throwable -> L89
            if (r5 != 0) goto L24
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L89
            r5.<init>()     // Catch: java.lang.Throwable -> L89
        L24:
            r3.f3954k = r5     // Catch: java.lang.Throwable -> L89
            gh.c r6 = new gh.c     // Catch: java.lang.Throwable -> L89
            r6.<init>(r4, r1)     // Catch: java.lang.Throwable -> L89
            r5.add(r6)     // Catch: java.lang.Throwable -> L89
            r2.f1666h = r3     // Catch: java.lang.Throwable -> L89
            org.luckypray.dexkit.DexKitBridge r3 = r7.dexKit     // Catch: java.lang.Throwable -> L89
            hh.p r2 = r3.findMethod(r2)     // Catch: java.lang.Throwable -> L89
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> L89
        L3a:
            boolean r3 = r2.hasNext()     // Catch: java.lang.Throwable -> L89
            if (r3 == 0) goto L89
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Throwable -> L89
            hh.o r3 = (hh.o) r3     // Catch: java.lang.Throwable -> L89
            java.lang.ClassLoader r4 = r7.classLoader     // Catch: java.lang.Throwable -> L3a
            java.lang.reflect.Method r4 = r3.r(r4)     // Catch: java.lang.Throwable -> L3a
            boolean r5 = r7.isVoiceInfoStorageQueryMethod(r4)     // Catch: java.lang.Throwable -> L89
            if (r5 != 0) goto L53
            goto L3a
        L53:
            sf.i r3 = r3.f5574p     // Catch: java.lang.Throwable -> L89
            java.lang.Object r3 = r3.getValue()     // Catch: java.lang.Throwable -> L89
            hh.p r3 = (hh.p) r3     // Catch: java.lang.Throwable -> L89
            java.util.Iterator r3 = r3.iterator()     // Catch: java.lang.Throwable -> L89
        L5f:
            boolean r5 = r3.hasNext()     // Catch: java.lang.Throwable -> L89
            if (r5 == 0) goto L3a
            java.lang.Object r5 = r3.next()     // Catch: java.lang.Throwable -> L89
            hh.o r5 = (hh.o) r5     // Catch: java.lang.Throwable -> L89
            java.lang.ClassLoader r6 = r7.classLoader     // Catch: java.lang.Throwable -> L5f
            java.lang.reflect.Method r5 = r5.r(r6)     // Catch: java.lang.Throwable -> L5f
            java.lang.Class r6 = r4.getReturnType()     // Catch: java.lang.Throwable -> L5f
            boolean r6 = r7.isVoiceInfoQueryMethod(r5, r6)     // Catch: java.lang.Throwable -> L5f
            if (r6 != 0) goto L7c
            goto L5f
        L7c:
            h.Hchat.utils.KavaReflector.accessible(r5)     // Catch: java.lang.Throwable -> L5f
            boolean r6 = r0.contains(r5)     // Catch: java.lang.Throwable -> L5f
            if (r6 != 0) goto L5f
            r0.add(r5)     // Catch: java.lang.Throwable -> L5f
            goto L5f
        L89:
            int r2 = r0.size()
            if (r2 != r1) goto L97
            r1 = 0
            java.lang.Object r0 = r0.get(r1)
            java.lang.reflect.Method r0 = (java.lang.reflect.Method) r0
            goto L98
        L97:
            r0 = 0
        L98:
            return r0
    }

    private java.lang.reflect.Method findVoicePlaybackMethod(java.lang.Class<?> r3, java.lang.String r4, java.lang.Class<?> r5, java.lang.Class<?>... r6) {
            r2 = this;
            org.luckypray.dexkit.DexKitBridge r0 = r2.dexKit     // Catch: java.lang.Throwable -> L38
            java.lang.String[] r4 = new java.lang.String[]{r4}     // Catch: java.lang.Throwable -> L38
            ch.e r4 = r2.mkMethodUsingStrings(r4)     // Catch: java.lang.Throwable -> L38
            hh.p r4 = r0.findMethod(r4)     // Catch: java.lang.Throwable -> L38
            java.util.Iterator r4 = r4.iterator()     // Catch: java.lang.Throwable -> L38
        L12:
            boolean r0 = r4.hasNext()     // Catch: java.lang.Throwable -> L38
            if (r0 == 0) goto L38
            java.lang.Object r0 = r4.next()     // Catch: java.lang.Throwable -> L38
            hh.o r0 = (hh.o) r0     // Catch: java.lang.Throwable -> L38
            java.lang.ClassLoader r1 = r2.classLoader     // Catch: java.lang.Throwable -> L12
            java.lang.reflect.Method r0 = r0.r(r1)     // Catch: java.lang.Throwable -> L12
            if (r3 == 0) goto L28
            r1 = r3
            goto L2c
        L28:
            java.lang.Class r1 = r0.getDeclaringClass()     // Catch: java.lang.Throwable -> L12
        L2c:
            boolean r1 = r2.isExactInstanceMethod(r0, r1, r5, r6)     // Catch: java.lang.Throwable -> L12
            if (r1 != 0) goto L33
            goto L12
        L33:
            java.lang.reflect.Method r3 = h.Hchat.utils.KavaReflector.accessible(r0)     // Catch: java.lang.Throwable -> L12
            return r3
        L38:
            r3 = 0
            return r3
    }

    private boolean hasConfigBuilderShape(java.lang.Class<?> r8, java.lang.Class<?> r9) {
            r7 = this;
            r0 = 0
            if (r8 == 0) goto L6d
            if (r9 != 0) goto L7
            goto L6d
        L7:
            java.util.List r1 = h.Hchat.utils.KavaReflector.declaredFields(r8)
            java.util.Iterator r1 = r1.iterator()
            r2 = r0
            r3 = r2
            r4 = r3
        L12:
            boolean r5 = r1.hasNext()
            if (r5 == 0) goto L3b
            java.lang.Object r5 = r1.next()
            java.lang.reflect.Field r5 = (java.lang.reflect.Field) r5
            java.lang.Class r5 = r5.getType()
            boolean r6 = r9.isAssignableFrom(r5)
            if (r6 == 0) goto L2a
            int r2 = r2 + 1
        L2a:
            java.lang.Class<java.lang.String> r6 = java.lang.String.class
            if (r5 != r6) goto L30
            int r3 = r3 + 1
        L30:
            java.lang.Class r6 = java.lang.Integer.TYPE
            if (r5 == r6) goto L38
            java.lang.Class<java.lang.Integer> r6 = java.lang.Integer.class
            if (r5 != r6) goto L12
        L38:
            int r4 = r4 + 1
            goto L12
        L3b:
            java.util.List r8 = h.Hchat.utils.KavaReflector.declaredMethods(r8)
            java.util.Iterator r8 = r8.iterator()
        L43:
            boolean r9 = r8.hasNext()
            r1 = 1
            if (r9 == 0) goto L61
            java.lang.Object r9 = r8.next()
            java.lang.reflect.Method r9 = (java.lang.reflect.Method) r9
            java.lang.Class[] r5 = r9.getParameterTypes()
            int r5 = r5.length
            if (r5 != 0) goto L43
            java.lang.Class r9 = r9.getReturnType()
            java.lang.Class r5 = java.lang.Void.TYPE
            if (r9 == r5) goto L43
            r8 = r1
            goto L62
        L61:
            r8 = r0
        L62:
            r9 = 2
            if (r2 < r9) goto L6d
            if (r3 < r1) goto L6d
            r9 = 3
            if (r4 < r9) goto L6d
            if (r8 == 0) goto L6d
            return r1
        L6d:
            return r0
    }

    private boolean hasDirectImageAppInfoFields(java.lang.Class<?> r8) {
            r7 = this;
            java.util.List r8 = h.Hchat.utils.KavaReflector.declaredFields(r8)
            java.util.Iterator r8 = r8.iterator()
            r0 = 0
            r1 = r0
            r2 = r1
            r3 = r2
            r4 = r3
        Ld:
            boolean r5 = r8.hasNext()
            if (r5 == 0) goto L4c
            java.lang.Object r5 = r8.next()
            java.lang.reflect.Field r5 = (java.lang.reflect.Field) r5
            boolean r6 = h.Hchat.utils.KavaReflector.isStatic(r5)
            if (r6 == 0) goto L20
            goto Ld
        L20:
            java.lang.Class r5 = r5.getType()
            java.lang.Class<java.lang.String> r6 = java.lang.String.class
            if (r5 != r6) goto L2b
            int r1 = r1 + 1
            goto Ld
        L2b:
            java.lang.Class r6 = java.lang.Integer.TYPE
            if (r5 == r6) goto L49
            java.lang.Class<java.lang.Integer> r6 = java.lang.Integer.class
            if (r5 != r6) goto L34
            goto L49
        L34:
            java.lang.Class r6 = java.lang.Long.TYPE
            if (r5 == r6) goto L46
            java.lang.Class<java.lang.Long> r6 = java.lang.Long.class
            if (r5 != r6) goto L3d
            goto L46
        L3d:
            boolean r5 = r5.isPrimitive()
            if (r5 != 0) goto Ld
            int r4 = r4 + 1
            goto Ld
        L46:
            int r3 = r3 + 1
            goto Ld
        L49:
            int r2 = r2 + 1
            goto Ld
        L4c:
            r8 = 5
            if (r1 != r8) goto L57
            r8 = 1
            if (r2 != r8) goto L57
            if (r3 != r8) goto L57
            if (r4 != 0) goto L57
            return r8
        L57:
            return r0
    }

    private boolean hasLikelyQueueSendMethod(java.lang.Class<?> r9) {
            r8 = this;
            r0 = 0
            if (r9 != 0) goto L4
            return r0
        L4:
            java.util.List r9 = h.Hchat.utils.KavaReflector.declaredMethods(r9)     // Catch: java.lang.Throwable -> L9a
            java.util.Iterator r9 = r9.iterator()     // Catch: java.lang.Throwable -> L9a
        Lc:
            boolean r1 = r9.hasNext()     // Catch: java.lang.Throwable -> L9a
            if (r1 == 0) goto L9a
            java.lang.Object r1 = r9.next()     // Catch: java.lang.Throwable -> L9a
            java.lang.reflect.Method r1 = (java.lang.reflect.Method) r1     // Catch: java.lang.Throwable -> L9a
            java.lang.String r2 = r1.getName()     // Catch: java.lang.Throwable -> L9a
            java.lang.String r3 = "equals"
            boolean r3 = r3.equals(r2)     // Catch: java.lang.Throwable -> L9a
            if (r3 != 0) goto Lc
            java.lang.String r3 = "hashCode"
            boolean r3 = r3.equals(r2)     // Catch: java.lang.Throwable -> L9a
            if (r3 != 0) goto Lc
            java.lang.String r3 = "toString"
            boolean r3 = r3.equals(r2)     // Catch: java.lang.Throwable -> L9a
            if (r3 != 0) goto Lc
            java.lang.String r3 = "wait"
            boolean r3 = r3.equals(r2)     // Catch: java.lang.Throwable -> L9a
            if (r3 != 0) goto Lc
            java.lang.String r3 = "notify"
            boolean r3 = r3.equals(r2)     // Catch: java.lang.Throwable -> L9a
            if (r3 != 0) goto Lc
            java.lang.String r3 = "notifyAll"
            boolean r3 = r3.equals(r2)     // Catch: java.lang.Throwable -> L9a
            if (r3 != 0) goto Lc
            java.lang.String r3 = "cancel"
            boolean r2 = r3.equals(r2)     // Catch: java.lang.Throwable -> L9a
            if (r2 == 0) goto L55
            goto Lc
        L55:
            java.lang.Class[] r2 = r1.getParameterTypes()     // Catch: java.lang.Throwable -> L9a
            if (r2 == 0) goto Lc
            int r3 = r2.length     // Catch: java.lang.Throwable -> L9a
            r4 = 2
            r5 = 1
            if (r3 == r5) goto L64
            int r3 = r2.length     // Catch: java.lang.Throwable -> L9a
            if (r3 == r4) goto L64
            goto Lc
        L64:
            int r3 = r2.length     // Catch: java.lang.Throwable -> L9a
            java.lang.Class<java.lang.Integer> r6 = java.lang.Integer.class
            java.lang.Class r7 = java.lang.Integer.TYPE
            if (r3 != r4) goto L72
            r3 = r2[r5]     // Catch: java.lang.Throwable -> L9a
            if (r3 == r7) goto L72
            if (r3 == r6) goto L72
            goto Lc
        L72:
            r2 = r2[r0]     // Catch: java.lang.Throwable -> L9a
            if (r2 == 0) goto Lc
            boolean r3 = r2.isPrimitive()     // Catch: java.lang.Throwable -> L9a
            if (r3 != 0) goto Lc
            java.lang.Class<java.lang.String> r3 = java.lang.String.class
            if (r2 == r3) goto Lc
            java.lang.Class<java.lang.Object> r3 = java.lang.Object.class
            if (r2 != r3) goto L85
            goto Lc
        L85:
            java.lang.Class r1 = r1.getReturnType()     // Catch: java.lang.Throwable -> L9a
            java.lang.Class r2 = java.lang.Boolean.TYPE     // Catch: java.lang.Throwable -> L9a
            if (r1 == r2) goto L99
            java.lang.Class<java.lang.Boolean> r2 = java.lang.Boolean.class
            if (r1 == r2) goto L99
            if (r1 == r7) goto L99
            if (r1 == r6) goto L99
            java.lang.Class r2 = java.lang.Void.TYPE     // Catch: java.lang.Throwable -> L9a
            if (r1 != r2) goto Lc
        L99:
            return r5
        L9a:
            return r0
    }

    private boolean hasParseFromMethod(java.lang.Class<?> r3) {
            r2 = this;
            java.lang.Class<byte[]> r0 = byte[].class
            java.lang.Class[] r0 = new java.lang.Class[]{r0}
            java.lang.String r1 = "parseFrom"
            java.lang.reflect.Method r3 = h.Hchat.utils.KavaReflector.findMethodRecursive(r3, r1, r0)
            if (r3 == 0) goto L10
            r3 = 1
            return r3
        L10:
            r3 = 0
            return r3
    }

    private boolean hasReqRespShape(java.lang.Class<?> r11) {
            r10 = this;
            r0 = 0
            if (r11 != 0) goto L4
            return r0
        L4:
            java.util.List r11 = h.Hchat.utils.KavaReflector.declaredMethods(r11)
            java.util.Iterator r11 = r11.iterator()
            r1 = r0
            r2 = r1
            r3 = r2
            r4 = r3
        L10:
            boolean r5 = r11.hasNext()
            r6 = 1
            if (r5 == 0) goto L78
            java.lang.Object r5 = r11.next()
            java.lang.reflect.Method r5 = (java.lang.reflect.Method) r5
            java.lang.Class[] r7 = r5.getParameterTypes()
            int r7 = r7.length
            if (r7 == 0) goto L25
            goto L10
        L25:
            java.lang.String r7 = "getType"
            java.lang.String r8 = r5.getName()
            boolean r7 = r7.equals(r8)
            if (r7 == 0) goto L3a
            java.lang.Class r7 = r5.getReturnType()
            java.lang.Class r8 = java.lang.Integer.TYPE
            if (r7 != r8) goto L3a
            r1 = r6
        L3a:
            java.lang.String r7 = "getUri"
            java.lang.String r8 = r5.getName()
            boolean r7 = r7.equals(r8)
            if (r7 == 0) goto L4f
            java.lang.Class r7 = r5.getReturnType()
            java.lang.Class<java.lang.String> r8 = java.lang.String.class
            if (r7 != r8) goto L4f
            r2 = r6
        L4f:
            java.lang.String r7 = "getReqObj"
            java.lang.String r8 = r5.getName()
            boolean r7 = r7.equals(r8)
            java.lang.Class r8 = java.lang.Void.TYPE
            if (r7 == 0) goto L64
            java.lang.Class r7 = r5.getReturnType()
            if (r7 == r8) goto L64
            r3 = r6
        L64:
            java.lang.String r7 = "getRespObj"
            java.lang.String r9 = r5.getName()
            boolean r7 = r7.equals(r9)
            if (r7 == 0) goto L10
            java.lang.Class r5 = r5.getReturnType()
            if (r5 == r8) goto L10
            r4 = r6
            goto L10
        L78:
            if (r1 == 0) goto L81
            if (r2 == 0) goto L81
            if (r3 == 0) goto L81
            if (r4 == 0) goto L81
            return r6
        L81:
            return r0
    }

    private boolean hasTransferOperationCtor(java.lang.Class<?> r8) {
            r7 = this;
            r0 = 0
            if (r8 != 0) goto L4
            return r0
        L4:
            java.util.List r8 = h.Hchat.utils.KavaReflector.declaredConstructors(r8)
            java.util.Iterator r8 = r8.iterator()
        Lc:
            boolean r1 = r8.hasNext()
            if (r1 == 0) goto L63
            java.lang.Object r1 = r8.next()
            java.lang.reflect.Constructor r1 = (java.lang.reflect.Constructor) r1
            java.lang.Class[] r1 = r1.getParameterTypes()
            int r2 = r1.length
            r3 = 9
            if (r2 == r3) goto L36
            int r2 = r1.length
            r3 = 10
            if (r2 == r3) goto L36
            int r2 = r1.length
            r3 = 12
            if (r2 == r3) goto L36
            int r2 = r1.length
            r3 = 13
            if (r2 == r3) goto L36
            int r2 = r1.length
            r3 = 14
            if (r2 == r3) goto L36
            goto Lc
        L36:
            int r2 = r1.length
            r3 = 6
            if (r2 >= r3) goto L3b
            goto Lc
        L3b:
            r2 = r1[r0]
            java.lang.Class<java.lang.String> r3 = java.lang.String.class
            if (r2 != r3) goto Lc
            r2 = 1
            r4 = r1[r2]
            if (r4 != r3) goto Lc
            r4 = 2
            r4 = r1[r4]
            java.lang.Class<java.lang.Integer> r5 = java.lang.Integer.class
            java.lang.Class r6 = java.lang.Integer.TYPE
            if (r4 == r6) goto L51
            if (r4 != r5) goto Lc
        L51:
            r4 = 3
            r4 = r1[r4]
            if (r4 != r3) goto Lc
            r4 = 4
            r4 = r1[r4]
            if (r4 != r3) goto Lc
            r3 = 5
            r1 = r1[r3]
            if (r1 == r6) goto L62
            if (r1 != r5) goto Lc
        L62:
            return r2
        L63:
            return r0
    }

    private boolean hasVerifyUserCtor(java.lang.Class<?> r12) {
            r11 = this;
            r0 = 0
            if (r12 != 0) goto L4
            return r0
        L4:
            java.util.List r12 = h.Hchat.utils.KavaReflector.declaredConstructors(r12)
            java.util.Iterator r12 = r12.iterator()
        Lc:
            boolean r1 = r12.hasNext()
            if (r1 == 0) goto L9c
            java.lang.Object r1 = r12.next()
            java.lang.reflect.Constructor r1 = (java.lang.reflect.Constructor) r1
            java.lang.Class[] r1 = r1.getParameterTypes()
            int r2 = r1.length
            r3 = 3
            r4 = 2
            r5 = 4
            r6 = 1
            java.lang.Class<java.lang.String> r7 = java.lang.String.class
            if (r2 != r5) goto L3e
            r2 = r1[r0]
            boolean r2 = r11.isIntClass(r2)
            if (r2 == 0) goto L3e
            r2 = r1[r6]
            if (r2 != r7) goto L3e
            r2 = r1[r4]
            if (r2 != r7) goto L3e
            r2 = r1[r3]
            boolean r2 = r11.isIntClass(r2)
            if (r2 == 0) goto L3e
            return r6
        L3e:
            int r2 = r1.length
            r8 = 5
            r9 = 6
            if (r2 != r9) goto L68
            r2 = r1[r0]
            boolean r2 = r11.isIntClass(r2)
            if (r2 == 0) goto L68
            r2 = r1[r6]
            if (r2 != r7) goto L68
            r2 = r1[r4]
            if (r2 != r7) goto L68
            r2 = r1[r3]
            boolean r2 = r11.isIntClass(r2)
            if (r2 == 0) goto L68
            r2 = r1[r5]
            if (r2 != r7) goto L68
            r2 = r1[r8]
            boolean r2 = r11.isIntClass(r2)
            if (r2 == 0) goto L68
            return r6
        L68:
            int r2 = r1.length
            r10 = 8
            if (r2 != r10) goto Lc
            r2 = r1[r0]
            boolean r2 = r11.isIntClass(r2)
            if (r2 == 0) goto Lc
            r2 = r1[r6]
            if (r2 != r7) goto Lc
            r2 = r1[r4]
            if (r2 != r7) goto Lc
            r2 = r1[r3]
            boolean r2 = r11.isIntClass(r2)
            if (r2 == 0) goto Lc
            r2 = r1[r5]
            if (r2 != r7) goto Lc
            r2 = r1[r8]
            boolean r2 = r11.isIntClass(r2)
            if (r2 == 0) goto Lc
            java.lang.Class<java.util.List> r2 = java.util.List.class
            r1 = r1[r9]
            boolean r1 = r2.isAssignableFrom(r1)
            if (r1 == 0) goto Lc
            return r6
        L9c:
            return r0
    }

    private boolean isAppMsgParseMethod(java.lang.reflect.Method r3, java.lang.Class<?> r4) {
            r2 = this;
            r0 = 0
            if (r3 == 0) goto L23
            if (r4 != 0) goto L6
            goto L23
        L6:
            boolean r1 = h.Hchat.utils.KavaReflector.isStatic(r3)
            if (r1 != 0) goto Ld
            return r0
        Ld:
            java.lang.Class r1 = r3.getReturnType()
            if (r1 == r4) goto L14
            return r0
        L14:
            java.lang.Class[] r3 = r3.getParameterTypes()
            int r4 = r3.length
            r1 = 1
            if (r4 != r1) goto L23
            r3 = r3[r0]
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            if (r3 != r4) goto L23
            return r1
        L23:
            return r0
    }

    private boolean isCacheUsable() {
            r1 = this;
            java.util.List<java.lang.Class<?>> r0 = r1.addMsgClasses
            if (r0 == 0) goto L28
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L28
            java.lang.Class<?> r0 = r1.receiveLuckyMoneyClass
            if (r0 == 0) goto L28
            java.lang.Class<?> r0 = r1.openLuckyMoneyClass
            if (r0 == 0) goto L28
            java.lang.Class<?> r0 = r1.netQueueClass
            if (r0 == 0) goto L28
            java.lang.Class<?> r0 = r1.sendTextMsgClass
            if (r0 == 0) goto L28
            java.lang.Class<?> r0 = r1.sqliteDbWrapperClass
            if (r0 == 0) goto L28
            java.lang.reflect.Method r0 = r1.chatPageStartMethod
            if (r0 == 0) goto L28
            java.lang.reflect.Method r0 = r1.chatPageFragmentEnterMethod
            if (r0 == 0) goto L28
            r0 = 1
            return r0
        L28:
            r0 = 0
            return r0
    }

    private boolean isChatFooterSendClickMethod(java.lang.reflect.Method r5) {
            r4 = this;
            r0 = 0
            if (r5 != 0) goto L4
            return r0
        L4:
            java.lang.String r1 = "onClick"
            java.lang.String r2 = r5.getName()
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L11
            return r0
        L11:
            java.lang.Class r1 = r5.getReturnType()
            java.lang.Class r2 = java.lang.Void.TYPE
            if (r1 == r2) goto L1a
            return r0
        L1a:
            java.lang.Class[] r1 = r5.getParameterTypes()
            int r2 = r1.length
            r3 = 1
            if (r2 != r3) goto L71
            r1 = r1[r0]
            java.lang.Class<android.view.View> r2 = android.view.View.class
            if (r1 == r2) goto L29
            goto L71
        L29:
            java.lang.Class r5 = r5.getDeclaringClass()
            if (r5 != 0) goto L30
            return r0
        L30:
            java.lang.Package r1 = r5.getPackage()
            if (r1 == 0) goto L3f
            java.lang.Package r1 = r5.getPackage()
            java.lang.String r1 = r1.getName()
            goto L41
        L3f:
            java.lang.String r1 = ""
        L41:
            java.lang.String r2 = "com.tencent.mm.pluginsdk.ui.chat"
            boolean r1 = r2.equals(r1)
            if (r1 != 0) goto L4a
            return r0
        L4a:
            java.util.List r5 = h.Hchat.utils.KavaReflector.declaredFields(r5)
            java.util.Iterator r5 = r5.iterator()
        L52:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L71
            java.lang.Object r1 = r5.next()
            java.lang.reflect.Field r1 = (java.lang.reflect.Field) r1
            java.lang.Class r1 = r1.getType()
            if (r1 == 0) goto L52
            java.lang.String r2 = "com.tencent.mm.pluginsdk.ui.chat.ChatFooter"
            java.lang.String r1 = r1.getName()
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L52
            return r3
        L71:
            return r0
    }

    private boolean isChatPageStartMethod(java.lang.reflect.Method r5) {
            r4 = this;
            r0 = 0
            if (r5 == 0) goto L2d
            java.lang.Class r1 = r5.getReturnType()
            java.lang.Class r2 = java.lang.Void.TYPE
            if (r1 == r2) goto Lc
            goto L2d
        Lc:
            java.lang.Class[] r5 = r5.getParameterTypes()
            int r1 = r5.length
            r2 = 3
            if (r1 != r2) goto L2d
            r1 = r5[r0]
            java.lang.Class<java.lang.String> r2 = java.lang.String.class
            if (r1 != r2) goto L2d
            r1 = 1
            r2 = r5[r1]
            java.lang.Class<android.os.Bundle> r3 = android.os.Bundle.class
            if (r2 != r3) goto L2d
            r2 = 2
            r5 = r5[r2]
            java.lang.Class r2 = java.lang.Boolean.TYPE
            if (r5 == r2) goto L2c
            java.lang.Class<java.lang.Boolean> r2 = java.lang.Boolean.class
            if (r5 != r2) goto L2d
        L2c:
            return r1
        L2d:
            return r0
    }

    private boolean isChatroomMuteApiReady() {
            r2 = this;
            java.lang.reflect.Method r0 = r2.chatroomMuteBuildMethod
            boolean r0 = r2.isChatroomMuteBuildMethod(r0)
            if (r0 == 0) goto L1e
            java.lang.reflect.Method r0 = r2.chatroomMuteServiceGetterMethod
            java.lang.reflect.Method r1 = r2.chatroomMuteBuildMethod
            boolean r0 = r2.isChatroomMuteServiceGetterMethod(r0, r1)
            if (r0 == 0) goto L1e
            java.lang.reflect.Method r0 = r2.chatroomMuteSubmitMethod
            java.lang.reflect.Method r1 = r2.chatroomMuteBuildMethod
            boolean r0 = r2.isChatroomMuteSubmitMethod(r0, r1)
            if (r0 == 0) goto L1e
            r0 = 1
            return r0
        L1e:
            r0 = 0
            return r0
    }

    private boolean isChatroomMuteBuildMethod(java.lang.reflect.Method r6) {
            r5 = this;
            r0 = 0
            if (r6 == 0) goto L4d
            boolean r1 = h.Hchat.utils.KavaReflector.isStatic(r6)
            if (r1 != 0) goto L4d
            java.lang.Class r1 = r6.getReturnType()
            java.lang.Class r2 = java.lang.Void.TYPE
            if (r1 == r2) goto L4d
            java.lang.Class r1 = r6.getReturnType()
            boolean r1 = r1.isPrimitive()
            if (r1 != 0) goto L4d
            java.lang.Class r1 = r6.getReturnType()
            java.lang.String r1 = r1.getName()
            java.lang.String r2 = "com.tencent.mm.roomsdk.model.factory."
            boolean r1 = r1.startsWith(r2)
            if (r1 != 0) goto L2c
            goto L4d
        L2c:
            java.lang.Class[] r6 = r6.getParameterTypes()
            int r1 = r6.length
            r2 = 2
            if (r1 == r2) goto L38
            int r1 = r6.length
            r3 = 3
            if (r1 != r3) goto L4d
        L38:
            r1 = r6[r0]
            java.lang.Class<java.lang.String> r3 = java.lang.String.class
            if (r1 != r3) goto L4d
            r1 = 1
            r3 = r6[r1]
            java.lang.Class r4 = java.lang.Integer.TYPE
            if (r3 != r4) goto L4d
            int r3 = r6.length
            if (r3 == r2) goto L4c
            r6 = r6[r2]
            if (r6 != r4) goto L4d
        L4c:
            return r1
        L4d:
            return r0
    }

    private boolean isChatroomMuteServiceGetterMethod(java.lang.reflect.Method r5, java.lang.reflect.Method r6) {
            r4 = this;
            r0 = 0
            if (r5 == 0) goto L25
            if (r6 == 0) goto L25
            boolean r1 = h.Hchat.utils.KavaReflector.isStatic(r5)
            if (r1 == 0) goto Lc
            goto L25
        Lc:
            java.lang.Class[] r1 = r5.getParameterTypes()
            int r2 = r1.length
            r3 = 1
            if (r2 != r3) goto L25
            r1 = r1[r0]
            java.lang.Class<java.lang.String> r2 = java.lang.String.class
            if (r1 != r2) goto L25
            java.lang.Class r5 = r5.getReturnType()
            java.lang.Class r6 = r6.getDeclaringClass()
            if (r5 != r6) goto L25
            return r3
        L25:
            return r0
    }

    private boolean isChatroomMuteSubmitMethod(java.lang.reflect.Method r3, java.lang.reflect.Method r4) {
            r2 = this;
            if (r3 == 0) goto L29
            if (r4 == 0) goto L29
            boolean r0 = h.Hchat.utils.KavaReflector.isStatic(r3)
            if (r0 != 0) goto L29
            java.lang.Class r0 = r3.getReturnType()
            java.lang.Class r1 = java.lang.Void.TYPE
            if (r0 != r1) goto L29
            java.lang.Class[] r0 = r3.getParameterTypes()
            int r0 = r0.length
            if (r0 != 0) goto L29
            java.lang.Class r3 = r3.getDeclaringClass()
            java.lang.Class r4 = r4.getReturnType()
            boolean r3 = r3.isAssignableFrom(r4)
            if (r3 == 0) goto L29
            r3 = 1
            return r3
        L29:
            r3 = 0
            return r3
    }

    private boolean isContactCardXmlMethod(java.lang.reflect.Method r5) {
            r4 = this;
            r0 = 0
            if (r5 == 0) goto L29
            boolean r1 = h.Hchat.utils.KavaReflector.isStatic(r5)
            if (r1 != 0) goto La
            goto L29
        La:
            java.lang.Class r1 = r5.getReturnType()
            java.lang.Class<java.lang.String> r2 = java.lang.String.class
            if (r1 == r2) goto L13
            return r0
        L13:
            java.lang.Class[] r5 = r5.getParameterTypes()
            int r1 = r5.length
            r3 = 2
            if (r1 != r3) goto L29
            r1 = r5[r0]
            if (r1 != r2) goto L29
            r1 = 1
            r5 = r5[r1]
            boolean r5 = r5.isPrimitive()
            if (r5 != 0) goto L29
            return r1
        L29:
            return r0
    }

    private boolean isContactMuteMethod(java.lang.reflect.Method r4) {
            r3 = this;
            r0 = 0
            if (r4 == 0) goto L2a
            boolean r1 = h.Hchat.utils.KavaReflector.isStatic(r4)
            if (r1 == 0) goto L2a
            java.lang.Class r1 = r4.getReturnType()
            java.lang.Class r2 = java.lang.Void.TYPE
            if (r1 == r2) goto L12
            goto L2a
        L12:
            java.lang.Class[] r4 = r4.getParameterTypes()
            int r1 = r4.length
            r2 = 2
            if (r1 != r2) goto L2a
            r1 = r4[r0]
            boolean r1 = r1.isPrimitive()
            if (r1 != 0) goto L2a
            r1 = 1
            r4 = r4[r1]
            java.lang.Class r2 = java.lang.Boolean.TYPE
            if (r4 != r2) goto L2a
            return r1
        L2a:
            return r0
    }

    private boolean isContactMuteStateMethod(java.lang.reflect.Method r4, java.lang.reflect.Method r5) {
            r3 = this;
            r0 = 0
            if (r4 == 0) goto L35
            boolean r1 = r3.isContactMuteMethod(r5)
            if (r1 == 0) goto L35
            boolean r1 = h.Hchat.utils.KavaReflector.isStatic(r4)
            if (r1 == 0) goto L35
            java.lang.Class r1 = r4.getReturnType()
            java.lang.Class r2 = java.lang.Boolean.TYPE
            if (r1 != r2) goto L35
            java.lang.Class r1 = r4.getDeclaringClass()
            java.lang.Class r2 = r5.getDeclaringClass()
            if (r1 == r2) goto L22
            goto L35
        L22:
            java.lang.Class[] r4 = r4.getParameterTypes()
            int r1 = r4.length
            r2 = 1
            if (r1 != r2) goto L35
            r4 = r4[r0]
            java.lang.Class[] r5 = r5.getParameterTypes()
            r5 = r5[r0]
            if (r4 != r5) goto L35
            return r2
        L35:
            return r0
    }

    private boolean isContactStorageGetterMethod(java.lang.reflect.Method r3, java.lang.reflect.Method r4) {
            r2 = this;
            r0 = 0
            if (r3 == 0) goto L2d
            if (r4 == 0) goto L2d
            boolean r1 = h.Hchat.utils.KavaReflector.isStatic(r3)
            if (r1 != 0) goto L2d
            java.lang.Class[] r1 = r3.getParameterTypes()
            int r1 = r1.length
            if (r1 == 0) goto L13
            goto L2d
        L13:
            java.lang.Class r3 = r3.getReturnType()
            java.lang.Class r1 = java.lang.Void.TYPE
            if (r3 == r1) goto L2d
            boolean r1 = r3.isPrimitive()
            if (r1 != 0) goto L2d
            java.lang.Class r4 = r4.getDeclaringClass()
            boolean r3 = r4.isAssignableFrom(r3)
            if (r3 == 0) goto L2d
            r3 = 1
            return r3
        L2d:
            return r0
    }

    private boolean isContactStorageLookupApiReady() {
            r3 = this;
            java.lang.reflect.Method r0 = r3.contactMuteEnableMethod
            boolean r0 = r3.isContactMuteMethod(r0)
            r1 = 0
            if (r0 != 0) goto La
            return r1
        La:
            java.lang.reflect.Method r0 = r3.contactMuteEnableMethod
            java.lang.Class[] r0 = r0.getParameterTypes()
            r0 = r0[r1]
            java.lang.reflect.Method r2 = r3.contactStorageQueryMethod
            boolean r0 = r3.isContactStorageQueryMethod(r2, r0)
            if (r0 == 0) goto L26
            java.lang.reflect.Method r0 = r3.contactStorageGetterMethod
            java.lang.reflect.Method r2 = r3.contactStorageQueryMethod
            boolean r0 = r3.isContactStorageGetterMethod(r0, r2)
            if (r0 == 0) goto L26
            r0 = 1
            return r0
        L26:
            return r1
    }

    private boolean isContactStorageQueryMethod(java.lang.reflect.Method r3, java.lang.Class<?> r4) {
            r2 = this;
            r0 = 0
            if (r3 == 0) goto L28
            if (r4 == 0) goto L28
            boolean r1 = h.Hchat.utils.KavaReflector.isStatic(r3)
            if (r1 != 0) goto L28
            java.lang.Class r1 = r3.getReturnType()
            if (r1 == r4) goto L12
            goto L28
        L12:
            java.lang.Class[] r3 = r3.getParameterTypes()
            int r4 = r3.length
            r1 = 2
            if (r4 != r1) goto L28
            r4 = r3[r0]
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            if (r4 != r1) goto L28
            r4 = 1
            r3 = r3[r4]
            java.lang.Class r1 = java.lang.Boolean.TYPE
            if (r3 != r1) goto L28
            return r4
        L28:
            return r0
    }

    private boolean isConversationDeleteMethod(java.lang.reflect.Method r4) {
            r3 = this;
            r0 = 0
            if (r4 == 0) goto L33
            boolean r1 = h.Hchat.utils.KavaReflector.isStatic(r4)
            if (r1 != 0) goto L33
            java.lang.Class r1 = r4.getReturnType()
            java.lang.Class r2 = java.lang.Void.TYPE
            if (r1 == r2) goto L12
            goto L33
        L12:
            java.lang.Class r1 = r4.getDeclaringClass()
            java.lang.Class[] r4 = r4.getParameterTypes()
            if (r1 == 0) goto L33
            java.lang.String r1 = r1.getName()
            java.lang.String r2 = "com.tencent.mm.storage."
            boolean r1 = r1.startsWith(r2)
            if (r1 == 0) goto L33
            int r1 = r4.length
            r2 = 1
            if (r1 != r2) goto L33
            r4 = r4[r0]
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            if (r4 != r1) goto L33
            return r2
        L33:
            return r0
    }

    private boolean isEmojiCreateInfoMethod(java.lang.reflect.Method r6) {
            r5 = this;
            r0 = 0
            if (r6 == 0) goto L36
            java.lang.Class r1 = r6.getReturnType()
            boolean r1 = r5.isEmojiInfoClass(r1)
            if (r1 != 0) goto Le
            goto L36
        Le:
            java.lang.Class[] r6 = r6.getParameterTypes()
            int r1 = r6.length
            r2 = 4
            if (r1 != r2) goto L36
            r1 = r6[r0]
            java.lang.Class<java.lang.String> r2 = java.lang.String.class
            if (r1 != r2) goto L36
            r1 = 1
            r2 = r6[r1]
            java.lang.Class<java.lang.Integer> r3 = java.lang.Integer.class
            java.lang.Class r4 = java.lang.Integer.TYPE
            if (r2 == r4) goto L27
            if (r2 != r3) goto L36
        L27:
            r2 = 2
            r2 = r6[r2]
            if (r2 == r4) goto L2e
            if (r2 != r3) goto L36
        L2e:
            r2 = 3
            r6 = r6[r2]
            if (r6 == r4) goto L35
            if (r6 != r3) goto L36
        L35:
            return r1
        L36:
            return r0
    }

    private boolean isEmojiDecodeDataMethod(java.lang.reflect.Method r4) {
            r3 = this;
            r0 = 0
            if (r4 == 0) goto L29
            boolean r1 = h.Hchat.utils.KavaReflector.isStatic(r4)
            if (r1 != 0) goto L29
            java.lang.Class r1 = r4.getReturnType()
            java.lang.Class<byte[]> r2 = byte[].class
            if (r1 == r2) goto L12
            goto L29
        L12:
            java.lang.Class[] r4 = r4.getParameterTypes()
            int r1 = r4.length
            r2 = 1
            if (r1 != r2) goto L29
            r4 = r4[r0]
            java.lang.String r4 = r4.getName()
            java.lang.String r1 = "com.tencent.mm.api.IEmojiInfo"
            boolean r4 = r1.equals(r4)
            if (r4 == 0) goto L29
            return r2
        L29:
            return r0
    }

    private boolean isEmojiFilePathMethod(java.lang.reflect.Method r5) {
            r4 = this;
            r0 = 0
            if (r5 == 0) goto L29
            java.lang.Class r1 = r5.getReturnType()
            java.lang.Class<java.lang.String> r2 = java.lang.String.class
            if (r1 == r2) goto Lc
            goto L29
        Lc:
            java.lang.Class[] r1 = r5.getParameterTypes()
            boolean r5 = h.Hchat.utils.KavaReflector.isStatic(r5)
            if (r5 == 0) goto L29
            int r5 = r1.length
            r3 = 3
            if (r5 != r3) goto L29
            r5 = r1[r0]
            if (r5 != r2) goto L29
            r5 = 1
            r3 = r1[r5]
            if (r3 != r2) goto L29
            r3 = 2
            r1 = r1[r3]
            if (r1 != r2) goto L29
            return r5
        L29:
            return r0
    }

    private boolean isEmojiGetByMd5Method(java.lang.reflect.Method r4) {
            r3 = this;
            r0 = 0
            if (r4 == 0) goto L1d
            java.lang.Class r1 = r4.getReturnType()
            boolean r1 = r3.isEmojiInfoClass(r1)
            if (r1 != 0) goto Le
            goto L1d
        Le:
            java.lang.Class[] r4 = r4.getParameterTypes()
            int r1 = r4.length
            r2 = 1
            if (r1 != r2) goto L1d
            r4 = r4[r0]
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            if (r4 != r1) goto L1d
            return r2
        L1d:
            return r0
    }

    private boolean isEmojiInfoClass(java.lang.Class<?> r2) {
            r1 = this;
            if (r2 == 0) goto L10
            java.lang.String r0 = "com.tencent.mm.storage.emotion.EmojiInfo"
            java.lang.String r2 = r2.getName()
            boolean r2 = r0.equals(r2)
            if (r2 == 0) goto L10
            r2 = 1
            return r2
        L10:
            r2 = 0
            return r2
    }

    private boolean isEmojiManagerSendMethod(java.lang.reflect.Method r5) {
            r4 = this;
            r0 = 0
            if (r5 == 0) goto L45
            java.lang.Class r1 = r5.getReturnType()
            java.lang.Class r2 = java.lang.Boolean.TYPE
            if (r1 == r2) goto Lc
            goto L45
        Lc:
            java.lang.Class[] r5 = r5.getParameterTypes()
            int r1 = r5.length
            r2 = 5
            if (r1 != r2) goto L45
            java.lang.Class<android.content.Context> r1 = android.content.Context.class
            r2 = r5[r0]
            boolean r1 = r1.isAssignableFrom(r2)
            if (r1 == 0) goto L45
            r1 = 1
            r2 = r5[r1]
            java.lang.Class<java.lang.String> r3 = java.lang.String.class
            if (r2 != r3) goto L45
            r2 = 2
            r2 = r5[r2]
            if (r2 != r3) goto L45
            r2 = 3
            r2 = r5[r2]
            java.lang.String r2 = r2.getName()
            java.lang.String r3 = "com.tencent.mm.plugin.msg.MsgIdTalker"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L45
            r2 = 4
            r5 = r5[r2]
            java.lang.Class r2 = java.lang.Integer.TYPE
            if (r5 == r2) goto L44
            java.lang.Class<java.lang.Integer> r2 = java.lang.Integer.class
            if (r5 != r2) goto L45
        L44:
            return r1
        L45:
            return r0
    }

    private boolean isEmojiSendMethod(java.lang.reflect.Method r4) {
            r3 = this;
            r0 = 0
            if (r4 == 0) goto L25
            java.lang.Class r1 = r4.getReturnType()
            java.lang.Class r2 = java.lang.Void.TYPE
            if (r1 == r2) goto Lc
            goto L25
        Lc:
            java.lang.Class[] r4 = r4.getParameterTypes()
            int r1 = r4.length
            r2 = 4
            if (r1 >= r2) goto L15
            return r0
        L15:
            r1 = r4[r0]
            java.lang.Class<java.lang.String> r2 = java.lang.String.class
            if (r1 != r2) goto L25
            r1 = 1
            r4 = r4[r1]
            boolean r4 = r3.isEmojiInfoClass(r4)
            if (r4 == 0) goto L25
            return r1
        L25:
            return r0
    }

    private boolean isEmojiUpdateInfoMethod(java.lang.reflect.Method r4) {
            r3 = this;
            r0 = 0
            if (r4 == 0) goto L1d
            java.lang.Class r1 = r4.getReturnType()
            java.lang.Class r2 = java.lang.Void.TYPE
            if (r1 == r2) goto Lc
            goto L1d
        Lc:
            java.lang.Class[] r4 = r4.getParameterTypes()
            int r1 = r4.length
            r2 = 1
            if (r1 != r2) goto L1d
            r4 = r4[r0]
            boolean r4 = r3.isEmojiInfoClass(r4)
            if (r4 == 0) goto L1d
            return r2
        L1d:
            return r0
    }

    private boolean isExactInstanceMethod(java.lang.reflect.Method r2, java.lang.Class<?> r3, java.lang.Class<?> r4, java.lang.Class<?>... r5) {
            r1 = this;
            if (r2 == 0) goto L22
            if (r3 == 0) goto L22
            java.lang.Class r0 = r2.getDeclaringClass()
            if (r0 != r3) goto L22
            boolean r3 = h.Hchat.utils.KavaReflector.isStatic(r2)
            if (r3 != 0) goto L22
            java.lang.Class r3 = r2.getReturnType()
            if (r3 != r4) goto L22
            java.lang.Class[] r2 = r2.getParameterTypes()
            boolean r2 = java.util.Arrays.equals(r2, r5)
            if (r2 == 0) goto L22
            r2 = 1
            return r2
        L22:
            r2 = 0
            return r2
    }

    private boolean isFavoriteGetMethod(java.lang.reflect.Method r5) {
            r4 = this;
            r0 = 0
            if (r5 == 0) goto L2b
            int r1 = r5.getModifiers()
            boolean r1 = java.lang.reflect.Modifier.isStatic(r1)
            if (r1 == 0) goto Le
            goto L2b
        Le:
            java.lang.Class[] r1 = r5.getParameterTypes()
            int r2 = r1.length
            r3 = 1
            if (r2 != r3) goto L2b
            r1 = r1[r0]
            java.lang.Class r2 = java.lang.Long.TYPE
            if (r1 != r2) goto L2b
            java.lang.Class<?> r1 = r4.favoriteItemClass
            if (r1 == 0) goto L2b
            java.lang.Class r5 = r5.getReturnType()
            boolean r5 = r1.isAssignableFrom(r5)
            if (r5 == 0) goto L2b
            return r3
        L2b:
            return r0
    }

    private boolean isFavoriteItemClass(java.lang.Class<?> r3) {
            r2 = this;
            r0 = 0
            if (r3 != 0) goto L4
            return r0
        L4:
            java.lang.String r1 = "field_localId"
            java.lang.reflect.Field r1 = h.Hchat.utils.KavaReflector.findFieldRecursive(r3, r1)
            if (r1 != 0) goto Ld
            return r0
        Ld:
            java.lang.String r1 = "field_type"
            java.lang.reflect.Field r1 = h.Hchat.utils.KavaReflector.findFieldRecursive(r3, r1)
            if (r1 != 0) goto L16
            return r0
        L16:
            java.lang.String r1 = "field_favProto"
            java.lang.reflect.Field r1 = h.Hchat.utils.KavaReflector.findFieldRecursive(r3, r1)
            if (r1 != 0) goto L1f
            return r0
        L1f:
            java.lang.Class[] r1 = new java.lang.Class[r0]
            java.lang.reflect.Constructor r1 = h.Hchat.utils.KavaReflector.findConstructor(r3, r1)
            if (r1 != 0) goto L28
            return r0
        L28:
            java.lang.reflect.Method r3 = r2.findFavoriteItemConvertFromCursorMethod(r3)
            if (r3 == 0) goto L30
            r3 = 1
            return r3
        L30:
            return r0
    }

    private boolean isFavoriteItemConvertFromCursorMethod(java.lang.reflect.Method r4) {
            r3 = this;
            r0 = 0
            if (r4 == 0) goto L1f
            java.lang.Class r1 = r4.getReturnType()
            java.lang.Class r2 = java.lang.Void.TYPE
            if (r1 == r2) goto Lc
            goto L1f
        Lc:
            java.lang.Class[] r4 = r4.getParameterTypes()
            int r1 = r4.length
            r2 = 1
            if (r1 != r2) goto L1f
            java.lang.Class<android.database.Cursor> r1 = android.database.Cursor.class
            r4 = r4[r0]
            boolean r4 = r1.isAssignableFrom(r4)
            if (r4 == 0) goto L1f
            return r2
        L1f:
            return r0
    }

    private boolean isFavoriteListCursorMethod(java.lang.reflect.Method r5) {
            r4 = this;
            r0 = 0
            if (r5 == 0) goto L2f
            int r1 = r5.getModifiers()
            boolean r1 = java.lang.reflect.Modifier.isStatic(r1)
            if (r1 != 0) goto Le
            goto L2f
        Le:
            java.lang.Class[] r1 = r5.getParameterTypes()
            java.lang.Class r5 = r5.getReturnType()
            java.lang.Class r2 = java.lang.Long.TYPE
            if (r5 != r2) goto L2f
            int r5 = r1.length
            r3 = 3
            if (r5 != r3) goto L2f
            r5 = r1[r0]
            if (r5 != r2) goto L2f
            r5 = 1
            r2 = r1[r5]
            java.lang.Class r3 = java.lang.Integer.TYPE
            if (r2 != r3) goto L2f
            r2 = 2
            r1 = r1[r2]
            if (r1 != r3) goto L2f
            return r5
        L2f:
            return r0
    }

    private boolean isFavoriteListMethod(java.lang.reflect.Method r6) {
            r5 = this;
            r0 = 0
            if (r6 == 0) goto L42
            int r1 = r6.getModifiers()
            boolean r1 = java.lang.reflect.Modifier.isStatic(r1)
            if (r1 == 0) goto Le
            goto L42
        Le:
            java.lang.Class[] r1 = r6.getParameterTypes()
            java.lang.Class r6 = r6.getReturnType()
            java.lang.Class<java.util.List> r2 = java.util.List.class
            boolean r6 = r2.isAssignableFrom(r6)
            if (r6 == 0) goto L42
            int r6 = r1.length
            r3 = 5
            if (r6 != r3) goto L42
            r6 = r1[r0]
            java.lang.Class r3 = java.lang.Integer.TYPE
            if (r6 != r3) goto L42
            r6 = 1
            r4 = r1[r6]
            if (r4 != r3) goto L42
            r3 = 2
            r3 = r1[r3]
            boolean r2 = r2.isAssignableFrom(r3)
            if (r2 == 0) goto L42
            r2 = 3
            r1 = r1[r2]
            java.lang.Class<java.util.Set> r2 = java.util.Set.class
            boolean r1 = r2.isAssignableFrom(r1)
            if (r1 == 0) goto L42
            return r6
        L42:
            return r0
    }

    private boolean isFavoriteListNextMethod(java.lang.reflect.Method r6) {
            r5 = this;
            r0 = 0
            if (r6 == 0) goto L44
            int r1 = r6.getModifiers()
            boolean r1 = java.lang.reflect.Modifier.isStatic(r1)
            if (r1 == 0) goto Le
            goto L44
        Le:
            java.lang.Class[] r1 = r6.getParameterTypes()
            java.lang.Class r6 = r6.getReturnType()
            java.lang.Class<java.util.List> r2 = java.util.List.class
            boolean r6 = r2.isAssignableFrom(r6)
            if (r6 == 0) goto L44
            int r6 = r1.length
            r3 = 5
            if (r6 != r3) goto L44
            r6 = r1[r0]
            java.lang.Class r3 = java.lang.Long.TYPE
            if (r6 != r3) goto L44
            r6 = 1
            r3 = r1[r6]
            java.lang.Class r4 = java.lang.Integer.TYPE
            if (r3 != r4) goto L44
            r3 = 2
            r3 = r1[r3]
            boolean r2 = r2.isAssignableFrom(r3)
            if (r2 == 0) goto L44
            r2 = 3
            r1 = r1[r2]
            java.lang.Class<java.util.Set> r2 = java.util.Set.class
            boolean r1 = r2.isAssignableFrom(r1)
            if (r1 == 0) goto L44
            return r6
        L44:
            return r0
    }

    private boolean isFavoriteSendMethod(java.lang.reflect.Method r9) {
            r8 = this;
            r0 = 0
            if (r9 == 0) goto L64
            boolean r1 = h.Hchat.utils.KavaReflector.isStatic(r9)
            if (r1 == 0) goto L64
            java.lang.Class r1 = r9.getReturnType()
            java.lang.Class r2 = java.lang.Void.TYPE
            if (r1 == r2) goto L12
            goto L64
        L12:
            java.lang.Class[] r9 = r9.getParameterTypes()
            int r1 = r9.length
            r2 = 2
            java.lang.Class<java.lang.Runnable> r3 = java.lang.Runnable.class
            java.lang.Class<android.content.Context> r4 = android.content.Context.class
            r5 = 3
            r6 = 1
            if (r1 != r5) goto L3a
            r1 = r9[r0]
            boolean r1 = r4.isAssignableFrom(r1)
            if (r1 == 0) goto L39
            r1 = r9[r6]
            boolean r1 = r8.isFavoriteSendParamClass(r1)
            if (r1 == 0) goto L39
            r9 = r9[r2]
            boolean r9 = r3.isAssignableFrom(r9)
            if (r9 == 0) goto L39
            return r6
        L39:
            return r0
        L3a:
            int r1 = r9.length
            r7 = 5
            if (r1 != r7) goto L64
            r1 = r9[r0]
            boolean r1 = r4.isAssignableFrom(r1)
            if (r1 == 0) goto L64
            r1 = r9[r6]
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            if (r1 != r4) goto L64
            r1 = r9[r2]
            if (r1 != r4) goto L64
            java.lang.Class<java.util.List> r1 = java.util.List.class
            r2 = r9[r5]
            boolean r1 = r1.isAssignableFrom(r2)
            if (r1 == 0) goto L64
            r1 = 4
            r9 = r9[r1]
            boolean r9 = r3.isAssignableFrom(r9)
            if (r9 == 0) goto L64
            return r6
        L64:
            return r0
    }

    private boolean isFavoriteSendParamClass(java.lang.Class<?> r8) {
            r7 = this;
            r0 = 0
            if (r8 == 0) goto L3d
            boolean r1 = r8.isPrimitive()
            if (r1 == 0) goto La
            goto L3d
        La:
            java.util.List r8 = h.Hchat.utils.KavaReflector.declaredFields(r8)
            java.util.Iterator r8 = r8.iterator()
            r1 = r0
            r2 = r1
        L14:
            boolean r3 = r8.hasNext()
            r4 = 1
            if (r3 == 0) goto L38
            java.lang.Object r3 = r8.next()
            java.lang.reflect.Field r3 = (java.lang.reflect.Field) r3
            java.lang.Class r5 = r3.getType()
            java.lang.Class<java.lang.String> r6 = java.lang.String.class
            if (r5 != r6) goto L2a
            r1 = r4
        L2a:
            java.lang.Class<java.util.List> r5 = java.util.List.class
            java.lang.Class r3 = r3.getType()
            boolean r3 = r5.isAssignableFrom(r3)
            if (r3 == 0) goto L14
            r2 = r4
            goto L14
        L38:
            if (r1 == 0) goto L3d
            if (r2 == 0) goto L3d
            return r4
        L3d:
            return r0
    }

    private boolean isFavoriteServiceResolverMethod(java.lang.reflect.Method r5) {
            r4 = this;
            r0 = 0
            if (r5 == 0) goto L25
            int r1 = r5.getModifiers()
            boolean r1 = java.lang.reflect.Modifier.isStatic(r1)
            if (r1 != 0) goto Le
            goto L25
        Le:
            java.lang.Class[] r1 = r5.getParameterTypes()
            int r2 = r1.length
            r3 = 1
            if (r2 != r3) goto L25
            r1 = r1[r0]
            java.lang.Class<java.lang.Class> r2 = java.lang.Class.class
            if (r1 != r2) goto L25
            java.lang.Class r5 = r5.getReturnType()
            java.lang.Class r1 = java.lang.Void.TYPE
            if (r5 == r1) goto L25
            return r3
        L25:
            return r0
    }

    private boolean isFavoriteStorageGetterMethod(java.lang.reflect.Method r4) {
            r3 = this;
            r0 = 0
            if (r4 == 0) goto L29
            int r1 = r4.getModifiers()
            boolean r1 = java.lang.reflect.Modifier.isStatic(r1)
            if (r1 == 0) goto Le
            goto L29
        Le:
            java.lang.Class[] r1 = r4.getParameterTypes()
            int r1 = r1.length
            if (r1 != 0) goto L29
            java.lang.Class r1 = r4.getReturnType()
            java.lang.Class r2 = java.lang.Void.TYPE
            if (r1 == r2) goto L29
            java.lang.Class r4 = r4.getReturnType()
            boolean r4 = r4.isPrimitive()
            if (r4 != 0) goto L29
            r4 = 1
            return r4
        L29:
            return r0
    }

    private boolean isGetContactAddMethod(java.lang.reflect.Method r7) {
            r6 = this;
            r0 = 0
            if (r7 == 0) goto L3b
            java.lang.Class r1 = r7.getReturnType()
            java.lang.Class r2 = java.lang.Void.TYPE
            if (r1 == r2) goto Lc
            goto L3b
        Lc:
            java.lang.Class[] r7 = r7.getParameterTypes()
            if (r7 != 0) goto L13
            return r0
        L13:
            int r1 = r7.length
            r2 = 2
            r3 = 1
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            if (r1 != r2) goto L24
            r1 = r7[r0]
            if (r1 != r4) goto L23
            r7 = r7[r3]
            if (r7 != r4) goto L23
            return r3
        L23:
            return r0
        L24:
            int r1 = r7.length
            r5 = 3
            if (r1 != r5) goto L3b
            r1 = r7[r0]
            if (r1 != r4) goto L3b
            r1 = r7[r3]
            if (r1 != r4) goto L3b
            r7 = r7[r2]
            java.lang.Class r1 = java.lang.Integer.TYPE
            if (r7 == r1) goto L3a
            java.lang.Class<java.lang.Integer> r1 = java.lang.Integer.class
            if (r7 != r1) goto L3b
        L3a:
            return r3
        L3b:
            return r0
    }

    private boolean isGetContactServiceGetter(java.lang.reflect.Method r3, java.lang.Class<?> r4) {
            r2 = this;
            r0 = 0
            if (r3 == 0) goto L1f
            if (r4 != 0) goto L6
            goto L1f
        L6:
            boolean r1 = h.Hchat.utils.KavaReflector.isStatic(r3)
            if (r1 == 0) goto L1f
            java.lang.Class[] r1 = r3.getParameterTypes()
            int r1 = r1.length
            if (r1 != 0) goto L1f
            java.lang.Class r3 = r3.getReturnType()
            boolean r3 = r4.isAssignableFrom(r3)
            if (r3 == 0) goto L1f
            r3 = 1
            return r3
        L1f:
            return r0
    }

    private boolean isImageBestPathMethod(java.lang.reflect.Method r4) {
            r3 = this;
            r0 = 0
            if (r4 == 0) goto L29
            boolean r1 = h.Hchat.utils.KavaReflector.isStatic(r4)
            if (r1 != 0) goto L29
            java.lang.Class r1 = r4.getReturnType()
            java.lang.Class<java.lang.String> r2 = java.lang.String.class
            if (r1 == r2) goto L12
            goto L29
        L12:
            java.lang.Class[] r4 = r4.getParameterTypes()
            int r1 = r4.length
            r2 = 1
            if (r1 != r2) goto L29
            r4 = r4[r0]
            java.lang.String r4 = r4.getName()
            java.lang.String r1 = "com.tencent.mm.storage."
            boolean r4 = r4.startsWith(r1)
            if (r4 == 0) goto L29
            return r2
        L29:
            return r0
    }

    private boolean isImageCdnServiceGetterMethod(java.lang.reflect.Method r2) {
            r1 = this;
            if (r2 == 0) goto L21
            java.lang.reflect.Method r0 = r1.imageCdnSubmitMethod
            if (r0 == 0) goto L21
            boolean r0 = h.Hchat.utils.KavaReflector.isStatic(r2)
            if (r0 == 0) goto L21
            java.lang.Class[] r0 = r2.getParameterTypes()
            int r0 = r0.length
            if (r0 != 0) goto L21
            java.lang.Class r2 = r2.getReturnType()
            java.lang.reflect.Method r0 = r1.imageCdnSubmitMethod
            java.lang.Class r0 = r0.getDeclaringClass()
            if (r2 != r0) goto L21
            r2 = 1
            return r2
        L21:
            r2 = 0
            return r2
    }

    private boolean isImageCdnSubmitMethod(java.lang.reflect.Method r8) {
            r7 = this;
            r0 = 0
            if (r8 == 0) goto L53
            java.lang.Class<?> r1 = r7.imageCdnTaskClass
            if (r1 != 0) goto L8
            goto L53
        L8:
            java.lang.Class[] r1 = r8.getParameterTypes()
            int r2 = r1.length
            r3 = 2
            r4 = 1
            if (r2 == r4) goto L15
            int r2 = r1.length
            if (r2 == r3) goto L15
            return r0
        L15:
            r2 = r1[r0]
            java.lang.Class<?> r5 = r7.imageCdnTaskClass
            boolean r2 = r2.isAssignableFrom(r5)
            if (r2 != 0) goto L2a
            java.lang.Class<?> r2 = r7.imageCdnTaskClass
            r5 = r1[r0]
            boolean r2 = r2.isAssignableFrom(r5)
            if (r2 != 0) goto L2a
            return r0
        L2a:
            int r2 = r1.length
            java.lang.Class<java.lang.Integer> r5 = java.lang.Integer.class
            java.lang.Class r6 = java.lang.Integer.TYPE
            if (r2 != r3) goto L38
            r1 = r1[r4]
            if (r1 == r6) goto L38
            if (r1 == r5) goto L38
            return r0
        L38:
            java.lang.Class r8 = r8.getReturnType()
            java.lang.Class r1 = java.lang.Boolean.TYPE
            if (r8 == r1) goto L52
            java.lang.Class<java.lang.Boolean> r1 = java.lang.Boolean.class
            if (r8 == r1) goto L52
            if (r8 == r6) goto L52
            if (r8 == r5) goto L52
            java.lang.Class<?> r1 = r7.imageCdnTaskClass
            if (r8 == r1) goto L52
            java.lang.Class r1 = java.lang.Void.TYPE
            if (r8 != r1) goto L51
            goto L52
        L51:
            return r0
        L52:
            return r4
        L53:
            return r0
    }

    private boolean isImageCdnTaskClass(java.lang.Class<?> r3) {
            r2 = this;
            r0 = 0
            if (r3 != 0) goto L4
            return r0
        L4:
            java.lang.String r1 = "field_mediaId"
            java.lang.reflect.Field r1 = h.Hchat.utils.KavaReflector.findFieldRecursive(r3, r1)
            if (r1 == 0) goto L2e
            java.lang.String r1 = "field_fileId"
            java.lang.reflect.Field r1 = h.Hchat.utils.KavaReflector.findFieldRecursive(r3, r1)
            if (r1 == 0) goto L2e
            java.lang.String r1 = "field_aesKey"
            java.lang.reflect.Field r1 = h.Hchat.utils.KavaReflector.findFieldRecursive(r3, r1)
            if (r1 == 0) goto L2e
            java.lang.String r1 = "field_fullpath"
            java.lang.reflect.Field r1 = h.Hchat.utils.KavaReflector.findFieldRecursive(r3, r1)
            if (r1 == 0) goto L2e
            java.lang.String r1 = "field_fileType"
            java.lang.reflect.Field r3 = h.Hchat.utils.KavaReflector.findFieldRecursive(r3, r1)
            if (r3 == 0) goto L2e
            r3 = 1
            return r3
        L2e:
            return r0
    }

    private boolean isImageStorageGetter(java.lang.reflect.Method r2, java.lang.Class<?> r3) {
            r1 = this;
            if (r2 == 0) goto L19
            if (r3 == 0) goto L19
            boolean r0 = h.Hchat.utils.KavaReflector.isStatic(r2)
            if (r0 == 0) goto L19
            java.lang.Class[] r0 = r2.getParameterTypes()
            int r0 = r0.length
            if (r0 != 0) goto L19
            java.lang.Class r2 = r2.getReturnType()
            if (r2 != r3) goto L19
            r2 = 1
            return r2
        L19:
            r2 = 0
            return r2
    }

    private boolean isImageTokenPathMethod(java.lang.reflect.Method r5) {
            r4 = this;
            r0 = 0
            if (r5 == 0) goto L2a
            boolean r1 = h.Hchat.utils.KavaReflector.isStatic(r5)
            if (r1 != 0) goto L2a
            java.lang.Class r1 = r5.getReturnType()
            java.lang.Class<java.lang.String> r2 = java.lang.String.class
            if (r1 == r2) goto L12
            goto L2a
        L12:
            java.lang.Class[] r5 = r5.getParameterTypes()
            int r1 = r5.length
            r3 = 2
            if (r1 != r3) goto L2a
            r1 = r5[r0]
            if (r1 != r2) goto L2a
            r1 = 1
            r5 = r5[r1]
            java.lang.Class r2 = java.lang.Boolean.TYPE
            if (r5 == r2) goto L29
            java.lang.Class<java.lang.Boolean> r2 = java.lang.Boolean.class
            if (r5 != r2) goto L2a
        L29:
            return r1
        L2a:
            return r0
    }

    private boolean isIntClass(java.lang.Class<?> r2) {
            r1 = this;
            java.lang.Class r0 = java.lang.Integer.TYPE
            if (r2 == r0) goto Lb
            java.lang.Class<java.lang.Integer> r0 = java.lang.Integer.class
            if (r2 != r0) goto L9
            goto Lb
        L9:
            r2 = 0
            return r2
        Lb:
            r2 = 1
            return r2
    }

    private boolean isKotlinFlowReturn(java.lang.reflect.Method r3) {
            r2 = this;
            r0 = 0
            if (r3 == 0) goto L1c
            java.lang.Class r1 = r3.getReturnType()
            if (r1 != 0) goto La
            goto L1c
        La:
            java.lang.Class r3 = r3.getReturnType()
            java.lang.String r3 = r3.getName()
            java.lang.String r1 = "kotlinx.coroutines.flow."
            boolean r3 = r3.startsWith(r1)
            if (r3 == 0) goto L1c
            r3 = 1
            return r3
        L1c:
            return r0
    }

    private boolean isLocalMessageCreateTimeMethod(java.lang.reflect.Method r5) {
            r4 = this;
            r0 = 0
            if (r5 == 0) goto L2b
            java.lang.Class r1 = r5.getReturnType()
            java.lang.Class r2 = java.lang.Long.TYPE
            if (r1 == r2) goto Lc
            goto L2b
        Lc:
            boolean r1 = h.Hchat.utils.KavaReflector.isStatic(r5)
            if (r1 != 0) goto L13
            return r0
        L13:
            java.lang.Class[] r5 = r5.getParameterTypes()
            int r1 = r5.length
            r3 = 2
            if (r1 != r3) goto L2b
            r1 = r5[r0]
            java.lang.Class<java.lang.String> r3 = java.lang.String.class
            if (r1 != r3) goto L2b
            r1 = 1
            r5 = r5[r1]
            if (r5 == r2) goto L2a
            java.lang.Class<java.lang.Long> r2 = java.lang.Long.class
            if (r5 != r2) goto L2b
        L2a:
            return r1
        L2b:
            return r0
    }

    private boolean isLocalMessageInsertMethod(java.lang.reflect.Method r5) {
            r4 = this;
            r0 = 0
            if (r5 == 0) goto L44
            java.lang.Class r1 = r5.getReturnType()
            java.lang.Class r2 = java.lang.Long.TYPE
            if (r1 == r2) goto Lc
            goto L44
        Lc:
            boolean r1 = h.Hchat.utils.KavaReflector.isStatic(r5)
            if (r1 != 0) goto L13
            return r0
        L13:
            java.lang.Class[] r5 = r5.getParameterTypes()
            int r1 = r5.length
            r2 = 1
            if (r1 == r2) goto L1c
            return r0
        L1c:
            r5 = r5[r0]
            if (r5 == 0) goto L44
            java.lang.String r1 = r5.getName()
            java.lang.String r3 = "com.tencent.mm.storage."
            boolean r1 = r1.startsWith(r3)
            if (r1 != 0) goto L2d
            goto L44
        L2d:
            java.lang.Class[] r1 = new java.lang.Class[r0]
            java.lang.reflect.Constructor r1 = h.Hchat.utils.KavaReflector.findConstructor(r5, r1)
            if (r1 != 0) goto L43
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            java.lang.Class[] r1 = new java.lang.Class[]{r1}
            java.lang.reflect.Constructor r5 = h.Hchat.utils.KavaReflector.findConstructor(r5, r1)
            if (r5 == 0) goto L42
            goto L43
        L42:
            return r0
        L43:
            return r2
        L44:
            return r0
    }

    private boolean isLocalSystemMessageMethod(java.lang.reflect.Method r5) {
            r4 = this;
            r0 = 0
            if (r5 == 0) goto L2c
            java.lang.Class r1 = r5.getReturnType()
            java.lang.Class r2 = java.lang.Void.TYPE
            if (r1 == r2) goto Lc
            goto L2c
        Lc:
            boolean r1 = h.Hchat.utils.KavaReflector.isStatic(r5)
            if (r1 == 0) goto L13
            return r0
        L13:
            java.lang.Class[] r5 = r5.getParameterTypes()
            int r1 = r5.length
            r2 = 3
            if (r1 != r2) goto L2c
            r1 = r5[r0]
            java.lang.Class<java.lang.String> r2 = java.lang.String.class
            if (r1 != r2) goto L2c
            r1 = 1
            r3 = r5[r1]
            if (r3 != r2) goto L2c
            r3 = 2
            r5 = r5[r3]
            if (r5 != r2) goto L2c
            return r1
        L2c:
            return r0
    }

    private boolean isMarsCdnCallbackClass(java.lang.Class<?> r3) {
            r2 = this;
            r0 = 0
            if (r3 != 0) goto L4
            return r0
        L4:
            java.lang.String r3 = r3.getName()
            java.lang.String r1 = "DownloadCallback"
            boolean r1 = r3.contains(r1)
            if (r1 != 0) goto L1a
            java.lang.String r1 = "CdnCallback"
            boolean r3 = r3.contains(r1)
            if (r3 == 0) goto L19
            goto L1a
        L19:
            return r0
        L1a:
            r3 = 1
            return r3
    }

    private boolean isMarsCdnRequestClass(java.lang.Class<?> r6) {
            r5 = this;
            r0 = 0
            if (r6 != 0) goto L4
            return r0
        L4:
            java.lang.String r1 = r6.getName()
            java.lang.String r2 = "C2CDownloadRequest"
            boolean r1 = r1.contains(r2)
            r2 = 1
            if (r1 == 0) goto L12
            return r2
        L12:
            java.lang.String r1 = "setFileid"
            java.lang.Class<java.lang.String> r3 = java.lang.String.class
            java.lang.Class[] r4 = new java.lang.Class[]{r3}
            java.lang.reflect.Method r1 = h.Hchat.utils.KavaReflector.findMethod(r6, r1, r4)
            if (r1 == 0) goto L47
            java.lang.String r1 = "setAeskey"
            java.lang.Class[] r4 = new java.lang.Class[]{r3}
            java.lang.reflect.Method r1 = h.Hchat.utils.KavaReflector.findMethod(r6, r1, r4)
            if (r1 == 0) goto L47
            java.lang.String r1 = "setSavePath2"
            java.lang.Class[] r3 = new java.lang.Class[]{r3}
            java.lang.reflect.Method r1 = h.Hchat.utils.KavaReflector.findMethod(r6, r1, r3)
            if (r1 == 0) goto L47
            java.lang.Class r1 = java.lang.Integer.TYPE
            java.lang.Class[] r1 = new java.lang.Class[]{r1}
            java.lang.String r3 = "setFileType"
            java.lang.reflect.Method r6 = h.Hchat.utils.KavaReflector.findMethod(r6, r3, r1)
            if (r6 == 0) goto L47
            return r2
        L47:
            return r0
    }

    private boolean isMessageClearBatchMethod(java.lang.reflect.Method r5) {
            r4 = this;
            r0 = 0
            if (r5 == 0) goto L3f
            boolean r1 = h.Hchat.utils.KavaReflector.isStatic(r5)
            if (r1 == 0) goto L3f
            java.lang.Class r1 = r5.getReturnType()
            java.lang.Class r2 = java.lang.Void.TYPE
            if (r1 == r2) goto L12
            goto L3f
        L12:
            java.lang.Class[] r5 = r5.getParameterTypes()
            int r1 = r5.length
            r2 = 2
            if (r1 == r2) goto L1f
            int r1 = r5.length
            r3 = 3
            if (r1 == r3) goto L1f
            return r0
        L1f:
            java.lang.Class<java.util.List> r1 = java.util.List.class
            r3 = r5[r0]
            boolean r1 = r1.isAssignableFrom(r3)
            if (r1 == 0) goto L3f
            r1 = 1
            r3 = r5[r1]
            boolean r3 = r3.isInterface()
            if (r3 != 0) goto L33
            goto L3f
        L33:
            int r3 = r5.length
            if (r3 == r2) goto L3e
            r5 = r5[r2]
            java.lang.Class r2 = java.lang.Long.TYPE
            if (r5 != r2) goto L3d
            goto L3e
        L3d:
            return r0
        L3e:
            return r1
        L3f:
            return r0
    }

    private boolean isMessageClearByTalkerMethod(java.lang.reflect.Method r5, java.lang.reflect.Method r6) {
            r4 = this;
            r0 = 0
            if (r5 == 0) goto L45
            if (r6 == 0) goto L45
            boolean r1 = h.Hchat.utils.KavaReflector.isStatic(r5)
            if (r1 == 0) goto L45
            java.lang.Class r1 = r5.getReturnType()
            java.lang.Class r2 = java.lang.Void.TYPE
            if (r1 != r2) goto L45
            java.lang.Class r1 = r5.getDeclaringClass()
            java.lang.Class r2 = r6.getDeclaringClass()
            if (r1 == r2) goto L1e
            goto L45
        L1e:
            java.lang.Class[] r5 = r5.getParameterTypes()
            java.lang.Class[] r6 = r6.getParameterTypes()
            int r1 = r5.length
            r2 = 2
            if (r1 == r2) goto L2e
            int r1 = r5.length
            r3 = 3
            if (r1 != r3) goto L45
        L2e:
            r1 = r5[r0]
            java.lang.Class<java.lang.String> r3 = java.lang.String.class
            if (r1 != r3) goto L45
            r1 = 1
            r3 = r5[r1]
            r6 = r6[r1]
            if (r3 != r6) goto L45
            int r6 = r5.length
            if (r6 == r2) goto L44
            r5 = r5[r2]
            java.lang.Class r6 = java.lang.Long.TYPE
            if (r5 != r6) goto L45
        L44:
            return r1
        L45:
            return r0
    }

    private boolean isNativeNetSceneCandidate(java.lang.Class<?> r7, int r8) {
            r6 = this;
            java.lang.String r0 = "getType"
            r1 = 0
            if (r7 != 0) goto L6
            return r1
        L6:
            java.lang.Class<?> r2 = r6.protobufNetSceneBaseClass
            if (r2 == 0) goto L11
            boolean r2 = r2.isAssignableFrom(r7)
            if (r2 != 0) goto L11
            return r1
        L11:
            r2 = 1
            java.lang.Class[] r3 = new java.lang.Class[r1]     // Catch: java.lang.Throwable -> L40
            java.lang.reflect.Method r3 = h.Hchat.utils.KavaReflector.findMethodRecursive(r7, r0, r3)     // Catch: java.lang.Throwable -> L40
            if (r3 == 0) goto L40
            java.lang.Class[] r4 = r3.getParameterTypes()     // Catch: java.lang.Throwable -> L40
            int r4 = r4.length     // Catch: java.lang.Throwable -> L40
            if (r4 != 0) goto L40
            java.lang.Class[] r4 = new java.lang.Class[r1]     // Catch: java.lang.Throwable -> L40
            java.lang.reflect.Constructor r4 = h.Hchat.utils.KavaReflector.findConstructor(r7, r4)     // Catch: java.lang.Throwable -> L40
            java.lang.Object[] r5 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L40
            java.lang.Object r4 = h.Hchat.utils.KavaReflector.newInstance(r4, r5)     // Catch: java.lang.Throwable -> L40
            java.lang.Object[] r5 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L40
            java.lang.Object r3 = h.Hchat.utils.KavaReflector.invoke(r3, r4, r5)     // Catch: java.lang.Throwable -> L40
            boolean r4 = r3 instanceof java.lang.Number     // Catch: java.lang.Throwable -> L40
            if (r4 == 0) goto L40
            java.lang.Number r3 = (java.lang.Number) r3     // Catch: java.lang.Throwable -> L40
            int r3 = r3.intValue()     // Catch: java.lang.Throwable -> L40
            if (r3 != r8) goto L40
            return r2
        L40:
            java.util.List r7 = h.Hchat.utils.KavaReflector.declaredMethods(r7)     // Catch: java.lang.Throwable -> L78
            java.util.Iterator r7 = r7.iterator()     // Catch: java.lang.Throwable -> L78
        L48:
            boolean r8 = r7.hasNext()     // Catch: java.lang.Throwable -> L78
            if (r8 == 0) goto L78
            java.lang.Object r8 = r7.next()     // Catch: java.lang.Throwable -> L78
            java.lang.reflect.Method r8 = (java.lang.reflect.Method) r8     // Catch: java.lang.Throwable -> L78
            java.lang.String r3 = r8.getName()     // Catch: java.lang.Throwable -> L78
            boolean r3 = r0.equals(r3)     // Catch: java.lang.Throwable -> L78
            if (r3 != 0) goto L5f
            goto L48
        L5f:
            java.lang.Class[] r3 = r8.getParameterTypes()     // Catch: java.lang.Throwable -> L78
            int r3 = r3.length     // Catch: java.lang.Throwable -> L78
            if (r3 == 0) goto L67
            goto L48
        L67:
            java.lang.Class r3 = r8.getReturnType()     // Catch: java.lang.Throwable -> L78
            java.lang.Class r4 = java.lang.Integer.TYPE     // Catch: java.lang.Throwable -> L78
            if (r3 == r4) goto L77
            java.lang.Class r8 = r8.getReturnType()     // Catch: java.lang.Throwable -> L78
            java.lang.Class<java.lang.Integer> r3 = java.lang.Integer.class
            if (r8 != r3) goto L48
        L77:
            return r2
        L78:
            return r1
    }

    private boolean isNoArgStringMethod(java.lang.reflect.Method r3) {
            r2 = this;
            if (r3 == 0) goto L13
            java.lang.Class r0 = r3.getReturnType()
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            if (r0 != r1) goto L13
            java.lang.Class[] r3 = r3.getParameterTypes()
            int r3 = r3.length
            if (r3 != 0) goto L13
            r3 = 1
            return r3
        L13:
            r3 = 0
            return r3
    }

    private boolean isNoArgVoidMethod(java.lang.reflect.Method r3) {
            r2 = this;
            if (r3 == 0) goto L13
            java.lang.Class r0 = r3.getReturnType()
            java.lang.Class r1 = java.lang.Void.TYPE
            if (r0 != r1) goto L13
            java.lang.Class[] r3 = r3.getParameterTypes()
            int r3 = r3.length
            if (r3 != 0) goto L13
            r3 = 1
            return r3
        L13:
            r3 = 0
            return r3
    }

    private boolean isOnGYNetEndMethod(java.lang.reflect.Method r5) {
            r4 = this;
            r0 = 0
            if (r5 == 0) goto L3e
            java.lang.String r1 = "onGYNetEnd"
            java.lang.String r2 = r5.getName()
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L10
            goto L3e
        L10:
            java.lang.Class r1 = r5.getDeclaringClass()
            java.lang.Class[] r5 = r5.getParameterTypes()
            if (r1 == 0) goto L3e
            boolean r1 = r1.isInterface()
            if (r1 == 0) goto L3e
            if (r5 == 0) goto L3e
            int r1 = r5.length
            r2 = 6
            if (r1 != r2) goto L3e
            r1 = r5[r0]
            java.lang.Class r2 = java.lang.Integer.TYPE
            if (r1 != r2) goto L3e
            r1 = 1
            r3 = r5[r1]
            if (r3 != r2) goto L3e
            r3 = 2
            r3 = r5[r3]
            if (r3 != r2) goto L3e
            r2 = 3
            r5 = r5[r2]
            java.lang.Class<java.lang.String> r2 = java.lang.String.class
            if (r5 != r2) goto L3e
            return r1
        L3e:
            return r0
    }

    private boolean isPatCanSendMethod(java.lang.reflect.Method r5) {
            r4 = this;
            r0 = 0
            if (r5 == 0) goto L3a
            boolean r1 = h.Hchat.utils.KavaReflector.isStatic(r5)
            if (r1 == 0) goto La
            goto L3a
        La:
            java.lang.Class r1 = r5.getReturnType()
            java.lang.Class r2 = java.lang.Boolean.TYPE
            if (r1 == r2) goto L1b
            java.lang.Class r1 = r5.getReturnType()
            java.lang.Class<java.lang.Boolean> r2 = java.lang.Boolean.class
            if (r1 == r2) goto L1b
            return r0
        L1b:
            java.lang.Class[] r5 = r5.getParameterTypes()
            int r1 = r5.length
            r2 = 3
            if (r1 != r2) goto L3a
            r1 = r5[r0]
            java.lang.Class r2 = java.lang.Integer.TYPE
            if (r1 == r2) goto L2d
            java.lang.Class<java.lang.Integer> r2 = java.lang.Integer.class
            if (r1 != r2) goto L3a
        L2d:
            r1 = 1
            r2 = r5[r1]
            java.lang.Class<java.lang.String> r3 = java.lang.String.class
            if (r2 != r3) goto L3a
            r2 = 2
            r5 = r5[r2]
            if (r5 != r3) goto L3a
            return r1
        L3a:
            return r0
    }

    private boolean isPatCreatePairMethod(java.lang.reflect.Method r5) {
            r4 = this;
            r0 = 0
            if (r5 == 0) goto L47
            boolean r1 = h.Hchat.utils.KavaReflector.isStatic(r5)
            if (r1 == 0) goto La
            goto L47
        La:
            java.lang.Class r1 = r5.getReturnType()
            java.lang.Class<android.util.Pair> r2 = android.util.Pair.class
            if (r1 == r2) goto L13
            return r0
        L13:
            java.lang.Class[] r5 = r5.getParameterTypes()
            int r1 = r5.length
            r2 = 6
            if (r1 != r2) goto L47
            r1 = r5[r0]
            java.lang.Class<java.lang.String> r2 = java.lang.String.class
            if (r1 != r2) goto L47
            r1 = 1
            r3 = r5[r1]
            if (r3 != r2) goto L47
            r3 = 2
            r3 = r5[r3]
            if (r3 != r2) goto L47
            r3 = 3
            r3 = r5[r3]
            if (r3 != r2) goto L47
            r2 = 4
            r2 = r5[r2]
            java.lang.Class r3 = java.lang.Integer.TYPE
            if (r2 == r3) goto L3b
            java.lang.Class<java.lang.Integer> r3 = java.lang.Integer.class
            if (r2 != r3) goto L47
        L3b:
            r2 = 5
            r5 = r5[r2]
            java.lang.Class r2 = java.lang.Long.TYPE
            if (r5 == r2) goto L46
            java.lang.Class<java.lang.Long> r2 = java.lang.Long.class
            if (r5 != r2) goto L47
        L46:
            return r1
        L47:
            return r0
    }

    private boolean isPatDisplayTemplateMethod(java.lang.reflect.Method r4) {
            r3 = this;
            r0 = 0
            if (r4 == 0) goto L24
            java.lang.Class r1 = r4.getReturnType()
            java.lang.Class r2 = java.lang.Void.TYPE
            if (r1 != r2) goto Lc
            goto L24
        Lc:
            java.lang.Class[] r4 = r4.getParameterTypes()
            int r1 = r4.length
            r2 = 2
            if (r1 != r2) goto L24
            r1 = r4[r0]
            boolean r1 = r1.isPrimitive()
            if (r1 != 0) goto L24
            r1 = 1
            r4 = r4[r1]
            java.lang.Class<java.lang.String> r2 = java.lang.String.class
            if (r4 != r2) goto L24
            return r1
        L24:
            return r0
    }

    private boolean isPatSuffixMethod(java.lang.reflect.Method r5) {
            r4 = this;
            r0 = 0
            if (r5 == 0) goto L25
            boolean r1 = h.Hchat.utils.KavaReflector.isStatic(r5)
            if (r1 == 0) goto La
            goto L25
        La:
            java.lang.Class r1 = r5.getReturnType()
            java.lang.Class<java.lang.String> r2 = java.lang.String.class
            if (r1 == r2) goto L13
            return r0
        L13:
            java.lang.Class[] r5 = r5.getParameterTypes()
            int r1 = r5.length
            r3 = 2
            if (r1 != r3) goto L25
            r1 = r5[r0]
            if (r1 != r2) goto L25
            r1 = 1
            r5 = r5[r1]
            if (r5 != r2) goto L25
            return r1
        L25:
            return r0
    }

    private boolean isPreferredImageCdnSubmitMethod(java.lang.reflect.Method r5) {
            r4 = this;
            boolean r0 = r4.isImageCdnSubmitMethod(r5)
            r1 = 0
            if (r0 == 0) goto L31
            boolean r0 = h.Hchat.utils.KavaReflector.isStatic(r5)
            if (r0 == 0) goto Le
            goto L31
        Le:
            java.lang.Class[] r0 = r5.getParameterTypes()
            int r2 = r0.length
            r3 = 2
            if (r2 != r3) goto L31
            r2 = 1
            r0 = r0[r2]
            java.lang.Class r3 = java.lang.Integer.TYPE
            if (r0 == r3) goto L22
            java.lang.Class<java.lang.Integer> r3 = java.lang.Integer.class
            if (r0 == r3) goto L22
            goto L31
        L22:
            java.lang.Class r5 = r5.getReturnType()
            java.lang.Class r0 = java.lang.Boolean.TYPE
            if (r5 == r0) goto L30
            java.lang.Class<java.lang.Boolean> r0 = java.lang.Boolean.class
            if (r5 != r0) goto L2f
            goto L30
        L2f:
            return r1
        L30:
            return r2
        L31:
            return r1
    }

    private boolean isProtobufCallbackMethod(java.lang.reflect.Method r5) {
            r4 = this;
            r0 = 0
            if (r5 != 0) goto L4
            return r0
        L4:
            java.lang.String r1 = "callback"
            java.lang.String r2 = r5.getName()
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L50
            java.lang.Class r1 = r5.getReturnType()
            java.lang.Class r2 = java.lang.Integer.TYPE
            if (r1 == r2) goto L19
            goto L50
        L19:
            java.lang.Class r1 = r5.getDeclaringClass()
            java.lang.Class[] r5 = r5.getParameterTypes()
            if (r1 == 0) goto L50
            boolean r1 = r1.isInterface()
            if (r1 == 0) goto L50
            int r1 = r5.length
            r3 = 5
            if (r1 != r3) goto L50
            r1 = r5[r0]
            if (r1 != r2) goto L50
            r1 = 1
            r3 = r5[r1]
            if (r3 != r2) goto L50
            r2 = 2
            r2 = r5[r2]
            java.lang.Class<java.lang.String> r3 = java.lang.String.class
            if (r2 != r3) goto L50
            r2 = 3
            r2 = r5[r2]
            if (r2 == 0) goto L50
            java.lang.Class<java.lang.Object> r3 = java.lang.Object.class
            if (r2 == r3) goto L50
            java.lang.Class<?> r2 = r4.protobufNetSceneBaseClass
            if (r2 == 0) goto L50
            r3 = 4
            r5 = r5[r3]
            if (r5 != r2) goto L50
            return r1
        L50:
            return r0
    }

    private boolean isProtobufNetSceneBaseClass(java.lang.Class<?> r5) {
            r4 = this;
            r0 = 0
            if (r5 != 0) goto L4
            return r0
        L4:
            java.util.List r5 = h.Hchat.utils.KavaReflector.declaredMethods(r5)
            java.util.Iterator r5 = r5.iterator()
        Lc:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L36
            java.lang.Object r1 = r5.next()
            java.lang.reflect.Method r1 = (java.lang.reflect.Method) r1
            java.lang.String r2 = "dispatch"
            java.lang.String r3 = r1.getName()     // Catch: java.lang.Throwable -> Lc
            boolean r2 = r2.equals(r3)     // Catch: java.lang.Throwable -> Lc
            if (r2 == 0) goto Lc
            java.lang.Class[] r2 = r1.getParameterTypes()     // Catch: java.lang.Throwable -> Lc
            int r2 = r2.length     // Catch: java.lang.Throwable -> Lc
            r3 = 3
            if (r2 != r3) goto Lc
            java.lang.Class r1 = r1.getReturnType()     // Catch: java.lang.Throwable -> Lc
            java.lang.Class r2 = java.lang.Integer.TYPE     // Catch: java.lang.Throwable -> Lc
            if (r1 != r2) goto Lc
            r5 = 1
            return r5
        L36:
            return r0
    }

    private boolean isProtobufSceneEndMethod(java.lang.reflect.Method r5) {
            r4 = this;
            r0 = 0
            if (r5 == 0) goto L4e
            java.lang.String r1 = "onSceneEnd"
            java.lang.String r2 = r5.getName()
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L10
            goto L4e
        L10:
            java.lang.Class r1 = r5.getDeclaringClass()
            java.lang.Class[] r2 = r5.getParameterTypes()
            if (r1 == 0) goto L4e
            boolean r1 = r1.isInterface()
            if (r1 != 0) goto L4e
            java.lang.Class r5 = r5.getReturnType()
            java.lang.Class r1 = java.lang.Void.TYPE
            if (r5 != r1) goto L4e
            if (r2 == 0) goto L4e
            int r5 = r2.length
            r1 = 4
            if (r5 != r1) goto L4e
            r5 = r2[r0]
            java.lang.Class r1 = java.lang.Integer.TYPE
            if (r5 != r1) goto L4e
            r5 = 1
            r3 = r2[r5]
            if (r3 != r1) goto L4e
            r1 = 2
            r1 = r2[r1]
            java.lang.Class<java.lang.String> r3 = java.lang.String.class
            if (r1 != r3) goto L4e
            java.lang.Class<?> r1 = r4.protobufNetSceneBaseClass
            if (r1 == 0) goto L4e
            r3 = 3
            r2 = r2[r3]
            boolean r1 = r1.isAssignableFrom(r2)
            if (r1 == 0) goto L4e
            return r5
        L4e:
            return r0
    }

    private boolean isProtobufStaticDispatch(java.lang.reflect.Method r5, java.lang.Class<?> r6, java.lang.Class<?> r7) {
            r4 = this;
            r0 = 0
            if (r5 == 0) goto L35
            if (r6 == 0) goto L35
            if (r7 != 0) goto L8
            goto L35
        L8:
            java.lang.Class[] r1 = r5.getParameterTypes()
            boolean r2 = h.Hchat.utils.KavaReflector.isStatic(r5)
            if (r2 == 0) goto L35
            if (r1 == 0) goto L35
            int r2 = r1.length
            r3 = 3
            if (r2 != r3) goto L35
            r2 = r1[r0]
            if (r2 != r6) goto L35
            r6 = 1
            r2 = r1[r6]
            if (r2 != r7) goto L35
            r7 = 2
            r7 = r1[r7]
            java.lang.Class r1 = java.lang.Boolean.TYPE
            if (r7 != r1) goto L35
            java.lang.Class<?> r7 = r4.protobufNetSceneBaseClass
            if (r7 == 0) goto L35
            java.lang.Class r5 = r5.getReturnType()
            java.lang.Class<?> r7 = r4.protobufNetSceneBaseClass
            if (r5 != r7) goto L35
            return r6
        L35:
            return r0
    }

    private boolean isSendFileAppMsgMethod(java.lang.reflect.Method r6) {
            r5 = this;
            r0 = 0
            if (r6 == 0) goto L49
            java.lang.Class r1 = r6.getReturnType()
            java.lang.Class r2 = java.lang.Integer.TYPE
            if (r1 == r2) goto Lc
            goto L49
        Lc:
            boolean r1 = h.Hchat.utils.KavaReflector.isStatic(r6)
            if (r1 != 0) goto L13
            return r0
        L13:
            java.lang.Class[] r6 = r6.getParameterTypes()
            int r1 = r6.length
            r3 = 6
            if (r1 != r3) goto L49
            r1 = r6[r0]
            java.lang.String r1 = r1.getName()
            java.lang.String r3 = "com.tencent.mm.opensdk.modelmsg.WXMediaMessage"
            boolean r1 = r3.equals(r1)
            if (r1 == 0) goto L49
            r1 = 1
            r3 = r6[r1]
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            if (r3 != r4) goto L49
            r3 = 2
            r3 = r6[r3]
            if (r3 != r4) goto L49
            r3 = 3
            r3 = r6[r3]
            if (r3 != r4) goto L49
            r3 = 4
            r3 = r6[r3]
            if (r3 == r2) goto L43
            java.lang.Class<java.lang.Integer> r2 = java.lang.Integer.class
            if (r3 != r2) goto L49
        L43:
            r2 = 5
            r6 = r6[r2]
            if (r6 != r4) goto L49
            return r1
        L49:
            return r0
    }

    private boolean isSendFileAttachPathMethod(java.lang.reflect.Method r5) {
            r4 = this;
            r0 = 0
            if (r5 == 0) goto L2a
            java.lang.Class r1 = r5.getReturnType()
            java.lang.Class<java.lang.String> r2 = java.lang.String.class
            if (r1 == r2) goto Lc
            goto L2a
        Lc:
            boolean r1 = h.Hchat.utils.KavaReflector.isStatic(r5)
            if (r1 != 0) goto L13
            return r0
        L13:
            java.lang.Class[] r5 = r5.getParameterTypes()
            int r1 = r5.length
            r3 = 3
            if (r1 != r3) goto L2a
            r1 = r5[r0]
            if (r1 != r2) goto L2a
            r1 = 1
            r3 = r5[r1]
            if (r3 != r2) goto L2a
            r3 = 2
            r5 = r5[r3]
            if (r5 != r2) goto L2a
            return r1
        L2a:
            return r0
    }

    private boolean isSendImageAppInfoClass(java.lang.Class<?> r7) {
            r6 = this;
            r0 = 0
            if (r7 == 0) goto L45
            java.lang.Class[] r1 = new java.lang.Class[r0]
            java.lang.reflect.Constructor r1 = h.Hchat.utils.KavaReflector.findConstructor(r7, r1)
            if (r1 != 0) goto Lc
            goto L45
        Lc:
            boolean r1 = r6.hasDirectImageAppInfoFields(r7)
            r2 = 1
            if (r1 == 0) goto L14
            return r2
        L14:
            java.util.List r1 = h.Hchat.utils.KavaReflector.declaredFields(r7)
            java.util.Iterator r1 = r1.iterator()
        L1c:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L45
            java.lang.Object r3 = r1.next()
            java.lang.reflect.Field r3 = (java.lang.reflect.Field) r3
            boolean r4 = h.Hchat.utils.KavaReflector.isStatic(r3)
            if (r4 != 0) goto L1c
            java.lang.Class r4 = r3.getType()
            java.lang.Class r5 = java.lang.Integer.TYPE
            if (r4 == r5) goto L3e
            java.lang.Class r3 = r3.getType()
            java.lang.Class<java.lang.Integer> r4 = java.lang.Integer.class
            if (r3 != r4) goto L1c
        L3e:
            java.lang.reflect.Method r7 = r6.findIndexedSetter(r7)
            if (r7 == 0) goto L45
            return r2
        L45:
            return r0
    }

    private boolean isSendImageAppInfoMethod(java.lang.reflect.Method r4) {
            r3 = this;
            boolean r0 = r3.isSendImageMethod(r4)
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            java.lang.Class[] r4 = r4.getParameterTypes()
            int r0 = r4.length
            r2 = 8
            if (r0 != r2) goto L1f
            r0 = 5
            r0 = r4[r0]
            java.lang.Class<java.lang.String> r2 = java.lang.String.class
            if (r0 != r2) goto L1f
            r0 = 6
            r4 = r4[r0]
            if (r4 != r2) goto L1f
            r4 = 1
            return r4
        L1f:
            return r1
    }

    private boolean isSendImageAsyncAppInfoApiReady() {
            r1 = this;
            java.lang.Class<?> r0 = r1.sendImageAsyncParamsClass
            if (r0 == 0) goto L16
            java.lang.Class<?> r0 = r1.sendImageCrossParamsClass
            if (r0 == 0) goto L16
            java.lang.Class<?> r0 = r1.sendImageAppInfoClass
            if (r0 == 0) goto L16
            java.lang.reflect.Method r0 = r1.sendImageAsyncSubmitMethod
            boolean r0 = r1.isSendImageAsyncSubmitMethod(r0)
            if (r0 == 0) goto L16
            r0 = 1
            return r0
        L16:
            r0 = 0
            return r0
    }

    private boolean isSendImageAsyncSubmitMethod(java.lang.reflect.Method r4) {
            r3 = this;
            r0 = 0
            if (r4 == 0) goto L26
            boolean r1 = h.Hchat.utils.KavaReflector.isStatic(r4)
            if (r1 == 0) goto La
            goto L26
        La:
            int r1 = r4.getModifiers()
            boolean r1 = h.Hchat.utils.KavaReflector.isAbstract(r1)
            if (r1 == 0) goto L15
            return r0
        L15:
            java.lang.Class[] r4 = r4.getParameterTypes()
            int r1 = r4.length
            r2 = 1
            if (r1 != r2) goto L26
            java.lang.Class<?> r1 = r3.sendImageAsyncParamsClass
            if (r1 == 0) goto L26
            r4 = r4[r0]
            if (r4 != r1) goto L26
            return r2
        L26:
            return r0
    }

    private boolean isSendImageMethod(java.lang.reflect.Method r6) {
            r5 = this;
            r0 = 0
            if (r6 == 0) goto L3e
            java.lang.Class r1 = r6.getReturnType()
            java.lang.Class r2 = java.lang.Void.TYPE
            if (r1 == r2) goto Lc
            goto L3e
        Lc:
            java.lang.Class[] r6 = r6.getParameterTypes()
            int r1 = r6.length
            r2 = 8
            if (r1 >= r2) goto L16
            return r0
        L16:
            r1 = r6[r0]
            java.lang.Class<android.content.Context> r2 = android.content.Context.class
            if (r1 != r2) goto L3e
            r1 = 1
            r2 = r6[r1]
            java.lang.Class<java.lang.String> r3 = java.lang.String.class
            if (r2 != r3) goto L3e
            r2 = 2
            r2 = r6[r2]
            if (r2 != r3) goto L3e
            r2 = 3
            r2 = r6[r2]
            java.lang.Class r4 = java.lang.Integer.TYPE
            if (r2 == r4) goto L33
            java.lang.Class<java.lang.Integer> r4 = java.lang.Integer.class
            if (r2 != r4) goto L3e
        L33:
            r2 = 4
            r2 = r6[r2]
            if (r2 != r3) goto L3e
            r2 = 5
            r6 = r6[r2]
            if (r6 != r3) goto L3e
            return r1
        L3e:
            return r0
    }

    private boolean isSendPatSceneClass(java.lang.Class<?> r1) {
            r0 = this;
            java.lang.reflect.Constructor r1 = r0.findSendPatSceneCtor(r1)
            if (r1 == 0) goto L8
            r1 = 1
            return r1
        L8:
            r1 = 0
            return r1
    }

    private boolean isSendVideoMethod(java.lang.reflect.Method r7) {
            r6 = this;
            r0 = 0
            if (r7 == 0) goto L5f
            java.lang.Class r1 = r7.getReturnType()
            java.lang.Class r2 = java.lang.Void.TYPE
            if (r1 == r2) goto Lc
            goto L5f
        Lc:
            java.lang.Class[] r7 = r7.getParameterTypes()
            int r1 = r7.length
            r2 = 13
            if (r1 >= r2) goto L16
            return r0
        L16:
            r1 = r7[r0]
            java.lang.Class<android.content.Context> r2 = android.content.Context.class
            if (r1 != r2) goto L5f
            r1 = 1
            r2 = r7[r1]
            java.lang.Class<java.lang.String> r3 = java.lang.String.class
            if (r2 != r3) goto L5f
            r2 = 2
            r2 = r7[r2]
            if (r2 != r3) goto L5f
            r2 = 3
            r2 = r7[r2]
            if (r2 != r3) goto L5f
            r2 = 4
            r2 = r7[r2]
            java.lang.Class<java.lang.Integer> r4 = java.lang.Integer.class
            java.lang.Class r5 = java.lang.Integer.TYPE
            if (r2 == r5) goto L38
            if (r2 != r4) goto L5f
        L38:
            r2 = 5
            r2 = r7[r2]
            if (r2 == r5) goto L3f
            if (r2 != r4) goto L5f
        L3f:
            r2 = 7
            r2 = r7[r2]
            java.lang.Class<java.lang.Boolean> r4 = java.lang.Boolean.class
            java.lang.Class r5 = java.lang.Boolean.TYPE
            if (r2 == r5) goto L4a
            if (r2 != r4) goto L5f
        L4a:
            r2 = 8
            r2 = r7[r2]
            if (r2 == r5) goto L52
            if (r2 != r4) goto L5f
        L52:
            r2 = 9
            r2 = r7[r2]
            if (r2 != r3) goto L5f
            r2 = 10
            r7 = r7[r2]
            if (r7 != r3) goto L5f
            return r1
        L5f:
            return r0
    }

    private boolean isSendXmlAppMsgMethod(java.lang.reflect.Method r9) {
            r8 = this;
            r0 = 0
            if (r9 == 0) goto L95
            java.lang.Class r1 = r9.getReturnType()
            java.lang.Class r2 = java.lang.Void.TYPE
            if (r1 != r2) goto Ld
            goto L95
        Ld:
            java.lang.Class r1 = r9.getReturnType()
            java.lang.String r1 = r1.getName()
            java.lang.String r2 = "android.util.Pair"
            boolean r1 = r2.equals(r1)
            if (r1 != 0) goto L1e
            return r0
        L1e:
            boolean r1 = h.Hchat.utils.KavaReflector.isStatic(r9)
            if (r1 != 0) goto L25
            return r0
        L25:
            java.lang.Class[] r9 = r9.getParameterTypes()
            int r1 = r9.length
            r2 = 12
            r3 = 10
            if (r1 == r3) goto L34
            int r1 = r9.length
            if (r1 == r2) goto L34
            return r0
        L34:
            r1 = r9[r0]
            boolean r1 = r1.isPrimitive()
            if (r1 == 0) goto L3d
            return r0
        L3d:
            r1 = 1
            r4 = r9[r1]
            java.lang.Class<java.lang.String> r5 = java.lang.String.class
            if (r4 != r5) goto L95
            r4 = 2
            r4 = r9[r4]
            if (r4 != r5) goto L95
            r4 = 3
            r4 = r9[r4]
            if (r4 != r5) goto L95
            r4 = 4
            r4 = r9[r4]
            if (r4 != r5) goto L95
            r4 = 5
            r4 = r9[r4]
            java.lang.Class<byte[]> r6 = byte[].class
            if (r4 != r6) goto L95
            r4 = 6
            r4 = r9[r4]
            if (r4 != r5) goto L95
            r4 = 7
            r4 = r9[r4]
            if (r4 != r5) goto L95
            r4 = 8
            r4 = r9[r4]
            if (r4 != r5) goto L95
            int r4 = r9.length
            r6 = 9
            if (r4 != r3) goto L79
            r4 = r9[r6]
            java.lang.Class r7 = java.lang.Long.TYPE
            if (r4 == r7) goto L94
            java.lang.Class<java.lang.Long> r7 = java.lang.Long.class
            if (r4 == r7) goto L94
        L79:
            int r4 = r9.length
            if (r4 != r2) goto L95
            r2 = r9[r6]
            boolean r2 = r2.isPrimitive()
            if (r2 != 0) goto L95
            r2 = r9[r3]
            java.lang.Class r3 = java.lang.Boolean.TYPE
            if (r2 == r3) goto L8e
            java.lang.Class<java.lang.Boolean> r3 = java.lang.Boolean.class
            if (r2 != r3) goto L95
        L8e:
            r2 = 11
            r9 = r9[r2]
            if (r9 != r5) goto L95
        L94:
            return r1
        L95:
            return r0
    }

    private boolean isServiceGetterMethod(java.lang.reflect.Method r5) {
            r4 = this;
            r0 = 0
            if (r5 == 0) goto L21
            boolean r1 = h.Hchat.utils.KavaReflector.isStatic(r5)
            if (r1 != 0) goto La
            goto L21
        La:
            java.lang.Class[] r1 = r5.getParameterTypes()
            int r2 = r1.length
            r3 = 1
            if (r2 != r3) goto L21
            r1 = r1[r0]
            java.lang.Class<java.lang.Class> r2 = java.lang.Class.class
            if (r1 != r2) goto L21
            java.lang.Class r5 = r5.getReturnType()
            java.lang.Class r1 = java.lang.Void.TYPE
            if (r5 == r1) goto L21
            return r3
        L21:
            return r0
    }

    private boolean isSnsShareAppMsgMethod(java.lang.reflect.Method r5) {
            r4 = this;
            r0 = 0
            if (r5 == 0) goto L3b
            boolean r1 = h.Hchat.utils.KavaReflector.isStatic(r5)
            if (r1 == 0) goto La
            goto L3b
        La:
            java.lang.Class r1 = r5.getReturnType()
            java.lang.Class r2 = java.lang.Void.TYPE
            if (r1 != r2) goto L13
            return r0
        L13:
            java.lang.Class[] r5 = r5.getParameterTypes()
            int r1 = r5.length
            r2 = 4
            if (r1 != r2) goto L3b
            r1 = r5[r0]
            java.lang.String r1 = r1.getName()
            java.lang.String r2 = "com.tencent.mm.opensdk.modelmsg.WXMediaMessage"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L3b
            r1 = 1
            r2 = r5[r1]
            java.lang.Class<java.lang.String> r3 = java.lang.String.class
            if (r2 != r3) goto L3b
            r2 = 2
            r2 = r5[r2]
            if (r2 != r3) goto L3b
            r2 = 3
            r5 = r5[r2]
            if (r5 != r3) goto L3b
            return r1
        L3b:
            return r0
    }

    private boolean isSnsUploadManagerClass(java.lang.Class<?> r9) {
            r8 = this;
            r0 = 0
            if (r9 != 0) goto L4
            return r0
        L4:
            java.util.List r9 = h.Hchat.utils.KavaReflector.declaredMethods(r9)
            java.util.Iterator r9 = r9.iterator()
            r1 = r0
            r2 = r1
        Le:
            boolean r3 = r9.hasNext()
            r4 = 1
            if (r3 == 0) goto L4c
            java.lang.Object r3 = r9.next()
            java.lang.reflect.Method r3 = (java.lang.reflect.Method) r3
            java.lang.Class[] r5 = r3.getParameterTypes()
            int r6 = r5.length
            java.lang.Class r7 = java.lang.Void.TYPE
            if (r6 != 0) goto L2b
            java.lang.Class r6 = r3.getReturnType()
            if (r6 != r7) goto L2b
            r1 = r4
        L2b:
            int r6 = r5.length
            if (r6 != r4) goto Le
            java.lang.Class r3 = r3.getReturnType()
            if (r3 != r7) goto Le
            r3 = r5[r0]
            boolean r3 = r3.isPrimitive()
            if (r3 != 0) goto Le
            r3 = r5[r0]
            java.lang.String r3 = r3.getName()
            java.lang.String r5 = "com.tencent.mm.plugin.sns.model."
            boolean r3 = r3.startsWith(r5)
            if (r3 == 0) goto Le
            r2 = r4
            goto Le
        L4c:
            if (r1 == 0) goto L51
            if (r2 == 0) goto L51
            return r4
        L51:
            return r0
    }

    private boolean isSnsUploadPackHelperClass(java.lang.Class<?> r13) {
            r12 = this;
            r0 = 0
            if (r13 != 0) goto L4
            return r0
        L4:
            java.util.List r1 = h.Hchat.utils.KavaReflector.declaredConstructors(r13)
            java.util.Iterator r1 = r1.iterator()
        Lc:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L8b
            java.lang.Object r2 = r1.next()
            java.lang.reflect.Constructor r2 = (java.lang.reflect.Constructor) r2
            java.lang.Class[] r2 = r2.getParameterTypes()
            int r3 = r2.length
            r4 = 2
            if (r3 != r4) goto Lc
            r3 = r2[r0]
            boolean r3 = r12.isIntClass(r3)
            if (r3 == 0) goto Lc
            java.lang.Class<android.content.Context> r3 = android.content.Context.class
            r5 = 1
            r2 = r2[r5]
            boolean r2 = r3.isAssignableFrom(r2)
            if (r2 == 0) goto Lc
            java.util.List r1 = h.Hchat.utils.KavaReflector.declaredMethods(r13)
            java.util.Iterator r1 = r1.iterator()
            r2 = r0
            r3 = r2
            r6 = r3
        L3e:
            boolean r7 = r1.hasNext()
            if (r7 == 0) goto L84
            java.lang.Object r7 = r1.next()
            java.lang.reflect.Method r7 = (java.lang.reflect.Method) r7
            java.lang.Class[] r8 = r7.getParameterTypes()
            int r9 = r8.length
            if (r9 != 0) goto L5d
            java.lang.Class r9 = r7.getReturnType()
            boolean r9 = r12.isIntClass(r9)
            if (r9 == 0) goto L5d
            r2 = r5
            goto L3e
        L5d:
            int r9 = r8.length
            java.lang.Class<java.lang.String> r10 = java.lang.String.class
            if (r9 != r4) goto L74
            java.lang.Class r9 = r7.getReturnType()
            java.lang.Class r11 = java.lang.Boolean.TYPE
            if (r9 != r11) goto L74
            r9 = r8[r0]
            if (r9 != r10) goto L74
            r9 = r8[r5]
            if (r9 != r10) goto L74
            r3 = r5
            goto L3e
        L74:
            int r9 = r8.length
            if (r9 != r5) goto L3e
            java.lang.Class r7 = r7.getReturnType()
            if (r7 != r13) goto L3e
            r7 = r8[r0]
            if (r7 != r10) goto L3e
            int r6 = r6 + 1
            goto L3e
        L84:
            if (r2 == 0) goto L8b
            if (r3 == 0) goto L8b
            if (r6 < r4) goto L8b
            return r5
        L8b:
            return r0
    }

    private boolean isStaticNoArgStringMethod(java.lang.reflect.Method r3) {
            r2 = this;
            if (r3 == 0) goto L19
            boolean r0 = h.Hchat.utils.KavaReflector.isStatic(r3)
            if (r0 == 0) goto L19
            java.lang.Class r0 = r3.getReturnType()
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            if (r0 != r1) goto L19
            java.lang.Class[] r3 = r3.getParameterTypes()
            int r3 = r3.length
            if (r3 != 0) goto L19
            r3 = 1
            return r3
        L19:
            r3 = 0
            return r3
    }

    private boolean isStringBooleanMethod(java.lang.reflect.Method r4) {
            r3 = this;
            r0 = 0
            if (r4 == 0) goto L1b
            java.lang.Class r1 = r4.getReturnType()
            java.lang.Class r2 = java.lang.Boolean.TYPE
            if (r1 == r2) goto Lc
            goto L1b
        Lc:
            java.lang.Class[] r4 = r4.getParameterTypes()
            int r1 = r4.length
            r2 = 1
            if (r1 != r2) goto L1b
            r4 = r4[r0]
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            if (r4 != r1) goto L1b
            return r2
        L1b:
            return r0
    }

    private boolean isTransferOperationClass(java.lang.Class<?> r5) {
            r4 = this;
            java.lang.String r0 = "getUri"
            r1 = 0
            if (r5 != 0) goto L6
            return r1
        L6:
            boolean r2 = r4.hasTransferOperationCtor(r5)
            if (r2 != 0) goto Ld
            return r1
        Ld:
            java.lang.Object r2 = r4.newTransferProbe(r5)     // Catch: java.lang.Throwable -> L2f
            if (r2 != 0) goto L14
            return r1
        L14:
            java.lang.Class[] r3 = new java.lang.Class[r1]     // Catch: java.lang.Throwable -> L2f
            java.lang.reflect.Method r3 = h.Hchat.utils.KavaReflector.findDeclaredMethod(r5, r0, r3)     // Catch: java.lang.Throwable -> L2f
            if (r3 == 0) goto L29
            java.lang.Object[] r0 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L2f
            java.lang.Object r0 = h.Hchat.utils.KavaReflector.invoke(r3, r2, r0)     // Catch: java.lang.Throwable -> L2f
            java.lang.String r1 = "/cgi-bin/mmpay-bin/transferoperation"
            boolean r5 = r1.equals(r0)     // Catch: java.lang.Throwable -> L2f
            return r5
        L29:
            java.lang.NoSuchMethodException r1 = new java.lang.NoSuchMethodException     // Catch: java.lang.Throwable -> L2f
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L2f
            throw r1     // Catch: java.lang.Throwable -> L2f
        L2f:
            java.lang.String r0 = "com.tencent.mm.plugin.remittance.model.n0"
            java.lang.String r5 = r5.getName()
            boolean r5 = r0.equals(r5)
            return r5
    }

    private boolean isTransferQueryClass(java.lang.Class<?> r8) {
            r7 = this;
            r0 = 0
            if (r8 != 0) goto L4
            return r0
        L4:
            java.util.List r8 = h.Hchat.utils.KavaReflector.declaredConstructors(r8)
            java.util.Iterator r8 = r8.iterator()
        Lc:
            boolean r1 = r8.hasNext()
            if (r1 == 0) goto L48
            java.lang.Object r1 = r8.next()
            java.lang.reflect.Constructor r1 = (java.lang.reflect.Constructor) r1
            java.lang.Class[] r1 = r1.getParameterTypes()
            int r2 = r1.length
            r3 = 5
            if (r2 == r3) goto L24
            int r2 = r1.length
            r4 = 6
            if (r2 != r4) goto Lc
        L24:
            r2 = r1[r0]
            java.lang.Class r4 = java.lang.Integer.TYPE
            if (r2 != r4) goto Lc
            r2 = 1
            r5 = r1[r2]
            java.lang.Class<java.lang.String> r6 = java.lang.String.class
            if (r5 != r6) goto Lc
            r5 = 2
            r5 = r1[r5]
            if (r5 != r6) goto Lc
            r5 = 3
            r5 = r1[r5]
            if (r5 != r4) goto Lc
            r4 = 4
            r4 = r1[r4]
            if (r4 != r6) goto Lc
            int r4 = r1.length
            if (r4 == r3) goto L47
            r1 = r1[r3]
            if (r1 != r6) goto Lc
        L47:
            return r2
        L48:
            return r0
    }

    private boolean isTransferQueryResponseMethod(java.lang.reflect.Method r4, java.lang.Class<?> r5) {
            r3 = this;
            r0 = 0
            if (r4 == 0) goto L43
            if (r5 == 0) goto L43
            java.lang.Class r1 = r4.getDeclaringClass()
            if (r1 != r5) goto L43
            int r5 = r4.getModifiers()
            boolean r5 = java.lang.reflect.Modifier.isStatic(r5)
            if (r5 != 0) goto L43
            java.lang.Class r5 = r4.getReturnType()
            java.lang.Class r1 = java.lang.Void.TYPE
            if (r5 == r1) goto L1e
            goto L43
        L1e:
            java.lang.Class[] r4 = r4.getParameterTypes()
            int r5 = r4.length
            r1 = 3
            if (r5 != r1) goto L43
            r5 = r4[r0]
            java.lang.Class r1 = java.lang.Integer.TYPE
            if (r5 != r1) goto L43
            r5 = 1
            r1 = r4[r5]
            java.lang.Class<java.lang.String> r2 = java.lang.String.class
            if (r1 != r2) goto L43
            r1 = 2
            r4 = r4[r1]
            java.lang.String r4 = r4.getName()
            java.lang.String r1 = "org.json.JSONObject"
            boolean r4 = r1.equals(r4)
            if (r4 == 0) goto L43
            return r5
        L43:
            return r0
    }

    private boolean isVerifyUserClass(java.lang.Class<?> r4) {
            r3 = this;
            r0 = 0
            if (r4 != 0) goto L4
            return r0
        L4:
            boolean r1 = r3.hasVerifyUserCtor(r4)
            if (r1 != 0) goto Lb
            return r0
        Lb:
            java.lang.String r1 = "getType"
            java.lang.Class[] r2 = new java.lang.Class[r0]     // Catch: java.lang.Throwable -> L2f
            java.lang.reflect.Method r4 = h.Hchat.utils.KavaReflector.findMethodRecursive(r4, r1, r2)     // Catch: java.lang.Throwable -> L2f
            if (r4 != 0) goto L16
            return r0
        L16:
            java.lang.Class[] r1 = r4.getParameterTypes()     // Catch: java.lang.Throwable -> L2f
            int r1 = r1.length     // Catch: java.lang.Throwable -> L2f
            if (r1 != 0) goto L2f
            java.lang.Class r1 = r4.getReturnType()     // Catch: java.lang.Throwable -> L2f
            java.lang.Class r2 = java.lang.Integer.TYPE     // Catch: java.lang.Throwable -> L2f
            if (r1 == r2) goto L2d
            java.lang.Class r4 = r4.getReturnType()     // Catch: java.lang.Throwable -> L2f
            java.lang.Class<java.lang.Integer> r1 = java.lang.Integer.class
            if (r4 != r1) goto L2f
        L2d:
            r4 = 1
            return r4
        L2f:
            return r0
    }

    private boolean isVideoInfoByFileNameMethod(java.lang.reflect.Method r5, java.lang.Class<?> r6) {
            r4 = this;
            r0 = 0
            if (r5 == 0) goto L24
            if (r6 == 0) goto L24
            boolean r1 = h.Hchat.utils.KavaReflector.isStatic(r5)
            if (r1 == 0) goto L24
            java.lang.Class[] r1 = r5.getParameterTypes()
            int r1 = r1.length
            r2 = 1
            if (r1 != r2) goto L24
            java.lang.Class[] r1 = r5.getParameterTypes()
            r1 = r1[r0]
            java.lang.Class<java.lang.String> r3 = java.lang.String.class
            if (r1 != r3) goto L24
            java.lang.Class r5 = r5.getReturnType()
            if (r5 != r6) goto L24
            return r2
        L24:
            return r0
    }

    private boolean isVideoPathMethod(java.lang.reflect.Method r5) {
            r4 = this;
            r0 = 0
            if (r5 == 0) goto L1c
            java.lang.Class r1 = r5.getReturnType()
            java.lang.Class<java.lang.String> r2 = java.lang.String.class
            if (r1 != r2) goto L1c
            java.lang.Class[] r1 = r5.getParameterTypes()
            int r1 = r1.length
            r3 = 1
            if (r1 != r3) goto L1c
            java.lang.Class[] r5 = r5.getParameterTypes()
            r5 = r5[r0]
            if (r5 != r2) goto L1c
            return r3
        L1c:
            return r0
    }

    private boolean isVideoPathOwnerGetter(java.lang.reflect.Method r2, java.lang.Class<?> r3) {
            r1 = this;
            if (r2 == 0) goto L1d
            if (r3 == 0) goto L1d
            boolean r0 = h.Hchat.utils.KavaReflector.isStatic(r2)
            if (r0 == 0) goto L1d
            java.lang.Class[] r0 = r2.getParameterTypes()
            int r0 = r0.length
            if (r0 != 0) goto L1d
            java.lang.Class r2 = r2.getReturnType()
            boolean r2 = r3.isAssignableFrom(r2)
            if (r2 == 0) goto L1d
            r2 = 1
            return r2
        L1d:
            r2 = 0
            return r2
    }

    private boolean isVoiceFinishRecordMethod(java.lang.reflect.Method r6) {
            r5 = this;
            r0 = 0
            if (r6 == 0) goto L39
            java.lang.Class r1 = r6.getReturnType()
            java.lang.Class r2 = java.lang.Boolean.TYPE
            if (r1 == r2) goto Lc
            goto L39
        Lc:
            boolean r1 = h.Hchat.utils.KavaReflector.isStatic(r6)
            if (r1 != 0) goto L13
            return r0
        L13:
            java.lang.Class[] r6 = r6.getParameterTypes()
            int r1 = r6.length
            r2 = 3
            if (r1 == r2) goto L20
            int r1 = r6.length
            r2 = 4
            if (r1 == r2) goto L20
            return r0
        L20:
            r1 = r6[r0]
            java.lang.Class<java.lang.String> r2 = java.lang.String.class
            if (r1 != r2) goto L39
            r1 = 1
            r2 = r6[r1]
            java.lang.Class<java.lang.Integer> r3 = java.lang.Integer.class
            java.lang.Class r4 = java.lang.Integer.TYPE
            if (r2 == r4) goto L31
            if (r2 != r3) goto L39
        L31:
            r2 = 2
            r6 = r6[r2]
            if (r6 == r4) goto L38
            if (r6 != r3) goto L39
        L38:
            return r1
        L39:
            return r0
    }

    private boolean isVoiceFullPathMethod(java.lang.reflect.Method r9) {
            r8 = this;
            r0 = 0
            if (r9 == 0) goto L42
            java.lang.Class r1 = r9.getReturnType()
            java.lang.Class<java.lang.String> r2 = java.lang.String.class
            if (r1 == r2) goto Lc
            goto L42
        Lc:
            java.lang.Class[] r1 = r9.getParameterTypes()
            int r3 = r1.length
            java.lang.Class<java.lang.Boolean> r4 = java.lang.Boolean.class
            java.lang.Class r5 = java.lang.Boolean.TYPE
            r6 = 2
            r7 = 1
            if (r3 != r6) goto L2b
            boolean r9 = h.Hchat.utils.KavaReflector.isStatic(r9)
            if (r9 == 0) goto L2a
            r9 = r1[r0]
            if (r9 != r2) goto L2a
            r9 = r1[r7]
            if (r9 == r5) goto L29
            if (r9 != r4) goto L2a
        L29:
            return r7
        L2a:
            return r0
        L2b:
            int r9 = r1.length
            r3 = 3
            if (r9 != r3) goto L42
            r9 = r1[r0]
            boolean r9 = r9.isPrimitive()
            if (r9 != 0) goto L42
            r9 = r1[r7]
            if (r9 != r2) goto L42
            r9 = r1[r6]
            if (r9 == r5) goto L41
            if (r9 != r4) goto L42
        L41:
            return r7
        L42:
            return r0
    }

    private boolean isVoiceInfoQueryMethod(java.lang.reflect.Method r5, java.lang.Class<?> r6) {
            r4 = this;
            r0 = 0
            if (r5 == 0) goto L21
            if (r6 == 0) goto L21
            boolean r1 = h.Hchat.utils.KavaReflector.isStatic(r5)
            if (r1 != 0) goto Lc
            goto L21
        Lc:
            java.lang.Class[] r1 = r5.getParameterTypes()
            int r2 = r1.length
            r3 = 1
            if (r2 != r3) goto L21
            r1 = r1[r0]
            java.lang.Class<java.lang.String> r2 = java.lang.String.class
            if (r1 != r2) goto L21
            java.lang.Class r5 = r5.getReturnType()
            if (r5 != r6) goto L21
            return r3
        L21:
            return r0
    }

    private boolean isVoiceInfoStorageQueryMethod(java.lang.reflect.Method r5) {
            r4 = this;
            r0 = 0
            if (r5 == 0) goto L27
            boolean r1 = h.Hchat.utils.KavaReflector.isStatic(r5)
            if (r1 == 0) goto La
            goto L27
        La:
            java.lang.Class[] r1 = r5.getParameterTypes()
            java.lang.Class r5 = r5.getReturnType()
            int r2 = r1.length
            r3 = 1
            if (r2 != r3) goto L27
            r1 = r1[r0]
            java.lang.Class<java.lang.String> r2 = java.lang.String.class
            if (r1 != r2) goto L27
            java.lang.Class r1 = java.lang.Void.TYPE
            if (r5 == r1) goto L27
            boolean r5 = r5.isPrimitive()
            if (r5 != 0) goto L27
            return r3
        L27:
            return r0
    }

    private boolean isVoicePlaybackStartMethod(java.lang.reflect.Method r5) {
            r4 = this;
            if (r5 == 0) goto L28
            java.lang.Class r0 = r5.getDeclaringClass()
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            java.lang.Class r2 = java.lang.Boolean.TYPE
            java.lang.Class r3 = java.lang.Integer.TYPE
            java.lang.Class[] r1 = new java.lang.Class[]{r1, r2, r2, r3}
            boolean r0 = r4.isExactInstanceMethod(r5, r0, r2, r1)
            if (r0 == 0) goto L28
            java.lang.Class r5 = r5.getDeclaringClass()
            java.lang.Class<android.content.Context> r0 = android.content.Context.class
            java.lang.Class[] r0 = new java.lang.Class[]{r0, r3}
            java.lang.reflect.Constructor r5 = r4.findCtorByExactTypes(r5, r0)
            if (r5 == 0) goto L28
            r5 = 1
            return r5
        L28:
            r5 = 0
            return r5
    }

    private boolean isVoiceStartRecordMethod(java.lang.reflect.Method r5) {
            r4 = this;
            r0 = 0
            if (r5 == 0) goto L24
            java.lang.Class r1 = r5.getReturnType()
            java.lang.Class<java.lang.String> r2 = java.lang.String.class
            if (r1 == r2) goto Lc
            goto L24
        Lc:
            java.lang.Class[] r1 = r5.getParameterTypes()
            boolean r5 = h.Hchat.utils.KavaReflector.isStatic(r5)
            if (r5 == 0) goto L24
            int r5 = r1.length
            r3 = 2
            if (r5 != r3) goto L24
            r5 = r1[r0]
            if (r5 != r2) goto L24
            r5 = 1
            r1 = r1[r5]
            if (r1 != r2) goto L24
            return r5
        L24:
            return r0
    }

    private java.lang.String joinClassNames(java.util.List<java.lang.Class<?>> r4) {
            r3 = this;
            if (r4 == 0) goto L39
            boolean r0 = r4.isEmpty()
            if (r0 == 0) goto L9
            goto L39
        L9:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.util.Iterator r4 = r4.iterator()
        L12:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L34
            java.lang.Object r1 = r4.next()
            java.lang.Class r1 = (java.lang.Class) r1
            if (r1 != 0) goto L21
            goto L12
        L21:
            int r2 = r0.length()
            if (r2 <= 0) goto L2c
            r2 = 44
            r0.append(r2)
        L2c:
            java.lang.String r1 = r1.getName()
            r0.append(r1)
            goto L12
        L34:
            java.lang.String r4 = r0.toString()
            return r4
        L39:
            java.lang.String r4 = ""
            return r4
    }

    private boolean loadCache() {
            r7 = this;
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            android.content.SharedPreferences r1 = r7.cachePrefs
            r2 = 0
            if (r1 == 0) goto L5b3
            java.lang.String r1 = r7.runtimeCacheKey
            int r1 = r1.length()
            if (r1 != 0) goto L11
            goto L5b3
        L11:
            android.content.SharedPreferences r1 = r7.cachePrefs     // Catch: java.lang.Throwable -> L32
            java.lang.String r3 = "cache.complete"
            boolean r1 = r1.getBoolean(r3, r2)     // Catch: java.lang.Throwable -> L32
            if (r1 != 0) goto L1c
            return r2
        L1c:
            android.content.SharedPreferences r1 = r7.cachePrefs     // Catch: java.lang.Throwable -> L32
            java.lang.String r3 = "cache.key"
            java.lang.String r4 = ""
            java.lang.String r1 = r1.getString(r3, r4)     // Catch: java.lang.Throwable -> L32
            java.lang.String r3 = r7.runtimeCacheKey     // Catch: java.lang.Throwable -> L32
            boolean r1 = r3.equals(r1)     // Catch: java.lang.Throwable -> L32
            if (r1 != 0) goto L35
            r7.resetCacheForRuntimeKey()     // Catch: java.lang.Throwable -> L32
            return r2
        L32:
            r0 = move-exception
            goto L59e
        L35:
            java.lang.String r1 = "addMsgClasses"
            java.util.List r1 = r7.loadClassList(r1)     // Catch: java.lang.Throwable -> L32
            r7.addMsgClasses = r1     // Catch: java.lang.Throwable -> L32
            java.lang.String r1 = "receiveLuckyMoneyClass"
            java.lang.Class r1 = r7.loadClass(r1)     // Catch: java.lang.Throwable -> L32
            r7.receiveLuckyMoneyClass = r1     // Catch: java.lang.Throwable -> L32
            java.lang.String r1 = "receiveLuckyMoneyUnionClass"
            java.lang.Class r1 = r7.loadClass(r1)     // Catch: java.lang.Throwable -> L32
            r7.receiveLuckyMoneyUnionClass = r1     // Catch: java.lang.Throwable -> L32
            java.lang.String r1 = "openLuckyMoneyClass"
            java.lang.Class r1 = r7.loadClass(r1)     // Catch: java.lang.Throwable -> L32
            r7.openLuckyMoneyClass = r1     // Catch: java.lang.Throwable -> L32
            java.lang.String r1 = "openLuckyMoneyUnionClass"
            java.lang.Class r1 = r7.loadClass(r1)     // Catch: java.lang.Throwable -> L32
            r7.openLuckyMoneyUnionClass = r1     // Catch: java.lang.Throwable -> L32
            java.lang.String r1 = "netQueueClass"
            java.lang.Class r1 = r7.loadClass(r1)     // Catch: java.lang.Throwable -> L32
            r7.netQueueClass = r1     // Catch: java.lang.Throwable -> L32
            java.lang.String r1 = "netQueueCandidateClasses"
            java.util.List r1 = r7.loadClassList(r1)     // Catch: java.lang.Throwable -> L32
            r7.netQueueCandidateClasses = r1     // Catch: java.lang.Throwable -> L32
            java.lang.String r1 = "packetBaseClasses"
            java.util.List r1 = r7.loadClassList(r1)     // Catch: java.lang.Throwable -> L32
            r7.packetBaseClasses = r1     // Catch: java.lang.Throwable -> L32
            java.lang.String r1 = "packetQueueClasses"
            java.util.List r1 = r7.loadClassList(r1)     // Catch: java.lang.Throwable -> L32
            r7.packetQueueClasses = r1     // Catch: java.lang.Throwable -> L32
            java.lang.String r1 = "fakePacketClasses"
            java.util.List r1 = r7.loadClassList(r1)     // Catch: java.lang.Throwable -> L32
            r7.fakePacketClasses = r1     // Catch: java.lang.Throwable -> L32
            java.lang.String r1 = "protobufRawReqClass"
            java.lang.Class r1 = r7.loadClass(r1)     // Catch: java.lang.Throwable -> L32
            r7.protobufRawReqClass = r1     // Catch: java.lang.Throwable -> L32
            java.lang.String r1 = "protobufGenericRespClass"
            java.lang.Class r1 = r7.loadClass(r1)     // Catch: java.lang.Throwable -> L32
            r7.protobufGenericRespClass = r1     // Catch: java.lang.Throwable -> L32
            java.lang.String r1 = "protobufConfigBuilderClass"
            java.lang.Class r1 = r7.loadClass(r1)     // Catch: java.lang.Throwable -> L32
            r7.protobufConfigBuilderClass = r1     // Catch: java.lang.Throwable -> L32
            java.lang.String r1 = "protobufReqRespClass"
            java.lang.Class r1 = r7.loadClass(r1)     // Catch: java.lang.Throwable -> L32
            r7.protobufReqRespClass = r1     // Catch: java.lang.Throwable -> L32
            java.lang.String r1 = "protobufCallbackClass"
            java.lang.Class r1 = r7.loadClass(r1)     // Catch: java.lang.Throwable -> L32
            r7.protobufCallbackClass = r1     // Catch: java.lang.Throwable -> L32
            java.lang.String r1 = "protobufNewSendMsgReqClass"
            java.lang.Class r1 = r7.loadClass(r1)     // Catch: java.lang.Throwable -> L32
            r7.protobufNewSendMsgReqClass = r1     // Catch: java.lang.Throwable -> L32
            java.lang.String r1 = "protobufOplogReqClass"
            java.lang.Class r1 = r7.loadClass(r1)     // Catch: java.lang.Throwable -> L32
            r7.protobufOplogReqClass = r1     // Catch: java.lang.Throwable -> L32
            java.lang.String r1 = "protobufOnGYNetEndClass"
            java.lang.Class r1 = r7.loadClass(r1)     // Catch: java.lang.Throwable -> L32
            r7.protobufOnGYNetEndClass = r1     // Catch: java.lang.Throwable -> L32
            java.lang.String r1 = "protobufNetSceneBaseClass"
            java.lang.Class r1 = r7.loadClass(r1)     // Catch: java.lang.Throwable -> L32
            r7.protobufNetSceneBaseClass = r1     // Catch: java.lang.Throwable -> L32
            java.lang.String r1 = "protobufStaticDispatchMethod"
            java.lang.reflect.Method r1 = r7.loadMethod(r1)     // Catch: java.lang.Throwable -> L32
            r7.protobufStaticDispatchMethod = r1     // Catch: java.lang.Throwable -> L32
            java.lang.String r1 = "protobufSceneEndMethods"
            java.util.List r1 = r7.loadMethodList(r1)     // Catch: java.lang.Throwable -> L32
            r7.protobufSceneEndMethods = r1     // Catch: java.lang.Throwable -> L32
            java.lang.String r1 = "wishWxHbClass"
            java.lang.Class r1 = r7.loadClass(r1)     // Catch: java.lang.Throwable -> L32
            r7.wishWxHbClass = r1     // Catch: java.lang.Throwable -> L32
            java.lang.String r1 = "sendTextMsgClass"
            java.lang.Class r1 = r7.loadClass(r1)     // Catch: java.lang.Throwable -> L32
            r7.sendTextMsgClass = r1     // Catch: java.lang.Throwable -> L32
            java.lang.String r1 = "serviceGetterMethod"
            java.lang.reflect.Method r1 = r7.loadMethod(r1)     // Catch: java.lang.Throwable -> L32
            r7.serviceGetterMethod = r1     // Catch: java.lang.Throwable -> L32
            java.lang.String r1 = "getContactAddMethods"
            java.util.List r1 = r7.loadMethodList(r1)     // Catch: java.lang.Throwable -> L32
            r7.getContactAddMethods = r1     // Catch: java.lang.Throwable -> L32
            java.lang.String r1 = "getContactServiceGetters"
            java.util.List r1 = r7.loadMethodList(r1)     // Catch: java.lang.Throwable -> L32
            r7.getContactServiceGetters = r1     // Catch: java.lang.Throwable -> L32
            java.lang.String r1 = "sendImageMethod"
            java.lang.reflect.Method r1 = r7.loadMethod(r1)     // Catch: java.lang.Throwable -> L32
            r7.sendImageMethod = r1     // Catch: java.lang.Throwable -> L32
            java.lang.String r1 = "sendImageAsyncParamsClass"
            java.lang.Class r1 = r7.loadClass(r1)     // Catch: java.lang.Throwable -> L32
            r7.sendImageAsyncParamsClass = r1     // Catch: java.lang.Throwable -> L32
            java.lang.String r1 = "sendImageCrossParamsClass"
            java.lang.Class r1 = r7.loadClass(r1)     // Catch: java.lang.Throwable -> L32
            r7.sendImageCrossParamsClass = r1     // Catch: java.lang.Throwable -> L32
            java.lang.String r1 = "sendImageAppInfoClass"
            java.lang.Class r1 = r7.loadClass(r1)     // Catch: java.lang.Throwable -> L32
            r7.sendImageAppInfoClass = r1     // Catch: java.lang.Throwable -> L32
            java.lang.String r1 = "sendImageAsyncSubmitMethod"
            java.lang.reflect.Method r1 = r7.loadMethod(r1)     // Catch: java.lang.Throwable -> L32
            r7.sendImageAsyncSubmitMethod = r1     // Catch: java.lang.Throwable -> L32
            java.lang.String r1 = "imageCdnTaskClass"
            java.lang.Class r1 = r7.loadClass(r1)     // Catch: java.lang.Throwable -> L32
            r7.imageCdnTaskClass = r1     // Catch: java.lang.Throwable -> L32
            java.lang.String r1 = "imageCdnSubmitMethod"
            java.lang.reflect.Method r1 = r7.loadMethod(r1)     // Catch: java.lang.Throwable -> L32
            r7.imageCdnSubmitMethod = r1     // Catch: java.lang.Throwable -> L32
            java.lang.String r1 = "imageCdnServiceGetterMethod"
            java.lang.reflect.Method r1 = r7.loadMethod(r1)     // Catch: java.lang.Throwable -> L32
            r7.imageCdnServiceGetterMethod = r1     // Catch: java.lang.Throwable -> L32
            java.lang.String r1 = "marsCdnManagerClass"
            java.lang.Class r1 = r7.loadClass(r1)     // Catch: java.lang.Throwable -> L32
            r7.marsCdnManagerClass = r1     // Catch: java.lang.Throwable -> L32
            java.lang.String r1 = "marsCdnDownloadRequestClass"
            java.lang.Class r1 = r7.loadClass(r1)     // Catch: java.lang.Throwable -> L32
            r7.marsCdnDownloadRequestClass = r1     // Catch: java.lang.Throwable -> L32
            java.lang.String r1 = "marsCdnDownloadCallbackClass"
            java.lang.Class r1 = r7.loadClass(r1)     // Catch: java.lang.Throwable -> L32
            r7.marsCdnDownloadCallbackClass = r1     // Catch: java.lang.Throwable -> L32
            java.lang.String r1 = "marsCdnStartDownloadMethod"
            java.lang.reflect.Method r1 = r7.loadMethod(r1)     // Catch: java.lang.Throwable -> L32
            r7.marsCdnStartDownloadMethod = r1     // Catch: java.lang.Throwable -> L32
            java.lang.String r1 = "imageBestPathMethod"
            java.lang.reflect.Method r1 = r7.loadMethod(r1)     // Catch: java.lang.Throwable -> L32
            r7.imageBestPathMethod = r1     // Catch: java.lang.Throwable -> L32
            java.lang.String r1 = "imageStorageGetterMethod"
            java.lang.reflect.Method r1 = r7.loadMethod(r1)     // Catch: java.lang.Throwable -> L32
            r7.imageStorageGetterMethod = r1     // Catch: java.lang.Throwable -> L32
            java.lang.String r1 = "imageTokenPathMethod"
            java.lang.reflect.Method r1 = r7.loadMethod(r1)     // Catch: java.lang.Throwable -> L32
            r7.imageTokenPathMethod = r1     // Catch: java.lang.Throwable -> L32
            java.lang.String r1 = "sendFileMethod"
            java.lang.reflect.Method r1 = r7.loadMethod(r1)     // Catch: java.lang.Throwable -> L32
            r7.sendFileMethod = r1     // Catch: java.lang.Throwable -> L32
            java.lang.String r1 = "sendFileAttachDirMethod"
            java.lang.reflect.Method r1 = r7.loadMethod(r1)     // Catch: java.lang.Throwable -> L32
            r7.sendFileAttachDirMethod = r1     // Catch: java.lang.Throwable -> L32
            java.lang.String r1 = "sendFileAttachPathMethod"
            java.lang.reflect.Method r1 = r7.loadMethod(r1)     // Catch: java.lang.Throwable -> L32
            r7.sendFileAttachPathMethod = r1     // Catch: java.lang.Throwable -> L32
            java.lang.String r1 = "sendXmlAppMsgMethod"
            java.lang.reflect.Method r1 = r7.loadMethod(r1)     // Catch: java.lang.Throwable -> L32
            r7.sendXmlAppMsgMethod = r1     // Catch: java.lang.Throwable -> L32
            java.lang.String r1 = "appMsgParseMethod"
            java.lang.reflect.Method r1 = r7.loadMethod(r1)     // Catch: java.lang.Throwable -> L32
            r7.appMsgParseMethod = r1     // Catch: java.lang.Throwable -> L32
            java.lang.String r1 = "groupSolitairePluginClass"
            java.lang.Class r1 = r7.loadClass(r1)     // Catch: java.lang.Throwable -> L32
            r7.groupSolitairePluginClass = r1     // Catch: java.lang.Throwable -> L32
            java.lang.String r1 = "groupSolitaireSendMethod"
            java.lang.reflect.Method r1 = r7.loadMethod(r1)     // Catch: java.lang.Throwable -> L32
            r7.groupSolitaireSendMethod = r1     // Catch: java.lang.Throwable -> L32
            java.lang.String r1 = "localSystemMessageMethod"
            java.lang.reflect.Method r1 = r7.loadMethod(r1)     // Catch: java.lang.Throwable -> L32
            r7.localSystemMessageMethod = r1     // Catch: java.lang.Throwable -> L32
            java.lang.String r1 = "localMessageInsertMethod"
            java.lang.reflect.Method r1 = r7.loadMethod(r1)     // Catch: java.lang.Throwable -> L32
            r7.localMessageInsertMethod = r1     // Catch: java.lang.Throwable -> L32
            java.lang.String r1 = "localMessageCreateTimeMethod"
            java.lang.reflect.Method r1 = r7.loadMethod(r1)     // Catch: java.lang.Throwable -> L32
            r7.localMessageCreateTimeMethod = r1     // Catch: java.lang.Throwable -> L32
            java.lang.String r1 = "localMessageClass"
            java.lang.Class r1 = r7.loadClass(r1)     // Catch: java.lang.Throwable -> L32
            r7.localMessageClass = r1     // Catch: java.lang.Throwable -> L32
            java.lang.String r1 = "sendVideoMethod"
            java.lang.reflect.Method r1 = r7.loadMethod(r1)     // Catch: java.lang.Throwable -> L32
            r7.sendVideoMethod = r1     // Catch: java.lang.Throwable -> L32
            java.lang.String r1 = "sendVideoTaskClass"
            java.lang.Class r1 = r7.loadClass(r1)     // Catch: java.lang.Throwable -> L32
            r7.sendVideoTaskClass = r1     // Catch: java.lang.Throwable -> L32
            java.lang.String r1 = "videoPathMethod"
            java.lang.reflect.Method r1 = r7.loadMethod(r1)     // Catch: java.lang.Throwable -> L32
            r7.videoPathMethod = r1     // Catch: java.lang.Throwable -> L32
            java.lang.String r1 = "videoPathOwnerGetterMethod"
            java.lang.reflect.Method r1 = r7.loadMethod(r1)     // Catch: java.lang.Throwable -> L32
            r7.videoPathOwnerGetterMethod = r1     // Catch: java.lang.Throwable -> L32
            java.lang.String r1 = "videoInfoClass"
            java.lang.Class r1 = r7.loadClass(r1)     // Catch: java.lang.Throwable -> L32
            r7.videoInfoClass = r1     // Catch: java.lang.Throwable -> L32
            java.lang.String r1 = "videoInfoByFileNameMethod"
            java.lang.reflect.Method r1 = r7.loadMethod(r1)     // Catch: java.lang.Throwable -> L32
            r7.videoInfoByFileNameMethod = r1     // Catch: java.lang.Throwable -> L32
            java.lang.String r1 = "transferOperationClass"
            java.lang.Class r1 = r7.loadClass(r1)     // Catch: java.lang.Throwable -> L32
            r7.transferOperationClass = r1     // Catch: java.lang.Throwable -> L32
            java.lang.String r1 = "transferQueryClass"
            java.lang.Class r1 = r7.loadClass(r1)     // Catch: java.lang.Throwable -> L32
            r7.transferQueryClass = r1     // Catch: java.lang.Throwable -> L32
            java.lang.String r1 = "transferQueryResponseMethod"
            java.lang.reflect.Method r1 = r7.loadMethod(r1)     // Catch: java.lang.Throwable -> L32
            r7.transferQueryResponseMethod = r1     // Catch: java.lang.Throwable -> L32
            java.lang.String r1 = "verifyUserClass"
            java.lang.Class r1 = r7.loadClass(r1)     // Catch: java.lang.Throwable -> L32
            r7.verifyUserClass = r1     // Catch: java.lang.Throwable -> L32
            java.lang.String r1 = "contactCardXmlMethod"
            java.lang.reflect.Method r1 = r7.loadMethod(r1)     // Catch: java.lang.Throwable -> L32
            r7.contactCardXmlMethod = r1     // Catch: java.lang.Throwable -> L32
            java.lang.String r1 = "patDisplayTemplateMethod"
            java.lang.reflect.Method r1 = r7.loadMethod(r1)     // Catch: java.lang.Throwable -> L32
            r7.patDisplayTemplateMethod = r1     // Catch: java.lang.Throwable -> L32
            java.lang.String r1 = "patExtensionClass"
            java.lang.Class r1 = r7.loadClass(r1)     // Catch: java.lang.Throwable -> L32
            r7.patExtensionClass = r1     // Catch: java.lang.Throwable -> L32
            java.lang.String r1 = "patCreatePairMethod"
            java.lang.reflect.Method r1 = r7.loadMethod(r1)     // Catch: java.lang.Throwable -> L32
            r7.patCreatePairMethod = r1     // Catch: java.lang.Throwable -> L32
            java.lang.String r1 = "patSuffixMethod"
            java.lang.reflect.Method r1 = r7.loadMethod(r1)     // Catch: java.lang.Throwable -> L32
            r7.patSuffixMethod = r1     // Catch: java.lang.Throwable -> L32
            java.lang.String r1 = "patCanSendMethod"
            java.lang.reflect.Method r1 = r7.loadMethod(r1)     // Catch: java.lang.Throwable -> L32
            r7.patCanSendMethod = r1     // Catch: java.lang.Throwable -> L32
            java.lang.String r1 = "sendPatSceneClass"
            java.lang.Class r1 = r7.loadClass(r1)     // Catch: java.lang.Throwable -> L32
            r7.sendPatSceneClass = r1     // Catch: java.lang.Throwable -> L32
            java.lang.String r1 = "voiceStartRecordMethod"
            java.lang.reflect.Method r1 = r7.loadMethod(r1)     // Catch: java.lang.Throwable -> L32
            r7.voiceStartRecordMethod = r1     // Catch: java.lang.Throwable -> L32
            java.lang.String r1 = "voiceFullPathMethod"
            java.lang.reflect.Method r1 = r7.loadMethod(r1)     // Catch: java.lang.Throwable -> L32
            r7.voiceFullPathMethod = r1     // Catch: java.lang.Throwable -> L32
            java.lang.String r1 = "voiceFinishRecordMethod"
            java.lang.reflect.Method r1 = r7.loadMethod(r1)     // Catch: java.lang.Throwable -> L32
            r7.voiceFinishRecordMethod = r1     // Catch: java.lang.Throwable -> L32
            java.lang.String r1 = "voiceInfoQueryMethod"
            java.lang.reflect.Method r1 = r7.loadMethod(r1)     // Catch: java.lang.Throwable -> L32
            r7.voiceInfoQueryMethod = r1     // Catch: java.lang.Throwable -> L32
            java.lang.String r1 = "voiceUploadClass"
            java.lang.Class r1 = r7.loadClass(r1)     // Catch: java.lang.Throwable -> L32
            r7.voiceUploadClass = r1     // Catch: java.lang.Throwable -> L32
            java.lang.Class r3 = java.lang.Boolean.TYPE     // Catch: java.lang.Throwable -> L32
            java.lang.Class[] r4 = new java.lang.Class[]{r0, r3}     // Catch: java.lang.Throwable -> L32
            java.lang.reflect.Constructor r1 = r7.findCtorByExactTypes(r1, r4)     // Catch: java.lang.Throwable -> L32
            r7.voiceUploadCdnCtor = r1     // Catch: java.lang.Throwable -> L32
            java.lang.String r1 = "voicePlaybackStartMethod"
            java.lang.reflect.Method r1 = r7.loadMethod(r1)     // Catch: java.lang.Throwable -> L32
            r7.voicePlaybackStartMethod = r1     // Catch: java.lang.Throwable -> L32
            java.lang.String r1 = "voicePlaybackPauseMethod"
            java.lang.reflect.Method r1 = r7.loadMethod(r1)     // Catch: java.lang.Throwable -> L32
            r7.voicePlaybackPauseMethod = r1     // Catch: java.lang.Throwable -> L32
            java.lang.String r1 = "voicePlaybackResumeMethod"
            java.lang.reflect.Method r1 = r7.loadMethod(r1)     // Catch: java.lang.Throwable -> L32
            r7.voicePlaybackResumeMethod = r1     // Catch: java.lang.Throwable -> L32
            java.lang.String r1 = "voicePlaybackStopMethod"
            java.lang.reflect.Method r1 = r7.loadMethod(r1)     // Catch: java.lang.Throwable -> L32
            r7.voicePlaybackStopMethod = r1     // Catch: java.lang.Throwable -> L32
            java.lang.String r1 = "emojiSendMethod"
            java.lang.reflect.Method r1 = r7.loadMethod(r1)     // Catch: java.lang.Throwable -> L32
            r7.emojiSendMethod = r1     // Catch: java.lang.Throwable -> L32
            java.lang.String r1 = "emojiManagerSendMethod"
            java.lang.reflect.Method r1 = r7.loadMethod(r1)     // Catch: java.lang.Throwable -> L32
            r7.emojiManagerSendMethod = r1     // Catch: java.lang.Throwable -> L32
            java.lang.String r1 = "emojiGetByMd5Method"
            java.lang.reflect.Method r1 = r7.loadMethod(r1)     // Catch: java.lang.Throwable -> L32
            r7.emojiGetByMd5Method = r1     // Catch: java.lang.Throwable -> L32
            java.lang.String r1 = "emojiCreateInfoMethod"
            java.lang.reflect.Method r1 = r7.loadMethod(r1)     // Catch: java.lang.Throwable -> L32
            r7.emojiCreateInfoMethod = r1     // Catch: java.lang.Throwable -> L32
            java.lang.String r1 = "emojiUpdateInfoMethod"
            java.lang.reflect.Method r1 = r7.loadMethod(r1)     // Catch: java.lang.Throwable -> L32
            r7.emojiUpdateInfoMethod = r1     // Catch: java.lang.Throwable -> L32
            java.lang.String r1 = "emojiAccPathMethod"
            java.lang.reflect.Method r1 = r7.loadMethod(r1)     // Catch: java.lang.Throwable -> L32
            r7.emojiAccPathMethod = r1     // Catch: java.lang.Throwable -> L32
            java.lang.String r1 = "emojiCheckGifMethod"
            java.lang.reflect.Method r1 = r7.loadMethod(r1)     // Catch: java.lang.Throwable -> L32
            r7.emojiCheckGifMethod = r1     // Catch: java.lang.Throwable -> L32
            java.lang.String r1 = "emojiFilePathMethod"
            java.lang.reflect.Method r1 = r7.loadMethod(r1)     // Catch: java.lang.Throwable -> L32
            r7.emojiFilePathMethod = r1     // Catch: java.lang.Throwable -> L32
            java.lang.String r1 = "emojiDecodeDataMethod"
            java.lang.reflect.Method r1 = r7.loadMethod(r1)     // Catch: java.lang.Throwable -> L32
            r7.emojiDecodeDataMethod = r1     // Catch: java.lang.Throwable -> L32
            java.lang.String r1 = "emojiDecodeManagerGetterMethod"
            java.lang.reflect.Method r1 = r7.loadMethod(r1)     // Catch: java.lang.Throwable -> L32
            r7.emojiDecodeManagerGetterMethod = r1     // Catch: java.lang.Throwable -> L32
            java.lang.String r1 = "favoriteItemClass"
            java.lang.Class r1 = r7.loadClass(r1)     // Catch: java.lang.Throwable -> L32
            r7.favoriteItemClass = r1     // Catch: java.lang.Throwable -> L32
            java.lang.String r1 = "favoriteItemConvertFromCursorMethod"
            java.lang.reflect.Method r1 = r7.loadMethod(r1)     // Catch: java.lang.Throwable -> L32
            r7.favoriteItemConvertFromCursorMethod = r1     // Catch: java.lang.Throwable -> L32
            java.lang.String r1 = "favoriteServiceClass"
            java.lang.Class r1 = r7.loadClass(r1)     // Catch: java.lang.Throwable -> L32
            r7.favoriteServiceClass = r1     // Catch: java.lang.Throwable -> L32
            java.lang.String r1 = "favoriteServiceResolverMethod"
            java.lang.reflect.Method r1 = r7.loadMethod(r1)     // Catch: java.lang.Throwable -> L32
            r7.favoriteServiceResolverMethod = r1     // Catch: java.lang.Throwable -> L32
            java.lang.String r1 = "favoriteStorageGetterMethod"
            java.lang.reflect.Method r1 = r7.loadMethod(r1)     // Catch: java.lang.Throwable -> L32
            r7.favoriteStorageGetterMethod = r1     // Catch: java.lang.Throwable -> L32
            java.lang.String r1 = "favoriteListMethod"
            java.lang.reflect.Method r1 = r7.loadMethod(r1)     // Catch: java.lang.Throwable -> L32
            r7.favoriteListMethod = r1     // Catch: java.lang.Throwable -> L32
            java.lang.String r1 = "favoriteListNextMethod"
            java.lang.reflect.Method r1 = r7.loadMethod(r1)     // Catch: java.lang.Throwable -> L32
            r7.favoriteListNextMethod = r1     // Catch: java.lang.Throwable -> L32
            java.lang.String r1 = "favoriteListCursorMethod"
            java.lang.reflect.Method r1 = r7.loadMethod(r1)     // Catch: java.lang.Throwable -> L32
            r7.favoriteListCursorMethod = r1     // Catch: java.lang.Throwable -> L32
            java.lang.String r1 = "favoriteGetMethod"
            java.lang.reflect.Method r1 = r7.loadMethod(r1)     // Catch: java.lang.Throwable -> L32
            r7.favoriteGetMethod = r1     // Catch: java.lang.Throwable -> L32
            java.lang.String r1 = "favoriteSendMethod"
            java.lang.reflect.Method r1 = r7.loadMethod(r1)     // Catch: java.lang.Throwable -> L32
            r7.favoriteSendMethod = r1     // Catch: java.lang.Throwable -> L32
            java.lang.String r1 = "favoriteSendParamClass"
            java.lang.Class r1 = r7.loadClass(r1)     // Catch: java.lang.Throwable -> L32
            r7.favoriteSendParamClass = r1     // Catch: java.lang.Throwable -> L32
            java.lang.String r1 = "mmKernelClass"
            java.lang.Class r1 = r7.loadClass(r1)     // Catch: java.lang.Throwable -> L32
            r7.mmKernelClass = r1     // Catch: java.lang.Throwable -> L32
            java.lang.String r1 = "coreStorageClass"
            java.lang.Class r1 = r7.loadClass(r1)     // Catch: java.lang.Throwable -> L32
            r7.coreStorageClass = r1     // Catch: java.lang.Throwable -> L32
            java.lang.String r1 = "configStorageClass"
            java.lang.Class r1 = r7.loadClass(r1)     // Catch: java.lang.Throwable -> L32
            r7.configStorageClass = r1     // Catch: java.lang.Throwable -> L32
            java.lang.String r1 = "sqliteDbWrapperClass"
            java.lang.Class r1 = r7.loadClass(r1)     // Catch: java.lang.Throwable -> L32
            r7.sqliteDbWrapperClass = r1     // Catch: java.lang.Throwable -> L32
            java.lang.String r1 = "conversationDeleteMethod"
            java.lang.reflect.Method r1 = r7.loadMethod(r1)     // Catch: java.lang.Throwable -> L32
            r7.conversationDeleteMethod = r1     // Catch: java.lang.Throwable -> L32
            java.lang.String r1 = "messageClearByTalkerMethod"
            java.lang.reflect.Method r1 = r7.loadMethod(r1)     // Catch: java.lang.Throwable -> L32
            r7.messageClearByTalkerMethod = r1     // Catch: java.lang.Throwable -> L32
            java.lang.String r1 = "messageClearBatchMethod"
            java.lang.reflect.Method r1 = r7.loadMethod(r1)     // Catch: java.lang.Throwable -> L32
            r7.messageClearBatchMethod = r1     // Catch: java.lang.Throwable -> L32
            java.lang.String r1 = "contactMuteStateMethod"
            java.lang.reflect.Method r1 = r7.loadMethod(r1)     // Catch: java.lang.Throwable -> L32
            r7.contactMuteStateMethod = r1     // Catch: java.lang.Throwable -> L32
            java.lang.String r1 = "contactMuteEnableMethod"
            java.lang.reflect.Method r1 = r7.loadMethod(r1)     // Catch: java.lang.Throwable -> L32
            r7.contactMuteEnableMethod = r1     // Catch: java.lang.Throwable -> L32
            java.lang.String r1 = "contactMuteDisableMethod"
            java.lang.reflect.Method r1 = r7.loadMethod(r1)     // Catch: java.lang.Throwable -> L32
            r7.contactMuteDisableMethod = r1     // Catch: java.lang.Throwable -> L32
            java.lang.String r1 = "contactStorageGetterMethod"
            java.lang.reflect.Method r1 = r7.loadMethod(r1)     // Catch: java.lang.Throwable -> L32
            r7.contactStorageGetterMethod = r1     // Catch: java.lang.Throwable -> L32
            java.lang.String r1 = "contactStorageQueryMethod"
            java.lang.reflect.Method r1 = r7.loadMethod(r1)     // Catch: java.lang.Throwable -> L32
            r7.contactStorageQueryMethod = r1     // Catch: java.lang.Throwable -> L32
            java.lang.String r1 = "chatroomMuteServiceGetterMethod"
            java.lang.reflect.Method r1 = r7.loadMethod(r1)     // Catch: java.lang.Throwable -> L32
            r7.chatroomMuteServiceGetterMethod = r1     // Catch: java.lang.Throwable -> L32
            java.lang.String r1 = "chatroomMuteBuildMethod"
            java.lang.reflect.Method r1 = r7.loadMethod(r1)     // Catch: java.lang.Throwable -> L32
            r7.chatroomMuteBuildMethod = r1     // Catch: java.lang.Throwable -> L32
            java.lang.String r1 = "chatroomMuteSubmitMethod"
            java.lang.reflect.Method r1 = r7.loadMethod(r1)     // Catch: java.lang.Throwable -> L32
            r7.chatroomMuteSubmitMethod = r1     // Catch: java.lang.Throwable -> L32
            java.lang.Class<?> r1 = r7.receiveLuckyMoneyClass     // Catch: java.lang.Throwable -> L32
            r4 = 7
            r5 = 8
            r6 = 10
            int[] r4 = new int[]{r4, r6, r5}     // Catch: java.lang.Throwable -> L32
            java.lang.reflect.Constructor r1 = r7.findFirstCtorByArgCounts(r1, r4)     // Catch: java.lang.Throwable -> L32
            r7.receiveCtor = r1     // Catch: java.lang.Throwable -> L32
            java.lang.Class<?> r1 = r7.receiveLuckyMoneyUnionClass     // Catch: java.lang.Throwable -> L32
            r4 = 6
            java.lang.reflect.Constructor r1 = r7.findCtorByArgCount(r1, r4)     // Catch: java.lang.Throwable -> L32
            r7.unionReceiveCtor = r1     // Catch: java.lang.Throwable -> L32
            java.lang.Class<?> r1 = r7.openLuckyMoneyClass     // Catch: java.lang.Throwable -> L32
            java.lang.reflect.Constructor r1 = r7.findCtorByArgCount(r1, r6)     // Catch: java.lang.Throwable -> L32
            r7.openCtor10 = r1     // Catch: java.lang.Throwable -> L32
            java.lang.Class<?> r1 = r7.openLuckyMoneyClass     // Catch: java.lang.Throwable -> L32
            r4 = 9
            java.lang.reflect.Constructor r1 = r7.findCtorByArgCount(r1, r4)     // Catch: java.lang.Throwable -> L32
            r7.openCtor9 = r1     // Catch: java.lang.Throwable -> L32
            java.lang.Class<?> r1 = r7.openLuckyMoneyClass     // Catch: java.lang.Throwable -> L32
            java.lang.reflect.Constructor r1 = r7.findCtorByArgCount(r1, r5)     // Catch: java.lang.Throwable -> L32
            r7.openCtor8 = r1     // Catch: java.lang.Throwable -> L32
            java.lang.Class<?> r1 = r7.openLuckyMoneyUnionClass     // Catch: java.lang.Throwable -> L32
            java.lang.reflect.Constructor r1 = r7.findCtorByArgCount(r1, r6)     // Catch: java.lang.Throwable -> L32
            r7.unionOpenCtor10 = r1     // Catch: java.lang.Throwable -> L32
            java.lang.Class<?> r1 = r7.openLuckyMoneyUnionClass     // Catch: java.lang.Throwable -> L32
            java.lang.reflect.Constructor r1 = r7.findCtorByArgCount(r1, r4)     // Catch: java.lang.Throwable -> L32
            r7.unionOpenCtor9 = r1     // Catch: java.lang.Throwable -> L32
            java.lang.Class<?> r1 = r7.wishWxHbClass     // Catch: java.lang.Throwable -> L32
            r4 = 4
            java.lang.reflect.Constructor r1 = r7.findCtorByArgCount(r1, r4)     // Catch: java.lang.Throwable -> L32
            r7.wishWxHbCtor = r1     // Catch: java.lang.Throwable -> L32
            java.lang.Class<?> r1 = r7.sendTextMsgClass     // Catch: java.lang.Throwable -> L32
            java.lang.Class r4 = java.lang.Integer.TYPE     // Catch: java.lang.Throwable -> L32
            java.lang.Class r5 = java.lang.Long.TYPE     // Catch: java.lang.Throwable -> L32
            java.lang.Class[] r5 = new java.lang.Class[]{r0, r0, r4, r4, r5}     // Catch: java.lang.Throwable -> L32
            java.lang.reflect.Constructor r1 = r7.findCtorByExactTypes(r1, r5)     // Catch: java.lang.Throwable -> L32
            r7.sendTextMsgCtorLong = r1     // Catch: java.lang.Throwable -> L32
            java.lang.Class<?> r1 = r7.sendTextMsgClass     // Catch: java.lang.Throwable -> L32
            java.lang.Class<java.lang.Object> r5 = java.lang.Object.class
            java.lang.Class[] r5 = new java.lang.Class[]{r0, r0, r4, r4, r5}     // Catch: java.lang.Throwable -> L32
            java.lang.reflect.Constructor r1 = r7.findCtorByExactTypes(r1, r5)     // Catch: java.lang.Throwable -> L32
            r7.sendTextMsgCtorObject = r1     // Catch: java.lang.Throwable -> L32
            java.lang.Class<?> r1 = r7.localMessageClass     // Catch: java.lang.Throwable -> L32
            if (r1 != 0) goto L456
            java.lang.reflect.Method r1 = r7.localMessageInsertMethod     // Catch: java.lang.Throwable -> L32
            if (r1 == 0) goto L456
            java.lang.Class[] r1 = r1.getParameterTypes()     // Catch: java.lang.Throwable -> L32
            int r1 = r1.length     // Catch: java.lang.Throwable -> L32
            r5 = 1
            if (r1 != r5) goto L456
            java.lang.reflect.Method r1 = r7.localMessageInsertMethod     // Catch: java.lang.Throwable -> L32
            java.lang.Class[] r1 = r1.getParameterTypes()     // Catch: java.lang.Throwable -> L32
            r1 = r1[r2]     // Catch: java.lang.Throwable -> L32
            r7.localMessageClass = r1     // Catch: java.lang.Throwable -> L32
        L456:
            java.lang.Class<?> r1 = r7.localMessageClass     // Catch: java.lang.Throwable -> L32
            java.lang.reflect.Constructor r1 = r7.findLocalMessageConstructor(r1)     // Catch: java.lang.Throwable -> L32
            r7.localMessageCtor = r1     // Catch: java.lang.Throwable -> L32
            java.lang.reflect.Method r1 = r7.localMessageCreateTimeMethod     // Catch: java.lang.Throwable -> L32
            if (r1 != 0) goto L470
            java.lang.reflect.Method r1 = r7.localMessageInsertMethod     // Catch: java.lang.Throwable -> L32
            if (r1 == 0) goto L470
            java.lang.Class r1 = r1.getDeclaringClass()     // Catch: java.lang.Throwable -> L32
            java.lang.reflect.Method r1 = r7.findLocalMessageCreateTimeMethod(r1)     // Catch: java.lang.Throwable -> L32
            r7.localMessageCreateTimeMethod = r1     // Catch: java.lang.Throwable -> L32
        L470:
            java.lang.reflect.Method r1 = r7.localSystemMessageMethod     // Catch: java.lang.Throwable -> L32
            if (r1 != 0) goto L477
            r7.resolveLocalSystemMessageMethod()     // Catch: java.lang.Throwable -> L32
        L477:
            java.lang.Class<?> r1 = r7.voiceUploadClass     // Catch: java.lang.Throwable -> L32
            java.lang.Class[] r4 = new java.lang.Class[]{r0, r4}     // Catch: java.lang.Throwable -> L32
            java.lang.reflect.Constructor r1 = r7.findCtorByExactTypes(r1, r4)     // Catch: java.lang.Throwable -> L32
            r7.voiceUploadCtor = r1     // Catch: java.lang.Throwable -> L32
            java.lang.Class<?> r1 = r7.voiceUploadClass     // Catch: java.lang.Throwable -> L32
            java.lang.Class[] r3 = new java.lang.Class[]{r0, r3}     // Catch: java.lang.Throwable -> L32
            java.lang.reflect.Constructor r1 = r7.findCtorByExactTypes(r1, r3)     // Catch: java.lang.Throwable -> L32
            r7.voiceUploadCdnCtor = r1     // Catch: java.lang.Throwable -> L32
            java.lang.Class<?> r1 = r7.sendPatSceneClass     // Catch: java.lang.Throwable -> L32
            java.lang.reflect.Constructor r1 = r7.findSendPatSceneCtor(r1)     // Catch: java.lang.Throwable -> L32
            r7.sendPatSceneCtor = r1     // Catch: java.lang.Throwable -> L32
            java.lang.String r1 = "coreStorageGetter"
            java.lang.reflect.Method r1 = r7.loadMethod(r1)     // Catch: java.lang.Throwable -> L32
            r7.coreStorageGetter = r1     // Catch: java.lang.Throwable -> L32
            java.lang.String r1 = "groupMemberDisplayNameMethod"
            java.lang.reflect.Method r1 = r7.loadMethod(r1)     // Catch: java.lang.Throwable -> L32
            r7.groupMemberDisplayNameMethod = r1     // Catch: java.lang.Throwable -> L32
            java.lang.String r1 = "addChatroomMemberClass"
            java.lang.Class r1 = r7.loadClass(r1)     // Catch: java.lang.Throwable -> L32
            r7.addChatroomMemberClass = r1     // Catch: java.lang.Throwable -> L32
            java.lang.reflect.Constructor r1 = r7.findAddChatroomMemberCtor(r1)     // Catch: java.lang.Throwable -> L32
            r7.addChatroomMemberCtor = r1     // Catch: java.lang.Throwable -> L32
            java.lang.String r1 = "inviteChatroomMemberClass"
            java.lang.Class r1 = r7.loadClass(r1)     // Catch: java.lang.Throwable -> L32
            r7.inviteChatroomMemberClass = r1     // Catch: java.lang.Throwable -> L32
            java.lang.reflect.Constructor r1 = r7.findInviteChatroomMemberCtor(r1)     // Catch: java.lang.Throwable -> L32
            r7.inviteChatroomMemberCtor = r1     // Catch: java.lang.Throwable -> L32
            java.lang.String r1 = "delChatroomMemberClass"
            java.lang.Class r1 = r7.loadClass(r1)     // Catch: java.lang.Throwable -> L32
            r7.delChatroomMemberClass = r1     // Catch: java.lang.Throwable -> L32
            java.lang.reflect.Constructor r1 = r7.findDelChatroomMemberCtor(r1)     // Catch: java.lang.Throwable -> L32
            r7.delChatroomMemberCtor = r1     // Catch: java.lang.Throwable -> L32
            java.lang.String r1 = "revokeMsgClass"
            java.lang.Class r1 = r7.loadClass(r1)     // Catch: java.lang.Throwable -> L32
            r7.revokeMsgClass = r1     // Catch: java.lang.Throwable -> L32
            java.lang.reflect.Constructor r1 = r7.findRevokeMsgCtor(r1)     // Catch: java.lang.Throwable -> L32
            r7.revokeMsgCtor = r1     // Catch: java.lang.Throwable -> L32
            java.lang.String r1 = "uploadDeviceStepClass"
            java.lang.Class r1 = r7.loadClass(r1)     // Catch: java.lang.Throwable -> L32
            r7.uploadDeviceStepClass = r1     // Catch: java.lang.Throwable -> L32
            java.lang.reflect.Constructor r1 = r7.findUploadDeviceStepCtor(r1)     // Catch: java.lang.Throwable -> L32
            r7.uploadDeviceStepCtor = r1     // Catch: java.lang.Throwable -> L32
            java.lang.String r1 = "addContactLabelClass"
            java.lang.Class r1 = r7.loadClass(r1)     // Catch: java.lang.Throwable -> L32
            r7.addContactLabelClass = r1     // Catch: java.lang.Throwable -> L32
            java.lang.Class[] r0 = new java.lang.Class[]{r0}     // Catch: java.lang.Throwable -> L32
            java.lang.reflect.Constructor r0 = r7.findCtorByExactTypes(r1, r0)     // Catch: java.lang.Throwable -> L32
            r7.addContactLabelCtorString = r0     // Catch: java.lang.Throwable -> L32
            java.lang.Class<?> r0 = r7.addContactLabelClass     // Catch: java.lang.Throwable -> L32
            java.lang.Class<java.util.List> r1 = java.util.List.class
            java.lang.Class[] r1 = new java.lang.Class[]{r1}     // Catch: java.lang.Throwable -> L32
            java.lang.reflect.Constructor r0 = r7.findCtorByExactTypes(r0, r1)     // Catch: java.lang.Throwable -> L32
            r7.addContactLabelCtorList = r0     // Catch: java.lang.Throwable -> L32
            java.lang.String r0 = "modifyContactLabelListClass"
            java.lang.Class r0 = r7.loadClass(r0)     // Catch: java.lang.Throwable -> L32
            r7.modifyContactLabelListClass = r0     // Catch: java.lang.Throwable -> L32
            java.lang.Class<java.util.LinkedList> r1 = java.util.LinkedList.class
            java.lang.Class[] r1 = new java.lang.Class[]{r1}     // Catch: java.lang.Throwable -> L32
            java.lang.reflect.Constructor r0 = r7.findCtorByExactTypes(r0, r1)     // Catch: java.lang.Throwable -> L32
            r7.modifyContactLabelListCtor = r0     // Catch: java.lang.Throwable -> L32
            java.lang.String r0 = "snsUploadPackHelperClass"
            java.lang.Class r0 = r7.loadClass(r0)     // Catch: java.lang.Throwable -> L32
            r7.snsUploadPackHelperClass = r0     // Catch: java.lang.Throwable -> L32
            java.lang.String r0 = "snsUploadManagerClass"
            java.lang.Class r0 = r7.loadClass(r0)     // Catch: java.lang.Throwable -> L32
            r7.snsUploadManagerClass = r0     // Catch: java.lang.Throwable -> L32
            java.lang.String r0 = "snsUploadManagerGetterMethod"
            java.lang.reflect.Method r0 = r7.loadMethod(r0)     // Catch: java.lang.Throwable -> L32
            r7.snsUploadManagerGetterMethod = r0     // Catch: java.lang.Throwable -> L32
            java.lang.String r0 = "snsSetContentMethod"
            java.lang.reflect.Method r0 = r7.loadMethod(r0)     // Catch: java.lang.Throwable -> L32
            r7.snsSetContentMethod = r0     // Catch: java.lang.Throwable -> L32
            java.lang.String r0 = "snsSetSdkIdMethod"
            java.lang.reflect.Method r0 = r7.loadMethod(r0)     // Catch: java.lang.Throwable -> L32
            r7.snsSetSdkIdMethod = r0     // Catch: java.lang.Throwable -> L32
            java.lang.String r0 = "snsSetSdkAppNameMethod"
            java.lang.reflect.Method r0 = r7.loadMethod(r0)     // Catch: java.lang.Throwable -> L32
            r7.snsSetSdkAppNameMethod = r0     // Catch: java.lang.Throwable -> L32
            java.lang.String r0 = "snsAddImageMethod"
            java.lang.reflect.Method r0 = r7.loadMethod(r0)     // Catch: java.lang.Throwable -> L32
            r7.snsAddImageMethod = r0     // Catch: java.lang.Throwable -> L32
            java.lang.String r0 = "snsAddVideoMethod"
            java.lang.reflect.Method r0 = r7.loadMethod(r0)     // Catch: java.lang.Throwable -> L32
            r7.snsAddVideoMethod = r0     // Catch: java.lang.Throwable -> L32
            java.lang.String r0 = "snsCommitMethod"
            java.lang.reflect.Method r0 = r7.loadMethod(r0)     // Catch: java.lang.Throwable -> L32
            r7.snsCommitMethod = r0     // Catch: java.lang.Throwable -> L32
            java.lang.String r0 = "snsShareAppMsgMethod"
            java.lang.reflect.Method r0 = r7.loadMethod(r0)     // Catch: java.lang.Throwable -> L32
            r7.snsShareAppMsgMethod = r0     // Catch: java.lang.Throwable -> L32
            java.lang.String r0 = "snsUploadCheckMethod"
            java.lang.reflect.Method r0 = r7.loadMethod(r0)     // Catch: java.lang.Throwable -> L32
            r7.snsUploadCheckMethod = r0     // Catch: java.lang.Throwable -> L32
            java.lang.String r0 = "chatPageStartMethod"
            java.lang.reflect.Method r0 = r7.loadMethod(r0)     // Catch: java.lang.Throwable -> L32
            r7.chatPageStartMethod = r0     // Catch: java.lang.Throwable -> L32
            java.lang.String r0 = "chatPageFragmentEnterMethod"
            java.lang.reflect.Method r0 = r7.loadMethod(r0)     // Catch: java.lang.Throwable -> L32
            r7.chatPageFragmentEnterMethod = r0     // Catch: java.lang.Throwable -> L32
            java.lang.String r0 = "chatPageFragmentExitMethod"
            java.lang.reflect.Method r0 = r7.loadMethod(r0)     // Catch: java.lang.Throwable -> L32
            r7.chatPageFragmentExitMethod = r0     // Catch: java.lang.Throwable -> L32
            java.lang.String r0 = "chatFooterSendClickMethod"
            java.lang.reflect.Method r0 = r7.loadMethod(r0)     // Catch: java.lang.Throwable -> L32
            r7.chatFooterSendClickMethod = r0     // Catch: java.lang.Throwable -> L32
            boolean r0 = r7.isCacheUsable()     // Catch: java.lang.Throwable -> L32
            return r0
        L59e:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "读取缓存失败，重新解析: "
            r1.<init>(r3)
            java.lang.String r0 = r0.getMessage()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r7.logDetail(r0)
        L5b3:
            return r2
    }

    private java.lang.Class<?> loadClass(java.lang.String r4) {
            r3 = this;
            r0 = 0
            android.content.SharedPreferences r1 = r3.cachePrefs     // Catch: java.lang.Throwable -> L19
            java.lang.String r2 = ""
            java.lang.String r4 = r1.getString(r4, r2)     // Catch: java.lang.Throwable -> L19
            if (r4 == 0) goto L19
            int r1 = r4.length()     // Catch: java.lang.Throwable -> L19
            if (r1 != 0) goto L12
            goto L19
        L12:
            java.lang.ClassLoader r1 = r3.classLoader     // Catch: java.lang.Throwable -> L19
            java.lang.Class r4 = h.Hchat.utils.KavaReflector.loadClass(r4, r1)     // Catch: java.lang.Throwable -> L19
            return r4
        L19:
            return r0
    }

    private java.util.List<java.lang.Class<?>> loadClassList(java.lang.String r6) {
            r5 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            android.content.SharedPreferences r1 = r5.cachePrefs     // Catch: java.lang.Throwable -> L3f
            java.lang.String r2 = ""
            java.lang.String r6 = r1.getString(r6, r2)     // Catch: java.lang.Throwable -> L3f
            if (r6 == 0) goto L3f
            int r1 = r6.length()     // Catch: java.lang.Throwable -> L3f
            if (r1 != 0) goto L16
            goto L3f
        L16:
            java.lang.String r1 = ","
            java.lang.String[] r6 = r6.split(r1)     // Catch: java.lang.Throwable -> L3f
            int r1 = r6.length     // Catch: java.lang.Throwable -> L3f
            r2 = 0
        L1e:
            if (r2 >= r1) goto L3f
            r3 = r6[r2]     // Catch: java.lang.Throwable -> L3f
            java.lang.String r3 = r3.trim()     // Catch: java.lang.Throwable -> L3f
            int r4 = r3.length()     // Catch: java.lang.Throwable -> L3f
            if (r4 != 0) goto L2d
            goto L3c
        L2d:
            java.lang.ClassLoader r4 = r5.classLoader     // Catch: java.lang.Throwable -> L3c
            java.lang.Class r3 = h.Hchat.utils.KavaReflector.loadClass(r3, r4)     // Catch: java.lang.Throwable -> L3c
            boolean r4 = r0.contains(r3)     // Catch: java.lang.Throwable -> L3c
            if (r4 != 0) goto L3c
            r0.add(r3)     // Catch: java.lang.Throwable -> L3c
        L3c:
            int r2 = r2 + 1
            goto L1e
        L3f:
            return r0
    }

    private java.lang.reflect.Method loadMethod(java.lang.String r8) {
            r7 = this;
            r0 = 0
            android.content.SharedPreferences r1 = r7.cachePrefs     // Catch: java.lang.Throwable -> L4b
            java.lang.String r2 = ""
            java.lang.String r8 = r1.getString(r8, r2)     // Catch: java.lang.Throwable -> L4b
            if (r8 == 0) goto L4b
            int r1 = r8.length()     // Catch: java.lang.Throwable -> L4b
            if (r1 != 0) goto L12
            goto L4b
        L12:
            r1 = 35
            int r1 = r8.indexOf(r1)     // Catch: java.lang.Throwable -> L4b
            int r2 = r1 + 1
            r3 = 40
            int r3 = r8.indexOf(r3, r2)     // Catch: java.lang.Throwable -> L4b
            int r4 = r3 + 1
            r5 = 41
            int r5 = r8.indexOf(r5, r4)     // Catch: java.lang.Throwable -> L4b
            if (r1 <= 0) goto L4b
            if (r3 <= r1) goto L4b
            if (r5 >= r3) goto L2f
            goto L4b
        L2f:
            r6 = 0
            java.lang.String r1 = r8.substring(r6, r1)     // Catch: java.lang.Throwable -> L4b
            java.lang.ClassLoader r6 = r7.classLoader     // Catch: java.lang.Throwable -> L4b
            java.lang.Class r1 = h.Hchat.utils.KavaReflector.loadClass(r1, r6)     // Catch: java.lang.Throwable -> L4b
            java.lang.String r2 = r8.substring(r2, r3)     // Catch: java.lang.Throwable -> L4b
            java.lang.String r8 = r8.substring(r4, r5)     // Catch: java.lang.Throwable -> L4b
            java.lang.Class[] r8 = r7.parseParamTypes(r8)     // Catch: java.lang.Throwable -> L4b
            java.lang.reflect.Method r8 = h.Hchat.utils.KavaReflector.findDeclaredMethod(r1, r2, r8)     // Catch: java.lang.Throwable -> L4b
            return r8
        L4b:
            return r0
    }

    private java.util.List<java.lang.reflect.Method> loadMethodList(java.lang.String r6) {
            r5 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            android.content.SharedPreferences r1 = r5.cachePrefs     // Catch: java.lang.Throwable -> L38
            java.lang.String r2 = ""
            java.lang.String r6 = r1.getString(r6, r2)     // Catch: java.lang.Throwable -> L38
            if (r6 == 0) goto L38
            int r1 = r6.length()     // Catch: java.lang.Throwable -> L38
            if (r1 != 0) goto L16
            goto L38
        L16:
            java.lang.String r1 = "\\n"
            java.lang.String[] r6 = r6.split(r1)     // Catch: java.lang.Throwable -> L38
            int r1 = r6.length     // Catch: java.lang.Throwable -> L38
            r2 = 0
        L1e:
            if (r2 >= r1) goto L38
            r3 = r6[r2]     // Catch: java.lang.Throwable -> L38
            java.lang.String r3 = r3.trim()     // Catch: java.lang.Throwable -> L38
            java.lang.reflect.Method r3 = r5.loadMethodSpec(r3)     // Catch: java.lang.Throwable -> L38
            if (r3 == 0) goto L35
            boolean r4 = r0.contains(r3)     // Catch: java.lang.Throwable -> L38
            if (r4 != 0) goto L35
            r0.add(r3)     // Catch: java.lang.Throwable -> L38
        L35:
            int r2 = r2 + 1
            goto L1e
        L38:
            return r0
    }

    private java.lang.reflect.Method loadMethodSpec(java.lang.String r8) {
            r7 = this;
            r0 = 0
            if (r8 == 0) goto L43
            int r1 = r8.length()     // Catch: java.lang.Throwable -> L43
            if (r1 != 0) goto La
            goto L43
        La:
            r1 = 35
            int r1 = r8.indexOf(r1)     // Catch: java.lang.Throwable -> L43
            int r2 = r1 + 1
            r3 = 40
            int r3 = r8.indexOf(r3, r2)     // Catch: java.lang.Throwable -> L43
            int r4 = r3 + 1
            r5 = 41
            int r5 = r8.indexOf(r5, r4)     // Catch: java.lang.Throwable -> L43
            if (r1 <= 0) goto L43
            if (r3 <= r1) goto L43
            if (r5 >= r3) goto L27
            goto L43
        L27:
            r6 = 0
            java.lang.String r1 = r8.substring(r6, r1)     // Catch: java.lang.Throwable -> L43
            java.lang.ClassLoader r6 = r7.classLoader     // Catch: java.lang.Throwable -> L43
            java.lang.Class r1 = h.Hchat.utils.KavaReflector.loadClass(r1, r6)     // Catch: java.lang.Throwable -> L43
            java.lang.String r2 = r8.substring(r2, r3)     // Catch: java.lang.Throwable -> L43
            java.lang.String r8 = r8.substring(r4, r5)     // Catch: java.lang.Throwable -> L43
            java.lang.Class[] r8 = r7.parseParamTypes(r8)     // Catch: java.lang.Throwable -> L43
            java.lang.reflect.Method r8 = h.Hchat.utils.KavaReflector.findDeclaredMethod(r1, r2, r8)     // Catch: java.lang.Throwable -> L43
            return r8
        L43:
            return r0
    }

    private void logDetail(java.lang.String r1) {
            r0 = this;
            return
    }

    private void logMissingCritical() {
            r2 = this;
            java.util.List<java.lang.Class<?>> r0 = r2.addMsgClasses
            if (r0 == 0) goto La
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto Lf
        La:
            java.lang.String r0 = "[Hchat:DexFinder] AddMsg类未找到"
            fb.v0.m(r0)
        Lf:
            java.lang.Class<?> r0 = r2.receiveLuckyMoneyClass
            if (r0 != 0) goto L18
            java.lang.String r0 = "[Hchat:DexFinder] 收红包类未找到"
            fb.v0.m(r0)
        L18:
            java.lang.Class<?> r0 = r2.openLuckyMoneyClass
            if (r0 != 0) goto L21
            java.lang.String r0 = "[Hchat:DexFinder] 拆红包类未找到"
            fb.v0.m(r0)
        L21:
            java.lang.Class<?> r0 = r2.netQueueClass
            if (r0 != 0) goto L2a
            java.lang.String r0 = "[Hchat:DexFinder] 网络队列类未找到"
            fb.v0.m(r0)
        L2a:
            java.lang.Class<?> r0 = r2.sendTextMsgClass
            if (r0 != 0) goto L33
            java.lang.String r0 = "[Hchat:DexFinder] 文本发送类未找到"
            fb.v0.m(r0)
        L33:
            java.lang.Class<?> r0 = r2.sqliteDbWrapperClass
            if (r0 != 0) goto L3c
            java.lang.String r0 = "[Hchat:DexFinder] 数据库wrapper未找到"
            fb.v0.m(r0)
        L3c:
            java.lang.reflect.Method r0 = r2.chatPageStartMethod
            if (r0 == 0) goto L4a
            java.lang.reflect.Method r0 = r2.chatPageFragmentEnterMethod
            if (r0 == 0) goto L4a
            java.lang.reflect.Method r0 = r2.chatPageFragmentExitMethod
            if (r0 != 0) goto L49
            goto L4a
        L49:
            return
        L4a:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "[Hchat:DexFinder] 聊天页API方法未找到: start="
            r0.<init>(r1)
            java.lang.reflect.Method r1 = r2.chatPageStartMethod
            java.lang.String r1 = r2.methodName(r1)
            r0.append(r1)
            java.lang.String r1 = " fragmentEnter="
            r0.append(r1)
            java.lang.reflect.Method r1 = r2.chatPageFragmentEnterMethod
            java.lang.String r1 = r2.methodName(r1)
            r0.append(r1)
            java.lang.String r1 = " fragmentExit="
            r0.append(r1)
            java.lang.reflect.Method r1 = r2.chatPageFragmentExitMethod
            java.lang.String r1 = r2.methodName(r1)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            fb.v0.m(r0)
            return
    }

    private boolean looksLikeAttachDir(java.lang.reflect.Method r4) {
            r3 = this;
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]     // Catch: java.lang.Throwable -> L2f
            r2 = 0
            java.lang.Object r4 = h.Hchat.utils.KavaReflector.invoke(r4, r2, r1)     // Catch: java.lang.Throwable -> L2f
            boolean r1 = r4 instanceof java.lang.String     // Catch: java.lang.Throwable -> L2f
            if (r1 != 0) goto Ld
            return r0
        Ld:
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Throwable -> L2f
            java.lang.String r4 = r4.toLowerCase()     // Catch: java.lang.Throwable -> L2f
            java.lang.String r1 = "attachment"
            boolean r1 = r4.contains(r1)     // Catch: java.lang.Throwable -> L2f
            if (r1 != 0) goto L2d
            java.lang.String r1 = "appattach"
            boolean r1 = r4.contains(r1)     // Catch: java.lang.Throwable -> L2f
            if (r1 != 0) goto L2d
            java.lang.String r1 = "app_attach"
            boolean r4 = r4.contains(r1)     // Catch: java.lang.Throwable -> L2f
            if (r4 == 0) goto L2c
            goto L2d
        L2c:
            return r0
        L2d:
            r4 = 1
            return r4
        L2f:
            return r0
    }

    private java.lang.String methodName(java.lang.reflect.Method r3) {
            r2 = this;
            if (r3 != 0) goto L5
            java.lang.String r3 = "null"
            return r3
        L5:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.Class r1 = r3.getDeclaringClass()
            java.lang.String r1 = r1.getName()
            r0.append(r1)
            java.lang.String r1 = "#"
            r0.append(r1)
            java.lang.String r3 = r3.getName()
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            return r3
    }

    private java.lang.String methodSpec(java.lang.reflect.Method r4) {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.Class r1 = r4.getDeclaringClass()
            java.lang.String r1 = r1.getName()
            r0.append(r1)
            r1 = 35
            r0.append(r1)
            java.lang.String r1 = r4.getName()
            r0.append(r1)
            r1 = 40
            r0.append(r1)
            java.lang.Class[] r4 = r4.getParameterTypes()
            r1 = 0
        L26:
            int r2 = r4.length
            if (r1 >= r2) goto L3c
            if (r1 <= 0) goto L30
            r2 = 44
            r0.append(r2)
        L30:
            r2 = r4[r1]
            java.lang.String r2 = r2.getName()
            r0.append(r2)
            int r1 = r1 + 1
            goto L26
        L3c:
            r4 = 41
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            return r4
    }

    private ch.c mkClassByName(java.lang.String r4) {
            r3 = this;
            ch.c r0 = new ch.c
            r0.<init>()
            fh.a r1 = new fh.a
            r1.<init>()
            r4.getClass()
            r2 = 5
            r1.m0(r2, r4)
            r0.f1664h = r1
            return r0
    }

    private ch.c mkClassUsingStrings(java.lang.String... r3) {
            r2 = this;
            ch.c r0 = new ch.c
            r0.<init>()
            fh.a r1 = new fh.a
            r1.<init>()
            java.util.List r3 = java.util.Arrays.asList(r3)
            r3.getClass()
            fh.a.r0(r1, r3)
            r0.f1664h = r1
            return r0
    }

    private ch.e mkMethodUsingStrings(java.lang.String... r3) {
            r2 = this;
            ch.e r0 = new ch.e
            r0.<init>()
            fh.k r1 = new fh.k
            r1.<init>()
            java.util.List r3 = java.util.Arrays.asList(r3)
            r1.t0(r3)
            r0.f1666h = r1
            return r0
    }

    private ch.e mkMethodUsingStringsAndName(java.lang.String r5, java.lang.String... r6) {
            r4 = this;
            ch.e r0 = new ch.e
            r0.<init>()
            fh.k r1 = new fh.k
            r1.<init>()
            r5.getClass()
            gh.c r2 = new gh.c
            r3 = 5
            r2.<init>(r5, r3)
            r1.f3950g = r2
            java.util.List r5 = java.util.Arrays.asList(r6)
            r1.t0(r5)
            r0.f1666h = r1
            return r0
    }

    private java.lang.Object newTransferProbe(java.lang.Class<?> r9) {
            r8 = this;
            r0 = 0
            if (r9 != 0) goto L4
            return r0
        L4:
            java.util.List r9 = h.Hchat.utils.KavaReflector.declaredConstructors(r9)
            java.util.Iterator r9 = r9.iterator()
        Lc:
            boolean r1 = r9.hasNext()
            if (r1 == 0) goto L85
            java.lang.Object r1 = r9.next()
            java.lang.reflect.Constructor r1 = (java.lang.reflect.Constructor) r1
            java.lang.Class[] r2 = r1.getParameterTypes()     // Catch: java.lang.Throwable -> Lc
            int r3 = r2.length     // Catch: java.lang.Throwable -> Lc
            r4 = 9
            if (r3 == r4) goto L36
            int r3 = r2.length     // Catch: java.lang.Throwable -> Lc
            r4 = 10
            if (r3 == r4) goto L36
            int r3 = r2.length     // Catch: java.lang.Throwable -> Lc
            r4 = 12
            if (r3 == r4) goto L36
            int r3 = r2.length     // Catch: java.lang.Throwable -> Lc
            r4 = 13
            if (r3 == r4) goto L36
            int r3 = r2.length     // Catch: java.lang.Throwable -> Lc
            r4 = 14
            if (r3 == r4) goto L36
            goto Lc
        L36:
            int r3 = r2.length     // Catch: java.lang.Throwable -> Lc
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> Lc
            r4 = 0
            r5 = r4
        L3b:
            int r6 = r2.length     // Catch: java.lang.Throwable -> Lc
            if (r5 >= r6) goto L7b
            r6 = r2[r5]     // Catch: java.lang.Throwable -> Lc
            java.lang.Class<java.lang.String> r7 = java.lang.String.class
            if (r6 != r7) goto L49
            java.lang.String r6 = ""
            r3[r5] = r6     // Catch: java.lang.Throwable -> Lc
            goto L78
        L49:
            java.lang.Class r7 = java.lang.Integer.TYPE     // Catch: java.lang.Throwable -> Lc
            if (r6 == r7) goto L72
            java.lang.Class<java.lang.Integer> r7 = java.lang.Integer.class
            if (r6 != r7) goto L52
            goto L72
        L52:
            java.lang.Class r7 = java.lang.Long.TYPE     // Catch: java.lang.Throwable -> Lc
            if (r6 == r7) goto L69
            java.lang.Class<java.lang.Long> r7 = java.lang.Long.class
            if (r6 != r7) goto L5b
            goto L69
        L5b:
            java.lang.Class<java.util.Map> r7 = java.util.Map.class
            boolean r6 = r7.isAssignableFrom(r6)     // Catch: java.lang.Throwable -> Lc
            if (r6 == 0) goto L66
            r3[r5] = r0     // Catch: java.lang.Throwable -> Lc
            goto L78
        L66:
            r3[r5] = r0     // Catch: java.lang.Throwable -> Lc
            goto L78
        L69:
            r6 = 0
            java.lang.Long r6 = java.lang.Long.valueOf(r6)     // Catch: java.lang.Throwable -> Lc
            r3[r5] = r6     // Catch: java.lang.Throwable -> Lc
            goto L78
        L72:
            java.lang.Integer r6 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.Throwable -> Lc
            r3[r5] = r6     // Catch: java.lang.Throwable -> Lc
        L78:
            int r5 = r5 + 1
            goto L3b
        L7b:
            java.lang.String r2 = "confirm"
            r4 = 3
            r3[r4] = r2     // Catch: java.lang.Throwable -> Lc
            java.lang.Object r9 = h.Hchat.utils.KavaReflector.newInstance(r1, r3)     // Catch: java.lang.Throwable -> Lc
            return r9
        L85:
            return r0
    }

    private java.lang.Class<?>[] parseParamTypes(java.lang.String r4) {
            r3 = this;
            r0 = 0
            if (r4 == 0) goto L26
            int r1 = r4.length()
            if (r1 != 0) goto La
            goto L26
        La:
            java.lang.String r1 = ","
            java.lang.String[] r4 = r4.split(r1)
            int r1 = r4.length
            java.lang.Class[] r1 = new java.lang.Class[r1]
        L13:
            int r2 = r4.length
            if (r0 >= r2) goto L25
            r2 = r4[r0]
            java.lang.String r2 = r2.trim()
            java.lang.Class r2 = r3.typeOf(r2)
            r1[r0] = r2
            int r0 = r0 + 1
            goto L13
        L25:
            return r1
        L26:
            java.lang.Class[] r4 = new java.lang.Class[r0]
            return r4
    }

    private void putClass(android.content.SharedPreferences.Editor r1, java.lang.String r2, java.lang.Class<?> r3) {
            r0 = this;
            if (r3 == 0) goto L7
            java.lang.String r3 = r3.getName()
            goto L9
        L7:
            java.lang.String r3 = ""
        L9:
            r1.putString(r2, r3)
            return
    }

    private void putMethod(android.content.SharedPreferences.Editor r1, java.lang.String r2, java.lang.reflect.Method r3) {
            r0 = this;
            if (r3 == 0) goto L7
            java.lang.String r3 = r0.methodSpec(r3)
            goto L9
        L7:
            java.lang.String r3 = ""
        L9:
            r1.putString(r2, r3)
            return
    }

    private void putMethodList(android.content.SharedPreferences.Editor r4, java.lang.String r5, java.util.List<java.lang.reflect.Method> r6) {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            if (r6 == 0) goto L2d
            java.util.Iterator r6 = r6.iterator()
        Lb:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L2d
            java.lang.Object r1 = r6.next()
            java.lang.reflect.Method r1 = (java.lang.reflect.Method) r1
            if (r1 != 0) goto L1a
            goto Lb
        L1a:
            int r2 = r0.length()
            if (r2 <= 0) goto L25
            r2 = 10
            r0.append(r2)
        L25:
            java.lang.String r1 = r3.methodSpec(r1)
            r0.append(r1)
            goto Lb
        L2d:
            java.lang.String r6 = r0.toString()
            r4.putString(r5, r6)
            return
    }

    private void resetCacheForRuntimeKey() {
            r3 = this;
            android.content.SharedPreferences r0 = r3.cachePrefs     // Catch: java.lang.Throwable -> L15
            android.content.SharedPreferences$Editor r0 = r0.edit()     // Catch: java.lang.Throwable -> L15
            android.content.SharedPreferences$Editor r0 = r0.clear()     // Catch: java.lang.Throwable -> L15
            java.lang.String r1 = "cache.key"
            java.lang.String r2 = r3.runtimeCacheKey     // Catch: java.lang.Throwable -> L15
            android.content.SharedPreferences$Editor r0 = r0.putString(r1, r2)     // Catch: java.lang.Throwable -> L15
            r0.commit()     // Catch: java.lang.Throwable -> L15
        L15:
            return
    }

    private void resolveAddMsgClasses() {
            r3 = this;
            java.lang.String r0 = "AddMsg类: "
            org.luckypray.dexkit.DexKitBridge r1 = r3.dexKit     // Catch: java.lang.Throwable -> L35
            java.lang.String r2 = "dkAddMsg"
            java.lang.String[] r2 = new java.lang.String[]{r2}     // Catch: java.lang.Throwable -> L35
            ch.e r2 = r3.mkMethodUsingStrings(r2)     // Catch: java.lang.Throwable -> L35
            hh.p r1 = r1.findMethod(r2)     // Catch: java.lang.Throwable -> L35
            java.util.List<java.lang.Class<?>> r2 = r3.addMsgClasses     // Catch: java.lang.Throwable -> L35
            r3.collectMethodOwnerClass(r1, r2)     // Catch: java.lang.Throwable -> L35
            java.util.List<java.lang.Class<?>> r1 = r3.addMsgClasses     // Catch: java.lang.Throwable -> L35
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L35
            if (r1 == 0) goto L37
            org.luckypray.dexkit.DexKitBridge r1 = r3.dexKit     // Catch: java.lang.Throwable -> L35
            java.lang.String r2 = "processAddMsg"
            java.lang.String[] r2 = new java.lang.String[]{r2}     // Catch: java.lang.Throwable -> L35
            ch.e r2 = r3.mkMethodUsingStrings(r2)     // Catch: java.lang.Throwable -> L35
            hh.p r1 = r1.findMethod(r2)     // Catch: java.lang.Throwable -> L35
            java.util.List<java.lang.Class<?>> r2 = r3.addMsgClasses     // Catch: java.lang.Throwable -> L35
            r3.collectMethodOwnerClass(r1, r2)     // Catch: java.lang.Throwable -> L35
            goto L37
        L35:
            r0 = move-exception
            goto L4d
        L37:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L35
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L35
            java.util.List<java.lang.Class<?>> r0 = r3.addMsgClasses     // Catch: java.lang.Throwable -> L35
            int r0 = r0.size()     // Catch: java.lang.Throwable -> L35
            r1.append(r0)     // Catch: java.lang.Throwable -> L35
            java.lang.String r0 = r1.toString()     // Catch: java.lang.Throwable -> L35
            r3.logDetail(r0)     // Catch: java.lang.Throwable -> L35
            return
        L4d:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "[Hchat:DexFinder] resolveAddMsg 失败: "
            r1.<init>(r2)
            bc.e.s(r0, r1, r0)
            return
    }

    private void resolveAppMsgParseMethod(java.lang.Class<?> r4) {
            r3 = this;
            if (r4 != 0) goto L3
            goto L2c
        L3:
            java.lang.reflect.Method r0 = r3.appMsgParseMethod
            boolean r0 = r3.isAppMsgParseMethod(r0, r4)
            if (r0 == 0) goto Lc
            goto L2c
        Lc:
            java.util.List r0 = h.Hchat.utils.KavaReflector.declaredMethods(r4)     // Catch: java.lang.Throwable -> L2c
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L2c
        L14:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L2c
            if (r1 == 0) goto L2c
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L2c
            java.lang.reflect.Method r1 = (java.lang.reflect.Method) r1     // Catch: java.lang.Throwable -> L2c
            boolean r2 = r3.isAppMsgParseMethod(r1, r4)     // Catch: java.lang.Throwable -> L2c
            if (r2 != 0) goto L27
            goto L14
        L27:
            h.Hchat.utils.KavaReflector.accessible(r1)     // Catch: java.lang.Throwable -> L2c
            r3.appMsgParseMethod = r1     // Catch: java.lang.Throwable -> L2c
        L2c:
            return
    }

    private void resolveChatroomMuteApi() {
            r11 = this;
            r0 = 0
            r11.chatroomMuteServiceGetterMethod = r0
            r11.chatroomMuteBuildMethod = r0
            r11.chatroomMuteSubmitMethod = r0
            org.luckypray.dexkit.DexKitBridge r1 = r11.dexKit
            java.lang.String r2 = "ChatroomMuteRefine OpModChatRoomNotify roomId = %s, notifyMsg = %d, defaultNeedPushFlag=%d"
            java.lang.String[] r2 = new java.lang.String[]{r2}
            ch.e r2 = r11.mkMethodUsingStrings(r2)
            hh.p r1 = r1.findMethod(r2)
            boolean r2 = r1.isEmpty()
            if (r2 == 0) goto L2d
            org.luckypray.dexkit.DexKitBridge r1 = r11.dexKit
            java.lang.String r2 = "room_notify_new_msg"
            java.lang.String[] r2 = new java.lang.String[]{r2}
            ch.e r2 = r11.mkMethodUsingStrings(r2)
            hh.p r1 = r1.findMethod(r2)
        L2d:
            java.util.Iterator r2 = r1.iterator()
        L31:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto Lb3
            java.lang.Object r3 = r2.next()
            hh.o r3 = (hh.o) r3
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            hh.p r3 = r3.q()
            java.util.Iterator r3 = r3.iterator()
        L4a:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L66
            java.lang.Object r5 = r3.next()
            hh.o r5 = (hh.o) r5
            java.lang.ClassLoader r6 = r11.classLoader     // Catch: java.lang.Throwable -> L4a
            java.lang.reflect.Method r5 = r5.r(r6)     // Catch: java.lang.Throwable -> L4a
            boolean r6 = r4.contains(r5)     // Catch: java.lang.Throwable -> L4a
            if (r6 != 0) goto L4a
            r4.add(r5)     // Catch: java.lang.Throwable -> L4a
            goto L4a
        L66:
            java.util.Iterator r3 = r4.iterator()
        L6a:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L31
            java.lang.Object r5 = r3.next()
            java.lang.reflect.Method r5 = (java.lang.reflect.Method) r5
            boolean r6 = r11.isChatroomMuteBuildMethod(r5)
            if (r6 != 0) goto L7d
            goto L6a
        L7d:
            java.util.Iterator r6 = r4.iterator()
            r7 = r0
            r8 = r7
        L83:
            boolean r9 = r6.hasNext()
            if (r9 == 0) goto L9e
            java.lang.Object r9 = r6.next()
            java.lang.reflect.Method r9 = (java.lang.reflect.Method) r9
            boolean r10 = r11.isChatroomMuteServiceGetterMethod(r9, r5)
            if (r10 == 0) goto L96
            r7 = r9
        L96:
            boolean r10 = r11.isChatroomMuteSubmitMethod(r9, r5)
            if (r10 == 0) goto L83
            r8 = r9
            goto L83
        L9e:
            if (r7 == 0) goto L6a
            if (r8 != 0) goto La3
            goto L6a
        La3:
            h.Hchat.utils.KavaReflector.accessible(r7)
            h.Hchat.utils.KavaReflector.accessible(r5)
            h.Hchat.utils.KavaReflector.accessible(r8)
            r11.chatroomMuteServiceGetterMethod = r7
            r11.chatroomMuteBuildMethod = r5
            r11.chatroomMuteSubmitMethod = r8
            return
        Lb3:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "[Hchat:DexFinder] 原生群聊免打扰API定位失败: entries="
            r0.<init>(r2)
            int r1 = r1.size()
            r0.append(r1)
            java.lang.String r1 = " key="
            r0.append(r1)
            java.lang.String r1 = r11.runtimeCacheKey
            java.lang.String r1 = r11.shortKey(r1)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            fb.v0.m(r0)
            return
    }

    private void resolveContactStorageLookupApi() {
            r9 = this;
            r0 = 0
            r9.contactStorageGetterMethod = r0
            r9.contactStorageQueryMethod = r0
            java.lang.reflect.Method r0 = r9.contactMuteEnableMethod
            boolean r1 = r9.isContactMuteMethod(r0)
            if (r1 != 0) goto Le
            return
        Le:
            java.lang.Class[] r1 = r0.getParameterTypes()
            r2 = 0
            r1 = r1[r2]
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            org.luckypray.dexkit.DexKitBridge r4 = r9.dexKit
            java.lang.String r5 = "setMute contact invalid username"
            java.lang.String[] r5 = new java.lang.String[]{r5}
            ch.e r5 = r9.mkMethodUsingStrings(r5)
            hh.p r4 = r4.findMethod(r5)
            java.util.Iterator r4 = r4.iterator()
        L2e:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L6b
            java.lang.Object r5 = r4.next()
            hh.o r5 = (hh.o) r5
            java.lang.ClassLoader r6 = r9.classLoader     // Catch: java.lang.Throwable -> L2e
            java.lang.reflect.Method r6 = r5.r(r6)     // Catch: java.lang.Throwable -> L2e
            boolean r6 = r0.equals(r6)     // Catch: java.lang.Throwable -> L2e
            if (r6 != 0) goto L47
            goto L2e
        L47:
            hh.p r5 = r5.q()     // Catch: java.lang.Throwable -> L2e
            java.util.Iterator r5 = r5.iterator()     // Catch: java.lang.Throwable -> L2e
        L4f:
            boolean r6 = r5.hasNext()     // Catch: java.lang.Throwable -> L2e
            if (r6 == 0) goto L2e
            java.lang.Object r6 = r5.next()     // Catch: java.lang.Throwable -> L2e
            hh.o r6 = (hh.o) r6     // Catch: java.lang.Throwable -> L2e
            java.lang.ClassLoader r7 = r9.classLoader     // Catch: java.lang.Throwable -> L2e
            java.lang.reflect.Method r6 = r6.r(r7)     // Catch: java.lang.Throwable -> L2e
            boolean r7 = r3.contains(r6)     // Catch: java.lang.Throwable -> L2e
            if (r7 != 0) goto L4f
            r3.add(r6)     // Catch: java.lang.Throwable -> L2e
            goto L4f
        L6b:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r4 = r3.iterator()
        L74:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto La6
            java.lang.Object r5 = r4.next()
            java.lang.reflect.Method r5 = (java.lang.reflect.Method) r5
            boolean r6 = r9.isContactStorageQueryMethod(r5, r1)
            if (r6 != 0) goto L87
            goto L74
        L87:
            java.util.Iterator r6 = r3.iterator()
        L8b:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L74
            java.lang.Object r7 = r6.next()
            java.lang.reflect.Method r7 = (java.lang.reflect.Method) r7
            boolean r8 = r9.isContactStorageGetterMethod(r7, r5)
            if (r8 != 0) goto L9e
            goto L8b
        L9e:
            java.lang.reflect.Method[] r7 = new java.lang.reflect.Method[]{r7, r5}
            r0.add(r7)
            goto L8b
        La6:
            int r1 = r0.size()
            r4 = 1
            if (r1 != r4) goto Lca
            java.lang.Object r1 = r0.get(r2)
            java.lang.reflect.Method[] r1 = (java.lang.reflect.Method[]) r1
            r1 = r1[r2]
            java.lang.reflect.Method r1 = h.Hchat.utils.KavaReflector.accessible(r1)
            r9.contactStorageGetterMethod = r1
            java.lang.Object r0 = r0.get(r2)
            java.lang.reflect.Method[] r0 = (java.lang.reflect.Method[]) r0
            r0 = r0[r4]
            java.lang.reflect.Method r0 = h.Hchat.utils.KavaReflector.accessible(r0)
            r9.contactStorageQueryMethod = r0
            return
        Lca:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "[Hchat:DexFinder] 原生联系人查询API定位失败: pairs="
            r1.<init>(r2)
            int r0 = r0.size()
            r1.append(r0)
            java.lang.String r0 = " invokes="
            r1.append(r0)
            int r0 = r3.size()
            r1.append(r0)
            java.lang.String r0 = " key="
            r1.append(r0)
            java.lang.String r0 = r9.runtimeCacheKey
            java.lang.String r0 = r9.shortKey(r0)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            fb.v0.m(r0)
            return
    }

    private void resolveFavoriteItemApi() {
            r3 = this;
            java.lang.Class<?> r0 = r3.favoriteItemClass     // Catch: java.lang.Throwable -> L14
            boolean r0 = r3.isFavoriteItemClass(r0)     // Catch: java.lang.Throwable -> L14
            if (r0 == 0) goto L17
            java.lang.Class<?> r0 = r3.favoriteItemClass     // Catch: java.lang.Throwable -> L14
            java.lang.reflect.Method r0 = r3.findFavoriteItemConvertFromCursorMethod(r0)     // Catch: java.lang.Throwable -> L14
            r3.favoriteItemConvertFromCursorMethod = r0     // Catch: java.lang.Throwable -> L14
            if (r0 == 0) goto L17
            goto L8f
        L14:
            r0 = move-exception
            goto L90
        L17:
            r0 = 0
            r3.favoriteItemClass = r0     // Catch: java.lang.Throwable -> L14
            r3.favoriteItemConvertFromCursorMethod = r0     // Catch: java.lang.Throwable -> L14
            org.luckypray.dexkit.DexKitBridge r0 = r3.dexKit     // Catch: java.lang.Throwable -> L14
            java.lang.String r1 = "FavItemInfo"
            java.lang.String[] r1 = new java.lang.String[]{r1}     // Catch: java.lang.Throwable -> L14
            ch.c r1 = r3.mkClassUsingStrings(r1)     // Catch: java.lang.Throwable -> L14
            hh.j r0 = r0.findClass(r1)     // Catch: java.lang.Throwable -> L14
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L14
        L30:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L14
            if (r1 == 0) goto L5a
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L14
            hh.i r1 = (hh.i) r1     // Catch: java.lang.Throwable -> L14
            lh.a r1 = r1.p()     // Catch: java.lang.Throwable -> L14
            java.lang.String r1 = r1.f8057g     // Catch: java.lang.Throwable -> L14
            java.lang.ClassLoader r2 = r3.classLoader     // Catch: java.lang.Throwable -> L14
            java.lang.Class r1 = h.Hchat.utils.KavaReflector.loadClass(r1, r2)     // Catch: java.lang.Throwable -> L14
            boolean r2 = r3.isFavoriteItemClass(r1)     // Catch: java.lang.Throwable -> L14
            if (r2 != 0) goto L4f
            goto L30
        L4f:
            r3.favoriteItemClass = r1     // Catch: java.lang.Throwable -> L14
            java.lang.reflect.Method r1 = r3.findFavoriteItemConvertFromCursorMethod(r1)     // Catch: java.lang.Throwable -> L14
            r3.favoriteItemConvertFromCursorMethod = r1     // Catch: java.lang.Throwable -> L14
            if (r1 == 0) goto L30
            goto L8f
        L5a:
            org.luckypray.dexkit.DexKitBridge r0 = r3.dexKit     // Catch: java.lang.Throwable -> L14
            java.lang.String r1 = "sendFavMsg: processing favId=%d, favType=%d, dataListSize=%d"
            java.lang.String[] r1 = new java.lang.String[]{r1}     // Catch: java.lang.Throwable -> L14
            ch.e r1 = r3.mkMethodUsingStrings(r1)     // Catch: java.lang.Throwable -> L14
            hh.p r0 = r0.findMethod(r1)     // Catch: java.lang.Throwable -> L14
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L14
        L6e:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L14
            if (r1 == 0) goto L8f
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L14
            hh.o r1 = (hh.o) r1     // Catch: java.lang.Throwable -> L14
            java.lang.Class r1 = r3.favoriteItemClassFromUsingFields(r1)     // Catch: java.lang.Throwable -> L14
            boolean r2 = r3.isFavoriteItemClass(r1)     // Catch: java.lang.Throwable -> L14
            if (r2 != 0) goto L85
            goto L6e
        L85:
            r3.favoriteItemClass = r1     // Catch: java.lang.Throwable -> L14
            java.lang.reflect.Method r1 = r3.findFavoriteItemConvertFromCursorMethod(r1)     // Catch: java.lang.Throwable -> L14
            r3.favoriteItemConvertFromCursorMethod = r1     // Catch: java.lang.Throwable -> L14
            if (r1 == 0) goto L6e
        L8f:
            return
        L90:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "[Hchat:DexFinder] resolveFavoriteItemApi 失败: "
            r1.<init>(r2)
            bc.e.s(r0, r1, r0)
            return
    }

    private void resolveFavoriteListApi() {
            r10 = this;
            java.lang.Class<?> r0 = r10.favoriteServiceClass     // Catch: java.lang.Throwable -> L36
            if (r0 == 0) goto L39
            java.lang.reflect.Method r0 = r10.favoriteServiceResolverMethod     // Catch: java.lang.Throwable -> L36
            boolean r0 = r10.isFavoriteServiceResolverMethod(r0)     // Catch: java.lang.Throwable -> L36
            if (r0 == 0) goto L39
            java.lang.reflect.Method r0 = r10.favoriteStorageGetterMethod     // Catch: java.lang.Throwable -> L36
            boolean r0 = r10.isFavoriteStorageGetterMethod(r0)     // Catch: java.lang.Throwable -> L36
            if (r0 == 0) goto L39
            java.lang.reflect.Method r0 = r10.favoriteListMethod     // Catch: java.lang.Throwable -> L36
            boolean r0 = r10.isFavoriteListMethod(r0)     // Catch: java.lang.Throwable -> L36
            if (r0 == 0) goto L39
            java.lang.reflect.Method r0 = r10.favoriteListNextMethod     // Catch: java.lang.Throwable -> L36
            boolean r0 = r10.isFavoriteListNextMethod(r0)     // Catch: java.lang.Throwable -> L36
            if (r0 == 0) goto L39
            java.lang.reflect.Method r0 = r10.favoriteListCursorMethod     // Catch: java.lang.Throwable -> L36
            boolean r0 = r10.isFavoriteListCursorMethod(r0)     // Catch: java.lang.Throwable -> L36
            if (r0 == 0) goto L39
            java.lang.reflect.Method r0 = r10.favoriteGetMethod     // Catch: java.lang.Throwable -> L36
            boolean r0 = r10.isFavoriteGetMethod(r0)     // Catch: java.lang.Throwable -> L36
            if (r0 == 0) goto L39
            goto L118
        L36:
            r0 = move-exception
            goto L10e
        L39:
            r0 = 0
            r10.favoriteServiceClass = r0     // Catch: java.lang.Throwable -> L36
            r10.favoriteServiceResolverMethod = r0     // Catch: java.lang.Throwable -> L36
            r10.favoriteStorageGetterMethod = r0     // Catch: java.lang.Throwable -> L36
            r10.favoriteListMethod = r0     // Catch: java.lang.Throwable -> L36
            r10.favoriteListNextMethod = r0     // Catch: java.lang.Throwable -> L36
            r10.favoriteListCursorMethod = r0     // Catch: java.lang.Throwable -> L36
            r10.favoriteGetMethod = r0     // Catch: java.lang.Throwable -> L36
            java.lang.reflect.Method r1 = r10.findFavoriteListCursorMethod()     // Catch: java.lang.Throwable -> L36
            org.luckypray.dexkit.DexKitBridge r2 = r10.dexKit     // Catch: java.lang.Throwable -> L36
            java.lang.String r3 = "getItemList error, getFavItemInfoStorage null."
            java.lang.String r4 = "MicroMsg.Fav.FavApiLogic"
            java.lang.String[] r3 = new java.lang.String[]{r3, r4}     // Catch: java.lang.Throwable -> L36
            ch.e r3 = r10.mkMethodUsingStrings(r3)     // Catch: java.lang.Throwable -> L36
            hh.p r2 = r2.findMethod(r3)     // Catch: java.lang.Throwable -> L36
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> L36
        L62:
            boolean r3 = r2.hasNext()     // Catch: java.lang.Throwable -> L36
            if (r3 == 0) goto L118
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Throwable -> L36
            hh.o r3 = (hh.o) r3     // Catch: java.lang.Throwable -> L36
            hh.p r4 = r3.q()     // Catch: java.lang.Throwable -> L36
            java.util.Iterator r4 = r4.iterator()     // Catch: java.lang.Throwable -> L36
            r5 = r0
            r6 = r5
            r7 = r6
        L79:
            boolean r8 = r4.hasNext()     // Catch: java.lang.Throwable -> L36
            if (r8 == 0) goto La1
            java.lang.Object r8 = r4.next()     // Catch: java.lang.Throwable -> L36
            hh.o r8 = (hh.o) r8     // Catch: java.lang.Throwable -> L36
            java.lang.ClassLoader r9 = r10.classLoader     // Catch: java.lang.Throwable -> L79
            java.lang.reflect.Method r8 = r8.r(r9)     // Catch: java.lang.Throwable -> L79
            boolean r9 = r10.isFavoriteServiceResolverMethod(r8)     // Catch: java.lang.Throwable -> L36
            if (r9 == 0) goto L92
            r6 = r8
        L92:
            boolean r9 = r10.isFavoriteListMethod(r8)     // Catch: java.lang.Throwable -> L36
            if (r9 == 0) goto L99
            r5 = r8
        L99:
            boolean r9 = r10.isFavoriteListNextMethod(r8)     // Catch: java.lang.Throwable -> L36
            if (r9 == 0) goto L79
            r7 = r8
            goto L79
        La1:
            if (r5 == 0) goto Ld4
            hh.p r3 = r3.q()     // Catch: java.lang.Throwable -> L36
            java.util.Iterator r3 = r3.iterator()     // Catch: java.lang.Throwable -> L36
        Lab:
            boolean r4 = r3.hasNext()     // Catch: java.lang.Throwable -> L36
            if (r4 == 0) goto Ld4
            java.lang.Object r4 = r3.next()     // Catch: java.lang.Throwable -> L36
            hh.o r4 = (hh.o) r4     // Catch: java.lang.Throwable -> L36
            java.lang.ClassLoader r8 = r10.classLoader     // Catch: java.lang.Throwable -> Lab
            java.lang.reflect.Method r4 = r4.r(r8)     // Catch: java.lang.Throwable -> Lab
            boolean r8 = r10.isFavoriteStorageGetterMethod(r4)     // Catch: java.lang.Throwable -> L36
            if (r8 != 0) goto Lc4
            goto Lab
        Lc4:
            java.lang.Class r8 = r4.getReturnType()     // Catch: java.lang.Throwable -> L36
            java.lang.Class r9 = r5.getDeclaringClass()     // Catch: java.lang.Throwable -> L36
            if (r8 == r9) goto Lcf
            goto Lab
        Lcf:
            java.lang.Class r3 = r4.getDeclaringClass()     // Catch: java.lang.Throwable -> L36
            goto Ld6
        Ld4:
            r3 = r0
            r4 = r3
        Ld6:
            if (r6 == 0) goto L62
            if (r4 == 0) goto L62
            if (r5 == 0) goto L62
            if (r7 == 0) goto L62
            if (r1 == 0) goto L62
            if (r3 != 0) goto Le4
            goto L62
        Le4:
            h.Hchat.utils.KavaReflector.accessible(r6)     // Catch: java.lang.Throwable -> L36
            h.Hchat.utils.KavaReflector.accessible(r4)     // Catch: java.lang.Throwable -> L36
            h.Hchat.utils.KavaReflector.accessible(r5)     // Catch: java.lang.Throwable -> L36
            h.Hchat.utils.KavaReflector.accessible(r7)     // Catch: java.lang.Throwable -> L36
            r10.favoriteServiceClass = r3     // Catch: java.lang.Throwable -> L36
            r10.favoriteServiceResolverMethod = r6     // Catch: java.lang.Throwable -> L36
            r10.favoriteStorageGetterMethod = r4     // Catch: java.lang.Throwable -> L36
            r10.favoriteListMethod = r5     // Catch: java.lang.Throwable -> L36
            r10.favoriteListNextMethod = r7     // Catch: java.lang.Throwable -> L36
            r10.favoriteListCursorMethod = r1     // Catch: java.lang.Throwable -> L36
            java.lang.Class r3 = r5.getDeclaringClass()     // Catch: java.lang.Throwable -> L36
            java.lang.reflect.Method r3 = r10.findFavoriteGetMethod(r3)     // Catch: java.lang.Throwable -> L36
            r10.favoriteGetMethod = r3     // Catch: java.lang.Throwable -> L36
            if (r3 != 0) goto L10a
            goto L62
        L10a:
            h.Hchat.utils.KavaReflector.accessible(r3)     // Catch: java.lang.Throwable -> L36
            goto L118
        L10e:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "[Hchat:DexFinder] resolveFavoriteListApi 失败: "
            r1.<init>(r2)
            bc.e.s(r0, r1, r0)
        L118:
            return
    }

    private void resolveFavoriteSendApi() {
            r6 = this;
            java.lang.reflect.Method r0 = r6.favoriteSendMethod     // Catch: java.lang.Throwable -> L1d
            boolean r0 = r6.isFavoriteSendMethod(r0)     // Catch: java.lang.Throwable -> L1d
            r1 = 1
            r2 = 3
            r3 = 0
            if (r0 == 0) goto L22
            java.lang.reflect.Method r0 = r6.favoriteSendMethod     // Catch: java.lang.Throwable -> L1d
            java.lang.Class[] r0 = r0.getParameterTypes()     // Catch: java.lang.Throwable -> L1d
            int r0 = r0.length     // Catch: java.lang.Throwable -> L1d
            if (r0 != r2) goto L1f
            java.lang.reflect.Method r0 = r6.favoriteSendMethod     // Catch: java.lang.Throwable -> L1d
            java.lang.Class[] r0 = r0.getParameterTypes()     // Catch: java.lang.Throwable -> L1d
            r3 = r0[r1]     // Catch: java.lang.Throwable -> L1d
            goto L1f
        L1d:
            r0 = move-exception
            goto L6a
        L1f:
            r6.favoriteSendParamClass = r3     // Catch: java.lang.Throwable -> L1d
            return
        L22:
            r6.favoriteSendMethod = r3     // Catch: java.lang.Throwable -> L1d
            r6.favoriteSendParamClass = r3     // Catch: java.lang.Throwable -> L1d
            org.luckypray.dexkit.DexKitBridge r0 = r6.dexKit     // Catch: java.lang.Throwable -> L1d
            java.lang.String r4 = "want to send fav msg, but context is null"
            java.lang.String r5 = "want to send fav msg, but info is null"
            java.lang.String[] r4 = new java.lang.String[]{r4, r5}     // Catch: java.lang.Throwable -> L1d
            ch.e r4 = r6.mkMethodUsingStrings(r4)     // Catch: java.lang.Throwable -> L1d
            hh.p r0 = r0.findMethod(r4)     // Catch: java.lang.Throwable -> L1d
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L1d
        L3c:
            boolean r4 = r0.hasNext()     // Catch: java.lang.Throwable -> L1d
            if (r4 == 0) goto L69
            java.lang.Object r4 = r0.next()     // Catch: java.lang.Throwable -> L1d
            hh.o r4 = (hh.o) r4     // Catch: java.lang.Throwable -> L1d
            java.lang.ClassLoader r5 = r6.classLoader     // Catch: java.lang.Throwable -> L1d
            java.lang.reflect.Method r4 = r4.r(r5)     // Catch: java.lang.Throwable -> L1d
            boolean r5 = r6.isFavoriteSendMethod(r4)     // Catch: java.lang.Throwable -> L1d
            if (r5 != 0) goto L55
            goto L3c
        L55:
            h.Hchat.utils.KavaReflector.accessible(r4)     // Catch: java.lang.Throwable -> L1d
            r6.favoriteSendMethod = r4     // Catch: java.lang.Throwable -> L1d
            java.lang.Class[] r0 = r4.getParameterTypes()     // Catch: java.lang.Throwable -> L1d
            int r0 = r0.length     // Catch: java.lang.Throwable -> L1d
            if (r0 != r2) goto L67
            java.lang.Class[] r0 = r4.getParameterTypes()     // Catch: java.lang.Throwable -> L1d
            r3 = r0[r1]     // Catch: java.lang.Throwable -> L1d
        L67:
            r6.favoriteSendParamClass = r3     // Catch: java.lang.Throwable -> L1d
        L69:
            return
        L6a:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "[Hchat:DexFinder] resolveFavoriteSendApi 失败: "
            r1.<init>(r2)
            bc.e.s(r0, r1, r0)
            return
    }

    private void resolveImageBestPathApi() {
            r4 = this;
            java.lang.reflect.Method r0 = r4.imageBestPathMethod     // Catch: java.lang.Throwable -> L3e
            boolean r0 = r4.isImageBestPathMethod(r0)     // Catch: java.lang.Throwable -> L3e
            r1 = 0
            if (r0 != 0) goto L41
            r4.imageBestPathMethod = r1     // Catch: java.lang.Throwable -> L3e
            org.luckypray.dexkit.DexKitBridge r0 = r4.dexKit     // Catch: java.lang.Throwable -> L3e
            java.lang.String r2 = "[getBigPicPath] msg is null."
            java.lang.String[] r2 = new java.lang.String[]{r2}     // Catch: java.lang.Throwable -> L3e
            ch.e r2 = r4.mkMethodUsingStrings(r2)     // Catch: java.lang.Throwable -> L3e
            hh.p r0 = r0.findMethod(r2)     // Catch: java.lang.Throwable -> L3e
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L3e
        L1f:
            boolean r2 = r0.hasNext()     // Catch: java.lang.Throwable -> L3e
            if (r2 == 0) goto L41
            java.lang.Object r2 = r0.next()     // Catch: java.lang.Throwable -> L3e
            hh.o r2 = (hh.o) r2     // Catch: java.lang.Throwable -> L3e
            java.lang.ClassLoader r3 = r4.classLoader     // Catch: java.lang.Throwable -> L1f
            java.lang.reflect.Method r2 = r2.r(r3)     // Catch: java.lang.Throwable -> L1f
            boolean r3 = r4.isImageBestPathMethod(r2)     // Catch: java.lang.Throwable -> L1f
            if (r3 != 0) goto L38
            goto L1f
        L38:
            h.Hchat.utils.KavaReflector.accessible(r2)     // Catch: java.lang.Throwable -> L1f
            r4.imageBestPathMethod = r2     // Catch: java.lang.Throwable -> L1f
            goto L41
        L3e:
            r0 = move-exception
            goto Ld1
        L41:
            java.lang.reflect.Method r0 = r4.imageBestPathMethod     // Catch: java.lang.Throwable -> L3e
            if (r0 == 0) goto L4a
            java.lang.Class r0 = r0.getDeclaringClass()     // Catch: java.lang.Throwable -> L3e
            goto L4b
        L4a:
            r0 = r1
        L4b:
            java.lang.reflect.Method r2 = r4.imageStorageGetterMethod     // Catch: java.lang.Throwable -> L3e
            boolean r2 = r4.isImageStorageGetter(r2, r0)     // Catch: java.lang.Throwable -> L3e
            if (r2 != 0) goto L59
            java.lang.reflect.Method r0 = r4.findImageStorageGetter(r0)     // Catch: java.lang.Throwable -> L3e
            r4.imageStorageGetterMethod = r0     // Catch: java.lang.Throwable -> L3e
        L59:
            java.lang.reflect.Method r0 = r4.imageTokenPathMethod     // Catch: java.lang.Throwable -> L3e
            boolean r0 = r4.isImageTokenPathMethod(r0)     // Catch: java.lang.Throwable -> L3e
            if (r0 != 0) goto L9a
            r4.imageTokenPathMethod = r1     // Catch: java.lang.Throwable -> L3e
            org.luckypray.dexkit.DexKitBridge r0 = r4.dexKit     // Catch: java.lang.Throwable -> L3e
            java.lang.String r1 = "THUMBNAIL://"
            java.lang.String r2 = "THUMBNAIL_DIRPATH://"
            java.lang.String r3 = "read img buf failed: "
            java.lang.String[] r1 = new java.lang.String[]{r1, r2, r3}     // Catch: java.lang.Throwable -> L3e
            ch.e r1 = r4.mkMethodUsingStrings(r1)     // Catch: java.lang.Throwable -> L3e
            hh.p r0 = r0.findMethod(r1)     // Catch: java.lang.Throwable -> L3e
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L3e
        L7b:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L3e
            if (r1 == 0) goto L9a
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L3e
            hh.o r1 = (hh.o) r1     // Catch: java.lang.Throwable -> L3e
            java.lang.ClassLoader r2 = r4.classLoader     // Catch: java.lang.Throwable -> L7b
            java.lang.reflect.Method r1 = r1.r(r2)     // Catch: java.lang.Throwable -> L7b
            boolean r2 = r4.isImageTokenPathMethod(r1)     // Catch: java.lang.Throwable -> L7b
            if (r2 != 0) goto L94
            goto L7b
        L94:
            java.lang.reflect.Method r1 = h.Hchat.utils.KavaReflector.accessible(r1)     // Catch: java.lang.Throwable -> L7b
            r4.imageTokenPathMethod = r1     // Catch: java.lang.Throwable -> L7b
        L9a:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L3e
            r0.<init>()     // Catch: java.lang.Throwable -> L3e
            java.lang.String r1 = "图片原图路径API: path="
            r0.append(r1)     // Catch: java.lang.Throwable -> L3e
            java.lang.reflect.Method r1 = r4.imageBestPathMethod     // Catch: java.lang.Throwable -> L3e
            java.lang.String r1 = r4.methodName(r1)     // Catch: java.lang.Throwable -> L3e
            r0.append(r1)     // Catch: java.lang.Throwable -> L3e
            java.lang.String r1 = " storage="
            r0.append(r1)     // Catch: java.lang.Throwable -> L3e
            java.lang.reflect.Method r1 = r4.imageStorageGetterMethod     // Catch: java.lang.Throwable -> L3e
            java.lang.String r1 = r4.methodName(r1)     // Catch: java.lang.Throwable -> L3e
            r0.append(r1)     // Catch: java.lang.Throwable -> L3e
            java.lang.String r1 = " token="
            r0.append(r1)     // Catch: java.lang.Throwable -> L3e
            java.lang.reflect.Method r1 = r4.imageTokenPathMethod     // Catch: java.lang.Throwable -> L3e
            java.lang.String r1 = r4.methodName(r1)     // Catch: java.lang.Throwable -> L3e
            r0.append(r1)     // Catch: java.lang.Throwable -> L3e
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L3e
            r4.logDetail(r0)     // Catch: java.lang.Throwable -> L3e
            goto Ldb
        Ld1:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "[Hchat:DexFinder] resolveImageBestPathApi 失败: "
            r1.<init>(r2)
            bc.e.s(r0, r1, r0)
        Ldb:
            return
    }

    private int resolveLocalMessageApiBySignature() {
            r6 = this;
            r6.resolveLocalSystemMessageMethod()
            r0 = 0
            java.lang.reflect.Method r1 = r6.localMessageInsertMethod     // Catch: java.lang.Throwable -> L71
            if (r1 == 0) goto L16
            java.lang.reflect.Method r2 = r6.localMessageCreateTimeMethod     // Catch: java.lang.Throwable -> L71
            if (r2 != 0) goto L16
            java.lang.Class r1 = r1.getDeclaringClass()     // Catch: java.lang.Throwable -> L71
            java.lang.reflect.Method r1 = r6.findLocalMessageCreateTimeMethod(r1)     // Catch: java.lang.Throwable -> L71
            r6.localMessageCreateTimeMethod = r1     // Catch: java.lang.Throwable -> L71
        L16:
            java.lang.reflect.Method r1 = r6.localMessageInsertMethod     // Catch: java.lang.Throwable -> L71
            if (r1 == 0) goto L1f
            java.lang.reflect.Method r1 = r6.localMessageCreateTimeMethod     // Catch: java.lang.Throwable -> L71
            if (r1 == 0) goto L1f
            goto L4e
        L1f:
            ch.e r1 = new ch.e     // Catch: java.lang.Throwable -> L71
            r1.<init>()     // Catch: java.lang.Throwable -> L71
            fh.k r2 = new fh.k     // Catch: java.lang.Throwable -> L71
            r2.<init>()     // Catch: java.lang.Throwable -> L71
            java.lang.String r3 = "x"
            gh.c r4 = new gh.c     // Catch: java.lang.Throwable -> L71
            r5 = 5
            r4.<init>(r3, r5)     // Catch: java.lang.Throwable -> L71
            r2.f3950g = r4     // Catch: java.lang.Throwable -> L71
            java.lang.Class r3 = java.lang.Long.TYPE     // Catch: java.lang.Throwable -> L71
            r2.p0(r3)     // Catch: java.lang.Throwable -> L71
            r3 = 1
            r2.m0(r3)     // Catch: java.lang.Throwable -> L71
            r1.f1666h = r2     // Catch: java.lang.Throwable -> L71
            org.luckypray.dexkit.DexKitBridge r2 = r6.dexKit     // Catch: java.lang.Throwable -> L71
            hh.p r1 = r2.findMethod(r1)     // Catch: java.lang.Throwable -> L71
            if (r1 == 0) goto L4b
            int r2 = r1.size()     // Catch: java.lang.Throwable -> L71
            goto L4c
        L4b:
            r2 = r0
        L4c:
            if (r1 != 0) goto L4f
        L4e:
            return r0
        L4f:
            java.util.Iterator r0 = r1.iterator()     // Catch: java.lang.Throwable -> L70
        L53:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L70
            if (r1 == 0) goto L72
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L70
            hh.o r1 = (hh.o) r1     // Catch: java.lang.Throwable -> L70
            java.lang.ClassLoader r3 = r6.classLoader     // Catch: java.lang.Throwable -> L53
            java.lang.reflect.Method r1 = r1.r(r3)     // Catch: java.lang.Throwable -> L53
            boolean r3 = r6.isLocalMessageInsertMethod(r1)     // Catch: java.lang.Throwable -> L53
            if (r3 != 0) goto L6c
            goto L53
        L6c:
            r6.setLocalMessageApi(r1)     // Catch: java.lang.Throwable -> L53
            goto L72
        L70:
            r0 = r2
        L71:
            r2 = r0
        L72:
            return r2
    }

    private void resolveLocalSystemMessageMethod() {
            r5 = this;
            java.lang.reflect.Method r0 = r5.localSystemMessageMethod
            if (r0 == 0) goto L5
            goto L4a
        L5:
            org.luckypray.dexkit.DexKitBridge r0 = r5.dexKit     // Catch: java.lang.Throwable -> L3f
            java.lang.String r1 = "will insert sysmsg from:"
            java.lang.String r2 = "content null, cannot to insert sysmsg!"
            java.lang.String r3 = "failed to insert sysmsg"
            java.lang.String r4 = "sysmsg inserted"
            java.lang.String[] r1 = new java.lang.String[]{r1, r2, r3, r4}     // Catch: java.lang.Throwable -> L3f
            ch.e r1 = r5.mkMethodUsingStrings(r1)     // Catch: java.lang.Throwable -> L3f
            hh.p r0 = r0.findMethod(r1)     // Catch: java.lang.Throwable -> L3f
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L3f
        L1f:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L3f
            if (r1 == 0) goto L4a
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L3f
            hh.o r1 = (hh.o) r1     // Catch: java.lang.Throwable -> L3f
            java.lang.ClassLoader r2 = r5.classLoader     // Catch: java.lang.Throwable -> L1f
            java.lang.reflect.Method r1 = r1.r(r2)     // Catch: java.lang.Throwable -> L1f
            boolean r2 = r5.isLocalSystemMessageMethod(r1)     // Catch: java.lang.Throwable -> L1f
            if (r2 != 0) goto L38
            goto L1f
        L38:
            java.lang.reflect.Method r1 = h.Hchat.utils.KavaReflector.accessible(r1)     // Catch: java.lang.Throwable -> L1f
            r5.localSystemMessageMethod = r1     // Catch: java.lang.Throwable -> L1f
            goto L4a
        L3f:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "[Hchat:DexFinder] resolveLocalSystemMessageMethod 失败: "
            r1.<init>(r2)
            bc.e.s(r0, r1, r0)
        L4a:
            return
    }

    private void resolveMarsCdnDownloadApi() {
            r8 = this;
            boolean r0 = r8.isMarsCdnReady()     // Catch: java.lang.Throwable -> L5d
            if (r0 == 0) goto L8
            goto L148
        L8:
            java.lang.ClassLoader r0 = r8.classLoader     // Catch: java.lang.Throwable -> L12
            java.lang.String r1 = "com.tencent.mars.cdn.CdnManager"
            java.lang.Class r0 = r0.loadClass(r1)     // Catch: java.lang.Throwable -> L12
            r8.marsCdnManagerClass = r0     // Catch: java.lang.Throwable -> L12
        L12:
            java.lang.ClassLoader r0 = r8.classLoader     // Catch: java.lang.Throwable -> L1c
            java.lang.String r1 = "com.tencent.mars.cdn.CdnManager$C2CDownloadRequest"
            java.lang.Class r0 = r0.loadClass(r1)     // Catch: java.lang.Throwable -> L1c
            r8.marsCdnDownloadRequestClass = r0     // Catch: java.lang.Throwable -> L1c
        L1c:
            java.lang.Class<?> r0 = r8.marsCdnDownloadRequestClass     // Catch: java.lang.Throwable -> L5d
            if (r0 != 0) goto L2a
            java.lang.ClassLoader r0 = r8.classLoader     // Catch: java.lang.Throwable -> L2a
            java.lang.String r1 = "com.tencent.mars.cdn.CdnLogic$C2CDownloadRequest"
            java.lang.Class r0 = r0.loadClass(r1)     // Catch: java.lang.Throwable -> L2a
            r8.marsCdnDownloadRequestClass = r0     // Catch: java.lang.Throwable -> L2a
        L2a:
            java.lang.Class<?> r0 = r8.marsCdnDownloadRequestClass     // Catch: java.lang.Throwable -> L5d
            if (r0 != 0) goto L60
            org.luckypray.dexkit.DexKitBridge r0 = r8.dexKit     // Catch: java.lang.Throwable -> L5d
            java.lang.String r1 = "must set marscdnBizType,apptype"
            java.lang.String[] r1 = new java.lang.String[]{r1}     // Catch: java.lang.Throwable -> L5d
            ch.c r1 = r8.mkClassUsingStrings(r1)     // Catch: java.lang.Throwable -> L5d
            hh.j r0 = r0.findClass(r1)     // Catch: java.lang.Throwable -> L5d
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L5d
        L42:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L5d
            if (r1 == 0) goto L60
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L5d
            hh.i r1 = (hh.i) r1     // Catch: java.lang.Throwable -> L5d
            java.lang.ClassLoader r2 = r8.classLoader     // Catch: java.lang.Throwable -> L42
            java.lang.Class r1 = r1.q(r2)     // Catch: java.lang.Throwable -> L42
            boolean r2 = r8.isMarsCdnRequestClass(r1)     // Catch: java.lang.Throwable -> L42
            if (r2 == 0) goto L42
            r8.marsCdnDownloadRequestClass = r1     // Catch: java.lang.Throwable -> L42
            goto L60
        L5d:
            r0 = move-exception
            goto L13e
        L60:
            java.lang.Class<?> r0 = r8.marsCdnDownloadCallbackClass     // Catch: java.lang.Throwable -> L5d
            if (r0 != 0) goto L6e
            java.lang.ClassLoader r0 = r8.classLoader     // Catch: java.lang.Throwable -> L6e
            java.lang.String r1 = "com.tencent.mars.cdn.CdnManager$DownloadCallback"
            java.lang.Class r0 = r0.loadClass(r1)     // Catch: java.lang.Throwable -> L6e
            r8.marsCdnDownloadCallbackClass = r0     // Catch: java.lang.Throwable -> L6e
        L6e:
            java.lang.Class<?> r0 = r8.marsCdnDownloadCallbackClass     // Catch: java.lang.Throwable -> L5d
            if (r0 != 0) goto L7c
            java.lang.ClassLoader r0 = r8.classLoader     // Catch: java.lang.Throwable -> L7c
            java.lang.String r1 = "com.tencent.mars.cdn.CdnLogic$DownloadCallback"
            java.lang.Class r0 = r0.loadClass(r1)     // Catch: java.lang.Throwable -> L7c
            r8.marsCdnDownloadCallbackClass = r0     // Catch: java.lang.Throwable -> L7c
        L7c:
            java.lang.Class<?> r0 = r8.marsCdnDownloadCallbackClass     // Catch: java.lang.Throwable -> L5d
            if (r0 != 0) goto Lae
            org.luckypray.dexkit.DexKitBridge r0 = r8.dexKit     // Catch: java.lang.Throwable -> L5d
            java.lang.String r1 = "aeskey must be 32 bytes"
            java.lang.String[] r1 = new java.lang.String[]{r1}     // Catch: java.lang.Throwable -> L5d
            ch.c r1 = r8.mkClassUsingStrings(r1)     // Catch: java.lang.Throwable -> L5d
            hh.j r0 = r0.findClass(r1)     // Catch: java.lang.Throwable -> L5d
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L5d
        L94:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L5d
            if (r1 == 0) goto Lae
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L5d
            hh.i r1 = (hh.i) r1     // Catch: java.lang.Throwable -> L5d
            java.lang.ClassLoader r2 = r8.classLoader     // Catch: java.lang.Throwable -> L94
            java.lang.Class r1 = r1.q(r2)     // Catch: java.lang.Throwable -> L94
            boolean r2 = r8.isMarsCdnCallbackClass(r1)     // Catch: java.lang.Throwable -> L94
            if (r2 == 0) goto L94
            r8.marsCdnDownloadCallbackClass = r1     // Catch: java.lang.Throwable -> L94
        Lae:
            java.lang.Class<?> r0 = r8.marsCdnManagerClass     // Catch: java.lang.Throwable -> L5d
            if (r0 == 0) goto Lc0
            java.lang.Class<?> r1 = r8.marsCdnDownloadRequestClass     // Catch: java.lang.Throwable -> L5d
            if (r1 == 0) goto Lc0
            java.lang.Class<?> r2 = r8.marsCdnDownloadCallbackClass     // Catch: java.lang.Throwable -> L5d
            if (r2 == 0) goto Lc0
            java.lang.reflect.Method r0 = r8.findMarsStartDownloadMethod(r0, r1, r2)     // Catch: java.lang.Throwable -> L5d
            r8.marsCdnStartDownloadMethod = r0     // Catch: java.lang.Throwable -> L5d
        Lc0:
            java.lang.Class<?> r0 = r8.marsCdnManagerClass     // Catch: java.lang.Throwable -> L5d
            if (r0 == 0) goto Lf9
            java.lang.reflect.Method r1 = r8.marsCdnStartDownloadMethod     // Catch: java.lang.Throwable -> L5d
            if (r1 != 0) goto Lf9
            java.lang.reflect.Method[] r0 = r0.getDeclaredMethods()     // Catch: java.lang.Throwable -> L5d
            int r1 = r0.length     // Catch: java.lang.Throwable -> L5d
            r2 = 0
            r3 = r2
        Lcf:
            if (r3 >= r1) goto Lf9
            r4 = r0[r3]     // Catch: java.lang.Throwable -> L5d
            java.lang.String r5 = "startC2CDownload"
            java.lang.String r6 = r4.getName()     // Catch: java.lang.Throwable -> L5d
            boolean r5 = r5.equals(r6)     // Catch: java.lang.Throwable -> L5d
            if (r5 != 0) goto Le0
            goto Le8
        Le0:
            java.lang.Class[] r5 = r4.getParameterTypes()     // Catch: java.lang.Throwable -> L5d
            int r6 = r5.length     // Catch: java.lang.Throwable -> L5d
            r7 = 2
            if (r6 == r7) goto Leb
        Le8:
            int r3 = r3 + 1
            goto Lcf
        Leb:
            h.Hchat.utils.KavaReflector.accessible(r4)     // Catch: java.lang.Throwable -> L5d
            r8.marsCdnStartDownloadMethod = r4     // Catch: java.lang.Throwable -> L5d
            r0 = r5[r2]     // Catch: java.lang.Throwable -> L5d
            r8.marsCdnDownloadRequestClass = r0     // Catch: java.lang.Throwable -> L5d
            r0 = 1
            r0 = r5[r0]     // Catch: java.lang.Throwable -> L5d
            r8.marsCdnDownloadCallbackClass = r0     // Catch: java.lang.Throwable -> L5d
        Lf9:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L5d
            r0.<init>()     // Catch: java.lang.Throwable -> L5d
            java.lang.String r1 = "Mars CDN下载API: manager="
            r0.append(r1)     // Catch: java.lang.Throwable -> L5d
            java.lang.Class<?> r1 = r8.marsCdnManagerClass     // Catch: java.lang.Throwable -> L5d
            java.lang.String r1 = r8.className(r1)     // Catch: java.lang.Throwable -> L5d
            r0.append(r1)     // Catch: java.lang.Throwable -> L5d
            java.lang.String r1 = " request="
            r0.append(r1)     // Catch: java.lang.Throwable -> L5d
            java.lang.Class<?> r1 = r8.marsCdnDownloadRequestClass     // Catch: java.lang.Throwable -> L5d
            java.lang.String r1 = r8.className(r1)     // Catch: java.lang.Throwable -> L5d
            r0.append(r1)     // Catch: java.lang.Throwable -> L5d
            java.lang.String r1 = " callback="
            r0.append(r1)     // Catch: java.lang.Throwable -> L5d
            java.lang.Class<?> r1 = r8.marsCdnDownloadCallbackClass     // Catch: java.lang.Throwable -> L5d
            java.lang.String r1 = r8.className(r1)     // Catch: java.lang.Throwable -> L5d
            r0.append(r1)     // Catch: java.lang.Throwable -> L5d
            java.lang.String r1 = " start="
            r0.append(r1)     // Catch: java.lang.Throwable -> L5d
            java.lang.reflect.Method r1 = r8.marsCdnStartDownloadMethod     // Catch: java.lang.Throwable -> L5d
            java.lang.String r1 = r8.methodName(r1)     // Catch: java.lang.Throwable -> L5d
            r0.append(r1)     // Catch: java.lang.Throwable -> L5d
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L5d
            r8.logDetail(r0)     // Catch: java.lang.Throwable -> L5d
            goto L148
        L13e:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "[Hchat:DexFinder] resolveMarsCdnDownloadApi 失败: "
            r1.<init>(r2)
            bc.e.s(r0, r1, r0)
        L148:
            return
    }

    private void resolveNetworkQueue() {
            r4 = this;
            r4.collectKnownNetworkQueueClasses()     // Catch: java.lang.Throwable -> L40
            org.luckypray.dexkit.DexKitBridge r0 = r4.dexKit     // Catch: java.lang.Throwable -> L40
            java.lang.String r1 = "doSceneImp"
            java.lang.String[] r1 = new java.lang.String[]{r1}     // Catch: java.lang.Throwable -> L40
            ch.e r1 = r4.mkMethodUsingStrings(r1)     // Catch: java.lang.Throwable -> L40
            hh.p r0 = r0.findMethod(r1)     // Catch: java.lang.Throwable -> L40
            java.util.Iterator r1 = r0.iterator()     // Catch: java.lang.Throwable -> L40
        L17:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L40
            if (r2 == 0) goto L42
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L40
            hh.o r2 = (hh.o) r2     // Catch: java.lang.Throwable -> L40
            lh.d r2 = r2.p()     // Catch: java.lang.Throwable -> L17
            java.lang.String r2 = r2.f8063g     // Catch: java.lang.Throwable -> L17
            java.lang.ClassLoader r3 = r4.classLoader     // Catch: java.lang.Throwable -> L17
            java.lang.Class r2 = h.Hchat.utils.KavaReflector.loadClass(r2, r3)     // Catch: java.lang.Throwable -> L17
            r4.addNetQueueCandidate(r2)     // Catch: java.lang.Throwable -> L17
            boolean r3 = r4.hasLikelyQueueSendMethod(r2)     // Catch: java.lang.Throwable -> L17
            if (r3 == 0) goto L3b
            r4.netQueueClass = r2     // Catch: java.lang.Throwable -> L17
            goto L42
        L3b:
            java.lang.Class<?> r2 = r4.netQueueClass     // Catch: java.lang.Throwable -> L17
            if (r2 == 0) goto L17
            goto L42
        L40:
            r0 = move-exception
            goto La9
        L42:
            java.lang.Class<?> r1 = r4.netQueueClass     // Catch: java.lang.Throwable -> L40
            if (r1 != 0) goto L66
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L40
        L4a:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L40
            if (r1 == 0) goto L66
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L40
            hh.o r1 = (hh.o) r1     // Catch: java.lang.Throwable -> L40
            lh.d r1 = r1.p()     // Catch: java.lang.Throwable -> L4a
            java.lang.String r1 = r1.f8063g     // Catch: java.lang.Throwable -> L4a
            java.lang.ClassLoader r2 = r4.classLoader     // Catch: java.lang.Throwable -> L4a
            java.lang.Class r1 = h.Hchat.utils.KavaReflector.loadClass(r1, r2)     // Catch: java.lang.Throwable -> L4a
            r4.addNetQueueCandidate(r1)     // Catch: java.lang.Throwable -> L4a
            goto L4a
        L66:
            r4.collectNetworkQueueClassesByAnchors()     // Catch: java.lang.Throwable -> L40
            java.lang.Class<?> r0 = r4.netQueueClass     // Catch: java.lang.Throwable -> L40
            if (r0 == 0) goto L73
            boolean r0 = r4.hasLikelyQueueSendMethod(r0)     // Catch: java.lang.Throwable -> L40
            if (r0 != 0) goto L7b
        L73:
            java.lang.Class r0 = r4.findFirstLikelyQueueClass()     // Catch: java.lang.Throwable -> L40
            if (r0 == 0) goto L7b
            r4.netQueueClass = r0     // Catch: java.lang.Throwable -> L40
        L7b:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L40
            r0.<init>()     // Catch: java.lang.Throwable -> L40
            java.lang.String r1 = "网络队列类: "
            r0.append(r1)     // Catch: java.lang.Throwable -> L40
            java.lang.Class<?> r1 = r4.netQueueClass     // Catch: java.lang.Throwable -> L40
            if (r1 == 0) goto L8e
            java.lang.String r1 = r1.getName()     // Catch: java.lang.Throwable -> L40
            goto L90
        L8e:
            java.lang.String r1 = "null"
        L90:
            r0.append(r1)     // Catch: java.lang.Throwable -> L40
            java.lang.String r1 = " candidates="
            r0.append(r1)     // Catch: java.lang.Throwable -> L40
            java.util.List<java.lang.Class<?>> r1 = r4.netQueueCandidateClasses     // Catch: java.lang.Throwable -> L40
            int r1 = r1.size()     // Catch: java.lang.Throwable -> L40
            r0.append(r1)     // Catch: java.lang.Throwable -> L40
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L40
            r4.logDetail(r0)     // Catch: java.lang.Throwable -> L40
            goto Lb3
        La9:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "[Hchat:DexFinder] resolveQueue 失败: "
            r1.<init>(r2)
            bc.e.s(r0, r1, r0)
        Lb3:
            return
    }

    private void resolveOpenLuckyMoney() {
            r8 = this;
            org.luckypray.dexkit.DexKitBridge r0 = r8.dexKit     // Catch: java.lang.Throwable -> L4d
            java.lang.String r1 = "cgi-bin/mmpay-bin/openwxhb"
            java.lang.String[] r1 = new java.lang.String[]{r1}     // Catch: java.lang.Throwable -> L4d
            ch.c r1 = r8.mkClassUsingStrings(r1)     // Catch: java.lang.Throwable -> L4d
            hh.j r0 = r0.findClass(r1)     // Catch: java.lang.Throwable -> L4d
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L4d
        L14:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L4d
            r2 = 8
            r3 = 9
            r4 = 10
            if (r1 == 0) goto L50
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L4d
            hh.i r1 = (hh.i) r1     // Catch: java.lang.Throwable -> L4d
            lh.a r1 = r1.p()     // Catch: java.lang.Throwable -> L14
            java.lang.String r1 = r1.f8057g     // Catch: java.lang.Throwable -> L14
            java.lang.ClassLoader r5 = r8.classLoader     // Catch: java.lang.Throwable -> L14
            java.lang.Class r1 = h.Hchat.utils.KavaReflector.loadClass(r1, r5)     // Catch: java.lang.Throwable -> L14
            java.lang.reflect.Constructor r5 = r8.findCtorByArgCount(r1, r4)     // Catch: java.lang.Throwable -> L14
            java.lang.reflect.Constructor r6 = r8.findCtorByArgCount(r1, r3)     // Catch: java.lang.Throwable -> L14
            java.lang.reflect.Constructor r7 = r8.findCtorByArgCount(r1, r2)     // Catch: java.lang.Throwable -> L14
            if (r5 != 0) goto L44
            if (r6 != 0) goto L44
            if (r7 == 0) goto L14
        L44:
            r8.openLuckyMoneyClass = r1     // Catch: java.lang.Throwable -> L14
            r8.openCtor10 = r5     // Catch: java.lang.Throwable -> L14
            r8.openCtor9 = r6     // Catch: java.lang.Throwable -> L14
            r8.openCtor8 = r7     // Catch: java.lang.Throwable -> L14
            goto L50
        L4d:
            r0 = move-exception
            goto L11c
        L50:
            java.lang.Class<?> r0 = r8.openLuckyMoneyClass     // Catch: java.lang.Throwable -> L4d
            if (r0 != 0) goto L9a
            org.luckypray.dexkit.DexKitBridge r0 = r8.dexKit     // Catch: java.lang.Throwable -> L4d
            java.lang.String r1 = "open lucky"
            java.lang.String[] r1 = new java.lang.String[]{r1}     // Catch: java.lang.Throwable -> L4d
            ch.c r1 = r8.mkClassUsingStrings(r1)     // Catch: java.lang.Throwable -> L4d
            hh.j r0 = r0.findClass(r1)     // Catch: java.lang.Throwable -> L4d
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L4d
        L68:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L4d
            if (r1 == 0) goto L9a
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L4d
            hh.i r1 = (hh.i) r1     // Catch: java.lang.Throwable -> L4d
            lh.a r1 = r1.p()     // Catch: java.lang.Throwable -> L68
            java.lang.String r1 = r1.f8057g     // Catch: java.lang.Throwable -> L68
            java.lang.ClassLoader r5 = r8.classLoader     // Catch: java.lang.Throwable -> L68
            java.lang.Class r1 = h.Hchat.utils.KavaReflector.loadClass(r1, r5)     // Catch: java.lang.Throwable -> L68
            java.lang.reflect.Constructor r5 = r8.findCtorByArgCount(r1, r4)     // Catch: java.lang.Throwable -> L68
            java.lang.reflect.Constructor r6 = r8.findCtorByArgCount(r1, r3)     // Catch: java.lang.Throwable -> L68
            java.lang.reflect.Constructor r7 = r8.findCtorByArgCount(r1, r2)     // Catch: java.lang.Throwable -> L68
            if (r5 != 0) goto L92
            if (r6 != 0) goto L92
            if (r7 == 0) goto L68
        L92:
            r8.openLuckyMoneyClass = r1     // Catch: java.lang.Throwable -> L68
            r8.openCtor10 = r5     // Catch: java.lang.Throwable -> L68
            r8.openCtor9 = r6     // Catch: java.lang.Throwable -> L68
            r8.openCtor8 = r7     // Catch: java.lang.Throwable -> L68
        L9a:
            org.luckypray.dexkit.DexKitBridge r0 = r8.dexKit     // Catch: java.lang.Throwable -> L4d
            java.lang.String r1 = "openluckyunion"
            java.lang.String[] r1 = new java.lang.String[]{r1}     // Catch: java.lang.Throwable -> L4d
            ch.e r1 = r8.mkMethodUsingStrings(r1)     // Catch: java.lang.Throwable -> L4d
            hh.p r0 = r0.findMethod(r1)     // Catch: java.lang.Throwable -> L4d
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L4d
            r1 = 0
        Laf:
            boolean r2 = r0.hasNext()     // Catch: java.lang.Throwable -> L4d
            if (r2 == 0) goto Ldc
            java.lang.Object r2 = r0.next()     // Catch: java.lang.Throwable -> L4d
            hh.o r2 = (hh.o) r2     // Catch: java.lang.Throwable -> L4d
            lh.d r2 = r2.p()     // Catch: java.lang.Throwable -> Laf
            java.lang.String r2 = r2.f8063g     // Catch: java.lang.Throwable -> Laf
            java.lang.ClassLoader r5 = r8.classLoader     // Catch: java.lang.Throwable -> Laf
            java.lang.Class r2 = h.Hchat.utils.KavaReflector.loadClass(r2, r5)     // Catch: java.lang.Throwable -> Laf
            if (r1 != 0) goto Lca
            r1 = r2
        Lca:
            java.lang.reflect.Constructor r5 = r8.findCtorByArgCount(r2, r4)     // Catch: java.lang.Throwable -> Laf
            java.lang.reflect.Constructor r6 = r8.findCtorByArgCount(r2, r3)     // Catch: java.lang.Throwable -> Laf
            if (r5 != 0) goto Ld6
            if (r6 == 0) goto Laf
        Ld6:
            r8.openLuckyMoneyUnionClass = r2     // Catch: java.lang.Throwable -> Laf
            r8.unionOpenCtor10 = r5     // Catch: java.lang.Throwable -> Laf
            r8.unionOpenCtor9 = r6     // Catch: java.lang.Throwable -> Laf
        Ldc:
            java.lang.Class<?> r0 = r8.openLuckyMoneyUnionClass     // Catch: java.lang.Throwable -> L4d
            if (r0 != 0) goto Le2
            r8.openLuckyMoneyUnionClass = r1     // Catch: java.lang.Throwable -> L4d
        Le2:
            java.lang.Class<?> r0 = r8.openLuckyMoneyUnionClass     // Catch: java.lang.Throwable -> L4d
            if (r0 == 0) goto Lfc
            java.lang.reflect.Constructor<?> r1 = r8.unionOpenCtor10     // Catch: java.lang.Throwable -> L4d
            if (r1 != 0) goto Lfc
            java.lang.reflect.Constructor<?> r1 = r8.unionOpenCtor9     // Catch: java.lang.Throwable -> L4d
            if (r1 != 0) goto Lfc
            java.lang.reflect.Constructor r0 = r8.findCtorByArgCount(r0, r4)     // Catch: java.lang.Throwable -> L4d
            r8.unionOpenCtor10 = r0     // Catch: java.lang.Throwable -> L4d
            java.lang.Class<?> r0 = r8.openLuckyMoneyUnionClass     // Catch: java.lang.Throwable -> L4d
            java.lang.reflect.Constructor r0 = r8.findCtorByArgCount(r0, r3)     // Catch: java.lang.Throwable -> L4d
            r8.unionOpenCtor9 = r0     // Catch: java.lang.Throwable -> L4d
        Lfc:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L4d
            r0.<init>()     // Catch: java.lang.Throwable -> L4d
            java.lang.String r1 = "拆红包类: "
            r0.append(r1)     // Catch: java.lang.Throwable -> L4d
            java.lang.Class<?> r1 = r8.openLuckyMoneyClass     // Catch: java.lang.Throwable -> L4d
            if (r1 == 0) goto L10f
            java.lang.String r1 = r1.getName()     // Catch: java.lang.Throwable -> L4d
            goto L111
        L10f:
            java.lang.String r1 = "null"
        L111:
            r0.append(r1)     // Catch: java.lang.Throwable -> L4d
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L4d
            r8.logDetail(r0)     // Catch: java.lang.Throwable -> L4d
            goto L126
        L11c:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "[Hchat:DexFinder] resolveOpen 失败: "
            r1.<init>(r2)
            bc.e.s(r0, r1, r0)
        L126:
            return
    }

    private void resolvePacketCompatClasses() {
            r6 = this;
            java.lang.String r0 = "包兼容类: base="
            java.util.List<java.lang.Class<?>> r1 = r6.packetBaseClasses     // Catch: java.lang.Throwable -> L7e
            r1.clear()     // Catch: java.lang.Throwable -> L7e
            java.util.List<java.lang.Class<?>> r1 = r6.packetQueueClasses     // Catch: java.lang.Throwable -> L7e
            r1.clear()     // Catch: java.lang.Throwable -> L7e
            java.util.List<java.lang.Class<?>> r1 = r6.fakePacketClasses     // Catch: java.lang.Throwable -> L7e
            r1.clear()     // Catch: java.lang.Throwable -> L7e
            java.util.List<java.lang.Class<?>> r1 = r6.packetBaseClasses     // Catch: java.lang.Throwable -> L7e
            java.lang.String r2 = "MicroMsg.NetSceneBase"
            java.lang.String[] r2 = new java.lang.String[]{r2}     // Catch: java.lang.Throwable -> L7e
            java.lang.String[][] r2 = new java.lang.String[][]{r2}     // Catch: java.lang.Throwable -> L7e
            r3 = 10
            r6.collectClassCandidates(r1, r3, r2)     // Catch: java.lang.Throwable -> L7e
            java.util.List<java.lang.Class<?>> r1 = r6.packetQueueClasses     // Catch: java.lang.Throwable -> L7e
            java.lang.String r2 = "doSceneImp mmcgi"
            java.lang.String[] r2 = new java.lang.String[]{r2}     // Catch: java.lang.Throwable -> L7e
            java.lang.String[][] r2 = new java.lang.String[][]{r2}     // Catch: java.lang.Throwable -> L7e
            r6.collectClassCandidates(r1, r3, r2)     // Catch: java.lang.Throwable -> L7e
            java.util.List<java.lang.Class<?>> r1 = r6.fakePacketClasses     // Catch: java.lang.Throwable -> L7e
            java.lang.String r2 = "/cgi-bin/mmpay-bin/requestwxhb"
            java.lang.String[] r2 = new java.lang.String[]{r2}     // Catch: java.lang.Throwable -> L7e
            java.lang.String r4 = "NetScenePrepareLuckyMoney"
            java.lang.String[] r4 = new java.lang.String[]{r4}     // Catch: java.lang.Throwable -> L7e
            java.lang.String r5 = "sendMsgXml"
            java.lang.String[] r5 = new java.lang.String[]{r5}     // Catch: java.lang.Throwable -> L7e
            java.lang.String[][] r2 = new java.lang.String[][]{r2, r4, r5}     // Catch: java.lang.Throwable -> L7e
            r6.collectClassCandidates(r1, r3, r2)     // Catch: java.lang.Throwable -> L7e
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L7e
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L7e
            java.util.List<java.lang.Class<?>> r0 = r6.packetBaseClasses     // Catch: java.lang.Throwable -> L7e
            int r0 = r0.size()     // Catch: java.lang.Throwable -> L7e
            r1.append(r0)     // Catch: java.lang.Throwable -> L7e
            java.lang.String r0 = " queue="
            r1.append(r0)     // Catch: java.lang.Throwable -> L7e
            java.util.List<java.lang.Class<?>> r0 = r6.packetQueueClasses     // Catch: java.lang.Throwable -> L7e
            int r0 = r0.size()     // Catch: java.lang.Throwable -> L7e
            r1.append(r0)     // Catch: java.lang.Throwable -> L7e
            java.lang.String r0 = " fake="
            r1.append(r0)     // Catch: java.lang.Throwable -> L7e
            java.util.List<java.lang.Class<?>> r0 = r6.fakePacketClasses     // Catch: java.lang.Throwable -> L7e
            int r0 = r0.size()     // Catch: java.lang.Throwable -> L7e
            r1.append(r0)     // Catch: java.lang.Throwable -> L7e
            java.lang.String r0 = r1.toString()     // Catch: java.lang.Throwable -> L7e
            r6.logDetail(r0)     // Catch: java.lang.Throwable -> L7e
            return
        L7e:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "[Hchat:DexFinder] resolvePacketCompat 失败: "
            r1.<init>(r2)
            bc.e.s(r0, r1, r0)
            return
    }

    private void resolvePatExtensionApi() {
            r5 = this;
            java.lang.String r0 = "cannot pat, talker %s"
            java.lang.reflect.Method r1 = r5.patCreatePairMethod     // Catch: java.lang.Throwable -> L18
            boolean r1 = r5.isPatCreatePairMethod(r1)     // Catch: java.lang.Throwable -> L18
            if (r1 == 0) goto L1b
            java.lang.reflect.Method r1 = r5.patSuffixMethod     // Catch: java.lang.Throwable -> L18
            boolean r1 = r5.isPatSuffixMethod(r1)     // Catch: java.lang.Throwable -> L18
            if (r1 == 0) goto L1b
            java.lang.Class<?> r1 = r5.patExtensionClass     // Catch: java.lang.Throwable -> L18
            if (r1 == 0) goto L1b
            goto Lef
        L18:
            r0 = move-exception
            goto Lf0
        L1b:
            java.lang.reflect.Method r1 = r5.patCreatePairMethod     // Catch: java.lang.Throwable -> L18
            boolean r1 = r5.isPatCreatePairMethod(r1)     // Catch: java.lang.Throwable -> L18
            java.lang.String r2 = "insert pat msg %d %s %s"
            java.lang.String r3 = "MicroMsg.PatMsgExtension"
            if (r1 != 0) goto L3d
            java.lang.String[] r1 = new java.lang.String[]{r3, r2}     // Catch: java.lang.Throwable -> L18
            java.lang.reflect.Method r1 = r5.findPatCreatePairMethodByStrings(r1)     // Catch: java.lang.Throwable -> L18
            r5.patCreatePairMethod = r1     // Catch: java.lang.Throwable -> L18
            if (r1 != 0) goto L3d
            java.lang.String[] r1 = new java.lang.String[]{r2}     // Catch: java.lang.Throwable -> L18
            java.lang.reflect.Method r1 = r5.findPatCreatePairMethodByStrings(r1)     // Catch: java.lang.Throwable -> L18
            r5.patCreatePairMethod = r1     // Catch: java.lang.Throwable -> L18
        L3d:
            java.lang.reflect.Method r1 = r5.patSuffixMethod     // Catch: java.lang.Throwable -> L18
            boolean r1 = r5.isPatSuffixMethod(r1)     // Catch: java.lang.Throwable -> L18
            java.lang.String r4 = "pattedUser %s, suffix %s"
            if (r1 != 0) goto L5d
            java.lang.String[] r1 = new java.lang.String[]{r3, r4}     // Catch: java.lang.Throwable -> L18
            java.lang.reflect.Method r1 = r5.findPatSuffixMethodByStrings(r1)     // Catch: java.lang.Throwable -> L18
            r5.patSuffixMethod = r1     // Catch: java.lang.Throwable -> L18
            if (r1 != 0) goto L5d
            java.lang.String[] r1 = new java.lang.String[]{r4}     // Catch: java.lang.Throwable -> L18
            java.lang.reflect.Method r1 = r5.findPatSuffixMethodByStrings(r1)     // Catch: java.lang.Throwable -> L18
            r5.patSuffixMethod = r1     // Catch: java.lang.Throwable -> L18
        L5d:
            java.lang.reflect.Method r1 = r5.patCanSendMethod     // Catch: java.lang.Throwable -> L18
            boolean r1 = r5.isPatCanSendMethod(r1)     // Catch: java.lang.Throwable -> L18
            if (r1 != 0) goto L7b
            java.lang.String[] r1 = new java.lang.String[]{r3, r0}     // Catch: java.lang.Throwable -> L18
            java.lang.reflect.Method r1 = r5.findPatCanSendMethodByStrings(r1)     // Catch: java.lang.Throwable -> L18
            r5.patCanSendMethod = r1     // Catch: java.lang.Throwable -> L18
            if (r1 != 0) goto L7b
            java.lang.String[] r0 = new java.lang.String[]{r0}     // Catch: java.lang.Throwable -> L18
            java.lang.reflect.Method r0 = r5.findPatCanSendMethodByStrings(r0)     // Catch: java.lang.Throwable -> L18
            r5.patCanSendMethod = r0     // Catch: java.lang.Throwable -> L18
        L7b:
            java.lang.reflect.Method r0 = r5.patCreatePairMethod     // Catch: java.lang.Throwable -> L18
            if (r0 == 0) goto La8
            java.lang.reflect.Method r1 = r5.patSuffixMethod     // Catch: java.lang.Throwable -> L18
            if (r1 == 0) goto La8
            java.lang.Class r0 = r0.getDeclaringClass()     // Catch: java.lang.Throwable -> L18
            java.lang.reflect.Method r1 = r5.patSuffixMethod     // Catch: java.lang.Throwable -> L18
            java.lang.Class r1 = r1.getDeclaringClass()     // Catch: java.lang.Throwable -> L18
            if (r0 != r1) goto La8
            java.lang.reflect.Method r0 = r5.patCreatePairMethod     // Catch: java.lang.Throwable -> L18
            java.lang.Class r0 = r0.getDeclaringClass()     // Catch: java.lang.Throwable -> L18
            r5.patExtensionClass = r0     // Catch: java.lang.Throwable -> L18
            java.lang.reflect.Method r0 = r5.patCanSendMethod     // Catch: java.lang.Throwable -> L18
            boolean r0 = r5.isPatCanSendMethod(r0)     // Catch: java.lang.Throwable -> L18
            if (r0 != 0) goto Lef
            java.lang.Class<?> r0 = r5.patExtensionClass     // Catch: java.lang.Throwable -> L18
            java.lang.reflect.Method r0 = r5.findPatCanSendMethod(r0)     // Catch: java.lang.Throwable -> L18
            r5.patCanSendMethod = r0     // Catch: java.lang.Throwable -> L18
            return
        La8:
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L18
            r0.<init>()     // Catch: java.lang.Throwable -> L18
            java.lang.String[] r1 = new java.lang.String[]{r3, r2}     // Catch: java.lang.Throwable -> L18
            java.lang.String[] r3 = new java.lang.String[]{r3, r4}     // Catch: java.lang.Throwable -> L18
            java.lang.String[] r2 = new java.lang.String[]{r2}     // Catch: java.lang.Throwable -> L18
            java.lang.String[] r4 = new java.lang.String[]{r4}     // Catch: java.lang.Throwable -> L18
            java.lang.String[][] r1 = new java.lang.String[][]{r1, r3, r2, r4}     // Catch: java.lang.Throwable -> L18
            r2 = 20
            r5.collectSendTextMethodOwnerCandidates(r0, r2, r1)     // Catch: java.lang.Throwable -> L18
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L18
        Lca:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L18
            if (r1 == 0) goto Lef
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L18
            java.lang.Class r1 = (java.lang.Class) r1     // Catch: java.lang.Throwable -> L18
            java.lang.reflect.Method r2 = r5.findPatCreatePairMethod(r1)     // Catch: java.lang.Throwable -> L18
            java.lang.reflect.Method r3 = r5.findPatSuffixMethod(r1)     // Catch: java.lang.Throwable -> L18
            if (r2 == 0) goto Lca
            if (r3 != 0) goto Le3
            goto Lca
        Le3:
            r5.patExtensionClass = r1     // Catch: java.lang.Throwable -> L18
            r5.patCreatePairMethod = r2     // Catch: java.lang.Throwable -> L18
            r5.patSuffixMethod = r3     // Catch: java.lang.Throwable -> L18
            java.lang.reflect.Method r0 = r5.findPatCanSendMethod(r1)     // Catch: java.lang.Throwable -> L18
            r5.patCanSendMethod = r0     // Catch: java.lang.Throwable -> L18
        Lef:
            return
        Lf0:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "[Hchat:DexFinder] resolvePatExtensionApi 失败: "
            r1.<init>(r2)
            bc.e.s(r0, r1, r0)
            return
    }

    private void resolvePatSendApi() {
            r1 = this;
            java.lang.reflect.Constructor<?> r0 = r1.sendPatSceneCtor
            if (r0 != 0) goto Lc
            java.lang.Class<?> r0 = r1.sendPatSceneClass
            java.lang.reflect.Constructor r0 = r1.findSendPatSceneCtor(r0)
            r1.sendPatSceneCtor = r0
        Lc:
            java.lang.reflect.Method r0 = r1.patCreatePairMethod
            boolean r0 = r1.isPatCreatePairMethod(r0)
            if (r0 == 0) goto L21
            java.lang.reflect.Method r0 = r1.patSuffixMethod
            boolean r0 = r1.isPatSuffixMethod(r0)
            if (r0 == 0) goto L21
            java.lang.reflect.Constructor<?> r0 = r1.sendPatSceneCtor
            if (r0 == 0) goto L21
            return
        L21:
            r1.resolvePatExtensionApi()
            r1.resolveSendPatSceneApi()
            return
    }

    private void resolveProtobufCallbackApi() {
            r5 = this;
            java.lang.Class<?> r0 = r5.protobufNetSceneBaseClass
            if (r0 != 0) goto L5
            goto L55
        L5:
            ch.e r0 = new ch.e     // Catch: java.lang.Throwable -> L55
            r0.<init>()     // Catch: java.lang.Throwable -> L55
            fh.k r1 = new fh.k     // Catch: java.lang.Throwable -> L55
            r1.<init>()     // Catch: java.lang.Throwable -> L55
            java.lang.String r2 = "callback"
            gh.c r3 = new gh.c     // Catch: java.lang.Throwable -> L55
            r4 = 5
            r3.<init>(r2, r4)     // Catch: java.lang.Throwable -> L55
            r1.f3950g = r3     // Catch: java.lang.Throwable -> L55
            java.lang.Class r2 = java.lang.Integer.TYPE     // Catch: java.lang.Throwable -> L55
            r1.p0(r2)     // Catch: java.lang.Throwable -> L55
            r1.m0(r4)     // Catch: java.lang.Throwable -> L55
            r0.f1666h = r1     // Catch: java.lang.Throwable -> L55
            org.luckypray.dexkit.DexKitBridge r1 = r5.dexKit     // Catch: java.lang.Throwable -> L55
            hh.p r0 = r1.findMethod(r0)     // Catch: java.lang.Throwable -> L55
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L55
        L2d:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L55
            if (r1 == 0) goto L55
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L55
            hh.o r1 = (hh.o) r1     // Catch: java.lang.Throwable -> L55
            java.lang.ClassLoader r2 = r5.classLoader     // Catch: java.lang.Throwable -> L2d
            java.lang.reflect.Method r1 = r1.r(r2)     // Catch: java.lang.Throwable -> L2d
            boolean r2 = r5.isProtobufCallbackMethod(r1)     // Catch: java.lang.Throwable -> L2d
            if (r2 != 0) goto L46
            goto L2d
        L46:
            java.lang.Class r2 = r1.getDeclaringClass()     // Catch: java.lang.Throwable -> L2d
            r5.protobufCallbackClass = r2     // Catch: java.lang.Throwable -> L2d
            java.lang.Class[] r1 = r1.getParameterTypes()     // Catch: java.lang.Throwable -> L2d
            r2 = 3
            r1 = r1[r2]     // Catch: java.lang.Throwable -> L2d
            r5.protobufReqRespClass = r1     // Catch: java.lang.Throwable -> L2d
        L55:
            return
    }

    private void resolveProtobufDispatchApi() {
            r2 = this;
            java.lang.Class<?> r0 = r2.protobufReqRespClass     // Catch: java.lang.Throwable -> L1c
            if (r0 == 0) goto Ld
            java.lang.Class<?> r1 = r2.protobufCallbackClass     // Catch: java.lang.Throwable -> L1c
            if (r1 == 0) goto Ld
            java.lang.reflect.Method r1 = r2.protobufStaticDispatchMethod     // Catch: java.lang.Throwable -> L1c
            if (r1 == 0) goto Ld
            goto L1c
        Ld:
            if (r0 == 0) goto L1c
            java.lang.Class<?> r1 = r2.protobufCallbackClass     // Catch: java.lang.Throwable -> L1c
            if (r1 != 0) goto L14
            goto L1c
        L14:
            java.lang.reflect.Method r0 = r2.findStaticDispatch(r0, r1)     // Catch: java.lang.Throwable -> L1c
            if (r0 == 0) goto L1c
            r2.protobufStaticDispatchMethod = r0     // Catch: java.lang.Throwable -> L1c
        L1c:
            return
    }

    private void resolveProtobufPacketApi() {
            r3 = this;
            java.lang.String r0 = "Protobuf包API: raw="
            java.lang.Class r1 = r3.findProtobufBaseClass()     // Catch: java.lang.Throwable -> L14
            if (r1 != 0) goto L9
            return
        L9:
            java.lang.Class<?> r2 = r3.protobufRawReqClass     // Catch: java.lang.Throwable -> L14
            if (r2 != 0) goto L17
            java.lang.Class r2 = r3.findRawReqClass()     // Catch: java.lang.Throwable -> L14
            r3.protobufRawReqClass = r2     // Catch: java.lang.Throwable -> L14
            goto L17
        L14:
            r0 = move-exception
            goto L130
        L17:
            java.lang.Class<?> r2 = r3.protobufNewSendMsgReqClass     // Catch: java.lang.Throwable -> L14
            if (r2 != 0) goto L21
            java.lang.Class r2 = r3.findNewSendMsgReqClass(r1)     // Catch: java.lang.Throwable -> L14
            r3.protobufNewSendMsgReqClass = r2     // Catch: java.lang.Throwable -> L14
        L21:
            java.lang.Class<?> r2 = r3.protobufOplogReqClass     // Catch: java.lang.Throwable -> L14
            if (r2 != 0) goto L2b
            java.lang.Class r2 = r3.findOplogReqClass(r1)     // Catch: java.lang.Throwable -> L14
            r3.protobufOplogReqClass = r2     // Catch: java.lang.Throwable -> L14
        L2b:
            java.lang.Class<?> r2 = r3.protobufGenericRespClass     // Catch: java.lang.Throwable -> L14
            if (r2 != 0) goto L35
            java.lang.Class r2 = r3.findGenericRespClass()     // Catch: java.lang.Throwable -> L14
            r3.protobufGenericRespClass = r2     // Catch: java.lang.Throwable -> L14
        L35:
            java.lang.Class<?> r2 = r3.protobufConfigBuilderClass     // Catch: java.lang.Throwable -> L14
            if (r2 != 0) goto L3f
            java.lang.Class r1 = r3.findConfigBuilderClass(r1)     // Catch: java.lang.Throwable -> L14
            r3.protobufConfigBuilderClass = r1     // Catch: java.lang.Throwable -> L14
        L3f:
            java.lang.Class<?> r1 = r3.protobufNetSceneBaseClass     // Catch: java.lang.Throwable -> L14
            if (r1 != 0) goto L49
            java.lang.Class r1 = r3.findProtobufNetSceneBaseClass()     // Catch: java.lang.Throwable -> L14
            r3.protobufNetSceneBaseClass = r1     // Catch: java.lang.Throwable -> L14
        L49:
            java.lang.Class<?> r1 = r3.protobufCallbackClass     // Catch: java.lang.Throwable -> L14
            if (r1 == 0) goto L58
            boolean r1 = r1.isInterface()     // Catch: java.lang.Throwable -> L14
            if (r1 != 0) goto L58
            r1 = 0
            r3.protobufCallbackClass = r1     // Catch: java.lang.Throwable -> L14
            r3.protobufStaticDispatchMethod = r1     // Catch: java.lang.Throwable -> L14
        L58:
            java.lang.Class<?> r1 = r3.protobufReqRespClass     // Catch: java.lang.Throwable -> L14
            if (r1 == 0) goto L60
            java.lang.Class<?> r1 = r3.protobufCallbackClass     // Catch: java.lang.Throwable -> L14
            if (r1 != 0) goto L63
        L60:
            r3.resolveProtobufCallbackApi()     // Catch: java.lang.Throwable -> L14
        L63:
            java.lang.Class<?> r1 = r3.protobufOnGYNetEndClass     // Catch: java.lang.Throwable -> L14
            if (r1 != 0) goto L6d
            java.lang.Class r1 = r3.findOnGYNetEndClass()     // Catch: java.lang.Throwable -> L14
            r3.protobufOnGYNetEndClass = r1     // Catch: java.lang.Throwable -> L14
        L6d:
            java.lang.Class<?> r1 = r3.protobufReqRespClass     // Catch: java.lang.Throwable -> L14
            if (r1 != 0) goto L77
            java.lang.Class r1 = r3.findReqRespClassFromConfigBuilder()     // Catch: java.lang.Throwable -> L14
            r3.protobufReqRespClass = r1     // Catch: java.lang.Throwable -> L14
        L77:
            r3.resolveProtobufDispatchApi()     // Catch: java.lang.Throwable -> L14
            java.util.List<java.lang.reflect.Method> r1 = r3.protobufSceneEndMethods     // Catch: java.lang.Throwable -> L14
            if (r1 == 0) goto L84
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L14
            if (r1 == 0) goto L8a
        L84:
            java.util.List r1 = r3.findProtobufSceneEndMethods()     // Catch: java.lang.Throwable -> L14
            r3.protobufSceneEndMethods = r1     // Catch: java.lang.Throwable -> L14
        L8a:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L14
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L14
            java.lang.Class<?> r0 = r3.protobufRawReqClass     // Catch: java.lang.Throwable -> L14
            java.lang.String r0 = r3.className(r0)     // Catch: java.lang.Throwable -> L14
            r1.append(r0)     // Catch: java.lang.Throwable -> L14
            java.lang.String r0 = " sendMsg="
            r1.append(r0)     // Catch: java.lang.Throwable -> L14
            java.lang.Class<?> r0 = r3.protobufNewSendMsgReqClass     // Catch: java.lang.Throwable -> L14
            java.lang.String r0 = r3.className(r0)     // Catch: java.lang.Throwable -> L14
            r1.append(r0)     // Catch: java.lang.Throwable -> L14
            java.lang.String r0 = " oplog="
            r1.append(r0)     // Catch: java.lang.Throwable -> L14
            java.lang.Class<?> r0 = r3.protobufOplogReqClass     // Catch: java.lang.Throwable -> L14
            java.lang.String r0 = r3.className(r0)     // Catch: java.lang.Throwable -> L14
            r1.append(r0)     // Catch: java.lang.Throwable -> L14
            java.lang.String r0 = " resp="
            r1.append(r0)     // Catch: java.lang.Throwable -> L14
            java.lang.Class<?> r0 = r3.protobufGenericRespClass     // Catch: java.lang.Throwable -> L14
            java.lang.String r0 = r3.className(r0)     // Catch: java.lang.Throwable -> L14
            r1.append(r0)     // Catch: java.lang.Throwable -> L14
            java.lang.String r0 = " builder="
            r1.append(r0)     // Catch: java.lang.Throwable -> L14
            java.lang.Class<?> r0 = r3.protobufConfigBuilderClass     // Catch: java.lang.Throwable -> L14
            java.lang.String r0 = r3.className(r0)     // Catch: java.lang.Throwable -> L14
            r1.append(r0)     // Catch: java.lang.Throwable -> L14
            java.lang.String r0 = " reqResp="
            r1.append(r0)     // Catch: java.lang.Throwable -> L14
            java.lang.Class<?> r0 = r3.protobufReqRespClass     // Catch: java.lang.Throwable -> L14
            java.lang.String r0 = r3.className(r0)     // Catch: java.lang.Throwable -> L14
            r1.append(r0)     // Catch: java.lang.Throwable -> L14
            java.lang.String r0 = " cb="
            r1.append(r0)     // Catch: java.lang.Throwable -> L14
            java.lang.Class<?> r0 = r3.protobufCallbackClass     // Catch: java.lang.Throwable -> L14
            java.lang.String r0 = r3.className(r0)     // Catch: java.lang.Throwable -> L14
            r1.append(r0)     // Catch: java.lang.Throwable -> L14
            java.lang.String r0 = " gy="
            r1.append(r0)     // Catch: java.lang.Throwable -> L14
            java.lang.Class<?> r0 = r3.protobufOnGYNetEndClass     // Catch: java.lang.Throwable -> L14
            java.lang.String r0 = r3.className(r0)     // Catch: java.lang.Throwable -> L14
            r1.append(r0)     // Catch: java.lang.Throwable -> L14
            java.lang.String r0 = " scene="
            r1.append(r0)     // Catch: java.lang.Throwable -> L14
            java.lang.Class<?> r0 = r3.protobufNetSceneBaseClass     // Catch: java.lang.Throwable -> L14
            java.lang.String r0 = r3.className(r0)     // Catch: java.lang.Throwable -> L14
            r1.append(r0)     // Catch: java.lang.Throwable -> L14
            java.lang.String r0 = " dispatch="
            r1.append(r0)     // Catch: java.lang.Throwable -> L14
            java.lang.reflect.Method r0 = r3.protobufStaticDispatchMethod     // Catch: java.lang.Throwable -> L14
            java.lang.String r0 = r3.methodName(r0)     // Catch: java.lang.Throwable -> L14
            r1.append(r0)     // Catch: java.lang.Throwable -> L14
            java.lang.String r0 = " sceneEnd="
            r1.append(r0)     // Catch: java.lang.Throwable -> L14
            java.util.List<java.lang.reflect.Method> r0 = r3.protobufSceneEndMethods     // Catch: java.lang.Throwable -> L14
            if (r0 != 0) goto L121
            r0 = 0
            goto L125
        L121:
            int r0 = r0.size()     // Catch: java.lang.Throwable -> L14
        L125:
            r1.append(r0)     // Catch: java.lang.Throwable -> L14
            java.lang.String r0 = r1.toString()     // Catch: java.lang.Throwable -> L14
            r3.logDetail(r0)     // Catch: java.lang.Throwable -> L14
            return
        L130:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "[Hchat:DexFinder] resolveProtobufPacketApi 失败: "
            r1.<init>(r2)
            bc.e.s(r0, r1, r0)
            return
    }

    private void resolveReceiveLuckyMoney() {
            r5 = this;
            org.luckypray.dexkit.DexKitBridge r0 = r5.dexKit     // Catch: java.lang.Throwable -> L40
            java.lang.String r1 = "cgi-bin/mmpay-bin/receivewxhb"
            java.lang.String[] r1 = new java.lang.String[]{r1}     // Catch: java.lang.Throwable -> L40
            ch.c r1 = r5.mkClassUsingStrings(r1)     // Catch: java.lang.Throwable -> L40
            hh.j r0 = r0.findClass(r1)     // Catch: java.lang.Throwable -> L40
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L40
        L14:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L40
            r2 = 7
            if (r1 == 0) goto L43
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L40
            hh.i r1 = (hh.i) r1     // Catch: java.lang.Throwable -> L40
            lh.a r1 = r1.p()     // Catch: java.lang.Throwable -> L14
            java.lang.String r1 = r1.f8057g     // Catch: java.lang.Throwable -> L14
            java.lang.ClassLoader r3 = r5.classLoader     // Catch: java.lang.Throwable -> L14
            java.lang.Class r1 = h.Hchat.utils.KavaReflector.loadClass(r1, r3)     // Catch: java.lang.Throwable -> L14
            r3 = 10
            r4 = 8
            int[] r3 = new int[]{r2, r3, r4}     // Catch: java.lang.Throwable -> L14
            java.lang.reflect.Constructor r3 = r5.findFirstCtorByArgCounts(r1, r3)     // Catch: java.lang.Throwable -> L14
            if (r3 == 0) goto L14
            r5.receiveLuckyMoneyClass = r1     // Catch: java.lang.Throwable -> L14
            r5.receiveCtor = r3     // Catch: java.lang.Throwable -> L14
            goto L43
        L40:
            r0 = move-exception
            goto Le6
        L43:
            java.lang.Class<?> r0 = r5.receiveLuckyMoneyClass     // Catch: java.lang.Throwable -> L40
            if (r0 != 0) goto L7d
            org.luckypray.dexkit.DexKitBridge r0 = r5.dexKit     // Catch: java.lang.Throwable -> L40
            java.lang.String r1 = "receivehongbao"
            java.lang.String[] r1 = new java.lang.String[]{r1}     // Catch: java.lang.Throwable -> L40
            ch.c r1 = r5.mkClassUsingStrings(r1)     // Catch: java.lang.Throwable -> L40
            hh.j r0 = r0.findClass(r1)     // Catch: java.lang.Throwable -> L40
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L40
        L5b:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L40
            if (r1 == 0) goto L7d
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L40
            hh.i r1 = (hh.i) r1     // Catch: java.lang.Throwable -> L40
            lh.a r1 = r1.p()     // Catch: java.lang.Throwable -> L5b
            java.lang.String r1 = r1.f8057g     // Catch: java.lang.Throwable -> L5b
            java.lang.ClassLoader r3 = r5.classLoader     // Catch: java.lang.Throwable -> L5b
            java.lang.Class r1 = h.Hchat.utils.KavaReflector.loadClass(r1, r3)     // Catch: java.lang.Throwable -> L5b
            java.lang.reflect.Constructor r3 = r5.findCtorByArgCount(r1, r2)     // Catch: java.lang.Throwable -> L5b
            if (r3 == 0) goto L5b
            r5.receiveLuckyMoneyClass = r1     // Catch: java.lang.Throwable -> L5b
            r5.receiveCtor = r3     // Catch: java.lang.Throwable -> L5b
        L7d:
            org.luckypray.dexkit.DexKitBridge r0 = r5.dexKit     // Catch: java.lang.Throwable -> L40
            java.lang.String r1 = "receiveunion"
            java.lang.String[] r1 = new java.lang.String[]{r1}     // Catch: java.lang.Throwable -> L40
            ch.e r1 = r5.mkMethodUsingStrings(r1)     // Catch: java.lang.Throwable -> L40
            hh.p r0 = r0.findMethod(r1)     // Catch: java.lang.Throwable -> L40
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L40
            r1 = 0
        L92:
            boolean r2 = r0.hasNext()     // Catch: java.lang.Throwable -> L40
            r3 = 6
            if (r2 == 0) goto Lb8
            java.lang.Object r2 = r0.next()     // Catch: java.lang.Throwable -> L40
            hh.o r2 = (hh.o) r2     // Catch: java.lang.Throwable -> L40
            lh.d r2 = r2.p()     // Catch: java.lang.Throwable -> L92
            java.lang.String r2 = r2.f8063g     // Catch: java.lang.Throwable -> L92
            java.lang.ClassLoader r4 = r5.classLoader     // Catch: java.lang.Throwable -> L92
            java.lang.Class r2 = h.Hchat.utils.KavaReflector.loadClass(r2, r4)     // Catch: java.lang.Throwable -> L92
            if (r1 != 0) goto Lae
            r1 = r2
        Lae:
            java.lang.reflect.Constructor r4 = r5.findCtorByArgCount(r2, r3)     // Catch: java.lang.Throwable -> L92
            if (r4 == 0) goto L92
            r5.receiveLuckyMoneyUnionClass = r2     // Catch: java.lang.Throwable -> L92
            r5.unionReceiveCtor = r4     // Catch: java.lang.Throwable -> L92
        Lb8:
            java.lang.Class<?> r0 = r5.receiveLuckyMoneyUnionClass     // Catch: java.lang.Throwable -> L40
            if (r0 != 0) goto Lc6
            r5.receiveLuckyMoneyUnionClass = r1     // Catch: java.lang.Throwable -> L40
            if (r1 == 0) goto Lc6
            java.lang.reflect.Constructor r0 = r5.findCtorByArgCount(r1, r3)     // Catch: java.lang.Throwable -> L40
            r5.unionReceiveCtor = r0     // Catch: java.lang.Throwable -> L40
        Lc6:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L40
            r0.<init>()     // Catch: java.lang.Throwable -> L40
            java.lang.String r1 = "收红包类: "
            r0.append(r1)     // Catch: java.lang.Throwable -> L40
            java.lang.Class<?> r1 = r5.receiveLuckyMoneyClass     // Catch: java.lang.Throwable -> L40
            if (r1 == 0) goto Ld9
            java.lang.String r1 = r1.getName()     // Catch: java.lang.Throwable -> L40
            goto Ldb
        Ld9:
            java.lang.String r1 = "null"
        Ldb:
            r0.append(r1)     // Catch: java.lang.Throwable -> L40
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L40
            r5.logDetail(r0)     // Catch: java.lang.Throwable -> L40
            goto Lf0
        Le6:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "[Hchat:DexFinder] resolveReceive 失败: "
            r1.<init>(r2)
            bc.e.s(r0, r1, r0)
        Lf0:
            return
    }

    private void resolveSendFileAttachHelpers(java.lang.Class<?> r4) {
            r3 = this;
            if (r4 != 0) goto L3
            goto L51
        L3:
            java.lang.reflect.Method r0 = r3.sendFileAttachDirMethod     // Catch: java.lang.Throwable -> L51
            if (r0 != 0) goto L2d
            java.util.List r0 = h.Hchat.utils.KavaReflector.declaredMethods(r4)     // Catch: java.lang.Throwable -> L51
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L51
        Lf:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L51
            if (r1 == 0) goto L2d
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L51
            java.lang.reflect.Method r1 = (java.lang.reflect.Method) r1     // Catch: java.lang.Throwable -> L51
            boolean r2 = r3.isStaticNoArgStringMethod(r1)     // Catch: java.lang.Throwable -> L51
            if (r2 != 0) goto L22
            goto Lf
        L22:
            h.Hchat.utils.KavaReflector.accessible(r1)     // Catch: java.lang.Throwable -> L51
            boolean r2 = r3.looksLikeAttachDir(r1)     // Catch: java.lang.Throwable -> L51
            if (r2 == 0) goto Lf
            r3.sendFileAttachDirMethod = r1     // Catch: java.lang.Throwable -> L51
        L2d:
            java.lang.reflect.Method r0 = r3.sendFileAttachPathMethod     // Catch: java.lang.Throwable -> L51
            if (r0 != 0) goto L51
            java.util.List r4 = h.Hchat.utils.KavaReflector.declaredMethods(r4)     // Catch: java.lang.Throwable -> L51
            java.util.Iterator r4 = r4.iterator()     // Catch: java.lang.Throwable -> L51
        L39:
            boolean r0 = r4.hasNext()     // Catch: java.lang.Throwable -> L51
            if (r0 == 0) goto L51
            java.lang.Object r0 = r4.next()     // Catch: java.lang.Throwable -> L51
            java.lang.reflect.Method r0 = (java.lang.reflect.Method) r0     // Catch: java.lang.Throwable -> L51
            boolean r1 = r3.isSendFileAttachPathMethod(r0)     // Catch: java.lang.Throwable -> L51
            if (r1 != 0) goto L4c
            goto L39
        L4c:
            h.Hchat.utils.KavaReflector.accessible(r0)     // Catch: java.lang.Throwable -> L51
            r3.sendFileAttachPathMethod = r0     // Catch: java.lang.Throwable -> L51
        L51:
            return
    }

    private void resolveSendImageAsyncAppInfoApi() {
            r3 = this;
            java.lang.String r0 = "图片新版appid链路: params="
            boolean r1 = r3.isSendImageAsyncAppInfoApiReady()     // Catch: java.lang.Throwable -> L17
            if (r1 == 0) goto L9
            return
        L9:
            r3.resolveSendImageAsyncParamClasses()     // Catch: java.lang.Throwable -> L17
            java.lang.Class<?> r1 = r3.sendImageAppInfoClass     // Catch: java.lang.Throwable -> L17
            if (r1 != 0) goto L19
            java.lang.Class r1 = r3.findSendImageAppInfoClass()     // Catch: java.lang.Throwable -> L17
            r3.sendImageAppInfoClass = r1     // Catch: java.lang.Throwable -> L17
            goto L19
        L17:
            r0 = move-exception
            goto L67
        L19:
            java.lang.reflect.Method r1 = r3.sendImageAsyncSubmitMethod     // Catch: java.lang.Throwable -> L17
            boolean r1 = r3.isSendImageAsyncSubmitMethod(r1)     // Catch: java.lang.Throwable -> L17
            if (r1 != 0) goto L27
            java.lang.reflect.Method r1 = r3.findSendImageAsyncSubmitMethod()     // Catch: java.lang.Throwable -> L17
            r3.sendImageAsyncSubmitMethod = r1     // Catch: java.lang.Throwable -> L17
        L27:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L17
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L17
            java.lang.Class<?> r0 = r3.sendImageAsyncParamsClass     // Catch: java.lang.Throwable -> L17
            java.lang.String r0 = r3.className(r0)     // Catch: java.lang.Throwable -> L17
            r1.append(r0)     // Catch: java.lang.Throwable -> L17
            java.lang.String r0 = " cross="
            r1.append(r0)     // Catch: java.lang.Throwable -> L17
            java.lang.Class<?> r0 = r3.sendImageCrossParamsClass     // Catch: java.lang.Throwable -> L17
            java.lang.String r0 = r3.className(r0)     // Catch: java.lang.Throwable -> L17
            r1.append(r0)     // Catch: java.lang.Throwable -> L17
            java.lang.String r0 = " appinfo="
            r1.append(r0)     // Catch: java.lang.Throwable -> L17
            java.lang.Class<?> r0 = r3.sendImageAppInfoClass     // Catch: java.lang.Throwable -> L17
            java.lang.String r0 = r3.className(r0)     // Catch: java.lang.Throwable -> L17
            r1.append(r0)     // Catch: java.lang.Throwable -> L17
            java.lang.String r0 = " submit="
            r1.append(r0)     // Catch: java.lang.Throwable -> L17
            java.lang.reflect.Method r0 = r3.sendImageAsyncSubmitMethod     // Catch: java.lang.Throwable -> L17
            java.lang.String r0 = r3.methodName(r0)     // Catch: java.lang.Throwable -> L17
            r1.append(r0)     // Catch: java.lang.Throwable -> L17
            java.lang.String r0 = r1.toString()     // Catch: java.lang.Throwable -> L17
            r3.logDetail(r0)     // Catch: java.lang.Throwable -> L17
            return
        L67:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "[Hchat:DexFinder] resolveSendImageAsyncAppInfoApi 失败: "
            r1.<init>(r2)
            bc.e.s(r0, r1, r0)
            return
    }

    private void resolveSendImageAsyncParamClasses() {
            r6 = this;
            java.lang.Class<?> r0 = r6.sendImageAsyncParamsClass
            if (r0 == 0) goto L9
            java.lang.Class<?> r0 = r6.sendImageCrossParamsClass
            if (r0 == 0) goto L9
            goto L4f
        L9:
            org.luckypray.dexkit.DexKitBridge r0 = r6.dexKit     // Catch: java.lang.Throwable -> L4f
            java.lang.String r1 = "msg_raw_img_send"
            java.lang.String r2 = "crossParams"
            java.lang.String r3 = "imgPath"
            java.lang.String r4 = "fromUsername"
            java.lang.String r5 = "toUsername"
            java.lang.String[] r1 = new java.lang.String[]{r1, r2, r3, r4, r5}     // Catch: java.lang.Throwable -> L4f
            ch.c r1 = r6.mkClassUsingStrings(r1)     // Catch: java.lang.Throwable -> L4f
            hh.j r0 = r0.findClass(r1)     // Catch: java.lang.Throwable -> L4f
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L4f
        L25:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L4f
            if (r1 == 0) goto L4f
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L4f
            hh.i r1 = (hh.i) r1     // Catch: java.lang.Throwable -> L4f
            lh.a r1 = r1.p()     // Catch: java.lang.Throwable -> L25
            java.lang.String r1 = r1.f8057g     // Catch: java.lang.Throwable -> L25
            java.lang.ClassLoader r2 = r6.classLoader     // Catch: java.lang.Throwable -> L25
            java.lang.Class r1 = h.Hchat.utils.KavaReflector.loadClass(r1, r2)     // Catch: java.lang.Throwable -> L25
            java.lang.reflect.Constructor r2 = r6.findSendImageAsyncParamsCtor(r1)     // Catch: java.lang.Throwable -> L25
            if (r2 != 0) goto L44
            goto L25
        L44:
            r6.sendImageAsyncParamsClass = r1     // Catch: java.lang.Throwable -> L25
            java.lang.Class[] r1 = r2.getParameterTypes()     // Catch: java.lang.Throwable -> L25
            r2 = 4
            r1 = r1[r2]     // Catch: java.lang.Throwable -> L25
            r6.sendImageCrossParamsClass = r1     // Catch: java.lang.Throwable -> L25
        L4f:
            return
    }

    private void resolveSendPatSceneApi() {
            r6 = this;
            java.lang.String r0 = "MicroMsg.NetSceneSendPat"
            java.lang.String r1 = "/cgi-bin/micromsg-bin/sendpat"
            java.lang.reflect.Constructor<?> r2 = r6.sendPatSceneCtor     // Catch: java.lang.Throwable -> L11
            if (r2 != 0) goto L13
            java.lang.Class<?> r2 = r6.sendPatSceneClass     // Catch: java.lang.Throwable -> L11
            java.lang.reflect.Constructor r2 = r6.findSendPatSceneCtor(r2)     // Catch: java.lang.Throwable -> L11
            r6.sendPatSceneCtor = r2     // Catch: java.lang.Throwable -> L11
            goto L13
        L11:
            r0 = move-exception
            goto L63
        L13:
            java.lang.reflect.Constructor<?> r2 = r6.sendPatSceneCtor     // Catch: java.lang.Throwable -> L11
            if (r2 == 0) goto L18
            goto L62
        L18:
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L11
            r2.<init>()     // Catch: java.lang.Throwable -> L11
            java.lang.String[] r3 = new java.lang.String[]{r1}     // Catch: java.lang.Throwable -> L11
            java.lang.String[] r4 = new java.lang.String[]{r0}     // Catch: java.lang.Throwable -> L11
            java.lang.String r5 = "sendpat"
            java.lang.String[] r5 = new java.lang.String[]{r5}     // Catch: java.lang.Throwable -> L11
            java.lang.String[][] r3 = new java.lang.String[][]{r3, r4, r5}     // Catch: java.lang.Throwable -> L11
            r4 = 20
            r6.collectSendTextClassCandidates(r2, r4, r3)     // Catch: java.lang.Throwable -> L11
            java.lang.String[] r1 = new java.lang.String[]{r1}     // Catch: java.lang.Throwable -> L11
            java.lang.String[] r0 = new java.lang.String[]{r0}     // Catch: java.lang.Throwable -> L11
            java.lang.String[][] r0 = new java.lang.String[][]{r1, r0}     // Catch: java.lang.Throwable -> L11
            r6.collectSendTextMethodOwnerCandidates(r2, r4, r0)     // Catch: java.lang.Throwable -> L11
            java.util.Iterator r0 = r2.iterator()     // Catch: java.lang.Throwable -> L11
        L47:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L11
            if (r1 == 0) goto L62
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L11
            java.lang.Class r1 = (java.lang.Class) r1     // Catch: java.lang.Throwable -> L11
            boolean r2 = r6.isSendPatSceneClass(r1)     // Catch: java.lang.Throwable -> L11
            if (r2 != 0) goto L5a
            goto L47
        L5a:
            r6.sendPatSceneClass = r1     // Catch: java.lang.Throwable -> L11
            java.lang.reflect.Constructor r0 = r6.findSendPatSceneCtor(r1)     // Catch: java.lang.Throwable -> L11
            r6.sendPatSceneCtor = r0     // Catch: java.lang.Throwable -> L11
        L62:
            return
        L63:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "[Hchat:DexFinder] resolveSendPatSceneApi 失败: "
            r1.<init>(r2)
            bc.e.s(r0, r1, r0)
            return
    }

    private void resolveSnsUploadMethods() {
            r2 = this;
            java.lang.Class<?> r0 = r2.snsUploadPackHelperClass
            if (r0 == 0) goto L4c
            java.lang.reflect.Method r0 = r2.snsSetContentMethod
            if (r0 != 0) goto L10
            java.lang.String r0 = "setContentDes"
            java.lang.reflect.Method r0 = r2.findSnsHelperChainMethod(r0)
            r2.snsSetContentMethod = r0
        L10:
            java.lang.reflect.Method r0 = r2.snsSetSdkIdMethod
            if (r0 != 0) goto L1c
            java.lang.String r0 = "setSdkId"
            java.lang.reflect.Method r0 = r2.findSnsHelperChainMethod(r0)
            r2.snsSetSdkIdMethod = r0
        L1c:
            java.lang.reflect.Method r0 = r2.snsSetSdkAppNameMethod
            if (r0 != 0) goto L28
            java.lang.String r0 = "setSdkAppName"
            java.lang.reflect.Method r0 = r2.findSnsHelperChainMethod(r0)
            r2.snsSetSdkAppNameMethod = r0
        L28:
            java.lang.reflect.Method r0 = r2.snsAddImageMethod
            if (r0 != 0) goto L34
            java.lang.Class<?> r0 = r2.snsUploadPackHelperClass
            java.lang.reflect.Method r0 = r2.findSnsAddImageMethod(r0)
            r2.snsAddImageMethod = r0
        L34:
            java.lang.reflect.Method r0 = r2.snsAddVideoMethod
            if (r0 != 0) goto L40
            java.lang.Class<?> r0 = r2.snsUploadPackHelperClass
            java.lang.reflect.Method r0 = r2.findSnsAddVideoMethod(r0)
            r2.snsAddVideoMethod = r0
        L40:
            java.lang.reflect.Method r0 = r2.snsCommitMethod
            if (r0 != 0) goto L4c
            java.lang.Class<?> r0 = r2.snsUploadPackHelperClass
            java.lang.reflect.Method r0 = r2.findSnsCommitMethod(r0)
            r2.snsCommitMethod = r0
        L4c:
            java.lang.Class<?> r0 = r2.snsUploadManagerClass
            if (r0 == 0) goto L72
            java.lang.reflect.Method r1 = r2.snsUploadManagerGetterMethod
            if (r1 != 0) goto L5a
            java.lang.reflect.Method r0 = r2.findSnsUploadManagerGetter(r0)
            r2.snsUploadManagerGetterMethod = r0
        L5a:
            java.lang.reflect.Method r0 = r2.snsShareAppMsgMethod
            if (r0 != 0) goto L66
            java.lang.Class<?> r0 = r2.snsUploadManagerClass
            java.lang.reflect.Method r0 = r2.findSnsShareAppMsgMethod(r0)
            r2.snsShareAppMsgMethod = r0
        L66:
            java.lang.reflect.Method r0 = r2.snsUploadCheckMethod
            if (r0 != 0) goto L72
            java.lang.Class<?> r0 = r2.snsUploadManagerClass
            java.lang.reflect.Method r0 = r2.findSnsUploadCheckMethod(r0)
            r2.snsUploadCheckMethod = r0
        L72:
            return
    }

    private void resolveVoicePlaybackApi() {
            r5 = this;
            java.lang.reflect.Method r0 = r5.voicePlaybackStartMethod
            boolean r0 = r5.isVoicePlaybackStartMethod(r0)
            java.lang.Class r1 = java.lang.Boolean.TYPE
            r2 = 0
            if (r0 != 0) goto L1b
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            java.lang.Class r3 = java.lang.Integer.TYPE
            java.lang.Class[] r0 = new java.lang.Class[]{r0, r1, r1, r3}
            java.lang.String r3 = "start file name:[%s] speakerOn:[%b], isFullPath: %s, type: %s, userType: %s"
            java.lang.reflect.Method r0 = r5.findVoicePlaybackMethod(r2, r3, r1, r0)
            r5.voicePlaybackStartMethod = r0
        L1b:
            java.lang.reflect.Method r0 = r5.voicePlaybackStartMethod
            if (r0 == 0) goto L24
            java.lang.Class r0 = r0.getDeclaringClass()
            goto L25
        L24:
            r0 = r2
        L25:
            if (r0 != 0) goto L2e
            r5.voicePlaybackPauseMethod = r2
            r5.voicePlaybackResumeMethod = r2
            r5.voicePlaybackStopMethod = r2
            return
        L2e:
            java.lang.reflect.Method r2 = r5.voicePlaybackPauseMethod
            java.lang.Class[] r3 = new java.lang.Class[]{r1}
            boolean r2 = r5.isExactInstanceMethod(r2, r0, r1, r3)
            if (r2 != 0) goto L46
            java.lang.String r2 = "pause ret:%s"
            java.lang.Class[] r3 = new java.lang.Class[]{r1}
            java.lang.reflect.Method r2 = r5.findVoicePlaybackMethod(r0, r2, r1, r3)
            r5.voicePlaybackPauseMethod = r2
        L46:
            java.lang.reflect.Method r2 = r5.voicePlaybackResumeMethod
            r3 = 0
            java.lang.Class[] r4 = new java.lang.Class[r3]
            boolean r2 = r5.isExactInstanceMethod(r2, r0, r1, r4)
            if (r2 != 0) goto L5b
            java.lang.String r2 = "resumePlaying set mute false"
            java.lang.Class[] r3 = new java.lang.Class[r3]
            java.lang.reflect.Method r2 = r5.findVoicePlaybackMethod(r0, r2, r1, r3)
            r5.voicePlaybackResumeMethod = r2
        L5b:
            java.lang.reflect.Method r2 = r5.voicePlaybackStopMethod
            java.lang.Class[] r3 = new java.lang.Class[]{r1}
            java.lang.Class r4 = java.lang.Void.TYPE
            boolean r2 = r5.isExactInstanceMethod(r2, r0, r4, r3)
            if (r2 != 0) goto L75
            java.lang.String r2 = "stop player failed cause player is null %s"
            java.lang.Class[] r1 = new java.lang.Class[]{r1}
            java.lang.reflect.Method r0 = r5.findVoicePlaybackMethod(r0, r2, r4, r1)
            r5.voicePlaybackStopMethod = r0
        L75:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "语音播放API: start="
            r0.<init>(r1)
            java.lang.reflect.Method r1 = r5.voicePlaybackStartMethod
            java.lang.String r1 = r5.methodName(r1)
            r0.append(r1)
            java.lang.String r1 = " pause="
            r0.append(r1)
            java.lang.reflect.Method r1 = r5.voicePlaybackPauseMethod
            java.lang.String r1 = r5.methodName(r1)
            r0.append(r1)
            java.lang.String r1 = " resume="
            r0.append(r1)
            java.lang.reflect.Method r1 = r5.voicePlaybackResumeMethod
            java.lang.String r1 = r5.methodName(r1)
            r0.append(r1)
            java.lang.String r1 = " stop="
            r0.append(r1)
            java.lang.reflect.Method r1 = r5.voicePlaybackStopMethod
            java.lang.String r1 = r5.methodName(r1)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r5.logDetail(r0)
            return
    }

    private void resolveWishWxHb() {
            r5 = this;
            java.lang.String r0 = "/cgi-bin/mmpay-bin/wishwxhb"
            java.lang.String[] r0 = new java.lang.String[]{r0}     // Catch: java.lang.Throwable -> L4e
            java.lang.String r1 = "wishwxhb"
            java.lang.String[] r1 = new java.lang.String[]{r1}     // Catch: java.lang.Throwable -> L4e
            java.lang.String r2 = "NetSceneWishWxHb"
            java.lang.String[] r2 = new java.lang.String[]{r2}     // Catch: java.lang.Throwable -> L4e
            java.lang.String[][] r0 = new java.lang.String[][]{r0, r1, r2}     // Catch: java.lang.Throwable -> L4e
            r1 = 0
        L17:
            r2 = 3
            if (r1 >= r2) goto L58
            r2 = r0[r1]     // Catch: java.lang.Throwable -> L4e
            org.luckypray.dexkit.DexKitBridge r3 = r5.dexKit     // Catch: java.lang.Throwable -> L4e
            ch.c r2 = r5.mkClassUsingStrings(r2)     // Catch: java.lang.Throwable -> L4e
            hh.j r2 = r3.findClass(r2)     // Catch: java.lang.Throwable -> L4e
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> L4e
        L2a:
            boolean r3 = r2.hasNext()     // Catch: java.lang.Throwable -> L4e
            if (r3 == 0) goto L50
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Throwable -> L4e
            hh.i r3 = (hh.i) r3     // Catch: java.lang.Throwable -> L4e
            lh.a r3 = r3.p()     // Catch: java.lang.Throwable -> L2a
            java.lang.String r3 = r3.f8057g     // Catch: java.lang.Throwable -> L2a
            java.lang.ClassLoader r4 = r5.classLoader     // Catch: java.lang.Throwable -> L2a
            java.lang.Class r3 = h.Hchat.utils.KavaReflector.loadClass(r3, r4)     // Catch: java.lang.Throwable -> L2a
            r4 = 4
            java.lang.reflect.Constructor r4 = r5.findCtorByArgCount(r3, r4)     // Catch: java.lang.Throwable -> L2a
            if (r4 == 0) goto L2a
            r5.wishWxHbClass = r3     // Catch: java.lang.Throwable -> L2a
            r5.wishWxHbCtor = r4     // Catch: java.lang.Throwable -> L2a
            goto L50
        L4e:
            r0 = move-exception
            goto L78
        L50:
            java.lang.Class<?> r2 = r5.wishWxHbClass     // Catch: java.lang.Throwable -> L4e
            if (r2 == 0) goto L55
            goto L58
        L55:
            int r1 = r1 + 1
            goto L17
        L58:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L4e
            r0.<init>()     // Catch: java.lang.Throwable -> L4e
            java.lang.String r1 = "祝福语类: "
            r0.append(r1)     // Catch: java.lang.Throwable -> L4e
            java.lang.Class<?> r1 = r5.wishWxHbClass     // Catch: java.lang.Throwable -> L4e
            if (r1 == 0) goto L6b
            java.lang.String r1 = r1.getName()     // Catch: java.lang.Throwable -> L4e
            goto L6d
        L6b:
            java.lang.String r1 = "null"
        L6d:
            r0.append(r1)     // Catch: java.lang.Throwable -> L4e
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L4e
            r5.logDetail(r0)     // Catch: java.lang.Throwable -> L4e
            goto L82
        L78:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "[Hchat:DexFinder] resolveWish 失败: "
            r1.<init>(r2)
            bc.e.s(r0, r1, r0)
        L82:
            return
    }

    private boolean sameOrAssignable(java.lang.Class<?> r2, java.lang.Class<?> r3) {
            r1 = this;
            if (r2 == r3) goto L11
            boolean r0 = r2.isAssignableFrom(r3)
            if (r0 != 0) goto L11
            boolean r2 = r3.isAssignableFrom(r2)
            if (r2 == 0) goto Lf
            goto L11
        Lf:
            r2 = 0
            return r2
        L11:
            r2 = 1
            return r2
    }

    private boolean samePackage(java.lang.Class<?> r4, java.lang.Class<?> r5) {
            r3 = this;
            r0 = 0
            if (r4 == 0) goto L24
            if (r5 != 0) goto L6
            goto L24
        L6:
            java.lang.String r4 = r4.getName()
            java.lang.String r5 = r5.getName()
            r1 = 46
            int r2 = r4.lastIndexOf(r1)
            int r1 = r5.lastIndexOf(r1)
            if (r2 != r1) goto L24
            if (r2 < 0) goto L24
            boolean r4 = r4.regionMatches(r0, r5, r0, r2)
            if (r4 == 0) goto L24
            r4 = 1
            return r4
        L24:
            return r0
    }

    private void saveCache() {
            r3 = this;
            android.content.SharedPreferences r0 = r3.cachePrefs
            if (r0 == 0) goto L40e
            java.lang.String r0 = r3.runtimeCacheKey
            int r0 = r0.length()
            if (r0 != 0) goto Le
            goto L40e
        Le:
            android.content.SharedPreferences r0 = r3.cachePrefs     // Catch: java.lang.Throwable -> L403
            android.content.SharedPreferences$Editor r0 = r0.edit()     // Catch: java.lang.Throwable -> L403
            android.content.SharedPreferences$Editor r0 = r0.clear()     // Catch: java.lang.Throwable -> L403
            java.lang.String r1 = "cache.key"
            java.lang.String r2 = r3.runtimeCacheKey     // Catch: java.lang.Throwable -> L403
            r0.putString(r1, r2)     // Catch: java.lang.Throwable -> L403
            java.lang.String r1 = "addMsgClasses"
            java.util.List<java.lang.Class<?>> r2 = r3.addMsgClasses     // Catch: java.lang.Throwable -> L403
            java.lang.String r2 = r3.joinClassNames(r2)     // Catch: java.lang.Throwable -> L403
            r0.putString(r1, r2)     // Catch: java.lang.Throwable -> L403
            java.lang.String r1 = "receiveLuckyMoneyClass"
            java.lang.Class<?> r2 = r3.receiveLuckyMoneyClass     // Catch: java.lang.Throwable -> L403
            r3.putClass(r0, r1, r2)     // Catch: java.lang.Throwable -> L403
            java.lang.String r1 = "receiveLuckyMoneyUnionClass"
            java.lang.Class<?> r2 = r3.receiveLuckyMoneyUnionClass     // Catch: java.lang.Throwable -> L403
            r3.putClass(r0, r1, r2)     // Catch: java.lang.Throwable -> L403
            java.lang.String r1 = "openLuckyMoneyClass"
            java.lang.Class<?> r2 = r3.openLuckyMoneyClass     // Catch: java.lang.Throwable -> L403
            r3.putClass(r0, r1, r2)     // Catch: java.lang.Throwable -> L403
            java.lang.String r1 = "openLuckyMoneyUnionClass"
            java.lang.Class<?> r2 = r3.openLuckyMoneyUnionClass     // Catch: java.lang.Throwable -> L403
            r3.putClass(r0, r1, r2)     // Catch: java.lang.Throwable -> L403
            java.lang.String r1 = "netQueueClass"
            java.lang.Class<?> r2 = r3.netQueueClass     // Catch: java.lang.Throwable -> L403
            r3.putClass(r0, r1, r2)     // Catch: java.lang.Throwable -> L403
            java.lang.String r1 = "netQueueCandidateClasses"
            java.util.List<java.lang.Class<?>> r2 = r3.netQueueCandidateClasses     // Catch: java.lang.Throwable -> L403
            java.lang.String r2 = r3.joinClassNames(r2)     // Catch: java.lang.Throwable -> L403
            r0.putString(r1, r2)     // Catch: java.lang.Throwable -> L403
            java.lang.String r1 = "packetBaseClasses"
            java.util.List<java.lang.Class<?>> r2 = r3.packetBaseClasses     // Catch: java.lang.Throwable -> L403
            java.lang.String r2 = r3.joinClassNames(r2)     // Catch: java.lang.Throwable -> L403
            r0.putString(r1, r2)     // Catch: java.lang.Throwable -> L403
            java.lang.String r1 = "packetQueueClasses"
            java.util.List<java.lang.Class<?>> r2 = r3.packetQueueClasses     // Catch: java.lang.Throwable -> L403
            java.lang.String r2 = r3.joinClassNames(r2)     // Catch: java.lang.Throwable -> L403
            r0.putString(r1, r2)     // Catch: java.lang.Throwable -> L403
            java.lang.String r1 = "fakePacketClasses"
            java.util.List<java.lang.Class<?>> r2 = r3.fakePacketClasses     // Catch: java.lang.Throwable -> L403
            java.lang.String r2 = r3.joinClassNames(r2)     // Catch: java.lang.Throwable -> L403
            r0.putString(r1, r2)     // Catch: java.lang.Throwable -> L403
            java.lang.String r1 = "protobufRawReqClass"
            java.lang.Class<?> r2 = r3.protobufRawReqClass     // Catch: java.lang.Throwable -> L403
            r3.putClass(r0, r1, r2)     // Catch: java.lang.Throwable -> L403
            java.lang.String r1 = "protobufGenericRespClass"
            java.lang.Class<?> r2 = r3.protobufGenericRespClass     // Catch: java.lang.Throwable -> L403
            r3.putClass(r0, r1, r2)     // Catch: java.lang.Throwable -> L403
            java.lang.String r1 = "protobufConfigBuilderClass"
            java.lang.Class<?> r2 = r3.protobufConfigBuilderClass     // Catch: java.lang.Throwable -> L403
            r3.putClass(r0, r1, r2)     // Catch: java.lang.Throwable -> L403
            java.lang.String r1 = "protobufReqRespClass"
            java.lang.Class<?> r2 = r3.protobufReqRespClass     // Catch: java.lang.Throwable -> L403
            r3.putClass(r0, r1, r2)     // Catch: java.lang.Throwable -> L403
            java.lang.String r1 = "protobufCallbackClass"
            java.lang.Class<?> r2 = r3.protobufCallbackClass     // Catch: java.lang.Throwable -> L403
            r3.putClass(r0, r1, r2)     // Catch: java.lang.Throwable -> L403
            java.lang.String r1 = "protobufNewSendMsgReqClass"
            java.lang.Class<?> r2 = r3.protobufNewSendMsgReqClass     // Catch: java.lang.Throwable -> L403
            r3.putClass(r0, r1, r2)     // Catch: java.lang.Throwable -> L403
            java.lang.String r1 = "protobufOplogReqClass"
            java.lang.Class<?> r2 = r3.protobufOplogReqClass     // Catch: java.lang.Throwable -> L403
            r3.putClass(r0, r1, r2)     // Catch: java.lang.Throwable -> L403
            java.lang.String r1 = "protobufOnGYNetEndClass"
            java.lang.Class<?> r2 = r3.protobufOnGYNetEndClass     // Catch: java.lang.Throwable -> L403
            r3.putClass(r0, r1, r2)     // Catch: java.lang.Throwable -> L403
            java.lang.String r1 = "protobufNetSceneBaseClass"
            java.lang.Class<?> r2 = r3.protobufNetSceneBaseClass     // Catch: java.lang.Throwable -> L403
            r3.putClass(r0, r1, r2)     // Catch: java.lang.Throwable -> L403
            java.lang.String r1 = "protobufStaticDispatchMethod"
            java.lang.reflect.Method r2 = r3.protobufStaticDispatchMethod     // Catch: java.lang.Throwable -> L403
            r3.putMethod(r0, r1, r2)     // Catch: java.lang.Throwable -> L403
            java.lang.String r1 = "protobufSceneEndMethods"
            java.util.List<java.lang.reflect.Method> r2 = r3.protobufSceneEndMethods     // Catch: java.lang.Throwable -> L403
            r3.putMethodList(r0, r1, r2)     // Catch: java.lang.Throwable -> L403
            java.lang.String r1 = "wishWxHbClass"
            java.lang.Class<?> r2 = r3.wishWxHbClass     // Catch: java.lang.Throwable -> L403
            r3.putClass(r0, r1, r2)     // Catch: java.lang.Throwable -> L403
            java.lang.String r1 = "sendTextMsgClass"
            java.lang.Class<?> r2 = r3.sendTextMsgClass     // Catch: java.lang.Throwable -> L403
            r3.putClass(r0, r1, r2)     // Catch: java.lang.Throwable -> L403
            java.lang.String r1 = "serviceGetterMethod"
            java.lang.reflect.Method r2 = r3.serviceGetterMethod     // Catch: java.lang.Throwable -> L403
            r3.putMethod(r0, r1, r2)     // Catch: java.lang.Throwable -> L403
            java.lang.String r1 = "getContactAddMethods"
            java.util.List<java.lang.reflect.Method> r2 = r3.getContactAddMethods     // Catch: java.lang.Throwable -> L403
            r3.putMethodList(r0, r1, r2)     // Catch: java.lang.Throwable -> L403
            java.lang.String r1 = "getContactServiceGetters"
            java.util.List<java.lang.reflect.Method> r2 = r3.getContactServiceGetters     // Catch: java.lang.Throwable -> L403
            r3.putMethodList(r0, r1, r2)     // Catch: java.lang.Throwable -> L403
            java.lang.String r1 = "sendImageMethod"
            java.lang.reflect.Method r2 = r3.sendImageMethod     // Catch: java.lang.Throwable -> L403
            r3.putMethod(r0, r1, r2)     // Catch: java.lang.Throwable -> L403
            java.lang.String r1 = "sendImageAsyncParamsClass"
            java.lang.Class<?> r2 = r3.sendImageAsyncParamsClass     // Catch: java.lang.Throwable -> L403
            r3.putClass(r0, r1, r2)     // Catch: java.lang.Throwable -> L403
            java.lang.String r1 = "sendImageCrossParamsClass"
            java.lang.Class<?> r2 = r3.sendImageCrossParamsClass     // Catch: java.lang.Throwable -> L403
            r3.putClass(r0, r1, r2)     // Catch: java.lang.Throwable -> L403
            java.lang.String r1 = "sendImageAppInfoClass"
            java.lang.Class<?> r2 = r3.sendImageAppInfoClass     // Catch: java.lang.Throwable -> L403
            r3.putClass(r0, r1, r2)     // Catch: java.lang.Throwable -> L403
            java.lang.String r1 = "sendImageAsyncSubmitMethod"
            java.lang.reflect.Method r2 = r3.sendImageAsyncSubmitMethod     // Catch: java.lang.Throwable -> L403
            r3.putMethod(r0, r1, r2)     // Catch: java.lang.Throwable -> L403
            java.lang.String r1 = "imageCdnTaskClass"
            java.lang.Class<?> r2 = r3.imageCdnTaskClass     // Catch: java.lang.Throwable -> L403
            r3.putClass(r0, r1, r2)     // Catch: java.lang.Throwable -> L403
            java.lang.String r1 = "imageCdnSubmitMethod"
            java.lang.reflect.Method r2 = r3.imageCdnSubmitMethod     // Catch: java.lang.Throwable -> L403
            r3.putMethod(r0, r1, r2)     // Catch: java.lang.Throwable -> L403
            java.lang.String r1 = "imageCdnServiceGetterMethod"
            java.lang.reflect.Method r2 = r3.imageCdnServiceGetterMethod     // Catch: java.lang.Throwable -> L403
            r3.putMethod(r0, r1, r2)     // Catch: java.lang.Throwable -> L403
            java.lang.String r1 = "marsCdnManagerClass"
            java.lang.Class<?> r2 = r3.marsCdnManagerClass     // Catch: java.lang.Throwable -> L403
            r3.putClass(r0, r1, r2)     // Catch: java.lang.Throwable -> L403
            java.lang.String r1 = "marsCdnDownloadRequestClass"
            java.lang.Class<?> r2 = r3.marsCdnDownloadRequestClass     // Catch: java.lang.Throwable -> L403
            r3.putClass(r0, r1, r2)     // Catch: java.lang.Throwable -> L403
            java.lang.String r1 = "marsCdnDownloadCallbackClass"
            java.lang.Class<?> r2 = r3.marsCdnDownloadCallbackClass     // Catch: java.lang.Throwable -> L403
            r3.putClass(r0, r1, r2)     // Catch: java.lang.Throwable -> L403
            java.lang.String r1 = "marsCdnStartDownloadMethod"
            java.lang.reflect.Method r2 = r3.marsCdnStartDownloadMethod     // Catch: java.lang.Throwable -> L403
            r3.putMethod(r0, r1, r2)     // Catch: java.lang.Throwable -> L403
            java.lang.String r1 = "imageBestPathMethod"
            java.lang.reflect.Method r2 = r3.imageBestPathMethod     // Catch: java.lang.Throwable -> L403
            r3.putMethod(r0, r1, r2)     // Catch: java.lang.Throwable -> L403
            java.lang.String r1 = "imageStorageGetterMethod"
            java.lang.reflect.Method r2 = r3.imageStorageGetterMethod     // Catch: java.lang.Throwable -> L403
            r3.putMethod(r0, r1, r2)     // Catch: java.lang.Throwable -> L403
            java.lang.String r1 = "imageTokenPathMethod"
            java.lang.reflect.Method r2 = r3.imageTokenPathMethod     // Catch: java.lang.Throwable -> L403
            r3.putMethod(r0, r1, r2)     // Catch: java.lang.Throwable -> L403
            java.lang.String r1 = "sendFileMethod"
            java.lang.reflect.Method r2 = r3.sendFileMethod     // Catch: java.lang.Throwable -> L403
            r3.putMethod(r0, r1, r2)     // Catch: java.lang.Throwable -> L403
            java.lang.String r1 = "sendFileAttachDirMethod"
            java.lang.reflect.Method r2 = r3.sendFileAttachDirMethod     // Catch: java.lang.Throwable -> L403
            r3.putMethod(r0, r1, r2)     // Catch: java.lang.Throwable -> L403
            java.lang.String r1 = "sendFileAttachPathMethod"
            java.lang.reflect.Method r2 = r3.sendFileAttachPathMethod     // Catch: java.lang.Throwable -> L403
            r3.putMethod(r0, r1, r2)     // Catch: java.lang.Throwable -> L403
            java.lang.String r1 = "sendXmlAppMsgMethod"
            java.lang.reflect.Method r2 = r3.sendXmlAppMsgMethod     // Catch: java.lang.Throwable -> L403
            r3.putMethod(r0, r1, r2)     // Catch: java.lang.Throwable -> L403
            java.lang.String r1 = "appMsgParseMethod"
            java.lang.reflect.Method r2 = r3.appMsgParseMethod     // Catch: java.lang.Throwable -> L403
            r3.putMethod(r0, r1, r2)     // Catch: java.lang.Throwable -> L403
            java.lang.String r1 = "groupSolitairePluginClass"
            java.lang.Class<?> r2 = r3.groupSolitairePluginClass     // Catch: java.lang.Throwable -> L403
            r3.putClass(r0, r1, r2)     // Catch: java.lang.Throwable -> L403
            java.lang.String r1 = "groupSolitaireSendMethod"
            java.lang.reflect.Method r2 = r3.groupSolitaireSendMethod     // Catch: java.lang.Throwable -> L403
            r3.putMethod(r0, r1, r2)     // Catch: java.lang.Throwable -> L403
            java.lang.String r1 = "localSystemMessageMethod"
            java.lang.reflect.Method r2 = r3.localSystemMessageMethod     // Catch: java.lang.Throwable -> L403
            r3.putMethod(r0, r1, r2)     // Catch: java.lang.Throwable -> L403
            java.lang.String r1 = "localMessageClass"
            java.lang.Class<?> r2 = r3.localMessageClass     // Catch: java.lang.Throwable -> L403
            r3.putClass(r0, r1, r2)     // Catch: java.lang.Throwable -> L403
            java.lang.String r1 = "localMessageInsertMethod"
            java.lang.reflect.Method r2 = r3.localMessageInsertMethod     // Catch: java.lang.Throwable -> L403
            r3.putMethod(r0, r1, r2)     // Catch: java.lang.Throwable -> L403
            java.lang.String r1 = "localMessageCreateTimeMethod"
            java.lang.reflect.Method r2 = r3.localMessageCreateTimeMethod     // Catch: java.lang.Throwable -> L403
            r3.putMethod(r0, r1, r2)     // Catch: java.lang.Throwable -> L403
            java.lang.String r1 = "sendVideoMethod"
            java.lang.reflect.Method r2 = r3.sendVideoMethod     // Catch: java.lang.Throwable -> L403
            r3.putMethod(r0, r1, r2)     // Catch: java.lang.Throwable -> L403
            java.lang.String r1 = "sendVideoTaskClass"
            java.lang.Class<?> r2 = r3.sendVideoTaskClass     // Catch: java.lang.Throwable -> L403
            r3.putClass(r0, r1, r2)     // Catch: java.lang.Throwable -> L403
            java.lang.String r1 = "videoPathMethod"
            java.lang.reflect.Method r2 = r3.videoPathMethod     // Catch: java.lang.Throwable -> L403
            r3.putMethod(r0, r1, r2)     // Catch: java.lang.Throwable -> L403
            java.lang.String r1 = "videoPathOwnerGetterMethod"
            java.lang.reflect.Method r2 = r3.videoPathOwnerGetterMethod     // Catch: java.lang.Throwable -> L403
            r3.putMethod(r0, r1, r2)     // Catch: java.lang.Throwable -> L403
            java.lang.String r1 = "videoInfoClass"
            java.lang.Class<?> r2 = r3.videoInfoClass     // Catch: java.lang.Throwable -> L403
            r3.putClass(r0, r1, r2)     // Catch: java.lang.Throwable -> L403
            java.lang.String r1 = "videoInfoByFileNameMethod"
            java.lang.reflect.Method r2 = r3.videoInfoByFileNameMethod     // Catch: java.lang.Throwable -> L403
            r3.putMethod(r0, r1, r2)     // Catch: java.lang.Throwable -> L403
            java.lang.String r1 = "transferOperationClass"
            java.lang.Class<?> r2 = r3.transferOperationClass     // Catch: java.lang.Throwable -> L403
            r3.putClass(r0, r1, r2)     // Catch: java.lang.Throwable -> L403
            java.lang.String r1 = "transferQueryClass"
            java.lang.Class<?> r2 = r3.transferQueryClass     // Catch: java.lang.Throwable -> L403
            r3.putClass(r0, r1, r2)     // Catch: java.lang.Throwable -> L403
            java.lang.String r1 = "transferQueryResponseMethod"
            java.lang.reflect.Method r2 = r3.transferQueryResponseMethod     // Catch: java.lang.Throwable -> L403
            r3.putMethod(r0, r1, r2)     // Catch: java.lang.Throwable -> L403
            java.lang.String r1 = "verifyUserClass"
            java.lang.Class<?> r2 = r3.verifyUserClass     // Catch: java.lang.Throwable -> L403
            r3.putClass(r0, r1, r2)     // Catch: java.lang.Throwable -> L403
            java.lang.String r1 = "contactCardXmlMethod"
            java.lang.reflect.Method r2 = r3.contactCardXmlMethod     // Catch: java.lang.Throwable -> L403
            r3.putMethod(r0, r1, r2)     // Catch: java.lang.Throwable -> L403
            java.lang.String r1 = "patDisplayTemplateMethod"
            java.lang.reflect.Method r2 = r3.patDisplayTemplateMethod     // Catch: java.lang.Throwable -> L403
            r3.putMethod(r0, r1, r2)     // Catch: java.lang.Throwable -> L403
            java.lang.String r1 = "patExtensionClass"
            java.lang.Class<?> r2 = r3.patExtensionClass     // Catch: java.lang.Throwable -> L403
            r3.putClass(r0, r1, r2)     // Catch: java.lang.Throwable -> L403
            java.lang.String r1 = "patCreatePairMethod"
            java.lang.reflect.Method r2 = r3.patCreatePairMethod     // Catch: java.lang.Throwable -> L403
            r3.putMethod(r0, r1, r2)     // Catch: java.lang.Throwable -> L403
            java.lang.String r1 = "patSuffixMethod"
            java.lang.reflect.Method r2 = r3.patSuffixMethod     // Catch: java.lang.Throwable -> L403
            r3.putMethod(r0, r1, r2)     // Catch: java.lang.Throwable -> L403
            java.lang.String r1 = "patCanSendMethod"
            java.lang.reflect.Method r2 = r3.patCanSendMethod     // Catch: java.lang.Throwable -> L403
            r3.putMethod(r0, r1, r2)     // Catch: java.lang.Throwable -> L403
            java.lang.String r1 = "sendPatSceneClass"
            java.lang.Class<?> r2 = r3.sendPatSceneClass     // Catch: java.lang.Throwable -> L403
            r3.putClass(r0, r1, r2)     // Catch: java.lang.Throwable -> L403
            java.lang.String r1 = "voiceStartRecordMethod"
            java.lang.reflect.Method r2 = r3.voiceStartRecordMethod     // Catch: java.lang.Throwable -> L403
            r3.putMethod(r0, r1, r2)     // Catch: java.lang.Throwable -> L403
            java.lang.String r1 = "voiceFullPathMethod"
            java.lang.reflect.Method r2 = r3.voiceFullPathMethod     // Catch: java.lang.Throwable -> L403
            r3.putMethod(r0, r1, r2)     // Catch: java.lang.Throwable -> L403
            java.lang.String r1 = "voiceFinishRecordMethod"
            java.lang.reflect.Method r2 = r3.voiceFinishRecordMethod     // Catch: java.lang.Throwable -> L403
            r3.putMethod(r0, r1, r2)     // Catch: java.lang.Throwable -> L403
            java.lang.String r1 = "voiceInfoQueryMethod"
            java.lang.reflect.Method r2 = r3.voiceInfoQueryMethod     // Catch: java.lang.Throwable -> L403
            r3.putMethod(r0, r1, r2)     // Catch: java.lang.Throwable -> L403
            java.lang.String r1 = "voiceUploadClass"
            java.lang.Class<?> r2 = r3.voiceUploadClass     // Catch: java.lang.Throwable -> L403
            r3.putClass(r0, r1, r2)     // Catch: java.lang.Throwable -> L403
            java.lang.String r1 = "voicePlaybackStartMethod"
            java.lang.reflect.Method r2 = r3.voicePlaybackStartMethod     // Catch: java.lang.Throwable -> L403
            r3.putMethod(r0, r1, r2)     // Catch: java.lang.Throwable -> L403
            java.lang.String r1 = "voicePlaybackPauseMethod"
            java.lang.reflect.Method r2 = r3.voicePlaybackPauseMethod     // Catch: java.lang.Throwable -> L403
            r3.putMethod(r0, r1, r2)     // Catch: java.lang.Throwable -> L403
            java.lang.String r1 = "voicePlaybackResumeMethod"
            java.lang.reflect.Method r2 = r3.voicePlaybackResumeMethod     // Catch: java.lang.Throwable -> L403
            r3.putMethod(r0, r1, r2)     // Catch: java.lang.Throwable -> L403
            java.lang.String r1 = "voicePlaybackStopMethod"
            java.lang.reflect.Method r2 = r3.voicePlaybackStopMethod     // Catch: java.lang.Throwable -> L403
            r3.putMethod(r0, r1, r2)     // Catch: java.lang.Throwable -> L403
            java.lang.String r1 = "emojiSendMethod"
            java.lang.reflect.Method r2 = r3.emojiSendMethod     // Catch: java.lang.Throwable -> L403
            r3.putMethod(r0, r1, r2)     // Catch: java.lang.Throwable -> L403
            java.lang.String r1 = "emojiManagerSendMethod"
            java.lang.reflect.Method r2 = r3.emojiManagerSendMethod     // Catch: java.lang.Throwable -> L403
            r3.putMethod(r0, r1, r2)     // Catch: java.lang.Throwable -> L403
            java.lang.String r1 = "emojiGetByMd5Method"
            java.lang.reflect.Method r2 = r3.emojiGetByMd5Method     // Catch: java.lang.Throwable -> L403
            r3.putMethod(r0, r1, r2)     // Catch: java.lang.Throwable -> L403
            java.lang.String r1 = "emojiCreateInfoMethod"
            java.lang.reflect.Method r2 = r3.emojiCreateInfoMethod     // Catch: java.lang.Throwable -> L403
            r3.putMethod(r0, r1, r2)     // Catch: java.lang.Throwable -> L403
            java.lang.String r1 = "emojiUpdateInfoMethod"
            java.lang.reflect.Method r2 = r3.emojiUpdateInfoMethod     // Catch: java.lang.Throwable -> L403
            r3.putMethod(r0, r1, r2)     // Catch: java.lang.Throwable -> L403
            java.lang.String r1 = "emojiAccPathMethod"
            java.lang.reflect.Method r2 = r3.emojiAccPathMethod     // Catch: java.lang.Throwable -> L403
            r3.putMethod(r0, r1, r2)     // Catch: java.lang.Throwable -> L403
            java.lang.String r1 = "emojiCheckGifMethod"
            java.lang.reflect.Method r2 = r3.emojiCheckGifMethod     // Catch: java.lang.Throwable -> L403
            r3.putMethod(r0, r1, r2)     // Catch: java.lang.Throwable -> L403
            java.lang.String r1 = "emojiFilePathMethod"
            java.lang.reflect.Method r2 = r3.emojiFilePathMethod     // Catch: java.lang.Throwable -> L403
            r3.putMethod(r0, r1, r2)     // Catch: java.lang.Throwable -> L403
            java.lang.String r1 = "emojiDecodeDataMethod"
            java.lang.reflect.Method r2 = r3.emojiDecodeDataMethod     // Catch: java.lang.Throwable -> L403
            r3.putMethod(r0, r1, r2)     // Catch: java.lang.Throwable -> L403
            java.lang.String r1 = "emojiDecodeManagerGetterMethod"
            java.lang.reflect.Method r2 = r3.emojiDecodeManagerGetterMethod     // Catch: java.lang.Throwable -> L403
            r3.putMethod(r0, r1, r2)     // Catch: java.lang.Throwable -> L403
            java.lang.String r1 = "favoriteItemClass"
            java.lang.Class<?> r2 = r3.favoriteItemClass     // Catch: java.lang.Throwable -> L403
            r3.putClass(r0, r1, r2)     // Catch: java.lang.Throwable -> L403
            java.lang.String r1 = "favoriteItemConvertFromCursorMethod"
            java.lang.reflect.Method r2 = r3.favoriteItemConvertFromCursorMethod     // Catch: java.lang.Throwable -> L403
            r3.putMethod(r0, r1, r2)     // Catch: java.lang.Throwable -> L403
            java.lang.String r1 = "favoriteServiceClass"
            java.lang.Class<?> r2 = r3.favoriteServiceClass     // Catch: java.lang.Throwable -> L403
            r3.putClass(r0, r1, r2)     // Catch: java.lang.Throwable -> L403
            java.lang.String r1 = "favoriteServiceResolverMethod"
            java.lang.reflect.Method r2 = r3.favoriteServiceResolverMethod     // Catch: java.lang.Throwable -> L403
            r3.putMethod(r0, r1, r2)     // Catch: java.lang.Throwable -> L403
            java.lang.String r1 = "favoriteStorageGetterMethod"
            java.lang.reflect.Method r2 = r3.favoriteStorageGetterMethod     // Catch: java.lang.Throwable -> L403
            r3.putMethod(r0, r1, r2)     // Catch: java.lang.Throwable -> L403
            java.lang.String r1 = "favoriteListMethod"
            java.lang.reflect.Method r2 = r3.favoriteListMethod     // Catch: java.lang.Throwable -> L403
            r3.putMethod(r0, r1, r2)     // Catch: java.lang.Throwable -> L403
            java.lang.String r1 = "favoriteListNextMethod"
            java.lang.reflect.Method r2 = r3.favoriteListNextMethod     // Catch: java.lang.Throwable -> L403
            r3.putMethod(r0, r1, r2)     // Catch: java.lang.Throwable -> L403
            java.lang.String r1 = "favoriteListCursorMethod"
            java.lang.reflect.Method r2 = r3.favoriteListCursorMethod     // Catch: java.lang.Throwable -> L403
            r3.putMethod(r0, r1, r2)     // Catch: java.lang.Throwable -> L403
            java.lang.String r1 = "favoriteGetMethod"
            java.lang.reflect.Method r2 = r3.favoriteGetMethod     // Catch: java.lang.Throwable -> L403
            r3.putMethod(r0, r1, r2)     // Catch: java.lang.Throwable -> L403
            java.lang.String r1 = "favoriteSendMethod"
            java.lang.reflect.Method r2 = r3.favoriteSendMethod     // Catch: java.lang.Throwable -> L403
            r3.putMethod(r0, r1, r2)     // Catch: java.lang.Throwable -> L403
            java.lang.String r1 = "favoriteSendParamClass"
            java.lang.Class<?> r2 = r3.favoriteSendParamClass     // Catch: java.lang.Throwable -> L403
            r3.putClass(r0, r1, r2)     // Catch: java.lang.Throwable -> L403
            java.lang.String r1 = "mmKernelClass"
            java.lang.Class<?> r2 = r3.mmKernelClass     // Catch: java.lang.Throwable -> L403
            r3.putClass(r0, r1, r2)     // Catch: java.lang.Throwable -> L403
            java.lang.String r1 = "coreStorageClass"
            java.lang.Class<?> r2 = r3.coreStorageClass     // Catch: java.lang.Throwable -> L403
            r3.putClass(r0, r1, r2)     // Catch: java.lang.Throwable -> L403
            java.lang.String r1 = "configStorageClass"
            java.lang.Class<?> r2 = r3.configStorageClass     // Catch: java.lang.Throwable -> L403
            r3.putClass(r0, r1, r2)     // Catch: java.lang.Throwable -> L403
            java.lang.String r1 = "sqliteDbWrapperClass"
            java.lang.Class<?> r2 = r3.sqliteDbWrapperClass     // Catch: java.lang.Throwable -> L403
            r3.putClass(r0, r1, r2)     // Catch: java.lang.Throwable -> L403
            java.lang.String r1 = "coreStorageGetter"
            java.lang.reflect.Method r2 = r3.coreStorageGetter     // Catch: java.lang.Throwable -> L403
            r3.putMethod(r0, r1, r2)     // Catch: java.lang.Throwable -> L403
            java.lang.String r1 = "conversationDeleteMethod"
            java.lang.reflect.Method r2 = r3.conversationDeleteMethod     // Catch: java.lang.Throwable -> L403
            r3.putMethod(r0, r1, r2)     // Catch: java.lang.Throwable -> L403
            java.lang.String r1 = "messageClearByTalkerMethod"
            java.lang.reflect.Method r2 = r3.messageClearByTalkerMethod     // Catch: java.lang.Throwable -> L403
            r3.putMethod(r0, r1, r2)     // Catch: java.lang.Throwable -> L403
            java.lang.String r1 = "messageClearBatchMethod"
            java.lang.reflect.Method r2 = r3.messageClearBatchMethod     // Catch: java.lang.Throwable -> L403
            r3.putMethod(r0, r1, r2)     // Catch: java.lang.Throwable -> L403
            java.lang.String r1 = "contactMuteStateMethod"
            java.lang.reflect.Method r2 = r3.contactMuteStateMethod     // Catch: java.lang.Throwable -> L403
            r3.putMethod(r0, r1, r2)     // Catch: java.lang.Throwable -> L403
            java.lang.String r1 = "contactMuteEnableMethod"
            java.lang.reflect.Method r2 = r3.contactMuteEnableMethod     // Catch: java.lang.Throwable -> L403
            r3.putMethod(r0, r1, r2)     // Catch: java.lang.Throwable -> L403
            java.lang.String r1 = "contactMuteDisableMethod"
            java.lang.reflect.Method r2 = r3.contactMuteDisableMethod     // Catch: java.lang.Throwable -> L403
            r3.putMethod(r0, r1, r2)     // Catch: java.lang.Throwable -> L403
            java.lang.String r1 = "contactStorageGetterMethod"
            java.lang.reflect.Method r2 = r3.contactStorageGetterMethod     // Catch: java.lang.Throwable -> L403
            r3.putMethod(r0, r1, r2)     // Catch: java.lang.Throwable -> L403
            java.lang.String r1 = "contactStorageQueryMethod"
            java.lang.reflect.Method r2 = r3.contactStorageQueryMethod     // Catch: java.lang.Throwable -> L403
            r3.putMethod(r0, r1, r2)     // Catch: java.lang.Throwable -> L403
            java.lang.String r1 = "chatroomMuteServiceGetterMethod"
            java.lang.reflect.Method r2 = r3.chatroomMuteServiceGetterMethod     // Catch: java.lang.Throwable -> L403
            r3.putMethod(r0, r1, r2)     // Catch: java.lang.Throwable -> L403
            java.lang.String r1 = "chatroomMuteBuildMethod"
            java.lang.reflect.Method r2 = r3.chatroomMuteBuildMethod     // Catch: java.lang.Throwable -> L403
            r3.putMethod(r0, r1, r2)     // Catch: java.lang.Throwable -> L403
            java.lang.String r1 = "chatroomMuteSubmitMethod"
            java.lang.reflect.Method r2 = r3.chatroomMuteSubmitMethod     // Catch: java.lang.Throwable -> L403
            r3.putMethod(r0, r1, r2)     // Catch: java.lang.Throwable -> L403
            java.lang.String r1 = "groupMemberDisplayNameMethod"
            java.lang.reflect.Method r2 = r3.groupMemberDisplayNameMethod     // Catch: java.lang.Throwable -> L403
            r3.putMethod(r0, r1, r2)     // Catch: java.lang.Throwable -> L403
            java.lang.String r1 = "addChatroomMemberClass"
            java.lang.Class<?> r2 = r3.addChatroomMemberClass     // Catch: java.lang.Throwable -> L403
            r3.putClass(r0, r1, r2)     // Catch: java.lang.Throwable -> L403
            java.lang.String r1 = "inviteChatroomMemberClass"
            java.lang.Class<?> r2 = r3.inviteChatroomMemberClass     // Catch: java.lang.Throwable -> L403
            r3.putClass(r0, r1, r2)     // Catch: java.lang.Throwable -> L403
            java.lang.String r1 = "delChatroomMemberClass"
            java.lang.Class<?> r2 = r3.delChatroomMemberClass     // Catch: java.lang.Throwable -> L403
            r3.putClass(r0, r1, r2)     // Catch: java.lang.Throwable -> L403
            java.lang.String r1 = "revokeMsgClass"
            java.lang.Class<?> r2 = r3.revokeMsgClass     // Catch: java.lang.Throwable -> L403
            r3.putClass(r0, r1, r2)     // Catch: java.lang.Throwable -> L403
            java.lang.String r1 = "uploadDeviceStepClass"
            java.lang.Class<?> r2 = r3.uploadDeviceStepClass     // Catch: java.lang.Throwable -> L403
            r3.putClass(r0, r1, r2)     // Catch: java.lang.Throwable -> L403
            java.lang.String r1 = "addContactLabelClass"
            java.lang.Class<?> r2 = r3.addContactLabelClass     // Catch: java.lang.Throwable -> L403
            r3.putClass(r0, r1, r2)     // Catch: java.lang.Throwable -> L403
            java.lang.String r1 = "modifyContactLabelListClass"
            java.lang.Class<?> r2 = r3.modifyContactLabelListClass     // Catch: java.lang.Throwable -> L403
            r3.putClass(r0, r1, r2)     // Catch: java.lang.Throwable -> L403
            java.lang.String r1 = "snsUploadPackHelperClass"
            java.lang.Class<?> r2 = r3.snsUploadPackHelperClass     // Catch: java.lang.Throwable -> L403
            r3.putClass(r0, r1, r2)     // Catch: java.lang.Throwable -> L403
            java.lang.String r1 = "snsUploadManagerClass"
            java.lang.Class<?> r2 = r3.snsUploadManagerClass     // Catch: java.lang.Throwable -> L403
            r3.putClass(r0, r1, r2)     // Catch: java.lang.Throwable -> L403
            java.lang.String r1 = "snsUploadManagerGetterMethod"
            java.lang.reflect.Method r2 = r3.snsUploadManagerGetterMethod     // Catch: java.lang.Throwable -> L403
            r3.putMethod(r0, r1, r2)     // Catch: java.lang.Throwable -> L403
            java.lang.String r1 = "snsSetContentMethod"
            java.lang.reflect.Method r2 = r3.snsSetContentMethod     // Catch: java.lang.Throwable -> L403
            r3.putMethod(r0, r1, r2)     // Catch: java.lang.Throwable -> L403
            java.lang.String r1 = "snsSetSdkIdMethod"
            java.lang.reflect.Method r2 = r3.snsSetSdkIdMethod     // Catch: java.lang.Throwable -> L403
            r3.putMethod(r0, r1, r2)     // Catch: java.lang.Throwable -> L403
            java.lang.String r1 = "snsSetSdkAppNameMethod"
            java.lang.reflect.Method r2 = r3.snsSetSdkAppNameMethod     // Catch: java.lang.Throwable -> L403
            r3.putMethod(r0, r1, r2)     // Catch: java.lang.Throwable -> L403
            java.lang.String r1 = "snsAddImageMethod"
            java.lang.reflect.Method r2 = r3.snsAddImageMethod     // Catch: java.lang.Throwable -> L403
            r3.putMethod(r0, r1, r2)     // Catch: java.lang.Throwable -> L403
            java.lang.String r1 = "snsAddVideoMethod"
            java.lang.reflect.Method r2 = r3.snsAddVideoMethod     // Catch: java.lang.Throwable -> L403
            r3.putMethod(r0, r1, r2)     // Catch: java.lang.Throwable -> L403
            java.lang.String r1 = "snsCommitMethod"
            java.lang.reflect.Method r2 = r3.snsCommitMethod     // Catch: java.lang.Throwable -> L403
            r3.putMethod(r0, r1, r2)     // Catch: java.lang.Throwable -> L403
            java.lang.String r1 = "snsShareAppMsgMethod"
            java.lang.reflect.Method r2 = r3.snsShareAppMsgMethod     // Catch: java.lang.Throwable -> L403
            r3.putMethod(r0, r1, r2)     // Catch: java.lang.Throwable -> L403
            java.lang.String r1 = "snsUploadCheckMethod"
            java.lang.reflect.Method r2 = r3.snsUploadCheckMethod     // Catch: java.lang.Throwable -> L403
            r3.putMethod(r0, r1, r2)     // Catch: java.lang.Throwable -> L403
            java.lang.String r1 = "chatPageStartMethod"
            java.lang.reflect.Method r2 = r3.chatPageStartMethod     // Catch: java.lang.Throwable -> L403
            r3.putMethod(r0, r1, r2)     // Catch: java.lang.Throwable -> L403
            java.lang.String r1 = "chatPageFragmentEnterMethod"
            java.lang.reflect.Method r2 = r3.chatPageFragmentEnterMethod     // Catch: java.lang.Throwable -> L403
            r3.putMethod(r0, r1, r2)     // Catch: java.lang.Throwable -> L403
            java.lang.String r1 = "chatPageFragmentExitMethod"
            java.lang.reflect.Method r2 = r3.chatPageFragmentExitMethod     // Catch: java.lang.Throwable -> L403
            r3.putMethod(r0, r1, r2)     // Catch: java.lang.Throwable -> L403
            java.lang.String r1 = "chatFooterSendClickMethod"
            java.lang.reflect.Method r2 = r3.chatFooterSendClickMethod     // Catch: java.lang.Throwable -> L403
            r3.putMethod(r0, r1, r2)     // Catch: java.lang.Throwable -> L403
            java.lang.String r1 = "cache.complete"
            r2 = 1
            r0.putBoolean(r1, r2)     // Catch: java.lang.Throwable -> L403
            r0.apply()     // Catch: java.lang.Throwable -> L403
            return
        L403:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "[Hchat:DexFinder] 保存缓存失败: "
            r1.<init>(r2)
            bc.e.s(r0, r1, r0)
        L40e:
            return
    }

    private void setLocalMessageApi(java.lang.reflect.Method r3) {
            r2 = this;
            h.Hchat.utils.KavaReflector.accessible(r3)
            r2.localMessageInsertMethod = r3
            java.lang.Class[] r0 = r3.getParameterTypes()
            r1 = 0
            r0 = r0[r1]
            r2.localMessageClass = r0
            java.lang.reflect.Constructor r0 = r2.findLocalMessageConstructor(r0)
            r2.localMessageCtor = r0
            java.lang.Class r3 = r3.getDeclaringClass()
            java.lang.reflect.Method r3 = r2.findLocalMessageCreateTimeMethod(r3)
            r2.localMessageCreateTimeMethod = r3
            return
    }

    private java.lang.String shortKey(java.lang.String r3) {
            r2 = this;
            if (r3 != 0) goto L5
            java.lang.String r3 = ""
            return r3
        L5:
            int r0 = r3.length()
            r1 = 80
            if (r0 > r1) goto Le
            return r3
        Le:
            r0 = 0
            java.lang.String r3 = r3.substring(r0, r1)
            java.lang.String r0 = "..."
            java.lang.String r3 = r3.concat(r0)
            return r3
    }

    private java.lang.Class<?> typeOf(java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = "boolean"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto Lb
            java.lang.Class r2 = java.lang.Boolean.TYPE
            return r2
        Lb:
            java.lang.String r0 = "byte"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L16
            java.lang.Class r2 = java.lang.Byte.TYPE
            return r2
        L16:
            java.lang.String r0 = "char"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L21
            java.lang.Class r2 = java.lang.Character.TYPE
            return r2
        L21:
            java.lang.String r0 = "short"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L2c
            java.lang.Class r2 = java.lang.Short.TYPE
            return r2
        L2c:
            java.lang.String r0 = "int"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L37
            java.lang.Class r2 = java.lang.Integer.TYPE
            return r2
        L37:
            java.lang.String r0 = "long"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L42
            java.lang.Class r2 = java.lang.Long.TYPE
            return r2
        L42:
            java.lang.String r0 = "float"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L4d
            java.lang.Class r2 = java.lang.Float.TYPE
            return r2
        L4d:
            java.lang.String r0 = "double"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L58
            java.lang.Class r2 = java.lang.Double.TYPE
            return r2
        L58:
            java.lang.String r0 = "void"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L63
            java.lang.Class r2 = java.lang.Void.TYPE
            return r2
        L63:
            java.lang.ClassLoader r0 = r1.classLoader
            java.lang.Class r2 = h.Hchat.utils.KavaReflector.loadClass(r2, r0)
            return r2
    }

    public java.lang.Class<?> findNativeNetSceneClass(java.lang.String r11, int r12) {
            r10 = this;
            java.lang.String r0 = " class="
            java.lang.String r1 = "原生NetScene定位: uri="
            java.lang.String r2 = " type="
            if (r11 == 0) goto Lfa
            int r3 = r11.length()
            if (r3 == 0) goto Lfa
            if (r12 > 0) goto L12
            goto Lfa
        L12:
            ch.c r3 = new ch.c     // Catch: java.lang.Throwable -> L9b
            r3.<init>()     // Catch: java.lang.Throwable -> L9b
            fh.a r4 = new fh.a     // Catch: java.lang.Throwable -> L9b
            r4.<init>()     // Catch: java.lang.Throwable -> L9b
            java.lang.String[] r5 = new java.lang.String[]{r11}     // Catch: java.lang.Throwable -> L9b
            r4.q0(r5)     // Catch: java.lang.Throwable -> L9b
            fh.l r5 = new fh.l     // Catch: java.lang.Throwable -> L9b
            r5.<init>()     // Catch: java.lang.Throwable -> L9b
            fh.k r6 = new fh.k     // Catch: java.lang.Throwable -> L9b
            r6.<init>()     // Catch: java.lang.Throwable -> L9b
            java.lang.String r7 = "getType"
            gh.c r8 = new gh.c     // Catch: java.lang.Throwable -> L9b
            r9 = 5
            r8.<init>(r7, r9)     // Catch: java.lang.Throwable -> L9b
            r6.f3950g = r8     // Catch: java.lang.Throwable -> L9b
            java.lang.Class r7 = java.lang.Integer.TYPE     // Catch: java.lang.Throwable -> L9b
            r6.p0(r7)     // Catch: java.lang.Throwable -> L9b
            java.lang.Integer r7 = java.lang.Integer.valueOf(r12)     // Catch: java.lang.Throwable -> L9b
            r8 = 1
            java.lang.Number[] r8 = new java.lang.Number[r8]     // Catch: java.lang.Throwable -> L9b
            r9 = 0
            r8[r9] = r7     // Catch: java.lang.Throwable -> L9b
            r6.s0(r8)     // Catch: java.lang.Throwable -> L9b
            r5.k0(r6)     // Catch: java.lang.Throwable -> L9b
            r4.f3938j = r5     // Catch: java.lang.Throwable -> L9b
            r3.f1664h = r4     // Catch: java.lang.Throwable -> L9b
            org.luckypray.dexkit.DexKitBridge r4 = r10.dexKit     // Catch: java.lang.Throwable -> L9b
            hh.j r3 = r4.findClass(r3)     // Catch: java.lang.Throwable -> L9b
            java.util.Iterator r3 = r3.iterator()     // Catch: java.lang.Throwable -> L9b
        L5a:
            boolean r4 = r3.hasNext()     // Catch: java.lang.Throwable -> L9b
            if (r4 == 0) goto L9b
            java.lang.Object r4 = r3.next()     // Catch: java.lang.Throwable -> L9b
            hh.i r4 = (hh.i) r4     // Catch: java.lang.Throwable -> L9b
            lh.a r4 = r4.p()     // Catch: java.lang.Throwable -> L9b
            java.lang.String r4 = r4.f8057g     // Catch: java.lang.Throwable -> L9b
            java.lang.ClassLoader r5 = r10.classLoader     // Catch: java.lang.Throwable -> L9b
            java.lang.Class r4 = h.Hchat.utils.KavaReflector.loadClass(r4, r5)     // Catch: java.lang.Throwable -> L9b
            boolean r5 = r10.isNativeNetSceneCandidate(r4, r12)     // Catch: java.lang.Throwable -> L9b
            if (r5 == 0) goto L5a
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L9b
            r3.<init>()     // Catch: java.lang.Throwable -> L9b
            r3.append(r1)     // Catch: java.lang.Throwable -> L9b
            r3.append(r11)     // Catch: java.lang.Throwable -> L9b
            r3.append(r2)     // Catch: java.lang.Throwable -> L9b
            r3.append(r12)     // Catch: java.lang.Throwable -> L9b
            r3.append(r0)     // Catch: java.lang.Throwable -> L9b
            java.lang.String r5 = r4.getName()     // Catch: java.lang.Throwable -> L9b
            r3.append(r5)     // Catch: java.lang.Throwable -> L9b
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L9b
            r10.logDetail(r3)     // Catch: java.lang.Throwable -> L9b
            return r4
        L9b:
            java.lang.String[] r3 = new java.lang.String[]{r11}     // Catch: java.lang.Throwable -> Lee
            ch.e r3 = r10.mkMethodUsingStrings(r3)     // Catch: java.lang.Throwable -> Lee
            org.luckypray.dexkit.DexKitBridge r4 = r10.dexKit     // Catch: java.lang.Throwable -> Lee
            hh.p r3 = r4.findMethod(r3)     // Catch: java.lang.Throwable -> Lee
            java.util.Iterator r3 = r3.iterator()     // Catch: java.lang.Throwable -> Lee
        Lad:
            boolean r4 = r3.hasNext()     // Catch: java.lang.Throwable -> Lee
            if (r4 == 0) goto Lfa
            java.lang.Object r4 = r3.next()     // Catch: java.lang.Throwable -> Lee
            hh.o r4 = (hh.o) r4     // Catch: java.lang.Throwable -> Lee
            lh.d r4 = r4.p()     // Catch: java.lang.Throwable -> Lee
            java.lang.String r4 = r4.f8063g     // Catch: java.lang.Throwable -> Lee
            java.lang.ClassLoader r5 = r10.classLoader     // Catch: java.lang.Throwable -> Lee
            java.lang.Class r4 = h.Hchat.utils.KavaReflector.loadClass(r4, r5)     // Catch: java.lang.Throwable -> Lee
            boolean r5 = r10.isNativeNetSceneCandidate(r4, r12)     // Catch: java.lang.Throwable -> Lee
            if (r5 == 0) goto Lad
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lee
            r3.<init>()     // Catch: java.lang.Throwable -> Lee
            r3.append(r1)     // Catch: java.lang.Throwable -> Lee
            r3.append(r11)     // Catch: java.lang.Throwable -> Lee
            r3.append(r2)     // Catch: java.lang.Throwable -> Lee
            r3.append(r12)     // Catch: java.lang.Throwable -> Lee
            r3.append(r0)     // Catch: java.lang.Throwable -> Lee
            java.lang.String r0 = r4.getName()     // Catch: java.lang.Throwable -> Lee
            r3.append(r0)     // Catch: java.lang.Throwable -> Lee
            java.lang.String r0 = r3.toString()     // Catch: java.lang.Throwable -> Lee
            r10.logDetail(r0)     // Catch: java.lang.Throwable -> Lee
            return r4
        Lee:
            r0 = move-exception
            java.lang.String r1 = "[Hchat:DexFinder] findNativeNetSceneClass 失败: uri="
            java.lang.String r3 = " | "
            java.lang.StringBuilder r11 = eh.a.u(r12, r1, r11, r2, r3)
            bc.e.s(r0, r11, r0)
        Lfa:
            r11 = 0
            return r11
    }

    public boolean hasContactLabelNetworkApi() {
            r2 = this;
            java.lang.reflect.Constructor<?> r0 = r2.addContactLabelCtorString
            if (r0 != 0) goto L8
            java.lang.reflect.Constructor<?> r0 = r2.addContactLabelCtorList
            if (r0 == 0) goto L1b
        L8:
            java.lang.reflect.Constructor<?> r0 = r2.modifyContactLabelListCtor
            if (r0 != 0) goto L1d
            java.lang.Class<?> r0 = r2.modifyContactLabelListClass
            java.lang.Class<java.util.LinkedList> r1 = java.util.LinkedList.class
            java.lang.Class[] r1 = new java.lang.Class[]{r1}
            java.lang.reflect.Constructor r0 = r2.findCtorByExactTypes(r0, r1)
            if (r0 == 0) goto L1b
            goto L1d
        L1b:
            r0 = 0
            return r0
        L1d:
            r0 = 1
            return r0
    }

    public boolean hasGroupSolitaireApi() {
            r1 = this;
            java.lang.Class<?> r0 = r1.groupSolitairePluginClass
            if (r0 == 0) goto La
            java.lang.reflect.Method r0 = r1.groupSolitaireSendMethod
            if (r0 == 0) goto La
            r0 = 1
            return r0
        La:
            r0 = 0
            return r0
    }

    public boolean hasLocalMessageApi() {
            r1 = this;
            java.lang.reflect.Method r0 = r1.localSystemMessageMethod
            if (r0 != 0) goto L17
            java.lang.reflect.Method r0 = r1.localMessageInsertMethod
            if (r0 == 0) goto L15
            java.lang.reflect.Method r0 = r1.localMessageCreateTimeMethod
            if (r0 == 0) goto L15
            java.lang.Class<?> r0 = r1.localMessageClass
            if (r0 == 0) goto L15
            java.lang.reflect.Constructor<?> r0 = r1.localMessageCtor
            if (r0 == 0) goto L15
            goto L17
        L15:
            r0 = 0
            return r0
        L17:
            r0 = 1
            return r0
    }

    public boolean hasRevokeMsgApi() {
            r1 = this;
            java.lang.reflect.Constructor<?> r0 = r1.revokeMsgCtor
            if (r0 != 0) goto Lf
            java.lang.Class<?> r0 = r1.revokeMsgClass
            java.lang.reflect.Constructor r0 = r1.findRevokeMsgCtor(r0)
            if (r0 == 0) goto Ld
            goto Lf
        Ld:
            r0 = 0
            return r0
        Lf:
            r0 = 1
            return r0
    }

    public boolean hasSnsUploadApi() {
            r2 = this;
            java.lang.Class<?> r0 = r2.snsUploadPackHelperClass
            boolean r0 = r2.isSnsUploadPackHelperClass(r0)
            r1 = 0
            if (r0 != 0) goto La
            return r1
        La:
            java.lang.Class<?> r0 = r2.snsUploadManagerClass
            boolean r0 = r2.isSnsUploadManagerClass(r0)
            if (r0 != 0) goto L13
            return r1
        L13:
            r2.resolveSnsUploadMethods()
            java.lang.reflect.Method r0 = r2.snsUploadManagerGetterMethod
            if (r0 == 0) goto L30
            java.lang.reflect.Method r0 = r2.snsShareAppMsgMethod
            if (r0 == 0) goto L30
            java.lang.reflect.Method r0 = r2.snsSetContentMethod
            if (r0 == 0) goto L30
            java.lang.reflect.Method r0 = r2.snsAddImageMethod
            if (r0 == 0) goto L30
            java.lang.reflect.Method r0 = r2.snsCommitMethod
            if (r0 == 0) goto L30
            java.lang.reflect.Method r0 = r2.snsUploadCheckMethod
            if (r0 == 0) goto L30
            r0 = 1
            return r0
        L30:
            return r1
    }

    public boolean hasTransferOperationApi() {
            r1 = this;
            java.lang.Class<?> r0 = r1.transferOperationClass
            if (r0 == 0) goto Lc
            boolean r0 = r1.hasTransferOperationCtor(r0)
            if (r0 == 0) goto Lc
            r0 = 1
            return r0
        Lc:
            r0 = 0
            return r0
    }

    public boolean hasTransferQueryApi() {
            r2 = this;
            java.lang.Class<?> r0 = r2.transferQueryClass
            boolean r0 = r2.isTransferQueryClass(r0)
            if (r0 == 0) goto L14
            java.lang.reflect.Method r0 = r2.transferQueryResponseMethod
            java.lang.Class<?> r1 = r2.transferQueryClass
            boolean r0 = r2.isTransferQueryResponseMethod(r0, r1)
            if (r0 == 0) goto L14
            r0 = 1
            return r0
        L14:
            r0 = 0
            return r0
    }

    public boolean hasUploadDeviceStepApi() {
            r1 = this;
            java.lang.reflect.Constructor<?> r0 = r1.uploadDeviceStepCtor
            if (r0 != 0) goto Lf
            java.lang.Class<?> r0 = r1.uploadDeviceStepClass
            java.lang.reflect.Constructor r0 = r1.findUploadDeviceStepCtor(r0)
            if (r0 == 0) goto Ld
            goto Lf
        Ld:
            r0 = 0
            return r0
        Lf:
            r0 = 1
            return r0
    }

    public boolean hasVerifyUserApi() {
            r1 = this;
            java.lang.Class<?> r0 = r1.verifyUserClass
            if (r0 == 0) goto Lc
            boolean r0 = r1.hasVerifyUserCtor(r0)
            if (r0 == 0) goto Lc
            r0 = 1
            return r0
        Lc:
            r0 = 0
            return r0
    }

    public boolean isMarsCdnReady() {
            r1 = this;
            java.lang.Class<?> r0 = r1.marsCdnManagerClass
            if (r0 == 0) goto L12
            java.lang.Class<?> r0 = r1.marsCdnDownloadRequestClass
            if (r0 == 0) goto L12
            java.lang.Class<?> r0 = r1.marsCdnDownloadCallbackClass
            if (r0 == 0) goto L12
            java.lang.reflect.Method r0 = r1.marsCdnStartDownloadMethod
            if (r0 == 0) goto L12
            r0 = 1
            return r0
        L12:
            r0 = 0
            return r0
    }

    public boolean isPrivateConversationMuteApiReady() {
            r1 = this;
            java.lang.reflect.Method r0 = r1.serviceGetterMethod
            boolean r0 = r1.isServiceGetterMethod(r0)
            if (r0 == 0) goto L20
            java.lang.reflect.Method r0 = r1.contactMuteEnableMethod
            boolean r0 = r1.isContactMuteMethod(r0)
            if (r0 == 0) goto L20
            java.lang.reflect.Method r0 = r1.contactMuteDisableMethod
            boolean r0 = r1.isContactMuteMethod(r0)
            if (r0 == 0) goto L20
            boolean r0 = r1.isContactStorageLookupApiReady()
            if (r0 == 0) goto L20
            r0 = 1
            return r0
        L20:
            r0 = 0
            return r0
    }

    public synchronized boolean isResolvedAll() {
            r1 = this;
            monitor-enter(r1)
            boolean r0 = r1.resolvedAll     // Catch: java.lang.Throwable -> L5
            monitor-exit(r1)
            return r0
        L5:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L5
            throw r0
    }

    public void resolveAddChatroomMemberApi() {
            r6 = this;
            java.lang.String r0 = "MicroMsg.NetSceneAddChatRoomMember"
            java.lang.String r1 = "/cgi-bin/micromsg-bin/addchatroommember"
            java.lang.reflect.Constructor<?> r2 = r6.addChatroomMemberCtor     // Catch: java.lang.Throwable -> L11
            if (r2 != 0) goto L13
            java.lang.Class<?> r2 = r6.addChatroomMemberClass     // Catch: java.lang.Throwable -> L11
            java.lang.reflect.Constructor r2 = r6.findAddChatroomMemberCtor(r2)     // Catch: java.lang.Throwable -> L11
            r6.addChatroomMemberCtor = r2     // Catch: java.lang.Throwable -> L11
            goto L13
        L11:
            r0 = move-exception
            goto L7e
        L13:
            java.lang.reflect.Constructor<?> r2 = r6.addChatroomMemberCtor     // Catch: java.lang.Throwable -> L11
            if (r2 == 0) goto L18
            return
        L18:
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L11
            r2.<init>()     // Catch: java.lang.Throwable -> L11
            java.lang.String[] r3 = new java.lang.String[]{r1}     // Catch: java.lang.Throwable -> L11
            java.lang.String[] r4 = new java.lang.String[]{r0}     // Catch: java.lang.Throwable -> L11
            java.lang.String r5 = "addchatroommember"
            java.lang.String[] r5 = new java.lang.String[]{r5}     // Catch: java.lang.Throwable -> L11
            java.lang.String[][] r3 = new java.lang.String[][]{r3, r4, r5}     // Catch: java.lang.Throwable -> L11
            r4 = 20
            r6.collectSendTextClassCandidates(r2, r4, r3)     // Catch: java.lang.Throwable -> L11
            java.lang.String[] r1 = new java.lang.String[]{r1}     // Catch: java.lang.Throwable -> L11
            java.lang.String[] r0 = new java.lang.String[]{r0}     // Catch: java.lang.Throwable -> L11
            java.lang.String[][] r0 = new java.lang.String[][]{r1, r0}     // Catch: java.lang.Throwable -> L11
            r6.collectSendTextMethodOwnerCandidates(r2, r4, r0)     // Catch: java.lang.Throwable -> L11
            java.util.Iterator r0 = r2.iterator()     // Catch: java.lang.Throwable -> L11
        L47:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L11
            if (r1 == 0) goto L5e
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L11
            java.lang.Class r1 = (java.lang.Class) r1     // Catch: java.lang.Throwable -> L11
            java.lang.reflect.Constructor r2 = r6.findAddChatroomMemberCtor(r1)     // Catch: java.lang.Throwable -> L11
            if (r2 != 0) goto L5a
            goto L47
        L5a:
            r6.addChatroomMemberClass = r1     // Catch: java.lang.Throwable -> L11
            r6.addChatroomMemberCtor = r2     // Catch: java.lang.Throwable -> L11
        L5e:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L11
            r0.<init>()     // Catch: java.lang.Throwable -> L11
            java.lang.String r1 = "添加群成员API: "
            r0.append(r1)     // Catch: java.lang.Throwable -> L11
            java.lang.Class<?> r1 = r6.addChatroomMemberClass     // Catch: java.lang.Throwable -> L11
            if (r1 == 0) goto L71
            java.lang.String r1 = r1.getName()     // Catch: java.lang.Throwable -> L11
            goto L73
        L71:
            java.lang.String r1 = "null"
        L73:
            r0.append(r1)     // Catch: java.lang.Throwable -> L11
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L11
            r6.logDetail(r0)     // Catch: java.lang.Throwable -> L11
            return
        L7e:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "[Hchat:DexFinder] resolveAddChatroomMemberApi 失败: "
            r1.<init>(r2)
            bc.e.s(r0, r1, r0)
            return
    }

    public synchronized void resolveAll() {
            r4 = this;
            java.lang.String r0 = "解析完成并缓存: "
            java.lang.String r1 = "命中缓存: "
            monitor-enter(r4)
            boolean r2 = r4.resolvedAll     // Catch: java.lang.Throwable -> L10
            if (r2 == 0) goto L13
            java.lang.String r0 = "resolveAll 已完成，跳过重复解析"
            r4.logDetail(r0)     // Catch: java.lang.Throwable -> L10
            monitor-exit(r4)
            return
        L10:
            r0 = move-exception
            goto L136
        L13:
            boolean r2 = r4.loadCache()     // Catch: java.lang.Throwable -> L10
            r3 = 1
            if (r2 == 0) goto L9c
            r4.resolveServiceManagerApi()     // Catch: java.lang.Throwable -> L10
            r4.resolveGetContactServiceApi()     // Catch: java.lang.Throwable -> L10
            r4.resolveDatabaseApi()     // Catch: java.lang.Throwable -> L10
            r4.resolveConversationDeleteApi()     // Catch: java.lang.Throwable -> L10
            r4.resolveMessageClearApi()     // Catch: java.lang.Throwable -> L10
            r4.resolveConversationMuteApi()     // Catch: java.lang.Throwable -> L10
            r4.resolveGroupMemberDisplayName()     // Catch: java.lang.Throwable -> L10
            r4.resolveSendImageApi()     // Catch: java.lang.Throwable -> L10
            r4.resolveImageCdnDownloadApi()     // Catch: java.lang.Throwable -> L10
            r4.resolveSendFileApi()     // Catch: java.lang.Throwable -> L10
            r4.resolveSendXmlApi()     // Catch: java.lang.Throwable -> L10
            r4.resolveGroupSolitaireApi()     // Catch: java.lang.Throwable -> L10
            r4.resolveLocalMessageApi()     // Catch: java.lang.Throwable -> L10
            r4.resolveSendVideoTaskApi()     // Catch: java.lang.Throwable -> L10
            r4.resolveVideoPathApi()     // Catch: java.lang.Throwable -> L10
            r4.resolveVideoInfoApi()     // Catch: java.lang.Throwable -> L10
            r4.resolveSendVoiceApi()     // Catch: java.lang.Throwable -> L10
            r4.resolveSendEmojiApi()     // Catch: java.lang.Throwable -> L10
            r4.resolveFavoriteApi()     // Catch: java.lang.Throwable -> L10
            r4.resolveTransferOperationApi()     // Catch: java.lang.Throwable -> L10
            r4.resolveTransferQueryApi()     // Catch: java.lang.Throwable -> L10
            r4.resolveVerifyUserApi()     // Catch: java.lang.Throwable -> L10
            r4.resolveContactCardApi()     // Catch: java.lang.Throwable -> L10
            r4.resolvePatMessageApi()     // Catch: java.lang.Throwable -> L10
            r4.resolveProtobufPacketApi()     // Catch: java.lang.Throwable -> L10
            r4.resolveAddChatroomMemberApi()     // Catch: java.lang.Throwable -> L10
            r4.resolveInviteChatroomMemberApi()     // Catch: java.lang.Throwable -> L10
            r4.resolveDelChatroomMemberApi()     // Catch: java.lang.Throwable -> L10
            r4.resolveRevokeMsgApi()     // Catch: java.lang.Throwable -> L10
            r4.resolveUploadDeviceStepApi()     // Catch: java.lang.Throwable -> L10
            r4.resolveContactLabelNetworkApi()     // Catch: java.lang.Throwable -> L10
            r4.resolveSnsUploadApi()     // Catch: java.lang.Throwable -> L10
            r4.resolveChatPageApi()     // Catch: java.lang.Throwable -> L10
            r4.resolveScriptSendHookApi()     // Catch: java.lang.Throwable -> L10
            r4.saveCache()     // Catch: java.lang.Throwable -> L10
            r4.resolvedAll = r3     // Catch: java.lang.Throwable -> L10
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L10
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L10
            java.lang.String r1 = r4.runtimeCacheKey     // Catch: java.lang.Throwable -> L10
            java.lang.String r1 = r4.shortKey(r1)     // Catch: java.lang.Throwable -> L10
            r0.append(r1)     // Catch: java.lang.Throwable -> L10
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L10
            r4.logDetail(r0)     // Catch: java.lang.Throwable -> L10
            monitor-exit(r4)
            return
        L9c:
            r4.resolveAddMsgClasses()     // Catch: java.lang.Throwable -> L10
            r4.resolveReceiveLuckyMoney()     // Catch: java.lang.Throwable -> L10
            r4.resolveOpenLuckyMoney()     // Catch: java.lang.Throwable -> L10
            r4.resolveNetworkQueue()     // Catch: java.lang.Throwable -> L10
            r4.resolveServiceManagerApi()     // Catch: java.lang.Throwable -> L10
            r4.resolveSendTextMsg()     // Catch: java.lang.Throwable -> L10
            r4.resolveGetContactServiceApi()     // Catch: java.lang.Throwable -> L10
            r4.resolveSendImageApi()     // Catch: java.lang.Throwable -> L10
            r4.resolveImageCdnDownloadApi()     // Catch: java.lang.Throwable -> L10
            r4.resolveSendFileApi()     // Catch: java.lang.Throwable -> L10
            r4.resolveSendXmlApi()     // Catch: java.lang.Throwable -> L10
            r4.resolveGroupSolitaireApi()     // Catch: java.lang.Throwable -> L10
            r4.resolveLocalMessageApi()     // Catch: java.lang.Throwable -> L10
            r4.resolveSendVideoTaskApi()     // Catch: java.lang.Throwable -> L10
            r4.resolveVideoPathApi()     // Catch: java.lang.Throwable -> L10
            r4.resolveVideoInfoApi()     // Catch: java.lang.Throwable -> L10
            r4.resolveSendVoiceApi()     // Catch: java.lang.Throwable -> L10
            r4.resolveSendEmojiApi()     // Catch: java.lang.Throwable -> L10
            r4.resolveFavoriteApi()     // Catch: java.lang.Throwable -> L10
            r4.resolveTransferOperationApi()     // Catch: java.lang.Throwable -> L10
            r4.resolveTransferQueryApi()     // Catch: java.lang.Throwable -> L10
            r4.resolveVerifyUserApi()     // Catch: java.lang.Throwable -> L10
            r4.resolveContactCardApi()     // Catch: java.lang.Throwable -> L10
            r4.resolvePatMessageApi()     // Catch: java.lang.Throwable -> L10
            r4.resolveDatabaseApi()     // Catch: java.lang.Throwable -> L10
            r4.resolveConversationDeleteApi()     // Catch: java.lang.Throwable -> L10
            r4.resolveMessageClearApi()     // Catch: java.lang.Throwable -> L10
            r4.resolveConversationMuteApi()     // Catch: java.lang.Throwable -> L10
            r4.resolveGroupMemberDisplayName()     // Catch: java.lang.Throwable -> L10
            r4.resolveAddChatroomMemberApi()     // Catch: java.lang.Throwable -> L10
            r4.resolveInviteChatroomMemberApi()     // Catch: java.lang.Throwable -> L10
            r4.resolveDelChatroomMemberApi()     // Catch: java.lang.Throwable -> L10
            r4.resolveRevokeMsgApi()     // Catch: java.lang.Throwable -> L10
            r4.resolveUploadDeviceStepApi()     // Catch: java.lang.Throwable -> L10
            r4.resolveContactLabelNetworkApi()     // Catch: java.lang.Throwable -> L10
            r4.resolveSnsUploadApi()     // Catch: java.lang.Throwable -> L10
            r4.resolveChatPageApi()     // Catch: java.lang.Throwable -> L10
            r4.resolveScriptSendHookApi()     // Catch: java.lang.Throwable -> L10
            r4.resolveWishWxHb()     // Catch: java.lang.Throwable -> L10
            r4.resolvePacketCompatClasses()     // Catch: java.lang.Throwable -> L10
            r4.resolveProtobufPacketApi()     // Catch: java.lang.Throwable -> L10
            r4.logMissingCritical()     // Catch: java.lang.Throwable -> L10
            r4.saveCache()     // Catch: java.lang.Throwable -> L10
            r4.resolvedAll = r3     // Catch: java.lang.Throwable -> L10
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L10
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L10
            java.lang.String r0 = r4.runtimeCacheKey     // Catch: java.lang.Throwable -> L10
            java.lang.String r0 = r4.shortKey(r0)     // Catch: java.lang.Throwable -> L10
            r1.append(r0)     // Catch: java.lang.Throwable -> L10
            java.lang.String r0 = r1.toString()     // Catch: java.lang.Throwable -> L10
            r4.logDetail(r0)     // Catch: java.lang.Throwable -> L10
            monitor-exit(r4)
            return
        L136:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L10
            throw r0
    }

    public void resolveChatPageApi() {
            r4 = this;
            java.lang.reflect.Method r0 = r4.chatPageStartMethod     // Catch: java.lang.Throwable -> Le
            if (r0 == 0) goto L11
            java.lang.reflect.Method r1 = r4.chatPageFragmentEnterMethod     // Catch: java.lang.Throwable -> Le
            if (r1 == 0) goto L11
            java.lang.reflect.Method r1 = r4.chatPageFragmentExitMethod     // Catch: java.lang.Throwable -> Le
            if (r1 == 0) goto L11
            goto L102
        Le:
            r0 = move-exception
            goto Lf8
        L11:
            if (r0 != 0) goto L45
            org.luckypray.dexkit.DexKitBridge r0 = r4.dexKit     // Catch: java.lang.Throwable -> Le
            java.lang.String r1 = "try startChatting, ishow:%b userName:%s needAnim:%b"
            java.lang.String[] r1 = new java.lang.String[]{r1}     // Catch: java.lang.Throwable -> Le
            ch.e r1 = r4.mkMethodUsingStrings(r1)     // Catch: java.lang.Throwable -> Le
            hh.p r0 = r0.findMethod(r1)     // Catch: java.lang.Throwable -> Le
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> Le
        L27:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> Le
            if (r1 == 0) goto L45
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> Le
            hh.o r1 = (hh.o) r1     // Catch: java.lang.Throwable -> Le
            java.lang.ClassLoader r2 = r4.classLoader     // Catch: java.lang.Throwable -> L27
            java.lang.reflect.Method r1 = r1.r(r2)     // Catch: java.lang.Throwable -> L27
            boolean r2 = r4.isChatPageStartMethod(r1)     // Catch: java.lang.Throwable -> L27
            if (r2 != 0) goto L40
            goto L27
        L40:
            h.Hchat.utils.KavaReflector.accessible(r1)     // Catch: java.lang.Throwable -> L27
            r4.chatPageStartMethod = r1     // Catch: java.lang.Throwable -> L27
        L45:
            java.lang.reflect.Method r0 = r4.chatPageFragmentEnterMethod     // Catch: java.lang.Throwable -> Le
            if (r0 != 0) goto L7d
            org.luckypray.dexkit.DexKitBridge r0 = r4.dexKit     // Catch: java.lang.Throwable -> Le
            java.lang.String r1 = "onEnterBegin"
            java.lang.String r2 = "Chat_User"
            java.lang.String[] r1 = new java.lang.String[]{r1, r2}     // Catch: java.lang.Throwable -> Le
            ch.e r1 = r4.mkMethodUsingStrings(r1)     // Catch: java.lang.Throwable -> Le
            hh.p r0 = r0.findMethod(r1)     // Catch: java.lang.Throwable -> Le
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> Le
        L5f:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> Le
            if (r1 == 0) goto L7d
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> Le
            hh.o r1 = (hh.o) r1     // Catch: java.lang.Throwable -> Le
            java.lang.ClassLoader r2 = r4.classLoader     // Catch: java.lang.Throwable -> L5f
            java.lang.reflect.Method r1 = r1.r(r2)     // Catch: java.lang.Throwable -> L5f
            boolean r2 = r4.isNoArgVoidMethod(r1)     // Catch: java.lang.Throwable -> L5f
            if (r2 != 0) goto L78
            goto L5f
        L78:
            h.Hchat.utils.KavaReflector.accessible(r1)     // Catch: java.lang.Throwable -> L5f
            r4.chatPageFragmentEnterMethod = r1     // Catch: java.lang.Throwable -> L5f
        L7d:
            java.lang.reflect.Method r0 = r4.chatPageFragmentExitMethod     // Catch: java.lang.Throwable -> Le
            if (r0 != 0) goto Lc1
            java.lang.reflect.Method r0 = r4.chatPageFragmentEnterMethod     // Catch: java.lang.Throwable -> Le
            if (r0 == 0) goto Lc1
            java.lang.Class r0 = r0.getDeclaringClass()     // Catch: java.lang.Throwable -> Le
            org.luckypray.dexkit.DexKitBridge r1 = r4.dexKit     // Catch: java.lang.Throwable -> Le
            java.lang.String r2 = "onExitBegin"
            java.lang.String[] r2 = new java.lang.String[]{r2}     // Catch: java.lang.Throwable -> Le
            ch.e r2 = r4.mkMethodUsingStrings(r2)     // Catch: java.lang.Throwable -> Le
            hh.p r1 = r1.findMethod(r2)     // Catch: java.lang.Throwable -> Le
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> Le
        L9d:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> Le
            if (r2 == 0) goto Lc1
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> Le
            hh.o r2 = (hh.o) r2     // Catch: java.lang.Throwable -> Le
            java.lang.ClassLoader r3 = r4.classLoader     // Catch: java.lang.Throwable -> L9d
            java.lang.reflect.Method r2 = r2.r(r3)     // Catch: java.lang.Throwable -> L9d
            boolean r3 = r4.isNoArgVoidMethod(r2)     // Catch: java.lang.Throwable -> L9d
            if (r3 == 0) goto L9d
            java.lang.Class r3 = r2.getDeclaringClass()     // Catch: java.lang.Throwable -> L9d
            if (r3 == r0) goto Lbc
            goto L9d
        Lbc:
            h.Hchat.utils.KavaReflector.accessible(r2)     // Catch: java.lang.Throwable -> L9d
            r4.chatPageFragmentExitMethod = r2     // Catch: java.lang.Throwable -> L9d
        Lc1:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Le
            r0.<init>()     // Catch: java.lang.Throwable -> Le
            java.lang.String r1 = "聊天页API: start="
            r0.append(r1)     // Catch: java.lang.Throwable -> Le
            java.lang.reflect.Method r1 = r4.chatPageStartMethod     // Catch: java.lang.Throwable -> Le
            java.lang.String r1 = r4.methodName(r1)     // Catch: java.lang.Throwable -> Le
            r0.append(r1)     // Catch: java.lang.Throwable -> Le
            java.lang.String r1 = " fragmentEnter="
            r0.append(r1)     // Catch: java.lang.Throwable -> Le
            java.lang.reflect.Method r1 = r4.chatPageFragmentEnterMethod     // Catch: java.lang.Throwable -> Le
            java.lang.String r1 = r4.methodName(r1)     // Catch: java.lang.Throwable -> Le
            r0.append(r1)     // Catch: java.lang.Throwable -> Le
            java.lang.String r1 = " fragmentExit="
            r0.append(r1)     // Catch: java.lang.Throwable -> Le
            java.lang.reflect.Method r1 = r4.chatPageFragmentExitMethod     // Catch: java.lang.Throwable -> Le
            java.lang.String r1 = r4.methodName(r1)     // Catch: java.lang.Throwable -> Le
            r0.append(r1)     // Catch: java.lang.Throwable -> Le
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> Le
            r4.logDetail(r0)     // Catch: java.lang.Throwable -> Le
            goto L102
        Lf8:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "[Hchat:DexFinder] resolveChatPageApi 失败: "
            r1.<init>(r2)
            bc.e.s(r0, r1, r0)
        L102:
            return
    }

    public void resolveContactCardApi() {
            r3 = this;
            java.lang.reflect.Method r0 = r3.contactCardXmlMethod     // Catch: java.lang.Throwable -> L40
            boolean r0 = r3.isContactCardXmlMethod(r0)     // Catch: java.lang.Throwable -> L40
            if (r0 == 0) goto La
            goto La0
        La:
            org.luckypray.dexkit.DexKitBridge r0 = r3.dexKit     // Catch: java.lang.Throwable -> L40
            java.lang.String r1 = "MicroMsg.SendContactCardHelper"
            java.lang.String r2 = "getBizNameCardString"
            java.lang.String[] r1 = new java.lang.String[]{r1, r2}     // Catch: java.lang.Throwable -> L40
            ch.e r1 = r3.mkMethodUsingStrings(r1)     // Catch: java.lang.Throwable -> L40
            hh.p r0 = r0.findMethod(r1)     // Catch: java.lang.Throwable -> L40
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L40
        L20:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L40
            if (r1 == 0) goto L42
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L40
            hh.o r1 = (hh.o) r1     // Catch: java.lang.Throwable -> L40
            java.lang.ClassLoader r2 = r3.classLoader     // Catch: java.lang.Throwable -> L20
            java.lang.reflect.Method r1 = r1.r(r2)     // Catch: java.lang.Throwable -> L20
            boolean r2 = r3.isContactCardXmlMethod(r1)     // Catch: java.lang.Throwable -> L20
            if (r2 != 0) goto L39
            goto L20
        L39:
            java.lang.reflect.Method r1 = h.Hchat.utils.KavaReflector.accessible(r1)     // Catch: java.lang.Throwable -> L20
            r3.contactCardXmlMethod = r1     // Catch: java.lang.Throwable -> L20
            goto L42
        L40:
            r0 = move-exception
            goto L96
        L42:
            java.lang.reflect.Method r0 = r3.contactCardXmlMethod     // Catch: java.lang.Throwable -> L40
            if (r0 != 0) goto L7b
            org.luckypray.dexkit.DexKitBridge r0 = r3.dexKit     // Catch: java.lang.Throwable -> L40
            java.lang.String r1 = "bigheadimgurl"
            java.lang.String r2 = "smallheadimgurl"
            java.lang.String[] r1 = new java.lang.String[]{r1, r2}     // Catch: java.lang.Throwable -> L40
            ch.e r1 = r3.mkMethodUsingStrings(r1)     // Catch: java.lang.Throwable -> L40
            hh.p r0 = r0.findMethod(r1)     // Catch: java.lang.Throwable -> L40
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L40
        L5c:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L40
            if (r1 == 0) goto L7b
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L40
            hh.o r1 = (hh.o) r1     // Catch: java.lang.Throwable -> L40
            java.lang.ClassLoader r2 = r3.classLoader     // Catch: java.lang.Throwable -> L5c
            java.lang.reflect.Method r1 = r1.r(r2)     // Catch: java.lang.Throwable -> L5c
            boolean r2 = r3.isContactCardXmlMethod(r1)     // Catch: java.lang.Throwable -> L5c
            if (r2 != 0) goto L75
            goto L5c
        L75:
            java.lang.reflect.Method r1 = h.Hchat.utils.KavaReflector.accessible(r1)     // Catch: java.lang.Throwable -> L5c
            r3.contactCardXmlMethod = r1     // Catch: java.lang.Throwable -> L5c
        L7b:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L40
            r0.<init>()     // Catch: java.lang.Throwable -> L40
            java.lang.String r1 = "名片XML方法: "
            r0.append(r1)     // Catch: java.lang.Throwable -> L40
            java.lang.reflect.Method r1 = r3.contactCardXmlMethod     // Catch: java.lang.Throwable -> L40
            java.lang.String r1 = r3.methodName(r1)     // Catch: java.lang.Throwable -> L40
            r0.append(r1)     // Catch: java.lang.Throwable -> L40
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L40
            r3.logDetail(r0)     // Catch: java.lang.Throwable -> L40
            goto La0
        L96:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "[Hchat:DexFinder] resolveContactCardApi 失败: "
            r1.<init>(r2)
            bc.e.s(r0, r1, r0)
        La0:
            return
    }

    public void resolveContactLabelNetworkApi() {
            r14 = this;
            java.lang.String r0 = "NetSceneModifyContactLabelList"
            java.lang.String r1 = "MicroMsg.Label.NetSceneModifyContactLabelList"
            java.lang.String r2 = "/cgi-bin/micromsg-bin/modifycontactlabellist"
            java.lang.String r3 = "NetSceneAddContactLabel"
            java.lang.String r4 = "MicroMsg.Label.NetSceneAddContactLabel"
            java.lang.String r5 = "/cgi-bin/micromsg-bin/addcontactlabel"
            java.lang.reflect.Constructor<?> r6 = r14.addContactLabelCtorString     // Catch: java.lang.Throwable -> L1f
            java.lang.Class<java.lang.String> r7 = java.lang.String.class
            if (r6 != 0) goto L22
            java.lang.Class<?> r6 = r14.addContactLabelClass     // Catch: java.lang.Throwable -> L1f
            java.lang.Class[] r8 = new java.lang.Class[]{r7}     // Catch: java.lang.Throwable -> L1f
            java.lang.reflect.Constructor r6 = r14.findCtorByExactTypes(r6, r8)     // Catch: java.lang.Throwable -> L1f
            r14.addContactLabelCtorString = r6     // Catch: java.lang.Throwable -> L1f
            goto L22
        L1f:
            r0 = move-exception
            goto L125
        L22:
            java.lang.reflect.Constructor<?> r6 = r14.addContactLabelCtorList     // Catch: java.lang.Throwable -> L1f
            java.lang.Class<java.util.List> r8 = java.util.List.class
            if (r6 != 0) goto L34
            java.lang.Class<?> r6 = r14.addContactLabelClass     // Catch: java.lang.Throwable -> L1f
            java.lang.Class[] r9 = new java.lang.Class[]{r8}     // Catch: java.lang.Throwable -> L1f
            java.lang.reflect.Constructor r6 = r14.findCtorByExactTypes(r6, r9)     // Catch: java.lang.Throwable -> L1f
            r14.addContactLabelCtorList = r6     // Catch: java.lang.Throwable -> L1f
        L34:
            java.lang.reflect.Constructor<?> r6 = r14.modifyContactLabelListCtor     // Catch: java.lang.Throwable -> L1f
            java.lang.Class<java.util.LinkedList> r9 = java.util.LinkedList.class
            if (r6 != 0) goto L46
            java.lang.Class<?> r6 = r14.modifyContactLabelListClass     // Catch: java.lang.Throwable -> L1f
            java.lang.Class[] r10 = new java.lang.Class[]{r9}     // Catch: java.lang.Throwable -> L1f
            java.lang.reflect.Constructor r6 = r14.findCtorByExactTypes(r6, r10)     // Catch: java.lang.Throwable -> L1f
            r14.modifyContactLabelListCtor = r6     // Catch: java.lang.Throwable -> L1f
        L46:
            java.lang.reflect.Constructor<?> r6 = r14.addContactLabelCtorString     // Catch: java.lang.Throwable -> L1f
            r10 = 20
            if (r6 == 0) goto L50
            java.lang.reflect.Constructor<?> r6 = r14.addContactLabelCtorList     // Catch: java.lang.Throwable -> L1f
            if (r6 != 0) goto La8
        L50:
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L1f
            r6.<init>()     // Catch: java.lang.Throwable -> L1f
            java.lang.String[] r11 = new java.lang.String[]{r5, r4}     // Catch: java.lang.Throwable -> L1f
            java.lang.String[] r12 = new java.lang.String[]{r3}     // Catch: java.lang.Throwable -> L1f
            java.lang.String r13 = "addcontactlabel"
            java.lang.String[] r13 = new java.lang.String[]{r13}     // Catch: java.lang.Throwable -> L1f
            java.lang.String[][] r11 = new java.lang.String[][]{r11, r12, r13}     // Catch: java.lang.Throwable -> L1f
            r14.collectSendTextClassCandidates(r6, r10, r11)     // Catch: java.lang.Throwable -> L1f
            java.lang.String[] r4 = new java.lang.String[]{r5, r4}     // Catch: java.lang.Throwable -> L1f
            java.lang.String[] r3 = new java.lang.String[]{r3}     // Catch: java.lang.Throwable -> L1f
            java.lang.String[][] r3 = new java.lang.String[][]{r4, r3}     // Catch: java.lang.Throwable -> L1f
            r14.collectSendTextMethodOwnerCandidates(r6, r10, r3)     // Catch: java.lang.Throwable -> L1f
            java.util.Iterator r3 = r6.iterator()     // Catch: java.lang.Throwable -> L1f
        L7d:
            boolean r4 = r3.hasNext()     // Catch: java.lang.Throwable -> L1f
            if (r4 == 0) goto La8
            java.lang.Object r4 = r3.next()     // Catch: java.lang.Throwable -> L1f
            java.lang.Class r4 = (java.lang.Class) r4     // Catch: java.lang.Throwable -> L1f
            java.lang.Class[] r5 = new java.lang.Class[]{r7}     // Catch: java.lang.Throwable -> L1f
            java.lang.reflect.Constructor r5 = r14.findCtorByExactTypes(r4, r5)     // Catch: java.lang.Throwable -> L1f
            java.lang.Class[] r6 = new java.lang.Class[]{r8}     // Catch: java.lang.Throwable -> L1f
            java.lang.reflect.Constructor r6 = r14.findCtorByExactTypes(r4, r6)     // Catch: java.lang.Throwable -> L1f
            if (r5 != 0) goto L9e
            if (r6 != 0) goto L9e
            goto L7d
        L9e:
            r14.addContactLabelClass = r4     // Catch: java.lang.Throwable -> L1f
            if (r5 == 0) goto La4
            r14.addContactLabelCtorString = r5     // Catch: java.lang.Throwable -> L1f
        La4:
            if (r6 == 0) goto La8
            r14.addContactLabelCtorList = r6     // Catch: java.lang.Throwable -> L1f
        La8:
            java.lang.reflect.Constructor<?> r3 = r14.modifyContactLabelListCtor     // Catch: java.lang.Throwable -> L1f
            if (r3 != 0) goto Lf4
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L1f
            r3.<init>()     // Catch: java.lang.Throwable -> L1f
            java.lang.String[] r4 = new java.lang.String[]{r2, r1}     // Catch: java.lang.Throwable -> L1f
            java.lang.String[] r5 = new java.lang.String[]{r0}     // Catch: java.lang.Throwable -> L1f
            java.lang.String r6 = "modifycontactlabellist"
            java.lang.String[] r6 = new java.lang.String[]{r6}     // Catch: java.lang.Throwable -> L1f
            java.lang.String[][] r4 = new java.lang.String[][]{r4, r5, r6}     // Catch: java.lang.Throwable -> L1f
            r14.collectSendTextClassCandidates(r3, r10, r4)     // Catch: java.lang.Throwable -> L1f
            java.lang.String[] r1 = new java.lang.String[]{r2, r1}     // Catch: java.lang.Throwable -> L1f
            java.lang.String[] r0 = new java.lang.String[]{r0}     // Catch: java.lang.Throwable -> L1f
            java.lang.String[][] r0 = new java.lang.String[][]{r1, r0}     // Catch: java.lang.Throwable -> L1f
            r14.collectSendTextMethodOwnerCandidates(r3, r10, r0)     // Catch: java.lang.Throwable -> L1f
            java.util.Iterator r0 = r3.iterator()     // Catch: java.lang.Throwable -> L1f
        Ld9:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L1f
            if (r1 == 0) goto Lf4
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L1f
            java.lang.Class r1 = (java.lang.Class) r1     // Catch: java.lang.Throwable -> L1f
            java.lang.Class[] r2 = new java.lang.Class[]{r9}     // Catch: java.lang.Throwable -> L1f
            java.lang.reflect.Constructor r2 = r14.findCtorByExactTypes(r1, r2)     // Catch: java.lang.Throwable -> L1f
            if (r2 != 0) goto Lf0
            goto Ld9
        Lf0:
            r14.modifyContactLabelListClass = r1     // Catch: java.lang.Throwable -> L1f
            r14.modifyContactLabelListCtor = r2     // Catch: java.lang.Throwable -> L1f
        Lf4:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1f
            r0.<init>()     // Catch: java.lang.Throwable -> L1f
            java.lang.String r1 = "联系人标签网络API: add="
            r0.append(r1)     // Catch: java.lang.Throwable -> L1f
            java.lang.Class<?> r1 = r14.addContactLabelClass     // Catch: java.lang.Throwable -> L1f
            java.lang.String r2 = "null"
            if (r1 == 0) goto L109
            java.lang.String r1 = r1.getName()     // Catch: java.lang.Throwable -> L1f
            goto L10a
        L109:
            r1 = r2
        L10a:
            r0.append(r1)     // Catch: java.lang.Throwable -> L1f
            java.lang.String r1 = " modify="
            r0.append(r1)     // Catch: java.lang.Throwable -> L1f
            java.lang.Class<?> r1 = r14.modifyContactLabelListClass     // Catch: java.lang.Throwable -> L1f
            if (r1 == 0) goto L11a
            java.lang.String r2 = r1.getName()     // Catch: java.lang.Throwable -> L1f
        L11a:
            r0.append(r2)     // Catch: java.lang.Throwable -> L1f
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L1f
            r14.logDetail(r0)     // Catch: java.lang.Throwable -> L1f
            return
        L125:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "[Hchat:DexFinder] resolveContactLabelNetworkApi 失败: "
            r1.<init>(r2)
            bc.e.s(r0, r1, r0)
            return
    }

    public void resolveConversationDeleteApi() {
            r4 = this;
            java.lang.reflect.Method r0 = r4.conversationDeleteMethod     // Catch: java.lang.Throwable -> L57
            boolean r0 = r4.isConversationDeleteMethod(r0)     // Catch: java.lang.Throwable -> L57
            if (r0 == 0) goto La
            goto Lb5
        La:
            r0 = 0
            r4.conversationDeleteMethod = r0     // Catch: java.lang.Throwable -> L57
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L57
            r0.<init>()     // Catch: java.lang.Throwable -> L57
            ch.e r1 = new ch.e     // Catch: java.lang.Throwable -> L57
            r1.<init>()     // Catch: java.lang.Throwable -> L57
            fh.k r2 = new fh.k     // Catch: java.lang.Throwable -> L57
            r2.<init>()     // Catch: java.lang.Throwable -> L57
            java.lang.String r3 = "delChatContact username:%s  stack:%s"
            java.lang.String[] r3 = new java.lang.String[]{r3}     // Catch: java.lang.Throwable -> L57
            r2.r0(r3)     // Catch: java.lang.Throwable -> L57
            r1.f1666h = r2     // Catch: java.lang.Throwable -> L57
            org.luckypray.dexkit.DexKitBridge r2 = r4.dexKit     // Catch: java.lang.Throwable -> L57
            hh.p r1 = r2.findMethod(r1)     // Catch: java.lang.Throwable -> L57
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L57
        L31:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L57
            if (r2 == 0) goto L59
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L57
            hh.o r2 = (hh.o) r2     // Catch: java.lang.Throwable -> L57
            java.lang.ClassLoader r3 = r4.classLoader     // Catch: java.lang.Throwable -> L31
            java.lang.reflect.Method r2 = r2.r(r3)     // Catch: java.lang.Throwable -> L31
            boolean r3 = r4.isConversationDeleteMethod(r2)     // Catch: java.lang.Throwable -> L31
            if (r3 == 0) goto L31
            boolean r3 = r0.contains(r2)     // Catch: java.lang.Throwable -> L31
            if (r3 == 0) goto L50
            goto L31
        L50:
            h.Hchat.utils.KavaReflector.accessible(r2)     // Catch: java.lang.Throwable -> L31
            r0.add(r2)     // Catch: java.lang.Throwable -> L31
            goto L31
        L57:
            r0 = move-exception
            goto Lab
        L59:
            int r1 = r0.size()     // Catch: java.lang.Throwable -> L57
            r2 = 1
            if (r1 != r2) goto L84
            r1 = 0
            java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.Throwable -> L57
            java.lang.reflect.Method r0 = (java.lang.reflect.Method) r0     // Catch: java.lang.Throwable -> L57
            r4.conversationDeleteMethod = r0     // Catch: java.lang.Throwable -> L57
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L57
            r0.<init>()     // Catch: java.lang.Throwable -> L57
            java.lang.String r1 = "原生会话删除API: "
            r0.append(r1)     // Catch: java.lang.Throwable -> L57
            java.lang.reflect.Method r1 = r4.conversationDeleteMethod     // Catch: java.lang.Throwable -> L57
            java.lang.String r1 = r4.methodName(r1)     // Catch: java.lang.Throwable -> L57
            r0.append(r1)     // Catch: java.lang.Throwable -> L57
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L57
            r4.logDetail(r0)     // Catch: java.lang.Throwable -> L57
            goto Lb5
        L84:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L57
            r1.<init>()     // Catch: java.lang.Throwable -> L57
            java.lang.String r2 = "[Hchat:DexFinder] 原生会话删除API定位失败: candidates="
            r1.append(r2)     // Catch: java.lang.Throwable -> L57
            int r0 = r0.size()     // Catch: java.lang.Throwable -> L57
            r1.append(r0)     // Catch: java.lang.Throwable -> L57
            java.lang.String r0 = " key="
            r1.append(r0)     // Catch: java.lang.Throwable -> L57
            java.lang.String r0 = r4.runtimeCacheKey     // Catch: java.lang.Throwable -> L57
            java.lang.String r0 = r4.shortKey(r0)     // Catch: java.lang.Throwable -> L57
            r1.append(r0)     // Catch: java.lang.Throwable -> L57
            java.lang.String r0 = r1.toString()     // Catch: java.lang.Throwable -> L57
            fb.v0.m(r0)     // Catch: java.lang.Throwable -> L57
            goto Lb5
        Lab:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "[Hchat:DexFinder] resolveConversationDeleteApi 失败: "
            r1.<init>(r2)
            bc.e.s(r0, r1, r0)
        Lb5:
            return
    }

    public void resolveConversationMuteApi() {
            r3 = this;
            java.lang.String r0 = "原生免打扰API: state="
            java.lang.reflect.Method r1 = r3.serviceGetterMethod     // Catch: java.lang.Throwable -> Le
            boolean r1 = r3.isServiceGetterMethod(r1)     // Catch: java.lang.Throwable -> Le
            if (r1 != 0) goto L11
            r3.resolveServiceManagerApi()     // Catch: java.lang.Throwable -> Le
            goto L11
        Le:
            r0 = move-exception
            goto Lcb
        L11:
            java.lang.reflect.Method r1 = r3.contactMuteEnableMethod     // Catch: java.lang.Throwable -> Le
            boolean r1 = r3.isContactMuteMethod(r1)     // Catch: java.lang.Throwable -> Le
            if (r1 != 0) goto L21
            java.lang.String r1 = "setMute contact invalid username"
            java.lang.reflect.Method r1 = r3.findUniqueMethodUsingString(r1)     // Catch: java.lang.Throwable -> Le
            r3.contactMuteEnableMethod = r1     // Catch: java.lang.Throwable -> Le
        L21:
            java.lang.reflect.Method r1 = r3.contactMuteDisableMethod     // Catch: java.lang.Throwable -> Le
            boolean r1 = r3.isContactMuteMethod(r1)     // Catch: java.lang.Throwable -> Le
            if (r1 != 0) goto L31
            java.lang.String r1 = "unSetMute contact invalid username"
            java.lang.reflect.Method r1 = r3.findUniqueMethodUsingString(r1)     // Catch: java.lang.Throwable -> Le
            r3.contactMuteDisableMethod = r1     // Catch: java.lang.Throwable -> Le
        L31:
            java.lang.reflect.Method r1 = r3.contactMuteStateMethod     // Catch: java.lang.Throwable -> Le
            java.lang.reflect.Method r2 = r3.contactMuteEnableMethod     // Catch: java.lang.Throwable -> Le
            boolean r1 = r3.isContactMuteStateMethod(r1, r2)     // Catch: java.lang.Throwable -> Le
            if (r1 != 0) goto L41
            java.lang.reflect.Method r1 = r3.findContactMuteStateMethod()     // Catch: java.lang.Throwable -> Le
            r3.contactMuteStateMethod = r1     // Catch: java.lang.Throwable -> Le
        L41:
            boolean r1 = r3.isContactStorageLookupApiReady()     // Catch: java.lang.Throwable -> Le
            if (r1 != 0) goto L4a
            r3.resolveContactStorageLookupApi()     // Catch: java.lang.Throwable -> Le
        L4a:
            boolean r1 = r3.isChatroomMuteApiReady()     // Catch: java.lang.Throwable -> Le
            if (r1 != 0) goto L53
            r3.resolveChatroomMuteApi()     // Catch: java.lang.Throwable -> Le
        L53:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Le
            r1.<init>(r0)     // Catch: java.lang.Throwable -> Le
            java.lang.reflect.Method r0 = r3.contactMuteStateMethod     // Catch: java.lang.Throwable -> Le
            java.lang.String r0 = r3.methodName(r0)     // Catch: java.lang.Throwable -> Le
            r1.append(r0)     // Catch: java.lang.Throwable -> Le
            java.lang.String r0 = " enable="
            r1.append(r0)     // Catch: java.lang.Throwable -> Le
            java.lang.reflect.Method r0 = r3.contactMuteEnableMethod     // Catch: java.lang.Throwable -> Le
            java.lang.String r0 = r3.methodName(r0)     // Catch: java.lang.Throwable -> Le
            r1.append(r0)     // Catch: java.lang.Throwable -> Le
            java.lang.String r0 = " disable="
            r1.append(r0)     // Catch: java.lang.Throwable -> Le
            java.lang.reflect.Method r0 = r3.contactMuteDisableMethod     // Catch: java.lang.Throwable -> Le
            java.lang.String r0 = r3.methodName(r0)     // Catch: java.lang.Throwable -> Le
            r1.append(r0)     // Catch: java.lang.Throwable -> Le
            java.lang.String r0 = " contactStorageGetter="
            r1.append(r0)     // Catch: java.lang.Throwable -> Le
            java.lang.reflect.Method r0 = r3.contactStorageGetterMethod     // Catch: java.lang.Throwable -> Le
            java.lang.String r0 = r3.methodName(r0)     // Catch: java.lang.Throwable -> Le
            r1.append(r0)     // Catch: java.lang.Throwable -> Le
            java.lang.String r0 = " contactStorageQuery="
            r1.append(r0)     // Catch: java.lang.Throwable -> Le
            java.lang.reflect.Method r0 = r3.contactStorageQueryMethod     // Catch: java.lang.Throwable -> Le
            java.lang.String r0 = r3.methodName(r0)     // Catch: java.lang.Throwable -> Le
            r1.append(r0)     // Catch: java.lang.Throwable -> Le
            java.lang.String r0 = " roomGetter="
            r1.append(r0)     // Catch: java.lang.Throwable -> Le
            java.lang.reflect.Method r0 = r3.chatroomMuteServiceGetterMethod     // Catch: java.lang.Throwable -> Le
            java.lang.String r0 = r3.methodName(r0)     // Catch: java.lang.Throwable -> Le
            r1.append(r0)     // Catch: java.lang.Throwable -> Le
            java.lang.String r0 = " roomBuild="
            r1.append(r0)     // Catch: java.lang.Throwable -> Le
            java.lang.reflect.Method r0 = r3.chatroomMuteBuildMethod     // Catch: java.lang.Throwable -> Le
            java.lang.String r0 = r3.methodName(r0)     // Catch: java.lang.Throwable -> Le
            r1.append(r0)     // Catch: java.lang.Throwable -> Le
            java.lang.String r0 = " roomSubmit="
            r1.append(r0)     // Catch: java.lang.Throwable -> Le
            java.lang.reflect.Method r0 = r3.chatroomMuteSubmitMethod     // Catch: java.lang.Throwable -> Le
            java.lang.String r0 = r3.methodName(r0)     // Catch: java.lang.Throwable -> Le
            r1.append(r0)     // Catch: java.lang.Throwable -> Le
            java.lang.String r0 = r1.toString()     // Catch: java.lang.Throwable -> Le
            r3.logDetail(r0)     // Catch: java.lang.Throwable -> Le
            return
        Lcb:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "[Hchat:DexFinder] resolveConversationMuteApi 失败: "
            r1.<init>(r2)
            bc.e.s(r0, r1, r0)
            return
    }

    public void resolveDatabaseApi() {
            r4 = this;
            java.lang.reflect.Method r0 = r4.coreStorageGetter     // Catch: java.lang.Throwable -> Le
            if (r0 == 0) goto L11
            java.lang.Class<?> r0 = r4.sqliteDbWrapperClass     // Catch: java.lang.Throwable -> Le
            if (r0 == 0) goto L11
            java.lang.Class<?> r0 = r4.configStorageClass     // Catch: java.lang.Throwable -> Le
            if (r0 == 0) goto L11
            goto L100
        Le:
            r0 = move-exception
            goto Lf6
        L11:
            java.lang.String r0 = "MicroMsg.MMKernel"
            java.lang.String r1 = "Kernel not null, has initialized."
            java.lang.String[] r0 = new java.lang.String[]{r0, r1}     // Catch: java.lang.Throwable -> Le
            java.lang.Class r0 = r4.findFirstClassByStrings(r0)     // Catch: java.lang.Throwable -> Le
            r4.mmKernelClass = r0     // Catch: java.lang.Throwable -> Le
            org.luckypray.dexkit.DexKitBridge r0 = r4.dexKit     // Catch: java.lang.Throwable -> Le
            java.lang.String r1 = "mCoreStorage not initialized!"
            java.lang.String[] r1 = new java.lang.String[]{r1}     // Catch: java.lang.Throwable -> Le
            ch.e r1 = r4.mkMethodUsingStrings(r1)     // Catch: java.lang.Throwable -> Le
            hh.p r0 = r0.findMethod(r1)     // Catch: java.lang.Throwable -> Le
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> Le
        L33:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> Le
            if (r1 == 0) goto L61
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> Le
            hh.o r1 = (hh.o) r1     // Catch: java.lang.Throwable -> Le
            java.lang.ClassLoader r2 = r4.classLoader     // Catch: java.lang.Throwable -> L33
            java.lang.reflect.Method r1 = r1.r(r2)     // Catch: java.lang.Throwable -> L33
            java.lang.Class[] r2 = r1.getParameterTypes()     // Catch: java.lang.Throwable -> L33
            int r2 = r2.length     // Catch: java.lang.Throwable -> L33
            if (r2 == 0) goto L4d
            goto L33
        L4d:
            java.lang.Class r2 = r1.getReturnType()     // Catch: java.lang.Throwable -> L33
            java.lang.Class r3 = java.lang.Void.TYPE     // Catch: java.lang.Throwable -> L33
            if (r2 != r3) goto L56
            goto L33
        L56:
            h.Hchat.utils.KavaReflector.accessible(r1)     // Catch: java.lang.Throwable -> L33
            r4.coreStorageGetter = r1     // Catch: java.lang.Throwable -> L33
            java.lang.Class r1 = r1.getReturnType()     // Catch: java.lang.Throwable -> L33
            r4.coreStorageClass = r1     // Catch: java.lang.Throwable -> L33
        L61:
            java.lang.Class<?> r0 = r4.coreStorageClass     // Catch: java.lang.Throwable -> Le
            if (r0 != 0) goto L73
            java.lang.String r0 = "MMKernel.CoreStorage"
            java.lang.String r1 = "CheckData path[%s] blocksize:%s blockcount:%s availcount:%s"
            java.lang.String[] r0 = new java.lang.String[]{r0, r1}     // Catch: java.lang.Throwable -> Le
            java.lang.Class r0 = r4.findFirstClassByStrings(r0)     // Catch: java.lang.Throwable -> Le
            r4.coreStorageClass = r0     // Catch: java.lang.Throwable -> Le
        L73:
            java.lang.String r0 = "MicroMsg.ConfigStorage"
            java.lang.String r1 = "shouldProcessEvent db is close :%s"
            java.lang.String[] r0 = new java.lang.String[]{r0, r1}     // Catch: java.lang.Throwable -> Le
            java.lang.Class r0 = r4.findFirstClassByStrings(r0)     // Catch: java.lang.Throwable -> Le
            r4.configStorageClass = r0     // Catch: java.lang.Throwable -> Le
            java.lang.String r0 = "MicroMsg.SqliteDB"
            java.lang.String r1 = "sql is null "
            java.lang.String[] r0 = new java.lang.String[]{r0, r1}     // Catch: java.lang.Throwable -> Le
            java.lang.Class r0 = r4.findFirstClassByStrings(r0)     // Catch: java.lang.Throwable -> Le
            r4.sqliteDbWrapperClass = r0     // Catch: java.lang.Throwable -> Le
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Le
            r0.<init>()     // Catch: java.lang.Throwable -> Le
            java.lang.String r1 = "数据库API: kernel="
            r0.append(r1)     // Catch: java.lang.Throwable -> Le
            java.lang.Class<?> r1 = r4.mmKernelClass     // Catch: java.lang.Throwable -> Le
            java.lang.String r2 = "null"
            if (r1 == 0) goto La4
            java.lang.String r1 = r1.getName()     // Catch: java.lang.Throwable -> Le
            goto La5
        La4:
            r1 = r2
        La5:
            r0.append(r1)     // Catch: java.lang.Throwable -> Le
            java.lang.String r1 = " storageGetter="
            r0.append(r1)     // Catch: java.lang.Throwable -> Le
            java.lang.reflect.Method r1 = r4.coreStorageGetter     // Catch: java.lang.Throwable -> Le
            if (r1 == 0) goto Lb6
            java.lang.String r1 = r1.getName()     // Catch: java.lang.Throwable -> Le
            goto Lb7
        Lb6:
            r1 = r2
        Lb7:
            r0.append(r1)     // Catch: java.lang.Throwable -> Le
            java.lang.String r1 = " coreStorage="
            r0.append(r1)     // Catch: java.lang.Throwable -> Le
            java.lang.Class<?> r1 = r4.coreStorageClass     // Catch: java.lang.Throwable -> Le
            if (r1 == 0) goto Lc8
            java.lang.String r1 = r1.getName()     // Catch: java.lang.Throwable -> Le
            goto Lc9
        Lc8:
            r1 = r2
        Lc9:
            r0.append(r1)     // Catch: java.lang.Throwable -> Le
            java.lang.String r1 = " config="
            r0.append(r1)     // Catch: java.lang.Throwable -> Le
            java.lang.Class<?> r1 = r4.configStorageClass     // Catch: java.lang.Throwable -> Le
            if (r1 == 0) goto Lda
            java.lang.String r1 = r1.getName()     // Catch: java.lang.Throwable -> Le
            goto Ldb
        Lda:
            r1 = r2
        Ldb:
            r0.append(r1)     // Catch: java.lang.Throwable -> Le
            java.lang.String r1 = " sqlite="
            r0.append(r1)     // Catch: java.lang.Throwable -> Le
            java.lang.Class<?> r1 = r4.sqliteDbWrapperClass     // Catch: java.lang.Throwable -> Le
            if (r1 == 0) goto Leb
            java.lang.String r2 = r1.getName()     // Catch: java.lang.Throwable -> Le
        Leb:
            r0.append(r2)     // Catch: java.lang.Throwable -> Le
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> Le
            r4.logDetail(r0)     // Catch: java.lang.Throwable -> Le
            goto L100
        Lf6:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "[Hchat:DexFinder] resolveDatabaseApi 失败: "
            r1.<init>(r2)
            bc.e.s(r0, r1, r0)
        L100:
            return
    }

    public void resolveDelChatroomMemberApi() {
            r4 = this;
            java.lang.String r0 = "/cgi-bin/micromsg-bin/delchatroommember"
            java.lang.reflect.Constructor<?> r1 = r4.delChatroomMemberCtor     // Catch: java.lang.Throwable -> Lf
            if (r1 != 0) goto L11
            java.lang.Class<?> r1 = r4.delChatroomMemberClass     // Catch: java.lang.Throwable -> Lf
            java.lang.reflect.Constructor r1 = r4.findDelChatroomMemberCtor(r1)     // Catch: java.lang.Throwable -> Lf
            r4.delChatroomMemberCtor = r1     // Catch: java.lang.Throwable -> Lf
            goto L11
        Lf:
            r0 = move-exception
            goto L74
        L11:
            java.lang.reflect.Constructor<?> r1 = r4.delChatroomMemberCtor     // Catch: java.lang.Throwable -> Lf
            if (r1 == 0) goto L16
            return
        L16:
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Throwable -> Lf
            r1.<init>()     // Catch: java.lang.Throwable -> Lf
            java.lang.String[] r2 = new java.lang.String[]{r0}     // Catch: java.lang.Throwable -> Lf
            java.lang.String r3 = "delchatroommember"
            java.lang.String[] r3 = new java.lang.String[]{r3}     // Catch: java.lang.Throwable -> Lf
            java.lang.String[][] r2 = new java.lang.String[][]{r2, r3}     // Catch: java.lang.Throwable -> Lf
            r3 = 20
            r4.collectSendTextClassCandidates(r1, r3, r2)     // Catch: java.lang.Throwable -> Lf
            java.lang.String[] r0 = new java.lang.String[]{r0}     // Catch: java.lang.Throwable -> Lf
            java.lang.String[][] r0 = new java.lang.String[][]{r0}     // Catch: java.lang.Throwable -> Lf
            r4.collectSendTextMethodOwnerCandidates(r1, r3, r0)     // Catch: java.lang.Throwable -> Lf
            java.util.Iterator r0 = r1.iterator()     // Catch: java.lang.Throwable -> Lf
        L3d:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> Lf
            if (r1 == 0) goto L54
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> Lf
            java.lang.Class r1 = (java.lang.Class) r1     // Catch: java.lang.Throwable -> Lf
            java.lang.reflect.Constructor r2 = r4.findDelChatroomMemberCtor(r1)     // Catch: java.lang.Throwable -> Lf
            if (r2 != 0) goto L50
            goto L3d
        L50:
            r4.delChatroomMemberClass = r1     // Catch: java.lang.Throwable -> Lf
            r4.delChatroomMemberCtor = r2     // Catch: java.lang.Throwable -> Lf
        L54:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lf
            r0.<init>()     // Catch: java.lang.Throwable -> Lf
            java.lang.String r1 = "移除群成员API: "
            r0.append(r1)     // Catch: java.lang.Throwable -> Lf
            java.lang.Class<?> r1 = r4.delChatroomMemberClass     // Catch: java.lang.Throwable -> Lf
            if (r1 == 0) goto L67
            java.lang.String r1 = r1.getName()     // Catch: java.lang.Throwable -> Lf
            goto L69
        L67:
            java.lang.String r1 = "null"
        L69:
            r0.append(r1)     // Catch: java.lang.Throwable -> Lf
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> Lf
            r4.logDetail(r0)     // Catch: java.lang.Throwable -> Lf
            return
        L74:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "[Hchat:DexFinder] resolveDelChatroomMemberApi 失败: "
            r1.<init>(r2)
            bc.e.s(r0, r1, r0)
            return
    }

    public void resolveFavoriteApi() {
            r3 = this;
            java.lang.String r0 = "收藏API: item="
            r3.resolveFavoriteItemApi()     // Catch: java.lang.Throwable -> L1b
            r3.resolveFavoriteListApi()     // Catch: java.lang.Throwable -> L1b
            r3.resolveFavoriteSendApi()     // Catch: java.lang.Throwable -> L1b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1b
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L1b
            java.lang.Class<?> r0 = r3.favoriteItemClass     // Catch: java.lang.Throwable -> L1b
            java.lang.String r2 = "null"
            if (r0 == 0) goto L1d
            java.lang.String r0 = r0.getName()     // Catch: java.lang.Throwable -> L1b
            goto L1e
        L1b:
            r0 = move-exception
            goto L63
        L1d:
            r0 = r2
        L1e:
            r1.append(r0)     // Catch: java.lang.Throwable -> L1b
            java.lang.String r0 = " convert="
            r1.append(r0)     // Catch: java.lang.Throwable -> L1b
            java.lang.reflect.Method r0 = r3.favoriteItemConvertFromCursorMethod     // Catch: java.lang.Throwable -> L1b
            java.lang.String r0 = r3.methodName(r0)     // Catch: java.lang.Throwable -> L1b
            r1.append(r0)     // Catch: java.lang.Throwable -> L1b
            java.lang.String r0 = " list="
            r1.append(r0)     // Catch: java.lang.Throwable -> L1b
            java.lang.reflect.Method r0 = r3.favoriteListMethod     // Catch: java.lang.Throwable -> L1b
            java.lang.String r0 = r3.methodName(r0)     // Catch: java.lang.Throwable -> L1b
            r1.append(r0)     // Catch: java.lang.Throwable -> L1b
            java.lang.String r0 = " send="
            r1.append(r0)     // Catch: java.lang.Throwable -> L1b
            java.lang.reflect.Method r0 = r3.favoriteSendMethod     // Catch: java.lang.Throwable -> L1b
            java.lang.String r0 = r3.methodName(r0)     // Catch: java.lang.Throwable -> L1b
            r1.append(r0)     // Catch: java.lang.Throwable -> L1b
            java.lang.String r0 = " param="
            r1.append(r0)     // Catch: java.lang.Throwable -> L1b
            java.lang.Class<?> r0 = r3.favoriteSendParamClass     // Catch: java.lang.Throwable -> L1b
            if (r0 == 0) goto L58
            java.lang.String r2 = r0.getName()     // Catch: java.lang.Throwable -> L1b
        L58:
            r1.append(r2)     // Catch: java.lang.Throwable -> L1b
            java.lang.String r0 = r1.toString()     // Catch: java.lang.Throwable -> L1b
            r3.logDetail(r0)     // Catch: java.lang.Throwable -> L1b
            return
        L63:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "[Hchat:DexFinder] resolveFavoriteApi 失败: "
            r1.<init>(r2)
            bc.e.s(r0, r1, r0)
            return
    }

    public void resolveGetContactServiceApi() {
            r3 = this;
            java.lang.String r0 = "联系人资料服务方法: "
            java.util.List<java.lang.reflect.Method> r1 = r3.getContactAddMethods     // Catch: java.lang.Throwable -> L15
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L15
            if (r1 == 0) goto L17
            java.lang.String r1 = "dkverify add Contact"
            r3.collectGetContactAddMethods(r1)     // Catch: java.lang.Throwable -> L15
            java.lang.String r1 = "[addContact] has consume"
            r3.collectGetContactAddMethods(r1)     // Catch: java.lang.Throwable -> L15
            goto L17
        L15:
            r0 = move-exception
            goto L38
        L17:
            java.util.List<java.lang.reflect.Method> r1 = r3.getContactServiceGetters     // Catch: java.lang.Throwable -> L15
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L15
            if (r1 == 0) goto L22
            r3.collectGetContactServiceGetters()     // Catch: java.lang.Throwable -> L15
        L22:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L15
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L15
            java.util.List<java.lang.reflect.Method> r0 = r3.getContactAddMethods     // Catch: java.lang.Throwable -> L15
            int r0 = r0.size()     // Catch: java.lang.Throwable -> L15
            r1.append(r0)     // Catch: java.lang.Throwable -> L15
            java.lang.String r0 = r1.toString()     // Catch: java.lang.Throwable -> L15
            r3.logDetail(r0)     // Catch: java.lang.Throwable -> L15
            return
        L38:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "[Hchat:DexFinder] resolveGetContactServiceApi 失败: "
            r1.<init>(r2)
            bc.e.s(r0, r1, r0)
            return
    }

    public void resolveGroupMemberDisplayName() {
            r6 = this;
            java.lang.reflect.Method r0 = r6.groupMemberDisplayNameMethod     // Catch: java.lang.Throwable -> L4e
            if (r0 == 0) goto L6
            goto L9a
        L6:
            org.luckypray.dexkit.DexKitBridge r0 = r6.dexKit     // Catch: java.lang.Throwable -> L4e
            java.lang.String r1 = "ChatroomDisplayNameCache"
            java.lang.String[] r1 = new java.lang.String[]{r1}     // Catch: java.lang.Throwable -> L4e
            ch.e r1 = r6.mkMethodUsingStrings(r1)     // Catch: java.lang.Throwable -> L4e
            hh.p r0 = r0.findMethod(r1)     // Catch: java.lang.Throwable -> L4e
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L4e
        L1a:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L4e
            if (r1 == 0) goto L50
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L4e
            hh.o r1 = (hh.o) r1     // Catch: java.lang.Throwable -> L4e
            java.lang.ClassLoader r2 = r6.classLoader     // Catch: java.lang.Throwable -> L1a
            java.lang.reflect.Method r1 = r1.r(r2)     // Catch: java.lang.Throwable -> L1a
            java.lang.Class r2 = r1.getReturnType()     // Catch: java.lang.Throwable -> L1a
            java.lang.Class<java.lang.String> r3 = java.lang.String.class
            if (r2 == r3) goto L35
            goto L1a
        L35:
            java.lang.Class[] r2 = r1.getParameterTypes()     // Catch: java.lang.Throwable -> L1a
            int r4 = r2.length     // Catch: java.lang.Throwable -> L1a
            r5 = 2
            if (r4 != r5) goto L1a
            r4 = 0
            r4 = r2[r4]     // Catch: java.lang.Throwable -> L1a
            if (r4 != r3) goto L1a
            r4 = 1
            r2 = r2[r4]     // Catch: java.lang.Throwable -> L1a
            if (r2 == r3) goto L48
            goto L1a
        L48:
            h.Hchat.utils.KavaReflector.accessible(r1)     // Catch: java.lang.Throwable -> L1a
            r6.groupMemberDisplayNameMethod = r1     // Catch: java.lang.Throwable -> L1a
            goto L50
        L4e:
            r0 = move-exception
            goto L90
        L50:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L4e
            r0.<init>()     // Catch: java.lang.Throwable -> L4e
            java.lang.String r1 = "群成员昵称方法: "
            r0.append(r1)     // Catch: java.lang.Throwable -> L4e
            java.lang.reflect.Method r1 = r6.groupMemberDisplayNameMethod     // Catch: java.lang.Throwable -> L4e
            if (r1 == 0) goto L83
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L4e
            r1.<init>()     // Catch: java.lang.Throwable -> L4e
            java.lang.reflect.Method r2 = r6.groupMemberDisplayNameMethod     // Catch: java.lang.Throwable -> L4e
            java.lang.Class r2 = r2.getDeclaringClass()     // Catch: java.lang.Throwable -> L4e
            java.lang.String r2 = r2.getName()     // Catch: java.lang.Throwable -> L4e
            r1.append(r2)     // Catch: java.lang.Throwable -> L4e
            java.lang.String r2 = "#"
            r1.append(r2)     // Catch: java.lang.Throwable -> L4e
            java.lang.reflect.Method r2 = r6.groupMemberDisplayNameMethod     // Catch: java.lang.Throwable -> L4e
            java.lang.String r2 = r2.getName()     // Catch: java.lang.Throwable -> L4e
            r1.append(r2)     // Catch: java.lang.Throwable -> L4e
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L4e
            goto L85
        L83:
            java.lang.String r1 = "null"
        L85:
            r0.append(r1)     // Catch: java.lang.Throwable -> L4e
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L4e
            r6.logDetail(r0)     // Catch: java.lang.Throwable -> L4e
            goto L9a
        L90:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "[Hchat:DexFinder] resolveGroupMemberDisplayName 失败: "
            r1.<init>(r2)
            bc.e.s(r0, r1, r0)
        L9a:
            return
    }

    public void resolveGroupSolitaireApi() {
            r7 = this;
            java.lang.String r0 = "sendGroupSolitatire"
            java.lang.String r1 = "sendGroupSolitatire() content ret:%s"
            java.lang.String r2 = "PluginGroupSolitaire"
            java.lang.reflect.Method r3 = r7.groupSolitaireSendMethod     // Catch: java.lang.Throwable -> Lf
            if (r3 == 0) goto L12
            java.lang.Class<?> r3 = r7.groupSolitairePluginClass     // Catch: java.lang.Throwable -> Lf
            if (r3 == 0) goto L12
            return
        Lf:
            r0 = move-exception
            goto L88
        L12:
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch: java.lang.Throwable -> Lf
            r3.<init>()     // Catch: java.lang.Throwable -> Lf
            java.lang.String[] r4 = new java.lang.String[]{r1, r2}     // Catch: java.lang.Throwable -> Lf
            java.lang.String r5 = "GroupSolitaire"
            java.lang.String[] r5 = new java.lang.String[]{r5, r0}     // Catch: java.lang.Throwable -> Lf
            java.lang.String r6 = "solitaire_info"
            java.lang.String[] r6 = new java.lang.String[]{r6, r2}     // Catch: java.lang.Throwable -> Lf
            java.lang.String[][] r4 = new java.lang.String[][]{r4, r5, r6}     // Catch: java.lang.Throwable -> Lf
            r5 = 20
            r7.collectSendTextClassCandidates(r3, r5, r4)     // Catch: java.lang.Throwable -> Lf
            java.lang.String[] r1 = new java.lang.String[]{r1, r2}     // Catch: java.lang.Throwable -> Lf
            java.lang.String[] r0 = new java.lang.String[]{r0}     // Catch: java.lang.Throwable -> Lf
            java.lang.String[][] r0 = new java.lang.String[][]{r1, r0}     // Catch: java.lang.Throwable -> Lf
            r7.collectSendTextMethodOwnerCandidates(r3, r5, r0)     // Catch: java.lang.Throwable -> Lf
            java.util.Iterator r0 = r3.iterator()     // Catch: java.lang.Throwable -> Lf
        L43:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> Lf
            if (r1 == 0) goto L5a
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> Lf
            java.lang.Class r1 = (java.lang.Class) r1     // Catch: java.lang.Throwable -> Lf
            java.lang.reflect.Method r2 = r7.findGroupSolitaireSendMethod(r1)     // Catch: java.lang.Throwable -> Lf
            if (r2 != 0) goto L56
            goto L43
        L56:
            r7.groupSolitairePluginClass = r1     // Catch: java.lang.Throwable -> Lf
            r7.groupSolitaireSendMethod = r2     // Catch: java.lang.Throwable -> Lf
        L5a:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lf
            r0.<init>()     // Catch: java.lang.Throwable -> Lf
            java.lang.String r1 = "接龙发送API: "
            r0.append(r1)     // Catch: java.lang.Throwable -> Lf
            java.lang.Class<?> r1 = r7.groupSolitairePluginClass     // Catch: java.lang.Throwable -> Lf
            if (r1 == 0) goto L6d
            java.lang.String r1 = r1.getName()     // Catch: java.lang.Throwable -> Lf
            goto L6f
        L6d:
            java.lang.String r1 = "null"
        L6f:
            r0.append(r1)     // Catch: java.lang.Throwable -> Lf
            java.lang.String r1 = " method="
            r0.append(r1)     // Catch: java.lang.Throwable -> Lf
            java.lang.reflect.Method r1 = r7.groupSolitaireSendMethod     // Catch: java.lang.Throwable -> Lf
            java.lang.String r1 = r7.methodName(r1)     // Catch: java.lang.Throwable -> Lf
            r0.append(r1)     // Catch: java.lang.Throwable -> Lf
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> Lf
            r7.logDetail(r0)     // Catch: java.lang.Throwable -> Lf
            return
        L88:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "[Hchat:DexFinder] resolveGroupSolitaireApi 失败: "
            r1.<init>(r2)
            bc.e.s(r0, r1, r0)
            return
    }

    public void resolveImageCdnDownloadApi() {
            r10 = this;
            r10.resolveMarsCdnDownloadApi()     // Catch: java.lang.Throwable -> L1d
            java.lang.Class<?> r0 = r10.imageCdnTaskClass     // Catch: java.lang.Throwable -> L1d
            boolean r0 = r10.isImageCdnTaskClass(r0)     // Catch: java.lang.Throwable -> L1d
            if (r0 == 0) goto L20
            java.lang.reflect.Method r0 = r10.imageCdnSubmitMethod     // Catch: java.lang.Throwable -> L1d
            boolean r0 = r10.isPreferredImageCdnSubmitMethod(r0)     // Catch: java.lang.Throwable -> L1d
            if (r0 == 0) goto L20
            java.lang.reflect.Method r0 = r10.imageCdnServiceGetterMethod     // Catch: java.lang.Throwable -> L1d
            boolean r0 = r10.isImageCdnServiceGetterMethod(r0)     // Catch: java.lang.Throwable -> L1d
            if (r0 == 0) goto L20
            goto L1f4
        L1d:
            r0 = move-exception
            goto L1ea
        L20:
            r0 = 0
            r10.imageCdnSubmitMethod = r0     // Catch: java.lang.Throwable -> L1d
            r10.imageCdnServiceGetterMethod = r0     // Catch: java.lang.Throwable -> L1d
            java.lang.Class<?> r0 = r10.imageCdnTaskClass     // Catch: java.lang.Throwable -> L1d
            boolean r0 = r10.isImageCdnTaskClass(r0)     // Catch: java.lang.Throwable -> L1d
            java.lang.String r1 = "field_fileType"
            java.lang.String r2 = "field_aesKey"
            java.lang.String r3 = "field_fileId"
            java.lang.String r4 = "field_fullpath"
            if (r0 != 0) goto L62
            org.luckypray.dexkit.DexKitBridge r0 = r10.dexKit     // Catch: java.lang.Throwable -> L1d
            java.lang.String[] r5 = new java.lang.String[]{r4, r3, r2, r1}     // Catch: java.lang.Throwable -> L1d
            ch.c r5 = r10.mkClassUsingStrings(r5)     // Catch: java.lang.Throwable -> L1d
            hh.j r0 = r0.findClass(r5)     // Catch: java.lang.Throwable -> L1d
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L1d
        L47:
            boolean r5 = r0.hasNext()     // Catch: java.lang.Throwable -> L1d
            if (r5 == 0) goto L62
            java.lang.Object r5 = r0.next()     // Catch: java.lang.Throwable -> L1d
            hh.i r5 = (hh.i) r5     // Catch: java.lang.Throwable -> L1d
            java.lang.ClassLoader r6 = r10.classLoader     // Catch: java.lang.Throwable -> L47
            java.lang.Class r5 = r5.q(r6)     // Catch: java.lang.Throwable -> L47
            boolean r6 = r10.isImageCdnTaskClass(r5)     // Catch: java.lang.Throwable -> L47
            if (r6 != 0) goto L60
            goto L47
        L60:
            r10.imageCdnTaskClass = r5     // Catch: java.lang.Throwable -> L47
        L62:
            java.lang.Class<?> r0 = r10.imageCdnTaskClass     // Catch: java.lang.Throwable -> L1d
            boolean r0 = r10.isImageCdnTaskClass(r0)     // Catch: java.lang.Throwable -> L1d
            r5 = 0
            if (r0 != 0) goto Lb5
            org.luckypray.dexkit.DexKitBridge r0 = r10.dexKit     // Catch: java.lang.Throwable -> L1d
            java.lang.String[] r1 = new java.lang.String[]{r4, r3, r1}     // Catch: java.lang.Throwable -> L1d
            ch.e r1 = r10.mkMethodUsingStrings(r1)     // Catch: java.lang.Throwable -> L1d
            hh.p r0 = r0.findMethod(r1)     // Catch: java.lang.Throwable -> L1d
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L1d
        L7d:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L1d
            if (r1 == 0) goto Lb5
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L1d
            hh.o r1 = (hh.o) r1     // Catch: java.lang.Throwable -> L1d
            java.lang.ClassLoader r6 = r10.classLoader     // Catch: java.lang.Throwable -> L7d
            java.lang.reflect.Method r1 = r1.r(r6)     // Catch: java.lang.Throwable -> L7d
            java.lang.Class r6 = r1.getReturnType()     // Catch: java.lang.Throwable -> L7d
            boolean r7 = r10.isImageCdnTaskClass(r6)     // Catch: java.lang.Throwable -> L7d
            if (r7 == 0) goto L9c
            r10.imageCdnTaskClass = r6     // Catch: java.lang.Throwable -> L7d
            goto Lb5
        L9c:
            java.lang.Class[] r1 = r1.getParameterTypes()     // Catch: java.lang.Throwable -> L7d
            int r6 = r1.length     // Catch: java.lang.Throwable -> L7d
            r7 = r5
        La2:
            if (r7 >= r6) goto Lb1
            r8 = r1[r7]     // Catch: java.lang.Throwable -> L7d
            boolean r9 = r10.isImageCdnTaskClass(r8)     // Catch: java.lang.Throwable -> L7d
            if (r9 != 0) goto Laf
            int r7 = r7 + 1
            goto La2
        Laf:
            r10.imageCdnTaskClass = r8     // Catch: java.lang.Throwable -> L7d
        Lb1:
            java.lang.Class<?> r1 = r10.imageCdnTaskClass     // Catch: java.lang.Throwable -> L7d
            if (r1 == 0) goto L7d
        Lb5:
            java.lang.Class<?> r0 = r10.imageCdnTaskClass     // Catch: java.lang.Throwable -> L1d
            if (r0 == 0) goto Lf1
            ch.e r0 = new ch.e     // Catch: java.lang.Throwable -> L1d
            r0.<init>()     // Catch: java.lang.Throwable -> L1d
            fh.k r1 = new fh.k     // Catch: java.lang.Throwable -> L1d
            r1.<init>()     // Catch: java.lang.Throwable -> L1d
            r6 = 2
            r1.m0(r6)     // Catch: java.lang.Throwable -> L1d
            r0.f1666h = r1     // Catch: java.lang.Throwable -> L1d
            org.luckypray.dexkit.DexKitBridge r1 = r10.dexKit     // Catch: java.lang.Throwable -> L1d
            hh.p r0 = r1.findMethod(r0)     // Catch: java.lang.Throwable -> L1d
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L1d
        Ld3:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L1d
            if (r1 == 0) goto Lf1
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L1d
            hh.o r1 = (hh.o) r1     // Catch: java.lang.Throwable -> L1d
            java.lang.ClassLoader r6 = r10.classLoader     // Catch: java.lang.Throwable -> Ld3
            java.lang.reflect.Method r1 = r1.r(r6)     // Catch: java.lang.Throwable -> Ld3
            boolean r6 = r10.isPreferredImageCdnSubmitMethod(r1)     // Catch: java.lang.Throwable -> Ld3
            if (r6 != 0) goto Lec
            goto Ld3
        Lec:
            h.Hchat.utils.KavaReflector.accessible(r1)     // Catch: java.lang.Throwable -> Ld3
            r10.imageCdnSubmitMethod = r1     // Catch: java.lang.Throwable -> Ld3
        Lf1:
            java.lang.Class<?> r0 = r10.imageCdnTaskClass     // Catch: java.lang.Throwable -> L1d
            if (r0 == 0) goto L131
            java.lang.reflect.Method r0 = r10.imageCdnSubmitMethod     // Catch: java.lang.Throwable -> L1d
            if (r0 != 0) goto L131
            ch.e r0 = new ch.e     // Catch: java.lang.Throwable -> L1d
            r0.<init>()     // Catch: java.lang.Throwable -> L1d
            fh.k r1 = new fh.k     // Catch: java.lang.Throwable -> L1d
            r1.<init>()     // Catch: java.lang.Throwable -> L1d
            r6 = 1
            r1.m0(r6)     // Catch: java.lang.Throwable -> L1d
            r0.f1666h = r1     // Catch: java.lang.Throwable -> L1d
            org.luckypray.dexkit.DexKitBridge r1 = r10.dexKit     // Catch: java.lang.Throwable -> L1d
            hh.p r0 = r1.findMethod(r0)     // Catch: java.lang.Throwable -> L1d
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L1d
        L113:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L1d
            if (r1 == 0) goto L131
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L1d
            hh.o r1 = (hh.o) r1     // Catch: java.lang.Throwable -> L1d
            java.lang.ClassLoader r6 = r10.classLoader     // Catch: java.lang.Throwable -> L113
            java.lang.reflect.Method r1 = r1.r(r6)     // Catch: java.lang.Throwable -> L113
            boolean r6 = r10.isImageCdnSubmitMethod(r1)     // Catch: java.lang.Throwable -> L113
            if (r6 != 0) goto L12c
            goto L113
        L12c:
            h.Hchat.utils.KavaReflector.accessible(r1)     // Catch: java.lang.Throwable -> L113
            r10.imageCdnSubmitMethod = r1     // Catch: java.lang.Throwable -> L113
        L131:
            java.lang.reflect.Method r0 = r10.imageCdnSubmitMethod     // Catch: java.lang.Throwable -> L1d
            if (r0 != 0) goto L16d
            org.luckypray.dexkit.DexKitBridge r0 = r10.dexKit     // Catch: java.lang.Throwable -> L1d
            java.lang.String[] r1 = new java.lang.String[]{r3, r2, r4}     // Catch: java.lang.Throwable -> L1d
            ch.e r1 = r10.mkMethodUsingStrings(r1)     // Catch: java.lang.Throwable -> L1d
            hh.p r0 = r0.findMethod(r1)     // Catch: java.lang.Throwable -> L1d
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L1d
        L147:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L1d
            if (r1 == 0) goto L16d
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L1d
            hh.o r1 = (hh.o) r1     // Catch: java.lang.Throwable -> L1d
            java.lang.ClassLoader r2 = r10.classLoader     // Catch: java.lang.Throwable -> L147
            java.lang.reflect.Method r1 = r1.r(r2)     // Catch: java.lang.Throwable -> L147
            boolean r2 = r10.isImageCdnSubmitMethod(r1)     // Catch: java.lang.Throwable -> L147
            if (r2 != 0) goto L160
            goto L147
        L160:
            h.Hchat.utils.KavaReflector.accessible(r1)     // Catch: java.lang.Throwable -> L147
            r10.imageCdnSubmitMethod = r1     // Catch: java.lang.Throwable -> L147
            java.lang.Class[] r1 = r1.getParameterTypes()     // Catch: java.lang.Throwable -> L147
            r1 = r1[r5]     // Catch: java.lang.Throwable -> L147
            r10.imageCdnTaskClass = r1     // Catch: java.lang.Throwable -> L147
        L16d:
            java.lang.reflect.Method r0 = r10.imageCdnSubmitMethod     // Catch: java.lang.Throwable -> L1d
            if (r0 == 0) goto L1b3
            java.lang.Class r0 = r0.getDeclaringClass()     // Catch: java.lang.Throwable -> L1d
            ch.e r1 = new ch.e     // Catch: java.lang.Throwable -> L1d
            r1.<init>()     // Catch: java.lang.Throwable -> L1d
            fh.k r2 = new fh.k     // Catch: java.lang.Throwable -> L1d
            r2.<init>()     // Catch: java.lang.Throwable -> L1d
            r2.m0(r5)     // Catch: java.lang.Throwable -> L1d
            r1.f1666h = r2     // Catch: java.lang.Throwable -> L1d
            org.luckypray.dexkit.DexKitBridge r2 = r10.dexKit     // Catch: java.lang.Throwable -> L1d
            hh.p r1 = r2.findMethod(r1)     // Catch: java.lang.Throwable -> L1d
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L1d
        L18e:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L1d
            if (r2 == 0) goto L1b3
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L1d
            hh.o r2 = (hh.o) r2     // Catch: java.lang.Throwable -> L1d
            java.lang.ClassLoader r3 = r10.classLoader     // Catch: java.lang.Throwable -> L18e
            java.lang.reflect.Method r2 = r2.r(r3)     // Catch: java.lang.Throwable -> L18e
            boolean r3 = h.Hchat.utils.KavaReflector.isStatic(r2)     // Catch: java.lang.Throwable -> L18e
            if (r3 != 0) goto L1a7
            goto L18e
        L1a7:
            java.lang.Class r3 = r2.getReturnType()     // Catch: java.lang.Throwable -> L18e
            if (r3 == r0) goto L1ae
            goto L18e
        L1ae:
            h.Hchat.utils.KavaReflector.accessible(r2)     // Catch: java.lang.Throwable -> L18e
            r10.imageCdnServiceGetterMethod = r2     // Catch: java.lang.Throwable -> L18e
        L1b3:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1d
            r0.<init>()     // Catch: java.lang.Throwable -> L1d
            java.lang.String r1 = "图片CDN下载API: task="
            r0.append(r1)     // Catch: java.lang.Throwable -> L1d
            java.lang.Class<?> r1 = r10.imageCdnTaskClass     // Catch: java.lang.Throwable -> L1d
            java.lang.String r1 = r10.className(r1)     // Catch: java.lang.Throwable -> L1d
            r0.append(r1)     // Catch: java.lang.Throwable -> L1d
            java.lang.String r1 = " submit="
            r0.append(r1)     // Catch: java.lang.Throwable -> L1d
            java.lang.reflect.Method r1 = r10.imageCdnSubmitMethod     // Catch: java.lang.Throwable -> L1d
            java.lang.String r1 = r10.methodName(r1)     // Catch: java.lang.Throwable -> L1d
            r0.append(r1)     // Catch: java.lang.Throwable -> L1d
            java.lang.String r1 = " getter="
            r0.append(r1)     // Catch: java.lang.Throwable -> L1d
            java.lang.reflect.Method r1 = r10.imageCdnServiceGetterMethod     // Catch: java.lang.Throwable -> L1d
            java.lang.String r1 = r10.methodName(r1)     // Catch: java.lang.Throwable -> L1d
            r0.append(r1)     // Catch: java.lang.Throwable -> L1d
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L1d
            r10.logDetail(r0)     // Catch: java.lang.Throwable -> L1d
            goto L1f4
        L1ea:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "[Hchat:DexFinder] resolveImageCdnDownloadApi 失败: "
            r1.<init>(r2)
            bc.e.s(r0, r1, r0)
        L1f4:
            return
    }

    public void resolveInviteChatroomMemberApi() {
            r6 = this;
            java.lang.String r0 = "MicroMsg.NetSceneInviteChatRoomMember"
            java.lang.String r1 = "/cgi-bin/micromsg-bin/invitechatroommember"
            java.lang.reflect.Constructor<?> r2 = r6.inviteChatroomMemberCtor     // Catch: java.lang.Throwable -> L11
            if (r2 != 0) goto L13
            java.lang.Class<?> r2 = r6.inviteChatroomMemberClass     // Catch: java.lang.Throwable -> L11
            java.lang.reflect.Constructor r2 = r6.findInviteChatroomMemberCtor(r2)     // Catch: java.lang.Throwable -> L11
            r6.inviteChatroomMemberCtor = r2     // Catch: java.lang.Throwable -> L11
            goto L13
        L11:
            r0 = move-exception
            goto L7e
        L13:
            java.lang.reflect.Constructor<?> r2 = r6.inviteChatroomMemberCtor     // Catch: java.lang.Throwable -> L11
            if (r2 == 0) goto L18
            return
        L18:
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L11
            r2.<init>()     // Catch: java.lang.Throwable -> L11
            java.lang.String[] r3 = new java.lang.String[]{r1}     // Catch: java.lang.Throwable -> L11
            java.lang.String[] r4 = new java.lang.String[]{r0}     // Catch: java.lang.Throwable -> L11
            java.lang.String r5 = "invitechatroommember"
            java.lang.String[] r5 = new java.lang.String[]{r5}     // Catch: java.lang.Throwable -> L11
            java.lang.String[][] r3 = new java.lang.String[][]{r3, r4, r5}     // Catch: java.lang.Throwable -> L11
            r4 = 20
            r6.collectSendTextClassCandidates(r2, r4, r3)     // Catch: java.lang.Throwable -> L11
            java.lang.String[] r1 = new java.lang.String[]{r1}     // Catch: java.lang.Throwable -> L11
            java.lang.String[] r0 = new java.lang.String[]{r0}     // Catch: java.lang.Throwable -> L11
            java.lang.String[][] r0 = new java.lang.String[][]{r1, r0}     // Catch: java.lang.Throwable -> L11
            r6.collectSendTextMethodOwnerCandidates(r2, r4, r0)     // Catch: java.lang.Throwable -> L11
            java.util.Iterator r0 = r2.iterator()     // Catch: java.lang.Throwable -> L11
        L47:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L11
            if (r1 == 0) goto L5e
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L11
            java.lang.Class r1 = (java.lang.Class) r1     // Catch: java.lang.Throwable -> L11
            java.lang.reflect.Constructor r2 = r6.findInviteChatroomMemberCtor(r1)     // Catch: java.lang.Throwable -> L11
            if (r2 != 0) goto L5a
            goto L47
        L5a:
            r6.inviteChatroomMemberClass = r1     // Catch: java.lang.Throwable -> L11
            r6.inviteChatroomMemberCtor = r2     // Catch: java.lang.Throwable -> L11
        L5e:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L11
            r0.<init>()     // Catch: java.lang.Throwable -> L11
            java.lang.String r1 = "邀请群成员API: "
            r0.append(r1)     // Catch: java.lang.Throwable -> L11
            java.lang.Class<?> r1 = r6.inviteChatroomMemberClass     // Catch: java.lang.Throwable -> L11
            if (r1 == 0) goto L71
            java.lang.String r1 = r1.getName()     // Catch: java.lang.Throwable -> L11
            goto L73
        L71:
            java.lang.String r1 = "null"
        L73:
            r0.append(r1)     // Catch: java.lang.Throwable -> L11
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L11
            r6.logDetail(r0)     // Catch: java.lang.Throwable -> L11
            return
        L7e:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "[Hchat:DexFinder] resolveInviteChatroomMemberApi 失败: "
            r1.<init>(r2)
            bc.e.s(r0, r1, r0)
            return
    }

    public void resolveLocalMessageApi() {
            r4 = this;
            java.lang.String r0 = "[Hchat:DexFinder] 本地消息API未找到: candidates="
            java.lang.String r1 = "本地消息API: insert="
            boolean r2 = r4.hasLocalMessageApi()     // Catch: java.lang.Throwable -> L10
            if (r2 == 0) goto L13
            java.lang.reflect.Method r2 = r4.localMessageCreateTimeMethod     // Catch: java.lang.Throwable -> L10
            if (r2 == 0) goto L13
            goto L91
        L10:
            r0 = move-exception
            goto L92
        L13:
            int r2 = r4.resolveLocalMessageApiBySignature()     // Catch: java.lang.Throwable -> L10
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L10
            r3.<init>(r1)     // Catch: java.lang.Throwable -> L10
            java.lang.reflect.Method r1 = r4.localMessageInsertMethod     // Catch: java.lang.Throwable -> L10
            java.lang.String r1 = r4.methodName(r1)     // Catch: java.lang.Throwable -> L10
            r3.append(r1)     // Catch: java.lang.Throwable -> L10
            java.lang.String r1 = " system="
            r3.append(r1)     // Catch: java.lang.Throwable -> L10
            java.lang.reflect.Method r1 = r4.localSystemMessageMethod     // Catch: java.lang.Throwable -> L10
            java.lang.String r1 = r4.methodName(r1)     // Catch: java.lang.Throwable -> L10
            r3.append(r1)     // Catch: java.lang.Throwable -> L10
            java.lang.String r1 = " createTime="
            r3.append(r1)     // Catch: java.lang.Throwable -> L10
            java.lang.reflect.Method r1 = r4.localMessageCreateTimeMethod     // Catch: java.lang.Throwable -> L10
            java.lang.String r1 = r4.methodName(r1)     // Catch: java.lang.Throwable -> L10
            r3.append(r1)     // Catch: java.lang.Throwable -> L10
            java.lang.String r1 = " msg="
            r3.append(r1)     // Catch: java.lang.Throwable -> L10
            java.lang.Class<?> r1 = r4.localMessageClass     // Catch: java.lang.Throwable -> L10
            if (r1 == 0) goto L4f
            java.lang.String r1 = r1.getName()     // Catch: java.lang.Throwable -> L10
            goto L51
        L4f:
            java.lang.String r1 = "null"
        L51:
            r3.append(r1)     // Catch: java.lang.Throwable -> L10
            java.lang.String r1 = " ctor="
            r3.append(r1)     // Catch: java.lang.Throwable -> L10
            java.lang.reflect.Constructor<?> r1 = r4.localMessageCtor     // Catch: java.lang.Throwable -> L10
            if (r1 == 0) goto L63
            java.lang.Class[] r1 = r1.getParameterTypes()     // Catch: java.lang.Throwable -> L10
            int r1 = r1.length     // Catch: java.lang.Throwable -> L10
            goto L64
        L63:
            r1 = -1
        L64:
            r3.append(r1)     // Catch: java.lang.Throwable -> L10
            java.lang.String r1 = r3.toString()     // Catch: java.lang.Throwable -> L10
            r4.logDetail(r1)     // Catch: java.lang.Throwable -> L10
            boolean r1 = r4.hasLocalMessageApi()     // Catch: java.lang.Throwable -> L10
            if (r1 != 0) goto L91
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L10
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L10
            r1.append(r2)     // Catch: java.lang.Throwable -> L10
            java.lang.String r0 = " key="
            r1.append(r0)     // Catch: java.lang.Throwable -> L10
            java.lang.String r0 = r4.runtimeCacheKey     // Catch: java.lang.Throwable -> L10
            java.lang.String r0 = r4.shortKey(r0)     // Catch: java.lang.Throwable -> L10
            r1.append(r0)     // Catch: java.lang.Throwable -> L10
            java.lang.String r0 = r1.toString()     // Catch: java.lang.Throwable -> L10
            fb.v0.m(r0)     // Catch: java.lang.Throwable -> L10
        L91:
            return
        L92:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "[Hchat:DexFinder] resolveLocalMessageApi 失败: "
            r1.<init>(r2)
            bc.e.s(r0, r1, r0)
            return
    }

    public void resolveMessageClearApi() {
            r10 = this;
            java.lang.reflect.Method r0 = r10.messageClearByTalkerMethod     // Catch: java.lang.Throwable -> L61
            java.lang.reflect.Method r1 = r10.messageClearBatchMethod     // Catch: java.lang.Throwable -> L61
            boolean r0 = r10.isMessageClearByTalkerMethod(r0, r1)     // Catch: java.lang.Throwable -> L61
            if (r0 == 0) goto Lc
            goto L13c
        Lc:
            r0 = 0
            r10.messageClearByTalkerMethod = r0     // Catch: java.lang.Throwable -> L61
            r10.messageClearBatchMethod = r0     // Catch: java.lang.Throwable -> L61
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L61
            r1.<init>()     // Catch: java.lang.Throwable -> L61
            ch.e r2 = new ch.e     // Catch: java.lang.Throwable -> L61
            r2.<init>()     // Catch: java.lang.Throwable -> L61
            fh.k r3 = new fh.k     // Catch: java.lang.Throwable -> L61
            r3.<init>()     // Catch: java.lang.Throwable -> L61
            java.lang.String r4 = "MicroMsg.MsgInfoStorageLogic"
            java.lang.String r5 = "summerdel deleteMsgByTalker[%s] stack[%s]"
            java.lang.String r6 = "summerdel deleteMsgByTalker is null or empty"
            java.lang.String r7 = "AsyncDeleteMessageStage1"
            java.lang.String[] r4 = new java.lang.String[]{r4, r5, r6, r7}     // Catch: java.lang.Throwable -> L61
            r3.r0(r4)     // Catch: java.lang.Throwable -> L61
            r2.f1666h = r3     // Catch: java.lang.Throwable -> L61
            org.luckypray.dexkit.DexKitBridge r3 = r10.dexKit     // Catch: java.lang.Throwable -> L61
            hh.p r2 = r3.findMethod(r2)     // Catch: java.lang.Throwable -> L61
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> L61
        L3b:
            boolean r3 = r2.hasNext()     // Catch: java.lang.Throwable -> L61
            if (r3 == 0) goto L64
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Throwable -> L61
            hh.o r3 = (hh.o) r3     // Catch: java.lang.Throwable -> L61
            java.lang.ClassLoader r4 = r10.classLoader     // Catch: java.lang.Throwable -> L3b
            java.lang.reflect.Method r3 = r3.r(r4)     // Catch: java.lang.Throwable -> L3b
            boolean r4 = r10.isMessageClearBatchMethod(r3)     // Catch: java.lang.Throwable -> L3b
            if (r4 == 0) goto L3b
            boolean r4 = r1.contains(r3)     // Catch: java.lang.Throwable -> L3b
            if (r4 == 0) goto L5a
            goto L3b
        L5a:
            h.Hchat.utils.KavaReflector.accessible(r3)     // Catch: java.lang.Throwable -> L3b
            r1.add(r3)     // Catch: java.lang.Throwable -> L3b
            goto L3b
        L61:
            r0 = move-exception
            goto L132
        L64:
            int r2 = r1.size()     // Catch: java.lang.Throwable -> L61
            r3 = 0
            r4 = 1
            if (r2 != r4) goto L72
            java.lang.Object r0 = r1.get(r3)     // Catch: java.lang.Throwable -> L61
            java.lang.reflect.Method r0 = (java.lang.reflect.Method) r0     // Catch: java.lang.Throwable -> L61
        L72:
            java.lang.String r2 = " key="
            if (r0 == 0) goto L10d
            java.lang.Class[] r5 = r0.getParameterTypes()     // Catch: java.lang.Throwable -> L61
            r5 = r5[r4]     // Catch: java.lang.Throwable -> L61
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L61
            r6.<init>()     // Catch: java.lang.Throwable -> L61
            java.lang.Class r7 = r0.getDeclaringClass()     // Catch: java.lang.Throwable -> L61
            java.util.List r7 = h.Hchat.utils.KavaReflector.declaredMethods(r7)     // Catch: java.lang.Throwable -> L61
            java.util.Iterator r7 = r7.iterator()     // Catch: java.lang.Throwable -> L61
        L8d:
            boolean r8 = r7.hasNext()     // Catch: java.lang.Throwable -> L61
            if (r8 == 0) goto Lb0
            java.lang.Object r8 = r7.next()     // Catch: java.lang.Throwable -> L61
            java.lang.reflect.Method r8 = (java.lang.reflect.Method) r8     // Catch: java.lang.Throwable -> L61
            boolean r9 = r10.isMessageClearByTalkerMethod(r8, r0)     // Catch: java.lang.Throwable -> L61
            if (r9 != 0) goto La0
            goto L8d
        La0:
            java.lang.Class[] r9 = r8.getParameterTypes()     // Catch: java.lang.Throwable -> L61
            r9 = r9[r4]     // Catch: java.lang.Throwable -> L61
            if (r9 == r5) goto La9
            goto L8d
        La9:
            h.Hchat.utils.KavaReflector.accessible(r8)     // Catch: java.lang.Throwable -> L61
            r6.add(r8)     // Catch: java.lang.Throwable -> L61
            goto L8d
        Lb0:
            int r5 = r6.size()     // Catch: java.lang.Throwable -> L61
            if (r5 != r4) goto Le9
            r10.messageClearBatchMethod = r0     // Catch: java.lang.Throwable -> L61
            java.lang.Object r0 = r6.get(r3)     // Catch: java.lang.Throwable -> L61
            java.lang.reflect.Method r0 = (java.lang.reflect.Method) r0     // Catch: java.lang.Throwable -> L61
            r10.messageClearByTalkerMethod = r0     // Catch: java.lang.Throwable -> L61
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L61
            r0.<init>()     // Catch: java.lang.Throwable -> L61
            java.lang.String r1 = "原生消息清理API: single="
            r0.append(r1)     // Catch: java.lang.Throwable -> L61
            java.lang.reflect.Method r1 = r10.messageClearByTalkerMethod     // Catch: java.lang.Throwable -> L61
            java.lang.String r1 = r10.methodName(r1)     // Catch: java.lang.Throwable -> L61
            r0.append(r1)     // Catch: java.lang.Throwable -> L61
            java.lang.String r1 = " batch="
            r0.append(r1)     // Catch: java.lang.Throwable -> L61
            java.lang.reflect.Method r1 = r10.messageClearBatchMethod     // Catch: java.lang.Throwable -> L61
            java.lang.String r1 = r10.methodName(r1)     // Catch: java.lang.Throwable -> L61
            r0.append(r1)     // Catch: java.lang.Throwable -> L61
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L61
            r10.logDetail(r0)     // Catch: java.lang.Throwable -> L61
            goto L13c
        Le9:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L61
            r0.<init>()     // Catch: java.lang.Throwable -> L61
            java.lang.String r3 = "[Hchat:DexFinder] 原生单会话消息清理API定位失败: candidates="
            r0.append(r3)     // Catch: java.lang.Throwable -> L61
            int r3 = r6.size()     // Catch: java.lang.Throwable -> L61
            r0.append(r3)     // Catch: java.lang.Throwable -> L61
            r0.append(r2)     // Catch: java.lang.Throwable -> L61
            java.lang.String r3 = r10.runtimeCacheKey     // Catch: java.lang.Throwable -> L61
            java.lang.String r3 = r10.shortKey(r3)     // Catch: java.lang.Throwable -> L61
            r0.append(r3)     // Catch: java.lang.Throwable -> L61
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L61
            fb.v0.m(r0)     // Catch: java.lang.Throwable -> L61
        L10d:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L61
            r0.<init>()     // Catch: java.lang.Throwable -> L61
            java.lang.String r3 = "[Hchat:DexFinder] 原生批量消息清理API定位失败: candidates="
            r0.append(r3)     // Catch: java.lang.Throwable -> L61
            int r1 = r1.size()     // Catch: java.lang.Throwable -> L61
            r0.append(r1)     // Catch: java.lang.Throwable -> L61
            r0.append(r2)     // Catch: java.lang.Throwable -> L61
            java.lang.String r1 = r10.runtimeCacheKey     // Catch: java.lang.Throwable -> L61
            java.lang.String r1 = r10.shortKey(r1)     // Catch: java.lang.Throwable -> L61
            r0.append(r1)     // Catch: java.lang.Throwable -> L61
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L61
            fb.v0.m(r0)     // Catch: java.lang.Throwable -> L61
            goto L13c
        L132:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "[Hchat:DexFinder] resolveMessageClearApi 失败: "
            r1.<init>(r2)
            bc.e.s(r0, r1, r0)
        L13c:
            return
    }

    public void resolvePatMessageApi() {
            r3 = this;
            java.lang.reflect.Method r0 = r3.patDisplayTemplateMethod     // Catch: java.lang.Throwable -> L3d
            boolean r0 = r3.isPatDisplayTemplateMethod(r0)     // Catch: java.lang.Throwable -> L3d
            if (r0 != 0) goto L3f
            org.luckypray.dexkit.DexKitBridge r0 = r3.dexKit     // Catch: java.lang.Throwable -> L3d
            java.lang.String r1 = "MicroMsg.PluginPatMsg"
            java.lang.String r2 = "parseDisplayTemplate realtime templateStr:%s"
            java.lang.String[] r1 = new java.lang.String[]{r1, r2}     // Catch: java.lang.Throwable -> L3d
            ch.e r1 = r3.mkMethodUsingStrings(r1)     // Catch: java.lang.Throwable -> L3d
            hh.p r0 = r0.findMethod(r1)     // Catch: java.lang.Throwable -> L3d
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L3d
        L1e:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L3d
            if (r1 == 0) goto L3f
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L3d
            hh.o r1 = (hh.o) r1     // Catch: java.lang.Throwable -> L3d
            java.lang.ClassLoader r2 = r3.classLoader     // Catch: java.lang.Throwable -> L1e
            java.lang.reflect.Method r1 = r1.r(r2)     // Catch: java.lang.Throwable -> L1e
            boolean r2 = r3.isPatDisplayTemplateMethod(r1)     // Catch: java.lang.Throwable -> L1e
            if (r2 != 0) goto L37
            goto L1e
        L37:
            h.Hchat.utils.KavaReflector.accessible(r1)     // Catch: java.lang.Throwable -> L1e
            r3.patDisplayTemplateMethod = r1     // Catch: java.lang.Throwable -> L1e
            goto L3f
        L3d:
            r0 = move-exception
            goto L9d
        L3f:
            r3.resolvePatSendApi()     // Catch: java.lang.Throwable -> L3d
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L3d
            r0.<init>()     // Catch: java.lang.Throwable -> L3d
            java.lang.String r1 = "拍一拍API: template="
            r0.append(r1)     // Catch: java.lang.Throwable -> L3d
            java.lang.reflect.Method r1 = r3.patDisplayTemplateMethod     // Catch: java.lang.Throwable -> L3d
            java.lang.String r1 = r3.methodName(r1)     // Catch: java.lang.Throwable -> L3d
            r0.append(r1)     // Catch: java.lang.Throwable -> L3d
            java.lang.String r1 = " extension="
            r0.append(r1)     // Catch: java.lang.Throwable -> L3d
            java.lang.Class<?> r1 = r3.patExtensionClass     // Catch: java.lang.Throwable -> L3d
            java.lang.String r2 = "null"
            if (r1 == 0) goto L65
            java.lang.String r1 = r1.getName()     // Catch: java.lang.Throwable -> L3d
            goto L66
        L65:
            r1 = r2
        L66:
            r0.append(r1)     // Catch: java.lang.Throwable -> L3d
            java.lang.String r1 = " create="
            r0.append(r1)     // Catch: java.lang.Throwable -> L3d
            java.lang.reflect.Method r1 = r3.patCreatePairMethod     // Catch: java.lang.Throwable -> L3d
            java.lang.String r1 = r3.methodName(r1)     // Catch: java.lang.Throwable -> L3d
            r0.append(r1)     // Catch: java.lang.Throwable -> L3d
            java.lang.String r1 = " suffix="
            r0.append(r1)     // Catch: java.lang.Throwable -> L3d
            java.lang.reflect.Method r1 = r3.patSuffixMethod     // Catch: java.lang.Throwable -> L3d
            java.lang.String r1 = r3.methodName(r1)     // Catch: java.lang.Throwable -> L3d
            r0.append(r1)     // Catch: java.lang.Throwable -> L3d
            java.lang.String r1 = " scene="
            r0.append(r1)     // Catch: java.lang.Throwable -> L3d
            java.lang.Class<?> r1 = r3.sendPatSceneClass     // Catch: java.lang.Throwable -> L3d
            if (r1 == 0) goto L92
            java.lang.String r2 = r1.getName()     // Catch: java.lang.Throwable -> L3d
        L92:
            r0.append(r2)     // Catch: java.lang.Throwable -> L3d
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L3d
            r3.logDetail(r0)     // Catch: java.lang.Throwable -> L3d
            goto La7
        L9d:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "[Hchat:DexFinder] resolvePatMessageApi 失败: "
            r1.<init>(r2)
            bc.e.s(r0, r1, r0)
        La7:
            return
    }

    public void resolveRevokeMsgApi() {
            r6 = this;
            java.lang.String r0 = "NetSceneRevokeMsg"
            java.lang.String r1 = "MicroMsg.NetSceneRevokeMsg"
            java.lang.String r2 = "/cgi-bin/micromsg-bin/revokemsg"
            java.lang.reflect.Constructor<?> r3 = r6.revokeMsgCtor     // Catch: java.lang.Throwable -> L13
            if (r3 != 0) goto L15
            java.lang.Class<?> r3 = r6.revokeMsgClass     // Catch: java.lang.Throwable -> L13
            java.lang.reflect.Constructor r3 = r6.findRevokeMsgCtor(r3)     // Catch: java.lang.Throwable -> L13
            r6.revokeMsgCtor = r3     // Catch: java.lang.Throwable -> L13
            goto L15
        L13:
            r0 = move-exception
            goto L7a
        L15:
            java.lang.reflect.Constructor<?> r3 = r6.revokeMsgCtor     // Catch: java.lang.Throwable -> L13
            if (r3 == 0) goto L1a
            return
        L1a:
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L13
            r3.<init>()     // Catch: java.lang.Throwable -> L13
            java.lang.String[] r4 = new java.lang.String[]{r2, r1}     // Catch: java.lang.Throwable -> L13
            java.lang.String[] r5 = new java.lang.String[]{r0}     // Catch: java.lang.Throwable -> L13
            java.lang.String[][] r4 = new java.lang.String[][]{r4, r5}     // Catch: java.lang.Throwable -> L13
            r5 = 20
            r6.collectSendTextClassCandidates(r3, r5, r4)     // Catch: java.lang.Throwable -> L13
            java.lang.String[] r1 = new java.lang.String[]{r2, r1}     // Catch: java.lang.Throwable -> L13
            java.lang.String[] r0 = new java.lang.String[]{r0}     // Catch: java.lang.Throwable -> L13
            java.lang.String[][] r0 = new java.lang.String[][]{r1, r0}     // Catch: java.lang.Throwable -> L13
            r6.collectSendTextMethodOwnerCandidates(r3, r5, r0)     // Catch: java.lang.Throwable -> L13
            java.util.Iterator r0 = r3.iterator()     // Catch: java.lang.Throwable -> L13
        L43:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L13
            if (r1 == 0) goto L5a
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L13
            java.lang.Class r1 = (java.lang.Class) r1     // Catch: java.lang.Throwable -> L13
            java.lang.reflect.Constructor r2 = r6.findRevokeMsgCtor(r1)     // Catch: java.lang.Throwable -> L13
            if (r2 != 0) goto L56
            goto L43
        L56:
            r6.revokeMsgClass = r1     // Catch: java.lang.Throwable -> L13
            r6.revokeMsgCtor = r2     // Catch: java.lang.Throwable -> L13
        L5a:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L13
            r0.<init>()     // Catch: java.lang.Throwable -> L13
            java.lang.String r1 = "撤回消息API: "
            r0.append(r1)     // Catch: java.lang.Throwable -> L13
            java.lang.Class<?> r1 = r6.revokeMsgClass     // Catch: java.lang.Throwable -> L13
            if (r1 == 0) goto L6d
            java.lang.String r1 = r1.getName()     // Catch: java.lang.Throwable -> L13
            goto L6f
        L6d:
            java.lang.String r1 = "null"
        L6f:
            r0.append(r1)     // Catch: java.lang.Throwable -> L13
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L13
            r6.logDetail(r0)     // Catch: java.lang.Throwable -> L13
            return
        L7a:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "[Hchat:DexFinder] resolveRevokeMsgApi 失败: "
            r1.<init>(r2)
            bc.e.s(r0, r1, r0)
            return
    }

    public void resolveScriptSendHookApi() {
            r5 = this;
            java.lang.String r0 = "send msg onClick"
            java.lang.String r1 = "onClick"
            java.lang.reflect.Method r2 = r5.chatFooterSendClickMethod     // Catch: java.lang.Throwable -> L3f
            if (r2 == 0) goto La
            goto L9a
        La:
            org.luckypray.dexkit.DexKitBridge r2 = r5.dexKit     // Catch: java.lang.Throwable -> L3f
            java.lang.String r3 = "MicroMsg.ChatFooter"
            java.lang.String r4 = "paste clip board to send"
            java.lang.String[] r3 = new java.lang.String[]{r3, r0, r4}     // Catch: java.lang.Throwable -> L3f
            ch.e r3 = r5.mkMethodUsingStringsAndName(r1, r3)     // Catch: java.lang.Throwable -> L3f
            hh.p r2 = r2.findMethod(r3)     // Catch: java.lang.Throwable -> L3f
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> L3f
        L20:
            boolean r3 = r2.hasNext()     // Catch: java.lang.Throwable -> L3f
            if (r3 == 0) goto L41
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Throwable -> L3f
            hh.o r3 = (hh.o) r3     // Catch: java.lang.Throwable -> L3f
            java.lang.ClassLoader r4 = r5.classLoader     // Catch: java.lang.Throwable -> L20
            java.lang.reflect.Method r3 = r3.r(r4)     // Catch: java.lang.Throwable -> L20
            boolean r4 = r5.isChatFooterSendClickMethod(r3)     // Catch: java.lang.Throwable -> L20
            if (r4 != 0) goto L39
            goto L20
        L39:
            h.Hchat.utils.KavaReflector.accessible(r3)     // Catch: java.lang.Throwable -> L20
            r5.chatFooterSendClickMethod = r3     // Catch: java.lang.Throwable -> L20
            goto L41
        L3f:
            r0 = move-exception
            goto L90
        L41:
            java.lang.reflect.Method r2 = r5.chatFooterSendClickMethod     // Catch: java.lang.Throwable -> L3f
            if (r2 != 0) goto L75
            org.luckypray.dexkit.DexKitBridge r2 = r5.dexKit     // Catch: java.lang.Throwable -> L3f
            java.lang.String[] r0 = new java.lang.String[]{r0}     // Catch: java.lang.Throwable -> L3f
            ch.e r0 = r5.mkMethodUsingStringsAndName(r1, r0)     // Catch: java.lang.Throwable -> L3f
            hh.p r0 = r2.findMethod(r0)     // Catch: java.lang.Throwable -> L3f
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L3f
        L57:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L3f
            if (r1 == 0) goto L75
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L3f
            hh.o r1 = (hh.o) r1     // Catch: java.lang.Throwable -> L3f
            java.lang.ClassLoader r2 = r5.classLoader     // Catch: java.lang.Throwable -> L57
            java.lang.reflect.Method r1 = r1.r(r2)     // Catch: java.lang.Throwable -> L57
            boolean r2 = r5.isChatFooterSendClickMethod(r1)     // Catch: java.lang.Throwable -> L57
            if (r2 != 0) goto L70
            goto L57
        L70:
            h.Hchat.utils.KavaReflector.accessible(r1)     // Catch: java.lang.Throwable -> L57
            r5.chatFooterSendClickMethod = r1     // Catch: java.lang.Throwable -> L57
        L75:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L3f
            r0.<init>()     // Catch: java.lang.Throwable -> L3f
            java.lang.String r1 = "脚本发送按钮API: click="
            r0.append(r1)     // Catch: java.lang.Throwable -> L3f
            java.lang.reflect.Method r1 = r5.chatFooterSendClickMethod     // Catch: java.lang.Throwable -> L3f
            java.lang.String r1 = r5.methodName(r1)     // Catch: java.lang.Throwable -> L3f
            r0.append(r1)     // Catch: java.lang.Throwable -> L3f
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L3f
            r5.logDetail(r0)     // Catch: java.lang.Throwable -> L3f
            goto L9a
        L90:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "[Hchat:DexFinder] resolveScriptSendHookApi 失败: "
            r1.<init>(r2)
            bc.e.s(r0, r1, r0)
        L9a:
            return
    }

    public void resolveSendEmojiApi() {
            r3 = this;
            java.lang.reflect.Method r0 = r3.emojiSendMethod     // Catch: java.lang.Throwable -> L37
            if (r0 != 0) goto L3a
            org.luckypray.dexkit.DexKitBridge r0 = r3.dexKit     // Catch: java.lang.Throwable -> L37
            java.lang.String r1 = "NetSceneUploadEmoji: msgId"
            java.lang.String[] r1 = new java.lang.String[]{r1}     // Catch: java.lang.Throwable -> L37
            ch.e r1 = r3.mkMethodUsingStrings(r1)     // Catch: java.lang.Throwable -> L37
            hh.p r0 = r0.findMethod(r1)     // Catch: java.lang.Throwable -> L37
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L37
        L18:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L37
            if (r1 == 0) goto L3a
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L37
            hh.o r1 = (hh.o) r1     // Catch: java.lang.Throwable -> L37
            java.lang.ClassLoader r2 = r3.classLoader     // Catch: java.lang.Throwable -> L18
            java.lang.reflect.Method r1 = r1.r(r2)     // Catch: java.lang.Throwable -> L18
            boolean r2 = r3.isEmojiSendMethod(r1)     // Catch: java.lang.Throwable -> L18
            if (r2 != 0) goto L31
            goto L18
        L31:
            h.Hchat.utils.KavaReflector.accessible(r1)     // Catch: java.lang.Throwable -> L18
            r3.emojiSendMethod = r1     // Catch: java.lang.Throwable -> L18
            goto L3a
        L37:
            r0 = move-exception
            goto L265
        L3a:
            java.lang.reflect.Method r0 = r3.emojiManagerSendMethod     // Catch: java.lang.Throwable -> L37
            if (r0 != 0) goto L72
            org.luckypray.dexkit.DexKitBridge r0 = r3.dexKit     // Catch: java.lang.Throwable -> L37
            java.lang.String r1 = "sendEmoji: context is null"
            java.lang.String r2 = "sendEmoji: emoji not found"
            java.lang.String[] r1 = new java.lang.String[]{r1, r2}     // Catch: java.lang.Throwable -> L37
            ch.e r1 = r3.mkMethodUsingStrings(r1)     // Catch: java.lang.Throwable -> L37
            hh.p r0 = r0.findMethod(r1)     // Catch: java.lang.Throwable -> L37
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L37
        L54:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L37
            if (r1 == 0) goto L72
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L37
            hh.o r1 = (hh.o) r1     // Catch: java.lang.Throwable -> L37
            java.lang.ClassLoader r2 = r3.classLoader     // Catch: java.lang.Throwable -> L54
            java.lang.reflect.Method r1 = r1.r(r2)     // Catch: java.lang.Throwable -> L54
            boolean r2 = r3.isEmojiManagerSendMethod(r1)     // Catch: java.lang.Throwable -> L54
            if (r2 != 0) goto L6d
            goto L54
        L6d:
            h.Hchat.utils.KavaReflector.accessible(r1)     // Catch: java.lang.Throwable -> L54
            r3.emojiManagerSendMethod = r1     // Catch: java.lang.Throwable -> L54
        L72:
            java.lang.reflect.Method r0 = r3.emojiGetByMd5Method     // Catch: java.lang.Throwable -> L37
            if (r0 != 0) goto La8
            org.luckypray.dexkit.DexKitBridge r0 = r3.dexKit     // Catch: java.lang.Throwable -> L37
            java.lang.String r1 = "getEmojiByMd5"
            java.lang.String[] r1 = new java.lang.String[]{r1}     // Catch: java.lang.Throwable -> L37
            ch.e r1 = r3.mkMethodUsingStrings(r1)     // Catch: java.lang.Throwable -> L37
            hh.p r0 = r0.findMethod(r1)     // Catch: java.lang.Throwable -> L37
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L37
        L8a:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L37
            if (r1 == 0) goto La8
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L37
            hh.o r1 = (hh.o) r1     // Catch: java.lang.Throwable -> L37
            java.lang.ClassLoader r2 = r3.classLoader     // Catch: java.lang.Throwable -> L8a
            java.lang.reflect.Method r1 = r1.r(r2)     // Catch: java.lang.Throwable -> L8a
            boolean r2 = r3.isEmojiGetByMd5Method(r1)     // Catch: java.lang.Throwable -> L8a
            if (r2 != 0) goto La3
            goto L8a
        La3:
            h.Hchat.utils.KavaReflector.accessible(r1)     // Catch: java.lang.Throwable -> L8a
            r3.emojiGetByMd5Method = r1     // Catch: java.lang.Throwable -> L8a
        La8:
            java.lang.reflect.Method r0 = r3.emojiCreateInfoMethod     // Catch: java.lang.Throwable -> L37
            if (r0 != 0) goto Lde
            org.luckypray.dexkit.DexKitBridge r0 = r3.dexKit     // Catch: java.lang.Throwable -> L37
            java.lang.String r1 = "createEmojiInfo"
            java.lang.String[] r1 = new java.lang.String[]{r1}     // Catch: java.lang.Throwable -> L37
            ch.e r1 = r3.mkMethodUsingStrings(r1)     // Catch: java.lang.Throwable -> L37
            hh.p r0 = r0.findMethod(r1)     // Catch: java.lang.Throwable -> L37
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L37
        Lc0:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L37
            if (r1 == 0) goto Lde
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L37
            hh.o r1 = (hh.o) r1     // Catch: java.lang.Throwable -> L37
            java.lang.ClassLoader r2 = r3.classLoader     // Catch: java.lang.Throwable -> Lc0
            java.lang.reflect.Method r1 = r1.r(r2)     // Catch: java.lang.Throwable -> Lc0
            boolean r2 = r3.isEmojiCreateInfoMethod(r1)     // Catch: java.lang.Throwable -> Lc0
            if (r2 != 0) goto Ld9
            goto Lc0
        Ld9:
            h.Hchat.utils.KavaReflector.accessible(r1)     // Catch: java.lang.Throwable -> Lc0
            r3.emojiCreateInfoMethod = r1     // Catch: java.lang.Throwable -> Lc0
        Lde:
            java.lang.reflect.Method r0 = r3.emojiUpdateInfoMethod     // Catch: java.lang.Throwable -> L37
            if (r0 != 0) goto L114
            org.luckypray.dexkit.DexKitBridge r0 = r3.dexKit     // Catch: java.lang.Throwable -> L37
            java.lang.String r1 = "updateEmojiInfo"
            java.lang.String[] r1 = new java.lang.String[]{r1}     // Catch: java.lang.Throwable -> L37
            ch.e r1 = r3.mkMethodUsingStrings(r1)     // Catch: java.lang.Throwable -> L37
            hh.p r0 = r0.findMethod(r1)     // Catch: java.lang.Throwable -> L37
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L37
        Lf6:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L37
            if (r1 == 0) goto L114
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L37
            hh.o r1 = (hh.o) r1     // Catch: java.lang.Throwable -> L37
            java.lang.ClassLoader r2 = r3.classLoader     // Catch: java.lang.Throwable -> Lf6
            java.lang.reflect.Method r1 = r1.r(r2)     // Catch: java.lang.Throwable -> Lf6
            boolean r2 = r3.isEmojiUpdateInfoMethod(r1)     // Catch: java.lang.Throwable -> Lf6
            if (r2 != 0) goto L10f
            goto Lf6
        L10f:
            h.Hchat.utils.KavaReflector.accessible(r1)     // Catch: java.lang.Throwable -> Lf6
            r3.emojiUpdateInfoMethod = r1     // Catch: java.lang.Throwable -> Lf6
        L114:
            java.lang.reflect.Method r0 = r3.emojiAccPathMethod     // Catch: java.lang.Throwable -> L37
            if (r0 != 0) goto L14a
            org.luckypray.dexkit.DexKitBridge r0 = r3.dexKit     // Catch: java.lang.Throwable -> L37
            java.lang.String r1 = "getAccPath"
            java.lang.String[] r1 = new java.lang.String[]{r1}     // Catch: java.lang.Throwable -> L37
            ch.e r1 = r3.mkMethodUsingStrings(r1)     // Catch: java.lang.Throwable -> L37
            hh.p r0 = r0.findMethod(r1)     // Catch: java.lang.Throwable -> L37
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L37
        L12c:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L37
            if (r1 == 0) goto L14a
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L37
            hh.o r1 = (hh.o) r1     // Catch: java.lang.Throwable -> L37
            java.lang.ClassLoader r2 = r3.classLoader     // Catch: java.lang.Throwable -> L12c
            java.lang.reflect.Method r1 = r1.r(r2)     // Catch: java.lang.Throwable -> L12c
            boolean r2 = r3.isNoArgStringMethod(r1)     // Catch: java.lang.Throwable -> L12c
            if (r2 != 0) goto L145
            goto L12c
        L145:
            h.Hchat.utils.KavaReflector.accessible(r1)     // Catch: java.lang.Throwable -> L12c
            r3.emojiAccPathMethod = r1     // Catch: java.lang.Throwable -> L12c
        L14a:
            java.lang.reflect.Method r0 = r3.emojiCheckGifMethod     // Catch: java.lang.Throwable -> L37
            if (r0 != 0) goto L180
            org.luckypray.dexkit.DexKitBridge r0 = r3.dexKit     // Catch: java.lang.Throwable -> L37
            java.lang.String r1 = "checkGifFile"
            java.lang.String[] r1 = new java.lang.String[]{r1}     // Catch: java.lang.Throwable -> L37
            ch.e r1 = r3.mkMethodUsingStrings(r1)     // Catch: java.lang.Throwable -> L37
            hh.p r0 = r0.findMethod(r1)     // Catch: java.lang.Throwable -> L37
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L37
        L162:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L37
            if (r1 == 0) goto L180
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L37
            hh.o r1 = (hh.o) r1     // Catch: java.lang.Throwable -> L37
            java.lang.ClassLoader r2 = r3.classLoader     // Catch: java.lang.Throwable -> L162
            java.lang.reflect.Method r1 = r1.r(r2)     // Catch: java.lang.Throwable -> L162
            boolean r2 = r3.isStringBooleanMethod(r1)     // Catch: java.lang.Throwable -> L162
            if (r2 != 0) goto L17b
            goto L162
        L17b:
            h.Hchat.utils.KavaReflector.accessible(r1)     // Catch: java.lang.Throwable -> L162
            r3.emojiCheckGifMethod = r1     // Catch: java.lang.Throwable -> L162
        L180:
            java.lang.reflect.Method r0 = r3.emojiFilePathMethod     // Catch: java.lang.Throwable -> L37
            if (r0 != 0) goto L1b6
            org.luckypray.dexkit.DexKitBridge r0 = r3.dexKit     // Catch: java.lang.Throwable -> L37
            java.lang.String r1 = "[cpan] get icon path failed. productid and md5 are null."
            java.lang.String[] r1 = new java.lang.String[]{r1}     // Catch: java.lang.Throwable -> L37
            ch.e r1 = r3.mkMethodUsingStrings(r1)     // Catch: java.lang.Throwable -> L37
            hh.p r0 = r0.findMethod(r1)     // Catch: java.lang.Throwable -> L37
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L37
        L198:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L37
            if (r1 == 0) goto L1b6
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L37
            hh.o r1 = (hh.o) r1     // Catch: java.lang.Throwable -> L37
            java.lang.ClassLoader r2 = r3.classLoader     // Catch: java.lang.Throwable -> L198
            java.lang.reflect.Method r1 = r1.r(r2)     // Catch: java.lang.Throwable -> L198
            boolean r2 = r3.isEmojiFilePathMethod(r1)     // Catch: java.lang.Throwable -> L198
            if (r2 != 0) goto L1b1
            goto L198
        L1b1:
            h.Hchat.utils.KavaReflector.accessible(r1)     // Catch: java.lang.Throwable -> L198
            r3.emojiFilePathMethod = r1     // Catch: java.lang.Throwable -> L198
        L1b6:
            java.lang.reflect.Method r0 = r3.emojiDecodeDataMethod     // Catch: java.lang.Throwable -> L37
            if (r0 == 0) goto L1be
            java.lang.reflect.Method r0 = r3.emojiDecodeManagerGetterMethod     // Catch: java.lang.Throwable -> L37
            if (r0 != 0) goto L204
        L1be:
            org.luckypray.dexkit.DexKitBridge r0 = r3.dexKit     // Catch: java.lang.Throwable -> L37
            java.lang.String r1 = "MicroMsg.emoji.EmojiFileEncryptMgr"
            java.lang.String r2 = "decode emoji file failed. path is no exist :%s "
            java.lang.String[] r1 = new java.lang.String[]{r1, r2}     // Catch: java.lang.Throwable -> L37
            ch.e r1 = r3.mkMethodUsingStrings(r1)     // Catch: java.lang.Throwable -> L37
            hh.p r0 = r0.findMethod(r1)     // Catch: java.lang.Throwable -> L37
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L37
        L1d4:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L37
            if (r1 == 0) goto L204
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L37
            hh.o r1 = (hh.o) r1     // Catch: java.lang.Throwable -> L37
            java.lang.ClassLoader r2 = r3.classLoader     // Catch: java.lang.Throwable -> L1d4
            java.lang.reflect.Method r1 = r1.r(r2)     // Catch: java.lang.Throwable -> L1d4
            boolean r2 = r3.isEmojiDecodeDataMethod(r1)     // Catch: java.lang.Throwable -> L1d4
            if (r2 != 0) goto L1ed
            goto L1d4
        L1ed:
            java.lang.Class r2 = r1.getDeclaringClass()     // Catch: java.lang.Throwable -> L1d4
            java.lang.reflect.Method r2 = r3.findEmojiDecodeManagerGetter(r2)     // Catch: java.lang.Throwable -> L1d4
            if (r2 != 0) goto L1f8
            goto L1d4
        L1f8:
            java.lang.reflect.Method r1 = h.Hchat.utils.KavaReflector.accessible(r1)     // Catch: java.lang.Throwable -> L1d4
            r3.emojiDecodeDataMethod = r1     // Catch: java.lang.Throwable -> L1d4
            java.lang.reflect.Method r1 = h.Hchat.utils.KavaReflector.accessible(r2)     // Catch: java.lang.Throwable -> L1d4
            r3.emojiDecodeManagerGetterMethod = r1     // Catch: java.lang.Throwable -> L1d4
        L204:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L37
            r0.<init>()     // Catch: java.lang.Throwable -> L37
            java.lang.String r1 = "表情发送API: send="
            r0.append(r1)     // Catch: java.lang.Throwable -> L37
            java.lang.reflect.Method r1 = r3.emojiSendMethod     // Catch: java.lang.Throwable -> L37
            java.lang.String r1 = r3.methodName(r1)     // Catch: java.lang.Throwable -> L37
            r0.append(r1)     // Catch: java.lang.Throwable -> L37
            java.lang.String r1 = " managerSend="
            r0.append(r1)     // Catch: java.lang.Throwable -> L37
            java.lang.reflect.Method r1 = r3.emojiManagerSendMethod     // Catch: java.lang.Throwable -> L37
            java.lang.String r1 = r3.methodName(r1)     // Catch: java.lang.Throwable -> L37
            r0.append(r1)     // Catch: java.lang.Throwable -> L37
            java.lang.String r1 = " getByMd5="
            r0.append(r1)     // Catch: java.lang.Throwable -> L37
            java.lang.reflect.Method r1 = r3.emojiGetByMd5Method     // Catch: java.lang.Throwable -> L37
            java.lang.String r1 = r3.methodName(r1)     // Catch: java.lang.Throwable -> L37
            r0.append(r1)     // Catch: java.lang.Throwable -> L37
            java.lang.String r1 = " create="
            r0.append(r1)     // Catch: java.lang.Throwable -> L37
            java.lang.reflect.Method r1 = r3.emojiCreateInfoMethod     // Catch: java.lang.Throwable -> L37
            java.lang.String r1 = r3.methodName(r1)     // Catch: java.lang.Throwable -> L37
            r0.append(r1)     // Catch: java.lang.Throwable -> L37
            java.lang.String r1 = " accPath="
            r0.append(r1)     // Catch: java.lang.Throwable -> L37
            java.lang.reflect.Method r1 = r3.emojiAccPathMethod     // Catch: java.lang.Throwable -> L37
            java.lang.String r1 = r3.methodName(r1)     // Catch: java.lang.Throwable -> L37
            r0.append(r1)     // Catch: java.lang.Throwable -> L37
            java.lang.String r1 = " decode="
            r0.append(r1)     // Catch: java.lang.Throwable -> L37
            java.lang.reflect.Method r1 = r3.emojiDecodeDataMethod     // Catch: java.lang.Throwable -> L37
            java.lang.String r1 = r3.methodName(r1)     // Catch: java.lang.Throwable -> L37
            r0.append(r1)     // Catch: java.lang.Throwable -> L37
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L37
            r3.logDetail(r0)     // Catch: java.lang.Throwable -> L37
            goto L26f
        L265:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "[Hchat:DexFinder] resolveSendEmojiApi 失败: "
            r1.<init>(r2)
            bc.e.s(r0, r1, r0)
        L26f:
            return
    }

    public void resolveSendFileApi() {
            r4 = this;
            java.lang.reflect.Method r0 = r4.sendFileMethod     // Catch: java.lang.Throwable -> L12
            boolean r0 = r4.isSendFileAppMsgMethod(r0)     // Catch: java.lang.Throwable -> L12
            if (r0 == 0) goto L1f
            java.lang.reflect.Method r0 = r4.sendFileAttachDirMethod     // Catch: java.lang.Throwable -> L12
            if (r0 == 0) goto L15
            java.lang.reflect.Method r0 = r4.sendFileAttachPathMethod     // Catch: java.lang.Throwable -> L12
            if (r0 != 0) goto L11
            goto L15
        L11:
            return
        L12:
            r0 = move-exception
            goto L8c
        L15:
            java.lang.reflect.Method r0 = r4.sendFileMethod     // Catch: java.lang.Throwable -> L12
            java.lang.Class r0 = r0.getDeclaringClass()     // Catch: java.lang.Throwable -> L12
            r4.resolveSendFileAttachHelpers(r0)     // Catch: java.lang.Throwable -> L12
            return
        L1f:
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L12
            r0.<init>()     // Catch: java.lang.Throwable -> L12
            java.lang.String r1 = "summerbig content url:"
            java.lang.String[] r1 = new java.lang.String[]{r1}     // Catch: java.lang.Throwable -> L12
            java.lang.String r2 = "MicroMsg.AppMsgLogic"
            java.lang.String[] r2 = new java.lang.String[]{r2}     // Catch: java.lang.Throwable -> L12
            java.lang.String r3 = "/cgi-bin/micromsg-bin/uploadappattach"
            java.lang.String[] r3 = new java.lang.String[]{r3}     // Catch: java.lang.Throwable -> L12
            java.lang.String[][] r1 = new java.lang.String[][]{r1, r2, r3}     // Catch: java.lang.Throwable -> L12
            r2 = 20
            r4.collectAppMsgLogicCandidates(r0, r2, r1)     // Catch: java.lang.Throwable -> L12
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L12
        L43:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L12
            if (r1 == 0) goto L5e
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L12
            java.lang.Class r1 = (java.lang.Class) r1     // Catch: java.lang.Throwable -> L12
            java.lang.reflect.Method r2 = r4.findSendFileAppMsgMethod(r1)     // Catch: java.lang.Throwable -> L12
            if (r2 != 0) goto L56
            goto L43
        L56:
            h.Hchat.utils.KavaReflector.accessible(r2)     // Catch: java.lang.Throwable -> L12
            r4.sendFileMethod = r2     // Catch: java.lang.Throwable -> L12
            r4.resolveSendFileAttachHelpers(r1)     // Catch: java.lang.Throwable -> L12
        L5e:
            java.lang.reflect.Method r0 = r4.sendFileMethod     // Catch: java.lang.Throwable -> L12
            if (r0 == 0) goto L71
            java.lang.reflect.Method r1 = r4.sendFileAttachDirMethod     // Catch: java.lang.Throwable -> L12
            if (r1 == 0) goto L6a
            java.lang.reflect.Method r1 = r4.sendFileAttachPathMethod     // Catch: java.lang.Throwable -> L12
            if (r1 != 0) goto L71
        L6a:
            java.lang.Class r0 = r0.getDeclaringClass()     // Catch: java.lang.Throwable -> L12
            r4.resolveSendFileAttachHelpers(r0)     // Catch: java.lang.Throwable -> L12
        L71:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L12
            r0.<init>()     // Catch: java.lang.Throwable -> L12
            java.lang.String r1 = "文件发送方法: "
            r0.append(r1)     // Catch: java.lang.Throwable -> L12
            java.lang.reflect.Method r1 = r4.sendFileMethod     // Catch: java.lang.Throwable -> L12
            java.lang.String r1 = r4.methodName(r1)     // Catch: java.lang.Throwable -> L12
            r0.append(r1)     // Catch: java.lang.Throwable -> L12
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L12
            r4.logDetail(r0)     // Catch: java.lang.Throwable -> L12
            return
        L8c:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "[Hchat:DexFinder] resolveSendFileApi 失败: "
            r1.<init>(r2)
            bc.e.s(r0, r1, r0)
            return
    }

    public void resolveSendImageApi() {
            r4 = this;
            java.lang.reflect.Method r0 = r4.sendImageMethod     // Catch: java.lang.Throwable -> Lf
            boolean r0 = r4.isSendImageAppInfoMethod(r0)     // Catch: java.lang.Throwable -> Lf
            if (r0 == 0) goto L12
            r4.resolveSendImageAsyncAppInfoApi()     // Catch: java.lang.Throwable -> Lf
            r4.resolveImageBestPathApi()     // Catch: java.lang.Throwable -> Lf
            return
        Lf:
            r0 = move-exception
            goto L8b
        L12:
            org.luckypray.dexkit.DexKitBridge r0 = r4.dexKit     // Catch: java.lang.Throwable -> Lf
            java.lang.String r1 = "sendImg: args error"
            java.lang.String[] r1 = new java.lang.String[]{r1}     // Catch: java.lang.Throwable -> Lf
            ch.e r1 = r4.mkMethodUsingStrings(r1)     // Catch: java.lang.Throwable -> Lf
            hh.p r0 = r0.findMethod(r1)     // Catch: java.lang.Throwable -> Lf
            java.util.Iterator r1 = r0.iterator()     // Catch: java.lang.Throwable -> Lf
        L26:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> Lf
            if (r2 == 0) goto L44
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> Lf
            hh.o r2 = (hh.o) r2     // Catch: java.lang.Throwable -> Lf
            java.lang.ClassLoader r3 = r4.classLoader     // Catch: java.lang.Throwable -> L26
            java.lang.reflect.Method r2 = r2.r(r3)     // Catch: java.lang.Throwable -> L26
            boolean r3 = r4.isSendImageAppInfoMethod(r2)     // Catch: java.lang.Throwable -> L26
            if (r3 != 0) goto L3f
            goto L26
        L3f:
            h.Hchat.utils.KavaReflector.accessible(r2)     // Catch: java.lang.Throwable -> L26
            r4.sendImageMethod = r2     // Catch: java.lang.Throwable -> L26
        L44:
            java.lang.reflect.Method r1 = r4.sendImageMethod     // Catch: java.lang.Throwable -> Lf
            if (r1 != 0) goto L6a
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> Lf
        L4c:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> Lf
            if (r1 == 0) goto L6a
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> Lf
            hh.o r1 = (hh.o) r1     // Catch: java.lang.Throwable -> Lf
            java.lang.ClassLoader r2 = r4.classLoader     // Catch: java.lang.Throwable -> L4c
            java.lang.reflect.Method r1 = r1.r(r2)     // Catch: java.lang.Throwable -> L4c
            boolean r2 = r4.isSendImageMethod(r1)     // Catch: java.lang.Throwable -> L4c
            if (r2 != 0) goto L65
            goto L4c
        L65:
            h.Hchat.utils.KavaReflector.accessible(r1)     // Catch: java.lang.Throwable -> L4c
            r4.sendImageMethod = r1     // Catch: java.lang.Throwable -> L4c
        L6a:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lf
            r0.<init>()     // Catch: java.lang.Throwable -> Lf
            java.lang.String r1 = "图片发送方法: "
            r0.append(r1)     // Catch: java.lang.Throwable -> Lf
            java.lang.reflect.Method r1 = r4.sendImageMethod     // Catch: java.lang.Throwable -> Lf
            java.lang.String r1 = r4.methodName(r1)     // Catch: java.lang.Throwable -> Lf
            r0.append(r1)     // Catch: java.lang.Throwable -> Lf
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> Lf
            r4.logDetail(r0)     // Catch: java.lang.Throwable -> Lf
            r4.resolveSendImageAsyncAppInfoApi()     // Catch: java.lang.Throwable -> Lf
            r4.resolveImageBestPathApi()     // Catch: java.lang.Throwable -> Lf
            goto L95
        L8b:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "[Hchat:DexFinder] resolveSendImageApi 失败: "
            r1.<init>(r2)
            bc.e.s(r0, r1, r0)
        L95:
            return
    }

    public void resolveSendTextMsg() {
            r9 = this;
            java.lang.String r0 = "NetSceneSendMsg"
            java.lang.String r1 = "MicroMsg.NetSceneSendMsg"
            java.lang.String r2 = "/cgi-bin/micromsg-bin/newsendmsg"
            java.lang.Class<java.lang.String> r3 = java.lang.String.class
            java.lang.Class<?> r4 = r9.sendTextMsgClass     // Catch: java.lang.Throwable -> L15
            if (r4 == 0) goto L19
            java.lang.reflect.Constructor<?> r4 = r9.sendTextMsgCtorLong     // Catch: java.lang.Throwable -> L15
            if (r4 != 0) goto L18
            java.lang.reflect.Constructor<?> r4 = r9.sendTextMsgCtorObject     // Catch: java.lang.Throwable -> L15
            if (r4 == 0) goto L19
            goto L18
        L15:
            r0 = move-exception
            goto Lba
        L18:
            return
        L19:
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L15
            r4.<init>()     // Catch: java.lang.Throwable -> L15
            java.lang.String[] r5 = new java.lang.String[]{r2}     // Catch: java.lang.Throwable -> L15
            java.lang.String[] r6 = new java.lang.String[]{r1}     // Catch: java.lang.Throwable -> L15
            java.lang.String[] r7 = new java.lang.String[]{r0}     // Catch: java.lang.Throwable -> L15
            java.lang.String r8 = "newsendmsg"
            java.lang.String[] r8 = new java.lang.String[]{r8}     // Catch: java.lang.Throwable -> L15
            java.lang.String[][] r5 = new java.lang.String[][]{r5, r6, r7, r8}     // Catch: java.lang.Throwable -> L15
            r6 = 20
            r9.collectSendTextClassCandidates(r4, r6, r5)     // Catch: java.lang.Throwable -> L15
            java.lang.String[] r2 = new java.lang.String[]{r2}     // Catch: java.lang.Throwable -> L15
            java.lang.String[] r1 = new java.lang.String[]{r1}     // Catch: java.lang.Throwable -> L15
            java.lang.String[] r0 = new java.lang.String[]{r0}     // Catch: java.lang.Throwable -> L15
            java.lang.String[][] r0 = new java.lang.String[][]{r2, r1, r0}     // Catch: java.lang.Throwable -> L15
            r9.collectSendTextMethodOwnerCandidates(r4, r6, r0)     // Catch: java.lang.Throwable -> L15
            java.util.Iterator r0 = r4.iterator()     // Catch: java.lang.Throwable -> L15
        L50:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L15
            if (r1 == 0) goto L7c
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L15
            java.lang.Class r1 = (java.lang.Class) r1     // Catch: java.lang.Throwable -> L15
            java.lang.Class r2 = java.lang.Integer.TYPE     // Catch: java.lang.Throwable -> L15
            java.lang.Class r4 = java.lang.Long.TYPE     // Catch: java.lang.Throwable -> L15
            java.lang.Class[] r4 = new java.lang.Class[]{r3, r3, r2, r2, r4}     // Catch: java.lang.Throwable -> L15
            java.lang.reflect.Constructor r4 = r9.findCtorByExactTypes(r1, r4)     // Catch: java.lang.Throwable -> L15
            java.lang.Class<java.lang.Object> r5 = java.lang.Object.class
            java.lang.Class[] r2 = new java.lang.Class[]{r3, r3, r2, r2, r5}     // Catch: java.lang.Throwable -> L15
            java.lang.reflect.Constructor r2 = r9.findCtorByExactTypes(r1, r2)     // Catch: java.lang.Throwable -> L15
            if (r4 != 0) goto L76
            if (r2 == 0) goto L50
        L76:
            r9.sendTextMsgClass = r1     // Catch: java.lang.Throwable -> L15
            r9.sendTextMsgCtorLong = r4     // Catch: java.lang.Throwable -> L15
            r9.sendTextMsgCtorObject = r2     // Catch: java.lang.Throwable -> L15
        L7c:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L15
            r0.<init>()     // Catch: java.lang.Throwable -> L15
            java.lang.String r1 = "文本发送类: "
            r0.append(r1)     // Catch: java.lang.Throwable -> L15
            java.lang.Class<?> r1 = r9.sendTextMsgClass     // Catch: java.lang.Throwable -> L15
            if (r1 == 0) goto L8f
            java.lang.String r1 = r1.getName()     // Catch: java.lang.Throwable -> L15
            goto L91
        L8f:
            java.lang.String r1 = "null"
        L91:
            r0.append(r1)     // Catch: java.lang.Throwable -> L15
            java.lang.String r1 = " longCtor="
            r0.append(r1)     // Catch: java.lang.Throwable -> L15
            java.lang.reflect.Constructor<?> r1 = r9.sendTextMsgCtorLong     // Catch: java.lang.Throwable -> L15
            r2 = 0
            r3 = 1
            if (r1 == 0) goto La1
            r1 = r3
            goto La2
        La1:
            r1 = r2
        La2:
            r0.append(r1)     // Catch: java.lang.Throwable -> L15
            java.lang.String r1 = " objectCtor="
            r0.append(r1)     // Catch: java.lang.Throwable -> L15
            java.lang.reflect.Constructor<?> r1 = r9.sendTextMsgCtorObject     // Catch: java.lang.Throwable -> L15
            if (r1 == 0) goto Laf
            r2 = r3
        Laf:
            r0.append(r2)     // Catch: java.lang.Throwable -> L15
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L15
            r9.logDetail(r0)     // Catch: java.lang.Throwable -> L15
            return
        Lba:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "[Hchat:DexFinder] resolveSendText 失败: "
            r1.<init>(r2)
            bc.e.s(r0, r1, r0)
            return
    }

    public void resolveSendVideoApi() {
            r3 = this;
            java.lang.reflect.Method r0 = r3.sendVideoMethod     // Catch: java.lang.Throwable -> L38
            if (r0 == 0) goto L5
            goto L5f
        L5:
            org.luckypray.dexkit.DexKitBridge r0 = r3.dexKit     // Catch: java.lang.Throwable -> L38
            java.lang.String r1 = "send vedio args error"
            java.lang.String[] r1 = new java.lang.String[]{r1}     // Catch: java.lang.Throwable -> L38
            ch.e r1 = r3.mkMethodUsingStrings(r1)     // Catch: java.lang.Throwable -> L38
            hh.p r0 = r0.findMethod(r1)     // Catch: java.lang.Throwable -> L38
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L38
        L19:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L38
            if (r1 == 0) goto L3a
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L38
            hh.o r1 = (hh.o) r1     // Catch: java.lang.Throwable -> L38
            java.lang.ClassLoader r2 = r3.classLoader     // Catch: java.lang.Throwable -> L19
            java.lang.reflect.Method r1 = r1.r(r2)     // Catch: java.lang.Throwable -> L19
            boolean r2 = r3.isSendVideoMethod(r1)     // Catch: java.lang.Throwable -> L19
            if (r2 != 0) goto L32
            goto L19
        L32:
            h.Hchat.utils.KavaReflector.accessible(r1)     // Catch: java.lang.Throwable -> L19
            r3.sendVideoMethod = r1     // Catch: java.lang.Throwable -> L19
            goto L3a
        L38:
            r0 = move-exception
            goto L55
        L3a:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L38
            r0.<init>()     // Catch: java.lang.Throwable -> L38
            java.lang.String r1 = "视频发送方法: "
            r0.append(r1)     // Catch: java.lang.Throwable -> L38
            java.lang.reflect.Method r1 = r3.sendVideoMethod     // Catch: java.lang.Throwable -> L38
            java.lang.String r1 = r3.methodName(r1)     // Catch: java.lang.Throwable -> L38
            r0.append(r1)     // Catch: java.lang.Throwable -> L38
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L38
            r3.logDetail(r0)     // Catch: java.lang.Throwable -> L38
            goto L5f
        L55:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "[Hchat:DexFinder] resolveSendVideoApi 失败: "
            r1.<init>(r2)
            bc.e.s(r0, r1, r0)
        L5f:
            return
    }

    public void resolveSendVideoTaskApi() {
            r3 = this;
            java.lang.String r0 = "视频静默Task: "
            java.lang.Class<?> r1 = r3.sendVideoTaskClass     // Catch: java.lang.Throwable -> L1c
            if (r1 == 0) goto L7
            return
        L7:
            java.lang.String r1 = "MicroMsg.MsgRetransmitUI"
            java.lang.String r2 = "CopyVideoTask ori[%s] status[%d] new[%s]"
            java.lang.String[] r1 = new java.lang.String[]{r1, r2}     // Catch: java.lang.Throwable -> L1c
            java.lang.Class r1 = r3.findFirstClassByStrings(r1)     // Catch: java.lang.Throwable -> L1c
            r3.sendVideoTaskClass = r1     // Catch: java.lang.Throwable -> L1c
            if (r1 == 0) goto L1e
            java.lang.String r1 = r1.getName()     // Catch: java.lang.Throwable -> L1c
            goto L20
        L1c:
            r0 = move-exception
            goto L28
        L1e:
            java.lang.String r1 = "null"
        L20:
            java.lang.String r0 = r0.concat(r1)     // Catch: java.lang.Throwable -> L1c
            r3.logDetail(r0)     // Catch: java.lang.Throwable -> L1c
            return
        L28:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "[Hchat:DexFinder] resolveSendVideoTaskApi 失败: "
            r1.<init>(r2)
            bc.e.s(r0, r1, r0)
            return
    }

    public void resolveSendVoiceApi() {
            r6 = this;
            java.lang.reflect.Method r0 = r6.voiceStartRecordMethod     // Catch: java.lang.Throwable -> L37
            if (r0 != 0) goto L3a
            org.luckypray.dexkit.DexKitBridge r0 = r6.dexKit     // Catch: java.lang.Throwable -> L37
            java.lang.String r1 = "startRecord insert voicestg success"
            java.lang.String[] r1 = new java.lang.String[]{r1}     // Catch: java.lang.Throwable -> L37
            ch.e r1 = r6.mkMethodUsingStrings(r1)     // Catch: java.lang.Throwable -> L37
            hh.p r0 = r0.findMethod(r1)     // Catch: java.lang.Throwable -> L37
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L37
        L18:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L37
            if (r1 == 0) goto L3a
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L37
            hh.o r1 = (hh.o) r1     // Catch: java.lang.Throwable -> L37
            java.lang.ClassLoader r2 = r6.classLoader     // Catch: java.lang.Throwable -> L18
            java.lang.reflect.Method r1 = r1.r(r2)     // Catch: java.lang.Throwable -> L18
            boolean r2 = r6.isVoiceStartRecordMethod(r1)     // Catch: java.lang.Throwable -> L18
            if (r2 != 0) goto L31
            goto L18
        L31:
            h.Hchat.utils.KavaReflector.accessible(r1)     // Catch: java.lang.Throwable -> L18
            r6.voiceStartRecordMethod = r1     // Catch: java.lang.Throwable -> L18
            goto L3a
        L37:
            r0 = move-exception
            goto L17b
        L3a:
            java.lang.reflect.Method r0 = r6.voiceFullPathMethod     // Catch: java.lang.Throwable -> L37
            if (r0 != 0) goto L70
            org.luckypray.dexkit.DexKitBridge r0 = r6.dexKit     // Catch: java.lang.Throwable -> L37
            java.lang.String r1 = "getAmrFullPath cost:"
            java.lang.String[] r1 = new java.lang.String[]{r1}     // Catch: java.lang.Throwable -> L37
            ch.e r1 = r6.mkMethodUsingStrings(r1)     // Catch: java.lang.Throwable -> L37
            hh.p r0 = r0.findMethod(r1)     // Catch: java.lang.Throwable -> L37
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L37
        L52:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L37
            if (r1 == 0) goto L70
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L37
            hh.o r1 = (hh.o) r1     // Catch: java.lang.Throwable -> L37
            java.lang.ClassLoader r2 = r6.classLoader     // Catch: java.lang.Throwable -> L52
            java.lang.reflect.Method r1 = r1.r(r2)     // Catch: java.lang.Throwable -> L52
            boolean r2 = r6.isVoiceFullPathMethod(r1)     // Catch: java.lang.Throwable -> L52
            if (r2 != 0) goto L6b
            goto L52
        L6b:
            h.Hchat.utils.KavaReflector.accessible(r1)     // Catch: java.lang.Throwable -> L52
            r6.voiceFullPathMethod = r1     // Catch: java.lang.Throwable -> L52
        L70:
            java.lang.reflect.Method r0 = r6.voiceFinishRecordMethod     // Catch: java.lang.Throwable -> L37
            if (r0 != 0) goto L9c
            java.lang.reflect.Method r0 = r6.voiceStartRecordMethod     // Catch: java.lang.Throwable -> L37
            if (r0 == 0) goto L9c
            java.lang.Class r0 = r0.getDeclaringClass()     // Catch: java.lang.Throwable -> L37
            java.util.List r0 = h.Hchat.utils.KavaReflector.declaredMethods(r0)     // Catch: java.lang.Throwable -> L37
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L37
        L84:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L37
            if (r1 == 0) goto L9c
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L37
            java.lang.reflect.Method r1 = (java.lang.reflect.Method) r1     // Catch: java.lang.Throwable -> L37
            boolean r2 = r6.isVoiceFinishRecordMethod(r1)     // Catch: java.lang.Throwable -> L37
            if (r2 != 0) goto L97
            goto L84
        L97:
            h.Hchat.utils.KavaReflector.accessible(r1)     // Catch: java.lang.Throwable -> L37
            r6.voiceFinishRecordMethod = r1     // Catch: java.lang.Throwable -> L37
        L9c:
            java.lang.reflect.Method r0 = r6.voiceInfoQueryMethod     // Catch: java.lang.Throwable -> L37
            if (r0 != 0) goto La6
            java.lang.reflect.Method r0 = r6.findVoiceInfoQueryMethod()     // Catch: java.lang.Throwable -> L37
            r6.voiceInfoQueryMethod = r0     // Catch: java.lang.Throwable -> L37
        La6:
            java.lang.Class<?> r0 = r6.voiceUploadClass     // Catch: java.lang.Throwable -> L37
            java.lang.Class r1 = java.lang.Boolean.TYPE
            java.lang.Class<java.lang.String> r2 = java.lang.String.class
            if (r0 == 0) goto Lb6
            java.lang.reflect.Constructor<?> r0 = r6.voiceUploadCtor     // Catch: java.lang.Throwable -> L37
            if (r0 != 0) goto Lff
            java.lang.reflect.Constructor<?> r0 = r6.voiceUploadCdnCtor     // Catch: java.lang.Throwable -> L37
            if (r0 != 0) goto Lff
        Lb6:
            org.luckypray.dexkit.DexKitBridge r0 = r6.dexKit     // Catch: java.lang.Throwable -> L37
            java.lang.String r3 = "/cgi-bin/micromsg-bin/uploadvoice"
            java.lang.String[] r3 = new java.lang.String[]{r3}     // Catch: java.lang.Throwable -> L37
            ch.e r3 = r6.mkMethodUsingStrings(r3)     // Catch: java.lang.Throwable -> L37
            hh.p r0 = r0.findMethod(r3)     // Catch: java.lang.Throwable -> L37
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L37
        Lca:
            boolean r3 = r0.hasNext()     // Catch: java.lang.Throwable -> L37
            if (r3 == 0) goto Lff
            java.lang.Object r3 = r0.next()     // Catch: java.lang.Throwable -> L37
            hh.o r3 = (hh.o) r3     // Catch: java.lang.Throwable -> L37
            lh.d r3 = r3.p()     // Catch: java.lang.Throwable -> Lca
            java.lang.String r3 = r3.f8063g     // Catch: java.lang.Throwable -> Lca
            java.lang.ClassLoader r4 = r6.classLoader     // Catch: java.lang.Throwable -> Lca
            java.lang.Class r3 = h.Hchat.utils.KavaReflector.loadClass(r3, r4)     // Catch: java.lang.Throwable -> Lca
            java.lang.Class r4 = java.lang.Integer.TYPE     // Catch: java.lang.Throwable -> Lca
            java.lang.Class[] r4 = new java.lang.Class[]{r2, r4}     // Catch: java.lang.Throwable -> Lca
            java.lang.reflect.Constructor r4 = r6.findCtorByExactTypes(r3, r4)     // Catch: java.lang.Throwable -> Lca
            java.lang.Class[] r5 = new java.lang.Class[]{r2, r1}     // Catch: java.lang.Throwable -> Lca
            java.lang.reflect.Constructor r5 = r6.findCtorByExactTypes(r3, r5)     // Catch: java.lang.Throwable -> Lca
            if (r4 != 0) goto Lf9
            if (r5 != 0) goto Lf9
            goto Lca
        Lf9:
            r6.voiceUploadClass = r3     // Catch: java.lang.Throwable -> Lca
            r6.voiceUploadCtor = r4     // Catch: java.lang.Throwable -> Lca
            r6.voiceUploadCdnCtor = r5     // Catch: java.lang.Throwable -> Lca
        Lff:
            java.lang.Class<?> r0 = r6.voiceUploadClass     // Catch: java.lang.Throwable -> L37
            if (r0 == 0) goto L111
            java.lang.reflect.Constructor<?> r3 = r6.voiceUploadCdnCtor     // Catch: java.lang.Throwable -> L37
            if (r3 != 0) goto L111
            java.lang.Class[] r1 = new java.lang.Class[]{r2, r1}     // Catch: java.lang.Throwable -> L37
            java.lang.reflect.Constructor r0 = r6.findCtorByExactTypes(r0, r1)     // Catch: java.lang.Throwable -> L37
            r6.voiceUploadCdnCtor = r0     // Catch: java.lang.Throwable -> L37
        L111:
            r6.resolveVoicePlaybackApi()     // Catch: java.lang.Throwable -> L37
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L37
            r0.<init>()     // Catch: java.lang.Throwable -> L37
            java.lang.String r1 = "语音发送API: start="
            r0.append(r1)     // Catch: java.lang.Throwable -> L37
            java.lang.reflect.Method r1 = r6.voiceStartRecordMethod     // Catch: java.lang.Throwable -> L37
            java.lang.String r1 = r6.methodName(r1)     // Catch: java.lang.Throwable -> L37
            r0.append(r1)     // Catch: java.lang.Throwable -> L37
            java.lang.String r1 = " path="
            r0.append(r1)     // Catch: java.lang.Throwable -> L37
            java.lang.reflect.Method r1 = r6.voiceFullPathMethod     // Catch: java.lang.Throwable -> L37
            java.lang.String r1 = r6.methodName(r1)     // Catch: java.lang.Throwable -> L37
            r0.append(r1)     // Catch: java.lang.Throwable -> L37
            java.lang.String r1 = " finish="
            r0.append(r1)     // Catch: java.lang.Throwable -> L37
            java.lang.reflect.Method r1 = r6.voiceFinishRecordMethod     // Catch: java.lang.Throwable -> L37
            java.lang.String r1 = r6.methodName(r1)     // Catch: java.lang.Throwable -> L37
            r0.append(r1)     // Catch: java.lang.Throwable -> L37
            java.lang.String r1 = " info="
            r0.append(r1)     // Catch: java.lang.Throwable -> L37
            java.lang.reflect.Method r1 = r6.voiceInfoQueryMethod     // Catch: java.lang.Throwable -> L37
            java.lang.String r1 = r6.methodName(r1)     // Catch: java.lang.Throwable -> L37
            r0.append(r1)     // Catch: java.lang.Throwable -> L37
            java.lang.String r1 = " upload="
            r0.append(r1)     // Catch: java.lang.Throwable -> L37
            java.lang.Class<?> r1 = r6.voiceUploadClass     // Catch: java.lang.Throwable -> L37
            if (r1 == 0) goto L15f
            java.lang.String r1 = r1.getName()     // Catch: java.lang.Throwable -> L37
            goto L161
        L15f:
            java.lang.String r1 = "null"
        L161:
            r0.append(r1)     // Catch: java.lang.Throwable -> L37
            java.lang.String r1 = " cdnCtor="
            r0.append(r1)     // Catch: java.lang.Throwable -> L37
            java.lang.reflect.Constructor<?> r1 = r6.voiceUploadCdnCtor     // Catch: java.lang.Throwable -> L37
            if (r1 == 0) goto L16f
            r1 = 1
            goto L170
        L16f:
            r1 = 0
        L170:
            r0.append(r1)     // Catch: java.lang.Throwable -> L37
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L37
            r6.logDetail(r0)     // Catch: java.lang.Throwable -> L37
            goto L185
        L17b:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "[Hchat:DexFinder] resolveSendVoiceApi 失败: "
            r1.<init>(r2)
            bc.e.s(r0, r1, r0)
        L185:
            return
    }

    public void resolveSendXmlApi() {
            r4 = this;
            java.lang.reflect.Method r0 = r4.sendXmlAppMsgMethod     // Catch: java.lang.Throwable -> L15
            boolean r0 = r4.isSendXmlAppMsgMethod(r0)     // Catch: java.lang.Throwable -> L15
            r1 = 0
            if (r0 == 0) goto L17
            java.lang.reflect.Method r0 = r4.sendXmlAppMsgMethod     // Catch: java.lang.Throwable -> L15
            java.lang.Class[] r0 = r0.getParameterTypes()     // Catch: java.lang.Throwable -> L15
            r0 = r0[r1]     // Catch: java.lang.Throwable -> L15
            r4.resolveAppMsgParseMethod(r0)     // Catch: java.lang.Throwable -> L15
            return
        L15:
            r0 = move-exception
            goto L7b
        L17:
            org.luckypray.dexkit.DexKitBridge r0 = r4.dexKit     // Catch: java.lang.Throwable -> L15
            java.lang.String r2 = "summerbig sendAppMsg attachFilePath"
            java.lang.String[] r2 = new java.lang.String[]{r2}     // Catch: java.lang.Throwable -> L15
            ch.e r2 = r4.mkMethodUsingStrings(r2)     // Catch: java.lang.Throwable -> L15
            hh.p r0 = r0.findMethod(r2)     // Catch: java.lang.Throwable -> L15
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L15
        L2b:
            boolean r2 = r0.hasNext()     // Catch: java.lang.Throwable -> L15
            if (r2 == 0) goto L52
            java.lang.Object r2 = r0.next()     // Catch: java.lang.Throwable -> L15
            hh.o r2 = (hh.o) r2     // Catch: java.lang.Throwable -> L15
            java.lang.ClassLoader r3 = r4.classLoader     // Catch: java.lang.Throwable -> L2b
            java.lang.reflect.Method r2 = r2.r(r3)     // Catch: java.lang.Throwable -> L2b
            boolean r3 = r4.isSendXmlAppMsgMethod(r2)     // Catch: java.lang.Throwable -> L2b
            if (r3 != 0) goto L44
            goto L2b
        L44:
            h.Hchat.utils.KavaReflector.accessible(r2)     // Catch: java.lang.Throwable -> L2b
            r4.sendXmlAppMsgMethod = r2     // Catch: java.lang.Throwable -> L2b
            java.lang.Class[] r2 = r2.getParameterTypes()     // Catch: java.lang.Throwable -> L2b
            r2 = r2[r1]     // Catch: java.lang.Throwable -> L2b
            r4.resolveAppMsgParseMethod(r2)     // Catch: java.lang.Throwable -> L2b
        L52:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L15
            r0.<init>()     // Catch: java.lang.Throwable -> L15
            java.lang.String r1 = "XML发送方法: "
            r0.append(r1)     // Catch: java.lang.Throwable -> L15
            java.lang.reflect.Method r1 = r4.sendXmlAppMsgMethod     // Catch: java.lang.Throwable -> L15
            java.lang.String r1 = r4.methodName(r1)     // Catch: java.lang.Throwable -> L15
            r0.append(r1)     // Catch: java.lang.Throwable -> L15
            java.lang.String r1 = " parse="
            r0.append(r1)     // Catch: java.lang.Throwable -> L15
            java.lang.reflect.Method r1 = r4.appMsgParseMethod     // Catch: java.lang.Throwable -> L15
            java.lang.String r1 = r4.methodName(r1)     // Catch: java.lang.Throwable -> L15
            r0.append(r1)     // Catch: java.lang.Throwable -> L15
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L15
            r4.logDetail(r0)     // Catch: java.lang.Throwable -> L15
            goto L85
        L7b:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "[Hchat:DexFinder] resolveSendXmlApi 失败: "
            r1.<init>(r2)
            bc.e.s(r0, r1, r0)
        L85:
            return
    }

    public void resolveServiceManagerApi() {
            r3 = this;
            java.lang.reflect.Method r0 = r3.serviceGetterMethod     // Catch: java.lang.Throwable -> L3c
            boolean r0 = r3.isServiceGetterMethod(r0)     // Catch: java.lang.Throwable -> L3c
            if (r0 == 0) goto L9
            goto L63
        L9:
            org.luckypray.dexkit.DexKitBridge r0 = r3.dexKit     // Catch: java.lang.Throwable -> L3c
            java.lang.String r1 = "calling getService(...)"
            java.lang.String[] r1 = new java.lang.String[]{r1}     // Catch: java.lang.Throwable -> L3c
            ch.e r1 = r3.mkMethodUsingStrings(r1)     // Catch: java.lang.Throwable -> L3c
            hh.p r0 = r0.findMethod(r1)     // Catch: java.lang.Throwable -> L3c
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L3c
        L1d:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L3c
            if (r1 == 0) goto L3e
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L3c
            hh.o r1 = (hh.o) r1     // Catch: java.lang.Throwable -> L3c
            java.lang.ClassLoader r2 = r3.classLoader     // Catch: java.lang.Throwable -> L1d
            java.lang.reflect.Method r1 = r1.r(r2)     // Catch: java.lang.Throwable -> L1d
            boolean r2 = r3.isServiceGetterMethod(r1)     // Catch: java.lang.Throwable -> L1d
            if (r2 != 0) goto L36
            goto L1d
        L36:
            h.Hchat.utils.KavaReflector.accessible(r1)     // Catch: java.lang.Throwable -> L1d
            r3.serviceGetterMethod = r1     // Catch: java.lang.Throwable -> L1d
            goto L3e
        L3c:
            r0 = move-exception
            goto L59
        L3e:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L3c
            r0.<init>()     // Catch: java.lang.Throwable -> L3c
            java.lang.String r1 = "服务容器方法: "
            r0.append(r1)     // Catch: java.lang.Throwable -> L3c
            java.lang.reflect.Method r1 = r3.serviceGetterMethod     // Catch: java.lang.Throwable -> L3c
            java.lang.String r1 = r3.methodName(r1)     // Catch: java.lang.Throwable -> L3c
            r0.append(r1)     // Catch: java.lang.Throwable -> L3c
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L3c
            r3.logDetail(r0)     // Catch: java.lang.Throwable -> L3c
            goto L63
        L59:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "[Hchat:DexFinder] resolveServiceManagerApi 失败: "
            r1.<init>(r2)
            bc.e.s(r0, r1, r0)
        L63:
            return
    }

    public void resolveSnsUploadApi() {
            r15 = this;
            java.lang.String r0 = "getSnsUploadManager"
            java.lang.String r1 = "checkTLE snsinfo localId it time limit"
            java.lang.String r2 = "checkPostInUI"
            java.lang.String r3 = "MicroMsg.UploadManager"
            java.lang.String r4 = "setSdkAppName"
            java.lang.String r5 = "setSdkId"
            java.lang.String r6 = "setUploadList"
            java.lang.String r7 = "addImageMediaObjByPath"
            java.lang.String r8 = "setContentDes"
            java.lang.String r9 = "MicroMsg.UploadPackHelper"
            boolean r10 = r15.hasSnsUploadApi()     // Catch: java.lang.Throwable -> L23
            if (r10 == 0) goto L26
            java.lang.reflect.Method r10 = r15.snsAddVideoMethod     // Catch: java.lang.Throwable -> L23
            if (r10 == 0) goto L26
            java.lang.reflect.Method r10 = r15.snsShareAppMsgMethod     // Catch: java.lang.Throwable -> L23
            if (r10 == 0) goto L26
            return
        L23:
            r0 = move-exception
            goto L156
        L26:
            java.lang.Class<?> r10 = r15.snsUploadPackHelperClass     // Catch: java.lang.Throwable -> L23
            boolean r10 = r15.isSnsUploadPackHelperClass(r10)     // Catch: java.lang.Throwable -> L23
            r11 = 20
            if (r10 != 0) goto L74
            java.util.ArrayList r10 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L23
            r10.<init>()     // Catch: java.lang.Throwable -> L23
            java.lang.String[] r12 = new java.lang.String[]{r9, r8}     // Catch: java.lang.Throwable -> L23
            java.lang.String[] r13 = new java.lang.String[]{r7, r6}     // Catch: java.lang.Throwable -> L23
            java.lang.String[] r14 = new java.lang.String[]{r5, r4}     // Catch: java.lang.Throwable -> L23
            java.lang.String[][] r12 = new java.lang.String[][]{r12, r13, r14}     // Catch: java.lang.Throwable -> L23
            r15.collectSendTextClassCandidates(r10, r11, r12)     // Catch: java.lang.Throwable -> L23
            java.lang.String[] r8 = new java.lang.String[]{r9, r8}     // Catch: java.lang.Throwable -> L23
            java.lang.String[] r6 = new java.lang.String[]{r7, r6}     // Catch: java.lang.Throwable -> L23
            java.lang.String[] r4 = new java.lang.String[]{r5, r4}     // Catch: java.lang.Throwable -> L23
            java.lang.String[][] r4 = new java.lang.String[][]{r8, r6, r4}     // Catch: java.lang.Throwable -> L23
            r15.collectSendTextMethodOwnerCandidates(r10, r11, r4)     // Catch: java.lang.Throwable -> L23
            java.util.Iterator r4 = r10.iterator()     // Catch: java.lang.Throwable -> L23
        L5f:
            boolean r5 = r4.hasNext()     // Catch: java.lang.Throwable -> L23
            if (r5 == 0) goto L74
            java.lang.Object r5 = r4.next()     // Catch: java.lang.Throwable -> L23
            java.lang.Class r5 = (java.lang.Class) r5     // Catch: java.lang.Throwable -> L23
            boolean r6 = r15.isSnsUploadPackHelperClass(r5)     // Catch: java.lang.Throwable -> L23
            if (r6 != 0) goto L72
            goto L5f
        L72:
            r15.snsUploadPackHelperClass = r5     // Catch: java.lang.Throwable -> L23
        L74:
            java.lang.Class<?> r4 = r15.snsUploadManagerClass     // Catch: java.lang.Throwable -> L23
            boolean r4 = r15.isSnsUploadManagerClass(r4)     // Catch: java.lang.Throwable -> L23
            if (r4 != 0) goto Lc0
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L23
            r4.<init>()     // Catch: java.lang.Throwable -> L23
            java.lang.String[] r5 = new java.lang.String[]{r3, r2}     // Catch: java.lang.Throwable -> L23
            java.lang.String[] r6 = new java.lang.String[]{r1}     // Catch: java.lang.Throwable -> L23
            java.lang.String[] r7 = new java.lang.String[]{r0}     // Catch: java.lang.Throwable -> L23
            java.lang.String[][] r5 = new java.lang.String[][]{r5, r6, r7}     // Catch: java.lang.Throwable -> L23
            r15.collectSendTextClassCandidates(r4, r11, r5)     // Catch: java.lang.Throwable -> L23
            java.lang.String[] r2 = new java.lang.String[]{r3, r2}     // Catch: java.lang.Throwable -> L23
            java.lang.String[] r1 = new java.lang.String[]{r1}     // Catch: java.lang.Throwable -> L23
            java.lang.String[] r0 = new java.lang.String[]{r0}     // Catch: java.lang.Throwable -> L23
            java.lang.String[][] r0 = new java.lang.String[][]{r2, r1, r0}     // Catch: java.lang.Throwable -> L23
            r15.collectSendTextMethodOwnerCandidates(r4, r11, r0)     // Catch: java.lang.Throwable -> L23
            java.util.Iterator r0 = r4.iterator()     // Catch: java.lang.Throwable -> L23
        Lab:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L23
            if (r1 == 0) goto Lc0
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L23
            java.lang.Class r1 = (java.lang.Class) r1     // Catch: java.lang.Throwable -> L23
            boolean r2 = r15.isSnsUploadManagerClass(r1)     // Catch: java.lang.Throwable -> L23
            if (r2 != 0) goto Lbe
            goto Lab
        Lbe:
            r15.snsUploadManagerClass = r1     // Catch: java.lang.Throwable -> L23
        Lc0:
            r15.resolveSnsUploadMethods()     // Catch: java.lang.Throwable -> L23
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L23
            r0.<init>()     // Catch: java.lang.Throwable -> L23
            java.lang.String r1 = "朋友圈发布API: helper="
            r0.append(r1)     // Catch: java.lang.Throwable -> L23
            java.lang.Class<?> r1 = r15.snsUploadPackHelperClass     // Catch: java.lang.Throwable -> L23
            java.lang.String r2 = "null"
            if (r1 == 0) goto Ld8
            java.lang.String r1 = r1.getName()     // Catch: java.lang.Throwable -> L23
            goto Ld9
        Ld8:
            r1 = r2
        Ld9:
            r0.append(r1)     // Catch: java.lang.Throwable -> L23
            java.lang.String r1 = " manager="
            r0.append(r1)     // Catch: java.lang.Throwable -> L23
            java.lang.Class<?> r1 = r15.snsUploadManagerClass     // Catch: java.lang.Throwable -> L23
            if (r1 == 0) goto Le9
            java.lang.String r2 = r1.getName()     // Catch: java.lang.Throwable -> L23
        Le9:
            r0.append(r2)     // Catch: java.lang.Throwable -> L23
            java.lang.String r1 = " getter="
            r0.append(r1)     // Catch: java.lang.Throwable -> L23
            java.lang.reflect.Method r1 = r15.snsUploadManagerGetterMethod     // Catch: java.lang.Throwable -> L23
            java.lang.String r1 = r15.methodName(r1)     // Catch: java.lang.Throwable -> L23
            r0.append(r1)     // Catch: java.lang.Throwable -> L23
            java.lang.String r1 = " content="
            r0.append(r1)     // Catch: java.lang.Throwable -> L23
            java.lang.reflect.Method r1 = r15.snsSetContentMethod     // Catch: java.lang.Throwable -> L23
            java.lang.String r1 = r15.methodName(r1)     // Catch: java.lang.Throwable -> L23
            r0.append(r1)     // Catch: java.lang.Throwable -> L23
            java.lang.String r1 = " addImage="
            r0.append(r1)     // Catch: java.lang.Throwable -> L23
            java.lang.reflect.Method r1 = r15.snsAddImageMethod     // Catch: java.lang.Throwable -> L23
            java.lang.String r1 = r15.methodName(r1)     // Catch: java.lang.Throwable -> L23
            r0.append(r1)     // Catch: java.lang.Throwable -> L23
            java.lang.String r1 = " addVideo="
            r0.append(r1)     // Catch: java.lang.Throwable -> L23
            java.lang.reflect.Method r1 = r15.snsAddVideoMethod     // Catch: java.lang.Throwable -> L23
            java.lang.String r1 = r15.methodName(r1)     // Catch: java.lang.Throwable -> L23
            r0.append(r1)     // Catch: java.lang.Throwable -> L23
            java.lang.String r1 = " commit="
            r0.append(r1)     // Catch: java.lang.Throwable -> L23
            java.lang.reflect.Method r1 = r15.snsCommitMethod     // Catch: java.lang.Throwable -> L23
            java.lang.String r1 = r15.methodName(r1)     // Catch: java.lang.Throwable -> L23
            r0.append(r1)     // Catch: java.lang.Throwable -> L23
            java.lang.String r1 = " shareAppMsg="
            r0.append(r1)     // Catch: java.lang.Throwable -> L23
            java.lang.reflect.Method r1 = r15.snsShareAppMsgMethod     // Catch: java.lang.Throwable -> L23
            java.lang.String r1 = r15.methodName(r1)     // Catch: java.lang.Throwable -> L23
            r0.append(r1)     // Catch: java.lang.Throwable -> L23
            java.lang.String r1 = " check="
            r0.append(r1)     // Catch: java.lang.Throwable -> L23
            java.lang.reflect.Method r1 = r15.snsUploadCheckMethod     // Catch: java.lang.Throwable -> L23
            java.lang.String r1 = r15.methodName(r1)     // Catch: java.lang.Throwable -> L23
            r0.append(r1)     // Catch: java.lang.Throwable -> L23
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L23
            r15.logDetail(r0)     // Catch: java.lang.Throwable -> L23
            return
        L156:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "[Hchat:DexFinder] resolveSnsUploadApi 失败: "
            r1.<init>(r2)
            bc.e.s(r0, r1, r0)
            return
    }

    public void resolveTransferOperationApi() {
            r4 = this;
            java.lang.String r0 = "转账操作类: "
            java.lang.Class<?> r1 = r4.transferOperationClass     // Catch: java.lang.Throwable -> L60
            boolean r1 = r4.isTransferOperationClass(r1)     // Catch: java.lang.Throwable -> L60
            if (r1 == 0) goto Lc
            goto Lc3
        Lc:
            java.lang.String r1 = "com.tencent.mm.plugin.remittance.model.n0"
            java.lang.ClassLoader r2 = r4.classLoader     // Catch: java.lang.Throwable -> L28
            java.lang.Class r1 = h.Hchat.utils.KavaReflector.loadClass(r1, r2)     // Catch: java.lang.Throwable -> L28
            boolean r2 = r4.isTransferOperationClass(r1)     // Catch: java.lang.Throwable -> L28
            if (r2 == 0) goto L28
            r4.transferOperationClass = r1     // Catch: java.lang.Throwable -> L28
            java.lang.String r1 = r1.getName()     // Catch: java.lang.Throwable -> L28
            java.lang.String r1 = r0.concat(r1)     // Catch: java.lang.Throwable -> L28
            r4.logDetail(r1)     // Catch: java.lang.Throwable -> L28
            return
        L28:
            org.luckypray.dexkit.DexKitBridge r1 = r4.dexKit     // Catch: java.lang.Throwable -> L60
            java.lang.String r2 = "Micromsg.NetSceneTenpayRemittanceConfirm"
            java.lang.String r3 = "recv_account_type"
            java.lang.String[] r2 = new java.lang.String[]{r2, r3}     // Catch: java.lang.Throwable -> L60
            ch.c r2 = r4.mkClassUsingStrings(r2)     // Catch: java.lang.Throwable -> L60
            hh.j r1 = r1.findClass(r2)     // Catch: java.lang.Throwable -> L60
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L60
        L3e:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L60
            if (r2 == 0) goto L62
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L60
            hh.i r2 = (hh.i) r2     // Catch: java.lang.Throwable -> L60
            lh.a r2 = r2.p()     // Catch: java.lang.Throwable -> L3e
            java.lang.String r2 = r2.f8057g     // Catch: java.lang.Throwable -> L3e
            java.lang.ClassLoader r3 = r4.classLoader     // Catch: java.lang.Throwable -> L3e
            java.lang.Class r2 = h.Hchat.utils.KavaReflector.loadClass(r2, r3)     // Catch: java.lang.Throwable -> L3e
            boolean r3 = r4.isTransferOperationClass(r2)     // Catch: java.lang.Throwable -> L3e
            if (r3 != 0) goto L5d
            goto L3e
        L5d:
            r4.transferOperationClass = r2     // Catch: java.lang.Throwable -> L3e
            goto L62
        L60:
            r0 = move-exception
            goto Lb9
        L62:
            java.lang.Class<?> r1 = r4.transferOperationClass     // Catch: java.lang.Throwable -> L60
            if (r1 != 0) goto L9b
            org.luckypray.dexkit.DexKitBridge r1 = r4.dexKit     // Catch: java.lang.Throwable -> L60
            java.lang.String r2 = "/cgi-bin/mmpay-bin/transferoperation"
            java.lang.String[] r2 = new java.lang.String[]{r2}     // Catch: java.lang.Throwable -> L60
            ch.e r2 = r4.mkMethodUsingStrings(r2)     // Catch: java.lang.Throwable -> L60
            hh.p r1 = r1.findMethod(r2)     // Catch: java.lang.Throwable -> L60
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L60
        L7a:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L60
            if (r2 == 0) goto L9b
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L60
            hh.o r2 = (hh.o) r2     // Catch: java.lang.Throwable -> L60
            lh.d r2 = r2.p()     // Catch: java.lang.Throwable -> L7a
            java.lang.String r2 = r2.f8063g     // Catch: java.lang.Throwable -> L7a
            java.lang.ClassLoader r3 = r4.classLoader     // Catch: java.lang.Throwable -> L7a
            java.lang.Class r2 = h.Hchat.utils.KavaReflector.loadClass(r2, r3)     // Catch: java.lang.Throwable -> L7a
            boolean r3 = r4.isTransferOperationClass(r2)     // Catch: java.lang.Throwable -> L7a
            if (r3 != 0) goto L99
            goto L7a
        L99:
            r4.transferOperationClass = r2     // Catch: java.lang.Throwable -> L7a
        L9b:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L60
            r1.<init>()     // Catch: java.lang.Throwable -> L60
            r1.append(r0)     // Catch: java.lang.Throwable -> L60
            java.lang.Class<?> r0 = r4.transferOperationClass     // Catch: java.lang.Throwable -> L60
            if (r0 == 0) goto Lac
            java.lang.String r0 = r0.getName()     // Catch: java.lang.Throwable -> L60
            goto Lae
        Lac:
            java.lang.String r0 = "null"
        Lae:
            r1.append(r0)     // Catch: java.lang.Throwable -> L60
            java.lang.String r0 = r1.toString()     // Catch: java.lang.Throwable -> L60
            r4.logDetail(r0)     // Catch: java.lang.Throwable -> L60
            goto Lc3
        Lb9:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "[Hchat:DexFinder] resolveTransferOperationApi 失败: "
            r1.<init>(r2)
            bc.e.s(r0, r1, r0)
        Lc3:
            return
    }

    public void resolveTransferQueryApi() {
            r4 = this;
            java.lang.Class<?> r0 = r4.transferQueryClass     // Catch: java.lang.Throwable -> L14
            boolean r0 = r4.isTransferQueryClass(r0)     // Catch: java.lang.Throwable -> L14
            if (r0 == 0) goto L16
            java.lang.reflect.Method r0 = r4.transferQueryResponseMethod     // Catch: java.lang.Throwable -> L14
            java.lang.Class<?> r1 = r4.transferQueryClass     // Catch: java.lang.Throwable -> L14
            boolean r0 = r4.isTransferQueryResponseMethod(r0, r1)     // Catch: java.lang.Throwable -> L14
            if (r0 == 0) goto L16
            goto L8f
        L14:
            r0 = move-exception
            goto L85
        L16:
            org.luckypray.dexkit.DexKitBridge r0 = r4.dexKit     // Catch: java.lang.Throwable -> L14
            java.lang.String r1 = "Micromsg.NetSceneTenpayRemittanceQuery"
            java.lang.String r2 = "recv_account_info"
            java.lang.String r3 = "recv_channel"
            java.lang.String[] r1 = new java.lang.String[]{r1, r2, r3}     // Catch: java.lang.Throwable -> L14
            ch.c r1 = r4.mkClassUsingStrings(r1)     // Catch: java.lang.Throwable -> L14
            hh.j r0 = r0.findClass(r1)     // Catch: java.lang.Throwable -> L14
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L14
        L2e:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L14
            if (r1 == 0) goto L57
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L14
            hh.i r1 = (hh.i) r1     // Catch: java.lang.Throwable -> L14
            lh.a r1 = r1.p()     // Catch: java.lang.Throwable -> L2e
            java.lang.String r1 = r1.f8057g     // Catch: java.lang.Throwable -> L2e
            java.lang.ClassLoader r2 = r4.classLoader     // Catch: java.lang.Throwable -> L2e
            java.lang.Class r1 = h.Hchat.utils.KavaReflector.loadClass(r1, r2)     // Catch: java.lang.Throwable -> L2e
            java.lang.reflect.Method r2 = r4.findTransferQueryResponseMethod(r1)     // Catch: java.lang.Throwable -> L2e
            boolean r3 = r4.isTransferQueryClass(r1)     // Catch: java.lang.Throwable -> L2e
            if (r3 == 0) goto L2e
            if (r2 != 0) goto L53
            goto L2e
        L53:
            r4.transferQueryClass = r1     // Catch: java.lang.Throwable -> L2e
            r4.transferQueryResponseMethod = r2     // Catch: java.lang.Throwable -> L2e
        L57:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L14
            r0.<init>()     // Catch: java.lang.Throwable -> L14
            java.lang.String r1 = "转账查询类: "
            r0.append(r1)     // Catch: java.lang.Throwable -> L14
            java.lang.Class<?> r1 = r4.transferQueryClass     // Catch: java.lang.Throwable -> L14
            if (r1 == 0) goto L6a
            java.lang.String r1 = r1.getName()     // Catch: java.lang.Throwable -> L14
            goto L6c
        L6a:
            java.lang.String r1 = "null"
        L6c:
            r0.append(r1)     // Catch: java.lang.Throwable -> L14
            java.lang.String r1 = " response="
            r0.append(r1)     // Catch: java.lang.Throwable -> L14
            java.lang.reflect.Method r1 = r4.transferQueryResponseMethod     // Catch: java.lang.Throwable -> L14
            java.lang.String r1 = r4.methodName(r1)     // Catch: java.lang.Throwable -> L14
            r0.append(r1)     // Catch: java.lang.Throwable -> L14
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L14
            r4.logDetail(r0)     // Catch: java.lang.Throwable -> L14
            goto L8f
        L85:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "[Hchat:DexFinder] resolveTransferQueryApi 失败: "
            r1.<init>(r2)
            bc.e.s(r0, r1, r0)
        L8f:
            return
    }

    public void resolveUploadDeviceStepApi() {
            r6 = this;
            java.lang.String r0 = "NetSceneUploadDeviceStep"
            java.lang.String r1 = "MicroMsg.Sport.NetSceneUploadDeviceStep"
            java.lang.String r2 = "/cgi-bin/mmoc-bin/hardware/uploaddevicestep"
            java.lang.reflect.Constructor<?> r3 = r6.uploadDeviceStepCtor     // Catch: java.lang.Throwable -> L13
            if (r3 != 0) goto L15
            java.lang.Class<?> r3 = r6.uploadDeviceStepClass     // Catch: java.lang.Throwable -> L13
            java.lang.reflect.Constructor r3 = r6.findUploadDeviceStepCtor(r3)     // Catch: java.lang.Throwable -> L13
            r6.uploadDeviceStepCtor = r3     // Catch: java.lang.Throwable -> L13
            goto L15
        L13:
            r0 = move-exception
            goto L7a
        L15:
            java.lang.reflect.Constructor<?> r3 = r6.uploadDeviceStepCtor     // Catch: java.lang.Throwable -> L13
            if (r3 == 0) goto L1a
            return
        L1a:
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L13
            r3.<init>()     // Catch: java.lang.Throwable -> L13
            java.lang.String[] r4 = new java.lang.String[]{r2, r1}     // Catch: java.lang.Throwable -> L13
            java.lang.String[] r5 = new java.lang.String[]{r0}     // Catch: java.lang.Throwable -> L13
            java.lang.String[][] r4 = new java.lang.String[][]{r4, r5}     // Catch: java.lang.Throwable -> L13
            r5 = 20
            r6.collectSendTextClassCandidates(r3, r5, r4)     // Catch: java.lang.Throwable -> L13
            java.lang.String[] r1 = new java.lang.String[]{r2, r1}     // Catch: java.lang.Throwable -> L13
            java.lang.String[] r0 = new java.lang.String[]{r0}     // Catch: java.lang.Throwable -> L13
            java.lang.String[][] r0 = new java.lang.String[][]{r1, r0}     // Catch: java.lang.Throwable -> L13
            r6.collectSendTextMethodOwnerCandidates(r3, r5, r0)     // Catch: java.lang.Throwable -> L13
            java.util.Iterator r0 = r3.iterator()     // Catch: java.lang.Throwable -> L13
        L43:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L13
            if (r1 == 0) goto L5a
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L13
            java.lang.Class r1 = (java.lang.Class) r1     // Catch: java.lang.Throwable -> L13
            java.lang.reflect.Constructor r2 = r6.findUploadDeviceStepCtor(r1)     // Catch: java.lang.Throwable -> L13
            if (r2 != 0) goto L56
            goto L43
        L56:
            r6.uploadDeviceStepClass = r1     // Catch: java.lang.Throwable -> L13
            r6.uploadDeviceStepCtor = r2     // Catch: java.lang.Throwable -> L13
        L5a:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L13
            r0.<init>()     // Catch: java.lang.Throwable -> L13
            java.lang.String r1 = "上传步数API: "
            r0.append(r1)     // Catch: java.lang.Throwable -> L13
            java.lang.Class<?> r1 = r6.uploadDeviceStepClass     // Catch: java.lang.Throwable -> L13
            if (r1 == 0) goto L6d
            java.lang.String r1 = r1.getName()     // Catch: java.lang.Throwable -> L13
            goto L6f
        L6d:
            java.lang.String r1 = "null"
        L6f:
            r0.append(r1)     // Catch: java.lang.Throwable -> L13
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L13
            r6.logDetail(r0)     // Catch: java.lang.Throwable -> L13
            return
        L7a:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "[Hchat:DexFinder] resolveUploadDeviceStepApi 失败: "
            r1.<init>(r2)
            bc.e.s(r0, r1, r0)
            return
    }

    public void resolveVerifyUserApi() {
            r4 = this;
            java.lang.String r0 = "/cgi-bin/micromsg-bin/verifyuser"
            java.lang.Class<?> r1 = r4.verifyUserClass     // Catch: java.lang.Throwable -> L42
            boolean r1 = r4.isVerifyUserClass(r1)     // Catch: java.lang.Throwable -> L42
            if (r1 == 0) goto Lc
            goto La5
        Lc:
            org.luckypray.dexkit.DexKitBridge r1 = r4.dexKit     // Catch: java.lang.Throwable -> L42
            java.lang.String r2 = "MicroMsg.NetSceneVerifyUser.dkverify"
            java.lang.String[] r2 = new java.lang.String[]{r0, r2}     // Catch: java.lang.Throwable -> L42
            ch.c r2 = r4.mkClassUsingStrings(r2)     // Catch: java.lang.Throwable -> L42
            hh.j r1 = r1.findClass(r2)     // Catch: java.lang.Throwable -> L42
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L42
        L20:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L42
            if (r2 == 0) goto L44
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L42
            hh.i r2 = (hh.i) r2     // Catch: java.lang.Throwable -> L42
            lh.a r2 = r2.p()     // Catch: java.lang.Throwable -> L20
            java.lang.String r2 = r2.f8057g     // Catch: java.lang.Throwable -> L20
            java.lang.ClassLoader r3 = r4.classLoader     // Catch: java.lang.Throwable -> L20
            java.lang.Class r2 = h.Hchat.utils.KavaReflector.loadClass(r2, r3)     // Catch: java.lang.Throwable -> L20
            boolean r3 = r4.isVerifyUserClass(r2)     // Catch: java.lang.Throwable -> L20
            if (r3 != 0) goto L3f
            goto L20
        L3f:
            r4.verifyUserClass = r2     // Catch: java.lang.Throwable -> L20
            goto L44
        L42:
            r0 = move-exception
            goto L9b
        L44:
            java.lang.Class<?> r1 = r4.verifyUserClass     // Catch: java.lang.Throwable -> L42
            if (r1 != 0) goto L7b
            org.luckypray.dexkit.DexKitBridge r1 = r4.dexKit     // Catch: java.lang.Throwable -> L42
            java.lang.String[] r0 = new java.lang.String[]{r0}     // Catch: java.lang.Throwable -> L42
            ch.e r0 = r4.mkMethodUsingStrings(r0)     // Catch: java.lang.Throwable -> L42
            hh.p r0 = r1.findMethod(r0)     // Catch: java.lang.Throwable -> L42
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L42
        L5a:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L42
            if (r1 == 0) goto L7b
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L42
            hh.o r1 = (hh.o) r1     // Catch: java.lang.Throwable -> L42
            lh.d r1 = r1.p()     // Catch: java.lang.Throwable -> L5a
            java.lang.String r1 = r1.f8063g     // Catch: java.lang.Throwable -> L5a
            java.lang.ClassLoader r2 = r4.classLoader     // Catch: java.lang.Throwable -> L5a
            java.lang.Class r1 = h.Hchat.utils.KavaReflector.loadClass(r1, r2)     // Catch: java.lang.Throwable -> L5a
            boolean r2 = r4.isVerifyUserClass(r1)     // Catch: java.lang.Throwable -> L5a
            if (r2 != 0) goto L79
            goto L5a
        L79:
            r4.verifyUserClass = r1     // Catch: java.lang.Throwable -> L5a
        L7b:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L42
            r0.<init>()     // Catch: java.lang.Throwable -> L42
            java.lang.String r1 = "好友申请验证类: "
            r0.append(r1)     // Catch: java.lang.Throwable -> L42
            java.lang.Class<?> r1 = r4.verifyUserClass     // Catch: java.lang.Throwable -> L42
            if (r1 == 0) goto L8e
            java.lang.String r1 = r1.getName()     // Catch: java.lang.Throwable -> L42
            goto L90
        L8e:
            java.lang.String r1 = "null"
        L90:
            r0.append(r1)     // Catch: java.lang.Throwable -> L42
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L42
            r4.logDetail(r0)     // Catch: java.lang.Throwable -> L42
            goto La5
        L9b:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "[Hchat:DexFinder] resolveVerifyUserApi 失败: "
            r1.<init>(r2)
            bc.e.s(r0, r1, r0)
        La5:
            return
    }

    public void resolveVideoInfoApi() {
            r5 = this;
            java.lang.reflect.Method r0 = r5.videoInfoByFileNameMethod     // Catch: java.lang.Throwable -> L82
            java.lang.Class<?> r1 = r5.videoInfoClass     // Catch: java.lang.Throwable -> L82
            boolean r0 = r5.isVideoInfoByFileNameMethod(r0, r1)     // Catch: java.lang.Throwable -> L82
            if (r0 == 0) goto Lc
            goto Lb9
        Lc:
            r0 = 0
            r5.videoInfoByFileNameMethod = r0     // Catch: java.lang.Throwable -> L82
            java.lang.String r0 = "VideoInfo{fileName='"
            java.lang.String[] r0 = new java.lang.String[]{r0}     // Catch: java.lang.Throwable -> L82
            java.lang.Class r0 = r5.findFirstClassByStrings(r0)     // Catch: java.lang.Throwable -> L82
            r5.videoInfoClass = r0     // Catch: java.lang.Throwable -> L82
            if (r0 != 0) goto L1f
            goto Lb9
        L1f:
            ch.e r0 = new ch.e     // Catch: java.lang.Throwable -> L82
            r0.<init>()     // Catch: java.lang.Throwable -> L82
            fh.k r1 = new fh.k     // Catch: java.lang.Throwable -> L82
            r1.<init>()     // Catch: java.lang.Throwable -> L82
            java.lang.Class<java.lang.String> r2 = java.lang.String.class
            java.lang.Class[] r2 = new java.lang.Class[]{r2}     // Catch: java.lang.Throwable -> L82
            r1.n0(r2)     // Catch: java.lang.Throwable -> L82
            java.lang.Class<?> r2 = r5.videoInfoClass     // Catch: java.lang.Throwable -> L82
            java.lang.String r2 = r2.getName()     // Catch: java.lang.Throwable -> L82
            fh.k.q0(r1, r2)     // Catch: java.lang.Throwable -> L82
            r0.f1666h = r1     // Catch: java.lang.Throwable -> L82
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L82
            r1.<init>()     // Catch: java.lang.Throwable -> L82
            org.luckypray.dexkit.DexKitBridge r2 = r5.dexKit     // Catch: java.lang.Throwable -> L82
            hh.p r0 = r2.findMethod(r0)     // Catch: java.lang.Throwable -> L82
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L82
        L4c:
            boolean r2 = r0.hasNext()     // Catch: java.lang.Throwable -> L82
            if (r2 == 0) goto L84
            java.lang.Object r2 = r0.next()     // Catch: java.lang.Throwable -> L82
            hh.o r2 = (hh.o) r2     // Catch: java.lang.Throwable -> L82
            java.lang.ClassLoader r3 = r5.classLoader     // Catch: java.lang.Throwable -> L4c
            java.lang.reflect.Method r2 = r2.r(r3)     // Catch: java.lang.Throwable -> L4c
            java.lang.Class<?> r3 = r5.videoInfoClass     // Catch: java.lang.Throwable -> L4c
            boolean r3 = r5.isVideoInfoByFileNameMethod(r2, r3)     // Catch: java.lang.Throwable -> L4c
            if (r3 != 0) goto L67
            goto L4c
        L67:
            java.lang.Class r3 = r2.getDeclaringClass()     // Catch: java.lang.Throwable -> L4c
            java.lang.Class<?> r4 = r5.videoInfoClass     // Catch: java.lang.Throwable -> L4c
            boolean r3 = r5.samePackage(r3, r4)     // Catch: java.lang.Throwable -> L4c
            if (r3 != 0) goto L74
            goto L4c
        L74:
            java.lang.reflect.Method r2 = h.Hchat.utils.KavaReflector.accessible(r2)     // Catch: java.lang.Throwable -> L4c
            boolean r3 = r1.contains(r2)     // Catch: java.lang.Throwable -> L4c
            if (r3 != 0) goto L4c
            r1.add(r2)     // Catch: java.lang.Throwable -> L4c
            goto L4c
        L82:
            r0 = move-exception
            goto Laf
        L84:
            int r0 = r1.size()     // Catch: java.lang.Throwable -> L82
            r2 = 1
            if (r0 != r2) goto L94
            r0 = 0
            java.lang.Object r0 = r1.get(r0)     // Catch: java.lang.Throwable -> L82
            java.lang.reflect.Method r0 = (java.lang.reflect.Method) r0     // Catch: java.lang.Throwable -> L82
            r5.videoInfoByFileNameMethod = r0     // Catch: java.lang.Throwable -> L82
        L94:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L82
            r0.<init>()     // Catch: java.lang.Throwable -> L82
            java.lang.String r1 = "视频信息查询API: "
            r0.append(r1)     // Catch: java.lang.Throwable -> L82
            java.lang.reflect.Method r1 = r5.videoInfoByFileNameMethod     // Catch: java.lang.Throwable -> L82
            java.lang.String r1 = r5.methodName(r1)     // Catch: java.lang.Throwable -> L82
            r0.append(r1)     // Catch: java.lang.Throwable -> L82
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L82
            r5.logDetail(r0)     // Catch: java.lang.Throwable -> L82
            goto Lb9
        Laf:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "[Hchat:DexFinder] resolveVideoInfoApi 失败: "
            r1.<init>(r2)
            bc.e.s(r0, r1, r0)
        Lb9:
            return
    }

    public void resolveVideoPathApi() {
            r5 = this;
            java.lang.String r0 = ".mp4"
            java.lang.String r1 = "success restore file, from "
            java.lang.reflect.Method r2 = r5.videoPathMethod     // Catch: java.lang.Throwable -> L36
            boolean r2 = r5.isVideoPathMethod(r2)     // Catch: java.lang.Throwable -> L36
            r3 = 0
            if (r2 != 0) goto L5c
            r5.videoPathMethod = r3     // Catch: java.lang.Throwable -> L36
            org.luckypray.dexkit.DexKitBridge r2 = r5.dexKit     // Catch: java.lang.Throwable -> L36
            java.lang.String r4 = "MicroMsg.C2CVideoPathFeatureService"
            java.lang.String[] r4 = new java.lang.String[]{r4, r1, r0}     // Catch: java.lang.Throwable -> L36
            ch.e r4 = r5.mkMethodUsingStrings(r4)     // Catch: java.lang.Throwable -> L36
            hh.p r2 = r2.findMethod(r4)     // Catch: java.lang.Throwable -> L36
            boolean r4 = r2.isEmpty()     // Catch: java.lang.Throwable -> L36
            if (r4 == 0) goto L39
            org.luckypray.dexkit.DexKitBridge r2 = r5.dexKit     // Catch: java.lang.Throwable -> L36
            java.lang.String r4 = "MicroMsg.VideoInfoStorage"
            java.lang.String[] r0 = new java.lang.String[]{r4, r1, r0}     // Catch: java.lang.Throwable -> L36
            ch.e r0 = r5.mkMethodUsingStrings(r0)     // Catch: java.lang.Throwable -> L36
            hh.p r2 = r2.findMethod(r0)     // Catch: java.lang.Throwable -> L36
            goto L39
        L36:
            r0 = move-exception
            goto Laa
        L39:
            java.util.Iterator r0 = r2.iterator()     // Catch: java.lang.Throwable -> L36
        L3d:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L36
            if (r1 == 0) goto L5c
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L36
            hh.o r1 = (hh.o) r1     // Catch: java.lang.Throwable -> L36
            java.lang.ClassLoader r2 = r5.classLoader     // Catch: java.lang.Throwable -> L3d
            java.lang.reflect.Method r1 = r1.r(r2)     // Catch: java.lang.Throwable -> L3d
            boolean r2 = r5.isVideoPathMethod(r1)     // Catch: java.lang.Throwable -> L3d
            if (r2 != 0) goto L56
            goto L3d
        L56:
            java.lang.reflect.Method r1 = h.Hchat.utils.KavaReflector.accessible(r1)     // Catch: java.lang.Throwable -> L3d
            r5.videoPathMethod = r1     // Catch: java.lang.Throwable -> L3d
        L5c:
            java.lang.reflect.Method r0 = r5.videoPathMethod     // Catch: java.lang.Throwable -> L36
            if (r0 == 0) goto L65
            java.lang.Class r0 = r0.getDeclaringClass()     // Catch: java.lang.Throwable -> L36
            goto L66
        L65:
            r0 = r3
        L66:
            java.lang.reflect.Method r1 = r5.videoPathMethod     // Catch: java.lang.Throwable -> L36
            if (r1 == 0) goto L7f
            boolean r1 = h.Hchat.utils.KavaReflector.isStatic(r1)     // Catch: java.lang.Throwable -> L36
            if (r1 != 0) goto L7f
            java.lang.reflect.Method r1 = r5.videoPathOwnerGetterMethod     // Catch: java.lang.Throwable -> L36
            boolean r1 = r5.isVideoPathOwnerGetter(r1, r0)     // Catch: java.lang.Throwable -> L36
            if (r1 != 0) goto L81
            java.lang.reflect.Method r0 = r5.findVideoPathOwnerGetter(r0)     // Catch: java.lang.Throwable -> L36
            r5.videoPathOwnerGetterMethod = r0     // Catch: java.lang.Throwable -> L36
            goto L81
        L7f:
            r5.videoPathOwnerGetterMethod = r3     // Catch: java.lang.Throwable -> L36
        L81:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L36
            r0.<init>()     // Catch: java.lang.Throwable -> L36
            java.lang.String r1 = "视频消息路径API: path="
            r0.append(r1)     // Catch: java.lang.Throwable -> L36
            java.lang.reflect.Method r1 = r5.videoPathMethod     // Catch: java.lang.Throwable -> L36
            java.lang.String r1 = r5.methodName(r1)     // Catch: java.lang.Throwable -> L36
            r0.append(r1)     // Catch: java.lang.Throwable -> L36
            java.lang.String r1 = " owner="
            r0.append(r1)     // Catch: java.lang.Throwable -> L36
            java.lang.reflect.Method r1 = r5.videoPathOwnerGetterMethod     // Catch: java.lang.Throwable -> L36
            java.lang.String r1 = r5.methodName(r1)     // Catch: java.lang.Throwable -> L36
            r0.append(r1)     // Catch: java.lang.Throwable -> L36
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L36
            r5.logDetail(r0)     // Catch: java.lang.Throwable -> L36
            goto Lb4
        Laa:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "[Hchat:DexFinder] resolveVideoPathApi 失败: "
            r1.<init>(r2)
            bc.e.s(r0, r1, r0)
        Lb4:
            return
    }
}
