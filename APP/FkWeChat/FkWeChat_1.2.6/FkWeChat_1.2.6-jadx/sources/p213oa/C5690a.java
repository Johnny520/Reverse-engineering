package p213oa;

import p024b9.AbstractC1043k;
import p024b9.AbstractC1061t;
import p299ub.AbstractC8611a0;

/* JADX INFO: renamed from: oa.a */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5690a {

    /* JADX INFO: renamed from: f */
    public static final a f17886f = new a(null);

    /* JADX INFO: renamed from: g */
    public static final C5695f f17887g;

    /* JADX INFO: renamed from: h */
    public static final C5692c f17888h;

    /* JADX INFO: renamed from: a */
    public final C5692c f17889a;

    /* JADX INFO: renamed from: b */
    public final C5692c f17890b;

    /* JADX INFO: renamed from: c */
    public final C5695f f17891c;

    /* JADX INFO: renamed from: d */
    public final C5691b f17892d;

    /* JADX INFO: renamed from: e */
    public final C5692c f17893e;

    static {
        C5695f c5695f = C5697h.f17927m;
        f17887g = c5695f;
        f17888h = C5692c.f17898c.m23003a(c5695f);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C5690a(C5692c c5692c, C5695f c5695f) {
        this(c5692c, null, c5695f, null, null);
        c5692c.getClass();
        c5695f.getClass();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5690a)) {
            return false;
        }
        C5690a c5690a = (C5690a) obj;
        return AbstractC1061t.m3842c(this.f17889a, c5690a.f17889a) && AbstractC1061t.m3842c(this.f17890b, c5690a.f17890b) && AbstractC1061t.m3842c(this.f17891c, c5690a.f17891c);
    }

    public int hashCode() {
        int iHashCode = (527 + this.f17889a.hashCode()) * 31;
        C5692c c5692c = this.f17890b;
        return ((iHashCode + (c5692c != null ? c5692c.hashCode() : 0)) * 31) + this.f17891c.hashCode();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(AbstractC8611a0.m33068M(this.f17889a.m22994a(), '.', '/', false, 4, null));
        sb2.append("/");
        C5692c c5692c = this.f17890b;
        if (c5692c != null) {
            sb2.append(c5692c);
            sb2.append(".");
        }
        sb2.append(this.f17891c);
        return sb2.toString();
    }

    /* JADX INFO: renamed from: oa.a$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {
        public /* synthetic */ a(AbstractC1043k abstractC1043k) {
            this();
        }

        public a() {
        }
    }

    public C5690a(C5692c c5692c, C5692c c5692c2, C5695f c5695f, C5691b c5691b, C5692c c5692c3) {
        this.f17889a = c5692c;
        this.f17890b = c5692c2;
        this.f17891c = c5695f;
        this.f17892d = c5691b;
        this.f17893e = c5692c3;
    }
}
