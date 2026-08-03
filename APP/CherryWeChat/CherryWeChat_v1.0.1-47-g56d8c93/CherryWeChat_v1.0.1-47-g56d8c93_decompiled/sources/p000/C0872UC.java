package p000;

import java.io.File;

/* JADX INFO: renamed from: UC */
/* JADX INFO: loaded from: classes.dex */
public final class C0872UC implements InterfaceC1189as {

    /* JADX INFO: renamed from: b */
    public static final C0872UC f2757b = new C0872UC(0);

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f2758a;

    public /* synthetic */ C0872UC(int i) {
        this.f2758a = i;
    }

    @Override // p000.InterfaceC1189as
    /* JADX INFO: renamed from: a */
    public final boolean mo994a(Object obj) {
        switch (this.f2758a) {
            case 0:
                return true;
            case 1:
                return true;
            default:
                return false;
        }
    }

    @Override // p000.InterfaceC1189as
    /* JADX INFO: renamed from: b */
    public final C1108Zr mo995b(Object obj, int i, int i2, C2644vt c2644vt) {
        switch (this.f2758a) {
            case 0:
                return new C1108Zr(new C1382et(obj), new C2177l6(1, obj));
            case 1:
                File file = (File) obj;
                return new C1108Zr(new C1382et(file), new C2177l6(0, file));
            default:
                return null;
        }
    }
}
