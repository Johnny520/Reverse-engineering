package p179m2;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.view.View;
import androidx.compose.runtime.AbstractC0468c0;
import androidx.compose.runtime.AbstractC0497g1;
import androidx.compose.runtime.AbstractC0506h3;
import androidx.compose.runtime.AbstractC0541m3;
import androidx.compose.runtime.AbstractC0552o0;
import androidx.compose.runtime.C0476d1;
import androidx.compose.runtime.C0513i3;
import androidx.compose.runtime.InterfaceC0469c1;
import androidx.compose.runtime.InterfaceC0514i4;
import androidx.compose.runtime.InterfaceC0531l0;
import androidx.compose.runtime.InterfaceC0572r;
import p003a2.InterfaceC0024a;
import p010a9.InterfaceC0173a;
import p010a9.InterfaceC0184l;
import p010a9.InterfaceC0188p;
import p024b9.AbstractC1067w;
import p057e1.AbstractC1984l;
import p093g4.AbstractC2517b;
import p102h1.AbstractC2840u;
import p172l8.C4699i;
import p172l8.C4700i0;
import p179m2.ViewTreeObserverOnGlobalLayoutListenerC4898r;
import p194n4.AbstractC5492b;
import p251r2.C6464b;
import p251r2.C6466d;
import p376zd.C10010p0;

