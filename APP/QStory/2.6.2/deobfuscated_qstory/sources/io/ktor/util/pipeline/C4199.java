package io.ktor.util.pipeline;

import kotlin.Result;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.InterfaceC4359;
import p063.InterfaceC6862;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: io.ktor.util.pipeline.飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4199 implements InterfaceC4356, InterfaceC6862 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ C4200 f12677;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public int f12678 = Integer.MIN_VALUE;

    public C4199(C4200 c4200) {
        this.f12677 = c4200;
    }

    @Override // p063.InterfaceC6862
    public final InterfaceC6862 getCallerFrame() {
        InterfaceC4356 interfaceC4356 = C4202.f12686;
        int i = this.f12678;
        C4200 c4200 = this.f12677;
        if (i == Integer.MIN_VALUE) {
            this.f12678 = c4200.f12681;
        }
        int i2 = this.f12678;
        if (i2 < 0) {
            this.f12678 = Integer.MIN_VALUE;
            interfaceC4356 = null;
        } else {
            try {
                InterfaceC4356 interfaceC43562 = c4200.f12679[i2];
                if (interfaceC43562 != null) {
                    this.f12678 = i2 - 1;
                    interfaceC4356 = interfaceC43562;
                }
            } catch (Throwable unused) {
            }
        }
        if (interfaceC4356 instanceof InterfaceC6862) {
            return (InterfaceC6862) interfaceC4356;
        }
        return null;
    }

    @Override // kotlin.coroutines.InterfaceC4356
    public final InterfaceC4359 getContext() {
        C4200 c4200 = this.f12677;
        InterfaceC4356[] interfaceC4356Arr = c4200.f12679;
        int i = c4200.f12681;
        InterfaceC4356 interfaceC4356 = interfaceC4356Arr[i];
        if (interfaceC4356 != this && interfaceC4356 != null) {
            return interfaceC4356.getContext();
        }
        int i2 = i - 1;
        while (i2 >= 0) {
            int i3 = i2 - 1;
            InterfaceC4356 interfaceC43562 = interfaceC4356Arr[i2];
            if (interfaceC43562 != this && interfaceC43562 != null) {
                return interfaceC43562.getContext();
            }
            i2 = i3;
        }
        C5919.m11250("Not started");
        return null;
    }

    @Override // kotlin.coroutines.InterfaceC4356
    public final void resumeWith(Object obj) {
        boolean zM8761isFailureimpl = Result.m8761isFailureimpl(obj);
        C4200 c4200 = this.f12677;
        if (!zM8761isFailureimpl) {
            c4200.m8595(false);
            return;
        }
        Throwable thM8758exceptionOrNullimpl = Result.m8758exceptionOrNullimpl(obj);
        thM8758exceptionOrNullimpl.getClass();
        c4200.m8594(Result.m8755constructorimpl(new Result.Failure(thM8758exceptionOrNullimpl)));
    }
}
