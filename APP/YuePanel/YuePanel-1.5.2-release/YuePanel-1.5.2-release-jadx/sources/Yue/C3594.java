package Yue;

import Yue.InterfaceC7317;
import java.util.concurrent.CancellationException;

/* JADX INFO: renamed from: Yue.ۥۣۣ۟ۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public class C3594<E> extends AbstractC2980<C8107> implements InterfaceC6809<E>, InterfaceC3592<E> {

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    @InterfaceC6399
    public final InterfaceC3592<E> f6177;

    public C3594(@InterfaceC6399 InterfaceC4225 interfaceC4225, @InterfaceC6399 InterfaceC3592<E> interfaceC3592, boolean z) {
        super(interfaceC4225, false, z);
        this.f6177 = interfaceC3592;
        m17274((InterfaceC5542) interfaceC4225.get(InterfaceC5542.f13507));
    }

    @Override // Yue.InterfaceC7317
    @InterfaceC4372(level = EnumC0393.f8971, message = "Deprecated in the favour of 'trySend' method", replaceWith = @InterfaceC7097(expression = "trySend(element).isSuccess", imports = {}))
    public boolean offer(E e) {
        return this.f6177.offer(e);
    }

    @Override // Yue.InterfaceC6809
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ */
    public InterfaceC7317<E> mo643() {
        return this;
    }

    @Override // Yue.C5557, Yue.InterfaceC5542, Yue.InterfaceC3592
    @InterfaceC4372(level = EnumC0393.f8972, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    /* JADX INFO: renamed from: ۥ۟۟ */
    public final /* synthetic */ boolean mo6938(Throwable th) {
        if (th == null) {
            th = new C5543(mo5774(), null, this);
        }
        mo9588(th);
        return true;
    }

    @Override // Yue.AbstractC2980, Yue.C5557, Yue.InterfaceC5542
    /* JADX INFO: renamed from: ۥ۟۟۟ */
    public boolean mo5773() {
        return super.mo5773();
    }

    @Override // Yue.C5557, Yue.InterfaceC5542, Yue.InterfaceC3592
    /* JADX INFO: renamed from: ۥ۟۟۟۟ */
    public final void mo6939(@InterfaceC6489 CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new C5543(mo5774(), null, this);
        }
        mo9588(cancellationException);
    }

    @Override // Yue.InterfaceC7317
    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۟۟۠ */
    public Object mo5844(E e, @InterfaceC6399 InterfaceC4199<? super C8107> interfaceC4199) {
        return this.f6177.mo5844(e, interfaceC4199);
    }

    @Override // Yue.InterfaceC7317
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۡ۠ */
    public InterfaceC7288<E, InterfaceC7317<E>> mo5856() {
        return this.f6177.mo5856();
    }

    @Override // Yue.InterfaceC7317
    /* JADX INFO: renamed from: ۥ۟۟ۡۤ */
    public boolean mo6938(@InterfaceC6489 Throwable th) {
        boolean zMo6938 = this.f6177.mo6938(th);
        start();
        return zMo6938;
    }

    @Override // Yue.InterfaceC3592
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۡۥ */
    public InterfaceC7042<E> mo6940() {
        return this.f6177.mo6940();
    }

    @Override // Yue.InterfaceC7317
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۡۨ */
    public Object mo5863(E e) {
        return this.f6177.mo5863(e);
    }

    @Override // Yue.InterfaceC7317
    @InterfaceC4764
    /* JADX INFO: renamed from: ۥ۟۟ۢ۠ */
    public void mo5866(@InterfaceC6399 InterfaceC5124<? super Throwable, C8107> interfaceC5124) {
        this.f6177.mo5866(interfaceC5124);
    }

    @Override // Yue.InterfaceC7317
    /* JADX INFO: renamed from: ۥ۟۟ۢۡ */
    public boolean mo5867() {
        return this.f6177.mo5867();
    }

    @Override // Yue.C5557
    /* JADX INFO: renamed from: ۥۣ۟۟ۨ, reason: contains not printable characters */
    public void mo9588(@InterfaceC6399 Throwable th) {
        CancellationException cancellationExceptionM17248 = C5557.m17248(this, th, null, 1, null);
        this.f6177.mo6939(cancellationExceptionM17248);
        m17255(cancellationExceptionM17248);
    }

    @Override // Yue.AbstractC2980
    /* JADX INFO: renamed from: ۥ۟۠۠ */
    public void mo5779(@InterfaceC6399 Throwable th, boolean z) {
        if (this.f6177.mo6938(th) || z) {
            return;
        }
        C4236.m1201(getContext(), th);
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۠۠ۡ, reason: contains not printable characters */
    public final InterfaceC3592<E> m9589() {
        return this.f6177;
    }

    /* JADX DEBUG: Method merged with bridge method: ۥ۟۠۠۟(Ljava/lang/Object;)V */
    @Override // Yue.AbstractC2980
    /* JADX INFO: renamed from: ۥ۟۠۠ۢ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public void mo5780(@InterfaceC6399 C8107 c8107) {
        InterfaceC7317.C1231.m3566(this.f6177, null, 1, null);
    }
}
