package Yue;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: Yue.ۥ۠ۡۦۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final class C4787 {

    /* JADX INFO: renamed from: ۥ */
    public final C8336 f1113;

    /* JADX INFO: renamed from: ۥ۟ */
    public final C7244 f1114;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final RecyclerView f10714;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public VelocityTracker f10715;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public int f10716;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public float f10717;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public int f10718;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public long f10719;

    public C4787(C8336 c8336, C7244 c7244, RecyclerView recyclerView) {
        this.f1113 = c8336;
        this.f1114 = c7244;
        this.f10714 = recyclerView;
    }

    /* JADX INFO: renamed from: ۥ */
    public final void m1692(long j, int i, float f, float f2) {
        MotionEvent motionEventObtain = MotionEvent.obtain(this.f10719, j, i, f, f2, 0);
        this.f10715.addMovement(motionEventObtain);
        motionEventObtain.recycle();
    }

    @InterfaceC8086
    /* JADX INFO: renamed from: ۥ۟ */
    public boolean m1693() {
        if (this.f1114.m22684()) {
            return false;
        }
        this.f10718 = 0;
        this.f10717 = 0;
        this.f10719 = SystemClock.uptimeMillis();
        m14463();
        this.f1114.m22688();
        if (!this.f1114.m22686()) {
            this.f10714.stopScroll();
        }
        m1692(this.f10719, 0, 0.0f, 0.0f);
        return true;
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final void m14463() {
        VelocityTracker velocityTracker = this.f10715;
        if (velocityTracker != null) {
            velocityTracker.clear();
        } else {
            this.f10715 = VelocityTracker.obtain();
            this.f10716 = ViewConfiguration.get(this.f1113.getContext()).getScaledMaximumFlingVelocity();
        }
    }

    @InterfaceC8086
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public boolean m14464() {
        if (!this.f1114.m22685()) {
            return false;
        }
        this.f1114.m22690();
        VelocityTracker velocityTracker = this.f10715;
        velocityTracker.computeCurrentVelocity(1000, this.f10716);
        if (this.f10714.fling((int) velocityTracker.getXVelocity(), (int) velocityTracker.getYVelocity())) {
            return true;
        }
        this.f1113.m27806();
        return true;
    }

    @InterfaceC8086
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public boolean m14465(float f) {
        if (!this.f1114.m22685()) {
            return false;
        }
        float f2 = this.f10717 - f;
        this.f10717 = f2;
        int iRound = Math.round(f2 - this.f10718);
        this.f10718 += iRound;
        long jUptimeMillis = SystemClock.uptimeMillis();
        boolean z = this.f1113.getOrientation() == 0;
        int i = z ? iRound : 0;
        int i2 = z ? 0 : iRound;
        float f3 = z ? this.f10717 : 0.0f;
        float f4 = z ? 0.0f : this.f10717;
        this.f10714.scrollBy(i, i2);
        m1692(jUptimeMillis, 2, f3, f4);
        return true;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public boolean m14466() {
        return this.f1114.m22685();
    }
}
