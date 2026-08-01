package defpackage;

/* JADX INFO: renamed from: ᛱᛱᛶᛴ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C0022 {

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final java.lang.String f461;

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final defpackage.InterfaceC1398 f462;

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final java.util.List f463;

    public C0022(java.lang.Class r1, java.lang.Class r2, java.lang.Class r3, java.util.List r4, defpackage.InterfaceC1398 r5) {
            r0 = this;
            r0.<init>()
            r0.f462 = r5
            boolean r5 = r4.isEmpty()
            if (r5 != 0) goto L3d
            r0.f463 = r4
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "Failed LoadPath{"
            r4.<init>(r5)
            java.lang.String r1 = r1.getSimpleName()
            r4.append(r1)
            java.lang.String r1 = "->"
            r4.append(r1)
            java.lang.String r2 = r2.getSimpleName()
            r4.append(r2)
            r4.append(r1)
            java.lang.String r1 = r3.getSimpleName()
            r4.append(r1)
            java.lang.String r1 = "}"
            r4.append(r1)
            java.lang.String r1 = r4.toString()
            r0.f461 = r1
            return
        L3d:
            java.lang.String r0 = "Must not be empty."
            defpackage.C2264.m3684(r0)
            r0 = 0
            throw r0
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "LoadPath{decodePaths="
            r0.<init>(r1)
            java.util.List r2 = r2.f463
            java.lang.Object[] r2 = r2.toArray()
            java.lang.String r2 = java.util.Arrays.toString(r2)
            r0.append(r2)
            r2 = 125(0x7d, float:1.75E-43)
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final defpackage.InterfaceC1901 m320(int r14, int r15, defpackage.C2073 r16, defpackage.InterfaceC0590 r17, defpackage.C0533 r18) {
            r13 = this;
            ᛷᲈᛲᛶ r1 = r13.f462
            java.lang.Object r0 = r1.mo913()
            r2 = r0
            java.util.List r2 = (java.util.List) r2
            java.lang.String r0 = "Argument must not be null"
            defpackage.C0292.m944(r2, r0)
            java.util.List r3 = r13.f463     // Catch: java.lang.Throwable -> L4c
            int r4 = r3.size()     // Catch: java.lang.Throwable -> L4c
            r0 = 0
            r5 = 0
            r6 = r5
            r5 = r0
        L18:
            if (r6 >= r4) goto L39
            java.lang.Object r0 = r3.get(r6)     // Catch: java.lang.Throwable -> L4c
            r7 = r0
            ᛲᛱᛸᛵ r7 = (defpackage.C0238) r7     // Catch: java.lang.Throwable -> L4c
            r8 = r14
            r9 = r15
            r10 = r16
            r11 = r17
            r12 = r18
            ᲁᛸᛸ r0 = r7.m847(r8, r9, r10, r11, r12)     // Catch: defpackage.C0991 -> L2f java.lang.Throwable -> L4c
            r5 = r0
            goto L33
        L2f:
            r0 = move-exception
            r2.add(r0)     // Catch: java.lang.Throwable -> L4c
        L33:
            if (r5 == 0) goto L36
            goto L39
        L36:
            int r6 = r6 + 1
            goto L18
        L39:
            if (r5 == 0) goto L3f
            r1.mo914(r2)
            return r5
        L3f:
            ᛵᲈᛳᛲ r14 = new ᛵᲈᛳᛲ     // Catch: java.lang.Throwable -> L4c
            java.lang.String r13 = r13.f461     // Catch: java.lang.Throwable -> L4c
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L4c
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L4c
            r14.<init>(r0, r13)     // Catch: java.lang.Throwable -> L4c
            throw r14     // Catch: java.lang.Throwable -> L4c
        L4c:
            r0 = move-exception
            r13 = r0
            r1.mo914(r2)
            throw r13
    }
}
