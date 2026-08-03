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

    static {
    }

    public C0422g(String r2) {
        Pattern r22 = Pattern.compile(r2);
        AbstractC0307g.m702d(r22, "compile(...)");
        this.f939a = r22;
    }

    /* JADX INFO: renamed from: a */
    public static C0268i m1003a(C0422g r3, String r4) {
        if (r4.length() < 0) goto L7;
        C0420e r02 = new C0420e(r3, r4, 0);
        C0421f r32 = C0421f.f938i;
        return new C0268i(r02);
    L7:
        throw new IndexOutOfBoundsException("Start index out of bounds: 0, input length: " + r4.length());
    }

    /* JADX INFO: renamed from: b */
    public final boolean m1004b(CharSequence r2) {
        AbstractC0307g.m703e(r2, "input");
        return this.f939a.matcher(r2).matches();
    }

    public final String toString() {
        String r02 = this.f939a.toString();
        AbstractC0307g.m702d(r02, "toString(...)");
        return r02;
    }

    public C0422g(String r1, int r2) {
        Pattern r12 = Pattern.compile(r1, C1121e.m2635b(2));
        AbstractC0307g.m702d(r12, "compile(...)");
        this.f939a = r12;
    }
}
