package p000;

import android.util.Log;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.NavigableMap;
import java.util.TreeMap;

/* JADX INFO: renamed from: zp */
/* JADX INFO: loaded from: classes.dex */
public final class C2812zp {

    /* JADX INFO: renamed from: a */
    public final C0649P3 f9526a;

    /* JADX INFO: renamed from: b */
    public final C2769yp f9527b;

    /* JADX INFO: renamed from: c */
    public final HashMap f9528c;

    /* JADX INFO: renamed from: d */
    public final HashMap f9529d;

    /* JADX INFO: renamed from: e */
    public final int f9530e;

    /* JADX INFO: renamed from: f */
    public int f9531f;

    public C2812zp(int r3) {
        this.f9526a = new C0649P3(21);
        this.f9527b = new C2769yp(0);
        this.f9528c = new HashMap();
        this.f9529d = new HashMap();
        this.f9530e = r3;
    }

    /* JADX INFO: renamed from: a */
    public final void m5439a(int r4, Class r5) {
        NavigableMap r52 = m5444f(r5);
        Integer r0 = (Integer) r52.get(Integer.valueOf(r4));
        if (r0 == null) goto L11;
        if (r0.intValue() != 1) goto L8;
        r52.remove(Integer.valueOf(r4));
        return;
    L8:
        r52.put(Integer.valueOf(r4), Integer.valueOf(r0.intValue() - 1));
        return;
    L11:
        throw new NullPointerException("Tried to decrement empty size, size: " + r4 + ", this: " + this);
    }

    /* JADX INFO: renamed from: b */
    public final void m5440b(int r6) {
    L3:
        if (this.f9531f <= r6) goto L11;
        Object r0 = this.f9526a.m1287R();
        AbstractC0714Qj.m1487i(r0);
        C1352e6 r1 = m5442d(r0.getClass());
        int r2 = this.f9531f;
        int r3 = r1.m2621a(r0);
        this.f9531f = r2 - (r1.m2622b() * r3);
        m5439a(r1.m2621a(r0), r0.getClass());
        switch(r1.f4855a) {
            case 0: goto L7;
            default: goto L6;
        };
    L6:
        String r22 = "IntegerArrayPool";
    L9:
        if (Log.isLoggable(r22, 2) == false) goto L3;
        r1.m2621a(r0);
        goto L3
    L7:
        r22 = "ByteArrayPool";
        goto L9
    }

    /* JADX INFO: renamed from: c */
    public final synchronized Object m5441c(int r4, Class r5) {
        monitor-enter(this);
        Integer r0 = (Integer) m5444f(r5).ceilingKey(Integer.valueOf(r4));     // Catch: Throwable -> L16
        if (r0 == null) goto L18;
        int r1 = this.f9531f;     // Catch: Throwable -> L16
        if (r1 != 0) goto L8;
    L12:
        C2769yp r42 = this.f9527b;     // Catch: Throwable -> L16
        int r02 = r0.intValue();     // Catch: Throwable -> L16
        InterfaceC0938Vt r12 = (InterfaceC0938Vt) ((ArrayDeque) r42.f9067a).poll();     // Catch: Throwable -> L16
        if (r12 != null) goto L15;
        r12 = r42.m5340g();     // Catch: Throwable -> L16
    L15:
        C2726xp r13 = (C2726xp) r12;     // Catch: Throwable -> L16
        r13.f9312b = r02;     // Catch: Throwable -> L16
        r13.f9313c = r5;     // Catch: Throwable -> L16
    L22:
        Object r43 = m5443e(r13, r5);     // Catch: Throwable -> L16
        monitor-exit(this);
        return r43;
    L8:
        if ((this.f9530e / r1) >= 2) goto L12;
        if (r0.intValue() <= (r4 * 8)) goto L12;
    L18:
        C2769yp r03 = this.f9527b;     // Catch: Throwable -> L16
        InterfaceC0938Vt r14 = (InterfaceC0938Vt) ((ArrayDeque) r03.f9067a).poll();     // Catch: Throwable -> L16
        if (r14 != null) goto L21;
        r14 = r03.m5340g();     // Catch: Throwable -> L16
    L21:
        r13 = (C2726xp) r14;     // Catch: Throwable -> L16
        r13.f9312b = r4;     // Catch: Throwable -> L16
        r13.f9313c = r5;     // Catch: Throwable -> L16
    L16:
        th = move-exception;
        throw th;
    }

