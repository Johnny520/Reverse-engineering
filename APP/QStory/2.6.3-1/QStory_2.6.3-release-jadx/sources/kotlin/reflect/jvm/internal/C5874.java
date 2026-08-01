package kotlin.reflect.jvm.internal;

import io.ktor.util.C5043;
import java.io.ByteArrayInputStream;
import java.lang.reflect.Type;
import kotlin.collections.AbstractC5179;
import kotlin.collections.C5160;
import kotlin.jvm.internal.AbstractC5227;
import kotlin.jvm.internal.MutablePropertyReference0;
import kotlin.jvm.internal.MutablePropertyReference1;
import kotlin.jvm.internal.PropertyReference0;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.reflect.jvm.internal.impl.descriptors.C5293;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.C5278;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.AbstractC5407;
import kotlin.reflect.jvm.internal.impl.name.C5520;
import kotlin.reflect.jvm.internal.impl.protobuf.AbstractC5544;
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC5531;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.AbstractC5627;
import kotlin.reflect.jvm.internal.impl.storage.C5675;
import kotlin.reflect.jvm.internal.impl.storage.C5677;
import kotlin.text.C5980;
import kotlin.text.InterfaceC5982;
import p068.InterfaceC7372;
import p095.AbstractC7843;
import p095.C7844;
import p099.C7870;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.飘花落叶言子苏兰世哲楪, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C5874 implements InterfaceC7372 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final Object f14874;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final Object f14875;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final Object f14876;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f14877;

    public C5874(AbstractC7843 abstractC7843, C5677 c5677, C5293 c5293) {
        this.f14877 = 7;
        this.f14874 = abstractC7843;
        this.f14875 = c5677;
        this.f14876 = c5293;
    }

    @Override // p068.InterfaceC7372
    public final Object invoke() {
        int i = this.f14877;
        Object obj = this.f14876;
        Object obj2 = this.f14875;
        Object obj3 = this.f14874;
        switch (i) {
            case 0:
                C5836 c5836 = (C5836) obj2;
                Class cls = (Class) obj;
                C5520 c5520 = (C5520) obj3;
                Class cls2 = c5836.f14769;
                if (AbstractC5227.m9466(cls2.getSuperclass(), cls)) {
                    Type genericSuperclass = cls2.getGenericSuperclass();
                    genericSuperclass.getClass();
                    return genericSuperclass;
                }
                Class<?>[] interfaces = cls2.getInterfaces();
                interfaces.getClass();
                int iM9411 = AbstractC5179.m9411(cls, interfaces);
                if (iM9411 < 0) {
                    C5043.m9166("No superclass of ", c5836, " in Java reflection for ", c5520);
                    return null;
                }
                Type type = cls2.getGenericInterfaces()[iM9411];
                type.getClass();
                return type;
            case 1:
                String str = (String) obj2;
                AbstractC5835 abstractC5835 = (AbstractC5835) obj;
                PropertyReference0 propertyReference0 = (PropertyReference0) obj3;
                InterfaceC5982 interfaceC5982MatchEntire = AbstractC5835.f14767.matchEntire(str);
                if (interfaceC5982MatchEntire != null) {
                    return abstractC5835.m10538(Integer.parseInt((String) ((C5160) ((C5980) interfaceC5982MatchEntire).m10740()).get(1)), str);
                }
                if (!(abstractC5835 instanceof C5824)) {
                    return new C5781(abstractC5835, propertyReference0.getName(), str, propertyReference0.getBoundReceiver());
                }
                return new C5797(abstractC5835, str, propertyReference0.getBoundReceiver(), abstractC5835.m10535(propertyReference0.getName(), str));
            case 2:
                String str2 = (String) obj2;
                AbstractC5835 abstractC58352 = (AbstractC5835) obj;
                MutablePropertyReference0 mutablePropertyReference0 = (MutablePropertyReference0) obj3;
                InterfaceC5982 interfaceC5982MatchEntire2 = AbstractC5835.f14767.matchEntire(str2);
                if (interfaceC5982MatchEntire2 != null) {
                    return abstractC58352.m10538(Integer.parseInt((String) ((C5160) ((C5980) interfaceC5982MatchEntire2).m10740()).get(1)), str2);
                }
                if (!(abstractC58352 instanceof C5824)) {
                    return new C5851(abstractC58352, mutablePropertyReference0.getName(), str2, mutablePropertyReference0.getBoundReceiver());
                }
                return new C5829(abstractC58352, str2, mutablePropertyReference0.getBoundReceiver(), abstractC58352.m10535(mutablePropertyReference0.getName(), str2));
            case 3:
                AbstractC5835 abstractC58353 = (AbstractC5835) obj2;
                PropertyReference1 propertyReference1 = (PropertyReference1) obj;
                String str3 = (String) obj3;
                if (!(abstractC58353 instanceof C5824)) {
                    return new C5782(abstractC58353, propertyReference1.getName(), str3, propertyReference1.getBoundReceiver());
                }
                return new C5815(abstractC58353, str3, propertyReference1.getBoundReceiver(), abstractC58353.m10535(propertyReference1.getName(), str3));
            case 4:
                AbstractC5835 abstractC58354 = (AbstractC5835) obj2;
                MutablePropertyReference1 mutablePropertyReference1 = (MutablePropertyReference1) obj;
                String str4 = (String) obj3;
                if (!(abstractC58354 instanceof C5824)) {
                    return new C5854(abstractC58354, mutablePropertyReference1.getName(), str4, mutablePropertyReference1.getBoundReceiver());
                }
                return new C5827(abstractC58354, str4, mutablePropertyReference1.getBoundReceiver(), abstractC58354.m10535(mutablePropertyReference1.getName(), str4));
            case 5:
                AbstractC5407 abstractC5407 = (AbstractC5407) obj2;
                C5677 c5677 = ((C7870) abstractC5407.f13681.f1440).f19239;
                C5860 c5860 = new C5860(abstractC5407, (C5278) obj, (Ref$ObjectRef) obj3);
                c5677.getClass();
                return new C5675(c5677, c5860);
            case 6:
                return ((AbstractC5544) ((InterfaceC5531) obj2)).m9966((ByteArrayInputStream) obj, ((AbstractC5627) obj3).f14322.f14407.f14445);
            default:
                return new C7844((AbstractC7843) obj3, (C5677) obj2, (C5293) obj);
        }
    }

    public /* synthetic */ C5874(Object obj, Object obj2, Object obj3, int i) {
        this.f14877 = i;
        this.f14875 = obj;
        this.f14876 = obj2;
        this.f14874 = obj3;
    }
}
