package p166;

import android.text.InputFilter;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.SparseArray;
import android.widget.TextView;
import p253.AbstractC8190;

/* JADX INFO: renamed from: 飘花落叶言子哲苏兰世楪.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C7679 extends AbstractC8190 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public boolean f20852;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final TextView f20853;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final C7681 f20854;

    public C7679(TextView textView) {
        super(15);
        this.f20853 = textView;
        this.f20852 = true;
        this.f20854 = new C7681(textView);
    }

    @Override // p253.AbstractC8190
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public final void mo12986(boolean z) {
        this.f20852 = z;
        m12988();
        TextView textView = this.f20853;
        textView.setFilters(mo12989(textView.getFilters()));
    }

    @Override // p253.AbstractC8190
    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public final void mo12987(boolean z) {
        if (z) {
            m12988();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public final void m12988() {
        TextView textView = this.f20853;
        TransformationMethod transformationMethod = textView.getTransformationMethod();
        if (this.f20852) {
            if (!(transformationMethod instanceof C7688) && !(transformationMethod instanceof PasswordTransformationMethod)) {
                transformationMethod = new C7688(transformationMethod);
            }
        } else if (transformationMethod instanceof C7688) {
            transformationMethod = ((C7688) transformationMethod).f20870;
        }
        textView.setTransformationMethod(transformationMethod);
    }

    @Override // p253.AbstractC8190
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final InputFilter[] mo12989(InputFilter[] inputFilterArr) {
        if (!this.f20852) {
            SparseArray sparseArray = new SparseArray(1);
            for (int i = 0; i < inputFilterArr.length; i++) {
                InputFilter inputFilter = inputFilterArr[i];
                if (inputFilter instanceof C7681) {
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
            C7681 c7681 = this.f20854;
            if (i4 >= length2) {
                InputFilter[] inputFilterArr3 = new InputFilter[inputFilterArr.length + 1];
                System.arraycopy(inputFilterArr, 0, inputFilterArr3, 0, length2);
                inputFilterArr3[length2] = c7681;
                return inputFilterArr3;
            }
            if (inputFilterArr[i4] == c7681) {
                return inputFilterArr;
            }
            i4++;
        }
    }
}
