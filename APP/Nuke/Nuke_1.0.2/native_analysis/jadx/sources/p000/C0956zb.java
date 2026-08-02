package p000;

import android.os.Build;
import android.view.ViewConfiguration;

/* JADX INFO: renamed from: zb */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0956zb implements za3 {

    /* JADX INFO: renamed from: a */
    public final ViewConfiguration f13818a;

    public C0956zb(ViewConfiguration viewConfiguration) {
        this.f13818a = viewConfiguration;
    }

    @Override // p000.za3
    /* JADX INFO: renamed from: a */
    public final float mo6406a() {
        return this.f13818a.getScaledMaximumFlingVelocity();
    }

    @Override // p000.za3
    /* JADX INFO: renamed from: b */
    public final long mo3033b() {
        return ViewConfiguration.getDoubleTapTimeout();
    }

    @Override // p000.za3
    /* JADX INFO: renamed from: c */
    public final long mo3034c() {
        return ViewConfiguration.getLongPressTimeout();
    }

    @Override // p000.za3
    /* JADX INFO: renamed from: d */
    public final float mo3035d() {
        return this.f13818a.getScaledTouchSlop();
    }

    @Override // p000.za3
    /* JADX INFO: renamed from: e */
    public final float mo6407e() {
        if (Build.VERSION.SDK_INT >= 34) {
            return this.f13818a.getScaledHandwritingSlop();
        }
        return 2.0f;
    }

    @Override // p000.za3
    /* JADX INFO: renamed from: f */
    public final float mo6408f() {
        if (Build.VERSION.SDK_INT >= 34) {
            return this.f13818a.getScaledHandwritingGestureLineMargin();
        }
        return 16.0f;
    }
}
