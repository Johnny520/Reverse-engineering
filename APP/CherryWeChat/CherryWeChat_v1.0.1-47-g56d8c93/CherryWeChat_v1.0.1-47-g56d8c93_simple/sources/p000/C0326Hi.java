package p000;

import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.fragment.app.FragmentContainerView;
import io.github.cherrywechat.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: Hi */
/* JADX INFO: loaded from: classes.dex */
public final class C0326Hi {

    /* JADX INFO: renamed from: a */
    public final C0649P3 f1108a;

    /* JADX INFO: renamed from: b */
    public final C2428qs f1109b;

    /* JADX INFO: renamed from: c */
    public final AbstractComponentCallbacksC1503hi f1110c;

    /* JADX INFO: renamed from: d */
    public boolean f1111d;

    /* JADX INFO: renamed from: e */
    public int f1112e;

    public C0326Hi(C0649P3 r2, C2428qs r3, AbstractComponentCallbacksC1503hi r4) {
        this.f1111d = false;
        this.f1112e = -1;
        this.f1108a = r2;
        this.f1109b = r3;
        this.f1110c = r4;
    }

    /* JADX INFO: renamed from: a */
    public final void m694a() {
        boolean r1 = AbstractC2805zi.m5374G(3);
        AbstractComponentCallbacksC1503hi r2 = this.f1110c;
        if (r1 == false) goto L5;
        Objects.toString(r2);
    L5:
        Bundle r12 = r2.f5311b;
        if (r12 == null) goto L8;
        Bundle r13 = r12.getBundle("savedInstanceState");
    L9:
        r2.f5329t.m5387N();
        r2.f5310a = 3;
        r2.f5294C = false;
        r2.mo898l();
        if (r2.f5294C == false) goto L33;
        if (AbstractC2805zi.m5374G(3) == false) goto L15;
        r2.toString();
    L15:
        if (r2.f5296E == null) goto L30;
        Bundle r0 = r2.f5311b;
        if (r0 == null) goto L19;
        Bundle r02 = r0.getBundle("savedInstanceState");
    L20:
        SparseArray<Parcelable> r3 = r2.f5312c;
        if (r3 == null) goto L23;
        r2.f5296E.restoreHierarchyState(r3);
        r2.f5312c = null;
    L23:
        r2.f5294C = false;
        r2.mo907w(r02);
        if (r2.f5294C == false) goto L29;
        if (r2.f5296E == null) goto L30;
        r2.f5305N.m961a(EnumC0632On.ON_CREATE);
        goto L30
    L29:
        throw new C0300Gz("Fragment " + r2 + " did not call through to super.onViewStateRestored()");
    L19:
        r02 = null;
    L30:
        r2.f5311b = null;
        C0025Ai r03 = r2.f5329t;
        r03.f9483F = false;
        r03.f9484G = false;
        r03.f9490M.f418i = false;
        r03.m5422t(4);
        this.f1108a.m1296m(r2, r13, false);
        return;
    L33:
        throw new C0300Gz("Fragment " + r2 + " did not call through to super.onActivityCreated()");
    L8:
        r13 = null;
        goto L9
    }

    /* JADX INFO: renamed from: b */
    public final void m695b() {
        AbstractComponentCallbacksC1503hi r0 = this.f1110c;
        View r1 = r0.f5295D;
    L3:
        AbstractComponentCallbacksC1503hi r2 = null;
        if (r1 == null) goto L15;
        Object r3 = r1.getTag(R.id.fragment_container_view_tag);
        if ((r3 instanceof AbstractComponentCallbacksC1503hi) == false) goto L8;
        AbstractComponentCallbacksC1503hi r32 = (AbstractComponentCallbacksC1503hi) r3;
    L9:
        if (r32 != null) goto L10;
        Object r12 = r1.getParent();
        if ((r12 instanceof View) == true) goto L13;
        r1 = null;
        goto L3
    L13:
        r1 = (View) r12;
        goto L3
    L10:
        r2 = r32;
        goto L15
    L8:
        r32 = null;
    L15:
        AbstractComponentCallbacksC1503hi r13 = r0.f5330u;
        if (r2 != null) goto L18;
    L20:
        ArrayList r14 = (ArrayList) this.f1109b.f8520a;
        ViewGroup r22 = r0.f5295D;
        int r33 = -1;
        if (r22 == null) goto L39;
        int r4 = r14.indexOf(r0);
        int r5 = r4 - 1;
    L24:
        if (r5 < 0) goto L31;
        AbstractComponentCallbacksC1503hi r6 = (AbstractComponentCallbacksC1503hi) r14.get(r5);
        if (r6.f5295D != r22) goto L30;
        View r62 = r6.f5296E;
        if (r62 == null) goto L30;
        r33 = r22.indexOfChild(r62) + 1;
    L30:
        r5 = r5 - 1;
    L31:
        r4 = r4 + 1;
        if (r4 >= r14.size()) goto L39;
        AbstractComponentCallbacksC1503hi r52 = (AbstractComponentCallbacksC1503hi) r14.get(r4);
        if (r52.f5295D != r22) goto L31;
        View r53 = r52.f5296E;
        if (r53 == null) goto L31;
        r33 = r22.indexOfChild(r53);
    L39:
        r0.f5295D.addView(r0.f5296E, r33);
        return;
    L18:
        if (r2.equals(r13) == true) goto L20;
        int r15 = r0.f5332w;
        C0369Ii r34 = AbstractC0412Ji.f1381a;
        StringBuilder r42 = new StringBuilder("Attempting to nest fragment ");
        r42.append(r0);
        r42.append(" within the view of parent fragment ");
        r42.append(r2);
        r42.append(" via container with ID ");
        AbstractC0412Ji.m855b(new C0240Fi(r0, AbstractC0213Ey.m409g(r42, r15, " without using parent's childFragmentManager")));
        AbstractC0412Ji.m854a(r0).getClass();
        goto L20
    }

