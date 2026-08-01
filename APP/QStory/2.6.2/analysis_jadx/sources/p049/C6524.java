package p049;

import java.util.ServiceLoader;
import kotlin.collections.AbstractC4343;
import kotlin.reflect.jvm.internal.impl.storage.C4844;
import p052.InterfaceC6542;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: 飘花落叶言世子兰苏哲楪.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C6524 implements InterfaceC6542 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static final C6524 f17839 = new C6524(0);

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static final C6524 f17840 = new C6524(1);

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f17841;

    public /* synthetic */ C6524(int i) {
        this.f17841 = i;
    }

    @Override // p052.InterfaceC6542
    public final Object invoke() {
        switch (this.f17841) {
            case 0:
                C6523 c6523 = C6523.f17838;
                ServiceLoader serviceLoaderLoad = ServiceLoader.load(InterfaceC6522.class, InterfaceC6522.class.getClassLoader());
                serviceLoaderLoad.getClass();
                InterfaceC6522 interfaceC6522 = (InterfaceC6522) AbstractC4343.m8826(serviceLoaderLoad);
                if (interfaceC6522 != null) {
                    return interfaceC6522;
                }
                C5919.m11250("No BuiltInsLoader implementation was found. Please ensure that the META-INF/services/ is not stripped from your application and that the Java virtual machine is not running under a security manager");
                return null;
            default:
                C6520 c6520 = new C6520(new C4844("DefaultBuiltIns"));
                c6520.m11983(false);
                return c6520;
        }
    }
}
