package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.ViewGroup;

/* JADX INFO: renamed from: androidx.recyclerview.widget.飘花落叶言子苏世哲兰楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public class C2518 extends ViewGroup.MarginLayoutParams {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public boolean f7575;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final Rect f7576;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public boolean f7577;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public AbstractC2484 f7578;

    public C2518(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f7576 = new Rect();
        this.f7577 = true;
        this.f7575 = false;
    }

    public C2518(int i, int i2) {
        super(i, i2);
        this.f7576 = new Rect();
        this.f7577 = true;
        this.f7575 = false;
    }

    public C2518(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.f7576 = new Rect();
        this.f7577 = true;
        this.f7575 = false;
    }

    public C2518(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.f7576 = new Rect();
        this.f7577 = true;
        this.f7575 = false;
    }

    public C2518(C2518 c2518) {
        super((ViewGroup.LayoutParams) c2518);
        this.f7576 = new Rect();
        this.f7577 = true;
        this.f7575 = false;
    }
}
