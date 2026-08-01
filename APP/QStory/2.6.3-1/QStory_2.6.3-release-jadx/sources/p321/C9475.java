package p321;

import androidx.fragment.app.C3191;
import com.google.android.material.button.MaterialButton;
import p267.AbstractC9004;

/* JADX INFO: renamed from: 飘花落叶言楪苏兰世子哲.飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C9475 extends AbstractC9004 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final int f24673;

    public C9475(int i) {
        this.f24673 = i;
    }

    @Override // p267.AbstractC9004
    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪 */
    public final void mo7619(InterfaceC9448 interfaceC9448, float f) {
        C9472 c9472 = (C9472) interfaceC9448;
        float[] fArr = c9472.f24643;
        if (fArr != null) {
            int i = this.f24673;
            if (fArr[i] != f) {
                fArr[i] = f;
                InterfaceC9474 interfaceC9474 = c9472.f24644;
                if (interfaceC9474 != null) {
                    float fM14903 = c9472.m14903();
                    MaterialButton materialButton = (MaterialButton) ((C3191) interfaceC9474).f7331;
                    int i2 = (int) (fM14903 * 0.11f);
                    if (materialButton.f10441 != i2) {
                        materialButton.f10441 = i2;
                        materialButton.m7604();
                        materialButton.invalidate();
                    }
                }
                c9472.invalidateSelf();
            }
        }
    }

    @Override // p267.AbstractC9004
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世 */
    public final float mo7620(InterfaceC9448 interfaceC9448) {
        float[] fArr = ((C9472) interfaceC9448).f24643;
        if (fArr != null) {
            return fArr[this.f24673];
        }
        return 0.0f;
    }
}
