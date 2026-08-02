package defpackage;

import java.io.File;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class lg2 extends tw2 implements mn0 {
    public final /* synthetic */ dq1 l;
    public final /* synthetic */ hg2 m;
    public final /* synthetic */ boolean n;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lg2(t00 t00Var, dq1 dq1Var, hg2 hg2Var, boolean z) {
        super(2, t00Var);
        this.l = dq1Var;
        this.m = hg2Var;
        this.n = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.mn0
    public final Object g(Object obj, Object obj2) throws IOException {
        lg2 lg2Var = (lg2) p((t00) obj2, (j20) obj);
        a83 a83Var = a83.a;
        lg2Var.r(a83Var);
        return a83Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.rj
    public final t00 p(t00 t00Var, Object obj) {
        return new lg2(t00Var, this.l, this.m, this.n);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.rj
    public final Object r(Object obj) throws IOException {
        fg1.T(obj);
        hg2 hg2Var = this.m;
        dq1.S(hg2Var);
        dq1 dq1Var = this.l;
        File fileT = dq1Var.T(hg2Var);
        int length = hg2Var.b.length();
        a83 a83Var = a83.a;
        if (length == 0) {
            dq1.n(dq1Var, fileT, fileT);
            return a83Var;
        }
        if (fileT.exists()) {
            if (!fileT.isDirectory()) {
                c80.p("ALREADY_EXISTS", "A file already exists at the target path.", 0, null, null, 28);
                return null;
            }
        } else {
            if (this.n) {
                dq1.n(dq1Var, fileT, dq1Var.U(hg2Var.a));
                return a83Var;
            }
            File parentFile = fileT.getParentFile();
            if (parentFile == null) {
                c80.p("IO_ERROR", "Directory has no parent.", 0, null, null, 28);
                return null;
            }
            if (!parentFile.isDirectory() || !fileT.mkdir()) {
                c80.v("Unable to create directory.");
                return null;
            }
        }
        return a83Var;
    }
}
