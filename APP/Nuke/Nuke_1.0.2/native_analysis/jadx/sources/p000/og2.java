package p000;

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

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ int f7672l;

    /* JADX INFO: renamed from: m */
    public int f7673m;

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ hg2 f7674n;

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ dq1 f7675o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ og2(t00 t00Var, hg2 hg2Var, dq1 dq1Var, int i) {
        super(2, t00Var);
        this.f7672l = i;
        this.f7674n = hg2Var;
        this.f7675o = dq1Var;
    }

    @Override // p000.mn0
    /* JADX INFO: renamed from: g */
    public final Object mo12g(Object obj, Object obj2) {
        int i = this.f7672l;
        a83 a83Var = a83.f116a;
        j20 j20Var = (j20) obj;
        t00 t00Var = (t00) obj2;
        switch (i) {
        }
        return ((og2) mo13p(t00Var, j20Var)).mo7r(a83Var);
    }

    @Override // p000.AbstractC0658rj
    /* JADX INFO: renamed from: p */
    public final t00 mo13p(t00 t00Var, Object obj) {
        int i = this.f7672l;
        dq1 dq1Var = this.f7675o;
        hg2 hg2Var = this.f7674n;
        switch (i) {
            case 0:
                return new og2(t00Var, hg2Var, dq1Var, 0);
            case 1:
                return new og2(t00Var, hg2Var, dq1Var, 1);
            default:
                return new og2(t00Var, hg2Var, dq1Var, 2);
        }
    }

    @Override // p000.AbstractC0658rj
    /* JADX INFO: renamed from: r */
    public final Object mo7r(Object obj) throws Throwable {
        int i = this.f7672l;
        k20 k20Var = k20.f5323h;
        hg2 hg2Var = this.f7674n;
        dq1 dq1Var = this.f7675o;
        switch (i) {
            case 0:
                int i2 = this.f7673m;
                if (i2 == 0) {
                    fg1.m1627T(obj);
                    int iOrdinal = hg2Var.f4002a.ordinal();
                    if (iOrdinal == 0) {
                        this.f7673m = 1;
                        Object objM1076o = dq1.m1076o(dq1Var, hg2Var, this);
                        return objM1076o == k20Var ? k20Var : objM1076o;
                    }
                    if (iOrdinal == 1 || iOrdinal == 2 || iOrdinal == 3) {
                        File fileM1095T = dq1Var.m1095T(hg2Var);
                        fg2 fg2Var = hg2Var.f4002a;
                        String str = hg2Var.f4003b;
                        if (!fileM1095T.isDirectory()) {
                            throw new FileNotFoundException("Directory does not exist: ".concat(str));
                        }
                        dq1.m1072C(dq1Var.m1096U(fg2Var), fileM1095T, true);
                        File[] fileArrListFiles = fileM1095T.listFiles();
                        if (fileArrListFiles != null) {
                            List<File> listM3103r0 = AbstractC0460mg.m3103r0(fileArrListFiles, new sl0(20));
                            ArrayList arrayList = new ArrayList(AbstractC0179eu.m1421B(listM3103r0, 10));
                            for (File file : listM3103r0) {
                                if (Files.isSymbolicLink(file.toPath())) {
                                    c80.m678v("Symbolic links are not supported in script storage.");
                                } else {
                                    String name = str.length() == 0 ? file.getName() : str + "/" + file.getName();
                                    name.getClass();
                                    arrayList.add(dq1Var.m1098W(new hg2(fg2Var, name), file));
                                }
                            }
                            return arrayList;
                        }
                        c80.m678v("Unable to list directory.");
                    } else {
                        c80.m675s();
                    }
                } else {
                    if (i2 == 1) {
                        fg1.m1627T(obj);
                        return obj;
                    }
                    C0676s.m4653l("call to 'resume' before 'invoke' with coroutine");
                }
                return null;
            case 1:
                vn1 vn1Var = (vn1) dq1Var.f2147i;
                int i3 = this.f7673m;
                if (i3 == 0) {
                    fg1.m1627T(obj);
                    int iOrdinal2 = hg2Var.f4002a.ordinal();
                    if (iOrdinal2 == 0) {
                        this.f7673m = 1;
                        Object objM1091O = dq1Var.m1091O(hg2Var, this);
                        return objM1091O == k20Var ? k20Var : objM1091O;
                    }
                    if (iOrdinal2 == 1 || iOrdinal2 == 2 || iOrdinal2 == 3) {
                        File fileM1095T2 = dq1Var.m1095T(hg2Var);
                        if (!fileM1095T2.isFile()) {
                            throw new FileNotFoundException("File does not exist: ".concat(hg2Var.f4003b));
                        }
                        long length = fileM1095T2.length();
                        ((df2) vn1Var.f12033d).f2023a.getClass();
                        if (length <= 16777216) {
                            BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(fileM1095T2), 8192);
                            try {
                                ((df2) vn1Var.f12033d).f2023a.getClass();
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
                                    pp0.m3916n(bufferedInputStream, th);
                                    throw th2;
                                }
                            }
                        } else {
                            c80.m672p("QUOTA_EXCEEDED", "File exceeds the read limit.", 0, null, null, 28);
                        }
                    } else {
                        c80.m675s();
                    }
                } else {
                    if (i3 == 1) {
                        fg1.m1627T(obj);
                        return obj;
                    }
                    C0676s.m4653l("call to 'resume' before 'invoke' with coroutine");
                }
                return null;
            default:
                int i5 = this.f7673m;
                if (i5 == 0) {
                    fg1.m1627T(obj);
                    int iOrdinal3 = hg2Var.f4002a.ordinal();
                    if (iOrdinal3 == 0) {
                        this.f7673m = 1;
                        Object objM1087K = dq1Var.m1087K(hg2Var, this);
                        return objM1087K == k20Var ? k20Var : objM1087K;
                    }
                    if (iOrdinal3 == 1 || iOrdinal3 == 2 || iOrdinal3 == 3) {
                        return dq1Var.m1098W(hg2Var, dq1Var.m1095T(hg2Var));
                    }
                    c80.m675s();
                } else {
                    if (i5 == 1) {
                        fg1.m1627T(obj);
                        return obj;
                    }
                    C0676s.m4653l("call to 'resume' before 'invoke' with coroutine");
                }
                return null;
        }
    }
}
