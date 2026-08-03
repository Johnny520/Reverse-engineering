package p000;

/* JADX INFO: renamed from: Ip */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0376Ip implements InterfaceC1416fj {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f1306a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0762Rp f1307b;

    public /* synthetic */ C0376Ip(C0762Rp c0762Rp, int i) {
        this.f1306a = i;
        this.f1307b = c0762Rp;
    }

    @Override // p000.InterfaceC1416fj
    /* JADX INFO: renamed from: g */
    public final Object mo90g(Object obj) {
        final String str = (String) obj;
        switch (this.f1306a) {
            case 0:
                AbstractC0295Gu.m625r(-483544598050869L);
                final C0762Rp c0762Rp = this.f1307b;
                final int i = 0;
                c0762Rp.f2416h.post(new Runnable() { // from class: Mp
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i) {
                            case 0:
                                c0762Rp.m1559a(str + '\n');
                                break;
                            default:
                                c0762Rp.m1559a(str + '\n');
                                break;
                        }
                    }
                });
                break;
            default:
                AbstractC0295Gu.m625r(-483716396742709L);
                final C0762Rp c0762Rp2 = this.f1307b;
                final int i2 = 1;
                c0762Rp2.f2416h.post(new Runnable() { // from class: Mp
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i2) {
                            case 0:
                                c0762Rp2.m1559a(str + '\n');
                                break;
                            default:
                                c0762Rp2.m1559a(str + '\n');
                                break;
                        }
                    }
                });
                break;
        }
        return C0829TC.f2620a;
    }
}
