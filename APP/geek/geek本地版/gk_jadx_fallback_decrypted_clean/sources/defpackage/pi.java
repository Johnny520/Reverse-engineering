package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class pi extends defpackage.a80 {
    public final android.widget.TextView w;
    public final defpackage.li x;
    public boolean y;

    public pi(android.widget.TextView r2) {
            r1 = this;
            r1.<init>()
            r1.w = r2
            r0 = 1
            r1.y = r0
            li r0 = new li
            r0.<init>(r2)
            r1.x = r0
            return
    }

    @Override // defpackage.a80
    public final void C(boolean r1) {
            r0 = this;
            if (r1 == 0) goto L5
            r0.K()
        L5:
            return
    }

    @Override // defpackage.a80
    public final void D(boolean r2) {
            r1 = this;
            r1.y = r2
            r1.K()
            android.widget.TextView r2 = r1.w
            android.text.InputFilter[] r0 = r2.getFilters()
            android.text.InputFilter[] r0 = r1.l(r0)
            r2.setFilters(r0)
            return
    }

    public final void K() {
            r3 = this;
            android.widget.TextView r0 = r3.w
            android.text.method.TransformationMethod r1 = r0.getTransformationMethod()
            boolean r2 = r3.y
            if (r2 == 0) goto L1b
            boolean r2 = r1 instanceof defpackage.ti
            if (r2 == 0) goto Lf
            goto L23
        Lf:
            boolean r2 = r1 instanceof android.text.method.PasswordTransformationMethod
            if (r2 == 0) goto L14
            goto L23
        L14:
            ti r2 = new ti
            r2.<init>(r1)
            r1 = r2
            goto L23
        L1b:
            boolean r2 = r1 instanceof defpackage.ti
            if (r2 == 0) goto L23
            ti r1 = (defpackage.ti) r1
            android.text.method.TransformationMethod r1 = r1.a
        L23:
            r0.setTransformationMethod(r1)
            return
    }

    @Override // defpackage.a80
    public final android.text.InputFilter[] l(android.text.InputFilter[] r7) {
            r6 = this;
            boolean r0 = r6.y
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L3e
            android.util.SparseArray r0 = new android.util.SparseArray
            r0.<init>(r2)
            r2 = r1
        Lc:
            int r3 = r7.length
            if (r2 >= r3) goto L1b
            r3 = r7[r2]
            boolean r4 = r3 instanceof defpackage.li
            if (r4 == 0) goto L18
            r0.put(r2, r3)
        L18:
            int r2 = r2 + 1
            goto Lc
        L1b:
            int r2 = r0.size()
            if (r2 != 0) goto L22
            return r7
        L22:
            int r2 = r7.length
            int r3 = r7.length
            int r4 = r0.size()
            int r3 = r3 - r4
            android.text.InputFilter[] r3 = new android.text.InputFilter[r3]
            r4 = r1
        L2c:
            if (r1 >= r2) goto L3d
            int r5 = r0.indexOfKey(r1)
            if (r5 >= 0) goto L3a
            r5 = r7[r1]
            r3[r4] = r5
            int r4 = r4 + 1
        L3a:
            int r1 = r1 + 1
            goto L2c
        L3d:
            return r3
        L3e:
            int r0 = r7.length
            r3 = r1
        L40:
            li r4 = r6.x
            if (r3 >= r0) goto L4c
            r5 = r7[r3]
            if (r5 != r4) goto L49
            return r7
        L49:
            int r3 = r3 + 1
            goto L40
        L4c:
            int r3 = r7.length
            int r3 = r3 + r2
            android.text.InputFilter[] r2 = new android.text.InputFilter[r3]
            java.lang.System.arraycopy(r7, r1, r2, r1, r0)
            r2[r0] = r4
            return r2
    }
}
