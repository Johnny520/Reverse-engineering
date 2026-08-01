package androidx.recyclerview.widget;

import android.view.View;
import android.view.ViewPropertyAnimator;
import com.bumptech.glide.AbstractC3056;
import java.util.ArrayList;
import top.suzhelan.qstory.ui.views.DialogXRecycleView;

/* JADX INFO: renamed from: androidx.recyclerview.widget.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC2511 implements Runnable {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ Object f7550;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ Object f7551;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f7552;

    public RunnableC2511(C2473 c2473, C2466 c2466, int i) {
        this.f7552 = 3;
        this.f7551 = c2473;
        this.f7550 = c2466;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f7552;
        Object obj = this.f7551;
        Object obj2 = this.f7550;
        switch (i) {
            case 0:
                C2505 c2505 = (C2505) obj;
                ArrayList<C2513> arrayList = (ArrayList) obj2;
                for (C2513 c2513 : arrayList) {
                    AbstractC2484 abstractC2484 = c2513.f7563;
                    int i2 = c2513.f7562;
                    int i3 = c2513.f7561;
                    int i4 = c2513.f7560;
                    int i5 = c2513.f7559;
                    c2505.getClass();
                    View view = abstractC2484.itemView;
                    int i6 = i4 - i2;
                    int i7 = i5 - i3;
                    if (i6 != 0) {
                        view.animate().translationX(0.0f);
                    }
                    if (i7 != 0) {
                        view.animate().translationY(0.0f);
                    }
                    ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
                    c2505.f7503.add(abstractC2484);
                    viewPropertyAnimatorAnimate.setDuration(c2505.f7638).setListener(new C2514(c2505, abstractC2484, i6, view, i7, viewPropertyAnimatorAnimate)).start();
                }
                arrayList.clear();
                c2505.f7499.remove(arrayList);
                break;
            case 1:
                C2505 c25052 = (C2505) obj;
                ArrayList<C2512> arrayList2 = (ArrayList) obj2;
                for (C2512 c2512 : arrayList2) {
                    ArrayList arrayList3 = c25052.f7501;
                    long j = c25052.f7637;
                    AbstractC2484 abstractC24842 = c2512.f7558;
                    View view2 = abstractC24842 == null ? null : abstractC24842.itemView;
                    AbstractC2484 abstractC24843 = c2512.f7557;
                    View view3 = abstractC24843 != null ? abstractC24843.itemView : null;
                    if (view2 != null) {
                        ViewPropertyAnimator duration = view2.animate().setDuration(j);
                        arrayList3.add(c2512.f7558);
                        duration.translationX(c2512.f7554 - c2512.f7556);
                        duration.translationY(c2512.f7553 - c2512.f7555);
                        duration.alpha(0.0f).setListener(new C2515(c25052, c2512, duration, view2, 0)).start();
                    }
                    if (view3 != null) {
                        ViewPropertyAnimator viewPropertyAnimatorAnimate2 = view3.animate();
                        arrayList3.add(c2512.f7557);
                        viewPropertyAnimatorAnimate2.translationX(0.0f).translationY(0.0f).setDuration(j).alpha(1.0f).setListener(new C2515(c25052, c2512, viewPropertyAnimatorAnimate2, view3, 1)).start();
                    }
                }
                arrayList2.clear();
                c25052.f7498.remove(arrayList2);
                break;
            case 2:
                C2505 c25053 = (C2505) obj;
                ArrayList<AbstractC2484> arrayList4 = (ArrayList) obj2;
                for (AbstractC2484 abstractC24844 : arrayList4) {
                    c25053.getClass();
                    View view4 = abstractC24844.itemView;
                    ViewPropertyAnimator viewPropertyAnimatorAnimate3 = view4.animate();
                    c25053.f7502.add(abstractC24844);
                    viewPropertyAnimatorAnimate3.alpha(1.0f).setDuration(c25053.f7640).setListener(new C2510(c25053, abstractC24844, view4, viewPropertyAnimatorAnimate3)).start();
                }
                arrayList4.clear();
                c25053.f7507.remove(arrayList4);
                break;
            default:
                C2466 c2466 = (C2466) obj2;
                AbstractC2484 abstractC24845 = c2466.f7341;
                C2473 c2473 = (C2473) obj;
                DialogXRecycleView dialogXRecycleView = c2473.f7406;
                if (dialogXRecycleView != null && dialogXRecycleView.f7199 && !c2466.f7352 && abstractC24845.getAbsoluteAdapterPosition() != -1) {
                    AbstractC2536 itemAnimator = c2473.f7406.getItemAnimator();
                    if (itemAnimator == null || !itemAnimator.mo4957()) {
                        ArrayList arrayList5 = c2473.f7408;
                        int size = arrayList5.size();
                        for (int i8 = 0; i8 < size; i8++) {
                            if (((C2466) arrayList5.get(i8)).f7353) {
                            }
                        }
                        c2473.f7404.getClass();
                        AbstractC3056.m6668(-3937792043313792423L);
                        abstractC24845.getClass();
                    }
                    c2473.f7406.post(this);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ RunnableC2511(C2505 c2505, ArrayList arrayList, int i) {
        this.f7552 = i;
        this.f7551 = c2505;
        this.f7550 = arrayList;
    }
}
