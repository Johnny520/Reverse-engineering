package Yue;

import Yue.C4371;

/* JADX INFO: renamed from: Yue.ۥ۠۟ۡۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C4401 extends C4371 {

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public int f9074;

    public C4401(AbstractC8432 abstractC8432) {
        super(abstractC8432);
        if (abstractC8432 instanceof C5316) {
            this.f8953 = C4371.EnumC0392.HORIZONTAL_DIMENSION;
        } else {
            this.f8953 = C4371.EnumC0392.VERTICAL_DIMENSION;
        }
    }

    @Override // Yue.C4371
    /* JADX INFO: renamed from: ۥ۟۟۟۟ */
    public void mo12660(int i) {
        if (this.f8958) {
            return;
        }
        this.f8958 = true;
        this.f8955 = i;
        for (InterfaceC4369 interfaceC4369 : this.f8959) {
            interfaceC4369.mo767(interfaceC4369);
        }
    }
}
