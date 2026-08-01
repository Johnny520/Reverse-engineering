package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class jd1 implements java.util.Comparator {

    /* JADX INFO: renamed from: α */
    public final /* synthetic */ int f5432;

    /* JADX INFO: renamed from: β */
    public final /* synthetic */ java.lang.Object f5433;

    public /* synthetic */ jd1(int r1, java.lang.Object r2) {
            r0 = this;
            r0.f5432 = r1
            r0.f5433 = r2
            r0.<init>()
            return
    }

    public jd1(java.util.Comparator r2) {
            r1 = this;
            r0 = 2
            r1.f5432 = r0
            r1.<init>()
            r1.f5433 = r2
            return
    }

    @Override // java.util.Comparator
    public final int compare(java.lang.Object r4, java.lang.Object r5) {
            r3 = this;
            int r0 = r3.f5432
            switch(r0) {
                case 0: goto L161;
                case 1: goto L144;
                case 2: goto L12a;
                case 3: goto L10a;
                case 4: goto Ld7;
                case 5: goto Lb0;
                case 6: goto L7f;
                case 7: goto L6b;
                case 8: goto L45;
                case 9: goto L25;
                default: goto L5;
            }
        L5:
            java.lang.Object r3 = r3.f5433
            qy1 r3 = (p000.qy1) r3
            int r3 = r3.compare(r4, r5)
            if (r3 == 0) goto L10
            goto L24
        L10:
            e52 r4 = (p000.e52) r4
            long r3 = r4.f3417
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            e52 r5 = (p000.e52) r5
            long r4 = r5.f3417
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            int r3 = p000.AbstractC0073bd.m877(r3, r4)
        L24:
            return r3
        L25:
            java.lang.Object r3 = r3.f5433
            iz1 r3 = (p000.iz1) r3
            int r3 = r3.compare(r4, r5)
            if (r3 == 0) goto L30
            goto L44
        L30:
            ky1 r5 = (p000.ky1) r5
            int r3 = r5.f6326
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            ky1 r4 = (p000.ky1) r4
            int r4 = r4.f6326
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            int r3 = p000.AbstractC0073bd.m877(r3, r4)
        L44:
            return r3
        L45:
            java.lang.Object r3 = r3.f5433
            ib1 r3 = (p000.ib1) r3
            int r3 = r3.compare(r4, r5)
            if (r3 == 0) goto L50
            goto L6a
        L50:
            java.lang.reflect.Constructor r4 = (java.lang.reflect.Constructor) r4
            java.lang.Class[] r3 = r4.getParameterTypes()
            int r3 = r3.length
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.reflect.Constructor r5 = (java.lang.reflect.Constructor) r5
            java.lang.Class[] r4 = r5.getParameterTypes()
            int r4 = r4.length
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            int r3 = p000.AbstractC0073bd.m877(r3, r4)
        L6a:
            return r3
        L6b:
            java.lang.Object r3 = r3.f5433
            jd1 r3 = (p000.jd1) r3
            int r3 = r3.compare(r4, r5)
            if (r3 == 0) goto L76
            goto L7e
        L76:
            java.lang.String r4 = (java.lang.String) r4
            java.lang.String r5 = (java.lang.String) r5
            int r3 = p000.AbstractC0073bd.m877(r4, r5)
        L7e:
            return r3
        L7f:
            r0 = 2147483647(0x7fffffff, float:NaN)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r3 = r3.f5433
            int r4 = r3.indexOf(r4)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r4)
            r2 = 0
            if (r4 < 0) goto L96
            goto L97
        L96:
            r1 = r2
        L97:
            if (r1 == 0) goto L9a
            goto L9b
        L9a:
            r1 = r0
        L9b:
            java.lang.String r5 = (java.lang.String) r5
            int r3 = r3.indexOf(r5)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
            if (r3 < 0) goto La8
            r2 = r4
        La8:
            if (r2 == 0) goto Lab
            r0 = r2
        Lab:
            int r3 = p000.AbstractC0073bd.m877(r1, r0)
            return r3
        Lb0:
            java.lang.Object r3 = r3.f5433
            jd1 r3 = (p000.jd1) r3
            int r3 = r3.compare(r4, r5)
            if (r3 == 0) goto Lbb
            goto Ld6
        Lbb:
            java.lang.String r4 = (java.lang.String) r4
            java.lang.String r3 = "default"
            boolean r0 = p000.ln0.m3626(r4, r3)
            java.lang.String r1 = ""
            if (r0 == 0) goto Lc8
            r4 = r1
        Lc8:
            java.lang.String r5 = (java.lang.String) r5
            boolean r3 = p000.ln0.m3626(r5, r3)
            if (r3 == 0) goto Ld1
            goto Ld2
        Ld1:
            r1 = r5
        Ld2:
            int r3 = p000.AbstractC0073bd.m877(r4, r1)
        Ld6:
            return r3
        Ld7:
            r0 = 2147483647(0x7fffffff, float:NaN)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r3 = r3.f5433
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            int r4 = r3.indexOf(r4)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r4)
            r2 = 0
            if (r4 < 0) goto Lf0
            goto Lf1
        Lf0:
            r1 = r2
        Lf1:
            if (r1 == 0) goto Lf4
            goto Lf5
        Lf4:
            r1 = r0
        Lf5:
            java.lang.String r5 = (java.lang.String) r5
            int r3 = r3.indexOf(r5)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
            if (r3 < 0) goto L102
            r2 = r4
        L102:
            if (r2 == 0) goto L105
            r0 = r2
        L105:
            int r3 = p000.AbstractC0073bd.m877(r1, r0)
            return r3
        L10a:
            java.lang.Object r3 = r3.f5433
            jd1 r3 = (p000.jd1) r3
            int r3 = r3.compare(r4, r5)
            if (r3 == 0) goto L115
            goto L129
        L115:
            bs1 r4 = (p000.bs1) r4
            int r3 = r4.f1826
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            bs1 r5 = (p000.bs1) r5
            int r4 = r5.f1826
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            int r3 = p000.AbstractC0073bd.m877(r3, r4)
        L129:
            return r3
        L12a:
            java.lang.Object r3 = r3.f5433
            java.util.Comparator r3 = (java.util.Comparator) r3
            int r3 = r3.compare(r4, r5)
            if (r3 == 0) goto L135
            goto L143
        L135:
            bs1 r4 = (p000.bs1) r4
            yp0 r3 = r4.f1823
            bs1 r5 = (p000.bs1) r5
            yp0 r4 = r5.f1823
            o9 r5 = p000.yp0.f12723
            int r3 = r5.compare(r3, r4)
        L143:
            return r3
        L144:
            java.lang.reflect.Method r5 = (java.lang.reflect.Method) r5
            java.lang.Object r3 = r3.f5433
            cj1 r3 = (p000.cj1) r3
            int r5 = p000.cj1.m1216(r3, r5)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.lang.reflect.Method r4 = (java.lang.reflect.Method) r4
            int r3 = p000.cj1.m1216(r3, r4)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            int r3 = p000.AbstractC0073bd.m877(r5, r3)
            return r3
        L161:
            java.lang.Object r3 = r3.f5433
            ye r3 = (p000.C1018ye) r3
            int r3 = r3.compare(r4, r5)
            if (r3 == 0) goto L16c
            goto L180
        L16c:
            id1 r4 = (p000.id1) r4
            int r3 = r4.f5015
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            id1 r5 = (p000.id1) r5
            int r4 = r5.f5015
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            int r3 = p000.AbstractC0073bd.m877(r3, r4)
        L180:
            return r3
    }
}
