package p321;

import android.graphics.Matrix;
import android.graphics.Path;

/* JADX INFO: renamed from: 飘花落叶言楪苏兰世子哲.飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C9460 extends AbstractC9461 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public float f24573;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public float f24574;

    @Override // p321.AbstractC9461
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void mo14872(Matrix matrix, Path path) {
        Matrix matrix2 = this.f24575;
        matrix.invert(matrix2);
        path.transform(matrix2);
        path.lineTo(this.f24574, this.f24573);
        path.transform(matrix);
    }
}
