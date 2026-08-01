package defpackage;

/* JADX INFO: renamed from: ᲈᛵᛲᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C2239 extends defpackage.AbstractC2279 {

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public boolean f9535;

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final defpackage.C1220 f9536;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final android.widget.TextView f9537;

    public C2239(android.widget.TextView r2) {
            r1 = this;
            r1.<init>()
            r1.f9537 = r2
            r0 = 1
            r1.f9535 = r0
            ᛷᛲᛲᲀ r0 = new ᛷᛲᛲᲀ
            r0.<init>(r2)
            r1.f9536 = r0
            return
    }

    @Override // defpackage.AbstractC2279
    /* JADX INFO: renamed from: ᛵᛱᛵᛲ */
    public final android.text.InputFilter[] mo392(android.text.InputFilter[] r7) {
            r6 = this;
            boolean r0 = r6.f9535
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
            boolean r3 = r2 instanceof defpackage.C1220
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
            ᛷᛲᛲᲀ r4 = r6.f9536
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

    @Override // defpackage.AbstractC2279
    /* JADX INFO: renamed from: ᛶᛷᛱᲀ */
    public final void mo393(boolean r1) {
            r0 = this;
            if (r1 == 0) goto L5
            r0.m3630()
        L5:
            return
    }

    @Override // defpackage.AbstractC2279
    /* JADX INFO: renamed from: ᲀᛳᲀᛵ */
    public final void mo394(boolean r2) {
            r1 = this;
            r1.f9535 = r2
            r1.m3630()
            android.widget.TextView r2 = r1.f9537
            android.text.InputFilter[] r0 = r2.getFilters()
            android.text.InputFilter[] r1 = r1.mo392(r0)
            r2.setFilters(r1)
            return
    }

    /* JADX INFO: renamed from: ᲁᲈᲇᲁ, reason: contains not printable characters */
    public final void m3630() {
            r2 = this;
            android.widget.TextView r0 = r2.f9537
            android.text.method.TransformationMethod r1 = r0.getTransformationMethod()
            boolean r2 = r2.f9535
            if (r2 == 0) goto L1b
            boolean r2 = r1 instanceof defpackage.C0219
            if (r2 == 0) goto Lf
            goto L23
        Lf:
            boolean r2 = r1 instanceof android.text.method.PasswordTransformationMethod
            if (r2 == 0) goto L14
            goto L23
        L14:
            ᛱᲈᛷᛵ r2 = new ᛱᲈᛷᛵ
            r2.<init>(r1)
            r1 = r2
            goto L23
        L1b:
            boolean r2 = r1 instanceof defpackage.C0219
            if (r2 == 0) goto L23
            ᛱᲈᛷᛵ r1 = (defpackage.C0219) r1
            android.text.method.TransformationMethod r1 = r1.f1343
        L23:
            r0.setTransformationMethod(r1)
            return
    }
}
