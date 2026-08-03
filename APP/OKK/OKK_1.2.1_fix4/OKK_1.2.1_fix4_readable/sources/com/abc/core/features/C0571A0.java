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

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        switch (this.f1692a) {
            case 0:
                AbstractC0307g.m703e(view, "view");
                AbstractC0307g.m703e(outline, "outline");
                outline.setOval(0, 0, view.getWidth(), view.getHeight());
                break;
            default:
                AbstractC0307g.m703e(view, "view");
                AbstractC0307g.m703e(outline, "outline");
                outline.setOval(0, 0, view.getWidth(), view.getHeight());
                break;
        }
    }
}
