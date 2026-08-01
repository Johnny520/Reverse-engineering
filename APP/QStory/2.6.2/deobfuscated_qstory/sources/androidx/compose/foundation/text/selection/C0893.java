package androidx.compose.foundation.text.selection;

import androidx.activity.AbstractC0053;
import androidx.compose.foundation.text.Handle;
import p112.C7328;

/* JADX INFO: renamed from: androidx.compose.foundation.text.selection.飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C0893 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final boolean f2534;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final SelectionHandleAnchor f2535;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final long f2536;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Handle f2537;

    public C0893(Handle handle, long j, SelectionHandleAnchor selectionHandleAnchor, boolean z) {
        this.f2537 = handle;
        this.f2536 = j;
        this.f2535 = selectionHandleAnchor;
        this.f2534 = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0893)) {
            return false;
        }
        C0893 c0893 = (C0893) obj;
        return this.f2537 == c0893.f2537 && C7328.m12501(this.f2536, c0893.f2536) && this.f2535 == c0893.f2535 && this.f2534 == c0893.f2534;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f2534) + ((this.f2535.hashCode() + AbstractC0053.m141(this.f2537.hashCode() * 31, 31, this.f2536)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SelectionHandleInfo(handle=");
        sb.append(this.f2537);
        sb.append(", position=");
        sb.append((Object) C7328.m12504(this.f2536));
        sb.append(", anchor=");
        sb.append(this.f2535);
        sb.append(", visible=");
        return AbstractC0053.m150(sb, this.f2534, ')');
    }
}
