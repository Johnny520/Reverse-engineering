package p001;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: ۟.ba */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0159ba {

    /* JADX INFO: renamed from: ۥ */
    public final AtomicBoolean f710 = new AtomicBoolean(false);

    /* JADX INFO: renamed from: ۥ۟ */
    public final AbstractC0144a9 f711;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public volatile InterfaceC0202eb f1339;

    public AbstractC0159ba(AbstractC0144a9 abstractC0144a9) {
        this.f711 = abstractC0144a9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: ۥ */
    public final InterfaceC0202eb m825() {
        this.f711.m808();
        if (!this.f710.compareAndSet(false, true)) {
            String strMo826 = mo826();
            AbstractC0144a9 abstractC0144a9 = this.f711;
            abstractC0144a9.m808();
            abstractC0144a9.m809();
            return abstractC0144a9.f1305.mo1024().mo998(strMo826);
        }
        if (this.f1339 == null) {
            String strMo8262 = mo826();
            AbstractC0144a9 abstractC0144a92 = this.f711;
            abstractC0144a92.m808();
            abstractC0144a92.m809();
            this.f1339 = abstractC0144a92.f1305.mo1024().mo998(strMo8262);
        }
        return this.f1339;
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public abstract String mo826();

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final void m1023(InterfaceC0202eb interfaceC0202eb) {
        if (interfaceC0202eb == this.f1339) {
            this.f710.set(false);
        }
    }
}
