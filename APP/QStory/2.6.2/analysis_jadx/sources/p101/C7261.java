package p101;

import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4470;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4472;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4480;
import kotlin.reflect.jvm.internal.impl.name.C4690;
import p052.InterfaceC6557;

/* JADX INFO: renamed from: 飘花落叶言世苏子楪哲兰.飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C7261 implements InterfaceC6557 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f19362;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static final C7261 f19360 = new C7261(0);

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static final C7261 f19361 = new C7261(1);

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public static final C7261 f19359 = new C7261(2);

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public static final C7261 f19358 = new C7261(3);

    public /* synthetic */ C7261(int i) {
        this.f19362 = i;
    }

    @Override // p052.InterfaceC6557
    public final Object invoke(Object obj) {
        switch (this.f19362) {
            case 0:
                ((C4690) obj).getClass();
                return Boolean.TRUE;
            case 1:
                InterfaceC4470 interfaceC4470 = (InterfaceC4470) obj;
                interfaceC4470.getClass();
                return interfaceC4470;
            case 2:
                InterfaceC4472 interfaceC4472 = (InterfaceC4472) obj;
                interfaceC4472.getClass();
                return interfaceC4472;
            default:
                InterfaceC4480 interfaceC4480 = (InterfaceC4480) obj;
                interfaceC4480.getClass();
                return interfaceC4480;
        }
    }
}
