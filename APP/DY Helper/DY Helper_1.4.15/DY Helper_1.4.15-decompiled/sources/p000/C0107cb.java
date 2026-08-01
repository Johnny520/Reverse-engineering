package p000;

/* JADX INFO: renamed from: cb */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0107cb implements p000.p70 {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ int f2042;

    /* JADX INFO: renamed from: ζ */
    public final /* synthetic */ java.lang.ClassLoader f2043;

    public /* synthetic */ C0107cb(java.lang.ClassLoader r1, int r2) {
            r0 = this;
            r0.f2042 = r2
            r0.f2043 = r1
            r0.<init>()
            return
    }

    @Override // p000.p70
    public final java.lang.Object invoke() {
            r9 = this;
            int r0 = r9.f2042
            java.lang.String r1 = "r398844d0f2b2fd7c"
            s62 r2 = p000.s62.f9751
            r3 = 1
            java.lang.ClassLoader r9 = r9.f2043
            switch(r0) {
                case 0: goto L170;
                case 1: goto L16c;
                case 2: goto L168;
                case 3: goto L162;
                case 4: goto L15c;
                case 5: goto L156;
                case 6: goto L150;
                case 7: goto L14a;
                case 8: goto L144;
                case 9: goto L13e;
                case 10: goto L138;
                case 11: goto L132;
                case 12: goto L12c;
                case 13: goto L126;
                case 14: goto L121;
                case 15: goto L11c;
                case 16: goto L117;
                case 17: goto L112;
                case 18: goto L10c;
                case 19: goto L106;
                case 20: goto L100;
                case 21: goto Lfa;
                case 22: goto Lf4;
                case 23: goto L55;
                case 24: goto L26;
                case 25: goto L20;
                case 26: goto L1c;
                case 27: goto L16;
                case 28: goto L10;
                default: goto Lc;
            }
        Lc:
            p000.m20.m3716(r9, r3)
            return r2
        L10:
            java.util.concurrent.atomic.AtomicBoolean r0 = p000.n10.f7350
            p000.n10.m3937(r9, r3)
            return r2
        L16:
            c10 r0 = p000.c10.f1928
            r0.m1102(r9, r3)
            return r2
        L1c:
            p000.u00.m5771(r9, r3)
            return r2
        L20:
            java.util.concurrent.atomic.AtomicBoolean r0 = p000.p00.f8376
            p000.p00.m4341(r9, r3)
            return r2
        L26:
            java.util.concurrent.atomic.AtomicReference r0 = p000.C0810st.f10011
            r0.set(r9)
            st r0 = p000.C0810st.f10010
            java.util.List r9 = r0.m5563(r9, r3)
            java.lang.Object r9 = p000.AbstractC0984xh.m6640(r9)
            java.lang.reflect.Method r9 = (java.lang.reflect.Method) r9
            if (r9 == 0) goto L54
            java.util.concurrent.atomic.AtomicReference r0 = p000.C0810st.f10012
            r0.set(r9)
            p000.C0810st.m5547(r9)
            java.lang.Class r0 = r9.getDeclaringClass()
            java.lang.String r0 = r0.getName()
            java.lang.String r9 = r9.getName()
            java.lang.String r3 = "预热完成 IMUserRepository 方法: "
            java.lang.String r4 = "#"
            p000.AbstractC0602nx.m4144(r3, r0, r4, r9, r1)
        L54:
            return r2
        L55:
            st r0 = p000.C0810st.f10010
            jz r0 = p000.C0450jz.f5672
            java.lang.String r2 = "~7940193404FAD3677C47B093370E147D326D0A3396452FC2BA97BAC59C5D71B155FA7E485537B953059726D5F9466F197DD5864992"
            java.lang.String r2 = p000.jf0.m2957(r2)     // Catch: java.lang.Throwable -> L89
            java.lang.Class r9 = p000.C0810st.m5543(r9, r2)     // Catch: java.lang.Throwable -> L89
            if (r9 != 0) goto L68
            r9 = r0
            goto Le4
        L68:
            java.lang.reflect.Method[] r9 = r9.getDeclaredMethods()     // Catch: java.lang.Throwable -> L89
            r9.getClass()     // Catch: java.lang.Throwable -> L89
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L89
            r2.<init>()     // Catch: java.lang.Throwable -> L89
            int r4 = r9.length     // Catch: java.lang.Throwable -> L89
            r5 = 0
        L76:
            if (r5 >= r4) goto L8e
            r6 = r9[r5]     // Catch: java.lang.Throwable -> L89
            r6.getClass()     // Catch: java.lang.Throwable -> L89
            int r7 = p000.C0810st.m5535(r6)     // Catch: java.lang.Throwable -> L89
            r8 = 2500(0x9c4, float:3.503E-42)
            if (r7 < r8) goto L8b
            r2.add(r6)     // Catch: java.lang.Throwable -> L89
            goto L8b
        L89:
            r9 = move-exception
            goto Lde
        L8b:
            int r5 = r5 + 1
            goto L76
        L8e:
            java.util.HashSet r9 = new java.util.HashSet     // Catch: java.lang.Throwable -> L89
            r9.<init>()     // Catch: java.lang.Throwable -> L89
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L89
            r4.<init>()     // Catch: java.lang.Throwable -> L89
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> L89
        L9c:
            boolean r5 = r2.hasNext()     // Catch: java.lang.Throwable -> L89
            if (r5 == 0) goto Lba
            java.lang.Object r5 = r2.next()     // Catch: java.lang.Throwable -> L89
            r6 = r5
            java.lang.reflect.Method r6 = (java.lang.reflect.Method) r6     // Catch: java.lang.Throwable -> L89
            r6.getClass()     // Catch: java.lang.Throwable -> L89
            java.lang.String r6 = p000.C0810st.m5561(r6)     // Catch: java.lang.Throwable -> L89
            boolean r6 = r9.add(r6)     // Catch: java.lang.Throwable -> L89
            if (r6 == 0) goto L9c
            r4.add(r5)     // Catch: java.lang.Throwable -> L89
            goto L9c
        Lba:
            tf r9 = new tf     // Catch: java.lang.Throwable -> L89
            st r2 = p000.C0810st.f10010     // Catch: java.lang.Throwable -> L89
            r2 = 27
            r9.<init>(r2)     // Catch: java.lang.Throwable -> L89
            java.util.List r9 = p000.AbstractC0984xh.m6658(r4, r9)     // Catch: java.lang.Throwable -> L89
            java.util.Iterator r2 = r9.iterator()     // Catch: java.lang.Throwable -> L89
        Lcb:
            boolean r4 = r2.hasNext()     // Catch: java.lang.Throwable -> L89
            if (r4 == 0) goto Le4
            java.lang.Object r4 = r2.next()     // Catch: java.lang.Throwable -> L89
            java.lang.reflect.Method r4 = (java.lang.reflect.Method) r4     // Catch: java.lang.Throwable -> L89
            r4.setAccessible(r3)     // Catch: java.lang.Throwable -> L89
            p000.C0810st.m5547(r4)     // Catch: java.lang.Throwable -> L89
            goto Lcb
        Lde:
            eo1 r2 = new eo1
            r2.<init>(r9)
            r9 = r2
        Le4:
            java.lang.Throwable r2 = p000.fo1.m2190(r9)
            if (r2 != 0) goto Lec
            r0 = r9
            goto Lf1
        Lec:
            java.lang.String r9 = "IMUserRepository 反射兜底失败"
            p000.C0888ux.m5977(r1, r9, r2)
        Lf1:
            java.util.List r0 = (java.util.List) r0
            return r0
        Lf4:
            jm r0 = p000.C0436jm.f5518
            r0.m2972(r9, r3)
            return r2
        Lfa:
            yl r0 = p000.C1025yl.f12669
            p000.C1025yl.m6934(r9, r3)
            return r2
        L100:
            yl r0 = p000.C1025yl.f12669
            p000.C1025yl.m6933(r9, r3)
            return r2
        L106:
            ql r0 = p000.C0728ql.f9031
            p000.C0728ql.m4906(r9, r3)
            return r2
        L10c:
            kk r0 = p000.C0472kk.f5953
            r0.m3305(r9, r3)
            return r2
        L112:
            s62 r9 = com.example.dyhelper.dexkit.hook.CommentBookmarkDexKitResolver.m1344(r9)
            return r9
        L117:
            s62 r9 = com.example.dyhelper.dexkit.hook.CommentBookmarkDexKitResolver.m1328(r9)
            return r9
        L11c:
            s62 r9 = com.example.dyhelper.dexkit.hook.CommentBookmarkDexKitResolver.m1343(r9)
            return r9
        L121:
            s62 r9 = com.example.dyhelper.dexkit.hook.CommentBookmarkDexKitResolver.m1336(r9)
            return r9
        L126:
            fj r0 = p000.C0287fj.f3949
            p000.C0287fj.m2112(r9, r3)
            return r2
        L12c:
            kh r0 = p000.C0469kh.f5917
            r0.m3267(r9, r3)
            return r2
        L132:
            kh r0 = p000.C0469kh.f5917
            r0.m3266(r9, r3)
            return r2
        L138:
            kh r0 = p000.C0469kh.f5917
            r0.m3265(r9, r3)
            return r2
        L13e:
            ag r0 = p000.C0017ag.f217
            r0.m108(r9, r3)
            return r2
        L144:
            af r0 = p000.C0016af.f205
            r0.m103(r9, r3)
            return r2
        L14a:
            bf r0 = p000.C0075bf.f1684
            r0.m953(r9, r3)
            return r2
        L150:
            java.util.List r0 = p000.C0903vb.f11215
            p000.C0903vb.m6158(r9, r3)
            return r2
        L156:
            java.util.List r0 = p000.C0903vb.f11215
            p000.C0903vb.m6157(r9, r3)
            return r2
        L15c:
            java.util.List r0 = p000.C0903vb.f11215
            p000.C0903vb.m6155(r9, r3)
            return r2
        L162:
            java.util.List r0 = p000.C0903vb.f11215
            p000.C0903vb.m6159(r9, r3)
            return r2
        L168:
            p000.AbstractC0279fb.m2085(r9, r3)
            return r2
        L16c:
            p000.AbstractC0279fb.m2086(r9, r3)
            return r2
        L170:
            p000.AbstractC0279fb.m2087(r9, r3)
            return r2
    }
}
