package androidx.recyclerview.widget;

import android.graphics.Rect;
import android.view.View;
import p167.C7693;
import p167.InterfaceC7709;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: androidx.recyclerview.widget.飘花落叶言子世哲兰苏楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2457 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final Object f7308;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Object f7309;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public int f7310;

    public AbstractC2457(AbstractC2519 abstractC2519) {
        this.f7310 = Integer.MIN_VALUE;
        this.f7308 = new Rect();
        this.f7309 = abstractC2519;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static AbstractC2457 m4849(AbstractC2519 abstractC2519, int i) {
        if (i == 0) {
            return new C2456(abstractC2519, 0);
        }
        int i2 = 1;
        if (i == 1) {
            return new C2456(abstractC2519, i2);
        }
        C5925.m11310("invalid orientation");
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public abstract int mo4835();

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public abstract int mo4836(View view);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public abstract int mo4837(View view);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public abstract int mo4838(View view);

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public abstract int mo4839(View view);

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏 */
    public abstract int mo4840(View view);

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public int m4850() {
        if (Integer.MIN_VALUE == this.f7310) {
            return 0;
        }
        return mo4846() - this.f7310;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰 */
    public abstract int mo4841(View view);

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世 */
    public abstract void mo4842(int i);

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public abstract int mo4843();

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public abstract int mo4844();

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public abstract int mo4845();

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世 */
    public abstract int mo4846();

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public abstract int mo4847();

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public abstract int mo4848();

    public AbstractC2457(InterfaceC7709 interfaceC7709) {
        this.f7310 = 0;
        this.f7308 = new C7693();
        this.f7309 = interfaceC7709;
    }
}
