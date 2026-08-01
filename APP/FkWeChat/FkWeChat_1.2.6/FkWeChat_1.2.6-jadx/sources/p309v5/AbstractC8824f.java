package p309v5;

import java.util.Arrays;
import p376zd.C9987e;

/* JADX INFO: renamed from: v5.f */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8824f extends AbstractC8834p implements InterfaceC8837s {

    /* JADX INFO: renamed from: r */
    public Object[] f29354r;

    public AbstractC8824f(int i10) {
        super(i10 != 0);
        try {
            this.f29354r = new Object[i10];
        } catch (NegativeArraySizeException unused) {
            C9987e.m38645a("size < 0");
            throw null;
        }
    }

    /* JADX INFO: renamed from: A */
    public final Object m33883A(int i10) {
        if (i10 < 0) {
            throw new IndexOutOfBoundsException("n < 0");
        }
        throw new IndexOutOfBoundsException("n >= size()");
    }

    /* JADX INFO: renamed from: B */
    public String m33884B(String str, String str2, String str3) {
        return m33886D(str, str2, str3, true);
    }

    /* JADX INFO: renamed from: C */
    public String m33885C(String str, String str2, String str3) {
        return m33886D(str, str2, str3, false);
    }

    /* JADX INFO: renamed from: D */
    public final String m33886D(String str, String str2, String str3, boolean z10) {
        int length = this.f29354r.length;
        StringBuilder sb2 = new StringBuilder((length * 10) + 10);
        if (str != null) {
            sb2.append(str);
        }
        for (int i10 = 0; i10 < length; i10++) {
            if (i10 != 0 && str2 != null) {
                sb2.append(str2);
            }
            Object[] objArr = this.f29354r;
            if (z10) {
                sb2.append(((InterfaceC8837s) objArr[i10]).mo6828g());
            } else {
                sb2.append(objArr[i10]);
            }
        }
        if (str3 != null) {
            sb2.append(str3);
        }
        return sb2.toString();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f29354r, ((AbstractC8824f) obj).f29354r);
    }

    /* JADX INFO: renamed from: g */
    public String mo6828g() {
        String name = getClass().getName();
        return m33886D(name.substring(name.lastIndexOf(46) + 1).concat("{"), ", ", "}", true);
    }

    public int hashCode() {
        return Arrays.hashCode(this.f29354r);
    }

    public final int size() {
        return this.f29354r.length;
    }

    public String toString() {
        String name = getClass().getName();
        return m33886D(name.substring(name.lastIndexOf(46) + 1).concat("{"), ", ", "}", false);
    }

    /* JADX INFO: renamed from: w */
    public final Object m33887w(int i10) {
        try {
            Object obj = this.f29354r[i10];
            if (obj != null) {
                return obj;
            }
            throw new NullPointerException("unset: " + i10);
        } catch (ArrayIndexOutOfBoundsException unused) {
            return m33883A(i10);
        }
    }

    /* JADX INFO: renamed from: x */
    public final Object m33888x(int i10) {
        return this.f29354r[i10];
    }

    /* JADX INFO: renamed from: y */
    public final void m33889y(int i10, Object obj) {
        m33929u();
        try {
            this.f29354r[i10] = obj;
        } catch (ArrayIndexOutOfBoundsException unused) {
            m33883A(i10);
        }
    }

    /* JADX INFO: renamed from: z */
    public void mo33890z() {
        int length = this.f29354r.length;
        int i10 = 0;
        for (int i11 = 0; i11 < length; i11++) {
            if (this.f29354r[i11] != null) {
                i10++;
            }
        }
        if (length == i10) {
            return;
        }
        m33929u();
        Object[] objArr = new Object[i10];
        int i12 = 0;
        for (int i13 = 0; i13 < length; i13++) {
            Object obj = this.f29354r[i13];
            if (obj != null) {
                objArr[i12] = obj;
                i12++;
            }
        }
        this.f29354r = objArr;
        if (i10 == 0) {
            mo6829t();
        }
    }
}
