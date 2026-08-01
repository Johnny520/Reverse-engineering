package p001A0;

import java.util.Comparator;
import java.util.Set;
import p006D.AbstractC0079h;
import p088s0.C0987i;
import p088s0.C0989k;
import p088s0.C0990l;

/* JADX INFO: renamed from: A0.Q */
/* JADX INFO: loaded from: classes.dex */
public final class C0017Q implements Comparator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f141a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f142b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f143c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C0017Q(Object obj, Object obj2, int i2) {
        this.f141a = i2;
        this.f142b = obj;
        this.f143c = obj2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f141a) {
            case 0:
                Set set = (Set) this.f142b;
                Set set2 = (Set) this.f143c;
                return AbstractC0079h.m184h(Integer.valueOf(C0034g.m29e((Class) obj2, set, set2)), Integer.valueOf(C0034g.m29e((Class) obj, set, set2)));
            case 1:
                int iCompare = ((C0989k) this.f142b).compare(obj, obj2);
                if (iCompare != 0) {
                    return iCompare;
                }
                C0990l c0990l = (C0990l) this.f143c;
                return AbstractC0079h.m184h(Integer.valueOf(C0990l.m2191a(c0990l, (C0987i) obj)), Integer.valueOf(C0990l.m2191a(c0990l, (C0987i) obj2)));
            case 2:
                int iCompare2 = ((C0017Q) this.f142b).compare(obj, obj2);
                if (iCompare2 != 0) {
                    return iCompare2;
                }
                ((C0990l) this.f143c).getClass();
                return AbstractC0079h.m184h(C0990l.m2193e((C0987i) obj), C0990l.m2193e((C0987i) obj2));
            case 3:
                int iCompare3 = ((C0989k) this.f142b).compare(obj, obj2);
                if (iCompare3 != 0) {
                    return iCompare3;
                }
                C0990l c0990l2 = (C0990l) this.f143c;
                return AbstractC0079h.m184h(Integer.valueOf(C0990l.m2191a(c0990l2, (C0987i) obj)), Integer.valueOf(C0990l.m2191a(c0990l2, (C0987i) obj2)));
            default:
                int iCompare4 = ((C0017Q) this.f142b).compare(obj, obj2);
                if (iCompare4 != 0) {
                    return iCompare4;
                }
                ((C0990l) this.f143c).getClass();
                return AbstractC0079h.m184h(C0990l.m2193e((C0987i) obj), C0990l.m2193e((C0987i) obj2));
        }
    }
}
