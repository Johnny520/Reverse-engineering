package p000;

import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import android.util.Log;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class ri0 implements f40 {

    /* JADX INFO: renamed from: h */
    public final String f9590h;

    /* JADX INFO: renamed from: i */
    public final AssetManager f9591i;

    /* JADX INFO: renamed from: j */
    public Object f9592j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ int f9593k;

    public ri0(AssetManager assetManager, String str, int i) {
        this.f9593k = i;
        this.f9591i = assetManager;
        this.f9590h = str;
    }

    @Override // p000.f40
    /* JADX INFO: renamed from: a */
    public final Class mo1371a() {
        switch (this.f9593k) {
            case 0:
                return AssetFileDescriptor.class;
            default:
                return InputStream.class;
        }
    }

    @Override // p000.f40
    /* JADX INFO: renamed from: b */
    public final void mo1372b() {
        Object obj = this.f9592j;
        if (obj == null) {
            return;
        }
        try {
            switch (this.f9593k) {
                case 0:
                    ((AssetFileDescriptor) obj).close();
                    break;
                default:
                    ((InputStream) obj).close();
                    break;
            }
        } catch (IOException unused) {
        }
    }

    @Override // p000.f40
    /* JADX INFO: renamed from: c */
    public final void mo1373c(i32 i32Var, e40 e40Var) {
        Object objOpenFd;
        try {
            AssetManager assetManager = this.f9591i;
            String str = this.f9590h;
            switch (this.f9593k) {
                case 0:
                    objOpenFd = assetManager.openFd(str);
                    break;
                default:
                    objOpenFd = assetManager.open(str);
                    break;
            }
            this.f9592j = objOpenFd;
            e40Var.mo636h(objOpenFd);
        } catch (IOException e) {
            if (Log.isLoggable("AssetPathFetcher", 3)) {
                Log.d("AssetPathFetcher", "Failed to load data from asset manager", e);
            }
            e40Var.mo635d(e);
        }
    }

    @Override // p000.f40
    /* JADX INFO: renamed from: e */
    public final int mo1374e() {
        return 1;
    }

    @Override // p000.f40
    public final void cancel() {
    }
}
