package p000;

import android.graphics.ImageDecoder;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: k6 */
/* JADX INFO: loaded from: classes.dex */
public final class C2129k6 implements InterfaceC2518sw {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f7472a;

    /* JADX INFO: renamed from: b */
    public final C0479L5 f7473b;

    public C2129k6(int i) {
        this.f7472a = i;
        switch (i) {
            case 1:
                this.f7473b = new C0479L5();
                break;
            default:
                this.f7473b = new C0479L5();
                break;
        }
    }

    @Override // p000.InterfaceC2518sw
    /* JADX INFO: renamed from: a */
    public final InterfaceC2389pw mo749a(Object obj, int i, int i2, C2644vt c2644vt) {
        switch (this.f7472a) {
            case 0:
                return this.f7473b.m937c(ImageDecoder.createSource((ByteBuffer) obj), i, i2, c2644vt);
            default:
                return this.f7473b.m937c(ImageDecoder.createSource(AbstractC2529t6.m5010b((InputStream) obj)), i, i2, c2644vt);
        }
    }

    @Override // p000.InterfaceC2518sw
    /* JADX INFO: renamed from: b */
    public final /* bridge */ /* synthetic */ boolean mo750b(Object obj, C2644vt c2644vt) {
        switch (this.f7472a) {
            case 0:
                break;
            default:
                break;
        }
        return true;
    }
}
