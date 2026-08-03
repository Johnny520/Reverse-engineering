package p366ya;

import p068eh.AbstractC0921a;

/* JADX INFO: renamed from: ya.f */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C6016f {

    /* JADX INFO: renamed from: a */
    public final float f24439a;

    /* JADX INFO: renamed from: b */
    public final float f24440b;

    /* JADX INFO: renamed from: c */
    public final float f24441c;

    /* JADX INFO: renamed from: d */
    public final float f24442d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C6016f(float f3, float f10, float f11, float f12) {
        this.f24439a = f3;
        this.f24440b = f10;
        this.f24441c = f11;
        this.f24442d = f12;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final boolean m10775a(float f3, float f10) {
        return f3 >= this.f24439a && f3 <= this.f24441c && f10 >= this.f24440b && f10 <= this.f24442d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6016f)) {
            return false;
        }
        C6016f c6016f = (C6016f) obj;
        return Float.compare(this.f24439a, c6016f.f24439a) == 0 && Float.compare(this.f24440b, c6016f.f24440b) == 0 && Float.compare(this.f24441c, c6016f.f24441c) == 0 && Float.compare(this.f24442d, c6016f.f24442d) == 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Float.hashCode(this.f24442d) + AbstractC0921a.m2241d(this.f24441c, AbstractC0921a.m2241d(this.f24440b, Float.hashCode(this.f24439a) * 31, 31), 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "ScreenRect(left=" + this.f24439a + ", top=" + this.f24440b + ", right=" + this.f24441c + ", bottom=" + this.f24442d + ")";
    }
}
