package p000;

/* JADX INFO: renamed from: zd */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1054zd implements p000.f80 {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ int f13041;

    /* JADX INFO: renamed from: ζ */
    public final /* synthetic */ java.lang.Object f13042;

    public /* synthetic */ C1054zd(int r1, java.lang.Object r2) {
            r0 = this;
            r0.f13041 = r1
            r0.f13042 = r2
            r0.<init>()
            return
    }

    public /* synthetic */ C1054zd(p000.r21 r1, p000.q21 r2) {
            r0 = this;
            r2 = 1
            r0.f13041 = r2
            r0.<init>()
            r0.f13042 = r1
            return
    }

    @Override // p000.f80
    /* JADX INFO: renamed from: α */
    public final java.lang.Object mo10(java.lang.Object r7, java.lang.Object r8, java.lang.Object r9) {
            r6 = this;
            int r0 = r6.f13041
            java.lang.Object r6 = r6.f13042
            switch(r0) {
                case 0: goto Lc8;
                case 1: goto Lb6;
                case 2: goto Laa;
                case 3: goto L50;
                default: goto L7;
            }
        L7:
            la2 r6 = (p000.la2) r6
            android.net.Uri r7 = (android.net.Uri) r7
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Long r9 = (java.lang.Long) r9
            long r4 = r9.longValue()
            r9 = 0
            if (r7 == 0) goto L42
            java.lang.String r1 = r7.toString()
            r1.getClass()
            if (r8 == 0) goto L2c
            boolean r0 = p000.q02.m4671(r8)
            if (r0 != 0) goto L26
            goto L27
        L26:
            r8 = r9
        L27:
            if (r8 != 0) goto L2a
            goto L2c
        L2a:
            r2 = r8
            goto L35
        L2c:
            java.lang.String r8 = r7.getLastPathSegment()
            if (r8 != 0) goto L2a
            java.lang.String r8 = "音频文件"
            goto L2a
        L35:
            java.lang.String r3 = r7.toString()
            r3.getClass()
            qa2 r0 = new qa2
            r0.<init>(r1, r2, r3, r4)
            r9 = r0
        L42:
            android.os.Handler r7 = p000.ib2.f4982
            ka2 r8 = new ka2
            r0 = 0
            r8.<init>(r6, r0, r9)
            r7.post(r8)
        L4d:
            s62 r6 = p000.s62.f9751
            return r6
        L50:
            ic r6 = (p000.C0391ic) r6
            java.lang.Long r7 = (java.lang.Long) r7
            long r0 = r7.longValue()
            java.lang.Long r8 = (java.lang.Long) r8
            long r7 = r8.longValue()
            java.lang.String r9 = (java.lang.String) r9
            r9.getClass()
            r2 = 0
            int r9 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            java.lang.String r2 = "正在下载 "
            if (r9 <= 0) goto L8a
            r9 = 100
            long r3 = (long) r9
            long r0 = r0 * r3
            long r0 = r0 / r7
            int r7 = (int) r0
            java.lang.Integer r8 = java.lang.Integer.valueOf(r7)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>(r2)
            r9.append(r7)
            java.lang.String r7 = "%"
            r9.append(r7)
            java.lang.String r7 = r9.toString()
            r6.invoke(r8, r7)
            goto La7
        L8a:
            r7 = 0
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r8 = 1024(0x400, float:1.435E-42)
            long r8 = (long) r8
            long r0 = r0 / r8
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>(r2)
            r8.append(r0)
            java.lang.String r9 = " KB"
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            r6.invoke(r7, r8)
        La7:
            s62 r6 = p000.s62.f9751
            return r6
        Laa:
            ns1 r6 = (p000.ns1) r6
            java.lang.Throwable r7 = (java.lang.Throwable) r7
            s62 r8 = (p000.s62) r8
            up r9 = (p000.InterfaceC0880up) r9
            r6.m4095()
            goto L4d
        Lb6:
            r21 r6 = (p000.r21) r6
            java.lang.Throwable r7 = (java.lang.Throwable) r7
            s62 r8 = (p000.s62) r8
            up r9 = (p000.InterfaceC0880up) r9
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r7 = p000.r21.f9237
            r8 = 0
            r7.set(r6, r8)
            r6.m5054(r8)
            goto L4d
        Lc8:
            θ r6 = (p000.C1085) r6
            java.lang.Throwable r7 = (java.lang.Throwable) r7
            up r9 = (p000.InterfaceC0880up) r9
            r6.invoke(r7)
            goto L4d
    }
}
