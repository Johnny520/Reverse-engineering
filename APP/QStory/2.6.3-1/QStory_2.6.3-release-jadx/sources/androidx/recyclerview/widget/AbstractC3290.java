package androidx.recyclerview.widget;

import android.graphics.Rect;
import android.view.View;
import p183.C8522;
import p183.InterfaceC8538;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: androidx.recyclerview.widget.飘花落叶言子世哲兰苏楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3290 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final Object f7653;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Object f7654;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public int f7655;

    public AbstractC3290(AbstractC3352 abstractC3352) {
        this.f7655 = Integer.MIN_VALUE;
        this.f7653 = new Rect();
        this.f7654 = abstractC3352;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static AbstractC3290 m5409(AbstractC3352 abstractC3352, int i) {
        if (i == 0) {
            return new C3289(abstractC3352, 0);
        }
        int i2 = 1;
        if (i == 1) {
            return new C3289(abstractC3352, i2);
        }
        C6755.m11869("invalid orientation");
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public abstract int mo5395();

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public abstract int mo5396(View view);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public abstract int mo5397(View view);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public abstract int mo5398(View view);

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public abstract int mo5399(View view);

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏 */
    public abstract int mo5400(View view);

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public int m5410() {
        if (Integer.MIN_VALUE == this.f7655) {
            return 0;
        }
        return mo5406() - this.f7655;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰 */
    public abstract int mo5401(View view);

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世 */
    public abstract void mo5402(int i);

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public abstract int mo5403();

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public abstract int mo5404();

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public abstract int mo5405();

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世 */
    public abstract int mo5406();

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public abstract int mo5407();

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public abstract int mo5408();

    public AbstractC3290(InterfaceC8538 interfaceC8538) {
        this.f7655 = 0;
        this.f7653 = new C8522();
        this.f7654 = interfaceC8538;
    }
}
