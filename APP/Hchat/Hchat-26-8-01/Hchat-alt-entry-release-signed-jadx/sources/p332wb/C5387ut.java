package p332wb;

import p080fb.C1107c;

/* JADX INFO: renamed from: wb.ut */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C5387ut {

    /* JADX INFO: renamed from: a */
    public final int f21250a;

    /* JADX INFO: renamed from: b */
    public final C1107c f21251b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C5387ut(int i9, C1107c c1107c) {
        this.f21250a = i9;
        this.f21251b = c1107c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5387ut)) {
            return false;
        }
        C5387ut c5387ut = (C5387ut) obj;
        return this.f21250a == c5387ut.f21250a && this.f21251b.equals(c5387ut.f21251b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f21251b.hashCode() + (Integer.hashCode(this.f21250a) * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "ScriptPluginAgentRenderedMessage(sourceIndex=" + this.f21250a + ", message=" + this.f21251b + ")";
    }
}
