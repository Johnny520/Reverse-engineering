package ke;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class i extends r9.e0 {
    public static boolean t0(ud.n r11, ae.h r12, ud.a r13) {
            java.util.List r0 = r12.f244h
            r1 = 0
            if (r11 != 0) goto L7
            goto Lb3
        L7:
            boolean r2 = r11 instanceof zd.c
            if (r2 == 0) goto L14
            zd.c r11 = (zd.c) r11
            xd.b r11 = r11.f22670q
            boolean r11 = t0(r11, r12, r13)
            return r11
        L14:
            boolean r2 = r11 instanceof ud.i
            if (r2 == 0) goto L21
            xd.a r11 = (xd.a) r11
            ud.n r11 = r11.f21538i
            boolean r11 = t0(r11, r12, r13)
            return r11
        L21:
            xd.b r2 = new xd.b
            r2.<init>(r11)
            java.util.List r3 = r11.u()
            java.util.Iterator r4 = r3.iterator()
        L2e:
            boolean r5 = r4.hasNext()
            java.util.ArrayList r6 = r2.f21539k
            if (r5 == 0) goto L6b
            java.lang.Object r5 = r4.next()
            ud.j r5 = (ud.j) r5
            boolean r7 = f8.i.O(r13, r5)
            if (r7 == 0) goto L2e
            java.util.Iterator r7 = r0.iterator()
        L46:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L67
            java.lang.Object r8 = r7.next()
            ae.f r8 = (ae.f) r8
            ud.a r8 = r8.f234c
            if (r8 == 0) goto L46
            md.a r9 = md.a.f8840u
            md.f r10 = r8.f8877g
            boolean r9 = r10.a(r9)
            if (r9 != 0) goto L46
            boolean r8 = f8.i.O(r8, r5)
            if (r8 == 0) goto L46
            goto L6b
        L67:
            r6.add(r5)
            goto L2e
        L6b:
            boolean r13 = r6.isEmpty()
            if (r13 == 0) goto L72
            goto Lb3
        L72:
            xd.f r13 = new xd.f
            r13.<init>(r11, r2)
            r2.f21538i = r13
            r13.f21551n = r12
            int r12 = r0.size()
            java.util.LinkedHashMap r4 = new java.util.LinkedHashMap
            r4.<init>(r12)
            r13.f21549l = r4
            java.util.Iterator r12 = r0.iterator()
        L8a:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto La7
            java.lang.Object r0 = r12.next()
            ae.f r0 = (ae.f) r0
            xd.b r4 = r0.f236e
            if (r4 == 0) goto L8a
            boolean r5 = r0.f239h
            if (r5 == 0) goto La1
            r13.f21550m = r4
            goto L8a
        La1:
            java.util.Map r5 = r13.f21549l
            r5.put(r0, r4)
            goto L8a
        La7:
            java.lang.Object r12 = r6.get(r1)
            ud.j r12 = (ud.j) r12
            boolean r11 = r11.l(r12, r13)
            if (r11 != 0) goto Lb4
        Lb3:
            return r1
        Lb4:
            r3.removeAll(r6)
            java.util.Iterator r11 = r6.iterator()
        Lbb:
            boolean r12 = r11.hasNext()
            if (r12 == 0) goto Ld0
            java.lang.Object r12 = r11.next()
            ud.j r12 = (ud.j) r12
            boolean r13 = r12 instanceof xd.a
            if (r13 == 0) goto Lbb
            xd.a r12 = (xd.a) r12
            r12.f21538i = r2
            goto Lbb
        Ld0:
            r11 = 1
            return r11
    }
}
