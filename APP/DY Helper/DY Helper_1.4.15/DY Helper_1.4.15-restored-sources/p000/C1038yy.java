package p000;

/* JADX INFO: renamed from: yy */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C1038yy extends p000.AbstractC0073bd {

    /* JADX INFO: renamed from: υ */
    public final android.widget.TextView f12871;

    /* JADX INFO: renamed from: φ */
    public final p000.C0778ry f12872;

    /* JADX INFO: renamed from: χ */
    public boolean f12873;

    public C1038yy(android.widget.TextView r2) {
            r1 = this;
            r1.<init>()
            r1.f12871 = r2
            r0 = 1
            r1.f12873 = r0
            ry r0 = new ry
            r0.<init>(r2)
            r1.f12872 = r0
            return
    }

    @Override // p000.AbstractC0073bd
    /* JADX INFO: renamed from: Γ */
    public final boolean mo902() {
            r0 = this;
            boolean r0 = r0.f12873
            return r0
    }

    @Override // p000.AbstractC0073bd
    /* JADX INFO: renamed from: Ω */
    public final void mo903(boolean r2) {
            r1 = this;
            if (r2 == 0) goto Lf
            android.widget.TextView r2 = r1.f12871
            android.text.method.TransformationMethod r0 = r2.getTransformationMethod()
            android.text.method.TransformationMethod r1 = r1.mo907(r0)
            r2.setTransformationMethod(r1)
        Lf:
            return
    }

    @Override // p000.AbstractC0073bd
    /* JADX INFO: renamed from: υ */
    public final android.text.InputFilter[] mo905(android.text.InputFilter[] r7) {
            r6 = this;
            boolean r0 = r6.f12873
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L3e
            android.util.SparseArray r6 = new android.util.SparseArray
            r6.<init>(r2)
            r0 = r1
        Lc:
            int r2 = r7.length
            if (r0 >= r2) goto L1b
            r2 = r7[r0]
            boolean r3 = r2 instanceof p000.C0778ry
            if (r3 == 0) goto L18
            r6.put(r0, r2)
        L18:
            int r0 = r0 + 1
            goto Lc
        L1b:
            int r0 = r6.size()
            if (r0 != 0) goto L22
            return r7
        L22:
            int r0 = r7.length
            int r2 = r7.length
            int r3 = r6.size()
            int r2 = r2 - r3
            android.text.InputFilter[] r2 = new android.text.InputFilter[r2]
            r3 = r1
        L2c:
            if (r1 >= r0) goto L3d
            int r4 = r6.indexOfKey(r1)
            if (r4 >= 0) goto L3a
            r4 = r7[r1]
            r2[r3] = r4
            int r3 = r3 + 1
        L3a:
            int r1 = r1 + 1
            goto L2c
        L3d:
            return r2
        L3e:
            int r0 = r7.length
            r3 = r1
        L40:
            ry r4 = r6.f12872
            if (r3 >= r0) goto L4c
            r5 = r7[r3]
            if (r5 != r4) goto L49
            return r7
        L49:
            int r3 = r3 + 1
            goto L40
        L4c:
            int r6 = r7.length
            int r6 = r6 + r2
            android.text.InputFilter[] r6 = new android.text.InputFilter[r6]
            java.lang.System.arraycopy(r7, r1, r6, r1, r0)
            r6[r0] = r4
            return r6
    }

    @Override // p000.AbstractC0073bd
    /* JADX INFO: renamed from: а */
    public final void mo906(boolean r2) {
            r1 = this;
            r1.f12873 = r2
            android.widget.TextView r2 = r1.f12871
            android.text.method.TransformationMethod r0 = r2.getTransformationMethod()
            android.text.method.TransformationMethod r0 = r1.mo907(r0)
            r2.setTransformationMethod(r0)
            android.text.InputFilter[] r0 = r2.getFilters()
            android.text.InputFilter[] r1 = r1.mo905(r0)
            r2.setFilters(r1)
            return
    }

    @Override // p000.AbstractC0073bd
    /* JADX INFO: renamed from: и */
    public final android.text.method.TransformationMethod mo907(android.text.method.TransformationMethod r1) {
            r0 = this;
            boolean r0 = r0.f12873
            if (r0 == 0) goto L14
            boolean r0 = r1 instanceof p000.C0193cz
            if (r0 == 0) goto L9
            return r1
        L9:
            boolean r0 = r1 instanceof android.text.method.PasswordTransformationMethod
            if (r0 == 0) goto Le
            return r1
        Le:
            cz r0 = new cz
            r0.<init>(r1)
            return r0
        L14:
            boolean r0 = r1 instanceof p000.C0193cz
            if (r0 == 0) goto L1d
            cz r1 = (p000.C0193cz) r1
            android.text.method.TransformationMethod r0 = r1.f2807
            return r0
        L1d:
            return r1
    }
}
