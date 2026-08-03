package p037U;

import java.util.ArrayList;
import java.util.List;
import p034S.AbstractC0324d;

/* JADX INFO: renamed from: U.g */
/* JADX INFO: loaded from: classes.dex */
public final class C0371g extends AbstractC0390z {

    /* JADX INFO: renamed from: g */
    public boolean f784g;

    /* JADX INFO: renamed from: h */
    public ArrayList f785h;

    /* JADX INFO: renamed from: i */
    public ArrayList f786i;

    /* JADX INFO: renamed from: j */
    public ArrayList f787j;

    /* JADX INFO: renamed from: k */
    public ArrayList f788k;

    /* JADX INFO: renamed from: l */
    public ArrayList f789l;

    /* JADX INFO: renamed from: m */
    public ArrayList f790m;

    /* JADX INFO: renamed from: n */
    public ArrayList f791n;

    /* JADX INFO: renamed from: o */
    public ArrayList f792o;

    /* JADX INFO: renamed from: p */
    public ArrayList f793p;

    /* JADX INFO: renamed from: q */
    public ArrayList f794q;

    /* JADX INFO: renamed from: r */
    public ArrayList f795r;

    /* JADX INFO: renamed from: f */
    public static void m945f(ArrayList arrayList) {
        int size = arrayList.size() - 1;
        if (size < 0) {
            return;
        }
        ((AbstractC0355O) arrayList.get(size)).getClass();
        throw null;
    }

    @Override // p037U.AbstractC0390z
    /* JADX INFO: renamed from: c */
    public final void mo946c(AbstractC0355O abstractC0355O) {
        abstractC0355O.getClass();
        throw null;
    }

    @Override // p037U.AbstractC0390z
    /* JADX INFO: renamed from: d */
    public final void mo947d() {
        ArrayList arrayList = this.f787j;
        int size = arrayList.size() - 1;
        if (size >= 0) {
            ((AbstractC0370f) arrayList.get(size)).getClass();
            throw null;
        }
        ArrayList arrayList2 = this.f785h;
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            m980b((AbstractC0355O) arrayList2.get(size2));
            arrayList2.remove(size2);
        }
        ArrayList arrayList3 = this.f786i;
        int size3 = arrayList3.size() - 1;
        if (size3 >= 0) {
            ((AbstractC0355O) arrayList3.get(size3)).getClass();
            throw null;
        }
        ArrayList arrayList4 = this.f788k;
        for (int size4 = arrayList4.size() - 1; size4 >= 0; size4--) {
            AbstractC0369e abstractC0369e = (AbstractC0369e) arrayList4.get(size4);
            abstractC0369e.getClass();
            abstractC0369e.getClass();
        }
        arrayList4.clear();
        if (mo948e()) {
            ArrayList arrayList5 = this.f790m;
            for (int size5 = arrayList5.size() - 1; size5 >= 0; size5--) {
                ArrayList arrayList6 = (ArrayList) arrayList5.get(size5);
                int size6 = arrayList6.size() - 1;
                if (size6 >= 0) {
                    ((AbstractC0370f) arrayList6.get(size6)).getClass();
                    throw null;
                }
            }
            ArrayList arrayList7 = this.f789l;
            for (int size7 = arrayList7.size() - 1; size7 >= 0; size7--) {
                ArrayList arrayList8 = (ArrayList) arrayList7.get(size7);
                int size8 = arrayList8.size() - 1;
                if (size8 >= 0) {
                    ((AbstractC0355O) arrayList8.get(size8)).getClass();
                    throw null;
                }
            }
            ArrayList arrayList9 = this.f791n;
            for (int size9 = arrayList9.size() - 1; size9 >= 0; size9--) {
                ArrayList arrayList10 = (ArrayList) arrayList9.get(size9);
                for (int size10 = arrayList10.size() - 1; size10 >= 0; size10--) {
                    AbstractC0369e abstractC0369e2 = (AbstractC0369e) arrayList10.get(size10);
                    abstractC0369e2.getClass();
                    abstractC0369e2.getClass();
                    if (arrayList10.isEmpty()) {
                        arrayList9.remove(arrayList10);
                    }
                }
            }
            m945f(this.f794q);
            m945f(this.f793p);
            m945f(this.f792o);
            m945f(this.f795r);
            ArrayList arrayList11 = this.f877b;
            if (arrayList11.size() > 0) {
                AbstractC0324d.m726i(arrayList11.get(0));
                throw null;
            }
            arrayList11.clear();
        }
    }

    @Override // p037U.AbstractC0390z
    /* JADX INFO: renamed from: e */
    public final boolean mo948e() {
        return (this.f786i.isEmpty() && this.f788k.isEmpty() && this.f787j.isEmpty() && this.f785h.isEmpty() && this.f793p.isEmpty() && this.f794q.isEmpty() && this.f792o.isEmpty() && this.f795r.isEmpty() && this.f790m.isEmpty() && this.f789l.isEmpty() && this.f791n.isEmpty()) ? false : true;
    }

    /* JADX INFO: renamed from: g */
    public final void m949g() {
        if (mo948e()) {
            return;
        }
        ArrayList arrayList = this.f877b;
        if (arrayList.size() <= 0) {
            arrayList.clear();
        } else {
            AbstractC0324d.m726i(arrayList.get(0));
            throw null;
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m950h(List list, AbstractC0355O abstractC0355O) {
        for (int size = list.size() - 1; size >= 0; size--) {
            AbstractC0369e abstractC0369e = (AbstractC0369e) list.get(size);
            if (m951i(abstractC0369e, abstractC0355O)) {
                abstractC0369e.getClass();
                abstractC0369e.getClass();
                list.remove(abstractC0369e);
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public final boolean m951i(AbstractC0369e abstractC0369e, AbstractC0355O abstractC0355O) {
        abstractC0369e.getClass();
        abstractC0369e.getClass();
        abstractC0355O.getClass();
        throw null;
    }
}
