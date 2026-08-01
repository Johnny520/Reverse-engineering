package p023;

import androidx.profileinstaller.AbstractC3275;
import kotlin.time.AbstractC5992;
import kotlin.time.C5989;
import kotlin.time.DurationUnit;
import p321.C9452;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: 飘花落叶言世兰子哲苏楪.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6966 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public static final /* synthetic */ int f17138 = 0;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final boolean f17139;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final boolean f17140;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final int f17141;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final int f17142;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final boolean f17143;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final boolean f17144;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public String f17145;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final int f17146;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final boolean f17147;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final boolean f17148;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final boolean f17149;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final int f17150;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final boolean f17151;

    static {
        C9452 c9452 = C5989.f15057;
        DurationUnit durationUnit = DurationUnit.SECONDS;
        long jM10755 = C5989.m10755(AbstractC5992.m10765(Integer.MAX_VALUE, durationUnit), durationUnit);
        if (jM10755 >= 0) {
            return;
        }
        C6755.m11873(AbstractC3275.m5143(jM10755, "maxStale < 0: "));
    }

    public C6966(boolean z, boolean z2, int i, int i2, boolean z3, boolean z4, boolean z5, int i3, int i4, boolean z6, boolean z7, boolean z8, String str) {
        this.f17144 = z;
        this.f17143 = z2;
        this.f17142 = i;
        this.f17141 = i2;
        this.f17140 = z3;
        this.f17139 = z4;
        this.f17147 = z5;
        this.f17146 = i3;
        this.f17150 = i4;
        this.f17151 = z6;
        this.f17148 = z7;
        this.f17149 = z8;
        this.f17145 = str;
    }

    public final String toString() {
        String str = this.f17145;
        if (str != null) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        if (this.f17144) {
            sb.append("no-cache, ");
        }
        if (this.f17143) {
            sb.append("no-store, ");
        }
        int i = this.f17142;
        if (i != -1) {
            sb.append("max-age=");
            sb.append(i);
            sb.append(", ");
        }
        int i2 = this.f17141;
        if (i2 != -1) {
            sb.append("s-maxage=");
            sb.append(i2);
            sb.append(", ");
        }
        if (this.f17140) {
            sb.append("private, ");
        }
        if (this.f17139) {
            sb.append("public, ");
        }
        if (this.f17147) {
            sb.append("must-revalidate, ");
        }
        int i3 = this.f17146;
        if (i3 != -1) {
            sb.append("max-stale=");
            sb.append(i3);
            sb.append(", ");
        }
        int i4 = this.f17150;
        if (i4 != -1) {
            sb.append("min-fresh=");
            sb.append(i4);
            sb.append(", ");
        }
        if (this.f17151) {
            sb.append("only-if-cached, ");
        }
        if (this.f17148) {
            sb.append("no-transform, ");
        }
        if (this.f17149) {
            sb.append("immutable, ");
        }
        if (sb.length() == 0) {
            return "";
        }
        sb.delete(sb.length() - 2, sb.length()).getClass();
        String string = sb.toString();
        this.f17145 = string;
        return string;
    }
}
