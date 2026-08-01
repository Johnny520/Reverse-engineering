package p000;

import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RenderNode;

/* JADX INFO: renamed from: zx */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class C1020zx {

    /* JADX INFO: renamed from: a */
    public final C0910x1 f8010a;

    /* JADX INFO: renamed from: b */
    public final C0125dd f8011b;

    /* JADX INFO: renamed from: c */
    public final RenderNode f8012c;

    /* JADX INFO: renamed from: d */
    public long f8013d;

    /* JADX INFO: renamed from: e */
    public Paint f8014e;

    /* JADX INFO: renamed from: f */
    public Matrix f8015f;

    /* JADX INFO: renamed from: g */
    public boolean f8016g;

    /* JADX INFO: renamed from: h */
    public float f8017h;

    /* JADX INFO: renamed from: i */
    public int f8018i;

    /* JADX INFO: renamed from: j */
    public float f8019j;

    /* JADX INFO: renamed from: k */
    public float f8020k;

    /* JADX INFO: renamed from: l */
    public float f8021l;

    /* JADX INFO: renamed from: m */
    public long f8022m;

    /* JADX INFO: renamed from: n */
    public long f8023n;

    /* JADX INFO: renamed from: o */
    public float f8024o;

    /* JADX INFO: renamed from: p */
    public boolean f8025p;

    /* JADX INFO: renamed from: q */
    public boolean f8026q;

    /* JADX INFO: renamed from: r */
    public boolean f8027r;

    /* JADX INFO: renamed from: s */
    public int f8028s;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1020zx() {
        C0910x1 c0910x1 = new C0910x1(3);
        C0125dd c0125dd = new C0125dd();
        this.f8010a = c0910x1;
        this.f8011b = c0125dd;
        RenderNode renderNode = new RenderNode("graphicsLayer");
        this.f8012c = renderNode;
        this.f8013d = 0L;
        renderNode.setClipToBounds(false);
        m5617b(renderNode, 0);
        this.f8017h = 1.0f;
        this.f8018i = 3;
        this.f8019j = 1.0f;
        this.f8020k = 1.0f;
        long j = C0207ff.f1702b;
        this.f8022m = j;
        this.f8023n = j;
        this.f8024o = 8.0f;
        this.f8028s = 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final void m5616a() {
        boolean z = this.f8025p;
        boolean z2 = false;
        boolean z3 = z && !this.f8016g;
        if (z && this.f8016g) {
            z2 = true;
        }
        boolean z4 = this.f8026q;
        RenderNode renderNode = this.f8012c;
        if (z3 != z4) {
            this.f8026q = z3;
            renderNode.setClipToBounds(z3);
        }
        if (z2 != this.f8027r) {
            this.f8027r = z2;
            renderNode.setClipToOutline(z2);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final void m5617b(RenderNode renderNode, int i) {
        if (i == 1) {
            renderNode.setUseCompositingLayer(true, this.f8014e);
            renderNode.setHasOverlappingRendering(true);
            return;
        }
        Paint paint = this.f8014e;
        if (i == 2) {
            renderNode.setUseCompositingLayer(false, paint);
            renderNode.setHasOverlappingRendering(false);
        } else {
            renderNode.setUseCompositingLayer(false, paint);
            renderNode.setHasOverlappingRendering(true);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final void m5618c() {
        int i = this.f8028s;
        RenderNode renderNode = this.f8012c;
        if (i != 1 && this.f8018i == 3) {
            m5617b(renderNode, i);
        } else {
            m5617b(renderNode, 1);
        }
    }
}
