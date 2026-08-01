package androidx.recyclerview.widget;

import android.graphics.Rect;
import android.view.View;
import p167.C7692;
import p167.InterfaceC7708;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: androidx.recyclerview.widget.飘花落叶言子世哲兰苏楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2457 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final Object f7307;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Object f7308;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public int f7309;

    public AbstractC2457(AbstractC2519 abstractC2519) {
        this.f7309 = Integer.MIN_VALUE;
        this.f7307 = new Rect();
        this.f7308 = abstractC2519;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static AbstractC2457 m4839(AbstractC2519 abstractC2519, int i) {
        if (i == 0) {
            return new C2456(abstractC2519, 0);
        }
        int i2 = 1;
        if (i == 1) {
            return new C2456(abstractC2519, i2);
        }
        C5919.m11249("invalid orientation");
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public abstract int mo4825();

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public abstract int mo4826(View view);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public abstract int mo4827(View view);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public abstract int mo4828(View view);

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public abstract int mo4829(View view);

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏 */
    public abstract int mo4830(View view);

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public int m4840() {
        if (Integer.MIN_VALUE == this.f7309) {
            return 0;
        }
        return mo4836() - this.f7309;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰 */
    public abstract int mo4831(View view);

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世 */
    public abstract void mo4832(int i);

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public abstract int mo4833();

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public abstract int mo4834();

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public abstract int mo4835();

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世 */
    public abstract int mo4836();

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public abstract int mo4837();

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public abstract int mo4838();

    public AbstractC2457(InterfaceC7708 interfaceC7708) {
        this.f7309 = 0;
        this.f7307 = new C7692();
        this.f7308 = interfaceC7708;
    }
}
