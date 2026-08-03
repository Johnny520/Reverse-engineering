package th;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public i1.b f13274a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.util.ArrayList f13275b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public i1.b f13276c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f13277d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final i0.f1 f13278e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f13279f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final java.lang.String[] f13280g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int[] f13281h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int[] f13282i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final f1.n0[] f13283j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ th.i f13284k;

    public e(th.i r3) {
            r2 = this;
            r2.<init>()
            r2.f13284k = r3
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r2.f13275b = r3
            r3 = 1
            r2.f13277d = r3
            i0.f1 r0 = new i0.f1
            r1 = 0
            r0.<init>(r1)
            r2.f13278e = r0
            r2.f13279f = r3
            java.lang.String r3 = ""
            java.lang.String[] r3 = new java.lang.String[]{r3, r3}
            r2.f13280g = r3
            r3 = -1
            int[] r0 = new int[]{r3, r3}
            r2.f13281h = r0
            int[] r3 = new int[]{r3, r3}
            r2.f13282i = r3
            r3 = 2
            f1.n0[] r3 = new f1.n0[r3]
            r2.f13283j = r3
            return
    }

    public final i1.b a(int r4) {
            r3 = this;
            th.i r0 = r3.f13284k
            f1.z r0 = x1.k.u(r0)
        L6:
            java.util.ArrayList r1 = r3.f13275b
            int r2 = r1.size()
            if (r2 > r4) goto L16
            i1.b r2 = r0.c()
            r1.add(r2)
            goto L6
        L16:
            java.lang.Object r4 = r1.get(r4)
            i1.b r4 = (i1.b) r4
            return r4
    }

    public final void b() {
            r5 = this;
            th.i r0 = r5.f13284k
            f1.z r0 = x1.k.u(r0)
            i1.b r1 = r5.f13274a
            if (r1 == 0) goto Ld
            r0.a(r1)
        Ld:
            r1 = 0
            r5.f13274a = r1
            java.util.ArrayList r2 = r5.f13275b
            java.util.Iterator r3 = r2.iterator()
        L16:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L26
            java.lang.Object r4 = r3.next()
            i1.b r4 = (i1.b) r4
            r0.a(r4)
            goto L16
        L26:
            r2.clear()
            i1.b r2 = r5.f13276c
            if (r2 == 0) goto L30
            r0.a(r2)
        L30:
            r5.f13276c = r1
            f1.n0[] r0 = r5.f13283j
            tf.l.x0(r1, r0)
            java.lang.String[] r0 = r5.f13280g
            java.lang.String r1 = ""
            tf.l.x0(r1, r0)
            int[] r0 = r5.f13281h
            r1 = -1
            tf.l.y0(r0, r1)
            int[] r0 = r5.f13282i
            tf.l.y0(r0, r1)
            return
    }
}
