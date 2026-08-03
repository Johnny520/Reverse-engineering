package Yue;

/* JADX INFO: renamed from: Yue.ۥۣۡۢۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C4403 extends Yue.C3781 implements Yue.InterfaceC3235 {
    public C4403() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // Yue.C3783
    @Yue.InterfaceC4418
    public java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = super.toString()
            return r0
    }

    @Override // Yue.InterfaceC3235
    /* JADX INFO: renamed from: ۥ۟۟۟ */
    public boolean mo10054() {
            r1 = this;
            r0 = 1
            return r0
    }

    @Override // Yue.InterfaceC3235
    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟ۡ */
    public Yue.C4403 mo10055() {
            r0 = this;
            return r0
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟ۦۨ, reason: contains not printable characters */
    public final java.lang.String m17311(@Yue.InterfaceC4418 java.lang.String r5) {
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "List{"
            r0.append(r1)
            r0.append(r5)
            java.lang.String r5 = "}["
            r0.append(r5)
            java.lang.Object r5 = r4.m15170()
            Yue.ۥ۠ۨ۠ۥ r5 = (Yue.C3783) r5
            r1 = 1
        L19:
            boolean r2 = Yue.C3329.m13897(r5, r4)
            if (r2 != 0) goto L37
            boolean r2 = r5 instanceof Yue.AbstractC3402
            if (r2 == 0) goto L32
            r2 = r5
            Yue.ۥ۠ۦ۠ r2 = (Yue.AbstractC3402) r2
            if (r1 == 0) goto L2a
            r1 = 0
            goto L2f
        L2a:
            java.lang.String r3 = ", "
            r0.append(r3)
        L2f:
            r0.append(r2)
        L32:
            Yue.ۥ۠ۨ۠ۥ r5 = r5.m15171()
            goto L19
        L37:
            java.lang.String r5 = "]"
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            java.lang.String r0 = "StringBuilder().apply(builderAction).toString()"
            Yue.C3329.m13905(r5, r0)
            return r5
    }
}
