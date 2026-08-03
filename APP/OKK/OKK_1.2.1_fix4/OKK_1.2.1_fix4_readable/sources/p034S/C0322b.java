package p034S;

import android.content.res.AssetManager;
import android.os.Build;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.Serializable;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: S.b */
/* JADX INFO: loaded from: classes.dex */
public final class C0322b {

    /* JADX INFO: renamed from: a */
    public final Executor f613a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC0326f f614b;

    /* JADX INFO: renamed from: c */
    public final byte[] f615c;

    /* JADX INFO: renamed from: d */
    public final File f616d;

    /* JADX INFO: renamed from: e */
    public final String f617e;

    /* JADX INFO: renamed from: f */
    public boolean f618f = false;

    /* JADX INFO: renamed from: g */
    public C0323c[] f619g;

    /* JADX INFO: renamed from: h */
    public byte[] f620h;

    public C0322b(AssetManager assetManager, Executor executor, InterfaceC0326f interfaceC0326f, String str, File file) {
        this.f613a = executor;
        this.f614b = interfaceC0326f;
        this.f617e = str;
        this.f616d = file;
        int i2 = Build.VERSION.SDK_INT;
        byte[] bArr = null;
        if (i2 <= 34) {
            switch (i2) {
                case 26:
                    bArr = AbstractC0327g.f636g;
                    break;
                case 27:
                    bArr = AbstractC0327g.f635f;
                    break;
                case 28:
                case 29:
                case 30:
                    bArr = AbstractC0327g.f634e;
                    break;
                case 31:
                case 32:
                case 33:
                case 34:
                    bArr = AbstractC0327g.f633d;
                    break;
            }
        }
        this.f615c = bArr;
    }

    /* JADX INFO: renamed from: a */
    public final FileInputStream m716a(AssetManager assetManager, String str) {
        try {
            return assetManager.openFd(str).createInputStream();
        } catch (FileNotFoundException e2) {
            String message = e2.getMessage();
            if (message != null && message.contains("compressed")) {
                this.f614b.getClass();
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m717b(int i2, Serializable serializable) {
        this.f613a.execute(new RunnableC0321a(this, i2, serializable));
    }
}
