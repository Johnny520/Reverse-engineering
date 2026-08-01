package p273;

import android.widget.LinearLayout;
import androidx.appcompat.app.RunnableC0909;
import androidx.lifecycle.Lifecycle$State;
import androidx.recyclerview.widget.C3325;
import com.kongzue.dialogx.interfaces.AbstractC4570;
import java.util.ArrayList;

/* JADX INFO: renamed from: 飘花落叶言楪哲世兰子苏.飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC9042 implements Runnable {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ C3325 f23008;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f23009;

    public /* synthetic */ RunnableC9042(C3325 c3325, int i) {
        this.f23009 = i;
        this.f23008 = c3325;
    }

    @Override // java.lang.Runnable
    public final void run() {
        LinearLayout linearLayout;
        int i = this.f23009;
        int i2 = 4;
        C3325 c3325 = this.f23008;
        switch (i) {
            case 0:
                C9041 c9041 = (C9041) c3325.f7808;
                if (c9041.f23003 == null) {
                    c9041.f23003 = new C9046(c3325, i2);
                }
                c9041.f23003.m14301(c9041.f23001);
                c9041.m8605(Lifecycle$State.RESUMED);
                break;
            default:
                C9041 c90412 = (C9041) c3325.f7808;
                if (c90412.f23003 == null) {
                    c90412.f23003 = new C9046(c3325, i2);
                }
                c90412.f23003.m14302(c90412.f23001);
                AbstractC4570.m8588(c3325.m5491(null), new RunnableC0909(this, 24));
                ArrayList arrayList = C9041.f22994;
                if (arrayList != null) {
                    int iIndexOf = arrayList.indexOf(c90412.f23001);
                    for (int i3 = 0; i3 < iIndexOf; i3++) {
                        C9041 c90413 = (C9041) C9041.f22994.get(i3);
                        C3325 c33252 = c90413.f22998;
                        if (c33252 != null && (linearLayout = (LinearLayout) c33252.f7806) != null) {
                            linearLayout.post(new RunnableC9045(c90413, linearLayout, 1));
                        }
                    }
                }
                break;
        }
    }
}
