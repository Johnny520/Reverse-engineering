package p015b0;

import okio.C3193a;
import p036c9.AbstractC0473o2;
import p036c9.EnumC0432e1;
import p085fg.InterfaceC1220a;
import p117i0.InterfaceC1809a1;
import p201o.AbstractC3026b;
import p276sf.C3967n;
import p308v1.InterfaceC4428t;
import p332wb.C5457x0;
import p332wb.C5489y0;

/* JADX INFO: renamed from: b0.j */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0144j implements InterfaceC1220a {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f381g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ InterfaceC1809a1 f382h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C0144j(InterfaceC1809a1 interfaceC1809a1, int i9) {
        this.f381g = i9;
        this.f382h = interfaceC1809a1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1220a
    public final Object invoke() {
        switch (this.f381g) {
            case 0:
                InterfaceC4428t interfaceC4428t = (InterfaceC4428t) this.f382h.getValue();
                if (interfaceC4428t == null) {
                    AbstractC3026b.m6431d("Required value was null.");
                    C3193a.m6814c();
                    break;
                }
                break;
            case 1:
                InterfaceC4428t interfaceC4428t2 = (InterfaceC4428t) this.f382h.getValue();
                if (interfaceC4428t2 == null) {
                    AbstractC3026b.m6431d("Required value was null.");
                    C3193a.m6814c();
                    break;
                }
                break;
            case 2:
                this.f382h.setValue(EnumC0432e1.f1269h);
                break;
            case 3:
                this.f382h.setValue(EnumC0432e1.f1269h);
                break;
            case 4:
                this.f382h.setValue(EnumC0432e1.f1269h);
                break;
            case 5:
                this.f382h.setValue(EnumC0432e1.f1271j);
                break;
            case 6:
                this.f382h.setValue(EnumC0432e1.f1269h);
                break;
            case 7:
                this.f382h.setValue(EnumC0432e1.f1269h);
                break;
            case 8:
                this.f382h.setValue(EnumC0432e1.f1274m);
                break;
            case 9:
                this.f382h.setValue(EnumC0432e1.f1268g);
                break;
            case 10:
                InterfaceC4428t interfaceC4428t3 = (InterfaceC4428t) this.f382h.getValue();
                if (interfaceC4428t3 == null) {
                    AbstractC3026b.m6431d("Required value was null.");
                    C3193a.m6814c();
                    break;
                }
                break;
            case 11:
                break;
            case 12:
                break;
            case 13:
                InterfaceC1220a interfaceC1220a = (InterfaceC1220a) this.f382h.getValue();
                if (interfaceC1220a != null) {
                    interfaceC1220a.invoke();
                }
                break;
            case 14:
                InterfaceC1809a1 interfaceC1809a1 = this.f382h;
                if (interfaceC1809a1 != null) {
                }
                break;
            case 15:
                Boolean bool = (Boolean) this.f382h.getValue();
                bool.booleanValue();
                break;
            case 16:
                this.f382h.setValue(Boolean.FALSE);
                break;
            case 17:
                this.f382h.setValue(Boolean.FALSE);
                break;
            case 18:
                this.f382h.setValue(Boolean.TRUE);
                break;
            case 19:
                this.f382h.setValue(new C5457x0(AbstractC0473o2.m1487k(null), false));
                break;
            case 20:
                this.f382h.setValue(C5489y0.f22055a);
                break;
            case 21:
                this.f382h.setValue(Boolean.TRUE);
                break;
            case 22:
                this.f382h.setValue(Boolean.valueOf(!((Boolean) r0.getValue()).booleanValue()));
                break;
            case 23:
                this.f382h.setValue(Boolean.FALSE);
                break;
            case 24:
                this.f382h.setValue(null);
                break;
            case 25:
                this.f382h.setValue(Boolean.FALSE);
                break;
            case 26:
                this.f382h.setValue(Boolean.FALSE);
                break;
            case 27:
                this.f382h.setValue(null);
                break;
            case 28:
                this.f382h.setValue(null);
                break;
            default:
                this.f382h.setValue(null);
                break;
        }
        return C3967n.f12976a;
    }
}
