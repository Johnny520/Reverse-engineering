package p179m2;

import android.view.View;
import androidx.lifecycle.AbstractC0679p0;
import androidx.lifecycle.InterfaceC0676o;
import p010a9.InterfaceC0173a;
import p019b4.AbstractC0991a;
import p019b4.InterfaceC0992b;
import p024b9.AbstractC1067w;
import p024b9.C1050n0;
import p120i2.AbstractC3167a;
import p172l8.C4700i0;
import p215oc.C5706c;

/* JADX INFO: renamed from: m2.f3 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC4842f3 {

    /* JADX INFO: renamed from: a */
    public static final a f14394a = a.f14395a;

    /* JADX INFO: renamed from: m2.f3$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ a f14395a = new a();

        /* JADX INFO: renamed from: a */
        public final InterfaceC4842f3 m19347a() {
            return c.f14400b;
        }
    }

    /* JADX INFO: renamed from: a */
    InterfaceC0173a mo19346a(AbstractC4813a abstractC4813a);

    /* JADX INFO: renamed from: m2.f3$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class b implements InterfaceC4842f3 {

        /* JADX INFO: renamed from: b */
        public static final b f14396b = new b();

        /* JADX INFO: renamed from: m2.f3$b$a */
        /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
        public static final class a extends AbstractC1067w implements InterfaceC0173a {

            /* JADX INFO: renamed from: r */
            public final /* synthetic */ AbstractC4813a f14397r;

            /* JADX INFO: renamed from: s */
            public final /* synthetic */ ViewOnAttachStateChangeListenerC10147b f14398s;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(AbstractC4813a abstractC4813a, ViewOnAttachStateChangeListenerC10147b viewOnAttachStateChangeListenerC10147b) {
                super(0);
                this.f14397r = abstractC4813a;
                this.f14398s = viewOnAttachStateChangeListenerC10147b;
            }

            /* JADX INFO: renamed from: a */
            public final void m19348a() {
                this.f14397r.removeOnAttachStateChangeListener(this.f14398s);
            }

            @Override // p010a9.InterfaceC0173a
            public /* bridge */ /* synthetic */ Object invoke() {
                m19348a();
                return C4700i0.f13910a;
            }
        }

        @Override // p179m2.InterfaceC4842f3
        /* JADX INFO: renamed from: a */
        public InterfaceC0173a mo19346a(AbstractC4813a abstractC4813a) {
            ViewOnAttachStateChangeListenerC10147b viewOnAttachStateChangeListenerC10147b = new ViewOnAttachStateChangeListenerC10147b(abstractC4813a);
            abstractC4813a.addOnAttachStateChangeListener(viewOnAttachStateChangeListenerC10147b);
            return new a(abstractC4813a, viewOnAttachStateChangeListenerC10147b);
        }

        /* JADX INFO: renamed from: m2.f3$b$b, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
        public static final class ViewOnAttachStateChangeListenerC10147b implements View.OnAttachStateChangeListener {

            /* JADX INFO: renamed from: q */
            public final /* synthetic */ AbstractC4813a f14399q;

            public ViewOnAttachStateChangeListenerC10147b(AbstractC4813a abstractC4813a) {
                this.f14399q = abstractC4813a;
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewDetachedFromWindow(View view) {
                this.f14399q.m19267f();
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewAttachedToWindow(View view) {
            }
        }
    }

    /* JADX INFO: renamed from: m2.f3$c */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class c implements InterfaceC4842f3 {

        /* JADX INFO: renamed from: b */
        public static final c f14400b = new c();

        /* JADX INFO: renamed from: m2.f3$c$a */
        /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
        public static final class a extends AbstractC1067w implements InterfaceC0173a {

            /* JADX INFO: renamed from: r */
            public final /* synthetic */ AbstractC4813a f14401r;

            /* JADX INFO: renamed from: s */
            public final /* synthetic */ b f14402s;

            /* JADX INFO: renamed from: t */
            public final /* synthetic */ InterfaceC0992b f14403t;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(AbstractC4813a abstractC4813a, b bVar, InterfaceC0992b interfaceC0992b) {
                super(0);
                this.f14401r = abstractC4813a;
                this.f14402s = bVar;
                this.f14403t = interfaceC0992b;
            }

            /* JADX INFO: renamed from: a */
            public final void m19349a() {
                this.f14401r.removeOnAttachStateChangeListener(this.f14402s);
                AbstractC0991a.m3681e(this.f14401r, this.f14403t);
            }

            @Override // p010a9.InterfaceC0173a
            public /* bridge */ /* synthetic */ Object invoke() {
                m19349a();
                return C4700i0.f13910a;
            }
        }

        @Override // p179m2.InterfaceC4842f3
        /* JADX INFO: renamed from: a */
        public InterfaceC0173a mo19346a(final AbstractC4813a abstractC4813a) {
            b bVar = new b(abstractC4813a);
            abstractC4813a.addOnAttachStateChangeListener(bVar);
            InterfaceC0992b interfaceC0992b = new InterfaceC0992b() { // from class: m2.g3
            };
            AbstractC0991a.m3677a(abstractC4813a, interfaceC0992b);
            return new a(abstractC4813a, bVar, interfaceC0992b);
        }

        /* JADX INFO: renamed from: m2.f3$c$b */
        /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
        public static final class b implements View.OnAttachStateChangeListener {

            /* JADX INFO: renamed from: q */
            public final /* synthetic */ AbstractC4813a f14404q;

            public b(AbstractC4813a abstractC4813a) {
                this.f14404q = abstractC4813a;
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewDetachedFromWindow(View view) {
                if (AbstractC0991a.m3680d(this.f14404q)) {
                    return;
                }
                this.f14404q.m19267f();
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewAttachedToWindow(View view) {
            }
        }
    }

    /* JADX INFO: renamed from: m2.f3$d */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class d implements InterfaceC4842f3 {

        /* JADX INFO: renamed from: b */
        public static final d f14405b = new d();

        /* JADX INFO: renamed from: m2.f3$d$a */
        /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
        public static final class a extends AbstractC1067w implements InterfaceC0173a {

            /* JADX INFO: renamed from: r */
            public final /* synthetic */ AbstractC4813a f14406r;

            /* JADX INFO: renamed from: s */
            public final /* synthetic */ c f14407s;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(AbstractC4813a abstractC4813a, c cVar) {
                super(0);
                this.f14406r = abstractC4813a;
                this.f14407s = cVar;
            }

            /* JADX INFO: renamed from: a */
            public final void m19350a() {
                this.f14406r.removeOnAttachStateChangeListener(this.f14407s);
            }

            @Override // p010a9.InterfaceC0173a
            public /* bridge */ /* synthetic */ Object invoke() {
                m19350a();
                return C4700i0.f13910a;
            }
        }

        /* JADX INFO: renamed from: m2.f3$d$b */
        /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
        public static final class b extends AbstractC1067w implements InterfaceC0173a {

            /* JADX INFO: renamed from: r */
            public final /* synthetic */ C1050n0 f14408r;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(C1050n0 c1050n0) {
                super(0);
                this.f14408r = c1050n0;
            }

            /* JADX INFO: renamed from: a */
            public final void m19351a() {
                ((InterfaceC0173a) this.f14408r.f3208q).invoke();
            }

            @Override // p010a9.InterfaceC0173a
            public /* bridge */ /* synthetic */ Object invoke() {
                m19351a();
                return C4700i0.f13910a;
            }
        }

        @Override // p179m2.InterfaceC4842f3
        /* JADX INFO: renamed from: a */
        public InterfaceC0173a mo19346a(AbstractC4813a abstractC4813a) {
            if (!abstractC4813a.isAttachedToWindow()) {
                C1050n0 c1050n0 = new C1050n0();
                c cVar = new c(abstractC4813a, c1050n0);
                abstractC4813a.addOnAttachStateChangeListener(cVar);
                c1050n0.f3208q = new a(abstractC4813a, cVar);
                return new b(c1050n0);
            }
            InterfaceC0676o interfaceC0676oM2661a = AbstractC0679p0.m2661a(abstractC4813a);
            if (interfaceC0676oM2661a != null) {
                return AbstractC4857i3.m19402c(abstractC4813a, interfaceC0676oM2661a.getLifecycle());
            }
            AbstractC3167a.m11957c("View tree for " + abstractC4813a + " has no ViewTreeLifecycleOwner");
            C5706c.m23089a();
            return null;
        }

        /* JADX INFO: renamed from: m2.f3$d$c */
        /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
        public static final class c implements View.OnAttachStateChangeListener {

            /* JADX INFO: renamed from: q */
            public final /* synthetic */ AbstractC4813a f14409q;

            /* JADX INFO: renamed from: r */
            public final /* synthetic */ C1050n0 f14410r;

            public c(AbstractC4813a abstractC4813a, C1050n0 c1050n0) {
                this.f14409q = abstractC4813a;
                this.f14410r = c1050n0;
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewAttachedToWindow(View view) {
                InterfaceC0676o interfaceC0676oM2661a = AbstractC0679p0.m2661a(this.f14409q);
                AbstractC4813a abstractC4813a = this.f14409q;
                if (interfaceC0676oM2661a != null) {
                    this.f14410r.f3208q = AbstractC4857i3.m19402c(abstractC4813a, interfaceC0676oM2661a.getLifecycle());
                    this.f14409q.removeOnAttachStateChangeListener(this);
                } else {
                    AbstractC3167a.m11957c("View tree for " + abstractC4813a + " has no ViewTreeLifecycleOwner");
                    C5706c.m23089a();
                }
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewDetachedFromWindow(View view) {
            }
        }
    }
}
