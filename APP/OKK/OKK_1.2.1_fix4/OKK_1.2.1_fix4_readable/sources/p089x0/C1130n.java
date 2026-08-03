package p089x0;

import android.graphics.Canvas;
import android.graphics.Matrix;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p088w0.C1116a;

/* JADX INFO: renamed from: x0.n */
/* JADX INFO: loaded from: classes.dex */
public final class C1130n extends AbstractC1136t {

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ List f4372c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Matrix f4373d;

    public C1130n(ArrayList arrayList, Matrix matrix) {
        this.f4372c = arrayList;
        this.f4373d = matrix;
    }

    @Override // p089x0.AbstractC1136t
    /* JADX INFO: renamed from: a */
    public final void mo2663a(Matrix matrix, C1116a c1116a, int i2, Canvas canvas) {
        Iterator it = this.f4372c.iterator();
        while (it.hasNext()) {
            ((AbstractC1136t) it.next()).mo2663a(this.f4373d, c1116a, i2, canvas);
        }
    }
}
