package af;

import af.C0335h;
import cf.C1544j0;
import cf.C1556u;
import org.luckypray.dexkit.DexKitBridge;
import p024b9.AbstractC1043k;
import p024b9.AbstractC1061t;
import p239q5.C6264o;

/* JADX INFO: renamed from: af.m */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0340m {

    /* JADX INFO: renamed from: c */
    public static final a f973c = new a(null);

    /* JADX INFO: renamed from: a */
    public final C0335h f974a;

    /* JADX INFO: renamed from: b */
    public final EnumC0337j f975b;

    public C0340m(C0335h c0335h, EnumC0337j enumC0337j) {
        c0335h.getClass();
        enumC0337j.getClass();
        this.f974a = c0335h;
        this.f975b = enumC0337j;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0340m)) {
            return false;
        }
        C0340m c0340m = (C0340m) obj;
        return AbstractC1061t.m3842c(this.f974a, c0340m.f974a) && this.f975b == c0340m.f975b;
    }

    public int hashCode() {
        return (this.f974a.hashCode() * 31) + this.f975b.hashCode();
    }

    public String toString() {
        return "UsingFieldData(field=" + this.f974a + ", usingType=" + this.f975b + ")";
    }

    /* JADX INFO: renamed from: af.m$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {
        public /* synthetic */ a(AbstractC1043k abstractC1043k) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final C0340m m1090a(DexKitBridge dexKitBridge, C1544j0 c1544j0) {
            EnumC0337j enumC0337j;
            dexKitBridge.getClass();
            c1544j0.getClass();
            C0335h.a aVar = C0335h.f880n;
            C1556u c1556uM6086o = c1544j0.m6086o();
            c1556uM6086o.getClass();
            C0335h c0335hM1049a = aVar.m1049a(dexKitBridge, c1556uM6086o);
            byte bM6087p = c1544j0.m6087p();
            if (bM6087p == 1) {
                enumC0337j = EnumC0337j.Read;
            } else {
                if (bM6087p != 2) {
                    C6264o.m24729a("Unknown using type: ", c1544j0.m6087p());
                    return null;
                }
                enumC0337j = EnumC0337j.Write;
            }
            return new C0340m(c0335hM1049a, enumC0337j);
        }

        public a() {
        }
    }
}
