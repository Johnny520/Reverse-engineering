package p032c5;

import bsh.C1259t2;
import p254r5.C6496e0;
import p254r5.C6521z;

/* JADX INFO: renamed from: c5.f */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C1332f extends AbstractC1347u {

    /* JADX INFO: renamed from: b */
    public final C6496e0 f3977b;

    /* JADX INFO: renamed from: c */
    public final C6521z f3978c;

    public C1332f(C6496e0 c6496e0, C6521z c6521z) {
        super("EnclosingMethod");
        if (c6496e0 == null) {
            C1259t2.m5095a("type == null");
            throw null;
        }
        this.f3977b = c6496e0;
        this.f3978c = c6521z;
    }

    @Override // p094g5.InterfaceC2518a
    /* JADX INFO: renamed from: a */
    public int mo5336a() {
        return 10;
    }

    /* JADX INFO: renamed from: b */
    public C6496e0 m5345b() {
        return this.f3977b;
    }

    /* JADX INFO: renamed from: c */
    public C6521z m5346c() {
        return this.f3978c;
    }
}
