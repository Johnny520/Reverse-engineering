package p000;

import android.os.SystemClock;
import android.util.Log;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.function.Supplier;

/* JADX INFO: renamed from: cg */
/* JADX INFO: loaded from: classes.dex */
public final class C1264cg implements InterfaceC2102jg, InterfaceC2193lg {

    /* JADX INFO: renamed from: h */
    public static final boolean f4293h = false;

    /* JADX INFO: renamed from: a */
    public final C2756yc f4294a;

    /* JADX INFO: renamed from: b */
    public final C2220m6 f4295b;

    /* JADX INFO: renamed from: c */
    public final C0204Ep f4296c;

    /* JADX INFO: renamed from: d */
    public final C0089C2 f4297d;

    /* JADX INFO: renamed from: e */
    public final C1037Y5 f4298e;

    /* JADX INFO: renamed from: f */
    public final C0477L3 f4299f;

    /* JADX INFO: renamed from: g */
    public final C2428qs f4300g;

    static {
        f4293h = Log.isLoggable("Engine", 2);
    }

    public C1264cg(C0204Ep r10, C0132D2 r11, ExecutorServiceC0971Wj r12, ExecutorServiceC0971Wj r13, ExecutorServiceC0971Wj r14, ExecutorServiceC0971Wj r15) {
        this.f4296c = r10;
        C0061Bb r0 = new C0061Bb(r11);
        C2428qs r112 = new C2428qs(2);
        this.f4300g = r112;
        monitor-enter(this);
        monitor-enter(r112);     // Catch: Throwable -> L10
        r112.f8523d = this;     // Catch: Throwable -> L13
        monitor-exit(r112);     // Catch: Throwable -> L13
        monitor-exit(this);     // Catch: Throwable -> L10
        this.f4295b = new C2220m6(22);
        this.f4294a = new C2756yc(2);
        this.f4297d = new C0089C2(r12, r13, r14, r15, this, this);
        this.f4299f = new C0477L3(r0);
        this.f4298e = new C1037Y5();
        r10.f611d = this;
        return;
    L13:
        th = th;
    L25:
        throw th;     // Catch: Throwable -> L18
    L20:
        th = th;
    L18:
        th = th;
    L12:
        Throwable r102 = th;
        monitor-exit(this);     // Catch: Throwable -> L18
        throw r102;
    L10:
        th = th;
        goto L12
    }

    /* JADX INFO: renamed from: e */
    public static void m2400e(InterfaceC2389pw r1) {
        if ((r1 instanceof C2236mg) == false) goto L7;
        ((C2236mg) r1).m4540c();
        return;
    L7:
        throw new IllegalArgumentException("Cannot release anything but an EngineResource");
    }

    /* JADX INFO: renamed from: a */
    public final C2656w4 m2401a(C0756Rj r24, Object r25, InterfaceC0802Sm r26, int r27, int r28, Class r29, Class r30, EnumC2688wu r31, C0922Vd r32, C0007A6 r33, boolean r34, boolean r35, C2644vt r36, boolean r37, boolean r38, C2563ty r39, ExecutorC2346p3 r40) {
        if (f4293h == false) goto L5;
        int r0 = AbstractC1510hp.f5351a;
        long r02 = SystemClock.elapsedRealtimeNanos();
    L6:
        this.f4295b.getClass();
        C2146kg r4 = new C2146kg(r25, r26, r27, r28, r33, r29, r30, r36);
        monitor-enter(this);
        C2236mg r5 = m2402b(r4, r37, r02);     // Catch: Throwable -> L14
        if (r5 != null) goto L17;
        C2656w4 r03 = m2405f(r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r4, r02);     // Catch: Throwable -> L14
        monitor-exit(this);     // Catch: Throwable -> L14
        return r03;
    L17:
        monitor-exit(this);     // Catch: Throwable -> L14
        r39.m5048g(r5, 5, false);
        return null;
    L14:
        th = move-exception;
        throw th;
    L5:
        r02 = 0;
        goto L6
    }

