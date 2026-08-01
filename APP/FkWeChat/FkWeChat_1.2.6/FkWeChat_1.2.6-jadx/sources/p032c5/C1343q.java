package p032c5;

import bsh.C1259t2;
import p254r5.C6492c0;

/* JADX INFO: renamed from: c5.q */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C1343q extends AbstractC1347u {

    /* JADX INFO: renamed from: b */
    public final C6492c0 f3983b;

    public C1343q(C6492c0 c6492c0) {
        super("SourceDebugExtension");
        if (c6492c0 != null) {
            this.f3983b = c6492c0;
        } else {
            C1259t2.m5095a("smapString == null");
            throw null;
        }
    }

    @Override // p094g5.InterfaceC2518a
    /* JADX INFO: renamed from: a */
    public int mo5336a() {
        return this.f3983b.m25743s() + 6;
    }

    /* JADX INFO: renamed from: b */
    public C6492c0 m5351b() {
        return this.f3983b;
    }
}
