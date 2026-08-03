package p000;

/* JADX INFO: renamed from: Yt */
/* JADX INFO: loaded from: classes.dex */
public class C1067Yt implements InterfaceC1024Xt {

    /* JADX INFO: renamed from: a */
    public final Object[] f3378a;

    /* JADX INFO: renamed from: b */
    public int f3379b;

    public C1067Yt(int r2) {
        if (r2 <= 0) goto L7;
        this.f3378a = new Object[r2];
        return;
    L7:
        throw new IllegalArgumentException("The max pool size must be > 0");
    }

    @Override // p000.InterfaceC1024Xt
    /* JADX INFO: renamed from: a */
    public boolean mo1934a(Object r7) {
        int r0 = this.f3379b;
        int r2 = 0;
    L3:
        Object[] r3 = this.f3378a;
        if (r2 >= r0) goto L9;
        if (r3[r2] == r7) goto L7;
        r2 = r2 + 1;
        goto L3
    L7:
        boolean r02 = true;
    L10:
        if (r02 == true) goto L17;
        int r03 = this.f3379b;
        if (r03 >= r3.length) goto L15;
        r3[r03] = r7;
        this.f3379b = r03 + 1;
        return true;
    L15:
        return false;
    L17:
        throw new IllegalStateException("Already in the pool!");
    L9:
        r02 = false;
        goto L10
    }

    /* JADX INFO: renamed from: b */
    public void m2003b(C0564N4 r4) {
        int r0 = this.f3379b;
        Object[] r1 = this.f3378a;
        if (r0 >= r1.length) goto L6;
        r1[r0] = r4;
        this.f3379b = r0 + 1;
        return;
    }

    @Override // p000.InterfaceC1024Xt
    /* JADX INFO: renamed from: c */
    public Object mo1935c() {
        int r0 = this.f3379b;
        if (r0 <= 0) goto L6;
        int r2 = r0 - 1;
        Object[] r3 = this.f3378a;
        Object r4 = r3[r2];
        r3[r2] = null;
        this.f3379b = r0 - 1;
        return r4;
    L6:
        return null;
    }

    public C1067Yt() {
        this.f3378a = new Object[256];
    }
}
