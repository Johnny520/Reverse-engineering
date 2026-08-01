package androidx.compose.ui.text.font;

import androidx.activity.AbstractC0053;
import com.google.protobuf.DescriptorProtos$Edition;
import java.util.List;
import kotlin.jvm.internal.AbstractC4394;
import p195.AbstractC7833;
import p253.AbstractC8189;

/* JADX INFO: renamed from: androidx.compose.ui.text.font.飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C1988 implements Comparable {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public static final C1988 f5870;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public static final C1988 f5871;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public static final C1988 f5872;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public static final List f5873;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static final C1988 f5874;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static final C1988 f5875;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final int f5876;

    static {
        C1988 c1988 = new C1988(100);
        C1988 c19882 = new C1988(200);
        C1988 c19883 = new C1988(300);
        C1988 c19884 = new C1988(400);
        C1988 c19885 = new C1988(500);
        C1988 c19886 = new C1988(600);
        f5874 = c19886;
        C1988 c19887 = new C1988(700);
        C1988 c19888 = new C1988(800);
        C1988 c19889 = new C1988(DescriptorProtos$Edition.EDITION_LEGACY_VALUE);
        f5875 = c19884;
        f5871 = c19885;
        f5870 = c19886;
        f5872 = c19887;
        f5873 = AbstractC8189.m13659(c1988, c19882, c19883, c19884, c19885, c19886, c19887, c19888, c19889);
    }

    public C1988(int i) {
        this.f5876 = i;
        boolean z = false;
        if (1 <= i && i < 1001) {
            z = true;
        }
        if (z) {
            return;
        }
        AbstractC7833.m13170("Font weight can be in range [1, 1000]. Current value: " + i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1988) {
            return this.f5876 == ((C1988) obj).f5876;
        }
        return false;
    }

    public final int hashCode() {
        return this.f5876;
    }

    public final String toString() {
        return AbstractC0053.m154(new StringBuilder("FontWeight(weight="), this.f5876, ')');
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public final int compareTo(C1988 c1988) {
        return AbstractC4394.m8915(this.f5876, c1988.f5876);
    }
}
