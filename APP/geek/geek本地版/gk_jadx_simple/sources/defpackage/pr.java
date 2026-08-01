package defpackage;

/* JADX INFO: loaded from: classes.dex */
public class pr extends pa0 {
    public final e40 c;

    public pr() {
        this.c = new e40();
    }

    @Override // defpackage.pa0
    public final void a() {
        e40 r0 = this.c;
        int r1 = r0.c;
        if (r1 > 0) goto L9;
        Object[] r3 = r0.b;
        int r4 = 0;
    L5:
        if (r4 >= r1) goto L7;
        r3[r4] = null;
        r4 = r4 + 1;
        goto L5
    L7:
        r0.c = 0;
        return;
    L9:
        r0.b[0].getClass();
        throw new ClassCastException();
    }

    static {
    }
}
