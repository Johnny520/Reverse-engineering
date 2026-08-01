package p118X3;

import java.io.EOFException;
import java.util.ArrayList;
import java.util.List;
import p049I2.AbstractC0797o;
import p117X2.AbstractC1665j;
import p117X2.C1675t;
import p123Y3.AbstractC1776g;
import p208n4.C2706e;
import p208n4.InterfaceC2707f;

/* JADX INFO: renamed from: X3.n */
/* JADX INFO: loaded from: classes.dex */
public final class C1704n extends AbstractC1682D {

    /* JADX INFO: renamed from: d */
    public static final C1711u f5850d;

    /* JADX INFO: renamed from: b */
    public final List f5851b;

    /* JADX INFO: renamed from: c */
    public final List f5852c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        C1675t c1675t = C1711u.f5877d;
        f5850d = AbstractC0797o.m1390o("application/x-www-form-urlencoded");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1704n(ArrayList arrayList, ArrayList arrayList2) {
        AbstractC1665j.m2985e(arrayList, "encodedNames");
        AbstractC1665j.m2985e(arrayList2, "encodedValues");
        this.f5851b = AbstractC1776g.m3182i(arrayList);
        this.f5852c = AbstractC1776g.m3182i(arrayList2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p118X3.AbstractC1682D
    /* JADX INFO: renamed from: a */
    public final long mo519a() {
        return m3020e(null, true);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p118X3.AbstractC1682D
    /* JADX INFO: renamed from: b */
    public final C1711u mo520b() {
        return f5850d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p118X3.AbstractC1682D
    /* JADX INFO: renamed from: d */
    public final void mo521d(InterfaceC2707f interfaceC2707f) throws EOFException {
        m3020e(interfaceC2707f, false);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public final long m3020e(InterfaceC2707f interfaceC2707f, boolean z5) throws EOFException {
        C2706e c2706eMo4718k;
        if (z5) {
            c2706eMo4718k = new C2706e();
        } else {
            AbstractC1665j.m2982b(interfaceC2707f);
            c2706eMo4718k = interfaceC2707f.mo4718k();
        }
        List list = this.f5851b;
        int size = list.size();
        for (int i5 = 0; i5 < size; i5++) {
            if (i5 > 0) {
                c2706eMo4718k.m4705G(38);
            }
            c2706eMo4718k.m4711M((String) list.get(i5));
            c2706eMo4718k.m4705G(61);
            c2706eMo4718k.m4711M((String) this.f5852c.get(i5));
        }
        if (!z5) {
            return 0L;
        }
        long j5 = c2706eMo4718k.f8629e;
        c2706eMo4718k.m4715h();
        return j5;
    }
}
