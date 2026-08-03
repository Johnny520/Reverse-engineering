package androidx.appcompat.view.menu;

/* JADX INFO: loaded from: classes.dex */
public final class c implements java.lang.Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.view.menu.b.d f818a;
    public final /* synthetic */ androidx.appcompat.view.menu.h b;
    public final /* synthetic */ androidx.appcompat.view.menu.f c;
    public final /* synthetic */ androidx.appcompat.view.menu.b.c d;

    public c(androidx.appcompat.view.menu.b.c r1, androidx.appcompat.view.menu.b.d r2, androidx.appcompat.view.menu.h r3, androidx.appcompat.view.menu.f r4) {
            r0 = this;
            r0.<init>()
            r0.d = r1
            r0.f818a = r2
            r0.b = r3
            r0.c = r4
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r4 = this;
            androidx.appcompat.view.menu.b$d r0 = r4.f818a
            if (r0 == 0) goto L15
            androidx.appcompat.view.menu.b$c r1 = r4.d
            androidx.appcompat.view.menu.b r2 = r1.f816a
            r3 = 1
            r2.z = r3
            androidx.appcompat.view.menu.f r0 = r0.b
            r2 = 0
            r0.c(r2)
            androidx.appcompat.view.menu.b r0 = r1.f816a
            r0.z = r2
        L15:
            androidx.appcompat.view.menu.h r0 = r4.b
            boolean r1 = r0.isEnabled()
            if (r1 == 0) goto L2a
            boolean r1 = r0.hasSubMenu()
            if (r1 == 0) goto L2a
            androidx.appcompat.view.menu.f r1 = r4.c
            r2 = 4
            r3 = 0
            r1.q(r0, r3, r2)
        L2a:
            return
    }
}
