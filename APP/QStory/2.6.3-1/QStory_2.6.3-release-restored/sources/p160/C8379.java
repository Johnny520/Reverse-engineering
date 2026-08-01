package p160;

import androidx.activity.C0878;
import androidx.collection.C1123;
import java.util.LinkedHashSet;
import kotlinx.coroutines.flow.C6099;
import p025.AbstractC7012;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: 飘花落叶言子兰楪苏哲世.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8379 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final LinkedHashSet f20779;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final LinkedHashSet f20780;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C0878 f20783;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public boolean f20782 = true;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C8388 f20781 = new C8388();

    public C8379(C0878 c0878) {
        this.f20783 = c0878;
        new LinkedHashSet();
        this.f20780 = new LinkedHashSet();
        this.f20779 = new LinkedHashSet();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static void m13342(C8379 c8379, AbstractC8377 abstractC8377) {
        c8379.getClass();
        abstractC8377.getClass();
        if (c8379.f20780.add(abstractC8377)) {
            C8388 c8388 = c8379.f20781;
            c8388.getClass();
            if (abstractC8377.f20773 != null) {
                C1123.m1409(abstractC8377, "Handler '", "' is already registered with a dispatcher");
                return;
            }
            c8388.f20801.addFirst(abstractC8377);
            abstractC8377.f20773 = c8379;
            c8388.m13348();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void m13343(AbstractC8384 abstractC8384, C8380 c8380) {
        if (this.f20782) {
            C8388 c8388 = this.f20781;
            c8388.getClass();
            if (c8388.f20809 != 0) {
                return;
            }
            AbstractC8377 abstractC8377M13347 = c8388.m13347(-1);
            c8388.f20800 = abstractC8377M13347;
            c8388.f20809 = -1;
            c8388.f20808 = abstractC8384;
            if (c8380 != null) {
                if (abstractC8377M13347 != null) {
                    new C8386(c8380, -1);
                    abstractC8377M13347.mo626(c8380);
                }
                C6099 c6099 = c8388.f20805;
                C8386 c8386 = new C8386(c8380, -1);
                c6099.getClass();
                c6099.m10870(null, c8386);
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m13344(C8383 c8383, int i) {
        if (i != 1 && i != 0) {
            C6755.m11873(AbstractC7012.m12147(i, "Unsupported priority value: "));
        } else if (this.f20779.add(c8383)) {
            this.f20781.m13349(this, c8383, i);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m13345(AbstractC8384 abstractC8384) {
        if (this.f20779.add(abstractC8384)) {
            this.f20781.m13349(this, abstractC8384, -1);
        }
    }
}
