package androidx.compose.runtime;

import androidx.compose.animation.core.C1171;
import androidx.compose.foundation.draganddrop.AbstractC1298;
import androidx.compose.foundation.lazy.layout.C1575;
import androidx.compose.runtime.snapshots.AbstractC2115;
import androidx.compose.runtime.snapshots.C2106;
import androidx.compose.runtime.snapshots.C2122;
import androidx.core.view.C3075;
import androidx.window.area.AbstractC3400;
import com.bumptech.glide.AbstractC3889;
import io.ktor.util.C5043;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.C6008;
import kotlin.collections.AbstractC5176;
import kotlin.collections.builders.ListBuilder;
import kotlin.jvm.internal.AbstractC5227;
import kotlin.reflect.jvm.internal.C5860;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5294;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5303;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5309;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5312;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.AbstractC5263;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.C5278;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.C5284;
import kotlin.reflect.jvm.internal.impl.load.java.AnnotationQualifierApplicabilityType;
import kotlin.reflect.jvm.internal.impl.load.java.C5442;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.C5410;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.C5416;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.C5417;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.C5420;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.C5421;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.C5422;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.C5424;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.C5425;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.C5430;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.C5432;
import kotlin.reflect.jvm.internal.impl.load.java.structure.LightClassOriginKind;
import kotlin.reflect.jvm.internal.impl.load.kotlin.C5483;
import kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader$Kind;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$EnumEntry;
import kotlin.reflect.jvm.internal.impl.name.C5518;
import kotlin.reflect.jvm.internal.impl.name.C5519;
import kotlin.reflect.jvm.internal.impl.name.C5520;
import kotlin.reflect.jvm.internal.impl.name.C5523;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.AbstractC5605;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.C5656;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.C5663;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.C5618;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.C5633;
import kotlin.reflect.jvm.internal.impl.storage.C5677;
import kotlin.reflect.jvm.internal.impl.storage.C5679;
import kotlin.reflect.jvm.internal.impl.types.AbstractC5714;
import kotlin.text.AbstractC5971;
import kotlinx.coroutines.C6276;
import net.bytebuddy.pool.TypePool;
import p050.AbstractC7176;
import p062.InterfaceC7307;
import p065.AbstractC7356;
import p065.AbstractC7359;
import p068.InterfaceC7387;
import p081.C7698;
import p082.AbstractC7705;
import p086.C7727;
import p089.C7754;
import p089.C7757;
import p089.C7764;
import p089.C7767;
import p093.C7797;
import p093.C7799;
import p093.C7800;
import p095.AbstractC7818;
import p095.AbstractC7838;
import p095.C7839;
import p099.C7868;
import p099.C7870;
import p113.InterfaceC8049;
import p269.AbstractC9019;
import top.suzhelan.qstory.p015ui.components.C6797;

