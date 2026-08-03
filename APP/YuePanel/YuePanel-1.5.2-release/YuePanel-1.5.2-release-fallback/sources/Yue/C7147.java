package Yue;

/* JADX INFO: renamed from: Yue.ۥۢۦۡۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C7147 extends Yue.C7149 {

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public Yue.C7159 f24690;

    public C7147(Yue.C7159 r1) throws Yue.C7158 {
            r0 = this;
            r0.<init>(r1)
            r0.f24690 = r1
            return
    }

    @Override // Yue.C7149
    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public boolean mo27491() throws Yue.C7158 {
            r2 = this;
            Yue.ۥۢۦۡ r0 = r2.f24694
            Yue.ۥۢۦۢۤ r1 = r2.f24693
            r0.mo22066(r1, r2)
            Yue.ۥۢۦۢۤ r0 = r2.f24693
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto L14
            Yue.ۥۢۦۢۤ r0 = r2.f24693
            r0.next()
        L14:
            boolean r0 = r2.m27495()
            if (r0 == 0) goto L36
            Yue.ۥۢۦۢۤ r0 = r2.f24693
            int r0 = r0.mo15450()
            r1 = 8
            if (r0 != r1) goto L36
            Yue.ۥۢۦۣۢ r0 = r2.f24690
            boolean r0 = r0.m27540()
            if (r0 == 0) goto L33
            Yue.ۥۢۦۡ r0 = r2.f24694
            Yue.ۥۢۦۢۤ r1 = r2.f24693
            r0.mo22066(r1, r2)
        L33:
            r2.m27494()
        L36:
            boolean r0 = r2.m27496()
            r0 = r0 ^ 1
            return r0
    }
}
