package p156k7;

import io.ktor.utils.p131io.InterfaceC3468g;
import p034c7.InterfaceC1355b;
import p227p7.AbstractC5964b;
import p281t6.C8173z;
import p323w6.AbstractC9195f;
import p323w6.C9190a;
import p323w6.C9199j;

/* JADX INFO: renamed from: k7.b */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4015b {

    /* JADX INFO: renamed from: k7.b$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a extends AbstractC9195f.c {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Object f11769a;

        public a(Object obj) {
            this.f11769a = obj;
        }

        @Override // p323w6.AbstractC9195f.c
        /* JADX INFO: renamed from: e */
        public InterfaceC3468g mo13548e() {
            return (InterfaceC3468g) this.f11769a;
        }
    }

    /* JADX INFO: renamed from: a */
    public static final AbstractC9195f m15946a(InterfaceC1355b interfaceC1355b, Object obj) {
        interfaceC1355b.getClass();
        obj.getClass();
        if (obj instanceof AbstractC9195f) {
            return (AbstractC9195f) obj;
        }
        if (obj instanceof String) {
            return new C9199j((String) obj, AbstractC5964b.m23954a(interfaceC1355b, null), null);
        }
        return obj instanceof byte[] ? new C9190a((byte[]) obj, null, null, 6, null) : obj instanceof C8173z ? new C4016c((C8173z) obj) : obj instanceof InterfaceC3468g ? new a(obj) : AbstractC4014a.m15945a(interfaceC1355b, obj);
    }
}
