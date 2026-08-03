package p332wb;

import gg.AbstractC1416l;
import p222p.AbstractC3199a;
import ua.C4298i;

/* JADX INFO: renamed from: wb.nu */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C5157nu {

    /* JADX INFO: renamed from: a */
    public final int f19302a;

    /* JADX INFO: renamed from: b */
    public final C4298i f19303b;

    /* JADX INFO: renamed from: c */
    public final boolean f19304c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C5157nu(int i9, C4298i c4298i, boolean z9) {
        c4298i.getClass();
        this.f19302a = i9;
        this.f19303b = c4298i;
        this.f19304c = z9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5157nu)) {
            return false;
        }
        C5157nu c5157nu = (C5157nu) obj;
        return this.f19302a == c5157nu.f19302a && AbstractC1416l.m3825a(this.f19303b, c5157nu.f19303b) && this.f19304c == c5157nu.f19304c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Boolean.hashCode(this.f19304c) + ((this.f19303b.hashCode() + (Integer.hashCode(this.f19302a) * 31)) * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TransferTemplateEditorRequest(index=");
        sb2.append(this.f19302a);
        sb2.append(", template=");
        sb2.append(this.f19303b);
        sb2.append(", canDelete=");
        return AbstractC3199a.m6840m(")", sb2, this.f19304c);
    }
}