    /* JADX INFO: renamed from: d */
    public final C1352e6 m5442d(Class r4) {
        HashMap r0 = this.f9529d;
        C1352e6 r1 = (C1352e6) r0.get(r4);
        if (r1 == null) goto L5;
        return r1;
    L5:
        if (r4.equals(int[].class) == false) goto L8;
        C1352e6 r12 = new C1352e6(1);
    L10:
        r0.put(r4, r12);
        return r12;
    L8:
        if (r4.equals(byte[].class) == false) goto L13;
        r12 = new C1352e6(0);
        goto L10
    L13:
        throw new IllegalArgumentException("No array pool found for: ".concat(r4.getSimpleName()));
    }

    /* JADX INFO: renamed from: e */
    public final Object m5443e(C2726xp r6, Class r7) {
        C1352e6 r0 = m5442d(r7);
        Object r1 = this.f9526a.m1272B(r6);
        if (r1 == null) goto L5;
        int r2 = this.f9531f;
        int r3 = r0.m2621a(r1);
        this.f9531f = r2 - (r0.m2622b() * r3);
        m5439a(r0.m2621a(r1), r7);
    L5:
        if (r1 != null) goto L11;
        int r62 = r6.f9312b;
        switch(r0.f4855a) {
            case 0: goto L10;
            default: goto L12;
        };
    L12:
        return new int[r62];
    L10:
        return new byte[r62];
    L11:
        return r1;
    }

    /* JADX INFO: renamed from: f */
    public final NavigableMap m5444f(Class r3) {
        HashMap r0 = this.f9528c;
        NavigableMap r1 = (NavigableMap) r0.get(r3);
        if (r1 != null) goto L6;
        TreeMap r12 = new TreeMap();
        r0.put(r3, r12);
        return r12;
    L6:
        return r1;
    }

    /* JADX INFO: renamed from: g */
    public final synchronized void m5445g(Object r6) {
        monitor-enter(this);
        Class<?> r0 = r6.getClass();     // Catch: Throwable -> L15
        C1352e6 r1 = m5442d(r0);     // Catch: Throwable -> L15
        int r2 = r1.m2621a(r6);     // Catch: Throwable -> L15
        int r12 = r1.m2622b() * r2;     // Catch: Throwable -> L15
        if (r12 > (this.f9530e / 2)) goto L17;
        C2769yp r3 = this.f9527b;     // Catch: Throwable -> L15
        InterfaceC0938Vt r4 = (InterfaceC0938Vt) ((ArrayDeque) r3.f9067a).poll();     // Catch: Throwable -> L15
        if (r4 != null) goto L8;
        r4 = r3.m5340g();     // Catch: Throwable -> L15
    L8:
        C2726xp r42 = (C2726xp) r4;     // Catch: Throwable -> L15
        r42.f9312b = r2;     // Catch: Throwable -> L15
        r42.f9313c = r0;     // Catch: Throwable -> L15
        this.f9526a.m1283N(r42, r6);     // Catch: Throwable -> L15
        NavigableMap r62 = m5444f(r0);     // Catch: Throwable -> L15
        Integer r02 = (Integer) r62.get(Integer.valueOf(r42.f9312b));     // Catch: Throwable -> L15
        Integer r22 = Integer.valueOf(r42.f9312b);     // Catch: Throwable -> L15
        int r32 = 1;
        if (r02 == null) goto L12;
        r32 = 1 + r02.intValue();     // Catch: Throwable -> L15
    L12:
        r62.put(r22, Integer.valueOf(r32));     // Catch: Throwable -> L15
        this.f9531f += r12;
        m5440b(this.f9530e);     // Catch: Throwable -> L15
        monitor-exit(this);
        return;
    L17:
        monitor-exit(this);
        return;
    L15:
        th = move-exception;
        throw th;
    }
}
