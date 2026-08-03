package Yue;

/* JADX INFO: renamed from: Yue.ۥۢۡۤۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@Yue.InterfaceC6976(markerClass = {Yue.InterfaceC2312.class})
@Yue.InterfaceC5792(version = "1.9")
public final class C6249<T> {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public final T f22297;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public final long f22298;

    public C6249(T r1, long r2) {
            r0 = this;
            r0.<init>()
            r0.f22297 = r1
            r0.f22298 = r2
            return
    }

    public /* synthetic */ C6249(java.lang.Object r1, long r2, Yue.C1769 r4) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static /* synthetic */ Yue.C6249 m23298(Yue.C6249 r0, java.lang.Object r1, long r2, int r4, java.lang.Object r5) {
            r5 = r4 & 1
            if (r5 == 0) goto L6
            T r1 = r0.f22297
        L6:
            r4 = r4 & 2
            if (r4 == 0) goto Lc
            long r2 = r0.f22298
        Lc:
            Yue.ۥۢۡۤۦ r0 = r0.m23301(r1, r2)
            return r0
    }

    public boolean equals(@Yue.InterfaceC4543 java.lang.Object r8) {
            r7 = this;
            r0 = 1
            if (r7 != r8) goto L4
            return r0
        L4:
            boolean r1 = r8 instanceof Yue.C6249
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            Yue.ۥۢۡۤۦ r8 = (Yue.C6249) r8
            T r1 = r7.f22297
            T r3 = r8.f22297
            boolean r1 = Yue.C3329.m13897(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            long r3 = r7.f22298
            long r5 = r8.f22298
            boolean r8 = Yue.C2045.m9448(r3, r5)
            if (r8 != 0) goto L22
            return r2
        L22:
            return r0
    }

    public int hashCode() {
            r3 = this;
            T r0 = r3.f22297
            if (r0 != 0) goto L6
            r0 = 0
            goto La
        L6:
            int r0 = r0.hashCode()
        La:
            int r0 = r0 * 31
            long r1 = r3.f22298
            int r1 = Yue.C2045.m9482(r1)
            int r0 = r0 + r1
            return r0
    }

    @Yue.InterfaceC4418
    public java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "TimedValue(value="
            r0.append(r1)
            T r1 = r3.f22297
            r0.append(r1)
            java.lang.String r1 = ", duration="
            r0.append(r1)
            long r1 = r3.f22298
            java.lang.String r1 = Yue.C2045.m9503(r1)
            r0.append(r1)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public final T m23299() {
            r1 = this;
            T r0 = r1.f22297
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public final long m23300() {
            r2 = this;
            long r0 = r2.f22298
            return r0
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final Yue.C6249<T> m23301(T r3, long r4) {
            r2 = this;
            Yue.ۥۢۡۤۦ r0 = new Yue.ۥۢۡۤۦ
            r1 = 0
            r0.<init>(r3, r4, r1)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public final long m23302() {
            r2 = this;
            long r0 = r2.f22298
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public final T m23303() {
            r1 = this;
            T r0 = r1.f22297
            return r0
    }
}
