package defpackage;

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
    public final /* synthetic */ dq1 l;
    public final /* synthetic */ hg2 m;
    public final /* synthetic */ long n;
    public final /* synthetic */ boolean o;
    public final /* synthetic */ boolean p;
    public final /* synthetic */ InputStream q;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zg2(t00 t00Var, dq1 dq1Var, hg2 hg2Var, long j, boolean z, boolean z2, InputStream inputStream) {
        super(2, t00Var);
        this.l = dq1Var;
        this.m = hg2Var;
        this.n = j;
        this.o = z;
        this.p = z2;
        this.q = inputStream;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.mn0
    public final Object g(Object obj, Object obj2) {
        return ((zg2) p((t00) obj2, (j20) obj)).r(a83.a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.rj
    public final t00 p(t00 t00Var, Object obj) {
        return new zg2(t00Var, this.l, this.m, this.n, this.o, this.p, this.q);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    @Override // defpackage.rj
    public final Object r(Object obj) throws IOException {
        fg1.T(obj);
        hg2 hg2Var = this.m;
        dq1.S(hg2Var);
        fg2 fg2Var = hg2Var.a;
        String str = hg2Var.b;
        long j = this.n;
        long jAddExact = 0;
        if (j <= 0) {
            s.j("maxBytes must be positive.");
            return null;
        }
        if (str.length() == 0) {
            c80.p("INVALID_ARGUMENT", "Cannot write an area root as a file.", 0, null, null, 28);
            return null;
        }
        dq1 dq1Var = this.l;
        File fileT = dq1Var.T(hg2Var);
        File fileU = dq1Var.U(fg2Var);
        File parentFile = fileT.getParentFile();
        if (parentFile == null) {
            c80.p("IO_ERROR", "File has no parent directory.", 0, null, null, 28);
            return null;
        }
        if (this.o) {
            dq1.n(dq1Var, parentFile, fileU);
        } else if (!parentFile.isDirectory()) {
            throw new FileNotFoundException("Parent directory does not exist: ".concat(str));
        }
        dq1.C(fileU, fileT, fileT.exists());
        boolean zExists = fileT.exists();
        boolean z = this.p;
        if (zExists && !z) {
            c80.p("ALREADY_EXISTS", "Target already exists.", 0, null, null, 28);
            return null;
        }
        if (fileT.isDirectory()) {
            c80.p("ALREADY_EXISTS", "Target is a directory.", 0, null, null, 28);
            return null;
        }
        long jS = dq1.s(fileU);
        File file = fileT.isFile() ? fileT : null;
        long jR = dq1Var.r(fg2Var) - (jS - (file != null ? file.length() : 0L));
        if (jR <= 0) {
            c80.p("QUOTA_EXCEEDED", "Script storage quota has been exceeded.", 0, null, null, 28);
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
                        int i = this.q.read(bArr);
                        if (i < 0) {
                            bufferedOutputStream.close();
                            dq1.J(file2, fileT, z);
                            file2.delete();
                            return dq1Var.W(hg2Var, fileT);
                        }
                        if (i != 0) {
                            boolean z2 = z;
                            jAddExact = Math.addExact(jAddExact, i);
                            if (jAddExact > j) {
                                throw new sd2("QUOTA_EXCEEDED", "Download exceeds the size limit.", false, null, null, 28);
                            }
                            if (jAddExact > jR) {
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
