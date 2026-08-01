package defpackage;

/* JADX INFO: renamed from: ᛴᛱᲀᛲ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0615 extends defpackage.AbstractC1849 {

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public java.lang.Object f3015;

    /* JADX INFO: renamed from: ᛷᛷᲀᛴ, reason: contains not printable characters */
    public final void m1413(java.lang.Object r4) {
            r3 = this;
            java.lang.Object r0 = r3.f3015
            if (r0 != 0) goto L7
            r3.f3015 = r4
            return
        L7:
            java.lang.Class r4 = r3.getClass()
            java.lang.reflect.Member r0 = r3.mo711()
            java.lang.Object r3 = r3.f3015
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Instance already set for this resolver \""
            r1.<init>(r2)
            r1.append(r4)
            java.lang.String r4 = "\" of \""
            r1.append(r4)
            r1.append(r0)
            java.lang.String r4 = "("
            r1.append(r4)
            r1.append(r3)
            java.lang.String r3 = ")\". To prevent problems, the instance object can only be set once in a resolver, otherwise use copy() to reuse the resolver."
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r3 = r3.toString()
            r4.<init>(r3)
            throw r4
    }

    /* JADX INFO: renamed from: ᲀᲀᛴᛳ */
    public abstract defpackage.AbstractC0615 mo712(java.lang.Object r1);
}
