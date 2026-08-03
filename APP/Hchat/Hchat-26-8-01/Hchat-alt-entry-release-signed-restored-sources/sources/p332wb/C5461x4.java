package p332wb;

import gg.AbstractC1416l;
import p119i2.C1926g;

/* JADX INFO: renamed from: wb.x4 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C5461x4 {

    /* JADX INFO: renamed from: a */
    public final C1926g f21848a;

    /* JADX INFO: renamed from: b */
    public final C5493y4 f21849b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C5461x4(C1926g c1926g, C5493y4 c5493y4) {
        c5493y4.getClass();
        this.f21848a = c1926g;
        this.f21849b = c5493y4;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5461x4)) {
            return false;
        }
        C5461x4 c5461x4 = (C5461x4) obj;
        return this.f21848a.equals(c5461x4.f21848a) && AbstractC1416l.m3825a(this.f21849b, c5461x4.f21849b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Boolean.hashCode(this.f21849b.f22071a) + (this.f21848a.hashCode() * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "MarkdownInlineResult(text=" + ((Object) this.f21848a) + ", state=" + this.f21849b + ")";
    }
}
