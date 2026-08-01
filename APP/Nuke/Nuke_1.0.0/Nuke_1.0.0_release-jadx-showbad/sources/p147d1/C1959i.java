package p147d1;

import p011B4.AbstractC0231b;

/* JADX INFO: renamed from: d1.i */
/* JADX INFO: loaded from: classes.dex */
public final class C1959i {

    /* JADX INFO: renamed from: d */
    public static final C1959i f6632d = new C1959i(C1956f.f6627c, 17, 0);

    /* JADX INFO: renamed from: a */
    public final float f6633a;

    /* JADX INFO: renamed from: b */
    public final int f6634b;

    /* JADX INFO: renamed from: c */
    public final int f6635c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1959i(float f2, int i5, int i6) {
        this.f6633a = f2;
        this.f6634b = i5;
        this.f6635c = i6;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1959i)) {
            return false;
        }
        C1959i c1959i = (C1959i) obj;
        float f2 = c1959i.f6633a;
        float f5 = C1956f.f6626b;
        return Float.compare(this.f6633a, f2) == 0 && this.f6634b == c1959i.f6634b && this.f6635c == c1959i.f6635c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        float f2 = C1956f.f6626b;
        return Integer.hashCode(this.f6635c) + AbstractC0231b.m391b(this.f6634b, Float.hashCode(this.f6633a) * 31, 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb = new StringBuilder("LineHeightStyle(alignment=");
        sb.append((Object) C1956f.m3625b(this.f6633a));
        sb.append(", trim=");
        String str = "Invalid";
        int i5 = this.f6634b;
        sb.append((Object) (i5 == 1 ? "LineHeightStyle.Trim.FirstLineTop" : i5 == 16 ? "LineHeightStyle.Trim.LastLineBottom" : i5 == 17 ? "LineHeightStyle.Trim.Both" : i5 == 0 ? "LineHeightStyle.Trim.None" : "Invalid"));
        sb.append(",mode=");
        int i6 = this.f6635c;
        if (i6 == 0) {
            str = "LineHeightStyle.Mode.Fixed";
        } else if (i6 == 1) {
            str = "LineHeightStyle.Mode.Minimum";
        } else if (i6 == 2) {
            str = "LineHeightStyle.Mode.Tight";
        }
        sb.append((Object) str);
        sb.append(')');
        return sb.toString();
    }
}
