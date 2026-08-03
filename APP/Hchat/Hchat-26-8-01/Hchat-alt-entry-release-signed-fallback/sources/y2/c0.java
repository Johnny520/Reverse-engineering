package y2;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f22201a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f22202b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f22203c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f22204d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f22205e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f22206f;

    public c0(boolean r2, y2.d0 r3, boolean r4) {
            r1 = this;
            i0.u r0 = y2.m.f22242a
            if (r2 != 0) goto L8
            r2 = 262152(0x40008, float:3.67353E-40)
            goto La
        L8:
            r2 = 262144(0x40000, float:3.67342E-40)
        La:
            y2.d0 r0 = y2.d0.f22213h
            if (r3 != r0) goto L10
            r2 = r2 | 8192(0x2000, float:1.148E-41)
        L10:
            if (r4 != 0) goto L14
            r2 = r2 | 512(0x200, float:7.17E-43)
        L14:
            y2.d0 r4 = y2.d0.f22212g
            r0 = 1
            if (r3 != r4) goto L1b
            r3 = r0
            goto L1c
        L1b:
            r3 = 0
        L1c:
            r1.<init>()
            r1.f22201a = r2
            r1.f22202b = r3
            r1.f22203c = r0
            r1.f22204d = r0
            r1.f22205e = r0
            r2 = 1002(0x3ea, float:1.404E-42)
            r1.f22206f = r2
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L35
        L3:
            boolean r0 = r3 instanceof y2.c0
            if (r0 != 0) goto L8
            goto L33
        L8:
            y2.c0 r3 = (y2.c0) r3
            int r0 = r3.f22201a
            int r1 = r2.f22201a
            if (r1 == r0) goto L11
            goto L33
        L11:
            boolean r0 = r2.f22202b
            boolean r1 = r3.f22202b
            if (r0 == r1) goto L18
            goto L33
        L18:
            boolean r0 = r2.f22203c
            boolean r1 = r3.f22203c
            if (r0 == r1) goto L1f
            goto L33
        L1f:
            boolean r0 = r2.f22204d
            boolean r1 = r3.f22204d
            if (r0 == r1) goto L26
            goto L33
        L26:
            boolean r0 = r2.f22205e
            boolean r1 = r3.f22205e
            if (r0 == r1) goto L2d
            goto L33
        L2d:
            int r0 = r2.f22206f
            int r3 = r3.f22206f
            if (r0 == r3) goto L35
        L33:
            r3 = 0
            return r3
        L35:
            r3 = 1
            return r3
    }

    public final int hashCode() {
            r3 = this;
            int r0 = r3.f22201a
            r1 = 31
            int r0 = r0 * r1
            boolean r2 = r3.f22202b
            int r0 = eh.a.h(r0, r1, r2)
            boolean r2 = r3.f22203c
            int r0 = eh.a.h(r0, r1, r2)
            boolean r2 = r3.f22204d
            int r0 = eh.a.h(r0, r1, r2)
            boolean r2 = r3.f22205e
            int r0 = eh.a.h(r0, r1, r2)
            r2 = 0
            int r0 = eh.a.h(r0, r1, r2)
            int r2 = r3.f22206f
            int r0 = r0 + r2
            int r0 = r0 * r1
            return r0
    }
}
