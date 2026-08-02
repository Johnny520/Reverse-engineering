package p000;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class kj0 extends vj1 implements t23 {

    /* JADX INFO: renamed from: i */
    public final Object[] f5590i;

    public kj0(int i) {
        super(i != 0);
        try {
            this.f5590i = new Object[i];
        } catch (NegativeArraySizeException unused) {
            C0676s.m4651j("size < 0");
            throw null;
        }
    }

    @Override // p000.t23
    /* JADX INFO: renamed from: b */
    public String mo23b() {
        String name = getClass().getName();
        return m2695g(name.substring(name.lastIndexOf(46) + 1).concat("{"), "}", true);
    }

    /* JADX INFO: renamed from: e */
    public final Object m2693e(int i) {
        try {
            Object obj = this.f5590i[i];
            if (obj != null) {
                return obj;
            }
            throw new NullPointerException("unset: " + i);
        } catch (ArrayIndexOutOfBoundsException unused) {
            if (i < 0) {
                C0676s.m4646d("n < 0");
                return null;
            }
            C0676s.m4646d("n >= size()");
            return null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f5590i, ((kj0) obj).f5590i);
    }

    /* JADX INFO: renamed from: f */
    public final void m2694f(int i, Object obj) {
        m5707d();
        try {
            this.f5590i[i] = obj;
        } catch (ArrayIndexOutOfBoundsException unused) {
            if (i < 0) {
                C0676s.m4646d("n < 0");
            } else {
                C0676s.m4646d("n >= size()");
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public final String m2695g(String str, String str2, boolean z) {
        Object[] objArr = this.f5590i;
        int length = objArr.length;
        StringBuilder sb = new StringBuilder((length * 10) + 10);
        sb.append(str);
        for (int i = 0; i < length; i++) {
            if (i != 0) {
                sb.append(", ");
            }
            if (z) {
                sb.append(((t23) objArr[i]).mo23b());
            } else {
                sb.append(objArr[i]);
            }
        }
        if (str2 != null) {
            sb.append(str2);
        }
        return sb.toString();
    }

    public o43 getType(int i) {
        return (o43) m2693e(i);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f5590i);
    }

    public final String toString() {
        String name = getClass().getName();
        return m2695g(name.substring(name.lastIndexOf(46) + 1).concat("{"), "}", false);
    }
}
