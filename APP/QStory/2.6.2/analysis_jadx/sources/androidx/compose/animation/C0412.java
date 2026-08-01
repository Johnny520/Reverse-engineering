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
import kotlin.C5175;
import kotlin.Result;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.Ref$FloatRef;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.AbstractC5398;
import kotlinx.coroutines.C5437;
import kotlinx.coroutines.InterfaceC5400;
import kotlinx.coroutines.InterfaceC5440;
import kotlinx.coroutines.flow.AbstractC5321;
import kotlinx.coroutines.flow.C5266;
import kotlinx.coroutines.flow.C5295;
import kotlinx.coroutines.flow.InterfaceC5296;
import kotlinx.coroutines.flow.InterfaceC5317;
import p052.InterfaceC6553;
import p108.C7314;
import p108.InterfaceC7316;

/* JADX INFO: renamed from: androidx.compose.animation.飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C0412 implements InterfaceC5317 {

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
    @Override // kotlinx.coroutines.flow.InterfaceC5317
    public final Object emit(Object obj, InterfaceC4356 interfaceC4356) {
        int i = this.f1363;
        C5175 c5175 = C5175.f14739;
        Object obj2 = this.f1361;
        Object obj3 = this.f1360;
        Object obj4 = this.f1362;
        switch (i) {
            case 0:
                C0364 c0364 = (C0364) obj4;
                ((C1387) ((InterfaceC1388) obj2)).setValue(Boolean.valueOf(((Boolean) obj).booleanValue() ? ((Boolean) ((InterfaceC6553) ((InterfaceC1333) obj3).getValue()).invoke(c0364.m1065(), ((AbstractC1347) c0364.f1241).getValue())).booleanValue() : false));
                return c5175;
            case 1:
                AbstractC1131.f3274.mo850(((C0041) obj).f81);
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
                Object objM1030 = ((C0331) obj3).m1030(new Float(1.0f - AbstractC1131.f3274.mo850(c0041.f81)), interfaceC4356);
                return objM1030 == CoroutineSingletons.COROUTINE_SUSPENDED ? objM1030 : c5175;
            case 3:
                Ref$ObjectRef ref$ObjectRef = (Ref$ObjectRef) obj2;
                InterfaceC5296 interfaceC5296 = (InterfaceC5296) ref$ObjectRef.element;
                if (interfaceC5296 != null) {
                    ((C5266) interfaceC5296).m10309(obj);
                } else {
                    ?? M10328 = AbstractC5321.m10328(obj);
                    ((C5437) ((InterfaceC5440) obj3)).m10585(Result.m8754boximpl(Result.m8755constructorimpl(new C5295(M10328, AbstractC5398.m10489(((InterfaceC5400) obj4).mo2420())))));
                    ref$ObjectRef.element = M10328;
                }
                return c5175;
            default:
                int iIntValue = ((Number) obj).intValue();
                AbstractC1346 abstractC1346 = (AbstractC1346) ((InterfaceC1398) obj4);
                if (iIntValue != abstractC1346.m2422()) {
                    if (((Boolean) ((InterfaceC1395) obj3).getValue()).booleanValue()) {
                        ((C7314) ((InterfaceC7316) obj2)).m12482(9);
                    }
                    abstractC1346.m2423(iIntValue);
                }
                return c5175;
        }
    }

    public /* synthetic */ C0412(Object obj, Object obj2, Object obj3, int i) {
        this.f1363 = i;
        this.f1361 = obj;
        this.f1362 = obj2;
        this.f1360 = obj3;
    }
}
