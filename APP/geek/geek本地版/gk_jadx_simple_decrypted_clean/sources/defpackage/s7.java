package defpackage;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes.dex */
public final class s7 extends gt {
    public final /* synthetic */ int a;
    public final /* synthetic */ wd b;

    public /* synthetic */ s7(wd r1, int r2) {
        this.a = r2;
        this.b = r1;
    }

    @Override // defpackage.gt
    public final boolean H(View r5, int r6) {
        switch(this.a) {
            case 0: goto L13;
            default: goto L4;
        };
    L4:
        SideSheetBehavior r62 = (SideSheetBehavior) this.b;
        if (r62.h == 1) goto L40;
        WeakReference r63 = r62.p;
        if (r63 != null) goto L10;
        return false;
    L10:
        if (r63.get() == r5) goto L12;
        return false;
    L12:
        return true;
    L40:
        return false;
    L13:
        BottomSheetBehavior r0 = (BottomSheetBehavior) this.b;
        int r1 = r0.L;
        if (r1 != 1) goto L17;
    L36:
        return false;
    L17:
        if (r0.a0 == true) goto L36;
        if (r1 == 3) goto L22;
    L31:
        System.currentTimeMillis();
        WeakReference r64 = r0.U;
        if (r64 == null) goto L36;
        if (r64.get() != r5) goto L36;
        return true;
    L22:
        if (r0.Y != r6) goto L31;
        WeakReference r65 = r0.V;
        if (r65 == null) goto L26;
        View r66 = (View) r65.get();
    L27:
        if (r66 == null) goto L31;
        if (r66.canScrollVertically(-1) == false) goto L31;
    L26:
        r66 = null;
        goto L27
    }

    @Override // defpackage.gt
    public final int b(View r2, int r3) {
        switch(this.a) {
            case 0: goto L7;
            default: goto L4;
        };
    L4:
        SideSheetBehavior r22 = (SideSheetBehavior) this.b;
        return ct.d(r3, r22.a.o(), r22.a.n());
    L7:
        return r2.getLeft();
    }

    @Override // defpackage.gt
    public final int c(View r2, int r3) {
        switch(this.a) {
            case 0: goto L7;
            default: goto L5;
        };
    L5:
        return r2.getTop();
    L7:
        return ct.d(r3, ((BottomSheetBehavior) this.b).x(), m());
    }

    @Override // defpackage.gt
    public int l(View r2) {
        switch(this.a) {
            case 1: goto L6;
            default: goto L5;
        };
    L6:
        SideSheetBehavior r22 = (SideSheetBehavior) this.b;
        return r22.l + r22.o;
    L5:
        return super.l(r2);
    }

    @Override // defpackage.gt
    public int m() {
        switch(this.a) {
            case 0: goto L6;
            default: goto L5;
        };
    L6:
        BottomSheetBehavior r0 = (BottomSheetBehavior) this.b;
        if (r0.I == false) goto L10;
        return r0.T;
    L10:
        return r0.G;
    L5:
        return super.m();
    }

    @Override // defpackage.gt
    public final void s(int r3) {
        switch(this.a) {
            case 0: goto L11;
            default: goto L5;
        };
    L5:
        if (r3 != 1) goto L16;
        SideSheetBehavior r32 = (SideSheetBehavior) this.b;
        if (r32.g == false) goto L17;
        r32.r(1);
        return;
    L17:
        return;
    L16:
        return;
    L11:
        if (r3 != 1) goto L18;
        BottomSheetBehavior r33 = (BottomSheetBehavior) this.b;
        if (r33.K == false) goto L19;
        r33.C(1);
        return;
    L19:
        return;
    }

