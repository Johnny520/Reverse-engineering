package p000;

import android.text.InputFilter;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.SparseArray;
import android.widget.TextView;

/* JADX INFO: renamed from: pi */
/* JADX INFO: loaded from: classes.dex */
public final class C0598pi extends a80 {

    /* JADX INFO: renamed from: w */
    public final TextView f3905w;

    /* JADX INFO: renamed from: x */
    public final C0449li f3906x;

    /* JADX INFO: renamed from: y */
    public boolean f3907y = true;

    public C0598pi(TextView textView) {
        this.f3905w = textView;
        this.f3906x = new C0449li(textView);
    }

    @Override // p000.a80
    /* JADX INFO: renamed from: C */
    public final void mo62C(boolean z) {
        if (z) {
            m2119K();
        }
    }

    @Override // p000.a80
    /* JADX INFO: renamed from: D */
    public final void mo63D(boolean z) {
        this.f3907y = z;
        m2119K();
        TextView textView = this.f3905w;
        textView.setFilters(mo64l(textView.getFilters()));
    }

    /* JADX INFO: renamed from: K */
    public final void m2119K() {
        TextView textView = this.f3905w;
        TransformationMethod transformationMethod = textView.getTransformationMethod();
        if (this.f3907y) {
            if (!(transformationMethod instanceof C0746ti) && !(transformationMethod instanceof PasswordTransformationMethod)) {
                transformationMethod = new C0746ti(transformationMethod);
            }
        } else if (transformationMethod instanceof C0746ti) {
            transformationMethod = ((C0746ti) transformationMethod).f4576a;
        }
        textView.setTransformationMethod(transformationMethod);
    }

    @Override // p000.a80
    /* JADX INFO: renamed from: l */
    public final InputFilter[] mo64l(InputFilter[] inputFilterArr) {
        if (!this.f3907y) {
            SparseArray sparseArray = new SparseArray(1);
            for (int i = 0; i < inputFilterArr.length; i++) {
                InputFilter inputFilter = inputFilterArr[i];
                if (inputFilter instanceof C0449li) {
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
            C0449li c0449li = this.f3906x;
            if (i4 >= length2) {
                InputFilter[] inputFilterArr3 = new InputFilter[inputFilterArr.length + 1];
                System.arraycopy(inputFilterArr, 0, inputFilterArr3, 0, length2);
                inputFilterArr3[length2] = c0449li;
                return inputFilterArr3;
            }
            if (inputFilterArr[i4] == c0449li) {
                return inputFilterArr;
            }
            i4++;
        }
    }
}
