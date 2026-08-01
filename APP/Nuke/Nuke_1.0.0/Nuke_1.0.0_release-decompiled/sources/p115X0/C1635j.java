package p115X0;

/* JADX INFO: renamed from: X0.j */
/* JADX INFO: loaded from: classes.dex */
public final class C1635j {

    /* JADX INFO: renamed from: a */
    public final int f5624a;

    /* JADX INFO: renamed from: a */
    public static String m2937a(int i5) {
        return i5 == -1 ? "Unspecified" : i5 == 0 ? "None" : i5 == 1 ? "Default" : i5 == 2 ? "Go" : i5 == 3 ? "Search" : i5 == 4 ? "Send" : i5 == 5 ? "Previous" : i5 == 6 ? "Next" : i5 == 7 ? "Done" : "Invalid";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C1635j) {
            return this.f5624a == ((C1635j) obj).f5624a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f5624a);
    }

    public final String toString() {
        return m2937a(this.f5624a);
    }
}
