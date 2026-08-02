package p000;

import java.util.LinkedHashSet;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class zf1 {

    /* JADX INFO: renamed from: a */
    public yf1 f13870a;

    /* JADX INFO: renamed from: b */
    public String f13871b;

    /* JADX INFO: renamed from: c */
    public final LinkedHashSet f13872c = new LinkedHashSet();

    /* JADX INFO: renamed from: d */
    public final LinkedHashSet f13873d = new LinkedHashSet();

    /* JADX INFO: renamed from: e */
    public final LinkedHashSet f13874e = new LinkedHashSet();

    /* JADX INFO: renamed from: f */
    public final LinkedHashSet f13875f = new LinkedHashSet();

    /* JADX INFO: renamed from: a */
    public Map mo2193a() {
        return we1.m5876q0(new ow1("name", this.f13871b), new ow1("nameCondition", null), new ow1("modifiers", this.f13872c), new ow1("modifiersNot", this.f13873d), new ow1("modifiersCondition", null), new ow1("isSynthetic", null), new ow1("isSyntheticNot", null), new ow1("annotations", this.f13874e), new ow1("annotationsNot", this.f13875f), new ow1("genericString", null));
    }

    /* JADX INFO: renamed from: b */
    public final void m6411b() {
        yf1 yf1Var = this.f13870a;
        if (yf1Var != null) {
            yf1Var.f13436c = true;
        }
    }
}
