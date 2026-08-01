package defpackage;

import android.os.Handler;
import android.view.View;
import android.view.Window;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.a;

/* JADX INFO: loaded from: classes.dex */
public final class nl extends ip implements sa0, oq, bm {
    public final FragmentActivity C;
    public final FragmentActivity D;
    public final Handler E;
    public final yl F;
    public final /* synthetic */ FragmentActivity G;

    public nl(FragmentActivity r3) {
        this.G = r3;
        Handler r0 = new Handler();
        this.F = new yl();
        this.C = r3;
        this.D = r3;
        this.E = r0;
    }

    @Override // defpackage.ip
    public final View G(int r2) {
        return this.G.findViewById(r2);
    }

    @Override // defpackage.ip
    public final boolean H() {
        Window r0 = this.G.getWindow();
        if (r0 != null) goto L5;
        return false;
    L5:
        if (r0.peekDecorView() == null) goto L10;
        return true;
    L10:
        return false;
    }

    @Override // defpackage.sa0
    public final ra0 d() {
        return this.G.d();
    }

    @Override // defpackage.oq
    public final a e() {
        return this.G.t;
    }

    @Override // defpackage.bm
    public final void a() {
    }
}
