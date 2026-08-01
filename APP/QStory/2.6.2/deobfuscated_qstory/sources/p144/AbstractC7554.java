package p144;

import androidx.activity.C0031;
import kotlinx.coroutines.flow.C5266;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: 飘花落叶言子兰楪苏哲世.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7554 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public boolean f20454;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public C7549 f20455;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m12758() {
        C7549 c7549 = this.f20455;
        if (c7549 == null) {
            C5919.m11250("This input is not added to any dispatcher.");
            return;
        }
        if (!this.f20454) {
            c7549.m12755(this, null);
        }
        if (c7549.f20442) {
            C7558 c7558 = c7549.f20441;
            C0031 c0031 = c7549.f20443;
            c7558.getClass();
            if (equals(c7558.f20468) && -1 == c7558.f20469) {
                AbstractC7547 abstractC7547M12759 = c7558.f20460;
                if (abstractC7547M12759 == null) {
                    abstractC7547M12759 = c7558.m12759(-1);
                }
                c7558.f20460 = null;
                c7558.f20469 = 0;
                c7558.f20468 = null;
                if (abstractC7547M12759 == null) {
                    c0031.f61.f51.run();
                } else {
                    abstractC7547M12759.mo68();
                }
                C5266 c5266 = c7558.f20465;
                c5266.getClass();
                c5266.m10307(null, C7559.f20474);
            }
        }
        this.f20454 = false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public void mo63(boolean z) {
    }
}
