package p274t;

import android.view.View;
import android.view.WindowInsets;
import androidx.compose.runtime.AbstractC0468c0;
import androidx.compose.runtime.AbstractC0497g1;
import androidx.compose.runtime.C0476d1;
import androidx.compose.runtime.InterfaceC0469c1;
import androidx.compose.runtime.InterfaceC0572r;
import java.util.WeakHashMap;
import p010a9.InterfaceC0184l;
import p024b9.AbstractC1043k;
import p119i1.AbstractC3137l;
import p165l1.AbstractC4510p;
import p179m2.AbstractC4854i0;
import p252r3.C6475f;
import p274t.C7898s3;
import p336x3.AbstractC9428u;
import p336x3.C9377c;
import p336x3.C9408m0;

/* JADX INFO: renamed from: t.s3 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C7898s3 {

    /* JADX INFO: renamed from: A */
    public static boolean f26307A;

    /* JADX INFO: renamed from: x */
    public static final a f26308x = new a(null);

    /* JADX INFO: renamed from: y */
    public static final int f26309y = 8;

    /* JADX INFO: renamed from: z */
    public static final WeakHashMap f26310z = new WeakHashMap();

    /* JADX INFO: renamed from: a */
    public final C7799a f26311a;

    /* JADX INFO: renamed from: b */
    public final C7799a f26312b;

    /* JADX INFO: renamed from: c */
    public final C7799a f26313c;

    /* JADX INFO: renamed from: d */
    public final C7799a f26314d;

    /* JADX INFO: renamed from: e */
    public final C7799a f26315e;

    /* JADX INFO: renamed from: f */
    public final C7799a f26316f;

    /* JADX INFO: renamed from: g */
    public final C7799a f26317g;

    /* JADX INFO: renamed from: h */
    public final C7799a f26318h;

    /* JADX INFO: renamed from: i */
    public final C7799a f26319i;

    /* JADX INFO: renamed from: j */
    public final C7883p3 f26320j;

    /* JADX INFO: renamed from: k */
    public final InterfaceC7888q3 f26321k;

    /* JADX INFO: renamed from: l */
    public final InterfaceC7888q3 f26322l;

    /* JADX INFO: renamed from: m */
    public final InterfaceC7888q3 f26323m;

    /* JADX INFO: renamed from: n */
    public final C7883p3 f26324n;

    /* JADX INFO: renamed from: o */
    public final C7883p3 f26325o;

    /* JADX INFO: renamed from: p */
    public final C7883p3 f26326p;

    /* JADX INFO: renamed from: q */
    public final C7883p3 f26327q;

    /* JADX INFO: renamed from: r */
    public final C7883p3 f26328r;

    /* JADX INFO: renamed from: s */
    public final C7883p3 f26329s;

    /* JADX INFO: renamed from: t */
    public final C7883p3 f26330t;

    /* JADX INFO: renamed from: u */
    public final boolean f26331u;

    /* JADX INFO: renamed from: v */
    public int f26332v;

    /* JADX INFO: renamed from: w */
    public final RunnableC7856k1 f26333w;

    public C7898s3(C9408m0 c9408m0, View view) {
        C9377c c9377cM36557e;
        C6475f c6475fM36502f;
        a aVar = f26308x;
        this.f26311a = aVar.m30513f(c9408m0, C9408m0.n.m36613b(), "captionBar");
        C7799a c7799aM30513f = aVar.m30513f(c9408m0, C9408m0.n.m36614c(), "displayCutout");
        this.f26312b = c7799aM30513f;
        C7799a c7799aM30513f2 = aVar.m30513f(c9408m0, C9408m0.n.m36615d(), "ime");
        this.f26313c = c7799aM30513f2;
        C7799a c7799aM30513f3 = aVar.m30513f(c9408m0, C9408m0.n.m36617f(), "mandatorySystemGestures");
        this.f26314d = c7799aM30513f3;
        this.f26315e = aVar.m30513f(c9408m0, C9408m0.n.m36618g(), "navigationBars");
        this.f26316f = aVar.m30513f(c9408m0, C9408m0.n.m36619h(), "statusBars");
        C7799a c7799aM30513f4 = aVar.m30513f(c9408m0, C9408m0.n.m36620i(), "systemBars");
        this.f26317g = c7799aM30513f4;
        C7799a c7799aM30513f5 = aVar.m30513f(c9408m0, C9408m0.n.m36621j(), "systemGestures");
        this.f26318h = c7799aM30513f5;
        C7799a c7799aM30513f6 = aVar.m30513f(c9408m0, C9408m0.n.m36622k(), "tappableElement");
        this.f26319i = c7799aM30513f6;
        C7883p3 c7883p3M30619a = AbstractC7928y3.m30619a((c9408m0 == null || (c9377cM36557e = c9408m0.m36557e()) == null || (c6475fM36502f = c9377cM36557e.m36502f()) == null) ? C6475f.f20346e : c6475fM36502f, "waterfall");
        this.f26320j = c7883p3M30619a;
        InterfaceC7888q3 interfaceC7888q3M30521e = AbstractC7903t3.m30521e(AbstractC7903t3.m30521e(c7799aM30513f4, c7799aM30513f2), c7799aM30513f);
        this.f26321k = interfaceC7888q3M30521e;
        InterfaceC7888q3 interfaceC7888q3M30521e2 = AbstractC7903t3.m30521e(AbstractC7903t3.m30521e(AbstractC7903t3.m30521e(c7799aM30513f6, c7799aM30513f3), c7799aM30513f5), c7883p3M30619a);
        this.f26322l = interfaceC7888q3M30521e2;
        this.f26323m = AbstractC7903t3.m30521e(interfaceC7888q3M30521e, interfaceC7888q3M30521e2);
        this.f26324n = aVar.m30514g(c9408m0, C9408m0.n.m36613b(), "captionBarIgnoringVisibility");
        this.f26325o = aVar.m30514g(c9408m0, C9408m0.n.m36618g(), "navigationBarsIgnoringVisibility");
        this.f26326p = aVar.m30514g(c9408m0, C9408m0.n.m36619h(), "statusBarsIgnoringVisibility");
        this.f26327q = aVar.m30514g(c9408m0, C9408m0.n.m36620i(), "systemBarsIgnoringVisibility");
        this.f26328r = aVar.m30514g(c9408m0, C9408m0.n.m36622k(), "tappableElementIgnoringVisibility");
        this.f26329s = aVar.m30514g(c9408m0, C9408m0.n.m36615d(), "imeAnimationTarget");
        this.f26330t = aVar.m30514g(c9408m0, C9408m0.n.m36615d(), "imeAnimationSource");
        Object parent = view.getParent();
        View view2 = parent instanceof View ? (View) parent : null;
        Object tag = view2 != null ? view2.getTag(AbstractC4510p.f13108J) : null;
        Boolean bool = tag instanceof Boolean ? (Boolean) tag : null;
        this.f26331u = bool != null ? bool.booleanValue() : !C7824e0.f26070b;
        this.f26333w = new RunnableC7856k1(this);
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ void m30497j(C7898s3 c7898s3, C9408m0 c9408m0, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        c7898s3.m30505i(c9408m0, i10);
    }

    /* JADX INFO: renamed from: b */
    public final void m30498b(View view) {
        int i10 = this.f26332v - 1;
        this.f26332v = i10;
        if (i10 == 0) {
            AbstractC9428u.m36668r(view, null);
            AbstractC9428u.m36669s(view, null);
            view.removeOnAttachStateChangeListener(this.f26333w);
        }
    }

    /* JADX INFO: renamed from: c */
    public final boolean m30499c() {
        return this.f26331u;
    }

    /* JADX INFO: renamed from: d */
    public final C7799a m30500d() {
        return this.f26312b;
    }

    /* JADX INFO: renamed from: e */
    public final C7799a m30501e() {
        return this.f26315e;
    }

    /* JADX INFO: renamed from: f */
    public final C7799a m30502f() {
        return this.f26316f;
    }

    /* JADX INFO: renamed from: g */
    public final C7799a m30503g() {
        return this.f26317g;
    }

    /* JADX INFO: renamed from: h */
    public final void m30504h(View view) {
        if (this.f26332v == 0) {
            AbstractC9428u.m36668r(view, this.f26333w);
            if (view.isAttachedToWindow()) {
                view.requestApplyInsets();
            }
            view.addOnAttachStateChangeListener(this.f26333w);
            AbstractC9428u.m36669s(view, this.f26333w);
        }
        this.f26332v++;
    }

    /* JADX INFO: renamed from: i */
    public final void m30505i(C9408m0 c9408m0, int i10) {
        if (f26307A) {
            WindowInsets windowInsetsM36569r = c9408m0.m36569r();
            windowInsetsM36569r.getClass();
            c9408m0 = C9408m0.m36551s(windowInsetsM36569r);
        }
        this.f26311a.m30235h(c9408m0, i10);
        this.f26313c.m30235h(c9408m0, i10);
        this.f26312b.m30235h(c9408m0, i10);
        this.f26315e.m30235h(c9408m0, i10);
        this.f26316f.m30235h(c9408m0, i10);
        this.f26317g.m30235h(c9408m0, i10);
        this.f26318h.m30235h(c9408m0, i10);
        this.f26319i.m30235h(c9408m0, i10);
        this.f26314d.m30235h(c9408m0, i10);
        if (i10 == 0) {
            this.f26324n.m30473f(AbstractC7928y3.m30622d(c9408m0.m36559g(C9408m0.n.m36613b())));
            this.f26325o.m30473f(AbstractC7928y3.m30622d(c9408m0.m36559g(C9408m0.n.m36618g())));
            this.f26326p.m30473f(AbstractC7928y3.m30622d(c9408m0.m36559g(C9408m0.n.m36619h())));
            this.f26327q.m30473f(AbstractC7928y3.m30622d(c9408m0.m36559g(C9408m0.n.m36620i())));
            this.f26328r.m30473f(AbstractC7928y3.m30622d(c9408m0.m36559g(C9408m0.n.m36622k())));
            C9377c c9377cM36557e = c9408m0.m36557e();
            if (c9377cM36557e != null) {
                this.f26320j.m30473f(AbstractC7928y3.m30622d(c9377cM36557e.m36502f()));
            }
        }
        AbstractC3137l.f8345e.m11773l();
    }

    /* JADX INFO: renamed from: k */
    public final void m30506k(C9408m0 c9408m0) {
        this.f26330t.m30473f(AbstractC7928y3.m30622d(c9408m0.m36558f(C9408m0.n.m36615d())));
    }

    /* JADX INFO: renamed from: l */
    public final void m30507l(C9408m0 c9408m0) {
        this.f26329s.m30473f(AbstractC7928y3.m30622d(c9408m0.m36558f(C9408m0.n.m36615d())));
    }

    /* JADX INFO: renamed from: t.s3$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {

        /* JADX INFO: renamed from: t.s3$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
        public static final class C10230a implements InterfaceC0469c1 {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ C7898s3 f26334a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ View f26335b;

            public C10230a(C7898s3 c7898s3, View view) {
                this.f26334a = c7898s3;
                this.f26335b = view;
            }

            @Override // androidx.compose.runtime.InterfaceC0469c1
            /* JADX INFO: renamed from: a */
            public void mo1209a() {
                this.f26334a.m30498b(this.f26335b);
            }
        }

        public /* synthetic */ a(AbstractC1043k abstractC1043k) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public static InterfaceC0469c1 m30508a(C7898s3 c7898s3, View view, C0476d1 c0476d1) {
            c7898s3.m30504h(view);
            return new C10230a(c7898s3, view);
        }

        /* JADX INFO: renamed from: d */
        public final C7898s3 m30511d(InterfaceC0572r interfaceC0572r, int i10) {
            if (AbstractC0468c0.m1556j()) {
                AbstractC0468c0.m1559m(-1366542614, i10, -1, "androidx.compose.foundation.layout.WindowInsetsHolder.Companion.current (WindowInsets.android.kt:549)");
            }
            final View view = (View) interfaceC0572r.mo2142A(AbstractC4854i0.m19383h());
            final C7898s3 c7898s3M30512e = m30512e(view);
            boolean zMo2175k = interfaceC0572r.mo2175k(c7898s3M30512e) | interfaceC0572r.mo2175k(view);
            Object objMo2170f = interfaceC0572r.mo2170f();
            if (zMo2175k || objMo2170f == InterfaceC0572r.f1573a.m2191a()) {
                objMo2170f = new InterfaceC0184l() { // from class: t.r3
                    @Override // p010a9.InterfaceC0184l
                    /* JADX INFO: renamed from: m */
                    public final Object mo27m(Object obj) {
                        return C7898s3.a.m30508a(c7898s3M30512e, view, (C0476d1) obj);
                    }
                };
                interfaceC0572r.mo2153L(objMo2170f);
            }
            AbstractC0497g1.m1677a(c7898s3M30512e, (InterfaceC0184l) objMo2170f, interfaceC0572r, 0);
            if (AbstractC0468c0.m1556j()) {
                AbstractC0468c0.m1558l();
            }
            return c7898s3M30512e;
        }

        /* JADX INFO: renamed from: e */
        public final C7898s3 m30512e(View view) {
            C7898s3 c7898s3;
            synchronized (C7898s3.f26310z) {
                try {
                    WeakHashMap weakHashMap = C7898s3.f26310z;
                    Object obj = weakHashMap.get(view);
                    Object obj2 = obj;
                    if (obj == null) {
                        C7898s3 c7898s32 = new C7898s3(null, view, false ? 1 : 0);
                        weakHashMap.put(view, c7898s32);
                        obj2 = c7898s32;
                    }
                    c7898s3 = (C7898s3) obj2;
                } catch (Throwable th) {
                    throw th;
                }
            }
            return c7898s3;
        }

        /* JADX INFO: renamed from: f */
        public final C7799a m30513f(C9408m0 c9408m0, int i10, String str) {
            C7799a c7799a = new C7799a(i10, str);
            if (c9408m0 != null) {
                c7799a.m30235h(c9408m0, i10);
            }
            return c7799a;
        }

        /* JADX INFO: renamed from: g */
        public final C7883p3 m30514g(C9408m0 c9408m0, int i10, String str) {
            C6475f c6475fM36559g;
            if (c9408m0 == null || (c6475fM36559g = c9408m0.m36559g(i10)) == null) {
                c6475fM36559g = C6475f.f20346e;
            }
            return AbstractC7928y3.m30619a(c6475fM36559g, str);
        }

        public a() {
        }
    }

    public /* synthetic */ C7898s3(C9408m0 c9408m0, View view, AbstractC1043k abstractC1043k) {
        this(c9408m0, view);
    }
}
