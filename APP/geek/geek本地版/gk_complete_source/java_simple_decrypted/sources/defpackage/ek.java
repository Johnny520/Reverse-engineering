package defpackage;

import java.io.File;

/* JADX INFO: loaded from: classes.dex */
public final class ek extends bk {
    public boolean b;
    public File[] c;
    public int d;

    @Override // defpackage.gk
    public final File a() {
        boolean r0 = this.b;
        File r1 = this.a;
        if (r0 == true) goto L6;
        this.b = true;
        return r1;
    L6:
        File[] r02 = this.c;
        if (r02 != null) goto L9;
    L12:
        if (r02 != null) goto L18;
        File[] r03 = r1.listFiles();
        this.c = r03;
        if (r03 != null) goto L16;
    L17:
        return null;
    L16:
        if (r03.length == 0) goto L17;
    L18:
        File[] r04 = this.c;
        ip.l(r04);
        int r12 = this.d;
        this.d = r12 + 1;
        return r04[r12];
    L9:
        if (this.d < r02.length) goto L12;
        return null;
    }
}
