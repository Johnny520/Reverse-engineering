package p065eb;

import java.util.List;

/* JADX INFO: renamed from: eb.d0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0862d0 {

    /* JADX INFO: renamed from: a */
    public final boolean f2653a;

    /* JADX INFO: renamed from: b */
    public final Object f2654b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0862d0(List list, boolean z9) {
        this.f2653a = z9;
        this.f2654b = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0862d0)) {
            return false;
        }
        C0862d0 c0862d0 = (C0862d0) obj;
        return this.f2653a == c0862d0.f2653a && this.f2654b.equals(c0862d0.f2654b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f2654b.hashCode() + (Boolean.hashCode(this.f2653a) * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "SendButtonEventResult(intercepted=" + this.f2653a + ", handledBy=" + this.f2654b + ")";
    }
}
