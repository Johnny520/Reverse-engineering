package p257;

import android.graphics.Rect;
import com.kongzue.dialogx.interfaces.AbstractC3738;
import com.kongzue.dialogx.interfaces.InterfaceC3745;
import com.kongzue.dialogx.util.views.ActivityScreenShotImageView;
import com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout;
import com.kongzue.dialogx.util.views.InterfaceC3757;
import com.kongzue.dialogx.util.views.InterfaceC3760;

/* JADX INFO: renamed from: 飘花落叶言楪哲世兰子苏.飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8232 implements InterfaceC3757, InterfaceC3745, InterfaceC3760 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ C8223 f22715;

    public /* synthetic */ C8232(C8223 c8223) {
        this.f22715 = c8223;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public void m13751(float f) {
        int iM8049;
        C8223 c8223 = this.f22715;
        ActivityScreenShotImageView activityScreenShotImageView = c8223.f22686;
        C8227 c8227 = c8223.f22691;
        float top2 = f + c8223.f22683.getTop();
        DialogXBaseRelativeLayout dialogXBaseRelativeLayout = c8223.f22685;
        float height = 1.0f - ((dialogXBaseRelativeLayout.getHeight() - top2) * 2.0E-5f);
        float f2 = height <= 1.0f ? height : 1.0f;
        c8227.getClass();
        activityScreenShotImageView.setScale(f2);
        float fM13750 = c8227.m13750();
        float f3 = c8227.f22702;
        if (f3 < 0.0f) {
            if (f3 == -2.0f) {
                iM8049 = c8227.m13750();
            } else {
                f3 = c8227.f22703;
                if (f3 < 0.0f) {
                    iM8049 = c8227.m8049(15.0f);
                }
            }
            f3 = iM8049;
        }
        activityScreenShotImageView.setRadius(((f3 - fM13750) * ((dialogXBaseRelativeLayout.getHeight() - top2) / dialogXBaseRelativeLayout.getHeight())) + fM13750);
    }

    @Override // com.kongzue.dialogx.interfaces.InterfaceC3745
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public void mo8063(Rect rect) {
        C8223 c8223 = this.f22715;
        c8223.f22693.set(rect);
        c8223.m13746();
        if (c8223.f22690 || c8223.m13747() == 0.0f) {
            return;
        }
        c8223.f22683.setY(c8223.m13747());
    }

    @Override // com.kongzue.dialogx.util.views.InterfaceC3757
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public boolean mo8083() {
        C8227 c8227 = this.f22715.f22691;
        c8227.getClass();
        int i = 1;
        if (c8227.f11585) {
            AbstractC3738.m8030(new RunnableC8234(c8227, i));
        }
        return true;
    }
}
