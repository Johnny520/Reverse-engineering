package xhss;

/* JADX INFO: renamed from: xhss.ᛳᲀᲁᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class C0308 implements xhss.InterfaceC0102 {

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public final xhss.InterfaceC0102 f1173;

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public boolean f1174;

    /* JADX INFO: renamed from: ᛷᛴᛷᛱ, reason: contains not printable characters */
    public boolean f1175;

    /* JADX INFO: renamed from: ᲀᲇᛳᲁ, reason: contains not printable characters */
    public final /* synthetic */ xhss.C1066 f1176;

    /* JADX INFO: renamed from: ᲇᛴᲇᛵ, reason: contains not printable characters */
    public long f1177;

    /* JADX INFO: renamed from: ᲇᛶᛴᲀ, reason: contains not printable characters */
    public boolean f1178;

    public C0308(xhss.C1066 r1, xhss.InterfaceC0102 r2) {
            r0 = this;
            r0.<init>()
            r0.f1176 = r1
            r0.f1173 = r2
            r1 = 1
            r0.f1175 = r1
            return
    }

    @Override // xhss.InterfaceC0102, java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public final void close() {
            r1 = this;
            boolean r0 = r1.f1178
            if (r0 == 0) goto L5
            return
        L5:
            r0 = 1
            r1.f1178 = r0
            r1.m647()     // Catch: java.io.IOException -> L10
            r0 = 0
            r1.m648(r0)     // Catch: java.io.IOException -> L10
            return
        L10:
            r0 = move-exception
            java.io.IOException r1 = r1.m648(r0)
            throw r1
    }

    @Override // xhss.InterfaceC0102, java.io.Flushable
    public final void flush() {
            r1 = this;
            r1.m649()     // Catch: java.io.IOException -> L4
            return
        L4:
            r0 = move-exception
            java.io.IOException r1 = r1.m648(r0)
            throw r1
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.Class<xhss.ᛳᲀᲁᲁ> r1 = xhss.C0308.class
            java.lang.String r1 = r1.getSimpleName()
            r0.<init>(r1)
            r1 = 40
            r0.append(r1)
            xhss.ᛱᲁᛷᲁ r2 = r2.f1173
            r0.append(r2)
            r2 = 41
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public final void m647() {
            r0 = this;
            xhss.ᛱᲁᛷᲁ r0 = r0.f1173
            r0.close()
            return
    }

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public final java.io.IOException m648(java.io.IOException r3) {
            r2 = this;
            boolean r0 = r2.f1174
            if (r0 == 0) goto L5
            return r3
        L5:
            r0 = 1
            r2.f1174 = r0
            xhss.ᲇᛸᛵᛴ r2 = r2.f1176
            r1 = 4
            java.io.IOException r2 = xhss.C1066.m1722(r2, r0, r3, r1)
            return r2
    }

    @Override // xhss.InterfaceC0102
    /* JADX INFO: renamed from: ᛷᛴᛷᛱ */
    public final void mo228(long r3, xhss.C0338 r5) {
            r2 = this;
            boolean r0 = r2.f1178
            if (r0 != 0) goto L27
            boolean r0 = r2.f1175     // Catch: java.io.IOException -> L15
            if (r0 == 0) goto L17
            r0 = 0
            r2.f1175 = r0     // Catch: java.io.IOException -> L15
            xhss.ᲇᛸᛵᛴ r0 = r2.f1176     // Catch: java.io.IOException -> L15
            xhss.ᛸᲇᲇᛶ r0 = r0.f3440     // Catch: java.io.IOException -> L15
            xhss.ᲀᲀᛱᲇ r0 = r0.f2665     // Catch: java.io.IOException -> L15
            r0.getClass()     // Catch: java.io.IOException -> L15
            goto L17
        L15:
            r3 = move-exception
            goto L22
        L17:
            xhss.ᛱᲁᛷᲁ r0 = r2.f1173     // Catch: java.io.IOException -> L15
            r0.mo228(r3, r5)     // Catch: java.io.IOException -> L15
            long r0 = r2.f1177     // Catch: java.io.IOException -> L15
            long r0 = r0 + r3
            r2.f1177 = r0     // Catch: java.io.IOException -> L15
            return
        L22:
            java.io.IOException r2 = r2.m648(r3)
            throw r2
        L27:
            java.lang.String r2 = "closed"
            xhss.C0532.m950(r2)
            return
    }

    @Override // xhss.InterfaceC0102
    /* JADX INFO: renamed from: ᛷᛵᛵᲈ */
    public final xhss.C0213 mo229() {
            r0 = this;
            xhss.ᛱᲁᛷᲁ r0 = r0.f1173
            xhss.ᛲᲁᲈᛲ r0 = r0.mo229()
            return r0
    }

    /* JADX INFO: renamed from: ᲇᛴᲇᛵ, reason: contains not printable characters */
    public final void m649() {
            r0 = this;
            xhss.ᛱᲁᛷᲁ r0 = r0.f1173
            r0.flush()
            return
    }
}
