package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class i30 extends defpackage.o30 {
    public final /* synthetic */ java.util.ArrayList c;
    public final /* synthetic */ android.graphics.Matrix d;

    public i30(java.util.ArrayList r1, android.graphics.Matrix r2) {
            r0 = this;
            r0.c = r1
            r0.d = r2
            r0.<init>()
            return
    }

    @Override // defpackage.o30
    public final void a(android.graphics.Matrix r5, defpackage.d30 r6, int r7, android.graphics.Canvas r8) {
            r4 = this;
            java.util.ArrayList r5 = r4.c
            int r0 = r5.size()
            r1 = 0
        L7:
            if (r1 >= r0) goto L17
            java.lang.Object r2 = r5.get(r1)
            int r1 = r1 + 1
            o30 r2 = (defpackage.o30) r2
            android.graphics.Matrix r3 = r4.d
            r2.a(r3, r6, r7, r8)
            goto L7
        L17:
            return
    }
}
