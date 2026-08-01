package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class px1 extends p000.kn0 {

    /* JADX INFO: renamed from: π */
    public final long f8755;

    public px1(long r1) {
            r0 = this;
            r0.<init>()
            r0.f8755 = r1
            return
    }

    public final boolean equals(java.lang.Object r6) {
            r5 = this;
            r0 = 1
            if (r5 != r6) goto L4
            return r0
        L4:
            boolean r1 = r6 instanceof p000.px1
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            px1 r6 = (p000.px1) r6
            long r3 = r6.f8755
            long r5 = r5.f8755
            boolean r5 = p000.C0114ci.m1192(r5, r3)
            if (r5 != 0) goto L17
            return r2
        L17:
            return r0
    }

    public final int hashCode() {
            r2 = this;
            int r0 = p000.C0114ci.f2126
            long r0 = r2.f8755
            int r2 = java.lang.Long.hashCode(r0)
            return r2
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "SolidColor(value="
            r0.<init>(r1)
            long r1 = r3.f8755
            java.lang.String r3 = p000.C0114ci.m1198(r1)
            r0.append(r3)
            r3 = 41
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            return r3
    }

    @Override // p000.kn0
    /* JADX INFO: renamed from: θ */
    public final void mo3381(long r3, p000.C0709q2 r5, float r6) {
            r2 = this;
            r3 = 1065353216(0x3f800000, float:1.0)
            r5.m4712(r3)
            int r3 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            long r0 = r2.f8755
            if (r3 != 0) goto Lc
            goto L15
        Lc:
            float r2 = p000.C0114ci.m1193(r0)
            float r2 = r2 * r6
            long r0 = p000.C0114ci.m1191(r0, r2)
        L15:
            r5.m4714(r0)
            java.lang.Object r2 = r5.f8801
            android.graphics.Shader r2 = (android.graphics.Shader) r2
            if (r2 == 0) goto L22
            r2 = 0
            r5.m4715(r2)
        L22:
            return
    }
}
