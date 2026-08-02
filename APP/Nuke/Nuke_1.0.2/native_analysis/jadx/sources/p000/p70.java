package p000;

import android.content.res.AssetManager;
import android.os.Build;
import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class p70 {

    /* JADX INFO: renamed from: a */
    public final hh1 f8004a;

    /* JADX INFO: renamed from: b */
    public final byte[] f8005b;

    /* JADX INFO: renamed from: c */
    public final File f8006c;

    /* JADX INFO: renamed from: d */
    public final String f8007d;

    /* JADX INFO: renamed from: e */
    public boolean f8008e = false;

    /* JADX INFO: renamed from: f */
    public h80[] f8009f;

    /* JADX INFO: renamed from: g */
    public byte[] f8010g;

    public p70(AssetManager assetManager, p32 p32Var, hh1 hh1Var, String str, File file) {
        byte[] bArr;
        this.f8004a = hh1Var;
        this.f8007d = str;
        this.f8006c = file;
        int i = Build.VERSION.SDK_INT;
        if (i < 31) {
            switch (i) {
                case 27:
                    bArr = rp0.f9674f;
                    break;
                case 28:
                case 29:
                case 30:
                    bArr = rp0.f9673e;
                    break;
                default:
                    bArr = null;
                    break;
            }
        } else {
            bArr = rp0.f9672d;
        }
        this.f8005b = bArr;
    }

    /* JADX INFO: renamed from: a */
    public final FileInputStream m3791a(AssetManager assetManager, String str) {
        try {
            return assetManager.openFd(str).createInputStream();
        } catch (FileNotFoundException e) {
            String message = e.getMessage();
            if (message == null || !message.contains("compressed")) {
                return null;
            }
            Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m3792b(int i, Serializable serializable) {
        new RunnableC0961zg(this, i, serializable).run();
    }
}
