package defpackage;

/* JADX INFO: renamed from: ᲈᲈᛱᛴ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2363 {

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public static final java.util.ArrayList f10233 = null;

    static {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            defpackage.AbstractC2363.f10233 = r0
            return
    }

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public static void m3864(java.util.ArrayList r4) {
            boolean r0 = r4.isEmpty()
            if (r0 == 0) goto L7
            goto L3f
        L7:
            java.util.Iterator r4 = r4.iterator()
        Lb:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L3f
            java.lang.Object r0 = r4.next()
            ᲁᛱᛲᛳ r0 = (defpackage.AbstractC1793) r0
            java.lang.String r0 = r0.mo1205()
            java.util.ArrayList r1 = defpackage.AbstractC2363.f10233
            boolean r2 = r1.isEmpty()
            if (r2 == 0) goto L24
            goto L3b
        L24:
            java.util.Iterator r2 = r1.iterator()
        L28:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L3b
            java.lang.Object r3 = r2.next()
            java.lang.String r3 = (java.lang.String) r3
            boolean r3 = defpackage.AbstractC1592.m2887(r0, r3)
            if (r3 == 0) goto L28
            goto Lb
        L3b:
            r1.add(r0)
            goto Lb
        L3f:
            return
    }
}
