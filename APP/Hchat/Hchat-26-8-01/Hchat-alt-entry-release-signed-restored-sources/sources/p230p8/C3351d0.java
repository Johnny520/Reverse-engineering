package p230p8;

import android.content.ContentValues;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.media.MediaMetadataRetriever;
import be.AbstractC0283h;
import ch.C0570e;
import gg.AbstractC1416l;
import gg.AbstractC1426v;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.RandomAccessFile;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.BiFunction;
import ng.AbstractC3015m;
import okhttp3.HttpUrl;
import org.json.JSONObject;
import org.luckypray.dexkit.DexKitBridge;
import p000a.AbstractC0000a;
import p015b0.C0154t;
import p024b9.C0219e;
import p025bc.AbstractC0255e;
import p054dg.C0795n;
import p062e8.C0828b;
import p065eb.C0898v;
import p068eh.AbstractC0921a;
import p069f.C0939i0;
import p085fg.InterfaceC1220a;
import p086fh.C1253k;
import p096g8.C1360a;
import p096g8.C1368i;
import p099h.Hchat.dexkit.DexFinder;
import p099h.Hchat.hooks.api.model.WeChatSnsLivePhoto;
import p099h.Hchat.hooks.api.model.WeChatSnsMedia;
import p099h.Hchat.hooks.api.model.WeChatSnsPost;
import p099h.Hchat.hooks.api.model.WeChatSnsPrepareResult;
import p099h.Hchat.utils.KavaReflector;
import p108ha.C1634c;
import p115hh.C1730o;
import p115hh.C1732q;
import p119i2.C1954y;
import p125i8.C2002f;
import p125i8.C2005i;
import p129ig.AbstractC2043a;
import p136j8.AbstractC2091b;
import p167l8.C2533h;
import p174m.C2576b;
import p183m8.C2813a;
import p218og.AbstractC3137a;
import p218og.AbstractC3149m;
import p218og.AbstractC3156t;
import p218og.C3145i;
import p218og.C3147k;
import p218og.InterfaceC3142f;
import p258r8.C3742g;
import p258r8.C3744i;
import p276sf.C3959f;
import p276sf.C3960g;
import p276sf.EnumC3957d;
import p300ub.AbstractC4302b;
import tf.AbstractC4165l;
import tf.AbstractC4166m;
import tf.AbstractC4167n;
import tf.C4173t;

