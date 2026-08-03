package Yue;

/* JADX INFO: renamed from: Yue.ۥ۠ۧۡۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public class C3616<E> extends Yue.AbstractC0028<E> {
    public C3616(@Yue.InterfaceC4543 Yue.InterfaceC2825<? super E, Yue.C6593> r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    @Override // Yue.AbstractC0085
    /* JADX INFO: renamed from: ۥ۟۟ۡۦ */
    public final boolean mo493() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // Yue.AbstractC0085
    /* JADX INFO: renamed from: ۥ۟۟ۡۧ */
    public final boolean mo494() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // Yue.AbstractC0085
    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟ۢ۟ */
    public java.lang.Object mo497(E r4) {
            r3 = this;
        L0:
            java.lang.Object r0 = super.mo497(r4)
            Yue.ۥۢ۠ۦۢ r1 = Yue.C0040.f95
            if (r0 != r1) goto L9
            return r1
        L9:
            Yue.ۥۢ۠ۦۢ r2 = Yue.C0040.f96
            if (r0 != r2) goto L19
            Yue.ۥۡۦۡۢ r0 = r3.m503(r4)
            if (r0 != 0) goto L14
            return r1
        L14:
            boolean r1 = r0 instanceof Yue.C1174
            if (r1 == 0) goto L0
            return r0
        L19:
            boolean r4 = r0 instanceof Yue.C1174
            if (r4 == 0) goto L1e
            return r0
        L1e:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Invalid offerInternal result "
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            java.lang.String r0 = r0.toString()
            r4.<init>(r0)
            throw r4
    }

    @Override // Yue.AbstractC0085
    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟ۢۢ */
    public java.lang.Object mo500(E r3, @Yue.InterfaceC4418 Yue.InterfaceC5564<?> r4) {
            r2 = this;
        L0:
            boolean r0 = r2.m326()
            if (r0 == 0) goto Lb
            java.lang.Object r0 = super.mo500(r3, r4)
            goto L17
        Lb:
            Yue.ۥ۠ۨ۠ۥ$ۥ۟ r0 = r2.m478(r3)
            java.lang.Object r0 = r4.mo20843(r0)
            if (r0 != 0) goto L17
            Yue.ۥۢ۠ۦۢ r0 = Yue.C0040.f95
        L17:
            java.lang.Object r1 = Yue.C5566.m20861()
            if (r0 != r1) goto L22
            java.lang.Object r3 = Yue.C5566.m20861()
            return r3
        L22:
            Yue.ۥۢ۠ۦۢ r1 = Yue.C0040.f95
            if (r0 != r1) goto L27
            return r1
        L27:
            Yue.ۥۢ۠ۦۢ r1 = Yue.C0040.f96
            if (r0 == r1) goto L0
            java.lang.Object r1 = Yue.C0640.f1626
            if (r0 == r1) goto L0
            boolean r3 = r0 instanceof Yue.C1174
            if (r3 == 0) goto L34
            return r0
        L34:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r1 = "Invalid result "
            r4.append(r1)
            r4.append(r0)
            java.lang.String r4 = r4.toString()
            java.lang.String r4 = r4.toString()
            r3.<init>(r4)
            throw r3
    }

    @Override // Yue.AbstractC0028
    /* JADX INFO: renamed from: ۥۣ۟۟ۨ */
    public final boolean mo327() {
            r1 = this;
            r0 = 1
            return r0
    }

    @Override // Yue.AbstractC0028
    /* JADX INFO: renamed from: ۥ۟۟ۤ */
    public final boolean mo328() {
            r1 = this;
            r0 = 1
            return r0
    }

    @Override // Yue.AbstractC0028
    /* JADX INFO: renamed from: ۥ۟۟ۤۡ */
    public void mo331(@Yue.InterfaceC4418 java.lang.Object r6, @Yue.InterfaceC4418 Yue.C1174<?> r7) {
            r5 = this;
            r0 = 0
            if (r6 == 0) goto L4a
            boolean r1 = r6 instanceof java.util.ArrayList
            if (r1 != 0) goto L1e
            Yue.ۥۡۨ۠ۦ r6 = (Yue.AbstractC5593) r6
            boolean r1 = r6 instanceof Yue.AbstractC0085.C0086
            if (r1 == 0) goto L1a
            Yue.ۥۣ۠ۡ۟<E, Yue.ۥۣۢ۠ۤ> r7 = r5.f165
            if (r7 == 0) goto L4a
            Yue.ۥ۟۟ۢۢ$ۥ r6 = (Yue.AbstractC0085.C0086) r6
            E r6 = r6.f167
            Yue.ۥۣۢ۟ۨ r0 = Yue.C4622.m18434(r7, r6, r0)
            goto L4a
        L1a:
            r6.mo508(r7)
            goto L4a
        L1e:
            java.util.ArrayList r6 = (java.util.ArrayList) r6
            int r1 = r6.size()
            int r1 = r1 + (-1)
            r2 = r0
        L27:
            r3 = -1
            if (r3 >= r1) goto L49
            java.lang.Object r3 = r6.get(r1)
            Yue.ۥۡۨ۠ۦ r3 = (Yue.AbstractC5593) r3
            boolean r4 = r3 instanceof Yue.AbstractC0085.C0086
            if (r4 == 0) goto L43
            Yue.ۥۣ۠ۡ۟<E, Yue.ۥۣۢ۠ۤ> r4 = r5.f165
            if (r4 == 0) goto L41
            Yue.ۥ۟۟ۢۢ$ۥ r3 = (Yue.AbstractC0085.C0086) r3
            E r3 = r3.f167
            Yue.ۥۣۢ۟ۨ r2 = Yue.C4622.m18434(r4, r3, r2)
            goto L46
        L41:
            r2 = r0
            goto L46
        L43:
            r3.mo508(r7)
        L46:
            int r1 = r1 + (-1)
            goto L27
        L49:
            r0 = r2
        L4a:
            if (r0 != 0) goto L4d
            return
        L4d:
            throw r0
    }
}
