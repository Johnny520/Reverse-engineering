package androidx.lifecycle;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class f implements androidx.lifecycle.o {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f285g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final java.lang.Object f286h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final java.lang.Object f287i;

    public f(androidx.lifecycle.d r2, androidx.lifecycle.o r3) {
            r1 = this;
            r0 = 0
            r1.f285g = r0
            r2.getClass()
            r1.<init>()
            r1.f286h = r2
            r1.f287i = r3
            return
    }

    public f(androidx.lifecycle.p r3) {
            r2 = this;
            r0 = 1
            r2.f285g = r0
            r2.<init>()
            r2.f286h = r3
            androidx.lifecycle.c r0 = androidx.lifecycle.c.f277c
            java.lang.Class r3 = r3.getClass()
            java.util.HashMap r1 = r0.f278a
            java.lang.Object r1 = r1.get(r3)
            androidx.lifecycle.a r1 = (androidx.lifecycle.a) r1
            if (r1 == 0) goto L19
            goto L1e
        L19:
            r1 = 0
            androidx.lifecycle.a r1 = r0.a(r3, r1)
        L1e:
            r2.f287i = r1
            return
    }

    @Override // androidx.lifecycle.o
    public final void b(androidx.lifecycle.q r4, androidx.lifecycle.k r5) {
            r3 = this;
            int r0 = r3.f285g
            switch(r0) {
                case 0: goto L22;
                default: goto L5;
            }
        L5:
            java.lang.Object r0 = r3.f287i
            androidx.lifecycle.a r0 = (androidx.lifecycle.a) r0
            java.util.HashMap r0 = r0.f273a
            java.lang.Object r1 = r0.get(r5)
            java.util.List r1 = (java.util.List) r1
            java.lang.Object r2 = r3.f286h
            androidx.lifecycle.a.a(r1, r4, r5, r2)
            androidx.lifecycle.k r1 = androidx.lifecycle.k.ON_ANY
            java.lang.Object r0 = r0.get(r1)
            java.util.List r0 = (java.util.List) r0
            androidx.lifecycle.a.a(r0, r4, r5, r2)
            return
        L22:
            java.lang.Object r0 = r3.f286h
            androidx.lifecycle.d r0 = (androidx.lifecycle.d) r0
            int[] r1 = androidx.lifecycle.e.f283a
            int r2 = r5.ordinal()
            r1 = r1[r2]
            switch(r1) {
                case 1: goto L4f;
                case 2: goto L4b;
                case 3: goto L47;
                case 4: goto L43;
                case 5: goto L3f;
                case 6: goto L3b;
                case 7: goto L35;
                default: goto L31;
            }
        L31:
            okio.a.k()
            goto L5b
        L35:
            java.lang.String r4 = "ON_ANY must not been send by anybody"
            j8.o.t(r4)
            goto L5b
        L3b:
            r0.getClass()
            goto L52
        L3f:
            r0.c(r4)
            goto L52
        L43:
            r0.getClass()
            goto L52
        L47:
            r0.a(r4)
            goto L52
        L4b:
            r0.d(r4)
            goto L52
        L4f:
            r0.getClass()
        L52:
            java.lang.Object r0 = r3.f287i
            androidx.lifecycle.o r0 = (androidx.lifecycle.o) r0
            if (r0 == 0) goto L5b
            r0.b(r4, r5)
        L5b:
            return
    }
}
