package p264s0;

import p024b9.AbstractC1043k;
import p121i3.C3185o;
import p121i3.C3187q;
import p121i3.EnumC3191u;
import p180m3.InterfaceC4960u;
import p264s0.AbstractC6925rd;

/* JADX INFO: renamed from: s0.ce */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C6686ce implements InterfaceC4960u {

    /* JADX INFO: renamed from: a */
    public final int f21089a;

    /* JADX INFO: renamed from: b */
    public final int f21090b;

    public C6686ce(int i10, int i11) {
        this.f21089a = i10;
        this.f21090b = i11;
    }

    @Override // p180m3.InterfaceC4960u
    /* JADX INFO: renamed from: a */
    public long mo8891a(C3187q c3187q, long j10, EnumC3191u enumC3191u, long j11) {
        int i10 = this.f21089a;
        AbstractC6925rd.a aVar = AbstractC6925rd.f22693a;
        return AbstractC6925rd.m27488h(i10, aVar.m27492d()) ? m26582f(c3187q, j11) : AbstractC6925rd.m27488h(i10, aVar.m27493e()) ? m26583g(c3187q, j11, j10) : AbstractC6925rd.m27488h(i10, aVar.m27489a()) ? m26578b(c3187q, j11, j10) : AbstractC6925rd.m27488h(i10, aVar.m27490b()) ? m26579c(c3187q, j11, j10) : AbstractC6925rd.m27488h(i10, aVar.m27494f()) ? m26584h(enumC3191u, c3187q, j11, j10) : AbstractC6925rd.m27488h(i10, aVar.m27491c()) ? m26580d(enumC3191u, c3187q, j11, j10) : m26578b(c3187q, j11, j10);
    }

    /* JADX INFO: renamed from: b */
    public final long m26578b(C3187q c3187q, long j10, long j11) {
        int i10 = (int) (j10 >> 32);
        int iM12068g = c3187q.m12068g() + ((c3187q.m12073l() - i10) / 2);
        if (iM12068g < 0) {
            iM12068g = c3187q.m12068g();
        } else if (iM12068g + i10 > ((int) (j11 >> 32))) {
            iM12068g = c3187q.m12069h() - i10;
        }
        int iM12071j = (c3187q.m12071j() - ((int) (j10 & 4294967295L))) - this.f21090b;
        if (iM12071j < 0) {
            iM12071j = c3187q.m12065d() + this.f21090b;
        }
        return C3185o.m12044d((((long) iM12068g) << 32) | (((long) iM12071j) & 4294967295L));
    }

    /* JADX INFO: renamed from: c */
    public final long m26579c(C3187q c3187q, long j10, long j11) {
        int i10 = (int) (j10 >> 32);
        int iM12068g = c3187q.m12068g() + ((c3187q.m12073l() - i10) / 2);
        if (iM12068g < 0) {
            iM12068g = c3187q.m12068g();
        } else if (iM12068g + i10 > ((int) (j11 >> 32))) {
            iM12068g = c3187q.m12069h() - i10;
        }
        int iM12065d = c3187q.m12065d() + this.f21090b;
        int i11 = (int) (j10 & 4294967295L);
        if (iM12065d + i11 > ((int) (j11 & 4294967295L))) {
            iM12065d = (c3187q.m12071j() - i11) - this.f21090b;
        }
        return C3185o.m12044d((((long) iM12068g) << 32) | (((long) iM12065d) & 4294967295L));
    }

    /* JADX INFO: renamed from: d */
    public final long m26580d(EnumC3191u enumC3191u, C3187q c3187q, long j10, long j11) {
        return enumC3191u == EnumC3191u.f8484q ? m26583g(c3187q, j10, j11) : m26582f(c3187q, j10);
    }

    /* JADX INFO: renamed from: e */
    public final int m26581e() {
        return this.f21089a;
    }

    /* JADX INFO: renamed from: f */
    public final long m26582f(C3187q c3187q, long j10) {
        int iM12068g = c3187q.m12068g() - (((int) (j10 >> 32)) + this.f21090b);
        if (iM12068g < 0) {
            iM12068g = c3187q.m12069h() + this.f21090b;
        }
        return C3185o.m12044d((((long) iM12068g) << 32) | (((long) (((c3187q.m12071j() + c3187q.m12065d()) - ((int) (j10 & 4294967295L))) / 2)) & 4294967295L));
    }

    /* JADX INFO: renamed from: g */
    public final long m26583g(C3187q c3187q, long j10, long j11) {
        int iM12069h = c3187q.m12069h() + this.f21090b;
        int i10 = (int) (j10 >> 32);
        if (iM12069h + i10 > ((int) (j11 >> 32))) {
            iM12069h = c3187q.m12068g() - (i10 + this.f21090b);
        }
        return C3185o.m12044d((((long) iM12069h) << 32) | (((long) (((c3187q.m12071j() + c3187q.m12065d()) - ((int) (j10 & 4294967295L))) / 2)) & 4294967295L));
    }

    /* JADX INFO: renamed from: h */
    public final long m26584h(EnumC3191u enumC3191u, C3187q c3187q, long j10, long j11) {
        return enumC3191u == EnumC3191u.f8484q ? m26582f(c3187q, j10) : m26583g(c3187q, j10, j11);
    }

    public /* synthetic */ C6686ce(int i10, int i11, AbstractC1043k abstractC1043k) {
        this(i10, i11);
    }
}
