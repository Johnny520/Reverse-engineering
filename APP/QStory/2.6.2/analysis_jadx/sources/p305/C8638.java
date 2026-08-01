package p305;

import android.graphics.Canvas;
import android.graphics.Matrix;
import java.util.ArrayList;
import java.util.Iterator;
import p308.C8659;

/* JADX INFO: renamed from: 飘花落叶言楪苏兰世子哲.飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C8638 extends AbstractC8629 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final /* synthetic */ Matrix f24235;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final /* synthetic */ ArrayList f24236;

    public C8638(ArrayList arrayList, Matrix matrix) {
        this.f24236 = arrayList;
        this.f24235 = matrix;
    }

    @Override // p305.AbstractC8629
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo14287(Matrix matrix, C8659 c8659, int i, Canvas canvas) {
        Iterator it = this.f24236.iterator();
        while (it.hasNext()) {
            ((AbstractC8629) it.next()).mo14287(this.f24235, c8659, i, canvas);
        }
    }
}
