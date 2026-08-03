package p099h;

import java.util.LinkedHashMap;
import tf.AbstractC4178y;

/* JADX INFO: renamed from: h.r0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1483r0 {

    /* JADX INFO: renamed from: b */
    public static final C1483r0 f4926b = new C1483r0(new C1463h1((C1487t0) null, (C1457f1) null, (AbstractC1441a0) null, (AbstractC1441a0) null, (LinkedHashMap) null, 127));

    /* JADX INFO: renamed from: a */
    public final C1463h1 f4927a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1483r0(C1463h1 c1463h1) {
        this.f4927a = c1463h1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final C1483r0 m4000a(C1483r0 c1483r0) {
        C1463h1 c1463h1 = c1483r0.f4927a;
        C1487t0 c1487t0 = c1463h1.f4864a;
        C1463h1 c1463h12 = this.f4927a;
        if (c1487t0 == null) {
            c1487t0 = c1463h12.f4864a;
        }
        C1457f1 c1457f1 = c1463h1.f4865b;
        if (c1457f1 == null) {
            c1457f1 = c1463h12.f4865b;
        }
        return new C1483r0(new C1463h1(c1487t0, c1457f1, (AbstractC1441a0) null, (AbstractC1441a0) null, AbstractC4178y.m8440c0(c1463h12.f4867d, c1463h1.f4867d), 32));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        return (obj instanceof C1483r0) && ((C1483r0) obj).f4927a.equals(this.f4927a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f4927a.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        if (equals(f4926b)) {
            return "EnterTransition.None";
        }
        StringBuilder sb2 = new StringBuilder("EnterTransition: \nFade - ");
        C1463h1 c1463h1 = this.f4927a;
        C1487t0 c1487t0 = c1463h1.f4864a;
        sb2.append(c1487t0 != null ? c1487t0.toString() : null);
        sb2.append(",\nSlide - ");
        C1457f1 c1457f1 = c1463h1.f4865b;
        sb2.append(c1457f1 != null ? c1457f1.toString() : null);
        sb2.append(",\nShrink - ");
        sb2.append((String) null);
        sb2.append(",\nScale - ");
        sb2.append((String) null);
        return sb2.toString();
    }
}
