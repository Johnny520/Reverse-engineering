package p211o9;

import p068eh.AbstractC0921a;
import p085fg.InterfaceC1220a;

/* JADX INFO: renamed from: o9.m */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3100m {

    /* JADX INFO: renamed from: a */
    public final String f10009a;

    /* JADX INFO: renamed from: b */
    public final long f10010b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC1220a f10011c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3100m(String str, long j3, InterfaceC1220a interfaceC1220a) {
        this.f10009a = str;
        this.f10010b = j3;
        this.f10011c = interfaceC1220a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3100m)) {
            return false;
        }
        C3100m c3100m = (C3100m) obj;
        return this.f10009a.equals(c3100m.f10009a) && this.f10010b == c3100m.f10010b && this.f10011c.equals(c3100m.f10011c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f10011c.hashCode() + AbstractC0921a.m2243f(this.f10009a.hashCode() * 31, 31, this.f10010b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sbM2259v = AbstractC0921a.m2259v("ReplyTask(type=", this.f10009a, ", delayMs=", this.f10010b);
        sbM2259v.append(", action=");
        sbM2259v.append(this.f10011c);
        sbM2259v.append(")");
        return sbM2259v.toString();
    }
}
