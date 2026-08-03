package Yue;

/* JADX INFO: renamed from: Yue.ۥۣۡۨۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C7435 extends AbstractC3017<C7432<?>> {

    /* JADX INFO: renamed from: ۥ */
    @InterfaceC5568
    public long f2882 = -1;

    /* JADX INFO: renamed from: ۥ۟ */
    @InterfaceC5568
    @InterfaceC6489
    public InterfaceC4199<? super C8107> f2883;

    /* JADX DEBUG: Method merged with bridge method: ۥ(Ljava/lang/Object;)Z */
    @Override // Yue.AbstractC3017
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public boolean mo79(@InterfaceC6399 C7432<?> c7432) {
        if (this.f2882 >= 0) {
            return false;
        }
        this.f2882 = c7432.m23308();
        return true;
    }

    /* JADX DEBUG: Method merged with bridge method: ۥ۟(Ljava/lang/Object;)[LYue/ۥ۟ۧۤۢ; */
    @Override // Yue.AbstractC3017
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public InterfaceC4199<C8107>[] mo80(@InterfaceC6399 C7432<?> c7432) {
        long j = this.f2882;
        this.f2882 = -1L;
        this.f2883 = null;
        return c7432.m23307(j);
    }
}
