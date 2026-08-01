package defpackage;

import java.io.File;

/* JADX INFO: loaded from: classes.dex */
public final class ck extends bk {
    public boolean b;
    public File[] c;
    public int d;
    public boolean e;

    @Override // defpackage.gk
    public final File a() {
        boolean r0 = this.e;
        File r1 = this.a;
        if (r0 == false) goto L5;
    L9:
        File[] r02 = this.c;
        if (r02 == null) goto L16;
        if (this.d >= r02.length) goto L16;
        ip.l(r02);
        int r12 = this.d;
        this.d = r12 + 1;
        return r02[r12];
    L16:
        if (this.b == true) goto L19;
        this.b = true;
        return r1;
    L19:
        return null;
    L5:
        if (this.c != null) goto L9;
        File[] r03 = r1.listFiles();
        this.c = r03;
        if (r03 != null) goto L9;
        this.e = true;
        goto L9
    }
}
