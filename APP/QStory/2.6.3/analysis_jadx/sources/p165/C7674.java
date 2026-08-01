package p165;

import android.view.View;
import p251.AbstractC8175;
import p305.InterfaceC8619;

/* JADX INFO: renamed from: 飘花落叶言子哲苏世兰楪.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C7674 extends AbstractC8175 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final /* synthetic */ int f20828;

    public /* synthetic */ C7674(int i) {
        this.f20828 = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p251.AbstractC8175
    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪 */
    public final void mo7060(InterfaceC8619 interfaceC8619, float f) {
        switch (this.f20828) {
            case 0:
                ((View) interfaceC8619).setAlpha(f);
                break;
            case 1:
                ((View) interfaceC8619).setScaleX(f);
                break;
            case 2:
                ((View) interfaceC8619).setScaleY(f);
                break;
            case 3:
                ((View) interfaceC8619).setRotation(f);
                break;
            case 4:
                ((View) interfaceC8619).setRotationX(f);
                break;
            default:
                ((View) interfaceC8619).setRotationY(f);
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p251.AbstractC8175
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世 */
    public final float mo7061(InterfaceC8619 interfaceC8619) {
        switch (this.f20828) {
            case 0:
                return ((View) interfaceC8619).getAlpha();
            case 1:
                return ((View) interfaceC8619).getScaleX();
            case 2:
                return ((View) interfaceC8619).getScaleY();
            case 3:
                return ((View) interfaceC8619).getRotation();
            case 4:
                return ((View) interfaceC8619).getRotationX();
            default:
                return ((View) interfaceC8619).getRotationY();
        }
    }
}
