package ha;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class q implements fg.l {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f5266g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.Class f5267h;

    public /* synthetic */ q(ha.s r1, java.lang.Class r2, int r3) {
            r0 = this;
            r0.f5266g = r3
            r0.f5267h = r2
            r0.<init>()
            return
    }

    public /* synthetic */ q(java.lang.Class r1, int r2) {
            r0 = this;
            r0.f5266g = r2
            r0.f5267h = r1
            r0.<init>()
            return
    }

    @Override // fg.l
    public final java.lang.Object invoke(java.lang.Object r2) {
            r1 = this;
            int r0 = r1.f5266g
            switch(r0) {
                case 0: goto L5f;
                case 1: goto L4f;
                case 2: goto L28;
                default: goto L5;
            }
        L5:
            java.lang.reflect.Field r2 = (java.lang.reflect.Field) r2
            r2.getClass()
            int r0 = r2.getModifiers()
            boolean r0 = java.lang.reflect.Modifier.isStatic(r0)
            if (r0 == 0) goto L22
            java.lang.Class r2 = r2.getType()
            java.lang.Class r0 = r1.f5267h
            boolean r2 = r0.isAssignableFrom(r2)
            if (r2 == 0) goto L22
            r2 = 1
            goto L23
        L22:
            r2 = 0
        L23:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            return r2
        L28:
            java.lang.reflect.Method r2 = (java.lang.reflect.Method) r2
            r2.getClass()
            java.lang.Class r2 = r2.getReturnType()
            boolean r0 = r2.isPrimitive()
            if (r0 != 0) goto L49
            java.lang.Class r0 = java.lang.Void.TYPE
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L49
            java.lang.Class r0 = r1.f5267h
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L49
            r2 = 1
            goto L4a
        L49:
            r2 = 0
        L4a:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            return r2
        L4f:
            java.lang.reflect.Method r2 = (java.lang.reflect.Method) r2
            r2.getClass()
            java.lang.Class r0 = r1.f5267h
            boolean r2 = ha.s.g(r0, r2)
        L5a:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            return r2
        L5f:
            java.lang.reflect.Method r2 = (java.lang.reflect.Method) r2
            r2.getClass()
            java.lang.Class r0 = r1.f5267h
            boolean r2 = ha.s.e(r0, r2)
            goto L5a
    }
}
