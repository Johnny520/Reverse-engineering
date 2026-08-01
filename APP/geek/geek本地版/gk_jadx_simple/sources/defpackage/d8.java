package defpackage;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public abstract class d8 implements xp, Serializable {
    public transient xp a;
    public final Object b;
    public final Class c;
    public final String d;
    public final String e;
    public final boolean f;

    public d8(Object r1, Class r2, String r3, String r4, boolean r5) {
        this.b = r1;
        this.c = r2;
        this.d = r3;
        this.e = r4;
        this.f = r5;
    }

    public final la c() {
        boolean r0 = this.f;
        Class r1 = this.c;
        if (r0 == false) goto L6;
        j00.a.getClass();
        return new fx(r1);
    L6:
        j00.a.getClass();
        return new ma(r1);
    }
}
