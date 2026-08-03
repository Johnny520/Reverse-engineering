package p000;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import java.io.File;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: VB */
/* JADX INFO: loaded from: classes.dex */
public final class C0914VB extends AbstractC1293cr {

    /* JADX INFO: renamed from: m */
    public static Class f2843m = null;

    /* JADX INFO: renamed from: n */
    public static Constructor f2844n = null;

    /* JADX INFO: renamed from: o */
    public static Method f2845o = null;

    /* JADX INFO: renamed from: p */
    public static Method f2846p = null;

    /* JADX INFO: renamed from: q */
    public static boolean f2847q = false;

    /* JADX INFO: renamed from: f */
    public final Class f2848f;

    /* JADX INFO: renamed from: g */
    public final Constructor f2849g;

    /* JADX INFO: renamed from: h */
    public final Method f2850h;

    /* JADX INFO: renamed from: i */
    public final Method f2851i;

    /* JADX INFO: renamed from: j */
    public final Method f2852j;

    /* JADX INFO: renamed from: k */
    public final Method f2853k;

    /* JADX INFO: renamed from: l */
    public final Method f2854l;

    public C0914VB() {
        Class<?> r0 = null;
        Class<?> r1 = Class.forName("android.graphics.FontFamily");     // Catch: Throwable -> L5
        Constructor<?> r2 = r1.getConstructor(null);     // Catch: Throwable -> L5
        Method r3 = m1757c0(r1);     // Catch: Throwable -> L5
        Class r6 = Integer.TYPE;     // Catch: Throwable -> L5
        Method r4 = r1.getMethod("addFontFromBuffer", new Class[]{ByteBuffer.class, r6, FontVariationAxis[].class, r6, r6});     // Catch: Throwable -> L5
        Method r5 = r1.getMethod("freeze", null);     // Catch: Throwable -> L5
        Method r62 = r1.getMethod("abortCreation", null);     // Catch: Throwable -> L5
        Method r12 = m1761d0(r1);     // Catch: Throwable -> L5
        r0 = r1;
    L6:
        this.f2848f = r0;
        this.f2849g = r2;
        this.f2850h = r3;
        this.f2851i = r4;
        this.f2852j = r5;
        this.f2853k = r62;
        this.f2854l = r12;
        return;
    L5:
        r12 = null;
        r2 = null;
        r3 = null;
        r4 = null;
        r5 = null;
        r62 = null;
        goto L6
    }

    /* JADX INFO: renamed from: Y */
    public static boolean m1755Y(Object r1, String r2, int r3, boolean r4) {
        m1756b0();
        return ((Boolean) f2845o.invoke(r1, new Object[]{r2, Integer.valueOf(r3), Boolean.valueOf(r4)})).booleanValue();
    L5:
        e = move-exception;
        throw new RuntimeException(e);
    }

    /* JADX INFO: renamed from: b0 */
    public static void m1756b0() {
        if (f2847q == false) goto L5;
        return;
    L5:
        f2847q = true;
        Constructor<?> r1 = null;
        Class<?> r2 = Class.forName("android.graphics.FontFamily");     // Catch: Throwable -> L8
        Constructor<?> r3 = r2.getConstructor(null);     // Catch: Throwable -> L8
        Method r4 = r2.getMethod("addFontWeightStyle", new Class[]{String.class, Integer.TYPE, Boolean.TYPE});     // Catch: Throwable -> L8
        Method r0 = Typeface.class.getMethod("createFromFamiliesWithDefault", new Class[]{Array.newInstance(r2, 1).getClass()});     // Catch: Throwable -> L8
        r1 = r3;
    L9:
        f2844n = r1;
        f2843m = r2;
        f2845o = r4;
        f2846p = r0;
        return;
    L8:
        r0 = null;
        r2 = null;
        r4 = null;
        goto L9
    }

    /* JADX INFO: renamed from: c0 */
    public static Method m1757c0(Class r8) {
        Class r3 = Boolean.TYPE;
        Class r2 = Integer.TYPE;
        return r8.getMethod("addFontFromAssetManager", new Class[]{AssetManager.class, String.class, r2, r3, r2, r2, r2, FontVariationAxis[].class});
    }

