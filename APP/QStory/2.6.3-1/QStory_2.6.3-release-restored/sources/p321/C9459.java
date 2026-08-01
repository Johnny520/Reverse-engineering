package p321;

import android.graphics.Canvas;
import android.graphics.Matrix;
import java.util.ArrayList;
import java.util.Iterator;
import p324.C9480;

/* JADX INFO: renamed from: 飘花落叶言楪苏兰世子哲.飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C9459 extends AbstractC9450 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final /* synthetic */ Matrix f24571;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final /* synthetic */ ArrayList f24572;

    public C9459(ArrayList arrayList, Matrix matrix) {
        this.f24572 = arrayList;
        this.f24571 = matrix;
    }

    @Override // p321.AbstractC9450
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo14865(Matrix matrix, C9480 c9480, int i, Canvas canvas) {
        Iterator it = this.f24572.iterator();
        while (it.hasNext()) {
            ((AbstractC9450) it.next()).mo14865(this.f24571, c9480, i, canvas);
        }
    }
}
