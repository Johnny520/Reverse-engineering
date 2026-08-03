package Yue;

/* JADX INFO: renamed from: Yue.ۥۣ۠ۨ۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public class C3781 extends Yue.C3783 {
    public C3781() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // Yue.C3783
    /* JADX INFO: renamed from: ۥ۟۟ۥۥ, reason: contains not printable characters */
    public boolean mo15141() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // Yue.C3783
    @Yue.InterfaceC4543
    /* JADX INFO: renamed from: ۥ۟۟ۥۧ, reason: contains not printable characters */
    public Yue.C3783 mo15142() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // Yue.C3783
    /* JADX INFO: renamed from: ۥ۟۟ۥۨ, reason: contains not printable characters */
    public /* bridge */ /* synthetic */ boolean mo15143() {
            r1 = this;
            java.lang.Void r0 = r1.m15146()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟ۦۤ, reason: contains not printable characters */
    public final /* synthetic */ <T extends Yue.C3783> void m15144(Yue.InterfaceC2825<? super T, Yue.C6593> r4) {
            r3 = this;
            java.lang.Object r0 = r3.m15170()
            Yue.ۥ۠ۨ۠ۥ r0 = (Yue.C3783) r0
        L6:
            boolean r1 = Yue.C3329.m13897(r0, r3)
            if (r1 != 0) goto L1e
            r1 = 3
            java.lang.String r2 = "T"
            Yue.C3329.m13915(r1, r2)
            boolean r1 = r0 instanceof Yue.C3783
            if (r1 == 0) goto L19
            r4.invoke(r0)
        L19:
            Yue.ۥ۠ۨ۠ۥ r0 = r0.m15171()
            goto L6
        L1e:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۦۥ, reason: contains not printable characters */
    public final boolean m15145() {
            r1 = this;
            java.lang.Object r0 = r1.m15170()
            if (r0 != r1) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟ۦۦ, reason: contains not printable characters */
    public final java.lang.Void m15146() {
            r2 = this;
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "head cannot be removed"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    /* JADX INFO: renamed from: ۥ۟۟ۦۧ, reason: contains not printable characters */
    public final void m15147() {
            r3 = this;
            java.lang.Object r0 = r3.m15170()
            Yue.ۥ۠ۨ۠ۥ r0 = (Yue.C3783) r0
            r1 = r3
        L7:
            boolean r2 = Yue.C3329.m13897(r0, r3)
            if (r2 != 0) goto L17
            Yue.ۥ۠ۨ۠ۥ r2 = r0.m15171()
            r0.m15181(r1, r2)
            r1 = r0
            r0 = r2
            goto L7
        L17:
            java.lang.Object r0 = r3.m15170()
            Yue.ۥ۠ۨ۠ۥ r0 = (Yue.C3783) r0
            r3.m15181(r1, r0)
            return
    }
}
