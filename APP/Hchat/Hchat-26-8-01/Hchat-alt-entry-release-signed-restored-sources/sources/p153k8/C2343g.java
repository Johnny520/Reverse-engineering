package p153k8;

import android.os.Build;
import android.os.StrictMode;
import android.text.TextUtils;
import android.util.Pair;
import com.alibaba.fastjson2.writer.C0640b;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import okhttp3.HttpUrl;
import p024b9.RunnableC0217c;
import p036c9.ThreadFactoryC0478q;
import p068eh.AbstractC0921a;
import p077f8.C1083c;
import p077f8.C1087g;
import p080fb.RunnableC1117e1;
import p096g8.C1360a;
import p096g8.C1368i;
import p099h.Hchat.dexkit.DexFinder;
import p099h.Hchat.hooks.api.model.WeChatMessage;
import p099h.Hchat.hooks.api.model.WeChatQuoteMsg;
import p099h.Hchat.utils.KavaReflector;
import p125i8.C2002f;
import p125i8.C2005i;
import p136j8.AbstractC2091b;
import p183m8.C2815c;
import p332wb.AbstractC4855en;

/* JADX INFO: renamed from: k8.g */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2343g {

    /* JADX INFO: renamed from: h */
    public static final Pattern f7673h = Pattern.compile("<appmsg\\b[^>]*\\bappid\\s*=\\s*([\"'])(.*?)\\1", 2);

    /* JADX INFO: renamed from: i */
    public static final Pattern f7674i = Pattern.compile("<appid>\\s*(?:<!\\[CDATA\\[)?(.*?)(?:]]>)?\\s*</appid>", 34);

    /* JADX INFO: renamed from: j */
    public static final Pattern f7675j = Pattern.compile("<sourcedisplayname>\\s*(?:<!\\[CDATA\\[)?(.*?)(?:]]>)?\\s*</sourcedisplayname>", 34);

    /* JADX INFO: renamed from: k */
    public static final Pattern f7676k = Pattern.compile("<msgsource\\b[^>]*>.*?</msgsource>", 34);

    /* JADX INFO: renamed from: l */
    public static final Pattern f7677l = Pattern.compile("<tpthumburl>\\s*(?:<!\\[CDATA\\[)?(.*?)(?:]]>)?\\s*</tpthumburl>", 34);

    /* JADX INFO: renamed from: m */
    public static final Pattern f7678m = Pattern.compile("<weappiconurl>\\s*(?:<!\\[CDATA\\[)?(.*?)(?:]]>)?\\s*</weappiconurl>", 34);

    /* JADX INFO: renamed from: n */
    public static final Pattern f7679n = Pattern.compile("<thumburl>\\s*(?:<!\\[CDATA\\[)?(.*?)(?:]]>)?\\s*</thumburl>", 34);

    /* JADX INFO: renamed from: o */
    public static final Pattern f7680o = Pattern.compile("<cdnthumburl>\\s*(?:<!\\[CDATA\\[)?(.*?)(?:]]>)?\\s*</cdnthumburl>", 34);

    /* JADX INFO: renamed from: p */
    public static final ConcurrentHashMap f7681p = new ConcurrentHashMap();

    /* JADX INFO: renamed from: q */
    public static final ConcurrentHashMap.KeySetView f7682q = ConcurrentHashMap.newKeySet();

    /* JADX INFO: renamed from: r */
    public static final ExecutorService f7683r = Executors.newFixedThreadPool(2, new ThreadFactoryC0478q(17));

    /* JADX INFO: renamed from: s */
    public static final ScheduledExecutorService f7684s = Executors.newSingleThreadScheduledExecutor(new ThreadFactoryC0478q(18));

    /* JADX INFO: renamed from: t */
    public static final ConcurrentHashMap f7685t = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a */
    public final DexFinder f7686a;

    /* JADX INFO: renamed from: b */
    public final C2815c f7687b;

    /* JADX INFO: renamed from: c */
    public final C1360a f7688c;

    /* JADX INFO: renamed from: d */
    public final C1368i f7689d;

    /* JADX INFO: renamed from: e */
    public final C2355s f7690e;

    /* JADX INFO: renamed from: f */
    public final C1083c f7691f;

    /* JADX INFO: renamed from: g */
    public volatile boolean f7692g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2343g(DexFinder dexFinder, C2815c c2815c, C1360a c1360a, C1368i c1368i, C2355s c2355s, C1083c c1083c, C2002f c2002f) {
        this.f7686a = dexFinder;
        this.f7687b = c2815c;
        this.f7688c = c1360a;
        this.f7689d = c1368i;
        this.f7690e = c2355s;
        this.f7691f = c1083c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: A */
    public static String m5576A(String str) {
        if (str == null) {
            return HttpUrl.FRAGMENT_ENCODE_SET;
        }
        String strTrim = str.trim();
        if (strTrim.startsWith("<![CDATA[") && strTrim.endsWith("]]>")) {
            strTrim = AbstractC4855en.m9262f(3, 9, strTrim);
        }
        return strTrim.trim();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: B */
    public static void m5577B(Object obj, Object obj2, String... strArr) {
        for (String str : strArr) {
            if (!TextUtils.isEmpty(str)) {
                try {
                    Field fieldFindFieldRecursive = KavaReflector.findFieldRecursive(obj.getClass(), str);
                    if (fieldFindFieldRecursive != null && KavaReflector.writeField(fieldFindFieldRecursive, obj, obj2)) {
                        return;
                    }
                } catch (Throwable unused) {
                    continue;
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static HashMap m5578a(ArrayList arrayList) {
        HashMap map = new HashMap(1);
        StringBuilder sb2 = new StringBuilder("<![CDATA[");
        StringBuilder sb3 = new StringBuilder();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (sb3.length() > 0) {
                sb3.append(',');
            }
            sb3.append(str);
        }
        sb2.append(sb3.toString());
        sb2.append("]]>");
        map.put("atuserlist", sb2.toString());
        return map;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static String m5579b() {
        return "<deviceinfo><MANUFACTURER name=\"" + m5582g(Build.MANUFACTURER) + "\"><MODEL name=\"" + m5582g(Build.MODEL) + "\"><VERSION_RELEASE name=\"" + m5582g(Build.VERSION.RELEASE) + "\"><VERSION_INCREMENTAL name=\"" + m5582g(Build.VERSION.INCREMENTAL) + "\"><DISPLAY name=\"" + m5582g(Build.DISPLAY) + "\"></DISPLAY></VERSION_INCREMENTAL></VERSION_RELEASE></MODEL></MANUFACTURER></deviceinfo>";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public static void m5580d(String str, String str2) {
        String strM5587q = m5587q(str, str2);
        if (TextUtils.isEmpty(strM5587q)) {
            return;
        }
        ConcurrentHashMap concurrentHashMap = f7685t;
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) concurrentHashMap.get(strM5587q);
        if (copyOnWriteArrayList == null || copyOnWriteArrayList.isEmpty()) {
            return;
        }
        ScheduledFuture scheduledFuture = ((C2342f) copyOnWriteArrayList.remove(0)).f7672a;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        if (copyOnWriteArrayList.isEmpty()) {
            concurrentHashMap.remove(strM5587q, copyOnWriteArrayList);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x006b, code lost:
    
        r1 = r3.toByteArray();
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x006f, code lost:
    
        r2.close();
     */
    /* JADX INFO: renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static byte[] m5581f(String str) {
        HttpURLConnection httpURLConnection;
        InputStream inputStream;
        byte[] byteArray;
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        try {
            StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitNetwork().build());
            httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            try {
                httpURLConnection.setConnectTimeout(5000);
                httpURLConnection.setReadTimeout(8000);
                httpURLConnection.setInstanceFollowRedirects(true);
                httpURLConnection.setRequestProperty("User-Agent", "MicroMessenger Client");
                int responseCode = httpURLConnection.getResponseCode();
                if (responseCode >= 200 && responseCode < 300) {
                    inputStream = httpURLConnection.getInputStream();
                    try {
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        byte[] bArr = new byte[8192];
                        int i9 = 0;
                        while (true) {
                            int i10 = inputStream.read(bArr);
                            if (i10 == -1) {
                                break;
                            }
                            i9 += i10;
                            if (i9 > 524288) {
                                try {
                                    inputStream.close();
                                    break;
                                } catch (Throwable unused) {
                                }
                            } else {
                                byteArrayOutputStream.write(bArr, 0, i10);
                            }
                        }
                    } catch (Throwable unused2) {
                        if (inputStream != null) {
                            try {
                                inputStream.close();
                            } catch (Throwable unused3) {
                            }
                        }
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                        try {
                            StrictMode.setThreadPolicy(threadPolicy);
                        } catch (Throwable unused4) {
                        }
                        return null;
                    }
                }
                httpURLConnection.disconnect();
                try {
                    StrictMode.setThreadPolicy(threadPolicy);
                } catch (Throwable unused5) {
                }
                return null;
                httpURLConnection.disconnect();
                try {
                    StrictMode.setThreadPolicy(threadPolicy);
                } catch (Throwable unused6) {
                }
                return byteArray;
                return byteArray;
            } catch (Throwable unused7) {
                inputStream = null;
            }
        } catch (Throwable unused8) {
            httpURLConnection = null;
            inputStream = null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public static String m5582g(String str) {
        return str == null ? HttpUrl.FRAGMENT_ENCODE_SET : str.replace("&", "&amp;").replace("<", "&lt;").replace(">", "&gt;").replace("\"", "&quot;").replace("'", "&apos;");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public static String m5583h(String str) {
        String lowerCase;
        int iLastIndexOf;
        if (TextUtils.isEmpty(str)) {
            return HttpUrl.FRAGMENT_ENCODE_SET;
        }
        try {
            Matcher matcher = f7676k.matcher(str);
            while (matcher.find()) {
                int iStart = matcher.start();
                if (!TextUtils.isEmpty(str) && iStart > 0 && (iLastIndexOf = (lowerCase = str.substring(0, Math.min(iStart, str.length())).toLowerCase()).lastIndexOf("<refermsg")) >= 0 && lowerCase.lastIndexOf("</refermsg>") < iLastIndexOf) {
                }
                return m5576A(matcher.group(0).trim());
            }
            return HttpUrl.FRAGMENT_ENCODE_SET;
        } catch (Throwable unused) {
            return HttpUrl.FRAGMENT_ENCODE_SET;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public static String m5584i(Object obj, String str, String str2, int i9, Set set) {
        if (obj == null || i9 < 0) {
            return HttpUrl.FRAGMENT_ENCODE_SET;
        }
        if (set != null) {
            try {
                if (set.contains(obj)) {
                    return HttpUrl.FRAGMENT_ENCODE_SET;
                }
                set.add(obj);
            } catch (Throwable unused) {
            }
        }
        ArrayList arrayList = new ArrayList();
        for (Class<?> superclass = obj.getClass(); superclass != null && superclass != Object.class; superclass = superclass.getSuperclass()) {
            for (Field field : KavaReflector.declaredFields(superclass)) {
                try {
                    if (field.getType() == String.class) {
                        Object field2 = KavaReflector.readField(field, obj);
                        if ((field2 instanceof String) && !TextUtils.isEmpty((String) field2)) {
                            arrayList.add((String) field2);
                        }
                    }
                } catch (Throwable unused2) {
                }
            }
        }
        if (arrayList.size() >= 3 && ((String) arrayList.get(1)).equals(str) && ((String) arrayList.get(2)).equals(str2)) {
            return (String) arrayList.get(0);
        }
        for (Class<?> superclass2 = obj.getClass(); superclass2 != null && superclass2 != Object.class; superclass2 = superclass2.getSuperclass()) {
            for (Field field3 : KavaReflector.declaredFields(superclass2)) {
                try {
                    Class<?> type = field3.getType();
                    if (type != null && !type.isPrimitive() && !type.isEnum() && !type.isArray() && type != String.class && !Number.class.isAssignableFrom(type) && type != Boolean.class && type != Character.class && type != Class.class && type != Method.class && type != Field.class && !type.getName().startsWith("java.")) {
                        String strM5584i = m5584i(KavaReflector.readField(field3, obj), str, str2, i9 - 1, set);
                        if (!TextUtils.isEmpty(strM5584i)) {
                            return strM5584i;
                        }
                    }
                } catch (Throwable unused3) {
                }
            }
        }
        return HttpUrl.FRAGMENT_ENCODE_SET;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public static String m5585j(Pattern pattern, String str) {
        if (pattern != null) {
            try {
                Matcher matcher = pattern.matcher(str);
                if (matcher.find()) {
                    String strGroup = matcher.group(matcher.groupCount());
                    return m5576A(strGroup != null ? strGroup.trim() : HttpUrl.FRAGMENT_ENCODE_SET);
                }
            } catch (Throwable unused) {
            }
        }
        return HttpUrl.FRAGMENT_ENCODE_SET;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: n */
    public static boolean m5586n(Class cls, Method method) {
        if (method != null && cls != null && KavaReflector.isStatic(method) && method.getReturnType() == cls) {
            Class<?>[] parameterTypes = method.getParameterTypes();
            if (parameterTypes.length == 1 && parameterTypes[0] == String.class) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: q */
    public static String m5587q(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return HttpUrl.FRAGMENT_ENCODE_SET;
        }
        return str.trim() + '\n' + str2.trim();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: r */
    public static long m5588r(Object obj) {
        if (obj == null) {
            return 0L;
        }
        String[] strArr = {"getMsgId", "getMsgID", "getId"};
        for (int i9 = 0; i9 < 3; i9++) {
            Object objInvokeMethod = KavaReflector.invokeMethod(obj, strArr[i9], new Object[0]);
            if (objInvokeMethod instanceof Number) {
                return ((Number) objInvokeMethod).longValue();
            }
        }
        String[] strArr2 = {"field_msgId", "msgId", "msgID", "id"};
        for (int i10 = 0; i10 < 4; i10++) {
            Object field = KavaReflector.readField(obj, strArr2[i10]);
            if (field instanceof Number) {
                return ((Number) field).longValue();
            }
        }
        return 0L;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: t */
    public static void m5589t(String str, String str2, C1083c c1083c, C1087g c1087g) {
        String strM5587q = m5587q(str, str2);
        if (TextUtils.isEmpty(strM5587q)) {
            return;
        }
        C2342f c2342f = new C2342f();
        ((CopyOnWriteArrayList) f7685t.computeIfAbsent(strM5587q, new C0640b(25))).add(c2342f);
        c2342f.f7672a = f7684s.schedule(new RunnableC0217c(strM5587q, (Object) c2342f, (Object) c1083c, (Object) c1087g, 10), 2500L, TimeUnit.MILLISECONDS);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0103 A[PHI: r11
  0x0103: PHI (r11v18 java.lang.Object) = (r11v15 java.lang.Object), (r11v22 java.lang.Object) binds: [B:42:0x0109, B:39:0x0101] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object[] m5590c(Method method, Object obj, String str, String str2, String str3) {
        Object objNewInstance;
        byte[] bArr;
        Object objStaticInstance;
        Class<?>[] parameterTypes = method.getParameterTypes();
        Object[] objArr = new Object[parameterTypes.length];
        objArr[0] = obj;
        String strM5585j = m5585j(f7673h, str2);
        if (TextUtils.isEmpty(strM5585j)) {
            strM5585j = m5585j(f7674i, str2);
        }
        objArr[1] = strM5585j;
        objArr[2] = m5585j(f7675j, str2);
        objArr[3] = str;
        objArr[4] = HttpUrl.FRAGMENT_ENCODE_SET;
        String[] strArr = {m5585j(f7677l, str2), m5585j(f7678m, str2), m5585j(f7679n, str2), m5585j(f7680o, str2)};
        int i9 = 0;
        while (true) {
            objNewInstance = null;
            if (i9 >= 4) {
                bArr = null;
                break;
            }
            String str4 = strArr[i9];
            String strTrim = str4 == null ? HttpUrl.FRAGMENT_ENCODE_SET : m5576A(str4).replace("&amp;", "&").replace("&lt;", "<").replace("&gt;", ">").replace("&quot;", "\"").replace("&apos;", "'").trim();
            if (!TextUtils.isEmpty(strTrim)) {
                bArr = (byte[]) f7681p.get(strTrim);
                if (bArr != null && bArr.length > 0) {
                    break;
                }
                if (f7682q.add(strTrim)) {
                    f7683r.execute(new RunnableC1117e1(this, strTrim));
                }
            }
            i9++;
        }
        objArr[5] = bArr;
        objArr[6] = "Hchat_xml_" + System.currentTimeMillis();
        objArr[7] = HttpUrl.FRAGMENT_ENCODE_SET;
        if (str3 == null) {
            str3 = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        objArr[8] = str3;
        if (parameterTypes.length == 10) {
            objArr[9] = 0L;
            return objArr;
        }
        if (parameterTypes.length == 12) {
            Class<?> cls = parameterTypes[9];
            try {
                objStaticInstance = KavaReflector.newInstance(KavaReflector.findConstructor(cls, Long.TYPE, String.class), 0L, str);
            } catch (Throwable unused) {
            }
            if (objStaticInstance != null) {
                objNewInstance = objStaticInstance;
                objArr[9] = objNewInstance;
                objArr[10] = Boolean.FALSE;
                objArr[11] = HttpUrl.FRAGMENT_ENCODE_SET;
            } else {
                objStaticInstance = KavaReflector.staticInstance(cls);
                if (objStaticInstance == null) {
                    try {
                        objNewInstance = KavaReflector.newInstance(KavaReflector.findConstructor(cls, new Class[0]), new Object[0]);
                    } catch (Throwable unused2) {
                    }
                }
                objArr[9] = objNewInstance;
                objArr[10] = Boolean.FALSE;
                objArr[11] = HttpUrl.FRAGMENT_ENCODE_SET;
            }
        }
        return objArr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0044 A[Catch: all -> 0x004a, TryCatch #0 {all -> 0x004a, blocks: (B:9:0x0013, B:21:0x0036, B:23:0x0044, B:28:0x004e, B:12:0x0018, B:14:0x0024), top: B:32:0x0013 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004c  */
    /* JADX INFO: renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m5591e(String str, String str2, int i9, Serializable serializable) {
        boolean z9;
        C1083c c1083c = this.f7691f;
        if (c1083c == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        try {
            if (str2 != null) {
                String lowerCase = str2.toLowerCase();
                if (lowerCase.contains("<appmsg") && lowerCase.contains("</appmsg>")) {
                    z9 = true;
                }
                m5589t(str, str2, c1083c, new C1087g(!z9 ? str2 : HttpUrl.FRAGMENT_ENCODE_SET, str, str, str2, String.valueOf(i9), System.currentTimeMillis() / 1000, 0L, serializable == null ? String.valueOf(serializable) : null, null, "local_send", true));
            }
            z9 = false;
            m5589t(str, str2, c1083c, new C1087g(!z9 ? str2 : HttpUrl.FRAGMENT_ENCODE_SET, str, str, str2, String.valueOf(i9), System.currentTimeMillis() / 1000, 0L, serializable == null ? String.valueOf(serializable) : null, null, "local_send", true));
        } catch (Throwable th2) {
            m5595o("登记本地发送兜底事件失败: " + th2.getMessage());
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k */
    public final Object m5592k(Class cls) {
        Method method;
        if (cls != null && (method = this.f7686a.serviceGetterMethod) != null) {
            try {
                return KavaReflector.invoke(method, null, cls);
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l */
    public final void m5593l() {
        if (this.f7692g) {
            return;
        }
        DexFinder dexFinder = this.f7686a;
        if (dexFinder.netQueueClass == null && dexFinder.netQueueCandidateClasses.isEmpty()) {
            return;
        }
        C2815c c2815c = this.f7687b;
        DexFinder dexFinder2 = this.f7686a;
        c2815c.m6212c(dexFinder2.netQueueClass, dexFinder2.netQueueCandidateClasses);
        this.f7692g = true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: m */
    public final boolean m5594m() {
        DexFinder dexFinder = this.f7686a;
        if (dexFinder.sendTextMsgClass != null) {
            return (dexFinder.sendTextMsgCtorLong == null && dexFinder.sendTextMsgCtorObject == null) ? false : true;
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: o */
    public final void m5595o(String str) {
        C2005i.m4939f("[WeChatMessageApi] ".concat(str));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: p */
    public final Object m5596p(String str, String str2, int i9, int i10, HashMap map) {
        Constructor<?> constructor;
        DexFinder dexFinder = this.f7686a;
        if (map != null && (constructor = dexFinder.sendTextMsgCtorObject) != null) {
            return KavaReflector.newInstance(constructor, str, str2, Integer.valueOf(i9), Integer.valueOf(i10), map);
        }
        Constructor<?> constructor2 = dexFinder.sendTextMsgCtorLong;
        if (constructor2 != null) {
            return KavaReflector.newInstance(constructor2, str, str2, Integer.valueOf(i9), Integer.valueOf(i10), 0L);
        }
        Constructor<?> constructor3 = dexFinder.sendTextMsgCtorObject;
        if (constructor3 != null) {
            return KavaReflector.newInstance(constructor3, str, str2, Integer.valueOf(i9), Integer.valueOf(i10), map);
        }
        Class<?> cls = dexFinder.sendTextMsgClass;
        Integer numValueOf = Integer.valueOf(i9);
        Integer numValueOf2 = Integer.valueOf(i10);
        Object obj = map;
        if (map == null) {
            obj = 0L;
        }
        Object[] objArr = {str, str2, numValueOf, numValueOf2, obj};
        if (cls == null) {
            return null;
        }
        try {
            return KavaReflector.newInstanceByArgs(cls, objArr);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: s */
    public final boolean m5597s(Object obj) {
        C2815c c2815c = this.f7687b;
        if (obj == null) {
            m5595o("撤回消息失败: 原生消息对象为空");
            return false;
        }
        DexFinder dexFinder = this.f7686a;
        if (dexFinder.revokeMsgCtor == null) {
            m5595o("撤回消息失败: API未就绪");
            return false;
        }
        m5593l();
        try {
            Object objNewInstance = KavaReflector.newInstance(dexFinder.revokeMsgCtor, obj, "你撤回了一条消息", HttpUrl.FRAGMENT_ENCODE_SET);
            if (objNewInstance == null) {
                m5595o("撤回消息失败: NetSceneRevokeMsg构造失败");
                return false;
            }
            boolean zM6216j = c2815c.m6216j(objNewInstance);
            StringBuilder sb2 = new StringBuilder("撤回原生消息");
            sb2.append(zM6216j ? "已发送" : "发送失败");
            sb2.append(": msgId=");
            sb2.append(m5588r(obj));
            m5595o(sb2.toString());
            return zM6216j;
        } catch (Throwable th2) {
            m5595o("撤回消息异常: " + th2.getMessage());
            return false;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00c1  */
    /* JADX INFO: renamed from: u */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m5598u(long j3, String str, String str2) {
        WeChatQuoteMsg quoteMsg;
        String strM3652c;
        boolean z9;
        long j4;
        long j5;
        long createTime;
        WeChatQuoteMsg quoteMsg2;
        WeChatQuoteMsg quoteMsg3;
        WeChatQuoteMsg quoteMsg4;
        WeChatQuoteMsg quoteMsg5;
        WeChatQuoteMsg quoteMsg6;
        WeChatQuoteMsg quoteMsg7;
        WeChatQuoteMsg quoteMsg8;
        if (TextUtils.isEmpty(str)) {
            m5595o("发送引用失败: talker为空");
            return false;
        }
        if (j3 <= 0) {
            m5595o("发送引用失败: msgId无效");
            return false;
        }
        C2355s c2355s = this.f7690e;
        if (!c2355s.m5665h()) {
            m5595o("发送引用失败: messageStore未就绪");
            return false;
        }
        WeChatMessage weChatMessageM5661c = c2355s.m5661c(j3);
        if (weChatMessageM5661c == null) {
            weChatMessageM5661c = c2355s.m5662d(j3);
        }
        if (weChatMessageM5661c == null) {
            m5595o("发送引用失败: 未找到源消息 msgId/msgSvrId=" + j3);
            return false;
        }
        String strBodyContent = !TextUtils.isEmpty(str2) ? str2 : (!weChatMessageM5661c.isQuote() || (quoteMsg = weChatMessageM5661c.getQuoteMsg()) == null || TextUtils.isEmpty(quoteMsg.getTitle())) ? weChatMessageM5661c.bodyContent() : quoteMsg.getTitle();
        boolean zIsEmpty = TextUtils.isEmpty(weChatMessageM5661c.getTalker());
        String strM3731t = HttpUrl.FRAGMENT_ENCODE_SET;
        String talker = !zIsEmpty ? weChatMessageM5661c.getTalker() : str != null ? str : HttpUrl.FRAGMENT_ENCODE_SET;
        String sendTalker = (!weChatMessageM5661c.isQuote() || (quoteMsg8 = weChatMessageM5661c.getQuoteMsg()) == null || TextUtils.isEmpty(quoteMsg8.getSendTalker())) ? weChatMessageM5661c.getSendTalker() : quoteMsg8.getSendTalker();
        C1360a c1360a = this.f7688c;
        if (!TextUtils.isEmpty(c1360a.m3652c())) {
            strM3652c = c1360a.m3652c();
        } else if (str == null || !C1368i.m3686I(str)) {
            if (TextUtils.isEmpty(str)) {
                WeChatMessage weChatMessageM5660b = c2355s.m5660b(str);
                strM3652c = (weChatMessageM5660b == null || TextUtils.isEmpty(weChatMessageM5660b.selfWxId)) ? HttpUrl.FRAGMENT_ENCODE_SET : weChatMessageM5660b.selfWxId;
            } else {
                strM3652c = str;
            }
        }
        if (!weChatMessageM5661c.isQuote() || (quoteMsg7 = weChatMessageM5661c.getQuoteMsg()) == null || TextUtils.isEmpty(quoteMsg7.getDisplayName())) {
            String sendTalker2 = weChatMessageM5661c.getSendTalker();
            if (!TextUtils.isEmpty(sendTalker2)) {
                boolean zIsGroupChat = weChatMessageM5661c.isGroupChat();
                C1368i c1368i = this.f7689d;
                strM3731t = zIsGroupChat ? c1368i.m3731t(weChatMessageM5661c.getTalker(), sendTalker2) : c1368i.m3729r(sendTalker2);
                if (TextUtils.isEmpty(strM3731t)) {
                    strM3731t = sendTalker2;
                }
            }
        } else {
            strM3731t = quoteMsg7.getDisplayName();
        }
        String msgSource = (!weChatMessageM5661c.isQuote() || (quoteMsg6 = weChatMessageM5661c.getQuoteMsg()) == null || TextUtils.isEmpty(quoteMsg6.getMsgSource())) ? weChatMessageM5661c.getMsgSource() : quoteMsg6.getMsgSource();
        String strBodyContent2 = (!weChatMessageM5661c.isQuote() || (quoteMsg5 = weChatMessageM5661c.getQuoteMsg()) == null || TextUtils.isEmpty(quoteMsg5.getContent())) ? weChatMessageM5661c.bodyContent() : quoteMsg5.getContent();
        if (!weChatMessageM5661c.isQuote() || (quoteMsg4 = weChatMessageM5661c.getQuoteMsg()) == null || quoteMsg4.getSvrId() <= 0) {
            z9 = false;
            j4 = 0;
            j5 = weChatMessageM5661c.msgSvrId;
        } else {
            long svrId = quoteMsg4.getSvrId();
            z9 = false;
            j4 = 0;
            j5 = svrId;
        }
        if (!weChatMessageM5661c.isQuote() || (quoteMsg3 = weChatMessageM5661c.getQuoteMsg()) == null || quoteMsg3.getCreateTime() <= j4) {
            createTime = weChatMessageM5661c.getCreateTime();
            if (createTime > 1000000000000L) {
                createTime /= 1000;
            }
        } else {
            createTime = quoteMsg3.getCreateTime();
        }
        WeChatMessage weChatMessage = weChatMessageM5661c;
        long j10 = createTime;
        boolean z10 = z9;
        int type = (!weChatMessage.isQuote() || (quoteMsg2 = weChatMessage.getQuoteMsg()) == null || quoteMsg2.getType() <= 0) ? weChatMessage.getType() : quoteMsg2.getType();
        String strM5582g = m5582g(msgSource);
        String strM5582g2 = m5582g(strBodyContent2);
        String str3 = strM3652c;
        StringBuilder sb2 = new StringBuilder("<?xml version=\"1.0\"?><msg><appmsg appid=\"\" sdkver=\"0\"><title>");
        sb2.append(m5582g(strBodyContent));
        sb2.append("</title><type>57</type><appattach><cdnthumbaeskey /><aeskey /></appattach><refermsg><type>");
        sb2.append(type);
        sb2.append("</type><svrid>");
        sb2.append(j5);
        sb2.append("</svrid><fromusr>");
        sb2.append(m5582g(talker));
        sb2.append("</fromusr><chatusr>");
        sb2.append(m5582g(sendTalker));
        sb2.append("</chatusr><displayname>");
        sb2.append(m5582g(strM3731t));
        AbstractC2091b.m5173t(sb2, "</displayname><msgsource>", strM5582g, "</msgsource><content>", strM5582g2);
        AbstractC2091b.m5172s(sb2, "</content><createtime>", j10, "</createtime></refermsg></appmsg><fromusername>");
        sb2.append(m5582g(str3));
        sb2.append("</fromusername><scene>0</scene><appinfo><version>1</version><appname></appname></appinfo><commenturl></commenturl></msg>");
        String string = sb2.toString();
        if (!TextUtils.isEmpty(string)) {
            return m5603z(str, string);
        }
        m5595o("发送引用失败: 构造引用XML失败 msgId=" + j3);
        return z10;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: v */
    public final boolean m5599v(int i9, String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            m5595o("发送原始消息失败: talker/content 为空");
            return false;
        }
        if (i9 <= 0) {
            m5595o("发送原始消息失败: messageType 无效 " + i9);
            return false;
        }
        if (!m5594m()) {
            m5595o("发送原始消息失败: API 未就绪");
            return false;
        }
        m5593l();
        try {
            boolean zM6216j = this.f7687b.m6216j(m5596p(str, str2, i9, 0, null));
            if (zM6216j) {
                m5591e(str, str2, i9, null);
            }
            StringBuilder sb2 = new StringBuilder("发送原始消息");
            sb2.append(zM6216j ? "成功" : "失败");
            sb2.append(": ");
            sb2.append(str);
            sb2.append(" type=");
            sb2.append(i9);
            m5595o(sb2.toString());
            return zM6216j;
        } catch (Throwable th2) {
            m5595o("发送原始消息异常: " + th2.getMessage());
            return false;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: w */
    public final boolean m5600w(String str, String str2) {
        Throwable th2;
        Object objInvoke;
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            m5595o("发送名片失败: talker/wxid 为空");
            return false;
        }
        if (!m5594m()) {
            m5595o("发送名片失败: 发送API未就绪");
            return false;
        }
        DexFinder dexFinder = this.f7686a;
        if (dexFinder.contactCardXmlMethod == null) {
            m5595o("发送名片失败: 名片API未就绪");
            return false;
        }
        m5593l();
        try {
            try {
                objInvoke = KavaReflector.invoke(dexFinder.contactCardXmlMethod, null, str2, null);
            } catch (Throwable th3) {
                m5595o("构造名片XML异常: " + th3.getMessage());
            }
            String str3 = objInvoke instanceof String ? (String) objInvoke : HttpUrl.FRAGMENT_ENCODE_SET;
            if (TextUtils.isEmpty(str3)) {
                try {
                    m5595o("发送名片失败: 构造名片XML失败 " + str2);
                    return false;
                } catch (Throwable th4) {
                    th2 = th4;
                }
            } else {
                int i9 = str3.contains("openimappid=") ? 66 : 42;
                try {
                    boolean zM6216j = this.f7687b.m6216j(m5596p(str, str3, i9, 0, null));
                    if (zM6216j) {
                        m5591e(str, str3, i9, null);
                    }
                    StringBuilder sb2 = new StringBuilder("发送名片");
                    sb2.append(zM6216j ? "成功" : "失败");
                    sb2.append(": ");
                    sb2.append(str);
                    sb2.append(" wxid=");
                    sb2.append(str2);
                    m5595o(sb2.toString());
                    return zM6216j;
                } catch (Throwable th5) {
                    th = th5;
                }
            }
        } catch (Throwable th6) {
            th = th6;
        }
        th2 = th;
        m5595o("发送名片异常: " + th2.getMessage());
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: x */
    public final boolean m5601x(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            m5595o("发送文本失败: talker/text 为空");
            return false;
        }
        if (!m5594m()) {
            m5595o("发送文本失败: API 未就绪");
            return false;
        }
        m5593l();
        try {
            boolean zM6216j = this.f7687b.m6216j(m5596p(str, str2, 1, 0, null));
            if (zM6216j) {
                m5591e(str, str2, 1, null);
            }
            StringBuilder sb2 = new StringBuilder("发送文本");
            sb2.append(zM6216j ? "成功" : "失败");
            sb2.append(": ");
            sb2.append(str);
            m5595o(sb2.toString());
            return zM6216j;
        } catch (Throwable th2) {
            m5595o("发送文本异常: " + th2.getMessage());
            return false;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: y */
    public final boolean m5602y(String str, String str2, List list) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            m5595o("发送@文本失败: talker/text 为空");
            return false;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str3 = (String) it.next();
            if (!TextUtils.isEmpty(str3) && !arrayList.contains(str3)) {
                arrayList.add(str3);
            }
        }
        if (arrayList.isEmpty()) {
            return m5601x(str, str2);
        }
        if (!m5594m() || this.f7686a.sendTextMsgCtorObject == null) {
            m5595o("发送@文本失败: Object构造器不可用");
            return false;
        }
        m5593l();
        try {
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            boolean zM6216j = this.f7687b.m6216j(m5596p(str, str2, 1, 1, m5578a(arrayList)));
            if (zM6216j) {
                m5591e(str, str2, 1, m5578a(arrayList));
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("发送@文本");
            sb2.append(zM6216j ? "成功" : "失败");
            sb2.append(": ");
            sb2.append(str);
            m5595o(sb2.toString());
            return zM6216j;
        } catch (Throwable th3) {
            th = th3;
            m5595o("发送@文本异常: " + th.getMessage());
            return false;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:114:0x00d2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0098 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:122:0x00cc A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:124:0x00a0 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:4:0x0008 A[PHI: r2
  0x0008: PHI (r2v7 java.lang.String) = (r2v0 java.lang.String), (r2v0 java.lang.String), (r2v4 java.lang.String) binds: [B:3:0x0006, B:6:0x0012, B:12:0x0025] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00df A[Catch: all -> 0x0170, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0170, blocks: (B:31:0x0074, B:63:0x00df), top: B:108:0x0074 }] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0107  */
    /* JADX INFO: renamed from: z */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m5603z(String str, String str2) {
        String str3;
        Throwable th2;
        Class<?> cls;
        Method method;
        Object objInvoke;
        Object objInvoke2;
        String strValueOf;
        String strM2251n = HttpUrl.FRAGMENT_ENCODE_SET;
        if (str2 == null) {
            str3 = strM2251n;
        } else {
            String strTrim = str2.trim();
            if (strTrim.length() != 0) {
                String lowerCase = strTrim.toLowerCase();
                if (lowerCase.startsWith("<appmsg") && lowerCase.contains("</appmsg>")) {
                    strM2251n = AbstractC0921a.m2251n("<msg>", strTrim, "</msg>");
                    str3 = strM2251n;
                } else {
                    str3 = strTrim;
                }
            }
        }
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str3)) {
            m5595o("发送XML失败: talker/xml 为空");
            return false;
        }
        String strTrim2 = str3.trim();
        if (strTrim2.startsWith("<") && strTrim2.endsWith(">")) {
            boolean z9 = true;
            if (strTrim2.indexOf(62) > 1) {
                String lowerCase2 = str3.toLowerCase();
                if (!lowerCase2.contains("<appmsg") || !lowerCase2.contains("</appmsg>")) {
                    return m5599v(49, str, str3);
                }
                DexFinder dexFinder = this.f7686a;
                Method method2 = dexFinder.sendXmlAppMsgMethod;
                if (method2 == null) {
                    m5595o("发送XML失败: AppMsgLogic API 未就绪");
                    return false;
                }
                try {
                    cls = method2.getParameterTypes()[0];
                    method = dexFinder.appMsgParseMethod;
                } catch (Throwable th3) {
                    th = th3;
                }
                if (m5586n(cls, method)) {
                    try {
                        objInvoke = KavaReflector.invoke(method, null, str3);
                        if (!cls.isInstance(objInvoke)) {
                        }
                    } catch (Throwable unused) {
                    }
                    if (objInvoke == null) {
                    }
                    if (objInvoke2 != null) {
                    }
                    th2 = th;
                } else {
                    objInvoke = null;
                    if (objInvoke == null) {
                        objInvoke2 = objInvoke;
                    } else {
                        try {
                        } catch (Throwable unused2) {
                        }
                        for (Method method3 : KavaReflector.declaredMethods(cls)) {
                            if (m5586n(cls, method3)) {
                                if (m5586n(cls, method3)) {
                                    try {
                                        objInvoke2 = KavaReflector.invoke(method3, null, str3);
                                        if (!cls.isInstance(objInvoke2)) {
                                        }
                                    } catch (Throwable unused3) {
                                    }
                                    if (objInvoke2 == null) {
                                    }
                                    objInvoke2 = null;
                                } else {
                                    objInvoke2 = null;
                                    if (objInvoke2 == null) {
                                        dexFinder.appMsgParseMethod = method3;
                                        break;
                                    }
                                    objInvoke2 = null;
                                }
                            }
                        }
                        objInvoke2 = null;
                    }
                    if (objInvoke2 != null) {
                        try {
                            m5595o("发送XML失败: 微信解析AppMsg失败");
                            return false;
                        } catch (Throwable th4) {
                            th2 = th4;
                        }
                    } else {
                        String strM5583h = m5583h(str3);
                        try {
                            Object[] objArrM5590c = m5590c(method2, objInvoke2, str, str3, strM5583h);
                            if (objArrM5590c.length == 12 && objArrM5590c[9] == null) {
                                m5595o("发送XML失败: MsgIdTalker参数创建失败");
                                return false;
                            }
                            Object objInvoke3 = KavaReflector.invoke(method2, null, objArrM5590c);
                            if (objInvoke3 instanceof Pair) {
                                Pair pair = (Pair) objInvoke3;
                                Object obj = pair.first;
                                Object obj2 = pair.second;
                                if ((obj instanceof Number ? ((Number) obj).intValue() : -1) != 0 || ((obj2 instanceof Number) && ((Number) obj2).longValue() < 0)) {
                                }
                            } else {
                                z9 = false;
                            }
                            if (z9) {
                                m5591e(str, str3, 49, strM5583h);
                            } else {
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append("发送XML失败: AppMsgLogic返回 ");
                                if (objInvoke3 instanceof Pair) {
                                    Pair pair2 = (Pair) objInvoke3;
                                    strValueOf = "first=" + pair2.first + ", second=" + pair2.second;
                                } else {
                                    strValueOf = String.valueOf(objInvoke3);
                                }
                                sb2.append(strValueOf);
                                m5595o(sb2.toString());
                            }
                            return z9;
                        } catch (Throwable th5) {
                            th = th5;
                        }
                    }
                    th2 = th;
                }
                m5595o("发送XML异常: " + th2.getMessage());
                return false;
            }
        }
        m5595o("发送XML失败: 内容不是XML");
        return false;
    }
}
