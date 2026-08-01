package p060;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import java.util.Random;

/* JADX INFO: renamed from: 飘花落叶言世哲苏楪兰子.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7287 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public float f18045;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public float f18046;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public float f18047;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final int f18048;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final boolean f18049;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final boolean f18050;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public final Bitmap f18051;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public float f18052;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final C7288 f18053;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public float f18054;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final int f18055;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final float f18056;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final Random f18057;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final int f18058;

    public C7287(C7288 c7288, int i, int i2) {
        Random random = new Random();
        this.f18057 = random;
        this.f18058 = i;
        this.f18055 = i2;
        int iNextInt = random.nextInt(i);
        int iNextInt2 = random.nextInt(i2) - i2;
        this.f18045 = iNextInt;
        this.f18054 = iNextInt2;
        this.f18053 = c7288;
        this.f18049 = c7288.f18062;
        boolean z = c7288.f18061;
        this.f18050 = c7288.f18059;
        this.f18048 = c7288.f18060;
        m12546();
        if (z) {
            float fNextInt = (random.nextInt(10) + 1) * 0.1f;
            this.f18051 = m12545(c7288.f18063, (int) (c7288.f18063.getWidth() * fNextInt), (int) (fNextInt * c7288.f18063.getHeight()));
        } else {
            this.f18051 = c7288.f18063;
        }
        this.f18051.getWidth();
        this.f18056 = this.f18051.getHeight();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static Bitmap m12545(Bitmap bitmap, int i, int i2) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        Matrix matrix = new Matrix();
        matrix.postScale(i / width, i2 / height);
        return Bitmap.createBitmap(bitmap, 0, 0, width, height, matrix, true);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m12546() {
        boolean z = this.f18049;
        C7288 c7288 = this.f18053;
        if (z) {
            this.f18047 = ((float) ((((double) (this.f18057.nextInt(3) + 1)) * 0.1d) + 1.0d)) * c7288.f18064;
        } else {
            this.f18047 = c7288.f18064;
        }
        this.f18046 = this.f18047;
    }

    public C7287(C7288 c7288) {
        this.f18053 = c7288;
        this.f18047 = c7288.f18064;
        this.f18051 = c7288.f18063;
        this.f18049 = c7288.f18062;
        this.f18050 = c7288.f18059;
        this.f18048 = c7288.f18060;
    }
}
