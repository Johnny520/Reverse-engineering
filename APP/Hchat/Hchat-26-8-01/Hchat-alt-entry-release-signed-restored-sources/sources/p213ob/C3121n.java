package p213ob;

import ac.RunnableC0059l;
import android.content.Context;
import android.content.SharedPreferences;
import android.media.MediaPlayer;
import android.os.Handler;
import android.os.Looper;
import android.view.MenuItem;
import android.view.View;
import de.robv.android.xposed.XC_MethodHook;
import gg.AbstractC1416l;
import gg.AbstractC1428x;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p020b5.C0184c;
import p024b9.SharedPreferencesOnSharedPreferenceChangeListenerC0216b;
import p025bc.AbstractC0255e;
import p036c9.ThreadFactoryC0478q;
import p054dg.AbstractC0793l;
import p068eh.AbstractC0921a;
import p099h.Hchat.hooks.api.core.WeChatApis;
import p099h.Hchat.utils.KavaReflector;
import p126ia.C2026t;
import p129ig.AbstractC2043a;
import p136j8.AbstractC2091b;
import p136j8.C2104o;
import p198nb.C2928c;
import p218og.AbstractC3149m;
import p218og.AbstractC3156t;
import p222p.AbstractC3199a;
import p242q8.C3460o;
import p258r8.C3742g;
import p258r8.C3744i;
import p259r9.AbstractC3754e0;
import p276sf.C3959f;
import p276sf.C3960g;
import p300ub.AbstractC4302b;
import p332wb.AbstractC4855en;
import tf.AbstractC4166m;

