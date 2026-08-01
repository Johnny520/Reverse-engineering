package p156k7;

import io.ktor.utils.p131io.InterfaceC3468g;
import java.io.InputStream;
import p034c7.InterfaceC1355b;
import p079f8.AbstractC2353c;
import p323w6.AbstractC9195f;

/* JADX INFO: renamed from: k7.a */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4014a {

    /* JADX INFO: renamed from: k7.a$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a extends AbstractC9195f.c {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Object f11768a;

        public a(Object obj) {
            this.f11768a = obj;
        }

        @Override // p323w6.AbstractC9195f.c
        /* JADX INFO: renamed from: e */
        public InterfaceC3468g mo13548e() {
            return AbstractC2353c.m8547b((InputStream) this.f11768a, null, null, 3, null);
        }
    }

    /* JADX INFO: renamed from: a */
    public static final AbstractC9195f m15945a(InterfaceC1355b interfaceC1355b, Object obj) {
        interfaceC1355b.getClass();
        obj.getClass();
        if (obj instanceof InputStream) {
            return new a(obj);
        }
        return null;
    }
}
