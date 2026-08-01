package p144;

import androidx.compose.foundation.draganddrop.AbstractC0455;
import java.util.List;
import kotlin.collections.EmptyList;

/* JADX INFO: renamed from: 飘花落叶言子兰楪苏哲世.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7547 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public C7549 f20433;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final boolean f20434;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public boolean f20435;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final List f20436;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final List f20437;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final AbstractC0455 f20438;

    public AbstractC7547(AbstractC0455 abstractC0455, boolean z) {
        abstractC0455.getClass();
        this.f20438 = abstractC0455;
        EmptyList emptyList = EmptyList.INSTANCE;
        this.f20437 = emptyList;
        this.f20436 = emptyList;
        this.f20435 = z;
        this.f20434 = false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public abstract void mo66(C7550 c7550);

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public abstract void mo67(C7550 c7550);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public abstract void mo68();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public abstract void mo69();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final boolean m12749() {
        C7549 c7549 = this.f20433;
        if (c7549 == null || c7549.f20442) {
            return this.f20434;
        }
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final boolean m12750() {
        C7549 c7549 = this.f20433;
        if (c7549 == null || c7549.f20442) {
            return this.f20435;
        }
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final void m12751() {
        C7549 c7549 = this.f20433;
        if (c7549 == null || !c7549.f20440.remove(this)) {
            return;
        }
        C7558 c7558 = c7549.f20441;
        c7558.getClass();
        if (equals(c7558.f20460)) {
            if (c7558.f20469 == -1) {
                mo69();
            }
            c7558.f20460 = null;
            c7558.f20469 = 0;
            c7558.f20468 = null;
        }
        c7558.f20462.remove(this);
        c7558.f20461.remove(this);
        this.f20433 = null;
        c7558.m12760();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final void m12753(boolean z) {
        C7558 c7558;
        if (this.f20435 == z) {
            return;
        }
        this.f20435 = z;
        C7549 c7549 = this.f20433;
        if (c7549 == null || (c7558 = c7549.f20441) == null) {
            return;
        }
        c7558.m12760();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public void m12752() {
    }
}
