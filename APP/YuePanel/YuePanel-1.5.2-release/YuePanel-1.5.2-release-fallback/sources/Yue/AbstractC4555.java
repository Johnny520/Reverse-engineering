package Yue;

/* JADX INFO: renamed from: Yue.ۥۡۢۨ۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4555<V> implements Yue.InterfaceC5205<java.lang.Object, V> {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public V f14552;

    public AbstractC4555(V r1) {
            r0 = this;
            r0.<init>()
            r0.f14552 = r1
            return
    }

    @Yue.InterfaceC4418
    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "ObservableProperty(value="
            r0.append(r1)
            V r1 = r2.f14552
            r0.append(r1)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // Yue.InterfaceC5205, Yue.InterfaceC5203
    /* JADX INFO: renamed from: ۥ */
    public V mo17329(@Yue.InterfaceC4543 java.lang.Object r1, @Yue.InterfaceC4418 Yue.InterfaceC3463<?> r2) {
            r0 = this;
            java.lang.String r1 = "property"
            Yue.C3329.m13906(r2, r1)
            V r1 = r0.f14552
            return r1
    }

    @Override // Yue.InterfaceC5205
    /* JADX INFO: renamed from: ۥ۟ */
    public void mo17330(@Yue.InterfaceC4543 java.lang.Object r2, @Yue.InterfaceC4418 Yue.InterfaceC3463<?> r3, V r4) {
            r1 = this;
            java.lang.String r2 = "property"
            Yue.C3329.m13906(r3, r2)
            V r2 = r1.f14552
            boolean r0 = r1.mo8498(r3, r2, r4)
            if (r0 != 0) goto Le
            return
        Le:
            r1.f14552 = r4
            r1.mo8497(r3, r2, r4)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ */
    public void mo8497(@Yue.InterfaceC4418 Yue.InterfaceC3463<?> r1, V r2, V r3) {
            r0 = this;
            java.lang.String r2 = "property"
            Yue.C3329.m13906(r1, r2)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ */
    public boolean mo8498(@Yue.InterfaceC4418 Yue.InterfaceC3463<?> r1, V r2, V r3) {
            r0 = this;
            java.lang.String r2 = "property"
            Yue.C3329.m13906(r1, r2)
            r1 = 1
            return r1
    }
}
