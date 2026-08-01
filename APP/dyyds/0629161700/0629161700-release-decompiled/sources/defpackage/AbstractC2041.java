package defpackage;

/* JADX INFO: renamed from: ᲇᛴᛸᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2041 implements java.lang.Cloneable {

    /* JADX INFO: renamed from: ᛱᛳᛲᛸ, reason: contains not printable characters */
    public boolean f8789;

    /* JADX INFO: renamed from: ᛲᛲᛵ, reason: contains not printable characters */
    public defpackage.InterfaceC1711 f8790;

    /* JADX INFO: renamed from: ᛲᛴᛱᛶ, reason: contains not printable characters */
    public boolean f8791;

    /* JADX INFO: renamed from: ᛲᛴᲇᛳ, reason: contains not printable characters */
    public int f8792;

    /* JADX INFO: renamed from: ᛴᛸᲀ, reason: contains not printable characters */
    public java.lang.Class f8793;

    /* JADX INFO: renamed from: ᛴᛸᲈᲈ, reason: contains not printable characters */
    public boolean f8794;

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public defpackage.EnumC1307 f8795;

    /* JADX INFO: renamed from: ᛶᛷᛱᲀ, reason: contains not printable characters */
    public defpackage.C0533 f8796;

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public defpackage.C1506 f8797;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public int f8798;

    /* JADX INFO: renamed from: ᛸᛵᛸᛷ, reason: contains not printable characters */
    public int f8799;

    /* JADX INFO: renamed from: ᲀᛳᲀᛵ, reason: contains not printable characters */
    public defpackage.C0619 f8800;

    /* JADX INFO: renamed from: ᲁᲈᲇᲁ, reason: contains not printable characters */
    public boolean f8801;

    /* JADX INFO: renamed from: ᲇᛱᛸᲇ, reason: contains not printable characters */
    public boolean f8802;

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public int f8803;

    /* JADX INFO: renamed from: ᲇᲀᛲᛱ, reason: contains not printable characters */
    public boolean f8804;

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public int f8805;

    public AbstractC2041() {
            r3 = this;
            r3.<init>()
            ᛸᛶᛵᛲ r0 = defpackage.C1506.f6655
            r3.f8797 = r0
            ᛷᛷᛱᛴ r0 = defpackage.EnumC1307.f5774
            r3.f8795 = r0
            r0 = 1
            r3.f8789 = r0
            r1 = -1
            r3.f8792 = r1
            r3.f8799 = r1
            ᲁᛳᛶᛷ r1 = defpackage.C1833.f7987
            r3.f8790 = r1
            ᛳᛸᲁᛶ r1 = new ᛳᛸᲁᛶ
            r1.<init>()
            r3.f8796 = r1
            ᛴᛱᲇᛵ r1 = new ᛴᛱᲇᛵ
            r2 = 0
            r1.<init>(r2)
            r3.f8800 = r1
            java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
            r3.f8793 = r1
            r3.f8802 = r0
            return
    }

    /* JADX INFO: renamed from: ᛱᛳᛲᛸ, reason: contains not printable characters */
    public static boolean m3432(int r0, int r1) {
            r0 = r0 & r1
            if (r0 == 0) goto L5
            r0 = 1
            return r0
        L5:
            r0 = 0
            return r0
    }

    public /* bridge */ /* synthetic */ java.lang.Object clone() {
            r0 = this;
            ᲇᛴᛸᲇ r0 = r0.mo3092()
            return r0
    }

    public boolean equals(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof defpackage.AbstractC2041
            if (r0 == 0) goto Lb
            ᲇᛴᛸᲇ r2 = (defpackage.AbstractC2041) r2
            boolean r1 = r1.m3449(r2)
            return r1
        Lb:
            r1 = 0
            return r1
    }

    public int hashCode() {
            r4 = this;
            r0 = 17
            r1 = 1065353216(0x3f800000, float:1.0)
            int r1 = java.lang.Float.floatToIntBits(r1)
            int r0 = defpackage.AbstractC1754.m3160(r1, r0)
            int r1 = r4.f8803
            int r0 = defpackage.AbstractC1754.m3160(r1, r0)
            r1 = 0
            int r0 = defpackage.AbstractC1754.m3155(r0, r1)
            int r2 = r4.f8805
            int r0 = defpackage.AbstractC1754.m3160(r2, r0)
            int r0 = defpackage.AbstractC1754.m3155(r0, r1)
            r2 = 0
            int r0 = defpackage.AbstractC1754.m3160(r2, r0)
            int r0 = defpackage.AbstractC1754.m3155(r0, r1)
            boolean r3 = r4.f8789
            int r0 = defpackage.AbstractC1754.m3160(r3, r0)
            int r3 = r4.f8792
            int r0 = defpackage.AbstractC1754.m3160(r3, r0)
            int r3 = r4.f8799
            int r0 = defpackage.AbstractC1754.m3160(r3, r0)
            boolean r3 = r4.f8791
            int r0 = defpackage.AbstractC1754.m3160(r3, r0)
            r3 = 1
            int r0 = defpackage.AbstractC1754.m3160(r3, r0)
            int r0 = defpackage.AbstractC1754.m3160(r2, r0)
            int r0 = defpackage.AbstractC1754.m3160(r2, r0)
            ᛸᛶᛵᛲ r2 = r4.f8797
            int r0 = defpackage.AbstractC1754.m3155(r0, r2)
            ᛷᛷᛱᛴ r2 = r4.f8795
            int r0 = defpackage.AbstractC1754.m3155(r0, r2)
            ᛳᛸᲁᛶ r2 = r4.f8796
            int r0 = defpackage.AbstractC1754.m3155(r0, r2)
            ᛴᛱᲇᛵ r2 = r4.f8800
            int r0 = defpackage.AbstractC1754.m3155(r0, r2)
            java.lang.Class r2 = r4.f8793
            int r0 = defpackage.AbstractC1754.m3155(r0, r2)
            ᲀᛷᛶᲈ r4 = r4.f8790
            int r4 = defpackage.AbstractC1754.m3155(r0, r4)
            int r4 = defpackage.AbstractC1754.m3155(r4, r1)
            return r4
    }

    /* JADX INFO: renamed from: ᛲᛲᛵ, reason: contains not printable characters */
    public final defpackage.AbstractC2041 m3433() {
            r1 = this;
            boolean r0 = r1.f8801
            if (r0 == 0) goto Ld
            ᲇᛴᛸᲇ r1 = r1.mo3092()
            ᲇᛴᛸᲇ r1 = r1.m3433()
            return r1
        Ld:
            r0 = 1711800725(0x66080195, float:1.6056776E23)
            r1.f8805 = r0
            int r0 = r1.f8798
            r0 = r0 | 128(0x80, float:1.8E-43)
            r0 = r0 & (-65)
            r1.f8798 = r0
            r1.m3440()
            return r1
    }

    /* JADX INFO: renamed from: ᛲᛴᛱᛶ, reason: contains not printable characters */
    public final defpackage.AbstractC2041 m3434() {
            r1 = this;
            boolean r0 = r1.f8801
            if (r0 == 0) goto Ld
            ᲇᛴᛸᲇ r1 = r1.mo3092()
            ᲇᛴᛸᲇ r1 = r1.m3434()
            return r1
        Ld:
            ᛷᛷᛱᛴ r0 = defpackage.EnumC1307.f5777
            r1.f8795 = r0
            int r0 = r1.f8798
            r0 = r0 | 8
            r1.f8798 = r0
            r1.m3440()
            return r1
    }

    /* JADX INFO: renamed from: ᛲᛴᲇᛳ, reason: contains not printable characters */
    public final defpackage.AbstractC2041 m3435(defpackage.C0521 r2, defpackage.AbstractC1552 r3) {
            r1 = this;
            boolean r0 = r1.f8801
            if (r0 == 0) goto Ld
            ᲇᛴᛸᲇ r1 = r1.mo3092()
            ᲇᛴᛸᲇ r1 = r1.m3435(r2, r3)
            return r1
        Ld:
            ᛵᲇᛳᲇ r0 = defpackage.C0521.f2575
            r1.m3443(r0, r2)
            r2 = 0
            ᲇᛴᛸᲇ r1 = r1.m3445(r3, r2)
            return r1
    }

    /* JADX INFO: renamed from: ᛳᲁᲈᲁ, reason: contains not printable characters */
    public final defpackage.AbstractC2041 m3436() {
            r2 = this;
            boolean r0 = r2.f8801
            if (r0 == 0) goto Ld
            ᲇᛴᛸᲇ r2 = r2.mo3092()
            ᲇᛴᛸᲇ r2 = r2.m3436()
            return r2
        Ld:
            r0 = 1
            r2.f8794 = r0
            int r0 = r2.f8798
            r1 = 1048576(0x100000, float:1.469368E-39)
            r0 = r0 | r1
            r2.f8798 = r0
            r2.m3440()
            return r2
    }

    /* JADX INFO: renamed from: ᛴᛸᲀ, reason: contains not printable characters */
    public final defpackage.AbstractC2041 m3437(defpackage.C0921 r2) {
            r1 = this;
            boolean r0 = r1.f8801
            if (r0 == 0) goto Ld
            ᲇᛴᛸᲇ r1 = r1.mo3092()
            ᲇᛴᛸᲇ r1 = r1.m3437(r2)
            return r1
        Ld:
            r1.f8790 = r2
            int r2 = r1.f8798
            r2 = r2 | 1024(0x400, float:1.435E-42)
            r1.f8798 = r2
            r1.m3440()
            return r1
    }

    /* JADX INFO: renamed from: ᛴᛸᲈᲈ, reason: contains not printable characters */
    public final defpackage.AbstractC2041 m3438(java.lang.Class r2, defpackage.InterfaceC0660 r3, boolean r4) {
            r1 = this;
            boolean r0 = r1.f8801
            if (r0 == 0) goto Ld
            ᲇᛴᛸᲇ r1 = r1.mo3092()
            ᲇᛴᛸᲇ r1 = r1.m3438(r2, r3, r4)
            return r1
        Ld:
            ᛴᛱᲇᛵ r0 = r1.f8800
            r0.put(r2, r3)
            int r2 = r1.f8798
            r3 = 67584(0x10800, float:9.4705E-41)
            r3 = r3 | r2
            r1.f8798 = r3
            r3 = 0
            r1.f8802 = r3
            if (r4 == 0) goto L28
            r3 = 198656(0x30800, float:2.78376E-40)
            r2 = r2 | r3
            r1.f8798 = r2
            r2 = 1
            r1.f8791 = r2
        L28:
            r1.m3440()
            return r1
    }

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public final defpackage.AbstractC2041 m3439(defpackage.C1506 r2) {
            r1 = this;
            boolean r0 = r1.f8801
            if (r0 == 0) goto Ld
            ᲇᛴᛸᲇ r1 = r1.mo3092()
            ᲇᛴᛸᲇ r1 = r1.m3439(r2)
            return r1
        Ld:
            r1.f8797 = r2
            int r2 = r1.f8798
            r2 = r2 | 4
            r1.f8798 = r2
            r1.m3440()
            return r1
    }

    /* JADX INFO: renamed from: ᛶᛷᛱᲀ, reason: contains not printable characters */
    public final void m3440() {
            r0 = this;
            boolean r0 = r0.f8804
            if (r0 != 0) goto L5
            return
        L5:
            java.lang.String r0 = "You cannot modify locked T, consider clone()"
            defpackage.C2264.m3676(r0)
            return
    }

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final defpackage.AbstractC2041 m3441(java.lang.Class r2) {
            r1 = this;
            boolean r0 = r1.f8801
            if (r0 == 0) goto Ld
            ᲇᛴᛸᲇ r1 = r1.mo3092()
            ᲇᛴᛸᲇ r1 = r1.m3441(r2)
            return r1
        Ld:
            r1.f8793 = r2
            int r2 = r1.f8798
            r2 = r2 | 4096(0x1000, float:5.74E-42)
            r1.f8798 = r2
            r1.m3440()
            return r1
    }

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ */
    public defpackage.AbstractC2041 mo3092() {
            r3 = this;
            java.lang.Object r0 = super.clone()     // Catch: java.lang.CloneNotSupportedException -> L28
            ᲇᛴᛸᲇ r0 = (defpackage.AbstractC2041) r0     // Catch: java.lang.CloneNotSupportedException -> L28
            ᛳᛸᲁᛶ r1 = new ᛳᛸᲁᛶ     // Catch: java.lang.CloneNotSupportedException -> L28
            r1.<init>()     // Catch: java.lang.CloneNotSupportedException -> L28
            r0.f8796 = r1     // Catch: java.lang.CloneNotSupportedException -> L28
            ᛳᛸᲁᛶ r2 = r3.f8796     // Catch: java.lang.CloneNotSupportedException -> L28
            ᛴᛱᲇᛵ r1 = r1.f2651     // Catch: java.lang.CloneNotSupportedException -> L28
            ᛴᛱᲇᛵ r2 = r2.f2651     // Catch: java.lang.CloneNotSupportedException -> L28
            r1.mo1423(r2)     // Catch: java.lang.CloneNotSupportedException -> L28
            ᛴᛱᲇᛵ r1 = new ᛴᛱᲇᛵ     // Catch: java.lang.CloneNotSupportedException -> L28
            r2 = 0
            r1.<init>(r2)     // Catch: java.lang.CloneNotSupportedException -> L28
            r0.f8800 = r1     // Catch: java.lang.CloneNotSupportedException -> L28
            ᛴᛱᲇᛵ r3 = r3.f8800     // Catch: java.lang.CloneNotSupportedException -> L28
            r1.putAll(r3)     // Catch: java.lang.CloneNotSupportedException -> L28
            r0.f8804 = r2     // Catch: java.lang.CloneNotSupportedException -> L28
            r0.f8801 = r2     // Catch: java.lang.CloneNotSupportedException -> L28
            return r0
        L28:
            r3 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r3)
            throw r0
    }

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ */
    public defpackage.AbstractC2041 mo3093(defpackage.AbstractC2041 r4) {
            r3 = this;
            boolean r0 = r3.f8801
            if (r0 == 0) goto Ld
            ᲇᛴᛸᲇ r3 = r3.mo3092()
            ᲇᛴᛸᲇ r3 = r3.mo3093(r4)
            return r3
        Ld:
            int r0 = r4.f8798
            int r0 = r4.f8798
            r1 = 1048576(0x100000, float:1.469368E-39)
            boolean r0 = m3432(r0, r1)
            if (r0 == 0) goto L1d
            boolean r0 = r4.f8794
            r3.f8794 = r0
        L1d:
            int r0 = r4.f8798
            r1 = 4
            boolean r0 = m3432(r0, r1)
            if (r0 == 0) goto L2a
            ᛸᛶᛵᛲ r0 = r4.f8797
            r3.f8797 = r0
        L2a:
            int r0 = r4.f8798
            r1 = 8
            boolean r0 = m3432(r0, r1)
            if (r0 == 0) goto L38
            ᛷᛷᛱᛴ r0 = r4.f8795
            r3.f8795 = r0
        L38:
            int r0 = r4.f8798
            r1 = 16
            boolean r0 = m3432(r0, r1)
            r1 = 0
            if (r0 == 0) goto L4b
            r3.f8803 = r1
            int r0 = r3.f8798
            r0 = r0 & (-33)
            r3.f8798 = r0
        L4b:
            int r0 = r4.f8798
            r2 = 32
            boolean r0 = m3432(r0, r2)
            if (r0 == 0) goto L5f
            int r0 = r4.f8803
            r3.f8803 = r0
            int r0 = r3.f8798
            r0 = r0 & (-17)
            r3.f8798 = r0
        L5f:
            int r0 = r4.f8798
            r2 = 64
            boolean r0 = m3432(r0, r2)
            if (r0 == 0) goto L71
            r3.f8805 = r1
            int r0 = r3.f8798
            r0 = r0 & (-129(0xffffffffffffff7f, float:NaN))
            r3.f8798 = r0
        L71:
            int r0 = r4.f8798
            r1 = 128(0x80, float:1.8E-43)
            boolean r0 = m3432(r0, r1)
            if (r0 == 0) goto L85
            int r0 = r4.f8805
            r3.f8805 = r0
            int r0 = r3.f8798
            r0 = r0 & (-65)
            r3.f8798 = r0
        L85:
            int r0 = r4.f8798
            r1 = 256(0x100, float:3.59E-43)
            boolean r0 = m3432(r0, r1)
            if (r0 == 0) goto L93
            boolean r0 = r4.f8789
            r3.f8789 = r0
        L93:
            int r0 = r4.f8798
            r1 = 512(0x200, float:7.17E-43)
            boolean r0 = m3432(r0, r1)
            if (r0 == 0) goto La5
            int r0 = r4.f8799
            r3.f8799 = r0
            int r0 = r4.f8792
            r3.f8792 = r0
        La5:
            int r0 = r4.f8798
            r1 = 1024(0x400, float:1.435E-42)
            boolean r0 = m3432(r0, r1)
            if (r0 == 0) goto Lb3
            ᲀᛷᛶᲈ r0 = r4.f8790
            r3.f8790 = r0
        Lb3:
            int r0 = r4.f8798
            r1 = 4096(0x1000, float:5.74E-42)
            boolean r0 = m3432(r0, r1)
            if (r0 == 0) goto Lc1
            java.lang.Class r0 = r4.f8793
            r3.f8793 = r0
        Lc1:
            int r0 = r4.f8798
            r1 = 8192(0x2000, float:1.148E-41)
            boolean r0 = m3432(r0, r1)
            if (r0 == 0) goto Ld1
            int r0 = r3.f8798
            r0 = r0 & (-16385(0xffffffffffffbfff, float:NaN))
            r3.f8798 = r0
        Ld1:
            int r0 = r4.f8798
            r1 = 16384(0x4000, float:2.2959E-41)
            boolean r0 = m3432(r0, r1)
            if (r0 == 0) goto Le1
            int r0 = r3.f8798
            r0 = r0 & (-8193(0xffffffffffffdfff, float:NaN))
            r3.f8798 = r0
        Le1:
            int r0 = r4.f8798
            r1 = 131072(0x20000, float:1.83671E-40)
            boolean r0 = m3432(r0, r1)
            if (r0 == 0) goto Lef
            boolean r0 = r4.f8791
            r3.f8791 = r0
        Lef:
            int r0 = r4.f8798
            r1 = 2048(0x800, float:2.87E-42)
            boolean r0 = m3432(r0, r1)
            if (r0 == 0) goto L104
            ᛴᛱᲇᛵ r0 = r3.f8800
            ᛴᛱᲇᛵ r1 = r4.f8800
            r0.putAll(r1)
            boolean r0 = r4.f8802
            r3.f8802 = r0
        L104:
            int r0 = r3.f8798
            int r1 = r4.f8798
            r0 = r0 | r1
            r3.f8798 = r0
            ᛳᛸᲁᛶ r0 = r3.f8796
            ᛳᛸᲁᛶ r4 = r4.f8796
            ᛴᛱᲇᛵ r0 = r0.f2651
            ᛴᛱᲇᛵ r4 = r4.f2651
            r0.mo1423(r4)
            r3.m3440()
            return r3
    }

    /* JADX INFO: renamed from: ᛸᛵᛸᛷ, reason: contains not printable characters */
    public final defpackage.AbstractC2041 m3442(int r2, int r3) {
            r1 = this;
            boolean r0 = r1.f8801
            if (r0 == 0) goto Ld
            ᲇᛴᛸᲇ r1 = r1.mo3092()
            ᲇᛴᛸᲇ r1 = r1.m3442(r2, r3)
            return r1
        Ld:
            r1.f8799 = r2
            r1.f8792 = r3
            int r2 = r1.f8798
            r2 = r2 | 512(0x200, float:7.17E-43)
            r1.f8798 = r2
            r1.m3440()
            return r1
    }

    /* JADX INFO: renamed from: ᲀᛳᲀᛵ, reason: contains not printable characters */
    public final defpackage.AbstractC2041 m3443(defpackage.C0980 r2, java.lang.Object r3) {
            r1 = this;
            boolean r0 = r1.f8801
            if (r0 == 0) goto Ld
            ᲇᛴᛸᲇ r1 = r1.mo3092()
            ᲇᛴᛸᲇ r1 = r1.m3443(r2, r3)
            return r1
        Ld:
            defpackage.C0292.m948(r2)
            ᛳᛸᲁᛶ r0 = r1.f8796
            ᛴᛱᲇᛵ r0 = r0.f2651
            r0.put(r2, r3)
            r1.m3440()
            return r1
    }

    /* JADX INFO: renamed from: ᲁᲈᲇᲁ, reason: contains not printable characters */
    public final defpackage.AbstractC2041 m3444(defpackage.C0521 r2, defpackage.AbstractC1552 r3) {
            r1 = this;
            boolean r0 = r1.f8801
            if (r0 == 0) goto Ld
            ᲇᛴᛸᲇ r1 = r1.mo3092()
            ᲇᛴᛸᲇ r1 = r1.m3444(r2, r3)
            return r1
        Ld:
            ᛵᲇᛳᲇ r0 = defpackage.C0521.f2575
            r1.m3443(r0, r2)
            r2 = 1
            ᲇᛴᛸᲇ r1 = r1.m3445(r3, r2)
            return r1
    }

    /* JADX INFO: renamed from: ᲇᛱᛸᲇ, reason: contains not printable characters */
    public final defpackage.AbstractC2041 m3445(defpackage.InterfaceC0660 r3, boolean r4) {
            r2 = this;
            boolean r0 = r2.f8801
            if (r0 == 0) goto Ld
            ᲇᛴᛸᲇ r2 = r2.mo3092()
            ᲇᛴᛸᲇ r2 = r2.m3445(r3, r4)
            return r2
        Ld:
            ᲀᲀᛸ r0 = new ᲀᲀᛸ
            r0.<init>(r3, r4)
            java.lang.Class<android.graphics.Bitmap> r1 = android.graphics.Bitmap.class
            r2.m3438(r1, r3, r4)
            java.lang.Class<android.graphics.drawable.Drawable> r1 = android.graphics.drawable.Drawable.class
            r2.m3438(r1, r0, r4)
            java.lang.Class<android.graphics.drawable.BitmapDrawable> r1 = android.graphics.drawable.BitmapDrawable.class
            r2.m3438(r1, r0, r4)
            ᲈᲈᲁᛵ r0 = new ᲈᲈᲁᛵ
            r0.<init>(r3)
            java.lang.Class<ᛶᛴᲁᛱ> r3 = defpackage.C1064.class
            r2.m3438(r3, r0, r4)
            r2.m3440()
            return r2
    }

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final defpackage.AbstractC2041 m3446() {
            r2 = this;
            ᛳᛸᛲᛲ r0 = defpackage.C0521.f2572
            ᲁᲁᛸᛶ r1 = new ᲁᲁᛸᛶ
            r1.<init>()
            ᲇᛴᛸᲇ r2 = r2.m3444(r0, r1)
            return r2
    }

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public final defpackage.AbstractC2041 m3447() {
            r1 = this;
            boolean r0 = r1.f8801
            if (r0 == 0) goto Ld
            ᲇᛴᛸᲇ r1 = r1.mo3092()
            ᲇᛴᛸᲇ r1 = r1.m3447()
            return r1
        Ld:
            r0 = 1711800725(0x66080195, float:1.6056776E23)
            r1.f8803 = r0
            int r0 = r1.f8798
            r0 = r0 | 32
            r0 = r0 & (-17)
            r1.f8798 = r0
            r1.m3440()
            return r1
    }

    /* JADX INFO: renamed from: ᲇᲀᛲᛱ, reason: contains not printable characters */
    public final defpackage.AbstractC2041 m3448() {
            r1 = this;
            boolean r0 = r1.f8801
            if (r0 == 0) goto Ld
            ᲇᛴᛸᲇ r1 = r1.mo3092()
            ᲇᛴᛸᲇ r1 = r1.m3448()
            return r1
        Ld:
            r0 = 0
            r1.f8789 = r0
            int r0 = r1.f8798
            r0 = r0 | 256(0x100, float:3.59E-43)
            r1.f8798 = r0
            r1.m3440()
            return r1
    }

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public final boolean m3449(defpackage.AbstractC2041 r3) {
            r2 = this;
            r3.getClass()
            r0 = 1065353216(0x3f800000, float:1.0)
            int r0 = java.lang.Float.compare(r0, r0)
            if (r0 != 0) goto L69
            int r0 = r2.f8803
            int r1 = r3.f8803
            if (r0 != r1) goto L69
            int r0 = r2.f8805
            int r1 = r3.f8805
            if (r0 != r1) goto L69
            boolean r0 = r2.f8789
            boolean r1 = r3.f8789
            if (r0 != r1) goto L69
            int r0 = r2.f8792
            int r1 = r3.f8792
            if (r0 != r1) goto L69
            int r0 = r2.f8799
            int r1 = r3.f8799
            if (r0 != r1) goto L69
            boolean r0 = r2.f8791
            boolean r1 = r3.f8791
            if (r0 != r1) goto L69
            ᛸᛶᛵᛲ r0 = r2.f8797
            ᛸᛶᛵᛲ r1 = r3.f8797
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L69
            ᛷᛷᛱᛴ r0 = r2.f8795
            ᛷᛷᛱᛴ r1 = r3.f8795
            if (r0 != r1) goto L69
            ᛳᛸᲁᛶ r0 = r2.f8796
            ᛳᛸᲁᛶ r1 = r3.f8796
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L69
            ᛴᛱᲇᛵ r0 = r2.f8800
            ᛴᛱᲇᛵ r1 = r3.f8800
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L69
            java.lang.Class r0 = r2.f8793
            java.lang.Class r1 = r3.f8793
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L69
            ᲀᛷᛶᲈ r2 = r2.f8790
            ᲀᛷᛶᲈ r3 = r3.f8790
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L69
            r2 = 1
            return r2
        L69:
            r2 = 0
            return r2
    }
}
