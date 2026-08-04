package yyds;

import android.view.View;
import android.view.WindowInsets;

/* JADX INFO: renamed from: yyds.ᛳᲈᲈᛶ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnApplyWindowInsetsListenerC0761 implements View.OnApplyWindowInsetsListener {

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC2208 f3510;

    public ViewOnApplyWindowInsetsListenerC0761(View view, InterfaceC2208 interfaceC2208) {
        this.f3510 = interfaceC2208;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        return this.f3510.mo1441(view, C2693.m4783(view, windowInsets)).m4784();
    }
}
