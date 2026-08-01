package p165;

import android.view.View;
import p033.AbstractC6325;
import p305.InterfaceC8627;

/* JADX INFO: renamed from: 飘花落叶言子哲苏世兰楪.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C7673 extends AbstractC6325 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ int f20833;

    public /* synthetic */ C7673(int i) {
        this.f20833 = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p033.AbstractC6325
    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪 */
    public final void mo7073(InterfaceC8627 interfaceC8627, float f) {
        switch (this.f20833) {
            case 0:
                ((View) interfaceC8627).setAlpha(f);
                break;
            case 1:
                ((View) interfaceC8627).setScaleX(f);
                break;
            case 2:
                ((View) interfaceC8627).setScaleY(f);
                break;
            case 3:
                ((View) interfaceC8627).setRotation(f);
                break;
            case 4:
                ((View) interfaceC8627).setRotationX(f);
                break;
            default:
                ((View) interfaceC8627).setRotationY(f);
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p033.AbstractC6325
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲 */
    public final float mo7074(InterfaceC8627 interfaceC8627) {
        switch (this.f20833) {
            case 0:
                return ((View) interfaceC8627).getAlpha();
            case 1:
                return ((View) interfaceC8627).getScaleX();
            case 2:
                return ((View) interfaceC8627).getScaleY();
            case 3:
                return ((View) interfaceC8627).getRotation();
            case 4:
                return ((View) interfaceC8627).getRotationX();
            default:
                return ((View) interfaceC8627).getRotationY();
        }
    }
}
