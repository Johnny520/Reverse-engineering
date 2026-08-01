package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class vv0 implements java.lang.reflect.InvocationHandler {

    /* JADX INFO: renamed from: α */
    public final /* synthetic */ int f11424;

    /* JADX INFO: renamed from: β */
    public final /* synthetic */ p000.m80 f11425;

    public /* synthetic */ vv0(p000.m80 r1, int r2) {
            r0 = this;
            r0.f11424 = r2
            r0.f11425 = r1
            r0.<init>()
            return
    }

    @Override // java.lang.reflect.InvocationHandler
    public final java.lang.Object invoke(java.lang.Object r4, java.lang.reflect.Method r5, java.lang.Object[] r6) {
            r3 = this;
            int r0 = r3.f11424
            m80 r3 = r3.f11425
            switch(r0) {
                case 0: goto L62;
                default: goto L7;
            }
        L7:
            a80 r3 = (p000.a80) r3
            java.lang.String r5 = r5.getName()
            r0 = 0
            if (r5 == 0) goto L61
            int r1 = r5.hashCode()
            r2 = 0
            switch(r1) {
                case -1776922004: goto L56;
                case -1423461112: goto L42;
                case -1295482945: goto L2b;
                case 147696667: goto L19;
                default: goto L18;
            }
        L18:
            goto L61
        L19:
            java.lang.String r3 = "hashCode"
            boolean r3 = r5.equals(r3)
            if (r3 != 0) goto L22
            goto L61
        L22:
            int r3 = java.lang.System.identityHashCode(r4)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            goto L61
        L2b:
            java.lang.String r3 = "equals"
            boolean r3 = r5.equals(r3)
            if (r3 != 0) goto L34
            goto L61
        L34:
            if (r6 == 0) goto L3a
            java.lang.Object r0 = p000.AbstractC0312g7.m2253(r2, r6)
        L3a:
            if (r4 != r0) goto L3d
            r2 = 1
        L3d:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
            goto L61
        L42:
            java.lang.String r4 = "accept"
            boolean r4 = r5.equals(r4)
            if (r4 == 0) goto L61
            if (r6 == 0) goto L51
            java.lang.Object r4 = p000.AbstractC0312g7.m2253(r2, r6)
            goto L52
        L51:
            r4 = r0
        L52:
            r3.invoke(r4)
            goto L61
        L56:
            java.lang.String r3 = "toString"
            boolean r3 = r5.equals(r3)
            if (r3 != 0) goto L5f
            goto L61
        L5f:
            java.lang.String r0 = "DYHelperPetElfConsumer"
        L61:
            return r0
        L62:
            f80 r3 = (p000.f80) r3
            r4.getClass()
            r5.getClass()
            java.lang.Object r3 = r3.mo10(r4, r5, r6)
            return r3
    }
}