/* JADX INFO: renamed from: m2.i0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4854i0 {

    /* JADX INFO: renamed from: a */
    public static final AbstractC0506h3 f14422a = AbstractC0552o0.m1978f(null, a.f14428r, 1, null);

    /* JADX INFO: renamed from: b */
    public static final AbstractC0506h3 f14423b = AbstractC0552o0.m1980h(b.f14429r);

    /* JADX INFO: renamed from: c */
    public static final AbstractC0506h3 f14424c = AbstractC0552o0.m1979g(e.f14432r);

    /* JADX INFO: renamed from: d */
    public static final AbstractC0506h3 f14425d = AbstractC0552o0.m1980h(c.f14430r);

    /* JADX INFO: renamed from: e */
    public static final AbstractC0506h3 f14426e = AbstractC0552o0.m1980h(d.f14431r);

    /* JADX INFO: renamed from: f */
    public static final AbstractC0506h3 f14427f = AbstractC0552o0.m1980h(f.f14433r);

    /* JADX INFO: renamed from: m2.i0$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a extends AbstractC1067w implements InterfaceC0173a {

        /* JADX INFO: renamed from: r */
        public static final a f14428r = new a();

        public a() {
            super(0);
        }

        @Override // p010a9.InterfaceC0173a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Configuration invoke() {
            AbstractC4854i0.m19384i("LocalConfiguration");
            throw new C4699i();
        }
    }

    /* JADX INFO: renamed from: m2.i0$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class b extends AbstractC1067w implements InterfaceC0173a {

        /* JADX INFO: renamed from: r */
        public static final b f14429r = new b();

        public b() {
            super(0);
        }

        @Override // p010a9.InterfaceC0173a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Context invoke() {
            AbstractC4854i0.m19384i("LocalContext");
            throw new C4699i();
        }
    }

    /* JADX INFO: renamed from: m2.i0$c */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class c extends AbstractC1067w implements InterfaceC0173a {

        /* JADX INFO: renamed from: r */
        public static final c f14430r = new c();

        public c() {
            super(0);
        }

        @Override // p010a9.InterfaceC0173a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C6464b invoke() {
            AbstractC4854i0.m19384i("LocalImageVectorCache");
            throw new C4699i();
        }
    }

    /* JADX INFO: renamed from: m2.i0$d */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class d extends AbstractC1067w implements InterfaceC0173a {

        /* JADX INFO: renamed from: r */
        public static final d f14431r = new d();

        public d() {
            super(0);
        }

        @Override // p010a9.InterfaceC0173a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C6466d invoke() {
            AbstractC4854i0.m19384i("LocalResourceIdCache");
            throw new C4699i();
        }
    }

    /* JADX INFO: renamed from: m2.i0$e */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class e extends AbstractC1067w implements InterfaceC0184l {

        /* JADX INFO: renamed from: r */
        public static final e f14432r = new e();

        public e() {
            super(1);
        }

        @Override // p010a9.InterfaceC0184l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Resources mo27m(InterfaceC0531l0 interfaceC0531l0) {
            interfaceC0531l0.mo1516d(AbstractC4854i0.m19378c());
            return ((Context) interfaceC0531l0.mo1516d(AbstractC4854i0.m19379d())).getResources();
        }
    }

    /* JADX INFO: renamed from: m2.i0$f */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class f extends AbstractC1067w implements InterfaceC0173a {

        /* JADX INFO: renamed from: r */
        public static final f f14433r = new f();

        public f() {
            super(0);
        }

        @Override // p010a9.InterfaceC0173a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final View invoke() {
            AbstractC4854i0.m19384i("LocalView");
            throw new C4699i();
        }
    }

    /* JADX INFO: renamed from: m2.i0$g */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class g extends AbstractC1067w implements InterfaceC0184l {

        /* JADX INFO: renamed from: r */
        public final /* synthetic */ C4890p1 f14434r;

        /* JADX INFO: renamed from: m2.i0$g$a */
        /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
        public static final class a implements InterfaceC0469c1 {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ C4890p1 f14435a;

            public a(C4890p1 c4890p1) {
                this.f14435a = c4890p1;
            }

            @Override // androidx.compose.runtime.InterfaceC0469c1
            /* JADX INFO: renamed from: a */
            public void mo1209a() {
                this.f14435a.m19536e();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(C4890p1 c4890p1) {
            super(1);
            this.f14434r = c4890p1;
        }

        @Override // p010a9.InterfaceC0184l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC0469c1 mo27m(C0476d1 c0476d1) {
            return new a(this.f14434r);
        }
    }

    /* JADX INFO: renamed from: m2.i0$h */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class h extends AbstractC1067w implements InterfaceC0188p {

        /* JADX INFO: renamed from: r */
        public final /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC4898r f14436r;

        /* JADX INFO: renamed from: s */
        public final /* synthetic */ C4889p0 f14437s;

        /* JADX INFO: renamed from: t */
        public final /* synthetic */ InterfaceC0188p f14438t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(ViewTreeObserverOnGlobalLayoutListenerC4898r viewTreeObserverOnGlobalLayoutListenerC4898r, C4889p0 c4889p0, InterfaceC0188p interfaceC0188p) {
            super(2);
            this.f14436r = viewTreeObserverOnGlobalLayoutListenerC4898r;
            this.f14437s = c4889p0;
            this.f14438t = interfaceC0188p;
        }

        /* JADX INFO: renamed from: a */
        public final void m19394a(InterfaceC0572r interfaceC0572r, int i10) {
            if (!interfaceC0572r.mo2144C((i10 & 3) != 2, i10 & 1)) {
                interfaceC0572r.mo2190z();
                return;
            }
            if (AbstractC0468c0.m1556j()) {
                AbstractC0468c0.m1559m(1059770793, i10, -1, "androidx.compose.ui.platform.ProvideAndroidCompositionLocals.<anonymous> (AndroidCompositionLocals.android.kt:137)");
            }
            AbstractC4870l1.m19436a(this.f14436r, this.f14437s, this.f14438t, interfaceC0572r, 0);
            if (AbstractC0468c0.m1556j()) {
                AbstractC0468c0.m1558l();
            }
        }

        @Override // p010a9.InterfaceC0188p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            m19394a((InterfaceC0572r) obj, ((Number) obj2).intValue());
            return C4700i0.f13910a;
        }
    }

    /* JADX INFO: renamed from: m2.i0$i */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class i extends AbstractC1067w implements InterfaceC0188p {

        /* JADX INFO: renamed from: r */
        public final /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC4898r f14439r;

        /* JADX INFO: renamed from: s */
        public final /* synthetic */ InterfaceC0188p f14440s;

        /* JADX INFO: renamed from: t */
        public final /* synthetic */ int f14441t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(ViewTreeObserverOnGlobalLayoutListenerC4898r viewTreeObserverOnGlobalLayoutListenerC4898r, InterfaceC0188p interfaceC0188p, int i10) {
            super(2);
            this.f14439r = viewTreeObserverOnGlobalLayoutListenerC4898r;
            this.f14440s = interfaceC0188p;
            this.f14441t = i10;
        }

        /* JADX INFO: renamed from: a */
        public final void m19395a(InterfaceC0572r interfaceC0572r, int i10) {
            AbstractC4854i0.m19376a(this.f14439r, this.f14440s, interfaceC0572r, AbstractC0541m3.m1929a(this.f14441t | 1));
        }

        @Override // p010a9.InterfaceC0188p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            m19395a((InterfaceC0572r) obj, ((Number) obj2).intValue());
            return C4700i0.f13910a;
        }
    }

    /* JADX INFO: renamed from: m2.i0$j */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class j extends AbstractC1067w implements InterfaceC0184l {

        /* JADX INFO: renamed from: r */
        public final /* synthetic */ Context f14442r;

        /* JADX INFO: renamed from: s */
        public final /* synthetic */ k f14443s;

        /* JADX INFO: renamed from: m2.i0$j$a */
        /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
        public static final class a implements InterfaceC0469c1 {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ Context f14444a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ k f14445b;

            public a(Context context, k kVar) {
                this.f14444a = context;
                this.f14445b = kVar;
            }

            @Override // androidx.compose.runtime.InterfaceC0469c1
            /* JADX INFO: renamed from: a */
            public void mo1209a() {
                this.f14444a.getApplicationContext().unregisterComponentCallbacks(this.f14445b);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(Context context, k kVar) {
            super(1);
            this.f14442r = context;
            this.f14443s = kVar;
        }

        @Override // p010a9.InterfaceC0184l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC0469c1 mo27m(C0476d1 c0476d1) {
            this.f14442r.getApplicationContext().registerComponentCallbacks(this.f14443s);
            return new a(this.f14442r, this.f14443s);
        }
    }

    /* JADX INFO: renamed from: m2.i0$k */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class k implements ComponentCallbacks2 {

        /* JADX INFO: renamed from: q */
        public final /* synthetic */ Configuration f14446q;

        /* JADX INFO: renamed from: r */
        public final /* synthetic */ C6464b f14447r;

        public k(Configuration configuration, C6464b c6464b) {
            this.f14446q = configuration;
            this.f14447r = c6464b;
        }

        @Override // android.content.ComponentCallbacks
        public void onConfigurationChanged(Configuration configuration) {
            this.f14447r.m25633c(this.f14446q.updateFrom(configuration));
            this.f14446q.setTo(configuration);
        }

        @Override // android.content.ComponentCallbacks
        public void onLowMemory() {
            this.f14447r.m25631a();
        }

        @Override // android.content.ComponentCallbacks2
        public void onTrimMemory(int i10) {
            this.f14447r.m25631a();
        }
    }

    /* JADX INFO: renamed from: m2.i0$l */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class l extends AbstractC1067w implements InterfaceC0184l {

        /* JADX INFO: renamed from: r */
        public final /* synthetic */ Context f14448r;

        /* JADX INFO: renamed from: s */
        public final /* synthetic */ m f14449s;

        /* JADX INFO: renamed from: m2.i0$l$a */
        /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
        public static final class a implements InterfaceC0469c1 {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ Context f14450a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ m f14451b;

            public a(Context context, m mVar) {
                this.f14450a = context;
                this.f14451b = mVar;
            }

            @Override // androidx.compose.runtime.InterfaceC0469c1
            /* JADX INFO: renamed from: a */
            public void mo1209a() {
                this.f14450a.getApplicationContext().unregisterComponentCallbacks(this.f14451b);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(Context context, m mVar) {
            super(1);
            this.f14448r = context;
            this.f14449s = mVar;
        }

        @Override // p010a9.InterfaceC0184l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC0469c1 mo27m(C0476d1 c0476d1) {
            this.f14448r.getApplicationContext().registerComponentCallbacks(this.f14449s);
            return new a(this.f14448r, this.f14449s);
        }
    }

    /* JADX INFO: renamed from: m2.i0$m */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class m implements ComponentCallbacks2 {

        /* JADX INFO: renamed from: q */
        public final /* synthetic */ C6466d f14452q;

        public m(C6466d c6466d) {
            this.f14452q = c6466d;
        }

        @Override // android.content.ComponentCallbacks
        public void onConfigurationChanged(Configuration configuration) {
            this.f14452q.m25640a();
        }

        @Override // android.content.ComponentCallbacks
        public void onLowMemory() {
            this.f14452q.m25640a();
        }

        @Override // android.content.ComponentCallbacks2
        public void onTrimMemory(int i10) {
            this.f14452q.m25640a();
        }
    }

    /* JADX INFO: renamed from: a */
    public static final void m19376a(ViewTreeObserverOnGlobalLayoutListenerC4898r viewTreeObserverOnGlobalLayoutListenerC4898r, InterfaceC0188p interfaceC0188p, InterfaceC0572r interfaceC0572r, int i10) {
        int i11;
        InterfaceC0572r interfaceC0572rMo2181q = interfaceC0572r.mo2181q(-520299287);
        if ((i10 & 6) == 0) {
            i11 = (interfaceC0572rMo2181q.mo2175k(viewTreeObserverOnGlobalLayoutListenerC4898r) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= interfaceC0572rMo2181q.mo2175k(interfaceC0188p) ? 32 : 16;
        }
        if (interfaceC0572rMo2181q.mo2144C((i11 & 19) != 18, i11 & 1)) {
            if (AbstractC0468c0.m1556j()) {
                AbstractC0468c0.m1559m(-520299287, i11, -1, "androidx.compose.ui.platform.ProvideAndroidCompositionLocals (AndroidCompositionLocals.android.kt:98)");
            }
            Context context = viewTreeObserverOnGlobalLayoutListenerC4898r.getContext();
            Object objMo2170f = interfaceC0572rMo2181q.mo2170f();
            InterfaceC0572r.a aVar = InterfaceC0572r.f1573a;
            if (objMo2170f == aVar.m2191a()) {
                objMo2170f = new C4889p0(context);
                interfaceC0572rMo2181q.mo2153L(objMo2170f);
            }
            C4889p0 c4889p0 = (C4889p0) objMo2170f;
            ViewTreeObserverOnGlobalLayoutListenerC4898r.c viewTreeOwners = viewTreeObserverOnGlobalLayoutListenerC4898r.getViewTreeOwners();
            if (viewTreeOwners == null) {
                C10010p0.m38820a("Called when the ViewTreeOwnersAvailability is not yet in Available state");
                return;
            }
            Object objMo2170f2 = interfaceC0572rMo2181q.mo2170f();
            if (objMo2170f2 == aVar.m2191a()) {
                objMo2170f2 = AbstractC4900r1.m19664b(viewTreeObserverOnGlobalLayoutListenerC4898r, viewTreeOwners.m19638b());
                interfaceC0572rMo2181q.mo2153L(objMo2170f2);
            }
            C4890p1 c4890p1 = (C4890p1) objMo2170f2;
            C4700i0 c4700i0 = C4700i0.f13910a;
            boolean zMo2175k = interfaceC0572rMo2181q.mo2175k(c4890p1);
            Object objMo2170f3 = interfaceC0572rMo2181q.mo2170f();
            if (zMo2175k || objMo2170f3 == aVar.m2191a()) {
                objMo2170f3 = new g(c4890p1);
                interfaceC0572rMo2181q.mo2153L(objMo2170f3);
            }
            AbstractC0497g1.m1677a(c4700i0, (InterfaceC0184l) objMo2170f3, interfaceC0572rMo2181q, 6);
            Object objMo2170f4 = interfaceC0572rMo2181q.mo2170f();
            if (objMo2170f4 == aVar.m2191a()) {
                objMo2170f4 = C4938z1.f14948a.m19943a(context) ? new C4875m1(viewTreeObserverOnGlobalLayoutListenerC4898r.getView()) : new C4891p2();
                interfaceC0572rMo2181q.mo2153L(objMo2170f4);
            }
            AbstractC0552o0.m1976d(new C0513i3[]{f14422a.m1696d(viewTreeObserverOnGlobalLayoutListenerC4898r.getConfiguration()), f14423b.m1696d(context), AbstractC2517b.m9025b().m1696d(viewTreeOwners.m19637a()), AbstractC5492b.m22337b().m1696d(viewTreeOwners.m19638b()), AbstractC2840u.m10083f().m1696d(c4890p1), f14427f.m1696d(viewTreeObserverOnGlobalLayoutListenerC4898r.getView()), f14425d.m1696d(m19385j(context, viewTreeObserverOnGlobalLayoutListenerC4898r.getConfiguration(), interfaceC0572rMo2181q, 0)), f14426e.m1696d(m19386k(context, interfaceC0572rMo2181q, 0)), AbstractC4870l1.m19449n().m1696d(Boolean.valueOf(((Boolean) interfaceC0572rMo2181q.mo2142A(AbstractC4870l1.m19450o())).booleanValue() | viewTreeObserverOnGlobalLayoutListenerC4898r.getScrollCaptureInProgress$ui())), AbstractC4870l1.m19445j().m1696d((InterfaceC0024a) objMo2170f4)}, AbstractC1984l.m7164d(1059770793, true, new h(viewTreeObserverOnGlobalLayoutListenerC4898r, c4889p0, interfaceC0188p), interfaceC0572rMo2181q, 54), interfaceC0572rMo2181q, C0513i3.f1416i | 48);
            if (AbstractC0468c0.m1556j()) {
                AbstractC0468c0.m1558l();
            }
        } else {
            interfaceC0572rMo2181q.mo2190z();
        }
        InterfaceC0514i4 interfaceC0514i4Mo2188x = interfaceC0572rMo2181q.mo2188x();
        if (interfaceC0514i4Mo2188x != null) {
            interfaceC0514i4Mo2188x.mo1756a(new i(viewTreeObserverOnGlobalLayoutListenerC4898r, interfaceC0188p, i10));
        }
    }

    /* JADX INFO: renamed from: c */
    public static final AbstractC0506h3 m19378c() {
        return f14422a;
    }

    /* JADX INFO: renamed from: d */
    public static final AbstractC0506h3 m19379d() {
        return f14423b;
    }

    /* JADX INFO: renamed from: e */
    public static final AbstractC0506h3 m19380e() {
        return f14425d;
    }

    /* JADX INFO: renamed from: f */
    public static final AbstractC0506h3 m19381f() {
        return f14426e;
    }

    /* JADX INFO: renamed from: g */
    public static final AbstractC0506h3 m19382g() {
        return f14424c;
    }

    /* JADX INFO: renamed from: h */
    public static final AbstractC0506h3 m19383h() {
        return f14427f;
    }

    /* JADX INFO: renamed from: i */
    public static final Void m19384i(String str) {
        throw new IllegalStateException(("CompositionLocal " + str + " not present").toString());
    }

    /* JADX INFO: renamed from: j */
    public static final C6464b m19385j(Context context, Configuration configuration, InterfaceC0572r interfaceC0572r, int i10) {
        if (AbstractC0468c0.m1556j()) {
            AbstractC0468c0.m1559m(-485908294, i10, -1, "androidx.compose.ui.platform.obtainImageVectorCache (AndroidCompositionLocals.android.kt:174)");
        }
        Object objMo2170f = interfaceC0572r.mo2170f();
        InterfaceC0572r.a aVar = InterfaceC0572r.f1573a;
        if (objMo2170f == aVar.m2191a()) {
            objMo2170f = new C6464b();
            interfaceC0572r.mo2153L(objMo2170f);
        }
        C6464b c6464b = (C6464b) objMo2170f;
        Object objMo2170f2 = interfaceC0572r.mo2170f();
        Object obj = objMo2170f2;
        if (objMo2170f2 == aVar.m2191a()) {
            Configuration configuration2 = new Configuration();
            if (configuration != null) {
                configuration2.setTo(configuration);
            }
            interfaceC0572r.mo2153L(configuration2);
            obj = configuration2;
        }
        Configuration configuration3 = (Configuration) obj;
        Object objMo2170f3 = interfaceC0572r.mo2170f();
        if (objMo2170f3 == aVar.m2191a()) {
            objMo2170f3 = new k(configuration3, c6464b);
            interfaceC0572r.mo2153L(objMo2170f3);
        }
        k kVar = (k) objMo2170f3;
        boolean zMo2175k = interfaceC0572r.mo2175k(context);
        Object objMo2170f4 = interfaceC0572r.mo2170f();
        if (zMo2175k || objMo2170f4 == aVar.m2191a()) {
            objMo2170f4 = new j(context, kVar);
            interfaceC0572r.mo2153L(objMo2170f4);
        }
        AbstractC0497g1.m1677a(c6464b, (InterfaceC0184l) objMo2170f4, interfaceC0572r, 0);
        if (AbstractC0468c0.m1556j()) {
            AbstractC0468c0.m1558l();
        }
        return c6464b;
    }

    /* JADX INFO: renamed from: k */
    public static final C6466d m19386k(Context context, InterfaceC0572r interfaceC0572r, int i10) {
        if (AbstractC0468c0.m1556j()) {
            AbstractC0468c0.m1559m(-1348507246, i10, -1, "androidx.compose.ui.platform.obtainResourceIdCache (AndroidCompositionLocals.android.kt:143)");
        }
        Object objMo2170f = interfaceC0572r.mo2170f();
        InterfaceC0572r.a aVar = InterfaceC0572r.f1573a;
        if (objMo2170f == aVar.m2191a()) {
            objMo2170f = new C6466d();
            interfaceC0572r.mo2153L(objMo2170f);
        }
        C6466d c6466d = (C6466d) objMo2170f;
        Object objMo2170f2 = interfaceC0572r.mo2170f();
        if (objMo2170f2 == aVar.m2191a()) {
            objMo2170f2 = new m(c6466d);
            interfaceC0572r.mo2153L(objMo2170f2);
        }
        m mVar = (m) objMo2170f2;
        boolean zMo2175k = interfaceC0572r.mo2175k(context);
        Object objMo2170f3 = interfaceC0572r.mo2170f();
        if (zMo2175k || objMo2170f3 == aVar.m2191a()) {
            objMo2170f3 = new l(context, mVar);
            interfaceC0572r.mo2153L(objMo2170f3);
        }
        AbstractC0497g1.m1677a(c6466d, (InterfaceC0184l) objMo2170f3, interfaceC0572r, 0);
        if (AbstractC0468c0.m1556j()) {
            AbstractC0468c0.m1558l();
        }
        return c6466d;
    }
}
