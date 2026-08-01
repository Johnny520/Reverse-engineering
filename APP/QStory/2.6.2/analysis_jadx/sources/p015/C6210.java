package p015;

import androidx.profileinstaller.AbstractC2442;
import kotlin.time.AbstractC5159;
import kotlin.time.C5156;
import kotlin.time.DurationUnit;
import p305.C8631;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: 飘花落叶言世兰楪子苏哲.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6210 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public static final /* synthetic */ int f17032 = 0;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final boolean f17033;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final boolean f17034;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final int f17035;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final int f17036;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final boolean f17037;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final boolean f17038;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public String f17039;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final int f17040;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final boolean f17041;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final boolean f17042;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final boolean f17043;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final int f17044;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final boolean f17045;

    static {
        C8631 c8631 = C5156.f14712;
        DurationUnit durationUnit = DurationUnit.SECONDS;
        long jM10192 = C5156.m10192(AbstractC5159.m10202(Integer.MAX_VALUE, durationUnit), durationUnit);
        if (jM10192 >= 0) {
            return;
        }
        C5919.m11253(AbstractC2442.m4572(jM10192, "maxStale < 0: "));
    }

    public C6210(boolean z, boolean z2, int i, int i2, boolean z3, boolean z4, boolean z5, int i3, int i4, boolean z6, boolean z7, boolean z8, String str) {
        this.f17038 = z;
        this.f17037 = z2;
        this.f17036 = i;
        this.f17035 = i2;
        this.f17034 = z3;
        this.f17033 = z4;
        this.f17041 = z5;
        this.f17040 = i3;
        this.f17044 = i4;
        this.f17045 = z6;
        this.f17042 = z7;
        this.f17043 = z8;
        this.f17039 = str;
    }

    public final String toString() {
        String str = this.f17039;
        if (str != null) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        if (this.f17038) {
            sb.append("no-cache, ");
        }
        if (this.f17037) {
            sb.append("no-store, ");
        }
        int i = this.f17036;
        if (i != -1) {
            sb.append("max-age=");
            sb.append(i);
            sb.append(", ");
        }
        int i2 = this.f17035;
        if (i2 != -1) {
            sb.append("s-maxage=");
            sb.append(i2);
            sb.append(", ");
        }
        if (this.f17034) {
            sb.append("private, ");
        }
        if (this.f17033) {
            sb.append("public, ");
        }
        if (this.f17041) {
            sb.append("must-revalidate, ");
        }
        int i3 = this.f17040;
        if (i3 != -1) {
            sb.append("max-stale=");
            sb.append(i3);
            sb.append(", ");
        }
        int i4 = this.f17044;
        if (i4 != -1) {
            sb.append("min-fresh=");
            sb.append(i4);
            sb.append(", ");
        }
        if (this.f17045) {
            sb.append("only-if-cached, ");
        }
        if (this.f17042) {
            sb.append("no-transform, ");
        }
        if (this.f17043) {
            sb.append("immutable, ");
        }
        if (sb.length() == 0) {
            return "";
        }
        sb.delete(sb.length() - 2, sb.length()).getClass();
        String string = sb.toString();
        this.f17039 = string;
        return string;
    }
}
