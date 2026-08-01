package p000;

import android.os.Handler;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class os0 implements x90 {

    /* JADX INFO: renamed from: k */
    public static final os0 f4621k = new os0();

    /* JADX INFO: renamed from: d */
    public int f4622d;

    /* JADX INFO: renamed from: e */
    public int f4623e;

    /* JADX INFO: renamed from: h */
    public Handler f4626h;

    /* JADX INFO: renamed from: f */
    public boolean f4624f = true;

    /* JADX INFO: renamed from: g */
    public boolean f4625g = true;

    /* JADX INFO: renamed from: i */
    public final z90 f4627i = new z90(this, true);

    /* JADX INFO: renamed from: j */
    public final RunnableC0912x3 f4628j = new RunnableC0912x3(6, this);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.x90
    public final s90 getLifecycle() {
        return this.f4627i;
    }
}
