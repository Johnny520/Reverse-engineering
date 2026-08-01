package defpackage;

/* JADX INFO: renamed from: ᛷᲁᛴᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C1368 implements defpackage.InterfaceC0191, defpackage.InterfaceC0784 {

    /* JADX INFO: renamed from: ᛱᛳᛲᛸ, reason: contains not printable characters */
    public java.util.List f5980;

    /* JADX INFO: renamed from: ᛲᛲᛵ, reason: contains not printable characters */
    public java.io.File f5981;

    /* JADX INFO: renamed from: ᛲᛴᲇᛳ, reason: contains not printable characters */
    public int f5982;

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public final defpackage.InterfaceC1300 f5983;

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final defpackage.C0684 f5984;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final java.util.List f5985;

    /* JADX INFO: renamed from: ᛸᛵᛸᛷ, reason: contains not printable characters */
    public volatile defpackage.C0402 f5986;

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public int f5987;

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public defpackage.InterfaceC1711 f5988;

    public C1368(java.util.List r2, defpackage.C0684 r3, defpackage.InterfaceC1300 r4) {
            r1 = this;
            r1.<init>()
            r0 = -1
            r1.f5987 = r0
            r1.f5985 = r2
            r1.f5984 = r3
            r1.f5983 = r4
            return
    }

    @Override // defpackage.InterfaceC0191
    public final void cancel() {
            r0 = this;
            ᛳᛱᛱᛲ r0 = r0.f5986
            if (r0 == 0) goto L9
            ᛱᲇᲀᛴ r0 = r0.f2058
            r0.cancel()
        L9:
            return
    }

    @Override // defpackage.InterfaceC0784
    /* JADX INFO: renamed from: ᛵᛱᛵᛲ */
    public final void mo1360(java.lang.Exception r4) {
            r3 = this;
            ᛷᛶᲁᲈ r0 = r3.f5983
            ᲀᛷᛶᲈ r1 = r3.f5988
            ᛳᛱᛱᛲ r3 = r3.f5986
            ᛱᲇᲀᛴ r3 = r3.f2058
            r2 = 3
            r0.mo2247(r1, r4, r3, r2)
            return
    }

    @Override // defpackage.InterfaceC0191
    /* JADX INFO: renamed from: ᲇᛶᛵᲇ */
    public final boolean mo738() {
            r7 = this;
        L0:
            java.util.List r0 = r7.f5980
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L5d
            int r3 = r7.f5982
            int r0 = r0.size()
            if (r3 >= r0) goto L5d
            r0 = 0
            r7.f5986 = r0
        L11:
            if (r2 != 0) goto L5c
            int r0 = r7.f5982
            java.util.List r3 = r7.f5980
            int r3 = r3.size()
            if (r0 >= r3) goto L5c
            java.util.List r0 = r7.f5980
            int r3 = r7.f5982
            int r4 = r3 + 1
            r7.f5982 = r4
            java.lang.Object r0 = r0.get(r3)
            ᲈᛶᲀᛳ r0 = (defpackage.InterfaceC2267) r0
            java.io.File r3 = r7.f5981
            ᛴᛶᛱᛲ r4 = r7.f5984
            int r5 = r4.f3293
            int r6 = r4.f3303
            ᛳᛸᲁᛶ r4 = r4.f3291
            ᛳᛱᛱᛲ r0 = r0.mo1266(r3, r5, r6, r4)
            r7.f5986 = r0
            ᛳᛱᛱᛲ r0 = r7.f5986
            if (r0 == 0) goto L11
            ᛴᛶᛱᛲ r0 = r7.f5984
            ᛳᛱᛱᛲ r3 = r7.f5986
            ᛱᲇᲀᛴ r3 = r3.f2058
            java.lang.Class r3 = r3.mo646()
            ᛱᛱᛶᛴ r0 = r0.m1571(r3)
            if (r0 == 0) goto L11
            ᛳᛱᛱᛲ r0 = r7.f5986
            ᛱᲇᲀᛴ r0 = r0.f2058
            ᛴᛶᛱᛲ r2 = r7.f5984
            ᛷᛷᛱᛴ r2 = r2.f3292
            r0.mo753(r2, r7)
            r2 = r1
            goto L11
        L5c:
            return r2
        L5d:
            int r0 = r7.f5987
            int r0 = r0 + r1
            r7.f5987 = r0
            java.util.List r1 = r7.f5985
            int r1 = r1.size()
            if (r0 < r1) goto L6b
            return r2
        L6b:
            java.util.List r0 = r7.f5985
            int r1 = r7.f5987
            java.lang.Object r0 = r0.get(r1)
            ᲀᛷᛶᲈ r0 = (defpackage.InterfaceC1711) r0
            ᲈᛲᛴᲀ r1 = new ᲈᛲᛴᲀ
            ᛴᛶᛱᛲ r3 = r7.f5984
            ᲀᛷᛶᲈ r4 = r3.f3299
            r1.<init>(r0, r4)
            ᲈᛵᛷᛱ r3 = r3.f3288
            ᛲᲇᛵᲈ r3 = r3.m3632()
            java.io.File r1 = r3.mo962(r1)
            r7.f5981 = r1
            if (r1 == 0) goto L0
            r7.f5988 = r0
            ᛴᛶᛱᛲ r0 = r7.f5984
            ᛵᛶᛳᲇ r0 = r0.f3296
            ᲈᲈᛲᲇ r0 = r0.m1877()
            java.util.List r0 = r0.m3872(r1)
            r7.f5980 = r0
            r7.f5982 = r2
            goto L0
    }

    @Override // defpackage.InterfaceC0784
    /* JADX INFO: renamed from: ᲇᛸᲁᛱ */
    public final void mo1362(java.lang.Object r7) {
            r6 = this;
            ᛷᛶᲁᲈ r0 = r6.f5983
            ᲀᛷᛶᲈ r1 = r6.f5988
            ᛳᛱᛱᛲ r2 = r6.f5986
            ᛱᲇᲀᛴ r3 = r2.f2058
            r4 = 3
            ᲀᛷᛶᲈ r5 = r6.f5988
            r2 = r7
            r0.mo2246(r1, r2, r3, r4, r5)
            return
    }
}
