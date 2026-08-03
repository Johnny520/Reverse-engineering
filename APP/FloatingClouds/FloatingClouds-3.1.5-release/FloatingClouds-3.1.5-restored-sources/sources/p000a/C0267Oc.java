package p000a;

/* JADX INFO: renamed from: a.Oc */
/* JADX INFO: loaded from: classes.dex */
public class C0267Oc extends C0726n9 {
    /* JADX INFO: renamed from: C */
    public static int m748C(int i, int i2, int i3) {
        if (i2 <= i3) {
            return i < i2 ? i2 : i > i3 ? i3 : i;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + i3 + " is less than minimum " + i2 + '.');
    }

    /* JADX INFO: renamed from: D */
    public static C0574f9 m749D(int i, int i2) {
        if (i2 > Integer.MIN_VALUE) {
            return new C0574f9(i, i2 - 1, 1);
        }
        C0574f9 c0574f9 = C0574f9.f2136d;
        return C0574f9.f2136d;
    }
}
