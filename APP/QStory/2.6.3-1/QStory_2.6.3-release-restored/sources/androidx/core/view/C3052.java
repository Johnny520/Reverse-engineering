package androidx.core.view;

import android.view.DisplayCutout;
import android.view.WindowInsets;
import java.util.Objects;

/* JADX INFO: renamed from: androidx.core.view.飘花落叶言子哲世兰苏楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class C3052 extends C3051 {
    public C3052(C3058 c3058, WindowInsets windowInsets) {
        super(c3058, windowInsets);
    }

    @Override // androidx.core.view.C3055, androidx.core.view.C3071
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3052)) {
            return false;
        }
        C3052 c3052 = (C3052) obj;
        return Objects.equals(this.f6853, c3052.f6853) && Objects.equals(this.f6856, c3052.f6856) && C3055.m4586(this.f6855, c3052.f6855);
    }

    @Override // androidx.core.view.C3071
    public int hashCode() {
        return this.f6853.hashCode();
    }

    @Override // androidx.core.view.C3071
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public C3058 mo4581() {
        return C3058.m4623(null, this.f6853.consumeDisplayCutout());
    }

    @Override // androidx.core.view.C3071
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public C3087 mo4582() {
        DisplayCutout displayCutout = this.f6853.getDisplayCutout();
        if (displayCutout == null) {
            return null;
        }
        return new C3087(displayCutout);
    }

    public C3052(C3058 c3058, C3052 c3052) {
        super(c3058, c3052);
    }
}
