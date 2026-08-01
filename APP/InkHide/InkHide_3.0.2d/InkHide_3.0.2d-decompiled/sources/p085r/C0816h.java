package p085r;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.List;
import p052b1.AbstractC0503h;
import p075l.C0753k;
import p083q.C0792f;
import p083q.C0793g;
import p093v.C1023h;

/* JADX INFO: renamed from: r.h */
/* JADX INFO: loaded from: classes.dex */
public final class C0816h extends AbstractC0503h {

    /* JADX INFO: renamed from: p */
    public static final Class f2724p;

    /* JADX INFO: renamed from: q */
    public static final Constructor f2725q;

    /* JADX INFO: renamed from: r */
    public static final Method f2726r;

    /* JADX INFO: renamed from: s */
    public static final Method f2727s;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        Class<?> cls;
        Method method;
        Method method2;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(null);
            Class cls2 = Integer.TYPE;
            method2 = cls.getMethod("addFontWeightStyle", ByteBuffer.class, cls2, List.class, cls2, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e2) {
            Log.e("TypefaceCompatApi24Impl", e2.getClass().getName(), e2);
            cls = null;
            method = null;
            method2 = null;
        }
        f2725q = constructor;
        f2724p = cls;
        f2726r = method2;
        f2727s = method;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: Q */
    public static boolean m1486Q(Object obj, ByteBuffer byteBuffer, int i2, int i3, boolean z2) {
        try {
            return ((Boolean) f2726r.invoke(obj, byteBuffer, Integer.valueOf(i2), null, Integer.valueOf(i3), Boolean.valueOf(z2))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: R */
    public static Typeface m1487R(Object obj) {
        try {
            Object objNewInstance = Array.newInstance((Class<?>) f2724p, 1);
            Array.set(objNewInstance, 0, obj);
            return (Typeface) f2727s.invoke(null, objNewInstance);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:33:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0067 A[SYNTHETIC] */
    @Override // p052b1.AbstractC0503h
    /* JADX INFO: renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Typeface mo1001l(Context context, C0792f c0792f, Resources resources, int i2) throws IllegalAccessException, InstantiationException, InvocationTargetException {
        Object objNewInstance;
        MappedByteBuffer map;
        FileInputStream fileInputStream;
        try {
            objNewInstance = f2725q.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            objNewInstance = null;
        }
        if (objNewInstance != null) {
            for (C0793g c0793g : c0792f.f2638a) {
                int i3 = c0793g.f2644f;
                File fileM967C = AbstractC0503h.m967C(context);
                if (fileM967C != null) {
                    try {
                        if (AbstractC0503h.m982j(fileM967C, resources, i3)) {
                            try {
                                fileInputStream = new FileInputStream(fileM967C);
                            } catch (IOException unused2) {
                                map = null;
                            }
                            try {
                                FileChannel channel = fileInputStream.getChannel();
                                map = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                                fileInputStream.close();
                                if (map == null) {
                                    if (m1486Q(objNewInstance, map, c0793g.f2643e, c0793g.f2640b, c0793g.f2641c)) {
                                    }
                                }
                            } finally {
                            }
                        }
                    } finally {
                        fileM967C.delete();
                    }
                }
                map = null;
                if (map == null) {
                }
            }
            return m1487R(objNewInstance);
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p052b1.AbstractC0503h
    /* JADX INFO: renamed from: m */
    public final Typeface mo1002m(Context context, C1023h[] c1023hArr, int i2) {
        Object objNewInstance;
        try {
            objNewInstance = f2725q.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            objNewInstance = null;
        }
        if (objNewInstance != null) {
            C0753k c0753k = new C0753k();
            int length = c1023hArr.length;
            int i3 = 0;
            while (true) {
                if (i3 >= length) {
                    Typeface typefaceM1487R = m1487R(objNewInstance);
                    if (typefaceM1487R != null) {
                        return Typeface.create(typefaceM1487R, i2);
                    }
                } else {
                    C1023h c1023h = c1023hArr[i3];
                    Uri uri = c1023h.f3632a;
                    ByteBuffer byteBufferM971G = (ByteBuffer) c0753k.getOrDefault(uri, null);
                    if (byteBufferM971G == null) {
                        byteBufferM971G = AbstractC0503h.m971G(context, uri);
                        c0753k.put(uri, byteBufferM971G);
                    }
                    if (byteBufferM971G == null) {
                        break;
                    }
                    if (!m1486Q(objNewInstance, byteBufferM971G, c1023h.f3633b, c1023h.f3634c, c1023h.f3635d)) {
                        break;
                    }
                    i3++;
                }
            }
        }
        return null;
    }
}
