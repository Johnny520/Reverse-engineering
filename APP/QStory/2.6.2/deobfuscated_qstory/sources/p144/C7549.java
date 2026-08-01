package p144;

import androidx.activity.C0031;
import androidx.collection.C0276;
import java.util.LinkedHashSet;
import kotlinx.coroutines.flow.C5266;
import p007.AbstractC6136;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: 飘花落叶言子兰楪苏哲世.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C7549 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final LinkedHashSet f20439;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final LinkedHashSet f20440;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C0031 f20443;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public boolean f20442 = true;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C7558 f20441 = new C7558();

    public C7549(C0031 c0031) {
        this.f20443 = c0031;
        new LinkedHashSet();
        this.f20440 = new LinkedHashSet();
        this.f20439 = new LinkedHashSet();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static void m12754(C7549 c7549, AbstractC7547 abstractC7547) {
        c7549.getClass();
        abstractC7547.getClass();
        if (c7549.f20440.add(abstractC7547)) {
            C7558 c7558 = c7549.f20441;
            c7558.getClass();
            if (abstractC7547.f20433 != null) {
                C0276.m848(abstractC7547, "Handler '", "' is already registered with a dispatcher");
                return;
            }
            c7558.f20461.addFirst(abstractC7547);
            abstractC7547.f20433 = c7549;
            c7558.m12760();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void m12755(AbstractC7554 abstractC7554, C7550 c7550) {
        if (this.f20442) {
            C7558 c7558 = this.f20441;
            c7558.getClass();
            if (c7558.f20469 != 0) {
                return;
            }
            AbstractC7547 abstractC7547M12759 = c7558.m12759(-1);
            c7558.f20460 = abstractC7547M12759;
            c7558.f20469 = -1;
            c7558.f20468 = abstractC7554;
            if (c7550 != null) {
                if (abstractC7547M12759 != null) {
                    new C7556(c7550, -1);
                    abstractC7547M12759.mo66(c7550);
                }
                C5266 c5266 = c7558.f20465;
                C7556 c7556 = new C7556(c7550, -1);
                c5266.getClass();
                c5266.m10307(null, c7556);
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m12756(C7553 c7553, int i) {
        if (i != 1 && i != 0) {
            C5919.m11253(AbstractC6136.m11556(i, "Unsupported priority value: "));
        } else if (this.f20439.add(c7553)) {
            this.f20441.m12761(this, c7553, i);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m12757(AbstractC7554 abstractC7554) {
        if (this.f20439.add(abstractC7554)) {
            this.f20441.m12761(this, abstractC7554, -1);
        }
    }
}
