package p160;

import com.bumptech.glide.AbstractC3888;
import java.util.List;
import kotlin.collections.EmptyList;

/* JADX INFO: renamed from: 飘花落叶言子兰楪苏哲世.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8377 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public C8379 f20773;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final boolean f20774;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public boolean f20775;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final List f20776;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final List f20777;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final AbstractC3888 f20778;

    public AbstractC8377(AbstractC3888 abstractC3888, boolean z) {
        abstractC3888.getClass();
        this.f20778 = abstractC3888;
        EmptyList emptyList = EmptyList.INSTANCE;
        this.f20777 = emptyList;
        this.f20776 = emptyList;
        this.f20775 = z;
        this.f20774 = false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public abstract void mo626(C8380 c8380);

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public abstract void mo627(C8380 c8380);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public abstract void mo628();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public abstract void mo629();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final boolean m13337() {
        C8379 c8379 = this.f20773;
        if (c8379 == null || c8379.f20782) {
            return this.f20774;
        }
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final boolean m13338() {
        C8379 c8379 = this.f20773;
        if (c8379 == null || c8379.f20782) {
            return this.f20775;
        }
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final void m13339() {
        C8379 c8379 = this.f20773;
        if (c8379 == null || !c8379.f20780.remove(this)) {
            return;
        }
        C8388 c8388 = c8379.f20781;
        c8388.getClass();
        if (equals(c8388.f20800)) {
            if (c8388.f20809 == -1) {
                mo629();
            }
            c8388.f20800 = null;
            c8388.f20809 = 0;
            c8388.f20808 = null;
        }
        c8388.f20802.remove(this);
        c8388.f20801.remove(this);
        this.f20773 = null;
        c8388.m13348();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final void m13341(boolean z) {
        C8388 c8388;
        if (this.f20775 == z) {
            return;
        }
        this.f20775 = z;
        C8379 c8379 = this.f20773;
        if (c8379 == null || (c8388 = c8379.f20781) == null) {
            return;
        }
        c8388.m13348();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public void m13340() {
    }
}
