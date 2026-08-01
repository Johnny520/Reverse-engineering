package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class z00 {
    public final android.content.res.ColorStateList a;
    public final android.content.res.Configuration b;
    public final int c;

    public z00(android.content.res.ColorStateList r1, android.content.res.Configuration r2, android.content.res.Resources.Theme r3) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            if (r3 != 0) goto Lb
            r1 = 0
            goto Lf
        Lb:
            int r1 = r3.hashCode()
        Lf:
            r0.c = r1
            return
    }
}
