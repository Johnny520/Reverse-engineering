package p000;

import com.github.megatronking.stringfog.Base64;

/* JADX INFO: renamed from: he */
/* JADX INFO: loaded from: classes.dex */
public final class C0295he extends AbstractC0123cq implements InterfaceC0861wm {

    /* JADX INFO: renamed from: c */
    public static final C0295he f2273c;

    /* JADX INFO: renamed from: d */
    public static final C0295he f2274d;

    /* JADX INFO: renamed from: e */
    public static final C0295he f2275e;

    /* JADX INFO: renamed from: f */
    public static final C0295he f2276f;

    /* JADX INFO: renamed from: g */
    public static final C0295he f2277g;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f2278b;

    static {
        int i = 2;
        f2273c = new C0295he(i, 0);
        f2274d = new C0295he(i, 1);
        f2275e = new C0295he(i, 2);
        f2276f = new C0295he(i, 3);
        f2277g = new C0295he(i, 4);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0295he(int i, int i2) {
        super(i);
        this.f2278b = i2;
    }

    @Override // p000.InterfaceC0861wm
    /* JADX INFO: renamed from: e */
    public final Object mo472e(Object obj, Object obj2) {
        switch (this.f2278b) {
            case Base64.DEFAULT /* 0 */:
                return ((InterfaceC0258ge) obj).mo1275i((InterfaceC0184ee) obj2);
            case Base64.NO_PADDING /* 1 */:
                Boolean bool = (Boolean) obj;
                bool.getClass();
                return bool;
            case Base64.NO_WRAP /* 2 */:
                return obj;
            case 3:
                z30.m2768m(obj);
                return null;
            case 4:
                return (v60) obj;
            default:
                return ((InterfaceC0258ge) obj).mo1275i((InterfaceC0184ee) obj2);
        }
    }
}