    /* JADX INFO: renamed from: X */
    public final boolean m1758X(Context r11, Object r12, String r13, int r14, int r15, int r16, FontVariationAxis[] r17) {
        return ((Boolean) this.f2850h.invoke(r12, new Object[]{r11.getAssets(), r13, 0, Boolean.FALSE, Integer.valueOf(r14), Integer.valueOf(r15), Integer.valueOf(r16), r17})).booleanValue();
    L5:
        return false;
    }

    /* JADX INFO: renamed from: Z */
    public final Typeface m1759Z(Object r4) {
        Object r1 = Array.newInstance(this.f2848f, 1);     // Catch: Throwable -> L5 IllegalAccessException -> L7
        Array.set(r1, 0, r4);     // Catch: Throwable -> L5 IllegalAccessException -> L7
        return (Typeface) this.f2854l.invoke(null, new Object[]{r1, "sans-serif", -1, -1});
    L5:
        e = move-exception;
        throw new RuntimeException(e);
    }

    /* JADX INFO: renamed from: a0 */
    public final boolean m1760a0(Object r3) {
        return ((Boolean) this.f2852j.invoke(r3, null)).booleanValue();
    L4:
        return false;
    }

    /* JADX INFO: renamed from: d0 */
    public final Method m1761d0(Class r4) {
        Class<?> r42 = Array.newInstance(r4, 1).getClass();
        Class r2 = Integer.TYPE;
        Method r43 = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", new Class[]{r42, String.class, r2, r2});
        r43.setAccessible(true);
        return r43;
    }

    @Override // p000.AbstractC1293cr
    /* JADX INFO: renamed from: q */
    public final Typeface mo1762q(Context r10, C0926Vh r11, Resources r12, int r13) {
        if (this.f2850h != null) goto L60;
        m1756b0();
        Object r102 = f2844n.newInstance(null);     // Catch: InvocationTargetException -> L48 Throwable -> L50 IllegalAccessException -> L52
        C0969Wh[] r112 = r11.f2889a;
        int r0 = r112.length;
        int r4 = 0;
    L25:
        if (r4 >= r0) goto L39;
        C0969Wh r5 = r112[r4];
        File r6 = AbstractC0295Gu.m626s(r10);
        if (r6 == null) goto L74;
        if (AbstractC0295Gu.m614g(r6, r12, r5.f3024f) == false) goto L31;
        if (m1755Y(r102, r6.getPath(), r5.f3020b, r5.f3021c) == false) goto L31;
        r6.delete();
        r4 = r4 + 1;
        goto L25
    L36:
        th = move-exception;
        r6.delete();
        throw th;
    L31:
        r6.delete();
        return null;
    L74:
        return null;
    L39:
        m1756b0();
        Object r113 = Array.newInstance(f2843m, 1);     // Catch: Throwable -> L42 IllegalAccessException -> L44
        Array.set(r113, 0, r102);     // Catch: Throwable -> L42 IllegalAccessException -> L44
        return (Typeface) f2846p.invoke(null, new Object[]{r113});
    L42:
        e = move-exception;
        throw new RuntimeException(e);
    L50:
        e = move-exception;
        throw new RuntimeException(e);
    L60:
        Object r3 = this.f2849g.newInstance(null);     // Catch: Throwable -> L7
    L8:
        if (r3 == null) goto L19;
        C0969Wh[] r114 = r11.f2889a;
        int r132 = r114.length;
        int r02 = 0;
    L11:
        if (r02 >= r132) goto L18;
        C0969Wh r1 = r114[r02];
        String r42 = r1.f3019a;
        int r52 = r1.f3023e;
        int r62 = r1.f3020b;
        boolean r7 = r1.f3021c;
        Context r2 = r10;
        if (m1758X(r2, r3, r42, r52, r62, r7 ? 1 : 0, FontVariationAxis.fromFontVariationSettings(r1.f3022d)) == false) goto L58;
        r02 = r02 + 1;
        r10 = r2;
        goto L11
    L58:
        this.f2853k.invoke(r3, null);     // Catch: Throwable -> L56
        goto L19
    L18:
        if (m1760a0(r3) == false) goto L19;
        return m1759Z(r3);
    L19:
        return null;
    L7:
        r3 = null;
        goto L8
    }

