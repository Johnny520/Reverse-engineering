package defpackage;

import java.io.EOFException;
import java.lang.reflect.Method;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class dx1 extends op0 {
    public final Method h;
    public final int i;
    public final String j;
    public final sn k;
    public final boolean l;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public dx1(Method method, int i, String str, boolean z) {
        sn snVar = sn.i;
        this.h = method;
        this.i = i;
        Objects.requireNonNull(str, "name == null");
        this.j = str;
        this.k = snVar;
        this.l = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00f4  */
    @Override // defpackage.op0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void j(r82 r82Var, Object obj) throws EOFException {
        String strU;
        String strReplace;
        String str = this.j;
        if (obj == null) {
            throw xe1.a0(this.h, this.i, vi0.j("Path parameter \"", str, "\" value must not be null."), new Object[0]);
        }
        this.k.getClass();
        String string = obj.toString();
        if (r82Var.c == null) {
            throw new AssertionError();
        }
        int length = string.length();
        int iCharCount = 0;
        while (iCharCount < length) {
            int iCodePointAt = string.codePointAt(iCharCount);
            boolean z = this.l;
            int i = 47;
            int i2 = -1;
            int i3 = 127;
            int i4 = 32;
            if (iCodePointAt < 32 || iCodePointAt >= 127 || " \"<>^`{}|\\?#".indexOf(iCodePointAt) != -1 || (!z && (iCodePointAt == 47 || iCodePointAt == 37))) {
                fn fnVar = new fn();
                fnVar.K(string, 0, iCharCount);
                fn fnVar2 = null;
                while (iCharCount < length) {
                    int iCodePointAt2 = string.codePointAt(iCharCount);
                    if (!z || (iCodePointAt2 != 9 && iCodePointAt2 != 10 && iCodePointAt2 != 12 && iCodePointAt2 != 13)) {
                        if (iCodePointAt2 < i4 || iCodePointAt2 >= i3 || " \"<>^`{}|\\?#".indexOf(iCodePointAt2) != i2 || (!z && (iCodePointAt2 == i || iCodePointAt2 == 37))) {
                            if (fnVar2 == null) {
                                fnVar2 = new fn();
                            }
                            fnVar2.L(iCodePointAt2);
                            long j = fnVar2.i;
                            long j2 = 0;
                            while (j2 < j) {
                                byte bO = fnVar2.o(j2);
                                fnVar.E(37);
                                char[] cArr = r82.l;
                                fnVar.E(cArr[((bO & 255) >> 4) & 15]);
                                fnVar.E(cArr[bO & 15]);
                                j2++;
                                fnVar2 = fnVar2;
                            }
                            fnVar2.g();
                        } else {
                            fnVar.L(iCodePointAt2);
                        }
                    }
                    iCharCount += Character.charCount(iCodePointAt2);
                    i = 47;
                    i2 = -1;
                    i3 = 127;
                    i4 = 32;
                }
                strU = fnVar.u();
                strReplace = r82Var.c.replace("{" + str + "}", strU);
                if (r82.m.matcher(strReplace).matches()) {
                    r82Var.c = strReplace;
                    return;
                } else {
                    s.j("@Path parameters shouldn't perform path traversal ('.' or '..'): ".concat(string));
                    return;
                }
            }
            iCharCount += Character.charCount(iCodePointAt);
        }
        strU = string;
        strReplace = r82Var.c.replace("{" + str + "}", strU);
        if (r82.m.matcher(strReplace).matches()) {
        }
    }
}
