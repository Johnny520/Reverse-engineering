package androidx.compose.ui;

import androidx.compose.foundation.C1073;
import androidx.compose.ui.node.AbstractC1785;
import androidx.compose.ui.node.AbstractC1794;
import androidx.compose.ui.node.C1790;
import androidx.compose.ui.node.InterfaceC1787;
import androidx.compose.ui.platform.ViewTreeObserverOnGlobalLayoutListenerC1884;
import kotlinx.coroutines.AbstractC5399;
import kotlinx.coroutines.C5451;
import kotlinx.coroutines.C5453;
import kotlinx.coroutines.InterfaceC5401;
import kotlinx.coroutines.InterfaceC5452;
import kotlinx.coroutines.internal.C5351;
import p052.InterfaceC6543;
import p210.AbstractC7936;

/* JADX INFO: renamed from: androidx.compose.ui.飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2128 implements InterfaceC1787 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public boolean f6279;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public InterfaceC6543 f6280;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public boolean f6281;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public boolean f6282;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public boolean f6283;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public AbstractC2128 f6284;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public AbstractC1794 f6286;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public boolean f6287;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public AbstractC2128 f6288;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public C1790 f6289;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public C5351 f6290;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public int f6291;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public AbstractC2128 f6292 = this;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public int f6285 = -1;

    /* JADX INFO: renamed from: 飘花落叶言子哲世兰楪苏 */
    public boolean mo1293() {
        return !(this instanceof C1073);
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲世兰苏楪 */
    public void mo3362() {
        if (this.f6279) {
            AbstractC7936.m13423("node attached multiple times");
        }
        if (this.f6286 == null) {
            AbstractC7936.m13423("attach invoked on a node without a coordinator");
        }
        this.f6279 = true;
        this.f6282 = true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲世苏兰楪, reason: contains not printable characters */
    public final InterfaceC5401 m3867() {
        C5351 c5351 = this.f6290;
        if (c5351 != null) {
            return c5351;
        }
        C5351 c5351M10489 = AbstractC5399.m10489(((ViewTreeObserverOnGlobalLayoutListenerC1884) AbstractC1785.m3347(this)).getCoroutineContext().plus(new C5451((InterfaceC5452) ((ViewTreeObserverOnGlobalLayoutListenerC1884) AbstractC1785.m3347(this)).getCoroutineContext().get(C5453.f15105))));
        this.f6290 = c5351M10489;
        return c5351M10489;
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲兰世楪苏 */
    public void mo3363(AbstractC1794 abstractC1794) {
        this.f6286 = abstractC1794;
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲兰楪世苏 */
    public void mo3365() {
        if (!this.f6279) {
            AbstractC7936.m13423("node detached multiple times");
        }
        if (this.f6286 == null) {
            AbstractC7936.m13423("detach invoked on a node without a coordinator");
        }
        if (!this.f6281) {
            AbstractC7936.m13423("Must run runDetachLifecycle() once after runAttachLifecycle() and before markAsDetached()");
        }
        this.f6281 = false;
        InterfaceC6543 interfaceC6543 = this.f6280;
        if (interfaceC6543 != null) {
            interfaceC6543.invoke();
        }
        mo1126();
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲兰楪苏世 */
    public void mo3366(AbstractC2128 abstractC2128) {
        this.f6292 = abstractC2128;
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲苏兰世楪 */
    public void mo3369() {
        if (!this.f6279) {
            AbstractC7936.m13423("Must run markAsAttached() prior to runAttachLifecycle");
        }
        if (!this.f6282) {
            AbstractC7936.m13423("Must run runAttachLifecycle() only once after markAsAttached()");
        }
        this.f6282 = false;
        mo1101();
        this.f6281 = true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲苏兰楪世 */
    public void mo3370() {
        if (!this.f6279) {
            AbstractC7936.m13423("reset() called on an unattached node");
        }
        mo1119();
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲苏楪世兰 */
    public void mo3371() {
        if (!this.f6279) {
            AbstractC7936.m13423("Cannot detach a node that is not attached");
        }
        if (this.f6282) {
            AbstractC7936.m13423("Must run runAttachLifecycle() before markAsDetached()");
        }
        if (this.f6281) {
            AbstractC7936.m13423("Must run runDetachLifecycle() before markAsDetached()");
        }
        this.f6279 = false;
        C5351 c5351 = this.f6290;
        if (c5351 != null) {
            AbstractC5399.m10509(c5351, new ModifierNodeDetachedCancellationException());
            this.f6290 = null;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲苏世兰楪 */
    public void mo1119() {
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲苏世楪兰 */
    public void mo1126() {
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲苏楪兰世 */
    public void mo1101() {
    }
}
