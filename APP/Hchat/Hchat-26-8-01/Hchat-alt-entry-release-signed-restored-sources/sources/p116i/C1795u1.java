package p116i;

import p085fg.InterfaceC1220a;
import p085fg.InterfaceC1235p;
import p109hb.C1671c;
import p117i0.AbstractC1855m;
import p117i0.InterfaceC1807a;
import p295u4.C4257g;
import p295u4.C4260j;
import p295u4.C4262l;
import p295u4.C4263m;
import p295u4.C4271u;
import p295u4.C4272v;
import p295u4.InterfaceC4258h;
import p311v4.C4466o;

/* JADX INFO: renamed from: i.u1 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1795u1 implements InterfaceC1780p1, InterfaceC1807a, InterfaceC4258h {

    /* JADX INFO: renamed from: g */
    public final int f5998g;

    /* JADX INFO: renamed from: h */
    public int f5999h;

    /* JADX INFO: renamed from: i */
    public final Object f6000i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1795u1(int i9, int i10, InterfaceC1796v interfaceC1796v) {
        this.f5998g = i9;
        this.f5999h = i10;
        this.f6000i = new C1671c((InterfaceC1805z) new C1737b0(i9, i10, interfaceC1796v));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p117i0.InterfaceC1807a
    /* JADX INFO: renamed from: c */
    public void mo4442c(int i9, Object obj) {
        ((InterfaceC1807a) this.f6000i).mo4442c(i9 + (this.f5999h == 0 ? this.f5998g : 0), obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p117i0.InterfaceC1807a
    /* JADX INFO: renamed from: d */
    public void mo4443d(Object obj) {
        this.f5999h++;
        ((InterfaceC1807a) this.f6000i).mo4443d(obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p117i0.InterfaceC1807a
    /* JADX INFO: renamed from: f */
    public void mo4444f() {
        ((InterfaceC1807a) this.f6000i).mo4444f();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p117i0.InterfaceC1807a
    /* JADX INFO: renamed from: h */
    public void mo4445h(int i9, int i10, int i11) {
        int i12 = this.f5999h == 0 ? this.f5998g : 0;
        ((InterfaceC1807a) this.f6000i).mo4445h(i9 + i12, i10 + i12, i11);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p117i0.InterfaceC1807a
    /* JADX INFO: renamed from: i */
    public void mo4446i(int i9, int i10) {
        ((InterfaceC1807a) this.f6000i).mo4446i(i9 + (this.f5999h == 0 ? this.f5998g : 0), i10);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p117i0.InterfaceC1807a
    /* JADX INFO: renamed from: k */
    public void mo4447k() {
        if (this.f5999h <= 0) {
            AbstractC1855m.m4573a("OffsetApplier up called with no corresponding down");
        }
        this.f5999h--;
        ((InterfaceC1807a) this.f6000i).mo4447k();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p295u4.InterfaceC4258h
    /* JADX INFO: renamed from: m */
    public void mo4278m(C4262l c4262l) {
        if (c4262l.f13947g.f13971a == 3) {
            int i9 = ((C4466o) c4262l.f13935k).f14817g;
            boolean[] zArr = (boolean[]) this.f6000i;
            zArr[0] = zArr[0] && (this.f5998g - this.f5999h) + i9 == c4262l.f13949i.f13965g;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p116i.InterfaceC1774n1
    /* JADX INFO: renamed from: n */
    public AbstractC1781q mo607n(long j3, AbstractC1781q abstractC1781q, AbstractC1781q abstractC1781q2, AbstractC1781q abstractC1781q3) {
        return ((C1671c) this.f6000i).mo607n(j3, abstractC1781q, abstractC1781q2, abstractC1781q3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p117i0.InterfaceC1807a
    /* JADX INFO: renamed from: p */
    public void mo4448p(int i9, Object obj) {
        ((InterfaceC1807a) this.f6000i).mo4448p(i9 + (this.f5999h == 0 ? this.f5998g : 0), obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p117i0.InterfaceC1807a
    /* JADX INFO: renamed from: r */
    public Object mo4449r() {
        return ((InterfaceC1807a) this.f6000i).mo4449r();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p116i.InterfaceC1780p1
    /* JADX INFO: renamed from: s */
    public int mo4431s() {
        return this.f5999h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p117i0.InterfaceC1807a
    /* JADX INFO: renamed from: t */
    public void mo4450t(InterfaceC1235p interfaceC1235p, Object obj) {
        ((InterfaceC1807a) this.f6000i).mo4450t(interfaceC1235p, obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p116i.InterfaceC1780p1
    /* JADX INFO: renamed from: v */
    public int mo4432v() {
        return this.f5998g;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p116i.InterfaceC1774n1
    /* JADX INFO: renamed from: w */
    public AbstractC1781q mo612w(long j3, AbstractC1781q abstractC1781q, AbstractC1781q abstractC1781q2, AbstractC1781q abstractC1781q3) {
        return ((C1671c) this.f6000i).mo612w(j3, abstractC1781q, abstractC1781q2, abstractC1781q3);
    }

    public C1795u1(int i9, int i10, InterfaceC1220a interfaceC1220a) {
        this.f5998g = i9;
        this.f5999h = i10;
        this.f6000i = interfaceC1220a;
    }

    public C1795u1(boolean[] zArr, int i9, int i10) {
        this.f6000i = zArr;
        this.f5998g = i9;
        this.f5999h = i10;
    }

    public C1795u1(InterfaceC1807a interfaceC1807a, int i9) {
        this.f6000i = interfaceC1807a;
        this.f5998g = i9;
    }

    @Override // p295u4.InterfaceC4258h
    /* JADX INFO: renamed from: e */
    public void mo4271e(C4272v c4272v) {
    }

    @Override // p295u4.InterfaceC4258h
    /* JADX INFO: renamed from: j */
    public void mo4275j(C4260j c4260j) {
    }

    @Override // p295u4.InterfaceC4258h
    /* JADX INFO: renamed from: l */
    public void mo4277l(C4271u c4271u) {
    }

    @Override // p295u4.InterfaceC4258h
    /* JADX INFO: renamed from: o */
    public void mo4279o(C4263m c4263m) {
    }

    @Override // p295u4.InterfaceC4258h
    /* JADX INFO: renamed from: u */
    public void mo4281u(C4257g c4257g) {
    }

    @Override // p295u4.InterfaceC4258h
    /* JADX INFO: renamed from: x */
    public void mo4282x(C4271u c4271u) {
    }
}
