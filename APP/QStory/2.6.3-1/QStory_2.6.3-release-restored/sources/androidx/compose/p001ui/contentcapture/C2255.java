package androidx.compose.p001ui.contentcapture;

import androidx.activity.AbstractC0900;
import kotlin.jvm.internal.AbstractC5227;
import top.suzhelan.qstory.hook.item.chat.C6686;

/* JADX INFO: renamed from: androidx.compose.ui.contentcapture.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2255 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final C6686 f4427;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final ContentCaptureEventType f4428;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final long f4429;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final int f4430;

    public C2255(int i, long j, ContentCaptureEventType contentCaptureEventType, C6686 c6686) {
        this.f4430 = i;
        this.f4429 = j;
        this.f4428 = contentCaptureEventType;
        this.f4427 = c6686;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2255)) {
            return false;
        }
        C2255 c2255 = (C2255) obj;
        return this.f4430 == c2255.f4430 && this.f4429 == c2255.f4429 && this.f4428 == c2255.f4428 && AbstractC5227.m9466(this.f4427, c2255.f4427);
    }

    public final int hashCode() {
        int iHashCode = (this.f4428.hashCode() + AbstractC0900.m702(Integer.hashCode(this.f4430) * 31, 31, this.f4429)) * 31;
        C6686 c6686 = this.f4427;
        return iHashCode + (c6686 == null ? 0 : c6686.hashCode());
    }

    public final String toString() {
        return "ContentCaptureEvent(id=" + this.f4430 + ", timestamp=" + this.f4429 + ", type=" + this.f4428 + ", structureCompat=" + this.f4427 + ')';
    }
}
