package p065;

import java.util.ServiceLoader;
import kotlin.collections.AbstractC5176;
import kotlin.reflect.jvm.internal.impl.storage.C5677;
import p068.InterfaceC7372;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: 飘花落叶言世子兰苏哲楪.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C7354 implements InterfaceC7372 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static final C7354 f18180 = new C7354(0);

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static final C7354 f18181 = new C7354(1);

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f18182;

    public /* synthetic */ C7354(int i) {
        this.f18182 = i;
    }

    @Override // p068.InterfaceC7372
    public final Object invoke() {
        switch (this.f18182) {
            case 0:
                C7353 c7353 = C7353.f18179;
                ServiceLoader serviceLoaderLoad = ServiceLoader.load(InterfaceC7352.class, InterfaceC7352.class.getClassLoader());
                serviceLoaderLoad.getClass();
                InterfaceC7352 interfaceC7352 = (InterfaceC7352) AbstractC5176.m9375(serviceLoaderLoad);
                if (interfaceC7352 != null) {
                    return interfaceC7352;
                }
                C6755.m11870("No BuiltInsLoader implementation was found. Please ensure that the META-INF/services/ is not stripped from your application and that the Java virtual machine is not running under a security manager");
                return null;
            default:
                C7350 c7350 = new C7350(new C5677("DefaultBuiltIns"));
                c7350.m12585(false);
                return c7350;
        }
    }
}
