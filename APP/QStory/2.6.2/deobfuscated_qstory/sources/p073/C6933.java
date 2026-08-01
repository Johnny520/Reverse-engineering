package p073;

import kotlin.C5175;
import kotlin.jvm.internal.AbstractC4394;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.C4409;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4476;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4479;
import kotlin.reflect.jvm.internal.impl.name.C4686;
import kotlin.reflect.jvm.internal.impl.name.C4690;
import kotlin.reflect.jvm.internal.impl.resolve.ReturnValueStatus;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.AbstractC4772;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4881;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4913;
import p052.InterfaceC6557;
import p079.C7005;
import p082.C7034;

/* JADX INFO: renamed from: 飘花落叶言世楪哲子苏兰.飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C6933 implements InterfaceC6557 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f18506;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static final C6933 f18504 = new C6933(0);

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static final C6933 f18505 = new C6933(1);

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public static final C6933 f18503 = new C6933(2);

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public static final C6933 f18502 = new C6933(3);

    public /* synthetic */ C6933(int i) {
        this.f18506 = i;
    }

    @Override // p052.InterfaceC6557
    public final Object invoke(Object obj) {
        switch (this.f18506) {
            case 0:
                InterfaceC4479 interfaceC4479 = (InterfaceC4479) obj;
                interfaceC4479.getClass();
                C7005 c7005Mo9042 = interfaceC4479.mo9042();
                c7005Mo9042.getClass();
                return c7005Mo9042.getType();
            case 1:
                InterfaceC4479 interfaceC44792 = (InterfaceC4479) obj;
                interfaceC44792.getClass();
                AbstractC4881 returnType = interfaceC44792.getReturnType();
                returnType.getClass();
                return returnType;
            case 2:
                AbstractC4913 abstractC4913 = (AbstractC4913) obj;
                abstractC4913.getClass();
                return Boolean.valueOf(abstractC4913 instanceof C7034);
            case 3:
                InterfaceC4476 interfaceC4476Mo9221 = ((AbstractC4913) obj).mo9732().mo9221();
                if (interfaceC4476Mo9221 == null) {
                    return Boolean.FALSE;
                }
                C4690 name = interfaceC4476Mo9221.getName();
                C4686 c4686 = C4409.f12978;
                return Boolean.valueOf(AbstractC4394.m8917(name, c4686.f13692.m9328()) && AbstractC4394.m8917(AbstractC4772.m9511(interfaceC4476Mo9221), c4686));
            default:
                C6932 c6932 = (C6932) obj;
                c6932.getClass();
                String strConcat = "java/util/".concat("Spliterator");
                C6924 c6924 = AbstractC6940.f18520;
                c6932.m12201(strConcat, c6924, c6924);
                ReturnValueStatus returnValueStatus = ReturnValueStatus.MustUse;
                return C5175.f14739;
        }
    }
}
