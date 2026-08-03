package p280t2;

/* JADX INFO: renamed from: t2.e */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C4089e {

    /* JADX INFO: renamed from: b */
    public static final int f13542b = 66305;

    /* JADX INFO: renamed from: a */
    public final int f13543a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static String m8271a(int i9) {
        StringBuilder sb2 = new StringBuilder("LineBreak(strategy=");
        int i10 = i9 & 255;
        String str = "Invalid";
        sb2.append((Object) (i10 == 1 ? "Strategy.Simple" : i10 == 2 ? "Strategy.HighQuality" : i10 == 3 ? "Strategy.Balanced" : i10 == 0 ? "Strategy.Unspecified" : "Invalid"));
        sb2.append(", strictness=");
        int i11 = (i9 >> 8) & 255;
        sb2.append((Object) (i11 == 1 ? "Strictness.None" : i11 == 2 ? "Strictness.Loose" : i11 == 3 ? "Strictness.Normal" : i11 == 4 ? "Strictness.Strict" : i11 == 0 ? "Strictness.Unspecified" : "Invalid"));
        sb2.append(", wordBreak=");
        int i12 = (i9 >> 16) & 255;
        if (i12 == 1) {
            str = "WordBreak.None";
        } else if (i12 == 2) {
            str = "WordBreak.Phrase";
        } else if (i12 == 0) {
            str = "WordBreak.Unspecified";
        }
        sb2.append((Object) str);
        sb2.append(')');
        return sb2.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (obj instanceof C4089e) {
            return this.f13543a == ((C4089e) obj).f13543a;
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Integer.hashCode(this.f13543a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return m8271a(this.f13543a);
    }
}
