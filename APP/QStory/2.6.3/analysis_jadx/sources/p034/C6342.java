package p034;

import android.widget.CompoundButton;

/* JADX INFO: renamed from: 飘花落叶言世哲楪兰子苏.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C6342 implements CompoundButton.OnCheckedChangeListener {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ String f17472;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f17473;

    public /* synthetic */ C6342(String str, int i) {
        this.f17473 = i;
        this.f17472 = str;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        int i = this.f17473;
        String str = this.f17472;
        switch (i) {
            case 0:
                if (compoundButton.isPressed() && z) {
                    AbstractC6347.f17482 = str;
                    break;
                }
                break;
            default:
                if (compoundButton.isPressed() && z) {
                    AbstractC6347.f17482 = str;
                    break;
                }
                break;
        }
    }
}
