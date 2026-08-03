package a;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class Qb implements a.InterfaceC0369s7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f230a;
    public final /* synthetic */ java.lang.ClassLoader b;

    public /* synthetic */ Qb(int r1, java.lang.ClassLoader r2) {
            r0 = this;
            r0.f230a = r1
            r0.b = r2
            r0.<init>()
            return
    }

    @Override // a.InterfaceC0369s7
    public final java.lang.Object a() {
            r5 = this;
            int r0 = r5.f230a
            switch(r0) {
                case 0: goto L32;
                default: goto L5;
            }
        L5:
            java.lang.String r0 = "com.tencent.mm.plugin.voip.model.e0"
            java.lang.String r1 = "com.tencent.mm.plugin.voip.model.c0"
            java.lang.String r2 = "com.tencent.mm.plugin.voip.model.NewVoipIncomingCallManager"
            java.lang.String r3 = "com.tencent.mm.plugin.voip.model.VoipIncomingCallManager"
            java.lang.String r4 = "com.tencent.mm.plugin.voip.model.n"
            java.lang.String[] r0 = new java.lang.String[]{r2, r3, r4, r0, r1}
            java.util.List r0 = a.C0294o3.d0(r0)
            java.util.Iterator r0 = r0.iterator()
        L1b:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L30
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.ClassLoader r2 = r5.b
            java.lang.Class r1 = a.A1.b(r2, r1)
            if (r1 == 0) goto L1b
            goto L31
        L30:
            r1 = 0
        L31:
            return r1
        L32:
            java.lang.String r0 = "com.tencent.mm.plugin.voip.model.b2"
            java.lang.String r1 = "com.tencent.mm.plugin.voip.model.h2"
            java.lang.String r2 = "com.tencent.mm.plugin.voip.model.NewVoipMgr"
            java.lang.String[] r0 = new java.lang.String[]{r0, r1, r2}
            java.util.List r0 = a.C0294o3.d0(r0)
            java.util.Iterator r0 = r0.iterator()
        L44:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L59
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.ClassLoader r2 = r5.b
            java.lang.Class r1 = a.A1.b(r2, r1)
            if (r1 == 0) goto L44
            goto L5a
        L59:
            r1 = 0
        L5a:
            return r1
    }
}
