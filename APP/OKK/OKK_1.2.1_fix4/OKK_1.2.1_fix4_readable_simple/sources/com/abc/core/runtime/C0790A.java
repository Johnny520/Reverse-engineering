package com.abc.core.runtime;

import android.app.Dialog;
import android.window.OnBackInvokedCallback;
import p031Q0.AbstractC0307g;

/* JADX INFO: renamed from: f0.A */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0790A implements OnBackInvokedCallback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f2869a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f2870b;

    public /* synthetic */ C0790A(int r1, Object r2) {
        this.f2869a = r1;
        this.f2870b = r2;
    }

    @Override // android.window.OnBackInvokedCallback
    public final void onBackInvoked() {
        switch(this.f2869a) {
            case 0: goto L6;
            default: goto L4;
        };
    L4:
        ((Runnable) this.f2870b).run();
        return;
    L6:
        Dialog r02 = (Dialog) this.f2870b;
        AbstractC0307g.m703e(r02, "$dialog");
        r02.dismiss();
    }
}
