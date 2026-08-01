package p000;

import android.os.Handler;
import androidx.lifecycle.C0036a;

/* JADX INFO: renamed from: oy */
/* JADX INFO: loaded from: classes.dex */
public final class C0576oy implements InterfaceC0716sq {

    /* JADX INFO: renamed from: i */
    public static final C0576oy f3548i = new C0576oy();

    /* JADX INFO: renamed from: a */
    public int f3549a;

    /* JADX INFO: renamed from: b */
    public int f3550b;

    /* JADX INFO: renamed from: e */
    public Handler f3553e;

    /* JADX INFO: renamed from: c */
    public boolean f3551c = true;

    /* JADX INFO: renamed from: d */
    public boolean f3552d = true;

    /* JADX INFO: renamed from: f */
    public final C0036a f3554f = new C0036a(this);

    /* JADX INFO: renamed from: g */
    public final RunnableC0884x8 f3555g = new RunnableC0884x8(10, this);

    /* JADX INFO: renamed from: h */
    public final C0431l0 f3556h = new C0431l0(23, this);

    /* JADX INFO: renamed from: a */
    public final void m2059a() {
        int i = this.f3550b + 1;
        this.f3550b = i;
        if (i == 1) {
            if (this.f3551c) {
                this.f3554f.m262d(EnumC0494mq.ON_RESUME);
                this.f3551c = false;
            } else {
                Handler handler = this.f3553e;
                AbstractC0493mp.m1854d(handler);
                handler.removeCallbacks(this.f3555g);
            }
        }
    }

    @Override // p000.InterfaceC0716sq
    /* JADX INFO: renamed from: e */
    public final C0036a mo105e() {
        return this.f3554f;
    }
}
