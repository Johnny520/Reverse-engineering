package p033;

import android.widget.CompoundButton;

/* JADX INFO: renamed from: 飘花落叶言世哲楪兰子苏.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C6323 implements CompoundButton.OnCheckedChangeListener {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ String f17423;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f17424;

    public /* synthetic */ C6323(String str, int i) {
        this.f17424 = i;
        this.f17423 = str;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        int i = this.f17424;
        String str = this.f17423;
        switch (i) {
            case 0:
                if (compoundButton.isPressed() && z) {
                    AbstractC6333.f17448 = str;
                    break;
                }
                break;
            default:
                if (compoundButton.isPressed() && z) {
                    AbstractC6333.f17448 = str;
                    break;
                }
                break;
        }
    }
}
