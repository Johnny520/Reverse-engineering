package p000;

/* JADX INFO: renamed from: xi */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0985xi implements p000.p70 {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ int f12176;

    /* JADX INFO: renamed from: ζ */
    public final /* synthetic */ org.luckypray.dexkit.DexKitBridge f12177;

    /* JADX INFO: renamed from: η */
    public final /* synthetic */ java.lang.String f12178;

    /* JADX INFO: renamed from: θ */
    public final /* synthetic */ java.lang.ClassLoader f12179;

    public /* synthetic */ C0985xi(org.luckypray.dexkit.DexKitBridge r1, java.lang.String r2, java.lang.ClassLoader r3, int r4) {
            r0 = this;
            r0.f12176 = r4
            r0.f12177 = r1
            r0.f12178 = r2
            r0.f12179 = r3
            r0.<init>()
            return
    }

    @Override // p000.p70
    public final java.lang.Object invoke() {
            r4 = this;
            int r0 = r4.f12176
            switch(r0) {
                case 0: goto L67;
                case 1: goto L36;
                default: goto L5;
            }
        L5:
            s9 r0 = new s9
            r1 = 27
            java.lang.String r2 = r4.f12178
            r0.<init>(r2, r1)
            org.luckypray.dexkit.DexKitBridge r1 = r4.f12177
            org.luckypray.dexkit.result.MethodDataList r0 = r1.findMethod(r0)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r0 = r0.iterator()
        L1d:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L35
            java.lang.Object r2 = r0.next()
            org.luckypray.dexkit.result.MethodData r2 = (org.luckypray.dexkit.result.MethodData) r2
            java.lang.ClassLoader r3 = r4.f12179
            java.lang.reflect.Method r2 = r2.getMethodInstance(r3)
            if (r2 == 0) goto L1d
            r1.add(r2)
            goto L1d
        L35:
            return r1
        L36:
            s9 r0 = new s9
            r1 = 28
            java.lang.String r2 = r4.f12178
            r0.<init>(r2, r1)
            org.luckypray.dexkit.DexKitBridge r1 = r4.f12177
            org.luckypray.dexkit.result.MethodDataList r0 = r1.findMethod(r0)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r0 = r0.iterator()
        L4e:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L66
            java.lang.Object r2 = r0.next()
            org.luckypray.dexkit.result.MethodData r2 = (org.luckypray.dexkit.result.MethodData) r2
            java.lang.ClassLoader r3 = r4.f12179
            java.lang.reflect.Method r2 = r2.getMethodInstance(r3)
            if (r2 == 0) goto L4e
            r1.add(r2)
            goto L4e
        L66:
            return r1
        L67:
            java.lang.ClassLoader r0 = r4.f12179
            s9 r1 = new s9
            r2 = 5
            java.lang.String r3 = r4.f12178
            r1.<init>(r3, r2)
            org.luckypray.dexkit.DexKitBridge r4 = r4.f12177
            org.luckypray.dexkit.result.MethodDataList r4 = r4.findMethod(r1)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r4 = r4.iterator()
        L80:
            boolean r2 = r4.hasNext()
            if (r2 == 0) goto La5
            java.lang.Object r2 = r4.next()
            org.luckypray.dexkit.result.MethodData r2 = (org.luckypray.dexkit.result.MethodData) r2
            java.lang.reflect.Method r2 = r2.getMethodInstance(r0)     // Catch: java.lang.Throwable -> L91
            goto L98
        L91:
            r2 = move-exception
            eo1 r3 = new eo1
            r3.<init>(r2)
            r2 = r3
        L98:
            boolean r3 = r2 instanceof p000.eo1
            if (r3 == 0) goto L9d
            r2 = 0
        L9d:
            java.lang.reflect.Method r2 = (java.lang.reflect.Method) r2
            if (r2 == 0) goto L80
            r1.add(r2)
            goto L80
        La5:
            return r1
    }
}
