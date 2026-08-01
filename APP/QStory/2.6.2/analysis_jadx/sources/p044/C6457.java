package p044;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import java.util.Random;

/* JADX INFO: renamed from: 飘花落叶言世哲苏楪子兰.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6457 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public float f17704;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public float f17705;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public float f17706;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final int f17707;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final boolean f17708;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final boolean f17709;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public final Bitmap f17710;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public float f17711;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final C6458 f17712;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public float f17713;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final int f17714;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final float f17715;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final Random f17716;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final int f17717;

    public C6457(C6458 c6458, int i, int i2) {
        Random random = new Random();
        this.f17716 = random;
        this.f17717 = i;
        this.f17714 = i2;
        int iNextInt = random.nextInt(i);
        int iNextInt2 = random.nextInt(i2) - i2;
        this.f17704 = iNextInt;
        this.f17713 = iNextInt2;
        this.f17712 = c6458;
        this.f17708 = c6458.f17721;
        boolean z = c6458.f17720;
        this.f17709 = c6458.f17718;
        this.f17707 = c6458.f17719;
        m11944();
        if (z) {
            float fNextInt = (random.nextInt(10) + 1) * 0.1f;
            this.f17710 = m11943(c6458.f17722, (int) (c6458.f17722.getWidth() * fNextInt), (int) (fNextInt * c6458.f17722.getHeight()));
        } else {
            this.f17710 = c6458.f17722;
        }
        this.f17710.getWidth();
        this.f17715 = this.f17710.getHeight();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static Bitmap m11943(Bitmap bitmap, int i, int i2) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        Matrix matrix = new Matrix();
        matrix.postScale(i / width, i2 / height);
        return Bitmap.createBitmap(bitmap, 0, 0, width, height, matrix, true);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m11944() {
        boolean z = this.f17708;
        C6458 c6458 = this.f17712;
        if (z) {
            this.f17706 = ((float) ((((double) (this.f17716.nextInt(3) + 1)) * 0.1d) + 1.0d)) * c6458.f17723;
        } else {
            this.f17706 = c6458.f17723;
        }
        this.f17705 = this.f17706;
    }

    public C6457(C6458 c6458) {
        this.f17712 = c6458;
        this.f17706 = c6458.f17723;
        this.f17710 = c6458.f17722;
        this.f17708 = c6458.f17721;
        this.f17709 = c6458.f17718;
        this.f17707 = c6458.f17719;
    }
}
