package kotlin.reflect.jvm.internal;

import io.ktor.util.C4210;
import java.io.ByteArrayInputStream;
import java.lang.reflect.Type;
import kotlin.collections.AbstractC4346;
import kotlin.collections.C4327;
import kotlin.jvm.internal.AbstractC4394;
import kotlin.jvm.internal.MutablePropertyReference0;
import kotlin.jvm.internal.MutablePropertyReference1;
import kotlin.jvm.internal.PropertyReference0;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.reflect.jvm.internal.impl.descriptors.C4460;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.C4445;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.AbstractC4574;
import kotlin.reflect.jvm.internal.impl.name.C4687;
import kotlin.reflect.jvm.internal.impl.protobuf.AbstractC4711;
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4698;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.AbstractC4794;
import kotlin.reflect.jvm.internal.impl.storage.C4842;
import kotlin.reflect.jvm.internal.impl.storage.C4844;
import kotlin.text.C5147;
import kotlin.text.InterfaceC5149;
import p052.InterfaceC6542;
import p079.AbstractC7013;
import p079.C7014;
import p083.C7040;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.飘花落叶言子苏兰世哲楪, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C5041 implements InterfaceC6542 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final Object f14527;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final Object f14528;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final Object f14529;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f14530;

    public C5041(AbstractC7013 abstractC7013, C4844 c4844, C4460 c4460) {
        this.f14530 = 7;
        this.f14527 = abstractC7013;
        this.f14528 = c4844;
        this.f14529 = c4460;
    }

    @Override // p052.InterfaceC6542
    public final Object invoke() {
        int i = this.f14530;
        Object obj = this.f14529;
        Object obj2 = this.f14528;
        Object obj3 = this.f14527;
        switch (i) {
            case 0:
                C5003 c5003 = (C5003) obj2;
                Class cls = (Class) obj;
                C4687 c4687 = (C4687) obj3;
                Class cls2 = c5003.f14422;
                if (AbstractC4394.m8917(cls2.getSuperclass(), cls)) {
                    Type genericSuperclass = cls2.getGenericSuperclass();
                    genericSuperclass.getClass();
                    return genericSuperclass;
                }
                Class<?>[] interfaces = cls2.getInterfaces();
                interfaces.getClass();
                int iM8844 = AbstractC4346.m8844(cls, interfaces);
                if (iM8844 < 0) {
                    C4210.m8617("No superclass of ", c5003, " in Java reflection for ", c4687);
                    return null;
                }
                Type type = cls2.getGenericInterfaces()[iM8844];
                type.getClass();
                return type;
            case 1:
                String str = (String) obj2;
                AbstractC5002 abstractC5002 = (AbstractC5002) obj;
                PropertyReference0 propertyReference0 = (PropertyReference0) obj3;
                InterfaceC5149 interfaceC5149MatchEntire = AbstractC5002.f14420.matchEntire(str);
                if (interfaceC5149MatchEntire != null) {
                    return abstractC5002.m9982(Integer.parseInt((String) ((C4327) ((C5147) interfaceC5149MatchEntire).m10177()).get(1)), str);
                }
                if (!(abstractC5002 instanceof C4991)) {
                    return new C4948(abstractC5002, propertyReference0.getName(), str, propertyReference0.getBoundReceiver());
                }
                return new C4964(abstractC5002, str, propertyReference0.getBoundReceiver(), abstractC5002.m9979(propertyReference0.getName(), str));
            case 2:
                String str2 = (String) obj2;
                AbstractC5002 abstractC50022 = (AbstractC5002) obj;
                MutablePropertyReference0 mutablePropertyReference0 = (MutablePropertyReference0) obj3;
                InterfaceC5149 interfaceC5149MatchEntire2 = AbstractC5002.f14420.matchEntire(str2);
                if (interfaceC5149MatchEntire2 != null) {
                    return abstractC50022.m9982(Integer.parseInt((String) ((C4327) ((C5147) interfaceC5149MatchEntire2).m10177()).get(1)), str2);
                }
                if (!(abstractC50022 instanceof C4991)) {
                    return new C5018(abstractC50022, mutablePropertyReference0.getName(), str2, mutablePropertyReference0.getBoundReceiver());
                }
                return new C4996(abstractC50022, str2, mutablePropertyReference0.getBoundReceiver(), abstractC50022.m9979(mutablePropertyReference0.getName(), str2));
            case 3:
                AbstractC5002 abstractC50023 = (AbstractC5002) obj2;
                PropertyReference1 propertyReference1 = (PropertyReference1) obj;
                String str3 = (String) obj3;
                if (!(abstractC50023 instanceof C4991)) {
                    return new C4949(abstractC50023, propertyReference1.getName(), str3, propertyReference1.getBoundReceiver());
                }
                return new C4982(abstractC50023, str3, propertyReference1.getBoundReceiver(), abstractC50023.m9979(propertyReference1.getName(), str3));
            case 4:
                AbstractC5002 abstractC50024 = (AbstractC5002) obj2;
                MutablePropertyReference1 mutablePropertyReference1 = (MutablePropertyReference1) obj;
                String str4 = (String) obj3;
                if (!(abstractC50024 instanceof C4991)) {
                    return new C5021(abstractC50024, mutablePropertyReference1.getName(), str4, mutablePropertyReference1.getBoundReceiver());
                }
                return new C4994(abstractC50024, str4, mutablePropertyReference1.getBoundReceiver(), abstractC50024.m9979(mutablePropertyReference1.getName(), str4));
            case 5:
                AbstractC4574 abstractC4574 = (AbstractC4574) obj2;
                C4844 c4844 = ((C7040) abstractC4574.f13332.f1095).f18899;
                C5027 c5027 = new C5027(abstractC4574, (C4445) obj, (Ref$ObjectRef) obj3);
                c4844.getClass();
                return new C4842(c4844, c5027);
            case 6:
                return ((AbstractC4711) ((InterfaceC4698) obj2)).m9417((ByteArrayInputStream) obj, ((AbstractC4794) obj3).f13973.f14058.f14096);
            default:
                return new C7014((AbstractC7013) obj3, (C4844) obj2, (C4460) obj);
        }
    }

    public /* synthetic */ C5041(Object obj, Object obj2, Object obj3, int i) {
        this.f14530 = i;
        this.f14528 = obj;
        this.f14529 = obj2;
        this.f14527 = obj3;
    }
}
