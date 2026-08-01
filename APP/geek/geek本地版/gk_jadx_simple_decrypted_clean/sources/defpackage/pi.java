package defpackage;

import android.text.InputFilter;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.SparseArray;
import android.widget.TextView;

/* JADX INFO: loaded from: classes.dex */
public final class pi extends a80 {
    public final TextView w;
    public final li x;
    public boolean y;

    public pi(TextView r2) {
        this.w = r2;
        this.y = true;
        this.x = new li(r2);
    }

    @Override // defpackage.a80
    public final void C(boolean r1) {
        if (r1 == false) goto L5;
        K();
        return;
    }

    @Override // defpackage.a80
    public final void D(boolean r2) {
        this.y = r2;
        K();
        TextView r22 = this.w;
        r22.setFilters(l(r22.getFilters()));
    }

    public final void K() {
        TextView r0 = this.w;
        TransformationMethod r1 = r0.getTransformationMethod();
        if (this.y == false) goto L12;
        if ((r1 instanceof ti) == false) goto L8;
    L14:
        r0.setTransformationMethod(r1);
        return;
    L8:
        if ((r1 instanceof PasswordTransformationMethod) == true) goto L14;
        r1 = new ti(r1);
        goto L14
    L12:
        if ((r1 instanceof ti) == false) goto L14;
        r1 = ((ti) r1).a;
        goto L14
    }

    @Override // defpackage.a80
    public final InputFilter[] l(InputFilter[] r7) {
        int r1 = 0;
        if (this.y == true) goto L21;
        SparseArray r0 = new SparseArray(1);
        int r2 = 0;
    L6:
        if (r2 >= r7.length) goto L12;
        InputFilter r3 = r7[r2];
        if ((r3 instanceof li) == false) goto L10;
        r0.put(r2, r3);
    L10:
        r2 = r2 + 1;
        goto L6
    L12:
        if (r0.size() != 0) goto L14;
        return r7;
    L14:
        int r22 = r7.length;
        InputFilter[] r32 = new InputFilter[r7.length - r0.size()];
        int r4 = 0;
    L15:
        if (r1 >= r22) goto L20;
        if (r0.indexOfKey(r1) >= 0) goto L19;
        r32[r4] = r7[r1];
        r4 = r4 + 1;
    L19:
        r1 = r1 + 1;
        goto L15
    L20:
        return r32;
    L21:
        int r02 = r7.length;
        int r33 = 0;
    L22:
        li r42 = this.x;
        if (r33 >= r02) goto L28;
        if (r7[r33] == r42) goto L26;
        r33 = r33 + 1;
        goto L22
    L26:
        return r7;
    L28:
        InputFilter[] r23 = new InputFilter[r7.length + 1];
        System.arraycopy(r7, 0, r23, 0, r02);
        r23[r02] = r42;
        return r23;
    }
}
