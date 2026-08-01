package p000;

import android.graphics.Canvas;
import android.graphics.Matrix;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class i30 extends o30 {

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ArrayList f2336c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Matrix f2337d;

    public i30(ArrayList arrayList, Matrix matrix) {
        this.f2336c = arrayList;
        this.f2337d = matrix;
    }

    @Override // p000.o30
    /* JADX INFO: renamed from: a */
    public final void mo1390a(Matrix matrix, d30 d30Var, int i, Canvas canvas) {
        ArrayList arrayList = this.f2336c;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            ((o30) obj).mo1390a(this.f2337d, d30Var, i, canvas);
        }
    }
}
