package p032c5;

import bsh.C1259t2;
import p254r5.C6492c0;

/* JADX INFO: renamed from: c5.r */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C1344r extends AbstractC1347u {

    /* JADX INFO: renamed from: b */
    public final C6492c0 f3984b;

    public C1344r(C6492c0 c6492c0) {
        super("SourceFile");
        if (c6492c0 != null) {
            this.f3984b = c6492c0;
        } else {
            C1259t2.m5095a("sourceFile == null");
            throw null;
        }
    }

    @Override // p094g5.InterfaceC2518a
    /* JADX INFO: renamed from: a */
    public int mo5336a() {
        return 8;
    }

    /* JADX INFO: renamed from: b */
    public C6492c0 m5352b() {
        return this.f3984b;
    }
}
