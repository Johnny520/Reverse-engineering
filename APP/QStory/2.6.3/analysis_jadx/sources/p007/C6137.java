package p007;

import androidx.profileinstaller.AbstractC2442;
import kotlin.time.AbstractC5160;
import kotlin.time.C5157;
import kotlin.time.DurationUnit;
import p305.C8623;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: 飘花落叶言世兰子哲苏楪.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6137 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public static final /* synthetic */ int f16793 = 0;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final boolean f16794;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final boolean f16795;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final int f16796;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final int f16797;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final boolean f16798;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final boolean f16799;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public String f16800;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final int f16801;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final boolean f16802;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final boolean f16803;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final boolean f16804;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final int f16805;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final boolean f16806;

    static {
        C8623 c8623 = C5157.f14712;
        DurationUnit durationUnit = DurationUnit.SECONDS;
        long jM10196 = C5157.m10196(AbstractC5160.m10206(Integer.MAX_VALUE, durationUnit), durationUnit);
        if (jM10196 >= 0) {
            return;
        }
        C5925.m11314(AbstractC2442.m4583(jM10196, "maxStale < 0: "));
    }

    public C6137(boolean z, boolean z2, int i, int i2, boolean z3, boolean z4, boolean z5, int i3, int i4, boolean z6, boolean z7, boolean z8, String str) {
        this.f16799 = z;
        this.f16798 = z2;
        this.f16797 = i;
        this.f16796 = i2;
        this.f16795 = z3;
        this.f16794 = z4;
        this.f16802 = z5;
        this.f16801 = i3;
        this.f16805 = i4;
        this.f16806 = z6;
        this.f16803 = z7;
        this.f16804 = z8;
        this.f16800 = str;
    }

    public final String toString() {
        String str = this.f16800;
        if (str != null) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        if (this.f16799) {
            sb.append("no-cache, ");
        }
        if (this.f16798) {
            sb.append("no-store, ");
        }
        int i = this.f16797;
        if (i != -1) {
            sb.append("max-age=");
            sb.append(i);
            sb.append(", ");
        }
        int i2 = this.f16796;
        if (i2 != -1) {
            sb.append("s-maxage=");
            sb.append(i2);
            sb.append(", ");
        }
        if (this.f16795) {
            sb.append("private, ");
        }
        if (this.f16794) {
            sb.append("public, ");
        }
        if (this.f16802) {
            sb.append("must-revalidate, ");
        }
        int i3 = this.f16801;
        if (i3 != -1) {
            sb.append("max-stale=");
            sb.append(i3);
            sb.append(", ");
        }
        int i4 = this.f16805;
        if (i4 != -1) {
            sb.append("min-fresh=");
            sb.append(i4);
            sb.append(", ");
        }
        if (this.f16806) {
            sb.append("only-if-cached, ");
        }
        if (this.f16803) {
            sb.append("no-transform, ");
        }
        if (this.f16804) {
            sb.append("immutable, ");
        }
        if (sb.length() == 0) {
            return "";
        }
        sb.delete(sb.length() - 2, sb.length()).getClass();
        String string = sb.toString();
        this.f16800 = string;
        return string;
    }
}
