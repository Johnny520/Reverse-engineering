package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c70 implements java.lang.Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ androidx.appcompat.widget.Toolbar b;

    public /* synthetic */ c70(androidx.appcompat.widget.Toolbar r1, int r2) {
            r0 = this;
            r0.a = r2
            r0.b = r1
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r1 = this;
            int r0 = r1.a
            switch(r0) {
                case 0: goto Lb;
                default: goto L5;
            }
        L5:
            androidx.appcompat.widget.Toolbar r0 = r1.b
            r0.n()
            return
        Lb:
            androidx.appcompat.widget.Toolbar r0 = r1.b
            f70 r0 = r0.L
            if (r0 != 0) goto L13
            r0 = 0
            goto L15
        L13:
            ou r0 = r0.b
        L15:
            if (r0 == 0) goto L1a
            r0.collapseActionView()
        L1a:
            return
    }
}
