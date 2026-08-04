package yyds;

/* JADX INFO: renamed from: yyds.ᛱᲇᛴᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0234 extends Number {

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final String f1318;

    public C0234(String str) {
        this.f1318 = str;
    }

    @Override // java.lang.Number
    public final double doubleValue() {
        return Double.parseDouble(this.f1318);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0234) {
            return this.f1318.equals(((C0234) obj).f1318);
        }
        return false;
    }

    @Override // java.lang.Number
    public final float floatValue() {
        return Float.parseFloat(this.f1318);
    }

    public final int hashCode() {
        return this.f1318.hashCode();
    }

    @Override // java.lang.Number
    public final int intValue() {
        String str = this.f1318;
        try {
            try {
                return Integer.parseInt(str);
            } catch (NumberFormatException unused) {
                return (int) Long.parseLong(str);
            }
        } catch (NumberFormatException unused2) {
            return AbstractC0578.m1448(str).intValue();
        }
    }

    @Override // java.lang.Number
    public final long longValue() {
        String str = this.f1318;
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return AbstractC0578.m1448(str).longValue();
        }
    }

    public final String toString() {
        return this.f1318;
    }
}
