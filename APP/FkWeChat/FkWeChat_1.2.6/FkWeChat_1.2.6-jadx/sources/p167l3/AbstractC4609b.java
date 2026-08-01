package p167l3;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.Region;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import androidx.compose.runtime.AbstractC0482e0;
import androidx.compose.runtime.InterfaceC0544n;
import androidx.lifecycle.AbstractC0679p0;
import androidx.lifecycle.InterfaceC0676o;
import ec.AbstractC2148k;
import ec.InterfaceC2165o0;
import java.util.List;
import p010a9.InterfaceC0173a;
import p010a9.InterfaceC0184l;
import p010a9.InterfaceC0188p;
import p024b9.AbstractC1043k;
import p024b9.AbstractC1067w;
import p058e2.AbstractC2002d;
import p058e2.C2000b;
import p073f2.AbstractC2258o0;
import p080f9.AbstractC2368o;
import p120i2.AbstractC3167a;
import p121i3.AbstractC3171a0;
import p121i3.AbstractC3177g;
import p121i3.AbstractC3186p;
import p121i3.C3173c;
import p121i3.C3185o;
import p121i3.C3189s;
import p121i3.InterfaceC3175e;
import p135j2.AbstractC3545l1;
import p135j2.AbstractC3581x;
import p135j2.AbstractC3588z0;
import p135j2.InterfaceC3555o0;
import p135j2.InterfaceC3558p0;
import p135j2.InterfaceC3561q0;
import p135j2.InterfaceC3566s;
import p135j2.InterfaceC3578w;
import p165l1.C4503i;
import p165l1.InterfaceC4507m;
import p166l2.AbstractC4539f1;
import p166l2.C4554j0;
import p166l2.C4586s1;
import p166l2.InterfaceC4580q1;
import p166l2.InterfaceC4583r1;
import p167l3.AbstractC4609b;
import p172l8.AbstractC4713t;
import p172l8.C4700i0;
import p179m2.AbstractC4912t3;
import p179m2.ViewTreeObserverOnGlobalLayoutListenerC4898r;
import p181m4.AbstractC4977n;
import p181m4.InterfaceC4973j;
import p221p1.AbstractC5927j;
import p228p8.InterfaceC5976f;
import p242q8.AbstractC6325c;
import p250r1.C6455e;
import p252r3.C6475f;
import p257r8.AbstractC6544m;
import p265s1.AbstractC7050a3;
import p265s1.AbstractC7072f0;
import p265s1.InterfaceC7088i1;
import p277t2.AbstractC8093v;
import p277t2.InterfaceC8074h0;
import p290u1.InterfaceC8487f;
import p336x3.AbstractC9428u;
import p336x3.C9389g;
import p336x3.C9408m0;
import p336x3.C9436y;
import p336x3.InterfaceC9392h;
import p376zd.C10010p0;

