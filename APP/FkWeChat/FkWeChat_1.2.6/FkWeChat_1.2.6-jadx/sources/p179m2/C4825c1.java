package p179m2;

import android.graphics.Matrix;
import android.view.View;
import p024b9.AbstractC1043k;
import p265s1.AbstractC7117o0;
import p265s1.C7114n2;

/* JADX INFO: renamed from: m2.c1 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C4825c1 implements InterfaceC4820b1 {

    /* JADX INFO: renamed from: a */
    public final float[] f14355a;

    /* JADX INFO: renamed from: b */
    public final int[] f14356b;

    public C4825c1(float[] fArr) {
        this.f14355a = fArr;
        this.f14356b = new int[2];
    }

    @Override // p179m2.InterfaceC4820b1
    /* JADX INFO: renamed from: a */
    public void mo19295a(View view, float[] fArr) {
        C7114n2.m28026h(fArr);
        m19309d(view, fArr);
    }

    /* JADX INFO: renamed from: b */
    public final void m19307b(float[] fArr, Matrix matrix) {
        AbstractC7117o0.m28051b(this.f14355a, matrix);
        AbstractC4849h0.m19371k(fArr, this.f14355a);
    }

    /* JADX INFO: renamed from: c */
    public final void m19308c(float[] fArr, float f10, float f11) {
        AbstractC4849h0.m19372l(fArr, f10, f11, this.f14355a);
    }

    /* JADX INFO: renamed from: d */
    public final void m19309d(View view, float[] fArr) {
        Object parent = view.getParent();
        if (parent instanceof View) {
            m19309d((View) parent, fArr);
            m19308c(fArr, -view.getScrollX(), -view.getScrollY());
            m19308c(fArr, view.getLeft(), view.getTop());
        } else {
            view.getLocationInWindow(this.f14356b);
            m19308c(fArr, -view.getScrollX(), -view.getScrollY());
            m19308c(fArr, r0[0], r0[1]);
        }
        Matrix matrix = view.getMatrix();
        if (matrix.isIdentity()) {
            return;
        }
        m19307b(fArr, matrix);
    }

    public /* synthetic */ C4825c1(float[] fArr, AbstractC1043k abstractC1043k) {
        this(fArr);
    }
}
