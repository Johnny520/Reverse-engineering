package p000;

import java.io.Serializable;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class du0 implements Serializable {

    /* JADX INFO: renamed from: d */
    public final Pattern f1193d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public du0(String str) {
        Pattern patternCompile = Pattern.compile(str);
        patternCompile.getClass();
        this.f1193d = patternCompile;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static C0447lx m725a(du0 du0Var, String str) {
        str.getClass();
        if (str.length() >= 0) {
            return new C0447lx(new C0081c7(11, du0Var, str), cu0.f892d);
        }
        throw new IndexOutOfBoundsException("Start index out of bounds: 0, input length: " + str.length());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        String string = this.f1193d.toString();
        string.getClass();
        return string;
    }
}
