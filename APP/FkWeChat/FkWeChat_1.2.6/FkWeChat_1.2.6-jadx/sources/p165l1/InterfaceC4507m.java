package p165l1;

import ec.AbstractC2169p0;
import ec.AbstractC2210z1;
import ec.InterfaceC2165o0;
import ec.InterfaceC2198w1;
import p010a9.InterfaceC0173a;
import p010a9.InterfaceC0184l;
import p010a9.InterfaceC0188p;
import p120i2.AbstractC3167a;
import p166l2.AbstractC4539f1;
import p166l2.AbstractC4557k;
import p166l2.C4567m1;
import p166l2.InterfaceC4553j;

/* JADX INFO: renamed from: l1.m */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC4507m {

    /* JADX INFO: renamed from: a */
    public static final a f13080a = a.f13081b;

    /* JADX INFO: renamed from: l1.m$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public interface b extends InterfaceC4507m {
        @Override // p165l1.InterfaceC4507m
        /* JADX INFO: renamed from: a */
        default Object mo17429a(Object obj, InterfaceC0188p interfaceC0188p) {
            return interfaceC0188p.invoke(obj, this);
        }

        @Override // p165l1.InterfaceC4507m
        /* JADX INFO: renamed from: b */
        default boolean mo17430b(InterfaceC0184l interfaceC0184l) {
            return ((Boolean) interfaceC0184l.mo27m(this)).booleanValue();
        }
    }

    /* JADX INFO: renamed from: a */
    Object mo17429a(Object obj, InterfaceC0188p interfaceC0188p);

    /* JADX INFO: renamed from: b */
    boolean mo17430b(InterfaceC0184l interfaceC0184l);

    /* JADX INFO: renamed from: i */
    default InterfaceC4507m mo17445i(InterfaceC4507m interfaceC4507m) {
        return interfaceC4507m == f13080a ? this : new C4502h(this, interfaceC4507m);
    }

    /* JADX INFO: renamed from: l1.m$c */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static abstract class c implements InterfaceC4553j {

        /* JADX INFO: renamed from: E */
        public static final int f13082E = 8;

        /* JADX INFO: renamed from: A */
        public boolean f13083A;

        /* JADX INFO: renamed from: B */
        public boolean f13084B;

        /* JADX INFO: renamed from: C */
        public InterfaceC0173a f13085C;

        /* JADX INFO: renamed from: D */
        public boolean f13086D;

        /* JADX INFO: renamed from: r */
        public InterfaceC2165o0 f13088r;

        /* JADX INFO: renamed from: s */
        public int f13089s;

        /* JADX INFO: renamed from: u */
        public c f13091u;

        /* JADX INFO: renamed from: v */
        public c f13092v;

        /* JADX INFO: renamed from: w */
        public C4567m1 f13093w;

        /* JADX INFO: renamed from: x */
        public AbstractC4539f1 f13094x;

        /* JADX INFO: renamed from: y */
        public boolean f13095y;

        /* JADX INFO: renamed from: z */
        public boolean f13096z;

        /* JADX INFO: renamed from: q */
        public c f13087q = this;

        /* JADX INFO: renamed from: t */
        public int f13090t = -1;

        /* JADX INFO: renamed from: A2 */
        public final void m17446A2(int i10) {
            this.f13089s = i10;
        }

        /* JADX INFO: renamed from: B2 */
        public final void m17447B2(C4567m1 c4567m1) {
            this.f13093w = c4567m1;
        }

        /* JADX INFO: renamed from: C2 */
        public final void m17448C2(c cVar) {
            this.f13091u = cVar;
        }

        /* JADX INFO: renamed from: D2 */
        public final void m17449D2(boolean z10) {
            this.f13096z = z10;
        }

        /* JADX INFO: renamed from: E2 */
        public final void m17450E2(InterfaceC0173a interfaceC0173a) {
            AbstractC4557k.m18016r(this).mo18175Q(interfaceC0173a);
        }

        /* JADX INFO: renamed from: F2 */
        public void mo17451F2(AbstractC4539f1 abstractC4539f1) {
            this.f13094x = abstractC4539f1;
        }

        /* JADX INFO: renamed from: c2 */
        public final int m17452c2() {
            return this.f13090t;
        }

        /* JADX INFO: renamed from: d2 */
        public final c m17453d2() {
            return this.f13092v;
        }

        /* JADX INFO: renamed from: e2 */
        public final AbstractC4539f1 m17454e2() {
            return this.f13094x;
        }

        /* JADX INFO: renamed from: f2 */
        public final InterfaceC2165o0 m17455f2() {
            InterfaceC2165o0 interfaceC2165o0 = this.f13088r;
            if (interfaceC2165o0 != null) {
                return interfaceC2165o0;
            }
            InterfaceC2165o0 interfaceC2165o0M7878a = AbstractC2169p0.m7878a(AbstractC4557k.m18016r(this).getCoroutineContext().mo1651c0(AbstractC2210z1.m7948a((InterfaceC2198w1) AbstractC4557k.m18016r(this).getCoroutineContext().mo1654h(InterfaceC2198w1.f6022g))));
            this.f13088r = interfaceC2165o0M7878a;
            return interfaceC2165o0M7878a;
        }

        /* JADX INFO: renamed from: g2 */
        public final boolean m17456g2() {
            return this.f13095y;
        }

        /* JADX INFO: renamed from: h2 */
        public final int m17457h2() {
            return this.f13089s;
        }

        /* JADX INFO: renamed from: i2 */
        public final C4567m1 m17458i2() {
            return this.f13093w;
        }

        /* JADX INFO: renamed from: j2 */
        public final c m17459j2() {
            return this.f13091u;
        }

        /* JADX INFO: renamed from: k2 */
        public boolean mo1260k2() {
            return true;
        }

        /* JADX INFO: renamed from: l2 */
        public final boolean m17460l2() {
            return this.f13096z;
        }

        /* JADX INFO: renamed from: m2 */
        public final boolean m17461m2() {
            return this.f13086D;
        }

        /* JADX INFO: renamed from: n2 */
        public void mo17462n2() {
            if (this.f13086D) {
                AbstractC3167a.m11956b("node attached multiple times");
            }
            if (!(this.f13094x != null)) {
                AbstractC3167a.m11956b("attach invoked on a node without a coordinator");
            }
            this.f13086D = true;
            this.f13083A = true;
        }

        /* JADX INFO: renamed from: o2 */
        public void mo17463o2() {
            if (!this.f13086D) {
                AbstractC3167a.m11956b("Cannot detach a node that is not attached");
            }
            if (this.f13083A) {
                AbstractC3167a.m11956b("Must run runAttachLifecycle() before markAsDetached()");
            }
            if (this.f13084B) {
                AbstractC3167a.m11956b("Must run runDetachLifecycle() before markAsDetached()");
            }
            this.f13086D = false;
            InterfaceC2165o0 interfaceC2165o0 = this.f13088r;
            if (interfaceC2165o0 != null) {
                AbstractC2169p0.m7880c(interfaceC2165o0, new C4508n());
                this.f13088r = null;
            }
        }

        /* JADX INFO: renamed from: s2 */
        public void mo17464s2() {
            if (!this.f13086D) {
                AbstractC3167a.m11956b("reset() called on an unattached node");
            }
            mo15375r2();
        }

        /* JADX INFO: renamed from: t2 */
        public void mo17465t2() {
            if (!this.f13086D) {
                AbstractC3167a.m11956b("Must run markAsAttached() prior to runAttachLifecycle");
            }
            if (!this.f13083A) {
                AbstractC3167a.m11956b("Must run runAttachLifecycle() only once after markAsAttached()");
            }
            this.f13083A = false;
            mo1377p2();
            this.f13084B = true;
        }

        /* JADX INFO: renamed from: u2 */
        public void mo17466u2() {
            if (!this.f13086D) {
                AbstractC3167a.m11956b("node detached multiple times");
            }
            if (!(this.f13094x != null)) {
                AbstractC3167a.m11956b("detach invoked on a node without a coordinator");
            }
            if (!this.f13084B) {
                AbstractC3167a.m11956b("Must run runDetachLifecycle() once after runAttachLifecycle() and before markAsDetached()");
            }
            this.f13084B = false;
            InterfaceC0173a interfaceC0173a = this.f13085C;
            if (interfaceC0173a != null) {
                interfaceC0173a.invoke();
            }
            mo1378q2();
        }

        /* JADX INFO: renamed from: v2 */
        public final void m17467v2(int i10) {
            this.f13090t = i10;
        }

        /* JADX INFO: renamed from: w2 */
        public void mo17468w2(c cVar) {
            this.f13087q = cVar;
        }

        /* JADX INFO: renamed from: x2 */
        public final void m17469x2(c cVar) {
            this.f13092v = cVar;
        }

        /* JADX INFO: renamed from: y2 */
        public final void m17470y2(InterfaceC0173a interfaceC0173a) {
            this.f13085C = interfaceC0173a;
        }

        @Override // p166l2.InterfaceC4553j
        /* JADX INFO: renamed from: z */
        public final c mo17471z() {
            return this.f13087q;
        }

        /* JADX INFO: renamed from: z2 */
        public final void m17472z2(boolean z10) {
            this.f13095y = z10;
        }

        /* JADX INFO: renamed from: p2 */
        public void mo1377p2() {
        }

        /* JADX INFO: renamed from: q2 */
        public void mo1378q2() {
        }

        /* JADX INFO: renamed from: r2 */
        public void mo15375r2() {
        }
    }

    /* JADX INFO: renamed from: l1.m$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a implements InterfaceC4507m {

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ a f13081b = new a();

        @Override // p165l1.InterfaceC4507m
        /* JADX INFO: renamed from: b */
        public boolean mo17430b(InterfaceC0184l interfaceC0184l) {
            return true;
        }

        public String toString() {
            return "Modifier";
        }

        @Override // p165l1.InterfaceC4507m
        /* JADX INFO: renamed from: i */
        public InterfaceC4507m mo17445i(InterfaceC4507m interfaceC4507m) {
            return interfaceC4507m;
        }

        @Override // p165l1.InterfaceC4507m
        /* JADX INFO: renamed from: a */
        public Object mo17429a(Object obj, InterfaceC0188p interfaceC0188p) {
            return obj;
        }
    }
}
