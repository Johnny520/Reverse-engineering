package r4;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class m implements java.util.Comparator {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f11447g;

    public /* synthetic */ m(int r1) {
            r0 = this;
            r0.f11447g = r1
            r0.<init>()
            return
    }

    @Override // java.util.Comparator
    public final int compare(java.lang.Object r6, java.lang.Object r7) {
            r5 = this;
            int r0 = r5.f11447g
            switch(r0) {
                case 0: goto Lfd;
                case 1: goto Lef;
                case 2: goto Lde;
                case 3: goto Lb9;
                case 4: goto L5e;
                case 5: goto L55;
                case 6: goto L1a;
                default: goto L5;
            }
        L5:
            ya.e r6 = (ya.e) r6
            float r6 = r6.f22379b
            java.lang.Float r6 = java.lang.Float.valueOf(r6)
            ya.e r7 = (ya.e) r7
            float r7 = r7.f22379b
            java.lang.Float r7 = java.lang.Float.valueOf(r7)
            int r6 = r6.compareTo(r7)
            return r6
        L1a:
            r0 = 2147483647(0x7fffffff, float:NaN)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            android.view.ViewGroup r6 = (android.view.ViewGroup) r6
            og.k r1 = ya.g.f22385e
            int r6 = uf.d.d(r6)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r6)
            r2 = 0
            r3 = 1
            if (r6 <= 0) goto L33
            r6 = r3
            goto L34
        L33:
            r6 = r2
        L34:
            r4 = 0
            if (r6 == 0) goto L38
            goto L39
        L38:
            r1 = r4
        L39:
            if (r1 == 0) goto L3c
            goto L3d
        L3c:
            r1 = r0
        L3d:
            android.view.ViewGroup r7 = (android.view.ViewGroup) r7
            int r6 = uf.d.d(r7)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r6)
            if (r6 <= 0) goto L4a
            r2 = r3
        L4a:
            if (r2 == 0) goto L4d
            r4 = r7
        L4d:
            if (r4 == 0) goto L50
            r0 = r4
        L50:
            int r6 = r1.compareTo(r0)
            return r6
        L55:
            java.lang.Comparable r6 = (java.lang.Comparable) r6
            java.lang.Comparable r7 = (java.lang.Comparable) r7
            int r6 = y7.a.c(r6, r7)
            return r6
        L5e:
            java.lang.reflect.Method r6 = (java.lang.reflect.Method) r6
            java.lang.reflect.Method r7 = (java.lang.reflect.Method) r7
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.Class r1 = r6.getDeclaringClass()
            r0.append(r1)
            java.lang.String r1 = r6.getName()
            r0.append(r1)
            java.lang.Class[] r1 = r6.getParameterTypes()
            java.lang.String r1 = java.util.Arrays.toString(r1)
            r0.append(r1)
            java.lang.Class r6 = r6.getReturnType()
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.Class r1 = r7.getDeclaringClass()
            r0.append(r1)
            java.lang.String r1 = r7.getName()
            r0.append(r1)
            java.lang.Class[] r1 = r7.getParameterTypes()
            java.lang.String r1 = java.util.Arrays.toString(r1)
            r0.append(r1)
            java.lang.Class r7 = r7.getReturnType()
            r0.append(r7)
            java.lang.String r7 = r0.toString()
            int r6 = r6.compareTo(r7)
            return r6
        Lb9:
            java.util.Map$Entry r6 = (java.util.Map.Entry) r6
            java.lang.Object r6 = r6.getValue()
            r8.d r6 = (r8.d) r6
            r8.c r6 = r6.f11608b
            int r6 = r6.f11606g
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            java.util.Map$Entry r7 = (java.util.Map.Entry) r7
            java.lang.Object r7 = r7.getValue()
            r8.d r7 = (r8.d) r7
            r8.c r7 = r7.f11608b
            int r7 = r7.f11606g
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            int r6 = r6.compareTo(r7)
            return r6
        Lde:
            r4.l0 r6 = (r4.l0) r6
            r4.l0 r7 = (r4.l0) r7
            r4.b0 r6 = r6.b()
            r4.b0 r7 = r7.b()
            int r6 = r6.compareTo(r7)
            return r6
        Lef:
            p4.n r6 = (p4.n) r6
            p4.n r7 = (p4.n) r7
            u4.o r6 = r6.f10217i
            int r6 = r6.f13400g
            u4.o r7 = r7.f10217i
            int r7 = r7.f13400g
            int r6 = r6 - r7
            return r6
        Lfd:
            p4.v r6 = (p4.v) r6
            p4.v r7 = (p4.v) r7
            int r6 = r6.f10234a
            int r7 = r7.f10234a
            int r6 = r6 - r7
            return r6
    }

    @Override // java.util.Comparator
    public boolean equals(java.lang.Object r2) {
            r1 = this;
            int r0 = r1.f11447g
            switch(r0) {
                case 0: goto L10;
                case 1: goto La;
                default: goto L5;
            }
        L5:
            boolean r2 = super.equals(r2)
            return r2
        La:
            if (r2 != r1) goto Le
            r2 = 1
            goto Lf
        Le:
            r2 = 0
        Lf:
            return r2
        L10:
            if (r2 != r1) goto L14
            r2 = 1
            goto L15
        L14:
            r2 = 0
        L15:
            return r2
    }
}
