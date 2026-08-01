package p041V;

import java.math.BigDecimal;

/* JADX INFO: renamed from: V.j */
/* JADX INFO: loaded from: classes.dex */
public final class C0317j extends Number {

    /* JADX INFO: renamed from: a */
    public final String f699a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0317j(String str) {
        this.f699a = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Number
    public final double doubleValue() {
        return Double.parseDouble(this.f699a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0317j)) {
            return false;
        }
        Object obj2 = ((C0317j) obj).f699a;
        String str = this.f699a;
        return str == obj2 || str.equals(obj2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Number
    public final float floatValue() {
        return Float.parseFloat(this.f699a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f699a.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Number
    public final int intValue() {
        String str = this.f699a;
        try {
            try {
                return Integer.parseInt(str);
            } catch (NumberFormatException unused) {
                return (int) Long.parseLong(str);
            }
        } catch (NumberFormatException unused2) {
            return new BigDecimal(str).intValue();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Number
    public final long longValue() {
        String str = this.f699a;
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return new BigDecimal(str).longValue();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return this.f699a;
    }
}
