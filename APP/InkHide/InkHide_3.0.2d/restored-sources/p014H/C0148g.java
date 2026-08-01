package p014H;

import android.text.InputFilter;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.SparseArray;
import android.widget.TextView;
import p006D.AbstractC0079h;

/* JADX INFO: renamed from: H.g */
/* JADX INFO: loaded from: classes.dex */
public final class C0148g extends AbstractC0079h {

    /* JADX INFO: renamed from: d */
    public final TextView f456d;

    /* JADX INFO: renamed from: e */
    public final C0146e f457e;

    /* JADX INFO: renamed from: f */
    public boolean f458f = true;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0148g(TextView textView) {
        this.f456d = textView;
        this.f457e = new C0146e(textView);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p006D.AbstractC0079h
    /* JADX INFO: renamed from: P */
    public final void mo205P(boolean z2) {
        if (z2) {
            m336Y();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p006D.AbstractC0079h
    /* JADX INFO: renamed from: Q */
    public final void mo206Q(boolean z2) {
        this.f458f = z2;
        m336Y();
        TextView textView = this.f456d;
        textView.setFilters(mo209t(textView.getFilters()));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: Y */
    public final void m336Y() {
        TextView textView = this.f456d;
        TransformationMethod transformationMethod = textView.getTransformationMethod();
        if (this.f458f) {
            if (!(transformationMethod instanceof C0152k) && !(transformationMethod instanceof PasswordTransformationMethod)) {
                transformationMethod = new C0152k(transformationMethod);
            }
        } else if (transformationMethod instanceof C0152k) {
            transformationMethod = ((C0152k) transformationMethod).f464a;
        }
        textView.setTransformationMethod(transformationMethod);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p006D.AbstractC0079h
    /* JADX INFO: renamed from: t */
    public final InputFilter[] mo209t(InputFilter[] inputFilterArr) {
        if (!this.f458f) {
            SparseArray sparseArray = new SparseArray(1);
            for (int i2 = 0; i2 < inputFilterArr.length; i2++) {
                InputFilter inputFilter = inputFilterArr[i2];
                if (inputFilter instanceof C0146e) {
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
            C0146e c0146e = this.f457e;
            if (i5 >= length2) {
                InputFilter[] inputFilterArr3 = new InputFilter[inputFilterArr.length + 1];
                System.arraycopy(inputFilterArr, 0, inputFilterArr3, 0, length2);
                inputFilterArr3[length2] = c0146e;
                return inputFilterArr3;
            }
            if (inputFilterArr[i5] == c0146e) {
                return inputFilterArr;
            }
            i5++;
        }
    }
}
