package p356y0;

import p028c1.C0372b;
import p144k.C2195o;
import p249qg.AbstractC3603v;
import p249qg.C3593q;
import p249qg.C3600t0;
import p249qg.InterfaceC3596r0;
import p249qg.InterfaceC3599t;
import p267s1.C3917w;
import p292u1.AbstractC4229a;
import p339x1.AbstractC5614i1;
import p339x1.AbstractC5618k;
import p339x1.C5629n1;
import p339x1.InterfaceC5612i;
import p357y1.ViewTreeObserverOnGlobalLayoutListenerC5934t;
import vg.C4554c;

/* JADX INFO: renamed from: y0.n */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5852n implements InterfaceC5612i {

    /* JADX INFO: renamed from: h */
    public C4554c f23789h;

    /* JADX INFO: renamed from: i */
    public int f23790i;

    /* JADX INFO: renamed from: k */
    public AbstractC5852n f23792k;

    /* JADX INFO: renamed from: l */
    public AbstractC5852n f23793l;

    /* JADX INFO: renamed from: m */
    public C5629n1 f23794m;

    /* JADX INFO: renamed from: n */
    public AbstractC5614i1 f23795n;

    /* JADX INFO: renamed from: o */
    public boolean f23796o;

    /* JADX INFO: renamed from: p */
    public boolean f23797p;

    /* JADX INFO: renamed from: q */
    public boolean f23798q;

    /* JADX INFO: renamed from: r */
    public boolean f23799r;

    /* JADX INFO: renamed from: s */
    public C0372b f23800s;

    /* JADX INFO: renamed from: t */
    public boolean f23801t;

    /* JADX INFO: renamed from: g */
    public AbstractC5852n f23788g = this;

    /* JADX INFO: renamed from: j */
    public int f23791j = -1;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: Y0 */
    public final InterfaceC3599t m10550Y0() {
        C4554c c4554c = this.f23789h;
        if (c4554c != null) {
            return c4554c;
        }
        C4554c c4554cM7547a = AbstractC3603v.m7547a(((ViewTreeObserverOnGlobalLayoutListenerC5934t) AbstractC5618k.m10168x(this)).getCoroutineContext().mo2059e(new C3600t0((InterfaceC3596r0) ((ViewTreeObserverOnGlobalLayoutListenerC5934t) AbstractC5618k.m10168x(this)).getCoroutineContext().mo2062s(C3593q.f11607h))));
        this.f23789h = c4554cM7547a;
        return c4554cM7547a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: Z0 */
    public boolean mo1349Z0() {
        return !(this instanceof C2195o);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a1 */
    public void mo10115a1() {
        if (this.f23801t) {
            AbstractC4229a.m8494b("node attached multiple times");
        }
        if (this.f23795n == null) {
            AbstractC4229a.m8494b("attach invoked on a node without a coordinator");
        }
        this.f23801t = true;
        this.f23798q = true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b1 */
    public void mo10116b1() {
        if (!this.f23801t) {
            AbstractC4229a.m8494b("Cannot detach a node that is not attached");
        }
        if (this.f23798q) {
            AbstractC4229a.m8494b("Must run runAttachLifecycle() before markAsDetached()");
        }
        if (this.f23799r) {
            AbstractC4229a.m8494b("Must run runDetachLifecycle() before markAsDetached()");
        }
        this.f23801t = false;
        C4554c c4554c = this.f23789h;
        if (c4554c != null) {
            AbstractC3603v.m7549c(c4554c, new C3917w("The Modifier.Node was detached", 2));
            this.f23789h = null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f1 */
    public void mo10117f1() {
        if (!this.f23801t) {
            AbstractC4229a.m8494b("reset() called on an unattached node");
        }
        mo1328e1();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g1 */
    public void mo10118g1() {
        if (!this.f23801t) {
            AbstractC4229a.m8494b("Must run markAsAttached() prior to runAttachLifecycle");
        }
        if (!this.f23798q) {
            AbstractC4229a.m8494b("Must run runAttachLifecycle() only once after markAsAttached()");
        }
        this.f23798q = false;
        mo1323c1();
        this.f23799r = true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h1 */
    public void mo10119h1() {
        if (!this.f23801t) {
            AbstractC4229a.m8494b("node detached multiple times");
        }
        if (this.f23795n == null) {
            AbstractC4229a.m8494b("detach invoked on a node without a coordinator");
        }
        if (!this.f23799r) {
            AbstractC4229a.m8494b("Must run runDetachLifecycle() once after runAttachLifecycle() and before markAsDetached()");
        }
        this.f23799r = false;
        C0372b c0372b = this.f23800s;
        if (c0372b != null) {
            c0372b.invoke();
        }
        mo743d1();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i1 */
    public void mo10120i1(AbstractC5852n abstractC5852n) {
        this.f23788g = abstractC5852n;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j1 */
    public void mo10121j1(AbstractC5614i1 abstractC5614i1) {
        this.f23795n = abstractC5614i1;
    }

    /* JADX INFO: renamed from: c1 */
    public void mo1323c1() {
    }

    /* JADX INFO: renamed from: d1 */
    public void mo743d1() {
    }

    /* JADX INFO: renamed from: e1 */
    public void mo1328e1() {
    }
}
