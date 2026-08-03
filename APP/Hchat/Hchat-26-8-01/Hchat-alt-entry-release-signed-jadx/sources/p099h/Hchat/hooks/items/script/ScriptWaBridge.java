package p099h.Hchat.hooks.items.script;

import android.R;
import android.app.Activity;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Pair;
import androidx.lifecycle.C0119x;
import bb.C0240b;
import be.AbstractC0283h;
import bi.C0315c;
import ca.RunnableC0531r;
import gg.AbstractC1416l;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.function.Consumer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import me.p186hd.wauxv.data.bean.MsgInfoBean;
import me.p186hd.wauxv.data.bean.info.FriendInfo;
import me.p186hd.wauxv.data.bean.info.GroupInfo;
import me.p186hd.wauxv.plugin.api.callback.PluginCallBack;
import me.yun.silk.SilkCodec;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.internal.p221ws.WebSocketProtocol;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p000a.AbstractC0000a;
import p002a1.RunnableC0003a;
import p002a1.RunnableC0006d;
import p009a9.C0031h;
import p011ab.C0045e;
import p015b0.C0136d0;
import p015b0.C0153s;
import p025bc.AbstractC0255e;
import p036c9.C0454k;
import p036c9.C0467n0;
import p036c9.C0471o0;
import p036c9.C0475p0;
import p049d9.AbstractC0754o;
import p054dg.AbstractC0793l;
import p063e9.C0837h;
import p065eb.C0854a1;
import p065eb.C0857b1;
import p065eb.C0860c1;
import p065eb.C0861d;
import p065eb.C0863d1;
import p065eb.C0868g;
import p065eb.C0876k;
import p065eb.C0878l;
import p065eb.C0883n0;
import p065eb.C0889q0;
import p065eb.C0891r0;
import p065eb.C0893s0;
import p065eb.C0897u0;
import p065eb.C0899v0;
import p065eb.C0901w0;
import p065eb.C0905y0;
import p065eb.C0907z0;
import p068eh.AbstractC0921a;
import p085fg.InterfaceC1220a;
import p085fg.InterfaceC1231l;
import p096g8.C1360a;
import p096g8.C1363d;
import p096g8.C1368i;
import p096g8.C1371l;
import p099h.Hchat.dexkit.DexFinder;
import p099h.Hchat.hooks.api.core.WeChatApis;
import p099h.Hchat.hooks.api.model.ContactLabelBean;
import p099h.Hchat.hooks.api.model.WeChatChatroom;
import p099h.Hchat.hooks.api.model.WeChatContact;
import p099h.Hchat.hooks.api.model.WeChatMessage;
import p099h.Hchat.hooks.api.model.WeChatSnsLivePhoto;
import p099h.Hchat.hooks.api.model.WeChatSnsPost;
import p099h.Hchat.hooks.api.model.WeChatSnsPrepareResult;
import p099h.Hchat.hooks.api.runtime.WeChatDatabaseApi;
import p099h.Hchat.hooks.items.script.ScriptWaBridge;
import p099h.Hchat.utils.KavaReflector;
import p106h8.C1624a;
import p136j8.AbstractC2091b;
import p136j8.C2097h;
import p136j8.C2098i;
import p136j8.C2103n;
import p136j8.C2105p;
import p136j8.C2107r;
import p153k8.C2341e;
import p153k8.C2343g;
import p153k8.C2355s;
import p183m8.C2815c;
import p210o8.C3086j;
import p218og.AbstractC3149m;
import p218og.AbstractC3156t;
import p218og.C3143g;
import p218og.C3145i;
import p218og.C3147k;
import p218og.InterfaceC3142f;
import p222p.AbstractC3199a;
import p230p8.C3351d0;
import p230p8.C3355g;
import p230p8.C3356h;
import p242q8.C3458m;
import p242q8.C3460o;
import p242q8.C3463r;
import p259r9.AbstractC3754e0;
import p276sf.C3959f;
import p276sf.C3960g;
import p276sf.C3962i;
import p276sf.C3967n;
import p276sf.EnumC3957d;
import p276sf.InterfaceC3956c;
import p332wb.AbstractC4855en;
import p366ya.AbstractC6019i;
import p381zb.AbstractC6133b;
import tf.AbstractC4166m;
import tf.AbstractC4167n;
import tf.AbstractC4178y;
import tf.C4173t;
import tf.C4174u;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class ScriptWaBridge {
    public static final int $stable = 8;
    private static final C0907z0 Companion = new C0907z0();

    @Deprecated
    public static final int SCRIPT_CONTACT_READ_ATTEMPTS = 5;

    @Deprecated
    public static final long SCRIPT_CONTACT_READ_DELAY_MS = 250;

    @Deprecated
    public static final long VIDEO_DOWNLOAD_TIMEOUT_MS = 60000;
    private final Pattern atPattern;
    private final ScriptPluginBridge bridge;
    private final AtomicLong callbackSeq;
    private File currentPluginDir;
    private String currentPluginName;
    private final InterfaceC3956c durationCodec$delegate;
    private final Map<Long, OkHttpClient> httpClients;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ScriptWaBridge(ScriptPluginBridge scriptPluginBridge) {
        scriptPluginBridge.getClass();
        this.bridge = scriptPluginBridge;
        Pattern patternCompile = Pattern.compile("\\[AtWx=([^\\]]+)]");
        patternCompile.getClass();
        this.atPattern = patternCompile;
        this.callbackSeq = new AtomicLong(1L);
        this.httpClients = Collections.synchronizedMap(new LinkedHashMap());
        this.durationCodec$delegate = AbstractC0283h.m1127G(EnumC3957d.f12958g, new C0315c(19));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: K */
    public static /* synthetic */ C3967n m3949K(ScriptWaBridge scriptWaBridge, Consumer consumer, String str, String str2) {
        return downloadImage$lambda$1(consumer, scriptWaBridge, str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private final Request.Builder applyHeaders(Request.Builder builder, Map<String, String> map) {
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            if (!AbstractC3156t.m6734X(key, "Content-Type")) {
                builder.header(key, value);
            }
        }
        return builder;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private final void async(final InterfaceC1220a interfaceC1220a) {
        String strM1018g = AbstractC0255e.m1018g(this.callbackSeq.getAndIncrement(), "script_http_");
        WeChatApis.runtime().getClass();
        C3086j c3086j = WeChatApis.taskApi;
        if (c3086j != null) {
            final int i9 = 0;
            c3086j.m6553d(new Runnable() { // from class: eb.t0
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i9) {
                        case 0:
                            ScriptWaBridge.async$lambda$0(interfaceC1220a, this);
                            break;
                        default:
                            ScriptWaBridge.async$lambda$1(interfaceC1220a, this);
                            break;
                    }
                }
            });
        } else {
            final int i10 = 1;
            new Thread(new Runnable() { // from class: eb.t0
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i10) {
                        case 0:
                            ScriptWaBridge.async$lambda$0(interfaceC1220a, this);
                            break;
                        default:
                            ScriptWaBridge.async$lambda$1(interfaceC1220a, this);
                            break;
                    }
                }
            }, strM1018g).start();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    public static final void async$lambda$0(InterfaceC1220a interfaceC1220a, ScriptWaBridge scriptWaBridge) {
        Object c3959f;
        try {
            c3959f = interfaceC1220a.invoke();
        } catch (Throwable th2) {
            c3959f = new C3959f(th2);
        }
        Throwable thM8182b = C3960g.m8182b(c3959f);
        if (thM8182b != null) {
            scriptWaBridge.bridge.log("异步任务失败: " + thM8182b.getMessage());
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    public static final void async$lambda$1(InterfaceC1220a interfaceC1220a, ScriptWaBridge scriptWaBridge) {
        Object c3959f;
        try {
            c3959f = interfaceC1220a.invoke();
        } catch (Throwable th2) {
            c3959f = new C3959f(th2);
        }
        Throwable thM8182b = C3960g.m8182b(c3959f);
        if (thM8182b != null) {
            scriptWaBridge.bridge.log("异步任务失败: " + thM8182b.getMessage());
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private final String buildPostBody(Map<?, ?> map, Map<String, String> map2) throws JSONException {
        Object next;
        Map<String, String> mapNormalizeMap = normalizeMap(map);
        boolean zIsEmpty = mapNormalizeMap.isEmpty();
        String str = HttpUrl.FRAGMENT_ENCODE_SET;
        if (zIsEmpty) {
            return HttpUrl.FRAGMENT_ENCODE_SET;
        }
        Iterator<T> it = map2.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (AbstractC3156t.m6734X((String) ((Map.Entry) next).getKey(), "Content-Type")) {
                break;
            }
        }
        Map.Entry entry = (Map.Entry) next;
        String str2 = entry != null ? (String) entry.getValue() : null;
        if (str2 != null) {
            str = str2;
        }
        Locale locale = Locale.US;
        if (!AbstractC0255e.m1032u(locale, str, locale, "application/json", false)) {
            return AbstractC4166m.m8392A1(mapNormalizeMap.entrySet(), "&", null, null, new C0837h(20), 30);
        }
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry<String, String> entry2 : mapNormalizeMap.entrySet()) {
            jSONObject.put(entry2.getKey(), entry2.getValue());
        }
        String string = jSONObject.toString();
        string.getClass();
        return string;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence buildPostBody$lambda$1(Map.Entry entry) {
        entry.getClass();
        return AbstractC4855en.m9264h(Uri.encode((String) entry.getKey()), "=", Uri.encode((String) entry.getValue()));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object callAny(Object obj, String str) {
        Object c3959f;
        Method[] methods;
        int length;
        int i9;
        Method method;
        try {
            methods = obj.getClass().getMethods();
            methods.getClass();
            length = methods.length;
            i9 = 0;
        } catch (Throwable th2) {
            c3959f = new C3959f(th2);
        }
        while (true) {
            if (i9 >= length) {
                method = null;
                break;
            }
            method = methods[i9];
            if (AbstractC1416l.m3825a(method.getName(), str)) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                parameterTypes.getClass();
                boolean z9 = parameterTypes.length == 0;
                if (Boolean.valueOf(z9).booleanValue()) {
                    break;
                }
                i9++;
            }
            if (c3959f instanceof C3959f) {
                return c3959f;
            }
            return null;
        }
        c3959f = method != null ? method.invoke(obj, null) : null;
        if (c3959f instanceof C3959f) {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:13:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0057  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final String callString(Object obj, String str) {
        Object c3959f;
        Method[] methods;
        int length;
        int i9;
        Method method;
        Object objInvoke;
        Object obj2 = HttpUrl.FRAGMENT_ENCODE_SET;
        try {
            methods = obj.getClass().getMethods();
            methods.getClass();
            length = methods.length;
            i9 = 0;
        } catch (Throwable th2) {
            c3959f = new C3959f(th2);
        }
        while (true) {
            c3959f = null;
            if (i9 >= length) {
                method = null;
                break;
            }
            method = methods[i9];
            if (AbstractC1416l.m3825a(method.getName(), str)) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                parameterTypes.getClass();
                boolean z9 = parameterTypes.length == 0;
                if (Boolean.valueOf(z9).booleanValue()) {
                    break;
                }
                i9++;
            }
            if (!(c3959f instanceof C3959f)) {
                obj2 = c3959f;
            }
            return (String) obj2;
        }
        if (method != null && (objInvoke = method.invoke(obj, null)) != null) {
            c3959f = objInvoke.toString();
        }
        if (c3959f == null) {
            c3959f = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        if (!(c3959f instanceof C3959f)) {
        }
        return (String) obj2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private final String defaultContentType(Map<String, String> map) {
        Object next;
        Iterator<T> it = map.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (AbstractC3156t.m6734X((String) ((Map.Entry) next).getKey(), "Content-Type")) {
                break;
            }
        }
        Map.Entry entry = (Map.Entry) next;
        String str = entry != null ? (String) entry.getValue() : null;
        return (str == null || AbstractC3149m.m6721t0(str)) ? "application/x-www-form-urlencoded; charset=UTF-8" : str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    public static final void delay$lambda$0(ScriptWaBridge scriptWaBridge, Runnable runnable) {
        Object c3959f;
        try {
            runnable.run();
            c3959f = C3967n.f12976a;
        } catch (Throwable th2) {
            c3959f = new C3959f(th2);
        }
        Throwable thM8182b = C3960g.m8182b(c3959f);
        if (thM8182b != null) {
            AbstractC0921a.m2261x("[Hchat:Script] 延迟任务失败: ", thM8182b.getMessage(), thM8182b);
            scriptWaBridge.bridge.log("延迟任务失败: " + thM8182b.getMessage());
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    public static final void delay$lambda$1(ScriptWaBridge scriptWaBridge, long j3, Runnable runnable) {
        Object c3959f;
        if (j3 < 0) {
            j3 = 0;
        }
        try {
            Thread.sleep(j3);
            runnable.run();
            c3959f = C3967n.f12976a;
        } catch (Throwable th2) {
            c3959f = new C3959f(th2);
        }
        Throwable thM8182b = C3960g.m8182b(c3959f);
        if (thM8182b != null) {
            scriptWaBridge.bridge.log("延迟任务失败: " + thM8182b.getMessage());
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    public static final C3967n download$lambda$0(Consumer consumer, ScriptWaBridge scriptWaBridge, String str, String str2, Map map, long j3) {
        if (consumer != null) {
            consumer.accept(scriptWaBridge.downloadFile(str, str2, map, j3));
        }
        return C3967n.f12976a;
    }

    /* JADX DEBUG: Another duplicated slice has different insns count: {[]}, finally: {[THROW, INVOKE, MOVE_EXCEPTION, THROW, MOVE_EXCEPTION] complete} */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    private final File downloadFile(String str, String str2, Map<?, ?> map, long j3) {
        Object c3959f;
        File fileResolveDownloadTarget;
        FileOutputStream fileOutputStream;
        byte[] bArr;
        if (str == null || AbstractC3149m.m6721t0(str) || str2 == null || AbstractC3149m.m6721t0(str2)) {
            return null;
        }
        try {
            fileResolveDownloadTarget = resolveDownloadTarget(str, str2);
        } catch (Throwable th2) {
            c3959f = new C3959f(th2);
        }
        if (fileResolveDownloadTarget == null) {
            c3959f = null;
        } else {
            File parentFile = fileResolveDownloadTarget.getParentFile();
            if (parentFile != null && !parentFile.isDirectory()) {
                parentFile.mkdirs();
            }
            Response responseExecute = httpClient(j3).newCall(applyHeaders(new Request.Builder().url(str), normalizeMap(map)).get().build()).execute();
            try {
                ResponseBody responseBodyBody = responseExecute.body();
                if (responseBodyBody != null) {
                    BufferedInputStream bufferedInputStream = new BufferedInputStream(responseBodyBody.byteStream());
                    try {
                        fileOutputStream = new FileOutputStream(fileResolveDownloadTarget);
                        try {
                            bArr = new byte[8192];
                        } finally {
                        }
                    } finally {
                    }
                    while (true) {
                        int i9 = bufferedInputStream.read(bArr);
                        if (i9 <= 0) {
                            break;
                        }
                        fileOutputStream.write(bArr, 0, i9);
                    }
                    fileOutputStream.flush();
                    fileOutputStream.close();
                    bufferedInputStream.close();
                    responseExecute.close();
                    c3959f = fileResolveDownloadTarget;
                } else {
                    responseExecute.close();
                    c3959f = null;
                }
            } finally {
            }
            c3959f = new C3959f(th2);
        }
        Throwable thM8182b = C3960g.m8182b(c3959f);
        if (thM8182b != null) {
            this.bridge.log("下载失败: " + thM8182b.getMessage());
        }
        return (File) (c3959f instanceof C3959f ? null : c3959f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    public static final C3967n downloadImage$lambda$0(Consumer consumer, ScriptWaBridge scriptWaBridge, String str) {
        if (consumer != null) {
            consumer.accept(AbstractC6133b.m10899e(scriptWaBridge.bridge.getHostContext(), str, null));
        }
        return C3967n.f12976a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static final C3967n downloadImage$lambda$1(Consumer consumer, ScriptWaBridge scriptWaBridge, String str, String str2) {
        if (consumer != null) {
            consumer.accept(AbstractC6133b.m10899e(scriptWaBridge.bridge.getHostContext(), str, str2));
        }
        return C3967n.f12976a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    public static final C3967n downloadImages$lambda$0(Consumer consumer, ScriptWaBridge scriptWaBridge, List list) {
        if (consumer != null) {
            consumer.accept(AbstractC6133b.m10900f(scriptWaBridge.bridge.getHostContext(), null, list));
        }
        return C3967n.f12976a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    public static final C3967n downloadImages$lambda$1(Consumer consumer, ScriptWaBridge scriptWaBridge, List list, String str) {
        if (consumer != null) {
            consumer.accept(AbstractC6133b.m10900f(scriptWaBridge.bridge.getHostContext(), str, list));
        }
        return C3967n.f12976a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    public static final C3967n downloadImg$lambda$0(ScriptWaBridge scriptWaBridge, Object obj, PluginCallBack.DownloadCallback downloadCallback, String str) {
        C0854a1 c0854a1ImageDownloadRequest = scriptWaBridge.imageDownloadRequest(obj);
        C3967n c3967n = C3967n.f12976a;
        if (c0854a1ImageDownloadRequest == null) {
            if (downloadCallback != null) {
                downloadCallback.onError(new IllegalArgumentException("Invalid image message"));
            }
            return c3967n;
        }
        File fileDownloadImgInternal = scriptWaBridge.downloadImgInternal(c0854a1ImageDownloadRequest.f2615a, c0854a1ImageDownloadRequest.f2616b, c0854a1ImageDownloadRequest.f2617c, str, c0854a1ImageDownloadRequest.f2618d, c0854a1ImageDownloadRequest.f2619e);
        if (fileDownloadImgInternal == null || !fileDownloadImgInternal.isFile() || fileDownloadImgInternal.length() <= 0) {
            if (downloadCallback != null) {
                downloadCallback.onError(new Exception("Image download failed"));
            }
        } else if (downloadCallback != null) {
            downloadCallback.onSuccess(fileDownloadImgInternal);
        }
        return c3967n;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0086  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final File downloadImgInternal(String str, String str2, String str3, String str4, int i9, int i10) {
        Object c3959f;
        try {
            String strNormalizeDownloadUrl = normalizeDownloadUrl(str2);
            if (AbstractC3149m.m6721t0(strNormalizeDownloadUrl)) {
                strNormalizeDownloadUrl = null;
            }
            if (strNormalizeDownloadUrl != null) {
                File fileTargetFile = targetFile(str4, str, strNormalizeDownloadUrl);
                if (isHttpUrl(strNormalizeDownloadUrl)) {
                    C3962i c3962i = AbstractC6133b.f24713a;
                    fileTargetFile.getClass();
                    boolean z9 = true;
                    File fileM10901g = AbstractC6133b.m10901g(fileTargetFile, strNormalizeDownloadUrl, true);
                    if (fileM10901g == null || !fileM10901g.isFile() || fileM10901g.length() <= 0) {
                        logDownload("downloadImg失败: " + AbstractC3149m.m6701P0(120, strNormalizeDownloadUrl) + " -> " + fileTargetFile.getAbsolutePath());
                    }
                    if (fileM10901g == null) {
                        c3959f = null;
                    } else {
                        if (!fileM10901g.isFile() || fileM10901g.length() <= 0) {
                            z9 = false;
                        }
                        if (z9) {
                            c3959f = fileM10901g;
                        }
                    }
                } else {
                    C2105p c2105pMedia = WeChatApis.media();
                    C2103n c2103n = c2105pMedia != null ? c2105pMedia.f7035a : null;
                    if (c2103n == null) {
                        logDownload("downloadImg失败: 图片API未就绪 -> " + fileTargetFile.getAbsolutePath());
                    } else if (!fileTargetFile.exists() || fileTargetFile.delete()) {
                        String str5 = strNormalizeDownloadUrl;
                        C2103n c2103n2 = c2103n;
                        if (c2103n2.m5265e(str5, str3 == null ? HttpUrl.FRAGMENT_ENCODE_SET : str3, fileTargetFile.getAbsolutePath(), i9, null)) {
                            if (!waitDownloadedFile(fileTargetFile, 60000L)) {
                                logDownload("downloadImg失败: CDN下载超时 fileType=" + i9 + " totalLen=" + i10 + " " + c2103n2.m5263c() + " url=" + AbstractC3149m.m6701P0(120, str5) + " -> " + fileTargetFile.getAbsolutePath());
                                fileTargetFile = null;
                            }
                            c3959f = fileTargetFile;
                        } else {
                            logDownload("downloadImg失败: CDN任务提交失败 fileType=" + i9 + " totalLen=" + i10 + " " + c2103n2.m5263c() + " url=" + AbstractC3149m.m6701P0(120, str5) + " -> " + fileTargetFile.getAbsolutePath());
                        }
                    } else {
                        logDownload("downloadImg失败: 无法清理旧文件 -> " + fileTargetFile.getAbsolutePath());
                    }
                    c3959f = null;
                }
            }
        } catch (Throwable th2) {
            c3959f = new C3959f(th2);
        }
        Throwable thM8182b = C3960g.m8182b(c3959f);
        if (thM8182b != null) {
            logDownload(AbstractC0255e.m1021j("downloadImg异常: ", thM8182b.getClass().getName(), " ", thM8182b.getMessage()));
        }
        return (File) (c3959f instanceof C3959f ? null : c3959f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static /* synthetic */ File downloadImgInternal$default(ScriptWaBridge scriptWaBridge, String str, String str2, String str3, String str4, int i9, int i10, int i11, Object obj) {
        if ((i11 & 32) != 0) {
            i10 = 0;
        }
        return scriptWaBridge.downloadImgInternal(str, str2, str3, str4, i9, i10);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    public static final C3967n downloadVideo$lambda$0(ScriptWaBridge scriptWaBridge, String str, String str2, String str3, String str4, PluginCallBack.DownloadCallback downloadCallback) {
        if (str == null) {
            str = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        scriptWaBridge.downloadVideoInternal(new C0860c1(str, str2 == null ? HttpUrl.FRAGMENT_ENCODE_SET : str2, str3 == null ? HttpUrl.FRAGMENT_ENCODE_SET : str3, 0L, null), str4, downloadCallback);
        return C3967n.f12976a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    public static final C3967n downloadVideo$lambda$1(ScriptWaBridge scriptWaBridge, Object obj, PluginCallBack.DownloadCallback downloadCallback, String str) {
        C0860c1 c0860c1VideoDownloadRequest = scriptWaBridge.videoDownloadRequest(obj);
        C3967n c3967n = C3967n.f12976a;
        if (c0860c1VideoDownloadRequest != null) {
            scriptWaBridge.downloadVideoInternal(c0860c1VideoDownloadRequest, str, downloadCallback);
            return c3967n;
        }
        if (downloadCallback != null) {
            downloadCallback.onError(new IllegalArgumentException("Invalid video message"));
        }
        return c3967n;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private final void downloadVideoInternal(C0860c1 c0860c1, String str, PluginCallBack.DownloadCallback downloadCallback) {
        Object c3959f;
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        String strM1018g = AbstractC0255e.m1018g(this.callbackSeq.getAndIncrement(), "script_video_download_timeout_");
        WeChatApis.runtime().getClass();
        C3086j c3086j = WeChatApis.taskApi;
        C0901w0 c0901w0 = new C0901w0(atomicBoolean, c3086j, strM1018g, downloadCallback, 0);
        C0901w0 c0901w02 = new C0901w0(atomicBoolean, c3086j, strM1018g, downloadCallback, 1);
        String str2 = c0860c1.f2635a;
        long j3 = c0860c1.f2638d;
        File fileVideoTargetFile = videoTargetFile(str, str2);
        File parentFile = fileVideoTargetFile.getParentFile();
        if (parentFile != null && !parentFile.isDirectory()) {
            parentFile.mkdirs();
        }
        File file = c0860c1.f2639e;
        if (file != null) {
            try {
                if (AbstractC1416l.m3825a(file.getCanonicalPath(), fileVideoTargetFile.getCanonicalPath())) {
                    c3959f = file;
                } else {
                    AbstractC0793l.m2021a0(file, fileVideoTargetFile);
                    c3959f = fileVideoTargetFile;
                }
            } catch (Throwable th2) {
                c3959f = new C3959f(th2);
            }
            File file2 = (File) (c3959f instanceof C3959f ? null : c3959f);
            if (file2 == null || !file2.isFile() || file2.length() <= 0) {
                c0901w02.invoke(new Exception("Video copy failed"));
                return;
            } else {
                c0901w0.invoke(file2);
                return;
            }
        }
        String strNormalizeDownloadUrl = normalizeDownloadUrl(c0860c1.f2636b);
        if (AbstractC3149m.m6721t0(strNormalizeDownloadUrl)) {
            c0901w02.invoke(new IllegalArgumentException("Video download URL is empty"));
            return;
        }
        if (isHttpUrl(strNormalizeDownloadUrl) && AbstractC3149m.m6721t0(c0860c1.f2637c)) {
            File fileM10901g = AbstractC6133b.m10901g(fileVideoTargetFile, strNormalizeDownloadUrl, true);
            if (fileM10901g != null && fileM10901g.isFile() && fileM10901g.length() > 0 && (j3 <= 0 || fileM10901g.length() >= j3)) {
                c0901w0.invoke(fileM10901g);
                return;
            }
            if (fileM10901g != null) {
                fileM10901g.delete();
            }
            c0901w02.invoke(new Exception("Video download failed"));
            return;
        }
        C2105p c2105pMedia = WeChatApis.media();
        C0240b c0240b = c2105pMedia != null ? c2105pMedia.f7037c : null;
        if (c0240b == null) {
            c0901w02.invoke(new IllegalStateException("Video API is not ready"));
            return;
        }
        if (fileVideoTargetFile.exists() && !fileVideoTargetFile.delete()) {
            c0901w02.invoke(new IllegalStateException("Unable to replace existing video file"));
            return;
        }
        if (c3086j != null) {
            c3086j.m6555f(strM1018g, 60000L, new RunnableC0006d(this, 10, c0901w02));
        } else {
            new Thread(new RunnableC0003a(c0901w02, 9), strM1018g).start();
        }
        if (((C2103n) c0240b.f640d).m5265e(strNormalizeDownloadUrl, c0860c1.f2637c, fileVideoTargetFile.getAbsolutePath(), 4, new C0119x(new C0863d1(c0860c1, c0901w02, c0901w0), 27))) {
            return;
        }
        c0901w02.invoke(new Exception("Video download task submission failed"));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    public static final C3967n downloadVideoInternal$lambda$0(AtomicBoolean atomicBoolean, C3086j c3086j, String str, PluginCallBack.DownloadCallback downloadCallback, File file) {
        file.getClass();
        if (atomicBoolean.compareAndSet(false, true)) {
            if (c3086j != null) {
                c3086j.m6550a(str);
            }
            if (downloadCallback != null) {
                downloadCallback.onSuccess(file);
            }
        }
        return C3967n.f12976a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    public static final C3967n downloadVideoInternal$lambda$1(AtomicBoolean atomicBoolean, C3086j c3086j, String str, PluginCallBack.DownloadCallback downloadCallback, Exception exc) {
        exc.getClass();
        if (atomicBoolean.compareAndSet(false, true)) {
            if (c3086j != null) {
                c3086j.m6550a(str);
            }
            if (downloadCallback != null) {
                downloadCallback.onError(exc);
            }
        }
        return C3967n.f12976a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    public static final void downloadVideoInternal$lambda$4(ScriptWaBridge scriptWaBridge, InterfaceC1231l interfaceC1231l) {
        scriptWaBridge.async(new C0471o0(interfaceC1231l, 1));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    public static final C3967n downloadVideoInternal$lambda$4$0(InterfaceC1231l interfaceC1231l) {
        interfaceC1231l.invoke(new Exception("Video download timed out"));
        return C3967n.f12976a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    public static final void downloadVideoInternal$lambda$5(InterfaceC1231l interfaceC1231l) {
        try {
            Thread.sleep(60000L);
            interfaceC1231l.invoke(new Exception("Video download timed out"));
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    public static final SilkCodec durationCodec_delegate$lambda$0() {
        return new SilkCodec();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private final String extensionFromUrl(String str) {
        Object c3959f;
        try {
            c3959f = Uri.parse(str).getLastPathSegment();
            if (c3959f == null) {
                c3959f = HttpUrl.FRAGMENT_ENCODE_SET;
            }
        } catch (Throwable th2) {
            c3959f = new C3959f(th2);
        }
        if (c3959f instanceof C3959f) {
            c3959f = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        String strM6697L0 = AbstractC3149m.m6697L0((String) c3959f, '.', HttpUrl.FRAGMENT_ENCODE_SET);
        Locale locale = Locale.US;
        String strM5165l = AbstractC2091b.m5165l(locale, strM6697L0, locale);
        switch (strM5165l.hashCode()) {
            case 97669:
                return !strM5165l.equals("bmp") ? "jpg" : strM5165l;
            case 102340:
                return !strM5165l.equals("gif") ? "jpg" : strM5165l;
            case 105441:
                return !strM5165l.equals("jpg") ? "jpg" : strM5165l;
            case 111145:
                return !strM5165l.equals("png") ? "jpg" : strM5165l;
            case 3268712:
                return !strM5165l.equals("jpeg") ? "jpg" : strM5165l;
            case 3645340:
                return !strM5165l.equals("webp") ? "jpg" : strM5165l;
            default:
                return "jpg";
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private final Map<String, Object> favoriteItemMap(C2098i c2098i) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("localId", Long.valueOf(c2098i.f7019a));
        linkedHashMap.put("id", Long.valueOf(c2098i.f7019a));
        linkedHashMap.put("type", Integer.valueOf(c2098i.f7020b));
        linkedHashMap.put("typeLabel", c2098i.m5254b());
        String str = c2098i.f7021c;
        linkedHashMap.put("title", AbstractC3149m.m6721t0(str) ? c2098i.m5254b() : str);
        linkedHashMap.put("summary", c2098i.m5253a());
        linkedHashMap.put("rawTitle", str);
        linkedHashMap.put("rawSummary", c2098i.f7022d);
        linkedHashMap.put("totalSizeBytes", Long.valueOf(c2098i.f7023e));
        linkedHashMap.put("updateTimeMillis", Long.valueOf(c2098i.f7024f));
        linkedHashMap.put("tags", c2098i.f7025g);
        return linkedHashMap;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private final Object fieldAny(Object obj, String str) {
        Object c3959f;
        Field field;
        try {
            for (Class<?> superclass = obj.getClass(); superclass != null && !superclass.equals(Object.class); superclass = superclass.getSuperclass()) {
                Field[] declaredFields = superclass.getDeclaredFields();
                declaredFields.getClass();
                int length = declaredFields.length;
                int i9 = 0;
                while (true) {
                    if (i9 >= length) {
                        field = null;
                        break;
                    }
                    field = declaredFields[i9];
                    if (Boolean.valueOf(AbstractC1416l.m3825a(field.getName(), str)).booleanValue()) {
                        break;
                    }
                    i9++;
                }
                if (field != null) {
                    field.setAccessible(true);
                    c3959f = field.get(obj);
                    break;
                }
            }
            c3959f = null;
        } catch (Throwable th2) {
            c3959f = new C3959f(th2);
        }
        if (c3959f instanceof C3959f) {
            return null;
        }
        return c3959f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0039, code lost:
    
        r6.setAccessible(true);
        r9 = r6.get(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0041, code lost:
    
        if (r9 == null) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0043, code lost:
    
        r5 = r9.toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0047, code lost:
    
        if (r5 != null) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0049, code lost:
    
        r5 = okhttp3.HttpUrl.FRAGMENT_ENCODE_SET;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final String fieldString(Object obj, String str) {
        Object c3959f;
        Field field;
        Object obj2 = HttpUrl.FRAGMENT_ENCODE_SET;
        try {
            Class<?> superclass = obj.getClass();
            while (true) {
                if (superclass == null || superclass.equals(Object.class)) {
                    break;
                }
                Field[] declaredFields = superclass.getDeclaredFields();
                declaredFields.getClass();
                int length = declaredFields.length;
                int i9 = 0;
                while (true) {
                    c3959f = null;
                    if (i9 >= length) {
                        field = null;
                        break;
                    }
                    field = declaredFields[i9];
                    if (Boolean.valueOf(AbstractC1416l.m3825a(field.getName(), str)).booleanValue()) {
                        break;
                    }
                    i9++;
                }
                if (field != null) {
                    break;
                }
                superclass = superclass.getSuperclass();
            }
        } catch (Throwable th2) {
            c3959f = new C3959f(th2);
        }
        if (!(c3959f instanceof C3959f)) {
            obj2 = c3959f;
        }
        return (String) obj2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private final String firstNotBlank(String... strArr) {
        int length = strArr.length;
        for (int i9 = 0; i9 < length; i9++) {
            String str = strArr[i9];
            if (!TextUtils.isEmpty(str)) {
                return str != null ? str : HttpUrl.FRAGMENT_ENCODE_SET;
            }
        }
        return HttpUrl.FRAGMENT_ENCODE_SET;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private final int firstPositiveInt(Object... objArr) {
        Integer numM6741e0;
        for (Object obj : objArr) {
            int iIntValue = obj instanceof Number ? ((Number) obj).intValue() : (!(obj instanceof String) || (numM6741e0 = AbstractC3156t.m6741e0(10, (String) obj)) == null) ? 0 : numM6741e0.intValue();
            if (iIntValue > 0) {
                return iIntValue;
            }
        }
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private final long firstPositiveLong(Object... objArr) {
        Long lM6743g0;
        for (Object obj : objArr) {
            long jLongValue = obj instanceof Number ? ((Number) obj).longValue() : (!(obj instanceof String) || (lM6743g0 = AbstractC3156t.m6743g0((String) obj)) == null) ? 0L : lM6743g0.longValue();
            if (jLongValue > 0) {
                return jLongValue;
            }
        }
        return 0L;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    public static final C3967n get$lambda$0(Consumer consumer, ScriptWaBridge scriptWaBridge, String str, Map map, long j3) {
        if (consumer != null) {
            consumer.accept(scriptWaBridge.httpText("GET", str, null, map, j3));
        }
        return C3967n.f12976a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private final SilkCodec getDurationCodec() {
        return (SilkCodec) this.durationCodec$delegate.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private final <K, V> V getOrPut(Map<K, V> map, K k10, InterfaceC1220a interfaceC1220a) {
        synchronized (map) {
            V v10 = map.get(k10);
            if (v10 != null) {
                return v10;
            }
            V v11 = (V) interfaceC1220a.invoke();
            map.put(k10, v11);
            return v11;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private final String groupDisplayName(String str, String str2, String str3) {
        return (AbstractC3149m.m6721t0(str3) || AbstractC1416l.m3825a(str3, str2)) ? firstNotBlank(str2, str3, str) : !AbstractC3149m.m6721t0(str2) ? AbstractC4855en.m9265i(str3, " (", str2, ")") : str3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private final String guessFileName(String str) {
        Object c3959f;
        try {
            c3959f = Uri.parse(str).getLastPathSegment();
        } catch (Throwable th2) {
            c3959f = new C3959f(th2);
        }
        if (c3959f instanceof C3959f) {
            c3959f = null;
        }
        String str2 = (String) c3959f;
        if (str2 == null) {
            str2 = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        String str3 = Boolean.valueOf(AbstractC3149m.m6721t0(str2) ^ true).booleanValue() ? str2 : null;
        return str3 != null ? str3 : AbstractC0255e.m1018g(System.currentTimeMillis(), "download_");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private final OkHttpClient httpClient(final long j3) {
        if (j3 < 1) {
            j3 = 1;
        }
        if (j3 > 300) {
            j3 = 300;
        }
        Map<Long, OkHttpClient> map = this.httpClients;
        map.getClass();
        Object orPut = getOrPut(map, Long.valueOf(j3), new InterfaceC1220a() { // from class: eb.x0
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // p085fg.InterfaceC1220a
            public final Object invoke() {
                return ScriptWaBridge.httpClient$lambda$0(j3);
            }
        });
        orPut.getClass();
        return (OkHttpClient) orPut;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    public static final OkHttpClient httpClient$lambda$0(long j3) {
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        return builder.connectTimeout(j3, timeUnit).readTimeout(j3, timeUnit).writeTimeout(j3, timeUnit).followRedirects(true).followSslRedirects(true).build();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    private final String httpText(String str, String str2, Map<?, ?> map, Map<?, ?> map2, long j3) {
        Object c3959f;
        if (str2 == null || AbstractC3149m.m6721t0(str2)) {
            return null;
        }
        try {
            Map<String, String> mapNormalizeMap = normalizeMap(map2);
            Request.Builder builderApplyHeaders = applyHeaders(new Request.Builder().url(str2), mapNormalizeMap);
            if (AbstractC1416l.m3825a(str, "POST")) {
                builderApplyHeaders.post(RequestBody.Companion.create(buildPostBody(map, mapNormalizeMap), MediaType.Companion.get(defaultContentType(mapNormalizeMap))));
            } else {
                builderApplyHeaders.get();
            }
            Response responseExecute = httpClient(j3).newCall(builderApplyHeaders.build()).execute();
            try {
                ResponseBody responseBodyBody = responseExecute.body();
                c3959f = responseBodyBody != null ? responseBodyBody.string() : null;
                responseExecute.close();
            } finally {
            }
        } catch (Throwable th2) {
            c3959f = new C3959f(th2);
        }
        Throwable thM8182b = C3960g.m8182b(c3959f);
        if (thM8182b != null) {
            this.bridge.log("HTTP " + str + " 失败: " + thM8182b.getMessage());
        }
        return (String) (c3959f instanceof C3959f ? null : c3959f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private final C0854a1 imageDownloadRequest(Object obj) {
        if (obj == null) {
            return null;
        }
        String strFirstNotBlank = firstNotBlank(callString(obj, "getBigImgUrl"), fieldString(obj, "bigImgUrl"));
        String strFirstNotBlank2 = firstNotBlank(callString(obj, "getMidImgUrl"), fieldString(obj, "midImgUrl"));
        String strFirstNotBlank3 = firstNotBlank(strFirstNotBlank, strFirstNotBlank2, firstNotBlank(callString(obj, "getThumbUrl"), fieldString(obj, "thumbUrl")));
        if (AbstractC3149m.m6721t0(strFirstNotBlank3)) {
            return null;
        }
        return new C0854a1(!AbstractC3149m.m6721t0(strFirstNotBlank) ? 1 : 2, !AbstractC3149m.m6721t0(strFirstNotBlank) ? firstPositiveInt(callAny(obj, "getBigLength"), fieldAny(obj, "bigLength")) : !AbstractC3149m.m6721t0(strFirstNotBlank2) ? firstPositiveInt(callAny(obj, "getMidLength"), fieldAny(obj, "midLength")) : firstPositiveInt(callAny(obj, "getThumbLength"), fieldAny(obj, "thumbLength")), firstNotBlank(callString(obj, "getMd5"), fieldString(obj, "md5")), strFirstNotBlank3, firstNotBlank(callString(obj, "getKey"), callString(obj, "getAesKey"), fieldString(obj, "key"), fieldString(obj, "aesKey")));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private final boolean isHttpUrl(String str) {
        Locale locale = Locale.US;
        String strM5165l = AbstractC2091b.m5165l(locale, str, locale);
        return AbstractC3156t.m6740d0(strM5165l, "http://", false) || AbstractC3156t.m6740d0(strM5165l, "https://", false);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private final void logDownload(String str) {
        File file = this.currentPluginDir;
        ScriptPluginBridge scriptPluginBridge = this.bridge;
        if (file != null) {
            scriptPluginBridge.log(this.currentPluginName, file, str);
        } else {
            scriptPluginBridge.log(str);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private final String mentionDisplayName(C1368i c1368i, String str, String str2) {
        if (AbstractC1416l.m3825a(str2, "notify@all")) {
            return "所有人";
        }
        WeChatContact weChatContactM3725n = c1368i.m3725n(str2);
        return firstNotBlank(c1368i.m3733v(str, str2), weChatContactM3725n != null ? weChatContactM3725n.nickname : null, weChatContactM3725n != null ? weChatContactM3725n.customWxId : null, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private final String normalizeDownloadUrl(String str) {
        String string = str != null ? AbstractC3149m.m6703R0(str).toString() : null;
        String str2 = HttpUrl.FRAGMENT_ENCODE_SET;
        if (string == null) {
            string = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        if (AbstractC3149m.m6721t0(string)) {
            return HttpUrl.FRAGMENT_ENCODE_SET;
        }
        Matcher matcher = this.atPattern.matcher(string);
        if (matcher.find()) {
            String strGroup = matcher.group(1);
            String string2 = strGroup != null ? AbstractC3149m.m6703R0(strGroup).toString() : null;
            if (string2 != null) {
                str2 = string2;
            }
            string = str2;
        }
        return AbstractC3149m.m6703R0(unescapeXmlText(string)).toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private final Map<String, String> normalizeMap(Map<?, ?> map) {
        String string;
        if (map == null || map.isEmpty()) {
            return C4174u.f13711g;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<?, ?> entry : map.entrySet()) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            String string2 = (key == null || (string = key.toString()) == null) ? null : AbstractC3149m.m6703R0(string).toString();
            String str = HttpUrl.FRAGMENT_ENCODE_SET;
            if (string2 == null) {
                string2 = HttpUrl.FRAGMENT_ENCODE_SET;
            }
            if (!AbstractC3149m.m6721t0(string2)) {
                String string3 = value != null ? value.toString() : null;
                if (string3 != null) {
                    str = string3;
                }
                linkedHashMap.put(string2, str);
            }
        }
        return linkedHashMap;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private final C0857b1 parseAtContent(String str, String str2) {
        C1368i c1368iM9259c = AbstractC4855en.m9259c();
        if (c1368iM9259c != null && C1368i.m3686I(str)) {
            Matcher matcher = this.atPattern.matcher(str2);
            ArrayList arrayList = new ArrayList();
            StringBuffer stringBuffer = new StringBuffer();
            while (matcher.find()) {
                String strGroup = matcher.group(1);
                String string = strGroup != null ? AbstractC3149m.m6703R0(strGroup).toString() : null;
                if (string == null) {
                    string = HttpUrl.FRAGMENT_ENCODE_SET;
                }
                if (AbstractC3149m.m6721t0(string)) {
                    matcher.appendReplacement(stringBuffer, HttpUrl.FRAGMENT_ENCODE_SET);
                } else {
                    arrayList.add(string);
                    String strQuoteReplacement = Matcher.quoteReplacement("@" + mentionDisplayName(c1368iM9259c, str, string) + "\u2005");
                    strQuoteReplacement.getClass();
                    matcher.appendReplacement(stringBuffer, strQuoteReplacement);
                }
            }
            matcher.appendTail(stringBuffer);
            if (!arrayList.isEmpty()) {
                String string2 = stringBuffer.toString();
                string2.getClass();
                return new C0857b1(string2, AbstractC4166m.m8407P1(AbstractC4166m.m8411T1(arrayList)));
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    public static final C3967n post$lambda$0(Consumer consumer, ScriptWaBridge scriptWaBridge, String str, Map map, Map map2, long j3) {
        if (consumer != null) {
            consumer.accept(scriptWaBridge.httpText("POST", str, map, map2, j3));
        }
        return C3967n.f12976a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private final List<WeChatContact> rawFriendList() {
        C1368i c1368iM9259c = AbstractC4855en.m9259c();
        return c1368iM9259c != null ? c1368iM9259c.m3713U("SELECT r.username, r.alias, r.conRemark, r.nickname, r.encryptUsername, r.type, r.lvbuff AS lvbuff, i.reserved1 AS avatarUrl, i.reserved2 AS avatarBackupUrl FROM rcontact r LEFT JOIN img_flag i ON r.username = i.username WHERE (r.encryptUsername!='' OR r.username=(SELECT value FROM userinfo WHERE id=2)) AND r.verifyFlag=0 AND (r.type & 1)!=0 AND (r.type & 8)=0 AND (r.type & 32)=0 AND r.username NOT LIKE '%chatroom'", null) : C4173t.f13710g;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private final Map<String, WeChatContact> rawGroupContactMap() {
        C1368i c1368iM9259c = AbstractC4855en.m9259c();
        Iterable iterableM3735x = c1368iM9259c != null ? c1368iM9259c.m3735x() : C4173t.f13710g;
        int iM8438a0 = AbstractC4178y.m8438a0(AbstractC4167n.m8429e1(iterableM3735x));
        if (iM8438a0 < 16) {
            iM8438a0 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iM8438a0);
        for (Object obj : iterableM3735x) {
            linkedHashMap.put(((WeChatContact) obj).wxId, obj);
        }
        return linkedHashMap;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private final List<WeChatChatroom> rawGroupList() {
        C1363d c1363dM5159f = AbstractC2091b.m5159f();
        return c1363dM5159f != null ? c1363dM5159f.m3675g() : C4173t.f13710g;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private final List<String> readGroupMemberIds(String str, boolean z9) {
        Set setKeySet;
        List listM3677i;
        int i9 = z9 ? 5 : 1;
        for (int i10 = 0; i10 < i9; i10++) {
            C1368i c1368iM9259c = AbstractC4855en.m9259c();
            C1363d c1363dM5159f = AbstractC2091b.m5159f();
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            if (c1363dM5159f != null && (listM3677i = c1363dM5159f.m3677i(str)) != null) {
                for (Object obj : listM3677i) {
                    String str2 = (String) obj;
                    str2.getClass();
                    if (!AbstractC3149m.m6721t0(str2)) {
                        linkedHashSet.add(obj);
                    }
                }
            }
            if (c1368iM9259c != null) {
                for (Object obj2 : c1368iM9259c.m3732u(str)) {
                    String str3 = (String) obj2;
                    str3.getClass();
                    if (!AbstractC3149m.m6721t0(str3)) {
                        linkedHashSet.add(obj2);
                    }
                }
            }
            if (c1368iM9259c != null && (setKeySet = c1368iM9259c.m3734w(str).keySet()) != null) {
                for (Object obj3 : setKeySet) {
                    String str4 = (String) obj3;
                    str4.getClass();
                    if (!AbstractC3149m.m6721t0(str4)) {
                        linkedHashSet.add(obj3);
                    }
                }
            }
            if (!linkedHashSet.isEmpty()) {
                return AbstractC4166m.m8407P1(linkedHashSet);
            }
            waitForContactData(i10);
        }
        return C4173t.f13710g;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private final File resolveDownloadTarget(String str, String str2) {
        File file = new File(str2);
        return AbstractC3156t.m6733W(str2, "/", false) ? new File(file, guessFileName(str)) : file.isDirectory() ? new File(file, guessFileName(str)) : (file.exists() || !AbstractC3149m.m6721t0(AbstractC0793l.m2023c0(file))) ? file : new File(file, guessFileName(str));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean sendEmoji$lambda$0(String str, String str2, C2105p c2105p) {
        c2105p.getClass();
        if (str == null) {
            str = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        if (str2 == null) {
            str2 = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        return c2105p.f7038d.m5219v(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean sendFavorite$lambda$0(String str, long j3, C2105p c2105p) {
        c2105p.getClass();
        return c2105p.f7040f.m5252z(j3, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean sendFavorite$lambda$1(String str, String str2, C2105p c2105p) {
        c2105p.getClass();
        return c2105p.f7040f.m5236A(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean sendFile$lambda$0(String str, String str2, C2105p c2105p) {
        c2105p.getClass();
        if (str == null) {
            str = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        if (str2 == null) {
            str2 = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        return c2105p.f7039e.m588T(str, str2, HttpUrl.FRAGMENT_ENCODE_SET);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean sendFile$lambda$1(String str, String str2, String str3, C2105p c2105p) {
        c2105p.getClass();
        if (str == null) {
            str = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        if (str2 == null) {
            str2 = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        if (str3 == null) {
            str3 = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        return c2105p.f7039e.m588T(str, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean sendImage$lambda$0(String str, String str2, C2105p c2105p) {
        c2105p.getClass();
        if (str == null) {
            str = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        if (str2 == null) {
            str2 = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        return c2105p.m5301a(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean sendImage$lambda$1(String str, String str2, String str3, C2105p c2105p) {
        c2105p.getClass();
        if (str == null) {
            str = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        if (str2 == null) {
            str2 = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        if (str3 == null) {
            str3 = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        return c2105p.f7035a.m5274r(str, str2, str3, false);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private final boolean sendMedia(InterfaceC1231l interfaceC1231l) {
        Object c3959f;
        WeChatApis.interaction().getClass();
        C2105p c2105p = WeChatApis.mediaApi;
        if (c2105p == null) {
            return false;
        }
        try {
            Boolean bool = (Boolean) interfaceC1231l.invoke(c2105p);
            bool.booleanValue();
            c3959f = bool;
        } catch (Throwable th2) {
            c3959f = new C3959f(th2);
        }
        Boolean bool2 = Boolean.FALSE;
        boolean z9 = c3959f instanceof C3959f;
        Object obj = c3959f;
        if (z9) {
            obj = bool2;
        }
        return ((Boolean) obj).booleanValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean sendMediaMsg$lambda$0(String str, Object obj, String str2, C2105p c2105p) {
        c2105p.getClass();
        if (str2 == null) {
            str2 = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        return c2105p.f7039e.m589U(obj, str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean sendOriginalImage$lambda$0(String str, String str2, C2105p c2105p) {
        c2105p.getClass();
        if (str == null) {
            str = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        if (str2 == null) {
            str2 = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        return c2105p.f7035a.m5274r(str, str2, HttpUrl.FRAGMENT_ENCODE_SET, true);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    public static final C3967n sendText$lambda$0(ScriptWaBridge scriptWaBridge, Consumer consumer, String str, String str2) {
        Object c3959f;
        try {
            c3959f = Boolean.valueOf(scriptWaBridge.sendText(str, str2));
        } catch (Throwable th2) {
            c3959f = new C3959f(th2);
        }
        Object obj = Boolean.FALSE;
        if (c3959f instanceof C3959f) {
            c3959f = obj;
        }
        boolean zBooleanValue = ((Boolean) c3959f).booleanValue();
        if (consumer != null) {
            consumer.accept(zBooleanValue ? 0L : null);
        }
        return C3967n.f12976a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean sendVideo$lambda$0(String str, String str2, C2105p c2105p) {
        c2105p.getClass();
        C0240b c0240b = c2105p.f7037c;
        if (str == null) {
            str = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        if (str2 == null) {
            str2 = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        return c0240b.m972q(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean sendVoice$lambda$0(String str, String str2, C2105p c2105p) {
        c2105p.getClass();
        if (str == null) {
            str = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        if (str2 == null) {
            str2 = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        return c2105p.f7036b.m5324t(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean sendVoice$lambda$1(int i9, String str, String str2, C2105p c2105p) {
        c2105p.getClass();
        int iM7909r = AbstractC3754e0.m7909r(i9, 0, 2147483) * 1000;
        if (str == null) {
            str = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        if (str2 == null) {
            str2 = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        return c2105p.f7036b.m5323s(iM7909r, str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean shareFile$lambda$0(String str, String str2, String str3, String str4, C2105p c2105p) {
        c2105p.getClass();
        if (str2 == null) {
            str2 = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        return c2105p.f7039e.m588T(str, str3, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean shareMiniProgram$lambda$0(String str, String str2, String str3, String str4, String str5, byte[] bArr, String str6, C2105p c2105p) {
        String str7;
        C2105p c2105p2;
        String str8;
        byte[] bArr2;
        String str9;
        String str10;
        String str11;
        String str12;
        c2105p.getClass();
        if (str2 == null) {
            str2 = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        if (str3 == null) {
            str3 = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        if (str5 == null) {
            str5 = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        if (str6 == null) {
            bArr2 = bArr;
            str9 = str5;
            str10 = str4;
            str11 = str3;
            str12 = str2;
            str7 = str;
            c2105p2 = c2105p;
            str8 = HttpUrl.FRAGMENT_ENCODE_SET;
        } else {
            String str13 = str2;
            str7 = str;
            c2105p2 = c2105p;
            str8 = str6;
            bArr2 = bArr;
            str9 = str5;
            str10 = str4;
            str11 = str3;
            str12 = str13;
        }
        return c2105p2.m5302b(str7, str12, str11, str10, str9, bArr2, str8);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean shareMusic$lambda$0(String str, String str2, String str3, String str4, String str5, byte[] bArr, String str6, C2105p c2105p) {
        c2105p.getClass();
        return c2105p.f7039e.m593Z(str, str2 == null ? HttpUrl.FRAGMENT_ENCODE_SET : str2, str3 == null ? HttpUrl.FRAGMENT_ENCODE_SET : str3, str4, str5, HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, bArr, str6 == null ? HttpUrl.FRAGMENT_ENCODE_SET : str6);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean shareMusicVideo$lambda$0(String str, String str2, String str3, String str4, String str5, String str6, int i9, String str7, byte[] bArr, String str8, C2105p c2105p) {
        c2105p.getClass();
        String str9 = HttpUrl.FRAGMENT_ENCODE_SET;
        if (str2 == null) {
            str2 = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        String str10 = str3 == null ? HttpUrl.FRAGMENT_ENCODE_SET : str3;
        String str11 = str6 == null ? HttpUrl.FRAGMENT_ENCODE_SET : str6;
        String str12 = str7 == null ? HttpUrl.FRAGMENT_ENCODE_SET : str7;
        if (str8 != null) {
            str9 = str8;
        }
        C0119x c0119x = c2105p.f7039e;
        Object[] objArr = {"musicUrl", str4, "musicDataUrl", str5, "singerName", str11, "duration", Integer.valueOf(i9), "songLyric", str12};
        c0119x.getClass();
        Object objM573D = c0119x.m573D("com.tencent.mm.opensdk.modelmsg.WXMusicVideoObject", C0119x.m571q(objArr), C0119x.m571q("title", str2, "description", str10, "thumbData", bArr));
        return objM573D != null && c0119x.m589U(objM573D, str, str9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean shareText$lambda$0(String str, String str2, String str3, C2105p c2105p) {
        c2105p.getClass();
        if (str3 == null) {
            str3 = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        C0119x c0119x = c2105p.f7039e;
        Object[] objArr = {WeChatSnsPost.TYPE_TEXT, str2};
        c0119x.getClass();
        Object objM573D = c0119x.m573D("com.tencent.mm.opensdk.modelmsg.WXTextObject", C0119x.m571q(objArr), C0119x.m571q("description", str2));
        return objM573D != null && c0119x.m589U(objM573D, str, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean shareVideo$lambda$0(String str, String str2, String str3, String str4, byte[] bArr, String str5, C2105p c2105p) {
        c2105p.getClass();
        String str6 = HttpUrl.FRAGMENT_ENCODE_SET;
        if (str2 == null) {
            str2 = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        if (str3 == null) {
            str3 = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        if (str5 != null) {
            str6 = str5;
        }
        C0119x c0119x = c2105p.f7039e;
        c0119x.getClass();
        Object objM573D = c0119x.m573D("com.tencent.mm.opensdk.modelmsg.WXVideoObject", C0119x.m571q("videoUrl", str4), C0119x.m571q("title", str2, "description", str3, "thumbData", bArr));
        return objM573D != null && c0119x.m589U(objM573D, str, str6);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean shareWebpage$lambda$0(String str, String str2, String str3, String str4, byte[] bArr, String str5, C2105p c2105p) {
        String str6;
        C2105p c2105p2;
        String str7;
        byte[] bArr2;
        String str8;
        String str9;
        String str10;
        c2105p.getClass();
        if (str2 == null) {
            str2 = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        if (str3 == null) {
            str3 = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        if (str5 == null) {
            bArr2 = bArr;
            str8 = str4;
            str9 = str3;
            str10 = str2;
            str6 = str;
            c2105p2 = c2105p;
            str7 = HttpUrl.FRAGMENT_ENCODE_SET;
        } else {
            String str11 = str2;
            str6 = str;
            c2105p2 = c2105p;
            str7 = str5;
            bArr2 = bArr;
            str8 = str4;
            str9 = str3;
            str10 = str11;
        }
        return c2105p2.m5303c(str6, str10, str9, str8, bArr2, str7);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private final File targetFile(String str, String str2, String str3) {
        String str4 = null;
        if (str != null) {
            if (AbstractC3149m.m6721t0(str)) {
                str = null;
            }
            str4 = str;
        }
        if (str4 == null || AbstractC3149m.m6721t0(str4)) {
            return new File(AbstractC6133b.m10903i(this.bridge.getHostContext(), "Image"), AbstractC4855en.m9264h(firstNotBlank(str2, AbstractC0255e.m1018g(System.currentTimeMillis(), "image_")), ".", extensionFromUrl(str3)));
        }
        File file = new File(str4);
        return (AbstractC3156t.m6733W(str4, "/", false) || file.isDirectory()) ? new File(file, AbstractC4855en.m9264h(firstNotBlank(str2, AbstractC0255e.m1018g(System.currentTimeMillis(), "image_")), ".", extensionFromUrl(str3))) : file;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private final String unescapeXmlText(String str) {
        if (AbstractC3149m.m6721t0(str)) {
            return str;
        }
        return new C3147k("&#(x[0-9a-fA-F]+|[0-9]+);").m6684e(AbstractC3156t.m6737a0(AbstractC3156t.m6737a0(AbstractC3156t.m6737a0(AbstractC3156t.m6737a0(AbstractC3156t.m6737a0(AbstractC3156t.m6737a0(AbstractC3156t.m6737a0(str, "&quot;", "\"", false), "&#x20;", " ", false), "&#x0A;", "\n", false), "&lt;", "<", false), "&gt;", ">", false), "&apos;", "'", false), "&amp;", "&", false), new C0136d0(this, 11));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence unescapeXmlText$lambda$0(ScriptWaBridge scriptWaBridge, InterfaceC3142f interfaceC3142f) {
        Object c3959f;
        Object c3959f2;
        int i9;
        interfaceC3142f.getClass();
        C3145i c3145i = (C3145i) interfaceC3142f;
        String str = (String) ((C3143g) c3145i.m6676a()).get(1);
        try {
            if (AbstractC3156t.m6740d0(str, "x", true)) {
                String strSubstring = str.substring(1);
                AbstractC0000a.m96w(16);
                i9 = Integer.parseInt(strSubstring, 16);
            } else {
                i9 = Integer.parseInt(str);
            }
            c3959f = Integer.valueOf(i9);
        } catch (Throwable th2) {
            c3959f = new C3959f(th2);
        }
        if (c3959f instanceof C3959f) {
            c3959f = null;
        }
        Integer num = (Integer) c3959f;
        if (num == null) {
            return c3145i.m6678c();
        }
        try {
            char[] chars = Character.toChars(num.intValue());
            chars.getClass();
            c3959f2 = new String(chars);
        } catch (Throwable th3) {
            c3959f2 = new C3959f(th3);
        }
        Object objM6678c = c3145i.m6678c();
        if (c3959f2 instanceof C3959f) {
            c3959f2 = objM6678c;
        }
        return (CharSequence) c3959f2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:13:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final C0860c1 videoDownloadRequest(Object obj) {
        WeChatMessage weChatMessage;
        File file;
        if (obj == null) {
            return null;
        }
        boolean z9 = obj instanceof ScriptMessageBean;
        if (z9) {
            Object message = ((ScriptMessageBean) obj).getMessage();
            weChatMessage = message instanceof WeChatMessage ? (WeChatMessage) message : null;
        } else if (obj instanceof WeChatMessage) {
            weChatMessage = (WeChatMessage) obj;
        }
        Object videoMsg = z9 ? ((ScriptMessageBean) obj).getVideoMsg() : obj instanceof WeChatMessage ? ((WeChatMessage) obj).getVideoMsg() : obj;
        C2105p c2105pMedia = WeChatApis.media();
        C0240b c0240b = c2105pMedia != null ? c2105pMedia.f7037c : null;
        String strFirstNotBlank = firstNotBlank(weChatMessage != null ? weChatMessage.imagePath : null, callString(obj, "getImagePath"), fieldString(obj, "imagePath"));
        C2107r c2107rM969n = (AbstractC3149m.m6721t0(strFirstNotBlank) || c0240b == null) ? null : c0240b.m969n(strFirstNotBlank);
        long jFirstPositiveLong = firstPositiveLong(c2107rM969n != null ? Long.valueOf(c2107rM969n.f7044d) : null, videoMsg != null ? callAny(videoMsg, "getLength") : null, videoMsg != null ? fieldAny(videoMsg, "length") : null);
        String str = Boolean.valueOf(new File(strFirstNotBlank).isFile()).booleanValue() ? strFirstNotBlank : null;
        boolean z10 = true;
        if (!Boolean.valueOf(!AbstractC3149m.m6721t0(strFirstNotBlank)).booleanValue()) {
            strFirstNotBlank = null;
        }
        String strFirstNotBlank2 = firstNotBlank(str, (strFirstNotBlank == null || c0240b == null) ? null : c0240b.m970o(strFirstNotBlank));
        if (!Boolean.valueOf(!AbstractC3149m.m6721t0(strFirstNotBlank2)).booleanValue()) {
            strFirstNotBlank2 = null;
        }
        if (strFirstNotBlank2 != null) {
            File file2 = new File(strFirstNotBlank2);
            if (!file2.isFile() || file2.length() <= 0 || (jFirstPositiveLong > 0 && file2.length() < jFirstPositiveLong)) {
                z10 = false;
            }
            if (!Boolean.valueOf(z10).booleanValue()) {
                file2 = null;
            }
            file = file2;
        } else {
            file = null;
        }
        String strFirstNotBlank3 = firstNotBlank(c2107rM969n != null ? c2107rM969n.f7041a : null, videoMsg != null ? callString(videoMsg, "getNewMd5") : null, videoMsg != null ? callString(videoMsg, "getMd5") : null, videoMsg != null ? fieldString(videoMsg, "newMd5") : null, videoMsg != null ? fieldString(videoMsg, "md5") : null);
        String strFirstNotBlank4 = firstNotBlank(c2107rM969n != null ? c2107rM969n.f7042b : null, videoMsg != null ? callString(videoMsg, "getCdnVideoUrl") : null, videoMsg != null ? callString(videoMsg, "getCdnUrl") : null, videoMsg != null ? fieldString(videoMsg, "cdnVideoUrl") : null, videoMsg != null ? fieldString(videoMsg, "cdnUrl") : null);
        String strFirstNotBlank5 = firstNotBlank(c2107rM969n != null ? c2107rM969n.f7043c : null, videoMsg != null ? callString(videoMsg, "getAesKey") : null, videoMsg != null ? fieldString(videoMsg, "aesKey") : null);
        if (file == null && AbstractC3149m.m6721t0(strFirstNotBlank4)) {
            return null;
        }
        return new C0860c1(strFirstNotBlank3, strFirstNotBlank4, strFirstNotBlank5, jFirstPositiveLong, file);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private final File videoTargetFile(String str, String str2) {
        String strM1020i = AbstractC0255e.m1020i(firstNotBlank(str2, AbstractC0255e.m1018g(System.currentTimeMillis(), "video_")), ".mp4");
        String str3 = null;
        if (str != null) {
            if (AbstractC3149m.m6721t0(str)) {
                str = null;
            }
            str3 = str;
        }
        if (str3 == null || AbstractC3149m.m6721t0(str3)) {
            return new File(AbstractC6133b.m10903i(this.bridge.getHostContext(), "Video"), strM1020i);
        }
        File file = new File(str3);
        return (AbstractC3156t.m6733W(str3, "/", false) || file.isDirectory()) ? new File(file, strM1020i) : file;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private final boolean waitDownloadedFile(File file, long j3) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (j3 < 1000) {
            j3 = 1000;
        }
        long j4 = jCurrentTimeMillis + j3;
        long j5 = -1;
        int i9 = 0;
        while (System.currentTimeMillis() < j4) {
            long length = file.isFile() ? file.length() : -1L;
            if (length <= 0 || length != j5) {
                i9 = 0;
                j5 = length;
            } else {
                i9++;
                if (i9 >= 2) {
                    return true;
                }
            }
            try {
                Thread.sleep(500L);
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
                return false;
            }
        }
        return file.isFile() && file.length() > 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private final void waitForContactData(int i9) {
        Object c3959f;
        if (i9 >= 4 || AbstractC1416l.m3825a(Looper.myLooper(), Looper.getMainLooper())) {
            return;
        }
        try {
            Thread.sleep(250L);
            c3959f = C3967n.f12976a;
        } catch (Throwable th2) {
            c3959f = new C3959f(th2);
        }
        if (C3960g.m8182b(c3959f) != null) {
            Thread.currentThread().interrupt();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean addChatroomMember(String str, String str2) {
        C1363d c1363dM5159f;
        if (str != null && !AbstractC3149m.m6721t0(str) && str2 != null && !AbstractC3149m.m6721t0(str2) && (c1363dM5159f = AbstractC2091b.m5159f()) != null) {
            if (TextUtils.isEmpty(str2) ? false : c1363dM5159f.m3671a(str, Collections.singletonList(str2))) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String addContactLabel(String str) {
        if (str == null || AbstractC3149m.m6721t0(str)) {
            return HttpUrl.FRAGMENT_ENCODE_SET;
        }
        C1368i c1368iM9259c = AbstractC4855en.m9259c();
        String strM3716a = c1368iM9259c != null ? c1368iM9259c.m3716a(str) : null;
        return strM3716a == null ? HttpUrl.FRAGMENT_ENCODE_SET : strM3716a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void bindPluginLog(String str, File file) {
        this.currentPluginName = str;
        this.currentPluginDir = file;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean clearAllUnread() {
        int i9;
        if (AbstractC6019i.m10784e(this.bridge.getHostContext(), false) >= 0) {
            WeChatApis.message().getClass();
            C1624a c1624a = WeChatApis.conversationApi;
            if (c1624a != null) {
                try {
                    i9 = Integer.parseInt(c1624a.f5317a.queryFirstString("SELECT IFNULL(SUM(unReadCount),0) AS total FROM rconversation WHERE username NOT LIKE ?", new String[]{"wxid_hchat_group_%"}, "total"));
                } catch (Throwable unused) {
                    i9 = 0;
                }
                if (i9 == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean clearUnread(String str) {
        if (str == null || AbstractC3149m.m6721t0(str)) {
            return false;
        }
        return AbstractC6019i.m10785f(this.bridge.getHostContext(), str, false);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean delChatroomMember(String str, String str2) {
        C1363d c1363dM5159f;
        if (str != null && !AbstractC3149m.m6721t0(str) && str2 != null && !AbstractC3149m.m6721t0(str2) && (c1363dM5159f = AbstractC2091b.m5159f()) != null) {
            if (TextUtils.isEmpty(str2) ? false : c1363dM5159f.m3672d(str, Collections.singletonList(str2))) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void delay(long j3, Runnable runnable) {
        if (runnable == null) {
            return;
        }
        RunnableC0006d runnableC0006d = new RunnableC0006d(this, 9, runnable);
        WeChatApis.runtime().getClass();
        C3086j c3086j = WeChatApis.taskApi;
        if (c3086j != null) {
            c3086j.m6555f(AbstractC0255e.m1018g(this.callbackSeq.getAndIncrement(), "script_delay_"), j3, runnableC0006d);
        } else {
            new Thread(new RunnableC0531r(this, j3, runnableC0006d), AbstractC0255e.m1018g(this.callbackSeq.getAndIncrement(), "script_delay_")).start();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean deleteConversation(String str) {
        String string = str != null ? AbstractC3149m.m6703R0(str).toString() : null;
        if (string == null) {
            string = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        if (string.length() == 0) {
            return false;
        }
        WeChatApis.message().getClass();
        C1624a c1624a = WeChatApis.conversationApi;
        if (c1624a != null) {
            return c1624a.m4142a(string);
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void download(String str, String str2, Map<?, ?> map, long j3, Consumer<File> consumer) {
        async(new C0889q0(consumer, this, str, str2, map, j3));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void downloadImage(String str, Consumer<File> consumer) {
        async(new C0045e(consumer, this, str, 7));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void downloadImages(List<?> list, String str, Consumer<List<File>> consumer) {
        async(new C0467n0((Object) consumer, str, (Object) this, (Object) list, 3));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void downloadImg(Object obj, String str) {
        C0854a1 c0854a1ImageDownloadRequest = imageDownloadRequest(obj);
        if (c0854a1ImageDownloadRequest != null) {
            downloadImgInternal(c0854a1ImageDownloadRequest.f2615a, c0854a1ImageDownloadRequest.f2616b, c0854a1ImageDownloadRequest.f2617c, str, c0854a1ImageDownloadRequest.f2618d, c0854a1ImageDownloadRequest.f2619e);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void downloadVideo(String str, String str2, String str3, String str4, PluginCallBack.DownloadCallback downloadCallback) {
        async(new C0475p0(this, str, str2, str3, str4, downloadCallback, 1));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void get(final String str, final Map<?, ?> map, final long j3, final Consumer<String> consumer) {
        async(new InterfaceC1220a() { // from class: eb.p0
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // p085fg.InterfaceC1220a
            public final Object invoke() {
                return ScriptWaBridge.get$lambda$0(consumer, this, str, map, j3);
            }
        });
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int getAllUnreadCount() {
        WeChatApis.message().getClass();
        C1624a c1624a = WeChatApis.conversationApi;
        if (c1624a != null) {
            try {
                return Integer.parseInt(c1624a.f5317a.queryFirstString("SELECT IFNULL(SUM(unReadCount),0) AS total FROM rconversation WHERE username NOT LIKE ?", new String[]{"wxid_hchat_group_%"}, "total"));
            } catch (Throwable unused) {
            }
        }
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String getAvatarUrl(String str, boolean z9) {
        if (str == null || AbstractC3149m.m6721t0(str)) {
            return HttpUrl.FRAGMENT_ENCODE_SET;
        }
        C1368i c1368iM9259c = AbstractC4855en.m9259c();
        String strM3724m = c1368iM9259c != null ? c1368iM9259c.m3724m(str, z9) : null;
        return strM3724m == null ? HttpUrl.FRAGMENT_ENCODE_SET : strM3724m;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String getChatroomName(String str) {
        return getGroupName(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final List<String> getContactByLabelId(String str) {
        C1368i c1368iM9259c;
        return (str == null || AbstractC3149m.m6721t0(str) || (c1368iM9259c = AbstractC4855en.m9259c()) == null) ? C4173t.f13710g : c1368iM9259c.m3726o(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final List<String> getContactByLabelName(String str) {
        C1368i c1368iM9259c;
        if (str == null || AbstractC3149m.m6721t0(str) || (c1368iM9259c = AbstractC4855en.m9259c()) == null) {
            return C4173t.f13710g;
        }
        if (TextUtils.isEmpty(str)) {
            return new ArrayList();
        }
        for (ContactLabelBean contactLabelBean : c1368iM9259c.m3727p()) {
            if (str.equals(contactLabelBean.getLabelName()) || str.equals(contactLabelBean.getName())) {
                ArrayList arrayListM3726o = c1368iM9259c.m3726o(contactLabelBean.getLabelId());
                return arrayListM3726o.isEmpty() ? new ArrayList(contactLabelBean.getUserNameList()) : arrayListM3726o;
            }
        }
        return new ArrayList();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final List<ContactLabelBean> getContactLabelList() {
        C1368i c1368iM9259c = AbstractC4855en.m9259c();
        return c1368iM9259c != null ? c1368iM9259c.m3727p() : C4173t.f13710g;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final List<Map<String, Object>> getContactLabelListInfo() {
        ArrayList arrayList = new ArrayList();
        for (ContactLabelBean contactLabelBean : getContactLabelList()) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("labelId", contactLabelBean.labelId);
            linkedHashMap.put("id", contactLabelBean.labelId);
            linkedHashMap.put("labelName", contactLabelBean.labelName);
            linkedHashMap.put("name", contactLabelBean.labelName);
            linkedHashMap.put("userNameList", contactLabelBean.userNameList);
            linkedHashMap.put("usernameList", contactLabelBean.userNameList);
            linkedHashMap.put("contactList", contactLabelBean.userNameList);
            arrayList.add(linkedHashMap);
        }
        return arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final WeChatDatabaseApi getDatabaseApi() {
        return WeChatApis.database();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final long getDuration(String str) {
        Object c3959f;
        Object c3959f2;
        Long lM6743g0;
        long jLongValue = 0;
        if (str == null || AbstractC3149m.m6721t0(str)) {
            return 0L;
        }
        File file = new File(str);
        if (!file.isFile()) {
            return 0L;
        }
        try {
            c3959f = Long.valueOf(getDurationCodec().getDuration(file.getAbsolutePath()));
        } catch (Throwable th2) {
            c3959f = new C3959f(th2);
        }
        if (c3959f instanceof C3959f) {
            c3959f = obj;
        }
        if (((Number) c3959f).longValue() <= 0) {
            c3959f = null;
        }
        Long l10 = (Long) c3959f;
        if (l10 != null) {
            return l10.longValue();
        }
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            mediaMetadataRetriever.setDataSource(file.getAbsolutePath());
            String strExtractMetadata = mediaMetadataRetriever.extractMetadata(9);
            if (strExtractMetadata != null && (lM6743g0 = AbstractC3156t.m6743g0(strExtractMetadata)) != null) {
                jLongValue = lM6743g0.longValue();
            }
            c3959f2 = Long.valueOf(jLongValue);
        } catch (Throwable th3) {
            c3959f2 = new C3959f(th3);
        }
        Throwable thM8182b = C3960g.m8182b(c3959f2);
        if (thM8182b != null) {
            this.bridge.log("读取音频时长失败: " + thM8182b.getMessage());
        }
        Number number = (Number) (c3959f2 instanceof C3959f ? 0L : c3959f2);
        number.longValue();
        try {
            mediaMetadataRetriever.release();
        } catch (Throwable unused) {
        }
        return number.longValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Map<String, Object> getFavorite(long j3) {
        C2097h c2097h;
        Object c3959f;
        if (j3 <= 0) {
            return null;
        }
        WeChatApis.interaction().getClass();
        C2105p c2105p = WeChatApis.mediaApi;
        if (c2105p == null || (c2097h = c2105p.f7040f) == null) {
            return null;
        }
        try {
            c3959f = c2097h.m5241i(c2097h.m5245r(j3)) != null ? favoriteItemMap(r3) : null;
        } catch (Throwable th2) {
            c3959f = new C3959f(th2);
        }
        return (Map) (c3959f instanceof C3959f ? null : c3959f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:25:0x0048 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [sf.f] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    public final List<Map<String, Object>> getFavoriteList(int i9) {
        C2097h c2097h;
        ?? c3959f;
        WeChatApis.interaction().getClass();
        C2105p c2105p = WeChatApis.mediaApi;
        C4173t c4173t = C4173t.f13710g;
        if (c2105p == null || (c2097h = c2105p.f7040f) == null) {
            return c4173t;
        }
        try {
            List listM5244q = c2097h.m5244q(AbstractC3754e0.m7909r(i9, 1, 200));
            List list = listM5244q;
            if (listM5244q == null) {
                list = c4173t;
            }
            c3959f = new ArrayList(AbstractC4167n.m8429e1(list));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                c3959f.add(favoriteItemMap((C2098i) it.next()));
            }
        } catch (Throwable th2) {
            c3959f = new C3959f(th2);
        }
        ?? r12 = c4173t;
        if (!(c3959f instanceof C3959f)) {
            r12 = c3959f;
        }
        return (List) r12;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String getFriendCity(String str) {
        String strM3715Y;
        if (str == null || AbstractC3149m.m6721t0(str)) {
            return HttpUrl.FRAGMENT_ENCODE_SET;
        }
        C1368i c1368iM9259c = AbstractC4855en.m9259c();
        if (c1368iM9259c == null) {
            strM3715Y = null;
        } else if (!TextUtils.isEmpty(str)) {
            if (c1368iM9259c.m3706L(str)) {
                strM3715Y = c1368iM9259c.m3715Y(12292);
            } else {
                WeChatContact weChatContactM3725n = c1368iM9259c.m3725n(str);
                strM3715Y = weChatContactM3725n != null ? weChatContactM3725n.city : HttpUrl.FRAGMENT_ENCODE_SET;
            }
        }
        return strM3715Y == null ? HttpUrl.FRAGMENT_ENCODE_SET : strM3715Y;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String getFriendDisplayName(String str, String str2) {
        String strM3733v;
        if (str == null || AbstractC3149m.m6721t0(str)) {
            return HttpUrl.FRAGMENT_ENCODE_SET;
        }
        if (str2 != null && !AbstractC3149m.m6721t0(str2)) {
            C1363d c1363dM5159f = AbstractC2091b.m5159f();
            if (c1363dM5159f != null) {
                C1368i c1368i = c1363dM5159f.f4517b;
                strM3733v = c1368i == null ? str : c1368i.m3733v(str2, str);
            } else {
                strM3733v = null;
            }
            C0861d c0861d = C0861d.f2640a;
            String strM2164b = C0861d.m2164b(str2, str);
            C1363d c1363dM5159f2 = AbstractC2091b.m5159f();
            String strM3676h = c1363dM5159f2 != null ? c1363dM5159f2.m3676h(str2, str) : null;
            C1368i c1368iM9259c = AbstractC4855en.m9259c();
            String strFirstNotBlank = firstNotBlank(strM3733v, strM2164b, strM3676h, c1368iM9259c != null ? c1368iM9259c.m3731t(str2, str) : null);
            if (!AbstractC3149m.m6721t0(strFirstNotBlank)) {
                return strFirstNotBlank;
            }
        }
        C1368i c1368iM9259c2 = AbstractC4855en.m9259c();
        if (c1368iM9259c2 == null) {
            return str;
        }
        WeChatContact weChatContactM3725n = c1368iM9259c2.m3725n(str);
        String str3 = weChatContactM3725n != null ? weChatContactM3725n.nickname : null;
        WeChatContact weChatContactM3725n2 = c1368iM9259c2.m3725n(str);
        return firstNotBlank(str3, weChatContactM3725n2 != null ? weChatContactM3725n2.customWxId : null, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int getFriendGender(String str) {
        C1368i c1368iM9259c;
        if (str == null || AbstractC3149m.m6721t0(str) || (c1368iM9259c = AbstractC4855en.m9259c()) == null) {
            return 0;
        }
        return c1368iM9259c.m3730s(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final List<FriendInfo> getFriendList() {
        List<WeChatContact> listRawFriendList = rawFriendList();
        ArrayList arrayList = new ArrayList(AbstractC4167n.m8429e1(listRawFriendList));
        for (WeChatContact weChatContact : listRawFriendList) {
            arrayList.add(new FriendInfo(weChatContact.wxId, weChatContact.nickname, weChatContact.remarkName, weChatContact.customWxId, weChatContact.avatarUrl, weChatContact.avatarBackupUrl, weChatContact.encryptedUsername, weChatContact.province, weChatContact.city, weChatContact.gender, weChatContact.type));
        }
        return arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final List<Map<String, Object>> getFriendListInfo() {
        ArrayList arrayList = new ArrayList();
        for (WeChatContact weChatContact : rawFriendList()) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("wxid", weChatContact.wxId);
            linkedHashMap.put("nickname", weChatContact.nickname);
            linkedHashMap.put("remarkName", weChatContact.remarkName);
            linkedHashMap.put("displayName", weChatContact.displayName());
            linkedHashMap.put("customWxId", weChatContact.customWxId);
            linkedHashMap.put("gender", Integer.valueOf(weChatContact.gender));
            linkedHashMap.put("province", weChatContact.province);
            linkedHashMap.put("city", weChatContact.city);
            linkedHashMap.put("region", weChatContact.getRegion());
            linkedHashMap.put("avatarUrl", weChatContact.avatarUrl);
            linkedHashMap.put("avatarBackupUrl", weChatContact.avatarBackupUrl);
            linkedHashMap.put("type", Integer.valueOf(weChatContact.type));
            arrayList.add(linkedHashMap);
        }
        return arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String getFriendName(String str) {
        if (str == null || AbstractC3149m.m6721t0(str)) {
            return HttpUrl.FRAGMENT_ENCODE_SET;
        }
        C1368i c1368iM9259c = AbstractC4855en.m9259c();
        WeChatContact weChatContactM3725n = c1368iM9259c != null ? c1368iM9259c.m3725n(str) : null;
        return firstNotBlank(weChatContactM3725n != null ? weChatContactM3725n.remarkName : null, weChatContactM3725n != null ? weChatContactM3725n.nickname : null, weChatContactM3725n != null ? weChatContactM3725n.customWxId : null, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String getFriendNickName(String str) {
        WeChatContact weChatContactM3725n;
        if (str == null || AbstractC3149m.m6721t0(str)) {
            return HttpUrl.FRAGMENT_ENCODE_SET;
        }
        C1368i c1368iM9259c = AbstractC4855en.m9259c();
        String str2 = (c1368iM9259c == null || (weChatContactM3725n = c1368iM9259c.m3725n(str)) == null) ? null : weChatContactM3725n.nickname;
        return str2 == null ? HttpUrl.FRAGMENT_ENCODE_SET : str2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String getFriendProvince(String str) {
        String strM3715Y;
        if (str == null || AbstractC3149m.m6721t0(str)) {
            return HttpUrl.FRAGMENT_ENCODE_SET;
        }
        C1368i c1368iM9259c = AbstractC4855en.m9259c();
        if (c1368iM9259c == null) {
            strM3715Y = null;
        } else if (!TextUtils.isEmpty(str)) {
            if (c1368iM9259c.m3706L(str)) {
                strM3715Y = c1368iM9259c.m3715Y(12293);
            } else {
                WeChatContact weChatContactM3725n = c1368iM9259c.m3725n(str);
                strM3715Y = weChatContactM3725n != null ? weChatContactM3725n.province : HttpUrl.FRAGMENT_ENCODE_SET;
            }
        }
        return strM3715Y == null ? HttpUrl.FRAGMENT_ENCODE_SET : strM3715Y;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String getFriendRegion(String str) {
        if (str == null || AbstractC3149m.m6721t0(str)) {
            return HttpUrl.FRAGMENT_ENCODE_SET;
        }
        C1368i c1368iM9259c = AbstractC4855en.m9259c();
        String strM3737z = c1368iM9259c != null ? c1368iM9259c.m3737z(str) : null;
        return strM3737z == null ? HttpUrl.FRAGMENT_ENCODE_SET : strM3737z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String getFriendRemarkName(String str) {
        WeChatContact weChatContactM3725n;
        if (str == null || AbstractC3149m.m6721t0(str)) {
            return HttpUrl.FRAGMENT_ENCODE_SET;
        }
        C1368i c1368iM9259c = AbstractC4855en.m9259c();
        String str2 = (c1368iM9259c == null || (weChatContactM3725n = c1368iM9259c.m3725n(str)) == null) ? null : weChatContactM3725n.remarkName;
        return str2 == null ? HttpUrl.FRAGMENT_ENCODE_SET : str2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final List<GroupInfo> getGroupList() {
        Map<String, WeChatContact> mapRawGroupContactMap = rawGroupContactMap();
        List<WeChatChatroom> listRawGroupList = rawGroupList();
        ArrayList arrayList = new ArrayList(AbstractC4167n.m8429e1(listRawGroupList));
        for (WeChatChatroom weChatChatroom : listRawGroupList) {
            WeChatContact weChatContact = mapRawGroupContactMap.get(weChatChatroom.chatroomId);
            String strFirstNotBlank = firstNotBlank(weChatChatroom.name, weChatContact != null ? weChatContact.nickname : null, weChatChatroom.chatroomId);
            String str = weChatChatroom.chatroomId;
            String strFirstNotBlank2 = firstNotBlank(weChatContact != null ? weChatContact.nickname : null, strFirstNotBlank);
            String str2 = weChatContact != null ? weChatContact.remarkName : null;
            if (str2 == null) {
                str2 = HttpUrl.FRAGMENT_ENCODE_SET;
            }
            arrayList.add(new GroupInfo(str, strFirstNotBlank, strFirstNotBlank2, str2, weChatChatroom.owner, weChatChatroom.memberIds, weChatChatroom.rawDisplayNames));
        }
        return arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final List<Map<String, Object>> getGroupListInfo() {
        ArrayList arrayList = new ArrayList();
        Map<String, WeChatContact> mapRawGroupContactMap = rawGroupContactMap();
        for (WeChatChatroom weChatChatroom : rawGroupList()) {
            WeChatContact weChatContact = mapRawGroupContactMap.get(weChatChatroom.chatroomId);
            String str = null;
            String strFirstNotBlank = firstNotBlank(weChatChatroom.name, weChatContact != null ? weChatContact.nickname : null, weChatChatroom.chatroomId);
            String str2 = weChatContact != null ? weChatContact.remarkName : null;
            if (str2 == null) {
                str2 = HttpUrl.FRAGMENT_ENCODE_SET;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("roomId", weChatChatroom.chatroomId);
            linkedHashMap.put("name", strFirstNotBlank);
            if (weChatContact != null) {
                str = weChatContact.nickname;
            }
            linkedHashMap.put("nickname", firstNotBlank(str, strFirstNotBlank));
            linkedHashMap.put("remarkName", str2);
            linkedHashMap.put("displayName", groupDisplayName(weChatChatroom.chatroomId, strFirstNotBlank, str2));
            linkedHashMap.put("owner", weChatChatroom.owner);
            linkedHashMap.put("memberCount", Integer.valueOf(weChatChatroom.memberCount()));
            linkedHashMap.put("memberList", weChatChatroom.memberIds);
            linkedHashMap.put("rawDisplayNames", weChatChatroom.rawDisplayNames);
            arrayList.add(linkedHashMap);
        }
        return arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String getGroupMemberCity(String str, String str2) {
        return (str == null || AbstractC3149m.m6721t0(str) || str2 == null || AbstractC3149m.m6721t0(str2)) ? HttpUrl.FRAGMENT_ENCODE_SET : getFriendCity(str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int getGroupMemberCount(String str) {
        if (str == null || AbstractC3149m.m6721t0(str)) {
            return 0;
        }
        C1363d c1363dM5159f = AbstractC2091b.m5159f();
        return c1363dM5159f != null ? c1363dM5159f.m3677i(str).size() : getGroupMemberList(str).size();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int getGroupMemberGender(String str, String str2) {
        if (str == null || AbstractC3149m.m6721t0(str) || str2 == null || AbstractC3149m.m6721t0(str2)) {
            return 0;
        }
        return getFriendGender(str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final List<String> getGroupMemberList(String str) {
        return (str == null || AbstractC3149m.m6721t0(str)) ? C4173t.f13710g : readGroupMemberIds(str, true);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0089  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List<Map<String, Object>> getGroupMemberListInfo(String str) {
        Map linkedHashMap;
        String strM2164b;
        if (str == null || AbstractC3149m.m6721t0(str)) {
            return C4173t.f13710g;
        }
        ArrayList arrayList = new ArrayList();
        C1368i c1368iM9259c = AbstractC4855en.m9259c();
        C1363d c1363dM5159f = AbstractC2091b.m5159f();
        List<String> groupMemberIds = readGroupMemberIds(str, true);
        if (!groupMemberIds.isEmpty()) {
            if (c1368iM9259c != null) {
                linkedHashMap = new LinkedHashMap();
                if (C1368i.m3686I(str)) {
                    for (String str2 : c1368iM9259c.m3732u(str)) {
                        linkedHashMap.put(str2, c1368iM9259c.m3731t(str, str2));
                    }
                }
            } else {
                linkedHashMap = null;
            }
            Map map = C4174u.f13711g;
            if (linkedHashMap == null) {
                linkedHashMap = map;
            }
            LinkedHashMap linkedHashMapM3734w = c1368iM9259c != null ? c1368iM9259c.m3734w(str) : null;
            if (linkedHashMapM3734w != null) {
                map = linkedHashMapM3734w;
            }
            for (String str3 : groupMemberIds) {
                WeChatContact weChatContactM3725n = c1368iM9259c != null ? c1368iM9259c.m3725n(str3) : null;
                boolean zContainsKey = map.containsKey(str3);
                String str4 = HttpUrl.FRAGMENT_ENCODE_SET;
                if (zContainsKey) {
                    strM2164b = (String) map.get(str3);
                    if (strM2164b == null) {
                        strM2164b = HttpUrl.FRAGMENT_ENCODE_SET;
                    }
                } else {
                    C0861d c0861d = C0861d.f2640a;
                    strM2164b = C0861d.m2164b(str, str3);
                    if (strM2164b == null) {
                    }
                }
                String strFirstNotBlank = firstNotBlank(strM2164b, (String) linkedHashMap.get(str3), c1363dM5159f != null ? c1363dM5159f.m3676h(str, str3) : null, c1368iM9259c != null ? c1368iM9259c.m3731t(str, str3) : null);
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                linkedHashMap2.put("wxid", str3);
                linkedHashMap2.put("displayName", firstNotBlank(strFirstNotBlank, weChatContactM3725n != null ? weChatContactM3725n.displayName() : null, str3));
                linkedHashMap2.put("groupNick", strFirstNotBlank);
                linkedHashMap2.put("groupNickName", strFirstNotBlank);
                linkedHashMap2.put("rawGroupNickName", strM2164b);
                String str5 = weChatContactM3725n != null ? weChatContactM3725n.nickname : null;
                if (str5 == null) {
                    str5 = HttpUrl.FRAGMENT_ENCODE_SET;
                }
                linkedHashMap2.put("nickname", str5);
                String str6 = weChatContactM3725n != null ? weChatContactM3725n.remarkName : null;
                if (str6 == null) {
                    str6 = HttpUrl.FRAGMENT_ENCODE_SET;
                }
                linkedHashMap2.put("remarkName", str6);
                String str7 = weChatContactM3725n != null ? weChatContactM3725n.customWxId : null;
                if (str7 == null) {
                    str7 = HttpUrl.FRAGMENT_ENCODE_SET;
                }
                linkedHashMap2.put("customWxId", str7);
                linkedHashMap2.put("gender", Integer.valueOf(weChatContactM3725n != null ? weChatContactM3725n.gender : 0));
                String str8 = weChatContactM3725n != null ? weChatContactM3725n.province : null;
                if (str8 == null) {
                    str8 = HttpUrl.FRAGMENT_ENCODE_SET;
                }
                linkedHashMap2.put("province", str8);
                String str9 = weChatContactM3725n != null ? weChatContactM3725n.city : null;
                if (str9 == null) {
                    str9 = HttpUrl.FRAGMENT_ENCODE_SET;
                }
                linkedHashMap2.put("city", str9);
                String region = weChatContactM3725n != null ? weChatContactM3725n.getRegion() : null;
                if (region == null) {
                    region = HttpUrl.FRAGMENT_ENCODE_SET;
                }
                linkedHashMap2.put("region", region);
                String str10 = weChatContactM3725n != null ? weChatContactM3725n.avatarUrl : null;
                if (str10 != null) {
                    str4 = str10;
                }
                linkedHashMap2.put("avatarUrl", str4);
                arrayList.add(linkedHashMap2);
            }
        }
        return arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String getGroupMemberName(String str, String str2) {
        String strM3733v;
        if (str == null || AbstractC3149m.m6721t0(str) || str2 == null || AbstractC3149m.m6721t0(str2)) {
            return HttpUrl.FRAGMENT_ENCODE_SET;
        }
        C1363d c1363dM5159f = AbstractC2091b.m5159f();
        if (c1363dM5159f != null) {
            C1368i c1368i = c1363dM5159f.f4517b;
            strM3733v = c1368i == null ? str2 : c1368i.m3733v(str, str2);
        } else {
            strM3733v = null;
        }
        C0861d c0861d = C0861d.f2640a;
        String strM2164b = C0861d.m2164b(str, str2);
        C1363d c1363dM5159f2 = AbstractC2091b.m5159f();
        String strM3676h = c1363dM5159f2 != null ? c1363dM5159f2.m3676h(str, str2) : null;
        C1368i c1368iM9259c = AbstractC4855en.m9259c();
        return firstNotBlank(strM3733v, strM2164b, strM3676h, c1368iM9259c != null ? c1368iM9259c.m3731t(str, str2) : null, getFriendName(str2), str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String getGroupMemberProvince(String str, String str2) {
        return (str == null || AbstractC3149m.m6721t0(str) || str2 == null || AbstractC3149m.m6721t0(str2)) ? HttpUrl.FRAGMENT_ENCODE_SET : getFriendProvince(str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String getGroupMemberRegion(String str, String str2) {
        return (str == null || AbstractC3149m.m6721t0(str) || str2 == null || AbstractC3149m.m6721t0(str2)) ? HttpUrl.FRAGMENT_ENCODE_SET : getFriendRegion(str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String getGroupName(String str) {
        if (str == null || AbstractC3149m.m6721t0(str)) {
            return HttpUrl.FRAGMENT_ENCODE_SET;
        }
        C1363d c1363dM5159f = AbstractC2091b.m5159f();
        String strM3674f = c1363dM5159f != null ? c1363dM5159f.m3674f(str) : null;
        C1368i c1368iM9259c = AbstractC4855en.m9259c();
        return firstNotBlank(strM3674f, c1368iM9259c != null ? c1368iM9259c.m3729r(str) : null, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String getGroupNickName(String str, String str2) {
        if (str == null || AbstractC3149m.m6721t0(str) || str2 == null || AbstractC3149m.m6721t0(str2)) {
            return HttpUrl.FRAGMENT_ENCODE_SET;
        }
        C1368i c1368iM9259c = AbstractC4855en.m9259c();
        Map mapM3734w = c1368iM9259c != null ? c1368iM9259c.m3734w(str) : null;
        if (mapM3734w == null) {
            mapM3734w = C4174u.f13711g;
        }
        if (mapM3734w.containsKey(str2)) {
            String str3 = (String) mapM3734w.get(str2);
            return str3 == null ? HttpUrl.FRAGMENT_ENCODE_SET : str3;
        }
        C0861d c0861d = C0861d.f2640a;
        String strM2164b = C0861d.m2164b(str, str2);
        return strM2164b == null ? HttpUrl.FRAGMENT_ENCODE_SET : strM2164b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String getGroupRemarkName(String str) {
        WeChatContact weChatContactM3725n;
        if (str == null || AbstractC3149m.m6721t0(str)) {
            return HttpUrl.FRAGMENT_ENCODE_SET;
        }
        C1368i c1368iM9259c = AbstractC4855en.m9259c();
        String str2 = (c1368iM9259c == null || (weChatContactM3725n = c1368iM9259c.m3725n(str)) == null) ? null : weChatContactM3725n.remarkName;
        return str2 == null ? HttpUrl.FRAGMENT_ENCODE_SET : str2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String getLoginAlias() {
        WeChatApis.contact().getClass();
        C1360a c1360a = WeChatApis.accountApi;
        String strM3651b = c1360a != null ? c1360a.m3651b(42) : null;
        if (strM3651b == null) {
            strM3651b = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        return AbstractC3149m.m6721t0(strM3651b) ? getLoginWxid() : strM3651b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String getLoginWxid() {
        int i9 = 0;
        while (true) {
            String str = HttpUrl.FRAGMENT_ENCODE_SET;
            if (i9 >= 5) {
                return HttpUrl.FRAGMENT_ENCODE_SET;
            }
            int iIntValue = Integer.valueOf(i9).intValue();
            WeChatApis.contact().getClass();
            C1360a c1360a = WeChatApis.accountApi;
            String strM3652c = c1360a != null ? c1360a.m3652c() : null;
            if (strM3652c != null) {
                str = strM3652c;
            }
            String string = AbstractC3149m.m6703R0(str).toString();
            if (string.length() > 0) {
                return string;
            }
            waitForContactData(iIntValue);
            i9++;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final List<WeChatContact> getOfficialList() {
        C1368i c1368iM9259c = AbstractC4855en.m9259c();
        return c1368iM9259c != null ? c1368iM9259c.m3713U("SELECT r.username, r.alias, r.conRemark, r.nickname, r.encryptUsername, r.type, r.lvbuff AS lvbuff, i.reserved1 AS avatarUrl, i.reserved2 AS avatarBackupUrl FROM rcontact r LEFT JOIN img_flag i ON r.username = i.username WHERE r.username LIKE 'gh\\_%' ESCAPE '\\' OR (r.verifyFlag IS NOT NULL AND r.verifyFlag!=0)", null) : C4173t.f13710g;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final WeChatSnsPost getSnsPost(String str) {
        C3356h c3356hM7075g;
        C3351d0 c3351d0M1028q = AbstractC0255e.m1028q();
        if (c3351d0M1028q != null) {
            if (str == null) {
                str = HttpUrl.FRAGMENT_ENCODE_SET;
            }
            String string = AbstractC3149m.m6703R0(str).toString();
            if (string.length() != 0 && (c3356hM7075g = c3351d0M1028q.m7075g()) != null) {
                Object obj = c3356hM7075g.m7102g(string).f10806b;
                C3355g c3355gM7100j = obj != null ? C3356h.m7100j(obj, null) : null;
                if (c3355gM7100j != null) {
                    return c3351d0M1028q.m7081o(c3355gM7100j);
                }
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final List<WeChatSnsPost> getSnsPostList(String str, int i9) {
        C3351d0 c3351d0M1028q = AbstractC0255e.m1028q();
        List list = C4173t.f13710g;
        if (c3351d0M1028q != null) {
            if (str == null) {
                str = HttpUrl.FRAGMENT_ENCODE_SET;
            }
            String string = AbstractC3149m.m6703R0(str).toString();
            if (string.length() != 0 && i9 > 0) {
                C3356h c3356hM7075g = c3351d0M1028q.m7075g();
                List listM7103h = c3356hM7075g != null ? c3356hM7075g.m7103h(string, i9, string.equals(c3351d0M1028q.f10786f.m3652c())) : null;
                if (listM7103h != null) {
                    list = listM7103h;
                }
                ArrayList arrayList = new ArrayList();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    WeChatSnsPost weChatSnsPostM7081o = c3351d0M1028q.m7081o((C3355g) it.next());
                    if (weChatSnsPostM7081o != null) {
                        arrayList.add(weChatSnsPostM7081o);
                    }
                }
                return AbstractC4166m.m8403L1(i9, AbstractC4166m.m8402K1(arrayList, new C0031h(26)));
            }
        }
        return list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String getTargetTalker() {
        Intent intent;
        String string;
        String strM7258a;
        WeChatApis.interaction().getClass();
        C3458m c3458m = WeChatApis.chatPageApi;
        String str = null;
        if (c3458m != null && (strM7258a = c3458m.m7258a()) != null) {
            if (!Boolean.valueOf(!AbstractC3149m.m6721t0(strM7258a)).booleanValue()) {
                strM7258a = null;
            }
            if (strM7258a != null) {
                return strM7258a;
            }
        }
        Activity topActivity = getTopActivity();
        if (topActivity == null || (intent = topActivity.getIntent()) == null) {
            return HttpUrl.FRAGMENT_ENCODE_SET;
        }
        Iterator it = AbstractC0000a.m101y0("Chat_User", "Chat_UserName", "Contact_User", "Contact_Username").iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            String stringExtra = intent.getStringExtra((String) it.next());
            if (stringExtra == null || (string = AbstractC3149m.m6703R0(stringExtra).toString()) == null || !Boolean.valueOf(!AbstractC3149m.m6721t0(string)).booleanValue()) {
                string = null;
            }
            if (string != null) {
                str = string;
                break;
            }
        }
        return str == null ? HttpUrl.FRAGMENT_ENCODE_SET : str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Activity getTopActivity() {
        C3460o c3460oCurrentActivity = WeChatApis.currentActivity();
        if (c3460oCurrentActivity != null) {
            return c3460oCurrentActivity.m7263a();
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int getUnreadCount(String str) {
        String string = str != null ? AbstractC3149m.m6703R0(str).toString() : null;
        if (string == null) {
            string = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        if (string.length() != 0) {
            WeChatApis.message().getClass();
            C1624a c1624a = WeChatApis.conversationApi;
            if (c1624a != null && !TextUtils.isEmpty(string)) {
                try {
                    return Integer.parseInt(c1624a.f5317a.queryFirstString("SELECT unReadCount FROM rconversation WHERE username=? LIMIT 1", new String[]{string}, "unReadCount"));
                } catch (Throwable unused) {
                }
            }
        }
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final long insertSystemMsg(String str, String str2, long j3) {
        Object c3959f;
        try {
            WeChatApis.message().getClass();
            C2341e c2341e = WeChatApis.localMessageApi;
            c3959f = Long.valueOf(c2341e != null ? c2341e.m5572e(str, str2, j3, true) : 0L);
        } catch (Throwable th2) {
            c3959f = new C3959f(th2);
        }
        if (c3959f instanceof C3959f) {
            c3959f = 0L;
        }
        return ((Number) c3959f).longValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean inviteChatroomMember(String str, String str2) {
        C1363d c1363dM5159f;
        if (str != null && !AbstractC3149m.m6721t0(str) && str2 != null && !AbstractC3149m.m6721t0(str2) && (c1363dM5159f = AbstractC2091b.m5159f()) != null) {
            if (TextUtils.isEmpty(str2) ? false : c1363dM5159f.m3681m(str, Collections.singletonList(str2))) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean modifyContactLabelList(String str, String str2) {
        C1368i c1368iM9259c;
        return (str == null || AbstractC3149m.m6721t0(str) || (c1368iM9259c = AbstractC4855en.m9259c()) == null || !c1368iM9259c.m3708O(str, str2)) ? false : true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void notify(String str, String str2) {
        PendingIntent activities;
        WeChatApis.interaction().getClass();
        C3463r c3463r = WeChatApis.notifyApi;
        if (c3463r != null) {
            if (str == null) {
                str = HttpUrl.FRAGMENT_ENCODE_SET;
            }
            if (str2 == null) {
                str2 = HttpUrl.FRAGMENT_ENCODE_SET;
            }
            Context context = c3463r.f11231a;
            try {
                NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
                if (notificationManager == null) {
                    return;
                }
                notificationManager.createNotificationChannel(new NotificationChannel("Hchat_wechat_api_notify_high", "Hchat 通知", 4));
                int i9 = context.getApplicationInfo().icon;
                if (i9 == 0) {
                    i9 = R.drawable.ic_dialog_info;
                }
                Notification.Builder builder = new Notification.Builder(context, "Hchat_wechat_api_notify_high");
                builder.setSmallIcon(i9).setContentTitle(str).setContentText(str2).setTicker(str2).setWhen(System.currentTimeMillis()).setShowWhen(true).setAutoCancel(true).setPriority(1).setDefaults(-1);
                Intent[] intentArrM7266a = c3463r.m7266a(null);
                if (intentArrM7266a == null || intentArrM7266a.length == 0) {
                    activities = null;
                } else {
                    if (!TextUtils.isEmpty(null) || !TextUtils.isEmpty(null)) {
                        throw null;
                    }
                    activities = PendingIntent.getActivities(context, (int) ((((System.currentTimeMillis() & 1048575) << 1) | 1308622848 | ((long) 0)) & 2147483647L), intentArrM7266a, 201326592);
                }
                if (activities != null) {
                    builder.setContentIntent(activities);
                }
                Bitmap bitmapM1949f = AbstractC0754o.m1949f(context, null);
                if (bitmapM1949f != null) {
                    builder.setLargeIcon(bitmapM1949f);
                }
                if (!TextUtils.isEmpty(null)) {
                    throw null;
                }
                notificationManager.notify((int) ((((System.currentTimeMillis() & WebSocketProtocol.PAYLOAD_SHORT_MAX) << 4) | 1291845632 | (((long) 0) & 15)) & 2147483647L), builder.build());
            } catch (Throwable th2) {
                c3463r.m7267b("通知失败: " + th2.getMessage());
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void post(String str, Map<?, ?> map, Map<?, ?> map2, long j3, Consumer<String> consumer) {
        async(new C0889q0(consumer, this, str, map, map2, j3));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final boolean publishSnsPost(Object obj) {
        boolean zM7087u;
        WeChatSnsLivePhoto weChatSnsLivePhoto;
        C3351d0 c3351d0M1028q = AbstractC0255e.m1028q();
        if (c3351d0M1028q != null) {
            WeChatSnsPrepareResult weChatSnsPrepareResult = obj instanceof WeChatSnsPrepareResult ? (WeChatSnsPrepareResult) obj : null;
            if (weChatSnsPrepareResult != null && weChatSnsPrepareResult.isSuccess()) {
                String type = weChatSnsPrepareResult.getType();
                switch (type.hashCode()) {
                    case 3556653:
                        zM7087u = !type.equals(WeChatSnsPost.TYPE_TEXT) ? false : c3351d0M1028q.m7087u(weChatSnsPrepareResult.getContent(), HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET);
                        break;
                    case 100313435:
                        zM7087u = !type.equals(WeChatSnsPost.TYPE_IMAGE) ? false : c3351d0M1028q.m7090x(weChatSnsPrepareResult.getContent(), weChatSnsPrepareResult.getImagePathList(), HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET);
                        break;
                    case 112202875:
                        zM7087u = !type.equals(WeChatSnsPost.TYPE_VIDEO) ? false : c3351d0M1028q.m7091y(weChatSnsPrepareResult.getContent(), weChatSnsPrepareResult.getVideoPath(), HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET);
                        break;
                    case 1210380575:
                        zM7087u = (!type.equals(WeChatSnsPost.TYPE_LIVE_PHOTO) || (weChatSnsLivePhoto = (WeChatSnsLivePhoto) AbstractC4166m.m8400I1(weChatSnsPrepareResult.getLivePhotoList())) == null) ? false : c3351d0M1028q.m7089w(new JSONObject().put("content", weChatSnsPrepareResult.getContent()).put("imagePath", weChatSnsLivePhoto.getImagePath()).put("videoPath", weChatSnsLivePhoto.getVideoPath()).put("coverTimeMs", weChatSnsLivePhoto.getCoverTimeMillis()));
                        break;
                    default:
                        zM7087u = false;
                        break;
                }
            } else {
                zM7087u = false;
            }
            if (zM7087u) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List<MsgInfoBean> queryHistoryMsg(String str, long j3, int i9) {
        ArrayList<WeChatMessage> arrayListM5668l;
        if (str != null && !AbstractC3149m.m6721t0(str)) {
            WeChatApis.message().getClass();
            C2355s c2355s = WeChatApis.messageStoreApi;
            if (c2355s != null) {
                if (TextUtils.isEmpty(str)) {
                    arrayListM5668l = new ArrayList();
                } else if (j3 <= 0) {
                    arrayListM5668l = c2355s.m5664f(i9, str);
                } else if (TextUtils.isEmpty(str)) {
                    arrayListM5668l = new ArrayList();
                } else {
                    int iMax = Math.max(1, Math.min(200, i9));
                    String strM5669m = c2355s.m5669m(TextUtils.isEmpty(str) ? HttpUrl.FRAGMENT_ENCODE_SET : c2355s.f7738a.messageTableForTalker(str));
                    if (!TextUtils.isEmpty(strM5669m)) {
                        ArrayList arrayListM5668l2 = c2355s.m5668l(AbstractC0921a.m2251n("SELECT msgId, msgSvrId, type, status, isSend, createTime, talker, content, imgPath, reserved, transContent, flag FROM ", strM5669m, " WHERE createTime>? ORDER BY createTime ASC, msgId ASC LIMIT ?"), new String[]{String.valueOf(j3), String.valueOf(iMax)});
                        arrayListM5668l = !arrayListM5668l2.isEmpty() ? arrayListM5668l2 : c2355s.m5668l("SELECT msgId, msgSvrId, type, status, isSend, createTime, talker, content, imgPath, reserved, transContent, flag FROM message WHERE talker=? AND createTime>? ORDER BY createTime ASC, msgId ASC LIMIT ?", new String[]{str, String.valueOf(j3), String.valueOf(iMax)});
                    }
                }
                ArrayList arrayList = new ArrayList(AbstractC4167n.m8429e1(arrayListM5668l));
                for (WeChatMessage weChatMessage : arrayListM5668l) {
                    weChatMessage.getClass();
                    arrayList.add(new ScriptMessageBean(weChatMessage));
                }
                return arrayList;
            }
        }
        return C4173t.f13710g;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean refreshSnsTimeline() {
        C3351d0 c3351d0M1028q = AbstractC0255e.m1028q();
        return c3351d0M1028q != null && c3351d0M1028q.m7085s();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:37:0x008a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean revokeMsg(long j3) {
        C2343g c2343gM6844q;
        WeChatMessage weChatMessageM5663e;
        if (j3 > 0 && (c2343gM6844q = AbstractC3199a.m6844q()) != null) {
            DexFinder dexFinder = c2343gM6844q.f7686a;
            C2355s c2355s = c2343gM6844q.f7690e;
            if (j3 <= 0) {
                c2343gM6844q.m5595o("撤回消息失败: msgId无效");
                return false;
            }
            if (!c2355s.m5665h()) {
                c2343gM6844q.m5595o("撤回消息失败: messageStore未就绪");
                return false;
            }
            if (dexFinder.revokeMsgCtor != null) {
                WeChatMessage weChatMessageM5661c = c2355s.m5661c(j3);
                if (weChatMessageM5661c == null) {
                    weChatMessageM5661c = c2355s.m5662d(j3);
                }
                if (weChatMessageM5661c == null) {
                    c2343gM6844q.m5595o("撤回消息失败: 未找到消息 msgId/msgSvrId=" + j3);
                    return false;
                }
                int i9 = weChatMessageM5661c.isSend;
                long j4 = weChatMessageM5661c.msgId;
                if (i9 != 1) {
                    c2343gM6844q.m5595o("撤回消息失败: 只能撤回自己发送的消息 msgId=" + j4);
                    return false;
                }
                if (WeChatApis.database() != null) {
                    WeChatApis.database().messageTableForTalker(weChatMessageM5661c.talker);
                }
                Object obj = null;
                Object objNativeMessageById = WeChatApis.database() != null ? WeChatApis.database().nativeMessageById(j4) : null;
                if (objNativeMessageById == null) {
                    if (WeChatApis.database() != null) {
                        objNativeMessageById = WeChatApis.database().nativeMessageById(weChatMessageM5661c.msgId);
                        if (objNativeMessageById == null) {
                            long j5 = weChatMessageM5661c.msgSvrId;
                            if (j5 <= 0 || (weChatMessageM5663e = c2355s.m5663e(j5, weChatMessageM5661c.talker)) == null) {
                                objNativeMessageById = null;
                            } else {
                                long j10 = weChatMessageM5663e.msgId;
                                if (j10 <= 0 || j10 == weChatMessageM5661c.msgId || (objNativeMessageById = WeChatApis.database().nativeMessageById(weChatMessageM5663e.msgId)) == null) {
                                }
                            }
                        }
                    }
                }
                if (objNativeMessageById == null) {
                    Constructor<?> constructor = dexFinder.localMessageCtor;
                    if (constructor != null) {
                        try {
                            int length = constructor.getParameterTypes().length;
                            Constructor<?> constructor2 = dexFinder.localMessageCtor;
                            Object objNewInstance = length == 0 ? KavaReflector.newInstance(constructor2, new Object[0]) : KavaReflector.newInstance(constructor2, weChatMessageM5661c.talker);
                            if (objNewInstance != null) {
                                C2343g.m5577B(objNewInstance, Long.valueOf(weChatMessageM5661c.msgId), "field_msgId", "msgId");
                                C2343g.m5577B(objNewInstance, Long.valueOf(weChatMessageM5661c.msgSvrId), "field_msgSvrId", "msgSvrId");
                                C2343g.m5577B(objNewInstance, Integer.valueOf(weChatMessageM5661c.type), "field_type", "type");
                                C2343g.m5577B(objNewInstance, Integer.valueOf(weChatMessageM5661c.status), "field_status", "status");
                                C2343g.m5577B(objNewInstance, Integer.valueOf(weChatMessageM5661c.isSend), "field_isSend", "isSend");
                                C2343g.m5577B(objNewInstance, Long.valueOf(weChatMessageM5661c.createTime), "field_createTime", "createTime");
                                C2343g.m5577B(objNewInstance, weChatMessageM5661c.talker, "field_talker", "talker");
                                C2343g.m5577B(objNewInstance, weChatMessageM5661c.content, "field_content", "content");
                                C2343g.m5577B(objNewInstance, weChatMessageM5661c.imagePath, "field_imgPath", "imgPath");
                                C2343g.m5577B(objNewInstance, weChatMessageM5661c.reserved, "field_reserved", "reserved");
                                C2343g.m5577B(objNewInstance, weChatMessageM5661c.translatedContent, "field_transContent", "transContent");
                                C2343g.m5577B(objNewInstance, Integer.valueOf(weChatMessageM5661c.flag), "field_flag", "flag");
                                C2343g.m5577B(objNewInstance, weChatMessageM5661c.msgSource, "field_msgSource", "msgSource");
                                obj = objNewInstance;
                            }
                        } catch (Throwable unused) {
                        }
                    }
                    objNativeMessageById = obj;
                }
                if (objNativeMessageById != null) {
                    return c2343gM6844q.m5597s(objNativeMessageById);
                }
                StringBuilder sbM6842o = AbstractC3199a.m6842o(j4, "撤回消息失败: 原生消息对象为空 msgId=", " msgSvrId=");
                sbM6842o.append(weChatMessageM5661c.msgSvrId);
                c2343gM6844q.m5595o(sbM6842o.toString());
                return false;
            }
            c2343gM6844q.m5595o("撤回消息失败: API未就绪");
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean sendAppBrandMsg(String str, String str2, String str3, String str4) {
        return shareMiniProgram(str, str2, HttpUrl.FRAGMENT_ENCODE_SET, str4, str3, null, HttpUrl.FRAGMENT_ENCODE_SET);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean sendEmoji(String str, String str2) {
        return sendMedia(new C0868g(5, str, str2));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean sendFavorite(String str, String str2) {
        if (str == null || AbstractC3149m.m6721t0(str) || str2 == null || AbstractC3149m.m6721t0(str2)) {
            return false;
        }
        return sendMedia(new C0868g(7, str, str2));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean sendFile(String str, String str2) {
        return sendMedia(new C0868g(6, str, str2));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean sendImage(String str, String str2) {
        return sendMedia(new C0868g(3, str, str2));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean sendLocation(String str, String str2, String str3, String str4, String str5, String str6) {
        C2343g c2343gM6844q;
        if (str != null && !AbstractC3149m.m6721t0(str) && str4 != null && !AbstractC3149m.m6721t0(str4) && str5 != null && !AbstractC3149m.m6721t0(str5) && (c2343gM6844q = AbstractC3199a.m6844q()) != null) {
            if (str2 == null) {
                str2 = HttpUrl.FRAGMENT_ENCODE_SET;
            }
            if (str3 == null) {
                str3 = HttpUrl.FRAGMENT_ENCODE_SET;
            }
            if (str6 == null) {
                str6 = HttpUrl.FRAGMENT_ENCODE_SET;
            }
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str4) && !TextUtils.isEmpty(str5)) {
                String str7 = "<msg><location x=\"" + C2343g.m5582g(str4) + "\" y=\"" + C2343g.m5582g(str5) + "\" scale=\"" + C2343g.m5582g(TextUtils.isEmpty(str6) ? "16" : str6.trim()) + "\" label=\"" + C2343g.m5582g(str3) + "\" poiname=\"" + C2343g.m5582g(str2) + "\" infourl=\"\" maptype=\"0\" poiid=\"\" isFromPoiList=\"false\" poiCategoryTips=\"\" poiBusinessHour=\"\" poiPhone=\"\" poiPriceTips=\"0.0\" buildingId=\"\" floorName=\"\" /></msg>";
                if (!TextUtils.isEmpty(str7)) {
                    return c2343gM6844q.m5599v(48, str, str7);
                }
                c2343gM6844q.m5595o("发送位置失败: XML构造失败");
                return false;
            }
            c2343gM6844q.m5595o("发送位置失败: talker/经纬度为空");
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean sendMediaMsg(String str, Object obj, String str2) {
        if (str == null || AbstractC3149m.m6721t0(str) || obj == null) {
            return false;
        }
        return sendMedia(new C0153s(str, obj, str2, 6));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean sendOriginalImage(String str, String str2) {
        return sendMedia(new C0868g(2, str, str2));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean sendPat(String str, String str2) {
        C2343g c2343gM6844q;
        boolean z9;
        Object objM5592k;
        Object objM5592k2;
        if (str == null || AbstractC3149m.m6721t0(str) || str2 == null || AbstractC3149m.m6721t0(str2) || (c2343gM6844q = AbstractC3199a.m6844q()) == null) {
            return false;
        }
        C2815c c2815c = c2343gM6844q.f7687b;
        DexFinder dexFinder = c2343gM6844q.f7686a;
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            c2343gM6844q.m5595o("发送拍一拍失败: talker/pattedUser 为空");
            return false;
        }
        if (dexFinder.serviceGetterMethod == null || dexFinder.patCreatePairMethod == null || dexFinder.patSuffixMethod == null || dexFinder.sendPatSceneCtor == null) {
            c2343gM6844q.m5595o("发送拍一拍失败: API 未就绪");
            return false;
        }
        String strM3652c = c2343gM6844q.f7688c.m3652c();
        c2343gM6844q.m5593l();
        try {
            if (dexFinder.serviceGetterMethod == null) {
                objM5592k = null;
            } else {
                Method method = dexFinder.patCreatePairMethod;
                objM5592k = c2343gM6844q.m5592k(method != null ? method.getDeclaringClass() : dexFinder.patExtensionClass);
                if (objM5592k == null) {
                    Class<?> cls = dexFinder.patExtensionClass;
                    for (Class<?> cls2 : cls != null ? cls.getInterfaces() : new Class[0]) {
                        objM5592k2 = c2343gM6844q.m5592k(cls2);
                        if (objM5592k2 != null) {
                            break;
                        }
                    }
                    objM5592k = c2343gM6844q.m5592k(dexFinder.patExtensionClass);
                }
            }
            objM5592k2 = objM5592k;
        } catch (Throwable th2) {
            th = th2;
            z9 = false;
        }
        if (objM5592k2 == null) {
            c2343gM6844q.m5595o("发送拍一拍失败: 拍一拍服务为空");
            return false;
        }
        Method method2 = dexFinder.patCanSendMethod;
        if (method2 != null) {
            Object objInvoke = KavaReflector.invoke(method2, objM5592k2, 0, str, str2);
            if ((objInvoke instanceof Boolean) && !((Boolean) objInvoke).booleanValue()) {
                c2343gM6844q.m5595o("发送拍一拍失败: 微信原生校验不允许 talker=" + str + " pattedUser=" + str2);
                return false;
            }
        }
        Object objInvoke2 = KavaReflector.invoke(dexFinder.patSuffixMethod, objM5592k2, str2, str);
        boolean z10 = objInvoke2 instanceof String;
        String strM5584i = HttpUrl.FRAGMENT_ENCODE_SET;
        String str3 = z10 ? (String) objInvoke2 : HttpUrl.FRAGMENT_ENCODE_SET;
        int iCurrentTimeMillis = (int) (System.currentTimeMillis() / 1000);
        if (dexFinder.sendPatSceneCtor == null) {
            z9 = false;
        } else {
            z9 = false;
            try {
                strM5584i = C2343g.m5584i(KavaReflector.newInstance(dexFinder.sendPatSceneCtor, Pair.create(0L, 0L), str, str2, 0), str, str2, 4, Collections.newSetFromMap(new IdentityHashMap()));
            } catch (Throwable unused) {
            }
        }
        try {
            if (!TextUtils.isEmpty(strM5584i)) {
                strM3652c = strM5584i;
            }
            if (TextUtils.isEmpty(strM3652c)) {
                c2343gM6844q.m5595o("发送拍一拍失败: 自身wxid为空");
            } else {
                Object objInvoke3 = KavaReflector.invoke(dexFinder.patCreatePairMethod, objM5592k2, str, strM3652c, str2, str3, Integer.valueOf(iCurrentTimeMillis), 0L);
                if (objInvoke3 instanceof Pair) {
                    Pair pair = (Pair) objInvoke3;
                    Object obj = pair.first;
                    if ((obj instanceof Number) && ((Number) obj).longValue() > 0) {
                        boolean zM6216j = c2815c.m6216j(KavaReflector.newInstance(dexFinder.sendPatSceneCtor, pair, str, str2, 0));
                        if (!zM6216j) {
                            c2343gM6844q.m5595o("发送拍一拍失败: 网络入队失败 msgId=" + pair.first + " createTime=" + pair.second + " talker=" + str + " pattedUser=" + str2);
                        }
                        return zM6216j;
                    }
                    c2343gM6844q.m5595o("发送拍一拍失败: 本地消息插入失败");
                } else {
                    c2343gM6844q.m5595o("发送拍一拍失败: 本地消息结果无效");
                }
            }
        } catch (Throwable th3) {
            th = th3;
            c2343gM6844q.m5595o("发送拍一拍异常: " + th.getMessage());
        }
        return z9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean sendQuoteMsg(String str, long j3, String str2) {
        C2343g c2343gM6844q;
        if (str == null || AbstractC3149m.m6721t0(str) || j3 <= 0 || (c2343gM6844q = AbstractC3199a.m6844q()) == null) {
            return false;
        }
        return c2343gM6844q.m5598u(j3, str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean sendShareCard(String str, String str2) {
        C2343g c2343gM6844q;
        if (str == null || AbstractC3149m.m6721t0(str) || str2 == null || AbstractC3149m.m6721t0(str2) || (c2343gM6844q = AbstractC3199a.m6844q()) == null) {
            return false;
        }
        return c2343gM6844q.m5600w(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean sendText(String str, String str2) {
        C2343g c2343gM6844q;
        if (str == null || AbstractC3149m.m6721t0(str) || str2 == null || AbstractC3149m.m6721t0(str2) || (c2343gM6844q = AbstractC3199a.m6844q()) == null) {
            return false;
        }
        C0857b1 atContent = parseAtContent(str, str2);
        if (atContent == null) {
            return c2343gM6844q.m5601x(str, str2);
        }
        List list = atContent.f2623b;
        boolean zIsEmpty = list.isEmpty();
        String str3 = atContent.f2622a;
        return zIsEmpty ? c2343gM6844q.m5601x(str, str3) : c2343gM6844q.m5602y(str, str3, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean sendVideo(String str, String str2) {
        return sendMedia(new C0868g(4, str, str2));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean sendVoice(String str, String str2) {
        return sendMedia(new C0868g(1, str, str2));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean sendXmlMsg(String str, String str2) {
        C2343g c2343gM6844q;
        if (str == null || AbstractC3149m.m6721t0(str) || str2 == null || AbstractC3149m.m6721t0(str2) || (c2343gM6844q = AbstractC3199a.m6844q()) == null) {
            return false;
        }
        return c2343gM6844q.m5603z(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean shareFile(String str, String str2, String str3, String str4) {
        if (str == null || AbstractC3149m.m6721t0(str) || str3 == null || AbstractC3149m.m6721t0(str3)) {
            return false;
        }
        return sendMedia(new C0454k(str, str2, false, str3, str4, 3));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean shareMiniProgram(String str, String str2, String str3, String str4, String str5, byte[] bArr, String str6) {
        if (str == null || AbstractC3149m.m6721t0(str) || str4 == null || AbstractC3149m.m6721t0(str4)) {
            return false;
        }
        return sendMedia(new C0891r0(str, str2, str3, str4, str5, bArr, str6, 1));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean shareMusic(String str, String str2, String str3, String str4, String str5, byte[] bArr, String str6) {
        if (str == null || AbstractC3149m.m6721t0(str) || str4 == null || AbstractC3149m.m6721t0(str4) || str5 == null || AbstractC3149m.m6721t0(str5)) {
            return false;
        }
        return sendMedia(new C0891r0(str, str2, str3, str4, str5, bArr, str6, 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean shareMusicVideo(final String str, final String str2, final String str3, final String str4, final String str5, final String str6, final int i9, final String str7, final byte[] bArr, final String str8) {
        if (str == null || AbstractC3149m.m6721t0(str) || str4 == null || AbstractC3149m.m6721t0(str4) || str5 == null || AbstractC3149m.m6721t0(str5)) {
            return false;
        }
        return sendMedia(new InterfaceC1231l() { // from class: eb.o0
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // p085fg.InterfaceC1231l
            public final Object invoke(Object obj) {
                return Boolean.valueOf(ScriptWaBridge.shareMusicVideo$lambda$0(str, str2, str3, str4, str5, str6, i9, str7, bArr, str8, (C2105p) obj));
            }
        });
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean shareText(String str, String str2, String str3) {
        if (str == null || AbstractC3149m.m6721t0(str) || str2 == null || AbstractC3149m.m6721t0(str2)) {
            return false;
        }
        return sendMedia(new C0878l(3, str, str2, str3));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean shareVideo(String str, String str2, String str3, String str4, byte[] bArr, String str5) {
        if (str == null || AbstractC3149m.m6721t0(str) || str4 == null || AbstractC3149m.m6721t0(str4)) {
            return false;
        }
        return sendMedia(new C0897u0(str, str2, str3, str4, bArr, str5, 1));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean shareWebpage(String str, String str2, String str3, String str4, byte[] bArr, String str5) {
        if (str == null || AbstractC3149m.m6721t0(str) || str4 == null || AbstractC3149m.m6721t0(str4)) {
            return false;
        }
        return sendMedia(new C0897u0(str, str2, str3, str4, bArr, str5, 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean uploadDeviceStep(long j3) {
        C2343g c2343gM6844q;
        if (j3 > 0 && (c2343gM6844q = AbstractC3199a.m6844q()) != null) {
            C2815c c2815c = c2343gM6844q.f7687b;
            DexFinder dexFinder = c2343gM6844q.f7686a;
            if (j3 <= 0) {
                c2343gM6844q.m5595o("上传步数失败: step无效");
                return false;
            }
            if (dexFinder.uploadDeviceStepCtor != null) {
                c2343gM6844q.m5593l();
                try {
                    int iMin = (int) Math.min(j3, 2147483647L);
                    Constructor<?> constructor = dexFinder.uploadDeviceStepCtor;
                    Calendar calendar = Calendar.getInstance();
                    calendar.set(11, 0);
                    calendar.set(12, 0);
                    calendar.set(13, 0);
                    calendar.set(14, 0);
                    boolean zM6216j = c2815c.m6216j(KavaReflector.newInstance(constructor, HttpUrl.FRAGMENT_ENCODE_SET, "gh_43f2581f6fd6", Integer.valueOf((int) (calendar.getTimeInMillis() / 1000)), Integer.valueOf((int) (System.currentTimeMillis() / 1000)), Integer.valueOf(iMin), C2343g.m5579b(), 1));
                    StringBuilder sb2 = new StringBuilder("上传步数");
                    sb2.append(zM6216j ? "已发送" : "发送失败");
                    sb2.append(": step=");
                    sb2.append(iMin);
                    c2343gM6844q.m5595o(sb2.toString());
                    return zM6216j;
                } catch (Throwable th2) {
                    c2343gM6844q.m5595o("上传步数异常: " + th2.getMessage());
                    return false;
                }
            }
            c2343gM6844q.m5595o("上传步数失败: API未就绪");
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean uploadLivePhoto(JSONObject jSONObject) {
        C3351d0 c3351d0M1028q = AbstractC0255e.m1028q();
        if (c3351d0M1028q != null) {
            return jSONObject == null ? c3351d0M1028q.m7088v(0L, HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET) : c3351d0M1028q.m7089w(jSONObject);
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean uploadText(JSONObject jSONObject) {
        C3351d0 c3351d0M1028q = AbstractC0255e.m1028q();
        if (c3351d0M1028q != null) {
            if (jSONObject == null ? c3351d0M1028q.m7087u(HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET) : c3351d0M1028q.m7087u(jSONObject.optString("content", HttpUrl.FRAGMENT_ENCODE_SET), jSONObject.optString("sdkId", HttpUrl.FRAGMENT_ENCODE_SET), jSONObject.optString("sdkAppName", HttpUrl.FRAGMENT_ENCODE_SET))) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean uploadTextAndLivePhoto(String str, String str2) {
        C3351d0 c3351d0M1028q = AbstractC0255e.m1028q();
        return c3351d0M1028q != null && c3351d0M1028q.m7088v(0L, str, str2, HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean uploadTextAndPicList(JSONObject jSONObject) {
        boolean zM7090x;
        C3351d0 c3351d0M1028q = AbstractC0255e.m1028q();
        if (c3351d0M1028q != null) {
            if (jSONObject == null) {
                zM7090x = c3351d0M1028q.m7090x(HttpUrl.FRAGMENT_ENCODE_SET, C4173t.f13710g, HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET);
            } else {
                ArrayList arrayList = new ArrayList();
                JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("picPathList");
                if (jSONArrayOptJSONArray != null) {
                    int length = jSONArrayOptJSONArray.length();
                    for (int i9 = 0; i9 < length; i9++) {
                        String strOptString = jSONArrayOptJSONArray.optString(i9, HttpUrl.FRAGMENT_ENCODE_SET);
                        strOptString.getClass();
                        String string = AbstractC3149m.m6703R0(strOptString).toString();
                        if (!AbstractC3149m.m6721t0(string)) {
                            arrayList.add(string);
                        }
                    }
                }
                String strM1023l = AbstractC0255e.m1023l("picPath", HttpUrl.FRAGMENT_ENCODE_SET, jSONObject);
                if (!AbstractC3149m.m6721t0(strM1023l)) {
                    arrayList.add(strM1023l);
                }
                zM7090x = c3351d0M1028q.m7090x(jSONObject.optString("content", HttpUrl.FRAGMENT_ENCODE_SET), arrayList, jSONObject.optString("sdkId", HttpUrl.FRAGMENT_ENCODE_SET), jSONObject.optString("sdkAppName", HttpUrl.FRAGMENT_ENCODE_SET));
            }
            if (zM7090x) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean uploadTextAndVideo(String str, String str2) {
        C3351d0 c3351d0M1028q = AbstractC0255e.m1028q();
        return c3351d0M1028q != null && c3351d0M1028q.m7091y(str, str2, HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean uploadVideo(JSONObject jSONObject) {
        C3351d0 c3351d0M1028q = AbstractC0255e.m1028q();
        if (c3351d0M1028q != null) {
            if (jSONObject == null ? c3351d0M1028q.m7091y(HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET) : c3351d0M1028q.m7092z(jSONObject)) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean verifyUser(String str, String str2, int i9) {
        C0876k c0876k = C0876k.f2687a;
        String strM2189p = C0876k.m2189p(i9, str, str2);
        WeChatApis.contact().getClass();
        C1371l c1371l = WeChatApis.verifyUserApi;
        return c1371l != null && c1371l.m3742c(strM2189p, str2, i9, 0);
    }

    public final void downloadImage(String str, String str2, Consumer<File> consumer) {
        async(new C0905y0(consumer, this, str, str2));
    }

    public final boolean sendFile(String str, String str2, String str3) {
        return sendMedia(new C0878l(2, str, str2, str3));
    }

    public final boolean sendImage(String str, String str2, String str3) {
        return sendMedia(new C0878l(1, str, str2, str3));
    }

    public final boolean sendVoice(String str, String str2, int i9) {
        return sendMedia(new C0899v0(i9, str, str2, 0));
    }

    public final void downloadImages(List<?> list, Consumer<List<File>> consumer) {
        async(new C0045e(consumer, this, list, 6));
    }

    public final void get(String str, Map<?, ?> map, Consumer<String> consumer) {
        get(str, map, 30L, consumer);
    }

    public final void download(String str, String str2, Map<?, ?> map, Consumer<File> consumer) {
        download(str, str2, map, 30L, consumer);
    }

    public final void post(String str, Map<?, ?> map, Map<?, ?> map2, Consumer<String> consumer) {
        post(str, map, map2, 30L, consumer);
    }

    public final void downloadVideo(Object obj, String str, PluginCallBack.DownloadCallback downloadCallback) {
        async(new C0883n0(this, obj, downloadCallback, str, 0));
    }

    public final boolean uploadTextAndVideo(String str, String str2, String str3, String str4) {
        C3351d0 c3351d0M1028q = AbstractC0255e.m1028q();
        return c3351d0M1028q != null && c3351d0M1028q.m7091y(str, str2, str3, str4);
    }

    public final boolean uploadTextAndVideo(JSONObject jSONObject) {
        C3351d0 c3351d0M1028q = AbstractC0255e.m1028q();
        return c3351d0M1028q != null && c3351d0M1028q.m7092z(jSONObject);
    }

    public final void downloadImg(String str, String str2, String str3, String str4) {
        downloadImgInternal$default(this, str, str2, str3, str4, 2, 0, 32, null);
    }

    public final void downloadImg(Object obj, String str, PluginCallBack.DownloadCallback downloadCallback) {
        async(new C0883n0(this, obj, downloadCallback, str, 1));
    }

    public final boolean modifyContactLabelList(String str, List<String> list) {
        C1368i c1368iM9259c;
        return (str == null || AbstractC3149m.m6721t0(str) || (c1368iM9259c = AbstractC4855en.m9259c()) == null || !c1368iM9259c.m3709P(str, list)) ? false : true;
    }

    public final boolean uploadVideo(String str) {
        C3351d0 c3351d0M1028q = AbstractC0255e.m1028q();
        return c3351d0M1028q != null && c3351d0M1028q.m7091y(HttpUrl.FRAGMENT_ENCODE_SET, str, HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET);
    }

    public final boolean uploadTextAndLivePhoto(String str, String str2, String str3) {
        C3351d0 c3351d0M1028q = AbstractC0255e.m1028q();
        return c3351d0M1028q != null && c3351d0M1028q.m7088v(0L, str, str2, str3, HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET);
    }

    public final String getAvatarUrl(String str) {
        return getAvatarUrl(str, true);
    }

    public final boolean uploadTextAndLivePhoto(String str, String str2, String str3, String str4) {
        C3351d0 c3351d0M1028q = AbstractC0255e.m1028q();
        return c3351d0M1028q != null && c3351d0M1028q.m7088v(0L, str, str2, HttpUrl.FRAGMENT_ENCODE_SET, str3, str4);
    }

    public final boolean sendQuoteMsg(String str, String str2, long j3) {
        return sendQuoteMsg(str, j3, str2);
    }

    public final boolean verifyUser(String str, String str2, int i9, int i10) {
        C0876k c0876k = C0876k.f2687a;
        String strM2189p = C0876k.m2189p(i9, str, str2);
        WeChatApis.contact().getClass();
        C1371l c1371l = WeChatApis.verifyUserApi;
        return c1371l != null && c1371l.m3742c(strM2189p, str2, i9, i10);
    }

    public final boolean uploadTextAndLivePhoto(String str, String str2, String str3, String str4, String str5) {
        C3351d0 c3351d0M1028q = AbstractC0255e.m1028q();
        return c3351d0M1028q != null && c3351d0M1028q.m7088v(0L, str, str2, str3, str4, str5);
    }

    public final boolean sendFavorite(String str, long j3) {
        if (str == null || AbstractC3149m.m6721t0(str) || j3 <= 0) {
            return false;
        }
        return sendMedia(new C0893s0(str, j3, 0));
    }

    public final boolean uploadTextAndLivePhoto(JSONObject jSONObject) {
        C3351d0 c3351d0M1028q = AbstractC0255e.m1028q();
        return c3351d0M1028q != null && c3351d0M1028q.m7089w(jSONObject);
    }

    public final boolean uploadLivePhoto(String str, String str2) {
        C3351d0 c3351d0M1028q = AbstractC0255e.m1028q();
        return c3351d0M1028q != null && c3351d0M1028q.m7088v(0L, HttpUrl.FRAGMENT_ENCODE_SET, str, str2, HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET);
    }

    public final boolean uploadLivePhoto(String str) {
        C3351d0 c3351d0M1028q = AbstractC0255e.m1028q();
        return c3351d0M1028q != null && c3351d0M1028q.m7088v(0L, HttpUrl.FRAGMENT_ENCODE_SET, str, HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET);
    }

    public final boolean uploadText(String str, String str2, String str3) {
        C3351d0 c3351d0M1028q = AbstractC0255e.m1028q();
        return c3351d0M1028q != null && c3351d0M1028q.m7087u(str, str2, str3);
    }

    public final boolean uploadText(String str) {
        C3351d0 c3351d0M1028q = AbstractC0255e.m1028q();
        return c3351d0M1028q != null && c3351d0M1028q.m7087u(str, HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET);
    }

    public final boolean addChatroomMember(String str, List<String> list) {
        C1363d c1363dM5159f;
        return (str == null || AbstractC3149m.m6721t0(str) || list == null || list.isEmpty() || (c1363dM5159f = AbstractC2091b.m5159f()) == null || !c1363dM5159f.m3671a(str, list)) ? false : true;
    }

    public final boolean delChatroomMember(String str, List<String> list) {
        C1363d c1363dM5159f;
        return (str == null || AbstractC3149m.m6721t0(str) || list == null || list.isEmpty() || (c1363dM5159f = AbstractC2091b.m5159f()) == null || !c1363dM5159f.m3672d(str, list)) ? false : true;
    }

    public final boolean inviteChatroomMember(String str, List<String> list) {
        C1363d c1363dM5159f;
        return (str == null || AbstractC3149m.m6721t0(str) || list == null || list.isEmpty() || (c1363dM5159f = AbstractC2091b.m5159f()) == null || !c1363dM5159f.m3681m(str, list)) ? false : true;
    }

    public final String getFriendName(String str, String str2) {
        String friendDisplayName = HttpUrl.FRAGMENT_ENCODE_SET;
        if (str == null || AbstractC3149m.m6721t0(str)) {
            return HttpUrl.FRAGMENT_ENCODE_SET;
        }
        if (str2 != null && !AbstractC3149m.m6721t0(str2)) {
            friendDisplayName = getFriendDisplayName(str, str2);
        }
        return firstNotBlank(friendDisplayName, getFriendRemarkName(str), getFriendNickName(str), str);
    }

    public final void sendText(String str, String str2, Consumer<Object> consumer) {
        async(new C0905y0(this, consumer, str, str2));
    }

    public final List<WeChatSnsPost> getSnsPostList(int i9) {
        C3351d0 c3351d0M1028q = AbstractC0255e.m1028q();
        List list = C4173t.f13710g;
        if (c3351d0M1028q == null) {
            return list;
        }
        C3356h c3356hM7075g = c3351d0M1028q.m7075g();
        List listM7103h = c3356hM7075g != null ? c3356hM7075g.m7103h(null, i9, false) : null;
        if (listM7103h != null) {
            list = listM7103h;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            WeChatSnsPost weChatSnsPostM7081o = c3351d0M1028q.m7081o((C3355g) it.next());
            if (weChatSnsPostM7081o != null) {
                arrayList.add(weChatSnsPostM7081o);
            }
        }
        List listM8402K1 = AbstractC4166m.m8402K1(arrayList, new C0031h(25));
        if (i9 < 0) {
            i9 = 0;
        }
        return AbstractC4166m.m8403L1(i9, listM8402K1);
    }

    public final boolean uploadTextAndPicList(String str, String str2, String str3, String str4) {
        C3351d0 c3351d0M1028q = AbstractC0255e.m1028q();
        if (c3351d0M1028q != null) {
            return c3351d0M1028q.m7084r(str, null, str3, (str2 == null || AbstractC3149m.m6721t0(str2)) ? C4173t.f13710g : AbstractC0000a.m99x0(str2), str4);
        }
        return false;
    }

    public final boolean uploadTextAndPicList(String str, List<?> list) {
        C3351d0 c3351d0M1028q = AbstractC0255e.m1028q();
        return c3351d0M1028q != null && c3351d0M1028q.m7090x(str, list, HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET);
    }

    public final boolean uploadTextAndPicList(String str, List<?> list, String str2, String str3) {
        C3351d0 c3351d0M1028q = AbstractC0255e.m1028q();
        return c3351d0M1028q != null && c3351d0M1028q.m7090x(str, list, str2, str3);
    }

    public final boolean uploadTextAndPicList(String str, String str2) {
        C3351d0 c3351d0M1028q = AbstractC0255e.m1028q();
        if (c3351d0M1028q != null) {
            return c3351d0M1028q.m7084r(str, null, HttpUrl.FRAGMENT_ENCODE_SET, (str2 == null || AbstractC3149m.m6721t0(str2)) ? C4173t.f13710g : AbstractC0000a.m99x0(str2), HttpUrl.FRAGMENT_ENCODE_SET);
        }
        return false;
    }

    public final List<WeChatSnsPost> getSnsPostList() {
        return getSnsPostList(50);
    }

    public final boolean sendLocation(String str, JSONObject jSONObject) {
        if (jSONObject == null) {
            return false;
        }
        return sendLocation(str, jSONObject.optString("poiName"), jSONObject.optString("label"), jSONObject.optString("x"), jSONObject.optString("y"), jSONObject.optString("scale"));
    }
}
