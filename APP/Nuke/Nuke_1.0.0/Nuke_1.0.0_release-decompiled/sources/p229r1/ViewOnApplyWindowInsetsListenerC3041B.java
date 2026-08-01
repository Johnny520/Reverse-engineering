package p229r1;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.Objects;
import p154e2.C2023b;
import p205n1.C2688b;

/* JADX INFO: renamed from: r1.B */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnApplyWindowInsetsListenerC3041B implements View.OnApplyWindowInsetsListener {

    /* JADX INFO: renamed from: a */
    public final AbstractC3094x f9726a;

    /* JADX INFO: renamed from: b */
    public C3070c0 f9727b;

    public ViewOnApplyWindowInsetsListenerC3041B(View view, AbstractC3094x abstractC3094x) {
        C3070c0 c3070c0Mo5322b;
        this.f9726a = abstractC3094x;
        int i5 = AbstractC3092v.f9811a;
        C3070c0 c3070c0M5401a = AbstractC3088r.m5401a(view);
        if (c3070c0M5401a != null) {
            int i6 = Build.VERSION.SDK_INT;
            c3070c0Mo5322b = (i6 >= 36 ? new C3054O(c3070c0M5401a) : i6 >= 35 ? new C3053N(c3070c0M5401a) : i6 >= 34 ? new C3052M(c3070c0M5401a) : i6 >= 31 ? new C3051L(c3070c0M5401a) : i6 >= 30 ? new C3050K(c3070c0M5401a) : i6 >= 29 ? new C3048I(c3070c0M5401a) : new C3047H(c3070c0M5401a)).mo5322b();
        } else {
            c3070c0Mo5322b = null;
        }
        this.f9727b = c3070c0Mo5322b;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        int[] iArr;
        boolean z5;
        if (!view.isLaidOut()) {
            this.f9727b = C3070c0.m5393c(view, windowInsets);
            return C3042C.m5313j(view, windowInsets);
        }
        C3070c0 c3070c0M5393c = C3070c0.m5393c(view, windowInsets);
        C3064Z c3064z = c3070c0M5393c.f9782a;
        if (this.f9727b == null) {
            int i5 = AbstractC3092v.f9811a;
            this.f9727b = AbstractC3088r.m5401a(view);
        }
        if (this.f9727b == null) {
            this.f9727b = c3070c0M5393c;
            return C3042C.m5313j(view, windowInsets);
        }
        AbstractC3094x abstractC3094xM5314k = C3042C.m5314k(view);
        if (abstractC3094xM5314k != null && Objects.equals((C3070c0) abstractC3094xM5314k.f9814e, c3070c0M5393c)) {
            return C3042C.m5313j(view, windowInsets);
        }
        int[] iArr2 = new int[1];
        int[] iArr3 = new int[1];
        C3070c0 c3070c0 = this.f9727b;
        int i6 = 1;
        while (i6 <= 512) {
            C2688b c2688bMo5367i = c3064z.mo5367i(i6);
            C2688b c2688bMo5367i2 = c3070c0.f9782a.mo5367i(i6);
            int i7 = c2688bMo5367i.f8572a;
            int i8 = c2688bMo5367i.f8575d;
            int i9 = c2688bMo5367i.f8574c;
            int i10 = c2688bMo5367i.f8573b;
            int i11 = c2688bMo5367i2.f8572a;
            int i12 = c2688bMo5367i2.f8575d;
            int i13 = c2688bMo5367i2.f8574c;
            int i14 = c2688bMo5367i2.f8573b;
            if (i7 > i11 || i10 > i14 || i9 > i13 || i8 > i12) {
                iArr = iArr2;
                z5 = true;
            } else {
                iArr = iArr2;
                z5 = false;
            }
            if (z5 != (i7 < i11 || i10 < i14 || i9 < i13 || i8 < i12)) {
                if (z5) {
                    iArr[0] = iArr[0] | i6;
                } else {
                    iArr3[0] = iArr3[0] | i6;
                }
            }
            i6 <<= 1;
            iArr2 = iArr;
        }
        int i15 = iArr2[0];
        int i16 = iArr3[0];
        int i17 = i15 | i16;
        if (i17 == 0) {
            this.f9727b = c3070c0M5393c;
            return C3042C.m5313j(view, windowInsets);
        }
        C3070c0 c3070c02 = this.f9727b;
        C3046G c3046g = new C3046G(i17, (i15 & 8) != 0 ? C3042C.f9728e : (i16 & 8) != 0 ? C3042C.f9729f : (i15 & 519) != 0 ? C3042C.f9730g : (i16 & 519) != 0 ? C3042C.f9731h : null, (i17 & 8) != 0 ? 160L : 250L);
        c3046g.f9741a.mo5320e(0.0f);
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(c3046g.f9741a.mo5317b());
        C2688b c2688bMo5367i3 = c3064z.mo5367i(i17);
        C2688b c2688bMo5367i4 = c3070c02.f9782a.mo5367i(i17);
        int iMin = Math.min(c2688bMo5367i3.f8572a, c2688bMo5367i4.f8572a);
        int i18 = c2688bMo5367i3.f8573b;
        int i19 = c2688bMo5367i4.f8573b;
        int iMin2 = Math.min(i18, i19);
        int i20 = c2688bMo5367i3.f8574c;
        int i21 = c2688bMo5367i4.f8574c;
        int iMin3 = Math.min(i20, i21);
        int i22 = c2688bMo5367i3.f8575d;
        int i23 = c2688bMo5367i4.f8575d;
        C2023b c2023b = new C2023b(8, C2688b.m4667b(iMin, iMin2, iMin3, Math.min(i22, i23)), C2688b.m4667b(Math.max(c2688bMo5367i3.f8572a, c2688bMo5367i4.f8572a), Math.max(i18, i19), Math.max(i20, i21), Math.max(i22, i23)));
        C3042C.m5310g(view, c3046g, c3070c0M5393c, false);
        duration.addUpdateListener(new C3095y(c3046g, c3070c0M5393c, c3070c02, i17, view));
        duration.addListener(new C3096z(view, c3046g));
        ViewTreeObserverOnPreDrawListenerC3082l viewTreeObserverOnPreDrawListenerC3082l = new ViewTreeObserverOnPreDrawListenerC3082l(view, new RunnableC3040A(view, c3046g, c2023b, duration));
        view.getViewTreeObserver().addOnPreDrawListener(viewTreeObserverOnPreDrawListenerC3082l);
        view.addOnAttachStateChangeListener(viewTreeObserverOnPreDrawListenerC3082l);
        this.f9727b = c3070c0M5393c;
        return C3042C.m5313j(view, windowInsets);
    }
}
