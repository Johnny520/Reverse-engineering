package p117i0;

import p015b0.C0136d0;
import p015b0.C0154t;
import p069f.AbstractC0959s0;
import p069f.C0945l0;
import p071f1.AbstractC1018n0;
import p085fg.InterfaceC1231l;
import p243q9.C3465a;
import p322w0.AbstractC4662m;
import sg.InterfaceC3975g;
import sg.InterfaceC3984p;
import tf.AbstractC4166m;

/* JADX INFO: renamed from: i0.f2 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1830f2 extends AbstractC1018n0 {

    /* JADX INFO: renamed from: h */
    public Object f6064h;

    /* JADX INFO: renamed from: i */
    public Object f6065i;

    /* JADX INFO: renamed from: j */
    public C0945l0 f6066j;

    /* JADX INFO: renamed from: k */
    public C0945l0 f6067k;

    /* JADX INFO: renamed from: l */
    public InterfaceC3984p f6068l;

    /* JADX INFO: renamed from: m */
    public final C0136d0 f6069m;

    /* JADX INFO: renamed from: n */
    public final C3465a f6070n;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.Collection] */
    public C1830f2() {
        super(1);
        this.f6069m = new C0136d0(this, 20);
        C0154t c0154t = new C0154t(this, 12);
        AbstractC4662m.m9124e(AbstractC4662m.f15510a);
        synchronized (AbstractC4662m.f15512c) {
            AbstractC4662m.f15517h = AbstractC4166m.m8398G1(AbstractC4662m.f15517h, c0154t);
        }
        this.f6070n = new C3465a(c0154t, 10);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p071f1.AbstractC1018n0
    /* JADX INFO: renamed from: g */
    public final void mo2620g(InterfaceC3984p interfaceC3984p) {
        this.f6065i = null;
        this.f6067k = null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p071f1.AbstractC1018n0
    /* JADX INFO: renamed from: h */
    public final void mo2621h() {
        synchronized (this.f3204g) {
            try {
                this.f6064h = this.f6065i;
                if (this.f6067k == null) {
                    this.f6066j = null;
                } else {
                    if (this.f6066j == null) {
                        C0945l0 c0945l0 = AbstractC0959s0.f3019a;
                        this.f6066j = new C0945l0();
                    }
                    C0945l0 c0945l02 = this.f6066j;
                    this.f6066j = this.f6067k;
                    this.f6067k = c0945l02;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p071f1.AbstractC1018n0
    /* JADX INFO: renamed from: j */
    public final void mo2622j() {
        this.f6070n.m7269e();
        this.f6065i = null;
        this.f6067k = null;
        synchronized (this.f3204g) {
            this.f6068l = null;
            this.f6064h = null;
            this.f6066j = null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p071f1.AbstractC1018n0
    /* JADX INFO: renamed from: n */
    public final InterfaceC1231l mo2625n(InterfaceC3984p interfaceC3984p) {
        InterfaceC3984p interfaceC3984p2 = this.f6068l;
        if (interfaceC3984p2 != null && !interfaceC3984p2.equals(interfaceC3984p)) {
            AbstractC1861n1.m4584b("Requested a SingleSubscriptionSnapshotFlowManager to manage multiple subscriptions");
        }
        this.f6068l = interfaceC3984p;
        return this.f6069m;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p071f1.AbstractC1018n0
    /* JADX INFO: renamed from: o */
    public final void mo2626o(InterfaceC3975g interfaceC3975g) {
        this.f6068l = null;
        this.f6065i = null;
        this.f6067k = null;
        mo2621h();
    }
}
