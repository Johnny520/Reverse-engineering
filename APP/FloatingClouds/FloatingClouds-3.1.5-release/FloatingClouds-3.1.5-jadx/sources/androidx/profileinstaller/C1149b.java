package androidx.profileinstaller;

import android.content.res.AssetManager;
import android.os.Build;
import androidx.profileinstaller.C1150c;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.Serializable;
import java.util.concurrent.Executor;
import p000a.C0213Lc;
import p000a.C0589g5;
import p000a.RunnableC0660k0;

/* JADX INFO: renamed from: androidx.profileinstaller.b */
/* JADX INFO: loaded from: classes.dex */
public final class C1149b {

    /* JADX INFO: renamed from: a */
    public final Executor f4724a;

    /* JADX INFO: renamed from: b */
    public final C1150c.c f4725b;

    /* JADX INFO: renamed from: c */
    public final byte[] f4726c;

    /* JADX INFO: renamed from: d */
    public final File f4727d;

    /* JADX INFO: renamed from: e */
    public final String f4728e;

    /* JADX INFO: renamed from: f */
    public boolean f4729f = false;

    /* JADX INFO: renamed from: g */
    public C0589g5[] f4730g;

    /* JADX INFO: renamed from: h */
    public byte[] f4731h;

    public C1149b(AssetManager assetManager, Executor executor, C1150c.c cVar, String str, File file) {
        this.f4724a = executor;
        this.f4725b = cVar;
        this.f4728e = str;
        this.f4727d = file;
        int i = Build.VERSION.SDK_INT;
        byte[] bArr = null;
        if (i <= 34) {
            switch (i) {
                case 28:
                case 29:
                case 30:
                    bArr = C0213Lc.f726b;
                    break;
                case 31:
                case 32:
                case 33:
                case 34:
                    bArr = C0213Lc.f725a;
                    break;
            }
        }
        this.f4726c = bArr;
    }

    /* JADX INFO: renamed from: a */
    public final FileInputStream m2622a(AssetManager assetManager, String str) {
        try {
            return assetManager.openFd(str).createInputStream();
        } catch (FileNotFoundException e) {
            String message = e.getMessage();
            if (message == null || !message.contains("compressed")) {
                return null;
            }
            this.f4725b.mo2618b();
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m2623b(int i, Serializable serializable) {
        this.f4724a.execute(new RunnableC0660k0(this, i, serializable, 2));
    }
}
