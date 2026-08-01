package androidx.compose.ui.text.font;

import androidx.activity.AbstractC0053;
import com.google.protobuf.DescriptorProtos$Edition;
import java.util.List;
import kotlin.jvm.internal.AbstractC4395;
import p034.AbstractC6347;
import p195.AbstractC7834;

/* JADX INFO: renamed from: androidx.compose.ui.text.font.飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1988 implements Comparable {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public static final C1988 f5871;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public static final C1988 f5872;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public static final C1988 f5873;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public static final List f5874;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static final C1988 f5875;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static final C1988 f5876;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final int f5877;

    static {
        C1988 c1988 = new C1988(100);
        C1988 c19882 = new C1988(200);
        C1988 c19883 = new C1988(300);
        C1988 c19884 = new C1988(400);
        C1988 c19885 = new C1988(500);
        C1988 c19886 = new C1988(600);
        f5875 = c19886;
        C1988 c19887 = new C1988(700);
        C1988 c19888 = new C1988(800);
        C1988 c19889 = new C1988(DescriptorProtos$Edition.EDITION_LEGACY_VALUE);
        f5876 = c19884;
        f5872 = c19885;
        f5871 = c19886;
        f5873 = c19887;
        f5874 = AbstractC6347.m11931(c1988, c19882, c19883, c19884, c19885, c19886, c19887, c19888, c19889);
    }

    public C1988(int i) {
        this.f5877 = i;
        boolean z = false;
        if (1 <= i && i < 1001) {
            z = true;
        }
        if (z) {
            return;
        }
        AbstractC7834.m13198("Font weight can be in range [1, 1000]. Current value: " + i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1988) {
            return this.f5877 == ((C1988) obj).f5877;
        }
        return false;
    }

    public final int hashCode() {
        return this.f5877;
    }

    public final String toString() {
        return AbstractC0053.m156(new StringBuilder("FontWeight(weight="), this.f5877, ')');
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public final int compareTo(C1988 c1988) {
        return AbstractC4395.m8905(this.f5877, c1988.f5877);
    }
}
