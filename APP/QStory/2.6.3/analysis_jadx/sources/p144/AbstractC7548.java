package p144;

import com.bumptech.glide.AbstractC3056;
import java.util.List;
import kotlin.collections.EmptyList;

/* JADX INFO: renamed from: 飘花落叶言子兰楪苏哲世.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7548 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public C7550 f20428;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final boolean f20429;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public boolean f20430;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final List f20431;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final List f20432;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final AbstractC3056 f20433;

    public AbstractC7548(AbstractC3056 abstractC3056, boolean z) {
        abstractC3056.getClass();
        this.f20433 = abstractC3056;
        EmptyList emptyList = EmptyList.INSTANCE;
        this.f20432 = emptyList;
        this.f20431 = emptyList;
        this.f20430 = z;
        this.f20429 = false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public abstract void mo66(C7551 c7551);

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public abstract void mo67(C7551 c7551);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public abstract void mo68();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public abstract void mo69();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final boolean m12778() {
        C7550 c7550 = this.f20428;
        if (c7550 == null || c7550.f20437) {
            return this.f20429;
        }
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final boolean m12779() {
        C7550 c7550 = this.f20428;
        if (c7550 == null || c7550.f20437) {
            return this.f20430;
        }
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final void m12780() {
        C7550 c7550 = this.f20428;
        if (c7550 == null || !c7550.f20435.remove(this)) {
            return;
        }
        C7559 c7559 = c7550.f20436;
        c7559.getClass();
        if (equals(c7559.f20455)) {
            if (c7559.f20464 == -1) {
                mo69();
            }
            c7559.f20455 = null;
            c7559.f20464 = 0;
            c7559.f20463 = null;
        }
        c7559.f20457.remove(this);
        c7559.f20456.remove(this);
        this.f20428 = null;
        c7559.m12789();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final void m12782(boolean z) {
        C7559 c7559;
        if (this.f20430 == z) {
            return;
        }
        this.f20430 = z;
        C7550 c7550 = this.f20428;
        if (c7550 == null || (c7559 = c7550.f20436) == null) {
            return;
        }
        c7559.m12789();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public void m12781() {
    }
}
