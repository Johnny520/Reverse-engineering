package p014b;

import android.os.Build;
import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.lifecycle.AbstractC0668k;
import androidx.lifecycle.InterfaceC0672m;
import androidx.lifecycle.InterfaceC0676o;
import java.util.Iterator;
import java.util.ListIterator;
import p010a9.InterfaceC0173a;
import p010a9.InterfaceC0184l;
import p014b.C0715q;
import p024b9.AbstractC1061t;
import p024b9.AbstractC1067w;
import p024b9.C1055q;
import p172l8.C4700i0;
import p185m8.C5096o;
import p320w3.InterfaceC9168a;

/* JADX INFO: renamed from: b.q */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C0715q {

    /* JADX INFO: renamed from: a */
    public final Runnable f2108a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC9168a f2109b;

    /* JADX INFO: renamed from: c */
    public final C5096o f2110c;

    /* JADX INFO: renamed from: d */
    public AbstractC0714p f2111d;

    /* JADX INFO: renamed from: e */
    public OnBackInvokedCallback f2112e;

    /* JADX INFO: renamed from: f */
    public OnBackInvokedDispatcher f2113f;

    /* JADX INFO: renamed from: g */
    public boolean f2114g;

    /* JADX INFO: renamed from: h */
    public boolean f2115h;

    /* JADX INFO: renamed from: b.q$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a extends AbstractC1067w implements InterfaceC0184l {
        public a() {
            super(1);
        }

        /* JADX INFO: renamed from: a */
        public final void m2819a(C0700b c0700b) {
            c0700b.getClass();
            C0715q.this.m2815n(c0700b);
        }

        @Override // p010a9.InterfaceC0184l
        /* JADX INFO: renamed from: m */
        public /* bridge */ /* synthetic */ Object mo27m(Object obj) {
            m2819a((C0700b) obj);
            return C4700i0.f13910a;
        }
    }

    /* JADX INFO: renamed from: b.q$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class b extends AbstractC1067w implements InterfaceC0184l {
        public b() {
            super(1);
        }

        /* JADX INFO: renamed from: a */
        public final void m2820a(C0700b c0700b) {
            c0700b.getClass();
            C0715q.this.m2814m(c0700b);
        }

        @Override // p010a9.InterfaceC0184l
        /* JADX INFO: renamed from: m */
        public /* bridge */ /* synthetic */ Object mo27m(Object obj) {
            m2820a((C0700b) obj);
            return C4700i0.f13910a;
        }
    }

    /* JADX INFO: renamed from: b.q$c */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class c extends AbstractC1067w implements InterfaceC0173a {
        public c() {
            super(0);
        }

        /* JADX INFO: renamed from: a */
        public final void m2821a() {
            C0715q.this.m2813l();
        }

        @Override // p010a9.InterfaceC0173a
        public /* bridge */ /* synthetic */ Object invoke() {
            m2821a();
            return C4700i0.f13910a;
        }
    }

    /* JADX INFO: renamed from: b.q$d */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class d extends AbstractC1067w implements InterfaceC0173a {
        public d() {
            super(0);
        }

        /* JADX INFO: renamed from: a */
        public final void m2822a() {
            C0715q.this.m2812k();
        }

        @Override // p010a9.InterfaceC0173a
        public /* bridge */ /* synthetic */ Object invoke() {
            m2822a();
            return C4700i0.f13910a;
        }
    }

    /* JADX INFO: renamed from: b.q$e */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class e extends AbstractC1067w implements InterfaceC0173a {
        public e() {
            super(0);
        }

        /* JADX INFO: renamed from: a */
        public final void m2823a() {
            C0715q.this.m2813l();
        }

        @Override // p010a9.InterfaceC0173a
        public /* bridge */ /* synthetic */ Object invoke() {
            m2823a();
            return C4700i0.f13910a;
        }
    }

    /* JADX INFO: renamed from: b.q$f */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class f {

        /* JADX INFO: renamed from: a */
        public static final f f2121a = new f();

        /* JADX INFO: renamed from: a */
        public static void m2824a(InterfaceC0173a interfaceC0173a) {
            interfaceC0173a.getClass();
            interfaceC0173a.invoke();
        }

        /* JADX INFO: renamed from: b */
        public final OnBackInvokedCallback m2825b(final InterfaceC0173a interfaceC0173a) {
            interfaceC0173a.getClass();
            return new OnBackInvokedCallback() { // from class: b.r
                public final void onBackInvoked() {
                    C0715q.f.m2824a(interfaceC0173a);
                }
            };
        }

        /* JADX INFO: renamed from: c */
        public final void m2826c(Object obj, int i10, Object obj2) {
            obj.getClass();
            obj2.getClass();
            ((OnBackInvokedDispatcher) obj).registerOnBackInvokedCallback(i10, (OnBackInvokedCallback) obj2);
        }

        /* JADX INFO: renamed from: d */
        public final void m2827d(Object obj, Object obj2) {
            obj.getClass();
            obj2.getClass();
            ((OnBackInvokedDispatcher) obj).unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj2);
        }
    }

    /* JADX INFO: renamed from: b.q$g */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class g {

        /* JADX INFO: renamed from: a */
        public static final g f2122a = new g();

        /* JADX INFO: renamed from: b.q$g$a */
        /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
        public static final class a implements OnBackAnimationCallback {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ InterfaceC0184l f2123a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ InterfaceC0184l f2124b;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ InterfaceC0173a f2125c;

            /* JADX INFO: renamed from: d */
            public final /* synthetic */ InterfaceC0173a f2126d;

            public a(InterfaceC0184l interfaceC0184l, InterfaceC0184l interfaceC0184l2, InterfaceC0173a interfaceC0173a, InterfaceC0173a interfaceC0173a2) {
                this.f2123a = interfaceC0184l;
                this.f2124b = interfaceC0184l2;
                this.f2125c = interfaceC0173a;
                this.f2126d = interfaceC0173a2;
            }

            public void onBackCancelled() {
                this.f2126d.invoke();
            }

            public void onBackInvoked() {
                this.f2125c.invoke();
            }

            public void onBackProgressed(BackEvent backEvent) {
                backEvent.getClass();
                this.f2124b.mo27m(new C0700b(backEvent));
            }

            public void onBackStarted(BackEvent backEvent) {
                backEvent.getClass();
                this.f2123a.mo27m(new C0700b(backEvent));
            }
        }

        /* JADX INFO: renamed from: a */
        public final OnBackInvokedCallback m2828a(InterfaceC0184l interfaceC0184l, InterfaceC0184l interfaceC0184l2, InterfaceC0173a interfaceC0173a, InterfaceC0173a interfaceC0173a2) {
            interfaceC0184l.getClass();
            interfaceC0184l2.getClass();
            interfaceC0173a.getClass();
            interfaceC0173a2.getClass();
            return new a(interfaceC0184l, interfaceC0184l2, interfaceC0173a, interfaceC0173a2);
        }
    }

    /* JADX INFO: renamed from: b.q$h */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public final class h implements InterfaceC0672m, InterfaceC0701c {

        /* JADX INFO: renamed from: q */
        public final AbstractC0668k f2127q;

        /* JADX INFO: renamed from: r */
        public final AbstractC0714p f2128r;

        /* JADX INFO: renamed from: s */
        public InterfaceC0701c f2129s;

        /* JADX INFO: renamed from: t */
        public final /* synthetic */ C0715q f2130t;

        public h(C0715q c0715q, AbstractC0668k abstractC0668k, AbstractC0714p abstractC0714p) {
            abstractC0668k.getClass();
            abstractC0714p.getClass();
            this.f2130t = c0715q;
            this.f2127q = abstractC0668k;
            this.f2128r = abstractC0714p;
            abstractC0668k.mo2628a(this);
        }

        @Override // p014b.InterfaceC0701c
        public void cancel() {
            this.f2127q.mo2630c(this);
            this.f2128r.m2800h(this);
            InterfaceC0701c interfaceC0701c = this.f2129s;
            if (interfaceC0701c != null) {
                interfaceC0701c.cancel();
            }
            this.f2129s = null;
        }

        @Override // androidx.lifecycle.InterfaceC0672m
        /* JADX INFO: renamed from: j */
        public void mo2593j(InterfaceC0676o interfaceC0676o, AbstractC0668k.a aVar) {
            interfaceC0676o.getClass();
            aVar.getClass();
            if (aVar == AbstractC0668k.a.ON_START) {
                this.f2129s = this.f2130t.m2811j(this.f2128r);
                return;
            }
            if (aVar != AbstractC0668k.a.ON_STOP) {
                if (aVar == AbstractC0668k.a.ON_DESTROY) {
                    cancel();
                }
            } else {
                InterfaceC0701c interfaceC0701c = this.f2129s;
                if (interfaceC0701c != null) {
                    interfaceC0701c.cancel();
                }
            }
        }
    }

    /* JADX INFO: renamed from: b.q$i */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public final class i implements InterfaceC0701c {

        /* JADX INFO: renamed from: q */
        public final AbstractC0714p f2131q;

        /* JADX INFO: renamed from: r */
        public final /* synthetic */ C0715q f2132r;

        public i(C0715q c0715q, AbstractC0714p abstractC0714p) {
            abstractC0714p.getClass();
            this.f2132r = c0715q;
            this.f2131q = abstractC0714p;
        }

        @Override // p014b.InterfaceC0701c
        public void cancel() {
            this.f2132r.f2110c.remove(this.f2131q);
            if (AbstractC1061t.m3842c(this.f2132r.f2111d, this.f2131q)) {
                this.f2131q.m2795c();
                this.f2132r.f2111d = null;
            }
            this.f2131q.m2800h(this);
            InterfaceC0173a interfaceC0173aM2794b = this.f2131q.m2794b();
            if (interfaceC0173aM2794b != null) {
                interfaceC0173aM2794b.invoke();
            }
            this.f2131q.m2801i(null);
        }
    }

    /* JADX INFO: renamed from: b.q$j */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public /* synthetic */ class j extends C1055q implements InterfaceC0173a {
        public j(Object obj) {
            super(0, obj, C0715q.class, "updateEnabledCallbacks", "updateEnabledCallbacks()V", 0);
        }

        @Override // p010a9.InterfaceC0173a
        public /* bridge */ /* synthetic */ Object invoke() {
            m2829y();
            return C4700i0.f13910a;
        }

        /* JADX INFO: renamed from: y */
        public final void m2829y() {
            ((C0715q) this.f3190r).m2818q();
        }
    }

    /* JADX INFO: renamed from: b.q$k */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public /* synthetic */ class k extends C1055q implements InterfaceC0173a {
        public k(Object obj) {
            super(0, obj, C0715q.class, "updateEnabledCallbacks", "updateEnabledCallbacks()V", 0);
        }

        @Override // p010a9.InterfaceC0173a
        public /* bridge */ /* synthetic */ Object invoke() {
            m2830y();
            return C4700i0.f13910a;
        }

        /* JADX INFO: renamed from: y */
        public final void m2830y() {
            ((C0715q) this.f3190r).m2818q();
        }
    }

    public C0715q(Runnable runnable, InterfaceC9168a interfaceC9168a) {
        this.f2108a = runnable;
        this.f2109b = interfaceC9168a;
        this.f2110c = new C5096o();
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 33) {
            this.f2112e = i10 >= 34 ? g.f2122a.m2828a(new a(), new b(), new c(), new d()) : f.f2121a.m2825b(new e());
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m2809h(InterfaceC0676o interfaceC0676o, AbstractC0714p abstractC0714p) {
        interfaceC0676o.getClass();
        abstractC0714p.getClass();
        AbstractC0668k lifecycle = interfaceC0676o.getLifecycle();
        if (lifecycle.mo2629b() == AbstractC0668k.b.f1968q) {
            return;
        }
        abstractC0714p.m2793a(new h(this, lifecycle, abstractC0714p));
        m2818q();
        abstractC0714p.m2801i(new j(this));
    }

    /* JADX INFO: renamed from: i */
    public final void m2810i(AbstractC0714p abstractC0714p) {
        abstractC0714p.getClass();
        m2811j(abstractC0714p);
    }

    /* JADX INFO: renamed from: j */
    public final InterfaceC0701c m2811j(AbstractC0714p abstractC0714p) {
        abstractC0714p.getClass();
        this.f2110c.add(abstractC0714p);
        i iVar = new i(this, abstractC0714p);
        abstractC0714p.m2793a(iVar);
        m2818q();
        abstractC0714p.m2801i(new k(this));
        return iVar;
    }

    /* JADX INFO: renamed from: k */
    public final void m2812k() {
        Object objPrevious;
        AbstractC0714p abstractC0714p = this.f2111d;
        if (abstractC0714p == null) {
            C5096o c5096o = this.f2110c;
            ListIterator<E> listIterator = c5096o.listIterator(c5096o.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    objPrevious = null;
                    break;
                } else {
                    objPrevious = listIterator.previous();
                    if (((AbstractC0714p) objPrevious).m2799g()) {
                        break;
                    }
                }
            }
            abstractC0714p = (AbstractC0714p) objPrevious;
        }
        this.f2111d = null;
        if (abstractC0714p != null) {
            abstractC0714p.m2795c();
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m2813l() {
        Object objPrevious;
        AbstractC0714p abstractC0714p = this.f2111d;
        if (abstractC0714p == null) {
            C5096o c5096o = this.f2110c;
            ListIterator<E> listIterator = c5096o.listIterator(c5096o.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    objPrevious = null;
                    break;
                } else {
                    objPrevious = listIterator.previous();
                    if (((AbstractC0714p) objPrevious).m2799g()) {
                        break;
                    }
                }
            }
            abstractC0714p = (AbstractC0714p) objPrevious;
        }
        this.f2111d = null;
        if (abstractC0714p != null) {
            abstractC0714p.mo2796d();
            return;
        }
        Runnable runnable = this.f2108a;
        if (runnable != null) {
            runnable.run();
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m2814m(C0700b c0700b) {
        Object objPrevious;
        AbstractC0714p abstractC0714p = this.f2111d;
        if (abstractC0714p == null) {
            C5096o c5096o = this.f2110c;
            ListIterator<E> listIterator = c5096o.listIterator(c5096o.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    objPrevious = null;
                    break;
                } else {
                    objPrevious = listIterator.previous();
                    if (((AbstractC0714p) objPrevious).m2799g()) {
                        break;
                    }
                }
            }
            abstractC0714p = (AbstractC0714p) objPrevious;
        }
        if (abstractC0714p != null) {
            abstractC0714p.m2797e(c0700b);
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m2815n(C0700b c0700b) {
        Object objPrevious;
        C5096o c5096o = this.f2110c;
        ListIterator<E> listIterator = c5096o.listIterator(c5096o.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                objPrevious = null;
                break;
            } else {
                objPrevious = listIterator.previous();
                if (((AbstractC0714p) objPrevious).m2799g()) {
                    break;
                }
            }
        }
        AbstractC0714p abstractC0714p = (AbstractC0714p) objPrevious;
        this.f2111d = abstractC0714p;
        if (abstractC0714p != null) {
            abstractC0714p.m2798f(c0700b);
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m2816o(OnBackInvokedDispatcher onBackInvokedDispatcher) {
        onBackInvokedDispatcher.getClass();
        this.f2113f = onBackInvokedDispatcher;
        m2817p(this.f2115h);
    }

    /* JADX INFO: renamed from: p */
    public final void m2817p(boolean z10) {
        OnBackInvokedDispatcher onBackInvokedDispatcher = this.f2113f;
        OnBackInvokedCallback onBackInvokedCallback = this.f2112e;
        if (onBackInvokedDispatcher == null || onBackInvokedCallback == null) {
            return;
        }
        if (z10 && !this.f2114g) {
            f.f2121a.m2826c(onBackInvokedDispatcher, 0, onBackInvokedCallback);
            this.f2114g = true;
        } else {
            if (z10 || !this.f2114g) {
                return;
            }
            f.f2121a.m2827d(onBackInvokedDispatcher, onBackInvokedCallback);
            this.f2114g = false;
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m2818q() {
        boolean z10 = this.f2115h;
        C5096o c5096o = this.f2110c;
        boolean z11 = false;
        if (c5096o == null || !c5096o.isEmpty()) {
            Iterator<E> it = c5096o.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (((AbstractC0714p) it.next()).m2799g()) {
                    z11 = true;
                    break;
                }
            }
        }
        this.f2115h = z11;
        if (z11 != z10) {
            InterfaceC9168a interfaceC9168a = this.f2109b;
            if (interfaceC9168a != null) {
                interfaceC9168a.accept(Boolean.valueOf(z11));
            }
            if (Build.VERSION.SDK_INT >= 33) {
                m2817p(z11);
            }
        }
    }

    public C0715q(Runnable runnable) {
        this(runnable, null);
    }
}
