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

    public C1130n(ArrayList r1, Matrix r2) {
        this.f4372c = r1;
        this.f4373d = r2;
    }

    @Override // p089x0.AbstractC1136t
    /* JADX INFO: renamed from: a */
    public final void mo2663a(Matrix r3, C1116a r4, int r5, Canvas r6) {
        Iterator r32 = this.f4372c.iterator();
    L4:
        if (r32.hasNext() == false) goto L6;
        ((AbstractC1136t) r32.next()).mo2663a(this.f4373d, r4, r5, r6);
        goto L4
    }
}