    /* JADX INFO: renamed from: b */
    public final C2236mg m2402b(C2146kg r7, boolean r8, long r9) {
        if (r8 == false) goto L47;
        C2428qs r82 = this.f4300g;
        monitor-enter(r82);
        C0517M0 r10 = (C0517M0) ((HashMap) r82.f8521b).get(r7);     // Catch: Throwable -> L55
        if (r10 != null) goto L11;
        monitor-exit(r82);
        C2236mg r0 = null;
    L18:
        if (r0 == null) goto L20;
        r0.m4539a();
    L20:
        if (r0 != null) goto L22;
        C0204Ep r102 = this.f4296c;
        monitor-enter(r102);
        C0075Bp r83 = (C0075Bp) ((LinkedHashMap) r102.f289c).remove(r7);     // Catch: Throwable -> L48
        if (r83 != null) goto L31;
        monitor-exit(r102);
        Object r84 = null;
    L33:
        InterfaceC2389pw r1 = (InterfaceC2389pw) r84;
        if (r1 != null) goto L37;
        C1264cg r5 = this;
        C2146kg r4 = r7;
        C2236mg r12 = null;
    L40:
        if (r12 == null) goto L42;
        r12.m4539a();
        r5.f4300g.m4867a(r4, r12);
    L42:
        if (r12 == null) goto L47;
        if (f4293h == false) goto L46;
        int r72 = AbstractC1510hp.f5351a;
        SystemClock.elapsedRealtimeNanos();
        Objects.toString(r4);
    L46:
        return r12;
    L37:
        if ((r1 instanceof C2236mg) == false) goto L39;
        r12 = (C2236mg) r1;
        r5 = this;
        r4 = r7;
        goto L40
    L39:
        r5 = this;
        r4 = r7;
        r12 = new C2236mg(r1, true, true, r4, r5);
        goto L40
    L31:
        r102.f288b -= (long) r83.f176b;
        r84 = r83.f175a;     // Catch: Throwable -> L48
        monitor-exit(r102);
    L48:
        th = th;
    L66:
        throw th;
    L53:
        th = th;
        goto L66
    L22:
        if (f4293h == false) goto L24;
        int r85 = AbstractC1510hp.f5351a;
        SystemClock.elapsedRealtimeNanos();
        Objects.toString(r7);
    L24:
        return r0;
    L11:
        r0 = (C2236mg) r10.get();     // Catch: Throwable -> L55
        if (r0 == null) goto L64;
    L17:
        monitor-exit(r82);
        goto L18
    L64:
        r82.m4874l(r10);     // Catch: Throwable -> L15
    L15:
        th = move-exception;
        Throwable r73 = th;
    L70:
        monitor-exit(r82);     // Catch: Throwable -> L60
        throw r73;
    L60:
        th = move-exception;
        r73 = th;
    L55:
        th = move-exception;
        r73 = th;
    L47:
        return null;
    }

    /* JADX INFO: renamed from: c */
    public final synchronized void m2403c(C1544ig r2, InterfaceC0802Sm r3, C2236mg r4) {
        monitor-enter(this);
        if (r4 != null) goto L16;
    L9:
        C2756yc r42 = this.f4294a;     // Catch: Throwable -> L7
        r42.getClass();     // Catch: Throwable -> L7
        r2.getClass();     // Catch: Throwable -> L7
        HashMap r43 = r42.f9385a;     // Catch: Throwable -> L7
        if (r2.equals(r43.get(r3)) == false) goto L12;
        r43.remove(r3);     // Catch: Throwable -> L7
    L7:
        th = move-exception;
        throw th;
    L12:
        monitor-exit(this);
        return;
    L16:
        if (r4.f7877a == false) goto L9;
        this.f4300g.m4867a(r3, r4);     // Catch: Throwable -> L7
        goto L9
    }

    /* JADX INFO: renamed from: d */
    public final void m2404d(InterfaceC0802Sm r4, C2236mg r5) {
        C2428qs r0 = this.f4300g;
        monitor-enter(r0);
        C0517M0 r1 = (C0517M0) ((HashMap) r0.f8521b).remove(r4);     // Catch: Throwable -> L14
        if (r1 == null) goto L7;
        r1.f1685c = null;     // Catch: Throwable -> L14
        r1.clear();     // Catch: Throwable -> L14
    L7:
        monitor-exit(r0);
        if (r5.f7877a == false) goto L12;
        InterfaceC2389pw r42 = (InterfaceC2389pw) this.f4296c.m189d(r4, r5);
        return;
    L12:
        this.f4298e.m1986d(r5, false);
        return;
    L14:
        th = move-exception;
        throw th;
    }

