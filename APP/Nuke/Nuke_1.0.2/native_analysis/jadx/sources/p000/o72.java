package p000;

import java.io.Serializable;
import java.util.Iterator;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class o72 implements Serializable {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f7573h = 1;

    /* JADX INFO: renamed from: i */
    public Object f7574i;

    public o72(String str, Set set) {
        int i = 0;
        str.getClass();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            i |= ((p72) it.next()).f8015h;
        }
        Pattern patternCompile = Pattern.compile(str, (i & 2) != 0 ? i | 64 : i);
        patternCompile.getClass();
        this.f7574i = patternCompile;
    }

    /* JADX INFO: renamed from: a */
    public kj1 m3538a(String str, int i) {
        str.getClass();
        Matcher matcherRegion = ((Pattern) this.f7574i).matcher(str).useAnchoringBounds(false).useTransparentBounds(true).region(i, str.length());
        if (matcherRegion.lookingAt()) {
            return new kj1(matcherRegion, str);
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public boolean m3539b(CharSequence charSequence) {
        charSequence.getClass();
        return ((Pattern) this.f7574i).matcher(charSequence).matches();
    }

    public final String toString() {
        switch (this.f7573h) {
            case 0:
                String string = ((Pattern) this.f7574i).toString();
                string.getClass();
                return string;
            default:
                return String.valueOf(this.f7574i);
        }
    }

    public o72(String str) {
        Pattern patternCompile = Pattern.compile(str);
        patternCompile.getClass();
        this.f7574i = patternCompile;
    }

    public /* synthetic */ o72() {
    }
}
