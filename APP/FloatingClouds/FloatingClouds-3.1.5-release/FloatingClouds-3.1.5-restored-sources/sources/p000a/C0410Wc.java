package p000a;

import java.io.Serializable;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: a.Wc */
/* JADX INFO: loaded from: classes.dex */
public final class C0410Wc implements Serializable {

    /* JADX INFO: renamed from: a */
    public final Pattern f1559a;

    public C0410Wc(String str) {
        C0631i9.m1482e(str, "pattern");
        Pattern patternCompile = Pattern.compile(str);
        C0631i9.m1481d(patternCompile, "compile(...)");
        this.f1559a = patternCompile;
    }

    public final String toString() {
        String string = this.f1559a.toString();
        C0631i9.m1481d(string, "toString(...)");
        return string;
    }
}
