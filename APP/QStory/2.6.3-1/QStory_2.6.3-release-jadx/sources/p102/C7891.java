package p102;

import java.util.List;
import java.util.ServiceLoader;
import kotlin.collections.AbstractC5176;
import p068.InterfaceC7372;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: 飘花落叶言世楪苏子哲兰.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C7891 implements InterfaceC7372 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public static final C7891 f19308 = new C7891();

    @Override // p068.InterfaceC7372
    public final Object invoke() {
        C7890 c7890 = C7890.f19307;
        ServiceLoader serviceLoaderLoad = ServiceLoader.load(InterfaceC7889.class, InterfaceC7889.class.getClassLoader());
        serviceLoaderLoad.getClass();
        List listM9356 = AbstractC5176.m9356(serviceLoaderLoad);
        if (!listM9356.isEmpty()) {
            return listM9356;
        }
        C6755.m11870("No MetadataExtensions instances found in the classpath. Please ensure that the META-INF/services/ is not stripped from your application and that the Java virtual machine is not running under a security manager");
        return null;
    }
}
