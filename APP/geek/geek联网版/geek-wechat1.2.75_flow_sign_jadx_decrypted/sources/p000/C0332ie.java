package p000;

import com.github.megatronking.stringfog.Base64;

/* JADX INFO: renamed from: ie */
/* JADX INFO: loaded from: classes.dex */
public final class C0332ie extends AbstractC0270gq implements InterfaceC0935ym {

    /* JADX INFO: renamed from: c */
    public static final C0332ie f2533c;

    /* JADX INFO: renamed from: d */
    public static final C0332ie f2534d;

    /* JADX INFO: renamed from: e */
    public static final C0332ie f2535e;

    /* JADX INFO: renamed from: f */
    public static final C0332ie f2536f;

    /* JADX INFO: renamed from: g */
    public static final C0332ie f2537g;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f2538b;

    static {
        int i = 2;
        f2533c = new C0332ie(i, 0);
        f2534d = new C0332ie(i, 1);
        f2535e = new C0332ie(i, 2);
        f2536f = new C0332ie(i, 3);
        f2537g = new C0332ie(i, 4);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0332ie(int i, int i2) {
        super(i);
        this.f2538b = i2;
    }

    @Override // p000.InterfaceC0935ym
    /* JADX INFO: renamed from: e */
    public final Object mo36e(Object obj, Object obj2) {
        switch (this.f2538b) {
            case Base64.DEFAULT /* 0 */:
                return ((InterfaceC0295he) obj).mo450i((InterfaceC0221fe) obj2);
            case Base64.NO_PADDING /* 1 */:
                Boolean bool = (Boolean) obj;
                bool.getClass();
                return bool;
            case Base64.NO_WRAP /* 2 */:
                return obj;
            case 3:
                g40.m1150m(obj);
                return null;
            case 4:
                return (b70) obj;
            default:
                return ((InterfaceC0295he) obj).mo450i((InterfaceC0221fe) obj2);
        }
    }
}
