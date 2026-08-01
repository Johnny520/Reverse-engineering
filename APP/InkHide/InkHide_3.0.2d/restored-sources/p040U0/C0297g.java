package p040U0;

import java.io.Serializable;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p021K0.C0169h;
import p027N0.AbstractC0223g;

/* JADX INFO: renamed from: U0.g */
/* JADX INFO: loaded from: classes.dex */
public final class C0297g implements Serializable {

    /* JADX INFO: renamed from: a */
    public final Pattern f676a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0297g(String str) {
        Pattern patternCompile = Pattern.compile(str);
        AbstractC0223g.m417d(patternCompile, "compile(...)");
        this.f676a = patternCompile;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static C0169h m501c(C0297g c0297g, String str) {
        c0297g.getClass();
        AbstractC0223g.m418e(str, "input");
        if (str.length() >= 0) {
            return new C0169h(new C0295e(c0297g, str), C0296f.f675i);
        }
        throw new IndexOutOfBoundsException("Start index out of bounds: 0, input length: " + str.length());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final boolean m502a(String str) {
        AbstractC0223g.m418e(str, "input");
        return this.f676a.matcher(str).find();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final C0294d m503b(int i2, String str) {
        AbstractC0223g.m418e(str, "input");
        Matcher matcher = this.f676a.matcher(str);
        AbstractC0223g.m417d(matcher, "matcher(...)");
        if (matcher.find(i2)) {
            return new C0294d(matcher, str);
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public final boolean m504d(String str) {
        AbstractC0223g.m418e(str, "input");
        return this.f676a.matcher(str).matches();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        String string = this.f676a.toString();
        AbstractC0223g.m417d(string, "toString(...)");
        return string;
    }

    public C0297g(int i2, String str) {
        Pattern patternCompile = Pattern.compile(str, 66);
        AbstractC0223g.m417d(patternCompile, "compile(...)");
        this.f676a = patternCompile;
    }
}
