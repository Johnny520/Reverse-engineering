package p077f6;

import ee.InterfaceC2215a;
import me.C5165d;
import p024b9.AbstractC1061t;

/* JADX INFO: renamed from: f6.n */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C2324n {

    /* JADX INFO: renamed from: a */
    public final String f6364a;

    /* JADX INFO: renamed from: b */
    public final boolean f6365b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC2215a f6366c;

    /* JADX INFO: renamed from: d */
    public final C5165d f6367d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC2327o0 f6368e;

    /* JADX INFO: renamed from: f */
    public final boolean f6369f;

    public C2324n(String str, boolean z10, InterfaceC2215a interfaceC2215a, C5165d c5165d, InterfaceC2327o0 interfaceC2327o0, boolean z11) {
        str.getClass();
        interfaceC2215a.getClass();
        c5165d.getClass();
        interfaceC2327o0.getClass();
        this.f6364a = str;
        this.f6365b = z10;
        this.f6366c = interfaceC2215a;
        this.f6367d = c5165d;
        this.f6368e = interfaceC2327o0;
        this.f6369f = z11;
    }

    /* JADX INFO: renamed from: a */
    public final String m8482a() {
        return this.f6364a;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m8483b() {
        return this.f6365b;
    }

    /* JADX INFO: renamed from: c */
    public final C5165d m8484c() {
        return this.f6367d;
    }

    /* JADX INFO: renamed from: d */
    public final InterfaceC2327o0 m8485d() {
        return this.f6368e;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m8486e() {
        return this.f6369f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C2324n.class != obj.getClass()) {
            return false;
        }
        C2324n c2324n = (C2324n) obj;
        return this.f6365b == c2324n.f6365b && AbstractC1061t.m3842c(this.f6364a, c2324n.f6364a) && AbstractC1061t.m3842c(this.f6366c, c2324n.f6366c) && AbstractC1061t.m3842c(this.f6367d, c2324n.f6367d) && AbstractC1061t.m3842c(this.f6368e, c2324n.f6368e) && this.f6369f == c2324n.f6369f;
    }

    public int hashCode() {
        return (((((((((Boolean.hashCode(this.f6365b) * 31) + this.f6364a.hashCode()) * 31) + this.f6366c.hashCode()) * 31) + this.f6367d.hashCode()) * 31) + this.f6368e.hashCode()) * 31) + Boolean.hashCode(this.f6369f);
    }

    public String toString() {
        return "Input(content=" + this.f6364a + ", lookupLinks=" + this.f6365b + ", flavour=" + this.f6366c + ", parser=" + this.f6367d + ", referenceLinkHandler=" + this.f6368e + ", retainState=" + this.f6369f + ")";
    }
}
