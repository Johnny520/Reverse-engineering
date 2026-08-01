package p117;

import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5303;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5305;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5313;
import kotlin.reflect.jvm.internal.impl.name.C5523;
import p068.InterfaceC7387;

/* JADX INFO: renamed from: 飘花落叶言世苏子楪哲兰.飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C8091 implements InterfaceC7387 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f19702;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static final C8091 f19700 = new C8091(0);

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static final C8091 f19701 = new C8091(1);

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public static final C8091 f19699 = new C8091(2);

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public static final C8091 f19698 = new C8091(3);

    public /* synthetic */ C8091(int i) {
        this.f19702 = i;
    }

    @Override // p068.InterfaceC7387
    public final Object invoke(Object obj) {
        switch (this.f19702) {
            case 0:
                ((C5523) obj).getClass();
                return Boolean.TRUE;
            case 1:
                InterfaceC5303 interfaceC5303 = (InterfaceC5303) obj;
                interfaceC5303.getClass();
                return interfaceC5303;
            case 2:
                InterfaceC5305 interfaceC5305 = (InterfaceC5305) obj;
                interfaceC5305.getClass();
                return interfaceC5305;
            default:
                InterfaceC5313 interfaceC5313 = (InterfaceC5313) obj;
                interfaceC5313.getClass();
                return interfaceC5313;
        }
    }
}
