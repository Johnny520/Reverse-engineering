package p085v;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import com.abc.core.runtime.AbstractC0805P;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import p000A.C0011l;
import p083u.C1087f;
import p083u.C1088g;

/* JADX INFO: renamed from: v.h */
/* JADX INFO: loaded from: classes.dex */
public class C1107h extends AbstractC0805P {

    /* JADX INFO: renamed from: i */
    public static Class f4258i = null;

    /* JADX INFO: renamed from: j */
    public static Constructor f4259j = null;

    /* JADX INFO: renamed from: k */
    public static Method f4260k = null;

    /* JADX INFO: renamed from: l */
    public static Method f4261l = null;

    /* JADX INFO: renamed from: m */
    public static boolean f4262m = false;

    /* JADX INFO: renamed from: b */
    public final Class f4263b;

    /* JADX INFO: renamed from: c */
    public final Constructor f4264c;

    /* JADX INFO: renamed from: d */
    public final Method f4265d;

    /* JADX INFO: renamed from: e */
    public final Method f4266e;

    /* JADX INFO: renamed from: f */
    public final Method f4267f;

    /* JADX INFO: renamed from: g */
    public final Method f4268g;

    /* JADX INFO: renamed from: h */
    public final Method f4269h;

    public C1107h() {
        Class<?> r02 = null;
        Class<?> r1 = Class.forName("android.graphics.FontFamily");     // Catch: Throwable -> L5
        Constructor<?> r2 = r1.getConstructor(null);     // Catch: Throwable -> L5
        Method r3 = m2608g0(r1);     // Catch: Throwable -> L5
        Class r4 = Integer.TYPE;     // Catch: Throwable -> L5
        Method r42 = r1.getMethod("addFontFromBuffer", new Class[]{ByteBuffer.class, r4, FontVariationAxis[].class, r4, r4});     // Catch: Throwable -> L5
        Method r5 = r1.getMethod("freeze", null);     // Catch: Throwable -> L5
        Method r6 = r1.getMethod("abortCreation", null);     // Catch: Throwable -> L5
        Method r12 = mo2615h0(r1);     // Catch: Throwable -> L5
        r02 = r1;
    L6:
        this.f4263b = r02;
        this.f4264c = r2;
        this.f4265d = r3;
        this.f4266e = r42;
        this.f4267f = r5;
        this.f4268g = r6;
        this.f4269h = r12;
        return;
    L5:
        r12 = null;
        r2 = null;
        r3 = null;
        r42 = null;
        r5 = null;
        r6 = null;
        goto L6
    }

    /* JADX INFO: renamed from: a0 */
    public static boolean m2606a0(Object r1, String r2, int r3, boolean r4) {
        m2607e0();
        return ((Boolean) f4260k.invoke(r1, new Object[]{r2, Integer.valueOf(r3), Boolean.valueOf(r4)})).booleanValue();
    L5:
        e = move-exception;
        throw new RuntimeException(e);
    }

    /* JADX INFO: renamed from: e0 */
    public static void m2607e0() {
        if (f4262m == false) goto L5;
        return;
    L5:
        f4262m = true;
        Constructor<?> r1 = null;
        Class<?> r2 = Class.forName("android.graphics.FontFamily");     // Catch: Throwable -> L8
        Constructor<?> r3 = r2.getConstructor(null);     // Catch: Throwable -> L8
        Method r4 = r2.getMethod("addFontWeightStyle", new Class[]{String.class, Integer.TYPE, Boolean.TYPE});     // Catch: Throwable -> L8
        Method r02 = Typeface.class.getMethod("createFromFamiliesWithDefault", new Class[]{Array.newInstance(r2, 1).getClass()});     // Catch: Throwable -> L8
        r1 = r3;
    L9:
        f4259j = r1;
        f4258i = r2;
        f4260k = r4;
        f4261l = r02;
        return;
    L8:
        r02 = null;
        r2 = null;
        r4 = null;
        goto L9
    }

    /* JADX INFO: renamed from: g0 */
    public static Method m2608g0(Class r8) {
        Class r6 = Integer.TYPE;
        return r8.getMethod("addFontFromAssetManager", new Class[]{AssetManager.class, String.class, r6, Boolean.TYPE, r6, r6, r6, FontVariationAxis[].class});
    }

