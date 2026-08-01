package defpackage;

import android.content.res.AssetManager;
import android.os.Build;
import java.io.File;
import java.io.FileInputStream;
import java.io.Serializable;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class lg {
    public final Executor a;
    public final jy b;
    public final byte[] c;
    public final File d;
    public final String e;
    public boolean f;
    public mg[] g;
    public byte[] h;

    public lg(AssetManager r1, Executor r2, jy r3, String r4, File r5) {
        this.f = false;
        this.a = r2;
        this.b = r3;
        this.e = r4;
        this.d = r5;
        int r12 = Build.VERSION.SDK_INT;
        byte[] r32 = null;
        if (r12 > 33) goto L11;
        switch(r12) {
            case 26: goto L10;
            case 27: goto L9;
            case 28: goto L8;
            case 29: goto L8;
            case 30: goto L8;
            case 31: goto L7;
            case 32: goto L7;
            case 33: goto L7;
            default: goto L11;
        };
    L7:
        r32 = a80.i;
        goto L11
    L8:
        r32 = a80.j;
        goto L11
    L9:
        r32 = a80.k;
        goto L11
    L10:
        r32 = a80.l;
    L11:
        this.c = r32;
    }

    public final FileInputStream a(AssetManager r1, String r2) {
        return r1.openFd(r2).createInputStream();
    L4:
        e = move-exception;
        String r12 = e.getMessage();
        if (r12 != null) goto L8;
        return null;
    L8:
        if (r12.contains("compressed") == false) goto L15;
        this.b.g();
        return null;
    L15:
        return null;
    }

    public final void b(int r2, Serializable r3) {
        pd r0 = new pd(this, r2, r3);
        this.a.execute(r0);
    }
}
