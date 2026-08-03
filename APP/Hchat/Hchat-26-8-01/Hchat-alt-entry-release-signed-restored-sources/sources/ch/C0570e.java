package ch;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p086fh.C1253k;
import p094g6.C1354b;
import p343x6.AbstractC5700d;
import tf.AbstractC4166m;
import tf.AbstractC4167n;

/* JADX INFO: renamed from: ch.e */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0570e extends AbstractC5700d {

    /* JADX INFO: renamed from: g */
    public List f1763g;

    /* JADX INFO: renamed from: h */
    public C1253k f1764h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p343x6.AbstractC5700d
    /* JADX INFO: renamed from: G */
    public final int mo1577G(C1354b c1354b) {
        int iM3634f;
        List list = this.f1763g;
        if (list != null) {
            ArrayList arrayList = new ArrayList(AbstractC4167n.m8429e1(list));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(Integer.valueOf(c1354b.m3633e((String) it.next())));
            }
            iM3634f = c1354b.m3634f(AbstractC4166m.m8406O1(arrayList));
        } else {
            iM3634f = 0;
        }
        C1253k c1253k = this.f1764h;
        int iMo1577G = c1253k != null ? c1253k.mo1577G(c1354b) : 0;
        c1354b.m3642n(7);
        c1354b.m3631c(6, iMo1577G);
        c1354b.m3631c(4, 0);
        c1354b.m3631c(3, 0);
        c1354b.m3631c(1, 0);
        c1354b.m3631c(0, iM3634f);
        int iM3635g = c1354b.m3635g();
        c1354b.m3637i(iM3635g);
        return iM3635g;
    }
}
