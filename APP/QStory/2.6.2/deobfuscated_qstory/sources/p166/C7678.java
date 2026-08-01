package p166;

import android.text.InputFilter;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.SparseArray;
import android.widget.TextView;
import p053.AbstractC6560;

/* JADX INFO: renamed from: 飘花落叶言子哲苏兰世楪.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C7678 extends AbstractC6560 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public boolean f20857 = true;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final C7680 f20858;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final TextView f20859;

    public C7678(TextView textView) {
        this.f20859 = textView;
        this.f20858 = new C7680(textView);
    }

    @Override // p053.AbstractC6560
    /* JADX INFO: renamed from: 飘花落叶言子世哲兰楪苏 */
    public final void mo12043(boolean z) {
        if (z) {
            m12957();
        }
    }

    @Override // p053.AbstractC6560
    /* JADX INFO: renamed from: 飘花落叶言子世哲兰苏楪 */
    public final void mo12044(boolean z) {
        this.f20857 = z;
        m12957();
        TextView textView = this.f20859;
        textView.setFilters(mo12045(textView.getFilters()));
    }

    @Override // p053.AbstractC6560
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏 */
    public final InputFilter[] mo12045(InputFilter[] inputFilterArr) {
        if (!this.f20857) {
            SparseArray sparseArray = new SparseArray(1);
            for (int i = 0; i < inputFilterArr.length; i++) {
                InputFilter inputFilter = inputFilterArr[i];
                if (inputFilter instanceof C7680) {
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
            C7680 c7680 = this.f20858;
            if (i4 >= length2) {
                InputFilter[] inputFilterArr3 = new InputFilter[inputFilterArr.length + 1];
                System.arraycopy(inputFilterArr, 0, inputFilterArr3, 0, length2);
                inputFilterArr3[length2] = c7680;
                return inputFilterArr3;
            }
            if (inputFilterArr[i4] == c7680) {
                return inputFilterArr;
            }
            i4++;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏楪世兰哲, reason: contains not printable characters */
    public final void m12957() {
        TextView textView = this.f20859;
        TransformationMethod transformationMethod = textView.getTransformationMethod();
        if (this.f20857) {
            if (!(transformationMethod instanceof C7687) && !(transformationMethod instanceof PasswordTransformationMethod)) {
                transformationMethod = new C7687(transformationMethod);
            }
        } else if (transformationMethod instanceof C7687) {
            transformationMethod = ((C7687) transformationMethod).f20875;
        }
        textView.setTransformationMethod(transformationMethod);
    }
}
