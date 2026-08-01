package p257;

import android.view.View;
import com.alibaba.fastjson2.C2941;
import com.kongzue.dialogx.interfaces.AbstractC3737;
import com.kongzue.dialogx.util.C3766;
import com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: 飘花落叶言楪哲世兰子苏.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC8218 implements Runnable {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ C8238 f22676;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f22677;

    public /* synthetic */ RunnableC8218(C8238 c8238, int i) {
        this.f22677 = i;
        this.f22676 = c8238;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f22677;
        int i2 = 0;
        C8238 c8238 = this.f22676;
        switch (i) {
            case 0:
                DialogXBaseRelativeLayout dialogXBaseRelativeLayout = c8238.f22742;
                if (dialogXBaseRelativeLayout != null) {
                    dialogXBaseRelativeLayout.setVisibility(8);
                }
                AbstractC3737.m8044(c8238.f22746.m8068());
                break;
            case 1:
                C8239 c8239 = c8238.f22746;
                if (c8239.f22776 == null) {
                    c8239.f22776 = new C8216(c8238, i2);
                }
                c8239.f22776.m13725(c8239);
                c8239.f11578.getClass();
                ArrayList arrayList = c8238.f22745;
                if (arrayList != null) {
                    Iterator it = arrayList.iterator();
                    if (it.hasNext()) {
                        ((View) it.next()).getClass();
                        C2941.m6336();
                        break;
                    }
                }
                break;
            default:
                C8239 c82392 = c8238.f22746;
                C8239 c82393 = c82392.f22767;
                C8238 c82382 = c82392.f22766;
                C3766 c3766 = new C3766();
                c3766.f11723 = false;
                c3766.m8105(c82393, c82382);
                c8238.f22743 = c3766;
                break;
        }
    }
}
