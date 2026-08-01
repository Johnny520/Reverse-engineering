package p086;

import java.util.List;
import java.util.ServiceLoader;
import kotlin.collections.AbstractC4344;
import p052.InterfaceC6543;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: 飘花落叶言世楪苏子哲兰.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C7062 implements InterfaceC6543 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public static final C7062 f18963 = new C7062();

    @Override // p052.InterfaceC6543
    public final Object invoke() {
        C7061 c7061 = C7061.f18962;
        ServiceLoader serviceLoaderLoad = ServiceLoader.load(InterfaceC7060.class, InterfaceC7060.class.getClassLoader());
        serviceLoaderLoad.getClass();
        List listM8797 = AbstractC4344.m8797(serviceLoaderLoad);
        if (!listM8797.isEmpty()) {
            return listM8797;
        }
        C5925.m11311("No MetadataExtensions instances found in the classpath. Please ensure that the META-INF/services/ is not stripped from your application and that the Java virtual machine is not running under a security manager");
        return null;
    }
}
