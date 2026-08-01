package p000;

import java.util.LinkedHashMap;

/* JADX INFO: renamed from: vs */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class C0863vs {

    /* JADX INFO: renamed from: b */
    public static final C0863vs f6809b = new C0863vs(new c91((o30) null, (C0388kd) (0 == true ? 1 : 0), (LinkedHashMap) (0 == true ? 1 : 0), 127));

    /* JADX INFO: renamed from: a */
    public final c91 f6810a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0863vs(c91 c91Var) {
        this.f6810a = c91Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        return (obj instanceof C0863vs) && ((C0863vs) obj).f6810a.equals(this.f6810a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f6810a.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        if (equals(f6809b)) {
            return "EnterTransition.None";
        }
        StringBuilder sb = new StringBuilder("EnterTransition: \nFade - ");
        sb.append((String) null);
        sb.append(",\nSlide - null,\nShrink - ");
        C0388kd c0388kd = this.f6810a.f762a;
        sb.append(c0388kd != null ? c0388kd.toString() : null);
        sb.append(",\nScale - null");
        return sb.toString();
    }
}
