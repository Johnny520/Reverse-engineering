package androidx.compose.ui.contentcapture;

import androidx.activity.AbstractC0053;
import kotlin.jvm.internal.AbstractC4394;
import top.suzhelan.qstory.hook.item.chat.C5851;

/* JADX INFO: renamed from: androidx.compose.ui.contentcapture.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C1420 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final C5851 f4081;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final ContentCaptureEventType f4082;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final long f4083;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final int f4084;

    public C1420(int i, long j, ContentCaptureEventType contentCaptureEventType, C5851 c5851) {
        this.f4084 = i;
        this.f4083 = j;
        this.f4082 = contentCaptureEventType;
        this.f4081 = c5851;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1420)) {
            return false;
        }
        C1420 c1420 = (C1420) obj;
        return this.f4084 == c1420.f4084 && this.f4083 == c1420.f4083 && this.f4082 == c1420.f4082 && AbstractC4394.m8917(this.f4081, c1420.f4081);
    }

    public final int hashCode() {
        int iHashCode = (this.f4082.hashCode() + AbstractC0053.m141(Integer.hashCode(this.f4084) * 31, 31, this.f4083)) * 31;
        C5851 c5851 = this.f4081;
        return iHashCode + (c5851 == null ? 0 : c5851.hashCode());
    }

    public final String toString() {
        return "ContentCaptureEvent(id=" + this.f4084 + ", timestamp=" + this.f4083 + ", type=" + this.f4082 + ", structureCompat=" + this.f4081 + ')';
    }
}
