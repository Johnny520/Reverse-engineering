package io.ktor.client.plugins;

import kotlin.C6008;
import kotlinx.coroutines.C6249;
import kotlinx.coroutines.C6254;
import p068.InterfaceC7387;
import p257.C8969;

/* JADX INFO: renamed from: io.ktor.client.plugins.飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C4749 implements InterfaceC7387 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ Object f12470;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f12471;

    public /* synthetic */ C4749(Object obj, int i) {
        this.f12471 = i;
        this.f12470 = obj;
    }

    @Override // p068.InterfaceC7387
    public final Object invoke(Object obj) {
        int i = this.f12471;
        Object obj2 = this.f12470;
        switch (i) {
            case 0:
                return HttpTimeoutKt$HttpTimeout$2$1.invokeSuspend$lambda$1$lambda$0((C6249) obj2, (Throwable) obj);
            default:
                Throwable th = (Throwable) obj;
                C6254 c6254 = ((C8969) obj2).f22801;
                c6254.getClass();
                if (th == null) {
                    c6254.m11114();
                } else {
                    c6254.m11113(th);
                }
                return C6008.f15084;
        }
    }
}
