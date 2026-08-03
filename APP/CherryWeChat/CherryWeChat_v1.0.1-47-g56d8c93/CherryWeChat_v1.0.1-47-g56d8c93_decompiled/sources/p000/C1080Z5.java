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

    public /* synthetic */ C1080Z5(AbstractC0706Qb abstractC0706Qb, int i) {
        this.f3445f = i;
        this.f3446g = abstractC0706Qb;
    }

    @Override // p000.AbstractC1293cr
    /* JADX INFO: renamed from: B */
    public int mo1385B(View view) {
        switch (this.f3445f) {
            case 1:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f3446g;
                return sideSheetBehavior.f4573l + sideSheetBehavior.f4576o;
            default:
                return super.mo1385B(view);
        }
    }

    @Override // p000.AbstractC1293cr
    /* JADX INFO: renamed from: C */
    public int mo2017C() {
        switch (this.f3445f) {
            case 0:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.f3446g;
                return bottomSheetBehavior.f4417I ? bottomSheetBehavior.f4430V : bottomSheetBehavior.f4415G;
            default:
                return super.mo2017C();
        }
    }

    @Override // p000.AbstractC1293cr
    /* JADX INFO: renamed from: K */
    public final void mo1387K(int i) {
        switch (this.f3445f) {
            case 0:
                if (i == 1) {
                    BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.f3446g;
                    if (bottomSheetBehavior.f4419K) {
                        bottomSheetBehavior.m2431C(1);
                    }
                }
                break;
            default:
                if (i == 1) {
                    SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f3446g;
                    if (sideSheetBehavior.f4568g) {
                        sideSheetBehavior.m2468r(1);
                    }
                }
                break;
        }
    }

    @Override // p000.AbstractC1293cr
    /* JADX INFO: renamed from: L */
    public final void mo1388L(View view, int i, int i2) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        switch (this.f3445f) {
            case 0:
                ((BottomSheetBehavior) this.f3446g).m2441u(i2);
                return;
            default:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f3446g;
                WeakReference weakReference = sideSheetBehavior.f4578q;
                View view2 = weakReference != null ? (View) weakReference.get() : null;
                if (view2 != null && (marginLayoutParams = (ViewGroup.MarginLayoutParams) view2.getLayoutParams()) != null) {
                    sideSheetBehavior.f4562a.mo869X(marginLayoutParams, view.getLeft(), view.getRight());
                    view2.setLayoutParams(marginLayoutParams);
                }
                LinkedHashSet linkedHashSet = sideSheetBehavior.f4582u;
                if (linkedHashSet.isEmpty()) {
                    return;
                }
                sideSheetBehavior.f4562a.mo871e(i);
                Iterator it = linkedHashSet.iterator();
                if (it.hasNext()) {
                    it.next().getClass();
                    throw new ClassCastException();
                }
                return;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00e9  */
    @Override // p000.AbstractC1293cr
    /* JADX INFO: renamed from: M */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo1389M(View view, float f, float f2) {
        int i;
        switch (this.f3445f) {
            case 0:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.f3446g;
                int i2 = 6;
                if (f2 < 0.0f) {
                    if (bottomSheetBehavior.f4437b) {
                        i2 = 3;
                    } else {
                        int top = view.getTop();
                        SystemClock.uptimeMillis();
                        bottomSheetBehavior.getClass();
                        if (top <= bottomSheetBehavior.f4413E) {
                        }
                    }
                } else if (bottomSheetBehavior.f4417I && bottomSheetBehavior.m2432D(view, f2)) {
                    if (Math.abs(f) >= Math.abs(f2) || f2 <= bottomSheetBehavior.f4441d) {
                        if (view.getTop() > (bottomSheetBehavior.m2442x() + bottomSheetBehavior.f4430V) / 2) {
                            i2 = 5;
                        } else if (bottomSheetBehavior.f4437b || Math.abs(view.getTop() - bottomSheetBehavior.m2442x()) < Math.abs(view.getTop() - bottomSheetBehavior.f4413E)) {
                        }
                    }
                } else if (f2 == 0.0f || Math.abs(f) > Math.abs(f2)) {
                    int top2 = view.getTop();
                    if (!bottomSheetBehavior.f4437b) {
                        int i3 = bottomSheetBehavior.f4413E;
                        if (top2 < i3) {
                            if (top2 >= Math.abs(top2 - bottomSheetBehavior.f4415G)) {
                                bottomSheetBehavior.getClass();
                            }
                        } else if (Math.abs(top2 - i3) < Math.abs(top2 - bottomSheetBehavior.f4415G)) {
                            bottomSheetBehavior.getClass();
                        }
                    } else if (Math.abs(top2 - bottomSheetBehavior.f4412D) >= Math.abs(top2 - bottomSheetBehavior.f4415G)) {
                        i2 = 4;
                    }
                } else if (!bottomSheetBehavior.f4437b) {
                    int top3 = view.getTop();
                    if (Math.abs(top3 - bottomSheetBehavior.f4413E) < Math.abs(top3 - bottomSheetBehavior.f4415G)) {
                        bottomSheetBehavior.getClass();
                    }
                }
                bottomSheetBehavior.getClass();
                bottomSheetBehavior.m2433E(view, i2, true);
                break;
            default:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f3446g;
                if (!sideSheetBehavior.f4562a.mo865G(f)) {
                    if (sideSheetBehavior.f4562a.mo868S(view, f)) {
                        i = (sideSheetBehavior.f4562a.mo867K(f, f2) || sideSheetBehavior.f4562a.mo866J(view)) ? 5 : 3;
                    } else {
                        if (f == 0.0f || Math.abs(f) <= Math.abs(f2)) {
                            int left = view.getLeft();
                            if (Math.abs(left - sideSheetBehavior.f4562a.mo872q()) < Math.abs(left - sideSheetBehavior.f4562a.mo873r())) {
                            }
                        }
                    }
                }
                sideSheetBehavior.m2470t(view, i, true);
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0048  */
    @Override // p000.AbstractC1293cr
    /* JADX INFO: renamed from: W */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean mo1390W(View view, int i) {
        WeakReference weakReference;
        switch (this.f3445f) {
            case 0:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.f3446g;
                int i2 = bottomSheetBehavior.f4422N;
                if (i2 != 1 && !bottomSheetBehavior.f4440c0) {
                    if (i2 == 3 && bottomSheetBehavior.f4436a0 == i) {
                        WeakReference weakReference2 = bottomSheetBehavior.f4432X;
                        View view2 = weakReference2 != null ? (View) weakReference2.get() : null;
                        if (view2 == null || !view2.canScrollVertically(-1)) {
                        }
                    } else {
                        SystemClock.uptimeMillis();
                        WeakReference weakReference3 = bottomSheetBehavior.f4431W;
                        if (weakReference3 != null && weakReference3.get() == view) {
                            return true;
                        }
                    }
                }
                return false;
            default:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f3446g;
                return (sideSheetBehavior.f4569h == 1 || (weakReference = sideSheetBehavior.f4577p) == null || weakReference.get() != view) ? false : true;
        }
    }

    @Override // p000.AbstractC1293cr
    /* JADX INFO: renamed from: j */
    public final int mo1391j(View view, int i) {
        switch (this.f3445f) {
            case 0:
                return view.getLeft();
            default:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f3446g;
                return AbstractC0585Nj.m1137e(i, sideSheetBehavior.f4562a.mo875t(), sideSheetBehavior.f4562a.mo874s());
        }
    }

    @Override // p000.AbstractC1293cr
    /* JADX INFO: renamed from: k */
    public final int mo1392k(View view, int i) {
        switch (this.f3445f) {
            case 0:
                return AbstractC0585Nj.m1137e(i, ((BottomSheetBehavior) this.f3446g).m2442x(), mo2017C());
            default:
                return view.getTop();
        }
    }
}
