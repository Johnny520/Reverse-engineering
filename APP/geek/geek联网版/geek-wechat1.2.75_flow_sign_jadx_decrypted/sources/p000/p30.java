package p000;

import android.graphics.Canvas;
import android.graphics.Matrix;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class p30 extends v30 {

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ArrayList f3578c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Matrix f3579d;

    public p30(ArrayList arrayList, Matrix matrix) {
        this.f3578c = arrayList;
        this.f3579d = matrix;
    }

    @Override // p000.v30
    /* JADX INFO: renamed from: a */
    public final void mo2062a(Matrix matrix, k30 k30Var, int i, Canvas canvas) {
        ArrayList arrayList = this.f3578c;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            ((v30) obj).mo2062a(this.f3579d, k30Var, i, canvas);
        }
    }
}
