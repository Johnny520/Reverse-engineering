package p000;

import android.animation.TimeInterpolator;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

/* JADX INFO: renamed from: z6 */
/* JADX INFO: loaded from: classes.dex */
public final class C0956z6 extends r70 {

    /* JADX INFO: renamed from: A */
    public int f5460A;

    /* JADX INFO: renamed from: w */
    public ArrayList f5461w;

    /* JADX INFO: renamed from: x */
    public boolean f5462x;

    /* JADX INFO: renamed from: y */
    public int f5463y;

    /* JADX INFO: renamed from: z */
    public boolean f5464z;

    @Override // p000.r70
    /* JADX INFO: renamed from: A */
    public final void mo2256A(C0354iy c0354iy) {
        super.mo2256A(c0354iy);
        this.f5460A |= 4;
        if (this.f5461w != null) {
            for (int i = 0; i < this.f5461w.size(); i++) {
                ((r70) this.f5461w.get(i)).mo2256A(c0354iy);
            }
        }
    }

    @Override // p000.r70
    /* JADX INFO: renamed from: B */
    public final void mo2257B() {
        this.f5460A |= 2;
        int size = this.f5461w.size();
        for (int i = 0; i < size; i++) {
            ((r70) this.f5461w.get(i)).mo2257B();
        }
    }

    @Override // p000.r70
    /* JADX INFO: renamed from: C */
    public final void mo2258C(long j) {
        this.f4226b = j;
    }

    @Override // p000.r70
    /* JADX INFO: renamed from: E */
    public final String mo2260E(String str) {
        String strMo2260E = super.mo2260E(str);
        for (int i = 0; i < this.f5461w.size(); i++) {
            StringBuilder sb = new StringBuilder();
            sb.append(strMo2260E);
            sb.append("\n");
            sb.append(((r70) this.f5461w.get(i)).mo2260E(str + "  "));
            strMo2260E = sb.toString();
        }
        return strMo2260E;
    }

    /* JADX INFO: renamed from: F */
    public final void m2781F(r70 r70Var) {
        this.f5461w.add(r70Var);
        r70Var.f4233i = this;
        long j = this.f4227c;
        if (j >= 0) {
            r70Var.mo2276x(j);
        }
        if ((this.f5460A & 1) != 0) {
            r70Var.mo2278z(this.f4228d);
        }
        if ((this.f5460A & 2) != 0) {
            r70Var.mo2257B();
        }
        if ((this.f5460A & 4) != 0) {
            r70Var.mo2256A(this.f4243s);
        }
        if ((this.f5460A & 8) != 0) {
            r70Var.mo2277y(null);
        }
    }

