package p305;

import android.graphics.Matrix;
import android.graphics.Path;
import java.util.ArrayList;

/* JADX INFO: renamed from: 飘花落叶言楪苏兰世子哲.飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8620 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public float f24207;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public float f24208;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public float f24209;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public float f24210;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public float f24211;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final ArrayList f24206 = new ArrayList();

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final ArrayList f24212 = new ArrayList();

    public C8620() {
        m14302(0.0f, 270.0f, 0.0f);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void m14302(float f, float f2, float f3) {
        this.f24211 = f;
        this.f24210 = 0.0f;
        this.f24209 = f;
        this.f24208 = f2;
        this.f24207 = (f2 + f3) % 360.0f;
        this.f24206.clear();
        this.f24212.clear();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m14303(float f, float f2) {
        C8631 c8631 = new C8631();
        c8631.f24229 = f;
        c8631.f24228 = f2;
        this.f24206.add(c8631);
        C8633 c8633 = new C8633(c8631, this.f24210, this.f24209);
        float fM14314 = c8633.m14314() + 270.0f;
        float fM143142 = c8633.m14314() + 270.0f;
        m14305(fM14314);
        this.f24212.add(c8633);
        this.f24208 = fM143142;
        this.f24210 = f;
        this.f24209 = f2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m14304(Matrix matrix, Path path) {
        ArrayList arrayList = this.f24206;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((AbstractC8632) arrayList.get(i)).mo14313(matrix, path);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m14305(float f) {
        float f2 = this.f24208;
        if (f2 == f) {
            return;
        }
        float f3 = ((f - f2) + 360.0f) % 360.0f;
        if (f3 > 180.0f) {
            return;
        }
        float f4 = this.f24210;
        float f5 = this.f24209;
        C8634 c8634 = new C8634(f4, f5, f4, f5);
        c8634.f24235 = this.f24208;
        c8634.f24240 = f3;
        this.f24212.add(new C8629(c8634));
        this.f24208 = f;
    }
}