/* JADX INFO: renamed from: androidx.compose.runtime.飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2146 implements InterfaceC7387 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final Object f4149;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final Object f4150;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f4151;

    public /* synthetic */ C2146(Object obj, int i, Object obj2) {
        this.f4151 = i;
        this.f4149 = obj;
        this.f4150 = obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:125:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0187  */
    @Override // p068.InterfaceC7387
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        long j;
        Object obj2;
        Class<?> cls;
        C3075 c3075M12845;
        C3075 c3075;
        String str;
        Class<?> cls2;
        C7799 c7799M14244;
        Class<?> cls3;
        String str2;
        Class<?> cls4;
        C7799 c7799M142442;
        C7754 c7754;
        int i = 10;
        boolean z = true;
        switch (this.f4151) {
            case 0:
                C1575 c1575 = (C1575) this.f4149;
                Object obj3 = c1575.f2416;
                C6276 c6276 = (C6276) this.f4150;
                synchronized (obj3) {
                    ((ArrayList) c1575.f2415).remove(c6276);
                }
                return C6008.f15084;
            case 1:
                C2122 c2122 = (C2122) obj;
                synchronized (AbstractC2115.f4090) {
                    j = AbstractC2115.f4088;
                    AbstractC2115.f4088 = 1 + j;
                }
                return new C2106(j, c2122, (InterfaceC7387) this.f4149, (InterfaceC7387) this.f4150);
            case 2:
                C5422 c5422 = (C5422) this.f4149;
                C1171 c1171 = (C1171) this.f4150;
                C5523 c5523 = (C5523) obj;
                c5523.getClass();
                C5679 c5679 = c5422.f13733;
                AbstractC7818 abstractC7818 = c5422.f13731;
                if (((Set) c5679.invoke()).contains(c5523)) {
                    C7800 c7800 = ((C7870) c1171.f1440).f19238;
                    C5520 c5520M10057 = AbstractC5605.m10057(abstractC7818);
                    c5520M10057.getClass();
                    C5520 c5520M9884 = c5520M10057.m9884(c5523);
                    c7800.getClass();
                    C5519 c5519 = c5520M9884.f14044;
                    String strM10688 = AbstractC5971.m10688(c5520M9884.f14043.f14041.f14038, TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH, '$');
                    if (!c5519.f14041.m9873()) {
                        strM10688 = c5519.f14041.f14038 + TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH + strM10688;
                    }
                    try {
                        cls = Class.forName(strM10688, false, c7800.f19007);
                    } catch (ClassNotFoundException unused) {
                        cls = null;
                    }
                    C5284 c5284 = cls != null ? new C5284(cls) : null;
                    if (c5284 != null) {
                        C5432 c5432 = new C5432(c1171, abstractC7818, c5284, null);
                        ((C7870) c1171.f1440).f19241.getClass();
                        return c5432;
                    }
                    obj2 = null;
                    break;
                } else {
                    obj2 = null;
                    if (((Set) c5422.f13729.invoke()).contains(c5523)) {
                        ListBuilder listBuilderM12470 = AbstractC7176.m12470();
                        ((C7698) ((C7870) c1171.f1440).f19243).m12655(abstractC7818, c5523, listBuilderM12470, c1171);
                        List listBuild = listBuilderM12470.build();
                        int size = listBuild.size();
                        if (size != 0) {
                            if (size == 1) {
                                return (AbstractC7818) AbstractC5176.m9338(listBuild);
                            }
                            C5043.m9174(listBuild, "Multiple classes with same name are generated: ");
                        }
                    } else {
                        C5278 c5278 = (C5278) ((Map) c5422.f13728.invoke()).get(c5523);
                        if (c5278 != null) {
                            C7870 c7870 = (C7870) c1171.f1440;
                            C5677 c5677 = c7870.f19239;
                            C5430 c5430 = new C5430(c5422, 2);
                            c5677.getClass();
                            C5679 c56792 = new C5679(c5677, c5430);
                            C5677 c56772 = c7870.f19239;
                            AbstractC7818 abstractC78182 = c5422.f13731;
                            C7868 c7868M5620 = AbstractC3400.m5620(c1171, c5278);
                            c7870.f19257.getClass();
                            return C7839.m12908(c56772, abstractC78182, c5523, c56792, c7868M5620, C7797.m12843(c5278));
                        }
                    }
                }
                return obj2;
            case 3:
                Object obj4 = (InterfaceC5303) this.f4149;
                C5422 c54222 = (C5422) this.f4150;
                C5523 c55232 = (C5523) obj;
                c55232.getClass();
                return AbstractC5227.m9466(((AbstractC7838) obj4).getName(), c55232) ? AbstractC7176.m12487(obj4) : AbstractC5176.m9352(c54222.m9755(c55232), c54222.m9757(c55232));
            case 4:
                C5421 c5421 = (C5421) this.f4149;
                C1171 c11712 = (C1171) this.f4150;
                C5425 c5425 = (C5425) obj;
                c5425.getClass();
                C5424 c5424 = c5421.f13725;
                C5519 c55192 = c5424.f19032;
                C5520 c5520 = new C5520(c55192, c5425.f13747);
                C5518 c5518 = c55192.f14041;
                C5284 c52842 = c5425.f13746;
                C7870 c78702 = (C7870) c11712.f1440;
                int i2 = 19;
                if (c52842 != null) {
                    C7800 c78002 = c78702.f19237;
                    C7727 c7727M9746 = c5421.m9746();
                    c78002.getClass();
                    c7727M9746.getClass();
                    C5519 c5519M9549 = c52842.m9549();
                    if (c5519M9549 == null || (str2 = c5519M9549.f14041.f14038) == null) {
                        c3075M12845 = null;
                    } else {
                        try {
                            cls4 = Class.forName(str2, false, c78002.f19007);
                        } catch (ClassNotFoundException unused2) {
                            cls4 = null;
                        }
                        if (cls4 != null && (c7799M142442 = AbstractC9019.m14244(cls4)) != null) {
                            c3075M12845 = new C3075(c7799M142442, i2);
                        }
                    }
                    break;
                } else {
                    c3075M12845 = c78702.f19237.m12845(c5520, c5421.m9746());
                }
                C7799 c7799 = c3075M12845 != null ? (C7799) c3075M12845.f6882 : null;
                C5520 c5520M9536 = c7799 != null ? AbstractC5263.m9536(c7799.f19006) : null;
                if (c5520M9536 == null || (!c5520M9536.m9887() && !c5520M9536.f14042)) {
                    AbstractC1298 c5417 = C5416.f13716;
                    if (c7799 != null) {
                        if (c7799.f19005.f18818 == KotlinClassHeader$Kind.CLASS) {
                            C5483 c5483 = ((C7870) c5421.f13681.f1440).f19236;
                            c5483.getClass();
                            C5663 c5663M9818 = c5483.m9818(c7799);
                            AbstractC7818 abstractC7818M10126 = c5663M9818 == null ? null : c5483.m9815().f14438.m10126(AbstractC5263.m9536(c7799.f19006), c5663M9818);
                            if (abstractC7818M10126 != null) {
                                c5417 = new C5417(abstractC7818M10126);
                            }
                        } else {
                            c5417 = C5420.f13722;
                        }
                    }
                    if (c5417 instanceof C5417) {
                        return ((C5417) c5417).f13717;
                    }
                    if (!(c5417 instanceof C5420)) {
                        if (c5417 instanceof C5416) {
                            if (c52842 == null) {
                                C7800 c78003 = c78702.f19238;
                                c78003.getClass();
                                String strM106882 = AbstractC5971.m10688(c5520.f14043.f14041.f14038, TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH, '$');
                                if (!c5518.m9873()) {
                                    strM106882 = c5518.f14038 + TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH + strM106882;
                                }
                                try {
                                    cls3 = Class.forName(strM106882, false, c78003.f19007);
                                } catch (ClassNotFoundException unused3) {
                                    cls3 = null;
                                }
                                c52842 = cls3 != null ? new C5284(cls3) : null;
                            }
                            if (LightClassOriginKind.BINARY == null) {
                                StringBuilder sb = new StringBuilder("Couldn't find kotlin binary class for light class created by kotlin binary file\nJavaClass: ");
                                sb.append(c52842);
                                sb.append("\nClassId: ");
                                sb.append(c5520);
                                sb.append("\nfindKotlinClass(JavaClass) = ");
                                C7800 c78004 = c78702.f19237;
                                C7727 c7727M97462 = c5421.m9746();
                                c78004.getClass();
                                c52842.getClass();
                                c7727M97462.getClass();
                                C5519 c5519M95492 = c52842.m9549();
                                if (c5519M95492 != null && (str = c5519M95492.f14041.f14038) != null) {
                                    try {
                                        cls2 = Class.forName(str, false, c78004.f19007);
                                    } catch (ClassNotFoundException unused4) {
                                        cls2 = null;
                                    }
                                    if (cls2 != null && (c7799M14244 = AbstractC9019.m14244(cls2)) != null) {
                                        c3075 = new C3075(c7799M14244, i2);
                                    }
                                    break;
                                } else {
                                    c3075 = null;
                                }
                                sb.append(c3075 != null ? (C7799) c3075.f6882 : null);
                                sb.append("\nfindKotlinClass(ClassId) = ");
                                sb.append(AbstractC3889.m7314(c78702.f19237, c5520, c5421.m9746()));
                                sb.append('\n');
                                throw new IllegalStateException(sb.toString());
                            }
                            C5519 c5519M95493 = c52842 != null ? c52842.m9549() : null;
                            if (c5519M95493 != null && !c5519M95493.f14041.m9873() && c5519M95493.m9879().equals(c5424.f19032)) {
                                C5432 c54322 = new C5432(c11712, c5424, c52842, null);
                                c78702.f19241.getClass();
                                return c54322;
                            }
                        } else {
                            C5043.m9170();
                        }
                    }
                    break;
                }
                return null;
            case 5:
                C1171 c11713 = (C1171) this.f4149;
                C5633 c5633 = (C5633) this.f4150;
                C5656 c5656 = c5633.f14339;
                C5523 c55233 = (C5523) obj;
                c55233.getClass();
                ProtoBuf$EnumEntry protoBuf$EnumEntry = (ProtoBuf$EnumEntry) ((LinkedHashMap) c11713.f1440).get(c55233);
                if (protoBuf$EnumEntry != null) {
                    return C7839.m12908(c5656.f14407.f14437, c5633, c55233, (C5679) c11713.f1439, new C5618(c5656.f14407.f14437, new C5860(c5633, i, protoBuf$EnumEntry)), InterfaceC5294.f13436);
                }
                return null;
            case 6:
                int iIntValue = ((Number) obj).intValue();
                return ((C6797) this.f4149).invoke(Integer.valueOf(iIntValue), ((List) this.f4150).get(iIntValue));
            case 7:
                InterfaceC5312 interfaceC5312 = (InterfaceC5312) obj;
                AbstractC7705 abstractC7705 = (AbstractC7705) this.f4149;
                InterfaceC5312 interfaceC53122 = (InterfaceC5312) this.f4150;
                interfaceC5312.getClass();
                abstractC7705.mo10096(interfaceC53122, interfaceC5312);
                return C6008.f15084;
            case 8:
                C7767 c7767 = (C7767) this.f4149;
                C1171 c11714 = c7767.f18852;
                C7757 c7757 = (C7757) this.f4150;
                obj.getClass();
                InterfaceC8049 interfaceC8049 = c7757.f18829;
                InterfaceC7307 interfaceC7307 = (InterfaceC7307) obj;
                if (interfaceC7307 instanceof C5410) {
                    ((C7870) c11714.f1440).f19240.getClass();
                    if (!((C5410) interfaceC7307).f13701 && c7767.f18851 != AnnotationQualifierApplicabilityType.TYPE_PARAMETER_BOUNDS) {
                        if (interfaceC8049 != null) {
                            C5523 c55234 = AbstractC7359.f18265;
                            InterfaceC5309 interfaceC5309Mo9770 = ((AbstractC5714) interfaceC8049).mo10281().mo9770();
                            if (interfaceC5309Mo9770 == null || AbstractC7359.m12582(interfaceC5309Mo9770) == null) {
                                z = false;
                            } else {
                                C5442 c5442 = ((C7870) c11714.f1440).f19248;
                                c5442.getClass();
                                Object objM9781 = c5442.m9781(interfaceC7307, AbstractC7356.f18231);
                                if (objM9781 != null) {
                                    ArrayList arrayListM9783 = c5442.m9783(objM9781, false);
                                    if (!arrayListM9783.isEmpty()) {
                                        Iterator it = arrayListM9783.iterator();
                                        while (it.hasNext()) {
                                            if (AbstractC5227.m9466((String) it.next(), "TYPE")) {
                                                ((C7870) c11714.f1440).f19240.getClass();
                                            }
                                        }
                                        z = false;
                                    }
                                }
                            }
                        }
                    }
                }
                return Boolean.valueOf(z);
            default:
                C7764 c7764 = (C7764) this.f4149;
                C7754[] c7754Arr = (C7754[]) this.f4150;
                int iIntValue2 = ((Number) obj).intValue();
                return (c7764 == null || (c7754 = (C7754) c7764.f18847.get(Integer.valueOf(iIntValue2))) == null) ? (iIntValue2 < 0 || iIntValue2 >= c7754Arr.length) ? C7754.f18820 : c7754Arr[iIntValue2] : c7754;
        }
    }
}
