package f9;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements fg.a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f3352g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f3353h;

    public /* synthetic */ b(java.lang.Object r1, int r2) {
            r0 = this;
            r0.f3352g = r2
            r0.f3353h = r1
            r0.<init>()
            return
    }

    @Override // fg.a
    public final java.lang.Object invoke() {
            r5 = this;
            int r0 = r5.f3352g
            switch(r0) {
                case 0: goto L6e;
                case 1: goto L6b;
                default: goto L5;
            }
        L5:
            java.lang.Object r0 = r5.f3353h
            java.lang.Class r0 = r0.getClass()
            java.util.List r0 = h.Hchat.utils.KavaReflector.declaredMethods(r0)
            java.util.Iterator r0 = r0.iterator()
        L13:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L67
            java.lang.Object r1 = r0.next()
            r2 = r1
            java.lang.reflect.Method r2 = (java.lang.reflect.Method) r2
            java.lang.Class[] r3 = r2.getParameterTypes()
            r3.getClass()
            int r3 = r3.length
            if (r3 != 0) goto L13
            java.lang.String r3 = r2.getName()
            java.lang.String r4 = "getMsgId"
            boolean r3 = gg.l.a(r3, r4)
            if (r3 != 0) goto L4e
            java.lang.String r3 = r2.getName()
            java.lang.String r4 = "getMsgID"
            boolean r3 = gg.l.a(r3, r4)
            if (r3 != 0) goto L4e
            java.lang.String r3 = r2.getName()
            java.lang.String r4 = "getId"
            boolean r3 = gg.l.a(r3, r4)
            if (r3 == 0) goto L13
        L4e:
            java.lang.Class r3 = r2.getReturnType()
            java.lang.Class r4 = java.lang.Long.TYPE
            boolean r3 = gg.l.a(r3, r4)
            if (r3 != 0) goto L68
            java.lang.Class r2 = r2.getReturnType()
            java.lang.Class<java.lang.Long> r3 = java.lang.Long.class
            boolean r2 = gg.l.a(r2, r3)
            if (r2 == 0) goto L13
            goto L68
        L67:
            r1 = 0
        L68:
            java.lang.reflect.Method r1 = (java.lang.reflect.Method) r1
            return r1
        L6b:
            java.lang.Object r0 = r5.f3353h
            return r0
        L6e:
            java.lang.Object r0 = r5.f3353h
            java.lang.Class r0 = r0.getClass()
            java.util.List r0 = h.Hchat.utils.KavaReflector.declaredMethods(r0)
            java.util.Iterator r0 = r0.iterator()
        L7c:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto Ld0
            java.lang.Object r1 = r0.next()
            r2 = r1
            java.lang.reflect.Method r2 = (java.lang.reflect.Method) r2
            java.lang.Class[] r3 = r2.getParameterTypes()
            r3.getClass()
            int r3 = r3.length
            if (r3 != 0) goto L7c
            java.lang.String r3 = r2.getName()
            java.lang.String r4 = "getMsgId"
            boolean r3 = gg.l.a(r3, r4)
            if (r3 != 0) goto Lb7
            java.lang.String r3 = r2.getName()
            java.lang.String r4 = "getMsgID"
            boolean r3 = gg.l.a(r3, r4)
            if (r3 != 0) goto Lb7
            java.lang.String r3 = r2.getName()
            java.lang.String r4 = "getId"
            boolean r3 = gg.l.a(r3, r4)
            if (r3 == 0) goto L7c
        Lb7:
            java.lang.Class r3 = r2.getReturnType()
            java.lang.Class r4 = java.lang.Long.TYPE
            boolean r3 = gg.l.a(r3, r4)
            if (r3 != 0) goto Ld1
            java.lang.Class r2 = r2.getReturnType()
            java.lang.Class<java.lang.Long> r3 = java.lang.Long.class
            boolean r2 = gg.l.a(r2, r3)
            if (r2 == 0) goto L7c
            goto Ld1
        Ld0:
            r1 = 0
        Ld1:
            java.lang.reflect.Method r1 = (java.lang.reflect.Method) r1
            return r1
    }
}
