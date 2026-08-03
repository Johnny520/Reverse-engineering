package p000;

import java.io.File;

/* JADX INFO: renamed from: UC */
/* JADX INFO: loaded from: classes.dex */
public final class C0872UC implements InterfaceC1189as {

    /* JADX INFO: renamed from: b */
    public static final C0872UC f2757b = null;

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f2758a;

    static {
        f2757b = new C0872UC(0);
    }

    public /* synthetic */ C0872UC(int r1) {
        this.f2758a = r1;
    }

    @Override // p000.InterfaceC1189as
    /* JADX INFO: renamed from: a */
    public final boolean mo994a(Object r2) {
        switch(this.f2758a) {
            case 0: goto L8;
            case 1: goto L6;
            default: goto L4;
        };
    L4:
        return false;
    L6:
        File r22 = (File) r2;
        return true;
    L8:
        return true;
    }

    @Override // p000.InterfaceC1189as
    /* JADX INFO: renamed from: b */
    public final C1108Zr mo995b(Object r2, int r3, int r4, C2644vt r5) {
        switch(this.f2758a) {
            case 0: goto L9;
            case 1: goto L6;
            default: goto L4;
        };
    L4:
        return null;
    L6:
        File r22 = (File) r2;
        return new C1108Zr(new C1382et(r22), new C2177l6(0, r22));
    L9:
        return new C1108Zr(new C1382et(r2), new C2177l6(1, r2));
    }
}
