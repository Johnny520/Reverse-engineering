package p255r4;

import bsh.C0353j;
import java.util.Collection;
import java.util.Iterator;
import p136j8.C2104o;
import p376z4.C6090d;

/* JADX INFO: renamed from: r4.u0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3700u0 extends AbstractC3688o0 {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p255r4.AbstractC3688o0
    /* JADX INFO: renamed from: a */
    public final int mo7674a(AbstractC3660a0 abstractC3660a0) {
        AbstractC3706z abstractC3706z = (AbstractC3706z) abstractC3660a0;
        int iMo7644c = abstractC3706z.mo7644c() * abstractC3706z.m7709e();
        if (iMo7644c < 0) {
            C2104o.m5294t("relative < 0");
            return 0;
        }
        int i9 = this.f11997d;
        if (i9 >= 0) {
            return i9 + iMo7644c;
        }
        C0353j.m1309g("fileOffset not yet set");
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p255r4.AbstractC3688o0
    /* JADX INFO: renamed from: e */
    public final void mo7675e() {
        mo7651k();
        Iterator it = mo7652c().iterator();
        while (it.hasNext()) {
            ((AbstractC3660a0) it.next()).mo7638a(this.f11995b);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p255r4.AbstractC3688o0
    /* JADX INFO: renamed from: h */
    public final int mo7676h() {
        Collection collectionMo7652c = mo7652c();
        int size = collectionMo7652c.size();
        if (size == 0) {
            return 0;
        }
        return ((AbstractC3660a0) collectionMo7652c.iterator().next()).mo7644c() * size;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p255r4.AbstractC3688o0
    /* JADX INFO: renamed from: j */
    public final void mo7677j(C6090d c6090d) {
        Iterator it = mo7652c().iterator();
        while (it.hasNext()) {
            ((AbstractC3660a0) it.next()).mo7645d(this.f11995b, c6090d);
            c6090d.m10826a(this.f11996c);
        }
    }

    /* JADX INFO: renamed from: k */
    public abstract void mo7651k();
}
