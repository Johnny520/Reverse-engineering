package p032c5;

import p045d5.C1883e;

/* JADX INFO: renamed from: c5.b */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public class C1328b extends AbstractC1347u {

    /* JADX INFO: renamed from: b */
    public final C1883e f3969b;

    /* JADX INFO: renamed from: c */
    public final int f3970c;

    public C1328b(C1883e c1883e) {
        super("BootstrapMethods");
        this.f3969b = c1883e;
        int size = (c1883e.size() * 4) + 8;
        for (int i10 = 0; i10 < c1883e.size(); i10++) {
            size += c1883e.m6710E(i10).m6713a().size() * 2;
        }
        this.f3970c = size;
    }

    @Override // p094g5.InterfaceC2518a
    /* JADX INFO: renamed from: a */
    public int mo5336a() {
        return this.f3970c;
    }

    /* JADX INFO: renamed from: b */
    public C1883e m5338b() {
        return this.f3969b;
    }
}
