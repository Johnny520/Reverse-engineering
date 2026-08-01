package p000;

/* JADX INFO: renamed from: rz */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C0779rz extends p000.AbstractC1099 implements p000.InterfaceC0742qz, java.io.Serializable {

    /* JADX INFO: renamed from: ε */
    public final java.lang.Enum[] f9634;

    public C0779rz(java.lang.Enum[] r1) {
            r0 = this;
            r1.getClass()
            r0.<init>()
            r0.f9634 = r1
            return
    }

    @Override // p000.AbstractC1089, java.util.Collection, java.util.List
    public final boolean contains(java.lang.Object r3) {
            r2 = this;
            boolean r0 = r3 instanceof java.lang.Enum
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            java.lang.Enum r3 = (java.lang.Enum) r3
            java.lang.Enum[] r2 = r2.f9634
            int r0 = r3.ordinal()
            java.lang.Object r2 = p000.AbstractC0312g7.m2253(r0, r2)
            java.lang.Enum r2 = (java.lang.Enum) r2
            if (r2 != r3) goto L18
            r2 = 1
            return r2
        L18:
            return r1
    }

    @Override // java.util.List
    public final java.lang.Object get(int r3) {
            r2 = this;
            java.lang.Enum[] r2 = r2.f9634
            int r0 = r2.length
            if (r3 < 0) goto La
            if (r3 >= r0) goto La
            r2 = r2[r3]
            return r2
        La:
            java.lang.String r2 = "index: "
            java.lang.String r1 = ", size: "
            java.lang.String r2 = p000.AbstractC0602nx.m4125(r3, r0, r2, r1)
            p000.C1080.m7269(r2)
            r2 = 0
            return r2
    }

    @Override // p000.AbstractC1099, java.util.List
    public final int indexOf(java.lang.Object r3) {
            r2 = this;
            boolean r0 = r3 instanceof java.lang.Enum
            r1 = -1
            if (r0 != 0) goto L6
            return r1
        L6:
            java.lang.Enum r3 = (java.lang.Enum) r3
            int r0 = r3.ordinal()
            java.lang.Enum[] r2 = r2.f9634
            java.lang.Object r2 = p000.AbstractC0312g7.m2253(r0, r2)
            java.lang.Enum r2 = (java.lang.Enum) r2
            if (r2 != r3) goto L17
            return r0
        L17:
            return r1
    }

    @Override // p000.AbstractC1099, java.util.List
    public final int lastIndexOf(java.lang.Object r3) {
            r2 = this;
            boolean r0 = r3 instanceof java.lang.Enum
            r1 = -1
            if (r0 != 0) goto L6
            return r1
        L6:
            java.lang.Enum r3 = (java.lang.Enum) r3
            int r0 = r3.ordinal()
            java.lang.Enum[] r2 = r2.f9634
            java.lang.Object r2 = p000.AbstractC0312g7.m2253(r0, r2)
            java.lang.Enum r2 = (java.lang.Enum) r2
            if (r2 != r3) goto L17
            return r0
        L17:
            return r1
    }

    @Override // p000.AbstractC1089
    /* JADX INFO: renamed from: α */
    public final int mo2340() {
            r0 = this;
            java.lang.Enum[] r0 = r0.f9634
            int r0 = r0.length
            return r0
    }
}
