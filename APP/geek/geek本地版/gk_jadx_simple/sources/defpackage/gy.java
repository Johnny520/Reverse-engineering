package defpackage;

import android.os.Handler;
import androidx.lifecycle.a;

/* JADX INFO: loaded from: classes.dex */
public final class gy implements oq {
    public static final gy i = null;
    public int a;
    public int b;
    public boolean c;
    public boolean d;
    public Handler e;
    public final a f;
    public final p1 g;
    public final l0 h;

    static {
        i = new gy();
    }

    public gy() {
        this.c = true;
        this.d = true;
        this.f = new a(this);
        this.g = new p1(10, this);
        this.h = new l0(23, this);
    }

    public final void a() {
        int r0 = this.b + 1;
        this.b = r0;
        if (r0 == 1) goto L5;
        return;
    L5:
        if (this.c == false) goto L8;
        this.f.d(iq.ON_RESUME);
        this.c = false;
        return;
    L8:
        Handler r02 = this.e;
        ip.l(r02);
        r02.removeCallbacks(this.g);
    }

    @Override // defpackage.oq
    public final a e() {
        return this.f;
    }
}
