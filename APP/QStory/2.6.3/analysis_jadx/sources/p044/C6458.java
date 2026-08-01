package p044;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import java.util.Random;

/* JADX INFO: renamed from: 飘花落叶言世哲苏楪兰子.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6458 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public float f17700;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public float f17701;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public float f17702;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final int f17703;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final boolean f17704;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final boolean f17705;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public final Bitmap f17706;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public float f17707;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final C6459 f17708;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public float f17709;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final int f17710;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final float f17711;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final Random f17712;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final int f17713;

    public C6458(C6459 c6459, int i, int i2) {
        Random random = new Random();
        this.f17712 = random;
        this.f17713 = i;
        this.f17710 = i2;
        int iNextInt = random.nextInt(i);
        int iNextInt2 = random.nextInt(i2) - i2;
        this.f17700 = iNextInt;
        this.f17709 = iNextInt2;
        this.f17708 = c6459;
        this.f17704 = c6459.f17717;
        boolean z = c6459.f17716;
        this.f17705 = c6459.f17714;
        this.f17703 = c6459.f17715;
        m11987();
        if (z) {
            float fNextInt = (random.nextInt(10) + 1) * 0.1f;
            this.f17706 = m11986(c6459.f17718, (int) (c6459.f17718.getWidth() * fNextInt), (int) (fNextInt * c6459.f17718.getHeight()));
        } else {
            this.f17706 = c6459.f17718;
        }
        this.f17706.getWidth();
        this.f17711 = this.f17706.getHeight();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static Bitmap m11986(Bitmap bitmap, int i, int i2) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        Matrix matrix = new Matrix();
        matrix.postScale(i / width, i2 / height);
        return Bitmap.createBitmap(bitmap, 0, 0, width, height, matrix, true);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m11987() {
        boolean z = this.f17704;
        C6459 c6459 = this.f17708;
        if (z) {
            this.f17702 = ((float) ((((double) (this.f17712.nextInt(3) + 1)) * 0.1d) + 1.0d)) * c6459.f17719;
        } else {
            this.f17702 = c6459.f17719;
        }
        this.f17701 = this.f17702;
    }

    public C6458(C6459 c6459) {
        this.f17708 = c6459;
        this.f17702 = c6459.f17719;
        this.f17706 = c6459.f17718;
        this.f17704 = c6459.f17717;
        this.f17705 = c6459.f17714;
        this.f17703 = c6459.f17715;
    }
}
