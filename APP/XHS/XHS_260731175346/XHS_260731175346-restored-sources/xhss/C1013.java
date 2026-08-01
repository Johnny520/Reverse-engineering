package xhss;

/* JADX INFO: renamed from: xhss.ᲇᛲᛶᛴ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class C1013 extends xhss.AbstractC0473 {

    /* JADX INFO: renamed from: ᛷᲁᲁ, reason: contains not printable characters */
    public boolean f3308;

    /* JADX INFO: renamed from: ᛸᛷᲈᲈ, reason: contains not printable characters */
    public final xhss.AbstractC0796 f3309;

    /* JADX INFO: renamed from: ᲈᛳᲀ, reason: contains not printable characters */
    public final xhss.C1193 f3310;

    public C1013(xhss.AbstractC0796 r2) {
            r1 = this;
            r1.<init>()
            r1.f3309 = r2
            r0 = 1
            r1.f3308 = r0
            xhss.ᲈᲇᛱᛸ r0 = new xhss.ᲈᲇᛱᛸ
            r0.<init>(r2)
            r1.f3310 = r0
            return
    }

    /* JADX INFO: renamed from: ᛲᛴᲇᛲ, reason: contains not printable characters */
    public final void m1664() {
            r2 = this;
            xhss.ᛸᲀᛲᛴ r0 = r2.f3309
            android.text.method.TransformationMethod r1 = r0.getTransformationMethod()
            boolean r2 = r2.f3308
            if (r2 == 0) goto L1b
            boolean r2 = r1 instanceof xhss.C1046
            if (r2 == 0) goto Lf
            goto L23
        Lf:
            boolean r2 = r1 instanceof android.text.method.PasswordTransformationMethod
            if (r2 == 0) goto L14
            goto L23
        L14:
            xhss.ᲇᛶᛱᛱ r2 = new xhss.ᲇᛶᛱᛱ
            r2.<init>(r1)
            r1 = r2
            goto L23
        L1b:
            boolean r2 = r1 instanceof xhss.C1046
            if (r2 == 0) goto L23
            xhss.ᲇᛶᛱᛱ r1 = (xhss.C1046) r1
            android.text.method.TransformationMethod r1 = r1.f3369
        L23:
            r0.setTransformationMethod(r1)
            return
    }

    @Override // xhss.AbstractC0473
    /* JADX INFO: renamed from: ᛳᛶᛷᲀ */
    public final void mo871(boolean r1) {
            r0 = this;
            if (r1 == 0) goto L5
            r0.m1664()
        L5:
            return
    }

    @Override // xhss.AbstractC0473
    /* JADX INFO: renamed from: ᛷᲁᲁ */
    public final android.text.InputFilter[] mo872(android.text.InputFilter[] r7) {
            r6 = this;
            boolean r0 = r6.f3308
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
            boolean r3 = r2 instanceof xhss.C1193
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
            xhss.ᲈᲇᛱᛸ r4 = r6.f3310
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

    @Override // xhss.AbstractC0473
    /* JADX INFO: renamed from: ᲁᛲᛴᛴ */
    public final void mo873(boolean r2) {
            r1 = this;
            r1.f3308 = r2
            r1.m1664()
            xhss.ᛸᲀᛲᛴ r2 = r1.f3309
            android.text.InputFilter[] r0 = r2.getFilters()
            android.text.InputFilter[] r1 = r1.mo872(r0)
            r2.setFilters(r1)
            return
    }
}
