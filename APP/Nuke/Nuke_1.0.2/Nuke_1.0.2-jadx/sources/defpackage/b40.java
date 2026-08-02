package defpackage;

import java.io.IOException;
import java.io.StringWriter;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class b40 extends kj0 {
    public final int j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public b40(int i, int i2) {
        super(i);
        this.j = i2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int h() {
        int length = this.i.length;
        if (length == 0) {
            return 0;
        }
        a40 a40Var = (a40) e(length - 1);
        return a40Var.b() + a40Var.e();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void i(yn ynVar) {
        int i = ynVar.c;
        int length = this.i.length;
        if (ynVar.d()) {
            for (int i2 = 0; i2 < length; i2++) {
                a40 a40Var = (a40) e(i2);
                int iB = a40Var.b() * 2;
                String string = null;
                if (iB != 0) {
                    int i3 = ynVar.f;
                    int i4 = ynVar.e - ((i3 / 2) + ((i3 * 2) + 8));
                    String strG = a40Var.g();
                    if (strG != null) {
                        String str = "  " + a40Var.f() + ": ";
                        int length2 = str.length();
                        int length3 = i4 == 0 ? strG.length() : i4 - length2;
                        StringWriter stringWriter = new StringWriter((str.length() + strG.length()) * 3);
                        qb2 qb2Var = new qb2(stringWriter, length2, length3, "");
                        Object obj = qb2Var.g;
                        Object obj2 = qb2Var.f;
                        try {
                            ((hy0) obj2).write(str);
                            ((hy0) obj).write(strG);
                            StringBuffer stringBuffer = (StringBuffer) qb2Var.e;
                            StringBuffer stringBuffer2 = (StringBuffer) qb2Var.d;
                            hy0 hy0Var = (hy0) obj;
                            hy0 hy0Var2 = (hy0) obj2;
                            try {
                                qb2.b(stringBuffer2, hy0Var2);
                                qb2.b(stringBuffer, hy0Var);
                                qb2Var.o();
                                qb2.b(stringBuffer2, hy0Var2);
                                while (stringBuffer2.length() != 0) {
                                    hy0Var.write(10);
                                    qb2Var.o();
                                }
                                qb2.b(stringBuffer, hy0Var);
                                while (stringBuffer.length() != 0) {
                                    hy0Var2.write(10);
                                    qb2Var.o();
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
                    ynVar.c(string, iB);
                } else if (iB != 0) {
                    ynVar.c("", iB);
                }
            }
        }
        for (int i5 = 0; i5 < length; i5++) {
            a40 a40Var2 = (a40) e(i5);
            try {
                a40Var2.l(ynVar);
            } catch (RuntimeException e3) {
                throw sg0.a(e3, "...while writing " + a40Var2);
            }
        }
        int i6 = (ynVar.c - i) / 2;
        if (i6 == h()) {
            return;
        }
        throw new RuntimeException("write length mismatch; expected " + h() + " but actually wrote " + i6);
    }
}
