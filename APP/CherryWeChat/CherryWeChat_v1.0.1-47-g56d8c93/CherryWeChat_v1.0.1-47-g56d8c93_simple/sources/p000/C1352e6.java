package p000;

/* JADX INFO: renamed from: e6 */
/* JADX INFO: loaded from: classes.dex */
public final class C1352e6 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f4855a;

    public /* synthetic */ C1352e6(int r1) {
        this.f4855a = r1;
    }

    /* JADX INFO: renamed from: a */
    public final int m2621a(Object r2) {
        switch(this.f4855a) {
            case 0: goto L7;
            default: goto L5;
        };
    L5:
        return ((int[]) r2).length;
    L7:
        return ((byte[]) r2).length;
    }

    /* JADX INFO: renamed from: b */
    public final int m2622b() {
        switch(this.f4855a) {
            case 0: goto L6;
            default: goto L4;
        };
    L4:
        return 4;
    L6:
        return 1;
    }
}
