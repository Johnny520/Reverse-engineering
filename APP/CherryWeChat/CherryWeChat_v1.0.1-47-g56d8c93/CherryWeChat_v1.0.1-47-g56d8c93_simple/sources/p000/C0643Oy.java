package p000;

import android.os.Build;
import android.os.Looper;
import android.util.AndroidRuntimeException;
import android.view.Choreographer;
import java.util.ArrayList;

/* JADX INFO: renamed from: Oy */
/* JADX INFO: loaded from: classes.dex */
public final class C0643Oy {

    /* JADX INFO: renamed from: m */
    public static final C0709Qe f2062m = null;

    /* JADX INFO: renamed from: n */
    public static final C0709Qe f2063n = null;

    /* JADX INFO: renamed from: o */
    public static final C0709Qe f2064o = null;

    /* JADX INFO: renamed from: p */
    public static final C0709Qe f2065p = null;

    /* JADX INFO: renamed from: q */
    public static final C0709Qe f2066q = null;

    /* JADX INFO: renamed from: r */
    public static final C0709Qe f2067r = null;

    /* JADX INFO: renamed from: a */
    public float f2068a;

    /* JADX INFO: renamed from: b */
    public float f2069b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC1300cy f2070c;

    /* JADX INFO: renamed from: d */
    public final AbstractC0671Pj f2071d;

    /* JADX INFO: renamed from: e */
    public boolean f2072e;

    /* JADX INFO: renamed from: f */
    public long f2073f;

    /* JADX INFO: renamed from: g */
    public final float f2074g;

    /* JADX INFO: renamed from: h */
    public final ArrayList f2075h;

    /* JADX INFO: renamed from: i */
    public final ArrayList f2076i;

    /* JADX INFO: renamed from: j */
    public C0686Py f2077j;

    /* JADX INFO: renamed from: k */
    public float f2078k;

    /* JADX INFO: renamed from: l */
    public boolean f2079l;

    static {
        f2062m = new C0709Qe(1);
        f2063n = new C0709Qe(2);
        f2064o = new C0709Qe(3);
        f2065p = new C0709Qe(4);
        f2066q = new C0709Qe(5);
        f2067r = new C0709Qe(0);
    }

    public C0643Oy(InterfaceC1300cy r5, AbstractC0671Pj r6) {
        this.f2068a = 0.0f;
        this.f2069b = Float.MAX_VALUE;
        this.f2072e = false;
        this.f2073f = 0;
        this.f2075h = new ArrayList();
        this.f2076i = new ArrayList();
        this.f2070c = r5;
        this.f2071d = r6;
        if (r6 != f2064o) goto L5;
    L19:
        this.f2074g = 0.1f;
    L20:
        this.f2077j = null;
        this.f2078k = Float.MAX_VALUE;
        this.f2079l = false;
        return;
    L5:
        if (r6 == f2065p) goto L19;
        if (r6 == f2066q) goto L19;
        if (r6 != f2067r) goto L13;
        this.f2074g = 0.00390625f;
        goto L20
    L13:
        if (r6 != f2062m) goto L15;
    L18:
        this.f2074g = 0.002f;
        goto L20
    L15:
        if (r6 == f2063n) goto L18;
        this.f2074g = 1.0f;
        goto L20
    }

    /* JADX INFO: renamed from: b */
    public static C0691Q2 m1265b() {
        ThreadLocal r0 = C0691Q2.f2219i;
        if (r0.get() != null) goto L6;
        r0.set(new C0691Q2(new C0649P3(3)));
    L6:
        return (C0691Q2) r0.get();
    }

    /* JADX WARN: Type inference failed for: r1v19, types: [O2, java.lang.Object] */
    /* JADX INFO: renamed from: a */
    public final void m1266a(float r7) {
        if (this.f2072e == false) goto L7;
        this.f2078k = r7;
        return;
    L7:
        if (this.f2077j != null) goto L9;
        this.f2077j = new C0686Py(r7);
    L9:
        C0686Py r0 = this.f2077j;
        double r1 = r7;
        r0.f2212i = r1;
        double r12 = (float) r1;
        if (r12 > Float.MAX_VALUE) goto L44;
        if (r12 < (-3.4028235E38f)) goto L42;
        double r13 = Math.abs(this.f2074g * 0.75f);
        r0.f2207d = r13;
        r0.f2208e = r13 * 62.5d;
        C0649P3 r02 = m1265b().f2224e;
        r02.getClass();
        if (Thread.currentThread() != ((Looper) r02.f2090c).getThread()) goto L40;
        boolean r03 = this.f2072e;
        if (r03 == true) goto L38;
        if (r03 == true) goto L45;
        this.f2072e = true;
        float r04 = this.f2071d.mo191o(this.f2070c);
        this.f2069b = r04;
        if (r04 > Float.MAX_VALUE) goto L37;
        if (r04 < (-3.4028235E38f)) goto L37;
        C0691Q2 r72 = m1265b();
        ArrayList r05 = r72.f2221b;
        if (r05.size() != 0) goto L33;
        ((Choreographer) r72.f2224e.f2089b).postFrameCallback(new ChoreographerFrameCallbackC0648P2(r72.f2223d));
        if (Build.VERSION.SDK_INT < 33) goto L33;
        r72.f2226g = AbstractC0859U.m1691a();
        if (r72.f2227h != null) goto L29;
        r72.f2227h = new C0649P3(2, r72);
    L29:
        final C0649P3 r73 = r72.f2227h;
        if (((C0605O2) r73.f2089b) != null) goto L33;
        ?? r14 = new C0605O2(r73);
        r73.f2089b = r14;
        AbstractC0859U.m1700j(r14);
    L33:
        if (r05.contains(this) == true) goto L46;
        r05.add(this);
        return;
    L46:
        return;
    L37:
        throw new IllegalArgumentException("Starting value need to be in between min value and max value");
    L45:
        return;
    L38:
        return;
    L40:
        throw new AndroidRuntimeException("Animations may only be started on the same thread as the animation handler");
    L42:
        throw new UnsupportedOperationException("Final position of the spring cannot be less than the min value.");
    L44:
        throw new UnsupportedOperationException("Final position of the spring cannot be greater than the max value.");
    }

    /* JADX INFO: renamed from: c */
    public final void m1267c(float r3) {
        this.f2071d.mo192z(this.f2070c, r3);
        int r32 = 0;
    L3:
        ArrayList r0 = this.f2076i;
        if (r32 >= r0.size()) goto L10;
        if (r0.get(r32) != null) goto L8;
        r32 = r32 + 1;
        goto L3
    L8:
        r0.get(r32).getClass();
        throw new ClassCastException();
    L10:
        int r33 = r0.size() - 1;
    L11:
        if (r33 < 0) goto L16;
        if (r0.get(r33) != null) goto L15;
        r0.remove(r33);
    L15:
        r33 = r33 - 1;
        goto L11
    }

    /* JADX INFO: renamed from: d */
    public final void m1268d() {
        if (this.f2077j.f2205b <= 0.0d) goto L13;
        C0649P3 r0 = m1265b().f2224e;
        r0.getClass();
        if (Thread.currentThread() != ((Looper) r0.f2090c).getThread()) goto L11;
        if (this.f2072e == false) goto L14;
        this.f2079l = true;
        return;
    L14:
        return;
    L11:
        throw new AndroidRuntimeException("Animations may only be started on the same thread as the animation handler");
    L13:
        throw new UnsupportedOperationException("Spring animations can only come to an end when there is damping");
    }
}
