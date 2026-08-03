package p000a;

import android.graphics.Canvas;
import android.graphics.Matrix;
import java.util.ArrayList;
import java.util.Iterator;
import p000a.C0447Yd;

/* JADX INFO: renamed from: a.Xd */
/* JADX INFO: loaded from: classes.dex */
public final class C0429Xd extends C0447Yd.f {

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ArrayList f1607c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Matrix f1608d;

    public C0429Xd(ArrayList arrayList, Matrix matrix) {
        this.f1607c = arrayList;
        this.f1608d = matrix;
    }

    @Override // p000a.C0447Yd.f
    /* JADX INFO: renamed from: a */
    public final void mo1074a(Matrix matrix, C0375Ud c0375Ud, int i, Canvas canvas) {
        Iterator it = this.f1607c.iterator();
        while (it.hasNext()) {
            ((C0447Yd.f) it.next()).mo1074a(this.f1608d, c0375Ud, i, canvas);
        }
    }
}