/* JADX INFO: renamed from: l3.b */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4609b extends ViewGroup implements InterfaceC0544n, InterfaceC4583r1, InterfaceC9392h {

    /* JADX INFO: renamed from: R */
    public static final c f13636R = new c(null);

    /* JADX INFO: renamed from: S */
    public static final int f13637S = 8;

    /* JADX INFO: renamed from: T */
    public static final InterfaceC0184l f13638T = b.f13667r;

    /* JADX INFO: renamed from: A */
    public InterfaceC3175e f13639A;

    /* JADX INFO: renamed from: B */
    public InterfaceC0184l f13640B;

    /* JADX INFO: renamed from: C */
    public InterfaceC0676o f13641C;

    /* JADX INFO: renamed from: D */
    public InterfaceC4973j f13642D;

    /* JADX INFO: renamed from: E */
    public final int[] f13643E;

    /* JADX INFO: renamed from: F */
    public long f13644F;

    /* JADX INFO: renamed from: G */
    public C9408m0 f13645G;

    /* JADX INFO: renamed from: H */
    public InterfaceC0184l f13646H;

    /* JADX INFO: renamed from: I */
    public final InterfaceC0173a f13647I;

    /* JADX INFO: renamed from: J */
    public final InterfaceC0173a f13648J;

    /* JADX INFO: renamed from: K */
    public InterfaceC0184l f13649K;

    /* JADX INFO: renamed from: L */
    public final int[] f13650L;

    /* JADX INFO: renamed from: M */
    public int f13651M;

    /* JADX INFO: renamed from: N */
    public int f13652N;

    /* JADX INFO: renamed from: O */
    public final C9389g f13653O;

    /* JADX INFO: renamed from: P */
    public boolean f13654P;

    /* JADX INFO: renamed from: Q */
    public final C4554j0 f13655Q;

    /* JADX INFO: renamed from: q */
    public final int f13656q;

    /* JADX INFO: renamed from: r */
    public final C2000b f13657r;

    /* JADX INFO: renamed from: s */
    public final View f13658s;

    /* JADX INFO: renamed from: t */
    public final InterfaceC4580q1 f13659t;

    /* JADX INFO: renamed from: u */
    public InterfaceC0173a f13660u;

    /* JADX INFO: renamed from: v */
    public boolean f13661v;

    /* JADX INFO: renamed from: w */
    public InterfaceC0173a f13662w;

    /* JADX INFO: renamed from: x */
    public InterfaceC0173a f13663x;

    /* JADX INFO: renamed from: y */
    public InterfaceC4507m f13664y;

    /* JADX INFO: renamed from: z */
    public InterfaceC0184l f13665z;

    /* JADX INFO: renamed from: l3.b$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a extends C9436y.b {
        public a() {
            super(1);
        }

        @Override // p336x3.C9436y.b
        /* JADX INFO: renamed from: e */
        public C9408m0 mo13335e(C9408m0 c9408m0, List list) {
            return AbstractC4609b.this.m18481v(c9408m0);
        }

        @Override // p336x3.C9436y.b
        /* JADX INFO: renamed from: f */
        public C9436y.a mo13336f(C9436y c9436y, C9436y.a aVar) {
            return AbstractC4609b.this.m18480u(aVar);
        }
    }

    /* JADX INFO: renamed from: l3.b$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class b extends AbstractC1067w implements InterfaceC0184l {

        /* JADX INFO: renamed from: r */
        public static final b f13667r = new b();

        public b() {
            super(1);
        }

        /* JADX INFO: renamed from: a */
        public static void m18486a(InterfaceC0173a interfaceC0173a) {
            interfaceC0173a.invoke();
        }

        /* JADX INFO: renamed from: c */
        public final void m18487c(AbstractC4609b abstractC4609b) {
            Handler handler = abstractC4609b.getHandler();
            final InterfaceC0173a interfaceC0173a = abstractC4609b.f13647I;
            handler.post(new Runnable() { // from class: l3.c
                @Override // java.lang.Runnable
                public final void run() {
                    AbstractC4609b.b.m18486a(interfaceC0173a);
                }
            });
        }

        @Override // p010a9.InterfaceC0184l
        /* JADX INFO: renamed from: m */
        public /* bridge */ /* synthetic */ Object mo27m(Object obj) {
            m18487c((AbstractC4609b) obj);
            return C4700i0.f13910a;
        }
    }

    /* JADX INFO: renamed from: l3.b$d */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class d extends AbstractC1067w implements InterfaceC0184l {

        /* JADX INFO: renamed from: r */
        public final /* synthetic */ C4554j0 f13668r;

        /* JADX INFO: renamed from: s */
        public final /* synthetic */ InterfaceC4507m f13669s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(C4554j0 c4554j0, InterfaceC4507m interfaceC4507m) {
            super(1);
            this.f13668r = c4554j0;
            this.f13669s = interfaceC4507m;
        }

        /* JADX INFO: renamed from: a */
        public final void m18488a(InterfaceC4507m interfaceC4507m) {
            this.f13668r.mo17769q(interfaceC4507m.mo17445i(this.f13669s));
        }

        @Override // p010a9.InterfaceC0184l
        /* JADX INFO: renamed from: m */
        public /* bridge */ /* synthetic */ Object mo27m(Object obj) {
            m18488a((InterfaceC4507m) obj);
            return C4700i0.f13910a;
        }
    }

    /* JADX INFO: renamed from: l3.b$e */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class e extends AbstractC1067w implements InterfaceC0184l {

        /* JADX INFO: renamed from: r */
        public final /* synthetic */ C4554j0 f13670r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(C4554j0 c4554j0) {
            super(1);
            this.f13670r = c4554j0;
        }

        /* JADX INFO: renamed from: a */
        public final void m18489a(InterfaceC3175e interfaceC3175e) {
            this.f13670r.mo17765e(interfaceC3175e);
        }

        @Override // p010a9.InterfaceC0184l
        /* JADX INFO: renamed from: m */
        public /* bridge */ /* synthetic */ Object mo27m(Object obj) {
            m18489a((InterfaceC3175e) obj);
            return C4700i0.f13910a;
        }
    }

    /* JADX INFO: renamed from: l3.b$f */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class f extends AbstractC1067w implements InterfaceC0184l {

        /* JADX INFO: renamed from: s */
        public final /* synthetic */ C4554j0 f13672s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(C4554j0 c4554j0) {
            super(1);
            this.f13672s = c4554j0;
        }

        /* JADX INFO: renamed from: a */
        public final void m18490a(InterfaceC4580q1 interfaceC4580q1) {
            ViewTreeObserverOnGlobalLayoutListenerC4898r viewTreeObserverOnGlobalLayoutListenerC4898r = interfaceC4580q1 instanceof ViewTreeObserverOnGlobalLayoutListenerC4898r ? (ViewTreeObserverOnGlobalLayoutListenerC4898r) interfaceC4580q1 : null;
            if (viewTreeObserverOnGlobalLayoutListenerC4898r != null) {
                viewTreeObserverOnGlobalLayoutListenerC4898r.m19612s0(AbstractC4609b.this, this.f13672s);
            }
            ViewParent parent = AbstractC4609b.this.getView().getParent();
            AbstractC4609b abstractC4609b = AbstractC4609b.this;
            if (parent != abstractC4609b) {
                abstractC4609b.addView(abstractC4609b.getView());
            }
        }

        @Override // p010a9.InterfaceC0184l
        /* JADX INFO: renamed from: m */
        public /* bridge */ /* synthetic */ Object mo27m(Object obj) {
            m18490a((InterfaceC4580q1) obj);
            return C4700i0.f13910a;
        }
    }

    /* JADX INFO: renamed from: l3.b$g */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class g extends AbstractC1067w implements InterfaceC0184l {
        public g() {
            super(1);
        }

        /* JADX INFO: renamed from: a */
        public final void m18491a(InterfaceC4580q1 interfaceC4580q1) {
            if (C4503i.f13057c && AbstractC4609b.this.hasFocus()) {
                interfaceC4580q1.getFocusOwner().mo24454A(true);
            }
            ViewTreeObserverOnGlobalLayoutListenerC4898r viewTreeObserverOnGlobalLayoutListenerC4898r = interfaceC4580q1 instanceof ViewTreeObserverOnGlobalLayoutListenerC4898r ? (ViewTreeObserverOnGlobalLayoutListenerC4898r) interfaceC4580q1 : null;
            if (viewTreeObserverOnGlobalLayoutListenerC4898r != null) {
                viewTreeObserverOnGlobalLayoutListenerC4898r.m19599d1(AbstractC4609b.this);
            }
            AbstractC4609b.this.removeAllViewsInLayout();
        }

        @Override // p010a9.InterfaceC0184l
        /* JADX INFO: renamed from: m */
        public /* bridge */ /* synthetic */ Object mo27m(Object obj) {
            m18491a((InterfaceC4580q1) obj);
            return C4700i0.f13910a;
        }
    }

    /* JADX INFO: renamed from: l3.b$j */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class j extends AbstractC1067w implements InterfaceC0184l {

        /* JADX INFO: renamed from: s */
        public final /* synthetic */ C4554j0 f13681s;

        /* JADX INFO: renamed from: t */
        public final /* synthetic */ AbstractC4609b f13682t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(C4554j0 c4554j0, AbstractC4609b abstractC4609b) {
            super(1);
            this.f13681s = c4554j0;
            this.f13682t = abstractC4609b;
        }

        /* JADX INFO: renamed from: a */
        public final void m18497a(InterfaceC8487f interfaceC8487f) {
            AbstractC4609b abstractC4609b = AbstractC4609b.this;
            C4554j0 c4554j0 = this.f13681s;
            AbstractC4609b abstractC4609b2 = this.f13682t;
            InterfaceC7088i1 interfaceC7088i1Mo32635i = interfaceC8487f.mo18044n1().mo32635i();
            if (abstractC4609b.getView().getVisibility() != 8) {
                abstractC4609b.f13654P = true;
                InterfaceC4580q1 interfaceC4580q1M17845A0 = c4554j0.m17845A0();
                ViewTreeObserverOnGlobalLayoutListenerC4898r viewTreeObserverOnGlobalLayoutListenerC4898r = interfaceC4580q1M17845A0 instanceof ViewTreeObserverOnGlobalLayoutListenerC4898r ? (ViewTreeObserverOnGlobalLayoutListenerC4898r) interfaceC4580q1M17845A0 : null;
                if (viewTreeObserverOnGlobalLayoutListenerC4898r != null) {
                    viewTreeObserverOnGlobalLayoutListenerC4898r.m19569C0(abstractC4609b2, AbstractC7072f0.m27862d(interfaceC7088i1Mo32635i));
                }
                abstractC4609b.f13654P = false;
            }
        }

        @Override // p010a9.InterfaceC0184l
        /* JADX INFO: renamed from: m */
        public /* bridge */ /* synthetic */ Object mo27m(Object obj) {
            m18497a((InterfaceC8487f) obj);
            return C4700i0.f13910a;
        }
    }

    /* JADX INFO: renamed from: l3.b$k */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class k extends AbstractC1067w implements InterfaceC0184l {

        /* JADX INFO: renamed from: s */
        public final /* synthetic */ C4554j0 f13684s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(C4554j0 c4554j0) {
            super(1);
            this.f13684s = c4554j0;
        }

        /* JADX INFO: renamed from: a */
        public final void m18498a(InterfaceC3578w interfaceC3578w) {
            WindowInsets windowInsetsM36569r;
            AbstractC4611d.m18508d(AbstractC4609b.this, this.f13684s);
            AbstractC4609b.this.f13659t.mo18183t(AbstractC4609b.this);
            int i10 = AbstractC4609b.this.f13643E[0];
            int i11 = AbstractC4609b.this.f13643E[1];
            AbstractC4609b.this.getView().getLocationOnScreen(AbstractC4609b.this.f13643E);
            long j10 = AbstractC4609b.this.f13644F;
            AbstractC4609b.this.f13644F = interfaceC3578w.mo13242a();
            C9408m0 c9408m0 = AbstractC4609b.this.f13645G;
            if (c9408m0 != null) {
                if ((i10 == AbstractC4609b.this.f13643E[0] && i11 == AbstractC4609b.this.f13643E[1] && C3189s.m12084e(j10, AbstractC4609b.this.f13644F)) || (windowInsetsM36569r = AbstractC4609b.this.m18481v(c9408m0).m36569r()) == null) {
                    return;
                }
                AbstractC4609b.this.getView().dispatchApplyWindowInsets(windowInsetsM36569r);
            }
        }

        @Override // p010a9.InterfaceC0184l
        /* JADX INFO: renamed from: m */
        public /* bridge */ /* synthetic */ Object mo27m(Object obj) {
            m18498a((InterfaceC3578w) obj);
            return C4700i0.f13910a;
        }
    }

    /* JADX INFO: renamed from: l3.b$l */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class l extends AbstractC1067w implements InterfaceC0184l {
        public l() {
            super(1);
        }

        /* JADX INFO: renamed from: a */
        public final void m18499a(InterfaceC0184l interfaceC0184l) {
            AbstractC4609b.this.f13646H = interfaceC0184l;
        }

        @Override // p010a9.InterfaceC0184l
        /* JADX INFO: renamed from: m */
        public /* bridge */ /* synthetic */ Object mo27m(Object obj) {
            m18499a((InterfaceC0184l) obj);
            return C4700i0.f13910a;
        }
    }

    /* JADX INFO: renamed from: l3.b$m */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class m extends AbstractC6544m implements InterfaceC0188p {

        /* JADX INFO: renamed from: q */
        public int f13686q;

        /* JADX INFO: renamed from: r */
        public final /* synthetic */ boolean f13687r;

        /* JADX INFO: renamed from: s */
        public final /* synthetic */ AbstractC4609b f13688s;

        /* JADX INFO: renamed from: t */
        public final /* synthetic */ long f13689t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(boolean z10, AbstractC4609b abstractC4609b, long j10, InterfaceC5976f interfaceC5976f) {
            super(2, interfaceC5976f);
            this.f13687r = z10;
            this.f13688s = abstractC4609b;
            this.f13689t = j10;
        }

        @Override // p257r8.AbstractC6532a
        public final InterfaceC5976f create(Object obj, InterfaceC5976f interfaceC5976f) {
            return new m(this.f13687r, this.f13688s, this.f13689t, interfaceC5976f);
        }

        @Override // p010a9.InterfaceC0188p
        public final Object invoke(InterfaceC2165o0 interfaceC2165o0, InterfaceC5976f interfaceC5976f) {
            return ((m) create(interfaceC2165o0, interfaceC5976f)).invokeSuspend(C4700i0.f13910a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x003b, code lost:
        
            if (r11 == r0) goto L18;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x0058, code lost:
        
            if (r11 == r0) goto L18;
         */
        @Override // p257r8.AbstractC6532a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) throws java.lang.Throwable {
            /*
                r10 = this;
                java.lang.Object r0 = p242q8.AbstractC6325c.m24992g()
                int r1 = r10.f13686q
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1e
                if (r1 == r3) goto L19
                if (r1 != r2) goto L12
                p172l8.AbstractC4713t.m18808b(r11)
                goto L5b
            L12:
                java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
                p376zd.C10010p0.m38820a(r11)
                r11 = 0
                return r11
            L19:
                p172l8.AbstractC4713t.m18808b(r11)
                r6 = r10
                goto L3e
            L1e:
                p172l8.AbstractC4713t.m18808b(r11)
                boolean r11 = r10.f13687r
                l3.b r1 = r10.f13688s
                if (r11 != 0) goto L44
                e2.b r4 = p167l3.AbstractC4609b.m18464c(r1)
                i3.z$a r11 = p121i3.C3196z.f8498b
                long r5 = r11.m12145a()
                long r7 = r10.f13689t
                r10.f13686q = r3
                r9 = r10
                java.lang.Object r11 = r4.m7214a(r5, r7, r9)
                r6 = r9
                if (r11 != r0) goto L3e
                goto L5a
            L3e:
                i3.z r11 = (p121i3.C3196z) r11
                r11.m12144o()
                goto L60
            L44:
                r6 = r10
                e2.b r1 = p167l3.AbstractC4609b.m18464c(r1)
                r11 = r2
                long r2 = r6.f13689t
                i3.z$a r4 = p121i3.C3196z.f8498b
                long r4 = r4.m12145a()
                r6.f13686q = r11
                java.lang.Object r11 = r1.m7214a(r2, r4, r6)
                if (r11 != r0) goto L5b
            L5a:
                return r0
            L5b:
                i3.z r11 = (p121i3.C3196z) r11
                r11.m12144o()
            L60:
                l8.i0 r11 = p172l8.C4700i0.f13910a
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: p167l3.AbstractC4609b.m.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: l3.b$n */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class n extends AbstractC6544m implements InterfaceC0188p {

        /* JADX INFO: renamed from: q */
        public int f13690q;

        /* JADX INFO: renamed from: s */
        public final /* synthetic */ long f13692s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(long j10, InterfaceC5976f interfaceC5976f) {
            super(2, interfaceC5976f);
            this.f13692s = j10;
        }

        @Override // p257r8.AbstractC6532a
        public final InterfaceC5976f create(Object obj, InterfaceC5976f interfaceC5976f) {
            return AbstractC4609b.this.new n(this.f13692s, interfaceC5976f);
        }

        @Override // p010a9.InterfaceC0188p
        public final Object invoke(InterfaceC2165o0 interfaceC2165o0, InterfaceC5976f interfaceC5976f) {
            return ((n) create(interfaceC2165o0, interfaceC5976f)).invokeSuspend(C4700i0.f13910a);
        }

        @Override // p257r8.AbstractC6532a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM24992g = AbstractC6325c.m24992g();
            int i10 = this.f13690q;
            if (i10 == 0) {
                AbstractC4713t.m18808b(obj);
                C2000b c2000b = AbstractC4609b.this.f13657r;
                long j10 = this.f13692s;
                this.f13690q = 1;
                if (c2000b.m7216c(j10, this) == objM24992g) {
                    return objM24992g;
                }
            } else {
                if (i10 != 1) {
                    C10010p0.m38820a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC4713t.m18808b(obj);
            }
            return C4700i0.f13910a;
        }
    }

    /* JADX INFO: renamed from: l3.b$q */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class q extends AbstractC1067w implements InterfaceC0173a {
        public q() {
            super(0);
        }

        /* JADX INFO: renamed from: a */
        public final void m18502a() {
            AbstractC4609b.this.getLayoutNode().m17881P0();
        }

        @Override // p010a9.InterfaceC0173a
        public /* bridge */ /* synthetic */ Object invoke() {
            m18502a();
            return C4700i0.f13910a;
        }
    }

    /* JADX INFO: renamed from: l3.b$r */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class r extends AbstractC1067w implements InterfaceC0173a {
        public r() {
            super(0);
        }

        /* JADX INFO: renamed from: a */
        public final void m18503a() {
            if (AbstractC4609b.this.f13661v && AbstractC4609b.this.isAttachedToWindow()) {
                ViewParent parent = AbstractC4609b.this.getView().getParent();
                AbstractC4609b abstractC4609b = AbstractC4609b.this;
                if (parent == abstractC4609b) {
                    C4586s1 snapshotObserver = abstractC4609b.getSnapshotObserver();
                    snapshotObserver.f13496a.m11785j(AbstractC4609b.this, AbstractC4609b.f13638T, AbstractC4609b.this.getUpdate());
                }
            }
        }

        @Override // p010a9.InterfaceC0173a
        public /* bridge */ /* synthetic */ Object invoke() {
            m18503a();
            return C4700i0.f13910a;
        }
    }

    public AbstractC4609b(Context context, AbstractC0482e0 abstractC0482e0, int i10, C2000b c2000b, View view, InterfaceC4580q1 interfaceC4580q1) {
        super(context);
        this.f13656q = i10;
        this.f13657r = c2000b;
        this.f13658s = view;
        this.f13659t = interfaceC4580q1;
        if (abstractC0482e0 != null) {
            AbstractC4912t3.m19708i(this, abstractC0482e0);
        }
        setSaveFromParentEnabled(false);
        addView(view);
        AbstractC9428u.m36669s(this, new a());
        AbstractC9428u.m36668r(this, this);
        this.f13660u = s.f13697r;
        this.f13662w = p.f13694r;
        this.f13663x = o.f13693r;
        InterfaceC4507m.a aVar = InterfaceC4507m.f13080a;
        this.f13664y = aVar;
        this.f13639A = AbstractC3177g.m11997b(1.0f, 0.0f, 2, null);
        this.f13643E = new int[2];
        this.f13644F = C3189s.f8481b.m12088a();
        this.f13647I = new r();
        this.f13648J = new q();
        this.f13650L = new int[2];
        this.f13651M = Integer.MIN_VALUE;
        this.f13652N = Integer.MIN_VALUE;
        this.f13653O = new C9389g(this);
        C4554j0 c4554j0 = new C4554j0(false, 0, 3, null);
        c4554j0.m17894T1(this);
        InterfaceC4507m interfaceC4507mMo17445i = AbstractC3588z0.m13427a(AbstractC5927j.m23842b(AbstractC2258o0.m8207a(AbstractC8093v.m31266c(AbstractC2002d.m7229a(aVar, AbstractC4611d.f13699a, c2000b), true, i.f13679r), this), new j(c4554j0, this)), new k(c4554j0)).mo17445i(new C4613f(new l()));
        c4554j0.mo17767g(i10);
        c4554j0.mo17769q(this.f13664y.mo17445i(interfaceC4507mMo17445i));
        this.f13665z = new d(c4554j0, interfaceC4507mMo17445i);
        c4554j0.mo17765e(this.f13639A);
        this.f13640B = new e(c4554j0);
        c4554j0.m17912Z1(new f(c4554j0));
        c4554j0.m17914a2(new g());
        c4554j0.mo17768k(new h(c4554j0));
        this.f13655Q = c4554j0;
    }

    /* JADX INFO: renamed from: b */
    public static void m18463b(InterfaceC0173a interfaceC0173a) {
        interfaceC0173a.invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C4586s1 getSnapshotObserver() {
        if (!isAttachedToWindow()) {
            AbstractC3167a.m11956b("Expected AndroidViewHolder to be attached when observing reads.");
        }
        return this.f13659t.getSnapshotObserver();
    }

    @Override // p336x3.InterfaceC9392h
    /* JADX INFO: renamed from: a */
    public C9408m0 mo13332a(View view, C9408m0 c9408m0) {
        this.f13645G = new C9408m0(c9408m0);
        return m18481v(c9408m0);
    }

    @Override // p166l2.InterfaceC4583r1
    /* JADX INFO: renamed from: g0 */
    public boolean mo17556g0() {
        return isAttachedToWindow();
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean gatherTransparentRegion(Region region) {
        if (region == null) {
            return true;
        }
        getLocationInWindow(this.f13650L);
        int[] iArr = this.f13650L;
        int i10 = iArr[0];
        region.op(i10, iArr[1], i10 + getWidth(), this.f13650L[1] + getHeight(), Region.Op.DIFFERENCE);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return getClass().getName();
    }

    public final InterfaceC3175e getDensity() {
        return this.f13639A;
    }

    public final View getInteropView() {
        return this.f13658s;
    }

    public final C4554j0 getLayoutNode() {
        return this.f13655Q;
    }

    @Override // android.view.View
    public ViewGroup.LayoutParams getLayoutParams() {
        ViewGroup.LayoutParams layoutParams = this.f13658s.getLayoutParams();
        return layoutParams == null ? new ViewGroup.LayoutParams(-1, -1) : layoutParams;
    }

    public final InterfaceC0676o getLifecycleOwner() {
        return this.f13641C;
    }

    public final InterfaceC4507m getModifier() {
        return this.f13664y;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.f13653O.m36528a();
    }

    public final InterfaceC0184l getOnDensityChanged$ui() {
        return this.f13640B;
    }

    public final InterfaceC0184l getOnModifierChanged$ui() {
        return this.f13665z;
    }

    public final InterfaceC0184l getOnRequestDisallowInterceptTouchEvent$ui() {
        return this.f13649K;
    }

    public final InterfaceC0173a getRelease() {
        return this.f13663x;
    }

    public final InterfaceC0173a getReset() {
        return this.f13662w;
    }

    public final InterfaceC4973j getSavedStateRegistryOwner() {
        return this.f13642D;
    }

    public final InterfaceC0173a getUpdate() {
        return this.f13660u;
    }

    public final View getView() {
        return this.f13658s;
    }

    @Override // androidx.compose.runtime.InterfaceC0544n
    /* JADX INFO: renamed from: h */
    public void mo1931h() {
        this.f13663x.invoke();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
        super.invalidateChildInParent(iArr, rect);
        m18482w();
        return null;
    }

    @Override // android.view.View
    public boolean isNestedScrollingEnabled() {
        return this.f13658s.isNestedScrollingEnabled();
    }

    @Override // androidx.compose.runtime.InterfaceC0544n
    /* JADX INFO: renamed from: j */
    public void mo1932j() {
        this.f13662w.invoke();
        removeAllViewsInLayout();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f13647I.invoke();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onDescendantInvalidated(View view, View view2) {
        super.onDescendantInvalidated(view, view2);
        m18482w();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getSnapshotObserver().m18233i(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        this.f13658s.layout(0, 0, i12 - i10, i13 - i11);
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        if (this.f13658s.getParent() != this) {
            setMeasuredDimension(View.MeasureSpec.getSize(i10), View.MeasureSpec.getSize(i11));
            return;
        }
        if (this.f13658s.getVisibility() == 8) {
            setMeasuredDimension(0, 0);
            return;
        }
        this.f13658s.measure(i10, i11);
        setMeasuredDimension(this.f13658s.getMeasuredWidth(), this.f13658s.getMeasuredHeight());
        this.f13651M = i10;
        this.f13652N = i11;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedFling(View view, float f10, float f11, boolean z10) {
        if (!isNestedScrollingEnabled()) {
            return false;
        }
        AbstractC2148k.m7817d(this.f13657r.m7218e(), null, null, new m(z10, this, AbstractC3171a0.m11961a(AbstractC4611d.m18509e(f10), AbstractC4611d.m18509e(f11)), null), 3, null);
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedPreFling(View view, float f10, float f11) {
        if (!isNestedScrollingEnabled()) {
            return false;
        }
        AbstractC2148k.m7817d(this.f13657r.m7218e(), null, null, new n(AbstractC3171a0.m11961a(AbstractC4611d.m18509e(f10), AbstractC4611d.m18509e(f11)), null), 3, null);
        return false;
    }

    @Override // android.view.View
    public void onWindowVisibilityChanged(int i10) {
        super.onWindowVisibilityChanged(i10);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z10) {
        InterfaceC0184l interfaceC0184l = this.f13646H;
        if (interfaceC0184l == null) {
            return true;
        }
        interfaceC0184l.mo27m(rect != null ? AbstractC7050a3.m27757e(rect) : null);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z10) {
        InterfaceC0184l interfaceC0184l = this.f13649K;
        if (interfaceC0184l != null) {
            interfaceC0184l.mo27m(Boolean.valueOf(z10));
        }
        super.requestDisallowInterceptTouchEvent(z10);
    }

    public final void setDensity(InterfaceC3175e interfaceC3175e) {
        if (interfaceC3175e != this.f13639A) {
            this.f13639A = interfaceC3175e;
            InterfaceC0184l interfaceC0184l = this.f13640B;
            if (interfaceC0184l != null) {
                interfaceC0184l.mo27m(interfaceC3175e);
            }
        }
    }

    public final void setLifecycleOwner(InterfaceC0676o interfaceC0676o) {
        if (interfaceC0676o != this.f13641C) {
            this.f13641C = interfaceC0676o;
            AbstractC0679p0.m2662b(this, interfaceC0676o);
        }
    }

    public final void setModifier(InterfaceC4507m interfaceC4507m) {
        if (interfaceC4507m != this.f13664y) {
            this.f13664y = interfaceC4507m;
            InterfaceC0184l interfaceC0184l = this.f13665z;
            if (interfaceC0184l != null) {
                interfaceC0184l.mo27m(interfaceC4507m);
            }
        }
    }

    public final void setOnDensityChanged$ui(InterfaceC0184l interfaceC0184l) {
        this.f13640B = interfaceC0184l;
    }

    public final void setOnModifierChanged$ui(InterfaceC0184l interfaceC0184l) {
        this.f13665z = interfaceC0184l;
    }

    public final void setOnRequestDisallowInterceptTouchEvent$ui(InterfaceC0184l interfaceC0184l) {
        this.f13649K = interfaceC0184l;
    }

    public final void setRelease(InterfaceC0173a interfaceC0173a) {
        this.f13663x = interfaceC0173a;
    }

    public final void setReset(InterfaceC0173a interfaceC0173a) {
        this.f13662w = interfaceC0173a;
    }

    public final void setSavedStateRegistryOwner(InterfaceC4973j interfaceC4973j) {
        if (interfaceC4973j != this.f13642D) {
            this.f13642D = interfaceC4973j;
            AbstractC4977n.m20087b(this, interfaceC4973j);
        }
    }

    public final void setUpdate(InterfaceC0173a interfaceC0173a) {
        this.f13660u = interfaceC0173a;
        this.f13661v = true;
        this.f13647I.invoke();
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return true;
    }

    /* JADX INFO: renamed from: t */
    public final C6475f m18479t(C6475f c6475f, int i10, int i11, int i12, int i13) {
        int i14 = c6475f.f20347a - i10;
        if (i14 < 0) {
            i14 = 0;
        }
        int i15 = c6475f.f20348b - i11;
        if (i15 < 0) {
            i15 = 0;
        }
        int i16 = c6475f.f20349c - i12;
        if (i16 < 0) {
            i16 = 0;
        }
        int i17 = c6475f.f20350d - i13;
        return C6475f.m25652b(i14, i15, i16, i17 >= 0 ? i17 : 0);
    }

    /* JADX INFO: renamed from: u */
    public final C9436y.a m18480u(C9436y.a aVar) {
        AbstractC4539f1 abstractC4539f1M17907Y = this.f13655Q.m17907Y();
        if (abstractC4539f1M17907Y.mo13245d()) {
            long jM12061c = AbstractC3186p.m12061c(AbstractC3581x.m13416g(abstractC4539f1M17907Y));
            int iM12049i = C3185o.m12049i(jM12061c);
            if (iM12049i < 0) {
                iM12049i = 0;
            }
            int iM12050j = C3185o.m12050j(jM12061c);
            int i10 = iM12050j < 0 ? 0 : iM12050j;
            long jMo13242a = AbstractC3581x.m13415f(abstractC4539f1M17907Y).mo13242a();
            int i11 = (int) (jMo13242a >> 32);
            int i12 = (int) (jMo13242a & 4294967295L);
            long jMo13242a2 = abstractC4539f1M17907Y.mo13242a();
            long jM12061c2 = AbstractC3186p.m12061c(abstractC4539f1M17907Y.mo13252u0(C6455e.m25551e((4294967295L & ((long) Float.floatToRawIntBits((int) (jMo13242a2 & 4294967295L)))) | (((long) Float.floatToRawIntBits((int) (jMo13242a2 >> 32))) << 32))));
            int iM12049i2 = i11 - C3185o.m12049i(jM12061c2);
            if (iM12049i2 < 0) {
                iM12049i2 = 0;
            }
            int iM12050j2 = i12 - C3185o.m12050j(jM12061c2);
            int i13 = iM12050j2 >= 0 ? iM12050j2 : 0;
            if (iM12049i != 0 || i10 != 0 || iM12049i2 != 0 || i13 != 0) {
                int i14 = iM12049i;
                int i15 = iM12049i2;
                return new C9436y.a(m18479t(aVar.m36718a(), i14, i10, i15, i13), m18479t(aVar.m36719b(), i14, i10, i15, i13));
            }
        }
        return aVar;
    }

    /* JADX INFO: renamed from: v */
    public final C9408m0 m18481v(C9408m0 c9408m0) {
        if (c9408m0.m36561i()) {
            AbstractC4539f1 abstractC4539f1M17907Y = this.f13655Q.m17907Y();
            if (abstractC4539f1M17907Y.mo13245d()) {
                long jM12061c = AbstractC3186p.m12061c(AbstractC3581x.m13416g(abstractC4539f1M17907Y));
                int iM12049i = C3185o.m12049i(jM12061c);
                if (iM12049i < 0) {
                    iM12049i = 0;
                }
                int iM12050j = C3185o.m12050j(jM12061c);
                if (iM12050j < 0) {
                    iM12050j = 0;
                }
                long jMo13242a = AbstractC3581x.m13415f(abstractC4539f1M17907Y).mo13242a();
                int i10 = (int) (jMo13242a >> 32);
                int i11 = (int) (jMo13242a & 4294967295L);
                long jMo13242a2 = abstractC4539f1M17907Y.mo13242a();
                long jM12061c2 = AbstractC3186p.m12061c(abstractC4539f1M17907Y.mo13252u0(C6455e.m25551e((((long) Float.floatToRawIntBits((int) (jMo13242a2 & 4294967295L))) & 4294967295L) | (((long) Float.floatToRawIntBits((int) (jMo13242a2 >> 32))) << 32))));
                int iM12049i2 = i10 - C3185o.m12049i(jM12061c2);
                if (iM12049i2 < 0) {
                    iM12049i2 = 0;
                }
                int iM12050j2 = i11 - C3185o.m12050j(jM12061c2);
                int i12 = iM12050j2 < 0 ? 0 : iM12050j2;
                if (iM12049i != 0 || iM12050j != 0 || iM12049i2 != 0 || i12 != 0) {
                    return c9408m0.m36562j(iM12049i, iM12050j, iM12049i2, i12);
                }
            }
        }
        return c9408m0;
    }

    /* JADX INFO: renamed from: w */
    public final void m18482w() {
        if (!this.f13654P) {
            this.f13655Q.m17881P0();
            return;
        }
        View view = this.f13658s;
        final InterfaceC0173a interfaceC0173a = this.f13648J;
        view.postOnAnimation(new Runnable() { // from class: l3.a
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC4609b.m18463b(interfaceC0173a);
            }
        });
    }

    /* JADX INFO: renamed from: x */
    public final int m18483x(int i10, int i11, int i12) {
        return (i12 >= 0 || i10 == i11) ? View.MeasureSpec.makeMeasureSpec(AbstractC2368o.m8586m(i12, i10, i11), 1073741824) : (i12 != -2 || i11 == Integer.MAX_VALUE) ? (i12 != -1 || i11 == Integer.MAX_VALUE) ? View.MeasureSpec.makeMeasureSpec(0, 0) : View.MeasureSpec.makeMeasureSpec(i11, 1073741824) : View.MeasureSpec.makeMeasureSpec(i11, Integer.MIN_VALUE);
    }

    /* JADX INFO: renamed from: y */
    public void m18484y() {
        if (this.f13658s.getParent() != this) {
            addView(this.f13658s);
        } else {
            this.f13662w.invoke();
        }
    }

    /* JADX INFO: renamed from: z */
    public final void m18485z() {
        int i10;
        int i11 = this.f13651M;
        if (i11 == Integer.MIN_VALUE || (i10 = this.f13652N) == Integer.MIN_VALUE) {
            return;
        }
        measure(i11, i10);
    }

    /* JADX INFO: renamed from: l3.b$c */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class c {
        public /* synthetic */ c(AbstractC1043k abstractC1043k) {
            this();
        }

        public c() {
        }
    }

    /* JADX INFO: renamed from: l3.b$o */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class o extends AbstractC1067w implements InterfaceC0173a {

        /* JADX INFO: renamed from: r */
        public static final o f13693r = new o();

        public o() {
            super(0);
        }

        @Override // p010a9.InterfaceC0173a
        public /* bridge */ /* synthetic */ Object invoke() {
            m18500a();
            return C4700i0.f13910a;
        }

        /* JADX INFO: renamed from: a */
        public final void m18500a() {
        }
    }

    /* JADX INFO: renamed from: l3.b$p */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class p extends AbstractC1067w implements InterfaceC0173a {

        /* JADX INFO: renamed from: r */
        public static final p f13694r = new p();

        public p() {
            super(0);
        }

        @Override // p010a9.InterfaceC0173a
        public /* bridge */ /* synthetic */ Object invoke() {
            m18501a();
            return C4700i0.f13910a;
        }

        /* JADX INFO: renamed from: a */
        public final void m18501a() {
        }
    }

    /* JADX INFO: renamed from: l3.b$s */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class s extends AbstractC1067w implements InterfaceC0173a {

        /* JADX INFO: renamed from: r */
        public static final s f13697r = new s();

        public s() {
            super(0);
        }

        @Override // p010a9.InterfaceC0173a
        public /* bridge */ /* synthetic */ Object invoke() {
            m18504a();
            return C4700i0.f13910a;
        }

        /* JADX INFO: renamed from: a */
        public final void m18504a() {
        }
    }

    /* JADX INFO: renamed from: l3.b$h */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class h implements InterfaceC3555o0 {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C4554j0 f13675b;

        /* JADX INFO: renamed from: l3.b$h$b */
        /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
        public static final class b extends AbstractC1067w implements InterfaceC0184l {

            /* JADX INFO: renamed from: r */
            public final /* synthetic */ AbstractC4609b f13677r;

            /* JADX INFO: renamed from: s */
            public final /* synthetic */ C4554j0 f13678s;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(AbstractC4609b abstractC4609b, C4554j0 c4554j0) {
                super(1);
                this.f13677r = abstractC4609b;
                this.f13678s = c4554j0;
            }

            /* JADX INFO: renamed from: a */
            public final void m18495a(AbstractC3545l1.a aVar) {
                AbstractC4611d.m18508d(this.f13677r, this.f13678s);
            }

            @Override // p010a9.InterfaceC0184l
            /* JADX INFO: renamed from: m */
            public /* bridge */ /* synthetic */ Object mo27m(Object obj) {
                m18495a((AbstractC3545l1.a) obj);
                return C4700i0.f13910a;
            }
        }

        public h(C4554j0 c4554j0) {
            this.f13675b = c4554j0;
        }

        /* JADX INFO: renamed from: a */
        public final int m18492a(int i10) {
            AbstractC4609b abstractC4609b = AbstractC4609b.this;
            ViewGroup.LayoutParams layoutParams = abstractC4609b.getLayoutParams();
            layoutParams.getClass();
            abstractC4609b.measure(abstractC4609b.m18483x(0, i10, layoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
            return AbstractC4609b.this.getMeasuredHeight();
        }

        @Override // p135j2.InterfaceC3555o0
        /* JADX INFO: renamed from: b */
        public int mo3081b(InterfaceC3566s interfaceC3566s, List list, int i10) {
            return m18493f(i10);
        }

        @Override // p135j2.InterfaceC3555o0
        /* JADX INFO: renamed from: c */
        public InterfaceC3558p0 mo2920c(InterfaceC3561q0 interfaceC3561q0, List list, long j10) {
            if (AbstractC4609b.this.getChildCount() == 0) {
                return InterfaceC3561q0.m13345n0(interfaceC3561q0, C3173c.m11975n(j10), C3173c.m11974m(j10), null, a.f13676r, 4, null);
            }
            if (C3173c.m11975n(j10) != 0) {
                AbstractC4609b.this.getChildAt(0).setMinimumWidth(C3173c.m11975n(j10));
            }
            if (C3173c.m11974m(j10) != 0) {
                AbstractC4609b.this.getChildAt(0).setMinimumHeight(C3173c.m11974m(j10));
            }
            AbstractC4609b abstractC4609b = AbstractC4609b.this;
            int iM11975n = C3173c.m11975n(j10);
            int iM11973l = C3173c.m11973l(j10);
            ViewGroup.LayoutParams layoutParams = AbstractC4609b.this.getLayoutParams();
            layoutParams.getClass();
            int iM18483x = abstractC4609b.m18483x(iM11975n, iM11973l, layoutParams.width);
            AbstractC4609b abstractC4609b2 = AbstractC4609b.this;
            int iM11974m = C3173c.m11974m(j10);
            int iM11972k = C3173c.m11972k(j10);
            ViewGroup.LayoutParams layoutParams2 = AbstractC4609b.this.getLayoutParams();
            layoutParams2.getClass();
            abstractC4609b.measure(iM18483x, abstractC4609b2.m18483x(iM11974m, iM11972k, layoutParams2.height));
            return InterfaceC3561q0.m13345n0(interfaceC3561q0, AbstractC4609b.this.getMeasuredWidth(), AbstractC4609b.this.getMeasuredHeight(), null, new b(AbstractC4609b.this, this.f13675b), 4, null);
        }

        @Override // p135j2.InterfaceC3555o0
        /* JADX INFO: renamed from: d */
        public int mo13327d(InterfaceC3566s interfaceC3566s, List list, int i10) {
            return m18492a(i10);
        }

        @Override // p135j2.InterfaceC3555o0
        /* JADX INFO: renamed from: e */
        public int mo13328e(InterfaceC3566s interfaceC3566s, List list, int i10) {
            return m18493f(i10);
        }

        /* JADX INFO: renamed from: f */
        public final int m18493f(int i10) {
            AbstractC4609b abstractC4609b = AbstractC4609b.this;
            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
            AbstractC4609b abstractC4609b2 = AbstractC4609b.this;
            ViewGroup.LayoutParams layoutParams = abstractC4609b2.getLayoutParams();
            layoutParams.getClass();
            abstractC4609b.measure(iMakeMeasureSpec, abstractC4609b2.m18483x(0, i10, layoutParams.height));
            return AbstractC4609b.this.getMeasuredWidth();
        }

        @Override // p135j2.InterfaceC3555o0
        /* JADX INFO: renamed from: h */
        public int mo13329h(InterfaceC3566s interfaceC3566s, List list, int i10) {
            return m18492a(i10);
        }

        /* JADX INFO: renamed from: l3.b$h$a */
        /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
        public static final class a extends AbstractC1067w implements InterfaceC0184l {

            /* JADX INFO: renamed from: r */
            public static final a f13676r = new a();

            public a() {
                super(1);
            }

            @Override // p010a9.InterfaceC0184l
            /* JADX INFO: renamed from: m */
            public /* bridge */ /* synthetic */ Object mo27m(Object obj) {
                m18494a((AbstractC3545l1.a) obj);
                return C4700i0.f13910a;
            }

            /* JADX INFO: renamed from: a */
            public final void m18494a(AbstractC3545l1.a aVar) {
            }
        }
    }

    /* JADX INFO: renamed from: l3.b$i */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class i extends AbstractC1067w implements InterfaceC0184l {

        /* JADX INFO: renamed from: r */
        public static final i f13679r = new i();

        public i() {
            super(1);
        }

        @Override // p010a9.InterfaceC0184l
        /* JADX INFO: renamed from: m */
        public /* bridge */ /* synthetic */ Object mo27m(Object obj) {
            m18496a((InterfaceC8074h0) obj);
            return C4700i0.f13910a;
        }

        /* JADX INFO: renamed from: a */
        public final void m18496a(InterfaceC8074h0 interfaceC8074h0) {
        }
    }
}
