package androidx.compose.ui.platform;

import androidx.appcompat.app.AbstractC0080;
import java.text.BreakIterator;
import kotlin.jvm.internal.AbstractC4395;

/* JADX INFO: renamed from: androidx.compose.ui.platform.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1880 extends AbstractC0080 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public static C1880 f5396;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public static C1880 f5397;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public BreakIterator f5398;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final /* synthetic */ int f5399;

    @Override // androidx.appcompat.app.AbstractC0080
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final int[] mo304(int i) {
        switch (this.f5399) {
            case 0:
                int length = m316().length();
                if (length <= 0 || i >= length) {
                    return null;
                }
                if (i < 0) {
                    i = 0;
                }
                do {
                    BreakIterator breakIterator = this.f5398;
                    if (breakIterator == null) {
                        AbstractC4395.m8908("impl");
                        throw null;
                    }
                    boolean zIsBoundary = breakIterator.isBoundary(i);
                    BreakIterator breakIterator2 = this.f5398;
                    if (zIsBoundary) {
                        if (breakIterator2 == null) {
                            AbstractC4395.m8908("impl");
                            throw null;
                        }
                        int iFollowing = breakIterator2.following(i);
                        if (iFollowing == -1) {
                            return null;
                        }
                        return m315(i, iFollowing);
                    }
                    if (breakIterator2 == null) {
                        AbstractC4395.m8908("impl");
                        throw null;
                    }
                    i = breakIterator2.following(i);
                } while (i != -1);
                return null;
            default:
                if (m316().length() <= 0 || i >= m316().length()) {
                    return null;
                }
                if (i < 0) {
                    i = 0;
                }
                while (!m3490(i) && (!m3490(i) || (i != 0 && m3490(i - 1)))) {
                    BreakIterator breakIterator3 = this.f5398;
                    if (breakIterator3 == null) {
                        AbstractC4395.m8908("impl");
                        throw null;
                    }
                    i = breakIterator3.following(i);
                    if (i == -1) {
                        return null;
                    }
                }
                BreakIterator breakIterator4 = this.f5398;
                if (breakIterator4 == null) {
                    AbstractC4395.m8908("impl");
                    throw null;
                }
                int iFollowing2 = breakIterator4.following(i);
                if (iFollowing2 == -1 || !m3489(iFollowing2)) {
                    return null;
                }
                return m315(i, iFollowing2);
        }
    }

    @Override // androidx.appcompat.app.AbstractC0080
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏 */
    public final int[] mo308(int i) {
        switch (this.f5399) {
            case 0:
                int length = m316().length();
                if (length <= 0 || i <= 0) {
                    return null;
                }
                if (i > length) {
                    i = length;
                }
                do {
                    BreakIterator breakIterator = this.f5398;
                    if (breakIterator == null) {
                        AbstractC4395.m8908("impl");
                        throw null;
                    }
                    boolean zIsBoundary = breakIterator.isBoundary(i);
                    BreakIterator breakIterator2 = this.f5398;
                    if (zIsBoundary) {
                        if (breakIterator2 == null) {
                            AbstractC4395.m8908("impl");
                            throw null;
                        }
                        int iPreceding = breakIterator2.preceding(i);
                        if (iPreceding == -1) {
                            return null;
                        }
                        return m315(iPreceding, i);
                    }
                    if (breakIterator2 == null) {
                        AbstractC4395.m8908("impl");
                        throw null;
                    }
                    i = breakIterator2.preceding(i);
                } while (i != -1);
                return null;
            default:
                int length2 = m316().length();
                if (length2 <= 0 || i <= 0) {
                    return null;
                }
                if (i > length2) {
                    i = length2;
                }
                while (i > 0 && !m3490(i - 1) && !m3489(i)) {
                    BreakIterator breakIterator3 = this.f5398;
                    if (breakIterator3 == null) {
                        AbstractC4395.m8908("impl");
                        throw null;
                    }
                    i = breakIterator3.preceding(i);
                    if (i == -1) {
                        return null;
                    }
                }
                BreakIterator breakIterator4 = this.f5398;
                if (breakIterator4 == null) {
                    AbstractC4395.m8908("impl");
                    throw null;
                }
                int iPreceding2 = breakIterator4.preceding(i);
                if (iPreceding2 == -1 || !m3490(iPreceding2)) {
                    return null;
                }
                if (iPreceding2 == 0 || !m3490(iPreceding2 - 1)) {
                    return m315(iPreceding2, i);
                }
                return null;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public boolean m3489(int i) {
        if (i <= 0 || !m3490(i - 1)) {
            return false;
        }
        return i == m316().length() || !m3490(i);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public boolean m3490(int i) {
        if (i < 0 || i >= m316().length()) {
            return false;
        }
        return Character.isLetterOrDigit(m316().codePointAt(i));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final void m3491(String str) {
        switch (this.f5399) {
            case 0:
                this.f231 = str;
                BreakIterator breakIterator = this.f5398;
                if (breakIterator != null) {
                    breakIterator.setText(str);
                    return;
                } else {
                    AbstractC4395.m8908("impl");
                    throw null;
                }
            default:
                this.f231 = str;
                BreakIterator breakIterator2 = this.f5398;
                if (breakIterator2 != null) {
                    breakIterator2.setText(str);
                    return;
                } else {
                    AbstractC4395.m8908("impl");
                    throw null;
                }
        }
    }
}
