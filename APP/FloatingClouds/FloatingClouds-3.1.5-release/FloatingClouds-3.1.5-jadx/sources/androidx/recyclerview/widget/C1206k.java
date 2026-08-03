package androidx.recyclerview.widget;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* JADX INFO: renamed from: androidx.recyclerview.widget.k */
/* JADX INFO: loaded from: classes.dex */
public final class C1206k extends AbstractC1221z {

    /* JADX INFO: renamed from: s */
    public static TimeInterpolator f5100s;

    /* JADX INFO: renamed from: h */
    public ArrayList<RecyclerView.AbstractC1163A> f5101h;

    /* JADX INFO: renamed from: i */
    public ArrayList<RecyclerView.AbstractC1163A> f5102i;

    /* JADX INFO: renamed from: j */
    public ArrayList<b> f5103j;

    /* JADX INFO: renamed from: k */
    public ArrayList<a> f5104k;

    /* JADX INFO: renamed from: l */
    public ArrayList<ArrayList<RecyclerView.AbstractC1163A>> f5105l;

    /* JADX INFO: renamed from: m */
    public ArrayList<ArrayList<b>> f5106m;

    /* JADX INFO: renamed from: n */
    public ArrayList<ArrayList<a>> f5107n;

    /* JADX INFO: renamed from: o */
    public ArrayList<RecyclerView.AbstractC1163A> f5108o;

    /* JADX INFO: renamed from: p */
    public ArrayList<RecyclerView.AbstractC1163A> f5109p;

    /* JADX INFO: renamed from: q */
    public ArrayList<RecyclerView.AbstractC1163A> f5110q;

    /* JADX INFO: renamed from: r */
    public ArrayList<RecyclerView.AbstractC1163A> f5111r;

    /* JADX INFO: renamed from: androidx.recyclerview.widget.k$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        public RecyclerView.AbstractC1163A f5112a;

        /* JADX INFO: renamed from: b */
        public RecyclerView.AbstractC1163A f5113b;

        /* JADX INFO: renamed from: c */
        public int f5114c;

        /* JADX INFO: renamed from: d */
        public int f5115d;

        /* JADX INFO: renamed from: e */
        public int f5116e;

        /* JADX INFO: renamed from: f */
        public int f5117f;

        @SuppressLint({"UnknownNullness"})
        public final String toString() {
            return "ChangeInfo{oldHolder=" + this.f5112a + ", newHolder=" + this.f5113b + ", fromX=" + this.f5114c + ", fromY=" + this.f5115d + ", toX=" + this.f5116e + ", toY=" + this.f5117f + '}';
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.k$b */
    public static class b {

        /* JADX INFO: renamed from: a */
        public RecyclerView.AbstractC1163A f5118a;

        /* JADX INFO: renamed from: b */
        public int f5119b;

        /* JADX INFO: renamed from: c */
        public int f5120c;

        /* JADX INFO: renamed from: d */
        public int f5121d;

        /* JADX INFO: renamed from: e */
        public int f5122e;
    }

    /* JADX INFO: renamed from: h */
    public static void m2961h(ArrayList arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((RecyclerView.AbstractC1163A) arrayList.get(size)).f4891a.animate().cancel();
        }
    }

