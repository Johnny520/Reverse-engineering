package Yue;

/* JADX INFO: renamed from: Yue.ۥ۟ۦۤۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final class C1434 implements Yue.C6875.InterfaceC6891 {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public final java.util.List<Yue.C6875.InterfaceC6891> f4534;

    public C1434() {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.f4534 = r0
            return
    }

    @Override // Yue.C6875.InterfaceC6891
    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public void mo7075(@Yue.InterfaceC4410 android.view.View r3, float r4) {
            r2 = this;
            java.util.List<Yue.ۥۢۤۦۢ$ۥ۟۟۟ۧ> r0 = r2.f4534
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L16
            java.lang.Object r1 = r0.next()
            Yue.ۥۢۤۦۢ$ۥ۟۟۟ۧ r1 = (Yue.C6875.InterfaceC6891) r1
            r1.mo7075(r3, r4)
            goto L6
        L16:
            return
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public void m7076(@Yue.InterfaceC4410 Yue.C6875.InterfaceC6891 r2) {
            r1 = this;
            java.util.List<Yue.ۥۢۤۦۢ$ۥ۟۟۟ۧ> r0 = r1.f4534
            r0.add(r2)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public void m7077(@Yue.InterfaceC4410 Yue.C6875.InterfaceC6891 r2) {
            r1 = this;
            java.util.List<Yue.ۥۢۤۦۢ$ۥ۟۟۟ۧ> r0 = r1.f4534
            r0.remove(r2)
            return
    }
}
