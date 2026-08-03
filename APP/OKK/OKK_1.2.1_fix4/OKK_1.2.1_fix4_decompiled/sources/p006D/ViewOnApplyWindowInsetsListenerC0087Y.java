package p006D;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.lang.reflect.Field;
import java.util.Objects;
import p000A.C0002c;
import p000A.RunnableC0014o;
import p085v.C1102c;

/* JADX INFO: renamed from: D.Y */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnApplyWindowInsetsListenerC0087Y implements View.OnApplyWindowInsetsListener {

    /* JADX INFO: renamed from: a */
    public final C0099f f232a;

    /* JADX INFO: renamed from: b */
    public C0122q0 f233b;

    public ViewOnApplyWindowInsetsListenerC0087Y(View view, C0099f c0099f) {
        C0122q0 c0122q0Mo362b;
        this.f232a = c0099f;
        Field field = AbstractC0080Q.f219a;
        C0122q0 c0122q0M237a = AbstractC0071H.m237a(view);
        if (c0122q0M237a != null) {
            int i2 = Build.VERSION.SDK_INT;
            c0122q0Mo362b = (i2 >= 30 ? new C0104h0(c0122q0M237a) : i2 >= 29 ? new C0102g0(c0122q0M237a) : new C0100f0(c0122q0M237a)).mo362b();
        } else {
            c0122q0Mo362b = null;
        }
        this.f233b = c0122q0Mo362b;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        C0118o0 c0118o0;
        if (!view.isLaidOut()) {
            this.f233b = C0122q0.m429d(view, windowInsets);
            return C0088Z.m310i(view, windowInsets);
        }
        C0122q0 c0122q0M429d = C0122q0.m429d(view, windowInsets);
        if (this.f233b == null) {
            Field field = AbstractC0080Q.f219a;
            this.f233b = AbstractC0071H.m237a(view);
        }
        if (this.f233b == null) {
            this.f233b = c0122q0M429d;
            return C0088Z.m310i(view, windowInsets);
        }
        C0099f c0099fM311j = C0088Z.m311j(view);
        if (c0099fM311j != null && Objects.equals((WindowInsets) c0099fM311j.f258b, windowInsets)) {
            return C0088Z.m310i(view, windowInsets);
        }
        C0122q0 c0122q0 = this.f233b;
        int i2 = 1;
        int i3 = 0;
        while (true) {
            c0118o0 = c0122q0M429d.f309a;
            if (i2 > 256) {
                break;
            }
            if (!c0118o0.mo381f(i2).equals(c0122q0.f309a.mo381f(i2))) {
                i3 |= i2;
            }
            i2 <<= 1;
        }
        if (i3 == 0) {
            return C0088Z.m310i(view, windowInsets);
        }
        C0122q0 c0122q02 = this.f233b;
        C0096d0 c0096d0 = new C0096d0(i3, (i3 & 8) != 0 ? c0118o0.mo381f(8).f4252d > c0122q02.f309a.mo381f(8).f4252d ? C0088Z.f234e : C0088Z.f235f : C0088Z.f236g, 160L);
        c0096d0.f252a.mo323d(0.0f);
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(c0096d0.f252a.mo320a());
        C1102c c1102cMo381f = c0118o0.mo381f(i3);
        C1102c c1102cMo381f2 = c0122q02.f309a.mo381f(i3);
        int iMin = Math.min(c1102cMo381f.f4249a, c1102cMo381f2.f4249a);
        int i4 = c1102cMo381f.f4250b;
        int i5 = c1102cMo381f2.f4250b;
        int iMin2 = Math.min(i4, i5);
        int i6 = c1102cMo381f.f4251c;
        int i7 = c1102cMo381f2.f4251c;
        int iMin3 = Math.min(i6, i7);
        int i8 = c1102cMo381f.f4252d;
        int i9 = i3;
        int i10 = c1102cMo381f2.f4252d;
        C0002c c0002c = new C0002c(C1102c.m2598b(iMin, iMin2, iMin3, Math.min(i8, i10)), C1102c.m2598b(Math.max(c1102cMo381f.f4249a, c1102cMo381f2.f4249a), Math.max(i4, i5), Math.max(i6, i7), Math.max(i8, i10)), 1);
        C0088Z.m307f(view, windowInsets, false);
        duration.addUpdateListener(new C0085W(c0096d0, c0122q0M429d, c0122q02, i9, view));
        duration.addListener(new C0086X(c0096d0, view));
        RunnableC0014o runnableC0014o = new RunnableC0014o(view, c0096d0, c0002c, duration);
        if (view == null) {
            throw new NullPointerException("view == null");
        }
        ViewTreeObserverOnPreDrawListenerC0127t viewTreeObserverOnPreDrawListenerC0127t = new ViewTreeObserverOnPreDrawListenerC0127t(view, runnableC0014o);
        view.getViewTreeObserver().addOnPreDrawListener(viewTreeObserverOnPreDrawListenerC0127t);
        view.addOnAttachStateChangeListener(viewTreeObserverOnPreDrawListenerC0127t);
        this.f233b = c0122q0M429d;
        return C0088Z.m310i(view, windowInsets);
    }
}
