package p043Y;

import android.animation.TimeInterpolator;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;
import p037U.AbstractC0358S;
import p089x0.C1121e;

/* JADX INFO: renamed from: Y.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0442a extends AbstractC0454m {

    /* JADX INFO: renamed from: A */
    public ArrayList f969A;

    /* JADX INFO: renamed from: B */
    public boolean f970B;

    /* JADX INFO: renamed from: C */
    public int f971C;

    /* JADX INFO: renamed from: D */
    public boolean f972D;

    /* JADX INFO: renamed from: E */
    public int f973E;

    @Override // p043Y.AbstractC0454m
    /* JADX INFO: renamed from: A */
    public final void mo1047A(long j2) {
        ArrayList arrayList;
        this.f1011c = j2;
        if (j2 < 0 || (arrayList = this.f969A) == null) {
            return;
        }
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((AbstractC0454m) this.f969A.get(i2)).mo1047A(j2);
        }
    }

    @Override // p043Y.AbstractC0454m
    /* JADX INFO: renamed from: B */
    public final void mo1048B(AbstractC0358S abstractC0358S) {
        this.f973E |= 8;
        int size = this.f969A.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((AbstractC0454m) this.f969A.get(i2)).mo1048B(abstractC0358S);
        }
    }

    @Override // p043Y.AbstractC0454m
    /* JADX INFO: renamed from: C */
    public final void mo1049C(TimeInterpolator timeInterpolator) {
        this.f973E |= 1;
        ArrayList arrayList = this.f969A;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                ((AbstractC0454m) this.f969A.get(i2)).mo1049C(timeInterpolator);
            }
        }
        this.f1012d = timeInterpolator;
    }

    @Override // p043Y.AbstractC0454m
    /* JADX INFO: renamed from: D */
    public final void mo1050D(C1121e c1121e) {
        super.mo1050D(c1121e);
        this.f973E |= 4;
        if (this.f969A != null) {
            for (int i2 = 0; i2 < this.f969A.size(); i2++) {
                ((AbstractC0454m) this.f969A.get(i2)).mo1050D(c1121e);
            }
        }
    }

    @Override // p043Y.AbstractC0454m
    /* JADX INFO: renamed from: E */
    public final void mo1051E() {
        this.f973E |= 2;
        int size = this.f969A.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((AbstractC0454m) this.f969A.get(i2)).mo1051E();
        }
    }

    @Override // p043Y.AbstractC0454m
    /* JADX INFO: renamed from: F */
    public final void mo1052F(long j2) {
        this.f1010b = j2;
    }

    @Override // p043Y.AbstractC0454m
    /* JADX INFO: renamed from: H */
    public final String mo1053H(String str) {
        String strMo1053H = super.mo1053H(str);
        for (int i2 = 0; i2 < this.f969A.size(); i2++) {
            StringBuilder sb = new StringBuilder();
            sb.append(strMo1053H);
            sb.append("\n");
            sb.append(((AbstractC0454m) this.f969A.get(i2)).mo1053H(str + "  "));
            strMo1053H = sb.toString();
        }
        return strMo1053H;
    }

    /* JADX INFO: renamed from: I */
    public final void m1054I(AbstractC0454m abstractC0454m) {
        this.f969A.add(abstractC0454m);
        abstractC0454m.f1017i = this;
        long j2 = this.f1011c;
        if (j2 >= 0) {
            abstractC0454m.mo1047A(j2);
        }
        if ((this.f973E & 1) != 0) {
            abstractC0454m.mo1049C(this.f1012d);
        }
        if ((this.f973E & 2) != 0) {
            abstractC0454m.mo1051E();
        }
        if ((this.f973E & 4) != 0) {
            abstractC0454m.mo1050D(this.f1030v);
        }
        if ((this.f973E & 8) != 0) {
            abstractC0454m.mo1048B(null);
        }
    }

    @Override // p043Y.AbstractC0454m
    /* JADX INFO: renamed from: c */
    public final void mo1055c() {
        super.mo1055c();
        int size = this.f969A.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((AbstractC0454m) this.f969A.get(i2)).mo1055c();
        }
    }

    @Override // p043Y.AbstractC0454m
    /* JADX INFO: renamed from: d */
    public final void mo1056d(C0462u c0462u) {
        if (m1087t(c0462u.f1042b)) {
            for (AbstractC0454m abstractC0454m : this.f969A) {
                if (abstractC0454m.m1087t(c0462u.f1042b)) {
                    abstractC0454m.mo1056d(c0462u);
                    c0462u.f1043c.add(abstractC0454m);
                }
            }
        }
    }

    @Override // p043Y.AbstractC0454m
    /* JADX INFO: renamed from: f */
    public final void mo1057f(C0462u c0462u) {
        int size = this.f969A.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((AbstractC0454m) this.f969A.get(i2)).mo1057f(c0462u);
        }
    }

    @Override // p043Y.AbstractC0454m
    /* JADX INFO: renamed from: g */
    public final void mo1058g(C0462u c0462u) {
        if (m1087t(c0462u.f1042b)) {
            for (AbstractC0454m abstractC0454m : this.f969A) {
                if (abstractC0454m.m1087t(c0462u.f1042b)) {
                    abstractC0454m.mo1058g(c0462u);
                    c0462u.f1043c.add(abstractC0454m);
                }
            }
        }
    }

    @Override // p043Y.AbstractC0454m
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public final AbstractC0454m clone() {
        C0442a c0442a = (C0442a) super.clone();
        c0442a.f969A = new ArrayList();
        int size = this.f969A.size();
        for (int i2 = 0; i2 < size; i2++) {
            AbstractC0454m abstractC0454mClone = ((AbstractC0454m) this.f969A.get(i2)).clone();
            c0442a.f969A.add(abstractC0454mClone);
            abstractC0454mClone.f1017i = c0442a;
        }
        return c0442a;
    }

    @Override // p043Y.AbstractC0454m
    /* JADX INFO: renamed from: l */
    public final void mo1060l(ViewGroup viewGroup, C0463v c0463v, C0463v c0463v2, ArrayList arrayList, ArrayList arrayList2) {
        long j2 = this.f1010b;
        int size = this.f969A.size();
        for (int i2 = 0; i2 < size; i2++) {
            AbstractC0454m abstractC0454m = (AbstractC0454m) this.f969A.get(i2);
            if (j2 > 0 && (this.f970B || i2 == 0)) {
                long j3 = abstractC0454m.f1010b;
                if (j3 > 0) {
                    abstractC0454m.mo1052F(j3 + j2);
                } else {
                    abstractC0454m.mo1052F(j2);
                }
            }
            abstractC0454m.mo1060l(viewGroup, c0463v, c0463v2, arrayList, arrayList2);
        }
    }

    @Override // p043Y.AbstractC0454m
    /* JADX INFO: renamed from: w */
    public final void mo1061w(View view) {
        super.mo1061w(view);
        int size = this.f969A.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((AbstractC0454m) this.f969A.get(i2)).mo1061w(view);
        }
    }

    @Override // p043Y.AbstractC0454m
    /* JADX INFO: renamed from: x */
    public final AbstractC0454m mo1062x(InterfaceC0452k interfaceC0452k) {
        super.mo1062x(interfaceC0452k);
        return this;
    }

    @Override // p043Y.AbstractC0454m
    /* JADX INFO: renamed from: y */
    public final void mo1063y(View view) {
        super.mo1063y(view);
        int size = this.f969A.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((AbstractC0454m) this.f969A.get(i2)).mo1063y(view);
        }
    }

    @Override // p043Y.AbstractC0454m
    /* JADX INFO: renamed from: z */
    public final void mo1064z() {
        if (this.f969A.isEmpty()) {
            m1078G();
            m1083m();
            return;
        }
        C0459r c0459r = new C0459r();
        c0459r.f1039b = this;
        Iterator it = this.f969A.iterator();
        while (it.hasNext()) {
            ((AbstractC0454m) it.next()).m1079a(c0459r);
        }
        this.f971C = this.f969A.size();
        if (this.f970B) {
            Iterator it2 = this.f969A.iterator();
            while (it2.hasNext()) {
                ((AbstractC0454m) it2.next()).mo1064z();
            }
            return;
        }
        for (int i2 = 1; i2 < this.f969A.size(); i2++) {
            ((AbstractC0454m) this.f969A.get(i2 - 1)).m1079a(new C0459r((AbstractC0454m) this.f969A.get(i2)));
        }
        AbstractC0454m abstractC0454m = (AbstractC0454m) this.f969A.get(0);
        if (abstractC0454m != null) {
            abstractC0454m.mo1064z();
        }
    }
}
