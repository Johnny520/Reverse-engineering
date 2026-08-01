package defpackage;

/* JADX INFO: renamed from: ᛱᛳᲇᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C0064 implements defpackage.InterfaceC2085 {

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public final /* synthetic */ defpackage.C0669 f720;

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public boolean f721;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final defpackage.C0852 f722;

    public C0064(defpackage.C0669 r2) {
            r1 = this;
            r1.<init>()
            r1.f720 = r2
            ᛵᛳᛸᛶ r0 = new ᛵᛳᛸᛶ
            ᛷᛸᛱᛸ r2 = r2.f3242
            java.lang.Object r2 = r2.f5859
            ᛶᛳᛵᛸ r2 = (defpackage.C1037) r2
            ᲇᛷᛲᲁ r2 = r2.f4612
            ᛶᛵᛸᛱ r2 = r2.mo485()
            r0.<init>(r2)
            r1.f722 = r0
            return
    }

    @Override // defpackage.InterfaceC2085, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
            r3 = this;
            boolean r0 = r3.f721
            if (r0 == 0) goto L5
            return
        L5:
            r0 = 1
            r3.f721 = r0
            ᛵᛳᛸᛶ r0 = r3.f722
            ᛶᛵᛸᛱ r1 = r0.f3891
            ᛳᲇᛲ r2 = defpackage.C1077.f4838
            r0.f3891 = r2
            r1.mo1800()
            r1.mo1801()
            r0 = 3
            ᛴᛴᲈᛷ r3 = r3.f720
            r3.f3241 = r0
            return
    }

    @Override // defpackage.InterfaceC2085, java.io.Flushable
    public final void flush() {
            r1 = this;
            boolean r0 = r1.f721
            if (r0 == 0) goto L5
            return
        L5:
            ᛴᛴᲈᛷ r1 = r1.f720
            ᛷᛸᛱᛸ r1 = r1.f3242
            java.lang.Object r1 = r1.f5859
            ᛶᛳᛵᛸ r1 = (defpackage.C1037) r1
            r1.flush()
            return
    }

    @Override // defpackage.InterfaceC2085
    /* JADX INFO: renamed from: ᛴᛸᲈᲈ, reason: contains not printable characters */
    public final void mo484(long r8, defpackage.C1569 r10) {
            r7 = this;
            boolean r0 = r7.f721
            if (r0 != 0) goto L18
            long r1 = r10.f6928
            r3 = 0
            r5 = r8
            defpackage.AbstractC0709.m1608(r1, r3, r5)
            ᛴᛴᲈᛷ r7 = r7.f720
            ᛷᛸᛱᛸ r7 = r7.f3242
            java.lang.Object r7 = r7.f5859
            ᛶᛳᛵᛸ r7 = (defpackage.C1037) r7
            r7.mo484(r5, r10)
            return
        L18:
            java.lang.String r7 = "closed"
            defpackage.C2264.m3676(r7)
            return
    }

    @Override // defpackage.InterfaceC2085
    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final defpackage.C1077 mo485() {
            r0 = this;
            ᛵᛳᛸᛶ r0 = r0.f722
            return r0
    }
}
