package le;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f8023b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i4.y f8024a;

    static {
            java.lang.Class<le.f> r0 = le.f.class
            mh.d.b(r0)
            return
    }

    public f(ud.r r1, i4.y r2) {
            r0 = this;
            r0.<init>()
            r0.f8024a = r2
            return
    }

    public static void a(xd.e r4, qd.l r5, ud.a r6, java.util.LinkedHashSet r7, java.util.HashSet r8) {
            r8.add(r6)
            java.util.ArrayList r0 = r6.f13674l
            java.util.Iterator r0 = r0.iterator()
        L9:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L37
            java.lang.Object r1 = r0.next()
            ud.p r1 = (ud.p) r1
            pd.k r2 = r1.f13713k
            pd.k r3 = pd.k.f10517z
            if (r2 != r3) goto L9
            java.util.List r2 = r1.f13715m
            int r2 = r2.size()
            if (r2 <= 0) goto L9
            r2 = 0
            qd.l r2 = r1.S(r2)
            boolean r2 = r2.equals(r5)
            if (r2 == 0) goto L9
            r7.add(r6)
            java.util.ArrayList r4 = r4.f21546l
            r4.add(r1)
            return
        L37:
            java.util.List r6 = r6.f13676n
            java.util.Iterator r6 = r6.iterator()
        L3d:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L53
            java.lang.Object r0 = r6.next()
            ud.a r0 = (ud.a) r0
            boolean r1 = r8.contains(r0)
            if (r1 != 0) goto L3d
            a(r4, r5, r0, r7, r8)
            goto L3d
        L53:
            return
    }

    public static ud.a b(ud.a r3, java.util.LinkedHashSet r4, java.util.HashSet r5) {
            r5.add(r3)
            java.util.List r3 = r3.f13677o
            java.util.Iterator r3 = r3.iterator()
        L9:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L38
            java.lang.Object r0 = r3.next()
            ud.a r0 = (ud.a) r0
            java.util.Iterator r1 = r4.iterator()
        L19:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L37
            java.lang.Object r2 = r1.next()
            ud.a r2 = (ud.a) r2
            boolean r2 = a.a.s0(r2, r0)
            if (r2 != 0) goto L19
            boolean r1 = r5.contains(r0)
            if (r1 != 0) goto L9
            ud.a r0 = b(r0, r4, r5)
            if (r0 == 0) goto L9
        L37:
            return r0
        L38:
            r3 = 0
            return r3
    }
}
