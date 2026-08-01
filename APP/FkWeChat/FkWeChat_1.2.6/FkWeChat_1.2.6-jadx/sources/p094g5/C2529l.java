package p094g5;

import p032c5.C1330d;
import p254r5.AbstractC6500g0;
import p254r5.C6496e0;
import p254r5.C6521z;

/* JADX INFO: renamed from: g5.l */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C2529l extends AbstractC2531n implements InterfaceC2521d {
    public C2529l(C6496e0 c6496e0, int i10, C6521z c6521z, InterfaceC2519b interfaceC2519b) {
        super(c6496e0, i10, c6521z, interfaceC2519b);
    }

    @Override // p094g5.InterfaceC2521d
    /* JADX INFO: renamed from: f */
    public AbstractC6500g0 mo9030f() {
        C1330d c1330d = (C1330d) getAttributes().mo9028k("ConstantValue");
        if (c1330d == null) {
            return null;
        }
        return c1330d.m5344b();
    }
}
