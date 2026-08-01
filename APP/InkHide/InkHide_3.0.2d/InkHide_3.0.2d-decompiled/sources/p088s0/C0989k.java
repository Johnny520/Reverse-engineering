package p088s0;

import java.util.Comparator;
import p006D.AbstractC0079h;

/* JADX INFO: renamed from: s0.k */
/* JADX INFO: loaded from: classes.dex */
public final class C0989k implements Comparator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f3546a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0990l f3547b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C0989k(C0990l c0990l, int i2) {
        this.f3546a = i2;
        this.f3547b = c0990l;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f3546a) {
            case 0:
                String str = ((C0987i) obj).f3531a;
                this.f3547b.getClass();
                return AbstractC0079h.m184h(C0990l.m2194f(str) ? 0 : 1, C0990l.m2194f(((C0987i) obj2).f3531a) ? 0 : 1);
            default:
                String str2 = ((C0987i) obj).f3531a;
                this.f3547b.getClass();
                return AbstractC0079h.m184h(C0990l.m2194f(str2) ? 0 : 1, C0990l.m2194f(((C0987i) obj2).f3531a) ? 0 : 1);
        }
    }
}
