package androidx.lifecycle;

import androidx.lifecycle.AbstractC0668k;
import p215oc.C5729x;
import p376zd.C9987e;

/* JADX INFO: renamed from: androidx.lifecycle.f */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C0658f implements InterfaceC0672m {

    /* JADX INFO: renamed from: q */
    public final InterfaceC0656e f1946q;

    /* JADX INFO: renamed from: r */
    public final InterfaceC0672m f1947r;

    /* JADX INFO: renamed from: androidx.lifecycle.f$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f1948a;

        static {
            int[] iArr = new int[AbstractC0668k.a.values().length];
            try {
                iArr[AbstractC0668k.a.ON_CREATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AbstractC0668k.a.ON_START.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AbstractC0668k.a.ON_RESUME.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[AbstractC0668k.a.ON_PAUSE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[AbstractC0668k.a.ON_STOP.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[AbstractC0668k.a.ON_DESTROY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[AbstractC0668k.a.ON_ANY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            f1948a = iArr;
        }
    }

    public C0658f(InterfaceC0656e interfaceC0656e, InterfaceC0672m interfaceC0672m) {
        interfaceC0656e.getClass();
        this.f1946q = interfaceC0656e;
        this.f1947r = interfaceC0672m;
    }

    @Override // androidx.lifecycle.InterfaceC0672m
    /* JADX INFO: renamed from: j */
    public void mo2593j(InterfaceC0676o interfaceC0676o, AbstractC0668k.a aVar) {
        interfaceC0676o.getClass();
        aVar.getClass();
        switch (a.f1948a[aVar.ordinal()]) {
            case 1:
                this.f1946q.m2600h(interfaceC0676o);
                break;
            case 2:
                this.f1946q.mo2599P(interfaceC0676o);
                break;
            case 3:
                this.f1946q.mo2494f(interfaceC0676o);
                break;
            case 4:
                this.f1946q.m2601m(interfaceC0676o);
                break;
            case 5:
                this.f1946q.mo2597F(interfaceC0676o);
                break;
            case 6:
                this.f1946q.m2598G(interfaceC0676o);
                break;
            case 7:
                C9987e.m38645a("ON_ANY must not been send by anybody");
                return;
            default:
                C5729x.m23182a();
                return;
        }
        InterfaceC0672m interfaceC0672m = this.f1947r;
        if (interfaceC0672m != null) {
            interfaceC0672m.mo2593j(interfaceC0676o, aVar);
        }
    }
}
