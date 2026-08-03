package p000;

import java.io.File;

/* JADX INFO: renamed from: h6 */
/* JADX INFO: loaded from: classes.dex */
public final class C1484h6 implements InterfaceC1189as {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f5254a;

    /* JADX INFO: renamed from: b */
    public final Object f5255b;

    public /* synthetic */ C1484h6(int r1, Object r2) {
        this.f5254a = r1;
        this.f5255b = r2;
    }

    @Override // p000.InterfaceC1189as
    /* JADX INFO: renamed from: a */
    public final boolean mo994a(Object r2) {
        switch(this.f5254a) {
            case 0: goto L8;
            case 1: goto L7;
            default: goto L4;
        };
    L4:
        File r22 = (File) r2;
        return true;
    L8:
        byte[] r23 = (byte[]) r2;
        return true;
    L7:
        return r2.toString().startsWith("data:image");
    }

    @Override // p000.InterfaceC1189as
    /* JADX INFO: renamed from: b */
    public final C1108Zr mo995b(Object r3, int r4, int r5, C2644vt r6) {
        switch(this.f5254a) {
            case 0: goto L8;
            case 1: goto L7;
            default: goto L4;
        };
    L4:
        File r32 = (File) r3;
        return new C1108Zr(new C1382et(r32), new C2799zc(r32, (C0668Pg) this.f5255b, 1));
    L8:
        byte[] r33 = (byte[]) r3;
        return new C1108Zr(new C1382et(r33), new C1336dr(1, r33, (InterfaceC1440g6) this.f5255b));
    L7:
        return new C1108Zr(new C1382et(r3), new C2799zc(r3.toString(), (C2220m6) this.f5255b, 0));
    }
}
