package p281t3;

import android.content.res.AssetManager;
import android.os.Build;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.Serializable;
import java.util.concurrent.Executor;
import p063e9.RunnableC0844o;

/* JADX INFO: renamed from: t3.a */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C4104a {

    /* JADX INFO: renamed from: a */
    public final Executor f13575a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC4108e f13576b;

    /* JADX INFO: renamed from: c */
    public final byte[] f13577c;

    /* JADX INFO: renamed from: d */
    public final File f13578d;

    /* JADX INFO: renamed from: e */
    public final String f13579e;

    /* JADX INFO: renamed from: f */
    public boolean f13580f = false;

    /* JADX INFO: renamed from: g */
    public C4105b[] f13581g;

    /* JADX INFO: renamed from: h */
    public byte[] f13582h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C4104a(AssetManager assetManager, Executor executor, InterfaceC4108e interfaceC4108e, String str, File file) {
        byte[] bArr;
        this.f13575a = executor;
        this.f13576b = interfaceC4108e;
        this.f13579e = str;
        this.f13578d = file;
        int i9 = Build.VERSION.SDK_INT;
        if (i9 < 31) {
            switch (i9) {
                case 27:
                    bArr = AbstractC4109f.f13598f;
                    break;
                case 28:
                case 29:
                case 30:
                    bArr = AbstractC4109f.f13597e;
                    break;
                default:
                    bArr = null;
                    break;
            }
        } else {
            bArr = AbstractC4109f.f13596d;
        }
        this.f13577c = bArr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final FileInputStream m8276a(AssetManager assetManager, String str) {
        try {
            return assetManager.openFd(str).createInputStream();
        } catch (FileNotFoundException e6) {
            String message = e6.getMessage();
            if (message == null || !message.contains("compressed")) {
                return null;
            }
            this.f13576b.mo5870a();
            return null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final void m8277b(int i9, Serializable serializable) {
        this.f13575a.execute(new RunnableC0844o(this, i9, serializable));
    }
}
