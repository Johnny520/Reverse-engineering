package androidx.activity;

import androidx.lifecycle.AbstractC2402;
import androidx.lifecycle.AbstractC2413;
import androidx.lifecycle.C2392;
import androidx.lifecycle.C2394;
import androidx.lifecycle.InterfaceC2380;
import androidx.lifecycle.InterfaceC2388;
import androidx.lifecycle.InterfaceC2389;
import androidx.lifecycle.InterfaceC2409;
import androidx.lifecycle.Lifecycle$Event;
import io.ktor.util.C4211;
import java.util.HashMap;
import java.util.List;
import p142.C7539;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: androidx.activity.飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0020 implements InterfaceC2380 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final Object f44;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final Object f45;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f46 = 0;

    public C0020(InterfaceC2389 interfaceC2389) {
        this.f44 = interfaceC2389;
        C2392 c2392 = C2392.f7031;
        Class<?> cls = interfaceC2389.getClass();
        C2394 c2394 = (C2394) c2392.f7033.get(cls);
        this.f45 = c2394 == null ? c2392.m4508(cls, null) : c2394;
    }

    @Override // androidx.lifecycle.InterfaceC2380
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final void mo18(InterfaceC2388 interfaceC2388, Lifecycle$Event lifecycle$Event) {
        int i = this.f46;
        Object obj = this.f44;
        Object obj2 = this.f45;
        switch (i) {
            case 0:
                C0035 c0035 = (C0035) obj;
                int i2 = AbstractC0021.f47[lifecycle$Event.ordinal()];
                if (i2 == 1) {
                    c0035.m70(true);
                    break;
                } else if (i2 == 2) {
                    c0035.m70(false);
                    break;
                } else if (i2 == 3) {
                    c0035.m12780();
                    ((AbstractC2402) obj2).mo4502(this);
                    break;
                }
                break;
            case 1:
                InterfaceC2409 interfaceC2409 = (InterfaceC2409) obj;
                switch (AbstractC2413.f7052[lifecycle$Event.ordinal()]) {
                    case 1:
                        interfaceC2409.getClass();
                        break;
                    case 2:
                        interfaceC2409.onStart(interfaceC2388);
                        break;
                    case 3:
                        interfaceC2409.mo3537(interfaceC2388);
                        break;
                    case 4:
                        interfaceC2409.getClass();
                        break;
                    case 5:
                        interfaceC2409.onStop(interfaceC2388);
                        break;
                    case 6:
                        interfaceC2409.getClass();
                        break;
                    case 7:
                        C5925.m11310("ON_ANY must not been send by anybody");
                        break;
                    default:
                        C4211.m8611();
                        break;
                }
                InterfaceC2380 interfaceC2380 = (InterfaceC2380) obj2;
                if (interfaceC2380 != null) {
                    interfaceC2380.mo18(interfaceC2388, lifecycle$Event);
                }
                break;
            case 2:
                if (lifecycle$Event == Lifecycle$Event.ON_START) {
                    ((AbstractC2402) obj2).mo4502(this);
                    ((C7539) obj).m12760();
                }
                break;
            default:
                HashMap map = ((C2394) obj2).f7037;
                C2394.m4509((List) map.get(lifecycle$Event), interfaceC2388, lifecycle$Event, obj);
                C2394.m4509((List) map.get(Lifecycle$Event.ON_ANY), interfaceC2388, lifecycle$Event, obj);
                break;
        }
    }

    public C0020(InterfaceC2409 interfaceC2409, InterfaceC2380 interfaceC2380) {
        interfaceC2409.getClass();
        this.f44 = interfaceC2409;
        this.f45 = interfaceC2380;
    }

    public C0020(AbstractC2402 abstractC2402, C7539 c7539) {
        this.f45 = abstractC2402;
        this.f44 = c7539;
    }

    public C0020(C0035 c0035, C0023 c0023, AbstractC2402 abstractC2402) {
        this.f44 = c0035;
        this.f45 = abstractC2402;
    }
}
