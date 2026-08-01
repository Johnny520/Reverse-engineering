package defpackage;

import android.util.Log;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class e8 implements Runnable {
    public final /* synthetic */ int a;
    public final int b;
    public final Object c;

    public /* synthetic */ e8(Object r1, int r2, int r3) {
        this.a = r3;
        this.c = r1;
        this.b = r2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch(this.a) {
            case 0: goto L19;
            case 1: goto L12;
            default: goto L4;
        };
    L4:
        RecyclerView r0 = ((ut) this.c).Y;
        if (r0.u == true) goto L26;
        nz r1 = r0.l;
        if (r1 != null) goto L10;
        Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        return;
    L10:
        r1.v0(r0, this.b);
        return;
    L26:
        return;
    L12:
        ArrayList r02 = (ArrayList) this.c;
        int r12 = r02.size();
        int r4 = 0;
        if (this.b == 1) goto L16;
    L14:
        if (r4 >= r12) goto L18;
        ((ci) r02.get(r4)).getClass();
        r4 = r4 + 1;
        goto L14
    L18:
        return;
    L16:
        if (r4 >= r12) goto L27;
        ((ci) r02.get(r4)).a();
        r4 = r4 + 1;
        goto L16
    L27:
        return;
    L19:
        zt r03 = (zt) ((l0) this.c).b;
        if (r03 == null) goto L28;
        r03.I(this.b);
        return;
    }

    public e8(List r1, int r2, Throwable r3) {
        this.a = 1;
        zt.f("initCallbacks cannot be null", r1);
        this.c = new ArrayList(r1);
        this.b = r2;
    }
}
