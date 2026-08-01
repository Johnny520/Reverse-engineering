package p073f2;

import android.view.MotionEvent;
import java.util.List;

/* JADX INFO: renamed from: f2.f0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C2240f0 {

    /* JADX INFO: renamed from: a */
    public final long f6152a;

    /* JADX INFO: renamed from: b */
    public final List f6153b;

    /* JADX INFO: renamed from: c */
    public MotionEvent f6154c;

    public C2240f0(long j10, List list, MotionEvent motionEvent) {
        this.f6152a = j10;
        this.f6153b = list;
        this.f6154c = motionEvent;
    }

    /* JADX INFO: renamed from: a */
    public final MotionEvent m8120a() {
        return this.f6154c;
    }

    /* JADX INFO: renamed from: b */
    public final List m8121b() {
        return this.f6153b;
    }

    /* JADX INFO: renamed from: c */
    public final void m8122c(MotionEvent motionEvent) {
        this.f6154c = motionEvent;
    }
}
