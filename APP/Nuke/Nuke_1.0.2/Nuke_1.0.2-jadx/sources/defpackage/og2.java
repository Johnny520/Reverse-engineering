package defpackage;

import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class og2 extends tw2 implements mn0 {
    public final /* synthetic */ int l;
    public int m;
    public final /* synthetic */ hg2 n;
    public final /* synthetic */ dq1 o;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ og2(t00 t00Var, hg2 hg2Var, dq1 dq1Var, int i) {
        super(2, t00Var);
        this.l = i;
        this.n = hg2Var;
        this.o = dq1Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.mn0
    public final Object g(Object obj, Object obj2) {
        int i = this.l;
        a83 a83Var = a83.a;
        j20 j20Var = (j20) obj;
        t00 t00Var = (t00) obj2;
        switch (i) {
        }
        return ((og2) p(t00Var, j20Var)).r(a83Var);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.rj
    public final t00 p(t00 t00Var, Object obj) {
        int i = this.l;
        dq1 dq1Var = this.o;
        hg2 hg2Var = this.n;
        switch (i) {
            case 0:
                return new og2(t00Var, hg2Var, dq1Var, 0);
            case 1:
                return new og2(t00Var, hg2Var, dq1Var, 1);
            default:
                return new og2(t00Var, hg2Var, dq1Var, 2);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    @Override // defpackage.rj
    public final Object r(Object obj) throws Throwable {
        int i = this.l;
        k20 k20Var = k20.h;
        hg2 hg2Var = this.n;
        dq1 dq1Var = this.o;
        switch (i) {
            case 0:
                int i2 = this.m;
                if (i2 == 0) {
                    fg1.T(obj);
                    int iOrdinal = hg2Var.a.ordinal();
                    if (iOrdinal == 0) {
                        this.m = 1;
                        Object objO = dq1.o(dq1Var, hg2Var, this);
                        return objO == k20Var ? k20Var : objO;
                    }
                    if (iOrdinal == 1 || iOrdinal == 2 || iOrdinal == 3) {
                        File fileT = dq1Var.T(hg2Var);
                        fg2 fg2Var = hg2Var.a;
                        String str = hg2Var.b;
                        if (!fileT.isDirectory()) {
                            throw new FileNotFoundException("Directory does not exist: ".concat(str));
                        }
                        dq1.C(dq1Var.U(fg2Var), fileT, true);
                        File[] fileArrListFiles = fileT.listFiles();
                        if (fileArrListFiles != null) {
                            List<File> listR0 = mg.r0(fileArrListFiles, new sl0(20));
                            ArrayList arrayList = new ArrayList(eu.B(listR0, 10));
                            for (File file : listR0) {
                                if (Files.isSymbolicLink(file.toPath())) {
                                    c80.v("Symbolic links are not supported in script storage.");
                                } else {
                                    String name = str.length() == 0 ? file.getName() : str + "/" + file.getName();
                                    name.getClass();
                                    arrayList.add(dq1Var.W(new hg2(fg2Var, name), file));
                                }
                            }
                            return arrayList;
                        }
                        c80.v("Unable to list directory.");
                    } else {
                        c80.s();
                    }
                } else {
                    if (i2 == 1) {
                        fg1.T(obj);
                        return obj;
                    }
                    s.l("call to 'resume' before 'invoke' with coroutine");
                }
                return null;
            case 1:
                vn1 vn1Var = (vn1) dq1Var.i;
                int i3 = this.m;
                if (i3 == 0) {
                    fg1.T(obj);
                    int iOrdinal2 = hg2Var.a.ordinal();
                    if (iOrdinal2 == 0) {
                        this.m = 1;
                        Object objO2 = dq1Var.O(hg2Var, this);
                        return objO2 == k20Var ? k20Var : objO2;
                    }
                    if (iOrdinal2 == 1 || iOrdinal2 == 2 || iOrdinal2 == 3) {
                        File fileT2 = dq1Var.T(hg2Var);
                        if (!fileT2.isFile()) {
                            throw new FileNotFoundException("File does not exist: ".concat(hg2Var.b));
                        }
                        long length = fileT2.length();
                        ((df2) vn1Var.d).a.getClass();
                        if (length <= 16777216) {
                            BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(fileT2), 8192);
                            try {
                                ((df2) vn1Var.d).a.getClass();
                                byte[] bArr = new byte[8192];
                                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream((int) Math.min(16777216L, 8192L));
                                long j = 0;
                                while (true) {
                                    int i4 = bufferedInputStream.read(bArr);
                                    if (i4 < 0) {
                                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                                        byteArray.getClass();
                                        bufferedInputStream.close();
                                        return byteArray;
                                    }
                                    if (i4 != 0) {
                                        j += (long) i4;
                                        if (j > 16777216) {
                                            throw new sd2("QUOTA_EXCEEDED", "File exceeds the read limit.", false, null, null, 28);
                                        }
                                        byteArrayOutputStream.write(bArr, 0, i4);
                                    }
                                }
                            } catch (Throwable th) {
                                try {
                                    throw th;
                                } catch (Throwable th2) {
                                    pp0.n(bufferedInputStream, th);
                                    throw th2;
                                }
                            }
                        } else {
                            c80.p("QUOTA_EXCEEDED", "File exceeds the read limit.", 0, null, null, 28);
                        }
                    } else {
                        c80.s();
                    }
                } else {
                    if (i3 == 1) {
                        fg1.T(obj);
                        return obj;
                    }
                    s.l("call to 'resume' before 'invoke' with coroutine");
                }
                return null;
            default:
                int i5 = this.m;
                if (i5 == 0) {
                    fg1.T(obj);
                    int iOrdinal3 = hg2Var.a.ordinal();
                    if (iOrdinal3 == 0) {
                        this.m = 1;
                        Object objK = dq1Var.K(hg2Var, this);
                        return objK == k20Var ? k20Var : objK;
                    }
                    if (iOrdinal3 == 1 || iOrdinal3 == 2 || iOrdinal3 == 3) {
                        return dq1Var.W(hg2Var, dq1Var.T(hg2Var));
                    }
                    c80.s();
                } else {
                    if (i5 == 1) {
                        fg1.T(obj);
                        return obj;
                    }
                    s.l("call to 'resume' before 'invoke' with coroutine");
                }
                return null;
        }
    }
}
