package androidx.window.layout;

import android.graphics.Rect;
import androidx.activity.AbstractC0053;
import kotlin.jvm.internal.AbstractC4395;
import p147.C7567;

/* JADX INFO: renamed from: androidx.window.layout.飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2599 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final float f7781;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C7567 f7782;

    public C2599(Rect rect, float f) {
        this.f7782 = new C7567(rect);
        this.f7781 = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C2599.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        C2599 c2599 = (C2599) obj;
        return AbstractC4395.m8907(this.f7782, c2599.f7782) && this.f7781 == c2599.f7781;
    }

    public final int hashCode() {
        return Float.hashCode(this.f7781) + (this.f7782.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WindowMetrics(_bounds=");
        sb.append(this.f7782);
        sb.append(", density=");
        return AbstractC0053.m155(sb, this.f7781, ')');
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Rect m5113() {
        C7567 c7567 = this.f7782;
        c7567.getClass();
        return new Rect(c7567.f20482, c7567.f20481, c7567.f20480, c7567.f20479);
    }

    public C2599(C7567 c7567, float f) {
        this.f7782 = c7567;
        this.f7781 = f;
    }
}
