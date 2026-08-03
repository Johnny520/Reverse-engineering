package Yue;

import Yue.C5850;
import net.bytebuddy.pool.TypePool;

/* JADX INFO: renamed from: Yue.ۥ۟ۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C3850<E> extends AbstractC7312 implements InterfaceC7046<E> {

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    @InterfaceC5568
    @InterfaceC6489
    public final Throwable f7349;

    public C3850(@InterfaceC6489 Throwable th) {
        this.f7349 = th;
    }

    @Override // Yue.C5850
    @InterfaceC6399
    public String toString() {
        return "Closed@" + C4325.m1289(this) + TypePool.Default.LazyTypeDescription.GenericTypeToken.COMPONENT_TYPE_PATH + this.f7349 + ']';
    }

    @Override // Yue.InterfaceC7046
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۠ۤ */
    public C7694 mo5752(E e, @InterfaceC6489 C5850.C5852 c5852) {
        C7694 c7694 = C3667.f6491;
        if (c5852 != null) {
            c5852.m18124();
        }
        return c7694;
    }

    @Override // Yue.InterfaceC7046
    /* JADX INFO: renamed from: ۥ۟۟ۡۧ */
    public void mo5753(E e) {
    }

    @Override // Yue.AbstractC7312
    /* JADX INFO: renamed from: ۥ۟۟ۦۤ */
    public void mo5874() {
    }

    @Override // Yue.AbstractC7312
    /* JADX INFO: renamed from: ۥ۟۟ۦۦ */
    public void mo5876(@InterfaceC6399 C3850<?> c3850) {
    }

    @Override // Yue.AbstractC7312
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۦۧ */
    public C7694 mo5877(@InterfaceC6489 C5850.C5852 c5852) {
        C7694 c7694 = C3667.f6491;
        if (c5852 != null) {
            c5852.m18124();
        }
        return c7694;
    }

    /* JADX DEBUG: Method merged with bridge method: ۥ۟۟۠ۥ()Ljava/lang/Object; */
    @Override // Yue.InterfaceC7046
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۧ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public C3850<E> mo10654() {
        return this;
    }

    /* JADX DEBUG: Method merged with bridge method: ۥ۟۟ۦۥ()Ljava/lang/Object; */
    @Override // Yue.AbstractC7312
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۧ۟, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public C3850<E> mo5875() {
        return this;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۧ۠, reason: contains not printable characters */
    public final Throwable m10657() {
        Throwable th = this.f7349;
        return th == null ? new C3855(C3734.f497) : th;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۧۡ, reason: contains not printable characters */
    public final Throwable m10658() {
        Throwable th = this.f7349;
        return th == null ? new C3856(C3734.f497) : th;
    }
}
