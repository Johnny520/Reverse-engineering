package defpackage;

/* JADX INFO: renamed from: ᲇᛸᛶᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C2105 implements java.io.Serializable {

    /* JADX INFO: renamed from: ᛱᛳᛲᛸ, reason: contains not printable characters */
    @defpackage.InterfaceC1248("continuousDays")
    private final int f9015;

    /* JADX INFO: renamed from: ᛲᛲᛵ, reason: contains not printable characters */
    @defpackage.InterfaceC1248("groupId")
    private final java.lang.String f9016;

    /* JADX INFO: renamed from: ᛲᛴᛱᛶ, reason: contains not printable characters */
    @defpackage.InterfaceC1248("loginUserId")
    private java.lang.String f9017;

    /* JADX INFO: renamed from: ᛲᛴᲇᛳ, reason: contains not printable characters */
    @defpackage.InterfaceC1248("lastFireTime")
    private final long f9018;

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    @defpackage.InterfaceC1248("nickname")
    private final java.lang.String f9019;

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    @defpackage.InterfaceC1248("avatar")
    private final java.lang.String f9020;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    @defpackage.InterfaceC1248("id")
    private final java.lang.String f9021;

    /* JADX INFO: renamed from: ᛸᛵᛸᛷ, reason: contains not printable characters */
    @defpackage.InterfaceC1248("type")
    private final defpackage.EnumC0093 f9022;

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    @defpackage.InterfaceC1248("uid")
    private final java.lang.String f9023;

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    @defpackage.InterfaceC1248("addTime")
    private final long f9024;

    public C2105() {
            r10 = this;
            r8 = 0
            r9 = 1023(0x3ff, float:1.434E-42)
            r1 = 0
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r7 = 0
            r0 = r10
            r0.<init>(r1, r2, r3, r4, r5, r7, r8, r9)
            return
    }

    public C2105(java.lang.String r3, java.lang.String r4, java.lang.String r5, java.lang.String r6, long r7, int r9, long r10, defpackage.EnumC0093 r12, java.lang.String r13, java.lang.String r14) {
            r2 = this;
            r0 = -965049371237934(0xfffc924aef0961d2, double:NaN)
            r0 = -965062256139822(0xfffc9247ef0961d2, double:NaN)
            r0 = -965092320910894(0xfffc9240ef0961d2, double:NaN)
            r0 = -965130975616558(0xfffc9237ef0961d2, double:NaN)
            r0 = -965148155485742(0xfffc9233ef0961d2, double:NaN)
            r0 = -965169630322222(0xfffc922eef0961d2, double:NaN)
            r2.<init>()
            r2.f9021 = r3
            r2.f9020 = r4
            r2.f9019 = r5
            r2.f9023 = r6
            r2.f9024 = r7
            r2.f9015 = r9
            r2.f9018 = r10
            r2.f9022 = r12
            r2.f9016 = r13
            r2.f9017 = r14
            return
    }

    public /* synthetic */ C2105(java.lang.String r16, java.lang.String r17, java.lang.String r18, java.lang.String r19, long r20, defpackage.EnumC0093 r22, java.lang.String r23, int r24) {
            r15 = this;
            r0 = r24
            r1 = r0 & 1
            if (r1 == 0) goto L11
            r1 = -965203990060590(0xfffc9226ef0961d2, double:NaN)
            java.lang.String r1 = ""
            r3 = r1
            goto L13
        L11:
            r3 = r16
        L13:
            r1 = r0 & 2
            if (r1 == 0) goto L22
            r1 = -965208285027886(0xfffc9225ef0961d2, double:NaN)
            java.lang.String r1 = ""
            r4 = r1
            goto L24
        L22:
            r4 = r17
        L24:
            r1 = r0 & 4
            if (r1 == 0) goto L33
            r1 = -965212579995182(0xfffc9224ef0961d2, double:NaN)
            java.lang.String r1 = ""
            r5 = r1
            goto L35
        L33:
            r5 = r18
        L35:
            r1 = r0 & 8
            if (r1 == 0) goto L44
            r1 = -965216874962478(0xfffc9223ef0961d2, double:NaN)
            java.lang.String r1 = ""
            r6 = r1
            goto L46
        L44:
            r6 = r19
        L46:
            r1 = r0 & 16
            if (r1 == 0) goto L4e
            r1 = 0
            r7 = r1
            goto L50
        L4e:
            r7 = r20
        L50:
            r1 = r0 & 128(0x80, float:1.8E-43)
            if (r1 == 0) goto L58
            ᛱᛵᛷᛱ r1 = defpackage.EnumC0093.f889
            r12 = r1
            goto L5a
        L58:
            r12 = r22
        L5a:
            r0 = r0 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L69
            r0 = -965221169929774(0xfffc9222ef0961d2, double:NaN)
            java.lang.String r0 = "default"
            r13 = r0
            goto L6b
        L69:
            r13 = r23
        L6b:
            r0 = -965255529668142(0xfffc921aef0961d2, double:NaN)
            java.lang.String r14 = ""
            r9 = 0
            r10 = 0
            r2 = r15
            r2.<init>(r3, r4, r5, r6, r7, r9, r10, r12, r13, r14)
            return
    }

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public static defpackage.C2105 m3524(defpackage.C2105 r16, int r17, long r18, java.lang.String r20, int r21) {
            r0 = r16
            r1 = r21
            java.lang.String r2 = r0.f9021
            r3 = r2
            java.lang.String r2 = r0.f9020
            r4 = r3
            java.lang.String r3 = r0.f9019
            r5 = r4
            java.lang.String r4 = r0.f9023
            r7 = r5
            long r5 = r0.f9024
            r8 = r1 & 32
            if (r8 == 0) goto L19
            int r8 = r0.f9015
            goto L1b
        L19:
            r8 = r17
        L1b:
            r9 = r1 & 64
            if (r9 == 0) goto L22
            long r9 = r0.f9018
            goto L24
        L22:
            r9 = r18
        L24:
            ᛱᛵᛷᛱ r11 = r0.f9022
            r1 = r1 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L2d
            java.lang.String r1 = r0.f9016
            goto L2f
        L2d:
            r1 = r20
        L2f:
            java.lang.String r12 = r0.f9017
            r13 = -965259824635438(0xfffc9219ef0961d2, double:NaN)
            r13 = -965272709537326(0xfffc9216ef0961d2, double:NaN)
            r13 = -965302774308398(0xfffc920fef0961d2, double:NaN)
            r13 = -965341429014062(0xfffc9206ef0961d2, double:NaN)
            r13 = -965358608883246(0xfffc9202ef0961d2, double:NaN)
            r13 = -965380083719726(0xfffc91fdef0961d2, double:NaN)
            ᲇᛸᛶᛸ r0 = new ᲇᛸᛶᛸ
            r15 = r11
            r11 = r1
            r1 = r7
            r7 = r8
            r8 = r9
            r10 = r15
            r0.<init>(r1, r2, r3, r4, r5, r7, r8, r10, r11, r12)
            return r0
    }

    public final boolean equals(java.lang.Object r8) {
            r7 = this;
            r0 = 1
            if (r7 != r8) goto L4
            return r0
        L4:
            boolean r1 = r8 instanceof defpackage.C2105
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            ᲇᛸᛶᛸ r8 = (defpackage.C2105) r8
            java.lang.String r1 = r7.f9021
            java.lang.String r3 = r8.f9021
            boolean r1 = defpackage.AbstractC0498.m1280(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            java.lang.String r1 = r7.f9020
            java.lang.String r3 = r8.f9020
            boolean r1 = defpackage.AbstractC0498.m1280(r1, r3)
            if (r1 != 0) goto L22
            return r2
        L22:
            java.lang.String r1 = r7.f9019
            java.lang.String r3 = r8.f9019
            boolean r1 = defpackage.AbstractC0498.m1280(r1, r3)
            if (r1 != 0) goto L2d
            return r2
        L2d:
            java.lang.String r1 = r7.f9023
            java.lang.String r3 = r8.f9023
            boolean r1 = defpackage.AbstractC0498.m1280(r1, r3)
            if (r1 != 0) goto L38
            return r2
        L38:
            long r3 = r7.f9024
            long r5 = r8.f9024
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 == 0) goto L41
            return r2
        L41:
            int r1 = r7.f9015
            int r3 = r8.f9015
            if (r1 == r3) goto L48
            return r2
        L48:
            long r3 = r7.f9018
            long r5 = r8.f9018
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 == 0) goto L51
            return r2
        L51:
            ᛱᛵᛷᛱ r1 = r7.f9022
            ᛱᛵᛷᛱ r3 = r8.f9022
            if (r1 == r3) goto L58
            return r2
        L58:
            java.lang.String r1 = r7.f9016
            java.lang.String r3 = r8.f9016
            boolean r1 = defpackage.AbstractC0498.m1280(r1, r3)
            if (r1 != 0) goto L63
            return r2
        L63:
            java.lang.String r7 = r7.f9017
            java.lang.String r8 = r8.f9017
            boolean r7 = defpackage.AbstractC0498.m1280(r7, r8)
            if (r7 != 0) goto L6e
            return r2
        L6e:
            return r0
    }

    public final int hashCode() {
            r4 = this;
            java.lang.String r0 = r4.f9021
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            java.lang.String r2 = r4.f9020
            int r0 = defpackage.AbstractC1124.m2153(r2, r0, r1)
            java.lang.String r2 = r4.f9019
            int r0 = defpackage.AbstractC1124.m2153(r2, r0, r1)
            java.lang.String r2 = r4.f9023
            int r0 = defpackage.AbstractC1124.m2153(r2, r0, r1)
            long r2 = r4.f9024
            int r2 = java.lang.Long.hashCode(r2)
            int r2 = r2 + r0
            int r2 = r2 * r1
            int r0 = r4.f9015
            int r0 = defpackage.AbstractC0225.m820(r0, r2, r1)
            long r2 = r4.f9018
            int r2 = java.lang.Long.hashCode(r2)
            int r2 = r2 + r0
            int r2 = r2 * r1
            ᛱᛵᛷᛱ r0 = r4.f9022
            int r0 = r0.hashCode()
            int r0 = r0 + r2
            int r0 = r0 * r1
            java.lang.String r2 = r4.f9016
            int r0 = defpackage.AbstractC1124.m2153(r2, r0, r1)
            java.lang.String r4 = r4.f9017
            if (r4 != 0) goto L45
            r4 = 0
            goto L49
        L45:
            int r4 = r4.hashCode()
        L49:
            int r0 = r0 + r4
            return r0
    }

    public final java.lang.String toString() {
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = -965414443458094(0xfffc91f5ef0961d2, double:NaN)
            java.lang.String r1 = "FireItem(id="
            r0.<init>(r1)
            java.lang.String r1 = r4.f9021
            r2 = -965470278032942(0xfffc91e8ef0961d2, double:NaN)
            r0.append(r1); r0.append(", avatar=")
            java.lang.String r1 = r4.f9020
            r2 = -965513227705902(0xfffc91deef0961d2, double:NaN)
            r0.append(r1); r0.append(", nickname=")
            java.lang.String r1 = r4.f9019
            r2 = -965564767313454(0xfffc91d2ef0961d2, double:NaN)
            r0.append(r1); r0.append(", uid=")
            java.lang.String r1 = r4.f9023
            r2 = -965594832084526(0xfffc91cbef0961d2, double:NaN)
            r0.append(r1); r0.append(", addTime=")
            long r1 = r4.f9024
            r0.append(r1)
            r1 = -965642076724782(0xfffc91c0ef0961d2, double:NaN)
            java.lang.String r1 = ", continuousDays="
            r0.append(r1)
            int r1 = r4.f9015
            r2 = -965719386136110(0xfffc91aeef0961d2, double:NaN)
            r0.append(r1); r0.append(", lastFireTime=")
            long r1 = r4.f9018
            r0.append(r1)
            r1 = -965788105612846(0xfffc919eef0961d2, double:NaN)
            java.lang.String r1 = ", type="
            r0.append(r1)
            ᛱᛵᛷᛱ r1 = r4.f9022
            r0.append(r1)
            r1 = -965822465351214(0xfffc9196ef0961d2, double:NaN)
            java.lang.String r1 = ", groupId="
            r0.append(r1)
            java.lang.String r1 = r4.f9016
            r2 = -965869709991470(0xfffc918bef0961d2, double:NaN)
            r0.append(r1); r0.append(", loginUserId=")
            java.lang.String r4 = r4.f9017
            r1 = 41
            java.lang.String r4 = defpackage.AbstractC0225.m823(r0, r4, r1)
            return r4
    }

    /* JADX INFO: renamed from: ᛱᛳᛲᛸ, reason: contains not printable characters */
    public final java.lang.String m3525() {
            r0 = this;
            java.lang.String r0 = r0.f9017
            return r0
    }

    /* JADX INFO: renamed from: ᛲᛲᛵ, reason: contains not printable characters */
    public final java.lang.String m3526() {
            r0 = this;
            java.lang.String r0 = r0.f9023
            return r0
    }

    /* JADX INFO: renamed from: ᛲᛴᛱᛶ, reason: contains not printable characters */
    public final void m3527(java.lang.String r1) {
            r0 = this;
            r0.f9017 = r1
            return
    }

    /* JADX INFO: renamed from: ᛲᛴᲇᛳ, reason: contains not printable characters */
    public final java.lang.String m3528() {
            r0 = this;
            java.lang.String r0 = r0.f9019
            return r0
    }

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public final java.lang.String m3529() {
            r0 = this;
            java.lang.String r0 = r0.f9016
            return r0
    }

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final int m3530() {
            r0 = this;
            int r0 = r0.f9015
            return r0
    }

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final java.lang.String m3531() {
            r0 = this;
            java.lang.String r0 = r0.f9020
            return r0
    }

    /* JADX INFO: renamed from: ᛸᛵᛸᛷ, reason: contains not printable characters */
    public final defpackage.EnumC0093 m3532() {
            r0 = this;
            ᛱᛵᛷᛱ r0 = r0.f9022
            return r0
    }

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final long m3533() {
            r2 = this;
            long r0 = r2.f9024
            return r0
    }

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public final java.lang.String m3534() {
            r0 = this;
            java.lang.String r0 = r0.f9021
            return r0
    }

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public final long m3535() {
            r2 = this;
            long r0 = r2.f9018
            return r0
    }
}
