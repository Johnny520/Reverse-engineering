package p000;

import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: renamed from: Z5 */
/* JADX INFO: loaded from: classes.dex */
public final class C1080Z5 extends AbstractC1293cr {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ int f3445f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ AbstractC0706Qb f3446g;

    public /* synthetic */ C1080Z5(AbstractC0706Qb r1, int r2) {
        this.f3445f = r2;
        this.f3446g = r1;
    }

    @Override // p000.AbstractC1293cr
    /* JADX INFO: renamed from: B */
    public int mo1385B(View r2) {
        switch(this.f3445f) {
            case 1: goto L6;
            default: goto L5;
        };
    L6:
        SideSheetBehavior r22 = (SideSheetBehavior) this.f3446g;
        return r22.f4573l + r22.f4576o;
    L5:
        return super.mo1385B(r2);
    }

    @Override // p000.AbstractC1293cr
    /* JADX INFO: renamed from: C */
    public int mo2017C() {
        switch(this.f3445f) {
            case 0: goto L6;
            default: goto L5;
        };
    L6:
        BottomSheetBehavior r0 = (BottomSheetBehavior) this.f3446g;
        if (r0.f4417I == false) goto L10;
        return r0.f4430V;
    L10:
        return r0.f4415G;
    L5:
        return super.mo2017C();
    }

    @Override // p000.AbstractC1293cr
    /* JADX INFO: renamed from: K */
    public final void mo1387K(int r3) {
        switch(this.f3445f) {
            case 0: goto L11;
            default: goto L5;
        };
    L5:
        if (r3 != 1) goto L16;
        SideSheetBehavior r32 = (SideSheetBehavior) this.f3446g;
        if (r32.f4568g == false) goto L17;
        r32.m2468r(1);
        return;
    L17:
        return;
    L16:
        return;
    L11:
        if (r3 != 1) goto L18;
        BottomSheetBehavior r33 = (BottomSheetBehavior) this.f3446g;
        if (r33.f4419K == false) goto L19;
        r33.m2431C(1);
        return;
    L19:
        return;
    }

    @Override // p000.AbstractC1293cr
    /* JADX INFO: renamed from: L */
    public final void mo1388L(View r5, int r6, int r7) {
        switch(this.f3445f) {
            case 0: goto L20;
            default: goto L4;
        };
    L4:
        SideSheetBehavior r72 = (SideSheetBehavior) this.f3446g;
        WeakReference r0 = r72.f4578q;
        if (r0 == null) goto L7;
        View r02 = (View) r0.get();
    L8:
        if (r02 == null) goto L12;
        ViewGroup.MarginLayoutParams r1 = (ViewGroup.MarginLayoutParams) r02.getLayoutParams();
        if (r1 == null) goto L12;
        r72.f4562a.mo869X(r1, r5.getLeft(), r5.getRight());
        r02.setLayoutParams(r1);
    L12:
        LinkedHashSet r52 = r72.f4582u;
        if (r52.isEmpty() == true) goto L19;
        r72.f4562a.mo871e(r6);
        Iterator r53 = r52.iterator();
        if (r53.hasNext() == false) goto L22;
        r53.next().getClass();
        throw new ClassCastException();
    L22:
        return;
    L19:
        return;
    L7:
        r02 = null;
        goto L8
    L20:
        ((BottomSheetBehavior) this.f3446g).m2441u(r7);
    }

