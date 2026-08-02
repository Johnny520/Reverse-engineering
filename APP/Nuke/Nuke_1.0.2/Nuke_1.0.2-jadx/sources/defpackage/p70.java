package defpackage;

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
    public final hh1 a;
    public final byte[] b;
    public final File c;
    public final String d;
    public boolean e = false;
    public h80[] f;
    public byte[] g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public p70(AssetManager assetManager, p32 p32Var, hh1 hh1Var, String str, File file) {
        byte[] bArr;
        this.a = hh1Var;
        this.d = str;
        this.c = file;
        int i = Build.VERSION.SDK_INT;
        if (i < 31) {
            switch (i) {
                case 27:
                    bArr = rp0.f;
                    break;
                case 28:
                case 29:
                case 30:
                    bArr = rp0.e;
                    break;
                default:
                    bArr = null;
                    break;
            }
        } else {
            bArr = rp0.d;
        }
        this.b = bArr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final FileInputStream a(AssetManager assetManager, String str) {
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

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void b(int i, Serializable serializable) {
        new zg(this, i, serializable).run();
    }
}
