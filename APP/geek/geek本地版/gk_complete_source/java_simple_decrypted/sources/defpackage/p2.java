package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class p2 {
    public static final ThreadLocal f = null;
    public final u30 a;
    public final ArrayList b;
    public final l0 c;
    public r5 d;
    public boolean e;

    static {
        f = new ThreadLocal();
    }

    public p2() {
        this.a = new u30();
        this.b = new ArrayList();
        this.c = new l0(3, this);
        this.e = false;
    }
}
