package kotlin.text;

import androidx.window.area.AbstractC3400;
import java.util.List;
import java.util.regex.Matcher;
import kotlin.collections.C5160;
import p064.C7348;

/* JADX INFO: renamed from: kotlin.text.飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5980 implements InterfaceC5982 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public C5160 f15041;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C5983 f15042 = new C5983(this, 0);

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final CharSequence f15043;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Matcher f15044;

    public C5980(Matcher matcher, CharSequence charSequence) {
        this.f15044 = matcher;
        this.f15043 = charSequence;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C5980 m10738() {
        Matcher matcher = this.f15044;
        int iEnd = matcher.end() + (matcher.end() == matcher.start() ? 1 : 0);
        CharSequence charSequence = this.f15043;
        if (iEnd > charSequence.length()) {
            return null;
        }
        Matcher matcher2 = matcher.pattern().matcher(charSequence);
        matcher2.getClass();
        if (matcher2.find(iEnd)) {
            return new C5980(matcher2, charSequence);
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C7348 m10739() {
        Matcher matcher = this.f15044;
        return AbstractC3400.m5627(matcher.start(), matcher.end());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final List m10740() {
        if (this.f15041 == null) {
            this.f15041 = new C5160(this);
        }
        C5160 c5160 = this.f15041;
        c5160.getClass();
        return c5160;
    }
}
