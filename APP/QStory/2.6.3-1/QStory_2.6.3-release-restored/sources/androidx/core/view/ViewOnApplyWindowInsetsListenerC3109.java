package androidx.core.view;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import androidx.appcompat.app.C0923;
import java.util.Objects;
import java.util.WeakHashMap;
import p180.C8494;

/* JADX INFO: renamed from: androidx.core.view.飘花落叶言子苏兰楪世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnApplyWindowInsetsListenerC3109 implements View.OnApplyWindowInsetsListener {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public C3058 f6954;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final AbstractC3112 f6955;

    public ViewOnApplyWindowInsetsListenerC3109(View view, AbstractC3112 abstractC3112) {
        C3058 c3058Mo4616;
        this.f6955 = abstractC3112;
        WeakHashMap weakHashMap = AbstractC3103.f6939;
        C3058 c3058M4553 = AbstractC3022.m4553(view);
        if (c3058M4553 != null) {
            int i = Build.VERSION.SDK_INT;
            c3058Mo4616 = (i >= 36 ? new C3053(c3058M4553) : i >= 35 ? new C3054(c3058M4553) : i >= 34 ? new C3066(c3058M4553) : i >= 31 ? new C3065(c3058M4553) : i >= 30 ? new C3068(c3058M4553) : i >= 29 ? new C3067(c3058M4553) : new C3064(c3058M4553)).mo4616();
        } else {
            c3058Mo4616 = null;
        }
        this.f6954 = c3058Mo4616;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        int[] iArr;
        boolean z;
        if (!view.isLaidOut()) {
            this.f6954 = C3058.m4623(view, windowInsets);
            return C3110.m4824(view, windowInsets);
        }
        C3058 c3058M4623 = C3058.m4623(view, windowInsets);
        C3071 c3071 = c3058M4623.f6866;
        if (this.f6954 == null) {
            WeakHashMap weakHashMap = AbstractC3103.f6939;
            this.f6954 = AbstractC3022.m4553(view);
        }
        if (this.f6954 == null) {
            this.f6954 = c3058M4623;
            return C3110.m4824(view, windowInsets);
        }
        AbstractC3112 abstractC3112M4822 = C3110.m4822(view);
        if (abstractC3112M4822 != null && Objects.equals((C3058) abstractC3112M4822.f6965, c3058M4623)) {
            return C3110.m4824(view, windowInsets);
        }
        int[] iArr2 = new int[1];
        int[] iArr3 = new int[1];
        C3058 c3058 = this.f6954;
        int i = 1;
        while (i <= 512) {
            C8494 c8494Mo4612 = c3071.mo4612(i);
            C8494 c8494Mo46122 = c3058.f6866.mo4612(i);
            int i2 = c8494Mo4612.f21155;
            int i3 = c8494Mo4612.f21152;
            int i4 = c8494Mo4612.f21153;
            int i5 = c8494Mo4612.f21154;
            int i6 = c8494Mo46122.f21155;
            int i7 = c8494Mo46122.f21152;
            int i8 = c8494Mo46122.f21153;
            int i9 = c8494Mo46122.f21154;
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
            this.f6954 = c3058M4623;
            return C3110.m4824(view, windowInsets);
        }
        C3058 c30582 = this.f6954;
        C3107 c3107 = new C3107(i13, (i11 & 8) != 0 ? C3110.f6957 : (i12 & 8) != 0 ? C3110.f6956 : (i11 & 519) != 0 ? C3110.f6959 : (i12 & 519) != 0 ? C3110.f6958 : null, (i13 & 8) != 0 ? 160L : 250L);
        c3107.f6949.mo4813(0.0f);
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(c3107.f6949.mo4816());
        C8494 c8494Mo46123 = c3071.mo4612(i13);
        C8494 c8494Mo46124 = c30582.f6866.mo4612(i13);
        int iMin = Math.min(c8494Mo46123.f21155, c8494Mo46124.f21155);
        int i14 = c8494Mo46123.f21154;
        int i15 = c8494Mo46124.f21154;
        int iMin2 = Math.min(i14, i15);
        int i16 = c8494Mo46123.f21153;
        int i17 = c8494Mo46124.f21153;
        int iMin3 = Math.min(i16, i17);
        int i18 = c8494Mo46123.f21152;
        int i19 = c8494Mo46124.f21152;
        C0923 c0923 = new C0923(C8494.m13498(iMin, iMin2, iMin3, Math.min(i18, i19)), 12, C8494.m13498(Math.max(c8494Mo46123.f21155, c8494Mo46124.f21155), Math.max(i14, i15), Math.max(i16, i17), Math.max(i18, i19)));
        C3110.m4821(view, c3107, c3058M4623, false);
        duration.addUpdateListener(new C3111(c3107, c3058M4623, c30582, i13, view));
        duration.addListener(new C3114(c3107, i10, view));
        ViewTreeObserverOnPreDrawListenerC3036.m4570(view, new RunnableC3113(view, c3107, c0923, duration));
        this.f6954 = c3058M4623;
        return C3110.m4824(view, windowInsets);
    }
}
