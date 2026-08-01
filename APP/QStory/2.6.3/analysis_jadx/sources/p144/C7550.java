package p144;

import androidx.activity.C0031;
import androidx.collection.C0276;
import java.util.LinkedHashSet;
import kotlinx.coroutines.flow.C5267;
import p009.AbstractC6183;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: 飘花落叶言子兰楪苏哲世.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C7550 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final LinkedHashSet f20434;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final LinkedHashSet f20435;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C0031 f20438;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public boolean f20437 = true;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C7559 f20436 = new C7559();

    public C7550(C0031 c0031) {
        this.f20438 = c0031;
        new LinkedHashSet();
        this.f20435 = new LinkedHashSet();
        this.f20434 = new LinkedHashSet();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static void m12783(C7550 c7550, AbstractC7548 abstractC7548) {
        c7550.getClass();
        abstractC7548.getClass();
        if (c7550.f20435.add(abstractC7548)) {
            C7559 c7559 = c7550.f20436;
            c7559.getClass();
            if (abstractC7548.f20428 != null) {
                C0276.m849(abstractC7548, "Handler '", "' is already registered with a dispatcher");
                return;
            }
            c7559.f20456.addFirst(abstractC7548);
            abstractC7548.f20428 = c7550;
            c7559.m12789();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void m12784(AbstractC7555 abstractC7555, C7551 c7551) {
        if (this.f20437) {
            C7559 c7559 = this.f20436;
            c7559.getClass();
            if (c7559.f20464 != 0) {
                return;
            }
            AbstractC7548 abstractC7548M12788 = c7559.m12788(-1);
            c7559.f20455 = abstractC7548M12788;
            c7559.f20464 = -1;
            c7559.f20463 = abstractC7555;
            if (c7551 != null) {
                if (abstractC7548M12788 != null) {
                    new C7557(c7551, -1);
                    abstractC7548M12788.mo66(c7551);
                }
                C5267 c5267 = c7559.f20460;
                C7557 c7557 = new C7557(c7551, -1);
                c5267.getClass();
                c5267.m10311(null, c7557);
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m12785(C7554 c7554, int i) {
        if (i != 1 && i != 0) {
            C5925.m11314(AbstractC6183.m11588(i, "Unsupported priority value: "));
        } else if (this.f20434.add(c7554)) {
            this.f20436.m12790(this, c7554, i);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m12786(AbstractC7555 abstractC7555) {
        if (this.f20434.add(abstractC7555)) {
            this.f20436.m12790(this, abstractC7555, -1);
        }
    }
}
