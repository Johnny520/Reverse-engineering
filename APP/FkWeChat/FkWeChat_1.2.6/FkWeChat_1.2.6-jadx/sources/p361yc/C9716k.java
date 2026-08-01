package p361yc;

import p024b9.C1031e;
import p300uc.InterfaceC8647b;
import p345xc.InterfaceC9485c;
import p345xc.InterfaceC9486d;
import vc.AbstractC8920a;

/* JADX INFO: renamed from: yc.k */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C9716k extends AbstractC9744p2 implements InterfaceC8647b {

    /* JADX INFO: renamed from: c */
    public static final C9716k f32979c = new C9716k();

    public C9716k() {
        super(AbstractC8920a.m34255w(C1031e.f3187a));
    }

    @Override // p361yc.AbstractC9666a
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public int mo37789k(byte[] bArr) {
        bArr.getClass();
        return bArr.length;
    }

    @Override // p361yc.AbstractC9744p2
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public byte[] mo37818x() {
        return new byte[0];
    }

    @Override // p361yc.AbstractC9775w, p361yc.AbstractC9666a
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public void mo37792n(InterfaceC9485c interfaceC9485c, int i10, C9711j c9711j, boolean z10) {
        interfaceC9485c.getClass();
        c9711j.getClass();
        c9711j.m37929e(interfaceC9485c.mo36953g(mo15953a(), i10));
    }

    @Override // p361yc.AbstractC9666a
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public C9711j mo37794q(byte[] bArr) {
        bArr.getClass();
        return new C9711j(bArr);
    }

    @Override // p361yc.AbstractC9744p2
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public void mo37812A(InterfaceC9486d interfaceC9486d, byte[] bArr, int i10) {
        interfaceC9486d.getClass();
        bArr.getClass();
        for (int i11 = 0; i11 < i10; i11++) {
            interfaceC9486d.mo36977y(mo15953a(), i11, bArr[i11]);
        }
    }
}
