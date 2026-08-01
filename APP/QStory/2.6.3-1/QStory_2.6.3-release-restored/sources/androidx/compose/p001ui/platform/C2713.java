package androidx.compose.p001ui.platform;

import androidx.appcompat.app.AbstractC0927;
import androidx.compose.p001ui.semantics.C2788;
import androidx.compose.p001ui.text.C2867;
import androidx.compose.p001ui.text.style.ResolvedTextDirection;
import kotlin.jvm.internal.AbstractC5227;
import p128.C8157;

/* JADX INFO: renamed from: androidx.compose.ui.platform.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2713 extends AbstractC0927 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public static C2713 f5733;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public C2788 f5735;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public C2867 f5736;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public static final ResolvedTextDirection f5734 = ResolvedTextDirection.Rtl;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public static final ResolvedTextDirection f5732 = ResolvedTextDirection.Ltr;

    @Override // androidx.appcompat.app.AbstractC0927
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final int[] mo864(int i) {
        int iM4347;
        if (m876().length() > 0 && i < m876().length()) {
            try {
                C2788 c2788 = this.f5735;
                if (c2788 == null) {
                    AbstractC5227.m9467("node");
                    throw null;
                }
                C8157 c8157M4226 = c2788.m4226();
                int iRound = Math.round(c8157M4226.f19882 - c8157M4226.f19884);
                if (i <= 0) {
                    i = 0;
                }
                C2867 c2867 = this.f5736;
                if (c2867 == null) {
                    AbstractC5227.m9467("layoutResult");
                    throw null;
                }
                int iM4348 = c2867.f6335.m4348(i);
                C2867 c28672 = this.f5736;
                if (c28672 == null) {
                    AbstractC5227.m9467("layoutResult");
                    throw null;
                }
                float fM4346 = c28672.f6335.m4346(iM4348) + iRound;
                C2867 c28673 = this.f5736;
                if (c28673 == null) {
                    AbstractC5227.m9467("layoutResult");
                    throw null;
                }
                float fM43462 = c28673.f6335.m4346(r0.f6445 - 1);
                C2867 c28674 = this.f5736;
                if (fM4346 < fM43462) {
                    if (c28674 == null) {
                        AbstractC5227.m9467("layoutResult");
                        throw null;
                    }
                    iM4347 = c28674.f6335.m4347(fM4346);
                } else {
                    if (c28674 == null) {
                        AbstractC5227.m9467("layoutResult");
                        throw null;
                    }
                    iM4347 = c28674.f6335.f6445;
                }
                return m875(i, m4047(iM4347 - 1, f5732) + 1);
            } catch (IllegalStateException unused) {
            }
        }
        return null;
    }

    @Override // androidx.appcompat.app.AbstractC0927
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏 */
    public final int[] mo868(int i) {
        int iM4347;
        if (m876().length() > 0 && i > 0) {
            try {
                C2788 c2788 = this.f5735;
                if (c2788 == null) {
                    AbstractC5227.m9467("node");
                    throw null;
                }
                C8157 c8157M4226 = c2788.m4226();
                int iRound = Math.round(c8157M4226.f19882 - c8157M4226.f19884);
                int length = m876().length();
                if (length <= i) {
                    i = length;
                }
                C2867 c2867 = this.f5736;
                if (c2867 == null) {
                    AbstractC5227.m9467("layoutResult");
                    throw null;
                }
                int iM4348 = c2867.f6335.m4348(i);
                C2867 c28672 = this.f5736;
                if (c28672 == null) {
                    AbstractC5227.m9467("layoutResult");
                    throw null;
                }
                float fM4346 = c28672.f6335.m4346(iM4348) - iRound;
                if (fM4346 > 0.0f) {
                    C2867 c28673 = this.f5736;
                    if (c28673 == null) {
                        AbstractC5227.m9467("layoutResult");
                        throw null;
                    }
                    iM4347 = c28673.f6335.m4347(fM4346);
                } else {
                    iM4347 = 0;
                }
                if (i == m876().length() && iM4347 < iM4348) {
                    iM4347++;
                }
                return m875(m4047(iM4347, f5734), i);
            } catch (IllegalStateException unused) {
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final int m4047(int i, ResolvedTextDirection resolvedTextDirection) {
        C2867 c2867 = this.f5736;
        if (c2867 == null) {
            AbstractC5227.m9467("layoutResult");
            throw null;
        }
        int iM4307 = c2867.m4307(i);
        C2867 c28672 = this.f5736;
        if (c28672 == null) {
            AbstractC5227.m9467("layoutResult");
            throw null;
        }
        ResolvedTextDirection resolvedTextDirectionM4306 = c28672.m4306(iM4307);
        C2867 c28673 = this.f5736;
        if (resolvedTextDirection != resolvedTextDirectionM4306) {
            if (c28673 != null) {
                return c28673.m4307(i);
            }
            AbstractC5227.m9467("layoutResult");
            throw null;
        }
        if (c28673 != null) {
            return c28673.f6335.m4349(i, false) - 1;
        }
        AbstractC5227.m9467("layoutResult");
        throw null;
    }
}
