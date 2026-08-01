package p050;

import android.widget.CompoundButton;

/* JADX INFO: renamed from: 飘花落叶言世哲楪兰子苏.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C7171 implements CompoundButton.OnCheckedChangeListener {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ String f17817;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f17818;

    public /* synthetic */ C7171(String str, int i) {
        this.f17818 = i;
        this.f17817 = str;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        int i = this.f17818;
        String str = this.f17817;
        switch (i) {
            case 0:
                if (compoundButton.isPressed() && z) {
                    AbstractC7176.f17827 = str;
                    break;
                }
                break;
            default:
                if (compoundButton.isPressed() && z) {
                    AbstractC7176.f17827 = str;
                    break;
                }
                break;
        }
    }
}
