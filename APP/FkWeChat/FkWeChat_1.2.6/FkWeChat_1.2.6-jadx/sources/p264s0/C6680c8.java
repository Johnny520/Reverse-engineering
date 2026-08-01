package p264s0;

import p024b9.AbstractC1043k;
import p024b9.AbstractC1061t;
import p249r0.C6439b;
import p265s1.C7128q1;

/* JADX INFO: renamed from: s0.c8 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C6680c8 {

    /* JADX INFO: renamed from: a */
    public final long f21002a;

    /* JADX INFO: renamed from: b */
    public final C6439b f21003b;

    public /* synthetic */ C6680c8(long j10, C6439b c6439b, int i10, AbstractC1043k abstractC1043k) {
        this((i10 & 1) != 0 ? C7128q1.f23644b.m28147h() : j10, (i10 & 2) != 0 ? null : c6439b, null);
    }

    /* JADX INFO: renamed from: a */
    public final long m26478a() {
        return this.f21002a;
    }

    /* JADX INFO: renamed from: b */
    public final C6439b m26479b() {
        return this.f21003b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6680c8)) {
            return false;
        }
        C6680c8 c6680c8 = (C6680c8) obj;
        return C7128q1.m28131q(this.f21002a, c6680c8.f21002a) && AbstractC1061t.m3842c(this.f21003b, c6680c8.f21003b);
    }

    public int hashCode() {
        int iM28137w = C7128q1.m28137w(this.f21002a) * 31;
        C6439b c6439b = this.f21003b;
        return iM28137w + (c6439b != null ? c6439b.hashCode() : 0);
    }

    public String toString() {
        return "RippleConfiguration(color=" + ((Object) C7128q1.m28138x(this.f21002a)) + ", rippleAlpha=" + this.f21003b + ')';
    }

    public C6680c8(long j10, C6439b c6439b) {
        this.f21002a = j10;
        this.f21003b = c6439b;
    }

    public /* synthetic */ C6680c8(long j10, C6439b c6439b, AbstractC1043k abstractC1043k) {
        this(j10, c6439b);
    }
}
