package defpackage;

import android.view.View;
import androidx.appcompat.widget.Toolbar;

/* JADX INFO: loaded from: classes.dex */
public final class x0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ x0(int r1, Object r2) {
        this.a = r1;
        this.b = r2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View r4) {
        switch(this.a) {
            case 0: goto L19;
            case 1: goto L17;
            case 2: goto L11;
            default: goto L4;
        };
    L4:
        f70 r42 = ((Toolbar) this.b).L;
        if (r42 != null) goto L7;
        ou r43 = null;
    L8:
        if (r43 == null) goto L21;
        r43.collapseActionView();
        return;
    L21:
        return;
    L7:
        r43 = r42.b;
        goto L8
    L11:
        ut r44 = (ut) this.b;
        int r0 = r44.V;
        if (r0 != 2) goto L14;
        r44.E(1);
        return;
    L14:
        if (r0 != 1) goto L23;
        r44.E(2);
        return;
    L23:
        return;
    L17:
        e2 r45 = (e2) this.b;
        r45.v.obtainMessage(1, r45.b).sendToTarget();
        return;
    L19:
        ((n1) this.b).a();
    }
}
