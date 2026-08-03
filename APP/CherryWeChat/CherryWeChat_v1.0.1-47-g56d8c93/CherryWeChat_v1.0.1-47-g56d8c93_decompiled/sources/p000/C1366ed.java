package p000;

import androidx.lifecycle.DefaultLifecycleObserver;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: renamed from: ed */
/* JADX INFO: loaded from: classes.dex */
public final class C1366ed implements InterfaceC0889Un {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f4890a;

    /* JADX INFO: renamed from: b */
    public final Object f4891b;

    /* JADX INFO: renamed from: c */
    public final Object f4892c;

    public /* synthetic */ C1366ed(int i, Object obj, Object obj2) {
        this.f4890a = i;
        this.f4891b = obj;
        this.f4892c = obj2;
    }

    @Override // p000.InterfaceC0889Un
    public final void onStateChanged(InterfaceC1061Yn interfaceC1061Yn, EnumC0632On enumC0632On) {
        switch (this.f4890a) {
            case 0:
                DefaultLifecycleObserver defaultLifecycleObserver = (DefaultLifecycleObserver) this.f4891b;
                switch (AbstractC1323dd.f4799a[enumC0632On.ordinal()]) {
                    case 1:
                        defaultLifecycleObserver.onCreate(interfaceC1061Yn);
                        break;
                    case 2:
                        defaultLifecycleObserver.onStart(interfaceC1061Yn);
                        break;
                    case 3:
                        defaultLifecycleObserver.onResume(interfaceC1061Yn);
                        break;
                    case 4:
                        defaultLifecycleObserver.onPause(interfaceC1061Yn);
                        break;
                    case 5:
                        defaultLifecycleObserver.onStop(interfaceC1061Yn);
                        break;
                    case 6:
                        defaultLifecycleObserver.onDestroy(interfaceC1061Yn);
                        break;
                    case 7:
                        throw new IllegalArgumentException("ON_ANY must not been send by anybody");
                }
                InterfaceC0889Un interfaceC0889Un = (InterfaceC0889Un) this.f4892c;
                if (interfaceC0889Un != null) {
                    interfaceC0889Un.onStateChanged(interfaceC1061Yn, enumC0632On);
                    return;
                }
                return;
            case 1:
                if (enumC0632On == EnumC0632On.ON_START) {
                    ((AbstractC0760Rn) this.f4891b).mo1556b(this);
                    ((C1518hx) this.f4892c).m2899d();
                    return;
                }
                return;
            default:
                HashMap map = ((C0311H9) this.f4892c).f1030a;
                List list = (List) map.get(enumC0632On);
                Object obj = this.f4891b;
                C0311H9.m661a(list, interfaceC1061Yn, enumC0632On, obj);
                C0311H9.m661a((List) map.get(EnumC0632On.ON_ANY), interfaceC1061Yn, enumC0632On, obj);
                return;
        }
    }

    public C1366ed(InterfaceC1018Xn interfaceC1018Xn) {
        this.f4890a = 2;
        this.f4891b = interfaceC1018Xn;
        C0397J9 c0397j9 = C0397J9.f1340c;
        Class<?> cls = interfaceC1018Xn.getClass();
        C0311H9 c0311h9 = (C0311H9) c0397j9.f1341a.get(cls);
        this.f4892c = c0311h9 == null ? c0397j9.m835a(cls, null) : c0311h9;
    }
}
