package p115X0;

import me.dartcv.nuke.BuildConfig;
import p056K2.C0891q;
import p112W2.InterfaceC1601c;
import p117X2.AbstractC1666k;
import p211o0.C2730E;

/* JADX INFO: renamed from: X0.b */
/* JADX INFO: loaded from: classes.dex */
public final class C1627b extends AbstractC1666k implements InterfaceC1601c {

    /* JADX INFO: renamed from: f */
    public static final C1627b f5590f;

    /* JADX INFO: renamed from: g */
    public static final C1627b f5591g;

    /* JADX INFO: renamed from: h */
    public static final C1627b f5592h;

    /* JADX INFO: renamed from: i */
    public static final C1627b f5593i;

    /* JADX INFO: renamed from: j */
    public static final C1627b f5594j;

    /* JADX INFO: renamed from: k */
    public static final C1627b f5595k;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ int f5596e;

    static {
        int i5 = 1;
        f5590f = new C1627b(i5, 0);
        f5591g = new C1627b(i5, 1);
        f5592h = new C1627b(i5, 2);
        f5593i = new C1627b(i5, 3);
        f5594j = new C1627b(i5, 4);
        f5595k = new C1627b(i5, 5);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1627b(int i5, int i6) {
        super(i5);
        this.f5596e = i6;
    }

    @Override // p112W2.InterfaceC1601c
    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Object mo1h(Object obj) {
        switch (this.f5596e) {
            case 0:
                float[] fArr = ((C2730E) obj).f8675a;
                break;
            case BuildConfig.VERSION_CODE /* 1 */:
                float[] fArr2 = ((C2730E) obj).f8675a;
                break;
            case 2:
                break;
            case 3:
                int i5 = ((C1635j) obj).f5624a;
                break;
            case 4:
                break;
            default:
                int i6 = ((C1635j) obj).f5624a;
                break;
        }
        return C0891q.f2780a;
    }
}
