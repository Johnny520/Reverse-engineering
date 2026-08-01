package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class pz1 implements p000.InterfaceC0933w3 {

    /* JADX INFO: renamed from: α */
    public final float f8763;

    /* JADX INFO: renamed from: β */
    public final float f8764;

    /* JADX INFO: renamed from: γ */
    public final java.lang.Object f8765;

    public pz1(float r1, float r2, java.lang.Object r3) {
            r0 = this;
            r0.<init>()
            r0.f8763 = r1
            r0.f8764 = r2
            r0.f8765 = r3
            return
    }

    public final boolean equals(java.lang.Object r4) {
            r3 = this;
            boolean r0 = r4 instanceof p000.pz1
            r1 = 0
            if (r0 == 0) goto L23
            pz1 r4 = (p000.pz1) r4
            float r0 = r4.f8763
            float r2 = r3.f8763
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L23
            float r0 = r4.f8764
            float r2 = r3.f8764
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L23
            java.lang.Object r4 = r4.f8765
            java.lang.Object r3 = r3.f8765
            boolean r3 = p000.ln0.m3626(r4, r3)
            if (r3 == 0) goto L23
            r3 = 1
            return r3
        L23:
            return r1
    }

    public final int hashCode() {
            r3 = this;
            java.lang.Object r0 = r3.f8765
            if (r0 == 0) goto L9
            int r0 = r0.hashCode()
            goto La
        L9:
            r0 = 0
        La:
            r1 = 31
            int r0 = r0 * r1
            float r2 = r3.f8763
            int r0 = p000.lz1.m3676(r2, r0, r1)
            float r3 = r3.f8764
            int r3 = java.lang.Float.hashCode(r3)
            int r3 = r3 + r0
            return r3
    }

    @Override // p000.InterfaceC0933w3
    /* JADX INFO: renamed from: α */
    public final p000.n72 mo1841(p000.g62 r9) {
            r8 = this;
            y21 r0 = new y21
            java.lang.Object r1 = r8.f8765
            if (r1 != 0) goto L8
            r9 = 0
            goto L10
        L8:
            a80 r9 = r9.f4262
            java.lang.Object r9 = r9.invoke(r1)
            c4 r9 = (p000.AbstractC0100c4) r9
        L10:
            int r1 = p000.m72.f7009
            float r1 = r8.f8763
            float r8 = r8.f8764
            if (r9 == 0) goto L37
            y21 r2 = new y21
            r2.<init>()
            int r3 = r9.mo28()
            e40[] r4 = new p000.e40[r3]
            r5 = 0
        L24:
            if (r5 >= r3) goto L34
            e40 r6 = new e40
            float r7 = r9.mo27(r5)
            r6.<init>(r1, r8, r7)
            r4[r5] = r6
            int r5 = r5 + 1
            goto L24
        L34:
            r2.f12428 = r4
            goto L3c
        L37:
            l72 r2 = new l72
            r2.<init>(r1, r8)
        L3c:
            r0.<init>()
            i0 r8 = new i0
            r8.<init>(r2)
            r0.f12428 = r8
            return r0
    }
}
