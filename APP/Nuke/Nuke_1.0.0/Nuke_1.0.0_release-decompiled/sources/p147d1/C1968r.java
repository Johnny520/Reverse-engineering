package p147d1;

/* JADX INFO: renamed from: d1.r */
/* JADX INFO: loaded from: classes.dex */
public final class C1968r {

    /* JADX INFO: renamed from: a */
    public final int f6652a;

    public final boolean equals(Object obj) {
        if (obj instanceof C1968r) {
            return this.f6652a == ((C1968r) obj).f6652a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f6652a);
    }

    public final String toString() {
        int i5 = this.f6652a;
        return i5 == 1 ? "Linearity.Linear" : i5 == 2 ? "Linearity.FontHinting" : i5 == 3 ? "Linearity.None" : "Invalid";
    }
}
