package defpackage;

/* JADX INFO: renamed from: ᛷᛱᛴᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C1203 extends defpackage.AbstractC1714 {

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public final /* synthetic */ int f5439;

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public final /* synthetic */ java.lang.Object f5440;

    public C1203(java.lang.String r2, defpackage.InterfaceC1781 r3) {
            r1 = this;
            r0 = 1
            r1.f5439 = r0
            r1.f5440 = r3
            r1.<init>(r2)
            return
    }

    public C1203(defpackage.C0871 r2, java.lang.String r3) {
            r1 = this;
            r0 = 0
            r1.f5439 = r0
            r1.f5440 = r2
            r1.<init>(r3)
            return
    }

    @Override // defpackage.AbstractC1714
    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final long mo2339() {
            r18 = this;
            r0 = r18
            int r1 = r0.f5439
            r2 = -1
            switch(r1) {
                case 0: goto L11;
                default: goto L9;
            }
        L9:
            java.lang.Object r0 = r0.f5440
            ᲀᲈᛵᲇ r0 = (defpackage.InterfaceC1781) r0
            r0.mo1032()
            return r2
        L11:
            java.lang.Object r0 = r0.f5440
            ᛵᛴᛶᛷ r0 = (defpackage.C0871) r0
            long r4 = java.lang.System.nanoTime()
            long r6 = r0.f3941
            long r6 = r4 - r6
            r8 = 1
            long r6 = r6 + r8
            java.util.concurrent.ConcurrentLinkedQueue r1 = r0.f3939
            java.util.Iterator r1 = r1.iterator()
            r8 = 0
            r9 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r11 = 0
            r13 = r8
            r14 = r13
            r12 = r11
        L30:
            boolean r15 = r1.hasNext()
            if (r15 == 0) goto L5d
            java.lang.Object r15 = r1.next()
            ᲁᛸᛲᛶ r15 = (defpackage.C1894) r15
            monitor-enter(r15)
            int r16 = r0.m1854(r15, r4)     // Catch: java.lang.Throwable -> L5a
            if (r16 <= 0) goto L46
            int r12 = r12 + 1
            goto L56
        L46:
            long r2 = r15.f8207     // Catch: java.lang.Throwable -> L5a
            int r17 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r17 >= 0) goto L4e
            r6 = r2
            r13 = r15
        L4e:
            int r11 = r11 + 1
            int r17 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r17 >= 0) goto L56
            r9 = r2
            r14 = r15
        L56:
            monitor-exit(r15)
            r2 = -1
            goto L30
        L5a:
            r0 = move-exception
            monitor-exit(r15)
            throw r0
        L5d:
            if (r13 == 0) goto L61
            r8 = r13
            goto L69
        L61:
            r1 = 5
            if (r11 <= r1) goto L67
            r6 = r9
            r8 = r14
            goto L69
        L67:
            r6 = -1
        L69:
            if (r8 == 0) goto Laf
            monitor-enter(r8)
            java.util.ArrayList r1 = r8.f8210     // Catch: java.lang.Throwable -> Lac
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> Lac
            r2 = 0
            if (r1 != 0) goto L78
        L76:
            monitor-exit(r8)
            goto Lbe
        L78:
            long r4 = r8.f8207     // Catch: java.lang.Throwable -> Lac
            int r1 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r1 == 0) goto L7f
            goto L76
        L7f:
            r1 = 1
            r8.f8205 = r1     // Catch: java.lang.Throwable -> Lac
            java.util.concurrent.ConcurrentLinkedQueue r1 = r0.f3939     // Catch: java.lang.Throwable -> Lac
            r1.remove(r8)     // Catch: java.lang.Throwable -> Lac
            monitor-exit(r8)
            java.net.Socket r1 = r8.f8201
            defpackage.AbstractC0508.m1294(r1)
            java.util.concurrent.ConcurrentLinkedQueue r1 = r0.f3939
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto Lbe
            ᛴᛴᛸᛴ r0 = r0.f3942
            ᛵᲀᲇᛸ r1 = r0.f3203
            monitor-enter(r1)
            boolean r4 = r0.m1492()     // Catch: java.lang.Throwable -> La6
            if (r4 == 0) goto La8
            ᛵᲀᲇᛸ r4 = r0.f3203     // Catch: java.lang.Throwable -> La6
            r4.m1909(r0)     // Catch: java.lang.Throwable -> La6
            goto La8
        La6:
            r0 = move-exception
            goto Laa
        La8:
            monitor-exit(r1)
            goto Lbe
        Laa:
            monitor-exit(r1)
            throw r0
        Lac:
            r0 = move-exception
            monitor-exit(r8)
            throw r0
        Laf:
            if (r14 == 0) goto Lb7
            long r0 = r0.f3941
            long r9 = r9 + r0
            long r2 = r9 - r4
            goto Lbe
        Lb7:
            if (r12 <= 0) goto Lbc
            long r2 = r0.f3941
            goto Lbe
        Lbc:
            r2 = -1
        Lbe:
            return r2
    }
}
