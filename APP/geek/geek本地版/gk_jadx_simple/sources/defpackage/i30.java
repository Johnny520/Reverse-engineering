package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class i30 extends o30 {
    public final /* synthetic */ ArrayList c;
    public final /* synthetic */ Matrix d;

    public i30(ArrayList r1, Matrix r2) {
        this.c = r1;
        this.d = r2;
    }

    @Override // defpackage.o30
    public final void a(Matrix r5, d30 r6, int r7, Canvas r8) {
        ArrayList r52 = this.c;
        int r0 = r52.size();
        int r1 = 0;
    L3:
        if (r1 >= r0) goto L5;
        Object r2 = r52.get(r1);
        r1 = r1 + 1;
        ((o30) r2).a(this.d, r6, r7, r8);
        goto L3
    }
}
