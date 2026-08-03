package Yue;

import Yue.AbstractC3017;
import Yue.C7148;
import java.util.Arrays;

/* JADX INFO: renamed from: Yue.ۥ۟۟ۢۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC3015<S extends AbstractC3017<?>> {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    @InterfaceC6489
    public S[] f4378;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public int f4379;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public int f4380;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    @InterfaceC6489
    public C7669 f4381;

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public static /* synthetic */ void m5883() {
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public final S m5884() {
        S s;
        C7669 c7669;
        synchronized (this) {
            try {
                S[] sArr = this.f4378;
                if (sArr == null) {
                    sArr = (S[]) mo5886(2);
                    this.f4378 = sArr;
                } else if (this.f4379 >= sArr.length) {
                    Object[] objArrCopyOf = Arrays.copyOf(sArr, sArr.length * 2);
                    C5499.m17102(objArrCopyOf, "copyOf(this, newSize)");
                    this.f4378 = (S[]) ((AbstractC3017[]) objArrCopyOf);
                    sArr = (S[]) ((AbstractC3017[]) objArrCopyOf);
                }
                int i = this.f4380;
                do {
                    s = sArr[i];
                    if (s == null) {
                        s = (S) mo5885();
                        sArr[i] = s;
                    }
                    i++;
                    if (i >= sArr.length) {
                        i = 0;
                    }
                } while (!s.mo79(this));
                this.f4380 = i;
                this.f4379++;
                c7669 = this.f4381;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (c7669 != null) {
            c7669.m24405(1);
        }
        return s;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public abstract S mo5885();

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public abstract S[] mo5886(int i);

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public final void m5887(@InterfaceC6399 InterfaceC5124<? super S, C8107> interfaceC5124) {
        AbstractC3017[] abstractC3017Arr;
        if (this.f4379 == 0 || (abstractC3017Arr = this.f4378) == null) {
            return;
        }
        for (AbstractC3017 abstractC3017 : abstractC3017Arr) {
            if (abstractC3017 != null) {
                interfaceC5124.invoke(abstractC3017);
            }
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public final void m5888(@InterfaceC6399 S s) {
        C7669 c7669;
        int i;
        InterfaceC4199<C8107>[] interfaceC4199ArrMo80;
        synchronized (this) {
            try {
                int i2 = this.f4379 - 1;
                this.f4379 = i2;
                c7669 = this.f4381;
                if (i2 == 0) {
                    this.f4380 = 0;
                }
                interfaceC4199ArrMo80 = s.mo80(this);
            } catch (Throwable th) {
                throw th;
            }
        }
        for (InterfaceC4199<C8107> interfaceC4199 : interfaceC4199ArrMo80) {
            if (interfaceC4199 != null) {
                C7148.C1189 c1189 = C7148.f21560;
                interfaceC4199.resumeWith(C7148.m3438(C8107.f3222));
            }
        }
        if (c7669 != null) {
            c7669.m24405(-1);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public final int m5889() {
        return this.f4379;
    }

    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public final S[] m5890() {
        return this.f4378;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public final InterfaceC7588<Integer> m5891() {
        C7669 c7669;
        synchronized (this) {
            c7669 = this.f4381;
            if (c7669 == null) {
                c7669 = new C7669(this.f4379);
                this.f4381 = c7669;
            }
        }
        return c7669;
    }
}
