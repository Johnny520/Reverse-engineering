package p166;

import android.text.InputFilter;
import android.widget.TextView;
import p167.C7713;
import p253.AbstractC8190;

/* JADX INFO: renamed from: 飘花落叶言子哲苏兰世楪.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C7686 extends AbstractC8190 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C7679 f20866;

    public C7686(TextView textView) {
        super(15);
        this.f20866 = new C7679(textView);
    }

    @Override // p253.AbstractC8190
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰 */
    public final void mo12986(boolean z) {
        boolean zM13009 = C7713.m13009();
        C7679 c7679 = this.f20866;
        if (zM13009) {
            c7679.mo12986(z);
        } else {
            c7679.f20852 = z;
        }
    }

    @Override // p253.AbstractC8190
    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲 */
    public final void mo12987(boolean z) {
        if (C7713.m13009()) {
            this.f20866.mo12987(z);
        }
    }

    @Override // p253.AbstractC8190
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世 */
    public final InputFilter[] mo12989(InputFilter[] inputFilterArr) {
        return !C7713.m13009() ? inputFilterArr : this.f20866.mo12989(inputFilterArr);
    }
}
