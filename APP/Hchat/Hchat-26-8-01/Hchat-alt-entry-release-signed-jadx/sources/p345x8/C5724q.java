package p345x8;

import android.content.Context;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.media.MediaMetadataRetriever;
import android.os.Bundle;
import android.os.SystemClock;
import android.provider.Settings;
import android.speech.tts.TextToSpeech;
import android.text.TextUtils;
import android.view.Surface;
import android.widget.Toast;
import bb.C0240b;
import bsh.org.objectweb.asm.Opcodes;
import ca.C0532s;
import gg.AbstractC1416l;
import gg.C1423s;
import gg.C1425u;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import me.yun.silk.AacCodec;
import me.yun.silk.SilkCodec;
import ng.AbstractC3015m;
import ng.C3003a;
import ng.C3011i;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p000a.AbstractC0000a;
import p007a7.AbstractC0018a;
import p025bc.AbstractC0255e;
import p036c9.C0506z0;
import p036c9.ThreadFactoryC0478q;
import p049d9.C0747h;
import p054dg.AbstractC0793l;
import p054dg.C0795n;
import p068eh.AbstractC0921a;
import p080fb.AbstractC1184v0;
import p080fb.C1129h1;
import p085fg.InterfaceC1231l;
import p096g8.C1360a;
import p096g8.C1363d;
import p096g8.C1368i;
import p099h.Hchat.hooks.api.core.WeChatApis;
import p099h.Hchat.hooks.api.model.WeChatContact;
import p099h.Hchat.hooks.api.model.WeChatMessage;
import p099h.Hchat.hooks.api.model.WeChatPatMsg;
import p099h.Hchat.hooks.api.model.WeChatSnsPost;
import p099h.Hchat.hooks.items.script.ScriptPluginRuntime;
import p129ig.AbstractC2043a;
import p136j8.AbstractC2091b;
import p136j8.C2097h;
import p136j8.C2104o;
import p136j8.C2105p;
import p142jg.AbstractC2133a;
import p142jg.AbstractC2136d;
import p153k8.C2343g;
import p153k8.C2351o;
import p213ob.C3108a;
import p218og.AbstractC3137a;
import p218og.AbstractC3149m;
import p218og.AbstractC3156t;
import p218og.C3145i;
import p218og.C3147k;
import p222p.AbstractC3199a;
import p259r9.AbstractC3754e0;
import p276sf.C3959f;
import p276sf.C3960g;
import p288tb.C4143c;
import p304uf.C4329c;
import p332wb.AbstractC4855en;
import p332wb.C5167o7;
import p332wb.C5251qp;
import p332wb.C5319sr;
import p332wb.RunnableC4794cr;
import tf.AbstractC4156d0;
import tf.AbstractC4165l;
import tf.AbstractC4166m;
import tf.AbstractC4167n;
import tf.AbstractC4171r;
import tf.C4173t;

