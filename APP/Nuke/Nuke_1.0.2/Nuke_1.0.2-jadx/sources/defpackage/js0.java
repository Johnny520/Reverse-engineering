package defpackage;

import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class js0 implements Iterable, q41 {
    public static final js0 i = new js0(new String[0]);
    public final String[] h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public js0(String[] strArr) {
        strArr.getClass();
        this.h = strArr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String a(String str) {
        String[] strArr = this.h;
        strArr.getClass();
        int length = strArr.length - 2;
        int iC = p40.C(length, 0, -2);
        if (iC > length) {
            return null;
        }
        while (!str.equalsIgnoreCase(strArr[length])) {
            if (length == iC) {
                return null;
            }
            length -= 2;
        }
        return strArr[length + 1];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String b(int i2) {
        String str = (String) mg.n0(i2 * 2, this.h);
        if (str != null) {
            return str;
        }
        throw new IndexOutOfBoundsException("name[" + i2 + ']');
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final ye0 c() {
        ye0 ye0Var = new ye0(1);
        iu.h0(ye0Var.a, this.h);
        return ye0Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String d(int i2) {
        String str = (String) mg.n0((i2 * 2) + 1, this.h);
        if (str != null) {
            return str;
        }
        throw new IndexOutOfBoundsException("value[" + i2 + ']');
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (obj instanceof js0) {
            return Arrays.equals(this.h, ((js0) obj).h);
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Arrays.hashCode(this.h);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Iterable
    public final Iterator iterator() {
        int size = size();
        ow1[] ow1VarArr = new ow1[size];
        for (int i2 = 0; i2 < size; i2++) {
            ow1VarArr[i2] = new ow1(b(i2), d(i2));
        }
        return new t2(ow1VarArr);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int size() {
        return this.h.length / 2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            String strB = b(i2);
            String strD = d(i2);
            sb.append(strB);
            sb.append(": ");
            if (ug3.j(strB)) {
                strD = "██";
            }
            sb.append(strD);
            sb.append("\n");
        }
        return sb.toString();
    }
}
