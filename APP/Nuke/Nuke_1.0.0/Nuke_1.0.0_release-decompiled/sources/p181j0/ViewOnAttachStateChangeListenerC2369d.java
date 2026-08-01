package p181j0;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import java.util.ArrayList;
import java.util.List;
import p000A.C0066i0;
import p002A1.AbstractC0151x;
import p002A1.InterfaceC0132e;
import p002A1.InterfaceC0145r;
import p011B4.AbstractC0231b;
import p027E4.C0330q;
import p028F.C0354o;
import p028F.RunnableC0346g;
import p029F0.C0372J;
import p047I0.C0684M0;
import p047I0.ViewTreeObserverOnGlobalLayoutListenerC0772y;
import p051J.C0822n;
import p059L0.AbstractC0955a;
import p077P0.AbstractC1131r;
import p077P0.C1128o;
import p117X2.AbstractC1665j;
import p172h3.AbstractC2250j;
import p172h3.C2243c;
import p186k.AbstractC2428j;
import p186k.AbstractC2429k;
import p186k.C2439u;

/* JADX INFO: renamed from: j0.d */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnAttachStateChangeListenerC2369d implements InterfaceC0132e, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: d */
    public final ViewTreeObserverOnGlobalLayoutListenerC0772y f7681d;

    /* JADX INFO: renamed from: e */
    public final C0354o f7682e;

    /* JADX INFO: renamed from: f */
    public C0822n f7683f;

    /* JADX INFO: renamed from: g */
    public final ArrayList f7684g = new ArrayList();

    /* JADX INFO: renamed from: h */
    public final long f7685h = 100;

    /* JADX INFO: renamed from: i */
    public EnumC2366a f7686i = EnumC2366a.f7673d;

    /* JADX INFO: renamed from: j */
    public boolean f7687j = true;

    /* JADX INFO: renamed from: k */
    public final C2243c f7688k = AbstractC2250j.m4101a(1, 6, null);

    /* JADX INFO: renamed from: l */
    public final Handler f7689l = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: m */
    public C2439u f7690m;

    /* JADX INFO: renamed from: n */
    public long f7691n;

    /* JADX INFO: renamed from: o */
    public final C2439u f7692o;

    /* JADX INFO: renamed from: p */
    public C0684M0 f7693p;

    /* JADX INFO: renamed from: q */
    public boolean f7694q;

    /* JADX INFO: renamed from: r */
    public final RunnableC0346g f7695r;

    public ViewOnAttachStateChangeListenerC2369d(ViewTreeObserverOnGlobalLayoutListenerC0772y viewTreeObserverOnGlobalLayoutListenerC0772y, C0354o c0354o) {
        this.f7681d = viewTreeObserverOnGlobalLayoutListenerC0772y;
        this.f7682e = c0354o;
        C2439u c2439u = AbstractC2429k.f7850a;
        AbstractC1665j.m2983c(c2439u, "null cannot be cast to non-null type androidx.collection.IntObjectMap<V of androidx.collection.IntObjectMapKt.intObjectMapOf>");
        this.f7690m = c2439u;
        this.f7692o = new C2439u();
        C1128o c1128oM2180a = viewTreeObserverOnGlobalLayoutListenerC0772y.getSemanticsOwner().m2180a();
        AbstractC1665j.m2983c(c2439u, "null cannot be cast to non-null type androidx.collection.IntObjectMap<V of androidx.collection.IntObjectMapKt.intObjectMapOf>");
        this.f7693p = new C0684M0(c1128oM2180a, c2439u);
        this.f7695r = new RunnableC0346g(7, this);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x007d -> B:17:0x0047). Please report as a decompilation issue!!! */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m4218a(p084Q2.AbstractC1178c r8) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r8 instanceof p181j0.C2367b
            if (r0 == 0) goto L13
            r0 = r8
            j0.b r0 = (p181j0.C2367b) r0
            int r1 = r0.f7679j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f7679j = r1
            goto L18
        L13:
            j0.b r0 = new j0.b
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.f7677h
            int r1 = r0.f7679j
            r2 = 2
            r3 = 1
            P2.a r4 = p079P2.EnumC1152a.f3788d
            if (r1 == 0) goto L3a
            if (r1 == r3) goto L34
            if (r1 != r2) goto L2c
            h3.b r1 = r0.f7676g
            p127Z2.AbstractC1784a.m3205S(r8)
            goto L47
        L2c:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L34:
            h3.b r1 = r0.f7676g
            p127Z2.AbstractC1784a.m3205S(r8)
            goto L52
        L3a:
            p127Z2.AbstractC1784a.m3205S(r8)
            h3.c r8 = r7.f7688k
            r8.getClass()
            h3.b r1 = new h3.b
            r1.<init>(r8)
        L47:
            r0.f7676g = r1
            r0.f7679j = r3
            java.lang.Object r8 = r1.m4068b(r0)
            if (r8 != r4) goto L52
            goto L7f
        L52:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L80
            r1.m4069c()
            boolean r8 = r7.m4221h()
            if (r8 == 0) goto L66
            r7.m4222i()
        L66:
            boolean r8 = r7.f7694q
            if (r8 != 0) goto L73
            r7.f7694q = r3
            android.os.Handler r8 = r7.f7689l
            F.g r5 = r7.f7695r
            r8.post(r5)
        L73:
            r0.f7676g = r1
            r0.f7679j = r2
            long r5 = r7.f7685h
            java.lang.Object r8 = p160f3.AbstractC2162v.m3983e(r5, r0)
            if (r8 != r4) goto L47
        L7f:
            return r4
        L80:
            K2.q r8 = p056K2.C0891q.f2780a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p181j0.ViewOnAttachStateChangeListenerC2369d.m4218a(Q2.c):java.lang.Object");
    }

    @Override // p002A1.InterfaceC0132e
    /* JADX INFO: renamed from: b */
    public final void mo180b(InterfaceC0145r interfaceC0145r) {
        this.f7683f = (C0822n) this.f7682e.mo6a();
        m4225l(-1, this.f7681d.getSemanticsOwner().m2180a());
        m4222i();
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00c7  */
    /* JADX INFO: renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m4219e(p186k.AbstractC2428j r35) {
        /*
            Method dump skipped, instruction units count: 433
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p181j0.ViewOnAttachStateChangeListenerC2369d.m4219e(k.j):void");
    }

    @Override // p002A1.InterfaceC0132e
    /* JADX INFO: renamed from: f */
    public final void mo182f(InterfaceC0145r interfaceC0145r) {
        m4226m(this.f7681d.getSemanticsOwner().m2180a());
        m4222i();
        this.f7683f = null;
    }

    /* JADX INFO: renamed from: g */
    public final AbstractC2428j m4220g() {
        if (this.f7687j) {
            this.f7687j = false;
            this.f7690m = AbstractC1131r.m2183b(this.f7681d.getSemanticsOwner(), C2368c.f7680e);
            this.f7691n = System.currentTimeMillis();
        }
        return this.f7690m;
    }

    /* JADX INFO: renamed from: h */
    public final boolean m4221h() {
        return this.f7683f != null;
    }

    /* JADX INFO: renamed from: i */
    public final void m4222i() {
        C0822n c0822n = this.f7683f;
        if (c0822n == null) {
            return;
        }
        Object obj = c0822n.f2640a;
        if (Build.VERSION.SDK_INT < 29) {
            return;
        }
        ArrayList arrayList = this.f7684g;
        if (arrayList.isEmpty()) {
            return;
        }
        int size = arrayList.size();
        for (int i5 = 0; i5 < size; i5++) {
            C2370e c2370e = (C2370e) arrayList.get(i5);
            int iOrdinal = c2370e.f7698c.ordinal();
            if (iOrdinal == 0) {
                C0066i0 c0066i0 = c2370e.f7699d;
                if (c0066i0 != null) {
                    ViewStructure viewStructure = (ViewStructure) c0066i0.f297e;
                    if (Build.VERSION.SDK_INT >= 29) {
                        AbstractC0955a.m1958d(AbstractC0151x.m205f(obj), viewStructure);
                    }
                }
            } else {
                if (iOrdinal != 1) {
                    throw new C0330q();
                }
                AutofillId autofillIdM1455b = c0822n.m1455b(c2370e.f7696a);
                if (autofillIdM1455b != null && Build.VERSION.SDK_INT >= 29) {
                    AbstractC0955a.m1959e(AbstractC0151x.m205f(obj), autofillIdM1455b);
                }
            }
        }
        if (Build.VERSION.SDK_INT >= 29) {
            AbstractC0955a.m1961g(AbstractC0151x.m205f(obj), c0822n.f2641b.getAutofillId(), new long[]{Long.MIN_VALUE});
        }
        arrayList.clear();
    }

    /* JADX INFO: renamed from: j */
    public final void m4223j(C1128o c1128o, C0684M0 c0684m0) {
        C0372J c0372j = new C0372J(3, c0684m0, this);
        c1128o.getClass();
        List listM2163j = C1128o.m2163j(4, c1128o);
        int size = listM2163j.size();
        int i5 = 0;
        for (int i6 = 0; i6 < size; i6++) {
            Object obj = listM2163j.get(i6);
            if (m4220g().m4317a(((C1128o) obj).f3714g)) {
                c0372j.mo0g(Integer.valueOf(i5), obj);
                i5++;
            }
        }
        List listM2163j2 = C1128o.m2163j(4, c1128o);
        int size2 = listM2163j2.size();
        for (int i7 = 0; i7 < size2; i7++) {
            C1128o c1128o2 = (C1128o) listM2163j2.get(i7);
            AbstractC2428j abstractC2428jM4220g = m4220g();
            int i8 = c1128o2.f3714g;
            if (abstractC2428jM4220g.m4317a(i8)) {
                C2439u c2439u = this.f7692o;
                if (c2439u.m4317a(i8)) {
                    Object objM4318b = c2439u.m4318b(i8);
                    if (objM4318b == null) {
                        throw AbstractC0231b.m396g("node not present in pruned tree before this change");
                    }
                    m4223j(c1128o2, (C0684M0) objM4318b);
                } else {
                    continue;
                }
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m4224k(String str, int i5) {
        C0822n c0822n;
        int i6 = Build.VERSION.SDK_INT;
        if (i6 >= 29 && (c0822n = this.f7683f) != null) {
            AutofillId autofillIdM1455b = c0822n.m1455b(i5);
            if (autofillIdM1455b == null) {
                throw AbstractC0231b.m396g("Invalid content capture ID");
            }
            if (i6 >= 29) {
                AbstractC0955a.m1960f(AbstractC0151x.m205f(c0822n.f2640a), autofillIdM1455b, str);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0075  */
    /* JADX INFO: renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m4225l(int r19, p077P0.C1128o r20) {
        /*
            Method dump skipped, instruction units count: 482
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p181j0.ViewOnAttachStateChangeListenerC2369d.m4225l(int, P0.o):void");
    }

    /* JADX INFO: renamed from: m */
    public final void m4226m(C1128o c1128o) {
        if (m4221h()) {
            this.f7684g.add(new C2370e(c1128o.f3714g, this.f7691n, EnumC2371f.f7701e, null));
            List listM2163j = C1128o.m2163j(4, c1128o);
            int size = listM2163j.size();
            for (int i5 = 0; i5 < size; i5++) {
                m4226m((C1128o) listM2163j.get(i5));
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0059  */
    /* JADX INFO: renamed from: n */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m4227n() {
        /*
            r17 = this;
            r0 = r17
            k.u r1 = r0.f7692o
            r1.m4339c()
            k.j r2 = r0.m4220g()
            int[] r3 = r2.f7846b
            java.lang.Object[] r4 = r2.f7847c
            long[] r2 = r2.f7845a
            int r5 = r2.length
            int r5 = r5 + (-2)
            if (r5 < 0) goto L5e
            r7 = 0
        L17:
            r8 = r2[r7]
            long r10 = ~r8
            r12 = 7
            long r10 = r10 << r12
            long r10 = r10 & r8
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r10 & r12
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 == 0) goto L59
            int r10 = r7 - r5
            int r10 = ~r10
            int r10 = r10 >>> 31
            r11 = 8
            int r10 = 8 - r10
            r12 = 0
        L31:
            if (r12 >= r10) goto L57
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r8
            r15 = 128(0x80, double:6.3E-322)
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 >= 0) goto L53
            int r13 = r7 << 3
            int r13 = r13 + r12
            r14 = r3[r13]
            r13 = r4[r13]
            P0.p r13 = (p077P0.C1129p) r13
            I0.M0 r15 = new I0.M0
            P0.o r13 = r13.f3715a
            k.j r6 = r0.m4220g()
            r15.<init>(r13, r6)
            r1.m4344h(r14, r15)
        L53:
            long r8 = r8 >> r11
            int r12 = r12 + 1
            goto L31
        L57:
            if (r10 != r11) goto L5e
        L59:
            if (r7 == r5) goto L5e
            int r7 = r7 + 1
            goto L17
        L5e:
            I0.M0 r1 = new I0.M0
            I0.y r2 = r0.f7681d
            P0.q r2 = r2.getSemanticsOwner()
            P0.o r2 = r2.m2180a()
            k.j r3 = r0.m4220g()
            r1.<init>(r2, r3)
            r0.f7693p = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p181j0.ViewOnAttachStateChangeListenerC2369d.m4227n():void");
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.f7689l.removeCallbacks(this.f7695r);
        this.f7683f = null;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
