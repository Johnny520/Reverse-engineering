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
    public boolean f539c = true;

    public C0255f(TextView textView) {
        this.f537a = textView;
        this.f538b = new C0253d(textView);
    }

    @Override // p001A0.AbstractC0040p
    /* JADX INFO: renamed from: D */
    public final boolean mo121D() {
        return this.f539c;
    }

    @Override // p001A0.AbstractC0040p
    /* JADX INFO: renamed from: Q */
    public final void mo127Q(boolean z2) {
        if (z2) {
            TextView textView = this.f537a;
            textView.setTransformationMethod(mo132f0(textView.getTransformationMethod()));
        }
    }

    @Override // p001A0.AbstractC0040p
    /* JADX INFO: renamed from: R */
    public final void mo128R(boolean z2) {
        this.f539c = z2;
        TextView textView = this.f537a;
        textView.setTransformationMethod(mo132f0(textView.getTransformationMethod()));
        textView.setFilters(mo135w(textView.getFilters()));
    }

    @Override // p001A0.AbstractC0040p
    /* JADX INFO: renamed from: f0 */
    public final TransformationMethod mo132f0(TransformationMethod transformationMethod) {
        return this.f539c ? ((transformationMethod instanceof C0259j) || (transformationMethod instanceof PasswordTransformationMethod)) ? transformationMethod : new C0259j(transformationMethod) : transformationMethod instanceof C0259j ? ((C0259j) transformationMethod).f547a : transformationMethod;
    }

    @Override // p001A0.AbstractC0040p
    /* JADX INFO: renamed from: w */
    public final InputFilter[] mo135w(InputFilter[] inputFilterArr) {
        if (!this.f539c) {
            SparseArray sparseArray = new SparseArray(1);
            for (int i2 = 0; i2 < inputFilterArr.length; i2++) {
                InputFilter inputFilter = inputFilterArr[i2];
                if (inputFilter instanceof C0253d) {
                    sparseArray.put(i2, inputFilter);
                }
            }
            if (sparseArray.size() == 0) {
                return inputFilterArr;
            }
            int length = inputFilterArr.length;
            InputFilter[] inputFilterArr2 = new InputFilter[inputFilterArr.length - sparseArray.size()];
            int i3 = 0;
            for (int i4 = 0; i4 < length; i4++) {
                if (sparseArray.indexOfKey(i4) < 0) {
                    inputFilterArr2[i3] = inputFilterArr[i4];
                    i3++;
                }
            }
            return inputFilterArr2;
        }
        int length2 = inputFilterArr.length;
        int i5 = 0;
        while (true) {
            C0253d c0253d = this.f538b;
            if (i5 >= length2) {
                InputFilter[] inputFilterArr3 = new InputFilter[inputFilterArr.length + 1];
                System.arraycopy(inputFilterArr, 0, inputFilterArr3, 0, length2);
                inputFilterArr3[length2] = c0253d;
                return inputFilterArr3;
            }
            if (inputFilterArr[i5] == c0253d) {
                return inputFilterArr;
            }
            i5++;
        }
    }
}
