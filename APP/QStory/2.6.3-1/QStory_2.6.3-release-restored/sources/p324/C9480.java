package p324;

import android.graphics.Paint;
import android.graphics.Path;
import p180.AbstractC8496;

/* JADX INFO: renamed from: 飘花落叶言楪苏兰子哲世.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C9480 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public int f24690;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public int f24691;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public int f24692;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final Paint f24693;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Paint f24694;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Paint f24695;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final Paint f24696;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final Path f24697 = new Path();

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static final int[] f24688 = new int[3];

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static final float[] f24689 = {0.0f, 0.5f, 1.0f};

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static final int[] f24686 = new int[4];

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public static final float[] f24687 = {0.0f, 0.0f, 0.5f, 1.0f};

    public C9480() {
        Paint paint = new Paint();
        this.f24696 = paint;
        this.f24695 = new Paint();
        m14910(-16777216);
        paint.setColor(0);
        Paint paint2 = new Paint(4);
        this.f24694 = paint2;
        paint2.setStyle(Paint.Style.FILL);
        this.f24693 = new Paint(paint2);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m14910(int i) {
        this.f24692 = AbstractC8496.m13532(i, 68);
        this.f24691 = AbstractC8496.m13532(i, 20);
        this.f24690 = AbstractC8496.m13532(i, 0);
        this.f24695.setColor(this.f24692);
    }
}
