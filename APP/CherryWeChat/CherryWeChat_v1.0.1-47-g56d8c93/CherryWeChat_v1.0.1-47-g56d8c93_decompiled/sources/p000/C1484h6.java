package p000;

import java.io.File;

/* JADX INFO: renamed from: h6 */
/* JADX INFO: loaded from: classes.dex */
public final class C1484h6 implements InterfaceC1189as {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f5254a;

    /* JADX INFO: renamed from: b */
    public final Object f5255b;

    public /* synthetic */ C1484h6(int i, Object obj) {
        this.f5254a = i;
        this.f5255b = obj;
    }

    @Override // p000.InterfaceC1189as
    /* JADX INFO: renamed from: a */
    public final boolean mo994a(Object obj) {
        switch (this.f5254a) {
            case 0:
                return true;
            case 1:
                return obj.toString().startsWith("data:image");
            default:
                return true;
        }
    }

    @Override // p000.InterfaceC1189as
    /* JADX INFO: renamed from: b */
    public final C1108Zr mo995b(Object obj, int i, int i2, C2644vt c2644vt) {
        switch (this.f5254a) {
            case 0:
                byte[] bArr = (byte[]) obj;
                return new C1108Zr(new C1382et(bArr), new C1336dr(1, bArr, (InterfaceC1440g6) this.f5255b));
            case 1:
                return new C1108Zr(new C1382et(obj), new C2799zc(obj.toString(), (C2220m6) this.f5255b, 0));
            default:
                File file = (File) obj;
                return new C1108Zr(new C1382et(file), new C2799zc(file, (C0668Pg) this.f5255b, 1));
        }
    }
}
