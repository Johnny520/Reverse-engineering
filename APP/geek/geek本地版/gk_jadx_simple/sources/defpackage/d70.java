package defpackage;

import android.view.MenuItem;
import androidx.appcompat.widget.Toolbar;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class d70 implements m1, iu {
    public final /* synthetic */ Toolbar a;

    public /* synthetic */ d70(Toolbar r1) {
        this.a = r1;
    }

    @Override // defpackage.iu
    public void k(ku r2) {
        Toolbar r22 = this.a;
        j1 r0 = r22.a.t;
        if (r0 != null) goto L5;
    L7:
        Iterator r23 = ((CopyOnWriteArrayList) r22.G.c).iterator();
        if (r23.hasNext() == true) goto L11;
        return;
    L11:
        throw z30.h(r23);
    L5:
        if (r0.j() == false) goto L7;
    }

    @Override // defpackage.iu
    public boolean n(ku r1, MenuItem r2) {
        this.a.getClass();
        return false;
    }
}
