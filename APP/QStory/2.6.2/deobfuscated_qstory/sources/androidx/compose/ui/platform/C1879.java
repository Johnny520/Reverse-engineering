package androidx.compose.ui.platform;

import androidx.appcompat.app.AbstractC0080;
import androidx.compose.ui.text.C2033;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import kotlin.jvm.internal.AbstractC4394;

/* JADX INFO: renamed from: androidx.compose.ui.platform.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C1879 extends AbstractC0080 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public static C1879 f5391;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public static final ResolvedTextDirection f5392 = ResolvedTextDirection.Rtl;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public static final ResolvedTextDirection f5393 = ResolvedTextDirection.Ltr;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public C2033 f5394;

    @Override // androidx.appcompat.app.AbstractC0080
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final int[] mo303(int i) {
        int iM3778;
        if (m315().length() > 0 && i < m315().length()) {
            C2033 c2033 = this.f5394;
            ResolvedTextDirection resolvedTextDirection = f5392;
            if (i < 0) {
                if (c2033 == null) {
                    AbstractC4394.m8918("layoutResult");
                    throw null;
                }
                iM3778 = c2033.f5989.m3778(0);
            } else {
                if (c2033 == null) {
                    AbstractC4394.m8918("layoutResult");
                    throw null;
                }
                int iM37782 = c2033.f5989.m3778(i);
                iM3778 = m3478(iM37782, resolvedTextDirection) == i ? iM37782 : iM37782 + 1;
            }
            C2033 c20332 = this.f5394;
            if (c20332 == null) {
                AbstractC4394.m8918("layoutResult");
                throw null;
            }
            if (iM3778 < c20332.f5989.f6099) {
                return m314(m3478(iM3778, resolvedTextDirection), m3478(iM3778, f5393) + 1);
            }
        }
        return null;
    }

    @Override // androidx.appcompat.app.AbstractC0080
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏 */
    public final int[] mo307(int i) {
        int iM3778;
        if (m315().length() > 0 && i > 0) {
            int length = m315().length();
            C2033 c2033 = this.f5394;
            ResolvedTextDirection resolvedTextDirection = f5393;
            if (i > length) {
                if (c2033 == null) {
                    AbstractC4394.m8918("layoutResult");
                    throw null;
                }
                iM3778 = c2033.f5989.m3778(m315().length());
            } else {
                if (c2033 == null) {
                    AbstractC4394.m8918("layoutResult");
                    throw null;
                }
                int iM37782 = c2033.f5989.m3778(i);
                iM3778 = m3478(iM37782, resolvedTextDirection) + 1 == i ? iM37782 : iM37782 - 1;
            }
            if (iM3778 >= 0) {
                return m314(m3478(iM3778, f5392), m3478(iM3778, resolvedTextDirection) + 1);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final int m3478(int i, ResolvedTextDirection resolvedTextDirection) {
        C2033 c2033 = this.f5394;
        if (c2033 == null) {
            AbstractC4394.m8918("layoutResult");
            throw null;
        }
        int iM3737 = c2033.m3737(i);
        C2033 c20332 = this.f5394;
        if (c20332 == null) {
            AbstractC4394.m8918("layoutResult");
            throw null;
        }
        ResolvedTextDirection resolvedTextDirectionM3736 = c20332.m3736(iM3737);
        C2033 c20333 = this.f5394;
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
