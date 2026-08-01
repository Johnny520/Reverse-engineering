package p198m0;

/* JADX INFO: renamed from: m0.f */
/* JADX INFO: loaded from: classes.dex */
public final class C2575f {

    /* JADX INFO: renamed from: a */
    public final int f8210a;

    /* JADX INFO: renamed from: a */
    public static String m4520a(int i5) {
        return i5 == 1 ? "Next" : i5 == 2 ? "Previous" : i5 == 3 ? "Left" : i5 == 4 ? "Right" : i5 == 5 ? "Up" : i5 == 6 ? "Down" : i5 == 7 ? "Enter" : i5 == 8 ? "Exit" : "Invalid FocusDirection";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C2575f) {
            return this.f8210a == ((C2575f) obj).f8210a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f8210a);
    }

    public final String toString() {
        return m4520a(this.f8210a);
    }
}
