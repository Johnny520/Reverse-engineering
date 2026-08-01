package defpackage;

/* JADX INFO: renamed from: ᛲᛲᛲᛵ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C0245 implements defpackage.InterfaceC1405 {

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public static final defpackage.C2333 f1436 = null;

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final java.util.concurrent.ConcurrentHashMap f1437;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final defpackage.C0682 f1438;

    static {
            ᲈᲁᛴᲀ r0 = new ᲈᲁᛴᲀ
            r1 = 0
            r0.<init>(r1)
            defpackage.C0245.f1436 = r0
            ᲈᲁᛴᲀ r0 = new ᲈᲁᛴᲀ
            r0.<init>(r1)
            return
    }

    public C0245(defpackage.C0682 r1) {
            r0 = this;
            r0.<init>()
            r0.f1438 = r1
            java.util.concurrent.ConcurrentHashMap r1 = new java.util.concurrent.ConcurrentHashMap
            r1.<init>()
            r0.f1437 = r1
            return
    }

    @Override // defpackage.InterfaceC1405
    /* JADX INFO: renamed from: ᛷᲁᛳᛳ */
    public final defpackage.AbstractC0758 mo690(defpackage.C1950 r8, defpackage.C1949 r9) {
            r7 = this;
            java.lang.Class r0 = r9.f8476
            java.lang.Class<ᛳᲁᛱᲀ> r1 = defpackage.InterfaceC0553.class
            java.lang.annotation.Annotation r0 = r0.getAnnotation(r1)
            r5 = r0
            ᛳᲁᛱᲀ r5 = (defpackage.InterfaceC0553) r5
            if (r5 != 0) goto Lf
            r7 = 0
            return r7
        Lf:
            ᛴᛵᲇᲇ r2 = r7.f1438
            r6 = 1
            r1 = r7
            r3 = r8
            r4 = r9
            ᛴᲀᲈᛴ r7 = r1.m857(r2, r3, r4, r5, r6)
            return r7
    }

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final defpackage.AbstractC0758 m857(defpackage.C0682 r3, defpackage.C1950 r4, defpackage.C1949 r5, defpackage.InterfaceC0553 r6, boolean r7) {
            r2 = this;
            java.lang.Class r0 = r6.value()
            ᲁᲇᛸᲈ r1 = new ᲁᲇᛸᲈ
            r1.<init>(r0)
            r0 = 1
            ᛳᛴᲁᛸ r3 = r3.m1557(r1, r0)
            java.lang.Object r3 = r3.mo741()
            boolean r6 = r6.nullSafe()
            boolean r0 = r3 instanceof defpackage.AbstractC0758
            if (r0 == 0) goto L1d
            ᛴᲀᲈᛴ r3 = (defpackage.AbstractC0758) r3
            goto L36
        L1d:
            boolean r0 = r3 instanceof defpackage.InterfaceC1405
            if (r0 == 0) goto L40
            ᛷᲈᲀᲈ r3 = (defpackage.InterfaceC1405) r3
            if (r7 == 0) goto L32
            java.lang.Class r7 = r5.f8476
            java.util.concurrent.ConcurrentHashMap r2 = r2.f1437
            java.lang.Object r2 = r2.putIfAbsent(r7, r3)
            ᛷᲈᲀᲈ r2 = (defpackage.InterfaceC1405) r2
            if (r2 == 0) goto L32
            r3 = r2
        L32:
            ᛴᲀᲈᛴ r3 = r3.mo690(r4, r5)
        L36:
            if (r3 == 0) goto L3f
            if (r6 == 0) goto L3f
            ᛴᛶᲁᛸ r2 = r3.m1677()
            return r2
        L3f:
            return r3
        L40:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.Class r3 = r3.getClass()
            java.lang.String r3 = r3.getName()
            java.lang.reflect.Type r4 = r5.f8477
            java.lang.String r4 = defpackage.AbstractC0209.m771(r4)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "Invalid attempt to bind an instance of "
            r5.<init>(r6)
            r5.append(r3)
            java.lang.String r3 = " as a @JsonAdapter for "
            r5.append(r3)
            r5.append(r4)
            java.lang.String r3 = ". @JsonAdapter value must be a TypeAdapter, TypeAdapterFactory, JsonSerializer or JsonDeserializer."
            r5.append(r3)
            java.lang.String r3 = r5.toString()
            r2.<init>(r3)
            throw r2
    }
}
