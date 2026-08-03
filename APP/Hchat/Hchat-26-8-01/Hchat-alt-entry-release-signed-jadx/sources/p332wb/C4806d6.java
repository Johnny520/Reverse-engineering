package p332wb;

import gg.AbstractC1416l;
import p010aa.C0040h;
import p222p.AbstractC3199a;

/* JADX INFO: renamed from: wb.d6 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C4806d6 {

    /* JADX INFO: renamed from: a */
    public final int f16510a;

    /* JADX INFO: renamed from: b */
    public final C0040h f16511b;

    /* JADX INFO: renamed from: c */
    public final boolean f16512c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C4806d6(int i9, C0040h c0040h, boolean z9) {
        c0040h.getClass();
        this.f16510a = i9;
        this.f16511b = c0040h;
        this.f16512c = z9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4806d6)) {
            return false;
        }
        C4806d6 c4806d6 = (C4806d6) obj;
        return this.f16510a == c4806d6.f16510a && AbstractC1416l.m3825a(this.f16511b, c4806d6.f16511b) && this.f16512c == c4806d6.f16512c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Boolean.hashCode(this.f16512c) + ((this.f16511b.hashCode() + (Integer.hashCode(this.f16510a) * 31)) * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("MessageBlockTemplateEditorRequest(index=");
        sb2.append(this.f16510a);
        sb2.append(", template=");
        sb2.append(this.f16511b);
        sb2.append(", canDelete=");
        return AbstractC3199a.m6840m(")", sb2, this.f16512c);
    }
}
