package p182;

import android.text.InputFilter;
import android.widget.TextView;
import p183.C8542;
import p269.AbstractC9019;

/* JADX INFO: renamed from: 飘花落叶言子哲苏兰世楪.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8515 extends AbstractC9019 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C8508 f21211;

    public C8515(TextView textView) {
        super(15);
        this.f21211 = new C8508(textView);
    }

    @Override // p269.AbstractC9019
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰 */
    public final void mo13545(boolean z) {
        boolean zM13568 = C8542.m13568();
        C8508 c8508 = this.f21211;
        if (zM13568) {
            c8508.mo13545(z);
        } else {
            c8508.f21197 = z;
        }
    }

    @Override // p269.AbstractC9019
    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲 */
    public final void mo13546(boolean z) {
        if (C8542.m13568()) {
            this.f21211.mo13546(z);
        }
    }

    @Override // p269.AbstractC9019
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世 */
    public final InputFilter[] mo13548(InputFilter[] inputFilterArr) {
        return !C8542.m13568() ? inputFilterArr : this.f21211.mo13548(inputFilterArr);
    }
}
