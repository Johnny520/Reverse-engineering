package p241q7;

import p024b9.AbstractC1061t;

/* JADX INFO: renamed from: q7.b0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C6280b0 {

    /* JADX INFO: renamed from: a */
    public final String f19682a;

    /* JADX INFO: renamed from: b */
    public final EnumC6282c0 f19683b;

    public C6280b0(String str, EnumC6282c0 enumC6282c0) {
        str.getClass();
        enumC6282c0.getClass();
        this.f19682a = str;
        this.f19683b = enumC6282c0;
    }

    /* JADX INFO: renamed from: a */
    public final String m24872a() {
        return this.f19682a;
    }

    /* JADX INFO: renamed from: b */
    public final EnumC6282c0 m24873b() {
        return this.f19683b;
    }

    /* JADX INFO: renamed from: c */
    public final EnumC6282c0 m24874c() {
        return this.f19683b;
    }

    /* JADX INFO: renamed from: d */
    public final String m24875d() {
        return this.f19682a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6280b0)) {
            return false;
        }
        C6280b0 c6280b0 = (C6280b0) obj;
        return AbstractC1061t.m3842c(this.f19682a, c6280b0.f19682a) && this.f19683b == c6280b0.f19683b;
    }

    public int hashCode() {
        return (this.f19682a.hashCode() * 31) + this.f19683b.hashCode();
    }

    public String toString() {
        return "RoutingPathSegment(value=" + this.f19682a + ", kind=" + this.f19683b + ')';
    }
}
