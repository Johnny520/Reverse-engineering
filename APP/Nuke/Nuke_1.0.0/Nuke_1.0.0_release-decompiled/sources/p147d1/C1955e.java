package p147d1;

/* JADX INFO: renamed from: d1.e */
/* JADX INFO: loaded from: classes.dex */
public final class C1955e {

    /* JADX INFO: renamed from: b */
    public static final int f6624b = 66305;

    /* JADX INFO: renamed from: a */
    public final int f6625a;

    /* JADX INFO: renamed from: a */
    public static String m3623a(int i5) {
        StringBuilder sb = new StringBuilder("LineBreak(strategy=");
        int i6 = i5 & 255;
        String str = "Invalid";
        sb.append((Object) (i6 == 1 ? "Strategy.Simple" : i6 == 2 ? "Strategy.HighQuality" : i6 == 3 ? "Strategy.Balanced" : i6 == 0 ? "Strategy.Unspecified" : "Invalid"));
        sb.append(", strictness=");
        int i7 = (i5 >> 8) & 255;
        sb.append((Object) (i7 == 1 ? "Strictness.None" : i7 == 2 ? "Strictness.Loose" : i7 == 3 ? "Strictness.Normal" : i7 == 4 ? "Strictness.Strict" : i7 == 0 ? "Strictness.Unspecified" : "Invalid"));
        sb.append(", wordBreak=");
        int i8 = (i5 >> 16) & 255;
        if (i8 == 1) {
            str = "WordBreak.None";
        } else if (i8 == 2) {
            str = "WordBreak.Phrase";
        } else if (i8 == 0) {
            str = "WordBreak.Unspecified";
        }
        sb.append((Object) str);
        sb.append(')');
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C1955e) {
            return this.f6625a == ((C1955e) obj).f6625a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f6625a);
    }

    public final String toString() {
        return m3623a(this.f6625a);
    }
}
