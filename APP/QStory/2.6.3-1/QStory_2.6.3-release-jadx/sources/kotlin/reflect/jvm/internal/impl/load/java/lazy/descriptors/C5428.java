package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import androidx.appcompat.app.C0955;
import androidx.compose.animation.core.C1171;
import androidx.compose.p001ui.graphics.vector.C2397;
import com.alibaba.fastjson2.AbstractC3738;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.collections.AbstractC5176;
import kotlin.collections.AbstractC5177;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.AbstractC5227;
import kotlin.reflect.jvm.internal.impl.descriptors.C5293;
import kotlin.reflect.jvm.internal.impl.descriptors.C5299;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5295;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5309;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5318;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.AbstractC5269;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.C5282;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.load.java.AbstractC5447;
import kotlin.reflect.jvm.internal.impl.load.java.AbstractC5459;
import kotlin.reflect.jvm.internal.impl.load.java.AnnotationQualifierApplicabilityType;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Class;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type;
import kotlin.reflect.jvm.internal.impl.name.AbstractC5516;
import kotlin.reflect.jvm.internal.impl.name.C5518;
import kotlin.reflect.jvm.internal.impl.name.C5519;
import kotlin.reflect.jvm.internal.impl.name.C5520;
import kotlin.reflect.jvm.internal.impl.name.C5523;
import kotlin.reflect.jvm.internal.impl.resolve.constants.C5580;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.AbstractC5605;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.C5656;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.InterfaceC5660;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.C5615;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.C5633;
import kotlin.reflect.jvm.internal.impl.storage.C5677;
import kotlin.reflect.jvm.internal.impl.storage.C5679;
import kotlin.reflect.jvm.internal.impl.types.AbstractC5710;
import kotlin.reflect.jvm.internal.impl.types.AbstractC5714;
import kotlin.reflect.jvm.internal.impl.types.AbstractC5725;
import kotlin.reflect.jvm.internal.impl.types.AbstractC5726;
import kotlin.reflect.jvm.internal.impl.types.C5706;
import kotlin.reflect.jvm.internal.impl.types.C5717;
import kotlin.reflect.jvm.internal.impl.types.C5751;
import kotlin.reflect.jvm.internal.impl.types.TypeUsage;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import p050.AbstractC7176;
import p062.InterfaceC7307;
import p064.C7346;
import p064.C7348;
import p065.AbstractC7355;
import p065.AbstractC7359;
import p086.AbstractC7738;
import p089.C7755;
import p089.C7767;
import p095.AbstractC7818;
import p095.AbstractC7829;
import p099.C7868;
import p099.C7870;
import p332.C9496;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5428 extends AbstractC5726 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final /* synthetic */ AbstractC7829 f13751;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final C5679 f13752;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ int f13753 = 0;

    /* JADX WARN: Illegal instructions before constructor call */
    public C5428(C5432 c5432) {
        this.f13751 = c5432;
        C1171 c1171 = c5432.f13770;
        super(((C7870) c1171.f1440).f19239);
        C5677 c5677 = ((C7870) c1171.f1440).f19239;
        C5429 c5429 = new C5429(c5432, 2);
        c5677.getClass();
        this.f13752 = new C5679(c5677, c5429);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.InterfaceC5705
    public final List getParameters() {
        switch (this.f13753) {
        }
        return (List) this.f13752.invoke();
    }

    public final String toString() {
        int i = this.f13753;
        AbstractC7829 abstractC7829 = this.f13751;
        switch (i) {
            case 0:
                String strM9894 = ((C5432) abstractC7829).getName().m9894();
                strM9894.getClass();
                return strM9894;
            default:
                String str = ((C5633) abstractC7829).getName().f14050;
                str.getClass();
                return str;
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC5741
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final C5293 mo9768() {
        switch (this.f13753) {
            case 0:
                return ((C7870) ((C5432) this.f13751).f13770.f1440).f19247;
            default:
                return C5293.f13434;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:115:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x02d6  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x02db  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x02e4  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x031b  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0320  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0258  */
    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC5741
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Collection mo9769() {
        Class cls;
        Collection<C5282> collection;
        String str;
        C5519 c5519;
        C5519 c55192;
        ArrayList arrayList;
        AbstractC5710 abstractC5710M10373;
        AbstractC5714 abstractC5714M10421;
        String strM9894;
        C5519 c5519M9886;
        int i = this.f13753;
        AbstractC7829 abstractC7829 = this.f13751;
        switch (i) {
            case 0:
                C5432 c5432 = (C5432) abstractC7829;
                C1171 c1171 = c5432.f13770;
                Class cls2 = c5432.f13777.f13428;
                cls = Object.class;
                if (AbstractC5227.m9466(cls2, cls)) {
                    collection = EmptyList.INSTANCE;
                } else {
                    C2397 c2397 = new C2397(2);
                    Type genericSuperclass = cls2.getGenericSuperclass();
                    c2397.m3401(genericSuperclass != null ? genericSuperclass : Object.class);
                    c2397.m3399(cls2.getGenericInterfaces());
                    ArrayList arrayList2 = c2397.f4945;
                    List listM12490 = AbstractC7176.m12490(arrayList2.toArray(new Type[arrayList2.size()]));
                    ArrayList arrayList3 = new ArrayList(AbstractC5177.m9381(listM12490, 10));
                    Iterator it = listM12490.iterator();
                    while (it.hasNext()) {
                        arrayList3.add(new C5282((Type) it.next()));
                    }
                    collection = arrayList3;
                }
                ArrayList arrayList4 = new ArrayList(collection.size());
                ArrayList<AbstractC5269> arrayList5 = new ArrayList(0);
                C7868 c7868 = c5432.f13771;
                C5519 c55193 = AbstractC5447.f13837;
                c55193.getClass();
                InterfaceC7307 interfaceC7307Mo10076 = c7868.mo10076(c55193);
                if (interfaceC7307Mo10076 == null) {
                    c5519 = null;
                } else {
                    Object objM9341 = AbstractC5176.m9341(interfaceC7307Mo10076.mo9735().values());
                    C5580 c5580 = objM9341 instanceof C5580 ? (C5580) objM9341 : null;
                    if (c5580 != null && (str = (String) c5580.f14250) != null && AbstractC5516.m9868(str)) {
                        c5519 = new C5519(str);
                    }
                }
                if (c5519 != null) {
                    C5518 c5518 = c5519.f14041;
                    if (!c5518.m9873()) {
                        C5523 c5523 = AbstractC7355.f18197;
                        c5523.getClass();
                        if (!c5518.m9876(c5523)) {
                            c5519 = null;
                        }
                    }
                }
                if (c5519 == null) {
                    LinkedHashMap linkedHashMap = AbstractC5459.f13885;
                    c55192 = (C5519) AbstractC5459.f13884.get(AbstractC5605.m10064(c5432));
                    if (c55192 == null) {
                        abstractC5710M10373 = null;
                    }
                    for (C5282 c5282 : collection) {
                        AbstractC5714 abstractC5714M917 = ((C0955) c1171.f1438).m917(c5282, C9496.m14920(TypeUsage.SUPERTYPE, false, null, 7));
                        C7755 c7755 = ((C7870) c1171.f1440).f19249;
                        c7755.getClass();
                        AbstractC5714 abstractC5714M12784 = c7755.m12784(new C7767(null, false, c1171, AnnotationQualifierApplicabilityType.TYPE_USE, true), abstractC5714M917, EmptyList.INSTANCE, null, false);
                        if (abstractC5714M12784 == null) {
                            abstractC5714M12784 = abstractC5714M917;
                        }
                        if (abstractC5714M12784.mo10281().mo9770() instanceof C5299) {
                            arrayList5.add(c5282);
                        }
                        if (!AbstractC5227.m9466(abstractC5714M12784.mo10281(), abstractC5710M10373 != null ? abstractC5710M10373.mo10281() : null) && !AbstractC7359.m12581(abstractC5714M12784)) {
                            arrayList4.add(abstractC5714M12784);
                        }
                    }
                    AbstractC7818 abstractC7818 = c5432.f13778;
                    abstractC5714M10421 = abstractC7818 != null ? new C5751(AbstractC3738.m6879(abstractC7818, c5432)).m10421(abstractC7818.mo9584(), Variance.INVARIANT) : null;
                    if (abstractC5714M10421 != null) {
                        arrayList4.add(abstractC5714M10421);
                    }
                    if (abstractC5710M10373 != null) {
                        arrayList4.add(abstractC5710M10373);
                    }
                    if (!arrayList5.isEmpty()) {
                        InterfaceC5660 interfaceC5660 = ((C7870) c1171.f1440).f19234;
                        ArrayList arrayList6 = new ArrayList(AbstractC5177.m9381(arrayList5, 10));
                        for (AbstractC5269 abstractC5269 : arrayList5) {
                            abstractC5269.getClass();
                            arrayList6.add(((C5282) abstractC5269).f13424.toString());
                        }
                        interfaceC5660.mo10125(c5432, arrayList6);
                    }
                    return arrayList4.isEmpty() ? AbstractC5176.m9356(arrayList4) : AbstractC7176.m12487(((C7870) c1171.f1440).f19250.mo9620().m12584());
                }
                c55192 = c5519;
                InterfaceC5318 interfaceC5318 = ((C7870) c1171.f1440).f19250;
                NoLookupLocation noLookupLocation = NoLookupLocation.FROM_JAVA_LOADER;
                int i2 = AbstractC5605.f14254;
                interfaceC5318.getClass();
                noLookupLocation.getClass();
                C5518 c55182 = c55192.f14041;
                c55182.m9873();
                InterfaceC5309 interfaceC5309Mo9714 = interfaceC5318.mo9621(c55192.m9879()).f19159.mo9714(c55182.m9877(), noLookupLocation);
                AbstractC7818 abstractC78182 = interfaceC5309Mo9714 instanceof AbstractC7818 ? (AbstractC7818) interfaceC5309Mo9714 : null;
                if (abstractC78182 != null) {
                    int size = abstractC78182.mo9560().getParameters().size();
                    List parameters = c5432.f13776.getParameters();
                    parameters.getClass();
                    int size2 = parameters.size();
                    if (size2 == size) {
                        arrayList = new ArrayList(AbstractC5177.m9381(parameters, 10));
                        Iterator it2 = parameters.iterator();
                        while (it2.hasNext()) {
                            arrayList.add(new C5717(((InterfaceC5295) it2.next()).mo9584(), Variance.INVARIANT));
                        }
                    } else {
                        if (size2 == 1 && size > 1 && c5519 == null) {
                            C5717 c5717 = new C5717(((InterfaceC5295) AbstractC5176.m9338(parameters)).mo9584(), Variance.INVARIANT);
                            C7348 c7348 = new C7348(1, size, 1);
                            ArrayList arrayList7 = new ArrayList(AbstractC5177.m9381(c7348, 10));
                            Iterator it3 = c7348.iterator();
                            while (true) {
                                C7346 c7346 = (C7346) it3;
                                if (c7346.f18168) {
                                    c7346.nextInt();
                                    arrayList7.add(c5717);
                                } else {
                                    arrayList = arrayList7;
                                }
                            }
                        }
                        abstractC5710M10373 = null;
                    }
                    C5706.f14520.getClass();
                    abstractC5710M10373 = AbstractC5725.m10373(C5706.f14521, abstractC78182, arrayList);
                }
                while (r1.hasNext()) {
                }
                AbstractC7818 abstractC78183 = c5432.f13778;
                if (abstractC78183 != null) {
                }
                if (abstractC5714M10421 != null) {
                }
                if (abstractC5710M10373 != null) {
                }
                if (!arrayList5.isEmpty()) {
                }
                if (arrayList4.isEmpty()) {
                }
                break;
            default:
                C5633 c5633 = (C5633) abstractC7829;
                ProtoBuf$Class protoBuf$Class = c5633.f14348;
                C5656 c5656 = c5633.f14339;
                List listM12751 = AbstractC7738.m12751(protoBuf$Class, c5656.f14404);
                ArrayList arrayList8 = new ArrayList(AbstractC5177.m9381(listM12751, 10));
                Iterator it4 = listM12751.iterator();
                while (it4.hasNext()) {
                    arrayList8.add(c5656.f14408.m10110((ProtoBuf$Type) it4.next()));
                }
                ArrayList arrayListM9352 = AbstractC5176.m9352(c5656.f14407.f14440.mo9520(c5633), arrayList8);
                ArrayList<C5299> arrayList9 = new ArrayList();
                Iterator it5 = arrayListM9352.iterator();
                while (it5.hasNext()) {
                    InterfaceC5309 interfaceC5309Mo9770 = ((AbstractC5714) it5.next()).mo10281().mo9770();
                    C5299 c5299 = interfaceC5309Mo9770 instanceof C5299 ? (C5299) interfaceC5309Mo9770 : null;
                    if (c5299 != null) {
                        arrayList9.add(c5299);
                    }
                }
                if (!arrayList9.isEmpty()) {
                    InterfaceC5660 interfaceC56602 = c5656.f14407.f14446;
                    ArrayList arrayList10 = new ArrayList(AbstractC5177.m9381(arrayList9, 10));
                    for (C5299 c52992 : arrayList9) {
                        C5520 c5520M10057 = AbstractC5605.m10057(c52992);
                        if (c5520M10057 == null || (c5519M9886 = c5520M10057.m9886()) == null || (strM9894 = c5519M9886.f14041.f14038) == null) {
                            strM9894 = c52992.getName().m9894();
                            strM9894.getClass();
                        }
                        arrayList10.add(strM9894);
                    }
                    interfaceC56602.mo10125(c5633, arrayList10);
                }
                return AbstractC5176.m9356(arrayListM9352);
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC5726, kotlin.reflect.jvm.internal.impl.types.InterfaceC5705
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final InterfaceC5309 mo9770() {
        int i = this.f13753;
        AbstractC7829 abstractC7829 = this.f13751;
        switch (i) {
            case 0:
                return (C5432) abstractC7829;
            default:
                return (C5633) abstractC7829;
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.InterfaceC5705
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final boolean mo9771() {
        switch (this.f13753) {
        }
        return true;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC5726
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final AbstractC7818 mo9770() {
        int i = this.f13753;
        AbstractC7829 abstractC7829 = this.f13751;
        switch (i) {
            case 0:
                return (C5432) abstractC7829;
            default:
                return (C5633) abstractC7829;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C5428(C5633 c5633) {
        this.f13751 = c5633;
        C5656 c5656 = c5633.f14339;
        super(c5656.f14407.f14437);
        C5677 c5677 = c5656.f14407.f14437;
        C5615 c5615 = new C5615(c5633, 6);
        c5677.getClass();
        this.f13752 = new C5679(c5677, c5615);
    }
}
