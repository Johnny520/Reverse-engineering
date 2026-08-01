package androidx.lifecycle;

import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
class ReflectiveGenericLifecycleObserver implements InterfaceC0482q {

    /* JADX INFO: renamed from: a */
    public final InterfaceC0483r f1502a;

    /* JADX INFO: renamed from: b */
    public final C0467b f1503b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ReflectiveGenericLifecycleObserver(InterfaceC0483r interfaceC0483r) {
        this.f1502a = interfaceC0483r;
        C0469d c0469d = C0469d.f1512c;
        Class<?> cls = interfaceC0483r.getClass();
        C0467b c0467b = (C0467b) c0469d.f1513a.get(cls);
        this.f1503b = c0467b == null ? c0469d.m923a(cls, null) : c0467b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // androidx.lifecycle.InterfaceC0482q
    /* JADX INFO: renamed from: c */
    public final void mo391c(InterfaceC0484s interfaceC0484s, EnumC0478m enumC0478m) {
        HashMap map = this.f1503b.f1508a;
        List list = (List) map.get(enumC0478m);
        InterfaceC0483r interfaceC0483r = this.f1502a;
        C0467b.m921a(list, interfaceC0484s, enumC0478m, interfaceC0483r);
        C0467b.m921a((List) map.get(EnumC0478m.ON_ANY), interfaceC0484s, enumC0478m, interfaceC0483r);
    }
}
