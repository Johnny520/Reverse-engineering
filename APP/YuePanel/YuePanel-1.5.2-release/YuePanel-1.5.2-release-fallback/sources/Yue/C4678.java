package Yue;

/* JADX INFO: renamed from: Yue.ۥۣۡۦۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C4678<F, S> {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public final F f14896;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public final S f14897;

    public C4678(F r1, S r2) {
            r0 = this;
            r0.<init>()
            r0.f14896 = r1
            r0.f14897 = r2
            return
    }

    @Yue.InterfaceC4410
    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static <A, B> Yue.C4678<A, B> m18542(A r1, B r2) {
            Yue.ۥۣۡۦۡ r0 = new Yue.ۥۣۡۦۡ
            r0.<init>(r1, r2)
            return r0
    }

    public boolean equals(java.lang.Object r4) {
            r3 = this;
            boolean r0 = r4 instanceof Yue.C4678
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            Yue.ۥۣۡۦۡ r4 = (Yue.C4678) r4
            F r0 = r4.f14896
            F r2 = r3.f14896
            boolean r0 = Yue.C4554.m18124(r0, r2)
            if (r0 == 0) goto L1d
            S r4 = r4.f14897
            S r0 = r3.f14897
            boolean r4 = Yue.C4554.m18124(r4, r0)
            if (r4 == 0) goto L1d
            r1 = 1
        L1d:
            return r1
    }

    public int hashCode() {
            r3 = this;
            F r0 = r3.f14896
            r1 = 0
            if (r0 != 0) goto L7
            r0 = r1
            goto Lb
        L7:
            int r0 = r0.hashCode()
        Lb:
            S r2 = r3.f14897
            if (r2 != 0) goto L10
            goto L14
        L10:
            int r1 = r2.hashCode()
        L14:
            r0 = r0 ^ r1
            return r0
    }

    @Yue.InterfaceC4410
    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Pair{"
            r0.append(r1)
            F r1 = r2.f14896
            r0.append(r1)
            java.lang.String r1 = " "
            r0.append(r1)
            S r1 = r2.f14897
            r0.append(r1)
            java.lang.String r1 = "}"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
