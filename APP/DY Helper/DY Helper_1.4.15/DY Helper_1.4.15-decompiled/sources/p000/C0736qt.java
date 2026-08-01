package p000;

/* JADX INFO: renamed from: qt */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C0736qt implements java.util.Comparator {

    /* JADX INFO: renamed from: α */
    public final /* synthetic */ int f9099;

    public /* synthetic */ C0736qt(int r1) {
            r0 = this;
            r0.f9099 = r1
            r0.<init>()
            return
    }

    public /* synthetic */ C0736qt(int r1, java.lang.Object r2) {
            r0 = this;
            r0.f9099 = r1
            r0.<init>()
            return
    }

    @Override // java.util.Comparator
    public final int compare(java.lang.Object r14, java.lang.Object r15) {
            r13 = this;
            int r13 = r13.f9099
            r0 = 0
            r1 = 1
            switch(r13) {
                case 0: goto L3b3;
                case 1: goto L38a;
                case 2: goto L361;
                case 3: goto L346;
                case 4: goto L32d;
                case 5: goto L314;
                case 6: goto L2f3;
                case 7: goto L2d2;
                case 8: goto L2b1;
                case 9: goto L298;
                case 10: goto L287;
                case 11: goto L276;
                case 12: goto L25d;
                case 13: goto L244;
                case 14: goto L22b;
                case 15: goto L21a;
                case 16: goto L1f5;
                case 17: goto L1dc;
                case 18: goto L1bb;
                case 19: goto L186;
                case 20: goto L169;
                case 21: goto L154;
                case 22: goto L137;
                case 23: goto L122;
                case 24: goto L10d;
                case 25: goto L7b;
                case 26: goto L5a;
                case 27: goto L45;
                case 28: goto L30;
                default: goto L7;
            }
        L7:
            java.lang.reflect.Method r15 = (java.lang.reflect.Method) r15
            vh0 r13 = p000.vh0.f11270
            java.lang.String r13 = r15.getName()
            r13.getClass()
            int r13 = p000.vh0.m6220(r13)
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            java.lang.reflect.Method r14 = (java.lang.reflect.Method) r14
            java.lang.String r14 = r14.getName()
            r14.getClass()
            int r14 = p000.vh0.m6220(r14)
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            int r13 = p000.AbstractC0073bd.m877(r13, r14)
            return r13
        L30:
            th0 r15 = (p000.th0) r15
            long r0 = r15.f10380
            java.lang.Long r13 = java.lang.Long.valueOf(r0)
            th0 r14 = (p000.th0) r14
            long r14 = r14.f10380
            java.lang.Long r14 = java.lang.Long.valueOf(r14)
            int r13 = p000.AbstractC0073bd.m877(r13, r14)
            return r13
        L45:
            th0 r15 = (p000.th0) r15
            long r0 = r15.f10380
            java.lang.Long r13 = java.lang.Long.valueOf(r0)
            th0 r14 = (p000.th0) r14
            long r14 = r14.f10380
            java.lang.Long r14 = java.lang.Long.valueOf(r14)
            int r13 = p000.AbstractC0073bd.m877(r13, r14)
            return r13
        L5a:
            nh0 r13 = p000.nh0.f7619
            java.lang.String r13 = "getCreatedAt"
            long r0 = p000.nh0.m4049(r14, r13)
            long r0 = p000.nh0.m4061(r0)
            java.lang.Long r14 = java.lang.Long.valueOf(r0)
            long r0 = p000.nh0.m4049(r15, r13)
            long r0 = p000.nh0.m4061(r0)
            java.lang.Long r13 = java.lang.Long.valueOf(r0)
            int r13 = p000.AbstractC0073bd.m877(r14, r13)
            return r13
        L7b:
            java.lang.reflect.Field r14 = (java.lang.reflect.Field) r14
            java.lang.String r13 = r14.getName()
            r14 = 10
            java.lang.String r2 = "B"
            r3 = 2
            java.lang.String r4 = "A1"
            java.lang.String r5 = "x1"
            r6 = 3
            java.lang.String r7 = "y1"
            r8 = 3800(0xed8, float:5.325E-42)
            r9 = 3769(0xeb9, float:5.281E-42)
            r10 = 2064(0x810, float:2.892E-42)
            r11 = 66
            if (r13 == 0) goto Lc8
            int r12 = r13.hashCode()
            if (r12 == r11) goto Lbf
            if (r12 == r10) goto Lb6
            if (r12 == r9) goto Lad
            if (r12 == r8) goto La4
            goto Lc8
        La4:
            boolean r13 = r13.equals(r7)
            if (r13 != 0) goto Lab
            goto Lc8
        Lab:
            r13 = r6
            goto Lc9
        Lad:
            boolean r13 = r13.equals(r5)
            if (r13 != 0) goto Lb4
            goto Lc8
        Lb4:
            r13 = r1
            goto Lc9
        Lb6:
            boolean r13 = r13.equals(r4)
            if (r13 != 0) goto Lbd
            goto Lc8
        Lbd:
            r13 = r3
            goto Lc9
        Lbf:
            boolean r13 = r13.equals(r2)
            if (r13 != 0) goto Lc6
            goto Lc8
        Lc6:
            r13 = r0
            goto Lc9
        Lc8:
            r13 = r14
        Lc9:
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            java.lang.reflect.Field r15 = (java.lang.reflect.Field) r15
            java.lang.String r15 = r15.getName()
            if (r15 == 0) goto L103
            int r12 = r15.hashCode()
            if (r12 == r11) goto Lfd
            if (r12 == r10) goto Lf4
            if (r12 == r9) goto Leb
            if (r12 == r8) goto Le2
            goto L103
        Le2:
            boolean r15 = r15.equals(r7)
            if (r15 != 0) goto Le9
            goto L103
        Le9:
            r0 = r6
            goto L104
        Leb:
            boolean r15 = r15.equals(r5)
            if (r15 != 0) goto Lf2
            goto L103
        Lf2:
            r0 = r1
            goto L104
        Lf4:
            boolean r15 = r15.equals(r4)
            if (r15 != 0) goto Lfb
            goto L103
        Lfb:
            r0 = r3
            goto L104
        Lfd:
            boolean r15 = r15.equals(r2)
            if (r15 != 0) goto L104
        L103:
            r0 = r14
        L104:
            java.lang.Integer r14 = java.lang.Integer.valueOf(r0)
            int r13 = p000.AbstractC0073bd.m877(r13, r14)
            return r13
        L10d:
            g8 r14 = (p000.C0313g8) r14
            int r13 = r14.f4267
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            g8 r15 = (p000.C0313g8) r15
            int r14 = r15.f4267
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            int r13 = p000.AbstractC0073bd.m877(r13, r14)
            return r13
        L122:
            xd0 r14 = (p000.xd0) r14
            long r13 = r14.f12138
            java.lang.Long r13 = java.lang.Long.valueOf(r13)
            xd0 r15 = (p000.xd0) r15
            long r14 = r15.f12138
            java.lang.Long r14 = java.lang.Long.valueOf(r14)
            int r13 = p000.AbstractC0073bd.m877(r13, r14)
            return r13
        L137:
            xd0 r14 = (p000.xd0) r14
            java.lang.String r13 = r14.f12137
            java.util.Locale r14 = java.util.Locale.ROOT
            java.lang.String r13 = p000.AbstractC0602nx.m4134(r14, r13, r14)
            xd0 r15 = (p000.xd0) r15
            java.lang.String r15 = r15.f12137
            r14.getClass()
            java.lang.String r14 = r15.toLowerCase(r14)
            r14.getClass()
            int r13 = p000.AbstractC0073bd.m877(r13, r14)
            return r13
        L154:
            ic0 r15 = (p000.ic0) r15
            long r0 = r15.f4997
            java.lang.Long r13 = java.lang.Long.valueOf(r0)
            ic0 r14 = (p000.ic0) r14
            long r14 = r14.f4997
            java.lang.Long r14 = java.lang.Long.valueOf(r14)
            int r13 = p000.AbstractC0073bd.m877(r13, r14)
            return r13
        L169:
            uw0 r14 = (p000.uw0) r14
            java.lang.String r13 = r14.f10972
            java.util.Locale r14 = java.util.Locale.ROOT
            java.lang.String r13 = r13.toLowerCase(r14)
            r13.getClass()
            uw0 r15 = (p000.uw0) r15
            java.lang.String r15 = r15.f10972
            java.lang.String r14 = r15.toLowerCase(r14)
            r14.getClass()
            int r13 = p000.AbstractC0073bd.m877(r13, r14)
            return r13
        L186:
            c90 r14 = (p000.c90) r14
            c90 r15 = (p000.c90) r15
            androidx.recyclerview.widget.RecyclerView r13 = r14.f2014
            if (r13 != 0) goto L190
            r2 = r1
            goto L191
        L190:
            r2 = r0
        L191:
            androidx.recyclerview.widget.RecyclerView r3 = r15.f2014
            if (r3 != 0) goto L197
            r3 = r1
            goto L198
        L197:
            r3 = r0
        L198:
            if (r2 == r3) goto L19d
            if (r13 != 0) goto L1a5
            goto L1a7
        L19d:
            boolean r13 = r14.f2011
            boolean r2 = r15.f2011
            if (r13 == r2) goto L1a9
            if (r13 == 0) goto L1a7
        L1a5:
            r0 = -1
            goto L1ba
        L1a7:
            r0 = r1
            goto L1ba
        L1a9:
            int r13 = r15.f2012
            int r1 = r14.f2012
            int r13 = r13 - r1
            if (r13 == 0) goto L1b2
        L1b0:
            r0 = r13
            goto L1ba
        L1b2:
            int r13 = r14.f2013
            int r14 = r15.f2013
            int r13 = r13 - r14
            if (r13 == 0) goto L1ba
            goto L1b0
        L1ba:
            return r0
        L1bb:
            java.lang.reflect.Method r15 = (java.lang.reflect.Method) r15
            java.util.concurrent.atomic.AtomicBoolean r13 = p000.h30.f4556
            r15.getClass()
            int r13 = p000.h30.m2351(r15)
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            java.lang.reflect.Method r14 = (java.lang.reflect.Method) r14
            r14.getClass()
            int r14 = p000.h30.m2351(r14)
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            int r13 = p000.AbstractC0073bd.m877(r13, r14)
            return r13
        L1dc:
            java.lang.reflect.Method r15 = (java.lang.reflect.Method) r15
            int r13 = p000.h30.m2351(r15)
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            java.lang.reflect.Method r14 = (java.lang.reflect.Method) r14
            int r14 = p000.h30.m2351(r14)
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            int r13 = p000.AbstractC0073bd.m877(r13, r14)
            return r13
        L1f5:
            java.lang.reflect.Method r14 = (java.lang.reflect.Method) r14
            java.lang.String r13 = r14.getName()
            java.lang.String r14 = "id"
            boolean r13 = p000.ln0.m3626(r13, r14)
            r13 = r13 ^ r1
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            java.lang.reflect.Method r15 = (java.lang.reflect.Method) r15
            java.lang.String r15 = r15.getName()
            boolean r14 = p000.ln0.m3626(r15, r14)
            r14 = r14 ^ r1
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            int r13 = p000.AbstractC0073bd.m877(r13, r14)
            return r13
        L21a:
            d62 r15 = (p000.d62) r15
            java.lang.Object r13 = r15.f2928
            java.lang.Integer r13 = (java.lang.Integer) r13
            d62 r14 = (p000.d62) r14
            java.lang.Object r14 = r14.f2928
            java.lang.Integer r14 = (java.lang.Integer) r14
            int r13 = p000.AbstractC0073bd.m877(r13, r14)
            return r13
        L22b:
            java.lang.reflect.Method r15 = (java.lang.reflect.Method) r15
            int r13 = p000.n10.m3932(r15)
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            java.lang.reflect.Method r14 = (java.lang.reflect.Method) r14
            int r14 = p000.n10.m3932(r14)
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            int r13 = p000.AbstractC0073bd.m877(r13, r14)
            return r13
        L244:
            e10 r15 = (p000.e10) r15
            int r13 = r15.mo1833()
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            e10 r14 = (p000.e10) r14
            int r14 = r14.mo1833()
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            int r13 = p000.AbstractC0073bd.m877(r13, r14)
            return r13
        L25d:
            java.lang.reflect.Method r15 = (java.lang.reflect.Method) r15
            int r13 = p000.c10.m1101(r15)
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            java.lang.reflect.Method r14 = (java.lang.reflect.Method) r14
            int r14 = p000.c10.m1101(r14)
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            int r13 = p000.AbstractC0073bd.m877(r13, r14)
            return r13
        L276:
            d62 r15 = (p000.d62) r15
            java.lang.Object r13 = r15.f2928
            java.lang.Integer r13 = (java.lang.Integer) r13
            d62 r14 = (p000.d62) r14
            java.lang.Object r14 = r14.f2928
            java.lang.Integer r14 = (java.lang.Integer) r14
            int r13 = p000.AbstractC0073bd.m877(r13, r14)
            return r13
        L287:
            l91 r15 = (p000.l91) r15
            java.lang.Object r13 = r15.f6503
            java.lang.Integer r13 = (java.lang.Integer) r13
            l91 r14 = (p000.l91) r14
            java.lang.Object r14 = r14.f6503
            java.lang.Integer r14 = (java.lang.Integer) r14
            int r13 = p000.AbstractC0073bd.m877(r13, r14)
            return r13
        L298:
            java.lang.reflect.Method r15 = (java.lang.reflect.Method) r15
            int r13 = p000.p00.m4340(r15)
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            java.lang.reflect.Method r14 = (java.lang.reflect.Method) r14
            int r14 = p000.p00.m4340(r14)
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            int r13 = p000.AbstractC0073bd.m877(r13, r14)
            return r13
        L2b1:
            java.lang.Class r15 = (java.lang.Class) r15
            java.util.concurrent.atomic.AtomicBoolean r13 = p000.p00.f8376
            r15.getClass()
            int r13 = p000.p00.m4342(r15)
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            java.lang.Class r14 = (java.lang.Class) r14
            r14.getClass()
            int r14 = p000.p00.m4342(r14)
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            int r13 = p000.AbstractC0073bd.m877(r13, r14)
            return r13
        L2d2:
            java.lang.reflect.Method r15 = (java.lang.reflect.Method) r15
            java.util.concurrent.atomic.AtomicBoolean r13 = p000.p00.f8376
            r15.getClass()
            int r13 = p000.p00.m4340(r15)
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            java.lang.reflect.Method r14 = (java.lang.reflect.Method) r14
            r14.getClass()
            int r14 = p000.p00.m4340(r14)
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            int r13 = p000.AbstractC0073bd.m877(r13, r14)
            return r13
        L2f3:
            ql0 r14 = (p000.ql0) r14
            java.lang.Object r13 = r14.f9046
            java.lang.String r13 = (java.lang.String) r13
            int r13 = p000.kn0.m3342(r13)
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            ql0 r15 = (p000.ql0) r15
            java.lang.Object r14 = r15.f9046
            java.lang.String r14 = (java.lang.String) r14
            int r14 = p000.kn0.m3342(r14)
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            int r13 = p000.AbstractC0073bd.m877(r13, r14)
            return r13
        L314:
            java.lang.reflect.Method r15 = (java.lang.reflect.Method) r15
            int r13 = p000.C0810st.m5535(r15)
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            java.lang.reflect.Method r14 = (java.lang.reflect.Method) r14
            int r14 = p000.C0810st.m5535(r14)
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            int r13 = p000.AbstractC0073bd.m877(r13, r14)
            return r13
        L32d:
            java.lang.reflect.Method r15 = (java.lang.reflect.Method) r15
            int r13 = p000.C0810st.m5535(r15)
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            java.lang.reflect.Method r14 = (java.lang.reflect.Method) r14
            int r14 = p000.C0810st.m5535(r14)
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            int r13 = p000.AbstractC0073bd.m877(r13, r14)
            return r13
        L346:
            java.lang.reflect.Method r15 = (java.lang.reflect.Method) r15
            st r13 = p000.C0810st.f10010
            int r13 = p000.C0810st.m5535(r15)
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            java.lang.reflect.Method r14 = (java.lang.reflect.Method) r14
            int r14 = p000.C0810st.m5535(r14)
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            int r13 = p000.AbstractC0073bd.m877(r13, r14)
            return r13
        L361:
            java.lang.reflect.Field r15 = (java.lang.reflect.Field) r15
            st r13 = p000.C0810st.f10010
            java.lang.String r13 = r15.getName()
            r13.getClass()
            int r13 = p000.C0810st.m5536(r13)
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            java.lang.reflect.Field r14 = (java.lang.reflect.Field) r14
            java.lang.String r14 = r14.getName()
            r14.getClass()
            int r14 = p000.C0810st.m5536(r14)
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            int r13 = p000.AbstractC0073bd.m877(r13, r14)
            return r13
        L38a:
            java.lang.reflect.Method r15 = (java.lang.reflect.Method) r15
            st r13 = p000.C0810st.f10010
            java.lang.String r13 = r15.getName()
            r13.getClass()
            int r13 = p000.C0810st.m5536(r13)
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            java.lang.reflect.Method r14 = (java.lang.reflect.Method) r14
            java.lang.String r14 = r14.getName()
            r14.getClass()
            int r14 = p000.C0810st.m5536(r14)
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            int r13 = p000.AbstractC0073bd.m877(r13, r14)
            return r13
        L3b3:
            java.lang.reflect.Constructor r14 = (java.lang.reflect.Constructor) r14
            java.lang.Class[] r13 = r14.getParameterTypes()
            int r13 = r13.length
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            java.lang.reflect.Constructor r15 = (java.lang.reflect.Constructor) r15
            java.lang.Class[] r14 = r15.getParameterTypes()
            int r14 = r14.length
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            int r13 = p000.AbstractC0073bd.m877(r13, r14)
            return r13
    }
}
