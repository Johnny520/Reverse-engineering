package androidx.compose.foundation.text.selection;

import androidx.activity.AbstractC0900;
import androidx.compose.foundation.text.Handle;
import p128.C8158;

/* JADX INFO: renamed from: androidx.compose.foundation.text.selection.飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1731 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final boolean f2880;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final SelectionHandleAnchor f2881;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final long f2882;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Handle f2883;

    public C1731(Handle handle, long j, SelectionHandleAnchor selectionHandleAnchor, boolean z) {
        this.f2883 = handle;
        this.f2882 = j;
        this.f2881 = selectionHandleAnchor;
        this.f2880 = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1731)) {
            return false;
        }
        C1731 c1731 = (C1731) obj;
        return this.f2883 == c1731.f2883 && C8158.m13087(this.f2882, c1731.f2882) && this.f2881 == c1731.f2881 && this.f2880 == c1731.f2880;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f2880) + ((this.f2881.hashCode() + AbstractC0900.m702(this.f2883.hashCode() * 31, 31, this.f2882)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SelectionHandleInfo(handle=");
        sb.append(this.f2883);
        sb.append(", position=");
        sb.append((Object) C8158.m13090(this.f2882));
        sb.append(", anchor=");
        sb.append(this.f2881);
        sb.append(", visible=");
        return AbstractC0900.m712(sb, this.f2880, ')');
    }
}
