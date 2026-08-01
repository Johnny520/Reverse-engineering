package androidx.compose.animation;

import androidx.activity.C0041;
import androidx.compose.animation.core.C0331;
import androidx.compose.animation.core.C0364;
import androidx.compose.material3.internal.AbstractC1131;
import androidx.compose.runtime.AbstractC1346;
import androidx.compose.runtime.AbstractC1347;
import androidx.compose.runtime.C1387;
import androidx.compose.runtime.InterfaceC1333;
import androidx.compose.runtime.InterfaceC1388;
import androidx.compose.runtime.InterfaceC1395;
import androidx.compose.runtime.InterfaceC1398;
import kotlin.C5176;
import kotlin.Result;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.Ref$FloatRef;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.AbstractC5399;
import kotlinx.coroutines.C5438;
import kotlinx.coroutines.InterfaceC5401;
import kotlinx.coroutines.InterfaceC5441;
import kotlinx.coroutines.flow.AbstractC5322;
import kotlinx.coroutines.flow.C5267;
import kotlinx.coroutines.flow.C5296;
import kotlinx.coroutines.flow.InterfaceC5297;
import kotlinx.coroutines.flow.InterfaceC5318;
import p052.InterfaceC6554;
import p108.C7315;
import p108.InterfaceC7317;

/* JADX INFO: renamed from: androidx.compose.animation.飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0412 implements InterfaceC5318 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final /* synthetic */ Object f1360;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ Object f1361;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ Object f1362;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f1363;

    public C0412(boolean z, Ref$FloatRef ref$FloatRef, Ref$FloatRef ref$FloatRef2, Ref$FloatRef ref$FloatRef3) {
        this.f1363 = 1;
        this.f1361 = ref$FloatRef;
        this.f1362 = ref$FloatRef2;
        this.f1360 = ref$FloatRef3;
    }

    /* JADX WARN: Type inference failed for: r5v13, types: [T, kotlinx.coroutines.flow.飘花落叶言子兰世苏楪哲] */
    @Override // kotlinx.coroutines.flow.InterfaceC5318
    public final Object emit(Object obj, InterfaceC4357 interfaceC4357) {
        int i = this.f1363;
        C5176 c5176 = C5176.f14739;
        Object obj2 = this.f1361;
        Object obj3 = this.f1360;
        Object obj4 = this.f1362;
        switch (i) {
            case 0:
                C0364 c0364 = (C0364) obj4;
                ((C1387) ((InterfaceC1388) obj2)).setValue(Boolean.valueOf(((Boolean) obj).booleanValue() ? ((Boolean) ((InterfaceC6554) ((InterfaceC1333) obj3).getValue()).invoke(c0364.m1066(), ((AbstractC1347) c0364.f1241).getValue())).booleanValue() : false));
                return c5176;
            case 1:
                AbstractC1131.f3275.mo851(((C0041) obj).f81);
                float f = ((Ref$FloatRef) obj2).element;
                float f2 = ((Ref$FloatRef) obj4).element;
                float f3 = ((Ref$FloatRef) obj3).element;
                throw null;
            case 2:
                C0041 c0041 = (C0041) obj;
                InterfaceC1395 interfaceC1395 = (InterfaceC1395) obj2;
                if (interfaceC1395.getValue() == null) {
                    interfaceC1395.setValue(c0041);
                }
                ((InterfaceC1395) obj4).setValue(c0041);
                Object objM1031 = ((C0331) obj3).m1031(new Float(1.0f - AbstractC1131.f3275.mo851(c0041.f81)), interfaceC4357);
                return objM1031 == CoroutineSingletons.COROUTINE_SUSPENDED ? objM1031 : c5176;
            case 3:
                Ref$ObjectRef ref$ObjectRef = (Ref$ObjectRef) obj2;
                InterfaceC5297 interfaceC5297 = (InterfaceC5297) ref$ObjectRef.element;
                if (interfaceC5297 != null) {
                    ((C5267) interfaceC5297).m10313(obj);
                } else {
                    ?? M10332 = AbstractC5322.m10332(obj);
                    ((C5438) ((InterfaceC5441) obj3)).m10588(Result.m8744boximpl(Result.m8745constructorimpl(new C5296(M10332, AbstractC5399.m10493(((InterfaceC5401) obj4).mo2430())))));
                    ref$ObjectRef.element = M10332;
                }
                return c5176;
            default:
                int iIntValue = ((Number) obj).intValue();
                AbstractC1346 abstractC1346 = (AbstractC1346) ((InterfaceC1398) obj4);
                if (iIntValue != abstractC1346.m2432()) {
                    if (((Boolean) ((InterfaceC1395) obj3).getValue()).booleanValue()) {
                        ((C7315) ((InterfaceC7317) obj2)).m12509(9);
                    }
                    abstractC1346.m2433(iIntValue);
                }
                return c5176;
        }
    }

    public /* synthetic */ C0412(Object obj, Object obj2, Object obj3, int i) {
        this.f1363 = i;
        this.f1361 = obj;
        this.f1362 = obj2;
        this.f1360 = obj3;
    }
}
