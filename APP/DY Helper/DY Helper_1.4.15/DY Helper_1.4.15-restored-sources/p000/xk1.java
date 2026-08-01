package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class xk1 {

    /* JADX INFO: renamed from: α */
    public final long f12201;

    /* JADX INFO: renamed from: β */
    public final p000.w22 f12202;

    /* JADX INFO: renamed from: γ */
    public final p000.wk1 f12203;

    /* JADX INFO: renamed from: δ */
    public final java.util.concurrent.ConcurrentLinkedQueue f12204;

    public xk1(p000.x22 r3) {
            r2 = this;
            r3.getClass()
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MINUTES
            r0.getClass()
            r2.<init>()
            r0 = 300000000000(0x45d964b800, double:1.482196937524E-312)
            r2.f12201 = r0
            w22 r3 = r3.m6509()
            r2.f12202 = r3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r0 = p000.ud2.f10710
            java.lang.String r1 = " ConnectionPool connection closer"
            java.lang.String r3 = p000.lz1.m3691(r3, r0, r1)
            wk1 r0 = new wk1
            r0.<init>(r2, r3)
            r2.f12203 = r0
            java.util.concurrent.ConcurrentLinkedQueue r3 = new java.util.concurrent.ConcurrentLinkedQueue
            r3.<init>()
            r2.f12204 = r3
            return
    }

    /* JADX INFO: renamed from: α */
    public final int m6681(p000.vk1 r6, long r7) {
            r5 = this;
            java.util.TimeZone r0 = p000.ud2.f10709
            java.util.ArrayList r0 = r6.f11338
            r1 = 0
            r2 = r1
        L6:
            int r3 = r0.size()
            if (r2 >= r3) goto L41
            java.lang.Object r3 = r0.get(r2)
            java.lang.ref.Reference r3 = (java.lang.ref.Reference) r3
            java.lang.Object r4 = r3.get()
            if (r4 == 0) goto L1b
            int r2 = r2 + 1
            goto L6
        L1b:
            sk1 r3 = (p000.sk1) r3
            zo1 r4 = r6.f11325
            p r4 = r4.f13229
            f0 r4 = p000.gh1.f4375
            f0 r4 = p000.gh1.f4375
            java.lang.Object r3 = r3.f9941
            r4.getClass()
            r3.getClass()
            android.util.CloseGuard r3 = (android.util.CloseGuard) r3
            r3.warnIfOpen()
            r0.remove(r2)
            boolean r3 = r0.isEmpty()
            if (r3 == 0) goto L6
            long r2 = r5.f12201
            long r7 = r7 - r2
            r6.f11339 = r7
            return r1
        L41:
            int r5 = r0.size()
            return r5
    }
}
