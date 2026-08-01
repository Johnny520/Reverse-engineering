package androidx.core.view;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import androidx.appcompat.app.C0076;
import java.util.Objects;
import java.util.WeakHashMap;
import p164.C7664;

/* JADX INFO: renamed from: androidx.core.view.飘花落叶言子苏兰楪世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnApplyWindowInsetsListenerC2276 implements View.OnApplyWindowInsetsListener {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public C2225 f6608;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final AbstractC2279 f6609;

    public ViewOnApplyWindowInsetsListenerC2276(View view, AbstractC2279 abstractC2279) {
        C2225 c2225Mo4046;
        this.f6609 = abstractC2279;
        WeakHashMap weakHashMap = AbstractC2270.f6593;
        C2225 c2225M3983 = AbstractC2189.m3983(view);
        if (c2225M3983 != null) {
            int i = Build.VERSION.SDK_INT;
            c2225Mo4046 = (i >= 36 ? new C2220(c2225M3983) : i >= 35 ? new C2221(c2225M3983) : i >= 34 ? new C2233(c2225M3983) : i >= 31 ? new C2232(c2225M3983) : i >= 30 ? new C2235(c2225M3983) : i >= 29 ? new C2234(c2225M3983) : new C2231(c2225M3983)).mo4046();
        } else {
            c2225Mo4046 = null;
        }
        this.f6608 = c2225Mo4046;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        int[] iArr;
        boolean z;
        if (!view.isLaidOut()) {
            this.f6608 = C2225.m4053(view, windowInsets);
            return C2277.m4254(view, windowInsets);
        }
        C2225 c2225M4053 = C2225.m4053(view, windowInsets);
        C2238 c2238 = c2225M4053.f6520;
        if (this.f6608 == null) {
            WeakHashMap weakHashMap = AbstractC2270.f6593;
            this.f6608 = AbstractC2189.m3983(view);
        }
        if (this.f6608 == null) {
            this.f6608 = c2225M4053;
            return C2277.m4254(view, windowInsets);
        }
        AbstractC2279 abstractC2279M4252 = C2277.m4252(view);
        if (abstractC2279M4252 != null && Objects.equals((C2225) abstractC2279M4252.f6619, c2225M4053)) {
            return C2277.m4254(view, windowInsets);
        }
        int[] iArr2 = new int[1];
        int[] iArr3 = new int[1];
        C2225 c2225 = this.f6608;
        int i = 1;
        while (i <= 512) {
            C7664 c7664Mo4042 = c2238.mo4042(i);
            C7664 c7664Mo40422 = c2225.f6520.mo4042(i);
            int i2 = c7664Mo4042.f20815;
            int i3 = c7664Mo4042.f20812;
            int i4 = c7664Mo4042.f20813;
            int i5 = c7664Mo4042.f20814;
            int i6 = c7664Mo40422.f20815;
            int i7 = c7664Mo40422.f20812;
            int i8 = c7664Mo40422.f20813;
            int i9 = c7664Mo40422.f20814;
            if (i2 > i6 || i5 > i9 || i4 > i8 || i3 > i7) {
                iArr = iArr2;
                z = true;
            } else {
                iArr = iArr2;
                z = false;
            }
            if (z != (i2 < i6 || i5 < i9 || i4 < i8 || i3 < i7)) {
                if (z) {
                    iArr[0] = iArr[0] | i;
                } else {
                    iArr3[0] = iArr3[0] | i;
                }
            }
            i <<= 1;
            iArr2 = iArr;
        }
        int i10 = 0;
        int i11 = iArr2[0];
        int i12 = iArr3[0];
        int i13 = i11 | i12;
        if (i13 == 0) {
            this.f6608 = c2225M4053;
            return C2277.m4254(view, windowInsets);
        }
        C2225 c22252 = this.f6608;
        C2274 c2274 = new C2274(i13, (i11 & 8) != 0 ? C2277.f6611 : (i12 & 8) != 0 ? C2277.f6610 : (i11 & 519) != 0 ? C2277.f6613 : (i12 & 519) != 0 ? C2277.f6612 : null, (i13 & 8) != 0 ? 160L : 250L);
        c2274.f6603.mo4243(0.0f);
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(c2274.f6603.mo4246());
        C7664 c7664Mo40423 = c2238.mo4042(i13);
        C7664 c7664Mo40424 = c22252.f6520.mo4042(i13);
        int iMin = Math.min(c7664Mo40423.f20815, c7664Mo40424.f20815);
        int i14 = c7664Mo40423.f20814;
        int i15 = c7664Mo40424.f20814;
        int iMin2 = Math.min(i14, i15);
        int i16 = c7664Mo40423.f20813;
        int i17 = c7664Mo40424.f20813;
        int iMin3 = Math.min(i16, i17);
        int i18 = c7664Mo40423.f20812;
        int i19 = c7664Mo40424.f20812;
        C0076 c0076 = new C0076(C7664.m12910(iMin, iMin2, iMin3, Math.min(i18, i19)), 12, C7664.m12910(Math.max(c7664Mo40423.f20815, c7664Mo40424.f20815), Math.max(i14, i15), Math.max(i16, i17), Math.max(i18, i19)));
        C2277.m4251(view, c2274, c2225M4053, false);
        duration.addUpdateListener(new C2278(c2274, c2225M4053, c22252, i13, view));
        duration.addListener(new C2281(c2274, i10, view));
        ViewTreeObserverOnPreDrawListenerC2203.m4000(view, new RunnableC2280(view, c2274, c0076, duration));
        this.f6608 = c2225M4053;
        return C2277.m4254(view, windowInsets);
    }
}
