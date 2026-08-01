package p305;

import androidx.fragment.app.C2358;
import com.google.android.material.button.MaterialButton;
import p033.AbstractC6325;

/* JADX INFO: renamed from: 飘花落叶言楪苏兰世子哲.飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C8654 extends AbstractC6325 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int f24337;

    public C8654(int i) {
        this.f24337 = i;
    }

    @Override // p033.AbstractC6325
    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪 */
    public final void mo7073(InterfaceC8627 interfaceC8627, float f) {
        C8651 c8651 = (C8651) interfaceC8627;
        float[] fArr = c8651.f24307;
        if (fArr != null) {
            int i = this.f24337;
            if (fArr[i] != f) {
                fArr[i] = f;
                InterfaceC8653 interfaceC8653 = c8651.f24308;
                if (interfaceC8653 != null) {
                    float fM14326 = c8651.m14326();
                    MaterialButton materialButton = (MaterialButton) ((C2358) interfaceC8653).f6985;
                    int i2 = (int) (fM14326 * 0.11f);
                    if (materialButton.f10091 != i2) {
                        materialButton.f10091 = i2;
                        materialButton.m7058();
                        materialButton.invalidate();
                    }
                }
                c8651.invalidateSelf();
            }
        }
    }

    @Override // p033.AbstractC6325
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲 */
    public final float mo7074(InterfaceC8627 interfaceC8627) {
        float[] fArr = ((C8651) interfaceC8627).f24307;
        if (fArr != null) {
            return fArr[this.f24337];
        }
        return 0.0f;
    }
}
