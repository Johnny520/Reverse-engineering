package p000;

import android.graphics.BlendModeColorFilter;

/* JADX INFO: renamed from: ja */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class C0348ja {

    /* JADX INFO: renamed from: a */
    public final BlendModeColorFilter f2775a;

    /* JADX INFO: renamed from: b */
    public final long f2776b;

    /* JADX INFO: renamed from: c */
    public final int f2777c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0348ja(int i, long j) {
        this.f2775a = new BlendModeColorFilter(p30.m2987W(j), o30.m2758B(i));
        this.f2776b = j;
        this.f2777c = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0348ja)) {
            return false;
        }
        C0348ja c0348ja = (C0348ja) obj;
        return C0207ff.m1094c(this.f2776b, c0348ja.f2776b) && this.f2777c == c0348ja.f2777c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        int i = C0207ff.f1708h;
        return Integer.hashCode(this.f2777c) + (Long.hashCode(this.f2776b) * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb = new StringBuilder("BlendModeColorFilter(color=");
        AbstractC0748t1.m4158p(this.f2776b, sb, ", blendMode=");
        sb.append((Object) o30.m2760D(this.f2777c));
        sb.append(')');
        return sb.toString();
    }
}