/* JADX INFO: renamed from: p8.d0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3351d0 {

    /* JADX INFO: renamed from: a */
    public final Context f10781a;

    /* JADX INFO: renamed from: b */
    public final DexFinder f10782b;

    /* JADX INFO: renamed from: c */
    public final ClassLoader f10783c;

    /* JADX INFO: renamed from: d */
    public final DexKitBridge f10784d;

    /* JADX INFO: renamed from: e */
    public final C2813a f10785e;

    /* JADX INFO: renamed from: f */
    public final C1360a f10786f;

    /* JADX INFO: renamed from: g */
    public final C1368i f10787g;

    /* JADX INFO: renamed from: h */
    public final C3742g f10788h;

    /* JADX INFO: renamed from: i */
    public final Object f10789i;

    /* JADX INFO: renamed from: j */
    public final Object f10790j;

    /* JADX INFO: renamed from: k */
    public final Object f10791k;

    /* JADX INFO: renamed from: l */
    public final Object f10792l;

    /* JADX INFO: renamed from: m */
    public volatile C3373y f10793m;

    /* JADX INFO: renamed from: n */
    public final ConcurrentHashMap f10794n;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3351d0(Context context, DexFinder dexFinder, ClassLoader classLoader, DexKitBridge dexKitBridge, C2813a c2813a, C1360a c1360a, C1368i c1368i, C3742g c3742g, C2002f c2002f) {
        this.f10781a = context;
        this.f10782b = dexFinder;
        this.f10783c = classLoader;
        this.f10784d = dexKitBridge;
        this.f10785e = c2813a;
        this.f10786f = c1360a;
        this.f10787g = c1368i;
        this.f10788h = c3742g;
        final int i9 = 0;
        InterfaceC1220a interfaceC1220a = new InterfaceC1220a(this) { // from class: p8.a0

            /* JADX INFO: renamed from: h */
            public final /* synthetic */ C3351d0 f10764h;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            {
                this.f10764h = this;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // p085fg.InterfaceC1220a
            public final Object invoke() {
                DexKitBridge dexKitBridge2;
                switch (i9) {
                    case 0:
                        C3351d0 c3351d0 = this.f10764h;
                        Context context2 = c3351d0.f10781a;
                        ClassLoader classLoader2 = c3351d0.f10783c;
                        if (classLoader2 != null) {
                            return new C3372x(context2, classLoader2, c3351d0.f10784d, new C3364p(1, c3351d0, AbstractC0921a.m2246i(C3351d0.class), "log", "log(Ljava/lang/String;)V", 0, 0, 11));
                        }
                        return null;
                    case 1:
                        C3351d0 c3351d02 = this.f10764h;
                        Context context3 = c3351d02.f10781a;
                        ClassLoader classLoader3 = c3351d02.f10783c;
                        if (classLoader3 != null) {
                            return new C3353e0(context3, classLoader3, c3351d02.f10784d, new C3364p(1, c3351d02, AbstractC0921a.m2246i(C3351d0.class), "log", "log(Ljava/lang/String;)V", 0, 0, 12));
                        }
                        return null;
                    case 2:
                        C3351d0 c3351d03 = this.f10764h;
                        Context context4 = c3351d03.f10781a;
                        ClassLoader classLoader4 = c3351d03.f10783c;
                        if (classLoader4 == null || (dexKitBridge2 = c3351d03.f10784d) == null) {
                            return null;
                        }
                        return new C3356h(context4, classLoader4, dexKitBridge2, new C3364p(1, c3351d03, AbstractC0921a.m2246i(C3351d0.class), "log", "log(Ljava/lang/String;)V", 0, 0, 10));
                    default:
                        C3351d0 c3351d04 = this.f10764h;
                        C3742g c3742g2 = c3351d04.f10788h;
                        if (c3742g2 != null) {
                            return new C3363o(c3742g2, new C0154t(c3351d04, 19));
                        }
                        return null;
                }
            }
        };
        EnumC3957d enumC3957d = EnumC3957d.f12958g;
        this.f10789i = AbstractC0283h.m1127G(enumC3957d, interfaceC1220a);
        final int i10 = 1;
        this.f10790j = AbstractC0283h.m1127G(enumC3957d, new InterfaceC1220a(this) { // from class: p8.a0

            /* JADX INFO: renamed from: h */
            public final /* synthetic */ C3351d0 f10764h;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            {
                this.f10764h = this;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // p085fg.InterfaceC1220a
            public final Object invoke() {
                DexKitBridge dexKitBridge2;
                switch (i10) {
                    case 0:
                        C3351d0 c3351d0 = this.f10764h;
                        Context context2 = c3351d0.f10781a;
                        ClassLoader classLoader2 = c3351d0.f10783c;
                        if (classLoader2 != null) {
                            return new C3372x(context2, classLoader2, c3351d0.f10784d, new C3364p(1, c3351d0, AbstractC0921a.m2246i(C3351d0.class), "log", "log(Ljava/lang/String;)V", 0, 0, 11));
                        }
                        return null;
                    case 1:
                        C3351d0 c3351d02 = this.f10764h;
                        Context context3 = c3351d02.f10781a;
                        ClassLoader classLoader3 = c3351d02.f10783c;
                        if (classLoader3 != null) {
                            return new C3353e0(context3, classLoader3, c3351d02.f10784d, new C3364p(1, c3351d02, AbstractC0921a.m2246i(C3351d0.class), "log", "log(Ljava/lang/String;)V", 0, 0, 12));
                        }
                        return null;
                    case 2:
                        C3351d0 c3351d03 = this.f10764h;
                        Context context4 = c3351d03.f10781a;
                        ClassLoader classLoader4 = c3351d03.f10783c;
                        if (classLoader4 == null || (dexKitBridge2 = c3351d03.f10784d) == null) {
                            return null;
                        }
                        return new C3356h(context4, classLoader4, dexKitBridge2, new C3364p(1, c3351d03, AbstractC0921a.m2246i(C3351d0.class), "log", "log(Ljava/lang/String;)V", 0, 0, 10));
                    default:
                        C3351d0 c3351d04 = this.f10764h;
                        C3742g c3742g2 = c3351d04.f10788h;
                        if (c3742g2 != null) {
                            return new C3363o(c3742g2, new C0154t(c3351d04, 19));
                        }
                        return null;
                }
            }
        });
        final int i11 = 2;
        this.f10791k = AbstractC0283h.m1127G(enumC3957d, new InterfaceC1220a(this) { // from class: p8.a0

            /* JADX INFO: renamed from: h */
            public final /* synthetic */ C3351d0 f10764h;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            {
                this.f10764h = this;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // p085fg.InterfaceC1220a
            public final Object invoke() {
                DexKitBridge dexKitBridge2;
                switch (i11) {
                    case 0:
                        C3351d0 c3351d0 = this.f10764h;
                        Context context2 = c3351d0.f10781a;
                        ClassLoader classLoader2 = c3351d0.f10783c;
                        if (classLoader2 != null) {
                            return new C3372x(context2, classLoader2, c3351d0.f10784d, new C3364p(1, c3351d0, AbstractC0921a.m2246i(C3351d0.class), "log", "log(Ljava/lang/String;)V", 0, 0, 11));
                        }
                        return null;
                    case 1:
                        C3351d0 c3351d02 = this.f10764h;
                        Context context3 = c3351d02.f10781a;
                        ClassLoader classLoader3 = c3351d02.f10783c;
                        if (classLoader3 != null) {
                            return new C3353e0(context3, classLoader3, c3351d02.f10784d, new C3364p(1, c3351d02, AbstractC0921a.m2246i(C3351d0.class), "log", "log(Ljava/lang/String;)V", 0, 0, 12));
                        }
                        return null;
                    case 2:
                        C3351d0 c3351d03 = this.f10764h;
                        Context context4 = c3351d03.f10781a;
                        ClassLoader classLoader4 = c3351d03.f10783c;
                        if (classLoader4 == null || (dexKitBridge2 = c3351d03.f10784d) == null) {
                            return null;
                        }
                        return new C3356h(context4, classLoader4, dexKitBridge2, new C3364p(1, c3351d03, AbstractC0921a.m2246i(C3351d0.class), "log", "log(Ljava/lang/String;)V", 0, 0, 10));
                    default:
                        C3351d0 c3351d04 = this.f10764h;
                        C3742g c3742g2 = c3351d04.f10788h;
                        if (c3742g2 != null) {
                            return new C3363o(c3742g2, new C0154t(c3351d04, 19));
                        }
                        return null;
                }
            }
        });
        final int i12 = 3;
        this.f10792l = AbstractC0283h.m1127G(enumC3957d, new InterfaceC1220a(this) { // from class: p8.a0

            /* JADX INFO: renamed from: h */
            public final /* synthetic */ C3351d0 f10764h;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            {
                this.f10764h = this;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // p085fg.InterfaceC1220a
            public final Object invoke() {
                DexKitBridge dexKitBridge2;
                switch (i12) {
                    case 0:
                        C3351d0 c3351d0 = this.f10764h;
                        Context context2 = c3351d0.f10781a;
                        ClassLoader classLoader2 = c3351d0.f10783c;
                        if (classLoader2 != null) {
                            return new C3372x(context2, classLoader2, c3351d0.f10784d, new C3364p(1, c3351d0, AbstractC0921a.m2246i(C3351d0.class), "log", "log(Ljava/lang/String;)V", 0, 0, 11));
                        }
                        return null;
                    case 1:
                        C3351d0 c3351d02 = this.f10764h;
                        Context context3 = c3351d02.f10781a;
                        ClassLoader classLoader3 = c3351d02.f10783c;
                        if (classLoader3 != null) {
                            return new C3353e0(context3, classLoader3, c3351d02.f10784d, new C3364p(1, c3351d02, AbstractC0921a.m2246i(C3351d0.class), "log", "log(Ljava/lang/String;)V", 0, 0, 12));
                        }
                        return null;
                    case 2:
                        C3351d0 c3351d03 = this.f10764h;
                        Context context4 = c3351d03.f10781a;
                        ClassLoader classLoader4 = c3351d03.f10783c;
                        if (classLoader4 == null || (dexKitBridge2 = c3351d03.f10784d) == null) {
                            return null;
                        }
                        return new C3356h(context4, classLoader4, dexKitBridge2, new C3364p(1, c3351d03, AbstractC0921a.m2246i(C3351d0.class), "log", "log(Ljava/lang/String;)V", 0, 0, 10));
                    default:
                        C3351d0 c3351d04 = this.f10764h;
                        C3742g c3742g2 = c3351d04.f10788h;
                        if (c3742g2 != null) {
                            return new C3363o(c3742g2, new C0154t(c3351d04, 19));
                        }
                        return null;
                }
            }
        });
        this.f10794n = new ConcurrentHashMap();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static Object m7067a(String str, Method method) throws NoSuchMethodException {
        Class cls;
        Class<?>[] parameterTypes = method.getParameterTypes();
        parameterTypes.getClass();
        Class cls2 = (Class) AbstractC4165l.m8366C0(2, parameterTypes);
        Object obj = null;
        if (cls2 != null) {
            if (cls2.equals(String.class)) {
                return str;
            }
            Object objNewInstance = KavaReflector.newInstance(KavaReflector.findConstructor(cls2, new Class[0]), new Object[0]);
            if (objNewInstance != null) {
                List<Method> listDeclaredMethods = KavaReflector.declaredMethods(cls2);
                Iterator<T> it = listDeclaredMethods.iterator();
                Object obj2 = null;
                boolean z9 = false;
                while (true) {
                    boolean zHasNext = it.hasNext();
                    cls = Void.TYPE;
                    if (!zHasNext) {
                        if (!z9) {
                            break;
                        }
                    } else {
                        Object next = it.next();
                        Method method2 = (Method) next;
                        if (!Modifier.isStatic(method2.getModifiers()) && AbstractC1416l.m3825a(method2.getReturnType(), cls) && Arrays.equals(method2.getParameterTypes(), new Class[]{String.class})) {
                            if (z9) {
                                break;
                            }
                            obj2 = next;
                            z9 = true;
                        }
                    }
                }
                obj2 = null;
                Method method3 = (Method) obj2;
                if (method3 != null) {
                    KavaReflector.invokeOrThrow(method3, objNewInstance, str);
                    Iterator<T> it2 = listDeclaredMethods.iterator();
                    Object obj3 = null;
                    boolean z10 = false;
                    while (true) {
                        if (it2.hasNext()) {
                            Object next2 = it2.next();
                            Method method4 = (Method) next2;
                            if (!Modifier.isStatic(method4.getModifiers()) && AbstractC1416l.m3825a(method4.getReturnType(), cls) && Arrays.equals(method4.getParameterTypes(), new Class[]{Integer.TYPE})) {
                                if (z10) {
                                    break;
                                }
                                obj3 = next2;
                                z10 = true;
                            }
                        } else if (z10) {
                            obj = obj3;
                        }
                    }
                    Method method5 = (Method) obj;
                    if (method5 != null) {
                        KavaReflector.invokeOrThrow(method5, objNewInstance, 0);
                    }
                    return objNewInstance;
                }
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public static String m7068d(C3370v c3370v, int i9) {
        int i10 = c3370v.f10881c;
        ArrayList arrayList = c3370v.f10882d;
        return i10 != 1 ? i10 != 2 ? (i10 == 5 || i10 == 15) ? WeChatSnsPost.TYPE_VIDEO : i10 != 54 ? (i9 == 2 && arrayList.isEmpty()) ? WeChatSnsPost.TYPE_TEXT : (!arrayList.isEmpty() || AbstractC3149m.m6721t0(c3370v.f10880b)) ? WeChatSnsPost.TYPE_UNKNOWN : WeChatSnsPost.TYPE_CARD : WeChatSnsPost.TYPE_LIVE_PHOTO : WeChatSnsPost.TYPE_TEXT : WeChatSnsPost.TYPE_IMAGE;
    }

    /* JADX DEBUG: Another duplicated slice has different insns count: {[]}, finally: {[THROW, INVOKE, MOVE_EXCEPTION, THROW, MOVE_EXCEPTION] complete} */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    /* JADX INFO: renamed from: f */
    public static String m7069f(String str) {
        Object c3959f;
        int i9;
        Object obj = HttpUrl.FRAGMENT_ENCODE_SET;
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            FileInputStream fileInputStream = new FileInputStream(new File(str));
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
                    sb2.append((CharSequence) String.format("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(b10)}, 1)));
                }
                sb2.append((CharSequence) HttpUrl.FRAGMENT_ENCODE_SET);
                c3959f = sb2.toString();
            } finally {
            }
        } catch (Throwable th2) {
            c3959f = new C3959f(th2);
        }
        if (!(c3959f instanceof C3959f)) {
            obj = c3959f;
        }
        return (String) obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public static void m7070j(Object obj, String str, Method method) {
        if (method == null) {
            return;
        }
        KavaReflector.invoke(method, obj, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: m */
    public static WeChatSnsMedia m7071m(C3367s c3367s) {
        String str = c3367s.f10865a;
        int i9 = c3367s.f10866b;
        String str2 = c3367s.f10867c;
        String str3 = c3367s.f10868d;
        C3367s c3367s2 = c3367s.f10870f;
        return new WeChatSnsMedia(str, i9, str2, str3, c3367s2 != null ? m7071m(c3367s2) : null);
    }

    /* JADX DEBUG: Another duplicated slice has different insns count: {[]}, finally: {[INVOKE] complete} */
    /* JADX DEBUG: Another duplicated slice has different insns count: {[]}, finally: {[MOVE_EXCEPTION, INVOKE, CONSTRUCTOR, INVOKE, INVOKE, INVOKE, MOVE_EXCEPTION] complete} */
    /* JADX DEBUG: Another duplicated slice has different insns count: {[]}, finally: {[THROW, INVOKE, MOVE_EXCEPTION, THROW, MOVE_EXCEPTION] complete} */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    /* JADX INFO: renamed from: b */
    public final String m7072b(String str) {
        Object c3959f;
        File file = new File(this.f10781a.getCacheDir(), "Hchat_sns_thumb");
        String absolutePath = null;
        if (file.exists() || file.mkdirs()) {
            try {
                MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                byte[] bytes = str.getBytes(AbstractC3137a.f10177a);
                bytes.getClass();
                byte[] bArrDigest = messageDigest.digest(bytes);
                bArrDigest.getClass();
                StringBuilder sb2 = new StringBuilder();
                sb2.append((CharSequence) HttpUrl.FRAGMENT_ENCODE_SET);
                int i9 = 0;
                for (byte b10 : bArrDigest) {
                    i9++;
                    if (i9 > 1) {
                        sb2.append((CharSequence) HttpUrl.FRAGMENT_ENCODE_SET);
                    }
                    sb2.append((CharSequence) String.format("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(b10)}, 1)));
                }
                sb2.append((CharSequence) HttpUrl.FRAGMENT_ENCODE_SET);
                c3959f = sb2.toString();
            } catch (Throwable th2) {
                c3959f = new C3959f(th2);
            }
            Object objValueOf = String.valueOf(str.hashCode());
            if (c3959f instanceof C3959f) {
                c3959f = objValueOf;
            }
            File file2 = new File(file, AbstractC0255e.m1020i((String) c3959f, ".jpg"));
            if (file2.isFile() && file2.length() > 0) {
                return file2.getAbsolutePath();
            }
            MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
            try {
                mediaMetadataRetriever.setDataSource(str);
                Bitmap frameAtTime = mediaMetadataRetriever.getFrameAtTime();
                if (frameAtTime != null) {
                    FileOutputStream fileOutputStream = new FileOutputStream(file2);
                    try {
                        frameAtTime.compress(Bitmap.CompressFormat.JPEG, 85, fileOutputStream);
                        fileOutputStream.close();
                        frameAtTime.recycle();
                        if (file2.isFile() && file2.length() > 0) {
                            absolutePath = file2.getAbsolutePath();
                        }
                    } finally {
                    }
                }
            } finally {
                try {
                } finally {
                    try {
                        mediaMetadataRetriever.release();
                    } catch (Throwable unused) {
                    }
                }
            }
            try {
                mediaMetadataRetriever.release();
            } catch (Throwable unused2) {
            }
            return absolutePath;
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final C3354f m7073c(String str) {
        if (str == null) {
            str = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        String string = AbstractC3149m.m6703R0(str).toString();
        if (string.length() == 0) {
            return new C3354f(null, false);
        }
        C3356h c3356hM7075g = m7075g();
        return c3356hM7075g != null ? c3356hM7075g.m7102g(string) : new C3354f(null, false);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public final boolean m7074e(Object obj, String str) {
        Object c3959f;
        Method methodM7152g;
        Method methodM7151f;
        if (obj != null && obj.getClass().getName().equals("com.tencent.mm.plugin.sns.storage.SnsInfo")) {
            String string = AbstractC3149m.m6703R0(str).toString();
            if (string.length() != 0) {
                try {
                    Object objInvokeMethod = KavaReflector.invokeMethod(obj, "isExtFlag", new Object[0]);
                    Boolean bool = objInvokeMethod instanceof Boolean ? (Boolean) objInvokeMethod : null;
                    Boolean bool2 = Boolean.FALSE;
                    if (AbstractC1416l.m3825a(bool, bool2)) {
                        C3372x c3372xM7076h = m7076h();
                        if (c3372xM7076h == null || (methodM7152g = c3372xM7076h.m7152g()) == null) {
                            throw new IllegalStateException("陌生人评论方法未就绪");
                        }
                        Object objM7067a = m7067a(string, methodM7152g);
                        if (objM7067a == null) {
                            throw new IllegalStateException("评论正文参数创建失败");
                        }
                        KavaReflector.invokeOrThrow(methodM7152g, null, obj, 2, objM7067a, 1);
                    } else {
                        C3372x c3372xM7076h2 = m7076h();
                        if (c3372xM7076h2 == null || (methodM7151f = c3372xM7076h2.m7151f()) == null) {
                            throw new IllegalStateException("原生评论方法未就绪");
                        }
                        KavaReflector.invokeOrThrow(methodM7151f, null, obj, 2, string, 0L, HttpUrl.FRAGMENT_ENCODE_SET, bool2, 1);
                    }
                    c3959f = Boolean.TRUE;
                } catch (Throwable th2) {
                    c3959f = new C3959f(th2);
                }
                Throwable thM8182b = C3960g.m8182b(c3959f);
                if (thM8182b != null) {
                    m7079l("朋友圈评论异常: " + thM8182b.getMessage());
                }
                Boolean bool3 = Boolean.FALSE;
                if (c3959f instanceof C3959f) {
                    c3959f = bool3;
                }
                return ((Boolean) c3959f).booleanValue();
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, sf.c] */
    /* JADX INFO: renamed from: g */
    public final C3356h m7075g() {
        return (C3356h) this.f10791k.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, sf.c] */
    /* JADX INFO: renamed from: h */
    public final C3372x m7076h() {
        return (C3372x) this.f10789i.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0076 A[Catch: all -> 0x0022, TryCatch #0 {, blocks: (B:6:0x000e, B:8:0x0014, B:17:0x0025, B:19:0x0039, B:35:0x0070, B:37:0x0076, B:38:0x0097, B:41:0x009e, B:34:0x006a, B:24:0x0043, B:26:0x0049, B:27:0x0050, B:31:0x005a), top: B:52:0x000e, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x009d  */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, sf.c] */
    /* JADX INFO: renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m7077i() {
        Method methodM7094b;
        boolean zBooleanValue;
        Object c3959f;
        Throwable thM8182b;
        Method methodAccessible;
        C3353e0 c3353e0 = (C3353e0) this.f10790j.getValue();
        if (c3353e0 == null) {
            return false;
        }
        synchronized (c3353e0) {
            Method method = c3353e0.f10804h;
            if (method != null) {
                if (!C3353e0.m7093a(method)) {
                    method = null;
                }
                if (method != null) {
                    zBooleanValue = true;
                }
            }
            String strM2091g = C0828b.m2091g(c3353e0.f10797a, c3353e0.f10798b);
            Method methodM2087c = C0828b.m2087c(c3353e0.f10801e, strM2091g, c3353e0.f10798b, "sns_info_replace_by_id_v2");
            if (methodM2087c != null) {
                methodM7094b = C3353e0.m7093a(methodM2087c) ? methodM2087c : null;
                if (methodM7094b != null) {
                }
                try {
                    C3744i c3744i = C3744i.f12154b;
                    methodAccessible = KavaReflector.accessible(methodM7094b);
                    if (methodAccessible != null) {
                        methodAccessible = methodM7094b;
                    }
                    c3744i.m7763b(methodAccessible, new C0219e(c3353e0, 21));
                    c3353e0.f10804h = methodM7094b;
                    c3959f = Boolean.TRUE;
                } catch (Throwable th2) {
                    c3959f = new C3959f(th2);
                }
                thM8182b = C3960g.m8182b(c3959f);
                if (thM8182b != null) {
                    c3353e0.f10800d.invoke("朋友圈入库观察Hook失败: " + methodM7094b.toGenericString() + " " + thM8182b.getMessage());
                }
                Boolean bool = Boolean.FALSE;
                if (c3959f instanceof C3959f) {
                    c3959f = bool;
                }
                zBooleanValue = ((Boolean) c3959f).booleanValue();
            }
            methodM7094b = c3353e0.m7094b();
            if (methodM7094b != null) {
                C0828b.m2092h(c3353e0.f10801e, strM2091g, "sns_info_replace_by_id_v2", methodM7094b);
                C3744i c3744i2 = C3744i.f12154b;
                methodAccessible = KavaReflector.accessible(methodM7094b);
                if (methodAccessible != null) {
                }
                c3744i2.m7763b(methodAccessible, new C0219e(c3353e0, 21));
                c3353e0.f10804h = methodM7094b;
                c3959f = Boolean.TRUE;
                thM8182b = C3960g.m8182b(c3959f);
                if (thM8182b != null) {
                }
                Boolean bool2 = Boolean.FALSE;
                if (c3959f instanceof C3959f) {
                }
                zBooleanValue = ((Boolean) c3959f).booleanValue();
            } else {
                zBooleanValue = false;
            }
        }
        return zBooleanValue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k */
    public final boolean m7078k(Object obj) {
        Method methodM7152g;
        Object c3959f;
        if (obj != null && obj.getClass().getName().equals("com.tencent.mm.plugin.sns.storage.SnsInfo")) {
            C3372x c3372xM7076h = m7076h();
            if (c3372xM7076h != null && (methodM7152g = c3372xM7076h.m7152g()) != null) {
                try {
                    Object objInvokeOrThrow = KavaReflector.invokeOrThrow(methodM7152g, null, obj, 1, null, 1);
                    Boolean bool = objInvokeOrThrow instanceof Boolean ? (Boolean) objInvokeOrThrow : null;
                    c3959f = Boolean.valueOf(bool != null ? bool.booleanValue() : true);
                } catch (Throwable th2) {
                    c3959f = new C3959f(th2);
                }
                Throwable thM8182b = C3960g.m8182b(c3959f);
                if (thM8182b != null) {
                    m7079l("朋友圈点赞异常: " + thM8182b.getMessage());
                }
                Boolean bool2 = Boolean.FALSE;
                if (c3959f instanceof C3959f) {
                    c3959f = bool2;
                }
                return ((Boolean) c3959f).booleanValue();
            }
            m7079l("朋友圈点赞失败: 原生方法未就绪");
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l */
    public final void m7079l(String str) {
        C2005i.m4939f("[WeChatSnsApi] " + str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, sf.c] */
    /* JADX INFO: renamed from: n */
    public final void m7080n(C1634c c1634c) {
        C3353e0 c3353e0 = (C3353e0) this.f10790j.getValue();
        if (c3353e0 != null) {
            c3353e0.f10802f.addIfAbsent(c1634c);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0079 A[PHI: r10
  0x0079: PHI (r10v22 java.lang.Long) = (r10v7 java.lang.Long), (r10v13 java.lang.Long) binds: [B:30:0x0077, B:40:0x009b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, sf.c] */
    /* JADX INFO: renamed from: o */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final WeChatSnsPost m7081o(C3355g c3355g) {
        C3363o c3363o;
        C3370v c3370vM7139u;
        Object obj;
        long jLongValue;
        String asString;
        long j3;
        long jLongValue2;
        int iIntValue;
        Object obj2 = c3355g.f10807a;
        ContentValues contentValues = c3355g.f10808b;
        boolean z9 = false;
        if (!AbstractC1416l.m3825a(KavaReflector.invokeMethod(obj2, "isAd", new Object[0]), Boolean.TRUE) && (c3363o = (C3363o) this.f10792l.getValue()) != null && (c3370vM7139u = c3363o.m7139u(obj2)) != null && ((obj = contentValues.get("snsId")) != null || (obj = contentValues.get("field_snsId")) != null)) {
            if (obj instanceof Number) {
                jLongValue = ((Number) obj).longValue();
            } else {
                Long lM6743g0 = AbstractC3156t.m6743g0(obj.toString());
                if (lM6743g0 != null) {
                    jLongValue = lM6743g0.longValue();
                }
            }
            if (jLongValue != 0 && ((asString = contentValues.getAsString("userName")) != null || (asString = contentValues.getAsString("field_userName")) != null)) {
                String str = asString;
                Long asLong = contentValues.getAsLong("hchatLocalId");
                if (asLong != null) {
                    jLongValue2 = asLong.longValue();
                    j3 = jLongValue2;
                } else {
                    Object objInvokeMethod = KavaReflector.invokeMethod(obj2, "getLocalid", new Object[0]);
                    Number number = objInvokeMethod instanceof Number ? (Number) objInvokeMethod : null;
                    asLong = number != null ? Long.valueOf(number.longValue()) : null;
                    if (asLong == null) {
                        Object field = KavaReflector.readField(obj2, "localid");
                        Number number2 = field instanceof Number ? (Number) field : null;
                        Long lValueOf = number2 != null ? Long.valueOf(number2.longValue()) : null;
                        if (lValueOf != null) {
                            jLongValue2 = lValueOf.longValue();
                        } else {
                            j3 = 0;
                        }
                    }
                    j3 = jLongValue2;
                }
                Long asLong2 = contentValues.getAsLong("createTime");
                long jLongValue3 = (asLong2 == null && (asLong2 = contentValues.getAsLong("field_createTime")) == null) ? 0L : asLong2.longValue();
                Integer asInteger = contentValues.getAsInteger("type");
                if (asInteger != null) {
                    iIntValue = asInteger.intValue();
                } else {
                    Integer asInteger2 = contentValues.getAsInteger("field_type");
                    iIntValue = asInteger2 != null ? asInteger2.intValue() : -1;
                }
                String strM3652c = this.f10786f.m3652c();
                String str2 = HttpUrl.FRAGMENT_ENCODE_SET;
                if (strM3652c == null) {
                    strM3652c = HttpUrl.FRAGMENT_ENCODE_SET;
                }
                String unsignedString = Long.toUnsignedString(jLongValue);
                unsignedString.getClass();
                String strM3729r = this.f10787g.m3729r(str);
                if (strM3729r != null) {
                    str2 = strM3729r;
                }
                String str3 = AbstractC3149m.m6721t0(str2) ? str : str2;
                int i9 = c3370vM7139u.f10881c;
                String strM7068d = m7068d(c3370vM7139u, iIntValue);
                String str4 = c3370vM7139u.f10880b;
                ArrayList arrayList = c3370vM7139u.f10882d;
                ArrayList arrayList2 = new ArrayList(AbstractC4167n.m8429e1(arrayList));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(m7071m((C3367s) it.next()));
                }
                if (!AbstractC3149m.m6721t0(strM3652c) && strM3652c.equals(str)) {
                    z9 = true;
                }
                return new WeChatSnsPost(unsignedString, j3, str, str3, jLongValue3, iIntValue, i9, strM7068d, str4, arrayList2, z9);
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: p */
    public final WeChatSnsPrepareResult m7082p(String str, AtomicBoolean atomicBoolean) {
        WeChatSnsPrepareResult weChatSnsPrepareResultM7083q;
        atomicBoolean.getClass();
        if (str == null) {
            str = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        String string = AbstractC3149m.m6703R0(str).toString();
        if (string.length() == 0) {
            WeChatSnsPrepareResult.Companion.getClass();
            return C2533h.m5951a(HttpUrl.FRAGMENT_ENCODE_SET, "朋友圈 ID 为空");
        }
        C3349c0 c3349c0 = (C3349c0) this.f10794n.compute(string, new C0898v(2, new C1954y(10)));
        if (c3349c0 == null) {
            WeChatSnsPrepareResult.Companion.getClass();
            return C2533h.m5951a(string, "朋友圈媒体准备锁创建失败");
        }
        try {
            synchronized (c3349c0.f10773a) {
                try {
                    if (atomicBoolean.get()) {
                        WeChatSnsPrepareResult.Companion.getClass();
                        weChatSnsPrepareResultM7083q = C2533h.m5951a(string, "已取消准备朋友圈媒体");
                    } else {
                        weChatSnsPrepareResultM7083q = m7083q(string, atomicBoolean);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            ConcurrentHashMap concurrentHashMap = this.f10794n;
            final C0154t c0154t = new C0154t(c3349c0, 18);
            final int i9 = 0;
            concurrentHashMap.computeIfPresent(string, new BiFunction() { // from class: p8.z
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0002. Please report as an issue. */
                @Override // java.util.function.BiFunction
                public final Object apply(Object obj, Object obj2) {
                    switch (i9) {
                    }
                    return (C3349c0) c0154t.invoke(obj, obj2);
                }
            });
            return weChatSnsPrepareResultM7083q;
        } catch (Throwable th3) {
            ConcurrentHashMap concurrentHashMap2 = this.f10794n;
            final C0154t c0154t2 = new C0154t(c3349c0, 18);
            final int i10 = 1;
            concurrentHashMap2.computeIfPresent(string, new BiFunction() { // from class: p8.z
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0002. Please report as an issue. */
                @Override // java.util.function.BiFunction
                public final Object apply(Object obj, Object obj2) {
                    switch (i10) {
                    }
                    return (C3349c0) c0154t2.invoke(obj, obj2);
                }
            });
            throw th3;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object, sf.c] */
    /* JADX INFO: renamed from: q */
    public final WeChatSnsPrepareResult m7083q(String str, AtomicBoolean atomicBoolean) {
        int iIntValue;
        Object c3959f;
        C3356h c3356hM7075g = m7075g();
        if (c3356hM7075g != null) {
            str.getClass();
            Object obj = c3356hM7075g.m7102g(str).f10806b;
            C3355g c3355gM7100j = obj != null ? C3356h.m7100j(obj, null) : null;
            if (c3355gM7100j != null) {
                ContentValues contentValues = c3355gM7100j.f10808b;
                Object obj2 = c3355gM7100j.f10807a;
                if (AbstractC1416l.m3825a(KavaReflector.invokeMethod(obj2, "isAd", new Object[0]), Boolean.TRUE)) {
                    WeChatSnsPrepareResult.Companion.getClass();
                    return C2533h.m5951a(str, "不支持准备广告朋友圈");
                }
                C3363o c3363o = (C3363o) this.f10792l.getValue();
                if (c3363o == null) {
                    WeChatSnsPrepareResult.Companion.getClass();
                    return C2533h.m5951a(str, "朋友圈媒体解析器未就绪");
                }
                C3370v c3370vM7139u = c3363o.m7139u(obj2);
                if (c3370vM7139u == null) {
                    WeChatSnsPrepareResult.Companion.getClass();
                    return C2533h.m5951a(str, "朋友圈内容解析失败");
                }
                ArrayList arrayList = c3370vM7139u.f10882d;
                Integer asInteger = contentValues.getAsInteger("type");
                if (asInteger != null) {
                    iIntValue = asInteger.intValue();
                } else {
                    Integer asInteger2 = contentValues.getAsInteger("field_type");
                    iIntValue = asInteger2 != null ? asInteger2.intValue() : -1;
                }
                String strM7068d = m7068d(c3370vM7139u, iIntValue);
                if (strM7068d.equals(WeChatSnsPost.TYPE_CARD) || strM7068d.equals(WeChatSnsPost.TYPE_UNKNOWN)) {
                    WeChatSnsPrepareResult.Companion.getClass();
                    return C2533h.m5951a(str, "暂不支持转发该朋友圈类型");
                }
                if (strM7068d.equals(WeChatSnsPost.TYPE_LIVE_PHOTO) && (arrayList.size() != 1 || ((C3367s) AbstractC4166m.m8399H1(arrayList)).f10870f == null)) {
                    WeChatSnsPrepareResult.Companion.getClass();
                    return C2533h.m5951a(str, "当前只支持准备单张实况朋友圈");
                }
                try {
                    C3348c c3348cM7135q = c3363o.m7135q(c3370vM7139u, atomicBoolean);
                    String str2 = c3348cM7135q.f10771c;
                    List list = c3348cM7135q.f10770b;
                    ArrayList<C3350d> arrayList2 = new ArrayList();
                    for (Object obj3 : list) {
                        if (((C3350d) obj3).m7066a()) {
                            arrayList2.add(obj3);
                        }
                    }
                    ArrayList arrayList3 = new ArrayList(AbstractC4167n.m8429e1(arrayList2));
                    for (C3350d c3350d : arrayList2) {
                        arrayList3.add(new WeChatSnsLivePhoto(c3350d.f10775a, c3350d.f10776b, c3350d.f10777c, 0L));
                    }
                    if (strM7068d.equals(WeChatSnsPost.TYPE_IMAGE) && c3348cM7135q.m7065b().isEmpty()) {
                        throw new IllegalStateException("未找到可用的朋友圈图片");
                    }
                    if (strM7068d.equals(WeChatSnsPost.TYPE_VIDEO) && AbstractC3149m.m6721t0(str2)) {
                        throw new IllegalStateException("未找到可用的朋友圈视频");
                    }
                    if (strM7068d.equals(WeChatSnsPost.TYPE_LIVE_PHOTO) && (list.size() != 1 || arrayList3.size() != 1)) {
                        throw new IllegalStateException("当前只支持准备单张实况朋友圈");
                    }
                    c3959f = new WeChatSnsPrepareResult(true, "准备完成", str, c3370vM7139u.f10880b, strM7068d, c3348cM7135q.m7065b(), str2, c3348cM7135q.f10772d, arrayList3);
                } catch (Throwable th2) {
                    c3959f = new C3959f(th2);
                }
                Object objM5951a = c3959f;
                Throwable thM8182b = C3960g.m8182b(objM5951a);
                if (thM8182b != null) {
                    m7079l("准备朋友圈媒体失败: snsId=" + str + " " + thM8182b.getMessage());
                }
                Throwable thM8182b2 = C3960g.m8182b(objM5951a);
                if (thM8182b2 != null) {
                    C2533h c2533h = WeChatSnsPrepareResult.Companion;
                    String message = thM8182b2.getMessage();
                    if (message == null) {
                        message = "准备朋友圈媒体失败";
                    }
                    c2533h.getClass();
                    objM5951a = C2533h.m5951a(str, message);
                }
                return (WeChatSnsPrepareResult) objM5951a;
            }
        }
        WeChatSnsPrepareResult.Companion.getClass();
        return C2533h.m5951a(str, "未找到本机缓存的朋友圈");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0111  */
    /* JADX INFO: renamed from: r */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m7084r(String str, String str2, String str3, List list, String str4) {
        boolean z9;
        Class cls;
        Class<?> clsLoadClass;
        String str5 = str3;
        String str6 = str4;
        Object c3959f = null;
        String string = str2 != null ? AbstractC3149m.m6703R0(str2).toString() : null;
        String str7 = HttpUrl.FRAGMENT_ENCODE_SET;
        if (string == null) {
            string = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        if (AbstractC3149m.m6721t0(string)) {
            string = null;
        }
        if (string != null && !AbstractC0921a.m2262y(string)) {
            m7079l("朋友圈视频不存在: ".concat(string));
            return false;
        }
        ArrayList<String> arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            String str8 = (String) next;
            z9 = !AbstractC3149m.m6721t0(str8) && AbstractC0921a.m2262y(str8);
            if (!z9 && !AbstractC3149m.m6721t0(str8)) {
                m7079l("朋友圈图片不存在: ".concat(str8));
            }
            if (z9) {
                arrayList.add(next);
            }
        }
        if (string != null && !arrayList.isEmpty()) {
            m7079l("朋友圈发布失败: 视频和图片不能同时上传");
            return false;
        }
        DexFinder dexFinder = this.f10782b;
        if (string != null || !arrayList.isEmpty()) {
            Class<?> cls2 = dexFinder.snsUploadPackHelperClass;
            if (cls2 == null) {
                m7079l("朋友圈发布失败: helper未就绪");
                return false;
            }
            Object objNewInstanceByArgs = KavaReflector.newInstanceByArgs(cls2, new Object[]{1, this.f10781a});
            if (objNewInstanceByArgs == null) {
                m7079l("朋友圈发布失败: 创建UploadPackHelper失败");
                return false;
            }
            try {
                m7070j(objNewInstanceByArgs, str == null ? HttpUrl.FRAGMENT_ENCODE_SET : str, dexFinder.snsSetContentMethod);
                if (!(str5 == null || AbstractC3149m.m6721t0(str5))) {
                    m7070j(objNewInstanceByArgs, str5, dexFinder.snsSetSdkIdMethod);
                }
                if (!(str6 == null || AbstractC3149m.m6721t0(str6))) {
                    m7070j(objNewInstanceByArgs, str6, dexFinder.snsSetSdkAppNameMethod);
                }
                for (String str9 : arrayList) {
                    Object objInvoke = KavaReflector.invoke(dexFinder.snsAddImageMethod, objNewInstanceByArgs, str9, HttpUrl.FRAGMENT_ENCODE_SET);
                    if (!AbstractC1416l.m3825a(objInvoke instanceof Boolean ? (Boolean) objInvoke : null, Boolean.TRUE)) {
                        m7079l("朋友圈图片添加失败: " + str9);
                        return false;
                    }
                }
                if (string != null) {
                    Method method = dexFinder.snsAddVideoMethod;
                    if (method == null) {
                        m7079l("朋友圈视频发布失败: 视频方法未就绪");
                        return false;
                    }
                    String strM7072b = m7072b(string);
                    if (strM7072b != null && !AbstractC3149m.m6721t0(strM7072b)) {
                        z9 = false;
                    }
                    if (z9) {
                        m7079l("朋友圈视频发布失败: 缩略图生成失败");
                        return false;
                    }
                    if (str != null) {
                        str7 = str;
                    }
                    Object objInvoke2 = KavaReflector.invoke(method, objNewInstanceByArgs, string, strM7072b, str7, m7069f(string));
                    if (!AbstractC1416l.m3825a(objInvoke2 instanceof Boolean ? (Boolean) objInvoke2 : null, Boolean.TRUE)) {
                        m7079l("朋友圈视频添加失败: " + string);
                        return false;
                    }
                }
                Object objInvoke3 = KavaReflector.invoke(dexFinder.snsCommitMethod, objNewInstanceByArgs, new Object[0]);
                Number number = objInvoke3 instanceof Number ? (Number) objInvoke3 : null;
                if ((number != null ? number.intValue() : 0) > 0) {
                    return m7086t();
                }
                m7079l("朋友圈发布失败: commit返回=" + (number != null ? number : "null"));
                return false;
            } catch (Throwable th2) {
                m7079l("朋友圈发布异常: " + th2.getMessage());
                return false;
            }
        }
        String str10 = str == null ? HttpUrl.FRAGMENT_ENCODE_SET : str;
        Object objInvoke4 = KavaReflector.invoke(dexFinder.snsUploadManagerGetterMethod, null, new Object[0]);
        if (objInvoke4 == null) {
            m7079l("朋友圈纯文字发布失败: manager为空");
            return false;
        }
        Method method2 = dexFinder.snsShareAppMsgMethod;
        if (method2 == null) {
            m7079l("朋友圈纯文字发布失败: shareAppMsg方法为空");
            return false;
        }
        try {
            Class<?>[] parameterTypes = method2.getParameterTypes();
            parameterTypes.getClass();
            cls = (Class) AbstractC4165l.m8391z0(parameterTypes);
        } catch (Throwable th3) {
            c3959f = new C3959f(th3);
        }
        if (cls == null || (clsLoadClass = KavaReflector.loadClass("com.tencent.mm.opensdk.modelmsg.WXTextObject", cls.getClassLoader())) == null) {
            c3959f = null;
        } else {
            Object objNewInstance = KavaReflector.newInstance(KavaReflector.findConstructor(clsLoadClass, new Class[0]), new Object[0]);
            if (objNewInstance == null) {
                objNewInstance = KavaReflector.newInstanceByArgs(clsLoadClass, new Object[0]);
            }
            if (objNewInstance != null) {
                Field fieldFindFieldRecursive = KavaReflector.findFieldRecursive(objNewInstance.getClass(), WeChatSnsPost.TYPE_TEXT);
                if (fieldFindFieldRecursive != null) {
                    KavaReflector.writeField(fieldFindFieldRecursive, objNewInstance, str10);
                }
                c3959f = KavaReflector.newInstance(KavaReflector.findConstructor(cls, clsLoadClass), objNewInstance);
                if (c3959f == null && (c3959f = KavaReflector.newInstance(KavaReflector.findConstructor(cls, new Class[0]), new Object[0])) == null) {
                    c3959f = KavaReflector.newInstanceByArgs(cls, new Object[0]);
                }
                if (c3959f != null) {
                    Field fieldFindFieldRecursive2 = KavaReflector.findFieldRecursive(c3959f.getClass(), "mediaObject");
                    if (fieldFindFieldRecursive2 != null) {
                        KavaReflector.writeField(fieldFindFieldRecursive2, c3959f, objNewInstance);
                    }
                    Field fieldFindFieldRecursive3 = KavaReflector.findFieldRecursive(c3959f.getClass(), "description");
                    if (fieldFindFieldRecursive3 != null) {
                        KavaReflector.writeField(fieldFindFieldRecursive3, c3959f, str10);
                    }
                }
                c3959f = null;
            }
            if (c3959f instanceof C3959f) {
            }
        }
        if (c3959f == null) {
            m7079l("朋友圈纯文字发布失败: WXTextObject创建失败");
            return false;
        }
        if (str5 == null) {
            str5 = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        if (str6 == null) {
            str6 = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        try {
            Object objInvoke5 = KavaReflector.invoke(method2, objInvoke4, c3959f, str10, str5, str6);
            if (objInvoke5 == null) {
                m7079l("朋友圈纯文字发布失败: native helper为空");
                return false;
            }
            Object objInvoke6 = KavaReflector.invoke(dexFinder.snsCommitMethod, objInvoke5, new Object[0]);
            Number number2 = objInvoke6 instanceof Number ? (Number) objInvoke6 : null;
            if ((number2 != null ? number2.intValue() : 0) > 0) {
                return m7086t();
            }
            m7079l("朋友圈纯文字发布失败: commit返回=" + (number2 != null ? number2 : "null"));
            return false;
        } catch (Throwable th4) {
            m7079l("朋友圈纯文字发布异常: " + th4.getMessage());
            return false;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: s */
    public final boolean m7085s() {
        Constructor constructorM7153h;
        Object c3959f;
        C3372x c3372xM7076h = m7076h();
        boolean z9 = false;
        if (c3372xM7076h == null || (constructorM7153h = c3372xM7076h.m7153h()) == null) {
            m7079l("朋友圈刷新失败: 原生请求未就绪");
            return false;
        }
        try {
            Object objNewInstance = KavaReflector.newInstance(constructorM7153h, 0L, 0L, 0);
            if (objNewInstance != null && this.f10785e.f9079a.m6216j(objNewInstance)) {
                z9 = true;
            }
            c3959f = Boolean.valueOf(z9);
        } catch (Throwable th2) {
            c3959f = new C3959f(th2);
        }
        Throwable thM8182b = C3960g.m8182b(c3959f);
        if (thM8182b != null) {
            m7079l("朋友圈刷新异常: " + thM8182b.getMessage());
        }
        Boolean bool = Boolean.FALSE;
        if (c3959f instanceof C3959f) {
            c3959f = bool;
        }
        return ((Boolean) c3959f).booleanValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: t */
    public final boolean m7086t() {
        DexFinder dexFinder = this.f10782b;
        Object objInvoke = KavaReflector.invoke(dexFinder.snsUploadManagerGetterMethod, null, new Object[0]);
        if (objInvoke == null) {
            m7079l("朋友圈上传触发失败: manager为空");
            return false;
        }
        Method method = dexFinder.snsUploadCheckMethod;
        if (method == null) {
            m7079l("朋友圈上传触发失败: checkPost方法为空");
            return false;
        }
        KavaReflector.invoke(method, objInvoke, new Object[0]);
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: u */
    public final boolean m7087u(String str, String str2, String str3) {
        return m7084r(str, null, str2, C4173t.f13710g, str3);
    }

    /* JADX DEBUG: Another duplicated slice has different insns count: {[]}, finally: {[THROW, INVOKE, MOVE_EXCEPTION, THROW, MOVE_EXCEPTION] complete} */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:144:0x02be */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:166:0x02e2 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:371:0x0063 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    /* JADX DEBUG: Type inference failed for r5v23. Raw type applied. Possible types: java.util.Iterator<E>, java.lang.Object, java.util.Iterator */
    /* JADX WARN: Code restructure failed: missing block: B:264:0x04ca, code lost:
    
        p062e8.C0828b.m2092h(r9, r11, "set_upload_list_v1", r0);
        r9.edit().putString("element_class_v1", r8.getName()).apply();
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:176:0x02f0  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0304  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x0511  */
    /* JADX WARN: Removed duplicated region for block: B:332:0x0697 A[RETURN] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v25 */
    /* JADX WARN: Type inference failed for: r6v26 */
    /* JADX WARN: Type inference failed for: r6v27 */
    /* JADX WARN: Type inference failed for: r6v28 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v35 */
    /* JADX WARN: Type inference failed for: r6v36 */
    /* JADX WARN: Type inference failed for: r6v37 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX INFO: renamed from: v */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m7088v(long j3, String str, String str2, String str3, String str4, String str5) throws Throwable {
        int i9;
        int i10;
        long j4;
        C3352e c3352e;
        C3346b c3346b;
        Throwable th2;
        File file;
        int i11;
        int i12;
        long j5;
        long j10;
        ?? r62;
        File file2;
        File file3;
        File file4;
        Object c3959f;
        String str6;
        Integer num;
        Context context;
        long j11;
        String str7;
        Object c3959f2;
        Object c3959f3;
        Object objNewInstance;
        long jLongValue;
        Long lM6743g0;
        String string = AbstractC3149m.m6703R0(str2 == null ? HttpUrl.FRAGMENT_ENCODE_SET : str2).toString();
        String string2 = AbstractC3149m.m6703R0(str3 == null ? HttpUrl.FRAGMENT_ENCODE_SET : str3).toString();
        ?? r63 = 6;
        i = 6;
        int i13 = 6;
        if (AbstractC3149m.m6721t0(string2)) {
            Context context2 = this.f10781a;
            File file5 = new File(string);
            if (file5.isFile()) {
                C3346b c3346b2 = C3346b.f10765a;
                File cacheDir = context2.getCacheDir();
                cacheDir.getClass();
                synchronized (c3346b2) {
                    try {
                        try {
                            if (!file5.isFile() || file5.length() < 16) {
                                i9 = 6;
                                i10 = 2;
                                j4 = 0;
                            } else {
                                RandomAccessFile randomAccessFile = new RandomAccessFile(file5, "r");
                                try {
                                    LinkedHashSet linkedHashSet = new LinkedHashSet();
                                    long length = file5.length();
                                    j4 = 0;
                                    byte[] bArr = new byte[(int) (length > 4194304 ? 4194304L : length)];
                                    RandomAccessFile randomAccessFile2 = new RandomAccessFile(file5, "r");
                                    try {
                                        randomAccessFile2.readFully(bArr);
                                        randomAccessFile2.close();
                                        Charset charset = C3346b.f10766b;
                                        charset.getClass();
                                        String str8 = new String(bArr, charset);
                                        Iterator it = C3346b.f10767c.iterator();
                                        while (it.hasNext()) {
                                            try {
                                                C0939i0 c0939i0 = new C0939i0(C3147k.m6681c((C3147k) it.next(), str8));
                                                while (c0939i0.hasNext()) {
                                                    String str9 = (String) AbstractC4166m.m8425w1(1, ((C3145i) ((InterfaceC3142f) c0939i0.next())).m6676a());
                                                    Long lM6743g02 = str9 != null ? AbstractC3156t.m6743g0(str9) : null;
                                                    if (lM6743g02 != null && lM6743g02.longValue() > 0) {
                                                        long length2 = file5.length() - lM6743g02.longValue();
                                                        if (length2 < 0) {
                                                            length2 = 0;
                                                        }
                                                        linkedHashSet.add(Long.valueOf(length2));
                                                    }
                                                }
                                            } catch (Throwable th3) {
                                                th2 = th3;
                                                r63 = c3346b2;
                                                try {
                                                    throw th2;
                                                } catch (Throwable th4) {
                                                    AbstractC2043a.m5035i(randomAccessFile, th2);
                                                    throw th4;
                                                }
                                            }
                                        }
                                        i10 = 2;
                                        C3344a c3344a = (C3344a) AbstractC3015m.m6411U(AbstractC3015m.m6414X(new C0795n(linkedHashSet, 6), new C2576b(randomAccessFile, 8, file5)));
                                        if (c3344a == null) {
                                            C3346b c3346b3 = C3346b.f10765a;
                                            long length3 = file5.length();
                                            if (length3 < 16) {
                                                i9 = i13;
                                                file = file5;
                                                c3344a = null;
                                            } else {
                                                int i14 = 1048576;
                                                try {
                                                    byte[] bArr2 = new byte[1048576];
                                                    long j12 = length3;
                                                    long j13 = 0;
                                                    loop6: while (j13 < j12) {
                                                        randomAccessFile.seek(j13);
                                                        file = file5;
                                                        i9 = i13;
                                                        int iMin = (int) Math.min(i14, j12 - j13);
                                                        randomAccessFile.readFully(bArr2, 0, iMin);
                                                        int i15 = iMin - 4;
                                                        int i16 = 4;
                                                        while (i16 < i15) {
                                                            if (bArr2[i16] == 102 && bArr2[i16 + 1] == 116 && bArr2[i16 + 2] == 121 && bArr2[i16 + 3] == 112) {
                                                                i11 = iMin;
                                                                i12 = i15;
                                                                long j14 = (((long) i16) + j13) - 4;
                                                                j5 = j13;
                                                                j10 = j12;
                                                                C3344a c3344aM7062d = C3346b.m7062d(randomAccessFile, j10, j14);
                                                                if (c3344aM7062d != null) {
                                                                    c3344a = c3344aM7062d;
                                                                    break loop6;
                                                                }
                                                            } else {
                                                                i11 = iMin;
                                                                i12 = i15;
                                                                j5 = j13;
                                                                j10 = j12;
                                                            }
                                                            i16++;
                                                            j12 = j10;
                                                            iMin = i11;
                                                            i15 = i12;
                                                            j13 = j5;
                                                        }
                                                        if (iMin < 1048576) {
                                                            break;
                                                        }
                                                        j13 += ((long) iMin) - 8;
                                                        i14 = 1048576;
                                                        file5 = file;
                                                        i13 = i9;
                                                    }
                                                    i9 = i13;
                                                    file = file5;
                                                    c3344a = null;
                                                } catch (Throwable th5) {
                                                    th = th5;
                                                    c3346b = c3346b2;
                                                    th2 = th;
                                                    r63 = c3346b;
                                                    throw th2;
                                                }
                                            }
                                            if (c3352e != null) {
                                                return false;
                                            }
                                            String str10 = str == null ? HttpUrl.FRAGMENT_ENCODE_SET : str;
                                            String str11 = c3352e.f10795a;
                                            String str12 = c3352e.f10796b;
                                            long j15 = j3 < j4 ? j4 : j3;
                                            Context context3 = this.f10781a;
                                            DexFinder dexFinder = this.f10782b;
                                            File file6 = new File(str11);
                                            File file7 = new File(str12);
                                            if (!file6.isFile()) {
                                                m7079l("朋友圈实况发布失败: 封面图片不存在 " + str11);
                                                return false;
                                            }
                                            if (!file7.isFile()) {
                                                m7079l("朋友圈实况发布失败: 实况视频不存在 ".concat(str12));
                                                return false;
                                            }
                                            MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
                                            try {
                                                mediaMetadataRetriever.setDataSource(str12);
                                                String strExtractMetadata = mediaMetadataRetriever.extractMetadata(9);
                                                if (strExtractMetadata == null || (lM6743g0 = AbstractC3156t.m6743g0(strExtractMetadata)) == null) {
                                                    file3 = file6;
                                                    file4 = file7;
                                                    jLongValue = j4;
                                                } else {
                                                    file3 = file6;
                                                    file4 = file7;
                                                    jLongValue = lM6743g0.longValue();
                                                }
                                                if (jLongValue <= j4) {
                                                    c3959f = null;
                                                } else {
                                                    try {
                                                        c3959f = new C3347b0(jLongValue);
                                                    } catch (Throwable th6) {
                                                        th = th6;
                                                        c3959f = new C3959f(th);
                                                    }
                                                }
                                            } catch (Throwable th7) {
                                                th = th7;
                                                file3 = file6;
                                                file4 = file7;
                                            }
                                            if (c3959f instanceof C3959f) {
                                                c3959f = null;
                                            }
                                            C3347b0 c3347b0 = (C3347b0) c3959f;
                                            try {
                                                mediaMetadataRetriever.release();
                                            } catch (Throwable unused) {
                                            }
                                            if (c3347b0 != null) {
                                                C3373y c3373yM5033g = this.f10793m;
                                                if (c3373yM5033g != null) {
                                                    str6 = str10;
                                                    str7 = str12;
                                                    j11 = j15;
                                                    num = 54;
                                                    context = context3;
                                                } else {
                                                    Context context4 = this.f10781a;
                                                    DexFinder dexFinder2 = this.f10782b;
                                                    DexKitBridge dexKitBridge = this.f10784d;
                                                    if (dexKitBridge != null) {
                                                        try {
                                                            dexFinder2.resolveSnsUploadApi();
                                                        } catch (Throwable unused2) {
                                                        }
                                                        ClassLoader classLoader = this.f10783c;
                                                        if (classLoader != null) {
                                                            Class<?> cls = dexFinder2.snsUploadPackHelperClass;
                                                            AbstractC1426v.m3834a(C3351d0.class).mo3818a().getClass();
                                                            str6 = str10;
                                                            if (cls == null) {
                                                                str7 = str12;
                                                                j11 = j15;
                                                                num = 54;
                                                                context = context3;
                                                                c3373yM5033g = null;
                                                            } else {
                                                                num = 54;
                                                                SharedPreferences sharedPreferencesM8640c = AbstractC4302b.m8640c(context4, "Hchat_sns_live_photo_upload_cache");
                                                                context = context3;
                                                                String strM2091g = C0828b.m2091g(context4, classLoader);
                                                                j11 = j15;
                                                                c3373yM5033g = AbstractC2043a.m5033g(cls, KavaReflector.loadClass(sharedPreferencesM8640c.getString("element_class_v1", HttpUrl.FRAGMENT_ENCODE_SET), classLoader), C0828b.m2087c(sharedPreferencesM8640c, strM2091g, classLoader, "set_upload_list_v1"));
                                                                if (c3373yM5033g != null) {
                                                                    str7 = str12;
                                                                } else {
                                                                    C0828b.m2085a(sharedPreferencesM8640c, strM2091g, "set_upload_list_v1");
                                                                    sharedPreferencesM8640c.edit().remove("element_class_v1").apply();
                                                                    try {
                                                                        C0570e c0570e = new C0570e();
                                                                        C1253k c1253k = new C1253k();
                                                                        str7 = str12;
                                                                        try {
                                                                            C1253k.m3367u0(c1253k, AbstractC0000a.m101y0("setUploadList", "livePhotoElement != null >> path:"));
                                                                            c0570e.f1764h = c1253k;
                                                                            Iterator it2 = dexKitBridge.findMethod(c0570e).iterator();
                                                                            it2.getClass();
                                                                            loop0: while (true) {
                                                                                if (!it2.hasNext()) {
                                                                                    c3959f2 = null;
                                                                                    break;
                                                                                }
                                                                                Object next = it2.next();
                                                                                next.getClass();
                                                                                C1730o c1730o = (C1730o) next;
                                                                                try {
                                                                                    c3959f3 = c1730o.m4348p().m6023b(classLoader);
                                                                                } catch (Throwable th8) {
                                                                                    c3959f3 = new C3959f(th8);
                                                                                }
                                                                                if (c3959f3 instanceof C3959f) {
                                                                                    c3959f3 = null;
                                                                                }
                                                                                Method method = (Method) c3959f3;
                                                                                if (method != null && AbstractC2043a.m5004J(cls, method)) {
                                                                                    List list = (List) c1730o.f5759s.getValue();
                                                                                    ArrayList arrayList = new ArrayList();
                                                                                    Iterator it3 = list.iterator();
                                                                                    while (it3.hasNext()) {
                                                                                        String str13 = ((C1732q) it3.next()).f5760a.m4347p().f8328g;
                                                                                        if (str13 != null) {
                                                                                            arrayList.add(str13);
                                                                                        }
                                                                                    }
                                                                                    Iterator it4 = AbstractC4166m.m8407P1(AbstractC4166m.m8411T1(arrayList)).iterator();
                                                                                    while (it4.hasNext()) {
                                                                                        Class<?> clsLoadClass = KavaReflector.loadClass((String) it4.next(), classLoader);
                                                                                        if (clsLoadClass != null && (c3959f2 = AbstractC2043a.m5033g(cls, clsLoadClass, method)) != null) {
                                                                                            break loop0;
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        } catch (Throwable th9) {
                                                                            th = th9;
                                                                            c3959f2 = new C3959f(th);
                                                                        }
                                                                    } catch (Throwable th10) {
                                                                        th = th10;
                                                                        str7 = str12;
                                                                    }
                                                                    Throwable thM8182b = C3960g.m8182b(c3959f2);
                                                                    if (thM8182b != null) {
                                                                        m7079l("朋友圈实况上传方法定位失败: " + thM8182b.getMessage());
                                                                    }
                                                                    if (c3959f2 instanceof C3959f) {
                                                                        c3959f2 = null;
                                                                    }
                                                                    c3373yM5033g = (C3373y) c3959f2;
                                                                }
                                                            }
                                                            if (c3373yM5033g != null) {
                                                                this.f10793m = c3373yM5033g;
                                                            }
                                                        } else {
                                                            str6 = str10;
                                                            str7 = str12;
                                                            j11 = j15;
                                                            num = 54;
                                                            context = context3;
                                                        }
                                                        c3373yM5033g = null;
                                                    }
                                                }
                                                if (c3373yM5033g != null) {
                                                    Class<?> cls2 = dexFinder.snsUploadPackHelperClass;
                                                    if (cls2 != null) {
                                                        String name = cls2.getName();
                                                        long length4 = file3.length();
                                                        long length5 = file4.length();
                                                        long j16 = c3347b0.f10768a;
                                                        String name2 = c3373yM5033g.f10895b.getDeclaringClass().getName();
                                                        StringBuilder sbM1027p = AbstractC0255e.m1027p("朋友圈实况发布入队: helper=", name, " image=", str11, "(");
                                                        sbM1027p.append(length4);
                                                        sbM1027p.append(") video=");
                                                        String str14 = str7;
                                                        sbM1027p.append(str14);
                                                        AbstractC2091b.m5172s(sbM1027p, "(", length5, ") durationMs=");
                                                        sbM1027p.append(j16);
                                                        long j17 = j11;
                                                        AbstractC2091b.m5172s(sbM1027p, " coverTimeMs=", j17, " element=");
                                                        sbM1027p.append(name2);
                                                        m7079l(sbM1027p.toString());
                                                        Integer num2 = num;
                                                        Object objNewInstanceByArgs = KavaReflector.newInstanceByArgs(cls2, new Object[]{num2, context});
                                                        if (objNewInstanceByArgs != null) {
                                                            try {
                                                                m7070j(objNewInstanceByArgs, str6, dexFinder.snsSetContentMethod);
                                                                if (str4 != null && !AbstractC3149m.m6721t0(str4)) {
                                                                    m7070j(objNewInstanceByArgs, str4, dexFinder.snsSetSdkIdMethod);
                                                                }
                                                                if (str5 != null && !AbstractC3149m.m6721t0(str5)) {
                                                                    m7070j(objNewInstanceByArgs, str5, dexFinder.snsSetSdkAppNameMethod);
                                                                }
                                                                Object objNewInstance2 = KavaReflector.newInstance(c3373yM5033g.f10895b, str11, Integer.valueOf(i10));
                                                                if (objNewInstance2 != null && (objNewInstance = KavaReflector.newInstance(c3373yM5033g.f10895b, str14, Integer.valueOf(i9))) != null) {
                                                                    if (KavaReflector.writeField(c3373yM5033g.f10896c, objNewInstance2, objNewInstance) && KavaReflector.writeField(c3373yM5033g.f10897d, objNewInstance, str11) && KavaReflector.writeField(c3373yM5033g.f10898e, objNewInstance, num2) && KavaReflector.writeField(c3373yM5033g.f10899f, objNewInstance, Long.valueOf(j17))) {
                                                                        ArrayList arrayList2 = new ArrayList(1);
                                                                        arrayList2.add(objNewInstance2);
                                                                        KavaReflector.invokeOrThrow(c3373yM5033g.f10894a, objNewInstanceByArgs, arrayList2);
                                                                        m7079l("朋友圈实况发布媒体入库完成: setUploadList=" + c3373yM5033g.f10894a);
                                                                        Object objInvoke = KavaReflector.invoke(dexFinder.snsCommitMethod, objNewInstanceByArgs, new Object[0]);
                                                                        Number number = objInvoke instanceof Number ? (Number) objInvoke : null;
                                                                        if ((number != null ? number.intValue() : 0) > 0) {
                                                                            boolean zM7086t = m7086t();
                                                                            m7079l("朋友圈实况发布提交完成: localId=" + number + " triggerUpload=" + zM7086t);
                                                                            return zM7086t;
                                                                        }
                                                                        m7079l("朋友圈实况发布失败: commit返回=" + (number != null ? number : "null"));
                                                                    } else {
                                                                        m7079l("朋友圈实况发布失败: 实况媒体字段写入失败");
                                                                    }
                                                                }
                                                            } catch (Throwable th11) {
                                                                m7079l("朋友圈实况发布异常: " + th11.getMessage());
                                                            }
                                                        } else {
                                                            m7079l("朋友圈实况发布失败: 创建UploadPackHelper失败");
                                                        }
                                                    }
                                                } else {
                                                    m7079l("朋友圈实况发布失败: 当前微信没有实况上传入口");
                                                }
                                            } else {
                                                m7079l("朋友圈实况发布失败: 实况视频无效");
                                            }
                                            return false;
                                        }
                                        i9 = 6;
                                        file = file5;
                                        randomAccessFile.close();
                                        if (c3344a != null) {
                                            File file8 = new File(cacheDir, "Hchat_sns_live_photo");
                                            if (file8.exists() || file8.mkdirs()) {
                                                File file9 = file;
                                                String strM7059a = C3346b.m7059a(file9, c3344a);
                                                File file10 = new File(file8, strM7059a + "_image." + (C3346b.m7061c(file9) ? "jpg" : C3346b.m7060b(file9)));
                                                StringBuilder sb2 = new StringBuilder();
                                                sb2.append(strM7059a);
                                                sb2.append("_video.mp4");
                                                File file11 = new File(file8, sb2.toString());
                                                boolean zM7061c = C3346b.m7061c(file9);
                                                long j18 = c3344a.f10761a;
                                                if (zM7061c) {
                                                    long j19 = j18 - ((long) 4194304);
                                                    if (j19 < 2) {
                                                        j19 = 2;
                                                    }
                                                    long j20 = j18 - j19;
                                                    r63 = c3346b2;
                                                    int i17 = (int) (j20 > 2147483647L ? 2147483647L : j20);
                                                    byte[] bArr3 = new byte[i17];
                                                    RandomAccessFile randomAccessFile3 = new RandomAccessFile(file9, "r");
                                                    try {
                                                        randomAccessFile3.seek(j19);
                                                        randomAccessFile3.readFully(bArr3);
                                                        randomAccessFile3.close();
                                                        int i18 = i17 - 2;
                                                        while (true) {
                                                            if (-1 < i18) {
                                                                byte[] bArr4 = bArr3;
                                                                if (bArr4[i18] == -1 && bArr4[i18 + 1] == -39) {
                                                                    j18 = j19 + ((long) i18) + 2;
                                                                    r62 = r63;
                                                                    break;
                                                                }
                                                                i18--;
                                                                bArr3 = bArr4;
                                                            } else {
                                                                r62 = r63;
                                                                break;
                                                            }
                                                        }
                                                    } finally {
                                                    }
                                                } else {
                                                    r62 = c3346b2;
                                                }
                                                long j21 = j18;
                                                if (j21 <= 0 || j21 > c3344a.f10761a) {
                                                } else {
                                                    if (C3346b.m7063e(file9, file10, 0L, j21)) {
                                                        long j22 = c3344a.f10761a;
                                                        file2 = file11;
                                                        if (C3346b.m7063e(file9, file2, j22, c3344a.f10762b - j22)) {
                                                            String absolutePath = file10.getAbsolutePath();
                                                            absolutePath.getClass();
                                                            String absolutePath2 = file2.getAbsolutePath();
                                                            absolutePath2.getClass();
                                                            C3352e c3352e2 = new C3352e(absolutePath, absolutePath2);
                                                            c3352e = c3352e2;
                                                            if (c3352e == null) {
                                                                m7079l("朋友圈实况发布失败: 图片内未找到有效实况视频 " + string);
                                                                c3352e = null;
                                                            }
                                                            if (c3352e != null) {
                                                            }
                                                        }
                                                    } else {
                                                        file2 = file11;
                                                    }
                                                    file10.delete();
                                                    file2.delete();
                                                }
                                            }
                                        }
                                    } catch (Throwable th12) {
                                        c3346b = c3346b2;
                                        try {
                                            throw th12;
                                        } catch (Throwable th13) {
                                            try {
                                                throw th13;
                                            } catch (Throwable th14) {
                                                th = th14;
                                                th2 = th;
                                                r63 = c3346b;
                                                throw th2;
                                            }
                                        }
                                    }
                                } catch (Throwable th15) {
                                    th = th15;
                                }
                            }
                        } catch (Throwable th16) {
                            th = th16;
                            r63 = c3346b2;
                            throw th;
                        }
                    } catch (Throwable th17) {
                        th = th17;
                        throw th;
                    }
                }
                c3352e = null;
                if (c3352e == null) {
                }
                if (c3352e != null) {
                }
            } else {
                m7079l("朋友圈实况发布失败: 实况图片不存在 " + string);
                i9 = 6;
                i10 = 2;
                c3352e = null;
            }
        } else {
            c3352e = new C3352e(string, string2);
            i9 = 6;
            i10 = 2;
        }
        j4 = 0;
        if (c3352e != null) {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: w */
    public final boolean m7089w(JSONObject jSONObject) {
        String str;
        long j3;
        if (jSONObject == null) {
            return m7088v(0L, HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET);
        }
        String strOptString = jSONObject.optString("livePhotoPath", jSONObject.optString("path", HttpUrl.FRAGMENT_ENCODE_SET));
        String strOptString2 = jSONObject.optString("content", HttpUrl.FRAGMENT_ENCODE_SET);
        String strOptString3 = jSONObject.optString("imagePath", jSONObject.optString("picPath", strOptString));
        String strOptString4 = jSONObject.optString("videoPath", jSONObject.optString("liveVideoPath", HttpUrl.FRAGMENT_ENCODE_SET));
        String strOptString5 = jSONObject.optString("sdkId", HttpUrl.FRAGMENT_ENCODE_SET);
        String strOptString6 = jSONObject.optString("sdkAppName", HttpUrl.FRAGMENT_ENCODE_SET);
        long jOptLong = jSONObject.optLong("coverTimeMs", jSONObject.optLong("coverTime", 0L));
        if (jOptLong < 0) {
            str = strOptString2;
            j3 = 0;
        } else {
            str = strOptString2;
            j3 = jOptLong;
        }
        return m7088v(j3, str, strOptString3, strOptString4, strOptString5, strOptString6);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: x */
    public final boolean m7090x(String str, List list, String str2, String str3) {
        String string;
        if (list == null) {
            list = C4173t.f13710g;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            String string2 = (next == null || (string = next.toString()) == null) ? null : AbstractC3149m.m6703R0(string).toString();
            if (string2 != null) {
                arrayList.add(string2);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (Boolean.valueOf(!AbstractC3149m.m6721t0((String) obj)).booleanValue()) {
                arrayList2.add(obj);
            }
        }
        return m7084r(str, null, str2, arrayList2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: y */
    public final boolean m7091y(String str, String str2, String str3, String str4) {
        String string = str2 != null ? AbstractC3149m.m6703R0(str2).toString() : null;
        if (string == null) {
            string = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        return m7084r(str, string, str3, C4173t.f13710g, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: z */
    public final boolean m7092z(JSONObject jSONObject) {
        if (jSONObject == null) {
            return m7091y(HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET);
        }
        return m7091y(jSONObject.optString("content", HttpUrl.FRAGMENT_ENCODE_SET), jSONObject.optString("videoPath", jSONObject.optString("path", HttpUrl.FRAGMENT_ENCODE_SET)), jSONObject.optString("sdkId", HttpUrl.FRAGMENT_ENCODE_SET), jSONObject.optString("sdkAppName", HttpUrl.FRAGMENT_ENCODE_SET));
    }
}
