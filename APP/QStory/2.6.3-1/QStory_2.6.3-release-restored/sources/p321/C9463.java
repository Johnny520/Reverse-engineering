package p321;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;

/* JADX INFO: renamed from: 飘花落叶言楪苏兰世子哲.飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C9463 extends AbstractC9461 {

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static final RectF f24579 = new RectF();

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public float f24580;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final float f24581;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final float f24582;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final float f24583;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final float f24584;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public float f24585;

    public C9463(float f, float f2, float f3, float f4) {
        this.f24584 = f;
        this.f24583 = f2;
        this.f24582 = f3;
        this.f24581 = f4;
    }

    @Override // p321.AbstractC9461
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo14872(Matrix matrix, Path path) {
        Matrix matrix2 = this.f24575;
        matrix.invert(matrix2);
        path.transform(matrix2);
        float f = this.f24582;
        float f2 = this.f24581;
        RectF rectF = f24579;
        rectF.set(this.f24584, this.f24583, f, f2);
        path.arcTo(rectF, this.f24580, this.f24585, false);
        path.transform(matrix);
    }
}
