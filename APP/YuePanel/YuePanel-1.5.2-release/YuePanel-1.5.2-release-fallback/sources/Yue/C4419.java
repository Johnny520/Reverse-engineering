package Yue;

/* JADX INFO: renamed from: Yue.ۥۡۢۥۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C4419<T> implements Yue.InterfaceC5205<java.lang.Object, T> {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    @Yue.InterfaceC4543
    public T f13979;

    public C4419() {
            r0 = this;
            r0.<init>()
            return
    }

    @Yue.InterfaceC4418
    public java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "NotNullProperty("
            r0.append(r1)
            T r1 = r3.f13979
            if (r1 == 0) goto L22
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "value="
            r1.append(r2)
            T r2 = r3.f13979
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            goto L24
        L22:
            java.lang.String r1 = "value not initialized yet"
        L24:
            r0.append(r1)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // Yue.InterfaceC5205, Yue.InterfaceC5203
    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public T mo17329(@Yue.InterfaceC4543 java.lang.Object r3, @Yue.InterfaceC4418 Yue.InterfaceC3463<?> r4) {
            r2 = this;
            java.lang.String r3 = "property"
            Yue.C3329.m13906(r4, r3)
            T r3 = r2.f13979
            if (r3 == 0) goto La
            return r3
        La:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Property "
            r0.append(r1)
            java.lang.String r4 = r4.getName()
            r0.append(r4)
            java.lang.String r4 = " should be initialized before get."
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            r3.<init>(r4)
            throw r3
    }

    @Override // Yue.InterfaceC5205
    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public void mo17330(@Yue.InterfaceC4543 java.lang.Object r1, @Yue.InterfaceC4418 Yue.InterfaceC3463<?> r2, @Yue.InterfaceC4418 T r3) {
            r0 = this;
            java.lang.String r1 = "property"
            Yue.C3329.m13906(r2, r1)
            java.lang.String r1 = "value"
            Yue.C3329.m13906(r3, r1)
            r0.f13979 = r3
            return
    }
}
