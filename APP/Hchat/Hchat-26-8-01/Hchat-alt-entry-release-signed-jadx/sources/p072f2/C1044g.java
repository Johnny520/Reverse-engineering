package p072f2;

import java.util.Comparator;
import p057e1.C0808c;
import p276sf.C3958e;

/* JADX INFO: renamed from: f2.g */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1044g implements Comparator {

    /* JADX INFO: renamed from: h */
    public static final C1044g f3279h = new C1044g(0);

    /* JADX INFO: renamed from: i */
    public static final C1044g f3280i = new C1044g(1);

    /* JADX INFO: renamed from: j */
    public static final C1044g f3281j = new C1044g(2);

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f3282g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [f2.g.<clinit>():void] */
    public /* synthetic */ C1044g(int i9) {
        this.f3282g = i9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f3282g) {
            case 0:
                C0808c c0808cM2657h = ((C1054q) obj).m2657h();
                C0808c c0808cM2657h2 = ((C1054q) obj2).m2657h();
                int iCompare = Float.compare(c0808cM2657h.f2416a, c0808cM2657h2.f2416a);
                if (iCompare != 0) {
                    return iCompare;
                }
                int iCompare2 = Float.compare(c0808cM2657h.f2417b, c0808cM2657h2.f2417b);
                if (iCompare2 != 0) {
                    return iCompare2;
                }
                int iCompare3 = Float.compare(c0808cM2657h.f2419d, c0808cM2657h2.f2419d);
                return iCompare3 != 0 ? iCompare3 : Float.compare(c0808cM2657h.f2418c, c0808cM2657h2.f2418c);
            case 1:
                C0808c c0808cM2657h3 = ((C1054q) obj).m2657h();
                C0808c c0808cM2657h4 = ((C1054q) obj2).m2657h();
                int iCompare4 = Float.compare(c0808cM2657h4.f2418c, c0808cM2657h3.f2418c);
                if (iCompare4 != 0) {
                    return iCompare4;
                }
                int iCompare5 = Float.compare(c0808cM2657h3.f2417b, c0808cM2657h4.f2417b);
                if (iCompare5 != 0) {
                    return iCompare5;
                }
                int iCompare6 = Float.compare(c0808cM2657h3.f2419d, c0808cM2657h4.f2419d);
                return iCompare6 != 0 ? iCompare6 : Float.compare(c0808cM2657h4.f2416a, c0808cM2657h3.f2416a);
            default:
                C3958e c3958e = (C3958e) obj;
                C3958e c3958e2 = (C3958e) obj2;
                int iCompare7 = Float.compare(((C0808c) c3958e.f12961g).f2417b, ((C0808c) c3958e2.f12961g).f2417b);
                return iCompare7 != 0 ? iCompare7 : Float.compare(((C0808c) c3958e.f12961g).f2419d, ((C0808c) c3958e2.f12961g).f2419d);
        }
    }
}
