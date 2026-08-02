package p000;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.attribute.FileAttribute;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class zg2 extends tw2 implements mn0 {

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ dq1 f13896l;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ hg2 f13897m;

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ long f13898n;

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ boolean f13899o;

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ boolean f13900p;

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ InputStream f13901q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zg2(t00 t00Var, dq1 dq1Var, hg2 hg2Var, long j, boolean z, boolean z2, InputStream inputStream) {
        super(2, t00Var);
        this.f13896l = dq1Var;
        this.f13897m = hg2Var;
        this.f13898n = j;
        this.f13899o = z;
        this.f13900p = z2;
        this.f13901q = inputStream;
    }

    @Override // p000.mn0
    /* JADX INFO: renamed from: g */
    public final Object mo12g(Object obj, Object obj2) {
        return ((zg2) mo13p((t00) obj2, (j20) obj)).mo7r(a83.f116a);
    }

    @Override // p000.AbstractC0658rj
    /* JADX INFO: renamed from: p */
    public final t00 mo13p(t00 t00Var, Object obj) {
        return new zg2(t00Var, this.f13896l, this.f13897m, this.f13898n, this.f13899o, this.f13900p, this.f13901q);
    }

    @Override // p000.AbstractC0658rj
    /* JADX INFO: renamed from: r */
    public final Object mo7r(Object obj) throws IOException {
        fg1.m1627T(obj);
        hg2 hg2Var = this.f13897m;
        dq1.m1074S(hg2Var);
        fg2 fg2Var = hg2Var.f4002a;
        String str = hg2Var.f4003b;
        long j = this.f13898n;
        long jAddExact = 0;
        if (j <= 0) {
            C0676s.m4651j("maxBytes must be positive.");
            return null;
        }
        if (str.length() == 0) {
            c80.m672p("INVALID_ARGUMENT", "Cannot write an area root as a file.", 0, null, null, 28);
            return null;
        }
        dq1 dq1Var = this.f13896l;
        File fileM1095T = dq1Var.m1095T(hg2Var);
        File fileM1096U = dq1Var.m1096U(fg2Var);
        File parentFile = fileM1095T.getParentFile();
        if (parentFile == null) {
            c80.m672p("IO_ERROR", "File has no parent directory.", 0, null, null, 28);
            return null;
        }
        if (this.f13899o) {
            dq1.m1075n(dq1Var, parentFile, fileM1096U);
        } else if (!parentFile.isDirectory()) {
            throw new FileNotFoundException("Parent directory does not exist: ".concat(str));
        }
        dq1.m1072C(fileM1096U, fileM1095T, fileM1095T.exists());
        boolean zExists = fileM1095T.exists();
        boolean z = this.f13900p;
        if (zExists && !z) {
            c80.m672p("ALREADY_EXISTS", "Target already exists.", 0, null, null, 28);
            return null;
        }
        if (fileM1095T.isDirectory()) {
            c80.m672p("ALREADY_EXISTS", "Target is a directory.", 0, null, null, 28);
            return null;
        }
        long jM1078s = dq1.m1078s(fileM1096U);
        File file = fileM1095T.isFile() ? fileM1095T : null;
        long jM1108r = dq1Var.m1108r(fg2Var) - (jM1078s - (file != null ? file.length() : 0L));
        if (jM1108r <= 0) {
            c80.m672p("QUOTA_EXCEEDED", "Script storage quota has been exceeded.", 0, null, null, 28);
            return null;
        }
        File file2 = Files.createTempFile(parentFile.toPath(), ".nuke-", ".download", new FileAttribute[0]).toFile();
        try {
            file2.getClass();
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file2), 8192);
            try {
                byte[] bArr = new byte[8192];
                while (true) {
                    try {
                        int i = this.f13901q.read(bArr);
                        if (i < 0) {
                            bufferedOutputStream.close();
                            dq1.m1073J(file2, fileM1095T, z);
                            file2.delete();
                            return dq1Var.m1098W(hg2Var, fileM1095T);
                        }
                        if (i != 0) {
                            boolean z2 = z;
                            jAddExact = Math.addExact(jAddExact, i);
                            if (jAddExact > j) {
                                throw new sd2("QUOTA_EXCEEDED", "Download exceeds the size limit.", false, null, null, 28);
                            }
                            if (jAddExact > jM1108r) {
                                throw new sd2("QUOTA_EXCEEDED", "Script storage quota has been exceeded.", false, null, null, 28);
                            }
                            bufferedOutputStream.write(bArr, 0, i);
                            z = z2;
                        }
                    } catch (IOException e) {
                        throw new cg2(e);
                    }
                }
            } finally {
            }
        } catch (Throwable th) {
            file2.delete();
            throw th;
        }
    }
}
