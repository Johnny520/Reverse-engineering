package p361yc;

import p024b9.C1035g;
import p300uc.InterfaceC8647b;
import p345xc.InterfaceC9485c;
import p345xc.InterfaceC9486d;
import vc.AbstractC8920a;

/* JADX INFO: renamed from: yc.q */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C9746q extends AbstractC9744p2 implements InterfaceC8647b {

    /* JADX INFO: renamed from: c */
    public static final C9746q f33016c = new C9746q();

    public C9746q() {
        super(AbstractC8920a.m34256x(C1035g.f3196a));
    }

    @Override // p361yc.AbstractC9666a
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public int mo37789k(char[] cArr) {
        cArr.getClass();
        return cArr.length;
    }

    @Override // p361yc.AbstractC9744p2
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public char[] mo37818x() {
        return new char[0];
    }

    @Override // p361yc.AbstractC9775w, p361yc.AbstractC9666a
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public void mo37792n(InterfaceC9485c interfaceC9485c, int i10, C9741p c9741p, boolean z10) {
        interfaceC9485c.getClass();
        c9741p.getClass();
        c9741p.m37996e(interfaceC9485c.mo36962w(mo15953a(), i10));
    }

    @Override // p361yc.AbstractC9666a
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public C9741p mo37794q(char[] cArr) {
        cArr.getClass();
        return new C9741p(cArr);
    }

    @Override // p361yc.AbstractC9744p2
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public void mo37812A(InterfaceC9486d interfaceC9486d, char[] cArr, int i10) {
        interfaceC9486d.getClass();
        cArr.getClass();
        for (int i11 = 0; i11 < i10; i11++) {
            interfaceC9486d.mo36974u(mo15953a(), i11, cArr[i11]);
        }
    }
}
