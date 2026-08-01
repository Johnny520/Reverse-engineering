package com.kongzue.dialogx.util;

import android.widget.RelativeLayout;
import com.kongzue.dialogx.interfaces.InterfaceC3745;
import com.kongzue.dialogx.util.views.MaxRelativeLayout;
import p257.C8222;
import p257.C8226;
import p257.C8238;
import p257.C8239;

/* JADX INFO: renamed from: com.kongzue.dialogx.util.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C3766 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public float f11721;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public float f11722;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public boolean f11723;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public void m8104(C8226 c8226, C8222 c8222) {
        RelativeLayout relativeLayout;
        if (c8226 == null || c8222 == null || (relativeLayout = c8222.f22684) == null) {
            return;
        }
        boolean z = c8226.f22706;
        RelativeLayout relativeLayout2 = c8222.f22683;
        InterfaceC3745 interfaceC3745 = c8222.f22690;
        if (z) {
            if (interfaceC3745 == null) {
                relativeLayout = relativeLayout2;
            }
            relativeLayout.setOnTouchListener(new ViewOnTouchListenerC3769(this, c8222, c8226));
        } else {
            if (interfaceC3745 == null) {
                relativeLayout = relativeLayout2;
            }
            if (interfaceC3745 != null) {
                interfaceC3745.mo8078(false);
            }
            relativeLayout.setOnTouchListener(null);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public void m8105(C8239 c8239, C8238 c8238) {
        MaxRelativeLayout maxRelativeLayout;
        if (c8239 == null || c8238 == null || (maxRelativeLayout = c8238.f22740) == null || c8238.f22754 == null) {
            return;
        }
        if (c8239.m13745()) {
            maxRelativeLayout.setOnTouchListener(new ViewOnTouchListenerC3767(this, c8239, c8238, maxRelativeLayout));
            return;
        }
        InterfaceC3745 interfaceC3745 = c8238.f22754;
        if (interfaceC3745 != null) {
            interfaceC3745.mo8078(false);
        }
        maxRelativeLayout.setOnTouchListener(null);
    }
}
