package p000;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import androidx.recyclerview.widget.AbstractC1159h;
import androidx.recyclerview.widget.AbstractC1166o;
import java.util.ArrayList;

/* JADX INFO: renamed from: cd */
/* JADX INFO: loaded from: classes.dex */
public final class C1261cd extends AbstractC1159h {

    /* JADX INFO: renamed from: s */
    public static TimeInterpolator f4275s;

    /* JADX INFO: renamed from: g */
    public boolean f4276g;

    /* JADX INFO: renamed from: h */
    public ArrayList f4277h;

    /* JADX INFO: renamed from: i */
    public ArrayList f4278i;

    /* JADX INFO: renamed from: j */
    public ArrayList f4279j;

    /* JADX INFO: renamed from: k */
    public ArrayList f4280k;

    /* JADX INFO: renamed from: l */
    public ArrayList f4281l;

    /* JADX INFO: renamed from: m */
    public ArrayList f4282m;

    /* JADX INFO: renamed from: n */
    public ArrayList f4283n;

    /* JADX INFO: renamed from: o */
    public ArrayList f4284o;

    /* JADX INFO: renamed from: p */
    public ArrayList f4285p;

    /* JADX INFO: renamed from: q */
    public ArrayList f4286q;

    /* JADX INFO: renamed from: r */
    public ArrayList f4287r;

