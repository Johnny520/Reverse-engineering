package kotlinx.coroutines.flow;

import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.internal.AbortFlowException;
import p068.InterfaceC7380;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: kotlinx.coroutines.flow.飘花落叶言子苏楪世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6175 implements InterfaceC6150 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC6150 f15250;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC7380 f15251;

    public C6175(InterfaceC7380 interfaceC7380, InterfaceC6150 interfaceC6150) {
        this.f15251 = interfaceC7380;
        this.f15250 = interfaceC6150;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // kotlinx.coroutines.flow.InterfaceC6150
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, InterfaceC5189 interfaceC5189) {
        C0394x82f910c3 c0394x82f910c3;
        if (interfaceC5189 instanceof C0394x82f910c3) {
            c0394x82f910c3 = (C0394x82f910c3) interfaceC5189;
            int i = c0394x82f910c3.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c0394x82f910c3.label = i - Integer.MIN_VALUE;
            } else {
                c0394x82f910c3 = new C0394x82f910c3(this, interfaceC5189);
            }
        }
        Object objInvoke = c0394x82f910c3.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = c0394x82f910c3.label;
        if (i2 == 0) {
            AbstractC6017.m10769(objInvoke);
            c0394x82f910c3.L$0 = null;
            c0394x82f910c3.L$1 = null;
            c0394x82f910c3.L$2 = null;
            c0394x82f910c3.I$0 = 0;
            c0394x82f910c3.label = 1;
            objInvoke = this.f15251.invoke(this.f15250, obj, c0394x82f910c3);
            if (objInvoke == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC6017.m10769(objInvoke);
        }
        if (((Boolean) objInvoke).booleanValue()) {
            return C6008.f15084;
        }
        throw new AbortFlowException(this);
    }
}
