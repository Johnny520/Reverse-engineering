package p000;

import java.io.EOFException;
import java.lang.reflect.Method;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class dx1 extends op0 {

    /* JADX INFO: renamed from: h */
    public final Method f2250h;

    /* JADX INFO: renamed from: i */
    public final int f2251i;

    /* JADX INFO: renamed from: j */
    public final String f2252j;

    /* JADX INFO: renamed from: k */
    public final C0700sn f2253k;

    /* JADX INFO: renamed from: l */
    public final boolean f2254l;

    public dx1(Method method, int i, String str, boolean z) {
        C0700sn c0700sn = C0700sn.f10221i;
        this.f2250h = method;
        this.f2251i = i;
        Objects.requireNonNull(str, "name == null");
        this.f2252j = str;
        this.f2253k = c0700sn;
        this.f2254l = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00f4  */
    @Override // p000.op0
    /* JADX INFO: renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo301j(r82 r82Var, Object obj) throws EOFException {
        String strM1692u;
        String strReplace;
        String str = this.f2252j;
        if (obj == null) {
            throw xe1.m6110a0(this.f2250h, this.f2251i, vi0.m5691j("Path parameter \"", str, "\" value must not be null."), new Object[0]);
        }
        this.f2253k.getClass();
        String string = obj.toString();
        if (r82Var.f9432c == null) {
            throw new AssertionError();
        }
        int length = string.length();
        int iCharCount = 0;
        while (iCharCount < length) {
            int iCodePointAt = string.codePointAt(iCharCount);
            boolean z = this.f2254l;
            int i = 47;
            int i2 = -1;
            int i3 = 127;
            int i4 = 32;
            if (iCodePointAt < 32 || iCodePointAt >= 127 || " \"<>^`{}|\\?#".indexOf(iCodePointAt) != -1 || (!z && (iCodePointAt == 47 || iCodePointAt == 37))) {
                C0209fn c0209fn = new C0209fn();
                c0209fn.m1676K(string, 0, iCharCount);
                C0209fn c0209fn2 = null;
                while (iCharCount < length) {
                    int iCodePointAt2 = string.codePointAt(iCharCount);
                    if (!z || (iCodePointAt2 != 9 && iCodePointAt2 != 10 && iCodePointAt2 != 12 && iCodePointAt2 != 13)) {
                        if (iCodePointAt2 < i4 || iCodePointAt2 >= i3 || " \"<>^`{}|\\?#".indexOf(iCodePointAt2) != i2 || (!z && (iCodePointAt2 == i || iCodePointAt2 == 37))) {
                            if (c0209fn2 == null) {
                                c0209fn2 = new C0209fn();
                            }
                            c0209fn2.m1677L(iCodePointAt2);
                            long j = c0209fn2.f3068i;
                            long j2 = 0;
                            while (j2 < j) {
                                byte bM1686o = c0209fn2.m1686o(j2);
                                c0209fn.m1670E(37);
                                char[] cArr = r82.f9428l;
                                c0209fn.m1670E(cArr[((bM1686o & 255) >> 4) & 15]);
                                c0209fn.m1670E(cArr[bM1686o & 15]);
                                j2++;
                                c0209fn2 = c0209fn2;
                            }
                            c0209fn2.m1679g();
                        } else {
                            c0209fn.m1677L(iCodePointAt2);
                        }
                    }
                    iCharCount += Character.charCount(iCodePointAt2);
                    i = 47;
                    i2 = -1;
                    i3 = 127;
                    i4 = 32;
                }
                strM1692u = c0209fn.m1692u();
                strReplace = r82Var.f9432c.replace("{" + str + "}", strM1692u);
                if (r82.f9429m.matcher(strReplace).matches()) {
                    r82Var.f9432c = strReplace;
                    return;
                } else {
                    C0676s.m4651j("@Path parameters shouldn't perform path traversal ('.' or '..'): ".concat(string));
                    return;
                }
            }
            iCharCount += Character.charCount(iCodePointAt);
        }
        strM1692u = string;
        strReplace = r82Var.f9432c.replace("{" + str + "}", strM1692u);
        if (r82.f9429m.matcher(strReplace).matches()) {
        }
    }
}