    /* JADX INFO: renamed from: h */
    public static void m2392h(ArrayList arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((AbstractC1166o) arrayList.get(size)).itemView.animate().cancel();
        }
    }

    @Override // androidx.recyclerview.widget.AbstractC1159h
    /* JADX INFO: renamed from: a */
    public final boolean mo2246a(AbstractC1166o abstractC1166o, AbstractC1166o abstractC1166o2, C2208lv c2208lv, C2208lv c2208lv2) {
        int i;
        int i2;
        int i3 = c2208lv.f7695a;
        int i4 = c2208lv.f7696b;
        if (abstractC1166o2.shouldIgnore()) {
            int i5 = c2208lv.f7695a;
            i2 = c2208lv.f7696b;
            i = i5;
        } else {
            i = c2208lv2.f7695a;
            i2 = c2208lv2.f7696b;
        }
        if (abstractC1166o == abstractC1166o2) {
            return m2393g(abstractC1166o, i3, i4, i, i2);
        }
        float translationX = abstractC1166o.itemView.getTranslationX();
        float translationY = abstractC1166o.itemView.getTranslationY();
        float alpha = abstractC1166o.itemView.getAlpha();
        m2397l(abstractC1166o);
        abstractC1166o.itemView.setTranslationX(translationX);
        abstractC1166o.itemView.setTranslationY(translationY);
        abstractC1166o.itemView.setAlpha(alpha);
        m2397l(abstractC1166o2);
        abstractC1166o2.itemView.setTranslationX(-((int) ((i - i3) - translationX)));
        abstractC1166o2.itemView.setTranslationY(-((int) ((i2 - i4) - translationY)));
        abstractC1166o2.itemView.setAlpha(0.0f);
        ArrayList arrayList = this.f4280k;
        C1138ad c1138ad = new C1138ad();
        c1138ad.f3593a = abstractC1166o;
        c1138ad.f3594b = abstractC1166o2;
        c1138ad.f3595c = i3;
        c1138ad.f3596d = i4;
        c1138ad.f3597e = i;
        c1138ad.f3598f = i2;
        arrayList.add(c1138ad);
        return true;
    }

    @Override // androidx.recyclerview.widget.AbstractC1159h
    /* JADX INFO: renamed from: d */
    public final void mo2248d(AbstractC1166o abstractC1166o) {
        ArrayList arrayList = this.f4281l;
        ArrayList arrayList2 = this.f4282m;
        ArrayList arrayList3 = this.f4283n;
        View view = abstractC1166o.itemView;
        view.animate().cancel();
        ArrayList arrayList4 = this.f4279j;
        int size = arrayList4.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            if (((C1218bd) arrayList4.get(size)).f4152a == abstractC1166o) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                m2247c(abstractC1166o);
                arrayList4.remove(size);
            }
        }
        m2395j(this.f4280k, abstractC1166o);
        if (this.f4277h.remove(abstractC1166o)) {
            view.setAlpha(1.0f);
            m2247c(abstractC1166o);
        }
        if (this.f4278i.remove(abstractC1166o)) {
            view.setAlpha(1.0f);
            m2247c(abstractC1166o);
        }
        for (int size2 = arrayList3.size() - 1; size2 >= 0; size2--) {
            ArrayList arrayList5 = (ArrayList) arrayList3.get(size2);
            m2395j(arrayList5, abstractC1166o);
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
                if (((C1218bd) arrayList6.get(size4)).f4152a == abstractC1166o) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    m2247c(abstractC1166o);
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
            if (arrayList7.remove(abstractC1166o)) {
                view.setAlpha(1.0f);
                m2247c(abstractC1166o);
                if (arrayList7.isEmpty()) {
                    arrayList.remove(size5);
                }
            }
        }
        this.f4286q.remove(abstractC1166o);
        this.f4284o.remove(abstractC1166o);
        this.f4287r.remove(abstractC1166o);
        this.f4285p.remove(abstractC1166o);
        m2394i();
    }

    @Override // androidx.recyclerview.widget.AbstractC1159h
    /* JADX INFO: renamed from: e */
    public final void mo2249e() {
        ArrayList arrayList = this.f4283n;
        ArrayList arrayList2 = this.f4281l;
        ArrayList arrayList3 = this.f4282m;
        ArrayList arrayList4 = this.f4280k;
        ArrayList arrayList5 = this.f4278i;
        ArrayList arrayList6 = this.f4277h;
        ArrayList arrayList7 = this.f4279j;
        int size = arrayList7.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            C1218bd c1218bd = (C1218bd) arrayList7.get(size);
            View view = c1218bd.f4152a.itemView;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            m2247c(c1218bd.f4152a);
            arrayList7.remove(size);
        }
        for (int size2 = arrayList6.size() - 1; size2 >= 0; size2--) {
            m2247c((AbstractC1166o) arrayList6.get(size2));
            arrayList6.remove(size2);
        }
        int size3 = arrayList5.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            AbstractC1166o abstractC1166o = (AbstractC1166o) arrayList5.get(size3);
            abstractC1166o.itemView.setAlpha(1.0f);
            m2247c(abstractC1166o);
            arrayList5.remove(size3);
        }
        for (int size4 = arrayList4.size() - 1; size4 >= 0; size4--) {
            C1138ad c1138ad = (C1138ad) arrayList4.get(size4);
            AbstractC1166o abstractC1166o2 = c1138ad.f3593a;
            if (abstractC1166o2 != null) {
                m2396k(c1138ad, abstractC1166o2);
            }
            AbstractC1166o abstractC1166o3 = c1138ad.f3594b;
            if (abstractC1166o3 != null) {
                m2396k(c1138ad, abstractC1166o3);
            }
        }
        arrayList4.clear();
        if (mo2250f()) {
            for (int size5 = arrayList3.size() - 1; size5 >= 0; size5--) {
                ArrayList arrayList8 = (ArrayList) arrayList3.get(size5);
                for (int size6 = arrayList8.size() - 1; size6 >= 0; size6--) {
                    C1218bd c1218bd2 = (C1218bd) arrayList8.get(size6);
                    View view2 = c1218bd2.f4152a.itemView;
                    view2.setTranslationY(0.0f);
                    view2.setTranslationX(0.0f);
                    m2247c(c1218bd2.f4152a);
                    arrayList8.remove(size6);
                    if (arrayList8.isEmpty()) {
                        arrayList3.remove(arrayList8);
                    }
                }
            }
            for (int size7 = arrayList2.size() - 1; size7 >= 0; size7--) {
                ArrayList arrayList9 = (ArrayList) arrayList2.get(size7);
                for (int size8 = arrayList9.size() - 1; size8 >= 0; size8--) {
                    AbstractC1166o abstractC1166o4 = (AbstractC1166o) arrayList9.get(size8);
                    abstractC1166o4.itemView.setAlpha(1.0f);
                    m2247c(abstractC1166o4);
                    arrayList9.remove(size8);
                    if (arrayList9.isEmpty()) {
                        arrayList2.remove(arrayList9);
                    }
                }
            }
            for (int size9 = arrayList.size() - 1; size9 >= 0; size9--) {
                ArrayList arrayList10 = (ArrayList) arrayList.get(size9);
                for (int size10 = arrayList10.size() - 1; size10 >= 0; size10--) {
                    C1138ad c1138ad2 = (C1138ad) arrayList10.get(size10);
                    AbstractC1166o abstractC1166o5 = c1138ad2.f3593a;
                    if (abstractC1166o5 != null) {
                        m2396k(c1138ad2, abstractC1166o5);
                    }
                    AbstractC1166o abstractC1166o6 = c1138ad2.f3594b;
                    if (abstractC1166o6 != null) {
                        m2396k(c1138ad2, abstractC1166o6);
                    }
                    if (arrayList10.isEmpty()) {
                        arrayList.remove(arrayList10);
                    }
                }
            }
            m2392h(this.f4286q);
            m2392h(this.f4285p);
            m2392h(this.f4284o);
            m2392h(this.f4287r);
            ArrayList arrayList11 = this.f4034b;
            if (arrayList11.size() > 0) {
                arrayList11.get(0).getClass();
                throw new ClassCastException();
            }
            arrayList11.clear();
        }
    }

    @Override // androidx.recyclerview.widget.AbstractC1159h
    /* JADX INFO: renamed from: f */
    public final boolean mo2250f() {
        return (this.f4278i.isEmpty() && this.f4280k.isEmpty() && this.f4279j.isEmpty() && this.f4277h.isEmpty() && this.f4285p.isEmpty() && this.f4286q.isEmpty() && this.f4284o.isEmpty() && this.f4287r.isEmpty() && this.f4282m.isEmpty() && this.f4281l.isEmpty() && this.f4283n.isEmpty()) ? false : true;
    }

    /* JADX INFO: renamed from: g */
    public final boolean m2393g(AbstractC1166o abstractC1166o, int i, int i2, int i3, int i4) {
        View view = abstractC1166o.itemView;
        int translationX = i + ((int) view.getTranslationX());
        int translationY = i2 + ((int) abstractC1166o.itemView.getTranslationY());
        m2397l(abstractC1166o);
        int i5 = i3 - translationX;
        int i6 = i4 - translationY;
        if (i5 == 0 && i6 == 0) {
            m2247c(abstractC1166o);
            return false;
        }
        if (i5 != 0) {
            view.setTranslationX(-i5);
        }
        if (i6 != 0) {
            view.setTranslationY(-i6);
        }
        ArrayList arrayList = this.f4279j;
        C1218bd c1218bd = new C1218bd();
        c1218bd.f4152a = abstractC1166o;
        c1218bd.f4153b = translationX;
        c1218bd.f4154c = translationY;
        c1218bd.f4155d = i3;
        c1218bd.f4156e = i4;
        arrayList.add(c1218bd);
        return true;
    }

    /* JADX INFO: renamed from: i */
    public final void m2394i() {
        if (mo2250f()) {
            return;
        }
        ArrayList arrayList = this.f4034b;
        if (arrayList.size() <= 0) {
            arrayList.clear();
        } else {
            arrayList.get(0).getClass();
            throw new ClassCastException();
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m2395j(ArrayList arrayList, AbstractC1166o abstractC1166o) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            C1138ad c1138ad = (C1138ad) arrayList.get(size);
            if (m2396k(c1138ad, abstractC1166o) && c1138ad.f3593a == null && c1138ad.f3594b == null) {
                arrayList.remove(c1138ad);
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public final boolean m2396k(C1138ad c1138ad, AbstractC1166o abstractC1166o) {
        if (c1138ad.f3594b == abstractC1166o) {
            c1138ad.f3594b = null;
        } else {
            if (c1138ad.f3593a != abstractC1166o) {
                return false;
            }
            c1138ad.f3593a = null;
        }
        abstractC1166o.itemView.setAlpha(1.0f);
        abstractC1166o.itemView.setTranslationX(0.0f);
        abstractC1166o.itemView.setTranslationY(0.0f);
        m2247c(abstractC1166o);
        return true;
    }

    /* JADX INFO: renamed from: l */
    public final void m2397l(AbstractC1166o abstractC1166o) {
        if (f4275s == null) {
            f4275s = new ValueAnimator().getInterpolator();
        }
        abstractC1166o.itemView.animate().setInterpolator(f4275s);
        mo2248d(abstractC1166o);
    }
}
