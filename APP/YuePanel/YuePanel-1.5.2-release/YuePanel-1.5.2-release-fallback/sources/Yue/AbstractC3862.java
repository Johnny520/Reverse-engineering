package Yue;

/* JADX INFO: renamed from: Yue.ۥ۠ۨۥۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC3862 extends Yue.AbstractC1643 {
    public AbstractC3862() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // Yue.AbstractC1643
    @Yue.InterfaceC4418
    public Yue.AbstractC1643 limitedParallelism(int r1) {
            r0 = this;
            Yue.C3590.m14525(r1)
            return r0
    }

    @Override // Yue.AbstractC1643
    @Yue.InterfaceC4418
    public java.lang.String toString() {
            r2 = this;
            java.lang.String r0 = r2.m15607()
            if (r0 != 0) goto L22
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = Yue.C1758.m8350(r2)
            r0.append(r1)
            r1 = 64
            r0.append(r1)
            java.lang.String r1 = Yue.C1758.m8351(r2)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
        L22:
            return r0
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟ۧ۟ */
    public abstract Yue.AbstractC3862 mo12588();

    @Yue.InterfaceC3324
    @Yue.InterfaceC4543
    /* JADX INFO: renamed from: ۥ۟۟ۧ۠, reason: contains not printable characters */
    public final java.lang.String m15607() {
            r2 = this;
            Yue.ۥ۠ۨۥۥ r0 = Yue.C1878.m8793()
            if (r2 != r0) goto L9
            java.lang.String r0 = "Dispatchers.Main"
            return r0
        L9:
            r1 = 0
            Yue.ۥ۠ۨۥۥ r0 = r0.mo12588()     // Catch: java.lang.UnsupportedOperationException -> Lf
            goto L10
        Lf:
            r0 = r1
        L10:
            if (r2 != r0) goto L15
            java.lang.String r0 = "Dispatchers.Main.immediate"
            return r0
        L15:
            return r1
    }
}
