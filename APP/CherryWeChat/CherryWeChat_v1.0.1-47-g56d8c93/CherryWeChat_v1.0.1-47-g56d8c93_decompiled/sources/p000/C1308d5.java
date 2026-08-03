package p000;

import android.animation.TimeInterpolator;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: d5 */
/* JADX INFO: loaded from: classes.dex */
public final class C1308d5 extends AbstractC0356IB {

    /* JADX INFO: renamed from: A */
    public ArrayList f4758A;

    /* JADX INFO: renamed from: B */
    public boolean f4759B;

    /* JADX INFO: renamed from: C */
    public int f4760C;

    /* JADX INFO: renamed from: D */
    public boolean f4761D;

    /* JADX INFO: renamed from: E */
    public int f4762E;

    @Override // p000.AbstractC0356IB
    /* JADX INFO: renamed from: A */
    public final void mo758A(long j) {
        ArrayList arrayList;
        this.f1198c = j;
        if (j < 0 || (arrayList = this.f4758A) == null) {
            return;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((AbstractC0356IB) this.f4758A.get(i)).mo758A(j);
        }
    }

    @Override // p000.AbstractC0356IB
    /* JADX INFO: renamed from: B */
    public final void mo759B(AbstractC0671Pj abstractC0671Pj) {
        this.f4762E |= 8;
        int size = this.f4758A.size();
        for (int i = 0; i < size; i++) {
            ((AbstractC0356IB) this.f4758A.get(i)).mo759B(abstractC0671Pj);
        }
    }

