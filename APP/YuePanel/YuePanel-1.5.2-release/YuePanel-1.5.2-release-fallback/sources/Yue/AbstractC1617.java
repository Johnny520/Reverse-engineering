package Yue;

/* JADX INFO: renamed from: Yue.ۥ۟ۧۥۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1617 extends Yue.AbstractC2814 {
    public AbstractC1617(Yue.EnumC4633 r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    @Override // Yue.AbstractC2814
    /* JADX INFO: renamed from: ۥ۟۟۟ۤ */
    public void mo6103() throws Yue.C3342 {
            r2 = this;
            boolean r0 = r2.mo12261()
            if (r0 == 0) goto L31
            boolean r0 = r2.mo12256()
            if (r0 != 0) goto L29
            boolean r0 = r2.mo12257()
            if (r0 != 0) goto L21
            boolean r0 = r2.mo12260()
            if (r0 != 0) goto L19
            return
        L19:
            Yue.ۥ۠ۥۧۦ r0 = new Yue.ۥ۠ۥۧۦ
            java.lang.String r1 = "Control frame can't have rsv3==true set"
            r0.<init>(r1)
            throw r0
        L21:
            Yue.ۥ۠ۥۧۦ r0 = new Yue.ۥ۠ۥۧۦ
            java.lang.String r1 = "Control frame can't have rsv2==true set"
            r0.<init>(r1)
            throw r0
        L29:
            Yue.ۥ۠ۥۧۦ r0 = new Yue.ۥ۠ۥۧۦ
            java.lang.String r1 = "Control frame can't have rsv1==true set"
            r0.<init>(r1)
            throw r0
        L31:
            Yue.ۥ۠ۥۧۦ r0 = new Yue.ۥ۠ۥۧۦ
            java.lang.String r1 = "Control frame can't have fin==false set"
            r0.<init>(r1)
            throw r0
    }
}
