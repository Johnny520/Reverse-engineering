package aa;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f115a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.String f116b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f117c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f118d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final java.util.Set f119e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f120f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f121g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final java.util.Set f122h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final java.lang.String f123i;

    public b(boolean r1, java.lang.String r2, boolean r3, boolean r4, java.util.Set r5, boolean r6, boolean r7, java.util.Set r8, java.lang.String r9) {
            r0 = this;
            r5.getClass()
            r8.getClass()
            r0.<init>()
            r0.f115a = r1
            r0.f116b = r2
            r0.f117c = r3
            r0.f118d = r4
            r0.f119e = r5
            r0.f120f = r6
            r0.f121g = r7
            r0.f122h = r8
            r0.f123i = r9
            return
    }

    public static aa.b a(aa.b r10, boolean r11, java.lang.String r12, boolean r13, boolean r14, java.util.Set r15, boolean r16, boolean r17, java.util.Set r18, java.lang.String r19, int r20) {
            r0 = r20
            r1 = r0 & 1
            if (r1 == 0) goto L8
            boolean r11 = r10.f115a
        L8:
            r1 = r11
            r11 = r0 & 2
            if (r11 == 0) goto Lf
            java.lang.String r12 = r10.f116b
        Lf:
            r2 = r12
            r11 = r0 & 4
            if (r11 == 0) goto L16
            boolean r13 = r10.f117c
        L16:
            r3 = r13
            r11 = r0 & 8
            if (r11 == 0) goto L1d
            boolean r14 = r10.f118d
        L1d:
            r4 = r14
            r11 = r0 & 16
            if (r11 == 0) goto L24
            java.util.Set r15 = r10.f119e
        L24:
            r5 = r15
            r11 = r0 & 32
            if (r11 == 0) goto L2d
            boolean r11 = r10.f120f
            r6 = r11
            goto L2f
        L2d:
            r6 = r16
        L2f:
            r11 = r0 & 64
            if (r11 == 0) goto L37
            boolean r11 = r10.f121g
            r7 = r11
            goto L39
        L37:
            r7 = r17
        L39:
            r11 = r0 & 128(0x80, float:1.8E-43)
            if (r11 == 0) goto L41
            java.util.Set r11 = r10.f122h
            r8 = r11
            goto L43
        L41:
            r8 = r18
        L43:
            r11 = r0 & 256(0x100, float:3.59E-43)
            if (r11 == 0) goto L4b
            java.lang.String r11 = r10.f123i
            r9 = r11
            goto L4d
        L4b:
            r9 = r19
        L4d:
            r10.getClass()
            r5.getClass()
            r8.getClass()
            r9.getClass()
            aa.b r0 = new aa.b
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return r0
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L5a
        L3:
            boolean r0 = r3 instanceof aa.b
            if (r0 != 0) goto L8
            goto L58
        L8:
            aa.b r3 = (aa.b) r3
            boolean r0 = r2.f115a
            boolean r1 = r3.f115a
            if (r0 == r1) goto L11
            goto L58
        L11:
            java.lang.String r0 = r2.f116b
            java.lang.String r1 = r3.f116b
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L1c
            goto L58
        L1c:
            boolean r0 = r2.f117c
            boolean r1 = r3.f117c
            if (r0 == r1) goto L23
            goto L58
        L23:
            boolean r0 = r2.f118d
            boolean r1 = r3.f118d
            if (r0 == r1) goto L2a
            goto L58
        L2a:
            java.util.Set r0 = r2.f119e
            java.util.Set r1 = r3.f119e
            boolean r0 = gg.l.a(r0, r1)
            if (r0 != 0) goto L35
            goto L58
        L35:
            boolean r0 = r2.f120f
            boolean r1 = r3.f120f
            if (r0 == r1) goto L3c
            goto L58
        L3c:
            boolean r0 = r2.f121g
            boolean r1 = r3.f121g
            if (r0 == r1) goto L43
            goto L58
        L43:
            java.util.Set r0 = r2.f122h
            java.util.Set r1 = r3.f122h
            boolean r0 = gg.l.a(r0, r1)
            if (r0 != 0) goto L4e
            goto L58
        L4e:
            java.lang.String r0 = r2.f123i
            java.lang.String r3 = r3.f123i
            boolean r3 = r0.equals(r3)
            if (r3 != 0) goto L5a
        L58:
            r3 = 0
            return r3
        L5a:
            r3 = 1
            return r3
    }

    public final int hashCode() {
            r3 = this;
            boolean r0 = r3.f115a
            int r0 = java.lang.Boolean.hashCode(r0)
            r1 = 31
            int r0 = r0 * r1
            java.lang.String r2 = r3.f116b
            int r0 = eh.a.g(r0, r1, r2)
            boolean r2 = r3.f117c
            int r0 = eh.a.h(r0, r1, r2)
            boolean r2 = r3.f118d
            int r0 = eh.a.h(r0, r1, r2)
            java.util.Set r2 = r3.f119e
            int r2 = r2.hashCode()
            int r2 = r2 + r0
            int r2 = r2 * r1
            boolean r0 = r3.f120f
            int r0 = eh.a.h(r2, r1, r0)
            boolean r2 = r3.f121g
            int r0 = eh.a.h(r0, r1, r2)
            java.util.Set r2 = r3.f122h
            int r2 = r2.hashCode()
            int r2 = r2 + r0
            int r2 = r2 * r1
            java.lang.String r0 = r3.f123i
            int r0 = r0.hashCode()
            int r0 = r0 + r2
            return r0
    }

    public final java.lang.String toString() {
            r5 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "MessageBlockDefaultRule(group="
            r0.<init>(r1)
            boolean r1 = r5.f115a
            r0.append(r1)
            java.lang.String r1 = ", label="
            r0.append(r1)
            java.lang.String r1 = r5.f116b
            r0.append(r1)
            java.lang.String r1 = ", official="
            r0.append(r1)
            java.lang.String r1 = ", enabled="
            java.lang.String r2 = ", templateIds="
            boolean r3 = r5.f117c
            boolean r4 = r5.f118d
            p.a.x(r0, r3, r1, r4, r2)
            java.util.Set r1 = r5.f119e
            r0.append(r1)
            java.lang.String r1 = ", customRules="
            r0.append(r1)
            boolean r1 = r5.f120f
            r0.append(r1)
            java.lang.String r1 = ", typeAll="
            r0.append(r1)
            boolean r1 = r5.f121g
            r0.append(r1)
            java.lang.String r1 = ", types="
            r0.append(r1)
            java.util.Set r1 = r5.f122h
            r0.append(r1)
            java.lang.String r1 = ", textKeywords="
            r0.append(r1)
            java.lang.String r1 = ")"
            java.lang.String r2 = r5.f123i
            java.lang.String r0 = eh.a.r(r0, r2, r1)
            return r0
    }
}
