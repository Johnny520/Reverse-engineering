package androidx.compose.p001ui;

import androidx.compose.foundation.C1911;
import androidx.compose.p001ui.node.AbstractC2620;
import androidx.compose.p001ui.node.AbstractC2629;
import androidx.compose.p001ui.node.C2625;
import androidx.compose.p001ui.node.InterfaceC2622;
import androidx.compose.p001ui.platform.ViewTreeObserverOnGlobalLayoutListenerC2719;
import kotlinx.coroutines.AbstractC6231;
import kotlinx.coroutines.C6283;
import kotlinx.coroutines.C6285;
import kotlinx.coroutines.InterfaceC6233;
import kotlinx.coroutines.InterfaceC6284;
import kotlinx.coroutines.internal.C6183;
import p068.InterfaceC7372;
import p226.AbstractC8765;

/* JADX INFO: renamed from: androidx.compose.ui.飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2961 implements InterfaceC2622 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public boolean f6624;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public InterfaceC7372 f6625;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public boolean f6626;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public boolean f6627;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public boolean f6628;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public AbstractC2961 f6629;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public AbstractC2629 f6631;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public boolean f6632;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public AbstractC2961 f6633;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public C2625 f6634;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public C6183 f6635;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public int f6636;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public AbstractC2961 f6637 = this;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public int f6630 = -1;

    /* JADX INFO: renamed from: 飘花落叶言子哲世兰楪苏 */
    public boolean mo1853() {
        return !(this instanceof C1911);
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲世兰苏楪 */
    public void mo3922() {
        if (this.f6624) {
            AbstractC8765.m13982("node attached multiple times");
        }
        if (this.f6631 == null) {
            AbstractC8765.m13982("attach invoked on a node without a coordinator");
        }
        this.f6624 = true;
        this.f6627 = true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲世苏兰楪, reason: contains not printable characters */
    public final InterfaceC6233 m4427() {
        C6183 c6183 = this.f6635;
        if (c6183 != null) {
            return c6183;
        }
        C6183 c6183M11048 = AbstractC6231.m11048(((ViewTreeObserverOnGlobalLayoutListenerC2719) AbstractC2620.m3907(this)).getCoroutineContext().plus(new C6283((InterfaceC6284) ((ViewTreeObserverOnGlobalLayoutListenerC2719) AbstractC2620.m3907(this)).getCoroutineContext().get(C6285.f15450))));
        this.f6635 = c6183M11048;
        return c6183M11048;
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲兰世楪苏 */
    public void mo3923(AbstractC2629 abstractC2629) {
        this.f6631 = abstractC2629;
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲兰楪世苏 */
    public void mo3925() {
        if (!this.f6624) {
            AbstractC8765.m13982("node detached multiple times");
        }
        if (this.f6631 == null) {
            AbstractC8765.m13982("detach invoked on a node without a coordinator");
        }
        if (!this.f6626) {
            AbstractC8765.m13982("Must run runDetachLifecycle() once after runAttachLifecycle() and before markAsDetached()");
        }
        this.f6626 = false;
        InterfaceC7372 interfaceC7372 = this.f6625;
        if (interfaceC7372 != null) {
            interfaceC7372.invoke();
        }
        mo1686();
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲兰楪苏世 */
    public void mo3926(AbstractC2961 abstractC2961) {
        this.f6637 = abstractC2961;
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲苏兰世楪 */
    public void mo3929() {
        if (!this.f6624) {
            AbstractC8765.m13982("Must run markAsAttached() prior to runAttachLifecycle");
        }
        if (!this.f6627) {
            AbstractC8765.m13982("Must run runAttachLifecycle() only once after markAsAttached()");
        }
        this.f6627 = false;
        mo1661();
        this.f6626 = true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲苏兰楪世 */
    public void mo3930() {
        if (!this.f6624) {
            AbstractC8765.m13982("reset() called on an unattached node");
        }
        mo1679();
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲苏楪世兰 */
    public void mo3931() {
        if (!this.f6624) {
            AbstractC8765.m13982("Cannot detach a node that is not attached");
        }
        if (this.f6627) {
            AbstractC8765.m13982("Must run runAttachLifecycle() before markAsDetached()");
        }
        if (this.f6626) {
            AbstractC8765.m13982("Must run runDetachLifecycle() before markAsDetached()");
        }
        this.f6624 = false;
        C6183 c6183 = this.f6635;
        if (c6183 != null) {
            AbstractC6231.m11068(c6183, new ModifierNodeDetachedCancellationException());
            this.f6635 = null;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲苏世兰楪 */
    public void mo1679() {
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲苏世楪兰 */
    public void mo1686() {
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲苏楪兰世 */
    public void mo1661() {
    }
}
