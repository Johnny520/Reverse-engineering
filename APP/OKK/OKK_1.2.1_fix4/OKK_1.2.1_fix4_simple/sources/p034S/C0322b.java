package p034S;

import android.content.res.AssetManager;
import android.os.Build;
import java.io.File;
import java.io.FileInputStream;
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
    public boolean f618f;

    /* JADX INFO: renamed from: g */
    public C0323c[] f619g;

    /* JADX INFO: renamed from: h */
    public byte[] f620h;

    public C0322b(AssetManager r1, Executor r2, InterfaceC0326f r3, String r4, File r5) {
        this.f618f = false;
        this.f613a = r2;
        this.f614b = r3;
        this.f617e = r4;
        this.f616d = r5;
        int r12 = Build.VERSION.SDK_INT;
        byte[] r32 = null;
        if (r12 > 34) goto L11;
        switch(r12) {
            case 26: goto L10;
            case 27: goto L9;
            case 28: goto L8;
            case 29: goto L8;
            case 30: goto L8;
            case 31: goto L7;
            case 32: goto L7;
            case 33: goto L7;
            case 34: goto L7;
            default: goto L11;
        };
    L7:
        r32 = AbstractC0327g.f633d;
        goto L11
    L8:
        r32 = AbstractC0327g.f634e;
        goto L11
    L9:
        r32 = AbstractC0327g.f635f;
        goto L11
    L10:
        r32 = AbstractC0327g.f636g;
    L11:
        this.f615c = r32;
    }

    /* JADX INFO: renamed from: a */
    public final FileInputStream m716a(AssetManager r1, String r2) {
        return r1.openFd(r2).createInputStream();
    L4:
        e = move-exception;
        String r12 = e.getMessage();
        if (r12 != null) goto L8;
    L10:
        return null;
    L8:
        if (r12.contains("compressed") == false) goto L10;
        this.f614b.getClass();
        goto L10
    }

    /* JADX INFO: renamed from: b */
    public final void m717b(int r2, Serializable r3) {
        RunnableC0321a r02 = new RunnableC0321a(this, r2, r3);
        this.f613a.execute(r02);
    }
}
