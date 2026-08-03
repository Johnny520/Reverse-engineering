package y2;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class e implements v1.n0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final y2.e f22215b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final y2.e f22216c = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22217a;

    static {
            y2.e r0 = new y2.e
            r1 = 0
            r0.<init>(r1)
            y2.e.f22215b = r0
            y2.e r0 = new y2.e
            r1 = 1
            r0.<init>(r1)
            y2.e.f22216c = r0
            return
    }

    public /* synthetic */ e(int r1) {
            r0 = this;
            r0.f22217a = r1
            r0.<init>()
            return
    }

    @Override // v1.n0
    public final v1.o0 h(v1.p0 r9, java.util.List r10, long r11) {
            r8 = this;
            int r0 = r8.f22217a
            switch(r0) {
                case 0: goto L69;
                default: goto L5;
            }
        L5:
            int r0 = r10.size()
            tf.u r1 = tf.u.f13168g
            r2 = 0
            if (r0 == 0) goto L62
            r3 = 1
            if (r0 == r3) goto L49
            java.util.ArrayList r0 = new java.util.ArrayList
            int r3 = r10.size()
            r0.<init>(r3)
            int r3 = r10.size()
            r4 = r2
            r5 = r4
        L20:
            if (r2 >= r3) goto L3e
            java.lang.Object r6 = r10.get(r2)
            v1.m0 r6 = (v1.m0) r6
            v1.b1 r6 = r6.Q(r11)
            int r7 = r6.f13900g
            int r4 = java.lang.Math.max(r4, r7)
            int r7 = r6.f13901h
            int r5 = java.lang.Math.max(r5, r7)
            r0.add(r6)
            int r2 = r2 + 1
            goto L20
        L3e:
            h.u r10 = new h.u
            r11 = 3
            r10.<init>(r11, r0)
            v1.o0 r9 = r9.z(r4, r5, r1, r10)
            goto L68
        L49:
            java.lang.Object r10 = r10.get(r2)
            v1.m0 r10 = (v1.m0) r10
            v1.b1 r10 = r10.Q(r11)
            int r11 = r10.f13900g
            int r12 = r10.f13901h
            c1.n r0 = new c1.n
            r2 = 6
            r0.<init>(r10, r2)
            v1.o0 r9 = r9.z(r11, r12, r1, r0)
            goto L68
        L62:
            y2.c r10 = y2.c.f22198l
            v1.o0 r9 = r9.z(r2, r2, r1, r10)
        L68:
            return r9
        L69:
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r10.size()
            r0.<init>(r1)
            int r1 = r10.size()
            r2 = 0
            r3 = r2
            r4 = r3
        L79:
            if (r2 >= r1) goto L97
            java.lang.Object r5 = r10.get(r2)
            v1.m0 r5 = (v1.m0) r5
            v1.b1 r5 = r5.Q(r11)
            int r6 = r5.f13900g
            int r3 = java.lang.Math.max(r3, r6)
            int r6 = r5.f13901h
            int r4 = java.lang.Math.max(r4, r6)
            r0.add(r5)
            int r2 = r2 + 1
            goto L79
        L97:
            boolean r10 = r10.isEmpty()
            if (r10 == 0) goto La5
            int r3 = u2.a.j(r11)
            int r4 = u2.a.i(r11)
        La5:
            h.u r10 = new h.u
            r11 = 2
            r10.<init>(r11, r0)
            tf.u r11 = tf.u.f13168g
            v1.o0 r9 = r9.z(r3, r4, r11, r10)
            return r9
    }
}
