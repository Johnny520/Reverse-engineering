package Yue;

/* JADX INFO: renamed from: Yue.ۥۣ۟ۧۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final class C1580 {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public final java.util.Set<Yue.InterfaceC4613> f4995;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    @Yue.InterfaceC4543
    public volatile android.content.Context f4996;

    public C1580() {
            r1 = this;
            r1.<init>()
            java.util.concurrent.CopyOnWriteArraySet r0 = new java.util.concurrent.CopyOnWriteArraySet
            r0.<init>()
            r1.f4995 = r0
            return
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public final void m7747(@Yue.InterfaceC4418 Yue.InterfaceC4613 r2) {
            r1 = this;
            java.lang.String r0 = "listener"
            Yue.C3329.m13906(r2, r0)
            android.content.Context r0 = r1.f4996
            if (r0 == 0) goto Lc
            r2.mo7067(r0)
        Lc:
            java.util.Set<Yue.ۥۣۡۡۧ> r0 = r1.f4995
            r0.add(r2)
            return
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public final void m7748() {
            r1 = this;
            r0 = 0
            r1.f4996 = r0
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final void m7749(@Yue.InterfaceC4418 android.content.Context r3) {
            r2 = this;
            java.lang.String r0 = "context"
            Yue.C3329.m13906(r3, r0)
            r2.f4996 = r3
            java.util.Set<Yue.ۥۣۡۡۧ> r0 = r2.f4995
            java.util.Iterator r0 = r0.iterator()
        Ld:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1d
            java.lang.Object r1 = r0.next()
            Yue.ۥۣۡۡۧ r1 = (Yue.InterfaceC4613) r1
            r1.mo7067(r3)
            goto Ld
        L1d:
            return
    }

    @Yue.InterfaceC4543
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public final android.content.Context m7750() {
            r1 = this;
            android.content.Context r0 = r1.f4996
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public final void m7751(@Yue.InterfaceC4418 Yue.InterfaceC4613 r2) {
            r1 = this;
            java.lang.String r0 = "listener"
            Yue.C3329.m13906(r2, r0)
            java.util.Set<Yue.ۥۣۡۡۧ> r0 = r1.f4995
            r0.remove(r2)
            return
    }
}
