package p000a;

/* JADX INFO: renamed from: a.R7 */
/* JADX INFO: loaded from: classes.dex */
public class C0315R7 extends AbstractC0077E2 implements InterfaceC0298Q7, InterfaceC0745o9, InterfaceC0280P7 {

    /* JADX INFO: renamed from: g */
    public final int f1129g;

    /* JADX INFO: renamed from: h */
    public final int f1130h;

    public C0315R7(int i, Object obj, Class cls, String str, String str2) {
        super(obj, cls, str, str2, false);
        this.f1129g = i;
        this.f1130h = 0;
    }

    @Override // p000a.InterfaceC0298Q7
    /* JADX INFO: renamed from: b */
    public final int mo145b() {
        return this.f1129g;
    }

    /* JADX INFO: renamed from: d */
    public final InterfaceC0745o9 m858d() {
        C0356Tc.f1350a.getClass();
        return this;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C0315R7) {
            C0315R7 c0315r7 = (C0315R7) obj;
            return this.f253d.equals(c0315r7.f253d) && this.f254e.equals(c0315r7.f254e) && this.f1130h == c0315r7.f1130h && this.f1129g == c0315r7.f1129g && C0631i9.m1478a(this.f251b, c0315r7.f251b) && C0631i9.m1478a(m205c(), c0315r7.m205c());
        }
        if (!(obj instanceof C0315R7)) {
            return false;
        }
        InterfaceC0745o9 interfaceC0745o9 = this.f250a;
        if (interfaceC0745o9 == null) {
            m858d();
            this.f250a = this;
            interfaceC0745o9 = this;
        }
        return obj.equals(interfaceC0745o9);
    }

    public final int hashCode() {
        return this.f254e.hashCode() + C0944z.m2222b(this.f253d, m205c() == null ? 0 : m205c().hashCode() * 31, 31);
    }

    public final String toString() {
        InterfaceC0745o9 interfaceC0745o9 = this.f250a;
        if (interfaceC0745o9 == null) {
            m858d();
            this.f250a = this;
            interfaceC0745o9 = this;
        }
        if (interfaceC0745o9 != this) {
            return interfaceC0745o9.toString();
        }
        String str = this.f253d;
        return "<init>".equals(str) ? "constructor (Kotlin reflection is not available)" : C0944z.m2227g("function ", str, " (Kotlin reflection is not available)");
    }
}
