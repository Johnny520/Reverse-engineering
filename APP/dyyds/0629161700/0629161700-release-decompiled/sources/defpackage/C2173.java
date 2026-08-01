package defpackage;

/* JADX INFO: renamed from: 岵堘洷釠滇浄, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2173 implements android.os.IBinder.DeathRecipient {

    /* JADX INFO: renamed from: 釠丰瞾釠翅洺, reason: contains not printable characters */
    public final /* synthetic */ int f9246;

    /* JADX INFO: renamed from: 岵囜浂釠滇矅, reason: contains not printable characters */
    public final /* synthetic */ defpackage.C1851 f9247;

    public /* synthetic */ C2173(defpackage.C1851 r1, int r2) {
            r0 = this;
            r0.f9246 = r2
            r0.f9247 = r1
            r0.<init>()
            return
    }

    @Override // android.os.IBinder.DeathRecipient
    public final void binderDied() {
            r6 = this;
            int r0 = r6.f9246
            r1 = -830350606900782(0xfffd0cccef0961d2, double:NaN)
            r3 = 0
            r4 = -830522405592622(0xfffd0ca4ef0961d2, double:NaN)
            岵佱洿岵堘瞾 r6 = r6.f9247
            switch(r0) {
                case 0: goto L42;
                default: goto L12;
            }
        L12:
            com.ss.android.ugc.awemes.MainApp r0 = defpackage.AbstractC2338.f10092
            r0.getClass()
            岵佱洿岵堘瞾 r0 = com.ss.android.ugc.awemes.MainApp.f424
            if (r0 != r6) goto L20
            com.ss.android.ugc.awemes.MainApp.f424 = r3
        L20:
            岵佱洿岵堘瞾 r6 = com.ss.android.ugc.awemes.MainApp.f424
            java.util.concurrent.CopyOnWriteArraySet r0 = com.ss.android.ugc.awemes.MainApp.f423
            java.util.Iterator r3 = r0.iterator()
        L2b:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L41
            java.lang.Object r1 = r3.next()
            釠丰洸釠翅浀 r1 = (defpackage.InterfaceC1221) r1
            boolean r2 = r0.contains(r1)
            if (r2 == 0) goto L2b
            r1.onServiceStateChanged(r6)
            goto L2b
        L41:
            return
        L42:
            com.ss.android.ugc.awemes.MainApp r0 = defpackage.AbstractC2338.f10092
            r0.getClass()
            岵佱洿岵堘瞾 r0 = com.ss.android.ugc.awemes.MainApp.f424
            if (r0 != r6) goto L50
            com.ss.android.ugc.awemes.MainApp.f424 = r3
        L50:
            岵佱洿岵堘瞾 r6 = com.ss.android.ugc.awemes.MainApp.f424
            java.util.concurrent.CopyOnWriteArraySet r0 = com.ss.android.ugc.awemes.MainApp.f423
            java.util.Iterator r3 = r0.iterator()
        L5b:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L71
            java.lang.Object r1 = r3.next()
            釠丰洸釠翅浀 r1 = (defpackage.InterfaceC1221) r1
            boolean r2 = r0.contains(r1)
            if (r2 == 0) goto L5b
            r1.onServiceStateChanged(r6)
            goto L5b
        L71:
            return
    }
}
