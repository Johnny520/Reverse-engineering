package p032c5;

import bsh.C1259t2;
import p045d5.C1892n;
import p309v5.C8835q;

/* JADX INFO: renamed from: c5.i */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C1335i extends AbstractC1347u {

    /* JADX INFO: renamed from: b */
    public final C1892n f3981b;

    public C1335i(C1892n c1892n) {
        super("LineNumberTable");
        try {
            if (c1892n.m33927c()) {
                throw new C8835q("lineNumbers.isMutable()");
            }
            this.f3981b = c1892n;
        } catch (NullPointerException unused) {
            C1259t2.m5095a("lineNumbers == null");
            throw null;
        }
    }

    @Override // p094g5.InterfaceC2518a
    /* JADX INFO: renamed from: a */
    public int mo5336a() {
        return (this.f3981b.size() * 4) + 8;
    }

    /* JADX INFO: renamed from: b */
    public C1892n m5349b() {
        return this.f3981b;
    }
}
