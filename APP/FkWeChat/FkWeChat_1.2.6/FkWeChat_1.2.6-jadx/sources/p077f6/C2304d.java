package p077f6;

import p024b9.AbstractC1043k;

/* JADX INFO: renamed from: f6.d */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C2304d implements InterfaceC2336v {

    /* JADX INFO: renamed from: a */
    public final boolean f6302a;

    /* JADX INFO: renamed from: b */
    public final boolean f6303b;

    /* JADX INFO: renamed from: c */
    public final boolean f6304c;

    /* JADX INFO: renamed from: d */
    public final long f6305d;

    public /* synthetic */ C2304d(boolean z10, boolean z11, boolean z12, long j10, int i10, AbstractC1043k abstractC1043k) {
        this((i10 & 1) != 0 ? false : z10, (i10 & 2) != 0 ? true : z11, (i10 & 4) != 0 ? false : z12, (i10 & 8) != 0 ? 2000L : j10);
    }

    @Override // p077f6.InterfaceC2336v
    /* JADX INFO: renamed from: a */
    public boolean mo8427a() {
        return this.f6303b;
    }

    @Override // p077f6.InterfaceC2336v
    /* JADX INFO: renamed from: b */
    public boolean mo8428b() {
        return this.f6302a;
    }

    /* JADX INFO: renamed from: c */
    public long m8429c() {
        return this.f6305d;
    }

    /* JADX INFO: renamed from: d */
    public boolean m8430d() {
        return this.f6304c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C2304d.class != obj.getClass()) {
            return false;
        }
        C2304d c2304d = (C2304d) obj;
        return mo8428b() == c2304d.mo8428b() && mo8427a() == c2304d.mo8427a() && m8430d() == c2304d.m8430d() && m8429c() == c2304d.m8429c();
    }

    public int hashCode() {
        return (((((Boolean.hashCode(mo8428b()) * 31) + Boolean.hashCode(mo8427a())) * 31) + Boolean.hashCode(m8430d())) * 31) + Long.hashCode(m8429c());
    }

    public C2304d(boolean z10, boolean z11, boolean z12, long j10) {
        this.f6302a = z10;
        this.f6303b = z11;
        this.f6304c = z12;
        this.f6305d = j10;
    }
}
