package k6;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class d implements h6.o {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f7343g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final h0.q0 f7344h;

    public /* synthetic */ d(h0.q0 r1, int r2) {
            r0 = this;
            r0.f7343g = r2
            r0.f7344h = r1
            r0.<init>()
            return
    }

    @Override // h6.o
    public final h6.n a(h6.f r10, n6.a r11) {
            r9 = this;
            int r0 = r9.f7343g
            h0.q0 r1 = r9.f7344h
            java.lang.Class<java.lang.Object> r2 = java.lang.Object.class
            r3 = 0
            r4 = 0
            switch(r0) {
                case 0: goto L76;
                default: goto Lb;
            }
        Lb:
            java.lang.reflect.Type r0 = r11.f9029b
            java.lang.Class r5 = r11.f9028a
            java.lang.Class<java.util.Map> r6 = java.util.Map.class
            boolean r7 = r6.isAssignableFrom(r5)
            if (r7 != 0) goto L18
            goto L75
        L18:
            java.lang.Class<java.util.Properties> r3 = java.util.Properties.class
            boolean r3 = r3.isAssignableFrom(r5)
            r7 = 2
            r8 = 1
            if (r3 == 0) goto L2b
            java.lang.reflect.Type[] r0 = new java.lang.reflect.Type[r7]
            java.lang.Class<java.lang.String> r2 = java.lang.String.class
            r0[r4] = r2
            r0[r8] = r2
            goto L40
        L2b:
            java.lang.reflect.Type r0 = j6.h.g(r0, r5, r6)
            boolean r3 = r0 instanceof java.lang.reflect.ParameterizedType
            if (r3 == 0) goto L3a
            java.lang.reflect.ParameterizedType r0 = (java.lang.reflect.ParameterizedType) r0
            java.lang.reflect.Type[] r0 = r0.getActualTypeArguments()
            goto L40
        L3a:
            java.lang.reflect.Type[] r0 = new java.lang.reflect.Type[r7]
            r0[r4] = r2
            r0[r8] = r2
        L40:
            r2 = r0[r4]
            r0 = r0[r8]
            java.lang.Class r3 = java.lang.Boolean.TYPE
            if (r2 == r3) goto L57
            java.lang.Class<java.lang.Boolean> r3 = java.lang.Boolean.class
            if (r2 != r3) goto L4d
            goto L57
        L4d:
            n6.a r3 = new n6.a
            r3.<init>(r2)
            h6.n r3 = r10.b(r3)
            goto L59
        L57:
            k6.w0 r3 = k6.c1.f7319c
        L59:
            k6.y r5 = new k6.y
            r5.<init>(r10, r3, r2)
            n6.a r2 = new n6.a
            r2.<init>(r0)
            h6.n r2 = r10.b(r2)
            k6.y r3 = new k6.y
            r3.<init>(r10, r2, r0)
            r1.c(r11, r4)
            k6.c r10 = new k6.c
            r10.<init>(r9, r5, r3)
            r3 = r10
        L75:
            return r3
        L76:
            java.lang.reflect.Type r0 = r11.f9029b
            java.lang.Class r5 = r11.f9028a
            java.lang.Class<java.util.Collection> r6 = java.util.Collection.class
            boolean r7 = r6.isAssignableFrom(r5)
            if (r7 != 0) goto L83
            goto Laa
        L83:
            java.lang.reflect.Type r0 = j6.h.g(r0, r5, r6)
            boolean r3 = r0 instanceof java.lang.reflect.ParameterizedType
            if (r3 == 0) goto L93
            java.lang.reflect.ParameterizedType r0 = (java.lang.reflect.ParameterizedType) r0
            java.lang.reflect.Type[] r0 = r0.getActualTypeArguments()
            r2 = r0[r4]
        L93:
            n6.a r0 = new n6.a
            r0.<init>(r2)
            h6.n r0 = r10.b(r0)
            k6.y r3 = new k6.y
            r3.<init>(r10, r0, r2)
            r1.c(r11, r4)
            k6.c r10 = new k6.c
            r10.<init>(r3)
            r3 = r10
        Laa:
            return r3
    }
}
