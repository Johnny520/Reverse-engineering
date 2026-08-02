package defpackage;

import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class x73 extends jm2 {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.jm2
    public final int a(f21 f21Var) {
        iy0 iy0Var = (iy0) f21Var;
        int iC = iy0Var.c() * iy0Var.e();
        if (iC < 0) {
            s.j("relative < 0");
            return 0;
        }
        int i = this.d;
        if (i >= 0) {
            return i + iC;
        }
        c80.j("fileOffset not yet set");
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.jm2
    public final void e() {
        k();
        Iterator it = c().iterator();
        while (it.hasNext()) {
            ((f21) it.next()).a(this.b);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.jm2
    public final int h() {
        Collection collectionC = c();
        int size = collectionC.size();
        if (size == 0) {
            return 0;
        }
        return ((f21) collectionC.iterator().next()).c() * size;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.jm2
    public final void j(yn ynVar) {
        Iterator it = c().iterator();
        while (it.hasNext()) {
            ((f21) it.next()).d(this.b, ynVar);
            ynVar.a(this.c);
        }
    }

    public abstract void k();
}
