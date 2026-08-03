package hh;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class i extends f1.n0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final java.lang.String f5540h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f5541i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final java.lang.String f5542j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final java.lang.Integer f5543k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final java.util.ArrayList f5544l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final java.util.ArrayList f5545m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final java.util.ArrayList f5546n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final sf.i f5547o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final sf.i f5548p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final sf.i f5549q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final sf.i f5550r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final sf.i f5551s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final sf.i f5552t;

    public i(org.luckypray.dexkit.DexKitBridge r5, int r6, int r7, java.lang.String r8, int r9, java.lang.String r10, java.lang.Integer r11, java.util.ArrayList r12, java.util.ArrayList r13, java.util.ArrayList r14) {
            r4 = this;
            r4.<init>(r5, r6, r7)
            r4.f5540h = r8
            r4.f5541i = r9
            r4.f5542j = r10
            r4.f5543k = r11
            r4.f5544l = r12
            r4.f5545m = r13
            r4.f5546n = r14
            d1.c0 r2 = new d1.c0
            r3 = 4
            r2.<init>(r4, r3)
            sf.i r3 = new sf.i
            r3.<init>(r2)
            r4.f5547o = r3
            hh.g r2 = new hh.g
            r2.<init>(r4, r5, r7)
            sf.i r3 = new sf.i
            r3.<init>(r2)
            r4.f5548p = r3
            hh.g r2 = new hh.g
            r3 = 1
            r2.<init>(r5, r4, r7, r3)
            sf.i r3 = new sf.i
            r3.<init>(r2)
            r4.f5549q = r3
            hh.g r2 = new hh.g
            r3 = 2
            r2.<init>(r5, r4, r7, r3)
            sf.i r3 = new sf.i
            r3.<init>(r2)
            r4.f5550r = r3
            hh.g r2 = new hh.g
            r3 = 0
            r2.<init>(r5, r4, r7, r3)
            sf.i r3 = new sf.i
            r3.<init>(r2)
            r4.f5551s = r3
            hh.f r2 = new hh.f
            r3 = 0
            r10 = r4
            r9 = r5
            r12 = r6
            r11 = r7
            r8 = r2
            r13 = r3
            r8.<init>(r9, r10, r11, r12, r13)
            r0 = r8
            sf.i r1 = new sf.i
            r1.<init>(r0)
            r4.f5552t = r1
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            r0 = 1
            if (r2 != r3) goto L4
            return r0
        L4:
            boolean r1 = r3 instanceof hh.i
            if (r1 == 0) goto L15
            hh.i r3 = (hh.i) r3
            java.lang.String r3 = r3.f5542j
            java.lang.String r1 = r2.f5542j
            boolean r3 = gg.l.a(r1, r3)
            if (r3 == 0) goto L15
            return r0
        L15:
            r3 = 0
            return r3
    }

    public final int hashCode() {
            r1 = this;
            java.lang.String r0 = r1.f5542j
            int r0 = r0.hashCode()
            return r0
    }

    public final lh.a p() {
            r1 = this;
            sf.i r0 = r1.f5547o
            java.lang.Object r0 = r0.getValue()
            lh.a r0 = (lh.a) r0
            return r0
    }

    public final java.lang.Class q(java.lang.ClassLoader r2) {
            r1 = this;
            r2.getClass()
            lh.a r0 = r1.p()
            r0.getClass()
            java.lang.String r0 = r0.f8057g
            java.lang.Class r2 = ac.p.u(r2, r0)
            return r2
    }

    public final java.lang.String toString() {
            r8 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            int r1 = r8.f5541i
            if (r1 <= 0) goto L21
            java.lang.String r1 = java.lang.reflect.Modifier.toString(r1)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            java.lang.String r1 = " "
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r0.append(r1)
        L21:
            lh.a r1 = r8.p()
            java.lang.String r1 = r1.f8057g
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "class "
            r2.<init>(r3)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r0.append(r1)
            sf.i r1 = r8.f5548p
            java.lang.Object r1 = r1.getValue()
            hh.i r1 = (hh.i) r1
            if (r1 == 0) goto L50
            java.lang.String r2 = " extends "
            r0.append(r2)
            lh.a r1 = r1.p()
            java.lang.String r1 = r1.f8057g
            r0.append(r1)
        L50:
            java.util.ArrayList r1 = r8.f5544l
            int r1 = r1.size()
            if (r1 <= 0) goto L75
            java.lang.String r1 = " implements "
            r0.append(r1)
            sf.i r1 = r8.f5549q
            java.lang.Object r1 = r1.getValue()
            r2 = r1
            hh.j r2 = (hh.j) r2
            hh.h r6 = hh.h.f5539g
            r7 = 30
            java.lang.String r3 = ", "
            r4 = 0
            r5 = 0
            java.lang.String r1 = tf.m.A1(r2, r3, r4, r5, r6, r7)
            r0.append(r1)
        L75:
            java.lang.String r0 = r0.toString()
            return r0
    }
}
