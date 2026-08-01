package p121Y1;

import android.graphics.ImageDecoder;
import java.io.InputStream;
import java.nio.ByteBuffer;
import me.dartcv.nuke.BuildConfig;
import p078P1.C1147i;
import p078P1.InterfaceC1149k;
import p088R1.InterfaceC1194D;
import p195l2.AbstractC2498b;

/* JADX INFO: renamed from: Y1.g */
/* JADX INFO: loaded from: classes.dex */
public final class C1746g implements InterfaceC1149k {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f6020a;

    /* JADX INFO: renamed from: b */
    public final C1742c f6021b;

    public C1746g(int i5) {
        this.f6020a = i5;
        switch (i5) {
            case BuildConfig.VERSION_CODE /* 1 */:
                this.f6021b = new C1742c();
                break;
            default:
                this.f6021b = new C1742c();
                break;
        }
    }

    @Override // p078P1.InterfaceC1149k
    /* JADX INFO: renamed from: a */
    public final InterfaceC1194D mo2202a(Object obj, int i5, int i6, C1147i c1147i) {
        switch (this.f6020a) {
            case 0:
                return this.f6021b.m3098c(ImageDecoder.createSource((ByteBuffer) obj), i5, i6, c1147i);
            default:
                return this.f6021b.m3098c(ImageDecoder.createSource(AbstractC2498b.m4439b((InputStream) obj)), i5, i6, c1147i);
        }
    }

    @Override // p078P1.InterfaceC1149k
    /* JADX INFO: renamed from: b */
    public final /* bridge */ /* synthetic */ boolean mo2203b(Object obj, C1147i c1147i) {
        switch (this.f6020a) {
            case 0:
                break;
            default:
                break;
        }
        return true;
    }
}
