package na;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f9143a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.String f9144b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.lang.String f9145c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f9146d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final java.lang.String f9147e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f9148f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final na.j f9149g;

    public i(java.lang.String r1, java.lang.String r2, java.lang.String r3, boolean r4, java.lang.String r5, boolean r6, na.j r7) {
            r0 = this;
            r1.getClass()
            r2.getClass()
            r3.getClass()
            r5.getClass()
            r0.<init>()
            r0.f9143a = r1
            r0.f9144b = r2
            r0.f9145c = r3
            r0.f9146d = r4
            r0.f9147e = r5
            r0.f9148f = r6
            r0.f9149g = r7
            return
    }

    public static na.i a(na.i r8, java.lang.String r9, java.lang.String r10, java.lang.String r11, boolean r12, java.lang.String r13, int r14) {
            r0 = r14 & 1
            if (r0 == 0) goto L6
            java.lang.String r9 = r8.f9143a
        L6:
            r1 = r9
            r9 = r14 & 2
            if (r9 == 0) goto Ld
            java.lang.String r10 = r8.f9144b
        Ld:
            r2 = r10
            r9 = r14 & 4
            if (r9 == 0) goto L14
            java.lang.String r11 = r8.f9145c
        L14:
            r3 = r11
            r9 = r14 & 8
            if (r9 == 0) goto L1b
            boolean r12 = r8.f9146d
        L1b:
            r4 = r12
            r9 = r14 & 16
            if (r9 == 0) goto L22
            java.lang.String r13 = r8.f9147e
        L22:
            r5 = r13
            r9 = r14 & 32
            if (r9 == 0) goto L2b
            boolean r9 = r8.f9148f
        L29:
            r6 = r9
            goto L2d
        L2b:
            r9 = 0
            goto L29
        L2d:
            r9 = r14 & 64
            if (r9 == 0) goto L35
            na.j r9 = r8.f9149g
        L33:
            r7 = r9
            goto L37
        L35:
            r9 = 0
            goto L33
        L37:
            r8.getClass()
            r1.getClass()
            r2.getClass()
            r3.getClass()
            r5.getClass()
            na.i r0 = new na.i
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return r0
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof na.i
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            na.i r5 = (na.i) r5
            java.lang.String r1 = r4.f9143a
            java.lang.String r3 = r5.f9143a
            boolean r1 = gg.l.a(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            java.lang.String r1 = r4.f9144b
            java.lang.String r3 = r5.f9144b
            boolean r1 = gg.l.a(r1, r3)
            if (r1 != 0) goto L22
            return r2
        L22:
            java.lang.String r1 = r4.f9145c
            java.lang.String r3 = r5.f9145c
            boolean r1 = gg.l.a(r1, r3)
            if (r1 != 0) goto L2d
            return r2
        L2d:
            boolean r1 = r4.f9146d
            boolean r3 = r5.f9146d
            if (r1 == r3) goto L34
            return r2
        L34:
            java.lang.String r1 = r4.f9147e
            java.lang.String r3 = r5.f9147e
            boolean r1 = gg.l.a(r1, r3)
            if (r1 != 0) goto L3f
            return r2
        L3f:
            boolean r1 = r4.f9148f
            boolean r3 = r5.f9148f
            if (r1 == r3) goto L46
            return r2
        L46:
            na.j r1 = r4.f9149g
            na.j r5 = r5.f9149g
            boolean r5 = gg.l.a(r1, r5)
            if (r5 != 0) goto L51
            return r2
        L51:
            return r0
    }

    public final int hashCode() {
            r3 = this;
            java.lang.String r0 = r3.f9143a
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            java.lang.String r2 = r3.f9144b
            int r0 = eh.a.g(r0, r1, r2)
            java.lang.String r2 = r3.f9145c
            int r0 = eh.a.g(r0, r1, r2)
            boolean r2 = r3.f9146d
            int r0 = eh.a.h(r0, r1, r2)
            java.lang.String r2 = r3.f9147e
            int r0 = eh.a.g(r0, r1, r2)
            boolean r2 = r3.f9148f
            int r0 = eh.a.h(r0, r1, r2)
            na.j r1 = r3.f9149g
            if (r1 != 0) goto L2d
            r1 = 0
            goto L31
        L2d:
            int r1 = r1.hashCode()
        L31:
            int r0 = r0 + r1
            return r0
    }

    public final java.lang.String toString() {
            r5 = this;
            java.lang.String r0 = ", targetId="
            java.lang.String r1 = ", label="
            java.lang.String r2 = "RedPacketRuleBinding(id="
            java.lang.String r3 = r5.f9143a
            java.lang.String r4 = r5.f9144b
            java.lang.StringBuilder r0 = bc.e.p(r2, r3, r0, r4, r1)
            java.lang.String r1 = r5.f9145c
            r0.append(r1)
            java.lang.String r1 = ", enabled="
            r0.append(r1)
            boolean r1 = r5.f9146d
            r0.append(r1)
            java.lang.String r1 = ", templateId="
            r0.append(r1)
            java.lang.String r1 = r5.f9147e
            r0.append(r1)
            java.lang.String r1 = ", customRules="
            r0.append(r1)
            boolean r1 = r5.f9148f
            r0.append(r1)
            java.lang.String r1 = ", overrideRule="
            r0.append(r1)
            na.j r1 = r5.f9149g
            r0.append(r1)
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
