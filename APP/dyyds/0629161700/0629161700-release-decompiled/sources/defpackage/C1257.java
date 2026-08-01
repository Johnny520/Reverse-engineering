package defpackage;

/* JADX INFO: renamed from: ᛷᛴᛶᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C1257 extends defpackage.AbstractC2310 implements defpackage.InterfaceC1781 {

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public final /* synthetic */ java.lang.Object f5622;

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final /* synthetic */ int f5623;

    public /* synthetic */ C1257(int r1, java.lang.Object r2) {
            r0 = this;
            r0.f5623 = r1
            r0.f5622 = r2
            r1 = 0
            r0.<init>(r1)
            return
    }

    @Override // defpackage.InterfaceC1781
    /* JADX INFO: renamed from: ᛷᲁᛳᛳ */
    public final java.lang.Object mo1032() {
            r7 = this;
            int r0 = r7.f5623
            ᲁᲀᛱᲁ r1 = defpackage.C1907.f8270
            java.lang.Object r7 = r7.f5622
            switch(r0) {
                case 0: goto La2;
                case 1: goto L9c;
                default: goto L9;
            }
        L9:
            ᲇᲀᛵᲀ r7 = (defpackage.InterfaceC2120) r7
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.lang.Class<ᛵᲈᛱᲈ> r1 = defpackage.C0989.class
            ᛲᲀᲈᛳ r2 = defpackage.AbstractC1168.m2249(r1)
            ᲇᛲᲀᲈ r3 = new ᲇᛲᲀᲈ
            java.lang.Class r2 = r2.mo1084()
            r3.<init>(r2)
            r0.add(r3)
            r2 = 0
            ᲇᛲᲀᲈ[] r3 = new defpackage.C2006[r2]
            java.lang.Object[] r0 = r0.toArray(r3)
            ᲇᛲᲀᲈ[] r0 = (defpackage.C2006[]) r0
            int r3 = r0.length
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r3)
            ᲇᛲᲀᲈ[] r0 = (defpackage.C2006[]) r0
            ᛳᛴᛱᲀ r3 = r7.mo1()
            boolean r4 = r7 instanceof defpackage.InterfaceC1145
            if (r4 == 0) goto L41
            ᛶᲀᛷᛵ r7 = (defpackage.InterfaceC1145) r7
            ᲀᛸᛵᲁ r7 = r7.mo2()
            goto L43
        L41:
            ᛴᛳᛷᛱ r7 = defpackage.C0639.f3158
        L43:
            java.util.LinkedHashMap r3 = r3.f2205
            java.lang.String r4 = "androidx.lifecycle.internal.SavedStateHandlesVM"
            java.lang.Object r5 = r3.get(r4)
            ᛵᲈᛱᲈ r5 = (defpackage.C0989) r5
            boolean r6 = r1.isInstance(r5)
            if (r6 == 0) goto L54
            goto L83
        L54:
            java.util.LinkedHashMap r5 = new java.util.LinkedHashMap
            r5.<init>()
            java.lang.Object r7 = r7.f7642
            java.util.LinkedHashMap r7 = (java.util.LinkedHashMap) r7
            r5.putAll(r7)
            ᲀᛴᛱᛱ r7 = defpackage.C1654.f7358
            r5.put(r7, r4)
            int r7 = r0.length     // Catch: java.lang.AbstractMethodError -> L94
            r5 = 0
        L67:
            if (r2 >= r7) goto L7b
            r6 = r0[r2]     // Catch: java.lang.AbstractMethodError -> L94
            java.lang.Class r6 = r6.f8662     // Catch: java.lang.AbstractMethodError -> L94
            boolean r6 = defpackage.AbstractC0498.m1280(r6, r1)     // Catch: java.lang.AbstractMethodError -> L94
            if (r6 == 0) goto L78
            ᛵᲈᛱᲈ r5 = new ᛵᲈᛱᲈ     // Catch: java.lang.AbstractMethodError -> L94
            r5.<init>()     // Catch: java.lang.AbstractMethodError -> L94
        L78:
            int r2 = r2 + 1
            goto L67
        L7b:
            if (r5 == 0) goto L84
            java.lang.Object r7 = r3.put(r4, r5)
            ᛵᲈᛱᲈ r7 = (defpackage.C0989) r7
        L83:
            return r5
        L84:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException     // Catch: java.lang.AbstractMethodError -> L94
            java.lang.String r0 = r1.getName()     // Catch: java.lang.AbstractMethodError -> L94
            java.lang.String r1 = "No initializer set for given class "
            java.lang.String r0 = r1.concat(r0)     // Catch: java.lang.AbstractMethodError -> L94
            r7.<init>(r0)     // Catch: java.lang.AbstractMethodError -> L94
            throw r7     // Catch: java.lang.AbstractMethodError -> L94
        L94:
            java.lang.UnsupportedOperationException r7 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Factory.create(String) is unsupported.  This Factory requires `CreationExtras` to be passed into `create` method."
            r7.<init>(r0)
            throw r7
        L9c:
            androidx.activity.ᛷᲁᛳᛳ r7 = (androidx.activity.C0000) r7
            r7.m9()
            return r1
        La2:
            androidx.activity.ᛷᲁᛳᛳ r7 = (androidx.activity.C0000) r7
            r7.m7()
            return r1
    }
}
