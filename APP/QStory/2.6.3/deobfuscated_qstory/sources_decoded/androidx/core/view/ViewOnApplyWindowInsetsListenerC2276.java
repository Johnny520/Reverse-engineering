package androidx.core.view;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import androidx.appcompat.app.C0076;
import java.util.Objects;
import java.util.WeakHashMap;
import p164.C7665;

/* JADX INFO: renamed from: androidx.core.view.飘花落叶言子苏兰楪世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnApplyWindowInsetsListenerC2276 implements View.OnApplyWindowInsetsListener {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public C2225 f6609;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final AbstractC2279 f6610;

    public ViewOnApplyWindowInsetsListenerC2276(View view, AbstractC2279 abstractC2279) {
        C2225 c2225Mo4056;
        this.f6610 = abstractC2279;
        WeakHashMap weakHashMap = AbstractC2270.f6594;
        C2225 c2225M3993 = AbstractC2189.m3993(view);
        if (c2225M3993 != null) {
            int i = Build.VERSION.SDK_INT;
            c2225Mo4056 = (i >= 36 ? new C2220(c2225M3993) : i >= 35 ? new C2221(c2225M3993) : i >= 34 ? new C2233(c2225M3993) : i >= 31 ? new C2232(c2225M3993) : i >= 30 ? new C2235(c2225M3993) : i >= 29 ? new C2234(c2225M3993) : new C2231(c2225M3993)).mo4056();
        } else {
            c2225Mo4056 = null;
        }
        this.f6609 = c2225Mo4056;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        int[] iArr;
        boolean z;
        if (!view.isLaidOut()) {
            this.f6609 = C2225.m4063(view, windowInsets);
            return C2277.m4264(view, windowInsets);
        }
        C2225 c2225M4063 = C2225.m4063(view, windowInsets);
        C2238 c2238 = c2225M4063.f6521;
        if (this.f6609 == null) {
            WeakHashMap weakHashMap = AbstractC2270.f6594;
            this.f6609 = AbstractC2189.m3993(view);
        }
        if (this.f6609 == null) {
            this.f6609 = c2225M4063;
            return C2277.m4264(view, windowInsets);
        }
        AbstractC2279 abstractC2279M4262 = C2277.m4262(view);
        if (abstractC2279M4262 != null && Objects.equals((C2225) abstractC2279M4262.f6620, c2225M4063)) {
            return C2277.m4264(view, windowInsets);
        }
        int[] iArr2 = new int[1];
        int[] iArr3 = new int[1];
        C2225 c2225 = this.f6609;
        int i = 1;
        while (i <= 512) {
            C7665 c7665Mo4052 = c2238.mo4052(i);
            C7665 c7665Mo40522 = c2225.f6521.mo4052(i);
            int i2 = c7665Mo4052.f20810;
            int i3 = c7665Mo4052.f20807;
            int i4 = c7665Mo4052.f20808;
            int i5 = c7665Mo4052.f20809;
            int i6 = c7665Mo40522.f20810;
            int i7 = c7665Mo40522.f20807;
            int i8 = c7665Mo40522.f20808;
            int i9 = c7665Mo40522.f20809;
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
            this.f6609 = c2225M4063;
            return C2277.m4264(view, windowInsets);
        }
        C2225 c22252 = this.f6609;
        C2274 c2274 = new C2274(i13, (i11 & 8) != 0 ? C2277.f6612 : (i12 & 8) != 0 ? C2277.f6611 : (i11 & 519) != 0 ? C2277.f6614 : (i12 & 519) != 0 ? C2277.f6613 : null, (i13 & 8) != 0 ? 160L : 250L);
        c2274.f6604.mo4253(0.0f);
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(c2274.f6604.mo4256());
        C7665 c7665Mo40523 = c2238.mo4052(i13);
        C7665 c7665Mo40524 = c22252.f6521.mo4052(i13);
        int iMin = Math.min(c7665Mo40523.f20810, c7665Mo40524.f20810);
        int i14 = c7665Mo40523.f20809;
        int i15 = c7665Mo40524.f20809;
        int iMin2 = Math.min(i14, i15);
        int i16 = c7665Mo40523.f20808;
        int i17 = c7665Mo40524.f20808;
        int iMin3 = Math.min(i16, i17);
        int i18 = c7665Mo40523.f20807;
        int i19 = c7665Mo40524.f20807;
        C0076 c0076 = new C0076(C7665.m12939(iMin, iMin2, iMin3, Math.min(i18, i19)), 12, C7665.m12939(Math.max(c7665Mo40523.f20810, c7665Mo40524.f20810), Math.max(i14, i15), Math.max(i16, i17), Math.max(i18, i19)));
        C2277.m4261(view, c2274, c2225M4063, false);
        duration.addUpdateListener(new C2278(c2274, c2225M4063, c22252, i13, view));
        duration.addListener(new C2281(c2274, i10, view));
        ViewTreeObserverOnPreDrawListenerC2203.m4010(view, new RunnableC2280(view, c2274, c0076, duration));
        this.f6609 = c2225M4063;
        return C2277.m4264(view, windowInsets);
    }
}
