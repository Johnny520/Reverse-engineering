package p305;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;

/* JADX INFO: renamed from: 飘花落叶言楪苏兰世子哲.飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8634 extends AbstractC8632 {

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static final RectF f24234 = new RectF();

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public float f24235;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final float f24236;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final float f24237;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final float f24238;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final float f24239;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public float f24240;

    public C8634(float f, float f2, float f3, float f4) {
        this.f24239 = f;
        this.f24238 = f2;
        this.f24237 = f3;
        this.f24236 = f4;
    }

    @Override // p305.AbstractC8632
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo14313(Matrix matrix, Path path) {
        Matrix matrix2 = this.f24230;
        matrix.invert(matrix2);
        path.transform(matrix2);
        float f = this.f24237;
        float f2 = this.f24236;
        RectF rectF = f24234;
        rectF.set(this.f24239, this.f24238, f, f2);
        path.arcTo(rectF, this.f24235, this.f24240, false);
        path.transform(matrix);
    }
}