    @Override // p000.AbstractC0356IB
    /* JADX INFO: renamed from: C */
    public final void mo760C(TimeInterpolator timeInterpolator) {
        this.f4762E |= 1;
        ArrayList arrayList = this.f4758A;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((AbstractC0356IB) this.f4758A.get(i)).mo760C(timeInterpolator);
            }
        }
        this.f1199d = timeInterpolator;
    }

    @Override // p000.AbstractC0356IB
    /* JADX INFO: renamed from: D */
    public final void mo761D(C1517hw c1517hw) {
        super.mo761D(c1517hw);
        this.f4762E |= 4;
        if (this.f4758A != null) {
            for (int i = 0; i < this.f4758A.size(); i++) {
                ((AbstractC0356IB) this.f4758A.get(i)).mo761D(c1517hw);
            }
        }
    }

    @Override // p000.AbstractC0356IB
    /* JADX INFO: renamed from: E */
    public final void mo762E() {
        this.f4762E |= 2;
        int size = this.f4758A.size();
        for (int i = 0; i < size; i++) {
            ((AbstractC0356IB) this.f4758A.get(i)).mo762E();
        }
    }

    @Override // p000.AbstractC0356IB
    /* JADX INFO: renamed from: F */
    public final void mo763F(long j) {
        this.f1197b = j;
    }

    @Override // p000.AbstractC0356IB
    /* JADX INFO: renamed from: H */
    public final String mo765H(String str) {
        String strMo765H = super.mo765H(str);
        for (int i = 0; i < this.f4758A.size(); i++) {
            StringBuilder sb = new StringBuilder();
            sb.append(strMo765H);
            sb.append("\n");
            sb.append(((AbstractC0356IB) this.f4758A.get(i)).mo765H(str + "  "));
            strMo765H = sb.toString();
        }
        return strMo765H;
    }

    /* JADX INFO: renamed from: I */
    public final void m2568I(AbstractC0356IB abstractC0356IB) {
        this.f4758A.add(abstractC0356IB);
        abstractC0356IB.f1204i = this;
        long j = this.f1198c;
        if (j >= 0) {
            abstractC0356IB.mo758A(j);
        }
        if ((this.f4762E & 1) != 0) {
            abstractC0356IB.mo760C(this.f1199d);
        }
        if ((this.f4762E & 2) != 0) {
            abstractC0356IB.mo762E();
        }
        if ((this.f4762E & 4) != 0) {
            abstractC0356IB.mo761D(this.f1217v);
        }
        if ((this.f4762E & 8) != 0) {
            abstractC0356IB.mo759B(null);
        }
    }

    @Override // p000.AbstractC0356IB
    /* JADX INFO: renamed from: c */
    public final void mo767c() {
        super.mo767c();
        int size = this.f4758A.size();
        for (int i = 0; i < size; i++) {
            ((AbstractC0356IB) this.f4758A.get(i)).mo767c();
        }
    }

    @Override // p000.AbstractC0356IB
    /* JADX INFO: renamed from: d */
    public final void mo768d(C0657PB c0657pb) {
        View view = c0657pb.f2100b;
        if (m783t(view)) {
            for (AbstractC0356IB abstractC0356IB : this.f4758A) {
                if (abstractC0356IB.m783t(view)) {
                    abstractC0356IB.mo768d(c0657pb);
                    c0657pb.f2101c.add(abstractC0356IB);
                }
            }
        }
    }

    @Override // p000.AbstractC0356IB
    /* JADX INFO: renamed from: f */
    public final void mo770f(C0657PB c0657pb) {
        int size = this.f4758A.size();
        for (int i = 0; i < size; i++) {
            ((AbstractC0356IB) this.f4758A.get(i)).mo770f(c0657pb);
        }
    }

    @Override // p000.AbstractC0356IB
    /* JADX INFO: renamed from: g */
    public final void mo771g(C0657PB c0657pb) {
        View view = c0657pb.f2100b;
        if (m783t(view)) {
            for (AbstractC0356IB abstractC0356IB : this.f4758A) {
                if (abstractC0356IB.m783t(view)) {
                    abstractC0356IB.mo771g(c0657pb);
                    c0657pb.f2101c.add(abstractC0356IB);
                }
            }
        }
    }

    @Override // p000.AbstractC0356IB
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public final AbstractC0356IB clone() {
        C1308d5 c1308d5 = (C1308d5) super.clone();
        c1308d5.f4758A = new ArrayList();
        int size = this.f4758A.size();
        for (int i = 0; i < size; i++) {
            AbstractC0356IB abstractC0356IBClone = ((AbstractC0356IB) this.f4758A.get(i)).clone();
            c1308d5.f4758A.add(abstractC0356IBClone);
            abstractC0356IBClone.f1204i = c1308d5;
        }
        return c1308d5;
    }

    @Override // p000.AbstractC0356IB
    /* JADX INFO: renamed from: l */
    public final void mo776l(ViewGroup viewGroup, C2428qs c2428qs, C2428qs c2428qs2, ArrayList arrayList, ArrayList arrayList2) {
        long j = this.f1197b;
        int size = this.f4758A.size();
        for (int i = 0; i < size; i++) {
            AbstractC0356IB abstractC0356IB = (AbstractC0356IB) this.f4758A.get(i);
            if (j > 0 && (this.f4759B || i == 0)) {
                long j2 = abstractC0356IB.f1197b;
                if (j2 > 0) {
                    abstractC0356IB.mo763F(j2 + j);
                } else {
                    abstractC0356IB.mo763F(j);
                }
            }
            abstractC0356IB.mo776l(viewGroup, c2428qs, c2428qs2, arrayList, arrayList2);
        }
    }

    @Override // p000.AbstractC0356IB
    /* JADX INFO: renamed from: w */
    public final void mo785w(View view) {
        super.mo785w(view);
        int size = this.f4758A.size();
        for (int i = 0; i < size; i++) {
            ((AbstractC0356IB) this.f4758A.get(i)).mo785w(view);
        }
    }

    @Override // p000.AbstractC0356IB
    /* JADX INFO: renamed from: x */
    public final AbstractC0356IB mo786x(InterfaceC0313HB interfaceC0313HB) {
        super.mo786x(interfaceC0313HB);
        return this;
    }

    @Override // p000.AbstractC0356IB
    /* JADX INFO: renamed from: y */
    public final void mo787y(View view) {
        super.mo787y(view);
        int size = this.f4758A.size();
        for (int i = 0; i < size; i++) {
            ((AbstractC0356IB) this.f4758A.get(i)).mo787y(view);
        }
    }

    @Override // p000.AbstractC0356IB
    /* JADX INFO: renamed from: z */
    public final void mo788z() {
        if (this.f4758A.isEmpty()) {
            m764G();
            m777m();
            return;
        }
        C0571NB c0571nb = new C0571NB();
        c0571nb.f1864b = this;
        Iterator it = this.f4758A.iterator();
        while (it.hasNext()) {
            ((AbstractC0356IB) it.next()).m766a(c0571nb);
        }
        this.f4760C = this.f4758A.size();
        if (this.f4759B) {
            Iterator it2 = this.f4758A.iterator();
            while (it2.hasNext()) {
                ((AbstractC0356IB) it2.next()).mo788z();
            }
            return;
        }
        for (int i = 1; i < this.f4758A.size(); i++) {
            ((AbstractC0356IB) this.f4758A.get(i - 1)).m766a(new C0571NB((AbstractC0356IB) this.f4758A.get(i)));
        }
        AbstractC0356IB abstractC0356IB = (AbstractC0356IB) this.f4758A.get(0);
        if (abstractC0356IB != null) {
            abstractC0356IB.mo788z();
        }
    }
}
