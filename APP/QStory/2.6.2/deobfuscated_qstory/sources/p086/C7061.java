package p086;

import java.util.List;
import java.util.ServiceLoader;
import kotlin.collections.AbstractC4343;
import p052.InterfaceC6542;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: 飘花落叶言世楪苏子哲兰.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C7061 implements InterfaceC6542 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public static final C7061 f18968 = new C7061();

    @Override // p052.InterfaceC6542
    public final Object invoke() {
        C7060 c7060 = C7060.f18967;
        ServiceLoader serviceLoaderLoad = ServiceLoader.load(InterfaceC7059.class, InterfaceC7059.class.getClassLoader());
        serviceLoaderLoad.getClass();
        List listM8804 = AbstractC4343.m8804(serviceLoaderLoad);
        if (!listM8804.isEmpty()) {
            return listM8804;
        }
        C5919.m11250("No MetadataExtensions instances found in the classpath. Please ensure that the META-INF/services/ is not stripped from your application and that the Java virtual machine is not running under a security manager");
        return null;
    }
}
