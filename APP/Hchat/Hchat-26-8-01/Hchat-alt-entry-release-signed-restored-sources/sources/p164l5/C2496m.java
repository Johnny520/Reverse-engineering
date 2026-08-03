package p164l5;

import androidx.lifecycle.C0119x;
import p046d6.AbstractC0707d;
import p150k5.C2270u;
import p219oh.AbstractC3165h;
import p283t5.InterfaceC4125h;
import p283t5.InterfaceC4128k;
import p312v5.InterfaceC4479b;

/* JADX INFO: renamed from: l5.m */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2496m extends AbstractC2479a0 implements InterfaceC4128k, InterfaceC4125h {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p283t5.InterfaceC4125h
    /* JADX INFO: renamed from: a */
    public final InterfaceC4479b mo5888a() {
        int i9 = this.f8117b.f3445j;
        C2270u c2270u = this.f8116a;
        return AbstractC3165h.m6762N(c2270u, i9, c2270u.f7532b.m585P(this.f8118c + 2));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p283t5.InterfaceC4128k
    /* JADX INFO: renamed from: e */
    public final int mo5887e() {
        C0119x c0119x = this.f8116a.f7532b;
        return AbstractC0707d.m1877d(((byte[]) c0119x.f310h)[this.f8118c + 1]);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p283t5.InterfaceC4124g
    /* JADX INFO: renamed from: h */
    public final int mo5885h() {
        C0119x c0119x = this.f8116a.f7532b;
        return ((byte[]) c0119x.f310h)[this.f8118c + 1] & 15;
    }
}
