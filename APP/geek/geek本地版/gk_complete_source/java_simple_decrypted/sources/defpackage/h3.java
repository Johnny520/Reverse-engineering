package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class h3 extends ct {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ h3(int r1, Object r2) {
        this.d = r1;
        this.e = r2;
    }

    @Override // defpackage.ya0
    public final void a() {
        int r0 = this.d;
        Object r2 = this.e;
        switch(r0) {
            case 0: goto L14;
            case 1: goto L12;
            default: goto L4;
        };
    L4:
        r3 r02 = (r3) ((d4) r2).c;
        r02.v.setVisibility(8);
        PopupWindow r1 = r02.w;
        if (r1 == null) goto L8;
        r1.dismiss();
    L10:
        r02.v.e();
        r02.y.d(null);
        r02.y = null;
        ViewGroup r03 = r02.A;
        WeakHashMap r12 = ja0.a;
        w90.c(r03);
        return;
    L8:
        if ((r02.v.getParent() instanceof View) == false) goto L10;
        View r13 = (View) r02.v.getParent();
        WeakHashMap r22 = ja0.a;
        w90.c(r13);
        goto L10
    L12:
        r3 r23 = (r3) r2;
        r23.v.setAlpha(1.0f);
        r23.y.d(null);
        r23.y = null;
        return;
    L14:
        r3 r04 = ((f3) r2).b;
        r04.v.setAlpha(1.0f);
        r04.y.d(null);
        r04.y = null;
    }

    @Override // defpackage.ct, defpackage.ya0
    public void c() {
        int r0 = this.d;
        Object r2 = this.e;
        switch(r0) {
            case 0: goto L9;
            case 1: goto L5;
            default: goto L4;
        };
    L4:
        return;
    L5:
        r3 r22 = (r3) r2;
        r22.v.setVisibility(0);
        if ((r22.v.getParent() instanceof View) == false) goto L11;
        View r02 = (View) r22.v.getParent();
        WeakHashMap r1 = ja0.a;
        w90.c(r02);
        return;
    L11:
        return;
    L9:
        ((f3) r2).b.v.setVisibility(0);
    }
}
