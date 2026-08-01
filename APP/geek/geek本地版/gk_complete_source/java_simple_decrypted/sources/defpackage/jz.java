package defpackage;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public abstract class jz {
    public ez a;
    public ArrayList b;
    public long c;
    public long d;
    public long e;
    public long f;

    public static void b(b00 r2) {
        int r0 = r2.j;
        if (r2.f() == false) goto L6;
        return;
    L6:
        if ((r0 & 4) != 0) goto L12;
        RecyclerView r02 = r2.r;
        if (r02 == null) goto L14;
        r02.F(r2);
        return;
    L14:
        return;
    }

    public abstract boolean a(b00 r1, b00 r2, lw r3, lw r4);

    public final void c(b00 r11) {
        ez r0 = this.a;
        if (r0 == null) goto L27;
        RecyclerView r02 = r0.a;
        boolean r1 = true;
        r11.n(true);
        View r2 = r11.a;
        if (r11.h != null) goto L7;
    L9:
        r11.i = null;
        if ((r11.j & 16) != 0) goto L30;
        tz r3 = r02.b;
        r02.a0();
        r5 r4 = r02.e;
        fa r5 = (fa) r4.c;
        ez r6 = (ez) r4.b;
        int r7 = r6.a.indexOfChild(r2);
        if (r7 != (-1)) goto L16;
        r4.B(r2);
    L19:
        if (r1 == false) goto L21;
        b00 r42 = RecyclerView.I(r2);
        r3.j(r42);
        r3.g(r42);
    L21:
        r02.b0(!r1);
        if (r1 == false) goto L24;
        return;
    L24:
        if (r11.j() == false) goto L29;
        r02.removeDetachedView(r2, false);
        return;
    L29:
        return;
    L16:
        if (r5.d(r7) == false) goto L18;
        r5.f(r7);
        r4.B(r2);
        r6.h(r7);
        goto L19
    L18:
        r1 = false;
        goto L19
    L30:
        return;
    L7:
        if (r11.i != null) goto L9;
        r11.h = null;
        goto L9
    }

    public abstract void d(b00 r1);

    public abstract void e();

    public abstract boolean f();
}
