package com.abc.ui;

import android.app.Dialog;
import p007D0.C0146l;
import p029P0.InterfaceC0275a;
import p031Q0.AbstractC0307g;

/* JADX INFO: renamed from: d0.d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0743d implements InterfaceC0275a {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f2581a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Dialog f2582b;

    public /* synthetic */ C0743d(Dialog r1, int r2) {
        this.f2581a = r2;
        this.f2582b = r1;
    }

    @Override // p029P0.InterfaceC0275a
    public final Object invoke() {
        switch(this.f2581a) {
            case 0: goto L6;
            default: goto L4;
        };
    L4:
        Dialog r1 = this.f2582b;
        AbstractC0307g.m703e(r1, "$dialog");
        r1.dismiss();
        return C0146l.f339a;
    L6:
        Dialog r12 = this.f2582b;
        AbstractC0307g.m703e(r12, "$dialog");
        r12.dismiss();
        return C0146l.f339a;
    }
}
