package p025N;

import android.text.InputFilter;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.SparseArray;
import android.widget.TextView;
import p001A0.AbstractC0040p;

/* JADX INFO: renamed from: N.f */
/* JADX INFO: loaded from: classes.dex */
public final class C0255f extends AbstractC0040p {

    /* JADX INFO: renamed from: a */
    public final TextView f537a;

    /* JADX INFO: renamed from: b */
    public final C0253d f538b;

    /* JADX INFO: renamed from: c */
    public boolean f539c;

    public C0255f(TextView r2) {
        this.f537a = r2;
        this.f539c = true;
        this.f538b = new C0253d(r2);
    }

    @Override // p001A0.AbstractC0040p
    /* JADX INFO: renamed from: D */
    public final boolean mo121D() {
        return this.f539c;
    }

    @Override // p001A0.AbstractC0040p
    /* JADX INFO: renamed from: Q */
    public final void mo127Q(boolean r2) {
        if (r2 == false) goto L5;
        TextView r22 = this.f537a;
        r22.setTransformationMethod(mo132f0(r22.getTransformationMethod()));
        return;
    }

    @Override // p001A0.AbstractC0040p
    /* JADX INFO: renamed from: R */
    public final void mo128R(boolean r2) {
        this.f539c = r2;
        TextView r22 = this.f537a;
        r22.setTransformationMethod(mo132f0(r22.getTransformationMethod()));
        r22.setFilters(mo135w(r22.getFilters()));
    }

    @Override // p001A0.AbstractC0040p
    /* JADX INFO: renamed from: f0 */
    public final TransformationMethod mo132f0(TransformationMethod r2) {
        if (this.f539c == false) goto L13;
        if ((r2 instanceof C0259j) == false) goto L8;
        return r2;
    L8:
        if ((r2 instanceof PasswordTransformationMethod) == false) goto L11;
        return r2;
    L11:
        return new C0259j(r2);
    L13:
        if ((r2 instanceof C0259j) == true) goto L15;
        return r2;
    L15:
        return ((C0259j) r2).f547a;
    }

    @Override // p001A0.AbstractC0040p
    /* JADX INFO: renamed from: w */
    public final InputFilter[] mo135w(InputFilter[] r7) {
        int r1 = 0;
        if (this.f539c == true) goto L22;
        SparseArray r02 = new SparseArray(1);
        int r2 = 0;
    L6:
        if (r2 >= r7.length) goto L12;
        InputFilter r3 = r7[r2];
        if ((r3 instanceof C0253d) == false) goto L10;
        r02.put(r2, r3);
    L10:
        r2 = r2 + 1;
        goto L6
    L12:
        if (r02.size() == 0) goto L39;
        int r22 = r7.length;
        InputFilter[] r32 = new InputFilter[r7.length - r02.size()];
        int r4 = 0;
    L15:
        if (r1 >= r22) goto L21;
        if (r02.indexOfKey(r1) >= 0) goto L19;
        r32[r4] = r7[r1];
        r4 = r4 + 1;
    L19:
        r1 = r1 + 1;
        goto L15
    L21:
        return r32;
    L39:
        return r7;
    L22:
        int r03 = r7.length;
        int r33 = 0;
    L23:
        C0253d r42 = this.f538b;
        if (r33 >= r03) goto L29;
        if (r7[r33] == r42) goto L40;
        r33 = r33 + 1;
        goto L23
    L40:
        return r7;
    L29:
        InputFilter[] r23 = new InputFilter[r7.length + 1];
        System.arraycopy(r7, 0, r23, 0, r03);
        r23[r03] = r42;
        return r23;
    }
}
