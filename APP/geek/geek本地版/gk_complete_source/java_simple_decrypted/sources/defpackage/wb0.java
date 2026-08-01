package defpackage;

import android.view.View;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class wb0 extends ct {
    public final /* synthetic */ int d;
    public final /* synthetic */ yb0 e;

    public /* synthetic */ wb0(yb0 r1, int r2) {
        this.d = r2;
        this.e = r1;
    }

    @Override // defpackage.ya0
    public final void a() {
        int r0 = this.d;
        yb0 r2 = this.e;
        switch(r0) {
            case 0: goto L7;
            default: goto L4;
        };
    L4:
        r2.O = null;
        r2.z.requestLayout();
        return;
    L7:
        if (r2.K == false) goto L11;
        View r02 = r2.C;
        if (r02 == null) goto L11;
        r02.setTranslationY(0.0f);
        r2.z.setTranslationY(0.0f);
    L11:
        r2.z.setVisibility(8);
        r2.z.setTransitioning(false);
        r2.O = null;
        d4 r03 = r2.G;
        if (r03 == null) goto L14;
        r03.D(r2.F);
        r2.F = null;
        r2.G = null;
    L14:
        ActionBarOverlayLayout r04 = r2.y;
        if (r04 == null) goto L18;
        WeakHashMap r1 = ja0.a;
        w90.c(r04);
        return;
    }
}
