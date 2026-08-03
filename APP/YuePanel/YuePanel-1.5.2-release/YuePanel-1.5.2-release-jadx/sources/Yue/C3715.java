package Yue;

import java.util.concurrent.CancellationException;

/* JADX INFO: renamed from: Yue.ۥ۟ۤۡ۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public class C3715<E> extends AbstractC2980<C8107> implements InterfaceC3713<E> {

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    @InterfaceC6399
    public final InterfaceC3713<E> f6620;

    public C3715(@InterfaceC6399 InterfaceC4225 interfaceC4225, @InterfaceC6399 InterfaceC3713<E> interfaceC3713, boolean z, boolean z2) {
        super(interfaceC4225, z, z2);
        this.f6620 = interfaceC3713;
    }

    @Override // Yue.C5557, Yue.InterfaceC5542, Yue.InterfaceC7042
    public /* synthetic */ void cancel() {
        mo9588(new C5543(mo5774(), null, this));
    }

    @Override // Yue.InterfaceC7042
    public boolean isEmpty() {
        return this.f6620.isEmpty();
    }

    @Override // Yue.InterfaceC7042
    @InterfaceC6399
    public InterfaceC3728<E> iterator() {
        return this.f6620.iterator();
    }

    @Override // Yue.InterfaceC7317
    @InterfaceC4372(level = EnumC0393.f8971, message = "Deprecated in the favour of 'trySend' method", replaceWith = @InterfaceC7097(expression = "trySend(element).isSuccess", imports = {}))
    public boolean offer(E e) {
        return this.f6620.offer(e);
    }

    @Override // Yue.InterfaceC7042
    @InterfaceC4372(level = EnumC0393.f8971, message = "Deprecated in the favour of 'tryReceive'. Please note that the provided replacement does not rethrow channel's close cause as 'poll' did, for the precise replacement please refer to the 'poll' documentation", replaceWith = @InterfaceC7097(expression = "tryReceive().getOrNull()", imports = {}))
    @InterfaceC6489
    public E poll() {
        return this.f6620.poll();
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ */
    public final InterfaceC3713<E> m798() {
        return this;
    }

    @Override // Yue.C5557, Yue.InterfaceC5542, Yue.InterfaceC3592
    @InterfaceC4372(level = EnumC0393.f8972, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    /* JADX INFO: renamed from: ۥ۟۟ */
    public final /* synthetic */ boolean mo6938(Throwable th) {
        mo9588(new C5543(mo5774(), null, this));
        return true;
    }

    @Override // Yue.C5557, Yue.InterfaceC5542, Yue.InterfaceC3592
    /* JADX INFO: renamed from: ۥ۟۟۟۟ */
    public final void mo6939(@InterfaceC6489 CancellationException cancellationException) {
        if (isCancelled()) {
            return;
        }
        if (cancellationException == null) {
            cancellationException = new C5543(mo5774(), null, this);
        }
        mo9588(cancellationException);
    }

    @Override // Yue.InterfaceC7317
    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۟۟۠ */
    public Object mo5844(E e, @InterfaceC6399 InterfaceC4199<? super C8107> interfaceC4199) {
        return this.f6620.mo5844(e, interfaceC4199);
    }

    @Override // Yue.InterfaceC7042
    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ */
    public Object mo5719(@InterfaceC6399 InterfaceC4199<? super E> interfaceC4199) {
        return this.f6620.mo5719(interfaceC4199);
    }

    @Override // Yue.InterfaceC7042
    /* JADX INFO: renamed from: ۥ۟۟۟ۤ */
    public boolean mo5720() {
        return this.f6620.mo5720();
    }

    @Override // Yue.InterfaceC7042
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟ۦ */
    public InterfaceC7287<E> mo5721() {
        return this.f6620.mo5721();
    }

    @Override // Yue.InterfaceC7042
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟ۧ */
    public InterfaceC7287<C3732<E>> mo5722() {
        return this.f6620.mo5722();
    }

    @Override // Yue.InterfaceC7042
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۠۟ */
    public InterfaceC7287<E> mo5723() {
        return this.f6620.mo5723();
    }

    @Override // Yue.InterfaceC7042
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥۣ۟۟۠ */
    public Object mo5724() {
        return this.f6620.mo5724();
    }

    @Override // Yue.InterfaceC7042
    @InterfaceC5890
    @InterfaceC4372(level = EnumC0393.f8971, message = "Deprecated in favor of 'receiveCatching'. Please note that the provided replacement does not rethrow channel's close cause as 'receiveOrNull' did, for the detailed replacement please refer to the 'receiveOrNull' documentation", replaceWith = @InterfaceC7097(expression = "receiveCatching().getOrNull()", imports = {}))
    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۟۠ۤ */
    public Object mo5725(@InterfaceC6399 InterfaceC4199<? super E> interfaceC4199) {
        return this.f6620.mo5725(interfaceC4199);
    }

    @Override // Yue.InterfaceC7042
    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۟۠ۧ */
    public Object mo5726(@InterfaceC6399 InterfaceC4199<? super C3732<? extends E>> interfaceC4199) {
        Object objMo5726 = this.f6620.mo5726(interfaceC4199);
        C5508.m17142();
        return objMo5726;
    }

    @Override // Yue.InterfaceC7317
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۡ۠ */
    public InterfaceC7288<E, InterfaceC7317<E>> mo5856() {
        return this.f6620.mo5856();
    }

    @Override // Yue.InterfaceC7317
    /* JADX INFO: renamed from: ۥ۟۟ۡۤ */
    public boolean mo6938(@InterfaceC6489 Throwable th) {
        return this.f6620.mo6938(th);
    }

    @Override // Yue.InterfaceC7317
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۡۨ */
    public Object mo5863(E e) {
        return this.f6620.mo5863(e);
    }

    @Override // Yue.InterfaceC7317
    @InterfaceC4764
    /* JADX INFO: renamed from: ۥ۟۟ۢ۠ */
    public void mo5866(@InterfaceC6399 InterfaceC5124<? super Throwable, C8107> interfaceC5124) {
        this.f6620.mo5866(interfaceC5124);
    }

    @Override // Yue.InterfaceC7317
    /* JADX INFO: renamed from: ۥ۟۟ۢۡ */
    public boolean mo5867() {
        return this.f6620.mo5867();
    }

    @Override // Yue.C5557
    /* JADX INFO: renamed from: ۥۣ۟۟ۨ */
    public void mo9588(@InterfaceC6399 Throwable th) {
        CancellationException cancellationExceptionM17248 = C5557.m17248(this, th, null, 1, null);
        this.f6620.mo5718(cancellationExceptionM17248);
        m17255(cancellationExceptionM17248);
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۠۠ۡ, reason: contains not printable characters */
    public final InterfaceC3713<E> m10176() {
        return this.f6620;
    }
}
