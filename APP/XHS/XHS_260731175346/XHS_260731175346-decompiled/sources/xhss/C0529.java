package xhss;

/* JADX INFO: renamed from: xhss.ᛵᲈᛴᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class C0529 extends xhss.AbstractC0121 {

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public final /* synthetic */ boolean f1931;

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public final /* synthetic */ boolean f1932;

    /* JADX INFO: renamed from: ᛷᛴᛷᛱ, reason: contains not printable characters */
    public final /* synthetic */ xhss.C0032 f1933;

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public volatile xhss.AbstractC0121 f1934;

    /* JADX INFO: renamed from: ᲇᛴᲇᛵ, reason: contains not printable characters */
    public final /* synthetic */ xhss.C1125 f1935;

    /* JADX INFO: renamed from: ᲇᛶᛴᲀ, reason: contains not printable characters */
    public final /* synthetic */ xhss.C0067 f1936;

    public C0529(xhss.C0067 r1, boolean r2, boolean r3, xhss.C1125 r4, xhss.C0032 r5) {
            r0 = this;
            r0.<init>()
            r0.f1936 = r1
            r0.f1931 = r2
            r0.f1932 = r3
            r0.f1935 = r4
            r0.f1933 = r5
            return
    }

    @Override // xhss.AbstractC0121
    /* JADX INFO: renamed from: ᛱᛱᛲᲇ */
    public final java.lang.Object mo119(xhss.C0385 r11) {
            r10 = this;
            boolean r0 = r10.f1931
            r1 = 0
            if (r0 == 0) goto L9
            r11.m753()
            return r1
        L9:
            xhss.ᛲᛱᛶᛴ r0 = r10.f1934
            if (r0 != 0) goto L94
            xhss.ᲈᛲᛶᛴ r0 = r10.f1935
            xhss.ᛱᛷᲈᛱ r2 = r10.f1936
            xhss.ᛱᛳᲈᛷ r3 = r10.f1933
            xhss.ᛱᲁᲈᛷ r4 = r0.f3634
            xhss.ᛸᛵᛷᛴ r5 = xhss.C0105.f480
            r6 = 1
            if (r2 != r5) goto L1e
            r4.getClass()
            goto L63
        L1e:
            java.lang.Class r5 = r3.f211
            java.util.concurrent.ConcurrentHashMap r7 = r4.f482
            java.lang.Object r7 = r7.get(r5)
            xhss.ᛴᛲᲀᛵ r7 = (xhss.InterfaceC0341) r7
            if (r7 == 0) goto L2d
            if (r7 != r2) goto L64
            goto L63
        L2d:
            java.lang.Class<xhss.ᛸᛱᲀᛷ> r7 = xhss.InterfaceC0726.class
            java.lang.annotation.Annotation r7 = r5.getAnnotation(r7)
            xhss.ᛸᛱᲀᛷ r7 = (xhss.InterfaceC0726) r7
            if (r7 != 0) goto L38
            goto L64
        L38:
            java.lang.Class r7 = r7.value()
            java.lang.Class<xhss.ᛴᛲᲀᛵ> r8 = xhss.InterfaceC0341.class
            boolean r8 = r8.isAssignableFrom(r7)
            if (r8 != 0) goto L45
            goto L64
        L45:
            xhss.ᛳᛱᛲᲀ r8 = r4.f481
            xhss.ᛱᛳᲈᛷ r9 = new xhss.ᛱᛳᲈᛷ
            r9.<init>(r7)
            xhss.ᲁᲀᛶᛲ r7 = r8.m532(r9, r6)
            java.lang.Object r7 = r7.mo964()
            xhss.ᛴᛲᲀᛵ r7 = (xhss.InterfaceC0341) r7
            java.util.concurrent.ConcurrentHashMap r8 = r4.f482
            java.lang.Object r5 = r8.putIfAbsent(r5, r7)
            xhss.ᛴᛲᲀᛵ r5 = (xhss.InterfaceC0341) r5
            if (r5 == 0) goto L61
            r7 = r5
        L61:
            if (r7 != r2) goto L64
        L63:
            r2 = r4
        L64:
            java.util.List r4 = r0.f3632
            java.util.Iterator r4 = r4.iterator()
            r5 = 0
        L6b:
            boolean r7 = r4.hasNext()
            if (r7 == 0) goto L85
            java.lang.Object r7 = r4.next()
            xhss.ᛴᛲᲀᛵ r7 = (xhss.InterfaceC0341) r7
            if (r5 != 0) goto L7d
            if (r7 != r2) goto L6b
            r5 = r6
            goto L6b
        L7d:
            xhss.ᛲᛱᛶᛴ r7 = r7.mo160(r0, r3)
            if (r7 == 0) goto L6b
            r0 = r7
            goto L8b
        L85:
            if (r5 != 0) goto L8e
            xhss.ᛲᛱᛶᛴ r0 = r0.m1815(r3)
        L8b:
            r10.f1934 = r0
            goto L94
        L8e:
            java.lang.String r10 = "GSON cannot serialize or deserialize "
            xhss.C0532.m956(r3, r10)
            return r1
        L94:
            java.lang.Object r10 = r0.mo119(r11)
            return r10
    }

    @Override // xhss.AbstractC0121
    /* JADX INFO: renamed from: ᛳᲁᲇᛸ */
    public final void mo120(xhss.C0827 r10, java.lang.Object r11) {
            r9 = this;
            boolean r0 = r9.f1932
            if (r0 == 0) goto L8
            r10.m1396()
            return
        L8:
            xhss.ᛲᛱᛶᛴ r0 = r9.f1934
            if (r0 != 0) goto L93
            xhss.ᲈᛲᛶᛴ r0 = r9.f1935
            xhss.ᛱᛷᲈᛱ r1 = r9.f1936
            xhss.ᛱᛳᲈᛷ r2 = r9.f1933
            xhss.ᛱᲁᲈᛷ r3 = r0.f3634
            xhss.ᛸᛵᛷᛴ r4 = xhss.C0105.f480
            r5 = 1
            if (r1 != r4) goto L1d
            r3.getClass()
            goto L62
        L1d:
            java.lang.Class r4 = r2.f211
            java.util.concurrent.ConcurrentHashMap r6 = r3.f482
            java.lang.Object r6 = r6.get(r4)
            xhss.ᛴᛲᲀᛵ r6 = (xhss.InterfaceC0341) r6
            if (r6 == 0) goto L2c
            if (r6 != r1) goto L63
            goto L62
        L2c:
            java.lang.Class<xhss.ᛸᛱᲀᛷ> r6 = xhss.InterfaceC0726.class
            java.lang.annotation.Annotation r6 = r4.getAnnotation(r6)
            xhss.ᛸᛱᲀᛷ r6 = (xhss.InterfaceC0726) r6
            if (r6 != 0) goto L37
            goto L63
        L37:
            java.lang.Class r6 = r6.value()
            java.lang.Class<xhss.ᛴᛲᲀᛵ> r7 = xhss.InterfaceC0341.class
            boolean r7 = r7.isAssignableFrom(r6)
            if (r7 != 0) goto L44
            goto L63
        L44:
            xhss.ᛳᛱᛲᲀ r7 = r3.f481
            xhss.ᛱᛳᲈᛷ r8 = new xhss.ᛱᛳᲈᛷ
            r8.<init>(r6)
            xhss.ᲁᲀᛶᛲ r6 = r7.m532(r8, r5)
            java.lang.Object r6 = r6.mo964()
            xhss.ᛴᛲᲀᛵ r6 = (xhss.InterfaceC0341) r6
            java.util.concurrent.ConcurrentHashMap r7 = r3.f482
            java.lang.Object r4 = r7.putIfAbsent(r4, r6)
            xhss.ᛴᛲᲀᛵ r4 = (xhss.InterfaceC0341) r4
            if (r4 == 0) goto L60
            r6 = r4
        L60:
            if (r6 != r1) goto L63
        L62:
            r1 = r3
        L63:
            java.util.List r3 = r0.f3632
            java.util.Iterator r3 = r3.iterator()
            r4 = 0
        L6a:
            boolean r6 = r3.hasNext()
            if (r6 == 0) goto L84
            java.lang.Object r6 = r3.next()
            xhss.ᛴᛲᲀᛵ r6 = (xhss.InterfaceC0341) r6
            if (r4 != 0) goto L7c
            if (r6 != r1) goto L6a
            r4 = r5
            goto L6a
        L7c:
            xhss.ᛲᛱᛶᛴ r6 = r6.mo160(r0, r2)
            if (r6 == 0) goto L6a
            r0 = r6
            goto L8a
        L84:
            if (r4 != 0) goto L8d
            xhss.ᛲᛱᛶᛴ r0 = r0.m1815(r2)
        L8a:
            r9.f1934 = r0
            goto L93
        L8d:
            java.lang.String r9 = "GSON cannot serialize or deserialize "
            xhss.C0532.m956(r2, r9)
            return
        L93:
            r0.mo120(r10, r11)
            return
    }
}
