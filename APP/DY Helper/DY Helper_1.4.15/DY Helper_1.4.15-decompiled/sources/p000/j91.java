package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
final class j91 extends p000.v01 {

    /* JADX INFO: renamed from: α */
    public final p000.C0070ba f5380;

    /* JADX INFO: renamed from: β */
    public final p000.C0381i2 f5381;

    public j91(p000.C0070ba r1, p000.C0381i2 r2) {
            r0 = this;
            r0.<init>()
            r0.f5380 = r1
            r0.f5381 = r2
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L33
        L3:
            boolean r0 = r3 instanceof p000.j91
            if (r0 != 0) goto L8
            goto L31
        L8:
            j91 r3 = (p000.j91) r3
            ba r0 = r2.f5380
            ba r1 = r3.f5380
            boolean r0 = p000.ln0.m3626(r0, r1)
            if (r0 != 0) goto L15
            goto L31
        L15:
            aa r0 = p000.C0966x.f11941
            boolean r0 = r0.equals(r0)
            if (r0 != 0) goto L1e
            goto L31
        L1e:
            i2 r2 = r2.f5381
            i2 r3 = r3.f5381
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L29
            goto L31
        L29:
            r2 = 1065353216(0x3f800000, float:1.0)
            int r2 = java.lang.Float.compare(r2, r2)
            if (r2 == 0) goto L33
        L31:
            r2 = 0
            return r2
        L33:
            r2 = 1
            return r2
    }

    public final int hashCode() {
            r4 = this;
            ba r0 = r4.f5380
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            r2 = 1
            int r0 = p000.lz1.m3678(r0, r1, r2)
            r2 = 0
            int r3 = java.lang.Float.hashCode(r2)
            int r3 = r3 * r1
            int r2 = java.lang.Float.hashCode(r2)
            int r2 = r2 + r3
            int r2 = r2 + r0
            int r2 = r2 * r1
            i2 r4 = r4.f5381
            int r4 = r4.hashCode()
            int r4 = r4 + r2
            int r4 = r4 * r1
            r0 = 1065353216(0x3f800000, float:1.0)
            int r4 = p000.lz1.m3676(r0, r4, r1)
            return r4
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "PainterElement(painter="
            r0.<init>(r1)
            ba r1 = r2.f5380
            r0.append(r1)
            java.lang.String r1 = ", sizeToIntrinsics=true, alignment="
            r0.append(r1)
            aa r1 = p000.C0966x.f11941
            r0.append(r1)
            java.lang.String r1 = ", contentScale="
            r0.append(r1)
            i2 r2 = r2.f5381
            r0.append(r2)
            java.lang.String r2 = ", alpha=1.0, colorFilter=null)"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }

    @Override // p000.v01
    /* JADX INFO: renamed from: δ */
    public final p000.q01 mo56() {
            r3 = this;
            k91 r0 = new k91
            aa r1 = p000.C0966x.f11941
            r0.<init>()
            ba r2 = r3.f5380
            r0.f5816 = r2
            r2 = 1
            r0.f5817 = r2
            r0.f5818 = r1
            i2 r3 = r3.f5381
            r0.f5819 = r3
            r3 = 1065353216(0x3f800000, float:1.0)
            r0.f5820 = r3
            return r0
    }

    @Override // p000.v01
    /* JADX INFO: renamed from: ε */
    public final void mo57(p000.q01 r8) {
            r7 = this;
            k91 r8 = (p000.k91) r8
            boolean r0 = r8.f5817
            ba r1 = r7.f5380
            r2 = 1
            if (r0 != r2) goto L20
            ba r0 = r8.f5816
            long r3 = r0.f1580
            long r3 = p000.AbstractC0782s1.m5322(r3)
            long r5 = r1.f1580
            long r5 = p000.AbstractC0782s1.m5322(r5)
            boolean r0 = p000.jw1.m2997(r3, r5)
            if (r0 != 0) goto L1e
            goto L20
        L1e:
            r0 = 0
            goto L21
        L20:
            r0 = r2
        L21:
            r8.f5816 = r1
            r8.f5817 = r2
            aa r1 = p000.C0966x.f11941
            r8.f5818 = r1
            i2 r7 = r7.f5381
            r8.f5819 = r7
            r7 = 1065353216(0x3f800000, float:1.0)
            r8.f5820 = r7
            if (r0 == 0) goto L36
            p000.AbstractC0073bd.m847(r8)
        L36:
            p000.AbstractC1021yh.m6865(r8)
            return
    }
}
