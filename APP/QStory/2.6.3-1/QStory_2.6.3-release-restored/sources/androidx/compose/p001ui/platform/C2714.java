package androidx.compose.p001ui.platform;

import androidx.appcompat.app.AbstractC0927;
import androidx.compose.p001ui.text.C2867;
import androidx.compose.p001ui.text.style.ResolvedTextDirection;
import kotlin.jvm.internal.AbstractC5227;

/* JADX INFO: renamed from: androidx.compose.ui.platform.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2714 extends AbstractC0927 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public static C2714 f5737;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public static final ResolvedTextDirection f5738 = ResolvedTextDirection.Rtl;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public static final ResolvedTextDirection f5739 = ResolvedTextDirection.Ltr;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public C2867 f5740;

    @Override // androidx.appcompat.app.AbstractC0927
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final int[] mo864(int i) {
        int iM4348;
        if (m876().length() > 0 && i < m876().length()) {
            C2867 c2867 = this.f5740;
            ResolvedTextDirection resolvedTextDirection = f5738;
            if (i < 0) {
                if (c2867 == null) {
                    AbstractC5227.m9467("layoutResult");
                    throw null;
                }
                iM4348 = c2867.f6335.m4348(0);
            } else {
                if (c2867 == null) {
                    AbstractC5227.m9467("layoutResult");
                    throw null;
                }
                int iM43482 = c2867.f6335.m4348(i);
                iM4348 = m4048(iM43482, resolvedTextDirection) == i ? iM43482 : iM43482 + 1;
            }
            C2867 c28672 = this.f5740;
            if (c28672 == null) {
                AbstractC5227.m9467("layoutResult");
                throw null;
            }
            if (iM4348 < c28672.f6335.f6445) {
                return m875(m4048(iM4348, resolvedTextDirection), m4048(iM4348, f5739) + 1);
            }
        }
        return null;
    }

    @Override // androidx.appcompat.app.AbstractC0927
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏 */
    public final int[] mo868(int i) {
        int iM4348;
        if (m876().length() > 0 && i > 0) {
            int length = m876().length();
            C2867 c2867 = this.f5740;
            ResolvedTextDirection resolvedTextDirection = f5739;
            if (i > length) {
                if (c2867 == null) {
                    AbstractC5227.m9467("layoutResult");
                    throw null;
                }
                iM4348 = c2867.f6335.m4348(m876().length());
            } else {
                if (c2867 == null) {
                    AbstractC5227.m9467("layoutResult");
                    throw null;
                }
                int iM43482 = c2867.f6335.m4348(i);
                iM4348 = m4048(iM43482, resolvedTextDirection) + 1 == i ? iM43482 : iM43482 - 1;
            }
            if (iM4348 >= 0) {
                return m875(m4048(iM4348, f5738), m4048(iM4348, resolvedTextDirection) + 1);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final int m4048(int i, ResolvedTextDirection resolvedTextDirection) {
        C2867 c2867 = this.f5740;
        if (c2867 == null) {
            AbstractC5227.m9467("layoutResult");
            throw null;
        }
        int iM4307 = c2867.m4307(i);
        C2867 c28672 = this.f5740;
        if (c28672 == null) {
            AbstractC5227.m9467("layoutResult");
            throw null;
        }
        ResolvedTextDirection resolvedTextDirectionM4306 = c28672.m4306(iM4307);
        C2867 c28673 = this.f5740;
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
