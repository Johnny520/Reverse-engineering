package p099h;

import java.util.LinkedHashMap;
import tf.AbstractC4178y;

/* JADX INFO: renamed from: h.s0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1485s0 {

    /* JADX INFO: renamed from: b */
    public static final C1485s0 f4932b;

    /* JADX INFO: renamed from: c */
    public static final C1485s0 f4933c;

    /* JADX INFO: renamed from: a */
    public final C1463h1 f4934a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        LinkedHashMap linkedHashMap = null;
        C1487t0 c1487t0 = null;
        C1457f1 c1457f1 = null;
        AbstractC1441a0 abstractC1441a0 = null;
        AbstractC1441a0 abstractC1441a02 = null;
        f4932b = new C1485s0(new C1463h1(c1487t0, c1457f1, abstractC1441a0, abstractC1441a02, linkedHashMap, 127));
        f4933c = new C1485s0(new C1463h1(c1487t0, c1457f1, abstractC1441a0, abstractC1441a02, linkedHashMap, 95));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1485s0(C1463h1 c1463h1) {
        this.f4934a = c1463h1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final C1485s0 m4001a(C1485s0 c1485s0) {
        C1463h1 c1463h1 = c1485s0.f4934a;
        C1487t0 c1487t0 = c1463h1.f4864a;
        C1463h1 c1463h12 = this.f4934a;
        if (c1487t0 == null) {
            c1487t0 = c1463h12.f4864a;
        }
        C1457f1 c1457f1 = c1463h1.f4865b;
        if (c1457f1 == null) {
            c1457f1 = c1463h12.f4865b;
        }
        return new C1485s0(new C1463h1(c1487t0, c1457f1, (AbstractC1441a0) null, (AbstractC1441a0) null, c1463h1.f4866c || c1463h12.f4866c, AbstractC4178y.m8440c0(c1463h12.f4867d, c1463h1.f4867d)));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        return (obj instanceof C1485s0) && ((C1485s0) obj).f4934a.equals(this.f4934a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f4934a.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        if (equals(f4932b)) {
            return "ExitTransition.None";
        }
        if (equals(f4933c)) {
            return "ExitTransition.KeepUntilTransitionsFinished";
        }
        StringBuilder sb2 = new StringBuilder("ExitTransition: \nFade - ");
        C1463h1 c1463h1 = this.f4934a;
        C1487t0 c1487t0 = c1463h1.f4864a;
        sb2.append(c1487t0 != null ? c1487t0.toString() : null);
        sb2.append(",\nSlide - ");
        C1457f1 c1457f1 = c1463h1.f4865b;
        sb2.append(c1457f1 != null ? c1457f1.toString() : null);
        sb2.append(",\nShrink - ");
        sb2.append((String) null);
        sb2.append(",\nScale - ");
        sb2.append((String) null);
        sb2.append(",\nKeepUntilTransitionsFinished - ");
        sb2.append(c1463h1.f4866c);
        return sb2.toString();
    }
}
