package p000;

import android.text.InputFilter;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.SparseArray;
import android.widget.TextView;

/* JADX INFO: renamed from: ri */
/* JADX INFO: loaded from: classes.dex */
public final class C0671ri extends AbstractC0493mp {

    /* JADX INFO: renamed from: A */
    public final TextView f4144A;

    /* JADX INFO: renamed from: B */
    public final C0523ni f4145B;

    /* JADX INFO: renamed from: C */
    public boolean f4146C = true;

    public C0671ri(TextView textView) {
        this.f4144A = textView;
        this.f4145B = new C0523ni(textView);
    }

    @Override // p000.AbstractC0493mp
    /* JADX INFO: renamed from: N */
    public final void mo1876N(boolean z) {
        if (z) {
            m2293a0();
        }
    }

    @Override // p000.AbstractC0493mp
    /* JADX INFO: renamed from: O */
    public final void mo1877O(boolean z) {
        this.f4146C = z;
        m2293a0();
        TextView textView = this.f4144A;
        textView.setFilters(mo1878r(textView.getFilters()));
    }

    /* JADX INFO: renamed from: a0 */
    public final void m2293a0() {
        TextView textView = this.f4144A;
        TransformationMethod transformationMethod = textView.getTransformationMethod();
        if (this.f4146C) {
            if (!(transformationMethod instanceof C0819vi) && !(transformationMethod instanceof PasswordTransformationMethod)) {
                transformationMethod = new C0819vi(transformationMethod);
            }
        } else if (transformationMethod instanceof C0819vi) {
            transformationMethod = ((C0819vi) transformationMethod).f4959a;
        }
        textView.setTransformationMethod(transformationMethod);
    }

    @Override // p000.AbstractC0493mp
    /* JADX INFO: renamed from: r */
    public final InputFilter[] mo1878r(InputFilter[] inputFilterArr) {
        if (!this.f4146C) {
            SparseArray sparseArray = new SparseArray(1);
            for (int i = 0; i < inputFilterArr.length; i++) {
                InputFilter inputFilter = inputFilterArr[i];
                if (inputFilter instanceof C0523ni) {
                    sparseArray.put(i, inputFilter);
                }
            }
            if (sparseArray.size() == 0) {
                return inputFilterArr;
            }
            int length = inputFilterArr.length;
            InputFilter[] inputFilterArr2 = new InputFilter[inputFilterArr.length - sparseArray.size()];
            int i2 = 0;
            for (int i3 = 0; i3 < length; i3++) {
                if (sparseArray.indexOfKey(i3) < 0) {
                    inputFilterArr2[i2] = inputFilterArr[i3];
                    i2++;
                }
            }
            return inputFilterArr2;
        }
        int length2 = inputFilterArr.length;
        int i4 = 0;
        while (true) {
            C0523ni c0523ni = this.f4145B;
            if (i4 >= length2) {
                InputFilter[] inputFilterArr3 = new InputFilter[inputFilterArr.length + 1];
                System.arraycopy(inputFilterArr, 0, inputFilterArr3, 0, length2);
                inputFilterArr3[length2] = c0523ni;
                return inputFilterArr3;
            }
            if (inputFilterArr[i4] == c0523ni) {
                return inputFilterArr;
            }
            i4++;
        }
    }
}
