package p068l0;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashSet;
import p001A0.AbstractC0040p;
import p034S.AbstractC0324d;
import p056f0.AbstractC0805P;
import p078r.AbstractC1058a;

/* JADX INFO: renamed from: l0.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0979a extends AbstractC0040p {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f3462a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ AbstractC1058a f3463b;

    public /* synthetic */ C0979a(AbstractC1058a r1, int r2) {
        this.f3462a = r2;
        this.f3463b = r1;
    }

    @Override // p001A0.AbstractC0040p
    /* JADX INFO: renamed from: A */
    public int mo120A() {
        switch(this.f3462a) {
            case 0: goto L6;
            default: goto L5;
        };
    L6:
        BottomSheetBehavior r02 = (BottomSheetBehavior) this.f3463b;
        if (r02.f2289I == false) goto L10;
        return r02.f2300T;
    L10:
        return r02.f2287G;
    L5:
        return super.mo120A();
    }

    @Override // p001A0.AbstractC0040p
    /* JADX INFO: renamed from: L */
    public final void mo124L(int r3) {
        switch(this.f3462a) {
            case 0: goto L11;
            default: goto L5;
        };
    L5:
        if (r3 != 1) goto L16;
        SideSheetBehavior r32 = (SideSheetBehavior) this.f3463b;
        if (r32.f2415g == false) goto L17;
        r32.m1882r(1);
        return;
    L17:
        return;
    L16:
        return;
    L11:
        if (r3 != 1) goto L18;
        BottomSheetBehavior r33 = (BottomSheetBehavior) this.f3463b;
        if (r33.f2291K == false) goto L19;
        r33.m1836C(1);
        return;
    L19:
        return;
    }

    @Override // p001A0.AbstractC0040p
    /* JADX INFO: renamed from: M */
    public final void mo125M(View r6, int r7, int r8) {
        switch(this.f3462a) {
            case 0: goto L20;
            default: goto L4;
        };
    L4:
        SideSheetBehavior r82 = (SideSheetBehavior) this.f3463b;
        WeakReference r02 = r82.f2425q;
        if (r02 == null) goto L7;
        View r03 = (View) r02.get();
    L8:
        if (r03 == null) goto L12;
        ViewGroup.MarginLayoutParams r2 = (ViewGroup.MarginLayoutParams) r03.getLayoutParams();
        if (r2 == null) goto L12;
        r82.f2409a.mo2064X(r2, r6.getLeft(), r6.getRight());
        r03.setLayoutParams(r2);
    L12:
        LinkedHashSet r62 = r82.f2429u;
        if (r62.isEmpty() == true) goto L19;
        r82.f2409a.mo2066b(r7);
        Iterator r63 = r62.iterator();
        if (r63.hasNext() == false) goto L22;
        AbstractC0324d.m726i(r63.next());
        throw null;
    L22:
        return;
    L19:
        return;
    L7:
        r03 = null;
        goto L8
    L20:
        ((BottomSheetBehavior) this.f3463b).m1849u(r8);
    }

    @Override // p001A0.AbstractC0040p
    /* JADX INFO: renamed from: N */
    public final void mo126N(View r6, float r7, float r8) {
        switch(this.f3462a) {
            case 0: goto L23;
            default: goto L4;
        };
    L4:
        SideSheetBehavior r02 = (SideSheetBehavior) this.f3463b;
        int r2 = 3;
        if (r02.f2409a.mo2056D(r7) == false) goto L8;
    L21:
        r02.m1884t(r6, r2, true);
        return;
    L8:
        if (r02.f2409a.mo2063W(r6, r7) == false) goto L15;
        if (r02.f2409a.mo2058H(r7, r8) == false) goto L12;
    L13:
        r2 = 5;
        goto L21
    L12:
        if (r02.f2409a.mo2057G(r6) == false) goto L21;
    L15:
        if (r7 != 0.0f) goto L17;
    L19:
        int r72 = r6.getLeft();
        if (Math.abs(r72 - r02.f2409a.mo2075u()) >= Math.abs(r72 - r02.f2409a.mo2076v())) goto L13;
    L17:
        if (Math.abs(r7) <= Math.abs(r8)) goto L19;
    L23:
        int r22 = 6;
        BottomSheetBehavior r4 = (BottomSheetBehavior) this.f3463b;
        if (r8 >= 0.0f) goto L32;
        if (r4.f2309b == false) goto L28;
    L27:
        r22 = 3;
    L71:
        r4.getClass();
        r4.m1838E(r6, r22, true);
        return;
    L28:
        int r73 = r6.getTop();
        System.currentTimeMillis();
        if (r73 <= r4.f2285E) goto L27;
    L32:
        if (r4.f2289I == false) goto L49;
        if (r4.m1837D(r6, r8) == false) goto L49;
        if (Math.abs(r7) >= Math.abs(r8)) goto L40;
        if (r8 <= r4.f2313d) goto L40;
    L41:
        r22 = 5;
    L40:
        if (r6.getTop() > ((r4.m1850x() + r4.f2300T) / 2)) goto L41;
        if (r4.f2309b == true) goto L27;
        if (Math.abs(r6.getTop() - r4.m1850x()) >= Math.abs(r6.getTop() - r4.f2285E)) goto L71;
    L49:
        if (r8 != 0.0f) goto L51;
    L59:
        int r74 = r6.getTop();
        if (r4.f2309b == true) goto L62;
        int r82 = r4.f2285E;
        if (r74 >= r82) goto L70;
        if (r74 >= Math.abs(r74 - r4.f2287G)) goto L71;
    L70:
        if (Math.abs(r74 - r82) < Math.abs(r74 - r4.f2287G)) goto L71;
    L55:
        r22 = 4;
        goto L71
    L62:
        if (Math.abs(r74 - r4.f2284D) >= Math.abs(r74 - r4.f2287G)) goto L55;
    L51:
        if (Math.abs(r7) > Math.abs(r8)) goto L59;
        if (r4.f2309b == true) goto L55;
        int r75 = r6.getTop();
        if (Math.abs(r75 - r4.f2285E) >= Math.abs(r75 - r4.f2287G)) goto L55;
        goto L55
    }

    @Override // p001A0.AbstractC0040p
    /* JADX INFO: renamed from: d0 */
    public final boolean mo131d0(View r6, int r7) {
        switch(this.f3462a) {
            case 0: goto L13;
            default: goto L4;
        };
    L4:
        SideSheetBehavior r72 = (SideSheetBehavior) this.f3463b;
        if (r72.f2416h == 1) goto L39;
        WeakReference r73 = r72.f2424p;
        if (r73 != null) goto L10;
        return false;
    L10:
        if (r73.get() == r6) goto L12;
        return false;
    L12:
        return true;
    L39:
        return false;
    L13:
        BottomSheetBehavior r02 = (BottomSheetBehavior) this.f3463b;
        int r1 = r02.f2292L;
        if (r1 != 1) goto L17;
        return false;
    L17:
        if (r02.f2308a0 == false) goto L20;
        return false;
    L20:
        if (r1 == 3) goto L22;
    L31:
        System.currentTimeMillis();
        WeakReference r74 = r02.f2301U;
        if (r74 != null) goto L34;
        return false;
    L34:
        if (r74.get() == r6) goto L36;
        return false;
    L36:
        return true;
    L22:
        if (r02.f2305Y != r7) goto L31;
        WeakReference r75 = r02.f2302V;
        if (r75 == null) goto L26;
        View r76 = (View) r75.get();
    L27:
        if (r76 == null) goto L31;
        if (r76.canScrollVertically(-1) == false) goto L31;
        return false;
    L26:
        r76 = null;
        goto L27
    }

    @Override // p001A0.AbstractC0040p
    /* JADX INFO: renamed from: k */
    public final int mo133k(View r2, int r3) {
        switch(this.f3462a) {
            case 0: goto L7;
            default: goto L4;
        };
    L4:
        SideSheetBehavior r22 = (SideSheetBehavior) this.f3463b;
        return AbstractC0805P.m2043f(r3, r22.f2409a.mo2078y(), r22.f2409a.mo2077x());
    L7:
        return r2.getLeft();
    }

    @Override // p001A0.AbstractC0040p
    /* JADX INFO: renamed from: l */
    public final int mo134l(View r2, int r3) {
        switch(this.f3462a) {
            case 0: goto L7;
            default: goto L5;
        };
    L5:
        return r2.getTop();
    L7:
        return AbstractC0805P.m2043f(r3, ((BottomSheetBehavior) this.f3463b).m1850x(), mo120A());
    }

    @Override // p001A0.AbstractC0040p
    /* JADX INFO: renamed from: z */
    public int mo136z(View r2) {
        switch(this.f3462a) {
            case 1: goto L6;
            default: goto L5;
        };
    L6:
        SideSheetBehavior r22 = (SideSheetBehavior) this.f3463b;
        return r22.f2420l + r22.f2423o;
    L5:
        return super.mo136z(r2);
    }
}
