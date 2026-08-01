package p077f6;

import p024b9.AbstractC1043k;
import p265s1.C7128q1;

/* JADX INFO: renamed from: f6.e */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C2306e implements InterfaceC2339y {

    /* JADX INFO: renamed from: a */
    public final long f6306a;

    /* JADX INFO: renamed from: b */
    public final long f6307b;

    /* JADX INFO: renamed from: c */
    public final long f6308c;

    /* JADX INFO: renamed from: d */
    public final long f6309d;

    /* JADX INFO: renamed from: e */
    public final long f6310e;

    public C2306e(long j10, long j11, long j12, long j13, long j14) {
        this.f6306a = j10;
        this.f6307b = j11;
        this.f6308c = j12;
        this.f6309d = j13;
        this.f6310e = j14;
    }

    @Override // p077f6.InterfaceC2339y
    /* JADX INFO: renamed from: a */
    public long mo8432a() {
        return this.f6308c;
    }

    @Override // p077f6.InterfaceC2339y
    /* JADX INFO: renamed from: b */
    public long mo8433b() {
        return this.f6310e;
    }

    @Override // p077f6.InterfaceC2339y
    /* JADX INFO: renamed from: c */
    public long mo8434c() {
        return this.f6306a;
    }

    @Override // p077f6.InterfaceC2339y
    /* JADX INFO: renamed from: d */
    public long mo8435d() {
        return this.f6309d;
    }

    @Override // p077f6.InterfaceC2339y
    /* JADX INFO: renamed from: e */
    public long mo8436e() {
        return this.f6307b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2306e)) {
            return false;
        }
        C2306e c2306e = (C2306e) obj;
        return C7128q1.m28131q(this.f6306a, c2306e.f6306a) && C7128q1.m28131q(this.f6307b, c2306e.f6307b) && C7128q1.m28131q(this.f6308c, c2306e.f6308c) && C7128q1.m28131q(this.f6309d, c2306e.f6309d) && C7128q1.m28131q(this.f6310e, c2306e.f6310e);
    }

    public int hashCode() {
        return (((((((C7128q1.m28137w(this.f6306a) * 31) + C7128q1.m28137w(this.f6307b)) * 31) + C7128q1.m28137w(this.f6308c)) * 31) + C7128q1.m28137w(this.f6309d)) * 31) + C7128q1.m28137w(this.f6310e);
    }

    public String toString() {
        return "DefaultMarkdownColors(text=" + C7128q1.m28138x(this.f6306a) + ", codeBackground=" + C7128q1.m28138x(this.f6307b) + ", inlineCodeBackground=" + C7128q1.m28138x(this.f6308c) + ", dividerColor=" + C7128q1.m28138x(this.f6309d) + ", tableBackground=" + C7128q1.m28138x(this.f6310e) + ")";
    }

    public /* synthetic */ C2306e(long j10, long j11, long j12, long j13, long j14, AbstractC1043k abstractC1043k) {
        this(j10, j11, j12, j13, j14);
    }
}
