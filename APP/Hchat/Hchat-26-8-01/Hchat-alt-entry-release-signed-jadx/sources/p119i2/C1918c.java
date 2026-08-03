package p119i2;

import gg.AbstractC1416l;
import okhttp3.HttpUrl;
import p068eh.AbstractC0921a;
import p204o2.AbstractC3042a;

/* JADX INFO: renamed from: i2.c */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1918c {

    /* JADX INFO: renamed from: a */
    public final Object f6464a;

    /* JADX INFO: renamed from: b */
    public final int f6465b;

    /* JADX INFO: renamed from: c */
    public int f6466c;

    /* JADX INFO: renamed from: d */
    public final String f6467d;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000f: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (8 int) A[WRAPPED] (LINE:7)) != (0 int)) ? (wrap:??:0x000a: SGET  A[WRAPPED] (LINE:11) okhttp3.HttpUrl.FRAGMENT_ENCODE_SET java.lang.String) : ("md_link"))
  (r3v0 int)
  (wrap:int:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (4 int) A[WRAPPED] (LINE:1)) != (0 int)) ? (Integer.MIN_VALUE int) : (r4v0 int))
  (r2v0 i2.b)
 A[MD:(java.lang.String, int, int, java.lang.Object):void (m)] (LINE:16) call: i2.c.<init>(java.lang.String, int, int, java.lang.Object):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C1918c(InterfaceC1916b interfaceC1916b, int i9, int i10, int i11) {
        this((i11 & 8) != 0 ? HttpUrl.FRAGMENT_ENCODE_SET : "md_link", i9, (i11 & 4) != 0 ? Integer.MIN_VALUE : i10, interfaceC1916b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final C1922e m4773a(int i9) {
        int i10 = this.f6466c;
        if (i10 != Integer.MIN_VALUE) {
            i9 = i10;
        }
        if (!(i9 != Integer.MIN_VALUE)) {
            AbstractC3042a.m6487b("Item.end should be set first");
        }
        return new C1922e(this.f6467d, this.f6465b, i9, this.f6464a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1918c)) {
            return false;
        }
        C1918c c1918c = (C1918c) obj;
        return AbstractC1416l.m3825a(this.f6464a, c1918c.f6464a) && this.f6465b == c1918c.f6465b && this.f6466c == c1918c.f6466c && AbstractC1416l.m3825a(this.f6467d, c1918c.f6467d);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        Object obj = this.f6464a;
        return this.f6467d.hashCode() + AbstractC0921a.m2242e(this.f6466c, AbstractC0921a.m2242e(this.f6465b, (obj == null ? 0 : obj.hashCode()) * 31, 31), 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("MutableRange(item=");
        sb2.append(this.f6464a);
        sb2.append(", start=");
        sb2.append(this.f6465b);
        sb2.append(", end=");
        sb2.append(this.f6466c);
        sb2.append(", tag=");
        return AbstractC0921a.m2254q(sb2, this.f6467d, ')');
    }

    public C1918c(String str, int i9, int i10, Object obj) {
        this.f6464a = obj;
        this.f6465b = i9;
        this.f6466c = i10;
        this.f6467d = str;
    }
}
