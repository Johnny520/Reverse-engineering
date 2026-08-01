package p000;

import android.view.View;
import android.view.ViewPropertyAnimator;
import com.github.megatronking.stringfog.Base64;
import java.util.ArrayList;

/* JADX INFO: renamed from: of */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0557of implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f3531a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ArrayList f3532b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C0780uf f3533c;

    public /* synthetic */ RunnableC0557of(C0780uf c0780uf, ArrayList arrayList, int i) {
        this.f3531a = i;
        this.f3533c = c0780uf;
        this.f3532b = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f3531a) {
            case Base64.DEFAULT /* 0 */:
                ArrayList arrayList = this.f3532b;
                int size = arrayList.size();
                int i = 0;
                while (true) {
                    C0780uf c0780uf = this.f3533c;
                    if (i >= size) {
                        arrayList.clear();
                        c0780uf.f4723m.remove(arrayList);
                    } else {
                        Object obj = arrayList.get(i);
                        i++;
                        C0743tf c0743tf = (C0743tf) obj;
                        b00 b00Var = c0743tf.f4566a;
                        int i2 = c0743tf.f4567b;
                        int i3 = c0743tf.f4568c;
                        int i4 = c0743tf.f4569d;
                        int i5 = c0743tf.f4570e;
                        c0780uf.getClass();
                        View view = b00Var.f697a;
                        int i6 = i4 - i2;
                        int i7 = i5 - i3;
                        if (i6 != 0) {
                            view.animate().translationX(0.0f);
                        }
                        if (i7 != 0) {
                            view.animate().translationY(0.0f);
                        }
                        ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
                        c0780uf.f4726p.add(b00Var);
                        viewPropertyAnimatorAnimate.setDuration(c0780uf.f2681e).setListener(new C0632qf(c0780uf, b00Var, i6, view, i7, viewPropertyAnimatorAnimate)).start();
                    }
                    break;
                }
                break;
            case Base64.NO_PADDING /* 1 */:
                ArrayList arrayList2 = this.f3532b;
                int size2 = arrayList2.size();
                int i8 = 0;
                while (true) {
                    C0780uf c0780uf2 = this.f3533c;
                    if (i8 >= size2) {
                        arrayList2.clear();
                        c0780uf2.f4724n.remove(arrayList2);
                        break;
                    } else {
                        Object obj2 = arrayList2.get(i8);
                        i8++;
                        C0706sf c0706sf = (C0706sf) obj2;
                        ArrayList arrayList3 = c0780uf2.f4728r;
                        long j = c0780uf2.f2682f;
                        b00 b00Var2 = c0706sf.f4430a;
                        View view2 = b00Var2 == null ? null : b00Var2.f697a;
                        b00 b00Var3 = c0706sf.f4431b;
                        View view3 = b00Var3 != null ? b00Var3.f697a : null;
                        if (view2 != null) {
                            ViewPropertyAnimator duration = view2.animate().setDuration(j);
                            arrayList3.add(c0706sf.f4430a);
                            duration.translationX(c0706sf.f4434e - c0706sf.f4432c);
                            duration.translationY(c0706sf.f4435f - c0706sf.f4433d);
                            duration.alpha(0.0f).setListener(new C0669rf(c0780uf2, c0706sf, duration, view2, 0)).start();
                        }
                        if (view3 != null) {
                            ViewPropertyAnimator viewPropertyAnimatorAnimate2 = view3.animate();
                            arrayList3.add(c0706sf.f4431b);
                            viewPropertyAnimatorAnimate2.translationX(0.0f).translationY(0.0f).setDuration(j).alpha(1.0f).setListener(new C0669rf(c0780uf2, c0706sf, viewPropertyAnimatorAnimate2, view3, 1)).start();
                        }
                    }
                }
                break;
            default:
                ArrayList arrayList4 = this.f3532b;
                int size3 = arrayList4.size();
                int i9 = 0;
                while (true) {
                    C0780uf c0780uf3 = this.f3533c;
                    if (i9 >= size3) {
                        arrayList4.clear();
                        c0780uf3.f4722l.remove(arrayList4);
                    } else {
                        Object obj3 = arrayList4.get(i9);
                        i9++;
                        b00 b00Var4 = (b00) obj3;
                        c0780uf3.getClass();
                        View view4 = b00Var4.f697a;
                        ViewPropertyAnimator viewPropertyAnimatorAnimate3 = view4.animate();
                        c0780uf3.f4725o.add(b00Var4);
                        viewPropertyAnimatorAnimate3.alpha(1.0f).setDuration(c0780uf3.f2679c).setListener(new C0595pf(c0780uf3, b00Var4, view4, viewPropertyAnimatorAnimate3)).start();
                    }
                    break;
                }
                break;
        }
    }
}
