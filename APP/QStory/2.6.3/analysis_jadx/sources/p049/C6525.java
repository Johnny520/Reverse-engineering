package p049;

import java.util.ServiceLoader;
import kotlin.collections.AbstractC4344;
import kotlin.reflect.jvm.internal.impl.storage.C4845;
import p052.InterfaceC6543;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: 飘花落叶言世子兰苏哲楪.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C6525 implements InterfaceC6543 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static final C6525 f17835 = new C6525(0);

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static final C6525 f17836 = new C6525(1);

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f17837;

    public /* synthetic */ C6525(int i) {
        this.f17837 = i;
    }

    @Override // p052.InterfaceC6543
    public final Object invoke() {
        switch (this.f17837) {
            case 0:
                C6524 c6524 = C6524.f17834;
                ServiceLoader serviceLoaderLoad = ServiceLoader.load(InterfaceC6523.class, InterfaceC6523.class.getClassLoader());
                serviceLoaderLoad.getClass();
                InterfaceC6523 interfaceC6523 = (InterfaceC6523) AbstractC4344.m8816(serviceLoaderLoad);
                if (interfaceC6523 != null) {
                    return interfaceC6523;
                }
                C5925.m11311("No BuiltInsLoader implementation was found. Please ensure that the META-INF/services/ is not stripped from your application and that the Java virtual machine is not running under a security manager");
                return null;
            default:
                C6521 c6521 = new C6521(new C4845("DefaultBuiltIns"));
                c6521.m12026(false);
                return c6521;
        }
    }
}
