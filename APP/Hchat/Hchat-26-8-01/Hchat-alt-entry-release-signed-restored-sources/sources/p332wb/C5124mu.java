package p332wb;

import gg.AbstractC1416l;
import p222p.AbstractC3199a;
import ua.C4297h;

/* JADX INFO: renamed from: wb.mu */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C5124mu {

    /* JADX INFO: renamed from: a */
    public final int f19083a;

    /* JADX INFO: renamed from: b */
    public final C4297h f19084b;

    /* JADX INFO: renamed from: c */
    public final boolean f19085c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C5124mu(int i9, C4297h c4297h, boolean z9) {
        c4297h.getClass();
        this.f19083a = i9;
        this.f19084b = c4297h;
        this.f19085c = z9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5124mu)) {
            return false;
        }
        C5124mu c5124mu = (C5124mu) obj;
        return this.f19083a == c5124mu.f19083a && AbstractC1416l.m3825a(this.f19084b, c5124mu.f19084b) && this.f19085c == c5124mu.f19085c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Boolean.hashCode(this.f19085c) + ((this.f19084b.hashCode() + (Integer.hashCode(this.f19083a) * 31)) * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TransferBindingEditorRequest(index=");
        sb2.append(this.f19083a);
        sb2.append(", binding=");
        sb2.append(this.f19084b);
        sb2.append(", canDelete=");
        return AbstractC3199a.m6840m(")", sb2, this.f19085c);
    }
}
