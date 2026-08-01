package p146jd;

import android.R;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import md.AbstractC5161p;
import p053dd.C1951c;
import p068ed.InterfaceC2214c;
import p315vd.AbstractC8924d;

/* JADX INFO: renamed from: jd.e */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public class C3840e implements InterfaceC2214c {
    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m15272e(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        try {
            int height = view.getHeight();
            if (height <= 0) {
                return;
            }
            float fMin = 1.0f - (0.050000012f * Math.min(600.0f / height, 0.95f));
            StateListAnimator stateListAnimator = new StateListAnimator();
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(ObjectAnimator.ofFloat(view, "scaleX", fMin), ObjectAnimator.ofFloat(view, "scaleY", fMin));
            animatorSet.setDuration(100L);
            AnimatorSet animatorSet2 = new AnimatorSet();
            animatorSet2.playTogether(ObjectAnimator.ofFloat(view, "scaleX", 1.0f), ObjectAnimator.ofFloat(view, "scaleY", 1.0f));
            animatorSet2.setDuration(100L);
            stateListAnimator.addState(new int[]{R.attr.state_pressed}, animatorSet);
            stateListAnimator.addState(new int[0], animatorSet2);
            view.setStateListAnimator(stateListAnimator);
        } catch (Throwable unused) {
        }
    }

    @Override // p068ed.InterfaceC2214c
    /* JADX INFO: renamed from: b */
    public void mo7977b(View view, C1951c c1951c) {
        int i10;
        try {
            if (getBoolean("custom_bubble", false)) {
                View viewM7978c = m7978c("MMNeat7extView", view);
                if (viewM7978c == null) {
                    viewM7978c = m7978c("MarkdownNativeMvvmView", view);
                }
                if (viewM7978c != null && (i10 = c1951c.type) != 1090519089 && i10 != 1040187441 && i10 != 49) {
                    m15274g(viewM7978c);
                    int iM7979d = m7979d(view, 10.0f);
                    int iM7979d2 = m7979d(view, 8.0f);
                    boolean zM15273f = m15273f(view.getContext());
                    GradientDrawable gradientDrawable = new GradientDrawable();
                    gradientDrawable.setCornerRadius(m7979d(view, 10.0f));
                    int i11 = -13421773;
                    if (c1951c.isSend == 1) {
                        if (!zM15273f) {
                            i11 = -16737793;
                        }
                        gradientDrawable.setColor(i11);
                        AbstractC5161p.callMethod(viewM7978c, "setTextColor", -1);
                    } else {
                        gradientDrawable.setColor(zM15273f ? -13421773 : -1);
                    }
                    viewM7978c.setBackground(gradientDrawable);
                    viewM7978c.setPadding(iM7979d, iM7979d2, iM7979d, iM7979d2);
                }
            }
        } catch (Throwable th) {
            AbstractC8924d.m34265e("apply error", th);
        }
    }

    /* JADX INFO: renamed from: f */
    public final boolean m15273f(Context context) {
        return (context.getResources().getConfiguration().uiMode & 48) == 32;
    }

    /* JADX INFO: renamed from: g */
    public final void m15274g(View view) {
        try {
            if (view.getStateListAnimator() != null) {
                return;
            }
            view.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: jd.d
                @Override // android.view.View.OnLayoutChangeListener
                public final void onLayoutChange(View view2, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
                    C3840e.m15272e(view2, i10, i11, i12, i13, i14, i15, i16, i17);
                }
            });
        } catch (Throwable unused) {
        }
    }
}
