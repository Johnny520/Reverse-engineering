package xhss;

/* JADX INFO: renamed from: xhss.ᲀᛶᛷᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class C0871 implements java.io.Closeable {

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public final xhss.C0355 f2809;

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public final xhss.EnumC1122 f2810;

    /* JADX INFO: renamed from: ᛳᲈᲈᛲ, reason: contains not printable characters */
    public final xhss.C1066 f2811;

    /* JADX INFO: renamed from: ᛶᲇᲈᛸ, reason: contains not printable characters */
    public final xhss.InterfaceC1168 f2812;

    /* JADX INFO: renamed from: ᛷᛴᛷᛱ, reason: contains not printable characters */
    public final int f2813;

    /* JADX INFO: renamed from: ᛷᲁᲁ, reason: contains not printable characters */
    public final xhss.C0871 f2814;

    /* JADX INFO: renamed from: ᛸᛲᲀᛵ, reason: contains not printable characters */
    public final xhss.InterfaceC0268 f2815;

    /* JADX INFO: renamed from: ᛸᛴᛶᛳ, reason: contains not printable characters */
    public final xhss.AbstractC1052 f2816;

    /* JADX INFO: renamed from: ᛸᛶᛴᲈ, reason: contains not printable characters */
    public final boolean f2817;

    /* JADX INFO: renamed from: ᛸᛶᲈᛶ, reason: contains not printable characters */
    public final long f2818;

    /* JADX INFO: renamed from: ᛸᛷᲈᲈ, reason: contains not printable characters */
    public final xhss.C0871 f2819;

    /* JADX INFO: renamed from: ᲀᲇᛳᲁ, reason: contains not printable characters */
    public final xhss.C0972 f2820;

    /* JADX INFO: renamed from: ᲇᛴᲇᛵ, reason: contains not printable characters */
    public final java.lang.String f2821;

    /* JADX INFO: renamed from: ᲇᛶᛴᲀ, reason: contains not printable characters */
    public final xhss.C0446 f2822;

    /* JADX INFO: renamed from: ᲇᛸᛳᲁ, reason: contains not printable characters */
    public final long f2823;

    /* JADX INFO: renamed from: ᲈᛳᲀ, reason: contains not printable characters */
    public final xhss.C0871 f2824;

    public C0871(xhss.C0355 r1, xhss.EnumC1122 r2, java.lang.String r3, int r4, xhss.C0446 r5, xhss.C0972 r6, xhss.AbstractC1052 r7, xhss.InterfaceC0268 r8, xhss.C0871 r9, xhss.C0871 r10, xhss.C0871 r11, long r12, long r14, xhss.C1066 r16, xhss.InterfaceC1168 r17) {
            r0 = this;
            r0.<init>()
            r0.f2809 = r1
            r0.f2810 = r2
            r0.f2821 = r3
            r0.f2813 = r4
            r0.f2822 = r5
            r0.f2820 = r6
            r0.f2816 = r7
            r0.f2815 = r8
            r0.f2819 = r9
            r0.f2824 = r10
            r0.f2814 = r11
            r0.f2818 = r12
            r0.f2823 = r14
            r1 = r16
            r0.f2811 = r1
            r1 = r17
            r0.f2812 = r1
            r1 = 200(0xc8, float:2.8E-43)
            r2 = 0
            if (r1 > r4) goto L2f
            r1 = 300(0x12c, float:4.2E-43)
            if (r4 >= r1) goto L2f
            r2 = 1
        L2f:
            r0.f2817 = r2
            return
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
            r0 = this;
            xhss.ᲇᛷᛱᛸ r0 = r0.f2816
            r0.close()
            return
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Response{protocol="
            r0.<init>(r1)
            xhss.ᲈᛲᛵᛴ r1 = r2.f2810
            r0.append(r1)
            java.lang.String r1 = ", code="
            r0.append(r1)
            int r1 = r2.f2813
            r0.append(r1)
            java.lang.String r1 = ", message="
            r0.append(r1)
            java.lang.String r1 = r2.f2821
            r0.append(r1)
            java.lang.String r1 = ", url="
            r0.append(r1)
            xhss.ᛴᛴᛴᛵ r2 = r2.f2809
            java.lang.Object r2 = r2.f1313
            xhss.ᛷᛶᲁᛵ r2 = (xhss.C0669) r2
            r0.append(r2)
            r2 = 125(0x7d, float:1.75E-43)
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public final xhss.C0270 m1442() {
            r3 = this;
            xhss.ᛳᛵᛴ r0 = new xhss.ᛳᛵᛴ
            r0.<init>()
            r1 = -1
            r0.f1021 = r1
            xhss.ᛵᛷᛳᲀ r1 = xhss.AbstractC1052.f3379
            r0.f1030 = r1
            xhss.ᛶᛵᲇᛸ r1 = xhss.InterfaceC1168.f3777
            r0.f1022 = r1
            xhss.ᛴᛴᛴᛵ r1 = r3.f2809
            r0.f1024 = r1
            xhss.ᲈᛲᛵᛴ r1 = r3.f2810
            r0.f1020 = r1
            int r1 = r3.f2813
            r0.f1021 = r1
            java.lang.String r1 = r3.f2821
            r0.f1031 = r1
            xhss.ᛵᛲᛸᛲ r1 = r3.f2822
            r0.f1023 = r1
            xhss.ᲁᛸᛱᛵ r1 = r3.f2820
            xhss.ᛴᲈᛱᲁ r1 = xhss.AbstractC0694.m1209(r1)
            r0.f1032 = r1
            xhss.ᲇᛷᛱᛸ r1 = r3.f2816
            r0.f1030 = r1
            xhss.ᛳᛵᛲᲁ r1 = r3.f2815
            r0.f1027 = r1
            xhss.ᲀᛶᛷᲁ r1 = r3.f2819
            r0.f1026 = r1
            xhss.ᲀᛶᛷᲁ r1 = r3.f2824
            r0.f1029 = r1
            xhss.ᲀᛶᛷᲁ r1 = r3.f2814
            r0.f1034 = r1
            long r1 = r3.f2818
            r0.f1025 = r1
            long r1 = r3.f2823
            r0.f1028 = r1
            xhss.ᲇᛸᛵᛴ r1 = r3.f2811
            r0.f1033 = r1
            xhss.ᲈᛸᲇᛶ r3 = r3.f2812
            r0.f1022 = r3
            return r0
    }
}
