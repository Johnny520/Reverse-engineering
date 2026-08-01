package p041V;

import java.io.File;
import java.util.Comparator;
import p006D.AbstractC0079h;
import p052b1.C0499d;
import p052b1.C0505j;
import p102z0.C1133p;

/* JADX INFO: renamed from: V.k */
/* JADX INFO: loaded from: classes.dex */
public final class C0318k implements Comparator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f700a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [V.o.<clinit>():void, org.luckypray.dexkit.DexKitBridge.d(W0.a):b1.e, org.luckypray.dexkit.DexKitBridge.e(W0.a):b1.k] */
    public /* synthetic */ C0318k(int i2) {
        this.f700a = i2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f700a) {
            case 0:
                return ((Comparable) obj).compareTo((Comparable) obj2);
            case 1:
                return AbstractC0079h.m184h(((C0499d) obj).f1579c, ((C0499d) obj2).f1579c);
            case 2:
                return AbstractC0079h.m184h(((C0505j) obj).f1612c, ((C0505j) obj2).f1612c);
            case 3:
                return AbstractC0079h.m184h(Long.valueOf(((C1133p) obj2).f3822d), Long.valueOf(((C1133p) obj).f3822d));
            default:
                return AbstractC0079h.m184h(Long.valueOf(((File) obj2).lastModified()), Long.valueOf(((File) obj).lastModified()));
        }
    }
}
