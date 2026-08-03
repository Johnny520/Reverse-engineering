package p295u4;

import p000a.AbstractC0000a;
import p104h4.C1607u;
import p121i4.C1968i;
import p136j8.C2104o;
import p376z4.AbstractC6095i;

/* JADX INFO: renamed from: u4.c */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C4253c extends AbstractC6095i {

    /* JADX INFO: renamed from: j */
    public int f13934j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C4253c(int i9) {
        super(i9);
        this.f13934j = -1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: r */
    public final int m8550r() {
        if (this.f13934j == -1) {
            C1968i c1968i = new C1968i();
            c1968i.f6681g = 0;
            int length = this.f24601h.length;
            for (int i9 = 0; i9 < length; i9++) {
                C1607u c1607u = ((C4252b) m10840l(i9)).f13931b;
                int length2 = c1607u.f24601h.length;
                for (int i10 = 0; i10 < length2; i10++) {
                    ((AbstractC4259i) c1607u.m10840l(i10)).mo8553d(c1968i);
                }
            }
            this.f13934j = c1968i.f6681g;
        }
        return this.f13934j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: s */
    public final C4252b m8551s(int i9) {
        int iM10852p = m10852p(i9);
        if (iM10852p >= 0) {
            return (C4252b) m10840l(iM10852p);
        }
        C2104o.m5294t("no such label: ".concat(AbstractC0000a.m46X0(i9)));
        return null;
    }
}
