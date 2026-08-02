package p000;

import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class dg2 extends Exception {

    /* JADX INFO: renamed from: h */
    public final si2 f2049h;

    public dg2(String str, si2 si2Var, String str2, String str3, Throwable th) {
        StringBuilder sb = new StringBuilder("[");
        String lowerCase = si2Var.name().toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        sb.append(lowerCase);
        sb.append("] ");
        if (str != null) {
            sb.append(str);
            sb.append(": ");
        }
        if (str2 != null) {
            sb.append(str2);
            sb.append(": ");
        }
        sb.append(str3);
        super(sb.toString(), th);
        this.f2049h = si2Var;
    }

    public /* synthetic */ dg2(String str, si2 si2Var, String str2, String str3, Throwable th, int i) {
        this(str, si2Var, (i & 4) != 0 ? null : str2, str3, (i & 16) != 0 ? null : th);
    }
}
