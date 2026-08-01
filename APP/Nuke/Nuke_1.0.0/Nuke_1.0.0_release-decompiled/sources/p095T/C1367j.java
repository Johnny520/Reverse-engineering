package p095T;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import p061L2.AbstractC0973m;
import p061L2.C0981u;
import p128a.AbstractC1785a;
import p143c3.C1906h;
import p149d3.AbstractC1977e;
import p179i4.AbstractC2352g;
import p186k.C2404A;
import p186k.C2438t;

/* JADX INFO: renamed from: T.j */
/* JADX INFO: loaded from: classes.dex */
public final class C1367j extends RuntimeException {

    /* JADX INFO: renamed from: d */
    public final C2404A f4812d;

    /* JADX INFO: renamed from: e */
    public final C2404A f4813e;

    /* JADX INFO: renamed from: f */
    public final C2438t f4814f;

    /* JADX INFO: renamed from: g */
    public final int f4815g;

    public C1367j(C2404A c2404a, C2404A c2404a2, C2438t c2438t, int i5, Exception exc) {
        super(exc);
        this.f4812d = c2404a;
        this.f4813e = c2404a2;
        this.f4814f = c2438t;
        this.f4815g = i5;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        List listM4211y;
        List listM2024e0;
        StringBuilder sb = new StringBuilder("\n            |Failed to execute op number ");
        sb.append(this.f4815g);
        sb.append(":\n            |");
        C1906h c1906hM3252m = AbstractC1785a.m3252m(new C1365i(this, null));
        if (c1906hM3252m.hasNext()) {
            Object next = c1906hM3252m.next();
            if (c1906hM3252m.hasNext()) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(next);
                while (c1906hM3252m.hasNext()) {
                    arrayList.add(c1906hM3252m.next());
                }
                listM4211y = arrayList;
            } else {
                listM4211y = AbstractC2352g.m4211y(next);
            }
        } else {
            listM4211y = C0981u.f3047d;
        }
        int size = listM4211y.size();
        if (50 >= size) {
            listM2024e0 = AbstractC0973m.m2024e0(listM4211y);
        } else {
            ArrayList arrayList2 = new ArrayList(50);
            if (listM4211y instanceof RandomAccess) {
                for (int i5 = size - 50; i5 < size; i5++) {
                    arrayList2.add(listM4211y.get(i5));
                }
            } else {
                ListIterator listIterator = listM4211y.listIterator(size - 50);
                while (listIterator.hasNext()) {
                    arrayList2.add(listIterator.next());
                }
            }
            listM2024e0 = arrayList2;
        }
        sb.append(AbstractC0973m.m2016W(listM2024e0, "\n", null, null, null, 62));
        sb.append("\n            ");
        return AbstractC1977e.m3649L(sb.toString());
    }
}
