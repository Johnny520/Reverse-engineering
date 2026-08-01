package androidx.compose.foundation.text.selection;

import androidx.activity.AbstractC0900;
import androidx.compose.p001ui.graphics.C2434;

/* JADX INFO: renamed from: androidx.compose.foundation.text.selection.飘花落叶言子苏世楪兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1768 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final long f2984;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final long f2985;

    public C1768(long j, long j2) {
        this.f2985 = j;
        this.f2984 = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1768)) {
            return false;
        }
        C1768 c1768 = (C1768) obj;
        return C2434.m3509(this.f2985, c1768.f2985) && C2434.m3509(this.f2984, c1768.f2984);
    }

    public final int hashCode() {
        int i = C2434.f5044;
        return Long.hashCode(this.f2984) + (Long.hashCode(this.f2985) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SelectionColors(selectionHandleColor=");
        AbstractC0900.m698(this.f2985, sb, ", selectionBackgroundColor=");
        sb.append((Object) C2434.m3514(this.f2984));
        sb.append(')');
        return sb.toString();
    }
}
