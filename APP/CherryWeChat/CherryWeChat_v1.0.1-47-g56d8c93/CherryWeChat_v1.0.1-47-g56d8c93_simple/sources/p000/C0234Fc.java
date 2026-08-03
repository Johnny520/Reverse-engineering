package p000;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: Fc */
/* JADX INFO: loaded from: classes.dex */
public final class C0234Fc {

    /* JADX INFO: renamed from: a */
    public final ArrayList f733a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f734b;

    /* JADX INFO: renamed from: c */
    public C0756Rj f735c;

    /* JADX INFO: renamed from: d */
    public Object f736d;

    /* JADX INFO: renamed from: e */
    public int f737e;

    /* JADX INFO: renamed from: f */
    public int f738f;

    /* JADX INFO: renamed from: g */
    public Class f739g;

    /* JADX INFO: renamed from: h */
    public C0061Bb f740h;

    /* JADX INFO: renamed from: i */
    public C2644vt f741i;

    /* JADX INFO: renamed from: j */
    public Map f742j;

    /* JADX INFO: renamed from: k */
    public Class f743k;

    /* JADX INFO: renamed from: l */
    public boolean f744l;

    /* JADX INFO: renamed from: m */
    public boolean f745m;

    /* JADX INFO: renamed from: n */
    public InterfaceC0802Sm f746n;

    /* JADX INFO: renamed from: o */
    public EnumC2688wu f747o;

    /* JADX INFO: renamed from: p */
    public C0922Vd f748p;

    /* JADX INFO: renamed from: q */
    public boolean f749q;

    /* JADX INFO: renamed from: r */
    public boolean f750r;

    public C0234Fc() {
        this.f733a = new ArrayList();
        this.f734b = new ArrayList();
    }

    /* JADX INFO: renamed from: a */
    public final ArrayList m473a() {
        boolean r0 = this.f745m;
        ArrayList r1 = this.f734b;
        if (r0 == true) goto L17;
        this.f745m = true;
        r1.clear();
        ArrayList r02 = m474b();
        int r2 = r02.size();
        int r4 = 0;
    L5:
        if (r4 >= r2) goto L17;
        C1108Zr r5 = (C1108Zr) r02.get(r4);
        InterfaceC0802Sm r6 = r5.f3501a;
        List r7 = r5.f3502b;
        if (r1.contains(r6) == true) goto L9;
        r1.add(r5.f3501a);
    L9:
        int r52 = 0;
    L11:
        if (r52 >= r7.size()) goto L16;
        if (r1.contains(r7.get(r52)) == true) goto L15;
        r1.add((InterfaceC0802Sm) r7.get(r52));
    L15:
        r52 = r52 + 1;
        goto L11
    L16:
        r4 = r4 + 1;
    L17:
        return r1;
    }

