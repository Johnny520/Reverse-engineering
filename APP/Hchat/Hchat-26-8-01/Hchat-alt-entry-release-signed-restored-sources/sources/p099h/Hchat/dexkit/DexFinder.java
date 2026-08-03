package p099h.Hchat.dexkit;

import android.content.Context;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.os.Bundle;
import android.util.Pair;
import android.view.View;
import ch.C0568c;
import ch.C0570e;
import gh.C1429a;
import gh.C1431c;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import okhttp3.HttpUrl;
import org.luckypray.dexkit.DexKitBridge;
import p025bc.AbstractC0255e;
import p068eh.AbstractC0921a;
import p080fb.AbstractC1184v0;
import p086fh.C1243a;
import p086fh.C1252j;
import p086fh.C1253k;
import p086fh.C1254l;
import p099h.Hchat.utils.KavaReflector;
import p115hh.C1724i;
import p115hh.C1725j;
import p115hh.C1727l;
import p115hh.C1730o;
import p115hh.C1731p;
import p115hh.C1732q;
import p210o8.C3087k;
import p300ub.AbstractC4302b;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class DexFinder {
    private static final String CACHE_COMPLETE = "cache.complete";
    private static final String CACHE_KEY = "cache.key";
    private static final String CACHE_PREFS = "Hchat_dex_cache";
    private static final String TAG = "[Hchat:DexFinder]";
    private static final boolean VERBOSE = false;
    public Class<?> addChatroomMemberClass;
    public Constructor<?> addChatroomMemberCtor;
    public Class<?> addContactLabelClass;
    public Constructor<?> addContactLabelCtorList;
    public Constructor<?> addContactLabelCtorString;
    public List<Class<?>> addMsgClasses;
    public Method appMsgParseMethod;
    private final SharedPreferences cachePrefs;
    public Method chatFooterSendClickMethod;
    public Method chatPageFragmentEnterMethod;
    public Method chatPageFragmentExitMethod;
    public Method chatPageStartMethod;
    public Method chatroomMuteBuildMethod;
    public Method chatroomMuteServiceGetterMethod;
    public Method chatroomMuteSubmitMethod;
    private final ClassLoader classLoader;
    public Class<?> configStorageClass;
    public Method contactCardXmlMethod;
    public Method contactMuteDisableMethod;
    public Method contactMuteEnableMethod;
    public Method contactMuteStateMethod;
    public Method contactStorageGetterMethod;
    public Method contactStorageQueryMethod;
    public Method conversationDeleteMethod;
    public Class<?> coreStorageClass;
    public Method coreStorageGetter;
    public Class<?> delChatroomMemberClass;
    public Constructor<?> delChatroomMemberCtor;
    private final DexKitBridge dexKit;
    public Method emojiAccPathMethod;
    public Method emojiCheckGifMethod;
    public Method emojiCreateInfoMethod;
    public Method emojiDecodeDataMethod;
    public Method emojiDecodeManagerGetterMethod;
    public Method emojiFilePathMethod;
    public Method emojiGetByMd5Method;
    public Method emojiManagerSendMethod;
    public Method emojiSendMethod;
    public Method emojiUpdateInfoMethod;
    public List<Class<?>> fakePacketClasses;
    public Method favoriteGetMethod;
    public Class<?> favoriteItemClass;
    public Method favoriteItemConvertFromCursorMethod;
    public Method favoriteListCursorMethod;
    public Method favoriteListMethod;
    public Method favoriteListNextMethod;
    public Method favoriteSendMethod;
    public Class<?> favoriteSendParamClass;
    public Class<?> favoriteServiceClass;
    public Method favoriteServiceResolverMethod;
    public Method favoriteStorageGetterMethod;
    public List<Method> getContactAddMethods;
    public List<Method> getContactServiceGetters;
    public Method groupMemberDisplayNameMethod;
    public Class<?> groupSolitairePluginClass;
    public Method groupSolitaireSendMethod;
    public Method imageBestPathMethod;
    public Method imageCdnServiceGetterMethod;
    public Method imageCdnSubmitMethod;
    public Class<?> imageCdnTaskClass;
    public Method imageStorageGetterMethod;
    public Method imageTokenPathMethod;
    public Class<?> inviteChatroomMemberClass;
    public Constructor<?> inviteChatroomMemberCtor;
    public Class<?> localMessageClass;
    public Method localMessageCreateTimeMethod;
    public Constructor<?> localMessageCtor;
    public Method localMessageInsertMethod;
    public Method localSystemMessageMethod;
    public Class<?> marsCdnDownloadCallbackClass;
    public Class<?> marsCdnDownloadRequestClass;
    public Class<?> marsCdnManagerClass;
    public Method marsCdnStartDownloadMethod;
    public Method messageClearBatchMethod;
    public Method messageClearByTalkerMethod;
    public Class<?> mmKernelClass;
    public Class<?> modifyContactLabelListClass;
    public Constructor<?> modifyContactLabelListCtor;
    public List<Class<?>> netQueueCandidateClasses;
    public Class<?> netQueueClass;
    public Constructor<?> openCtor10;
    public Constructor<?> openCtor8;
    public Constructor<?> openCtor9;
    public Class<?> openLuckyMoneyClass;
    public Class<?> openLuckyMoneyUnionClass;
    public List<Class<?>> packetBaseClasses;
    public List<Class<?>> packetQueueClasses;
    public Method patCanSendMethod;
    public Method patCreatePairMethod;
    public Method patDisplayTemplateMethod;
    public Class<?> patExtensionClass;
    public Method patSuffixMethod;
    public Class<?> protobufCallbackClass;
    public Class<?> protobufConfigBuilderClass;
    public Class<?> protobufGenericRespClass;
    public Class<?> protobufNetSceneBaseClass;
    public Class<?> protobufNewSendMsgReqClass;
    public Class<?> protobufOnGYNetEndClass;
    public Class<?> protobufOplogReqClass;
    public Class<?> protobufRawReqClass;
    public Class<?> protobufReqRespClass;
    public List<Method> protobufSceneEndMethods;
    public Method protobufStaticDispatchMethod;
    public Constructor<?> receiveCtor;
    public Class<?> receiveLuckyMoneyClass;
    public Class<?> receiveLuckyMoneyUnionClass;
    private boolean resolvedAll;
    public Class<?> revokeMsgClass;
    public Constructor<?> revokeMsgCtor;
    private final String runtimeCacheKey;
    public Method sendFileAttachDirMethod;
    public Method sendFileAttachPathMethod;
    public Method sendFileMethod;
    public Class<?> sendImageAppInfoClass;
    public Class<?> sendImageAsyncParamsClass;
    public Method sendImageAsyncSubmitMethod;
    public Class<?> sendImageCrossParamsClass;
    public Method sendImageMethod;
    public Class<?> sendPatSceneClass;
    public Constructor<?> sendPatSceneCtor;
    public Class<?> sendTextMsgClass;
    public Constructor<?> sendTextMsgCtorLong;
    public Constructor<?> sendTextMsgCtorObject;
    public Method sendVideoMethod;
    public Class<?> sendVideoTaskClass;
    public Method sendXmlAppMsgMethod;
    public Method serviceGetterMethod;
    public Method snsAddImageMethod;
    public Method snsAddVideoMethod;
    public Method snsCommitMethod;
    public Method snsSetContentMethod;
    public Method snsSetSdkAppNameMethod;
    public Method snsSetSdkIdMethod;
    public Method snsShareAppMsgMethod;
    public Method snsUploadCheckMethod;
    public Class<?> snsUploadManagerClass;
    public Method snsUploadManagerGetterMethod;
    public Class<?> snsUploadPackHelperClass;
    public Class<?> sqliteDbWrapperClass;
    public Class<?> transferOperationClass;
    public Class<?> transferQueryClass;
    public Method transferQueryResponseMethod;
    public Constructor<?> unionOpenCtor10;
    public Constructor<?> unionOpenCtor9;
    public Constructor<?> unionReceiveCtor;
    public Class<?> uploadDeviceStepClass;
    public Constructor<?> uploadDeviceStepCtor;
    public Class<?> verifyUserClass;
    public Method videoInfoByFileNameMethod;
    private Class<?> videoInfoClass;
    public Method videoPathMethod;
    public Method videoPathOwnerGetterMethod;
    public Method voiceFinishRecordMethod;
    public Method voiceFullPathMethod;
    public Method voiceInfoQueryMethod;
    public Method voicePlaybackPauseMethod;
    public Method voicePlaybackResumeMethod;
    public Method voicePlaybackStartMethod;
    public Method voicePlaybackStopMethod;
    public Method voiceStartRecordMethod;
    public Constructor<?> voiceUploadCdnCtor;
    public Class<?> voiceUploadClass;
    public Constructor<?> voiceUploadCtor;
    public Class<?> wishWxHbClass;
    public Constructor<?> wishWxHbCtor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public DexFinder(DexKitBridge dexKitBridge, ClassLoader classLoader, Context context) {
        this.addMsgClasses = new ArrayList();
        this.netQueueCandidateClasses = new ArrayList();
        this.packetBaseClasses = new ArrayList();
        this.packetQueueClasses = new ArrayList();
        this.fakePacketClasses = new ArrayList();
        this.protobufSceneEndMethods = new ArrayList();
        this.getContactAddMethods = new ArrayList();
        this.getContactServiceGetters = new ArrayList();
        this.dexKit = dexKitBridge;
        this.classLoader = classLoader;
        this.cachePrefs = context != null ? AbstractC4302b.m8640c(context, CACHE_PREFS) : null;
        this.runtimeCacheKey = buildRuntimeCacheKey(context, classLoader);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private void addNetQueueCandidate(Class<?> cls) {
        if (cls == null || this.netQueueCandidateClasses.contains(cls)) {
            return;
        }
        this.netQueueCandidateClasses.add(cls);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private String buildRuntimeCacheKey(Context context, ClassLoader classLoader) {
        return C3087k.m6557a(context, classLoader).f8202h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private String className(Class<?> cls) {
        return cls != null ? cls.getName() : "null";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private void collectAppMsgLogicCandidates(List<Class<?>> list, int i9, String[][] strArr) {
        if (list == null || strArr == null) {
            return;
        }
        for (String[] strArr2 : strArr) {
            try {
                C1731p c1731pFindMethod = this.dexKit.findMethod(mkMethodUsingStrings(strArr2));
                int iMin = Math.min(c1731pFindMethod.size(), i9);
                for (int i10 = 0; i10 < iMin; i10++) {
                    try {
                        Class<?> clsLoadClass = KavaReflector.loadClass(((C1730o) c1731pFindMethod.get(i10)).m4348p().f8333g, this.classLoader);
                        if (findSendFileAppMsgMethod(clsLoadClass) != null && !list.contains(clsLoadClass)) {
                            list.add(clsLoadClass);
                        }
                    } catch (Throwable unused) {
                    }
                }
            } catch (Throwable unused2) {
            }
            if (!list.isEmpty()) {
                return;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private void collectClassCandidates(List<Class<?>> list, int i9, String[][] strArr) {
        if (list == null || strArr == null) {
            return;
        }
        for (String[] strArr2 : strArr) {
            try {
                C1725j c1725jFindClass = this.dexKit.findClass(mkClassUsingStrings(strArr2));
                int iMin = Math.min(c1725jFindClass.size(), i9);
                for (int i10 = 0; i10 < iMin; i10++) {
                    try {
                        Class<?> clsLoadClass = KavaReflector.loadClass(((C1724i) c1725jFindClass.get(i10)).m4345p().f8327g, this.classLoader);
                        if (!list.contains(clsLoadClass)) {
                            list.add(clsLoadClass);
                        }
                    } catch (Throwable unused) {
                    }
                }
            } catch (Throwable unused2) {
            }
            if (!list.isEmpty()) {
                return;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private void collectGetContactAddMethods(String str) {
        try {
            Iterator it = this.dexKit.findMethod(mkMethodUsingStrings(str)).iterator();
            while (it.hasNext()) {
                try {
                    Method methodM4350r = ((C1730o) it.next()).m4350r(this.classLoader);
                    if (isGetContactAddMethod(methodM4350r)) {
                        KavaReflector.accessible(methodM4350r);
                        if (!this.getContactAddMethods.contains(methodM4350r)) {
                            this.getContactAddMethods.add(methodM4350r);
                        }
                    }
                } catch (Throwable unused) {
                }
            }
        } catch (Throwable unused2) {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private void collectGetContactServiceGetters() {
        for (Method method : this.getContactAddMethods) {
            if (method != null) {
                collectServiceGettersForType(method.getDeclaringClass());
                for (Class<?> cls : method.getDeclaringClass().getInterfaces()) {
                    collectServiceGettersForType(cls);
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private void collectKnownNetworkQueueClasses() {
        String[] strArr = {"tk0.j1", "com.tencent.mm.kernel.h", "com.tencent.mm.kernel.g", "com.tencent.mm.model.bh", "com.tencent.mm.model.ak", "com.tencent.mm.model.az"};
        for (int i9 = 0; i9 < 6; i9++) {
            try {
                addNetQueueCandidate(KavaReflector.loadClass(strArr[i9], this.classLoader));
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private void collectMethodOwnerClass(List<C1730o> list, List<Class<?>> list2) {
        Iterator<C1730o> it = list.iterator();
        while (it.hasNext()) {
            try {
                Class<?> clsLoadClass = KavaReflector.loadClass(it.next().m4348p().f8333g, this.classLoader);
                if (!list2.contains(clsLoadClass)) {
                    list2.add(clsLoadClass);
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private void collectNetworkQueueClassesByAnchors() {
        String[][] strArr = {new String[]{"MicroMsg.NetSceneQueue"}, new String[]{"NetSceneQueue"}, new String[]{"doSceneImp start"}, new String[]{"doSceneImp mmcgi"}, new String[]{"On doscene  mmcgi"}, new String[]{"doscene mmcgi Failed"}, new String[]{"waitingQueue_size"}, new String[]{"MicroMsg.MMKernel"}, new String[]{"Kernel not initialized by MMApplication"}, new String[]{"Initialize kernel, create whole WeChat world"}, new String[]{"mCoreNetwork not initialized"}, new String[]{"MMKernel.CoreNetwork"}, new String[]{"MicroMsg.CoreNetwork"}, new String[]{"doSceneImp err"}, new String[]{"dispatcher is null"}};
        for (int i9 = 0; i9 < 15; i9++) {
            try {
                C1725j c1725jFindClass = this.dexKit.findClass(mkClassUsingStrings(strArr[i9]));
                int iMin = Math.min(c1725jFindClass.size(), 30);
                for (int i10 = 0; i10 < iMin; i10++) {
                    try {
                        addNetQueueCandidate(KavaReflector.loadClass(((C1724i) c1725jFindClass.get(i10)).m4345p().f8327g, this.classLoader));
                    } catch (Throwable unused) {
                    }
                }
            } catch (Throwable unused2) {
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private void collectSendTextClassCandidates(List<Class<?>> list, int i9, String[][] strArr) {
        if (list == null || strArr == null) {
            return;
        }
        for (String[] strArr2 : strArr) {
            try {
                C1725j c1725jFindClass = this.dexKit.findClass(mkClassUsingStrings(strArr2));
                int iMin = Math.min(c1725jFindClass.size(), i9);
                for (int i10 = 0; i10 < iMin; i10++) {
                    try {
                        Class<?> clsLoadClass = KavaReflector.loadClass(((C1724i) c1725jFindClass.get(i10)).m4345p().f8327g, this.classLoader);
                        if (!list.contains(clsLoadClass)) {
                            list.add(clsLoadClass);
                        }
                    } catch (Throwable unused) {
                    }
                }
            } catch (Throwable unused2) {
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private void collectSendTextMethodOwnerCandidates(List<Class<?>> list, int i9, String[][] strArr) {
        if (list == null || strArr == null) {
            return;
        }
        for (String[] strArr2 : strArr) {
            try {
                C1731p c1731pFindMethod = this.dexKit.findMethod(mkMethodUsingStrings(strArr2));
                int iMin = Math.min(c1731pFindMethod.size(), i9);
                for (int i10 = 0; i10 < iMin; i10++) {
                    try {
                        Class<?> clsLoadClass = KavaReflector.loadClass(((C1730o) c1731pFindMethod.get(i10)).m4348p().f8333g, this.classLoader);
                        if (!list.contains(clsLoadClass)) {
                            list.add(clsLoadClass);
                        }
                    } catch (Throwable unused) {
                    }
                }
            } catch (Throwable unused2) {
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private void collectServiceGettersForType(Class<?> cls) {
        if (cls == null || cls == Object.class) {
            return;
        }
        try {
            C0570e c0570e = new C0570e();
            C1253k c1253k = new C1253k();
            c1253k.m3370m0(0);
            c1253k.m3373p0(cls);
            c0570e.f1764h = c1253k;
            Iterator it = this.dexKit.findMethod(c0570e).iterator();
            while (it.hasNext()) {
                try {
                    Method methodM4350r = ((C1730o) it.next()).m4350r(this.classLoader);
                    if (isGetContactServiceGetter(methodM4350r, cls)) {
                        KavaReflector.accessible(methodM4350r);
                        if (!this.getContactServiceGetters.contains(methodM4350r)) {
                            this.getContactServiceGetters.add(methodM4350r);
                        }
                    }
                } catch (Throwable unused) {
                }
            }
        } catch (Throwable unused2) {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private Class<?> favoriteItemClassFromUsingFields(C1730o c1730o) {
        if (c1730o == null) {
            return null;
        }
        try {
            Iterator it = ((List) c1730o.f5759s.getValue()).iterator();
            while (it.hasNext()) {
                C1727l c1727l = ((C1732q) it.next()).f5760a;
                if ("field_favProto".equals(c1727l.m4347p().f8329h)) {
                    Class<?> clsLoadClass = KavaReflector.loadClass(c1727l.m4347p().f8328g, this.classLoader);
                    if (isFavoriteItemClass(clsLoadClass)) {
                        return clsLoadClass;
                    }
                }
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private Constructor<?> findAddChatroomMemberCtor(Class<?> cls) {
        if (cls == null) {
            return null;
        }
        for (Constructor<?> constructor : KavaReflector.declaredConstructors(cls)) {
            Class<?>[] parameterTypes = constructor.getParameterTypes();
            if (parameterTypes.length == 4 && parameterTypes[0] == String.class && List.class.isAssignableFrom(parameterTypes[1]) && parameterTypes[2] == String.class) {
                return KavaReflector.accessible(constructor);
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private Class<?> findConfigBuilderClass(Class<?> cls) {
        Class<?> clsLoadClass;
        if (cls == null) {
            return null;
        }
        try {
            C0568c c0568c = new C0568c();
            C1243a c1243a = new C1243a();
            c1243a.m3362o0("java.lang.Object");
            C1252j c1252j = c1243a.f4090i;
            if (c1252j == null) {
                c1252j = new C1252j(0);
            }
            c1243a.f4090i = c1252j;
            C1429a c1429a = new C1429a();
            c1429a.f4740g = 10;
            c1429a.f4741h = 80;
            c1252j.f4102i = c1429a;
            c1243a.m3358k0(cls);
            c1243a.m3358k0(cls);
            c1243a.m3358k0(String.class);
            c0568c.f1762h = c1243a;
            Iterator<E> it = this.dexKit.findClass(c0568c).iterator();
            while (it.hasNext()) {
                try {
                    clsLoadClass = KavaReflector.loadClass(((C1724i) it.next()).m4345p().f8327g, this.classLoader);
                } catch (Throwable unused) {
                }
                if (clsLoadClass != null && hasConfigBuilderShape(clsLoadClass, cls)) {
                    return clsLoadClass;
                }
            }
            return null;
        } catch (Throwable unused2) {
            return null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private Method findContactMuteStateMethod() {
        Method method = this.contactMuteEnableMethod;
        if (!isContactMuteMethod(method)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (C1730o c1730o : this.dexKit.findMethod(mkMethodUsingStrings("room_notify_new_msg"))) {
            if ("com.tencent.mm.ui.SingleChatInfoUI".equals(c1730o.m4348p().f8333g)) {
                Iterator<E> it = c1730o.m4349q().iterator();
                while (it.hasNext()) {
                    try {
                        Method methodM4350r = ((C1730o) it.next()).m4350r(this.classLoader);
                        if (isContactMuteStateMethod(methodM4350r, method) && !arrayList.contains(methodM4350r)) {
                            KavaReflector.accessible(methodM4350r);
                            arrayList.add(methodM4350r);
                        }
                    } catch (Throwable unused) {
                    }
                }
            }
        }
        if (arrayList.size() == 1) {
            return (Method) arrayList.get(0);
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private Constructor<?> findCtorByArgCount(Class<?> cls, int i9) {
        if (cls == null) {
            return null;
        }
        for (Constructor<?> constructor : KavaReflector.declaredConstructors(cls)) {
            if (constructor.getParameterTypes().length == i9) {
                return constructor;
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private Constructor<?> findCtorByExactTypes(Class<?> cls, Class<?>... clsArr) {
        if (cls != null && clsArr != null) {
            for (Constructor<?> constructor : KavaReflector.declaredConstructors(cls)) {
                Class<?>[] parameterTypes = constructor.getParameterTypes();
                if (parameterTypes.length == clsArr.length) {
                    for (int i9 = 0; i9 < parameterTypes.length; i9++) {
                        if (parameterTypes[i9] != clsArr[i9]) {
                            break;
                        }
                    }
                    return constructor;
                }
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private Constructor<?> findDelChatroomMemberCtor(Class<?> cls) {
        Class<?> cls2;
        if (cls == null) {
            return null;
        }
        for (Constructor<?> constructor : KavaReflector.declaredConstructors(cls)) {
            Class<?>[] parameterTypes = constructor.getParameterTypes();
            if (parameterTypes.length == 3 && parameterTypes[0] == String.class && List.class.isAssignableFrom(parameterTypes[1]) && ((cls2 = parameterTypes[2]) == Integer.TYPE || cls2 == Integer.class)) {
                return KavaReflector.accessible(constructor);
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private Method findEmojiDecodeManagerGetter(Class<?> cls) {
        if (cls == null) {
            return null;
        }
        for (Method method : KavaReflector.declaredMethods(cls)) {
            if (KavaReflector.isStatic(method) && method.getParameterTypes().length == 0 && method.getReturnType() == cls) {
                return method;
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private Method findFavoriteGetMethod(Class<?> cls) {
        if (cls != null && this.favoriteItemClass != null) {
            for (Method method : KavaReflector.declaredMethods(cls)) {
                if (isFavoriteGetMethod(method)) {
                    return method;
                }
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private Method findFavoriteItemConvertFromCursorMethod(Class<?> cls) {
        if (cls == null) {
            return null;
        }
        Method methodFindMethodRecursive = KavaReflector.findMethodRecursive(cls, "convertFrom", Cursor.class);
        if (isFavoriteItemConvertFromCursorMethod(methodFindMethodRecursive)) {
            KavaReflector.accessible(methodFindMethodRecursive);
            return methodFindMethodRecursive;
        }
        while (cls != null && cls != Object.class) {
            for (Method method : KavaReflector.declaredMethods(cls)) {
                if (isFavoriteItemConvertFromCursorMethod(method)) {
                    KavaReflector.accessible(method);
                    return method;
                }
            }
            cls = cls.getSuperclass();
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private Method findFavoriteListCursorMethod() {
        Iterator it = this.dexKit.findMethod(mkMethodUsingStrings("tryStartBatchGet...")).iterator();
        while (it.hasNext()) {
            try {
                Method methodM4350r = ((C1730o) it.next()).m4350r(this.classLoader);
                if (isFavoriteListCursorMethod(methodM4350r)) {
                    KavaReflector.accessible(methodM4350r);
                    return methodM4350r;
                }
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private Class<?> findFirstClassByStrings(String... strArr) {
        try {
            Iterator it = this.dexKit.findClass(mkClassUsingStrings(strArr)).iterator();
            while (it.hasNext()) {
                try {
                    return KavaReflector.loadClass(((C1724i) it.next()).m4345p().f8327g, this.classLoader);
                } catch (Throwable unused) {
                }
            }
            return null;
        } catch (Throwable unused2) {
            return null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private Constructor<?> findFirstCtorByArgCounts(Class<?> cls, int... iArr) {
        if (cls != null && iArr != null) {
            for (int i9 : iArr) {
                Constructor<?> constructorFindCtorByArgCount = findCtorByArgCount(cls, i9);
                if (constructorFindCtorByArgCount != null) {
                    return constructorFindCtorByArgCount;
                }
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private Class<?> findFirstLikelyQueueClass() {
        for (Class<?> cls : this.netQueueCandidateClasses) {
            if (hasLikelyQueueSendMethod(cls)) {
                return cls;
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private Class<?> findGenericRespClass() {
        Class<?> clsLoadClass;
        try {
            C0568c c0568c = new C0568c();
            C1243a c1243a = new C1243a();
            C1252j c1252j = c1243a.f4090i;
            if (c1252j == null) {
                c1252j = new C1252j(0);
            }
            c1243a.f4090i = c1252j;
            C1429a c1429a = new C1429a();
            c1429a.f4740g = 0;
            c1429a.f4741h = 1;
            c1252j.f4102i = c1429a;
            C1253k c1253k = new C1253k();
            c1253k.f4103g = new C1431c("<init>", 5);
            c1243a.m3359l0(c1253k);
            C1253k c1253k2 = new C1253k();
            c1253k2.f4103g = new C1431c("op", 5);
            c1253k2.m3372o0("int", "java.lang.Object[]");
            C1253k.m3366q0(c1253k2, "int");
            c1243a.m3359l0(c1253k2);
            c0568c.f1762h = c1243a;
            Iterator<E> it = this.dexKit.findClass(c0568c).iterator();
            while (it.hasNext()) {
                try {
                    clsLoadClass = KavaReflector.loadClass(((C1724i) it.next()).m4345p().f8327g, this.classLoader);
                } catch (Throwable unused) {
                }
                if (KavaReflector.findConstructor(clsLoadClass, new Class[0]) != null && KavaReflector.findMethod(clsLoadClass, "op", Integer.TYPE, Object[].class) != null) {
                    return clsLoadClass;
                }
            }
            return null;
        } catch (Throwable unused2) {
            return null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private Method findGroupSolitaireSendMethod(Class<?> cls) {
        Class<?> cls2;
        if (cls == null) {
            return null;
        }
        for (Method method : KavaReflector.declaredMethods(cls)) {
            Class<?>[] parameterTypes = method.getParameterTypes();
            if (parameterTypes.length == 6 && parameterTypes[0] == String.class && parameterTypes[1] == String.class && parameterTypes[2].getName().equals("jh2.a") && parameterTypes[3].getName().equals("jh2.a") && parameterTypes[4].getName().equals("jh2.a") && ((cls2 = parameterTypes[5]) == Boolean.TYPE || cls2 == Boolean.class)) {
                return KavaReflector.accessible(method);
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private Method findImageStorageGetter(Class<?> cls) {
        if (cls == null) {
            return null;
        }
        try {
            C0570e c0570e = new C0570e();
            C1253k c1253k = new C1253k();
            c1253k.m3370m0(0);
            C1253k.m3366q0(c1253k, cls.getName());
            c0570e.f1764h = c1253k;
            Iterator<E> it = this.dexKit.findMethod(c0570e).iterator();
            while (it.hasNext()) {
                try {
                    Method methodM4350r = ((C1730o) it.next()).m4350r(this.classLoader);
                    if (isImageStorageGetter(methodM4350r, cls)) {
                        return KavaReflector.accessible(methodM4350r);
                    }
                } catch (Throwable unused) {
                }
            }
            return null;
        } catch (Throwable unused2) {
            return null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0049, code lost:
    
        if (r12 == null) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004b, code lost:
    
        if (r12 == java.lang.Object.class) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004d, code lost:
    
        r0 = p099h.Hchat.utils.KavaReflector.declaredMethods(r12).iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0059, code lost:
    
        if (r0.hasNext() == false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005b, code lost:
    
        r7 = r0.next();
        r8 = r7.getParameterTypes();
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0066, code lost:
    
        if (r8.length != 2) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0068, code lost:
    
        r9 = r8[0];
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x006a, code lost:
    
        if (r9 == r3) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x006c, code lost:
    
        if (r9 != java.lang.Integer.class) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0070, code lost:
    
        if (r8[1] != java.lang.Object.class) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0076, code lost:
    
        return p099h.Hchat.utils.KavaReflector.accessible(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0077, code lost:
    
        r12 = r12.getSuperclass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x007c, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:?, code lost:
    
        return null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private Method findIndexedSetter(Class<?> cls) {
        Class<?> cls2;
        Class<?> superclass = cls;
        while (true) {
            Class<?> cls3 = Integer.TYPE;
            if (superclass == null || superclass == Object.class) {
                break;
            }
            for (Method method : KavaReflector.declaredMethods(superclass)) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length == 2 && ((cls2 = parameterTypes[0]) == cls3 || cls2 == Integer.class)) {
                    if (parameterTypes[1] == Object.class && "set".equals(method.getName())) {
                        return KavaReflector.accessible(method);
                    }
                }
            }
            superclass = superclass.getSuperclass();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private Constructor<?> findInviteChatroomMemberCtor(Class<?> cls) {
        Class<?> cls2;
        if (cls == null) {
            return null;
        }
        for (Constructor<?> constructor : KavaReflector.declaredConstructors(cls)) {
            Class<?>[] parameterTypes = constructor.getParameterTypes();
            if (parameterTypes.length == 4 && parameterTypes[0] == String.class && List.class.isAssignableFrom(parameterTypes[1]) && ((cls2 = parameterTypes[2]) == Integer.TYPE || cls2 == Integer.class)) {
                return KavaReflector.accessible(constructor);
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private Constructor<?> findLocalMessageConstructor(Class<?> cls) {
        Constructor<?> constructorFindCtorByExactTypes = findCtorByExactTypes(cls, new Class[0]);
        return constructorFindCtorByExactTypes != null ? constructorFindCtorByExactTypes : findCtorByExactTypes(cls, String.class);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private Method findLocalMessageCreateTimeMethod(Class<?> cls) {
        Method methodAccessible = null;
        if (cls == null) {
            return null;
        }
        for (Method method : KavaReflector.declaredMethods(cls)) {
            if (isLocalMessageCreateTimeMethod(method)) {
                if ("m".equals(method.getName())) {
                    return KavaReflector.accessible(method);
                }
                if (methodAccessible == null) {
                    methodAccessible = KavaReflector.accessible(method);
                }
            }
        }
        return methodAccessible;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private Method findMarsStartDownloadMethod(Class<?> cls, Class<?> cls2, Class<?> cls3) {
        if (cls != null && cls2 != null && cls3 != null) {
            for (Method method : cls.getDeclaredMethods()) {
                if ("startC2CDownload".equals(method.getName())) {
                    Class<?>[] parameterTypes = method.getParameterTypes();
                    if (parameterTypes.length == 2 && sameOrAssignable(parameterTypes[0], cls2) && sameOrAssignable(parameterTypes[1], cls3)) {
                        KavaReflector.accessible(method);
                        return method;
                    }
                }
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private Class<?> findNewSendMsgReqClass(Class<?> cls) {
        Class<?> clsLoadClass;
        Class<?> clsLoadClass2;
        Class<?> cls2 = this.protobufRawReqClass;
        Class<? super Object> superclass = cls2 != null ? cls2.getSuperclass() : null;
        if (superclass != null) {
            try {
                C0568c c0568c = new C0568c();
                C1243a c1243a = new C1243a();
                c1243a.m3362o0(superclass.getName());
                c1243a.m3361n0(2);
                c1243a.m3358k0(Integer.TYPE);
                c1243a.m3358k0(LinkedList.class);
                c0568c.f1762h = c1243a;
                Iterator<E> it = this.dexKit.findClass(c0568c).iterator();
                while (it.hasNext()) {
                    try {
                        clsLoadClass2 = KavaReflector.loadClass(((C1724i) it.next()).m4345p().f8327g, this.classLoader);
                    } catch (Throwable unused) {
                    }
                    if (clsLoadClass2 != null && hasParseFromMethod(clsLoadClass2)) {
                        return clsLoadClass2;
                    }
                }
            } catch (Throwable unused2) {
            }
            try {
                Iterator<E> it2 = this.dexKit.findClass(mkClassUsingStrings("/cgi-bin/micromsg-bin/newsendmsg")).iterator();
                while (it2.hasNext()) {
                    try {
                        clsLoadClass = KavaReflector.loadClass(((C1724i) it2.next()).m4345p().f8327g, this.classLoader);
                    } catch (Throwable unused3) {
                    }
                    if (clsLoadClass != null && cls.isAssignableFrom(clsLoadClass) && hasParseFromMethod(clsLoadClass)) {
                        return clsLoadClass;
                    }
                }
            } catch (Throwable unused4) {
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:21:0x0024 */
    private Class<?> findOnGYNetEndClass() {
        try {
            C0570e c0570e = new C0570e();
            C1253k c1253k = new C1253k();
            c1253k.f4103g = new C1431c("onGYNetEnd", 5);
            c1253k.m3370m0(6);
            c0570e.f1764h = c1253k;
            Iterator<E> it = this.dexKit.findMethod(c0570e).iterator();
            while (it.hasNext()) {
                try {
                    Method methodM4350r = ((C1730o) it.next()).m4350r(this.classLoader);
                    if (isOnGYNetEndMethod(methodM4350r)) {
                        return methodM4350r.getDeclaringClass();
                    }
                    continue;
                } catch (Throwable unused) {
                }
            }
            return null;
        } catch (Throwable unused2) {
            return null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private Class<?> findOplogReqClass(Class<?> cls) {
        Class<?> clsLoadClass;
        Class<?> cls2 = Integer.TYPE;
        if (cls == null) {
            return null;
        }
        try {
            C0568c c0568c = new C0568c();
            C1243a c1243a = new C1243a();
            c1243a.m3362o0(cls.getName());
            c1243a.m3364q0("/cgi-bin/micromsg-bin/oplog");
            c1243a.m3361n0(1);
            C1253k c1253k = new C1253k();
            c1253k.f4103g = new C1431c("op", 5);
            c1253k.m3372o0("int", "java.lang.Object[]");
            c1243a.m3359l0(c1253k);
            c0568c.f1762h = c1243a;
            Iterator<E> it = this.dexKit.findClass(c0568c).iterator();
            while (it.hasNext()) {
                try {
                    clsLoadClass = KavaReflector.loadClass(((C1724i) it.next()).m4345p().f8327g, this.classLoader);
                } catch (Throwable unused) {
                }
                if (clsLoadClass != null && cls.isAssignableFrom(clsLoadClass)) {
                    return clsLoadClass;
                }
            }
        } catch (Throwable unused2) {
        }
        try {
            C0568c c0568c2 = new C0568c();
            C1243a c1243a2 = new C1243a();
            C1254l c1254l = new C1254l();
            C1253k c1253k2 = new C1253k();
            c1253k2.f4103g = new C1431c("getFuncId", 5);
            c1253k2.m3373p0(cls2);
            c1253k2.m3375s0(681);
            c1254l.m3377k0(c1253k2);
            C1253k c1253k3 = new C1253k();
            c1253k3.f4103g = new C1431c("toProtoBuf", 5);
            c1253k3.m3373p0(byte[].class);
            c1254l.m3377k0(c1253k3);
            c1243a2.f4091j = c1254l;
            c0568c2.f1762h = c1243a2;
            Iterator<E> it2 = this.dexKit.findClass(c0568c2).iterator();
            while (it2.hasNext()) {
                try {
                    Iterator<Field> it3 = KavaReflector.declaredFields(KavaReflector.loadClass(((C1724i) it2.next()).m4345p().f8327g, this.classLoader)).iterator();
                    while (it3.hasNext()) {
                        Class<?> type = it3.next().getType();
                        if (type != null && type != cls2 && type != Integer.class && cls.isAssignableFrom(type)) {
                            return type;
                        }
                    }
                } catch (Throwable unused3) {
                }
            }
            return null;
        } catch (Throwable unused4) {
            return null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private Method findPatCanSendMethod(Class<?> cls) {
        if (cls == null) {
            return null;
        }
        for (Method method : KavaReflector.declaredMethods(cls)) {
            if (isPatCanSendMethod(method)) {
                return KavaReflector.accessible(method);
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private Method findPatCanSendMethodByStrings(String... strArr) {
        try {
            Iterator it = this.dexKit.findMethod(mkMethodUsingStrings(strArr)).iterator();
            while (it.hasNext()) {
                try {
                    Method methodM4350r = ((C1730o) it.next()).m4350r(this.classLoader);
                    if (isPatCanSendMethod(methodM4350r)) {
                        return KavaReflector.accessible(methodM4350r);
                    }
                } catch (Throwable unused) {
                }
            }
            return null;
        } catch (Throwable unused2) {
            return null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private Method findPatCreatePairMethod(Class<?> cls) {
        if (cls == null) {
            return null;
        }
        for (Method method : KavaReflector.declaredMethods(cls)) {
            if (isPatCreatePairMethod(method)) {
                return KavaReflector.accessible(method);
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private Method findPatCreatePairMethodByStrings(String... strArr) {
        try {
            Iterator it = this.dexKit.findMethod(mkMethodUsingStrings(strArr)).iterator();
            while (it.hasNext()) {
                try {
                    Method methodM4350r = ((C1730o) it.next()).m4350r(this.classLoader);
                    if (isPatCreatePairMethod(methodM4350r)) {
                        return KavaReflector.accessible(methodM4350r);
                    }
                } catch (Throwable unused) {
                }
            }
            return null;
        } catch (Throwable unused2) {
            return null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private Method findPatSuffixMethod(Class<?> cls) {
        if (cls == null) {
            return null;
        }
        for (Method method : KavaReflector.declaredMethods(cls)) {
            if (isPatSuffixMethod(method)) {
                return KavaReflector.accessible(method);
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private Method findPatSuffixMethodByStrings(String... strArr) {
        try {
            Iterator it = this.dexKit.findMethod(mkMethodUsingStrings(strArr)).iterator();
            while (it.hasNext()) {
                try {
                    Method methodM4350r = ((C1730o) it.next()).m4350r(this.classLoader);
                    if (isPatSuffixMethod(methodM4350r)) {
                        return KavaReflector.accessible(methodM4350r);
                    }
                } catch (Throwable unused) {
                }
            }
            return null;
        } catch (Throwable unused2) {
            return null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private Class<?> findProtobufBaseClass() {
        Class<?> clsLoadClass;
        try {
            C0568c c0568c = new C0568c();
            C1243a c1243a = new C1243a();
            c1243a.m3363p0("Cannot use this method");
            C1254l c1254l = new C1254l();
            C1253k c1253k = new C1253k();
            c1253k.f4103g = new C1431c("op", 5);
            c1253k.m3372o0("int", "java.lang.Object[]");
            c1254l.m3377k0(c1253k);
            c1243a.f4091j = c1254l;
            c0568c.f1762h = c1243a;
            Iterator<E> it = this.dexKit.findClass(c0568c).iterator();
            while (it.hasNext()) {
                try {
                    clsLoadClass = KavaReflector.loadClass(((C1724i) it.next()).m4345p().f8327g, this.classLoader);
                } catch (Throwable unused) {
                }
                if (clsLoadClass != null) {
                    return clsLoadClass;
                }
            }
            return null;
        } catch (Throwable unused2) {
            return null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private Class<?> findProtobufNetSceneBaseClass() {
        Class<?> clsLoadClass;
        try {
            Iterator<E> it = this.dexKit.findClass(mkClassUsingStrings("MicroMsg.NetSceneBase")).iterator();
            while (it.hasNext()) {
                try {
                    clsLoadClass = KavaReflector.loadClass(((C1724i) it.next()).m4345p().f8327g, this.classLoader);
                } catch (Throwable unused) {
                }
                if (isProtobufNetSceneBaseClass(clsLoadClass)) {
                    return clsLoadClass;
                }
            }
        } catch (Throwable unused2) {
        }
        List<Class<?>> list = this.packetBaseClasses;
        if (list == null || list.isEmpty()) {
            return null;
        }
        return this.packetBaseClasses.get(0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private List<Method> findProtobufSceneEndMethods() {
        ArrayList arrayList = new ArrayList();
        if (this.protobufNetSceneBaseClass != null) {
            try {
                C0570e c0570e = new C0570e();
                C1253k c1253k = new C1253k();
                c1253k.f4103g = new C1431c("onSceneEnd", 5);
                c1253k.m3370m0(4);
                c0570e.f1764h = c1253k;
                Iterator<E> it = this.dexKit.findMethod(c0570e).iterator();
                while (it.hasNext()) {
                    try {
                        Method methodM4350r = ((C1730o) it.next()).m4350r(this.classLoader);
                        if (isProtobufSceneEndMethod(methodM4350r) && !arrayList.contains(methodM4350r)) {
                            arrayList.add(KavaReflector.accessible(methodM4350r));
                        }
                    } catch (Throwable unused) {
                    }
                }
            } catch (Throwable unused2) {
            }
        }
        return arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private Class<?> findRawReqClass() {
        Class<?> clsLoadClass;
        try {
            C0568c c0568c = new C0568c();
            C1243a c1243a = new C1243a();
            c1243a.m3361n0(1);
            c1243a.m3358k0(byte[].class);
            C1253k c1253k = new C1253k();
            c1253k.f4103g = new C1431c("<init>", 5);
            c1253k.m3372o0("byte[]");
            c1243a.m3359l0(c1253k);
            C1253k c1253k2 = new C1253k();
            c1253k2.f4103g = new C1431c("toByteArray", 5);
            C1253k.m3366q0(c1253k2, "byte[]");
            c1243a.m3359l0(c1253k2);
            c0568c.f1762h = c1243a;
            Iterator<E> it = this.dexKit.findClass(c0568c).iterator();
            while (it.hasNext()) {
                try {
                    clsLoadClass = KavaReflector.loadClass(((C1724i) it.next()).m4345p().f8327g, this.classLoader);
                } catch (Throwable unused) {
                }
                if (KavaReflector.findConstructor(clsLoadClass, byte[].class) != null && KavaReflector.findMethod(clsLoadClass, "toByteArray", new Class[0]) != null) {
                    return clsLoadClass;
                }
            }
            return null;
        } catch (Throwable unused2) {
            return null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private Class<?> findReqRespClassFromConfigBuilder() {
        Class<?> returnType;
        Class<?> cls = this.protobufConfigBuilderClass;
        if (cls == null) {
            return null;
        }
        for (Method method : KavaReflector.declaredMethods(cls)) {
            try {
                if (method.getParameterTypes().length == 0 && (returnType = method.getReturnType()) != null && returnType != Void.TYPE && !returnType.isPrimitive() && returnType != String.class && hasReqRespShape(returnType)) {
                    return returnType;
                }
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private Constructor<?> findRevokeMsgCtor(Class<?> cls) {
        if (cls != null && this.localMessageClass != null) {
            for (Constructor<?> constructor : KavaReflector.declaredConstructors(cls)) {
                Class<?>[] parameterTypes = constructor.getParameterTypes();
                if (parameterTypes.length == 3 && (parameterTypes[0].isAssignableFrom(this.localMessageClass) || this.localMessageClass.isAssignableFrom(parameterTypes[0]))) {
                    if (parameterTypes[1] == String.class && parameterTypes[2] == String.class) {
                        return KavaReflector.accessible(constructor);
                    }
                }
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private Method findSendFileAppMsgMethod(Class<?> cls) {
        if (cls == null) {
            return null;
        }
        try {
            for (Method method : KavaReflector.declaredMethods(cls)) {
                if (isSendFileAppMsgMethod(method)) {
                    return method;
                }
            }
        } catch (Throwable unused) {
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private Class<?> findSendImageAppInfoClass() {
        Class<?> clsLoadClass;
        Class<?> clsFindSendImageAppInfoClassFromCrossParams = findSendImageAppInfoClassFromCrossParams();
        if (clsFindSendImageAppInfoClassFromCrossParams != null) {
            return clsFindSendImageAppInfoClassFromCrossParams;
        }
        try {
            Iterator it = this.dexKit.findClass(mkClassUsingStrings("appid", "mediatagname", "messageext", "messageaction", "appinfo")).iterator();
            while (it.hasNext()) {
                try {
                    clsLoadClass = KavaReflector.loadClass(((C1724i) it.next()).m4345p().f8327g, this.classLoader);
                } catch (Throwable unused) {
                }
                if (isSendImageAppInfoClass(clsLoadClass)) {
                    return clsLoadClass;
                }
            }
            return null;
        } catch (Throwable unused2) {
            return null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private Class<?> findSendImageAppInfoClassFromCrossParams() {
        if (this.sendImageCrossParamsClass == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<Field> it = KavaReflector.declaredFields(this.sendImageCrossParamsClass).iterator();
        while (it.hasNext()) {
            Class<?> type = it.next().getType();
            if (type != null && !type.isPrimitive() && type != String.class && type != Object.class && !type.getName().startsWith("java.")) {
                if (hasDirectImageAppInfoFields(type)) {
                    return type;
                }
                if (isSendImageAppInfoClass(type)) {
                    arrayList.add(type);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return (Class) arrayList.get(0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private Constructor<?> findSendImageAsyncParamsCtor(Class<?> cls) {
        Class<?> cls2;
        Class<?> cls3;
        if (cls == null) {
            return null;
        }
        for (Constructor<?> constructor : KavaReflector.declaredConstructors(cls)) {
            Class<?>[] parameterTypes = constructor.getParameterTypes();
            if (parameterTypes.length == 5 && parameterTypes[0] == String.class && ((cls2 = parameterTypes[1]) == Integer.TYPE || cls2 == Integer.class)) {
                if (parameterTypes[2] == String.class && parameterTypes[3] == String.class && (cls3 = parameterTypes[4]) != null && !cls3.isPrimitive()) {
                    return KavaReflector.accessible(constructor);
                }
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private Method findSendImageAsyncSubmitMethod() {
        Class<?> cls = this.sendImageAsyncParamsClass;
        if (cls != null) {
            try {
                C0570e c0570e = new C0570e();
                C1253k c1253k = new C1253k();
                c1253k.m3372o0(cls.getName());
                c0570e.f1764h = c1253k;
                Iterator it = this.dexKit.findMethod(c0570e).iterator();
                Method method = null;
                while (it.hasNext()) {
                    try {
                        Method methodM4350r = ((C1730o) it.next()).m4350r(this.classLoader);
                        if (isSendImageAsyncSubmitMethod(methodM4350r)) {
                            KavaReflector.accessible(methodM4350r);
                            if (isKotlinFlowReturn(methodM4350r)) {
                                return methodM4350r;
                            }
                            if (method == null) {
                                method = methodM4350r;
                            }
                        }
                    } catch (Throwable unused) {
                    }
                }
                return method;
            } catch (Throwable unused2) {
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private Constructor<?> findSendPatSceneCtor(Class<?> cls) {
        if (cls == null) {
            return null;
        }
        Constructor<?> constructorFindCtorByExactTypes = findCtorByExactTypes(cls, Pair.class, String.class, String.class, Integer.TYPE);
        return constructorFindCtorByExactTypes != null ? constructorFindCtorByExactTypes : findCtorByExactTypes(cls, Pair.class, String.class, String.class, Integer.class);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private Method findSnsAddImageMethod(Class<?> cls) {
        Class<?> cls2 = Boolean.TYPE;
        if (cls == null) {
            return null;
        }
        try {
            Iterator it = this.dexKit.findMethod(mkMethodUsingStrings("addImageMediaObjByPath")).iterator();
            while (it.hasNext()) {
                try {
                    Method methodM4350r = ((C1730o) it.next()).m4350r(this.classLoader);
                    if (methodM4350r.getDeclaringClass() == cls && methodM4350r.getReturnType() == cls2) {
                        Class<?>[] parameterTypes = methodM4350r.getParameterTypes();
                        if (parameterTypes.length == 2 && parameterTypes[0] == String.class && parameterTypes[1] == String.class) {
                            return KavaReflector.accessible(methodM4350r);
                        }
                    }
                } catch (Throwable unused) {
                }
            }
        } catch (Throwable unused2) {
        }
        for (Method method : KavaReflector.declaredMethods(cls)) {
            if (method.getReturnType() == cls2) {
                Class<?>[] parameterTypes2 = method.getParameterTypes();
                if (parameterTypes2.length == 2 && parameterTypes2[0] == String.class && parameterTypes2[1] == String.class) {
                    return KavaReflector.accessible(method);
                }
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private Method findSnsAddVideoMethod(Class<?> cls) {
        Class<?> cls2 = Boolean.TYPE;
        if (cls == null) {
            return null;
        }
        try {
            Iterator it = this.dexKit.findMethod(mkMethodUsingStrings("addSightObjectByPath")).iterator();
            while (it.hasNext()) {
                try {
                    Method methodM4350r = ((C1730o) it.next()).m4350r(this.classLoader);
                    if (methodM4350r.getDeclaringClass() == cls && methodM4350r.getReturnType() == cls2) {
                        Class<?>[] parameterTypes = methodM4350r.getParameterTypes();
                        if (parameterTypes.length == 4 && parameterTypes[0] == String.class && parameterTypes[1] == String.class && parameterTypes[2] == String.class && parameterTypes[3] == String.class) {
                            return KavaReflector.accessible(methodM4350r);
                        }
                    }
                } catch (Throwable unused) {
                }
            }
        } catch (Throwable unused2) {
        }
        try {
            Iterator it2 = this.dexKit.findMethod(mkMethodUsingStrings("produceSightByPath")).iterator();
            while (it2.hasNext()) {
                try {
                    Method methodM4350r2 = ((C1730o) it2.next()).m4350r(this.classLoader);
                    if (methodM4350r2.getDeclaringClass() == cls && methodM4350r2.getReturnType() == cls2) {
                        Class<?>[] parameterTypes2 = methodM4350r2.getParameterTypes();
                        if (parameterTypes2.length == 4 && parameterTypes2[0] == String.class && parameterTypes2[1] == String.class && parameterTypes2[2] == String.class && parameterTypes2[3] == String.class) {
                            return KavaReflector.accessible(methodM4350r2);
                        }
                    }
                } catch (Throwable unused3) {
                }
            }
        } catch (Throwable unused4) {
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private Method findSnsCommitMethod(Class<?> cls) {
        if (cls == null) {
            return null;
        }
        try {
            Iterator it = this.dexKit.findMethod(mkMethodUsingStrings("commit sns info ret %d")).iterator();
            while (it.hasNext()) {
                try {
                    Method methodM4350r = ((C1730o) it.next()).m4350r(this.classLoader);
                    if (methodM4350r.getDeclaringClass() == cls && isIntClass(methodM4350r.getReturnType()) && methodM4350r.getParameterTypes().length == 0) {
                        return KavaReflector.accessible(methodM4350r);
                    }
                } catch (Throwable unused) {
                }
            }
        } catch (Throwable unused2) {
        }
        for (Method method : KavaReflector.declaredMethods(cls)) {
            if (method.getParameterTypes().length == 0 && isIntClass(method.getReturnType())) {
                return KavaReflector.accessible(method);
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private Method findSnsHelperChainMethod(String str) {
        if (this.snsUploadPackHelperClass == null) {
            return null;
        }
        try {
            Iterator it = this.dexKit.findMethod(mkMethodUsingStrings(str)).iterator();
            while (it.hasNext()) {
                try {
                    Method methodM4350r = ((C1730o) it.next()).m4350r(this.classLoader);
                    if (methodM4350r.getDeclaringClass() == this.snsUploadPackHelperClass && methodM4350r.getReturnType() == this.snsUploadPackHelperClass) {
                        Class<?>[] parameterTypes = methodM4350r.getParameterTypes();
                        if (parameterTypes.length == 1 && parameterTypes[0] == String.class) {
                            return KavaReflector.accessible(methodM4350r);
                        }
                    }
                } catch (Throwable unused) {
                }
            }
        } catch (Throwable unused2) {
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private Method findSnsShareAppMsgMethod(Class<?> cls) {
        if (cls == null) {
            return null;
        }
        for (Method method : KavaReflector.declaredMethods(cls)) {
            if (isSnsShareAppMsgMethod(method)) {
                return KavaReflector.accessible(method);
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private Method findSnsUploadCheckMethod(Class<?> cls) {
        Class<?> cls2 = Void.TYPE;
        if (cls == null) {
            return null;
        }
        try {
            Iterator it = this.dexKit.findMethod(mkMethodUsingStrings("checkPostInUI")).iterator();
            while (it.hasNext()) {
                try {
                    Method methodM4350r = ((C1730o) it.next()).m4350r(this.classLoader);
                    if (methodM4350r.getDeclaringClass() == cls && methodM4350r.getReturnType() == cls2 && methodM4350r.getParameterTypes().length == 0) {
                        return KavaReflector.accessible(methodM4350r);
                    }
                } catch (Throwable unused) {
                }
            }
        } catch (Throwable unused2) {
        }
        for (Method method : KavaReflector.declaredMethods(cls)) {
            if (method.getReturnType() == cls2 && method.getParameterTypes().length == 0) {
                return KavaReflector.accessible(method);
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private Method findSnsUploadManagerGetter(Class<?> cls) {
        if (cls == null) {
            return null;
        }
        try {
            Iterator it = this.dexKit.findMethod(mkMethodUsingStrings("getSnsUploadManager")).iterator();
            while (it.hasNext()) {
                try {
                    Method methodM4350r = ((C1730o) it.next()).m4350r(this.classLoader);
                    if (KavaReflector.isStatic(methodM4350r) && methodM4350r.getParameterTypes().length == 0 && methodM4350r.getReturnType() == cls) {
                        return KavaReflector.accessible(methodM4350r);
                    }
                } catch (Throwable unused) {
                }
            }
        } catch (Throwable unused2) {
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private Method findStaticDispatch(Class<?> cls, Class<?> cls2) {
        Class<?> cls3 = Boolean.TYPE;
        if (cls == null || cls2 == null) {
            return null;
        }
        Method methodFindStaticDispatchByName = findStaticDispatchByName(cls, cls2);
        if (methodFindStaticDispatchByName != null) {
            return methodFindStaticDispatchByName;
        }
        try {
            C0570e c0570e = new C0570e();
            C1253k c1253k = new C1253k();
            c1253k.m3370m0(3);
            c1253k.m3368k0(cls);
            c1253k.m3368k0(cls2);
            c1253k.m3368k0(cls3);
            c0570e.f1764h = c1253k;
            Iterator<E> it = this.dexKit.findMethod(c0570e).iterator();
            while (it.hasNext()) {
                try {
                    Method methodM4350r = ((C1730o) it.next()).m4350r(this.classLoader);
                    Class<?>[] parameterTypes = methodM4350r.getParameterTypes();
                    if (KavaReflector.isStatic(methodM4350r) && parameterTypes != null && parameterTypes.length == 3 && parameterTypes[0] == cls && parameterTypes[1] == cls2 && parameterTypes[2] == cls3) {
                        return KavaReflector.accessible(methodM4350r);
                    }
                } catch (Throwable unused) {
                }
            }
            return null;
        } catch (Throwable unused2) {
            return null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private Method findStaticDispatchByName(Class<?> cls, Class<?> cls2) {
        try {
            C0570e c0570e = new C0570e();
            C1253k c1253k = new C1253k();
            c1253k.f4103g = new C1431c("d", 5);
            c1253k.m3370m0(3);
            c0570e.f1764h = c1253k;
            Iterator<E> it = this.dexKit.findMethod(c0570e).iterator();
            while (it.hasNext()) {
                try {
                    Method methodM4350r = ((C1730o) it.next()).m4350r(this.classLoader);
                    if (isProtobufStaticDispatch(methodM4350r, cls, cls2)) {
                        return KavaReflector.accessible(methodM4350r);
                    }
                    continue;
                } catch (Throwable unused) {
                }
            }
            return null;
        } catch (Throwable unused2) {
            return null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private Method findTransferQueryResponseMethod(Class<?> cls) {
        if (cls == null) {
            return null;
        }
        for (Method method : KavaReflector.declaredMethods(cls)) {
            if (isTransferQueryResponseMethod(method, cls)) {
                return method;
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private Method findUniqueMethodUsingString(String str) {
        ArrayList arrayList = new ArrayList();
        Iterator<E> it = this.dexKit.findMethod(mkMethodUsingStrings(str)).iterator();
        while (it.hasNext()) {
            try {
                Method methodM4350r = ((C1730o) it.next()).m4350r(this.classLoader);
                if (!arrayList.contains(methodM4350r) && isContactMuteMethod(methodM4350r)) {
                    KavaReflector.accessible(methodM4350r);
                    arrayList.add(methodM4350r);
                }
            } catch (Throwable unused) {
            }
        }
        if (arrayList.size() == 1) {
            return (Method) arrayList.get(0);
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private Constructor<?> findUploadDeviceStepCtor(Class<?> cls) {
        if (cls == null) {
            return null;
        }
        for (Constructor<?> constructor : KavaReflector.declaredConstructors(cls)) {
            Class<?>[] parameterTypes = constructor.getParameterTypes();
            if (parameterTypes.length == 7 && parameterTypes[0] == String.class && parameterTypes[1] == String.class) {
                Class<?> cls2 = parameterTypes[2];
                Class<?> cls3 = Integer.TYPE;
                if (cls2 == cls3 && parameterTypes[3] == cls3 && parameterTypes[4] == cls3 && parameterTypes[5] == String.class && parameterTypes[6] == cls3) {
                    return KavaReflector.accessible(constructor);
                }
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private Method findVideoPathOwnerGetter(Class<?> cls) {
        if (cls == null) {
            return null;
        }
        try {
            C0570e c0570e = new C0570e();
            C1253k c1253k = new C1253k();
            c1253k.m3370m0(0);
            C1253k.m3366q0(c1253k, cls.getName());
            c0570e.f1764h = c1253k;
            Iterator<E> it = this.dexKit.findMethod(c0570e).iterator();
            while (it.hasNext()) {
                try {
                    Method methodM4350r = ((C1730o) it.next()).m4350r(this.classLoader);
                    if (isVideoPathOwnerGetter(methodM4350r, cls)) {
                        return KavaReflector.accessible(methodM4350r);
                    }
                } catch (Throwable unused) {
                }
            }
            return null;
        } catch (Throwable unused2) {
            return null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private Method findVoiceInfoQueryMethod() {
        ArrayList arrayList = new ArrayList();
        try {
            C0570e c0570e = new C0570e();
            C1253k c1253k = new C1253k();
            c1253k.m3371n0(String.class);
            List arrayList2 = c1253k.f4107k;
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
            }
            c1253k.f4107k = arrayList2;
            arrayList2.add(new C1431c("voiceinfo WHERE FileName= ?", 1));
            c0570e.f1764h = c1253k;
            for (C1730o c1730o : this.dexKit.findMethod(c0570e)) {
                try {
                    Method methodM4350r = c1730o.m4350r(this.classLoader);
                    if (isVoiceInfoStorageQueryMethod(methodM4350r)) {
                        Iterator<E> it = ((C1731p) c1730o.f5756p.getValue()).iterator();
                        while (it.hasNext()) {
                            try {
                                Method methodM4350r2 = ((C1730o) it.next()).m4350r(this.classLoader);
                                if (isVoiceInfoQueryMethod(methodM4350r2, methodM4350r.getReturnType())) {
                                    KavaReflector.accessible(methodM4350r2);
                                    if (!arrayList.contains(methodM4350r2)) {
                                        arrayList.add(methodM4350r2);
                                    }
                                }
                            } catch (Throwable unused) {
                            }
                        }
                    }
                } catch (Throwable unused2) {
                }
            }
        } catch (Throwable unused3) {
        }
        if (arrayList.size() == 1) {
            return (Method) arrayList.get(0);
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private Method findVoicePlaybackMethod(Class<?> cls, String str, Class<?> cls2, Class<?>... clsArr) {
        try {
            Iterator<E> it = this.dexKit.findMethod(mkMethodUsingStrings(str)).iterator();
            while (it.hasNext()) {
                try {
                    Method methodM4350r = ((C1730o) it.next()).m4350r(this.classLoader);
                    if (isExactInstanceMethod(methodM4350r, cls != null ? cls : methodM4350r.getDeclaringClass(), cls2, clsArr)) {
                        return KavaReflector.accessible(methodM4350r);
                    }
                } catch (Throwable unused) {
                }
            }
            return null;
        } catch (Throwable unused2) {
            return null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean hasConfigBuilderShape(Class<?> cls, Class<?> cls2) {
        boolean z9;
        if (cls != null && cls2 != null) {
            Iterator<Field> it = KavaReflector.declaredFields(cls).iterator();
            int i9 = 0;
            int i10 = 0;
            int i11 = 0;
            while (it.hasNext()) {
                Class<?> type = it.next().getType();
                if (cls2.isAssignableFrom(type)) {
                    i9++;
                }
                if (type == String.class) {
                    i10++;
                }
                if (type == Integer.TYPE || type == Integer.class) {
                    i11++;
                }
            }
            Iterator<Method> it2 = KavaReflector.declaredMethods(cls).iterator();
            while (true) {
                if (!it2.hasNext()) {
                    z9 = false;
                    break;
                }
                Method next = it2.next();
                if (next.getParameterTypes().length == 0 && next.getReturnType() != Void.TYPE) {
                    z9 = true;
                    break;
                }
            }
            if (i9 >= 2 && i10 >= 1 && i11 >= 3 && z9) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean hasDirectImageAppInfoFields(Class<?> cls) {
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        for (Field field : KavaReflector.declaredFields(cls)) {
            if (!KavaReflector.isStatic(field)) {
                Class<?> type = field.getType();
                if (type == String.class) {
                    i9++;
                } else if (type == Integer.TYPE || type == Integer.class) {
                    i10++;
                } else if (type == Long.TYPE || type == Long.class) {
                    i11++;
                } else if (!type.isPrimitive()) {
                    i12++;
                }
            }
        }
        return i9 == 5 && i10 == 1 && i11 == 1 && i12 == 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean hasLikelyQueueSendMethod(Class<?> cls) {
        Class<?>[] parameterTypes;
        Class<?> returnType;
        Class<?> cls2;
        if (cls == null) {
            return false;
        }
        try {
            for (Method method : KavaReflector.declaredMethods(cls)) {
                String name = method.getName();
                if (!"equals".equals(name) && !"hashCode".equals(name) && !"toString".equals(name) && !"wait".equals(name) && !"notify".equals(name) && !"notifyAll".equals(name) && !"cancel".equals(name) && (parameterTypes = method.getParameterTypes()) != null && (parameterTypes.length == 1 || parameterTypes.length == 2)) {
                    int length = parameterTypes.length;
                    Class<?> cls3 = Integer.TYPE;
                    if (length != 2 || (cls2 = parameterTypes[1]) == cls3 || cls2 == Integer.class) {
                        Class<?> cls4 = parameterTypes[0];
                        if (cls4 != null && !cls4.isPrimitive() && cls4 != String.class && cls4 != Object.class && ((returnType = method.getReturnType()) == Boolean.TYPE || returnType == Boolean.class || returnType == cls3 || returnType == Integer.class || returnType == Void.TYPE)) {
                            return true;
                        }
                    }
                }
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean hasParseFromMethod(Class<?> cls) {
        return KavaReflector.findMethodRecursive(cls, "parseFrom", byte[].class) != null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean hasReqRespShape(Class<?> cls) {
        if (cls == null) {
            return false;
        }
        boolean z9 = false;
        boolean z10 = false;
        boolean z11 = false;
        boolean z12 = false;
        for (Method method : KavaReflector.declaredMethods(cls)) {
            if (method.getParameterTypes().length == 0) {
                if ("getType".equals(method.getName()) && method.getReturnType() == Integer.TYPE) {
                    z9 = true;
                }
                if ("getUri".equals(method.getName()) && method.getReturnType() == String.class) {
                    z10 = true;
                }
                boolean zEquals = "getReqObj".equals(method.getName());
                Class<?> cls2 = Void.TYPE;
                if (zEquals && method.getReturnType() != cls2) {
                    z11 = true;
                }
                if ("getRespObj".equals(method.getName()) && method.getReturnType() != cls2) {
                    z12 = true;
                }
            }
        }
        return z9 && z10 && z11 && z12;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean hasTransferOperationCtor(Class<?> cls) {
        Class<?> cls2;
        Class<?> cls3;
        Class<?> cls4;
        if (cls == null) {
            return false;
        }
        Iterator<Constructor<?>> it = KavaReflector.declaredConstructors(cls).iterator();
        while (it.hasNext()) {
            Class<?>[] parameterTypes = it.next().getParameterTypes();
            if (parameterTypes.length == 9 || parameterTypes.length == 10 || parameterTypes.length == 12 || parameterTypes.length == 13 || parameterTypes.length == 14) {
                if (parameterTypes.length >= 6 && parameterTypes[0] == String.class && parameterTypes[1] == String.class && ((cls2 = parameterTypes[2]) == (cls3 = Integer.TYPE) || cls2 == Integer.class)) {
                    if (parameterTypes[3] == String.class && parameterTypes[4] == String.class && ((cls4 = parameterTypes[5]) == cls3 || cls4 == Integer.class)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean hasVerifyUserCtor(Class<?> cls) {
        if (cls == null) {
            return false;
        }
        Iterator<Constructor<?>> it = KavaReflector.declaredConstructors(cls).iterator();
        while (it.hasNext()) {
            Class<?>[] parameterTypes = it.next().getParameterTypes();
            if (parameterTypes.length == 4 && isIntClass(parameterTypes[0]) && parameterTypes[1] == String.class && parameterTypes[2] == String.class && isIntClass(parameterTypes[3])) {
                return true;
            }
            if (parameterTypes.length == 6 && isIntClass(parameterTypes[0]) && parameterTypes[1] == String.class && parameterTypes[2] == String.class && isIntClass(parameterTypes[3]) && parameterTypes[4] == String.class && isIntClass(parameterTypes[5])) {
                return true;
            }
            if (parameterTypes.length == 8 && isIntClass(parameterTypes[0]) && parameterTypes[1] == String.class && parameterTypes[2] == String.class && isIntClass(parameterTypes[3]) && parameterTypes[4] == String.class && isIntClass(parameterTypes[5]) && List.class.isAssignableFrom(parameterTypes[6])) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean isAppMsgParseMethod(Method method, Class<?> cls) {
        if (method == null || cls == null || !KavaReflector.isStatic(method) || method.getReturnType() != cls) {
            return false;
        }
        Class<?>[] parameterTypes = method.getParameterTypes();
        return parameterTypes.length == 1 && parameterTypes[0] == String.class;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean isCacheUsable() {
        List<Class<?>> list = this.addMsgClasses;
        return (list == null || list.isEmpty() || this.receiveLuckyMoneyClass == null || this.openLuckyMoneyClass == null || this.netQueueClass == null || this.sendTextMsgClass == null || this.sqliteDbWrapperClass == null || this.chatPageStartMethod == null || this.chatPageFragmentEnterMethod == null) ? false : true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean isChatFooterSendClickMethod(Method method) {
        Class<?> declaringClass;
        if (method == null || !"onClick".equals(method.getName()) || method.getReturnType() != Void.TYPE) {
            return false;
        }
        Class<?>[] parameterTypes = method.getParameterTypes();
        if (parameterTypes.length != 1 || parameterTypes[0] != View.class || (declaringClass = method.getDeclaringClass()) == null) {
            return false;
        }
        if (!"com.tencent.mm.pluginsdk.ui.chat".equals(declaringClass.getPackage() != null ? declaringClass.getPackage().getName() : HttpUrl.FRAGMENT_ENCODE_SET)) {
            return false;
        }
        Iterator<Field> it = KavaReflector.declaredFields(declaringClass).iterator();
        while (it.hasNext()) {
            Class<?> type = it.next().getType();
            if (type != null && "com.tencent.mm.pluginsdk.ui.chat.ChatFooter".equals(type.getName())) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean isChatPageStartMethod(Method method) {
        Class<?> cls;
        if (method != null && method.getReturnType() == Void.TYPE) {
            Class<?>[] parameterTypes = method.getParameterTypes();
            if (parameterTypes.length == 3 && parameterTypes[0] == String.class && parameterTypes[1] == Bundle.class && ((cls = parameterTypes[2]) == Boolean.TYPE || cls == Boolean.class)) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean isChatroomMuteApiReady() {
        return isChatroomMuteBuildMethod(this.chatroomMuteBuildMethod) && isChatroomMuteServiceGetterMethod(this.chatroomMuteServiceGetterMethod, this.chatroomMuteBuildMethod) && isChatroomMuteSubmitMethod(this.chatroomMuteSubmitMethod, this.chatroomMuteBuildMethod);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean isChatroomMuteBuildMethod(Method method) {
        if (method != null && !KavaReflector.isStatic(method) && method.getReturnType() != Void.TYPE && !method.getReturnType().isPrimitive() && method.getReturnType().getName().startsWith("com.tencent.mm.roomsdk.model.factory.")) {
            Class<?>[] parameterTypes = method.getParameterTypes();
            if ((parameterTypes.length == 2 || parameterTypes.length == 3) && parameterTypes[0] == String.class) {
                Class<?> cls = parameterTypes[1];
                Class<?> cls2 = Integer.TYPE;
                if (cls == cls2 && (parameterTypes.length == 2 || parameterTypes[2] == cls2)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean isChatroomMuteServiceGetterMethod(Method method, Method method2) {
        if (method != null && method2 != null && !KavaReflector.isStatic(method)) {
            Class<?>[] parameterTypes = method.getParameterTypes();
            if (parameterTypes.length == 1 && parameterTypes[0] == String.class && method.getReturnType() == method2.getDeclaringClass()) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean isChatroomMuteSubmitMethod(Method method, Method method2) {
        return method != null && method2 != null && !KavaReflector.isStatic(method) && method.getReturnType() == Void.TYPE && method.getParameterTypes().length == 0 && method.getDeclaringClass().isAssignableFrom(method2.getReturnType());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean isContactCardXmlMethod(Method method) {
        if (method == null || !KavaReflector.isStatic(method) || method.getReturnType() != String.class) {
            return false;
        }
        Class<?>[] parameterTypes = method.getParameterTypes();
        return parameterTypes.length == 2 && parameterTypes[0] == String.class && !parameterTypes[1].isPrimitive();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean isContactMuteMethod(Method method) {
        if (method != null && KavaReflector.isStatic(method) && method.getReturnType() == Void.TYPE) {
            Class<?>[] parameterTypes = method.getParameterTypes();
            if (parameterTypes.length == 2 && !parameterTypes[0].isPrimitive() && parameterTypes[1] == Boolean.TYPE) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean isContactMuteStateMethod(Method method, Method method2) {
        if (method != null && isContactMuteMethod(method2) && KavaReflector.isStatic(method) && method.getReturnType() == Boolean.TYPE && method.getDeclaringClass() == method2.getDeclaringClass()) {
            Class<?>[] parameterTypes = method.getParameterTypes();
            if (parameterTypes.length == 1 && parameterTypes[0] == method2.getParameterTypes()[0]) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean isContactStorageGetterMethod(Method method, Method method2) {
        Class<?> returnType;
        return (method == null || method2 == null || KavaReflector.isStatic(method) || method.getParameterTypes().length != 0 || (returnType = method.getReturnType()) == Void.TYPE || returnType.isPrimitive() || !method2.getDeclaringClass().isAssignableFrom(returnType)) ? false : true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean isContactStorageLookupApiReady() {
        if (isContactMuteMethod(this.contactMuteEnableMethod)) {
            return isContactStorageQueryMethod(this.contactStorageQueryMethod, this.contactMuteEnableMethod.getParameterTypes()[0]) && isContactStorageGetterMethod(this.contactStorageGetterMethod, this.contactStorageQueryMethod);
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean isContactStorageQueryMethod(Method method, Class<?> cls) {
        if (method != null && cls != null && !KavaReflector.isStatic(method) && method.getReturnType() == cls) {
            Class<?>[] parameterTypes = method.getParameterTypes();
            if (parameterTypes.length == 2 && parameterTypes[0] == String.class && parameterTypes[1] == Boolean.TYPE) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean isConversationDeleteMethod(Method method) {
        if (method != null && !KavaReflector.isStatic(method) && method.getReturnType() == Void.TYPE) {
            Class<?> declaringClass = method.getDeclaringClass();
            Class<?>[] parameterTypes = method.getParameterTypes();
            if (declaringClass != null && declaringClass.getName().startsWith("com.tencent.mm.storage.") && parameterTypes.length == 1 && parameterTypes[0] == String.class) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean isEmojiCreateInfoMethod(Method method) {
        Class<?> cls;
        Class<?> cls2;
        Class<?> cls3;
        Class<?> cls4;
        if (method != null && isEmojiInfoClass(method.getReturnType())) {
            Class<?>[] parameterTypes = method.getParameterTypes();
            if (parameterTypes.length == 4 && parameterTypes[0] == String.class && (((cls = parameterTypes[1]) == (cls2 = Integer.TYPE) || cls == Integer.class) && (((cls3 = parameterTypes[2]) == cls2 || cls3 == Integer.class) && ((cls4 = parameterTypes[3]) == cls2 || cls4 == Integer.class)))) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean isEmojiDecodeDataMethod(Method method) {
        if (method != null && !KavaReflector.isStatic(method) && method.getReturnType() == byte[].class) {
            Class<?>[] parameterTypes = method.getParameterTypes();
            if (parameterTypes.length == 1 && "com.tencent.mm.api.IEmojiInfo".equals(parameterTypes[0].getName())) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean isEmojiFilePathMethod(Method method) {
        if (method != null && method.getReturnType() == String.class) {
            Class<?>[] parameterTypes = method.getParameterTypes();
            if (KavaReflector.isStatic(method) && parameterTypes.length == 3 && parameterTypes[0] == String.class && parameterTypes[1] == String.class && parameterTypes[2] == String.class) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean isEmojiGetByMd5Method(Method method) {
        if (method != null && isEmojiInfoClass(method.getReturnType())) {
            Class<?>[] parameterTypes = method.getParameterTypes();
            if (parameterTypes.length == 1 && parameterTypes[0] == String.class) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean isEmojiInfoClass(Class<?> cls) {
        return cls != null && "com.tencent.mm.storage.emotion.EmojiInfo".equals(cls.getName());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean isEmojiManagerSendMethod(Method method) {
        Class<?> cls;
        if (method != null && method.getReturnType() == Boolean.TYPE) {
            Class<?>[] parameterTypes = method.getParameterTypes();
            if (parameterTypes.length == 5 && Context.class.isAssignableFrom(parameterTypes[0]) && parameterTypes[1] == String.class && parameterTypes[2] == String.class && "com.tencent.mm.plugin.msg.MsgIdTalker".equals(parameterTypes[3].getName()) && ((cls = parameterTypes[4]) == Integer.TYPE || cls == Integer.class)) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean isEmojiSendMethod(Method method) {
        if (method != null && method.getReturnType() == Void.TYPE) {
            Class<?>[] parameterTypes = method.getParameterTypes();
            if (parameterTypes.length >= 4 && parameterTypes[0] == String.class && isEmojiInfoClass(parameterTypes[1])) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean isEmojiUpdateInfoMethod(Method method) {
        if (method != null && method.getReturnType() == Void.TYPE) {
            Class<?>[] parameterTypes = method.getParameterTypes();
            if (parameterTypes.length == 1 && isEmojiInfoClass(parameterTypes[0])) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean isExactInstanceMethod(Method method, Class<?> cls, Class<?> cls2, Class<?>... clsArr) {
        return method != null && cls != null && method.getDeclaringClass() == cls && !KavaReflector.isStatic(method) && method.getReturnType() == cls2 && Arrays.equals(method.getParameterTypes(), clsArr);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean isFavoriteGetMethod(Method method) {
        Class<?> cls;
        if (method != null && !Modifier.isStatic(method.getModifiers())) {
            Class<?>[] parameterTypes = method.getParameterTypes();
            if (parameterTypes.length == 1 && parameterTypes[0] == Long.TYPE && (cls = this.favoriteItemClass) != null && cls.isAssignableFrom(method.getReturnType())) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean isFavoriteItemClass(Class<?> cls) {
        return (cls == null || KavaReflector.findFieldRecursive(cls, "field_localId") == null || KavaReflector.findFieldRecursive(cls, "field_type") == null || KavaReflector.findFieldRecursive(cls, "field_favProto") == null || KavaReflector.findConstructor(cls, new Class[0]) == null || findFavoriteItemConvertFromCursorMethod(cls) == null) ? false : true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean isFavoriteItemConvertFromCursorMethod(Method method) {
        if (method != null && method.getReturnType() == Void.TYPE) {
            Class<?>[] parameterTypes = method.getParameterTypes();
            if (parameterTypes.length == 1 && Cursor.class.isAssignableFrom(parameterTypes[0])) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean isFavoriteListCursorMethod(Method method) {
        if (method != null && Modifier.isStatic(method.getModifiers())) {
            Class<?>[] parameterTypes = method.getParameterTypes();
            Class<?> returnType = method.getReturnType();
            Class<?> cls = Long.TYPE;
            if (returnType == cls && parameterTypes.length == 3 && parameterTypes[0] == cls) {
                Class<?> cls2 = parameterTypes[1];
                Class<?> cls3 = Integer.TYPE;
                if (cls2 == cls3 && parameterTypes[2] == cls3) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean isFavoriteListMethod(Method method) {
        if (method != null && !Modifier.isStatic(method.getModifiers())) {
            Class<?>[] parameterTypes = method.getParameterTypes();
            if (List.class.isAssignableFrom(method.getReturnType()) && parameterTypes.length == 5) {
                Class<?> cls = parameterTypes[0];
                Class<?> cls2 = Integer.TYPE;
                if (cls == cls2 && parameterTypes[1] == cls2 && List.class.isAssignableFrom(parameterTypes[2]) && Set.class.isAssignableFrom(parameterTypes[3])) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean isFavoriteListNextMethod(Method method) {
        if (method != null && !Modifier.isStatic(method.getModifiers())) {
            Class<?>[] parameterTypes = method.getParameterTypes();
            if (List.class.isAssignableFrom(method.getReturnType()) && parameterTypes.length == 5 && parameterTypes[0] == Long.TYPE && parameterTypes[1] == Integer.TYPE && List.class.isAssignableFrom(parameterTypes[2]) && Set.class.isAssignableFrom(parameterTypes[3])) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean isFavoriteSendMethod(Method method) {
        if (method != null && KavaReflector.isStatic(method) && method.getReturnType() == Void.TYPE) {
            Class<?>[] parameterTypes = method.getParameterTypes();
            if (parameterTypes.length == 3) {
                return Context.class.isAssignableFrom(parameterTypes[0]) && isFavoriteSendParamClass(parameterTypes[1]) && Runnable.class.isAssignableFrom(parameterTypes[2]);
            }
            if (parameterTypes.length == 5 && Context.class.isAssignableFrom(parameterTypes[0]) && parameterTypes[1] == String.class && parameterTypes[2] == String.class && List.class.isAssignableFrom(parameterTypes[3]) && Runnable.class.isAssignableFrom(parameterTypes[4])) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean isFavoriteSendParamClass(Class<?> cls) {
        if (cls != null && !cls.isPrimitive()) {
            boolean z9 = false;
            boolean z10 = false;
            for (Field field : KavaReflector.declaredFields(cls)) {
                if (field.getType() == String.class) {
                    z9 = true;
                }
                if (List.class.isAssignableFrom(field.getType())) {
                    z10 = true;
                }
            }
            if (z9 && z10) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean isFavoriteServiceResolverMethod(Method method) {
        if (method != null && Modifier.isStatic(method.getModifiers())) {
            Class<?>[] parameterTypes = method.getParameterTypes();
            if (parameterTypes.length == 1 && parameterTypes[0] == Class.class && method.getReturnType() != Void.TYPE) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean isFavoriteStorageGetterMethod(Method method) {
        return (method == null || Modifier.isStatic(method.getModifiers()) || method.getParameterTypes().length != 0 || method.getReturnType() == Void.TYPE || method.getReturnType().isPrimitive()) ? false : true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean isGetContactAddMethod(Method method) {
        Class<?>[] parameterTypes;
        Class<?> cls;
        if (method == null || method.getReturnType() != Void.TYPE || (parameterTypes = method.getParameterTypes()) == null) {
            return false;
        }
        return parameterTypes.length == 2 ? parameterTypes[0] == String.class && parameterTypes[1] == String.class : parameterTypes.length == 3 && parameterTypes[0] == String.class && parameterTypes[1] == String.class && ((cls = parameterTypes[2]) == Integer.TYPE || cls == Integer.class);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean isGetContactServiceGetter(Method method, Class<?> cls) {
        return method != null && cls != null && KavaReflector.isStatic(method) && method.getParameterTypes().length == 0 && cls.isAssignableFrom(method.getReturnType());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean isImageBestPathMethod(Method method) {
        if (method != null && !KavaReflector.isStatic(method) && method.getReturnType() == String.class) {
            Class<?>[] parameterTypes = method.getParameterTypes();
            if (parameterTypes.length == 1 && parameterTypes[0].getName().startsWith("com.tencent.mm.storage.")) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean isImageCdnServiceGetterMethod(Method method) {
        return method != null && this.imageCdnSubmitMethod != null && KavaReflector.isStatic(method) && method.getParameterTypes().length == 0 && method.getReturnType() == this.imageCdnSubmitMethod.getDeclaringClass();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean isImageCdnSubmitMethod(Method method) {
        Class<?> cls;
        if (method == null || this.imageCdnTaskClass == null) {
            return false;
        }
        Class<?>[] parameterTypes = method.getParameterTypes();
        if (parameterTypes.length != 1 && parameterTypes.length != 2) {
            return false;
        }
        if (!parameterTypes[0].isAssignableFrom(this.imageCdnTaskClass) && !this.imageCdnTaskClass.isAssignableFrom(parameterTypes[0])) {
            return false;
        }
        int length = parameterTypes.length;
        Class<?> cls2 = Integer.TYPE;
        if (length == 2 && (cls = parameterTypes[1]) != cls2 && cls != Integer.class) {
            return false;
        }
        Class<?> returnType = method.getReturnType();
        return returnType == Boolean.TYPE || returnType == Boolean.class || returnType == cls2 || returnType == Integer.class || returnType == this.imageCdnTaskClass || returnType == Void.TYPE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean isImageCdnTaskClass(Class<?> cls) {
        return (cls == null || KavaReflector.findFieldRecursive(cls, "field_mediaId") == null || KavaReflector.findFieldRecursive(cls, "field_fileId") == null || KavaReflector.findFieldRecursive(cls, "field_aesKey") == null || KavaReflector.findFieldRecursive(cls, "field_fullpath") == null || KavaReflector.findFieldRecursive(cls, "field_fileType") == null) ? false : true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean isImageStorageGetter(Method method, Class<?> cls) {
        return method != null && cls != null && KavaReflector.isStatic(method) && method.getParameterTypes().length == 0 && method.getReturnType() == cls;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean isImageTokenPathMethod(Method method) {
        Class<?> cls;
        if (method != null && !KavaReflector.isStatic(method) && method.getReturnType() == String.class) {
            Class<?>[] parameterTypes = method.getParameterTypes();
            if (parameterTypes.length == 2 && parameterTypes[0] == String.class && ((cls = parameterTypes[1]) == Boolean.TYPE || cls == Boolean.class)) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean isIntClass(Class<?> cls) {
        return cls == Integer.TYPE || cls == Integer.class;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean isKotlinFlowReturn(Method method) {
        return (method == null || method.getReturnType() == null || !method.getReturnType().getName().startsWith("kotlinx.coroutines.flow.")) ? false : true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean isLocalMessageCreateTimeMethod(Method method) {
        Class<?> cls;
        if (method != null) {
            Class<?> returnType = method.getReturnType();
            Class<?> cls2 = Long.TYPE;
            if (returnType != cls2 || !KavaReflector.isStatic(method)) {
                return false;
            }
            Class<?>[] parameterTypes = method.getParameterTypes();
            if (parameterTypes.length == 2 && parameterTypes[0] == String.class && ((cls = parameterTypes[1]) == cls2 || cls == Long.class)) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean isLocalMessageInsertMethod(Method method) {
        Class<?> cls;
        if (method == null || method.getReturnType() != Long.TYPE || !KavaReflector.isStatic(method)) {
            return false;
        }
        Class<?>[] parameterTypes = method.getParameterTypes();
        if (parameterTypes.length == 1 && (cls = parameterTypes[0]) != null && cls.getName().startsWith("com.tencent.mm.storage.")) {
            return (KavaReflector.findConstructor(cls, new Class[0]) == null && KavaReflector.findConstructor(cls, String.class) == null) ? false : true;
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean isLocalSystemMessageMethod(Method method) {
        if (method == null || method.getReturnType() != Void.TYPE || KavaReflector.isStatic(method)) {
            return false;
        }
        Class<?>[] parameterTypes = method.getParameterTypes();
        return parameterTypes.length == 3 && parameterTypes[0] == String.class && parameterTypes[1] == String.class && parameterTypes[2] == String.class;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean isMarsCdnCallbackClass(Class<?> cls) {
        if (cls == null) {
            return false;
        }
        String name = cls.getName();
        return name.contains("DownloadCallback") || name.contains("CdnCallback");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean isMarsCdnRequestClass(Class<?> cls) {
        if (cls == null) {
            return false;
        }
        if (cls.getName().contains("C2CDownloadRequest")) {
            return true;
        }
        return (KavaReflector.findMethod(cls, "setFileid", String.class) == null || KavaReflector.findMethod(cls, "setAeskey", String.class) == null || KavaReflector.findMethod(cls, "setSavePath2", String.class) == null || KavaReflector.findMethod(cls, "setFileType", Integer.TYPE) == null) ? false : true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean isMessageClearBatchMethod(Method method) {
        if (method != null && KavaReflector.isStatic(method) && method.getReturnType() == Void.TYPE) {
            Class<?>[] parameterTypes = method.getParameterTypes();
            if ((parameterTypes.length == 2 || parameterTypes.length == 3) && List.class.isAssignableFrom(parameterTypes[0]) && parameterTypes[1].isInterface()) {
                return parameterTypes.length == 2 || parameterTypes[2] == Long.TYPE;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean isMessageClearByTalkerMethod(Method method, Method method2) {
        if (method != null && method2 != null && KavaReflector.isStatic(method) && method.getReturnType() == Void.TYPE && method.getDeclaringClass() == method2.getDeclaringClass()) {
            Class<?>[] parameterTypes = method.getParameterTypes();
            Class<?>[] parameterTypes2 = method2.getParameterTypes();
            if ((parameterTypes.length == 2 || parameterTypes.length == 3) && parameterTypes[0] == String.class && parameterTypes[1] == parameterTypes2[1] && (parameterTypes.length == 2 || parameterTypes[2] == Long.TYPE)) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean isNativeNetSceneCandidate(Class<?> cls, int i9) {
        if (cls == null) {
            return false;
        }
        Class<?> cls2 = this.protobufNetSceneBaseClass;
        if (cls2 != null && !cls2.isAssignableFrom(cls)) {
            return false;
        }
        try {
            Method methodFindMethodRecursive = KavaReflector.findMethodRecursive(cls, "getType", new Class[0]);
            if (methodFindMethodRecursive != null && methodFindMethodRecursive.getParameterTypes().length == 0) {
                Object objInvoke = KavaReflector.invoke(methodFindMethodRecursive, KavaReflector.newInstance(KavaReflector.findConstructor(cls, new Class[0]), new Object[0]), new Object[0]);
                if (objInvoke instanceof Number) {
                    if (((Number) objInvoke).intValue() == i9) {
                        return true;
                    }
                }
            }
        } catch (Throwable unused) {
        }
        try {
            for (Method method : KavaReflector.declaredMethods(cls)) {
                if ("getType".equals(method.getName()) && method.getParameterTypes().length == 0 && (method.getReturnType() == Integer.TYPE || method.getReturnType() == Integer.class)) {
                    return true;
                }
            }
        } catch (Throwable unused2) {
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean isNoArgStringMethod(Method method) {
        return method != null && method.getReturnType() == String.class && method.getParameterTypes().length == 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean isNoArgVoidMethod(Method method) {
        return method != null && method.getReturnType() == Void.TYPE && method.getParameterTypes().length == 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean isOnGYNetEndMethod(Method method) {
        if (method != null && "onGYNetEnd".equals(method.getName())) {
            Class<?> declaringClass = method.getDeclaringClass();
            Class<?>[] parameterTypes = method.getParameterTypes();
            if (declaringClass != null && declaringClass.isInterface() && parameterTypes != null && parameterTypes.length == 6) {
                Class<?> cls = parameterTypes[0];
                Class<?> cls2 = Integer.TYPE;
                if (cls == cls2 && parameterTypes[1] == cls2 && parameterTypes[2] == cls2 && parameterTypes[3] == String.class) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean isPatCanSendMethod(Method method) {
        Class<?> cls;
        if (method == null || KavaReflector.isStatic(method) || !(method.getReturnType() == Boolean.TYPE || method.getReturnType() == Boolean.class)) {
            return false;
        }
        Class<?>[] parameterTypes = method.getParameterTypes();
        return parameterTypes.length == 3 && ((cls = parameterTypes[0]) == Integer.TYPE || cls == Integer.class) && parameterTypes[1] == String.class && parameterTypes[2] == String.class;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean isPatCreatePairMethod(Method method) {
        Class<?> cls;
        Class<?> cls2;
        if (method == null || KavaReflector.isStatic(method) || method.getReturnType() != Pair.class) {
            return false;
        }
        Class<?>[] parameterTypes = method.getParameterTypes();
        return parameterTypes.length == 6 && parameterTypes[0] == String.class && parameterTypes[1] == String.class && parameterTypes[2] == String.class && parameterTypes[3] == String.class && ((cls = parameterTypes[4]) == Integer.TYPE || cls == Integer.class) && ((cls2 = parameterTypes[5]) == Long.TYPE || cls2 == Long.class);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean isPatDisplayTemplateMethod(Method method) {
        if (method != null && method.getReturnType() != Void.TYPE) {
            Class<?>[] parameterTypes = method.getParameterTypes();
            if (parameterTypes.length == 2 && !parameterTypes[0].isPrimitive() && parameterTypes[1] == String.class) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean isPatSuffixMethod(Method method) {
        if (method == null || KavaReflector.isStatic(method) || method.getReturnType() != String.class) {
            return false;
        }
        Class<?>[] parameterTypes = method.getParameterTypes();
        return parameterTypes.length == 2 && parameterTypes[0] == String.class && parameterTypes[1] == String.class;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean isPreferredImageCdnSubmitMethod(Method method) {
        Class<?> cls;
        if (isImageCdnSubmitMethod(method) && !KavaReflector.isStatic(method)) {
            Class<?>[] parameterTypes = method.getParameterTypes();
            if (parameterTypes.length == 2 && ((cls = parameterTypes[1]) == Integer.TYPE || cls == Integer.class)) {
                Class<?> returnType = method.getReturnType();
                return returnType == Boolean.TYPE || returnType == Boolean.class;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean isProtobufCallbackMethod(Method method) {
        Class<?> cls;
        Class<?> cls2;
        if (method != null && "callback".equals(method.getName())) {
            Class<?> returnType = method.getReturnType();
            Class<?> cls3 = Integer.TYPE;
            if (returnType == cls3) {
                Class<?> declaringClass = method.getDeclaringClass();
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (declaringClass != null && declaringClass.isInterface() && parameterTypes.length == 5 && parameterTypes[0] == cls3 && parameterTypes[1] == cls3 && parameterTypes[2] == String.class && (cls = parameterTypes[3]) != null && cls != Object.class && (cls2 = this.protobufNetSceneBaseClass) != null && parameterTypes[4] == cls2) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean isProtobufNetSceneBaseClass(Class<?> cls) {
        if (cls == null) {
            return false;
        }
        for (Method method : KavaReflector.declaredMethods(cls)) {
            if ("dispatch".equals(method.getName()) && method.getParameterTypes().length == 3 && method.getReturnType() == Integer.TYPE) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean isProtobufSceneEndMethod(Method method) {
        Class<?> cls;
        if (method != null && "onSceneEnd".equals(method.getName())) {
            Class<?> declaringClass = method.getDeclaringClass();
            Class<?>[] parameterTypes = method.getParameterTypes();
            if (declaringClass != null && !declaringClass.isInterface() && method.getReturnType() == Void.TYPE && parameterTypes != null && parameterTypes.length == 4) {
                Class<?> cls2 = parameterTypes[0];
                Class<?> cls3 = Integer.TYPE;
                if (cls2 == cls3 && parameterTypes[1] == cls3 && parameterTypes[2] == String.class && (cls = this.protobufNetSceneBaseClass) != null && cls.isAssignableFrom(parameterTypes[3])) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean isProtobufStaticDispatch(Method method, Class<?> cls, Class<?> cls2) {
        if (method != null && cls != null && cls2 != null) {
            Class<?>[] parameterTypes = method.getParameterTypes();
            if (KavaReflector.isStatic(method) && parameterTypes != null && parameterTypes.length == 3 && parameterTypes[0] == cls && parameterTypes[1] == cls2 && parameterTypes[2] == Boolean.TYPE && this.protobufNetSceneBaseClass != null && method.getReturnType() == this.protobufNetSceneBaseClass) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean isSendFileAppMsgMethod(Method method) {
        Class<?> cls;
        if (method != null) {
            Class<?> returnType = method.getReturnType();
            Class<?> cls2 = Integer.TYPE;
            if (returnType != cls2 || !KavaReflector.isStatic(method)) {
                return false;
            }
            Class<?>[] parameterTypes = method.getParameterTypes();
            if (parameterTypes.length == 6 && "com.tencent.mm.opensdk.modelmsg.WXMediaMessage".equals(parameterTypes[0].getName()) && parameterTypes[1] == String.class && parameterTypes[2] == String.class && parameterTypes[3] == String.class && (((cls = parameterTypes[4]) == cls2 || cls == Integer.class) && parameterTypes[5] == String.class)) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean isSendFileAttachPathMethod(Method method) {
        if (method == null || method.getReturnType() != String.class || !KavaReflector.isStatic(method)) {
            return false;
        }
        Class<?>[] parameterTypes = method.getParameterTypes();
        return parameterTypes.length == 3 && parameterTypes[0] == String.class && parameterTypes[1] == String.class && parameterTypes[2] == String.class;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean isSendImageAppInfoClass(Class<?> cls) {
        if (cls != null && KavaReflector.findConstructor(cls, new Class[0]) != null) {
            if (hasDirectImageAppInfoFields(cls)) {
                return true;
            }
            for (Field field : KavaReflector.declaredFields(cls)) {
                if (!KavaReflector.isStatic(field) && (field.getType() == Integer.TYPE || field.getType() == Integer.class)) {
                    if (findIndexedSetter(cls) != null) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean isSendImageAppInfoMethod(Method method) {
        if (!isSendImageMethod(method)) {
            return false;
        }
        Class<?>[] parameterTypes = method.getParameterTypes();
        return parameterTypes.length == 8 && parameterTypes[5] == String.class && parameterTypes[6] == String.class;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean isSendImageAsyncAppInfoApiReady() {
        return (this.sendImageAsyncParamsClass == null || this.sendImageCrossParamsClass == null || this.sendImageAppInfoClass == null || !isSendImageAsyncSubmitMethod(this.sendImageAsyncSubmitMethod)) ? false : true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean isSendImageAsyncSubmitMethod(Method method) {
        Class<?> cls;
        if (method == null || KavaReflector.isStatic(method) || KavaReflector.isAbstract(method.getModifiers())) {
            return false;
        }
        Class<?>[] parameterTypes = method.getParameterTypes();
        return parameterTypes.length == 1 && (cls = this.sendImageAsyncParamsClass) != null && parameterTypes[0] == cls;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean isSendImageMethod(Method method) {
        Class<?> cls;
        if (method != null && method.getReturnType() == Void.TYPE) {
            Class<?>[] parameterTypes = method.getParameterTypes();
            if (parameterTypes.length >= 8 && parameterTypes[0] == Context.class && parameterTypes[1] == String.class && parameterTypes[2] == String.class && (((cls = parameterTypes[3]) == Integer.TYPE || cls == Integer.class) && parameterTypes[4] == String.class && parameterTypes[5] == String.class)) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean isSendPatSceneClass(Class<?> cls) {
        return findSendPatSceneCtor(cls) != null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean isSendVideoMethod(Method method) {
        Class<?> cls;
        Class<?> cls2;
        Class<?> cls3;
        Class<?> cls4;
        Class<?> cls5;
        Class<?> cls6;
        if (method != null && method.getReturnType() == Void.TYPE) {
            Class<?>[] parameterTypes = method.getParameterTypes();
            if (parameterTypes.length >= 13 && parameterTypes[0] == Context.class && parameterTypes[1] == String.class && parameterTypes[2] == String.class && parameterTypes[3] == String.class && (((cls = parameterTypes[4]) == (cls2 = Integer.TYPE) || cls == Integer.class) && (((cls3 = parameterTypes[5]) == cls2 || cls3 == Integer.class) && (((cls4 = parameterTypes[7]) == (cls5 = Boolean.TYPE) || cls4 == Boolean.class) && (((cls6 = parameterTypes[8]) == cls5 || cls6 == Boolean.class) && parameterTypes[9] == String.class && parameterTypes[10] == String.class))))) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean isSendXmlAppMsgMethod(Method method) {
        Class<?> cls;
        Class<?> cls2;
        if (method == null || method.getReturnType() == Void.TYPE || !"android.util.Pair".equals(method.getReturnType().getName()) || !KavaReflector.isStatic(method)) {
            return false;
        }
        Class<?>[] parameterTypes = method.getParameterTypes();
        return (parameterTypes.length == 10 || parameterTypes.length == 12) && !parameterTypes[0].isPrimitive() && parameterTypes[1] == String.class && parameterTypes[2] == String.class && parameterTypes[3] == String.class && parameterTypes[4] == String.class && parameterTypes[5] == byte[].class && parameterTypes[6] == String.class && parameterTypes[7] == String.class && parameterTypes[8] == String.class && ((parameterTypes.length == 10 && ((cls2 = parameterTypes[9]) == Long.TYPE || cls2 == Long.class)) || (parameterTypes.length == 12 && !parameterTypes[9].isPrimitive() && (((cls = parameterTypes[10]) == Boolean.TYPE || cls == Boolean.class) && parameterTypes[11] == String.class)));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean isServiceGetterMethod(Method method) {
        if (method != null && KavaReflector.isStatic(method)) {
            Class<?>[] parameterTypes = method.getParameterTypes();
            if (parameterTypes.length == 1 && parameterTypes[0] == Class.class && method.getReturnType() != Void.TYPE) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean isSnsShareAppMsgMethod(Method method) {
        if (method == null || KavaReflector.isStatic(method) || method.getReturnType() == Void.TYPE) {
            return false;
        }
        Class<?>[] parameterTypes = method.getParameterTypes();
        return parameterTypes.length == 4 && "com.tencent.mm.opensdk.modelmsg.WXMediaMessage".equals(parameterTypes[0].getName()) && parameterTypes[1] == String.class && parameterTypes[2] == String.class && parameterTypes[3] == String.class;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean isSnsUploadManagerClass(Class<?> cls) {
        if (cls == null) {
            return false;
        }
        boolean z9 = false;
        boolean z10 = false;
        for (Method method : KavaReflector.declaredMethods(cls)) {
            Class<?>[] parameterTypes = method.getParameterTypes();
            int length = parameterTypes.length;
            Class<?> cls2 = Void.TYPE;
            if (length == 0 && method.getReturnType() == cls2) {
                z9 = true;
            }
            if (parameterTypes.length == 1 && method.getReturnType() == cls2 && !parameterTypes[0].isPrimitive() && parameterTypes[0].getName().startsWith("com.tencent.mm.plugin.sns.model.")) {
                z10 = true;
            }
        }
        return z9 && z10;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean isSnsUploadPackHelperClass(Class<?> cls) {
        if (cls == null) {
            return false;
        }
        Iterator<Constructor<?>> it = KavaReflector.declaredConstructors(cls).iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Class<?>[] parameterTypes = it.next().getParameterTypes();
            if (parameterTypes.length == 2 && isIntClass(parameterTypes[0]) && Context.class.isAssignableFrom(parameterTypes[1])) {
                boolean z9 = false;
                boolean z10 = false;
                int i9 = 0;
                for (Method method : KavaReflector.declaredMethods(cls)) {
                    Class<?>[] parameterTypes2 = method.getParameterTypes();
                    if (parameterTypes2.length == 0 && isIntClass(method.getReturnType())) {
                        z9 = true;
                    } else if (parameterTypes2.length == 2 && method.getReturnType() == Boolean.TYPE && parameterTypes2[0] == String.class && parameterTypes2[1] == String.class) {
                        z10 = true;
                    } else if (parameterTypes2.length == 1 && method.getReturnType() == cls && parameterTypes2[0] == String.class) {
                        i9++;
                    }
                }
                if (!z9 || !z10 || i9 < 2) {
                    break;
                }
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean isStaticNoArgStringMethod(Method method) {
        return method != null && KavaReflector.isStatic(method) && method.getReturnType() == String.class && method.getParameterTypes().length == 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean isStringBooleanMethod(Method method) {
        if (method != null && method.getReturnType() == Boolean.TYPE) {
            Class<?>[] parameterTypes = method.getParameterTypes();
            if (parameterTypes.length == 1 && parameterTypes[0] == String.class) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean isTransferOperationClass(Class<?> cls) {
        if (cls == null || !hasTransferOperationCtor(cls)) {
            return false;
        }
        try {
            Object objNewTransferProbe = newTransferProbe(cls);
            if (objNewTransferProbe == null) {
                return false;
            }
            Method methodFindDeclaredMethod = KavaReflector.findDeclaredMethod(cls, "getUri", new Class[0]);
            if (methodFindDeclaredMethod != null) {
                return "/cgi-bin/mmpay-bin/transferoperation".equals(KavaReflector.invoke(methodFindDeclaredMethod, objNewTransferProbe, new Object[0]));
            }
            throw new NoSuchMethodException("getUri");
        } catch (Throwable unused) {
            return "com.tencent.mm.plugin.remittance.model.n0".equals(cls.getName());
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean isTransferQueryClass(Class<?> cls) {
        if (cls == null) {
            return false;
        }
        Iterator<Constructor<?>> it = KavaReflector.declaredConstructors(cls).iterator();
        while (it.hasNext()) {
            Class<?>[] parameterTypes = it.next().getParameterTypes();
            if (parameterTypes.length == 5 || parameterTypes.length == 6) {
                Class<?> cls2 = parameterTypes[0];
                Class<?> cls3 = Integer.TYPE;
                if (cls2 == cls3 && parameterTypes[1] == String.class && parameterTypes[2] == String.class && parameterTypes[3] == cls3 && parameterTypes[4] == String.class && (parameterTypes.length == 5 || parameterTypes[5] == String.class)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean isTransferQueryResponseMethod(Method method, Class<?> cls) {
        if (method != null && cls != null && method.getDeclaringClass() == cls && !Modifier.isStatic(method.getModifiers()) && method.getReturnType() == Void.TYPE) {
            Class<?>[] parameterTypes = method.getParameterTypes();
            if (parameterTypes.length == 3 && parameterTypes[0] == Integer.TYPE && parameterTypes[1] == String.class && "org.json.JSONObject".equals(parameterTypes[2].getName())) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean isVerifyUserClass(Class<?> cls) {
        if (cls == null || !hasVerifyUserCtor(cls)) {
            return false;
        }
        try {
            Method methodFindMethodRecursive = KavaReflector.findMethodRecursive(cls, "getType", new Class[0]);
            if (methodFindMethodRecursive != null && methodFindMethodRecursive.getParameterTypes().length == 0) {
                if (methodFindMethodRecursive.getReturnType() == Integer.TYPE) {
                    return true;
                }
                if (methodFindMethodRecursive.getReturnType() == Integer.class) {
                    return true;
                }
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean isVideoInfoByFileNameMethod(Method method, Class<?> cls) {
        return method != null && cls != null && KavaReflector.isStatic(method) && method.getParameterTypes().length == 1 && method.getParameterTypes()[0] == String.class && method.getReturnType() == cls;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean isVideoPathMethod(Method method) {
        return method != null && method.getReturnType() == String.class && method.getParameterTypes().length == 1 && method.getParameterTypes()[0] == String.class;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean isVideoPathOwnerGetter(Method method, Class<?> cls) {
        return method != null && cls != null && KavaReflector.isStatic(method) && method.getParameterTypes().length == 0 && cls.isAssignableFrom(method.getReturnType());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean isVoiceFinishRecordMethod(Method method) {
        Class<?> cls;
        Class<?> cls2;
        Class<?> cls3;
        if (method == null || method.getReturnType() != Boolean.TYPE || !KavaReflector.isStatic(method)) {
            return false;
        }
        Class<?>[] parameterTypes = method.getParameterTypes();
        return (parameterTypes.length == 3 || parameterTypes.length == 4) && parameterTypes[0] == String.class && ((cls = parameterTypes[1]) == (cls2 = Integer.TYPE) || cls == Integer.class) && ((cls3 = parameterTypes[2]) == cls2 || cls3 == Integer.class);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean isVoiceFullPathMethod(Method method) {
        Class<?> cls;
        Class<?> cls2;
        if (method != null && method.getReturnType() == String.class) {
            Class<?>[] parameterTypes = method.getParameterTypes();
            int length = parameterTypes.length;
            Class<?> cls3 = Boolean.TYPE;
            if (length == 2) {
                return KavaReflector.isStatic(method) && parameterTypes[0] == String.class && ((cls2 = parameterTypes[1]) == cls3 || cls2 == Boolean.class);
            }
            if (parameterTypes.length == 3 && !parameterTypes[0].isPrimitive() && parameterTypes[1] == String.class && ((cls = parameterTypes[2]) == cls3 || cls == Boolean.class)) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean isVoiceInfoQueryMethod(Method method, Class<?> cls) {
        if (method != null && cls != null && KavaReflector.isStatic(method)) {
            Class<?>[] parameterTypes = method.getParameterTypes();
            if (parameterTypes.length == 1 && parameterTypes[0] == String.class && method.getReturnType() == cls) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean isVoiceInfoStorageQueryMethod(Method method) {
        if (method != null && !KavaReflector.isStatic(method)) {
            Class<?>[] parameterTypes = method.getParameterTypes();
            Class<?> returnType = method.getReturnType();
            if (parameterTypes.length == 1 && parameterTypes[0] == String.class && returnType != Void.TYPE && !returnType.isPrimitive()) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean isVoicePlaybackStartMethod(Method method) {
        if (method == null) {
            return false;
        }
        Class<?> declaringClass = method.getDeclaringClass();
        Class<?> cls = Boolean.TYPE;
        Class cls2 = Integer.TYPE;
        return isExactInstanceMethod(method, declaringClass, cls, String.class, cls, cls, cls2) && findCtorByExactTypes(method.getDeclaringClass(), Context.class, cls2) != null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean isVoiceStartRecordMethod(Method method) {
        if (method != null && method.getReturnType() == String.class) {
            Class<?>[] parameterTypes = method.getParameterTypes();
            if (KavaReflector.isStatic(method) && parameterTypes.length == 2 && parameterTypes[0] == String.class && parameterTypes[1] == String.class) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private String joinClassNames(List<Class<?>> list) {
        if (list == null || list.isEmpty()) {
            return HttpUrl.FRAGMENT_ENCODE_SET;
        }
        StringBuilder sb2 = new StringBuilder();
        for (Class<?> cls : list) {
            if (cls != null) {
                if (sb2.length() > 0) {
                    sb2.append(',');
                }
                sb2.append(cls.getName());
            }
        }
        return sb2.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean loadCache() {
        Method method;
        Method method2;
        if (this.cachePrefs != null && this.runtimeCacheKey.length() != 0) {
            try {
                if (!this.cachePrefs.getBoolean(CACHE_COMPLETE, false)) {
                    return false;
                }
                if (!this.runtimeCacheKey.equals(this.cachePrefs.getString(CACHE_KEY, HttpUrl.FRAGMENT_ENCODE_SET))) {
                    resetCacheForRuntimeKey();
                    return false;
                }
                this.addMsgClasses = loadClassList("addMsgClasses");
                this.receiveLuckyMoneyClass = loadClass("receiveLuckyMoneyClass");
                this.receiveLuckyMoneyUnionClass = loadClass("receiveLuckyMoneyUnionClass");
                this.openLuckyMoneyClass = loadClass("openLuckyMoneyClass");
                this.openLuckyMoneyUnionClass = loadClass("openLuckyMoneyUnionClass");
                this.netQueueClass = loadClass("netQueueClass");
                this.netQueueCandidateClasses = loadClassList("netQueueCandidateClasses");
                this.packetBaseClasses = loadClassList("packetBaseClasses");
                this.packetQueueClasses = loadClassList("packetQueueClasses");
                this.fakePacketClasses = loadClassList("fakePacketClasses");
                this.protobufRawReqClass = loadClass("protobufRawReqClass");
                this.protobufGenericRespClass = loadClass("protobufGenericRespClass");
                this.protobufConfigBuilderClass = loadClass("protobufConfigBuilderClass");
                this.protobufReqRespClass = loadClass("protobufReqRespClass");
                this.protobufCallbackClass = loadClass("protobufCallbackClass");
                this.protobufNewSendMsgReqClass = loadClass("protobufNewSendMsgReqClass");
                this.protobufOplogReqClass = loadClass("protobufOplogReqClass");
                this.protobufOnGYNetEndClass = loadClass("protobufOnGYNetEndClass");
                this.protobufNetSceneBaseClass = loadClass("protobufNetSceneBaseClass");
                this.protobufStaticDispatchMethod = loadMethod("protobufStaticDispatchMethod");
                this.protobufSceneEndMethods = loadMethodList("protobufSceneEndMethods");
                this.wishWxHbClass = loadClass("wishWxHbClass");
                this.sendTextMsgClass = loadClass("sendTextMsgClass");
                this.serviceGetterMethod = loadMethod("serviceGetterMethod");
                this.getContactAddMethods = loadMethodList("getContactAddMethods");
                this.getContactServiceGetters = loadMethodList("getContactServiceGetters");
                this.sendImageMethod = loadMethod("sendImageMethod");
                this.sendImageAsyncParamsClass = loadClass("sendImageAsyncParamsClass");
                this.sendImageCrossParamsClass = loadClass("sendImageCrossParamsClass");
                this.sendImageAppInfoClass = loadClass("sendImageAppInfoClass");
                this.sendImageAsyncSubmitMethod = loadMethod("sendImageAsyncSubmitMethod");
                this.imageCdnTaskClass = loadClass("imageCdnTaskClass");
                this.imageCdnSubmitMethod = loadMethod("imageCdnSubmitMethod");
                this.imageCdnServiceGetterMethod = loadMethod("imageCdnServiceGetterMethod");
                this.marsCdnManagerClass = loadClass("marsCdnManagerClass");
                this.marsCdnDownloadRequestClass = loadClass("marsCdnDownloadRequestClass");
                this.marsCdnDownloadCallbackClass = loadClass("marsCdnDownloadCallbackClass");
                this.marsCdnStartDownloadMethod = loadMethod("marsCdnStartDownloadMethod");
                this.imageBestPathMethod = loadMethod("imageBestPathMethod");
                this.imageStorageGetterMethod = loadMethod("imageStorageGetterMethod");
                this.imageTokenPathMethod = loadMethod("imageTokenPathMethod");
                this.sendFileMethod = loadMethod("sendFileMethod");
                this.sendFileAttachDirMethod = loadMethod("sendFileAttachDirMethod");
                this.sendFileAttachPathMethod = loadMethod("sendFileAttachPathMethod");
                this.sendXmlAppMsgMethod = loadMethod("sendXmlAppMsgMethod");
                this.appMsgParseMethod = loadMethod("appMsgParseMethod");
                this.groupSolitairePluginClass = loadClass("groupSolitairePluginClass");
                this.groupSolitaireSendMethod = loadMethod("groupSolitaireSendMethod");
                this.localSystemMessageMethod = loadMethod("localSystemMessageMethod");
                this.localMessageInsertMethod = loadMethod("localMessageInsertMethod");
                this.localMessageCreateTimeMethod = loadMethod("localMessageCreateTimeMethod");
                this.localMessageClass = loadClass("localMessageClass");
                this.sendVideoMethod = loadMethod("sendVideoMethod");
                this.sendVideoTaskClass = loadClass("sendVideoTaskClass");
                this.videoPathMethod = loadMethod("videoPathMethod");
                this.videoPathOwnerGetterMethod = loadMethod("videoPathOwnerGetterMethod");
                this.videoInfoClass = loadClass("videoInfoClass");
                this.videoInfoByFileNameMethod = loadMethod("videoInfoByFileNameMethod");
                this.transferOperationClass = loadClass("transferOperationClass");
                this.transferQueryClass = loadClass("transferQueryClass");
                this.transferQueryResponseMethod = loadMethod("transferQueryResponseMethod");
                this.verifyUserClass = loadClass("verifyUserClass");
                this.contactCardXmlMethod = loadMethod("contactCardXmlMethod");
                this.patDisplayTemplateMethod = loadMethod("patDisplayTemplateMethod");
                this.patExtensionClass = loadClass("patExtensionClass");
                this.patCreatePairMethod = loadMethod("patCreatePairMethod");
                this.patSuffixMethod = loadMethod("patSuffixMethod");
                this.patCanSendMethod = loadMethod("patCanSendMethod");
                this.sendPatSceneClass = loadClass("sendPatSceneClass");
                this.voiceStartRecordMethod = loadMethod("voiceStartRecordMethod");
                this.voiceFullPathMethod = loadMethod("voiceFullPathMethod");
                this.voiceFinishRecordMethod = loadMethod("voiceFinishRecordMethod");
                this.voiceInfoQueryMethod = loadMethod("voiceInfoQueryMethod");
                Class<?> clsLoadClass = loadClass("voiceUploadClass");
                this.voiceUploadClass = clsLoadClass;
                Class cls = Boolean.TYPE;
                this.voiceUploadCdnCtor = findCtorByExactTypes(clsLoadClass, String.class, cls);
                this.voicePlaybackStartMethod = loadMethod("voicePlaybackStartMethod");
                this.voicePlaybackPauseMethod = loadMethod("voicePlaybackPauseMethod");
                this.voicePlaybackResumeMethod = loadMethod("voicePlaybackResumeMethod");
                this.voicePlaybackStopMethod = loadMethod("voicePlaybackStopMethod");
                this.emojiSendMethod = loadMethod("emojiSendMethod");
                this.emojiManagerSendMethod = loadMethod("emojiManagerSendMethod");
                this.emojiGetByMd5Method = loadMethod("emojiGetByMd5Method");
                this.emojiCreateInfoMethod = loadMethod("emojiCreateInfoMethod");
                this.emojiUpdateInfoMethod = loadMethod("emojiUpdateInfoMethod");
                this.emojiAccPathMethod = loadMethod("emojiAccPathMethod");
                this.emojiCheckGifMethod = loadMethod("emojiCheckGifMethod");
                this.emojiFilePathMethod = loadMethod("emojiFilePathMethod");
                this.emojiDecodeDataMethod = loadMethod("emojiDecodeDataMethod");
                this.emojiDecodeManagerGetterMethod = loadMethod("emojiDecodeManagerGetterMethod");
                this.favoriteItemClass = loadClass("favoriteItemClass");
                this.favoriteItemConvertFromCursorMethod = loadMethod("favoriteItemConvertFromCursorMethod");
                this.favoriteServiceClass = loadClass("favoriteServiceClass");
                this.favoriteServiceResolverMethod = loadMethod("favoriteServiceResolverMethod");
                this.favoriteStorageGetterMethod = loadMethod("favoriteStorageGetterMethod");
                this.favoriteListMethod = loadMethod("favoriteListMethod");
                this.favoriteListNextMethod = loadMethod("favoriteListNextMethod");
                this.favoriteListCursorMethod = loadMethod("favoriteListCursorMethod");
                this.favoriteGetMethod = loadMethod("favoriteGetMethod");
                this.favoriteSendMethod = loadMethod("favoriteSendMethod");
                this.favoriteSendParamClass = loadClass("favoriteSendParamClass");
                this.mmKernelClass = loadClass("mmKernelClass");
                this.coreStorageClass = loadClass("coreStorageClass");
                this.configStorageClass = loadClass("configStorageClass");
                this.sqliteDbWrapperClass = loadClass("sqliteDbWrapperClass");
                this.conversationDeleteMethod = loadMethod("conversationDeleteMethod");
                this.messageClearByTalkerMethod = loadMethod("messageClearByTalkerMethod");
                this.messageClearBatchMethod = loadMethod("messageClearBatchMethod");
                this.contactMuteStateMethod = loadMethod("contactMuteStateMethod");
                this.contactMuteEnableMethod = loadMethod("contactMuteEnableMethod");
                this.contactMuteDisableMethod = loadMethod("contactMuteDisableMethod");
                this.contactStorageGetterMethod = loadMethod("contactStorageGetterMethod");
                this.contactStorageQueryMethod = loadMethod("contactStorageQueryMethod");
                this.chatroomMuteServiceGetterMethod = loadMethod("chatroomMuteServiceGetterMethod");
                this.chatroomMuteBuildMethod = loadMethod("chatroomMuteBuildMethod");
                this.chatroomMuteSubmitMethod = loadMethod("chatroomMuteSubmitMethod");
                this.receiveCtor = findFirstCtorByArgCounts(this.receiveLuckyMoneyClass, 7, 10, 8);
                this.unionReceiveCtor = findCtorByArgCount(this.receiveLuckyMoneyUnionClass, 6);
                this.openCtor10 = findCtorByArgCount(this.openLuckyMoneyClass, 10);
                this.openCtor9 = findCtorByArgCount(this.openLuckyMoneyClass, 9);
                this.openCtor8 = findCtorByArgCount(this.openLuckyMoneyClass, 8);
                this.unionOpenCtor10 = findCtorByArgCount(this.openLuckyMoneyUnionClass, 10);
                this.unionOpenCtor9 = findCtorByArgCount(this.openLuckyMoneyUnionClass, 9);
                this.wishWxHbCtor = findCtorByArgCount(this.wishWxHbClass, 4);
                Class<?> cls2 = this.sendTextMsgClass;
                Class cls3 = Integer.TYPE;
                this.sendTextMsgCtorLong = findCtorByExactTypes(cls2, String.class, String.class, cls3, cls3, Long.TYPE);
                this.sendTextMsgCtorObject = findCtorByExactTypes(this.sendTextMsgClass, String.class, String.class, cls3, cls3, Object.class);
                if (this.localMessageClass == null && (method2 = this.localMessageInsertMethod) != null && method2.getParameterTypes().length == 1) {
                    this.localMessageClass = this.localMessageInsertMethod.getParameterTypes()[0];
                }
                this.localMessageCtor = findLocalMessageConstructor(this.localMessageClass);
                if (this.localMessageCreateTimeMethod == null && (method = this.localMessageInsertMethod) != null) {
                    this.localMessageCreateTimeMethod = findLocalMessageCreateTimeMethod(method.getDeclaringClass());
                }
                if (this.localSystemMessageMethod == null) {
                    resolveLocalSystemMessageMethod();
                }
                this.voiceUploadCtor = findCtorByExactTypes(this.voiceUploadClass, String.class, cls3);
                this.voiceUploadCdnCtor = findCtorByExactTypes(this.voiceUploadClass, String.class, cls);
                this.sendPatSceneCtor = findSendPatSceneCtor(this.sendPatSceneClass);
                this.coreStorageGetter = loadMethod("coreStorageGetter");
                this.groupMemberDisplayNameMethod = loadMethod("groupMemberDisplayNameMethod");
                Class<?> clsLoadClass2 = loadClass("addChatroomMemberClass");
                this.addChatroomMemberClass = clsLoadClass2;
                this.addChatroomMemberCtor = findAddChatroomMemberCtor(clsLoadClass2);
                Class<?> clsLoadClass3 = loadClass("inviteChatroomMemberClass");
                this.inviteChatroomMemberClass = clsLoadClass3;
                this.inviteChatroomMemberCtor = findInviteChatroomMemberCtor(clsLoadClass3);
                Class<?> clsLoadClass4 = loadClass("delChatroomMemberClass");
                this.delChatroomMemberClass = clsLoadClass4;
                this.delChatroomMemberCtor = findDelChatroomMemberCtor(clsLoadClass4);
                Class<?> clsLoadClass5 = loadClass("revokeMsgClass");
                this.revokeMsgClass = clsLoadClass5;
                this.revokeMsgCtor = findRevokeMsgCtor(clsLoadClass5);
                Class<?> clsLoadClass6 = loadClass("uploadDeviceStepClass");
                this.uploadDeviceStepClass = clsLoadClass6;
                this.uploadDeviceStepCtor = findUploadDeviceStepCtor(clsLoadClass6);
                Class<?> clsLoadClass7 = loadClass("addContactLabelClass");
                this.addContactLabelClass = clsLoadClass7;
                this.addContactLabelCtorString = findCtorByExactTypes(clsLoadClass7, String.class);
                this.addContactLabelCtorList = findCtorByExactTypes(this.addContactLabelClass, List.class);
                Class<?> clsLoadClass8 = loadClass("modifyContactLabelListClass");
                this.modifyContactLabelListClass = clsLoadClass8;
                this.modifyContactLabelListCtor = findCtorByExactTypes(clsLoadClass8, LinkedList.class);
                this.snsUploadPackHelperClass = loadClass("snsUploadPackHelperClass");
                this.snsUploadManagerClass = loadClass("snsUploadManagerClass");
                this.snsUploadManagerGetterMethod = loadMethod("snsUploadManagerGetterMethod");
                this.snsSetContentMethod = loadMethod("snsSetContentMethod");
                this.snsSetSdkIdMethod = loadMethod("snsSetSdkIdMethod");
                this.snsSetSdkAppNameMethod = loadMethod("snsSetSdkAppNameMethod");
                this.snsAddImageMethod = loadMethod("snsAddImageMethod");
                this.snsAddVideoMethod = loadMethod("snsAddVideoMethod");
                this.snsCommitMethod = loadMethod("snsCommitMethod");
                this.snsShareAppMsgMethod = loadMethod("snsShareAppMsgMethod");
                this.snsUploadCheckMethod = loadMethod("snsUploadCheckMethod");
                this.chatPageStartMethod = loadMethod("chatPageStartMethod");
                this.chatPageFragmentEnterMethod = loadMethod("chatPageFragmentEnterMethod");
                this.chatPageFragmentExitMethod = loadMethod("chatPageFragmentExitMethod");
                this.chatFooterSendClickMethod = loadMethod("chatFooterSendClickMethod");
                return isCacheUsable();
            } catch (Throwable th2) {
                logDetail("读取缓存失败，重新解析: " + th2.getMessage());
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private Class<?> loadClass(String str) {
        try {
            String string = this.cachePrefs.getString(str, HttpUrl.FRAGMENT_ENCODE_SET);
            if (string != null && string.length() != 0) {
                return KavaReflector.loadClass(string, this.classLoader);
            }
        } catch (Throwable unused) {
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private List<Class<?>> loadClassList(String str) {
        ArrayList arrayList = new ArrayList();
        try {
            String string = this.cachePrefs.getString(str, HttpUrl.FRAGMENT_ENCODE_SET);
            if (string != null && string.length() != 0) {
                for (String str2 : string.split(",")) {
                    String strTrim = str2.trim();
                    if (strTrim.length() != 0) {
                        try {
                            Class<?> clsLoadClass = KavaReflector.loadClass(strTrim, this.classLoader);
                            if (!arrayList.contains(clsLoadClass)) {
                                arrayList.add(clsLoadClass);
                            }
                        } catch (Throwable unused) {
                        }
                    }
                }
            }
        } catch (Throwable unused2) {
        }
        return arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private Method loadMethod(String str) {
        try {
            String string = this.cachePrefs.getString(str, HttpUrl.FRAGMENT_ENCODE_SET);
            if (string != null && string.length() != 0) {
                int iIndexOf = string.indexOf(35);
                int i9 = iIndexOf + 1;
                int iIndexOf2 = string.indexOf(40, i9);
                int i10 = iIndexOf2 + 1;
                int iIndexOf3 = string.indexOf(41, i10);
                if (iIndexOf > 0 && iIndexOf2 > iIndexOf && iIndexOf3 >= iIndexOf2) {
                    return KavaReflector.findDeclaredMethod(KavaReflector.loadClass(string.substring(0, iIndexOf), this.classLoader), string.substring(i9, iIndexOf2), parseParamTypes(string.substring(i10, iIndexOf3)));
                }
            }
        } catch (Throwable unused) {
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private List<Method> loadMethodList(String str) {
        ArrayList arrayList = new ArrayList();
        try {
            String string = this.cachePrefs.getString(str, HttpUrl.FRAGMENT_ENCODE_SET);
            if (string != null && string.length() != 0) {
                for (String str2 : string.split("\\n")) {
                    Method methodLoadMethodSpec = loadMethodSpec(str2.trim());
                    if (methodLoadMethodSpec != null && !arrayList.contains(methodLoadMethodSpec)) {
                        arrayList.add(methodLoadMethodSpec);
                    }
                }
            }
        } catch (Throwable unused) {
        }
        return arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private Method loadMethodSpec(String str) {
        if (str != null) {
            try {
                if (str.length() != 0) {
                    int iIndexOf = str.indexOf(35);
                    int i9 = iIndexOf + 1;
                    int iIndexOf2 = str.indexOf(40, i9);
                    int i10 = iIndexOf2 + 1;
                    int iIndexOf3 = str.indexOf(41, i10);
                    if (iIndexOf > 0 && iIndexOf2 > iIndexOf && iIndexOf3 >= iIndexOf2) {
                        return KavaReflector.findDeclaredMethod(KavaReflector.loadClass(str.substring(0, iIndexOf), this.classLoader), str.substring(i9, iIndexOf2), parseParamTypes(str.substring(i10, iIndexOf3)));
                    }
                }
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private void logMissingCritical() {
        List<Class<?>> list = this.addMsgClasses;
        if (list == null || list.isEmpty()) {
            AbstractC1184v0.m3203m("[Hchat:DexFinder] AddMsg类未找到");
        }
        if (this.receiveLuckyMoneyClass == null) {
            AbstractC1184v0.m3203m("[Hchat:DexFinder] 收红包类未找到");
        }
        if (this.openLuckyMoneyClass == null) {
            AbstractC1184v0.m3203m("[Hchat:DexFinder] 拆红包类未找到");
        }
        if (this.netQueueClass == null) {
            AbstractC1184v0.m3203m("[Hchat:DexFinder] 网络队列类未找到");
        }
        if (this.sendTextMsgClass == null) {
            AbstractC1184v0.m3203m("[Hchat:DexFinder] 文本发送类未找到");
        }
        if (this.sqliteDbWrapperClass == null) {
            AbstractC1184v0.m3203m("[Hchat:DexFinder] 数据库wrapper未找到");
        }
        if (this.chatPageStartMethod == null || this.chatPageFragmentEnterMethod == null || this.chatPageFragmentExitMethod == null) {
            AbstractC1184v0.m3203m("[Hchat:DexFinder] 聊天页API方法未找到: start=" + methodName(this.chatPageStartMethod) + " fragmentEnter=" + methodName(this.chatPageFragmentEnterMethod) + " fragmentExit=" + methodName(this.chatPageFragmentExitMethod));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean looksLikeAttachDir(Method method) {
        try {
            Object objInvoke = KavaReflector.invoke(method, null, new Object[0]);
            if (!(objInvoke instanceof String)) {
                return false;
            }
            String lowerCase = ((String) objInvoke).toLowerCase();
            if (lowerCase.contains("attachment") || lowerCase.contains("appattach")) {
                return true;
            }
            return lowerCase.contains("app_attach");
        } catch (Throwable unused) {
            return false;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private String methodName(Method method) {
        if (method == null) {
            return "null";
        }
        return method.getDeclaringClass().getName() + "#" + method.getName();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private String methodSpec(Method method) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(method.getDeclaringClass().getName());
        sb2.append('#');
        sb2.append(method.getName());
        sb2.append('(');
        Class<?>[] parameterTypes = method.getParameterTypes();
        for (int i9 = 0; i9 < parameterTypes.length; i9++) {
            if (i9 > 0) {
                sb2.append(',');
            }
            sb2.append(parameterTypes[i9].getName());
        }
        sb2.append(')');
        return sb2.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private C0568c mkClassByName(String str) {
        C0568c c0568c = new C0568c();
        C1243a c1243a = new C1243a();
        str.getClass();
        c1243a.m3360m0(5, str);
        c0568c.f1762h = c1243a;
        return c0568c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private C0568c mkClassUsingStrings(String... strArr) {
        C0568c c0568c = new C0568c();
        C1243a c1243a = new C1243a();
        List listAsList = Arrays.asList(strArr);
        listAsList.getClass();
        C1243a.m3357r0(c1243a, listAsList);
        c0568c.f1762h = c1243a;
        return c0568c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private C0570e mkMethodUsingStrings(String... strArr) {
        C0570e c0570e = new C0570e();
        C1253k c1253k = new C1253k();
        c1253k.m3376t0(Arrays.asList(strArr));
        c0570e.f1764h = c1253k;
        return c0570e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private C0570e mkMethodUsingStringsAndName(String str, String... strArr) {
        C0570e c0570e = new C0570e();
        C1253k c1253k = new C1253k();
        str.getClass();
        c1253k.f4103g = new C1431c(str, 5);
        c1253k.m3376t0(Arrays.asList(strArr));
        c0570e.f1764h = c1253k;
        return c0570e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private Object newTransferProbe(Class<?> cls) {
        Class<?>[] parameterTypes;
        if (cls == null) {
            return null;
        }
        Iterator<Constructor<?>> it = KavaReflector.declaredConstructors(cls).iterator();
        while (it.hasNext()) {
            Constructor<?> next = it.next();
            try {
                parameterTypes = next.getParameterTypes();
            } catch (Throwable unused) {
            }
            if (parameterTypes.length == 9 || parameterTypes.length == 10 || parameterTypes.length == 12 || parameterTypes.length == 13 || parameterTypes.length == 14) {
                Object[] objArr = new Object[parameterTypes.length];
                for (int i9 = 0; i9 < parameterTypes.length; i9++) {
                    Class<?> cls2 = parameterTypes[i9];
                    if (cls2 == String.class) {
                        objArr[i9] = HttpUrl.FRAGMENT_ENCODE_SET;
                    } else if (cls2 == Integer.TYPE || cls2 == Integer.class) {
                        objArr[i9] = 0;
                    } else if (cls2 == Long.TYPE || cls2 == Long.class) {
                        objArr[i9] = 0L;
                    } else if (Map.class.isAssignableFrom(cls2)) {
                        objArr[i9] = null;
                    } else {
                        objArr[i9] = null;
                    }
                }
                objArr[3] = "confirm";
                return KavaReflector.newInstance(next, objArr);
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private Class<?>[] parseParamTypes(String str) {
        if (str == null || str.length() == 0) {
            return new Class[0];
        }
        String[] strArrSplit = str.split(",");
        Class<?>[] clsArr = new Class[strArrSplit.length];
        for (int i9 = 0; i9 < strArrSplit.length; i9++) {
            clsArr[i9] = typeOf(strArrSplit[i9].trim());
        }
        return clsArr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private void putClass(SharedPreferences.Editor editor, String str, Class<?> cls) {
        editor.putString(str, cls != null ? cls.getName() : HttpUrl.FRAGMENT_ENCODE_SET);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private void putMethod(SharedPreferences.Editor editor, String str, Method method) {
        editor.putString(str, method != null ? methodSpec(method) : HttpUrl.FRAGMENT_ENCODE_SET);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private void putMethodList(SharedPreferences.Editor editor, String str, List<Method> list) {
        StringBuilder sb2 = new StringBuilder();
        if (list != null) {
            for (Method method : list) {
                if (method != null) {
                    if (sb2.length() > 0) {
                        sb2.append('\n');
                    }
                    sb2.append(methodSpec(method));
                }
            }
        }
        editor.putString(str, sb2.toString());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private void resetCacheForRuntimeKey() {
        try {
            this.cachePrefs.edit().clear().putString(CACHE_KEY, this.runtimeCacheKey).commit();
        } catch (Throwable unused) {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private void resolveAddMsgClasses() {
        try {
            collectMethodOwnerClass(this.dexKit.findMethod(mkMethodUsingStrings("dkAddMsg")), this.addMsgClasses);
            if (this.addMsgClasses.isEmpty()) {
                collectMethodOwnerClass(this.dexKit.findMethod(mkMethodUsingStrings("processAddMsg")), this.addMsgClasses);
            }
            logDetail("AddMsg类: " + this.addMsgClasses.size());
        } catch (Throwable th2) {
            AbstractC0255e.m1030s(th2, new StringBuilder("[Hchat:DexFinder] resolveAddMsg 失败: "), th2);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private void resolveAppMsgParseMethod(Class<?> cls) {
        if (cls == null || isAppMsgParseMethod(this.appMsgParseMethod, cls)) {
            return;
        }
        try {
            for (Method method : KavaReflector.declaredMethods(cls)) {
                if (isAppMsgParseMethod(method, cls)) {
                    KavaReflector.accessible(method);
                    this.appMsgParseMethod = method;
                    return;
                }
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private void resolveChatroomMuteApi() {
        this.chatroomMuteServiceGetterMethod = null;
        this.chatroomMuteBuildMethod = null;
        this.chatroomMuteSubmitMethod = null;
        C1731p<C1730o> c1731pFindMethod = this.dexKit.findMethod(mkMethodUsingStrings("ChatroomMuteRefine OpModChatRoomNotify roomId = %s, notifyMsg = %d, defaultNeedPushFlag=%d"));
        if (c1731pFindMethod.isEmpty()) {
            c1731pFindMethod = this.dexKit.findMethod(mkMethodUsingStrings("room_notify_new_msg"));
        }
        for (C1730o c1730o : c1731pFindMethod) {
            ArrayList<Method> arrayList = new ArrayList();
            Iterator<E> it = c1730o.m4349q().iterator();
            while (it.hasNext()) {
                try {
                    Method methodM4350r = ((C1730o) it.next()).m4350r(this.classLoader);
                    if (!arrayList.contains(methodM4350r)) {
                        arrayList.add(methodM4350r);
                    }
                } catch (Throwable unused) {
                }
            }
            for (Method method : arrayList) {
                if (isChatroomMuteBuildMethod(method)) {
                    Method method2 = null;
                    Method method3 = null;
                    for (Method method4 : arrayList) {
                        if (isChatroomMuteServiceGetterMethod(method4, method)) {
                            method2 = method4;
                        }
                        if (isChatroomMuteSubmitMethod(method4, method)) {
                            method3 = method4;
                        }
                    }
                    if (method2 != null && method3 != null) {
                        KavaReflector.accessible(method2);
                        KavaReflector.accessible(method);
                        KavaReflector.accessible(method3);
                        this.chatroomMuteServiceGetterMethod = method2;
                        this.chatroomMuteBuildMethod = method;
                        this.chatroomMuteSubmitMethod = method3;
                        return;
                    }
                }
            }
        }
        AbstractC1184v0.m3203m("[Hchat:DexFinder] 原生群聊免打扰API定位失败: entries=" + c1731pFindMethod.size() + " key=" + shortKey(this.runtimeCacheKey));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private void resolveContactStorageLookupApi() {
        this.contactStorageGetterMethod = null;
        this.contactStorageQueryMethod = null;
        Method method = this.contactMuteEnableMethod;
        if (isContactMuteMethod(method)) {
            Class<?> cls = method.getParameterTypes()[0];
            ArrayList<Method> arrayList = new ArrayList();
            for (C1730o c1730o : this.dexKit.findMethod(mkMethodUsingStrings("setMute contact invalid username"))) {
                try {
                    if (method.equals(c1730o.m4350r(this.classLoader))) {
                        Iterator<E> it = c1730o.m4349q().iterator();
                        while (it.hasNext()) {
                            Method methodM4350r = ((C1730o) it.next()).m4350r(this.classLoader);
                            if (!arrayList.contains(methodM4350r)) {
                                arrayList.add(methodM4350r);
                            }
                        }
                    }
                } catch (Throwable unused) {
                }
            }
            ArrayList arrayList2 = new ArrayList();
            for (Method method2 : arrayList) {
                if (isContactStorageQueryMethod(method2, cls)) {
                    for (Method method3 : arrayList) {
                        if (isContactStorageGetterMethod(method3, method2)) {
                            arrayList2.add(new Method[]{method3, method2});
                        }
                    }
                }
            }
            if (arrayList2.size() == 1) {
                this.contactStorageGetterMethod = KavaReflector.accessible(((Method[]) arrayList2.get(0))[0]);
                this.contactStorageQueryMethod = KavaReflector.accessible(((Method[]) arrayList2.get(0))[1]);
                return;
            }
            AbstractC1184v0.m3203m("[Hchat:DexFinder] 原生联系人查询API定位失败: pairs=" + arrayList2.size() + " invokes=" + arrayList.size() + " key=" + shortKey(this.runtimeCacheKey));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private void resolveFavoriteItemApi() {
        try {
            if (isFavoriteItemClass(this.favoriteItemClass)) {
                Method methodFindFavoriteItemConvertFromCursorMethod = findFavoriteItemConvertFromCursorMethod(this.favoriteItemClass);
                this.favoriteItemConvertFromCursorMethod = methodFindFavoriteItemConvertFromCursorMethod;
                if (methodFindFavoriteItemConvertFromCursorMethod != null) {
                    return;
                }
            }
            this.favoriteItemClass = null;
            this.favoriteItemConvertFromCursorMethod = null;
            Iterator it = this.dexKit.findClass(mkClassUsingStrings("FavItemInfo")).iterator();
            while (it.hasNext()) {
                Class<?> clsLoadClass = KavaReflector.loadClass(((C1724i) it.next()).m4345p().f8327g, this.classLoader);
                if (isFavoriteItemClass(clsLoadClass)) {
                    this.favoriteItemClass = clsLoadClass;
                    Method methodFindFavoriteItemConvertFromCursorMethod2 = findFavoriteItemConvertFromCursorMethod(clsLoadClass);
                    this.favoriteItemConvertFromCursorMethod = methodFindFavoriteItemConvertFromCursorMethod2;
                    if (methodFindFavoriteItemConvertFromCursorMethod2 != null) {
                        return;
                    }
                }
            }
            Iterator it2 = this.dexKit.findMethod(mkMethodUsingStrings("sendFavMsg: processing favId=%d, favType=%d, dataListSize=%d")).iterator();
            while (it2.hasNext()) {
                Class<?> clsFavoriteItemClassFromUsingFields = favoriteItemClassFromUsingFields((C1730o) it2.next());
                if (isFavoriteItemClass(clsFavoriteItemClassFromUsingFields)) {
                    this.favoriteItemClass = clsFavoriteItemClassFromUsingFields;
                    Method methodFindFavoriteItemConvertFromCursorMethod3 = findFavoriteItemConvertFromCursorMethod(clsFavoriteItemClassFromUsingFields);
                    this.favoriteItemConvertFromCursorMethod = methodFindFavoriteItemConvertFromCursorMethod3;
                    if (methodFindFavoriteItemConvertFromCursorMethod3 != null) {
                        return;
                    }
                }
            }
        } catch (Throwable th2) {
            AbstractC0255e.m1030s(th2, new StringBuilder("[Hchat:DexFinder] resolveFavoriteItemApi 失败: "), th2);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private void resolveFavoriteListApi() {
        Class<?> declaringClass;
        Method methodM4350r;
        try {
            if (this.favoriteServiceClass != null && isFavoriteServiceResolverMethod(this.favoriteServiceResolverMethod) && isFavoriteStorageGetterMethod(this.favoriteStorageGetterMethod) && isFavoriteListMethod(this.favoriteListMethod) && isFavoriteListNextMethod(this.favoriteListNextMethod) && isFavoriteListCursorMethod(this.favoriteListCursorMethod) && isFavoriteGetMethod(this.favoriteGetMethod)) {
                return;
            }
            this.favoriteServiceClass = null;
            this.favoriteServiceResolverMethod = null;
            this.favoriteStorageGetterMethod = null;
            this.favoriteListMethod = null;
            this.favoriteListNextMethod = null;
            this.favoriteListCursorMethod = null;
            this.favoriteGetMethod = null;
            Method methodFindFavoriteListCursorMethod = findFavoriteListCursorMethod();
            for (C1730o c1730o : this.dexKit.findMethod(mkMethodUsingStrings("getItemList error, getFavItemInfoStorage null.", "MicroMsg.Fav.FavApiLogic"))) {
                Iterator<E> it = c1730o.m4349q().iterator();
                Method method = null;
                Method method2 = null;
                Method method3 = null;
                while (it.hasNext()) {
                    try {
                        Method methodM4350r2 = ((C1730o) it.next()).m4350r(this.classLoader);
                        if (isFavoriteServiceResolverMethod(methodM4350r2)) {
                            method2 = methodM4350r2;
                        }
                        if (isFavoriteListMethod(methodM4350r2)) {
                            method = methodM4350r2;
                        }
                        if (isFavoriteListNextMethod(methodM4350r2)) {
                            method3 = methodM4350r2;
                        }
                    } catch (Throwable unused) {
                    }
                }
                if (method != null) {
                    Iterator<E> it2 = c1730o.m4349q().iterator();
                    while (it2.hasNext()) {
                        try {
                            methodM4350r = ((C1730o) it2.next()).m4350r(this.classLoader);
                            if (isFavoriteStorageGetterMethod(methodM4350r) && methodM4350r.getReturnType() == method.getDeclaringClass()) {
                                declaringClass = methodM4350r.getDeclaringClass();
                                break;
                            }
                        } catch (Throwable unused2) {
                        }
                    }
                    declaringClass = null;
                    methodM4350r = null;
                } else {
                    declaringClass = null;
                    methodM4350r = null;
                }
                if (method2 != null && methodM4350r != null && method != null && method3 != null && methodFindFavoriteListCursorMethod != null && declaringClass != null) {
                    KavaReflector.accessible(method2);
                    KavaReflector.accessible(methodM4350r);
                    KavaReflector.accessible(method);
                    KavaReflector.accessible(method3);
                    this.favoriteServiceClass = declaringClass;
                    this.favoriteServiceResolverMethod = method2;
                    this.favoriteStorageGetterMethod = methodM4350r;
                    this.favoriteListMethod = method;
                    this.favoriteListNextMethod = method3;
                    this.favoriteListCursorMethod = methodFindFavoriteListCursorMethod;
                    Method methodFindFavoriteGetMethod = findFavoriteGetMethod(method.getDeclaringClass());
                    this.favoriteGetMethod = methodFindFavoriteGetMethod;
                    if (methodFindFavoriteGetMethod != null) {
                        KavaReflector.accessible(methodFindFavoriteGetMethod);
                        return;
                    }
                }
            }
        } catch (Throwable th2) {
            AbstractC0255e.m1030s(th2, new StringBuilder("[Hchat:DexFinder] resolveFavoriteListApi 失败: "), th2);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private void resolveFavoriteSendApi() {
        try {
            if (isFavoriteSendMethod(this.favoriteSendMethod)) {
                this.favoriteSendParamClass = this.favoriteSendMethod.getParameterTypes().length == 3 ? this.favoriteSendMethod.getParameterTypes()[1] : null;
                return;
            }
            this.favoriteSendMethod = null;
            this.favoriteSendParamClass = null;
            Iterator it = this.dexKit.findMethod(mkMethodUsingStrings("want to send fav msg, but context is null", "want to send fav msg, but info is null")).iterator();
            while (it.hasNext()) {
                Method methodM4350r = ((C1730o) it.next()).m4350r(this.classLoader);
                if (isFavoriteSendMethod(methodM4350r)) {
                    KavaReflector.accessible(methodM4350r);
                    this.favoriteSendMethod = methodM4350r;
                    this.favoriteSendParamClass = methodM4350r.getParameterTypes().length == 3 ? methodM4350r.getParameterTypes()[1] : null;
                    return;
                }
            }
        } catch (Throwable th2) {
            AbstractC0255e.m1030s(th2, new StringBuilder("[Hchat:DexFinder] resolveFavoriteSendApi 失败: "), th2);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private void resolveImageBestPathApi() {
        try {
            if (!isImageBestPathMethod(this.imageBestPathMethod)) {
                this.imageBestPathMethod = null;
                Iterator it = this.dexKit.findMethod(mkMethodUsingStrings("[getBigPicPath] msg is null.")).iterator();
                while (it.hasNext()) {
                    try {
                        Method methodM4350r = ((C1730o) it.next()).m4350r(this.classLoader);
                        if (isImageBestPathMethod(methodM4350r)) {
                            KavaReflector.accessible(methodM4350r);
                            this.imageBestPathMethod = methodM4350r;
                            break;
                        }
                    } catch (Throwable unused) {
                    }
                }
            }
            Method method = this.imageBestPathMethod;
            Class<?> declaringClass = method != null ? method.getDeclaringClass() : null;
            if (!isImageStorageGetter(this.imageStorageGetterMethod, declaringClass)) {
                this.imageStorageGetterMethod = findImageStorageGetter(declaringClass);
            }
            if (!isImageTokenPathMethod(this.imageTokenPathMethod)) {
                this.imageTokenPathMethod = null;
                Iterator it2 = this.dexKit.findMethod(mkMethodUsingStrings("THUMBNAIL://", "THUMBNAIL_DIRPATH://", "read img buf failed: ")).iterator();
                while (it2.hasNext()) {
                    try {
                        Method methodM4350r2 = ((C1730o) it2.next()).m4350r(this.classLoader);
                        if (isImageTokenPathMethod(methodM4350r2)) {
                            this.imageTokenPathMethod = KavaReflector.accessible(methodM4350r2);
                            break;
                        }
                    } catch (Throwable unused2) {
                    }
                }
            }
            logDetail("图片原图路径API: path=" + methodName(this.imageBestPathMethod) + " storage=" + methodName(this.imageStorageGetterMethod) + " token=" + methodName(this.imageTokenPathMethod));
        } catch (Throwable th2) {
            AbstractC0255e.m1030s(th2, new StringBuilder("[Hchat:DexFinder] resolveImageBestPathApi 失败: "), th2);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private int resolveLocalMessageApiBySignature() {
        resolveLocalSystemMessageMethod();
        int i9 = 0;
        try {
            Method method = this.localMessageInsertMethod;
            if (method != null && this.localMessageCreateTimeMethod == null) {
                this.localMessageCreateTimeMethod = findLocalMessageCreateTimeMethod(method.getDeclaringClass());
            }
            if (this.localMessageInsertMethod == null || this.localMessageCreateTimeMethod == null) {
                C0570e c0570e = new C0570e();
                C1253k c1253k = new C1253k();
                c1253k.f4103g = new C1431c("x", 5);
                c1253k.m3373p0(Long.TYPE);
                c1253k.m3370m0(1);
                c0570e.f1764h = c1253k;
                C1731p c1731pFindMethod = this.dexKit.findMethod(c0570e);
                int size = c1731pFindMethod != null ? c1731pFindMethod.size() : 0;
                if (c1731pFindMethod != null) {
                    try {
                        Iterator it = c1731pFindMethod.iterator();
                        while (it.hasNext()) {
                            try {
                                Method methodM4350r = ((C1730o) it.next()).m4350r(this.classLoader);
                                if (isLocalMessageInsertMethod(methodM4350r)) {
                                    setLocalMessageApi(methodM4350r);
                                    return size;
                                }
                            } catch (Throwable unused) {
                            }
                        }
                        return size;
                    } catch (Throwable unused2) {
                        i9 = size;
                        return i9;
                    }
                }
            }
            return 0;
        } catch (Throwable unused3) {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private void resolveLocalSystemMessageMethod() {
        if (this.localSystemMessageMethod != null) {
            return;
        }
        try {
            Iterator it = this.dexKit.findMethod(mkMethodUsingStrings("will insert sysmsg from:", "content null, cannot to insert sysmsg!", "failed to insert sysmsg", "sysmsg inserted")).iterator();
            while (it.hasNext()) {
                try {
                    Method methodM4350r = ((C1730o) it.next()).m4350r(this.classLoader);
                    if (isLocalSystemMessageMethod(methodM4350r)) {
                        this.localSystemMessageMethod = KavaReflector.accessible(methodM4350r);
                        return;
                    }
                } catch (Throwable unused) {
                }
            }
        } catch (Throwable th2) {
            AbstractC0255e.m1030s(th2, new StringBuilder("[Hchat:DexFinder] resolveLocalSystemMessageMethod 失败: "), th2);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private void resolveMarsCdnDownloadApi() {
        Class<?> cls;
        Class<?> cls2;
        try {
            if (isMarsCdnReady()) {
                return;
            }
            try {
                this.marsCdnManagerClass = this.classLoader.loadClass("com.tencent.mars.cdn.CdnManager");
            } catch (Throwable unused) {
            }
            try {
                this.marsCdnDownloadRequestClass = this.classLoader.loadClass("com.tencent.mars.cdn.CdnManager$C2CDownloadRequest");
            } catch (Throwable unused2) {
            }
            if (this.marsCdnDownloadRequestClass == null) {
                try {
                    this.marsCdnDownloadRequestClass = this.classLoader.loadClass("com.tencent.mars.cdn.CdnLogic$C2CDownloadRequest");
                } catch (Throwable unused3) {
                }
            }
            if (this.marsCdnDownloadRequestClass == null) {
                Iterator it = this.dexKit.findClass(mkClassUsingStrings("must set marscdnBizType,apptype")).iterator();
                while (it.hasNext()) {
                    try {
                        Class clsM4346q = ((C1724i) it.next()).m4346q(this.classLoader);
                        if (isMarsCdnRequestClass(clsM4346q)) {
                            this.marsCdnDownloadRequestClass = clsM4346q;
                            break;
                        }
                        continue;
                    } catch (Throwable unused4) {
                    }
                }
            }
            if (this.marsCdnDownloadCallbackClass == null) {
                try {
                    this.marsCdnDownloadCallbackClass = this.classLoader.loadClass("com.tencent.mars.cdn.CdnManager$DownloadCallback");
                } catch (Throwable unused5) {
                }
            }
            if (this.marsCdnDownloadCallbackClass == null) {
                try {
                    this.marsCdnDownloadCallbackClass = this.classLoader.loadClass("com.tencent.mars.cdn.CdnLogic$DownloadCallback");
                } catch (Throwable unused6) {
                }
            }
            if (this.marsCdnDownloadCallbackClass == null) {
                Iterator it2 = this.dexKit.findClass(mkClassUsingStrings("aeskey must be 32 bytes")).iterator();
                while (it2.hasNext()) {
                    try {
                        Class clsM4346q2 = ((C1724i) it2.next()).m4346q(this.classLoader);
                        if (isMarsCdnCallbackClass(clsM4346q2)) {
                            this.marsCdnDownloadCallbackClass = clsM4346q2;
                            break;
                        }
                        continue;
                    } catch (Throwable unused7) {
                    }
                }
            }
            Class<?> cls3 = this.marsCdnManagerClass;
            if (cls3 != null && (cls = this.marsCdnDownloadRequestClass) != null && (cls2 = this.marsCdnDownloadCallbackClass) != null) {
                this.marsCdnStartDownloadMethod = findMarsStartDownloadMethod(cls3, cls, cls2);
            }
            Class<?> cls4 = this.marsCdnManagerClass;
            if (cls4 != null && this.marsCdnStartDownloadMethod == null) {
                Method[] declaredMethods = cls4.getDeclaredMethods();
                int length = declaredMethods.length;
                int i9 = 0;
                while (true) {
                    if (i9 >= length) {
                        break;
                    }
                    Method method = declaredMethods[i9];
                    if ("startC2CDownload".equals(method.getName())) {
                        Class<?>[] parameterTypes = method.getParameterTypes();
                        if (parameterTypes.length == 2) {
                            KavaReflector.accessible(method);
                            this.marsCdnStartDownloadMethod = method;
                            this.marsCdnDownloadRequestClass = parameterTypes[0];
                            this.marsCdnDownloadCallbackClass = parameterTypes[1];
                            break;
                        }
                    }
                    i9++;
                }
            }
            logDetail("Mars CDN下载API: manager=" + className(this.marsCdnManagerClass) + " request=" + className(this.marsCdnDownloadRequestClass) + " callback=" + className(this.marsCdnDownloadCallbackClass) + " start=" + methodName(this.marsCdnStartDownloadMethod));
        } catch (Throwable th2) {
            AbstractC0255e.m1030s(th2, new StringBuilder("[Hchat:DexFinder] resolveMarsCdnDownloadApi 失败: "), th2);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private void resolveNetworkQueue() {
        Class<?> clsFindFirstLikelyQueueClass;
        Class<?> clsLoadClass;
        try {
            collectKnownNetworkQueueClasses();
            C1731p c1731pFindMethod = this.dexKit.findMethod(mkMethodUsingStrings("doSceneImp"));
            Iterator it = c1731pFindMethod.iterator();
            while (it.hasNext()) {
                try {
                    clsLoadClass = KavaReflector.loadClass(((C1730o) it.next()).m4348p().f8333g, this.classLoader);
                    addNetQueueCandidate(clsLoadClass);
                } catch (Throwable unused) {
                }
                if (hasLikelyQueueSendMethod(clsLoadClass)) {
                    this.netQueueClass = clsLoadClass;
                    break;
                } else if (this.netQueueClass != null) {
                    break;
                }
            }
            if (this.netQueueClass == null) {
                Iterator it2 = c1731pFindMethod.iterator();
                while (it2.hasNext()) {
                    try {
                        addNetQueueCandidate(KavaReflector.loadClass(((C1730o) it2.next()).m4348p().f8333g, this.classLoader));
                    } catch (Throwable unused2) {
                    }
                }
            }
            collectNetworkQueueClassesByAnchors();
            Class<?> cls = this.netQueueClass;
            if ((cls == null || !hasLikelyQueueSendMethod(cls)) && (clsFindFirstLikelyQueueClass = findFirstLikelyQueueClass()) != null) {
                this.netQueueClass = clsFindFirstLikelyQueueClass;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("网络队列类: ");
            Class<?> cls2 = this.netQueueClass;
            sb2.append(cls2 != null ? cls2.getName() : "null");
            sb2.append(" candidates=");
            sb2.append(this.netQueueCandidateClasses.size());
            logDetail(sb2.toString());
        } catch (Throwable th2) {
            AbstractC0255e.m1030s(th2, new StringBuilder("[Hchat:DexFinder] resolveQueue 失败: "), th2);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private void resolveOpenLuckyMoney() {
        Class<?> clsLoadClass;
        Constructor<?> constructorFindCtorByArgCount;
        Constructor<?> constructorFindCtorByArgCount2;
        Class<?> clsLoadClass2;
        Constructor<?> constructorFindCtorByArgCount3;
        Constructor<?> constructorFindCtorByArgCount4;
        Constructor<?> constructorFindCtorByArgCount5;
        Class<?> clsLoadClass3;
        Constructor<?> constructorFindCtorByArgCount6;
        Constructor<?> constructorFindCtorByArgCount7;
        Constructor<?> constructorFindCtorByArgCount8;
        try {
            Iterator it = this.dexKit.findClass(mkClassUsingStrings("cgi-bin/mmpay-bin/openwxhb")).iterator();
            while (it.hasNext()) {
                try {
                    clsLoadClass3 = KavaReflector.loadClass(((C1724i) it.next()).m4345p().f8327g, this.classLoader);
                    constructorFindCtorByArgCount6 = findCtorByArgCount(clsLoadClass3, 10);
                    constructorFindCtorByArgCount7 = findCtorByArgCount(clsLoadClass3, 9);
                    constructorFindCtorByArgCount8 = findCtorByArgCount(clsLoadClass3, 8);
                } catch (Throwable unused) {
                }
                if (constructorFindCtorByArgCount6 != null || constructorFindCtorByArgCount7 != null || constructorFindCtorByArgCount8 != null) {
                    this.openLuckyMoneyClass = clsLoadClass3;
                    this.openCtor10 = constructorFindCtorByArgCount6;
                    this.openCtor9 = constructorFindCtorByArgCount7;
                    this.openCtor8 = constructorFindCtorByArgCount8;
                    break;
                }
            }
            if (this.openLuckyMoneyClass == null) {
                Iterator it2 = this.dexKit.findClass(mkClassUsingStrings("open lucky")).iterator();
                while (it2.hasNext()) {
                    try {
                        clsLoadClass2 = KavaReflector.loadClass(((C1724i) it2.next()).m4345p().f8327g, this.classLoader);
                        constructorFindCtorByArgCount3 = findCtorByArgCount(clsLoadClass2, 10);
                        constructorFindCtorByArgCount4 = findCtorByArgCount(clsLoadClass2, 9);
                        constructorFindCtorByArgCount5 = findCtorByArgCount(clsLoadClass2, 8);
                    } catch (Throwable unused2) {
                    }
                    if (constructorFindCtorByArgCount3 != null || constructorFindCtorByArgCount4 != null || constructorFindCtorByArgCount5 != null) {
                        this.openLuckyMoneyClass = clsLoadClass2;
                        this.openCtor10 = constructorFindCtorByArgCount3;
                        this.openCtor9 = constructorFindCtorByArgCount4;
                        this.openCtor8 = constructorFindCtorByArgCount5;
                        break;
                    }
                }
            }
            Iterator it3 = this.dexKit.findMethod(mkMethodUsingStrings("openluckyunion")).iterator();
            Class<?> cls = null;
            while (it3.hasNext()) {
                try {
                    clsLoadClass = KavaReflector.loadClass(((C1730o) it3.next()).m4348p().f8333g, this.classLoader);
                    if (cls == null) {
                        cls = clsLoadClass;
                    }
                    constructorFindCtorByArgCount = findCtorByArgCount(clsLoadClass, 10);
                    constructorFindCtorByArgCount2 = findCtorByArgCount(clsLoadClass, 9);
                } catch (Throwable unused3) {
                }
                if (constructorFindCtorByArgCount != null || constructorFindCtorByArgCount2 != null) {
                    this.openLuckyMoneyUnionClass = clsLoadClass;
                    this.unionOpenCtor10 = constructorFindCtorByArgCount;
                    this.unionOpenCtor9 = constructorFindCtorByArgCount2;
                    break;
                }
            }
            if (this.openLuckyMoneyUnionClass == null) {
                this.openLuckyMoneyUnionClass = cls;
            }
            Class<?> cls2 = this.openLuckyMoneyUnionClass;
            if (cls2 != null && this.unionOpenCtor10 == null && this.unionOpenCtor9 == null) {
                this.unionOpenCtor10 = findCtorByArgCount(cls2, 10);
                this.unionOpenCtor9 = findCtorByArgCount(this.openLuckyMoneyUnionClass, 9);
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("拆红包类: ");
            Class<?> cls3 = this.openLuckyMoneyClass;
            sb2.append(cls3 != null ? cls3.getName() : "null");
            logDetail(sb2.toString());
        } catch (Throwable th2) {
            AbstractC0255e.m1030s(th2, new StringBuilder("[Hchat:DexFinder] resolveOpen 失败: "), th2);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private void resolvePacketCompatClasses() {
        try {
            this.packetBaseClasses.clear();
            this.packetQueueClasses.clear();
            this.fakePacketClasses.clear();
            collectClassCandidates(this.packetBaseClasses, 10, new String[][]{new String[]{"MicroMsg.NetSceneBase"}});
            collectClassCandidates(this.packetQueueClasses, 10, new String[][]{new String[]{"doSceneImp mmcgi"}});
            collectClassCandidates(this.fakePacketClasses, 10, new String[][]{new String[]{"/cgi-bin/mmpay-bin/requestwxhb"}, new String[]{"NetScenePrepareLuckyMoney"}, new String[]{"sendMsgXml"}});
            logDetail("包兼容类: base=" + this.packetBaseClasses.size() + " queue=" + this.packetQueueClasses.size() + " fake=" + this.fakePacketClasses.size());
        } catch (Throwable th2) {
            AbstractC0255e.m1030s(th2, new StringBuilder("[Hchat:DexFinder] resolvePacketCompat 失败: "), th2);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private void resolvePatExtensionApi() {
        try {
            if (isPatCreatePairMethod(this.patCreatePairMethod) && isPatSuffixMethod(this.patSuffixMethod) && this.patExtensionClass != null) {
                return;
            }
            if (!isPatCreatePairMethod(this.patCreatePairMethod)) {
                Method methodFindPatCreatePairMethodByStrings = findPatCreatePairMethodByStrings("MicroMsg.PatMsgExtension", "insert pat msg %d %s %s");
                this.patCreatePairMethod = methodFindPatCreatePairMethodByStrings;
                if (methodFindPatCreatePairMethodByStrings == null) {
                    this.patCreatePairMethod = findPatCreatePairMethodByStrings("insert pat msg %d %s %s");
                }
            }
            if (!isPatSuffixMethod(this.patSuffixMethod)) {
                Method methodFindPatSuffixMethodByStrings = findPatSuffixMethodByStrings("MicroMsg.PatMsgExtension", "pattedUser %s, suffix %s");
                this.patSuffixMethod = methodFindPatSuffixMethodByStrings;
                if (methodFindPatSuffixMethodByStrings == null) {
                    this.patSuffixMethod = findPatSuffixMethodByStrings("pattedUser %s, suffix %s");
                }
            }
            if (!isPatCanSendMethod(this.patCanSendMethod)) {
                Method methodFindPatCanSendMethodByStrings = findPatCanSendMethodByStrings("MicroMsg.PatMsgExtension", "cannot pat, talker %s");
                this.patCanSendMethod = methodFindPatCanSendMethodByStrings;
                if (methodFindPatCanSendMethodByStrings == null) {
                    this.patCanSendMethod = findPatCanSendMethodByStrings("cannot pat, talker %s");
                }
            }
            Method method = this.patCreatePairMethod;
            if (method != null && this.patSuffixMethod != null && method.getDeclaringClass() == this.patSuffixMethod.getDeclaringClass()) {
                this.patExtensionClass = this.patCreatePairMethod.getDeclaringClass();
                if (isPatCanSendMethod(this.patCanSendMethod)) {
                    return;
                }
                this.patCanSendMethod = findPatCanSendMethod(this.patExtensionClass);
                return;
            }
            ArrayList<Class<?>> arrayList = new ArrayList();
            collectSendTextMethodOwnerCandidates(arrayList, 20, new String[][]{new String[]{"MicroMsg.PatMsgExtension", "insert pat msg %d %s %s"}, new String[]{"MicroMsg.PatMsgExtension", "pattedUser %s, suffix %s"}, new String[]{"insert pat msg %d %s %s"}, new String[]{"pattedUser %s, suffix %s"}});
            for (Class<?> cls : arrayList) {
                Method methodFindPatCreatePairMethod = findPatCreatePairMethod(cls);
                Method methodFindPatSuffixMethod = findPatSuffixMethod(cls);
                if (methodFindPatCreatePairMethod != null && methodFindPatSuffixMethod != null) {
                    this.patExtensionClass = cls;
                    this.patCreatePairMethod = methodFindPatCreatePairMethod;
                    this.patSuffixMethod = methodFindPatSuffixMethod;
                    this.patCanSendMethod = findPatCanSendMethod(cls);
                    return;
                }
            }
        } catch (Throwable th2) {
            AbstractC0255e.m1030s(th2, new StringBuilder("[Hchat:DexFinder] resolvePatExtensionApi 失败: "), th2);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private void resolvePatSendApi() {
        if (this.sendPatSceneCtor == null) {
            this.sendPatSceneCtor = findSendPatSceneCtor(this.sendPatSceneClass);
        }
        if (isPatCreatePairMethod(this.patCreatePairMethod) && isPatSuffixMethod(this.patSuffixMethod) && this.sendPatSceneCtor != null) {
            return;
        }
        resolvePatExtensionApi();
        resolveSendPatSceneApi();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private void resolveProtobufCallbackApi() {
        if (this.protobufNetSceneBaseClass == null) {
            return;
        }
        try {
            C0570e c0570e = new C0570e();
            C1253k c1253k = new C1253k();
            c1253k.f4103g = new C1431c("callback", 5);
            c1253k.m3373p0(Integer.TYPE);
            c1253k.m3370m0(5);
            c0570e.f1764h = c1253k;
            Iterator<E> it = this.dexKit.findMethod(c0570e).iterator();
            while (it.hasNext()) {
                try {
                    Method methodM4350r = ((C1730o) it.next()).m4350r(this.classLoader);
                    if (isProtobufCallbackMethod(methodM4350r)) {
                        this.protobufCallbackClass = methodM4350r.getDeclaringClass();
                        this.protobufReqRespClass = methodM4350r.getParameterTypes()[3];
                        return;
                    }
                } catch (Throwable unused) {
                }
            }
        } catch (Throwable unused2) {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private void resolveProtobufDispatchApi() {
        Class<?> cls;
        Method methodFindStaticDispatch;
        try {
            Class<?> cls2 = this.protobufReqRespClass;
            if ((cls2 != null && this.protobufCallbackClass != null && this.protobufStaticDispatchMethod != null) || cls2 == null || (cls = this.protobufCallbackClass) == null || (methodFindStaticDispatch = findStaticDispatch(cls2, cls)) == null) {
                return;
            }
            this.protobufStaticDispatchMethod = methodFindStaticDispatch;
        } catch (Throwable unused) {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private void resolveProtobufPacketApi() {
        try {
            Class<?> clsFindProtobufBaseClass = findProtobufBaseClass();
            if (clsFindProtobufBaseClass == null) {
                return;
            }
            if (this.protobufRawReqClass == null) {
                this.protobufRawReqClass = findRawReqClass();
            }
            if (this.protobufNewSendMsgReqClass == null) {
                this.protobufNewSendMsgReqClass = findNewSendMsgReqClass(clsFindProtobufBaseClass);
            }
            if (this.protobufOplogReqClass == null) {
                this.protobufOplogReqClass = findOplogReqClass(clsFindProtobufBaseClass);
            }
            if (this.protobufGenericRespClass == null) {
                this.protobufGenericRespClass = findGenericRespClass();
            }
            if (this.protobufConfigBuilderClass == null) {
                this.protobufConfigBuilderClass = findConfigBuilderClass(clsFindProtobufBaseClass);
            }
            if (this.protobufNetSceneBaseClass == null) {
                this.protobufNetSceneBaseClass = findProtobufNetSceneBaseClass();
            }
            Class<?> cls = this.protobufCallbackClass;
            if (cls != null && !cls.isInterface()) {
                this.protobufCallbackClass = null;
                this.protobufStaticDispatchMethod = null;
            }
            if (this.protobufReqRespClass == null || this.protobufCallbackClass == null) {
                resolveProtobufCallbackApi();
            }
            if (this.protobufOnGYNetEndClass == null) {
                this.protobufOnGYNetEndClass = findOnGYNetEndClass();
            }
            if (this.protobufReqRespClass == null) {
                this.protobufReqRespClass = findReqRespClassFromConfigBuilder();
            }
            resolveProtobufDispatchApi();
            List<Method> list = this.protobufSceneEndMethods;
            if (list == null || list.isEmpty()) {
                this.protobufSceneEndMethods = findProtobufSceneEndMethods();
            }
            StringBuilder sb2 = new StringBuilder("Protobuf包API: raw=");
            sb2.append(className(this.protobufRawReqClass));
            sb2.append(" sendMsg=");
            sb2.append(className(this.protobufNewSendMsgReqClass));
            sb2.append(" oplog=");
            sb2.append(className(this.protobufOplogReqClass));
            sb2.append(" resp=");
            sb2.append(className(this.protobufGenericRespClass));
            sb2.append(" builder=");
            sb2.append(className(this.protobufConfigBuilderClass));
            sb2.append(" reqResp=");
            sb2.append(className(this.protobufReqRespClass));
            sb2.append(" cb=");
            sb2.append(className(this.protobufCallbackClass));
            sb2.append(" gy=");
            sb2.append(className(this.protobufOnGYNetEndClass));
            sb2.append(" scene=");
            sb2.append(className(this.protobufNetSceneBaseClass));
            sb2.append(" dispatch=");
            sb2.append(methodName(this.protobufStaticDispatchMethod));
            sb2.append(" sceneEnd=");
            List<Method> list2 = this.protobufSceneEndMethods;
            sb2.append(list2 == null ? 0 : list2.size());
            logDetail(sb2.toString());
        } catch (Throwable th2) {
            AbstractC0255e.m1030s(th2, new StringBuilder("[Hchat:DexFinder] resolveProtobufPacketApi 失败: "), th2);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private void resolveReceiveLuckyMoney() {
        try {
            Iterator it = this.dexKit.findClass(mkClassUsingStrings("cgi-bin/mmpay-bin/receivewxhb")).iterator();
            while (it.hasNext()) {
                try {
                    Class<?> clsLoadClass = KavaReflector.loadClass(((C1724i) it.next()).m4345p().f8327g, this.classLoader);
                    Constructor<?> constructorFindFirstCtorByArgCounts = findFirstCtorByArgCounts(clsLoadClass, 7, 10, 8);
                    if (constructorFindFirstCtorByArgCounts != null) {
                        this.receiveLuckyMoneyClass = clsLoadClass;
                        this.receiveCtor = constructorFindFirstCtorByArgCounts;
                        break;
                    }
                    continue;
                } catch (Throwable unused) {
                }
            }
            if (this.receiveLuckyMoneyClass == null) {
                Iterator it2 = this.dexKit.findClass(mkClassUsingStrings("receivehongbao")).iterator();
                while (it2.hasNext()) {
                    try {
                        Class<?> clsLoadClass2 = KavaReflector.loadClass(((C1724i) it2.next()).m4345p().f8327g, this.classLoader);
                        Constructor<?> constructorFindCtorByArgCount = findCtorByArgCount(clsLoadClass2, 7);
                        if (constructorFindCtorByArgCount != null) {
                            this.receiveLuckyMoneyClass = clsLoadClass2;
                            this.receiveCtor = constructorFindCtorByArgCount;
                            break;
                        }
                        continue;
                    } catch (Throwable unused2) {
                    }
                }
            }
            Iterator it3 = this.dexKit.findMethod(mkMethodUsingStrings("receiveunion")).iterator();
            Class<?> cls = null;
            while (it3.hasNext()) {
                try {
                    Class<?> clsLoadClass3 = KavaReflector.loadClass(((C1730o) it3.next()).m4348p().f8333g, this.classLoader);
                    if (cls == null) {
                        cls = clsLoadClass3;
                    }
                    Constructor<?> constructorFindCtorByArgCount2 = findCtorByArgCount(clsLoadClass3, 6);
                    if (constructorFindCtorByArgCount2 != null) {
                        this.receiveLuckyMoneyUnionClass = clsLoadClass3;
                        this.unionReceiveCtor = constructorFindCtorByArgCount2;
                        break;
                    }
                    continue;
                } catch (Throwable unused3) {
                }
            }
            if (this.receiveLuckyMoneyUnionClass == null) {
                this.receiveLuckyMoneyUnionClass = cls;
                if (cls != null) {
                    this.unionReceiveCtor = findCtorByArgCount(cls, 6);
                }
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("收红包类: ");
            Class<?> cls2 = this.receiveLuckyMoneyClass;
            sb2.append(cls2 != null ? cls2.getName() : "null");
            logDetail(sb2.toString());
        } catch (Throwable th2) {
            AbstractC0255e.m1030s(th2, new StringBuilder("[Hchat:DexFinder] resolveReceive 失败: "), th2);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private void resolveSendFileAttachHelpers(Class<?> cls) {
        if (cls == null) {
            return;
        }
        try {
            if (this.sendFileAttachDirMethod == null) {
                Iterator<Method> it = KavaReflector.declaredMethods(cls).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Method next = it.next();
                    if (isStaticNoArgStringMethod(next)) {
                        KavaReflector.accessible(next);
                        if (looksLikeAttachDir(next)) {
                            this.sendFileAttachDirMethod = next;
                            break;
                        }
                    }
                }
            }
            if (this.sendFileAttachPathMethod == null) {
                for (Method method : KavaReflector.declaredMethods(cls)) {
                    if (isSendFileAttachPathMethod(method)) {
                        KavaReflector.accessible(method);
                        this.sendFileAttachPathMethod = method;
                        return;
                    }
                }
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private void resolveSendImageAsyncAppInfoApi() {
        try {
            if (isSendImageAsyncAppInfoApiReady()) {
                return;
            }
            resolveSendImageAsyncParamClasses();
            if (this.sendImageAppInfoClass == null) {
                this.sendImageAppInfoClass = findSendImageAppInfoClass();
            }
            if (!isSendImageAsyncSubmitMethod(this.sendImageAsyncSubmitMethod)) {
                this.sendImageAsyncSubmitMethod = findSendImageAsyncSubmitMethod();
            }
            logDetail("图片新版appid链路: params=" + className(this.sendImageAsyncParamsClass) + " cross=" + className(this.sendImageCrossParamsClass) + " appinfo=" + className(this.sendImageAppInfoClass) + " submit=" + methodName(this.sendImageAsyncSubmitMethod));
        } catch (Throwable th2) {
            AbstractC0255e.m1030s(th2, new StringBuilder("[Hchat:DexFinder] resolveSendImageAsyncAppInfoApi 失败: "), th2);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private void resolveSendImageAsyncParamClasses() {
        if (this.sendImageAsyncParamsClass == null || this.sendImageCrossParamsClass == null) {
            try {
                Iterator it = this.dexKit.findClass(mkClassUsingStrings("msg_raw_img_send", "crossParams", "imgPath", "fromUsername", "toUsername")).iterator();
                while (it.hasNext()) {
                    try {
                        Class<?> clsLoadClass = KavaReflector.loadClass(((C1724i) it.next()).m4345p().f8327g, this.classLoader);
                        Constructor<?> constructorFindSendImageAsyncParamsCtor = findSendImageAsyncParamsCtor(clsLoadClass);
                        if (constructorFindSendImageAsyncParamsCtor != null) {
                            this.sendImageAsyncParamsClass = clsLoadClass;
                            this.sendImageCrossParamsClass = constructorFindSendImageAsyncParamsCtor.getParameterTypes()[4];
                            return;
                        }
                    } catch (Throwable unused) {
                    }
                }
            } catch (Throwable unused2) {
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private void resolveSendPatSceneApi() {
        try {
            if (this.sendPatSceneCtor == null) {
                this.sendPatSceneCtor = findSendPatSceneCtor(this.sendPatSceneClass);
            }
            if (this.sendPatSceneCtor != null) {
                return;
            }
            ArrayList<Class<?>> arrayList = new ArrayList();
            collectSendTextClassCandidates(arrayList, 20, new String[][]{new String[]{"/cgi-bin/micromsg-bin/sendpat"}, new String[]{"MicroMsg.NetSceneSendPat"}, new String[]{"sendpat"}});
            collectSendTextMethodOwnerCandidates(arrayList, 20, new String[][]{new String[]{"/cgi-bin/micromsg-bin/sendpat"}, new String[]{"MicroMsg.NetSceneSendPat"}});
            for (Class<?> cls : arrayList) {
                if (isSendPatSceneClass(cls)) {
                    this.sendPatSceneClass = cls;
                    this.sendPatSceneCtor = findSendPatSceneCtor(cls);
                    return;
                }
            }
        } catch (Throwable th2) {
            AbstractC0255e.m1030s(th2, new StringBuilder("[Hchat:DexFinder] resolveSendPatSceneApi 失败: "), th2);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private void resolveSnsUploadMethods() {
        if (this.snsUploadPackHelperClass != null) {
            if (this.snsSetContentMethod == null) {
                this.snsSetContentMethod = findSnsHelperChainMethod("setContentDes");
            }
            if (this.snsSetSdkIdMethod == null) {
                this.snsSetSdkIdMethod = findSnsHelperChainMethod("setSdkId");
            }
            if (this.snsSetSdkAppNameMethod == null) {
                this.snsSetSdkAppNameMethod = findSnsHelperChainMethod("setSdkAppName");
            }
            if (this.snsAddImageMethod == null) {
                this.snsAddImageMethod = findSnsAddImageMethod(this.snsUploadPackHelperClass);
            }
            if (this.snsAddVideoMethod == null) {
                this.snsAddVideoMethod = findSnsAddVideoMethod(this.snsUploadPackHelperClass);
            }
            if (this.snsCommitMethod == null) {
                this.snsCommitMethod = findSnsCommitMethod(this.snsUploadPackHelperClass);
            }
        }
        Class<?> cls = this.snsUploadManagerClass;
        if (cls != null) {
            if (this.snsUploadManagerGetterMethod == null) {
                this.snsUploadManagerGetterMethod = findSnsUploadManagerGetter(cls);
            }
            if (this.snsShareAppMsgMethod == null) {
                this.snsShareAppMsgMethod = findSnsShareAppMsgMethod(this.snsUploadManagerClass);
            }
            if (this.snsUploadCheckMethod == null) {
                this.snsUploadCheckMethod = findSnsUploadCheckMethod(this.snsUploadManagerClass);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private void resolveVoicePlaybackApi() {
        boolean zIsVoicePlaybackStartMethod = isVoicePlaybackStartMethod(this.voicePlaybackStartMethod);
        Class<?> cls = Boolean.TYPE;
        if (!zIsVoicePlaybackStartMethod) {
            this.voicePlaybackStartMethod = findVoicePlaybackMethod(null, "start file name:[%s] speakerOn:[%b], isFullPath: %s, type: %s, userType: %s", cls, String.class, cls, cls, Integer.TYPE);
        }
        Method method = this.voicePlaybackStartMethod;
        Class<?> declaringClass = method != null ? method.getDeclaringClass() : null;
        if (declaringClass == null) {
            this.voicePlaybackPauseMethod = null;
            this.voicePlaybackResumeMethod = null;
            this.voicePlaybackStopMethod = null;
            return;
        }
        if (!isExactInstanceMethod(this.voicePlaybackPauseMethod, declaringClass, cls, cls)) {
            this.voicePlaybackPauseMethod = findVoicePlaybackMethod(declaringClass, "pause ret:%s", cls, cls);
        }
        if (!isExactInstanceMethod(this.voicePlaybackResumeMethod, declaringClass, cls, new Class[0])) {
            this.voicePlaybackResumeMethod = findVoicePlaybackMethod(declaringClass, "resumePlaying set mute false", cls, new Class[0]);
        }
        Class<?> cls2 = Void.TYPE;
        if (!isExactInstanceMethod(this.voicePlaybackStopMethod, declaringClass, cls2, cls)) {
            this.voicePlaybackStopMethod = findVoicePlaybackMethod(declaringClass, "stop player failed cause player is null %s", cls2, cls);
        }
        logDetail("语音播放API: start=" + methodName(this.voicePlaybackStartMethod) + " pause=" + methodName(this.voicePlaybackPauseMethod) + " resume=" + methodName(this.voicePlaybackResumeMethod) + " stop=" + methodName(this.voicePlaybackStopMethod));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private void resolveWishWxHb() {
        Class<?> clsLoadClass;
        Constructor<?> constructorFindCtorByArgCount;
        try {
            String[][] strArr = {new String[]{"/cgi-bin/mmpay-bin/wishwxhb"}, new String[]{"wishwxhb"}, new String[]{"NetSceneWishWxHb"}};
            for (int i9 = 0; i9 < 3; i9++) {
                Iterator it = this.dexKit.findClass(mkClassUsingStrings(strArr[i9])).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    try {
                        clsLoadClass = KavaReflector.loadClass(((C1724i) it.next()).m4345p().f8327g, this.classLoader);
                        constructorFindCtorByArgCount = findCtorByArgCount(clsLoadClass, 4);
                    } catch (Throwable unused) {
                    }
                    if (constructorFindCtorByArgCount != null) {
                        this.wishWxHbClass = clsLoadClass;
                        this.wishWxHbCtor = constructorFindCtorByArgCount;
                        break;
                    }
                }
                if (this.wishWxHbClass != null) {
                    break;
                }
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("祝福语类: ");
            Class<?> cls = this.wishWxHbClass;
            sb2.append(cls != null ? cls.getName() : "null");
            logDetail(sb2.toString());
        } catch (Throwable th2) {
            AbstractC0255e.m1030s(th2, new StringBuilder("[Hchat:DexFinder] resolveWish 失败: "), th2);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean sameOrAssignable(Class<?> cls, Class<?> cls2) {
        return cls == cls2 || cls.isAssignableFrom(cls2) || cls2.isAssignableFrom(cls);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean samePackage(Class<?> cls, Class<?> cls2) {
        if (cls != null && cls2 != null) {
            String name = cls.getName();
            String name2 = cls2.getName();
            int iLastIndexOf = name.lastIndexOf(46);
            if (iLastIndexOf == name2.lastIndexOf(46) && iLastIndexOf >= 0 && name.regionMatches(0, name2, 0, iLastIndexOf)) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private void saveCache() {
        if (this.cachePrefs == null || this.runtimeCacheKey.length() == 0) {
            return;
        }
        try {
            SharedPreferences.Editor editorClear = this.cachePrefs.edit().clear();
            editorClear.putString(CACHE_KEY, this.runtimeCacheKey);
            editorClear.putString("addMsgClasses", joinClassNames(this.addMsgClasses));
            putClass(editorClear, "receiveLuckyMoneyClass", this.receiveLuckyMoneyClass);
            putClass(editorClear, "receiveLuckyMoneyUnionClass", this.receiveLuckyMoneyUnionClass);
            putClass(editorClear, "openLuckyMoneyClass", this.openLuckyMoneyClass);
            putClass(editorClear, "openLuckyMoneyUnionClass", this.openLuckyMoneyUnionClass);
            putClass(editorClear, "netQueueClass", this.netQueueClass);
            editorClear.putString("netQueueCandidateClasses", joinClassNames(this.netQueueCandidateClasses));
            editorClear.putString("packetBaseClasses", joinClassNames(this.packetBaseClasses));
            editorClear.putString("packetQueueClasses", joinClassNames(this.packetQueueClasses));
            editorClear.putString("fakePacketClasses", joinClassNames(this.fakePacketClasses));
            putClass(editorClear, "protobufRawReqClass", this.protobufRawReqClass);
            putClass(editorClear, "protobufGenericRespClass", this.protobufGenericRespClass);
            putClass(editorClear, "protobufConfigBuilderClass", this.protobufConfigBuilderClass);
            putClass(editorClear, "protobufReqRespClass", this.protobufReqRespClass);
            putClass(editorClear, "protobufCallbackClass", this.protobufCallbackClass);
            putClass(editorClear, "protobufNewSendMsgReqClass", this.protobufNewSendMsgReqClass);
            putClass(editorClear, "protobufOplogReqClass", this.protobufOplogReqClass);
            putClass(editorClear, "protobufOnGYNetEndClass", this.protobufOnGYNetEndClass);
            putClass(editorClear, "protobufNetSceneBaseClass", this.protobufNetSceneBaseClass);
            putMethod(editorClear, "protobufStaticDispatchMethod", this.protobufStaticDispatchMethod);
            putMethodList(editorClear, "protobufSceneEndMethods", this.protobufSceneEndMethods);
            putClass(editorClear, "wishWxHbClass", this.wishWxHbClass);
            putClass(editorClear, "sendTextMsgClass", this.sendTextMsgClass);
            putMethod(editorClear, "serviceGetterMethod", this.serviceGetterMethod);
            putMethodList(editorClear, "getContactAddMethods", this.getContactAddMethods);
            putMethodList(editorClear, "getContactServiceGetters", this.getContactServiceGetters);
            putMethod(editorClear, "sendImageMethod", this.sendImageMethod);
            putClass(editorClear, "sendImageAsyncParamsClass", this.sendImageAsyncParamsClass);
            putClass(editorClear, "sendImageCrossParamsClass", this.sendImageCrossParamsClass);
            putClass(editorClear, "sendImageAppInfoClass", this.sendImageAppInfoClass);
            putMethod(editorClear, "sendImageAsyncSubmitMethod", this.sendImageAsyncSubmitMethod);
            putClass(editorClear, "imageCdnTaskClass", this.imageCdnTaskClass);
            putMethod(editorClear, "imageCdnSubmitMethod", this.imageCdnSubmitMethod);
            putMethod(editorClear, "imageCdnServiceGetterMethod", this.imageCdnServiceGetterMethod);
            putClass(editorClear, "marsCdnManagerClass", this.marsCdnManagerClass);
            putClass(editorClear, "marsCdnDownloadRequestClass", this.marsCdnDownloadRequestClass);
            putClass(editorClear, "marsCdnDownloadCallbackClass", this.marsCdnDownloadCallbackClass);
            putMethod(editorClear, "marsCdnStartDownloadMethod", this.marsCdnStartDownloadMethod);
            putMethod(editorClear, "imageBestPathMethod", this.imageBestPathMethod);
            putMethod(editorClear, "imageStorageGetterMethod", this.imageStorageGetterMethod);
            putMethod(editorClear, "imageTokenPathMethod", this.imageTokenPathMethod);
            putMethod(editorClear, "sendFileMethod", this.sendFileMethod);
            putMethod(editorClear, "sendFileAttachDirMethod", this.sendFileAttachDirMethod);
            putMethod(editorClear, "sendFileAttachPathMethod", this.sendFileAttachPathMethod);
            putMethod(editorClear, "sendXmlAppMsgMethod", this.sendXmlAppMsgMethod);
            putMethod(editorClear, "appMsgParseMethod", this.appMsgParseMethod);
            putClass(editorClear, "groupSolitairePluginClass", this.groupSolitairePluginClass);
            putMethod(editorClear, "groupSolitaireSendMethod", this.groupSolitaireSendMethod);
            putMethod(editorClear, "localSystemMessageMethod", this.localSystemMessageMethod);
            putClass(editorClear, "localMessageClass", this.localMessageClass);
            putMethod(editorClear, "localMessageInsertMethod", this.localMessageInsertMethod);
            putMethod(editorClear, "localMessageCreateTimeMethod", this.localMessageCreateTimeMethod);
            putMethod(editorClear, "sendVideoMethod", this.sendVideoMethod);
            putClass(editorClear, "sendVideoTaskClass", this.sendVideoTaskClass);
            putMethod(editorClear, "videoPathMethod", this.videoPathMethod);
            putMethod(editorClear, "videoPathOwnerGetterMethod", this.videoPathOwnerGetterMethod);
            putClass(editorClear, "videoInfoClass", this.videoInfoClass);
            putMethod(editorClear, "videoInfoByFileNameMethod", this.videoInfoByFileNameMethod);
            putClass(editorClear, "transferOperationClass", this.transferOperationClass);
            putClass(editorClear, "transferQueryClass", this.transferQueryClass);
            putMethod(editorClear, "transferQueryResponseMethod", this.transferQueryResponseMethod);
            putClass(editorClear, "verifyUserClass", this.verifyUserClass);
            putMethod(editorClear, "contactCardXmlMethod", this.contactCardXmlMethod);
            putMethod(editorClear, "patDisplayTemplateMethod", this.patDisplayTemplateMethod);
            putClass(editorClear, "patExtensionClass", this.patExtensionClass);
            putMethod(editorClear, "patCreatePairMethod", this.patCreatePairMethod);
            putMethod(editorClear, "patSuffixMethod", this.patSuffixMethod);
            putMethod(editorClear, "patCanSendMethod", this.patCanSendMethod);
            putClass(editorClear, "sendPatSceneClass", this.sendPatSceneClass);
            putMethod(editorClear, "voiceStartRecordMethod", this.voiceStartRecordMethod);
            putMethod(editorClear, "voiceFullPathMethod", this.voiceFullPathMethod);
            putMethod(editorClear, "voiceFinishRecordMethod", this.voiceFinishRecordMethod);
            putMethod(editorClear, "voiceInfoQueryMethod", this.voiceInfoQueryMethod);
            putClass(editorClear, "voiceUploadClass", this.voiceUploadClass);
            putMethod(editorClear, "voicePlaybackStartMethod", this.voicePlaybackStartMethod);
            putMethod(editorClear, "voicePlaybackPauseMethod", this.voicePlaybackPauseMethod);
            putMethod(editorClear, "voicePlaybackResumeMethod", this.voicePlaybackResumeMethod);
            putMethod(editorClear, "voicePlaybackStopMethod", this.voicePlaybackStopMethod);
            putMethod(editorClear, "emojiSendMethod", this.emojiSendMethod);
            putMethod(editorClear, "emojiManagerSendMethod", this.emojiManagerSendMethod);
            putMethod(editorClear, "emojiGetByMd5Method", this.emojiGetByMd5Method);
            putMethod(editorClear, "emojiCreateInfoMethod", this.emojiCreateInfoMethod);
            putMethod(editorClear, "emojiUpdateInfoMethod", this.emojiUpdateInfoMethod);
            putMethod(editorClear, "emojiAccPathMethod", this.emojiAccPathMethod);
            putMethod(editorClear, "emojiCheckGifMethod", this.emojiCheckGifMethod);
            putMethod(editorClear, "emojiFilePathMethod", this.emojiFilePathMethod);
            putMethod(editorClear, "emojiDecodeDataMethod", this.emojiDecodeDataMethod);
            putMethod(editorClear, "emojiDecodeManagerGetterMethod", this.emojiDecodeManagerGetterMethod);
            putClass(editorClear, "favoriteItemClass", this.favoriteItemClass);
            putMethod(editorClear, "favoriteItemConvertFromCursorMethod", this.favoriteItemConvertFromCursorMethod);
            putClass(editorClear, "favoriteServiceClass", this.favoriteServiceClass);
            putMethod(editorClear, "favoriteServiceResolverMethod", this.favoriteServiceResolverMethod);
            putMethod(editorClear, "favoriteStorageGetterMethod", this.favoriteStorageGetterMethod);
            putMethod(editorClear, "favoriteListMethod", this.favoriteListMethod);
            putMethod(editorClear, "favoriteListNextMethod", this.favoriteListNextMethod);
            putMethod(editorClear, "favoriteListCursorMethod", this.favoriteListCursorMethod);
            putMethod(editorClear, "favoriteGetMethod", this.favoriteGetMethod);
            putMethod(editorClear, "favoriteSendMethod", this.favoriteSendMethod);
            putClass(editorClear, "favoriteSendParamClass", this.favoriteSendParamClass);
            putClass(editorClear, "mmKernelClass", this.mmKernelClass);
            putClass(editorClear, "coreStorageClass", this.coreStorageClass);
            putClass(editorClear, "configStorageClass", this.configStorageClass);
            putClass(editorClear, "sqliteDbWrapperClass", this.sqliteDbWrapperClass);
            putMethod(editorClear, "coreStorageGetter", this.coreStorageGetter);
            putMethod(editorClear, "conversationDeleteMethod", this.conversationDeleteMethod);
            putMethod(editorClear, "messageClearByTalkerMethod", this.messageClearByTalkerMethod);
            putMethod(editorClear, "messageClearBatchMethod", this.messageClearBatchMethod);
            putMethod(editorClear, "contactMuteStateMethod", this.contactMuteStateMethod);
            putMethod(editorClear, "contactMuteEnableMethod", this.contactMuteEnableMethod);
            putMethod(editorClear, "contactMuteDisableMethod", this.contactMuteDisableMethod);
            putMethod(editorClear, "contactStorageGetterMethod", this.contactStorageGetterMethod);
            putMethod(editorClear, "contactStorageQueryMethod", this.contactStorageQueryMethod);
            putMethod(editorClear, "chatroomMuteServiceGetterMethod", this.chatroomMuteServiceGetterMethod);
            putMethod(editorClear, "chatroomMuteBuildMethod", this.chatroomMuteBuildMethod);
            putMethod(editorClear, "chatroomMuteSubmitMethod", this.chatroomMuteSubmitMethod);
            putMethod(editorClear, "groupMemberDisplayNameMethod", this.groupMemberDisplayNameMethod);
            putClass(editorClear, "addChatroomMemberClass", this.addChatroomMemberClass);
            putClass(editorClear, "inviteChatroomMemberClass", this.inviteChatroomMemberClass);
            putClass(editorClear, "delChatroomMemberClass", this.delChatroomMemberClass);
            putClass(editorClear, "revokeMsgClass", this.revokeMsgClass);
            putClass(editorClear, "uploadDeviceStepClass", this.uploadDeviceStepClass);
            putClass(editorClear, "addContactLabelClass", this.addContactLabelClass);
            putClass(editorClear, "modifyContactLabelListClass", this.modifyContactLabelListClass);
            putClass(editorClear, "snsUploadPackHelperClass", this.snsUploadPackHelperClass);
            putClass(editorClear, "snsUploadManagerClass", this.snsUploadManagerClass);
            putMethod(editorClear, "snsUploadManagerGetterMethod", this.snsUploadManagerGetterMethod);
            putMethod(editorClear, "snsSetContentMethod", this.snsSetContentMethod);
            putMethod(editorClear, "snsSetSdkIdMethod", this.snsSetSdkIdMethod);
            putMethod(editorClear, "snsSetSdkAppNameMethod", this.snsSetSdkAppNameMethod);
            putMethod(editorClear, "snsAddImageMethod", this.snsAddImageMethod);
            putMethod(editorClear, "snsAddVideoMethod", this.snsAddVideoMethod);
            putMethod(editorClear, "snsCommitMethod", this.snsCommitMethod);
            putMethod(editorClear, "snsShareAppMsgMethod", this.snsShareAppMsgMethod);
            putMethod(editorClear, "snsUploadCheckMethod", this.snsUploadCheckMethod);
            putMethod(editorClear, "chatPageStartMethod", this.chatPageStartMethod);
            putMethod(editorClear, "chatPageFragmentEnterMethod", this.chatPageFragmentEnterMethod);
            putMethod(editorClear, "chatPageFragmentExitMethod", this.chatPageFragmentExitMethod);
            putMethod(editorClear, "chatFooterSendClickMethod", this.chatFooterSendClickMethod);
            editorClear.putBoolean(CACHE_COMPLETE, true);
            editorClear.apply();
        } catch (Throwable th2) {
            AbstractC0255e.m1030s(th2, new StringBuilder("[Hchat:DexFinder] 保存缓存失败: "), th2);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private void setLocalMessageApi(Method method) {
        KavaReflector.accessible(method);
        this.localMessageInsertMethod = method;
        Class<?> cls = method.getParameterTypes()[0];
        this.localMessageClass = cls;
        this.localMessageCtor = findLocalMessageConstructor(cls);
        this.localMessageCreateTimeMethod = findLocalMessageCreateTimeMethod(method.getDeclaringClass());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private String shortKey(String str) {
        return str == null ? HttpUrl.FRAGMENT_ENCODE_SET : str.length() <= 80 ? str : str.substring(0, 80).concat("...");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private Class<?> typeOf(String str) {
        return "boolean".equals(str) ? Boolean.TYPE : "byte".equals(str) ? Byte.TYPE : "char".equals(str) ? Character.TYPE : "short".equals(str) ? Short.TYPE : "int".equals(str) ? Integer.TYPE : "long".equals(str) ? Long.TYPE : "float".equals(str) ? Float.TYPE : "double".equals(str) ? Double.TYPE : "void".equals(str) ? Void.TYPE : KavaReflector.loadClass(str, this.classLoader);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Class<?> findNativeNetSceneClass(String str, int i9) {
        if (str == null || str.length() == 0 || i9 <= 0) {
            return null;
        }
        try {
            C0568c c0568c = new C0568c();
            C1243a c1243a = new C1243a();
            c1243a.m3364q0(str);
            C1254l c1254l = new C1254l();
            C1253k c1253k = new C1253k();
            c1253k.f4103g = new C1431c("getType", 5);
            c1253k.m3373p0(Integer.TYPE);
            c1253k.m3375s0(Integer.valueOf(i9));
            c1254l.m3377k0(c1253k);
            c1243a.f4091j = c1254l;
            c0568c.f1762h = c1243a;
            Iterator<E> it = this.dexKit.findClass(c0568c).iterator();
            while (it.hasNext()) {
                Class<?> clsLoadClass = KavaReflector.loadClass(((C1724i) it.next()).m4345p().f8327g, this.classLoader);
                if (isNativeNetSceneCandidate(clsLoadClass, i9)) {
                    logDetail("原生NetScene定位: uri=" + str + " type=" + i9 + " class=" + clsLoadClass.getName());
                    return clsLoadClass;
                }
            }
        } catch (Throwable unused) {
        }
        try {
            Iterator<E> it2 = this.dexKit.findMethod(mkMethodUsingStrings(str)).iterator();
            while (it2.hasNext()) {
                Class<?> clsLoadClass2 = KavaReflector.loadClass(((C1730o) it2.next()).m4348p().f8333g, this.classLoader);
                if (isNativeNetSceneCandidate(clsLoadClass2, i9)) {
                    logDetail("原生NetScene定位: uri=" + str + " type=" + i9 + " class=" + clsLoadClass2.getName());
                    return clsLoadClass2;
                }
            }
            return null;
        } catch (Throwable th2) {
            AbstractC0255e.m1030s(th2, AbstractC0921a.m2258u(i9, "[Hchat:DexFinder] findNativeNetSceneClass 失败: uri=", str, " type=", " | "), th2);
            return null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean hasContactLabelNetworkApi() {
        if (this.addContactLabelCtorString == null && this.addContactLabelCtorList == null) {
            return false;
        }
        return (this.modifyContactLabelListCtor == null && findCtorByExactTypes(this.modifyContactLabelListClass, LinkedList.class) == null) ? false : true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean hasGroupSolitaireApi() {
        return (this.groupSolitairePluginClass == null || this.groupSolitaireSendMethod == null) ? false : true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean hasLocalMessageApi() {
        if (this.localSystemMessageMethod == null) {
            return (this.localMessageInsertMethod == null || this.localMessageCreateTimeMethod == null || this.localMessageClass == null || this.localMessageCtor == null) ? false : true;
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean hasRevokeMsgApi() {
        return (this.revokeMsgCtor == null && findRevokeMsgCtor(this.revokeMsgClass) == null) ? false : true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean hasSnsUploadApi() {
        if (!isSnsUploadPackHelperClass(this.snsUploadPackHelperClass) || !isSnsUploadManagerClass(this.snsUploadManagerClass)) {
            return false;
        }
        resolveSnsUploadMethods();
        return (this.snsUploadManagerGetterMethod == null || this.snsShareAppMsgMethod == null || this.snsSetContentMethod == null || this.snsAddImageMethod == null || this.snsCommitMethod == null || this.snsUploadCheckMethod == null) ? false : true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean hasTransferOperationApi() {
        Class<?> cls = this.transferOperationClass;
        return cls != null && hasTransferOperationCtor(cls);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean hasTransferQueryApi() {
        return isTransferQueryClass(this.transferQueryClass) && isTransferQueryResponseMethod(this.transferQueryResponseMethod, this.transferQueryClass);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean hasUploadDeviceStepApi() {
        return (this.uploadDeviceStepCtor == null && findUploadDeviceStepCtor(this.uploadDeviceStepClass) == null) ? false : true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean hasVerifyUserApi() {
        Class<?> cls = this.verifyUserClass;
        return cls != null && hasVerifyUserCtor(cls);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean isMarsCdnReady() {
        return (this.marsCdnManagerClass == null || this.marsCdnDownloadRequestClass == null || this.marsCdnDownloadCallbackClass == null || this.marsCdnStartDownloadMethod == null) ? false : true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean isPrivateConversationMuteApiReady() {
        return isServiceGetterMethod(this.serviceGetterMethod) && isContactMuteMethod(this.contactMuteEnableMethod) && isContactMuteMethod(this.contactMuteDisableMethod) && isContactStorageLookupApiReady();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public synchronized boolean isResolvedAll() {
        return this.resolvedAll;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void resolveAddChatroomMemberApi() {
        try {
            if (this.addChatroomMemberCtor == null) {
                this.addChatroomMemberCtor = findAddChatroomMemberCtor(this.addChatroomMemberClass);
            }
            if (this.addChatroomMemberCtor != null) {
                return;
            }
            ArrayList arrayList = new ArrayList();
            collectSendTextClassCandidates(arrayList, 20, new String[][]{new String[]{"/cgi-bin/micromsg-bin/addchatroommember"}, new String[]{"MicroMsg.NetSceneAddChatRoomMember"}, new String[]{"addchatroommember"}});
            collectSendTextMethodOwnerCandidates(arrayList, 20, new String[][]{new String[]{"/cgi-bin/micromsg-bin/addchatroommember"}, new String[]{"MicroMsg.NetSceneAddChatRoomMember"}});
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Class<?> cls = (Class) it.next();
                Constructor<?> constructorFindAddChatroomMemberCtor = findAddChatroomMemberCtor(cls);
                if (constructorFindAddChatroomMemberCtor != null) {
                    this.addChatroomMemberClass = cls;
                    this.addChatroomMemberCtor = constructorFindAddChatroomMemberCtor;
                    break;
                }
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("添加群成员API: ");
            Class<?> cls2 = this.addChatroomMemberClass;
            sb2.append(cls2 != null ? cls2.getName() : "null");
            logDetail(sb2.toString());
        } catch (Throwable th2) {
            AbstractC0255e.m1030s(th2, new StringBuilder("[Hchat:DexFinder] resolveAddChatroomMemberApi 失败: "), th2);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public synchronized void resolveAll() {
        if (this.resolvedAll) {
            logDetail("resolveAll 已完成，跳过重复解析");
            return;
        }
        if (loadCache()) {
            resolveServiceManagerApi();
            resolveGetContactServiceApi();
            resolveDatabaseApi();
            resolveConversationDeleteApi();
            resolveMessageClearApi();
            resolveConversationMuteApi();
            resolveGroupMemberDisplayName();
            resolveSendImageApi();
            resolveImageCdnDownloadApi();
            resolveSendFileApi();
            resolveSendXmlApi();
            resolveGroupSolitaireApi();
            resolveLocalMessageApi();
            resolveSendVideoTaskApi();
            resolveVideoPathApi();
            resolveVideoInfoApi();
            resolveSendVoiceApi();
            resolveSendEmojiApi();
            resolveFavoriteApi();
            resolveTransferOperationApi();
            resolveTransferQueryApi();
            resolveVerifyUserApi();
            resolveContactCardApi();
            resolvePatMessageApi();
            resolveProtobufPacketApi();
            resolveAddChatroomMemberApi();
            resolveInviteChatroomMemberApi();
            resolveDelChatroomMemberApi();
            resolveRevokeMsgApi();
            resolveUploadDeviceStepApi();
            resolveContactLabelNetworkApi();
            resolveSnsUploadApi();
            resolveChatPageApi();
            resolveScriptSendHookApi();
            saveCache();
            this.resolvedAll = true;
            logDetail("命中缓存: " + shortKey(this.runtimeCacheKey));
            return;
        }
        resolveAddMsgClasses();
        resolveReceiveLuckyMoney();
        resolveOpenLuckyMoney();
        resolveNetworkQueue();
        resolveServiceManagerApi();
        resolveSendTextMsg();
        resolveGetContactServiceApi();
        resolveSendImageApi();
        resolveImageCdnDownloadApi();
        resolveSendFileApi();
        resolveSendXmlApi();
        resolveGroupSolitaireApi();
        resolveLocalMessageApi();
        resolveSendVideoTaskApi();
        resolveVideoPathApi();
        resolveVideoInfoApi();
        resolveSendVoiceApi();
        resolveSendEmojiApi();
        resolveFavoriteApi();
        resolveTransferOperationApi();
        resolveTransferQueryApi();
        resolveVerifyUserApi();
        resolveContactCardApi();
        resolvePatMessageApi();
        resolveDatabaseApi();
        resolveConversationDeleteApi();
        resolveMessageClearApi();
        resolveConversationMuteApi();
        resolveGroupMemberDisplayName();
        resolveAddChatroomMemberApi();
        resolveInviteChatroomMemberApi();
        resolveDelChatroomMemberApi();
        resolveRevokeMsgApi();
        resolveUploadDeviceStepApi();
        resolveContactLabelNetworkApi();
        resolveSnsUploadApi();
        resolveChatPageApi();
        resolveScriptSendHookApi();
        resolveWishWxHb();
        resolvePacketCompatClasses();
        resolveProtobufPacketApi();
        logMissingCritical();
        saveCache();
        this.resolvedAll = true;
        logDetail("解析完成并缓存: " + shortKey(this.runtimeCacheKey));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void resolveChatPageApi() {
        Method method;
        try {
            Method method2 = this.chatPageStartMethod;
            if (method2 == null || this.chatPageFragmentEnterMethod == null || this.chatPageFragmentExitMethod == null) {
                if (method2 == null) {
                    Iterator it = this.dexKit.findMethod(mkMethodUsingStrings("try startChatting, ishow:%b userName:%s needAnim:%b")).iterator();
                    while (it.hasNext()) {
                        try {
                            Method methodM4350r = ((C1730o) it.next()).m4350r(this.classLoader);
                            if (isChatPageStartMethod(methodM4350r)) {
                                KavaReflector.accessible(methodM4350r);
                                this.chatPageStartMethod = methodM4350r;
                                break;
                            }
                        } catch (Throwable unused) {
                        }
                    }
                }
                if (this.chatPageFragmentEnterMethod == null) {
                    Iterator it2 = this.dexKit.findMethod(mkMethodUsingStrings("onEnterBegin", "Chat_User")).iterator();
                    while (it2.hasNext()) {
                        try {
                            Method methodM4350r2 = ((C1730o) it2.next()).m4350r(this.classLoader);
                            if (isNoArgVoidMethod(methodM4350r2)) {
                                KavaReflector.accessible(methodM4350r2);
                                this.chatPageFragmentEnterMethod = methodM4350r2;
                                break;
                            }
                        } catch (Throwable unused2) {
                        }
                    }
                }
                if (this.chatPageFragmentExitMethod == null && (method = this.chatPageFragmentEnterMethod) != null) {
                    Class<?> declaringClass = method.getDeclaringClass();
                    Iterator it3 = this.dexKit.findMethod(mkMethodUsingStrings("onExitBegin")).iterator();
                    while (it3.hasNext()) {
                        try {
                            Method methodM4350r3 = ((C1730o) it3.next()).m4350r(this.classLoader);
                            if (isNoArgVoidMethod(methodM4350r3) && methodM4350r3.getDeclaringClass() == declaringClass) {
                                KavaReflector.accessible(methodM4350r3);
                                this.chatPageFragmentExitMethod = methodM4350r3;
                                break;
                            }
                        } catch (Throwable unused3) {
                        }
                    }
                }
                logDetail("聊天页API: start=" + methodName(this.chatPageStartMethod) + " fragmentEnter=" + methodName(this.chatPageFragmentEnterMethod) + " fragmentExit=" + methodName(this.chatPageFragmentExitMethod));
            }
        } catch (Throwable th2) {
            AbstractC0255e.m1030s(th2, new StringBuilder("[Hchat:DexFinder] resolveChatPageApi 失败: "), th2);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void resolveContactCardApi() {
        try {
            if (isContactCardXmlMethod(this.contactCardXmlMethod)) {
                return;
            }
            Iterator it = this.dexKit.findMethod(mkMethodUsingStrings("MicroMsg.SendContactCardHelper", "getBizNameCardString")).iterator();
            while (it.hasNext()) {
                try {
                    Method methodM4350r = ((C1730o) it.next()).m4350r(this.classLoader);
                    if (isContactCardXmlMethod(methodM4350r)) {
                        this.contactCardXmlMethod = KavaReflector.accessible(methodM4350r);
                        break;
                    }
                } catch (Throwable unused) {
                }
            }
            if (this.contactCardXmlMethod == null) {
                Iterator it2 = this.dexKit.findMethod(mkMethodUsingStrings("bigheadimgurl", "smallheadimgurl")).iterator();
                while (it2.hasNext()) {
                    try {
                        Method methodM4350r2 = ((C1730o) it2.next()).m4350r(this.classLoader);
                        if (isContactCardXmlMethod(methodM4350r2)) {
                            this.contactCardXmlMethod = KavaReflector.accessible(methodM4350r2);
                            break;
                        }
                    } catch (Throwable unused2) {
                    }
                }
            }
            logDetail("名片XML方法: " + methodName(this.contactCardXmlMethod));
        } catch (Throwable th2) {
            AbstractC0255e.m1030s(th2, new StringBuilder("[Hchat:DexFinder] resolveContactCardApi 失败: "), th2);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void resolveContactLabelNetworkApi() {
        try {
            if (this.addContactLabelCtorString == null) {
                this.addContactLabelCtorString = findCtorByExactTypes(this.addContactLabelClass, String.class);
            }
            if (this.addContactLabelCtorList == null) {
                this.addContactLabelCtorList = findCtorByExactTypes(this.addContactLabelClass, List.class);
            }
            if (this.modifyContactLabelListCtor == null) {
                this.modifyContactLabelListCtor = findCtorByExactTypes(this.modifyContactLabelListClass, LinkedList.class);
            }
            if (this.addContactLabelCtorString == null || this.addContactLabelCtorList == null) {
                ArrayList<Class<?>> arrayList = new ArrayList();
                collectSendTextClassCandidates(arrayList, 20, new String[][]{new String[]{"/cgi-bin/micromsg-bin/addcontactlabel", "MicroMsg.Label.NetSceneAddContactLabel"}, new String[]{"NetSceneAddContactLabel"}, new String[]{"addcontactlabel"}});
                collectSendTextMethodOwnerCandidates(arrayList, 20, new String[][]{new String[]{"/cgi-bin/micromsg-bin/addcontactlabel", "MicroMsg.Label.NetSceneAddContactLabel"}, new String[]{"NetSceneAddContactLabel"}});
                for (Class<?> cls : arrayList) {
                    Constructor<?> constructorFindCtorByExactTypes = findCtorByExactTypes(cls, String.class);
                    Constructor<?> constructorFindCtorByExactTypes2 = findCtorByExactTypes(cls, List.class);
                    if (constructorFindCtorByExactTypes != null || constructorFindCtorByExactTypes2 != null) {
                        this.addContactLabelClass = cls;
                        if (constructorFindCtorByExactTypes != null) {
                            this.addContactLabelCtorString = constructorFindCtorByExactTypes;
                        }
                        if (constructorFindCtorByExactTypes2 != null) {
                            this.addContactLabelCtorList = constructorFindCtorByExactTypes2;
                        }
                    }
                }
            }
            if (this.modifyContactLabelListCtor == null) {
                ArrayList arrayList2 = new ArrayList();
                collectSendTextClassCandidates(arrayList2, 20, new String[][]{new String[]{"/cgi-bin/micromsg-bin/modifycontactlabellist", "MicroMsg.Label.NetSceneModifyContactLabelList"}, new String[]{"NetSceneModifyContactLabelList"}, new String[]{"modifycontactlabellist"}});
                collectSendTextMethodOwnerCandidates(arrayList2, 20, new String[][]{new String[]{"/cgi-bin/micromsg-bin/modifycontactlabellist", "MicroMsg.Label.NetSceneModifyContactLabelList"}, new String[]{"NetSceneModifyContactLabelList"}});
                Iterator it = arrayList2.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Class<?> cls2 = (Class) it.next();
                    Constructor<?> constructorFindCtorByExactTypes3 = findCtorByExactTypes(cls2, LinkedList.class);
                    if (constructorFindCtorByExactTypes3 != null) {
                        this.modifyContactLabelListClass = cls2;
                        this.modifyContactLabelListCtor = constructorFindCtorByExactTypes3;
                        break;
                    }
                }
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("联系人标签网络API: add=");
            Class<?> cls3 = this.addContactLabelClass;
            sb2.append(cls3 != null ? cls3.getName() : "null");
            sb2.append(" modify=");
            Class<?> cls4 = this.modifyContactLabelListClass;
            sb2.append(cls4 != null ? cls4.getName() : "null");
            logDetail(sb2.toString());
        } catch (Throwable th2) {
            AbstractC0255e.m1030s(th2, new StringBuilder("[Hchat:DexFinder] resolveContactLabelNetworkApi 失败: "), th2);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void resolveConversationDeleteApi() {
        try {
            if (isConversationDeleteMethod(this.conversationDeleteMethod)) {
                return;
            }
            this.conversationDeleteMethod = null;
            ArrayList arrayList = new ArrayList();
            C0570e c0570e = new C0570e();
            C1253k c1253k = new C1253k();
            c1253k.m3374r0("delChatContact username:%s  stack:%s");
            c0570e.f1764h = c1253k;
            Iterator<E> it = this.dexKit.findMethod(c0570e).iterator();
            while (it.hasNext()) {
                try {
                    Method methodM4350r = ((C1730o) it.next()).m4350r(this.classLoader);
                    if (isConversationDeleteMethod(methodM4350r) && !arrayList.contains(methodM4350r)) {
                        KavaReflector.accessible(methodM4350r);
                        arrayList.add(methodM4350r);
                    }
                } catch (Throwable unused) {
                }
            }
            if (arrayList.size() == 1) {
                this.conversationDeleteMethod = (Method) arrayList.get(0);
                logDetail("原生会话删除API: " + methodName(this.conversationDeleteMethod));
                return;
            }
            AbstractC1184v0.m3203m("[Hchat:DexFinder] 原生会话删除API定位失败: candidates=" + arrayList.size() + " key=" + shortKey(this.runtimeCacheKey));
        } catch (Throwable th2) {
            AbstractC0255e.m1030s(th2, new StringBuilder("[Hchat:DexFinder] resolveConversationDeleteApi 失败: "), th2);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void resolveConversationMuteApi() {
        try {
            if (!isServiceGetterMethod(this.serviceGetterMethod)) {
                resolveServiceManagerApi();
            }
            if (!isContactMuteMethod(this.contactMuteEnableMethod)) {
                this.contactMuteEnableMethod = findUniqueMethodUsingString("setMute contact invalid username");
            }
            if (!isContactMuteMethod(this.contactMuteDisableMethod)) {
                this.contactMuteDisableMethod = findUniqueMethodUsingString("unSetMute contact invalid username");
            }
            if (!isContactMuteStateMethod(this.contactMuteStateMethod, this.contactMuteEnableMethod)) {
                this.contactMuteStateMethod = findContactMuteStateMethod();
            }
            if (!isContactStorageLookupApiReady()) {
                resolveContactStorageLookupApi();
            }
            if (!isChatroomMuteApiReady()) {
                resolveChatroomMuteApi();
            }
            logDetail("原生免打扰API: state=" + methodName(this.contactMuteStateMethod) + " enable=" + methodName(this.contactMuteEnableMethod) + " disable=" + methodName(this.contactMuteDisableMethod) + " contactStorageGetter=" + methodName(this.contactStorageGetterMethod) + " contactStorageQuery=" + methodName(this.contactStorageQueryMethod) + " roomGetter=" + methodName(this.chatroomMuteServiceGetterMethod) + " roomBuild=" + methodName(this.chatroomMuteBuildMethod) + " roomSubmit=" + methodName(this.chatroomMuteSubmitMethod));
        } catch (Throwable th2) {
            AbstractC0255e.m1030s(th2, new StringBuilder("[Hchat:DexFinder] resolveConversationMuteApi 失败: "), th2);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void resolveDatabaseApi() {
        try {
            if (this.coreStorageGetter == null || this.sqliteDbWrapperClass == null || this.configStorageClass == null) {
                this.mmKernelClass = findFirstClassByStrings("MicroMsg.MMKernel", "Kernel not null, has initialized.");
                Iterator it = this.dexKit.findMethod(mkMethodUsingStrings("mCoreStorage not initialized!")).iterator();
                while (it.hasNext()) {
                    try {
                        Method methodM4350r = ((C1730o) it.next()).m4350r(this.classLoader);
                        if (methodM4350r.getParameterTypes().length == 0 && methodM4350r.getReturnType() != Void.TYPE) {
                            KavaReflector.accessible(methodM4350r);
                            this.coreStorageGetter = methodM4350r;
                            this.coreStorageClass = methodM4350r.getReturnType();
                            break;
                        }
                    } catch (Throwable unused) {
                    }
                }
                if (this.coreStorageClass == null) {
                    this.coreStorageClass = findFirstClassByStrings("MMKernel.CoreStorage", "CheckData path[%s] blocksize:%s blockcount:%s availcount:%s");
                }
                this.configStorageClass = findFirstClassByStrings("MicroMsg.ConfigStorage", "shouldProcessEvent db is close :%s");
                this.sqliteDbWrapperClass = findFirstClassByStrings("MicroMsg.SqliteDB", "sql is null ");
                StringBuilder sb2 = new StringBuilder();
                sb2.append("数据库API: kernel=");
                Class<?> cls = this.mmKernelClass;
                sb2.append(cls != null ? cls.getName() : "null");
                sb2.append(" storageGetter=");
                Method method = this.coreStorageGetter;
                sb2.append(method != null ? method.getName() : "null");
                sb2.append(" coreStorage=");
                Class<?> cls2 = this.coreStorageClass;
                sb2.append(cls2 != null ? cls2.getName() : "null");
                sb2.append(" config=");
                Class<?> cls3 = this.configStorageClass;
                sb2.append(cls3 != null ? cls3.getName() : "null");
                sb2.append(" sqlite=");
                Class<?> cls4 = this.sqliteDbWrapperClass;
                sb2.append(cls4 != null ? cls4.getName() : "null");
                logDetail(sb2.toString());
            }
        } catch (Throwable th2) {
            AbstractC0255e.m1030s(th2, new StringBuilder("[Hchat:DexFinder] resolveDatabaseApi 失败: "), th2);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void resolveDelChatroomMemberApi() {
        try {
            if (this.delChatroomMemberCtor == null) {
                this.delChatroomMemberCtor = findDelChatroomMemberCtor(this.delChatroomMemberClass);
            }
            if (this.delChatroomMemberCtor != null) {
                return;
            }
            ArrayList arrayList = new ArrayList();
            collectSendTextClassCandidates(arrayList, 20, new String[][]{new String[]{"/cgi-bin/micromsg-bin/delchatroommember"}, new String[]{"delchatroommember"}});
            collectSendTextMethodOwnerCandidates(arrayList, 20, new String[][]{new String[]{"/cgi-bin/micromsg-bin/delchatroommember"}});
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Class<?> cls = (Class) it.next();
                Constructor<?> constructorFindDelChatroomMemberCtor = findDelChatroomMemberCtor(cls);
                if (constructorFindDelChatroomMemberCtor != null) {
                    this.delChatroomMemberClass = cls;
                    this.delChatroomMemberCtor = constructorFindDelChatroomMemberCtor;
                    break;
                }
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("移除群成员API: ");
            Class<?> cls2 = this.delChatroomMemberClass;
            sb2.append(cls2 != null ? cls2.getName() : "null");
            logDetail(sb2.toString());
        } catch (Throwable th2) {
            AbstractC0255e.m1030s(th2, new StringBuilder("[Hchat:DexFinder] resolveDelChatroomMemberApi 失败: "), th2);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void resolveFavoriteApi() {
        try {
            resolveFavoriteItemApi();
            resolveFavoriteListApi();
            resolveFavoriteSendApi();
            StringBuilder sb2 = new StringBuilder("收藏API: item=");
            Class<?> cls = this.favoriteItemClass;
            sb2.append(cls != null ? cls.getName() : "null");
            sb2.append(" convert=");
            sb2.append(methodName(this.favoriteItemConvertFromCursorMethod));
            sb2.append(" list=");
            sb2.append(methodName(this.favoriteListMethod));
            sb2.append(" send=");
            sb2.append(methodName(this.favoriteSendMethod));
            sb2.append(" param=");
            Class<?> cls2 = this.favoriteSendParamClass;
            sb2.append(cls2 != null ? cls2.getName() : "null");
            logDetail(sb2.toString());
        } catch (Throwable th2) {
            AbstractC0255e.m1030s(th2, new StringBuilder("[Hchat:DexFinder] resolveFavoriteApi 失败: "), th2);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void resolveGetContactServiceApi() {
        try {
            if (this.getContactAddMethods.isEmpty()) {
                collectGetContactAddMethods("dkverify add Contact");
                collectGetContactAddMethods("[addContact] has consume");
            }
            if (this.getContactServiceGetters.isEmpty()) {
                collectGetContactServiceGetters();
            }
            logDetail("联系人资料服务方法: " + this.getContactAddMethods.size());
        } catch (Throwable th2) {
            AbstractC0255e.m1030s(th2, new StringBuilder("[Hchat:DexFinder] resolveGetContactServiceApi 失败: "), th2);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void resolveGroupMemberDisplayName() {
        String str;
        try {
            if (this.groupMemberDisplayNameMethod != null) {
                return;
            }
            Iterator it = this.dexKit.findMethod(mkMethodUsingStrings("ChatroomDisplayNameCache")).iterator();
            while (it.hasNext()) {
                try {
                    Method methodM4350r = ((C1730o) it.next()).m4350r(this.classLoader);
                    if (methodM4350r.getReturnType() == String.class) {
                        Class<?>[] parameterTypes = methodM4350r.getParameterTypes();
                        if (parameterTypes.length == 2 && parameterTypes[0] == String.class && parameterTypes[1] == String.class) {
                            KavaReflector.accessible(methodM4350r);
                            this.groupMemberDisplayNameMethod = methodM4350r;
                            break;
                        }
                    } else {
                        continue;
                    }
                } catch (Throwable unused) {
                }
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("群成员昵称方法: ");
            if (this.groupMemberDisplayNameMethod != null) {
                str = this.groupMemberDisplayNameMethod.getDeclaringClass().getName() + "#" + this.groupMemberDisplayNameMethod.getName();
            } else {
                str = "null";
            }
            sb2.append(str);
            logDetail(sb2.toString());
        } catch (Throwable th2) {
            AbstractC0255e.m1030s(th2, new StringBuilder("[Hchat:DexFinder] resolveGroupMemberDisplayName 失败: "), th2);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void resolveGroupSolitaireApi() {
        try {
            if (this.groupSolitaireSendMethod == null || this.groupSolitairePluginClass == null) {
                ArrayList arrayList = new ArrayList();
                collectSendTextClassCandidates(arrayList, 20, new String[][]{new String[]{"sendGroupSolitatire() content ret:%s", "PluginGroupSolitaire"}, new String[]{"GroupSolitaire", "sendGroupSolitatire"}, new String[]{"solitaire_info", "PluginGroupSolitaire"}});
                collectSendTextMethodOwnerCandidates(arrayList, 20, new String[][]{new String[]{"sendGroupSolitatire() content ret:%s", "PluginGroupSolitaire"}, new String[]{"sendGroupSolitatire"}});
                Iterator it = arrayList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Class<?> cls = (Class) it.next();
                    Method methodFindGroupSolitaireSendMethod = findGroupSolitaireSendMethod(cls);
                    if (methodFindGroupSolitaireSendMethod != null) {
                        this.groupSolitairePluginClass = cls;
                        this.groupSolitaireSendMethod = methodFindGroupSolitaireSendMethod;
                        break;
                    }
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append("接龙发送API: ");
                Class<?> cls2 = this.groupSolitairePluginClass;
                sb2.append(cls2 != null ? cls2.getName() : "null");
                sb2.append(" method=");
                sb2.append(methodName(this.groupSolitaireSendMethod));
                logDetail(sb2.toString());
            }
        } catch (Throwable th2) {
            AbstractC0255e.m1030s(th2, new StringBuilder("[Hchat:DexFinder] resolveGroupSolitaireApi 失败: "), th2);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void resolveImageCdnDownloadApi() {
        Method methodM4350r;
        Class<?> returnType;
        try {
            resolveMarsCdnDownloadApi();
            if (isImageCdnTaskClass(this.imageCdnTaskClass) && isPreferredImageCdnSubmitMethod(this.imageCdnSubmitMethod) && isImageCdnServiceGetterMethod(this.imageCdnServiceGetterMethod)) {
                return;
            }
            this.imageCdnSubmitMethod = null;
            this.imageCdnServiceGetterMethod = null;
            if (!isImageCdnTaskClass(this.imageCdnTaskClass)) {
                Iterator it = this.dexKit.findClass(mkClassUsingStrings("field_fullpath", "field_fileId", "field_aesKey", "field_fileType")).iterator();
                while (it.hasNext()) {
                    try {
                        Class clsM4346q = ((C1724i) it.next()).m4346q(this.classLoader);
                        if (isImageCdnTaskClass(clsM4346q)) {
                            this.imageCdnTaskClass = clsM4346q;
                            break;
                        }
                    } catch (Throwable unused) {
                    }
                }
            }
            if (!isImageCdnTaskClass(this.imageCdnTaskClass)) {
                Iterator it2 = this.dexKit.findMethod(mkMethodUsingStrings("field_fullpath", "field_fileId", "field_fileType")).iterator();
                while (it2.hasNext()) {
                    try {
                        methodM4350r = ((C1730o) it2.next()).m4350r(this.classLoader);
                        returnType = methodM4350r.getReturnType();
                    } catch (Throwable unused2) {
                    }
                    if (isImageCdnTaskClass(returnType)) {
                        this.imageCdnTaskClass = returnType;
                        break;
                    }
                    Class<?>[] parameterTypes = methodM4350r.getParameterTypes();
                    int length = parameterTypes.length;
                    int i9 = 0;
                    while (true) {
                        if (i9 >= length) {
                            break;
                        }
                        Class<?> cls = parameterTypes[i9];
                        if (isImageCdnTaskClass(cls)) {
                            this.imageCdnTaskClass = cls;
                            break;
                        }
                        i9++;
                    }
                    if (this.imageCdnTaskClass != null) {
                        break;
                    }
                }
            }
            if (this.imageCdnTaskClass != null) {
                C0570e c0570e = new C0570e();
                C1253k c1253k = new C1253k();
                c1253k.m3370m0(2);
                c0570e.f1764h = c1253k;
                Iterator it3 = this.dexKit.findMethod(c0570e).iterator();
                while (it3.hasNext()) {
                    try {
                        Method methodM4350r2 = ((C1730o) it3.next()).m4350r(this.classLoader);
                        if (isPreferredImageCdnSubmitMethod(methodM4350r2)) {
                            KavaReflector.accessible(methodM4350r2);
                            this.imageCdnSubmitMethod = methodM4350r2;
                            break;
                        }
                    } catch (Throwable unused3) {
                    }
                }
            }
            if (this.imageCdnTaskClass != null && this.imageCdnSubmitMethod == null) {
                C0570e c0570e2 = new C0570e();
                C1253k c1253k2 = new C1253k();
                c1253k2.m3370m0(1);
                c0570e2.f1764h = c1253k2;
                Iterator it4 = this.dexKit.findMethod(c0570e2).iterator();
                while (it4.hasNext()) {
                    try {
                        Method methodM4350r3 = ((C1730o) it4.next()).m4350r(this.classLoader);
                        if (isImageCdnSubmitMethod(methodM4350r3)) {
                            KavaReflector.accessible(methodM4350r3);
                            this.imageCdnSubmitMethod = methodM4350r3;
                            break;
                        }
                    } catch (Throwable unused4) {
                    }
                }
            }
            if (this.imageCdnSubmitMethod == null) {
                Iterator it5 = this.dexKit.findMethod(mkMethodUsingStrings("field_fileId", "field_aesKey", "field_fullpath")).iterator();
                while (it5.hasNext()) {
                    try {
                        Method methodM4350r4 = ((C1730o) it5.next()).m4350r(this.classLoader);
                        if (isImageCdnSubmitMethod(methodM4350r4)) {
                            KavaReflector.accessible(methodM4350r4);
                            this.imageCdnSubmitMethod = methodM4350r4;
                            this.imageCdnTaskClass = methodM4350r4.getParameterTypes()[0];
                            break;
                        }
                    } catch (Throwable unused5) {
                    }
                }
            }
            Method method = this.imageCdnSubmitMethod;
            if (method != null) {
                Class<?> declaringClass = method.getDeclaringClass();
                C0570e c0570e3 = new C0570e();
                C1253k c1253k3 = new C1253k();
                c1253k3.m3370m0(0);
                c0570e3.f1764h = c1253k3;
                Iterator it6 = this.dexKit.findMethod(c0570e3).iterator();
                while (it6.hasNext()) {
                    try {
                        Method methodM4350r5 = ((C1730o) it6.next()).m4350r(this.classLoader);
                        if (KavaReflector.isStatic(methodM4350r5) && methodM4350r5.getReturnType() == declaringClass) {
                            KavaReflector.accessible(methodM4350r5);
                            this.imageCdnServiceGetterMethod = methodM4350r5;
                            break;
                        }
                    } catch (Throwable unused6) {
                    }
                }
            }
            logDetail("图片CDN下载API: task=" + className(this.imageCdnTaskClass) + " submit=" + methodName(this.imageCdnSubmitMethod) + " getter=" + methodName(this.imageCdnServiceGetterMethod));
        } catch (Throwable th2) {
            AbstractC0255e.m1030s(th2, new StringBuilder("[Hchat:DexFinder] resolveImageCdnDownloadApi 失败: "), th2);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void resolveInviteChatroomMemberApi() {
        try {
            if (this.inviteChatroomMemberCtor == null) {
                this.inviteChatroomMemberCtor = findInviteChatroomMemberCtor(this.inviteChatroomMemberClass);
            }
            if (this.inviteChatroomMemberCtor != null) {
                return;
            }
            ArrayList arrayList = new ArrayList();
            collectSendTextClassCandidates(arrayList, 20, new String[][]{new String[]{"/cgi-bin/micromsg-bin/invitechatroommember"}, new String[]{"MicroMsg.NetSceneInviteChatRoomMember"}, new String[]{"invitechatroommember"}});
            collectSendTextMethodOwnerCandidates(arrayList, 20, new String[][]{new String[]{"/cgi-bin/micromsg-bin/invitechatroommember"}, new String[]{"MicroMsg.NetSceneInviteChatRoomMember"}});
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Class<?> cls = (Class) it.next();
                Constructor<?> constructorFindInviteChatroomMemberCtor = findInviteChatroomMemberCtor(cls);
                if (constructorFindInviteChatroomMemberCtor != null) {
                    this.inviteChatroomMemberClass = cls;
                    this.inviteChatroomMemberCtor = constructorFindInviteChatroomMemberCtor;
                    break;
                }
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("邀请群成员API: ");
            Class<?> cls2 = this.inviteChatroomMemberClass;
            sb2.append(cls2 != null ? cls2.getName() : "null");
            logDetail(sb2.toString());
        } catch (Throwable th2) {
            AbstractC0255e.m1030s(th2, new StringBuilder("[Hchat:DexFinder] resolveInviteChatroomMemberApi 失败: "), th2);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void resolveLocalMessageApi() {
        try {
            if (!hasLocalMessageApi() || this.localMessageCreateTimeMethod == null) {
                int iResolveLocalMessageApiBySignature = resolveLocalMessageApiBySignature();
                StringBuilder sb2 = new StringBuilder("本地消息API: insert=");
                sb2.append(methodName(this.localMessageInsertMethod));
                sb2.append(" system=");
                sb2.append(methodName(this.localSystemMessageMethod));
                sb2.append(" createTime=");
                sb2.append(methodName(this.localMessageCreateTimeMethod));
                sb2.append(" msg=");
                Class<?> cls = this.localMessageClass;
                sb2.append(cls != null ? cls.getName() : "null");
                sb2.append(" ctor=");
                Constructor<?> constructor = this.localMessageCtor;
                sb2.append(constructor != null ? constructor.getParameterTypes().length : -1);
                logDetail(sb2.toString());
                if (hasLocalMessageApi()) {
                    return;
                }
                AbstractC1184v0.m3203m("[Hchat:DexFinder] 本地消息API未找到: candidates=" + iResolveLocalMessageApiBySignature + " key=" + shortKey(this.runtimeCacheKey));
            }
        } catch (Throwable th2) {
            AbstractC0255e.m1030s(th2, new StringBuilder("[Hchat:DexFinder] resolveLocalMessageApi 失败: "), th2);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void resolveMessageClearApi() {
        try {
            if (isMessageClearByTalkerMethod(this.messageClearByTalkerMethod, this.messageClearBatchMethod)) {
                return;
            }
            this.messageClearByTalkerMethod = null;
            this.messageClearBatchMethod = null;
            ArrayList arrayList = new ArrayList();
            C0570e c0570e = new C0570e();
            C1253k c1253k = new C1253k();
            c1253k.m3374r0("MicroMsg.MsgInfoStorageLogic", "summerdel deleteMsgByTalker[%s] stack[%s]", "summerdel deleteMsgByTalker is null or empty", "AsyncDeleteMessageStage1");
            c0570e.f1764h = c1253k;
            Iterator<E> it = this.dexKit.findMethod(c0570e).iterator();
            while (it.hasNext()) {
                try {
                    Method methodM4350r = ((C1730o) it.next()).m4350r(this.classLoader);
                    if (isMessageClearBatchMethod(methodM4350r) && !arrayList.contains(methodM4350r)) {
                        KavaReflector.accessible(methodM4350r);
                        arrayList.add(methodM4350r);
                    }
                } catch (Throwable unused) {
                }
            }
            Method method = arrayList.size() == 1 ? (Method) arrayList.get(0) : null;
            if (method != null) {
                Class<?> cls = method.getParameterTypes()[1];
                ArrayList arrayList2 = new ArrayList();
                for (Method method2 : KavaReflector.declaredMethods(method.getDeclaringClass())) {
                    if (isMessageClearByTalkerMethod(method2, method) && method2.getParameterTypes()[1] == cls) {
                        KavaReflector.accessible(method2);
                        arrayList2.add(method2);
                    }
                }
                if (arrayList2.size() == 1) {
                    this.messageClearBatchMethod = method;
                    this.messageClearByTalkerMethod = (Method) arrayList2.get(0);
                    logDetail("原生消息清理API: single=" + methodName(this.messageClearByTalkerMethod) + " batch=" + methodName(this.messageClearBatchMethod));
                    return;
                }
                AbstractC1184v0.m3203m("[Hchat:DexFinder] 原生单会话消息清理API定位失败: candidates=" + arrayList2.size() + " key=" + shortKey(this.runtimeCacheKey));
            }
            AbstractC1184v0.m3203m("[Hchat:DexFinder] 原生批量消息清理API定位失败: candidates=" + arrayList.size() + " key=" + shortKey(this.runtimeCacheKey));
        } catch (Throwable th2) {
            AbstractC0255e.m1030s(th2, new StringBuilder("[Hchat:DexFinder] resolveMessageClearApi 失败: "), th2);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void resolvePatMessageApi() {
        try {
            if (!isPatDisplayTemplateMethod(this.patDisplayTemplateMethod)) {
                Iterator it = this.dexKit.findMethod(mkMethodUsingStrings("MicroMsg.PluginPatMsg", "parseDisplayTemplate realtime templateStr:%s")).iterator();
                while (it.hasNext()) {
                    try {
                        Method methodM4350r = ((C1730o) it.next()).m4350r(this.classLoader);
                        if (isPatDisplayTemplateMethod(methodM4350r)) {
                            KavaReflector.accessible(methodM4350r);
                            this.patDisplayTemplateMethod = methodM4350r;
                            break;
                        }
                    } catch (Throwable unused) {
                    }
                }
            }
            resolvePatSendApi();
            StringBuilder sb2 = new StringBuilder();
            sb2.append("拍一拍API: template=");
            sb2.append(methodName(this.patDisplayTemplateMethod));
            sb2.append(" extension=");
            Class<?> cls = this.patExtensionClass;
            sb2.append(cls != null ? cls.getName() : "null");
            sb2.append(" create=");
            sb2.append(methodName(this.patCreatePairMethod));
            sb2.append(" suffix=");
            sb2.append(methodName(this.patSuffixMethod));
            sb2.append(" scene=");
            Class<?> cls2 = this.sendPatSceneClass;
            sb2.append(cls2 != null ? cls2.getName() : "null");
            logDetail(sb2.toString());
        } catch (Throwable th2) {
            AbstractC0255e.m1030s(th2, new StringBuilder("[Hchat:DexFinder] resolvePatMessageApi 失败: "), th2);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void resolveRevokeMsgApi() {
        try {
            if (this.revokeMsgCtor == null) {
                this.revokeMsgCtor = findRevokeMsgCtor(this.revokeMsgClass);
            }
            if (this.revokeMsgCtor != null) {
                return;
            }
            ArrayList arrayList = new ArrayList();
            collectSendTextClassCandidates(arrayList, 20, new String[][]{new String[]{"/cgi-bin/micromsg-bin/revokemsg", "MicroMsg.NetSceneRevokeMsg"}, new String[]{"NetSceneRevokeMsg"}});
            collectSendTextMethodOwnerCandidates(arrayList, 20, new String[][]{new String[]{"/cgi-bin/micromsg-bin/revokemsg", "MicroMsg.NetSceneRevokeMsg"}, new String[]{"NetSceneRevokeMsg"}});
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Class<?> cls = (Class) it.next();
                Constructor<?> constructorFindRevokeMsgCtor = findRevokeMsgCtor(cls);
                if (constructorFindRevokeMsgCtor != null) {
                    this.revokeMsgClass = cls;
                    this.revokeMsgCtor = constructorFindRevokeMsgCtor;
                    break;
                }
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("撤回消息API: ");
            Class<?> cls2 = this.revokeMsgClass;
            sb2.append(cls2 != null ? cls2.getName() : "null");
            logDetail(sb2.toString());
        } catch (Throwable th2) {
            AbstractC0255e.m1030s(th2, new StringBuilder("[Hchat:DexFinder] resolveRevokeMsgApi 失败: "), th2);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void resolveScriptSendHookApi() {
        try {
            if (this.chatFooterSendClickMethod != null) {
                return;
            }
            Iterator it = this.dexKit.findMethod(mkMethodUsingStringsAndName("onClick", "MicroMsg.ChatFooter", "send msg onClick", "paste clip board to send")).iterator();
            while (it.hasNext()) {
                try {
                    Method methodM4350r = ((C1730o) it.next()).m4350r(this.classLoader);
                    if (isChatFooterSendClickMethod(methodM4350r)) {
                        KavaReflector.accessible(methodM4350r);
                        this.chatFooterSendClickMethod = methodM4350r;
                        break;
                    }
                } catch (Throwable unused) {
                }
            }
            if (this.chatFooterSendClickMethod == null) {
                Iterator it2 = this.dexKit.findMethod(mkMethodUsingStringsAndName("onClick", "send msg onClick")).iterator();
                while (it2.hasNext()) {
                    try {
                        Method methodM4350r2 = ((C1730o) it2.next()).m4350r(this.classLoader);
                        if (isChatFooterSendClickMethod(methodM4350r2)) {
                            KavaReflector.accessible(methodM4350r2);
                            this.chatFooterSendClickMethod = methodM4350r2;
                            break;
                        }
                    } catch (Throwable unused2) {
                    }
                }
            }
            logDetail("脚本发送按钮API: click=" + methodName(this.chatFooterSendClickMethod));
        } catch (Throwable th2) {
            AbstractC0255e.m1030s(th2, new StringBuilder("[Hchat:DexFinder] resolveScriptSendHookApi 失败: "), th2);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void resolveSendEmojiApi() {
        Method methodFindEmojiDecodeManagerGetter;
        try {
            if (this.emojiSendMethod == null) {
                Iterator it = this.dexKit.findMethod(mkMethodUsingStrings("NetSceneUploadEmoji: msgId")).iterator();
                while (it.hasNext()) {
                    try {
                        Method methodM4350r = ((C1730o) it.next()).m4350r(this.classLoader);
                        if (isEmojiSendMethod(methodM4350r)) {
                            KavaReflector.accessible(methodM4350r);
                            this.emojiSendMethod = methodM4350r;
                            break;
                        }
                    } catch (Throwable unused) {
                    }
                }
            }
            if (this.emojiManagerSendMethod == null) {
                Iterator it2 = this.dexKit.findMethod(mkMethodUsingStrings("sendEmoji: context is null", "sendEmoji: emoji not found")).iterator();
                while (it2.hasNext()) {
                    try {
                        Method methodM4350r2 = ((C1730o) it2.next()).m4350r(this.classLoader);
                        if (isEmojiManagerSendMethod(methodM4350r2)) {
                            KavaReflector.accessible(methodM4350r2);
                            this.emojiManagerSendMethod = methodM4350r2;
                            break;
                        }
                    } catch (Throwable unused2) {
                    }
                }
            }
            if (this.emojiGetByMd5Method == null) {
                Iterator it3 = this.dexKit.findMethod(mkMethodUsingStrings("getEmojiByMd5")).iterator();
                while (it3.hasNext()) {
                    try {
                        Method methodM4350r3 = ((C1730o) it3.next()).m4350r(this.classLoader);
                        if (isEmojiGetByMd5Method(methodM4350r3)) {
                            KavaReflector.accessible(methodM4350r3);
                            this.emojiGetByMd5Method = methodM4350r3;
                            break;
                        }
                    } catch (Throwable unused3) {
                    }
                }
            }
            if (this.emojiCreateInfoMethod == null) {
                Iterator it4 = this.dexKit.findMethod(mkMethodUsingStrings("createEmojiInfo")).iterator();
                while (it4.hasNext()) {
                    try {
                        Method methodM4350r4 = ((C1730o) it4.next()).m4350r(this.classLoader);
                        if (isEmojiCreateInfoMethod(methodM4350r4)) {
                            KavaReflector.accessible(methodM4350r4);
                            this.emojiCreateInfoMethod = methodM4350r4;
                            break;
                        }
                    } catch (Throwable unused4) {
                    }
                }
            }
            if (this.emojiUpdateInfoMethod == null) {
                Iterator it5 = this.dexKit.findMethod(mkMethodUsingStrings("updateEmojiInfo")).iterator();
                while (it5.hasNext()) {
                    try {
                        Method methodM4350r5 = ((C1730o) it5.next()).m4350r(this.classLoader);
                        if (isEmojiUpdateInfoMethod(methodM4350r5)) {
                            KavaReflector.accessible(methodM4350r5);
                            this.emojiUpdateInfoMethod = methodM4350r5;
                            break;
                        }
                    } catch (Throwable unused5) {
                    }
                }
            }
            if (this.emojiAccPathMethod == null) {
                Iterator it6 = this.dexKit.findMethod(mkMethodUsingStrings("getAccPath")).iterator();
                while (it6.hasNext()) {
                    try {
                        Method methodM4350r6 = ((C1730o) it6.next()).m4350r(this.classLoader);
                        if (isNoArgStringMethod(methodM4350r6)) {
                            KavaReflector.accessible(methodM4350r6);
                            this.emojiAccPathMethod = methodM4350r6;
                            break;
                        }
                    } catch (Throwable unused6) {
                    }
                }
            }
            if (this.emojiCheckGifMethod == null) {
                Iterator it7 = this.dexKit.findMethod(mkMethodUsingStrings("checkGifFile")).iterator();
                while (it7.hasNext()) {
                    try {
                        Method methodM4350r7 = ((C1730o) it7.next()).m4350r(this.classLoader);
                        if (isStringBooleanMethod(methodM4350r7)) {
                            KavaReflector.accessible(methodM4350r7);
                            this.emojiCheckGifMethod = methodM4350r7;
                            break;
                        }
                    } catch (Throwable unused7) {
                    }
                }
            }
            if (this.emojiFilePathMethod == null) {
                Iterator it8 = this.dexKit.findMethod(mkMethodUsingStrings("[cpan] get icon path failed. productid and md5 are null.")).iterator();
                while (it8.hasNext()) {
                    try {
                        Method methodM4350r8 = ((C1730o) it8.next()).m4350r(this.classLoader);
                        if (isEmojiFilePathMethod(methodM4350r8)) {
                            KavaReflector.accessible(methodM4350r8);
                            this.emojiFilePathMethod = methodM4350r8;
                            break;
                        }
                    } catch (Throwable unused8) {
                    }
                }
            }
            if (this.emojiDecodeDataMethod == null || this.emojiDecodeManagerGetterMethod == null) {
                Iterator it9 = this.dexKit.findMethod(mkMethodUsingStrings("MicroMsg.emoji.EmojiFileEncryptMgr", "decode emoji file failed. path is no exist :%s ")).iterator();
                while (it9.hasNext()) {
                    try {
                        Method methodM4350r9 = ((C1730o) it9.next()).m4350r(this.classLoader);
                        if (isEmojiDecodeDataMethod(methodM4350r9) && (methodFindEmojiDecodeManagerGetter = findEmojiDecodeManagerGetter(methodM4350r9.getDeclaringClass())) != null) {
                            this.emojiDecodeDataMethod = KavaReflector.accessible(methodM4350r9);
                            this.emojiDecodeManagerGetterMethod = KavaReflector.accessible(methodFindEmojiDecodeManagerGetter);
                            break;
                        }
                    } catch (Throwable unused9) {
                    }
                }
            }
            logDetail("表情发送API: send=" + methodName(this.emojiSendMethod) + " managerSend=" + methodName(this.emojiManagerSendMethod) + " getByMd5=" + methodName(this.emojiGetByMd5Method) + " create=" + methodName(this.emojiCreateInfoMethod) + " accPath=" + methodName(this.emojiAccPathMethod) + " decode=" + methodName(this.emojiDecodeDataMethod));
        } catch (Throwable th2) {
            AbstractC0255e.m1030s(th2, new StringBuilder("[Hchat:DexFinder] resolveSendEmojiApi 失败: "), th2);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void resolveSendFileApi() {
        try {
            if (isSendFileAppMsgMethod(this.sendFileMethod)) {
                if (this.sendFileAttachDirMethod != null && this.sendFileAttachPathMethod != null) {
                    return;
                }
                resolveSendFileAttachHelpers(this.sendFileMethod.getDeclaringClass());
                return;
            }
            ArrayList arrayList = new ArrayList();
            collectAppMsgLogicCandidates(arrayList, 20, new String[][]{new String[]{"summerbig content url:"}, new String[]{"MicroMsg.AppMsgLogic"}, new String[]{"/cgi-bin/micromsg-bin/uploadappattach"}});
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Class<?> cls = (Class) it.next();
                Method methodFindSendFileAppMsgMethod = findSendFileAppMsgMethod(cls);
                if (methodFindSendFileAppMsgMethod != null) {
                    KavaReflector.accessible(methodFindSendFileAppMsgMethod);
                    this.sendFileMethod = methodFindSendFileAppMsgMethod;
                    resolveSendFileAttachHelpers(cls);
                    break;
                }
            }
            Method method = this.sendFileMethod;
            if (method != null && (this.sendFileAttachDirMethod == null || this.sendFileAttachPathMethod == null)) {
                resolveSendFileAttachHelpers(method.getDeclaringClass());
            }
            logDetail("文件发送方法: " + methodName(this.sendFileMethod));
        } catch (Throwable th2) {
            AbstractC0255e.m1030s(th2, new StringBuilder("[Hchat:DexFinder] resolveSendFileApi 失败: "), th2);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void resolveSendImageApi() {
        try {
            if (isSendImageAppInfoMethod(this.sendImageMethod)) {
                resolveSendImageAsyncAppInfoApi();
                resolveImageBestPathApi();
                return;
            }
            C1731p c1731pFindMethod = this.dexKit.findMethod(mkMethodUsingStrings("sendImg: args error"));
            Iterator it = c1731pFindMethod.iterator();
            while (it.hasNext()) {
                try {
                    Method methodM4350r = ((C1730o) it.next()).m4350r(this.classLoader);
                    if (isSendImageAppInfoMethod(methodM4350r)) {
                        KavaReflector.accessible(methodM4350r);
                        this.sendImageMethod = methodM4350r;
                        break;
                    }
                } catch (Throwable unused) {
                }
            }
            if (this.sendImageMethod == null) {
                Iterator it2 = c1731pFindMethod.iterator();
                while (it2.hasNext()) {
                    try {
                        Method methodM4350r2 = ((C1730o) it2.next()).m4350r(this.classLoader);
                        if (isSendImageMethod(methodM4350r2)) {
                            KavaReflector.accessible(methodM4350r2);
                            this.sendImageMethod = methodM4350r2;
                            break;
                        }
                    } catch (Throwable unused2) {
                    }
                }
            }
            logDetail("图片发送方法: " + methodName(this.sendImageMethod));
            resolveSendImageAsyncAppInfoApi();
            resolveImageBestPathApi();
        } catch (Throwable th2) {
            AbstractC0255e.m1030s(th2, new StringBuilder("[Hchat:DexFinder] resolveSendImageApi 失败: "), th2);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void resolveSendTextMsg() {
        try {
            if (this.sendTextMsgClass == null || (this.sendTextMsgCtorLong == null && this.sendTextMsgCtorObject == null)) {
                ArrayList<Class<?>> arrayList = new ArrayList();
                collectSendTextClassCandidates(arrayList, 20, new String[][]{new String[]{"/cgi-bin/micromsg-bin/newsendmsg"}, new String[]{"MicroMsg.NetSceneSendMsg"}, new String[]{"NetSceneSendMsg"}, new String[]{"newsendmsg"}});
                collectSendTextMethodOwnerCandidates(arrayList, 20, new String[][]{new String[]{"/cgi-bin/micromsg-bin/newsendmsg"}, new String[]{"MicroMsg.NetSceneSendMsg"}, new String[]{"NetSceneSendMsg"}});
                for (Class<?> cls : arrayList) {
                    Class cls2 = Integer.TYPE;
                    Constructor<?> constructorFindCtorByExactTypes = findCtorByExactTypes(cls, String.class, String.class, cls2, cls2, Long.TYPE);
                    Constructor<?> constructorFindCtorByExactTypes2 = findCtorByExactTypes(cls, String.class, String.class, cls2, cls2, Object.class);
                    if (constructorFindCtorByExactTypes != null || constructorFindCtorByExactTypes2 != null) {
                        this.sendTextMsgClass = cls;
                        this.sendTextMsgCtorLong = constructorFindCtorByExactTypes;
                        this.sendTextMsgCtorObject = constructorFindCtorByExactTypes2;
                        break;
                    }
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append("文本发送类: ");
                Class<?> cls3 = this.sendTextMsgClass;
                sb2.append(cls3 != null ? cls3.getName() : "null");
                sb2.append(" longCtor=");
                sb2.append(this.sendTextMsgCtorLong != null);
                sb2.append(" objectCtor=");
                sb2.append(this.sendTextMsgCtorObject != null);
                logDetail(sb2.toString());
            }
        } catch (Throwable th2) {
            AbstractC0255e.m1030s(th2, new StringBuilder("[Hchat:DexFinder] resolveSendText 失败: "), th2);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void resolveSendVideoApi() {
        try {
            if (this.sendVideoMethod != null) {
                return;
            }
            Iterator it = this.dexKit.findMethod(mkMethodUsingStrings("send vedio args error")).iterator();
            while (it.hasNext()) {
                try {
                    Method methodM4350r = ((C1730o) it.next()).m4350r(this.classLoader);
                    if (isSendVideoMethod(methodM4350r)) {
                        KavaReflector.accessible(methodM4350r);
                        this.sendVideoMethod = methodM4350r;
                        break;
                    }
                } catch (Throwable unused) {
                }
            }
            logDetail("视频发送方法: " + methodName(this.sendVideoMethod));
        } catch (Throwable th2) {
            AbstractC0255e.m1030s(th2, new StringBuilder("[Hchat:DexFinder] resolveSendVideoApi 失败: "), th2);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void resolveSendVideoTaskApi() {
        try {
            if (this.sendVideoTaskClass != null) {
                return;
            }
            Class<?> clsFindFirstClassByStrings = findFirstClassByStrings("MicroMsg.MsgRetransmitUI", "CopyVideoTask ori[%s] status[%d] new[%s]");
            this.sendVideoTaskClass = clsFindFirstClassByStrings;
            logDetail("视频静默Task: ".concat(clsFindFirstClassByStrings != null ? clsFindFirstClassByStrings.getName() : "null"));
        } catch (Throwable th2) {
            AbstractC0255e.m1030s(th2, new StringBuilder("[Hchat:DexFinder] resolveSendVideoTaskApi 失败: "), th2);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void resolveSendVoiceApi() {
        Class<?> clsLoadClass;
        Constructor<?> constructorFindCtorByExactTypes;
        Constructor<?> constructorFindCtorByExactTypes2;
        Method method;
        try {
            if (this.voiceStartRecordMethod == null) {
                Iterator it = this.dexKit.findMethod(mkMethodUsingStrings("startRecord insert voicestg success")).iterator();
                while (it.hasNext()) {
                    try {
                        Method methodM4350r = ((C1730o) it.next()).m4350r(this.classLoader);
                        if (isVoiceStartRecordMethod(methodM4350r)) {
                            KavaReflector.accessible(methodM4350r);
                            this.voiceStartRecordMethod = methodM4350r;
                            break;
                        }
                    } catch (Throwable unused) {
                    }
                }
            }
            if (this.voiceFullPathMethod == null) {
                Iterator it2 = this.dexKit.findMethod(mkMethodUsingStrings("getAmrFullPath cost:")).iterator();
                while (it2.hasNext()) {
                    try {
                        Method methodM4350r2 = ((C1730o) it2.next()).m4350r(this.classLoader);
                        if (isVoiceFullPathMethod(methodM4350r2)) {
                            KavaReflector.accessible(methodM4350r2);
                            this.voiceFullPathMethod = methodM4350r2;
                            break;
                        }
                    } catch (Throwable unused2) {
                    }
                }
            }
            if (this.voiceFinishRecordMethod == null && (method = this.voiceStartRecordMethod) != null) {
                Iterator<Method> it3 = KavaReflector.declaredMethods(method.getDeclaringClass()).iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        break;
                    }
                    Method next = it3.next();
                    if (isVoiceFinishRecordMethod(next)) {
                        KavaReflector.accessible(next);
                        this.voiceFinishRecordMethod = next;
                        break;
                    }
                }
            }
            if (this.voiceInfoQueryMethod == null) {
                this.voiceInfoQueryMethod = findVoiceInfoQueryMethod();
            }
            Class<?> cls = this.voiceUploadClass;
            Class cls2 = Boolean.TYPE;
            if (cls == null || (this.voiceUploadCtor == null && this.voiceUploadCdnCtor == null)) {
                Iterator it4 = this.dexKit.findMethod(mkMethodUsingStrings("/cgi-bin/micromsg-bin/uploadvoice")).iterator();
                while (it4.hasNext()) {
                    try {
                        clsLoadClass = KavaReflector.loadClass(((C1730o) it4.next()).m4348p().f8333g, this.classLoader);
                        constructorFindCtorByExactTypes = findCtorByExactTypes(clsLoadClass, String.class, Integer.TYPE);
                        constructorFindCtorByExactTypes2 = findCtorByExactTypes(clsLoadClass, String.class, cls2);
                    } catch (Throwable unused3) {
                    }
                    if (constructorFindCtorByExactTypes != null || constructorFindCtorByExactTypes2 != null) {
                        this.voiceUploadClass = clsLoadClass;
                        this.voiceUploadCtor = constructorFindCtorByExactTypes;
                        this.voiceUploadCdnCtor = constructorFindCtorByExactTypes2;
                        break;
                    }
                }
            }
            Class<?> cls3 = this.voiceUploadClass;
            if (cls3 != null && this.voiceUploadCdnCtor == null) {
                this.voiceUploadCdnCtor = findCtorByExactTypes(cls3, String.class, cls2);
            }
            resolveVoicePlaybackApi();
            StringBuilder sb2 = new StringBuilder();
            sb2.append("语音发送API: start=");
            sb2.append(methodName(this.voiceStartRecordMethod));
            sb2.append(" path=");
            sb2.append(methodName(this.voiceFullPathMethod));
            sb2.append(" finish=");
            sb2.append(methodName(this.voiceFinishRecordMethod));
            sb2.append(" info=");
            sb2.append(methodName(this.voiceInfoQueryMethod));
            sb2.append(" upload=");
            Class<?> cls4 = this.voiceUploadClass;
            sb2.append(cls4 != null ? cls4.getName() : "null");
            sb2.append(" cdnCtor=");
            sb2.append(this.voiceUploadCdnCtor != null);
            logDetail(sb2.toString());
        } catch (Throwable th2) {
            AbstractC0255e.m1030s(th2, new StringBuilder("[Hchat:DexFinder] resolveSendVoiceApi 失败: "), th2);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void resolveSendXmlApi() {
        try {
            if (isSendXmlAppMsgMethod(this.sendXmlAppMsgMethod)) {
                resolveAppMsgParseMethod(this.sendXmlAppMsgMethod.getParameterTypes()[0]);
                return;
            }
            Iterator it = this.dexKit.findMethod(mkMethodUsingStrings("summerbig sendAppMsg attachFilePath")).iterator();
            while (it.hasNext()) {
                try {
                    Method methodM4350r = ((C1730o) it.next()).m4350r(this.classLoader);
                    if (isSendXmlAppMsgMethod(methodM4350r)) {
                        KavaReflector.accessible(methodM4350r);
                        this.sendXmlAppMsgMethod = methodM4350r;
                        resolveAppMsgParseMethod(methodM4350r.getParameterTypes()[0]);
                        break;
                    }
                } catch (Throwable unused) {
                }
            }
            logDetail("XML发送方法: " + methodName(this.sendXmlAppMsgMethod) + " parse=" + methodName(this.appMsgParseMethod));
        } catch (Throwable th2) {
            AbstractC0255e.m1030s(th2, new StringBuilder("[Hchat:DexFinder] resolveSendXmlApi 失败: "), th2);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void resolveServiceManagerApi() {
        try {
            if (isServiceGetterMethod(this.serviceGetterMethod)) {
                return;
            }
            Iterator it = this.dexKit.findMethod(mkMethodUsingStrings("calling getService(...)")).iterator();
            while (it.hasNext()) {
                try {
                    Method methodM4350r = ((C1730o) it.next()).m4350r(this.classLoader);
                    if (isServiceGetterMethod(methodM4350r)) {
                        KavaReflector.accessible(methodM4350r);
                        this.serviceGetterMethod = methodM4350r;
                        break;
                    }
                } catch (Throwable unused) {
                }
            }
            logDetail("服务容器方法: " + methodName(this.serviceGetterMethod));
        } catch (Throwable th2) {
            AbstractC0255e.m1030s(th2, new StringBuilder("[Hchat:DexFinder] resolveServiceManagerApi 失败: "), th2);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void resolveSnsUploadApi() {
        try {
            if (!hasSnsUploadApi() || this.snsAddVideoMethod == null || this.snsShareAppMsgMethod == null) {
                if (!isSnsUploadPackHelperClass(this.snsUploadPackHelperClass)) {
                    ArrayList arrayList = new ArrayList();
                    collectSendTextClassCandidates(arrayList, 20, new String[][]{new String[]{"MicroMsg.UploadPackHelper", "setContentDes"}, new String[]{"addImageMediaObjByPath", "setUploadList"}, new String[]{"setSdkId", "setSdkAppName"}});
                    collectSendTextMethodOwnerCandidates(arrayList, 20, new String[][]{new String[]{"MicroMsg.UploadPackHelper", "setContentDes"}, new String[]{"addImageMediaObjByPath", "setUploadList"}, new String[]{"setSdkId", "setSdkAppName"}});
                    Iterator it = arrayList.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        Class<?> cls = (Class) it.next();
                        if (isSnsUploadPackHelperClass(cls)) {
                            this.snsUploadPackHelperClass = cls;
                            break;
                        }
                    }
                }
                if (!isSnsUploadManagerClass(this.snsUploadManagerClass)) {
                    ArrayList arrayList2 = new ArrayList();
                    collectSendTextClassCandidates(arrayList2, 20, new String[][]{new String[]{"MicroMsg.UploadManager", "checkPostInUI"}, new String[]{"checkTLE snsinfo localId it time limit"}, new String[]{"getSnsUploadManager"}});
                    collectSendTextMethodOwnerCandidates(arrayList2, 20, new String[][]{new String[]{"MicroMsg.UploadManager", "checkPostInUI"}, new String[]{"checkTLE snsinfo localId it time limit"}, new String[]{"getSnsUploadManager"}});
                    Iterator it2 = arrayList2.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        Class<?> cls2 = (Class) it2.next();
                        if (isSnsUploadManagerClass(cls2)) {
                            this.snsUploadManagerClass = cls2;
                            break;
                        }
                    }
                }
                resolveSnsUploadMethods();
                StringBuilder sb2 = new StringBuilder();
                sb2.append("朋友圈发布API: helper=");
                Class<?> cls3 = this.snsUploadPackHelperClass;
                sb2.append(cls3 != null ? cls3.getName() : "null");
                sb2.append(" manager=");
                Class<?> cls4 = this.snsUploadManagerClass;
                sb2.append(cls4 != null ? cls4.getName() : "null");
                sb2.append(" getter=");
                sb2.append(methodName(this.snsUploadManagerGetterMethod));
                sb2.append(" content=");
                sb2.append(methodName(this.snsSetContentMethod));
                sb2.append(" addImage=");
                sb2.append(methodName(this.snsAddImageMethod));
                sb2.append(" addVideo=");
                sb2.append(methodName(this.snsAddVideoMethod));
                sb2.append(" commit=");
                sb2.append(methodName(this.snsCommitMethod));
                sb2.append(" shareAppMsg=");
                sb2.append(methodName(this.snsShareAppMsgMethod));
                sb2.append(" check=");
                sb2.append(methodName(this.snsUploadCheckMethod));
                logDetail(sb2.toString());
            }
        } catch (Throwable th2) {
            AbstractC0255e.m1030s(th2, new StringBuilder("[Hchat:DexFinder] resolveSnsUploadApi 失败: "), th2);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void resolveTransferOperationApi() {
        try {
            if (isTransferOperationClass(this.transferOperationClass)) {
                return;
            }
            try {
                Class<?> clsLoadClass = KavaReflector.loadClass("com.tencent.mm.plugin.remittance.model.n0", this.classLoader);
                if (isTransferOperationClass(clsLoadClass)) {
                    this.transferOperationClass = clsLoadClass;
                    logDetail("转账操作类: ".concat(clsLoadClass.getName()));
                    return;
                }
            } catch (Throwable unused) {
            }
            Iterator it = this.dexKit.findClass(mkClassUsingStrings("Micromsg.NetSceneTenpayRemittanceConfirm", "recv_account_type")).iterator();
            while (it.hasNext()) {
                try {
                    Class<?> clsLoadClass2 = KavaReflector.loadClass(((C1724i) it.next()).m4345p().f8327g, this.classLoader);
                    if (isTransferOperationClass(clsLoadClass2)) {
                        this.transferOperationClass = clsLoadClass2;
                        break;
                    }
                } catch (Throwable unused2) {
                }
            }
            if (this.transferOperationClass == null) {
                Iterator it2 = this.dexKit.findMethod(mkMethodUsingStrings("/cgi-bin/mmpay-bin/transferoperation")).iterator();
                while (it2.hasNext()) {
                    try {
                        Class<?> clsLoadClass3 = KavaReflector.loadClass(((C1730o) it2.next()).m4348p().f8333g, this.classLoader);
                        if (isTransferOperationClass(clsLoadClass3)) {
                            this.transferOperationClass = clsLoadClass3;
                            break;
                        }
                    } catch (Throwable unused3) {
                    }
                }
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("转账操作类: ");
            Class<?> cls = this.transferOperationClass;
            sb2.append(cls != null ? cls.getName() : "null");
            logDetail(sb2.toString());
        } catch (Throwable th2) {
            AbstractC0255e.m1030s(th2, new StringBuilder("[Hchat:DexFinder] resolveTransferOperationApi 失败: "), th2);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void resolveTransferQueryApi() {
        try {
            if (isTransferQueryClass(this.transferQueryClass) && isTransferQueryResponseMethod(this.transferQueryResponseMethod, this.transferQueryClass)) {
                return;
            }
            Iterator it = this.dexKit.findClass(mkClassUsingStrings("Micromsg.NetSceneTenpayRemittanceQuery", "recv_account_info", "recv_channel")).iterator();
            while (it.hasNext()) {
                try {
                    Class<?> clsLoadClass = KavaReflector.loadClass(((C1724i) it.next()).m4345p().f8327g, this.classLoader);
                    Method methodFindTransferQueryResponseMethod = findTransferQueryResponseMethod(clsLoadClass);
                    if (isTransferQueryClass(clsLoadClass) && methodFindTransferQueryResponseMethod != null) {
                        this.transferQueryClass = clsLoadClass;
                        this.transferQueryResponseMethod = methodFindTransferQueryResponseMethod;
                        break;
                    }
                } catch (Throwable unused) {
                }
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("转账查询类: ");
            Class<?> cls = this.transferQueryClass;
            sb2.append(cls != null ? cls.getName() : "null");
            sb2.append(" response=");
            sb2.append(methodName(this.transferQueryResponseMethod));
            logDetail(sb2.toString());
        } catch (Throwable th2) {
            AbstractC0255e.m1030s(th2, new StringBuilder("[Hchat:DexFinder] resolveTransferQueryApi 失败: "), th2);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void resolveUploadDeviceStepApi() {
        try {
            if (this.uploadDeviceStepCtor == null) {
                this.uploadDeviceStepCtor = findUploadDeviceStepCtor(this.uploadDeviceStepClass);
            }
            if (this.uploadDeviceStepCtor != null) {
                return;
            }
            ArrayList arrayList = new ArrayList();
            collectSendTextClassCandidates(arrayList, 20, new String[][]{new String[]{"/cgi-bin/mmoc-bin/hardware/uploaddevicestep", "MicroMsg.Sport.NetSceneUploadDeviceStep"}, new String[]{"NetSceneUploadDeviceStep"}});
            collectSendTextMethodOwnerCandidates(arrayList, 20, new String[][]{new String[]{"/cgi-bin/mmoc-bin/hardware/uploaddevicestep", "MicroMsg.Sport.NetSceneUploadDeviceStep"}, new String[]{"NetSceneUploadDeviceStep"}});
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Class<?> cls = (Class) it.next();
                Constructor<?> constructorFindUploadDeviceStepCtor = findUploadDeviceStepCtor(cls);
                if (constructorFindUploadDeviceStepCtor != null) {
                    this.uploadDeviceStepClass = cls;
                    this.uploadDeviceStepCtor = constructorFindUploadDeviceStepCtor;
                    break;
                }
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("上传步数API: ");
            Class<?> cls2 = this.uploadDeviceStepClass;
            sb2.append(cls2 != null ? cls2.getName() : "null");
            logDetail(sb2.toString());
        } catch (Throwable th2) {
            AbstractC0255e.m1030s(th2, new StringBuilder("[Hchat:DexFinder] resolveUploadDeviceStepApi 失败: "), th2);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void resolveVerifyUserApi() {
        try {
            if (isVerifyUserClass(this.verifyUserClass)) {
                return;
            }
            Iterator it = this.dexKit.findClass(mkClassUsingStrings("/cgi-bin/micromsg-bin/verifyuser", "MicroMsg.NetSceneVerifyUser.dkverify")).iterator();
            while (it.hasNext()) {
                try {
                    Class<?> clsLoadClass = KavaReflector.loadClass(((C1724i) it.next()).m4345p().f8327g, this.classLoader);
                    if (isVerifyUserClass(clsLoadClass)) {
                        this.verifyUserClass = clsLoadClass;
                        break;
                    }
                } catch (Throwable unused) {
                }
            }
            if (this.verifyUserClass == null) {
                Iterator it2 = this.dexKit.findMethod(mkMethodUsingStrings("/cgi-bin/micromsg-bin/verifyuser")).iterator();
                while (it2.hasNext()) {
                    try {
                        Class<?> clsLoadClass2 = KavaReflector.loadClass(((C1730o) it2.next()).m4348p().f8333g, this.classLoader);
                        if (isVerifyUserClass(clsLoadClass2)) {
                            this.verifyUserClass = clsLoadClass2;
                            break;
                        }
                    } catch (Throwable unused2) {
                    }
                }
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("好友申请验证类: ");
            Class<?> cls = this.verifyUserClass;
            sb2.append(cls != null ? cls.getName() : "null");
            logDetail(sb2.toString());
        } catch (Throwable th2) {
            AbstractC0255e.m1030s(th2, new StringBuilder("[Hchat:DexFinder] resolveVerifyUserApi 失败: "), th2);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void resolveVideoInfoApi() {
        try {
            if (isVideoInfoByFileNameMethod(this.videoInfoByFileNameMethod, this.videoInfoClass)) {
                return;
            }
            this.videoInfoByFileNameMethod = null;
            Class<?> clsFindFirstClassByStrings = findFirstClassByStrings("VideoInfo{fileName='");
            this.videoInfoClass = clsFindFirstClassByStrings;
            if (clsFindFirstClassByStrings == null) {
                return;
            }
            C0570e c0570e = new C0570e();
            C1253k c1253k = new C1253k();
            c1253k.m3371n0(String.class);
            C1253k.m3366q0(c1253k, this.videoInfoClass.getName());
            c0570e.f1764h = c1253k;
            ArrayList arrayList = new ArrayList();
            Iterator<E> it = this.dexKit.findMethod(c0570e).iterator();
            while (it.hasNext()) {
                try {
                    Method methodM4350r = ((C1730o) it.next()).m4350r(this.classLoader);
                    if (isVideoInfoByFileNameMethod(methodM4350r, this.videoInfoClass) && samePackage(methodM4350r.getDeclaringClass(), this.videoInfoClass)) {
                        Method methodAccessible = KavaReflector.accessible(methodM4350r);
                        if (!arrayList.contains(methodAccessible)) {
                            arrayList.add(methodAccessible);
                        }
                    }
                } catch (Throwable unused) {
                }
            }
            if (arrayList.size() == 1) {
                this.videoInfoByFileNameMethod = (Method) arrayList.get(0);
            }
            logDetail("视频信息查询API: " + methodName(this.videoInfoByFileNameMethod));
        } catch (Throwable th2) {
            AbstractC0255e.m1030s(th2, new StringBuilder("[Hchat:DexFinder] resolveVideoInfoApi 失败: "), th2);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void resolveVideoPathApi() {
        try {
            if (!isVideoPathMethod(this.videoPathMethod)) {
                this.videoPathMethod = null;
                C1731p c1731pFindMethod = this.dexKit.findMethod(mkMethodUsingStrings("MicroMsg.C2CVideoPathFeatureService", "success restore file, from ", ".mp4"));
                if (c1731pFindMethod.isEmpty()) {
                    c1731pFindMethod = this.dexKit.findMethod(mkMethodUsingStrings("MicroMsg.VideoInfoStorage", "success restore file, from ", ".mp4"));
                }
                Iterator it = c1731pFindMethod.iterator();
                while (it.hasNext()) {
                    try {
                        Method methodM4350r = ((C1730o) it.next()).m4350r(this.classLoader);
                        if (isVideoPathMethod(methodM4350r)) {
                            this.videoPathMethod = KavaReflector.accessible(methodM4350r);
                            break;
                        }
                    } catch (Throwable unused) {
                    }
                }
            }
            Method method = this.videoPathMethod;
            Class<?> declaringClass = method != null ? method.getDeclaringClass() : null;
            Method method2 = this.videoPathMethod;
            if (method2 == null || KavaReflector.isStatic(method2)) {
                this.videoPathOwnerGetterMethod = null;
            } else if (!isVideoPathOwnerGetter(this.videoPathOwnerGetterMethod, declaringClass)) {
                this.videoPathOwnerGetterMethod = findVideoPathOwnerGetter(declaringClass);
            }
            logDetail("视频消息路径API: path=" + methodName(this.videoPathMethod) + " owner=" + methodName(this.videoPathOwnerGetterMethod));
        } catch (Throwable th2) {
            AbstractC0255e.m1030s(th2, new StringBuilder("[Hchat:DexFinder] resolveVideoPathApi 失败: "), th2);
        }
    }

    private void logDetail(String str) {
    }

    public DexFinder(DexKitBridge dexKitBridge, ClassLoader classLoader) {
        this(dexKitBridge, classLoader, null);
    }
}
