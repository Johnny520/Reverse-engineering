package p332wb;

import gg.AbstractC1416l;
import p211o9.C3104q;
import p222p.AbstractC3199a;

/* JADX INFO: renamed from: wb.c4 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C4771c4 {

    /* JADX INFO: renamed from: a */
    public final int f16187a;

    /* JADX INFO: renamed from: b */
    public final C3104q f16188b;

    /* JADX INFO: renamed from: c */
    public final boolean f16189c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C4771c4(int i9, C3104q c3104q, boolean z9) {
        c3104q.getClass();
        this.f16187a = i9;
        this.f16188b = c3104q;
        this.f16189c = z9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4771c4)) {
            return false;
        }
        C4771c4 c4771c4 = (C4771c4) obj;
        return this.f16187a == c4771c4.f16187a && AbstractC1416l.m3825a(this.f16188b, c4771c4.f16188b) && this.f16189c == c4771c4.f16189c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Boolean.hashCode(this.f16189c) + ((this.f16188b.hashCode() + (Integer.hashCode(this.f16187a) * 31)) * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("GroupLeaveTemplateEditorRequest(index=");
        sb2.append(this.f16187a);
        sb2.append(", template=");
        sb2.append(this.f16188b);
        sb2.append(", canDelete=");
        return AbstractC3199a.m6840m(")", sb2, this.f16189c);
    }
}
