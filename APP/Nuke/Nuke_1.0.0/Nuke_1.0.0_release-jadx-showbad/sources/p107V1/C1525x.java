package p107V1;

import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import java.io.InputStream;
import me.dartcv.nuke.BuildConfig;
import p078P1.C1147i;
import p088R1.InterfaceC1194D;
import p121Y1.C1743d;
import p148d2.InterfaceC1970a;

/* JADX INFO: renamed from: V1.x */
/* JADX INFO: loaded from: classes.dex */
public final class C1525x implements InterfaceC1519r, InterfaceC1970a {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f5291d;

    /* JADX INFO: renamed from: e */
    public final Resources f5292e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C1525x(Resources resources, int i5) {
        this.f5291d = i5;
        this.f5292e = resources;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p148d2.InterfaceC1970a
    /* JADX INFO: renamed from: b */
    public InterfaceC1194D mo98b(InterfaceC1194D interfaceC1194D, C1147i c1147i) {
        if (interfaceC1194D == null) {
            return null;
        }
        return new C1743d(this.f5292e, interfaceC1194D);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p107V1.InterfaceC1519r
    /* JADX INFO: renamed from: g */
    public InterfaceC1518q mo68g(C1524w c1524w) {
        switch (this.f5291d) {
            case 0:
                return new C1503b(this.f5292e, c1524w.m2789a(Uri.class, AssetFileDescriptor.class));
            case BuildConfig.VERSION_CODE /* 1 */:
                return new C1503b(this.f5292e, c1524w.m2789a(Uri.class, InputStream.class));
            default:
                return new C1503b(this.f5292e, C1498A.f5226b);
        }
    }
}
