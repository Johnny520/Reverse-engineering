package p068l0;

import android.view.View;
import android.view.ViewGroup;
import com.abc.core.runtime.AbstractC0805P;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashSet;
import p001A0.AbstractC0040p;
import p034S.AbstractC0324d;
import p078r.AbstractC1058a;

/* JADX INFO: renamed from: l0.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0979a extends AbstractC0040p {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f3462a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ AbstractC1058a f3463b;

    public /* synthetic */ C0979a(AbstractC1058a abstractC1058a, int i2) {
        this.f3462a = i2;
        this.f3463b = abstractC1058a;
    }

    @Override // p001A0.AbstractC0040p
    /* JADX INFO: renamed from: A */
    public int mo120A() {
        switch (this.f3462a) {
            case 0:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.f3463b;
                return bottomSheetBehavior.f2289I ? bottomSheetBehavior.f2300T : bottomSheetBehavior.f2287G;
            default:
                return super.mo120A();
        }
    }

    @Override // p001A0.AbstractC0040p
    /* JADX INFO: renamed from: L */
    public final void mo124L(int i2) {
        switch (this.f3462a) {
            case 0:
                if (i2 == 1) {
                    BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.f3463b;
                    if (bottomSheetBehavior.f2291K) {
                        bottomSheetBehavior.m1836C(1);
                    }
                }
                break;
            default:
                if (i2 == 1) {
                    SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f3463b;
                    if (sideSheetBehavior.f2415g) {
                        sideSheetBehavior.m1882r(1);
                    }
                }
                break;
        }
    }

    @Override // p001A0.AbstractC0040p
    /* JADX INFO: renamed from: M */
    public final void mo125M(View view, int i2, int i3) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        switch (this.f3462a) {
            case 0:
                ((BottomSheetBehavior) this.f3463b).m1849u(i3);
                return;
            default:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f3463b;
                WeakReference weakReference = sideSheetBehavior.f2425q;
                View view2 = weakReference != null ? (View) weakReference.get() : null;
                if (view2 != null && (marginLayoutParams = (ViewGroup.MarginLayoutParams) view2.getLayoutParams()) != null) {
                    sideSheetBehavior.f2409a.mo2064X(marginLayoutParams, view.getLeft(), view.getRight());
                    view2.setLayoutParams(marginLayoutParams);
                }
                LinkedHashSet linkedHashSet = sideSheetBehavior.f2429u;
                if (linkedHashSet.isEmpty()) {
                    return;
                }
                sideSheetBehavior.f2409a.mo2066b(i2);
                Iterator it = linkedHashSet.iterator();
                if (it.hasNext()) {
                    AbstractC0324d.m726i(it.next());
                    throw null;
                }
                return;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00e6  */
    @Override // p001A0.AbstractC0040p
    /* JADX INFO: renamed from: N */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo126N(View view, float f2, float f3) {
        switch (this.f3462a) {
            case 0:
                int i2 = 6;
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.f3463b;
                if (f3 < 0.0f) {
                    if (bottomSheetBehavior.f2309b) {
                        i2 = 3;
                    } else {
                        int top = view.getTop();
                        System.currentTimeMillis();
                        if (top <= bottomSheetBehavior.f2285E) {
                        }
                    }
                } else if (bottomSheetBehavior.f2289I && bottomSheetBehavior.m1837D(view, f3)) {
                    if (Math.abs(f2) >= Math.abs(f3) || f3 <= bottomSheetBehavior.f2313d) {
                        if (view.getTop() > (bottomSheetBehavior.m1850x() + bottomSheetBehavior.f2300T) / 2) {
                            i2 = 5;
                        } else if (bottomSheetBehavior.f2309b || Math.abs(view.getTop() - bottomSheetBehavior.m1850x()) < Math.abs(view.getTop() - bottomSheetBehavior.f2285E)) {
                        }
                    }
                } else if (f3 == 0.0f || Math.abs(f2) > Math.abs(f3)) {
                    int top2 = view.getTop();
                    if (!bottomSheetBehavior.f2309b) {
                        int i3 = bottomSheetBehavior.f2285E;
                        if (top2 < i3) {
                            if (top2 < Math.abs(top2 - bottomSheetBehavior.f2287G)) {
                            }
                        } else if (Math.abs(top2 - i3) >= Math.abs(top2 - bottomSheetBehavior.f2287G)) {
                        }
                    } else if (Math.abs(top2 - bottomSheetBehavior.f2284D) >= Math.abs(top2 - bottomSheetBehavior.f2287G)) {
                        i2 = 4;
                    }
                } else if (!bottomSheetBehavior.f2309b) {
                    int top3 = view.getTop();
                    if (Math.abs(top3 - bottomSheetBehavior.f2285E) >= Math.abs(top3 - bottomSheetBehavior.f2287G)) {
                    }
                }
                bottomSheetBehavior.getClass();
                bottomSheetBehavior.m1838E(view, i2, true);
                break;
            default:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f3463b;
                int i4 = 3;
                if (!sideSheetBehavior.f2409a.mo2056D(f2)) {
                    if (sideSheetBehavior.f2409a.mo2063W(view, f2)) {
                        if (sideSheetBehavior.f2409a.mo2058H(f2, f3) || sideSheetBehavior.f2409a.mo2057G(view)) {
                            i4 = 5;
                        }
                    } else if (f2 == 0.0f || Math.abs(f2) <= Math.abs(f3)) {
                        int left = view.getLeft();
                        if (Math.abs(left - sideSheetBehavior.f2409a.mo2075u()) >= Math.abs(left - sideSheetBehavior.f2409a.mo2076v())) {
                        }
                    }
                }
                sideSheetBehavior.m1884t(view, i4, true);
                break;
        }
    }

    @Override // p001A0.AbstractC0040p
    /* JADX INFO: renamed from: d0 */
    public final boolean mo131d0(View view, int i2) {
        WeakReference weakReference;
        switch (this.f3462a) {
            case 0:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.f3463b;
                int i3 = bottomSheetBehavior.f2292L;
                if (i3 != 1 && !bottomSheetBehavior.f2308a0) {
                    if (i3 == 3 && bottomSheetBehavior.f2305Y == i2) {
                        WeakReference weakReference2 = bottomSheetBehavior.f2302V;
                        View view2 = weakReference2 != null ? (View) weakReference2.get() : null;
                        if (view2 != null && view2.canScrollVertically(-1)) {
                        }
                    }
                    System.currentTimeMillis();
                    WeakReference weakReference3 = bottomSheetBehavior.f2301U;
                    if (weakReference3 != null && weakReference3.get() == view) {
                        break;
                    }
                }
                break;
            default:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f3463b;
                if (sideSheetBehavior.f2416h != 1 && (weakReference = sideSheetBehavior.f2424p) != null && weakReference.get() == view) {
                }
                break;
        }
        return true;
    }

    @Override // p001A0.AbstractC0040p
    /* JADX INFO: renamed from: k */
    public final int mo133k(View view, int i2) {
        switch (this.f3462a) {
            case 0:
                return view.getLeft();
            default:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f3463b;
                return AbstractC0805P.m2043f(i2, sideSheetBehavior.f2409a.mo2078y(), sideSheetBehavior.f2409a.mo2077x());
        }
    }

    @Override // p001A0.AbstractC0040p
    /* JADX INFO: renamed from: l */
    public final int mo134l(View view, int i2) {
        switch (this.f3462a) {
            case 0:
                return AbstractC0805P.m2043f(i2, ((BottomSheetBehavior) this.f3463b).m1850x(), mo120A());
            default:
                return view.getTop();
        }
    }

    @Override // p001A0.AbstractC0040p
    /* JADX INFO: renamed from: z */
    public int mo136z(View view) {
        switch (this.f3462a) {
            case 1:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f3463b;
                return sideSheetBehavior.f2420l + sideSheetBehavior.f2423o;
            default:
                return super.mo136z(view);
        }
    }
}
