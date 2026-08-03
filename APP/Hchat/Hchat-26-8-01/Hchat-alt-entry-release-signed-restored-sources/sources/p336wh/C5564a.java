package p336wh;

import p068eh.AbstractC0921a;

/* JADX INFO: renamed from: wh.a */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C5564a {

    /* JADX INFO: renamed from: e */
    public static final C5564a f22664e = new C5564a(0.0f, 0.0f, 0.0f, 0.0f);

    /* JADX INFO: renamed from: a */
    public final float f22665a;

    /* JADX INFO: renamed from: b */
    public final float f22666b;

    /* JADX INFO: renamed from: c */
    public final float f22667c;

    /* JADX INFO: renamed from: d */
    public final float f22668d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C5564a(float f3, float f10, float f11, float f12) {
        this.f22665a = f3;
        this.f22666b = f10;
        this.f22667c = f11;
        this.f22668d = f12;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5564a)) {
            return false;
        }
        C5564a c5564a = (C5564a) obj;
        return Float.compare(this.f22665a, c5564a.f22665a) == 0 && Float.compare(this.f22666b, c5564a.f22666b) == 0 && Float.compare(this.f22667c, c5564a.f22667c) == 0 && Float.compare(this.f22668d, c5564a.f22668d) == 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Float.hashCode(this.f22668d) + AbstractC0921a.m2241d(this.f22667c, AbstractC0921a.m2241d(this.f22666b, Float.hashCode(this.f22665a) * 31, 31), 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "DeviceTilt(pitch=" + this.f22665a + ", roll=" + this.f22666b + ", gravityX=" + this.f22667c + ", gravityY=" + this.f22668d + ")";
    }
}