    /* JADX INFO: renamed from: Y */
    public final void m2609Y(Object r3) {
        this.f4268g.invoke(r3, null);     // Catch: Throwable -> L4
        return;
    }

    /* JADX INFO: renamed from: Z */
    public final boolean m2610Z(Context r12, Object r13, String r14, int r15, int r16, int r17, FontVariationAxis[] r18) {
        return ((Boolean) this.f4265d.invoke(r13, new Object[]{r12.getAssets(), r14, 0, Boolean.FALSE, Integer.valueOf(r15), Integer.valueOf(r16), Integer.valueOf(r17), r18})).booleanValue();
    L8:
        return false;
    }

    /* JADX INFO: renamed from: b0 */
    public Typeface mo2611b0(Object r5) {
        Object r1 = Array.newInstance(this.f4263b, 1);     // Catch: Throwable -> L5
        Array.set(r1, 0, r5);     // Catch: Throwable -> L5
        return (Typeface) this.f4269h.invoke(null, new Object[]{r1, -1, -1});
    L5:
        return null;
    }

    /* JADX INFO: renamed from: c0 */
    public final Typeface m2612c0(Context r9, C1087f r10, Resources r11, int r12) {
        m2607e0();
        Object r122 = f4259j.newInstance(null);     // Catch: Throwable -> L31 InstantiationException -> L33 IllegalAccessException -> L35
        C1088g[] r102 = r10.f4194a;
        int r1 = r102.length;
        int r3 = 0;
    L5:
        if (r3 >= r1) goto L23;
        C1088g r4 = r102[r3];
        File r5 = AbstractC0805P.m2030C(r9);
        if (r5 == null) goto L8;
        if (AbstractC0805P.m2045h(r5, r11, r4.f4200f) == false) goto L11;
        if (m2606a0(r122, r5.getPath(), r4.f4196b, r4.f4197c) == false) goto L15;
        r5.delete();
        r3 = r3 + 1;
        goto L5
    L15:
        r5.delete();
        return null;
    L11:
        r5.delete();
        return null;
    L21:
        r5.delete();
        return null;
    L18:
        th = move-exception;
        r5.delete();
        throw th;
    L8:
        return null;
    L23:
        m2607e0();
        Object r92 = Array.newInstance(f4258i, 1);     // Catch: InvocationTargetException -> L26 Throwable -> L28
        Array.set(r92, 0, r122);     // Catch: InvocationTargetException -> L26 Throwable -> L28
        return (Typeface) f4261l.invoke(null, new Object[]{r92});
    L28:
        e = move-exception;
        throw new RuntimeException(e);
    L31:
        e = move-exception;
        throw new RuntimeException(e);
    }

    /* JADX INFO: renamed from: d0 */
    public final boolean m2613d0(Object r3) {
        return ((Boolean) this.f4267f.invoke(r3, null)).booleanValue();
    L4:
        return false;
    }

    /* JADX INFO: renamed from: f0 */
    public final Object m2614f0() {
        return this.f4264c.newInstance(null);
    L8:
        return null;
    }

    /* JADX INFO: renamed from: h0 */
    public Method mo2615h0(Class r4) {
        Class<?> r42 = Array.newInstance(r4, 1).getClass();
        Class r1 = Integer.TYPE;
        Method r43 = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", new Class[]{r42, r1, r1});
        r43.setAccessible(true);
        return r43;
    }

    @Override // com.abc.core.runtime.AbstractC0805P
    /* JADX INFO: renamed from: j */
    public final Typeface mo2070j(Context r11, C1087f r12, Resources r13, int r14) {
        if (this.f4265d == null) goto L20;
        Object r132 = m2614f0();
        if (r132 != null) goto L7;
        return null;
    L7:
        C1088g[] r122 = r12.f4194a;
        int r02 = r122.length;
        int r9 = 0;
    L8:
        if (r9 >= r02) goto L15;
        C1088g r1 = r122[r9];
        String r4 = r1.f4195a;
        FontVariationAxis[] r8 = FontVariationAxis.fromFontVariationSettings(r1.f4198d);
        if (m2610Z(r11, r132, r4, r1.f4199e, r1.f4196b, r1.f4197c ? 1 : 0, r8) == false) goto L11;
        r9 = r9 + 1;
        goto L8
    L11:
        m2609Y(r132);
        return null;
    L15:
        if (m2613d0(r132) == true) goto L18;
        return null;
    L18:
        return mo2611b0(r132);
    L20:
        return m2612c0(r11, r12, r13, r14);
    }

