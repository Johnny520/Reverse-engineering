package xhss;

/* JADX INFO: renamed from: xhss.ᛱᲁᲈᛷ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class C0105 implements xhss.InterfaceC0341 {

    /* JADX INFO: renamed from: ᲇᛴᲇᛵ, reason: contains not printable characters */
    public static final xhss.C0767 f480 = null;

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public final xhss.C0230 f481;

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public final java.util.concurrent.ConcurrentHashMap f482;

    static {
            xhss.ᛸᛵᛷᛴ r0 = new xhss.ᛸᛵᛷᛴ
            r1 = 0
            r0.<init>(r1)
            xhss.C0105.f480 = r0
            xhss.ᛸᛵᛷᛴ r0 = new xhss.ᛸᛵᛷᛴ
            r0.<init>(r1)
            return
    }

    public C0105(xhss.C0230 r1) {
            r0 = this;
            r0.<init>()
            r0.f481 = r1
            java.util.concurrent.ConcurrentHashMap r1 = new java.util.concurrent.ConcurrentHashMap
            r1.<init>()
            r0.f482 = r1
            return
    }

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public final xhss.AbstractC0121 m291(xhss.C0230 r3, xhss.C1125 r4, xhss.C0032 r5, xhss.InterfaceC0726 r6, boolean r7) {
            r2 = this;
            java.lang.Class r0 = r6.value()
            xhss.ᛱᛳᲈᛷ r1 = new xhss.ᛱᛳᲈᛷ
            r1.<init>(r0)
            r0 = 1
            xhss.ᲁᲀᛶᛲ r3 = r3.m532(r1, r0)
            java.lang.Object r3 = r3.mo964()
            boolean r6 = r6.nullSafe()
            boolean r0 = r3 instanceof xhss.AbstractC0121
            if (r0 == 0) goto L1d
            xhss.ᛲᛱᛶᛴ r3 = (xhss.AbstractC0121) r3
            goto L36
        L1d:
            boolean r0 = r3 instanceof xhss.InterfaceC0341
            if (r0 == 0) goto L40
            xhss.ᛴᛲᲀᛵ r3 = (xhss.InterfaceC0341) r3
            if (r7 == 0) goto L32
            java.lang.Class r7 = r5.f211
            java.util.concurrent.ConcurrentHashMap r2 = r2.f482
            java.lang.Object r2 = r2.putIfAbsent(r7, r3)
            xhss.ᛴᛲᲀᛵ r2 = (xhss.InterfaceC0341) r2
            if (r2 == 0) goto L32
            r3 = r2
        L32:
            xhss.ᛲᛱᛶᛴ r3 = r3.mo160(r4, r5)
        L36:
            if (r3 == 0) goto L3f
            if (r6 == 0) goto L3f
            xhss.ᛲᛲᛸᲇ r2 = r3.m357()
            return r2
        L3f:
            return r3
        L40:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.Class r3 = r3.getClass()
            java.lang.String r3 = r3.getName()
            java.lang.reflect.Type r4 = r5.f209
            java.lang.String r4 = xhss.C0915.m1487(r4)
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

    @Override // xhss.InterfaceC0341
    /* JADX INFO: renamed from: ᛷᛵᛵᲈ */
    public final xhss.AbstractC0121 mo160(xhss.C1125 r8, xhss.C0032 r9) {
            r7 = this;
            java.lang.Class r0 = r9.f211
            java.lang.Class<xhss.ᛸᛱᲀᛷ> r1 = xhss.InterfaceC0726.class
            java.lang.annotation.Annotation r0 = r0.getAnnotation(r1)
            r5 = r0
            xhss.ᛸᛱᲀᛷ r5 = (xhss.InterfaceC0726) r5
            if (r5 != 0) goto Lf
            r7 = 0
            return r7
        Lf:
            xhss.ᛳᛱᛲᲀ r2 = r7.f481
            r6 = 1
            r1 = r7
            r3 = r8
            r4 = r9
            xhss.ᛲᛱᛶᛴ r7 = r1.m291(r2, r3, r4, r5, r6)
            return r7
    }
}
