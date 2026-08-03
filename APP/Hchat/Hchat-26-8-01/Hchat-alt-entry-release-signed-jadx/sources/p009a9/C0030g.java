package p009a9;

import gg.AbstractC1416l;
import okhttp3.HttpUrl;
import p068eh.AbstractC0921a;
import p085fg.InterfaceC1220a;
import p332wb.AbstractC4855en;
import p332wb.C5538zh;

/* JADX INFO: renamed from: a9.g */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0030g {

    /* JADX INFO: renamed from: a */
    public final String f94a;

    /* JADX INFO: renamed from: b */
    public final int f95b;

    /* JADX INFO: renamed from: c */
    public final int f96c;

    /* JADX INFO: renamed from: d */
    public final int f97d;

    /* JADX INFO: renamed from: e */
    public final int f98e;

    /* JADX INFO: renamed from: f */
    public final InterfaceC1220a f99f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0030g(String str, int i9, int i10, int i11, int i12, C5538zh c5538zh) {
        this.f94a = str;
        this.f95b = i9;
        this.f96c = i10;
        this.f97d = i11;
        this.f98e = i12;
        this.f99f = c5538zh;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0030g)) {
            return false;
        }
        C0030g c0030g = (C0030g) obj;
        return AbstractC1416l.m3825a(this.f94a, c0030g.f94a) && this.f95b == c0030g.f95b && this.f96c == c0030g.f96c && this.f97d == c0030g.f97d && this.f98e == c0030g.f98e && AbstractC1416l.m3825a(this.f99f, c0030g.f99f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        int iM2242e = AbstractC0921a.m2242e(this.f98e, AbstractC0921a.m2242e(this.f97d, AbstractC0921a.m2242e(this.f96c, AbstractC0921a.m2242e(this.f95b, this.f94a.hashCode() * 31, 31), 31), 31), 31);
        InterfaceC1220a interfaceC1220a = this.f99f;
        return iM2242e + (interfaceC1220a == null ? 0 : interfaceC1220a.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TitleState(text=");
        sb2.append((Object) this.f94a);
        sb2.append(", bgStart=");
        sb2.append(this.f95b);
        sb2.append(", bgEnd=");
        AbstractC4855en.m9272p(sb2, this.f96c, ", textStart=", this.f97d, ", textEnd=");
        sb2.append(this.f98e);
        sb2.append(", onClick=");
        sb2.append(this.f99f);
        sb2.append(")");
        return sb2.toString();
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0008: CONSTRUCTOR 
  (wrap:java.lang.String:SGET  A[WRAPPED] okhttp3.HttpUrl.FRAGMENT_ENCODE_SET java.lang.String)
  (0 int)
  (0 int)
  (0 int)
  (0 int)
  (null wb.zh)
 A[MD:(java.lang.String, int, int, int, int, wb.zh):void (m)] (LINE:17) call: a9.g.<init>(java.lang.String, int, int, int, int, wb.zh):void type: THIS */
    public /* synthetic */ C0030g() {
        this(HttpUrl.FRAGMENT_ENCODE_SET, 0, 0, 0, 0, null);
    }
}
