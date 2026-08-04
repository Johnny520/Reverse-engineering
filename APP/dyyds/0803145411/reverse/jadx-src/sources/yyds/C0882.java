package yyds;

import com.kongzue.dialogx.util.views.MaxRelativeLayout;

/* JADX INFO: renamed from: yyds.ᛴᛶᲁᛶ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0882 {

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public boolean f4035;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public float f4036;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public float f4037;

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final void m1972(C0763 c0763, C2457 c2457) {
        MaxRelativeLayout maxRelativeLayout;
        if (c0763 == null || c2457 == null || (maxRelativeLayout = c2457.f12146) == null || c2457.f12137 == null) {
            return;
        }
        if (c0763.m1711()) {
            maxRelativeLayout.setOnTouchListener(new ViewOnTouchListenerC1786(this, c0763, c2457, maxRelativeLayout));
            return;
        }
        InterfaceC2018 interfaceC2018 = c2457.f12137;
        if (interfaceC2018 != null) {
            interfaceC2018.mo293(false);
        }
        maxRelativeLayout.setOnTouchListener(null);
    }
}
