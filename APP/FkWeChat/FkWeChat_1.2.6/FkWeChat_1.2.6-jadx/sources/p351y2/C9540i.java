package p351y2;

import androidx.emoji2.text.C0644c;
import java.lang.Character;
import java.text.BreakIterator;
import java.util.Locale;
import p024b9.AbstractC1043k;
import p024b9.AbstractC1061t;
import p030c3.AbstractC1314a;
import p335x2.C9318d0;

/* JADX INFO: renamed from: y2.i */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C9540i {

    /* JADX INFO: renamed from: e */
    public static final a f32529e = new a(null);

    /* JADX INFO: renamed from: f */
    public static final int f32530f = 8;

    /* JADX INFO: renamed from: a */
    public final CharSequence f32531a;

    /* JADX INFO: renamed from: b */
    public final int f32532b;

    /* JADX INFO: renamed from: c */
    public final int f32533c;

    /* JADX INFO: renamed from: d */
    public final BreakIterator f32534d;

    public C9540i(CharSequence charSequence, int i10, int i11, Locale locale) {
        this.f32531a = charSequence;
        if (!(i10 >= 0 && i10 <= charSequence.length())) {
            AbstractC1314a.m5291a("input start index is outside the CharSequence");
        }
        if (!(i11 >= 0 && i11 <= charSequence.length())) {
            AbstractC1314a.m5291a("input end index is outside the CharSequence");
        }
        BreakIterator wordInstance = BreakIterator.getWordInstance(locale);
        this.f32534d = wordInstance;
        this.f32532b = Math.max(0, i10 - 50);
        this.f32533c = Math.min(charSequence.length(), i11 + 50);
        wordInstance.setText(new C9318d0(charSequence, i10, i11));
    }

    /* JADX INFO: renamed from: a */
    public final void m37329a(int i10) {
        int i11 = this.f32532b;
        boolean z10 = false;
        if (i10 <= this.f32533c && i11 <= i10) {
            z10 = true;
        }
        if (z10) {
            return;
        }
        AbstractC1314a.m5291a("Invalid offset: " + i10 + ". Valid range is [" + this.f32532b + " , " + this.f32533c + ']');
    }

    /* JADX INFO: renamed from: b */
    public final int m37330b(int i10, boolean z10) {
        m37329a(i10);
        if (m37340l(i10)) {
            return (!m37338j(i10) || (m37336h(i10) && z10)) ? m37345q(i10) : i10;
        }
        if (m37336h(i10)) {
            return m37345q(i10);
        }
        return -1;
    }

    /* JADX INFO: renamed from: c */
    public final int m37331c(int i10, boolean z10) {
        m37329a(i10);
        if (m37336h(i10)) {
            return (!m37338j(i10) || (m37340l(i10) && z10)) ? m37344p(i10) : i10;
        }
        if (m37340l(i10)) {
            return m37344p(i10);
        }
        return -1;
    }

    /* JADX INFO: renamed from: d */
    public final int m37332d(int i10) {
        return m37331c(i10, true);
    }

    /* JADX INFO: renamed from: e */
    public final int m37333e(int i10) {
        return m37330b(i10, true);
    }

    /* JADX INFO: renamed from: f */
    public final int m37334f(int i10) {
        m37329a(i10);
        while (i10 != -1 && !m37343o(i10)) {
            i10 = m37345q(i10);
        }
        return i10;
    }

    /* JADX INFO: renamed from: g */
    public final int m37335g(int i10) {
        m37329a(i10);
        while (i10 != -1 && !m37342n(i10)) {
            i10 = m37344p(i10);
        }
        return i10;
    }

    /* JADX INFO: renamed from: h */
    public final boolean m37336h(int i10) {
        int i11 = this.f32532b + 1;
        if (i10 > this.f32533c || i11 > i10) {
            return false;
        }
        if (Character.isLetterOrDigit(Character.codePointBefore(this.f32531a, i10))) {
            return true;
        }
        int i12 = i10 - 1;
        if (Character.isSurrogate(this.f32531a.charAt(i12))) {
            return true;
        }
        if (!C0644c.m2518i()) {
            return false;
        }
        C0644c c0644cM2516c = C0644c.m2516c();
        return c0644cM2516c.m2522g() == 1 && c0644cM2516c.m2521f(this.f32531a, i12) != -1;
    }

    /* JADX INFO: renamed from: i */
    public final boolean m37337i(int i10) {
        int i11 = this.f32532b + 1;
        if (i10 > this.f32533c || i11 > i10) {
            return false;
        }
        return f32529e.m37346a(Character.codePointBefore(this.f32531a, i10));
    }

    /* JADX INFO: renamed from: j */
    public final boolean m37338j(int i10) {
        m37329a(i10);
        if (!this.f32534d.isBoundary(i10)) {
            return false;
        }
        if (m37340l(i10) && m37340l(i10 - 1) && m37340l(i10 + 1)) {
            return false;
        }
        return i10 <= 0 || i10 >= this.f32531a.length() - 1 || !(m37339k(i10) || m37339k(i10 + 1));
    }

    /* JADX INFO: renamed from: k */
    public final boolean m37339k(int i10) {
        int i11 = i10 - 1;
        Character.UnicodeBlock unicodeBlockOf = Character.UnicodeBlock.of(this.f32531a.charAt(i11));
        Character.UnicodeBlock unicodeBlock = Character.UnicodeBlock.HIRAGANA;
        if (AbstractC1061t.m3842c(unicodeBlockOf, unicodeBlock) && AbstractC1061t.m3842c(Character.UnicodeBlock.of(this.f32531a.charAt(i10)), Character.UnicodeBlock.KATAKANA)) {
            return true;
        }
        return AbstractC1061t.m3842c(Character.UnicodeBlock.of(this.f32531a.charAt(i10)), unicodeBlock) && AbstractC1061t.m3842c(Character.UnicodeBlock.of(this.f32531a.charAt(i11)), Character.UnicodeBlock.KATAKANA);
    }

    /* JADX INFO: renamed from: l */
    public final boolean m37340l(int i10) {
        int i11 = this.f32532b;
        if (i10 >= this.f32533c || i11 > i10) {
            return false;
        }
        if (Character.isLetterOrDigit(Character.codePointAt(this.f32531a, i10)) || Character.isSurrogate(this.f32531a.charAt(i10))) {
            return true;
        }
        if (!C0644c.m2518i()) {
            return false;
        }
        C0644c c0644cM2516c = C0644c.m2516c();
        return c0644cM2516c.m2522g() == 1 && c0644cM2516c.m2521f(this.f32531a, i10) != -1;
    }

    /* JADX INFO: renamed from: m */
    public final boolean m37341m(int i10) {
        int i11 = this.f32532b;
        if (i10 >= this.f32533c || i11 > i10) {
            return false;
        }
        return f32529e.m37346a(Character.codePointAt(this.f32531a, i10));
    }

    /* JADX INFO: renamed from: n */
    public final boolean m37342n(int i10) {
        return !m37341m(i10) && m37337i(i10);
    }

    /* JADX INFO: renamed from: o */
    public final boolean m37343o(int i10) {
        return m37341m(i10) && !m37337i(i10);
    }

    /* JADX INFO: renamed from: p */
    public final int m37344p(int i10) {
        m37329a(i10);
        int iFollowing = this.f32534d.following(i10);
        return (m37340l(iFollowing + (-1)) && m37340l(iFollowing) && !m37339k(iFollowing)) ? m37344p(iFollowing) : iFollowing;
    }

    /* JADX INFO: renamed from: q */
    public final int m37345q(int i10) {
        m37329a(i10);
        int iPreceding = this.f32534d.preceding(i10);
        return (m37340l(iPreceding) && m37336h(iPreceding) && !m37339k(iPreceding)) ? m37345q(iPreceding) : iPreceding;
    }

    /* JADX INFO: renamed from: y2.i$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {
        public /* synthetic */ a(AbstractC1043k abstractC1043k) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final boolean m37346a(int i10) {
            int type = Character.getType(i10);
            return type == 23 || type == 20 || type == 22 || type == 30 || type == 29 || type == 24 || type == 21;
        }

        public a() {
        }
    }
}
