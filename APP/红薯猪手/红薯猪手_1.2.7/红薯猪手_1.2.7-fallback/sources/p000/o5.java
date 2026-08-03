package p000;

/* JADX INFO: loaded from: classes.dex */
public final class o5 {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public final p000.p1 f849;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public final p000.o1 f850;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final java.lang.String f851;

    /* JADX INFO: renamed from: ۥ۟۠, reason: contains not printable characters */
    public final java.lang.Boolean f852;

    /* JADX INFO: renamed from: ۥ۟ۡ, reason: contains not printable characters */
    public java.lang.Integer f853;

    /* JADX INFO: renamed from: ۥ۟ۢ, reason: contains not printable characters */
    public final p000.wb f854;

    public o5(p000.p1 r1, p000.o1 r2, java.lang.String r3, java.lang.Boolean r4, java.lang.Integer r5, p000.wb r6) {
            r0 = this;
            r0.<init>()
            r0.f849 = r1
            r0.f850 = r2
            r0.f851 = r3
            r0.f852 = r4
            r0.f853 = r5
            r0.f854 = r6
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof p000.o5
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            ۟.o5 r5 = (p000.o5) r5
            ۟.p1 r1 = r4.f849
            ۟.p1 r3 = r5.f849
            boolean r1 = p000.h4.m185(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            ۟.o1 r1 = r4.f850
            ۟.o1 r3 = r5.f850
            boolean r1 = p000.h4.m185(r1, r3)
            if (r1 != 0) goto L22
            return r2
        L22:
            java.lang.String r1 = r4.f851
            java.lang.String r3 = r5.f851
            boolean r1 = p000.h4.m185(r1, r3)
            if (r1 != 0) goto L2d
            return r2
        L2d:
            java.lang.Boolean r1 = r4.f852
            java.lang.Boolean r3 = r5.f852
            boolean r1 = p000.h4.m185(r1, r3)
            if (r1 != 0) goto L38
            return r2
        L38:
            java.lang.Integer r1 = r4.f853
            java.lang.Integer r3 = r5.f853
            boolean r1 = p000.h4.m185(r1, r3)
            if (r1 != 0) goto L43
            return r2
        L43:
            ۟.wb r1 = r4.f854
            ۟.wb r5 = r5.f854
            boolean r5 = p000.h4.m185(r1, r5)
            if (r5 != 0) goto L4e
            return r2
        L4e:
            return r0
    }

    public final int hashCode() {
            r3 = this;
            ۟.p1 r0 = r3.f849
            r1 = 0
            if (r0 != 0) goto L7
            r0 = r1
            goto Lb
        L7:
            int r0 = r0.hashCode()
        Lb:
            int r0 = r0 * 31
            ۟.o1 r2 = r3.f850
            if (r2 != 0) goto L13
            r2 = r1
            goto L17
        L13:
            int r2 = r2.hashCode()
        L17:
            int r0 = r0 + r2
            int r0 = r0 * 31
            java.lang.String r2 = r3.f851
            if (r2 != 0) goto L20
            r2 = r1
            goto L24
        L20:
            int r2 = r2.hashCode()
        L24:
            int r0 = r0 + r2
            int r0 = r0 * 31
            java.lang.Boolean r2 = r3.f852
            if (r2 != 0) goto L2d
            r2 = r1
            goto L31
        L2d:
            int r2 = r2.hashCode()
        L31:
            int r0 = r0 + r2
            int r0 = r0 * 31
            java.lang.Integer r2 = r3.f853
            if (r2 != 0) goto L3a
            r2 = r1
            goto L3e
        L3a:
            int r2 = r2.hashCode()
        L3e:
            int r0 = r0 + r2
            int r0 = r0 * 31
            ۟.wb r2 = r3.f854
            if (r2 != 0) goto L46
            goto L4a
        L46:
            int r1 = r2.hashCode()
        L4a:
            int r0 = r0 + r1
            return r0
    }

    public final java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = super.toString()
            return r0
    }
}
