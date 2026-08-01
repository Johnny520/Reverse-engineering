package p257;

import android.graphics.Rect;
import com.kongzue.dialogx.interfaces.AbstractC3737;
import com.kongzue.dialogx.interfaces.InterfaceC3744;
import com.kongzue.dialogx.util.views.ActivityScreenShotImageView;
import com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout;
import com.kongzue.dialogx.util.views.InterfaceC3756;
import com.kongzue.dialogx.util.views.InterfaceC3759;

/* JADX INFO: renamed from: 飘花落叶言楪哲世兰子苏.飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C8231 implements InterfaceC3756, InterfaceC3744, InterfaceC3759 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ C8222 f22716;

    public /* synthetic */ C8231(C8222 c8222) {
        this.f22716 = c8222;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public void m13735(float f) {
        int iM8062;
        C8222 c8222 = this.f22716;
        C8226 c8226 = c8222.f22692;
        ActivityScreenShotImageView activityScreenShotImageView = c8222.f22687;
        float top2 = f + c8222.f22684.getTop();
        DialogXBaseRelativeLayout dialogXBaseRelativeLayout = c8222.f22686;
        float height = 1.0f - ((dialogXBaseRelativeLayout.getHeight() - top2) * 2.0E-5f);
        activityScreenShotImageView.setScale(height <= 1.0f ? height : 1.0f);
        float fM13734 = c8226.m13734();
        float f2 = c8226.f22703;
        if (f2 < 0.0f) {
            if (f2 == -2.0f) {
                iM8062 = c8226.m13734();
            } else {
                f2 = c8226.f22704;
                if (f2 < 0.0f) {
                    iM8062 = c8226.m8062(15.0f);
                }
            }
            f2 = iM8062;
        }
        activityScreenShotImageView.setRadius(((f2 - fM13734) * ((dialogXBaseRelativeLayout.getHeight() - top2) / dialogXBaseRelativeLayout.getHeight())) + fM13734);
    }

    @Override // com.kongzue.dialogx.interfaces.InterfaceC3744
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public void mo8076(Rect rect) {
        C8222 c8222 = this.f22716;
        c8222.f22694.set(rect);
        c8222.m13729();
        if (c8222.f22691 || c8222.m13730() == 0.0f) {
            return;
        }
        c8222.f22684.setY(c8222.m13730());
    }

    @Override // com.kongzue.dialogx.util.views.InterfaceC3756
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public boolean mo8096() {
        C8226 c8226 = this.f22716.f22692;
        int i = 1;
        if (c8226.f11580) {
            AbstractC3737.m8043(new RunnableC8233(c8226, i));
        }
        return true;
    }
}
