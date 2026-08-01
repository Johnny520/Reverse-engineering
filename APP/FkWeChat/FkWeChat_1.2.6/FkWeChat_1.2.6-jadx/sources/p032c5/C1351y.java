package p032c5;

import bsh.C1259t2;
import p254r5.InterfaceC6489b;
import p309v5.C8822d;

/* JADX INFO: renamed from: c5.y */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C1351y extends AbstractC1347u {

    /* JADX INFO: renamed from: b */
    public final C8822d f3995b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC6489b f3996c;

    public C1351y(String str, C8822d c8822d, InterfaceC6489b interfaceC6489b) {
        super(str);
        if (c8822d == null) {
            C1259t2.m5095a("data == null");
            throw null;
        }
        this.f3995b = c8822d;
        this.f3996c = interfaceC6489b;
    }

    @Override // p094g5.InterfaceC2518a
    /* JADX INFO: renamed from: a */
    public int mo5336a() {
        return this.f3995b.m33861q() + 6;
    }

    public C1351y(String str, C8822d c8822d, int i10, int i11, InterfaceC6489b interfaceC6489b) {
        this(str, c8822d.m33862r(i10, i11 + i10), interfaceC6489b);
    }
}