    @Override // p000.AbstractC1293cr
    /* JADX INFO: renamed from: r */
    public final Typeface mo1763r(Context r13, C1098Zh[] r14, int r15) {
        if (r14.length >= 1) goto L68;
    L62:
        return null;
    L68:
        if (this.f2850h == null) goto L48;
        HashMap r0 = new HashMap();
        int r3 = r14.length;
        int r5 = 0;
    L8:
        if (r5 >= r3) goto L17;
        C1098Zh r6 = r14[r5];
        if (r6.f3490f != 0) goto L16;
        Uri r62 = r6.f3485a;
        if (r0.containsKey(r62) == true) goto L16;
        r0.put(r62, AbstractC0295Gu.m630w(r13, r62));
    L16:
        r5 = r5 + 1;
        goto L8
    L17:
        Map r132 = Collections.unmodifiableMap(r0);
        Object r02 = this.f2849g.newInstance(null);     // Catch: Throwable -> L20
    L21:
        if (r02 == null) goto L62;
        int r32 = r14.length;
        int r52 = 0;
        boolean r63 = false;
    L24:
        Method r7 = this.f2853k;
        if (r52 >= r32) goto L37;
        C1098Zh r8 = r14[r52];
        ByteBuffer r9 = (ByteBuffer) r132.get(r8.f3485a);
        if (r9 == null) goto L36;
        boolean r64 = ((Boolean) this.f2851i.invoke(r02, new Object[]{r9, Integer.valueOf(r8.f3486b), null, Integer.valueOf(r8.f3487c), Integer.valueOf(r8.f3488d ? 1 : 0)})).booleanValue();     // Catch: Throwable -> L32
    L33:
        if (r64 == false) goto L34;
        r63 = true;
        goto L36
    L34:
        r7.invoke(r02, null);     // Catch: Throwable -> L63
    L32:
        r64 = false;
    L36:
        r52 = r52 + 1;     // Catch: Throwable -> L63
        r63 = r63;
        goto L24
    L37:
        if (r63 == true) goto L41;
        r7.invoke(r02, null);     // Catch: Throwable -> L63
        goto L62
    L41:
        if (m1760a0(r02) == false) goto L62;
        Typeface r133 = m1759Z(r02);
        if (r133 == null) goto L62;
        return Typeface.create(r133, r15);
    L20:
        r02 = null;
        goto L21
    L48:
        C1098Zh r142 = mo1832w(r14, r15);
        ParcelFileDescriptor r134 = r13.getContentResolver().openFileDescriptor(r142.f3485a, "r", null);
        if (r134 != null) goto L71;
        if (r134 == null) goto L62;
        r134.close();
        return null;
    L71:
        Typeface r143 = new Typeface.Builder(r134.getFileDescriptor()).setWeight(r142.f3487c).setItalic(r142.f3488d).build();     // Catch: Throwable -> L56
        r134.close();     // Catch: Throwable -> L63
        return r143;
    L56:
        th = move-exception;
        r134.close();     // Catch: Throwable -> L59
    L61:
        throw th;     // Catch: Throwable -> L63
    L59:
        th = move-exception;
        th.addSuppressed(th);     // Catch: Throwable -> L63
        goto L61
    }

    @Override // p000.AbstractC1293cr
    /* JADX INFO: renamed from: t */
    public final Typeface mo1764t(Context r10, Resources r11, int r12, String r13, int r14) {
        if (this.f2850h == null) goto L20;
        Object r2 = this.f2849g.newInstance(null);     // Catch: Throwable -> L7
    L8:
        if (r2 != null) goto L11;
    L16:
        return null;
    L11:
        if (m1758X(r10, r2, r13, 0, -1, -1, null) == true) goto L15;
        this.f2853k.invoke(r2, null);     // Catch: Throwable -> L21
        goto L16
    L15:
        if (m1760a0(r2) == false) goto L16;
        return m1759Z(r2);
    L7:
        r2 = null;
        goto L8
    L20:
        return super.mo1764t(r10, r11, r12, r13, r14);
    }
}
