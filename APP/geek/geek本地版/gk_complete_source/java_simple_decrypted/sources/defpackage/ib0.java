package defpackage;

import android.animation.Animator;
import android.view.View;
import android.view.ViewGroup;
import com.ljx.wechatmod.R;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class ib0 extends s70 {
    public final /* synthetic */ ViewGroup a;
    public final /* synthetic */ View b;
    public final /* synthetic */ View c;
    public final /* synthetic */ pj d;

    public ib0(pj r1, ViewGroup r2, View r3, View r4) {
        this.d = r1;
        this.a = r2;
        this.b = r3;
        this.c = r4;
    }

    @Override // defpackage.s70, defpackage.q70
    public final void c() {
        this.a.getOverlay().remove(this.b);
    }

    @Override // defpackage.s70, defpackage.q70
    public final void d() {
        View r0 = this.b;
        if (r0.getParent() != null) goto L6;
        this.a.getOverlay().add(r0);
        return;
    L6:
        pj r02 = this.d;
        ArrayList r1 = r02.m;
        int r2 = r1.size() - 1;
    L7:
        if (r2 < 0) goto L9;
        ((Animator) r1.get(r2)).cancel();
        r2 = r2 - 1;
        goto L7
    L9:
        ArrayList r12 = r02.q;
        if (r12 != null) goto L12;
        return;
    L12:
        if (r12.size() <= 0) goto L19;
        ArrayList r03 = (ArrayList) r02.q.clone();
        int r13 = r03.size();
        int r22 = 0;
    L14:
        if (r22 >= r13) goto L20;
        ((q70) r03.get(r22)).a();
        r22 = r22 + 1;
        goto L14
    L20:
        return;
    }

    @Override // defpackage.q70
    public final void e(r70 r4) {
        this.c.setTag(R.id.save_overlay_view, null);
        this.a.getOverlay().remove(this.b);
        r4.u(this);
    }
}
