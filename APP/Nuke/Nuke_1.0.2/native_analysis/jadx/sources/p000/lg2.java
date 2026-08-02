package p000;

import java.io.File;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class lg2 extends tw2 implements mn0 {

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ dq1 f6112l;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ hg2 f6113m;

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ boolean f6114n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lg2(t00 t00Var, dq1 dq1Var, hg2 hg2Var, boolean z) {
        super(2, t00Var);
        this.f6112l = dq1Var;
        this.f6113m = hg2Var;
        this.f6114n = z;
    }

    @Override // p000.mn0
    /* JADX INFO: renamed from: g */
    public final Object mo12g(Object obj, Object obj2) throws IOException {
        lg2 lg2Var = (lg2) mo13p((t00) obj2, (j20) obj);
        a83 a83Var = a83.f116a;
        lg2Var.mo7r(a83Var);
        return a83Var;
    }

    @Override // p000.AbstractC0658rj
    /* JADX INFO: renamed from: p */
    public final t00 mo13p(t00 t00Var, Object obj) {
        return new lg2(t00Var, this.f6112l, this.f6113m, this.f6114n);
    }

    @Override // p000.AbstractC0658rj
    /* JADX INFO: renamed from: r */
    public final Object mo7r(Object obj) throws IOException {
        fg1.m1627T(obj);
        hg2 hg2Var = this.f6113m;
        dq1.m1074S(hg2Var);
        dq1 dq1Var = this.f6112l;
        File fileM1095T = dq1Var.m1095T(hg2Var);
        int length = hg2Var.f4003b.length();
        a83 a83Var = a83.f116a;
        if (length == 0) {
            dq1.m1075n(dq1Var, fileM1095T, fileM1095T);
            return a83Var;
        }
        if (fileM1095T.exists()) {
            if (!fileM1095T.isDirectory()) {
                c80.m672p("ALREADY_EXISTS", "A file already exists at the target path.", 0, null, null, 28);
                return null;
            }
        } else {
            if (this.f6114n) {
                dq1.m1075n(dq1Var, fileM1095T, dq1Var.m1096U(hg2Var.f4002a));
                return a83Var;
            }
            File parentFile = fileM1095T.getParentFile();
            if (parentFile == null) {
                c80.m672p("IO_ERROR", "Directory has no parent.", 0, null, null, 28);
                return null;
            }
            if (!parentFile.isDirectory() || !fileM1095T.mkdir()) {
                c80.m678v("Unable to create directory.");
                return null;
            }
        }
        return a83Var;
    }
}
