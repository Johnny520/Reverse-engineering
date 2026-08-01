package defpackage;

import androidx.appcompat.widget.Toolbar;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c70 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Toolbar b;

    public /* synthetic */ c70(Toolbar r1, int r2) {
        this.a = r2;
        this.b = r1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch(this.a) {
            case 0: goto L6;
            default: goto L4;
        };
    L4:
        this.b.n();
        return;
    L6:
        f70 r0 = this.b.L;
        if (r0 != null) goto L9;
        ou r02 = null;
    L10:
        if (r02 == null) goto L13;
        r02.collapseActionView();
        return;
    L13:
        return;
    L9:
        r02 = r0.b;
        goto L10
    }
}
