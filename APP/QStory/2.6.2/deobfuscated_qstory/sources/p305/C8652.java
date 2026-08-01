package p305;

import android.graphics.RectF;
import androidx.activity.AbstractC0053;
import java.util.Arrays;

/* JADX INFO: renamed from: 飘花落叶言楪苏兰世子哲.飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C8652 implements InterfaceC8633 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final float f24336;

    public C8652(float f) {
        this.f24336 = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C8652) && this.f24336 == ((C8652) obj).f24336;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f24336)});
    }

    public final String toString() {
        return AbstractC0053.m147(new StringBuilder(), "%", (int) (this.f24336 * 100.0f));
    }

    @Override // p305.InterfaceC8633
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final float mo14294(RectF rectF) {
        return Math.min(rectF.width(), rectF.height()) * this.f24336;
    }
}
