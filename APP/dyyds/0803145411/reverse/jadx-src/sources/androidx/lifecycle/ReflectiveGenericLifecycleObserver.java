package androidx.lifecycle;

import java.util.HashMap;
import java.util.List;
import yyds.C2274;
import yyds.C2501;
import yyds.EnumC0637;
import yyds.InterfaceC0657;
import yyds.InterfaceC2345;

/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
class ReflectiveGenericLifecycleObserver implements InterfaceC0657 {

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final Object f307;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final C2274 f308;

    public ReflectiveGenericLifecycleObserver(Object obj) {
        this.f307 = obj;
        C2501 c2501 = C2501.f12313;
        Class<?> cls = obj.getClass();
        C2274 c2274 = (C2274) c2501.f12314.get(cls);
        this.f308 = c2274 == null ? c2501.m4540(cls, null) : c2274;
    }

    @Override // yyds.InterfaceC0657
    /* JADX INFO: renamed from: ᲇᲈᛵᛷ */
    public final void mo20(InterfaceC2345 interfaceC2345, EnumC0637 enumC0637) {
        HashMap map = this.f308.f11204;
        List list = (List) map.get(enumC0637);
        Object obj = this.f307;
        C2274.m4284(list, interfaceC2345, enumC0637, obj);
        C2274.m4284((List) map.get(EnumC0637.ON_ANY), interfaceC2345, enumC0637, obj);
    }
}
