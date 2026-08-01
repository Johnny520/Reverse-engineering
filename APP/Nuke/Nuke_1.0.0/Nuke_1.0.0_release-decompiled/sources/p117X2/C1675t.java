package p117X2;

import java.io.Serializable;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p007B0.C0173F;

/* JADX INFO: renamed from: X2.t */
/* JADX INFO: loaded from: classes.dex */
public final class C1675t implements Serializable {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f5709d = 0;

    /* JADX INFO: renamed from: e */
    public Object f5710e;

    public /* synthetic */ C1675t() {
    }

    /* JADX INFO: renamed from: a */
    public C0173F m2994a(String str, int i5) {
        AbstractC1665j.m2985e(str, "input");
        Matcher matcherRegion = ((Pattern) this.f5710e).matcher(str).useAnchoringBounds(false).useTransparentBounds(true).region(i5, str.length());
        if (matcherRegion.lookingAt()) {
            return new C0173F(matcherRegion, str);
        }
        return null;
    }

    public final String toString() {
        switch (this.f5709d) {
            case 0:
                return String.valueOf(this.f5710e);
            default:
                String string = ((Pattern) this.f5710e).toString();
                AbstractC1665j.m2984d(string, "toString(...)");
                return string;
        }
    }

    public C1675t(String str) {
        Pattern patternCompile = Pattern.compile(str);
        AbstractC1665j.m2984d(patternCompile, "compile(...)");
        this.f5710e = patternCompile;
    }
}
