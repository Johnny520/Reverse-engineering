package p181;

import android.view.View;
import p267.AbstractC9004;
import p321.InterfaceC9448;

/* JADX INFO: renamed from: 飘花落叶言子哲苏世兰楪.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8503 extends AbstractC9004 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final /* synthetic */ int f21173;

    public /* synthetic */ C8503(int i) {
        this.f21173 = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p267.AbstractC9004
    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪 */
    public final void mo7619(InterfaceC9448 interfaceC9448, float f) {
        switch (this.f21173) {
            case 0:
                ((View) interfaceC9448).setAlpha(f);
                break;
            case 1:
                ((View) interfaceC9448).setScaleX(f);
                break;
            case 2:
                ((View) interfaceC9448).setScaleY(f);
                break;
            case 3:
                ((View) interfaceC9448).setRotation(f);
                break;
            case 4:
                ((View) interfaceC9448).setRotationX(f);
                break;
            default:
                ((View) interfaceC9448).setRotationY(f);
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p267.AbstractC9004
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世 */
    public final float mo7620(InterfaceC9448 interfaceC9448) {
        switch (this.f21173) {
            case 0:
                return ((View) interfaceC9448).getAlpha();
            case 1:
                return ((View) interfaceC9448).getScaleX();
            case 2:
                return ((View) interfaceC9448).getScaleY();
            case 3:
                return ((View) interfaceC9448).getRotation();
            case 4:
                return ((View) interfaceC9448).getRotationX();
            default:
                return ((View) interfaceC9448).getRotationY();
        }
    }
}
