package p107V1;

import java.io.File;
import me.dartcv.nuke.BuildConfig;
import p078P1.C1147i;
import p189k2.C2452b;

/* JADX INFO: renamed from: V1.A */
/* JADX INFO: loaded from: classes.dex */
public final class C1498A implements InterfaceC1518q {

    /* JADX INFO: renamed from: b */
    public static final C1498A f5226b = new C1498A(0);

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f5227a;

    public /* synthetic */ C1498A(int i5) {
        this.f5227a = i5;
    }

    @Override // p107V1.InterfaceC1518q
    /* JADX INFO: renamed from: a */
    public final boolean mo2773a(Object obj) {
        switch (this.f5227a) {
            case 0:
                return true;
            case BuildConfig.VERSION_CODE /* 1 */:
                return true;
            default:
                return false;
        }
    }

    @Override // p107V1.InterfaceC1518q
    /* JADX INFO: renamed from: b */
    public final C1517p mo2774b(Object obj, int i5, int i6, C1147i c1147i) {
        switch (this.f5227a) {
            case 0:
                return new C1517p(new C2452b(obj), new C1505d(1, obj));
            case BuildConfig.VERSION_CODE /* 1 */:
                File file = (File) obj;
                return new C1517p(new C2452b(file), new C1505d(0, file));
            default:
                return null;
        }
    }
}