    @Override // p000.AbstractC1293cr
    /* JADX INFO: renamed from: M */
    public final void mo1389M(View r6, float r7, float r8) {
        switch(this.f3445f) {
            case 0: goto L25;
            default: goto L4;
        };
    L4:
        SideSheetBehavior r0 = (SideSheetBehavior) this.f3446g;
        if (r0.f4562a.mo865G(r7) == false) goto L8;
    L21:
        int r72 = 3;
    L23:
        r0.m2470t(r6, r72, true);
        return;
    L8:
        if (r0.f4562a.mo868S(r6, r7) == false) goto L15;
        if (r0.f4562a.mo867K(r7, r8) == false) goto L12;
    L22:
        r72 = 5;
        goto L23
    L12:
        if (r0.f4562a.mo866J(r6) == false) goto L21;
    L15:
        if (r7 != 0.0f) goto L17;
    L19:
        int r73 = r6.getLeft();
        if (Math.abs(r73 - r0.f4562a.mo872q()) >= Math.abs(r73 - r0.f4562a.mo873r())) goto L22;
    L17:
        if (Math.abs(r7) <= Math.abs(r8)) goto L19;
    L25:
        BottomSheetBehavior r02 = (BottomSheetBehavior) this.f3446g;
        int r3 = 6;
        if (r8 >= 0.0f) goto L34;
        if (r02.f4437b == false) goto L30;
    L29:
        r3 = 3;
    L75:
        r02.getClass();
        r02.m2433E(r6, r3, true);
        return;
    L30:
        int r74 = r6.getTop();
        SystemClock.uptimeMillis();
        r02.getClass();
        if (r74 <= r02.f4413E) goto L29;
    L34:
        if (r02.f4417I == false) goto L51;
        if (r02.m2432D(r6, r8) == false) goto L51;
        if (Math.abs(r7) >= Math.abs(r8)) goto L42;
        if (r8 <= r02.f4441d) goto L42;
    L43:
        r3 = 5;
    L42:
        if (r6.getTop() > ((r02.m2442x() + r02.f4430V) / 2)) goto L43;
        if (r02.f4437b == true) goto L29;
        if (Math.abs(r6.getTop() - r02.m2442x()) >= Math.abs(r6.getTop() - r02.f4413E)) goto L75;
    L51:
        if (r8 != 0.0f) goto L53;
    L61:
        int r75 = r6.getTop();
        if (r02.f4437b == true) goto L64;
        int r82 = r02.f4413E;
        if (r75 >= r82) goto L73;
        if (r75 < Math.abs(r75 - r02.f4415G)) goto L29;
        r02.getClass();
        goto L75
    L73:
        if (Math.abs(r75 - r82) < Math.abs(r75 - r02.f4415G)) goto L74;
    L57:
        r3 = 4;
        goto L75
    L74:
        r02.getClass();
        goto L75
    L64:
        if (Math.abs(r75 - r02.f4412D) >= Math.abs(r75 - r02.f4415G)) goto L57;
    L53:
        if (Math.abs(r7) > Math.abs(r8)) goto L61;
        if (r02.f4437b == true) goto L57;
        int r76 = r6.getTop();
        if (Math.abs(r76 - r02.f4413E) >= Math.abs(r76 - r02.f4415G)) goto L57;
        r02.getClass();
        goto L75
    }

    @Override // p000.AbstractC1293cr
    /* JADX INFO: renamed from: W */
    public final boolean mo1390W(View r5, int r6) {
        switch(this.f3445f) {
            case 0: goto L13;
            default: goto L4;
        };
    L4:
        SideSheetBehavior r62 = (SideSheetBehavior) this.f3446g;
        if (r62.f4569h == 1) goto L40;
        WeakReference r63 = r62.f4577p;
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
        BottomSheetBehavior r0 = (BottomSheetBehavior) this.f3446g;
        int r1 = r0.f4422N;
        if (r1 != 1) goto L17;
    L36:
        return false;
    L17:
        if (r0.f4440c0 == true) goto L36;
        if (r1 == 3) goto L22;
    L31:
        SystemClock.uptimeMillis();
        WeakReference r64 = r0.f4431W;
        if (r64 == null) goto L36;
        if (r64.get() != r5) goto L36;
        return true;
    L22:
        if (r0.f4436a0 != r6) goto L31;
        WeakReference r65 = r0.f4432X;
        if (r65 == null) goto L26;
        View r66 = (View) r65.get();
    L27:
        if (r66 == null) goto L31;
        if (r66.canScrollVertically(-1) == false) goto L31;
    L26:
        r66 = null;
        goto L27
    }

    @Override // p000.AbstractC1293cr
    /* JADX INFO: renamed from: j */
    public final int mo1391j(View r2, int r3) {
        switch(this.f3445f) {
            case 0: goto L7;
            default: goto L4;
        };
    L4:
        SideSheetBehavior r22 = (SideSheetBehavior) this.f3446g;
        return AbstractC0585Nj.m1137e(r3, r22.f4562a.mo875t(), r22.f4562a.mo874s());
    L7:
        return r2.getLeft();
    }

    @Override // p000.AbstractC1293cr
    /* JADX INFO: renamed from: k */
    public final int mo1392k(View r2, int r3) {
        switch(this.f3445f) {
            case 0: goto L7;
            default: goto L5;
        };
    L5:
        return r2.getTop();
    L7:
        return AbstractC0585Nj.m1137e(r3, ((BottomSheetBehavior) this.f3446g).m2442x(), mo2017C());
    }
}
