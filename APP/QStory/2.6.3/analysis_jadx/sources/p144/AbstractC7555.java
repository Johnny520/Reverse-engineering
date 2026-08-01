package p144;

import androidx.activity.C0031;
import kotlinx.coroutines.flow.C5267;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: 飘花落叶言子兰楪苏哲世.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7555 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public boolean f20449;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public C7550 f20450;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m12787() {
        C7550 c7550 = this.f20450;
        if (c7550 == null) {
            C5925.m11311("This input is not added to any dispatcher.");
            return;
        }
        if (!this.f20449) {
            c7550.m12784(this, null);
        }
        if (c7550.f20437) {
            C7559 c7559 = c7550.f20436;
            C0031 c0031 = c7550.f20438;
            c7559.getClass();
            if (equals(c7559.f20463) && -1 == c7559.f20464) {
                AbstractC7548 abstractC7548M12788 = c7559.f20455;
                if (abstractC7548M12788 == null) {
                    abstractC7548M12788 = c7559.m12788(-1);
                }
                c7559.f20455 = null;
                c7559.f20464 = 0;
                c7559.f20463 = null;
                if (abstractC7548M12788 == null) {
                    c0031.f61.f51.run();
                } else {
                    abstractC7548M12788.mo68();
                }
                C5267 c5267 = c7559.f20460;
                c5267.getClass();
                c5267.m10311(null, C7560.f20469);
            }
        }
        this.f20449 = false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public void mo63(boolean z) {
    }
}
