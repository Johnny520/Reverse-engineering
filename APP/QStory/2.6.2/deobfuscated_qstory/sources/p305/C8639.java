package p305;

import android.graphics.Matrix;
import android.graphics.Path;

/* JADX INFO: renamed from: 飘花落叶言楪苏兰世子哲.飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C8639 extends AbstractC8640 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public float f24237;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public float f24238;

    @Override // p305.AbstractC8640
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void mo14295(Matrix matrix, Path path) {
        Matrix matrix2 = this.f24239;
        matrix.invert(matrix2);
        path.transform(matrix2);
        path.lineTo(this.f24238, this.f24237);
        path.transform(matrix);
    }
}
