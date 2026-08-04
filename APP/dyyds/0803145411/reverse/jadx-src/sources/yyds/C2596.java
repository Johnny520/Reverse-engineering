package yyds;

import android.text.InputFilter;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.SparseArray;
import android.widget.TextView;

/* JADX INFO: renamed from: yyds.ᲈᛱᲇᛶ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C2596 extends AbstractC0427 {

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final TextView f12788;

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public boolean f12789 = true;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public final C2216 f12790;

    public C2596(TextView textView) {
        this.f12788 = textView;
        this.f12790 = new C2216(textView);
    }

    @Override // yyds.AbstractC0427
    /* JADX INFO: renamed from: ᛷᛲᲈᛱ */
    public final void mo758(boolean z) {
        this.f12789 = z;
        m4678();
        TextView textView = this.f12788;
        textView.setFilters(mo760(textView.getFilters()));
    }

    @Override // yyds.AbstractC0427
    /* JADX INFO: renamed from: ᛷᲈᲈᲁ */
    public final void mo759(boolean z) {
        if (z) {
            m4678();
        }
    }

    /* JADX INFO: renamed from: ᲇᛱᛲ, reason: contains not printable characters */
    public final void m4678() {
        TextView textView = this.f12788;
        TransformationMethod transformationMethod = textView.getTransformationMethod();
        if (this.f12789) {
            if (!(transformationMethod instanceof C0170) && !(transformationMethod instanceof PasswordTransformationMethod)) {
                transformationMethod = new C0170(transformationMethod);
            }
        } else if (transformationMethod instanceof C0170) {
            transformationMethod = ((C0170) transformationMethod).f996;
        }
        textView.setTransformationMethod(transformationMethod);
    }

    @Override // yyds.AbstractC0427
    /* JADX INFO: renamed from: ᲇᲇᲇᛱ */
    public final InputFilter[] mo760(InputFilter[] inputFilterArr) {
        if (!this.f12789) {
            SparseArray sparseArray = new SparseArray(1);
            for (int i = 0; i < inputFilterArr.length; i++) {
                InputFilter inputFilter = inputFilterArr[i];
                if (inputFilter instanceof C2216) {
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
            C2216 c2216 = this.f12790;
            if (i4 >= length2) {
                InputFilter[] inputFilterArr3 = new InputFilter[inputFilterArr.length + 1];
                System.arraycopy(inputFilterArr, 0, inputFilterArr3, 0, length2);
                inputFilterArr3[length2] = c2216;
                return inputFilterArr3;
            }
            if (inputFilterArr[i4] == c2216) {
                return inputFilterArr;
            }
            i4++;
        }
    }
}
