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
    public boolean f156n = true;

    public C0065Bf(TextView textView) {
        this.f154l = textView;
        this.f155m = new C2716xf(textView);
    }

    @Override // p000.AbstractC0828TB
    /* JADX INFO: renamed from: B */
    public final void mo101B(boolean z) {
        if (z) {
            TextView textView = this.f154l;
            textView.setTransformationMethod(mo103L(textView.getTransformationMethod()));
        }
    }

    @Override // p000.AbstractC0828TB
    /* JADX INFO: renamed from: C */
    public final void mo102C(boolean z) {
        this.f156n = z;
        TextView textView = this.f154l;
        textView.setTransformationMethod(mo103L(textView.getTransformationMethod()));
        textView.setFilters(mo104m(textView.getFilters()));
    }

    @Override // p000.AbstractC0828TB
    /* JADX INFO: renamed from: L */
    public final TransformationMethod mo103L(TransformationMethod transformationMethod) {
        return this.f156n ? ((transformationMethod instanceof C0237Ff) || (transformationMethod instanceof PasswordTransformationMethod)) ? transformationMethod : new C0237Ff(transformationMethod) : transformationMethod instanceof C0237Ff ? ((C0237Ff) transformationMethod).f753a : transformationMethod;
    }

    @Override // p000.AbstractC0828TB
    /* JADX INFO: renamed from: m */
    public final InputFilter[] mo104m(InputFilter[] inputFilterArr) {
        if (!this.f156n) {
            SparseArray sparseArray = new SparseArray(1);
            for (int i = 0; i < inputFilterArr.length; i++) {
                InputFilter inputFilter = inputFilterArr[i];
                if (inputFilter instanceof C2716xf) {
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
            C2716xf c2716xf = this.f155m;
            if (i4 >= length2) {
                InputFilter[] inputFilterArr3 = new InputFilter[inputFilterArr.length + 1];
                System.arraycopy(inputFilterArr, 0, inputFilterArr3, 0, length2);
                inputFilterArr3[length2] = c2716xf;
                return inputFilterArr3;
            }
            if (inputFilterArr[i4] == c2716xf) {
                return inputFilterArr;
            }
            i4++;
        }
    }

    @Override // p000.AbstractC0828TB
    /* JADX INFO: renamed from: s */
    public final boolean mo105s() {
        return this.f156n;
    }
}
