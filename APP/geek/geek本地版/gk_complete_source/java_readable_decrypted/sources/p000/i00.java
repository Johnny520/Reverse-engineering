package p000;

import com.github.megatronking.stringfog.Base64;
import java.io.Serializable;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class i00 implements Serializable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f2325a = 0;

    /* JADX INFO: renamed from: b */
    public Object f2326b;

    public /* synthetic */ i00() {
    }

    /* JADX INFO: renamed from: a */
    public static C0138d4 m1383a(i00 i00Var, String str) {
        i00Var.getClass();
        AbstractC0346ip.m1503o("input", str);
        Matcher matcher = ((Pattern) i00Var.f2326b).matcher(str);
        AbstractC0346ip.m1502n("matcher(...)", matcher);
        if (matcher.find(0)) {
            return new C0138d4(matcher, str);
        }
        return null;
    }

    public final String toString() {
        switch (this.f2325a) {
            case Base64.DEFAULT /* 0 */:
                return String.valueOf(this.f2326b);
            default:
                String string = ((Pattern) this.f2326b).toString();
                AbstractC0346ip.m1502n("toString(...)", string);
                return string;
        }
    }

    public i00(String str) {
        AbstractC0346ip.m1503o("pattern", str);
        Pattern patternCompile = Pattern.compile(str);
        AbstractC0346ip.m1502n("compile(...)", patternCompile);
        this.f2326b = patternCompile;
    }
}
