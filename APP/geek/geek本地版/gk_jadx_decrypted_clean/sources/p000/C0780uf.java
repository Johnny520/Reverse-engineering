package p000;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import java.util.ArrayList;

/* JADX INFO: renamed from: uf */
/* JADX INFO: loaded from: classes.dex */
public final class C0780uf extends AbstractC0392jz {

    /* JADX INFO: renamed from: s */
    public static TimeInterpolator f4716s;

    /* JADX INFO: renamed from: g */
    public boolean f4717g;

    /* JADX INFO: renamed from: h */
    public ArrayList f4718h;

    /* JADX INFO: renamed from: i */
    public ArrayList f4719i;

    /* JADX INFO: renamed from: j */
    public ArrayList f4720j;

    /* JADX INFO: renamed from: k */
    public ArrayList f4721k;

    /* JADX INFO: renamed from: l */
    public ArrayList f4722l;

    /* JADX INFO: renamed from: m */
    public ArrayList f4723m;

    /* JADX INFO: renamed from: n */
    public ArrayList f4724n;

    /* JADX INFO: renamed from: o */
    public ArrayList f4725o;

    /* JADX INFO: renamed from: p */
    public ArrayList f4726p;

    /* JADX INFO: renamed from: q */
    public ArrayList f4727q;

    /* JADX INFO: renamed from: r */
    public ArrayList f4728r;

