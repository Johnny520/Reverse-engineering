package defpackage;

/* JADX INFO: loaded from: classes.dex */
public class sx {
    public final /* synthetic */ int a;
    public final Object[] b;
    public int c;

    public sx(int r2) {
        this.a = 0;
        if (r2 <= 0) goto L7;
        this.b = new Object[r2];
        return;
    L7:
        throw new IllegalArgumentException("The max pool size must be > 0");
    }

    public Object a() {
        switch(this.a) {
            case 0: goto L8;
            default: goto L4;
        };
    L4:
        int r0 = this.c;
        if (r0 <= 0) goto L12;
        int r2 = r0 - 1;
        Object[] r3 = this.b;
        Object r4 = r3[r2];
        r3[r2] = null;
        this.c = r0 - 1;
        return r4;
    L12:
        return null;
    L8:
        int r02 = this.c;
        if (r02 <= 0) goto L13;
        int r22 = r02 - 1;
        Object[] r32 = this.b;
        Object r42 = r32[r22];
        r32[r22] = null;
        this.c = r02 - 1;
        return r42;
    L13:
        return null;
    }

    public void b(p6 r4) {
        int r0 = this.c;
        Object[] r1 = this.b;
        if (r0 >= r1.length) goto L6;
        r1[r0] = r4;
        this.c = r0 + 1;
        return;
    }

    public boolean c(Object r5) {
        int r1 = 0;
    L3:
        int r2 = this.c;
        Object[] r3 = this.b;
        if (r1 >= r2) goto L11;
        if (r3[r1] == r5) goto L9;
        r1 = r1 + 1;
        goto L3
    L9:
        throw new IllegalStateException("Already in the pool!");
    L11:
        if (r2 >= r3.length) goto L14;
        r3[r2] = r5;
        this.c = r2 + 1;
        return true;
    L14:
        return false;
    }

    public sx() {
        this.a = 1;
        this.b = new Object[256];
    }
}
