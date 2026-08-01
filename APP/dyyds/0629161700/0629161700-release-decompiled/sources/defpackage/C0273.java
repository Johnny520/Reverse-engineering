package defpackage;

/* JADX INFO: renamed from: ᛲᛳᲈᛴ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C0273 implements java.io.Serializable {

    /* JADX INFO: renamed from: ᲇᲀᛲᛱ, reason: contains not printable characters */
    public static final defpackage.C0273 f1533 = null;

    /* JADX INFO: renamed from: ᛱᛳᛲᛸ, reason: contains not printable characters */
    @defpackage.InterfaceC1248("useHitokoto")
    private final java.lang.Boolean f1534;

    /* JADX INFO: renamed from: ᛲᛲᛵ, reason: contains not printable characters */
    @defpackage.InterfaceC1248("hitokotoFailStrategy")
    private final defpackage.EnumC1110 f1535;

    /* JADX INFO: renamed from: ᛲᛴᛱᛶ, reason: contains not printable characters */
    @defpackage.InterfaceC1248("scheduledSendEnabled")
    private final java.lang.Boolean f1536;

    /* JADX INFO: renamed from: ᛲᛴᲇᛳ, reason: contains not printable characters */
    @defpackage.InterfaceC1248("hitokotoCategories")
    private final java.util.List<java.lang.String> f1537;

    /* JADX INFO: renamed from: ᛴᛸᲀ, reason: contains not printable characters */
    @defpackage.InterfaceC1248("endTime")
    private final java.lang.String f1538;

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    @defpackage.InterfaceC1248("delayStart")
    private final long f1539;

    /* JADX INFO: renamed from: ᛶᛷᛱᲀ, reason: contains not printable characters */
    @defpackage.InterfaceC1248("scheduledSendTime")
    private final java.lang.String f1540;

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    @defpackage.InterfaceC1248("name")
    private final java.lang.String f1541;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    @defpackage.InterfaceC1248("id")
    private final java.lang.String f1542;

    /* JADX INFO: renamed from: ᛸᛵᛸᛷ, reason: contains not printable characters */
    @defpackage.InterfaceC1248("hitokotoTemplate")
    private final java.lang.String f1543;

    /* JADX INFO: renamed from: ᲀᛳᲀᛵ, reason: contains not printable characters */
    @defpackage.InterfaceC1248("startTime")
    private final java.lang.String f1544;

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    @defpackage.InterfaceC1248("delayEnd")
    private final long f1545;

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    @defpackage.InterfaceC1248("randomMessages")
    private final java.util.List<java.lang.String> f1546;

    static {
            ᛲᛳᲈᛴ r0 = new ᛲᛳᲈᛴ
            r1 = -964916227251758(0xfffc9269ef0961d2, double:NaN)
            java.lang.String r1 = "default"
            r2 = -964950586990126(0xfffc9261ef0961d2, double:NaN)
            java.lang.String r2 = "默认分组"
            r3 = -964972061826606(0xfffc925cef0961d2, double:NaN)
            java.lang.String r3 = "[续火花吧]"
            java.util.List r3 = java.util.Collections.singletonList(r3)
            r4 = -965002126597678(0xfffc9255ef0961d2, double:NaN)
            java.lang.String r4 = "{hitokoto}"
            ᛶᛷᛶ r5 = defpackage.EnumC1110.f4977
            r6 = 7680(0x1e00, float:1.0762E-41)
            r0.<init>(r1, r2, r3, r4, r5, r6)
            defpackage.C0273.f1533 = r0
            return
    }

    public C0273() {
            r7 = this;
            r5 = 0
            r6 = 8191(0x1fff, float:1.1478E-41)
            r1 = 0
            r2 = 0
            r3 = 0
            r4 = 0
            r0 = r7
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
    }

    public C0273(java.lang.String r3, java.lang.String r4, long r5, long r7, java.util.List r9, java.lang.Boolean r10, java.util.List r11, java.lang.String r12, defpackage.EnumC1110 r13, java.lang.Boolean r14, java.lang.String r15, java.lang.String r16, java.lang.String r17) {
            r2 = this;
            r0 = -963863960264238(0xfffc935eef0961d2, double:NaN)
            r0 = -963876845166126(0xfffc935bef0961d2, double:NaN)
            r2.<init>()
            r2.f1542 = r3
            r2.f1541 = r4
            r2.f1539 = r5
            r2.f1545 = r7
            r2.f1546 = r9
            r2.f1534 = r10
            r2.f1537 = r11
            r2.f1543 = r12
            r2.f1535 = r13
            r2.f1536 = r14
            r2.f1540 = r15
            r3 = r16
            r2.f1544 = r3
            r3 = r17
            r2.f1538 = r3
            return
    }

    public /* synthetic */ C0273(java.lang.String r17, java.lang.String r18, java.util.List r19, java.lang.String r20, defpackage.EnumC1110 r21, int r22) {
            r16 = this;
            r0 = r22
            java.lang.Boolean r8 = java.lang.Boolean.FALSE
            r1 = r0 & 1
            if (r1 == 0) goto L12
            r1 = -963898320002606(0xfffc9356ef0961d2, double:NaN)
            java.lang.String r1 = ""
            goto L14
        L12:
            r1 = r17
        L14:
            r2 = r0 & 2
            if (r2 == 0) goto L22
            r2 = -963902614969902(0xfffc9355ef0961d2, double:NaN)
            java.lang.String r2 = ""
            goto L24
        L22:
            r2 = r18
        L24:
            r3 = r0 & 16
            ᲀᛶᲇ r9 = defpackage.C1698.f7558
            if (r3 == 0) goto L2c
            r7 = r9
            goto L2e
        L2c:
            r7 = r19
        L2e:
            r3 = r0 & 128(0x80, float:1.8E-43)
            if (r3 == 0) goto L3d
            r3 = -963906909937198(0xfffc9354ef0961d2, double:NaN)
            java.lang.String r3 = "{hitokoto}"
            r10 = r3
            goto L3f
        L3d:
            r10 = r20
        L3f:
            r0 = r0 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L47
            ᛶᛷᛶ r0 = defpackage.EnumC1110.f4977
            r11 = r0
            goto L49
        L47:
            r11 = r21
        L49:
            r3 = 2000(0x7d0, double:9.88E-321)
            r5 = 4000(0xfa0, double:1.9763E-320)
            r13 = 0
            r14 = 0
            r15 = 0
            r12 = r8
            r0 = r16
            r0.<init>(r1, r2, r3, r5, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            return
    }

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public static defpackage.C0273 m896(defpackage.C0273 r16, java.lang.String r17, long r18, long r20, java.util.ArrayList r22, java.lang.Boolean r23, java.util.List r24, java.lang.String r25, defpackage.EnumC1110 r26, java.lang.Boolean r27, java.lang.String r28, java.lang.String r29, java.lang.String r30) {
            r0 = r16
            java.lang.String r1 = r0.f1542
            r0.getClass()
            r2 = -963954154577454(0xfffc9349ef0961d2, double:NaN)
            r2 = -963967039479342(0xfffc9346ef0961d2, double:NaN)
            ᛲᛳᲈᛴ r0 = new ᛲᛳᲈᛴ
            r2 = r17
            r3 = r18
            r5 = r20
            r7 = r22
            r8 = r23
            r9 = r24
            r10 = r25
            r11 = r26
            r12 = r27
            r13 = r28
            r14 = r29
            r15 = r30
            r0.<init>(r1, r2, r3, r5, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            return r0
    }

    public final boolean equals(java.lang.Object r8) {
            r7 = this;
            r0 = 1
            if (r7 != r8) goto L4
            return r0
        L4:
            boolean r1 = r8 instanceof defpackage.C0273
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            ᛲᛳᲈᛴ r8 = (defpackage.C0273) r8
            java.lang.String r1 = r7.f1542
            java.lang.String r3 = r8.f1542
            boolean r1 = defpackage.AbstractC0498.m1280(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            java.lang.String r1 = r7.f1541
            java.lang.String r3 = r8.f1541
            boolean r1 = defpackage.AbstractC0498.m1280(r1, r3)
            if (r1 != 0) goto L22
            return r2
        L22:
            long r3 = r7.f1539
            long r5 = r8.f1539
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 == 0) goto L2b
            return r2
        L2b:
            long r3 = r7.f1545
            long r5 = r8.f1545
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 == 0) goto L34
            return r2
        L34:
            java.util.List<java.lang.String> r1 = r7.f1546
            java.util.List<java.lang.String> r3 = r8.f1546
            boolean r1 = defpackage.AbstractC0498.m1280(r1, r3)
            if (r1 != 0) goto L3f
            return r2
        L3f:
            java.lang.Boolean r1 = r7.f1534
            java.lang.Boolean r3 = r8.f1534
            boolean r1 = defpackage.AbstractC0498.m1280(r1, r3)
            if (r1 != 0) goto L4a
            return r2
        L4a:
            java.util.List<java.lang.String> r1 = r7.f1537
            java.util.List<java.lang.String> r3 = r8.f1537
            boolean r1 = defpackage.AbstractC0498.m1280(r1, r3)
            if (r1 != 0) goto L55
            return r2
        L55:
            java.lang.String r1 = r7.f1543
            java.lang.String r3 = r8.f1543
            boolean r1 = defpackage.AbstractC0498.m1280(r1, r3)
            if (r1 != 0) goto L60
            return r2
        L60:
            ᛶᛷᛶ r1 = r7.f1535
            ᛶᛷᛶ r3 = r8.f1535
            if (r1 == r3) goto L67
            return r2
        L67:
            java.lang.Boolean r1 = r7.f1536
            java.lang.Boolean r3 = r8.f1536
            boolean r1 = defpackage.AbstractC0498.m1280(r1, r3)
            if (r1 != 0) goto L72
            return r2
        L72:
            java.lang.String r1 = r7.f1540
            java.lang.String r3 = r8.f1540
            boolean r1 = defpackage.AbstractC0498.m1280(r1, r3)
            if (r1 != 0) goto L7d
            return r2
        L7d:
            java.lang.String r1 = r7.f1544
            java.lang.String r3 = r8.f1544
            boolean r1 = defpackage.AbstractC0498.m1280(r1, r3)
            if (r1 != 0) goto L88
            return r2
        L88:
            java.lang.String r7 = r7.f1538
            java.lang.String r8 = r8.f1538
            boolean r7 = defpackage.AbstractC0498.m1280(r7, r8)
            if (r7 != 0) goto L93
            return r2
        L93:
            return r0
    }

    public final int hashCode() {
            r5 = this;
            java.lang.String r0 = r5.f1542
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            java.lang.String r2 = r5.f1541
            int r0 = defpackage.AbstractC1124.m2153(r2, r0, r1)
            long r2 = r5.f1539
            int r2 = java.lang.Long.hashCode(r2)
            int r2 = r2 + r0
            int r2 = r2 * r1
            long r3 = r5.f1545
            int r0 = java.lang.Long.hashCode(r3)
            int r0 = r0 + r2
            int r0 = r0 * r1
            java.util.List<java.lang.String> r2 = r5.f1546
            r3 = 0
            if (r2 != 0) goto L26
            r2 = r3
            goto L2a
        L26:
            int r2 = r2.hashCode()
        L2a:
            int r0 = r0 + r2
            int r0 = r0 * r1
            java.lang.Boolean r2 = r5.f1534
            if (r2 != 0) goto L32
            r2 = r3
            goto L36
        L32:
            int r2 = r2.hashCode()
        L36:
            int r0 = r0 + r2
            int r0 = r0 * r1
            java.util.List<java.lang.String> r2 = r5.f1537
            if (r2 != 0) goto L3e
            r2 = r3
            goto L42
        L3e:
            int r2 = r2.hashCode()
        L42:
            int r0 = r0 + r2
            int r0 = r0 * r1
            java.lang.String r2 = r5.f1543
            if (r2 != 0) goto L4a
            r2 = r3
            goto L4e
        L4a:
            int r2 = r2.hashCode()
        L4e:
            int r0 = r0 + r2
            int r0 = r0 * r1
            ᛶᛷᛶ r2 = r5.f1535
            if (r2 != 0) goto L56
            r2 = r3
            goto L5a
        L56:
            int r2 = r2.hashCode()
        L5a:
            int r0 = r0 + r2
            int r0 = r0 * r1
            java.lang.Boolean r2 = r5.f1536
            if (r2 != 0) goto L62
            r2 = r3
            goto L66
        L62:
            int r2 = r2.hashCode()
        L66:
            int r0 = r0 + r2
            int r0 = r0 * r1
            java.lang.String r2 = r5.f1540
            if (r2 != 0) goto L6e
            r2 = r3
            goto L72
        L6e:
            int r2 = r2.hashCode()
        L72:
            int r0 = r0 + r2
            int r0 = r0 * r1
            java.lang.String r2 = r5.f1544
            if (r2 != 0) goto L7a
            r2 = r3
            goto L7e
        L7a:
            int r2 = r2.hashCode()
        L7e:
            int r0 = r0 + r2
            int r0 = r0 * r1
            java.lang.String r5 = r5.f1538
            if (r5 != 0) goto L85
            goto L89
        L85:
            int r3 = r5.hashCode()
        L89:
            int r0 = r0 + r3
            return r0
    }

    public final java.lang.String toString() {
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = -963988514315822(0xfffc9341ef0961d2, double:NaN)
            java.lang.String r1 = "FireGroup(id="
            r0.<init>(r1)
            java.lang.String r1 = r4.f1542
            r2 = -964048643857966(0xfffc9333ef0961d2, double:NaN)
            r0.append(r1); r0.append(", name=")
            java.lang.String r1 = r4.f1541
            r2 = -964083003596334(0xfffc932bef0961d2, double:NaN)
            r0.append(r1); r0.append(", delayStart=")
            long r1 = r4.f1539
            r0.append(r1)
            r1 = -964143133138478(0xfffc931def0961d2, double:NaN)
            java.lang.String r1 = ", delayEnd="
            r0.append(r1)
            long r1 = r4.f1545
            r0.append(r1)
            r1 = -964194672746030(0xfffc9311ef0961d2, double:NaN)
            java.lang.String r1 = ", randomMessages="
            r0.append(r1)
            java.util.List<java.lang.String> r1 = r4.f1546
            r0.append(r1)
            r1 = -964271982157358(0xfffc92ffef0961d2, double:NaN)
            java.lang.String r1 = ", useHitokoto="
            r0.append(r1)
            java.lang.Boolean r1 = r4.f1534
            r0.append(r1)
            r1 = -964336406666798(0xfffc92f0ef0961d2, double:NaN)
            java.lang.String r1 = ", hitokotoCategories="
            r0.append(r1)
            java.util.List<java.lang.String> r1 = r4.f1537
            r0.append(r1)
            r1 = -964430895947310(0xfffc92daef0961d2, double:NaN)
            java.lang.String r1 = ", hitokotoTemplate="
            r0.append(r1)
            java.lang.String r1 = r4.f1543
            r2 = -964516795293230(0xfffc92c6ef0961d2, double:NaN)
            r0.append(r1); r0.append(", hitokotoFailStrategy=")
            ᛶᛷᛶ r1 = r4.f1535
            r0.append(r1)
            r1 = -964619874508334(0xfffc92aeef0961d2, double:NaN)
            java.lang.String r1 = ", scheduledSendEnabled="
            r0.append(r1)
            java.lang.Boolean r1 = r4.f1536
            r0.append(r1)
            r1 = -964722953723438(0xfffc9296ef0961d2, double:NaN)
            java.lang.String r1 = ", scheduledSendTime="
            r0.append(r1)
            java.lang.String r1 = r4.f1540
            r2 = -964813148036654(0xfffc9281ef0961d2, double:NaN)
            r0.append(r1); r0.append(", startTime=")
            java.lang.String r1 = r4.f1544
            r2 = -964868982611502(0xfffc9274ef0961d2, double:NaN)
            r0.append(r1); r0.append(", endTime=")
            java.lang.String r4 = r4.f1538
            r1 = 41
            java.lang.String r4 = defpackage.AbstractC0225.m823(r0, r4, r1)
            return r4
    }

    /* JADX INFO: renamed from: ᛱᛳᛲᛸ, reason: contains not printable characters */
    public final java.lang.String m897() {
            r0 = this;
            java.lang.String r0 = r0.f1542
            return r0
    }

    /* JADX INFO: renamed from: ᛲᛲᛵ, reason: contains not printable characters */
    public final java.lang.Boolean m898() {
            r0 = this;
            java.lang.Boolean r0 = r0.f1536
            return r0
    }

    /* JADX INFO: renamed from: ᛲᛴᛱᛶ, reason: contains not printable characters */
    public final java.lang.String m899() {
            r0 = this;
            java.lang.String r0 = r0.f1540
            return r0
    }

    /* JADX INFO: renamed from: ᛲᛴᲇᛳ, reason: contains not printable characters */
    public final java.lang.String m900() {
            r0 = this;
            java.lang.String r0 = r0.f1541
            return r0
    }

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public final java.util.List m901() {
            r0 = this;
            java.util.List<java.lang.String> r0 = r0.f1537
            return r0
    }

    /* JADX INFO: renamed from: ᛶᛷᛱᲀ, reason: contains not printable characters */
    public final java.lang.String m902() {
            r0 = this;
            java.lang.String r0 = r0.f1544
            return r0
    }

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final java.lang.String m903() {
            r0 = this;
            java.lang.String r0 = r0.f1538
            return r0
    }

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final long m904() {
            r2 = this;
            long r0 = r2.f1539
            return r0
    }

    /* JADX INFO: renamed from: ᛸᛵᛸᛷ, reason: contains not printable characters */
    public final java.util.List m905() {
            r0 = this;
            java.util.List<java.lang.String> r0 = r0.f1546
            return r0
    }

    /* JADX INFO: renamed from: ᲀᛳᲀᛵ, reason: contains not printable characters */
    public final java.lang.Boolean m906() {
            r0 = this;
            java.lang.Boolean r0 = r0.f1534
            return r0
    }

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final long m907() {
            r2 = this;
            long r0 = r2.f1545
            return r0
    }

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public final defpackage.EnumC1110 m908() {
            r0 = this;
            ᛶᛷᛶ r0 = r0.f1535
            return r0
    }

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public final java.lang.String m909() {
            r0 = this;
            java.lang.String r0 = r0.f1543
            return r0
    }
}
