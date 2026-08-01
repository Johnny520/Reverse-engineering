package androidx.core.view;

import android.view.DisplayCutout;
import android.view.WindowInsets;
import java.util.Objects;

/* JADX INFO: renamed from: androidx.core.view.飘花落叶言子哲世兰苏楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class C2219 extends C2218 {
    public C2219(C2225 c2225, WindowInsets windowInsets) {
        super(c2225, windowInsets);
    }

    @Override // androidx.core.view.C2222, androidx.core.view.C2238
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2219)) {
            return false;
        }
        C2219 c2219 = (C2219) obj;
        return Objects.equals(this.f6508, c2219.f6508) && Objects.equals(this.f6511, c2219.f6511) && C2222.m4026(this.f6510, c2219.f6510);
    }

    @Override // androidx.core.view.C2238
    public int hashCode() {
        return this.f6508.hashCode();
    }

    @Override // androidx.core.view.C2238
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public C2225 mo4021() {
        return C2225.m4063(null, this.f6508.consumeDisplayCutout());
    }

    @Override // androidx.core.view.C2238
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public C2254 mo4022() {
        DisplayCutout displayCutout = this.f6508.getDisplayCutout();
        if (displayCutout == null) {
            return null;
        }
        return new C2254(displayCutout);
    }

    public C2219(C2225 c2225, C2219 c2219) {
        super(c2225, c2219);
    }
}
