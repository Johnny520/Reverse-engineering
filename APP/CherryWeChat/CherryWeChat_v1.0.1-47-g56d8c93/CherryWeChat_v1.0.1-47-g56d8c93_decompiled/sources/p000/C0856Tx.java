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

    public C0856Tx(ArrayList arrayList, Matrix matrix) {
        this.f2708c = arrayList;
        this.f2709d = matrix;
    }

    @Override // p000.AbstractC1114Zx
    /* JADX INFO: renamed from: a */
    public final void mo1690a(Matrix matrix, C0642Ox c0642Ox, int i, Canvas canvas) {
        Iterator it = this.f2708c.iterator();
        while (it.hasNext()) {
            ((AbstractC1114Zx) it.next()).mo1690a(this.f2709d, c0642Ox, i, canvas);
        }
    }
}
