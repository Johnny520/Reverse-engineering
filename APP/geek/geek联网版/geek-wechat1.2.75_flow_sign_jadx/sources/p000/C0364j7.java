package p000;

import android.animation.TimeInterpolator;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

/* JADX INFO: renamed from: j7 */
/* JADX INFO: loaded from: classes.dex */
public final class C0364j7 extends x70 {

    /* JADX INFO: renamed from: A */
    public int f2670A;

    /* JADX INFO: renamed from: w */
    public ArrayList f2671w;

    /* JADX INFO: renamed from: x */
    public boolean f2672x;

    /* JADX INFO: renamed from: y */
    public int f2673y;

    /* JADX INFO: renamed from: z */
    public boolean f2674z;

    @Override // p000.x70
    /* JADX INFO: renamed from: A */
    public final void mo1576A(C0426kw c0426kw) {
        super.mo1576A(c0426kw);
        this.f2670A |= 4;
        if (this.f2671w != null) {
            for (int i = 0; i < this.f2671w.size(); i++) {
                ((x70) this.f2671w.get(i)).mo1576A(c0426kw);
            }
        }
    }

    @Override // p000.x70
    /* JADX INFO: renamed from: B */
    public final void mo1577B() {
        this.f2670A |= 2;
        int size = this.f2671w.size();
        for (int i = 0; i < size; i++) {
            ((x70) this.f2671w.get(i)).mo1577B();
        }
    }

    @Override // p000.x70
    /* JADX INFO: renamed from: C */
    public final void mo1578C(long j) {
        this.f5204b = j;
    }

    @Override // p000.x70
    /* JADX INFO: renamed from: E */
    public final String mo1579E(String str) {
        String strMo1579E = super.mo1579E(str);
        for (int i = 0; i < this.f2671w.size(); i++) {
            StringBuilder sb = new StringBuilder();
            sb.append(strMo1579E);
            sb.append("\n");
            sb.append(((x70) this.f2671w.get(i)).mo1579E(str + "  "));
            strMo1579E = sb.toString();
        }
        return strMo1579E;
    }

    /* JADX INFO: renamed from: F */
    public final void m1580F(x70 x70Var) {
        this.f2671w.add(x70Var);
        x70Var.f5211i = this;
        long j = this.f5205c;
        if (j >= 0) {
            x70Var.mo1589x(j);
        }
        if ((this.f2670A & 1) != 0) {
            x70Var.mo1591z(this.f5206d);
        }
        if ((this.f2670A & 2) != 0) {
            x70Var.mo1577B();
        }
        if ((this.f2670A & 4) != 0) {
            x70Var.mo1576A(this.f5221s);
        }
        if ((this.f2670A & 8) != 0) {
            x70Var.mo1590y(null);
        }
    }

