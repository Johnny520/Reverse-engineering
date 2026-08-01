package p000;

import android.view.View;
import android.view.ViewPropertyAnimator;
import com.github.megatronking.stringfog.Base64;
import java.util.ArrayList;

/* JADX INFO: renamed from: pf */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0594pf implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f3706a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ArrayList f3707b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C0816vf f3708c;

    public /* synthetic */ RunnableC0594pf(C0816vf c0816vf, ArrayList arrayList, int i) {
        this.f3706a = i;
        this.f3708c = c0816vf;
        this.f3707b = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f3706a) {
            case Base64.DEFAULT /* 0 */:
                ArrayList arrayList = this.f3707b;
                int size = arrayList.size();
                int i = 0;
                while (true) {
                    C0816vf c0816vf = this.f3708c;
                    if (i >= size) {
                        arrayList.clear();
                        c0816vf.f4948m.remove(arrayList);
                    } else {
                        Object obj = arrayList.get(i);
                        i++;
                        C0779uf c0779uf = (C0779uf) obj;
                        i00 i00Var = c0779uf.f4821a;
                        int i2 = c0779uf.f4822b;
                        int i3 = c0779uf.f4823c;
                        int i4 = c0779uf.f4824d;
                        int i5 = c0779uf.f4825e;
                        c0816vf.getClass();
                        View view = i00Var.f2296a;
                        int i6 = i4 - i2;
                        int i7 = i5 - i3;
                        if (i6 != 0) {
                            view.animate().translationX(0.0f);
                        }
                        if (i7 != 0) {
                            view.animate().translationY(0.0f);
                        }
                        ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
                        c0816vf.f4951p.add(i00Var);
                        viewPropertyAnimatorAnimate.setDuration(c0816vf.f3988e).setListener(new C0668rf(c0816vf, i00Var, i6, view, i7, viewPropertyAnimatorAnimate)).start();
                    }
                    break;
                }
                break;
            case Base64.NO_PADDING /* 1 */:
                ArrayList arrayList2 = this.f3707b;
                int size2 = arrayList2.size();
                int i8 = 0;
                while (true) {
                    C0816vf c0816vf2 = this.f3708c;
                    if (i8 >= size2) {
                        arrayList2.clear();
                        c0816vf2.f4949n.remove(arrayList2);
                        break;
                    } else {
                        Object obj2 = arrayList2.get(i8);
                        i8++;
                        C0742tf c0742tf = (C0742tf) obj2;
                        ArrayList arrayList3 = c0816vf2.f4953r;
                        long j = c0816vf2.f3989f;
                        i00 i00Var2 = c0742tf.f4504a;
                        View view2 = i00Var2 == null ? null : i00Var2.f2296a;
                        i00 i00Var3 = c0742tf.f4505b;
                        View view3 = i00Var3 != null ? i00Var3.f2296a : null;
                        if (view2 != null) {
                            ViewPropertyAnimator duration = view2.animate().setDuration(j);
                            arrayList3.add(c0742tf.f4504a);
                            duration.translationX(c0742tf.f4508e - c0742tf.f4506c);
                            duration.translationY(c0742tf.f4509f - c0742tf.f4507d);
                            duration.alpha(0.0f).setListener(new C0705sf(c0816vf2, c0742tf, duration, view2, 0)).start();
                        }
                        if (view3 != null) {
                            ViewPropertyAnimator viewPropertyAnimatorAnimate2 = view3.animate();
                            arrayList3.add(c0742tf.f4505b);
                            viewPropertyAnimatorAnimate2.translationX(0.0f).translationY(0.0f).setDuration(j).alpha(1.0f).setListener(new C0705sf(c0816vf2, c0742tf, viewPropertyAnimatorAnimate2, view3, 1)).start();
                        }
                    }
                }
                break;
            default:
                ArrayList arrayList4 = this.f3707b;
                int size3 = arrayList4.size();
                int i9 = 0;
                while (true) {
                    C0816vf c0816vf3 = this.f3708c;
                    if (i9 >= size3) {
                        arrayList4.clear();
                        c0816vf3.f4947l.remove(arrayList4);
                    } else {
                        Object obj3 = arrayList4.get(i9);
                        i9++;
                        i00 i00Var4 = (i00) obj3;
                        c0816vf3.getClass();
                        View view4 = i00Var4.f2296a;
                        ViewPropertyAnimator viewPropertyAnimatorAnimate3 = view4.animate();
                        c0816vf3.f4950o.add(i00Var4);
                        viewPropertyAnimatorAnimate3.alpha(1.0f).setDuration(c0816vf3.f3986c).setListener(new C0631qf(c0816vf3, i00Var4, view4, viewPropertyAnimatorAnimate3)).start();
                    }
                    break;
                }
                break;
        }
    }
}
