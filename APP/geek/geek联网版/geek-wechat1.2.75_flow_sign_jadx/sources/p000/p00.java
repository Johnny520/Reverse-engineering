package p000;

import com.github.megatronking.stringfog.Base64;
import java.io.Serializable;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class p00 implements Serializable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f3559a = 0;

    /* JADX INFO: renamed from: b */
    public Object f3560b;

    public /* synthetic */ p00() {
    }

    /* JADX INFO: renamed from: a */
    public static C0138d4 m2060a(p00 p00Var, String str) {
        p00Var.getClass();
        AbstractC0493mp.m1857g("input", str);
        Matcher matcher = ((Pattern) p00Var.f3560b).matcher(str);
        AbstractC0493mp.m1856f("matcher(...)", matcher);
        if (matcher.find(0)) {
            return new C0138d4(matcher, str);
        }
        return null;
    }

    public final String toString() {
        switch (this.f3559a) {
            case Base64.DEFAULT /* 0 */:
                return String.valueOf(this.f3560b);
            default:
                String string = ((Pattern) this.f3560b).toString();
                AbstractC0493mp.m1856f("toString(...)", string);
                return string;
        }
    }

    public p00(String str) {
        AbstractC0493mp.m1857g("pattern", str);
        Pattern patternCompile = Pattern.compile(str);
        AbstractC0493mp.m1856f("compile(...)", patternCompile);
        this.f3560b = patternCompile;
    }
}
