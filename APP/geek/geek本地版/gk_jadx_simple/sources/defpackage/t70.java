package defpackage;

import android.view.ViewGroup;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class t70 extends s70 {
    public final /* synthetic */ n6 a;
    public final /* synthetic */ u70 b;

    public t70(u70 r1, n6 r2) {
        this.b = r1;
        this.a = r2;
    }

    @Override // defpackage.q70
    public final void e(r70 r4) {
        ViewGroup r0 = this.b.b;
        ((ArrayList) this.a.getOrDefault(r0, null)).remove(r4);
        r4.u(this);
    }
}
