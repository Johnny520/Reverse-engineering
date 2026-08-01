package defpackage;

import android.view.View;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class wq {
    public boolean a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public List k;
    public boolean l;

    public final void a(View r8) {
        int r0 = this.k.size();
        View r1 = null;
        int r2 = Integer.MAX_VALUE;
        int r3 = 0;
    L3:
        if (r3 >= r0) goto L18;
        View r4 = ((b00) this.k.get(r3)).a;
        oz r5 = (oz) r4.getLayoutParams();
        if (r4 == r8) goto L17;
        if (r5.a.h() == true) goto L17;
        int r52 = (r5.a.b() - this.d) * this.e;
        if (r52 < 0) goto L17;
        if (r52 >= r2) goto L17;
        r1 = r4;
        if (r52 == 0) goto L18;
        r2 = r52;
    L17:
        r3 = r3 + 1;
    L18:
        if (r1 != null) goto L21;
        this.d = -1;
        return;
    L21:
        this.d = ((oz) r1.getLayoutParams()).a.b();
    }

    public final View b(tz r5) {
        List r0 = this.k;
        if (r0 == null) goto L16;
        int r52 = r0.size();
        int r02 = 0;
    L5:
        if (r02 >= r52) goto L14;
        View r1 = ((b00) this.k.get(r02)).a;
        oz r2 = (oz) r1.getLayoutParams();
        if (r2.a.h() == true) goto L13;
        if (this.d != r2.a.b()) goto L13;
        a(r1);
        return r1;
    L13:
        r02 = r02 + 1;
        goto L5
    L14:
        return null;
    L16:
        View r53 = r5.i(this.d, Long.MAX_VALUE).a;
        this.d += this.e;
        return r53;
    }
}
