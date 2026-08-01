package p000;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import java.util.ArrayList;

/* JADX INFO: renamed from: vf */
/* JADX INFO: loaded from: classes.dex */
public final class C0816vf extends AbstractC0651qz {

    /* JADX INFO: renamed from: s */
    public static TimeInterpolator f4941s;

    /* JADX INFO: renamed from: g */
    public boolean f4942g;

    /* JADX INFO: renamed from: h */
    public ArrayList f4943h;

    /* JADX INFO: renamed from: i */
    public ArrayList f4944i;

    /* JADX INFO: renamed from: j */
    public ArrayList f4945j;

    /* JADX INFO: renamed from: k */
    public ArrayList f4946k;

    /* JADX INFO: renamed from: l */
    public ArrayList f4947l;

    /* JADX INFO: renamed from: m */
    public ArrayList f4948m;

    /* JADX INFO: renamed from: n */
    public ArrayList f4949n;

    /* JADX INFO: renamed from: o */
    public ArrayList f4950o;

    /* JADX INFO: renamed from: p */
    public ArrayList f4951p;

    /* JADX INFO: renamed from: q */
    public ArrayList f4952q;

    /* JADX INFO: renamed from: r */
    public ArrayList f4953r;

    /* JADX INFO: renamed from: h */
    public static void m2564h(ArrayList arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((i00) arrayList.get(size)).f2296a.animate().cancel();
        }
    }

    @Override // p000.AbstractC0651qz
    /* JADX INFO: renamed from: a */
    public final boolean mo2190a(i00 i00Var, i00 i00Var2, C0759tw c0759tw, C0759tw c0759tw2) {
        int i;
        int i2;
        int i3 = c0759tw.f4593a;
        int i4 = c0759tw.f4594b;
        if (i00Var2.m1433o()) {
            int i5 = c0759tw.f4593a;
            i2 = c0759tw.f4594b;
            i = i5;
        } else {
            i = c0759tw2.f4593a;
            i2 = c0759tw2.f4594b;
        }
        if (i00Var == i00Var2) {
            return m2565g(i00Var, i3, i4, i, i2);
        }
        View view = i00Var.f2296a;
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        float alpha = view.getAlpha();
        m2569l(i00Var);
        view.setTranslationX(translationX);
        view.setTranslationY(translationY);
        view.setAlpha(alpha);
        View view2 = i00Var2.f2296a;
        m2569l(i00Var2);
        view2.setTranslationX(-((int) ((i - i3) - translationX)));
        view2.setTranslationY(-((int) ((i2 - i4) - translationY)));
        view2.setAlpha(0.0f);
        ArrayList arrayList = this.f4946k;
        C0742tf c0742tf = new C0742tf();
        c0742tf.f4504a = i00Var;
        c0742tf.f4505b = i00Var2;
        c0742tf.f4506c = i3;
        c0742tf.f4507d = i4;
        c0742tf.f4508e = i;
        c0742tf.f4509f = i2;
        arrayList.add(c0742tf);
        return true;
    }

    @Override // p000.AbstractC0651qz
    /* JADX INFO: renamed from: d */
    public final void mo2192d(i00 i00Var) {
        ArrayList arrayList = this.f4947l;
        ArrayList arrayList2 = this.f4948m;
        ArrayList arrayList3 = this.f4949n;
        View view = i00Var.f2296a;
        view.animate().cancel();
        ArrayList arrayList4 = this.f4945j;
        int size = arrayList4.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            if (((C0779uf) arrayList4.get(size)).f4821a == i00Var) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                m2191c(i00Var);
                arrayList4.remove(size);
            }
        }
        m2567j(this.f4946k, i00Var);
        if (this.f4943h.remove(i00Var)) {
            view.setAlpha(1.0f);
            m2191c(i00Var);
        }
        if (this.f4944i.remove(i00Var)) {
            view.setAlpha(1.0f);
            m2191c(i00Var);
        }
        for (int size2 = arrayList3.size() - 1; size2 >= 0; size2--) {
            ArrayList arrayList5 = (ArrayList) arrayList3.get(size2);
            m2567j(arrayList5, i00Var);
            if (arrayList5.isEmpty()) {
                arrayList3.remove(size2);
            }
        }
        for (int size3 = arrayList2.size() - 1; size3 >= 0; size3--) {
            ArrayList arrayList6 = (ArrayList) arrayList2.get(size3);
            int size4 = arrayList6.size() - 1;
            while (true) {
                if (size4 < 0) {
                    break;
                }
                if (((C0779uf) arrayList6.get(size4)).f4821a == i00Var) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    m2191c(i00Var);
                    arrayList6.remove(size4);
                    if (arrayList6.isEmpty()) {
                        arrayList2.remove(size3);
                    }
                } else {
                    size4--;
                }
            }
        }
        for (int size5 = arrayList.size() - 1; size5 >= 0; size5--) {
            ArrayList arrayList7 = (ArrayList) arrayList.get(size5);
            if (arrayList7.remove(i00Var)) {
                view.setAlpha(1.0f);
                m2191c(i00Var);
                if (arrayList7.isEmpty()) {
                    arrayList.remove(size5);
                }
            }
        }
        this.f4952q.remove(i00Var);
        this.f4950o.remove(i00Var);
        this.f4953r.remove(i00Var);
        this.f4951p.remove(i00Var);
        m2566i();
    }

    @Override // p000.AbstractC0651qz
    /* JADX INFO: renamed from: e */
    public final void mo2193e() {
        ArrayList arrayList = this.f4949n;
        ArrayList arrayList2 = this.f4947l;
        ArrayList arrayList3 = this.f4948m;
        ArrayList arrayList4 = this.f4946k;
        ArrayList arrayList5 = this.f4944i;
        ArrayList arrayList6 = this.f4943h;
        ArrayList arrayList7 = this.f4945j;
        int size = arrayList7.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            C0779uf c0779uf = (C0779uf) arrayList7.get(size);
            View view = c0779uf.f4821a.f2296a;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            m2191c(c0779uf.f4821a);
            arrayList7.remove(size);
        }
        for (int size2 = arrayList6.size() - 1; size2 >= 0; size2--) {
            m2191c((i00) arrayList6.get(size2));
            arrayList6.remove(size2);
        }
        int size3 = arrayList5.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            i00 i00Var = (i00) arrayList5.get(size3);
            i00Var.f2296a.setAlpha(1.0f);
            m2191c(i00Var);
            arrayList5.remove(size3);
        }
        for (int size4 = arrayList4.size() - 1; size4 >= 0; size4--) {
            C0742tf c0742tf = (C0742tf) arrayList4.get(size4);
            i00 i00Var2 = c0742tf.f4504a;
            if (i00Var2 != null) {
                m2568k(c0742tf, i00Var2);
            }
            i00 i00Var3 = c0742tf.f4505b;
            if (i00Var3 != null) {
                m2568k(c0742tf, i00Var3);
            }
        }
        arrayList4.clear();
        if (mo2194f()) {
            for (int size5 = arrayList3.size() - 1; size5 >= 0; size5--) {
                ArrayList arrayList8 = (ArrayList) arrayList3.get(size5);
                for (int size6 = arrayList8.size() - 1; size6 >= 0; size6--) {
                    C0779uf c0779uf2 = (C0779uf) arrayList8.get(size6);
                    View view2 = c0779uf2.f4821a.f2296a;
                    view2.setTranslationY(0.0f);
                    view2.setTranslationX(0.0f);
                    m2191c(c0779uf2.f4821a);
                    arrayList8.remove(size6);
                    if (arrayList8.isEmpty()) {
                        arrayList3.remove(arrayList8);
                    }
                }
            }
            for (int size7 = arrayList2.size() - 1; size7 >= 0; size7--) {
                ArrayList arrayList9 = (ArrayList) arrayList2.get(size7);
                for (int size8 = arrayList9.size() - 1; size8 >= 0; size8--) {
                    i00 i00Var4 = (i00) arrayList9.get(size8);
                    i00Var4.f2296a.setAlpha(1.0f);
                    m2191c(i00Var4);
                    arrayList9.remove(size8);
                    if (arrayList9.isEmpty()) {
                        arrayList2.remove(arrayList9);
                    }
                }
            }
            for (int size9 = arrayList.size() - 1; size9 >= 0; size9--) {
                ArrayList arrayList10 = (ArrayList) arrayList.get(size9);
                for (int size10 = arrayList10.size() - 1; size10 >= 0; size10--) {
                    C0742tf c0742tf2 = (C0742tf) arrayList10.get(size10);
                    i00 i00Var5 = c0742tf2.f4504a;
                    if (i00Var5 != null) {
                        m2568k(c0742tf2, i00Var5);
                    }
                    i00 i00Var6 = c0742tf2.f4505b;
                    if (i00Var6 != null) {
                        m2568k(c0742tf2, i00Var6);
                    }
                    if (arrayList10.isEmpty()) {
                        arrayList.remove(arrayList10);
                    }
                }
            }
            m2564h(this.f4952q);
            m2564h(this.f4951p);
            m2564h(this.f4950o);
            m2564h(this.f4953r);
            ArrayList arrayList11 = this.f3985b;
            if (arrayList11.size() > 0) {
                arrayList11.get(0).getClass();
                throw new ClassCastException();
            }
            arrayList11.clear();
        }
    }

    @Override // p000.AbstractC0651qz
    /* JADX INFO: renamed from: f */
    public final boolean mo2194f() {
        return (this.f4944i.isEmpty() && this.f4946k.isEmpty() && this.f4945j.isEmpty() && this.f4943h.isEmpty() && this.f4951p.isEmpty() && this.f4952q.isEmpty() && this.f4950o.isEmpty() && this.f4953r.isEmpty() && this.f4948m.isEmpty() && this.f4947l.isEmpty() && this.f4949n.isEmpty()) ? false : true;
    }

    /* JADX INFO: renamed from: g */
    public final boolean m2565g(i00 i00Var, int i, int i2, int i3, int i4) {
        View view = i00Var.f2296a;
        int translationX = i + ((int) view.getTranslationX());
        int translationY = i2 + ((int) i00Var.f2296a.getTranslationY());
        m2569l(i00Var);
        int i5 = i3 - translationX;
        int i6 = i4 - translationY;
        if (i5 == 0 && i6 == 0) {
            m2191c(i00Var);
            return false;
        }
        if (i5 != 0) {
            view.setTranslationX(-i5);
        }
        if (i6 != 0) {
            view.setTranslationY(-i6);
        }
        ArrayList arrayList = this.f4945j;
        C0779uf c0779uf = new C0779uf();
        c0779uf.f4821a = i00Var;
        c0779uf.f4822b = translationX;
        c0779uf.f4823c = translationY;
        c0779uf.f4824d = i3;
        c0779uf.f4825e = i4;
        arrayList.add(c0779uf);
        return true;
    }

    /* JADX INFO: renamed from: i */
    public final void m2566i() {
        if (mo2194f()) {
            return;
        }
        ArrayList arrayList = this.f3985b;
        if (arrayList.size() <= 0) {
            arrayList.clear();
        } else {
            arrayList.get(0).getClass();
            throw new ClassCastException();
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m2567j(ArrayList arrayList, i00 i00Var) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            C0742tf c0742tf = (C0742tf) arrayList.get(size);
            if (m2568k(c0742tf, i00Var) && c0742tf.f4504a == null && c0742tf.f4505b == null) {
                arrayList.remove(c0742tf);
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public final boolean m2568k(C0742tf c0742tf, i00 i00Var) {
        if (c0742tf.f4505b == i00Var) {
            c0742tf.f4505b = null;
        } else {
            if (c0742tf.f4504a != i00Var) {
                return false;
            }
            c0742tf.f4504a = null;
        }
        View view = i00Var.f2296a;
        View view2 = i00Var.f2296a;
        view.setAlpha(1.0f);
        view2.setTranslationX(0.0f);
        view2.setTranslationY(0.0f);
        m2191c(i00Var);
        return true;
    }

    /* JADX INFO: renamed from: l */
    public final void m2569l(i00 i00Var) {
        if (f4941s == null) {
            f4941s = new ValueAnimator().getInterpolator();
        }
        i00Var.f2296a.animate().setInterpolator(f4941s);
        mo2192d(i00Var);
    }
}
