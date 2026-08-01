package androidx.window.layout;

import android.graphics.Rect;
import androidx.activity.AbstractC0053;
import kotlin.jvm.internal.AbstractC4394;
import p147.C7566;

/* JADX INFO: renamed from: androidx.window.layout.飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C2598 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final float f7779;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C7566 f7780;

    public C2598(Rect rect, float f) {
        this.f7780 = new C7566(rect);
        this.f7779 = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C2598.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        C2598 c2598 = (C2598) obj;
        return AbstractC4394.m8917(this.f7780, c2598.f7780) && this.f7779 == c2598.f7779;
    }

    public final int hashCode() {
        return Float.hashCode(this.f7779) + (this.f7780.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WindowMetrics(_bounds=");
        sb.append(this.f7780);
        sb.append(", density=");
        return AbstractC0053.m157(sb, this.f7779, ')');
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Rect m5068() {
        C7566 c7566 = this.f7780;
        c7566.getClass();
        return new Rect(c7566.f20487, c7566.f20486, c7566.f20485, c7566.f20484);
    }

    public C2598(C7566 c7566, float f) {
        this.f7780 = c7566;
        this.f7779 = f;
    }
}
