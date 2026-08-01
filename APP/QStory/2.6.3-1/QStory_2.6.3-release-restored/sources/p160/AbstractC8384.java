package p160;

import androidx.activity.C0878;
import kotlinx.coroutines.flow.C6099;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: 飘花落叶言子兰楪苏哲世.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8384 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public boolean f20794;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public C8379 f20795;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m13346() {
        C8379 c8379 = this.f20795;
        if (c8379 == null) {
            C6755.m11870("This input is not added to any dispatcher.");
            return;
        }
        if (!this.f20794) {
            c8379.m13343(this, null);
        }
        if (c8379.f20782) {
            C8388 c8388 = c8379.f20781;
            C0878 c0878 = c8379.f20783;
            c8388.getClass();
            if (equals(c8388.f20808) && -1 == c8388.f20809) {
                AbstractC8377 abstractC8377M13347 = c8388.f20800;
                if (abstractC8377M13347 == null) {
                    abstractC8377M13347 = c8388.m13347(-1);
                }
                c8388.f20800 = null;
                c8388.f20809 = 0;
                c8388.f20808 = null;
                if (abstractC8377M13347 == null) {
                    c0878.f406.f396.run();
                } else {
                    abstractC8377M13347.mo628();
                }
                C6099 c6099 = c8388.f20805;
                c6099.getClass();
                c6099.m10870(null, C8389.f20814);
            }
        }
        this.f20794 = false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public void mo623(boolean z) {
    }
}
