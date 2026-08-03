package p086fh;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p094g6.C1354b;
import p343x6.AbstractC5700d;
import tf.AbstractC4166m;
import tf.AbstractC4167n;

/* JADX INFO: renamed from: fh.l */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1254l extends AbstractC5700d {

    /* JADX INFO: renamed from: g */
    public List f4111g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p343x6.AbstractC5700d
    /* JADX INFO: renamed from: G */
    public final int mo1577G(C1354b c1354b) {
        int iM3634f;
        List list = this.f4111g;
        if (list != null) {
            ArrayList arrayList = new ArrayList(AbstractC4167n.m8429e1(list));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(Integer.valueOf(((C1253k) it.next()).mo1577G(c1354b)));
            }
            iM3634f = c1354b.m3634f(AbstractC4166m.m8406O1(arrayList));
        } else {
            iM3634f = 0;
        }
        c1354b.m3642n(3);
        c1354b.m3631c(2, 0);
        c1354b.m3631c(0, iM3634f);
        int iM3635g = c1354b.m3635g();
        c1354b.m3637i(iM3635g);
        return iM3635g;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k0 */
    public final void m3377k0(C1253k c1253k) {
        List arrayList = this.f4111g;
        if (arrayList == null) {
            arrayList = new ArrayList();
        }
        this.f4111g = arrayList;
        arrayList.add(c1253k);
    }
}
