package p169h0;

import p007B0.C0168A;
import p007B0.C0190d;
import p023E0.AbstractC0277a;
import p041H0.AbstractC0596h0;
import p041H0.AbstractC0601k;
import p041H0.C0606m0;
import p041H0.InterfaceC0597i;
import p047I0.ViewTreeObserverOnGlobalLayoutListenerC0772y;
import p160f3.AbstractC2162v;
import p160f3.C2117U;
import p160f3.C2155q;
import p160f3.InterfaceC2115S;
import p160f3.InterfaceC2160t;
import p190k3.C2455c;
import p216p.C2857n;

/* JADX INFO: renamed from: h0.o */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2206o implements InterfaceC0597i {

    /* JADX INFO: renamed from: e */
    public C2455c f7187e;

    /* JADX INFO: renamed from: f */
    public int f7188f;

    /* JADX INFO: renamed from: h */
    public AbstractC2206o f7190h;

    /* JADX INFO: renamed from: i */
    public AbstractC2206o f7191i;

    /* JADX INFO: renamed from: j */
    public C0606m0 f7192j;

    /* JADX INFO: renamed from: k */
    public AbstractC0596h0 f7193k;

    /* JADX INFO: renamed from: l */
    public boolean f7194l;

    /* JADX INFO: renamed from: m */
    public boolean f7195m;

    /* JADX INFO: renamed from: n */
    public boolean f7196n;

    /* JADX INFO: renamed from: o */
    public boolean f7197o;

    /* JADX INFO: renamed from: p */
    public C0190d f7198p;

    /* JADX INFO: renamed from: q */
    public boolean f7199q;

    /* JADX INFO: renamed from: d */
    public AbstractC2206o f7186d = this;

    /* JADX INFO: renamed from: g */
    public int f7189g = -1;

    /* JADX INFO: renamed from: A0 */
    public void mo1015A0() {
        if (!this.f7199q) {
            AbstractC0277a.m483b("Cannot detach a node that is not attached");
        }
        if (this.f7196n) {
            AbstractC0277a.m483b("Must run runAttachLifecycle() before markAsDetached()");
        }
        if (this.f7197o) {
            AbstractC0277a.m483b("Must run runDetachLifecycle() before markAsDetached()");
        }
        this.f7199q = false;
        C2455c c2455c = this.f7187e;
        if (c2455c != null) {
            AbstractC2162v.m3981c(c2455c, new C0168A("The Modifier.Node was detached", 0));
            this.f7187e = null;
        }
    }

    /* JADX INFO: renamed from: E0 */
    public void mo1016E0() {
        if (!this.f7199q) {
            AbstractC0277a.m483b("reset() called on an unattached node");
        }
        mo4022D0();
    }

    /* JADX INFO: renamed from: F0 */
    public void mo1017F0() {
        if (!this.f7199q) {
            AbstractC0277a.m483b("Must run markAsAttached() prior to runAttachLifecycle");
        }
        if (!this.f7196n) {
            AbstractC0277a.m483b("Must run runAttachLifecycle() only once after markAsAttached()");
        }
        this.f7196n = false;
        mo143B0();
        this.f7197o = true;
    }

    /* JADX INFO: renamed from: G0 */
    public void mo1018G0() throws ClassNotFoundException {
        if (!this.f7199q) {
            AbstractC0277a.m483b("node detached multiple times");
        }
        if (this.f7193k == null) {
            AbstractC0277a.m483b("detach invoked on a node without a coordinator");
        }
        if (!this.f7197o) {
            AbstractC0277a.m483b("Must run runDetachLifecycle() once after runAttachLifecycle() and before markAsDetached()");
        }
        this.f7197o = false;
        C0190d c0190d = this.f7198p;
        if (c0190d != null) {
            c0190d.mo6a();
        }
        mo144C0();
    }

    /* JADX INFO: renamed from: H0 */
    public void mo1019H0(AbstractC2206o abstractC2206o) {
        this.f7186d = abstractC2206o;
    }

    /* JADX INFO: renamed from: I0 */
    public void mo1020I0(AbstractC0596h0 abstractC0596h0) {
        this.f7193k = abstractC0596h0;
    }

    /* JADX INFO: renamed from: x0 */
    public final InterfaceC2160t m4023x0() {
        C2455c c2455c = this.f7187e;
        if (c2455c != null) {
            return c2455c;
        }
        C2455c c2455cM3979a = AbstractC2162v.m3979a(((ViewTreeObserverOnGlobalLayoutListenerC0772y) AbstractC0601k.m1045u(this)).getCoroutineContext().mo1168m(new C2117U((InterfaceC2115S) ((ViewTreeObserverOnGlobalLayoutListenerC0772y) AbstractC0601k.m1045u(this)).getCoroutineContext().mo1166C(C2155q.f7102e))));
        this.f7187e = c2455cM3979a;
        return c2455cM3979a;
    }

    /* JADX INFO: renamed from: y0 */
    public boolean mo656y0() {
        return !(this instanceof C2857n);
    }

    /* JADX INFO: renamed from: z0 */
    public void mo1024z0() {
        if (this.f7199q) {
            AbstractC0277a.m483b("node attached multiple times");
        }
        if (this.f7193k == null) {
            AbstractC0277a.m483b("attach invoked on a node without a coordinator");
        }
        this.f7199q = true;
        this.f7196n = true;
    }

    /* JADX INFO: renamed from: B0 */
    public void mo143B0() {
    }

    /* JADX INFO: renamed from: C0 */
    public void mo144C0() {
    }

    /* JADX INFO: renamed from: D0 */
    public void mo4022D0() {
    }
}
