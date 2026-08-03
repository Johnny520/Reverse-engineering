package androidx.lifecycle;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.util.LinkedHashMap f284a;

    public e0(int r4) {
            r3 = this;
            switch(r4) {
                case 1: goto Le;
                default: goto L3;
            }
        L3:
            r3.<init>()
            java.util.LinkedHashMap r4 = new java.util.LinkedHashMap
            r4.<init>()
            r3.f284a = r4
            return
        Le:
            r3.<init>()
            java.util.LinkedHashMap r4 = new java.util.LinkedHashMap
            r0 = 1
            r1 = 0
            r2 = 1061158912(0x3f400000, float:0.75)
            r4.<init>(r1, r2, r0)
            r3.f284a = r4
            return
    }

    public e0(ud.r r4) {
            r3 = this;
            r3.<init>()
            java.util.List r4 = r4.D
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            int r1 = r4.size()
            r0.<init>(r1)
            r3.f284a = r0
            java.util.Iterator r4 = r4.iterator()
        L14:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L2b
            java.lang.Object r0 = r4.next()
            qd.s r0 = (qd.s) r0
            java.util.LinkedHashMap r1 = r3.f284a
            qe.s r2 = new qe.s
            r2.<init>(r0)
            r1.put(r0, r2)
            goto L14
        L2b:
            return
    }

    public void a() {
            r3 = this;
            java.util.LinkedHashMap r0 = r3.f284a
            java.util.Collection r1 = r0.values()
            java.util.Iterator r1 = r1.iterator()
        La:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L1a
            java.lang.Object r2 = r1.next()
            y1.y1 r2 = (y1.y1) r2
            r2.a()
            goto La
        L1a:
            r0.clear()
            return
    }

    public qd.j b(qd.l r2) {
            r1 = this;
            r2.getClass()
            boolean r0 = r2 instanceof qd.r
            if (r0 == 0) goto L12
            qd.r r2 = (qd.r) r2
            qd.s r2 = r2.f10923m
            qe.s r2 = r1.c(r2)
            qd.j r2 = r2.f10987c
            return r2
        L12:
            qd.j r2 = r2.I()
            return r2
    }

    public qe.s c(qd.s r2) {
            r1 = this;
            java.util.LinkedHashMap r0 = r1.f284a
            java.lang.Object r0 = r0.get(r2)
            qe.s r0 = (qe.s) r0
            if (r0 == 0) goto Lb
            return r0
        Lb:
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r0 = "TypeSearchVarInfo not found in map for var: "
            java.lang.String r2 = r0.concat(r2)
            ah.a.k(r2)
            r2 = 0
            return r2
    }
}
