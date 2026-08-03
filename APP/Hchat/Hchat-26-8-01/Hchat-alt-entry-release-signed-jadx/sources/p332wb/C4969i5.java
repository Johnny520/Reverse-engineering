package p332wb;

import gg.AbstractC1416l;
import p010aa.C0033a;
import p222p.AbstractC3199a;

/* JADX INFO: renamed from: wb.i5 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C4969i5 {

    /* JADX INFO: renamed from: a */
    public final int f17771a;

    /* JADX INFO: renamed from: b */
    public final C0033a f17772b;

    /* JADX INFO: renamed from: c */
    public final boolean f17773c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C4969i5(int i9, C0033a c0033a, boolean z9) {
        c0033a.getClass();
        this.f17771a = i9;
        this.f17772b = c0033a;
        this.f17773c = z9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4969i5)) {
            return false;
        }
        C4969i5 c4969i5 = (C4969i5) obj;
        return this.f17771a == c4969i5.f17771a && AbstractC1416l.m3825a(this.f17772b, c4969i5.f17772b) && this.f17773c == c4969i5.f17773c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Boolean.hashCode(this.f17773c) + ((this.f17772b.hashCode() + (Integer.hashCode(this.f17771a) * 31)) * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("MessageBlockBindingEditorRequest(index=");
        sb2.append(this.f17771a);
        sb2.append(", binding=");
        sb2.append(this.f17772b);
        sb2.append(", canDelete=");
        return AbstractC3199a.m6840m(")", sb2, this.f17773c);
    }
}
