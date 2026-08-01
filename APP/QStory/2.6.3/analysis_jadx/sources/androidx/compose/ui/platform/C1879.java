package androidx.compose.ui.platform;

import androidx.appcompat.app.AbstractC0080;
import androidx.compose.ui.text.C2033;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import kotlin.jvm.internal.AbstractC4395;

/* JADX INFO: renamed from: androidx.compose.ui.platform.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1879 extends AbstractC0080 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public static C1879 f5392;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public static final ResolvedTextDirection f5393 = ResolvedTextDirection.Rtl;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public static final ResolvedTextDirection f5394 = ResolvedTextDirection.Ltr;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public C2033 f5395;

    @Override // androidx.appcompat.app.AbstractC0080
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final int[] mo304(int i) {
        int iM3788;
        if (m316().length() > 0 && i < m316().length()) {
            C2033 c2033 = this.f5395;
            ResolvedTextDirection resolvedTextDirection = f5393;
            if (i < 0) {
                if (c2033 == null) {
                    AbstractC4395.m8908("layoutResult");
                    throw null;
                }
                iM3788 = c2033.f5990.m3788(0);
            } else {
                if (c2033 == null) {
                    AbstractC4395.m8908("layoutResult");
                    throw null;
                }
                int iM37882 = c2033.f5990.m3788(i);
                iM3788 = m3488(iM37882, resolvedTextDirection) == i ? iM37882 : iM37882 + 1;
            }
            C2033 c20332 = this.f5395;
            if (c20332 == null) {
                AbstractC4395.m8908("layoutResult");
                throw null;
            }
            if (iM3788 < c20332.f5990.f6100) {
                return m315(m3488(iM3788, resolvedTextDirection), m3488(iM3788, f5394) + 1);
            }
        }
        return null;
    }

    @Override // androidx.appcompat.app.AbstractC0080
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏 */
    public final int[] mo308(int i) {
        int iM3788;
        if (m316().length() > 0 && i > 0) {
            int length = m316().length();
            C2033 c2033 = this.f5395;
            ResolvedTextDirection resolvedTextDirection = f5394;
            if (i > length) {
                if (c2033 == null) {
                    AbstractC4395.m8908("layoutResult");
                    throw null;
                }
                iM3788 = c2033.f5990.m3788(m316().length());
            } else {
                if (c2033 == null) {
                    AbstractC4395.m8908("layoutResult");
                    throw null;
                }
                int iM37882 = c2033.f5990.m3788(i);
                iM3788 = m3488(iM37882, resolvedTextDirection) + 1 == i ? iM37882 : iM37882 - 1;
            }
            if (iM3788 >= 0) {
                return m315(m3488(iM3788, f5393), m3488(iM3788, resolvedTextDirection) + 1);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final int m3488(int i, ResolvedTextDirection resolvedTextDirection) {
        C2033 c2033 = this.f5395;
        if (c2033 == null) {
            AbstractC4395.m8908("layoutResult");
            throw null;
        }
        int iM3747 = c2033.m3747(i);
        C2033 c20332 = this.f5395;
        if (c20332 == null) {
            AbstractC4395.m8908("layoutResult");
            throw null;
        }
        ResolvedTextDirection resolvedTextDirectionM3746 = c20332.m3746(iM3747);
        C2033 c20333 = this.f5395;
        if (resolvedTextDirection != resolvedTextDirectionM3746) {
            if (c20333 != null) {
                return c20333.m3747(i);
            }
            AbstractC4395.m8908("layoutResult");
            throw null;
        }
        if (c20333 != null) {
            return c20333.f5990.m3789(i, false) - 1;
        }
        AbstractC4395.m8908("layoutResult");
        throw null;
    }
}
