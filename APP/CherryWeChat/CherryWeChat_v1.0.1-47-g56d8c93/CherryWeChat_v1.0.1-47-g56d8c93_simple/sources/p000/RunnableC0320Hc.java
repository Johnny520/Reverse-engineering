package p000;

import android.os.Process;
import android.os.SystemClock;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.function.Supplier;

/* JADX INFO: renamed from: Hc */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0320Hc implements InterfaceC2584uc, Runnable, Comparable, InterfaceC1097Zg {

    /* JADX INFO: renamed from: G */
    public static final C2601ut f1055G = null;

    /* JADX INFO: renamed from: A */
    public volatile boolean f1056A;

    /* JADX INFO: renamed from: B */
    public volatile boolean f1057B;

    /* JADX INFO: renamed from: C */
    public boolean f1058C;

    /* JADX INFO: renamed from: D */
    public int f1059D;

    /* JADX INFO: renamed from: E */
    public int f1060E;

    /* JADX INFO: renamed from: F */
    public int f1061F;

    /* JADX INFO: renamed from: a */
    public final C0234Fc f1062a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f1063b;

    /* JADX INFO: renamed from: c */
    public final C1432fz f1064c;

    /* JADX INFO: renamed from: d */
    public final C0061Bb f1065d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC1024Xt f1066e;

    /* JADX INFO: renamed from: f */
    public final C2656w4 f1067f;

    /* JADX INFO: renamed from: g */
    public final C0277Gc f1068g;

    /* JADX INFO: renamed from: h */
    public C0756Rj f1069h;

    /* JADX INFO: renamed from: i */
    public InterfaceC0802Sm f1070i;

    /* JADX INFO: renamed from: j */
    public EnumC2688wu f1071j;

    /* JADX INFO: renamed from: k */
    public C2146kg f1072k;

    /* JADX INFO: renamed from: l */
    public int f1073l;

    /* JADX INFO: renamed from: m */
    public int f1074m;

    /* JADX INFO: renamed from: n */
    public C0922Vd f1075n;

    /* JADX INFO: renamed from: o */
    public C2644vt f1076o;

    /* JADX INFO: renamed from: p */
    public C1544ig f1077p;

    /* JADX INFO: renamed from: q */
    public int f1078q;

    /* JADX INFO: renamed from: r */
    public Object f1079r;

    /* JADX INFO: renamed from: s */
    public C0132D2 f1080s;

    /* JADX INFO: renamed from: t */
    public Supplier f1081t;

    /* JADX INFO: renamed from: u */
    public Thread f1082u;

    /* JADX INFO: renamed from: v */
    public InterfaceC0802Sm f1083v;

    /* JADX INFO: renamed from: w */
    public InterfaceC0802Sm f1084w;

    /* JADX INFO: renamed from: x */
    public Object f1085x;

    /* JADX INFO: renamed from: y */
    public InterfaceC2541tc f1086y;

    /* JADX INFO: renamed from: z */
    public volatile InterfaceC2627vc f1087z;

    static {
        f1055G = new C2601ut("glide_thread_priority_override", null, C2601ut.f8986e);
    }

    public RunnableC0320Hc(C0061Bb r3, C2656w4 r4) {
        this.f1062a = new C0234Fc();
        this.f1063b = new ArrayList();
        this.f1064c = new C1432fz();
        this.f1067f = new C2656w4(9);
        this.f1068g = new C0277Gc();
        this.f1065d = r3;
        this.f1066e = r4;
    }

    @Override // p000.InterfaceC2584uc
    /* JADX INFO: renamed from: a */
    public final void mo670a(InterfaceC0802Sm r3, Exception r4, InterfaceC2541tc r5, int r6) {
        r5.mo914c();
        C0842Tj r0 = new C0842Tj("Fetching data failed", Collections.singletonList(r4));
        Class r42 = r5.mo912a();
        r0.f2684b = r3;
        r0.f2685c = r6;
        r0.f2686d = r42;
        this.f1063b.add(r0);
        if (Thread.currentThread() == this.f1082u) goto L6;
        m680k(2);
        return;
    L6:
        m682m();
    }

    @Override // p000.InterfaceC2584uc
    /* JADX INFO: renamed from: b */
    public final void mo671b(InterfaceC0802Sm r1, Object r2, InterfaceC2541tc r3, int r4, InterfaceC0802Sm r5) {
        this.f1083v = r1;
        this.f1085x = r2;
        this.f1086y = r3;
        this.f1061F = r4;
        this.f1084w = r5;
        boolean r32 = false;
        if (r1 == this.f1062a.m473a().get(0)) goto L5;
        r32 = true;
    L5:
        this.f1058C = r32;
        if (Thread.currentThread() == this.f1082u) goto L9;
        m680k(3);
        return;
    L9:
        m675f();
    }

    @Override // p000.InterfaceC1097Zg
    /* JADX INFO: renamed from: c */
    public final C1432fz mo672c() {
        return this.f1064c;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object r3) {
        RunnableC0320Hc r32 = (RunnableC0320Hc) r3;
        int r0 = this.f1071j.ordinal() - r32.f1071j.ordinal();
        if (r0 == 0) goto L5;
        return r0;
    L5:
        return this.f1078q - r32.f1078q;
    }

    /* JADX INFO: renamed from: d */
    public final InterfaceC2389pw m673d(InterfaceC2541tc r2, Object r3, int r4) {
        if (r3 != null) goto L15;
        r2.mo914c();
        return null;
    L15:
        int r0 = AbstractC1510hp.f5351a;     // Catch: Throwable -> L9
        SystemClock.elapsedRealtimeNanos();     // Catch: Throwable -> L9
        InterfaceC2389pw r32 = m674e(r4, r3);     // Catch: Throwable -> L9
        if (Log.isLoggable("DecodeJob", 2) == false) goto L11;
        r32.toString();     // Catch: Throwable -> L9
        SystemClock.elapsedRealtimeNanos();     // Catch: Throwable -> L9
        Objects.toString(this.f1072k);     // Catch: Throwable -> L9
        Thread.currentThread().getName();     // Catch: Throwable -> L9
    L11:
        r2.mo914c();
        return r32;
    L9:
        th = move-exception;
        r2.mo914c();
        throw th;
    }

    /* JADX INFO: renamed from: e */
    public final InterfaceC2389pw m674e(int r9, Object r10) {
        Class<?> r0 = r10.getClass();
        C0234Fc r1 = this.f1062a;
        C0590No r2 = r1.m475c(r0);
        C2644vt r02 = this.f1076o;
        if (r9 != 4) goto L5;
    L8:
        boolean r12 = true;
    L9:
        C2601ut r3 = C2543te.f8850i;
        Boolean r4 = (Boolean) r02.m5177c(r3);
        if (r4 != null) goto L12;
    L15:
        r02 = new C2644vt();
        C0007A6 r42 = this.f1076o.f9156b;
        C0007A6 r5 = r02.f9156b;
        r5.mo3g(r42);
        r5.put(r3, Boolean.valueOf(r12));
    L14:
        C2644vt r7 = r02;
        InterfaceC2713xc r6 = this.f1069h.m1544a().m1379g(r10);
        InterfaceC2389pw r92 = r2.m1162a(this.f1073l, this.f1074m, new C0307H5(r9, this), r6, r7);     // Catch: Throwable -> L20
        r6.mo232c();
        return r92;
    L20:
        th = move-exception;
        r6.mo232c();
        throw th;
    L12:
        if (r4.booleanValue() == false) goto L14;
        if (r12 == false) goto L15;
    L5:
        if (r1.f750r == true) goto L8;
        r12 = false;
        goto L9
    }

    /* JADX INFO: renamed from: f */
    public final void m675f() {
        if (Log.isLoggable("DecodeJob", 2) == false) goto L8;
        String r0 = "data: " + this.f1085x + ", cache key: " + this.f1083v + ", fetcher: " + this.f1086y;
        int r1 = AbstractC1510hp.f5351a;
        SystemClock.elapsedRealtimeNanos();
        Objects.toString(this.f1072k);
        if (r0 == null) goto L7;
        ", ".concat(r0);
    L7:
        Thread.currentThread().getName();
    L8:
        C1466gp r12 = null;
        if (((Map) this.f1080s.f328b).containsKey(AbstractC0671Pj.class) == false) goto L99;
        Supplier r02 = this.f1081t;
        if (r02 == null) goto L99;
        if (r02.get() == null) goto L99;
        Process.setThreadPriority(Process.myTid(), ((Integer) this.f1081t.get()).intValue());     // Catch: Throwable -> L16
    L16:
        this.f1081t = null;
    L99:
        InterfaceC2389pw r03 = m673d(this.f1086y, this.f1085x, this.f1061F);     // Catch: C0842Tj -> L19
    L21:
        if (r03 == null) goto L90;
        int r2 = this.f1061F;
        boolean r3 = this.f1058C;
        if ((r03 instanceof InterfaceC2284nl) == false) goto L25;
        ((InterfaceC2284nl) r03).mo115a();
    L25:
        boolean r5 = false;
        int r6 = 1;
        if (((C1466gp) this.f1067f.f9198d) == null) goto L29;
        r12 = (C1466gp) C1466gp.f5197e.mo1935c();
        r12.f5201d = false;
        r12.f5200c = true;
        r12.f5199b = r03;
        r03 = r12;
    L29:
        if (((Map) this.f1080s.f328b).containsKey(AbstractC0671Pj.class) == false) goto L31;
        m681l();
    L31:
        m684o();
        C1544ig r4 = this.f1077p;
        monitor-enter(r4);
        r4.f5457n = r03;     // Catch: Throwable -> L87
        r4.f5458o = r2;     // Catch: Throwable -> L87
        r4.f5465v = r3;     // Catch: Throwable -> L87
        monitor-exit(r4);     // Catch: Throwable -> L87
        monitor-enter(r4);
        r4.f5445b.m2744a();     // Catch: Throwable -> L41
        if (r4.f5464u == false) goto L44;
        r4.f5457n.mo118e();     // Catch: Throwable -> L41
        r4.m2962g();     // Catch: Throwable -> L41
        monitor-exit(r4);     // Catch: Throwable -> L41
    L54:
        this.f1059D = 5;
        C2656w4 r22 = this.f1067f;     // Catch: Throwable -> L65
        if (((C1466gp) r22.f9198d) == null) goto L58;
        r5 = true;
    L58:
        if (r5 == false) goto L67;
        C0061Bb r04 = this.f1065d;     // Catch: Throwable -> L65
        C2644vt r32 = this.f1076o;     // Catch: Throwable -> L65
        r22.getClass();     // Catch: Throwable -> L65
        r04.m96a().mo1726d((InterfaceC0802Sm) r22.f9196b, new C2656w4((InterfaceC2647vw) r22.f9197c, (C1466gp) r22.f9198d, r32, 8));     // Catch: Throwable -> L62
        ((C1466gp) r22.f9198d).m2819a();     // Catch: Throwable -> L65
        goto L67
    L62:
        th = move-exception;
        ((C1466gp) r22.f9198d).m2819a();     // Catch: Throwable -> L65
        throw th;     // Catch: Throwable -> L65
    L67:
        if (r12 == null) goto L69;
        r12.m2819a();
    L69:
        C0277Gc r23 = this.f1068g;
        monitor-enter(r23);
        r23.f902b = true;     // Catch: Throwable -> L75
        boolean r05 = r23.m559a();     // Catch: Throwable -> L75
        monitor-exit(r23);
        if (r05 == false) goto L105;
        m679j();
        return;
    L105:
        return;
    L75:
        th = move-exception;
        throw th;
    L65:
        th = move-exception;
        if (r12 == null) goto L80;
        r12.m2819a();
    L80:
        throw th;
    L44:
        if (r4.f5444a.f5288a.isEmpty() == true) goto L84;
        if (r4.f5459p == true) goto L82;
        C2220m6 r06 = r4.f5448e;     // Catch: Throwable -> L41
        InterfaceC2389pw r8 = r4.f5457n;     // Catch: Throwable -> L41
        boolean r9 = r4.f5455l;     // Catch: Throwable -> L41
        C2146kg r11 = r4.f5454k;     // Catch: Throwable -> L41
        InterfaceC2193lg r122 = r4.f5446c;     // Catch: Throwable -> L41
        r06.getClass();     // Catch: Throwable -> L41
        r4.f5462s = new C2236mg(r8, r9, true, r11, r122);     // Catch: Throwable -> L41
        r4.f5459p = true;     // Catch: Throwable -> L41
        C1501hg r07 = r4.f5444a;     // Catch: Throwable -> L41
        r07.getClass();     // Catch: Throwable -> L41
        ArrayList r24 = new ArrayList(r07.f5288a);     // Catch: Throwable -> L41
        r4.m2960e(r24.size() + 1);     // Catch: Throwable -> L41
        C2146kg r08 = r4.f5454k;     // Catch: Throwable -> L41
        C2236mg r33 = r4.f5462s;     // Catch: Throwable -> L41
        monitor-exit(r4);     // Catch: Throwable -> L41
        ((C1264cg) r4.f5449f).m2403c(r4, r08, r33);
        Iterator r09 = r24.iterator();
    L51:
        if (r09.hasNext() == false) goto L53;
        C1457gg r25 = (C1457gg) r09.next();
        r25.f5176b.execute(new RunnableC1413fg(r4, r25.f5175a, r6));
        goto L51
    L53:
        r4.m2959d();
        goto L54
    L82:
        throw new IllegalStateException("Already have resource");     // Catch: Throwable -> L41
    L84:
        throw new IllegalStateException("Received a resource without any callbacks to notify");     // Catch: Throwable -> L41
    L41:
        th = move-exception;
        throw th;
    L87:
        th = move-exception;
        throw th;
    L90:
        m682m();
        return;
    L19:
        e = move-exception;
        InterfaceC0802Sm r26 = this.f1084w;
        int r34 = this.f1061F;
        e.f2684b = r26;
        e.f2685c = r34;
        e.f2686d = null;
        this.f1063b.add(e);
        r03 = null;
        goto L21
    }

    /* JADX INFO: renamed from: g */
    public final InterfaceC2627vc m676g() {
        int r0 = AbstractC0213Ey.m424v(this.f1059D);
        C0234Fc r2 = this.f1062a;
        if (r0 == 1) goto L19;
        if (r0 == 2) goto L17;
        if (r0 == 3) goto L15;
        if (r0 != 5) goto L13;
        return null;
    L13:
        throw new IllegalStateException("Unrecognized stage: ".concat(AbstractC0213Ey.m425w(this.f1059D)));
    L15:
        return new C0342Hy(r2, this);
    L17:
        return new C2412qc(r2.m473a(), r2, this);
    L19:
        return new C2432qw(r2, this);
    }

    /* JADX INFO: renamed from: h */
    public final int m677h(int r5) {
        int r0 = AbstractC0213Ey.m424v(r5);
        if (r0 == 0) goto L26;
        if (r0 == 1) goto L18;
        if (r0 == 2) goto L15;
        if (r0 != 3) goto L9;
        return 6;
    L9:
        if (r0 != 5) goto L12;
        return 6;
    L12:
        throw new IllegalArgumentException("Unrecognized stage: ".concat(AbstractC0213Ey.m425w(r5)));
    L15:
        return 4;
    L18:
        switch(this.f1075n.f2882a) {
            case 0: goto L19;
            case 1: goto L20;
            case 2: goto L19;
            default: goto L19;
        };
    L19:
        boolean r52 = true;
    L21:
        if (r52 == false) goto L24;
        return 3;
    L24:
        return m677h(3);
    L20:
        r52 = false;
        goto L21
    L26:
        switch(this.f1075n.f2882a) {
            case 0: goto L27;
            case 1: goto L28;
            case 2: goto L28;
            default: goto L27;
        };
    L27:
        boolean r53 = true;
    L29:
        if (r53 == false) goto L32;
        return 2;
    L32:
        return m677h(2);
    L28:
        r53 = false;
        goto L29
    }

    /* JADX INFO: renamed from: i */
    public final void m678i() {
        if (((Map) this.f1080s.f328b).containsKey(AbstractC0671Pj.class) == false) goto L5;
        m681l();
    L5:
        m684o();
        C0842Tj r0 = new C0842Tj("Failed to load resource", new ArrayList(this.f1063b));
        C1544ig r1 = this.f1077p;
        monitor-enter(r1);
        r1.f5460q = r0;     // Catch: Throwable -> L44
        monitor-exit(r1);     // Catch: Throwable -> L44
        monitor-enter(r1);
        r1.f5445b.m2744a();     // Catch: Throwable -> L15
        if (r1.f5464u == false) goto L18;
        r1.m2962g();     // Catch: Throwable -> L15
        monitor-exit(r1);     // Catch: Throwable -> L15
    L28:
        C0277Gc r02 = this.f1068g;
        monitor-enter(r02);
        r02.f903c = true;     // Catch: Throwable -> L35
        boolean r12 = r02.m559a();     // Catch: Throwable -> L35
        monitor-exit(r02);
        if (r12 == false) goto L53;
        m679j();
        return;
    L53:
        return;
    L35:
        th = move-exception;
        throw th;
    L18:
        if (r1.f5444a.f5288a.isEmpty() == true) goto L41;
        if (r1.f5461r == true) goto L39;
        r1.f5461r = true;     // Catch: Throwable -> L15
        C2146kg r03 = r1.f5454k;     // Catch: Throwable -> L15
        C1501hg r3 = r1.f5444a;     // Catch: Throwable -> L15
        r3.getClass();     // Catch: Throwable -> L15
        ArrayList r4 = new ArrayList(r3.f5288a);     // Catch: Throwable -> L15
        r1.m2960e(r4.size() + 1);     // Catch: Throwable -> L15
        monitor-exit(r1);     // Catch: Throwable -> L15
        ((C1264cg) r1.f5449f).m2403c(r1, r03, null);
        Iterator r04 = r4.iterator();
    L25:
        if (r04.hasNext() == false) goto L27;
        C1457gg r32 = (C1457gg) r04.next();
        r32.f5176b.execute(new RunnableC1413fg(r1, r32.f5175a, 0));
        goto L25
    L27:
        r1.m2959d();
        goto L28
    L39:
        throw new IllegalStateException("Already failed once");     // Catch: Throwable -> L15
    L41:
        throw new IllegalStateException("Received an exception without any callbacks to notify");     // Catch: Throwable -> L15
    L15:
        th = move-exception;
        throw th;
    L44:
        th = move-exception;
        throw th;
    }

    /* JADX INFO: renamed from: j */
    public final void m679j() {
        C0277Gc r0 = this.f1068g;
        monitor-enter(r0);
        r0.f902b = false;     // Catch: Throwable -> L9
        r0.f901a = false;     // Catch: Throwable -> L9
        r0.f903c = false;     // Catch: Throwable -> L9
        monitor-exit(r0);
        C2656w4 r02 = this.f1067f;
        r02.f9196b = null;
        r02.f9197c = null;
        r02.f9198d = null;
        C0234Fc r03 = this.f1062a;
        r03.f735c = null;
        r03.f736d = null;
        r03.f746n = null;
        r03.f739g = null;
        r03.f743k = null;
        r03.f741i = null;
        r03.f747o = null;
        r03.f742j = null;
        r03.f748p = null;
        r03.f733a.clear();
        r03.f744l = false;
        r03.f734b.clear();
        r03.f745m = false;
        this.f1056A = false;
        this.f1069h = null;
        this.f1070i = null;
        this.f1076o = null;
        this.f1071j = null;
        this.f1072k = null;
        this.f1077p = null;
        this.f1059D = 0;
        this.f1087z = null;
        this.f1082u = null;
        this.f1083v = null;
        this.f1085x = null;
        this.f1061F = 0;
        this.f1086y = null;
        this.f1057B = false;
        this.f1079r = null;
        this.f1063b.clear();
        this.f1066e.mo1934a(this);
        return;
    L9:
        th = move-exception;
        throw th;
    }

    /* JADX INFO: renamed from: k */
    public final void m680k(int r2) {
        this.f1060E = r2;
        C1544ig r22 = this.f1077p;
        if (r22.f5456m == false) goto L5;
        ExecutorServiceC0971Wj r23 = r22.f5452i;
    L6:
        r23.execute(this);
        return;
    L5:
        r23 = r22.f5451h;
        goto L6
    }

    /* JADX INFO: renamed from: l */
    public final void m681l() {
        if (((Map) this.f1080s.f328b).containsKey(AbstractC0671Pj.class) == false) goto L13;
        Supplier r0 = this.f1081t;
        if (r0 != null) goto L7;
        return;
    L7:
        if (r0.get() == null) goto L17;
        Process.setThreadPriority(Process.myTid(), 9);     // Catch: Throwable -> L10
        return;
    L10:
        this.f1081t = null;
        return;
    L17:
        return;
    L13:
        throw new IllegalStateException("OverrideGlideThreadPriority experiment is not enabled.");
    }

    /* JADX INFO: renamed from: m */
    public final void m682m() {
        this.f1082u = Thread.currentThread();
        int r0 = AbstractC1510hp.f5351a;
        SystemClock.elapsedRealtimeNanos();
        boolean r02 = false;
    L4:
        if (this.f1057B == true) goto L14;
        if (this.f1087z == null) goto L14;
        r02 = this.f1087z.mo727c();
        if (r02 == true) goto L14;
        this.f1059D = m677h(this.f1059D);
        this.f1087z = m676g();
        if (this.f1059D != 4) goto L4;
        m680k(2);
        return;
    L14:
        if (this.f1059D != 6) goto L16;
    L17:
        if (r02 == true) goto L26;
        m678i();
        return;
    L26:
        return;
    L16:
        if (this.f1057B == true) goto L17;
    }

    /* JADX INFO: renamed from: n */
    public final void m683n() {
        int r0 = AbstractC0213Ey.m424v(this.f1060E);
        if (r0 == 0) goto L23;
        if (r0 != 1) goto L6;
        m682m();
        return;
    L6:
        if (r0 != 2) goto L9;
        m675f();
        return;
    L9:
        int r1 = this.f1060E;
        if (r1 != 1) goto L12;
        String r12 = "INITIALIZE";
    L20:
        throw new IllegalStateException("Unrecognized run reason: ".concat(r12));
    L12:
        if (r1 != 2) goto L14;
        r12 = "SWITCH_TO_SOURCE_SERVICE";
        goto L20
    L14:
        if (r1 == 3) goto L16;
        r12 = "null";
        goto L20
    L16:
        r12 = "DECODE_DATA";
        goto L20
    L23:
        this.f1059D = m677h(1);
        this.f1087z = m676g();
        m682m();
    }

    /* JADX INFO: renamed from: o */
    public final void m684o() {
        this.f1064c.m2744a();
        if (this.f1056A == true) goto L5;
        this.f1056A = true;
        return;
    L5:
        if (this.f1063b.isEmpty() == false) goto L7;
        Throwable r0 = null;
    L9:
        throw new IllegalStateException("Already notified", r0);
    L7:
        ArrayList r02 = this.f1063b;
        r0 = (Throwable) r02.get(r02.size() - 1);
        goto L9
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC2541tc r0 = this.f1086y;
    L20:
        th = move-exception;
        if (r0 == null) goto L29;
        r0.mo914c();
    L29:
        throw th;
    L11:
        e = move-exception;
        throw e;     // Catch: Throwable -> L20
    L9:
        th = move-exception;
        if (this.f1059D == 5) goto L23;
        this.f1063b.add(th);     // Catch: Throwable -> L20
        m678i();     // Catch: Throwable -> L20
    L23:
        if (this.f1057B == true) goto L25;
        throw th;     // Catch: Throwable -> L20
    L25:
        throw th;     // Catch: Throwable -> L20
    L4:
        if (this.f1057B == false) goto L13;
        m678i();     // Catch: Throwable -> L9 C0265G6 -> L11
        if (r0 == null) goto L31;
        r0.mo914c();
        return;
    L31:
        return;
    L13:
        m683n();     // Catch: Throwable -> L9 C0265G6 -> L11
        if (r0 == null) goto L32;
        r0.mo914c();
        return;
    }
}
