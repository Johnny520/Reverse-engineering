package Yue;

/* JADX INFO: renamed from: Yue.ۥۢۡۡۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C6183<T> implements Yue.InterfaceC6176<T> {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public final T f22158;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public final java.lang.ThreadLocal<T> f22159;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public final Yue.InterfaceC1632.InterfaceC1637<?> f22160;

    public C6183(T r1, @Yue.InterfaceC4418 java.lang.ThreadLocal<T> r2) {
            r0 = this;
            r0.<init>()
            r0.f22158 = r1
            r0.f22159 = r2
            Yue.ۥۢۡۢ r1 = new Yue.ۥۢۡۢ
            r1.<init>(r2)
            r0.f22160 = r1
            return
    }

    @Override // Yue.InterfaceC1632.InterfaceC1635, Yue.InterfaceC1632
    public <R> R fold(R r1, @Yue.InterfaceC4418 Yue.InterfaceC2839<? super R, ? super Yue.InterfaceC1632.InterfaceC1635, ? extends R> r2) {
            r0 = this;
            java.lang.Object r1 = Yue.InterfaceC6176.C6177.m23119(r0, r1, r2)
            return r1
    }

    @Override // Yue.InterfaceC1632.InterfaceC1635, Yue.InterfaceC1632
    @Yue.InterfaceC4543
    public <E extends Yue.InterfaceC1632.InterfaceC1635> E get(@Yue.InterfaceC4418 Yue.InterfaceC1632.InterfaceC1637<E> r2) {
            r1 = this;
            Yue.ۥ۟ۧۦۥ$ۥ۟۟ r0 = r1.getKey()
            boolean r2 = Yue.C3329.m13897(r0, r2)
            if (r2 == 0) goto Lc
            r2 = r1
            goto Ld
        Lc:
            r2 = 0
        Ld:
            return r2
    }

    @Override // Yue.InterfaceC1632.InterfaceC1635
    @Yue.InterfaceC4418
    public Yue.InterfaceC1632.InterfaceC1637<?> getKey() {
            r1 = this;
            Yue.ۥ۟ۧۦۥ$ۥ۟۟<?> r0 = r1.f22160
            return r0
    }

    @Override // Yue.InterfaceC1632.InterfaceC1635, Yue.InterfaceC1632
    @Yue.InterfaceC4418
    public Yue.InterfaceC1632 minusKey(@Yue.InterfaceC4418 Yue.InterfaceC1632.InterfaceC1637<?> r2) {
            r1 = this;
            Yue.ۥ۟ۧۦۥ$ۥ۟۟ r0 = r1.getKey()
            boolean r2 = Yue.C3329.m13897(r0, r2)
            if (r2 == 0) goto Ld
            Yue.ۥ۠۠ۧۦ r2 = Yue.C2141.f6728
            goto Le
        Ld:
            r2 = r1
        Le:
            return r2
    }

    @Override // Yue.InterfaceC1632
    @Yue.InterfaceC4418
    public Yue.InterfaceC1632 plus(@Yue.InterfaceC4418 Yue.InterfaceC1632 r1) {
            r0 = this;
            Yue.ۥ۟ۧۦۥ r1 = Yue.InterfaceC6176.C6177.m23122(r0, r1)
            return r1
    }

    @Yue.InterfaceC4418
    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "ThreadLocal(value="
            r0.append(r1)
            T r1 = r2.f22158
            r0.append(r1)
            java.lang.String r1 = ", threadLocal = "
            r0.append(r1)
            java.lang.ThreadLocal<T> r1 = r2.f22159
            r0.append(r1)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // Yue.InterfaceC6176
    /* JADX INFO: renamed from: ۥ۟۟ۡۦ */
    public T mo7936(@Yue.InterfaceC4418 Yue.InterfaceC1632 r3) {
            r2 = this;
            java.lang.ThreadLocal<T> r3 = r2.f22159
            java.lang.Object r3 = r3.get()
            java.lang.ThreadLocal<T> r0 = r2.f22159
            T r1 = r2.f22158
            r0.set(r1)
            return r3
    }

    @Override // Yue.InterfaceC6176
    /* JADX INFO: renamed from: ۥ۟۟ۢۨ */
    public void mo7937(@Yue.InterfaceC4418 Yue.InterfaceC1632 r1, T r2) {
            r0 = this;
            java.lang.ThreadLocal<T> r1 = r0.f22159
            r1.set(r2)
            return
    }
}
