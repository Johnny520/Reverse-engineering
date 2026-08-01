package defpackage;

import android.view.ViewGroup;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class f3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ r3 b;

    public /* synthetic */ f3(r3 r1, int r2) {
        this.a = r2;
        this.b = r1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int r0 = this.a;
        r3 r1 = this.b;
        switch(r0) {
            case 0: goto L17;
            default: goto L4;
        };
    L4:
        r1.w.showAtLocation(r1.v, 55, 0, 0);
        wa0 r02 = r1.y;
        if (r02 == null) goto L8;
        r02.b();
    L8:
        if (r1.z == false) goto L14;
        ViewGroup r03 = r1.A;
        if (r03 == null) goto L14;
        WeakHashMap r4 = ja0.a;
        if (v90.c(r03) == false) goto L14;
        r1.v.setAlpha(0.0f);
        wa0 r04 = ja0.a(r1.v);
        r04.a(1.0f);
        r1.y = r04;
        r04.d(new h3(0, this));
        return;
    L14:
        r1.v.setAlpha(1.0f);
        r1.v.setVisibility(0);
        return;
    L17:
        if ((r1.Z & 1) == 0) goto L20;
        r1.v(0);
    L20:
        if ((r1.Z & 4096) == 0) goto L22;
        r1.v(108);
    L22:
        r1.Y = false;
        r1.Z = 0;
    }
}
