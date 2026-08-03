package p000;

import android.content.res.AssetManager;
import android.os.Build;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.Serializable;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: Bd */
/* JADX INFO: loaded from: classes.dex */
public final class C0063Bd {

    /* JADX INFO: renamed from: a */
    public final Executor f146a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC0080Bu f147b;

    /* JADX INFO: renamed from: c */
    public final byte[] f148c;

    /* JADX INFO: renamed from: d */
    public final File f149d;

    /* JADX INFO: renamed from: e */
    public final String f150e;

    /* JADX INFO: renamed from: f */
    public boolean f151f = false;

    /* JADX INFO: renamed from: g */
    public C0192Ed[] f152g;

    /* JADX INFO: renamed from: h */
    public byte[] f153h;

    public C0063Bd(AssetManager assetManager, Executor executor, InterfaceC0080Bu interfaceC0080Bu, String str, File file) {
        byte[] bArr;
        this.f146a = executor;
        this.f147b = interfaceC0080Bu;
        this.f150e = str;
        this.f149d = file;
        int i = Build.VERSION.SDK_INT;
        if (i < 31) {
            switch (i) {
                case 28:
                case 29:
                case 30:
                    bArr = AbstractC0148Dc.f394k;
                    break;
                default:
                    bArr = null;
                    break;
            }
        } else {
            bArr = AbstractC0148Dc.f393j;
        }
        this.f148c = bArr;
    }

    /* JADX INFO: renamed from: a */
    public final FileInputStream m98a(AssetManager assetManager, String str) {
        try {
            return assetManager.openFd(str).createInputStream();
        } catch (FileNotFoundException e) {
            String message = e.getMessage();
            if (message == null) {
                return null;
            }
            message.contains("compressed");
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m99b(int i, Serializable serializable) {
        this.f146a.execute(new RunnableC0662Pa(this, serializable, i, 2));
    }
}
