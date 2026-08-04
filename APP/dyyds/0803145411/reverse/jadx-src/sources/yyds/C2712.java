package yyds;

/* JADX INFO: renamed from: yyds.ᲈᛷᲈᛲ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C2712 implements Comparable {

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final String f13330;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final int f13331;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public final String f13332;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final int f13333;

    public C2712(int i, int i2, String str, String str2) {
        this.f13331 = i;
        this.f13333 = i2;
        this.f13330 = str;
        this.f13332 = str2;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C2712 c2712 = (C2712) obj;
        int i = this.f13331 - c2712.f13331;
        return i == 0 ? this.f13333 - c2712.f13333 : i;
    }
}
