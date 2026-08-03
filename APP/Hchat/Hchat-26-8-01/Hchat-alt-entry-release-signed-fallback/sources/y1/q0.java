package y1;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class q0 implements y1.l2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final android.view.ViewConfiguration f22052a;

    public q0(android.view.ViewConfiguration r1) {
            r0 = this;
            r0.<init>()
            r0.f22052a = r1
            return
    }

    @Override // y1.l2
    public final long a() {
            r2 = this;
            int r0 = android.view.ViewConfiguration.getDoubleTapTimeout()
            long r0 = (long) r0
            return r0
    }

    @Override // y1.l2
    public final long b() {
            r2 = this;
            int r0 = android.view.ViewConfiguration.getLongPressTimeout()
            long r0 = (long) r0
            return r0
    }

    @Override // y1.l2
    public final float c() {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 34
            if (r0 < r1) goto Le
            android.view.ViewConfiguration r0 = r2.f22052a
            int r0 = f0.k.s(r0)
            float r0 = (float) r0
            return r0
        Le:
            r0 = 1073741824(0x40000000, float:2.0)
            return r0
    }

    @Override // y1.l2
    public final float e() {
            r1 = this;
            android.view.ViewConfiguration r0 = r1.f22052a
            int r0 = r0.getScaledMaximumFlingVelocity()
            float r0 = (float) r0
            return r0
    }

    @Override // y1.l2
    public final float f() {
            r1 = this;
            android.view.ViewConfiguration r0 = r1.f22052a
            int r0 = r0.getScaledTouchSlop()
            float r0 = (float) r0
            return r0
    }

    @Override // y1.l2
    public final float g() {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 34
            if (r0 < r1) goto Le
            android.view.ViewConfiguration r0 = r2.f22052a
            int r0 = f0.k.b(r0)
            float r0 = (float) r0
            return r0
        Le:
            r0 = 1098907648(0x41800000, float:16.0)
            return r0
    }
}
