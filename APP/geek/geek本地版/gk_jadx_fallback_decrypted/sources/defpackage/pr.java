package defpackage;

/* JADX INFO: loaded from: classes.dex */
public class pr extends defpackage.pa0 {
    public final defpackage.e40 c;

    static {
            return
    }

    public pr() {
            r1 = this;
            r1.<init>()
            e40 r0 = new e40
            r0.<init>()
            r1.c = r0
            return
    }

    @Override // defpackage.pa0
    public final void a() {
            r6 = this;
            e40 r0 = r6.c
            int r1 = r0.c
            r2 = 0
            if (r1 > 0) goto L15
            java.lang.Object[] r3 = r0.b
            r4 = r2
        La:
            if (r4 >= r1) goto L12
            r5 = 0
            r3[r4] = r5
            int r4 = r4 + 1
            goto La
        L12:
            r0.c = r2
            return
        L15:
            java.lang.Object[] r0 = r0.b
            r0 = r0[r2]
            r0.getClass()
            java.lang.ClassCastException r0 = new java.lang.ClassCastException
            r0.<init>()
            throw r0
    }
}
