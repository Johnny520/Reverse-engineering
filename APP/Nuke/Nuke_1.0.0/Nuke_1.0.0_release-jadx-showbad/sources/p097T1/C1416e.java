package p097T1;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.ConnectivityManager;
import java.io.InputStream;
import me.dartcv.nuke.BuildConfig;
import p107V1.C1503b;
import p107V1.C1514m;
import p107V1.C1524w;
import p107V1.InterfaceC1518q;
import p107V1.InterfaceC1519r;
import p195l2.InterfaceC2504h;

/* JADX INFO: renamed from: T1.e */
/* JADX INFO: loaded from: classes.dex */
public final class C1416e implements InterfaceC1519r, InterfaceC2504h {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f5066d;

    /* JADX INFO: renamed from: e */
    public final Context f5067e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C1416e(Context context, int i5) {
        this.f5066d = i5;
        this.f5067e = context;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p107V1.InterfaceC1519r
    /* JADX INFO: renamed from: g */
    public InterfaceC1518q mo68g(C1524w c1524w) {
        switch (this.f5066d) {
            case BuildConfig.VERSION_CODE /* 1 */:
                return new C1503b(this.f5067e, this);
            case 2:
                return new C1503b(this.f5067e, this);
            case 3:
                return new C1503b(this.f5067e, this);
            case 4:
                return new C1514m(this.f5067e, 0);
            case 5:
                return new C1503b(this.f5067e, c1524w.m2789a(Integer.class, AssetFileDescriptor.class));
            case 6:
                return new C1503b(this.f5067e, c1524w.m2789a(Integer.class, InputStream.class));
            case 7:
                return new C1514m(this.f5067e, 1);
            default:
                return new C1514m(this.f5067e, 2);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p195l2.InterfaceC2504h
    public Object get() {
        return (ConnectivityManager) this.f5067e.getSystemService("connectivity");
    }
}
