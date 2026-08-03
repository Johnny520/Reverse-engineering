package Yue;

/* JADX INFO: renamed from: Yue.ۥ۟ۦۥ۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1438 extends Yue.C1773 {
    public AbstractC1438() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // Yue.C1773, Yue.InterfaceC3184
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public void mo7088(Yue.InterfaceC2813 r6) throws Yue.C3342 {
            r5 = this;
            boolean r0 = r6 instanceof Yue.AbstractC1724
            java.lang.String r1 = " RSV3: "
            java.lang.String r2 = " RSV2: "
            java.lang.String r3 = "bad rsv RSV1: "
            if (r0 == 0) goto L44
            boolean r0 = r6.mo12257()
            if (r0 != 0) goto L17
            boolean r0 = r6.mo12260()
            if (r0 != 0) goto L17
            goto L44
        L17:
            Yue.ۥ۠ۥۧۦ r0 = new Yue.ۥ۠ۥۧۦ
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r3)
            boolean r3 = r6.mo12256()
            r4.append(r3)
            r4.append(r2)
            boolean r2 = r6.mo12257()
            r4.append(r2)
            r4.append(r1)
            boolean r6 = r6.mo12260()
            r4.append(r6)
            java.lang.String r6 = r4.toString()
            r0.<init>(r6)
            throw r0
        L44:
            boolean r0 = r6 instanceof Yue.AbstractC1617
            if (r0 == 0) goto L88
            boolean r0 = r6.mo12256()
            if (r0 != 0) goto L5b
            boolean r0 = r6.mo12257()
            if (r0 != 0) goto L5b
            boolean r0 = r6.mo12260()
            if (r0 != 0) goto L5b
            goto L88
        L5b:
            Yue.ۥ۠ۥۧۦ r0 = new Yue.ۥ۠ۥۧۦ
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r3)
            boolean r3 = r6.mo12256()
            r4.append(r3)
            r4.append(r2)
            boolean r2 = r6.mo12257()
            r4.append(r2)
            r4.append(r1)
            boolean r6 = r6.mo12260()
            r4.append(r6)
            java.lang.String r6 = r4.toString()
            r0.<init>(r6)
            throw r0
        L88:
            return
    }
}
