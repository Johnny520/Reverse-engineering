package androidx.lifecycle;

import android.os.Handler;
import androidx.activity.RunnableC0371b;
import p004C.C0066j;
import p027N0.AbstractC0223g;

/* JADX INFO: renamed from: androidx.lifecycle.B */
/* JADX INFO: loaded from: classes.dex */
public final class C0450B implements InterfaceC0484s {

    /* JADX INFO: renamed from: j */
    public static final C0450B f1456j = new C0450B();

    /* JADX INFO: renamed from: b */
    public int f1457b;

    /* JADX INFO: renamed from: c */
    public int f1458c;

    /* JADX INFO: renamed from: f */
    public Handler f1461f;

    /* JADX INFO: renamed from: d */
    public boolean f1459d = true;

    /* JADX INFO: renamed from: e */
    public boolean f1460e = true;

    /* JADX INFO: renamed from: g */
    public final C0486u f1462g = new C0486u(this);

    /* JADX INFO: renamed from: h */
    public final RunnableC0371b f1463h = new RunnableC0371b(3, this);

    /* JADX INFO: renamed from: i */
    public final C0066j f1464i = new C0066j(13, this);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final void m904a() {
        int i2 = this.f1458c + 1;
        this.f1458c = i2;
        if (i2 == 1) {
            if (this.f1459d) {
                this.f1462g.m930d(EnumC0478m.ON_RESUME);
                this.f1459d = false;
            } else {
                Handler handler = this.f1461f;
                AbstractC0223g.m415b(handler);
                handler.removeCallbacks(this.f1463h);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // androidx.lifecycle.InterfaceC0484s
    /* JADX INFO: renamed from: c */
    public final C0486u mo636c() {
        return this.f1462g;
    }
}
