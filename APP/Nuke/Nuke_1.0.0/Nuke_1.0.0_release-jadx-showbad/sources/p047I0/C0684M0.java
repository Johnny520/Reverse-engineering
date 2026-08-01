package p047I0;

import java.util.List;
import p077P0.C1125l;
import p077P0.C1128o;
import p186k.AbstractC2428j;
import p186k.C2440v;

/* JADX INFO: renamed from: I0.M0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0684M0 {

    /* JADX INFO: renamed from: a */
    public final C1125l f2200a;

    /* JADX INFO: renamed from: b */
    public final C2440v f2201b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0684M0(C1128o c1128o, AbstractC2428j abstractC2428j) {
        this.f2200a = c1128o.f3711d;
        this.f2201b = new C2440v(C1128o.m2163j(4, c1128o).size());
        List listM2163j = C1128o.m2163j(4, c1128o);
        int size = listM2163j.size();
        for (int i5 = 0; i5 < size; i5++) {
            C1128o c1128o2 = (C1128o) listM2163j.get(i5);
            if (abstractC2428j.m4317a(c1128o2.f3714g)) {
                this.f2201b.m4345a(c1128o2.f3714g);
            }
        }
    }
}
