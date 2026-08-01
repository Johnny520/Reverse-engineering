package p257;

import android.widget.LinearLayout;
import androidx.appcompat.app.RunnableC0062;
import androidx.lifecycle.Lifecycle$State;
import androidx.recyclerview.widget.C2492;
import com.kongzue.dialogx.interfaces.AbstractC3738;
import java.util.ArrayList;

/* JADX INFO: renamed from: 飘花落叶言楪哲世兰子苏.飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC8213 implements Runnable {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ C2492 f22663;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f22664;

    public /* synthetic */ RunnableC8213(C2492 c2492, int i) {
        this.f22664 = i;
        this.f22663 = c2492;
    }

    @Override // java.lang.Runnable
    public final void run() {
        LinearLayout linearLayout;
        int i = this.f22664;
        int i2 = 4;
        C2492 c2492 = this.f22663;
        switch (i) {
            case 0:
                C8212 c8212 = (C8212) c2492.f7463;
                if (c8212.f22658 == null) {
                    c8212.f22658 = new C8217(c2492, i2);
                }
                c8212.f22658.m13742(c8212.f22656);
                c8212.m8046(Lifecycle$State.RESUMED);
                break;
            default:
                C8212 c82122 = (C8212) c2492.f7463;
                if (c82122.f22658 == null) {
                    c82122.f22658 = new C8217(c2492, i2);
                }
                c82122.f22658.m13743(c82122.f22656);
                AbstractC3738.m8029(c2492.m4931(null), new RunnableC0062(this, 24));
                ArrayList arrayList = C8212.f22649;
                if (arrayList != null) {
                    int iIndexOf = arrayList.indexOf(c82122.f22656);
                    for (int i3 = 0; i3 < iIndexOf; i3++) {
                        C8212 c82123 = (C8212) C8212.f22649.get(i3);
                        C2492 c24922 = c82123.f22653;
                        if (c24922 != null && (linearLayout = (LinearLayout) c24922.f7461) != null) {
                            linearLayout.post(new RunnableC8216(c82123, linearLayout, 1));
                        }
                    }
                }
                break;
        }
    }
}
