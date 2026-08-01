package p073;

import kotlin.C5176;
import kotlin.jvm.internal.AbstractC4395;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.C4410;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4477;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4480;
import kotlin.reflect.jvm.internal.impl.name.C4687;
import kotlin.reflect.jvm.internal.impl.name.C4691;
import kotlin.reflect.jvm.internal.impl.resolve.ReturnValueStatus;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.AbstractC4773;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4882;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4914;
import p052.InterfaceC6558;
import p079.C7006;
import p082.C7035;

/* JADX INFO: renamed from: 飘花落叶言世楪哲子苏兰.飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C6934 implements InterfaceC6558 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f18501;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static final C6934 f18499 = new C6934(0);

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static final C6934 f18500 = new C6934(1);

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public static final C6934 f18498 = new C6934(2);

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public static final C6934 f18497 = new C6934(3);

    public /* synthetic */ C6934(int i) {
        this.f18501 = i;
    }

    @Override // p052.InterfaceC6558
    public final Object invoke(Object obj) {
        switch (this.f18501) {
            case 0:
                InterfaceC4480 interfaceC4480 = (InterfaceC4480) obj;
                interfaceC4480.getClass();
                C7006 c7006Mo9032 = interfaceC4480.mo9032();
                c7006Mo9032.getClass();
                return c7006Mo9032.getType();
            case 1:
                InterfaceC4480 interfaceC44802 = (InterfaceC4480) obj;
                interfaceC44802.getClass();
                AbstractC4882 returnType = interfaceC44802.getReturnType();
                returnType.getClass();
                return returnType;
            case 2:
                AbstractC4914 abstractC4914 = (AbstractC4914) obj;
                abstractC4914.getClass();
                return Boolean.valueOf(abstractC4914 instanceof C7035);
            case 3:
                InterfaceC4477 interfaceC4477Mo9211 = ((AbstractC4914) obj).mo9722().mo9211();
                if (interfaceC4477Mo9211 == null) {
                    return Boolean.FALSE;
                }
                C4691 name = interfaceC4477Mo9211.getName();
                C4687 c4687 = C4410.f12982;
                return Boolean.valueOf(AbstractC4395.m8907(name, c4687.f13696.m9318()) && AbstractC4395.m8907(AbstractC4773.m9501(interfaceC4477Mo9211), c4687));
            default:
                C6933 c6933 = (C6933) obj;
                c6933.getClass();
                String strConcat = "java/util/".concat("Spliterator");
                C6925 c6925 = AbstractC6941.f18515;
                c6933.m12229(strConcat, c6925, c6925);
                ReturnValueStatus returnValueStatus = ReturnValueStatus.MustUse;
                return C5176.f14739;
        }
    }
}
