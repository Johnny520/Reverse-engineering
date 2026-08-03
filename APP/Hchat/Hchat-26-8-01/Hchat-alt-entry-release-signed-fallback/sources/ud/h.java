package ud;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public interface h extends ud.j {
    @Override // ud.j
    default void b(fd.i r6, fc.f r7) {
            r5 = this;
            r0 = r5
            md.e r0 = (md.e) r0
            md.f r1 = r0.f8877g
            md.a r2 = md.a.f8838s
            boolean r1 = r1.a(r2)
            if (r1 == 0) goto Le
            goto L39
        Le:
            java.util.List r1 = r5.g()
            java.util.Iterator r1 = r1.iterator()
        L16:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L2f
            java.lang.Object r3 = r1.next()
            ud.p r3 = (ud.p) r3
            md.f r4 = r3.f8877g
            boolean r4 = r4.a(r2)
            if (r4 != 0) goto L16
            r4 = 0
            r6.j(r3, r7, r4)
            goto L16
        L2f:
            md.b r6 = md.b.f8870y
            md.f r7 = r0.f8877g
            oc.b r6 = r7.c(r6)
            if (r6 != 0) goto L3a
        L39:
            return
        L3a:
            ah.a.d()
            return
    }

    java.util.List g();
}
