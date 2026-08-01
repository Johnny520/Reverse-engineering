package p321;

import android.graphics.Matrix;
import android.graphics.Path;
import java.util.ArrayList;

/* JADX INFO: renamed from: 飘花落叶言楪苏兰世子哲.飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C9449 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public float f24552;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public float f24553;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public float f24554;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public float f24555;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public float f24556;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final ArrayList f24551 = new ArrayList();

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final ArrayList f24557 = new ArrayList();

    public C9449() {
        m14861(0.0f, 270.0f, 0.0f);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void m14861(float f, float f2, float f3) {
        this.f24556 = f;
        this.f24555 = 0.0f;
        this.f24554 = f;
        this.f24553 = f2;
        this.f24552 = (f2 + f3) % 360.0f;
        this.f24551.clear();
        this.f24557.clear();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m14862(float f, float f2) {
        C9460 c9460 = new C9460();
        c9460.f24574 = f;
        c9460.f24573 = f2;
        this.f24551.add(c9460);
        C9462 c9462 = new C9462(c9460, this.f24555, this.f24554);
        float fM14873 = c9462.m14873() + 270.0f;
        float fM148732 = c9462.m14873() + 270.0f;
        m14864(fM14873);
        this.f24557.add(c9462);
        this.f24553 = fM148732;
        this.f24555 = f;
        this.f24554 = f2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m14863(Matrix matrix, Path path) {
        ArrayList arrayList = this.f24551;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((AbstractC9461) arrayList.get(i)).mo14872(matrix, path);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m14864(float f) {
        float f2 = this.f24553;
        if (f2 == f) {
            return;
        }
        float f3 = ((f - f2) + 360.0f) % 360.0f;
        if (f3 > 180.0f) {
            return;
        }
        float f4 = this.f24555;
        float f5 = this.f24554;
        C9463 c9463 = new C9463(f4, f5, f4, f5);
        c9463.f24580 = this.f24553;
        c9463.f24585 = f3;
        this.f24557.add(new C9458(c9463));
        this.f24553 = f;
    }
}
