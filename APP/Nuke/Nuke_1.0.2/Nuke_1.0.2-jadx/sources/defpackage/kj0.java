package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class kj0 extends vj1 implements t23 {
    public final Object[] i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public kj0(int i) {
        super(i != 0);
        try {
            this.i = new Object[i];
        } catch (NegativeArraySizeException unused) {
            s.j("size < 0");
            throw null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.t23
    public String b() {
        String name = getClass().getName();
        return g(name.substring(name.lastIndexOf(46) + 1).concat("{"), "}", true);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object e(int i) {
        try {
            Object obj = this.i[i];
            if (obj != null) {
                return obj;
            }
            throw new NullPointerException("unset: " + i);
        } catch (ArrayIndexOutOfBoundsException unused) {
            if (i < 0) {
                s.d("n < 0");
                return null;
            }
            s.d("n >= size()");
            return null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.i, ((kj0) obj).i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void f(int i, Object obj) {
        d();
        try {
            this.i[i] = obj;
        } catch (ArrayIndexOutOfBoundsException unused) {
            if (i < 0) {
                s.d("n < 0");
            } else {
                s.d("n >= size()");
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String g(String str, String str2, boolean z) {
        Object[] objArr = this.i;
        int length = objArr.length;
        StringBuilder sb = new StringBuilder((length * 10) + 10);
        sb.append(str);
        for (int i = 0; i < length; i++) {
            if (i != 0) {
                sb.append(", ");
            }
            if (z) {
                sb.append(((t23) objArr[i]).b());
            } else {
                sb.append(objArr[i]);
            }
        }
        if (str2 != null) {
            sb.append(str2);
        }
        return sb.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public o43 getType(int i) {
        return (o43) e(i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Arrays.hashCode(this.i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        String name = getClass().getName();
        return g(name.substring(name.lastIndexOf(46) + 1).concat("{"), "}", false);
    }
}
