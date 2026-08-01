package p182;

import android.text.InputFilter;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.SparseArray;
import android.widget.TextView;
import p269.AbstractC9019;

/* JADX INFO: renamed from: 飘花落叶言子哲苏兰世楪.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8508 extends AbstractC9019 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public boolean f21197;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final TextView f21198;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final C8510 f21199;

    public C8508(TextView textView) {
        super(15);
        this.f21198 = textView;
        this.f21197 = true;
        this.f21199 = new C8510(textView);
    }

    @Override // p269.AbstractC9019
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public final void mo13545(boolean z) {
        this.f21197 = z;
        m13547();
        TextView textView = this.f21198;
        textView.setFilters(mo13548(textView.getFilters()));
    }

    @Override // p269.AbstractC9019
    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public final void mo13546(boolean z) {
        if (z) {
            m13547();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public final void m13547() {
        TextView textView = this.f21198;
        TransformationMethod transformationMethod = textView.getTransformationMethod();
        if (this.f21197) {
            if (!(transformationMethod instanceof C8517) && !(transformationMethod instanceof PasswordTransformationMethod)) {
                transformationMethod = new C8517(transformationMethod);
            }
        } else if (transformationMethod instanceof C8517) {
            transformationMethod = ((C8517) transformationMethod).f21215;
        }
        textView.setTransformationMethod(transformationMethod);
    }

    @Override // p269.AbstractC9019
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final InputFilter[] mo13548(InputFilter[] inputFilterArr) {
        if (!this.f21197) {
            SparseArray sparseArray = new SparseArray(1);
            for (int i = 0; i < inputFilterArr.length; i++) {
                InputFilter inputFilter = inputFilterArr[i];
                if (inputFilter instanceof C8510) {
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
            C8510 c8510 = this.f21199;
            if (i4 >= length2) {
                InputFilter[] inputFilterArr3 = new InputFilter[inputFilterArr.length + 1];
                System.arraycopy(inputFilterArr, 0, inputFilterArr3, 0, length2);
                inputFilterArr3[length2] = c8510;
                return inputFilterArr3;
            }
            if (inputFilterArr[i4] == c8510) {
                return inputFilterArr;
            }
            i4++;
        }
    }
}
