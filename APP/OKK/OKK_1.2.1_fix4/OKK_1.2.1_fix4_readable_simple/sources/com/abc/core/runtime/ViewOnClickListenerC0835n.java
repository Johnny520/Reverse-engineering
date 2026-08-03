package com.abc.core.runtime;

import android.view.View;
import android.widget.Switch;
import p031Q0.AbstractC0307g;

/* JADX INFO: renamed from: f0.n */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ViewOnClickListenerC0835n implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f3020a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Switch f3021b;

    public /* synthetic */ ViewOnClickListenerC0835n(Switch r1, int r2) {
        this.f3020a = r2;
        this.f3021b = r1;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View r2) {
        switch(this.f3020a) {
            case 0: goto L6;
            default: goto L4;
        };
    L4:
        Switch r02 = this.f3021b;
        AbstractC0307g.m703e(r02, "$sw");
        r02.toggle();
        return;
    L6:
        Switch r03 = this.f3021b;
        AbstractC0307g.m703e(r03, "$sw");
        r03.toggle();
    }
}
