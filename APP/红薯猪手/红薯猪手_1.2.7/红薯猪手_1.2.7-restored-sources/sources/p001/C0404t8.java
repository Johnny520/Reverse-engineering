package p001;

import java.io.Serializable;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: ۟.t8 */
/* JADX INFO: loaded from: classes.dex */
public final class C0404t8 implements Serializable {

    /* JADX INFO: renamed from: ۥ */
    public final Pattern f1114;

    /* JADX WARN: Illegal instructions before constructor call */
    public C0404t8(String str) {
        C0237h4.m1090("pattern", str);
        Pattern patternCompile = Pattern.compile(str);
        C0237h4.m1089("compile(...)", patternCompile);
        this(patternCompile);
    }

    public C0404t8(Pattern pattern) {
        this.f1114 = pattern;
    }

    public final String toString() {
        String string = this.f1114.toString();
        C0237h4.m1089("toString(...)", string);
        return string;
    }
}
