package defpackage;

/* JADX INFO: renamed from: ᛴᲁᛲᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0761 extends defpackage.AbstractC0758 {

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final defpackage.C2191 f3550;

    public AbstractC0761(defpackage.C2191 r1) {
            r0 = this;
            r0.<init>()
            r0.f3550 = r1
            return
    }

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ */
    public abstract java.lang.Object mo990(java.lang.Object r1);

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ */
    public abstract java.lang.Object mo991();

    @Override // defpackage.AbstractC0758
    /* JADX INFO: renamed from: ᛷᛸᛵᲇ */
    public final void mo561(defpackage.C0353 r2, java.lang.Object r3) {
            r1 = this;
            if (r3 != 0) goto L6
            r2.m1067()
            return
        L6:
            r2.m1069()
            ᲈᛲᛶ r1 = r1.f3550     // Catch: java.lang.IllegalAccessException -> L25
            java.util.List r1 = r1.f9297     // Catch: java.lang.IllegalAccessException -> L25
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.IllegalAccessException -> L25
        L11:
            boolean r0 = r1.hasNext()     // Catch: java.lang.IllegalAccessException -> L25
            if (r0 == 0) goto L21
            java.lang.Object r0 = r1.next()     // Catch: java.lang.IllegalAccessException -> L25
            ᲈᛲᛳᛱ r0 = (defpackage.C2185) r0     // Catch: java.lang.IllegalAccessException -> L25
            r0.m3580(r2, r3)     // Catch: java.lang.IllegalAccessException -> L25
            goto L11
        L21:
            r2.m1073()
            return
        L25:
            r1 = move-exception
            ᛲᲈᲀᲈ r2 = defpackage.AbstractC2026.f8732
            java.lang.String r2 = "Unexpected IllegalAccessException occurred (Gson 2.14.0). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers."
            defpackage.C0086.m548(r2, r1)
            return
    }

    @Override // defpackage.AbstractC0758
    /* JADX INFO: renamed from: ᲇᛶᛵᲇ */
    public final java.lang.Object mo562(defpackage.C1103 r5) {
            r4 = this;
            int r0 = r5.m2090()
            r1 = 9
            r2 = 0
            if (r0 != r1) goto Ld
            r5.m2108()
            return r2
        Ld:
            java.lang.Object r0 = r4.mo991()
            ᲈᛲᛶ r1 = r4.f3550
            java.util.Map r1 = r1.f9296
            r5.m2110()     // Catch: java.lang.IllegalAccessException -> L2e java.lang.IllegalStateException -> L44
        L18:
            boolean r3 = r5.m2082()     // Catch: java.lang.IllegalAccessException -> L2e java.lang.IllegalStateException -> L44
            if (r3 == 0) goto L34
            java.lang.String r3 = r5.m2102()     // Catch: java.lang.IllegalAccessException -> L2e java.lang.IllegalStateException -> L44
            java.lang.Object r3 = r1.get(r3)     // Catch: java.lang.IllegalAccessException -> L2e java.lang.IllegalStateException -> L44
            ᲈᛲᛳᛱ r3 = (defpackage.C2185) r3     // Catch: java.lang.IllegalAccessException -> L2e java.lang.IllegalStateException -> L44
            if (r3 != 0) goto L30
            r5.m2086()     // Catch: java.lang.IllegalAccessException -> L2e java.lang.IllegalStateException -> L44
            goto L18
        L2e:
            r4 = move-exception
            goto L3c
        L30:
            r4.mo992(r0, r5, r3)     // Catch: java.lang.IllegalAccessException -> L2e java.lang.IllegalStateException -> L44
            goto L18
        L34:
            r5.m2093()
            java.lang.Object r4 = r4.mo990(r0)
            return r4
        L3c:
            ᛲᲈᲀᲈ r5 = defpackage.AbstractC2026.f8732
            java.lang.String r5 = "Unexpected IllegalAccessException occurred (Gson 2.14.0). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers."
            defpackage.C0086.m548(r5, r4)
            return r2
        L44:
            r4 = move-exception
            ᛲᛱᛶᲀ r5 = new ᛲᛱᛶᲀ
            r5.<init>(r4)
            throw r5
    }

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ */
    public abstract void mo992(java.lang.Object r1, defpackage.C1103 r2, defpackage.C2185 r3);
}
