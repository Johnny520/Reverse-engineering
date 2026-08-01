package p310;

import android.graphics.Typeface;
import androidx.core.view.C2242;
import com.google.android.material.internal.C3150;
import p251.AbstractC8175;

/* JADX INFO: renamed from: 飘花落叶言楪苏哲兰世子.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8657 extends AbstractC8175 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final C2242 f24399;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final Typeface f24400;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public boolean f24401;

    public C8657(C2242 c2242, Typeface typeface) {
        this.f24400 = typeface;
        this.f24399 = c2242;
    }

    @Override // p251.AbstractC8175
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰 */
    public final void mo7179(Typeface typeface, boolean z) {
        if (this.f24401) {
            return;
        }
        C3150 c3150 = (C3150) this.f24399.f6537;
        if (c3150.m7169(typeface)) {
            c3150.m7171(false);
        }
    }

    @Override // p251.AbstractC8175
    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲 */
    public final void mo7180(int i) {
        if (this.f24401) {
            return;
        }
        C3150 c3150 = (C3150) this.f24399.f6537;
        if (c3150.m7169(this.f24400)) {
            c3150.m7171(false);
        }
    }
}