    @Override // com.abc.core.runtime.AbstractC0805P
    /* JADX INFO: renamed from: k */
    public final Typeface mo2071k(Context r12, C0011l[] r13, int r14) {
        if (r13.length >= 1) goto L6;
        return null;
    L6:
        if (this.f4265d == null) goto L45;
        HashMap r02 = new HashMap();
        int r3 = r13.length;
        int r5 = 0;
    L8:
        if (r5 >= r3) goto L17;
        C0011l r6 = r13[r5];
        if (r6.f34e != 0) goto L16;
        Uri r62 = r6.f30a;
        if (r02.containsKey(r62) == true) goto L16;
        r02.put(r62, AbstractC0805P.m2035K(r12, r62));
    L16:
        r5 = r5 + 1;
        goto L8
    L17:
        Map r122 = Collections.unmodifiableMap(r02);
        Object r03 = m2614f0();
        if (r03 != null) goto L20;
        return null;
    L20:
        int r32 = r13.length;
        int r52 = 0;
        boolean r63 = false;
    L21:
        if (r52 >= r32) goto L34;
        C0011l r7 = r13[r52];
        ByteBuffer r8 = (ByteBuffer) r122.get(r7.f30a);
        if (r8 == null) goto L33;
        boolean r64 = ((Boolean) this.f4266e.invoke(r03, new Object[]{r8, Integer.valueOf(r7.f31b), null, Integer.valueOf(r7.f32c), Integer.valueOf(r7.f33d ? 1 : 0)})).booleanValue();     // Catch: Throwable -> L28
    L29:
        if (r64 == false) goto L30;
        r63 = true;
        goto L33
    L30:
        m2609Y(r03);
        return null;
    L28:
        r64 = false;
    L33:
        r52 = r52 + 1;
        r63 = r63;
        goto L21
    L34:
        if (r63 == true) goto L38;
        m2609Y(r03);
        return null;
    L38:
        if (m2613d0(r03) == true) goto L40;
        return null;
    L40:
        Typeface r123 = mo2611b0(r03);
        if (r123 != null) goto L44;
        return null;
    L44:
        return Typeface.create(r123, r14);
    L45:
        C0011l r132 = mo2073m(r14, r13);
        ParcelFileDescriptor r124 = r12.getContentResolver().openFileDescriptor(r132.f30a, "r", null);     // Catch: IOException -> L60
        if (r124 != null) goto L61;
        if (r124 == null) goto L50;
        r124.close();     // Catch: IOException -> L60
    L50:
        return null;
    L61:
        Typeface r133 = new Typeface.Builder(r124.getFileDescriptor()).setWeight(r132.f32c).setItalic(r132.f33d).build();     // Catch: Throwable -> L54
        r124.close();     // Catch: IOException -> L60
        return r133;
    L54:
        th = move-exception;
        r124.close();     // Catch: Throwable -> L57
    L59:
        throw th;     // Catch: IOException -> L60
    L57:
        th = move-exception;
        th.addSuppressed(th);     // Catch: IOException -> L60
    L60:
        return null;
    }

    @Override // com.abc.core.runtime.AbstractC0805P
    /* JADX INFO: renamed from: l */
    public final Typeface mo2072l(Context r10, Resources r11, int r12, String r13, int r14) {
        if (this.f4265d == null) goto L17;
        Object r112 = m2614f0();
        if (r112 != null) goto L8;
        return null;
    L8:
        if (m2610Z(r10, r112, r13, 0, -1, -1, null) == true) goto L12;
        m2609Y(r112);
        return null;
    L12:
        if (m2613d0(r112) == true) goto L15;
        return null;
    L15:
        return mo2611b0(r112);
    L17:
        return super.mo2072l(r10, r11, r12, r13, r14);
    }
}