    /* JADX INFO: renamed from: c */
    public final void m696c() {
        boolean r0 = AbstractC2805zi.m5374G(3);
        AbstractComponentCallbacksC1503hi r1 = this.f1110c;
        if (r0 == false) goto L5;
        Objects.toString(r1);
    L5:
        AbstractComponentCallbacksC1503hi r02 = r1.f5316g;
        C2428qs r5 = this.f1109b;
        if (r02 == null) goto L12;
        C0326Hi r03 = (C0326Hi) ((HashMap) r5.f8521b).get(r02.f5314e);
        if (r03 == null) goto L11;
        r1.f5317h = r1.f5316g.f5314e;
        r1.f5316g = null;
    L20:
        if (r03 == null) goto L22;
        r03.m704k();
    L22:
        AbstractC2805zi r04 = r1.f5327r;
        r1.f5328s = r04.f9512u;
        r1.f5330u = r04.f9514w;
        C0649P3 r05 = this.f1108a;
        r05.m1302t(r1, false);
        ArrayList r4 = r1.f5308Q;
        Iterator r52 = r4.iterator();
    L24:
        if (r52.hasNext() == false) goto L30;
        AbstractComponentCallbacksC1503hi r7 = ((C1328di) r52.next()).f4804a;
        r7.f5307P.m5268c();
        AbstractC0628Oj.m1246o(r7);
        Bundle r8 = r7.f5311b;
        if (r8 == null) goto L28;
        Bundle r82 = r8.getBundle("registryState");
    L29:
        r7.f5307P.m5269d(r82);
        goto L24
    L28:
        r82 = null;
        goto L29
    L30:
        r4.clear();
        r1.f5329t.m5402b(r1.f5328s, r1.mo897a(), r1);
        r1.f5310a = 0;
        r1.f5294C = false;
        r1.mo899m(r1.f5328s.f7401m);
        if (r1.f5294C == false) goto L39;
        Iterator r2 = r1.f5327r.f9505n.iterator();
    L34:
        if (r2.hasNext() == false) goto L36;
        ((InterfaceC0197Ei) r2.next()).mo390a(r1);
        goto L34
    L36:
        C0025Ai r22 = r1.f5329t;
        r22.f9483F = false;
        r22.f9484G = false;
        r22.f9490M.f418i = false;
        r22.m5422t(0);
        r05.m1297n(r1, false);
        return;
    L39:
        throw new C0300Gz("Fragment " + r1 + " did not call through to super.onAttach()");
    L11:
        throw new IllegalStateException("Fragment " + r1 + " declared target fragment " + r1.f5316g + " that does not belong to this FragmentManager!");
    L12:
        String r06 = r1.f5317h;
        if (r06 == null) goto L19;
        r03 = (C0326Hi) ((HashMap) r5.f8521b).get(r06);
        if (r03 != null) goto L20;
        StringBuilder r23 = new StringBuilder("Fragment ");
        r23.append(r1);
        r23.append(" declared target fragment ");
        throw new IllegalStateException(AbstractC0213Ey.m410h(r23, r1.f5317h, " that does not belong to this FragmentManager!"));
    L19:
        r03 = null;
        goto L20
    }

    /* JADX INFO: renamed from: d */
    public final int m697d() {
        AbstractComponentCallbacksC1503hi r0 = this.f1110c;
        if (r0.f5327r == null) goto L5;
        int r1 = this.f1112e;
        int r2 = r0.f5303L.ordinal();
        int r3 = 0;
        if (r2 == 1) goto L14;
        if (r2 == 2) goto L13;
        if (r2 == 3) goto L12;
        if (r2 == 4) goto L16;
        r1 = Math.min(r1, -1);
    L16:
        if (r0.f5322m == false) goto L29;
        if (r0.f5323n == false) goto L25;
        r1 = Math.max(this.f1112e, 2);
        View r22 = r0.f5296E;
        if (r22 == null) goto L29;
        if (r22.getParent() != null) goto L29;
        r1 = Math.min(r1, 2);
        goto L29
    L25:
        if (this.f1112e >= 4) goto L27;
        r1 = Math.min(r1, r0.f5310a);
        goto L29
    L27:
        r1 = Math.min(r1, 1);
    L29:
        if (r0.f5320k == true) goto L31;
        r1 = Math.min(r1, 1);
    L31:
        ViewGroup r23 = r0.f5295D;
        if (r23 == null) goto L59;
        r0.m2872f().m5383F();
        Object r11 = r23.getTag(R.id.special_effects_controller_view_tag);
        if ((r11 instanceof C2276nd) == false) goto L36;
        C2276nd r112 = (C2276nd) r11;
    L37:
        C0557My r24 = r112.m4607d(r0);
        if (r24 == null) goto L40;
        int r25 = r24.f1826b;
    L41:
        Iterator r10 = r112.f8011c.iterator();
    L43:
        if (r10.hasNext() == false) goto L49;
        Object r113 = r10.next();
        C0557My r12 = (C0557My) r113;
        if (AbstractC0585Nj.m1134a(r12.f1827c, r0) == false) goto L43;
        if (r12.f1830f == true) goto L43;
    L50:
        C0557My r114 = (C0557My) r113;
        if (r114 == null) goto L53;
        r3 = r114.f1826b;
    L53:
        if (r25 != 0) goto L55;
        int r102 = -1;
    L56:
        if (r102 == (-1)) goto L59;
        if (r102 == 1) goto L59;
        r3 = r25;
        goto L59
    L55:
        r102 = AbstractC0600Ny.f1940a[AbstractC0213Ey.m424v(r25)];
        goto L56
    L49:
        r113 = null;
        goto L50
    L40:
        r25 = 0;
        goto L41
    L36:
        r112 = new C2276nd(r23);
        r23.setTag(R.id.special_effects_controller_view_tag, r112);
    L59:
        if (r3 != 2) goto L61;
        r1 = Math.min(r1, 6);
    L70:
        if (r0.f5297F == false) goto L75;
        if (r0.f5310a >= 5) goto L75;
        r1 = Math.min(r1, 4);
    L75:
        if (AbstractC2805zi.m5374G(2) == false) goto L77;
        Objects.toString(r0);
    L77:
        return r1;
    L61:
        if (r3 != 3) goto L64;
        r1 = Math.max(r1, 3);
        goto L70
    L64:
        if (r0.f5321l == false) goto L70;
        if (r0.m2877k() == false) goto L68;
        r1 = Math.min(r1, 1);
        goto L70
    L68:
        r1 = Math.min(r1, -1);
        goto L70
    L12:
        r1 = Math.min(r1, 5);
        goto L16
    L13:
        r1 = Math.min(r1, 1);
        goto L16
    L14:
        r1 = Math.min(r1, 0);
        goto L16
    L5:
        return r0.f5310a;
    }

