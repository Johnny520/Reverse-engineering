package defpackage;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.attribute.FileAttribute;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class r10 extends tw2 implements mn0 {
    public final /* synthetic */ int l = 0;
    public /* synthetic */ Object m;
    public final /* synthetic */ Object n;
    public final /* synthetic */ Object o;
    public final /* synthetic */ Object p;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r10(t00 t00Var, dq1 dq1Var, hg2 hg2Var, byte[] bArr, dl2 dl2Var) {
        super(2, t00Var);
        this.m = dq1Var;
        this.n = hg2Var;
        this.o = bArr;
        this.p = dl2Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.mn0
    public final Object g(Object obj, Object obj2) throws IOException {
        int i = this.l;
        a83 a83Var = a83.a;
        j20 j20Var = (j20) obj;
        t00 t00Var = (t00) obj2;
        switch (i) {
            case 0:
                ((r10) p(t00Var, j20Var)).r(a83Var);
                return a83Var;
            default:
                return ((r10) p(t00Var, j20Var)).r(a83Var);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.rj
    public final t00 p(t00 t00Var, Object obj) {
        int i = this.l;
        Object obj2 = this.p;
        Object obj3 = this.o;
        Object obj4 = this.n;
        switch (i) {
            case 0:
                r10 r10Var = new r10((s12) obj4, (kz2) obj3, (b03) obj2, t00Var);
                r10Var.m = obj;
                return r10Var;
            default:
                return new r10(t00Var, (dq1) this.m, (hg2) obj4, (byte[]) obj3, (dl2) obj2);
        }
    }

    /* JADX DEBUG: Another duplicated slice has different insns count: {[]}, finally: {[THROW, INVOKE, MOVE_EXCEPTION, THROW, MOVE_EXCEPTION] complete} */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    @Override // defpackage.rj
    public final Object r(Object obj) throws IOException {
        BufferedOutputStream bufferedOutputStream;
        int i = this.l;
        int i2 = 0;
        Object obj2 = this.n;
        Object obj3 = this.o;
        Object obj4 = this.p;
        t00 t00Var = null;
        switch (i) {
            case 0:
                fg1.T(obj);
                j20 j20Var = (j20) this.m;
                s12 s12Var = (s12) obj2;
                p7.A(j20Var, null, new q10(s12Var, (kz2) obj3, t00Var, i2), 1);
                p7.A(j20Var, null, new a2(s12Var, (b03) obj4, t00Var, 12), 1);
                return a83.a;
            default:
                dl2 dl2Var = (dl2) obj4;
                byte[] bArr = (byte[]) obj3;
                fg1.T(obj);
                dq1 dq1Var = (dq1) this.m;
                hg2 hg2Var = (hg2) obj2;
                dq1.S(hg2Var);
                fg2 fg2Var = hg2Var.a;
                File fileT = dq1Var.T(hg2Var);
                String str = hg2Var.b;
                if (str.length() == 0) {
                    c80.p("INVALID_ARGUMENT", "Cannot write an area root as a file.", 0, null, null, 28);
                    return null;
                }
                if (bArr.length > dq1Var.r(fg2Var)) {
                    c80.p("QUOTA_EXCEEDED", "File exceeds the storage quota.", 0, null, null, 28);
                    return null;
                }
                File parentFile = fileT.getParentFile();
                if (parentFile == null) {
                    c80.p("IO_ERROR", "File has no parent directory.", 0, null, null, 28);
                    return null;
                }
                boolean z = dl2Var.c;
                boolean z2 = dl2Var.a;
                if (z) {
                    dq1.n(dq1Var, parentFile, dq1Var.U(fg2Var));
                } else if (!parentFile.isDirectory()) {
                    throw new FileNotFoundException("Parent directory does not exist: ".concat(str));
                }
                dq1.C(dq1Var.U(fg2Var), fileT, fileT.exists());
                if (fileT.exists() && !z2) {
                    c80.p("ALREADY_EXISTS", "Target already exists.", 0, null, null, 28);
                    return null;
                }
                if (fileT.isDirectory()) {
                    c80.p("ALREADY_EXISTS", "Target is a directory.", 0, null, null, 28);
                    return null;
                }
                File file = fileT.isFile() ? fileT : null;
                if ((dq1.s(dq1Var.U(fg2Var)) - (file != null ? file.length() : 0L)) + ((long) bArr.length) > dq1Var.r(fg2Var)) {
                    c80.p("QUOTA_EXCEEDED", "Script storage quota has been exceeded.", 0, null, null, 28);
                    return null;
                }
                if (dl2Var.b) {
                    File parentFile2 = fileT.getParentFile();
                    if (parentFile2 == null) {
                        c80.v("Target has no parent directory.");
                        return null;
                    }
                    File file2 = Files.createTempFile(parentFile2.toPath(), ".nuke-", ".tmp", new FileAttribute[0]).toFile();
                    try {
                        file2.getClass();
                        bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file2), 8192);
                        try {
                            bufferedOutputStream.write(bArr);
                            bufferedOutputStream.close();
                            dq1.J(file2, fileT, z2);
                        } finally {
                        }
                    } finally {
                        file2.delete();
                    }
                } else {
                    bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(fileT), 8192);
                    try {
                        bufferedOutputStream.write(bArr);
                        bufferedOutputStream.close();
                    } catch (Throwable th) {
                        try {
                            throw th;
                        } finally {
                        }
                    }
                }
                return dq1Var.W(hg2Var, fileT);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r10(s12 s12Var, kz2 kz2Var, b03 b03Var, t00 t00Var) {
        super(2, t00Var);
        this.n = s12Var;
        this.o = kz2Var;
        this.p = b03Var;
    }
}
