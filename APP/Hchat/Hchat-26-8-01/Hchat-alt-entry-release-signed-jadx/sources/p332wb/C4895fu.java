package p332wb;

import p025bc.AbstractC0255e;

/* JADX INFO: renamed from: wb.fu */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C4895fu {

    /* JADX INFO: renamed from: a */
    public final String f17307a;

    /* JADX INFO: renamed from: b */
    public final String f17308b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C4895fu(String str, String str2) {
        this.f17307a = str;
        this.f17308b = str2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4895fu)) {
            return false;
        }
        C4895fu c4895fu = (C4895fu) obj;
        return this.f17307a.equals(c4895fu.f17307a) && this.f17308b.equals(c4895fu.f17308b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f17308b.hashCode() + (this.f17307a.hashCode() * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return AbstractC0255e.m1022k("TemplateVariable(token=", this.f17307a, ", label=", this.f17308b, ")");
    }
}
