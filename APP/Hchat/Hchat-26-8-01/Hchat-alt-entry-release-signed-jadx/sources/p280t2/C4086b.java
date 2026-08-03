package p280t2;

import gg.AbstractC1416l;
import p068eh.AbstractC0921a;
import p071f1.AbstractC1022p0;
import p071f1.AbstractC1027s;
import p071f1.C1034w;

/* JADX INFO: renamed from: t2.b */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C4086b implements InterfaceC4099o {

    /* JADX INFO: renamed from: a */
    public final AbstractC1022p0 f13538a;

    /* JADX INFO: renamed from: b */
    public final float f13539b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C4086b(AbstractC1022p0 abstractC1022p0, float f3) {
        this.f13538a = abstractC1022p0;
        this.f13539b = f3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p280t2.InterfaceC4099o
    /* JADX INFO: renamed from: a */
    public final float mo8267a() {
        return this.f13539b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p280t2.InterfaceC4099o
    /* JADX INFO: renamed from: b */
    public final long mo8268b() {
        int i9 = C1034w.f3264h;
        return C1034w.f3263g;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p280t2.InterfaceC4099o
    /* JADX INFO: renamed from: c */
    public final AbstractC1027s mo8269c() {
        return this.f13538a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4086b)) {
            return false;
        }
        C4086b c4086b = (C4086b) obj;
        return AbstractC1416l.m3825a(this.f13538a, c4086b.f13538a) && Float.compare(this.f13539b, c4086b.f13539b) == 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Float.hashCode(this.f13539b) + (this.f13538a.hashCode() * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BrushStyle(value=");
        sb2.append(this.f13538a);
        sb2.append(", alpha=");
        return AbstractC0921a.m2252o(sb2, this.f13539b, ')');
    }
}
