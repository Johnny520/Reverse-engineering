package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class m30 extends defpackage.n30 {
    public float b;
    public float c;

    @Override // defpackage.n30
    public final void a(android.graphics.Matrix r3, android.graphics.Path r4) {
            r2 = this;
            android.graphics.Matrix r0 = r2.a
            r3.invert(r0)
            r4.transform(r0)
            float r0 = r2.b
            float r1 = r2.c
            r4.lineTo(r0, r1)
            r4.transform(r3)
            return
    }
}
