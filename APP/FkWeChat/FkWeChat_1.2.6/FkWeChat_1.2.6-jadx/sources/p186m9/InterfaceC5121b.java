package p186m9;

import java.util.ServiceLoader;
import p082fb.InterfaceC2412n;
import p172l8.AbstractC4706m;
import p172l8.EnumC4708o;
import p172l8.InterfaceC4705l;
import p185m8.AbstractC5081g0;
import p229p9.InterfaceC6005h0;
import p229p9.InterfaceC6026o0;
import p258r9.InterfaceC6545a;
import p258r9.InterfaceC6547c;
import p376zd.C10010p0;

/* JADX INFO: renamed from: m9.b */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC5121b {

    /* JADX INFO: renamed from: a */
    public static final a f15433a = a.f15434a;

    /* JADX INFO: renamed from: m9.b$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ a f15434a = new a();

        /* JADX INFO: renamed from: b */
        public static final InterfaceC4705l f15435b = AbstractC4706m.m18788b(EnumC4708o.f13922r, C5120a.f15432q);

        /* JADX INFO: renamed from: a */
        public static final InterfaceC5121b m20823a() {
            ServiceLoader serviceLoaderLoad = ServiceLoader.load(InterfaceC5121b.class, InterfaceC5121b.class.getClassLoader());
            serviceLoaderLoad.getClass();
            InterfaceC5121b interfaceC5121b = (InterfaceC5121b) AbstractC5081g0.m20577k0(serviceLoaderLoad);
            if (interfaceC5121b != null) {
                return interfaceC5121b;
            }
            C10010p0.m38820a("No BuiltInsLoader implementation was found. Please ensure that the META-INF/services/ is not stripped from your application and that the Java virtual machine is not running under a security manager");
            return null;
        }

        /* JADX INFO: renamed from: c */
        public final InterfaceC5121b m20825c() {
            return (InterfaceC5121b) f15435b.getValue();
        }
    }

    /* JADX INFO: renamed from: a */
    InterfaceC6026o0 mo7044a(InterfaceC2412n interfaceC2412n, InterfaceC6005h0 interfaceC6005h0, Iterable iterable, InterfaceC6547c interfaceC6547c, InterfaceC6545a interfaceC6545a, boolean z10);
}
