package p280t2;

import p068eh.AbstractC0921a;

/* JADX INFO: renamed from: t2.i */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C4093i {

    /* JADX INFO: renamed from: d */
    public static final C4093i f13550d = new C4093i(C4090f.f13545c, 17, 0);

    /* JADX INFO: renamed from: a */
    public final float f13551a;

    /* JADX INFO: renamed from: b */
    public final int f13552b;

    /* JADX INFO: renamed from: c */
    public final int f13553c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C4093i(float f3, int i9, int i10) {
        this.f13551a = f3;
        this.f13552b = i9;
        this.f13553c = i10;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4093i)) {
            return false;
        }
        C4093i c4093i = (C4093i) obj;
        float f3 = c4093i.f13551a;
        float f10 = C4090f.f13544b;
        return Float.compare(this.f13551a, f3) == 0 && this.f13552b == c4093i.f13552b && this.f13553c == c4093i.f13553c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        float f3 = C4090f.f13544b;
        return Integer.hashCode(this.f13553c) + AbstractC0921a.m2242e(this.f13552b, Float.hashCode(this.f13551a) * 31, 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("LineHeightStyle(alignment=");
        sb2.append((Object) C4090f.m8273b(this.f13551a));
        sb2.append(", trim=");
        String str = "Invalid";
        int i9 = this.f13552b;
        sb2.append((Object) (i9 == 1 ? "LineHeightStyle.Trim.FirstLineTop" : i9 == 16 ? "LineHeightStyle.Trim.LastLineBottom" : i9 == 17 ? "LineHeightStyle.Trim.Both" : i9 == 0 ? "LineHeightStyle.Trim.None" : "Invalid"));
        sb2.append(",mode=");
        int i10 = this.f13553c;
        if (i10 == 0) {
            str = "LineHeightStyle.Mode.Fixed";
        } else if (i10 == 1) {
            str = "LineHeightStyle.Mode.Minimum";
        } else if (i10 == 2) {
            str = "LineHeightStyle.Mode.Tight";
        }
        sb2.append((Object) str);
        sb2.append(')');
        return sb2.toString();
    }
}
