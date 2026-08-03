package p000;

import android.graphics.Canvas;
import android.graphics.Matrix;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: Tx */
/* JADX INFO: loaded from: classes.dex */
public final class C0856Tx extends AbstractC1114Zx {

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ArrayList f2708c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Matrix f2709d;

    public C0856Tx(ArrayList r1, Matrix r2) {
        this.f2708c = r1;
        this.f2709d = r2;
    }

    @Override // p000.AbstractC1114Zx
    /* JADX INFO: renamed from: a */
    public final void mo1690a(Matrix r3, C0642Ox r4, int r5, Canvas r6) {
        Iterator r32 = this.f2708c.iterator();
    L4:
        if (r32.hasNext() == false) goto L6;
        ((AbstractC1114Zx) r32.next()).mo1690a(this.f2709d, r4, r5, r6);
        goto L4
    }
}
