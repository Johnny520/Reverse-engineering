package androidx.lifecycle;

import android.os.Handler;
import p002a1.RunnableC0003a;

/* JADX INFO: renamed from: androidx.lifecycle.y */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0120y implements InterfaceC0112q {

    /* JADX INFO: renamed from: o */
    public static final C0120y f311o = new C0120y();

    /* JADX INFO: renamed from: g */
    public int f312g;

    /* JADX INFO: renamed from: h */
    public int f313h;

    /* JADX INFO: renamed from: k */
    public Handler f316k;

    /* JADX INFO: renamed from: i */
    public boolean f314i = true;

    /* JADX INFO: renamed from: j */
    public boolean f315j = true;

    /* JADX INFO: renamed from: l */
    public final C0114s f317l = new C0114s(this, true);

    /* JADX INFO: renamed from: m */
    public final RunnableC0003a f318m = new RunnableC0003a(this, 1);

    /* JADX INFO: renamed from: n */
    public final C0119x f319n = new C0119x(this, 0);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final void m616a() {
        int i9 = this.f313h + 1;
        this.f313h = i9;
        if (i9 == 1) {
            if (this.f314i) {
                this.f317l.m555d(EnumC0106k.ON_RESUME);
                this.f314i = false;
            } else {
                Handler handler = this.f316k;
                handler.getClass();
                handler.removeCallbacks(this.f318m);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // androidx.lifecycle.InterfaceC0112q
    /* JADX INFO: renamed from: f */
    public final C0114s mo550f() {
        return this.f317l;
    }
}
