package p000;

import android.app.Activity;
import android.content.ContentResolver;
import android.graphics.Bitmap;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.view.View;
import com.p001mr.elaris.HookEntry;
import com.p001mr.elaris.xposedcompat.XposedBridge;
import com.p001mr.elaris.xposedcompat.XposedHelpers;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: s */
/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0444s {

    /* JADX INFO: renamed from: a */
    public static final Object f807a = new Object();

    /* JADX INFO: renamed from: b */
    public static final WeakHashMap f808b = new WeakHashMap();

    /* JADX INFO: renamed from: c */
    public static volatile WeakReference f809c = new WeakReference(null);

    /* JADX INFO: renamed from: d */
    public static volatile WeakReference f810d = new WeakReference(null);

    /* JADX INFO: renamed from: e */
    public static volatile ClassLoader f811e;

    /* JADX INFO: renamed from: f */
    public static volatile boolean f812f;

    /* JADX INFO: renamed from: g */
    public static volatile boolean f813g;

    /* JADX INFO: renamed from: h */
    public static volatile boolean f814h;

    /* JADX INFO: renamed from: i */
    public static volatile long f815i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static void m872a(ClassLoader classLoader, Object obj, String str, String str2, long j, String str3) throws IllegalAccessException, NoSuchMethodException, InstantiationException, InvocationTargetException {
        Method method;
        Constructor<?> declaredConstructor = XposedHelpers.findClass("com.tencent.mobileqq.aio.event.AIOMsgSendEvent$FilterVideoSendEvent", classLoader).getDeclaredConstructor(String.class, String.class, Long.TYPE, String.class, String.class);
        declaredConstructor.setAccessible(true);
        Object objNewInstance = declaredConstructor.newInstance(str, str2, Long.valueOf(j), "", str3);
        Class<?> superclass = obj.getClass();
        loop0: while (true) {
            if (superclass == null) {
                method = null;
                break;
            }
            Method[] declaredMethods = superclass.getDeclaredMethods();
            int length = declaredMethods.length;
            for (int i = 0; i < length; i++) {
                method = declaredMethods[i];
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (!Modifier.isStatic(method.getModifiers()) && parameterTypes.length == 1 && method.getReturnType() == Void.TYPE && "com.tencent.mvi.base.route.MsgIntent".equals(parameterTypes[0].getName())) {
                    break loop0;
                }
            }
            superclass = superclass.getSuperclass();
        }
        if (method == null) {
            throw new NoSuchMethodException("filter video dispatch method");
        }
        method.setAccessible(true);
        method.invoke(obj, objNewInstance);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0015  */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m873b(Object obj, String str) {
        Object objInvoke;
        WeakReference weakReference;
        if (obj == null) {
            return;
        }
        if ("com.tencent.qqnt.aio.activity.AIODelegate".equals(obj.getClass().getName())) {
            try {
                Method method = obj.getClass().getMethod("y", null);
                method.setAccessible(true);
                objInvoke = method.invoke(obj, null);
                if (objInvoke == null) {
                }
            } catch (Throwable th) {
                AbstractC0198e7.m343a("album-video-bubble", "resolve-aio-delegate-route", th);
            }
        } else {
            objInvoke = null;
        }
        if (objInvoke != null) {
            f809c = new WeakReference(objInvoke);
            HookEntry.log("album video bubble route refreshed source=" + str + " mode=delegate-container");
            return;
        }
        Object objM1093l = AbstractC0497v4.m1093l(obj, "com.tencent.qqnt.aio.filtervideo.a", 3);
        if (objM1093l == null) {
            return;
        }
        synchronized (f807a) {
            weakReference = (WeakReference) f808b.get(objM1093l);
        }
        Object obj2 = weakReference != null ? weakReference.get() : null;
        if (obj2 == null) {
            return;
        }
        f809c = new WeakReference(obj2);
        HookEntry.log("album video bubble route refreshed source=" + str + " mode=filter-part-fallback");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static long m874c(ContentResolver contentResolver, Uri uri, File file) throws FileNotFoundException {
        int i = 0;
        while (i <= 2) {
            try {
                return m875d(contentResolver, uri, file);
            } catch (FileNotFoundException e) {
                if (i < 2) {
                    if (uri == null ? false : uri.toString().startsWith("content://media/picker/")) {
                        StringBuilder sb = new StringBuilder("album video bubble picker uri retry=");
                        i++;
                        sb.append(i);
                        HookEntry.log(sb.toString());
                        try {
                            Thread.sleep(120L);
                        } catch (InterruptedException unused) {
                            Thread.currentThread().interrupt();
                            throw e;
                        }
                    }
                }
                throw e;
            }
        }
        throw new FileNotFoundException("picker uri unavailable");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public static long m875d(ContentResolver contentResolver, Uri uri, File file) throws IOException {
        InputStream inputStreamOpenInputStream = contentResolver.openInputStream(uri);
        if (inputStreamOpenInputStream == null) {
            throw new FileNotFoundException("picker uri unavailable");
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                byte[] bArr = new byte[65536];
                long j = 0;
                while (true) {
                    int i = inputStreamOpenInputStream.read(bArr);
                    if (i < 0) {
                        fileOutputStream.flush();
                        fileOutputStream.close();
                        inputStreamOpenInputStream.close();
                        return j;
                    }
                    if (i != 0) {
                        j += (long) i;
                        if (j > 209715200) {
                            throw new IllegalArgumentException("视频超过 200 MB");
                        }
                        fileOutputStream.write(bArr, 0, i);
                    }
                }
            } finally {
            }
        } catch (Throwable th) {
            try {
                inputStreamOpenInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public static int m876e(ClassLoader classLoader) {
        try {
            Class<?> clsFindClassIfExists = XposedHelpers.findClassIfExists("com.tencent.qqnt.aio.activity.AIODelegate", classLoader);
            if (clsFindClassIfExists == null) {
                return 0;
            }
            Method declaredMethod = clsFindClassIfExists.getDeclaredMethod("show", null);
            declaredMethod.setAccessible(true);
            XposedBridge.hookMethod(declaredMethod, new C0321m(35));
            HookEntry.log("album video bubble route refresh hook installed class=".concat(clsFindClassIfExists.getName()));
            return 1;
        } catch (Throwable th) {
            AbstractC0198e7.m343a("album-video-bubble", "hook-aio-route", th);
            return 0;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public static int m877f(ClassLoader classLoader) {
        try {
            Class<?> clsFindClassIfExists = XposedHelpers.findClassIfExists("com.tencent.qqnt.aio.shortcutbar.PanelIconLinearLayout", classLoader);
            if (clsFindClassIfExists == null) {
                return 0;
            }
            Method declaredMethod = clsFindClassIfExists.getDeclaredMethod("onClick", View.class);
            declaredMethod.setAccessible(true);
            XposedBridge.hookMethod(declaredMethod, new C0337n(60));
            HookEntry.log("album video bubble entry hook installed class=" + clsFindClassIfExists.getName() + " method=onClick");
            return 1;
        } catch (Throwable th) {
            AbstractC0198e7.m343a("album-video-bubble", "hook-entry", th);
            return 0;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public static synchronized void m878g(ClassLoader classLoader) {
        int i;
        try {
        } catch (Throwable th) {
            AbstractC0198e7.m343a("album-video-bubble", "capture-route", th);
        } finally {
        }
        if (!f813g && !f812f && classLoader != null) {
            boolean z = true;
            f812f = true;
            f811e = classLoader;
            int i2 = 0;
            Class<?> clsFindClassIfExists = XposedHelpers.findClassIfExists("com.tencent.qqnt.aio.filtervideo.a", classLoader);
            if (clsFindClassIfExists == null || XposedBridge.hookAllConstructors(clsFindClassIfExists, new C0305l(12)).isEmpty()) {
                i = 0;
            } else {
                HookEntry.log("album video bubble AIO route capture installed class=".concat(clsFindClassIfExists.getName()));
                i = 1;
            }
            int iM876e = i + m876e(classLoader) + m877f(classLoader);
            if (AbstractC0174d.m337a(8220, new C0289k(i2)) >= 0) {
                iM876e++;
            }
            if (iM876e < 3) {
                z = false;
            }
            f813g = z;
            if (f813g) {
                HookEntry.logAlways("album video bubble hooks installed count=" + iM876e);
            } else {
                HookEntry.logAlways("album video bubble hooks incomplete count=" + iM876e);
            }
        }
    }

    /* JADX DEBUG: Another duplicated slice has different insns count: {[]}, finally: {[INVOKE, MOVE_EXCEPTION, INVOKE, MOVE_EXCEPTION] complete} */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public static C0428r m879h(File file, File file2) throws Throwable {
        Bitmap frameAtTime;
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        Bitmap bitmapCreateScaledBitmap = null;
        try {
            mediaMetadataRetriever.setDataSource(file.getAbsolutePath());
            String strExtractMetadata = mediaMetadataRetriever.extractMetadata(9);
            long j = strExtractMetadata == null ? 0L : Long.parseLong(strExtractMetadata);
            String strM597b2 = AbstractC0260i5.m597b2(file.length(), j);
            if (strM597b2.length() > 0) {
                throw new IllegalArgumentException(strM597b2);
            }
            frameAtTime = mediaMetadataRetriever.getFrameAtTime(Math.min(Math.max(j / 2, 0L), 1000L) * 1000, 2);
            try {
                if (frameAtTime == null) {
                    throw new IllegalArgumentException("无法生成视频封面");
                }
                int width = frameAtTime.getWidth();
                int height = frameAtTime.getHeight();
                int iMax = Math.max(width, height);
                if (iMax > 720) {
                    float f = 720.0f / iMax;
                    bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(frameAtTime, Math.max(1, Math.round(width * f)), Math.max(1, Math.round(height * f)), true);
                } else {
                    bitmapCreateScaledBitmap = frameAtTime;
                }
                FileOutputStream fileOutputStream = new FileOutputStream(file2);
                try {
                    if (!bitmapCreateScaledBitmap.compress(Bitmap.CompressFormat.JPEG, 88, fileOutputStream)) {
                        throw new IllegalArgumentException("无法保存视频封面");
                    }
                    fileOutputStream.flush();
                    fileOutputStream.close();
                    C0428r c0428r = new C0428r(j, file2);
                    try {
                        mediaMetadataRetriever.release();
                    } catch (Throwable unused) {
                    }
                    if (bitmapCreateScaledBitmap != frameAtTime) {
                        bitmapCreateScaledBitmap.recycle();
                    }
                    frameAtTime.recycle();
                    return c0428r;
                } finally {
                }
            } catch (Throwable th) {
                th = th;
                try {
                    mediaMetadataRetriever.release();
                } catch (Throwable unused2) {
                }
                if (bitmapCreateScaledBitmap != null && bitmapCreateScaledBitmap != frameAtTime) {
                    bitmapCreateScaledBitmap.recycle();
                }
                if (frameAtTime == null) {
                    throw th;
                }
                frameAtTime.recycle();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            frameAtTime = null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public static void m880i(Activity activity, String str) {
        if (activity == null) {
            activity = HookEntry.topActivity();
        }
        if (activity == null || str.length() == 0) {
            return;
        }
        activity.runOnUiThread(new RunnableC0412q(activity, str, 0));
    }
}
