package p041H0;

import java.util.Comparator;
import me.dartcv.nuke.BuildConfig;
import p056K2.C0882h;
import p095T.C1329O;
import p117X2.AbstractC1665j;
import p255w.C3381l;
import p260x.C3414U;

/* JADX INFO: renamed from: H0.A */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0549A implements Comparator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f1663a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [H0.I.<clinit>():void, T.s.<clinit>():void, a1.d.a():float, x.l.<clinit>():void] */
    public /* synthetic */ C0549A(int i5) {
        this.f1663a = i5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f1663a) {
            case 0:
                C0564I c0564i = (C0564I) obj;
                C0564I c0564i2 = (C0564I) obj2;
                float f2 = c0564i.f1700K.f1760p.f1839G;
                float f5 = c0564i2.f1700K.f1760p.f1839G;
                return f2 == f5 ? AbstractC1665j.m2987g(c0564i.m840v(), c0564i2.m840v()) : Float.compare(f2, f5);
            case BuildConfig.VERSION_CODE /* 1 */:
                return AbstractC1665j.m2987g(((C1329O) obj).f4755b, ((C1329O) obj2).f4755b);
            case 2:
                C0882h c0882h = (C0882h) obj;
                C0882h c0882h2 = (C0882h) obj2;
                return (((Number) c0882h.f2770e).intValue() - ((Number) c0882h.f2769d).intValue()) - (((Number) c0882h2.f2770e).intValue() - ((Number) c0882h2.f2769d).intValue());
            case 3:
                return AbstractC1665j.m2987g(((C3414U) obj2).f10681a, ((C3414U) obj).f10681a);
            default:
                return AbstractC1665j.m2987g(((C3381l) obj).f10535a, ((C3381l) obj2).f10535a);
        }
    }
}
