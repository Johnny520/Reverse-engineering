package Yue;

/* JADX INFO: renamed from: Yue.ۥ۠ۧۧ۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@Yue.InterfaceC5336(24)
public final class C3709 {
    public C3709() {
            r0 = this;
            r0.<init>()
            return
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static Yue.C3698 m14936(Yue.C3698 r4, Yue.C3698 r5) {
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>()
            r1 = 0
        L6:
            int r2 = r4.m14907()
            int r3 = r5.m14907()
            int r2 = r2 + r3
            if (r1 >= r2) goto L2e
            int r2 = r4.m14907()
            if (r1 >= r2) goto L1c
            java.util.Locale r2 = r4.m14903(r1)
            goto L26
        L1c:
            int r2 = r4.m14907()
            int r2 = r1 - r2
            java.util.Locale r2 = r5.m14903(r2)
        L26:
            if (r2 == 0) goto L2b
            r0.add(r2)
        L2b:
            int r1 = r1 + 1
            goto L6
        L2e:
            int r4 = r0.size()
            java.util.Locale[] r4 = new java.util.Locale[r4]
            java.lang.Object[] r4 = r0.toArray(r4)
            java.util.Locale[] r4 = (java.util.Locale[]) r4
            Yue.ۥ۠ۧۦۥ r4 = Yue.C3698.m14894(r4)
            return r4
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static Yue.C3698 m14937(Yue.C3698 r1, Yue.C3698 r2) {
            if (r1 == 0) goto Le
            boolean r0 = r1.m14906()
            if (r0 == 0) goto L9
            goto Le
        L9:
            Yue.ۥ۠ۧۦۥ r1 = m14936(r1, r2)
            return r1
        Le:
            Yue.ۥ۠ۧۦۥ r1 = Yue.C3698.m14899()
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static Yue.C3698 m14938(android.os.LocaleList r1, android.os.LocaleList r2) {
            if (r1 == 0) goto L16
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L9
            goto L16
        L9:
            Yue.ۥ۠ۧۦۥ r1 = Yue.C3698.m14901(r1)
            Yue.ۥ۠ۧۦۥ r2 = Yue.C3698.m14901(r2)
            Yue.ۥ۠ۧۦۥ r1 = m14936(r1, r2)
            return r1
        L16:
            Yue.ۥ۠ۧۦۥ r1 = Yue.C3698.m14899()
            return r1
    }
}
