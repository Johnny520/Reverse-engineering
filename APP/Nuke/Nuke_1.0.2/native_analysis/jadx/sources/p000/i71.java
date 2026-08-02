package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class i71 extends Number {

    /* JADX INFO: renamed from: h */
    public final String f4470h;

    public i71(String str) {
        this.f4470h = str;
    }

    @Override // java.lang.Number
    public final double doubleValue() {
        return Double.parseDouble(this.f4470h);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof i71) {
            return this.f4470h.equals(((i71) obj).f4470h);
        }
        return false;
    }

    @Override // java.lang.Number
    public final float floatValue() {
        return Float.parseFloat(this.f4470h);
    }

    public final int hashCode() {
        return this.f4470h.hashCode();
    }

    @Override // java.lang.Number
    public final int intValue() {
        String str = this.f4470h;
        try {
            try {
                return Integer.parseInt(str);
            } catch (NumberFormatException unused) {
                return (int) Long.parseLong(str);
            }
        } catch (NumberFormatException unused2) {
            return up0.m5525D(str).intValue();
        }
    }

    @Override // java.lang.Number
    public final long longValue() {
        String str = this.f4470h;
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return up0.m5525D(str).longValue();
        }
    }

    public final String toString() {
        return this.f4470h;
    }
}
