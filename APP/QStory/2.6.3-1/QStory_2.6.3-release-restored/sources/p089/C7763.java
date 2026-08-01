package p089;

import kotlin.C6008;
import kotlin.jvm.internal.AbstractC5227;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.C5242;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5309;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5312;
import kotlin.reflect.jvm.internal.impl.name.C5519;
import kotlin.reflect.jvm.internal.impl.name.C5523;
import kotlin.reflect.jvm.internal.impl.resolve.ReturnValueStatus;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.AbstractC5605;
import kotlin.reflect.jvm.internal.impl.types.AbstractC5714;
import kotlin.reflect.jvm.internal.impl.types.AbstractC5746;
import p068.InterfaceC7387;
import p095.C7835;
import p098.C7864;

/* JADX INFO: renamed from: 飘花落叶言世楪哲子苏兰.飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C7763 implements InterfaceC7387 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f18846;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static final C7763 f18844 = new C7763(0);

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static final C7763 f18845 = new C7763(1);

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public static final C7763 f18843 = new C7763(2);

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public static final C7763 f18842 = new C7763(3);

    public /* synthetic */ C7763(int i) {
        this.f18846 = i;
    }

    @Override // p068.InterfaceC7387
    public final Object invoke(Object obj) {
        switch (this.f18846) {
            case 0:
                InterfaceC5312 interfaceC5312 = (InterfaceC5312) obj;
                interfaceC5312.getClass();
                C7835 c7835Mo9591 = interfaceC5312.mo9591();
                c7835Mo9591.getClass();
                return c7835Mo9591.getType();
            case 1:
                InterfaceC5312 interfaceC53122 = (InterfaceC5312) obj;
                interfaceC53122.getClass();
                AbstractC5714 returnType = interfaceC53122.getReturnType();
                returnType.getClass();
                return returnType;
            case 2:
                AbstractC5746 abstractC5746 = (AbstractC5746) obj;
                abstractC5746.getClass();
                return Boolean.valueOf(abstractC5746 instanceof C7864);
            case 3:
                InterfaceC5309 interfaceC5309Mo9770 = ((AbstractC5746) obj).mo10281().mo9770();
                if (interfaceC5309Mo9770 == null) {
                    return Boolean.FALSE;
                }
                C5523 name = interfaceC5309Mo9770.getName();
                C5519 c5519 = C5242.f13327;
                return Boolean.valueOf(AbstractC5227.m9466(name, c5519.f14041.m9877()) && AbstractC5227.m9466(AbstractC5605.m10060(interfaceC5309Mo9770), c5519));
            default:
                C7762 c7762 = (C7762) obj;
                c7762.getClass();
                String strConcat = "java/util/".concat("Spliterator");
                C7754 c7754 = AbstractC7770.f18860;
                c7762.m12788(strConcat, c7754, c7754);
                ReturnValueStatus returnValueStatus = ReturnValueStatus.MustUse;
                return C6008.f15084;
        }
    }
}