    @Override // p000.x70
    /* JADX INFO: renamed from: c */
    public final void mo1581c(d80 d80Var) {
        View view = d80Var.f1335b;
        if (m2650r(view)) {
            ArrayList arrayList = this.f2671w;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                x70 x70Var = (x70) obj;
                if (x70Var.m2650r(view)) {
                    x70Var.mo1581c(d80Var);
                    d80Var.f1336c.add(x70Var);
                }
            }
        }
    }

    @Override // p000.x70
    /* JADX INFO: renamed from: e */
    public final void mo1582e(d80 d80Var) {
        int size = this.f2671w.size();
        for (int i = 0; i < size; i++) {
            ((x70) this.f2671w.get(i)).mo1582e(d80Var);
        }
    }

    @Override // p000.x70
    /* JADX INFO: renamed from: f */
    public final void mo1583f(d80 d80Var) {
        View view = d80Var.f1335b;
        if (m2650r(view)) {
            ArrayList arrayList = this.f2671w;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                x70 x70Var = (x70) obj;
                if (x70Var.m2650r(view)) {
                    x70Var.mo1583f(d80Var);
                    d80Var.f1336c.add(x70Var);
                }
            }
        }
    }

    @Override // p000.x70
    /* JADX INFO: renamed from: i */
    public final x70 clone() {
        C0364j7 c0364j7 = (C0364j7) super.clone();
        c0364j7.f2671w = new ArrayList();
        int size = this.f2671w.size();
        for (int i = 0; i < size; i++) {
            x70 x70VarClone = ((x70) this.f2671w.get(i)).clone();
            c0364j7.f2671w.add(x70VarClone);
            x70VarClone.f5211i = c0364j7;
        }
        return c0364j7;
    }

    @Override // p000.x70
    /* JADX INFO: renamed from: k */
    public final void mo1585k(ViewGroup viewGroup, C0402k8 c0402k8, C0402k8 c0402k82, ArrayList arrayList, ArrayList arrayList2) {
        long j = this.f5204b;
        int size = this.f2671w.size();
        for (int i = 0; i < size; i++) {
            x70 x70Var = (x70) this.f2671w.get(i);
            if (j > 0 && (this.f2672x || i == 0)) {
                long j2 = x70Var.f5204b;
                if (j2 > 0) {
                    x70Var.mo1578C(j2 + j);
                } else {
                    x70Var.mo1578C(j);
                }
            }
            x70Var.mo1585k(viewGroup, c0402k8, c0402k82, arrayList, arrayList2);
        }
    }

    @Override // p000.x70
    /* JADX INFO: renamed from: t */
    public final void mo1586t(View view) {
        super.mo1586t(view);
        int size = this.f2671w.size();
        for (int i = 0; i < size; i++) {
            ((x70) this.f2671w.get(i)).mo1586t(view);
        }
    }

    @Override // p000.x70
    /* JADX INFO: renamed from: v */
    public final void mo1587v(View view) {
        super.mo1587v(view);
        int size = this.f2671w.size();
        for (int i = 0; i < size; i++) {
            ((x70) this.f2671w.get(i)).mo1587v(view);
        }
    }

    @Override // p000.x70
    /* JADX INFO: renamed from: w */
    public final void mo1588w() {
        if (this.f2671w.isEmpty()) {
            m2642D();
            m2647l();
            return;
        }
        C0598pj c0598pj = new C0598pj();
        c0598pj.f3716b = this;
        ArrayList arrayList = this.f2671w;
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            ((x70) obj).m2643a(c0598pj);
        }
        this.f2673y = this.f2671w.size();
        if (this.f2672x) {
            ArrayList arrayList2 = this.f2671w;
            int size2 = arrayList2.size();
            while (i < size2) {
                Object obj2 = arrayList2.get(i);
                i++;
                ((x70) obj2).mo1588w();
            }
            return;
        }
        for (int i3 = 1; i3 < this.f2671w.size(); i3++) {
            ((x70) this.f2671w.get(i3 - 1)).m2643a(new C0598pj(1, (x70) this.f2671w.get(i3)));
        }
        x70 x70Var = (x70) this.f2671w.get(0);
        if (x70Var != null) {
            x70Var.mo1588w();
        }
    }

    @Override // p000.x70
    /* JADX INFO: renamed from: x */
    public final void mo1589x(long j) {
        ArrayList arrayList;
        this.f5205c = j;
        if (j < 0 || (arrayList = this.f2671w) == null) {
            return;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((x70) this.f2671w.get(i)).mo1589x(j);
        }
    }

    @Override // p000.x70
    /* JADX INFO: renamed from: y */
    public final void mo1590y(AbstractC0498mu abstractC0498mu) {
        this.f2670A |= 8;
        int size = this.f2671w.size();
        for (int i = 0; i < size; i++) {
            ((x70) this.f2671w.get(i)).mo1590y(abstractC0498mu);
        }
    }

    @Override // p000.x70
    /* JADX INFO: renamed from: z */
    public final void mo1591z(TimeInterpolator timeInterpolator) {
        this.f2670A |= 1;
        ArrayList arrayList = this.f2671w;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((x70) this.f2671w.get(i)).mo1591z(timeInterpolator);
            }
        }
        this.f5206d = timeInterpolator;
    }
}
