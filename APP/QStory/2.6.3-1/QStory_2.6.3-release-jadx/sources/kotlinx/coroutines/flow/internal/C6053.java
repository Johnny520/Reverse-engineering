package kotlinx.coroutines.flow.internal;

import kotlin.C6008;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.channels.InterfaceC6028;
import kotlinx.coroutines.channels.InterfaceC6032;
import kotlinx.coroutines.flow.InterfaceC6150;

/* JADX INFO: renamed from: kotlinx.coroutines.flow.internal.飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6053 implements InterfaceC6150 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final InterfaceC6032 f15158;

    public C6053(InterfaceC6028 interfaceC6028) {
        this.f15158 = interfaceC6028;
    }

    @Override // kotlinx.coroutines.flow.InterfaceC6150
    public final Object emit(Object obj, InterfaceC5189 interfaceC5189) {
        Object objMo8992 = this.f15158.mo8992(obj, interfaceC5189);
        return objMo8992 == CoroutineSingletons.COROUTINE_SUSPENDED ? objMo8992 : C6008.f15084;
    }
}
