package p224q2;

/* JADX INFO: renamed from: q2.j */
/* JADX INFO: loaded from: classes.dex */
public final class C2919j extends Number {

    /* JADX INFO: renamed from: d */
    public final String f9218d;

    public C2919j(String str) {
        this.f9218d = str;
    }

    @Override // java.lang.Number
    public final double doubleValue() {
        return Double.parseDouble(this.f9218d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2919j) {
            return this.f9218d.equals(((C2919j) obj).f9218d);
        }
        return false;
    }

    @Override // java.lang.Number
    public final float floatValue() {
        return Float.parseFloat(this.f9218d);
    }

    public final int hashCode() {
        return this.f9218d.hashCode();
    }

    @Override // java.lang.Number
    public final int intValue() {
        String str = this.f9218d;
        try {
            try {
                return Integer.parseInt(str);
            } catch (NumberFormatException unused) {
                return (int) Long.parseLong(str);
            }
        } catch (NumberFormatException unused2) {
            return AbstractC2917h.m5117i(str).intValue();
        }
    }

    @Override // java.lang.Number
    public final long longValue() {
        String str = this.f9218d;
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return AbstractC2917h.m5117i(str).longValue();
        }
    }

    public final String toString() {
        return this.f9218d;
    }
}
