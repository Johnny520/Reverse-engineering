package p147d1;

/* JADX INFO: renamed from: d1.m */
/* JADX INFO: loaded from: classes.dex */
public final class C1963m {

    /* JADX INFO: renamed from: a */
    public final int f6644a;

    /* JADX INFO: renamed from: a */
    public static String m3627a(int i5) {
        return i5 == 1 ? "Ltr" : i5 == 2 ? "Rtl" : i5 == 3 ? "Content" : i5 == 4 ? "ContentOrLtr" : i5 == 5 ? "ContentOrRtl" : i5 == 0 ? "Unspecified" : "Invalid";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C1963m) {
            return this.f6644a == ((C1963m) obj).f6644a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f6644a);
    }

    public final String toString() {
        return m3627a(this.f6644a);
    }
}
