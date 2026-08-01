package p000;

/* JADX INFO: renamed from: jh */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C0431jh extends p000.m01 {

    /* JADX INFO: renamed from: α */
    public final /* synthetic */ boolean f5463;

    /* JADX INFO: renamed from: β */
    public final /* synthetic */ java.lang.String f5464;

    /* JADX INFO: renamed from: γ */
    public final /* synthetic */ java.lang.String f5465;

    public C0431jh(p000.C0469kh r1, boolean r2, java.lang.String r3, java.lang.String r4) {
            r0 = this;
            r0.f5463 = r2
            r0.f5464 = r3
            r0.f5465 = r4
            r0.<init>()
            return
    }

    @Override // p000.m01
    public final void afterHookedMethod(p000.k01 r7) {
            r6 = this;
            r7.getClass()
            java.lang.Object r7 = r7.f5691
            if (r7 != 0) goto L9
            goto Lb9
        L9:
            java.lang.Class r0 = r7.getClass()
            java.lang.String r1 = r0.getName()
            java.lang.String r2 = "~797C580CA5DD249BE32348A6895C8D359F04FEB9EADB6AFF22B532A4FB444E45EFE5413F312250C3EB77D079E4AFD3F67A87735342D1C21387EB"
            java.lang.String r2 = p000.jf0.m2957(r2)
            boolean r2 = r1.equals(r2)
            if (r2 != 0) goto L2e
            java.util.concurrent.ConcurrentHashMap$KeySetView r2 = p000.C0469kh.f5922
            boolean r2 = r2.contains(r1)
            if (r2 != 0) goto L2e
            java.lang.String r2 = "FeedPlayerWrapper"
            r3 = 0
            boolean r1 = p000.q02.m4654(r1, r2, r3)
            if (r1 == 0) goto Lb9
        L2e:
            hh r1 = p000.C0469kh.f5923
            r2 = 0
            if (r1 == 0) goto L3a
            java.lang.ref.WeakReference r1 = r1.f4731
            java.lang.Object r1 = r1.get()
            goto L3b
        L3a:
            r1 = r2
        L3b:
            if (r1 != r7) goto L3f
            goto Lb9
        L3f:
            java.lang.reflect.Method[] r1 = r0.getMethods()
            r1.getClass()
            ss1 r1 = p000.AbstractC0312g7.m2232(r1)
            java.lang.reflect.Method[] r3 = r0.getDeclaredMethods()
            r3.getClass()
            ss1 r3 = p000.AbstractC0312g7.m2232(r3)
            c40 r1 = p000.us1.m5946(r1, r3)
            we r3 = new we
            r4 = 28
            r3.<init>(r4)
            y30 r4 = new y30
            r5 = 1
            r4.<init>(r1, r5, r3)
            gh r1 = new gh
            r3 = 2
            r1.<init>(r3)
            bu r3 = new bu
            java.util.Iterator r4 = r4.iterator()
            r3.<init>(r4, r1)
            boolean r1 = r3.hasNext()
            if (r1 != 0) goto L7c
            goto L86
        L7c:
            java.lang.Object r1 = r3.next()
            boolean r3 = r3.hasNext()
            if (r3 == 0) goto L87
        L86:
            r1 = r2
        L87:
            java.lang.reflect.Method r1 = (java.lang.reflect.Method) r1
            if (r1 == 0) goto L8f
            r1.setAccessible(r5)
            r2 = r1
        L8f:
            if (r2 != 0) goto L92
            goto Lb9
        L92:
            hh r1 = new hh
            java.lang.ref.WeakReference r3 = new java.lang.ref.WeakReference
            r3.<init>(r7)
            java.lang.String r7 = "getCurrentPosition"
            java.lang.reflect.Method r7 = p000.C0469kh.m3251(r0, r7)
            java.lang.String r4 = "getDuration"
            java.lang.reflect.Method r4 = p000.C0469kh.m3251(r0, r4)
            r1.<init>(r3, r2, r7, r4)
            p000.C0469kh.f5923 = r1
            java.lang.String r7 = r0.getName()
            java.lang.String r0 = "rc7ea2edd7e9fe797"
            java.lang.String r7 = r0.concat(r7)
            java.lang.String r0 = "rc90e47ff78acb49f"
            p000.C0888ux.m5975(r0, r7)
        Lb9:
            tg r7 = p000.AbstractC0871ug.f10771
            boolean r7 = r6.f5463
            java.lang.String r0 = r6.f5464
            java.lang.String r6 = r6.f5465
            java.lang.String r1 = ": "
            java.lang.String r6 = p000.lz1.m3688(r0, r1, r6)
            android.os.Handler r0 = p000.AbstractC0871ug.f10780
            jg r1 = new jg
            r1.<init>(r6, r7)
            r0.post(r1)
            return
    }
}
