package p000;

/* JADX INFO: renamed from: rt */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C0773rt implements java.util.Comparator {

    /* JADX INFO: renamed from: α */
    public final /* synthetic */ int f9484;

    /* JADX INFO: renamed from: β */
    public final /* synthetic */ java.lang.Class f9485;

    public /* synthetic */ C0773rt(java.lang.Class r1, int r2) {
            r0 = this;
            r0.f9484 = r2
            r0.f9485 = r1
            r0.<init>()
            return
    }

    @Override // java.util.Comparator
    public final int compare(java.lang.Object r7, java.lang.Object r8) {
            r6 = this;
            int r0 = r6.f9484
            java.lang.Class r6 = r6.f9485
            switch(r0) {
                case 0: goto L22;
                default: goto L7;
            }
        L7:
            java.lang.reflect.Method r8 = (java.lang.reflect.Method) r8
            wi0 r0 = p000.wi0.f11726
            int r8 = p000.wi0.m6391(r6, r8)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            java.lang.reflect.Method r7 = (java.lang.reflect.Method) r7
            int r6 = p000.wi0.m6391(r6, r7)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            int r6 = p000.AbstractC0073bd.m877(r8, r6)
            return r6
        L22:
            java.lang.reflect.Method r8 = (java.lang.reflect.Method) r8
            r0 = 5000(0x1388, float:7.006E-42)
            r1 = 0
            if (r6 == 0) goto L35
            java.lang.Class r2 = r8.getReturnType()
            boolean r2 = r6.isAssignableFrom(r2)
            if (r2 == 0) goto L35
            r2 = r0
            goto L36
        L35:
            r2 = r1
        L36:
            java.lang.String r8 = r8.getName()
            r8.getClass()
            java.util.Locale r3 = java.util.Locale.ROOT
            java.lang.String r8 = r8.toLowerCase(r3)
            r8.getClass()
            java.lang.String r4 = "build"
            boolean r5 = p000.q02.m4654(r8, r4, r1)
            if (r5 == 0) goto L50
            int r2 = r2 + 1000
        L50:
            java.lang.String r5 = "liz"
            boolean r8 = r8.equals(r5)
            if (r8 == 0) goto L5a
            int r2 = r2 + 500
        L5a:
            java.lang.Integer r8 = java.lang.Integer.valueOf(r2)
            java.lang.reflect.Method r7 = (java.lang.reflect.Method) r7
            if (r6 == 0) goto L6d
            java.lang.Class r2 = r7.getReturnType()
            boolean r6 = r6.isAssignableFrom(r2)
            if (r6 == 0) goto L6d
            goto L6e
        L6d:
            r0 = r1
        L6e:
            java.lang.String r6 = r7.getName()
            r6.getClass()
            java.lang.String r6 = r6.toLowerCase(r3)
            r6.getClass()
            boolean r7 = p000.q02.m4654(r6, r4, r1)
            if (r7 == 0) goto L84
            int r0 = r0 + 1000
        L84:
            boolean r6 = r6.equals(r5)
            if (r6 == 0) goto L8c
            int r0 = r0 + 500
        L8c:
            java.lang.Integer r6 = java.lang.Integer.valueOf(r0)
            int r6 = p000.AbstractC0073bd.m877(r8, r6)
            return r6
    }
}
