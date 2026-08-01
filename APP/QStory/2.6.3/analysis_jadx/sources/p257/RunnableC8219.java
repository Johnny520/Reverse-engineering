package p257;

import android.view.View;
import com.alibaba.fastjson2.C2942;
import com.kongzue.dialogx.interfaces.AbstractC3738;
import com.kongzue.dialogx.util.C3767;
import com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: 飘花落叶言楪哲世兰子苏.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC8219 implements Runnable {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ C8239 f22675;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f22676;

    public /* synthetic */ RunnableC8219(C8239 c8239, int i) {
        this.f22676 = i;
        this.f22675 = c8239;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f22676;
        int i2 = 0;
        C8239 c8239 = this.f22675;
        switch (i) {
            case 0:
                DialogXBaseRelativeLayout dialogXBaseRelativeLayout = c8239.f22741;
                if (dialogXBaseRelativeLayout != null) {
                    dialogXBaseRelativeLayout.setVisibility(8);
                }
                AbstractC3738.m8031(c8239.f22745.m8055());
                break;
            case 1:
                C8240 c8240 = c8239.f22745;
                if (c8240.f22775 == null) {
                    c8240.f22775 = new C8217(c8239, i2);
                }
                c8240.f22775.m13742(c8240);
                c8240.f11583.getClass();
                ArrayList arrayList = c8239.f22744;
                if (arrayList != null) {
                    Iterator it = arrayList.iterator();
                    if (it.hasNext()) {
                        ((View) it.next()).getClass();
                        C2942.m6394();
                        break;
                    }
                }
                break;
            default:
                C8240 c82402 = c8239.f22745;
                C8240 c82403 = c82402.f22766;
                C8239 c82392 = c82402.f22765;
                C3767 c3767 = new C3767();
                c3767.f11728 = false;
                c3767.m8092(c82403, c82392);
                c8239.f22742 = c3767;
                break;
        }
    }
}
