package com.abc.core.runtime;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import p031Q0.AbstractC0307g;

/* JADX INFO: renamed from: f0.S */
/* JADX INFO: loaded from: classes.dex */
public final class C0807S extends ViewOutlineProvider {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f2928a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f2929b;

    public /* synthetic */ C0807S(int i2, int i3) {
        this.f2928a = i3;
        this.f2929b = i2;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        switch (this.f2928a) {
            case 0:
                AbstractC0307g.m703e(view, "v");
                AbstractC0307g.m703e(outline, "outline");
                if (view.getWidth() > 0 && view.getHeight() > 0) {
                    outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), this.f2929b);
                    break;
                }
                break;
            default:
                AbstractC0307g.m703e(view, "v");
                AbstractC0307g.m703e(outline, "outline");
                if (view.getWidth() > 0 && view.getHeight() > 0) {
                    outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), this.f2929b);
                    break;
                }
                break;
        }
    }
}
