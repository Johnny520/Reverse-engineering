package p107V1;

import java.io.File;
import me.dartcv.nuke.BuildConfig;
import p078P1.C1147i;
import p083Q1.C1173b;
import p189k2.C2452b;

/* JADX INFO: renamed from: V1.c */
/* JADX INFO: loaded from: classes.dex */
public final class C1504c implements InterfaceC1518q {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f5240a;

    /* JADX INFO: renamed from: b */
    public final Object f5241b;

    public /* synthetic */ C1504c(int i5, Object obj) {
        this.f5240a = i5;
        this.f5241b = obj;
    }

    @Override // p107V1.InterfaceC1518q
    /* JADX INFO: renamed from: a */
    public final boolean mo2773a(Object obj) {
        switch (this.f5240a) {
            case 0:
                return true;
            case BuildConfig.VERSION_CODE /* 1 */:
                return obj.toString().startsWith("data:image");
            default:
                return true;
        }
    }

    @Override // p107V1.InterfaceC1518q
    /* JADX INFO: renamed from: b */
    public final C1517p mo2774b(Object obj, int i5, int i6, C1147i c1147i) {
        switch (this.f5240a) {
            case 0:
                byte[] bArr = (byte[]) obj;
                return new C1517p(new C2452b(bArr), new C1513l(1, bArr, (C1527z) this.f5241b));
            case BuildConfig.VERSION_CODE /* 1 */:
                return new C1517p(new C2452b(obj), new C1173b(obj.toString(), (C1527z) this.f5241b, 1));
            default:
                File file = (File) obj;
                return new C1517p(new C2452b(file), new C1173b(file, (C1527z) this.f5241b, 2));
        }
    }
}
