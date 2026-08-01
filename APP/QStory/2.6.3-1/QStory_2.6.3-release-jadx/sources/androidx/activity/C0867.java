package androidx.activity;

import androidx.lifecycle.AbstractC3235;
import androidx.lifecycle.AbstractC3246;
import androidx.lifecycle.C3225;
import androidx.lifecycle.C3227;
import androidx.lifecycle.InterfaceC3213;
import androidx.lifecycle.InterfaceC3221;
import androidx.lifecycle.InterfaceC3222;
import androidx.lifecycle.InterfaceC3242;
import androidx.lifecycle.Lifecycle$Event;
import io.ktor.util.C5043;
import java.util.HashMap;
import java.util.List;
import p158.C8368;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: androidx.activity.飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0867 implements InterfaceC3213 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final Object f389;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final Object f390;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f391 = 0;

    public C0867(InterfaceC3222 interfaceC3222) {
        this.f389 = interfaceC3222;
        C3225 c3225 = C3225.f7376;
        Class<?> cls = interfaceC3222.getClass();
        C3227 c3227 = (C3227) c3225.f7378.get(cls);
        this.f390 = c3227 == null ? c3225.m5068(cls, null) : c3227;
    }

    @Override // androidx.lifecycle.InterfaceC3213
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final void mo578(InterfaceC3221 interfaceC3221, Lifecycle$Event lifecycle$Event) {
        int i = this.f391;
        Object obj = this.f389;
        Object obj2 = this.f390;
        switch (i) {
            case 0:
                C0882 c0882 = (C0882) obj;
                int i2 = AbstractC0868.f392[lifecycle$Event.ordinal()];
                if (i2 == 1) {
                    c0882.m630(true);
                    break;
                } else if (i2 == 2) {
                    c0882.m630(false);
                    break;
                } else if (i2 == 3) {
                    c0882.m13339();
                    ((AbstractC3235) obj2).mo5062(this);
                    break;
                }
                break;
            case 1:
                InterfaceC3242 interfaceC3242 = (InterfaceC3242) obj;
                switch (AbstractC3246.f7397[lifecycle$Event.ordinal()]) {
                    case 1:
                        interfaceC3242.getClass();
                        break;
                    case 2:
                        interfaceC3242.onStart(interfaceC3221);
                        break;
                    case 3:
                        interfaceC3242.mo4097(interfaceC3221);
                        break;
                    case 4:
                        interfaceC3242.getClass();
                        break;
                    case 5:
                        interfaceC3242.onStop(interfaceC3221);
                        break;
                    case 6:
                        interfaceC3242.getClass();
                        break;
                    case 7:
                        C6755.m11869("ON_ANY must not been send by anybody");
                        break;
                    default:
                        C5043.m9170();
                        break;
                }
                InterfaceC3213 interfaceC3213 = (InterfaceC3213) obj2;
                if (interfaceC3213 != null) {
                    interfaceC3213.mo578(interfaceC3221, lifecycle$Event);
                }
                break;
            case 2:
                if (lifecycle$Event == Lifecycle$Event.ON_START) {
                    ((AbstractC3235) obj2).mo5062(this);
                    ((C8368) obj).m13319();
                }
                break;
            default:
                HashMap map = ((C3227) obj2).f7382;
                C3227.m5069((List) map.get(lifecycle$Event), interfaceC3221, lifecycle$Event, obj);
                C3227.m5069((List) map.get(Lifecycle$Event.ON_ANY), interfaceC3221, lifecycle$Event, obj);
                break;
        }
    }

    public C0867(InterfaceC3242 interfaceC3242, InterfaceC3213 interfaceC3213) {
        interfaceC3242.getClass();
        this.f389 = interfaceC3242;
        this.f390 = interfaceC3213;
    }

    public C0867(AbstractC3235 abstractC3235, C8368 c8368) {
        this.f390 = abstractC3235;
        this.f389 = c8368;
    }

    public C0867(C0882 c0882, C0870 c0870, AbstractC3235 abstractC3235) {
        this.f389 = c0882;
        this.f390 = abstractC3235;
    }
}
