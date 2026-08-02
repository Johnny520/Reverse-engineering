package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class s32 {

    /* JADX INFO: renamed from: c */
    public static final s32 f9897c = new s32(0.0f, new C0748tt(0.0f));

    /* JADX INFO: renamed from: a */
    public final float f9898a;

    /* JADX INFO: renamed from: b */
    public final C0748tt f9899b;

    public s32(float f, C0748tt c0748tt) {
        this.f9898a = f;
        this.f9899b = c0748tt;
        if (Float.isNaN(f)) {
            C0676s.m4651j("current must not be NaN");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s32)) {
            return false;
        }
        s32 s32Var = (s32) obj;
        return this.f9898a == s32Var.f9898a && this.f9899b.equals(s32Var.f9899b);
    }

    public final int hashCode() {
        return (this.f9899b.hashCode() + (Float.hashCode(this.f9898a) * 31)) * 31;
    }

    public final String toString() {
        return "ProgressBarRangeInfo(current=" + this.f9898a + ", range=" + this.f9899b + ", steps=0)";
    }
}
