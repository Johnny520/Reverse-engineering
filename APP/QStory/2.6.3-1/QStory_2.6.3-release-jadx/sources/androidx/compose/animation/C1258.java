package androidx.compose.animation;

import androidx.activity.C0888;
import androidx.compose.animation.core.C1177;
import androidx.compose.animation.core.C1210;
import androidx.compose.material3.internal.AbstractC1966;
import androidx.compose.runtime.AbstractC2181;
import androidx.compose.runtime.AbstractC2182;
import androidx.compose.runtime.C2222;
import androidx.compose.runtime.InterfaceC2168;
import androidx.compose.runtime.InterfaceC2223;
import androidx.compose.runtime.InterfaceC2230;
import androidx.compose.runtime.InterfaceC2233;
import kotlin.C6008;
import kotlin.Result;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.Ref$FloatRef;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.AbstractC6231;
import kotlinx.coroutines.C6270;
import kotlinx.coroutines.InterfaceC6233;
import kotlinx.coroutines.InterfaceC6273;
import kotlinx.coroutines.flow.AbstractC6154;
import kotlinx.coroutines.flow.C6099;
import kotlinx.coroutines.flow.C6128;
import kotlinx.coroutines.flow.InterfaceC6129;
import kotlinx.coroutines.flow.InterfaceC6150;
import p068.InterfaceC7383;
import p124.C8144;
import p124.InterfaceC8146;

/* JADX INFO: renamed from: androidx.compose.animation.飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1258 implements InterfaceC6150 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final /* synthetic */ Object f1705;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ Object f1706;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ Object f1707;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f1708;

    public C1258(boolean z, Ref$FloatRef ref$FloatRef, Ref$FloatRef ref$FloatRef2, Ref$FloatRef ref$FloatRef3) {
        this.f1708 = 1;
        this.f1706 = ref$FloatRef;
        this.f1707 = ref$FloatRef2;
        this.f1705 = ref$FloatRef3;
    }

    /* JADX WARN: Type inference failed for: r5v13, types: [T, kotlinx.coroutines.flow.飘花落叶言子兰世苏楪哲] */
    @Override // kotlinx.coroutines.flow.InterfaceC6150
    public final Object emit(Object obj, InterfaceC5189 interfaceC5189) {
        int i = this.f1708;
        C6008 c6008 = C6008.f15084;
        Object obj2 = this.f1706;
        Object obj3 = this.f1705;
        Object obj4 = this.f1707;
        switch (i) {
            case 0:
                C1210 c1210 = (C1210) obj4;
                ((C2222) ((InterfaceC2223) obj2)).setValue(Boolean.valueOf(((Boolean) obj).booleanValue() ? ((Boolean) ((InterfaceC7383) ((InterfaceC2168) obj3).getValue()).invoke(c1210.m1626(), ((AbstractC2182) c1210.f1586).getValue())).booleanValue() : false));
                return c6008;
            case 1:
                AbstractC1966.f3620.mo1411(((C0888) obj).f426);
                float f = ((Ref$FloatRef) obj2).element;
                float f2 = ((Ref$FloatRef) obj4).element;
                float f3 = ((Ref$FloatRef) obj3).element;
                throw null;
            case 2:
                C0888 c0888 = (C0888) obj;
                InterfaceC2230 interfaceC2230 = (InterfaceC2230) obj2;
                if (interfaceC2230.getValue() == null) {
                    interfaceC2230.setValue(c0888);
                }
                ((InterfaceC2230) obj4).setValue(c0888);
                Object objM1591 = ((C1177) obj3).m1591(new Float(1.0f - AbstractC1966.f3620.mo1411(c0888.f426)), interfaceC5189);
                return objM1591 == CoroutineSingletons.COROUTINE_SUSPENDED ? objM1591 : c6008;
            case 3:
                Ref$ObjectRef ref$ObjectRef = (Ref$ObjectRef) obj2;
                InterfaceC6129 interfaceC6129 = (InterfaceC6129) ref$ObjectRef.element;
                if (interfaceC6129 != null) {
                    ((C6099) interfaceC6129).m10872(obj);
                } else {
                    ?? M10891 = AbstractC6154.m10891(obj);
                    ((C6270) ((InterfaceC6273) obj3)).m11147(Result.m9303boximpl(Result.m9304constructorimpl(new C6128(M10891, AbstractC6231.m11052(((InterfaceC6233) obj4).mo2990())))));
                    ref$ObjectRef.element = M10891;
                }
                return c6008;
            default:
                int iIntValue = ((Number) obj).intValue();
                AbstractC2181 abstractC2181 = (AbstractC2181) ((InterfaceC2233) obj4);
                if (iIntValue != abstractC2181.m2992()) {
                    if (((Boolean) ((InterfaceC2230) obj3).getValue()).booleanValue()) {
                        ((C8144) ((InterfaceC8146) obj2)).m13068(9);
                    }
                    abstractC2181.m2993(iIntValue);
                }
                return c6008;
        }
    }

    public /* synthetic */ C1258(Object obj, Object obj2, Object obj3, int i) {
        this.f1708 = i;
        this.f1706 = obj;
        this.f1707 = obj2;
        this.f1705 = obj3;
    }
}
