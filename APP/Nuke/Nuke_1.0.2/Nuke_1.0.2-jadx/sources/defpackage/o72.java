package defpackage;

import java.io.Serializable;
import java.util.Iterator;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class o72 implements Serializable {
    public final /* synthetic */ int h = 1;
    public Object i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public o72(String str, Set set) {
        int i = 0;
        str.getClass();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            i |= ((p72) it.next()).h;
        }
        Pattern patternCompile = Pattern.compile(str, (i & 2) != 0 ? i | 64 : i);
        patternCompile.getClass();
        this.i = patternCompile;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public kj1 a(String str, int i) {
        str.getClass();
        Matcher matcherRegion = ((Pattern) this.i).matcher(str).useAnchoringBounds(false).useTransparentBounds(true).region(i, str.length());
        if (matcherRegion.lookingAt()) {
            return new kj1(matcherRegion, str);
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean b(CharSequence charSequence) {
        charSequence.getClass();
        return ((Pattern) this.i).matcher(charSequence).matches();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        switch (this.h) {
            case 0:
                String string = ((Pattern) this.i).toString();
                string.getClass();
                return string;
            default:
                return String.valueOf(this.i);
        }
    }

    public o72(String str) {
        Pattern patternCompile = Pattern.compile(str);
        patternCompile.getClass();
        this.i = patternCompile;
    }

    public /* synthetic */ o72() {
    }
}
