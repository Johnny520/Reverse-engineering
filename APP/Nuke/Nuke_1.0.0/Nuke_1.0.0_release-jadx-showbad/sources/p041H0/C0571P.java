package p041H0;

import java.util.Map;
import p029F0.InterfaceC0378P;
import p112W2.InterfaceC1601c;

/* JADX INFO: renamed from: H0.P */
/* JADX INFO: loaded from: classes.dex */
public final class C0571P implements InterfaceC0378P {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f1770a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f1771b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Map f1772c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ InterfaceC1601c f1773d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ InterfaceC1601c f1774e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ AbstractC0572Q f1775f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0571P(int i5, int i6, Map map, InterfaceC1601c interfaceC1601c, InterfaceC1601c interfaceC1601c2, AbstractC0572Q abstractC0572Q) {
        this.f1770a = i5;
        this.f1771b = i6;
        this.f1772c = map;
        this.f1773d = interfaceC1601c;
        this.f1774e = interfaceC1601c2;
        this.f1775f = abstractC0572Q;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p029F0.InterfaceC0378P
    /* JADX INFO: renamed from: a */
    public final Map mo607a() {
        return this.f1772c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p029F0.InterfaceC0378P
    /* JADX INFO: renamed from: b */
    public final void mo608b() {
        this.f1774e.mo1h(this.f1775f.f1782o);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p029F0.InterfaceC0378P
    /* JADX INFO: renamed from: c */
    public final int mo609c() {
        return this.f1771b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p029F0.InterfaceC0378P
    /* JADX INFO: renamed from: d */
    public final InterfaceC1601c mo610d() {
        return this.f1773d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p029F0.InterfaceC0378P
    /* JADX INFO: renamed from: e */
    public final int mo611e() {
        return this.f1770a;
    }
}
