package p326;

import android.graphics.Typeface;
import androidx.core.view.C3075;
import com.google.android.material.internal.C3982;
import p267.AbstractC9004;

/* JADX INFO: renamed from: 飘花落叶言楪苏哲兰世子.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C9486 extends AbstractC9004 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final C3075 f24744;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final Typeface f24745;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public boolean f24746;

    public C9486(C3075 c3075, Typeface typeface) {
        this.f24745 = typeface;
        this.f24744 = c3075;
    }

    @Override // p267.AbstractC9004
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰 */
    public final void mo7738(Typeface typeface, boolean z) {
        if (this.f24746) {
            return;
        }
        C3982 c3982 = (C3982) this.f24744.f6882;
        if (c3982.m7728(typeface)) {
            c3982.m7730(false);
        }
    }

    @Override // p267.AbstractC9004
    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲 */
    public final void mo7739(int i) {
        if (this.f24746) {
            return;
        }
        C3982 c3982 = (C3982) this.f24744.f6882;
        if (c3982.m7728(this.f24745)) {
            c3982.m7730(false);
        }
    }
}
