package p148k;

import p024b9.AbstractC1043k;
import p024b9.AbstractC1061t;
import p163l.InterfaceC4303h0;
import p265s1.C7130q3;

/* JADX INFO: renamed from: k.f0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C3875f0 {

    /* JADX INFO: renamed from: a */
    public final float f11119a;

    /* JADX INFO: renamed from: b */
    public final long f11120b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC4303h0 f11121c;

    public C3875f0(float f10, long j10, InterfaceC4303h0 interfaceC4303h0) {
        this.f11119a = f10;
        this.f11120b = j10;
        this.f11121c = interfaceC4303h0;
    }

    /* JADX INFO: renamed from: a */
    public final InterfaceC4303h0 m15350a() {
        return this.f11121c;
    }

    /* JADX INFO: renamed from: b */
    public final float m15351b() {
        return this.f11119a;
    }

    /* JADX INFO: renamed from: c */
    public final long m15352c() {
        return this.f11120b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3875f0)) {
            return false;
        }
        C3875f0 c3875f0 = (C3875f0) obj;
        return Float.compare(this.f11119a, c3875f0.f11119a) == 0 && C7130q3.m28162e(this.f11120b, c3875f0.f11120b) && AbstractC1061t.m3842c(this.f11121c, c3875f0.f11121c);
    }

    public int hashCode() {
        return (((Float.hashCode(this.f11119a) * 31) + C7130q3.m28165h(this.f11120b)) * 31) + this.f11121c.hashCode();
    }

    public String toString() {
        return "Scale(scale=" + this.f11119a + ", transformOrigin=" + ((Object) C7130q3.m28166i(this.f11120b)) + ", animationSpec=" + this.f11121c + ')';
    }

    public /* synthetic */ C3875f0(float f10, long j10, InterfaceC4303h0 interfaceC4303h0, AbstractC1043k abstractC1043k) {
        this(f10, j10, interfaceC4303h0);
    }
}
