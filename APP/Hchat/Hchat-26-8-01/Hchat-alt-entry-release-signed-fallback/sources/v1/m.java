package v1;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13983a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v1.l f13984b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final v1.l f13985c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final v1.l f13986d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final v1.l f13987e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final java.io.Serializable f13988f;

    public m(java.lang.String r3) {
            r2 = this;
            r0 = 1
            r2.f13983a = r0
            r2.<init>()
            r2.f13988f = r3
            v1.l r3 = new v1.l
            r1 = 0
            r3.<init>(r0, r1)
            r2.f13984b = r3
            v1.l r3 = new v1.l
            r0 = 0
            r3.<init>(r0, r1)
            r2.f13985c = r3
            v1.l r3 = new v1.l
            r0 = 1
            r3.<init>(r0, r1)
            r2.f13986d = r3
            v1.l r3 = new v1.l
            r0 = 0
            r3.<init>(r0, r1)
            r2.f13987e = r3
            return
    }

    public m(v1.m[] r5) {
            r4 = this;
            r0 = 0
            r4.f13983a = r0
            r4.<init>()
            r4.f13988f = r5
            int r5 = r5.length
            v1.l[] r0 = new v1.l[r5]
            r1 = 0
            r2 = r1
        Ld:
            if (r2 >= r5) goto L1e
            java.io.Serializable r3 = r4.f13988f
            v1.m[] r3 = (v1.m[]) r3
            r3 = r3[r2]
            v1.l r3 = r3.b()
            r0[r2] = r3
            int r2 = r2 + 1
            goto Ld
        L1e:
            v1.m1 r5 = new v1.m1
            r2 = 0
            r5.<init>(r0, r2)
            v1.l r0 = new v1.l
            r2 = 1
            r0.<init>(r2, r5)
            r4.f13984b = r0
            java.io.Serializable r5 = r4.f13988f
            v1.m[] r5 = (v1.m[]) r5
            int r5 = r5.length
            v1.l[] r0 = new v1.l[r5]
            r2 = r1
        L34:
            if (r2 >= r5) goto L45
            java.io.Serializable r3 = r4.f13988f
            v1.m[] r3 = (v1.m[]) r3
            r3 = r3[r2]
            v1.l r3 = r3.d()
            r0[r2] = r3
            int r2 = r2 + 1
            goto L34
        L45:
            v1.l r5 = new v1.l
            v1.k r2 = new v1.k
            r3 = 0
            r2.<init>(r0, r3)
            r0 = 0
            r5.<init>(r0, r2)
            r4.f13985c = r5
            java.io.Serializable r5 = r4.f13988f
            v1.m[] r5 = (v1.m[]) r5
            int r5 = r5.length
            v1.l[] r0 = new v1.l[r5]
            r2 = r1
        L5b:
            if (r2 >= r5) goto L6c
            java.io.Serializable r3 = r4.f13988f
            v1.m[] r3 = (v1.m[]) r3
            r3 = r3[r2]
            v1.l r3 = r3.c()
            r0[r2] = r3
            int r2 = r2 + 1
            goto L5b
        L6c:
            v1.m1 r5 = new v1.m1
            r2 = 1
            r5.<init>(r0, r2)
            v1.l r0 = new v1.l
            r0.<init>(r2, r5)
            r4.f13986d = r0
            java.io.Serializable r5 = r4.f13988f
            v1.m[] r5 = (v1.m[]) r5
            int r5 = r5.length
            v1.l[] r0 = new v1.l[r5]
        L80:
            if (r1 >= r5) goto L91
            java.io.Serializable r2 = r4.f13988f
            v1.m[] r2 = (v1.m[]) r2
            r2 = r2[r1]
            v1.l r2 = r2.a()
            r0[r1] = r2
            int r1 = r1 + 1
            goto L80
        L91:
            v1.l r5 = new v1.l
            v1.k r1 = new v1.k
            r2 = 1
            r1.<init>(r0, r2)
            r0 = 0
            r5.<init>(r0, r1)
            r4.f13987e = r5
            return
    }

    public final v1.l a() {
            r1 = this;
            int r0 = r1.f13983a
            switch(r0) {
                case 0: goto L8;
                default: goto L5;
            }
        L5:
            v1.l r0 = r1.f13987e
            return r0
        L8:
            v1.l r0 = r1.f13987e
            return r0
    }

    public final v1.l b() {
            r1 = this;
            int r0 = r1.f13983a
            switch(r0) {
                case 0: goto L8;
                default: goto L5;
            }
        L5:
            v1.l r0 = r1.f13984b
            return r0
        L8:
            v1.l r0 = r1.f13984b
            return r0
    }

    public final v1.l c() {
            r1 = this;
            int r0 = r1.f13983a
            switch(r0) {
                case 0: goto L8;
                default: goto L5;
            }
        L5:
            v1.l r0 = r1.f13986d
            return r0
        L8:
            v1.l r0 = r1.f13986d
            return r0
    }

    public final v1.l d() {
            r1 = this;
            int r0 = r1.f13983a
            switch(r0) {
                case 0: goto L8;
                default: goto L5;
            }
        L5:
            v1.l r0 = r1.f13985c
            return r0
        L8:
            v1.l r0 = r1.f13985c
            return r0
    }

    public final java.lang.String toString() {
            r3 = this;
            int r0 = r3.f13983a
            switch(r0) {
                case 0: goto L1d;
                default: goto L5;
            }
        L5:
            java.io.Serializable r0 = r3.f13988f
            java.lang.String r0 = (java.lang.String) r0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "RectRulers("
            r1.<init>(r2)
            r1.append(r0)
            r0 = 41
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            return r0
        L1d:
            java.io.Serializable r0 = r3.f13988f
            v1.m[] r0 = (v1.m[]) r0
            r1 = 0
            r2 = 57
            java.lang.String r0 = tf.l.F0(r0, r1, r2)
            return r0
    }
}
