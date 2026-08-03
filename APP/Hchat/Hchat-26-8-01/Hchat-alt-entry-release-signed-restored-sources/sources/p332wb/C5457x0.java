package p332wb;

import gg.AbstractC1416l;
import p036c9.C0414a;

/* JADX INFO: renamed from: wb.x0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C5457x0 extends AbstractC4702a1 {

    /* JADX INFO: renamed from: a */
    public final C0414a f21842a;

    /* JADX INFO: renamed from: b */
    public final boolean f21843b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C5457x0(C0414a c0414a, boolean z9) {
        c0414a.getClass();
        this.f21842a = c0414a;
        this.f21843b = z9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5457x0)) {
            return false;
        }
        C5457x0 c5457x0 = (C5457x0) obj;
        return AbstractC1416l.m3825a(this.f21842a, c5457x0.f21842a) && this.f21843b == c5457x0.f21843b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Boolean.hashCode(this.f21843b) + (this.f21842a.hashCode() * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "Editor(group=" + this.f21842a + ", existing=" + this.f21843b + ")";
    }
}
