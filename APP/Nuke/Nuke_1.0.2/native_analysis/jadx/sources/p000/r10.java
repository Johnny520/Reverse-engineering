package p000;

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

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ int f9315l = 0;

    /* JADX INFO: renamed from: m */
    public /* synthetic */ Object f9316m;

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ Object f9317n;

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ Object f9318o;

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ Object f9319p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r10(t00 t00Var, dq1 dq1Var, hg2 hg2Var, byte[] bArr, dl2 dl2Var) {
        super(2, t00Var);
        this.f9316m = dq1Var;
        this.f9317n = hg2Var;
        this.f9318o = bArr;
        this.f9319p = dl2Var;
    }

    @Override // p000.mn0
    /* JADX INFO: renamed from: g */
    public final Object mo12g(Object obj, Object obj2) throws IOException {
        int i = this.f9315l;
        a83 a83Var = a83.f116a;
        j20 j20Var = (j20) obj;
        t00 t00Var = (t00) obj2;
        switch (i) {
            case 0:
                ((r10) mo13p(t00Var, j20Var)).mo7r(a83Var);
                return a83Var;
            default:
                return ((r10) mo13p(t00Var, j20Var)).mo7r(a83Var);
        }
    }

    @Override // p000.AbstractC0658rj
    /* JADX INFO: renamed from: p */
    public final t00 mo13p(t00 t00Var, Object obj) {
        int i = this.f9315l;
        Object obj2 = this.f9319p;
        Object obj3 = this.f9318o;
        Object obj4 = this.f9317n;
        switch (i) {
            case 0:
                r10 r10Var = new r10((s12) obj4, (kz2) obj3, (b03) obj2, t00Var);
                r10Var.f9316m = obj;
                return r10Var;
            default:
                return new r10(t00Var, (dq1) this.f9316m, (hg2) obj4, (byte[]) obj3, (dl2) obj2);
        }
    }

    @Override // p000.AbstractC0658rj
    /* JADX INFO: renamed from: r */
    public final Object mo7r(Object obj) throws IOException {
        BufferedOutputStream bufferedOutputStream;
        int i = this.f9315l;
        int i2 = 0;
        Object obj2 = this.f9317n;
        Object obj3 = this.f9318o;
        Object obj4 = this.f9319p;
        t00 t00Var = null;
        switch (i) {
            case 0:
                fg1.m1627T(obj);
                j20 j20Var = (j20) this.f9316m;
                s12 s12Var = (s12) obj2;
                AbstractC0570p7.m3745A(j20Var, null, new q10(s12Var, (kz2) obj3, t00Var, i2), 1);
                AbstractC0570p7.m3745A(j20Var, null, new C0003a2(s12Var, (b03) obj4, t00Var, 12), 1);
                return a83.f116a;
            default:
                dl2 dl2Var = (dl2) obj4;
                byte[] bArr = (byte[]) obj3;
                fg1.m1627T(obj);
                dq1 dq1Var = (dq1) this.f9316m;
                hg2 hg2Var = (hg2) obj2;
                dq1.m1074S(hg2Var);
                fg2 fg2Var = hg2Var.f4002a;
                File fileM1095T = dq1Var.m1095T(hg2Var);
                String str = hg2Var.f4003b;
                if (str.length() == 0) {
                    c80.m672p("INVALID_ARGUMENT", "Cannot write an area root as a file.", 0, null, null, 28);
                    return null;
                }
                if (bArr.length > dq1Var.m1108r(fg2Var)) {
                    c80.m672p("QUOTA_EXCEEDED", "File exceeds the storage quota.", 0, null, null, 28);
                    return null;
                }
                File parentFile = fileM1095T.getParentFile();
                if (parentFile == null) {
                    c80.m672p("IO_ERROR", "File has no parent directory.", 0, null, null, 28);
                    return null;
                }
                boolean z = dl2Var.f2109c;
                boolean z2 = dl2Var.f2107a;
                if (z) {
                    dq1.m1075n(dq1Var, parentFile, dq1Var.m1096U(fg2Var));
                } else if (!parentFile.isDirectory()) {
                    throw new FileNotFoundException("Parent directory does not exist: ".concat(str));
                }
                dq1.m1072C(dq1Var.m1096U(fg2Var), fileM1095T, fileM1095T.exists());
                if (fileM1095T.exists() && !z2) {
                    c80.m672p("ALREADY_EXISTS", "Target already exists.", 0, null, null, 28);
                    return null;
                }
                if (fileM1095T.isDirectory()) {
                    c80.m672p("ALREADY_EXISTS", "Target is a directory.", 0, null, null, 28);
                    return null;
                }
                File file = fileM1095T.isFile() ? fileM1095T : null;
                if ((dq1.m1078s(dq1Var.m1096U(fg2Var)) - (file != null ? file.length() : 0L)) + ((long) bArr.length) > dq1Var.m1108r(fg2Var)) {
                    c80.m672p("QUOTA_EXCEEDED", "Script storage quota has been exceeded.", 0, null, null, 28);
                    return null;
                }
                if (dl2Var.f2108b) {
                    File parentFile2 = fileM1095T.getParentFile();
                    if (parentFile2 == null) {
                        c80.m678v("Target has no parent directory.");
                        return null;
                    }
                    File file2 = Files.createTempFile(parentFile2.toPath(), ".nuke-", ".tmp", new FileAttribute[0]).toFile();
                    try {
                        file2.getClass();
                        bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file2), 8192);
                        try {
                            bufferedOutputStream.write(bArr);
                            bufferedOutputStream.close();
                            dq1.m1073J(file2, fileM1095T, z2);
                        } finally {
                        }
                    } finally {
                        file2.delete();
                    }
                } else {
                    bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(fileM1095T), 8192);
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
                return dq1Var.m1098W(hg2Var, fileM1095T);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r10(s12 s12Var, kz2 kz2Var, b03 b03Var, t00 t00Var) {
        super(2, t00Var);
        this.f9317n = s12Var;
        this.f9318o = kz2Var;
        this.f9319p = b03Var;
    }
}
