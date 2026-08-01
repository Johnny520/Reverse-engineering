package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.ViewGroup;

/* JADX INFO: renamed from: androidx.recyclerview.widget.飘花落叶言子苏世哲兰楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class C3351 extends ViewGroup.MarginLayoutParams {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public boolean f7921;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final Rect f7922;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public boolean f7923;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public AbstractC3317 f7924;

    public C3351(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f7922 = new Rect();
        this.f7923 = true;
        this.f7921 = false;
    }

    public C3351(int i, int i2) {
        super(i, i2);
        this.f7922 = new Rect();
        this.f7923 = true;
        this.f7921 = false;
    }

    public C3351(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.f7922 = new Rect();
        this.f7923 = true;
        this.f7921 = false;
    }

    public C3351(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.f7922 = new Rect();
        this.f7923 = true;
        this.f7921 = false;
    }

    public C3351(C3351 c3351) {
        super((ViewGroup.LayoutParams) c3351);
        this.f7922 = new Rect();
        this.f7923 = true;
        this.f7921 = false;
    }
}
