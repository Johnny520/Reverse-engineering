package androidx.recyclerview.widget;

import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
import p303.AbstractC9234;
import top.suzhelan.qstory.p015ui.views.DialogXRecycleView;

/* JADX INFO: renamed from: androidx.recyclerview.widget.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC3344 implements Runnable {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ Object f7896;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ Object f7897;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f7898;

    public RunnableC3344(C3306 c3306, C3299 c3299, int i) {
        this.f7898 = 3;
        this.f7897 = c3306;
        this.f7896 = c3299;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f7898;
        Object obj = this.f7897;
        Object obj2 = this.f7896;
        switch (i) {
            case 0:
                C3338 c3338 = (C3338) obj;
                ArrayList<C3346> arrayList = (ArrayList) obj2;
                for (C3346 c3346 : arrayList) {
                    AbstractC3317 abstractC3317 = c3346.f7909;
                    int i2 = c3346.f7908;
                    int i3 = c3346.f7907;
                    int i4 = c3346.f7906;
                    int i5 = c3346.f7905;
                    c3338.getClass();
                    View view = abstractC3317.itemView;
                    int i6 = i4 - i2;
                    int i7 = i5 - i3;
                    if (i6 != 0) {
                        view.animate().translationX(0.0f);
                    }
                    if (i7 != 0) {
                        view.animate().translationY(0.0f);
                    }
                    ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
                    c3338.f7849.add(abstractC3317);
                    viewPropertyAnimatorAnimate.setDuration(c3338.f7984).setListener(new C3347(c3338, abstractC3317, i6, view, i7, viewPropertyAnimatorAnimate)).start();
                }
                arrayList.clear();
                c3338.f7845.remove(arrayList);
                break;
            case 1:
                C3338 c33382 = (C3338) obj;
                ArrayList<C3345> arrayList2 = (ArrayList) obj2;
                for (C3345 c3345 : arrayList2) {
                    ArrayList arrayList3 = c33382.f7847;
                    long j = c33382.f7983;
                    AbstractC3317 abstractC33172 = c3345.f7904;
                    View view2 = abstractC33172 == null ? null : abstractC33172.itemView;
                    AbstractC3317 abstractC33173 = c3345.f7903;
                    View view3 = abstractC33173 != null ? abstractC33173.itemView : null;
                    if (view2 != null) {
                        ViewPropertyAnimator duration = view2.animate().setDuration(j);
                        arrayList3.add(c3345.f7904);
                        duration.translationX(c3345.f7900 - c3345.f7902);
                        duration.translationY(c3345.f7899 - c3345.f7901);
                        duration.alpha(0.0f).setListener(new C3348(c33382, c3345, duration, view2, 0)).start();
                    }
                    if (view3 != null) {
                        ViewPropertyAnimator viewPropertyAnimatorAnimate2 = view3.animate();
                        arrayList3.add(c3345.f7903);
                        viewPropertyAnimatorAnimate2.translationX(0.0f).translationY(0.0f).setDuration(j).alpha(1.0f).setListener(new C3348(c33382, c3345, viewPropertyAnimatorAnimate2, view3, 1)).start();
                    }
                }
                arrayList2.clear();
                c33382.f7844.remove(arrayList2);
                break;
            case 2:
                C3338 c33383 = (C3338) obj;
                ArrayList<AbstractC3317> arrayList4 = (ArrayList) obj2;
                for (AbstractC3317 abstractC33174 : arrayList4) {
                    c33383.getClass();
                    View view4 = abstractC33174.itemView;
                    ViewPropertyAnimator viewPropertyAnimatorAnimate3 = view4.animate();
                    c33383.f7848.add(abstractC33174);
                    viewPropertyAnimatorAnimate3.alpha(1.0f).setDuration(c33383.f7986).setListener(new C3343(c33383, abstractC33174, view4, viewPropertyAnimatorAnimate3)).start();
                }
                arrayList4.clear();
                c33383.f7853.remove(arrayList4);
                break;
            default:
                C3299 c3299 = (C3299) obj2;
                AbstractC3317 abstractC33175 = c3299.f7687;
                C3306 c3306 = (C3306) obj;
                DialogXRecycleView dialogXRecycleView = c3306.f7752;
                if (dialogXRecycleView != null && dialogXRecycleView.f7545 && !c3299.f7698 && abstractC33175.getAbsoluteAdapterPosition() != -1) {
                    AbstractC3369 itemAnimator = c3306.f7752.getItemAnimator();
                    if (itemAnimator == null || !itemAnimator.mo5527()) {
                        ArrayList arrayList5 = c3306.f7754;
                        int size = arrayList5.size();
                        for (int i8 = 0; i8 < size; i8++) {
                            if (((C3299) arrayList5.get(i8)).f7699) {
                            }
                        }
                        c3306.f7750.getClass();
                        AbstractC9234.m14531(2288);
                        abstractC33175.getClass();
                    }
                    c3306.f7752.post(this);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ RunnableC3344(C3338 c3338, ArrayList arrayList, int i) {
        this.f7898 = i;
        this.f7897 = c3338;
        this.f7896 = arrayList;
    }
}
