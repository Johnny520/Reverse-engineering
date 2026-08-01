package io.ktor.client.plugins;

import kotlin.C5176;
import kotlinx.coroutines.C5417;
import kotlinx.coroutines.C5422;
import p052.InterfaceC6558;
import p241.C8140;

/* JADX INFO: renamed from: io.ktor.client.plugins.飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3917 implements InterfaceC6558 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ Object f12125;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f12126;

    public /* synthetic */ C3917(Object obj, int i) {
        this.f12126 = i;
        this.f12125 = obj;
    }

    @Override // p052.InterfaceC6558
    public final Object invoke(Object obj) {
        int i = this.f12126;
        Object obj2 = this.f12125;
        switch (i) {
            case 0:
                return HttpTimeoutKt$HttpTimeout$2$1.invokeSuspend$lambda$1$lambda$0((C5417) obj2, (Throwable) obj);
            default:
                Throwable th = (Throwable) obj;
                C5422 c5422 = ((C8140) obj2).f22456;
                c5422.getClass();
                if (th == null) {
                    c5422.m10555();
                } else {
                    c5422.m10554(th);
                }
                return C5176.f14739;
        }
    }
}