    /* JADX INFO: renamed from: e */
    public final void m698e() {
        boolean r0 = AbstractC2805zi.m5374G(3);
        AbstractComponentCallbacksC1503hi r1 = this.f1110c;
        if (r0 == false) goto L5;
        Objects.toString(r1);
    L5:
        Bundle r02 = r1.f5311b;
        if (r02 == null) goto L8;
        Bundle r03 = r02.getBundle("savedInstanceState");
    L10:
        if (r1.f5301J == true) goto L17;
        C0649P3 r2 = this.f1108a;
        r2.m1303u(r1, r03, false);
        r1.f5329t.m5387N();
        r1.f5310a = 1;
        r1.f5294C = false;
        r1.f5304M.mo1555a(new C1297cv(3, r1));
        r1.mo900n(r03);
        r1.f5301J = true;
        if (r1.f5294C == false) goto L16;
        r1.f5304M.m2276e(EnumC0632On.ON_CREATE);
        r2.m1298o(r1, r03, false);
        return;
    L16:
        throw new C0300Gz("Fragment " + r1 + " did not call through to super.onCreate()");
    L17:
        r1.f5310a = 1;
        Bundle r04 = r1.f5311b;
        if (r04 == null) goto L23;
        Bundle r05 = r04.getBundle("childFragmentManager");
        if (r05 == null) goto L24;
        r1.f5329t.m5393T(r05);
        C0025Ai r06 = r1.f5329t;
        r06.f9483F = false;
        r06.f9484G = false;
        r06.f9490M.f418i = false;
        r06.m5422t(1);
        return;
    L24:
        return;
    L23:
        return;
    L8:
        r03 = null;
        goto L10
    }

