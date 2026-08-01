package kotlin.reflect.jvm.internal;

import io.ktor.util.C4211;
import java.io.ByteArrayInputStream;
import java.lang.reflect.Type;
import kotlin.collections.AbstractC4347;
import kotlin.collections.C4328;
import kotlin.jvm.internal.AbstractC4395;
import kotlin.jvm.internal.MutablePropertyReference0;
import kotlin.jvm.internal.MutablePropertyReference1;
import kotlin.jvm.internal.PropertyReference0;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.reflect.jvm.internal.impl.descriptors.C4461;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.C4446;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.AbstractC4575;
import kotlin.reflect.jvm.internal.impl.name.C4688;
import kotlin.reflect.jvm.internal.impl.protobuf.AbstractC4712;
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4699;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.AbstractC4795;
import kotlin.reflect.jvm.internal.impl.storage.C4843;
import kotlin.reflect.jvm.internal.impl.storage.C4845;
import kotlin.text.C5148;
import kotlin.text.InterfaceC5150;
import p052.InterfaceC6543;
import p079.AbstractC7014;
import p079.C7015;
import p083.C7041;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.飘花落叶言子苏兰世哲楪, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C5042 implements InterfaceC6543 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final Object f14529;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final Object f14530;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final Object f14531;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f14532;

    public C5042(AbstractC7014 abstractC7014, C4845 c4845, C4461 c4461) {
        this.f14532 = 7;
        this.f14529 = abstractC7014;
        this.f14530 = c4845;
        this.f14531 = c4461;
    }

    @Override // p052.InterfaceC6543
    public final Object invoke() {
        int i = this.f14532;
        Object obj = this.f14531;
        Object obj2 = this.f14530;
        Object obj3 = this.f14529;
        switch (i) {
            case 0:
                C5004 c5004 = (C5004) obj2;
                Class cls = (Class) obj;
                C4688 c4688 = (C4688) obj3;
                Class cls2 = c5004.f14424;
                if (AbstractC4395.m8907(cls2.getSuperclass(), cls)) {
                    Type genericSuperclass = cls2.getGenericSuperclass();
                    genericSuperclass.getClass();
                    return genericSuperclass;
                }
                Class<?>[] interfaces = cls2.getInterfaces();
                interfaces.getClass();
                int iM8852 = AbstractC4347.m8852(cls, interfaces);
                if (iM8852 < 0) {
                    C4211.m8607("No superclass of ", c5004, " in Java reflection for ", c4688);
                    return null;
                }
                Type type = cls2.getGenericInterfaces()[iM8852];
                type.getClass();
                return type;
            case 1:
                String str = (String) obj2;
                AbstractC5003 abstractC5003 = (AbstractC5003) obj;
                PropertyReference0 propertyReference0 = (PropertyReference0) obj3;
                InterfaceC5150 interfaceC5150MatchEntire = AbstractC5003.f14422.matchEntire(str);
                if (interfaceC5150MatchEntire != null) {
                    return abstractC5003.m9979(Integer.parseInt((String) ((C4328) ((C5148) interfaceC5150MatchEntire).m10181()).get(1)), str);
                }
                if (!(abstractC5003 instanceof C4992)) {
                    return new C4949(abstractC5003, propertyReference0.getName(), str, propertyReference0.getBoundReceiver());
                }
                return new C4965(abstractC5003, str, propertyReference0.getBoundReceiver(), abstractC5003.m9976(propertyReference0.getName(), str));
            case 2:
                String str2 = (String) obj2;
                AbstractC5003 abstractC50032 = (AbstractC5003) obj;
                MutablePropertyReference0 mutablePropertyReference0 = (MutablePropertyReference0) obj3;
                InterfaceC5150 interfaceC5150MatchEntire2 = AbstractC5003.f14422.matchEntire(str2);
                if (interfaceC5150MatchEntire2 != null) {
                    return abstractC50032.m9979(Integer.parseInt((String) ((C4328) ((C5148) interfaceC5150MatchEntire2).m10181()).get(1)), str2);
                }
                if (!(abstractC50032 instanceof C4992)) {
                    return new C5019(abstractC50032, mutablePropertyReference0.getName(), str2, mutablePropertyReference0.getBoundReceiver());
                }
                return new C4997(abstractC50032, str2, mutablePropertyReference0.getBoundReceiver(), abstractC50032.m9976(mutablePropertyReference0.getName(), str2));
            case 3:
                AbstractC5003 abstractC50033 = (AbstractC5003) obj2;
                PropertyReference1 propertyReference1 = (PropertyReference1) obj;
                String str3 = (String) obj3;
                if (!(abstractC50033 instanceof C4992)) {
                    return new C4950(abstractC50033, propertyReference1.getName(), str3, propertyReference1.getBoundReceiver());
                }
                return new C4983(abstractC50033, str3, propertyReference1.getBoundReceiver(), abstractC50033.m9976(propertyReference1.getName(), str3));
            case 4:
                AbstractC5003 abstractC50034 = (AbstractC5003) obj2;
                MutablePropertyReference1 mutablePropertyReference1 = (MutablePropertyReference1) obj;
                String str4 = (String) obj3;
                if (!(abstractC50034 instanceof C4992)) {
                    return new C5022(abstractC50034, mutablePropertyReference1.getName(), str4, mutablePropertyReference1.getBoundReceiver());
                }
                return new C4995(abstractC50034, str4, mutablePropertyReference1.getBoundReceiver(), abstractC50034.m9976(mutablePropertyReference1.getName(), str4));
            case 5:
                AbstractC4575 abstractC4575 = (AbstractC4575) obj2;
                C4845 c4845 = ((C7041) abstractC4575.f13336.f1095).f18894;
                C5028 c5028 = new C5028(abstractC4575, (C4446) obj, (Ref$ObjectRef) obj3);
                c4845.getClass();
                return new C4843(c4845, c5028);
            case 6:
                return ((AbstractC4712) ((InterfaceC4699) obj2)).m9407((ByteArrayInputStream) obj, ((AbstractC4795) obj3).f13977.f14062.f14100);
            default:
                return new C7015((AbstractC7014) obj3, (C4845) obj2, (C4461) obj);
        }
    }

    public /* synthetic */ C5042(Object obj, Object obj2, Object obj3, int i) {
        this.f14532 = i;
        this.f14530 = obj;
        this.f14531 = obj2;
        this.f14529 = obj3;
    }
}
