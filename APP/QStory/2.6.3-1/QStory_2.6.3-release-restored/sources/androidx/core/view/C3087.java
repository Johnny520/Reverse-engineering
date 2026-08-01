package androidx.core.view;

import android.os.Build;
import android.view.DisplayCutout;
import p180.C8494;

/* JADX INFO: renamed from: androidx.core.view.飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3087 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final DisplayCutout f6906;

    public C3087(DisplayCutout displayCutout) {
        this.f6906 = displayCutout;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C3087.class != obj.getClass()) {
            return false;
        }
        return this.f6906.equals(((C3087) obj).f6906);
    }

    public final int hashCode() {
        return this.f6906.hashCode();
    }

    public final String toString() {
        return "DisplayCutoutCompat{" + this.f6906 + "}";
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C8494 m4772() {
        return Build.VERSION.SDK_INT >= 30 ? C8494.m13497(AbstractC3096.m4783(this.f6906)) : C8494.f21151;
    }
}