    /* JADX INFO: renamed from: f */
    public final C2656w4 m2405f(C0756Rj r17, Object r18, InterfaceC0802Sm r19, int r20, int r21, Class r22, Class r23, EnumC2688wu r24, C0922Vd r25, Map r26, boolean r27, boolean r28, C2644vt r29, boolean r30, boolean r31, C2563ty r32, Executor r33, C2146kg r34, long r35) {
        C1544ig r12 = (C1544ig) this.f4294a.f9385a.get(r34);
        if (r12 == null) goto L9;
        r12.m2957a(r32, r33);
        if (f4293h == false) goto L8;
        int r0 = AbstractC1510hp.f5351a;
        SystemClock.elapsedRealtimeNanos();
        Objects.toString(r34);
    L8:
        return new C2656w4(this, r32, r12);
    L9:
        C1544ig r122 = (C1544ig) ((C2656w4) this.f4297d.f202h).mo1935c();
        monitor-enter(r122);
        r122.f5454k = r34;     // Catch: Throwable -> L35
        r122.f5455l = r30;     // Catch: Throwable -> L35
        r122.f5456m = r31;     // Catch: Throwable -> L35
        monitor-exit(r122);
        C0477L3 r13 = this.f4299f;
        RunnableC0320Hc r14 = (RunnableC0320Hc) ((C2656w4) r13.f1576d).mo1935c();
        int r15 = r13.f1574b;
        r13.f1574b = r15 + 1;
        C0234Fc r9 = r14.f1062a;
        C0061Bb r132 = r14.f1065d;
        r9.f735c = r17;
        r9.f736d = r18;
        r9.f746n = r19;
        r9.f737e = r20;
        r9.f738f = r21;
        r9.f748p = r25;
        r9.f739g = r22;
        r9.f740h = r132;
        r9.f743k = r23;
        r9.f747o = r24;
        r9.f741i = r29;
        r9.f742j = r26;
        r9.f749q = r27;
        r9.f750r = r28;
        r14.f1069h = r17;
        r14.f1070i = r19;
        r14.f1071j = r24;
        r14.f1072k = r34;
        r14.f1073l = r20;
        r14.f1074m = r21;
        r14.f1075n = r25;
        r14.f1076o = r29;
        r14.f1077p = r122;
        r14.f1078q = r15;
        r14.f1060E = 1;
        r14.f1079r = r18;
        r14.f1080s = r17.f2403h;
        r14.f1081t = (Supplier) r29.m5177c(RunnableC0320Hc.f1055G);
        C2756yc r02 = this.f4294a;
        r02.getClass();
        r02.f9385a.put(r34, r122);
        r122.m2957a(r32, r33);
        monitor-enter(r122);
        r122.f5463t = r14;     // Catch: Throwable -> L32
        int r03 = r14.m677h(1);     // Catch: Throwable -> L32
        if (r03 != 2) goto L18;
    L24:
        ExecutorServiceC0971Wj r04 = r122.f5450g;     // Catch: Throwable -> L32
    L25:
        r04.execute(r14);     // Catch: Throwable -> L32
        monitor-exit(r122);
        if (f4293h == false) goto L31;
        int r05 = AbstractC1510hp.f5351a;
        SystemClock.elapsedRealtimeNanos();
        Objects.toString(r34);
    L31:
        return new C2656w4(this, r32, r122);
    L18:
        if (r03 == 3) goto L24;
        if (r122.f5456m == false) goto L23;
        r04 = r122.f5452i;     // Catch: Throwable -> L32
        goto L25
    L23:
        r04 = r122.f5451h;     // Catch: Throwable -> L32
    L32:
        th = move-exception;
        throw th;
    L35:
        th = move-exception;
        throw th;
    }
}
