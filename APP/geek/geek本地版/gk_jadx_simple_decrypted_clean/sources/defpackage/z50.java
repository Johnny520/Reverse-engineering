package defpackage;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;

/* JADX INFO: loaded from: classes.dex */
public final class z50 extends gt {
    public final /* synthetic */ Context a;
    public final /* synthetic */ TextPaint b;
    public final /* synthetic */ gt c;
    public final /* synthetic */ a60 d;

    public z50(a60 r1, Context r2, TextPaint r3, gt r4) {
        this.d = r1;
        this.a = r2;
        this.b = r3;
        this.c = r4;
    }

    @Override // defpackage.gt
    public final void p(int r2) {
        this.c.p(r2);
    }

    @Override // defpackage.gt
    public final void q(Typeface r4, boolean r5) {
        Context r0 = this.a;
        TextPaint r1 = this.b;
        this.d.g(r0, r1, r4);
        this.c.q(r4, r5);
    }
}
