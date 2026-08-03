package p176m1;

import android.graphics.PathMeasure;
import gg.AbstractC1417m;
import p071f1.C1011k;
import p085fg.InterfaceC1220a;
import p276sf.C3967n;

/* JADX INFO: renamed from: m1.g */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2732g extends AbstractC1417m implements InterfaceC1220a {

    /* JADX INFO: renamed from: h */
    public static final C2732g f8876h;

    /* JADX INFO: renamed from: i */
    public static final C2732g f8877i;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f8878g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        int i9 = 0;
        f8876h = new C2732g(i9, 0);
        f8877i = new C2732g(i9, 1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2732g(int i9, int i10) {
        super(i9);
        this.f8878g = i10;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1220a
    public final Object invoke() {
        switch (this.f8878g) {
            case 0:
                return new C1011k(new PathMeasure());
            default:
                return C3967n.f12976a;
        }
    }
}
