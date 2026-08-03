package p000;

import android.text.InputFilter;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.SparseArray;
import android.widget.TextView;

/* JADX INFO: renamed from: Bf */
/* JADX INFO: loaded from: classes.dex */
public final class C0065Bf extends AbstractC0828TB {

    /* JADX INFO: renamed from: l */
    public final TextView f154l;

    /* JADX INFO: renamed from: m */
    public final C2716xf f155m;

    /* JADX INFO: renamed from: n */
    public boolean f156n;

    public C0065Bf(TextView r2) {
        this.f154l = r2;
        this.f156n = true;
        this.f155m = new C2716xf(r2);
    }

    @Override // p000.AbstractC0828TB
    /* JADX INFO: renamed from: B */
    public final void mo101B(boolean r2) {
        if (r2 == false) goto L5;
        TextView r22 = this.f154l;
        r22.setTransformationMethod(mo103L(r22.getTransformationMethod()));
        return;
    }

    @Override // p000.AbstractC0828TB
    /* JADX INFO: renamed from: C */
    public final void mo102C(boolean r2) {
        this.f156n = r2;
        TextView r22 = this.f154l;
        r22.setTransformationMethod(mo103L(r22.getTransformationMethod()));
        r22.setFilters(mo104m(r22.getFilters()));
    }

    @Override // p000.AbstractC0828TB
    /* JADX INFO: renamed from: L */
    public final TransformationMethod mo103L(TransformationMethod r2) {
        if (this.f156n == false) goto L13;
        if ((r2 instanceof C0237Ff) == false) goto L8;
        return r2;
    L8:
        if ((r2 instanceof PasswordTransformationMethod) == false) goto L11;
        return r2;
    L11:
        return new C0237Ff(r2);
    L13:
        if ((r2 instanceof C0237Ff) == true) goto L15;
        return r2;
    L15:
        return ((C0237Ff) r2).f753a;
    }

    @Override // p000.AbstractC0828TB
    /* JADX INFO: renamed from: m */
    public final InputFilter[] mo104m(InputFilter[] r7) {
        int r1 = 0;
        if (this.f156n == true) goto L21;
        SparseArray r0 = new SparseArray(1);
        int r2 = 0;
    L6:
        if (r2 >= r7.length) goto L12;
        InputFilter r3 = r7[r2];
        if ((r3 instanceof C2716xf) == false) goto L10;
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
        C2716xf r42 = this.f155m;
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

    @Override // p000.AbstractC0828TB
    /* JADX INFO: renamed from: s */
    public final boolean mo105s() {
        return this.f156n;
    }
}
