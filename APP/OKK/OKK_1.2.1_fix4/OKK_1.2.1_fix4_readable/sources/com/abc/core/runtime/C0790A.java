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

    public /* synthetic */ C0790A(int i2, Object obj) {
        this.f2869a = i2;
        this.f2870b = obj;
    }

    @Override // android.window.OnBackInvokedCallback
    public final void onBackInvoked() {
        switch (this.f2869a) {
            case 0:
                Dialog dialog = (Dialog) this.f2870b;
                AbstractC0307g.m703e(dialog, "$dialog");
                dialog.dismiss();
                break;
            default:
                ((Runnable) this.f2870b).run();
                break;
        }
    }
}