    /* JADX INFO: renamed from: h */
    public static void m2448h(ArrayList arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((b00) arrayList.get(size)).f697a.animate().cancel();
        }
    }

    @Override // p000.AbstractC0392jz
    /* JADX INFO: renamed from: a */
    public final boolean mo1611a(b00 b00Var, b00 b00Var2, C0463lw c0463lw, C0463lw c0463lw2) {
        int i;
        int i2;
        int i3 = c0463lw.f3117a;
        int i4 = c0463lw.f3118b;
        if (b00Var2.m495o()) {
            int i5 = c0463lw.f3117a;
            i2 = c0463lw.f3118b;
            i = i5;
        } else {
            i = c0463lw2.f3117a;
            i2 = c0463lw2.f3118b;
        }
        if (b00Var == b00Var2) {
            return m2449g(b00Var, i3, i4, i, i2);
        }
        View view = b00Var.f697a;
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        float alpha = view.getAlpha();
        m2453l(b00Var);
        view.setTranslationX(translationX);
        view.setTranslationY(translationY);
        view.setAlpha(alpha);
        View view2 = b00Var2.f697a;
        m2453l(b00Var2);
        view2.setTranslationX(-((int) ((i - i3) - translationX)));
        view2.setTranslationY(-((int) ((i2 - i4) - translationY)));
        view2.setAlpha(0.0f);
        ArrayList arrayList = this.f4721k;
        C0706sf c0706sf = new C0706sf();
        c0706sf.f4430a = b00Var;
        c0706sf.f4431b = b00Var2;
        c0706sf.f4432c = i3;
        c0706sf.f4433d = i4;
        c0706sf.f4434e = i;
        c0706sf.f4435f = i2;
        arrayList.add(c0706sf);
        return true;
    }

    @Override // p000.AbstractC0392jz
    /* JADX INFO: renamed from: d */
    public final void mo1613d(b00 b00Var) {
        ArrayList arrayList = this.f4722l;
        ArrayList arrayList2 = this.f4723m;
        ArrayList arrayList3 = this.f4724n;
        View view = b00Var.f697a;
        view.animate().cancel();
        ArrayList arrayList4 = this.f4720j;
        int size = arrayList4.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            if (((C0743tf) arrayList4.get(size)).f4566a == b00Var) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                m1612c(b00Var);
                arrayList4.remove(size);
            }
        }
        m2451j(this.f4721k, b00Var);
        if (this.f4718h.remove(b00Var)) {
            view.setAlpha(1.0f);
            m1612c(b00Var);
        }
        if (this.f4719i.remove(b00Var)) {
            view.setAlpha(1.0f);
            m1612c(b00Var);
        }
        for (int size2 = arrayList3.size() - 1; size2 >= 0; size2--) {
            ArrayList arrayList5 = (ArrayList) arrayList3.get(size2);
            m2451j(arrayList5, b00Var);
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
                if (((C0743tf) arrayList6.get(size4)).f4566a == b00Var) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    m1612c(b00Var);
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
            if (arrayList7.remove(b00Var)) {
                view.setAlpha(1.0f);
                m1612c(b00Var);
                if (arrayList7.isEmpty()) {
                    arrayList.remove(size5);
                }
            }
        }
        this.f4727q.remove(b00Var);
        this.f4725o.remove(b00Var);
        this.f4728r.remove(b00Var);
        this.f4726p.remove(b00Var);
        m2450i();
    }

    @Override // p000.AbstractC0392jz
    /* JADX INFO: renamed from: e */
    public final void mo1614e() {
        ArrayList arrayList = this.f4724n;
        ArrayList arrayList2 = this.f4722l;
        ArrayList arrayList3 = this.f4723m;
        ArrayList arrayList4 = this.f4721k;
        ArrayList arrayList5 = this.f4719i;
        ArrayList arrayList6 = this.f4718h;
        ArrayList arrayList7 = this.f4720j;
        int size = arrayList7.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            C0743tf c0743tf = (C0743tf) arrayList7.get(size);
            View view = c0743tf.f4566a.f697a;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            m1612c(c0743tf.f4566a);
            arrayList7.remove(size);
        }
        for (int size2 = arrayList6.size() - 1; size2 >= 0; size2--) {
            m1612c((b00) arrayList6.get(size2));
            arrayList6.remove(size2);
        }
        int size3 = arrayList5.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            b00 b00Var = (b00) arrayList5.get(size3);
            b00Var.f697a.setAlpha(1.0f);
            m1612c(b00Var);
            arrayList5.remove(size3);
        }
        for (int size4 = arrayList4.size() - 1; size4 >= 0; size4--) {
            C0706sf c0706sf = (C0706sf) arrayList4.get(size4);
            b00 b00Var2 = c0706sf.f4430a;
            if (b00Var2 != null) {
                m2452k(c0706sf, b00Var2);
            }
            b00 b00Var3 = c0706sf.f4431b;
            if (b00Var3 != null) {
                m2452k(c0706sf, b00Var3);
            }
        }
        arrayList4.clear();
        if (mo1615f()) {
            for (int size5 = arrayList3.size() - 1; size5 >= 0; size5--) {
                ArrayList arrayList8 = (ArrayList) arrayList3.get(size5);
                for (int size6 = arrayList8.size() - 1; size6 >= 0; size6--) {
                    C0743tf c0743tf2 = (C0743tf) arrayList8.get(size6);
                    View view2 = c0743tf2.f4566a.f697a;
                    view2.setTranslationY(0.0f);
                    view2.setTranslationX(0.0f);
                    m1612c(c0743tf2.f4566a);
                    arrayList8.remove(size6);
                    if (arrayList8.isEmpty()) {
                        arrayList3.remove(arrayList8);
                    }
                }
            }
            for (int size7 = arrayList2.size() - 1; size7 >= 0; size7--) {
                ArrayList arrayList9 = (ArrayList) arrayList2.get(size7);
                for (int size8 = arrayList9.size() - 1; size8 >= 0; size8--) {
                    b00 b00Var4 = (b00) arrayList9.get(size8);
                    b00Var4.f697a.setAlpha(1.0f);
                    m1612c(b00Var4);
                    arrayList9.remove(size8);
                    if (arrayList9.isEmpty()) {
                        arrayList2.remove(arrayList9);
                    }
                }
            }
            for (int size9 = arrayList.size() - 1; size9 >= 0; size9--) {
                ArrayList arrayList10 = (ArrayList) arrayList.get(size9);
                for (int size10 = arrayList10.size() - 1; size10 >= 0; size10--) {
                    C0706sf c0706sf2 = (C0706sf) arrayList10.get(size10);
                    b00 b00Var5 = c0706sf2.f4430a;
                    if (b00Var5 != null) {
                        m2452k(c0706sf2, b00Var5);
                    }
                    b00 b00Var6 = c0706sf2.f4431b;
                    if (b00Var6 != null) {
                        m2452k(c0706sf2, b00Var6);
                    }
                    if (arrayList10.isEmpty()) {
                        arrayList.remove(arrayList10);
                    }
                }
            }
            m2448h(this.f4727q);
            m2448h(this.f4726p);
            m2448h(this.f4725o);
            m2448h(this.f4728r);
            ArrayList arrayList11 = this.f2678b;
            if (arrayList11.size() > 0) {
                arrayList11.get(0).getClass();
                throw new ClassCastException();
            }
            arrayList11.clear();
        }
    }

    @Override // p000.AbstractC0392jz
    /* JADX INFO: renamed from: f */
    public final boolean mo1615f() {
        return (this.f4719i.isEmpty() && this.f4721k.isEmpty() && this.f4720j.isEmpty() && this.f4718h.isEmpty() && this.f4726p.isEmpty() && this.f4727q.isEmpty() && this.f4725o.isEmpty() && this.f4728r.isEmpty() && this.f4723m.isEmpty() && this.f4722l.isEmpty() && this.f4724n.isEmpty()) ? false : true;
    }

    /* JADX INFO: renamed from: g */
    public final boolean m2449g(b00 b00Var, int i, int i2, int i3, int i4) {
        View view = b00Var.f697a;
        int translationX = i + ((int) view.getTranslationX());
        int translationY = i2 + ((int) b00Var.f697a.getTranslationY());
        m2453l(b00Var);
        int i5 = i3 - translationX;
        int i6 = i4 - translationY;
        if (i5 == 0 && i6 == 0) {
            m1612c(b00Var);
            return false;
        }
        if (i5 != 0) {
            view.setTranslationX(-i5);
        }
        if (i6 != 0) {
            view.setTranslationY(-i6);
        }
        ArrayList arrayList = this.f4720j;
        C0743tf c0743tf = new C0743tf();
        c0743tf.f4566a = b00Var;
        c0743tf.f4567b = translationX;
        c0743tf.f4568c = translationY;
        c0743tf.f4569d = i3;
        c0743tf.f4570e = i4;
        arrayList.add(c0743tf);
        return true;
    }

    /* JADX INFO: renamed from: i */
    public final void m2450i() {
        if (mo1615f()) {
            return;
        }
        ArrayList arrayList = this.f2678b;
        if (arrayList.size() <= 0) {
            arrayList.clear();
        } else {
            arrayList.get(0).getClass();
            throw new ClassCastException();
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m2451j(ArrayList arrayList, b00 b00Var) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            C0706sf c0706sf = (C0706sf) arrayList.get(size);
            if (m2452k(c0706sf, b00Var) && c0706sf.f4430a == null && c0706sf.f4431b == null) {
                arrayList.remove(c0706sf);
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public final boolean m2452k(C0706sf c0706sf, b00 b00Var) {
        if (c0706sf.f4431b == b00Var) {
            c0706sf.f4431b = null;
        } else {
            if (c0706sf.f4430a != b00Var) {
                return false;
            }
            c0706sf.f4430a = null;
        }
        View view = b00Var.f697a;
        View view2 = b00Var.f697a;
        view.setAlpha(1.0f);
        view2.setTranslationX(0.0f);
        view2.setTranslationY(0.0f);
        m1612c(b00Var);
        return true;
    }

    /* JADX INFO: renamed from: l */
    public final void m2453l(b00 b00Var) {
        if (f4716s == null) {
            f4716s = new ValueAnimator().getInterpolator();
        }
        b00Var.f697a.animate().setInterpolator(f4716s);
        mo1613d(b00Var);
    }
}
