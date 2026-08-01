package androidx.compose.p001ui.text.font;

import androidx.activity.AbstractC0900;
import com.google.protobuf.DescriptorProtos$Edition;
import java.util.List;
import kotlin.jvm.internal.AbstractC5227;
import p050.AbstractC7176;
import p211.AbstractC8663;

/* JADX INFO: renamed from: androidx.compose.ui.text.font.飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2822 implements Comparable {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public static final C2822 f6216;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public static final C2822 f6217;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public static final C2822 f6218;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public static final List f6219;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static final C2822 f6220;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static final C2822 f6221;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final int f6222;

    static {
        C2822 c2822 = new C2822(100);
        C2822 c28222 = new C2822(200);
        C2822 c28223 = new C2822(300);
        C2822 c28224 = new C2822(400);
        C2822 c28225 = new C2822(500);
        C2822 c28226 = new C2822(600);
        f6220 = c28226;
        C2822 c28227 = new C2822(700);
        C2822 c28228 = new C2822(800);
        C2822 c28229 = new C2822(DescriptorProtos$Edition.EDITION_LEGACY_VALUE);
        f6221 = c28224;
        f6217 = c28225;
        f6216 = c28226;
        f6218 = c28227;
        f6219 = AbstractC7176.m12490(c2822, c28222, c28223, c28224, c28225, c28226, c28227, c28228, c28229);
    }

    public C2822(int i) {
        this.f6222 = i;
        boolean z = false;
        if (1 <= i && i < 1001) {
            z = true;
        }
        if (z) {
            return;
        }
        AbstractC8663.m13757("Font weight can be in range [1, 1000]. Current value: " + i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2822) {
            return this.f6222 == ((C2822) obj).f6222;
        }
        return false;
    }

    public final int hashCode() {
        return this.f6222;
    }

    public final String toString() {
        return AbstractC0900.m716(new StringBuilder("FontWeight(weight="), this.f6222, ')');
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public final int compareTo(C2822 c2822) {
        return AbstractC5227.m9464(this.f6222, c2822.f6222);
    }
}
