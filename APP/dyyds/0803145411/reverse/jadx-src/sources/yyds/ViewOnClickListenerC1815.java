package yyds;

import android.app.Dialog;
import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import java.io.Serializable;

/* JADX INFO: renamed from: yyds.ᛸᛷᛳᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ViewOnClickListenerC1815 implements View.OnClickListener {

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ Object f9129;

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public final /* synthetic */ Serializable f9130;

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final /* synthetic */ C0172 f9131;

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public final /* synthetic */ Object f9132;

    /* JADX INFO: renamed from: ᛷᛲᲈᛱ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC0557 f9133;

    /* JADX INFO: renamed from: ᛷᲈᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ Object f9134;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final /* synthetic */ int f9135 = 1;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public final /* synthetic */ C0172 f9136;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final /* synthetic */ C0172 f9137;

    public /* synthetic */ ViewOnClickListenerC1815(C2086 c2086, C0172 c0172, C2721 c2721, C0172 c01722, C0172 c01723, C0172 c01724, Dialog dialog, InterfaceC2266 interfaceC2266) {
        this.f9132 = c2086;
        this.f9137 = c0172;
        this.f9130 = c2721;
        this.f9131 = c01722;
        this.f9136 = c01723;
        this.f9129 = c01724;
        this.f9134 = dialog;
        this.f9133 = interfaceC2266;
    }

    @Override // android.view.View.OnClickListener
    public final native void onClick(View view);

    public /* synthetic */ ViewOnClickListenerC1815(C0172 c0172, String str, C0172 c01722, LinearLayout linearLayout, C0947 c0947, C0172 c01723, Context context, C0485 c0485) {
        this.f9137 = c0172;
        this.f9132 = str;
        this.f9131 = c01722;
        this.f9129 = linearLayout;
        this.f9130 = c0947;
        this.f9136 = c01723;
        this.f9134 = context;
        this.f9133 = c0485;
    }
}
