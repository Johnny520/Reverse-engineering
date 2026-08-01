package p000;

import java.util.HashMap;
import java.util.List;

/* JADX INFO: renamed from: gm */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class C0251gm implements v90 {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f2019d = 0;

    /* JADX INFO: renamed from: e */
    public final Object f2020e;

    /* JADX INFO: renamed from: f */
    public final Object f2021f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0251gm(w90 w90Var) {
        this.f2020e = w90Var;
        C0471me c0471me = C0471me.f3919c;
        Class<?> cls = w90Var.getClass();
        C0389ke c0389ke = (C0389ke) c0471me.f3920a.get(cls);
        this.f2021f = c0389ke == null ? c0471me.m2498a(cls, null) : c0389ke;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.v90
    /* JADX INFO: renamed from: e */
    public final void mo350e(x90 x90Var, q90 q90Var) {
        int i = this.f2019d;
        Object obj = this.f2020e;
        Object obj2 = this.f2021f;
        switch (i) {
            case 0:
                InterfaceC0177em interfaceC0177em = (InterfaceC0177em) obj;
                switch (AbstractC0214fm.f1768a[q90Var.ordinal()]) {
                    case 1:
                        interfaceC0177em.getClass();
                        break;
                    case 2:
                        interfaceC0177em.mo939b(x90Var);
                        break;
                    case 3:
                        interfaceC0177em.mo940c(x90Var);
                        break;
                    case 4:
                        interfaceC0177em.getClass();
                        break;
                    case 5:
                        interfaceC0177em.mo938a(x90Var);
                        break;
                    case 6:
                        interfaceC0177em.getClass();
                        break;
                    case 7:
                        C0921xc.m5131l("ON_ANY must not been send by anybody");
                        break;
                    default:
                        C0921xc.m5129j();
                        break;
                }
                v90 v90Var = (v90) obj2;
                if (v90Var != null) {
                    v90Var.mo350e(x90Var, q90Var);
                }
                break;
            case 1:
                if (q90Var == q90.ON_START) {
                    ((s90) obj).mo4015b(this);
                    ((kx0) obj2).m1963d();
                }
                break;
            case 2:
                vk0 vk0Var = (vk0) obj;
                int i2 = al0.f189a[q90Var.ordinal()];
                if (i2 == 1) {
                    vk0Var.m4759a(true);
                    break;
                } else if (i2 == 2) {
                    vk0Var.m4759a(false);
                    break;
                } else if (i2 == 3) {
                    ri0 ri0Var = vk0Var.f6739c;
                    if (ri0Var != null && ri0Var.f5422c.remove(vk0Var)) {
                        ui0 ui0Var = ri0Var.f5421b;
                        ui0Var.getClass();
                        if (vk0Var == ui0Var.f6233f) {
                            ui0Var.f6233f = null;
                            ui0Var.f6234g = 0;
                            ui0Var.f6235h = null;
                        }
                        ui0Var.f6231d.remove(vk0Var);
                        ui0Var.f6232e.remove(vk0Var);
                        vk0Var.f6739c = null;
                        ui0Var.m4332b();
                    }
                    ((s90) obj2).mo4015b(this);
                    break;
                }
                break;
            default:
                HashMap map = ((C0389ke) obj2).f3085a;
                C0389ke.m1789a((List) map.get(q90Var), x90Var, q90Var, obj);
                C0389ke.m1789a((List) map.get(q90.ON_ANY), x90Var, q90Var, obj);
                break;
        }
    }

    public C0251gm(InterfaceC0177em interfaceC0177em, v90 v90Var) {
        interfaceC0177em.getClass();
        this.f2020e = interfaceC0177em;
        this.f2021f = v90Var;
    }

    public C0251gm(s90 s90Var, kx0 kx0Var) {
        this.f2020e = s90Var;
        this.f2021f = kx0Var;
    }

    public C0251gm(vk0 vk0Var, bl0 bl0Var, s90 s90Var) {
        this.f2020e = vk0Var;
        this.f2021f = s90Var;
    }
}
