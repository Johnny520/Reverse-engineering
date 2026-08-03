package p376z4;

import java.util.Arrays;
import okio.C3193a;
import p136j8.C2104o;
import p326w4.C4683c;

/* JADX INFO: renamed from: z4.e */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6091e extends AbstractC6096j implements InterfaceC6097k {

    /* JADX INFO: renamed from: h */
    public final Object[] f24601h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public AbstractC6091e(int i9) {
        super(i9 != 0);
        try {
            this.f24601h = new Object[i9];
        } catch (NegativeArraySizeException unused) {
            C2104o.m5294t("size < 0");
            throw null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public String mo4901a() {
        String name = getClass().getName();
        return m10842n(name.substring(name.lastIndexOf(46) + 1).concat("{"), "}", true);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f24601h, ((AbstractC6091e) obj).f24601h);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C4683c getType(int i9) {
        return (C4683c) m10840l(i9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Arrays.hashCode(this.f24601h);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l */
    public final Object m10840l(int i9) {
        try {
            Object obj = this.f24601h[i9];
            if (obj != null) {
                return obj;
            }
            throw new NullPointerException("unset: " + i9);
        } catch (ArrayIndexOutOfBoundsException unused) {
            if (i9 < 0) {
                C3193a.m6820i("n < 0");
                return null;
            }
            C3193a.m6820i("n >= size()");
            return null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: m */
    public final void m10841m(int i9, Object obj) {
        m10855j();
        try {
            this.f24601h[i9] = obj;
        } catch (ArrayIndexOutOfBoundsException unused) {
            if (i9 < 0) {
                C3193a.m6820i("n < 0");
            } else {
                C3193a.m6820i("n >= size()");
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: n */
    public final String m10842n(String str, String str2, boolean z9) {
        int length = this.f24601h.length;
        StringBuilder sb2 = new StringBuilder((length * 10) + 10);
        sb2.append(str);
        for (int i9 = 0; i9 < length; i9++) {
            if (i9 != 0) {
                sb2.append(", ");
            }
            Object[] objArr = this.f24601h;
            if (z9) {
                sb2.append(((InterfaceC6097k) objArr[i9]).mo4901a());
            } else {
                sb2.append(objArr[i9]);
            }
        }
        if (str2 != null) {
            sb2.append(str2);
        }
        return sb2.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int size() {
        return this.f24601h.length;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        String name = getClass().getName();
        return m10842n(name.substring(name.lastIndexOf(46) + 1).concat("{"), "}", false);
    }
}
