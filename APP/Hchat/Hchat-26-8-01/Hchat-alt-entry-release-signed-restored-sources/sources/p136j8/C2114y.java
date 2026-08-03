package p136j8;

import ac.C0058k;
import android.content.ContentValues;
import android.content.Context;
import android.media.MediaMetadataRetriever;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import me.yun.silk.AacCodec;
import me.yun.silk.SilkCodec;
import okhttp3.HttpUrl;
import p014b.C0126e;
import p024b9.RunnableC0217c;
import p099h.Hchat.dexkit.DexFinder;
import p099h.Hchat.hooks.api.core.WeChatApis;
import p099h.Hchat.utils.KavaReflector;
import p125i8.C2002f;
import p125i8.C2005i;
import p129ig.AbstractC2043a;
import p183m8.C2813a;
import p259r9.AbstractC3754e0;
import p288tb.C4143c;
import p300ub.AbstractC4302b;

/* JADX INFO: renamed from: j8.y */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2114y {

    /* JADX INFO: renamed from: h */
    public static final Handler f7060h = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: a */
    public final DexFinder f7061a;

    /* JADX INFO: renamed from: b */
    public final Context f7062b;

    /* JADX INFO: renamed from: c */
    public volatile Method f7063c;

    /* JADX INFO: renamed from: d */
    public final Object f7064d = new Object();

    /* JADX INFO: renamed from: e */
    public Object f7065e;

    /* JADX INFO: renamed from: f */
    public C0126e f7066f;

    /* JADX INFO: renamed from: g */
    public long f7067g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2114y(Context context, DexFinder dexFinder, C2002f c2002f) {
        this.f7062b = context;
        this.f7061a = dexFinder;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public static Object m5304g(Class cls) {
        if (!cls.isPrimitive()) {
            return null;
        }
        if (cls == Boolean.TYPE) {
            return Boolean.FALSE;
        }
        if (cls == Byte.TYPE) {
            return (byte) 0;
        }
        if (cls == Short.TYPE) {
            return (short) 0;
        }
        if (cls == Integer.TYPE) {
            return 0;
        }
        if (cls == Long.TYPE) {
            return 0L;
        }
        return cls == Float.TYPE ? Float.valueOf(0.0f) : cls == Double.TYPE ? Double.valueOf(0.0d) : cls == Character.TYPE ? (char) 0 : null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public static int m5305h(String str) {
        int iMin = 0;
        try {
            long duration = new SilkCodec().getDuration(str);
            if (duration > 0) {
                iMin = (int) Math.min(2147483647L, duration);
            }
        } catch (Throwable unused) {
        }
        if (iMin > 0) {
            return iMin;
        }
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            mediaMetadataRetriever.setDataSource(str);
            String strExtractMetadata = mediaMetadataRetriever.extractMetadata(9);
            if (!TextUtils.isEmpty(strExtractMetadata)) {
                int iMin2 = (int) Math.min(2147483647L, Math.max(1L, Long.parseLong(strExtractMetadata)));
                try {
                    mediaMetadataRetriever.release();
                } catch (Throwable unused2) {
                }
                return iMin2;
            }
        } catch (Throwable unused3) {
        }
        try {
            mediaMetadataRetriever.release();
            return 1000;
        } catch (Throwable unused4) {
            return 1000;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: x */
    public static String m5306x(int i9, String str) {
        if (i9 == 1) {
            return "silk_";
        }
        String lowerCase = str != null ? str.toLowerCase() : HttpUrl.FRAGMENT_ENCODE_SET;
        return (lowerCase.endsWith(".silk") || lowerCase.endsWith(".slk")) ? "silk_" : (lowerCase.endsWith(".spx") || lowerCase.endsWith(".speex")) ? "spx_" : "amr_";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final boolean m5307a() {
        DexFinder dexFinder = this.f7061a;
        return (dexFinder.voiceStartRecordMethod == null || dexFinder.voiceFullPathMethod == null || dexFinder.voiceFinishRecordMethod == null) ? false : true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final boolean m5308b() {
        return m5307a() && this.f7061a.voiceUploadClass != null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final C0126e m5309c(long j3) {
        synchronized (this.f7064d) {
            try {
                if (j3 != this.f7067g) {
                    return null;
                }
                C0126e c0126e = this.f7066f;
                this.f7065e = null;
                this.f7066f = null;
                return c0126e;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public final int m5310d(File file, File file2) {
        try {
            SilkCodec silkCodec = new SilkCodec();
            int fileType = silkCodec.getFileType(file.getAbsolutePath());
            if (fileType == 2 || fileType == 3 || fileType == 4 || fileType == 5) {
                return AacCodec.autoToSilkCompat(file.getAbsolutePath(), file2.getAbsolutePath(), silkCodec, C4143c.DEFAULT_HZ);
            }
            if (fileType == 7 || fileType == 8) {
                return AacCodec.mp4ToSilk(file.getAbsolutePath(), file2.getAbsolutePath(), silkCodec, C4143c.DEFAULT_HZ);
            }
            int iAutoToSilkCompat = AacCodec.autoToSilkCompat(file.getAbsolutePath(), file2.getAbsolutePath(), silkCodec, C4143c.DEFAULT_HZ);
            return iAutoToSilkCompat == 0 ? iAutoToSilkCompat : AacCodec.mp4ToSilk(file.getAbsolutePath(), file2.getAbsolutePath(), silkCodec, C4143c.DEFAULT_HZ);
        } catch (Throwable th2) {
            m5317m("音频转 Silk 异常: " + th2.getMessage());
            return -1;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 3, expect 1 */
    /* JADX WARN: Removed duplicated region for block: B:49:0x005e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0063 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX INFO: renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m5311e(File file, File file2) {
        FileOutputStream fileOutputStream;
        File parentFile;
        FileInputStream fileInputStream = null;
        try {
            parentFile = file2.getParentFile();
        } catch (Throwable th2) {
            th = th2;
            fileOutputStream = null;
        }
        try {
            if (parentFile != null && !parentFile.isDirectory() && !parentFile.mkdirs()) {
                return false;
            }
            FileInputStream fileInputStream2 = new FileInputStream(file);
            try {
                FileOutputStream fileOutputStream2 = new FileOutputStream(file2, false);
                try {
                    byte[] bArr = new byte[8192];
                    while (true) {
                        int i9 = fileInputStream2.read(bArr);
                        if (i9 <= 0) {
                            break;
                        }
                        fileOutputStream2.write(bArr, 0, i9);
                    }
                    fileOutputStream2.flush();
                    try {
                        fileInputStream2.close();
                    } catch (Throwable unused) {
                    }
                    try {
                        fileOutputStream2.close();
                        return true;
                    } catch (Throwable unused2) {
                        return true;
                    }
                } catch (Throwable th3) {
                    fileOutputStream = fileOutputStream2;
                    th = th3;
                    fileInputStream = fileInputStream2;
                    m5317m("复制语音文件异常: " + th.getMessage());
                    if (fileInputStream != null) {
                    }
                    if (fileOutputStream != null) {
                    }
                    return false;
                }
            } catch (Throwable th4) {
                th = th4;
                fileOutputStream = null;
            }
            m5317m("复制语音文件异常: " + th.getMessage());
            if (fileInputStream != null) {
                try {
                    fileInputStream.close();
                } catch (Throwable unused3) {
                }
            }
            if (fileOutputStream != null) {
                try {
                    fileOutputStream.close();
                } catch (Throwable unused4) {
                }
            }
            return false;
        } finally {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public final File m5312f(File file) {
        try {
            File parentFile = file.getParentFile();
            if (parentFile == null || !parentFile.isDirectory() || !parentFile.canWrite()) {
                parentFile = null;
            }
            return parentFile != null ? File.createTempFile("hchat_voice_", ".silk", parentFile) : File.createTempFile("hchat_voice_", ".silk");
        } catch (Throwable th2) {
            m5317m("创建临时 Silk 文件失败: " + th2.getMessage());
            return null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public final int m5313i(int i9) {
        Context context = this.f7062b;
        return AbstractC4302b.m8640c(context, "Hchat_fake_voice_duration_config").getBoolean("fake_voice_duration_enable", false) ? AbstractC3754e0.m7909r(AbstractC4302b.m8640c(context, "Hchat_fake_voice_duration_config").getInt("fake_voice_duration_seconds", 5), 1, 60) * 1000 : Math.min(60000, Math.max(1, i9));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public final boolean m5314j(int i9, String str) {
        Method method = this.f7061a.voiceFinishRecordMethod;
        if (method.getParameterTypes().length == 3) {
            Object objInvoke = KavaReflector.invoke(method, null, str, Integer.valueOf(i9), 0);
            if ((objInvoke instanceof Boolean) && ((Boolean) objInvoke).booleanValue()) {
                return true;
            }
        } else {
            Object objInvoke2 = KavaReflector.invoke(method, null, str, Integer.valueOf(i9), 0, null);
            if ((objInvoke2 instanceof Boolean) && ((Boolean) objInvoke2).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k */
    public final String m5315k(String str, boolean z9) {
        Object field;
        Object field2;
        DexFinder dexFinder = this.f7061a;
        Method method = dexFinder.voiceFullPathMethod;
        Object obj = null;
        Object objM4995A = (method == null || KavaReflector.isStatic(method)) ? null : AbstractC2043a.m4995A(dexFinder, method.getDeclaringClass());
        if (!KavaReflector.isStatic(method) && objM4995A == null) {
            m5317m("发送语音失败: 获取语音路径服务失败 ".concat(method.getDeclaringClass().getName()));
            return HttpUrl.FRAGMENT_ENCODE_SET;
        }
        Class<?>[] parameterTypes = method.getParameterTypes();
        if (parameterTypes.length == 2) {
            return (String) KavaReflector.invoke(method, objM4995A, str, Boolean.valueOf(z9));
        }
        Class<?> cls = parameterTypes[0];
        try {
            field2 = KavaReflector.readField(KavaReflector.findDeclaredField(cls, "j"), (Object) null);
        } catch (Throwable unused) {
        }
        if (field2 != null) {
            obj = field2;
        } else {
            try {
                Iterator<Field> it = KavaReflector.declaredFields(cls).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Field next = it.next();
                    if (KavaReflector.isStatic(next) && cls.isAssignableFrom(next.getType()) && (field = KavaReflector.readField(next, (Object) null)) != null) {
                        obj = field;
                        break;
                    }
                }
            } catch (Throwable unused2) {
            }
        }
        return obj == null ? HttpUrl.FRAGMENT_ENCODE_SET : (String) KavaReflector.invoke(method, objM4995A, obj, str, Boolean.valueOf(z9));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l */
    public final boolean m5316l(Method method, Object... objArr) {
        Object obj;
        synchronized (this.f7064d) {
            obj = this.f7065e;
        }
        if (obj != null && method != null && method.getDeclaringClass() == obj.getClass()) {
            try {
                Object objInvokeOrThrow = KavaReflector.invokeOrThrow(method, obj, objArr);
                if (objInvokeOrThrow instanceof Boolean) {
                    if (((Boolean) objInvokeOrThrow).booleanValue()) {
                        return true;
                    }
                }
            } catch (Throwable th2) {
                m5317m("控制原语音播放失败: " + th2.getMessage());
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: m */
    public final void m5317m(String str) {
        C2005i.m4939f("[WeChatVoiceApi] ".concat(str));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: n */
    public final Object m5318n(String str, boolean z9) {
        DexFinder dexFinder = this.f7061a;
        try {
            Constructor<?> constructor = z9 ? dexFinder.voiceUploadCdnCtor : dexFinder.voiceUploadCtor;
            if (constructor == null && z9) {
                constructor = dexFinder.voiceUploadCtor;
                z9 = false;
            }
            if (constructor == null) {
                constructor = dexFinder.voiceUploadCdnCtor;
                z9 = true;
            }
            if (constructor == null) {
                return m5319o(str);
            }
            if (z9) {
                return KavaReflector.newInstance(constructor, str, Boolean.TRUE);
            }
            Object objNewInstance = KavaReflector.newInstance(constructor, str, 0);
            return objNewInstance != null ? objNewInstance : m5319o(str);
        } catch (Throwable th2) {
            m5317m("创建语音上传请求异常: " + th2.getMessage());
            return m5319o(str);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: o */
    public final Object m5319o(String str) {
        Class<?> cls = this.f7061a.voiceUploadClass;
        if (cls == null) {
            return null;
        }
        for (Constructor<?> constructor : cls.getDeclaredConstructors()) {
            try {
                Class<?>[] parameterTypes = constructor.getParameterTypes();
                if (parameterTypes.length != 0 && parameterTypes[0] == String.class) {
                    KavaReflector.accessible(constructor);
                    Object[] objArr = new Object[parameterTypes.length];
                    objArr[0] = str;
                    for (int i9 = 1; i9 < parameterTypes.length; i9++) {
                        objArr[i9] = m5304g(parameterTypes[i9]);
                    }
                    Object objNewInstance = KavaReflector.newInstance(constructor, objArr);
                    if (objNewInstance != null) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("语音上传请求使用兜底构造: ");
                        sb2.append(constructor.getName() + Arrays.toString(constructor.getParameterTypes()));
                        m5317m(sb2.toString());
                        return objNewInstance;
                    }
                    continue;
                }
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: p */
    public final C0058k m5320p(File file) {
        int fileType;
        boolean z9 = false;
        try {
            fileType = new SilkCodec().getFileType(file.getAbsolutePath());
        } catch (Throwable unused) {
            fileType = 0;
        }
        if (fileType == 1) {
            return new C0058k(file, fileType, (File) null);
        }
        if (fileType <= 1) {
            if (fileType == 0) {
                String absolutePath = file.getAbsolutePath();
                MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
                try {
                    mediaMetadataRetriever.setDataSource(absolutePath);
                    String strExtractMetadata = mediaMetadataRetriever.extractMetadata(9);
                    if (!TextUtils.isEmpty(strExtractMetadata)) {
                        if (Long.parseLong(strExtractMetadata) > 0) {
                            z9 = true;
                        }
                    }
                } catch (Throwable unused2) {
                }
                try {
                    mediaMetadataRetriever.release();
                } catch (Throwable unused3) {
                }
                if (z9) {
                    File fileM5312f = m5312f(file);
                    if (fileM5312f != null) {
                        int iM5310d = m5310d(file, fileM5312f);
                        if (iM5310d == 0 && fileM5312f.isFile() && fileM5312f.length() > 0) {
                            return new C0058k(fileM5312f, 1, fileM5312f);
                        }
                        if (!fileM5312f.delete()) {
                            fileM5312f.deleteOnExit();
                        }
                        m5317m("发送语音失败: 未知音频转 Silk 失败 code=" + iM5310d);
                        return null;
                    }
                }
            }
            return new C0058k(file, fileType, (File) null);
        }
        File fileM5312f2 = m5312f(file);
        if (fileM5312f2 != null) {
            int iM5310d2 = m5310d(file, fileM5312f2);
            if (iM5310d2 == 0 && fileM5312f2.isFile() && fileM5312f2.length() > 0) {
                return new C0058k(fileM5312f2, 1, fileM5312f2);
            }
            if (!fileM5312f2.delete()) {
                fileM5312f2.deleteOnExit();
            }
            m5317m("发送语音失败: 转 Silk 失败 code=" + iM5310d2);
            return null;
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: q */
    public final String m5321q(String str) {
        if (!TextUtils.isEmpty(str) && this.f7061a.voiceFullPathMethod != null) {
            try {
                return m5315k(str, false);
            } catch (Throwable th2) {
                m5317m("解析语音路径异常: " + th2.getMessage());
            }
        }
        return HttpUrl.FRAGMENT_ENCODE_SET;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: r */
    public final boolean m5322r(InterfaceC2112w interfaceC2112w) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            return interfaceC2112w.run();
        }
        AtomicReference atomicReference = new AtomicReference(Boolean.FALSE);
        CountDownLatch countDownLatch = new CountDownLatch(1);
        if (!f7060h.post(new RunnableC0217c(this, atomicReference, interfaceC2112w, countDownLatch, 9))) {
            m5317m("语音主线程任务投递失败");
            return false;
        }
        try {
            if (countDownLatch.await(90L, TimeUnit.SECONDS)) {
                Boolean bool = (Boolean) atomicReference.get();
                return bool != null && bool.booleanValue();
            }
            m5317m("语音主线程任务执行超时");
            return false;
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            m5317m("语音主线程任务等待被中断");
            return false;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: s */
    public final boolean m5323s(final int i9, final String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            m5317m("发送语音失败: talker/voicePath为空");
            return false;
        }
        File file = new File(str2);
        if (!file.isFile()) {
            m5317m("发送语音失败: 文件不存在 " + str2);
            return false;
        }
        if (!m5308b()) {
            m5317m("发送语音失败: API未就绪");
            return false;
        }
        final C0058k c0058kM5320p = m5320p(file);
        if (c0058kM5320p != null && ((File) c0058kM5320p.f177i).isFile()) {
            try {
                return m5322r(new InterfaceC2112w() { // from class: j8.t
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                    @Override // p136j8.InterfaceC2112w
                    public final boolean run() {
                        String str3 = str;
                        int i10 = i9;
                        C2114y c2114y = this.f7048a;
                        DexFinder dexFinder = c2114y.f7061a;
                        C0058k c0058k = c0058kM5320p;
                        File file2 = (File) c0058k.f177i;
                        try {
                            String str4 = (String) KavaReflector.invoke(dexFinder.voiceStartRecordMethod, null, str3, C2114y.m5306x(c0058k.f176h, file2.getAbsolutePath()));
                            if (TextUtils.isEmpty(str4)) {
                                c2114y.m5317m("发送语音失败: 创建voiceinfo失败");
                                return false;
                            }
                            String strM5315k = c2114y.m5315k(str4, true);
                            if (TextUtils.isEmpty(strM5315k)) {
                                c2114y.m5317m("发送语音失败: 获取语音目标路径失败");
                                return false;
                            }
                            if (!c2114y.m5311e(file2, new File(strM5315k))) {
                                c2114y.m5317m("发送语音失败: 复制语音文件失败 " + strM5315k);
                                return false;
                            }
                            int iMax = Math.max(1, i10);
                            if (!c2114y.m5314j(c2114y.m5313i(iMax), str4)) {
                                c2114y.m5317m("发送语音失败: 完成voiceinfo失败");
                                return false;
                            }
                            Object objM5318n = c2114y.m5318n(str4, dexFinder.voiceUploadCdnCtor != null && (iMax > 60000 || file2.length() >= 460000 || dexFinder.voiceUploadCtor == null));
                            if (objM5318n != null) {
                                C2813a c2813aNetwork = WeChatApis.network();
                                if (c2813aNetwork != null && c2813aNetwork.f9079a.m6216j(objM5318n)) {
                                    return true;
                                }
                                c2114y.m5317m("发送语音失败: 网络发包失败");
                                return false;
                            }
                            StringBuilder sb2 = new StringBuilder("发送语音失败: 创建上传请求失败 uploadClass=");
                            Class<?> cls = dexFinder.voiceUploadClass;
                            sb2.append(cls != null ? cls.getName() : "null");
                            sb2.append(" ctors=");
                            sb2.append(c2114y.m5328y());
                            c2114y.m5317m(sb2.toString());
                            return false;
                        } catch (Throwable th2) {
                            c2114y.m5317m("发送语音异常: " + th2.getMessage());
                            return false;
                        }
                    }
                });
            } finally {
                c0058kM5320p.m358i();
            }
        }
        m5317m("发送语音失败: 音频转换失败 " + str2);
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: t */
    public final boolean m5324t(String str, String str2) {
        return m5323s(TextUtils.isEmpty(str2) ? 0 : m5305h(str2), str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: u */
    public final void m5325u() {
        Object obj;
        Method method = this.f7061a.voicePlaybackStopMethod;
        synchronized (this.f7064d) {
            this.f7067g++;
            obj = this.f7065e;
            this.f7065e = null;
            this.f7066f = null;
        }
        if (obj == null || method == null || method.getDeclaringClass() != obj.getClass()) {
            return;
        }
        m5326v(obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: v */
    public final void m5326v(Object obj) {
        Method method = this.f7061a.voicePlaybackStopMethod;
        if (obj == null || method == null || method.getDeclaringClass() != obj.getClass()) {
            return;
        }
        try {
            KavaReflector.invokeOrThrow(method, obj, Boolean.TRUE);
        } catch (Throwable th2) {
            m5317m("停止原语音播放失败: " + th2.getMessage());
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: w */
    public final Method m5327w(Class cls) {
        Method method = this.f7063c;
        if (method != null && method.getDeclaringClass().isAssignableFrom(cls)) {
            return method;
        }
        for (Method method2 : KavaReflector.declaredMethods(cls)) {
            if (method2.getParameterTypes().length == 0 && method2.getReturnType() == ContentValues.class) {
                this.f7063c = KavaReflector.accessible(method2);
                return this.f7063c;
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: y */
    public final String m5328y() {
        Class<?> cls = this.f7061a.voiceUploadClass;
        if (cls == null) {
            return HttpUrl.PATH_SEGMENT_ENCODE_SET_URI;
        }
        StringBuilder sb2 = new StringBuilder("[");
        Constructor<?>[] declaredConstructors = cls.getDeclaredConstructors();
        for (int i9 = 0; i9 < declaredConstructors.length; i9++) {
            if (i9 > 0) {
                sb2.append(", ");
            }
            Constructor<?> constructor = declaredConstructors[i9];
            sb2.append(constructor == null ? "null" : constructor.getName() + Arrays.toString(constructor.getParameterTypes()));
        }
        sb2.append(']');
        return sb2.toString();
    }
}
