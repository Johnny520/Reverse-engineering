package p032c5;

import bsh.C1259t2;
import p269s5.InterfaceC7190e;
import p309v5.C8835q;

/* JADX INFO: renamed from: c5.g */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C1333g extends AbstractC1347u {

    /* JADX INFO: renamed from: b */
    public final InterfaceC7190e f3979b;

    public C1333g(InterfaceC7190e interfaceC7190e) {
        super("Exceptions");
        try {
            if (interfaceC7190e.mo8383c()) {
                throw new C8835q("exceptions.isMutable()");
            }
            this.f3979b = interfaceC7190e;
        } catch (NullPointerException unused) {
            C1259t2.m5095a("exceptions == null");
            throw null;
        }
    }

    @Override // p094g5.InterfaceC2518a
    /* JADX INFO: renamed from: a */
    public int mo5336a() {
        return (this.f3979b.size() * 2) + 8;
    }

    /* JADX INFO: renamed from: b */
    public InterfaceC7190e m5347b() {
        return this.f3979b;
    }
}
