package p007a6;

import p024b9.AbstractC1061t;
import p038ce.InterfaceC1519a;

/* JADX INFO: renamed from: a6.a */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C0070a {

    /* JADX INFO: renamed from: a */
    public final String f139a;

    /* JADX INFO: renamed from: b */
    public final int f140b;

    /* JADX INFO: renamed from: c */
    public final int f141c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC1519a f142d;

    public C0070a(String str, int i10, int i11, InterfaceC1519a interfaceC1519a) {
        str.getClass();
        this.f139a = str;
        this.f140b = i10;
        this.f141c = i11;
        this.f142d = interfaceC1519a;
    }

    /* JADX INFO: renamed from: a */
    public final int m227a() {
        return this.f141c;
    }

    /* JADX INFO: renamed from: b */
    public final InterfaceC1519a m228b() {
        return this.f142d;
    }

    /* JADX INFO: renamed from: c */
    public final int m229c() {
        return this.f140b;
    }

    /* JADX INFO: renamed from: d */
    public final String m230d() {
        return this.f139a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0070a)) {
            return false;
        }
        C0070a c0070a = (C0070a) obj;
        return AbstractC1061t.m3842c(this.f139a, c0070a.f139a) && this.f140b == c0070a.f140b && this.f141c == c0070a.f141c && AbstractC1061t.m3842c(this.f142d, c0070a.f142d);
    }

    public int hashCode() {
        int iHashCode = ((((this.f139a.hashCode() * 31) + Integer.hashCode(this.f140b)) * 31) + Integer.hashCode(this.f141c)) * 31;
        InterfaceC1519a interfaceC1519a = this.f142d;
        return iHashCode + (interfaceC1519a == null ? 0 : interfaceC1519a.hashCode());
    }

    public String toString() {
        return "BlockImageRange(url=" + this.f139a + ", start=" + this.f140b + ", end=" + this.f141c + ", imageNode=" + this.f142d + ")";
    }
}
