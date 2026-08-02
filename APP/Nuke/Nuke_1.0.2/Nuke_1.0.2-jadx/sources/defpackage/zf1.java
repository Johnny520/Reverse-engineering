package defpackage;

import java.util.LinkedHashSet;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class zf1 {
    public yf1 a;
    public String b;
    public final LinkedHashSet c = new LinkedHashSet();
    public final LinkedHashSet d = new LinkedHashSet();
    public final LinkedHashSet e = new LinkedHashSet();
    public final LinkedHashSet f = new LinkedHashSet();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Map a() {
        return we1.q0(new ow1("name", this.b), new ow1("nameCondition", null), new ow1("modifiers", this.c), new ow1("modifiersNot", this.d), new ow1("modifiersCondition", null), new ow1("isSynthetic", null), new ow1("isSyntheticNot", null), new ow1("annotations", this.e), new ow1("annotationsNot", this.f), new ow1("genericString", null));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void b() {
        yf1 yf1Var = this.a;
        if (yf1Var != null) {
            yf1Var.c = true;
        }
    }
}
