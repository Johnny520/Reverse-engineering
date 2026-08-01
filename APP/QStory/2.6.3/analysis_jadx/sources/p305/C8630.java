package p305;

import android.graphics.Canvas;
import android.graphics.Matrix;
import java.util.ArrayList;
import java.util.Iterator;
import p308.C8651;

/* JADX INFO: renamed from: 飘花落叶言楪苏兰世子哲.飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8630 extends AbstractC8621 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final /* synthetic */ Matrix f24226;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final /* synthetic */ ArrayList f24227;

    public C8630(ArrayList arrayList, Matrix matrix) {
        this.f24227 = arrayList;
        this.f24226 = matrix;
    }

    @Override // p305.AbstractC8621
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo14306(Matrix matrix, C8651 c8651, int i, Canvas canvas) {
        Iterator it = this.f24227.iterator();
        while (it.hasNext()) {
            ((AbstractC8621) it.next()).mo14306(this.f24226, c8651, i, canvas);
        }
    }
}
