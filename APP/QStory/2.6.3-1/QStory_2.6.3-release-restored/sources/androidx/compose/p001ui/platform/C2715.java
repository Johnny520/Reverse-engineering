package androidx.compose.p001ui.platform;

import androidx.appcompat.app.AbstractC0927;
import java.text.BreakIterator;
import kotlin.jvm.internal.AbstractC5227;

/* JADX INFO: renamed from: androidx.compose.ui.platform.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2715 extends AbstractC0927 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public static C2715 f5741;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public static C2715 f5742;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public BreakIterator f5743;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final /* synthetic */ int f5744;

    @Override // androidx.appcompat.app.AbstractC0927
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final int[] mo864(int i) {
        switch (this.f5744) {
            case 0:
                int length = m876().length();
                if (length <= 0 || i >= length) {
                    return null;
                }
                if (i < 0) {
                    i = 0;
                }
                do {
                    BreakIterator breakIterator = this.f5743;
                    if (breakIterator == null) {
                        AbstractC5227.m9467("impl");
                        throw null;
                    }
                    boolean zIsBoundary = breakIterator.isBoundary(i);
                    BreakIterator breakIterator2 = this.f5743;
                    if (zIsBoundary) {
                        if (breakIterator2 == null) {
                            AbstractC5227.m9467("impl");
                            throw null;
                        }
                        int iFollowing = breakIterator2.following(i);
                        if (iFollowing == -1) {
                            return null;
                        }
                        return m875(i, iFollowing);
                    }
                    if (breakIterator2 == null) {
                        AbstractC5227.m9467("impl");
                        throw null;
                    }
                    i = breakIterator2.following(i);
                } while (i != -1);
                return null;
            default:
                if (m876().length() <= 0 || i >= m876().length()) {
                    return null;
                }
                if (i < 0) {
                    i = 0;
                }
                while (!m4050(i) && (!m4050(i) || (i != 0 && m4050(i - 1)))) {
                    BreakIterator breakIterator3 = this.f5743;
                    if (breakIterator3 == null) {
                        AbstractC5227.m9467("impl");
                        throw null;
                    }
                    i = breakIterator3.following(i);
                    if (i == -1) {
                        return null;
                    }
                }
                BreakIterator breakIterator4 = this.f5743;
                if (breakIterator4 == null) {
                    AbstractC5227.m9467("impl");
                    throw null;
                }
                int iFollowing2 = breakIterator4.following(i);
                if (iFollowing2 == -1 || !m4049(iFollowing2)) {
                    return null;
                }
                return m875(i, iFollowing2);
        }
    }

    @Override // androidx.appcompat.app.AbstractC0927
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏 */
    public final int[] mo868(int i) {
        switch (this.f5744) {
            case 0:
                int length = m876().length();
                if (length <= 0 || i <= 0) {
                    return null;
                }
                if (i > length) {
                    i = length;
                }
                do {
                    BreakIterator breakIterator = this.f5743;
                    if (breakIterator == null) {
                        AbstractC5227.m9467("impl");
                        throw null;
                    }
                    boolean zIsBoundary = breakIterator.isBoundary(i);
                    BreakIterator breakIterator2 = this.f5743;
                    if (zIsBoundary) {
                        if (breakIterator2 == null) {
                            AbstractC5227.m9467("impl");
                            throw null;
                        }
                        int iPreceding = breakIterator2.preceding(i);
                        if (iPreceding == -1) {
                            return null;
                        }
                        return m875(iPreceding, i);
                    }
                    if (breakIterator2 == null) {
                        AbstractC5227.m9467("impl");
                        throw null;
                    }
                    i = breakIterator2.preceding(i);
                } while (i != -1);
                return null;
            default:
                int length2 = m876().length();
                if (length2 <= 0 || i <= 0) {
                    return null;
                }
                if (i > length2) {
                    i = length2;
                }
                while (i > 0 && !m4050(i - 1) && !m4049(i)) {
                    BreakIterator breakIterator3 = this.f5743;
                    if (breakIterator3 == null) {
                        AbstractC5227.m9467("impl");
                        throw null;
                    }
                    i = breakIterator3.preceding(i);
                    if (i == -1) {
                        return null;
                    }
                }
                BreakIterator breakIterator4 = this.f5743;
                if (breakIterator4 == null) {
                    AbstractC5227.m9467("impl");
                    throw null;
                }
                int iPreceding2 = breakIterator4.preceding(i);
                if (iPreceding2 == -1 || !m4050(iPreceding2)) {
                    return null;
                }
                if (iPreceding2 == 0 || !m4050(iPreceding2 - 1)) {
                    return m875(iPreceding2, i);
                }
                return null;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public boolean m4049(int i) {
        if (i <= 0 || !m4050(i - 1)) {
            return false;
        }
        return i == m876().length() || !m4050(i);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public boolean m4050(int i) {
        if (i < 0 || i >= m876().length()) {
            return false;
        }
        return Character.isLetterOrDigit(m876().codePointAt(i));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final void m4051(String str) {
        switch (this.f5744) {
            case 0:
                this.f576 = str;
                BreakIterator breakIterator = this.f5743;
                if (breakIterator != null) {
                    breakIterator.setText(str);
                    return;
                } else {
                    AbstractC5227.m9467("impl");
                    throw null;
                }
            default:
                this.f576 = str;
                BreakIterator breakIterator2 = this.f5743;
                if (breakIterator2 != null) {
                    breakIterator2.setText(str);
                    return;
                } else {
                    AbstractC5227.m9467("impl");
                    throw null;
                }
        }
    }
}
