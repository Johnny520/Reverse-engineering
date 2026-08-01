package p282t7;

import java.util.List;
import java.util.Map;
import p185m8.AbstractC5081g0;
import p282t7.InterfaceC8176b;

/* JADX INFO: renamed from: t7.c */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8178c implements InterfaceC8176b {
    @Override // p282t7.InterfaceC8176b
    /* JADX INFO: renamed from: a */
    public final void mo31830a(C8174a c8174a) {
        c8174a.getClass();
        mo31842h().remove(c8174a);
    }

    @Override // p282t7.InterfaceC8176b
    /* JADX INFO: renamed from: b */
    public final List mo31831b() {
        return AbstractC5081g0.m20554X0(mo31842h().keySet());
    }

    @Override // p282t7.InterfaceC8176b
    /* JADX INFO: renamed from: c */
    public final Object mo31832c(C8174a c8174a) {
        c8174a.getClass();
        return mo31842h().get(c8174a);
    }

    @Override // p282t7.InterfaceC8176b
    /* JADX INFO: renamed from: d */
    public final void mo31833d(C8174a c8174a, Object obj) {
        c8174a.getClass();
        obj.getClass();
        mo31842h().put(c8174a, obj);
    }

    @Override // p282t7.InterfaceC8176b
    /* JADX INFO: renamed from: e */
    public Object mo31834e(C8174a c8174a) {
        return InterfaceC8176b.a.m31837a(this, c8174a);
    }

    @Override // p282t7.InterfaceC8176b
    /* JADX INFO: renamed from: g */
    public final boolean mo31836g(C8174a c8174a) {
        c8174a.getClass();
        return mo31842h().containsKey(c8174a);
    }

    /* JADX INFO: renamed from: h */
    public abstract Map mo31842h();
}