    /* JADX DEBUG: Move duplicate insns, count: 1 to block B:3:0x0011 */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1172i
    @SuppressLint({"UnknownNullness"})
    /* JADX INFO: renamed from: d */
    public final void mo2820d(RecyclerView.AbstractC1163A abstractC1163A) {
        View view = abstractC1163A.f4891a;
        view.animate().cancel();
        ArrayList<b> arrayList = this.f5103j;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            if (arrayList.get(size).f5118a == abstractC1163A) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                m2819c(abstractC1163A);
                arrayList.remove(size);
            }
        }
        m2964j(this.f5104k, abstractC1163A);
        if (this.f5101h.remove(abstractC1163A)) {
            view.setAlpha(1.0f);
            m2819c(abstractC1163A);
        }
        if (this.f5102i.remove(abstractC1163A)) {
            view.setAlpha(1.0f);
            m2819c(abstractC1163A);
        }
        ArrayList<ArrayList<a>> arrayList2 = this.f5107n;
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            ArrayList<a> arrayList3 = arrayList2.get(size2);
            m2964j(arrayList3, abstractC1163A);
            if (arrayList3.isEmpty()) {
                arrayList2.remove(size2);
            }
        }
        ArrayList<ArrayList<b>> arrayList4 = this.f5106m;
        for (int size3 = arrayList4.size() - 1; size3 >= 0; size3--) {
            ArrayList<b> arrayList5 = arrayList4.get(size3);
            int size4 = arrayList5.size() - 1;
            while (true) {
                if (size4 < 0) {
                    break;
                }
                if (arrayList5.get(size4).f5118a == abstractC1163A) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    m2819c(abstractC1163A);
                    arrayList5.remove(size4);
                    if (arrayList5.isEmpty()) {
                        arrayList4.remove(size3);
                    }
                } else {
                    size4--;
                }
            }
        }
        ArrayList<ArrayList<RecyclerView.AbstractC1163A>> arrayList6 = this.f5105l;
        for (int size5 = arrayList6.size() - 1; size5 >= 0; size5--) {
            ArrayList<RecyclerView.AbstractC1163A> arrayList7 = arrayList6.get(size5);
            if (arrayList7.remove(abstractC1163A)) {
                view.setAlpha(1.0f);
                m2819c(abstractC1163A);
                if (arrayList7.isEmpty()) {
                    arrayList6.remove(size5);
                }
            }
        }
        this.f5110q.remove(abstractC1163A);
        this.f5108o.remove(abstractC1163A);
        this.f5111r.remove(abstractC1163A);
        this.f5109p.remove(abstractC1163A);
        m2963i();
    }

    /* JADX DEBUG: Move duplicate insns, count: 1 to block B:10:0x0047 */
    /* JADX DEBUG: Move duplicate insns, count: 1 to block B:3:0x0008 */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1172i
    /* JADX INFO: renamed from: e */
    public final void mo2821e() {
        ArrayList<b> arrayList = this.f5103j;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            b bVar = arrayList.get(size);
            View view = bVar.f5118a.f4891a;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            m2819c(bVar.f5118a);
            arrayList.remove(size);
        }
        ArrayList<RecyclerView.AbstractC1163A> arrayList2 = this.f5101h;
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            m2819c(arrayList2.get(size2));
            arrayList2.remove(size2);
        }
        ArrayList<RecyclerView.AbstractC1163A> arrayList3 = this.f5102i;
        int size3 = arrayList3.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            RecyclerView.AbstractC1163A abstractC1163A = arrayList3.get(size3);
            abstractC1163A.f4891a.setAlpha(1.0f);
            m2819c(abstractC1163A);
            arrayList3.remove(size3);
        }
        ArrayList<a> arrayList4 = this.f5104k;
        for (int size4 = arrayList4.size() - 1; size4 >= 0; size4--) {
            a aVar = arrayList4.get(size4);
            RecyclerView.AbstractC1163A abstractC1163A2 = aVar.f5112a;
            if (abstractC1163A2 != null) {
                m2965k(aVar, abstractC1163A2);
            }
            RecyclerView.AbstractC1163A abstractC1163A3 = aVar.f5113b;
            if (abstractC1163A3 != null) {
                m2965k(aVar, abstractC1163A3);
            }
        }
        arrayList4.clear();
        if (mo2822f()) {
            ArrayList<ArrayList<b>> arrayList5 = this.f5106m;
            for (int size5 = arrayList5.size() - 1; size5 >= 0; size5--) {
                ArrayList<b> arrayList6 = arrayList5.get(size5);
                for (int size6 = arrayList6.size() - 1; size6 >= 0; size6--) {
                    b bVar2 = arrayList6.get(size6);
                    View view2 = bVar2.f5118a.f4891a;
                    view2.setTranslationY(0.0f);
                    view2.setTranslationX(0.0f);
                    m2819c(bVar2.f5118a);
                    arrayList6.remove(size6);
                    if (arrayList6.isEmpty()) {
                        arrayList5.remove(arrayList6);
                    }
                }
            }
            ArrayList<ArrayList<RecyclerView.AbstractC1163A>> arrayList7 = this.f5105l;
            for (int size7 = arrayList7.size() - 1; size7 >= 0; size7--) {
                ArrayList<RecyclerView.AbstractC1163A> arrayList8 = arrayList7.get(size7);
                for (int size8 = arrayList8.size() - 1; size8 >= 0; size8--) {
                    RecyclerView.AbstractC1163A abstractC1163A4 = arrayList8.get(size8);
                    abstractC1163A4.f4891a.setAlpha(1.0f);
                    m2819c(abstractC1163A4);
                    arrayList8.remove(size8);
                    if (arrayList8.isEmpty()) {
                        arrayList7.remove(arrayList8);
                    }
                }
            }
            ArrayList<ArrayList<a>> arrayList9 = this.f5107n;
            for (int size9 = arrayList9.size() - 1; size9 >= 0; size9--) {
                ArrayList<a> arrayList10 = arrayList9.get(size9);
                for (int size10 = arrayList10.size() - 1; size10 >= 0; size10--) {
                    a aVar2 = arrayList10.get(size10);
                    RecyclerView.AbstractC1163A abstractC1163A5 = aVar2.f5112a;
                    if (abstractC1163A5 != null) {
                        m2965k(aVar2, abstractC1163A5);
                    }
                    RecyclerView.AbstractC1163A abstractC1163A6 = aVar2.f5113b;
                    if (abstractC1163A6 != null) {
                        m2965k(aVar2, abstractC1163A6);
                    }
                    if (arrayList10.isEmpty()) {
                        arrayList9.remove(arrayList10);
                    }
                }
            }
            m2961h(this.f5110q);
            m2961h(this.f5109p);
            m2961h(this.f5108o);
            m2961h(this.f5111r);
            ArrayList<RecyclerView.AbstractC1172i.a> arrayList11 = this.f4918b;
            int size11 = arrayList11.size();
            for (int i = 0; i < size11; i++) {
                arrayList11.get(i).m2823a();
            }
            arrayList11.clear();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1172i
    /* JADX INFO: renamed from: f */
    public final boolean mo2822f() {
        return (this.f5102i.isEmpty() && this.f5104k.isEmpty() && this.f5103j.isEmpty() && this.f5101h.isEmpty() && this.f5109p.isEmpty() && this.f5110q.isEmpty() && this.f5108o.isEmpty() && this.f5111r.isEmpty() && this.f5106m.isEmpty() && this.f5105l.isEmpty() && this.f5107n.isEmpty()) ? false : true;
    }

    @Override // androidx.recyclerview.widget.AbstractC1221z
    @SuppressLint({"UnknownNullness"})
    /* JADX INFO: renamed from: g */
    public final boolean mo2962g(RecyclerView.AbstractC1163A abstractC1163A, int i, int i2, int i3, int i4) {
        View view = abstractC1163A.f4891a;
        int translationX = i + ((int) view.getTranslationX());
        int translationY = i2 + ((int) abstractC1163A.f4891a.getTranslationY());
        m2966l(abstractC1163A);
        int i5 = i3 - translationX;
        int i6 = i4 - translationY;
        if (i5 == 0 && i6 == 0) {
            m2819c(abstractC1163A);
            return false;
        }
        if (i5 != 0) {
            view.setTranslationX(-i5);
        }
        if (i6 != 0) {
            view.setTranslationY(-i6);
        }
        ArrayList<b> arrayList = this.f5103j;
        b bVar = new b();
        bVar.f5118a = abstractC1163A;
        bVar.f5119b = translationX;
        bVar.f5120c = translationY;
        bVar.f5121d = i3;
        bVar.f5122e = i4;
        arrayList.add(bVar);
        return true;
    }

    /* JADX INFO: renamed from: i */
    public final void m2963i() {
        if (mo2822f()) {
            return;
        }
        ArrayList<RecyclerView.AbstractC1172i.a> arrayList = this.f4918b;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            arrayList.get(i).m2823a();
        }
        arrayList.clear();
    }

    /* JADX INFO: renamed from: j */
    public final void m2964j(ArrayList arrayList, RecyclerView.AbstractC1163A abstractC1163A) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            a aVar = (a) arrayList.get(size);
            if (m2965k(aVar, abstractC1163A) && aVar.f5112a == null && aVar.f5113b == null) {
                arrayList.remove(aVar);
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public final boolean m2965k(a aVar, RecyclerView.AbstractC1163A abstractC1163A) {
        if (aVar.f5113b == abstractC1163A) {
            aVar.f5113b = null;
        } else {
            if (aVar.f5112a != abstractC1163A) {
                return false;
            }
            aVar.f5112a = null;
        }
        abstractC1163A.f4891a.setAlpha(1.0f);
        View view = abstractC1163A.f4891a;
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
        m2819c(abstractC1163A);
        return true;
    }

    /* JADX INFO: renamed from: l */
    public final void m2966l(RecyclerView.AbstractC1163A abstractC1163A) {
        if (f5100s == null) {
            f5100s = new ValueAnimator().getInterpolator();
        }
        abstractC1163A.f4891a.animate().setInterpolator(f5100s);
        mo2820d(abstractC1163A);
    }
}
