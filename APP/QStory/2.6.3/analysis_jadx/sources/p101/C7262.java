package p101;

import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4471;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4473;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4481;
import kotlin.reflect.jvm.internal.impl.name.C4691;
import p052.InterfaceC6558;

/* JADX INFO: renamed from: 飘花落叶言世苏子楪哲兰.飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C7262 implements InterfaceC6558 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f19357;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static final C7262 f19355 = new C7262(0);

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static final C7262 f19356 = new C7262(1);

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public static final C7262 f19354 = new C7262(2);

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public static final C7262 f19353 = new C7262(3);

    public /* synthetic */ C7262(int i) {
        this.f19357 = i;
    }

    @Override // p052.InterfaceC6558
    public final Object invoke(Object obj) {
        switch (this.f19357) {
            case 0:
                ((C4691) obj).getClass();
                return Boolean.TRUE;
            case 1:
                InterfaceC4471 interfaceC4471 = (InterfaceC4471) obj;
                interfaceC4471.getClass();
                return interfaceC4471;
            case 2:
                InterfaceC4473 interfaceC4473 = (InterfaceC4473) obj;
                interfaceC4473.getClass();
                return interfaceC4473;
            default:
                InterfaceC4481 interfaceC4481 = (InterfaceC4481) obj;
                interfaceC4481.getClass();
                return interfaceC4481;
        }
    }
}
