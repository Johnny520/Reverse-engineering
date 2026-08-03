package Yue;

/* JADX INFO: renamed from: Yue.ۥ۟ۦۤۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final class C1433 extends Yue.C6875.AbstractC6885 {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    @Yue.InterfaceC4410
    public final java.util.List<Yue.C6875.AbstractC6885> f4533;

    public C1433(int r2) {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r2)
            r1.f4533 = r0
            return
    }

    @Override // Yue.C6875.AbstractC6885
    public void onPageScrollStateChanged(int r3) {
            r2 = this;
            java.util.List<Yue.ۥۢۤۦۢ$ۥ۟۟۟ۤ> r0 = r2.f4533     // Catch: java.util.ConcurrentModificationException -> L16
            java.util.Iterator r0 = r0.iterator()     // Catch: java.util.ConcurrentModificationException -> L16
        L6:
            boolean r1 = r0.hasNext()     // Catch: java.util.ConcurrentModificationException -> L16
            if (r1 == 0) goto L1a
            java.lang.Object r1 = r0.next()     // Catch: java.util.ConcurrentModificationException -> L16
            Yue.ۥۢۤۦۢ$ۥ۟۟۟ۤ r1 = (Yue.C6875.AbstractC6885) r1     // Catch: java.util.ConcurrentModificationException -> L16
            r1.onPageScrollStateChanged(r3)     // Catch: java.util.ConcurrentModificationException -> L16
            goto L6
        L16:
            r3 = move-exception
            r2.m7074(r3)
        L1a:
            return
    }

    @Override // Yue.C6875.AbstractC6885
    public void onPageScrolled(int r3, float r4, @Yue.InterfaceC4992 int r5) {
            r2 = this;
            java.util.List<Yue.ۥۢۤۦۢ$ۥ۟۟۟ۤ> r0 = r2.f4533     // Catch: java.util.ConcurrentModificationException -> L16
            java.util.Iterator r0 = r0.iterator()     // Catch: java.util.ConcurrentModificationException -> L16
        L6:
            boolean r1 = r0.hasNext()     // Catch: java.util.ConcurrentModificationException -> L16
            if (r1 == 0) goto L1a
            java.lang.Object r1 = r0.next()     // Catch: java.util.ConcurrentModificationException -> L16
            Yue.ۥۢۤۦۢ$ۥ۟۟۟ۤ r1 = (Yue.C6875.AbstractC6885) r1     // Catch: java.util.ConcurrentModificationException -> L16
            r1.onPageScrolled(r3, r4, r5)     // Catch: java.util.ConcurrentModificationException -> L16
            goto L6
        L16:
            r3 = move-exception
            r2.m7074(r3)
        L1a:
            return
    }

    @Override // Yue.C6875.AbstractC6885
    public void onPageSelected(int r3) {
            r2 = this;
            java.util.List<Yue.ۥۢۤۦۢ$ۥ۟۟۟ۤ> r0 = r2.f4533     // Catch: java.util.ConcurrentModificationException -> L16
            java.util.Iterator r0 = r0.iterator()     // Catch: java.util.ConcurrentModificationException -> L16
        L6:
            boolean r1 = r0.hasNext()     // Catch: java.util.ConcurrentModificationException -> L16
            if (r1 == 0) goto L1a
            java.lang.Object r1 = r0.next()     // Catch: java.util.ConcurrentModificationException -> L16
            Yue.ۥۢۤۦۢ$ۥ۟۟۟ۤ r1 = (Yue.C6875.AbstractC6885) r1     // Catch: java.util.ConcurrentModificationException -> L16
            r1.onPageSelected(r3)     // Catch: java.util.ConcurrentModificationException -> L16
            goto L6
        L16:
            r3 = move-exception
            r2.m7074(r3)
        L1a:
            return
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public void m7072(Yue.C6875.AbstractC6885 r2) {
            r1 = this;
            java.util.List<Yue.ۥۢۤۦۢ$ۥ۟۟۟ۤ> r0 = r1.f4533
            r0.add(r2)
            return
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public void m7073(Yue.C6875.AbstractC6885 r2) {
            r1 = this;
            java.util.List<Yue.ۥۢۤۦۢ$ۥ۟۟۟ۤ> r0 = r1.f4533
            r0.remove(r2)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final void m7074(java.util.ConcurrentModificationException r3) {
            r2 = this;
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Adding and removing callbacks during dispatch to callbacks is not supported"
            r0.<init>(r1, r3)
            throw r0
    }
}