    /* JADX INFO: renamed from: f */
    public final void m699f() {
        AbstractComponentCallbacksC1503hi r0 = this.f1110c;
        if (r0.f5322m == false) goto L5;
        return;
    L5:
        int r1 = 3;
        if (AbstractC2805zi.m5374G(3) == false) goto L8;
        Objects.toString(r0);
    L8:
        Bundle r2 = r0.f5311b;
        ViewGroup r4 = null;
        if (r2 == null) goto L11;
        Bundle r22 = r2.getBundle("savedInstanceState");
    L12:
        LayoutInflater r5 = r0.mo903r(r22);
        ViewGroup r6 = r0.f5295D;
        if (r6 == null) goto L15;
        r4 = r6;
    L34:
        r0.f5295D = r4;
        r0.mo908x(r5, r4, r22);
        if (r0.f5296E != null) goto L37;
    L61:
        r0.f5310a = 2;
        return;
    L37:
        if (AbstractC2805zi.m5374G(3) == false) goto L39;
        Objects.toString(r0);
    L39:
        r0.f5296E.setSaveFromParentEnabled(false);
        r0.f5296E.setTag(R.id.fragment_container_view_tag, r0);
        if (r4 == null) goto L43;
        m695b();
    L43:
        if (r0.f5334y == false) goto L45;
        r0.f5296E.setVisibility(8);
    L45:
        View r42 = r0.f5296E;
        WeakHashMap r52 = AbstractC2185lE.f7617a;
        if (r42.isAttachedToWindow() == false) goto L48;
        AbstractC1255cE.m2370c(r0.f5296E);
    L49:
        Bundle r12 = r0.f5311b;
        if (r12 == null) goto L52;
        r12.getBundle("savedInstanceState");
    L52:
        r0.f5329t.m5422t(2);
        this.f1108a.m1308z(r0, r0.f5296E, r22, false);
        int r13 = r0.f5296E.getVisibility();
        r0.m2868b().f5006j = r0.f5296E.getAlpha();
        if (r0.f5295D == null) goto L61;
        if (r13 != 0) goto L61;
        View r14 = r0.f5296E.findFocus();
        if (r14 == null) goto L60;
        r0.m2868b().f5007k = r14;
        if (AbstractC2805zi.m5374G(2) == false) goto L60;
        r14.toString();
        Objects.toString(r0);
    L60:
        r0.f5296E.setAlpha(0.0f);
        goto L61
    L48:
        View r43 = r0.f5296E;
        r43.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC0995X6(r1, r43));
        goto L49
    L15:
        int r62 = r0.f5332w;
        if (r62 == 0) goto L34;
        if (r62 == (-1)) goto L33;
        r4 = (ViewGroup) r0.f5327r.f9513v.mo852y(r62);
        if (r4 != null) goto L30;
        if (r0.f5324o == true) goto L34;
        String r15 = r0.m2878y().getResources().getResourceName(r0.f5332w);     // Catch: Resources.NotFoundException -> L26
    L28:
        throw new IllegalArgumentException("No view found for id 0x" + Integer.toHexString(r0.f5332w) + " (" + r15 + ") for fragment " + r0);
    L26:
        r15 = "unknown";
        goto L28
    L30:
        if ((r4 instanceof FragmentContainerView) == true) goto L34;
        C0369Ii r63 = AbstractC0412Ji.f1381a;
        AbstractC0412Ji.m855b(new C0240Fi(r0, "Attempting to add fragment " + r0 + " to container " + r4 + " which is not a FragmentContainerView"));
        AbstractC0412Ji.m854a(r0).getClass();
        goto L34
    L33:
        throw new IllegalArgumentException("Cannot create fragment " + r0 + " for a container view with no id");
    L11:
        r22 = null;
        goto L12
    }

    /* JADX INFO: renamed from: g */
    public final void m700g() {
        boolean r1 = AbstractC2805zi.m5374G(3);
        AbstractComponentCallbacksC1503hi r2 = this.f1110c;
        if (r1 == false) goto L6;
        Objects.toString(r2);
    L6:
        if (r2.f5321l == true) goto L8;
    L10:
        boolean r12 = false;
    L11:
        C2428qs r6 = this.f1109b;
        if (r12 == false) goto L14;
        r6.m4865D(null, r2.f5314e);
    L14:
        if (r12 == true) goto L33;
        C0154Di r7 = (C0154Di) r6.f8523d;
        if (r7.f413d.containsKey(r2.f5314e) == true) goto L19;
    L21:
        boolean r72 = true;
    L22:
        if (r72 == true) goto L33;
        String r0 = r2.f5317h;
        if (r0 == null) goto L31;
        AbstractComponentCallbacksC1503hi r02 = r6.m4876n(r0);
        if (r02 == null) goto L31;
        if (r02.f5292A == false) goto L31;
        r2.f5316g = r02;
    L31:
        r2.f5310a = 0;
        return;
    L19:
        if (r7.f416g == false) goto L21;
        r72 = r7.f417h;
    L33:
        C2104ji r73 = r2.f5328s;
        if (r73 == null) goto L36;
        boolean r74 = ((C0154Di) r6.f8523d).f417h;
    L40:
        if (r12 == true) goto L43;
        if (r74 == true) goto L43;
    L47:
        r2.f5329t.m5413k();
        r2.f5304M.m2276e(EnumC0632On.ON_DESTROY);
        r2.f5310a = 0;
        r2.f5301J = false;
        r2.f5294C = true;
        this.f1108a.m1299p(r2, false);
        Iterator r03 = r6.m4879q().iterator();
    L49:
        if (r03.hasNext() == false) goto L55;
        C0326Hi r13 = (C0326Hi) r03.next();
        if (r13 == null) goto L49;
        AbstractComponentCallbacksC1503hi r14 = r13.f1110c;
        if (r2.f5314e.equals(r14.f5317h) == false) goto L49;
        r14.f5316g = r2;
        r14.f5317h = null;
        goto L49
    L55:
        String r04 = r2.f5317h;
        if (r04 == null) goto L58;
        r2.f5316g = r6.m4876n(r04);
    L58:
        r6.m4884v(this);
        return;
    L43:
        C0154Di r15 = (C0154Di) r6.f8523d;
        r15.getClass();
        if (AbstractC2805zi.m5374G(3) == false) goto L46;
        Objects.toString(r2);
    L46:
        r15.m298c(r2.f5314e);
        goto L47
    L36:
        AbstractActivityC1244c3 r75 = r73.f7401m;
        if (r75 == null) goto L39;
        r74 = !r75.isChangingConfigurations();
        goto L40
    L39:
        r74 = true;
        goto L40
    L8:
        if (r2.m2877k() == true) goto L10;
        r12 = true;
        goto L11
    }

    /* JADX INFO: renamed from: h */
    public final void m701h() {
        boolean r0 = AbstractC2805zi.m5374G(3);
        AbstractComponentCallbacksC1503hi r1 = this.f1110c;
        if (r0 == false) goto L5;
        Objects.toString(r1);
    L5:
        ViewGroup r02 = r1.f5295D;
        if (r02 == null) goto L10;
        View r2 = r1.f5296E;
        if (r2 == null) goto L10;
        r02.removeView(r2);
    L10:
        r1.f5329t.m5422t(1);
        if (r1.f5296E == null) goto L15;
        C0498Li r03 = r1.f5305N;
        r03.m962b();
        if (r03.f1631d.f4064c.m1371a(EnumC0675Pn.f2149c) == false) goto L15;
        r1.f5305N.m961a(EnumC0632On.ON_DESTROY);
    L15:
        r1.f5310a = 1;
        r1.f5294C = false;
        r1.mo901p();
        if (r1.f5294C == false) goto L38;
        C2709xE r22 = r1.getViewModelStore();
        C2098jc r3 = C2098jc.f7385b;
        String r5 = C0719Qo.class.getCanonicalName();
        if (r5 == null) goto L36;
        String r52 = "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(r5);
        AbstractC2580uE r6 = (AbstractC2580uE) r22.f9284a.get(r52);
        boolean r7 = C0719Qo.class.isInstance(r6);
        C0111Ci r9 = C0719Qo.f2303e;
        if (r7 == true) goto L29;
        C2557ts r62 = new C2557ts(r3);
        r62.m5044a(C1456gf.f5170n, r52);
        AbstractC2580uE r32 = r9.mo2563b(C0719Qo.class, r62);     // Catch: AbstractMethodError -> L25
    L24:
        r6 = r32;
        AbstractC2580uE r23 = (AbstractC2580uE) r22.f9284a.put(r52, r6);
        if (r23 == null) goto L29;
        r23.mo297b();
    L25:
        r32 = r9.mo171a(C0719Qo.class);
    L29:
        C0471Ky r24 = ((C0719Qo) r6).f2304d;
        if (r24.f1531c > 0) goto L33;
        r1.f5325p = false;
        this.f1108a.m1271A(r1, false);
        r1.f5295D = null;
        r1.f5296E = null;
        r1.f5305N = null;
        r1.f5306O.m5115d(null);
        r1.f5323n = false;
        return;
    L33:
        r24.f1530b[0].getClass();
        throw new ClassCastException();
    L36:
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    L38:
        throw new C0300Gz("Fragment " + r1 + " did not call through to super.onDestroyView()");
    }

    /* JADX INFO: renamed from: i */
    public final void m702i() {
        boolean r1 = AbstractC2805zi.m5374G(3);
        AbstractComponentCallbacksC1503hi r2 = this.f1110c;
        if (r1 == false) goto L5;
        Objects.toString(r2);
    L5:
        r2.f5310a = -1;
        r2.f5294C = false;
        r2.mo902q();
        if (r2.f5294C == false) goto L29;
        C0025Ai r4 = r2.f5329t;
        if (r4.f9485H == true) goto L10;
        r4.m5413k();
        r2.f5329t = new C0025Ai();
    L10:
        this.f1108a.m1300q(r2, false);
        r2.f5310a = -1;
        r2.f5328s = null;
        r2.f5330u = null;
        r2.f5327r = null;
        if (r2.f5321l == true) goto L13;
    L15:
        C0154Di r12 = (C0154Di) this.f1109b.f8523d;
        if (r12.f413d.containsKey(r2.f5314e) == true) goto L19;
    L21:
        boolean r13 = true;
    L22:
        if (r13 == true) goto L24;
        return;
    L24:
        if (AbstractC2805zi.m5374G(3) == false) goto L26;
        Objects.toString(r2);
    L26:
        r2.m2874h();
        return;
    L19:
        if (r12.f416g == false) goto L21;
        r13 = r12.f417h;
        goto L22
    L13:
        if (r2.m2877k() == true) goto L15;
    L29:
        throw new C0300Gz("Fragment " + r2 + " did not call through to super.onDetach()");
    }

    /* JADX INFO: renamed from: j */
    public final void m703j() {
        AbstractComponentCallbacksC1503hi r0 = this.f1110c;
        if (r0.f5322m == true) goto L5;
        return;
    L5:
        if (r0.f5323n == true) goto L7;
        return;
    L7:
        if (r0.f5325p == false) goto L9;
        return;
    L9:
        if (AbstractC2805zi.m5374G(3) == false) goto L11;
        Objects.toString(r0);
    L11:
        Bundle r1 = r0.f5311b;
        if (r1 == null) goto L14;
        Bundle r12 = r1.getBundle("savedInstanceState");
    L15:
        r0.mo908x(r0.mo903r(r12), null, r12);
        View r3 = r0.f5296E;
        if (r3 == null) goto L28;
        r3.setSaveFromParentEnabled(false);
        r0.f5296E.setTag(R.id.fragment_container_view_tag, r0);
        if (r0.f5334y == false) goto L20;
        r0.f5296E.setVisibility(8);
    L20:
        Bundle r32 = r0.f5311b;
        if (r32 == null) goto L23;
        r32.getBundle("savedInstanceState");
    L23:
        r0.f5329t.m5422t(2);
        this.f1108a.m1308z(r0, r0.f5296E, r12, false);
        r0.f5310a = 2;
        return;
    L28:
        return;
    L14:
        r12 = null;
        goto L15
    }

    /* JADX INFO: renamed from: k */
    public final void m704k() {
        C2428qs r0 = this.f1109b;
        boolean r1 = this.f1111d;
        AbstractComponentCallbacksC1503hi r3 = this.f1110c;
        if (r1 == false) goto L129;
        if (AbstractC2805zi.m5374G(2) == false) goto L150;
        Objects.toString(r3);
        return;
    L150:
        return;
    L129:
        this.f1111d = true;     // Catch: Throwable -> L17
        boolean r5 = false;
    L10:
        int r6 = m697d();     // Catch: Throwable -> L17
        int r7 = r3.f5310a;     // Catch: Throwable -> L17
        int r8 = 3;
        if (r6 == r7) goto L80;
        if (r6 <= r7) goto L49;
        switch((r7 + 1)) {
            case 0: goto L47;
            case 1: goto L46;
            case 2: goto L45;
            case 3: goto L44;
            case 4: goto L22;
            case 5: goto L20;
            case 6: goto L19;
            case 7: goto L16;
            default: goto L79;
        };     // Catch: Throwable -> L17
    L16:
        m707n();     // Catch: Throwable -> L17
        goto L79
    L19:
        r3.f5310a = 6;     // Catch: Throwable -> L17
        goto L79
    L20:
        m710q();     // Catch: Throwable -> L17
        goto L79
    L44:
        m694a();     // Catch: Throwable -> L17
        goto L79
    L45:
        m703j();     // Catch: Throwable -> L17
        m699f();     // Catch: Throwable -> L17
        goto L79
    L46:
        m698e();     // Catch: Throwable -> L17
        goto L79
    L47:
        m696c();     // Catch: Throwable -> L17
    L79:
        r5 = true;
        goto L10
    L22:
        if (r3.f5296E == null) goto L43;
        ViewGroup r52 = r3.f5295D;     // Catch: Throwable -> L17
        if (r52 == null) goto L43;
        r3.m2872f().m5383F();     // Catch: Throwable -> L17
        Object r72 = r52.getTag(R.id.special_effects_controller_view_tag);     // Catch: Throwable -> L17
        if ((r72 instanceof C2276nd) == false) goto L28;
        C2276nd r73 = (C2276nd) r72;     // Catch: Throwable -> L17
    L29:
        int r53 = r3.f5296E.getVisibility();     // Catch: Throwable -> L17
        if (r53 == 0) goto L38;
        if (r53 != 4) goto L33;
        r8 = 4;
    L40:
        if (AbstractC2805zi.m5374G(2) == false) goto L42;
        Objects.toString(r3);     // Catch: Throwable -> L17
    L42:
        r73.m4604a(r8, 2, this);     // Catch: Throwable -> L17
        goto L43
    L33:
        if (r53 == 8) goto L40;
        throw new IllegalArgumentException("Unknown visibility " + r53);     // Catch: Throwable -> L17
    L38:
        r8 = 2;
        goto L40
    L28:
        r73 = new C2276nd(r52);     // Catch: Throwable -> L17
        r52.setTag(R.id.special_effects_controller_view_tag, r73);     // Catch: Throwable -> L17
    L43:
        r3.f5310a = 4;     // Catch: Throwable -> L17
        goto L79
    L49:
        switch((r7 - 1)) {
            case -1: goto L78;
            case 0: goto L77;
            case 1: goto L76;
            case 2: goto L75;
            case 3: goto L55;
            case 4: goto L53;
            case 5: goto L52;
            case 6: goto L51;
            default: goto L79;
        };     // Catch: Throwable -> L17
    L51:
        m705l();     // Catch: Throwable -> L17
        goto L79
    L52:
        r3.f5310a = 5;     // Catch: Throwable -> L17
        goto L79
    L53:
        m711r();     // Catch: Throwable -> L17
        goto L79
    L75:
        r3.f5323n = false;     // Catch: Throwable -> L17
        r3.f5310a = 2;     // Catch: Throwable -> L17
        goto L79
    L76:
        m701h();     // Catch: Throwable -> L17
        r3.f5310a = 1;     // Catch: Throwable -> L17
        goto L79
    L77:
        m700g();     // Catch: Throwable -> L17
        goto L79
    L78:
        m702i();     // Catch: Throwable -> L17
        goto L79
    L55:
        if (AbstractC2805zi.m5374G(3) == false) goto L58;
        Objects.toString(r3);     // Catch: Throwable -> L17
    L58:
        if (r3.f5296E == null) goto L63;
        if (r3.f5312c != null) goto L63;
        m709p();     // Catch: Throwable -> L17
    L63:
        if (r3.f5296E == null) goto L74;
        ViewGroup r54 = r3.f5295D;     // Catch: Throwable -> L17
        if (r54 == null) goto L74;
        r3.m2872f().m5383F();     // Catch: Throwable -> L17
        Object r62 = r54.getTag(R.id.special_effects_controller_view_tag);     // Catch: Throwable -> L17
        if ((r62 instanceof C2276nd) == false) goto L69;
        C2276nd r63 = (C2276nd) r62;     // Catch: Throwable -> L17
    L71:
        if (AbstractC2805zi.m5374G(2) == false) goto L73;
        Objects.toString(r3);     // Catch: Throwable -> L17
    L73:
        r63.m4604a(1, 3, this);     // Catch: Throwable -> L17
        goto L74
    L69:
        r63 = new C2276nd(r54);     // Catch: Throwable -> L17
        r54.setTag(R.id.special_effects_controller_view_tag, r63);     // Catch: Throwable -> L17
    L74:
        r3.f5310a = 3;     // Catch: Throwable -> L17
        goto L79
    L80:
        if (r5 == true) goto L98;
        if (r7 != (-1)) goto L98;
        if (r3.f5321l == false) goto L98;
        if (r3.m2877k() == true) goto L98;
        if (AbstractC2805zi.m5374G(3) == false) goto L90;
        Objects.toString(r3);     // Catch: Throwable -> L17
    L90:
        C0154Di r55 = (C0154Di) r0.f8523d;     // Catch: Throwable -> L17
        r55.getClass();     // Catch: Throwable -> L17
        if (AbstractC2805zi.m5374G(3) == false) goto L93;
        Objects.toString(r3);     // Catch: Throwable -> L17
    L93:
        r55.m298c(r3.f5314e);     // Catch: Throwable -> L17
        r0.m4884v(this);     // Catch: Throwable -> L17
        if (AbstractC2805zi.m5374G(3) == false) goto L96;
        Objects.toString(r3);     // Catch: Throwable -> L17
    L96:
        r3.m2874h();     // Catch: Throwable -> L17
    L98:
        if (r3.f5300I == true) goto L100;
    L125:
        this.f1111d = false;
        return;
    L100:
        if (r3.f5296E == null) goto L117;
        ViewGroup r02 = r3.f5295D;     // Catch: Throwable -> L17
        if (r02 == null) goto L117;
        r3.m2872f().m5383F();     // Catch: Throwable -> L17
        Object r56 = r02.getTag(R.id.special_effects_controller_view_tag);     // Catch: Throwable -> L17
        if ((r56 instanceof C2276nd) == false) goto L106;
        C2276nd r57 = (C2276nd) r56;     // Catch: Throwable -> L17
    L108:
        if (r3.f5334y == false) goto L114;
        if (AbstractC2805zi.m5374G(2) == false) goto L112;
        Objects.toString(r3);     // Catch: Throwable -> L17
    L112:
        r57.m4604a(3, 1, this);     // Catch: Throwable -> L17
        goto L117
    L114:
        if (AbstractC2805zi.m5374G(2) == false) goto L116;
        Objects.toString(r3);     // Catch: Throwable -> L17
    L116:
        r57.m4604a(2, 1, this);     // Catch: Throwable -> L17
        goto L117
    L106:
        r57 = new C2276nd(r02);     // Catch: Throwable -> L17
        r02.setTag(R.id.special_effects_controller_view_tag, r57);     // Catch: Throwable -> L17
    L117:
        AbstractC2805zi r03 = r3.f5327r;     // Catch: Throwable -> L17
        if (r03 != null) goto L120;
    L124:
        r3.f5300I = false;     // Catch: Throwable -> L17
        r3.f5329t.m5416n();     // Catch: Throwable -> L17
        goto L125
    L120:
        if (r3.f5320k == false) goto L124;
        if (AbstractC2805zi.m5375H(r3) == false) goto L124;
        r03.f9482E = true;     // Catch: Throwable -> L17
    L17:
        th = move-exception;
        this.f1111d = false;
        throw th;
    }

    /* JADX INFO: renamed from: l */
    public final void m705l() {
        boolean r0 = AbstractC2805zi.m5374G(3);
        AbstractComponentCallbacksC1503hi r1 = this.f1110c;
        if (r0 == false) goto L5;
        Objects.toString(r1);
    L5:
        r1.f5329t.m5422t(5);
        if (r1.f5296E == null) goto L8;
        r1.f5305N.m961a(EnumC0632On.ON_PAUSE);
    L8:
        r1.f5304M.m2276e(EnumC0632On.ON_PAUSE);
        r1.f5310a = 6;
        r1.f5294C = true;
        this.f1108a.m1301s(r1, false);
    }

    /* JADX INFO: renamed from: m */
    public final void m706m(ClassLoader r4) {
        AbstractComponentCallbacksC1503hi r0 = this.f1110c;
        Bundle r1 = r0.f5311b;
        if (r1 == null) goto L16;
        r1.setClassLoader(r4);
        if (r0.f5311b.getBundle("savedInstanceState") != null) goto L8;
        r0.f5311b.putBundle("savedInstanceState", new Bundle());
    L8:
        r0.f5312c = r0.f5311b.getSparseParcelableArray("viewState");
        r0.f5313d = r0.f5311b.getBundle("viewRegistryState");
        C0283Gi r42 = (C0283Gi) r0.f5311b.getParcelable("state");
        if (r42 == null) goto L12;
        r0.f5317h = r42.f921l;
        r0.f5318i = r42.f922m;
        r0.f5298G = r42.f923n;
    L12:
        if (r0.f5298G == true) goto L15;
        r0.f5297F = true;
        return;
    L15:
        return;
    }

    /* JADX INFO: renamed from: n */
    public final void m707n() {
        boolean r0 = AbstractC2805zi.m5374G(3);
        AbstractComponentCallbacksC1503hi r1 = this.f1110c;
        if (r0 == false) goto L5;
        Objects.toString(r1);
    L5:
        C1415fi r02 = r1.f5299H;
        if (r02 != null) goto L8;
        View r03 = null;
    L9:
        if (r03 != null) goto L11;
    L21:
        r1.m2868b().f5007k = null;
        r1.f5329t.m5387N();
        r1.f5329t.m5427y(true);
        r1.f5310a = 7;
        r1.f5294C = false;
        r1.mo1177s();
        if (r1.f5294C == false) goto L29;
        C1185ao r4 = r1.f5304M;
        EnumC0632On r5 = EnumC0632On.ON_RESUME;
        r4.m2276e(r5);
        if (r1.f5296E == null) goto L26;
        r1.f5305N.m961a(r5);
    L26:
        C0025Ai r42 = r1.f5329t;
        r42.f9483F = false;
        r42.f9484G = false;
        r42.f9490M.f418i = false;
        r42.m5422t(7);
        this.f1108a.m1304v(r1, false);
        this.f1109b.m4865D(null, r1.f5314e);
        r1.f5311b = null;
        r1.f5312c = null;
        r1.f5313d = null;
        return;
    L29:
        throw new C0300Gz("Fragment " + r1 + " did not call through to super.onResume()");
    L11:
        if (r03 == r1.f5296E) goto L17;
        ViewParent r3 = r03.getParent();
    L14:
        if (r3 == null) goto L21;
        if (r3 == r1.f5296E) goto L17;
        r3 = r3.getParent();
    L17:
        r03.requestFocus();
        if (AbstractC2805zi.m5374G(2) == false) goto L21;
        r03.toString();
        Objects.toString(r1);
        Objects.toString(r1.f5296E.findFocus());
        goto L21
    L8:
        r03 = r02.f5007k;
        goto L9
    }

    /* JADX INFO: renamed from: o */
    public final Bundle m708o() {
        Bundle r0 = new Bundle();
        AbstractComponentCallbacksC1503hi r1 = this.f1110c;
        if (r1.f5310a != (-1)) goto L7;
        Bundle r2 = r1.f5311b;
        if (r2 == null) goto L7;
        r0.putAll(r2);
    L7:
        r0.putParcelable("state", new C0283Gi(r1));
        if (r1.f5310a <= (-1)) goto L27;
        Bundle r22 = new Bundle();
        r1.mo904t(r22);
        if (r22.isEmpty() == true) goto L12;
        r0.putBundle("savedInstanceState", r22);
    L12:
        this.f1108a.m1305w(r1, r22, false);
        Bundle r23 = new Bundle();
        r1.f5307P.m5270e(r23);
        if (r23.isEmpty() == true) goto L15;
        r0.putBundle("registryState", r23);
    L15:
        Bundle r24 = r1.f5329t.m5394U();
        if (r24.isEmpty() == true) goto L19;
        r0.putBundle("childFragmentManager", r24);
    L19:
        if (r1.f5296E == null) goto L21;
        m709p();
    L21:
        SparseArray<? extends Parcelable> r25 = r1.f5312c;
        if (r25 == null) goto L24;
        r0.putSparseParcelableArray("viewState", r25);
    L24:
        Bundle r26 = r1.f5313d;
        if (r26 == null) goto L27;
        r0.putBundle("viewRegistryState", r26);
    L27:
        Bundle r12 = r1.f5315f;
        if (r12 == null) goto L30;
        r0.putBundle("arguments", r12);
    L30:
        return r0;
    }

    /* JADX INFO: renamed from: p */
    public final void m709p() {
        AbstractComponentCallbacksC1503hi r0 = this.f1110c;
        if (r0.f5296E != null) goto L6;
        return;
    L6:
        if (AbstractC2805zi.m5374G(2) == false) goto L8;
        Objects.toString(r0);
        Objects.toString(r0.f5296E);
    L8:
        SparseArray<Parcelable> r1 = new SparseArray();
        r0.f5296E.saveHierarchyState(r1);
        if (r1.size() <= 0) goto L11;
        r0.f5312c = r1;
    L11:
        Bundle r12 = new Bundle();
        r0.f5305N.f1632e.m5270e(r12);
        if (r12.isEmpty() == true) goto L15;
        r0.f5313d = r12;
        return;
    }

    /* JADX INFO: renamed from: q */
    public final void m710q() {
        boolean r0 = AbstractC2805zi.m5374G(3);
        AbstractComponentCallbacksC1503hi r1 = this.f1110c;
        if (r0 == false) goto L5;
        Objects.toString(r1);
    L5:
        r1.f5329t.m5387N();
        r1.f5329t.m5427y(true);
        r1.f5310a = 5;
        r1.f5294C = false;
        r1.mo905u();
        if (r1.f5294C == false) goto L13;
        C1185ao r3 = r1.f5304M;
        EnumC0632On r4 = EnumC0632On.ON_START;
        r3.m2276e(r4);
        if (r1.f5296E == null) goto L10;
        r1.f5305N.m961a(r4);
    L10:
        C0025Ai r32 = r1.f5329t;
        r32.f9483F = false;
        r32.f9484G = false;
        r32.f9490M.f418i = false;
        r32.m5422t(5);
        this.f1108a.m1306x(r1, false);
        return;
    L13:
        throw new C0300Gz("Fragment " + r1 + " did not call through to super.onStart()");
    }

    /* JADX INFO: renamed from: r */
    public final void m711r() {
        boolean r0 = AbstractC2805zi.m5374G(3);
        AbstractComponentCallbacksC1503hi r1 = this.f1110c;
        if (r0 == false) goto L5;
        Objects.toString(r1);
    L5:
        C0025Ai r02 = r1.f5329t;
        r02.f9484G = true;
        r02.f9490M.f418i = true;
        r02.m5422t(4);
        if (r1.f5296E == null) goto L8;
        r1.f5305N.m961a(EnumC0632On.ON_STOP);
    L8:
        r1.f5304M.m2276e(EnumC0632On.ON_STOP);
        r1.f5310a = 4;
        r1.f5294C = false;
        r1.mo906v();
        if (r1.f5294C == false) goto L13;
        this.f1108a.m1307y(r1, false);
        return;
    L13:
        throw new C0300Gz("Fragment " + r1 + " did not call through to super.onStop()");
    }

    public C0326Hi(C0649P3 r2, C2428qs r3, ClassLoader r4, C2547ti r5, Bundle r6) {
        this.f1111d = false;
        this.f1112e = -1;
        this.f1108a = r2;
        this.f1109b = r3;
        C0283Gi r22 = (C0283Gi) r6.getParcelable("state");
        AbstractComponentCallbacksC1503hi r32 = r5.m5033a(r22.f910a);
        r32.f5314e = r22.f911b;
        r32.f5322m = r22.f912c;
        r32.f5324o = true;
        r32.f5331v = r22.f913d;
        r32.f5332w = r22.f914e;
        r32.f5333x = r22.f915f;
        r32.f5292A = r22.f916g;
        r32.f5321l = r22.f917h;
        r32.f5335z = r22.f918i;
        r32.f5334y = r22.f919j;
        r32.f5303L = EnumC0675Pn.values()[r22.f920k];
        r32.f5317h = r22.f921l;
        r32.f5318i = r22.f922m;
        r32.f5298G = r22.f923n;
        this.f1110c = r32;
        r32.f5311b = r6;
        Bundle r23 = r6.getBundle("arguments");
        if (r23 == null) goto L5;
        r23.setClassLoader(r4);
    L5:
        r32.m2867B(r23);
        if (AbstractC2805zi.m5374G(2) == false) goto L9;
        Objects.toString(r32);
        return;
    }

    public C0326Hi(C0649P3 r3, C2428qs r4, AbstractComponentCallbacksC1503hi r5, Bundle r6) {
        this.f1111d = false;
        this.f1112e = -1;
        this.f1108a = r3;
        this.f1109b = r4;
        this.f1110c = r5;
        r5.f5312c = null;
        r5.f5313d = null;
        r5.f5326q = 0;
        r5.f5323n = false;
        r5.f5320k = false;
        AbstractComponentCallbacksC1503hi r42 = r5.f5316g;
        if (r42 == null) goto L5;
        String r43 = r42.f5314e;
    L6:
        r5.f5317h = r43;
        r5.f5316g = null;
        r5.f5311b = r6;
        r5.f5315f = r6.getBundle("arguments");
        return;
    L5:
        r43 = null;
        goto L6
    }
}
