package yyds;

/* JADX INFO: renamed from: yyds.ᛳᛶᲇᛴ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0625 extends AbstractC1741 {

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public Object f3014;

    /* JADX INFO: renamed from: ᛲᛳᛴᛸ, reason: contains not printable characters */
    public final void m1524(Object obj) {
        if (this.f3014 == null) {
            this.f3014 = obj;
            return;
        }
        throw new IllegalStateException(("Instance already set for this resolver \"" + getClass() + "\" of \"" + mo1373() + "(" + this.f3014 + ")\". To prevent problems, the instance object can only be set once in a resolver, otherwise use copy() to reuse the resolver.").toString());
    }

    /* JADX INFO: renamed from: ᛷᛸᲇᛶ */
    public abstract AbstractC0625 mo1374(Object obj);
}
