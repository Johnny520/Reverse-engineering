package androidx.compose.ui;

import androidx.compose.foundation.C1073;
import androidx.compose.ui.node.AbstractC1785;
import androidx.compose.ui.node.AbstractC1794;
import androidx.compose.ui.node.C1790;
import androidx.compose.ui.node.InterfaceC1787;
import androidx.compose.ui.platform.ViewTreeObserverOnGlobalLayoutListenerC1884;
import kotlinx.coroutines.AbstractC5398;
import kotlinx.coroutines.C5450;
import kotlinx.coroutines.C5452;
import kotlinx.coroutines.InterfaceC5400;
import kotlinx.coroutines.InterfaceC5451;
import kotlinx.coroutines.internal.C5350;
import p052.InterfaceC6542;
import p210.AbstractC7935;

/* JADX INFO: renamed from: androidx.compose.ui.飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2128 implements InterfaceC1787 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public boolean f6278;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public InterfaceC6542 f6279;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public boolean f6280;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public boolean f6281;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public boolean f6282;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public AbstractC2128 f6283;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public AbstractC1794 f6285;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public boolean f6286;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public AbstractC2128 f6287;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public C1790 f6288;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public C5350 f6289;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public int f6290;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public AbstractC2128 f6291 = this;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public int f6284 = -1;

    /* JADX INFO: renamed from: 飘花落叶言子哲世兰楪苏 */
    public boolean mo1283() {
        return !(this instanceof C1073);
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲世兰苏楪 */
    public void mo3352() {
        if (this.f6278) {
            AbstractC7935.m13395("node attached multiple times");
        }
        if (this.f6285 == null) {
            AbstractC7935.m13395("attach invoked on a node without a coordinator");
        }
        this.f6278 = true;
        this.f6281 = true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲世苏兰楪, reason: contains not printable characters */
    public final InterfaceC5400 m3857() {
        C5350 c5350 = this.f6289;
        if (c5350 != null) {
            return c5350;
        }
        C5350 c5350M10485 = AbstractC5398.m10485(((ViewTreeObserverOnGlobalLayoutListenerC1884) AbstractC1785.m3337(this)).getCoroutineContext().plus(new C5450((InterfaceC5451) ((ViewTreeObserverOnGlobalLayoutListenerC1884) AbstractC1785.m3337(this)).getCoroutineContext().get(C5452.f15105))));
        this.f6289 = c5350M10485;
        return c5350M10485;
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲兰世楪苏 */
    public void mo3353(AbstractC1794 abstractC1794) {
        this.f6285 = abstractC1794;
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲兰楪世苏 */
    public void mo3355() {
        if (!this.f6278) {
            AbstractC7935.m13395("node detached multiple times");
        }
        if (this.f6285 == null) {
            AbstractC7935.m13395("detach invoked on a node without a coordinator");
        }
        if (!this.f6280) {
            AbstractC7935.m13395("Must run runDetachLifecycle() once after runAttachLifecycle() and before markAsDetached()");
        }
        this.f6280 = false;
        InterfaceC6542 interfaceC6542 = this.f6279;
        if (interfaceC6542 != null) {
            interfaceC6542.invoke();
        }
        mo1125();
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲兰楪苏世 */
    public void mo3356(AbstractC2128 abstractC2128) {
        this.f6291 = abstractC2128;
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲苏兰世楪 */
    public void mo3359() {
        if (!this.f6278) {
            AbstractC7935.m13395("Must run markAsAttached() prior to runAttachLifecycle");
        }
        if (!this.f6281) {
            AbstractC7935.m13395("Must run runAttachLifecycle() only once after markAsAttached()");
        }
        this.f6281 = false;
        mo1100();
        this.f6280 = true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲苏兰楪世 */
    public void mo3360() {
        if (!this.f6278) {
            AbstractC7935.m13395("reset() called on an unattached node");
        }
        mo1118();
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲苏楪世兰 */
    public void mo3361() {
        if (!this.f6278) {
            AbstractC7935.m13395("Cannot detach a node that is not attached");
        }
        if (this.f6281) {
            AbstractC7935.m13395("Must run runAttachLifecycle() before markAsDetached()");
        }
        if (this.f6280) {
            AbstractC7935.m13395("Must run runDetachLifecycle() before markAsDetached()");
        }
        this.f6278 = false;
        C5350 c5350 = this.f6289;
        if (c5350 != null) {
            AbstractC5398.m10505(c5350, new ModifierNodeDetachedCancellationException());
            this.f6289 = null;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲苏世兰楪 */
    public void mo1118() {
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲苏世楪兰 */
    public void mo1125() {
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲苏楪兰世 */
    public void mo1100() {
    }
}
