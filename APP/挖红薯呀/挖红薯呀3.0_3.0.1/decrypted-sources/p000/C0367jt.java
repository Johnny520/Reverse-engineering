package p000;

import java.util.LinkedHashMap;

/* JADX INFO: renamed from: jt */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class C0367jt {

    /* JADX INFO: renamed from: b */
    public static final C0367jt f2938b = new C0367jt(new c91((o30) null, (C0388kd) (0 == true ? 1 : 0), (LinkedHashMap) (0 == true ? 1 : 0), 127));

    /* JADX INFO: renamed from: c */
    public static final C0367jt f2939c = new C0367jt(new c91((o30) (0 == true ? 1 : 0), (C0388kd) (0 == true ? 1 : 0), (LinkedHashMap) (0 == true ? 1 : 0), 95));

    /* JADX INFO: renamed from: a */
    public final c91 f2940a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0367jt(c91 c91Var) {
        this.f2940a = c91Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        return (obj instanceof C0367jt) && ((C0367jt) obj).f2940a.equals(this.f2940a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f2940a.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        if (equals(f2938b)) {
            return "ExitTransition.None";
        }
        if (equals(f2939c)) {
            return "ExitTransition.KeepUntilTransitionsFinished";
        }
        StringBuilder sb = new StringBuilder("ExitTransition: \nFade - ");
        sb.append((String) null);
        sb.append(",\nSlide - null,\nShrink - ");
        c91 c91Var = this.f2940a;
        C0388kd c0388kd = c91Var.f762a;
        sb.append(c0388kd != null ? c0388kd.toString() : null);
        sb.append(",\nScale - null,\nKeepUntilTransitionsFinished - ");
        sb.append(c91Var.f763b);
        return sb.toString();
    }
}
