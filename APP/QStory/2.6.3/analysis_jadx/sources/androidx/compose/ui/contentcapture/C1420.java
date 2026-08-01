package androidx.compose.ui.contentcapture;

import androidx.activity.AbstractC0053;
import kotlin.jvm.internal.AbstractC4395;
import top.suzhelan.qstory.hook.item.chat.C5856;

/* JADX INFO: renamed from: androidx.compose.ui.contentcapture.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1420 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final C5856 f4082;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final ContentCaptureEventType f4083;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final long f4084;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final int f4085;

    public C1420(int i, long j, ContentCaptureEventType contentCaptureEventType, C5856 c5856) {
        this.f4085 = i;
        this.f4084 = j;
        this.f4083 = contentCaptureEventType;
        this.f4082 = c5856;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1420)) {
            return false;
        }
        C1420 c1420 = (C1420) obj;
        return this.f4085 == c1420.f4085 && this.f4084 == c1420.f4084 && this.f4083 == c1420.f4083 && AbstractC4395.m8907(this.f4082, c1420.f4082);
    }

    public final int hashCode() {
        int iHashCode = (this.f4083.hashCode() + AbstractC0053.m142(Integer.hashCode(this.f4085) * 31, 31, this.f4084)) * 31;
        C5856 c5856 = this.f4082;
        return iHashCode + (c5856 == null ? 0 : c5856.hashCode());
    }

    public final String toString() {
        return "ContentCaptureEvent(id=" + this.f4085 + ", timestamp=" + this.f4084 + ", type=" + this.f4083 + ", structureCompat=" + this.f4082 + ')';
    }
}
