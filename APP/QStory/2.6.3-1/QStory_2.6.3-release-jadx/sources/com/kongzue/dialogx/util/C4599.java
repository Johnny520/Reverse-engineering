package com.kongzue.dialogx.util;

import android.widget.RelativeLayout;
import com.kongzue.dialogx.interfaces.InterfaceC4578;
import com.kongzue.dialogx.util.views.MaxRelativeLayout;
import p273.C9052;
import p273.C9056;
import p273.C9068;
import p273.C9069;

/* JADX INFO: renamed from: com.kongzue.dialogx.util.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C4599 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public float f12071;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public float f12072;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public boolean f12073;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public void m8650(C9056 c9056, C9052 c9052) {
        RelativeLayout relativeLayout;
        if (c9056 == null || c9052 == null || (relativeLayout = c9052.f23028) == null) {
            return;
        }
        boolean z = c9056.f23050;
        RelativeLayout relativeLayout2 = c9052.f23027;
        InterfaceC4578 interfaceC4578 = c9052.f23034;
        if (z) {
            if (interfaceC4578 == null) {
                relativeLayout = relativeLayout2;
            }
            relativeLayout.setOnTouchListener(new ViewOnTouchListenerC4602(this, c9052, c9056));
        } else {
            if (interfaceC4578 == null) {
                relativeLayout = relativeLayout2;
            }
            if (interfaceC4578 != null) {
                interfaceC4578.mo8624(false);
            }
            relativeLayout.setOnTouchListener(null);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public void m8651(C9069 c9069, C9068 c9068) {
        MaxRelativeLayout maxRelativeLayout;
        if (c9069 == null || c9068 == null || (maxRelativeLayout = c9068.f23084) == null || c9068.f23098 == null) {
            return;
        }
        if (c9069.m14321()) {
            maxRelativeLayout.setOnTouchListener(new ViewOnTouchListenerC4600(this, c9069, c9068, maxRelativeLayout));
            return;
        }
        InterfaceC4578 interfaceC4578 = c9068.f23098;
        if (interfaceC4578 != null) {
            interfaceC4578.mo8624(false);
        }
        maxRelativeLayout.setOnTouchListener(null);
    }
}
