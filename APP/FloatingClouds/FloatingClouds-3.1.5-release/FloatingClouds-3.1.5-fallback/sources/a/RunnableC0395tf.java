package a;

/* JADX INFO: renamed from: a.tf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0395tf implements java.lang.Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f699a;
    public final /* synthetic */ androidx.appcompat.widget.Toolbar b;

    public /* synthetic */ RunnableC0395tf(androidx.appcompat.widget.Toolbar r1, int r2) {
            r0 = this;
            r0.f699a = r2
            r0.b = r1
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r1 = this;
            int r0 = r1.f699a
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
            androidx.appcompat.widget.Toolbar$f r0 = r0.M
            if (r0 != 0) goto L13
            r0 = 0
            goto L15
        L13:
            androidx.appcompat.view.menu.h r0 = r0.b
        L15:
            if (r0 == 0) goto L1a
            r0.collapseActionView()
        L1a:
            return
    }
}
