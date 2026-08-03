package Yue;

/* JADX INFO: renamed from: Yue.ۥ۟ۡۨۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public class C3395<T> {

    /* JADX INFO: renamed from: ۥ */
    @InterfaceC6399
    public Object[] f268 = new Object[16];

    /* JADX INFO: renamed from: ۥ۟ */
    public int f269;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public int f5467;

    /* JADX INFO: renamed from: ۥ */
    public final void m482(@InterfaceC6399 T t) {
        Object[] objArr = this.f268;
        int i = this.f5467;
        objArr[i] = t;
        int length = (objArr.length - 1) & (i + 1);
        this.f5467 = length;
        if (length == this.f269) {
            m7010();
        }
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public final void m483() {
        this.f269 = 0;
        this.f5467 = 0;
        this.f268 = new Object[this.f268.length];
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final void m7010() {
        Object[] objArr = this.f268;
        int length = objArr.length;
        Object[] objArr2 = new Object[length << 1];
        C3404.m7138(objArr, objArr2, 0, this.f269, 0, 10, null);
        Object[] objArr3 = this.f268;
        int length2 = objArr3.length;
        int i = this.f269;
        C3404.m7138(objArr3, objArr2, length2 - i, 0, i, 4, null);
        this.f268 = objArr2;
        this.f269 = 0;
        this.f5467 = length;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public final boolean m7011() {
        return this.f269 == this.f5467;
    }

    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public final T m7012() {
        int i = this.f269;
        if (i == this.f5467) {
            return null;
        }
        Object[] objArr = this.f268;
        T t = (T) objArr[i];
        objArr[i] = null;
        this.f269 = (i + 1) & (objArr.length - 1);
        if (t != null) {
            return t;
        }
        throw new NullPointerException("null cannot be cast to non-null type T of kotlinx.coroutines.internal.ArrayQueue");
    }
}
