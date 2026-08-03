package p000;

import java.util.Comparator;

/* JADX INFO: renamed from: HC */
/* JADX INFO: loaded from: classes.dex */
public final class C0314HC implements Comparator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f1035a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Comparator f1036b;

    public /* synthetic */ C0314HC(Comparator comparator, int i) {
        this.f1035a = i;
        this.f1036b = comparator;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f1035a) {
            case 0:
                int iCompare = ((C0314HC) this.f1036b).compare(obj, obj2);
                return iCompare != 0 ? iCompare : AbstractC0671Pj.m1346d(((C0185EC) obj).f551c, ((C0185EC) obj2).f551c);
            case 1:
                int iCompare2 = ((C0963Wb) this.f1036b).compare(obj, obj2);
                return iCompare2 != 0 ? iCompare2 : AbstractC0671Pj.m1346d(Boolean.valueOf(((C0185EC) obj2).f568t), Boolean.valueOf(((C0185EC) obj).f568t));
            default:
                int iCompare3 = ((C0314HC) this.f1036b).compare(obj, obj2);
                return iCompare3 != 0 ? iCompare3 : AbstractC0671Pj.m1346d(Boolean.valueOf(((C0185EC) obj2).f560l), Boolean.valueOf(((C0185EC) obj).f560l));
        }
    }
}
