package com.abc.core.features;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import p031Q0.AbstractC0307g;

/* JADX INFO: renamed from: c0.A0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0571A0 extends ViewOutlineProvider {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f1692a;

    public /* synthetic */ C0571A0(int r1) {
        this.f1692a = r1;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View r3, Outline r4) {
        switch(this.f1692a) {
            case 0: goto L6;
            default: goto L4;
        };
    L4:
        AbstractC0307g.m703e(r3, "view");
        AbstractC0307g.m703e(r4, "outline");
        r4.setOval(0, 0, r3.getWidth(), r3.getHeight());
        return;
    L6:
        AbstractC0307g.m703e(r3, "view");
        AbstractC0307g.m703e(r4, "outline");
        r4.setOval(0, 0, r3.getWidth(), r3.getHeight());
    }
}
