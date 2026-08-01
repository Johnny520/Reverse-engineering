package defpackage;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class gx extends yq {
    public final /* synthetic */ hx q;

    public gx(hx r1, Context r2) {
        this.q = r1;
        super(r2);
    }

    @Override // defpackage.yq
    public final float d(DisplayMetrics r2) {
        return 100.0f / r2.densityDpi;
    }

    @Override // defpackage.yq
    public final int e(int r2) {
        return Math.min(100, super.e(r2));
    }

    @Override // defpackage.yq
    public final void h(View r7, wz r8) {
        hx r0 = this.q;
        int[] r72 = r0.a(r0.a.getLayoutManager(), r7);
        int r02 = r72[0];
        int r73 = r72[1];
        int r2 = (int) Math.ceil(((double) e(Math.max(Math.abs(r02), Math.abs(r73)))) / 0.3356d);
        if (r2 <= 0) goto L6;
        r8.a = r02;
        r8.b = r73;
        r8.c = r2;
        r8.e = this.j;
        r8.f = true;
        return;
    }
}
