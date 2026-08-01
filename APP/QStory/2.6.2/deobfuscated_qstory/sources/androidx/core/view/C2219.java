package androidx.core.view;

import android.view.DisplayCutout;
import android.view.WindowInsets;
import java.util.Objects;

/* JADX INFO: renamed from: androidx.core.view.飘花落叶言子哲世兰苏楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
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
        return Objects.equals(this.f6507, c2219.f6507) && Objects.equals(this.f6510, c2219.f6510) && C2222.m4016(this.f6509, c2219.f6509);
    }

    @Override // androidx.core.view.C2238
    public int hashCode() {
        return this.f6507.hashCode();
    }

    @Override // androidx.core.view.C2238
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public C2225 mo4011() {
        return C2225.m4053(null, this.f6507.consumeDisplayCutout());
    }

    @Override // androidx.core.view.C2238
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public C2254 mo4012() {
        DisplayCutout displayCutout = this.f6507.getDisplayCutout();
        if (displayCutout == null) {
            return null;
        }
        return new C2254(displayCutout);
    }

    public C2219(C2225 c2225, C2219 c2219) {
        super(c2225, c2219);
    }
}
