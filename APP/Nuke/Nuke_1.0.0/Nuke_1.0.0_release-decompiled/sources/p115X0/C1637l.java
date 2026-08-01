package p115X0;

/* JADX INFO: renamed from: X0.l */
/* JADX INFO: loaded from: classes.dex */
public final class C1637l {

    /* JADX INFO: renamed from: a */
    public final int f5632a;

    /* JADX INFO: renamed from: a */
    public static String m2938a(int i5) {
        return i5 == -1 ? "Unspecified" : i5 == 0 ? "None" : i5 == 1 ? "Characters" : i5 == 2 ? "Words" : i5 == 3 ? "Sentences" : "Invalid";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C1637l) {
            return this.f5632a == ((C1637l) obj).f5632a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f5632a);
    }

    public final String toString() {
        return m2938a(this.f5632a);
    }
}
