package androidx.compose.foundation.text.selection;

import androidx.activity.AbstractC0053;
import androidx.compose.foundation.text.Handle;
import p112.C7329;

/* JADX INFO: renamed from: androidx.compose.foundation.text.selection.飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0893 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final boolean f2535;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final SelectionHandleAnchor f2536;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final long f2537;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Handle f2538;

    public C0893(Handle handle, long j, SelectionHandleAnchor selectionHandleAnchor, boolean z) {
        this.f2538 = handle;
        this.f2537 = j;
        this.f2536 = selectionHandleAnchor;
        this.f2535 = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0893)) {
            return false;
        }
        C0893 c0893 = (C0893) obj;
        return this.f2538 == c0893.f2538 && C7329.m12528(this.f2537, c0893.f2537) && this.f2536 == c0893.f2536 && this.f2535 == c0893.f2535;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f2535) + ((this.f2536.hashCode() + AbstractC0053.m142(this.f2538.hashCode() * 31, 31, this.f2537)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SelectionHandleInfo(handle=");
        sb.append(this.f2538);
        sb.append(", position=");
        sb.append((Object) C7329.m12531(this.f2537));
        sb.append(", anchor=");
        sb.append(this.f2536);
        sb.append(", visible=");
        return AbstractC0053.m152(sb, this.f2535, ')');
    }
}
