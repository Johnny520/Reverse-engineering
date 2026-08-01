package kotlin.reflect.jvm.internal;

import androidx.compose.animation.core.C1171;
import androidx.compose.runtime.C2157;
import io.ktor.client.plugins.AbstractC4765;
import io.ktor.util.C5043;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.C6008;
import kotlin.InterfaceC6016;
import kotlin.collections.AbstractC5176;
import kotlin.collections.AbstractC5177;
import kotlin.collections.AbstractC5179;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.AbstractC5227;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.reflect.AbstractC5922;
import kotlin.reflect.C5917;
import kotlin.reflect.KVariance;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.C5245;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.C5252;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.C5254;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.C5255;
import kotlin.reflect.jvm.internal.impl.descriptors.AbstractC5323;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor$Kind;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5294;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5305;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5309;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5310;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5316;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5331;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.C5267;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.C5278;
import kotlin.reflect.jvm.internal.impl.load.java.C5442;
import kotlin.reflect.jvm.internal.impl.load.java.C5452;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.AbstractC5407;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.C5421;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.C5424;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.C5432;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$EnumEntry;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type;
import kotlin.reflect.jvm.internal.impl.name.C5519;
import kotlin.reflect.jvm.internal.impl.name.C5523;
import kotlin.reflect.jvm.internal.impl.p009km.C5366;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.C5642;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.C5656;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.C5633;
import kotlin.reflect.jvm.internal.impl.storage.C5672;
import kotlin.reflect.jvm.internal.impl.storage.C5677;
import kotlin.reflect.jvm.internal.impl.types.AbstractC5702;
import kotlin.reflect.jvm.internal.impl.types.AbstractC5714;
import kotlin.reflect.jvm.internal.impl.types.AbstractC5725;
import kotlin.reflect.jvm.internal.impl.types.AbstractC5746;
import kotlin.reflect.jvm.internal.impl.types.C5706;
import kotlin.reflect.jvm.internal.impl.types.C5712;
import kotlin.reflect.jvm.internal.impl.types.C5751;
import kotlin.reflect.jvm.internal.impl.types.InterfaceC5705;
import kotlin.reflect.jvm.internal.impl.types.checker.AbstractC5693;
import kotlin.reflect.jvm.internal.impl.types.checker.C5681;
import kotlin.reflect.jvm.internal.impl.types.checker.C5694;
import kotlin.reflect.jvm.internal.types.AbstractC5766;
import kotlin.reflect.jvm.internal.types.C5753;
import kotlin.reflect.jvm.internal.types.C5770;
import net.bytebuddy.description.method.MethodDescription;
import okhttp3.internal.http2.ErrorCode;
import p025.AbstractC7012;
import p025.C7003;
import p029.AbstractC7054;
import p035.C7097;
import p035.C7106;
import p050.AbstractC7176;
import p062.InterfaceC7310;
import p063.C7320;
import p068.InterfaceC7372;
import p068.InterfaceC7387;
import p093.C7800;
import p095.AbstractC7818;
import p095.AbstractC7825;
import p095.AbstractC7831;
import p095.AbstractC7843;
import p095.C7812;
import p095.C7817;
import p095.C7835;
import p095.C7845;
import p095.C7847;
import p099.C7867;
import p099.C7870;
import p099.InterfaceC7866;
import p100.C7875;
import p100.C7877;
import p113.InterfaceC8049;
import p117.C8094;
import p119.C8103;
import p366.C9687;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C5860 implements InterfaceC7372 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final Object f14846;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final Object f14847;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f14848;

    public C5860(AbstractC5407 abstractC5407, C5278 c5278, Ref$ObjectRef ref$ObjectRef) {
        this.f14848 = 8;
        this.f14846 = abstractC5407;
        this.f14847 = ref$ObjectRef;
    }

    @Override // p068.InterfaceC7372
    public final Object invoke() throws Throwable {
        C5917 c5917M10659;
        C5917 c5917;
        ErrorCode errorCode;
        int i = this.f14848;
        C6008 c6008 = C6008.f15084;
        int i2 = 0;
        int i3 = 1;
        IOException iOException = null;
        iOException = null;
        Object obj = this.f14846;
        Object obj2 = this.f14847;
        switch (i) {
            case 0:
                C5858 c5858 = (C5858) obj;
                String str = (String) obj2;
                AbstractC5835 abstractC5835 = c5858.f14843;
                String str2 = c5858.f14844;
                abstractC5835.getClass();
                str2.getClass();
                Collection collectionM9356 = str.equals(MethodDescription.CONSTRUCTOR_INTERNAL_NAME) ? AbstractC5176.m9356(abstractC5835.mo10494()) : abstractC5835.mo10493(C5523.m9889(str));
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : collectionM9356) {
                    if (AbstractC5227.m9466(AbstractC5900.m10638((InterfaceC5316) obj3).mo10554(), str2)) {
                        arrayList.add(obj3);
                    }
                }
                if (arrayList.size() == 1) {
                    return (InterfaceC5316) AbstractC5176.m9338(arrayList);
                }
                String strM9369 = AbstractC5176.m9369(collectionM9356, "\n", null, null, C5848.f14809, 30);
                StringBuilder sbM12141 = AbstractC7012.m12141("Function '", str, "' (JVM signature: ", str2, ") not resolved in ");
                sbM12141.append(abstractC5835);
                sbM12141.append(':');
                sbM12141.append(strM9369.length() == 0 ? " no members found" : "\n".concat(strM9369));
                throw new KotlinReflectionInternalError(sbM12141.toString());
            case 1:
                C5836 c5836 = (C5836) obj2;
                InterfaceC5309 interfaceC5309Mo9770 = ((AbstractC5714) obj).mo10281().mo9770();
                if (!(interfaceC5309Mo9770 instanceof AbstractC7818)) {
                    C5043.m9154(interfaceC5309Mo9770, "Supertype not a class: ");
                    return null;
                }
                Class clsM10631 = AbstractC5899.m10631((AbstractC7818) interfaceC5309Mo9770);
                if (clsM10631 == null) {
                    C5043.m9166("Unsupported superclass of ", c5836, ": ", interfaceC5309Mo9770);
                    return null;
                }
                Class cls = c5836.f14769;
                if (AbstractC5227.m9466(cls.getSuperclass(), clsM10631)) {
                    Type genericSuperclass = cls.getGenericSuperclass();
                    genericSuperclass.getClass();
                    return genericSuperclass;
                }
                Class<?>[] interfaces = cls.getInterfaces();
                interfaces.getClass();
                int iM9411 = AbstractC5179.m9411(clsM10631, interfaces);
                if (iM9411 < 0) {
                    C5043.m9166("No superclass of ", c5836, " in Java reflection for ", interfaceC5309Mo9770);
                    return null;
                }
                Type type = cls.getGenericInterfaces()[iM9411];
                type.getClass();
                return type;
            case 2:
                C5812 c5812 = (C5812) obj;
                C5902 c5902 = (C5902) obj2;
                C5366 c5366 = c5812.f14717.f13531;
                if (c5366 == null) {
                    AbstractC5227.m9467("type");
                    throw null;
                }
                ClassLoader classLoader = c5812.f14719.mo10502().mo9438().getClassLoader();
                classLoader.getClass();
                return AbstractC4765.m8849(c5366, classLoader, c5902, new C5844(c5812, 13));
            case 3:
                C5254 c5254 = (C5254) obj;
                C5677 c5677 = (C5677) obj2;
                InterfaceC7387 interfaceC7387 = c5254.f13380;
                C7817 c7817 = c5254.f13381;
                C7845 c7845 = new C7845((InterfaceC5331) interfaceC7387.invoke(c7817), C5254.f13378, Modality.ABSTRACT, ClassKind.INTERFACE, AbstractC7176.m12487(c7817.f19044.m12584()), c5677);
                c7845.m12916(new C5245(c5677, c7845), EmptySet.INSTANCE, null);
                return c7845;
            case 4:
                C5255 c5255 = (C5255) obj;
                C7817 c7817M12596 = c5255.m12596();
                c7817M12596.getClass();
                return new C5252(c7817M12596, (C5677) obj2, new C2157(c5255, i3));
            case 5:
                C5252 c5252 = (C5252) obj;
                C7817 c78172 = c5252.m9522().f13387;
                C5254.f13376.getClass();
                return AbstractC5323.m9634(c78172, C5254.f13377, new C1171((C5677) obj2, c5252.m9522().f13387)).mo9584();
            case 6:
                C5432 c5432 = (C5432) obj;
                C1171 c1171 = c5432.f13770;
                C7870 c7870 = (C7870) c1171.f1440;
                C1171 c11712 = new C1171(new C7870(c7870.f19239, c7870.f19238, c7870.f19237, c7870.f19236, c7870.f19235, c7870.f19234, c7870.f19252, c7870.f19256, c7870.f19257, c7870.f19254, c7870.f19255, c7870.f19247, c7870.f19246, c7870.f19250, c7870.f19251, c7870.f19248, c7870.f19249, c7870.f19241, c7870.f19240, c7870.f19244, c7870.f19245, c7870.f19242), (InterfaceC7866) c1171.f1441, (InterfaceC6016) c1171.f1439);
                InterfaceC5331 interfaceC5331Mo9587 = c5432.mo9587();
                interfaceC5331Mo9587.getClass();
                return new C5432(c11712, interfaceC5331Mo9587, c5432.f13777, (AbstractC7818) obj2);
            case 7:
                C7800 c7800 = ((C7870) ((C1171) obj).f1440).f19238;
                C5519 c5519 = ((C5421) obj2).f13725.f19032;
                c7800.getClass();
                c5519.getClass();
                return null;
            case 8:
                C7877 c7877 = ((C7870) ((AbstractC5407) obj).f13681.f1440).f19252;
                InterfaceC5305 interfaceC5305 = (InterfaceC5305) ((Ref$ObjectRef) obj2).element;
                c7877.getClass();
                interfaceC5305.getClass();
                return null;
            case 9:
                C5656 c5656 = ((C5642) obj).f14371;
                return c5656.f14407.f14433.mo2981((ProtoBuf$Type) obj2, c5656.f14406);
            case 10:
                C5633 c5633 = (C5633) obj;
                return AbstractC5176.m9356(c5633.f14339.f14407.f14433.mo2970(c5633.f14342, (ProtoBuf$EnumEntry) obj2));
            case 11:
                InterfaceC8049 interfaceC8049 = (InterfaceC8049) ((C5712) obj2).f14532.invoke();
                ((C5681) ((AbstractC5693) obj)).getClass();
                interfaceC8049.getClass();
                return (AbstractC5714) interfaceC8049;
            case 12:
                AbstractC5693 abstractC5693 = (AbstractC5693) obj2;
                Iterable iterable = (List) ((C5694) obj).f14489.getValue();
                if (iterable == null) {
                    iterable = EmptyList.INSTANCE;
                }
                ArrayList arrayList2 = new ArrayList(AbstractC5177.m9381(iterable, 10));
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    arrayList2.add(((AbstractC5746) it.next()).mo10280(abstractC5693));
                }
                return arrayList2;
            case 13:
                C5770 c5770 = (C5770) obj;
                InterfaceC7372 interfaceC7372 = (InterfaceC7372) obj2;
                List listMo10285 = c5770.f14639.mo10285();
                if (listMo10285.isEmpty()) {
                    return EmptyList.INSTANCE;
                }
                ArrayList arrayList3 = new ArrayList(AbstractC5177.m9381(listMo10285, 10));
                int i4 = 0;
                for (Object obj4 : listMo10285) {
                    int i5 = i4 + 1;
                    if (i4 < 0) {
                        AbstractC7176.m12479();
                        throw null;
                    }
                    AbstractC5702 abstractC5702 = (AbstractC5702) obj4;
                    C5866 c5866 = interfaceC7372 == null ? null : new C5866(new C5753(c5770, 1), i4, i2);
                    if (abstractC5702.mo10299()) {
                        c5917M10659 = C5917.f14981;
                    } else {
                        AbstractC5714 abstractC5714Mo10300 = abstractC5702.mo10300();
                        abstractC5714Mo10300.getClass();
                        C5770 c57702 = new C5770(abstractC5714Mo10300, c5866, false);
                        int i6 = AbstractC5766.f14630[abstractC5702.mo10301().ordinal()];
                        if (i6 != 1) {
                            if (i6 == 2) {
                                c5917 = new C5917(c57702, KVariance.f304IN);
                            } else {
                                if (i6 != 3) {
                                    C5043.m9170();
                                    return null;
                                }
                                c5917 = new C5917(c57702, KVariance.OUT);
                            }
                            c5917M10659 = c5917;
                        } else {
                            C5917 c59172 = C5917.f14981;
                            c5917M10659 = AbstractC5922.m10659(c57702);
                        }
                    }
                    arrayList3.add(c5917M10659);
                    i4 = i5;
                }
                return arrayList3;
            case 14:
                ((InterfaceC7387) obj).invoke(((C9687) obj2).f25321);
                return c6008;
            case 15:
                ((InterfaceC7387) obj).invoke((C7003) obj2);
                return c6008;
            case 16:
                C7106 c7106 = (C7106) obj2;
                C7097 c7097 = (C7097) obj;
                ErrorCode errorCode2 = ErrorCode.INTERNAL_ERROR;
                try {
                } catch (IOException e) {
                    iOException = e;
                    errorCode = errorCode2;
                } catch (Throwable th) {
                    th = th;
                    errorCode = errorCode2;
                    c7106.m12366(errorCode, errorCode2, iOException);
                    AbstractC7054.m12239(c7097);
                    throw th;
                }
                if (!c7097.m12342(true, this)) {
                    throw new IOException("Required SETTINGS preface not received");
                }
                while (c7097.m12342(false, this)) {
                }
                errorCode = ErrorCode.NO_ERROR;
                try {
                    try {
                        c7106.m12366(errorCode, ErrorCode.CANCEL, null);
                    } catch (IOException e2) {
                        iOException = e2;
                        ErrorCode errorCode3 = ErrorCode.PROTOCOL_ERROR;
                        c7106.m12366(errorCode3, errorCode3, iOException);
                    }
                    AbstractC7054.m12239(c7097);
                    return c6008;
                } catch (Throwable th2) {
                    th = th2;
                    c7106.m12366(errorCode, errorCode2, iOException);
                    AbstractC7054.m12239(c7097);
                    throw th;
                }
            case 17:
                StringBuilder sb = new StringBuilder();
                sb.append('@');
                sb.append(((Class) obj).getCanonicalName());
                AbstractC5176.m9368(((Map) obj2).entrySet(), sb, ", ", "(", ")", C7320.f18128, 48);
                return sb.toString();
            case 18:
                C5706.f14520.getClass();
                C5706 c5706 = C5706.f14521;
                InterfaceC5705 interfaceC5705Mo9560 = ((AbstractC7843) obj2).mo9560();
                List list = Collections.EMPTY_LIST;
                C2157 c2157 = new C2157(this, 15);
                C5672 c5672 = C5677.f14468;
                c5672.getClass();
                return AbstractC5725.m10378(list, c5706, interfaceC5705Mo9560, new C8094(c5672, c2157), false);
            case 19:
                C8103 c8103 = new C8103();
                Iterator it2 = ((AbstractC7831) obj2).mo9589().iterator();
                while (it2.hasNext()) {
                    c8103.add(((InterfaceC5316) it2.next()).mo9564((C5751) obj));
                }
                return c8103;
            case 20:
                C7812 c7812 = (C7812) obj;
                C7847 c7847 = (C7847) obj2;
                C5677 c56772 = c7812.f19028;
                AbstractC7825 abstractC7825 = c7812.f19027;
                InterfaceC7310 annotations = c7847.getAnnotations();
                CallableMemberDescriptor$Kind kind = c7847.getKind();
                kind.getClass();
                AbstractC7825 abstractC78252 = c7812.f19027;
                InterfaceC5294 interfaceC5294Mo9585 = abstractC78252.mo9585();
                interfaceC5294Mo9585.getClass();
                C7812 c78122 = new C7812(c56772, abstractC7825, c7847, c7812, annotations, kind, interfaceC5294Mo9585);
                C7812.f19025.getClass();
                C5751 c5751M10415 = abstractC78252.mo10078() == null ? null : C5751.m10415(abstractC78252.mo10080());
                if (c5751M10415 == null) {
                    return null;
                }
                C7835 c7835 = c7847.f19119;
                C7835 c7835Mo9564 = c7835 != null ? c7835.mo9564(c5751M10415) : null;
                List listMo9596 = c7847.mo9596();
                listMo9596.getClass();
                ArrayList arrayList4 = new ArrayList(AbstractC5177.m9381(listMo9596, 10));
                Iterator it3 = listMo9596.iterator();
                while (it3.hasNext()) {
                    arrayList4.add(((C7835) it3.next()).mo9564(c5751M10415));
                }
                List listMo9574 = abstractC78252.mo9574();
                List listMo9594 = c7812.mo9594();
                AbstractC5714 abstractC5714 = c7812.f19130;
                abstractC5714.getClass();
                c78122.mo12856(null, c7835Mo9564, arrayList4, listMo9574, listMo9594, abstractC5714, Modality.FINAL, abstractC78252.f19097);
                return c78122;
            case 21:
                C1171 c11713 = (C1171) obj;
                InterfaceC7310 annotations2 = ((InterfaceC5310) obj2).getAnnotations();
                c11713.getClass();
                annotations2.getClass();
                return C5442.m9777(((C7870) c11713.f1440).f19248, (C5452) ((InterfaceC6016) c11713.f1439).getValue(), annotations2);
            case 22:
                C1171 c11714 = (C1171) obj;
                InterfaceC7310 interfaceC7310 = (InterfaceC7310) obj2;
                c11714.getClass();
                interfaceC7310.getClass();
                return C5442.m9777(((C7870) c11714.f1440).f19248, (C5452) ((InterfaceC6016) c11714.f1439).getValue(), interfaceC7310);
            case 23:
                return new C5424(((C7867) obj).f19227, (C5267) obj2);
            default:
                return ((C7870) ((C1171) obj).f1440).f19250.mo9620().m12598(((C7875) obj2).f19270).mo9584();
        }
    }

    public /* synthetic */ C5860(Object obj, int i, Object obj2) {
        this.f14848 = i;
        this.f14846 = obj;
        this.f14847 = obj2;
    }

    public /* synthetic */ C5860(int i, Object obj, Object obj2, boolean z) {
        this.f14848 = i;
        this.f14847 = obj;
        this.f14846 = obj2;
    }
}
