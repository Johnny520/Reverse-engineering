package kotlin.text;

import androidx.window.area.AbstractC2567;
import java.util.List;
import java.util.regex.Matcher;
import kotlin.collections.C4328;
import p048.C6519;

/* JADX INFO: renamed from: kotlin.text.飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5148 implements InterfaceC5150 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public C4328 f14696;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C5151 f14697 = new C5151(this, 0);

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final CharSequence f14698;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Matcher f14699;

    public C5148(Matcher matcher, CharSequence charSequence) {
        this.f14699 = matcher;
        this.f14698 = charSequence;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C5148 m10179() {
        Matcher matcher = this.f14699;
        int iEnd = matcher.end() + (matcher.end() == matcher.start() ? 1 : 0);
        CharSequence charSequence = this.f14698;
        if (iEnd > charSequence.length()) {
            return null;
        }
        Matcher matcher2 = matcher.pattern().matcher(charSequence);
        matcher2.getClass();
        if (matcher2.find(iEnd)) {
            return new C5148(matcher2, charSequence);
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C6519 m10180() {
        Matcher matcher = this.f14699;
        return AbstractC2567.m5067(matcher.start(), matcher.end());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final List m10181() {
        if (this.f14696 == null) {
            this.f14696 = new C4328(this);
        }
        C4328 c4328 = this.f14696;
        c4328.getClass();
        return c4328;
    }
}
