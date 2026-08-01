package androidx.compose.ui.platform;

import androidx.appcompat.app.AbstractC0080;
import androidx.compose.ui.semantics.C1953;
import androidx.compose.ui.text.C2033;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import kotlin.jvm.internal.AbstractC4395;
import p112.C7328;

/* JADX INFO: renamed from: androidx.compose.ui.platform.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1878 extends AbstractC0080 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public static C1878 f5388;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public C1953 f5390;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public C2033 f5391;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public static final ResolvedTextDirection f5389 = ResolvedTextDirection.Rtl;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public static final ResolvedTextDirection f5387 = ResolvedTextDirection.Ltr;

    @Override // androidx.appcompat.app.AbstractC0080
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final int[] mo304(int i) {
        int iM3787;
        if (m316().length() > 0 && i < m316().length()) {
            try {
                C1953 c1953 = this.f5390;
                if (c1953 == null) {
                    AbstractC4395.m8908("node");
                    throw null;
                }
                C7328 c7328M3666 = c1953.m3666();
                int iRound = Math.round(c7328M3666.f19537 - c7328M3666.f19539);
                if (i <= 0) {
                    i = 0;
                }
                C2033 c2033 = this.f5391;
                if (c2033 == null) {
                    AbstractC4395.m8908("layoutResult");
                    throw null;
                }
                int iM3788 = c2033.f5990.m3788(i);
                C2033 c20332 = this.f5391;
                if (c20332 == null) {
                    AbstractC4395.m8908("layoutResult");
                    throw null;
                }
                float fM3786 = c20332.f5990.m3786(iM3788) + iRound;
                C2033 c20333 = this.f5391;
                if (c20333 == null) {
                    AbstractC4395.m8908("layoutResult");
                    throw null;
                }
                float fM37862 = c20333.f5990.m3786(r0.f6100 - 1);
                C2033 c20334 = this.f5391;
                if (fM3786 < fM37862) {
                    if (c20334 == null) {
                        AbstractC4395.m8908("layoutResult");
                        throw null;
                    }
                    iM3787 = c20334.f5990.m3787(fM3786);
                } else {
                    if (c20334 == null) {
                        AbstractC4395.m8908("layoutResult");
                        throw null;
                    }
                    iM3787 = c20334.f5990.f6100;
                }
                return m315(i, m3487(iM3787 - 1, f5387) + 1);
            } catch (IllegalStateException unused) {
            }
        }
        return null;
    }

    @Override // androidx.appcompat.app.AbstractC0080
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏 */
    public final int[] mo308(int i) {
        int iM3787;
        if (m316().length() > 0 && i > 0) {
            try {
                C1953 c1953 = this.f5390;
                if (c1953 == null) {
                    AbstractC4395.m8908("node");
                    throw null;
                }
                C7328 c7328M3666 = c1953.m3666();
                int iRound = Math.round(c7328M3666.f19537 - c7328M3666.f19539);
                int length = m316().length();
                if (length <= i) {
                    i = length;
                }
                C2033 c2033 = this.f5391;
                if (c2033 == null) {
                    AbstractC4395.m8908("layoutResult");
                    throw null;
                }
                int iM3788 = c2033.f5990.m3788(i);
                C2033 c20332 = this.f5391;
                if (c20332 == null) {
                    AbstractC4395.m8908("layoutResult");
                    throw null;
                }
                float fM3786 = c20332.f5990.m3786(iM3788) - iRound;
                if (fM3786 > 0.0f) {
                    C2033 c20333 = this.f5391;
                    if (c20333 == null) {
                        AbstractC4395.m8908("layoutResult");
                        throw null;
                    }
                    iM3787 = c20333.f5990.m3787(fM3786);
                } else {
                    iM3787 = 0;
                }
                if (i == m316().length() && iM3787 < iM3788) {
                    iM3787++;
                }
                return m315(m3487(iM3787, f5389), i);
            } catch (IllegalStateException unused) {
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final int m3487(int i, ResolvedTextDirection resolvedTextDirection) {
        C2033 c2033 = this.f5391;
        if (c2033 == null) {
            AbstractC4395.m8908("layoutResult");
            throw null;
        }
        int iM3747 = c2033.m3747(i);
        C2033 c20332 = this.f5391;
        if (c20332 == null) {
            AbstractC4395.m8908("layoutResult");
            throw null;
        }
        ResolvedTextDirection resolvedTextDirectionM3746 = c20332.m3746(iM3747);
        C2033 c20333 = this.f5391;
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
