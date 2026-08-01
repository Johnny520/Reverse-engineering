package androidx.compose.ui.platform;

import androidx.appcompat.app.AbstractC0080;
import androidx.compose.ui.semantics.C1953;
import androidx.compose.ui.text.C2033;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import kotlin.jvm.internal.AbstractC4394;
import p112.C7327;

/* JADX INFO: renamed from: androidx.compose.ui.platform.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C1878 extends AbstractC0080 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public static C1878 f5387;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public C1953 f5389;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public C2033 f5390;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public static final ResolvedTextDirection f5388 = ResolvedTextDirection.Rtl;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public static final ResolvedTextDirection f5386 = ResolvedTextDirection.Ltr;

    @Override // androidx.appcompat.app.AbstractC0080
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final int[] mo303(int i) {
        int iM3777;
        if (m315().length() > 0 && i < m315().length()) {
            try {
                C1953 c1953 = this.f5389;
                if (c1953 == null) {
                    AbstractC4394.m8918("node");
                    throw null;
                }
                C7327 c7327M3656 = c1953.m3656();
                int iRound = Math.round(c7327M3656.f19542 - c7327M3656.f19544);
                if (i <= 0) {
                    i = 0;
                }
                C2033 c2033 = this.f5390;
                if (c2033 == null) {
                    AbstractC4394.m8918("layoutResult");
                    throw null;
                }
                int iM3778 = c2033.f5989.m3778(i);
                C2033 c20332 = this.f5390;
                if (c20332 == null) {
                    AbstractC4394.m8918("layoutResult");
                    throw null;
                }
                float fM3776 = c20332.f5989.m3776(iM3778) + iRound;
                C2033 c20333 = this.f5390;
                if (c20333 == null) {
                    AbstractC4394.m8918("layoutResult");
                    throw null;
                }
                float fM37762 = c20333.f5989.m3776(r0.f6099 - 1);
                C2033 c20334 = this.f5390;
                if (fM3776 < fM37762) {
                    if (c20334 == null) {
                        AbstractC4394.m8918("layoutResult");
                        throw null;
                    }
                    iM3777 = c20334.f5989.m3777(fM3776);
                } else {
                    if (c20334 == null) {
                        AbstractC4394.m8918("layoutResult");
                        throw null;
                    }
                    iM3777 = c20334.f5989.f6099;
                }
                return m314(i, m3477(iM3777 - 1, f5386) + 1);
            } catch (IllegalStateException unused) {
            }
        }
        return null;
    }

    @Override // androidx.appcompat.app.AbstractC0080
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏 */
    public final int[] mo307(int i) {
        int iM3777;
        if (m315().length() > 0 && i > 0) {
            try {
                C1953 c1953 = this.f5389;
                if (c1953 == null) {
                    AbstractC4394.m8918("node");
                    throw null;
                }
                C7327 c7327M3656 = c1953.m3656();
                int iRound = Math.round(c7327M3656.f19542 - c7327M3656.f19544);
                int length = m315().length();
                if (length <= i) {
                    i = length;
                }
                C2033 c2033 = this.f5390;
                if (c2033 == null) {
                    AbstractC4394.m8918("layoutResult");
                    throw null;
                }
                int iM3778 = c2033.f5989.m3778(i);
                C2033 c20332 = this.f5390;
                if (c20332 == null) {
                    AbstractC4394.m8918("layoutResult");
                    throw null;
                }
                float fM3776 = c20332.f5989.m3776(iM3778) - iRound;
                if (fM3776 > 0.0f) {
                    C2033 c20333 = this.f5390;
                    if (c20333 == null) {
                        AbstractC4394.m8918("layoutResult");
                        throw null;
                    }
                    iM3777 = c20333.f5989.m3777(fM3776);
                } else {
                    iM3777 = 0;
                }
                if (i == m315().length() && iM3777 < iM3778) {
                    iM3777++;
                }
                return m314(m3477(iM3777, f5388), i);
            } catch (IllegalStateException unused) {
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final int m3477(int i, ResolvedTextDirection resolvedTextDirection) {
        C2033 c2033 = this.f5390;
        if (c2033 == null) {
            AbstractC4394.m8918("layoutResult");
            throw null;
        }
        int iM3737 = c2033.m3737(i);
        C2033 c20332 = this.f5390;
        if (c20332 == null) {
            AbstractC4394.m8918("layoutResult");
            throw null;
        }
        ResolvedTextDirection resolvedTextDirectionM3736 = c20332.m3736(iM3737);
        C2033 c20333 = this.f5390;
        if (resolvedTextDirection != resolvedTextDirectionM3736) {
            if (c20333 != null) {
                return c20333.m3737(i);
            }
            AbstractC4394.m8918("layoutResult");
            throw null;
        }
        if (c20333 != null) {
            return c20333.f5989.m3779(i, false) - 1;
        }
        AbstractC4394.m8918("layoutResult");
        throw null;
    }
}
