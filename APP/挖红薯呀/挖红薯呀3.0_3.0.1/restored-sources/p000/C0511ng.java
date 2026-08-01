package p000;

import java.util.Comparator;

/* JADX INFO: renamed from: ng */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0511ng implements Comparator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f4256a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f4257b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C0511ng(int i, Object obj) {
        this.f4256a = i;
        this.f4257b = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i = this.f4256a;
        Object obj3 = this.f4257b;
        switch (i) {
            case 0:
                for (InterfaceC0742sw interfaceC0742sw : (InterfaceC0742sw[]) obj3) {
                    int iM3056p = pf1.m3056p((Comparable) interfaceC0742sw.invoke(obj), (Comparable) interfaceC0742sw.invoke(obj2));
                    if (iM3056p != 0) {
                        return iM3056p;
                    }
                }
                return 0;
            default:
                return ((Number) ((InterfaceC0904ww) obj3).invoke(obj, obj2)).intValue();
        }
    }
}
