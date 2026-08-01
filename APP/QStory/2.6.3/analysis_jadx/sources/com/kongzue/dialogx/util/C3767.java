package com.kongzue.dialogx.util;

import android.widget.RelativeLayout;
import com.kongzue.dialogx.interfaces.InterfaceC3746;
import com.kongzue.dialogx.util.views.MaxRelativeLayout;
import p257.C8223;
import p257.C8227;
import p257.C8239;
import p257.C8240;

/* JADX INFO: renamed from: com.kongzue.dialogx.util.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3767 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public float f11726;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public float f11727;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public boolean f11728;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public void m8091(C8227 c8227, C8223 c8223) {
        RelativeLayout relativeLayout;
        if (c8227 == null || c8223 == null || (relativeLayout = c8223.f22683) == null) {
            return;
        }
        boolean z = c8227.f22705;
        RelativeLayout relativeLayout2 = c8223.f22682;
        InterfaceC3746 interfaceC3746 = c8223.f22689;
        if (z) {
            if (interfaceC3746 == null) {
                relativeLayout = relativeLayout2;
            }
            relativeLayout.setOnTouchListener(new ViewOnTouchListenerC3770(this, c8223, c8227));
        } else {
            if (interfaceC3746 == null) {
                relativeLayout = relativeLayout2;
            }
            if (interfaceC3746 != null) {
                interfaceC3746.mo8065(false);
            }
            relativeLayout.setOnTouchListener(null);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public void m8092(C8240 c8240, C8239 c8239) {
        MaxRelativeLayout maxRelativeLayout;
        if (c8240 == null || c8239 == null || (maxRelativeLayout = c8239.f22739) == null || c8239.f22753 == null) {
            return;
        }
        if (c8240.m13762()) {
            maxRelativeLayout.setOnTouchListener(new ViewOnTouchListenerC3768(this, c8240, c8239, maxRelativeLayout));
            return;
        }
        InterfaceC3746 interfaceC3746 = c8239.f22753;
        if (interfaceC3746 != null) {
            interfaceC3746.mo8065(false);
        }
        maxRelativeLayout.setOnTouchListener(null);
    }
}
