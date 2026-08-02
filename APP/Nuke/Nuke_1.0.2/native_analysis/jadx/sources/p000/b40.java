package p000;

import java.io.IOException;
import java.io.StringWriter;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class b40 extends kj0 {

    /* JADX INFO: renamed from: j */
    public final int f551j;

    public b40(int i, int i2) {
        super(i);
        this.f551j = i2;
    }

    /* JADX INFO: renamed from: h */
    public final int m395h() {
        int length = this.f5590i.length;
        if (length == 0) {
            return 0;
        }
        a40 a40Var = (a40) m2693e(length - 1);
        return a40Var.mo58b() + a40Var.m61e();
    }

    /* JADX INFO: renamed from: i */
    public final void m396i(C0929yn c0929yn) {
        int i = c0929yn.f13526c;
        int length = this.f5590i.length;
        if (c0929yn.m6293d()) {
            for (int i2 = 0; i2 < length; i2++) {
                a40 a40Var = (a40) m2693e(i2);
                int iMo58b = a40Var.mo58b() * 2;
                String string = null;
                if (iMo58b != 0) {
                    int i3 = c0929yn.f13529f;
                    int i4 = c0929yn.f13528e - ((i3 / 2) + ((i3 * 2) + 8));
                    String strMo63g = a40Var.mo63g();
                    if (strMo63g != null) {
                        String str = "  " + a40Var.m62f() + ": ";
                        int length2 = str.length();
                        int length3 = i4 == 0 ? strMo63g.length() : i4 - length2;
                        StringWriter stringWriter = new StringWriter((str.length() + strMo63g.length()) * 3);
                        qb2 qb2Var = new qb2(stringWriter, length2, length3, "");
                        Object obj = qb2Var.f8879g;
                        Object obj2 = qb2Var.f8878f;
                        try {
                            ((hy0) obj2).write(str);
                            ((hy0) obj).write(strMo63g);
                            StringBuffer stringBuffer = (StringBuffer) qb2Var.f8877e;
                            StringBuffer stringBuffer2 = (StringBuffer) qb2Var.f8876d;
                            hy0 hy0Var = (hy0) obj;
                            hy0 hy0Var2 = (hy0) obj2;
                            try {
                                qb2.m4113b(stringBuffer2, hy0Var2);
                                qb2.m4113b(stringBuffer, hy0Var);
                                qb2Var.m4127o();
                                qb2.m4113b(stringBuffer2, hy0Var2);
                                while (stringBuffer2.length() != 0) {
                                    hy0Var.write(10);
                                    qb2Var.m4127o();
                                }
                                qb2.m4113b(stringBuffer, hy0Var);
                                while (stringBuffer.length() != 0) {
                                    hy0Var2.write(10);
                                    qb2Var.m4127o();
                                }
                                string = stringWriter.toString();
                            } catch (IOException e) {
                                throw new RuntimeException(e);
                            }
                        } catch (IOException e2) {
                            throw new RuntimeException("shouldn't happen", e2);
                        }
                    }
                }
                if (string != null) {
                    c0929yn.m6292c(string, iMo58b);
                } else if (iMo58b != 0) {
                    c0929yn.m6292c("", iMo58b);
                }
            }
        }
        for (int i5 = 0; i5 < length; i5++) {
            a40 a40Var2 = (a40) m2693e(i5);
            try {
                a40Var2.mo67l(c0929yn);
            } catch (RuntimeException e3) {
                throw sg0.m4862a(e3, "...while writing " + a40Var2);
            }
        }
        int i6 = (c0929yn.f13526c - i) / 2;
        if (i6 == m395h()) {
            return;
        }
        throw new RuntimeException("write length mismatch; expected " + m395h() + " but actually wrote " + i6);
    }
}
