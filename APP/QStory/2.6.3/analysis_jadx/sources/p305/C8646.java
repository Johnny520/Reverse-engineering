package p305;

import androidx.fragment.app.C2358;
import com.google.android.material.button.MaterialButton;
import p251.AbstractC8175;

/* JADX INFO: renamed from: 飘花落叶言楪苏兰世子哲.飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8646 extends AbstractC8175 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final int f24328;

    public C8646(int i) {
        this.f24328 = i;
    }

    @Override // p251.AbstractC8175
    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪 */
    public final void mo7060(InterfaceC8619 interfaceC8619, float f) {
        C8643 c8643 = (C8643) interfaceC8619;
        float[] fArr = c8643.f24298;
        if (fArr != null) {
            int i = this.f24328;
            if (fArr[i] != f) {
                fArr[i] = f;
                InterfaceC8645 interfaceC8645 = c8643.f24299;
                if (interfaceC8645 != null) {
                    float fM14344 = c8643.m14344();
                    MaterialButton materialButton = (MaterialButton) ((C2358) interfaceC8645).f6986;
                    int i2 = (int) (fM14344 * 0.11f);
                    if (materialButton.f10096 != i2) {
                        materialButton.f10096 = i2;
                        materialButton.m7045();
                        materialButton.invalidate();
                    }
                }
                c8643.invalidateSelf();
            }
        }
    }

    @Override // p251.AbstractC8175
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世 */
    public final float mo7061(InterfaceC8619 interfaceC8619) {
        float[] fArr = ((C8643) interfaceC8619).f24298;
        if (fArr != null) {
            return fArr[this.f24328];
        }
        return 0.0f;
    }
}
