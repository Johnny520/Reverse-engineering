package p000;

import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class x73 extends jm2 {
    @Override // p000.jm2
    /* JADX INFO: renamed from: a */
    public final int mo1349a(f21 f21Var) {
        iy0 iy0Var = (iy0) f21Var;
        int iMo70c = iy0Var.mo70c() * iy0Var.m2415e();
        if (iMo70c < 0) {
            C0676s.m4651j("relative < 0");
            return 0;
        }
        int i = this.f5110d;
        if (i >= 0) {
            return i + iMo70c;
        }
        c80.m667j("fileOffset not yet set");
        return 0;
    }

    @Override // p000.jm2
    /* JADX INFO: renamed from: e */
    public final void mo1350e() {
        mo399k();
        Iterator it = mo398c().iterator();
        while (it.hasNext()) {
            ((f21) it.next()).mo68a(this.f5108b);
        }
    }

    @Override // p000.jm2
    /* JADX INFO: renamed from: h */
    public final int mo1351h() {
        Collection collectionMo398c = mo398c();
        int size = collectionMo398c.size();
        if (size == 0) {
            return 0;
        }
        return ((f21) collectionMo398c.iterator().next()).mo70c() * size;
    }

    @Override // p000.jm2
    /* JADX INFO: renamed from: j */
    public final void mo1352j(C0929yn c0929yn) {
        Iterator it = mo398c().iterator();
        while (it.hasNext()) {
            ((f21) it.next()).mo71d(this.f5108b, c0929yn);
            c0929yn.m6290a(this.f5109c);
        }
    }

    /* JADX INFO: renamed from: k */
    public abstract void mo399k();
}
