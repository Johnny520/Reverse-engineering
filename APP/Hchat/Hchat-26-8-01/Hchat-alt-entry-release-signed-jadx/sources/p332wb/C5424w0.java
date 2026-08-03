package p332wb;

import gg.AbstractC1416l;
import p036c9.C0414a;

/* JADX INFO: renamed from: wb.w0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C5424w0 extends AbstractC4702a1 {

    /* JADX INFO: renamed from: a */
    public final C0414a f21568a;

    /* JADX INFO: renamed from: b */
    public final boolean f21569b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C5424w0(C0414a c0414a, boolean z9) {
        c0414a.getClass();
        this.f21568a = c0414a;
        this.f21569b = z9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5424w0)) {
            return false;
        }
        C5424w0 c5424w0 = (C5424w0) obj;
        return AbstractC1416l.m3825a(this.f21568a, c5424w0.f21568a) && this.f21569b == c5424w0.f21569b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Boolean.hashCode(this.f21569b) + (this.f21568a.hashCode() * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "ConversationPicker(group=" + this.f21568a + ", existing=" + this.f21569b + ")";
    }
}
