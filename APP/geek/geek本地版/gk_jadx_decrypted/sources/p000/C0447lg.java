package p000;

import android.content.res.AssetManager;
import android.os.Build;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.Serializable;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: lg */
/* JADX INFO: loaded from: classes.dex */
public final class C0447lg {

    /* JADX INFO: renamed from: a */
    public final Executor f3048a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC0391jy f3049b;

    /* JADX INFO: renamed from: c */
    public final byte[] f3050c;

    /* JADX INFO: renamed from: d */
    public final File f3051d;

    /* JADX INFO: renamed from: e */
    public final String f3052e;

    /* JADX INFO: renamed from: f */
    public boolean f3053f = false;

    /* JADX INFO: renamed from: g */
    public C0484mg[] f3054g;

    /* JADX INFO: renamed from: h */
    public byte[] f3055h;

    public C0447lg(AssetManager assetManager, Executor executor, InterfaceC0391jy interfaceC0391jy, String str, File file) {
        this.f3048a = executor;
        this.f3049b = interfaceC0391jy;
        this.f3052e = str;
        this.f3051d = file;
        int i = Build.VERSION.SDK_INT;
        byte[] bArr = null;
        if (i <= 33) {
            switch (i) {
                case 26:
                    bArr = a80.f79l;
                    break;
                case 27:
                    bArr = a80.f78k;
                    break;
                case 28:
                case 29:
                case 30:
                    bArr = a80.f77j;
                    break;
                case 31:
                case 32:
                case 33:
                    bArr = a80.f76i;
                    break;
            }
        }
        this.f3050c = bArr;
    }

    /* JADX INFO: renamed from: a */
    public final FileInputStream m1759a(AssetManager assetManager, String str) {
        try {
            return assetManager.openFd(str).createInputStream();
        } catch (FileNotFoundException e) {
            String message = e.getMessage();
            if (message == null || !message.contains("compressed")) {
                return null;
            }
            this.f3049b.mo1531g();
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m1760b(int i, Serializable serializable) {
        this.f3048a.execute(new RunnableC0593pd(this, i, serializable));
    }
}
