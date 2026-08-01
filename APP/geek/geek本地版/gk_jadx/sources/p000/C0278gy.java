package p000;

import android.os.Handler;
import androidx.lifecycle.C0036a;

/* JADX INFO: renamed from: gy */
/* JADX INFO: loaded from: classes.dex */
public final class C0278gy implements InterfaceC0568oq {

    /* JADX INFO: renamed from: i */
    public static final C0278gy f2170i = new C0278gy();

    /* JADX INFO: renamed from: a */
    public int f2171a;

    /* JADX INFO: renamed from: b */
    public int f2172b;

    /* JADX INFO: renamed from: e */
    public Handler f2175e;

    /* JADX INFO: renamed from: c */
    public boolean f2173c = true;

    /* JADX INFO: renamed from: d */
    public boolean f2174d = true;

    /* JADX INFO: renamed from: f */
    public final C0036a f2176f = new C0036a(this);

    /* JADX INFO: renamed from: g */
    public final RunnableC0581p1 f2177g = new RunnableC0581p1(10, this);

    /* JADX INFO: renamed from: h */
    public final C0431l0 f2178h = new C0431l0(23, this);

    /* JADX INFO: renamed from: a */
    public final void m1333a() {
        int i = this.f2172b + 1;
        this.f2172b = i;
        if (i == 1) {
            if (this.f2173c) {
                this.f2176f.m277d(EnumC0347iq.ON_RESUME);
                this.f2173c = false;
            } else {
                Handler handler = this.f2175e;
                AbstractC0346ip.m1500l(handler);
                handler.removeCallbacks(this.f2177g);
            }
        }
    }

    @Override // p000.InterfaceC0568oq
    /* JADX INFO: renamed from: e */
    public final C0036a mo120e() {
        return this.f2176f;
    }
}
