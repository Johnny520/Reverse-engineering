package defpackage;

import androidx.appcompat.widget.ActionBarOverlayLayout;

/* JADX INFO: loaded from: classes.dex */
public final class z0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ActionBarOverlayLayout b;

    public /* synthetic */ z0(ActionBarOverlayLayout r1, int r2) {
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
        ActionBarOverlayLayout r0 = this.b;
        r0.h();
        r0.w = r0.d.animate().translationY(-r0.d.getHeight()).setListener(r0.x);
        return;
    L6:
        ActionBarOverlayLayout r02 = this.b;
        r02.h();
        r02.w = r02.d.animate().translationY(0.0f).setListener(r02.x);
    }
}
