package Yue;

/* JADX INFO: renamed from: Yue.ۥۢۡۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class RunnableC7829<U, T extends U> extends C7242<T> implements Runnable {

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    @InterfaceC5568
    public final long f23437;

    public RunnableC7829(long j, @InterfaceC6399 InterfaceC4199<? super U> interfaceC4199) {
        super(interfaceC4199.getContext(), interfaceC4199);
        this.f23437 = j;
    }

    @Override // java.lang.Runnable
    public void run() {
        m17255(C7830.m3924(this.f23437, this));
    }

    @Override // Yue.AbstractC2980, Yue.C5557
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۧۦ */
    public String mo5776() {
        return super.mo5776() + "(timeMillis=" + this.f23437 + ')';
    }
}
