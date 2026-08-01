package p022L;

import android.content.res.AssetManager;
import android.os.Build;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.Serializable;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: L.b */
/* JADX INFO: loaded from: classes.dex */
public final class C0172b {

    /* JADX INFO: renamed from: a */
    public final Executor f497a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC0176f f498b;

    /* JADX INFO: renamed from: c */
    public final byte[] f499c;

    /* JADX INFO: renamed from: d */
    public final File f500d;

    /* JADX INFO: renamed from: e */
    public final String f501e;

    /* JADX INFO: renamed from: f */
    public boolean f502f = false;

    /* JADX INFO: renamed from: g */
    public C0173c[] f503g;

    /* JADX INFO: renamed from: h */
    public byte[] f504h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0172b(AssetManager assetManager, Executor executor, InterfaceC0176f interfaceC0176f, String str, File file) {
        this.f497a = executor;
        this.f498b = interfaceC0176f;
        this.f501e = str;
        this.f500d = file;
        int i2 = Build.VERSION.SDK_INT;
        byte[] bArr = null;
        if (i2 <= 33) {
            switch (i2) {
                case 24:
                case 25:
                    bArr = AbstractC0177g.f521h;
                    break;
                case 26:
                    bArr = AbstractC0177g.f520g;
                    break;
                case 27:
                    bArr = AbstractC0177g.f519f;
                    break;
                case 28:
                case 29:
                case 30:
                    bArr = AbstractC0177g.f518e;
                    break;
                case 31:
                case 32:
                case 33:
                    bArr = AbstractC0177g.f517d;
                    break;
            }
        }
        this.f499c = bArr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final FileInputStream m343a(AssetManager assetManager, String str) {
        try {
            return assetManager.openFd(str).createInputStream();
        } catch (FileNotFoundException e2) {
            String message = e2.getMessage();
            if (message == null || !message.contains("compressed")) {
                return null;
            }
            this.f498b.mo146r();
            return null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final void m344b(int i2, Serializable serializable) {
        this.f497a.execute(new RunnableC0171a(this, i2, serializable));
    }
}
