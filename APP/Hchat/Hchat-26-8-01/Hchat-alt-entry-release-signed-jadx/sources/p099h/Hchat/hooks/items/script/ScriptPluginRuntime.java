package p099h.Hchat.hooks.items.script;

import ac.AbstractC0063p;
import ac.RunnableC0059l;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.FileObserver;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.os.SystemClock;
import android.system.Os;
import android.widget.Toast;
import bsh.BshMethod;
import bsh.EvalError;
import bsh.Interpreter;
import bsh.org.objectweb.asm.Opcodes;
import ca.RunnableC0523j;
import com.alibaba.fastjson2.JSONB;
import dalvik.system.DexClassLoader;
import de.robv.android.xposed.XC_MethodHook;
import de.robv.android.xposed.XposedBridge;
import de.robv.android.xposed.XposedHelpers;
import gg.AbstractC1416l;
import gg.AbstractC1426v;
import gg.C1421q;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.locks.ReentrantLock;
import java.util.function.Consumer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import me.yun.silk.AacCodec;
import me.yun.silk.SilkCodec;
import me.yun.silk.utils.Conversion;
import ng.AbstractC3015m;
import ng.C3011i;
import ng.InterfaceC3012j;
import okhttp3.HttpUrl;
import org.luckypray.dexkit.DexKitBridge;
import p000a.AbstractC0000a;
import p002a1.RunnableC0003a;
import p002a1.RunnableC0006d;
import p009a9.C0031h;
import p025bc.AbstractC0255e;
import p027c0.C0361f;
import p036c9.RunnableC0476p1;
import p036c9.ThreadFactoryC0478q;
import p054dg.AbstractC0793l;
import p054dg.C0795n;
import p063e9.C0837h;
import p065eb.C0853a0;
import p065eb.C0856b0;
import p065eb.C0859c0;
import p065eb.C0862d0;
import p065eb.C0894t;
import p065eb.C0896u;
import p065eb.C0898v;
import p065eb.C0902x;
import p065eb.C0904y;
import p065eb.C0906z;
import p065eb.FileObserverC0865e0;
import p065eb.RunnableC0900w;
import p068eh.AbstractC0921a;
import p077f8.AbstractC1089i;
import p080fb.AbstractC1184v0;
import p085fg.InterfaceC1220a;
import p085fg.InterfaceC1235p;
import p092g4.AbstractC1341a;
import p099h.Hchat.dexkit.DexBridgeHolder;
import p099h.Hchat.dexkit.DexFinder;
import p099h.Hchat.hooks.api.core.WeChatApis;
import p099h.Hchat.hooks.api.model.WeChatSnsPost;
import p099h.Hchat.hooks.api.model.WeChatSnsPrepareResult;
import p099h.Hchat.hooks.api.runtime.WeChatDatabaseApi;
import p099h.Hchat.hooks.items.protobuf.ProtobufPacketRuntime$Packet;
import p099h.Hchat.utils.KavaReflector;
import p136j8.AbstractC2091b;
import p136j8.C2104o;
import p167l8.C2534i;
import p172lg.C2563c;
import p172lg.C2564d;
import p210o8.C3087k;
import p218og.AbstractC3137a;
import p218og.AbstractC3149m;
import p218og.AbstractC3156t;
import p218og.C3147k;
import p230p8.C3351d0;
import p258r8.C3742g;
import p276sf.C3959f;
import p276sf.C3960g;
import p276sf.C3967n;
import p300ub.AbstractC4302b;
import p331wa.AbstractC4699j;
import p331wa.C4696g;
import p331wa.InterfaceC4698i;
import p332wb.AbstractC4855en;
import tf.AbstractC4165l;
import tf.AbstractC4166m;
import tf.AbstractC4167n;
import tf.AbstractC4170q;
import tf.C4173t;
import tf.C4175v;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class ScriptPluginRuntime {
    public static final int $stable = 0;
    private static final int IMAGE_DOWNLOAD_CALLBACK_QUEUE_CAPACITY = 32;
    private static final long IMAGE_DOWNLOAD_DROP_LOG_COOLDOWN_MS = 10000;
    private static final String INFO_FILE = "info.prop";
    private static final long INITIAL_LOAD_POLL_MAX_MS = 2000;
    private static final long INITIAL_LOAD_POLL_MIN_MS = 250;
    private static final long INITIAL_LOAD_READY_TIMEOUT_MS = 30000;
    private static final String MAIN_FILE = "main.java";
    private static final String PROCESS_APPBRAND = "appbrand";
    private static final int PROTOBUF_CALLBACK_QUEUE_CAPACITY = 128;
    private static final long PROTOBUF_DROP_LOG_COOLDOWN_MS = 10000;
    private static final String README_FILE = "README.md";
    private static final long RELOAD_DEBOUNCE_MS = 500;
    private static final long SEND_BUTTON_DIAGNOSTIC_LOG_COOLDOWN_MS = 10000;
    private static final long SEND_BUTTON_SLOW_CALLBACK_MS = 50;
    private static final String SNAPSHOT_SUFFIX = ".bshs";
    private static final int SNS_PREPARE_QUEUE_CAPACITY = 32;
    private static final String TAG = "[Hchat:Script]";
    private static volatile Context appContext;
    private static volatile ScriptPluginBridge bridge;
    private static final ThreadPoolExecutor imageDownloadCallbackExecutor;
    private static final ThreadPoolExecutor protobufCallbackExecutor;
    private static final InterfaceC4698i protobufPacketListener;
    private static volatile FileObserver scriptRootObserver;
    private static final ThreadPoolExecutor snsPrepareExecutor;
    public static final ScriptPluginRuntime INSTANCE = new ScriptPluginRuntime();
    private static final C3147k AGENT_TRANSACTION_DIRECTORY = new C3147k("^\\..+\\.agent-(?:new|old|copy)-[A-Za-z0-9]+$");
    private static final Object nativeLoadLock = new Object();
    private static final ArrayList<C0906z> loadedNativeLibraries = new ArrayList<>();
    private static final AtomicLong nativeLoadSequence = new AtomicLong(0);
    private static final AtomicBoolean initialLoadStarted = new AtomicBoolean(false);
    private static final ConcurrentHashMap.KeySetView<String, Boolean> invalidProcessWarnings = ConcurrentHashMap.newKeySet();
    private static final C3147k SCRIPT_FUNCTION_NAME = new C3147k("[A-Za-z_][A-Za-z0-9_]*");
    private static final String PROCESS_MAIN = "main";
    private static volatile String runtimeProcess = PROCESS_MAIN;
    private static volatile String runtimeProcessName = HttpUrl.FRAGMENT_ENCODE_SET;
    private static final ConcurrentHashMap<String, C0853a0> loadedPlugins = new ConcurrentHashMap<>();
    private static final ConcurrentHashMap<String, FileObserver> pluginDirObservers = new ConcurrentHashMap<>();
    private static final CopyOnWriteArrayList<InterfaceC1220a> pluginCatalogListeners = new CopyOnWriteArrayList<>();
    private static final ConcurrentHashMap<String, Runnable> reloadTasks = new ConcurrentHashMap<>();
    private static final WeakHashMap<Interpreter, ReentrantLock> interpreterLocks = new WeakHashMap<>();
    private static final ConcurrentHashMap<String, Long> sendButtonDiagnosticLogAt = new ConcurrentHashMap<>();
    private static final Handler mainHandler = new Handler(Looper.getMainLooper());
    private static final Object protobufListenerLock = new Object();
    private static final AtomicBoolean protobufListenerRegistered = new AtomicBoolean(false);
    private static final AtomicLong protobufDroppedPacketCount = new AtomicLong(0);
    private static final AtomicLong protobufDropLogAt = new AtomicLong(0);
    private static final AtomicLong imageDownloadDroppedCount = new AtomicLong(0);
    private static final AtomicLong imageDownloadDropLogAt = new AtomicLong(0);
    private static final AtomicLong snsPrepareSequence = new AtomicLong(0);
    private static final ConcurrentHashMap<String, AtomicBoolean> snsPrepareCancellations = new ConcurrentHashMap<>();

    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public static final class SendResult {
        public static final int $stable = 0;
        private final String message;
        private final boolean success;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public SendResult(boolean z9, String str) {
            str.getClass();
            this.success = z9;
            this.message = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final String getMessage() {
            return this.message;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final boolean isSuccess() {
            return this.success;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public String toString() {
            return "SendResult(success=" + this.success + ", message=" + this.message + ")";
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        ArrayBlockingQueue arrayBlockingQueue = new ArrayBlockingQueue(32);
        ThreadFactoryC0478q threadFactoryC0478q = new ThreadFactoryC0478q(6);
        ThreadPoolExecutor.AbortPolicy abortPolicy = new ThreadPoolExecutor.AbortPolicy();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        snsPrepareExecutor = new ThreadPoolExecutor(2, 2, 0L, timeUnit, arrayBlockingQueue, threadFactoryC0478q, abortPolicy);
        protobufCallbackExecutor = new ThreadPoolExecutor(1, 1, 0L, timeUnit, new ArrayBlockingQueue(128), new ThreadFactoryC0478q(7), new ThreadPoolExecutor.AbortPolicy());
        imageDownloadCallbackExecutor = new ThreadPoolExecutor(2, 2, 0L, timeUnit, new ArrayBlockingQueue(32), new ThreadFactoryC0478q(8), new ThreadPoolExecutor.AbortPolicy());
        protobufPacketListener = new C0902x();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private ScriptPluginRuntime() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private final boolean awaitScriptApiReady(Context context) {
        long jElapsedRealtime = SystemClock.elapsedRealtime() + INITIAL_LOAD_READY_TIMEOUT_MS;
        long j3 = 250;
        while (SystemClock.elapsedRealtime() < jElapsedRealtime && isPluginRuntimeEnabled(context)) {
            if (isScriptApiReady()) {
                return true;
            }
            SystemClock.sleep(j3);
            j3 *= 2;
            if (j3 > INITIAL_LOAD_POLL_MAX_MS) {
                j3 = 2000;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private final void callLifecycle(Interpreter interpreter, String str) throws Throwable {
        Object c3959f;
        try {
            ReentrantLock reentrantLockInterpreterLock = interpreterLock(interpreter);
            reentrantLockInterpreterLock.lock();
            try {
                c3959f = interpreter.eval(str + "();");
                reentrantLockInterpreterLock.unlock();
            } catch (Throwable th2) {
                reentrantLockInterpreterLock.unlock();
                throw th2;
            }
        } catch (Throwable th3) {
            c3959f = new C3959f(th3);
        }
        Throwable thM8182b = C3960g.m8182b(c3959f);
        if (thM8182b != null) {
            String message = thM8182b.getMessage();
            if (message == null) {
                message = HttpUrl.FRAGMENT_ENCODE_SET;
            }
            if (!AbstractC3149m.m6709h0(message, "Command not found", true) && !AbstractC3149m.m6709h0(message, "undefined", true) && !AbstractC3149m.m6709h0(message, "not found", true)) {
                throw thM8182b;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private final String callbackWrapper(String str, String str2) {
        if (!SCRIPT_FUNCTION_NAME.m6683d(str2)) {
            C2104o.m5291q(AbstractC4855en.m9263g("非法函数名: ", str2));
            return null;
        }
        if (AbstractC1416l.m3825a(str, str2)) {
            C2104o.m5291q(AbstractC4855en.m9263g("回调别名不能指向自身: ", str));
            return null;
        }
        switch (str.hashCode()) {
            case -1013170331:
                if (str.equals("onLoad")) {
                    return AbstractC0921a.m2251n("void onLoad() { ", str2, "(); }");
                }
                break;
            case -1000790721:
                if (str.equals("onNewFriend")) {
                    return AbstractC0921a.m2251n("void onNewFriend(String wxid, String ticket, int scene) { ", str2, "(wxid, ticket, scene); }");
                }
                break;
            case -846243918:
                if (str.equals("onProtobufPacket")) {
                    return AbstractC0921a.m2251n("void onProtobufPacket(Object packet) { ", str2, "(packet); }");
                }
                break;
            case -644272284:
                if (str.equals("onImageDownload")) {
                    return AbstractC0921a.m2251n("void onImageDownload(Object msg, String imagePath, String talker, String senderWxid) { ", str2, "(msg, imagePath, talker, senderWxid); }");
                }
                break;
            case -372024179:
                if (str.equals("openSettings")) {
                    return AbstractC0921a.m2251n("void openSettings() { ", str2, "(); }");
                }
                break;
            case 33320218:
                if (str.equals("onHandleMsg")) {
                    return AbstractC0921a.m2251n("void onHandleMsg(Object msg) { ", str2, "(msg); }");
                }
                break;
            case 207634059:
                if (str.equals("onClickSendBtn")) {
                    return AbstractC0921a.m2251n("boolean onClickSendBtn(String text) { return Boolean.TRUE.equals(", str2, "(text)); }");
                }
                break;
            case 1110522473:
                if (str.equals("onMemberChange")) {
                    return AbstractC0921a.m2251n("void onMemberChange(String type, String groupWxid, String userWxid, String userName) { ", str2, "(type, groupWxid, userWxid, userName); }");
                }
                break;
            case 1557968318:
                if (str.equals("onUnload")) {
                    return AbstractC0921a.m2251n("void onUnload() { ", str2, "(); }");
                }
                break;
        }
        C2104o.m5294t("不支持的回调名: ".concat(str));
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private final void cancelSnsPrepareTasks(String str) {
        String strM1020i = AbstractC0255e.m1020i(str, ":");
        for (Map.Entry<String, AtomicBoolean> entry : snsPrepareCancellations.entrySet()) {
            String key = entry.getKey();
            AtomicBoolean value = entry.getValue();
            if (AbstractC3156t.m6740d0(key, strM1020i, false)) {
                value.set(true);
            }
        }
    }

    /* JADX DEBUG: Another duplicated slice has different insns count: {[]}, finally: {[THROW, INVOKE, MOVE_EXCEPTION, THROW, MOVE_EXCEPTION] complete} */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    private final void copyNativeLibrary(File file, File file2, String str) {
        File parentFile = file2.getParentFile();
        String name = file2.getName();
        File file3 = new File(parentFile, AbstractC0921a.m2253p(AbstractC0921a.m2258u(Process.myPid(), ".", name, ".", "."), Thread.currentThread().getId(), ".tmp"));
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file3, false);
            try {
                FileInputStream fileInputStream = new FileInputStream(file);
                try {
                    AbstractC1341a.m3594j(fileInputStream, fileOutputStream);
                    fileInputStream.close();
                    fileOutputStream.getFD().sync();
                    fileOutputStream.close();
                    if (file3.length() != file.length()) {
                        throw new IllegalArgumentException(("Native缓存复制不完整: " + file.getName()).toString());
                    }
                    if (!AbstractC1416l.m3825a(sha256(file3), str)) {
                        throw new IllegalArgumentException(("Native缓存复制校验失败: " + file.getName()).toString());
                    }
                    try {
                        Os.rename(file3.getAbsolutePath(), file2.getAbsolutePath());
                    } catch (Throwable th2) {
                        if (file2.exists() && !file2.delete()) {
                            throw new IllegalStateException("无法替换Native缓存: " + file2.getAbsolutePath(), th2);
                        }
                        if (!file3.renameTo(file2)) {
                            throw new IllegalStateException("无法写入Native缓存: " + file2.getAbsolutePath(), th2);
                        }
                    }
                    file3.delete();
                } finally {
                }
            } finally {
            }
        } catch (Throwable th3) {
            file3.delete();
            throw th3;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private final ScriptPluginBridge currentBridge(Context context) {
        ScriptPluginBridge scriptPluginBridge = bridge;
        if (scriptPluginBridge != null) {
            return scriptPluginBridge;
        }
        Context applicationContext = context.getApplicationContext();
        Context context2 = applicationContext != null ? applicationContext : context;
        ClassLoader classLoader = context.getClassLoader();
        classLoader.getClass();
        ScriptPluginBridge scriptPluginBridge2 = new ScriptPluginBridge(context2, classLoader, scriptDir(context), null, 8, null);
        bridge = scriptPluginBridge2;
        return scriptPluginBridge2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private final void deliverProtobufSendResult(Consumer<SendResult> consumer, boolean z9, String str) {
        Object c3959f;
        if (consumer == null) {
            return;
        }
        try {
            if (str == null) {
                str = HttpUrl.FRAGMENT_ENCODE_SET;
            }
            consumer.accept(new SendResult(z9, str));
            c3959f = C3967n.f12976a;
        } catch (Throwable th2) {
            c3959f = new C3959f(th2);
        }
        Throwable thM8182b = C3960g.m8182b(c3959f);
        if (thM8182b != null) {
            AbstractC0921a.m2261x("[Hchat:Script] 数据包发送结果回调失败: ", thM8182b.getMessage(), thM8182b);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private final C0904y detectCallbacks(Interpreter interpreter) {
        Object c3959f;
        try {
            BshMethod[] methods = interpreter.getNameSpace().getMethods();
            methods.getClass();
            ArrayList arrayList = new ArrayList(methods.length);
            for (BshMethod bshMethod : methods) {
                arrayList.add(bshMethod.getName());
            }
            c3959f = AbstractC4166m.m8412U1(arrayList);
        } catch (Throwable th2) {
            c3959f = new C3959f(th2);
        }
        if (c3959f instanceof C3959f) {
            c3959f = C4175v.f13712g;
        }
        Set set = (Set) c3959f;
        return new C0904y(set.contains("onClickSendBtn"), set.contains("onHandleMsg"), set.contains("openSettings"), set.contains("onMemberChange"), set.contains("onNewFriend"), set.contains("onProtobufPacket"), set.contains("onImageDownload"));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean dispatchOnClickSendBtn$lambda$0(C0853a0 c0853a0) {
        c0853a0.getClass();
        return c0853a0.f2608c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean dispatchOnHandleMsg$lambda$0(C0853a0 c0853a0) {
        c0853a0.getClass();
        return c0853a0.f2609d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    public static final void dispatchOnImageDownload$lambda$2(ScriptPluginBridge scriptPluginBridge, ScriptMessageBean scriptMessageBean, Object obj) {
        List listM99x0;
        String strDownloadCallbackImage = INSTANCE.downloadCallbackImage(scriptPluginBridge, scriptMessageBean, obj);
        if (strDownloadCallbackImage != null) {
            Collection<C0853a0> collectionValues = loadedPlugins.values();
            collectionValues.getClass();
            C3011i c3011i = new C3011i(new C0795n(collectionValues, 6), true, new C0837h(14));
            C0031h c0031h = new C0031h(13);
            ArrayList arrayList = new ArrayList();
            AbstractC3015m.m6417a0(c3011i, arrayList);
            AbstractC4170q.m8431g1(arrayList, c0031h);
            Iterator it = arrayList.iterator();
            if (it.hasNext()) {
                Object next = it.next();
                if (it.hasNext()) {
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.add(next);
                    while (it.hasNext()) {
                        arrayList2.add(it.next());
                    }
                    listM99x0 = arrayList2;
                } else {
                    listM99x0 = AbstractC0000a.m99x0(next);
                }
            } else {
                listM99x0 = C4173t.f13710g;
            }
            String talker = scriptMessageBean.getTalker();
            String sendTalker = scriptMessageBean.getSendTalker();
            for (Object obj2 : listM99x0) {
                obj2.getClass();
                C0853a0 c0853a0 = (C0853a0) obj2;
                ConcurrentHashMap<String, C0853a0> concurrentHashMap = loadedPlugins;
                if (concurrentHashMap.get(c0853a0.f2606a.f2626a) == c0853a0) {
                    try {
                        ReentrantLock reentrantLockInterpreterLock = INSTANCE.interpreterLock(c0853a0.f2607b);
                        reentrantLockInterpreterLock.lock();
                        try {
                            if (concurrentHashMap.get(c0853a0.f2606a.f2626a) == c0853a0) {
                                c0853a0.f2607b.set("__hchat_image_msg_info", scriptMessageBean);
                                c0853a0.f2607b.set("__hchat_image_path", strDownloadCallbackImage);
                                c0853a0.f2607b.set("__hchat_image_talker", talker);
                                c0853a0.f2607b.set("__hchat_image_sender", sendTalker);
                                c0853a0.f2607b.eval("onImageDownload(__hchat_image_msg_info, __hchat_image_path, __hchat_image_talker, __hchat_image_sender);");
                            }
                            reentrantLockInterpreterLock.unlock();
                        } catch (Throwable th2) {
                            reentrantLockInterpreterLock.unlock();
                            throw th2;
                        }
                    } catch (Throwable th3) {
                        if (!INSTANCE.isMissingCallbackError(th3, "onImageDownload")) {
                            AbstractC0921a.m2260w("[Hchat:Script] 图片下载回调失败: ", c0853a0.f2606a.f2627b, " ", th3.getMessage(), th3);
                            ScriptPluginBridge scriptPluginBridge2 = bridge;
                            if (scriptPluginBridge2 != null) {
                                C0859c0 c0859c0 = c0853a0.f2606a;
                                scriptPluginBridge2.log(c0859c0.f2627b, c0859c0.f2628c, "图片下载回调失败: " + th3.getMessage());
                            }
                        }
                    }
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean dispatchOnImageDownload$lambda$2$0(C0853a0 c0853a0) {
        c0853a0.getClass();
        return c0853a0.f2614i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean dispatchOnMemberChange$lambda$0(C0853a0 c0853a0) {
        c0853a0.getClass();
        return c0853a0.f2611f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean dispatchOnNewFriend$lambda$0(C0853a0 c0853a0) {
        c0853a0.getClass();
        return c0853a0.f2612g;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    public static final void dispatchOnProtobufPacket$lambda$1(ProtobufPacketRuntime$Packet protobufPacketRuntime$Packet) {
        List listM99x0;
        Collection<C0853a0> collectionValues = loadedPlugins.values();
        collectionValues.getClass();
        C3011i c3011i = new C3011i(new C0795n(collectionValues, 6), true, new C0837h(18));
        C0031h c0031h = new C0031h(16);
        ArrayList arrayList = new ArrayList();
        AbstractC3015m.m6417a0(c3011i, arrayList);
        AbstractC4170q.m8431g1(arrayList, c0031h);
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            Object next = it.next();
            if (it.hasNext()) {
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(next);
                while (it.hasNext()) {
                    arrayList2.add(it.next());
                }
                listM99x0 = arrayList2;
            } else {
                listM99x0 = AbstractC0000a.m99x0(next);
            }
        } else {
            listM99x0 = C4173t.f13710g;
        }
        for (Object obj : listM99x0) {
            obj.getClass();
            C0853a0 c0853a0 = (C0853a0) obj;
            if (loadedPlugins.get(c0853a0.f2606a.f2626a) == c0853a0) {
                try {
                    ReentrantLock reentrantLockInterpreterLock = INSTANCE.interpreterLock(c0853a0.f2607b);
                    reentrantLockInterpreterLock.lock();
                    try {
                        c0853a0.f2607b.set("__hchat_protobuf_packet", protobufPacketRuntime$Packet);
                        c0853a0.f2607b.eval("onProtobufPacket(__hchat_protobuf_packet);");
                        reentrantLockInterpreterLock.unlock();
                    } catch (Throwable th2) {
                        reentrantLockInterpreterLock.unlock();
                        throw th2;
                    }
                } catch (Throwable th3) {
                    if (!INSTANCE.isMissingCallbackError(th3, "onProtobufPacket")) {
                        AbstractC0921a.m2260w("[Hchat:Script] 数据包监听回调失败: ", c0853a0.f2606a.f2627b, " ", th3.getMessage(), th3);
                        ScriptPluginBridge scriptPluginBridge = bridge;
                        if (scriptPluginBridge != null) {
                            C0859c0 c0859c0 = c0853a0.f2606a;
                            scriptPluginBridge.log(c0859c0.f2627b, c0859c0.f2628c, "数据包监听回调失败: " + th3);
                        }
                    }
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean dispatchOnProtobufPacket$lambda$1$0(C0853a0 c0853a0) {
        c0853a0.getClass();
        return c0853a0.f2613h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0045 A[PHI: r1
  0x0045: PHI (r1v16 java.lang.Long) = (r1v6 java.lang.Long), (r1v9 java.lang.Long) binds: [B:17:0x0043, B:27:0x0069] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final String downloadCallbackImage(ScriptPluginBridge scriptPluginBridge, ScriptMessageBean scriptMessageBean, Object obj) {
        long jCurrentTimeMillis;
        File parentFile = scriptPluginBridge.getScriptDir().getParentFile();
        if (parentFile == null) {
            parentFile = scriptPluginBridge.getScriptDir();
        }
        File file = new File(parentFile, "Cache");
        if (!file.isDirectory()) {
            file.mkdirs();
        }
        Long lValueOf = Long.valueOf(scriptMessageBean.getMsgId());
        boolean z9 = false;
        if (!Boolean.valueOf(lValueOf.longValue() > 0).booleanValue()) {
            lValueOf = null;
        }
        if (lValueOf != null) {
            jCurrentTimeMillis = lValueOf.longValue();
        } else {
            lValueOf = Long.valueOf(scriptMessageBean.getCreateTime());
            if (!Boolean.valueOf(lValueOf.longValue() > 0).booleanValue()) {
                lValueOf = null;
            }
            if (lValueOf == null) {
                jCurrentTimeMillis = System.currentTimeMillis();
            }
        }
        String sendTalker = scriptMessageBean.getSendTalker();
        if (AbstractC3149m.m6721t0(sendTalker)) {
            sendTalker = scriptMessageBean.getSender();
        }
        String strSafeCallbackFilePart = safeCallbackFilePart(sendTalker);
        long jCurrentTimeMillis2 = System.currentTimeMillis();
        StringBuilder sbM2259v = AbstractC0921a.m2259v("Hchat_ImageCallback_", strSafeCallbackFilePart, "_", jCurrentTimeMillis);
        sbM2259v.append("_");
        sbM2259v.append(jCurrentTimeMillis2);
        sbM2259v.append(".jpg");
        File file2 = new File(file, sbM2259v.toString());
        new ScriptWaBridge(scriptPluginBridge).downloadImg(obj, file2.getAbsolutePath());
        if (file2.isFile() && file2.length() > 0) {
            z9 = true;
        }
        if (!Boolean.valueOf(z9).booleanValue()) {
            file2 = null;
        }
        if (file2 != null) {
            return file2.getAbsolutePath();
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    public static final Thread imageDownloadCallbackExecutor$lambda$0(Runnable runnable) {
        return AbstractC2091b.m5167n("Hchat-Script-ImageDownload", true, runnable);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void installAppBrandProcess(Context context, ClassLoader classLoader, String str) {
        context.getClass();
        classLoader.getClass();
        Context applicationContext = context.getApplicationContext();
        Context context2 = applicationContext != null ? applicationContext : context;
        ScriptPluginRuntime scriptPluginRuntime = INSTANCE;
        if (scriptPluginRuntime.isPluginRuntimeEnabled(context2) && initialLoadStarted.compareAndSet(false, true)) {
            appContext = context2;
            runtimeProcess = PROCESS_APPBRAND;
            if (str == null) {
                str = HttpUrl.FRAGMENT_ENCODE_SET;
            }
            runtimeProcessName = str;
            ScriptPluginBridge scriptPluginBridge = new ScriptPluginBridge(context2, classLoader, scriptPluginRuntime.scriptDir(context2), null, 8, null);
            bridge = scriptPluginBridge;
            Thread thread = new Thread(new RunnableC0006d(context2, 8, scriptPluginBridge), "Hchat-Script-AppBrand");
            thread.setDaemon(true);
            thread.start();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    public static final void installAppBrandProcess$lambda$0(Context context, ScriptPluginBridge scriptPluginBridge) {
        try {
            Object objM10916loadEnabledAppBrandPluginsgIAlus = INSTANCE.m10916loadEnabledAppBrandPluginsgIAlus(context, scriptPluginBridge);
            if (objM10916loadEnabledAppBrandPluginsgIAlus instanceof C3959f) {
                String str = runtimeProcessName;
                Throwable thM8182b = C3960g.m8182b(objM10916loadEnabledAppBrandPluginsgIAlus);
                AbstractC1184v0.m3204n("[Hchat:Script] 小程序进程插件加载失败: " + str + " " + (thM8182b != null ? thM8182b.getMessage() : null), C3960g.m8182b(objM10916loadEnabledAppBrandPluginsgIAlus));
            }
        } catch (Throwable th2) {
            AbstractC0921a.m2260w("[Hchat:Script] 小程序进程插件加载线程异常: ", runtimeProcessName, " ", th2.getMessage(), th2);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private final ReentrantLock interpreterLock(Interpreter interpreter) {
        ReentrantLock reentrantLock;
        WeakHashMap<Interpreter, ReentrantLock> weakHashMap = interpreterLocks;
        synchronized (weakHashMap) {
            try {
                ReentrantLock reentrantLock2 = weakHashMap.get(interpreter);
                if (reentrantLock2 == null) {
                    reentrantLock2 = new ReentrantLock();
                    weakHashMap.put(interpreter, reentrantLock2);
                }
                reentrantLock = reentrantLock2;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return reentrantLock;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private final boolean isMissingCallbackError(Throwable th2, String str) {
        String message;
        StringBuilder sb2 = new StringBuilder();
        String message2 = th2.getMessage();
        if (message2 == null) {
            message2 = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        sb2.append(message2);
        Throwable cause = th2.getCause();
        if (cause != null && (message = cause.getMessage()) != null) {
            sb2.append('\n');
            sb2.append(message);
        }
        String string = sb2.toString();
        if (AbstractC3149m.m6709h0(string, str, true)) {
            return AbstractC3149m.m6709h0(string, "Command not found", true) || AbstractC3149m.m6709h0(string, "undefined", true) || AbstractC3149m.m6709h0(string, "not found", true);
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isPluginDirectory(File file) {
        if (!file.isDirectory()) {
            return false;
        }
        C3147k c3147k = AGENT_TRANSACTION_DIRECTORY;
        String name = file.getName();
        name.getClass();
        return !c3147k.m6683d(name);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private final boolean isPluginRuntimeEnabled(Context context) {
        return AbstractC4302b.m8640c(context, "Hchat_script_plugin_config").getBoolean("script_plugin_enable", false);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private final boolean isScriptApiReady() {
        WeChatDatabaseApi weChatDatabaseApiDatabase = WeChatApis.database();
        List<Map<String, Object>> listQuery = weChatDatabaseApiDatabase != null ? weChatDatabaseApiDatabase.query("SELECT name FROM sqlite_master WHERE type='table' AND name IN ('rcontact','chatroom')", null) : null;
        if (listQuery == null) {
            listQuery = C4173t.f13710g;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = listQuery.iterator();
        while (it.hasNext()) {
            Object obj = ((Map) it.next()).get("name");
            String string = obj != null ? obj.toString() : null;
            if (string != null) {
                arrayList.add(string);
            }
        }
        Set setM8412U1 = AbstractC4166m.m8412U1(arrayList);
        return setM8412U1.contains("rcontact") && setM8412U1.contains("chatroom");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final C0859c0 listPlugins$lambda$0(File file) {
        File file2 = new File(file, MAIN_FILE);
        if (!file2.isFile()) {
            return null;
        }
        ScriptPluginRuntime scriptPluginRuntime = INSTANCE;
        file.getClass();
        Properties pluginMeta = scriptPluginRuntime.readPluginMeta(file);
        String str = null;
        String name = file.getName();
        name.getClass();
        String property = pluginMeta.getProperty("name");
        if (property == null) {
            property = file.getName();
        } else {
            if (AbstractC3149m.m6721t0(property)) {
                property = null;
            }
            if (property == null) {
            }
        }
        property.getClass();
        String property2 = pluginMeta.getProperty("author");
        String str2 = HttpUrl.FRAGMENT_ENCODE_SET;
        if (property2 == null) {
            property2 = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        String property3 = pluginMeta.getProperty("version");
        if (property3 == null) {
            property3 = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        String property4 = pluginMeta.getProperty("updateTime");
        if (property4 != null) {
            str2 = property4;
        }
        String property5 = pluginMeta.getProperty("name");
        if (property5 != null && !AbstractC3149m.m6721t0(property5)) {
            str = property5;
        }
        String str3 = property2;
        String str4 = str2;
        String str5 = str;
        String name2 = file.getName();
        name2.getClass();
        return new C0859c0(name, property, file, file2, str3, property3, str4, str5, scriptPluginRuntime.parseProcessScope(name2, pluginMeta.getProperty("process")));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: loadEnabledAppBrandPlugins-gIAlu-s, reason: not valid java name */
    private final synchronized Object m10916loadEnabledAppBrandPluginsgIAlus(Context context, ScriptPluginBridge scriptPluginBridge) {
        Object c3959f;
        try {
            SharedPreferences sharedPreferencesM8640c = AbstractC4302b.m8640c(context, "Hchat_script_plugin_config");
            if (sharedPreferencesM8640c.getBoolean("script_plugin_enable", false)) {
                for (C0859c0 c0859c0 : listPlugins(context)) {
                    if (supportsProcess(c0859c0, PROCESS_APPBRAND) && sharedPreferencesM8640c.getBoolean("script_plugin_item_".concat(c0859c0.f2626a), false)) {
                        Context context2 = context;
                        ScriptPluginBridge scriptPluginBridge2 = scriptPluginBridge;
                        try {
                            Object objM10918loadPluginyxL6bBk = m10918loadPluginyxL6bBk(context2, scriptPluginBridge2, c0859c0, false, false);
                            if (objM10918loadPluginyxL6bBk instanceof C3959f) {
                                String str = c0859c0.f2627b;
                                String str2 = runtimeProcessName;
                                Throwable thM8182b = C3960g.m8182b(objM10918loadPluginyxL6bBk);
                                AbstractC1184v0.m3204n("[Hchat:Script] 小程序进程插件加载失败: " + str + " process=" + str2 + " " + (thM8182b != null ? thM8182b.getMessage() : null), C3960g.m8182b(objM10918loadPluginyxL6bBk));
                            }
                            context = context2;
                            scriptPluginBridge = scriptPluginBridge2;
                        } catch (Throwable th2) {
                            th = th2;
                            c3959f = new C3959f(th);
                            return c3959f;
                        }
                    }
                }
            }
            c3959f = C3967n.f12976a;
        } catch (Throwable th3) {
            th = th3;
        }
        return c3959f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: loadEnabledPlugins-gIAlu-s, reason: not valid java name */
    private final synchronized Object m10917loadEnabledPluginsgIAlus(Context context, ScriptPluginBridge scriptPluginBridge) {
        Object c3959f;
        try {
            ensureDirs(context);
            startPluginObservers(context);
            SharedPreferences sharedPreferencesM8640c = AbstractC4302b.m8640c(context, "Hchat_script_plugin_config");
            if (sharedPreferencesM8640c.getBoolean("script_plugin_enable", false)) {
                Throwable th2 = null;
                for (C0859c0 c0859c0 : listPlugins(context)) {
                    if (supportsProcess(c0859c0, PROCESS_MAIN) && sharedPreferencesM8640c.getBoolean("script_plugin_item_".concat(c0859c0.f2626a), false)) {
                        Context context2 = context;
                        ScriptPluginBridge scriptPluginBridge2 = scriptPluginBridge;
                        try {
                            Object objM10919loadPluginyxL6bBk$default = m10919loadPluginyxL6bBk$default(this, context2, scriptPluginBridge2, c0859c0, false, false, 16, null);
                            if (objM10919loadPluginyxL6bBk$default instanceof C3959f) {
                                sharedPreferencesM8640c.edit().putBoolean("script_plugin_item_".concat(c0859c0.f2626a), false).apply();
                                if (th2 == null) {
                                    Throwable thM8182b = C3960g.m8182b(objM10919loadPluginyxL6bBk$default);
                                    if (thM8182b == null) {
                                        thM8182b = new IllegalStateException("插件加载失败: " + c0859c0.f2627b);
                                    }
                                    th2 = thM8182b;
                                }
                            }
                            context = context2;
                            scriptPluginBridge = scriptPluginBridge2;
                        } catch (Throwable th3) {
                            th = th3;
                            c3959f = new C3959f(th);
                            return c3959f;
                        }
                    }
                }
                if (th2 != null) {
                    throw th2;
                }
            }
            c3959f = C3967n.f12976a;
        } catch (Throwable th4) {
            th = th4;
        }
        return c3959f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    public static final void loadEnabledPluginsWhenReady$lambda$0(Context context) {
        try {
            ScriptPluginRuntime scriptPluginRuntime = INSTANCE;
            if (!scriptPluginRuntime.awaitScriptApiReady(context)) {
                if (scriptPluginRuntime.isPluginRuntimeEnabled(context)) {
                    AbstractC1184v0.m3203m("[Hchat:Script] 等待联系人数据库就绪超时，跳过本次自动加载");
                    return;
                }
                return;
            }
            Object objM10917loadEnabledPluginsgIAlus = scriptPluginRuntime.m10917loadEnabledPluginsgIAlus(context, scriptPluginRuntime.currentBridge(context));
            if (objM10917loadEnabledPluginsgIAlus instanceof C3959f) {
                Throwable thM8182b = C3960g.m8182b(objM10917loadEnabledPluginsgIAlus);
                AbstractC1184v0.m3204n("[Hchat:Script] 自动加载已启用插件失败: " + (thM8182b != null ? thM8182b.getMessage() : null), C3960g.m8182b(objM10917loadEnabledPluginsgIAlus));
            }
        } catch (Throwable th2) {
            AbstractC0921a.m2261x("[Hchat:Script] 自动加载线程异常: ", th2.getMessage(), th2);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private final void loadNativeLibrary(File file, ClassLoader classLoader) {
        Throwable targetException;
        Object objInvokeOrThrow;
        try {
            int i9 = Build.VERSION.SDK_INT;
            if (i9 >= 29) {
                Method methodFindDeclaredMethod = KavaReflector.findDeclaredMethod(Runtime.class, "nativeLoad", String.class, ClassLoader.class, Class.class);
                if (methodFindDeclaredMethod == null) {
                    throw new NoSuchMethodException("Runtime.nativeLoad(String, ClassLoader, Class)");
                }
                objInvokeOrThrow = KavaReflector.invokeOrThrow(methodFindDeclaredMethod, null, file.getAbsolutePath(), classLoader, null);
            } else if (i9 >= 28) {
                Method methodFindDeclaredMethod2 = KavaReflector.findDeclaredMethod(Runtime.class, "nativeLoad", String.class, ClassLoader.class);
                if (methodFindDeclaredMethod2 == null) {
                    throw new NoSuchMethodException("Runtime.nativeLoad(String, ClassLoader)");
                }
                objInvokeOrThrow = KavaReflector.invokeOrThrow(methodFindDeclaredMethod2, null, file.getAbsolutePath(), classLoader);
            } else {
                Method methodFindDeclaredMethod3 = KavaReflector.findDeclaredMethod(Runtime.class, "nativeLoad", String.class, ClassLoader.class, String.class);
                if (methodFindDeclaredMethod3 == null) {
                    throw new NoSuchMethodException("Runtime.nativeLoad(String, ClassLoader, String)");
                }
                String absolutePath = file.getAbsolutePath();
                File parentFile = file.getParentFile();
                objInvokeOrThrow = KavaReflector.invokeOrThrow(methodFindDeclaredMethod3, null, absolutePath, classLoader, parentFile != null ? parentFile.getAbsolutePath() : null);
            }
            String str = objInvokeOrThrow instanceof String ? (String) objInvokeOrThrow : null;
            if (str == null || AbstractC3149m.m6721t0(str)) {
                return;
            }
            StringBuilder sbM1027p = AbstractC0255e.m1027p("SO加载失败(", Process.is64Bit() ? "arm64-v8a" : "armeabi-v7a", "): ", file.getAbsolutePath(), ": ");
            sbM1027p.append(str);
            throw new UnsatisfiedLinkError(sbM1027p.toString());
        } catch (Throwable th2) {
            th = th2;
            InvocationTargetException invocationTargetException = th instanceof InvocationTargetException ? (InvocationTargetException) th : null;
            if (invocationTargetException != null && (targetException = invocationTargetException.getTargetException()) != null) {
                th = targetException;
            }
            throw new IllegalStateException(AbstractC4855en.m9263g("无法调用Android Native加载入口: ", th.getMessage()), th);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0026 A[Catch: all -> 0x0021, TRY_ENTER, TryCatch #0 {, blocks: (B:5:0x000d, B:7:0x0013, B:13:0x0026, B:14:0x002b, B:16:0x0035, B:40:0x00dd, B:42:0x00e3, B:39:0x00d7, B:19:0x0039, B:25:0x005a, B:27:0x0060, B:29:0x0076, B:33:0x00b5, B:34:0x00b8, B:35:0x00b9, B:36:0x00ce, B:37:0x00cf, B:38:0x00d6, B:24:0x0054), top: B:47:0x000d, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0035 A[Catch: all -> 0x0021, TRY_LEAVE, TryCatch #0 {, blocks: (B:5:0x000d, B:7:0x0013, B:13:0x0026, B:14:0x002b, B:16:0x0035, B:40:0x00dd, B:42:0x00e3, B:39:0x00d7, B:19:0x0039, B:25:0x005a, B:27:0x0060, B:29:0x0076, B:33:0x00b5, B:34:0x00b8, B:35:0x00b9, B:36:0x00ce, B:37:0x00cf, B:38:0x00d6, B:24:0x0054), top: B:47:0x000d, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0039 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX INFO: renamed from: loadPlugin-yxL6bBk, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final synchronized Object m10918loadPluginyxL6bBk(Context context, ScriptPluginBridge scriptPluginBridge, C0859c0 c0859c0, boolean z9, boolean z10) {
        Object c3959f;
        Object c3959f2;
        if (z10) {
            if (!isScriptApiReady()) {
                return new C3959f(new IllegalStateException("微信联系人数据库尚未就绪，请稍后重试"));
            }
            if (z9) {
                m10921unloadPluginIoAF18A(c0859c0.f2626a);
            }
            if (!loadedPlugins.containsKey(c0859c0.f2626a)) {
                return C3967n.f12976a;
            }
            try {
                if (!AbstractC4302b.m8640c(context, "Hchat_script_plugin_config").getBoolean("script_plugin_enable", false)) {
                    throw new IllegalStateException("脚本插件总开关未开启");
                }
                try {
                    c3959f2 = AbstractC0793l.m2028h0(c0859c0.f2629d, AbstractC3137a.f10177a);
                } catch (Throwable th2) {
                    c3959f2 = new C3959f(th2);
                }
                Throwable thM8182b = C3960g.m8182b(c3959f2);
                if (thM8182b != null) {
                    throw new IllegalStateException("读取脚本失败: " + thM8182b.getMessage(), thM8182b);
                }
                String str = (String) c3959f2;
                Interpreter interpreterNewInterpreter = newInterpreter(scriptPluginBridge, c0859c0);
                ReentrantLock reentrantLockInterpreterLock = interpreterLock(interpreterNewInterpreter);
                reentrantLockInterpreterLock.lock();
                try {
                    interpreterNewInterpreter.source(c0859c0.f2629d.getAbsolutePath());
                    reentrantLockInterpreterLock.unlock();
                    callLifecycle(interpreterNewInterpreter, "onLoad");
                    C0904y c0904yM2206a = detectCallbacks(str).m2206a(detectCallbacks(interpreterNewInterpreter));
                    loadedPlugins.put(c0859c0.f2626a, new C0853a0(c0859c0, interpreterNewInterpreter, c0904yM2206a.f2805a, c0904yM2206a.f2806b, c0904yM2206a.f2807c, c0904yM2206a.f2808d, c0904yM2206a.f2809e, c0904yM2206a.f2810f, c0904yM2206a.f2811g));
                    updateProtobufPacketListener();
                    refreshCallbacks(c0859c0.f2626a, interpreterNewInterpreter);
                    notifyPluginCatalogChanged();
                    c3959f = C3967n.f12976a;
                } catch (Throwable th3) {
                    reentrantLockInterpreterLock.unlock();
                    throw th3;
                }
            } catch (Throwable th4) {
                c3959f = new C3959f(th4);
            }
            Throwable thM8182b2 = C3960g.m8182b(c3959f);
            if (thM8182b2 != null) {
                scriptPluginBridge.unhookPlugin(c0859c0.f2626a);
                AbstractC1184v0.m3204n("[Hchat:Script] 插件加载失败: " + c0859c0.f2627b + " " + thM8182b2.getMessage(), thM8182b2);
                ScriptPluginRuntime scriptPluginRuntime = INSTANCE;
                scriptPluginRuntime.writePluginLoadError(c0859c0, thM8182b2);
                scriptPluginRuntime.notifyPluginCatalogChanged();
            }
            return c3959f;
        }
        if (z9) {
        }
        if (!loadedPlugins.containsKey(c0859c0.f2626a)) {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: loadPlugin-yxL6bBk$default, reason: not valid java name */
    public static /* synthetic */ Object m10919loadPluginyxL6bBk$default(ScriptPluginRuntime scriptPluginRuntime, Context context, ScriptPluginBridge scriptPluginBridge, C0859c0 c0859c0, boolean z9, boolean z10, int i9, Object obj) {
        if ((i9 & 16) != 0) {
            z10 = true;
        }
        return scriptPluginRuntime.m10918loadPluginyxL6bBk(context, scriptPluginBridge, c0859c0, z9, z10);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private final void logBusySendButtonPlugin(C0853a0 c0853a0) {
        logSendButtonDiagnostic("busy:".concat(c0853a0.f2606a.f2626a), "发送按钮跳过忙碌插件: ".concat(c0853a0.f2606a.f2627b));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private final void logDroppedImageDownload() {
        AtomicLong atomicLong = imageDownloadDroppedCount;
        atomicLong.incrementAndGet();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        AtomicLong atomicLong2 = imageDownloadDropLogAt;
        long j3 = atomicLong2.get();
        if ((j3 == 0 || jElapsedRealtime - j3 >= 10000) && atomicLong2.compareAndSet(j3, jElapsedRealtime)) {
            AbstractC1184v0.m3203m("[Hchat:Script] 图片下载回调队列已满，已丢弃 " + atomicLong.getAndSet(0L) + " 个事件");
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private final void logDroppedProtobufPacket() {
        AtomicLong atomicLong = protobufDroppedPacketCount;
        atomicLong.incrementAndGet();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        AtomicLong atomicLong2 = protobufDropLogAt;
        long j3 = atomicLong2.get();
        if ((j3 == 0 || jElapsedRealtime - j3 >= 10000) && atomicLong2.compareAndSet(j3, jElapsedRealtime)) {
            AbstractC1184v0.m3203m("[Hchat:Script] 数据包回调队列已满，已丢弃 " + atomicLong.getAndSet(0L) + " 个事件");
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private final void logSendButtonDiagnostic(String str, String str2) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        C1421q c1421q = new C1421q();
        sendButtonDiagnosticLogAt.compute(str, new C0898v(0, new C0896u(jElapsedRealtime, c1421q, 0)));
        if (c1421q.f4734g) {
            AbstractC1184v0.m3203m("[Hchat:Script] " + str2);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    public static final Long logSendButtonDiagnostic$lambda$0(long j3, C1421q c1421q, String str, Long l10) {
        str.getClass();
        if (l10 != null && j3 - l10.longValue() < 10000) {
            return l10;
        }
        c1421q.f4734g = true;
        return Long.valueOf(j3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    public static final Long logSendButtonDiagnostic$lambda$1(InterfaceC1235p interfaceC1235p, Object obj, Object obj2) {
        return (Long) interfaceC1235p.invoke(obj, obj2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private final Interpreter newInterpreter(ScriptPluginBridge scriptPluginBridge, C0859c0 c0859c0) throws EvalError {
        Object c3959f;
        Object c3959f2;
        DexBridgeHolder dexBridgeHolderHolder;
        File file = c0859c0.f2628c;
        File parentFile = scriptPluginBridge.getScriptDir().getParentFile();
        if (parentFile == null) {
            parentFile = scriptPluginBridge.getScriptDir();
        }
        File file2 = new File(parentFile, "Cache");
        ScriptWaBridge scriptWaBridge = new ScriptWaBridge(scriptPluginBridge);
        scriptWaBridge.bindPluginLog(c0859c0.f2627b, file);
        Object scriptAudioBridge = new ScriptAudioBridge(scriptPluginBridge);
        try {
            C3087k c3087kVersion = WeChatApis.version();
            c3959f = c3087kVersion != null ? c3087kVersion.m6563b() : null;
        } catch (Throwable th2) {
            c3959f = new C3959f(th2);
        }
        if (c3959f instanceof C3959f) {
            c3959f = null;
        }
        C2534i c2534i = (C2534i) c3959f;
        if (c2534i == null) {
            try {
                c3959f2 = C3087k.m6557a(scriptPluginBridge.getHostContext(), scriptPluginBridge.getClassLoader());
            } catch (Throwable th3) {
                c3959f2 = new C3959f(th3);
            }
            if (c3959f2 instanceof C3959f) {
                c3959f2 = null;
            }
            c2534i = (C2534i) c3959f2;
        }
        Object obj = c2534i != null ? c2534i.f8198d : null;
        Object obj2 = HttpUrl.FRAGMENT_ENCODE_SET;
        if (obj == null) {
            obj = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        long j3 = c2534i != null ? c2534i.f8195a : 0L;
        Object obj3 = c2534i != null ? c2534i.f8199e : null;
        if (obj3 != null) {
            obj2 = obj3;
        }
        Interpreter interpreter = new Interpreter();
        interpreter.addClassLoader(scriptPluginBridge.getClassLoader());
        interpreter.set("context", scriptPluginBridge.getHostContext());
        interpreter.set("hostContext", scriptPluginBridge.getHostContext());
        interpreter.set("classLoader", scriptPluginBridge.getClassLoader());
        interpreter.set("scriptDir", scriptPluginBridge.getScriptDir().getAbsolutePath());
        interpreter.set("scriptDirFile", scriptPluginBridge.getScriptDir());
        interpreter.set("pluginDir", file.getAbsolutePath());
        interpreter.set("pluginDirFile", file);
        interpreter.set("cacheDir", file2.getAbsolutePath());
        interpreter.set("cacheDirFile", file2);
        interpreter.set("pluginId", c0859c0.f2626a);
        interpreter.set("pluginName", c0859c0.f2627b);
        interpreter.set("pluginAuthor", c0859c0.f2630e);
        interpreter.set("pluginVersion", c0859c0.f2631f);
        interpreter.set("pluginUpdateTime", c0859c0.f2632g);
        interpreter.set("processName", runtimeProcessName);
        interpreter.set("pluginProcess", runtimeProcess);
        interpreter.set("isMainProcess", AbstractC1416l.m3825a(runtimeProcess, PROCESS_MAIN));
        interpreter.set("isAppBrandProcess", AbstractC1416l.m3825a(runtimeProcess, PROCESS_APPBRAND));
        interpreter.set("hostVerName", obj);
        interpreter.set("hostVerCode", j3);
        interpreter.set("hostVerClient", obj2);
        interpreter.set("moduleVer", "5.5.6");
        interpreter.set("bridge", scriptPluginBridge);
        interpreter.set("wa", scriptWaBridge);
        interpreter.set("waBridge", scriptWaBridge);
        interpreter.set("audio", scriptAudioBridge);
        interpreter.set("audioBridge", scriptAudioBridge);
        interpreter.set("http", scriptWaBridge);
        interpreter.set("httpClient", scriptWaBridge);
        interpreter.set("__hchat_runtime", INSTANCE);
        interpreter.set("__hchat_interpreter", interpreter);
        interpreter.set("apis", scriptPluginBridge.getApis());
        interpreter.set("dexKit", scriptPluginBridge.getDexKit());
        ScriptDexKitBridge dexKit = scriptPluginBridge.getDexKit();
        interpreter.set("dexKitBridge", dexKit != null ? dexKit.bridge() : null);
        ScriptDexKitBridge dexKit2 = scriptPluginBridge.getDexKit();
        interpreter.set("dexFinder", (dexKit2 == null || (dexBridgeHolderHolder = dexKit2.holder()) == null) ? null : dexBridgeHolderHolder.getDexFinder());
        ScriptDexKitBridge dexKit3 = scriptPluginBridge.getDexKit();
        interpreter.set("dexBridgeHolder", dexKit3 != null ? dexKit3.holder() : null);
        interpreter.set("WeChatApisClass", WeChatApis.class);
        interpreter.set("XposedBridgeClass", XposedBridge.class);
        interpreter.set("XposedHelpersClass", XposedHelpers.class);
        interpreter.set("XC_MethodHookClass", XC_MethodHook.class);
        interpreter.set("DexKitBridgeClass", DexKitBridge.class);
        interpreter.set("DexFinderClass", DexFinder.class);
        interpreter.set("DexBridgeHolderClass", DexBridgeHolder.class);
        interpreter.set("KavaReflectorClass", KavaReflector.class);
        interpreter.set("ScriptAudioBridgeClass", ScriptAudioBridge.class);
        interpreter.set("SilkCodecClass", SilkCodec.class);
        interpreter.set("AacCodecClass", AacCodec.class);
        interpreter.set("ConversionClass", Conversion.class);
        interpreter.set("FieldClass", Field.class);
        interpreter.set("MethodClass", Method.class);
        interpreter.set("ConstructorClass", Constructor.class);
        interpreter.set("startedAt", new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.US).format(new Date()));
        interpreter.eval("import de.robv.android.xposed.XC_MethodHook;\nimport de.robv.android.xposed.XposedBridge;\nimport de.robv.android.xposed.XposedHelpers;\nimport h.Hchat.dexkit.DexBridgeHolder;\nimport h.Hchat.dexkit.DexFinder;\nimport h.Hchat.hooks.api.core.WeChatApis;\nimport h.Hchat.hooks.items.script.ScriptDexKitBridge;\nimport h.Hchat.hooks.items.script.ScriptPluginBridge;\nimport h.Hchat.hooks.items.script.ScriptAudioBridge;\nimport h.Hchat.hooks.items.script.ScriptWaBridge;\nimport h.Hchat.hooks.api.model.ContactLabelBean;\nimport h.Hchat.utils.KavaReflector;\nimport java.io.File;\nimport java.io.InputStream;\nimport java.lang.reflect.Constructor;\nimport java.lang.reflect.Field;\nimport org.luckypray.dexkit.DexKitBridge;\nimport java.lang.reflect.Member;\nimport java.lang.reflect.Method;\nimport java.util.Map;\nimport java.util.List;\nimport java.util.Set;\nimport java.util.function.Consumer;\nimport java.util.function.Function;\nimport android.content.ContentValues;\nimport android.database.Cursor;\nimport android.view.View;\nimport me.hd.wauxv.data.bean.MsgInfoBean;\nimport me.hd.wauxv.plugin.api.callback.PluginCallBack;\nimport me.yun.silk.AacCodec;\nimport me.yun.silk.SilkCodec;\nimport me.yun.silk.utils.Conversion;\nvoid log(Object msg) { bridge.log(pluginName, pluginDirFile, msg); }\nvoid toast(Object msg) { bridge.toast(pluginName, msg); }\nboolean showModuleDialog(String title, String message) { return bridge.showModuleDialog(title, message); }\nboolean showModuleDialog(String title, String message, String position) { return bridge.showModuleDialog(title, message, position); }\nboolean showModuleConfirmDialog(String title, String message, Consumer callback) { return bridge.showModuleConfirmDialog(title, message, callback); }\nboolean showModuleConfirmDialog(String title, String message, String position, Consumer callback) { return bridge.showModuleConfirmDialog(title, message, position, callback); }\nboolean showModuleInputDialog(String title, String summary, String initialValue, String placeholder, Consumer callback) { return bridge.showModuleInputDialog(title, summary, initialValue, placeholder, callback); }\nboolean showModuleInputDialog(String title, String summary, String initialValue, String placeholder, String position, Consumer callback) { return bridge.showModuleInputDialog(title, summary, initialValue, placeholder, position, callback); }\nboolean showModuleChoiceDialog(String title, String summary, List choices, Consumer callback) { return bridge.showModuleChoiceDialog(title, summary, choices, callback); }\nboolean showModuleChoiceDialog(String title, String summary, List choices, String position, Consumer callback) { return bridge.showModuleChoiceDialog(title, summary, choices, position, callback); }\nboolean showModuleMultiChoiceDialog(String title, String summary, List choices, Set initialSelected, Consumer callback) { return bridge.showModuleMultiChoiceDialog(title, summary, choices, initialSelected, callback); }\nboolean showModuleMultiChoiceDialog(String title, String summary, List choices, Set initialSelected, String position, Consumer callback) { return bridge.showModuleMultiChoiceDialog(title, summary, choices, initialSelected, position, callback); }\nObject applyModuleFloatingGlassBar(View bottomBar) { return bridge.applyModuleFloatingGlassBar(pluginId, bottomBar); }\nObject applyModuleFloatingGlassBar(View bottomBar, Map options) { return bridge.applyModuleFloatingGlassBar(pluginId, bottomBar, options); }\nString getString(String key, String __hchat_default_string) { return bridge.getString(pluginDirFile, key, __hchat_default_string); }\nSet getStringSet(String key, Set __hchat_default_set) { return bridge.getStringSet(pluginDirFile, key, __hchat_default_set); }\nboolean getBoolean(String key, boolean __hchat_default_boolean) { return bridge.getBoolean(pluginDirFile, key, __hchat_default_boolean); }\nint getInt(String key, int __hchat_default_int) { return bridge.getInt(pluginDirFile, key, __hchat_default_int); }\nfloat getFloat(String key, float __hchat_default_float) { return bridge.getFloat(pluginDirFile, key, __hchat_default_float); }\nlong getLong(String key, long __hchat_default_long) { return bridge.getLong(pluginDirFile, key, __hchat_default_long); }\nvoid putString(String key, String value) { bridge.putString(pluginDirFile, key, value); }\nvoid putStringSet(String key, Set value) { bridge.putStringSet(pluginDirFile, key, value); }\nvoid putBoolean(String key, boolean value) { bridge.putBoolean(pluginDirFile, key, value); }\nvoid putInt(String key, int value) { bridge.putInt(pluginDirFile, key, value); }\nvoid putFloat(String key, float value) { bridge.putFloat(pluginDirFile, key, value); }\nvoid putLong(String key, long value) { bridge.putLong(pluginDirFile, key, value); }\nClass findClass(String className) { return bridge.findClass(className); }\nObject findClassList(String usingString) { return dexKit == null ? new java.util.ArrayList() : dexKit.findClassList(usingString); }\nObject findClassList(String[] usingStrings) { return dexKit == null ? new java.util.ArrayList() : dexKit.findClassList(usingStrings); }\nObject findClassList(Object[] usingStrings) { return dexKit == null ? new java.util.ArrayList() : dexKit.findClassList(usingStrings); }\nObject findClassList(List usingStrings) { return dexKit == null ? new java.util.ArrayList() : dexKit.findClassList(usingStrings); }\nObject findClassList(Object usingStrings) { return dexKit == null ? new java.util.ArrayList() : dexKit.findClassList(usingStrings); }\nObject findMemberList(String usingString) { return dexKit == null ? new java.util.ArrayList() : dexKit.findMemberList(usingString); }\nObject findMemberList(String[] usingStrings) { return dexKit == null ? new java.util.ArrayList() : dexKit.findMemberList(usingStrings); }\nObject findMemberList(Object[] usingStrings) { return dexKit == null ? new java.util.ArrayList() : dexKit.findMemberList(usingStrings); }\nObject findMemberList(List usingStrings) { return dexKit == null ? new java.util.ArrayList() : dexKit.findMemberList(usingStrings); }\nObject findMemberList(Object usingStrings) { return dexKit == null ? new java.util.ArrayList() : dexKit.findMemberList(usingStrings); }\nMethod firstMethod(Object instance, String methodName) { return bridge.firstMethod(instance, methodName); }\nMethod firstMethod(Object instance, String methodName, int paramCount) { return bridge.firstMethod(instance, methodName, paramCount); }\nConstructor firstConstructor(Object instance, int paramCount) { return bridge.firstConstructor(instance, paramCount); }\nField firstField(Object instance, String fieldName) { return bridge.firstField(instance, fieldName); }\nObject invokeMethod(Object instance, String methodName) { return bridge.invokeMethod(instance, methodName); }\nObject invokeMethod(Object instance, String methodName, Object[] params) { return bridge.invokeMethod(instance, methodName, params); }\nObject invokeMethod(Object instance, String methodName, int paramCount) { return bridge.invokeMethod(instance, methodName, paramCount); }\nObject invokeMethod(Object instance, String methodName, int paramCount, Object[] params) { return bridge.invokeMethod(instance, methodName, paramCount, params); }\nObject createInstance(Object instance, int paramCount) { return bridge.createInstance(instance, paramCount); }\nObject createInstance(Object instance, int paramCount, Object[] params) { return bridge.createInstance(instance, paramCount, params); }\nObject getField(Object instance, String fieldName) { return bridge.getField(instance, fieldName); }\nvoid setField(Object instance, String fieldName, Object value) { bridge.setField(instance, fieldName, value); }\nObject hookBefore(Member member, Consumer callback) { return bridge.hookBefore(pluginId, member, callback); }\nObject hookAfter(Member member, Consumer callback) { return bridge.hookAfter(pluginId, member, callback); }\nObject hookReplace(Member member, Function callback) { return bridge.hookReplace(pluginId, member, callback); }\nvoid unhook(Object handle) { bridge.unhook(pluginId, handle); }\nvoid reloadPlugin() { __hchat_runtime.reloadPluginAsync(hostContext, pluginId); }\nString compileSnapshot(String path) { return __hchat_runtime.compileSnapshot(pluginId, pluginDirFile, __hchat_interpreter, path); }\nObject evalSnapshot(String path) { return __hchat_runtime.evalSnapshot(pluginId, pluginDirFile, __hchat_interpreter, path); }\nObject evalSnapshot(InputStream inputStream) { return __hchat_runtime.evalSnapshot(pluginId, __hchat_interpreter, inputStream); }\nObject evalSnapshot(byte[] data) { return __hchat_runtime.evalSnapshot(pluginId, __hchat_interpreter, data); }\nvoid eval(String code) { __hchat_runtime.evalCode(pluginId, __hchat_interpreter, code); }\nvoid loadJava(String path) { __hchat_runtime.loadJava(pluginId, pluginDirFile, __hchat_interpreter, path); }\nvoid useCallback(String callbackName, String methodName) { __hchat_runtime.useCallback(pluginId, __hchat_interpreter, callbackName, methodName); }\nvoid useOnLoad(String methodName) { __hchat_runtime.useCallback(pluginId, __hchat_interpreter, \"onLoad\", methodName); }\nvoid useOnUnload(String methodName) { __hchat_runtime.useCallback(pluginId, __hchat_interpreter, \"onUnload\", methodName); }\nvoid useOpenSettings(String methodName) { __hchat_runtime.useCallback(pluginId, __hchat_interpreter, \"openSettings\", methodName); }\nvoid useOnClickSendBtn(String methodName) { __hchat_runtime.useCallback(pluginId, __hchat_interpreter, \"onClickSendBtn\", methodName); }\nvoid useOnHandleMsg(String methodName) { __hchat_runtime.useCallback(pluginId, __hchat_interpreter, \"onHandleMsg\", methodName); }\nvoid useOnImageDownload(String methodName) { __hchat_runtime.useCallback(pluginId, __hchat_interpreter, \"onImageDownload\", methodName); }\nvoid useOnMemberChange(String methodName) { __hchat_runtime.useCallback(pluginId, __hchat_interpreter, \"onMemberChange\", methodName); }\nvoid useOnNewFriend(String methodName) { __hchat_runtime.useCallback(pluginId, __hchat_interpreter, \"onNewFriend\", methodName); }\nvoid useOnProtobufPacket(String methodName) { __hchat_runtime.useCallback(pluginId, __hchat_interpreter, \"onProtobufPacket\", methodName); }\nClassLoader loadDex(String path) { return __hchat_runtime.loadDex(pluginId, pluginDirFile, __hchat_interpreter, classLoader, path); }\nvoid loadSo(String path) { __hchat_runtime.loadSo(pluginId, pluginDirFile, classLoader, path); }\nvoid loadSo(String path, ClassLoader loader) { __hchat_runtime.loadSo(pluginId, pluginDirFile, loader, path); }\nString getLoginWxid() { return wa.getLoginWxid(); }\nString getLoginAlias() { return wa.getLoginAlias(); }\nString getTargetTalker() { return wa.getTargetTalker(); }\nandroid.app.Activity getTopActivity() { return wa.getTopActivity(); }\nObject getDatabaseApi() { return wa.getDatabaseApi(); }\nObject getOfficialList() { return wa.getOfficialList(); }\nObject getFriendList() { return wa.getFriendList(); }\nObject getFriendListInfo() { return wa.getFriendListInfo(); }\nObject getGroupList() { return wa.getGroupList(); }\nObject getGroupListInfo() { return wa.getGroupListInfo(); }\nObject getGroupMemberListInfo(String groupWxid) { return wa.getGroupMemberListInfo(groupWxid); }\nList getContactLabelList() { return wa.getContactLabelList(); }\nList getContactLabelListInfo() { return wa.getContactLabelListInfo(); }\nList getContactByLabelId(String labelId) { return wa.getContactByLabelId(labelId); }\nList getContactByLabelName(String labelName) { return wa.getContactByLabelName(labelName); }\nString addContactLabel(String labelName) { return wa.addContactLabel(labelName); }\nvoid modifyContactLabelList(String username, String labelName) { wa.modifyContactLabelList(username, labelName); }\nvoid modifyContactLabelList(String username, List labelNames) { wa.modifyContactLabelList(username, labelNames); }\nvoid verifyUser(String wxid, String ticket, int scene) { wa.verifyUser(wxid, ticket, scene); }\nvoid verifyUser(String wxid, String ticket, int scene, int privacy) { wa.verifyUser(wxid, ticket, scene, privacy); }\nObject getGroupMemberList(String groupWxid) { return wa.getGroupMemberList(groupWxid); }\nint getGroupMemberCount(String groupWxid) { return wa.getGroupMemberCount(groupWxid); }\nString getGroupName(String groupWxid) { return wa.getGroupName(groupWxid); }\nString getChatroomName(String chatroomId) { return wa.getChatroomName(chatroomId); }\nString getGroupRemarkName(String groupWxid) { return wa.getGroupRemarkName(groupWxid); }\nString getGroupMemberName(String groupWxid, String memberWxid) { return wa.getGroupMemberName(groupWxid, memberWxid); }\nString getGroupNickName(String groupWxid, String memberWxid) { return wa.getGroupNickName(groupWxid, memberWxid); }\nString getFriendNickName(String friendWxid) { return wa.getFriendNickName(friendWxid); }\nString getFriendRemarkName(String friendWxid) { return wa.getFriendRemarkName(friendWxid); }\nint getFriendGender(String friendWxid) { return wa.getFriendGender(friendWxid); }\nString getFriendProvince(String friendWxid) { return wa.getFriendProvince(friendWxid); }\nString getFriendCity(String friendWxid) { return wa.getFriendCity(friendWxid); }\nString getFriendRegion(String friendWxid) { return wa.getFriendRegion(friendWxid); }\nString getFriendDisplayName(String friendWxid, String roomId) { return wa.getFriendDisplayName(friendWxid, roomId); }\nString getFriendName(String friendWxid) { return wa.getFriendName(friendWxid); }\nString getFriendName(String friendWxid, String roomId) { return wa.getFriendName(friendWxid, roomId); }\nint getGroupMemberGender(String groupWxid, String memberWxid) { return wa.getGroupMemberGender(groupWxid, memberWxid); }\nString getGroupMemberProvince(String groupWxid, String memberWxid) { return wa.getGroupMemberProvince(groupWxid, memberWxid); }\nString getGroupMemberCity(String groupWxid, String memberWxid) { return wa.getGroupMemberCity(groupWxid, memberWxid); }\nString getGroupMemberRegion(String groupWxid, String memberWxid) { return wa.getGroupMemberRegion(groupWxid, memberWxid); }\nvoid addChatroomMember(String chatroomId, String addMember) { wa.addChatroomMember(chatroomId, addMember); }\nvoid addChatroomMember(String chatroomId, List addMemberList) { wa.addChatroomMember(chatroomId, addMemberList); }\nvoid inviteChatroomMember(String chatroomId, String inviteMember) { wa.inviteChatroomMember(chatroomId, inviteMember); }\nvoid inviteChatroomMember(String chatroomId, List inviteMemberList) { wa.inviteChatroomMember(chatroomId, inviteMemberList); }\nvoid delChatroomMember(String chatroomId, String delMember) { wa.delChatroomMember(chatroomId, delMember); }\nvoid delChatroomMember(String chatroomId, List delMemberList) { wa.delChatroomMember(chatroomId, delMemberList); }\nString getAvatarUrl(String username) { return wa.getAvatarUrl(username); }\nString getAvatarUrl(String username, boolean isBigHeadImg) { return wa.getAvatarUrl(username, isBigHeadImg); }\nvoid sendText(String talker, String content) { wa.sendText(talker, content); }\nvoid sendText(String talker, String content, Consumer callback) { wa.sendText(talker, content, callback); }\nboolean sendProtobufPacket(String uri, int cgiId, String json) { return __hchat_runtime.sendProtobufPacket(uri, cgiId, json, null); }\nboolean sendProtobufPacket(String uri, int cgiId, String json, Consumer callback) { return __hchat_runtime.sendProtobufPacket(uri, cgiId, json, callback); }\nboolean sendProtobufPacket(String uri, int cgiId, JSONObject json) { return __hchat_runtime.sendProtobufPacket(uri, cgiId, json == null ? \"{}\" : json.toString(), null); }\nboolean sendProtobufPacket(String uri, int cgiId, JSONObject json, Consumer callback) { return __hchat_runtime.sendProtobufPacket(uri, cgiId, json == null ? \"{}\" : json.toString(), callback); }\nboolean sendProtobufPacket(String uri, int cgiId, int funcId, int routeId, String json) { return __hchat_runtime.sendProtobufPacket(uri, cgiId, funcId, routeId, json, null); }\nboolean sendProtobufPacket(String uri, int cgiId, int funcId, int routeId, String json, Consumer callback) { return __hchat_runtime.sendProtobufPacket(uri, cgiId, funcId, routeId, json, callback); }\nboolean sendProtobufPacket(String uri, int cgiId, int funcId, int routeId, JSONObject json) { return __hchat_runtime.sendProtobufPacket(uri, cgiId, funcId, routeId, json == null ? \"{}\" : json.toString(), null); }\nboolean sendProtobufPacket(String uri, int cgiId, int funcId, int routeId, JSONObject json, Consumer callback) { return __hchat_runtime.sendProtobufPacket(uri, cgiId, funcId, routeId, json == null ? \"{}\" : json.toString(), callback); }\nvoid sendQuoteMsg(String talker, long msgId, String content) { wa.sendQuoteMsg(talker, msgId, content); }\nvoid sendQuoteMsg(String talker, String content, long msgId) { wa.sendQuoteMsg(talker, content, msgId); }\nvoid revokeMsg(long msgId) { wa.revokeMsg(msgId); }\nvoid uploadDeviceStep(long step) { wa.uploadDeviceStep(step); }\nObject getSnsPostList() { return wa.getSnsPostList(); }\nObject getSnsPostList(int limit) { return wa.getSnsPostList(limit); }\nObject getSnsPostList(String userName, int limit) { return wa.getSnsPostList(userName, limit); }\nObject getSnsPost(String snsId) { return wa.getSnsPost(snsId); }\nboolean prepareSnsPostMedia(String snsId, Consumer callback) { return __hchat_runtime.prepareSnsPostMedia(pluginId, __hchat_interpreter, snsId, callback); }\nboolean publishSnsPost(Object prepared) { return wa.publishSnsPost(prepared); }\nboolean refreshSnsTimeline() { return wa.refreshSnsTimeline(); }\nvoid uploadText(String content) { wa.uploadText(content); }\nvoid uploadText(String content, String sdkId, String sdkAppName) { wa.uploadText(content, sdkId, sdkAppName); }\nvoid uploadText(JSONObject jsonObj) { wa.uploadText(jsonObj); }\nvoid uploadTextAndPicList(String content, String picPath) { wa.uploadTextAndPicList(content, picPath); }\nvoid uploadTextAndPicList(String content, String picPath, String sdkId, String sdkAppName) { wa.uploadTextAndPicList(content, picPath, sdkId, sdkAppName); }\nvoid uploadTextAndPicList(String content, List picPathList) { wa.uploadTextAndPicList(content, picPathList); }\nvoid uploadTextAndPicList(String content, List picPathList, String sdkId, String sdkAppName) { wa.uploadTextAndPicList(content, picPathList, sdkId, sdkAppName); }\nvoid uploadTextAndPicList(JSONObject jsonObj) { wa.uploadTextAndPicList(jsonObj); }\nvoid uploadLivePhoto(String livePhotoPath) { wa.uploadLivePhoto(livePhotoPath); }\nvoid uploadLivePhoto(String imagePath, String videoPath) { wa.uploadLivePhoto(imagePath, videoPath); }\nvoid uploadLivePhoto(JSONObject jsonObj) { wa.uploadLivePhoto(jsonObj); }\nvoid uploadTextAndLivePhoto(String content, String livePhotoPath) { wa.uploadTextAndLivePhoto(content, livePhotoPath); }\nvoid uploadTextAndLivePhoto(String content, String livePhotoPath, String sdkId, String sdkAppName) { wa.uploadTextAndLivePhoto(content, livePhotoPath, sdkId, sdkAppName); }\nvoid uploadTextAndLivePhoto(String content, String imagePath, String videoPath) { wa.uploadTextAndLivePhoto(content, imagePath, videoPath); }\nvoid uploadTextAndLivePhoto(String content, String imagePath, String videoPath, String sdkId, String sdkAppName) { wa.uploadTextAndLivePhoto(content, imagePath, videoPath, sdkId, sdkAppName); }\nvoid uploadTextAndLivePhoto(JSONObject jsonObj) { wa.uploadTextAndLivePhoto(jsonObj); }\nvoid uploadVideo(String videoPath) { wa.uploadVideo(videoPath); }\nvoid uploadVideo(JSONObject jsonObj) { wa.uploadVideo(jsonObj); }\nvoid uploadTextAndVideo(String content, String videoPath) { wa.uploadTextAndVideo(content, videoPath); }\nvoid uploadTextAndVideo(String content, String videoPath, String sdkId, String sdkAppName) { wa.uploadTextAndVideo(content, videoPath, sdkId, sdkAppName); }\nvoid uploadTextAndVideo(JSONObject jsonObj) { wa.uploadTextAndVideo(jsonObj); }\nvoid sendPat(String talker, String pattedUser) { wa.sendPat(talker, pattedUser); }\nvoid sendShareCard(String talker, String wxid) { wa.sendShareCard(talker, wxid); }\nboolean sendImage(String talker, String sendPath) { return wa.sendImage(talker, sendPath); }\nboolean sendImage(String talker, String sendPath, String appId) { return wa.sendImage(talker, sendPath, appId); }\nboolean sendOriginalImage(String talker, String sendPath) { return wa.sendOriginalImage(talker, sendPath); }\nboolean sendVoice(String talker, String sendPath) { return wa.sendVoice(talker, sendPath); }\nboolean sendVoice(String talker, String sendPath, int duration) { return wa.sendVoice(talker, sendPath, duration); }\nboolean sendVideo(String talker, String sendPath) { return wa.sendVideo(talker, sendPath); }\nboolean sendEmoji(String talker, String sendPath) { return wa.sendEmoji(talker, sendPath); }\nboolean sendFile(String talker, String sendPath) { return wa.sendFile(talker, sendPath); }\nboolean sendFile(String talker, String sendPath, String title) { return wa.sendFile(talker, sendPath, title); }\nObject getFavoriteList(int limit) { return wa.getFavoriteList(limit); }\nObject getFavorite(long localId) { return wa.getFavorite(localId); }\nboolean sendFavorite(String talker, long localId) { return wa.sendFavorite(talker, localId); }\nboolean sendFavorite(String talker, String localId) { return wa.sendFavorite(talker, localId); }\nvoid sendMediaMsg(String talker, Object mediaMessage, String appId) { wa.sendMediaMsg(talker, mediaMessage, appId); }\nvoid shareFile(String talker, String title, String filePath, String appId) { wa.shareFile(talker, title, filePath, appId); }\nvoid shareMiniProgram(String talker, String title, String description, String userName, String path, byte[] thumbData, String appId) { wa.shareMiniProgram(talker, title, description, userName, path, thumbData, appId); }\nvoid sendAppBrandMsg(String talker, String title, String pagePath, String ghName) { wa.sendAppBrandMsg(talker, title, pagePath, ghName); }\nvoid shareMusic(String talker, String title, String description, String musicUrl, String musicDataUrl, byte[] thumbData, String appId) { wa.shareMusic(talker, title, description, musicUrl, musicDataUrl, thumbData, appId); }\nvoid shareMusicVideo(String talker, String title, String description, String musicUrl, String musicDataUrl, String singerName, int duration, String songLyric, byte[] thumbData, String appId) { wa.shareMusicVideo(talker, title, description, musicUrl, musicDataUrl, singerName, duration, songLyric, thumbData, appId); }\nvoid shareText(String talker, String text, String appId) { wa.shareText(talker, text, appId); }\nvoid shareVideo(String talker, String title, String description, String videoUrl, byte[] thumbData, String appId) { wa.shareVideo(talker, title, description, videoUrl, thumbData, appId); }\nvoid shareWebpage(String talker, String title, String description, String webpageUrl, byte[] thumbData, String appId) { wa.shareWebpage(talker, title, description, webpageUrl, thumbData, appId); }\nvoid sendXmlMsg(String talker, String content) { wa.sendXmlMsg(talker, content); }\nvoid sendLocation(String talker, String poiName, String label, String x, String y, String scale) { wa.sendLocation(talker, poiName, label, x, y, scale); }\nvoid sendLocation(String talker, JSONObject jsonObj) { wa.sendLocation(talker, jsonObj); }\nlong insertSystemMsg(String talker, String content, long createTime) { return wa.insertSystemMsg(talker, content, createTime); }\nList queryHistoryMsg(String talker, long startTime, int count) { return wa.queryHistoryMsg(talker, startTime, count); }\nint getUnreadCount(String talker) { return wa.getUnreadCount(talker); }\nboolean deleteConversation(String talker) { return wa.deleteConversation(talker); }\nint getAllUnreadCount() { return wa.getAllUnreadCount(); }\nboolean clearUnread(String talker) { return wa.clearUnread(talker); }\nboolean clearAllUnread() { return wa.clearAllUnread(); }\nvoid delay(long millis, Runnable action) { wa.delay(millis, action); }\nvoid notify(String title, String text) { wa.notify(title, text); }\nint getFileType(String filePath) { return audio.getFileType(filePath); }\nint mp3ToSilk(String mp3Path, String silkPath) { return audio.mp3ToSilk(mp3Path, silkPath); }\nint mp3ToSilk(String mp3Path, String silkPath, int hz) { return audio.mp3ToSilk(mp3Path, silkPath, hz); }\nint wavToSilk(String wavPath, String silkPath, int hz) { return audio.wavToSilk(wavPath, silkPath, hz); }\nint flacToSilk(String flacPath, String silkPath, int hz) { return audio.flacToSilk(flacPath, silkPath, hz); }\nint oggToSilk(String oggPath, String silkPath, int hz) { return audio.oggToSilk(oggPath, silkPath, hz); }\nint pcmToSilk(String pcmPath, String silkPath, int hz, int pcmHz, int channels) { return audio.pcmToSilk(pcmPath, silkPath, hz, pcmHz, channels); }\nint autoToSilk(String audioPath, String silkPath, int hz) { return audio.autoToSilk(audioPath, silkPath, hz); }\nint silkToMp3(String silkPath, String mp3Path) { return audio.silkToMp3(silkPath, mp3Path); }\nint silkToMp3(String silkPath, String mp3Path, int hz) { return audio.silkToMp3(silkPath, mp3Path, hz); }\nint silkToPcm(String silkPath, String pcmPath, int hz) { return audio.silkToPcm(silkPath, pcmPath, hz); }\nint mp3ToPcm(String mp3Path, String pcmPath) { return audio.mp3ToPcm(mp3Path, pcmPath); }\nint wavToPcm(String wavPath, String pcmPath) { return audio.wavToPcm(wavPath, pcmPath); }\nint flacToPcm(String flacPath, String pcmPath) { return audio.flacToPcm(flacPath, pcmPath); }\nint oggToPcm(String oggPath, String pcmPath) { return audio.oggToPcm(oggPath, pcmPath); }\nint autoToPcm(String audioPath, String pcmPath) { return audio.autoToPcm(audioPath, pcmPath); }\nMap getAudioInfo(String filePath) { return audio.getAudioInfo(filePath); }\nint decodeAacFile(String aacPath, String pcmPath) { return audio.decodeAacFile(aacPath, pcmPath); }\nint encodePcmToAac(String pcmPath, String aacPath, int sampleRate, int channels) { return audio.encodePcmToAac(pcmPath, aacPath, sampleRate, channels); }\nint encodePcmToM4a(String pcmPath, String m4aPath, int sampleRate, int channels) { return audio.encodePcmToM4a(pcmPath, m4aPath, sampleRate, channels); }\nint mp4ToSilk(String mp4Path, String silkPath, int hz) { return audio.mp4ToSilk(mp4Path, silkPath, hz); }\nint silkToM4a(String silkPath, String m4aPath, int hz) { return audio.silkToM4a(silkPath, m4aPath, hz); }\nint mp4ToM4a(String mp4Path, String m4aPath, int hz) { return audio.mp4ToM4a(mp4Path, m4aPath, hz); }\nint mp4ToAac(String mp4Path, String aacPath, int hz) { return audio.mp4ToAac(mp4Path, aacPath, hz); }\nint m4aToSilk(String m4aPath, String silkPath, int hz) { return audio.m4aToSilk(m4aPath, silkPath, hz); }\nint aacToSilk(String aacPath, String silkPath, int hz) { return audio.aacToSilk(aacPath, silkPath, hz); }\nint m4aToAac(String m4aPath, String aacPath, int hz) { return audio.m4aToAac(m4aPath, aacPath, hz); }\nint m4aToM4a(String m4aPath, String m4aPathOut, int hz) { return audio.m4aToM4a(m4aPath, m4aPathOut, hz); }\nint autoToAac(String inputPath, String aacPath, int hz) { return audio.autoToAac(inputPath, aacPath, hz); }\nint autoToM4a(String inputPath, String m4aPath, int hz) { return audio.autoToM4a(inputPath, m4aPath, hz); }\nint autoAacToSilk(String inputPath, String silkPath, int hz) { return audio.autoAacToSilk(inputPath, silkPath, hz); }\nint silkToAac(String silkPath, String aacPath, int hz) { return audio.silkToAac(silkPath, aacPath, hz); }\nint aacToPcm(String aacPath, String pcmPath) { return audio.aacToPcm(aacPath, pcmPath); }\nint pcmToAac(String pcmPath, String aacPath, int sampleRate, int channels) { return audio.pcmToAac(pcmPath, aacPath, sampleRate, channels); }\nint pcmToM4a(String pcmPath, String m4aPath, int sampleRate, int channels) { return audio.pcmToM4a(pcmPath, m4aPath, sampleRate, channels); }\nint m4aToPcm(String m4aPath, String pcmPath) { return audio.m4aToPcm(m4aPath, pcmPath); }\nint decodeM4aFile(String m4aPath, String pcmPath) { return audio.decodeM4aFile(m4aPath, pcmPath); }\nlong getDuration(String filePath) { return audio.getDuration(filePath); }\nlong getDurationLimited(String filePath) { return audio.getDurationLimited(filePath); }\nString getErrorMessage(int code) { return audio.getErrorMessage(code); }\nvoid startTransform(int type, String inputPath, String outputPath, int sampleRate, Consumer callback) { audio.startTransform(type, inputPath, outputPath, sampleRate, callback); }\nvoid get(String url, Map headerMap, Consumer callback) { wa.get(url, headerMap, callback); }\nvoid get(String url, Map headerMap, long timeout, Consumer callback) { wa.get(url, headerMap, timeout, callback); }\nvoid get(String url, Map headerMap, PluginCallBack.HttpCallback callback) {\n    wa.get(url, headerMap, new Consumer() {\n        public void accept(Object body) {\n            if (body != null) callback.onSuccess(200, String.valueOf(body));\n            else callback.onError(new Exception(\"GET failed: \" + url));\n        }\n    });\n}\nvoid get(String url, Map headerMap, long timeout, PluginCallBack.HttpCallback callback) {\n    wa.get(url, headerMap, timeout, new Consumer() {\n        public void accept(Object body) {\n            if (body != null) callback.onSuccess(200, String.valueOf(body));\n            else callback.onError(new Exception(\"GET failed: \" + url));\n        }\n    });\n}\nvoid post(String url, Map paramMap, Map headerMap, Consumer callback) { wa.post(url, paramMap, headerMap, callback); }\nvoid post(String url, Map paramMap, Map headerMap, long timeout, Consumer callback) { wa.post(url, paramMap, headerMap, timeout, callback); }\nvoid post(String url, Map paramMap, Map headerMap, PluginCallBack.HttpCallback callback) {\n    wa.post(url, paramMap, headerMap, new Consumer() {\n        public void accept(Object body) {\n            if (body != null) callback.onSuccess(200, String.valueOf(body));\n            else callback.onError(new Exception(\"POST failed: \" + url));\n        }\n    });\n}\nvoid post(String url, Map paramMap, Map headerMap, long timeout, PluginCallBack.HttpCallback callback) {\n    wa.post(url, paramMap, headerMap, timeout, new Consumer() {\n        public void accept(Object body) {\n            if (body != null) callback.onSuccess(200, String.valueOf(body));\n            else callback.onError(new Exception(\"POST failed: \" + url));\n        }\n    });\n}\nvoid download(String url, String path, Map headerMap, Consumer callback) { wa.download(url, path, headerMap, callback); }\nvoid download(String url, String path, Map headerMap, long timeout, Consumer callback) { wa.download(url, path, headerMap, timeout, callback); }\nvoid download(String url, String path, Map headerMap, PluginCallBack.DownloadCallback callback) {\n    wa.download(url, path, headerMap, new Consumer() {\n        public void accept(Object file) {\n            if (file instanceof File) callback.onSuccess((File) file);\n            else callback.onError(new Exception(\"Download failed: \" + url));\n        }\n    });\n}\nvoid download(String url, String path, Map headerMap, long timeout, PluginCallBack.DownloadCallback callback) {\n    wa.download(url, path, headerMap, timeout, new Consumer() {\n        public void accept(Object file) {\n            if (file instanceof File) callback.onSuccess((File) file);\n            else callback.onError(new Exception(\"Download failed: \" + url));\n        }\n    });\n}\nvoid downloadImage(String url, Consumer callback) { wa.downloadImage(url, callback); }\nvoid downloadImage(String url, String fileName, Consumer callback) { wa.downloadImage(url, fileName, callback); }\nvoid downloadImg(String md5, String cdnUrl, String aesKey, String savePath) { wa.downloadImg(md5, cdnUrl, aesKey, savePath); }\nvoid downloadImg(Object imageMsg, String savePath) { wa.downloadImg(imageMsg, savePath); }\nvoid downloadImg(Object imageMsg, String savePath, PluginCallBack.DownloadCallback callback) { wa.downloadImg(imageMsg, savePath, callback); }\nvoid downloadImages(List urlList, Consumer callback) { wa.downloadImages(urlList, callback); }\nvoid downloadImages(List urlList, String prefix, Consumer callback) { wa.downloadImages(urlList, prefix, callback); }\nvoid downloadVideo(String md5, String cdnUrl, String aesKey, String savePath, PluginCallBack.DownloadCallback callback) { wa.downloadVideo(md5, cdnUrl, aesKey, savePath, callback); }\nvoid downloadVideo(Object videoMessage, String savePath, PluginCallBack.DownloadCallback callback) { wa.downloadVideo(videoMessage, savePath, callback); }");
        return interpreter;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    public final void notifyPluginCatalogChanged() {
        CopyOnWriteArrayList<InterfaceC1220a> copyOnWriteArrayList = pluginCatalogListeners;
        if (copyOnWriteArrayList.isEmpty()) {
            return;
        }
        Iterator<T> it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            try {
                ((InterfaceC1220a) it.next()).invoke();
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private final Set<String> parseProcessScope(String str, String str2) {
        List listM99x0;
        if (str2 == null || AbstractC3149m.m6721t0(str2)) {
            return AbstractC0063p.m404N(PROCESS_MAIN);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Locale locale = Locale.US;
        String strM5165l = AbstractC2091b.m5165l(locale, str2, locale);
        Pattern patternCompile = Pattern.compile("[,;|\\s]+");
        patternCompile.getClass();
        AbstractC3149m.m6689D0(0);
        Matcher matcher = patternCompile.matcher(strM5165l);
        if (matcher.find()) {
            ArrayList arrayList = new ArrayList(10);
            int iEnd = 0;
            do {
                arrayList.add(strM5165l.subSequence(iEnd, matcher.start()).toString());
                iEnd = matcher.end();
            } while (matcher.find());
            arrayList.add(strM5165l.subSequence(iEnd, strM5165l.length()).toString());
            listM99x0 = arrayList;
        } else {
            listM99x0 = AbstractC0000a.m99x0(strM5165l.toString());
        }
        ArrayList<String> arrayList2 = new ArrayList();
        for (Object obj : listM99x0) {
            if (!AbstractC3149m.m6721t0((String) obj)) {
                arrayList2.add(obj);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : arrayList2) {
            String str3 = (String) obj2;
            if (!(AbstractC1416l.m3825a(str3, PROCESS_MAIN) || AbstractC1416l.m3825a(str3, PROCESS_APPBRAND) || AbstractC1416l.m3825a(str3, "all"))) {
                arrayList3.add(obj2);
            }
        }
        if (!arrayList3.isEmpty()) {
            if (invalidProcessWarnings.add(AbstractC4855en.m9264h(str, ":", AbstractC3149m.m6703R0(str2).toString()))) {
                AbstractC1184v0.m3203m("[Hchat:Script] 插件进程配置无效，已拒绝加载: plugin=" + str + " process=" + AbstractC3149m.m6703R0(str2).toString());
            }
            return C4175v.f13712g;
        }
        for (String str4 : arrayList2) {
            int iHashCode = str4.hashCode();
            if (iHashCode != 96673) {
                if (iHashCode != 3343801) {
                    if (iHashCode == 1170537990 && str4.equals(PROCESS_APPBRAND)) {
                        linkedHashSet.add(PROCESS_APPBRAND);
                    }
                } else if (str4.equals(PROCESS_MAIN)) {
                    linkedHashSet.add(PROCESS_MAIN);
                }
            } else if (str4.equals("all")) {
                linkedHashSet.add(PROCESS_MAIN);
                linkedHashSet.add(PROCESS_APPBRAND);
            }
        }
        return linkedHashSet.isEmpty() ? AbstractC0063p.m404N(PROCESS_MAIN) : linkedHashSet;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    public static final void prepareSnsPostMedia$lambda$0(C3351d0 c3351d0, String str, AtomicBoolean atomicBoolean, String str2, Interpreter interpreter, String str3, Consumer consumer) {
        Object c3959f;
        try {
            WeChatSnsPrepareResult weChatSnsPrepareResultM7082p = c3351d0.m7082p(str, atomicBoolean);
            if (!atomicBoolean.get()) {
                ConcurrentHashMap<String, C0853a0> concurrentHashMap = loadedPlugins;
                C0853a0 c0853a0 = concurrentHashMap.get(str2);
                if ((c0853a0 != null ? c0853a0.f2607b : null) == interpreter) {
                    try {
                        ReentrantLock reentrantLockInterpreterLock = INSTANCE.interpreterLock(interpreter);
                        reentrantLockInterpreterLock.lock();
                        try {
                            if (!atomicBoolean.get() && concurrentHashMap.get(str2) == c0853a0) {
                                consumer.accept(weChatSnsPrepareResultM7082p);
                            }
                            reentrantLockInterpreterLock.unlock();
                            c3959f = C3967n.f12976a;
                        } catch (Throwable th2) {
                            reentrantLockInterpreterLock.unlock();
                            throw th2;
                        }
                    } catch (Throwable th3) {
                        c3959f = new C3959f(th3);
                    }
                    Throwable thM8182b = C3960g.m8182b(c3959f);
                    if (thM8182b != null) {
                        AbstractC1184v0.m3204n("[Hchat:Script] 朋友圈媒体准备回调失败: " + str2 + " " + thM8182b.getMessage(), thM8182b);
                    }
                }
            }
            snsPrepareCancellations.remove(str3, atomicBoolean);
        } catch (Throwable th4) {
            snsPrepareCancellations.remove(str3, atomicBoolean);
            throw th4;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private final File processScopedCacheRoot(Context context, String str) {
        File file = new File(context.getCodeCacheDir(), str);
        String str2 = runtimeProcess;
        String str3 = PROCESS_APPBRAND;
        if (!AbstractC1416l.m3825a(str2, PROCESS_APPBRAND)) {
            return file;
        }
        String str4 = runtimeProcessName;
        if (!AbstractC3149m.m6721t0(str4)) {
            str3 = str4;
        }
        return new File(file, safeFileName(str3));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    public static final Thread protobufCallbackExecutor$lambda$0(Runnable runnable) {
        return AbstractC2091b.m5167n("Hchat-Script-Protobuf", true, runnable);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    public static final void protobufPacketListener$lambda$0(ProtobufPacketRuntime$Packet protobufPacketRuntime$Packet) {
        ScriptPluginRuntime scriptPluginRuntime = INSTANCE;
        protobufPacketRuntime$Packet.getClass();
        scriptPluginRuntime.dispatchOnProtobufPacket(protobufPacketRuntime$Packet);
    }

    /* JADX DEBUG: Another duplicated slice has different insns count: {[]}, finally: {[THROW, INVOKE, MOVE_EXCEPTION, THROW, MOVE_EXCEPTION] complete} */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    private final Properties readPluginMeta(File file) {
        Object c3959f;
        Properties properties = new Properties();
        File file2 = new File(file, INFO_FILE);
        if (file2.isFile()) {
            try {
                InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(file2), AbstractC3137a.f10177a);
                try {
                    properties.load(inputStreamReader);
                    inputStreamReader.close();
                    c3959f = C3967n.f12976a;
                } finally {
                }
            } catch (Throwable th2) {
                c3959f = new C3959f(th2);
            }
            Throwable thM8182b = C3960g.m8182b(c3959f);
            if (thM8182b != null) {
                AbstractC0921a.m2260w("[Hchat:Script] 读取插件信息失败: ", file.getName(), " ", thM8182b.getMessage(), thM8182b);
            }
        }
        return properties;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void refreshPluginDirObservers(File file) throws Throwable {
        Set setM6419c0;
        try {
            try {
                File[] fileArrListFiles = file.listFiles();
                if (fileArrListFiles != null) {
                    InterfaceC3012j interfaceC3012jM8376k0 = AbstractC4165l.m8376k0(fileArrListFiles);
                    Class clsMo3818a = AbstractC1426v.m3834a(ScriptPluginRuntime.class).mo3818a();
                    clsMo3818a.getClass();
                    setM6419c0 = AbstractC3015m.m6419c0(AbstractC3015m.m6413W(new C3011i(interfaceC3012jM8376k0, true, new C0361f(1, this, clsMo3818a, "isPluginDirectory", "isPluginDirectory(Ljava/io/File;)Z", 0, 0, 13)), new C0837h(15)));
                } else {
                    setM6419c0 = C4175v.f13712g;
                }
                Set<String> setKeySet = pluginDirObservers.keySet();
                setKeySet.getClass();
                ArrayList arrayList = new ArrayList();
                for (Object obj : setKeySet) {
                    if (!setM6419c0.contains((String) obj)) {
                        arrayList.add(obj);
                    }
                }
                for (Object obj2 : arrayList) {
                    obj2.getClass();
                    String str = (String) obj2;
                    FileObserver fileObserverRemove = pluginDirObservers.remove(str);
                    if (fileObserverRemove != null) {
                        fileObserverRemove.stopWatching();
                    }
                    Runnable runnableRemove = reloadTasks.remove(str);
                    if (runnableRemove != null) {
                        mainHandler.removeCallbacks(runnableRemove);
                    }
                }
                File[] fileArrListFiles2 = file.listFiles();
                if (fileArrListFiles2 != null) {
                    ArrayList<File> arrayList2 = new ArrayList();
                    for (File file2 : fileArrListFiles2) {
                        if (isPluginDirectory(file2)) {
                            arrayList2.add(file2);
                        }
                    }
                    for (File file3 : arrayList2) {
                        ConcurrentHashMap<String, FileObserver> concurrentHashMap = pluginDirObservers;
                        if (!concurrentHashMap.containsKey(file3.getName())) {
                            FileObserverC0865e0 fileObserverC0865e0 = new FileObserverC0865e0(file3, file3.getAbsolutePath(), 0);
                            fileObserverC0865e0.startWatching();
                            concurrentHashMap.put(file3.getName(), fileObserverC0865e0);
                        }
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    public static final void reloadPluginAsync$lambda$0(Context context, String str) throws Throwable {
        Object objM10924reloadPlugingIAlus = INSTANCE.m10924reloadPlugingIAlus(context, str);
        if (objM10924reloadPlugingIAlus instanceof C3959f) {
            Throwable thM8182b = C3960g.m8182b(objM10924reloadPlugingIAlus);
            AbstractC1184v0.m3204n(AbstractC0255e.m1021j("[Hchat:Script] 插件重载失败: ", str, " ", thM8182b != null ? thM8182b.getMessage() : null), C3960g.m8182b(objM10924reloadPlugingIAlus));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private final void reloadPluginFromFileChange(Context context, String str) {
        new Thread(new RunnableC0900w(context, str, 2), AbstractC4855en.m9263g("Hchat-Script-AutoReload-", str)).start();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    public static final void reloadPluginFromFileChange$lambda$0(Context context, String str) {
        Object next;
        ScriptPluginRuntime scriptPluginRuntime = INSTANCE;
        if (scriptPluginRuntime.m10924reloadPlugingIAlus(context, str) instanceof C3959f) {
            Iterator<T> it = scriptPluginRuntime.listPlugins(context).iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                } else {
                    next = it.next();
                    if (((C0859c0) next).f2626a.equals(str)) {
                        break;
                    }
                }
            }
            SharedPreferences.Editor editorEdit = AbstractC4302b.m8640c(context, "Hchat_script_plugin_config").edit();
            str.getClass();
            editorEdit.putBoolean("script_plugin_item_".concat(str), false).apply();
            new Handler(Looper.getMainLooper()).post(new RunnableC0006d(context, 7, (C0859c0) next));
        }
        INSTANCE.notifyPluginCatalogChanged();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    public static final void reloadPluginFromFileChange$lambda$0$1(Context context, C0859c0 c0859c0) {
        String str;
        if (c0859c0 == null || (str = c0859c0.f2633h) == null) {
            str = "未知";
        }
        Toast.makeText(context, "加载[" + str + "]失败，已自动关闭", 0).show();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private final File resolvePluginFile(File file, String str) {
        if (AbstractC3149m.m6721t0(str)) {
            C2104o.m5294t("路径不能为空");
            return null;
        }
        File file2 = new File(str);
        return file2.isAbsolute() ? file2 : new File(file, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private final String safeCallbackFilePart(String str) {
        if (str == null) {
            str = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        String strM5161h = AbstractC2091b.m5161h("[^A-Za-z0-9._-]", str, "_");
        return AbstractC3149m.m6721t0(strM5161h) ? WeChatSnsPost.TYPE_UNKNOWN : strM5161h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private final String safeFileName(String str) {
        Pattern patternCompile = Pattern.compile("[^A-Za-z0-9._-]");
        patternCompile.getClass();
        str.getClass();
        String strReplaceAll = patternCompile.matcher(str).replaceAll("_");
        strReplaceAll.getClass();
        return AbstractC3149m.m6721t0(strReplaceAll) ? "plugin" : strReplaceAll;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    public final void schedulePluginReload(String str) {
        Context context;
        if (loadedPlugins.containsKey(str) && (context = appContext) != null) {
            RunnableC0900w runnableC0900w = new RunnableC0900w(str, context, 1);
            Runnable runnablePut = reloadTasks.put(str, runnableC0900w);
            if (runnablePut != null) {
                mainHandler.removeCallbacks(runnablePut);
            }
            mainHandler.postDelayed(runnableC0900w, RELOAD_DEBOUNCE_MS);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    public static final void schedulePluginReload$lambda$0(String str, Context context) {
        reloadTasks.remove(str);
        INSTANCE.reloadPluginFromFileChange(context, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private final boolean scriptHasCallback(String str, String str2, String str3) {
        str2.getClass();
        String strQuote = Pattern.quote(str2);
        strQuote.getClass();
        Pattern patternCompile = Pattern.compile("\\b" + strQuote + "\\s*\\(");
        patternCompile.getClass();
        str.getClass();
        if (patternCompile.matcher(str).find()) {
            return true;
        }
        str3.getClass();
        String strQuote2 = Pattern.quote(str3);
        strQuote2.getClass();
        Pattern patternCompile2 = Pattern.compile("\\b" + strQuote2 + "\\s*\\(");
        patternCompile2.getClass();
        if (patternCompile2.matcher(str).find()) {
            return true;
        }
        String strQuote3 = Pattern.quote(str2);
        strQuote3.getClass();
        Pattern patternCompile3 = Pattern.compile("\\buseCallback\\s*\\(\\s*[\"']" + strQuote3 + "[\"']\\s*,");
        patternCompile3.getClass();
        return patternCompile3.matcher(str).find();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    public static final void sendProtobufPacket$lambda$0(Consumer consumer, boolean z9, String str) {
        INSTANCE.deliverProtobufSendResult(consumer, z9, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    public static final void sendProtobufPacket$lambda$1(Consumer consumer, boolean z9, String str) {
        INSTANCE.deliverProtobufSendResult(consumer, z9, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    private final String sha256(File file) throws NoSuchAlgorithmException, IOException {
        int i9;
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            byte[] bArr = new byte[8192];
            while (true) {
                int i10 = fileInputStream.read(bArr);
                if (i10 <= 0) {
                    break;
                }
                messageDigest.update(bArr, 0, i10);
            }
            fileInputStream.close();
            byte[] bArrDigest = messageDigest.digest();
            bArrDigest.getClass();
            StringBuilder sb2 = new StringBuilder();
            sb2.append((CharSequence) HttpUrl.FRAGMENT_ENCODE_SET);
            int i11 = 0;
            for (byte b10 : bArrDigest) {
                i11++;
                if (i11 > 1) {
                    sb2.append((CharSequence) HttpUrl.FRAGMENT_ENCODE_SET);
                }
                sb2.append(sha256$lambda$1(b10));
            }
            sb2.append((CharSequence) HttpUrl.FRAGMENT_ENCODE_SET);
            return sb2.toString();
        } finally {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static final CharSequence sha256$lambda$1(byte b10) {
        return String.format("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(b10)}, 1));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private final SecretKey snapshotKey(String str) {
        return new SecretKeySpec(snapshotKeyBytes(), "AES");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private final byte[] snapshotKeyBytes() {
        byte[] bArr = {106, 107, 104, JSONB.Constants.BC_STR_ASCII_FIX_32, 110, 111, 108, JSONB.Constants.BC_STR_ASCII_FIX_36, 98, 99, 59, JSONB.Constants.BC_INT32_BYTE_ZERO, 57, 62, 63, 60};
        byte[] bArr2 = new byte[16];
        for (int i9 = 0; i9 < 16; i9++) {
            bArr2[i9] = (byte) (bArr[i9] ^ 90);
        }
        return bArr2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    public static final Thread snsPrepareExecutor$lambda$0(Runnable runnable) {
        return AbstractC2091b.m5167n("Hchat-Script-SnsPrepare", true, runnable);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private final synchronized void startPluginObservers(Context context) {
        try {
            File fileEnsureDirs = ensureDirs(context);
            if (scriptRootObserver == null) {
                FileObserverC0865e0 fileObserverC0865e0 = new FileObserverC0865e0(fileEnsureDirs, fileEnsureDirs.getAbsolutePath(), 1);
                fileObserverC0865e0.startWatching();
                scriptRootObserver = fileObserverC0865e0;
            }
            refreshPluginDirObservers(fileEnsureDirs);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private final boolean supportsProcess(C0859c0 c0859c0, String str) {
        return c0859c0.f2634i.contains(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: unloadAllPlugins-d1pmJ48, reason: not valid java name */
    private final synchronized Object m10920unloadAllPluginsd1pmJ48() {
        Object c3959f;
        try {
            Enumeration<String> enumerationKeys = loadedPlugins.keys();
            enumerationKeys.getClass();
            ArrayList<String> list = Collections.list(enumerationKeys);
            list.getClass();
            for (String str : list) {
                str.getClass();
                AbstractC1089i.m2732I0(m10921unloadPluginIoAF18A(str));
            }
            c3959f = C3967n.f12976a;
        } catch (Throwable th2) {
            c3959f = new C3959f(th2);
        }
        return c3959f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: unloadPlugin-IoAF18A, reason: not valid java name */
    private final synchronized Object m10921unloadPluginIoAF18A(String str) {
        Object c3959f;
        try {
            cancelSnsPrepareTasks(str);
            C0853a0 c0853a0Remove = loadedPlugins.remove(str);
            if (c0853a0Remove == null) {
                return C3967n.f12976a;
            }
            updateProtobufPacketListener();
            try {
                callLifecycle(c0853a0Remove.f2607b, "onUnload");
                c3959f = C3967n.f12976a;
            } catch (Throwable th2) {
                c3959f = new C3959f(th2);
            }
            Throwable thM8182b = C3960g.m8182b(c3959f);
            if (thM8182b != null) {
                AbstractC1184v0.m3204n("[Hchat:Script] 插件卸载回调失败: " + c0853a0Remove.f2606a.f2627b + " " + thM8182b.getMessage(), thM8182b);
            }
            ScriptPluginBridge scriptPluginBridge = bridge;
            if (scriptPluginBridge != null) {
                scriptPluginBridge.unhookPlugin(str);
            }
            notifyPluginCatalogChanged();
            return C3967n.f12976a;
        } catch (Throwable th3) {
            throw th3;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0061 A[Catch: all -> 0x001e, TRY_LEAVE, TryCatch #1 {all -> 0x001e, blocks: (B:4:0x0003, B:6:0x0014, B:36:0x0080, B:50:0x00a6, B:52:0x00ac, B:49:0x00a0, B:11:0x0021, B:12:0x0025, B:14:0x002b, B:16:0x0035, B:31:0x005b, B:33:0x0061, B:30:0x0055, B:20:0x003f, B:22:0x0043, B:27:0x004f, B:25:0x004c, B:40:0x008a, B:42:0x008e, B:46:0x009a, B:45:0x0098), top: B:59:0x0003, inners: #0, #2 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void updateProtobufPacketListener() {
        Object c3959f;
        Throwable thM8182b;
        InterfaceC4698i interfaceC4698i;
        Object c3959f2;
        synchronized (protobufListenerLock) {
            try {
                Collection<C0853a0> collectionValues = loadedPlugins.values();
                collectionValues.getClass();
                Collection<C0853a0> collection = collectionValues;
                boolean z9 = true;
                boolean z10 = false;
                if (!(collection instanceof Collection) || !collection.isEmpty()) {
                    Iterator<T> it = collection.iterator();
                    while (it.hasNext()) {
                        if (((C0853a0) it.next()).f2613h) {
                            if (protobufListenerRegistered.compareAndSet(false, true)) {
                                try {
                                    interfaceC4698i = protobufPacketListener;
                                } catch (Throwable th2) {
                                    c3959f = new C3959f(th2);
                                }
                                if (interfaceC4698i != null) {
                                    if (AbstractC4699j.f15697c.addIfAbsent(interfaceC4698i)) {
                                    }
                                    c3959f = Boolean.valueOf(z9);
                                    thM8182b = C3960g.m8182b(c3959f);
                                    if (thM8182b != null) {
                                        protobufListenerRegistered.set(false);
                                        AbstractC1184v0.m3204n("[Hchat:Script] 注册数据包监听器失败: " + thM8182b.getMessage(), thM8182b);
                                    }
                                    return;
                                }
                                C4696g c4696g = AbstractC4699j.f15695a;
                                z9 = false;
                                c3959f = Boolean.valueOf(z9);
                                thM8182b = C3960g.m8182b(c3959f);
                                if (thM8182b != null) {
                                }
                                return;
                            }
                            return;
                        }
                    }
                }
                if (protobufListenerRegistered.compareAndSet(true, false)) {
                    try {
                        InterfaceC4698i interfaceC4698i2 = protobufPacketListener;
                        if (interfaceC4698i2 == null) {
                            C4696g c4696g2 = AbstractC4699j.f15695a;
                        } else if (AbstractC4699j.f15697c.remove(interfaceC4698i2)) {
                            z10 = true;
                        }
                        c3959f2 = Boolean.valueOf(z10);
                    } catch (Throwable th3) {
                        c3959f2 = new C3959f(th3);
                    }
                    Throwable thM8182b2 = C3960g.m8182b(c3959f2);
                    if (thM8182b2 != null) {
                        protobufListenerRegistered.set(true);
                        AbstractC1184v0.m3204n("[Hchat:Script] 注销数据包监听器失败: " + thM8182b2.getMessage(), thM8182b2);
                    }
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    private final void validateNativeLibrary(File file) throws IOException {
        int i9;
        int i10;
        byte[] bArr = new byte[20];
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            Integer numValueOf = Integer.valueOf(fileInputStream.read(bArr));
            fileInputStream.close();
            if (numValueOf.intValue() == 20) {
                if (bArr[0] == 127 && bArr[1] == 69 && bArr[2] == 76 && bArr[3] == 70) {
                    if (bArr[4] != (Process.is64Bit() ? (byte) 2 : (byte) 1)) {
                        C2104o.m5291q(AbstractC4855en.m9263g("SO位数与微信进程不匹配: ", file.getName()));
                        return;
                    }
                    byte b10 = bArr[5];
                    boolean z9 = b10 == 1;
                    if (!z9 && b10 != 2) {
                        C2104o.m5291q(AbstractC4855en.m9263g("SO字节序无效: ", file.getName()));
                        return;
                    }
                    if (z9) {
                        i9 = bArr[18] & 255;
                        i10 = (bArr[19] & 255) << 8;
                    } else {
                        i9 = (bArr[18] & 255) << 8;
                        i10 = bArr[19] & 255;
                    }
                    if ((i9 | i10) == (Process.is64Bit() ? Opcodes.INVOKESPECIAL : 40)) {
                        return;
                    }
                    C2104o.m5291q(AbstractC4855en.m9263g("SO架构与微信进程不匹配: ", file.getName()));
                    return;
                }
            }
            C2104o.m5291q(AbstractC4855en.m9263g("不是有效的ELF文件: ", file.getName()));
        } finally {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private final <T> T withInterpreterLock(Interpreter interpreter, InterfaceC1220a interfaceC1220a) {
        ReentrantLock reentrantLockInterpreterLock = interpreterLock(interpreter);
        reentrantLockInterpreterLock.lock();
        try {
            return (T) interfaceC1220a.invoke();
        } finally {
            reentrantLockInterpreterLock.unlock();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private final void writePluginLoadError(C0859c0 c0859c0, Throwable th2) {
        Object c3959f;
        try {
            File file = c0859c0.f2628c;
            if (!file.isDirectory()) {
                file.mkdirs();
            }
            String str = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", Locale.US).format(new Date());
            File file2 = new File(file, "log.txt");
            StringBuilder sb2 = new StringBuilder("[");
            sb2.append(str);
            sb2.append("] ERROR 插件加载失败\n");
            sb2.append(th2.getClass().getName());
            sb2.append(": ");
            String message = th2.getMessage();
            if (message == null) {
                message = HttpUrl.FRAGMENT_ENCODE_SET;
            }
            sb2.append(message);
            sb2.append('\n');
            AbstractC0793l.m2020Z(file2, sb2.toString());
            c3959f = C3967n.f12976a;
        } catch (Throwable th3) {
            c3959f = new C3959f(th3);
        }
        Throwable thM8182b = C3960g.m8182b(c3959f);
        if (thM8182b != null) {
            AbstractC0921a.m2260w("[Hchat:Script] 写入插件加载错误日志失败: ", c0859c0.f2627b, " ", thM8182b.getMessage(), thM8182b);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: callOpenSettings-IoAF18A, reason: not valid java name */
    public final Object m10922callOpenSettingsIoAF18A(String str) {
        Object c3959f;
        str.getClass();
        C0853a0 c0853a0 = loadedPlugins.get(str);
        if (c0853a0 == null) {
            return new C3959f(new IllegalStateException("插件未开启"));
        }
        if (!c0853a0.f2610e) {
            return new C3959f(new IllegalStateException("插件没有设置入口"));
        }
        try {
            ReentrantLock reentrantLockInterpreterLock = interpreterLock(c0853a0.f2607b);
            reentrantLockInterpreterLock.lock();
            try {
                c3959f = c0853a0.f2607b.eval("openSettings();");
                reentrantLockInterpreterLock.unlock();
            } catch (Throwable th2) {
                reentrantLockInterpreterLock.unlock();
                throw th2;
            }
        } catch (Throwable th3) {
            c3959f = new C3959f(th3);
        }
        if (!(c3959f instanceof C3959f)) {
            c3959f = C3967n.f12976a;
        }
        Throwable thM8182b = C3960g.m8182b(c3959f);
        if (thM8182b != null) {
            AbstractC0921a.m2260w("[Hchat:Script] 插件设置入口失败: ", c0853a0.f2606a.f2627b, " ", thM8182b.getMessage(), thM8182b);
            ScriptPluginBridge scriptPluginBridge = bridge;
            if (scriptPluginBridge != null) {
                C0859c0 c0859c0 = c0853a0.f2606a;
                scriptPluginBridge.log(c0859c0.f2627b, c0859c0.f2628c, "设置入口失败: " + thM8182b.getMessage());
            }
        }
        return c3959f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: callPluginFunction-0E7RQCE, reason: not valid java name */
    public final Object m10923callPluginFunction0E7RQCE(String str, String str2, Object... objArr) {
        Object c3959f;
        str.getClass();
        str2.getClass();
        objArr.getClass();
        C0853a0 c0853a0 = loadedPlugins.get(str);
        if (c0853a0 == null) {
            return new C3959f(new IllegalStateException("插件未开启: ".concat(str)));
        }
        Pattern patternCompile = Pattern.compile("[A-Za-z_][A-Za-z0-9_]*");
        patternCompile.getClass();
        if (!patternCompile.matcher(str2).matches()) {
            return new C3959f(new IllegalArgumentException("非法函数名: ".concat(str2)));
        }
        try {
            ReentrantLock reentrantLockInterpreterLock = interpreterLock(c0853a0.f2607b);
            reentrantLockInterpreterLock.lock();
            try {
                C2564d c2564dM8364A0 = AbstractC4165l.m8364A0(objArr);
                ArrayList arrayList = new ArrayList(AbstractC4167n.m8429e1(c2564dM8364A0));
                Iterator it = c2564dM8364A0.iterator();
                while (((C2563c) it).f8317i) {
                    arrayList.add("__hchat_call_arg_" + ((Number) ((C2563c) it).next()).intValue());
                }
                int length = objArr.length;
                int i9 = 0;
                int i10 = 0;
                while (i9 < length) {
                    c0853a0.f2607b.set((String) arrayList.get(i10), objArr[i9]);
                    i9++;
                    i10++;
                }
                c3959f = c0853a0.f2607b.eval(str2 + "(" + AbstractC4166m.m8392A1(arrayList, ",", null, null, null, 62) + ");");
                reentrantLockInterpreterLock.unlock();
            } catch (Throwable th2) {
                reentrantLockInterpreterLock.unlock();
                throw th2;
            }
        } catch (Throwable th3) {
            c3959f = new C3959f(th3);
        }
        Throwable thM8182b = C3960g.m8182b(c3959f);
        if (thM8182b != null) {
            String str3 = c0853a0.f2606a.f2627b;
            String message = thM8182b.getMessage();
            StringBuilder sbM1027p = AbstractC0255e.m1027p("[Hchat:Script] 调用插件函数失败: ", str3, "#", str2, " ");
            sbM1027p.append(message);
            AbstractC1184v0.m3204n(sbM1027p.toString(), thM8182b);
            ScriptPluginBridge scriptPluginBridge = bridge;
            if (scriptPluginBridge != null) {
                C0859c0 c0859c0 = c0853a0.f2606a;
                scriptPluginBridge.log(c0859c0.f2627b, c0859c0.f2628c, AbstractC0255e.m1021j("调用插件函数失败: ", str2, " ", thM8182b.getMessage()));
            }
        }
        return c3959f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean canOpenSettings(C0859c0 c0859c0) {
        Object c3959f;
        c0859c0.getClass();
        if (!supportsProcess(c0859c0, PROCESS_MAIN)) {
            return false;
        }
        if (hasOpenSettings(c0859c0.f2626a)) {
            return true;
        }
        try {
            c3959f = Boolean.valueOf(detectCallbacks(AbstractC0793l.m2028h0(c0859c0.f2629d, AbstractC3137a.f10177a)).f2807c);
        } catch (Throwable th2) {
            c3959f = new C3959f(th2);
        }
        Object obj = Boolean.FALSE;
        if (c3959f instanceof C3959f) {
            c3959f = obj;
        }
        return ((Boolean) c3959f).booleanValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String compileSnapshot(String str, File file, Interpreter interpreter, String str2) {
        str.getClass();
        file.getClass();
        interpreter.getClass();
        str2.getClass();
        File fileResolvePluginFile = resolvePluginFile(file, str2);
        if (!fileResolvePluginFile.isFile()) {
            C2104o.m5291q(AbstractC4855en.m9263g("源脚本不存在: ", fileResolvePluginFile.getAbsolutePath()));
            return null;
        }
        File file2 = new File(AbstractC0255e.m1020i(fileResolvePluginFile.getAbsolutePath(), SNAPSHOT_SUFFIX));
        ReentrantLock reentrantLockInterpreterLock = interpreterLock(interpreter);
        reentrantLockInterpreterLock.lock();
        try {
            interpreter.compileSnapshot(fileResolvePluginFile.getAbsolutePath(), file2.getAbsolutePath(), INSTANCE.snapshotKey(str));
            reentrantLockInterpreterLock.unlock();
            String absolutePath = file2.getAbsolutePath();
            absolutePath.getClass();
            return absolutePath;
        } catch (Throwable th2) {
            reentrantLockInterpreterLock.unlock();
            throw th2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01c0  */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C0862d0 dispatchOnClickSendBtn(String str) throws Throwable {
        List listM99x0;
        long j3;
        ReentrantLock reentrantLock;
        long jElapsedRealtime;
        Iterator it;
        boolean z9;
        long jElapsedRealtime2;
        C4173t c4173t = C4173t.f13710g;
        str.getClass();
        ConcurrentHashMap<String, C0853a0> concurrentHashMap = loadedPlugins;
        boolean z10 = false;
        if (concurrentHashMap.isEmpty()) {
            return new C0862d0(c4173t, false);
        }
        ArrayList arrayList = new ArrayList();
        Collection<C0853a0> collectionValues = concurrentHashMap.values();
        collectionValues.getClass();
        boolean z11 = true;
        C3011i c3011i = new C3011i(new C0795n(collectionValues, 6), true, new C0837h(17));
        C0031h c0031h = new C0031h(11);
        ArrayList arrayList2 = new ArrayList();
        AbstractC3015m.m6417a0(c3011i, arrayList2);
        AbstractC4170q.m8431g1(arrayList2, c0031h);
        Iterator it2 = arrayList2.iterator();
        if (it2.hasNext()) {
            Object next = it2.next();
            if (it2.hasNext()) {
                ArrayList arrayList3 = new ArrayList();
                arrayList3.add(next);
                while (it2.hasNext()) {
                    arrayList3.add(it2.next());
                }
                listM99x0 = arrayList3;
            } else {
                listM99x0 = AbstractC0000a.m99x0(next);
            }
        } else {
            listM99x0 = c4173t;
        }
        if (listM99x0.isEmpty()) {
            return new C0862d0(c4173t, false);
        }
        Iterator it3 = listM99x0.iterator();
        while (it3.hasNext()) {
            Object next2 = it3.next();
            next2.getClass();
            C0853a0 c0853a0 = (C0853a0) next2;
            ReentrantLock reentrantLockInterpreterLock = interpreterLock(c0853a0.f2607b);
            if (reentrantLockInterpreterLock.tryLock()) {
                long jElapsedRealtime3 = SystemClock.elapsedRealtime();
                try {
                    Interpreter interpreter = c0853a0.f2607b;
                    j3 = SEND_BUTTON_SLOW_CALLBACK_MS;
                    try {
                        interpreter.set("__hchat_send_text", str);
                        if (AbstractC1416l.m3825a(c0853a0.f2607b.eval("onClickSendBtn(__hchat_send_text);"), Boolean.TRUE)) {
                            try {
                                arrayList.add(c0853a0.f2606a.f2627b);
                                z10 = z11;
                            } catch (Throwable th2) {
                                th = th2;
                                z10 = z11;
                                try {
                                    String message = th.getMessage();
                                    if (message == null) {
                                        message = HttpUrl.FRAGMENT_ENCODE_SET;
                                    }
                                    it = it3;
                                    if (AbstractC3149m.m6709h0(message, "Command not found", z11) || AbstractC3149m.m6709h0(message, "undefined", z11) || AbstractC3149m.m6709h0(message, "not found", z11)) {
                                        z9 = z10;
                                    } else {
                                        String str2 = c0853a0.f2606a.f2627b;
                                        String message2 = th.getMessage();
                                        StringBuilder sb2 = new StringBuilder();
                                        z9 = z10;
                                        sb2.append("[Hchat:Script] 发送按钮回调失败: ");
                                        sb2.append(str2);
                                        sb2.append(" ");
                                        sb2.append(message2);
                                        AbstractC1184v0.m3204n(sb2.toString(), th);
                                        ScriptPluginBridge scriptPluginBridge = bridge;
                                        if (scriptPluginBridge != null) {
                                            C0859c0 c0859c0 = c0853a0.f2606a;
                                            String str3 = c0859c0.f2627b;
                                            File file = c0859c0.f2628c;
                                            StringBuilder sb3 = new StringBuilder();
                                            reentrantLock = reentrantLockInterpreterLock;
                                            try {
                                                sb3.append("发送按钮回调失败: ");
                                                sb3.append(th);
                                                scriptPluginBridge.log(str3, file, sb3.toString());
                                            } catch (Throwable th3) {
                                                th = th3;
                                                reentrantLock.unlock();
                                                jElapsedRealtime = SystemClock.elapsedRealtime() - jElapsedRealtime3;
                                                if (jElapsedRealtime >= j3) {
                                                    String strConcat = "slow:".concat(c0853a0.f2606a.f2626a);
                                                    StringBuilder sbM2259v = AbstractC0921a.m2259v("发送按钮回调耗时: ", c0853a0.f2606a.f2627b, " ", jElapsedRealtime);
                                                    sbM2259v.append("ms");
                                                    logSendButtonDiagnostic(strConcat, sbM2259v.toString());
                                                }
                                                throw th;
                                            }
                                        }
                                        reentrantLock.unlock();
                                        jElapsedRealtime2 = SystemClock.elapsedRealtime() - jElapsedRealtime3;
                                        if (jElapsedRealtime2 >= j3) {
                                            String strConcat2 = "slow:".concat(c0853a0.f2606a.f2626a);
                                            StringBuilder sbM2259v2 = AbstractC0921a.m2259v("发送按钮回调耗时: ", c0853a0.f2606a.f2627b, " ", jElapsedRealtime2);
                                            sbM2259v2.append("ms");
                                            logSendButtonDiagnostic(strConcat2, sbM2259v2.toString());
                                        }
                                        z10 = z9;
                                    }
                                    reentrantLock = reentrantLockInterpreterLock;
                                    reentrantLock.unlock();
                                    jElapsedRealtime2 = SystemClock.elapsedRealtime() - jElapsedRealtime3;
                                    if (jElapsedRealtime2 >= j3) {
                                    }
                                    z10 = z9;
                                } catch (Throwable th4) {
                                    th = th4;
                                    reentrantLock = reentrantLockInterpreterLock;
                                    reentrantLock.unlock();
                                    jElapsedRealtime = SystemClock.elapsedRealtime() - jElapsedRealtime3;
                                    if (jElapsedRealtime >= j3) {
                                    }
                                    throw th;
                                }
                            }
                        }
                        reentrantLockInterpreterLock.unlock();
                        long jElapsedRealtime4 = SystemClock.elapsedRealtime() - jElapsedRealtime3;
                        if (jElapsedRealtime4 >= SEND_BUTTON_SLOW_CALLBACK_MS) {
                            String strConcat3 = "slow:".concat(c0853a0.f2606a.f2626a);
                            StringBuilder sbM2259v3 = AbstractC0921a.m2259v("发送按钮回调耗时: ", c0853a0.f2606a.f2627b, " ", jElapsedRealtime4);
                            sbM2259v3.append("ms");
                            logSendButtonDiagnostic(strConcat3, sbM2259v3.toString());
                        }
                        it = it3;
                    } catch (Throwable th5) {
                        th = th5;
                    }
                } catch (Throwable th6) {
                    th = th6;
                    j3 = SEND_BUTTON_SLOW_CALLBACK_MS;
                }
                it3 = it;
                z11 = true;
            } else {
                logBusySendButtonPlugin(c0853a0);
            }
        }
        return new C0862d0(arrayList, z10);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void dispatchOnHandleMsg(ScriptMessageBean scriptMessageBean) {
        List listM99x0;
        scriptMessageBean.getClass();
        ConcurrentHashMap<String, C0853a0> concurrentHashMap = loadedPlugins;
        if (concurrentHashMap.isEmpty()) {
            return;
        }
        Collection<C0853a0> collectionValues = concurrentHashMap.values();
        collectionValues.getClass();
        C3011i c3011i = new C3011i(new C0795n(collectionValues, 6), true, new C0837h(11));
        C0031h c0031h = new C0031h(12);
        ArrayList arrayList = new ArrayList();
        AbstractC3015m.m6417a0(c3011i, arrayList);
        AbstractC4170q.m8431g1(arrayList, c0031h);
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            Object next = it.next();
            if (it.hasNext()) {
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(next);
                while (it.hasNext()) {
                    arrayList2.add(it.next());
                }
                listM99x0 = arrayList2;
            } else {
                listM99x0 = AbstractC0000a.m99x0(next);
            }
        } else {
            listM99x0 = C4173t.f13710g;
        }
        if (listM99x0.isEmpty()) {
            return;
        }
        for (Object obj : listM99x0) {
            obj.getClass();
            C0853a0 c0853a0 = (C0853a0) obj;
            try {
                ReentrantLock reentrantLockInterpreterLock = interpreterLock(c0853a0.f2607b);
                reentrantLockInterpreterLock.lock();
                try {
                    c0853a0.f2607b.set("__hchat_msg_info", scriptMessageBean);
                    c0853a0.f2607b.eval("onHandleMsg(__hchat_msg_info);");
                    reentrantLockInterpreterLock.unlock();
                } catch (Throwable th2) {
                    reentrantLockInterpreterLock.unlock();
                    throw th2;
                }
            } catch (Throwable th3) {
                if (!isMissingCallbackError(th3, "onHandleMsg")) {
                    AbstractC0921a.m2260w("[Hchat:Script] 消息监听回调失败: ", c0853a0.f2606a.f2627b, " ", th3.getMessage(), th3);
                    ScriptPluginBridge scriptPluginBridge = bridge;
                    if (scriptPluginBridge != null) {
                        C0859c0 c0859c0 = c0853a0.f2606a;
                        scriptPluginBridge.log(c0859c0.f2627b, c0859c0.f2628c, "消息监听回调失败: " + th3);
                    }
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void dispatchOnImageDownload(ScriptMessageBean scriptMessageBean) {
        Object c3959f;
        ScriptPluginBridge scriptPluginBridge;
        scriptMessageBean.getClass();
        Collection<C0853a0> collectionValues = loadedPlugins.values();
        collectionValues.getClass();
        Collection<C0853a0> collection = collectionValues;
        if ((collection instanceof Collection) && collection.isEmpty()) {
            return;
        }
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            if (((C0853a0) it.next()).f2614i) {
                if (scriptMessageBean.isImage()) {
                    try {
                        c3959f = scriptMessageBean.getImageMsg();
                    } catch (Throwable th2) {
                        c3959f = new C3959f(th2);
                    }
                    if (c3959f instanceof C3959f) {
                        c3959f = null;
                    }
                    if (c3959f == null || (scriptPluginBridge = bridge) == null) {
                        return;
                    }
                    try {
                        imageDownloadCallbackExecutor.execute(new RunnableC0059l(scriptPluginBridge, scriptMessageBean, c3959f, 13));
                        return;
                    } catch (RejectedExecutionException unused) {
                        logDroppedImageDownload();
                        return;
                    }
                }
                return;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void dispatchOnMemberChange(String str, String str2, String str3, String str4) {
        List listM99x0;
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        ConcurrentHashMap<String, C0853a0> concurrentHashMap = loadedPlugins;
        if (concurrentHashMap.isEmpty()) {
            return;
        }
        Collection<C0853a0> collectionValues = concurrentHashMap.values();
        collectionValues.getClass();
        C3011i c3011i = new C3011i(new C0795n(collectionValues, 6), true, new C0837h(16));
        C0031h c0031h = new C0031h(14);
        ArrayList arrayList = new ArrayList();
        AbstractC3015m.m6417a0(c3011i, arrayList);
        AbstractC4170q.m8431g1(arrayList, c0031h);
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            Object next = it.next();
            if (it.hasNext()) {
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(next);
                while (it.hasNext()) {
                    arrayList2.add(it.next());
                }
                listM99x0 = arrayList2;
            } else {
                listM99x0 = AbstractC0000a.m99x0(next);
            }
        } else {
            listM99x0 = C4173t.f13710g;
        }
        if (listM99x0.isEmpty()) {
            return;
        }
        for (Object obj : listM99x0) {
            obj.getClass();
            C0853a0 c0853a0 = (C0853a0) obj;
            try {
                ReentrantLock reentrantLockInterpreterLock = interpreterLock(c0853a0.f2607b);
                reentrantLockInterpreterLock.lock();
                try {
                    c0853a0.f2607b.set("__hchat_member_change_type", str);
                    c0853a0.f2607b.set("__hchat_member_change_group", str2);
                    c0853a0.f2607b.set("__hchat_member_change_user", str3);
                    c0853a0.f2607b.set("__hchat_member_change_name", str4);
                    c0853a0.f2607b.eval("onMemberChange(__hchat_member_change_type, __hchat_member_change_group, __hchat_member_change_user, __hchat_member_change_name);");
                    reentrantLockInterpreterLock.unlock();
                } catch (Throwable th2) {
                    reentrantLockInterpreterLock.unlock();
                    throw th2;
                }
            } catch (Throwable th3) {
                String message = th3.getMessage();
                if (message == null) {
                    message = HttpUrl.FRAGMENT_ENCODE_SET;
                }
                if (!AbstractC3149m.m6709h0(message, "Command not found", true) && !AbstractC3149m.m6709h0(message, "undefined", true) && !AbstractC3149m.m6709h0(message, "not found", true)) {
                    AbstractC0921a.m2260w("[Hchat:Script] 成员变动回调失败: ", c0853a0.f2606a.f2627b, " ", th3.getMessage(), th3);
                    ScriptPluginBridge scriptPluginBridge = bridge;
                    if (scriptPluginBridge != null) {
                        C0859c0 c0859c0 = c0853a0.f2606a;
                        scriptPluginBridge.log(c0859c0.f2627b, c0859c0.f2628c, "成员变动回调失败: " + th3.getMessage());
                    }
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void dispatchOnNewFriend(String str, String str2, int i9) {
        List listM99x0;
        str.getClass();
        str2.getClass();
        ConcurrentHashMap<String, C0853a0> concurrentHashMap = loadedPlugins;
        if (concurrentHashMap.isEmpty()) {
            return;
        }
        String string = AbstractC3149m.m6703R0(str).toString();
        String string2 = AbstractC3149m.m6703R0(str2).toString();
        if (string.length() == 0 || string2.length() == 0) {
            return;
        }
        Collection<C0853a0> collectionValues = concurrentHashMap.values();
        collectionValues.getClass();
        C3011i c3011i = new C3011i(new C0795n(collectionValues, 6), true, new C0837h(12));
        C0031h c0031h = new C0031h(15);
        ArrayList arrayList = new ArrayList();
        AbstractC3015m.m6417a0(c3011i, arrayList);
        AbstractC4170q.m8431g1(arrayList, c0031h);
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            Object next = it.next();
            if (it.hasNext()) {
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(next);
                while (it.hasNext()) {
                    arrayList2.add(it.next());
                }
                listM99x0 = arrayList2;
            } else {
                listM99x0 = AbstractC0000a.m99x0(next);
            }
        } else {
            listM99x0 = C4173t.f13710g;
        }
        if (listM99x0.isEmpty()) {
            return;
        }
        for (Object obj : listM99x0) {
            obj.getClass();
            C0853a0 c0853a0 = (C0853a0) obj;
            try {
                ReentrantLock reentrantLockInterpreterLock = interpreterLock(c0853a0.f2607b);
                reentrantLockInterpreterLock.lock();
                try {
                    c0853a0.f2607b.set("__hchat_new_friend_wxid", string);
                    c0853a0.f2607b.set("__hchat_new_friend_ticket", string2);
                    c0853a0.f2607b.set("__hchat_new_friend_scene", i9);
                    c0853a0.f2607b.eval("onNewFriend(__hchat_new_friend_wxid, __hchat_new_friend_ticket, __hchat_new_friend_scene);");
                    reentrantLockInterpreterLock.unlock();
                } catch (Throwable th2) {
                    reentrantLockInterpreterLock.unlock();
                    throw th2;
                }
            } catch (Throwable th3) {
                String message = th3.getMessage();
                if (message == null) {
                    message = HttpUrl.FRAGMENT_ENCODE_SET;
                }
                if (!AbstractC3149m.m6709h0(message, "Command not found", true) && !AbstractC3149m.m6709h0(message, "undefined", true) && !AbstractC3149m.m6709h0(message, "not found", true)) {
                    AbstractC0921a.m2260w("[Hchat:Script] 好友申请回调失败: ", c0853a0.f2606a.f2627b, " ", th3.getMessage(), th3);
                    ScriptPluginBridge scriptPluginBridge = bridge;
                    if (scriptPluginBridge != null) {
                        C0859c0 c0859c0 = c0853a0.f2606a;
                        scriptPluginBridge.log(c0859c0.f2627b, c0859c0.f2628c, "好友申请回调失败: " + th3.getMessage());
                    }
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void dispatchOnProtobufPacket(ProtobufPacketRuntime$Packet protobufPacketRuntime$Packet) {
        protobufPacketRuntime$Packet.getClass();
        Collection<C0853a0> collectionValues = loadedPlugins.values();
        collectionValues.getClass();
        Collection<C0853a0> collection = collectionValues;
        if ((collection instanceof Collection) && collection.isEmpty()) {
            return;
        }
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            if (((C0853a0) it.next()).f2613h) {
                try {
                    protobufCallbackExecutor.execute(new RunnableC0003a(protobufPacketRuntime$Packet, 8));
                    return;
                } catch (RejectedExecutionException unused) {
                    logDroppedProtobufPacket();
                    return;
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final File ensureDirs(Context context) {
        context.getClass();
        File fileScriptDir = scriptDir(context);
        if (!fileScriptDir.isDirectory()) {
            fileScriptDir.mkdirs();
        }
        return fileScriptDir;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object evalCode(String str, Interpreter interpreter, String str2) {
        str.getClass();
        interpreter.getClass();
        str2.getClass();
        ReentrantLock reentrantLockInterpreterLock = interpreterLock(interpreter);
        reentrantLockInterpreterLock.lock();
        try {
            Object objEval = interpreter.eval(str2);
            INSTANCE.refreshCallbacks(str, interpreter);
            return objEval;
        } finally {
            reentrantLockInterpreterLock.unlock();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object evalSnapshot(String str, File file, Interpreter interpreter, String str2) {
        str.getClass();
        file.getClass();
        interpreter.getClass();
        str2.getClass();
        File fileResolvePluginFile = resolvePluginFile(file, str2);
        if (!fileResolvePluginFile.isFile()) {
            C2104o.m5291q(AbstractC4855en.m9263g("快照文件不存在: ", fileResolvePluginFile.getAbsolutePath()));
            return null;
        }
        ReentrantLock reentrantLockInterpreterLock = interpreterLock(interpreter);
        reentrantLockInterpreterLock.lock();
        try {
            Object objEvalSnapshot = interpreter.evalSnapshot(fileResolvePluginFile.getAbsolutePath(), INSTANCE.snapshotKey(str));
            reentrantLockInterpreterLock.unlock();
            refreshCallbacks(str, interpreter);
            return objEvalSnapshot;
        } catch (Throwable th2) {
            reentrantLockInterpreterLock.unlock();
            throw th2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean hasImageDownloadCallback() {
        Collection<C0853a0> collectionValues = loadedPlugins.values();
        collectionValues.getClass();
        Collection<C0853a0> collection = collectionValues;
        if ((collection instanceof Collection) && collection.isEmpty()) {
            return false;
        }
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            if (Boolean.valueOf(((C0853a0) it.next()).f2614i).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean hasOpenSettings(String str) {
        str.getClass();
        C0853a0 c0853a0 = loadedPlugins.get(str);
        return c0853a0 != null && c0853a0.f2610e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void install(C3742g c3742g) {
        c3742g.getClass();
        Context applicationContext = c3742g.f12143a.getApplicationContext();
        if (applicationContext == null) {
            applicationContext = c3742g.f12143a;
        }
        appContext = applicationContext;
        runtimeProcess = PROCESS_MAIN;
        String packageName = applicationContext.getPackageName();
        packageName.getClass();
        runtimeProcessName = packageName;
        ScriptPluginBridge.Companion.getClass();
        Context context = c3742g.f12143a;
        ClassLoader classLoader = c3742g.f12145c;
        bridge = new ScriptPluginBridge(context, classLoader, INSTANCE.scriptDir(context), new ScriptDexKitBridge(c3742g.f12146d, c3742g.f12150h, classLoader));
        ensureDirs(applicationContext);
        startPluginObservers(applicationContext);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean isPluginEnabled(Context context, String str) {
        context.getClass();
        str.getClass();
        return AbstractC4302b.m8640c(context, "Hchat_script_plugin_config").getBoolean("script_plugin_item_".concat(str), false);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final List<C0859c0> listPlugins(Context context) {
        File[] fileArrListFiles;
        context.getClass();
        File fileScriptDir = scriptDir(context);
        boolean zIsDirectory = fileScriptDir.isDirectory();
        C4173t c4173t = C4173t.f13710g;
        if (!zIsDirectory || (fileArrListFiles = fileScriptDir.listFiles()) == null) {
            return c4173t;
        }
        C3011i c3011iM6414X = AbstractC3015m.m6414X(new C3011i(AbstractC4165l.m8376k0(fileArrListFiles), true, new C0361f(1, this, AbstractC0921a.m2246i(ScriptPluginRuntime.class), "isPluginDirectory", "isPluginDirectory(Ljava/io/File;)Z", 0, 0, 12)), new C0837h(13));
        C0031h c0031h = new C0031h(17);
        ArrayList arrayList = new ArrayList();
        AbstractC3015m.m6417a0(c3011iM6414X, arrayList);
        AbstractC4170q.m8431g1(arrayList, c0031h);
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            return c4173t;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return AbstractC0000a.m99x0(next);
        }
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(next);
        while (it.hasNext()) {
            arrayList2.add(it.next());
        }
        return arrayList2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final ClassLoader loadDex(String str, File file, Interpreter interpreter, ClassLoader classLoader, String str2) {
        str.getClass();
        file.getClass();
        interpreter.getClass();
        classLoader.getClass();
        str2.getClass();
        File fileResolvePluginFile = resolvePluginFile(file, str2);
        if (!fileResolvePluginFile.isFile()) {
            C2104o.m5291q(AbstractC4855en.m9263g("Dex文件不存在: ", fileResolvePluginFile.getAbsolutePath()));
            return null;
        }
        Context context = appContext;
        if (context == null) {
            C2104o.m5276A("宿主Context不可用");
            return null;
        }
        File file2 = new File(processScopedCacheRoot(context, "hchat_plugin_dex"), safeFileName(str));
        file2.mkdirs();
        File file3 = new File(file2, "opt");
        file3.mkdirs();
        String strM6701P0 = AbstractC3149m.m6701P0(16, sha256(fileResolvePluginFile));
        String strM2025e0 = AbstractC0793l.m2025e0(fileResolvePluginFile);
        String strM2023c0 = AbstractC0793l.m2023c0(fileResolvePluginFile);
        if (AbstractC3149m.m6721t0(strM2023c0)) {
            strM2023c0 = "dex";
        }
        File file4 = new File(file2, strM2025e0 + "_" + strM6701P0 + "." + ((Object) strM2023c0));
        if (!file4.isFile() || file4.length() != fileResolvePluginFile.length()) {
            AbstractC0793l.m2021a0(fileResolvePluginFile, file4);
        }
        file4.setWritable(false, false);
        DexClassLoader dexClassLoader = new DexClassLoader(file4.getAbsolutePath(), file3.getAbsolutePath(), null, classLoader);
        ReentrantLock reentrantLockInterpreterLock = interpreterLock(interpreter);
        reentrantLockInterpreterLock.lock();
        try {
            interpreter.addClassLoader(dexClassLoader);
            return dexClassLoader;
        } finally {
            reentrantLockInterpreterLock.unlock();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void loadEnabledPluginsWhenReady(Context context) {
        context.getClass();
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            context = applicationContext;
        }
        if (AbstractC4302b.m8640c(context, "Hchat_script_plugin_config").getBoolean("script_plugin_enable", false) && initialLoadStarted.compareAndSet(false, true)) {
            Thread thread = new Thread(new RunnableC0476p1(context, 1), "Hchat-Script-InitialLoad");
            thread.setDaemon(true);
            thread.start();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void loadJava(String str, File file, Interpreter interpreter, String str2) {
        str.getClass();
        file.getClass();
        interpreter.getClass();
        str2.getClass();
        File fileResolvePluginFile = resolvePluginFile(file, str2);
        ReentrantLock reentrantLockInterpreterLock = interpreterLock(interpreter);
        reentrantLockInterpreterLock.lock();
        try {
            interpreter.source(fileResolvePluginFile.getAbsolutePath());
            INSTANCE.refreshCallbacks(str, interpreter);
        } finally {
            reentrantLockInterpreterLock.unlock();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void loadSo(String str, File file, ClassLoader classLoader, String str2) throws NoSuchAlgorithmException, IOException {
        Object next;
        str.getClass();
        file.getClass();
        classLoader.getClass();
        str2.getClass();
        File canonicalFile = resolvePluginFile(file, str2).getCanonicalFile();
        if (!canonicalFile.isFile()) {
            C2104o.m5291q(AbstractC4855en.m9263g("SO文件不存在: ", canonicalFile.getAbsolutePath()));
            return;
        }
        if (!AbstractC0793l.m2023c0(canonicalFile).equalsIgnoreCase("so")) {
            C2104o.m5291q(AbstractC4855en.m9263g("SO文件扩展名必须是 .so: ", canonicalFile.getName()));
            return;
        }
        validateNativeLibrary(canonicalFile);
        Context context = appContext;
        if (context == null) {
            C2104o.m5276A("宿主Context不可用");
            return;
        }
        String strSha256 = sha256(canonicalFile);
        File file2 = new File(processScopedCacheRoot(context, "hchat_plugin_native"), safeFileName(str));
        if (!file2.isDirectory() && !file2.mkdirs()) {
            C2104o.m5291q(AbstractC4855en.m9263g("无法创建Native缓存目录: ", file2.getAbsolutePath()));
            return;
        }
        synchronized (nativeLoadLock) {
            try {
                String absolutePath = canonicalFile.getAbsolutePath();
                Iterator<T> it = loadedNativeLibraries.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    C0906z c0906z = (C0906z) next;
                    if (c0906z.f2817a.equals(absolutePath) && c0906z.f2819c == classLoader) {
                        break;
                    }
                }
                C0906z c0906z2 = (C0906z) next;
                if (c0906z2 != null) {
                    if (AbstractC1416l.m3825a(c0906z2.f2818b, strSha256)) {
                        return;
                    }
                    throw new IllegalArgumentException(("SO内容已更新，但JNI ClassLoader未变化；请重新加载插件并传入新JNI类的ClassLoader，宿主ClassLoader无法热更新: " + canonicalFile.getAbsolutePath()).toString());
                }
                long jIncrementAndGet = nativeLoadSequence.incrementAndGet();
                AbstractC0000a.m96w(36);
                String string = Long.toString(jIncrementAndGet, 36);
                string.getClass();
                String hexString = Integer.toHexString(System.identityHashCode(classLoader));
                ScriptPluginRuntime scriptPluginRuntime = INSTANCE;
                File file3 = new File(file2, scriptPluginRuntime.safeFileName(AbstractC0793l.m2025e0(canonicalFile)) + "_" + strSha256 + "_" + hexString + "_" + string + ".so");
                scriptPluginRuntime.copyNativeLibrary(canonicalFile, file3, strSha256);
                Os.chmod(file3.getAbsolutePath(), 292);
                if (file3.canWrite()) {
                    throw new IllegalArgumentException(("Native缓存无法设为只读: " + file3.getAbsolutePath()).toString());
                }
                scriptPluginRuntime.loadNativeLibrary(file3, classLoader);
                ArrayList<C0906z> arrayList = loadedNativeLibraries;
                absolutePath.getClass();
                arrayList.add(new C0906z(absolutePath, classLoader, strSha256));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean prepareSnsPostMedia(String str, Interpreter interpreter, String str2, Consumer<Object> consumer) {
        C3351d0 c3351d0M1028q;
        str.getClass();
        interpreter.getClass();
        if (str2 == null) {
            str2 = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        String string = AbstractC3149m.m6703R0(str2).toString();
        if (string.length() != 0 && consumer != null && (c3351d0M1028q = AbstractC0255e.m1028q()) != null) {
            String str3 = str + ":" + string + ":" + snsPrepareSequence.incrementAndGet();
            AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            snsPrepareCancellations.put(str3, atomicBoolean);
            try {
                snsPrepareExecutor.execute(new RunnableC0523j(c3351d0M1028q, string, atomicBoolean, str, interpreter, str3, consumer, 2));
                return true;
            } catch (RejectedExecutionException unused) {
                snsPrepareCancellations.remove(str3, atomicBoolean);
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void refreshCallbacks(String str, Interpreter interpreter) {
        str.getClass();
        interpreter.getClass();
        C0853a0 c0853a0 = loadedPlugins.get(str);
        if (c0853a0 != null) {
            ReentrantLock reentrantLockInterpreterLock = interpreterLock(interpreter);
            reentrantLockInterpreterLock.lock();
            try {
                C0904y c0904yDetectCallbacks = INSTANCE.detectCallbacks(interpreter);
                reentrantLockInterpreterLock.unlock();
                boolean z9 = true;
                c0853a0.f2608c = c0853a0.f2608c || c0904yDetectCallbacks.f2805a;
                c0853a0.f2609d = c0853a0.f2609d || c0904yDetectCallbacks.f2806b;
                c0853a0.f2610e = c0853a0.f2610e || c0904yDetectCallbacks.f2807c;
                c0853a0.f2611f = c0853a0.f2611f || c0904yDetectCallbacks.f2808d;
                c0853a0.f2612g = c0853a0.f2612g || c0904yDetectCallbacks.f2809e;
                c0853a0.f2613h = c0853a0.f2613h || c0904yDetectCallbacks.f2810f;
                if (!c0853a0.f2614i && !c0904yDetectCallbacks.f2811g) {
                    z9 = false;
                }
                c0853a0.f2614i = z9;
                updateProtobufPacketListener();
            } catch (Throwable th2) {
                reentrantLockInterpreterLock.unlock();
                throw th2;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final synchronized void refreshPluginObserver(Context context, String str) {
        try {
            context.getClass();
            str.getClass();
            FileObserver fileObserverRemove = pluginDirObservers.remove(str);
            if (fileObserverRemove != null) {
                fileObserverRemove.stopWatching();
            }
            Runnable runnableRemove = reloadTasks.remove(str);
            if (runnableRemove != null) {
                mainHandler.removeCallbacks(runnableRemove);
            }
            Context applicationContext = context.getApplicationContext();
            if (applicationContext != null) {
                context = applicationContext;
            }
            startPluginObservers(context);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: reloadPlugin-gIAlu-s, reason: not valid java name */
    public final synchronized Object m10924reloadPlugingIAlus(Context context, String str) throws Throwable {
        Throwable th2;
        Object next;
        try {
            try {
                context.getClass();
                str.getClass();
                Context applicationContext = context.getApplicationContext();
                Context context2 = applicationContext != null ? applicationContext : context;
                appContext = context2;
                SharedPreferences sharedPreferencesM8640c = AbstractC4302b.m8640c(context2, "Hchat_script_plugin_config");
                if (!sharedPreferencesM8640c.getBoolean("script_plugin_enable", false) || !sharedPreferencesM8640c.getBoolean("script_plugin_item_".concat(str), false)) {
                    return C3967n.f12976a;
                }
                Iterator<T> it = listPlugins(context2).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    try {
                        next = it.next();
                        if (((C0859c0) next).f2626a.equals(str)) {
                            break;
                        }
                    } catch (Throwable th3) {
                        th2 = th3;
                    }
                }
                C0859c0 c0859c0 = (C0859c0) next;
                if (c0859c0 == null) {
                    return new C3959f(new IllegalArgumentException("未找到插件: " + str));
                }
                if (c0859c0.f2634i.isEmpty()) {
                    return new C3959f(new IllegalArgumentException("插件 process 配置无效"));
                }
                if (supportsProcess(c0859c0, runtimeProcess)) {
                    return m10918loadPluginyxL6bBk(context2, currentBridge(context2), c0859c0, true, AbstractC1416l.m3825a(runtimeProcess, PROCESS_MAIN));
                }
                return C3967n.f12976a;
            } catch (Throwable th4) {
                th = th4;
                th2 = th;
            }
        } catch (Throwable th5) {
            th = th5;
        }
        throw th2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void reloadPluginAsync(Context context, String str) {
        context.getClass();
        str.getClass();
        new Thread(new RunnableC0900w(context, str, 0), "Hchat-Script-Reload-".concat(str)).start();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final File scriptDir(Context context) {
        context.getClass();
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            context = applicationContext;
        }
        File file = null;
        try {
            File[] externalMediaDirs = context.getExternalMediaDirs();
            if (externalMediaDirs != null) {
                int length = externalMediaDirs.length;
                int i9 = 0;
                while (true) {
                    if (i9 >= length) {
                        break;
                    }
                    File file2 = externalMediaDirs[i9];
                    if (Boolean.valueOf(file2 != null).booleanValue()) {
                        file = file2;
                        break;
                    }
                    i9++;
                }
            }
        } catch (Throwable unused) {
        }
        if (file == null) {
            file = new File(AbstractC4855en.m9263g("/storage/emulated/0/Android/media/", context.getPackageName()));
        }
        return new File(file, "Hchat/脚本插件");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean sendProtobufPacket(String str, int i9, String str2, Consumer<SendResult> consumer) {
        str.getClass();
        str2.getClass();
        return AbstractC4699j.m9237a(str, i9, 0, 0, str2, new C0894t(consumer, 1));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: setGlobalEnabled-gIAlu-s, reason: not valid java name */
    public final synchronized Object m10925setGlobalEnabledgIAlus(Context context, boolean z9) {
        Object objM10920unloadAllPluginsd1pmJ48;
        context.getClass();
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            context = applicationContext;
        }
        appContext = context;
        ensureDirs(context);
        startPluginObservers(context);
        if (z9 && !isScriptApiReady()) {
            return new C3959f(new IllegalStateException("微信联系人数据库尚未就绪，请稍后重试"));
        }
        SharedPreferences sharedPreferencesM8640c = AbstractC4302b.m8640c(context, "Hchat_script_plugin_config");
        if (z9) {
            sharedPreferencesM8640c.edit().putBoolean("script_plugin_enable", true).apply();
            objM10920unloadAllPluginsd1pmJ48 = m10917loadEnabledPluginsgIAlus(context, currentBridge(context));
        } else {
            objM10920unloadAllPluginsd1pmJ48 = m10920unloadAllPluginsd1pmJ48();
        }
        if (!(objM10920unloadAllPluginsd1pmJ48 instanceof C3959f)) {
            sharedPreferencesM8640c.edit().putBoolean("script_plugin_enable", z9).apply();
        } else if (z9) {
            m10920unloadAllPluginsd1pmJ48();
            sharedPreferencesM8640c.edit().putBoolean("script_plugin_enable", false).apply();
        }
        return objM10920unloadAllPluginsd1pmJ48;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r4v4, resolved type: eb.c0 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: setPluginEnabled-0E7RQCE, reason: not valid java name */
    public final synchronized Object m10926setPluginEnabled0E7RQCE(Context context, String str, boolean z9) throws Throwable {
        Throwable th2;
        Object objM10921unloadPluginIoAF18A;
        Object c3959f;
        try {
            try {
                context.getClass();
                str.getClass();
                Context applicationContext = context.getApplicationContext();
                Context context2 = applicationContext != null ? applicationContext : context;
                appContext = context2;
                ensureDirs(context2);
                startPluginObservers(context2);
                SharedPreferences sharedPreferencesM8640c = AbstractC4302b.m8640c(context2, "Hchat_script_plugin_config");
                Object obj = null;
                if (z9) {
                    try {
                        Iterator<T> it = listPlugins(context2).iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            Object next = it.next();
                            if (((C0859c0) next).f2626a.equals(str)) {
                                obj = next;
                                break;
                            }
                        }
                        obj = (C0859c0) obj;
                        if (obj == null) {
                            return new C3959f(new IllegalArgumentException("未找到插件: " + str));
                        }
                    } catch (Throwable th3) {
                        th2 = th3;
                    }
                }
                C0859c0 c0859c0 = obj;
                if (z9 && sharedPreferencesM8640c.getBoolean("script_plugin_enable", false) && c0859c0 != 0 && INSTANCE.supportsProcess(c0859c0, PROCESS_MAIN) && !isScriptApiReady()) {
                    return new C3959f(new IllegalStateException("微信联系人数据库尚未就绪，请稍后重试"));
                }
                if (!z9) {
                    Runnable runnableRemove = reloadTasks.remove(str);
                    if (runnableRemove != null) {
                        mainHandler.removeCallbacks(runnableRemove);
                    }
                    objM10921unloadPluginIoAF18A = m10921unloadPluginIoAF18A(str);
                } else {
                    if (c0859c0 == 0) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    if (c0859c0.f2634i.isEmpty()) {
                        c3959f = new C3959f(new IllegalArgumentException("插件 process 配置无效"));
                    } else if (sharedPreferencesM8640c.getBoolean("script_plugin_enable", false) && supportsProcess(c0859c0, PROCESS_MAIN)) {
                        objM10921unloadPluginIoAF18A = m10919loadPluginyxL6bBk$default(this, context2, currentBridge(context2), c0859c0, true, false, 16, null);
                    } else {
                        c3959f = C3967n.f12976a;
                    }
                    objM10921unloadPluginIoAF18A = c3959f;
                }
                if (!(objM10921unloadPluginIoAF18A instanceof C3959f)) {
                    sharedPreferencesM8640c.edit().putBoolean("script_plugin_item_".concat(str), z9).apply();
                }
                notifyPluginCatalogChanged();
                return objM10921unloadPluginIoAF18A;
            } catch (Throwable th4) {
                th = th4;
            }
        } catch (Throwable th5) {
            th = th5;
        }
        th2 = th;
        throw th2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final C0856b0 subscribePluginCatalog(Context context, InterfaceC1220a interfaceC1220a) {
        context.getClass();
        interfaceC1220a.getClass();
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            context = applicationContext;
        }
        appContext = context;
        ensureDirs(context);
        startPluginObservers(context);
        pluginCatalogListeners.add(interfaceC1220a);
        return new C0856b0(interfaceC1220a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void useCallback(String str, Interpreter interpreter, String str2, String str3) {
        str.getClass();
        interpreter.getClass();
        String string = str2 != null ? AbstractC3149m.m6703R0(str2).toString() : null;
        String str4 = HttpUrl.FRAGMENT_ENCODE_SET;
        if (string == null) {
            string = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        String string2 = str3 != null ? AbstractC3149m.m6703R0(str3).toString() : null;
        if (string2 != null) {
            str4 = string2;
        }
        String strCallbackWrapper = callbackWrapper(string, str4);
        ReentrantLock reentrantLockInterpreterLock = interpreterLock(interpreter);
        reentrantLockInterpreterLock.lock();
        try {
            interpreter.eval(strCallbackWrapper);
            INSTANCE.refreshCallbacks(str, interpreter);
        } finally {
            reentrantLockInterpreterLock.unlock();
        }
    }

    public final boolean sendProtobufPacket(String str, int i9, int i10, int i11, String str2, Consumer<SendResult> consumer) {
        str.getClass();
        str2.getClass();
        return AbstractC4699j.m9237a(str, i9, i10, i11, str2, new C0894t(consumer, 0));
    }

    public final Object evalSnapshot(String str, String str2) {
        str.getClass();
        str2.getClass();
        C0853a0 c0853a0 = loadedPlugins.get(str);
        if (c0853a0 != null) {
            return evalSnapshot(str, c0853a0.f2606a.f2628c, c0853a0.f2607b, str2);
        }
        C2104o.m5276A("插件未开启");
        return null;
    }

    public final Object evalSnapshot(String str, Interpreter interpreter, byte[] bArr) {
        str.getClass();
        interpreter.getClass();
        bArr.getClass();
        return evalSnapshot(str, interpreter, new ByteArrayInputStream(bArr));
    }

    public final Object evalSnapshot(String str, Interpreter interpreter, InputStream inputStream) {
        str.getClass();
        interpreter.getClass();
        inputStream.getClass();
        ReentrantLock reentrantLockInterpreterLock = interpreterLock(interpreter);
        reentrantLockInterpreterLock.lock();
        try {
            Object objEvalSnapshot = interpreter.evalSnapshot(inputStream, INSTANCE.snapshotKey(str));
            reentrantLockInterpreterLock.unlock();
            refreshCallbacks(str, interpreter);
            return objEvalSnapshot;
        } catch (Throwable th2) {
            reentrantLockInterpreterLock.unlock();
            throw th2;
        }
    }

    public final String compileSnapshot(String str, String str2) {
        str.getClass();
        str2.getClass();
        C0853a0 c0853a0 = loadedPlugins.get(str);
        if (c0853a0 != null) {
            return compileSnapshot(str, c0853a0.f2606a.f2628c, c0853a0.f2607b, str2);
        }
        C2104o.m5276A("插件未开启");
        return null;
    }

    private final C0904y detectCallbacks(String str) {
        return new C0904y(scriptHasCallback(str, "onClickSendBtn", "useOnClickSendBtn"), scriptHasCallback(str, "onHandleMsg", "useOnHandleMsg"), scriptHasCallback(str, "openSettings", "useOpenSettings"), scriptHasCallback(str, "onMemberChange", "useOnMemberChange"), scriptHasCallback(str, "onNewFriend", "useOnNewFriend"), scriptHasCallback(str, "onProtobufPacket", "useOnProtobufPacket"), scriptHasCallback(str, "onImageDownload", "useOnImageDownload"));
    }
}
