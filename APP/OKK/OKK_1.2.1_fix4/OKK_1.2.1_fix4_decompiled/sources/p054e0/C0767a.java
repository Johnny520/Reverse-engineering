package p054e0;

import p031Q0.AbstractC0307g;

/* JADX INFO: renamed from: e0.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0767a {

    /* JADX INFO: renamed from: a */
    public final String f2719a;

    /* JADX INFO: renamed from: b */
    public final EnumC0768b f2720b;

    /* JADX INFO: renamed from: c */
    public final String f2721c;

    /* JADX INFO: renamed from: d */
    public final long f2722d;

    public C0767a(String str, EnumC0768b enumC0768b, String str2) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        AbstractC0307g.m703e(str2, "detail");
        this.f2719a = str;
        this.f2720b = enumC0768b;
        this.f2721c = str2;
        this.f2722d = jCurrentTimeMillis;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0767a)) {
            return false;
        }
        C0767a c0767a = (C0767a) obj;
        return AbstractC0307g.m699a(this.f2719a, c0767a.f2719a) && this.f2720b == c0767a.f2720b && AbstractC0307g.m699a(this.f2721c, c0767a.f2721c) && this.f2722d == c0767a.f2722d;
    }

    public final int hashCode() {
        return Long.hashCode(this.f2722d) + ((this.f2721c.hashCode() + ((this.f2720b.hashCode() + (this.f2719a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Record(name=" + this.f2719a + ", status=" + this.f2720b + ", detail=" + this.f2721c + ", atMs=" + this.f2722d + ")";
    }
}
