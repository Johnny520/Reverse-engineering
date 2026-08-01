package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import androidx.compose.animation.core.C0325;
import androidx.compose.foundation.draganddrop.AbstractC0455;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.collections.AbstractC4343;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4470;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4472;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4479;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4498;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.C4595;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Class;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Function;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.C4823;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4881;
import p052.InterfaceC6542;
import p175.AbstractC7738;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C4781 implements InterfaceC6542 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final Object f13921;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f13922;

    public /* synthetic */ C4781(Object obj, int i) {
        this.f13922 = i;
        this.f13921 = obj;
    }

    @Override // p052.InterfaceC6542
    public final Object invoke() {
        int i = this.f13922;
        Object obj = this.f13921;
        switch (i) {
            case 0:
                return (ArrayList) obj;
            case 1:
                HashSet hashSet = new HashSet();
                C4800 c4800 = (C4800) ((C0325) obj).f1093;
                C4595 c4595 = c4800.f13988;
                C4823 c4823 = c4800.f13990;
                ProtoBuf$Class protoBuf$Class = c4800.f13999;
                Iterator it = c4595.mo9504().iterator();
                while (it.hasNext()) {
                    for (InterfaceC4498 interfaceC4498 : AbstractC0455.m1162(((AbstractC4881) it.next()).mo9734(), null, 3)) {
                        if ((interfaceC4498 instanceof InterfaceC4470) || (interfaceC4498 instanceof InterfaceC4472)) {
                            hashSet.add(((InterfaceC4479) interfaceC4498).getName());
                        }
                    }
                }
                List<ProtoBuf$Function> functionList = protoBuf$Class.getFunctionList();
                functionList.getClass();
                Iterator<T> it2 = functionList.iterator();
                while (it2.hasNext()) {
                    hashSet.add(AbstractC7738.m13047(c4823.f14057, ((ProtoBuf$Function) it2.next()).getName()));
                }
                List<ProtoBuf$Property> propertyList = protoBuf$Class.getPropertyList();
                propertyList.getClass();
                Iterator<T> it3 = propertyList.iterator();
                while (it3.hasNext()) {
                    hashSet.add(AbstractC7738.m13047(c4823.f14057, ((ProtoBuf$Property) it3.next()).getName()));
                }
                return AbstractC0455.m1156(hashSet, hashSet);
            case 2:
                return AbstractC4343.m8800((Iterable) ((InterfaceC6542) obj).invoke());
            case 3:
                AbstractC4794 abstractC4794 = (AbstractC4794) obj;
                Set setMo9534 = abstractC4794.mo9534();
                if (setMo9534 == null) {
                    return null;
                }
                return AbstractC0455.m1156(AbstractC0455.m1156(abstractC4794.m9535(), abstractC4794.f13972.f13950.keySet()), setMo9534);
            default:
                C4786 c4786 = (C4786) obj;
                C4823 c48232 = c4786.f13934;
                return AbstractC4343.m8804(c48232.f14058.f14084.mo2417(c4786.f13933, c48232.f14057));
        }
    }
}
