package p332wb;

import gg.AbstractC1416l;
import p222p.AbstractC3199a;
import p243q9.C3471g;

/* JADX INFO: renamed from: wb.k4 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C5032k4 extends AbstractC5065l4 {

    /* JADX INFO: renamed from: a */
    public final int f18302a;

    /* JADX INFO: renamed from: b */
    public final C3471g f18303b;

    /* JADX INFO: renamed from: c */
    public final boolean f18304c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C5032k4(int i9, C3471g c3471g, boolean z9) {
        c3471g.getClass();
        this.f18302a = i9;
        this.f18303b = c3471g;
        this.f18304c = z9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5032k4)) {
            return false;
        }
        C5032k4 c5032k4 = (C5032k4) obj;
        return this.f18302a == c5032k4.f18302a && AbstractC1416l.m3825a(this.f18303b, c5032k4.f18303b) && this.f18304c == c5032k4.f18304c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Boolean.hashCode(this.f18304c) + ((this.f18303b.hashCode() + (Integer.hashCode(this.f18302a) * 31)) * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TemplateEditor(index=");
        sb2.append(this.f18302a);
        sb2.append(", template=");
        sb2.append(this.f18303b);
        sb2.append(", canDelete=");
        return AbstractC3199a.m6840m(")", sb2, this.f18304c);
    }
}
