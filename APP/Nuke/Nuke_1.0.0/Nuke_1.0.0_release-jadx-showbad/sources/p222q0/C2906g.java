package p222q0;

import p011B4.AbstractC0231b;

/* JADX INFO: renamed from: q0.g */
/* JADX INFO: loaded from: classes.dex */
public final class C2906g extends AbstractC2902c {

    /* JADX INFO: renamed from: b */
    public final float f9191b;

    /* JADX INFO: renamed from: c */
    public final float f9192c;

    /* JADX INFO: renamed from: d */
    public final int f9193d;

    /* JADX INFO: renamed from: e */
    public final int f9194e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2906g(float f2, float f5, int i5, int i6, int i7) {
        f5 = (i7 & 2) != 0 ? 4.0f : f5;
        i5 = (i7 & 4) != 0 ? 0 : i5;
        i6 = (i7 & 8) != 0 ? 0 : i6;
        this.f9191b = f2;
        this.f9192c = f5;
        this.f9193d = i5;
        this.f9194e = i6;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2906g)) {
            return false;
        }
        C2906g c2906g = (C2906g) obj;
        return this.f9191b == c2906g.f9191b && this.f9192c == c2906g.f9192c && this.f9193d == c2906g.f9193d && this.f9194e == c2906g.f9194e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return AbstractC0231b.m391b(this.f9194e, AbstractC0231b.m391b(this.f9193d, AbstractC0231b.m390a(this.f9192c, Float.hashCode(this.f9191b) * 31, 31), 31), 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb = new StringBuilder("Stroke(width=");
        sb.append(this.f9191b);
        sb.append(", miter=");
        sb.append(this.f9192c);
        sb.append(", cap=");
        String str = "Unknown";
        int i5 = this.f9193d;
        sb.append((Object) (i5 == 0 ? "Butt" : i5 == 1 ? "Round" : i5 == 2 ? "Square" : "Unknown"));
        sb.append(", join=");
        int i6 = this.f9194e;
        if (i6 == 0) {
            str = "Miter";
        } else if (i6 == 1) {
            str = "Round";
        } else if (i6 == 2) {
            str = "Bevel";
        }
        sb.append((Object) str);
        sb.append(", pathEffect=null)");
        return sb.toString();
    }
}