    @Override // defpackage.gt
    public final void t(View r5, int r6, int r7) {
        switch(this.a) {
            case 0: goto L20;
            default: goto L4;
        };
    L4:
        SideSheetBehavior r72 = (SideSheetBehavior) this.b;
        WeakReference r0 = r72.q;
        if (r0 == null) goto L7;
        View r02 = (View) r0.get();
    L8:
        if (r02 == null) goto L12;
        ViewGroup.MarginLayoutParams r1 = (ViewGroup.MarginLayoutParams) r02.getLayoutParams();
        if (r1 == null) goto L12;
        r72.a.R(r1, r5.getLeft(), r5.getRight());
        r02.setLayoutParams(r1);
    L12:
        LinkedHashSet r52 = r72.u;
        if (r52.isEmpty() == true) goto L19;
        r72.a.b(r6);
        Iterator r53 = r52.iterator();
        if (r53.hasNext() == true) goto L18;
        return;
    L18:
        throw z30.h(r53);
    L19:
        return;
    L7:
        r02 = null;
        goto L8
    L20:
        ((BottomSheetBehavior) this.b).u(r7);
    }

    @Override // defpackage.gt
    public final void u(View r6, float r7, float r8) {
        switch(this.a) {
            case 0: goto L25;
            default: goto L4;
        };
    L4:
        SideSheetBehavior r0 = (SideSheetBehavior) this.b;
        if (r0.a.A(r7) == false) goto L8;
    L21:
        int r72 = 3;
    L23:
        r0.t(r6, r72, true);
        return;
    L8:
        if (r0.a.P(r6, r7) == false) goto L15;
        if (r0.a.D(r7, r8) == false) goto L12;
    L22:
        r72 = 5;
        goto L23
    L12:
        if (r0.a.C(r6) == false) goto L21;
    L15:
        if (r7 != 0.0f) goto L17;
    L19:
        int r73 = r6.getLeft();
        if (Math.abs(r73 - r0.a.l()) >= Math.abs(r73 - r0.a.m())) goto L22;
    L17:
        if (Math.abs(r7) <= Math.abs(r8)) goto L19;
    L25:
        BottomSheetBehavior r02 = (BottomSheetBehavior) this.b;
        int r3 = 6;
        if (r8 >= 0.0f) goto L34;
        if (r02.b == false) goto L30;
    L29:
        r3 = 3;
    L75:
        r02.getClass();
        r02.E(r6, r3, true);
        return;
    L30:
        int r74 = r6.getTop();
        System.currentTimeMillis();
        r02.getClass();
        if (r74 <= r02.E) goto L29;
    L34:
        if (r02.I == false) goto L51;
        if (r02.D(r6, r8) == false) goto L51;
        if (Math.abs(r7) >= Math.abs(r8)) goto L42;
        if (r8 <= r02.d) goto L42;
    L43:
        r3 = 5;
    L42:
        if (r6.getTop() > ((r02.x() + r02.T) / 2)) goto L43;
        if (r02.b == true) goto L29;
        if (Math.abs(r6.getTop() - r02.x()) >= Math.abs(r6.getTop() - r02.E)) goto L75;
    L51:
        if (r8 != 0.0f) goto L53;
    L61:
        int r75 = r6.getTop();
        if (r02.b == true) goto L64;
        int r82 = r02.E;
        if (r75 >= r82) goto L73;
        if (r75 < Math.abs(r75 - r02.G)) goto L29;
        r02.getClass();
        goto L75
    L73:
        if (Math.abs(r75 - r82) < Math.abs(r75 - r02.G)) goto L74;
    L57:
        r3 = 4;
        goto L75
    L74:
        r02.getClass();
        goto L75
    L64:
        if (Math.abs(r75 - r02.D) >= Math.abs(r75 - r02.G)) goto L57;
    L53:
        if (Math.abs(r7) > Math.abs(r8)) goto L61;
        if (r02.b == true) goto L57;
        int r76 = r6.getTop();
        if (Math.abs(r76 - r02.E) >= Math.abs(r76 - r02.G)) goto L57;
        r02.getClass();
        goto L75
    }
}
