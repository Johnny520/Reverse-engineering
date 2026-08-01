package defpackage;

import android.graphics.Typeface;
import android.os.Build;
import android.widget.TextView;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class x4 extends zt {
    public final /* synthetic */ int e;
    public final /* synthetic */ int f;
    public final /* synthetic */ WeakReference g;
    public final /* synthetic */ d5 h;

    public x4(d5 r1, int r2, int r3, WeakReference r4) {
        this.h = r1;
        this.e = r2;
        this.f = r3;
        this.g = r4;
    }

    @Override // defpackage.zt
    public final void J(Typeface r4) {
        if (Build.VERSION.SDK_INT < 28) goto L11;
        int r1 = this.e;
        if (r1 == (-1)) goto L11;
        if ((this.f & 2) == 0) goto L9;
        boolean r0 = true;
    L10:
        r4 = c5.a(r4, r1, r0);
        goto L11
    L9:
        r0 = false;
    L11:
        d5 r02 = this.h;
        if (r02.m == false) goto L21;
        r02.l = r4;
        TextView r12 = (TextView) this.g.get();
        if (r12 == null) goto L22;
        WeakHashMap r2 = ja0.a;
        if (v90.b(r12) == false) goto L19;
        r12.post(new y4(r12, r4, r02.j));
        return;
    L19:
        r12.setTypeface(r4, r02.j);
        return;
    L22:
        return;
    }

    @Override // defpackage.zt
    public final void I(int r1) {
    }
}