    /* JADX INFO: renamed from: b */
    public final ArrayList m474b() {
        boolean r0 = this.f744l;
        ArrayList r1 = this.f733a;
        if (r0 == true) goto L10;
        this.f744l = true;
        r1.clear();
        List r02 = this.f735c.m1544a().m1378f(this.f736d);
        int r2 = r02.size();
        int r3 = 0;
    L5:
        if (r3 >= r2) goto L10;
        C1108Zr r4 = ((InterfaceC1189as) r02.get(r3)).mo995b(this.f736d, this.f737e, this.f738f, this.f741i);
        if (r4 == null) goto L9;
        r1.add(r4);
    L9:
        r3 = r3 + 1;
    L10:
        return r1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: c */
    public final C0590No m475c(Class r18) {
        Class r3 = r18;
        C0683Pv r0 = this.f735c.m1544a();
        Class r9 = this.f739g;
        Class r10 = this.f743k;
        C0633Oo r2 = r0.f2190i;
        C2291ns r4 = (C2291ns) r2.f2028b.getAndSet(null);
        if (r4 != null) goto L5;
        r4 = new C2291ns();
    L5:
        r4.f8041a = r3;
        r4.f8042b = r9;
        r4.f8043c = r10;
        C0521M4 r5 = r2.f2027a;
        monitor-enter(r5);
        C0590No r6 = (C0590No) r2.f2027a.get(r4);     // Catch: Throwable -> L90
        monitor-exit(r5);     // Catch: Throwable -> L90
        r2.f2028b.set(r4);
        r0.f2190i.getClass();
        if (C0633Oo.f2026c.equals(r6) == false) goto L12;
        return null;
    L12:
        if (r6 != null) goto L89;
        ArrayList r12 = new ArrayList();
        Iterator r13 = r0.f2184c.m1276F(r3, r9).iterator();
    L15:
        if (r13.hasNext() == false) goto L74;
        Class<?> r42 = (Class) r13.next();
        Iterator r14 = r0.f2187f.m1541b(r42, r10).iterator();
    L18:
        if (r14.hasNext() == false) goto L72;
        Class r52 = (Class) r14.next();
        C0649P3 r22 = r0.f2184c;
        monitor-enter(r22);
        ArrayList r62 = new ArrayList();     // Catch: Throwable -> L39
        Iterator r7 = ((ArrayList) r22.f2089b).iterator();     // Catch: Throwable -> L39
    L22:
        if (r7.hasNext() == false) goto L41;
        List r8 = (List) ((HashMap) r22.f2090c).get((String) r7.next());     // Catch: Throwable -> L39
        if (r8 == null) goto L22;
        Iterator r82 = r8.iterator();     // Catch: Throwable -> L39
    L29:
        if (r82.hasNext() == false) goto L22;
        C2561tw r11 = (C2561tw) r82.next();     // Catch: Throwable -> L39
        if (r11.f8880a.isAssignableFrom(r3) == true) goto L33;
    L35:
        boolean r15 = false;
    L36:
        if (r15 == false) goto L29;
        r62.add(r11.f8882c);     // Catch: Throwable -> L39
        goto L29
    L33:
        if (r42.isAssignableFrom(r11.f8881b) == false) goto L35;
        r15 = true;
        goto L36
    L41:
        monitor-exit(r22);
        C0752Rf r72 = r0.f2187f;
        monitor-enter(r72);
    L49:
        th = move-exception;
        throw th;
    L45:
        if (r52.isAssignableFrom(r42) == false) goto L51;
        InterfaceC2819zw r23 = C1456gf.f5168l;     // Catch: Throwable -> L49
        monitor-exit(r72);
    L64:
        r12.add(new C0363Ic(r3, r42, r52, r62, r23, r0.f2191j));
        r3 = r18;
        goto L18
    L51:
        Iterator r24 = r72.f2389a.iterator();     // Catch: Throwable -> L49
    L53:
        if (r24.hasNext() == false) goto L67;
        C0055BB r83 = (C0055BB) r24.next();     // Catch: Throwable -> L49
        if (r83.f127a.isAssignableFrom(r42) == true) goto L57;
    L59:
        boolean r112 = false;
    L60:
        if (r112 == true) goto L61;
        r3 = r18;
        goto L53
    L61:
        r23 = r83.f129c;     // Catch: Throwable -> L49
        monitor-exit(r72);
        goto L64
    L57:
        if (r52.isAssignableFrom(r83.f128b) == false) goto L59;
        r112 = true;
        goto L60
    L67:
        throw new IllegalArgumentException("No transcoder registered to transcode from " + r42 + " to " + r52);     // Catch: Throwable -> L49
    L39:
        th = move-exception;
        throw th;
    L72:
        r3 = r18;
        goto L15
    L74:
        if (r12.isEmpty() == false) goto L76;
        Class r32 = r18;
        Class r43 = r9;
        Class r53 = r10;
        C0590No r113 = null;
    L77:
        C0633Oo r02 = r0.f2190i;
        C0521M4 r25 = r02.f2027a;
        monitor-enter(r25);
        C0521M4 r03 = r02.f2027a;     // Catch: Throwable -> L86
        C2291ns r63 = new C2291ns(r32, r43, r53);     // Catch: Throwable -> L86
        if (r113 == null) goto L82;
        C0590No r33 = r113;
    L83:
        r03.put(r63, r33);     // Catch: Throwable -> L86
        monitor-exit(r25);     // Catch: Throwable -> L86
        return r113;
    L82:
        r33 = C0633Oo.f2026c;     // Catch: Throwable -> L86
    L86:
        th = move-exception;
        throw th;
    L76:
        r32 = r18;
        r43 = r9;
        r53 = r10;
        r113 = new C0590No(r32, r43, r53, r12, r0.f2191j);
        goto L77
    L89:
        return r6;
    L90:
        th = move-exception;
        throw th;
    }

    /* JADX INFO: renamed from: d */
    public final InterfaceC0667Pf m476d(Object r6) {
        C0752Rf r0 = this.f735c.m1544a().f2183b;
        Class<?> r1 = r6.getClass();
        monitor-enter(r0);
        Iterator r2 = r0.f2389a.iterator();     // Catch: Throwable -> L12
    L6:
        if (r2.hasNext() == false) goto L14;
        C0710Qf r3 = (C0710Qf) r2.next();     // Catch: Throwable -> L12
        if (r3.f2283a.isAssignableFrom(r1) == false) goto L6;
        InterfaceC0667Pf r12 = r3.f2284b;     // Catch: Throwable -> L12
        monitor-exit(r0);
    L16:
        if (r12 == null) goto L19;
        return r12;
    L19:
        throw new C0597Nv("Failed to find source encoder for data class: " + r6.getClass());
    L14:
        monitor-exit(r0);
        r12 = null;
    L12:
        th = move-exception;
        throw th;
    }

    /* JADX INFO: renamed from: e */
    public final InterfaceC0098CB m477e(Class r5) {
        InterfaceC0098CB r0 = (InterfaceC0098CB) this.f742j.get(r5);
        if (r0 != null) goto L10;
        Iterator r1 = this.f742j.entrySet().iterator();
    L6:
        if (r1.hasNext() == false) goto L10;
        Map.Entry r2 = (Map.Entry) r1.next();
        if (((Class) r2.getKey()).isAssignableFrom(r5) == false) goto L6;
        r0 = (InterfaceC0098CB) r2.getValue();
    L10:
        if (r0 == null) goto L12;
        return r0;
    L12:
        if (this.f742j.isEmpty() == false) goto L19;
        if (this.f749q == false) goto L19;
        throw new IllegalArgumentException("Missing transformation for " + r5 + ". If you wish to ignore unknown resource types, use the optional transformation methods.");
    L19:
        return C0958WC.f2994b;
    }
}
