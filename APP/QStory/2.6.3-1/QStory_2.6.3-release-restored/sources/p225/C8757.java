package p225;

import androidx.window.area.AbstractC3400;
import p221.C8728;
import p221.C8730;

/* JADX INFO: renamed from: 飘花落叶言子苏哲楪兰世.飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8757 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C8757 f22299 = new C8757(AbstractC3400.m5640(0), AbstractC3400.m5640(0));

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final long f22300;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final long f22301;

    public C8757(long j, long j2) {
        this.f22301 = j;
        this.f22300 = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8757)) {
            return false;
        }
        C8757 c8757 = (C8757) obj;
        return C8728.m13904(this.f22301, c8757.f22301) && C8728.m13904(this.f22300, c8757.f22300);
    }

    public final int hashCode() {
        C8730[] c8730Arr = C8728.f22212;
        return Long.hashCode(this.f22300) + (Long.hashCode(this.f22301) * 31);
    }

    public final String toString() {
        return "TextIndent(firstLine=" + ((Object) C8728.m13901(this.f22301)) + ", restLine=" + ((Object) C8728.m13901(this.f22300)) + ')';
    }
}
