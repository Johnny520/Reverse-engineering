package androidx.window.layout;

import android.graphics.Rect;
import androidx.activity.AbstractC0900;
import kotlin.jvm.internal.AbstractC5227;
import p163.C8396;

/* JADX INFO: renamed from: androidx.window.layout.飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3432 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final float f8126;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C8396 f8127;

    public C3432(Rect rect, float f) {
        this.f8127 = new C8396(rect);
        this.f8126 = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C3432.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        C3432 c3432 = (C3432) obj;
        return AbstractC5227.m9466(this.f8127, c3432.f8127) && this.f8126 == c3432.f8126;
    }

    public final int hashCode() {
        return Float.hashCode(this.f8126) + (this.f8127.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WindowMetrics(_bounds=");
        sb.append(this.f8127);
        sb.append(", density=");
        return AbstractC0900.m715(sb, this.f8126, ')');
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Rect m5673() {
        C8396 c8396 = this.f8127;
        c8396.getClass();
        return new Rect(c8396.f20827, c8396.f20826, c8396.f20825, c8396.f20824);
    }

    public C3432(C8396 c8396, float f) {
        this.f8127 = c8396;
        this.f8126 = f;
    }
}
