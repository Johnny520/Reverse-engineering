package p189n;

import p024b9.AbstractC1043k;
import p024b9.AbstractC1061t;
import p265s1.AbstractC7138s1;
import p265s1.C7128q1;
import p274t.AbstractC7872n2;
import p274t.InterfaceC7887q2;

/* JADX INFO: renamed from: n.e2 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C5210e2 {

    /* JADX INFO: renamed from: a */
    public final long f16008a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC7887q2 f16009b;

    public /* synthetic */ C5210e2(long j10, InterfaceC7887q2 interfaceC7887q2, int i10, AbstractC1043k abstractC1043k) {
        this((i10 & 1) != 0 ? AbstractC7138s1.m28200d(4284900966L) : j10, (i10 & 2) != 0 ? AbstractC7872n2.m30446g(0.0f, 0.0f, 3, null) : interfaceC7887q2, null);
    }

    /* JADX INFO: renamed from: a */
    public final InterfaceC7887q2 m21382a() {
        return this.f16009b;
    }

    /* JADX INFO: renamed from: b */
    public final long m21383b() {
        return this.f16008a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!AbstractC1061t.m3842c(C5210e2.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        C5210e2 c5210e2 = (C5210e2) obj;
        return C7128q1.m28131q(this.f16008a, c5210e2.f16008a) && AbstractC1061t.m3842c(this.f16009b, c5210e2.f16009b);
    }

    public int hashCode() {
        return (C7128q1.m28137w(this.f16008a) * 31) + this.f16009b.hashCode();
    }

    public String toString() {
        return "OverscrollConfiguration(glowColor=" + ((Object) C7128q1.m28138x(this.f16008a)) + ", drawPadding=" + this.f16009b + ')';
    }

    public C5210e2(long j10, InterfaceC7887q2 interfaceC7887q2) {
        this.f16008a = j10;
        this.f16009b = interfaceC7887q2;
    }

    public /* synthetic */ C5210e2(long j10, InterfaceC7887q2 interfaceC7887q2, AbstractC1043k abstractC1043k) {
        this(j10, interfaceC7887q2);
    }
}
