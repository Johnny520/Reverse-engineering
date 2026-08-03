package p295u4;

import p000a.AbstractC0000a;
import p136j8.C2104o;
import p311v4.C4451c0;

/* JADX INFO: renamed from: u4.t */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C4270t {

    /* JADX INFO: renamed from: d */
    public static final C4270t f14180d = new C4270t(null, -1, -1);

    /* JADX INFO: renamed from: a */
    public final C4451c0 f14181a;

    /* JADX INFO: renamed from: b */
    public final int f14182b;

    /* JADX INFO: renamed from: c */
    public final int f14183c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C4270t(C4451c0 c4451c0, int i9, int i10) {
        if (i9 < -1) {
            C2104o.m5294t("address < -1");
            throw null;
        }
        if (i10 < -1) {
            C2104o.m5294t("line < -1");
            throw null;
        }
        this.f14181a = c4451c0;
        this.f14182b = i9;
        this.f14183c = i10;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0018, code lost:
    
        r5 = r5.f14181a;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean equals(Object obj) {
        Object obj2;
        C4451c0 c4451c0;
        if (!(obj instanceof C4270t)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        C4270t c4270t = (C4270t) obj;
        return this.f14182b == c4270t.f14182b && this.f14183c == c4270t.f14183c && ((c4451c0 = this.f14181a) == obj2 || (c4451c0 != null && c4451c0.equals(obj2)));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f14181a.f14760g.hashCode() + this.f14182b + this.f14183c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb2 = new StringBuilder(50);
        C4451c0 c4451c0 = this.f14181a;
        if (c4451c0 != null) {
            sb2.append(c4451c0.mo4901a());
            sb2.append(":");
        }
        int i9 = this.f14183c;
        if (i9 >= 0) {
            sb2.append(i9);
        }
        sb2.append('@');
        int i10 = this.f14182b;
        if (i10 < 0) {
            sb2.append("????");
        } else {
            sb2.append(AbstractC0000a.m46X0(i10));
        }
        return sb2.toString();
    }
}
