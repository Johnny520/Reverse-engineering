package com.abc.ui;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import p031Q0.AbstractC0307g;
import p037U.AbstractC0358S;

/* JADX INFO: renamed from: d0.o */
/* JADX INFO: loaded from: classes.dex */
public final class C0754o extends ViewOutlineProvider {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ float f2629a;

    public C0754o(float f2) {
        this.f2629a = f2;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        AbstractC0307g.m703e(view, "view");
        AbstractC0307g.m703e(outline, "outline");
        outline.setRoundRect(0, 0, AbstractC0358S.m883e(18, this.f2629a) + view.getWidth(), view.getHeight(), AbstractC0358S.m883e(18, r1));
    }
}
