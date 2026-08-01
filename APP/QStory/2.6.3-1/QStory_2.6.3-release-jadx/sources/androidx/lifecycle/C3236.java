package androidx.lifecycle;

import kotlin.C6008;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.channels.AbstractC6043;
import kotlinx.coroutines.channels.InterfaceC6028;
import kotlinx.coroutines.flow.InterfaceC6150;

/* JADX INFO: renamed from: androidx.lifecycle.飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3236 implements InterfaceC6150 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC6028 f7391;

    public C3236(InterfaceC6028 interfaceC6028) {
        this.f7391 = interfaceC6028;
    }

    @Override // kotlinx.coroutines.flow.InterfaceC6150
    public final Object emit(Object obj, InterfaceC5189 interfaceC5189) {
        Object objMo8992 = ((AbstractC6043) this.f7391).f15143.mo8992(obj, interfaceC5189);
        return objMo8992 == CoroutineSingletons.COROUTINE_SUSPENDED ? objMo8992 : C6008.f15084;
    }
}