    @Override // p000.r70
    /* JADX INFO: renamed from: c */
    public final void mo544c(x70 x70Var) {
        View view = x70Var.f5122b;
        if (m2271r(view)) {
            ArrayList arrayList = this.f5461w;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                r70 r70Var = (r70) obj;
                if (r70Var.m2271r(view)) {
                    r70Var.mo544c(x70Var);
                    x70Var.f5123c.add(r70Var);
                }
            }
        }
    }

    @Override // p000.r70
    /* JADX INFO: renamed from: e */
    public final void mo2263e(x70 x70Var) {
        int size = this.f5461w.size();
        for (int i = 0; i < size; i++) {
            ((r70) this.f5461w.get(i)).mo2263e(x70Var);
        }
    }

    @Override // p000.r70
    /* JADX INFO: renamed from: f */
    public final void mo545f(x70 x70Var) {
        View view = x70Var.f5122b;
        if (m2271r(view)) {
            ArrayList arrayList = this.f5461w;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                r70 r70Var = (r70) obj;
                if (r70Var.m2271r(view)) {
                    r70Var.mo545f(x70Var);
                    x70Var.f5123c.add(r70Var);
                }
            }
        }
    }

    @Override // p000.r70
    /* JADX INFO: renamed from: i */
    public final r70 clone() {
        C0956z6 c0956z6 = (C0956z6) super.clone();
        c0956z6.f5461w = new ArrayList();
        int size = this.f5461w.size();
        for (int i = 0; i < size; i++) {
            r70 r70VarClone = ((r70) this.f5461w.get(i)).clone();
            c0956z6.f5461w.add(r70VarClone);
            r70VarClone.f4233i = c0956z6;
        }
        return c0956z6;
    }

    @Override // p000.r70
    /* JADX INFO: renamed from: k */
    public final void mo2267k(ViewGroup viewGroup, C0009a8 c0009a8, C0009a8 c0009a82, ArrayList arrayList, ArrayList arrayList2) {
        long j = this.f4226b;
        int size = this.f5461w.size();
        for (int i = 0; i < size; i++) {
            r70 r70Var = (r70) this.f5461w.get(i);
            if (j > 0 && (this.f5462x || i == 0)) {
                long j2 = r70Var.f4226b;
                if (j2 > 0) {
                    r70Var.mo2258C(j2 + j);
                } else {
                    r70Var.mo2258C(j);
                }
            }
            r70Var.mo2267k(viewGroup, c0009a8, c0009a82, arrayList, arrayList2);
        }
    }

    @Override // p000.r70
    /* JADX INFO: renamed from: t */
    public final void mo2272t(View view) {
        super.mo2272t(view);
        int size = this.f5461w.size();
        for (int i = 0; i < size; i++) {
            ((r70) this.f5461w.get(i)).mo2272t(view);
        }
    }

    @Override // p000.r70
    /* JADX INFO: renamed from: v */
    public final void mo2274v(View view) {
        super.mo2274v(view);
        int size = this.f5461w.size();
        for (int i = 0; i < size; i++) {
            ((r70) this.f5461w.get(i)).mo2274v(view);
        }
    }

    @Override // p000.r70
    /* JADX INFO: renamed from: w */
    public final void mo2275w() {
        if (this.f5461w.isEmpty()) {
            m2259D();
            m2268l();
            return;
        }
        C0524nj c0524nj = new C0524nj();
        c0524nj.f3419b = this;
        ArrayList arrayList = this.f5461w;
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            ((r70) obj).m2261a(c0524nj);
        }
        this.f5463y = this.f5461w.size();
        if (this.f5462x) {
            ArrayList arrayList2 = this.f5461w;
            int size2 = arrayList2.size();
            while (i < size2) {
                Object obj2 = arrayList2.get(i);
                i++;
                ((r70) obj2).mo2275w();
            }
            return;
        }
        for (int i3 = 1; i3 < this.f5461w.size(); i3++) {
            ((r70) this.f5461w.get(i3 - 1)).m2261a(new C0524nj(1, (r70) this.f5461w.get(i3)));
        }
        r70 r70Var = (r70) this.f5461w.get(0);
        if (r70Var != null) {
            r70Var.mo2275w();
        }
    }

    @Override // p000.r70
    /* JADX INFO: renamed from: x */
    public final void mo2276x(long j) {
        ArrayList arrayList;
        this.f4227c = j;
        if (j < 0 || (arrayList = this.f5461w) == null) {
            return;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((r70) this.f5461w.get(i)).mo2276x(j);
        }
    }

    @Override // p000.r70
    /* JADX INFO: renamed from: y */
    public final void mo2277y(AbstractC0273gt abstractC0273gt) {
        this.f5460A |= 8;
        int size = this.f5461w.size();
        for (int i = 0; i < size; i++) {
            ((r70) this.f5461w.get(i)).mo2277y(abstractC0273gt);
        }
    }

    @Override // p000.r70
    /* JADX INFO: renamed from: z */
    public final void mo2278z(TimeInterpolator timeInterpolator) {
        this.f5460A |= 1;
        ArrayList arrayList = this.f5461w;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((r70) this.f5461w.get(i)).mo2278z(timeInterpolator);
            }
        }
        this.f4228d = timeInterpolator;
    }
}
