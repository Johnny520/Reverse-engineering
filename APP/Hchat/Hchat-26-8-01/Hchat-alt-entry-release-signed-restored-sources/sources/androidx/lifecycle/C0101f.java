package androidx.lifecycle;

import java.util.HashMap;
import java.util.List;
import okio.C3193a;
import p136j8.C2104o;

/* JADX INFO: renamed from: androidx.lifecycle.f */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0101f implements InterfaceC0110o {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f285g = 0;

    /* JADX INFO: renamed from: h */
    public final Object f286h;

    /* JADX INFO: renamed from: i */
    public final Object f287i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0101f(InterfaceC0111p interfaceC0111p) {
        this.f286h = interfaceC0111p;
        C0095c c0095c = C0095c.f277c;
        Class<?> cls = interfaceC0111p.getClass();
        C0091a c0091a = (C0091a) c0095c.f278a.get(cls);
        this.f287i = c0091a == null ? c0095c.m540a(cls, null) : c0091a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // androidx.lifecycle.InterfaceC0110o
    /* JADX INFO: renamed from: b */
    public final void mo548b(InterfaceC0112q interfaceC0112q, EnumC0106k enumC0106k) {
        switch (this.f285g) {
            case 0:
                InterfaceC0097d interfaceC0097d = (InterfaceC0097d) this.f286h;
                switch (AbstractC0099e.f283a[enumC0106k.ordinal()]) {
                    case 1:
                        interfaceC0097d.getClass();
                        break;
                    case 2:
                        interfaceC0097d.mo153d(interfaceC0112q);
                        break;
                    case 3:
                        interfaceC0097d.mo542a(interfaceC0112q);
                        break;
                    case 4:
                        interfaceC0097d.getClass();
                        break;
                    case 5:
                        interfaceC0097d.mo152c(interfaceC0112q);
                        break;
                    case 6:
                        interfaceC0097d.getClass();
                        break;
                    case 7:
                        C2104o.m5294t("ON_ANY must not been send by anybody");
                        break;
                    default:
                        C3193a.m6822k();
                        break;
                }
                InterfaceC0110o interfaceC0110o = (InterfaceC0110o) this.f287i;
                if (interfaceC0110o != null) {
                    interfaceC0110o.mo548b(interfaceC0112q, enumC0106k);
                }
                break;
            default:
                HashMap map = ((C0091a) this.f287i).f273a;
                List list = (List) map.get(enumC0106k);
                Object obj = this.f286h;
                C0091a.m508a(list, interfaceC0112q, enumC0106k, obj);
                C0091a.m508a((List) map.get(EnumC0106k.ON_ANY), interfaceC0112q, enumC0106k, obj);
                break;
        }
    }

    public C0101f(InterfaceC0097d interfaceC0097d, InterfaceC0110o interfaceC0110o) {
        interfaceC0097d.getClass();
        this.f286h = interfaceC0097d;
        this.f287i = interfaceC0110o;
    }
}
