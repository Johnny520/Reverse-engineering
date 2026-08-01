package p170h1;

import me.dartcv.nuke.BuildConfig;
import p002A1.InterfaceC0145r;
import p027E4.C0330q;
import p041H0.C0564I;
import p048I1.InterfaceC0782g;
import p056K2.C0891q;
import p112W2.InterfaceC1601c;
import p112W2.InterfaceC1603e;
import p117X2.AbstractC1666k;
import p153e1.EnumC2017m;
import p153e1.InterfaceC2007c;
import p169h0.InterfaceC2207p;

/* JADX INFO: renamed from: h1.k */
/* JADX INFO: loaded from: classes.dex */
public final class C2220k extends AbstractC1666k implements InterfaceC1603e {

    /* JADX INFO: renamed from: f */
    public static final C2220k f7255f;

    /* JADX INFO: renamed from: g */
    public static final C2220k f7256g;

    /* JADX INFO: renamed from: h */
    public static final C2220k f7257h;

    /* JADX INFO: renamed from: i */
    public static final C2220k f7258i;

    /* JADX INFO: renamed from: j */
    public static final C2220k f7259j;

    /* JADX INFO: renamed from: k */
    public static final C2220k f7260k;

    /* JADX INFO: renamed from: l */
    public static final C2220k f7261l;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ int f7262e;

    static {
        int i5 = 2;
        f7255f = new C2220k(i5, 0);
        f7256g = new C2220k(i5, 1);
        f7257h = new C2220k(i5, 2);
        f7258i = new C2220k(i5, 3);
        f7259j = new C2220k(i5, 4);
        f7260k = new C2220k(i5, 5);
        f7261l = new C2220k(i5, 6);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2220k(int i5, int i6) {
        super(i5);
        this.f7262e = i6;
    }

    @Override // p112W2.InterfaceC1603e
    /* JADX INFO: renamed from: g */
    public final Object mo0g(Object obj, Object obj2) {
        int i5;
        switch (this.f7262e) {
            case 0:
                AbstractC2219j.m4033e((C0564I) obj).setUpdateBlock((InterfaceC1601c) obj2);
                return C0891q.f2780a;
            case BuildConfig.VERSION_CODE /* 1 */:
                AbstractC2219j.m4033e((C0564I) obj).setReleaseBlock((InterfaceC1601c) obj2);
                return C0891q.f2780a;
            case 2:
                AbstractC2219j.m4033e((C0564I) obj).setModifier((InterfaceC2207p) obj2);
                return C0891q.f2780a;
            case 3:
                AbstractC2219j.m4033e((C0564I) obj).setDensity((InterfaceC2007c) obj2);
                return C0891q.f2780a;
            case 4:
                AbstractC2219j.m4033e((C0564I) obj).setLifecycleOwner((InterfaceC0145r) obj2);
                return C0891q.f2780a;
            case 5:
                AbstractC2219j.m4033e((C0564I) obj).setSavedStateRegistryOwner((InterfaceC0782g) obj2);
                return C0891q.f2780a;
            default:
                C2233x c2233xM4033e = AbstractC2219j.m4033e((C0564I) obj);
                int iOrdinal = ((EnumC2017m) obj2).ordinal();
                if (iOrdinal != 0) {
                    i5 = 1;
                    if (iOrdinal != 1) {
                        throw new C0330q();
                    }
                } else {
                    i5 = 0;
                }
                c2233xM4033e.setLayoutDirection(i5);
                return C0891q.f2780a;
        }
    }
}
