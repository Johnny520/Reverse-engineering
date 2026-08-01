package p047I0;

import android.os.Build;
import android.view.ViewConfiguration;

/* JADX INFO: renamed from: I0.c0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0717c0 implements InterfaceC0697T0 {

    /* JADX INFO: renamed from: a */
    public final ViewConfiguration f2267a;

    public C0717c0(ViewConfiguration viewConfiguration) {
        this.f2267a = viewConfiguration;
    }

    @Override // p047I0.InterfaceC0697T0
    /* JADX INFO: renamed from: a */
    public final float mo1203a() {
        return this.f2267a.getScaledMaximumFlingVelocity();
    }

    @Override // p047I0.InterfaceC0697T0
    /* JADX INFO: renamed from: b */
    public final long mo775b() {
        return ViewConfiguration.getDoubleTapTimeout();
    }

    @Override // p047I0.InterfaceC0697T0
    /* JADX INFO: renamed from: c */
    public final long mo776c() {
        return ViewConfiguration.getLongPressTimeout();
    }

    @Override // p047I0.InterfaceC0697T0
    /* JADX INFO: renamed from: d */
    public final float mo777d() {
        return this.f2267a.getScaledTouchSlop();
    }

    @Override // p047I0.InterfaceC0697T0
    /* JADX INFO: renamed from: e */
    public final float mo1204e() {
        if (Build.VERSION.SDK_INT >= 34) {
            return this.f2267a.getScaledHandwritingSlop();
        }
        return 2.0f;
    }

    @Override // p047I0.InterfaceC0697T0
    /* JADX INFO: renamed from: f */
    public final float mo1205f() {
        if (Build.VERSION.SDK_INT >= 34) {
            return this.f2267a.getScaledHandwritingGestureLineMargin();
        }
        return 16.0f;
    }
}
