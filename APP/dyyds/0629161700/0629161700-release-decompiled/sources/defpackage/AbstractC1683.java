package defpackage;

/* JADX INFO: renamed from: ᲀᛶᛲᛱ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1683 extends defpackage.AbstractC2372 implements defpackage.InterfaceC0843, defpackage.InterfaceC0887 {

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public defpackage.AbstractC0624 f7495;

    @Override // defpackage.AbstractC2372
    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.Class r1 = r2.getClass()
            java.lang.String r1 = r1.getSimpleName()
            r0.<init>(r1)
            r1 = 64
            r0.append(r1)
            java.lang.String r1 = defpackage.AbstractC0762.m1681(r2)
            r0.append(r1)
            java.lang.String r1 = "[job@"
            r0.append(r1)
            ᛴᛲᛵᛵ r2 = r2.f7495
            if (r2 == 0) goto L23
            goto L24
        L23:
            r2 = 0
        L24:
            java.lang.String r2 = defpackage.AbstractC0762.m1681(r2)
            r0.append(r2)
            r2 = 93
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }

    /* JADX INFO: renamed from: ᛲᛴᛱᛶ */
    public abstract boolean mo987();

    /* JADX INFO: renamed from: ᛶᛷᛱᲀ */
    public abstract void mo988(java.lang.Throwable r1);

    @Override // defpackage.InterfaceC0887
    /* JADX INFO: renamed from: ᛷᛲᲇᲈ */
    public final defpackage.C0825 mo1407() {
            r0 = this;
            r0 = 0
            return r0
    }

    @Override // defpackage.InterfaceC0887
    /* JADX INFO: renamed from: ᛷᲁᛳᛳ */
    public final boolean mo1409() {
            r0 = this;
            r0 = 1
            return r0
    }

    @Override // defpackage.InterfaceC0843
    /* JADX INFO: renamed from: ᲇᛶᛵᲇ */
    public final void mo1182() {
            r7 = this;
            ᛴᛲᛵᛵ r0 = r7.f7495
            if (r0 == 0) goto L6
        L4:
            r2 = r0
            goto L8
        L6:
            r0 = 0
            goto L4
        L8:
            java.lang.Object r5 = r2.m1442()
            boolean r0 = r5 instanceof defpackage.AbstractC1683
            if (r0 == 0) goto L28
            if (r5 == r7) goto L14
            goto L76
        L14:
            ᲇᛷᛳᛷ r6 = defpackage.AbstractC1754.f7738
        L16:
            sun.misc.Unsafe r1 = defpackage.AbstractC0051.f569
            long r3 = defpackage.AbstractC0624.f3089
            boolean r0 = r1.compareAndSwapObject(r2, r3, r5, r6)
            if (r0 == 0) goto L21
            goto L76
        L21:
            java.lang.Object r0 = r1.getObjectVolatile(r2, r3)
            if (r0 == r5) goto L16
            goto L8
        L28:
            boolean r0 = r5 instanceof defpackage.InterfaceC0887
            if (r0 == 0) goto L76
            ᛵᛵᛳᛷ r5 = (defpackage.InterfaceC0887) r5
            ᛵᛲᛴᛷ r0 = r5.mo1407()
            if (r0 == 0) goto L76
        L34:
            java.lang.Object r5 = r7.m3879()
            boolean r0 = r5 instanceof defpackage.C0746
            if (r0 == 0) goto L3d
            goto L76
        L3d:
            if (r5 != r7) goto L42
            ᲈᲈᲀᲀ r5 = (defpackage.AbstractC2372) r5
            return
        L42:
            r0 = r5
            ᲈᲈᲀᲀ r0 = (defpackage.AbstractC2372) r0
            r0.getClass()
            sun.misc.Unsafe r1 = defpackage.AbstractC0051.f569
            long r2 = defpackage.AbstractC2372.f10255
            java.lang.Object r4 = r1.getObjectVolatile(r0, r2)
            ᛴᲀᛶᛲ r4 = (defpackage.C0746) r4
            if (r4 != 0) goto L5c
            ᛴᲀᛶᛲ r4 = new ᛴᲀᛶᛲ
            r4.<init>(r0)
            r1.putObjectVolatile(r0, r2, r4)
        L5c:
            r6 = r4
        L5d:
            sun.misc.Unsafe r1 = defpackage.AbstractC0051.f569
            long r3 = defpackage.AbstractC2372.f10257
            r2 = r7
            boolean r7 = r1.compareAndSwapObject(r2, r3, r5, r6)
            if (r7 == 0) goto L6c
            r0.m3883()
            return
        L6c:
            java.lang.Object r7 = r1.getObjectVolatile(r2, r3)
            if (r7 == r5) goto L74
            r7 = r2
            goto L34
        L74:
            r7 = r2
            goto L5d
        L76:
            return
    }
}