/* JADX INFO: renamed from: x8.q */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C5724q {

    /* JADX INFO: renamed from: a */
    public static final ExecutorService f23297a = Executors.newSingleThreadExecutor(new ThreadFactoryC0478q(27));

    /* JADX INFO: renamed from: b */
    public static final ScheduledExecutorService f23298b = Executors.newSingleThreadScheduledExecutor(new ThreadFactoryC0478q(28));

    /* JADX INFO: renamed from: c */
    public static final OkHttpClient f23299c = new OkHttpClient.Builder().pingInterval(30, TimeUnit.SECONDS).build();

    /* JADX INFO: renamed from: d */
    public static final ConcurrentHashMap f23300d = new ConcurrentHashMap();

    /* JADX INFO: renamed from: e */
    public static final ConcurrentHashMap f23301e = new ConcurrentHashMap();

    /* JADX INFO: renamed from: f */
    public static final ConcurrentHashMap f23302f = new ConcurrentHashMap();

    /* JADX INFO: renamed from: g */
    public static final ConcurrentHashMap f23303g = new ConcurrentHashMap();

    /* JADX INFO: renamed from: h */
    public static final ConcurrentHashMap f23304h = new ConcurrentHashMap();

    /* JADX INFO: renamed from: i */
    public static final AtomicReference f23305i = new AtomicReference();

    /* JADX INFO: renamed from: j */
    public static final ConcurrentHashMap f23306j = new ConcurrentHashMap();

    /* JADX INFO: renamed from: k */
    public static final int[] f23307k;

    /* JADX INFO: renamed from: l */
    public static final Set f23308l;

    /* JADX INFO: renamed from: m */
    public static final C5713f f23309m;

    /* JADX INFO: renamed from: n */
    public static final C5713f f23310n;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        int[] iArr = new int[Opcodes.ACC_NATIVE];
        for (int i9 = 0; i9 < 256; i9++) {
            int i10 = i9 << 24;
            for (int i11 = 0; i11 < 8; i11++) {
                i10 = (Integer.MIN_VALUE & i10) != 0 ? (i10 << 1) ^ 79764919 : i10 << 1;
            }
            iArr[i9] = i10;
        }
        f23307k = iArr;
        f23308l = AbstractC4156d0.m8355W("mp3", "wav", "ogg", "aac", "m4a", "silk");
        f23309m = new C5713f("auto_accept_label_new_friend_enable", "auto_accept_label_date_enable", "auto_accept_label_date_format", "auto_accept_label_existing_enable", "auto_accept_label_selected_names", "auto_accept_remark_new_friend_enable", "auto_accept_remark_nickname_suffix_enable", "auto_accept_remark_date_enable", "auto_accept_remark_date_format", "auto_accept_remark_custom_enable", "auto_accept_remark_custom_text");
        f23310n = new C5713f("greet_accepted_label_new_friend_enable", "greet_accepted_label_date_enable", "greet_accepted_label_date_format", "greet_accepted_label_existing_enable", "greet_accepted_label_selected_names", "greet_accepted_remark_new_friend_enable", "greet_accepted_remark_nickname_suffix_enable", "greet_accepted_remark_date_enable", "greet_accepted_remark_date_format", "greet_accepted_remark_custom_enable", "greet_accepted_remark_custom_text");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: A */
    public static String m10329A(C2351o c2351o) {
        String strM5614a = c2351o.f7717e;
        if (AbstractC3149m.m6721t0(strM5614a)) {
            strM5614a = c2351o.m5614a();
        }
        if (AbstractC3149m.m6721t0(strM5614a)) {
            strM5614a = c2351o.f7718f;
        }
        Pattern patternCompile = Pattern.compile("^[^\\s:]{3,80}:\\n");
        patternCompile.getClass();
        strM5614a.getClass();
        String strReplaceAll = patternCompile.matcher(strM5614a).replaceAll(HttpUrl.FRAGMENT_ENCODE_SET);
        strReplaceAll.getClass();
        return AbstractC3149m.m6703R0(strReplaceAll).toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: B */
    public static void m10330B(JSONObject jSONObject, C5727t c5727t) throws JSONException {
        String string = AbstractC3149m.m6703R0(c5727t.f23324h).toString();
        if (AbstractC3149m.m6721t0(string)) {
            string = null;
        }
        if (string != null) {
            jSONObject.put("tts_voice", string);
            jSONObject.put("voice", string);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:14:0x005a  */
    /* JADX INFO: renamed from: C */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String m10331C(String str) {
        boolean z9;
        ArrayList arrayListM10343O = m10343O(str);
        ArrayList arrayList = new ArrayList(AbstractC4167n.m8429e1(arrayListM10343O));
        Iterator it = arrayListM10343O.iterator();
        while (it.hasNext()) {
            arrayList.add(new File((String) it.next()));
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next = it2.next();
            File file = (File) next;
            if (file.isFile()) {
                String lowerCase = AbstractC0793l.m2023c0(file).toLowerCase(Locale.ROOT);
                lowerCase.getClass();
                z9 = f23308l.contains(lowerCase);
            }
            if (z9) {
                arrayList2.add(next);
            }
        }
        if (!arrayList2.isEmpty()) {
            AbstractC2133a abstractC2133a = AbstractC2136d.f7122g;
            if (!arrayList2.isEmpty()) {
                return ((File) arrayList2.get(AbstractC2136d.f7122g.m5360g(arrayList2.size()))).getAbsolutePath();
            }
            C2104o.m5287l("Collection is empty.");
            return null;
        }
        File file2 = new File(str);
        if (file2.isDirectory()) {
            File[] fileArrListFiles = file2.listFiles(new C1129h1(1));
            if (fileArrListFiles == null) {
                fileArrListFiles = new File[0];
            }
            AbstractC2133a abstractC2133a2 = AbstractC2136d.f7122g;
            File file3 = fileArrListFiles.length == 0 ? null : fileArrListFiles[AbstractC2136d.f7122g.m5360g(fileArrListFiles.length)];
            if (file3 != null) {
                return file3.getAbsolutePath();
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:189:0x052a */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:191:0x0532 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:38:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01bf  */
    /* JADX WARN: Type inference failed for: r11v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v20 */
    /* JADX WARN: Type inference failed for: r17v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r32v0 */
    /* JADX WARN: Type inference failed for: r32v1, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r32v11 */
    /* JADX WARN: Type inference failed for: r32v12 */
    /* JADX WARN: Type inference failed for: r32v13 */
    /* JADX WARN: Type inference failed for: r32v2 */
    /* JADX WARN: Type inference failed for: r32v3 */
    /* JADX WARN: Type inference failed for: r32v4, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r32v5 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r3v56 */
    /* JADX INFO: renamed from: D */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C5719l m10332D(Context context, String str, String str2, boolean z9) throws NoSuchAlgorithmException {
        long j3;
        String string;
        boolean z10;
        ?? absolutePath;
        String str3;
        long j4;
        Object c3959f;
        Iterable<List> iterableM8407P1;
        ?? M10350V;
        boolean z11;
        ?? c5722o;
        String str4;
        C5718k c5718k;
        Object c3959f2;
        C5727t c5727tM10395o = new C5725r(context).m10395o();
        String string2 = AbstractC3149m.m6703R0(c5727tM10395o.f23317a).toString();
        if (AbstractC3149m.m6721t0(string2)) {
            try {
                Toast.makeText(context, "请先配置小智 WebSocket 地址", 0).show();
            } catch (Throwable unused) {
            }
            return new C5719l();
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        String strM1033v = AbstractC0255e.m1033v(AbstractC3149m.m6703R0(c5727tM10395o.f23317a).toString(), "|", AbstractC3149m.m6703R0(c5727tM10395o.f23322f).toString(), "|", str);
        ConcurrentHashMap concurrentHashMap = f23303g;
        Object obj = concurrentHashMap.get(strM1033v);
        if (obj == null) {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            long jCurrentTimeMillis2 = System.currentTimeMillis();
            long jMo5358d = AbstractC2136d.f7122g.mo5358d();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            int i9 = 1;
            sb2.append(":");
            sb2.append(jCurrentTimeMillis2);
            sb2.append(":");
            sb2.append(jMo5358d);
            byte[] bytes = sb2.toString().getBytes(AbstractC3137a.f10177a);
            bytes.getClass();
            byte[] bArrDigest = messageDigest.digest(bytes);
            bArrDigest.getClass();
            StringBuilder sb3 = new StringBuilder();
            sb3.append((CharSequence) HttpUrl.FRAGMENT_ENCODE_SET);
            int length = bArrDigest.length;
            int i10 = 0;
            int i11 = 0;
            while (i10 < length) {
                byte b10 = bArrDigest[i10];
                i11++;
                int i12 = i9;
                if (i11 > i12) {
                    sb3.append((CharSequence) HttpUrl.FRAGMENT_ENCODE_SET);
                }
                sb3.append((CharSequence) String.format("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(b10)}, i12)));
                i10++;
                jCurrentTimeMillis = jCurrentTimeMillis;
                i9 = 1;
            }
            j3 = jCurrentTimeMillis;
            sb3.append((CharSequence) HttpUrl.FRAGMENT_ENCODE_SET);
            String strConcat = "hchat_".concat(AbstractC3149m.m6701P0(16, sb3.toString()));
            Object objPutIfAbsent = concurrentHashMap.putIfAbsent(strM1033v, strConcat);
            obj = objPutIfAbsent == null ? strConcat : objPutIfAbsent;
        } else {
            j3 = jCurrentTimeMillis;
        }
        String str5 = (String) obj;
        String strM10366l = m10366l(str2);
        if (!AbstractC3149m.m6721t0(strM10366l)) {
            boolean z12 = c5727tM10395o.f23325i;
            boolean z13 = c5727tM10395o.f23328l;
            if (z12 || z13) {
                C4329c c4329cM7E = AbstractC0000a.m7E();
                if (c5727tM10395o.f23325i) {
                    c4329cM7E.add("官方 Music MCP");
                }
                if (z13 && !AbstractC3149m.m6721t0(AbstractC3149m.m6703R0(c5727tM10395o.f23329m).toString())) {
                    c4329cM7E.add("Hchat 点歌工具");
                }
                String strM8392A1 = AbstractC4166m.m8392A1(AbstractC0000a.m90t(c4329cM7E), " 或 ", null, null, null, 62);
                if (AbstractC3149m.m6721t0(strM8392A1)) {
                    string = str2;
                } else {
                    StringBuilder sbM1027p = AbstractC0255e.m1027p("用户想听歌，关键词是「", strM10366l, "」。请优先调用", strM8392A1, "播放或发送音乐卡片；不要先说你不能播放、没有找到或需要用户自己打开播放器。原始请求：");
                    sbM1027p.append(str2);
                    string = sbM1027p.toString();
                }
            }
        }
        if (c5727tM10395o.f23325i) {
            String string3 = AbstractC3149m.m6703R0(str2).toString();
            if (!AbstractC3149m.m6721t0(string3)) {
                if (AbstractC3149m.m6721t0(m10366l(string3))) {
                    List listM101y0 = AbstractC0000a.m101y0("笑话", "段子", "讲个笑话", "讲笑话", "新闻", "资讯", "热点", "头条", "天气", "气温", "下雨", "下雪", "空气质量", "知识库", "知识", "资料", "百科", "查询", "查一下", "搜索");
                    if (!listM101y0.isEmpty()) {
                        Iterator it = listM101y0.iterator();
                        while (it.hasNext()) {
                            if (AbstractC3149m.m6709h0(string3, (String) it.next(), false)) {
                            }
                        }
                    }
                    z10 = false;
                }
                z10 = true;
                break;
            }
            z10 = false;
        }
        boolean z14 = c5727tM10395o.f23326j;
        C5718k c5718k2 = null;
        C5718k c5718k3 = null;
        if (z14) {
            AtomicReference atomicReference = f23305i;
            String string4 = AbstractC3149m.m6703R0(c5727tM10395o.f23327k).toString();
            if (c5727tM10395o.f23326j) {
                C5718k c5718k4 = (C5718k) atomicReference.get();
                boolean z15 = c5727tM10395o.f23328l;
                String string5 = AbstractC3149m.m6703R0(c5727tM10395o.f23329m).toString();
                String string6 = AbstractC3149m.m6703R0(c5727tM10395o.f23330n).toString();
                if (AbstractC3149m.m6721t0(string6)) {
                    string6 = "queryKugouMusic";
                }
                str3 = string;
                long jM7909r = ((long) AbstractC3754e0.m7909r(c5727tM10395o.f23332p, 10, 600)) * 1000;
                if (c5718k4 != null && !c5718k4.f23263i.get() && AbstractC1416l.m3825a(c5718k4.f23255a, string4) && c5718k4.f23256b == z15 && AbstractC1416l.m3825a(c5718k4.f23257c, string5) && c5718k4.f23258d.equals(string6)) {
                    str4 = string4;
                    if (c5718k4.f23259e == jM7909r) {
                        c5718k4.f23260f.set(str);
                        c5718k4.m10320f(str5, str);
                        c5718k3 = c5718k4;
                        j4 = j3;
                        c5718k = null;
                    }
                } else {
                    str4 = string4;
                }
                if (c5718k4 != null) {
                    c5718k4.m10317b("endpoint changed");
                }
                j4 = j3;
                c5718k = null;
                c5718k = null;
                C5718k c5718k5 = new C5718k(str4, str, z15, string5, string6, jM7909r);
                c5718k5.m10320f(str5, str);
                while (true) {
                    if (atomicReference.compareAndSet(c5718k4, c5718k5)) {
                        c5718k5.m10318c();
                        c5718k3 = c5718k5;
                        break;
                    }
                    if (atomicReference.get() != c5718k4) {
                        c5718k5.m10317b("replaced");
                        c5718k3 = (C5718k) atomicReference.get();
                        break;
                    }
                }
            } else {
                C5718k c5718k6 = (C5718k) atomicReference.getAndSet(null);
                if (c5718k6 != null) {
                    c5718k6.m10317b("disabled");
                }
                c5718k = null;
                str3 = string;
                j4 = j3;
            }
            if (c5718k3 != null) {
                long jM7909r2 = ((long) AbstractC3754e0.m7909r(c5727tM10395o.f23331o, 1, 30)) * 1000;
                boolean zM6721t0 = AbstractC3149m.m6721t0(c5718k3.f23255a);
                c5718k2 = c5718k3;
                absolutePath = c5718k;
                if (!zM6721t0) {
                    try {
                        c3959f2 = Boolean.valueOf(c5718k3.f23267m.await(jM7909r2, TimeUnit.MILLISECONDS));
                    } catch (Throwable th2) {
                        c3959f2 = new C3959f(th2);
                    }
                    Boolean bool = Boolean.FALSE;
                    boolean z16 = c3959f2 instanceof C3959f;
                    Object obj2 = c3959f2;
                    if (z16) {
                        obj2 = bool;
                    }
                    c5718k2 = c5718k3;
                    absolutePath = c5718k;
                }
            } else {
                c5718k2 = c5718k;
                absolutePath = c5718k;
            }
        } else {
            absolutePath = 0;
            str3 = string;
            j4 = j3;
        }
        AtomicReference atomicReference2 = new AtomicReference(HttpUrl.FRAGMENT_ENCODE_SET);
        StringBuilder sb4 = new StringBuilder();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        CountDownLatch countDownLatch = new CountDownLatch(1);
        AtomicReference atomicReference3 = new AtomicReference();
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        AtomicBoolean atomicBoolean2 = new AtomicBoolean(false);
        AtomicBoolean atomicBoolean3 = new AtomicBoolean(false);
        AtomicReference atomicReference4 = new AtomicReference();
        AtomicReference atomicReference5 = new AtomicReference();
        AtomicReference atomicReference6 = new AtomicReference();
        AtomicBoolean atomicBoolean4 = new AtomicBoolean(false);
        C1423s c1423s = new C1423s();
        c1423s.f4736g = C4143c.DEFAULT_HZ;
        C1423s c1423s2 = new C1423s();
        c1423s2.f4736g = 1;
        C1423s c1423s3 = new C1423s();
        c1423s3.f4736g = 60;
        String str6 = str3;
        C1425u c1425u = new C1425u();
        C5718k c5718k7 = c5718k2;
        C1423s c1423s4 = c1423s3;
        C1423s c1423s5 = c1423s;
        C1423s c1423s6 = c1423s2;
        c1425u.f4738g = new C5720m(new C5167o7(c5718k7, context, str5, str6, c5727tM10395o, atomicBoolean3, atomicBoolean, atomicReference4, c1423s, c1423s2, c1423s3), new C5251qp(c5718k7, atomicBoolean3, atomicReference4, atomicReference5, atomicBoolean2, z9, atomicBoolean4, atomicBoolean, atomicReference3, c1425u, countDownLatch, atomicReference6, str5, arrayList, arrayList2, sb4, atomicReference2), new C0747h(c5718k7, atomicBoolean2, z9, arrayList, 7), new C0506z0(atomicBoolean, atomicReference4, atomicReference5, countDownLatch, atomicReference6, atomicReference3, 15), new C5711d(atomicBoolean, atomicReference4, atomicReference5, countDownLatch, atomicReference6, atomicReference3, 0), new C5711d(atomicBoolean, atomicReference4, atomicReference5, countDownLatch, atomicReference6, atomicReference3, 1));
        Object obj3 = c1425u.f4738g;
        if (obj3 == null) {
            AbstractC1416l.m3831g("socketRequest");
            throw absolutePath;
        }
        atomicReference6.set((C5720m) obj3);
        try {
            C5721n c5721nM10354Z = m10354Z(context, strM1033v, string2, c5727tM10395o, z14);
            atomicReference3.set(c5721nM10354Z);
            Object obj4 = c1425u.f4738g;
            if (obj4 == null) {
                AbstractC1416l.m3831g("socketRequest");
                throw absolutePath;
            }
            c5721nM10354Z.m10327d((C5720m) obj4);
            if (!countDownLatch.await(60L, TimeUnit.SECONDS)) {
                m10334F(atomicBoolean, atomicReference4, atomicReference5, countDownLatch, atomicReference6, atomicReference3, 128);
            }
            if (!atomicBoolean4.get()) {
                Object obj5 = c1425u.f4738g;
                if (obj5 == null) {
                    AbstractC1416l.m3831g("socketRequest");
                    throw absolutePath;
                }
                c5721nM10354Z.m10325b((C5720m) obj5);
            }
            if (z9) {
                m10335G(z9, arrayList, arrayList2);
                synchronized (arrayList2) {
                    iterableM8407P1 = AbstractC4166m.m8407P1(arrayList2);
                }
            } else {
                iterableM8407P1 = C4173t.f13710g;
            }
            ArrayList arrayList3 = new ArrayList();
            boolean z17 = false;
            for (List list : iterableM8407P1) {
                C1423s c1423s7 = c1423s5;
                C1423s c1423s8 = c1423s6;
                C1423s c1423s9 = c1423s4;
                File fileM10350V = m10350V(context, list, c1423s7.f4736g, c1423s8.f4736g, c1423s9.f4736g);
                if (fileM10350V == null) {
                    c5722o = absolutePath;
                    z11 = true;
                } else {
                    c5722o = new C5722o(fileM10350V, list.size() * c1423s9.f4736g);
                    z11 = z17;
                }
                if (c5722o != 0) {
                    arrayList3.add(c5722o);
                }
                c1423s5 = c1423s7;
                c1423s6 = c1423s8;
                c1423s4 = c1423s9;
                z17 = z11;
            }
            C1423s c1423s10 = c1423s5;
            C1423s c1423s11 = c1423s6;
            C1423s c1423s12 = c1423s4;
            ArrayList arrayList4 = new ArrayList();
            Iterator it2 = iterableM8407P1.iterator();
            while (it2.hasNext()) {
                AbstractC4171r.m8432h1(arrayList4, (Iterable) it2.next());
            }
            boolean z18 = z10 || (arrayList3.size() >= 3) || z17;
            if (!z9 || (!(z18 || arrayList3.isEmpty() || z17) || arrayList4.isEmpty())) {
                M10350V = absolutePath;
            } else {
                if (z17) {
                    Iterator it3 = arrayList3.iterator();
                    while (it3.hasNext()) {
                        try {
                            ((C5722o) it3.next()).f23293a.delete();
                        } catch (Throwable unused2) {
                        }
                    }
                }
                M10350V = m10350V(context, arrayList4, c1423s10.f4736g, c1423s11.f4736g, c1423s12.f4736g);
            }
            if (z18 && M10350V != 0) {
                Iterator it4 = arrayList3.iterator();
                while (it4.hasNext()) {
                    try {
                        ((C5722o) it4.next()).f23293a.delete();
                    } catch (Throwable unused3) {
                    }
                }
            }
            int size = arrayList4.size() * c1423s12.f4736g;
            m10376v(c5727tM10395o, str, str2, j4);
            Object obj6 = atomicReference2.get();
            obj6.getClass();
            String str7 = (String) obj6;
            if (M10350V != 0) {
                ?? r12 = (!M10350V.isFile() || M10350V.length() <= 0) ? absolutePath : M10350V;
                if (r12 != 0) {
                    absolutePath = r12.getAbsolutePath();
                }
            }
            if (absolutePath == 0) {
                absolutePath = HttpUrl.FRAGMENT_ENCODE_SET;
            }
            c3959f = new C5719l(str7, absolutePath, M10350V != 0 ? M10350V.length() : m10333E(arrayList, arrayList2), size, (z17 || z18) ? C4173t.f13710g : arrayList3, z18, z18 ? arrayList3.size() : 0);
        } catch (Throwable th3) {
            c3959f = new C3959f(th3);
        }
        Throwable thM8182b = C3960g.m8182b(c3959f);
        Object c5719l = c3959f;
        if (thM8182b != null) {
            AbstractC1184v0.m3204n("[Hchat:AutoReply] 小智AI 请求失败: " + thM8182b.getMessage(), thM8182b);
            c5719l = new C5719l();
        }
        return (C5719l) c5719l;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: E */
    public static final long m10333E(ArrayList arrayList, ArrayList arrayList2) {
        long length;
        long length2;
        synchronized (arrayList) {
            Iterator it = arrayList.iterator();
            length = 0;
            length2 = 0;
            while (it.hasNext()) {
                length2 += (long) ((byte[]) it.next()).length;
            }
        }
        synchronized (arrayList2) {
            ArrayList arrayList3 = new ArrayList();
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                AbstractC4171r.m8432h1(arrayList3, (Iterable) it2.next());
            }
            Iterator it3 = arrayList3.iterator();
            while (it3.hasNext()) {
                length += (long) ((byte[]) it3.next()).length;
            }
        }
        return length + length2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: F */
    public static void m10334F(AtomicBoolean atomicBoolean, AtomicReference atomicReference, AtomicReference atomicReference2, CountDownLatch countDownLatch, AtomicReference atomicReference3, AtomicReference atomicReference4, int i9) {
        boolean z9 = (i9 & 64) == 0;
        boolean z10 = (i9 & 128) != 0;
        if (atomicBoolean.compareAndSet(false, true)) {
            ScheduledFuture scheduledFuture = (ScheduledFuture) atomicReference.getAndSet(null);
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
            }
            ScheduledFuture scheduledFuture2 = (ScheduledFuture) atomicReference2.getAndSet(null);
            if (scheduledFuture2 != null) {
                scheduledFuture2.cancel(false);
            }
            countDownLatch.countDown();
            C5720m c5720m = (C5720m) atomicReference3.get();
            if (z9) {
                C5721n c5721n = (C5721n) atomicReference4.get();
                if (c5721n != null) {
                    c5721n.m10324a("reply failed");
                    return;
                }
                return;
            }
            if (!z10 || c5720m == null) {
                C5721n c5721n2 = (C5721n) atomicReference4.get();
                if (c5721n2 != null) {
                    c5721n2.m10328e();
                    return;
                }
                return;
            }
            C5721n c5721n3 = (C5721n) atomicReference4.get();
            if (c5721n3 != null) {
                c5721n3.m10325b(c5720m);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: G */
    public static final void m10335G(boolean z9, ArrayList arrayList, ArrayList arrayList2) {
        if (z9) {
            synchronized (arrayList) {
                if (arrayList.isEmpty()) {
                    return;
                }
                synchronized (arrayList2) {
                    arrayList2.add(AbstractC4166m.m8407P1(arrayList));
                }
                arrayList.clear();
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: H */
    public static boolean m10336H(InterfaceC1231l interfaceC1231l, String str) {
        boolean z9 = false;
        for (String str2 : m10343O(str)) {
            if (AbstractC0921a.m2262y(str2) && ((Boolean) interfaceC1231l.invoke(str2)).booleanValue()) {
                z9 = true;
            }
            m10341M(300L);
        }
        return z9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: I */
    public static boolean m10337I(String str, String str2) {
        C2343g c2343gM6844q;
        if (AbstractC3149m.m6721t0(str) || AbstractC3149m.m6721t0(str2) || (c2343gM6844q = AbstractC3199a.m6844q()) == null) {
            return false;
        }
        C3147k c3147k = new C3147k("\\[AtWx=([^\\]]+)]");
        List listM6418b0 = AbstractC3015m.m6418b0(new C3011i(AbstractC3015m.m6413W(C3147k.m6681c(c3147k, str2), new C5319sr(19)), true, new C5319sr(20)));
        String strM6684e = c3147k.m6684e(str2, new C0532s(str, 22));
        return listM6418b0.isEmpty() ? c2343gM6844q.m5601x(str, strM6684e) : c2343gM6844q.m5602y(str, strM6684e, listM6418b0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00f1, code lost:
    
        if (r1 != false) goto L71;
     */
    /* JADX INFO: renamed from: J */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean m10338J(Context context, String str, C5714g c5714g, boolean z9) throws NoSuchAlgorithmException {
        boolean z10;
        C2343g c2343gM6844q;
        boolean z11;
        boolean z12;
        String strM10355a = m10355a(c5714g);
        boolean z13 = false;
        if (AbstractC3149m.m6721t0(strM10355a)) {
            return false;
        }
        C5719l c5719lM10332D = m10332D(context, str, strM10355a, false);
        String str2 = c5719lM10332D.f23269b;
        List list = c5719lM10332D.f23272e;
        String str3 = c5719lM10332D.f23268a;
        if (!c5719lM10332D.f23273f && !list.isEmpty()) {
            C2105p c2105pMedia = WeChatApis.media();
            try {
                int i9 = 0;
                boolean z14 = false;
                for (Object obj : list) {
                    int i10 = i9 + 1;
                    if (i9 < 0) {
                        AbstractC0000a.m32Q0();
                        throw null;
                    }
                    C5722o c5722o = (C5722o) obj;
                    String absolutePath = c5722o.f23293a.getAbsolutePath();
                    absolutePath.getClass();
                    if (m10373s(absolutePath) || AbstractC3156t.m6733W(absolutePath, ".silk", true)) {
                        if (c2105pMedia != null) {
                            int i11 = c5722o.f23294b;
                            if (i11 < 1000) {
                                i11 = 1000;
                            }
                            z12 = z13;
                            if (c2105pMedia.f7036b.m5323s(i11, str, absolutePath)) {
                                z14 = true;
                            }
                        } else {
                            z12 = z13;
                        }
                        if (i9 < list.size() - 1) {
                            m10341M(300L);
                        }
                    } else {
                        z12 = z13;
                    }
                    i9 = i10;
                    z13 = z12;
                }
                z10 = z13;
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    try {
                        ((C5722o) it.next()).f23293a.delete();
                    } catch (Throwable unused) {
                    }
                }
                if (!z14) {
                }
                return true;
            } catch (Throwable th2) {
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    try {
                        ((C5722o) it2.next()).f23293a.delete();
                    } catch (Throwable unused2) {
                    }
                }
                throw th2;
            }
        }
        z10 = false;
        if (!AbstractC3149m.m6721t0(str2) && (m10373s(str2) || AbstractC3156t.m6733W(str2, ".silk", true))) {
            C2105p c2105pMedia2 = WeChatApis.media();
            try {
                if (c2105pMedia2 != null) {
                    int i12 = c5719lM10332D.f23271d;
                    if (c2105pMedia2.f7036b.m5323s(i12 >= 1000 ? i12 : 1000, str, str2)) {
                        z11 = true;
                    }
                    new File(str2).delete();
                }
                new File(str2).delete();
            } catch (Throwable unused3) {
            }
            z11 = z10;
        }
        if (AbstractC3149m.m6721t0(str3) || (c2343gM6844q = AbstractC3199a.m6844q()) == null) {
            return z10;
        }
        if (z9) {
            long j3 = c5714g.f23244d;
            if (j3 > 0) {
                return c2343gM6844q.m5598u(j3, str, str3);
            }
        }
        return m10337I(str, str3);
    }

    /* JADX DEBUG: Another duplicated slice has different insns count: {[]}, finally: {[INVOKE] complete} */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:124:0x0141 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:129:0x0122 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:138:0x007b */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:150:0x00a4 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:68:0x0149 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    /* JADX DEBUG: Incorrect finally slice size: {[MOVE, CONST, CAST] complete}, expected: {[MOVE, CONST, THROW, INVOKE, MOVE_EXCEPTION, THROW, MOVE_EXCEPTION] complete} */
    /* JADX WARN: Can't wrap try/catch for region: R(12:(7:151|20|157|21|16|(0)(0)|(0))(3:23|(1:25)|(11:27|150|28|29|(4:45|144|46|47)(5:35|36|37|(1:39)|40)|148|48|135|49|(0)(0)|(0))(8:57|58|137|142|59|60|(0)(0)|(0)))|153|61|167|62|63|137|142|59|60|(0)(0)|(0)) */
    /* JADX WARN: Can't wrap try/catch for region: R(15:17|138|18|(7:151|20|157|21|16|(0)(0)|(0))(3:23|(1:25)|(11:27|150|28|29|(4:45|144|46|47)(5:35|36|37|(1:39)|40)|148|48|135|49|(0)(0)|(0))(8:57|58|137|142|59|60|(0)(0)|(0)))|153|61|167|62|63|137|142|59|60|(0)(0)|(0)) */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x014b  */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v1, types: [int] */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v12 */
    /* JADX WARN: Type inference failed for: r11v13 */
    /* JADX WARN: Type inference failed for: r11v16 */
    /* JADX WARN: Type inference failed for: r11v17 */
    /* JADX WARN: Type inference failed for: r11v18 */
    /* JADX WARN: Type inference failed for: r11v19 */
    /* JADX WARN: Type inference failed for: r11v20 */
    /* JADX WARN: Type inference failed for: r11v21 */
    /* JADX WARN: Type inference failed for: r11v22 */
    /* JADX WARN: Type inference failed for: r11v23 */
    /* JADX WARN: Type inference failed for: r11v3, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r21v1 */
    /* JADX WARN: Type inference failed for: r21v19 */
    /* JADX WARN: Type inference failed for: r21v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [int] */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX INFO: renamed from: K */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean m10339K(Context context, String str, C5714g c5714g) throws NoSuchAlgorithmException, IOException {
        ?? r11;
        ?? r21;
        ?? r112;
        ?? r113;
        C5714g c5714g2;
        C5722o c5722o;
        Context applicationContext;
        List listM99x0;
        String strM10355a = m10355a(c5714g);
        if (AbstractC3149m.m6721t0(strM10355a)) {
            return false;
        }
        C5719l c5719lM10332D = m10332D(context, str, strM10355a, true);
        String str2 = c5719lM10332D.f23269b;
        List list = c5719lM10332D.f23272e;
        if (list.isEmpty()) {
            if (AbstractC3149m.m6721t0(str2)) {
                String strM10362h = m10362h(c5719lM10332D.f23268a);
                if (AbstractC3149m.m6721t0(strM10362h)) {
                    r112 = 1;
                    c5722o = null;
                    c5714g = null;
                    listM99x0 = c5722o != null ? AbstractC0000a.m99x0(c5722o) : null;
                    if (listM99x0 == null) {
                        listM99x0 = C4173t.f13710g;
                    }
                } else {
                    File file = new File(context.getCacheDir(), "hchat_xiaozhi_reply");
                    file.mkdirs();
                    r112 = "reply_";
                    File fileCreateTempFile = File.createTempFile("reply_", ".wav", file);
                    File fileCreateTempFile2 = File.createTempFile("reply_", ".pcm", file);
                    File fileCreateTempFile3 = File.createTempFile("reply_", ".silk", file);
                    try {
                        try {
                            applicationContext = context.getApplicationContext();
                            applicationContext.getClass();
                            fileCreateTempFile.getClass();
                        } catch (Throwable unused) {
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        r113 = 1;
                        c5714g2 = null;
                    }
                    try {
                        if (m10345Q(applicationContext, strM10362h, fileCreateTempFile)) {
                            byte[] bArrM10347S = m10347S(fileCreateTempFile);
                            if (bArrM10347S.length == 0) {
                                bArrM10347S = null;
                            }
                            if (bArrM10347S != null) {
                                fileCreateTempFile2.getClass();
                                FileOutputStream fileOutputStream = new FileOutputStream(fileCreateTempFile2);
                                try {
                                    try {
                                        fileOutputStream.write(bArrM10347S);
                                        fileOutputStream.close();
                                        int iPcmToSilk = new SilkCodec().pcmToSilk(fileCreateTempFile2.getAbsolutePath(), fileCreateTempFile3.getAbsolutePath(), C4143c.DEFAULT_HZ, 16000, 1);
                                        if (iPcmToSilk == 0 && fileCreateTempFile3.isFile() && fileCreateTempFile3.length() > 0) {
                                            r112 = 1;
                                            c5714g = null;
                                            long length = (((long) (bArrM10347S.length / 2)) * 1000) / ((long) 16000);
                                            if (length < 1000) {
                                                length = 1000;
                                            }
                                            c5722o = new C5722o(fileCreateTempFile3, (int) length);
                                        } else {
                                            r112 = 1;
                                            c5714g = null;
                                            AbstractC1184v0.m3203m("[Hchat:AutoReply] 小智语音本地 TTS 转 Silk 失败: " + iPcmToSilk);
                                            try {
                                                fileCreateTempFile3.delete();
                                            } catch (Throwable unused2) {
                                            }
                                            c5722o = null;
                                        }
                                        try {
                                            fileCreateTempFile.delete();
                                        } catch (Throwable unused3) {
                                        }
                                        try {
                                            fileCreateTempFile2.delete();
                                        } catch (Throwable unused4) {
                                        }
                                    } catch (Throwable th3) {
                                        th = th3;
                                        r113 = r112;
                                        c5714g2 = c5714g;
                                        AbstractC1184v0.m3204n("[Hchat:AutoReply] 小智语音本地 TTS 失败: " + th.getMessage(), th);
                                        fileCreateTempFile3.delete();
                                        fileCreateTempFile.delete();
                                        r112 = r113;
                                        c5714g = c5714g2;
                                        fileCreateTempFile2.delete();
                                        c5722o = null;
                                    }
                                    if (c5722o != null) {
                                    }
                                    if (listM99x0 == null) {
                                    }
                                } catch (Throwable th4) {
                                    r112 = 1;
                                    c5714g = null;
                                    c5714g = null;
                                    try {
                                        throw th4;
                                    } catch (Throwable th5) {
                                        AbstractC2043a.m5035i(fileOutputStream, th4);
                                        throw th5;
                                    }
                                }
                            } else {
                                r112 = 1;
                                c5714g = null;
                                fileCreateTempFile.delete();
                                fileCreateTempFile2.delete();
                                c5722o = null;
                                if (c5722o != null) {
                                }
                                if (listM99x0 == null) {
                                }
                            }
                        } else {
                            try {
                                fileCreateTempFile.delete();
                            } catch (Throwable unused5) {
                            }
                            try {
                                fileCreateTempFile2.delete();
                            } catch (Throwable unused6) {
                            }
                            r112 = 1;
                            c5722o = null;
                            c5714g = null;
                            if (c5722o != null) {
                            }
                            if (listM99x0 == null) {
                            }
                        }
                        AbstractC1184v0.m3204n("[Hchat:AutoReply] 小智语音本地 TTS 失败: " + th.getMessage(), th);
                        fileCreateTempFile3.delete();
                        fileCreateTempFile.delete();
                        r112 = r113;
                        c5714g = c5714g2;
                        fileCreateTempFile2.delete();
                        c5722o = null;
                        if (c5722o != null) {
                        }
                        if (listM99x0 == null) {
                        }
                    } catch (Throwable th6) {
                        try {
                            fileCreateTempFile.delete();
                        } catch (Throwable unused7) {
                        }
                        try {
                            fileCreateTempFile2.delete();
                            throw th6;
                        } catch (Throwable unused8) {
                            throw th6;
                        }
                    }
                }
            } else {
                File file2 = new File(str2);
                int i9 = c5719lM10332D.f23271d;
                if (i9 < 1000) {
                    i9 = 1000;
                }
                listM99x0 = AbstractC0000a.m99x0(new C5722o(file2, i9));
                r112 = 1;
                c5714g = null;
            }
            list = listM99x0;
            r11 = r112;
            r21 = c5714g;
        } else {
            r11 = 1;
            r21 = 0;
        }
        if (list.isEmpty()) {
            return r21;
        }
        try {
            C2105p c2105pMedia = WeChatApis.media();
            if (c2105pMedia == null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    try {
                        ((C5722o) it.next()).f23293a.delete();
                    } catch (Throwable unused9) {
                    }
                }
                return r21;
            }
            ?? r32 = r21;
            ?? r42 = r32 == true ? 1 : 0;
            ?? r33 = r32;
            for (Object obj : list) {
                int i10 = r33 + 1;
                if (r33 < 0) {
                    AbstractC0000a.m32Q0();
                    throw null;
                }
                C5722o c5722o2 = (C5722o) obj;
                String absolutePath = c5722o2.f23293a.getAbsolutePath();
                int i11 = c5722o2.f23294b;
                if (i11 < 1000) {
                    i11 = 1000;
                }
                ?? r43 = r42;
                if (c2105pMedia.f7036b.m5323s(i11, str, absolutePath)) {
                    r43 = r11;
                }
                if (r33 < list.size() - r11) {
                    m10341M(300L);
                }
                r33 = i10;
                r42 = r43;
            }
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                try {
                    ((C5722o) it2.next()).f23293a.delete();
                } catch (Throwable unused10) {
                }
            }
            return r42;
        } catch (Throwable th7) {
            Iterator it3 = list.iterator();
            while (it3.hasNext()) {
                try {
                    ((C5722o) it3.next()).f23293a.delete();
                } catch (Throwable unused11) {
                }
            }
            throw th7;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: L */
    public static boolean m10340L(Context context, String str, C5714g c5714g, boolean z9) {
        String strM10360f;
        String strM10362h;
        C2343g c2343gM6844q;
        C5725r c5725r = new C5725r(context);
        C5728u c5728uM10381a = c5725r.m10381a();
        boolean zM10385e = c5725r.m10385e("ai_stream");
        C5728u c5728uM10399b = c5728uM10381a.m10399b();
        String str2 = c5728uM10399b.f23334b;
        String str3 = c5728uM10399b.f23335c;
        String str4 = c5728uM10399b.f23336d;
        String str5 = c5728uM10399b.f23337e;
        String str6 = c5728uM10399b.f23338f;
        C5707a c5707a = new C5707a(str2, str3, str4, str5, str6, c5728uM10399b.f23339g, zM10385e);
        if (AbstractC3149m.m6721t0(str2)) {
            try {
                Toast.makeText(context, "请先配置自动回复 AI Key", 0).show();
                return false;
            } catch (Throwable unused) {
            }
        } else {
            String strM10355a = m10355a(c5714g);
            if (!AbstractC3149m.m6721t0(strM10355a)) {
                ConcurrentHashMap concurrentHashMap = f23302f;
                Object obj = concurrentHashMap.get(str);
                Object obj2 = obj;
                if (obj == null) {
                    ArrayList arrayList = new ArrayList();
                    if (!AbstractC3149m.m6721t0(str6)) {
                        arrayList.add(new C5712e("system", str6));
                    }
                    Object objPutIfAbsent = concurrentHashMap.putIfAbsent(str, arrayList);
                    obj2 = arrayList;
                    if (objPutIfAbsent != null) {
                        obj2 = objPutIfAbsent;
                    }
                }
                List list = (List) obj2;
                synchronized (list) {
                    try {
                        C5712e c5712e = (C5712e) AbstractC4166m.m8424v1(list);
                        if (!AbstractC1416l.m3825a(c5712e != null ? c5712e.f23228a : null, "system") || AbstractC1416l.m3825a(((C5712e) AbstractC4166m.m8422t1(list)).f23229b, str6)) {
                            if (!list.isEmpty()) {
                                Iterator it = list.iterator();
                                while (it.hasNext()) {
                                    if (((C5712e) it.next()).f23228a.equals("system")) {
                                        break;
                                    }
                                }
                            }
                            if (!AbstractC3149m.m6721t0(c5707a.f23193e)) {
                                list.add(0, new C5712e("system", c5707a.f23193e));
                            }
                        } else if (AbstractC3149m.m6721t0(str6)) {
                            list.remove(0);
                        } else {
                            list.set(0, new C5712e("system", str6));
                        }
                        list.add(new C5712e("user", strM10355a));
                        m10346R(c5707a.f23194f, list);
                        if (c5707a.f23195g) {
                            strM10360f = m10361g(c5707a, list);
                            if (strM10360f == null) {
                                strM10360f = m10360f(c5707a, list);
                            }
                        } else {
                            strM10360f = m10360f(c5707a, list);
                            if (strM10360f == null) {
                                strM10360f = m10361g(c5707a, list);
                            }
                        }
                        if (strM10360f == null) {
                            strM10360f = HttpUrl.FRAGMENT_ENCODE_SET;
                        }
                        strM10362h = m10362h(strM10360f);
                        if (!AbstractC3149m.m6721t0(strM10362h)) {
                            list.add(new C5712e("assistant", strM10362h));
                            m10346R(c5707a.f23194f, list);
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                if (!AbstractC3149m.m6721t0(strM10362h) && (c2343gM6844q = AbstractC3199a.m6844q()) != null) {
                    if (z9) {
                        long j3 = c5714g.f23244d;
                        if (j3 > 0) {
                            return c2343gM6844q.m5598u(j3, str, strM10362h);
                        }
                    }
                    return m10337I(str, strM10362h);
                }
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: M */
    public static void m10341M(long j3) {
        if (j3 <= 0) {
            return;
        }
        try {
            Thread.sleep(j3);
        } catch (Throwable unused) {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: N */
    public static ArrayList m10342N(String str) {
        List listM6691F0 = AbstractC3149m.m6691F0(str, new char[]{'|', 65292, ',', '\n'}, 6);
        ArrayList arrayList = new ArrayList(AbstractC4167n.m8429e1(listM6691F0));
        Iterator it = listM6691F0.iterator();
        while (it.hasNext()) {
            AbstractC2091b.m5171r((String) it.next(), arrayList);
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (((String) obj).length() > 0) {
                arrayList2.add(obj);
            }
        }
        return arrayList2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: O */
    public static ArrayList m10343O(String str) {
        List listM6692G0 = AbstractC3149m.m6692G0(str, new String[]{";;;"});
        ArrayList arrayList = new ArrayList();
        Iterator it = listM6692G0.iterator();
        while (it.hasNext()) {
            AbstractC4171r.m8432h1(arrayList, AbstractC3149m.m6691F0((String) it.next(), new char[]{'\n'}, 6));
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            AbstractC4171r.m8432h1(arrayList2, AbstractC3149m.m6691F0((String) it2.next(), new char[]{'|'}, 6));
        }
        ArrayList arrayList3 = new ArrayList(AbstractC4167n.m8429e1(arrayList2));
        Iterator it3 = arrayList2.iterator();
        while (it3.hasNext()) {
            AbstractC2091b.m5171r((String) it3.next(), arrayList3);
        }
        ArrayList arrayList4 = new ArrayList();
        for (Object obj : arrayList3) {
            if (((String) obj).length() > 0) {
                arrayList4.add(obj);
            }
        }
        return arrayList4;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: P */
    public static ArrayList m10344P(String str) {
        List listM6691F0 = AbstractC3149m.m6691F0(str, new char[]{'|'}, 6);
        ArrayList arrayList = new ArrayList(AbstractC4167n.m8429e1(listM6691F0));
        Iterator it = listM6691F0.iterator();
        while (it.hasNext()) {
            AbstractC2091b.m5171r((String) it.next(), arrayList);
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (((String) obj).length() > 0) {
                arrayList2.add(obj);
            }
        }
        if (!arrayList2.isEmpty()) {
            return arrayList2;
        }
        List listM99x0 = AbstractC0000a.m99x0(str);
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : listM99x0) {
            if (!AbstractC3149m.m6721t0((String) obj2)) {
                arrayList3.add(obj2);
            }
        }
        return arrayList3;
    }

    /* JADX DEBUG: Another duplicated slice has different insns count: {[]}, finally: {[INVOKE] complete} */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0086  */
    /* JADX INFO: renamed from: Q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean m10345Q(Context context, String str, File file) {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        boolean z9 = true;
        CountDownLatch countDownLatch = new CountDownLatch(1);
        CountDownLatch countDownLatch2 = new CountDownLatch(1);
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        String strM1018g = AbstractC0255e.m1018g(System.nanoTime(), "hchat_xiaozhi_");
        C1423s c1423s = new C1423s();
        c1423s.f4736g = -1;
        TextToSpeech textToSpeech = new TextToSpeech(context, new C3108a(c1423s, countDownLatch, 1));
        try {
            if (!countDownLatch.await(8L, timeUnit)) {
                return false;
            }
            if (c1423s.f4736g != 0) {
                try {
                    textToSpeech.shutdown();
                } catch (Throwable unused) {
                }
                return false;
            }
            try {
                textToSpeech.setLanguage(Locale.CHINA);
            } catch (Throwable unused2) {
            }
            textToSpeech.setOnUtteranceProgressListener(new C5723p(atomicBoolean, countDownLatch2));
            Bundle bundle = new Bundle();
            bundle.putString("utteranceId", strM1018g);
            if (textToSpeech.synthesizeToFile(str, bundle, file, strM1018g) == -1) {
                try {
                    textToSpeech.shutdown();
                } catch (Throwable unused3) {
                }
                return false;
            }
            if (!countDownLatch2.await(20L, timeUnit) || !atomicBoolean.get() || !file.isFile()) {
                z9 = false;
            } else if (file.length() <= 44) {
            }
            try {
                textToSpeech.shutdown();
            } catch (Throwable unused4) {
            }
            return z9;
        } finally {
            try {
                textToSpeech.shutdown();
            } catch (Throwable unused5) {
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Type inference failed for: r4v8, types: [boolean] */
    /* JADX INFO: renamed from: R */
    public static void m10346R(int i9, List list) {
        if (i9 < 0) {
            i9 = 0;
        }
        int i10 = i9 * 2;
        C5712e c5712e = (C5712e) AbstractC4166m.m8424v1(list);
        int i11 = (AbstractC1416l.m3825a(c5712e != null ? c5712e.f23228a : null, "system") ? 1 : 0) + i10;
        if (i11 <= 0) {
            list.clear();
            return;
        }
        while (list.size() > i11) {
            C5712e c5712e2 = (C5712e) AbstractC4166m.m8424v1(list);
            ?? M3825a = AbstractC1416l.m3825a(c5712e2 != null ? c5712e2.f23228a : null, "system");
            if (M3825a < 0 || M3825a >= list.size()) {
                return;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0071, code lost:
    
        r10 = -1;
        r11 = 0;
     */
    /* JADX INFO: renamed from: S */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static byte[] m10347S(File file) throws IOException {
        int i9;
        int iM10375u;
        int i10;
        byte[] bArrM2027g0 = AbstractC0793l.m2027g0(file);
        int i11 = 0;
        if (bArrM2027g0.length <= 44 || !new String(bArrM2027g0, 0, 4, AbstractC3137a.f10178b).equals("RIFF")) {
            return new byte[0];
        }
        int i12 = 12;
        int i13 = 16000;
        int i14 = 1;
        int iM10374t = 16;
        int i15 = 16000;
        int iM10374t2 = 1;
        while (true) {
            i9 = i12 + 8;
            if (i9 > bArrM2027g0.length) {
                break;
            }
            String str = new String(bArrM2027g0, i12, 4, AbstractC3137a.f10178b);
            iM10375u = m10375u(bArrM2027g0, i12 + 4);
            int i16 = i9 + iM10375u;
            if (i16 > bArrM2027g0.length) {
                break;
            }
            if (!str.equals("fmt ")) {
                if (str.equals("data")) {
                    break;
                }
            } else if (iM10375u >= 16) {
                iM10374t2 = m10374t(bArrM2027g0, i12 + 10);
                if (iM10374t2 < 1) {
                    iM10374t2 = 1;
                }
                int iM10375u2 = m10375u(bArrM2027g0, i12 + 12);
                i15 = iM10375u2 >= 8000 ? iM10375u2 : 8000;
                iM10374t = m10374t(bArrM2027g0, i12 + 22);
            }
            i12 = (iM10375u & 1) + i16;
        }
        if (i9 < 0 || iM10375u <= 0 || iM10374t != 16) {
            return new byte[0];
        }
        int i17 = (iM10375u / 2) / iM10374t2;
        if (i17 <= 0) {
            return new byte[0];
        }
        short[] sArr = new short[i17];
        int i18 = 0;
        while (i18 < i17) {
            int i19 = i14;
            int iM10374t3 = 0;
            for (int i20 = 0; i20 < iM10374t2; i20++) {
                iM10374t3 += (short) m10374t(bArrM2027g0, i9);
                i9 += 2;
            }
            sArr[i18] = (short) AbstractC3754e0.m7909r(iM10374t3 / iM10374t2, -32768, 32767);
            i18++;
            i14 = i19;
            i13 = 16000;
        }
        if (i15 == i13) {
            i10 = i14;
        } else if (i17 != 0 && i15 > 0) {
            if (i15 != i13) {
                long j3 = (((long) i17) * ((long) i13)) / ((long) i15);
                if (j3 < 1) {
                    j3 = 1;
                }
                int i21 = (int) j3;
                short[] sArr2 = new short[i21];
                int i22 = 0;
                while (i22 < i21) {
                    double d10 = (((double) i22) * ((double) i15)) / ((double) i13);
                    int i23 = i17 - 1;
                    int iM7909r = AbstractC3754e0.m7909r((int) d10, 0, i23);
                    int i24 = iM7909r + 1;
                    if (i24 <= i23) {
                        i23 = i24;
                    }
                    int i25 = i14;
                    double d11 = d10 - ((double) iM7909r);
                    sArr2[i22] = (short) AbstractC3754e0.m7909r((int) ((((double) sArr[i23]) * d11) + ((1.0d - d11) * ((double) sArr[iM7909r]))), -32768, 32767);
                    i22++;
                    i14 = i25;
                    i13 = 16000;
                }
                sArr = sArr2;
            }
            i10 = i14;
        } else {
            i10 = i14;
            sArr = new short[0];
        }
        byte[] bArr = new byte[sArr.length * 2];
        int length = sArr.length;
        int i26 = 0;
        while (i11 < length) {
            short s10 = sArr[i11];
            int i27 = i26 + 1;
            int i28 = i26 * 2;
            bArr[i28] = (byte) (s10 & 255);
            bArr[i28 + i10] = (byte) ((s10 >>> 8) & 255);
            i11++;
            i26 = i27;
        }
        return bArr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: T */
    public static void m10348T(ByteArrayOutputStream byteArrayOutputStream, int i9) {
        byteArrayOutputStream.write(i9 & 255);
        byteArrayOutputStream.write((i9 >>> 8) & 255);
        byteArrayOutputStream.write((i9 >>> 16) & 255);
        byteArrayOutputStream.write((i9 >>> 24) & 255);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: U */
    public static void m10349U(ByteArrayOutputStream byteArrayOutputStream, int i9, long j3, int i10, int i11, List list) throws IOException {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            int length = ((byte[]) it.next()).length;
            while (length >= 255) {
                arrayList.add(255);
                length -= 255;
            }
            arrayList.add(Integer.valueOf(length));
        }
        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
        byte[] bytes = "OggS".getBytes(AbstractC3137a.f10178b);
        bytes.getClass();
        byteArrayOutputStream2.write(bytes);
        byteArrayOutputStream2.write(0);
        byteArrayOutputStream2.write(i9);
        for (int i12 = 0; i12 < 8; i12++) {
            byteArrayOutputStream2.write((int) ((j3 >>> (i12 * 8)) & 255));
        }
        m10348T(byteArrayOutputStream2, i10);
        m10348T(byteArrayOutputStream2, i11);
        m10348T(byteArrayOutputStream2, 0);
        byteArrayOutputStream2.write(arrayList.size());
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            byteArrayOutputStream2.write(((Number) it2.next()).intValue());
        }
        Iterator it3 = list.iterator();
        while (it3.hasNext()) {
            byteArrayOutputStream2.write((byte[]) it3.next());
        }
        byte[] byteArray = byteArrayOutputStream2.toByteArray();
        byteArray.getClass();
        int i13 = 0;
        for (byte b10 : byteArray) {
            i13 = f23307k[((i13 >>> 24) ^ (b10 & 255)) & 255] ^ (i13 << 8);
        }
        byteArray[22] = (byte) (i13 & 255);
        byteArray[23] = (byte) ((i13 >>> 8) & 255);
        byteArray[24] = (byte) ((i13 >>> 16) & 255);
        byteArray[25] = (byte) ((i13 >>> 24) & 255);
        byteArrayOutputStream.write(byteArray);
    }

    /* JADX DEBUG: Another duplicated slice has different insns count: {[]}, finally: {[THROW, INVOKE, MOVE_EXCEPTION, THROW, MOVE_EXCEPTION] complete} */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00e1  */
    /* JADX INFO: renamed from: V */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static File m10350V(Context context, List list, int i9, int i10, int i11) {
        Object c3959f;
        Throwable thM8182b;
        File fileCreateTempFile;
        File fileCreateTempFile2;
        File fileCreateTempFile3;
        int iDecodeAacFile;
        Object obj = null;
        try {
            File file = new File(context.getCacheDir(), "hchat_xiaozhi_voice");
            file.mkdirs();
            fileCreateTempFile = File.createTempFile("xiaozhi_", ".ogg", file);
            fileCreateTempFile2 = File.createTempFile("xiaozhi_", ".pcm", file);
            fileCreateTempFile3 = File.createTempFile("xiaozhi_", ".silk", file);
            byte[] bArrM10359e = m10359e(list, i9, i10, i11);
            fileCreateTempFile.getClass();
            FileOutputStream fileOutputStream = new FileOutputStream(fileCreateTempFile);
            try {
                fileOutputStream.write(bArrM10359e);
                fileOutputStream.close();
                iDecodeAacFile = AacCodec.decodeAacFile(fileCreateTempFile.getAbsolutePath(), fileCreateTempFile2.getAbsolutePath(), null);
            } finally {
            }
        } catch (Throwable th2) {
            c3959f = new C3959f(th2);
        }
        if (iDecodeAacFile == 0 && fileCreateTempFile2.isFile() && fileCreateTempFile2.length() > 0) {
            int iPcmToSilk = new SilkCodec().pcmToSilk(fileCreateTempFile2.getAbsolutePath(), fileCreateTempFile3.getAbsolutePath(), C4143c.DEFAULT_HZ, 48000, 1);
            try {
                fileCreateTempFile.delete();
            } catch (Throwable unused) {
            }
            try {
                fileCreateTempFile2.delete();
            } catch (Throwable unused2) {
            }
            if (iPcmToSilk == 0 && fileCreateTempFile3.isFile() && fileCreateTempFile3.length() > 0) {
                c3959f = fileCreateTempFile3;
                thM8182b = C3960g.m8182b(c3959f);
                if (thM8182b != null) {
                    obj = c3959f;
                } else {
                    AbstractC0921a.m2261x("[Hchat:AutoReply] 生成小智语音文件失败: ", thM8182b.getMessage(), thM8182b);
                }
                return (File) obj;
            }
            AbstractC1184v0.m3203m("[Hchat:AutoReply] 小智语音转Silk失败: code=" + iPcmToSilk + " silkLen=" + fileCreateTempFile3.length());
            fileCreateTempFile3.delete();
        } else {
            AbstractC1184v0.m3203m("[Hchat:AutoReply] 小智语音解码失败: code=" + iDecodeAacFile + " oggLen=" + fileCreateTempFile.length());
            try {
                fileCreateTempFile2.delete();
            } catch (Throwable unused3) {
            }
            fileCreateTempFile3.delete();
        }
        c3959f = null;
        thM8182b = C3960g.m8182b(c3959f);
        if (thM8182b != null) {
        }
        return (File) obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: W */
    public static String m10351W(Context context) {
        Object c3959f;
        try {
            UUID uuidFromString = UUID.fromString(m10352X(context));
            byte[] bArr = new byte[16];
            long mostSignificantBits = uuidFromString.getMostSignificantBits();
            long leastSignificantBits = uuidFromString.getLeastSignificantBits();
            for (int i9 = 0; i9 < 8; i9++) {
                bArr[i9] = (byte) (255 & (mostSignificantBits >>> ((7 - i9) * 8)));
            }
            for (int i10 = 8; i10 < 16; i10++) {
                bArr[i10] = (byte) ((leastSignificantBits >>> ((15 - i10) * 8)) & 255);
            }
            byte[] bArrDigest = MessageDigest.getInstance("SHA-256").digest(bArr);
            bArrDigest.getClass();
            c3959f = AbstractC4166m.m8392A1(AbstractC4165l.m8372I0(bArrDigest), ":", null, null, new C5319sr(21), 30);
        } catch (Throwable th2) {
            c3959f = new C3959f(th2);
        }
        Throwable thM8182b = C3960g.m8182b(c3959f);
        if (thM8182b != null) {
            AbstractC0921a.m2261x("[Hchat:AutoReply] 生成小智设备 MAC 失败: ", thM8182b.getMessage(), thM8182b);
            c3959f = "00:00:00:00:00:00";
        }
        return (String) c3959f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: X */
    public static String m10352X(Context context) {
        String string = Settings.Secure.getString(context.getContentResolver(), "android_id");
        if (string == null) {
            string = "default_android_id";
        }
        byte[] bytes = string.getBytes(AbstractC3137a.f10177a);
        bytes.getClass();
        String string2 = UUID.nameUUIDFromBytes(bytes).toString();
        string2.getClass();
        return string2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: Y */
    public static JSONObject m10353Y(String str, String str2, C5727t c5727t) throws JSONException {
        JSONObject jSONObjectM9268l = AbstractC4855en.m9268l("session_id", str, "type", "listen");
        jSONObjectM9268l.put("state", str2);
        jSONObjectM9268l.put("mode", "manual");
        m10330B(jSONObjectM9268l, c5727t);
        return jSONObjectM9268l;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: Z */
    public static C5721n m10354Z(Context context, String str, String str2, C5727t c5727t, boolean z9) {
        ConcurrentHashMap concurrentHashMap;
        C5721n c5721n;
        Request requestBuild;
        C5721n c5721n2;
        String strM8392A1 = AbstractC4166m.m8392A1(AbstractC0000a.m101y0(AbstractC3149m.m6703R0(c5727t.f23317a).toString(), AbstractC3149m.m6703R0(c5727t.f23322f).toString(), AbstractC3149m.m6703R0(c5727t.f23324h).toString(), String.valueOf(z9), String.valueOf(AbstractC3149m.m6721t0(AbstractC3149m.m6703R0(c5727t.f23327k).toString()))), "|", null, null, null, 62);
        do {
            concurrentHashMap = f23304h;
            c5721n = (C5721n) concurrentHashMap.get(str);
            if (c5721n != null && !c5721n.f23288g.get() && c5721n.f23286e.get() != null && c5721n.f23287f.get() == null && c5721n.f23283b.equals(strM8392A1)) {
                c5721n.m10328e();
                return c5721n;
            }
            requestBuild = new Request.Builder().url(str2).addHeader("Authorization", "Bearer test-token").addHeader("Device-Id", m10351W(context)).addHeader("Client-Id", m10352X(context)).addHeader("Protocol-Version", "1").build();
            c5721n2 = new C5721n(str, strM8392A1, c5727t, z9);
        } while (!(c5721n == null ? concurrentHashMap.putIfAbsent(str, c5721n2) == null : concurrentHashMap.replace(str, c5721n, c5721n2)));
        if (c5721n != null) {
            c5721n.m10324a("replaced");
        }
        requestBuild.getClass();
        c5721n2.f23286e.set(f23299c.newWebSocket(requestBuild, c5721n2.f23292k));
        c5721n2.m10328e();
        f23298b.schedule(new RunnableC4794cr(c5721n2, 4), 90000L, TimeUnit.MILLISECONDS);
        return c5721n2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static String m10355a(C5714g c5714g) {
        String str = c5714g.f23243c;
        Pattern patternCompile = Pattern.compile("@[^\\s]+\\s+");
        patternCompile.getClass();
        str.getClass();
        String strReplaceAll = patternCompile.matcher(str).replaceAll(HttpUrl.FRAGMENT_ENCODE_SET);
        strReplaceAll.getClass();
        return AbstractC3149m.m6703R0(strReplaceAll).toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static JSONObject m10356b(C5707a c5707a, List list, boolean z9) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("model", c5707a.f23192d);
        jSONObject.put("temperature", 0.7d);
        jSONObject.put("stream", z9);
        JSONArray jSONArray = new JSONArray();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C5712e c5712e = (C5712e) it.next();
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("role", c5712e.f23228a);
            jSONObject2.put("content", c5712e.f23229b);
            jSONArray.put(jSONObject2);
        }
        jSONObject.put("messages", jSONArray);
        return jSONObject;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static void m10357c(C5725r c5725r, String str, C5713f c5713f) {
        C1368i c1368iM9259c;
        Object c3959f;
        Object c3959f2;
        if (AbstractC3149m.m6721t0(str)) {
            return;
        }
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet();
        if (c5725r.m10385e(c5713f.f23230a)) {
            linkedHashSet.add("新加好友");
        }
        if (c5725r.m10385e(c5713f.f23231b)) {
            linkedHashSet.add(m10368n(c5725r.m10388h(c5713f.f23232c, "yyyy-MM-dd"), "yyyy-MM-dd"));
        }
        if (c5725r.m10385e(c5713f.f23233d)) {
            List listM6692G0 = AbstractC3149m.m6692G0(c5725r.m10388h(c5713f.f23234e, HttpUrl.FRAGMENT_ENCODE_SET), new String[]{";;;", "|", "\n"});
            ArrayList arrayList = new ArrayList(AbstractC4167n.m8429e1(listM6692G0));
            Iterator it = listM6692G0.iterator();
            while (it.hasNext()) {
                AbstractC2091b.m5171r((String) it.next(), arrayList);
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : arrayList) {
                if (((String) obj).length() > 0) {
                    arrayList2.add(obj);
                }
            }
            AbstractC4171r.m8432h1(linkedHashSet, AbstractC4166m.m8407P1(AbstractC4166m.m8411T1(arrayList2)));
        }
        if (linkedHashSet.isEmpty() || (c1368iM9259c = AbstractC4855en.m9259c()) == null) {
            return;
        }
        for (String str2 : linkedHashSet) {
            try {
                c3959f2 = c1368iM9259c.m3716a(str2);
            } catch (Throwable th2) {
                c3959f2 = new C3959f(th2);
            }
            Throwable thM8182b = C3960g.m8182b(c3959f2);
            if (thM8182b != null) {
                AbstractC0921a.m2260w("[Hchat:AutoReply] 创建好友标签失败: ", str2, " ", thM8182b.getMessage(), thM8182b);
            }
        }
        try {
            c3959f = Boolean.valueOf(c1368iM9259c.m3709P(str, AbstractC4166m.m8407P1(linkedHashSet)));
        } catch (Throwable th3) {
            c3959f = new C3959f(th3);
        }
        Throwable thM8182b2 = C3960g.m8182b(c3959f);
        if (thM8182b2 != null) {
            AbstractC0921a.m2261x("[Hchat:AutoReply] 修改好友标签失败: ", thM8182b2.getMessage(), thM8182b2);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0086  */
    /* JADX INFO: renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m10358d(C5725r c5725r, String str, C5713f c5713f) {
        C1368i c1368iM9259c;
        String strDisplayName;
        Object c3959f;
        if (AbstractC3149m.m6721t0(str)) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        if (c5725r.m10385e(c5713f.f23235f)) {
            arrayList.add("新加好友");
        }
        if (c5725r.m10385e(c5713f.f23237h)) {
            arrayList.add(m10368n(c5725r.m10388h(c5713f.f23238i, "yyMMdd"), "yyMMdd"));
        }
        if (c5725r.m10385e(c5713f.f23239j)) {
            String string = AbstractC3149m.m6703R0(c5725r.m10388h(c5713f.f23240k, HttpUrl.FRAGMENT_ENCODE_SET)).toString();
            if (AbstractC3149m.m6721t0(string)) {
                string = null;
            }
            if (string != null) {
                arrayList.add(string);
            }
        }
        if (arrayList.isEmpty() || (c1368iM9259c = AbstractC4855en.m9259c()) == null) {
            return;
        }
        String strM8392A1 = AbstractC4166m.m8392A1(arrayList, HttpUrl.FRAGMENT_ENCODE_SET, null, null, null, 62);
        WeChatContact weChatContactM3725n = c1368iM9259c.m3725n(str);
        if (weChatContactM3725n != null) {
            strDisplayName = weChatContactM3725n.nickname;
            if (AbstractC3149m.m6721t0(strDisplayName)) {
                strDisplayName = weChatContactM3725n.displayName();
            }
            if (AbstractC3149m.m6721t0(strDisplayName)) {
                strDisplayName = str;
            }
        }
        if (c5725r.m10385e(c5713f.f23236g)) {
            strM8392A1 = strDisplayName.concat(strM8392A1);
        }
        try {
            c3959f = Boolean.valueOf(c1368iM9259c.m3710Q(str, strM8392A1));
        } catch (Throwable th2) {
            c3959f = new C3959f(th2);
        }
        Throwable thM8182b = C3960g.m8182b(c3959f);
        if (thM8182b != null) {
            AbstractC0921a.m2261x("[Hchat:AutoReply] 修改好友备注失败: ", thM8182b.getMessage(), thM8182b);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public static byte[] m10359e(List list, int i9, int i10, int i11) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int iMo5357b = AbstractC2136d.f7122g.mo5357b();
        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
        Charset charset = AbstractC3137a.f10178b;
        byte[] bytes = "OpusHead".getBytes(charset);
        bytes.getClass();
        byteArrayOutputStream2.write(bytes);
        byteArrayOutputStream2.write(1);
        byteArrayOutputStream2.write(AbstractC3754e0.m7909r(i10, 1, 2));
        byteArrayOutputStream2.write(56);
        byteArrayOutputStream2.write(1);
        m10348T(byteArrayOutputStream2, i9 >= 8000 ? i9 : 8000);
        byteArrayOutputStream2.write(0);
        byteArrayOutputStream2.write(0);
        byteArrayOutputStream2.write(0);
        byte[] byteArray = byteArrayOutputStream2.toByteArray();
        byteArray.getClass();
        m10349U(byteArrayOutputStream, 2, 0L, iMo5357b, 0, AbstractC0000a.m99x0(byteArray));
        byte[] bytes2 = "Hchat Xiaozhi".getBytes(AbstractC3137a.f10177a);
        bytes2.getClass();
        ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
        byte[] bytes3 = "OpusTags".getBytes(charset);
        bytes3.getClass();
        byteArrayOutputStream3.write(bytes3);
        m10348T(byteArrayOutputStream3, bytes2.length);
        byteArrayOutputStream3.write(bytes2);
        m10348T(byteArrayOutputStream3, 0);
        byte[] byteArray2 = byteArrayOutputStream3.toByteArray();
        byteArray2.getClass();
        m10349U(byteArrayOutputStream, 0, 0L, iMo5357b, 1, AbstractC0000a.m99x0(byteArray2));
        long j3 = (((long) i11) * 48000) / 1000;
        long j4 = j3 < 960 ? 960L : j3;
        long j5 = 0;
        int i12 = 2;
        int i13 = 0;
        for (Object obj : list) {
            int i14 = i13 + 1;
            if (i13 < 0) {
                AbstractC0000a.m32Q0();
                throw null;
            }
            long j10 = j5 + j4;
            m10349U(byteArrayOutputStream, i13 == list.size() - 1 ? 4 : 0, j10, iMo5357b, i12, AbstractC0000a.m99x0((byte[]) obj));
            j5 = j10;
            i13 = i14;
            i12++;
        }
        byte[] byteArray3 = byteArrayOutputStream.toByteArray();
        byteArray3.getClass();
        return byteArray3;
    }

    /* JADX DEBUG: Another duplicated slice has different insns count: {[GOTO]}, finally: {[GOTO, THROW, INVOKE, MOVE_EXCEPTION, THROW, MOVE_EXCEPTION] complete} */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    /* JADX WARN: Removed duplicated region for block: B:28:0x009f  */
    /* JADX INFO: renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String m10360f(C5707a c5707a, List list) {
        Object c3959f;
        String str;
        JSONObject jSONObjectOptJSONObject;
        JSONObject jSONObjectOptJSONObject2;
        String strOptString;
        try {
            JSONObject jSONObjectM10356b = m10356b(c5707a, list, false);
            OkHttpClient okHttpClient = f23299c;
            Request.Builder builderAddHeader = new Request.Builder().url(m10367m(c5707a)).addHeader("Content-Type", "application/json").addHeader("Authorization", "Bearer " + c5707a.f23189a);
            RequestBody.Companion companion = RequestBody.Companion;
            String string = jSONObjectM10356b.toString();
            string.getClass();
            Response responseExecute = okHttpClient.newCall(builderAddHeader.post(companion.create(string, MediaType.Companion.get("application/json"))).build()).execute();
            try {
                ResponseBody responseBodyBody = responseExecute.body();
                String strString = responseBodyBody != null ? responseBodyBody.string() : null;
                if (strString == null) {
                    strString = HttpUrl.FRAGMENT_ENCODE_SET;
                }
                if (!responseExecute.isSuccessful() || AbstractC3149m.m6721t0(strString)) {
                    responseExecute.close();
                    c3959f = null;
                } else {
                    JSONArray jSONArrayOptJSONArray = new JSONObject(strString).optJSONArray("choices");
                    if (jSONArrayOptJSONArray == null || (jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(0)) == null || (jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject("message")) == null || (strOptString = jSONObjectOptJSONObject2.optString("content")) == null) {
                        str = null;
                        responseExecute.close();
                        c3959f = str;
                    } else {
                        boolean zM6721t0 = AbstractC3149m.m6721t0(strOptString);
                        str = strOptString;
                        if (zM6721t0) {
                        }
                        responseExecute.close();
                        c3959f = str;
                    }
                }
            } finally {
            }
        } catch (Throwable th2) {
            c3959f = new C3959f(th2);
        }
        return (String) (c3959f instanceof C3959f ? null : c3959f);
    }

    /* JADX DEBUG: Another duplicated slice has different insns count: {[]}, finally: {[THROW, INVOKE, MOVE_EXCEPTION, THROW, MOVE_EXCEPTION] complete} */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    /* JADX INFO: renamed from: g */
    public static String m10361g(C5707a c5707a, List list) {
        Object c3959f;
        ResponseBody responseBodyBody;
        InputStream inputStreamByteStream;
        Object c3959f2;
        JSONArray jSONArrayOptJSONArray;
        JSONObject jSONObjectOptJSONObject;
        try {
            JSONObject jSONObjectM10356b = m10356b(c5707a, list, true);
            OkHttpClient okHttpClient = f23299c;
            Request.Builder builderAddHeader = new Request.Builder().url(m10367m(c5707a)).addHeader("Content-Type", "application/json").addHeader("Authorization", "Bearer " + c5707a.f23189a);
            RequestBody.Companion companion = RequestBody.Companion;
            String string = jSONObjectM10356b.toString();
            string.getClass();
            Response responseExecute = okHttpClient.newCall(builderAddHeader.post(companion.create(string, MediaType.Companion.get("application/json"))).build()).execute();
            try {
                if (!responseExecute.isSuccessful() || (responseBodyBody = responseExecute.body()) == null || (inputStreamByteStream = responseBodyBody.byteStream()) == null) {
                    responseExecute.close();
                    c3959f = null;
                } else {
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStreamByteStream, AbstractC3137a.f10177a), 8192);
                    StringBuilder sb2 = new StringBuilder();
                    try {
                        for (String str : new C3003a(new C0795n(bufferedReader, 0))) {
                            String string2 = AbstractC3149m.m6703R0(AbstractC3149m.m6686A0(AbstractC3149m.m6703R0(str).toString(), "data:")).toString();
                            if (!AbstractC3149m.m6721t0(string2) && !string2.equals(AbstractC3149m.m6703R0(str).toString()) && !string2.equals("[DONE]")) {
                                try {
                                    c3959f2 = new JSONObject(string2);
                                } catch (Throwable th2) {
                                    c3959f2 = new C3959f(th2);
                                }
                                if (c3959f2 instanceof C3959f) {
                                    c3959f2 = null;
                                }
                                JSONObject jSONObject = (JSONObject) c3959f2;
                                if (jSONObject != null && (jSONArrayOptJSONArray = jSONObject.optJSONArray("choices")) != null && (jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(0)) != null) {
                                    JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject("delta");
                                    String strOptString = jSONObjectOptJSONObject2 != null ? jSONObjectOptJSONObject2.optString("content") : null;
                                    if (strOptString == null) {
                                        strOptString = HttpUrl.FRAGMENT_ENCODE_SET;
                                    }
                                    if (!AbstractC3149m.m6721t0(strOptString) && !strOptString.equalsIgnoreCase("null")) {
                                        sb2.append(strOptString);
                                    }
                                }
                            }
                        }
                        bufferedReader.close();
                        String string3 = sb2.toString();
                        boolean zM6721t0 = AbstractC3149m.m6721t0(string3);
                        String str2 = string3;
                        if (zM6721t0) {
                            str2 = null;
                        }
                        responseExecute.close();
                        c3959f = str2;
                    } finally {
                    }
                }
            } finally {
            }
        } catch (Throwable th3) {
            c3959f = new C3959f(th3);
        }
        return (String) (c3959f instanceof C3959f ? null : c3959f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public static String m10362h(String str) {
        String strM5161h = AbstractC2091b.m5161h("(?i)^null", AbstractC3156t.m6737a0(str, "\u0000", HttpUrl.FRAGMENT_ENCODE_SET, false), HttpUrl.FRAGMENT_ENCODE_SET);
        Pattern patternCompile = Pattern.compile("(?i)null$");
        patternCompile.getClass();
        String strReplaceAll = patternCompile.matcher(strM5161h).replaceAll(HttpUrl.FRAGMENT_ENCODE_SET);
        strReplaceAll.getClass();
        return AbstractC3149m.m6703R0(strReplaceAll).toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public static void m10363i() {
        f23302f.clear();
        f23303g.clear();
        ConcurrentHashMap concurrentHashMap = f23304h;
        Collection collectionValues = concurrentHashMap.values();
        collectionValues.getClass();
        Iterator it = collectionValues.iterator();
        while (it.hasNext()) {
            ((C5721n) it.next()).m10324a("context cleared");
        }
        concurrentHashMap.clear();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0099  */
    /* JADX INFO: renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static List m10364j(byte[] bArr) throws IOException {
        long j3;
        byte[] bArrCopyOf = bArr;
        if (bArrCopyOf.length == 0) {
            return C4173t.f13710g;
        }
        int length = ((bArrCopyOf.length + 1919) / 1920) * 1920;
        if (length != bArrCopyOf.length) {
            bArrCopyOf = Arrays.copyOf(bArrCopyOf, length);
        }
        MediaFormat mediaFormatCreateAudioFormat = MediaFormat.createAudioFormat("audio/opus", 16000, 1);
        mediaFormatCreateAudioFormat.setInteger("bitrate", C4143c.DEFAULT_HZ);
        mediaFormatCreateAudioFormat.setInteger("max-input-size", 1920);
        MediaCodec mediaCodecCreateEncoderByType = MediaCodec.createEncoderByType("audio/opus");
        mediaCodecCreateEncoderByType.getClass();
        MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
        ArrayList arrayList = new ArrayList();
        mediaCodecCreateEncoderByType.configure(mediaFormatCreateAudioFormat, (Surface) null, (MediaCrypto) null, 1);
        mediaCodecCreateEncoderByType.start();
        int i9 = 0;
        boolean z9 = false;
        boolean z10 = false;
        while (!z9) {
            if (!z10) {
                try {
                    int iDequeueInputBuffer = mediaCodecCreateEncoderByType.dequeueInputBuffer(10000L);
                    if (iDequeueInputBuffer >= 0) {
                        ByteBuffer inputBuffer = mediaCodecCreateEncoderByType.getInputBuffer(iDequeueInputBuffer);
                        if (inputBuffer != null) {
                            inputBuffer.clear();
                        }
                        int length2 = bArrCopyOf.length - i9;
                        if (length2 > 1920) {
                            length2 = 1920;
                        }
                        if (length2 <= 0 || inputBuffer == null) {
                            int i10 = i9;
                            mediaCodecCreateEncoderByType.queueInputBuffer(iDequeueInputBuffer, 0, 0, (((long) (i10 / 2)) * 1000000) / ((long) 16000), 4);
                            i9 = i10;
                            j3 = 10000;
                            z10 = true;
                        } else {
                            inputBuffer.put(bArrCopyOf, i9, length2);
                            int i11 = length2;
                            mediaCodecCreateEncoderByType.queueInputBuffer(iDequeueInputBuffer, 0, i11, (((long) (i9 / 2)) * 1000000) / ((long) 16000), 0);
                            i9 += i11;
                        }
                    } else {
                        i9 = i9;
                    }
                    j3 = 10000;
                } finally {
                }
            }
            int iDequeueOutputBuffer = mediaCodecCreateEncoderByType.dequeueOutputBuffer(bufferInfo, j3);
            if (iDequeueOutputBuffer != -2 && iDequeueOutputBuffer != -1 && iDequeueOutputBuffer >= 0) {
                ByteBuffer outputBuffer = mediaCodecCreateEncoderByType.getOutputBuffer(iDequeueOutputBuffer);
                if (outputBuffer != null && bufferInfo.size > 0 && (bufferInfo.flags & 2) == 0) {
                    outputBuffer.position(bufferInfo.offset);
                    outputBuffer.limit(bufferInfo.offset + bufferInfo.size);
                    byte[] bArr2 = new byte[bufferInfo.size];
                    outputBuffer.get(bArr2);
                    arrayList.add(bArr2);
                }
                if ((bufferInfo.flags & 4) != 0) {
                    z9 = true;
                }
                mediaCodecCreateEncoderByType.releaseOutputBuffer(iDequeueOutputBuffer, false);
            }
        }
        try {
            mediaCodecCreateEncoderByType.stop();
        } catch (Throwable unused) {
        }
        try {
            mediaCodecCreateEncoderByType.release();
        } catch (Throwable unused2) {
        }
        return arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:152:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x02b6 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:161:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x02d2  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0072  */
    /* JADX INFO: renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean m10365k(Context context, final String str, List list, C5714g c5714g, long j3, boolean z9) {
        boolean z10;
        long j4;
        long j5;
        long jMo5362e;
        String strM3729r;
        Object c3959f;
        Throwable thM8182b;
        long j10;
        boolean zM10336H;
        C2097h c2097h;
        Context context2 = context;
        String str2 = c5714g.f23242b;
        String str3 = c5714g.f23241a;
        boolean z11 = c5714g.f23245e;
        if (list.isEmpty()) {
            return false;
        }
        if (j3 > 0) {
            m10341M(j3);
        }
        Iterator it = list.iterator();
        boolean z12 = false;
        int i9 = 0;
        while (it.hasNext()) {
            int i10 = i9 + 1;
            C5726s c5726s = (C5726s) it.next();
            long j11 = c5726s.f23315d;
            if (c5726s.f23316e) {
                j4 = j11;
                z10 = z11;
                j5 = 0;
                jMo5362e = AbstractC2136d.f7122g.mo5362e(0L, 2001L);
            } else {
                z10 = z11;
                j4 = j11;
                j5 = 0;
                jMo5362e = 0;
            }
            long j12 = j4 + jMo5362e;
            if (j12 > j5) {
                m10341M(j12);
            }
            String str4 = c5726s.f23314c;
            C1368i c1368iM9259c = AbstractC4855en.m9259c();
            long j13 = c5714g.f23244d;
            String str5 = HttpUrl.FRAGMENT_ENCODE_SET;
            if (z10) {
                strM3729r = c1368iM9259c != null ? c1368iM9259c.m3731t(str3, str2) : null;
                if (strM3729r == null) {
                    strM3729r = HttpUrl.FRAGMENT_ENCODE_SET;
                }
            } else {
                strM3729r = c1368iM9259c != null ? c1368iM9259c.m3729r(str2) : null;
                if (strM3729r == null) {
                }
            }
            String str6 = AbstractC3149m.m6721t0(strM3729r) ? str2 : strM3729r;
            if (z10) {
                String strM3729r2 = c1368iM9259c != null ? c1368iM9259c.m3729r(str3) : null;
                if (strM3729r2 != null) {
                    str5 = strM3729r2;
                }
            }
            Iterator it2 = it;
            String str7 = str5;
            boolean z13 = z12;
            String strM6737a0 = AbstractC3156t.m6737a0(AbstractC3156t.m6737a0(AbstractC3156t.m6737a0(AbstractC3156t.m6737a0(AbstractC3156t.m6737a0(AbstractC3156t.m6737a0(AbstractC3156t.m6737a0(AbstractC3156t.m6737a0(str4, "%friendName%", str6, false), "%senderName%", str6, false), "%senderWxid%", str2, false), "%talker%", str3, false), "%groupName%", str7, false), "%content%", c5714g.f23243c, false), "%atSender%", AbstractC0921a.m2251n("[AtWx=", str2, "]"), false), "%atAll%", z10 ? "[AtWx=notify@all]" : "@所有人", false);
            C2343g c2343gM6844q = AbstractC3199a.m6844q();
            final C2105p c2105pMedia = WeChatApis.media();
            try {
            } catch (Throwable th2) {
                c3959f = new C3959f(th2);
            }
            switch (c5726s.f23313b) {
                case 0:
                    ArrayList arrayListM10344P = m10344P(strM6737a0);
                    int i11 = 0;
                    boolean z14 = false;
                    for (Object obj : arrayListM10344P) {
                        int i12 = i11 + 1;
                        if (i11 < 0) {
                            AbstractC0000a.m32Q0();
                            throw null;
                        }
                        ArrayList arrayList = arrayListM10344P;
                        String str8 = (String) obj;
                        z14 = ((!z9 || (j13 > 0L ? 1 : (j13 == 0L ? 0 : -1)) <= 0 || AbstractC3149m.m6709h0(str8, "[AtWx=", false)) ? m10337I(str, str8) : c2343gM6844q != null && c2343gM6844q.m5598u(j13, str, str8)) || z14;
                        if (i11 < arrayList.size() - 1) {
                            m10341M(300L);
                        }
                        i11 = i12;
                        arrayListM10344P = arrayList;
                        thM8182b = C3960g.m8182b(c3959f);
                        if (thM8182b != null) {
                            AbstractC0921a.m2261x("[Hchat:AutoReply] 发送回复失败: ", thM8182b.getMessage(), thM8182b);
                        }
                        Boolean bool = Boolean.FALSE;
                        if (c3959f instanceof C3959f) {
                            c3959f = bool;
                        }
                        z12 = !((Boolean) c3959f).booleanValue() || z13;
                        if (i9 >= list.size() - 1) {
                            j10 = 0;
                            if (c5726s.f23315d <= 0) {
                                m10341M(300L);
                            }
                        } else {
                            j10 = 0;
                        }
                        context2 = context;
                        it = it2;
                        i9 = i10;
                        z11 = z10;
                    }
                    zM10336H = z14;
                    c3959f = Boolean.valueOf(zM10336H);
                    thM8182b = C3960g.m8182b(c3959f);
                    if (thM8182b != null) {
                    }
                    Boolean bool2 = Boolean.FALSE;
                    if (c3959f instanceof C3959f) {
                    }
                    if (((Boolean) c3959f).booleanValue()) {
                    }
                    if (i9 >= list.size() - 1) {
                    }
                    context2 = context;
                    it = it2;
                    i9 = i10;
                    z11 = z10;
                    break;
                case 1:
                    final int i13 = 1;
                    zM10336H = m10336H(new InterfaceC1231l() { // from class: x8.c
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                        /* JADX WARN: Removed duplicated region for block: B:11:0x001c  */
                        /* JADX WARN: Removed duplicated region for block: B:19:0x0035  */
                        /* JADX WARN: Removed duplicated region for block: B:27:0x004e  */
                        /* JADX WARN: Removed duplicated region for block: B:35:0x0065  */
                        /* JADX WARN: Removed duplicated region for block: B:43:0x0087  */
                        @Override // p085fg.InterfaceC1231l
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                        */
                        public final Object invoke(Object obj2) {
                            boolean z15;
                            boolean z16;
                            boolean z17;
                            boolean z18;
                            boolean z19;
                            C0240b c0240b;
                            String str9 = (String) obj2;
                            switch (i13) {
                                case 0:
                                    str9.getClass();
                                    C2105p c2105p = c2105pMedia;
                                    if (c2105p != null) {
                                        z15 = c2105p.f7039e.m588T(str, str9, new File(str9).getName());
                                    }
                                    return Boolean.valueOf(z15);
                                case 1:
                                    str9.getClass();
                                    C2105p c2105p2 = c2105pMedia;
                                    if (c2105p2 != null) {
                                        z16 = c2105p2.m5301a(str, str9);
                                    }
                                    return Boolean.valueOf(z16);
                                case 2:
                                    str9.getClass();
                                    C2105p c2105p3 = c2105pMedia;
                                    if (c2105p3 != null) {
                                        z17 = c2105p3.f7036b.m5324t(str, str9);
                                    }
                                    return Boolean.valueOf(z17);
                                case 3:
                                    str9.getClass();
                                    C2105p c2105p4 = c2105pMedia;
                                    if (c2105p4 != null) {
                                        z18 = c2105p4.f7038d.m5219v(str, str9);
                                    }
                                    return Boolean.valueOf(z18);
                                default:
                                    str9.getClass();
                                    C2105p c2105p5 = c2105pMedia;
                                    if (c2105p5 == null || (c0240b = c2105p5.f7037c) == null) {
                                        z19 = false;
                                    } else {
                                        boolean zM972q = c0240b.m972q(str, str9);
                                        z19 = true;
                                        if (!zM972q) {
                                        }
                                    }
                                    return Boolean.valueOf(z19);
                            }
                        }
                    }, strM6737a0);
                    c3959f = Boolean.valueOf(zM10336H);
                    thM8182b = C3960g.m8182b(c3959f);
                    if (thM8182b != null) {
                    }
                    Boolean bool22 = Boolean.FALSE;
                    if (c3959f instanceof C3959f) {
                    }
                    if (((Boolean) c3959f).booleanValue()) {
                    }
                    if (i9 >= list.size() - 1) {
                    }
                    context2 = context;
                    it = it2;
                    i9 = i10;
                    z11 = z10;
                    break;
                case 2:
                    final int i14 = 2;
                    zM10336H = m10336H(new InterfaceC1231l() { // from class: x8.c
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                        /* JADX WARN: Removed duplicated region for block: B:11:0x001c  */
                        /* JADX WARN: Removed duplicated region for block: B:19:0x0035  */
                        /* JADX WARN: Removed duplicated region for block: B:27:0x004e  */
                        /* JADX WARN: Removed duplicated region for block: B:35:0x0065  */
                        /* JADX WARN: Removed duplicated region for block: B:43:0x0087  */
                        @Override // p085fg.InterfaceC1231l
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                        */
                        public final Object invoke(Object obj2) {
                            boolean z15;
                            boolean z16;
                            boolean z17;
                            boolean z18;
                            boolean z19;
                            C0240b c0240b;
                            String str9 = (String) obj2;
                            switch (i14) {
                                case 0:
                                    str9.getClass();
                                    C2105p c2105p = c2105pMedia;
                                    if (c2105p != null) {
                                        z15 = c2105p.f7039e.m588T(str, str9, new File(str9).getName());
                                    }
                                    return Boolean.valueOf(z15);
                                case 1:
                                    str9.getClass();
                                    C2105p c2105p2 = c2105pMedia;
                                    if (c2105p2 != null) {
                                        z16 = c2105p2.m5301a(str, str9);
                                    }
                                    return Boolean.valueOf(z16);
                                case 2:
                                    str9.getClass();
                                    C2105p c2105p3 = c2105pMedia;
                                    if (c2105p3 != null) {
                                        z17 = c2105p3.f7036b.m5324t(str, str9);
                                    }
                                    return Boolean.valueOf(z17);
                                case 3:
                                    str9.getClass();
                                    C2105p c2105p4 = c2105pMedia;
                                    if (c2105p4 != null) {
                                        z18 = c2105p4.f7038d.m5219v(str, str9);
                                    }
                                    return Boolean.valueOf(z18);
                                default:
                                    str9.getClass();
                                    C2105p c2105p5 = c2105pMedia;
                                    if (c2105p5 == null || (c0240b = c2105p5.f7037c) == null) {
                                        z19 = false;
                                    } else {
                                        boolean zM972q = c0240b.m972q(str, str9);
                                        z19 = true;
                                        if (!zM972q) {
                                        }
                                    }
                                    return Boolean.valueOf(z19);
                            }
                        }
                    }, strM6737a0);
                    c3959f = Boolean.valueOf(zM10336H);
                    thM8182b = C3960g.m8182b(c3959f);
                    if (thM8182b != null) {
                    }
                    Boolean bool222 = Boolean.FALSE;
                    if (c3959f instanceof C3959f) {
                    }
                    if (((Boolean) c3959f).booleanValue()) {
                    }
                    if (i9 >= list.size() - 1) {
                    }
                    context2 = context;
                    it = it2;
                    i9 = i10;
                    z11 = z10;
                    break;
                case 3:
                    String strM10331C = m10331C(strM6737a0);
                    if (strM10331C != null && c2105pMedia != null && c2105pMedia.f7036b.m5324t(str, strM10331C)) {
                        zM10336H = true;
                        c3959f = Boolean.valueOf(zM10336H);
                        thM8182b = C3960g.m8182b(c3959f);
                        if (thM8182b != null) {
                        }
                        Boolean bool2222 = Boolean.FALSE;
                        if (c3959f instanceof C3959f) {
                        }
                        if (((Boolean) c3959f).booleanValue()) {
                        }
                        if (i9 >= list.size() - 1) {
                        }
                        context2 = context;
                        it = it2;
                        i9 = i10;
                        z11 = z10;
                    }
                    zM10336H = false;
                    c3959f = Boolean.valueOf(zM10336H);
                    thM8182b = C3960g.m8182b(c3959f);
                    if (thM8182b != null) {
                    }
                    Boolean bool22222 = Boolean.FALSE;
                    if (c3959f instanceof C3959f) {
                    }
                    if (((Boolean) c3959f).booleanValue()) {
                    }
                    if (i9 >= list.size() - 1) {
                    }
                    context2 = context;
                    it = it2;
                    i9 = i10;
                    z11 = z10;
                    break;
                case 4:
                    final int i15 = 3;
                    zM10336H = m10336H(new InterfaceC1231l() { // from class: x8.c
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                        /* JADX WARN: Removed duplicated region for block: B:11:0x001c  */
                        /* JADX WARN: Removed duplicated region for block: B:19:0x0035  */
                        /* JADX WARN: Removed duplicated region for block: B:27:0x004e  */
                        /* JADX WARN: Removed duplicated region for block: B:35:0x0065  */
                        /* JADX WARN: Removed duplicated region for block: B:43:0x0087  */
                        @Override // p085fg.InterfaceC1231l
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                        */
                        public final Object invoke(Object obj2) {
                            boolean z15;
                            boolean z16;
                            boolean z17;
                            boolean z18;
                            boolean z19;
                            C0240b c0240b;
                            String str9 = (String) obj2;
                            switch (i15) {
                                case 0:
                                    str9.getClass();
                                    C2105p c2105p = c2105pMedia;
                                    if (c2105p != null) {
                                        z15 = c2105p.f7039e.m588T(str, str9, new File(str9).getName());
                                    }
                                    return Boolean.valueOf(z15);
                                case 1:
                                    str9.getClass();
                                    C2105p c2105p2 = c2105pMedia;
                                    if (c2105p2 != null) {
                                        z16 = c2105p2.m5301a(str, str9);
                                    }
                                    return Boolean.valueOf(z16);
                                case 2:
                                    str9.getClass();
                                    C2105p c2105p3 = c2105pMedia;
                                    if (c2105p3 != null) {
                                        z17 = c2105p3.f7036b.m5324t(str, str9);
                                    }
                                    return Boolean.valueOf(z17);
                                case 3:
                                    str9.getClass();
                                    C2105p c2105p4 = c2105pMedia;
                                    if (c2105p4 != null) {
                                        z18 = c2105p4.f7038d.m5219v(str, str9);
                                    }
                                    return Boolean.valueOf(z18);
                                default:
                                    str9.getClass();
                                    C2105p c2105p5 = c2105pMedia;
                                    if (c2105p5 == null || (c0240b = c2105p5.f7037c) == null) {
                                        z19 = false;
                                    } else {
                                        boolean zM972q = c0240b.m972q(str, str9);
                                        z19 = true;
                                        if (!zM972q) {
                                        }
                                    }
                                    return Boolean.valueOf(z19);
                            }
                        }
                    }, strM6737a0);
                    c3959f = Boolean.valueOf(zM10336H);
                    thM8182b = C3960g.m8182b(c3959f);
                    if (thM8182b != null) {
                    }
                    Boolean bool222222 = Boolean.FALSE;
                    if (c3959f instanceof C3959f) {
                    }
                    if (((Boolean) c3959f).booleanValue()) {
                    }
                    if (i9 >= list.size() - 1) {
                    }
                    context2 = context;
                    it = it2;
                    i9 = i10;
                    z11 = z10;
                    break;
                case 5:
                    final int i16 = 4;
                    zM10336H = m10336H(new InterfaceC1231l() { // from class: x8.c
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                        /* JADX WARN: Removed duplicated region for block: B:11:0x001c  */
                        /* JADX WARN: Removed duplicated region for block: B:19:0x0035  */
                        /* JADX WARN: Removed duplicated region for block: B:27:0x004e  */
                        /* JADX WARN: Removed duplicated region for block: B:35:0x0065  */
                        /* JADX WARN: Removed duplicated region for block: B:43:0x0087  */
                        @Override // p085fg.InterfaceC1231l
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                        */
                        public final Object invoke(Object obj2) {
                            boolean z15;
                            boolean z16;
                            boolean z17;
                            boolean z18;
                            boolean z19;
                            C0240b c0240b;
                            String str9 = (String) obj2;
                            switch (i16) {
                                case 0:
                                    str9.getClass();
                                    C2105p c2105p = c2105pMedia;
                                    if (c2105p != null) {
                                        z15 = c2105p.f7039e.m588T(str, str9, new File(str9).getName());
                                    }
                                    return Boolean.valueOf(z15);
                                case 1:
                                    str9.getClass();
                                    C2105p c2105p2 = c2105pMedia;
                                    if (c2105p2 != null) {
                                        z16 = c2105p2.m5301a(str, str9);
                                    }
                                    return Boolean.valueOf(z16);
                                case 2:
                                    str9.getClass();
                                    C2105p c2105p3 = c2105pMedia;
                                    if (c2105p3 != null) {
                                        z17 = c2105p3.f7036b.m5324t(str, str9);
                                    }
                                    return Boolean.valueOf(z17);
                                case 3:
                                    str9.getClass();
                                    C2105p c2105p4 = c2105pMedia;
                                    if (c2105p4 != null) {
                                        z18 = c2105p4.f7038d.m5219v(str, str9);
                                    }
                                    return Boolean.valueOf(z18);
                                default:
                                    str9.getClass();
                                    C2105p c2105p5 = c2105pMedia;
                                    if (c2105p5 == null || (c0240b = c2105p5.f7037c) == null) {
                                        z19 = false;
                                    } else {
                                        boolean zM972q = c0240b.m972q(str, str9);
                                        z19 = true;
                                        if (!zM972q) {
                                        }
                                    }
                                    return Boolean.valueOf(z19);
                            }
                        }
                    }, strM6737a0);
                    c3959f = Boolean.valueOf(zM10336H);
                    thM8182b = C3960g.m8182b(c3959f);
                    if (thM8182b != null) {
                    }
                    Boolean bool2222222 = Boolean.FALSE;
                    if (c3959f instanceof C3959f) {
                    }
                    if (((Boolean) c3959f).booleanValue()) {
                    }
                    if (i9 >= list.size() - 1) {
                    }
                    context2 = context;
                    it = it2;
                    i9 = i10;
                    z11 = z10;
                    break;
                case 6:
                    ArrayList<String> arrayListM10343O = m10343O(strM6737a0);
                    if (!arrayListM10343O.isEmpty()) {
                        for (String str9 : arrayListM10343O) {
                            if (c2343gM6844q != null && c2343gM6844q.m5600w(str, str9)) {
                                zM10336H = true;
                                c3959f = Boolean.valueOf(zM10336H);
                                thM8182b = C3960g.m8182b(c3959f);
                                if (thM8182b != null) {
                                }
                                Boolean bool22222222 = Boolean.FALSE;
                                if (c3959f instanceof C3959f) {
                                }
                                if (((Boolean) c3959f).booleanValue()) {
                                }
                                if (i9 >= list.size() - 1) {
                                }
                                context2 = context;
                                it = it2;
                                i9 = i10;
                                z11 = z10;
                                break;
                            }
                        }
                    }
                    zM10336H = false;
                    c3959f = Boolean.valueOf(zM10336H);
                    thM8182b = C3960g.m8182b(c3959f);
                    if (thM8182b != null) {
                    }
                    Boolean bool222222222 = Boolean.FALSE;
                    if (c3959f instanceof C3959f) {
                    }
                    if (((Boolean) c3959f).booleanValue()) {
                    }
                    if (i9 >= list.size() - 1) {
                    }
                    context2 = context;
                    it = it2;
                    i9 = i10;
                    z11 = z10;
                    break;
                case 7:
                    final int i17 = 0;
                    zM10336H = m10336H(new InterfaceC1231l() { // from class: x8.c
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                        /* JADX WARN: Removed duplicated region for block: B:11:0x001c  */
                        /* JADX WARN: Removed duplicated region for block: B:19:0x0035  */
                        /* JADX WARN: Removed duplicated region for block: B:27:0x004e  */
                        /* JADX WARN: Removed duplicated region for block: B:35:0x0065  */
                        /* JADX WARN: Removed duplicated region for block: B:43:0x0087  */
                        @Override // p085fg.InterfaceC1231l
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                        */
                        public final Object invoke(Object obj2) {
                            boolean z15;
                            boolean z16;
                            boolean z17;
                            boolean z18;
                            boolean z19;
                            C0240b c0240b;
                            String str92 = (String) obj2;
                            switch (i17) {
                                case 0:
                                    str92.getClass();
                                    C2105p c2105p = c2105pMedia;
                                    if (c2105p != null) {
                                        z15 = c2105p.f7039e.m588T(str, str92, new File(str92).getName());
                                    }
                                    return Boolean.valueOf(z15);
                                case 1:
                                    str92.getClass();
                                    C2105p c2105p2 = c2105pMedia;
                                    if (c2105p2 != null) {
                                        z16 = c2105p2.m5301a(str, str92);
                                    }
                                    return Boolean.valueOf(z16);
                                case 2:
                                    str92.getClass();
                                    C2105p c2105p3 = c2105pMedia;
                                    if (c2105p3 != null) {
                                        z17 = c2105p3.f7036b.m5324t(str, str92);
                                    }
                                    return Boolean.valueOf(z17);
                                case 3:
                                    str92.getClass();
                                    C2105p c2105p4 = c2105pMedia;
                                    if (c2105p4 != null) {
                                        z18 = c2105p4.f7038d.m5219v(str, str92);
                                    }
                                    return Boolean.valueOf(z18);
                                default:
                                    str92.getClass();
                                    C2105p c2105p5 = c2105pMedia;
                                    if (c2105p5 == null || (c0240b = c2105p5.f7037c) == null) {
                                        z19 = false;
                                    } else {
                                        boolean zM972q = c0240b.m972q(str, str92);
                                        z19 = true;
                                        if (!zM972q) {
                                        }
                                    }
                                    return Boolean.valueOf(z19);
                            }
                        }
                    }, strM6737a0);
                    c3959f = Boolean.valueOf(zM10336H);
                    thM8182b = C3960g.m8182b(c3959f);
                    if (thM8182b != null) {
                    }
                    Boolean bool2222222222 = Boolean.FALSE;
                    if (c3959f instanceof C3959f) {
                    }
                    if (((Boolean) c3959f).booleanValue()) {
                    }
                    if (i9 >= list.size() - 1) {
                    }
                    context2 = context;
                    it = it2;
                    i9 = i10;
                    z11 = z10;
                    break;
                case 8:
                    String str10 = z10 ? str2 : str;
                    ArrayList<String> arrayListM10343O2 = m10343O(strM6737a0);
                    if (!arrayListM10343O2.isEmpty()) {
                        for (String str11 : arrayListM10343O2) {
                            WeChatApis.contact().getClass();
                            C1363d c1363d = WeChatApis.chatroomApi;
                            if (c1363d != null) {
                                if (TextUtils.isEmpty(str10) ? false : c1363d.m3681m(str11, Collections.singletonList(str10))) {
                                    zM10336H = true;
                                    c3959f = Boolean.valueOf(zM10336H);
                                    thM8182b = C3960g.m8182b(c3959f);
                                    if (thM8182b != null) {
                                    }
                                    Boolean bool22222222222 = Boolean.FALSE;
                                    if (c3959f instanceof C3959f) {
                                    }
                                    if (((Boolean) c3959f).booleanValue()) {
                                    }
                                    if (i9 >= list.size() - 1) {
                                    }
                                    context2 = context;
                                    it = it2;
                                    i9 = i10;
                                    z11 = z10;
                                    break;
                                }
                            }
                        }
                    }
                    zM10336H = false;
                    c3959f = Boolean.valueOf(zM10336H);
                    thM8182b = C3960g.m8182b(c3959f);
                    if (thM8182b != null) {
                    }
                    Boolean bool222222222222 = Boolean.FALSE;
                    if (c3959f instanceof C3959f) {
                    }
                    if (((Boolean) c3959f).booleanValue()) {
                    }
                    if (i9 >= list.size() - 1) {
                    }
                    context2 = context;
                    it = it2;
                    i9 = i10;
                    z11 = z10;
                    break;
                case 9:
                    if (c2343gM6844q != null) {
                        if (!AbstractC3156t.m6740d0(AbstractC3149m.m6703R0(strM6737a0).toString(), "<", false)) {
                            String strM6737a02 = AbstractC3156t.m6737a0(strM6737a0, "]]>", "]]]]><![CDATA[>", false);
                            strM6737a0 = AbstractC0921a.m2255r(AbstractC0255e.m1027p("<?xml version=\"1.0\" encoding=\"UTF-8\"?><msg><appmsg appid=\"\" sdkver=\"0\"><title><![CDATA[", strM6737a02, "]]></title><des><![CDATA[", strM6737a02, "]]></des><type>1</type><content><![CDATA["), strM6737a02, "]]></content></appmsg></msg>");
                        }
                        if (c2343gM6844q.m5603z(str, strM6737a0)) {
                            zM10336H = true;
                        }
                        c3959f = Boolean.valueOf(zM10336H);
                        thM8182b = C3960g.m8182b(c3959f);
                        if (thM8182b != null) {
                        }
                        Boolean bool2222222222222 = Boolean.FALSE;
                        if (c3959f instanceof C3959f) {
                        }
                        if (((Boolean) c3959f).booleanValue()) {
                        }
                        if (i9 >= list.size() - 1) {
                        }
                        context2 = context;
                        it = it2;
                        i9 = i10;
                        z11 = z10;
                    }
                    zM10336H = false;
                    c3959f = Boolean.valueOf(zM10336H);
                    thM8182b = C3960g.m8182b(c3959f);
                    if (thM8182b != null) {
                    }
                    Boolean bool22222222222222 = Boolean.FALSE;
                    if (c3959f instanceof C3959f) {
                    }
                    if (((Boolean) c3959f).booleanValue()) {
                    }
                    if (i9 >= list.size() - 1) {
                    }
                    context2 = context;
                    it = it2;
                    i9 = i10;
                    z11 = z10;
                    break;
                case 10:
                    zM10336H = m10340L(context2, str, c5714g, z9);
                    c3959f = Boolean.valueOf(zM10336H);
                    thM8182b = C3960g.m8182b(c3959f);
                    if (thM8182b != null) {
                    }
                    Boolean bool222222222222222 = Boolean.FALSE;
                    if (c3959f instanceof C3959f) {
                    }
                    if (((Boolean) c3959f).booleanValue()) {
                    }
                    if (i9 >= list.size() - 1) {
                    }
                    context2 = context;
                    it = it2;
                    i9 = i10;
                    z11 = z10;
                    break;
                case 11:
                    zM10336H = m10338J(context2, str, c5714g, z9);
                    c3959f = Boolean.valueOf(zM10336H);
                    thM8182b = C3960g.m8182b(c3959f);
                    if (thM8182b != null) {
                    }
                    Boolean bool2222222222222222 = Boolean.FALSE;
                    if (c3959f instanceof C3959f) {
                    }
                    if (((Boolean) c3959f).booleanValue()) {
                    }
                    if (i9 >= list.size() - 1) {
                    }
                    context2 = context;
                    it = it2;
                    i9 = i10;
                    z11 = z10;
                    break;
                case 12:
                    zM10336H = m10339K(context2, str, c5714g);
                    c3959f = Boolean.valueOf(zM10336H);
                    thM8182b = C3960g.m8182b(c3959f);
                    if (thM8182b != null) {
                    }
                    Boolean bool22222222222222222 = Boolean.FALSE;
                    if (c3959f instanceof C3959f) {
                    }
                    if (((Boolean) c3959f).booleanValue()) {
                    }
                    if (i9 >= list.size() - 1) {
                    }
                    context2 = context;
                    it = it2;
                    i9 = i10;
                    z11 = z10;
                    break;
                case 13:
                    zM10336H = false;
                    for (String str12 : m10343O(strM6737a0)) {
                        str12.getClass();
                        if ((c2105pMedia == null || (c2097h = c2105pMedia.f7040f) == null || !c2097h.m5236A(str, str12)) ? false : true) {
                            zM10336H = true;
                        }
                        m10341M(300L);
                    }
                    c3959f = Boolean.valueOf(zM10336H);
                    thM8182b = C3960g.m8182b(c3959f);
                    if (thM8182b != null) {
                    }
                    Boolean bool222222222222222222 = Boolean.FALSE;
                    if (c3959f instanceof C3959f) {
                    }
                    if (((Boolean) c3959f).booleanValue()) {
                    }
                    if (i9 >= list.size() - 1) {
                    }
                    context2 = context;
                    it = it2;
                    i9 = i10;
                    z11 = z10;
                    break;
                default:
                    zM10336H = false;
                    c3959f = Boolean.valueOf(zM10336H);
                    thM8182b = C3960g.m8182b(c3959f);
                    if (thM8182b != null) {
                    }
                    Boolean bool2222222222222222222 = Boolean.FALSE;
                    if (c3959f instanceof C3959f) {
                    }
                    if (((Boolean) c3959f).booleanValue()) {
                    }
                    if (i9 >= list.size() - 1) {
                    }
                    context2 = context;
                    it = it2;
                    i9 = i10;
                    z11 = z10;
                    break;
            }
        }
        return z12;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l */
    public static String m10366l(String str) {
        String string = AbstractC3149m.m6703R0(str).toString();
        if (!AbstractC3149m.m6721t0(string)) {
            List listM101y0 = AbstractC0000a.m101y0("点歌", "放首", "放一首", "播放", "听歌", "听首", "来首", "来一首", "音乐");
            if (!listM101y0.isEmpty()) {
                Iterator it = listM101y0.iterator();
                while (it.hasNext()) {
                    if (AbstractC3149m.m6709h0(string, (String) it.next(), false)) {
                        String string2 = AbstractC3149m.m6703R0(AbstractC3156t.m6737a0(AbstractC3156t.m6737a0(AbstractC3156t.m6737a0(AbstractC3156t.m6737a0(AbstractC3156t.m6737a0(string, "帮我", HttpUrl.FRAGMENT_ENCODE_SET, false), "给我", HttpUrl.FRAGMENT_ENCODE_SET, false), "一下", HttpUrl.FRAGMENT_ENCODE_SET, false), "吧", HttpUrl.FRAGMENT_ENCODE_SET, false), "可以", HttpUrl.FRAGMENT_ENCODE_SET, false)).toString();
                        for (String str2 : AbstractC0000a.m101y0("点歌", "放一首", "放首", "播放一下", "播放", "听一首", "听首", "听歌", "来一首", "来首")) {
                            if (AbstractC3156t.m6740d0(string2, str2, false)) {
                                string2 = AbstractC3149m.m6703R0(AbstractC3149m.m6686A0(string2, str2)).toString();
                            }
                        }
                        for (String str3 : AbstractC0000a.m101y0("这首歌", "这首", "音乐", "歌曲", "歌")) {
                            if (AbstractC3156t.m6733W(string2, str3, false) && string2.length() > str3.length()) {
                                string2 = AbstractC3149m.m6703R0(AbstractC3149m.m6687B0(string2, str3)).toString();
                            }
                        }
                        return AbstractC3149m.m6701P0(80, string2);
                    }
                }
            }
        }
        return HttpUrl.FRAGMENT_ENCODE_SET;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: m */
    public static String m10367m(C5707a c5707a) {
        String strM6706U0 = AbstractC3149m.m6706U0(AbstractC3149m.m6703R0(c5707a.f23190b).toString(), '/');
        String string = AbstractC3149m.m6703R0(c5707a.f23191c).toString();
        if (AbstractC3149m.m6721t0(string)) {
            string = "/chat/completions";
        }
        if (!AbstractC3156t.m6740d0(string, "/", false)) {
            string = "/".concat(string);
        }
        return AbstractC0255e.m1020i(strM6706U0, string);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: n */
    public static String m10368n(String str, String str2) {
        Object c3959f;
        String string = AbstractC3149m.m6703R0(str).toString();
        if (AbstractC3149m.m6721t0(string)) {
            string = str2;
        }
        try {
            c3959f = new SimpleDateFormat(string, Locale.getDefault()).format(new Date());
        } catch (Throwable th2) {
            c3959f = new C3959f(th2);
        }
        if (C3960g.m8182b(c3959f) != null) {
            c3959f = new SimpleDateFormat(str2, Locale.getDefault()).format(new Date());
        }
        c3959f.getClass();
        return (String) c3959f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:100:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x03c2  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x034d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:280:0x0178 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:282:0x0355 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0180  */
    /* JADX INFO: renamed from: o */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m10369o(Context context, C5725r c5725r, C2351o c2351o) {
        boolean z9;
        WeChatMessage weChatMessage;
        Set set;
        boolean zM10371q;
        int i9;
        boolean z10;
        int i10;
        int i11;
        Object c3959f;
        int i12;
        boolean z11;
        Set set2;
        Iterator it;
        int i13;
        Integer numM10380z;
        WeChatMessage weChatMessage2 = c2351o.f7723k;
        String strM5617d = c2351o.f7715c;
        if (AbstractC3149m.m6721t0(strM5617d)) {
            strM5617d = c2351o.m5617d();
        }
        String str = strM5617d;
        str.getClass();
        if (AbstractC3149m.m6721t0(str)) {
            return;
        }
        boolean z12 = c2351o.f7720h || c2351o.m5623j() || AbstractC3156t.m6733W(str, "@chatroom", false) || AbstractC3156t.m6733W(str, "@im.chatroom", false);
        String strM5616c = c2351o.f7716d;
        if (AbstractC3149m.m6721t0(strM5616c)) {
            strM5616c = c2351o.m5616c();
        }
        strM5616c.getClass();
        if (AbstractC3149m.m6721t0(strM5616c)) {
            if (z12) {
                Pattern patternCompile = Pattern.compile("^([^\\s:]{3,80}):\\n");
                patternCompile.getClass();
                String strM5614a = c2351o.f7717e;
                if (AbstractC3149m.m6721t0(strM5614a)) {
                    strM5614a = c2351o.m5614a();
                }
                strM5614a.getClass();
                Matcher matcher = patternCompile.matcher(strM5614a);
                matcher.getClass();
                C3145i c3145iM238b = AbstractC0018a.m238b(matcher, 0, strM5614a);
                strM5616c = c3145iM238b != null ? (String) AbstractC4166m.m8425w1(1, c3145iM238b.m6676a()) : null;
                if (strM5616c == null) {
                    strM5616c = HttpUrl.FRAGMENT_ENCODE_SET;
                }
            } else {
                strM5616c = str;
            }
        }
        String strM10329A = m10329A(c2351o);
        boolean zM5628o = c2351o.m5628o();
        boolean zEquals = WeChatSnsPost.TYPE_TEXT.equals(c2351o.f7714b);
        if (!c2351o.m5632s() || zM5628o) {
            if (zEquals && AbstractC3149m.m6721t0(strM10329A) && !zM5628o) {
                return;
            }
            long msgId = weChatMessage2 != null ? weChatMessage2.getMsgId() : 0L;
            boolean zM5620g = c2351o.m5620g();
            boolean zM5627n = c2351o.m5627n();
            if (zM5628o) {
                WeChatPatMsg weChatPatMsgM5615b = c2351o.m5615b();
                String str2 = weChatPatMsgM5615b != null ? weChatPatMsgM5615b.pattedUser : null;
                WeChatApis.contact().getClass();
                C1360a c1360a = WeChatApis.accountApi;
                if (AbstractC1416l.m3825a(str2, c1360a != null ? c1360a.m3652c() : null)) {
                    z9 = true;
                }
            } else {
                z9 = false;
            }
            String str3 = strM5616c;
            C5714g c5714g = new C5714g(str, str3, strM10329A, msgId, z12, zM5620g, zM5627n, z9);
            boolean z13 = z12;
            for (C5709b c5709b : c5725r.m10392l()) {
                boolean z14 = c5709b.f23201c;
                String str4 = c5709b.f23199a;
                int i14 = c5709b.f23214p;
                int i15 = c5709b.f23211m;
                boolean z15 = zM5628o;
                long j3 = c5709b.f23215q;
                if (!z14 || c5709b.f23217s.isEmpty()) {
                    weChatMessage = weChatMessage2;
                    zM5628o = z15;
                    weChatMessage2 = weChatMessage;
                } else {
                    String str5 = c5709b.f23212n;
                    String str6 = c5709b.f23213o;
                    if (AbstractC3149m.m6721t0(str5) || AbstractC3149m.m6721t0(str6) || (numM10380z = m10380z(str5)) == null) {
                        weChatMessage = weChatMessage2;
                        set = c5709b.f23207i;
                        Set set3 = c5709b.f23209k;
                        if (!set.contains(str) || set.contains(str3)) {
                            zM10371q = false;
                            if (zM10371q) {
                                int i16 = c5709b.f23210l;
                                if (!z13 ? i16 == 0 : (i16 != 1 || c5714g.f23246f) && (i16 != 2 || c5714g.f23247g)) {
                                    i9 = 1;
                                    z10 = (i15 != 1 || c5714g.f23248h) && (i15 != 1 || z15);
                                } else {
                                    z10 = false;
                                    i9 = 1;
                                }
                                if (!z10) {
                                    zM5628o = z15;
                                    weChatMessage2 = weChatMessage;
                                } else if (z15 && i15 == i9) {
                                    i11 = i9;
                                    i10 = 0;
                                    if (i11 != 0) {
                                    }
                                } else {
                                    String str7 = c5709b.f23202d;
                                    int i17 = c5709b.f23204f;
                                    if (i17 == i9) {
                                        i10 = 0;
                                        if (zEquals) {
                                            ArrayList arrayListM10342N = m10342N(str7);
                                            if (!arrayListM10342N.isEmpty()) {
                                                Iterator it2 = arrayListM10342N.iterator();
                                                while (it2.hasNext()) {
                                                    if (strM10329A.equals((String) it2.next())) {
                                                        i11 = i9;
                                                        break;
                                                    }
                                                }
                                            }
                                        }
                                        i11 = i10;
                                        break;
                                    }
                                    if (i17 == 2) {
                                        i10 = 0;
                                        if (zEquals) {
                                            try {
                                                c3959f = Boolean.valueOf(Pattern.compile(str7).matcher(strM10329A).find());
                                            } catch (Throwable th2) {
                                                c3959f = new C3959f(th2);
                                            }
                                            Object obj = Boolean.FALSE;
                                            if (c3959f instanceof C3959f) {
                                                c3959f = obj;
                                            }
                                            if (((Boolean) c3959f).booleanValue()) {
                                                i11 = i9;
                                                break;
                                            } else {
                                                i11 = i10;
                                                break;
                                            }
                                        }
                                        i11 = i10;
                                        break;
                                    }
                                    if (i17 == 3) {
                                        if (zEquals) {
                                            ArrayList arrayListM10342N2 = m10342N(c5709b.f23203e);
                                            if (!arrayListM10342N2.isEmpty()) {
                                                Iterator it3 = arrayListM10342N2.iterator();
                                                while (it3.hasNext()) {
                                                    i10 = 0;
                                                    if (AbstractC3149m.m6709h0(strM10329A, (String) it3.next(), false)) {
                                                        i11 = i10;
                                                        break;
                                                    }
                                                }
                                            }
                                        }
                                        i10 = 0;
                                        i11 = i9;
                                        break;
                                    }
                                    if (zEquals) {
                                        ArrayList<String> arrayListM10342N3 = m10342N(str7);
                                        if (!arrayListM10342N3.isEmpty()) {
                                            for (String str8 : arrayListM10342N3) {
                                                if (((AbstractC3149m.m6709h0(strM10329A, str8, false) || AbstractC3149m.m6721t0(str8)) ? i9 : 0) != 0) {
                                                    i11 = i9;
                                                    break;
                                                }
                                            }
                                        }
                                    }
                                    i11 = 0;
                                    i10 = 0;
                                    if (i11 != 0) {
                                        zM5628o = z15;
                                        weChatMessage2 = weChatMessage;
                                    } else {
                                        ConcurrentHashMap concurrentHashMap = f23301e;
                                        if (j3 <= 0) {
                                            i12 = i10;
                                        } else {
                                            String strM9264h = AbstractC4855en.m9264h(str4, "|", str);
                                            Long l10 = (Long) concurrentHashMap.get(strM9264h);
                                            if (l10 != null) {
                                                long jLongValue = l10.longValue();
                                                long jElapsedRealtime = SystemClock.elapsedRealtime();
                                                if (jElapsedRealtime >= jLongValue) {
                                                    long j4 = jElapsedRealtime - jLongValue;
                                                    if (j3 > 9223372036854775L) {
                                                        j3 = 9223372036854775L;
                                                    }
                                                    if (j4 < j3 * 1000) {
                                                        i12 = 1;
                                                    }
                                                }
                                                concurrentHashMap.remove(strM9264h, l10);
                                                i12 = 0;
                                            } else {
                                                i12 = 0;
                                            }
                                        }
                                        if (i12 == 0) {
                                            if (i14 <= 0) {
                                                z11 = true;
                                                if (z11) {
                                                    C5714g c5714g2 = c5714g;
                                                    c5714g = c5714g2;
                                                    if (m10365k(context, str, c5709b.f23217s, c5714g2, 0L, c5709b.f23216r) && j3 > 0) {
                                                        concurrentHashMap.put(AbstractC4855en.m9264h(str4, "|", str), Long.valueOf(SystemClock.elapsedRealtime()));
                                                    }
                                                }
                                            } else {
                                                String strM1033v = AbstractC0255e.m1033v(str4, "|", str, "|", str3);
                                                ConcurrentHashMap concurrentHashMap2 = f23300d;
                                                Integer num = (Integer) concurrentHashMap2.get(strM1033v);
                                                int iIntValue = num != null ? num.intValue() : 0;
                                                if (iIntValue >= i14) {
                                                    z11 = false;
                                                    if (z11) {
                                                    }
                                                } else {
                                                    concurrentHashMap2.put(strM1033v, Integer.valueOf(iIntValue + 1));
                                                    z11 = true;
                                                    if (z11) {
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            zM5628o = z15;
                            weChatMessage2 = weChatMessage;
                        } else if (z13) {
                            if (!set.contains(str + "/" + str3)) {
                                if (z13) {
                                    if (!set3.contains(str3)) {
                                        if (set3.contains(str + "/" + str3)) {
                                        }
                                    }
                                    zM10371q = false;
                                    if (zM10371q) {
                                    }
                                    zM5628o = z15;
                                    weChatMessage2 = weChatMessage;
                                } else {
                                    Set set4 = c5709b.f23206h;
                                    if ((set4 instanceof Collection) && set4.isEmpty()) {
                                        set2 = c5709b.f23208j;
                                        if (set2 instanceof Collection) {
                                            it = set2.iterator();
                                            while (it.hasNext()) {
                                            }
                                            i13 = c5709b.f23205g;
                                            if (i13 != 1) {
                                            }
                                            if (zM10371q) {
                                            }
                                            zM5628o = z15;
                                            weChatMessage2 = weChatMessage;
                                        }
                                    } else {
                                        Iterator it4 = set4.iterator();
                                        while (it4.hasNext()) {
                                            if (m10372r((String) it4.next())) {
                                                break;
                                            }
                                        }
                                        set2 = c5709b.f23208j;
                                        if ((set2 instanceof Collection) || !set2.isEmpty()) {
                                            it = set2.iterator();
                                            while (it.hasNext()) {
                                                if (m10372r((String) it.next())) {
                                                    zM10371q = m10371q(c5709b, c5714g);
                                                }
                                            }
                                        }
                                        i13 = c5709b.f23205g;
                                        if (i13 != 1) {
                                            zM10371q = !z13;
                                        } else if (i13 == 2) {
                                            zM10371q = z13;
                                        } else if (i13 == 3) {
                                            zM10371q = m10371q(c5709b, c5714g);
                                        } else if (i13 != 4 || ((weChatMessage != null && weChatMessage.isOfficialAccount()) || AbstractC3156t.m6740d0(str, "gh_", false))) {
                                            zM10371q = true;
                                        }
                                        if (zM10371q) {
                                        }
                                        zM5628o = z15;
                                        weChatMessage2 = weChatMessage;
                                    }
                                }
                            }
                        }
                    } else {
                        int iIntValue2 = numM10380z.intValue();
                        Integer numM10380z2 = m10380z(str6);
                        if (numM10380z2 != null) {
                            int iIntValue3 = numM10380z2.intValue();
                            Calendar calendar = Calendar.getInstance();
                            weChatMessage = weChatMessage2;
                            int i18 = calendar.get(13) + (calendar.get(12) * 60) + (calendar.get(11) * 3600);
                            if (iIntValue3 < iIntValue2) {
                                if (i18 >= iIntValue2 || i18 < iIntValue3) {
                                }
                                zM5628o = z15;
                                weChatMessage2 = weChatMessage;
                            } else {
                                if (i18 < iIntValue2 || i18 >= iIntValue3) {
                                }
                                zM5628o = z15;
                                weChatMessage2 = weChatMessage;
                            }
                        }
                        set = c5709b.f23207i;
                        Set set32 = c5709b.f23209k;
                        if (set.contains(str)) {
                            zM10371q = false;
                            if (zM10371q) {
                            }
                            zM5628o = z15;
                            weChatMessage2 = weChatMessage;
                        }
                    }
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: p */
    public static void m10370p(Context context, C5725r c5725r, C2351o c2351o) {
        if (c5725r.m10385e("greet_accepted_enable")) {
            String strM5617d = c2351o.f7715c;
            if (AbstractC3149m.m6721t0(strM5617d)) {
                strM5617d = c2351o.m5617d();
            }
            String str = strM5617d;
            String string = AbstractC3149m.m6703R0(m10329A(c2351o)).toString();
            str.getClass();
            if (AbstractC3149m.m6721t0(str) || c2351o.f7720h || AbstractC3156t.m6733W(str, "@chatroom", false) || !AbstractC1416l.m3825a(string, "我通过了你的朋友验证请求，现在我们可以开始聊天了")) {
                return;
            }
            m10377w(str, c5725r.m10388h("greet_accepted_tag_name", HttpUrl.FRAGMENT_ENCODE_SET), c5725r.m10385e("greet_accepted_tag_enable"));
            C5713f c5713f = f23310n;
            m10357c(c5725r, str, c5713f);
            m10358d(c5725r, str, c5713f);
            long jM10387g = c5725r.m10387g("greet_accepted_delay_ms");
            m10365k(context, str, c5725r.m10389i(), new C5714g(248, str, str, string), jM10387g >= 0 ? jM10387g : 0L, false);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: q */
    public static boolean m10371q(C5709b c5709b, C5714g c5714g) {
        Set set = c5709b.f23206h;
        ArrayList arrayList = new ArrayList();
        for (Object obj : set) {
            if (m10372r((String) obj)) {
                arrayList.add(obj);
            }
        }
        Set setM8412U1 = AbstractC4166m.m8412U1(arrayList);
        Set set2 = c5709b.f23208j;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : set2) {
            if (m10372r((String) obj2)) {
                arrayList2.add(obj2);
            }
        }
        Set setM8412U12 = AbstractC4166m.m8412U1(arrayList2);
        String str = c5714g.f23241a;
        String str2 = c5714g.f23242b;
        boolean z9 = c5714g.f23245e;
        if (setM8412U1.contains(str)) {
            return true;
        }
        if (!z9 && setM8412U1.contains(str2)) {
            return true;
        }
        if (z9) {
            if (setM8412U1.contains(str + "/" + str2)) {
                return true;
            }
        }
        if (z9) {
            if (setM8412U12.contains(str + "/" + str2)) {
                return true;
            }
        }
        return z9 && setM8412U12.contains(str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: r */
    public static boolean m10372r(String str) {
        List listM6691F0 = AbstractC3149m.m6691F0(str, new char[]{'/'}, 6);
        if (!listM6691F0.isEmpty()) {
            Iterator it = listM6691F0.iterator();
            while (it.hasNext()) {
                String string = AbstractC3149m.m6703R0((String) it.next()).toString();
                if (!(string.length() > 0 && !AbstractC3149m.m6709h0(string, "@@", false))) {
                    return false;
                }
            }
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: s */
    public static boolean m10373s(String str) {
        File file = new File(str);
        boolean z9 = false;
        if (file.isFile() && file.length() >= 512) {
            MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
            try {
                mediaMetadataRetriever.setDataSource(str);
                String strExtractMetadata = mediaMetadataRetriever.extractMetadata(9);
                if (strExtractMetadata != null && !AbstractC3149m.m6721t0(strExtractMetadata)) {
                    Long lM6743g0 = AbstractC3156t.m6743g0(strExtractMetadata);
                    if ((lM6743g0 != null ? lM6743g0.longValue() : 0L) > 0) {
                        z9 = true;
                    }
                }
            } catch (Throwable unused) {
            }
            try {
                mediaMetadataRetriever.release();
            } catch (Throwable unused2) {
            }
        }
        return z9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: t */
    public static int m10374t(byte[] bArr, int i9) {
        return ((bArr[i9 + 1] & 255) << 8) | (bArr[i9] & 255);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: u */
    public static int m10375u(byte[] bArr, int i9) {
        return ((bArr[i9 + 3] & 255) << 24) | (bArr[i9] & 255) | ((bArr[i9 + 1] & 255) << 8) | ((bArr[i9 + 2] & 255) << 16);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: v */
    public static void m10376v(C5727t c5727t, String str, String str2, long j3) {
        boolean z9 = c5727t.f23328l;
        String str3 = c5727t.f23329m;
        if (!z9 || AbstractC3149m.m6721t0(AbstractC3149m.m6703R0(str3).toString())) {
            return;
        }
        String string = AbstractC3149m.m6703R0(c5727t.f23330n).toString();
        if (AbstractC3149m.m6721t0(string)) {
            string = "queryKugouMusic";
        }
        String strM10366l = m10366l(str2);
        if (AbstractC3149m.m6721t0(strM10366l)) {
            return;
        }
        Long l10 = (Long) f23306j.get(str);
        if ((l10 != null ? l10.longValue() : 0L) >= j3) {
            return;
        }
        ScriptPluginRuntime.INSTANCE.m10923callPluginFunction0E7RQCE(AbstractC3149m.m6703R0(str3).toString(), string, str, strM10366l);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: w */
    public static void m10377w(String str, String str2, boolean z9) {
        if (!z9 || AbstractC3149m.m6721t0(str) || AbstractC3149m.m6721t0(str2)) {
            return;
        }
        try {
            WeChatApis.contact().getClass();
            C1368i c1368i = WeChatApis.contactApi;
            if (c1368i != null) {
                c1368i.m3708O(str, str2);
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: x */
    public static List m10378x(String str) {
        Object c3959f;
        try {
            JSONObject jSONObject = new JSONObject(str);
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            m10379y(linkedHashSet, jSONObject.optJSONArray("data"));
            m10379y(linkedHashSet, jSONObject.optJSONArray("models"));
            m10379y(linkedHashSet, jSONObject.optJSONArray("result"));
            c3959f = AbstractC4166m.m8401J1(linkedHashSet);
        } catch (Throwable th2) {
            c3959f = new C3959f(th2);
        }
        if (c3959f instanceof C3959f) {
            c3959f = C4173t.f13710g;
        }
        return (List) c3959f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: y */
    public static final void m10379y(LinkedHashSet linkedHashSet, JSONArray jSONArray) {
        String strOptString;
        if (jSONArray == null) {
            return;
        }
        int length = jSONArray.length();
        for (int i9 = 0; i9 < length; i9++) {
            Object objOpt = jSONArray.opt(i9);
            if (objOpt instanceof JSONObject) {
                JSONObject jSONObject = (JSONObject) objOpt;
                strOptString = jSONObject.optString("id");
                if (AbstractC3149m.m6721t0(strOptString)) {
                    strOptString = jSONObject.optString("name");
                }
            } else {
                strOptString = objOpt instanceof String ? (String) objOpt : HttpUrl.FRAGMENT_ENCODE_SET;
            }
            String strM6839l = AbstractC3199a.m6839l(strOptString, strOptString);
            if (strM6839l.length() > 0) {
                linkedHashSet.add(strM6839l);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: z */
    public static Integer m10380z(String str) {
        Integer numM6742f0;
        Integer numM6741e0;
        int iM7909r = 0;
        List listM6691F0 = AbstractC3149m.m6691F0(str, new char[]{':'}, 6);
        int size = listM6691F0.size();
        if (2 > size || size >= 4 || (numM6742f0 = AbstractC3156t.m6742f0((String) listM6691F0.get(0))) == null) {
            return null;
        }
        int iM7909r2 = AbstractC3754e0.m7909r(numM6742f0.intValue(), 0, 23);
        Integer numM6742f02 = AbstractC3156t.m6742f0((String) listM6691F0.get(1));
        if (numM6742f02 == null) {
            return null;
        }
        int iM7909r3 = AbstractC3754e0.m7909r(numM6742f02.intValue(), 0, 59);
        String str2 = (String) AbstractC4166m.m8425w1(2, listM6691F0);
        if (str2 != null && (numM6741e0 = AbstractC3156t.m6741e0(10, str2)) != null) {
            iM7909r = AbstractC3754e0.m7909r(numM6741e0.intValue(), 0, 59);
        }
        return Integer.valueOf((iM7909r3 * 60) + (iM7909r2 * 3600) + iM7909r);
    }
}
