package Yue;

/* JADX INFO: renamed from: Yue.ۥۡۥ۠ۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC6792<T> {

    /* JADX INFO: renamed from: ۥ */
    public final int f2317;

    /* JADX INFO: renamed from: ۥ۟ */
    public int f2318;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    @InterfaceC6399
    public final T[] f17631;

    public AbstractC6792(int i) {
        this.f2317 = i;
        this.f17631 = (T[]) new Object[i];
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static /* synthetic */ void m21490() {
    }

    /* JADX INFO: renamed from: ۥ */
    public final void m3254(@InterfaceC6399 T t) {
        C5499.m17103(t, "spreadArgument");
        T[] tArr = this.f17631;
        int i = this.f2318;
        this.f2318 = i + 1;
        tArr[i] = t;
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public final int m3255() {
        return this.f2318;
    }

    /* JADX INFO: renamed from: ۥ۟۟ */
    public abstract int mo9559(@InterfaceC6399 T t);

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public final void m21491(int i) {
        this.f2318 = i;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public final int m21492() {
        int iMo9559 = 0;
        AbstractC5455 it = new C5458(0, this.f2317 - 1).iterator();
        while (it.hasNext()) {
            T t = this.f17631[it.mo471()];
            iMo9559 += t != null ? mo9559(t) : 1;
        }
        return iMo9559;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public final T m21493(@InterfaceC6399 T t, @InterfaceC6399 T t2) {
        C5499.m17103(t, "values");
        C5499.m17103(t2, "result");
        AbstractC5455 it = new C5458(0, this.f2317 - 1).iterator();
        int i = 0;
        int i2 = 0;
        while (it.hasNext()) {
            int iMo471 = it.mo471();
            T t3 = this.f17631[iMo471];
            if (t3 != null) {
                if (i < iMo471) {
                    int i3 = iMo471 - i;
                    System.arraycopy(t, i, t2, i2, i3);
                    i2 += i3;
                }
                int iMo9559 = mo9559(t3);
                System.arraycopy(t3, 0, t2, i2, iMo9559);
                i2 += iMo9559;
                i = iMo471 + 1;
            }
        }
        int i4 = this.f2317;
        if (i < i4) {
            System.arraycopy(t, i, t2, i2, i4 - i);
        }
        return t2;
    }
}
