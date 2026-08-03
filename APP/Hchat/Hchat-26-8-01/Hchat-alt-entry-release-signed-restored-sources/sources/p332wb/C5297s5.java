package p332wb;

import java.util.ArrayList;
import java.util.List;
import p136j8.AbstractC2091b;
import p222p.AbstractC3199a;

/* JADX INFO: renamed from: wb.s5 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C5297s5 {

    /* JADX INFO: renamed from: a */
    public final ArrayList f20569a;

    /* JADX INFO: renamed from: b */
    public final List f20570b;

    /* JADX INFO: renamed from: c */
    public final boolean f20571c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C5297s5(ArrayList arrayList, List list, boolean z9) {
        this.f20569a = arrayList;
        this.f20570b = list;
        this.f20571c = z9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5297s5)) {
            return false;
        }
        C5297s5 c5297s5 = (C5297s5) obj;
        return this.f20569a.equals(c5297s5.f20569a) && this.f20570b.equals(c5297s5.f20570b) && this.f20571c == c5297s5.f20571c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Boolean.hashCode(this.f20571c) + AbstractC2091b.m5158e(this.f20570b, this.f20569a.hashCode() * 31, 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("MessageBlockInitialState(templates=");
        sb2.append(this.f20569a);
        sb2.append(", bindings=");
        sb2.append(this.f20570b);
        sb2.append(", shouldPersist=");
        return AbstractC3199a.m6840m(")", sb2, this.f20571c);
    }
}
