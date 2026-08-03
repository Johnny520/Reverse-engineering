package p332wb;

import gg.AbstractC1416l;
import p036c9.C0414a;

/* JADX INFO: renamed from: wb.z0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C5521z0 extends AbstractC4702a1 {

    /* JADX INFO: renamed from: a */
    public final C0414a f22309a;

    /* JADX INFO: renamed from: b */
    public final boolean f22310b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C5521z0(C0414a c0414a, boolean z9) {
        c0414a.getClass();
        this.f22309a = c0414a;
        this.f22310b = z9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5521z0)) {
            return false;
        }
        C5521z0 c5521z0 = (C5521z0) obj;
        return AbstractC1416l.m3825a(this.f22309a, c5521z0.f22309a) && this.f22310b == c5521z0.f22310b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Boolean.hashCode(this.f22310b) + (this.f22309a.hashCode() * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "ParentPicker(group=" + this.f22309a + ", existing=" + this.f22310b + ")";
    }
}
