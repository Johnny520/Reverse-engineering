package p273;

import android.graphics.Rect;
import com.kongzue.dialogx.interfaces.AbstractC4570;
import com.kongzue.dialogx.interfaces.InterfaceC4577;
import com.kongzue.dialogx.util.views.ActivityScreenShotImageView;
import com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout;
import com.kongzue.dialogx.util.views.InterfaceC4589;
import com.kongzue.dialogx.util.views.InterfaceC4592;

/* JADX INFO: renamed from: 飘花落叶言楪哲世兰子苏.飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C9061 implements InterfaceC4589, InterfaceC4577, InterfaceC4592 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ C9052 f23060;

    public /* synthetic */ C9061(C9052 c9052) {
        this.f23060 = c9052;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public void m14310(float f) {
        int iM8608;
        C9052 c9052 = this.f23060;
        ActivityScreenShotImageView activityScreenShotImageView = c9052.f23031;
        C9056 c9056 = c9052.f23036;
        float top2 = f + c9052.f23028.getTop();
        DialogXBaseRelativeLayout dialogXBaseRelativeLayout = c9052.f23030;
        float height = 1.0f - ((dialogXBaseRelativeLayout.getHeight() - top2) * 2.0E-5f);
        float f2 = height <= 1.0f ? height : 1.0f;
        c9056.getClass();
        activityScreenShotImageView.setScale(f2);
        float fM14309 = c9056.m14309();
        float f3 = c9056.f23047;
        if (f3 < 0.0f) {
            if (f3 == -2.0f) {
                iM8608 = c9056.m14309();
            } else {
                f3 = c9056.f23048;
                if (f3 < 0.0f) {
                    iM8608 = c9056.m8608(15.0f);
                }
            }
            f3 = iM8608;
        }
        activityScreenShotImageView.setRadius(((f3 - fM14309) * ((dialogXBaseRelativeLayout.getHeight() - top2) / dialogXBaseRelativeLayout.getHeight())) + fM14309);
    }

    @Override // com.kongzue.dialogx.interfaces.InterfaceC4577
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public void mo8622(Rect rect) {
        C9052 c9052 = this.f23060;
        c9052.f23038.set(rect);
        c9052.m14305();
        if (c9052.f23035 || c9052.m14306() == 0.0f) {
            return;
        }
        c9052.f23028.setY(c9052.m14306());
    }

    @Override // com.kongzue.dialogx.util.views.InterfaceC4589
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public boolean mo8642() {
        C9056 c9056 = this.f23060.f23036;
        c9056.getClass();
        int i = 1;
        if (c9056.f11930) {
            AbstractC4570.m8589(new RunnableC9063(c9056, i));
        }
        return true;
    }
}
