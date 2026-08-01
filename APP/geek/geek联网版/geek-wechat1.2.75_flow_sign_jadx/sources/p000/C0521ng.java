package p000;

import android.content.res.AssetManager;
import android.os.Build;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.Serializable;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: ng */
/* JADX INFO: loaded from: classes.dex */
public final class C0521ng {

    /* JADX INFO: renamed from: a */
    public final Executor f3288a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC0650qy f3289b;

    /* JADX INFO: renamed from: c */
    public final byte[] f3290c;

    /* JADX INFO: renamed from: d */
    public final File f3291d;

    /* JADX INFO: renamed from: e */
    public final String f3292e;

    /* JADX INFO: renamed from: f */
    public boolean f3293f = false;

    /* JADX INFO: renamed from: g */
    public C0558og[] f3294g;

    /* JADX INFO: renamed from: h */
    public byte[] f3295h;

    public C0521ng(AssetManager assetManager, Executor executor, InterfaceC0650qy interfaceC0650qy, String str, File file) {
        this.f3288a = executor;
        this.f3289b = interfaceC0650qy;
        this.f3292e = str;
        this.f3291d = file;
        int i = Build.VERSION.SDK_INT;
        byte[] bArr = null;
        if (i <= 33) {
            switch (i) {
                case 26:
                    bArr = g80.f1918l;
                    break;
                case 27:
                    bArr = g80.f1917k;
                    break;
                case 28:
                case 29:
                case 30:
                    bArr = g80.f1916j;
                    break;
                case 31:
                case 32:
                case 33:
                    bArr = g80.f1915i;
                    break;
            }
        }
        this.f3290c = bArr;
    }

    /* JADX INFO: renamed from: a */
    public final FileInputStream m1956a(AssetManager assetManager, String str) {
        try {
            return assetManager.openFd(str).createInputStream();
        } catch (FileNotFoundException e) {
            String message = e.getMessage();
            if (message == null || !message.contains("compressed")) {
                return null;
            }
            this.f3289b.mo1720g();
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m1957b(final int i, final Serializable serializable) {
        this.f3288a.execute(new Runnable() { // from class: mg
            @Override // java.lang.Runnable
            public final void run() {
                this.f3132a.f3289b.mo1721i(i, serializable);
            }
        });
    }
}
