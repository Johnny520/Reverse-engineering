package p280t5;

import p239q5.C6267r;
import p239q5.C6268s;
import p239q5.C6269t;

/* JADX INFO: renamed from: t5.p */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8125p {
    /* JADX INFO: renamed from: a */
    public abstract int mo31330a();

    /* JADX INFO: renamed from: b */
    public abstract C6267r mo31331b(C6267r c6267r);

    /* JADX INFO: renamed from: c */
    public final C6268s m31444c(C6268s c6268s) {
        int size = c6268s.size();
        C6268s c6268s2 = new C6268s(size);
        for (int i10 = 0; i10 < size; i10++) {
            c6268s2.m24772L(i10, mo31331b(c6268s.m24769G(i10)));
        }
        c6268s2.mo6829t();
        return c6268s2.equals(c6268s) ? c6268s : c6268s2;
    }

    /* JADX INFO: renamed from: d */
    public final C6269t m31445d(C6269t c6269t) {
        int iM24794z = c6269t.m24794z();
        C6269t c6269t2 = new C6269t(mo31330a());
        for (int i10 = 0; i10 < iM24794z; i10++) {
            C6267r c6267rM24792x = c6269t.m24792x(i10);
            if (c6267rM24792x != null) {
                c6269t2.m24787D(mo31331b(c6267rM24792x));
            }
        }
        c6269t2.mo6829t();
        return c6269t2.equals(c6269t) ? c6269t : c6269t2;
    }
}
