package kotlin.text;

import java.util.List;
import java.util.regex.Matcher;
import kotlin.collections.C4327;
import p000.AbstractC6087;
import p048.C6518;

/* JADX INFO: renamed from: kotlin.text.飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5147 implements InterfaceC5149 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public C4327 f14696;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C5150 f14697 = new C5150(this, 0);

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final CharSequence f14698;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Matcher f14699;

    public C5147(Matcher matcher, CharSequence charSequence) {
        this.f14699 = matcher;
        this.f14698 = charSequence;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C5147 m10175() {
        Matcher matcher = this.f14699;
        int iEnd = matcher.end() + (matcher.end() == matcher.start() ? 1 : 0);
        CharSequence charSequence = this.f14698;
        if (iEnd > charSequence.length()) {
            return null;
        }
        Matcher matcher2 = matcher.pattern().matcher(charSequence);
        matcher2.getClass();
        if (matcher2.find(iEnd)) {
            return new C5147(matcher2, charSequence);
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C6518 m10176() {
        Matcher matcher = this.f14699;
        return AbstractC6087.m11422(matcher.start(), matcher.end());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final List m10177() {
        if (this.f14696 == null) {
            this.f14696 = new C4327(this);
        }
        C4327 c4327 = this.f14696;
        c4327.getClass();
        return c4327;
    }
}
