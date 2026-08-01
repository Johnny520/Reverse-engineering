package p308;

import android.graphics.Paint;
import android.graphics.Path;
import p164.AbstractC7666;

/* JADX INFO: renamed from: 飘花落叶言楪苏兰子哲世.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C8659 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public int f24354;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public int f24355;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public int f24356;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final Paint f24357;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Paint f24358;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Paint f24359;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final Paint f24360;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final Path f24361 = new Path();

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static final int[] f24352 = new int[3];

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static final float[] f24353 = {0.0f, 0.5f, 1.0f};

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static final int[] f24350 = new int[4];

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public static final float[] f24351 = {0.0f, 0.0f, 0.5f, 1.0f};

    public C8659() {
        Paint paint = new Paint();
        this.f24360 = paint;
        this.f24359 = new Paint();
        m14333(-16777216);
        paint.setColor(0);
        Paint paint2 = new Paint(4);
        this.f24358 = paint2;
        paint2.setStyle(Paint.Style.FILL);
        this.f24357 = new Paint(paint2);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m14333(int i) {
        this.f24356 = AbstractC7666.m12944(i, 68);
        this.f24355 = AbstractC7666.m12944(i, 20);
        this.f24354 = AbstractC7666.m12944(i, 0);
        this.f24359.setColor(this.f24356);
    }
}
