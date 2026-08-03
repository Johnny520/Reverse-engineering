package p042W0;

import java.io.Serializable;
import java.util.regex.Pattern;
import p026N0.C0268i;
import p031Q0.AbstractC0307g;
import p089x0.C1121e;

/* JADX INFO: renamed from: W0.g */
/* JADX INFO: loaded from: classes.dex */
public final class C0422g implements Serializable {

    /* JADX INFO: renamed from: a */
    public final Pattern f939a;

    public C0422g(String str) {
        Pattern patternCompile = Pattern.compile(str);
        AbstractC0307g.m702d(patternCompile, "compile(...)");
        this.f939a = patternCompile;
    }

    /* JADX INFO: renamed from: a */
    public static C0268i m1003a(C0422g c0422g, String str) {
        if (str.length() >= 0) {
            C0420e c0420e = new C0420e(c0422g, str, 0);
            C0421f c0421f = C0421f.f938i;
            return new C0268i(c0420e);
        }
        throw new IndexOutOfBoundsException("Start index out of bounds: 0, input length: " + str.length());
    }

    /* JADX INFO: renamed from: b */
    public final boolean m1004b(CharSequence charSequence) {
        AbstractC0307g.m703e(charSequence, "input");
        return this.f939a.matcher(charSequence).matches();
    }

    public final String toString() {
        String string = this.f939a.toString();
        AbstractC0307g.m702d(string, "toString(...)");
        return string;
    }

    public C0422g(String str, int i2) {
        Pattern patternCompile = Pattern.compile(str, C1121e.m2635b(2));
        AbstractC0307g.m702d(patternCompile, "compile(...)");
        this.f939a = patternCompile;
    }
}
