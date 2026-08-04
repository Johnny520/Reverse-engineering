package yyds;

import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: yyds.ᛶᛵᲈᛱ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC1346 implements Runnable {

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final /* synthetic */ C2446 f6233;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final /* synthetic */ int f6234;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final /* synthetic */ ArrayList f6235;

    public /* synthetic */ RunnableC1346(C2446 c2446, ArrayList arrayList, int i) {
        this.f6234 = i;
        this.f6233 = c2446;
        this.f6235 = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f6234;
        ArrayList arrayList = this.f6235;
        switch (i) {
            case 0:
                Iterator it = arrayList.iterator();
                while (true) {
                    boolean zHasNext = it.hasNext();
                    C2446 c2446 = this.f6233;
                    if (!zHasNext) {
                        arrayList.clear();
                        c2446.f12045.remove(arrayList);
                    } else {
                        C0307 c0307 = (C0307) it.next();
                        AbstractC0185 abstractC0185 = c0307.f1611;
                        int i2 = c0307.f1612;
                        int i3 = c0307.f1613;
                        int i4 = c0307.f1614;
                        int i5 = c0307.f1610;
                        c2446.getClass();
                        View view = abstractC0185.f1093;
                        int i6 = i4 - i2;
                        int i7 = i5 - i3;
                        if (i6 != 0) {
                            view.animate().translationX(0.0f);
                        }
                        if (i7 != 0) {
                            view.animate().translationY(0.0f);
                        }
                        ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
                        c2446.f12054.add(abstractC0185);
                        viewPropertyAnimatorAnimate.setDuration(c2446.f11851).setListener(new C0310(c2446, abstractC0185, i6, view, i7, viewPropertyAnimatorAnimate)).start();
                    }
                    break;
                }
                break;
            case 1:
                Iterator it2 = arrayList.iterator();
                while (true) {
                    boolean zHasNext2 = it2.hasNext();
                    C2446 c24462 = this.f6233;
                    if (!zHasNext2) {
                        arrayList.clear();
                        c24462.f12043.remove(arrayList);
                        break;
                    } else {
                        C0641 c0641 = (C0641) it2.next();
                        ArrayList arrayList2 = c24462.f12048;
                        long j = c24462.f11855;
                        AbstractC0185 abstractC01852 = c0641.f3078;
                        View view2 = abstractC01852 == null ? null : abstractC01852.f1093;
                        AbstractC0185 abstractC01853 = c0641.f3079;
                        View view3 = abstractC01853 != null ? abstractC01853.f1093 : null;
                        if (view2 != null) {
                            ViewPropertyAnimator duration = view2.animate().setDuration(j);
                            arrayList2.add(c0641.f3078);
                            duration.translationX(c0641.f3077 - c0641.f3080);
                            duration.translationY(c0641.f3081 - c0641.f3082);
                            duration.alpha(0.0f).setListener(new C0490(c24462, c0641, duration, view2, 0)).start();
                        }
                        if (view3 != null) {
                            ViewPropertyAnimator viewPropertyAnimatorAnimate2 = view3.animate();
                            arrayList2.add(c0641.f3079);
                            viewPropertyAnimatorAnimate2.translationX(0.0f).translationY(0.0f).setDuration(j).alpha(1.0f).setListener(new C0490(c24462, c0641, viewPropertyAnimatorAnimate2, view3, 1)).start();
                        }
                    }
                }
                break;
            default:
                Iterator it3 = arrayList.iterator();
                while (true) {
                    boolean zHasNext3 = it3.hasNext();
                    C2446 c24463 = this.f6233;
                    if (!zHasNext3) {
                        arrayList.clear();
                        c24463.f12052.remove(arrayList);
                    } else {
                        AbstractC0185 abstractC01854 = (AbstractC0185) it3.next();
                        c24463.getClass();
                        View view4 = abstractC01854.f1093;
                        ViewPropertyAnimator viewPropertyAnimatorAnimate3 = view4.animate();
                        c24463.f12047.add(abstractC01854);
                        viewPropertyAnimatorAnimate3.alpha(1.0f).setDuration(c24463.f11854).setListener(new C0915(c24463, abstractC01854, view4, viewPropertyAnimatorAnimate3)).start();
                    }
                    break;
                }
                break;
        }
    }
}