/* JADX INFO: renamed from: ob.n */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3121n {

    /* JADX INFO: renamed from: a */
    public final C3742g f10110a;

    /* JADX INFO: renamed from: b */
    public final C2026t f10111b;

    /* JADX INFO: renamed from: c */
    public final SharedPreferences f10112c;

    /* JADX INFO: renamed from: d */
    public final Handler f10113d;

    /* JADX INFO: renamed from: e */
    public final C3111d f10114e;

    /* JADX INFO: renamed from: f */
    public final C0184c f10115f;

    /* JADX INFO: renamed from: g */
    public final AtomicBoolean f10116g;

    /* JADX INFO: renamed from: h */
    public final ConcurrentHashMap f10117h;

    /* JADX INFO: renamed from: i */
    public final Set f10118i;

    /* JADX INFO: renamed from: j */
    public final Map f10119j;

    /* JADX INFO: renamed from: k */
    public final ThreadPoolExecutor f10120k;

    /* JADX INFO: renamed from: l */
    public MediaPlayer f10121l;

    /* JADX INFO: renamed from: m */
    public File f10122m;

    /* JADX INFO: renamed from: n */
    public long f10123n;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3121n(C3742g c3742g, C2026t c2026t) {
        c3742g.getClass();
        this.f10110a = c3742g;
        this.f10111b = c2026t;
        List list = AbstractC3123p.f10127a;
        Context context = c3742g.f12143a;
        SharedPreferences sharedPreferencesM8640c = AbstractC4302b.m8640c(context, "Hchat_text_voice_config");
        this.f10112c = sharedPreferencesM8640c;
        this.f10113d = new Handler(Looper.getMainLooper());
        this.f10114e = new C3111d();
        this.f10115f = new C0184c(context, 13);
        this.f10116g = new AtomicBoolean(true);
        this.f10117h = new ConcurrentHashMap();
        this.f10118i = AbstractC2091b.m5168o();
        this.f10119j = AbstractC3199a.m6843p();
        this.f10120k = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new ArrayBlockingQueue(8), new ThreadFactoryC0478q(21));
        sharedPreferencesM8640c.registerOnSharedPreferenceChangeListener(new SharedPreferencesOnSharedPreferenceChangeListenerC0216b(this, 9));
        File file = new File(context.getCacheDir(), "hchat_text_voice");
        if (!file.isDirectory()) {
            file.mkdirs();
        }
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles != null) {
            for (File file2 : fileArrListFiles) {
                String name = file2.getName();
                name.getClass();
                if (AbstractC3156t.m6740d0(name, "hchat_text_voice_", false)) {
                    file2.delete();
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static void m6618b(Object obj, MenuItem menuItem) {
        for (Class<?> superclass = obj.getClass(); superclass != null && !superclass.equals(Object.class); superclass = superclass.getSuperclass()) {
            for (Field field : KavaReflector.declaredFields(superclass)) {
                if (List.class.isAssignableFrom(field.getType())) {
                    Object field2 = KavaReflector.readField(field, obj);
                    List list = AbstractC1428x.m3840e(field2) ? (List) field2 : null;
                    if (list != null) {
                        Iterator it = list.iterator();
                        int i9 = 0;
                        while (true) {
                            if (!it.hasNext()) {
                                i9 = -1;
                                break;
                            }
                            Object next = it.next();
                            if (next == menuItem) {
                                break;
                            }
                            MenuItem menuItem2 = next instanceof MenuItem ? (MenuItem) next : null;
                            if (menuItem2 != null && menuItem2.getItemId() == 1212372054) {
                                break;
                            } else {
                                i9++;
                            }
                        }
                        if (i9 > 0) {
                            try {
                                list.add(0, list.remove(i9));
                            } catch (Throwable unused) {
                            }
                        }
                        if (i9 >= 0) {
                            return;
                        }
                    } else {
                        continue;
                    }
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public static Number m6619e(Object obj, String str, String str2, String str3) {
        Object objInvokeMethod = KavaReflector.invokeMethod(obj, str, new Object[0]);
        Number number = objInvokeMethod instanceof Number ? (Number) objInvokeMethod : null;
        if (number != null) {
            return number;
        }
        Object field = KavaReflector.readField(obj, str2);
        Number number2 = field instanceof Number ? (Number) field : null;
        if (number2 != null) {
            return number2;
        }
        Object field2 = KavaReflector.readField(obj, str3);
        if (field2 instanceof Number) {
            return (Number) field2;
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public static String m6620f(Object obj, String str, String str2, String str3) {
        String string;
        Object objInvokeMethod = KavaReflector.invokeMethod(obj, str, new Object[0]);
        if (objInvokeMethod != null && (string = objInvokeMethod.toString()) != null) {
            return string;
        }
        Object field = KavaReflector.readField(obj, str2);
        if (field != null) {
            return field.toString();
        }
        Object field2 = KavaReflector.readField(obj, str3);
        String string2 = field2 != null ? field2.toString() : null;
        return string2 != null ? string2 : HttpUrl.FRAGMENT_ENCODE_SET;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public static Object m6621h(int i9, Object obj, Set set) {
        Object field;
        Object objM6621h;
        if (obj != null && i9 <= 5 && set.add(obj)) {
            Number numberM6619e = m6619e(obj, "getMsgId", "field_msgId", "msgId");
            if (numberM6619e == null) {
                Object objInvokeMethod = KavaReflector.invokeMethod(obj, "getMsgID", new Object[0]);
                numberM6619e = objInvokeMethod instanceof Number ? (Number) objInvokeMethod : null;
            }
            if (AbstractC0921a.m2263z("com.tencent.mm.storage.", obj, false) && numberM6619e != null) {
                if (numberM6619e.longValue() > 0) {
                    return obj;
                }
            }
            if (obj instanceof View) {
                return m6621h(i9 + 1, ((View) obj).getTag(), set);
            }
            if (obj instanceof Object[]) {
                for (Object obj2 : (Object[]) obj) {
                    Object objM6621h2 = m6621h(i9 + 1, obj2, set);
                    if (objM6621h2 != null) {
                        return objM6621h2;
                    }
                }
            } else if (obj instanceof Collection) {
                Iterator it = ((Iterable) obj).iterator();
                while (it.hasNext()) {
                    Object objM6621h3 = m6621h(i9 + 1, it.next(), set);
                    if (objM6621h3 != null) {
                        return objM6621h3;
                    }
                }
            } else {
                String name = obj.getClass().getName();
                if (!AbstractC3156t.m6740d0(name, "java.", false) && !AbstractC3156t.m6740d0(name, "android.", false)) {
                    for (Class<?> superclass = obj.getClass(); superclass != null && !superclass.equals(Object.class); superclass = superclass.getSuperclass()) {
                        for (Field field2 : KavaReflector.declaredFields(superclass)) {
                            if (!field2.getType().isPrimitive() && !AbstractC1416l.m3825a(field2.getType(), String.class) && (field = KavaReflector.readField(field2, obj)) != null && (objM6621h = m6621h(i9 + 1, field, set)) != null) {
                                return objM6621h;
                            }
                        }
                    }
                }
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: m */
    public static String m6622m(String str, Throwable th2) {
        String string;
        if (th2 instanceof InterruptedException) {
            return "操作已取消";
        }
        String message = th2.getMessage();
        if (message != null && (string = AbstractC3149m.m6703R0(message).toString()) != null) {
            if (!(string.length() > 0)) {
                string = null;
            }
            if (string != null) {
                return string;
            }
        }
        return str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final boolean m6623a(Method method, XC_MethodHook xC_MethodHook) {
        Object c3959f;
        if (Modifier.isAbstract(method.getModifiers()) || method.getDeclaringClass().isInterface()) {
            return false;
        }
        Set set = this.f10118i;
        if (!set.add(method)) {
            return true;
        }
        try {
            C3744i c3744i = C3744i.f12154b;
            Method methodAccessible = KavaReflector.accessible(method);
            if (methodAccessible == null) {
                methodAccessible = method;
            }
            c3744i.m7763b(methodAccessible, xC_MethodHook);
            c3959f = Boolean.TRUE;
        } catch (Throwable th2) {
            c3959f = new C3959f(th2);
        }
        Throwable thM8182b = C3960g.m8182b(c3959f);
        if (thM8182b != null) {
            set.remove(method);
            this.f10111b.invoke("文本转语音菜单 Hook 安装失败: " + method.toGenericString(), thM8182b);
            c3959f = Boolean.FALSE;
        }
        return ((Boolean) c3959f).booleanValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final File m6624c(C3118k c3118k) {
        List list = AbstractC3123p.f10127a;
        String str = AbstractC3156t.m6740d0(c3118k.f10102a, "tts:", false) ? ".wav" : ".mp3";
        File file = new File(this.f10110a.f12143a.getCacheDir(), "hchat_text_voice");
        if (!file.isDirectory()) {
            file.mkdirs();
        }
        return new File(file, "hchat_text_voice_" + UUID.randomUUID() + str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public final boolean m6625d() {
        return this.f10116g.get() && this.f10112c.getBoolean("text_voice_play_enable", false);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public final void m6626g() {
        this.f10123n++;
        MediaPlayer mediaPlayer = this.f10121l;
        File file = this.f10122m;
        this.f10121l = null;
        this.f10122m = null;
        if (mediaPlayer != null) {
            try {
                mediaPlayer.stop();
            } catch (Throwable unused) {
            }
        }
        if (mediaPlayer != null) {
            try {
                mediaPlayer.reset();
            } catch (Throwable unused2) {
            }
        }
        if (mediaPlayer != null) {
            try {
                mediaPlayer.release();
            } catch (Throwable unused3) {
            }
        }
        if (file != null) {
            file.delete();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public final boolean m6627i() {
        return this.f10116g.get() && this.f10112c.getBoolean("text_voice_send_enable", false);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public final C3118k m6628j(EnumC3117j enumC3117j) {
        Object next;
        String str;
        List list = AbstractC3123p.f10127a;
        C3742g c3742g = this.f10110a;
        Context context = c3742g.f12143a;
        Context context2 = c3742g.f12143a;
        String string = AbstractC4302b.m8640c(context, "Hchat_text_voice_config").getString("text_voice_engine", "online");
        if (string == null) {
            string = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        String str2 = AbstractC3149m.m6721t0(string) ? "online" : string;
        EnumC3117j enumC3117j2 = EnumC3117j.f10100h;
        if (enumC3117j == enumC3117j2) {
            str = "v50";
        } else {
            String strM6632b = AbstractC3123p.m6632b(context2);
            List list2 = AbstractC3123p.f10127a;
            Iterator it = list2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (((C3122o) next).f10124a.equals(strM6632b)) {
                    break;
                }
            }
            C3122o c3122o = (C3122o) next;
            str = c3122o != null ? c3122o.f10126c : ((C3122o) AbstractC4166m.m8422t1(list2)).f10126c;
        }
        String str3 = str;
        String string2 = this.f10112c.getString("text_voice_tts_voice", HttpUrl.FRAGMENT_ENCODE_SET);
        String str4 = string2 == null ? HttpUrl.FRAGMENT_ENCODE_SET : string2;
        List list3 = AbstractC3123p.f10127a;
        return new C3118k(str2, str3, str4, AbstractC3123p.m6631a(AbstractC4302b.m8640c(context2, "Hchat_text_voice_config").getFloat("text_voice_speech_rate", 1.0f)), enumC3117j == enumC3117j2);
    }

    /* JADX DEBUG: Another duplicated slice has different insns count: {[GOTO]}, finally: {[GOTO, THROW, INVOKE, MOVE_EXCEPTION, THROW, MOVE_EXCEPTION] complete} */
    /* JADX DEBUG: Another duplicated slice has different insns count: {[]}, finally: {[THROW, INVOKE, MOVE_EXCEPTION, THROW, MOVE_EXCEPTION] complete} */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x032a, code lost:
    
        throw new java.lang.IllegalStateException("语音文件超过 16 MiB");
     */
    /* JADX INFO: renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m6629k(String str, C3118k c3118k, File file) throws JSONException, InterruptedException, IOException {
        Object c3959f;
        FileOutputStream fileOutputStream;
        JSONObject jSONObjectOptJSONObject;
        JSONArray jSONArrayOptJSONArray;
        JSONObject jSONObjectOptJSONObject2;
        List list = AbstractC3123p.f10127a;
        String str2 = c3118k.f10102a;
        boolean zM6740d0 = AbstractC3156t.m6740d0(str2, "tts:", false);
        String str3 = HttpUrl.FRAGMENT_ENCODE_SET;
        if (zM6740d0) {
            String strM6633c = AbstractC3123p.m6633c(str2);
            String str4 = c3118k.f10104c;
            float f3 = c3118k.f10105d;
            boolean z9 = c3118k.f10106e;
            C0184c c0184c = this.f10115f;
            c0184c.getClass();
            str.getClass();
            Context context = (Context) c0184c.f469a;
            Context applicationContext = context.getApplicationContext();
            if (applicationContext == null) {
                applicationContext = context;
            }
            long j3 = ((AtomicLong) c0184c.f471c).get();
            ArrayList arrayList = new ArrayList();
            C3109b c3109b = null;
            for (String str5 : C2928c.m6339a(applicationContext, strM6633c)) {
                c0184c.m814k(j3);
                try {
                    c0184c.m804V(applicationContext, str, str5, str4, f3, z9, file, j3);
                    return;
                } catch (C3109b e6) {
                    if (AbstractC3149m.m6721t0(str5)) {
                        str5 = "系统默认";
                    }
                    String message = e6.getMessage();
                    if (message == null) {
                        message = HttpUrl.FRAGMENT_ENCODE_SET;
                    }
                    arrayList.add(((Object) str5) + "：" + message);
                    if (!AbstractC3149m.m6721t0(strM6633c)) {
                        throw e6;
                    }
                    c3109b = e6;
                }
            }
            String strM8392A1 = AbstractC4166m.m8392A1(AbstractC4166m.m8404M1(3, arrayList), "；", null, null, null, 62);
            throw new IllegalStateException(AbstractC3149m.m6721t0(strM8392A1) ? "TTS 引擎初始化失败" : AbstractC0921a.m2251n("可用 TTS 引擎均初始化失败（", strM8392A1, "）"), c3109b);
        }
        String str6 = c3118k.f10103b;
        int iM7909r = AbstractC3754e0.m7909r(AbstractC2043a.m5018X((AbstractC3123p.m6631a(c3118k.f10105d) - 1.0f) * 10.0f), -9, 20);
        OkHttpClient okHttpClient = this.f10114e.f10090a;
        str.getClass();
        str6.getClass();
        String string = AbstractC3149m.m6703R0(str).toString();
        if (string.length() <= 0) {
            C2104o.m5294t("文字不能为空");
            return;
        }
        if (string.length() > 2000) {
            C2104o.m5294t("文字不能超过 2000 个字符");
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        JSONObject jSONObjectM9268l = AbstractC4855en.m9268l("model_id", "tts_bcut", "platform", "Android");
        jSONObjectM9268l.put("raw_data", new JSONArray().put(string));
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("format", "mp3");
        jSONObject.put("logid", UUID.randomUUID() + "_" + jCurrentTimeMillis);
        jSONObject.put("method", 0);
        jSONObject.put("pitch_rate", 0);
        jSONObject.put("sample_rate", 16000);
        jSONObject.put("speech_rate", AbstractC3754e0.m7909r(iM7909r, -9, 20));
        jSONObject.put("voice", str6);
        jSONObject.put("voice_engine", "bili");
        jSONObject.put("volume", 50);
        jSONObjectM9268l.put("raw_params", jSONObject);
        Request.Builder builderHeader = new Request.Builder().url("https://member.bilibili.com/x/material/rubick-interface/sync-task?aurora_version=2.33.0&montage_version=1.36.1.3&sdk_type=mon&ts=" + (jCurrentTimeMillis / 1000)).header("env", "prod").header("APP-KEY", "bilistudio").header("bili-http-engine", "cronet").header("User-Agent", "com.bilibili.studio/2740030 (Linux; U; Android 13; zh_CN; 21121210C; Build/TKQ1.220807.001; Cronet/88.0.4324.188)");
        RequestBody.Companion companion = RequestBody.Companion;
        String string2 = jSONObjectM9268l.toString();
        string2.getClass();
        Response responseExecute = okHttpClient.newCall(builderHeader.post(companion.create(string2, C3111d.f10089b)).build()).execute();
        try {
            ResponseBody responseBodyBody = responseExecute.body();
            String strString = responseBodyBody != null ? responseBodyBody.string() : null;
            if (strString == null) {
                strString = HttpUrl.FRAGMENT_ENCODE_SET;
            }
            if (!responseExecute.isSuccessful()) {
                throw new IllegalStateException(("在线语音请求失败: HTTP " + responseExecute.code()).toString());
            }
            try {
                c3959f = new JSONObject(strString);
            } catch (Throwable th2) {
                c3959f = new C3959f(th2);
            }
            if (C3960g.m8182b(c3959f) != null) {
                throw new IllegalStateException("在线语音返回内容无法解析");
            }
            JSONObject jSONObject2 = (JSONObject) c3959f;
            int iOptInt = jSONObject2.optInt("code", -1);
            if (iOptInt != 0) {
                String strOptString = jSONObject2.optString("message");
                if (AbstractC3149m.m6721t0(strOptString)) {
                    strOptString = "在线语音服务返回错误: " + iOptInt;
                }
                throw new IllegalStateException(strOptString.toString());
            }
            JSONObject jSONObjectOptJSONObject3 = jSONObject2.optJSONObject("data");
            String strOptString2 = (jSONObjectOptJSONObject3 == null || (jSONObjectOptJSONObject = jSONObjectOptJSONObject3.optJSONObject("result")) == null || (jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray("results")) == null || (jSONObjectOptJSONObject2 = jSONArrayOptJSONArray.optJSONObject(0)) == null) ? null : jSONObjectOptJSONObject2.optString("url");
            if (strOptString2 != null) {
                str3 = strOptString2;
            }
            String str7 = AbstractC3156t.m6740d0(str3, "https://", true) ? str3 : null;
            if (str7 == null) {
                throw new IllegalStateException("在线语音未返回安全的音频地址");
            }
            responseExecute.close();
            File parentFile = file.getParentFile();
            if (parentFile != null && !parentFile.isDirectory() && !parentFile.mkdirs()) {
                C2104o.m5276A("无法创建语音缓存目录");
                return;
            }
            File file2 = new File(file.getParentFile(), AbstractC0255e.m1020i(file.getName(), ".part"));
            file2.delete();
            file.delete();
            try {
                responseExecute = okHttpClient.newCall(new Request.Builder().url(str7).get().build()).execute();
                try {
                    if (!responseExecute.isSuccessful()) {
                        throw new IllegalStateException(("下载语音失败: HTTP " + responseExecute.code()).toString());
                    }
                    ResponseBody responseBodyBody2 = responseExecute.body();
                    if (responseBodyBody2 == null) {
                        throw new IllegalStateException("下载语音失败: 返回内容为空");
                    }
                    long j4 = 16777216;
                    if (responseBodyBody2.contentLength() > 16777216) {
                        throw new IllegalStateException("语音文件超过 16 MiB");
                    }
                    InputStream inputStreamByteStream = responseBodyBody2.byteStream();
                    try {
                        fileOutputStream = new FileOutputStream(file2, false);
                    } finally {
                    }
                    try {
                        byte[] bArr = new byte[8192];
                        long j5 = 0;
                        while (true) {
                            int i9 = inputStreamByteStream.read(bArr);
                            if (i9 < 0) {
                                fileOutputStream.close();
                                inputStreamByteStream.close();
                                responseExecute.close();
                                if (!file2.isFile() || file2.length() <= 0) {
                                    throw new IllegalStateException("下载到的语音文件为空");
                                }
                                if (file2.renameTo(file)) {
                                    return;
                                }
                                AbstractC0793l.m2021a0(file2, file);
                                file2.delete();
                                return;
                            }
                            long j10 = j4;
                            j5 += (long) i9;
                            if (j5 > j10) {
                                break;
                            }
                            fileOutputStream.write(bArr, 0, i9);
                            j4 = j10;
                        }
                    } finally {
                    }
                } finally {
                }
            } finally {
            }
            file2.delete();
            file.delete();
        } finally {
            try {
                throw th;
            } finally {
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l */
    public final void m6630l(String str) {
        C3460o c3460oCurrentActivity = WeChatApis.currentActivity();
        this.f10113d.post(new RunnableC0059l(c3460oCurrentActivity != null ? c3460oCurrentActivity.m7263a() : null, this, str, 23));
    }
}
