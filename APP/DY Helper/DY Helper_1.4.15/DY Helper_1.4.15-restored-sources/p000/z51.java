package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class z51 extends p000.o61 {

    /* JADX INFO: renamed from: γ */
    public static final p000.z51 f12982 = null;

    static {
            z51 r0 = new z51
            r1 = 3
            r2 = 1
            r3 = 0
            r0.<init>(r3, r1, r2)
            p000.z51.f12982 = r0
            return
    }

    @Override // p000.o61
    /* JADX INFO: renamed from: α */
    public final void mo45(p000.f81 r8, p000.InterfaceC0676p6 r9, p000.rw1 r10, p000.en1 r11, p000.r71 r12) {
            r7 = this;
            r7 = 1
            java.lang.Object r0 = r8.m2056(r7)
            ow1 r0 = (p000.ow1) r0
            r1 = 0
            java.lang.Object r2 = r8.m2056(r1)
            q80 r2 = (p000.q80) r2
            r3 = 2
            java.lang.Object r8 = r8.m2056(r3)
            a40 r8 = (p000.a40) r8
            rw1 r3 = r0.m4303()
            if (r12 == 0) goto L26
            n5 r4 = new n5     // Catch: java.lang.Throwable -> L24
            r5 = 25
            r6 = 0
            r4.<init>(r5, r12, r10, r6)     // Catch: java.lang.Throwable -> L24
            goto L27
        L24:
            r7 = move-exception
            goto L4d
        L26:
            r4 = 0
        L27:
            h81 r12 = r8.f63     // Catch: java.lang.Throwable -> L24
            boolean r12 = r12.m2457()     // Catch: java.lang.Throwable -> L24
            if (r12 != 0) goto L34
            java.lang.String r12 = "FixupList has pending fixup operations that were not realized. Were there mismatched insertNode() and endNodeInsert() calls?"
            p000.AbstractC0804sn.m5526(r12)     // Catch: java.lang.Throwable -> L24
        L34:
            h81 r8 = r8.f62     // Catch: java.lang.Throwable -> L24
            r8.m2456(r9, r3, r11, r4)     // Catch: java.lang.Throwable -> L24
            r3.m5155(r7)
            r10.m5154()
            r2.getClass()
            int r7 = r0.m4300(r2)
            r10.m5130(r0, r7)
            r10.m5160()
            return
        L4d:
            r3.m5155(r1)
            throw r7
    }
}
