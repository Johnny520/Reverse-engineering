package p077P0;

import java.util.Comparator;
import me.dartcv.nuke.BuildConfig;
import p056K2.C0882h;
import p204n0.C2684c;

/* JADX INFO: renamed from: P0.f */
/* JADX INFO: loaded from: classes.dex */
public final class C1119f implements Comparator {

    /* JADX INFO: renamed from: b */
    public static final C1119f f3641b = new C1119f(0);

    /* JADX INFO: renamed from: c */
    public static final C1119f f3642c = new C1119f(1);

    /* JADX INFO: renamed from: d */
    public static final C1119f f3643d = new C1119f(2);

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f3644a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [P0.f.<clinit>():void] */
    public /* synthetic */ C1119f(int i5) {
        this.f3644a = i5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f3644a) {
            case 0:
                C2684c c2684cM2171h = ((C1128o) obj).m2171h();
                C2684c c2684cM2171h2 = ((C1128o) obj2).m2171h();
                int iCompare = Float.compare(c2684cM2171h.f8558a, c2684cM2171h2.f8558a);
                if (iCompare != 0) {
                    return iCompare;
                }
                int iCompare2 = Float.compare(c2684cM2171h.f8559b, c2684cM2171h2.f8559b);
                if (iCompare2 != 0) {
                    return iCompare2;
                }
                int iCompare3 = Float.compare(c2684cM2171h.f8561d, c2684cM2171h2.f8561d);
                return iCompare3 != 0 ? iCompare3 : Float.compare(c2684cM2171h.f8560c, c2684cM2171h2.f8560c);
            case BuildConfig.VERSION_CODE /* 1 */:
                C2684c c2684cM2171h3 = ((C1128o) obj).m2171h();
                C2684c c2684cM2171h4 = ((C1128o) obj2).m2171h();
                int iCompare4 = Float.compare(c2684cM2171h4.f8560c, c2684cM2171h3.f8560c);
                if (iCompare4 != 0) {
                    return iCompare4;
                }
                int iCompare5 = Float.compare(c2684cM2171h3.f8559b, c2684cM2171h4.f8559b);
                if (iCompare5 != 0) {
                    return iCompare5;
                }
                int iCompare6 = Float.compare(c2684cM2171h3.f8561d, c2684cM2171h4.f8561d);
                return iCompare6 != 0 ? iCompare6 : Float.compare(c2684cM2171h4.f8558a, c2684cM2171h3.f8558a);
            default:
                C0882h c0882h = (C0882h) obj;
                C0882h c0882h2 = (C0882h) obj2;
                int iCompare7 = Float.compare(((C2684c) c0882h.f2769d).f8559b, ((C2684c) c0882h2.f2769d).f8559b);
                return iCompare7 != 0 ? iCompare7 : Float.compare(((C2684c) c0882h.f2769d).f8561d, ((C2684c) c0882h2.f2769d).f8561d);
        }
    }
}
