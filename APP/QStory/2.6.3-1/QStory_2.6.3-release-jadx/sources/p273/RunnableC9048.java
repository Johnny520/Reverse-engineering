package p273;

import android.view.View;
import com.alibaba.fastjson2.C3775;
import com.kongzue.dialogx.interfaces.AbstractC4570;
import com.kongzue.dialogx.util.C4599;
import com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: 飘花落叶言楪哲世兰子苏.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC9048 implements Runnable {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ C9068 f23020;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f23021;

    public /* synthetic */ RunnableC9048(C9068 c9068, int i) {
        this.f23021 = i;
        this.f23020 = c9068;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f23021;
        int i2 = 0;
        C9068 c9068 = this.f23020;
        switch (i) {
            case 0:
                DialogXBaseRelativeLayout dialogXBaseRelativeLayout = c9068.f23086;
                if (dialogXBaseRelativeLayout != null) {
                    dialogXBaseRelativeLayout.setVisibility(8);
                }
                AbstractC4570.m8590(c9068.f23090.m8614());
                break;
            case 1:
                C9069 c9069 = c9068.f23090;
                if (c9069.f23120 == null) {
                    c9069.f23120 = new C9046(c9068, i2);
                }
                c9069.f23120.m14301(c9069);
                c9069.f11928.getClass();
                ArrayList arrayList = c9068.f23089;
                if (arrayList != null) {
                    Iterator it = arrayList.iterator();
                    if (it.hasNext()) {
                        ((View) it.next()).getClass();
                        C3775.m6954();
                        break;
                    }
                }
                break;
            default:
                C9069 c90692 = c9068.f23090;
                C9069 c90693 = c90692.f23111;
                C9068 c90682 = c90692.f23110;
                C4599 c4599 = new C4599();
                c4599.f12073 = false;
                c4599.m8651(c90693, c90682);
                c9068.f23087 = c4599;
                break;
        }
    }
}
