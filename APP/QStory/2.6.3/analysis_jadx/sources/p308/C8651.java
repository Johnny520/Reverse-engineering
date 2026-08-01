package p308;

import android.graphics.Paint;
import android.graphics.Path;
import p164.AbstractC7667;

/* JADX INFO: renamed from: 飘花落叶言楪苏兰子哲世.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8651 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public int f24345;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public int f24346;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public int f24347;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final Paint f24348;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Paint f24349;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Paint f24350;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final Paint f24351;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final Path f24352 = new Path();

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static final int[] f24343 = new int[3];

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static final float[] f24344 = {0.0f, 0.5f, 1.0f};

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static final int[] f24341 = new int[4];

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public static final float[] f24342 = {0.0f, 0.0f, 0.5f, 1.0f};

    public C8651() {
        Paint paint = new Paint();
        this.f24351 = paint;
        this.f24350 = new Paint();
        m14351(-16777216);
        paint.setColor(0);
        Paint paint2 = new Paint(4);
        this.f24349 = paint2;
        paint2.setStyle(Paint.Style.FILL);
        this.f24348 = new Paint(paint2);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m14351(int i) {
        this.f24347 = AbstractC7667.m12973(i, 68);
        this.f24346 = AbstractC7667.m12973(i, 20);
        this.f24345 = AbstractC7667.m12973(i, 0);
        this.f24350.setColor(this.f24347);
    }
}
