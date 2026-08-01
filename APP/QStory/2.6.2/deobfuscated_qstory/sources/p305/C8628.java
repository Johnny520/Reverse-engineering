package p305;

import android.graphics.Matrix;
import android.graphics.Path;
import java.util.ArrayList;

/* JADX INFO: renamed from: 飘花落叶言楪苏兰世子哲.飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C8628 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public float f24216;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public float f24217;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public float f24218;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public float f24219;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public float f24220;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final ArrayList f24215 = new ArrayList();

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final ArrayList f24221 = new ArrayList();

    public C8628() {
        m14283(0.0f, 270.0f, 0.0f);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void m14283(float f, float f2, float f3) {
        this.f24220 = f;
        this.f24219 = 0.0f;
        this.f24218 = f;
        this.f24217 = f2;
        this.f24216 = (f2 + f3) % 360.0f;
        this.f24215.clear();
        this.f24221.clear();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m14284(float f, float f2) {
        C8639 c8639 = new C8639();
        c8639.f24238 = f;
        c8639.f24237 = f2;
        this.f24215.add(c8639);
        C8641 c8641 = new C8641(c8639, this.f24219, this.f24218);
        float fM14296 = c8641.m14296() + 270.0f;
        float fM142962 = c8641.m14296() + 270.0f;
        m14286(fM14296);
        this.f24221.add(c8641);
        this.f24217 = fM142962;
        this.f24219 = f;
        this.f24218 = f2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m14285(Matrix matrix, Path path) {
        ArrayList arrayList = this.f24215;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((AbstractC8640) arrayList.get(i)).mo14295(matrix, path);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m14286(float f) {
        float f2 = this.f24217;
        if (f2 == f) {
            return;
        }
        float f3 = ((f - f2) + 360.0f) % 360.0f;
        if (f3 > 180.0f) {
            return;
        }
        float f4 = this.f24219;
        float f5 = this.f24218;
        C8642 c8642 = new C8642(f4, f5, f4, f5);
        c8642.f24244 = this.f24217;
        c8642.f24249 = f3;
        this.f24221.add(new C8637(c8642));
        this.f24217 = f;
    }
}
