package p000;

import android.content.res.AssetManager;
import android.os.Build;
import java.io.File;
import java.io.FileInputStream;
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
    public boolean f151f;

    /* JADX INFO: renamed from: g */
    public C0192Ed[] f152g;

    /* JADX INFO: renamed from: h */
    public byte[] f153h;

    public C0063Bd(AssetManager r1, Executor r2, InterfaceC0080Bu r3, String r4, File r5) {
        this.f151f = false;
        this.f146a = r2;
        this.f147b = r3;
        this.f150e = r4;
        this.f149d = r5;
        int r12 = Build.VERSION.SDK_INT;
        if (r12 < 31) goto L5;
        byte[] r13 = AbstractC0148Dc.f393j;
    L8:
        this.f148c = r13;
        return;
    L5:
        switch(r12) {
            case 28: goto L7;
            case 29: goto L7;
            case 30: goto L7;
            default: goto L6;
        };
    L6:
        r13 = null;
        goto L8
    L7:
        r13 = AbstractC0148Dc.f394k;
        goto L8
    }

    /* JADX INFO: renamed from: a */
    public final FileInputStream m98a(AssetManager r1, String r2) {
        return r1.openFd(r2).createInputStream();
    L4:
        e = move-exception;
        String r12 = e.getMessage();
        if (r12 == null) goto L12;
        r12.contains("compressed");
        return null;
    L12:
        return null;
    }

    /* JADX INFO: renamed from: b */
    public final void m99b(int r3, Serializable r4) {
        RunnableC0662Pa r0 = new RunnableC0662Pa(this, r4, r3, 2);
        this.f146a.execute(r0);
    }
}
