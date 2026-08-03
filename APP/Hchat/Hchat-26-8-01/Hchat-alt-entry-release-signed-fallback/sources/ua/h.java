package ua;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f13618a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.String f13619b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.lang.String f13620c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f13621d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final java.lang.String f13622e;

    public h(java.lang.String r1, java.lang.String r2, java.lang.String r3, java.lang.String r4, boolean r5) {
            r0 = this;
            r1.getClass()
            r2.getClass()
            r3.getClass()
            r4.getClass()
            r0.<init>()
            r0.f13618a = r1
            r0.f13619b = r2
            r0.f13620c = r3
            r0.f13621d = r5
            r0.f13622e = r4
            return
    }

    public static ua.h a(ua.h r6, java.lang.String r7, java.lang.String r8, java.lang.String r9, boolean r10, java.lang.String r11, int r12) {
            r0 = r12 & 1
            if (r0 == 0) goto L6
            java.lang.String r7 = r6.f13618a
        L6:
            r1 = r7
            r7 = r12 & 2
            if (r7 == 0) goto Ld
            java.lang.String r8 = r6.f13619b
        Ld:
            r2 = r8
            r7 = r12 & 4
            if (r7 == 0) goto L14
            java.lang.String r9 = r6.f13620c
        L14:
            r3 = r9
            r7 = r12 & 8
            if (r7 == 0) goto L1b
            boolean r10 = r6.f13621d
        L1b:
            r5 = r10
            r7 = r12 & 16
            if (r7 == 0) goto L22
            java.lang.String r11 = r6.f13622e
        L22:
            r4 = r11
            r6.getClass()
            r1.getClass()
            r2.getClass()
            r3.getClass()
            r4.getClass()
            ua.h r0 = new ua.h
            r0.<init>(r1, r2, r3, r4, r5)
            return r0
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof ua.h
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            ua.h r5 = (ua.h) r5
            java.lang.String r1 = r4.f13618a
            java.lang.String r3 = r5.f13618a
            boolean r1 = gg.l.a(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            java.lang.String r1 = r4.f13619b
            java.lang.String r3 = r5.f13619b
            boolean r1 = gg.l.a(r1, r3)
            if (r1 != 0) goto L22
            return r2
        L22:
            java.lang.String r1 = r4.f13620c
            java.lang.String r3 = r5.f13620c
            boolean r1 = gg.l.a(r1, r3)
            if (r1 != 0) goto L2d
            return r2
        L2d:
            boolean r1 = r4.f13621d
            boolean r3 = r5.f13621d
            if (r1 == r3) goto L34
            return r2
        L34:
            java.lang.String r1 = r4.f13622e
            java.lang.String r5 = r5.f13622e
            boolean r5 = gg.l.a(r1, r5)
            if (r5 != 0) goto L3f
            return r2
        L3f:
            return r0
    }

    public final int hashCode() {
            r3 = this;
            java.lang.String r0 = r3.f13618a
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            java.lang.String r2 = r3.f13619b
            int r0 = eh.a.g(r0, r1, r2)
            java.lang.String r2 = r3.f13620c
            int r0 = eh.a.g(r0, r1, r2)
            boolean r2 = r3.f13621d
            int r0 = eh.a.h(r0, r1, r2)
            java.lang.String r1 = r3.f13622e
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r5 = this;
            java.lang.String r0 = ", targetId="
            java.lang.String r1 = ", label="
            java.lang.String r2 = "TransferRuleBinding(id="
            java.lang.String r3 = r5.f13618a
            java.lang.String r4 = r5.f13619b
            java.lang.StringBuilder r0 = bc.e.p(r2, r3, r0, r4, r1)
            java.lang.String r1 = r5.f13620c
            r0.append(r1)
            java.lang.String r1 = ", enabled="
            r0.append(r1)
            boolean r1 = r5.f13621d
            r0.append(r1)
            java.lang.String r1 = ", templateId="
            r0.append(r1)
            java.lang.String r1 = ")"
            java.lang.String r2 = r5.f13622e
            java.lang.String r0 = eh.a.r(r0, r2, r1)
            return r0
    }
}
