package p000;

import java.util.Comparator;

/* JADX INFO: renamed from: HC */
/* JADX INFO: loaded from: classes.dex */
public final class C0314HC implements Comparator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f1035a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Comparator f1036b;

    public /* synthetic */ C0314HC(Comparator r1, int r2) {
        this.f1035a = r2;
        this.f1036b = r1;
    }

    @Override // java.util.Comparator
    public final int compare(Object r2, Object r3) {
        switch(this.f1035a) {
            case 0: goto L14;
            case 1: goto L9;
            default: goto L4;
        };
    L4:
        int r0 = ((C0314HC) this.f1036b).compare(r2, r3);
        if (r0 == 0) goto L8;
        return r0;
    L8:
        return AbstractC0671Pj.m1346d(Boolean.valueOf(((C0185EC) r3).f560l), Boolean.valueOf(((C0185EC) r2).f560l));
    L9:
        int r02 = ((C0963Wb) this.f1036b).compare(r2, r3);
        if (r02 == 0) goto L13;
        return r02;
    L13:
        return AbstractC0671Pj.m1346d(Boolean.valueOf(((C0185EC) r3).f568t), Boolean.valueOf(((C0185EC) r2).f568t));
    L14:
        int r03 = ((C0314HC) this.f1036b).compare(r2, r3);
        if (r03 == 0) goto L18;
        return r03;
    L18:
        return AbstractC0671Pj.m1346d(((C0185EC) r2).f551c, ((C0185EC) r3).f551c);
    }
}
